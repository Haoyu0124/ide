package org.sodalite.dsl.ui.handlers;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.sodalite.dsl.ui.backend.AADMBackendProxy;

public class AADMOptimizeHandler implements IHandler {
	private Shell parent = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	private AADMBackendProxy backendProxy = new AADMBackendProxy();

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		try {
			if (PlatformUI.getWorkbench().saveAllEditors(true)) // Ask to save model before continue
				backendProxy.processOptimizeAADM(event);
		} catch (Exception ex) {
			ex.printStackTrace();
			MessageDialog.openError(parent, "Get AADM optimization recommendations error",
					"There were an error reported by the KB:\n" + ex.getMessage());
		}
		return this;
	}

	@Override
	public boolean isEnabled() {
		// TODO Validate AADM before enabling
		return true;
	}

	@Override
	public boolean isHandled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

}
