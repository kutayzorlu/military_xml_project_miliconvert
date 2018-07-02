/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Mission ASA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMissionASA#getNumeroMissionASA <em>Numero Mission ASA</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionASA#getTypeMissionASA <em>Type Mission ASA</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionASA#getDescriptionMissionGenerale <em>Description Mission Generale</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionASA#getNombreBatteries <em>Nombre Batteries</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionASA#getGDHdebutNouvelleMission <em>GD Hdebut Nouvelle Mission</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionASA#getGDHfinMissionEnCours <em>GD Hfin Mission En Cours</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionASA#getConsignesParticulieres <em>Consignes Particulieres</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionASA#getEstObjetAssociationPlanificationOperation3DMissionASA <em>Est Objet Association Planification Operation3 DMission ASA</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionASA#getAPourMissionSurveillanceMissionSurveillance <em>APour Mission Surveillance Mission Surveillance</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionASA#getAPourMissionDefenseParticuliereMissionDefenseParticuliere <em>APour Mission Defense Particuliere Mission Defense Particuliere</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionASA#getACommeZonesInterditesAutreElementControle <em>AComme Zones Interdites Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionASA#getAPourConsignesGeneralesTirASAConsignesGeneralesTirASA <em>APour Consignes Generales Tir ASA Consignes Generales Tir ASA</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionASA#getAPourMenacePrioritaireMenacePrioritaire <em>APour Menace Prioritaire Menace Prioritaire</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionASA#getAPourStadeAlerteEtEmissionStadeAlerteEmission <em>APour Stade Alerte Et Emission Stade Alerte Emission</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionASA#getACommeTypeSystemeArmeTypeArme <em>AComme Type Systeme Arme Type Arme</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionASA#getAPourMissionZoneADefendreMissionZoneADefendre <em>APour Mission Zone ADefendre Mission Zone ADefendre</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionASA#getACommeImplantationSectionsZonesImplantationProposees <em>AComme Implantation Sections Zones Implantation Proposees</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionASA#getAPourUniteConcerneeUnite <em>APour Unite Concernee Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionASA#getAPourUniteExecutanteUnite <em>APour Unite Executante Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionASA#getEstObjetAssociationUniteMissionASA <em>Est Objet Association Unite Mission ASA</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMissionASA()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_MissionASA' kind='elementOnly'"
 * @generated
 */
