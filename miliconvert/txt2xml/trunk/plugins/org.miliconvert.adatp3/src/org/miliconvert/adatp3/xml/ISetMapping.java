package org.miliconvert.adatp3.xml;

import java.util.Stack;

import org.miliconvert.adatp3.common.formlets.Set;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public interface ISetMapping {

	void createRoot(Document doc);

	int mapSet(Stack<Element> parents, Set set, int lastUsedSeq);


	
}
