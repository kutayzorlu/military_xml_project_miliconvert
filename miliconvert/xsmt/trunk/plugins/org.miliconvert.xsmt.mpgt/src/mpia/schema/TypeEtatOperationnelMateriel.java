/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Etat Operationnel Materiel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEtatOperationnelMateriel#getEtatOperationnel <em>Etat Operationnel</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelMateriel#getQualificatifEtat <em>Qualificatif Etat</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelMateriel#getPossibilite <em>Possibilite</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelMateriel#getUsage <em>Usage</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelMateriel#getSecurite <em>Securite</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelMateriel#getEtatDemolition <em>Etat Demolition</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelMateriel#isVisibleParEnnemi <em>Visible Par Ennemi</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelMateriel#isImpossibiliteEtreRemorque <em>Impossibilite Etre Remorque</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelMateriel#isReserve <em>Reserve</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelMateriel#isImpossibiliteSeDeplacer <em>Impossibilite Se Deplacer</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelMateriel#isReparableA12H <em>Reparable A12H</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelMateriel#getDescriptionPanne <em>Description Panne</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelMateriel#getPiecesRechangeNecessaires <em>Pieces Rechange Necessaires</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelMateriel#isVehiculeVide <em>Vehicule Vide</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelMateriel#getCouleurPrincipale <em>Couleur Principale</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelMateriel#getMarquage <em>Marquage</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelMateriel#getCouleurMarquage <em>Couleur Marquage</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelMateriel#isConformiteOMI <em>Conformite OMI</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelMateriel#getTypeDefaillanceBouee <em>Type Defaillance Bouee</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelMateriel#getACommeEtatOperationnelMineEtatOperationnelMine <em>AComme Etat Operationnel Mine Etat Operationnel Mine</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelMateriel#getAPourCaracteristiqueUXOEtatOperationnelUXO <em>APour Caracteristique UXO Etat Operationnel UXO</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelMateriel()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_EtatOperationnelMateriel' kind='elementOnly'"
 * @generated
 */
