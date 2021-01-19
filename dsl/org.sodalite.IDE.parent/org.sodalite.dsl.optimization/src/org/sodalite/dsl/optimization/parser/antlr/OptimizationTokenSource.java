/*
 * generated by Xtext 2.19.0
 */
package org.sodalite.dsl.optimization.parser.antlr;

import org.antlr.runtime.Token;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.parser.antlr.AbstractIndentationTokenSource;
import org.sodalite.dsl.optimization.parser.antlr.internal.InternalOptimizationParser;

public class OptimizationTokenSource extends AbstractIndentationTokenSource {

	public OptimizationTokenSource(TokenSource delegate) {
		super(delegate);
	}

	@Override
	protected boolean shouldSplitTokenImpl(Token token) {
		return token.getType() == InternalOptimizationParser.RULE_WS;
	}

	@Override
	protected int getBeginTokenType() {
		return InternalOptimizationParser.RULE_BEGIN;
	}

	@Override
	protected int getEndTokenType() {
		return InternalOptimizationParser.RULE_END;
	}

}
