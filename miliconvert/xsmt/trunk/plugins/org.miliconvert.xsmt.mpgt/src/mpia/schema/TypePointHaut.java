/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Point Haut</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypePointHaut#getAccessibilite <em>Accessibilite</em>}</li>
 *   <li>{@link mpia.schema.TypePointHaut#getAmenageabilite <em>Amenageabilite</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypePointHaut()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_PointHaut' kind='elementOnly'"
 * @generated
 */
public interface TypePointHaut extends TypeElementControle {
	/**
	 * Returns the value of the '<em><b>Accessibilite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accessibilite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accessibilite</em>' attribute.
	 * @see #setAccessibilite(String)
	 * @see mpia.schema.SchemaPackage#getTypePointHaut_Accessibilite()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='Accessibilite'"
	 * @generated
	 */
	String getAccessibilite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointHaut#getAccessibilite <em>Accessibilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accessibilite</em>' attribute.
	 * @see #getAccessibilite()
	 * @generated
	 */
	void setAccessibilite(String value);

	/**
	 * Returns the value of the '<em><b>Amenageabilite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amenageabilite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amenageabilite</em>' attribute.
	 * @see #setAmenageabilite(String)
	 * @see mpia.schema.SchemaPackage#getTypePointHaut_Amenageabilite()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='Amenageabilite'"
	 * @generated
	 */
	String getAmenageabilite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointHaut#getAmenageabilite <em>Amenageabilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amenageabilite</em>' attribute.
	 * @see #getAmenageabilite()
	 * @generated
	 */
	void setAmenageabilite(String value);

} // TypePointHaut
