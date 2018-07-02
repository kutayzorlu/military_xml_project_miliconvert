/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type CRrenseignement Objectif</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCRrenseignementObjectif#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeCRrenseignementObjectif#getAPourUniteRendantCompteUnite <em>APour Unite Rendant Compte Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeCRrenseignementObjectif#getAPourCaracteristiquesCRintermediaireAcquisitionElementCRintermediaireAcquisition <em>APour Caracteristiques CRintermediaire Acquisition Element CRintermediaire Acquisition</em>}</li>
 *   <li>{@link mpia.schema.TypeCRrenseignementObjectif#getAPourCaracteristiquesCRfinMissionAcquisitionCRfinMissionAcquisition <em>APour Caracteristiques CRfin Mission Acquisition CRfin Mission Acquisition</em>}</li>
 *   <li>{@link mpia.schema.TypeCRrenseignementObjectif#getAPourCaracteristiquesCRevaluationDegatsCRevaluationDegats <em>APour Caracteristiques CRevaluation Degats CRevaluation Degats</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCRrenseignementObjectif()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_CRrenseignementObjectif' kind='elementOnly'"
 * @generated
 */
public interface TypeCRrenseignementObjectif extends EObject {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCRrenseignementObjectifCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCRrenseignementObjectifCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoCRrenseignementObjectifCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeCRrenseignementObjectif_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoCRrenseignementObjectifCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCRrenseignementObjectif#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCRrenseignementObjectifCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoCRrenseignementObjectifCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCRrenseignementObjectif#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoCRrenseignementObjectifCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCRrenseignementObjectif#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoCRrenseignementObjectifCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>APour Unite Rendant Compte Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociationEXT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite Rendant Compte Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite Rendant Compte Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeCRrenseignementObjectif_APourUniteRendantCompteUnite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteRendantCompte_Unite'"
	 * @generated
	 */
	EList<TypeAssociationEXT> getAPourUniteRendantCompteUnite();

	/**
	 * Returns the value of the '<em><b>APour Caracteristiques CRintermediaire Acquisition Element CRintermediaire Acquisition</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeElementCRintermediaireAcquisition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Caracteristiques CRintermediaire Acquisition Element CRintermediaire Acquisition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Caracteristiques CRintermediaire Acquisition Element CRintermediaire Acquisition</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeCRrenseignementObjectif_APourCaracteristiquesCRintermediaireAcquisitionElementCRintermediaireAcquisition()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ElementCRintermediaireAcquisition'"
	 *        extendedMetaData="kind='element' name='APourCaracteristiquesCRintermediaireAcquisition_ElementCRintermediaireAcquisition'"
	 * @generated
	 */
	EList<TypeElementCRintermediaireAcquisition> getAPourCaracteristiquesCRintermediaireAcquisitionElementCRintermediaireAcquisition();

	/**
	 * Returns the value of the '<em><b>APour Caracteristiques CRfin Mission Acquisition CRfin Mission Acquisition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Caracteristiques CRfin Mission Acquisition CRfin Mission Acquisition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Caracteristiques CRfin Mission Acquisition CRfin Mission Acquisition</em>' containment reference.
	 * @see #setAPourCaracteristiquesCRfinMissionAcquisitionCRfinMissionAcquisition(TypeCRfinMissionAcquisition)
	 * @see mpia.schema.SchemaPackage#getTypeCRrenseignementObjectif_APourCaracteristiquesCRfinMissionAcquisitionCRfinMissionAcquisition()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_CRfinMissionAcquisition'"
	 *        extendedMetaData="kind='element' name='APourCaracteristiquesCRfinMissionAcquisition_CRfinMissionAcquisition'"
	 * @generated
	 */
	TypeCRfinMissionAcquisition getAPourCaracteristiquesCRfinMissionAcquisitionCRfinMissionAcquisition();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCRrenseignementObjectif#getAPourCaracteristiquesCRfinMissionAcquisitionCRfinMissionAcquisition <em>APour Caracteristiques CRfin Mission Acquisition CRfin Mission Acquisition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Caracteristiques CRfin Mission Acquisition CRfin Mission Acquisition</em>' containment reference.
	 * @see #getAPourCaracteristiquesCRfinMissionAcquisitionCRfinMissionAcquisition()
	 * @generated
	 */
	void setAPourCaracteristiquesCRfinMissionAcquisitionCRfinMissionAcquisition(TypeCRfinMissionAcquisition value);

	/**
	 * Returns the value of the '<em><b>APour Caracteristiques CRevaluation Degats CRevaluation Degats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Caracteristiques CRevaluation Degats CRevaluation Degats</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Caracteristiques CRevaluation Degats CRevaluation Degats</em>' containment reference.
	 * @see #setAPourCaracteristiquesCRevaluationDegatsCRevaluationDegats(TypeCRevaluationDegats)
	 * @see mpia.schema.SchemaPackage#getTypeCRrenseignementObjectif_APourCaracteristiquesCRevaluationDegatsCRevaluationDegats()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_CRevaluationDegats'"
	 *        extendedMetaData="kind='element' name='APourCaracteristiquesCRevaluationDegats_CRevaluationDegats'"
	 * @generated
	 */
	TypeCRevaluationDegats getAPourCaracteristiquesCRevaluationDegatsCRevaluationDegats();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCRrenseignementObjectif#getAPourCaracteristiquesCRevaluationDegatsCRevaluationDegats <em>APour Caracteristiques CRevaluation Degats CRevaluation Degats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Caracteristiques CRevaluation Degats CRevaluation Degats</em>' containment reference.
	 * @see #getAPourCaracteristiquesCRevaluationDegatsCRevaluationDegats()
	 * @generated
	 */
	void setAPourCaracteristiquesCRevaluationDegatsCRevaluationDegats(TypeCRevaluationDegats value);

} // TypeCRrenseignementObjectif
