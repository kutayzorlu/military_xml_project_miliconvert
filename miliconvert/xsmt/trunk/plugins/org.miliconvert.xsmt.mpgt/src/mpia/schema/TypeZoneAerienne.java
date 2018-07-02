/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Zone Aerienne</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeZoneAerienne#getCodeZoneAStatutParticulier <em>Code Zone AStatut Particulier</em>}</li>
 *   <li>{@link mpia.schema.TypeZoneAerienne#getCodeZone <em>Code Zone</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeZoneAerienne()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_ZoneAerienne' kind='elementOnly'"
 * @generated
 */
public interface TypeZoneAerienne extends TypeElementControle {
	/**
	 * Returns the value of the '<em><b>Code Zone AStatut Particulier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Zone AStatut Particulier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Zone AStatut Particulier</em>' attribute.
	 * @see #setCodeZoneAStatutParticulier(String)
	 * @see mpia.schema.SchemaPackage#getTypeZoneAerienne_CodeZoneAStatutParticulier()
	 * @model dataType="mpia.meta.TypeDataTypeChaine012"
	 *        extendedMetaData="kind='element' name='CodeZoneAStatutParticulier'"
	 * @generated
	 */
	String getCodeZoneAStatutParticulier();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneAerienne#getCodeZoneAStatutParticulier <em>Code Zone AStatut Particulier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Zone AStatut Particulier</em>' attribute.
	 * @see #getCodeZoneAStatutParticulier()
	 * @generated
	 */
	void setCodeZoneAStatutParticulier(String value);

	/**
	 * Returns the value of the '<em><b>Code Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Zone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Zone</em>' attribute.
	 * @see #setCodeZone(String)
	 * @see mpia.schema.SchemaPackage#getTypeZoneAerienne_CodeZone()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='CodeZone'"
	 * @generated
	 */
	String getCodeZone();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneAerienne#getCodeZone <em>Code Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Zone</em>' attribute.
	 * @see #getCodeZone()
	 * @generated
	 */
	void setCodeZone(String value);

} // TypeZoneAerienne
