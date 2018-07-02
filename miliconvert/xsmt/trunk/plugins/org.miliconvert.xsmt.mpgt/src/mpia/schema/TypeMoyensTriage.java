/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Moyens Triage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMoyensTriage#getVolumeForceMin <em>Volume Force Min</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyensTriage#getVolumeForceMax <em>Volume Force Max</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyensTriage#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyensTriage#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyensTriage#getConcerneTypeUniteTypeUnite <em>Concerne Type Unite Type Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyensTriage#getConcerneUnTypeEquipementTypeEquipement <em>Concerne Un Type Equipement Type Equipement</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyensTriage#getAPourUniteTriageUnite <em>APour Unite Triage Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMoyensTriage()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_MoyensTriage' kind='elementOnly'"
 * @generated
 */
public interface TypeMoyensTriage extends EObject {
	/**
	 * Returns the value of the '<em><b>Volume Force Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volume Force Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume Force Min</em>' attribute.
	 * @see #isSetVolumeForceMin()
	 * @see #unsetVolumeForceMin()
	 * @see #setVolumeForceMin(long)
	 * @see mpia.schema.SchemaPackage#getTypeMoyensTriage_VolumeForceMin()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6" required="true"
	 *        extendedMetaData="kind='element' name='VolumeForceMin'"
	 * @generated
	 */
	long getVolumeForceMin();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyensTriage#getVolumeForceMin <em>Volume Force Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume Force Min</em>' attribute.
	 * @see #isSetVolumeForceMin()
	 * @see #unsetVolumeForceMin()
	 * @see #getVolumeForceMin()
	 * @generated
	 */
	void setVolumeForceMin(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMoyensTriage#getVolumeForceMin <em>Volume Force Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVolumeForceMin()
	 * @see #getVolumeForceMin()
	 * @see #setVolumeForceMin(long)
	 * @generated
	 */
	void unsetVolumeForceMin();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMoyensTriage#getVolumeForceMin <em>Volume Force Min</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Volume Force Min</em>' attribute is set.
	 * @see #unsetVolumeForceMin()
	 * @see #getVolumeForceMin()
	 * @see #setVolumeForceMin(long)
	 * @generated
	 */
	boolean isSetVolumeForceMin();

	/**
	 * Returns the value of the '<em><b>Volume Force Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volume Force Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume Force Max</em>' attribute.
	 * @see #isSetVolumeForceMax()
	 * @see #unsetVolumeForceMax()
	 * @see #setVolumeForceMax(long)
	 * @see mpia.schema.SchemaPackage#getTypeMoyensTriage_VolumeForceMax()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='VolumeForceMax'"
	 * @generated
	 */
	long getVolumeForceMax();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyensTriage#getVolumeForceMax <em>Volume Force Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume Force Max</em>' attribute.
	 * @see #isSetVolumeForceMax()
	 * @see #unsetVolumeForceMax()
	 * @see #getVolumeForceMax()
	 * @generated
	 */
	void setVolumeForceMax(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMoyensTriage#getVolumeForceMax <em>Volume Force Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVolumeForceMax()
	 * @see #getVolumeForceMax()
	 * @see #setVolumeForceMax(long)
	 * @generated
	 */
	void unsetVolumeForceMax();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMoyensTriage#getVolumeForceMax <em>Volume Force Max</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Volume Force Max</em>' attribute is set.
	 * @see #unsetVolumeForceMax()
	 * @see #getVolumeForceMax()
	 * @see #setVolumeForceMax(long)
	 * @generated
	 */
	boolean isSetVolumeForceMax();

	/**
	 * Returns the value of the '<em><b>CTE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CTE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CTE</em>' attribute.
	 * @see #setCTE(String)
	 * @see mpia.schema.SchemaPackage#getTypeMoyensTriage_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyensTriage#getCTE <em>CTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CTE</em>' attribute.
	 * @see #getCTE()
	 * @generated
	 */
	void setCTE(String value);

	/**
	 * Returns the value of the '<em><b>CE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CE</em>' attribute.
	 * @see #setCE(String)
	 * @see mpia.schema.SchemaPackage#getTypeMoyensTriage_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyensTriage#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Concerne Type Unite Type Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Type Unite Type Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Type Unite Type Unite</em>' containment reference.
	 * @see #setConcerneTypeUniteTypeUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeMoyensTriage_ConcerneTypeUniteTypeUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeUnite'"
	 *        extendedMetaData="kind='element' name='ConcerneTypeUnite_TypeUnite'"
	 * @generated
	 */
	TypeAssociationEXT getConcerneTypeUniteTypeUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyensTriage#getConcerneTypeUniteTypeUnite <em>Concerne Type Unite Type Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Type Unite Type Unite</em>' containment reference.
	 * @see #getConcerneTypeUniteTypeUnite()
	 * @generated
	 */
	void setConcerneTypeUniteTypeUnite(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>Concerne Un Type Equipement Type Equipement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Un Type Equipement Type Equipement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Un Type Equipement Type Equipement</em>' containment reference.
	 * @see #setConcerneUnTypeEquipementTypeEquipement(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeMoyensTriage_ConcerneUnTypeEquipementTypeEquipement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeEquipement'"
	 *        extendedMetaData="kind='element' name='ConcerneUnTypeEquipement_TypeEquipement'"
	 * @generated
	 */
	TypeAssociationEXT getConcerneUnTypeEquipementTypeEquipement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyensTriage#getConcerneUnTypeEquipementTypeEquipement <em>Concerne Un Type Equipement Type Equipement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Un Type Equipement Type Equipement</em>' containment reference.
	 * @see #getConcerneUnTypeEquipementTypeEquipement()
	 * @generated
	 */
	void setConcerneUnTypeEquipementTypeEquipement(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>APour Unite Triage Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite Triage Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite Triage Unite</em>' containment reference.
	 * @see #setAPourUniteTriageUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeMoyensTriage_APourUniteTriageUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteTriage_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getAPourUniteTriageUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyensTriage#getAPourUniteTriageUnite <em>APour Unite Triage Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Unite Triage Unite</em>' containment reference.
	 * @see #getAPourUniteTriageUnite()
	 * @generated
	 */
	void setAPourUniteTriageUnite(TypeAssociationEXT value);

} // TypeMoyensTriage
