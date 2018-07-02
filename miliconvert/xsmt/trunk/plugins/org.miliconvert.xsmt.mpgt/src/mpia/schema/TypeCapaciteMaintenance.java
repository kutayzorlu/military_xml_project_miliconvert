/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Capacite Maintenance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCapaciteMaintenance#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteMaintenance#getNombrePostes <em>Nombre Postes</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteMaintenance#getNiveauService <em>Niveau Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCapaciteMaintenance()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_CapaciteMaintenance' kind='elementOnly'"
 * @generated
 */
public interface TypeCapaciteMaintenance extends TypeCapacite {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCapaciteMaintenanceCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteMaintenanceCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoCapaciteMaintenanceCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteMaintenance_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoCapaciteMaintenanceCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteMaintenance#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteMaintenanceCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoCapaciteMaintenanceCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapaciteMaintenance#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoCapaciteMaintenanceCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapaciteMaintenance#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoCapaciteMaintenanceCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Nombre Postes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Postes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Postes</em>' attribute.
	 * @see #isSetNombrePostes()
	 * @see #unsetNombrePostes()
	 * @see #setNombrePostes(long)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteMaintenance_NombrePostes()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NombrePostes'"
	 * @generated
	 */
	long getNombrePostes();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteMaintenance#getNombrePostes <em>Nombre Postes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Postes</em>' attribute.
	 * @see #isSetNombrePostes()
	 * @see #unsetNombrePostes()
	 * @see #getNombrePostes()
	 * @generated
	 */
	void setNombrePostes(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapaciteMaintenance#getNombrePostes <em>Nombre Postes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombrePostes()
	 * @see #getNombrePostes()
	 * @see #setNombrePostes(long)
	 * @generated
	 */
	void unsetNombrePostes();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapaciteMaintenance#getNombrePostes <em>Nombre Postes</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Postes</em>' attribute is set.
	 * @see #unsetNombrePostes()
	 * @see #getNombrePostes()
	 * @see #setNombrePostes(long)
	 * @generated
	 */
	boolean isSetNombrePostes();

	/**
	 * Returns the value of the '<em><b>Niveau Service</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCapaciteMaintenanceNiveauService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Niveau Service</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau Service</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteMaintenanceNiveauService
	 * @see #isSetNiveauService()
	 * @see #unsetNiveauService()
	 * @see #setNiveauService(TypeDictionaryDicoCapaciteMaintenanceNiveauService)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteMaintenance_NiveauService()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='NiveauService'"
	 * @generated
	 */
	TypeDictionaryDicoCapaciteMaintenanceNiveauService getNiveauService();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteMaintenance#getNiveauService <em>Niveau Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Niveau Service</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteMaintenanceNiveauService
	 * @see #isSetNiveauService()
	 * @see #unsetNiveauService()
	 * @see #getNiveauService()
	 * @generated
	 */
	void setNiveauService(TypeDictionaryDicoCapaciteMaintenanceNiveauService value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapaciteMaintenance#getNiveauService <em>Niveau Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNiveauService()
	 * @see #getNiveauService()
	 * @see #setNiveauService(TypeDictionaryDicoCapaciteMaintenanceNiveauService)
	 * @generated
	 */
	void unsetNiveauService();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapaciteMaintenance#getNiveauService <em>Niveau Service</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Niveau Service</em>' attribute is set.
	 * @see #unsetNiveauService()
	 * @see #getNiveauService()
	 * @see #setNiveauService(TypeDictionaryDicoCapaciteMaintenanceNiveauService)
	 * @generated
	 */
	boolean isSetNiveauService();

} // TypeCapaciteMaintenance
