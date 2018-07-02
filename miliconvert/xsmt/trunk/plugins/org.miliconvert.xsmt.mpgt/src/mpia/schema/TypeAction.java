/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeDateHeure;
import mpia.meta.TypeDataTypeDuree;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAction#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAction#getTypeAction <em>Type Action</em>}</li>
 *   <li>{@link mpia.schema.TypeAction#getDescriptionGeneraleAction <em>Description Generale Action</em>}</li>
 *   <li>{@link mpia.schema.TypeAction#getPriorite <em>Priorite</em>}</li>
 *   <li>{@link mpia.schema.TypeAction#getDescriptionGeneraleObjectif <em>Description Generale Objectif</em>}</li>
 *   <li>{@link mpia.schema.TypeAction#isEffortPrincipal <em>Effort Principal</em>}</li>
 *   <li>{@link mpia.schema.TypeAction#getQualificatifActivite <em>Qualificatif Activite</em>}</li>
 *   <li>{@link mpia.schema.TypeAction#getPropriete <em>Propriete</em>}</li>
 *   <li>{@link mpia.schema.TypeAction#isFictive <em>Fictive</em>}</li>
 *   <li>{@link mpia.schema.TypeAction#getDateDebutPrevue <em>Date Debut Prevue</em>}</li>
 *   <li>{@link mpia.schema.TypeAction#getQualificatifDateDebut <em>Qualificatif Date Debut</em>}</li>
 *   <li>{@link mpia.schema.TypeAction#getGDHLimiteInfDebut <em>GDH Limite Inf Debut</em>}</li>
 *   <li>{@link mpia.schema.TypeAction#getDateFinPrevue <em>Date Fin Prevue</em>}</li>
 *   <li>{@link mpia.schema.TypeAction#getQualificatifDateFin <em>Qualificatif Date Fin</em>}</li>
 *   <li>{@link mpia.schema.TypeAction#getGDHLimiteSupFin <em>GDH Limite Sup Fin</em>}</li>
 *   <li>{@link mpia.schema.TypeAction#getDureeMinimale <em>Duree Minimale</em>}</li>
 *   <li>{@link mpia.schema.TypeAction#getDureeEstimee <em>Duree Estimee</em>}</li>
 *   <li>{@link mpia.schema.TypeAction#getDureeMaximale <em>Duree Maximale</em>}</li>
 *   <li>{@link mpia.schema.TypeAction#getPreavisEventuel <em>Preavis Eventuel</em>}</li>
 *   <li>{@link mpia.schema.TypeAction#getComplements <em>Complements</em>}</li>
 *   <li>{@link mpia.schema.TypeAction#getNumeroAction <em>Numero Action</em>}</li>
 *   <li>{@link mpia.schema.TypeAction#getNiveauOperationnel <em>Niveau Operationnel</em>}</li>
 *   <li>{@link mpia.schema.TypeAction#getDegreSurete <em>Degre Surete</em>}</li>
 *   <li>{@link mpia.schema.TypeAction#getImpactMeteorologie <em>Impact Meteorologie</em>}</li>
 *   <li>{@link mpia.schema.TypeAction#getPrecisionDateDebut <em>Precision Date Debut</em>}</li>
 *   <li>{@link mpia.schema.TypeAction#getCodeHeureDebut <em>Code Heure Debut</em>}</li>
 *   <li>{@link mpia.schema.TypeAction#getPrecisionDateFin <em>Precision Date Fin</em>}</li>
 *   <li>{@link mpia.schema.TypeAction#getCodeJourDebut <em>Code Jour Debut</em>}</li>
 *   <li>{@link mpia.schema.TypeAction#getAPourEtatEtatAction <em>APour Etat Etat Action</em>}</li>
 *   <li>{@link mpia.schema.TypeAction#getNecessiteArticulation <em>Necessite Articulation</em>}</li>
 *   <li>{@link mpia.schema.TypeAction#getEstObjetAssociationEntiteOrgAction <em>Est Objet Association Entite Org Action</em>}</li>
 *   <li>{@link mpia.schema.TypeAction#getAPourUniteSoutUniteSicUniteCooperante <em>APour Unite Sout Unite Sic Unite Cooperante</em>}</li>
 *   <li>{@link mpia.schema.TypeAction#getAPourZoneRechercheZoneRecherche <em>APour Zone Recherche Zone Recherche</em>}</li>
 *   <li>{@link mpia.schema.TypeAction#getAPourRessourceRessourceActivite <em>APour Ressource Ressource Activite</em>}</li>
 *   <li>{@link mpia.schema.TypeAction#getEstObjetAssociationMissionMeleeAction <em>Est Objet Association Mission Melee Action</em>}</li>
 *   <li>{@link mpia.schema.TypeAction#getEstObjetAssociationMissionRenseignementAction <em>Est Objet Association Mission Renseignement Action</em>}</li>
 *   <li>{@link mpia.schema.TypeAction#getACommeListeObjectifsCandidatsListeObjectifsCandidats <em>AComme Liste Objectifs Candidats Liste Objectifs Candidats</em>}</li>
 *   <li>{@link mpia.schema.TypeAction#getEstObjetAssociationActionAction <em>Est Objet Association Action Action</em>}</li>
 *   <li>{@link mpia.schema.TypeAction#getEstSujetAssociationActionAction <em>Est Sujet Association Action Action</em>}</li>
 *   <li>{@link mpia.schema.TypeAction#getEstObjetAssociationEvenementNRBCAction <em>Est Objet Association Evenement NRBC Action</em>}</li>
 *   <li>{@link mpia.schema.TypeAction#getEstSujetAssociationActionEvenementNRBC <em>Est Sujet Association Action Evenement NRBC</em>}</li>
 *   <li>{@link mpia.schema.TypeAction#getEstObjetAssociationAutreEvenementAction <em>Est Objet Association Autre Evenement Action</em>}</li>
 *   <li>{@link mpia.schema.TypeAction#getEstSujetAssociationActionAutreEvenement <em>Est Sujet Association Action Autre Evenement</em>}</li>
 *   <li>{@link mpia.schema.TypeAction#getAPourRegleEngagementRegleEngagementAction <em>APour Regle Engagement Regle Engagement Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAction()
 * @model abstract="true"
 *        extendedMetaData="name='type_Action' kind='elementOnly'"
 * @generated
 */
public interface TypeAction extends TypeActivite {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoActionCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoActionCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoActionCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAction_Categorie()
	 * @model unsettable="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoActionCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAction#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoActionCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoActionCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAction#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoActionCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAction#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoActionCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Type Action</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoActionTypeAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Action</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoActionTypeAction
	 * @see #isSetTypeAction()
	 * @see #unsetTypeAction()
	 * @see #setTypeAction(TypeDictionaryDicoActionTypeAction)
	 * @see mpia.schema.SchemaPackage#getTypeAction_TypeAction()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeAction'"
	 * @generated
	 */
	TypeDictionaryDicoActionTypeAction getTypeAction();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAction#getTypeAction <em>Type Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Action</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoActionTypeAction
	 * @see #isSetTypeAction()
	 * @see #unsetTypeAction()
	 * @see #getTypeAction()
	 * @generated
	 */
	void setTypeAction(TypeDictionaryDicoActionTypeAction value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAction#getTypeAction <em>Type Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeAction()
	 * @see #getTypeAction()
	 * @see #setTypeAction(TypeDictionaryDicoActionTypeAction)
	 * @generated
	 */
	void unsetTypeAction();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAction#getTypeAction <em>Type Action</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Action</em>' attribute is set.
	 * @see #unsetTypeAction()
	 * @see #getTypeAction()
	 * @see #setTypeAction(TypeDictionaryDicoActionTypeAction)
	 * @generated
	 */
	boolean isSetTypeAction();

	/**
	 * Returns the value of the '<em><b>Description Generale Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description Generale Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Generale Action</em>' attribute.
	 * @see #setDescriptionGeneraleAction(String)
	 * @see mpia.schema.SchemaPackage#getTypeAction_DescriptionGeneraleAction()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='DescriptionGeneraleAction'"
	 * @generated
	 */
	String getDescriptionGeneraleAction();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAction#getDescriptionGeneraleAction <em>Description Generale Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Generale Action</em>' attribute.
	 * @see #getDescriptionGeneraleAction()
	 * @generated
	 */
	void setDescriptionGeneraleAction(String value);

	/**
	 * Returns the value of the '<em><b>Priorite</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoActionPriorite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priorite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priorite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoActionPriorite
	 * @see #isSetPriorite()
	 * @see #unsetPriorite()
	 * @see #setPriorite(TypeDictionaryDicoActionPriorite)
	 * @see mpia.schema.SchemaPackage#getTypeAction_Priorite()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Priorite'"
	 * @generated
	 */
	TypeDictionaryDicoActionPriorite getPriorite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAction#getPriorite <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priorite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoActionPriorite
	 * @see #isSetPriorite()
	 * @see #unsetPriorite()
	 * @see #getPriorite()
	 * @generated
	 */
	void setPriorite(TypeDictionaryDicoActionPriorite value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAction#getPriorite <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPriorite()
	 * @see #getPriorite()
	 * @see #setPriorite(TypeDictionaryDicoActionPriorite)
	 * @generated
	 */
	void unsetPriorite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAction#getPriorite <em>Priorite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Priorite</em>' attribute is set.
	 * @see #unsetPriorite()
	 * @see #getPriorite()
	 * @see #setPriorite(TypeDictionaryDicoActionPriorite)
	 * @generated
	 */
	boolean isSetPriorite();

	/**
	 * Returns the value of the '<em><b>Description Generale Objectif</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description Generale Objectif</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Generale Objectif</em>' attribute.
	 * @see #setDescriptionGeneraleObjectif(String)
	 * @see mpia.schema.SchemaPackage#getTypeAction_DescriptionGeneraleObjectif()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='DescriptionGeneraleObjectif'"
	 * @generated
	 */
	String getDescriptionGeneraleObjectif();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAction#getDescriptionGeneraleObjectif <em>Description Generale Objectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Generale Objectif</em>' attribute.
	 * @see #getDescriptionGeneraleObjectif()
	 * @generated
	 */
	void setDescriptionGeneraleObjectif(String value);

	/**
	 * Returns the value of the '<em><b>Effort Principal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effort Principal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effort Principal</em>' attribute.
	 * @see #isSetEffortPrincipal()
	 * @see #unsetEffortPrincipal()
	 * @see #setEffortPrincipal(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeAction_EffortPrincipal()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='EffortPrincipal'"
	 * @generated
	 */
	boolean isEffortPrincipal();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAction#isEffortPrincipal <em>Effort Principal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effort Principal</em>' attribute.
	 * @see #isSetEffortPrincipal()
	 * @see #unsetEffortPrincipal()
	 * @see #isEffortPrincipal()
	 * @generated
	 */
	void setEffortPrincipal(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAction#isEffortPrincipal <em>Effort Principal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEffortPrincipal()
	 * @see #isEffortPrincipal()
	 * @see #setEffortPrincipal(boolean)
	 * @generated
	 */
	void unsetEffortPrincipal();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAction#isEffortPrincipal <em>Effort Principal</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Effort Principal</em>' attribute is set.
	 * @see #unsetEffortPrincipal()
	 * @see #isEffortPrincipal()
	 * @see #setEffortPrincipal(boolean)
	 * @generated
	 */
	boolean isSetEffortPrincipal();

	/**
	 * Returns the value of the '<em><b>Qualificatif Activite</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoActionQualificatifActivite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualificatif Activite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualificatif Activite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoActionQualificatifActivite
	 * @see #isSetQualificatifActivite()
	 * @see #unsetQualificatifActivite()
	 * @see #setQualificatifActivite(TypeDictionaryDicoActionQualificatifActivite)
	 * @see mpia.schema.SchemaPackage#getTypeAction_QualificatifActivite()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='QualificatifActivite'"
	 * @generated
	 */
	TypeDictionaryDicoActionQualificatifActivite getQualificatifActivite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAction#getQualificatifActivite <em>Qualificatif Activite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualificatif Activite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoActionQualificatifActivite
	 * @see #isSetQualificatifActivite()
	 * @see #unsetQualificatifActivite()
	 * @see #getQualificatifActivite()
	 * @generated
	 */
	void setQualificatifActivite(TypeDictionaryDicoActionQualificatifActivite value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAction#getQualificatifActivite <em>Qualificatif Activite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQualificatifActivite()
	 * @see #getQualificatifActivite()
	 * @see #setQualificatifActivite(TypeDictionaryDicoActionQualificatifActivite)
	 * @generated
	 */
	void unsetQualificatifActivite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAction#getQualificatifActivite <em>Qualificatif Activite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Qualificatif Activite</em>' attribute is set.
	 * @see #unsetQualificatifActivite()
	 * @see #getQualificatifActivite()
	 * @see #setQualificatifActivite(TypeDictionaryDicoActionQualificatifActivite)
	 * @generated
	 */
	boolean isSetQualificatifActivite();

	/**
	 * Returns the value of the '<em><b>Propriete</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoActionPropriete}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Propriete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Propriete</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoActionPropriete
	 * @see #isSetPropriete()
	 * @see #unsetPropriete()
	 * @see #setPropriete(TypeDictionaryDicoActionPropriete)
	 * @see mpia.schema.SchemaPackage#getTypeAction_Propriete()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Propriete'"
	 * @generated
	 */
	TypeDictionaryDicoActionPropriete getPropriete();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAction#getPropriete <em>Propriete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Propriete</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoActionPropriete
	 * @see #isSetPropriete()
	 * @see #unsetPropriete()
	 * @see #getPropriete()
	 * @generated
	 */
	void setPropriete(TypeDictionaryDicoActionPropriete value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAction#getPropriete <em>Propriete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPropriete()
	 * @see #getPropriete()
	 * @see #setPropriete(TypeDictionaryDicoActionPropriete)
	 * @generated
	 */
	void unsetPropriete();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAction#getPropriete <em>Propriete</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Propriete</em>' attribute is set.
	 * @see #unsetPropriete()
	 * @see #getPropriete()
	 * @see #setPropriete(TypeDictionaryDicoActionPropriete)
	 * @generated
	 */
	boolean isSetPropriete();

	/**
	 * Returns the value of the '<em><b>Fictive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fictive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fictive</em>' attribute.
	 * @see #isSetFictive()
	 * @see #unsetFictive()
	 * @see #setFictive(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeAction_Fictive()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='Fictive'"
	 * @generated
	 */
	boolean isFictive();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAction#isFictive <em>Fictive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fictive</em>' attribute.
	 * @see #isSetFictive()
	 * @see #unsetFictive()
	 * @see #isFictive()
	 * @generated
	 */
	void setFictive(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAction#isFictive <em>Fictive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFictive()
	 * @see #isFictive()
	 * @see #setFictive(boolean)
	 * @generated
	 */
	void unsetFictive();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAction#isFictive <em>Fictive</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fictive</em>' attribute is set.
	 * @see #unsetFictive()
	 * @see #isFictive()
	 * @see #setFictive(boolean)
	 * @generated
	 */
	boolean isSetFictive();

	/**
	 * Returns the value of the '<em><b>Date Debut Prevue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Debut Prevue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Debut Prevue</em>' containment reference.
	 * @see #setDateDebutPrevue(TypeDataTypeDateHeure)
	 * @see mpia.schema.SchemaPackage#getTypeAction_DateDebutPrevue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DateDebutPrevue'"
	 * @generated
	 */
	TypeDataTypeDateHeure getDateDebutPrevue();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAction#getDateDebutPrevue <em>Date Debut Prevue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Debut Prevue</em>' containment reference.
	 * @see #getDateDebutPrevue()
	 * @generated
	 */
	void setDateDebutPrevue(TypeDataTypeDateHeure value);

	/**
	 * Returns the value of the '<em><b>Qualificatif Date Debut</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoActionQualificatifDateDebut}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualificatif Date Debut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualificatif Date Debut</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoActionQualificatifDateDebut
	 * @see #isSetQualificatifDateDebut()
	 * @see #unsetQualificatifDateDebut()
	 * @see #setQualificatifDateDebut(TypeDictionaryDicoActionQualificatifDateDebut)
	 * @see mpia.schema.SchemaPackage#getTypeAction_QualificatifDateDebut()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='QualificatifDateDebut'"
	 * @generated
	 */
	TypeDictionaryDicoActionQualificatifDateDebut getQualificatifDateDebut();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAction#getQualificatifDateDebut <em>Qualificatif Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualificatif Date Debut</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoActionQualificatifDateDebut
	 * @see #isSetQualificatifDateDebut()
	 * @see #unsetQualificatifDateDebut()
	 * @see #getQualificatifDateDebut()
	 * @generated
	 */
	void setQualificatifDateDebut(TypeDictionaryDicoActionQualificatifDateDebut value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAction#getQualificatifDateDebut <em>Qualificatif Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQualificatifDateDebut()
	 * @see #getQualificatifDateDebut()
	 * @see #setQualificatifDateDebut(TypeDictionaryDicoActionQualificatifDateDebut)
	 * @generated
	 */
	void unsetQualificatifDateDebut();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAction#getQualificatifDateDebut <em>Qualificatif Date Debut</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Qualificatif Date Debut</em>' attribute is set.
	 * @see #unsetQualificatifDateDebut()
	 * @see #getQualificatifDateDebut()
	 * @see #setQualificatifDateDebut(TypeDictionaryDicoActionQualificatifDateDebut)
	 * @generated
	 */
	boolean isSetQualificatifDateDebut();

	/**
	 * Returns the value of the '<em><b>GDH Limite Inf Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GDH Limite Inf Debut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GDH Limite Inf Debut</em>' attribute.
	 * @see #setGDHLimiteInfDebut(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeAction_GDHLimiteInfDebut()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='GDHLimiteInfDebut'"
	 * @generated
	 */
	XMLGregorianCalendar getGDHLimiteInfDebut();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAction#getGDHLimiteInfDebut <em>GDH Limite Inf Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GDH Limite Inf Debut</em>' attribute.
	 * @see #getGDHLimiteInfDebut()
	 * @generated
	 */
	void setGDHLimiteInfDebut(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Date Fin Prevue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Fin Prevue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Fin Prevue</em>' containment reference.
	 * @see #setDateFinPrevue(TypeDataTypeDateHeure)
	 * @see mpia.schema.SchemaPackage#getTypeAction_DateFinPrevue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DateFinPrevue'"
	 * @generated
	 */
	TypeDataTypeDateHeure getDateFinPrevue();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAction#getDateFinPrevue <em>Date Fin Prevue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Fin Prevue</em>' containment reference.
	 * @see #getDateFinPrevue()
	 * @generated
	 */
	void setDateFinPrevue(TypeDataTypeDateHeure value);

	/**
	 * Returns the value of the '<em><b>Qualificatif Date Fin</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoActionQualificatifDateFin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualificatif Date Fin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualificatif Date Fin</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoActionQualificatifDateFin
	 * @see #isSetQualificatifDateFin()
	 * @see #unsetQualificatifDateFin()
	 * @see #setQualificatifDateFin(TypeDictionaryDicoActionQualificatifDateFin)
	 * @see mpia.schema.SchemaPackage#getTypeAction_QualificatifDateFin()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='QualificatifDateFin'"
	 * @generated
	 */
	TypeDictionaryDicoActionQualificatifDateFin getQualificatifDateFin();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAction#getQualificatifDateFin <em>Qualificatif Date Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualificatif Date Fin</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoActionQualificatifDateFin
	 * @see #isSetQualificatifDateFin()
	 * @see #unsetQualificatifDateFin()
	 * @see #getQualificatifDateFin()
	 * @generated
	 */
	void setQualificatifDateFin(TypeDictionaryDicoActionQualificatifDateFin value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAction#getQualificatifDateFin <em>Qualificatif Date Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQualificatifDateFin()
	 * @see #getQualificatifDateFin()
	 * @see #setQualificatifDateFin(TypeDictionaryDicoActionQualificatifDateFin)
	 * @generated
	 */
	void unsetQualificatifDateFin();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAction#getQualificatifDateFin <em>Qualificatif Date Fin</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Qualificatif Date Fin</em>' attribute is set.
	 * @see #unsetQualificatifDateFin()
	 * @see #getQualificatifDateFin()
	 * @see #setQualificatifDateFin(TypeDictionaryDicoActionQualificatifDateFin)
	 * @generated
	 */
	boolean isSetQualificatifDateFin();

	/**
	 * Returns the value of the '<em><b>GDH Limite Sup Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GDH Limite Sup Fin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GDH Limite Sup Fin</em>' attribute.
	 * @see #setGDHLimiteSupFin(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeAction_GDHLimiteSupFin()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='GDHLimiteSupFin'"
	 * @generated
	 */
	XMLGregorianCalendar getGDHLimiteSupFin();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAction#getGDHLimiteSupFin <em>GDH Limite Sup Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GDH Limite Sup Fin</em>' attribute.
	 * @see #getGDHLimiteSupFin()
	 * @generated
	 */
	void setGDHLimiteSupFin(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Duree Minimale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duree Minimale</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duree Minimale</em>' containment reference.
	 * @see #setDureeMinimale(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeAction_DureeMinimale()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DureeMinimale'"
	 * @generated
	 */
	TypeDataTypeDuree getDureeMinimale();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAction#getDureeMinimale <em>Duree Minimale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duree Minimale</em>' containment reference.
	 * @see #getDureeMinimale()
	 * @generated
	 */
	void setDureeMinimale(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>Duree Estimee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duree Estimee</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duree Estimee</em>' containment reference.
	 * @see #setDureeEstimee(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeAction_DureeEstimee()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DureeEstimee'"
	 * @generated
	 */
	TypeDataTypeDuree getDureeEstimee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAction#getDureeEstimee <em>Duree Estimee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duree Estimee</em>' containment reference.
	 * @see #getDureeEstimee()
	 * @generated
	 */
	void setDureeEstimee(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>Duree Maximale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duree Maximale</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duree Maximale</em>' containment reference.
	 * @see #setDureeMaximale(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeAction_DureeMaximale()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DureeMaximale'"
	 * @generated
	 */
	TypeDataTypeDuree getDureeMaximale();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAction#getDureeMaximale <em>Duree Maximale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duree Maximale</em>' containment reference.
	 * @see #getDureeMaximale()
	 * @generated
	 */
	void setDureeMaximale(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>Preavis Eventuel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preavis Eventuel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preavis Eventuel</em>' containment reference.
	 * @see #setPreavisEventuel(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeAction_PreavisEventuel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PreavisEventuel'"
	 * @generated
	 */
	TypeDataTypeDuree getPreavisEventuel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAction#getPreavisEventuel <em>Preavis Eventuel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preavis Eventuel</em>' containment reference.
	 * @see #getPreavisEventuel()
	 * @generated
	 */
	void setPreavisEventuel(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>Complements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complements</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complements</em>' attribute.
	 * @see #setComplements(String)
	 * @see mpia.schema.SchemaPackage#getTypeAction_Complements()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='Complements'"
	 * @generated
	 */
	String getComplements();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAction#getComplements <em>Complements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complements</em>' attribute.
	 * @see #getComplements()
	 * @generated
	 */
	void setComplements(String value);

	/**
	 * Returns the value of the '<em><b>Numero Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Action</em>' attribute.
	 * @see #isSetNumeroAction()
	 * @see #unsetNumeroAction()
	 * @see #setNumeroAction(long)
	 * @see mpia.schema.SchemaPackage#getTypeAction_NumeroAction()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NumeroAction'"
	 * @generated
	 */
	long getNumeroAction();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAction#getNumeroAction <em>Numero Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Action</em>' attribute.
	 * @see #isSetNumeroAction()
	 * @see #unsetNumeroAction()
	 * @see #getNumeroAction()
	 * @generated
	 */
	void setNumeroAction(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAction#getNumeroAction <em>Numero Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumeroAction()
	 * @see #getNumeroAction()
	 * @see #setNumeroAction(long)
	 * @generated
	 */
	void unsetNumeroAction();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAction#getNumeroAction <em>Numero Action</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Numero Action</em>' attribute is set.
	 * @see #unsetNumeroAction()
	 * @see #getNumeroAction()
	 * @see #setNumeroAction(long)
	 * @generated
	 */
	boolean isSetNumeroAction();

	/**
	 * Returns the value of the '<em><b>Niveau Operationnel</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoActionNiveauOperationnel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Niveau Operationnel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau Operationnel</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoActionNiveauOperationnel
	 * @see #isSetNiveauOperationnel()
	 * @see #unsetNiveauOperationnel()
	 * @see #setNiveauOperationnel(TypeDictionaryDicoActionNiveauOperationnel)
	 * @see mpia.schema.SchemaPackage#getTypeAction_NiveauOperationnel()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='NiveauOperationnel'"
	 * @generated
	 */
	TypeDictionaryDicoActionNiveauOperationnel getNiveauOperationnel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAction#getNiveauOperationnel <em>Niveau Operationnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Niveau Operationnel</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoActionNiveauOperationnel
	 * @see #isSetNiveauOperationnel()
	 * @see #unsetNiveauOperationnel()
	 * @see #getNiveauOperationnel()
	 * @generated
	 */
	void setNiveauOperationnel(TypeDictionaryDicoActionNiveauOperationnel value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAction#getNiveauOperationnel <em>Niveau Operationnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNiveauOperationnel()
	 * @see #getNiveauOperationnel()
	 * @see #setNiveauOperationnel(TypeDictionaryDicoActionNiveauOperationnel)
	 * @generated
	 */
	void unsetNiveauOperationnel();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAction#getNiveauOperationnel <em>Niveau Operationnel</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Niveau Operationnel</em>' attribute is set.
	 * @see #unsetNiveauOperationnel()
	 * @see #getNiveauOperationnel()
	 * @see #setNiveauOperationnel(TypeDictionaryDicoActionNiveauOperationnel)
	 * @generated
	 */
	boolean isSetNiveauOperationnel();

	/**
	 * Returns the value of the '<em><b>Degre Surete</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoActionDegreSurete}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Degre Surete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degre Surete</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoActionDegreSurete
	 * @see #isSetDegreSurete()
	 * @see #unsetDegreSurete()
	 * @see #setDegreSurete(TypeDictionaryDicoActionDegreSurete)
	 * @see mpia.schema.SchemaPackage#getTypeAction_DegreSurete()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='DegreSurete'"
	 * @generated
	 */
	TypeDictionaryDicoActionDegreSurete getDegreSurete();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAction#getDegreSurete <em>Degre Surete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degre Surete</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoActionDegreSurete
	 * @see #isSetDegreSurete()
	 * @see #unsetDegreSurete()
	 * @see #getDegreSurete()
	 * @generated
	 */
	void setDegreSurete(TypeDictionaryDicoActionDegreSurete value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAction#getDegreSurete <em>Degre Surete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDegreSurete()
	 * @see #getDegreSurete()
	 * @see #setDegreSurete(TypeDictionaryDicoActionDegreSurete)
	 * @generated
	 */
	void unsetDegreSurete();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAction#getDegreSurete <em>Degre Surete</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Degre Surete</em>' attribute is set.
	 * @see #unsetDegreSurete()
	 * @see #getDegreSurete()
	 * @see #setDegreSurete(TypeDictionaryDicoActionDegreSurete)
	 * @generated
	 */
	boolean isSetDegreSurete();

	/**
	 * Returns the value of the '<em><b>Impact Meteorologie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoActionImpactMeteorologie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impact Meteorologie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impact Meteorologie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoActionImpactMeteorologie
	 * @see #isSetImpactMeteorologie()
	 * @see #unsetImpactMeteorologie()
	 * @see #setImpactMeteorologie(TypeDictionaryDicoActionImpactMeteorologie)
	 * @see mpia.schema.SchemaPackage#getTypeAction_ImpactMeteorologie()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ImpactMeteorologie'"
	 * @generated
	 */
	TypeDictionaryDicoActionImpactMeteorologie getImpactMeteorologie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAction#getImpactMeteorologie <em>Impact Meteorologie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impact Meteorologie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoActionImpactMeteorologie
	 * @see #isSetImpactMeteorologie()
	 * @see #unsetImpactMeteorologie()
	 * @see #getImpactMeteorologie()
	 * @generated
	 */
	void setImpactMeteorologie(TypeDictionaryDicoActionImpactMeteorologie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAction#getImpactMeteorologie <em>Impact Meteorologie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetImpactMeteorologie()
	 * @see #getImpactMeteorologie()
	 * @see #setImpactMeteorologie(TypeDictionaryDicoActionImpactMeteorologie)
	 * @generated
	 */
	void unsetImpactMeteorologie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAction#getImpactMeteorologie <em>Impact Meteorologie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Impact Meteorologie</em>' attribute is set.
	 * @see #unsetImpactMeteorologie()
	 * @see #getImpactMeteorologie()
	 * @see #setImpactMeteorologie(TypeDictionaryDicoActionImpactMeteorologie)
	 * @generated
	 */
	boolean isSetImpactMeteorologie();

	/**
	 * Returns the value of the '<em><b>Precision Date Debut</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoDatePrecision}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision Date Debut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision Date Debut</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDatePrecision
	 * @see #isSetPrecisionDateDebut()
	 * @see #unsetPrecisionDateDebut()
	 * @see #setPrecisionDateDebut(TypeDictionaryDicoDatePrecision)
	 * @see mpia.schema.SchemaPackage#getTypeAction_PrecisionDateDebut()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='PrecisionDateDebut'"
	 * @generated
	 */
	TypeDictionaryDicoDatePrecision getPrecisionDateDebut();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAction#getPrecisionDateDebut <em>Precision Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision Date Debut</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDatePrecision
	 * @see #isSetPrecisionDateDebut()
	 * @see #unsetPrecisionDateDebut()
	 * @see #getPrecisionDateDebut()
	 * @generated
	 */
	void setPrecisionDateDebut(TypeDictionaryDicoDatePrecision value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAction#getPrecisionDateDebut <em>Precision Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrecisionDateDebut()
	 * @see #getPrecisionDateDebut()
	 * @see #setPrecisionDateDebut(TypeDictionaryDicoDatePrecision)
	 * @generated
	 */
	void unsetPrecisionDateDebut();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAction#getPrecisionDateDebut <em>Precision Date Debut</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Precision Date Debut</em>' attribute is set.
	 * @see #unsetPrecisionDateDebut()
	 * @see #getPrecisionDateDebut()
	 * @see #setPrecisionDateDebut(TypeDictionaryDicoDatePrecision)
	 * @generated
	 */
	boolean isSetPrecisionDateDebut();

	/**
	 * Returns the value of the '<em><b>Code Heure Debut</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoActionCodeHeureDebut}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Heure Debut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Heure Debut</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoActionCodeHeureDebut
	 * @see #isSetCodeHeureDebut()
	 * @see #unsetCodeHeureDebut()
	 * @see #setCodeHeureDebut(TypeDictionaryDicoActionCodeHeureDebut)
	 * @see mpia.schema.SchemaPackage#getTypeAction_CodeHeureDebut()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='CodeHeureDebut'"
	 * @generated
	 */
	TypeDictionaryDicoActionCodeHeureDebut getCodeHeureDebut();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAction#getCodeHeureDebut <em>Code Heure Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Heure Debut</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoActionCodeHeureDebut
	 * @see #isSetCodeHeureDebut()
	 * @see #unsetCodeHeureDebut()
	 * @see #getCodeHeureDebut()
	 * @generated
	 */
	void setCodeHeureDebut(TypeDictionaryDicoActionCodeHeureDebut value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAction#getCodeHeureDebut <em>Code Heure Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCodeHeureDebut()
	 * @see #getCodeHeureDebut()
	 * @see #setCodeHeureDebut(TypeDictionaryDicoActionCodeHeureDebut)
	 * @generated
	 */
	void unsetCodeHeureDebut();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAction#getCodeHeureDebut <em>Code Heure Debut</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Code Heure Debut</em>' attribute is set.
	 * @see #unsetCodeHeureDebut()
	 * @see #getCodeHeureDebut()
	 * @see #setCodeHeureDebut(TypeDictionaryDicoActionCodeHeureDebut)
	 * @generated
	 */
	boolean isSetCodeHeureDebut();

	/**
	 * Returns the value of the '<em><b>Precision Date Fin</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoDatePrecision}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision Date Fin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision Date Fin</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDatePrecision
	 * @see #isSetPrecisionDateFin()
	 * @see #unsetPrecisionDateFin()
	 * @see #setPrecisionDateFin(TypeDictionaryDicoDatePrecision)
	 * @see mpia.schema.SchemaPackage#getTypeAction_PrecisionDateFin()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='PrecisionDateFin'"
	 * @generated
	 */
	TypeDictionaryDicoDatePrecision getPrecisionDateFin();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAction#getPrecisionDateFin <em>Precision Date Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision Date Fin</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDatePrecision
	 * @see #isSetPrecisionDateFin()
	 * @see #unsetPrecisionDateFin()
	 * @see #getPrecisionDateFin()
	 * @generated
	 */
	void setPrecisionDateFin(TypeDictionaryDicoDatePrecision value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAction#getPrecisionDateFin <em>Precision Date Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrecisionDateFin()
	 * @see #getPrecisionDateFin()
	 * @see #setPrecisionDateFin(TypeDictionaryDicoDatePrecision)
	 * @generated
	 */
	void unsetPrecisionDateFin();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAction#getPrecisionDateFin <em>Precision Date Fin</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Precision Date Fin</em>' attribute is set.
	 * @see #unsetPrecisionDateFin()
	 * @see #getPrecisionDateFin()
	 * @see #setPrecisionDateFin(TypeDictionaryDicoDatePrecision)
	 * @generated
	 */
	boolean isSetPrecisionDateFin();

	/**
	 * Returns the value of the '<em><b>Code Jour Debut</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoActionCodeJourDebut}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Jour Debut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Jour Debut</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoActionCodeJourDebut
	 * @see #isSetCodeJourDebut()
	 * @see #unsetCodeJourDebut()
	 * @see #setCodeJourDebut(TypeDictionaryDicoActionCodeJourDebut)
	 * @see mpia.schema.SchemaPackage#getTypeAction_CodeJourDebut()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='CodeJourDebut'"
	 * @generated
	 */
	TypeDictionaryDicoActionCodeJourDebut getCodeJourDebut();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAction#getCodeJourDebut <em>Code Jour Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Jour Debut</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoActionCodeJourDebut
	 * @see #isSetCodeJourDebut()
	 * @see #unsetCodeJourDebut()
	 * @see #getCodeJourDebut()
	 * @generated
	 */
	void setCodeJourDebut(TypeDictionaryDicoActionCodeJourDebut value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAction#getCodeJourDebut <em>Code Jour Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCodeJourDebut()
	 * @see #getCodeJourDebut()
	 * @see #setCodeJourDebut(TypeDictionaryDicoActionCodeJourDebut)
	 * @generated
	 */
	void unsetCodeJourDebut();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAction#getCodeJourDebut <em>Code Jour Debut</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Code Jour Debut</em>' attribute is set.
	 * @see #unsetCodeJourDebut()
	 * @see #getCodeJourDebut()
	 * @see #setCodeJourDebut(TypeDictionaryDicoActionCodeJourDebut)
	 * @generated
	 */
	boolean isSetCodeJourDebut();

	/**
	 * Returns the value of the '<em><b>APour Etat Etat Action</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeEtatAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Etat Etat Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Etat Etat Action</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeAction_APourEtatEtatAction()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EtatAction'"
	 *        extendedMetaData="kind='element' name='APourEtat_EtatAction'"
	 * @generated
	 */
	EList<TypeEtatAction> getAPourEtatEtatAction();

	/**
	 * Returns the value of the '<em><b>Necessite Articulation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Necessite Articulation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Necessite Articulation</em>' containment reference.
	 * @see #setNecessiteArticulation(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAction_NecessiteArticulation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSpecifieePour_Action' target_entity='type_Articulation'"
	 *        extendedMetaData="kind='element' name='Necessite_Articulation'"
	 * @generated
	 */
	TypeAssociation getNecessiteArticulation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAction#getNecessiteArticulation <em>Necessite Articulation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Necessite Articulation</em>' containment reference.
	 * @see #getNecessiteArticulation()
	 * @generated
	 */
	void setNecessiteArticulation(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Est Objet Association Entite Org Action</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Entite Org Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Entite Org Action</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeAction_EstObjetAssociationEntiteOrgAction()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_Action' target_entity='type_AssociationEntiteOrgAction'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationEntiteOrgAction'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationEntiteOrgAction();

	/**
	 * Returns the value of the '<em><b>APour Unite Sout Unite Sic Unite Cooperante</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeUniteCooperante}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite Sout Unite Sic Unite Cooperante</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite Sout Unite Sic Unite Cooperante</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeAction_APourUniteSoutUniteSicUniteCooperante()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_UniteCooperante'"
	 *        extendedMetaData="kind='element' name='APourUniteSoutUniteSic_UniteCooperante'"
	 * @generated
	 */
	EList<TypeUniteCooperante> getAPourUniteSoutUniteSicUniteCooperante();

	/**
	 * Returns the value of the '<em><b>APour Zone Recherche Zone Recherche</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Zone Recherche Zone Recherche</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Zone Recherche Zone Recherche</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeAction_APourZoneRechercheZoneRecherche()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='FaitObjet_Action' target_entity='type_ZoneRecherche'"
	 *        extendedMetaData="kind='element' name='APourZoneRecherche_ZoneRecherche'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourZoneRechercheZoneRecherche();

	/**
	 * Returns the value of the '<em><b>APour Ressource Ressource Activite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeRessourceActivite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Ressource Ressource Activite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Ressource Ressource Activite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeAction_APourRessourceRessourceActivite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_RessourceActivite'"
	 *        extendedMetaData="kind='element' name='APourRessource_RessourceActivite'"
	 * @generated
	 */
	EList<TypeRessourceActivite> getAPourRessourceRessourceActivite();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Mission Melee Action</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Mission Melee Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Mission Melee Action</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeAction_EstObjetAssociationMissionMeleeAction()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeObjet_Action' target_entity='type_AssociationMissionMeleeAction'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationMissionMeleeAction'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationMissionMeleeAction();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Mission Renseignement Action</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Mission Renseignement Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Mission Renseignement Action</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeAction_EstObjetAssociationMissionRenseignementAction()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeObjet_Action' target_entity='type_AssociationMissionRenseignementAction'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationMissionRenseignementAction'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationMissionRenseignementAction();

	/**
	 * Returns the value of the '<em><b>AComme Liste Objectifs Candidats Liste Objectifs Candidats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Liste Objectifs Candidats Liste Objectifs Candidats</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Liste Objectifs Candidats Liste Objectifs Candidats</em>' containment reference.
	 * @see #setACommeListeObjectifsCandidatsListeObjectifsCandidats(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAction_ACommeListeObjectifsCandidatsListeObjectifsCandidats()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_ListeObjectifsCandidats'"
	 *        extendedMetaData="kind='element' name='ACommeListeObjectifsCandidats_ListeObjectifsCandidats'"
	 * @generated
	 */
	TypeAssociation getACommeListeObjectifsCandidatsListeObjectifsCandidats();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAction#getACommeListeObjectifsCandidatsListeObjectifsCandidats <em>AComme Liste Objectifs Candidats Liste Objectifs Candidats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Liste Objectifs Candidats Liste Objectifs Candidats</em>' containment reference.
	 * @see #getACommeListeObjectifsCandidatsListeObjectifsCandidats()
	 * @generated
	 */
	void setACommeListeObjectifsCandidatsListeObjectifsCandidats(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Est Objet Association Action Action</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Action Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Action Action</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeAction_EstObjetAssociationActionAction()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeObjet_Action' target_entity='type_AssociationActionAction'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationActionAction'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationActionAction();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Action Action</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Action Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Action Action</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeAction_EstSujetAssociationActionAction()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeSujet_Action' target_entity='type_AssociationActionAction'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationActionAction'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationActionAction();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Evenement NRBC Action</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Evenement NRBC Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Evenement NRBC Action</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeAction_EstObjetAssociationEvenementNRBCAction()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeObjet_Action' target_entity='type_AssociationEvenementNRBCAction'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationEvenementNRBCAction'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationEvenementNRBCAction();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Action Evenement NRBC</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Action Evenement NRBC</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Action Evenement NRBC</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeAction_EstSujetAssociationActionEvenementNRBC()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeSujet_Action' target_entity='type_AssociationActionEvenementNRBC'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationActionEvenementNRBC'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationActionEvenementNRBC();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Autre Evenement Action</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Autre Evenement Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Autre Evenement Action</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeAction_EstObjetAssociationAutreEvenementAction()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeObjet_Action' target_entity='type_AssociationAutreEvenementAction'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationAutreEvenementAction'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationAutreEvenementAction();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Action Autre Evenement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Action Autre Evenement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Action Autre Evenement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeAction_EstSujetAssociationActionAutreEvenement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeSujet_Action' target_entity='type_AssociationActionAutreEvenement'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationActionAutreEvenement'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationActionAutreEvenement();

	/**
	 * Returns the value of the '<em><b>APour Regle Engagement Regle Engagement Action</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeRegleEngagementAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Regle Engagement Regle Engagement Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Regle Engagement Regle Engagement Action</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeAction_APourRegleEngagementRegleEngagementAction()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_RegleEngagementAction'"
	 *        extendedMetaData="kind='element' name='APourRegleEngagement_RegleEngagementAction'"
	 * @generated
	 */
	EList<TypeRegleEngagementAction> getAPourRegleEngagementRegleEngagementAction();

} // TypeAction
