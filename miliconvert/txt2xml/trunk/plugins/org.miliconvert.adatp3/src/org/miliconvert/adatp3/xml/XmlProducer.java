package org.miliconvert.adatp3.xml;

import java.util.List;
import java.util.Stack;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.miliconvert.adatp3.IAdapt3Flavour;
import org.miliconvert.adatp3.common.formlets.MainMessagePart;
import org.miliconvert.adatp3.common.formlets.Message;
import org.miliconvert.adatp3.common.formlets.Set;
import org.miliconvert.adatp3.hibernate.HibernateUtil;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XmlProducer {


	private IAdapt3Flavour flavour;
	
	

	public XmlProducer(IAdapt3Flavour flavour) {
		
		this.flavour = flavour;
		
	}
	/**
	 * Construct the xml file from the mapping and fields retrieved from the input format.
	 * @param m
	 * @return
	 * @throws ParserConfigurationException
	 */
	public Document createDom(Message m) throws ParserConfigurationException {
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setNamespaceAware(true);
		DocumentBuilder builder = dbf.newDocumentBuilder();
		Document doc = builder.newDocument();

		HibernateUtil.init(flavour.getBaseline());
		HibernateUtil.begin();
		try {
			
			ISetMapping mapping = SetMappingFactory.getInstance().loadValidator(flavour);
			ISetValidator validator = SetValidatorFactory.getInstance().loadValidator(flavour);
			
			mapping.createRoot(doc);
	
			MainMessagePart mainPart = m.getMainPart();
			List<Set> sets = mainPart.getSets();
		
			validator.validate(sets);
			
			Stack<Element> parents = new Stack<Element>();
			parents.add(doc.getDocumentElement());
		
		
			
			int last = 0;
			
			for (Set set : sets) {
				last = mapping.mapSet(parents, set, last);
			}
			
			
		} finally {
			HibernateUtil.closeSession();
		}
		
		
		
		return doc;
	}
	
	
	
	

}
