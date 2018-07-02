package org.miliconvert.xsmt.mpgt.rules;

import mpia.meta.TypeAssociation;
import mpia.schema.SchemaFactory;
import mpia.schema.TypeAirePisteGeometrique;
import mpia.schema.TypeAssocInstanceObjetLocalisation;
import mpia.schema.TypeAssociationEltCtrlEltCtrl;
import mpia.schema.TypeAssociationEntiteOrgEltCtrl;
import mpia.schema.TypeCylindreGeometrique;
import mpia.schema.TypeDictionaryDicoAssociationEltCtrlEltCtrlCategorie;
import mpia.schema.TypeDictionaryDicoAssociationEntiteOrgEltCtrlCategorie;
import mpia.schema.TypeListeMesuresCoordination3D;
import mpia.schema.TypeLocalisationGeometrique3D;
import mpia.schema.TypeMesureCoordination;
import mpia.schema.TypePointControle3D;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.miliconvert.xsmt.mpgt.model.mpgt.MPGTWrapperSet;

/**
 * 
 * @author matthieu
 *
 */
public class AcoSetRules extends CommonSetRules {

	private static TypeMesureCoordination mesureCoordination;
	private static String typeOfShape;
	
	/*
	 * Si la mesure de coordination décrite par le set ACMID existe déjà, 
	 * on teste si elle a été simplement créée par le traitement d'un précédent set ACMSTAT (simple référence) 
	 * ou si elle a été créée et/ou valorisée par le traitement d'un précédent segment ACMID.
		Dans le premier cas, on récupère la mesure de coordination déjà existante 
		et on la valorise avec les données du segment ACMID courant
		Dans le deuxième cas, on ne valorise pas la mesure de coordination déjà existante
		
		Si la Mesure de coordination n'existe pas, on la crée et on la valorise avec les données du segment ACMID
	 */
	public static void A_Acmid(MPGTWrapperSet s) throws Exception{
		log("A_Acmid");
		TypeMesureCoordination  acmidmesureCoordination = (TypeMesureCoordination)engine.getLineContext().getInstance("41");	
		TypeMesureCoordination acmstatmesureCoordination =(TypeMesureCoordination)engine.getLineContext().getInstance("34/36/37");
		
		if(acmidmesureCoordination==null && acmstatmesureCoordination!=null){
			 log("Mesure de coordination créé par le précédent ACMSTAT");
			 mesureCoordination = acmstatmesureCoordination;

		} else {
			if(acmidmesureCoordination==null){
				TypeListeMesuresCoordination3D coordination3D = (TypeListeMesuresCoordination3D) engine.getLineContext().getInstance("11/16/30/33");
				mesureCoordination = SchemaFactory.eINSTANCE.createTypeMesureCoordination();
				mesureCoordination.setCTE(EcoreUtil.generateUUID());
				engine.addOnce(coordination3D.getAPourACMcreeMesureCoordination(),(TypeAssociation) engine.createAssoc(coordination3D,mesureCoordination,null,false));
			} else {
				log("La mesure de coordination existe déjà");
				mesureCoordination = acmidmesureCoordination;
				s.setSkip(true);
			}
		}
		s.setSetInstance(mesureCoordination);
		s.updateAlternative(1);
		
	}
	
	/*
	 * Chaque répétition du set CNTRLPT permet de créer une entité Point de contrôle que l'on relie à la Mesure de coordination.
		L'association instanciée est du type : La Mesure de coordination "est contrainte par" le Point de contrôle.
		
		Renseigner la catégorie de la classe d'association avec la valeur "ISCONS" (Is constrained or enabled by)
	 */
	public static void A_ControlPt(MPGTWrapperSet s) throws Exception{
		log("Règle A_ControlPt");
		TypePointControle3D point = (TypePointControle3D) engine.findOrCreateFieldEntities("PointControle3D");
		TypeAssociationEntiteOrgEltCtrl associationEntiteOrgEltCtrl =  (TypeAssociationEntiteOrgEltCtrl) engine.findOrCreateFieldEntities("AssociationEntiteOrgEltCtrl");
		associationEntiteOrgEltCtrl.setCategorie(TypeDictionaryDicoAssociationEntiteOrgEltCtrlCategorie.ISCONS);
		associationEntiteOrgEltCtrl.setAPourObjetElementControle((TypeAssociation) engine.createAssoc(associationEntiteOrgEltCtrl,point,"EstObjet_AssociationEntiteOrgEltCtrl",false));

		
		TypeAssociationEltCtrlEltCtrl associationEltCtrlEltCtrl = (TypeAssociationEltCtrlEltCtrl) engine.findOrCreateFieldEntities("AssociationEltCtrlEltCtrl");
		associationEltCtrlEltCtrl.setCategorie(TypeDictionaryDicoAssociationEltCtrlEltCtrlCategorie.ENCLOS);
		associationEltCtrlEltCtrl.setAPourSujetElementControle((TypeAssociation) engine.createAssoc(associationEltCtrlEltCtrl,point,"EstSujet_AssociationEltCtrlEltCtrl",false));

		
		engine.addOnce(mesureCoordination.getEstObjetAssociationEntiteOrgEltCtrl(),(TypeAssociation) engine.createAssoc(mesureCoordination,associationEntiteOrgEltCtrl,"APourObjet_ElementControle",false));
		engine.addOnce(mesureCoordination.getEstSujetAssociationEltCtrlEltCtrl(),(TypeAssociation) engine.createAssoc(mesureCoordination,associationEltCtrlEltCtrl,"APourSujet_ElementControle",false));

		s.setSetInstance(mesureCoordination);
	
	}
	
