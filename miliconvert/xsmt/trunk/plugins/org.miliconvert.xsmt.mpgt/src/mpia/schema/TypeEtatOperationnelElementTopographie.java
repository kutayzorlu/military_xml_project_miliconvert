/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Etat Operationnel Element Topographie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEtatOperationnelElementTopographie#getPresenceMines <em>Presence Mines</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelElementTopographie#isRisqueProjection <em>Risque Projection</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelElementTopographie#getCapaciteRestante <em>Capacite Restante</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelElementTopographie()
 * @model abstract="true"
 *        annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_EtatOperationnelElementTopographie' kind='elementOnly'"
 * @generated
 */
public interface TypeEtatOperationnelElementTopographie extends TypeEtatOperationnel {
	/**
	 * Returns the value of the '<em><b>Presence Mines</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPresenceMines}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presence Mines</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presence Mines</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPresenceMines
	 * @see #isSetPresenceMines()
	 * @see #unsetPresenceMines()
	 * @see #setPresenceMines(TypeDictionaryDicoPresenceMines)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelElementTopographie_PresenceMines()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='PresenceMines'"
	 * @generated
	 */
	TypeDictionaryDicoPresenceMines getPresenceMines();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelElementTopographie#getPresenceMines <em>Presence Mines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presence Mines</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPresenceMines
	 * @see #isSetPresenceMines()
	 * @see #unsetPresenceMines()
	 * @see #getPresenceMines()
	 * @generated
	 */
	void setPresenceMines(TypeDictionaryDicoPresenceMines value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelElementTopographie#getPresenceMines <em>Presence Mines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPresenceMines()
	 * @see #getPresenceMines()
	 * @see #setPresenceMines(TypeDictionaryDicoPresenceMines)
	 * @generated
	 */
	void unsetPresenceMines();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelElementTopographie#getPresenceMines <em>Presence Mines</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Presence Mines</em>' attribute is set.
	 * @see #unsetPresenceMines()
	 * @see #getPresenceMines()
	 * @see #setPresenceMines(TypeDictionaryDicoPresenceMines)
	 * @generated
	 */
	boolean isSetPresenceMines();

	/**
	 * Returns the value of the '<em><b>Risque Projection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Risque Projection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Risque Projection</em>' attribute.
	 * @see #isSetRisqueProjection()
	 * @see #unsetRisqueProjection()
	 * @see #setRisqueProjection(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelElementTopographie_RisqueProjection()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='RisqueProjection'"
	 * @generated
	 */
	boolean isRisqueProjection();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelElementTopographie#isRisqueProjection <em>Risque Projection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Risque Projection</em>' attribute.
	 * @see #isSetRisqueProjection()
	 * @see #unsetRisqueProjection()
	 * @see #isRisqueProjection()
	 * @generated
	 */
	void setRisqueProjection(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelElementTopographie#isRisqueProjection <em>Risque Projection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRisqueProjection()
	 * @see #isRisqueProjection()
	 * @see #setRisqueProjection(boolean)
	 * @generated
	 */
	void unsetRisqueProjection();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelElementTopographie#isRisqueProjection <em>Risque Projection</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Risque Projection</em>' attribute is set.
	 * @see #unsetRisqueProjection()
	 * @see #isRisqueProjection()
	 * @see #setRisqueProjection(boolean)
	 * @generated
	 */
	boolean isSetRisqueProjection();

	/**
	 * Returns the value of the '<em><b>Capacite Restante</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacite Restante</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacite Restante</em>' attribute.
	 * @see #isSetCapaciteRestante()
	 * @see #unsetCapaciteRestante()
	 * @see #setCapaciteRestante(double)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelElementTopographie_CapaciteRestante()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeRatio"
	 *        extendedMetaData="kind='element' name='CapaciteRestante'"
	 * @generated
	 */
	double getCapaciteRestante();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelElementTopographie#getCapaciteRestante <em>Capacite Restante</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacite Restante</em>' attribute.
	 * @see #isSetCapaciteRestante()
	 * @see #unsetCapaciteRestante()
	 * @see #getCapaciteRestante()
	 * @generated
	 */
	void setCapaciteRestante(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelElementTopographie#getCapaciteRestante <em>Capacite Restante</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCapaciteRestante()
	 * @see #getCapaciteRestante()
	 * @see #setCapaciteRestante(double)
	 * @generated
	 */
	void unsetCapaciteRestante();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelElementTopographie#getCapaciteRestante <em>Capacite Restante</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Capacite Restante</em>' attribute is set.
	 * @see #unsetCapaciteRestante()
	 * @see #getCapaciteRestante()
	 * @see #setCapaciteRestante(double)
	 * @generated
	 */
	boolean isSetCapaciteRestante();

} // TypeEtatOperationnelElementTopographie
