package org.eclipse.twig.ui.outline;

import org.eclipse.dltk.core.IModelElement;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.twig.core.documentModel.dom.ElementImplForTwig;


/**
 * 
 * 
 * 
 * 
 * 
 * @author Robert Gruendler <r.gruendler@gmail.com>
 *
 */
@SuppressWarnings("restriction")
public class TwigOutlineLabelProvider extends XMLLabelProvider {

	
	private ILabelProvider modelElementLabelProvider;

	public TwigOutlineLabelProvider(ILabelProvider modelElementLabelProvider) {
		this.modelElementLabelProvider = modelElementLabelProvider;
	}

	public Image getImage(Object o) {
		
		if (o instanceof IModelElement) {
			return modelElementLabelProvider.getImage(o);
		}
		return super.getImage(o);
	}

	public String getText(Object o) {
		
		
		if (o instanceof ElementImplForTwig) {
			ElementImplForTwig element = (ElementImplForTwig) o;
			return element.getTagName();
		}
		

		return super.getText(o);
	}	
}
