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
 * A representation of the model object '<em><b>Type Moyen Dispersion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMoyenDispersion#getQuantiteMoyensLancement <em>Quantite Moyens Lancement</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyenDispersion#getMoyenLancementNonRepertorie <em>Moyen Lancement Non Repertorie</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyenDispersion#getMoyenLancement <em>Moyen Lancement</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMoyenDispersion()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_MoyenDispersion' kind='elementOnly'"
 * @generated
 */
public interface TypeMoyenDispersion extends EObject {
	/**
	 * Returns the value of the '<em><b>Quantite Moyens Lancement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantite Moyens Lancement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite Moyens Lancement</em>' attribute.
	 * @see #isSetQuantiteMoyensLancement()
	 * @see #unsetQuantiteMoyensLancement()
	 * @see #setQuantiteMoyensLancement(long)
	 * @see mpia.schema.SchemaPackage#getTypeMoyenDispersion_QuantiteMoyensLancement()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3" required="true"
	 *        extendedMetaData="kind='element' name='QuantiteMoyensLancement'"
	 * @generated
	 */
	long getQuantiteMoyensLancement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyenDispersion#getQuantiteMoyensLancement <em>Quantite Moyens Lancement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite Moyens Lancement</em>' attribute.
	 * @see #isSetQuantiteMoyensLancement()
	 * @see #unsetQuantiteMoyensLancement()
	 * @see #getQuantiteMoyensLancement()
	 * @generated
	 */
	void setQuantiteMoyensLancement(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMoyenDispersion#getQuantiteMoyensLancement <em>Quantite Moyens Lancement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantiteMoyensLancement()
	 * @see #getQuantiteMoyensLancement()
	 * @see #setQuantiteMoyensLancement(long)
	 * @generated
	 */
	void unsetQuantiteMoyensLancement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMoyenDispersion#getQuantiteMoyensLancement <em>Quantite Moyens Lancement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantite Moyens Lancement</em>' attribute is set.
	 * @see #unsetQuantiteMoyensLancement()
	 * @see #getQuantiteMoyensLancement()
	 * @see #setQuantiteMoyensLancement(long)
	 * @generated
	 */
	boolean isSetQuantiteMoyensLancement();

	/**
	 * Returns the value of the '<em><b>Moyen Lancement Non Repertorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moyen Lancement Non Repertorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moyen Lancement Non Repertorie</em>' attribute.
	 * @see #setMoyenLancementNonRepertorie(String)
	 * @see mpia.schema.SchemaPackage#getTypeMoyenDispersion_MoyenLancementNonRepertorie()
	 * @model dataType="mpia.meta.TypeDataTypeChaine020"
	 *        extendedMetaData="kind='element' name='MoyenLancementNonRepertorie'"
	 * @generated
	 */
	String getMoyenLancementNonRepertorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyenDispersion#getMoyenLancementNonRepertorie <em>Moyen Lancement Non Repertorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moyen Lancement Non Repertorie</em>' attribute.
	 * @see #getMoyenLancementNonRepertorie()
	 * @generated
	 */
	void setMoyenLancementNonRepertorie(String value);

	/**
	 * Returns the value of the '<em><b>Moyen Lancement</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMoyenDispersionMoyenLancement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moyen Lancement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moyen Lancement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMoyenDispersionMoyenLancement
	 * @see #isSetMoyenLancement()
	 * @see #unsetMoyenLancement()
	 * @see #setMoyenLancement(TypeDictionaryDicoMoyenDispersionMoyenLancement)
	 * @see mpia.schema.SchemaPackage#getTypeMoyenDispersion_MoyenLancement()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='MoyenLancement'"
	 * @generated
	 */
	TypeDictionaryDicoMoyenDispersionMoyenLancement getMoyenLancement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyenDispersion#getMoyenLancement <em>Moyen Lancement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moyen Lancement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMoyenDispersionMoyenLancement
	 * @see #isSetMoyenLancement()
	 * @see #unsetMoyenLancement()
	 * @see #getMoyenLancement()
	 * @generated
	 */
	void setMoyenLancement(TypeDictionaryDicoMoyenDispersionMoyenLancement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMoyenDispersion#getMoyenLancement <em>Moyen Lancement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMoyenLancement()
	 * @see #getMoyenLancement()
	 * @see #setMoyenLancement(TypeDictionaryDicoMoyenDispersionMoyenLancement)
	 * @generated
	 */
	void unsetMoyenLancement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMoyenDispersion#getMoyenLancement <em>Moyen Lancement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Moyen Lancement</em>' attribute is set.
	 * @see #unsetMoyenLancement()
	 * @see #getMoyenLancement()
	 * @see #setMoyenLancement(TypeDictionaryDicoMoyenDispersionMoyenLancement)
	 * @generated
	 */
	boolean isSetMoyenLancement();

} // TypeMoyenDispersion
