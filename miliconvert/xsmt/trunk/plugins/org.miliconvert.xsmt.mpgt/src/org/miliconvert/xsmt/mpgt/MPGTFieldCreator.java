package org.miliconvert.xsmt.mpgt;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import mpia.meta.MetaFactory;
import mpia.schema.SchemaFactory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * 
 * @author matthieu
 *
 */
public class MPGTFieldCreator {

	private static Log logger = LogFactory.getLog(MPGTFieldCreator.class);
	
	private Map<String,Map<Integer,EObject>> inMemoryFieldEntitiesMap = new HashMap<String,Map<Integer,EObject>>();
	
	
	public EObject findOrCreateFieldEntities(String instanceName) throws Exception { 
		return findOrCreateFieldEntities(instanceName,0);
		
		
	}


	public EObject findOrCreateFieldEntities(String instanceName, int depth) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		Map<Integer,EObject> tmp = new HashMap<Integer, EObject>();
		
		if(inMemoryFieldEntitiesMap.containsKey(instanceName)){
		  tmp = inMemoryFieldEntitiesMap.get(instanceName);
		}
		
		
		//approximatif
		if(tmp.size()>0){
			logger.info("Reusing existing "+instanceName);
			if( depth == 0 ){
				if(tmp.containsKey(0)){
					return tmp.get(0);
				} else {
					return tmp.values().iterator().next();
				}
			} else if(tmp.containsKey(depth)){
				return tmp.get(depth);
			}
		}


		Method createMethod  = SchemaFactory.class.getMethod("createType"+instanceName, null);
		EObject instance = (EObject) createMethod.invoke(SchemaFactory.eINSTANCE, null);	
		

			EAttribute cte = MPGTUtils.find(instance.eClass(),"CTE");
			if(cte!=null){
				instance.eSet(cte, EcoreUtil.generateUUID());
			}
	
		tmp.put(depth,instance);
		inMemoryFieldEntitiesMap.put(instanceName, tmp);	
			
		logger.info("Creating "+instanceName);
		
		return instance;
	}

	
	
}
