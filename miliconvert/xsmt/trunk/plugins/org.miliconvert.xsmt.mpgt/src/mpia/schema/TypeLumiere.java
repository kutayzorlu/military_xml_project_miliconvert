/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeDateHeure;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Lumiere</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeLumiere#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeLumiere#getDebutPeriode <em>Debut Periode</em>}</li>
 *   <li>{@link mpia.schema.TypeLumiere#getFinPeriode <em>Fin Periode</em>}</li>
 *   <li>{@link mpia.schema.TypeLumiere#getPhaseLune <em>Phase Lune</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeLumiere()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_Lumiere' kind='elementOnly'"
 * @generated
 */
public interface TypeLumiere extends EObject {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoLumiereCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoLumiereCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoLumiereCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeLumiere_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoLumiereCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLumiere#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoLumiereCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoLumiereCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeLumiere#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoLumiereCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeLumiere#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoLumiereCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Debut Periode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debut Periode</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debut Periode</em>' containment reference.
	 * @see #setDebutPeriode(TypeDataTypeDateHeure)
	 * @see mpia.schema.SchemaPackage#getTypeLumiere_DebutPeriode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DebutPeriode'"
	 * @generated
	 */
	TypeDataTypeDateHeure getDebutPeriode();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLumiere#getDebutPeriode <em>Debut Periode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debut Periode</em>' containment reference.
	 * @see #getDebutPeriode()
	 * @generated
	 */
	void setDebutPeriode(TypeDataTypeDateHeure value);

	/**
	 * Returns the value of the '<em><b>Fin Periode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fin Periode</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin Periode</em>' containment reference.
	 * @see #setFinPeriode(TypeDataTypeDateHeure)
	 * @see mpia.schema.SchemaPackage#getTypeLumiere_FinPeriode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FinPeriode'"
	 * @generated
	 */
	TypeDataTypeDateHeure getFinPeriode();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLumiere#getFinPeriode <em>Fin Periode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin Periode</em>' containment reference.
	 * @see #getFinPeriode()
	 * @generated
	 */
	void setFinPeriode(TypeDataTypeDateHeure value);

	/**
	 * Returns the value of the '<em><b>Phase Lune</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoLumierePhaseLune}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Lune</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Lune</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoLumierePhaseLune
	 * @see #isSetPhaseLune()
	 * @see #unsetPhaseLune()
	 * @see #setPhaseLune(TypeDictionaryDicoLumierePhaseLune)
	 * @see mpia.schema.SchemaPackage#getTypeLumiere_PhaseLune()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='PhaseLune'"
	 * @generated
	 */
	TypeDictionaryDicoLumierePhaseLune getPhaseLune();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLumiere#getPhaseLune <em>Phase Lune</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Lune</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoLumierePhaseLune
	 * @see #isSetPhaseLune()
	 * @see #unsetPhaseLune()
	 * @see #getPhaseLune()
	 * @generated
	 */
	void setPhaseLune(TypeDictionaryDicoLumierePhaseLune value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeLumiere#getPhaseLune <em>Phase Lune</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPhaseLune()
	 * @see #getPhaseLune()
	 * @see #setPhaseLune(TypeDictionaryDicoLumierePhaseLune)
	 * @generated
	 */
	void unsetPhaseLune();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeLumiere#getPhaseLune <em>Phase Lune</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Phase Lune</em>' attribute is set.
	 * @see #unsetPhaseLune()
	 * @see #getPhaseLune()
	 * @see #setPhaseLune(TypeDictionaryDicoLumierePhaseLune)
	 * @generated
	 */
	boolean isSetPhaseLune();

} // TypeLumiere