public interface TypeEtatOperationnelMateriel extends TypeEtatOperationnel {
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
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelMateriel_EtatOperationnel()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EtatOperationnel'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnel getEtatOperationnel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#getEtatOperationnel <em>Etat Operationnel</em>}' attribute.
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
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#getEtatOperationnel <em>Etat Operationnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEtatOperationnel()
	 * @see #getEtatOperationnel()
	 * @see #setEtatOperationnel(TypeDictionaryDicoEtatOperationnel)
	 * @generated
	 */
	void unsetEtatOperationnel();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#getEtatOperationnel <em>Etat Operationnel</em>}' attribute is set.
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
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOperationnelMaterielQualificatifEtat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualificatif Etat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualificatif Etat</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelMaterielQualificatifEtat
	 * @see #isSetQualificatifEtat()
	 * @see #unsetQualificatifEtat()
	 * @see #setQualificatifEtat(TypeDictionaryDicoEtatOperationnelMaterielQualificatifEtat)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelMateriel_QualificatifEtat()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='QualificatifEtat'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnelMaterielQualificatifEtat getQualificatifEtat();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#getQualificatifEtat <em>Qualificatif Etat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualificatif Etat</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelMaterielQualificatifEtat
	 * @see #isSetQualificatifEtat()
	 * @see #unsetQualificatifEtat()
	 * @see #getQualificatifEtat()
	 * @generated
	 */
	void setQualificatifEtat(TypeDictionaryDicoEtatOperationnelMaterielQualificatifEtat value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#getQualificatifEtat <em>Qualificatif Etat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQualificatifEtat()
	 * @see #getQualificatifEtat()
	 * @see #setQualificatifEtat(TypeDictionaryDicoEtatOperationnelMaterielQualificatifEtat)
	 * @generated
	 */
	void unsetQualificatifEtat();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#getQualificatifEtat <em>Qualificatif Etat</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Qualificatif Etat</em>' attribute is set.
	 * @see #unsetQualificatifEtat()
	 * @see #getQualificatifEtat()
	 * @see #setQualificatifEtat(TypeDictionaryDicoEtatOperationnelMaterielQualificatifEtat)
	 * @generated
	 */
	boolean isSetQualificatifEtat();

	/**
	 * Returns the value of the '<em><b>Possibilite</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOperationnelMaterielPossibilite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Possibilite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Possibilite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelMaterielPossibilite
	 * @see #isSetPossibilite()
	 * @see #unsetPossibilite()
	 * @see #setPossibilite(TypeDictionaryDicoEtatOperationnelMaterielPossibilite)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelMateriel_Possibilite()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Possibilite'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnelMaterielPossibilite getPossibilite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#getPossibilite <em>Possibilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Possibilite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelMaterielPossibilite
	 * @see #isSetPossibilite()
	 * @see #unsetPossibilite()
	 * @see #getPossibilite()
	 * @generated
	 */
	void setPossibilite(TypeDictionaryDicoEtatOperationnelMaterielPossibilite value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#getPossibilite <em>Possibilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPossibilite()
	 * @see #getPossibilite()
	 * @see #setPossibilite(TypeDictionaryDicoEtatOperationnelMaterielPossibilite)
	 * @generated
	 */
	void unsetPossibilite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#getPossibilite <em>Possibilite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Possibilite</em>' attribute is set.
	 * @see #unsetPossibilite()
	 * @see #getPossibilite()
	 * @see #setPossibilite(TypeDictionaryDicoEtatOperationnelMaterielPossibilite)
	 * @generated
	 */
	boolean isSetPossibilite();

	/**
	 * Returns the value of the '<em><b>Usage</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoActivation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoActivation
	 * @see #isSetUsage()
	 * @see #unsetUsage()
	 * @see #setUsage(TypeDictionaryDicoActivation)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelMateriel_Usage()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Usage'"
	 * @generated
	 */
	TypeDictionaryDicoActivation getUsage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#getUsage <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoActivation
	 * @see #isSetUsage()
	 * @see #unsetUsage()
	 * @see #getUsage()
	 * @generated
	 */
	void setUsage(TypeDictionaryDicoActivation value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#getUsage <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUsage()
	 * @see #getUsage()
	 * @see #setUsage(TypeDictionaryDicoActivation)
	 * @generated
	 */
	void unsetUsage();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#getUsage <em>Usage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Usage</em>' attribute is set.
	 * @see #unsetUsage()
	 * @see #getUsage()
	 * @see #setUsage(TypeDictionaryDicoActivation)
	 * @generated
	 */
	boolean isSetUsage();

	/**
	 * Returns the value of the '<em><b>Securite</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOperationnelMaterielSecurite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Securite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelMaterielSecurite
	 * @see #isSetSecurite()
	 * @see #unsetSecurite()
	 * @see #setSecurite(TypeDictionaryDicoEtatOperationnelMaterielSecurite)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelMateriel_Securite()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Securite'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnelMaterielSecurite getSecurite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#getSecurite <em>Securite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Securite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelMaterielSecurite
	 * @see #isSetSecurite()
	 * @see #unsetSecurite()
	 * @see #getSecurite()
	 * @generated
	 */
	void setSecurite(TypeDictionaryDicoEtatOperationnelMaterielSecurite value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#getSecurite <em>Securite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSecurite()
	 * @see #getSecurite()
	 * @see #setSecurite(TypeDictionaryDicoEtatOperationnelMaterielSecurite)
	 * @generated
	 */
	void unsetSecurite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#getSecurite <em>Securite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Securite</em>' attribute is set.
	 * @see #unsetSecurite()
	 * @see #getSecurite()
	 * @see #setSecurite(TypeDictionaryDicoEtatOperationnelMaterielSecurite)
	 * @generated
	 */
	boolean isSetSecurite();

	/**
	 * Returns the value of the '<em><b>Etat Demolition</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatDemolition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Demolition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Demolition</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatDemolition
	 * @see #isSetEtatDemolition()
	 * @see #unsetEtatDemolition()
	 * @see #setEtatDemolition(TypeDictionaryDicoEtatDemolition)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelMateriel_EtatDemolition()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EtatDemolition'"
	 * @generated
	 */
	TypeDictionaryDicoEtatDemolition getEtatDemolition();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#getEtatDemolition <em>Etat Demolition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Demolition</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatDemolition
	 * @see #isSetEtatDemolition()
	 * @see #unsetEtatDemolition()
	 * @see #getEtatDemolition()
	 * @generated
	 */
	void setEtatDemolition(TypeDictionaryDicoEtatDemolition value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#getEtatDemolition <em>Etat Demolition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEtatDemolition()
	 * @see #getEtatDemolition()
	 * @see #setEtatDemolition(TypeDictionaryDicoEtatDemolition)
	 * @generated
	 */
	void unsetEtatDemolition();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#getEtatDemolition <em>Etat Demolition</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Etat Demolition</em>' attribute is set.
	 * @see #unsetEtatDemolition()
	 * @see #getEtatDemolition()
	 * @see #setEtatDemolition(TypeDictionaryDicoEtatDemolition)
	 * @generated
	 */
	boolean isSetEtatDemolition();

	/**
	 * Returns the value of the '<em><b>Visible Par Ennemi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible Par Ennemi</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible Par Ennemi</em>' attribute.
	 * @see #isSetVisibleParEnnemi()
	 * @see #unsetVisibleParEnnemi()
	 * @see #setVisibleParEnnemi(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelMateriel_VisibleParEnnemi()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='VisibleParEnnemi'"
	 * @generated
	 */
	boolean isVisibleParEnnemi();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#isVisibleParEnnemi <em>Visible Par Ennemi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible Par Ennemi</em>' attribute.
	 * @see #isSetVisibleParEnnemi()
	 * @see #unsetVisibleParEnnemi()
	 * @see #isVisibleParEnnemi()
	 * @generated
	 */
	void setVisibleParEnnemi(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#isVisibleParEnnemi <em>Visible Par Ennemi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVisibleParEnnemi()
	 * @see #isVisibleParEnnemi()
	 * @see #setVisibleParEnnemi(boolean)
	 * @generated
	 */
	void unsetVisibleParEnnemi();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#isVisibleParEnnemi <em>Visible Par Ennemi</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Visible Par Ennemi</em>' attribute is set.
	 * @see #unsetVisibleParEnnemi()
	 * @see #isVisibleParEnnemi()
	 * @see #setVisibleParEnnemi(boolean)
	 * @generated
	 */
	boolean isSetVisibleParEnnemi();

	/**
	 * Returns the value of the '<em><b>Impossibilite Etre Remorque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impossibilite Etre Remorque</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impossibilite Etre Remorque</em>' attribute.
	 * @see #isSetImpossibiliteEtreRemorque()
	 * @see #unsetImpossibiliteEtreRemorque()
	 * @see #setImpossibiliteEtreRemorque(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelMateriel_ImpossibiliteEtreRemorque()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='ImpossibiliteEtreRemorque'"
	 * @generated
	 */
	boolean isImpossibiliteEtreRemorque();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#isImpossibiliteEtreRemorque <em>Impossibilite Etre Remorque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impossibilite Etre Remorque</em>' attribute.
	 * @see #isSetImpossibiliteEtreRemorque()
	 * @see #unsetImpossibiliteEtreRemorque()
	 * @see #isImpossibiliteEtreRemorque()
	 * @generated
	 */
	void setImpossibiliteEtreRemorque(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#isImpossibiliteEtreRemorque <em>Impossibilite Etre Remorque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetImpossibiliteEtreRemorque()
	 * @see #isImpossibiliteEtreRemorque()
	 * @see #setImpossibiliteEtreRemorque(boolean)
	 * @generated
	 */
	void unsetImpossibiliteEtreRemorque();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#isImpossibiliteEtreRemorque <em>Impossibilite Etre Remorque</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Impossibilite Etre Remorque</em>' attribute is set.
	 * @see #unsetImpossibiliteEtreRemorque()
	 * @see #isImpossibiliteEtreRemorque()
	 * @see #setImpossibiliteEtreRemorque(boolean)
	 * @generated
	 */
	boolean isSetImpossibiliteEtreRemorque();

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
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelMateriel_Reserve()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='Reserve'"
	 * @generated
	 */
	boolean isReserve();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#isReserve <em>Reserve</em>}' attribute.
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
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#isReserve <em>Reserve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReserve()
	 * @see #isReserve()
	 * @see #setReserve(boolean)
	 * @generated
	 */
	void unsetReserve();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#isReserve <em>Reserve</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Impossibilite Se Deplacer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impossibilite Se Deplacer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impossibilite Se Deplacer</em>' attribute.
	 * @see #isSetImpossibiliteSeDeplacer()
	 * @see #unsetImpossibiliteSeDeplacer()
	 * @see #setImpossibiliteSeDeplacer(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelMateriel_ImpossibiliteSeDeplacer()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='ImpossibiliteSeDeplacer'"
	 * @generated
	 */
	boolean isImpossibiliteSeDeplacer();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#isImpossibiliteSeDeplacer <em>Impossibilite Se Deplacer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impossibilite Se Deplacer</em>' attribute.
	 * @see #isSetImpossibiliteSeDeplacer()
	 * @see #unsetImpossibiliteSeDeplacer()
	 * @see #isImpossibiliteSeDeplacer()
	 * @generated
	 */
	void setImpossibiliteSeDeplacer(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#isImpossibiliteSeDeplacer <em>Impossibilite Se Deplacer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetImpossibiliteSeDeplacer()
	 * @see #isImpossibiliteSeDeplacer()
	 * @see #setImpossibiliteSeDeplacer(boolean)
	 * @generated
	 */
	void unsetImpossibiliteSeDeplacer();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#isImpossibiliteSeDeplacer <em>Impossibilite Se Deplacer</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Impossibilite Se Deplacer</em>' attribute is set.
	 * @see #unsetImpossibiliteSeDeplacer()
	 * @see #isImpossibiliteSeDeplacer()
	 * @see #setImpossibiliteSeDeplacer(boolean)
	 * @generated
	 */
	boolean isSetImpossibiliteSeDeplacer();

	/**
	 * Returns the value of the '<em><b>Reparable A12H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reparable A12H</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reparable A12H</em>' attribute.
	 * @see #isSetReparableA12H()
	 * @see #unsetReparableA12H()
	 * @see #setReparableA12H(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelMateriel_ReparableA12H()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='ReparableA12H'"
	 * @generated
	 */
	boolean isReparableA12H();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#isReparableA12H <em>Reparable A12H</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reparable A12H</em>' attribute.
	 * @see #isSetReparableA12H()
	 * @see #unsetReparableA12H()
	 * @see #isReparableA12H()
	 * @generated
	 */
	void setReparableA12H(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#isReparableA12H <em>Reparable A12H</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReparableA12H()
	 * @see #isReparableA12H()
	 * @see #setReparableA12H(boolean)
	 * @generated
	 */
	void unsetReparableA12H();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#isReparableA12H <em>Reparable A12H</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reparable A12H</em>' attribute is set.
	 * @see #unsetReparableA12H()
	 * @see #isReparableA12H()
	 * @see #setReparableA12H(boolean)
	 * @generated
	 */
	boolean isSetReparableA12H();

	/**
	 * Returns the value of the '<em><b>Description Panne</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description Panne</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Panne</em>' attribute.
	 * @see #setDescriptionPanne(String)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelMateriel_DescriptionPanne()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='DescriptionPanne'"
	 * @generated
	 */
	String getDescriptionPanne();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#getDescriptionPanne <em>Description Panne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Panne</em>' attribute.
	 * @see #getDescriptionPanne()
	 * @generated
	 */
	void setDescriptionPanne(String value);

	/**
	 * Returns the value of the '<em><b>Pieces Rechange Necessaires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pieces Rechange Necessaires</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pieces Rechange Necessaires</em>' attribute.
	 * @see #setPiecesRechangeNecessaires(String)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelMateriel_PiecesRechangeNecessaires()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='PiecesRechangeNecessaires'"
	 * @generated
	 */
	String getPiecesRechangeNecessaires();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#getPiecesRechangeNecessaires <em>Pieces Rechange Necessaires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pieces Rechange Necessaires</em>' attribute.
	 * @see #getPiecesRechangeNecessaires()
	 * @generated
	 */
	void setPiecesRechangeNecessaires(String value);

	/**
	 * Returns the value of the '<em><b>Vehicule Vide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vehicule Vide</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicule Vide</em>' attribute.
	 * @see #isSetVehiculeVide()
	 * @see #unsetVehiculeVide()
	 * @see #setVehiculeVide(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelMateriel_VehiculeVide()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='VehiculeVide'"
	 * @generated
	 */
	boolean isVehiculeVide();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#isVehiculeVide <em>Vehicule Vide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicule Vide</em>' attribute.
	 * @see #isSetVehiculeVide()
	 * @see #unsetVehiculeVide()
	 * @see #isVehiculeVide()
	 * @generated
	 */
	void setVehiculeVide(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#isVehiculeVide <em>Vehicule Vide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVehiculeVide()
	 * @see #isVehiculeVide()
	 * @see #setVehiculeVide(boolean)
	 * @generated
	 */
	void unsetVehiculeVide();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#isVehiculeVide <em>Vehicule Vide</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vehicule Vide</em>' attribute is set.
	 * @see #unsetVehiculeVide()
	 * @see #isVehiculeVide()
	 * @see #setVehiculeVide(boolean)
	 * @generated
	 */
	boolean isSetVehiculeVide();

	/**
	 * Returns the value of the '<em><b>Couleur Principale</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOperationnelMaterielCouleurPrincipale}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Couleur Principale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Couleur Principale</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelMaterielCouleurPrincipale
	 * @see #isSetCouleurPrincipale()
	 * @see #unsetCouleurPrincipale()
	 * @see #setCouleurPrincipale(TypeDictionaryDicoEtatOperationnelMaterielCouleurPrincipale)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelMateriel_CouleurPrincipale()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='CouleurPrincipale'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnelMaterielCouleurPrincipale getCouleurPrincipale();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#getCouleurPrincipale <em>Couleur Principale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Couleur Principale</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelMaterielCouleurPrincipale
	 * @see #isSetCouleurPrincipale()
	 * @see #unsetCouleurPrincipale()
	 * @see #getCouleurPrincipale()
	 * @generated
	 */
	void setCouleurPrincipale(TypeDictionaryDicoEtatOperationnelMaterielCouleurPrincipale value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#getCouleurPrincipale <em>Couleur Principale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCouleurPrincipale()
	 * @see #getCouleurPrincipale()
	 * @see #setCouleurPrincipale(TypeDictionaryDicoEtatOperationnelMaterielCouleurPrincipale)
	 * @generated
	 */
	void unsetCouleurPrincipale();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#getCouleurPrincipale <em>Couleur Principale</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Couleur Principale</em>' attribute is set.
	 * @see #unsetCouleurPrincipale()
	 * @see #getCouleurPrincipale()
	 * @see #setCouleurPrincipale(TypeDictionaryDicoEtatOperationnelMaterielCouleurPrincipale)
	 * @generated
	 */
	boolean isSetCouleurPrincipale();

	/**
	 * Returns the value of the '<em><b>Marquage</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOperationnelMaterielMarquage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marquage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marquage</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelMaterielMarquage
	 * @see #isSetMarquage()
	 * @see #unsetMarquage()
	 * @see #setMarquage(TypeDictionaryDicoEtatOperationnelMaterielMarquage)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelMateriel_Marquage()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Marquage'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnelMaterielMarquage getMarquage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#getMarquage <em>Marquage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marquage</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelMaterielMarquage
	 * @see #isSetMarquage()
	 * @see #unsetMarquage()
	 * @see #getMarquage()
	 * @generated
	 */
	void setMarquage(TypeDictionaryDicoEtatOperationnelMaterielMarquage value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#getMarquage <em>Marquage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMarquage()
	 * @see #getMarquage()
	 * @see #setMarquage(TypeDictionaryDicoEtatOperationnelMaterielMarquage)
	 * @generated
	 */
	void unsetMarquage();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#getMarquage <em>Marquage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Marquage</em>' attribute is set.
	 * @see #unsetMarquage()
	 * @see #getMarquage()
	 * @see #setMarquage(TypeDictionaryDicoEtatOperationnelMaterielMarquage)
	 * @generated
	 */
	boolean isSetMarquage();

	/**
	 * Returns the value of the '<em><b>Couleur Marquage</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOperationnelMaterielCouleurMarquage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Couleur Marquage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Couleur Marquage</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelMaterielCouleurMarquage
	 * @see #isSetCouleurMarquage()
	 * @see #unsetCouleurMarquage()
	 * @see #setCouleurMarquage(TypeDictionaryDicoEtatOperationnelMaterielCouleurMarquage)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelMateriel_CouleurMarquage()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='CouleurMarquage'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnelMaterielCouleurMarquage getCouleurMarquage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#getCouleurMarquage <em>Couleur Marquage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Couleur Marquage</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelMaterielCouleurMarquage
	 * @see #isSetCouleurMarquage()
	 * @see #unsetCouleurMarquage()
	 * @see #getCouleurMarquage()
	 * @generated
	 */
	void setCouleurMarquage(TypeDictionaryDicoEtatOperationnelMaterielCouleurMarquage value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#getCouleurMarquage <em>Couleur Marquage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCouleurMarquage()
	 * @see #getCouleurMarquage()
	 * @see #setCouleurMarquage(TypeDictionaryDicoEtatOperationnelMaterielCouleurMarquage)
	 * @generated
	 */
	void unsetCouleurMarquage();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#getCouleurMarquage <em>Couleur Marquage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Couleur Marquage</em>' attribute is set.
	 * @see #unsetCouleurMarquage()
	 * @see #getCouleurMarquage()
	 * @see #setCouleurMarquage(TypeDictionaryDicoEtatOperationnelMaterielCouleurMarquage)
	 * @generated
	 */
	boolean isSetCouleurMarquage();

	/**
	 * Returns the value of the '<em><b>Conformite OMI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conformite OMI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conformite OMI</em>' attribute.
	 * @see #isSetConformiteOMI()
	 * @see #unsetConformiteOMI()
	 * @see #setConformiteOMI(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelMateriel_ConformiteOMI()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='ConformiteOMI'"
	 * @generated
	 */
	boolean isConformiteOMI();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#isConformiteOMI <em>Conformite OMI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conformite OMI</em>' attribute.
	 * @see #isSetConformiteOMI()
	 * @see #unsetConformiteOMI()
	 * @see #isConformiteOMI()
	 * @generated
	 */
	void setConformiteOMI(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#isConformiteOMI <em>Conformite OMI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConformiteOMI()
	 * @see #isConformiteOMI()
	 * @see #setConformiteOMI(boolean)
	 * @generated
	 */
	void unsetConformiteOMI();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#isConformiteOMI <em>Conformite OMI</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Conformite OMI</em>' attribute is set.
	 * @see #unsetConformiteOMI()
	 * @see #isConformiteOMI()
	 * @see #setConformiteOMI(boolean)
	 * @generated
	 */
	boolean isSetConformiteOMI();

	/**
	 * Returns the value of the '<em><b>Type Defaillance Bouee</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOperationnelMaterielTypeDefaillanceBouee}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Defaillance Bouee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Defaillance Bouee</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelMaterielTypeDefaillanceBouee
	 * @see #isSetTypeDefaillanceBouee()
	 * @see #unsetTypeDefaillanceBouee()
	 * @see #setTypeDefaillanceBouee(TypeDictionaryDicoEtatOperationnelMaterielTypeDefaillanceBouee)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelMateriel_TypeDefaillanceBouee()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeDefaillanceBouee'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnelMaterielTypeDefaillanceBouee getTypeDefaillanceBouee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#getTypeDefaillanceBouee <em>Type Defaillance Bouee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Defaillance Bouee</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelMaterielTypeDefaillanceBouee
	 * @see #isSetTypeDefaillanceBouee()
	 * @see #unsetTypeDefaillanceBouee()
	 * @see #getTypeDefaillanceBouee()
	 * @generated
	 */
	void setTypeDefaillanceBouee(TypeDictionaryDicoEtatOperationnelMaterielTypeDefaillanceBouee value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#getTypeDefaillanceBouee <em>Type Defaillance Bouee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeDefaillanceBouee()
	 * @see #getTypeDefaillanceBouee()
	 * @see #setTypeDefaillanceBouee(TypeDictionaryDicoEtatOperationnelMaterielTypeDefaillanceBouee)
	 * @generated
	 */
	void unsetTypeDefaillanceBouee();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#getTypeDefaillanceBouee <em>Type Defaillance Bouee</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Defaillance Bouee</em>' attribute is set.
	 * @see #unsetTypeDefaillanceBouee()
	 * @see #getTypeDefaillanceBouee()
	 * @see #setTypeDefaillanceBouee(TypeDictionaryDicoEtatOperationnelMaterielTypeDefaillanceBouee)
	 * @generated
	 */
	boolean isSetTypeDefaillanceBouee();

	/**
	 * Returns the value of the '<em><b>AComme Etat Operationnel Mine Etat Operationnel Mine</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Etat Operationnel Mine Etat Operationnel Mine</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Etat Operationnel Mine Etat Operationnel Mine</em>' containment reference.
	 * @see #setACommeEtatOperationnelMineEtatOperationnelMine(TypeEtatOperationnelMine)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelMateriel_ACommeEtatOperationnelMineEtatOperationnelMine()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EtatOperationnelMine'"
	 *        extendedMetaData="kind='element' name='ACommeEtatOperationnelMine_EtatOperationnelMine'"
	 * @generated
	 */
	TypeEtatOperationnelMine getACommeEtatOperationnelMineEtatOperationnelMine();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#getACommeEtatOperationnelMineEtatOperationnelMine <em>AComme Etat Operationnel Mine Etat Operationnel Mine</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Etat Operationnel Mine Etat Operationnel Mine</em>' containment reference.
	 * @see #getACommeEtatOperationnelMineEtatOperationnelMine()
	 * @generated
	 */
	void setACommeEtatOperationnelMineEtatOperationnelMine(TypeEtatOperationnelMine value);

	/**
	 * Returns the value of the '<em><b>APour Caracteristique UXO Etat Operationnel UXO</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Caracteristique UXO Etat Operationnel UXO</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Caracteristique UXO Etat Operationnel UXO</em>' containment reference.
	 * @see #setAPourCaracteristiqueUXOEtatOperationnelUXO(TypeEtatOperationnelUXO)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelMateriel_APourCaracteristiqueUXOEtatOperationnelUXO()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EtatOperationnelUXO'"
	 *        extendedMetaData="kind='element' name='APourCaracteristiqueUXO_EtatOperationnelUXO'"
	 * @generated
	 */
	TypeEtatOperationnelUXO getAPourCaracteristiqueUXOEtatOperationnelUXO();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelMateriel#getAPourCaracteristiqueUXOEtatOperationnelUXO <em>APour Caracteristique UXO Etat Operationnel UXO</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Caracteristique UXO Etat Operationnel UXO</em>' containment reference.
	 * @see #getAPourCaracteristiqueUXOEtatOperationnelUXO()
	 * @generated
	 */
	void setAPourCaracteristiqueUXOEtatOperationnelUXO(TypeEtatOperationnelUXO value);

} // TypeEtatOperationnelMateriel
