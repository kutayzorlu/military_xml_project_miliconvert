/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Depannage Evacuation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeDepannageEvacuation#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeDepannageEvacuation#getSoutienNecessaire <em>Soutien Necessaire</em>}</li>
 *   <li>{@link mpia.schema.TypeDepannageEvacuation#getDateDemande <em>Date Demande</em>}</li>
 *   <li>{@link mpia.schema.TypeDepannageEvacuation#getCodeEtatGeneral <em>Code Etat General</em>}</li>
 *   <li>{@link mpia.schema.TypeDepannageEvacuation#getDiagnosticSommaire <em>Diagnostic Sommaire</em>}</li>
 *   <li>{@link mpia.schema.TypeDepannageEvacuation#getEquipageDisponible <em>Equipage Disponible</em>}</li>
 *   <li>{@link mpia.schema.TypeDepannageEvacuation#getPossibiliteEvacuation <em>Possibilite Evacuation</em>}</li>
 *   <li>{@link mpia.schema.TypeDepannageEvacuation#getMoyensSupplementairesDemandes <em>Moyens Supplementaires Demandes</em>}</li>
 *   <li>{@link mpia.schema.TypeDepannageEvacuation#getMotifAnnulation <em>Motif Annulation</em>}</li>
 *   <li>{@link mpia.schema.TypeDepannageEvacuation#getTypeCompteRendu <em>Type Compte Rendu</em>}</li>
 *   <li>{@link mpia.schema.TypeDepannageEvacuation#getAPourUniteConcerneeUnite <em>APour Unite Concernee Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeDepannageEvacuation#getAPourUniteExecutanteUnite <em>APour Unite Executante Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeDepannageEvacuation#getEstObjetAssociationDepEvacuationDepEvacuation <em>Est Objet Association Dep Evacuation Dep Evacuation</em>}</li>
 *   <li>{@link mpia.schema.TypeDepannageEvacuation#getEstSujetAssociationDepEvacuationDepEvacuation <em>Est Sujet Association Dep Evacuation Dep Evacuation</em>}</li>
 *   <li>{@link mpia.schema.TypeDepannageEvacuation#getAPourAtelierUnite <em>APour Atelier Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeDepannageEvacuation#getAPourLieuRendezVousAutreElementControle <em>APour Lieu Rendez Vous Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeDepannageEvacuation#getNecessiteMoyenDepannage <em>Necessite Moyen Depannage</em>}</li>
 *   <li>{@link mpia.schema.TypeDepannageEvacuation#getAPourBesoinEnCarburantBesoinEnCarburant <em>APour Besoin En Carburant Besoin En Carburant</em>}</li>
 *   <li>{@link mpia.schema.TypeDepannageEvacuation#getDoitTenirCompteObstacle <em>Doit Tenir Compte Obstacle</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeDepannageEvacuation()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_DepannageEvacuation' kind='elementOnly'"
 * @generated
 */
public interface TypeDepannageEvacuation extends TypeActivite {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoDepannageEvacuationCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDepannageEvacuationCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoDepannageEvacuationCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeDepannageEvacuation_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoDepannageEvacuationCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDepannageEvacuation#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDepannageEvacuationCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoDepannageEvacuationCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDepannageEvacuation#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoDepannageEvacuationCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDepannageEvacuation#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoDepannageEvacuationCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Soutien Necessaire</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoDepannageEvacuationSoutienNecessaire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Soutien Necessaire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soutien Necessaire</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDepannageEvacuationSoutienNecessaire
	 * @see #isSetSoutienNecessaire()
	 * @see #unsetSoutienNecessaire()
	 * @see #setSoutienNecessaire(TypeDictionaryDicoDepannageEvacuationSoutienNecessaire)
	 * @see mpia.schema.SchemaPackage#getTypeDepannageEvacuation_SoutienNecessaire()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SoutienNecessaire'"
	 * @generated
	 */
	TypeDictionaryDicoDepannageEvacuationSoutienNecessaire getSoutienNecessaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDepannageEvacuation#getSoutienNecessaire <em>Soutien Necessaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soutien Necessaire</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDepannageEvacuationSoutienNecessaire
	 * @see #isSetSoutienNecessaire()
	 * @see #unsetSoutienNecessaire()
	 * @see #getSoutienNecessaire()
	 * @generated
	 */
	void setSoutienNecessaire(TypeDictionaryDicoDepannageEvacuationSoutienNecessaire value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDepannageEvacuation#getSoutienNecessaire <em>Soutien Necessaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSoutienNecessaire()
	 * @see #getSoutienNecessaire()
	 * @see #setSoutienNecessaire(TypeDictionaryDicoDepannageEvacuationSoutienNecessaire)
	 * @generated
	 */
	void unsetSoutienNecessaire();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDepannageEvacuation#getSoutienNecessaire <em>Soutien Necessaire</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Soutien Necessaire</em>' attribute is set.
	 * @see #unsetSoutienNecessaire()
	 * @see #getSoutienNecessaire()
	 * @see #setSoutienNecessaire(TypeDictionaryDicoDepannageEvacuationSoutienNecessaire)
	 * @generated
	 */
	boolean isSetSoutienNecessaire();

	/**
	 * Returns the value of the '<em><b>Date Demande</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Demande</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Demande</em>' attribute.
	 * @see #setDateDemande(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeDepannageEvacuation_DateDemande()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateDemande'"
	 * @generated
	 */
	XMLGregorianCalendar getDateDemande();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDepannageEvacuation#getDateDemande <em>Date Demande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Demande</em>' attribute.
	 * @see #getDateDemande()
	 * @generated
	 */
	void setDateDemande(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Code Etat General</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoDepannageEvacuationCodeEtatGeneral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Etat General</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Etat General</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDepannageEvacuationCodeEtatGeneral
	 * @see #isSetCodeEtatGeneral()
	 * @see #unsetCodeEtatGeneral()
	 * @see #setCodeEtatGeneral(TypeDictionaryDicoDepannageEvacuationCodeEtatGeneral)
	 * @see mpia.schema.SchemaPackage#getTypeDepannageEvacuation_CodeEtatGeneral()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='CodeEtatGeneral'"
	 * @generated
	 */
	TypeDictionaryDicoDepannageEvacuationCodeEtatGeneral getCodeEtatGeneral();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDepannageEvacuation#getCodeEtatGeneral <em>Code Etat General</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Etat General</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDepannageEvacuationCodeEtatGeneral
	 * @see #isSetCodeEtatGeneral()
	 * @see #unsetCodeEtatGeneral()
	 * @see #getCodeEtatGeneral()
	 * @generated
	 */
	void setCodeEtatGeneral(TypeDictionaryDicoDepannageEvacuationCodeEtatGeneral value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDepannageEvacuation#getCodeEtatGeneral <em>Code Etat General</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCodeEtatGeneral()
	 * @see #getCodeEtatGeneral()
	 * @see #setCodeEtatGeneral(TypeDictionaryDicoDepannageEvacuationCodeEtatGeneral)
	 * @generated
	 */
	void unsetCodeEtatGeneral();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDepannageEvacuation#getCodeEtatGeneral <em>Code Etat General</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Code Etat General</em>' attribute is set.
	 * @see #unsetCodeEtatGeneral()
	 * @see #getCodeEtatGeneral()
	 * @see #setCodeEtatGeneral(TypeDictionaryDicoDepannageEvacuationCodeEtatGeneral)
	 * @generated
	 */
	boolean isSetCodeEtatGeneral();

	/**
	 * Returns the value of the '<em><b>Diagnostic Sommaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagnostic Sommaire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagnostic Sommaire</em>' attribute.
	 * @see #setDiagnosticSommaire(String)
	 * @see mpia.schema.SchemaPackage#getTypeDepannageEvacuation_DiagnosticSommaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='DiagnosticSommaire'"
	 * @generated
	 */
	String getDiagnosticSommaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDepannageEvacuation#getDiagnosticSommaire <em>Diagnostic Sommaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagnostic Sommaire</em>' attribute.
	 * @see #getDiagnosticSommaire()
	 * @generated
	 */
	void setDiagnosticSommaire(String value);

	/**
	 * Returns the value of the '<em><b>Equipage Disponible</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoDepannageEvacuationEquipageDisponible}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equipage Disponible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equipage Disponible</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDepannageEvacuationEquipageDisponible
	 * @see #isSetEquipageDisponible()
	 * @see #unsetEquipageDisponible()
	 * @see #setEquipageDisponible(TypeDictionaryDicoDepannageEvacuationEquipageDisponible)
	 * @see mpia.schema.SchemaPackage#getTypeDepannageEvacuation_EquipageDisponible()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EquipageDisponible'"
	 * @generated
	 */
	TypeDictionaryDicoDepannageEvacuationEquipageDisponible getEquipageDisponible();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDepannageEvacuation#getEquipageDisponible <em>Equipage Disponible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equipage Disponible</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDepannageEvacuationEquipageDisponible
	 * @see #isSetEquipageDisponible()
	 * @see #unsetEquipageDisponible()
	 * @see #getEquipageDisponible()
	 * @generated
	 */
	void setEquipageDisponible(TypeDictionaryDicoDepannageEvacuationEquipageDisponible value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDepannageEvacuation#getEquipageDisponible <em>Equipage Disponible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEquipageDisponible()
	 * @see #getEquipageDisponible()
	 * @see #setEquipageDisponible(TypeDictionaryDicoDepannageEvacuationEquipageDisponible)
	 * @generated
	 */
	void unsetEquipageDisponible();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDepannageEvacuation#getEquipageDisponible <em>Equipage Disponible</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Equipage Disponible</em>' attribute is set.
	 * @see #unsetEquipageDisponible()
	 * @see #getEquipageDisponible()
	 * @see #setEquipageDisponible(TypeDictionaryDicoDepannageEvacuationEquipageDisponible)
	 * @generated
	 */
	boolean isSetEquipageDisponible();

	/**
	 * Returns the value of the '<em><b>Possibilite Evacuation</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoDepannageEvacuationPossibiliteEvacuation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Possibilite Evacuation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Possibilite Evacuation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDepannageEvacuationPossibiliteEvacuation
	 * @see #isSetPossibiliteEvacuation()
	 * @see #unsetPossibiliteEvacuation()
	 * @see #setPossibiliteEvacuation(TypeDictionaryDicoDepannageEvacuationPossibiliteEvacuation)
	 * @see mpia.schema.SchemaPackage#getTypeDepannageEvacuation_PossibiliteEvacuation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='PossibiliteEvacuation'"
	 * @generated
	 */
	TypeDictionaryDicoDepannageEvacuationPossibiliteEvacuation getPossibiliteEvacuation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDepannageEvacuation#getPossibiliteEvacuation <em>Possibilite Evacuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Possibilite Evacuation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDepannageEvacuationPossibiliteEvacuation
	 * @see #isSetPossibiliteEvacuation()
	 * @see #unsetPossibiliteEvacuation()
	 * @see #getPossibiliteEvacuation()
	 * @generated
	 */
	void setPossibiliteEvacuation(TypeDictionaryDicoDepannageEvacuationPossibiliteEvacuation value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDepannageEvacuation#getPossibiliteEvacuation <em>Possibilite Evacuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPossibiliteEvacuation()
	 * @see #getPossibiliteEvacuation()
	 * @see #setPossibiliteEvacuation(TypeDictionaryDicoDepannageEvacuationPossibiliteEvacuation)
	 * @generated
	 */
	void unsetPossibiliteEvacuation();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDepannageEvacuation#getPossibiliteEvacuation <em>Possibilite Evacuation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Possibilite Evacuation</em>' attribute is set.
	 * @see #unsetPossibiliteEvacuation()
	 * @see #getPossibiliteEvacuation()
	 * @see #setPossibiliteEvacuation(TypeDictionaryDicoDepannageEvacuationPossibiliteEvacuation)
	 * @generated
	 */
	boolean isSetPossibiliteEvacuation();

	/**
	 * Returns the value of the '<em><b>Moyens Supplementaires Demandes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moyens Supplementaires Demandes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moyens Supplementaires Demandes</em>' attribute.
	 * @see #setMoyensSupplementairesDemandes(String)
	 * @see mpia.schema.SchemaPackage#getTypeDepannageEvacuation_MoyensSupplementairesDemandes()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='MoyensSupplementairesDemandes'"
	 * @generated
	 */
	String getMoyensSupplementairesDemandes();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDepannageEvacuation#getMoyensSupplementairesDemandes <em>Moyens Supplementaires Demandes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moyens Supplementaires Demandes</em>' attribute.
	 * @see #getMoyensSupplementairesDemandes()
	 * @generated
	 */
	void setMoyensSupplementairesDemandes(String value);

	/**
	 * Returns the value of the '<em><b>Motif Annulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Motif Annulation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Motif Annulation</em>' attribute.
	 * @see #setMotifAnnulation(String)
	 * @see mpia.schema.SchemaPackage#getTypeDepannageEvacuation_MotifAnnulation()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='MotifAnnulation'"
	 * @generated
	 */
	String getMotifAnnulation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDepannageEvacuation#getMotifAnnulation <em>Motif Annulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Motif Annulation</em>' attribute.
	 * @see #getMotifAnnulation()
	 * @generated
	 */
	void setMotifAnnulation(String value);

	/**
	 * Returns the value of the '<em><b>Type Compte Rendu</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoDepannageEvacuationTypeCompteRendu}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Compte Rendu</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Compte Rendu</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDepannageEvacuationTypeCompteRendu
	 * @see #isSetTypeCompteRendu()
	 * @see #unsetTypeCompteRendu()
	 * @see #setTypeCompteRendu(TypeDictionaryDicoDepannageEvacuationTypeCompteRendu)
	 * @see mpia.schema.SchemaPackage#getTypeDepannageEvacuation_TypeCompteRendu()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeCompteRendu'"
	 * @generated
	 */
	TypeDictionaryDicoDepannageEvacuationTypeCompteRendu getTypeCompteRendu();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDepannageEvacuation#getTypeCompteRendu <em>Type Compte Rendu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Compte Rendu</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDepannageEvacuationTypeCompteRendu
	 * @see #isSetTypeCompteRendu()
	 * @see #unsetTypeCompteRendu()
	 * @see #getTypeCompteRendu()
	 * @generated
	 */
	void setTypeCompteRendu(TypeDictionaryDicoDepannageEvacuationTypeCompteRendu value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDepannageEvacuation#getTypeCompteRendu <em>Type Compte Rendu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeCompteRendu()
	 * @see #getTypeCompteRendu()
	 * @see #setTypeCompteRendu(TypeDictionaryDicoDepannageEvacuationTypeCompteRendu)
	 * @generated
	 */
	void unsetTypeCompteRendu();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDepannageEvacuation#getTypeCompteRendu <em>Type Compte Rendu</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Compte Rendu</em>' attribute is set.
	 * @see #unsetTypeCompteRendu()
	 * @see #getTypeCompteRendu()
	 * @see #setTypeCompteRendu(TypeDictionaryDicoDepannageEvacuationTypeCompteRendu)
	 * @generated
	 */
	boolean isSetTypeCompteRendu();

	/**
	 * Returns the value of the '<em><b>APour Unite Concernee Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite Concernee Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite Concernee Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeDepannageEvacuation_APourUniteConcerneeUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteConcernee_Unite'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourUniteConcerneeUnite();

	/**
	 * Returns the value of the '<em><b>APour Unite Executante Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite Executante Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite Executante Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeDepannageEvacuation_APourUniteExecutanteUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteExecutante_Unite'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourUniteExecutanteUnite();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Dep Evacuation Dep Evacuation</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Dep Evacuation Dep Evacuation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Dep Evacuation Dep Evacuation</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeDepannageEvacuation_EstObjetAssociationDepEvacuationDepEvacuation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeObjet_DepannageEvacuation' target_entity='type_AssociationDepEvacuationDepEvacuation'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationDepEvacuationDepEvacuation'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationDepEvacuationDepEvacuation();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Dep Evacuation Dep Evacuation</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Dep Evacuation Dep Evacuation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Dep Evacuation Dep Evacuation</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeDepannageEvacuation_EstSujetAssociationDepEvacuationDepEvacuation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeSujet_DepannageEvacuation' target_entity='type_AssociationDepEvacuationDepEvacuation'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationDepEvacuationDepEvacuation'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationDepEvacuationDepEvacuation();

	/**
	 * Returns the value of the '<em><b>APour Atelier Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Atelier Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Atelier Unite</em>' containment reference.
	 * @see #setAPourAtelierUnite(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeDepannageEvacuation_APourAtelierUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourAtelier_Unite'"
	 * @generated
	 */
	TypeAssociation getAPourAtelierUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDepannageEvacuation#getAPourAtelierUnite <em>APour Atelier Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Atelier Unite</em>' containment reference.
	 * @see #getAPourAtelierUnite()
	 * @generated
	 */
	void setAPourAtelierUnite(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Lieu Rendez Vous Autre Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Lieu Rendez Vous Autre Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Lieu Rendez Vous Autre Element Controle</em>' containment reference.
	 * @see #setAPourLieuRendezVousAutreElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeDepannageEvacuation_APourLieuRendezVousAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourLieuRendezVous_AutreElementControle'"
	 * @generated
	 */
	TypeAssociation getAPourLieuRendezVousAutreElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDepannageEvacuation#getAPourLieuRendezVousAutreElementControle <em>APour Lieu Rendez Vous Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Lieu Rendez Vous Autre Element Controle</em>' containment reference.
	 * @see #getAPourLieuRendezVousAutreElementControle()
	 * @generated
	 */
	void setAPourLieuRendezVousAutreElementControle(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Necessite Moyen Depannage</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMoyenDepannage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Necessite Moyen Depannage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Necessite Moyen Depannage</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeDepannageEvacuation_NecessiteMoyenDepannage()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_MoyenDepannage'"
	 *        extendedMetaData="kind='element' name='Necessite_MoyenDepannage'"
	 * @generated
	 */
	EList<TypeMoyenDepannage> getNecessiteMoyenDepannage();

	/**
	 * Returns the value of the '<em><b>APour Besoin En Carburant Besoin En Carburant</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeBesoinEnCarburant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Besoin En Carburant Besoin En Carburant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Besoin En Carburant Besoin En Carburant</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeDepannageEvacuation_APourBesoinEnCarburantBesoinEnCarburant()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_BesoinEnCarburant'"
	 *        extendedMetaData="kind='element' name='APourBesoinEnCarburant_BesoinEnCarburant'"
	 * @generated
	 */
	EList<TypeBesoinEnCarburant> getAPourBesoinEnCarburantBesoinEnCarburant();

	/**
	 * Returns the value of the '<em><b>Doit Tenir Compte Obstacle</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Doit Tenir Compte Obstacle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doit Tenir Compte Obstacle</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeDepannageEvacuation_DoitTenirCompteObstacle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Obstacle'"
	 *        extendedMetaData="kind='element' name='DoitTenirCompte_Obstacle'"
	 * @generated
	 */
	EList<TypeAssociation> getDoitTenirCompteObstacle();

} // TypeDepannageEvacuation
