/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeDataTypeDoseAbsorbee;
import mpia.meta.TypeDataTypeDuree;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Etat Operationnel Entite Organisationnelle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getEtatOperationnel <em>Etat Operationnel</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getQualificatifEtat <em>Qualificatif Etat</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getFonctionPC <em>Fonction PC</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getEchelon <em>Echelon</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getDisponibilite <em>Disponibilite</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getGDHDisponibilite <em>GDH Disponibilite</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getEtatEngagement <em>Etat Engagement</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getActivation <em>Activation</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getGDHdebutActivation <em>GD Hdebut Activation</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getGDHfinActivation <em>GD Hfin Activation</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getEtatFormation <em>Etat Formation</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getAutreEtatFormation <em>Autre Etat Formation</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getEtatDeploiement <em>Etat Deploiement</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getAutreDeploiement <em>Autre Deploiement</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getEtatCapteur <em>Etat Capteur</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getTempsReponse <em>Temps Reponse</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getEntrainement <em>Entrainement</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getRenforcement <em>Renforcement</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#isReserve <em>Reserve</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getConsigneTir <em>Consigne Tir</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getProtectionNRBC <em>Protection NRBC</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getDoseRadiation <em>Dose Radiation</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getNiveauAlerte <em>Niveau Alerte</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getStatutLogistique <em>Statut Logistique</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getEtatPersonnel <em>Etat Personnel</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getFatiguePersonnel <em>Fatigue Personnel</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getEtatEquipements <em>Etat Equipements</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getEtatMunitions <em>Etat Munitions</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getEtatCarburants <em>Etat Carburants</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getPointRendezVous <em>Point Rendez Vous</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getPointsOuPCFleche <em>Points Ou PC Fleche</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getAPourCaracteristiqueGroupeIndividusCaracteristiqueGroupeIndividus <em>APour Caracteristique Groupe Individus Caracteristique Groupe Individus</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelEntiteOrganisationnelle()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_EtatOperationnelEntiteOrganisationnelle' kind='elementOnly'"
 * @generated
 */
