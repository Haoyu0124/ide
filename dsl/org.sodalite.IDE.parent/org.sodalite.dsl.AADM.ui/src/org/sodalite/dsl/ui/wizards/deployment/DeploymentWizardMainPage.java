package org.sodalite.dsl.ui.wizards.deployment;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.StringTokenizer;
import java.util.stream.Stream;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.sodalite.dsl.ui.helper.AADMHelper.InputDef;
import org.sodalite.ide.ui.logger.SodaliteLogger;

public class DeploymentWizardMainPage extends WizardPage {
	private Composite container;
	private SortedMap<String, InputDef> inputDefs;
	private Map<String, Text> inputWidgets = new HashMap<>();
	private Path imageBuildConfPath = null;
	private Spinner workersSpinner = null;
	private Text versionTagText = null;

	protected DeploymentWizardMainPage(SortedMap<String, InputDef> inputDefs) {
		super("AADM Deployment");
		setTitle("AADM Deployment");
		setDescription("Provide inputs for the AADM");
		this.inputDefs = inputDefs;
	}

	public Path getImageBuildConfPath() {
		return this.imageBuildConfPath;
	}

	public String getVersionTag() {
		return this.versionTagText.getText();
	}

	public int getWorkers() {
		try {
			return Integer.valueOf(this.workersSpinner.getText());
		} catch (Exception ex) {
			return 0;
		}
	}

	public Map<String, String> getInputs() {
		Map<String, String> inputs = new HashMap<>();
		for (String key : inputWidgets.keySet()) {
			String type = inputDefs.get(key).getType();
			String value = inputWidgets.get(key).getText();
			if (type != null && (type.contains("map") || type.contains("list")))
				value = "\n" + value;
			inputs.put(key, value);
		}
		return inputs;
//		return inputWidgets.entrySet().stream()
//				.collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue().getText()));
	}

	@Override
	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		container.setLayout(layout);

		// Version tag
		Label versionTagLabel = new Label(container, SWT.NONE);
		versionTagLabel.setText("Version tag (optional):");

		versionTagText = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData versionTagGridData = new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1);
		versionTagText.setLayoutData(versionTagGridData);

		// Workers
		Label workersLabel = new Label(container, SWT.NONE);
		workersLabel.setText("Number orchestrator workers (optional):");

		workersSpinner = new Spinner(container, SWT.BORDER | SWT.SINGLE);
		GridData workersGridData = new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1);
		workersSpinner.setLayoutData(workersGridData);
		workersSpinner.setMinimum(0);
		workersSpinner.setSelection(1);

		// Image Build Configuration
		Label imageBuildConfLabel = new Label(container, SWT.NONE);
		imageBuildConfLabel.setText("Select a image build configuration (optional):");

		Text imageBuildConfText = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData imageBuildConfGridData = new GridData(GridData.FILL_HORIZONTAL);
		imageBuildConfText.setLayoutData(imageBuildConfGridData);

