/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Zone Alat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeZoneAlat#getSensParcours <em>Sens Parcours</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeZoneAlat()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_ZoneAlat' kind='elementOnly'"
 * @generated
 */
public interface TypeZoneAlat extends TypeElementControle {
	/**
	 * Returns the value of the '<em><b>Sens Parcours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sens Parcours</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sens Parcours</em>' attribute.
	 * @see #setSensParcours(String)
	 * @see mpia.schema.SchemaPackage#getTypeZoneAlat_SensParcours()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='SensParcours'"
	 * @generated
	 */
	String getSensParcours();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneAlat#getSensParcours <em>Sens Parcours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sens Parcours</em>' attribute.
	 * @see #getSensParcours()
	 * @generated
	 */
	void setSensParcours(String value);

} // TypeZoneAlat
