/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeAngle;
import mpia.meta.TypeDataTypeVitesseLineaire;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Vent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeVent#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeVent#getDirection <em>Direction</em>}</li>
 *   <li>{@link mpia.schema.TypeVent#getVitesse <em>Vitesse</em>}</li>
 *   <li>{@link mpia.schema.TypeVent#getCoucheAltitude <em>Couche Altitude</em>}</li>
 *   <li>{@link mpia.schema.TypeVent#getStabiliteAir <em>Stabilite Air</em>}</li>
 *   <li>{@link mpia.schema.TypeVent#getTypePourNucleaire <em>Type Pour Nucleaire</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeVent()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_Vent' kind='elementOnly'"
 * @generated
 */
public interface TypeVent extends EObject {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoVentCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoVentCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoVentCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeVent_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoVentCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVent#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoVentCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoVentCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeVent#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoVentCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeVent#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoVentCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' containment reference.
	 * @see #setDirection(TypeDataTypeAngle)
	 * @see mpia.schema.SchemaPackage#getTypeVent_Direction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Direction'"
	 * @generated
	 */
	TypeDataTypeAngle getDirection();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVent#getDirection <em>Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' containment reference.
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(TypeDataTypeAngle value);

	/**
	 * Returns the value of the '<em><b>Vitesse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vitesse</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vitesse</em>' containment reference.
	 * @see #setVitesse(TypeDataTypeVitesseLineaire)
	 * @see mpia.schema.SchemaPackage#getTypeVent_Vitesse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Vitesse'"
	 * @generated
	 */
	TypeDataTypeVitesseLineaire getVitesse();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVent#getVitesse <em>Vitesse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vitesse</em>' containment reference.
	 * @see #getVitesse()
	 * @generated
	 */
	void setVitesse(TypeDataTypeVitesseLineaire value);

	/**
	 * Returns the value of the '<em><b>Couche Altitude</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoVentCoucheAltitude}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Couche Altitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Couche Altitude</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoVentCoucheAltitude
	 * @see #isSetCoucheAltitude()
	 * @see #unsetCoucheAltitude()
	 * @see #setCoucheAltitude(TypeDictionaryDicoVentCoucheAltitude)
	 * @see mpia.schema.SchemaPackage#getTypeVent_CoucheAltitude()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='CoucheAltitude'"
	 * @generated
	 */
	TypeDictionaryDicoVentCoucheAltitude getCoucheAltitude();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVent#getCoucheAltitude <em>Couche Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Couche Altitude</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoVentCoucheAltitude
	 * @see #isSetCoucheAltitude()
	 * @see #unsetCoucheAltitude()
	 * @see #getCoucheAltitude()
	 * @generated
	 */
	void setCoucheAltitude(TypeDictionaryDicoVentCoucheAltitude value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeVent#getCoucheAltitude <em>Couche Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCoucheAltitude()
	 * @see #getCoucheAltitude()
	 * @see #setCoucheAltitude(TypeDictionaryDicoVentCoucheAltitude)
	 * @generated
	 */
	void unsetCoucheAltitude();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeVent#getCoucheAltitude <em>Couche Altitude</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Couche Altitude</em>' attribute is set.
	 * @see #unsetCoucheAltitude()
	 * @see #getCoucheAltitude()
	 * @see #setCoucheAltitude(TypeDictionaryDicoVentCoucheAltitude)
	 * @generated
	 */
	boolean isSetCoucheAltitude();

	/**
	 * Returns the value of the '<em><b>Stabilite Air</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoVentStabiliteAir}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stabilite Air</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stabilite Air</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoVentStabiliteAir
	 * @see #isSetStabiliteAir()
	 * @see #unsetStabiliteAir()
	 * @see #setStabiliteAir(TypeDictionaryDicoVentStabiliteAir)
	 * @see mpia.schema.SchemaPackage#getTypeVent_StabiliteAir()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='StabiliteAir'"
	 * @generated
	 */
	TypeDictionaryDicoVentStabiliteAir getStabiliteAir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVent#getStabiliteAir <em>Stabilite Air</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stabilite Air</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoVentStabiliteAir
	 * @see #isSetStabiliteAir()
	 * @see #unsetStabiliteAir()
	 * @see #getStabiliteAir()
	 * @generated
	 */
	void setStabiliteAir(TypeDictionaryDicoVentStabiliteAir value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeVent#getStabiliteAir <em>Stabilite Air</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStabiliteAir()
	 * @see #getStabiliteAir()
	 * @see #setStabiliteAir(TypeDictionaryDicoVentStabiliteAir)
	 * @generated
	 */
	void unsetStabiliteAir();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeVent#getStabiliteAir <em>Stabilite Air</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stabilite Air</em>' attribute is set.
	 * @see #unsetStabiliteAir()
	 * @see #getStabiliteAir()
	 * @see #setStabiliteAir(TypeDictionaryDicoVentStabiliteAir)
	 * @generated
	 */
	boolean isSetStabiliteAir();

	/**
	 * Returns the value of the '<em><b>Type Pour Nucleaire</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPuissanceDetonation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Pour Nucleaire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Pour Nucleaire</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPuissanceDetonation
	 * @see #isSetTypePourNucleaire()
	 * @see #unsetTypePourNucleaire()
	 * @see #setTypePourNucleaire(TypeDictionaryDicoPuissanceDetonation)
	 * @see mpia.schema.SchemaPackage#getTypeVent_TypePourNucleaire()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypePourNucleaire'"
	 * @generated
	 */
	TypeDictionaryDicoPuissanceDetonation getTypePourNucleaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVent#getTypePourNucleaire <em>Type Pour Nucleaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Pour Nucleaire</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPuissanceDetonation
	 * @see #isSetTypePourNucleaire()
	 * @see #unsetTypePourNucleaire()
	 * @see #getTypePourNucleaire()
	 * @generated
	 */
	void setTypePourNucleaire(TypeDictionaryDicoPuissanceDetonation value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeVent#getTypePourNucleaire <em>Type Pour Nucleaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypePourNucleaire()
	 * @see #getTypePourNucleaire()
	 * @see #setTypePourNucleaire(TypeDictionaryDicoPuissanceDetonation)
	 * @generated
	 */
	void unsetTypePourNucleaire();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeVent#getTypePourNucleaire <em>Type Pour Nucleaire</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Pour Nucleaire</em>' attribute is set.
	 * @see #unsetTypePourNucleaire()
	 * @see #getTypePourNucleaire()
	 * @see #setTypePourNucleaire(TypeDictionaryDicoPuissanceDetonation)
	 * @generated
	 */
	boolean isSetTypePourNucleaire();

} // TypeVent