public interface TypeMissionASA extends TypeMission {
	/**
	 * Returns the value of the '<em><b>Numero Mission ASA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Mission ASA</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Mission ASA</em>' attribute.
	 * @see #isSetNumeroMissionASA()
	 * @see #unsetNumeroMissionASA()
	 * @see #setNumeroMissionASA(long)
	 * @see mpia.schema.SchemaPackage#getTypeMissionASA_NumeroMissionASA()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='NumeroMissionASA'"
	 * @generated
	 */
	long getNumeroMissionASA();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionASA#getNumeroMissionASA <em>Numero Mission ASA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Mission ASA</em>' attribute.
	 * @see #isSetNumeroMissionASA()
	 * @see #unsetNumeroMissionASA()
	 * @see #getNumeroMissionASA()
	 * @generated
	 */
	void setNumeroMissionASA(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionASA#getNumeroMissionASA <em>Numero Mission ASA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumeroMissionASA()
	 * @see #getNumeroMissionASA()
	 * @see #setNumeroMissionASA(long)
	 * @generated
	 */
	void unsetNumeroMissionASA();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionASA#getNumeroMissionASA <em>Numero Mission ASA</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Numero Mission ASA</em>' attribute is set.
	 * @see #unsetNumeroMissionASA()
	 * @see #getNumeroMissionASA()
	 * @see #setNumeroMissionASA(long)
	 * @generated
	 */
	boolean isSetNumeroMissionASA();

	/**
	 * Returns the value of the '<em><b>Type Mission ASA</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMissionASATypeMissionASA}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Mission ASA</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Mission ASA</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionASATypeMissionASA
	 * @see #isSetTypeMissionASA()
	 * @see #unsetTypeMissionASA()
	 * @see #setTypeMissionASA(TypeDictionaryDicoMissionASATypeMissionASA)
	 * @see mpia.schema.SchemaPackage#getTypeMissionASA_TypeMissionASA()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeMissionASA'"
	 * @generated
	 */
	TypeDictionaryDicoMissionASATypeMissionASA getTypeMissionASA();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionASA#getTypeMissionASA <em>Type Mission ASA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Mission ASA</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionASATypeMissionASA
	 * @see #isSetTypeMissionASA()
	 * @see #unsetTypeMissionASA()
	 * @see #getTypeMissionASA()
	 * @generated
	 */
	void setTypeMissionASA(TypeDictionaryDicoMissionASATypeMissionASA value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionASA#getTypeMissionASA <em>Type Mission ASA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeMissionASA()
	 * @see #getTypeMissionASA()
	 * @see #setTypeMissionASA(TypeDictionaryDicoMissionASATypeMissionASA)
	 * @generated
	 */
	void unsetTypeMissionASA();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionASA#getTypeMissionASA <em>Type Mission ASA</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Mission ASA</em>' attribute is set.
	 * @see #unsetTypeMissionASA()
	 * @see #getTypeMissionASA()
	 * @see #setTypeMissionASA(TypeDictionaryDicoMissionASATypeMissionASA)
	 * @generated
	 */
	boolean isSetTypeMissionASA();

	/**
	 * Returns the value of the '<em><b>Description Mission Generale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description Mission Generale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Mission Generale</em>' attribute.
	 * @see #setDescriptionMissionGenerale(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionASA_DescriptionMissionGenerale()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='DescriptionMissionGenerale'"
	 * @generated
	 */
	String getDescriptionMissionGenerale();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionASA#getDescriptionMissionGenerale <em>Description Mission Generale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Mission Generale</em>' attribute.
	 * @see #getDescriptionMissionGenerale()
	 * @generated
	 */
	void setDescriptionMissionGenerale(String value);

	/**
	 * Returns the value of the '<em><b>Nombre Batteries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Batteries</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Batteries</em>' attribute.
	 * @see #isSetNombreBatteries()
	 * @see #unsetNombreBatteries()
	 * @see #setNombreBatteries(long)
	 * @see mpia.schema.SchemaPackage#getTypeMissionASA_NombreBatteries()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NombreBatteries'"
	 * @generated
	 */
	long getNombreBatteries();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionASA#getNombreBatteries <em>Nombre Batteries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Batteries</em>' attribute.
	 * @see #isSetNombreBatteries()
	 * @see #unsetNombreBatteries()
	 * @see #getNombreBatteries()
	 * @generated
	 */
	void setNombreBatteries(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionASA#getNombreBatteries <em>Nombre Batteries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreBatteries()
	 * @see #getNombreBatteries()
	 * @see #setNombreBatteries(long)
	 * @generated
	 */
	void unsetNombreBatteries();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionASA#getNombreBatteries <em>Nombre Batteries</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Batteries</em>' attribute is set.
	 * @see #unsetNombreBatteries()
	 * @see #getNombreBatteries()
	 * @see #setNombreBatteries(long)
	 * @generated
	 */
	boolean isSetNombreBatteries();

	/**
	 * Returns the value of the '<em><b>GD Hdebut Nouvelle Mission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GD Hdebut Nouvelle Mission</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GD Hdebut Nouvelle Mission</em>' attribute.
	 * @see #setGDHdebutNouvelleMission(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeMissionASA_GDHdebutNouvelleMission()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='GDHdebutNouvelleMission'"
	 * @generated
	 */
	XMLGregorianCalendar getGDHdebutNouvelleMission();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionASA#getGDHdebutNouvelleMission <em>GD Hdebut Nouvelle Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GD Hdebut Nouvelle Mission</em>' attribute.
	 * @see #getGDHdebutNouvelleMission()
	 * @generated
	 */
	void setGDHdebutNouvelleMission(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>GD Hfin Mission En Cours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GD Hfin Mission En Cours</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GD Hfin Mission En Cours</em>' attribute.
	 * @see #setGDHfinMissionEnCours(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeMissionASA_GDHfinMissionEnCours()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='GDHfinMissionEnCours'"
	 * @generated
	 */
	XMLGregorianCalendar getGDHfinMissionEnCours();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionASA#getGDHfinMissionEnCours <em>GD Hfin Mission En Cours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GD Hfin Mission En Cours</em>' attribute.
	 * @see #getGDHfinMissionEnCours()
	 * @generated
	 */
	void setGDHfinMissionEnCours(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Consignes Particulieres</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consignes Particulieres</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consignes Particulieres</em>' attribute.
	 * @see #setConsignesParticulieres(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionASA_ConsignesParticulieres()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='ConsignesParticulieres'"
	 * @generated
	 */
	String getConsignesParticulieres();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionASA#getConsignesParticulieres <em>Consignes Particulieres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consignes Particulieres</em>' attribute.
	 * @see #getConsignesParticulieres()
	 * @generated
	 */
	void setConsignesParticulieres(String value);

	/**
	 * Returns the value of the '<em><b>Est Objet Association Planification Operation3 DMission ASA</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Planification Operation3 DMission ASA</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Planification Operation3 DMission ASA</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionASA_EstObjetAssociationPlanificationOperation3DMissionASA()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeObjet_MissionASA' target_entity='type_AssociationPlanificationOperation3DMissionASA'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationPlanificationOperation3DMissionASA'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationPlanificationOperation3DMissionASA();

	/**
	 * Returns the value of the '<em><b>APour Mission Surveillance Mission Surveillance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Mission Surveillance Mission Surveillance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Mission Surveillance Mission Surveillance</em>' containment reference.
	 * @see #setAPourMissionSurveillanceMissionSurveillance(TypeMissionSurveillance)
	 * @see mpia.schema.SchemaPackage#getTypeMissionASA_APourMissionSurveillanceMissionSurveillance()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_MissionSurveillance'"
	 *        extendedMetaData="kind='element' name='APourMissionSurveillance_MissionSurveillance'"
	 * @generated
	 */
	TypeMissionSurveillance getAPourMissionSurveillanceMissionSurveillance();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionASA#getAPourMissionSurveillanceMissionSurveillance <em>APour Mission Surveillance Mission Surveillance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Mission Surveillance Mission Surveillance</em>' containment reference.
	 * @see #getAPourMissionSurveillanceMissionSurveillance()
	 * @generated
	 */
	void setAPourMissionSurveillanceMissionSurveillance(TypeMissionSurveillance value);

	/**
	 * Returns the value of the '<em><b>APour Mission Defense Particuliere Mission Defense Particuliere</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMissionDefenseParticuliere}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Mission Defense Particuliere Mission Defense Particuliere</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Mission Defense Particuliere Mission Defense Particuliere</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionASA_APourMissionDefenseParticuliereMissionDefenseParticuliere()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_MissionDefenseParticuliere'"
	 *        extendedMetaData="kind='element' name='APourMissionDefenseParticuliere_MissionDefenseParticuliere'"
	 * @generated
	 */
	EList<TypeMissionDefenseParticuliere> getAPourMissionDefenseParticuliereMissionDefenseParticuliere();

	/**
	 * Returns the value of the '<em><b>AComme Zones Interdites Autre Element Controle</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Zones Interdites Autre Element Controle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Zones Interdites Autre Element Controle</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionASA_ACommeZonesInterditesAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='ACommeZonesInterdites_AutreElementControle'"
	 * @generated
	 */
	EList<TypeAssociation> getACommeZonesInterditesAutreElementControle();

	/**
	 * Returns the value of the '<em><b>APour Consignes Generales Tir ASA Consignes Generales Tir ASA</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeConsignesGeneralesTirASA}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Consignes Generales Tir ASA Consignes Generales Tir ASA</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Consignes Generales Tir ASA Consignes Generales Tir ASA</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionASA_APourConsignesGeneralesTirASAConsignesGeneralesTirASA()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ConsignesGeneralesTirASA'"
	 *        extendedMetaData="kind='element' name='APourConsignesGeneralesTirASA_ConsignesGeneralesTirASA'"
	 * @generated
	 */
	EList<TypeConsignesGeneralesTirASA> getAPourConsignesGeneralesTirASAConsignesGeneralesTirASA();

	/**
	 * Returns the value of the '<em><b>APour Menace Prioritaire Menace Prioritaire</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMenacePrioritaire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Menace Prioritaire Menace Prioritaire</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Menace Prioritaire Menace Prioritaire</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionASA_APourMenacePrioritaireMenacePrioritaire()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_MenacePrioritaire'"
	 *        extendedMetaData="kind='element' name='APourMenacePrioritaire_MenacePrioritaire'"
	 * @generated
	 */
	EList<TypeMenacePrioritaire> getAPourMenacePrioritaireMenacePrioritaire();

	/**
	 * Returns the value of the '<em><b>APour Stade Alerte Et Emission Stade Alerte Emission</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeStadeAlerteEmission}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Stade Alerte Et Emission Stade Alerte Emission</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Stade Alerte Et Emission Stade Alerte Emission</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionASA_APourStadeAlerteEtEmissionStadeAlerteEmission()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_StadeAlerteEmission'"
	 *        extendedMetaData="kind='element' name='APourStadeAlerteEtEmission_StadeAlerteEmission'"
	 * @generated
	 */
	EList<TypeStadeAlerteEmission> getAPourStadeAlerteEtEmissionStadeAlerteEmission();

	/**
	 * Returns the value of the '<em><b>AComme Type Systeme Arme Type Arme</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociationEXT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Type Systeme Arme Type Arme</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Type Systeme Arme Type Arme</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionASA_ACommeTypeSystemeArmeTypeArme()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeArme'"
	 *        extendedMetaData="kind='element' name='ACommeTypeSystemeArme_TypeArme'"
	 * @generated
	 */
	EList<TypeAssociationEXT> getACommeTypeSystemeArmeTypeArme();

	/**
	 * Returns the value of the '<em><b>APour Mission Zone ADefendre Mission Zone ADefendre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Mission Zone ADefendre Mission Zone ADefendre</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Mission Zone ADefendre Mission Zone ADefendre</em>' containment reference.
	 * @see #setAPourMissionZoneADefendreMissionZoneADefendre(TypeMissionZoneADefendre)
	 * @see mpia.schema.SchemaPackage#getTypeMissionASA_APourMissionZoneADefendreMissionZoneADefendre()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_MissionZoneADefendre'"
	 *        extendedMetaData="kind='element' name='APourMissionZoneADefendre_MissionZoneADefendre'"
	 * @generated
	 */
	TypeMissionZoneADefendre getAPourMissionZoneADefendreMissionZoneADefendre();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionASA#getAPourMissionZoneADefendreMissionZoneADefendre <em>APour Mission Zone ADefendre Mission Zone ADefendre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Mission Zone ADefendre Mission Zone ADefendre</em>' containment reference.
	 * @see #getAPourMissionZoneADefendreMissionZoneADefendre()
	 * @generated
	 */
	void setAPourMissionZoneADefendreMissionZoneADefendre(TypeMissionZoneADefendre value);

	/**
	 * Returns the value of the '<em><b>AComme Implantation Sections Zones Implantation Proposees</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeZonesImplantationProposees}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Implantation Sections Zones Implantation Proposees</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Implantation Sections Zones Implantation Proposees</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionASA_ACommeImplantationSectionsZonesImplantationProposees()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ZonesImplantationProposees'"
	 *        extendedMetaData="kind='element' name='ACommeImplantationSections_ZonesImplantationProposees'"
	 * @generated
	 */
	EList<TypeZonesImplantationProposees> getACommeImplantationSectionsZonesImplantationProposees();

	/**
	 * Returns the value of the '<em><b>APour Unite Concernee Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite Concernee Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite Concernee Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionASA_APourUniteConcerneeUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteConcernee_Unite'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourUniteConcerneeUnite();

	/**
	 * Returns the value of the '<em><b>APour Unite Executante Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite Executante Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite Executante Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionASA_APourUniteExecutanteUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteExecutante_Unite'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourUniteExecutanteUnite();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Unite Mission ASA</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Unite Mission ASA</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Unite Mission ASA</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionASA_EstObjetAssociationUniteMissionASA()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_MissionASA' target_entity='type_AssociationUniteMissionASA'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationUniteMissionASA'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationUniteMissionASA();

} // TypeMissionASA
