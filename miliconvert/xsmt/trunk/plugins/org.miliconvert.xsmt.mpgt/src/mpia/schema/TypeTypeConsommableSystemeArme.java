/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Type Consommable Systeme Arme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeTypeConsommableSystemeArme#getSeuilAlerte <em>Seuil Alerte</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeConsommableSystemeArme#getTauxConversion <em>Taux Conversion</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeTypeConsommableSystemeArme()
 * @model abstract="true"
 *        extendedMetaData="name='type_TypeConsommableSystemeArme' kind='elementOnly'"
 * @generated
 */
public interface TypeTypeConsommableSystemeArme extends TypeTypeMateriel {
	/**
	 * Returns the value of the '<em><b>Seuil Alerte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seuil Alerte</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seuil Alerte</em>' attribute.
	 * @see #isSetSeuilAlerte()
	 * @see #unsetSeuilAlerte()
	 * @see #setSeuilAlerte(double)
	 * @see mpia.schema.SchemaPackage#getTypeTypeConsommableSystemeArme_SeuilAlerte()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='SeuilAlerte'"
	 * @generated
	 */
	double getSeuilAlerte();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeConsommableSystemeArme#getSeuilAlerte <em>Seuil Alerte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seuil Alerte</em>' attribute.
	 * @see #isSetSeuilAlerte()
	 * @see #unsetSeuilAlerte()
	 * @see #getSeuilAlerte()
	 * @generated
	 */
	void setSeuilAlerte(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeConsommableSystemeArme#getSeuilAlerte <em>Seuil Alerte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSeuilAlerte()
	 * @see #getSeuilAlerte()
	 * @see #setSeuilAlerte(double)
	 * @generated
	 */
	void unsetSeuilAlerte();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeConsommableSystemeArme#getSeuilAlerte <em>Seuil Alerte</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Seuil Alerte</em>' attribute is set.
	 * @see #unsetSeuilAlerte()
	 * @see #getSeuilAlerte()
	 * @see #setSeuilAlerte(double)
	 * @generated
	 */
	boolean isSetSeuilAlerte();

	/**
	 * Returns the value of the '<em><b>Taux Conversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Taux Conversion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taux Conversion</em>' attribute.
	 * @see #isSetTauxConversion()
	 * @see #unsetTauxConversion()
	 * @see #setTauxConversion(double)
	 * @see mpia.schema.SchemaPackage#getTypeTypeConsommableSystemeArme_TauxConversion()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal" required="true"
	 *        extendedMetaData="kind='element' name='TauxConversion'"
	 * @generated
	 */
	double getTauxConversion();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeConsommableSystemeArme#getTauxConversion <em>Taux Conversion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taux Conversion</em>' attribute.
	 * @see #isSetTauxConversion()
	 * @see #unsetTauxConversion()
	 * @see #getTauxConversion()
	 * @generated
	 */
	void setTauxConversion(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeConsommableSystemeArme#getTauxConversion <em>Taux Conversion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTauxConversion()
	 * @see #getTauxConversion()
	 * @see #setTauxConversion(double)
	 * @generated
	 */
	void unsetTauxConversion();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeConsommableSystemeArme#getTauxConversion <em>Taux Conversion</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Taux Conversion</em>' attribute is set.
	 * @see #unsetTauxConversion()
	 * @see #getTauxConversion()
	 * @see #setTauxConversion(double)
	 * @generated
	 */
	boolean isSetTauxConversion();

} // TypeTypeConsommableSystemeArme
