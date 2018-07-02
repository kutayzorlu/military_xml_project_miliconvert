package org.miliconvert.xsmt.tmodel;

import java.util.List;

import org.eclipse.xsd.XSDFeature;
import org.eclipse.xsd.XSDSchema;

/**
 * Visitor implementation used to extract the root features of a schema
 * 
 * @author tom
 *
 */
public class RootExtractor implements IFeatVisitor {

	private List<XSDFeature> toFill;
	private String rootContainerName;

	public RootExtractor(XSDSchema xsd, List<XSDFeature> toFill) {
		this.rootContainerName = xsd.getSchemaForSchemaQNamePrefix()+":schema";
		this.toFill = toFill;
	}

	public void visit(XSDFeature f) {
		if (isRoot(f)) {
			toFill.add(f);
		}
	}

	private boolean isRoot(XSDFeature f) {
		return rootContainerName.equals(f.getContainer().getElement().getNodeName());
	}

}
