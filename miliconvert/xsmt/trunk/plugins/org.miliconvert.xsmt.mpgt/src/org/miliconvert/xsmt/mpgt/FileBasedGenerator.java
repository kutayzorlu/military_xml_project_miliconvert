package org.miliconvert.xsmt.mpgt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;


/**
 * 
 * @author matthieu
 * Crappy a souhait
 */
public  class FileBasedGenerator implements IMPGTGenerator {

	private Log logger = LogFactory.getLog(getClass());



	private MPGTEngine engine = MPGTEngine.getInstance();
	private String mappingPath;
	private String headerPath;
	private String dictionnaryPath;
	private boolean isInit = false;
	private String type;
	
	
	
	
	public FileBasedGenerator(String mappingPath,String type) {
		super();
		this.headerPath = "mappings/header.mapping";
		this.dictionnaryPath ="mappings/dictionnary.mapping";
		this.mappingPath = mappingPath;
		this.type = type;
	}

	private void init() {

	
		if(!isInit){
			
			isInit = true;
			
			
			MPGTDefExtractor.getInstance().init(mappingPath,headerPath);
			MPGTDefExtractor.getInstance().dumpRules();
			MPGTEngine.getInstance().init(type);
			MPGTDictionaryService.getInstance().init(dictionnaryPath);
		}
		
		
		
	}
	

	@Override
	public Document generate(Node node) {
		init();
		try {
			Adatp3Extractor extractor = new Adatp3Extractor();
			engine.transform(extractor.parseAd3Message(node, type),MPGTDefExtractor.getInstance());
			MPGTXmlSerialiser serialiser = new MPGTXmlSerialiser(engine);
			return serialiser.eCoreToDOM();
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
	 	return null;
		
	}

}
