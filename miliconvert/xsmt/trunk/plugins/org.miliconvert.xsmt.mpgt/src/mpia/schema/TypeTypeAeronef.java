/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeLongueur;
import mpia.meta.TypeDataTypeVitesseLineaire;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Type Aeronef</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeTypeAeronef#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeAeronef#getTypeAeronef <em>Type Aeronef</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeAeronef#getTypeAeronefNonRepertorie <em>Type Aeronef Non Repertorie</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeAeronef#getModele <em>Modele</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeAeronef#getUsage <em>Usage</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeAeronef#getRole <em>Role</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeAeronef#getMissionPrincipale <em>Mission Principale</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeAeronef#getEntrainement <em>Entrainement</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeAeronef#getQualificatifMeteo <em>Qualificatif Meteo</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeAeronef#getDesignationPilotage <em>Designation Pilotage</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeAeronef#getDecollageEtAtterrissage <em>Decollage Et Atterrissage</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeAeronef#getMaterielRavitaillementEnVol <em>Materiel Ravitaillement En Vol</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeAeronef#getCharge <em>Charge</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeAeronef#getRayonAction <em>Rayon Action</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeAeronef#getEnvergure <em>Envergure</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeAeronef#getPlafondMax <em>Plafond Max</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeAeronef#getPlafondPoser <em>Plafond Poser</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeAeronef#getVitesseMaxTransit <em>Vitesse Max Transit</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeAeronef#getVitessePuissanceMinimum <em>Vitesse Puissance Minimum</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeAeronef#getConsommationHoraireStationFixe <em>Consommation Horaire Station Fixe</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeAeronef#getConsommationHoraireTransit <em>Consommation Horaire Transit</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeAeronef#getAPourConfigurationConfiguration <em>APour Configuration Configuration</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeAeronef#getAPourEquipementEquipementHelicoptere <em>APour Equipement Equipement Helicoptere</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeTypeAeronef()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_TypeAeronef' kind='elementOnly'"
 * @generated
 */
