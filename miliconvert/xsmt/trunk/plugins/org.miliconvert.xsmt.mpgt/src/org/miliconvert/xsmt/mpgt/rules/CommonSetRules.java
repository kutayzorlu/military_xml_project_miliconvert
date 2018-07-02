package org.miliconvert.xsmt.mpgt.rules;

import org.eclipse.emf.ecore.EObject;
import org.miliconvert.xsmt.mpgt.model.mpgt.MPGTWrapperSet;


public class CommonSetRules extends CommonRules {

	
	

	/*
	 Cette fonction permet de changer le contexte de création des lignes en cours
	*/
	public static void LIGNE(MPGTWrapperSet s, String ligne){
		EObject instance = engine.getLineContext().getInstance(ligne);
		if(instance!=null){
			log("On utilise l'instance :"+instance.eClass().getName());
			s.setSetInstance(instance);
		} else {
			logger.error("Impossible de trouver l'instance correspondant au lignes : "+ligne);
		}
	}
	
	public static void NANA(MPGTWrapperSet s, String cond){
		log("TODO: NANA with cond "+cond);
		
	}
	
	
}
