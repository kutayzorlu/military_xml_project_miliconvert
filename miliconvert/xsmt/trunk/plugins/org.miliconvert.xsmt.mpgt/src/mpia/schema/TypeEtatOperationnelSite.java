/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Etat Operationnel Site</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEtatOperationnelSite#getEtatOperationnel <em>Etat Operationnel</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelSite#getQualificatifEtat <em>Qualificatif Etat</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelSite#getActivation <em>Activation</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelSite#getGDHdebutActivation <em>GD Hdebut Activation</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelSite#getGDHfinActivation <em>GD Hfin Activation</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelSite#isReserve <em>Reserve</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelSite#getCapaciteRestante <em>Capacite Restante</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelSite#getSecurite <em>Securite</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelSite#getPresenceMines <em>Presence Mines</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelSite#getActiviteEnnemie <em>Activite Ennemie</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelSite#getEtatDeploiement <em>Etat Deploiement</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelSite#getNiveauRealisation <em>Niveau Realisation</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelSite#getEtatDemolition <em>Etat Demolition</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelSite#isProgrammeOccupation <em>Programme Occupation</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelSite#getAPourCaracteristiquesObstacleCaracteristiqueComplementaireObstacle <em>APour Caracteristiques Obstacle Caracteristique Complementaire Obstacle</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelSite#getACommeEtatOperationnelAerodromeEtatOperationnelAerodrome <em>AComme Etat Operationnel Aerodrome Etat Operationnel Aerodrome</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelSite#getACommeSituationMedicaleEtatOperationnelMedical <em>AComme Situation Medicale Etat Operationnel Medical</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelSite#getACommeEtatOperationnelChampMinesMaritimeEtatOperationnelChampMinesMaritime <em>AComme Etat Operationnel Champ Mines Maritime Etat Operationnel Champ Mines Maritime</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelSite()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_EtatOperationnelSite' kind='elementOnly'"
 * @generated
 */