public interface TypeEtatOperationnelEntiteOrganisationnelle extends TypeEtatOperationnel {
	/**
	 * Returns the value of the '<em><b>Etat Operationnel</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOperationnel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Operationnel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Operationnel</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnel
	 * @see #isSetEtatOperationnel()
	 * @see #unsetEtatOperationnel()
	 * @see #setEtatOperationnel(TypeDictionaryDicoEtatOperationnel)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelEntiteOrganisationnelle_EtatOperationnel()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EtatOperationnel'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnel getEtatOperationnel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getEtatOperationnel <em>Etat Operationnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Operationnel</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnel
	 * @see #isSetEtatOperationnel()
	 * @see #unsetEtatOperationnel()
	 * @see #getEtatOperationnel()
	 * @generated
	 */
	void setEtatOperationnel(TypeDictionaryDicoEtatOperationnel value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getEtatOperationnel <em>Etat Operationnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEtatOperationnel()
	 * @see #getEtatOperationnel()
	 * @see #setEtatOperationnel(TypeDictionaryDicoEtatOperationnel)
	 * @generated
	 */
	void unsetEtatOperationnel();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getEtatOperationnel <em>Etat Operationnel</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Etat Operationnel</em>' attribute is set.
	 * @see #unsetEtatOperationnel()
	 * @see #getEtatOperationnel()
	 * @see #setEtatOperationnel(TypeDictionaryDicoEtatOperationnel)
	 * @generated
	 */
	boolean isSetEtatOperationnel();

	/**
	 * Returns the value of the '<em><b>Qualificatif Etat</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleQualificatifEtat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualificatif Etat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualificatif Etat</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleQualificatifEtat
	 * @see #isSetQualificatifEtat()
	 * @see #unsetQualificatifEtat()
	 * @see #setQualificatifEtat(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleQualificatifEtat)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelEntiteOrganisationnelle_QualificatifEtat()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='QualificatifEtat'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleQualificatifEtat getQualificatifEtat();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getQualificatifEtat <em>Qualificatif Etat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualificatif Etat</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleQualificatifEtat
	 * @see #isSetQualificatifEtat()
	 * @see #unsetQualificatifEtat()
	 * @see #getQualificatifEtat()
	 * @generated
	 */
	void setQualificatifEtat(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleQualificatifEtat value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getQualificatifEtat <em>Qualificatif Etat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQualificatifEtat()
	 * @see #getQualificatifEtat()
	 * @see #setQualificatifEtat(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleQualificatifEtat)
	 * @generated
	 */
	void unsetQualificatifEtat();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getQualificatifEtat <em>Qualificatif Etat</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Qualificatif Etat</em>' attribute is set.
	 * @see #unsetQualificatifEtat()
	 * @see #getQualificatifEtat()
	 * @see #setQualificatifEtat(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleQualificatifEtat)
	 * @generated
	 */
	boolean isSetQualificatifEtat();

	/**
	 * Returns the value of the '<em><b>Fonction PC</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleFonctionPC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fonction PC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fonction PC</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleFonctionPC
	 * @see #isSetFonctionPC()
	 * @see #unsetFonctionPC()
	 * @see #setFonctionPC(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleFonctionPC)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelEntiteOrganisationnelle_FonctionPC()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='FonctionPC'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleFonctionPC getFonctionPC();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getFonctionPC <em>Fonction PC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fonction PC</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleFonctionPC
	 * @see #isSetFonctionPC()
	 * @see #unsetFonctionPC()
	 * @see #getFonctionPC()
	 * @generated
	 */
	void setFonctionPC(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleFonctionPC value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getFonctionPC <em>Fonction PC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFonctionPC()
	 * @see #getFonctionPC()
	 * @see #setFonctionPC(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleFonctionPC)
	 * @generated
	 */
	void unsetFonctionPC();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getFonctionPC <em>Fonction PC</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fonction PC</em>' attribute is set.
	 * @see #unsetFonctionPC()
	 * @see #getFonctionPC()
	 * @see #setFonctionPC(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleFonctionPC)
	 * @generated
	 */
	boolean isSetFonctionPC();

	/**
	 * Returns the value of the '<em><b>Echelon</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEchelon}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Echelon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Echelon</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEchelon
	 * @see #isSetEchelon()
	 * @see #unsetEchelon()
	 * @see #setEchelon(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEchelon)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelEntiteOrganisationnelle_Echelon()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Echelon'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEchelon getEchelon();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getEchelon <em>Echelon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Echelon</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEchelon
	 * @see #isSetEchelon()
	 * @see #unsetEchelon()
	 * @see #getEchelon()
	 * @generated
	 */
	void setEchelon(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEchelon value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getEchelon <em>Echelon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEchelon()
	 * @see #getEchelon()
	 * @see #setEchelon(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEchelon)
	 * @generated
	 */
	void unsetEchelon();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getEchelon <em>Echelon</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Echelon</em>' attribute is set.
	 * @see #unsetEchelon()
	 * @see #getEchelon()
	 * @see #setEchelon(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEchelon)
	 * @generated
	 */
	boolean isSetEchelon();

	/**
	 * Returns the value of the '<em><b>Disponibilite</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleDisponibilite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disponibilite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disponibilite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleDisponibilite
	 * @see #isSetDisponibilite()
	 * @see #unsetDisponibilite()
	 * @see #setDisponibilite(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleDisponibilite)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelEntiteOrganisationnelle_Disponibilite()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Disponibilite'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleDisponibilite getDisponibilite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getDisponibilite <em>Disponibilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disponibilite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleDisponibilite
	 * @see #isSetDisponibilite()
	 * @see #unsetDisponibilite()
	 * @see #getDisponibilite()
	 * @generated
	 */
	void setDisponibilite(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleDisponibilite value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getDisponibilite <em>Disponibilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisponibilite()
	 * @see #getDisponibilite()
	 * @see #setDisponibilite(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleDisponibilite)
	 * @generated
	 */
	void unsetDisponibilite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getDisponibilite <em>Disponibilite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Disponibilite</em>' attribute is set.
	 * @see #unsetDisponibilite()
	 * @see #getDisponibilite()
	 * @see #setDisponibilite(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleDisponibilite)
	 * @generated
	 */
	boolean isSetDisponibilite();

	/**
	 * Returns the value of the '<em><b>GDH Disponibilite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GDH Disponibilite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GDH Disponibilite</em>' attribute.
	 * @see #setGDHDisponibilite(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelEntiteOrganisationnelle_GDHDisponibilite()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='GDHDisponibilite'"
	 * @generated
	 */
	XMLGregorianCalendar getGDHDisponibilite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getGDHDisponibilite <em>GDH Disponibilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GDH Disponibilite</em>' attribute.
	 * @see #getGDHDisponibilite()
	 * @generated
	 */
	void setGDHDisponibilite(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Etat Engagement</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEtatEngagement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Engagement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Engagement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEtatEngagement
	 * @see #isSetEtatEngagement()
	 * @see #unsetEtatEngagement()
	 * @see #setEtatEngagement(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEtatEngagement)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelEntiteOrganisationnelle_EtatEngagement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EtatEngagement'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEtatEngagement getEtatEngagement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getEtatEngagement <em>Etat Engagement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Engagement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEtatEngagement
	 * @see #isSetEtatEngagement()
	 * @see #unsetEtatEngagement()
	 * @see #getEtatEngagement()
	 * @generated
	 */
	void setEtatEngagement(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEtatEngagement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getEtatEngagement <em>Etat Engagement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEtatEngagement()
	 * @see #getEtatEngagement()
	 * @see #setEtatEngagement(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEtatEngagement)
	 * @generated
	 */
	void unsetEtatEngagement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getEtatEngagement <em>Etat Engagement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Etat Engagement</em>' attribute is set.
	 * @see #unsetEtatEngagement()
	 * @see #getEtatEngagement()
	 * @see #setEtatEngagement(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEtatEngagement)
	 * @generated
	 */
	boolean isSetEtatEngagement();

	/**
	 * Returns the value of the '<em><b>Activation</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleActivation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleActivation
	 * @see #isSetActivation()
	 * @see #unsetActivation()
	 * @see #setActivation(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleActivation)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelEntiteOrganisationnelle_Activation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Activation'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleActivation getActivation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getActivation <em>Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleActivation
	 * @see #isSetActivation()
	 * @see #unsetActivation()
	 * @see #getActivation()
	 * @generated
	 */
	void setActivation(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleActivation value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getActivation <em>Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActivation()
	 * @see #getActivation()
	 * @see #setActivation(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleActivation)
	 * @generated
	 */
	void unsetActivation();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getActivation <em>Activation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Activation</em>' attribute is set.
	 * @see #unsetActivation()
	 * @see #getActivation()
	 * @see #setActivation(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleActivation)
	 * @generated
	 */
	boolean isSetActivation();

	/**
	 * Returns the value of the '<em><b>GD Hdebut Activation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GD Hdebut Activation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GD Hdebut Activation</em>' attribute.
	 * @see #setGDHdebutActivation(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelEntiteOrganisationnelle_GDHdebutActivation()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='GDHdebutActivation'"
	 * @generated
	 */
	XMLGregorianCalendar getGDHdebutActivation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getGDHdebutActivation <em>GD Hdebut Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GD Hdebut Activation</em>' attribute.
	 * @see #getGDHdebutActivation()
	 * @generated
	 */
	void setGDHdebutActivation(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>GD Hfin Activation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GD Hfin Activation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GD Hfin Activation</em>' attribute.
	 * @see #setGDHfinActivation(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelEntiteOrganisationnelle_GDHfinActivation()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='GDHfinActivation'"
	 * @generated
	 */
	XMLGregorianCalendar getGDHfinActivation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getGDHfinActivation <em>GD Hfin Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GD Hfin Activation</em>' attribute.
	 * @see #getGDHfinActivation()
	 * @generated
	 */
	void setGDHfinActivation(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Etat Formation</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEtatFormation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Formation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Formation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEtatFormation
	 * @see #isSetEtatFormation()
	 * @see #unsetEtatFormation()
	 * @see #setEtatFormation(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEtatFormation)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelEntiteOrganisationnelle_EtatFormation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EtatFormation'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEtatFormation getEtatFormation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getEtatFormation <em>Etat Formation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Formation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEtatFormation
	 * @see #isSetEtatFormation()
	 * @see #unsetEtatFormation()
	 * @see #getEtatFormation()
	 * @generated
	 */
	void setEtatFormation(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEtatFormation value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getEtatFormation <em>Etat Formation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEtatFormation()
	 * @see #getEtatFormation()
	 * @see #setEtatFormation(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEtatFormation)
	 * @generated
	 */
	void unsetEtatFormation();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getEtatFormation <em>Etat Formation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Etat Formation</em>' attribute is set.
	 * @see #unsetEtatFormation()
	 * @see #getEtatFormation()
	 * @see #setEtatFormation(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEtatFormation)
	 * @generated
	 */
	boolean isSetEtatFormation();

	/**
	 * Returns the value of the '<em><b>Autre Etat Formation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Etat Formation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Etat Formation</em>' attribute.
	 * @see #setAutreEtatFormation(String)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelEntiteOrganisationnelle_AutreEtatFormation()
	 * @model dataType="mpia.meta.TypeDataTypeChaine020"
	 *        extendedMetaData="kind='element' name='AutreEtatFormation'"
	 * @generated
	 */
	String getAutreEtatFormation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getAutreEtatFormation <em>Autre Etat Formation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autre Etat Formation</em>' attribute.
	 * @see #getAutreEtatFormation()
	 * @generated
	 */
	void setAutreEtatFormation(String value);

	/**
	 * Returns the value of the '<em><b>Etat Deploiement</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatDeploiement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Deploiement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Deploiement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatDeploiement
	 * @see #isSetEtatDeploiement()
	 * @see #unsetEtatDeploiement()
	 * @see #setEtatDeploiement(TypeDictionaryDicoEtatDeploiement)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelEntiteOrganisationnelle_EtatDeploiement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EtatDeploiement'"
	 * @generated
	 */
	TypeDictionaryDicoEtatDeploiement getEtatDeploiement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getEtatDeploiement <em>Etat Deploiement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Deploiement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatDeploiement
	 * @see #isSetEtatDeploiement()
	 * @see #unsetEtatDeploiement()
	 * @see #getEtatDeploiement()
	 * @generated
	 */
	void setEtatDeploiement(TypeDictionaryDicoEtatDeploiement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getEtatDeploiement <em>Etat Deploiement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEtatDeploiement()
	 * @see #getEtatDeploiement()
	 * @see #setEtatDeploiement(TypeDictionaryDicoEtatDeploiement)
	 * @generated
	 */
	void unsetEtatDeploiement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getEtatDeploiement <em>Etat Deploiement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Etat Deploiement</em>' attribute is set.
	 * @see #unsetEtatDeploiement()
	 * @see #getEtatDeploiement()
	 * @see #setEtatDeploiement(TypeDictionaryDicoEtatDeploiement)
	 * @generated
	 */
	boolean isSetEtatDeploiement();

	/**
	 * Returns the value of the '<em><b>Autre Deploiement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Deploiement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Deploiement</em>' attribute.
	 * @see #setAutreDeploiement(String)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelEntiteOrganisationnelle_AutreDeploiement()
	 * @model dataType="mpia.meta.TypeDataTypeChaine020"
	 *        extendedMetaData="kind='element' name='AutreDeploiement'"
	 * @generated
	 */
	String getAutreDeploiement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getAutreDeploiement <em>Autre Deploiement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autre Deploiement</em>' attribute.
	 * @see #getAutreDeploiement()
	 * @generated
	 */
	void setAutreDeploiement(String value);

	/**
	 * Returns the value of the '<em><b>Etat Capteur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Capteur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Capteur</em>' attribute.
	 * @see #setEtatCapteur(String)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelEntiteOrganisationnelle_EtatCapteur()
	 * @model dataType="mpia.meta.TypeDataTypeChaine020"
	 *        extendedMetaData="kind='element' name='EtatCapteur'"
	 * @generated
	 */
	String getEtatCapteur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getEtatCapteur <em>Etat Capteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Capteur</em>' attribute.
	 * @see #getEtatCapteur()
	 * @generated
	 */
	void setEtatCapteur(String value);

	/**
	 * Returns the value of the '<em><b>Temps Reponse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temps Reponse</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temps Reponse</em>' containment reference.
	 * @see #setTempsReponse(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelEntiteOrganisationnelle_TempsReponse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TempsReponse'"
	 * @generated
	 */
	TypeDataTypeDuree getTempsReponse();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getTempsReponse <em>Temps Reponse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temps Reponse</em>' containment reference.
	 * @see #getTempsReponse()
	 * @generated
	 */
	void setTempsReponse(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>Entrainement</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEntrainement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entrainement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entrainement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEntrainement
	 * @see #isSetEntrainement()
	 * @see #unsetEntrainement()
	 * @see #setEntrainement(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEntrainement)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelEntiteOrganisationnelle_Entrainement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Entrainement'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEntrainement getEntrainement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getEntrainement <em>Entrainement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entrainement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEntrainement
	 * @see #isSetEntrainement()
	 * @see #unsetEntrainement()
	 * @see #getEntrainement()
	 * @generated
	 */
	void setEntrainement(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEntrainement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getEntrainement <em>Entrainement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEntrainement()
	 * @see #getEntrainement()
	 * @see #setEntrainement(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEntrainement)
	 * @generated
	 */
	void unsetEntrainement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getEntrainement <em>Entrainement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Entrainement</em>' attribute is set.
	 * @see #unsetEntrainement()
	 * @see #getEntrainement()
	 * @see #setEntrainement(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleEntrainement)
	 * @generated
	 */
	boolean isSetEntrainement();

	/**
	 * Returns the value of the '<em><b>Renforcement</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleRenforcement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Renforcement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Renforcement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleRenforcement
	 * @see #isSetRenforcement()
	 * @see #unsetRenforcement()
	 * @see #setRenforcement(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleRenforcement)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelEntiteOrganisationnelle_Renforcement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Renforcement'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleRenforcement getRenforcement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getRenforcement <em>Renforcement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Renforcement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleRenforcement
	 * @see #isSetRenforcement()
	 * @see #unsetRenforcement()
	 * @see #getRenforcement()
	 * @generated
	 */
	void setRenforcement(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleRenforcement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getRenforcement <em>Renforcement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRenforcement()
	 * @see #getRenforcement()
	 * @see #setRenforcement(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleRenforcement)
	 * @generated
	 */
	void unsetRenforcement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getRenforcement <em>Renforcement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Renforcement</em>' attribute is set.
	 * @see #unsetRenforcement()
	 * @see #getRenforcement()
	 * @see #setRenforcement(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleRenforcement)
	 * @generated
	 */
	boolean isSetRenforcement();

	/**
	 * Returns the value of the '<em><b>Reserve</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserve</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserve</em>' attribute.
	 * @see #isSetReserve()
	 * @see #unsetReserve()
	 * @see #setReserve(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelEntiteOrganisationnelle_Reserve()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='Reserve'"
	 * @generated
	 */
	boolean isReserve();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#isReserve <em>Reserve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserve</em>' attribute.
	 * @see #isSetReserve()
	 * @see #unsetReserve()
	 * @see #isReserve()
	 * @generated
	 */
	void setReserve(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#isReserve <em>Reserve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReserve()
	 * @see #isReserve()
	 * @see #setReserve(boolean)
	 * @generated
	 */
	void unsetReserve();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#isReserve <em>Reserve</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reserve</em>' attribute is set.
	 * @see #unsetReserve()
	 * @see #isReserve()
	 * @see #setReserve(boolean)
	 * @generated
	 */
	boolean isSetReserve();

	/**
	 * Returns the value of the '<em><b>Consigne Tir</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleConsigneTir}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consigne Tir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consigne Tir</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleConsigneTir
	 * @see #isSetConsigneTir()
	 * @see #unsetConsigneTir()
	 * @see #setConsigneTir(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleConsigneTir)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelEntiteOrganisationnelle_ConsigneTir()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ConsigneTir'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleConsigneTir getConsigneTir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getConsigneTir <em>Consigne Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consigne Tir</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleConsigneTir
	 * @see #isSetConsigneTir()
	 * @see #unsetConsigneTir()
	 * @see #getConsigneTir()
	 * @generated
	 */
	void setConsigneTir(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleConsigneTir value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getConsigneTir <em>Consigne Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConsigneTir()
	 * @see #getConsigneTir()
	 * @see #setConsigneTir(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleConsigneTir)
	 * @generated
	 */
	void unsetConsigneTir();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getConsigneTir <em>Consigne Tir</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Consigne Tir</em>' attribute is set.
	 * @see #unsetConsigneTir()
	 * @see #getConsigneTir()
	 * @see #setConsigneTir(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleConsigneTir)
	 * @generated
	 */
	boolean isSetConsigneTir();

	/**
	 * Returns the value of the '<em><b>Protection NRBC</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleProtectionNRBC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protection NRBC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protection NRBC</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleProtectionNRBC
	 * @see #isSetProtectionNRBC()
	 * @see #unsetProtectionNRBC()
	 * @see #setProtectionNRBC(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleProtectionNRBC)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelEntiteOrganisationnelle_ProtectionNRBC()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ProtectionNRBC'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleProtectionNRBC getProtectionNRBC();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getProtectionNRBC <em>Protection NRBC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protection NRBC</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleProtectionNRBC
	 * @see #isSetProtectionNRBC()
	 * @see #unsetProtectionNRBC()
	 * @see #getProtectionNRBC()
	 * @generated
	 */
	void setProtectionNRBC(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleProtectionNRBC value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getProtectionNRBC <em>Protection NRBC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProtectionNRBC()
	 * @see #getProtectionNRBC()
	 * @see #setProtectionNRBC(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleProtectionNRBC)
	 * @generated
	 */
	void unsetProtectionNRBC();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getProtectionNRBC <em>Protection NRBC</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Protection NRBC</em>' attribute is set.
	 * @see #unsetProtectionNRBC()
	 * @see #getProtectionNRBC()
	 * @see #setProtectionNRBC(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleProtectionNRBC)
	 * @generated
	 */
	boolean isSetProtectionNRBC();

	/**
	 * Returns the value of the '<em><b>Dose Radiation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dose Radiation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dose Radiation</em>' containment reference.
	 * @see #setDoseRadiation(TypeDataTypeDoseAbsorbee)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelEntiteOrganisationnelle_DoseRadiation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DoseRadiation'"
	 * @generated
	 */
	TypeDataTypeDoseAbsorbee getDoseRadiation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getDoseRadiation <em>Dose Radiation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dose Radiation</em>' containment reference.
	 * @see #getDoseRadiation()
	 * @generated
	 */
	void setDoseRadiation(TypeDataTypeDoseAbsorbee value);

	/**
	 * Returns the value of the '<em><b>Niveau Alerte</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleNiveauAlerte}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Niveau Alerte</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau Alerte</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleNiveauAlerte
	 * @see #isSetNiveauAlerte()
	 * @see #unsetNiveauAlerte()
	 * @see #setNiveauAlerte(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleNiveauAlerte)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelEntiteOrganisationnelle_NiveauAlerte()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='NiveauAlerte'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleNiveauAlerte getNiveauAlerte();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getNiveauAlerte <em>Niveau Alerte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Niveau Alerte</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleNiveauAlerte
	 * @see #isSetNiveauAlerte()
	 * @see #unsetNiveauAlerte()
	 * @see #getNiveauAlerte()
	 * @generated
	 */
	void setNiveauAlerte(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleNiveauAlerte value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getNiveauAlerte <em>Niveau Alerte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNiveauAlerte()
	 * @see #getNiveauAlerte()
	 * @see #setNiveauAlerte(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleNiveauAlerte)
	 * @generated
	 */
	void unsetNiveauAlerte();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getNiveauAlerte <em>Niveau Alerte</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Niveau Alerte</em>' attribute is set.
	 * @see #unsetNiveauAlerte()
	 * @see #getNiveauAlerte()
	 * @see #setNiveauAlerte(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleNiveauAlerte)
	 * @generated
	 */
	boolean isSetNiveauAlerte();

	/**
	 * Returns the value of the '<em><b>Statut Logistique</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleStatutLogistique}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statut Logistique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statut Logistique</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleStatutLogistique
	 * @see #isSetStatutLogistique()
	 * @see #unsetStatutLogistique()
	 * @see #setStatutLogistique(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleStatutLogistique)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelEntiteOrganisationnelle_StatutLogistique()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='StatutLogistique'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleStatutLogistique getStatutLogistique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getStatutLogistique <em>Statut Logistique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statut Logistique</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleStatutLogistique
	 * @see #isSetStatutLogistique()
	 * @see #unsetStatutLogistique()
	 * @see #getStatutLogistique()
	 * @generated
	 */
	void setStatutLogistique(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleStatutLogistique value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getStatutLogistique <em>Statut Logistique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStatutLogistique()
	 * @see #getStatutLogistique()
	 * @see #setStatutLogistique(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleStatutLogistique)
	 * @generated
	 */
	void unsetStatutLogistique();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getStatutLogistique <em>Statut Logistique</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Statut Logistique</em>' attribute is set.
	 * @see #unsetStatutLogistique()
	 * @see #getStatutLogistique()
	 * @see #setStatutLogistique(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleStatutLogistique)
	 * @generated
	 */
	boolean isSetStatutLogistique();

	/**
	 * Returns the value of the '<em><b>Etat Personnel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Personnel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Personnel</em>' attribute.
	 * @see #isSetEtatPersonnel()
	 * @see #unsetEtatPersonnel()
	 * @see #setEtatPersonnel(double)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelEntiteOrganisationnelle_EtatPersonnel()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeFraction"
	 *        extendedMetaData="kind='element' name='EtatPersonnel'"
	 * @generated
	 */
	double getEtatPersonnel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getEtatPersonnel <em>Etat Personnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Personnel</em>' attribute.
	 * @see #isSetEtatPersonnel()
	 * @see #unsetEtatPersonnel()
	 * @see #getEtatPersonnel()
	 * @generated
	 */
	void setEtatPersonnel(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getEtatPersonnel <em>Etat Personnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEtatPersonnel()
	 * @see #getEtatPersonnel()
	 * @see #setEtatPersonnel(double)
	 * @generated
	 */
	void unsetEtatPersonnel();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getEtatPersonnel <em>Etat Personnel</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Etat Personnel</em>' attribute is set.
	 * @see #unsetEtatPersonnel()
	 * @see #getEtatPersonnel()
	 * @see #setEtatPersonnel(double)
	 * @generated
	 */
	boolean isSetEtatPersonnel();

	/**
	 * Returns the value of the '<em><b>Fatigue Personnel</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleFatiguePersonnel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fatigue Personnel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fatigue Personnel</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleFatiguePersonnel
	 * @see #isSetFatiguePersonnel()
	 * @see #unsetFatiguePersonnel()
	 * @see #setFatiguePersonnel(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleFatiguePersonnel)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelEntiteOrganisationnelle_FatiguePersonnel()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='FatiguePersonnel'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleFatiguePersonnel getFatiguePersonnel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getFatiguePersonnel <em>Fatigue Personnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fatigue Personnel</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleFatiguePersonnel
	 * @see #isSetFatiguePersonnel()
	 * @see #unsetFatiguePersonnel()
	 * @see #getFatiguePersonnel()
	 * @generated
	 */
	void setFatiguePersonnel(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleFatiguePersonnel value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getFatiguePersonnel <em>Fatigue Personnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFatiguePersonnel()
	 * @see #getFatiguePersonnel()
	 * @see #setFatiguePersonnel(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleFatiguePersonnel)
	 * @generated
	 */
	void unsetFatiguePersonnel();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getFatiguePersonnel <em>Fatigue Personnel</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fatigue Personnel</em>' attribute is set.
	 * @see #unsetFatiguePersonnel()
	 * @see #getFatiguePersonnel()
	 * @see #setFatiguePersonnel(TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleFatiguePersonnel)
	 * @generated
	 */
	boolean isSetFatiguePersonnel();

	/**
	 * Returns the value of the '<em><b>Etat Equipements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Equipements</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Equipements</em>' attribute.
	 * @see #isSetEtatEquipements()
	 * @see #unsetEtatEquipements()
	 * @see #setEtatEquipements(double)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelEntiteOrganisationnelle_EtatEquipements()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeFraction"
	 *        extendedMetaData="kind='element' name='EtatEquipements'"
	 * @generated
	 */
	double getEtatEquipements();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getEtatEquipements <em>Etat Equipements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Equipements</em>' attribute.
	 * @see #isSetEtatEquipements()
	 * @see #unsetEtatEquipements()
	 * @see #getEtatEquipements()
	 * @generated
	 */
	void setEtatEquipements(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getEtatEquipements <em>Etat Equipements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEtatEquipements()
	 * @see #getEtatEquipements()
	 * @see #setEtatEquipements(double)
	 * @generated
	 */
	void unsetEtatEquipements();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getEtatEquipements <em>Etat Equipements</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Etat Equipements</em>' attribute is set.
	 * @see #unsetEtatEquipements()
	 * @see #getEtatEquipements()
	 * @see #setEtatEquipements(double)
	 * @generated
	 */
	boolean isSetEtatEquipements();

	/**
	 * Returns the value of the '<em><b>Etat Munitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Munitions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Munitions</em>' attribute.
	 * @see #isSetEtatMunitions()
	 * @see #unsetEtatMunitions()
	 * @see #setEtatMunitions(double)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelEntiteOrganisationnelle_EtatMunitions()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeFraction"
	 *        extendedMetaData="kind='element' name='EtatMunitions'"
	 * @generated
	 */
	double getEtatMunitions();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getEtatMunitions <em>Etat Munitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Munitions</em>' attribute.
	 * @see #isSetEtatMunitions()
	 * @see #unsetEtatMunitions()
	 * @see #getEtatMunitions()
	 * @generated
	 */
	void setEtatMunitions(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getEtatMunitions <em>Etat Munitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEtatMunitions()
	 * @see #getEtatMunitions()
	 * @see #setEtatMunitions(double)
	 * @generated
	 */
	void unsetEtatMunitions();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getEtatMunitions <em>Etat Munitions</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Etat Munitions</em>' attribute is set.
	 * @see #unsetEtatMunitions()
	 * @see #getEtatMunitions()
	 * @see #setEtatMunitions(double)
	 * @generated
	 */
	boolean isSetEtatMunitions();

	/**
	 * Returns the value of the '<em><b>Etat Carburants</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Carburants</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Carburants</em>' attribute.
	 * @see #isSetEtatCarburants()
	 * @see #unsetEtatCarburants()
	 * @see #setEtatCarburants(double)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelEntiteOrganisationnelle_EtatCarburants()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeFraction"
	 *        extendedMetaData="kind='element' name='EtatCarburants'"
	 * @generated
	 */
	double getEtatCarburants();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getEtatCarburants <em>Etat Carburants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Carburants</em>' attribute.
	 * @see #isSetEtatCarburants()
	 * @see #unsetEtatCarburants()
	 * @see #getEtatCarburants()
	 * @generated
	 */
	void setEtatCarburants(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getEtatCarburants <em>Etat Carburants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEtatCarburants()
	 * @see #getEtatCarburants()
	 * @see #setEtatCarburants(double)
	 * @generated
	 */
	void unsetEtatCarburants();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getEtatCarburants <em>Etat Carburants</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Etat Carburants</em>' attribute is set.
	 * @see #unsetEtatCarburants()
	 * @see #getEtatCarburants()
	 * @see #setEtatCarburants(double)
	 * @generated
	 */
	boolean isSetEtatCarburants();

	/**
	 * Returns the value of the '<em><b>Point Rendez Vous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Rendez Vous</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Rendez Vous</em>' attribute.
	 * @see #setPointRendezVous(String)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelEntiteOrganisationnelle_PointRendezVous()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='PointRendezVous'"
	 * @generated
	 */
	String getPointRendezVous();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getPointRendezVous <em>Point Rendez Vous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Rendez Vous</em>' attribute.
	 * @see #getPointRendezVous()
	 * @generated
	 */
	void setPointRendezVous(String value);

	/**
	 * Returns the value of the '<em><b>Points Ou PC Fleche</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Points Ou PC Fleche</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points Ou PC Fleche</em>' attribute.
	 * @see #setPointsOuPCFleche(String)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelEntiteOrganisationnelle_PointsOuPCFleche()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='PointsOuPCFleche'"
	 * @generated
	 */
	String getPointsOuPCFleche();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getPointsOuPCFleche <em>Points Ou PC Fleche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points Ou PC Fleche</em>' attribute.
	 * @see #getPointsOuPCFleche()
	 * @generated
	 */
	void setPointsOuPCFleche(String value);

	/**
	 * Returns the value of the '<em><b>APour Caracteristique Groupe Individus Caracteristique Groupe Individus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Caracteristique Groupe Individus Caracteristique Groupe Individus</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Caracteristique Groupe Individus Caracteristique Groupe Individus</em>' containment reference.
	 * @see #setAPourCaracteristiqueGroupeIndividusCaracteristiqueGroupeIndividus(TypeCaracteristiqueGroupeIndividus)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelEntiteOrganisationnelle_APourCaracteristiqueGroupeIndividusCaracteristiqueGroupeIndividus()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_CaracteristiqueGroupeIndividus'"
	 *        extendedMetaData="kind='element' name='APourCaracteristiqueGroupeIndividus_CaracteristiqueGroupeIndividus'"
	 * @generated
	 */
	TypeCaracteristiqueGroupeIndividus getAPourCaracteristiqueGroupeIndividusCaracteristiqueGroupeIndividus();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle#getAPourCaracteristiqueGroupeIndividusCaracteristiqueGroupeIndividus <em>APour Caracteristique Groupe Individus Caracteristique Groupe Individus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Caracteristique Groupe Individus Caracteristique Groupe Individus</em>' containment reference.
	 * @see #getAPourCaracteristiqueGroupeIndividusCaracteristiqueGroupeIndividus()
	 * @generated
	 */
	void setAPourCaracteristiqueGroupeIndividusCaracteristiqueGroupeIndividus(TypeCaracteristiqueGroupeIndividus value);

} // TypeEtatOperationnelEntiteOrganisationnelle
