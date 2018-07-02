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
 * A representation of the model object '<em><b>Type Modalite Transfert Autorite ASS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeModaliteTransfertAutoriteASS#getTypeAppuiASS <em>Type Appui ASS</em>}</li>
 *   <li>{@link mpia.schema.TypeModaliteTransfertAutoriteASS#getDisposeTypeRepartition <em>Dispose Type Repartition</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeModaliteTransfertAutoriteASS()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ModaliteTransfertAutoriteASS' kind='elementOnly'"
 * @generated
 */
public interface TypeModaliteTransfertAutoriteASS extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Appui ASS</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoModaliteTransfertAutoriteASSTypeAppuiASS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Appui ASS</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Appui ASS</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoModaliteTransfertAutoriteASSTypeAppuiASS
	 * @see #isSetTypeAppuiASS()
	 * @see #unsetTypeAppuiASS()
	 * @see #setTypeAppuiASS(TypeDictionaryDicoModaliteTransfertAutoriteASSTypeAppuiASS)
	 * @see mpia.schema.SchemaPackage#getTypeModaliteTransfertAutoriteASS_TypeAppuiASS()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeAppuiASS'"
	 * @generated
	 */
	TypeDictionaryDicoModaliteTransfertAutoriteASSTypeAppuiASS getTypeAppuiASS();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModaliteTransfertAutoriteASS#getTypeAppuiASS <em>Type Appui ASS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Appui ASS</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoModaliteTransfertAutoriteASSTypeAppuiASS
	 * @see #isSetTypeAppuiASS()
	 * @see #unsetTypeAppuiASS()
	 * @see #getTypeAppuiASS()
	 * @generated
	 */
	void setTypeAppuiASS(TypeDictionaryDicoModaliteTransfertAutoriteASSTypeAppuiASS value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeModaliteTransfertAutoriteASS#getTypeAppuiASS <em>Type Appui ASS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeAppuiASS()
	 * @see #getTypeAppuiASS()
	 * @see #setTypeAppuiASS(TypeDictionaryDicoModaliteTransfertAutoriteASSTypeAppuiASS)
	 * @generated
	 */
	void unsetTypeAppuiASS();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeModaliteTransfertAutoriteASS#getTypeAppuiASS <em>Type Appui ASS</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Appui ASS</em>' attribute is set.
	 * @see #unsetTypeAppuiASS()
	 * @see #getTypeAppuiASS()
	 * @see #setTypeAppuiASS(TypeDictionaryDicoModaliteTransfertAutoriteASSTypeAppuiASS)
	 * @generated
	 */
	boolean isSetTypeAppuiASS();

	/**
	 * Returns the value of the '<em><b>Dispose Type Repartition</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTypeRepartition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dispose Type Repartition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dispose Type Repartition</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeModaliteTransfertAutoriteASS_DisposeTypeRepartition()
	 * @model containment="true" upper="2"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_TypeRepartition'"
	 *        extendedMetaData="kind='element' name='Dispose_TypeRepartition'"
	 * @generated
	 */
	EList<TypeTypeRepartition> getDisposeTypeRepartition();

} // TypeModaliteTransfertAutoriteASS