//		imageBuildConfText.addModifyListener(new ModifyListener() {
//			public void modifyText(org.eclipse.swt.events.ModifyEvent e) {
//				getWizard().getContainer().updateButtons();
//			};
//		});

		Button buttonSelectImageBuildConfFile = new Button(container, SWT.PUSH);
		buttonSelectImageBuildConfFile.setText("Select...");
		buttonSelectImageBuildConfFile.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
				FileDialog fileDialog = new FileDialog(shell, SWT.MULTI);
				String fileFilterPath = System.getProperty("user.home");
				fileDialog.setFilterPath(fileFilterPath);
				fileDialog.setFilterExtensions(new String[] { "*.json", "*.*" });

				String selectedInputFile = fileDialog.open();
				if (selectedInputFile != null) {
					System.out.println("Selected image build conf file: " + selectedInputFile);
					File file = new File(selectedInputFile);
					imageBuildConfPath = file.toPath();
					imageBuildConfText.setText(selectedInputFile);
				}
			}
		});

		// Inputs file
		if (this.inputDefs != null && !this.inputDefs.isEmpty()) {
			Label inputsFileLabel = new Label(container, SWT.NONE);
			inputsFileLabel.setText("Select an inputs file:");

			Text inputsFileText = new Text(container, SWT.BORDER | SWT.SINGLE);
			GridData inputsFileGridData = new GridData(GridData.FILL_HORIZONTAL);
			inputsFileText.setLayoutData(inputsFileGridData);

			Button buttonSelectFile = new Button(container, SWT.PUSH);
			buttonSelectFile.setText("Select...");
			buttonSelectFile.addListener(SWT.Selection, new Listener() {
				private String current_key = null;
				private String current_value = null;

				public void handleEvent(Event event) {
					Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
					FileDialog fileDialog = new FileDialog(shell, SWT.MULTI);
					String fileFilterPath = System.getProperty("user.home");
					fileDialog.setFilterPath(fileFilterPath);
					fileDialog.setFilterExtensions(new String[] { "*.yaml", "*.yml", "*.*" });

					String selectedInputFile = fileDialog.open();
					if (selectedInputFile != null) {
						System.out.println("Selected inputs file: " + selectedInputFile);
						inputsFileText.setText(selectedInputFile);
						File file = new File(selectedInputFile);
						// Read inputs from file
						try (Stream<String> lines = Files.lines(file.toPath())) {
							lines.forEach(
									// Assign inputs values in wizard form
									input -> processInput(input));
						} catch (IOException e) {
							SodaliteLogger.log("Error", e);
						}
					}
				}

				private Object processInput(String input) {
					StringTokenizer st = new StringTokenizer(input, ":");
					String input_name = st.nextToken();
					if (inputDefs.keySet().contains(input_name)) {
						current_key = input_name;
						if (st.hasMoreTokens()) {
							String input_value = st.nextToken();
							while (st.hasMoreTokens())
								input_value += ":" + st.nextToken();
							inputWidgets.get(current_key).setText(input_value);
						}
					} else {
						if (st.hasMoreTokens()) {
							String input_value = st.nextToken();
							while (st.hasMoreTokens())
								input_value += ":" + st.nextToken();
							current_value = inputWidgets.get(current_key).getText();

							inputWidgets.get(current_key)
									.setText(current_value + input_name + ":" + input_value + "\n");
						}
					}

					return input;
				}
			});

			// Separator
			Label separator = new Label(container, SWT.SEPARATOR | SWT.HORIZONTAL);
			GridData data = new GridData(SWT.FILL, SWT.TOP, true, false, 2, 1);
			separator.setLayoutData(data);

			// Inputs
			Label inputsLabel = new Label(container, SWT.NONE);
			inputsLabel.setText("Inputs:");
			FontData fontData = inputsLabel.getFont().getFontData()[0];
			Font font = new Font(container.getDisplay(),
					new FontData(fontData.getName(), fontData.getHeight(), SWT.BOLD));
			inputsLabel.setFont(font);
			data = new GridData(SWT.FILL, SWT.TOP, true, false, 3, 1);
			inputsLabel.setLayoutData(data);

			for (String input : inputDefs.keySet()) {
				// Label
				Label label = new Label(container, SWT.NONE);
				label.setText(input);

				// Text
				Text text = null;
				String inputType = inputDefs.get(input).getType();
				if (inputType != null && (inputType.contains("map") || inputType.contains("list"))) {
					int number_lines = 5;
					text = new Text(container, SWT.BORDER | SWT.MULTI | SWT.WRAP | SWT.V_SCROLL | SWT.H_SCROLL);
					GridData gridData = new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1);
					gridData.heightHint = number_lines * text.getLineHeight();
					text.setLayoutData(gridData);
				} else {
					text = new Text(container, SWT.BORDER | SWT.SINGLE);
					GridData gd = new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1);
					text.setLayoutData(gd);
				}
				text.setText("");

				text.addModifyListener(new ModifyListener() {
					public void modifyText(org.eclipse.swt.events.ModifyEvent e) {
						getWizard().getContainer().updateButtons();
					};
				});

				inputWidgets.put(input, text);
			}
		}

		setControl(container);
		setPageComplete(false);
	}

}
