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
 * A representation of the model object '<em><b>Type Objet Geometrique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeObjetGeometrique#getReferenceDistancesVerticales <em>Reference Distances Verticales</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeObjetGeometrique()
 * @model abstract="true"
 *        annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ObjetGeometrique' kind='elementOnly'"
 * @generated
 */
public interface TypeObjetGeometrique extends EObject {
	/**
	 * Returns the value of the '<em><b>Reference Distances Verticales</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoDistanceVerticaleReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Distances Verticales</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Distances Verticales</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDistanceVerticaleReference
	 * @see #isSetReferenceDistancesVerticales()
	 * @see #unsetReferenceDistancesVerticales()
	 * @see #setReferenceDistancesVerticales(TypeDictionaryDicoDistanceVerticaleReference)
	 * @see mpia.schema.SchemaPackage#getTypeObjetGeometrique_ReferenceDistancesVerticales()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ReferenceDistancesVerticales'"
	 * @generated
	 */
	TypeDictionaryDicoDistanceVerticaleReference getReferenceDistancesVerticales();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjetGeometrique#getReferenceDistancesVerticales <em>Reference Distances Verticales</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Distances Verticales</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDistanceVerticaleReference
	 * @see #isSetReferenceDistancesVerticales()
	 * @see #unsetReferenceDistancesVerticales()
	 * @see #getReferenceDistancesVerticales()
	 * @generated
	 */
	void setReferenceDistancesVerticales(TypeDictionaryDicoDistanceVerticaleReference value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeObjetGeometrique#getReferenceDistancesVerticales <em>Reference Distances Verticales</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReferenceDistancesVerticales()
	 * @see #getReferenceDistancesVerticales()
	 * @see #setReferenceDistancesVerticales(TypeDictionaryDicoDistanceVerticaleReference)
	 * @generated
	 */
	void unsetReferenceDistancesVerticales();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeObjetGeometrique#getReferenceDistancesVerticales <em>Reference Distances Verticales</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reference Distances Verticales</em>' attribute is set.
	 * @see #unsetReferenceDistancesVerticales()
	 * @see #getReferenceDistancesVerticales()
	 * @see #setReferenceDistancesVerticales(TypeDictionaryDicoDistanceVerticaleReference)
	 * @generated
	 */
	boolean isSetReferenceDistancesVerticales();

} // TypeObjetGeometrique
