/*******************************************************************************
 * This file is part of the Twig eclipse plugin.
 * 
 * (c) Robert Gruendler <r.gruendler@gmail.com>
 * 
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 ******************************************************************************/
package com.dubture.twig.core.codeassist.context;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.text.IDocument;

import com.dubture.twig.core.documentModel.parser.partitioner.TwigPartitionTypes;
import com.dubture.twig.core.log.Logger;

/**
 * 
 * Context for twig Keywords.
 * 
 * 
 * @author Robert Gruendler <r.gruendler@gmail.com>
 * 
 */
public class KeywordContext extends AbstractTwigCompletionContext {

	@Override
	public boolean isValid(IDocument template, int offset, IProgressMonitor monitor) {
		if (!super.isValid(template, offset, monitor)) {
			return false;
		}
		try {

			if (getPartitionType() == TwigPartitionTypes.TWIG_QUOTED_STRING) {
				return false;
			}

			String prefix = getStatementText().toString();

			if (!prefix.contains(".") && !prefix.contains("\"") && !prefix.contains("'")) {

				String previous = getPreviousWord();

				// {% block | <-- we complete parent blocks in here
				if (previous != null && "block".equals(previous)) {
					return false;
				}

				return true;
			}

		} catch (Exception e) {

			Logger.logException(e);
		}

		return false;
	}
}
