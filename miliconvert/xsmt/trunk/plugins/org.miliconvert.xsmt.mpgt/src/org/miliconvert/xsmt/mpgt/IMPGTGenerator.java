package org.miliconvert.xsmt.mpgt;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

public interface IMPGTGenerator {

	Document generate(Node node);

}
