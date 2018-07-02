/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeLongueur;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Couverture Nuageuse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCouvertureNuageuse#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeCouvertureNuageuse#getDensiteMoyenne <em>Densite Moyenne</em>}</li>
 *   <li>{@link mpia.schema.TypeCouvertureNuageuse#getDistanceMinimaleBase <em>Distance Minimale Base</em>}</li>
 *   <li>{@link mpia.schema.TypeCouvertureNuageuse#getDistanceMaximale <em>Distance Maximale</em>}</li>
 *   <li>{@link mpia.schema.TypeCouvertureNuageuse#getTauxRefraction <em>Taux Refraction</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCouvertureNuageuse()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_CouvertureNuageuse' kind='elementOnly'"
 * @generated
 */
public interface TypeCouvertureNuageuse extends EObject {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCouvertureNuageuseCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCouvertureNuageuseCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoCouvertureNuageuseCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeCouvertureNuageuse_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoCouvertureNuageuseCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCouvertureNuageuse#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCouvertureNuageuseCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoCouvertureNuageuseCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCouvertureNuageuse#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoCouvertureNuageuseCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCouvertureNuageuse#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoCouvertureNuageuseCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Densite Moyenne</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCouvertureNuageuseDensiteMoyenne}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Densite Moyenne</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Densite Moyenne</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCouvertureNuageuseDensiteMoyenne
	 * @see #isSetDensiteMoyenne()
	 * @see #unsetDensiteMoyenne()
	 * @see #setDensiteMoyenne(TypeDictionaryDicoCouvertureNuageuseDensiteMoyenne)
	 * @see mpia.schema.SchemaPackage#getTypeCouvertureNuageuse_DensiteMoyenne()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='DensiteMoyenne'"
	 * @generated
	 */
	TypeDictionaryDicoCouvertureNuageuseDensiteMoyenne getDensiteMoyenne();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCouvertureNuageuse#getDensiteMoyenne <em>Densite Moyenne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Densite Moyenne</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCouvertureNuageuseDensiteMoyenne
	 * @see #isSetDensiteMoyenne()
	 * @see #unsetDensiteMoyenne()
	 * @see #getDensiteMoyenne()
	 * @generated
	 */
	void setDensiteMoyenne(TypeDictionaryDicoCouvertureNuageuseDensiteMoyenne value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCouvertureNuageuse#getDensiteMoyenne <em>Densite Moyenne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDensiteMoyenne()
	 * @see #getDensiteMoyenne()
	 * @see #setDensiteMoyenne(TypeDictionaryDicoCouvertureNuageuseDensiteMoyenne)
	 * @generated
	 */
	void unsetDensiteMoyenne();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCouvertureNuageuse#getDensiteMoyenne <em>Densite Moyenne</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Densite Moyenne</em>' attribute is set.
	 * @see #unsetDensiteMoyenne()
	 * @see #getDensiteMoyenne()
	 * @see #setDensiteMoyenne(TypeDictionaryDicoCouvertureNuageuseDensiteMoyenne)
	 * @generated
	 */
	boolean isSetDensiteMoyenne();

	/**
	 * Returns the value of the '<em><b>Distance Minimale Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance Minimale Base</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance Minimale Base</em>' containment reference.
	 * @see #setDistanceMinimaleBase(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeCouvertureNuageuse_DistanceMinimaleBase()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DistanceMinimaleBase'"
	 * @generated
	 */
	TypeDataTypeLongueur getDistanceMinimaleBase();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCouvertureNuageuse#getDistanceMinimaleBase <em>Distance Minimale Base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance Minimale Base</em>' containment reference.
	 * @see #getDistanceMinimaleBase()
	 * @generated
	 */
	void setDistanceMinimaleBase(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Distance Maximale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance Maximale</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance Maximale</em>' containment reference.
	 * @see #setDistanceMaximale(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeCouvertureNuageuse_DistanceMaximale()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DistanceMaximale'"
	 * @generated
	 */
	TypeDataTypeLongueur getDistanceMaximale();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCouvertureNuageuse#getDistanceMaximale <em>Distance Maximale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance Maximale</em>' containment reference.
	 * @see #getDistanceMaximale()
	 * @generated
	 */
	void setDistanceMaximale(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Taux Refraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Taux Refraction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taux Refraction</em>' attribute.
	 * @see #isSetTauxRefraction()
	 * @see #unsetTauxRefraction()
	 * @see #setTauxRefraction(double)
	 * @see mpia.schema.SchemaPackage#getTypeCouvertureNuageuse_TauxRefraction()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeFraction"
	 *        extendedMetaData="kind='element' name='TauxRefraction'"
	 * @generated
	 */
	double getTauxRefraction();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCouvertureNuageuse#getTauxRefraction <em>Taux Refraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taux Refraction</em>' attribute.
	 * @see #isSetTauxRefraction()
	 * @see #unsetTauxRefraction()
	 * @see #getTauxRefraction()
	 * @generated
	 */
	void setTauxRefraction(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCouvertureNuageuse#getTauxRefraction <em>Taux Refraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTauxRefraction()
	 * @see #getTauxRefraction()
	 * @see #setTauxRefraction(double)
	 * @generated
	 */
	void unsetTauxRefraction();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCouvertureNuageuse#getTauxRefraction <em>Taux Refraction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Taux Refraction</em>' attribute is set.
	 * @see #unsetTauxRefraction()
	 * @see #getTauxRefraction()
	 * @see #setTauxRefraction(double)
	 * @generated
	 */
	boolean isSetTauxRefraction();

} // TypeCouvertureNuageuse
