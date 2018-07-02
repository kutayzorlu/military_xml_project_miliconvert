package org.miliconvert.xsmt.mpgt;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import mpia.schema.DocumentRoot;
import mpia.schema.SchemaFactory;
import mpia.schema.SchemaPackage;
import mpia.schema.TypeMPGTMessage;
import mpia.schema.util.SchemaResourceFactoryImpl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.GenericXMLResourceFactoryImpl;
import org.w3c.dom.Document;

public class MPGTXmlSerialiser {

	private static Log logger = LogFactory.getLog(MPGTXmlSerialiser.class);
	
	
	
	private MPGTEngine engine;
	private TypeMPGTMessage message;
	private DocumentRoot documentRoot;

	private ResourceSet resourceSet;
	private ExtendedMetaData extendedMetaData;

	

	public MPGTXmlSerialiser(MPGTEngine engine) {
		this.engine = engine;
		resourceSet = new ResourceSetImpl();
		  resourceSet.getResourceFactoryRegistry()
		  .getExtensionToFactoryMap().put
		   (Resource.Factory.Registry.DEFAULT_EXTENSION, 
				   new SchemaResourceFactoryImpl());
		  resourceSet.getPackageRegistry().put
		  (SchemaPackage.eNS_URI, SchemaPackage.eINSTANCE); 

	 	documentRoot = SchemaFactory.eINSTANCE.createDocumentRoot();
	 	
	 
	 	 message = SchemaFactory.eINSTANCE.createTypeMPGTMessage();
	
	 	 
	 	documentRoot.setMPGTMessage(message);
	}
	

	public Document eCoreToDOM(){
		
			//On ajoute les entités instancié à entities 
		
			for (Map.Entry<String,EObject> entite  : engine.getEntitiesMap().entrySet()) {
				try {
					Method getMethod  =  TypeMPGTMessage.class.getMethod("get"+MPGTUtils.formatEClassName(entite.getValue().eClass().getName()), null);
					EList<EObject> list =   (EList<EObject>) getMethod.invoke(message, null);
					list.add(entite.getValue());
				} catch (Exception e) {
					logger.error(e,e);
				}
			}
		
		
		
		
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
		    (Resource.Factory.Registry.DEFAULT_EXTENSION, 
		     new GenericXMLResourceFactoryImpl());
		    
		 XMLResource resource =   (XMLResource) resourceSet.createResource(URI.createFileURI("/tmp/mpgt.xml"));
	
		 
		  resource.getContents().add(documentRoot);
		  
			 Map<String,String> options = new HashMap<String,String>();
			 options.put(XMLResource.OPTION_ENCODING,"UTF-8");
			/* options.put(XMLResource.XSI_URI, "http://www.w3.org/2001/XMLSchema-instance");
			 options.put(XMLResource.NO_NAMESPACE_SCHEMA_LOCATION, "mpgt_v315.xsd"); */
		  
		  

		/*  try {
			resource.save(System.out, null);
		} catch (IOException e) {
			e.printStackTrace();
		}*/

		 return  resource.save(null, options, null);
		 
	}

	
}
