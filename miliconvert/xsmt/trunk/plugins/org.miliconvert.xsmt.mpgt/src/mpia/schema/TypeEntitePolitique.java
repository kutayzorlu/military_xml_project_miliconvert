/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Entite Politique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEntitePolitique#getTrigramme <em>Trigramme</em>}</li>
 *   <li>{@link mpia.schema.TypeEntitePolitique#getNationaliteBigramme <em>Nationalite Bigramme</em>}</li>
 *   <li>{@link mpia.schema.TypeEntitePolitique#getAPourComportementComportement <em>APour Comportement Comportement</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEntitePolitique()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_EntitePolitique' kind='elementOnly'"
 * @generated
 */
public interface TypeEntitePolitique extends TypeAffiliation {
	/**
	 * Returns the value of the '<em><b>Trigramme</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEntitePolitiqueTrigramme}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigramme</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigramme</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEntitePolitiqueTrigramme
	 * @see #isSetTrigramme()
	 * @see #unsetTrigramme()
	 * @see #setTrigramme(TypeDictionaryDicoEntitePolitiqueTrigramme)
	 * @see mpia.schema.SchemaPackage#getTypeEntitePolitique_Trigramme()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Trigramme'"
	 * @generated
	 */
	TypeDictionaryDicoEntitePolitiqueTrigramme getTrigramme();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEntitePolitique#getTrigramme <em>Trigramme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigramme</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEntitePolitiqueTrigramme
	 * @see #isSetTrigramme()
	 * @see #unsetTrigramme()
	 * @see #getTrigramme()
	 * @generated
	 */
	void setTrigramme(TypeDictionaryDicoEntitePolitiqueTrigramme value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEntitePolitique#getTrigramme <em>Trigramme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTrigramme()
	 * @see #getTrigramme()
	 * @see #setTrigramme(TypeDictionaryDicoEntitePolitiqueTrigramme)
	 * @generated
	 */
	void unsetTrigramme();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEntitePolitique#getTrigramme <em>Trigramme</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Trigramme</em>' attribute is set.
	 * @see #unsetTrigramme()
	 * @see #getTrigramme()
	 * @see #setTrigramme(TypeDictionaryDicoEntitePolitiqueTrigramme)
	 * @generated
	 */
	boolean isSetTrigramme();

	/**
	 * Returns the value of the '<em><b>Nationalite Bigramme</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEntitePolitiqueNationaliteBigramme}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nationalite Bigramme</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nationalite Bigramme</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEntitePolitiqueNationaliteBigramme
	 * @see #isSetNationaliteBigramme()
	 * @see #unsetNationaliteBigramme()
	 * @see #setNationaliteBigramme(TypeDictionaryDicoEntitePolitiqueNationaliteBigramme)
	 * @see mpia.schema.SchemaPackage#getTypeEntitePolitique_NationaliteBigramme()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='NationaliteBigramme'"
	 * @generated
	 */
	TypeDictionaryDicoEntitePolitiqueNationaliteBigramme getNationaliteBigramme();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEntitePolitique#getNationaliteBigramme <em>Nationalite Bigramme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nationalite Bigramme</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEntitePolitiqueNationaliteBigramme
	 * @see #isSetNationaliteBigramme()
	 * @see #unsetNationaliteBigramme()
	 * @see #getNationaliteBigramme()
	 * @generated
	 */
	void setNationaliteBigramme(TypeDictionaryDicoEntitePolitiqueNationaliteBigramme value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEntitePolitique#getNationaliteBigramme <em>Nationalite Bigramme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNationaliteBigramme()
	 * @see #getNationaliteBigramme()
	 * @see #setNationaliteBigramme(TypeDictionaryDicoEntitePolitiqueNationaliteBigramme)
	 * @generated
	 */
	void unsetNationaliteBigramme();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEntitePolitique#getNationaliteBigramme <em>Nationalite Bigramme</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nationalite Bigramme</em>' attribute is set.
	 * @see #unsetNationaliteBigramme()
	 * @see #getNationaliteBigramme()
	 * @see #setNationaliteBigramme(TypeDictionaryDicoEntitePolitiqueNationaliteBigramme)
	 * @generated
	 */
	boolean isSetNationaliteBigramme();

	/**
	 * Returns the value of the '<em><b>APour Comportement Comportement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeComportement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Comportement Comportement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Comportement Comportement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEntitePolitique_APourComportementComportement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Comportement'"
	 *        extendedMetaData="kind='element' name='APourComportement_Comportement'"
	 * @generated
	 */
	EList<TypeComportement> getAPourComportementComportement();

} // TypeEntitePolitique
