/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeMasse;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Type Consommable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeTypeConsommable#isPerissabilite <em>Perissabilite</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeConsommable#getIdentificationProduitDangereux <em>Identification Produit Dangereux</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeConsommable#getRisque <em>Risque</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeConsommable#getPriorite <em>Priorite</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeConsommable#getConditionnement <em>Conditionnement</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeConsommable#getNomConditionnement <em>Nom Conditionnement</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeConsommable#getConditionnementQuantite <em>Conditionnement Quantite</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeConsommable#getConditionnementUnite <em>Conditionnement Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeConsommable#getConditionnementPoids <em>Conditionnement Poids</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeConsommable#getConditionnementRatio <em>Conditionnement Ratio</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeConsommable#isCalculEmport <em>Calcul Emport</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeConsommable#getEstConsommableMajeurAssociationConsommableMajeur <em>Est Consommable Majeur Association Consommable Majeur</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeConsommable#getEstObjetAssociationConsommation <em>Est Objet Association Consommation</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeTypeConsommable()
 * @model abstract="true"
 *        extendedMetaData="name='type_TypeConsommable' kind='elementOnly'"
 * @generated
 */
public interface TypeTypeConsommable extends TypeTypeMateriel {
	/**
	 * Returns the value of the '<em><b>Perissabilite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perissabilite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perissabilite</em>' attribute.
	 * @see #isSetPerissabilite()
	 * @see #unsetPerissabilite()
	 * @see #setPerissabilite(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeTypeConsommable_Perissabilite()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='Perissabilite'"
	 * @generated
	 */
	boolean isPerissabilite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeConsommable#isPerissabilite <em>Perissabilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perissabilite</em>' attribute.
	 * @see #isSetPerissabilite()
	 * @see #unsetPerissabilite()
	 * @see #isPerissabilite()
	 * @generated
	 */
	void setPerissabilite(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeConsommable#isPerissabilite <em>Perissabilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPerissabilite()
	 * @see #isPerissabilite()
	 * @see #setPerissabilite(boolean)
	 * @generated
	 */
	void unsetPerissabilite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeConsommable#isPerissabilite <em>Perissabilite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Perissabilite</em>' attribute is set.
	 * @see #unsetPerissabilite()
	 * @see #isPerissabilite()
	 * @see #setPerissabilite(boolean)
	 * @generated
	 */
	boolean isSetPerissabilite();

	/**
	 * Returns the value of the '<em><b>Identification Produit Dangereux</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeConsommableIdentificationProduitDangereux}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identification Produit Dangereux</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identification Produit Dangereux</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeConsommableIdentificationProduitDangereux
	 * @see #isSetIdentificationProduitDangereux()
	 * @see #unsetIdentificationProduitDangereux()
	 * @see #setIdentificationProduitDangereux(TypeDictionaryDicoTypeConsommableIdentificationProduitDangereux)
	 * @see mpia.schema.SchemaPackage#getTypeTypeConsommable_IdentificationProduitDangereux()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='IdentificationProduitDangereux'"
	 * @generated
	 */
	TypeDictionaryDicoTypeConsommableIdentificationProduitDangereux getIdentificationProduitDangereux();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeConsommable#getIdentificationProduitDangereux <em>Identification Produit Dangereux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identification Produit Dangereux</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeConsommableIdentificationProduitDangereux
	 * @see #isSetIdentificationProduitDangereux()
	 * @see #unsetIdentificationProduitDangereux()
	 * @see #getIdentificationProduitDangereux()
	 * @generated
	 */
	void setIdentificationProduitDangereux(TypeDictionaryDicoTypeConsommableIdentificationProduitDangereux value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeConsommable#getIdentificationProduitDangereux <em>Identification Produit Dangereux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIdentificationProduitDangereux()
	 * @see #getIdentificationProduitDangereux()
	 * @see #setIdentificationProduitDangereux(TypeDictionaryDicoTypeConsommableIdentificationProduitDangereux)
	 * @generated
	 */
	void unsetIdentificationProduitDangereux();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeConsommable#getIdentificationProduitDangereux <em>Identification Produit Dangereux</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Identification Produit Dangereux</em>' attribute is set.
	 * @see #unsetIdentificationProduitDangereux()
	 * @see #getIdentificationProduitDangereux()
	 * @see #setIdentificationProduitDangereux(TypeDictionaryDicoTypeConsommableIdentificationProduitDangereux)
	 * @generated
	 */
	boolean isSetIdentificationProduitDangereux();

	/**
	 * Returns the value of the '<em><b>Risque</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeConsommableRisque}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Risque</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Risque</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeConsommableRisque
	 * @see #isSetRisque()
	 * @see #unsetRisque()
	 * @see #setRisque(TypeDictionaryDicoTypeConsommableRisque)
	 * @see mpia.schema.SchemaPackage#getTypeTypeConsommable_Risque()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Risque'"
	 * @generated
	 */
	TypeDictionaryDicoTypeConsommableRisque getRisque();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeConsommable#getRisque <em>Risque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Risque</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeConsommableRisque
	 * @see #isSetRisque()
	 * @see #unsetRisque()
	 * @see #getRisque()
	 * @generated
	 */
	void setRisque(TypeDictionaryDicoTypeConsommableRisque value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeConsommable#getRisque <em>Risque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRisque()
	 * @see #getRisque()
	 * @see #setRisque(TypeDictionaryDicoTypeConsommableRisque)
	 * @generated
	 */
	void unsetRisque();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeConsommable#getRisque <em>Risque</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Risque</em>' attribute is set.
	 * @see #unsetRisque()
	 * @see #getRisque()
	 * @see #setRisque(TypeDictionaryDicoTypeConsommableRisque)
	 * @generated
	 */
	boolean isSetRisque();

	/**
	 * Returns the value of the '<em><b>Priorite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priorite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priorite</em>' attribute.
	 * @see #isSetPriorite()
	 * @see #unsetPriorite()
	 * @see #setPriorite(long)
	 * @see mpia.schema.SchemaPackage#getTypeTypeConsommable_Priorite()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='Priorite'"
	 * @generated
	 */
	long getPriorite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeConsommable#getPriorite <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priorite</em>' attribute.
	 * @see #isSetPriorite()
	 * @see #unsetPriorite()
	 * @see #getPriorite()
	 * @generated
	 */
	void setPriorite(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeConsommable#getPriorite <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPriorite()
	 * @see #getPriorite()
	 * @see #setPriorite(long)
	 * @generated
	 */
	void unsetPriorite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeConsommable#getPriorite <em>Priorite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Priorite</em>' attribute is set.
	 * @see #unsetPriorite()
	 * @see #getPriorite()
	 * @see #setPriorite(long)
	 * @generated
	 */
	boolean isSetPriorite();

	/**
	 * Returns the value of the '<em><b>Conditionnement</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCodeConditionnement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditionnement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditionnement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCodeConditionnement
	 * @see #isSetConditionnement()
	 * @see #unsetConditionnement()
	 * @see #setConditionnement(TypeDictionaryDicoCodeConditionnement)
	 * @see mpia.schema.SchemaPackage#getTypeTypeConsommable_Conditionnement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Conditionnement'"
	 * @generated
	 */
	TypeDictionaryDicoCodeConditionnement getConditionnement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeConsommable#getConditionnement <em>Conditionnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditionnement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCodeConditionnement
	 * @see #isSetConditionnement()
	 * @see #unsetConditionnement()
	 * @see #getConditionnement()
	 * @generated
	 */
	void setConditionnement(TypeDictionaryDicoCodeConditionnement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeConsommable#getConditionnement <em>Conditionnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConditionnement()
	 * @see #getConditionnement()
	 * @see #setConditionnement(TypeDictionaryDicoCodeConditionnement)
	 * @generated
	 */
	void unsetConditionnement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeConsommable#getConditionnement <em>Conditionnement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Conditionnement</em>' attribute is set.
	 * @see #unsetConditionnement()
	 * @see #getConditionnement()
	 * @see #setConditionnement(TypeDictionaryDicoCodeConditionnement)
	 * @generated
	 */
	boolean isSetConditionnement();

	/**
	 * Returns the value of the '<em><b>Nom Conditionnement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom Conditionnement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Conditionnement</em>' attribute.
	 * @see #setNomConditionnement(String)
	 * @see mpia.schema.SchemaPackage#getTypeTypeConsommable_NomConditionnement()
	 * @model dataType="mpia.meta.TypeDataTypeChaine020"
	 *        extendedMetaData="kind='element' name='NomConditionnement'"
	 * @generated
	 */
	String getNomConditionnement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeConsommable#getNomConditionnement <em>Nom Conditionnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Conditionnement</em>' attribute.
	 * @see #getNomConditionnement()
	 * @generated
	 */
	void setNomConditionnement(String value);

	/**
	 * Returns the value of the '<em><b>Conditionnement Quantite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditionnement Quantite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditionnement Quantite</em>' attribute.
	 * @see #isSetConditionnementQuantite()
	 * @see #unsetConditionnementQuantite()
	 * @see #setConditionnementQuantite(long)
	 * @see mpia.schema.SchemaPackage#getTypeTypeConsommable_ConditionnementQuantite()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier9"
	 *        extendedMetaData="kind='element' name='ConditionnementQuantite'"
	 * @generated
	 */
	long getConditionnementQuantite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeConsommable#getConditionnementQuantite <em>Conditionnement Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditionnement Quantite</em>' attribute.
	 * @see #isSetConditionnementQuantite()
	 * @see #unsetConditionnementQuantite()
	 * @see #getConditionnementQuantite()
	 * @generated
	 */
	void setConditionnementQuantite(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeConsommable#getConditionnementQuantite <em>Conditionnement Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConditionnementQuantite()
	 * @see #getConditionnementQuantite()
	 * @see #setConditionnementQuantite(long)
	 * @generated
	 */
	void unsetConditionnementQuantite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeConsommable#getConditionnementQuantite <em>Conditionnement Quantite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Conditionnement Quantite</em>' attribute is set.
	 * @see #unsetConditionnementQuantite()
	 * @see #getConditionnementQuantite()
	 * @see #setConditionnementQuantite(long)
	 * @generated
	 */
	boolean isSetConditionnementQuantite();

	/**
	 * Returns the value of the '<em><b>Conditionnement Unite</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoConditionnementUnite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditionnement Unite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditionnement Unite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoConditionnementUnite
	 * @see #isSetConditionnementUnite()
	 * @see #unsetConditionnementUnite()
	 * @see #setConditionnementUnite(TypeDictionaryDicoConditionnementUnite)
	 * @see mpia.schema.SchemaPackage#getTypeTypeConsommable_ConditionnementUnite()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ConditionnementUnite'"
	 * @generated
	 */
	TypeDictionaryDicoConditionnementUnite getConditionnementUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeConsommable#getConditionnementUnite <em>Conditionnement Unite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditionnement Unite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoConditionnementUnite
	 * @see #isSetConditionnementUnite()
	 * @see #unsetConditionnementUnite()
	 * @see #getConditionnementUnite()
	 * @generated
	 */
	void setConditionnementUnite(TypeDictionaryDicoConditionnementUnite value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeConsommable#getConditionnementUnite <em>Conditionnement Unite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConditionnementUnite()
	 * @see #getConditionnementUnite()
	 * @see #setConditionnementUnite(TypeDictionaryDicoConditionnementUnite)
	 * @generated
	 */
	void unsetConditionnementUnite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeConsommable#getConditionnementUnite <em>Conditionnement Unite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Conditionnement Unite</em>' attribute is set.
	 * @see #unsetConditionnementUnite()
	 * @see #getConditionnementUnite()
	 * @see #setConditionnementUnite(TypeDictionaryDicoConditionnementUnite)
	 * @generated
	 */
	boolean isSetConditionnementUnite();

	/**
	 * Returns the value of the '<em><b>Conditionnement Poids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditionnement Poids</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditionnement Poids</em>' containment reference.
	 * @see #setConditionnementPoids(TypeDataTypeMasse)
	 * @see mpia.schema.SchemaPackage#getTypeTypeConsommable_ConditionnementPoids()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ConditionnementPoids'"
	 * @generated
	 */
	TypeDataTypeMasse getConditionnementPoids();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeConsommable#getConditionnementPoids <em>Conditionnement Poids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditionnement Poids</em>' containment reference.
	 * @see #getConditionnementPoids()
	 * @generated
	 */
	void setConditionnementPoids(TypeDataTypeMasse value);

	/**
	 * Returns the value of the '<em><b>Conditionnement Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditionnement Ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditionnement Ratio</em>' attribute.
	 * @see #isSetConditionnementRatio()
	 * @see #unsetConditionnementRatio()
	 * @see #setConditionnementRatio(long)
	 * @see mpia.schema.SchemaPackage#getTypeTypeConsommable_ConditionnementRatio()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='ConditionnementRatio'"
	 * @generated
	 */
	long getConditionnementRatio();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeConsommable#getConditionnementRatio <em>Conditionnement Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditionnement Ratio</em>' attribute.
	 * @see #isSetConditionnementRatio()
	 * @see #unsetConditionnementRatio()
	 * @see #getConditionnementRatio()
	 * @generated
	 */
	void setConditionnementRatio(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeConsommable#getConditionnementRatio <em>Conditionnement Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConditionnementRatio()
	 * @see #getConditionnementRatio()
	 * @see #setConditionnementRatio(long)
	 * @generated
	 */
	void unsetConditionnementRatio();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeConsommable#getConditionnementRatio <em>Conditionnement Ratio</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Conditionnement Ratio</em>' attribute is set.
	 * @see #unsetConditionnementRatio()
	 * @see #getConditionnementRatio()
	 * @see #setConditionnementRatio(long)
	 * @generated
	 */
	boolean isSetConditionnementRatio();

	/**
	 * Returns the value of the '<em><b>Calcul Emport</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calcul Emport</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calcul Emport</em>' attribute.
	 * @see #isSetCalculEmport()
	 * @see #unsetCalculEmport()
	 * @see #setCalculEmport(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeTypeConsommable_CalculEmport()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='CalculEmport'"
	 * @generated
	 */
	boolean isCalculEmport();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeConsommable#isCalculEmport <em>Calcul Emport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calcul Emport</em>' attribute.
	 * @see #isSetCalculEmport()
	 * @see #unsetCalculEmport()
	 * @see #isCalculEmport()
	 * @generated
	 */
	void setCalculEmport(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeConsommable#isCalculEmport <em>Calcul Emport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCalculEmport()
	 * @see #isCalculEmport()
	 * @see #setCalculEmport(boolean)
	 * @generated
	 */
	void unsetCalculEmport();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeConsommable#isCalculEmport <em>Calcul Emport</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Calcul Emport</em>' attribute is set.
	 * @see #unsetCalculEmport()
	 * @see #isCalculEmport()
	 * @see #setCalculEmport(boolean)
	 * @generated
	 */
	boolean isSetCalculEmport();

	/**
	 * Returns the value of the '<em><b>Est Consommable Majeur Association Consommable Majeur</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Consommable Majeur Association Consommable Majeur</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Consommable Majeur Association Consommable Majeur</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeTypeConsommable_EstConsommableMajeurAssociationConsommableMajeur()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeTypeConsommable_TypeConsommable' target_entity='type_AssociationConsommablelMajeur'"
	 *        extendedMetaData="kind='element' name='EstConsommableMajeur_AssociationConsommableMajeur'"
	 * @generated
	 */
	EList<TypeAssociation> getEstConsommableMajeurAssociationConsommableMajeur();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Consommation</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Consommation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Consommation</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeTypeConsommable_EstObjetAssociationConsommation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeObjet_TypeConsommable' target_entity='type_AssociationConsommation'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationConsommation'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationConsommation();

} // TypeTypeConsommable
