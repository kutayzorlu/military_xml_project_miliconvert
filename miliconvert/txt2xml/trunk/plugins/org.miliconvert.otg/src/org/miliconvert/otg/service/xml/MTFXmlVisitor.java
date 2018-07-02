package org.miliconvert.otg.service.xml;

import org.miliconvert.otg.model.MTF;
import org.w3c.dom.Document;

/**
 * 
 * @author matthieu
 *
 */
public interface MTFXmlVisitor {

	public Document visit(MTF mtfDocument) throws Exception;
}
