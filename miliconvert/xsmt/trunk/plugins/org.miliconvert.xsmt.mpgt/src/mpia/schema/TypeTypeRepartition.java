/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Type Repartition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeTypeRepartition#getTypeRepartitionMunitions <em>Type Repartition Munitions</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeRepartition#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeRepartition#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeRepartition#getACommeMunitionsAlloueeVolumeMunitionsASS <em>AComme Munitions Allouee Volume Munitions ASS</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeTypeRepartition()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_TypeRepartition' kind='elementOnly'"
 * @generated
 */
public interface TypeTypeRepartition extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Repartition Munitions</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoConsommationAlloueeTypeRepartitionMunitions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Repartition Munitions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Repartition Munitions</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoConsommationAlloueeTypeRepartitionMunitions
	 * @see #isSetTypeRepartitionMunitions()
	 * @see #unsetTypeRepartitionMunitions()
	 * @see #setTypeRepartitionMunitions(TypeDictionaryDicoConsommationAlloueeTypeRepartitionMunitions)
	 * @see mpia.schema.SchemaPackage#getTypeTypeRepartition_TypeRepartitionMunitions()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='TypeRepartitionMunitions'"
	 * @generated
	 */
	TypeDictionaryDicoConsommationAlloueeTypeRepartitionMunitions getTypeRepartitionMunitions();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeRepartition#getTypeRepartitionMunitions <em>Type Repartition Munitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Repartition Munitions</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoConsommationAlloueeTypeRepartitionMunitions
	 * @see #isSetTypeRepartitionMunitions()
	 * @see #unsetTypeRepartitionMunitions()
	 * @see #getTypeRepartitionMunitions()
	 * @generated
	 */
	void setTypeRepartitionMunitions(TypeDictionaryDicoConsommationAlloueeTypeRepartitionMunitions value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeRepartition#getTypeRepartitionMunitions <em>Type Repartition Munitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeRepartitionMunitions()
	 * @see #getTypeRepartitionMunitions()
	 * @see #setTypeRepartitionMunitions(TypeDictionaryDicoConsommationAlloueeTypeRepartitionMunitions)
	 * @generated
	 */
	void unsetTypeRepartitionMunitions();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeRepartition#getTypeRepartitionMunitions <em>Type Repartition Munitions</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Repartition Munitions</em>' attribute is set.
	 * @see #unsetTypeRepartitionMunitions()
	 * @see #getTypeRepartitionMunitions()
	 * @see #setTypeRepartitionMunitions(TypeDictionaryDicoConsommationAlloueeTypeRepartitionMunitions)
	 * @generated
	 */
	boolean isSetTypeRepartitionMunitions();

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
	 * @see mpia.schema.SchemaPackage#getTypeTypeRepartition_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeRepartition#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeTypeRepartition_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeRepartition#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>AComme Munitions Allouee Volume Munitions ASS</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeVolumeMunitionsASS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Munitions Allouee Volume Munitions ASS</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Munitions Allouee Volume Munitions ASS</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeTypeRepartition_ACommeMunitionsAlloueeVolumeMunitionsASS()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_VolumeMunitionsASS'"
	 *        extendedMetaData="kind='element' name='ACommeMunitionsAllouee_VolumeMunitionsASS'"
	 * @generated
	 */
	EList<TypeVolumeMunitionsASS> getACommeMunitionsAlloueeVolumeMunitionsASS();

} // TypeTypeRepartition
