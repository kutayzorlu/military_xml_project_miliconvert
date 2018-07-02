/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeDebitTransmission;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Etat Liaison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEtatLiaison#getEnPanne <em>En Panne</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatLiaison#getEtat <em>Etat</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatLiaison#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatLiaison#getTypeTraffic <em>Type Traffic</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatLiaison#getDebitMax <em>Debit Max</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatLiaison#getClassificationOTAN <em>Classification OTAN</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatLiaison#getMarquageSpecial <em>Marquage Special</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatLiaison#getBandeFrequence <em>Bande Frequence</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatLiaison#getQuantiteEquipement <em>Quantite Equipement</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatLiaison#isAffichagePanne <em>Affichage Panne</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatLiaison#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatLiaison#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatLiaison#getEstRapporteParRapport <em>Est Rapporte Par Rapport</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEtatLiaison()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_EtatLiaison' kind='elementOnly'"
 * @generated
 */
public interface TypeEtatLiaison extends EObject {
	/**
	 * Returns the value of the '<em><b>En Panne</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoThreeStates}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>En Panne</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>En Panne</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoThreeStates
	 * @see #isSetEnPanne()
	 * @see #unsetEnPanne()
	 * @see #setEnPanne(TypeDictionaryDicoThreeStates)
	 * @see mpia.schema.SchemaPackage#getTypeEtatLiaison_EnPanne()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EnPanne'"
	 * @generated
	 */
	TypeDictionaryDicoThreeStates getEnPanne();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatLiaison#getEnPanne <em>En Panne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>En Panne</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoThreeStates
	 * @see #isSetEnPanne()
	 * @see #unsetEnPanne()
	 * @see #getEnPanne()
	 * @generated
	 */
	void setEnPanne(TypeDictionaryDicoThreeStates value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatLiaison#getEnPanne <em>En Panne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnPanne()
	 * @see #getEnPanne()
	 * @see #setEnPanne(TypeDictionaryDicoThreeStates)
	 * @generated
	 */
	void unsetEnPanne();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatLiaison#getEnPanne <em>En Panne</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>En Panne</em>' attribute is set.
	 * @see #unsetEnPanne()
	 * @see #getEnPanne()
	 * @see #setEnPanne(TypeDictionaryDicoThreeStates)
	 * @generated
	 */
	boolean isSetEnPanne();

	/**
	 * Returns the value of the '<em><b>Etat</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoReseauTelecommunicationNiveauQualite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoReseauTelecommunicationNiveauQualite
	 * @see #isSetEtat()
	 * @see #unsetEtat()
	 * @see #setEtat(TypeDictionaryDicoReseauTelecommunicationNiveauQualite)
	 * @see mpia.schema.SchemaPackage#getTypeEtatLiaison_Etat()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Etat'"
	 * @generated
	 */
	TypeDictionaryDicoReseauTelecommunicationNiveauQualite getEtat();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatLiaison#getEtat <em>Etat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoReseauTelecommunicationNiveauQualite
	 * @see #isSetEtat()
	 * @see #unsetEtat()
	 * @see #getEtat()
	 * @generated
	 */
	void setEtat(TypeDictionaryDicoReseauTelecommunicationNiveauQualite value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatLiaison#getEtat <em>Etat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEtat()
	 * @see #getEtat()
	 * @see #setEtat(TypeDictionaryDicoReseauTelecommunicationNiveauQualite)
	 * @generated
	 */
	void unsetEtat();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatLiaison#getEtat <em>Etat</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Etat</em>' attribute is set.
	 * @see #unsetEtat()
	 * @see #getEtat()
	 * @see #setEtat(TypeDictionaryDicoReseauTelecommunicationNiveauQualite)
	 * @generated
	 */
	boolean isSetEtat();

	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatLiaisonCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatLiaisonCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoEtatLiaisonCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeEtatLiaison_Categorie()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoEtatLiaisonCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatLiaison#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatLiaisonCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoEtatLiaisonCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatLiaison#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoEtatLiaisonCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatLiaison#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoEtatLiaisonCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Type Traffic</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatLiaisonTypeTraffic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Traffic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Traffic</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatLiaisonTypeTraffic
	 * @see #isSetTypeTraffic()
	 * @see #unsetTypeTraffic()
	 * @see #setTypeTraffic(TypeDictionaryDicoEtatLiaisonTypeTraffic)
	 * @see mpia.schema.SchemaPackage#getTypeEtatLiaison_TypeTraffic()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeTraffic'"
	 * @generated
	 */
	TypeDictionaryDicoEtatLiaisonTypeTraffic getTypeTraffic();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatLiaison#getTypeTraffic <em>Type Traffic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Traffic</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatLiaisonTypeTraffic
	 * @see #isSetTypeTraffic()
	 * @see #unsetTypeTraffic()
	 * @see #getTypeTraffic()
	 * @generated
	 */
	void setTypeTraffic(TypeDictionaryDicoEtatLiaisonTypeTraffic value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatLiaison#getTypeTraffic <em>Type Traffic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeTraffic()
	 * @see #getTypeTraffic()
	 * @see #setTypeTraffic(TypeDictionaryDicoEtatLiaisonTypeTraffic)
	 * @generated
	 */
	void unsetTypeTraffic();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatLiaison#getTypeTraffic <em>Type Traffic</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Traffic</em>' attribute is set.
	 * @see #unsetTypeTraffic()
	 * @see #getTypeTraffic()
	 * @see #setTypeTraffic(TypeDictionaryDicoEtatLiaisonTypeTraffic)
	 * @generated
	 */
	boolean isSetTypeTraffic();

	/**
	 * Returns the value of the '<em><b>Debit Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debit Max</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debit Max</em>' containment reference.
	 * @see #setDebitMax(TypeDataTypeDebitTransmission)
	 * @see mpia.schema.SchemaPackage#getTypeEtatLiaison_DebitMax()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DebitMax'"
	 * @generated
	 */
	TypeDataTypeDebitTransmission getDebitMax();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatLiaison#getDebitMax <em>Debit Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debit Max</em>' containment reference.
	 * @see #getDebitMax()
	 * @generated
	 */
	void setDebitMax(TypeDataTypeDebitTransmission value);

	/**
	 * Returns the value of the '<em><b>Classification OTAN</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoConfidentialiteOTAN}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification OTAN</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification OTAN</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoConfidentialiteOTAN
	 * @see #isSetClassificationOTAN()
	 * @see #unsetClassificationOTAN()
	 * @see #setClassificationOTAN(TypeDictionaryDicoConfidentialiteOTAN)
	 * @see mpia.schema.SchemaPackage#getTypeEtatLiaison_ClassificationOTAN()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ClassificationOTAN'"
	 * @generated
	 */
	TypeDictionaryDicoConfidentialiteOTAN getClassificationOTAN();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatLiaison#getClassificationOTAN <em>Classification OTAN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification OTAN</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoConfidentialiteOTAN
	 * @see #isSetClassificationOTAN()
	 * @see #unsetClassificationOTAN()
	 * @see #getClassificationOTAN()
	 * @generated
	 */
	void setClassificationOTAN(TypeDictionaryDicoConfidentialiteOTAN value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatLiaison#getClassificationOTAN <em>Classification OTAN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClassificationOTAN()
	 * @see #getClassificationOTAN()
	 * @see #setClassificationOTAN(TypeDictionaryDicoConfidentialiteOTAN)
	 * @generated
	 */
	void unsetClassificationOTAN();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatLiaison#getClassificationOTAN <em>Classification OTAN</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Classification OTAN</em>' attribute is set.
	 * @see #unsetClassificationOTAN()
	 * @see #getClassificationOTAN()
	 * @see #setClassificationOTAN(TypeDictionaryDicoConfidentialiteOTAN)
	 * @generated
	 */
	boolean isSetClassificationOTAN();

	/**
	 * Returns the value of the '<em><b>Marquage Special</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatLiaisonMarquageSpecial}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marquage Special</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marquage Special</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatLiaisonMarquageSpecial
	 * @see #isSetMarquageSpecial()
	 * @see #unsetMarquageSpecial()
	 * @see #setMarquageSpecial(TypeDictionaryDicoEtatLiaisonMarquageSpecial)
	 * @see mpia.schema.SchemaPackage#getTypeEtatLiaison_MarquageSpecial()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='MarquageSpecial'"
	 * @generated
	 */
	TypeDictionaryDicoEtatLiaisonMarquageSpecial getMarquageSpecial();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatLiaison#getMarquageSpecial <em>Marquage Special</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marquage Special</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatLiaisonMarquageSpecial
	 * @see #isSetMarquageSpecial()
	 * @see #unsetMarquageSpecial()
	 * @see #getMarquageSpecial()
	 * @generated
	 */
	void setMarquageSpecial(TypeDictionaryDicoEtatLiaisonMarquageSpecial value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatLiaison#getMarquageSpecial <em>Marquage Special</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMarquageSpecial()
	 * @see #getMarquageSpecial()
	 * @see #setMarquageSpecial(TypeDictionaryDicoEtatLiaisonMarquageSpecial)
	 * @generated
	 */
	void unsetMarquageSpecial();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatLiaison#getMarquageSpecial <em>Marquage Special</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Marquage Special</em>' attribute is set.
	 * @see #unsetMarquageSpecial()
	 * @see #getMarquageSpecial()
	 * @see #setMarquageSpecial(TypeDictionaryDicoEtatLiaisonMarquageSpecial)
	 * @generated
	 */
	boolean isSetMarquageSpecial();

	/**
	 * Returns the value of the '<em><b>Bande Frequence</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoFrequenceBandeFrequence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bande Frequence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bande Frequence</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoFrequenceBandeFrequence
	 * @see #isSetBandeFrequence()
	 * @see #unsetBandeFrequence()
	 * @see #setBandeFrequence(TypeDictionaryDicoFrequenceBandeFrequence)
	 * @see mpia.schema.SchemaPackage#getTypeEtatLiaison_BandeFrequence()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='BandeFrequence'"
	 * @generated
	 */
	TypeDictionaryDicoFrequenceBandeFrequence getBandeFrequence();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatLiaison#getBandeFrequence <em>Bande Frequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bande Frequence</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoFrequenceBandeFrequence
	 * @see #isSetBandeFrequence()
	 * @see #unsetBandeFrequence()
	 * @see #getBandeFrequence()
	 * @generated
	 */
	void setBandeFrequence(TypeDictionaryDicoFrequenceBandeFrequence value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatLiaison#getBandeFrequence <em>Bande Frequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBandeFrequence()
	 * @see #getBandeFrequence()
	 * @see #setBandeFrequence(TypeDictionaryDicoFrequenceBandeFrequence)
	 * @generated
	 */
	void unsetBandeFrequence();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatLiaison#getBandeFrequence <em>Bande Frequence</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bande Frequence</em>' attribute is set.
	 * @see #unsetBandeFrequence()
	 * @see #getBandeFrequence()
	 * @see #setBandeFrequence(TypeDictionaryDicoFrequenceBandeFrequence)
	 * @generated
	 */
	boolean isSetBandeFrequence();

	/**
	 * Returns the value of the '<em><b>Quantite Equipement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantite Equipement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite Equipement</em>' attribute.
	 * @see #isSetQuantiteEquipement()
	 * @see #unsetQuantiteEquipement()
	 * @see #setQuantiteEquipement(long)
	 * @see mpia.schema.SchemaPackage#getTypeEtatLiaison_QuantiteEquipement()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='QuantiteEquipement'"
	 * @generated
	 */
	long getQuantiteEquipement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatLiaison#getQuantiteEquipement <em>Quantite Equipement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite Equipement</em>' attribute.
	 * @see #isSetQuantiteEquipement()
	 * @see #unsetQuantiteEquipement()
	 * @see #getQuantiteEquipement()
	 * @generated
	 */
	void setQuantiteEquipement(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatLiaison#getQuantiteEquipement <em>Quantite Equipement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantiteEquipement()
	 * @see #getQuantiteEquipement()
	 * @see #setQuantiteEquipement(long)
	 * @generated
	 */
	void unsetQuantiteEquipement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatLiaison#getQuantiteEquipement <em>Quantite Equipement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantite Equipement</em>' attribute is set.
	 * @see #unsetQuantiteEquipement()
	 * @see #getQuantiteEquipement()
	 * @see #setQuantiteEquipement(long)
	 * @generated
	 */
	boolean isSetQuantiteEquipement();

	/**
	 * Returns the value of the '<em><b>Affichage Panne</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Affichage Panne</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affichage Panne</em>' attribute.
	 * @see #isSetAffichagePanne()
	 * @see #unsetAffichagePanne()
	 * @see #setAffichagePanne(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeEtatLiaison_AffichagePanne()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='AffichagePanne'"
	 * @generated
	 */
	boolean isAffichagePanne();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatLiaison#isAffichagePanne <em>Affichage Panne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affichage Panne</em>' attribute.
	 * @see #isSetAffichagePanne()
	 * @see #unsetAffichagePanne()
	 * @see #isAffichagePanne()
	 * @generated
	 */
	void setAffichagePanne(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatLiaison#isAffichagePanne <em>Affichage Panne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAffichagePanne()
	 * @see #isAffichagePanne()
	 * @see #setAffichagePanne(boolean)
	 * @generated
	 */
	void unsetAffichagePanne();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatLiaison#isAffichagePanne <em>Affichage Panne</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Affichage Panne</em>' attribute is set.
	 * @see #unsetAffichagePanne()
	 * @see #isAffichagePanne()
	 * @see #setAffichagePanne(boolean)
	 * @generated
	 */
	boolean isSetAffichagePanne();

	/**
	 * Returns the value of the '<em><b>CTE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CTE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CTE</em>' attribute.
	 * @see #setCTE(String)
	 * @see mpia.schema.SchemaPackage#getTypeEtatLiaison_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatLiaison#getCTE <em>CTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CTE</em>' attribute.
	 * @see #getCTE()
	 * @generated
	 */
	void setCTE(String value);

	/**
	 * Returns the value of the '<em><b>CE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CE</em>' attribute.
	 * @see #setCE(String)
	 * @see mpia.schema.SchemaPackage#getTypeEtatLiaison_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatLiaison#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Est Rapporte Par Rapport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Rapporte Par Rapport</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Rapporte Par Rapport</em>' containment reference.
	 * @see #setEstRapporteParRapport(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeEtatLiaison_EstRapporteParRapport()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Rapport'"
	 *        extendedMetaData="kind='element' name='EstRapportePar_Rapport'"
	 * @generated
	 */
	TypeAssociation getEstRapporteParRapport();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatLiaison#getEstRapporteParRapport <em>Est Rapporte Par Rapport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Rapporte Par Rapport</em>' containment reference.
	 * @see #getEstRapporteParRapport()
	 * @generated
	 */
	void setEstRapporteParRapport(TypeAssociation value);

} // TypeEtatLiaison
