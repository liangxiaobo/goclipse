/*******************************************************************************
 * Copyright (c) 2015, 2015 Bruno Medeiros and other Contributors.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Bruno Medeiros - initial API and implementation
 *******************************************************************************/
package LANG_PROJECT_ID.ide.ui.editor;

import melnorme.lang.ide.core.operations.TimeoutProgressMonitor;
import melnorme.lang.ide.ui.text.completion.LangCompletionProposalComputer;
import melnorme.lang.ide.ui.text.completion.LangContentAssistInvocationContext;
import melnorme.lang.tooling.completion.LangCompletionResult;
import melnorme.utilbox.concurrency.OperationCancellation;
import melnorme.utilbox.core.CommonException;

import org.eclipse.core.runtime.CoreException;

public class LANGUAGE_CompletionProposalComputer extends LangCompletionProposalComputer {
	
	@Override
	protected LangCompletionResult doComputeProposals(LangContentAssistInvocationContext context, int offset,
			TimeoutProgressMonitor pm) throws CoreException, CommonException, OperationCancellation {
		return new LangCompletionResult("NOT IMPLEMENTED");
	}
	
}