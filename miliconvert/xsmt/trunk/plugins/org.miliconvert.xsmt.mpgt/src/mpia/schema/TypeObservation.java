/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;
import mpia.meta.TypeDataTypeAngle;
import mpia.meta.TypeDataTypeLongueur;
import mpia.meta.TypeDataTypeVitesseLineaire;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeObservation#getFormationAppartenance <em>Formation Appartenance</em>}</li>
 *   <li>{@link mpia.schema.TypeObservation#isNegative <em>Negative</em>}</li>
 *   <li>{@link mpia.schema.TypeObservation#getDistanceAvecObservateur <em>Distance Avec Observateur</em>}</li>
 *   <li>{@link mpia.schema.TypeObservation#getMouvement <em>Mouvement</em>}</li>
 *   <li>{@link mpia.schema.TypeObservation#getPrecisionLocalisation <em>Precision Localisation</em>}</li>
 *   <li>{@link mpia.schema.TypeObservation#getCap <em>Cap</em>}</li>
 *   <li>{@link mpia.schema.TypeObservation#getTypeVecteur <em>Type Vecteur</em>}</li>
 *   <li>{@link mpia.schema.TypeObservation#getVitesse <em>Vitesse</em>}</li>
 *   <li>{@link mpia.schema.TypeObservation#getAPourComportementComportement <em>APour Comportement Comportement</em>}</li>
 *   <li>{@link mpia.schema.TypeObservation#getADonneLieuConstatDestruction <em>ADonne Lieu Constat Destruction</em>}</li>
 *   <li>{@link mpia.schema.TypeObservation#getADonneLieuConstatPopulation <em>ADonne Lieu Constat Population</em>}</li>
 *   <li>{@link mpia.schema.TypeObservation#getADonneLieuConstatTerrain <em>ADonne Lieu Constat Terrain</em>}</li>
 *   <li>{@link mpia.schema.TypeObservation#getADonneLieuConstatForce <em>ADonne Lieu Constat Force</em>}</li>
 *   <li>{@link mpia.schema.TypeObservation#getAPourSourceRapport <em>APour Source Rapport</em>}</li>
 *   <li>{@link mpia.schema.TypeObservation#getFaitReferenceAuFaitFaitRenseignement <em>Fait Reference Au Fait Fait Renseignement</em>}</li>
 *   <li>{@link mpia.schema.TypeObservation#getACommeInstanceObjetObserveeInstanceObjet <em>AComme Instance Objet Observee Instance Objet</em>}</li>
 *   <li>{@link mpia.schema.TypeObservation#getACommeLocalisationElementObserveLocalisation <em>AComme Localisation Element Observe Localisation</em>}</li>
 *   <li>{@link mpia.schema.TypeObservation#getACommeQuantiteTypeObserveQuantiteTypeObserve <em>AComme Quantite Type Observe Quantite Type Observe</em>}</li>
 *   <li>{@link mpia.schema.TypeObservation#getAPourActiviteActivitePosture <em>APour Activite Activite Posture</em>}</li>
 *   <li>{@link mpia.schema.TypeObservation#getACommeOrigineRenseignementUnite <em>AComme Origine Renseignement Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeObservation#getACommeTypeSourceTypeUnite <em>AComme Type Source Type Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeObservation#getAPourTypeCapteurMisEnOeuvreTypeCapteur <em>APour Type Capteur Mis En Oeuvre Type Capteur</em>}</li>
 *   <li>{@link mpia.schema.TypeObservation#getEstSujetAssociationObservationObservation <em>Est Sujet Association Observation Observation</em>}</li>
 *   <li>{@link mpia.schema.TypeObservation#getAPourZoneObserveeAutreElementControle <em>APour Zone Observee Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeObservation#getEstObjetAssociationObservationObservation <em>Est Objet Association Observation Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeObservation()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_Observation' kind='elementOnly'"
 * @generated
 */
public interface TypeObservation extends TypeRacineOperationnelle {
	/**
	 * Returns the value of the '<em><b>Formation Appartenance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formation Appartenance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formation Appartenance</em>' attribute.
	 * @see #setFormationAppartenance(String)
	 * @see mpia.schema.SchemaPackage#getTypeObservation_FormationAppartenance()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='FormationAppartenance'"
	 * @generated
	 */
	String getFormationAppartenance();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObservation#getFormationAppartenance <em>Formation Appartenance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formation Appartenance</em>' attribute.
	 * @see #getFormationAppartenance()
	 * @generated
	 */
	void setFormationAppartenance(String value);

	/**
	 * Returns the value of the '<em><b>Negative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negative</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negative</em>' attribute.
	 * @see #isSetNegative()
	 * @see #unsetNegative()
	 * @see #setNegative(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeObservation_Negative()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='Negative'"
	 * @generated
	 */
	boolean isNegative();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObservation#isNegative <em>Negative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negative</em>' attribute.
	 * @see #isSetNegative()
	 * @see #unsetNegative()
	 * @see #isNegative()
	 * @generated
	 */
	void setNegative(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeObservation#isNegative <em>Negative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNegative()
	 * @see #isNegative()
	 * @see #setNegative(boolean)
	 * @generated
	 */
	void unsetNegative();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeObservation#isNegative <em>Negative</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Negative</em>' attribute is set.
	 * @see #unsetNegative()
	 * @see #isNegative()
	 * @see #setNegative(boolean)
	 * @generated
	 */
	boolean isSetNegative();

	/**
	 * Returns the value of the '<em><b>Distance Avec Observateur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance Avec Observateur</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance Avec Observateur</em>' containment reference.
	 * @see #setDistanceAvecObservateur(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeObservation_DistanceAvecObservateur()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DistanceAvecObservateur'"
	 * @generated
	 */
	TypeDataTypeLongueur getDistanceAvecObservateur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObservation#getDistanceAvecObservateur <em>Distance Avec Observateur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance Avec Observateur</em>' containment reference.
	 * @see #getDistanceAvecObservateur()
	 * @generated
	 */
	void setDistanceAvecObservateur(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Mouvement</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoObservationMouvement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mouvement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mouvement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoObservationMouvement
	 * @see #isSetMouvement()
	 * @see #unsetMouvement()
	 * @see #setMouvement(TypeDictionaryDicoObservationMouvement)
	 * @see mpia.schema.SchemaPackage#getTypeObservation_Mouvement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Mouvement'"
	 * @generated
	 */
	TypeDictionaryDicoObservationMouvement getMouvement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObservation#getMouvement <em>Mouvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mouvement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoObservationMouvement
	 * @see #isSetMouvement()
	 * @see #unsetMouvement()
	 * @see #getMouvement()
	 * @generated
	 */
	void setMouvement(TypeDictionaryDicoObservationMouvement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeObservation#getMouvement <em>Mouvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMouvement()
	 * @see #getMouvement()
	 * @see #setMouvement(TypeDictionaryDicoObservationMouvement)
	 * @generated
	 */
	void unsetMouvement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeObservation#getMouvement <em>Mouvement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mouvement</em>' attribute is set.
	 * @see #unsetMouvement()
	 * @see #getMouvement()
	 * @see #setMouvement(TypeDictionaryDicoObservationMouvement)
	 * @generated
	 */
	boolean isSetMouvement();

	/**
	 * Returns the value of the '<em><b>Precision Localisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision Localisation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision Localisation</em>' attribute.
	 * @see #isSetPrecisionLocalisation()
	 * @see #unsetPrecisionLocalisation()
	 * @see #setPrecisionLocalisation(long)
	 * @see mpia.schema.SchemaPackage#getTypeObservation_PrecisionLocalisation()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='PrecisionLocalisation'"
	 * @generated
	 */
	long getPrecisionLocalisation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObservation#getPrecisionLocalisation <em>Precision Localisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision Localisation</em>' attribute.
	 * @see #isSetPrecisionLocalisation()
	 * @see #unsetPrecisionLocalisation()
	 * @see #getPrecisionLocalisation()
	 * @generated
	 */
	void setPrecisionLocalisation(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeObservation#getPrecisionLocalisation <em>Precision Localisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrecisionLocalisation()
	 * @see #getPrecisionLocalisation()
	 * @see #setPrecisionLocalisation(long)
	 * @generated
	 */
	void unsetPrecisionLocalisation();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeObservation#getPrecisionLocalisation <em>Precision Localisation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Precision Localisation</em>' attribute is set.
	 * @see #unsetPrecisionLocalisation()
	 * @see #getPrecisionLocalisation()
	 * @see #setPrecisionLocalisation(long)
	 * @generated
	 */
	boolean isSetPrecisionLocalisation();

	/**
	 * Returns the value of the '<em><b>Cap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cap</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cap</em>' containment reference.
	 * @see #setCap(TypeDataTypeAngle)
	 * @see mpia.schema.SchemaPackage#getTypeObservation_Cap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Cap'"
	 * @generated
	 */
	TypeDataTypeAngle getCap();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObservation#getCap <em>Cap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cap</em>' containment reference.
	 * @see #getCap()
	 * @generated
	 */
	void setCap(TypeDataTypeAngle value);

	/**
	 * Returns the value of the '<em><b>Type Vecteur</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeVecteur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Vecteur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Vecteur</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeVecteur
	 * @see #isSetTypeVecteur()
	 * @see #unsetTypeVecteur()
	 * @see #setTypeVecteur(TypeDictionaryDicoTypeVecteur)
	 * @see mpia.schema.SchemaPackage#getTypeObservation_TypeVecteur()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeVecteur'"
	 * @generated
	 */
	TypeDictionaryDicoTypeVecteur getTypeVecteur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObservation#getTypeVecteur <em>Type Vecteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Vecteur</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeVecteur
	 * @see #isSetTypeVecteur()
	 * @see #unsetTypeVecteur()
	 * @see #getTypeVecteur()
	 * @generated
	 */
	void setTypeVecteur(TypeDictionaryDicoTypeVecteur value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeObservation#getTypeVecteur <em>Type Vecteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeVecteur()
	 * @see #getTypeVecteur()
	 * @see #setTypeVecteur(TypeDictionaryDicoTypeVecteur)
	 * @generated
	 */
	void unsetTypeVecteur();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeObservation#getTypeVecteur <em>Type Vecteur</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Vecteur</em>' attribute is set.
	 * @see #unsetTypeVecteur()
	 * @see #getTypeVecteur()
	 * @see #setTypeVecteur(TypeDictionaryDicoTypeVecteur)
	 * @generated
	 */
	boolean isSetTypeVecteur();

	/**
	 * Returns the value of the '<em><b>Vitesse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vitesse</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vitesse</em>' containment reference.
	 * @see #setVitesse(TypeDataTypeVitesseLineaire)
	 * @see mpia.schema.SchemaPackage#getTypeObservation_Vitesse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Vitesse'"
	 * @generated
	 */
	TypeDataTypeVitesseLineaire getVitesse();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObservation#getVitesse <em>Vitesse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vitesse</em>' containment reference.
	 * @see #getVitesse()
	 * @generated
	 */
	void setVitesse(TypeDataTypeVitesseLineaire value);

	/**
	 * Returns the value of the '<em><b>APour Comportement Comportement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeComportement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Comportement Comportement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Comportement Comportement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeObservation_APourComportementComportement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Comportement'"
	 *        extendedMetaData="kind='element' name='APourComportement_Comportement'"
	 * @generated
	 */
	EList<TypeComportement> getAPourComportementComportement();

	/**
	 * Returns the value of the '<em><b>ADonne Lieu Constat Destruction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ADonne Lieu Constat Destruction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ADonne Lieu Constat Destruction</em>' containment reference.
	 * @see #setADonneLieuConstatDestruction(TypeConstatDestruction)
	 * @see mpia.schema.SchemaPackage#getTypeObservation_ADonneLieuConstatDestruction()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ConstatDestruction'"
	 *        extendedMetaData="kind='element' name='ADonneLieu_ConstatDestruction'"
	 * @generated
	 */
	TypeConstatDestruction getADonneLieuConstatDestruction();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObservation#getADonneLieuConstatDestruction <em>ADonne Lieu Constat Destruction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ADonne Lieu Constat Destruction</em>' containment reference.
	 * @see #getADonneLieuConstatDestruction()
	 * @generated
	 */
	void setADonneLieuConstatDestruction(TypeConstatDestruction value);

	/**
	 * Returns the value of the '<em><b>ADonne Lieu Constat Population</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ADonne Lieu Constat Population</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ADonne Lieu Constat Population</em>' containment reference.
	 * @see #setADonneLieuConstatPopulation(TypeConstatPopulation)
	 * @see mpia.schema.SchemaPackage#getTypeObservation_ADonneLieuConstatPopulation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ConstatPopulation'"
	 *        extendedMetaData="kind='element' name='ADonneLieu_ConstatPopulation'"
	 * @generated
	 */
	TypeConstatPopulation getADonneLieuConstatPopulation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObservation#getADonneLieuConstatPopulation <em>ADonne Lieu Constat Population</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ADonne Lieu Constat Population</em>' containment reference.
	 * @see #getADonneLieuConstatPopulation()
	 * @generated
	 */
	void setADonneLieuConstatPopulation(TypeConstatPopulation value);

	/**
	 * Returns the value of the '<em><b>ADonne Lieu Constat Terrain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ADonne Lieu Constat Terrain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ADonne Lieu Constat Terrain</em>' containment reference.
	 * @see #setADonneLieuConstatTerrain(TypeConstatTerrain)
	 * @see mpia.schema.SchemaPackage#getTypeObservation_ADonneLieuConstatTerrain()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ConstatTerrain'"
	 *        extendedMetaData="kind='element' name='ADonneLieu_ConstatTerrain'"
	 * @generated
	 */
	TypeConstatTerrain getADonneLieuConstatTerrain();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObservation#getADonneLieuConstatTerrain <em>ADonne Lieu Constat Terrain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ADonne Lieu Constat Terrain</em>' containment reference.
	 * @see #getADonneLieuConstatTerrain()
	 * @generated
	 */
	void setADonneLieuConstatTerrain(TypeConstatTerrain value);

	/**
	 * Returns the value of the '<em><b>ADonne Lieu Constat Force</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ADonne Lieu Constat Force</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ADonne Lieu Constat Force</em>' containment reference.
	 * @see #setADonneLieuConstatForce(TypeConstatForce)
	 * @see mpia.schema.SchemaPackage#getTypeObservation_ADonneLieuConstatForce()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ConstatForce'"
	 *        extendedMetaData="kind='element' name='ADonneLieu_ConstatForce'"
	 * @generated
	 */
	TypeConstatForce getADonneLieuConstatForce();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObservation#getADonneLieuConstatForce <em>ADonne Lieu Constat Force</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ADonne Lieu Constat Force</em>' containment reference.
	 * @see #getADonneLieuConstatForce()
	 * @generated
	 */
	void setADonneLieuConstatForce(TypeConstatForce value);

	/**
	 * Returns the value of the '<em><b>APour Source Rapport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Source Rapport</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Source Rapport</em>' containment reference.
	 * @see #setAPourSourceRapport(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeObservation_APourSourceRapport()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Rapport'"
	 *        extendedMetaData="kind='element' name='APourSource_Rapport'"
	 * @generated
	 */
	TypeAssociation getAPourSourceRapport();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObservation#getAPourSourceRapport <em>APour Source Rapport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Source Rapport</em>' containment reference.
	 * @see #getAPourSourceRapport()
	 * @generated
	 */
	void setAPourSourceRapport(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Fait Reference Au Fait Fait Renseignement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fait Reference Au Fait Fait Renseignement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fait Reference Au Fait Fait Renseignement</em>' containment reference.
	 * @see #setFaitReferenceAuFaitFaitRenseignement(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeObservation_FaitReferenceAuFaitFaitRenseignement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='ACommeObservation_Observation' target_entity='type_FaitRenseignement'"
	 *        extendedMetaData="kind='element' name='FaitReferenceAuFait_FaitRenseignement'"
	 * @generated
	 */
	TypeAssociation getFaitReferenceAuFaitFaitRenseignement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObservation#getFaitReferenceAuFaitFaitRenseignement <em>Fait Reference Au Fait Fait Renseignement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fait Reference Au Fait Fait Renseignement</em>' containment reference.
	 * @see #getFaitReferenceAuFaitFaitRenseignement()
	 * @generated
	 */
	void setFaitReferenceAuFaitFaitRenseignement(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>AComme Instance Objet Observee Instance Objet</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Instance Objet Observee Instance Objet</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Instance Objet Observee Instance Objet</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeObservation_ACommeInstanceObjetObserveeInstanceObjet()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_InstanceObjet'"
	 *        extendedMetaData="kind='element' name='ACommeInstanceObjetObservee_InstanceObjet'"
	 * @generated
	 */
	EList<TypeAssociation> getACommeInstanceObjetObserveeInstanceObjet();

	/**
	 * Returns the value of the '<em><b>AComme Localisation Element Observe Localisation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Localisation Element Observe Localisation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Localisation Element Observe Localisation</em>' containment reference.
	 * @see #setACommeLocalisationElementObserveLocalisation(TypeLocalisation)
	 * @see mpia.schema.SchemaPackage#getTypeObservation_ACommeLocalisationElementObserveLocalisation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Localisation'"
	 *        extendedMetaData="kind='element' name='ACommeLocalisationElementObserve_Localisation'"
	 * @generated
	 */
	TypeLocalisation getACommeLocalisationElementObserveLocalisation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObservation#getACommeLocalisationElementObserveLocalisation <em>AComme Localisation Element Observe Localisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Localisation Element Observe Localisation</em>' containment reference.
	 * @see #getACommeLocalisationElementObserveLocalisation()
	 * @generated
	 */
	void setACommeLocalisationElementObserveLocalisation(TypeLocalisation value);

	/**
	 * Returns the value of the '<em><b>AComme Quantite Type Observe Quantite Type Observe</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeQuantiteTypeObserve}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Quantite Type Observe Quantite Type Observe</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Quantite Type Observe Quantite Type Observe</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeObservation_ACommeQuantiteTypeObserveQuantiteTypeObserve()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_QuantiteTypeObserve'"
	 *        extendedMetaData="kind='element' name='ACommeQuantiteTypeObserve_QuantiteTypeObserve'"
	 * @generated
	 */
	EList<TypeQuantiteTypeObserve> getACommeQuantiteTypeObserveQuantiteTypeObserve();

	/**
	 * Returns the value of the '<em><b>APour Activite Activite Posture</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Activite Activite Posture</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Activite Activite Posture</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeObservation_APourActiviteActivitePosture()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='Concerne_Observation' target_entity='type_ActivitePosture'"
	 *        extendedMetaData="kind='element' name='APourActivite_ActivitePosture'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourActiviteActivitePosture();

	/**
	 * Returns the value of the '<em><b>AComme Origine Renseignement Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Origine Renseignement Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Origine Renseignement Unite</em>' containment reference.
	 * @see #setACommeOrigineRenseignementUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeObservation_ACommeOrigineRenseignementUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstAOrigineObservation_Observation' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='ACommeOrigineRenseignement_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getACommeOrigineRenseignementUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObservation#getACommeOrigineRenseignementUnite <em>AComme Origine Renseignement Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Origine Renseignement Unite</em>' containment reference.
	 * @see #getACommeOrigineRenseignementUnite()
	 * @generated
	 */
	void setACommeOrigineRenseignementUnite(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>AComme Type Source Type Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Type Source Type Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Type Source Type Unite</em>' containment reference.
	 * @see #setACommeTypeSourceTypeUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeObservation_ACommeTypeSourceTypeUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeUnite'"
	 *        extendedMetaData="kind='element' name='ACommeTypeSource_TypeUnite'"
	 * @generated
	 */
	TypeAssociationEXT getACommeTypeSourceTypeUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObservation#getACommeTypeSourceTypeUnite <em>AComme Type Source Type Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Type Source Type Unite</em>' containment reference.
	 * @see #getACommeTypeSourceTypeUnite()
	 * @generated
	 */
	void setACommeTypeSourceTypeUnite(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>APour Type Capteur Mis En Oeuvre Type Capteur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Type Capteur Mis En Oeuvre Type Capteur</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Type Capteur Mis En Oeuvre Type Capteur</em>' containment reference.
	 * @see #setAPourTypeCapteurMisEnOeuvreTypeCapteur(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeObservation_APourTypeCapteurMisEnOeuvreTypeCapteur()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeCapteur'"
	 *        extendedMetaData="kind='element' name='APourTypeCapteurMisEnOeuvre_TypeCapteur'"
	 * @generated
	 */
	TypeAssociationEXT getAPourTypeCapteurMisEnOeuvreTypeCapteur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObservation#getAPourTypeCapteurMisEnOeuvreTypeCapteur <em>APour Type Capteur Mis En Oeuvre Type Capteur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Type Capteur Mis En Oeuvre Type Capteur</em>' containment reference.
	 * @see #getAPourTypeCapteurMisEnOeuvreTypeCapteur()
	 * @generated
	 */
	void setAPourTypeCapteurMisEnOeuvreTypeCapteur(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Observation Observation</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Observation Observation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Observation Observation</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeObservation_EstSujetAssociationObservationObservation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeSujet_Observation' target_entity='type_AssociationObservationObservation'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationObservationObservation'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationObservationObservation();

	/**
	 * Returns the value of the '<em><b>APour Zone Observee Autre Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Zone Observee Autre Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Zone Observee Autre Element Controle</em>' containment reference.
	 * @see #setAPourZoneObserveeAutreElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeObservation_APourZoneObserveeAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourZoneObservee_AutreElementControle'"
	 * @generated
	 */
	TypeAssociation getAPourZoneObserveeAutreElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObservation#getAPourZoneObserveeAutreElementControle <em>APour Zone Observee Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Zone Observee Autre Element Controle</em>' containment reference.
	 * @see #getAPourZoneObserveeAutreElementControle()
	 * @generated
	 */
	void setAPourZoneObserveeAutreElementControle(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Est Objet Association Observation Observation</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Observation Observation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Observation Observation</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeObservation_EstObjetAssociationObservationObservation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeObjet_Observation' target_entity='type_AssociationObservationObservation'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationObservationObservation'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationObservationObservation();

} // TypeObservation
