/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type En Tete Paragraphe Plan Ou Ordre</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEnTeteParagraphePlanOuOrdre#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeEnTeteParagraphePlanOuOrdre#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeEnTeteParagraphePlanOuOrdre#getSujet <em>Sujet</em>}</li>
 *   <li>{@link mpia.schema.TypeEnTeteParagraphePlanOuOrdre#getAPourDegreClassificationDegreClassification <em>APour Degre Classification Degre Classification</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEnTeteParagraphePlanOuOrdre()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_EnTeteParagraphePlanOuOrdre' kind='elementOnly'"
 * @generated
 */
public interface TypeEnTeteParagraphePlanOuOrdre extends EObject {
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
	 * @see mpia.schema.SchemaPackage#getTypeEnTeteParagraphePlanOuOrdre_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEnTeteParagraphePlanOuOrdre#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeEnTeteParagraphePlanOuOrdre_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEnTeteParagraphePlanOuOrdre#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Sujet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sujet</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sujet</em>' attribute.
	 * @see #setSujet(String)
	 * @see mpia.schema.SchemaPackage#getTypeEnTeteParagraphePlanOuOrdre_Sujet()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255" required="true"
	 *        extendedMetaData="kind='element' name='Sujet'"
	 * @generated
	 */
	String getSujet();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEnTeteParagraphePlanOuOrdre#getSujet <em>Sujet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sujet</em>' attribute.
	 * @see #getSujet()
	 * @generated
	 */
	void setSujet(String value);

	/**
	 * Returns the value of the '<em><b>APour Degre Classification Degre Classification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Degre Classification Degre Classification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Degre Classification Degre Classification</em>' containment reference.
	 * @see #setAPourDegreClassificationDegreClassification(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeEnTeteParagraphePlanOuOrdre_APourDegreClassificationDegreClassification()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_DegreClassification'"
	 *        extendedMetaData="kind='element' name='APourDegreClassification_DegreClassification'"
	 * @generated
	 */
	TypeAssociation getAPourDegreClassificationDegreClassification();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEnTeteParagraphePlanOuOrdre#getAPourDegreClassificationDegreClassification <em>APour Degre Classification Degre Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Degre Classification Degre Classification</em>' containment reference.
	 * @see #getAPourDegreClassificationDegreClassification()
	 * @generated
	 */
	void setAPourDegreClassificationDegreClassification(TypeAssociation value);

} // TypeEnTeteParagraphePlanOuOrdre
