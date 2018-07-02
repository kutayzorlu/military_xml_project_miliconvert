/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeLongueur;
import mpia.meta.TypeDataTypeMasse;
import mpia.meta.TypeDataTypeVitesseLineaire;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypePort#getTirantEauMaximum <em>Tirant Eau Maximum</em>}</li>
 *   <li>{@link mpia.schema.TypePort#getTonnageMaximumAutorise <em>Tonnage Maximum Autorise</em>}</li>
 *   <li>{@link mpia.schema.TypePort#isPiloteNecessaire <em>Pilote Necessaire</em>}</li>
 *   <li>{@link mpia.schema.TypePort#isProximiteAeroport <em>Proximite Aeroport</em>}</li>
 *   <li>{@link mpia.schema.TypePort#getChargeExplosiveLimiteJour <em>Charge Explosive Limite Jour</em>}</li>
 *   <li>{@link mpia.schema.TypePort#getChargeExplosiveLimiteNuit <em>Charge Explosive Limite Nuit</em>}</li>
 *   <li>{@link mpia.schema.TypePort#isLimitationEnHauteur <em>Limitation En Hauteur</em>}</li>
 *   <li>{@link mpia.schema.TypePort#getQualiteAbri <em>Qualite Abri</em>}</li>
 *   <li>{@link mpia.schema.TypePort#getDurabilite <em>Durabilite</em>}</li>
 *   <li>{@link mpia.schema.TypePort#isDisponibilitePilote <em>Disponibilite Pilote</em>}</li>
 *   <li>{@link mpia.schema.TypePort#isDisponibiliteRemorqueur <em>Disponibilite Remorqueur</em>}</li>
 *   <li>{@link mpia.schema.TypePort#isEncadrementConvoi <em>Encadrement Convoi</em>}</li>
 *   <li>{@link mpia.schema.TypePort#getLargeurCouloir <em>Largeur Couloir</em>}</li>
 *   <li>{@link mpia.schema.TypePort#getLongueurMaximale <em>Longueur Maximale</em>}</li>
 *   <li>{@link mpia.schema.TypePort#getLargeurMaximale <em>Largeur Maximale</em>}</li>
 *   <li>{@link mpia.schema.TypePort#getAmplitudeMaximaleMaree <em>Amplitude Maximale Maree</em>}</li>
 *   <li>{@link mpia.schema.TypePort#getAmplitudeMinimaleMaree <em>Amplitude Minimale Maree</em>}</li>
 *   <li>{@link mpia.schema.TypePort#getVitesseMoyenneMaree <em>Vitesse Moyenne Maree</em>}</li>
 *   <li>{@link mpia.schema.TypePort#getDetailsRelatifsAuxMarees <em>Details Relatifs Aux Marees</em>}</li>
 *   <li>{@link mpia.schema.TypePort#getDirectionPredominanteVent <em>Direction Predominante Vent</em>}</li>
 *   <li>{@link mpia.schema.TypePort#getVitesseMaximaleVentDominant <em>Vitesse Maximale Vent Dominant</em>}</li>
 *   <li>{@link mpia.schema.TypePort#getVitesseMaximaleEnregistree <em>Vitesse Maximale Enregistree</em>}</li>
 *   <li>{@link mpia.schema.TypePort#getInstallationsDisponibles <em>Installations Disponibles</em>}</li>
 *   <li>{@link mpia.schema.TypePort#isPossibiliteFairePlein <em>Possibilite Faire Plein</em>}</li>
 *   <li>{@link mpia.schema.TypePort#getTypePlein <em>Type Plein</em>}</li>
 *   <li>{@link mpia.schema.TypePort#getDetailsLiesAuPlein <em>Details Lies Au Plein</em>}</li>
 *   <li>{@link mpia.schema.TypePort#isEauDisponible <em>Eau Disponible</em>}</li>
 *   <li>{@link mpia.schema.TypePort#isExistenceCapaciteAntiIncendie <em>Existence Capacite Anti Incendie</em>}</li>
 *   <li>{@link mpia.schema.TypePort#getTypeCapaciteAntiIncendie <em>Type Capacite Anti Incendie</em>}</li>
 *   <li>{@link mpia.schema.TypePort#isFacilitesTransit <em>Facilites Transit</em>}</li>
 *   <li>{@link mpia.schema.TypePort#isCapaciteAGererPassagers <em>Capacite AGerer Passagers</em>}</li>
 *   <li>{@link mpia.schema.TypePort#isInstallationsTraitementPetroliers <em>Installations Traitement Petroliers</em>}</li>
 *   <li>{@link mpia.schema.TypePort#isSecurisationBiologique <em>Securisation Biologique</em>}</li>
 *   <li>{@link mpia.schema.TypePort#isCapaciteReceptionLestSouille <em>Capacite Reception Lest Souille</em>}</li>
 *   <li>{@link mpia.schema.TypePort#isInstallationsDemagnetisation <em>Installations Demagnetisation</em>}</li>
 *   <li>{@link mpia.schema.TypePort#isPossibiliteUsageAccon <em>Possibilite Usage Accon</em>}</li>
 *   <li>{@link mpia.schema.TypePort#isTransportParAcconage <em>Transport Par Acconage</em>}</li>
 *   <li>{@link mpia.schema.TypePort#isZonePourTourner <em>Zone Pour Tourner</em>}</li>
 *   <li>{@link mpia.schema.TypePort#isObligationMessageHeureArriveePrevue <em>Obligation Message Heure Arrivee Prevue</em>}</li>
 *   <li>{@link mpia.schema.TypePort#isDouaneOuServicesImmigration <em>Douane Ou Services Immigration</em>}</li>
 *   <li>{@link mpia.schema.TypePort#isEntreeRestreintePourCauseForteHoule <em>Entree Restreinte Pour Cause Forte Houle</em>}</li>
 *   <li>{@link mpia.schema.TypePort#isEntreeRestreintePourCauseGlace <em>Entree Restreinte Pour Cause Glace</em>}</li>
 *   <li>{@link mpia.schema.TypePort#getMesuresRestrictionEntree <em>Mesures Restriction Entree</em>}</li>
 *   <li>{@link mpia.schema.TypePort#getDetailsSaisonniers <em>Details Saisonniers</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypePort()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_Port' kind='elementOnly'"
 * @generated
 */
public interface TypePort extends TypeSite {
	/**
	 * Returns the value of the '<em><b>Tirant Eau Maximum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tirant Eau Maximum</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tirant Eau Maximum</em>' containment reference.
	 * @see #setTirantEauMaximum(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypePort_TirantEauMaximum()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TirantEauMaximum'"
	 * @generated
	 */
	TypeDataTypeLongueur getTirantEauMaximum();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePort#getTirantEauMaximum <em>Tirant Eau Maximum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tirant Eau Maximum</em>' containment reference.
	 * @see #getTirantEauMaximum()
	 * @generated
	 */
	void setTirantEauMaximum(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Tonnage Maximum Autorise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tonnage Maximum Autorise</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tonnage Maximum Autorise</em>' attribute.
	 * @see #isSetTonnageMaximumAutorise()
	 * @see #unsetTonnageMaximumAutorise()
	 * @see #setTonnageMaximumAutorise(long)
	 * @see mpia.schema.SchemaPackage#getTypePort_TonnageMaximumAutorise()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier9"
	 *        extendedMetaData="kind='element' name='TonnageMaximumAutorise'"
	 * @generated
	 */
	long getTonnageMaximumAutorise();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePort#getTonnageMaximumAutorise <em>Tonnage Maximum Autorise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tonnage Maximum Autorise</em>' attribute.
	 * @see #isSetTonnageMaximumAutorise()
	 * @see #unsetTonnageMaximumAutorise()
	 * @see #getTonnageMaximumAutorise()
	 * @generated
	 */
	void setTonnageMaximumAutorise(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePort#getTonnageMaximumAutorise <em>Tonnage Maximum Autorise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTonnageMaximumAutorise()
	 * @see #getTonnageMaximumAutorise()
	 * @see #setTonnageMaximumAutorise(long)
	 * @generated
	 */
	void unsetTonnageMaximumAutorise();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePort#getTonnageMaximumAutorise <em>Tonnage Maximum Autorise</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tonnage Maximum Autorise</em>' attribute is set.
	 * @see #unsetTonnageMaximumAutorise()
	 * @see #getTonnageMaximumAutorise()
	 * @see #setTonnageMaximumAutorise(long)
	 * @generated
	 */
	boolean isSetTonnageMaximumAutorise();

	/**
	 * Returns the value of the '<em><b>Pilote Necessaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pilote Necessaire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pilote Necessaire</em>' attribute.
	 * @see #isSetPiloteNecessaire()
	 * @see #unsetPiloteNecessaire()
	 * @see #setPiloteNecessaire(boolean)
	 * @see mpia.schema.SchemaPackage#getTypePort_PiloteNecessaire()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='PiloteNecessaire'"
	 * @generated
	 */
	boolean isPiloteNecessaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePort#isPiloteNecessaire <em>Pilote Necessaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pilote Necessaire</em>' attribute.
	 * @see #isSetPiloteNecessaire()
	 * @see #unsetPiloteNecessaire()
	 * @see #isPiloteNecessaire()
	 * @generated
	 */
	void setPiloteNecessaire(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePort#isPiloteNecessaire <em>Pilote Necessaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPiloteNecessaire()
	 * @see #isPiloteNecessaire()
	 * @see #setPiloteNecessaire(boolean)
	 * @generated
	 */
	void unsetPiloteNecessaire();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePort#isPiloteNecessaire <em>Pilote Necessaire</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pilote Necessaire</em>' attribute is set.
	 * @see #unsetPiloteNecessaire()
	 * @see #isPiloteNecessaire()
	 * @see #setPiloteNecessaire(boolean)
	 * @generated
	 */
	boolean isSetPiloteNecessaire();

	/**
	 * Returns the value of the '<em><b>Proximite Aeroport</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proximite Aeroport</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proximite Aeroport</em>' attribute.
	 * @see #isSetProximiteAeroport()
	 * @see #unsetProximiteAeroport()
	 * @see #setProximiteAeroport(boolean)
	 * @see mpia.schema.SchemaPackage#getTypePort_ProximiteAeroport()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='ProximiteAeroport'"
	 * @generated
	 */
	boolean isProximiteAeroport();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePort#isProximiteAeroport <em>Proximite Aeroport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proximite Aeroport</em>' attribute.
	 * @see #isSetProximiteAeroport()
	 * @see #unsetProximiteAeroport()
	 * @see #isProximiteAeroport()
	 * @generated
	 */
	void setProximiteAeroport(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePort#isProximiteAeroport <em>Proximite Aeroport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProximiteAeroport()
	 * @see #isProximiteAeroport()
	 * @see #setProximiteAeroport(boolean)
	 * @generated
	 */
	void unsetProximiteAeroport();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePort#isProximiteAeroport <em>Proximite Aeroport</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Proximite Aeroport</em>' attribute is set.
	 * @see #unsetProximiteAeroport()
	 * @see #isProximiteAeroport()
	 * @see #setProximiteAeroport(boolean)
	 * @generated
	 */
	boolean isSetProximiteAeroport();

	/**
	 * Returns the value of the '<em><b>Charge Explosive Limite Jour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charge Explosive Limite Jour</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charge Explosive Limite Jour</em>' containment reference.
	 * @see #setChargeExplosiveLimiteJour(TypeDataTypeMasse)
	 * @see mpia.schema.SchemaPackage#getTypePort_ChargeExplosiveLimiteJour()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ChargeExplosiveLimiteJour'"
	 * @generated
	 */
	TypeDataTypeMasse getChargeExplosiveLimiteJour();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePort#getChargeExplosiveLimiteJour <em>Charge Explosive Limite Jour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charge Explosive Limite Jour</em>' containment reference.
	 * @see #getChargeExplosiveLimiteJour()
	 * @generated
	 */
	void setChargeExplosiveLimiteJour(TypeDataTypeMasse value);

	/**
	 * Returns the value of the '<em><b>Charge Explosive Limite Nuit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charge Explosive Limite Nuit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charge Explosive Limite Nuit</em>' containment reference.
	 * @see #setChargeExplosiveLimiteNuit(TypeDataTypeMasse)
	 * @see mpia.schema.SchemaPackage#getTypePort_ChargeExplosiveLimiteNuit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ChargeExplosiveLimiteNuit'"
	 * @generated
	 */
	TypeDataTypeMasse getChargeExplosiveLimiteNuit();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePort#getChargeExplosiveLimiteNuit <em>Charge Explosive Limite Nuit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charge Explosive Limite Nuit</em>' containment reference.
	 * @see #getChargeExplosiveLimiteNuit()
	 * @generated
	 */
	void setChargeExplosiveLimiteNuit(TypeDataTypeMasse value);

	/**
	 * Returns the value of the '<em><b>Limitation En Hauteur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limitation En Hauteur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limitation En Hauteur</em>' attribute.
	 * @see #isSetLimitationEnHauteur()
	 * @see #unsetLimitationEnHauteur()
	 * @see #setLimitationEnHauteur(boolean)
	 * @see mpia.schema.SchemaPackage#getTypePort_LimitationEnHauteur()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='LimitationEnHauteur'"
	 * @generated
	 */
	boolean isLimitationEnHauteur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePort#isLimitationEnHauteur <em>Limitation En Hauteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limitation En Hauteur</em>' attribute.
	 * @see #isSetLimitationEnHauteur()
	 * @see #unsetLimitationEnHauteur()
	 * @see #isLimitationEnHauteur()
	 * @generated
	 */
	void setLimitationEnHauteur(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePort#isLimitationEnHauteur <em>Limitation En Hauteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLimitationEnHauteur()
	 * @see #isLimitationEnHauteur()
	 * @see #setLimitationEnHauteur(boolean)
	 * @generated
	 */
	void unsetLimitationEnHauteur();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePort#isLimitationEnHauteur <em>Limitation En Hauteur</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Limitation En Hauteur</em>' attribute is set.
	 * @see #unsetLimitationEnHauteur()
	 * @see #isLimitationEnHauteur()
	 * @see #setLimitationEnHauteur(boolean)
	 * @generated
	 */
	boolean isSetLimitationEnHauteur();

	/**
	 * Returns the value of the '<em><b>Qualite Abri</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPortQualiteAbri}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualite Abri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualite Abri</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPortQualiteAbri
	 * @see #isSetQualiteAbri()
	 * @see #unsetQualiteAbri()
	 * @see #setQualiteAbri(TypeDictionaryDicoPortQualiteAbri)
	 * @see mpia.schema.SchemaPackage#getTypePort_QualiteAbri()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='QualiteAbri'"
	 * @generated
	 */
	TypeDictionaryDicoPortQualiteAbri getQualiteAbri();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePort#getQualiteAbri <em>Qualite Abri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualite Abri</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPortQualiteAbri
	 * @see #isSetQualiteAbri()
	 * @see #unsetQualiteAbri()
	 * @see #getQualiteAbri()
	 * @generated
	 */
	void setQualiteAbri(TypeDictionaryDicoPortQualiteAbri value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePort#getQualiteAbri <em>Qualite Abri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQualiteAbri()
	 * @see #getQualiteAbri()
	 * @see #setQualiteAbri(TypeDictionaryDicoPortQualiteAbri)
	 * @generated
	 */
	void unsetQualiteAbri();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePort#getQualiteAbri <em>Qualite Abri</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Qualite Abri</em>' attribute is set.
	 * @see #unsetQualiteAbri()
	 * @see #getQualiteAbri()
	 * @see #setQualiteAbri(TypeDictionaryDicoPortQualiteAbri)
	 * @generated
	 */
	boolean isSetQualiteAbri();

	/**
	 * Returns the value of the '<em><b>Durabilite</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPortDurabilite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Durabilite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Durabilite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPortDurabilite
	 * @see #isSetDurabilite()
	 * @see #unsetDurabilite()
	 * @see #setDurabilite(TypeDictionaryDicoPortDurabilite)
	 * @see mpia.schema.SchemaPackage#getTypePort_Durabilite()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Durabilite'"
	 * @generated
	 */
	TypeDictionaryDicoPortDurabilite getDurabilite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePort#getDurabilite <em>Durabilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Durabilite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPortDurabilite
	 * @see #isSetDurabilite()
	 * @see #unsetDurabilite()
	 * @see #getDurabilite()
	 * @generated
	 */
	void setDurabilite(TypeDictionaryDicoPortDurabilite value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePort#getDurabilite <em>Durabilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDurabilite()
	 * @see #getDurabilite()
	 * @see #setDurabilite(TypeDictionaryDicoPortDurabilite)
	 * @generated
	 */
	void unsetDurabilite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePort#getDurabilite <em>Durabilite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Durabilite</em>' attribute is set.
	 * @see #unsetDurabilite()
	 * @see #getDurabilite()
	 * @see #setDurabilite(TypeDictionaryDicoPortDurabilite)
	 * @generated
	 */
	boolean isSetDurabilite();

	/**
	 * Returns the value of the '<em><b>Disponibilite Pilote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disponibilite Pilote</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disponibilite Pilote</em>' attribute.
	 * @see #isSetDisponibilitePilote()
	 * @see #unsetDisponibilitePilote()
	 * @see #setDisponibilitePilote(boolean)
	 * @see mpia.schema.SchemaPackage#getTypePort_DisponibilitePilote()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='DisponibilitePilote'"
	 * @generated
	 */
	boolean isDisponibilitePilote();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePort#isDisponibilitePilote <em>Disponibilite Pilote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disponibilite Pilote</em>' attribute.
	 * @see #isSetDisponibilitePilote()
	 * @see #unsetDisponibilitePilote()
	 * @see #isDisponibilitePilote()
	 * @generated
	 */
	void setDisponibilitePilote(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePort#isDisponibilitePilote <em>Disponibilite Pilote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisponibilitePilote()
	 * @see #isDisponibilitePilote()
	 * @see #setDisponibilitePilote(boolean)
	 * @generated
	 */
	void unsetDisponibilitePilote();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePort#isDisponibilitePilote <em>Disponibilite Pilote</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Disponibilite Pilote</em>' attribute is set.
	 * @see #unsetDisponibilitePilote()
	 * @see #isDisponibilitePilote()
	 * @see #setDisponibilitePilote(boolean)
	 * @generated
	 */
	boolean isSetDisponibilitePilote();

	/**
	 * Returns the value of the '<em><b>Disponibilite Remorqueur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disponibilite Remorqueur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disponibilite Remorqueur</em>' attribute.
	 * @see #isSetDisponibiliteRemorqueur()
	 * @see #unsetDisponibiliteRemorqueur()
	 * @see #setDisponibiliteRemorqueur(boolean)
	 * @see mpia.schema.SchemaPackage#getTypePort_DisponibiliteRemorqueur()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='DisponibiliteRemorqueur'"
	 * @generated
	 */
	boolean isDisponibiliteRemorqueur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePort#isDisponibiliteRemorqueur <em>Disponibilite Remorqueur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disponibilite Remorqueur</em>' attribute.
	 * @see #isSetDisponibiliteRemorqueur()
	 * @see #unsetDisponibiliteRemorqueur()
	 * @see #isDisponibiliteRemorqueur()
	 * @generated
	 */
	void setDisponibiliteRemorqueur(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePort#isDisponibiliteRemorqueur <em>Disponibilite Remorqueur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisponibiliteRemorqueur()
	 * @see #isDisponibiliteRemorqueur()
	 * @see #setDisponibiliteRemorqueur(boolean)
	 * @generated
	 */
	void unsetDisponibiliteRemorqueur();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePort#isDisponibiliteRemorqueur <em>Disponibilite Remorqueur</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Disponibilite Remorqueur</em>' attribute is set.
	 * @see #unsetDisponibiliteRemorqueur()
	 * @see #isDisponibiliteRemorqueur()
	 * @see #setDisponibiliteRemorqueur(boolean)
	 * @generated
	 */
	boolean isSetDisponibiliteRemorqueur();

	/**
	 * Returns the value of the '<em><b>Encadrement Convoi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encadrement Convoi</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encadrement Convoi</em>' attribute.
	 * @see #isSetEncadrementConvoi()
	 * @see #unsetEncadrementConvoi()
	 * @see #setEncadrementConvoi(boolean)
	 * @see mpia.schema.SchemaPackage#getTypePort_EncadrementConvoi()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='EncadrementConvoi'"
	 * @generated
	 */
	boolean isEncadrementConvoi();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePort#isEncadrementConvoi <em>Encadrement Convoi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encadrement Convoi</em>' attribute.
	 * @see #isSetEncadrementConvoi()
	 * @see #unsetEncadrementConvoi()
	 * @see #isEncadrementConvoi()
	 * @generated
	 */
	void setEncadrementConvoi(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePort#isEncadrementConvoi <em>Encadrement Convoi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEncadrementConvoi()
	 * @see #isEncadrementConvoi()
	 * @see #setEncadrementConvoi(boolean)
	 * @generated
	 */
	void unsetEncadrementConvoi();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePort#isEncadrementConvoi <em>Encadrement Convoi</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Encadrement Convoi</em>' attribute is set.
	 * @see #unsetEncadrementConvoi()
	 * @see #isEncadrementConvoi()
	 * @see #setEncadrementConvoi(boolean)
	 * @generated
	 */
	boolean isSetEncadrementConvoi();

	/**
	 * Returns the value of the '<em><b>Largeur Couloir</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Largeur Couloir</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Largeur Couloir</em>' containment reference.
	 * @see #setLargeurCouloir(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypePort_LargeurCouloir()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LargeurCouloir'"
	 * @generated
	 */
	TypeDataTypeLongueur getLargeurCouloir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePort#getLargeurCouloir <em>Largeur Couloir</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Largeur Couloir</em>' containment reference.
	 * @see #getLargeurCouloir()
	 * @generated
	 */
	void setLargeurCouloir(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Longueur Maximale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Longueur Maximale</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longueur Maximale</em>' containment reference.
	 * @see #setLongueurMaximale(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypePort_LongueurMaximale()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LongueurMaximale'"
	 * @generated
	 */
	TypeDataTypeLongueur getLongueurMaximale();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePort#getLongueurMaximale <em>Longueur Maximale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longueur Maximale</em>' containment reference.
	 * @see #getLongueurMaximale()
	 * @generated
	 */
	void setLongueurMaximale(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Largeur Maximale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Largeur Maximale</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Largeur Maximale</em>' containment reference.
	 * @see #setLargeurMaximale(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypePort_LargeurMaximale()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LargeurMaximale'"
	 * @generated
	 */
	TypeDataTypeLongueur getLargeurMaximale();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePort#getLargeurMaximale <em>Largeur Maximale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Largeur Maximale</em>' containment reference.
	 * @see #getLargeurMaximale()
	 * @generated
	 */
	void setLargeurMaximale(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Amplitude Maximale Maree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amplitude Maximale Maree</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amplitude Maximale Maree</em>' containment reference.
	 * @see #setAmplitudeMaximaleMaree(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypePort_AmplitudeMaximaleMaree()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AmplitudeMaximaleMaree'"
	 * @generated
	 */
	TypeDataTypeLongueur getAmplitudeMaximaleMaree();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePort#getAmplitudeMaximaleMaree <em>Amplitude Maximale Maree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amplitude Maximale Maree</em>' containment reference.
	 * @see #getAmplitudeMaximaleMaree()
	 * @generated
	 */
	void setAmplitudeMaximaleMaree(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Amplitude Minimale Maree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amplitude Minimale Maree</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amplitude Minimale Maree</em>' containment reference.
	 * @see #setAmplitudeMinimaleMaree(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypePort_AmplitudeMinimaleMaree()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AmplitudeMinimaleMaree'"
	 * @generated
	 */
	TypeDataTypeLongueur getAmplitudeMinimaleMaree();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePort#getAmplitudeMinimaleMaree <em>Amplitude Minimale Maree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amplitude Minimale Maree</em>' containment reference.
	 * @see #getAmplitudeMinimaleMaree()
	 * @generated
	 */
	void setAmplitudeMinimaleMaree(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Vitesse Moyenne Maree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vitesse Moyenne Maree</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vitesse Moyenne Maree</em>' containment reference.
	 * @see #setVitesseMoyenneMaree(TypeDataTypeVitesseLineaire)
	 * @see mpia.schema.SchemaPackage#getTypePort_VitesseMoyenneMaree()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VitesseMoyenneMaree'"
	 * @generated
	 */
	TypeDataTypeVitesseLineaire getVitesseMoyenneMaree();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePort#getVitesseMoyenneMaree <em>Vitesse Moyenne Maree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vitesse Moyenne Maree</em>' containment reference.
	 * @see #getVitesseMoyenneMaree()
	 * @generated
	 */
	void setVitesseMoyenneMaree(TypeDataTypeVitesseLineaire value);

	/**
	 * Returns the value of the '<em><b>Details Relatifs Aux Marees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Details Relatifs Aux Marees</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Details Relatifs Aux Marees</em>' attribute.
	 * @see #setDetailsRelatifsAuxMarees(String)
	 * @see mpia.schema.SchemaPackage#getTypePort_DetailsRelatifsAuxMarees()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='DetailsRelatifsAuxMarees'"
	 * @generated
	 */
	String getDetailsRelatifsAuxMarees();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePort#getDetailsRelatifsAuxMarees <em>Details Relatifs Aux Marees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Details Relatifs Aux Marees</em>' attribute.
	 * @see #getDetailsRelatifsAuxMarees()
	 * @generated
	 */
	void setDetailsRelatifsAuxMarees(String value);

	/**
	 * Returns the value of the '<em><b>Direction Predominante Vent</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction Predominante Vent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction Predominante Vent</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDirection
	 * @see #isSetDirectionPredominanteVent()
	 * @see #unsetDirectionPredominanteVent()
	 * @see #setDirectionPredominanteVent(TypeDictionaryDicoDirection)
	 * @see mpia.schema.SchemaPackage#getTypePort_DirectionPredominanteVent()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='DirectionPredominanteVent'"
	 * @generated
	 */
	TypeDictionaryDicoDirection getDirectionPredominanteVent();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePort#getDirectionPredominanteVent <em>Direction Predominante Vent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction Predominante Vent</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDirection
	 * @see #isSetDirectionPredominanteVent()
	 * @see #unsetDirectionPredominanteVent()
	 * @see #getDirectionPredominanteVent()
	 * @generated
	 */
	void setDirectionPredominanteVent(TypeDictionaryDicoDirection value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePort#getDirectionPredominanteVent <em>Direction Predominante Vent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDirectionPredominanteVent()
	 * @see #getDirectionPredominanteVent()
	 * @see #setDirectionPredominanteVent(TypeDictionaryDicoDirection)
	 * @generated
	 */
	void unsetDirectionPredominanteVent();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePort#getDirectionPredominanteVent <em>Direction Predominante Vent</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Direction Predominante Vent</em>' attribute is set.
	 * @see #unsetDirectionPredominanteVent()
	 * @see #getDirectionPredominanteVent()
	 * @see #setDirectionPredominanteVent(TypeDictionaryDicoDirection)
	 * @generated
	 */
	boolean isSetDirectionPredominanteVent();

	/**
	 * Returns the value of the '<em><b>Vitesse Maximale Vent Dominant</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPrecisionVitesse}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vitesse Maximale Vent Dominant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vitesse Maximale Vent Dominant</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPrecisionVitesse
	 * @see #isSetVitesseMaximaleVentDominant()
	 * @see #unsetVitesseMaximaleVentDominant()
	 * @see #setVitesseMaximaleVentDominant(TypeDictionaryDicoPrecisionVitesse)
	 * @see mpia.schema.SchemaPackage#getTypePort_VitesseMaximaleVentDominant()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='VitesseMaximaleVentDominant'"
	 * @generated
	 */
	TypeDictionaryDicoPrecisionVitesse getVitesseMaximaleVentDominant();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePort#getVitesseMaximaleVentDominant <em>Vitesse Maximale Vent Dominant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vitesse Maximale Vent Dominant</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPrecisionVitesse
	 * @see #isSetVitesseMaximaleVentDominant()
	 * @see #unsetVitesseMaximaleVentDominant()
	 * @see #getVitesseMaximaleVentDominant()
	 * @generated
	 */
	void setVitesseMaximaleVentDominant(TypeDictionaryDicoPrecisionVitesse value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePort#getVitesseMaximaleVentDominant <em>Vitesse Maximale Vent Dominant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVitesseMaximaleVentDominant()
	 * @see #getVitesseMaximaleVentDominant()
	 * @see #setVitesseMaximaleVentDominant(TypeDictionaryDicoPrecisionVitesse)
	 * @generated
	 */
	void unsetVitesseMaximaleVentDominant();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePort#getVitesseMaximaleVentDominant <em>Vitesse Maximale Vent Dominant</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vitesse Maximale Vent Dominant</em>' attribute is set.
	 * @see #unsetVitesseMaximaleVentDominant()
	 * @see #getVitesseMaximaleVentDominant()
	 * @see #setVitesseMaximaleVentDominant(TypeDictionaryDicoPrecisionVitesse)
	 * @generated
	 */
	boolean isSetVitesseMaximaleVentDominant();

	/**
	 * Returns the value of the '<em><b>Vitesse Maximale Enregistree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vitesse Maximale Enregistree</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vitesse Maximale Enregistree</em>' containment reference.
	 * @see #setVitesseMaximaleEnregistree(TypeDataTypeVitesseLineaire)
	 * @see mpia.schema.SchemaPackage#getTypePort_VitesseMaximaleEnregistree()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VitesseMaximaleEnregistree'"
	 * @generated
	 */
	TypeDataTypeVitesseLineaire getVitesseMaximaleEnregistree();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePort#getVitesseMaximaleEnregistree <em>Vitesse Maximale Enregistree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vitesse Maximale Enregistree</em>' containment reference.
	 * @see #getVitesseMaximaleEnregistree()
	 * @generated
	 */
	void setVitesseMaximaleEnregistree(TypeDataTypeVitesseLineaire value);

	/**
	 * Returns the value of the '<em><b>Installations Disponibles</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPortInstallationsDisponibles}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Installations Disponibles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Installations Disponibles</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPortInstallationsDisponibles
	 * @see #isSetInstallationsDisponibles()
	 * @see #unsetInstallationsDisponibles()
	 * @see #setInstallationsDisponibles(TypeDictionaryDicoPortInstallationsDisponibles)
	 * @see mpia.schema.SchemaPackage#getTypePort_InstallationsDisponibles()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='InstallationsDisponibles'"
	 * @generated
	 */
	TypeDictionaryDicoPortInstallationsDisponibles getInstallationsDisponibles();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePort#getInstallationsDisponibles <em>Installations Disponibles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Installations Disponibles</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPortInstallationsDisponibles
	 * @see #isSetInstallationsDisponibles()
	 * @see #unsetInstallationsDisponibles()
	 * @see #getInstallationsDisponibles()
	 * @generated
	 */
	void setInstallationsDisponibles(TypeDictionaryDicoPortInstallationsDisponibles value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePort#getInstallationsDisponibles <em>Installations Disponibles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInstallationsDisponibles()
	 * @see #getInstallationsDisponibles()
	 * @see #setInstallationsDisponibles(TypeDictionaryDicoPortInstallationsDisponibles)
	 * @generated
	 */
	void unsetInstallationsDisponibles();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePort#getInstallationsDisponibles <em>Installations Disponibles</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Installations Disponibles</em>' attribute is set.
	 * @see #unsetInstallationsDisponibles()
	 * @see #getInstallationsDisponibles()
	 * @see #setInstallationsDisponibles(TypeDictionaryDicoPortInstallationsDisponibles)
	 * @generated
	 */
	boolean isSetInstallationsDisponibles();

	/**
	 * Returns the value of the '<em><b>Possibilite Faire Plein</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Possibilite Faire Plein</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Possibilite Faire Plein</em>' attribute.
	 * @see #isSetPossibiliteFairePlein()
	 * @see #unsetPossibiliteFairePlein()
	 * @see #setPossibiliteFairePlein(boolean)
	 * @see mpia.schema.SchemaPackage#getTypePort_PossibiliteFairePlein()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='PossibiliteFairePlein'"
	 * @generated
	 */
	boolean isPossibiliteFairePlein();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePort#isPossibiliteFairePlein <em>Possibilite Faire Plein</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Possibilite Faire Plein</em>' attribute.
	 * @see #isSetPossibiliteFairePlein()
	 * @see #unsetPossibiliteFairePlein()
	 * @see #isPossibiliteFairePlein()
	 * @generated
	 */
	void setPossibiliteFairePlein(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePort#isPossibiliteFairePlein <em>Possibilite Faire Plein</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPossibiliteFairePlein()
	 * @see #isPossibiliteFairePlein()
	 * @see #setPossibiliteFairePlein(boolean)
	 * @generated
	 */
	void unsetPossibiliteFairePlein();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePort#isPossibiliteFairePlein <em>Possibilite Faire Plein</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Possibilite Faire Plein</em>' attribute is set.
	 * @see #unsetPossibiliteFairePlein()
	 * @see #isPossibiliteFairePlein()
	 * @see #setPossibiliteFairePlein(boolean)
	 * @generated
	 */
	boolean isSetPossibiliteFairePlein();

	/**
	 * Returns the value of the '<em><b>Type Plein</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPortTypePlein}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Plein</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Plein</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPortTypePlein
	 * @see #isSetTypePlein()
	 * @see #unsetTypePlein()
	 * @see #setTypePlein(TypeDictionaryDicoPortTypePlein)
	 * @see mpia.schema.SchemaPackage#getTypePort_TypePlein()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypePlein'"
	 * @generated
	 */
	TypeDictionaryDicoPortTypePlein getTypePlein();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePort#getTypePlein <em>Type Plein</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Plein</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPortTypePlein
	 * @see #isSetTypePlein()
	 * @see #unsetTypePlein()
	 * @see #getTypePlein()
	 * @generated
	 */
	void setTypePlein(TypeDictionaryDicoPortTypePlein value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePort#getTypePlein <em>Type Plein</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypePlein()
	 * @see #getTypePlein()
	 * @see #setTypePlein(TypeDictionaryDicoPortTypePlein)
	 * @generated
	 */
	void unsetTypePlein();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePort#getTypePlein <em>Type Plein</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Plein</em>' attribute is set.
	 * @see #unsetTypePlein()
	 * @see #getTypePlein()
	 * @see #setTypePlein(TypeDictionaryDicoPortTypePlein)
	 * @generated
	 */
	boolean isSetTypePlein();

	/**
	 * Returns the value of the '<em><b>Details Lies Au Plein</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Details Lies Au Plein</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Details Lies Au Plein</em>' attribute.
	 * @see #setDetailsLiesAuPlein(String)
	 * @see mpia.schema.SchemaPackage#getTypePort_DetailsLiesAuPlein()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='DetailsLiesAuPlein'"
	 * @generated
	 */
	String getDetailsLiesAuPlein();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePort#getDetailsLiesAuPlein <em>Details Lies Au Plein</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Details Lies Au Plein</em>' attribute.
	 * @see #getDetailsLiesAuPlein()
	 * @generated
	 */
	void setDetailsLiesAuPlein(String value);

	/**
	 * Returns the value of the '<em><b>Eau Disponible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eau Disponible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eau Disponible</em>' attribute.
	 * @see #isSetEauDisponible()
	 * @see #unsetEauDisponible()
	 * @see #setEauDisponible(boolean)
	 * @see mpia.schema.SchemaPackage#getTypePort_EauDisponible()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='EauDisponible'"
	 * @generated
	 */
	boolean isEauDisponible();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePort#isEauDisponible <em>Eau Disponible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eau Disponible</em>' attribute.
	 * @see #isSetEauDisponible()
	 * @see #unsetEauDisponible()
	 * @see #isEauDisponible()
	 * @generated
	 */
	void setEauDisponible(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePort#isEauDisponible <em>Eau Disponible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEauDisponible()
	 * @see #isEauDisponible()
	 * @see #setEauDisponible(boolean)
	 * @generated
	 */
	void unsetEauDisponible();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePort#isEauDisponible <em>Eau Disponible</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Eau Disponible</em>' attribute is set.
	 * @see #unsetEauDisponible()
	 * @see #isEauDisponible()
	 * @see #setEauDisponible(boolean)
	 * @generated
	 */
	boolean isSetEauDisponible();

	/**
	 * Returns the value of the '<em><b>Existence Capacite Anti Incendie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Existence Capacite Anti Incendie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Existence Capacite Anti Incendie</em>' attribute.
	 * @see #isSetExistenceCapaciteAntiIncendie()
	 * @see #unsetExistenceCapaciteAntiIncendie()
	 * @see #setExistenceCapaciteAntiIncendie(boolean)
	 * @see mpia.schema.SchemaPackage#getTypePort_ExistenceCapaciteAntiIncendie()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='ExistenceCapaciteAntiIncendie'"
	 * @generated
	 */
	boolean isExistenceCapaciteAntiIncendie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePort#isExistenceCapaciteAntiIncendie <em>Existence Capacite Anti Incendie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Existence Capacite Anti Incendie</em>' attribute.
	 * @see #isSetExistenceCapaciteAntiIncendie()
	 * @see #unsetExistenceCapaciteAntiIncendie()
	 * @see #isExistenceCapaciteAntiIncendie()
	 * @generated
	 */
	void setExistenceCapaciteAntiIncendie(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePort#isExistenceCapaciteAntiIncendie <em>Existence Capacite Anti Incendie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExistenceCapaciteAntiIncendie()
	 * @see #isExistenceCapaciteAntiIncendie()
	 * @see #setExistenceCapaciteAntiIncendie(boolean)
	 * @generated
	 */
	void unsetExistenceCapaciteAntiIncendie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePort#isExistenceCapaciteAntiIncendie <em>Existence Capacite Anti Incendie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Existence Capacite Anti Incendie</em>' attribute is set.
	 * @see #unsetExistenceCapaciteAntiIncendie()
	 * @see #isExistenceCapaciteAntiIncendie()
	 * @see #setExistenceCapaciteAntiIncendie(boolean)
	 * @generated
	 */
	boolean isSetExistenceCapaciteAntiIncendie();

	/**
	 * Returns the value of the '<em><b>Type Capacite Anti Incendie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPortTypeCapaciteAntiIncendie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Capacite Anti Incendie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Capacite Anti Incendie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPortTypeCapaciteAntiIncendie
	 * @see #isSetTypeCapaciteAntiIncendie()
	 * @see #unsetTypeCapaciteAntiIncendie()
	 * @see #setTypeCapaciteAntiIncendie(TypeDictionaryDicoPortTypeCapaciteAntiIncendie)
	 * @see mpia.schema.SchemaPackage#getTypePort_TypeCapaciteAntiIncendie()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeCapaciteAntiIncendie'"
	 * @generated
	 */
	TypeDictionaryDicoPortTypeCapaciteAntiIncendie getTypeCapaciteAntiIncendie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePort#getTypeCapaciteAntiIncendie <em>Type Capacite Anti Incendie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Capacite Anti Incendie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPortTypeCapaciteAntiIncendie
	 * @see #isSetTypeCapaciteAntiIncendie()
	 * @see #unsetTypeCapaciteAntiIncendie()
	 * @see #getTypeCapaciteAntiIncendie()
	 * @generated
	 */
	void setTypeCapaciteAntiIncendie(TypeDictionaryDicoPortTypeCapaciteAntiIncendie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePort#getTypeCapaciteAntiIncendie <em>Type Capacite Anti Incendie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeCapaciteAntiIncendie()
	 * @see #getTypeCapaciteAntiIncendie()
	 * @see #setTypeCapaciteAntiIncendie(TypeDictionaryDicoPortTypeCapaciteAntiIncendie)
	 * @generated
	 */
	void unsetTypeCapaciteAntiIncendie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePort#getTypeCapaciteAntiIncendie <em>Type Capacite Anti Incendie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Capacite Anti Incendie</em>' attribute is set.
	 * @see #unsetTypeCapaciteAntiIncendie()
	 * @see #getTypeCapaciteAntiIncendie()
	 * @see #setTypeCapaciteAntiIncendie(TypeDictionaryDicoPortTypeCapaciteAntiIncendie)
	 * @generated
	 */
	boolean isSetTypeCapaciteAntiIncendie();

	/**
	 * Returns the value of the '<em><b>Facilites Transit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facilites Transit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facilites Transit</em>' attribute.
	 * @see #isSetFacilitesTransit()
	 * @see #unsetFacilitesTransit()
	 * @see #setFacilitesTransit(boolean)
	 * @see mpia.schema.SchemaPackage#getTypePort_FacilitesTransit()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='FacilitesTransit'"
	 * @generated
	 */
	boolean isFacilitesTransit();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePort#isFacilitesTransit <em>Facilites Transit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facilites Transit</em>' attribute.
	 * @see #isSetFacilitesTransit()
	 * @see #unsetFacilitesTransit()
	 * @see #isFacilitesTransit()
	 * @generated
	 */
	void setFacilitesTransit(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePort#isFacilitesTransit <em>Facilites Transit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFacilitesTransit()
	 * @see #isFacilitesTransit()
	 * @see #setFacilitesTransit(boolean)
	 * @generated
	 */
	void unsetFacilitesTransit();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePort#isFacilitesTransit <em>Facilites Transit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Facilites Transit</em>' attribute is set.
	 * @see #unsetFacilitesTransit()
	 * @see #isFacilitesTransit()
	 * @see #setFacilitesTransit(boolean)
	 * @generated
	 */
	boolean isSetFacilitesTransit();

	/**
	 * Returns the value of the '<em><b>Capacite AGerer Passagers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacite AGerer Passagers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacite AGerer Passagers</em>' attribute.
	 * @see #isSetCapaciteAGererPassagers()
	 * @see #unsetCapaciteAGererPassagers()
	 * @see #setCapaciteAGererPassagers(boolean)
	 * @see mpia.schema.SchemaPackage#getTypePort_CapaciteAGererPassagers()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='CapaciteAGererPassagers'"
	 * @generated
	 */
	boolean isCapaciteAGererPassagers();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePort#isCapaciteAGererPassagers <em>Capacite AGerer Passagers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacite AGerer Passagers</em>' attribute.
	 * @see #isSetCapaciteAGererPassagers()
	 * @see #unsetCapaciteAGererPassagers()
	 * @see #isCapaciteAGererPassagers()
	 * @generated
	 */
	void setCapaciteAGererPassagers(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePort#isCapaciteAGererPassagers <em>Capacite AGerer Passagers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCapaciteAGererPassagers()
	 * @see #isCapaciteAGererPassagers()
	 * @see #setCapaciteAGererPassagers(boolean)
	 * @generated
	 */
	void unsetCapaciteAGererPassagers();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePort#isCapaciteAGererPassagers <em>Capacite AGerer Passagers</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Capacite AGerer Passagers</em>' attribute is set.
	 * @see #unsetCapaciteAGererPassagers()
	 * @see #isCapaciteAGererPassagers()
	 * @see #setCapaciteAGererPassagers(boolean)
	 * @generated
	 */
	boolean isSetCapaciteAGererPassagers();

	/**
	 * Returns the value of the '<em><b>Installations Traitement Petroliers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Installations Traitement Petroliers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Installations Traitement Petroliers</em>' attribute.
	 * @see #isSetInstallationsTraitementPetroliers()
	 * @see #unsetInstallationsTraitementPetroliers()
	 * @see #setInstallationsTraitementPetroliers(boolean)
	 * @see mpia.schema.SchemaPackage#getTypePort_InstallationsTraitementPetroliers()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='InstallationsTraitementPetroliers'"
	 * @generated
	 */
	boolean isInstallationsTraitementPetroliers();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePort#isInstallationsTraitementPetroliers <em>Installations Traitement Petroliers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Installations Traitement Petroliers</em>' attribute.
	 * @see #isSetInstallationsTraitementPetroliers()
	 * @see #unsetInstallationsTraitementPetroliers()
	 * @see #isInstallationsTraitementPetroliers()
	 * @generated
	 */
	void setInstallationsTraitementPetroliers(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePort#isInstallationsTraitementPetroliers <em>Installations Traitement Petroliers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInstallationsTraitementPetroliers()
	 * @see #isInstallationsTraitementPetroliers()
	 * @see #setInstallationsTraitementPetroliers(boolean)
	 * @generated
	 */
	void unsetInstallationsTraitementPetroliers();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePort#isInstallationsTraitementPetroliers <em>Installations Traitement Petroliers</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Installations Traitement Petroliers</em>' attribute is set.
	 * @see #unsetInstallationsTraitementPetroliers()
	 * @see #isInstallationsTraitementPetroliers()
	 * @see #setInstallationsTraitementPetroliers(boolean)
	 * @generated
	 */
	boolean isSetInstallationsTraitementPetroliers();

	/**
	 * Returns the value of the '<em><b>Securisation Biologique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Securisation Biologique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securisation Biologique</em>' attribute.
	 * @see #isSetSecurisationBiologique()
	 * @see #unsetSecurisationBiologique()
	 * @see #setSecurisationBiologique(boolean)
	 * @see mpia.schema.SchemaPackage#getTypePort_SecurisationBiologique()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='SecurisationBiologique'"
	 * @generated
	 */
	boolean isSecurisationBiologique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePort#isSecurisationBiologique <em>Securisation Biologique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Securisation Biologique</em>' attribute.
	 * @see #isSetSecurisationBiologique()
	 * @see #unsetSecurisationBiologique()
	 * @see #isSecurisationBiologique()
	 * @generated
	 */
	void setSecurisationBiologique(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePort#isSecurisationBiologique <em>Securisation Biologique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSecurisationBiologique()
	 * @see #isSecurisationBiologique()
	 * @see #setSecurisationBiologique(boolean)
	 * @generated
	 */
	void unsetSecurisationBiologique();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePort#isSecurisationBiologique <em>Securisation Biologique</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Securisation Biologique</em>' attribute is set.
	 * @see #unsetSecurisationBiologique()
	 * @see #isSecurisationBiologique()
	 * @see #setSecurisationBiologique(boolean)
	 * @generated
	 */
	boolean isSetSecurisationBiologique();

	/**
	 * Returns the value of the '<em><b>Capacite Reception Lest Souille</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacite Reception Lest Souille</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacite Reception Lest Souille</em>' attribute.
	 * @see #isSetCapaciteReceptionLestSouille()
	 * @see #unsetCapaciteReceptionLestSouille()
	 * @see #setCapaciteReceptionLestSouille(boolean)
	 * @see mpia.schema.SchemaPackage#getTypePort_CapaciteReceptionLestSouille()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='CapaciteReceptionLestSouille'"
	 * @generated
	 */
	boolean isCapaciteReceptionLestSouille();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePort#isCapaciteReceptionLestSouille <em>Capacite Reception Lest Souille</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacite Reception Lest Souille</em>' attribute.
	 * @see #isSetCapaciteReceptionLestSouille()
	 * @see #unsetCapaciteReceptionLestSouille()
	 * @see #isCapaciteReceptionLestSouille()
	 * @generated
	 */
	void setCapaciteReceptionLestSouille(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePort#isCapaciteReceptionLestSouille <em>Capacite Reception Lest Souille</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCapaciteReceptionLestSouille()
	 * @see #isCapaciteReceptionLestSouille()
	 * @see #setCapaciteReceptionLestSouille(boolean)
	 * @generated
	 */
	void unsetCapaciteReceptionLestSouille();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePort#isCapaciteReceptionLestSouille <em>Capacite Reception Lest Souille</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Capacite Reception Lest Souille</em>' attribute is set.
	 * @see #unsetCapaciteReceptionLestSouille()
	 * @see #isCapaciteReceptionLestSouille()
	 * @see #setCapaciteReceptionLestSouille(boolean)
	 * @generated
	 */
	boolean isSetCapaciteReceptionLestSouille();

	/**
	 * Returns the value of the '<em><b>Installations Demagnetisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Installations Demagnetisation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Installations Demagnetisation</em>' attribute.
	 * @see #isSetInstallationsDemagnetisation()
	 * @see #unsetInstallationsDemagnetisation()
	 * @see #setInstallationsDemagnetisation(boolean)
	 * @see mpia.schema.SchemaPackage#getTypePort_InstallationsDemagnetisation()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='InstallationsDemagnetisation'"
	 * @generated
	 */
	boolean isInstallationsDemagnetisation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePort#isInstallationsDemagnetisation <em>Installations Demagnetisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Installations Demagnetisation</em>' attribute.
	 * @see #isSetInstallationsDemagnetisation()
	 * @see #unsetInstallationsDemagnetisation()
	 * @see #isInstallationsDemagnetisation()
	 * @generated
	 */
	void setInstallationsDemagnetisation(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePort#isInstallationsDemagnetisation <em>Installations Demagnetisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInstallationsDemagnetisation()
	 * @see #isInstallationsDemagnetisation()
	 * @see #setInstallationsDemagnetisation(boolean)
	 * @generated
	 */
	void unsetInstallationsDemagnetisation();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePort#isInstallationsDemagnetisation <em>Installations Demagnetisation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Installations Demagnetisation</em>' attribute is set.
	 * @see #unsetInstallationsDemagnetisation()
	 * @see #isInstallationsDemagnetisation()
	 * @see #setInstallationsDemagnetisation(boolean)
	 * @generated
	 */
	boolean isSetInstallationsDemagnetisation();

	/**
	 * Returns the value of the '<em><b>Possibilite Usage Accon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Possibilite Usage Accon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Possibilite Usage Accon</em>' attribute.
	 * @see #isSetPossibiliteUsageAccon()
	 * @see #unsetPossibiliteUsageAccon()
	 * @see #setPossibiliteUsageAccon(boolean)
	 * @see mpia.schema.SchemaPackage#getTypePort_PossibiliteUsageAccon()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='PossibiliteUsageAccon'"
	 * @generated
	 */
	boolean isPossibiliteUsageAccon();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePort#isPossibiliteUsageAccon <em>Possibilite Usage Accon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Possibilite Usage Accon</em>' attribute.
	 * @see #isSetPossibiliteUsageAccon()
	 * @see #unsetPossibiliteUsageAccon()
	 * @see #isPossibiliteUsageAccon()
	 * @generated
	 */
	void setPossibiliteUsageAccon(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePort#isPossibiliteUsageAccon <em>Possibilite Usage Accon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPossibiliteUsageAccon()
	 * @see #isPossibiliteUsageAccon()
	 * @see #setPossibiliteUsageAccon(boolean)
	 * @generated
	 */
	void unsetPossibiliteUsageAccon();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePort#isPossibiliteUsageAccon <em>Possibilite Usage Accon</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Possibilite Usage Accon</em>' attribute is set.
	 * @see #unsetPossibiliteUsageAccon()
	 * @see #isPossibiliteUsageAccon()
	 * @see #setPossibiliteUsageAccon(boolean)
	 * @generated
	 */
	boolean isSetPossibiliteUsageAccon();

	/**
	 * Returns the value of the '<em><b>Transport Par Acconage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport Par Acconage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport Par Acconage</em>' attribute.
	 * @see #isSetTransportParAcconage()
	 * @see #unsetTransportParAcconage()
	 * @see #setTransportParAcconage(boolean)
	 * @see mpia.schema.SchemaPackage#getTypePort_TransportParAcconage()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='TransportParAcconage'"
	 * @generated
	 */
	boolean isTransportParAcconage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePort#isTransportParAcconage <em>Transport Par Acconage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport Par Acconage</em>' attribute.
	 * @see #isSetTransportParAcconage()
	 * @see #unsetTransportParAcconage()
	 * @see #isTransportParAcconage()
	 * @generated
	 */
	void setTransportParAcconage(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePort#isTransportParAcconage <em>Transport Par Acconage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransportParAcconage()
	 * @see #isTransportParAcconage()
	 * @see #setTransportParAcconage(boolean)
	 * @generated
	 */
	void unsetTransportParAcconage();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePort#isTransportParAcconage <em>Transport Par Acconage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transport Par Acconage</em>' attribute is set.
	 * @see #unsetTransportParAcconage()
	 * @see #isTransportParAcconage()
	 * @see #setTransportParAcconage(boolean)
	 * @generated
	 */
	boolean isSetTransportParAcconage();

	/**
	 * Returns the value of the '<em><b>Zone Pour Tourner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zone Pour Tourner</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone Pour Tourner</em>' attribute.
	 * @see #isSetZonePourTourner()
	 * @see #unsetZonePourTourner()
	 * @see #setZonePourTourner(boolean)
	 * @see mpia.schema.SchemaPackage#getTypePort_ZonePourTourner()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='ZonePourTourner'"
	 * @generated
	 */
	boolean isZonePourTourner();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePort#isZonePourTourner <em>Zone Pour Tourner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zone Pour Tourner</em>' attribute.
	 * @see #isSetZonePourTourner()
	 * @see #unsetZonePourTourner()
	 * @see #isZonePourTourner()
	 * @generated
	 */
	void setZonePourTourner(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePort#isZonePourTourner <em>Zone Pour Tourner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetZonePourTourner()
	 * @see #isZonePourTourner()
	 * @see #setZonePourTourner(boolean)
	 * @generated
	 */
	void unsetZonePourTourner();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePort#isZonePourTourner <em>Zone Pour Tourner</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Zone Pour Tourner</em>' attribute is set.
	 * @see #unsetZonePourTourner()
	 * @see #isZonePourTourner()
	 * @see #setZonePourTourner(boolean)
	 * @generated
	 */
	boolean isSetZonePourTourner();

	/**
	 * Returns the value of the '<em><b>Obligation Message Heure Arrivee Prevue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Obligation Message Heure Arrivee Prevue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obligation Message Heure Arrivee Prevue</em>' attribute.
	 * @see #isSetObligationMessageHeureArriveePrevue()
	 * @see #unsetObligationMessageHeureArriveePrevue()
	 * @see #setObligationMessageHeureArriveePrevue(boolean)
	 * @see mpia.schema.SchemaPackage#getTypePort_ObligationMessageHeureArriveePrevue()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='ObligationMessageHeureArriveePrevue'"
	 * @generated
	 */
	boolean isObligationMessageHeureArriveePrevue();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePort#isObligationMessageHeureArriveePrevue <em>Obligation Message Heure Arrivee Prevue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obligation Message Heure Arrivee Prevue</em>' attribute.
	 * @see #isSetObligationMessageHeureArriveePrevue()
	 * @see #unsetObligationMessageHeureArriveePrevue()
	 * @see #isObligationMessageHeureArriveePrevue()
	 * @generated
	 */
	void setObligationMessageHeureArriveePrevue(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePort#isObligationMessageHeureArriveePrevue <em>Obligation Message Heure Arrivee Prevue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetObligationMessageHeureArriveePrevue()
	 * @see #isObligationMessageHeureArriveePrevue()
	 * @see #setObligationMessageHeureArriveePrevue(boolean)
	 * @generated
	 */
	void unsetObligationMessageHeureArriveePrevue();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePort#isObligationMessageHeureArriveePrevue <em>Obligation Message Heure Arrivee Prevue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Obligation Message Heure Arrivee Prevue</em>' attribute is set.
	 * @see #unsetObligationMessageHeureArriveePrevue()
	 * @see #isObligationMessageHeureArriveePrevue()
	 * @see #setObligationMessageHeureArriveePrevue(boolean)
	 * @generated
	 */
	boolean isSetObligationMessageHeureArriveePrevue();

	/**
	 * Returns the value of the '<em><b>Douane Ou Services Immigration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Douane Ou Services Immigration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Douane Ou Services Immigration</em>' attribute.
	 * @see #isSetDouaneOuServicesImmigration()
	 * @see #unsetDouaneOuServicesImmigration()
	 * @see #setDouaneOuServicesImmigration(boolean)
	 * @see mpia.schema.SchemaPackage#getTypePort_DouaneOuServicesImmigration()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='DouaneOuServicesImmigration'"
	 * @generated
	 */
	boolean isDouaneOuServicesImmigration();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePort#isDouaneOuServicesImmigration <em>Douane Ou Services Immigration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Douane Ou Services Immigration</em>' attribute.
	 * @see #isSetDouaneOuServicesImmigration()
	 * @see #unsetDouaneOuServicesImmigration()
	 * @see #isDouaneOuServicesImmigration()
	 * @generated
	 */
	void setDouaneOuServicesImmigration(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePort#isDouaneOuServicesImmigration <em>Douane Ou Services Immigration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDouaneOuServicesImmigration()
	 * @see #isDouaneOuServicesImmigration()
	 * @see #setDouaneOuServicesImmigration(boolean)
	 * @generated
	 */
	void unsetDouaneOuServicesImmigration();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePort#isDouaneOuServicesImmigration <em>Douane Ou Services Immigration</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Douane Ou Services Immigration</em>' attribute is set.
	 * @see #unsetDouaneOuServicesImmigration()
	 * @see #isDouaneOuServicesImmigration()
	 * @see #setDouaneOuServicesImmigration(boolean)
	 * @generated
	 */
	boolean isSetDouaneOuServicesImmigration();

	/**
	 * Returns the value of the '<em><b>Entree Restreinte Pour Cause Forte Houle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entree Restreinte Pour Cause Forte Houle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entree Restreinte Pour Cause Forte Houle</em>' attribute.
	 * @see #isSetEntreeRestreintePourCauseForteHoule()
	 * @see #unsetEntreeRestreintePourCauseForteHoule()
	 * @see #setEntreeRestreintePourCauseForteHoule(boolean)
	 * @see mpia.schema.SchemaPackage#getTypePort_EntreeRestreintePourCauseForteHoule()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='EntreeRestreintePourCauseForteHoule'"
	 * @generated
	 */
	boolean isEntreeRestreintePourCauseForteHoule();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePort#isEntreeRestreintePourCauseForteHoule <em>Entree Restreinte Pour Cause Forte Houle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entree Restreinte Pour Cause Forte Houle</em>' attribute.
	 * @see #isSetEntreeRestreintePourCauseForteHoule()
	 * @see #unsetEntreeRestreintePourCauseForteHoule()
	 * @see #isEntreeRestreintePourCauseForteHoule()
	 * @generated
	 */
	void setEntreeRestreintePourCauseForteHoule(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePort#isEntreeRestreintePourCauseForteHoule <em>Entree Restreinte Pour Cause Forte Houle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEntreeRestreintePourCauseForteHoule()
	 * @see #isEntreeRestreintePourCauseForteHoule()
	 * @see #setEntreeRestreintePourCauseForteHoule(boolean)
	 * @generated
	 */
	void unsetEntreeRestreintePourCauseForteHoule();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePort#isEntreeRestreintePourCauseForteHoule <em>Entree Restreinte Pour Cause Forte Houle</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Entree Restreinte Pour Cause Forte Houle</em>' attribute is set.
	 * @see #unsetEntreeRestreintePourCauseForteHoule()
	 * @see #isEntreeRestreintePourCauseForteHoule()
	 * @see #setEntreeRestreintePourCauseForteHoule(boolean)
	 * @generated
	 */
	boolean isSetEntreeRestreintePourCauseForteHoule();

	/**
	 * Returns the value of the '<em><b>Entree Restreinte Pour Cause Glace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entree Restreinte Pour Cause Glace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entree Restreinte Pour Cause Glace</em>' attribute.
	 * @see #isSetEntreeRestreintePourCauseGlace()
	 * @see #unsetEntreeRestreintePourCauseGlace()
	 * @see #setEntreeRestreintePourCauseGlace(boolean)
	 * @see mpia.schema.SchemaPackage#getTypePort_EntreeRestreintePourCauseGlace()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='EntreeRestreintePourCauseGlace'"
	 * @generated
	 */
	boolean isEntreeRestreintePourCauseGlace();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePort#isEntreeRestreintePourCauseGlace <em>Entree Restreinte Pour Cause Glace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entree Restreinte Pour Cause Glace</em>' attribute.
	 * @see #isSetEntreeRestreintePourCauseGlace()
	 * @see #unsetEntreeRestreintePourCauseGlace()
	 * @see #isEntreeRestreintePourCauseGlace()
	 * @generated
	 */
	void setEntreeRestreintePourCauseGlace(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePort#isEntreeRestreintePourCauseGlace <em>Entree Restreinte Pour Cause Glace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEntreeRestreintePourCauseGlace()
	 * @see #isEntreeRestreintePourCauseGlace()
	 * @see #setEntreeRestreintePourCauseGlace(boolean)
	 * @generated
	 */
	void unsetEntreeRestreintePourCauseGlace();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePort#isEntreeRestreintePourCauseGlace <em>Entree Restreinte Pour Cause Glace</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Entree Restreinte Pour Cause Glace</em>' attribute is set.
	 * @see #unsetEntreeRestreintePourCauseGlace()
	 * @see #isEntreeRestreintePourCauseGlace()
	 * @see #setEntreeRestreintePourCauseGlace(boolean)
	 * @generated
	 */
	boolean isSetEntreeRestreintePourCauseGlace();

	/**
	 * Returns the value of the '<em><b>Mesures Restriction Entree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mesures Restriction Entree</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mesures Restriction Entree</em>' attribute.
	 * @see #setMesuresRestrictionEntree(String)
	 * @see mpia.schema.SchemaPackage#getTypePort_MesuresRestrictionEntree()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='MesuresRestrictionEntree'"
	 * @generated
	 */
	String getMesuresRestrictionEntree();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePort#getMesuresRestrictionEntree <em>Mesures Restriction Entree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mesures Restriction Entree</em>' attribute.
	 * @see #getMesuresRestrictionEntree()
	 * @generated
	 */
	void setMesuresRestrictionEntree(String value);

	/**
	 * Returns the value of the '<em><b>Details Saisonniers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Details Saisonniers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Details Saisonniers</em>' attribute.
	 * @see #setDetailsSaisonniers(String)
	 * @see mpia.schema.SchemaPackage#getTypePort_DetailsSaisonniers()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='DetailsSaisonniers'"
	 * @generated
	 */
	String getDetailsSaisonniers();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePort#getDetailsSaisonniers <em>Details Saisonniers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Details Saisonniers</em>' attribute.
	 * @see #getDetailsSaisonniers()
	 * @generated
	 */
	void setDetailsSaisonniers(String value);

} // TypePort
