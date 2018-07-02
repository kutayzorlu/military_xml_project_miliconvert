/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Niveau AMaintenir</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeNiveauAMaintenir#getModalitesParticulieres <em>Modalites Particulieres</em>}</li>
 *   <li>{@link mpia.schema.TypeNiveauAMaintenir#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeNiveauAMaintenir#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeNiveauAMaintenir#getConcerneDotationEffectiveConsommable <em>Concerne Dotation Effective Consommable</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeNiveauAMaintenir()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_NiveauAMaintenir' kind='elementOnly'"
 * @generated
 */
public interface TypeNiveauAMaintenir extends EObject {
	/**
	 * Returns the value of the '<em><b>Modalites Particulieres</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modalites Particulieres</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modalites Particulieres</em>' attribute.
	 * @see #setModalitesParticulieres(String)
	 * @see mpia.schema.SchemaPackage#getTypeNiveauAMaintenir_ModalitesParticulieres()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='ModalitesParticulieres'"
	 * @generated
	 */
	String getModalitesParticulieres();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeNiveauAMaintenir#getModalitesParticulieres <em>Modalites Particulieres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modalites Particulieres</em>' attribute.
	 * @see #getModalitesParticulieres()
	 * @generated
	 */
	void setModalitesParticulieres(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeNiveauAMaintenir_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeNiveauAMaintenir#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeNiveauAMaintenir_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeNiveauAMaintenir#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Concerne Dotation Effective Consommable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Dotation Effective Consommable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Dotation Effective Consommable</em>' containment reference.
	 * @see #setConcerneDotationEffectiveConsommable(TypeDotationEffectiveConsommable)
	 * @see mpia.schema.SchemaPackage#getTypeNiveauAMaintenir_ConcerneDotationEffectiveConsommable()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_DotationEffectiveConsommable'"
	 *        extendedMetaData="kind='element' name='Concerne_DotationEffectiveConsommable'"
	 * @generated
	 */
	TypeDotationEffectiveConsommable getConcerneDotationEffectiveConsommable();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeNiveauAMaintenir#getConcerneDotationEffectiveConsommable <em>Concerne Dotation Effective Consommable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Dotation Effective Consommable</em>' containment reference.
	 * @see #getConcerneDotationEffectiveConsommable()
	 * @generated
	 */
	void setConcerneDotationEffectiveConsommable(TypeDotationEffectiveConsommable value);

} // TypeNiveauAMaintenir
