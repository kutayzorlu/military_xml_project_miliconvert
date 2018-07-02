/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Memento Genie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMementoGenie#isReference <em>Reference</em>}</li>
 *   <li>{@link mpia.schema.TypeMementoGenie#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeMementoGenie#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeMementoGenie#getAPourVarianteRealisationVarianteTravail <em>APour Variante Realisation Variante Travail</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMementoGenie()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_MementoGenie' kind='elementOnly'"
 * @generated
 */
public interface TypeMementoGenie extends EObject {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' attribute.
	 * @see #isSetReference()
	 * @see #unsetReference()
	 * @see #setReference(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeMementoGenie_Reference()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='Reference'"
	 * @generated
	 */
	boolean isReference();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMementoGenie#isReference <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' attribute.
	 * @see #isSetReference()
	 * @see #unsetReference()
	 * @see #isReference()
	 * @generated
	 */
	void setReference(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMementoGenie#isReference <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReference()
	 * @see #isReference()
	 * @see #setReference(boolean)
	 * @generated
	 */
	void unsetReference();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMementoGenie#isReference <em>Reference</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reference</em>' attribute is set.
	 * @see #unsetReference()
	 * @see #isReference()
	 * @see #setReference(boolean)
	 * @generated
	 */
	boolean isSetReference();

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
	 * @see mpia.schema.SchemaPackage#getTypeMementoGenie_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMementoGenie#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeMementoGenie_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMementoGenie#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Variante Realisation Variante Travail</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Variante Realisation Variante Travail</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Variante Realisation Variante Travail</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMementoGenie_APourVarianteRealisationVarianteTravail()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_VarianteTravail'"
	 *        extendedMetaData="kind='element' name='APourVarianteRealisation_VarianteTravail'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourVarianteRealisationVarianteTravail();

} // TypeMementoGenie