public interface TypeEtatOperationnelSite extends TypeEtatOperationnel {
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
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelSite_EtatOperationnel()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EtatOperationnel'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnel getEtatOperationnel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelSite#getEtatOperationnel <em>Etat Operationnel</em>}' attribute.
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
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelSite#getEtatOperationnel <em>Etat Operationnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEtatOperationnel()
	 * @see #getEtatOperationnel()
	 * @see #setEtatOperationnel(TypeDictionaryDicoEtatOperationnel)
	 * @generated
	 */
	void unsetEtatOperationnel();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelSite#getEtatOperationnel <em>Etat Operationnel</em>}' attribute is set.
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
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOperationnelSiteQualificatifEtat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualificatif Etat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualificatif Etat</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelSiteQualificatifEtat
	 * @see #isSetQualificatifEtat()
	 * @see #unsetQualificatifEtat()
	 * @see #setQualificatifEtat(TypeDictionaryDicoEtatOperationnelSiteQualificatifEtat)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelSite_QualificatifEtat()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='QualificatifEtat'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnelSiteQualificatifEtat getQualificatifEtat();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelSite#getQualificatifEtat <em>Qualificatif Etat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualificatif Etat</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelSiteQualificatifEtat
	 * @see #isSetQualificatifEtat()
	 * @see #unsetQualificatifEtat()
	 * @see #getQualificatifEtat()
	 * @generated
	 */
	void setQualificatifEtat(TypeDictionaryDicoEtatOperationnelSiteQualificatifEtat value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelSite#getQualificatifEtat <em>Qualificatif Etat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQualificatifEtat()
	 * @see #getQualificatifEtat()
	 * @see #setQualificatifEtat(TypeDictionaryDicoEtatOperationnelSiteQualificatifEtat)
	 * @generated
	 */
	void unsetQualificatifEtat();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelSite#getQualificatifEtat <em>Qualificatif Etat</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Qualificatif Etat</em>' attribute is set.
	 * @see #unsetQualificatifEtat()
	 * @see #getQualificatifEtat()
	 * @see #setQualificatifEtat(TypeDictionaryDicoEtatOperationnelSiteQualificatifEtat)
	 * @generated
	 */
	boolean isSetQualificatifEtat();

	/**
	 * Returns the value of the '<em><b>Activation</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoActivation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoActivation
	 * @see #isSetActivation()
	 * @see #unsetActivation()
	 * @see #setActivation(TypeDictionaryDicoActivation)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelSite_Activation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Activation'"
	 * @generated
	 */
	TypeDictionaryDicoActivation getActivation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelSite#getActivation <em>Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoActivation
	 * @see #isSetActivation()
	 * @see #unsetActivation()
	 * @see #getActivation()
	 * @generated
	 */
	void setActivation(TypeDictionaryDicoActivation value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelSite#getActivation <em>Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActivation()
	 * @see #getActivation()
	 * @see #setActivation(TypeDictionaryDicoActivation)
	 * @generated
	 */
	void unsetActivation();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelSite#getActivation <em>Activation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Activation</em>' attribute is set.
	 * @see #unsetActivation()
	 * @see #getActivation()
	 * @see #setActivation(TypeDictionaryDicoActivation)
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
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelSite_GDHdebutActivation()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='GDHdebutActivation'"
	 * @generated
	 */
	XMLGregorianCalendar getGDHdebutActivation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelSite#getGDHdebutActivation <em>GD Hdebut Activation</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelSite_GDHfinActivation()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='GDHfinActivation'"
	 * @generated
	 */
	XMLGregorianCalendar getGDHfinActivation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelSite#getGDHfinActivation <em>GD Hfin Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GD Hfin Activation</em>' attribute.
	 * @see #getGDHfinActivation()
	 * @generated
	 */
	void setGDHfinActivation(XMLGregorianCalendar value);

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
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelSite_Reserve()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='Reserve'"
	 * @generated
	 */
	boolean isReserve();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelSite#isReserve <em>Reserve</em>}' attribute.
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
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelSite#isReserve <em>Reserve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReserve()
	 * @see #isReserve()
	 * @see #setReserve(boolean)
	 * @generated
	 */
	void unsetReserve();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelSite#isReserve <em>Reserve</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Capacite Restante</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacite Restante</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacite Restante</em>' attribute.
	 * @see #isSetCapaciteRestante()
	 * @see #unsetCapaciteRestante()
	 * @see #setCapaciteRestante(double)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelSite_CapaciteRestante()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeRatio"
	 *        extendedMetaData="kind='element' name='CapaciteRestante'"
	 * @generated
	 */
	double getCapaciteRestante();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelSite#getCapaciteRestante <em>Capacite Restante</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacite Restante</em>' attribute.
	 * @see #isSetCapaciteRestante()
	 * @see #unsetCapaciteRestante()
	 * @see #getCapaciteRestante()
	 * @generated
	 */
	void setCapaciteRestante(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelSite#getCapaciteRestante <em>Capacite Restante</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCapaciteRestante()
	 * @see #getCapaciteRestante()
	 * @see #setCapaciteRestante(double)
	 * @generated
	 */
	void unsetCapaciteRestante();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelSite#getCapaciteRestante <em>Capacite Restante</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Capacite Restante</em>' attribute is set.
	 * @see #unsetCapaciteRestante()
	 * @see #getCapaciteRestante()
	 * @see #setCapaciteRestante(double)
	 * @generated
	 */
	boolean isSetCapaciteRestante();

	/**
	 * Returns the value of the '<em><b>Securite</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOperationnelSiteSecurite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Securite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelSiteSecurite
	 * @see #isSetSecurite()
	 * @see #unsetSecurite()
	 * @see #setSecurite(TypeDictionaryDicoEtatOperationnelSiteSecurite)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelSite_Securite()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Securite'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnelSiteSecurite getSecurite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelSite#getSecurite <em>Securite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Securite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelSiteSecurite
	 * @see #isSetSecurite()
	 * @see #unsetSecurite()
	 * @see #getSecurite()
	 * @generated
	 */
	void setSecurite(TypeDictionaryDicoEtatOperationnelSiteSecurite value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelSite#getSecurite <em>Securite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSecurite()
	 * @see #getSecurite()
	 * @see #setSecurite(TypeDictionaryDicoEtatOperationnelSiteSecurite)
	 * @generated
	 */
	void unsetSecurite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelSite#getSecurite <em>Securite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Securite</em>' attribute is set.
	 * @see #unsetSecurite()
	 * @see #getSecurite()
	 * @see #setSecurite(TypeDictionaryDicoEtatOperationnelSiteSecurite)
	 * @generated
	 */
	boolean isSetSecurite();

	/**
	 * Returns the value of the '<em><b>Presence Mines</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPresenceMines}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presence Mines</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presence Mines</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPresenceMines
	 * @see #isSetPresenceMines()
	 * @see #unsetPresenceMines()
	 * @see #setPresenceMines(TypeDictionaryDicoPresenceMines)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelSite_PresenceMines()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='PresenceMines'"
	 * @generated
	 */
	TypeDictionaryDicoPresenceMines getPresenceMines();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelSite#getPresenceMines <em>Presence Mines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presence Mines</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPresenceMines
	 * @see #isSetPresenceMines()
	 * @see #unsetPresenceMines()
	 * @see #getPresenceMines()
	 * @generated
	 */
	void setPresenceMines(TypeDictionaryDicoPresenceMines value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelSite#getPresenceMines <em>Presence Mines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPresenceMines()
	 * @see #getPresenceMines()
	 * @see #setPresenceMines(TypeDictionaryDicoPresenceMines)
	 * @generated
	 */
	void unsetPresenceMines();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelSite#getPresenceMines <em>Presence Mines</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Presence Mines</em>' attribute is set.
	 * @see #unsetPresenceMines()
	 * @see #getPresenceMines()
	 * @see #setPresenceMines(TypeDictionaryDicoPresenceMines)
	 * @generated
	 */
	boolean isSetPresenceMines();

	/**
	 * Returns the value of the '<em><b>Activite Ennemie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOperationnelSiteActiviteEnnemie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activite Ennemie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activite Ennemie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelSiteActiviteEnnemie
	 * @see #isSetActiviteEnnemie()
	 * @see #unsetActiviteEnnemie()
	 * @see #setActiviteEnnemie(TypeDictionaryDicoEtatOperationnelSiteActiviteEnnemie)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelSite_ActiviteEnnemie()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ActiviteEnnemie'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnelSiteActiviteEnnemie getActiviteEnnemie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelSite#getActiviteEnnemie <em>Activite Ennemie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activite Ennemie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelSiteActiviteEnnemie
	 * @see #isSetActiviteEnnemie()
	 * @see #unsetActiviteEnnemie()
	 * @see #getActiviteEnnemie()
	 * @generated
	 */
	void setActiviteEnnemie(TypeDictionaryDicoEtatOperationnelSiteActiviteEnnemie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelSite#getActiviteEnnemie <em>Activite Ennemie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActiviteEnnemie()
	 * @see #getActiviteEnnemie()
	 * @see #setActiviteEnnemie(TypeDictionaryDicoEtatOperationnelSiteActiviteEnnemie)
	 * @generated
	 */
	void unsetActiviteEnnemie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelSite#getActiviteEnnemie <em>Activite Ennemie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Activite Ennemie</em>' attribute is set.
	 * @see #unsetActiviteEnnemie()
	 * @see #getActiviteEnnemie()
	 * @see #setActiviteEnnemie(TypeDictionaryDicoEtatOperationnelSiteActiviteEnnemie)
	 * @generated
	 */
	boolean isSetActiviteEnnemie();

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
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelSite_EtatDeploiement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EtatDeploiement'"
	 * @generated
	 */
	TypeDictionaryDicoEtatDeploiement getEtatDeploiement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelSite#getEtatDeploiement <em>Etat Deploiement</em>}' attribute.
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
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelSite#getEtatDeploiement <em>Etat Deploiement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEtatDeploiement()
	 * @see #getEtatDeploiement()
	 * @see #setEtatDeploiement(TypeDictionaryDicoEtatDeploiement)
	 * @generated
	 */
	void unsetEtatDeploiement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelSite#getEtatDeploiement <em>Etat Deploiement</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Niveau Realisation</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOperationnelSiteNiveauRealisation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Niveau Realisation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau Realisation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelSiteNiveauRealisation
	 * @see #isSetNiveauRealisation()
	 * @see #unsetNiveauRealisation()
	 * @see #setNiveauRealisation(TypeDictionaryDicoEtatOperationnelSiteNiveauRealisation)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelSite_NiveauRealisation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='NiveauRealisation'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnelSiteNiveauRealisation getNiveauRealisation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelSite#getNiveauRealisation <em>Niveau Realisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Niveau Realisation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelSiteNiveauRealisation
	 * @see #isSetNiveauRealisation()
	 * @see #unsetNiveauRealisation()
	 * @see #getNiveauRealisation()
	 * @generated
	 */
	void setNiveauRealisation(TypeDictionaryDicoEtatOperationnelSiteNiveauRealisation value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelSite#getNiveauRealisation <em>Niveau Realisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNiveauRealisation()
	 * @see #getNiveauRealisation()
	 * @see #setNiveauRealisation(TypeDictionaryDicoEtatOperationnelSiteNiveauRealisation)
	 * @generated
	 */
	void unsetNiveauRealisation();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelSite#getNiveauRealisation <em>Niveau Realisation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Niveau Realisation</em>' attribute is set.
	 * @see #unsetNiveauRealisation()
	 * @see #getNiveauRealisation()
	 * @see #setNiveauRealisation(TypeDictionaryDicoEtatOperationnelSiteNiveauRealisation)
	 * @generated
	 */
	boolean isSetNiveauRealisation();

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
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelSite_EtatDemolition()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EtatDemolition'"
	 * @generated
	 */
	TypeDictionaryDicoEtatDemolition getEtatDemolition();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelSite#getEtatDemolition <em>Etat Demolition</em>}' attribute.
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
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelSite#getEtatDemolition <em>Etat Demolition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEtatDemolition()
	 * @see #getEtatDemolition()
	 * @see #setEtatDemolition(TypeDictionaryDicoEtatDemolition)
	 * @generated
	 */
	void unsetEtatDemolition();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelSite#getEtatDemolition <em>Etat Demolition</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Programme Occupation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Programme Occupation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme Occupation</em>' attribute.
	 * @see #isSetProgrammeOccupation()
	 * @see #unsetProgrammeOccupation()
	 * @see #setProgrammeOccupation(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelSite_ProgrammeOccupation()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='ProgrammeOccupation'"
	 * @generated
	 */
	boolean isProgrammeOccupation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelSite#isProgrammeOccupation <em>Programme Occupation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programme Occupation</em>' attribute.
	 * @see #isSetProgrammeOccupation()
	 * @see #unsetProgrammeOccupation()
	 * @see #isProgrammeOccupation()
	 * @generated
	 */
	void setProgrammeOccupation(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelSite#isProgrammeOccupation <em>Programme Occupation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProgrammeOccupation()
	 * @see #isProgrammeOccupation()
	 * @see #setProgrammeOccupation(boolean)
	 * @generated
	 */
	void unsetProgrammeOccupation();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelSite#isProgrammeOccupation <em>Programme Occupation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Programme Occupation</em>' attribute is set.
	 * @see #unsetProgrammeOccupation()
	 * @see #isProgrammeOccupation()
	 * @see #setProgrammeOccupation(boolean)
	 * @generated
	 */
	boolean isSetProgrammeOccupation();

	/**
	 * Returns the value of the '<em><b>APour Caracteristiques Obstacle Caracteristique Complementaire Obstacle</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeCaracteristiqueComplementaireObstacle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Caracteristiques Obstacle Caracteristique Complementaire Obstacle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Caracteristiques Obstacle Caracteristique Complementaire Obstacle</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelSite_APourCaracteristiquesObstacleCaracteristiqueComplementaireObstacle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_CaracteristiqueComplementaireObstacle'"
	 *        extendedMetaData="kind='element' name='APourCaracteristiquesObstacle_CaracteristiqueComplementaireObstacle'"
	 * @generated
	 */
	EList<TypeCaracteristiqueComplementaireObstacle> getAPourCaracteristiquesObstacleCaracteristiqueComplementaireObstacle();

	/**
	 * Returns the value of the '<em><b>AComme Etat Operationnel Aerodrome Etat Operationnel Aerodrome</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Etat Operationnel Aerodrome Etat Operationnel Aerodrome</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Etat Operationnel Aerodrome Etat Operationnel Aerodrome</em>' containment reference.
	 * @see #setACommeEtatOperationnelAerodromeEtatOperationnelAerodrome(TypeEtatOperationnelAerodrome)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelSite_ACommeEtatOperationnelAerodromeEtatOperationnelAerodrome()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EtatOperationnelAerodrome'"
	 *        extendedMetaData="kind='element' name='ACommeEtatOperationnelAerodrome_EtatOperationnelAerodrome'"
	 * @generated
	 */
	TypeEtatOperationnelAerodrome getACommeEtatOperationnelAerodromeEtatOperationnelAerodrome();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelSite#getACommeEtatOperationnelAerodromeEtatOperationnelAerodrome <em>AComme Etat Operationnel Aerodrome Etat Operationnel Aerodrome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Etat Operationnel Aerodrome Etat Operationnel Aerodrome</em>' containment reference.
	 * @see #getACommeEtatOperationnelAerodromeEtatOperationnelAerodrome()
	 * @generated
	 */
	void setACommeEtatOperationnelAerodromeEtatOperationnelAerodrome(TypeEtatOperationnelAerodrome value);

	/**
	 * Returns the value of the '<em><b>AComme Situation Medicale Etat Operationnel Medical</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Situation Medicale Etat Operationnel Medical</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Situation Medicale Etat Operationnel Medical</em>' containment reference.
	 * @see #setACommeSituationMedicaleEtatOperationnelMedical(TypeEtatOperationnelMedical)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelSite_ACommeSituationMedicaleEtatOperationnelMedical()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EtatOperationnelMedical'"
	 *        extendedMetaData="kind='element' name='ACommeSituationMedicale_EtatOperationnelMedical'"
	 * @generated
	 */
	TypeEtatOperationnelMedical getACommeSituationMedicaleEtatOperationnelMedical();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelSite#getACommeSituationMedicaleEtatOperationnelMedical <em>AComme Situation Medicale Etat Operationnel Medical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Situation Medicale Etat Operationnel Medical</em>' containment reference.
	 * @see #getACommeSituationMedicaleEtatOperationnelMedical()
	 * @generated
	 */
	void setACommeSituationMedicaleEtatOperationnelMedical(TypeEtatOperationnelMedical value);

	/**
	 * Returns the value of the '<em><b>AComme Etat Operationnel Champ Mines Maritime Etat Operationnel Champ Mines Maritime</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Etat Operationnel Champ Mines Maritime Etat Operationnel Champ Mines Maritime</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Etat Operationnel Champ Mines Maritime Etat Operationnel Champ Mines Maritime</em>' containment reference.
	 * @see #setACommeEtatOperationnelChampMinesMaritimeEtatOperationnelChampMinesMaritime(TypeEtatOperationnelChampMinesMaritime)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelSite_ACommeEtatOperationnelChampMinesMaritimeEtatOperationnelChampMinesMaritime()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EtatOperationnelChampMinesMaritime'"
	 *        extendedMetaData="kind='element' name='ACommeEtatOperationnelChampMinesMaritime_EtatOperationnelChampMinesMaritime'"
	 * @generated
	 */
	TypeEtatOperationnelChampMinesMaritime getACommeEtatOperationnelChampMinesMaritimeEtatOperationnelChampMinesMaritime();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelSite#getACommeEtatOperationnelChampMinesMaritimeEtatOperationnelChampMinesMaritime <em>AComme Etat Operationnel Champ Mines Maritime Etat Operationnel Champ Mines Maritime</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Etat Operationnel Champ Mines Maritime Etat Operationnel Champ Mines Maritime</em>' containment reference.
	 * @see #getACommeEtatOperationnelChampMinesMaritimeEtatOperationnelChampMinesMaritime()
	 * @generated
	 */
	void setACommeEtatOperationnelChampMinesMaritimeEtatOperationnelChampMinesMaritime(TypeEtatOperationnelChampMinesMaritime value);

} // TypeEtatOperationnelSite
