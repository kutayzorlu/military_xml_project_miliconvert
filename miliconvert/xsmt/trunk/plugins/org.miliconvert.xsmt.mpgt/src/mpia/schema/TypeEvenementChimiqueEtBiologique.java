/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeLongueur;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Evenement Chimique Et Biologique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEvenementChimiqueEtBiologique#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenementChimiqueEtBiologique#getEparpillement <em>Eparpillement</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenementChimiqueEtBiologique#getHauteurRejet <em>Hauteur Rejet</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEvenementChimiqueEtBiologique()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_EvenementChimiqueEtBiologique' kind='elementOnly'"
 * @generated
 */
public interface TypeEvenementChimiqueEtBiologique extends TypeEvenementNRBC {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEvenementChimiqueEtBiologiqueCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEvenementChimiqueEtBiologiqueCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoEvenementChimiqueEtBiologiqueCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeEvenementChimiqueEtBiologique_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoEvenementChimiqueEtBiologiqueCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvenementChimiqueEtBiologique#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEvenementChimiqueEtBiologiqueCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoEvenementChimiqueEtBiologiqueCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEvenementChimiqueEtBiologique#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoEvenementChimiqueEtBiologiqueCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEvenementChimiqueEtBiologique#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoEvenementChimiqueEtBiologiqueCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Eparpillement</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEvenementChimiqueEtBiologiqueEparpillement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eparpillement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eparpillement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEvenementChimiqueEtBiologiqueEparpillement
	 * @see #isSetEparpillement()
	 * @see #unsetEparpillement()
	 * @see #setEparpillement(TypeDictionaryDicoEvenementChimiqueEtBiologiqueEparpillement)
	 * @see mpia.schema.SchemaPackage#getTypeEvenementChimiqueEtBiologique_Eparpillement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Eparpillement'"
	 * @generated
	 */
	TypeDictionaryDicoEvenementChimiqueEtBiologiqueEparpillement getEparpillement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvenementChimiqueEtBiologique#getEparpillement <em>Eparpillement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eparpillement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEvenementChimiqueEtBiologiqueEparpillement
	 * @see #isSetEparpillement()
	 * @see #unsetEparpillement()
	 * @see #getEparpillement()
	 * @generated
	 */
	void setEparpillement(TypeDictionaryDicoEvenementChimiqueEtBiologiqueEparpillement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEvenementChimiqueEtBiologique#getEparpillement <em>Eparpillement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEparpillement()
	 * @see #getEparpillement()
	 * @see #setEparpillement(TypeDictionaryDicoEvenementChimiqueEtBiologiqueEparpillement)
	 * @generated
	 */
	void unsetEparpillement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEvenementChimiqueEtBiologique#getEparpillement <em>Eparpillement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Eparpillement</em>' attribute is set.
	 * @see #unsetEparpillement()
	 * @see #getEparpillement()
	 * @see #setEparpillement(TypeDictionaryDicoEvenementChimiqueEtBiologiqueEparpillement)
	 * @generated
	 */
	boolean isSetEparpillement();

	/**
	 * Returns the value of the '<em><b>Hauteur Rejet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hauteur Rejet</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hauteur Rejet</em>' containment reference.
	 * @see #setHauteurRejet(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeEvenementChimiqueEtBiologique_HauteurRejet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='HauteurRejet'"
	 * @generated
	 */
	TypeDataTypeLongueur getHauteurRejet();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvenementChimiqueEtBiologique#getHauteurRejet <em>Hauteur Rejet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hauteur Rejet</em>' containment reference.
	 * @see #getHauteurRejet()
	 * @generated
	 */
	void setHauteurRejet(TypeDataTypeLongueur value);

} // TypeEvenementChimiqueEtBiologique