public interface TypeTypeAeronef extends TypeTypeEquipement {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeAeronefCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeAeronefCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypeAeronefCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeTypeAeronef_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoTypeAeronefCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeAeronef#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeAeronefCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoTypeAeronefCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeAeronef#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypeAeronefCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeAeronef#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypeAeronefCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Type Aeronef</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeAeronefTypeAeronef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Aeronef</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Aeronef</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeAeronefTypeAeronef
	 * @see #isSetTypeAeronef()
	 * @see #unsetTypeAeronef()
	 * @see #setTypeAeronef(TypeDictionaryDicoTypeAeronefTypeAeronef)
	 * @see mpia.schema.SchemaPackage#getTypeTypeAeronef_TypeAeronef()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeAeronef'"
	 * @generated
	 */
	TypeDictionaryDicoTypeAeronefTypeAeronef getTypeAeronef();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeAeronef#getTypeAeronef <em>Type Aeronef</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Aeronef</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeAeronefTypeAeronef
	 * @see #isSetTypeAeronef()
	 * @see #unsetTypeAeronef()
	 * @see #getTypeAeronef()
	 * @generated
	 */
	void setTypeAeronef(TypeDictionaryDicoTypeAeronefTypeAeronef value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeAeronef#getTypeAeronef <em>Type Aeronef</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeAeronef()
	 * @see #getTypeAeronef()
	 * @see #setTypeAeronef(TypeDictionaryDicoTypeAeronefTypeAeronef)
	 * @generated
	 */
	void unsetTypeAeronef();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeAeronef#getTypeAeronef <em>Type Aeronef</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Aeronef</em>' attribute is set.
	 * @see #unsetTypeAeronef()
	 * @see #getTypeAeronef()
	 * @see #setTypeAeronef(TypeDictionaryDicoTypeAeronefTypeAeronef)
	 * @generated
	 */
	boolean isSetTypeAeronef();

	/**
	 * Returns the value of the '<em><b>Type Aeronef Non Repertorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Aeronef Non Repertorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Aeronef Non Repertorie</em>' attribute.
	 * @see #setTypeAeronefNonRepertorie(String)
	 * @see mpia.schema.SchemaPackage#getTypeTypeAeronef_TypeAeronefNonRepertorie()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='TypeAeronefNonRepertorie'"
	 * @generated
	 */
	String getTypeAeronefNonRepertorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeAeronef#getTypeAeronefNonRepertorie <em>Type Aeronef Non Repertorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Aeronef Non Repertorie</em>' attribute.
	 * @see #getTypeAeronefNonRepertorie()
	 * @generated
	 */
	void setTypeAeronefNonRepertorie(String value);

	/**
	 * Returns the value of the '<em><b>Modele</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeAeronefModele}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modele</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modele</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeAeronefModele
	 * @see #isSetModele()
	 * @see #unsetModele()
	 * @see #setModele(TypeDictionaryDicoTypeAeronefModele)
	 * @see mpia.schema.SchemaPackage#getTypeTypeAeronef_Modele()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Modele'"
	 * @generated
	 */
	TypeDictionaryDicoTypeAeronefModele getModele();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeAeronef#getModele <em>Modele</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modele</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeAeronefModele
	 * @see #isSetModele()
	 * @see #unsetModele()
	 * @see #getModele()
	 * @generated
	 */
	void setModele(TypeDictionaryDicoTypeAeronefModele value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeAeronef#getModele <em>Modele</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetModele()
	 * @see #getModele()
	 * @see #setModele(TypeDictionaryDicoTypeAeronefModele)
	 * @generated
	 */
	void unsetModele();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeAeronef#getModele <em>Modele</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Modele</em>' attribute is set.
	 * @see #unsetModele()
	 * @see #getModele()
	 * @see #setModele(TypeDictionaryDicoTypeAeronefModele)
	 * @generated
	 */
	boolean isSetModele();

	/**
	 * Returns the value of the '<em><b>Usage</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeAeronefUsage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeAeronefUsage
	 * @see #isSetUsage()
	 * @see #unsetUsage()
	 * @see #setUsage(TypeDictionaryDicoTypeAeronefUsage)
	 * @see mpia.schema.SchemaPackage#getTypeTypeAeronef_Usage()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Usage'"
	 * @generated
	 */
	TypeDictionaryDicoTypeAeronefUsage getUsage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeAeronef#getUsage <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeAeronefUsage
	 * @see #isSetUsage()
	 * @see #unsetUsage()
	 * @see #getUsage()
	 * @generated
	 */
	void setUsage(TypeDictionaryDicoTypeAeronefUsage value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeAeronef#getUsage <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUsage()
	 * @see #getUsage()
	 * @see #setUsage(TypeDictionaryDicoTypeAeronefUsage)
	 * @generated
	 */
	void unsetUsage();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeAeronef#getUsage <em>Usage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Usage</em>' attribute is set.
	 * @see #unsetUsage()
	 * @see #getUsage()
	 * @see #setUsage(TypeDictionaryDicoTypeAeronefUsage)
	 * @generated
	 */
	boolean isSetUsage();

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeAeronefRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeAeronefRole
	 * @see #isSetRole()
	 * @see #unsetRole()
	 * @see #setRole(TypeDictionaryDicoTypeAeronefRole)
	 * @see mpia.schema.SchemaPackage#getTypeTypeAeronef_Role()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Role'"
	 * @generated
	 */
	TypeDictionaryDicoTypeAeronefRole getRole();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeAeronef#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeAeronefRole
	 * @see #isSetRole()
	 * @see #unsetRole()
	 * @see #getRole()
	 * @generated
	 */
	void setRole(TypeDictionaryDicoTypeAeronefRole value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeAeronef#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRole()
	 * @see #getRole()
	 * @see #setRole(TypeDictionaryDicoTypeAeronefRole)
	 * @generated
	 */
	void unsetRole();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeAeronef#getRole <em>Role</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Role</em>' attribute is set.
	 * @see #unsetRole()
	 * @see #getRole()
	 * @see #setRole(TypeDictionaryDicoTypeAeronefRole)
	 * @generated
	 */
	boolean isSetRole();

	/**
	 * Returns the value of the '<em><b>Mission Principale</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeAeronefMissionPrincipale}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mission Principale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mission Principale</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeAeronefMissionPrincipale
	 * @see #isSetMissionPrincipale()
	 * @see #unsetMissionPrincipale()
	 * @see #setMissionPrincipale(TypeDictionaryDicoTypeAeronefMissionPrincipale)
	 * @see mpia.schema.SchemaPackage#getTypeTypeAeronef_MissionPrincipale()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='MissionPrincipale'"
	 * @generated
	 */
	TypeDictionaryDicoTypeAeronefMissionPrincipale getMissionPrincipale();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeAeronef#getMissionPrincipale <em>Mission Principale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mission Principale</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeAeronefMissionPrincipale
	 * @see #isSetMissionPrincipale()
	 * @see #unsetMissionPrincipale()
	 * @see #getMissionPrincipale()
	 * @generated
	 */
	void setMissionPrincipale(TypeDictionaryDicoTypeAeronefMissionPrincipale value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeAeronef#getMissionPrincipale <em>Mission Principale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMissionPrincipale()
	 * @see #getMissionPrincipale()
	 * @see #setMissionPrincipale(TypeDictionaryDicoTypeAeronefMissionPrincipale)
	 * @generated
	 */
	void unsetMissionPrincipale();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeAeronef#getMissionPrincipale <em>Mission Principale</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mission Principale</em>' attribute is set.
	 * @see #unsetMissionPrincipale()
	 * @see #getMissionPrincipale()
	 * @see #setMissionPrincipale(TypeDictionaryDicoTypeAeronefMissionPrincipale)
	 * @generated
	 */
	boolean isSetMissionPrincipale();

	/**
	 * Returns the value of the '<em><b>Entrainement</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeAeronefEntrainement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entrainement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entrainement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeAeronefEntrainement
	 * @see #isSetEntrainement()
	 * @see #unsetEntrainement()
	 * @see #setEntrainement(TypeDictionaryDicoTypeAeronefEntrainement)
	 * @see mpia.schema.SchemaPackage#getTypeTypeAeronef_Entrainement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Entrainement'"
	 * @generated
	 */
	TypeDictionaryDicoTypeAeronefEntrainement getEntrainement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeAeronef#getEntrainement <em>Entrainement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entrainement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeAeronefEntrainement
	 * @see #isSetEntrainement()
	 * @see #unsetEntrainement()
	 * @see #getEntrainement()
	 * @generated
	 */
	void setEntrainement(TypeDictionaryDicoTypeAeronefEntrainement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeAeronef#getEntrainement <em>Entrainement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEntrainement()
	 * @see #getEntrainement()
	 * @see #setEntrainement(TypeDictionaryDicoTypeAeronefEntrainement)
	 * @generated
	 */
	void unsetEntrainement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeAeronef#getEntrainement <em>Entrainement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Entrainement</em>' attribute is set.
	 * @see #unsetEntrainement()
	 * @see #getEntrainement()
	 * @see #setEntrainement(TypeDictionaryDicoTypeAeronefEntrainement)
	 * @generated
	 */
	boolean isSetEntrainement();

	/**
	 * Returns the value of the '<em><b>Qualificatif Meteo</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeAeronefQualificatifMeteo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualificatif Meteo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualificatif Meteo</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeAeronefQualificatifMeteo
	 * @see #isSetQualificatifMeteo()
	 * @see #unsetQualificatifMeteo()
	 * @see #setQualificatifMeteo(TypeDictionaryDicoTypeAeronefQualificatifMeteo)
	 * @see mpia.schema.SchemaPackage#getTypeTypeAeronef_QualificatifMeteo()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='QualificatifMeteo'"
	 * @generated
	 */
	TypeDictionaryDicoTypeAeronefQualificatifMeteo getQualificatifMeteo();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeAeronef#getQualificatifMeteo <em>Qualificatif Meteo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualificatif Meteo</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeAeronefQualificatifMeteo
	 * @see #isSetQualificatifMeteo()
	 * @see #unsetQualificatifMeteo()
	 * @see #getQualificatifMeteo()
	 * @generated
	 */
	void setQualificatifMeteo(TypeDictionaryDicoTypeAeronefQualificatifMeteo value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeAeronef#getQualificatifMeteo <em>Qualificatif Meteo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQualificatifMeteo()
	 * @see #getQualificatifMeteo()
	 * @see #setQualificatifMeteo(TypeDictionaryDicoTypeAeronefQualificatifMeteo)
	 * @generated
	 */
	void unsetQualificatifMeteo();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeAeronef#getQualificatifMeteo <em>Qualificatif Meteo</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Qualificatif Meteo</em>' attribute is set.
	 * @see #unsetQualificatifMeteo()
	 * @see #getQualificatifMeteo()
	 * @see #setQualificatifMeteo(TypeDictionaryDicoTypeAeronefQualificatifMeteo)
	 * @generated
	 */
	boolean isSetQualificatifMeteo();

	/**
	 * Returns the value of the '<em><b>Designation Pilotage</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeAeronefDesignationPilotage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Designation Pilotage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Designation Pilotage</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeAeronefDesignationPilotage
	 * @see #isSetDesignationPilotage()
	 * @see #unsetDesignationPilotage()
	 * @see #setDesignationPilotage(TypeDictionaryDicoTypeAeronefDesignationPilotage)
	 * @see mpia.schema.SchemaPackage#getTypeTypeAeronef_DesignationPilotage()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='DesignationPilotage'"
	 * @generated
	 */
	TypeDictionaryDicoTypeAeronefDesignationPilotage getDesignationPilotage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeAeronef#getDesignationPilotage <em>Designation Pilotage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Designation Pilotage</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeAeronefDesignationPilotage
	 * @see #isSetDesignationPilotage()
	 * @see #unsetDesignationPilotage()
	 * @see #getDesignationPilotage()
	 * @generated
	 */
	void setDesignationPilotage(TypeDictionaryDicoTypeAeronefDesignationPilotage value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeAeronef#getDesignationPilotage <em>Designation Pilotage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDesignationPilotage()
	 * @see #getDesignationPilotage()
	 * @see #setDesignationPilotage(TypeDictionaryDicoTypeAeronefDesignationPilotage)
	 * @generated
	 */
	void unsetDesignationPilotage();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeAeronef#getDesignationPilotage <em>Designation Pilotage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Designation Pilotage</em>' attribute is set.
	 * @see #unsetDesignationPilotage()
	 * @see #getDesignationPilotage()
	 * @see #setDesignationPilotage(TypeDictionaryDicoTypeAeronefDesignationPilotage)
	 * @generated
	 */
	boolean isSetDesignationPilotage();

	/**
	 * Returns the value of the '<em><b>Decollage Et Atterrissage</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeAeronefDecollageEtAtterrissage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decollage Et Atterrissage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decollage Et Atterrissage</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeAeronefDecollageEtAtterrissage
	 * @see #isSetDecollageEtAtterrissage()
	 * @see #unsetDecollageEtAtterrissage()
	 * @see #setDecollageEtAtterrissage(TypeDictionaryDicoTypeAeronefDecollageEtAtterrissage)
	 * @see mpia.schema.SchemaPackage#getTypeTypeAeronef_DecollageEtAtterrissage()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='DecollageEtAtterrissage'"
	 * @generated
	 */
	TypeDictionaryDicoTypeAeronefDecollageEtAtterrissage getDecollageEtAtterrissage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeAeronef#getDecollageEtAtterrissage <em>Decollage Et Atterrissage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decollage Et Atterrissage</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeAeronefDecollageEtAtterrissage
	 * @see #isSetDecollageEtAtterrissage()
	 * @see #unsetDecollageEtAtterrissage()
	 * @see #getDecollageEtAtterrissage()
	 * @generated
	 */
	void setDecollageEtAtterrissage(TypeDictionaryDicoTypeAeronefDecollageEtAtterrissage value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeAeronef#getDecollageEtAtterrissage <em>Decollage Et Atterrissage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDecollageEtAtterrissage()
	 * @see #getDecollageEtAtterrissage()
	 * @see #setDecollageEtAtterrissage(TypeDictionaryDicoTypeAeronefDecollageEtAtterrissage)
	 * @generated
	 */
	void unsetDecollageEtAtterrissage();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeAeronef#getDecollageEtAtterrissage <em>Decollage Et Atterrissage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Decollage Et Atterrissage</em>' attribute is set.
	 * @see #unsetDecollageEtAtterrissage()
	 * @see #getDecollageEtAtterrissage()
	 * @see #setDecollageEtAtterrissage(TypeDictionaryDicoTypeAeronefDecollageEtAtterrissage)
	 * @generated
	 */
	boolean isSetDecollageEtAtterrissage();

	/**
	 * Returns the value of the '<em><b>Materiel Ravitaillement En Vol</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeAeronefMaterielRavitaillementEnVol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Materiel Ravitaillement En Vol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Materiel Ravitaillement En Vol</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeAeronefMaterielRavitaillementEnVol
	 * @see #isSetMaterielRavitaillementEnVol()
	 * @see #unsetMaterielRavitaillementEnVol()
	 * @see #setMaterielRavitaillementEnVol(TypeDictionaryDicoTypeAeronefMaterielRavitaillementEnVol)
	 * @see mpia.schema.SchemaPackage#getTypeTypeAeronef_MaterielRavitaillementEnVol()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='MaterielRavitaillementEnVol'"
	 * @generated
	 */
	TypeDictionaryDicoTypeAeronefMaterielRavitaillementEnVol getMaterielRavitaillementEnVol();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeAeronef#getMaterielRavitaillementEnVol <em>Materiel Ravitaillement En Vol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Materiel Ravitaillement En Vol</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeAeronefMaterielRavitaillementEnVol
	 * @see #isSetMaterielRavitaillementEnVol()
	 * @see #unsetMaterielRavitaillementEnVol()
	 * @see #getMaterielRavitaillementEnVol()
	 * @generated
	 */
	void setMaterielRavitaillementEnVol(TypeDictionaryDicoTypeAeronefMaterielRavitaillementEnVol value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeAeronef#getMaterielRavitaillementEnVol <em>Materiel Ravitaillement En Vol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaterielRavitaillementEnVol()
	 * @see #getMaterielRavitaillementEnVol()
	 * @see #setMaterielRavitaillementEnVol(TypeDictionaryDicoTypeAeronefMaterielRavitaillementEnVol)
	 * @generated
	 */
	void unsetMaterielRavitaillementEnVol();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeAeronef#getMaterielRavitaillementEnVol <em>Materiel Ravitaillement En Vol</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Materiel Ravitaillement En Vol</em>' attribute is set.
	 * @see #unsetMaterielRavitaillementEnVol()
	 * @see #getMaterielRavitaillementEnVol()
	 * @see #setMaterielRavitaillementEnVol(TypeDictionaryDicoTypeAeronefMaterielRavitaillementEnVol)
	 * @generated
	 */
	boolean isSetMaterielRavitaillementEnVol();

	/**
	 * Returns the value of the '<em><b>Charge</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeAeronefCharge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charge</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charge</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeAeronefCharge
	 * @see #isSetCharge()
	 * @see #unsetCharge()
	 * @see #setCharge(TypeDictionaryDicoTypeAeronefCharge)
	 * @see mpia.schema.SchemaPackage#getTypeTypeAeronef_Charge()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Charge'"
	 * @generated
	 */
	TypeDictionaryDicoTypeAeronefCharge getCharge();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeAeronef#getCharge <em>Charge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charge</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeAeronefCharge
	 * @see #isSetCharge()
	 * @see #unsetCharge()
	 * @see #getCharge()
	 * @generated
	 */
	void setCharge(TypeDictionaryDicoTypeAeronefCharge value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeAeronef#getCharge <em>Charge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCharge()
	 * @see #getCharge()
	 * @see #setCharge(TypeDictionaryDicoTypeAeronefCharge)
	 * @generated
	 */
	void unsetCharge();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeAeronef#getCharge <em>Charge</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Charge</em>' attribute is set.
	 * @see #unsetCharge()
	 * @see #getCharge()
	 * @see #setCharge(TypeDictionaryDicoTypeAeronefCharge)
	 * @generated
	 */
	boolean isSetCharge();

	/**
	 * Returns the value of the '<em><b>Rayon Action</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeAeronefRayonAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rayon Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rayon Action</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeAeronefRayonAction
	 * @see #isSetRayonAction()
	 * @see #unsetRayonAction()
	 * @see #setRayonAction(TypeDictionaryDicoTypeAeronefRayonAction)
	 * @see mpia.schema.SchemaPackage#getTypeTypeAeronef_RayonAction()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='RayonAction'"
	 * @generated
	 */
	TypeDictionaryDicoTypeAeronefRayonAction getRayonAction();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeAeronef#getRayonAction <em>Rayon Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rayon Action</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeAeronefRayonAction
	 * @see #isSetRayonAction()
	 * @see #unsetRayonAction()
	 * @see #getRayonAction()
	 * @generated
	 */
	void setRayonAction(TypeDictionaryDicoTypeAeronefRayonAction value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeAeronef#getRayonAction <em>Rayon Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRayonAction()
	 * @see #getRayonAction()
	 * @see #setRayonAction(TypeDictionaryDicoTypeAeronefRayonAction)
	 * @generated
	 */
	void unsetRayonAction();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeAeronef#getRayonAction <em>Rayon Action</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rayon Action</em>' attribute is set.
	 * @see #unsetRayonAction()
	 * @see #getRayonAction()
	 * @see #setRayonAction(TypeDictionaryDicoTypeAeronefRayonAction)
	 * @generated
	 */
	boolean isSetRayonAction();

	/**
	 * Returns the value of the '<em><b>Envergure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Envergure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Envergure</em>' containment reference.
	 * @see #setEnvergure(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeTypeAeronef_Envergure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Envergure'"
	 * @generated
	 */
	TypeDataTypeLongueur getEnvergure();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeAeronef#getEnvergure <em>Envergure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Envergure</em>' containment reference.
	 * @see #getEnvergure()
	 * @generated
	 */
	void setEnvergure(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Plafond Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plafond Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plafond Max</em>' attribute.
	 * @see #isSetPlafondMax()
	 * @see #unsetPlafondMax()
	 * @see #setPlafondMax(long)
	 * @see mpia.schema.SchemaPackage#getTypeTypeAeronef_PlafondMax()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='PlafondMax'"
	 * @generated
	 */
	long getPlafondMax();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeAeronef#getPlafondMax <em>Plafond Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plafond Max</em>' attribute.
	 * @see #isSetPlafondMax()
	 * @see #unsetPlafondMax()
	 * @see #getPlafondMax()
	 * @generated
	 */
	void setPlafondMax(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeAeronef#getPlafondMax <em>Plafond Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPlafondMax()
	 * @see #getPlafondMax()
	 * @see #setPlafondMax(long)
	 * @generated
	 */
	void unsetPlafondMax();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeAeronef#getPlafondMax <em>Plafond Max</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Plafond Max</em>' attribute is set.
	 * @see #unsetPlafondMax()
	 * @see #getPlafondMax()
	 * @see #setPlafondMax(long)
	 * @generated
	 */
	boolean isSetPlafondMax();

	/**
	 * Returns the value of the '<em><b>Plafond Poser</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plafond Poser</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plafond Poser</em>' attribute.
	 * @see #isSetPlafondPoser()
	 * @see #unsetPlafondPoser()
	 * @see #setPlafondPoser(long)
	 * @see mpia.schema.SchemaPackage#getTypeTypeAeronef_PlafondPoser()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='PlafondPoser'"
	 * @generated
	 */
	long getPlafondPoser();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeAeronef#getPlafondPoser <em>Plafond Poser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plafond Poser</em>' attribute.
	 * @see #isSetPlafondPoser()
	 * @see #unsetPlafondPoser()
	 * @see #getPlafondPoser()
	 * @generated
	 */
	void setPlafondPoser(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeAeronef#getPlafondPoser <em>Plafond Poser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPlafondPoser()
	 * @see #getPlafondPoser()
	 * @see #setPlafondPoser(long)
	 * @generated
	 */
	void unsetPlafondPoser();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeAeronef#getPlafondPoser <em>Plafond Poser</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Plafond Poser</em>' attribute is set.
	 * @see #unsetPlafondPoser()
	 * @see #getPlafondPoser()
	 * @see #setPlafondPoser(long)
	 * @generated
	 */
	boolean isSetPlafondPoser();

	/**
	 * Returns the value of the '<em><b>Vitesse Max Transit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vitesse Max Transit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vitesse Max Transit</em>' containment reference.
	 * @see #setVitesseMaxTransit(TypeDataTypeVitesseLineaire)
	 * @see mpia.schema.SchemaPackage#getTypeTypeAeronef_VitesseMaxTransit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VitesseMaxTransit'"
	 * @generated
	 */
	TypeDataTypeVitesseLineaire getVitesseMaxTransit();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeAeronef#getVitesseMaxTransit <em>Vitesse Max Transit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vitesse Max Transit</em>' containment reference.
	 * @see #getVitesseMaxTransit()
	 * @generated
	 */
	void setVitesseMaxTransit(TypeDataTypeVitesseLineaire value);

	/**
	 * Returns the value of the '<em><b>Vitesse Puissance Minimum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vitesse Puissance Minimum</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vitesse Puissance Minimum</em>' containment reference.
	 * @see #setVitessePuissanceMinimum(TypeDataTypeVitesseLineaire)
	 * @see mpia.schema.SchemaPackage#getTypeTypeAeronef_VitessePuissanceMinimum()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VitessePuissanceMinimum'"
	 * @generated
	 */
	TypeDataTypeVitesseLineaire getVitessePuissanceMinimum();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeAeronef#getVitessePuissanceMinimum <em>Vitesse Puissance Minimum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vitesse Puissance Minimum</em>' containment reference.
	 * @see #getVitessePuissanceMinimum()
	 * @generated
	 */
	void setVitessePuissanceMinimum(TypeDataTypeVitesseLineaire value);

	/**
	 * Returns the value of the '<em><b>Consommation Horaire Station Fixe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consommation Horaire Station Fixe</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consommation Horaire Station Fixe</em>' attribute.
	 * @see #isSetConsommationHoraireStationFixe()
	 * @see #unsetConsommationHoraireStationFixe()
	 * @see #setConsommationHoraireStationFixe(long)
	 * @see mpia.schema.SchemaPackage#getTypeTypeAeronef_ConsommationHoraireStationFixe()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='ConsommationHoraireStationFixe'"
	 * @generated
	 */
	long getConsommationHoraireStationFixe();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeAeronef#getConsommationHoraireStationFixe <em>Consommation Horaire Station Fixe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consommation Horaire Station Fixe</em>' attribute.
	 * @see #isSetConsommationHoraireStationFixe()
	 * @see #unsetConsommationHoraireStationFixe()
	 * @see #getConsommationHoraireStationFixe()
	 * @generated
	 */
	void setConsommationHoraireStationFixe(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeAeronef#getConsommationHoraireStationFixe <em>Consommation Horaire Station Fixe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConsommationHoraireStationFixe()
	 * @see #getConsommationHoraireStationFixe()
	 * @see #setConsommationHoraireStationFixe(long)
	 * @generated
	 */
	void unsetConsommationHoraireStationFixe();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeAeronef#getConsommationHoraireStationFixe <em>Consommation Horaire Station Fixe</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Consommation Horaire Station Fixe</em>' attribute is set.
	 * @see #unsetConsommationHoraireStationFixe()
	 * @see #getConsommationHoraireStationFixe()
	 * @see #setConsommationHoraireStationFixe(long)
	 * @generated
	 */
	boolean isSetConsommationHoraireStationFixe();

	/**
	 * Returns the value of the '<em><b>Consommation Horaire Transit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consommation Horaire Transit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consommation Horaire Transit</em>' attribute.
	 * @see #isSetConsommationHoraireTransit()
	 * @see #unsetConsommationHoraireTransit()
	 * @see #setConsommationHoraireTransit(long)
	 * @see mpia.schema.SchemaPackage#getTypeTypeAeronef_ConsommationHoraireTransit()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='ConsommationHoraireTransit'"
	 * @generated
	 */
	long getConsommationHoraireTransit();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeAeronef#getConsommationHoraireTransit <em>Consommation Horaire Transit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consommation Horaire Transit</em>' attribute.
	 * @see #isSetConsommationHoraireTransit()
	 * @see #unsetConsommationHoraireTransit()
	 * @see #getConsommationHoraireTransit()
	 * @generated
	 */
	void setConsommationHoraireTransit(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeAeronef#getConsommationHoraireTransit <em>Consommation Horaire Transit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConsommationHoraireTransit()
	 * @see #getConsommationHoraireTransit()
	 * @see #setConsommationHoraireTransit(long)
	 * @generated
	 */
	void unsetConsommationHoraireTransit();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeAeronef#getConsommationHoraireTransit <em>Consommation Horaire Transit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Consommation Horaire Transit</em>' attribute is set.
	 * @see #unsetConsommationHoraireTransit()
	 * @see #getConsommationHoraireTransit()
	 * @see #setConsommationHoraireTransit(long)
	 * @generated
	 */
	boolean isSetConsommationHoraireTransit();

	/**
	 * Returns the value of the '<em><b>APour Configuration Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Configuration Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Configuration Configuration</em>' containment reference.
	 * @see #setAPourConfigurationConfiguration(TypeConfiguration)
	 * @see mpia.schema.SchemaPackage#getTypeTypeAeronef_APourConfigurationConfiguration()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Configuration'"
	 *        extendedMetaData="kind='element' name='APourConfiguration_Configuration'"
	 * @generated
	 */
	TypeConfiguration getAPourConfigurationConfiguration();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeAeronef#getAPourConfigurationConfiguration <em>APour Configuration Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Configuration Configuration</em>' containment reference.
	 * @see #getAPourConfigurationConfiguration()
	 * @generated
	 */
	void setAPourConfigurationConfiguration(TypeConfiguration value);

	/**
	 * Returns the value of the '<em><b>APour Equipement Equipement Helicoptere</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeEquipementHelicoptere}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Equipement Equipement Helicoptere</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Equipement Equipement Helicoptere</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeTypeAeronef_APourEquipementEquipementHelicoptere()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EquipementHelicoptere'"
	 *        extendedMetaData="kind='element' name='APourEquipement_EquipementHelicoptere'"
	 * @generated
	 */
	EList<TypeEquipementHelicoptere> getAPourEquipementEquipementHelicoptere();

} // TypeTypeAeronef
