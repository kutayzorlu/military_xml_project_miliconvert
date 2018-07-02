/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Structure Organisee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeStructureOrganisee#getNombreEmployes <em>Nombre Employes</em>}</li>
 *   <li>{@link mpia.schema.TypeStructureOrganisee#getNombreAdherents <em>Nombre Adherents</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeStructureOrganisee()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_StructureOrganisee' kind='elementOnly'"
 * @generated
 */
public interface TypeStructureOrganisee extends TypeEntiteOrganisationnelle {
	/**
	 * Returns the value of the '<em><b>Nombre Employes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Employes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Employes</em>' attribute.
	 * @see #isSetNombreEmployes()
	 * @see #unsetNombreEmployes()
	 * @see #setNombreEmployes(long)
	 * @see mpia.schema.SchemaPackage#getTypeStructureOrganisee_NombreEmployes()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier9"
	 *        extendedMetaData="kind='element' name='NombreEmployes'"
	 * @generated
	 */
	long getNombreEmployes();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeStructureOrganisee#getNombreEmployes <em>Nombre Employes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Employes</em>' attribute.
	 * @see #isSetNombreEmployes()
	 * @see #unsetNombreEmployes()
	 * @see #getNombreEmployes()
	 * @generated
	 */
	void setNombreEmployes(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeStructureOrganisee#getNombreEmployes <em>Nombre Employes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreEmployes()
	 * @see #getNombreEmployes()
	 * @see #setNombreEmployes(long)
	 * @generated
	 */
	void unsetNombreEmployes();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeStructureOrganisee#getNombreEmployes <em>Nombre Employes</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Employes</em>' attribute is set.
	 * @see #unsetNombreEmployes()
	 * @see #getNombreEmployes()
	 * @see #setNombreEmployes(long)
	 * @generated
	 */
	boolean isSetNombreEmployes();

	/**
	 * Returns the value of the '<em><b>Nombre Adherents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Adherents</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Adherents</em>' attribute.
	 * @see #isSetNombreAdherents()
	 * @see #unsetNombreAdherents()
	 * @see #setNombreAdherents(long)
	 * @see mpia.schema.SchemaPackage#getTypeStructureOrganisee_NombreAdherents()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier9"
	 *        extendedMetaData="kind='element' name='NombreAdherents'"
	 * @generated
	 */
	long getNombreAdherents();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeStructureOrganisee#getNombreAdherents <em>Nombre Adherents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Adherents</em>' attribute.
	 * @see #isSetNombreAdherents()
	 * @see #unsetNombreAdherents()
	 * @see #getNombreAdherents()
	 * @generated
	 */
	void setNombreAdherents(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeStructureOrganisee#getNombreAdherents <em>Nombre Adherents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreAdherents()
	 * @see #getNombreAdherents()
	 * @see #setNombreAdherents(long)
	 * @generated
	 */
	void unsetNombreAdherents();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeStructureOrganisee#getNombreAdherents <em>Nombre Adherents</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Adherents</em>' attribute is set.
	 * @see #unsetNombreAdherents()
	 * @see #getNombreAdherents()
	 * @see #setNombreAdherents(long)
	 * @generated
	 */
	boolean isSetNombreAdherents();

} // TypeStructureOrganisee
