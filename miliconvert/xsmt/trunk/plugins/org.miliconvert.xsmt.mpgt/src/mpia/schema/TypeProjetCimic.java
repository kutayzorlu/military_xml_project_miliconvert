/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Projet Cimic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeProjetCimic#getIdentifiant <em>Identifiant</em>}</li>
 *   <li>{@link mpia.schema.TypeProjetCimic#getType <em>Type</em>}</li>
 *   <li>{@link mpia.schema.TypeProjetCimic#getDomaine <em>Domaine</em>}</li>
 *   <li>{@link mpia.schema.TypeProjetCimic#getEtatDemande <em>Etat Demande</em>}</li>
 *   <li>{@link mpia.schema.TypeProjetCimic#getOrganismeBeneficiaire <em>Organisme Beneficiaire</em>}</li>
 *   <li>{@link mpia.schema.TypeProjetCimic#getOrigineDemande <em>Origine Demande</em>}</li>
 *   <li>{@link mpia.schema.TypeProjetCimic#getObjectif <em>Objectif</em>}</li>
 *   <li>{@link mpia.schema.TypeProjetCimic#getImpact <em>Impact</em>}</li>
 *   <li>{@link mpia.schema.TypeProjetCimic#getInitiative <em>Initiative</em>}</li>
 *   <li>{@link mpia.schema.TypeProjetCimic#getSituationDemande <em>Situation Demande</em>}</li>
 *   <li>{@link mpia.schema.TypeProjetCimic#getPilote <em>Pilote</em>}</li>
 *   <li>{@link mpia.schema.TypeProjetCimic#getPiloteAssistant <em>Pilote Assistant</em>}</li>
 *   <li>{@link mpia.schema.TypeProjetCimic#getOrigineFonds <em>Origine Fonds</em>}</li>
 *   <li>{@link mpia.schema.TypeProjetCimic#getBudgetDevise <em>Budget Devise</em>}</li>
 *   <li>{@link mpia.schema.TypeProjetCimic#getBudgetMontant <em>Budget Montant</em>}</li>
 *   <li>{@link mpia.schema.TypeProjetCimic#getDepenseMontant <em>Depense Montant</em>}</li>
 *   <li>{@link mpia.schema.TypeProjetCimic#getEtatTravaux <em>Etat Travaux</em>}</li>
 *   <li>{@link mpia.schema.TypeProjetCimic#getPourcentAvancement <em>Pourcent Avancement</em>}</li>
 *   <li>{@link mpia.schema.TypeProjetCimic#getLieu <em>Lieu</em>}</li>
 *   <li>{@link mpia.schema.TypeProjetCimic#getMunicipalite <em>Municipalite</em>}</li>
 *   <li>{@link mpia.schema.TypeProjetCimic#getNation <em>Nation</em>}</li>
 *   <li>{@link mpia.schema.TypeProjetCimic#getGdhPrevisionnelDebut <em>Gdh Previsionnel Debut</em>}</li>
 *   <li>{@link mpia.schema.TypeProjetCimic#getGdhPrevisionnelFin <em>Gdh Previsionnel Fin</em>}</li>
 *   <li>{@link mpia.schema.TypeProjetCimic#getGdhReelDebut <em>Gdh Reel Debut</em>}</li>
 *   <li>{@link mpia.schema.TypeProjetCimic#getGdhReelFin <em>Gdh Reel Fin</em>}</li>
 *   <li>{@link mpia.schema.TypeProjetCimic#getDocumentCommunication <em>Document Communication</em>}</li>
 *   <li>{@link mpia.schema.TypeProjetCimic#getDocumentFaisabilite <em>Document Faisabilite</em>}</li>
 *   <li>{@link mpia.schema.TypeProjetCimic#getCouleurRGB <em>Couleur RGB</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeProjetCimic()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_ProjetCimic' kind='elementOnly'"
 * @generated
 */
public interface TypeProjetCimic extends TypeActivite {
	/**
	 * Returns the value of the '<em><b>Identifiant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifiant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifiant</em>' attribute.
	 * @see #setIdentifiant(String)
	 * @see mpia.schema.SchemaPackage#getTypeProjetCimic_Identifiant()
	 * @model dataType="mpia.meta.TypeDataTypeChaine012"
	 *        extendedMetaData="kind='element' name='Identifiant'"
	 * @generated
	 */
	String getIdentifiant();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeProjetCimic#getIdentifiant <em>Identifiant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifiant</em>' attribute.
	 * @see #getIdentifiant()
	 * @generated
	 */
	void setIdentifiant(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeProjetCimic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeProjetCimic
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeDictionaryDicoTypeProjetCimic)
	 * @see mpia.schema.SchemaPackage#getTypeProjetCimic_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Type'"
	 * @generated
	 */
	TypeDictionaryDicoTypeProjetCimic getType();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeProjetCimic#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeProjetCimic
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeDictionaryDicoTypeProjetCimic value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeProjetCimic#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeDictionaryDicoTypeProjetCimic)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeProjetCimic#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeDictionaryDicoTypeProjetCimic)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Domaine</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoDomaineProjetCimic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domaine</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domaine</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDomaineProjetCimic
	 * @see #isSetDomaine()
	 * @see #unsetDomaine()
	 * @see #setDomaine(TypeDictionaryDicoDomaineProjetCimic)
	 * @see mpia.schema.SchemaPackage#getTypeProjetCimic_Domaine()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Domaine'"
	 * @generated
	 */
	TypeDictionaryDicoDomaineProjetCimic getDomaine();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeProjetCimic#getDomaine <em>Domaine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domaine</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDomaineProjetCimic
	 * @see #isSetDomaine()
	 * @see #unsetDomaine()
	 * @see #getDomaine()
	 * @generated
	 */
	void setDomaine(TypeDictionaryDicoDomaineProjetCimic value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeProjetCimic#getDomaine <em>Domaine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDomaine()
	 * @see #getDomaine()
	 * @see #setDomaine(TypeDictionaryDicoDomaineProjetCimic)
	 * @generated
	 */
	void unsetDomaine();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeProjetCimic#getDomaine <em>Domaine</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Domaine</em>' attribute is set.
	 * @see #unsetDomaine()
	 * @see #getDomaine()
	 * @see #setDomaine(TypeDictionaryDicoDomaineProjetCimic)
	 * @generated
	 */
	boolean isSetDomaine();

	/**
	 * Returns the value of the '<em><b>Etat Demande</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatProjetCimic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Demande</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Demande</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatProjetCimic
	 * @see #isSetEtatDemande()
	 * @see #unsetEtatDemande()
	 * @see #setEtatDemande(TypeDictionaryDicoEtatProjetCimic)
	 * @see mpia.schema.SchemaPackage#getTypeProjetCimic_EtatDemande()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EtatDemande'"
	 * @generated
	 */
	TypeDictionaryDicoEtatProjetCimic getEtatDemande();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeProjetCimic#getEtatDemande <em>Etat Demande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Demande</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatProjetCimic
	 * @see #isSetEtatDemande()
	 * @see #unsetEtatDemande()
	 * @see #getEtatDemande()
	 * @generated
	 */
	void setEtatDemande(TypeDictionaryDicoEtatProjetCimic value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeProjetCimic#getEtatDemande <em>Etat Demande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEtatDemande()
	 * @see #getEtatDemande()
	 * @see #setEtatDemande(TypeDictionaryDicoEtatProjetCimic)
	 * @generated
	 */
	void unsetEtatDemande();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeProjetCimic#getEtatDemande <em>Etat Demande</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Etat Demande</em>' attribute is set.
	 * @see #unsetEtatDemande()
	 * @see #getEtatDemande()
	 * @see #setEtatDemande(TypeDictionaryDicoEtatProjetCimic)
	 * @generated
	 */
	boolean isSetEtatDemande();

	/**
	 * Returns the value of the '<em><b>Organisme Beneficiaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organisme Beneficiaire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organisme Beneficiaire</em>' attribute.
	 * @see #setOrganismeBeneficiaire(String)
	 * @see mpia.schema.SchemaPackage#getTypeProjetCimic_OrganismeBeneficiaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='OrganismeBeneficiaire'"
	 * @generated
	 */
	String getOrganismeBeneficiaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeProjetCimic#getOrganismeBeneficiaire <em>Organisme Beneficiaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organisme Beneficiaire</em>' attribute.
	 * @see #getOrganismeBeneficiaire()
	 * @generated
	 */
	void setOrganismeBeneficiaire(String value);

	/**
	 * Returns the value of the '<em><b>Origine Demande</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origine Demande</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origine Demande</em>' attribute.
	 * @see #setOrigineDemande(String)
	 * @see mpia.schema.SchemaPackage#getTypeProjetCimic_OrigineDemande()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='OrigineDemande'"
	 * @generated
	 */
	String getOrigineDemande();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeProjetCimic#getOrigineDemande <em>Origine Demande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origine Demande</em>' attribute.
	 * @see #getOrigineDemande()
	 * @generated
	 */
	void setOrigineDemande(String value);

	/**
	 * Returns the value of the '<em><b>Objectif</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objectif</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objectif</em>' attribute.
	 * @see #setObjectif(String)
	 * @see mpia.schema.SchemaPackage#getTypeProjetCimic_Objectif()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='Objectif'"
	 * @generated
	 */
	String getObjectif();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeProjetCimic#getObjectif <em>Objectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objectif</em>' attribute.
	 * @see #getObjectif()
	 * @generated
	 */
	void setObjectif(String value);

	/**
	 * Returns the value of the '<em><b>Impact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impact</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impact</em>' attribute.
	 * @see #setImpact(String)
	 * @see mpia.schema.SchemaPackage#getTypeProjetCimic_Impact()
	 * @model dataType="mpia.meta.TypeDataTypeChaine03"
	 *        extendedMetaData="kind='element' name='Impact'"
	 * @generated
	 */
	String getImpact();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeProjetCimic#getImpact <em>Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impact</em>' attribute.
	 * @see #getImpact()
	 * @generated
	 */
	void setImpact(String value);

	/**
	 * Returns the value of the '<em><b>Initiative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initiative</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initiative</em>' attribute.
	 * @see #setInitiative(String)
	 * @see mpia.schema.SchemaPackage#getTypeProjetCimic_Initiative()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='Initiative'"
	 * @generated
	 */
	String getInitiative();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeProjetCimic#getInitiative <em>Initiative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initiative</em>' attribute.
	 * @see #getInitiative()
	 * @generated
	 */
	void setInitiative(String value);

	/**
	 * Returns the value of the '<em><b>Situation Demande</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Situation Demande</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Situation Demande</em>' attribute.
	 * @see #setSituationDemande(String)
	 * @see mpia.schema.SchemaPackage#getTypeProjetCimic_SituationDemande()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='SituationDemande'"
	 * @generated
	 */
	String getSituationDemande();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeProjetCimic#getSituationDemande <em>Situation Demande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Situation Demande</em>' attribute.
	 * @see #getSituationDemande()
	 * @generated
	 */
	void setSituationDemande(String value);

	/**
	 * Returns the value of the '<em><b>Pilote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pilote</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pilote</em>' attribute.
	 * @see #setPilote(String)
	 * @see mpia.schema.SchemaPackage#getTypeProjetCimic_Pilote()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='Pilote'"
	 * @generated
	 */
	String getPilote();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeProjetCimic#getPilote <em>Pilote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pilote</em>' attribute.
	 * @see #getPilote()
	 * @generated
	 */
	void setPilote(String value);

	/**
	 * Returns the value of the '<em><b>Pilote Assistant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pilote Assistant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pilote Assistant</em>' attribute.
	 * @see #setPiloteAssistant(String)
	 * @see mpia.schema.SchemaPackage#getTypeProjetCimic_PiloteAssistant()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='PiloteAssistant'"
	 * @generated
	 */
	String getPiloteAssistant();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeProjetCimic#getPiloteAssistant <em>Pilote Assistant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pilote Assistant</em>' attribute.
	 * @see #getPiloteAssistant()
	 * @generated
	 */
	void setPiloteAssistant(String value);

	/**
	 * Returns the value of the '<em><b>Origine Fonds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origine Fonds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origine Fonds</em>' attribute.
	 * @see #setOrigineFonds(String)
	 * @see mpia.schema.SchemaPackage#getTypeProjetCimic_OrigineFonds()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='OrigineFonds'"
	 * @generated
	 */
	String getOrigineFonds();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeProjetCimic#getOrigineFonds <em>Origine Fonds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origine Fonds</em>' attribute.
	 * @see #getOrigineFonds()
	 * @generated
	 */
	void setOrigineFonds(String value);

	/**
	 * Returns the value of the '<em><b>Budget Devise</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoDeviseProjetCimic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Budget Devise</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budget Devise</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDeviseProjetCimic
	 * @see #isSetBudgetDevise()
	 * @see #unsetBudgetDevise()
	 * @see #setBudgetDevise(TypeDictionaryDicoDeviseProjetCimic)
	 * @see mpia.schema.SchemaPackage#getTypeProjetCimic_BudgetDevise()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='BudgetDevise'"
	 * @generated
	 */
	TypeDictionaryDicoDeviseProjetCimic getBudgetDevise();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeProjetCimic#getBudgetDevise <em>Budget Devise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Budget Devise</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDeviseProjetCimic
	 * @see #isSetBudgetDevise()
	 * @see #unsetBudgetDevise()
	 * @see #getBudgetDevise()
	 * @generated
	 */
	void setBudgetDevise(TypeDictionaryDicoDeviseProjetCimic value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeProjetCimic#getBudgetDevise <em>Budget Devise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBudgetDevise()
	 * @see #getBudgetDevise()
	 * @see #setBudgetDevise(TypeDictionaryDicoDeviseProjetCimic)
	 * @generated
	 */
	void unsetBudgetDevise();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeProjetCimic#getBudgetDevise <em>Budget Devise</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Budget Devise</em>' attribute is set.
	 * @see #unsetBudgetDevise()
	 * @see #getBudgetDevise()
	 * @see #setBudgetDevise(TypeDictionaryDicoDeviseProjetCimic)
	 * @generated
	 */
	boolean isSetBudgetDevise();

	/**
	 * Returns the value of the '<em><b>Budget Montant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Budget Montant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budget Montant</em>' attribute.
	 * @see #isSetBudgetMontant()
	 * @see #unsetBudgetMontant()
	 * @see #setBudgetMontant(double)
	 * @see mpia.schema.SchemaPackage#getTypeProjetCimic_BudgetMontant()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='BudgetMontant'"
	 * @generated
	 */
	double getBudgetMontant();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeProjetCimic#getBudgetMontant <em>Budget Montant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Budget Montant</em>' attribute.
	 * @see #isSetBudgetMontant()
	 * @see #unsetBudgetMontant()
	 * @see #getBudgetMontant()
	 * @generated
	 */
	void setBudgetMontant(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeProjetCimic#getBudgetMontant <em>Budget Montant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBudgetMontant()
	 * @see #getBudgetMontant()
	 * @see #setBudgetMontant(double)
	 * @generated
	 */
	void unsetBudgetMontant();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeProjetCimic#getBudgetMontant <em>Budget Montant</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Budget Montant</em>' attribute is set.
	 * @see #unsetBudgetMontant()
	 * @see #getBudgetMontant()
	 * @see #setBudgetMontant(double)
	 * @generated
	 */
	boolean isSetBudgetMontant();

	/**
	 * Returns the value of the '<em><b>Depense Montant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depense Montant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depense Montant</em>' attribute.
	 * @see #isSetDepenseMontant()
	 * @see #unsetDepenseMontant()
	 * @see #setDepenseMontant(double)
	 * @see mpia.schema.SchemaPackage#getTypeProjetCimic_DepenseMontant()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='DepenseMontant'"
	 * @generated
	 */
	double getDepenseMontant();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeProjetCimic#getDepenseMontant <em>Depense Montant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depense Montant</em>' attribute.
	 * @see #isSetDepenseMontant()
	 * @see #unsetDepenseMontant()
	 * @see #getDepenseMontant()
	 * @generated
	 */
	void setDepenseMontant(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeProjetCimic#getDepenseMontant <em>Depense Montant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDepenseMontant()
	 * @see #getDepenseMontant()
	 * @see #setDepenseMontant(double)
	 * @generated
	 */
	void unsetDepenseMontant();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeProjetCimic#getDepenseMontant <em>Depense Montant</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Depense Montant</em>' attribute is set.
	 * @see #unsetDepenseMontant()
	 * @see #getDepenseMontant()
	 * @see #setDepenseMontant(double)
	 * @generated
	 */
	boolean isSetDepenseMontant();

	/**
	 * Returns the value of the '<em><b>Etat Travaux</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatProjetCimic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Travaux</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Travaux</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatProjetCimic
	 * @see #isSetEtatTravaux()
	 * @see #unsetEtatTravaux()
	 * @see #setEtatTravaux(TypeDictionaryDicoEtatProjetCimic)
	 * @see mpia.schema.SchemaPackage#getTypeProjetCimic_EtatTravaux()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EtatTravaux'"
	 * @generated
	 */
	TypeDictionaryDicoEtatProjetCimic getEtatTravaux();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeProjetCimic#getEtatTravaux <em>Etat Travaux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Travaux</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatProjetCimic
	 * @see #isSetEtatTravaux()
	 * @see #unsetEtatTravaux()
	 * @see #getEtatTravaux()
	 * @generated
	 */
	void setEtatTravaux(TypeDictionaryDicoEtatProjetCimic value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeProjetCimic#getEtatTravaux <em>Etat Travaux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEtatTravaux()
	 * @see #getEtatTravaux()
	 * @see #setEtatTravaux(TypeDictionaryDicoEtatProjetCimic)
	 * @generated
	 */
	void unsetEtatTravaux();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeProjetCimic#getEtatTravaux <em>Etat Travaux</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Etat Travaux</em>' attribute is set.
	 * @see #unsetEtatTravaux()
	 * @see #getEtatTravaux()
	 * @see #setEtatTravaux(TypeDictionaryDicoEtatProjetCimic)
	 * @generated
	 */
	boolean isSetEtatTravaux();

	/**
	 * Returns the value of the '<em><b>Pourcent Avancement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pourcent Avancement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pourcent Avancement</em>' attribute.
	 * @see #isSetPourcentAvancement()
	 * @see #unsetPourcentAvancement()
	 * @see #setPourcentAvancement(long)
	 * @see mpia.schema.SchemaPackage#getTypeProjetCimic_PourcentAvancement()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='PourcentAvancement'"
	 * @generated
	 */
	long getPourcentAvancement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeProjetCimic#getPourcentAvancement <em>Pourcent Avancement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pourcent Avancement</em>' attribute.
	 * @see #isSetPourcentAvancement()
	 * @see #unsetPourcentAvancement()
	 * @see #getPourcentAvancement()
	 * @generated
	 */
	void setPourcentAvancement(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeProjetCimic#getPourcentAvancement <em>Pourcent Avancement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPourcentAvancement()
	 * @see #getPourcentAvancement()
	 * @see #setPourcentAvancement(long)
	 * @generated
	 */
	void unsetPourcentAvancement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeProjetCimic#getPourcentAvancement <em>Pourcent Avancement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pourcent Avancement</em>' attribute is set.
	 * @see #unsetPourcentAvancement()
	 * @see #getPourcentAvancement()
	 * @see #setPourcentAvancement(long)
	 * @generated
	 */
	boolean isSetPourcentAvancement();

	/**
	 * Returns the value of the '<em><b>Lieu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lieu</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lieu</em>' attribute.
	 * @see #setLieu(String)
	 * @see mpia.schema.SchemaPackage#getTypeProjetCimic_Lieu()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='Lieu'"
	 * @generated
	 */
	String getLieu();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeProjetCimic#getLieu <em>Lieu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lieu</em>' attribute.
	 * @see #getLieu()
	 * @generated
	 */
	void setLieu(String value);

	/**
	 * Returns the value of the '<em><b>Municipalite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Municipalite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Municipalite</em>' attribute.
	 * @see #setMunicipalite(String)
	 * @see mpia.schema.SchemaPackage#getTypeProjetCimic_Municipalite()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='Municipalite'"
	 * @generated
	 */
	String getMunicipalite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeProjetCimic#getMunicipalite <em>Municipalite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Municipalite</em>' attribute.
	 * @see #getMunicipalite()
	 * @generated
	 */
	void setMunicipalite(String value);

	/**
	 * Returns the value of the '<em><b>Nation</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEntitePolitiqueTrigramme}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEntitePolitiqueTrigramme
	 * @see #isSetNation()
	 * @see #unsetNation()
	 * @see #setNation(TypeDictionaryDicoEntitePolitiqueTrigramme)
	 * @see mpia.schema.SchemaPackage#getTypeProjetCimic_Nation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Nation'"
	 * @generated
	 */
	TypeDictionaryDicoEntitePolitiqueTrigramme getNation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeProjetCimic#getNation <em>Nation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEntitePolitiqueTrigramme
	 * @see #isSetNation()
	 * @see #unsetNation()
	 * @see #getNation()
	 * @generated
	 */
	void setNation(TypeDictionaryDicoEntitePolitiqueTrigramme value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeProjetCimic#getNation <em>Nation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNation()
	 * @see #getNation()
	 * @see #setNation(TypeDictionaryDicoEntitePolitiqueTrigramme)
	 * @generated
	 */
	void unsetNation();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeProjetCimic#getNation <em>Nation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nation</em>' attribute is set.
	 * @see #unsetNation()
	 * @see #getNation()
	 * @see #setNation(TypeDictionaryDicoEntitePolitiqueTrigramme)
	 * @generated
	 */
	boolean isSetNation();

	/**
	 * Returns the value of the '<em><b>Gdh Previsionnel Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gdh Previsionnel Debut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gdh Previsionnel Debut</em>' attribute.
	 * @see #setGdhPrevisionnelDebut(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeProjetCimic_GdhPrevisionnelDebut()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='GdhPrevisionnelDebut'"
	 * @generated
	 */
	XMLGregorianCalendar getGdhPrevisionnelDebut();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeProjetCimic#getGdhPrevisionnelDebut <em>Gdh Previsionnel Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gdh Previsionnel Debut</em>' attribute.
	 * @see #getGdhPrevisionnelDebut()
	 * @generated
	 */
	void setGdhPrevisionnelDebut(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Gdh Previsionnel Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gdh Previsionnel Fin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gdh Previsionnel Fin</em>' attribute.
	 * @see #setGdhPrevisionnelFin(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeProjetCimic_GdhPrevisionnelFin()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='GdhPrevisionnelFin'"
	 * @generated
	 */
	XMLGregorianCalendar getGdhPrevisionnelFin();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeProjetCimic#getGdhPrevisionnelFin <em>Gdh Previsionnel Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gdh Previsionnel Fin</em>' attribute.
	 * @see #getGdhPrevisionnelFin()
	 * @generated
	 */
	void setGdhPrevisionnelFin(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Gdh Reel Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gdh Reel Debut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gdh Reel Debut</em>' attribute.
	 * @see #setGdhReelDebut(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeProjetCimic_GdhReelDebut()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='GdhReelDebut'"
	 * @generated
	 */
	XMLGregorianCalendar getGdhReelDebut();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeProjetCimic#getGdhReelDebut <em>Gdh Reel Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gdh Reel Debut</em>' attribute.
	 * @see #getGdhReelDebut()
	 * @generated
	 */
	void setGdhReelDebut(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Gdh Reel Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gdh Reel Fin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gdh Reel Fin</em>' attribute.
	 * @see #setGdhReelFin(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeProjetCimic_GdhReelFin()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='GdhReelFin'"
	 * @generated
	 */
	XMLGregorianCalendar getGdhReelFin();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeProjetCimic#getGdhReelFin <em>Gdh Reel Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gdh Reel Fin</em>' attribute.
	 * @see #getGdhReelFin()
	 * @generated
	 */
	void setGdhReelFin(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Document Communication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Communication</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Communication</em>' attribute.
	 * @see #setDocumentCommunication(String)
	 * @see mpia.schema.SchemaPackage#getTypeProjetCimic_DocumentCommunication()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='DocumentCommunication'"
	 * @generated
	 */
	String getDocumentCommunication();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeProjetCimic#getDocumentCommunication <em>Document Communication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Communication</em>' attribute.
	 * @see #getDocumentCommunication()
	 * @generated
	 */
	void setDocumentCommunication(String value);

	/**
	 * Returns the value of the '<em><b>Document Faisabilite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Faisabilite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Faisabilite</em>' attribute.
	 * @see #setDocumentFaisabilite(String)
	 * @see mpia.schema.SchemaPackage#getTypeProjetCimic_DocumentFaisabilite()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='DocumentFaisabilite'"
	 * @generated
	 */
	String getDocumentFaisabilite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeProjetCimic#getDocumentFaisabilite <em>Document Faisabilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Faisabilite</em>' attribute.
	 * @see #getDocumentFaisabilite()
	 * @generated
	 */
	void setDocumentFaisabilite(String value);

	/**
	 * Returns the value of the '<em><b>Couleur RGB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Couleur RGB</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Couleur RGB</em>' attribute.
	 * @see #setCouleurRGB(String)
	 * @see mpia.schema.SchemaPackage#getTypeProjetCimic_CouleurRGB()
	 * @model dataType="mpia.meta.TypeDataTypeChaine020"
	 *        extendedMetaData="kind='element' name='CouleurRGB'"
	 * @generated
	 */
	String getCouleurRGB();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeProjetCimic#getCouleurRGB <em>Couleur RGB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Couleur RGB</em>' attribute.
	 * @see #getCouleurRGB()
	 * @generated
	 */
	void setCouleurRGB(String value);

} // TypeProjetCimic