	/*
	 *  Pour chaque répétition du groupe, on ajoute une occurrence MPGT.AirePisteGeometrique
	 *  
	 *  MPIA.MesureCoordination{MPIA.InstanceObjet}#EstLocalisePar{MPIA.AssocInstanceObjetLocalisation}
	 *  #EstLocaliseEn{MPGT.LocalisationGeometrique3D}#APourVolumeGeometrique{MPGT.CylindreGeometrique}#APourSection{MPGT.AirePisteGeometrique}
		
		Les segments (MPGT.AirePisteGeometrique) sont traités dans l'ordre croissant de la zone 1.
	 */
	
	public static void A_Track(MPGTWrapperSet s) throws Exception{
		TypeMesureCoordination mesure = (TypeMesureCoordination) s.getSetInstance();
		TypeAssocInstanceObjetLocalisation assocInstanceObjetLocalisation = (TypeAssocInstanceObjetLocalisation) engine.findOrCreateFieldEntities("AssocInstanceObjetLocalisation");
		TypeLocalisationGeometrique3D localisation = (TypeLocalisationGeometrique3D) engine.findOrCreateFieldEntities("LocalisationGeometrique3D");
		TypeCylindreGeometrique cylindreGeometrique = (TypeCylindreGeometrique) engine.findOrCreateFieldEntities("CylindreGeometrique");
		TypeAirePisteGeometrique airePisteGeometrique = (TypeAirePisteGeometrique) engine.findOrCreateFieldEntities("AirePisteGeometrique");

		cylindreGeometrique.setAPourSectionObjetGeometrique(airePisteGeometrique);
		localisation.setAPourVolumeGeometriqueVolumeGeometrique(cylindreGeometrique);
		assocInstanceObjetLocalisation.setEstLocaliseEnLocalisation(localisation);
		engine.addOnce(mesure.getEstLocaliseParAssocInstanceObjetLocalisation(),assocInstanceObjetLocalisation);
	}
	
	/*
	Contrôle de la présence des sets de description des formes géométriques en fonction de l'attribut TYPE OF AIRSPACE SHAPE :
	Si TYPE OF AIRSPACE SHAPE = "POLYARC" alors le set POLYARC est obligatoire sinon il est interdit,
	Si TYPE OF AIRSPACE SHAPE = "RADARC" alors le set RADARC est obligatoire sinon il est interdit,
	Si TYPE OF AIRSPACE SHAPE = "TRACK" alors le set 1TRACK est obligatoire sinon il est interdit,
	Si TYPE OF AIRSPACE SHAPE = "POLYGON" alors le set est obligatoire POLYGON sinon il est interdit,
	Si TYPE OF AIRSPACE SHAPE = "CIRCLE" alors le set CIRCLE est obligatoire sinon il est interdit,
	Si TYPE OF AIRSPACE SHAPE = "CORRIDOR" alors le set CORRIDOR est obligatoire sinon il est interdit,
	Si TYPE OF AIRSPACE SHAPE = "POINT" alors le set APOINT est obligatoire sinon il est interdit,
	Si TYPE OF AIRSPACE SHAPE = "ORBIT" alors le set est obligatoire AORBIT sinon il est interdit,
	Si TYPE OF AIRSPACE SHAPE = "LINE" alors le set GEOLINE est obligatoire sinon il est interdit,
	
	*/
	public static void  A_FormeACm(MPGTWrapperSet s){
		log("A_FormeACm");
	   	String setId = s.getSetId();
		if(softEquals(setId, "ACMID")){
			
	   		typeOfShape = s.getField("3").getValue();
	   		log("typeOfShape :"+ typeOfShape);
	   		return ;
	   	}
	   	
	   	
		if(softEquals(setId, "POLYARC") && !softEquals("POLYARC", typeOfShape)){
			halt(s,"A_FormACm");
		} else if(softEquals(setId, "RADARC") && !softEquals("RADARC", typeOfShape)){
			halt(s,"A_FormACm");
		}else if(softEquals(setId, "1TRACK") && !softEquals("TRACK", typeOfShape)){
			halt(s,"A_FormACm");
		}else if(softEquals(setId, "POLYGON") && !softEquals("POLYGON", typeOfShape)){
			halt(s,"A_FormACm");
		}else if(softEquals(setId, "CIRCLE") && !softEquals("CIRCLE", typeOfShape)){
			halt(s,"A_FormACm");
		}else if(softEquals(setId, "CORRIDOR") && !softEquals("CORRIDOR", typeOfShape)){
			halt(s,"A_FormACm");
		}else if(softEquals(setId, "ORBIT") && !softEquals("ORBIT", typeOfShape)){
			halt(s,"A_FormACm");
		}else if(softEquals(setId, "LINE") && !softEquals("LINE", typeOfShape)){
			halt(s,"A_FormACm");
		} else {
			log("A_FormeACm OK");
		}
		
		
		
	}

	
	public static void A_APeriodDiscrete(MPGTWrapperSet s){
		if(!softEquals(s.getField("1").getValue(),"DISCRETE")){
			halt(s,"On ne prend en compte que les instances du set APERIOD pour lesquelles la zone 1 vaut DISCRETE");
		}
	}
	
	
}
