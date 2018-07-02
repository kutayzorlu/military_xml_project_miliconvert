/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Autre Element Controle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAutreElementControle#getEstSousControleSurveillanceDesignationUniteOuEquipementENI <em>Est Sous Controle Surveillance Designation Unite Ou Equipement ENI</em>}</li>
 *   <li>{@link mpia.schema.TypeAutreElementControle#getAPourTypeObjectifMajeurTypeObjectifMajeur <em>APour Type Objectif Majeur Type Objectif Majeur</em>}</li>
 *   <li>{@link mpia.schema.TypeAutreElementControle#getCaracteristiquesZoneContamineeCaracteristiqueZoneContaminee <em>Caracteristiques Zone Contaminee Caracteristique Zone Contaminee</em>}</li>
 *   <li>{@link mpia.schema.TypeAutreElementControle#getEstReconnueSelonReconnaissance <em>Est Reconnue Selon Reconnaissance</em>}</li>
 *   <li>{@link mpia.schema.TypeAutreElementControle#getAPourCaracteristiquesZoneAcquisitionZoneAcquisition <em>APour Caracteristiques Zone Acquisition Zone Acquisition</em>}</li>
 *   <li>{@link mpia.schema.TypeAutreElementControle#getVautPourHoraireManoeuvre <em>Vaut Pour Horaire Manoeuvre</em>}</li>
 *   <li>{@link mpia.schema.TypeAutreElementControle#getEstSoumiseAReglementation <em>Est Soumise AReglementation</em>}</li>
 *   <li>{@link mpia.schema.TypeAutreElementControle#getAPourEvenementNRBCAssocieeEvenementNRBC <em>APour Evenement NRBC Associee Evenement NRBC</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAutreElementControle()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AutreElementControle' kind='elementOnly'"
 * @generated
 */
public interface TypeAutreElementControle extends TypeElementControle {
	/**
	 * Returns the value of the '<em><b>Est Sous Controle Surveillance Designation Unite Ou Equipement ENI</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeDesignationUniteOuEquipementENI}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sous Controle Surveillance Designation Unite Ou Equipement ENI</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sous Controle Surveillance Designation Unite Ou Equipement ENI</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeAutreElementControle_EstSousControleSurveillanceDesignationUniteOuEquipementENI()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_DesignationUniteOuEquipementENI'"
	 *        extendedMetaData="kind='element' name='EstSousControleSurveillance_DesignationUniteOuEquipementENI'"
	 * @generated
	 */
	EList<TypeDesignationUniteOuEquipementENI> getEstSousControleSurveillanceDesignationUniteOuEquipementENI();

	/**
	 * Returns the value of the '<em><b>APour Type Objectif Majeur Type Objectif Majeur</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTypeObjectifMajeur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Type Objectif Majeur Type Objectif Majeur</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Type Objectif Majeur Type Objectif Majeur</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeAutreElementControle_APourTypeObjectifMajeurTypeObjectifMajeur()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_TypeObjectifMajeur'"
	 *        extendedMetaData="kind='element' name='APourTypeObjectifMajeur_TypeObjectifMajeur'"
	 * @generated
	 */
	EList<TypeTypeObjectifMajeur> getAPourTypeObjectifMajeurTypeObjectifMajeur();

	/**
	 * Returns the value of the '<em><b>Caracteristiques Zone Contaminee Caracteristique Zone Contaminee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caracteristiques Zone Contaminee Caracteristique Zone Contaminee</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caracteristiques Zone Contaminee Caracteristique Zone Contaminee</em>' containment reference.
	 * @see #setCaracteristiquesZoneContamineeCaracteristiqueZoneContaminee(TypeCaracteristiqueZoneContaminee)
	 * @see mpia.schema.SchemaPackage#getTypeAutreElementControle_CaracteristiquesZoneContamineeCaracteristiqueZoneContaminee()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_CaracteristiqueZoneContaminee'"
	 *        extendedMetaData="kind='element' name='CaracteristiquesZoneContaminee_CaracteristiqueZoneContaminee'"
	 * @generated
	 */
	TypeCaracteristiqueZoneContaminee getCaracteristiquesZoneContamineeCaracteristiqueZoneContaminee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAutreElementControle#getCaracteristiquesZoneContamineeCaracteristiqueZoneContaminee <em>Caracteristiques Zone Contaminee Caracteristique Zone Contaminee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caracteristiques Zone Contaminee Caracteristique Zone Contaminee</em>' containment reference.
	 * @see #getCaracteristiquesZoneContamineeCaracteristiqueZoneContaminee()
	 * @generated
	 */
	void setCaracteristiquesZoneContamineeCaracteristiqueZoneContaminee(TypeCaracteristiqueZoneContaminee value);

	/**
	 * Returns the value of the '<em><b>Est Reconnue Selon Reconnaissance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Reconnue Selon Reconnaissance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Reconnue Selon Reconnaissance</em>' containment reference.
	 * @see #setEstReconnueSelonReconnaissance(TypeReconnaissance)
	 * @see mpia.schema.SchemaPackage#getTypeAutreElementControle_EstReconnueSelonReconnaissance()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Reconnaissance'"
	 *        extendedMetaData="kind='element' name='EstReconnueSelon_Reconnaissance'"
	 * @generated
	 */
	TypeReconnaissance getEstReconnueSelonReconnaissance();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAutreElementControle#getEstReconnueSelonReconnaissance <em>Est Reconnue Selon Reconnaissance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Reconnue Selon Reconnaissance</em>' containment reference.
	 * @see #getEstReconnueSelonReconnaissance()
	 * @generated
	 */
	void setEstReconnueSelonReconnaissance(TypeReconnaissance value);

	/**
	 * Returns the value of the '<em><b>APour Caracteristiques Zone Acquisition Zone Acquisition</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeZoneAcquisition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Caracteristiques Zone Acquisition Zone Acquisition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Caracteristiques Zone Acquisition Zone Acquisition</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeAutreElementControle_APourCaracteristiquesZoneAcquisitionZoneAcquisition()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ZoneAcquisition'"
	 *        extendedMetaData="kind='element' name='APourCaracteristiquesZoneAcquisition_ZoneAcquisition'"
	 * @generated
	 */
	EList<TypeZoneAcquisition> getAPourCaracteristiquesZoneAcquisitionZoneAcquisition();

	/**
	 * Returns the value of the '<em><b>Vaut Pour Horaire Manoeuvre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vaut Pour Horaire Manoeuvre</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vaut Pour Horaire Manoeuvre</em>' containment reference.
	 * @see #setVautPourHoraireManoeuvre(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAutreElementControle_VautPourHoraireManoeuvre()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_HoraireManoeuvre'"
	 *        extendedMetaData="kind='element' name='VautPour_HoraireManoeuvre'"
	 * @generated
	 */
	TypeAssociation getVautPourHoraireManoeuvre();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAutreElementControle#getVautPourHoraireManoeuvre <em>Vaut Pour Horaire Manoeuvre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vaut Pour Horaire Manoeuvre</em>' containment reference.
	 * @see #getVautPourHoraireManoeuvre()
	 * @generated
	 */
	void setVautPourHoraireManoeuvre(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Est Soumise AReglementation</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeReglementation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Soumise AReglementation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Soumise AReglementation</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeAutreElementControle_EstSoumiseAReglementation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Reglementation'"
	 *        extendedMetaData="kind='element' name='EstSoumiseA_Reglementation'"
	 * @generated
	 */
	EList<TypeReglementation> getEstSoumiseAReglementation();

	/**
	 * Returns the value of the '<em><b>APour Evenement NRBC Associee Evenement NRBC</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Evenement NRBC Associee Evenement NRBC</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Evenement NRBC Associee Evenement NRBC</em>' containment reference.
	 * @see #setAPourEvenementNRBCAssocieeEvenementNRBC(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAutreElementControle_APourEvenementNRBCAssocieeEvenementNRBC()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourZonesContamineesPrevues_AutreElementControle' target_entity='type_EvenementNRBC'"
	 *        extendedMetaData="kind='element' name='APourEvenementNRBCAssociee_EvenementNRBC'"
	 * @generated
	 */
	TypeAssociation getAPourEvenementNRBCAssocieeEvenementNRBC();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAutreElementControle#getAPourEvenementNRBCAssocieeEvenementNRBC <em>APour Evenement NRBC Associee Evenement NRBC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Evenement NRBC Associee Evenement NRBC</em>' containment reference.
	 * @see #getAPourEvenementNRBCAssocieeEvenementNRBC()
	 * @generated
	 */
	void setAPourEvenementNRBCAssocieeEvenementNRBC(TypeAssociation value);

} // TypeAutreElementControle
