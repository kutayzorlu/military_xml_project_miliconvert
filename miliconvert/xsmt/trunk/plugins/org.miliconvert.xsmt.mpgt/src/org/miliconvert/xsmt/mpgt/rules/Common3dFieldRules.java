package org.miliconvert.xsmt.mpgt.rules;

import mpia.schema.SchemaFactory;
import mpia.schema.TypeAssocInstanceObjetLocalisation;
import mpia.schema.TypeCylindreGeometrique;
import mpia.schema.TypeDictionaryDicoDistanceVerticaleReference;
import mpia.schema.TypeDistanceVerticaleGeometrique;
import mpia.schema.TypeLocalisationGeometrique3D;
import mpia.schema.TypeMesureCoordination;
import mpia.schema.TypePointControle3D;

import org.miliconvert.xsmt.mpgt.model.mpgt.MPGTWrapperField;
import org.miliconvert.xsmt.mpgt.model.mpgt.MPGTWrapperSet;

public class Common3dFieldRules extends CommonFieldRules {

	/*
	 *Valorisation d'une entité DistanceVerticale avec l'un des alternats :
	- Alt. A = 2166/001 (VERTICAL DIMENSION, BASE REF POINT TO RELATIVE ALTITUDE)
	- Alt. B = 2167/001 (VERTICAL DIMENSION, BASE REF POINT TO FLIGHT LEVEL)
	- Alt. C = 2168/001 (VERTICAL DIMENSION, RELATIVE ALTITUDE TO FLIGHT LEVEL)
	- Alt. D = 2169/001 (VERTICAL DIMENSION, RELATIVE ALTITUDE TO RELATIVE ALT)
	- Alt. E = 2099/002 (VERTICAL DIMENSION, FLIGHT LEVEL TO FLIGHT LEVEL)
	
	On valorise :
	- MPGT.DistanceVerticaleGeometrique.Valeur (rôle APourPlancher) :
	    - 0 pour les alternats A et B,
	    - la ss zone 1 pour les alternats C et D,
	    - la ss zone 3 pour l'alternat E
	- MPGT.DistanceVerticaleGeometrique.Valeur (rôle APourPlafond)  :     
	    - la ss zone 3 pour l'alternat A,
	    - la ss zone 4 pour les alternats B et D,
	    - la ss zone 5 pour les alternats C et E
	
	On détermine la valeur des attributs MPGT.DistanceVerticaleGeometrique.Reference (rôle APourPlancher) et MPGT.DistanceVerticaleGeometrique.Reference (rôle APourPlafond),
	en appliquant la CD=(AD3_1130_8;MPGT_DistanceVerticaleReference) (Ref plancher pour les Alt. A et B) ou CD=(AD3_1130_9;MPGT_DistanceVerticaleReference)
	(pour les autres cas) en prenant comme entrées :
	- Alt. A : Ref plancher = ss zone 1, Ref plafond = ss zone 4
	- Alt. B : Ref plancher = ss zone 1, Ref plafond = ss zone 3
	- Alt. C : Ref plancher = ss zone 2, Ref plafond = ss zone 4
	- Alt. D : Ref plancher = ss zone 2, Ref plafond = ss zone 5
	- Alt. E : Ref plancher = ss zone 1, Ref plafond = ss zone 4
	 */
	public static void A_Hauteur(MPGTWrapperSet s, MPGTWrapperField f) throws Exception{
	
		TypeMesureCoordination mesureCoordination = (TypeMesureCoordination) s.getSetInstance();
		TypeAssocInstanceObjetLocalisation assocInstanceObjetLocalisation = (TypeAssocInstanceObjetLocalisation) engine.findOrCreateFieldEntities("AssocInstanceObjetLocalisation");
		TypeLocalisationGeometrique3D localisation = (TypeLocalisationGeometrique3D) engine.findOrCreateFieldEntities("LocalisationGeometrique3D");
		TypeCylindreGeometrique cylindreGeometrique = (TypeCylindreGeometrique) engine.findOrCreateFieldEntities("CylindreGeometrique");
		if(s.getSetId().equalsIgnoreCase("CNTRLPT")){
			TypePointControle3D point = (TypePointControle3D) engine.findOrCreateFieldEntities("PointControle3D");
			engine.addOnce(point.getEstLocaliseParAssocInstanceObjetLocalisation(),assocInstanceObjetLocalisation);
		} else {
			engine.addOnce(mesureCoordination.getEstLocaliseParAssocInstanceObjetLocalisation(),assocInstanceObjetLocalisation);
		}
		assocInstanceObjetLocalisation.setEstLocaliseEnLocalisation(localisation);
		localisation.setAPourVolumeGeometriqueVolumeGeometrique(cylindreGeometrique);
		
		TypeDistanceVerticaleGeometrique plafond = SchemaFactory.eINSTANCE.createTypeDistanceVerticaleGeometrique();
		TypeDistanceVerticaleGeometrique plancher = SchemaFactory.eINSTANCE.createTypeDistanceVerticaleGeometrique();
		String ffirn = f.getFfirn();
		if(softEquals(ffirn, "2166_001")){
			plancher.setValeur(0);
			plancher.setReference(TypeDictionaryDicoDistanceVerticaleReference.get(
					dictionaryService.convertAD3ToMPGTFromRule("CD=(AD3_1130_8;MPGT_DistanceVerticaleReference)",
							"1130_008", "DistanceVerticaleReference", f.getSubFields(0))));
			plafond.setValeur(Double.parseDouble(f.getSubFields(2)));
			plafond.setReference(TypeDictionaryDicoDistanceVerticaleReference.get(
					dictionaryService.convertAD3ToMPGTFromRule("CD=(AD3_1130_9;MPGT_DistanceVerticaleReference)",
							"1130_009", "DistanceVerticaleReference", f.getSubFields(3))));
			
		} else if(softEquals(ffirn, "2167_001")){
			plancher.setValeur(0);
			plancher.setReference(TypeDictionaryDicoDistanceVerticaleReference.get( 
					dictionaryService.convertAD3ToMPGTFromRule("CD=(AD3_1130_8;MPGT_DistanceVerticaleReference)",
							"1130_008", "DistanceVerticaleReference", f.getSubFields(0))));
			plafond.setValeur(Double.parseDouble(f.getSubFields(3)));
			plafond.setReference(TypeDictionaryDicoDistanceVerticaleReference.get( 
					dictionaryService.convertAD3ToMPGTFromRule("CD=(AD3_1130_9;MPGT_DistanceVerticaleReference)", 
							"1130_009", "DistanceVerticaleReference", f.getSubFields(2))));
			
		} else if(softEquals(ffirn, "2168_001")){
			plancher.setValeur(Double.parseDouble(f.getSubFields(0)));
			plancher.setReference(TypeDictionaryDicoDistanceVerticaleReference.get( 
					dictionaryService.convertAD3ToMPGTFromRule("CD=(AD3_1130_9;MPGT_DistanceVerticaleReference)",
							"1130_009", "DistanceVerticaleReference", f.getSubFields(4))));
			plafond.setValeur(Double.parseDouble(f.getSubFields(3)));
			plafond.setReference(TypeDictionaryDicoDistanceVerticaleReference.get( 
					dictionaryService.convertAD3ToMPGTFromRule("CD=(AD3_1130_9;MPGT_DistanceVerticaleReference)",
							"1130_009", "DistanceVerticaleReference", f.getSubFields(3))));
			
		} else if(softEquals(ffirn, "2169_001")){
			plancher.setValeur(Double.parseDouble(f.getSubFields(0)));
			plancher.setReference(TypeDictionaryDicoDistanceVerticaleReference.get(
					dictionaryService.convertAD3ToMPGTFromRule("CD=(AD3_1130_9;MPGT_DistanceVerticaleReference)", 
							"1130_009", "DistanceVerticaleReference", f.getSubFields(1))));
			plafond.setValeur(Double.parseDouble(f.getSubFields(3)));
			plafond.setReference(TypeDictionaryDicoDistanceVerticaleReference.get(
					dictionaryService.convertAD3ToMPGTFromRule("CD=(AD3_1130_9;MPGT_DistanceVerticaleReference)", 
							"1130_009", "DistanceVerticaleReference", f.getSubFields(4))));
			
		}  else if(softEquals(ffirn, "2099_001")){
			plancher.setValeur(Double.parseDouble(f.getSubFields(2)));
			plancher.setReference(TypeDictionaryDicoDistanceVerticaleReference.get(
					dictionaryService.convertAD3ToMPGTFromRule("CD=(AD3_1130_9;MPGT_DistanceVerticaleReference)",
							"1130_009", "DistanceVerticaleReference", f.getSubFields(0))));
			plafond.setValeur(Double.parseDouble(f.getSubFields(4)));
			plafond.setReference(TypeDictionaryDicoDistanceVerticaleReference.get(
					dictionaryService.convertAD3ToMPGTFromRule("CD=(AD3_1130_9;MPGT_DistanceVerticaleReference)",
							"1130_009", "DistanceVerticaleReference", f.getSubFields(3))));
			
		}
		cylindreGeometrique.setAPourPlafondDistanceVerticaleGeometrique(plafond);
		cylindreGeometrique.setAPourPlancherDistanceVerticaleGeometrique(plancher);
		f.setSkip(true);
	}
	
}
