package org.miliconvert.xsmt.mpgt;

import java.io.InputStream;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;
import org.drools.logger.KnowledgeRuntimeLogger;
import org.drools.logger.KnowledgeRuntimeLoggerFactory;
import org.drools.runtime.StatefulKnowledgeSession;
import org.miliconvert.xsmt.mpgt.model.Adatp3Field;
import org.miliconvert.xsmt.mpgt.model.Adatp3Set;
import org.miliconvert.xsmt.mpgt.model.mpgt.MPGTWrapperField;
import org.miliconvert.xsmt.mpgt.model.mpgt.MPGTWrapperSet;

/**
 * 
 * @author matthieu
 *
 */
public class MPGTRuleService {
	
	private static Log logger  = LogFactory.getLog(MPGTRuleService.class);
	

	 KnowledgeBase instanciateKnowledgeBase;
	
	 KnowledgeBase transformationKnowledgeBase;
	 
	 KnowledgeBase fillingKnowledgeBase;
	 
	
	public MPGTRuleService(String type) {

			   fillingKnowledgeBase =  KnowledgeBaseFactory.newKnowledgeBase();
			   instanciateKnowledgeBase = KnowledgeBaseFactory.newKnowledgeBase();
			   
			   
			   KnowledgeBuilder	kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
				
			
			    kbuilder.add( ResourceFactory.newInputStreamResource(getDSLStream("mpgt-fields-"+type)),
			              ResourceType.DSL );
				kbuilder.add( ResourceFactory.newInputStreamResource(getRulesStream(type+"-filling")),
			              ResourceType.DSLR );


				if ( kbuilder.hasErrors() ) {
					logger.error( kbuilder.getErrors().toString() );
					throw new IllegalArgumentException();
				}
				
				fillingKnowledgeBase.addKnowledgePackages( kbuilder.getKnowledgePackages() );
			
				
				kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
				
				kbuilder.add( ResourceFactory.newInputStreamResource(getDSLStream("mpgt-sets-"+type)),
						ResourceType.DSL );
				kbuilder.add( ResourceFactory.newInputStreamResource(getRulesStream(type+"-instanciate")),
			              ResourceType.DSLR );
				if ( kbuilder.hasErrors() ) {
					logger.error( kbuilder.getErrors().toString() );
					throw new IllegalArgumentException();
				}
				
				instanciateKnowledgeBase.addKnowledgePackages( kbuilder.getKnowledgePackages() );
//				
	}

	


	
	private InputStream getDSLStream(String type) {
		return MPGTEngine.class.getClassLoader().getResourceAsStream(
				"mappings/rules/"+type+".dsl");
	}





	private InputStream getRulesStream(String type) {
		return MPGTEngine.class.getClassLoader().getResourceAsStream(
				"mappings/rules/"+type+".dslr");
	}





	public void runInstanciationRules(MPGTWrapperSet set) {

		StatefulKnowledgeSession ksession = instanciateKnowledgeBase.newStatefulKnowledgeSession();
		KnowledgeRuntimeLogger log = null;
		if(logger.isInfoEnabled()){
			log =   KnowledgeRuntimeLoggerFactory.newConsoleLogger(ksession);
		}
		ksession.insert(set);
		ksession.fireAllRules();
		ksession.dispose();
		ksession = null;
		if(log!=null){
			log.close();
		}
		
	}





	public void runFillingRules(MPGTWrapperSet set, MPGTWrapperField field) {

		StatefulKnowledgeSession fillingsession = fillingKnowledgeBase.newStatefulKnowledgeSession();
		KnowledgeRuntimeLogger log = null;
		if(logger.isInfoEnabled()){
			log =   KnowledgeRuntimeLoggerFactory.newConsoleLogger(fillingsession);
		}
		fillingsession.insert(set);
		fillingsession.insert(field);
		fillingsession.fireAllRules();
		fillingsession.dispose();
		fillingsession = null;
		if(log!=null){
			log.close();
		}
		
	}
	
	
	
	
}
