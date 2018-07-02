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
 * A representation of the model object '<em><b>Type Reactions Mentales Au Combat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeReactionsMentalesAuCombat#getConduiteATenir <em>Conduite ATenir</em>}</li>
 *   <li>{@link mpia.schema.TypeReactionsMentalesAuCombat#getReactionsMentales <em>Reactions Mentales</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeReactionsMentalesAuCombat()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ReactionsMentalesAuCombat' kind='elementOnly'"
 * @generated
 */
public interface TypeReactionsMentalesAuCombat extends EObject {
	/**
	 * Returns the value of the '<em><b>Conduite ATenir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conduite ATenir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conduite ATenir</em>' attribute.
	 * @see #setConduiteATenir(String)
	 * @see mpia.schema.SchemaPackage#getTypeReactionsMentalesAuCombat_ConduiteATenir()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='ConduiteATenir'"
	 * @generated
	 */
	String getConduiteATenir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeReactionsMentalesAuCombat#getConduiteATenir <em>Conduite ATenir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conduite ATenir</em>' attribute.
	 * @see #getConduiteATenir()
	 * @generated
	 */
	void setConduiteATenir(String value);

	/**
	 * Returns the value of the '<em><b>Reactions Mentales</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reactions Mentales</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reactions Mentales</em>' attribute.
	 * @see #setReactionsMentales(String)
	 * @see mpia.schema.SchemaPackage#getTypeReactionsMentalesAuCombat_ReactionsMentales()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='ReactionsMentales'"
	 * @generated
	 */
	String getReactionsMentales();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeReactionsMentalesAuCombat#getReactionsMentales <em>Reactions Mentales</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reactions Mentales</em>' attribute.
	 * @see #getReactionsMentales()
	 * @generated
	 */
	void setReactionsMentales(String value);

} // TypeReactionsMentalesAuCombat
