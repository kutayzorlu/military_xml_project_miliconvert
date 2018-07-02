/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;
import mpia.meta.TypeDataTypeAltitudePression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Mission Air</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMissionAir#getNumeroMission <em>Numero Mission</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAir#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAir#getTypeMission <em>Type Mission</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAir#getNumeroMissionGroupement <em>Numero Mission Groupement</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAir#getAdresseLivraison <em>Adresse Livraison</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAir#getAltitudeAGL <em>Altitude AGL</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAir#getAltitudeObjectif <em>Altitude Objectif</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAir#getAutoriteDemandant <em>Autorite Demandant</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAir#getButMission <em>But Mission</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAir#getCommentaireDetails <em>Commentaire Details</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAir#getConfidentialiteOTAN <em>Confidentialite OTAN</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAir#getDateLivraison <em>Date Livraison</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAir#getDateRenseignement <em>Date Renseignement</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAir#getEchelleImage <em>Echelle Image</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAir#getIndicateurMissionResiduel <em>Indicateur Mission Residuel</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAir#getMoyenLivraison <em>Moyen Livraison</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAir#getNombreCopies <em>Nombre Copies</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAir#getNoSerieDemande <em>No Serie Demande</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAir#getNumeroEvenement <em>Numero Evenement</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAir#getNumeroPontAerien <em>Numero Pont Aerien</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAir#getSignalAppelGroupement <em>Signal Appel Groupement</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAir#getTypeCopie <em>Type Copie</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAir#getTypeCR <em>Type CR</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAir#getTypeSecondaireMission <em>Type Secondaire Mission</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAir#getTypeSenseurAerien <em>Type Senseur Aerien</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAir#getValeurEchelle <em>Valeur Echelle</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAir#getVueSenseur <em>Vue Senseur</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAir#getAPourUniteExecutanteUnite <em>APour Unite Executante Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAir#getEstObjetAssociationPlanificationOperation3DMissionAir <em>Est Objet Association Planification Operation3 DMission Air</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAir#getAPourGroupementUnite <em>APour Groupement Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAir#getAPourAdresseAdresse <em>APour Adresse Adresse</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAir#getAPourArmementsArmementMissionAppuiAerien <em>APour Armements Armement Mission Appui Aerien</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAir#getAPourPhasesPhaseMissionAppuiAerien <em>APour Phases Phase Mission Appui Aerien</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAir#getAPourTachesTacheAppuiAerien <em>APour Taches Tache Appui Aerien</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAir#getAPourTypeRessourceRessourceActiviteType <em>APour Type Ressource Ressource Activite Type</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAir#getEstObjetAssociationUniteMissionAir <em>Est Objet Association Unite Mission Air</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAir#getEstObjetAssociationPersonneMissionAir <em>Est Objet Association Personne Mission Air</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAir#getAPourPointsRecuperationAutreElementControle <em>APour Points Recuperation Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAir#getAPourPointDepartAutreElementControle <em>APour Point Depart Autre Element Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMissionAir()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_MissionAir' kind='elementOnly'"
 * @generated
 */
public interface TypeMissionAir extends TypeMission {
	/**
	 * Returns the value of the '<em><b>Numero Mission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Mission</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Mission</em>' attribute.
	 * @see #setNumeroMission(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAir_NumeroMission()
	 * @model dataType="mpia.meta.TypeDataTypeChaine08"
	 *        extendedMetaData="kind='element' name='NumeroMission'"
	 * @generated
	 */
	String getNumeroMission();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAir#getNumeroMission <em>Numero Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Mission</em>' attribute.
	 * @see #getNumeroMission()
	 * @generated
	 */
	void setNumeroMission(String value);

	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMissionAirCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionAirCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoMissionAirCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAir_Categorie()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoMissionAirCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAir#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionAirCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoMissionAirCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionAir#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoMissionAirCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionAir#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoMissionAirCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Type Mission</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMissionAppuiAerienTypeMission}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Mission</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Mission</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionAppuiAerienTypeMission
	 * @see #isSetTypeMission()
	 * @see #unsetTypeMission()
	 * @see #setTypeMission(TypeDictionaryDicoMissionAppuiAerienTypeMission)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAir_TypeMission()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeMission'"
	 * @generated
	 */
	TypeDictionaryDicoMissionAppuiAerienTypeMission getTypeMission();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAir#getTypeMission <em>Type Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Mission</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionAppuiAerienTypeMission
	 * @see #isSetTypeMission()
	 * @see #unsetTypeMission()
	 * @see #getTypeMission()
	 * @generated
	 */
	void setTypeMission(TypeDictionaryDicoMissionAppuiAerienTypeMission value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionAir#getTypeMission <em>Type Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeMission()
	 * @see #getTypeMission()
	 * @see #setTypeMission(TypeDictionaryDicoMissionAppuiAerienTypeMission)
	 * @generated
	 */
	void unsetTypeMission();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionAir#getTypeMission <em>Type Mission</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Mission</em>' attribute is set.
	 * @see #unsetTypeMission()
	 * @see #getTypeMission()
	 * @see #setTypeMission(TypeDictionaryDicoMissionAppuiAerienTypeMission)
	 * @generated
	 */
	boolean isSetTypeMission();

	/**
	 * Returns the value of the '<em><b>Numero Mission Groupement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Mission Groupement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Mission Groupement</em>' attribute.
	 * @see #isSetNumeroMissionGroupement()
	 * @see #unsetNumeroMissionGroupement()
	 * @see #setNumeroMissionGroupement(long)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAir_NumeroMissionGroupement()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier9"
	 *        extendedMetaData="kind='element' name='NumeroMissionGroupement'"
	 * @generated
	 */
	long getNumeroMissionGroupement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAir#getNumeroMissionGroupement <em>Numero Mission Groupement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Mission Groupement</em>' attribute.
	 * @see #isSetNumeroMissionGroupement()
	 * @see #unsetNumeroMissionGroupement()
	 * @see #getNumeroMissionGroupement()
	 * @generated
	 */
	void setNumeroMissionGroupement(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionAir#getNumeroMissionGroupement <em>Numero Mission Groupement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumeroMissionGroupement()
	 * @see #getNumeroMissionGroupement()
	 * @see #setNumeroMissionGroupement(long)
	 * @generated
	 */
	void unsetNumeroMissionGroupement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionAir#getNumeroMissionGroupement <em>Numero Mission Groupement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Numero Mission Groupement</em>' attribute is set.
	 * @see #unsetNumeroMissionGroupement()
	 * @see #getNumeroMissionGroupement()
	 * @see #setNumeroMissionGroupement(long)
	 * @generated
	 */
	boolean isSetNumeroMissionGroupement();

	/**
	 * Returns the value of the '<em><b>Adresse Livraison</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adresse Livraison</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adresse Livraison</em>' attribute.
	 * @see #setAdresseLivraison(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAir_AdresseLivraison()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='AdresseLivraison'"
	 * @generated
	 */
	String getAdresseLivraison();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAir#getAdresseLivraison <em>Adresse Livraison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adresse Livraison</em>' attribute.
	 * @see #getAdresseLivraison()
	 * @generated
	 */
	void setAdresseLivraison(String value);

	/**
	 * Returns the value of the '<em><b>Altitude AGL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Altitude AGL</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altitude AGL</em>' containment reference.
	 * @see #setAltitudeAGL(TypeDataTypeAltitudePression)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAir_AltitudeAGL()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AltitudeAGL'"
	 * @generated
	 */
	TypeDataTypeAltitudePression getAltitudeAGL();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAir#getAltitudeAGL <em>Altitude AGL</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altitude AGL</em>' containment reference.
	 * @see #getAltitudeAGL()
	 * @generated
	 */
	void setAltitudeAGL(TypeDataTypeAltitudePression value);

	/**
	 * Returns the value of the '<em><b>Altitude Objectif</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Altitude Objectif</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altitude Objectif</em>' containment reference.
	 * @see #setAltitudeObjectif(TypeDataTypeAltitudePression)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAir_AltitudeObjectif()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AltitudeObjectif'"
	 * @generated
	 */
	TypeDataTypeAltitudePression getAltitudeObjectif();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAir#getAltitudeObjectif <em>Altitude Objectif</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altitude Objectif</em>' containment reference.
	 * @see #getAltitudeObjectif()
	 * @generated
	 */
	void setAltitudeObjectif(TypeDataTypeAltitudePression value);

	/**
	 * Returns the value of the '<em><b>Autorite Demandant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autorite Demandant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autorite Demandant</em>' attribute.
	 * @see #setAutoriteDemandant(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAir_AutoriteDemandant()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='AutoriteDemandant'"
	 * @generated
	 */
	String getAutoriteDemandant();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAir#getAutoriteDemandant <em>Autorite Demandant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autorite Demandant</em>' attribute.
	 * @see #getAutoriteDemandant()
	 * @generated
	 */
	void setAutoriteDemandant(String value);

	/**
	 * Returns the value of the '<em><b>But Mission</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMissionAppuiAerienButMission}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>But Mission</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>But Mission</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionAppuiAerienButMission
	 * @see #isSetButMission()
	 * @see #unsetButMission()
	 * @see #setButMission(TypeDictionaryDicoMissionAppuiAerienButMission)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAir_ButMission()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ButMission'"
	 * @generated
	 */
	TypeDictionaryDicoMissionAppuiAerienButMission getButMission();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAir#getButMission <em>But Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>But Mission</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionAppuiAerienButMission
	 * @see #isSetButMission()
	 * @see #unsetButMission()
	 * @see #getButMission()
	 * @generated
	 */
	void setButMission(TypeDictionaryDicoMissionAppuiAerienButMission value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionAir#getButMission <em>But Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetButMission()
	 * @see #getButMission()
	 * @see #setButMission(TypeDictionaryDicoMissionAppuiAerienButMission)
	 * @generated
	 */
	void unsetButMission();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionAir#getButMission <em>But Mission</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>But Mission</em>' attribute is set.
	 * @see #unsetButMission()
	 * @see #getButMission()
	 * @see #setButMission(TypeDictionaryDicoMissionAppuiAerienButMission)
	 * @generated
	 */
	boolean isSetButMission();

	/**
	 * Returns the value of the '<em><b>Commentaire Details</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commentaire Details</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commentaire Details</em>' attribute.
	 * @see #setCommentaireDetails(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAir_CommentaireDetails()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='CommentaireDetails'"
	 * @generated
	 */
	String getCommentaireDetails();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAir#getCommentaireDetails <em>Commentaire Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commentaire Details</em>' attribute.
	 * @see #getCommentaireDetails()
	 * @generated
	 */
	void setCommentaireDetails(String value);

	/**
	 * Returns the value of the '<em><b>Confidentialite OTAN</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoConfidentialiteOTAN}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confidentialite OTAN</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidentialite OTAN</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoConfidentialiteOTAN
	 * @see #isSetConfidentialiteOTAN()
	 * @see #unsetConfidentialiteOTAN()
	 * @see #setConfidentialiteOTAN(TypeDictionaryDicoConfidentialiteOTAN)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAir_ConfidentialiteOTAN()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ConfidentialiteOTAN'"
	 * @generated
	 */
	TypeDictionaryDicoConfidentialiteOTAN getConfidentialiteOTAN();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAir#getConfidentialiteOTAN <em>Confidentialite OTAN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidentialite OTAN</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoConfidentialiteOTAN
	 * @see #isSetConfidentialiteOTAN()
	 * @see #unsetConfidentialiteOTAN()
	 * @see #getConfidentialiteOTAN()
	 * @generated
	 */
	void setConfidentialiteOTAN(TypeDictionaryDicoConfidentialiteOTAN value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionAir#getConfidentialiteOTAN <em>Confidentialite OTAN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConfidentialiteOTAN()
	 * @see #getConfidentialiteOTAN()
	 * @see #setConfidentialiteOTAN(TypeDictionaryDicoConfidentialiteOTAN)
	 * @generated
	 */
	void unsetConfidentialiteOTAN();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionAir#getConfidentialiteOTAN <em>Confidentialite OTAN</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Confidentialite OTAN</em>' attribute is set.
	 * @see #unsetConfidentialiteOTAN()
	 * @see #getConfidentialiteOTAN()
	 * @see #setConfidentialiteOTAN(TypeDictionaryDicoConfidentialiteOTAN)
	 * @generated
	 */
	boolean isSetConfidentialiteOTAN();

	/**
	 * Returns the value of the '<em><b>Date Livraison</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Livraison</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Livraison</em>' attribute.
	 * @see #setDateLivraison(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAir_DateLivraison()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateLivraison'"
	 * @generated
	 */
	XMLGregorianCalendar getDateLivraison();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAir#getDateLivraison <em>Date Livraison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Livraison</em>' attribute.
	 * @see #getDateLivraison()
	 * @generated
	 */
	void setDateLivraison(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Date Renseignement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Renseignement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Renseignement</em>' attribute.
	 * @see #setDateRenseignement(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAir_DateRenseignement()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateRenseignement'"
	 * @generated
	 */
	XMLGregorianCalendar getDateRenseignement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAir#getDateRenseignement <em>Date Renseignement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Renseignement</em>' attribute.
	 * @see #getDateRenseignement()
	 * @generated
	 */
	void setDateRenseignement(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Echelle Image</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMissionAppuiAerienEchelleImage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Echelle Image</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Echelle Image</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionAppuiAerienEchelleImage
	 * @see #isSetEchelleImage()
	 * @see #unsetEchelleImage()
	 * @see #setEchelleImage(TypeDictionaryDicoMissionAppuiAerienEchelleImage)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAir_EchelleImage()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EchelleImage'"
	 * @generated
	 */
	TypeDictionaryDicoMissionAppuiAerienEchelleImage getEchelleImage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAir#getEchelleImage <em>Echelle Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Echelle Image</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionAppuiAerienEchelleImage
	 * @see #isSetEchelleImage()
	 * @see #unsetEchelleImage()
	 * @see #getEchelleImage()
	 * @generated
	 */
	void setEchelleImage(TypeDictionaryDicoMissionAppuiAerienEchelleImage value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionAir#getEchelleImage <em>Echelle Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEchelleImage()
	 * @see #getEchelleImage()
	 * @see #setEchelleImage(TypeDictionaryDicoMissionAppuiAerienEchelleImage)
	 * @generated
	 */
	void unsetEchelleImage();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionAir#getEchelleImage <em>Echelle Image</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Echelle Image</em>' attribute is set.
	 * @see #unsetEchelleImage()
	 * @see #getEchelleImage()
	 * @see #setEchelleImage(TypeDictionaryDicoMissionAppuiAerienEchelleImage)
	 * @generated
	 */
	boolean isSetEchelleImage();

	/**
	 * Returns the value of the '<em><b>Indicateur Mission Residuel</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMissionAirIndicateurMissionResiduel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indicateur Mission Residuel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indicateur Mission Residuel</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionAirIndicateurMissionResiduel
	 * @see #isSetIndicateurMissionResiduel()
	 * @see #unsetIndicateurMissionResiduel()
	 * @see #setIndicateurMissionResiduel(TypeDictionaryDicoMissionAirIndicateurMissionResiduel)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAir_IndicateurMissionResiduel()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='IndicateurMissionResiduel'"
	 * @generated
	 */
	TypeDictionaryDicoMissionAirIndicateurMissionResiduel getIndicateurMissionResiduel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAir#getIndicateurMissionResiduel <em>Indicateur Mission Residuel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indicateur Mission Residuel</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionAirIndicateurMissionResiduel
	 * @see #isSetIndicateurMissionResiduel()
	 * @see #unsetIndicateurMissionResiduel()
	 * @see #getIndicateurMissionResiduel()
	 * @generated
	 */
	void setIndicateurMissionResiduel(TypeDictionaryDicoMissionAirIndicateurMissionResiduel value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionAir#getIndicateurMissionResiduel <em>Indicateur Mission Residuel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIndicateurMissionResiduel()
	 * @see #getIndicateurMissionResiduel()
	 * @see #setIndicateurMissionResiduel(TypeDictionaryDicoMissionAirIndicateurMissionResiduel)
	 * @generated
	 */
	void unsetIndicateurMissionResiduel();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionAir#getIndicateurMissionResiduel <em>Indicateur Mission Residuel</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Indicateur Mission Residuel</em>' attribute is set.
	 * @see #unsetIndicateurMissionResiduel()
	 * @see #getIndicateurMissionResiduel()
	 * @see #setIndicateurMissionResiduel(TypeDictionaryDicoMissionAirIndicateurMissionResiduel)
	 * @generated
	 */
	boolean isSetIndicateurMissionResiduel();

	/**
	 * Returns the value of the '<em><b>Moyen Livraison</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMissionAppuiAerienMoyenLivraison}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moyen Livraison</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moyen Livraison</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionAppuiAerienMoyenLivraison
	 * @see #isSetMoyenLivraison()
	 * @see #unsetMoyenLivraison()
	 * @see #setMoyenLivraison(TypeDictionaryDicoMissionAppuiAerienMoyenLivraison)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAir_MoyenLivraison()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='MoyenLivraison'"
	 * @generated
	 */
	TypeDictionaryDicoMissionAppuiAerienMoyenLivraison getMoyenLivraison();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAir#getMoyenLivraison <em>Moyen Livraison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moyen Livraison</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionAppuiAerienMoyenLivraison
	 * @see #isSetMoyenLivraison()
	 * @see #unsetMoyenLivraison()
	 * @see #getMoyenLivraison()
	 * @generated
	 */
	void setMoyenLivraison(TypeDictionaryDicoMissionAppuiAerienMoyenLivraison value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionAir#getMoyenLivraison <em>Moyen Livraison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMoyenLivraison()
	 * @see #getMoyenLivraison()
	 * @see #setMoyenLivraison(TypeDictionaryDicoMissionAppuiAerienMoyenLivraison)
	 * @generated
	 */
	void unsetMoyenLivraison();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionAir#getMoyenLivraison <em>Moyen Livraison</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Moyen Livraison</em>' attribute is set.
	 * @see #unsetMoyenLivraison()
	 * @see #getMoyenLivraison()
	 * @see #setMoyenLivraison(TypeDictionaryDicoMissionAppuiAerienMoyenLivraison)
	 * @generated
	 */
	boolean isSetMoyenLivraison();

	/**
	 * Returns the value of the '<em><b>Nombre Copies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Copies</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Copies</em>' attribute.
	 * @see #isSetNombreCopies()
	 * @see #unsetNombreCopies()
	 * @see #setNombreCopies(long)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAir_NombreCopies()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NombreCopies'"
	 * @generated
	 */
	long getNombreCopies();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAir#getNombreCopies <em>Nombre Copies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Copies</em>' attribute.
	 * @see #isSetNombreCopies()
	 * @see #unsetNombreCopies()
	 * @see #getNombreCopies()
	 * @generated
	 */
	void setNombreCopies(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionAir#getNombreCopies <em>Nombre Copies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreCopies()
	 * @see #getNombreCopies()
	 * @see #setNombreCopies(long)
	 * @generated
	 */
	void unsetNombreCopies();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionAir#getNombreCopies <em>Nombre Copies</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Copies</em>' attribute is set.
	 * @see #unsetNombreCopies()
	 * @see #getNombreCopies()
	 * @see #setNombreCopies(long)
	 * @generated
	 */
	boolean isSetNombreCopies();

	/**
	 * Returns the value of the '<em><b>No Serie Demande</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Serie Demande</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Serie Demande</em>' attribute.
	 * @see #isSetNoSerieDemande()
	 * @see #unsetNoSerieDemande()
	 * @see #setNoSerieDemande(long)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAir_NoSerieDemande()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NoSerieDemande'"
	 * @generated
	 */
	long getNoSerieDemande();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAir#getNoSerieDemande <em>No Serie Demande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Serie Demande</em>' attribute.
	 * @see #isSetNoSerieDemande()
	 * @see #unsetNoSerieDemande()
	 * @see #getNoSerieDemande()
	 * @generated
	 */
	void setNoSerieDemande(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionAir#getNoSerieDemande <em>No Serie Demande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNoSerieDemande()
	 * @see #getNoSerieDemande()
	 * @see #setNoSerieDemande(long)
	 * @generated
	 */
	void unsetNoSerieDemande();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionAir#getNoSerieDemande <em>No Serie Demande</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>No Serie Demande</em>' attribute is set.
	 * @see #unsetNoSerieDemande()
	 * @see #getNoSerieDemande()
	 * @see #setNoSerieDemande(long)
	 * @generated
	 */
	boolean isSetNoSerieDemande();

	/**
	 * Returns the value of the '<em><b>Numero Evenement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Evenement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Evenement</em>' attribute.
	 * @see #setNumeroEvenement(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAir_NumeroEvenement()
	 * @model dataType="mpia.meta.TypeDataTypeChaine03"
	 *        extendedMetaData="kind='element' name='NumeroEvenement'"
	 * @generated
	 */
	String getNumeroEvenement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAir#getNumeroEvenement <em>Numero Evenement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Evenement</em>' attribute.
	 * @see #getNumeroEvenement()
	 * @generated
	 */
	void setNumeroEvenement(String value);

	/**
	 * Returns the value of the '<em><b>Numero Pont Aerien</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Pont Aerien</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Pont Aerien</em>' attribute.
	 * @see #setNumeroPontAerien(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAir_NumeroPontAerien()
	 * @model dataType="mpia.meta.TypeDataTypeChaine012"
	 *        extendedMetaData="kind='element' name='NumeroPontAerien'"
	 * @generated
	 */
	String getNumeroPontAerien();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAir#getNumeroPontAerien <em>Numero Pont Aerien</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Pont Aerien</em>' attribute.
	 * @see #getNumeroPontAerien()
	 * @generated
	 */
	void setNumeroPontAerien(String value);

	/**
	 * Returns the value of the '<em><b>Signal Appel Groupement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signal Appel Groupement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Appel Groupement</em>' attribute.
	 * @see #setSignalAppelGroupement(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAir_SignalAppelGroupement()
	 * @model dataType="mpia.meta.TypeDataTypeChaine012"
	 *        extendedMetaData="kind='element' name='SignalAppelGroupement'"
	 * @generated
	 */
	String getSignalAppelGroupement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAir#getSignalAppelGroupement <em>Signal Appel Groupement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Appel Groupement</em>' attribute.
	 * @see #getSignalAppelGroupement()
	 * @generated
	 */
	void setSignalAppelGroupement(String value);

	/**
	 * Returns the value of the '<em><b>Type Copie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMissionAppuiAerienTypeCopie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Copie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Copie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionAppuiAerienTypeCopie
	 * @see #isSetTypeCopie()
	 * @see #unsetTypeCopie()
	 * @see #setTypeCopie(TypeDictionaryDicoMissionAppuiAerienTypeCopie)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAir_TypeCopie()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeCopie'"
	 * @generated
	 */
	TypeDictionaryDicoMissionAppuiAerienTypeCopie getTypeCopie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAir#getTypeCopie <em>Type Copie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Copie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionAppuiAerienTypeCopie
	 * @see #isSetTypeCopie()
	 * @see #unsetTypeCopie()
	 * @see #getTypeCopie()
	 * @generated
	 */
	void setTypeCopie(TypeDictionaryDicoMissionAppuiAerienTypeCopie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionAir#getTypeCopie <em>Type Copie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeCopie()
	 * @see #getTypeCopie()
	 * @see #setTypeCopie(TypeDictionaryDicoMissionAppuiAerienTypeCopie)
	 * @generated
	 */
	void unsetTypeCopie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionAir#getTypeCopie <em>Type Copie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Copie</em>' attribute is set.
	 * @see #unsetTypeCopie()
	 * @see #getTypeCopie()
	 * @see #setTypeCopie(TypeDictionaryDicoMissionAppuiAerienTypeCopie)
	 * @generated
	 */
	boolean isSetTypeCopie();

	/**
	 * Returns the value of the '<em><b>Type CR</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMissionAppuiAerienTypeCR}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type CR</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type CR</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionAppuiAerienTypeCR
	 * @see #isSetTypeCR()
	 * @see #unsetTypeCR()
	 * @see #setTypeCR(TypeDictionaryDicoMissionAppuiAerienTypeCR)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAir_TypeCR()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeCR'"
	 * @generated
	 */
	TypeDictionaryDicoMissionAppuiAerienTypeCR getTypeCR();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAir#getTypeCR <em>Type CR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type CR</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionAppuiAerienTypeCR
	 * @see #isSetTypeCR()
	 * @see #unsetTypeCR()
	 * @see #getTypeCR()
	 * @generated
	 */
	void setTypeCR(TypeDictionaryDicoMissionAppuiAerienTypeCR value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionAir#getTypeCR <em>Type CR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeCR()
	 * @see #getTypeCR()
	 * @see #setTypeCR(TypeDictionaryDicoMissionAppuiAerienTypeCR)
	 * @generated
	 */
	void unsetTypeCR();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionAir#getTypeCR <em>Type CR</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type CR</em>' attribute is set.
	 * @see #unsetTypeCR()
	 * @see #getTypeCR()
	 * @see #setTypeCR(TypeDictionaryDicoMissionAppuiAerienTypeCR)
	 * @generated
	 */
	boolean isSetTypeCR();

	/**
	 * Returns the value of the '<em><b>Type Secondaire Mission</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMissionAppuiAerienTypeMission}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Secondaire Mission</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Secondaire Mission</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionAppuiAerienTypeMission
	 * @see #isSetTypeSecondaireMission()
	 * @see #unsetTypeSecondaireMission()
	 * @see #setTypeSecondaireMission(TypeDictionaryDicoMissionAppuiAerienTypeMission)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAir_TypeSecondaireMission()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeSecondaireMission'"
	 * @generated
	 */
	TypeDictionaryDicoMissionAppuiAerienTypeMission getTypeSecondaireMission();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAir#getTypeSecondaireMission <em>Type Secondaire Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Secondaire Mission</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionAppuiAerienTypeMission
	 * @see #isSetTypeSecondaireMission()
	 * @see #unsetTypeSecondaireMission()
	 * @see #getTypeSecondaireMission()
	 * @generated
	 */
	void setTypeSecondaireMission(TypeDictionaryDicoMissionAppuiAerienTypeMission value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionAir#getTypeSecondaireMission <em>Type Secondaire Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeSecondaireMission()
	 * @see #getTypeSecondaireMission()
	 * @see #setTypeSecondaireMission(TypeDictionaryDicoMissionAppuiAerienTypeMission)
	 * @generated
	 */
	void unsetTypeSecondaireMission();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionAir#getTypeSecondaireMission <em>Type Secondaire Mission</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Secondaire Mission</em>' attribute is set.
	 * @see #unsetTypeSecondaireMission()
	 * @see #getTypeSecondaireMission()
	 * @see #setTypeSecondaireMission(TypeDictionaryDicoMissionAppuiAerienTypeMission)
	 * @generated
	 */
	boolean isSetTypeSecondaireMission();

	/**
	 * Returns the value of the '<em><b>Type Senseur Aerien</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMissionAppuiAerienTypeSenseurAerien}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Senseur Aerien</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Senseur Aerien</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionAppuiAerienTypeSenseurAerien
	 * @see #isSetTypeSenseurAerien()
	 * @see #unsetTypeSenseurAerien()
	 * @see #setTypeSenseurAerien(TypeDictionaryDicoMissionAppuiAerienTypeSenseurAerien)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAir_TypeSenseurAerien()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeSenseurAerien'"
	 * @generated
	 */
	TypeDictionaryDicoMissionAppuiAerienTypeSenseurAerien getTypeSenseurAerien();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAir#getTypeSenseurAerien <em>Type Senseur Aerien</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Senseur Aerien</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionAppuiAerienTypeSenseurAerien
	 * @see #isSetTypeSenseurAerien()
	 * @see #unsetTypeSenseurAerien()
	 * @see #getTypeSenseurAerien()
	 * @generated
	 */
	void setTypeSenseurAerien(TypeDictionaryDicoMissionAppuiAerienTypeSenseurAerien value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionAir#getTypeSenseurAerien <em>Type Senseur Aerien</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeSenseurAerien()
	 * @see #getTypeSenseurAerien()
	 * @see #setTypeSenseurAerien(TypeDictionaryDicoMissionAppuiAerienTypeSenseurAerien)
	 * @generated
	 */
	void unsetTypeSenseurAerien();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionAir#getTypeSenseurAerien <em>Type Senseur Aerien</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Senseur Aerien</em>' attribute is set.
	 * @see #unsetTypeSenseurAerien()
	 * @see #getTypeSenseurAerien()
	 * @see #setTypeSenseurAerien(TypeDictionaryDicoMissionAppuiAerienTypeSenseurAerien)
	 * @generated
	 */
	boolean isSetTypeSenseurAerien();

	/**
	 * Returns the value of the '<em><b>Valeur Echelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valeur Echelle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valeur Echelle</em>' attribute.
	 * @see #isSetValeurEchelle()
	 * @see #unsetValeurEchelle()
	 * @see #setValeurEchelle(long)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAir_ValeurEchelle()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='ValeurEchelle'"
	 * @generated
	 */
	long getValeurEchelle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAir#getValeurEchelle <em>Valeur Echelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valeur Echelle</em>' attribute.
	 * @see #isSetValeurEchelle()
	 * @see #unsetValeurEchelle()
	 * @see #getValeurEchelle()
	 * @generated
	 */
	void setValeurEchelle(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionAir#getValeurEchelle <em>Valeur Echelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValeurEchelle()
	 * @see #getValeurEchelle()
	 * @see #setValeurEchelle(long)
	 * @generated
	 */
	void unsetValeurEchelle();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionAir#getValeurEchelle <em>Valeur Echelle</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Valeur Echelle</em>' attribute is set.
	 * @see #unsetValeurEchelle()
	 * @see #getValeurEchelle()
	 * @see #setValeurEchelle(long)
	 * @generated
	 */
	boolean isSetValeurEchelle();

	/**
	 * Returns the value of the '<em><b>Vue Senseur</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMissionAppuiAerienVueSenseur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vue Senseur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vue Senseur</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionAppuiAerienVueSenseur
	 * @see #isSetVueSenseur()
	 * @see #unsetVueSenseur()
	 * @see #setVueSenseur(TypeDictionaryDicoMissionAppuiAerienVueSenseur)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAir_VueSenseur()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='VueSenseur'"
	 * @generated
	 */
	TypeDictionaryDicoMissionAppuiAerienVueSenseur getVueSenseur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAir#getVueSenseur <em>Vue Senseur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vue Senseur</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionAppuiAerienVueSenseur
	 * @see #isSetVueSenseur()
	 * @see #unsetVueSenseur()
	 * @see #getVueSenseur()
	 * @generated
	 */
	void setVueSenseur(TypeDictionaryDicoMissionAppuiAerienVueSenseur value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionAir#getVueSenseur <em>Vue Senseur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVueSenseur()
	 * @see #getVueSenseur()
	 * @see #setVueSenseur(TypeDictionaryDicoMissionAppuiAerienVueSenseur)
	 * @generated
	 */
	void unsetVueSenseur();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionAir#getVueSenseur <em>Vue Senseur</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vue Senseur</em>' attribute is set.
	 * @see #unsetVueSenseur()
	 * @see #getVueSenseur()
	 * @see #setVueSenseur(TypeDictionaryDicoMissionAppuiAerienVueSenseur)
	 * @generated
	 */
	boolean isSetVueSenseur();

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
	 * @see mpia.schema.SchemaPackage#getTypeMissionAir_APourUniteExecutanteUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteExecutante_Unite'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourUniteExecutanteUnite();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Planification Operation3 DMission Air</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Planification Operation3 DMission Air</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Planification Operation3 DMission Air</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionAir_EstObjetAssociationPlanificationOperation3DMissionAir()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeObjet_MissionAir' target_entity='type_AssociationPlanificationOperation3DMissionAir'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationPlanificationOperation3DMissionAir'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationPlanificationOperation3DMissionAir();

	/**
	 * Returns the value of the '<em><b>APour Groupement Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Groupement Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Groupement Unite</em>' containment reference.
	 * @see #setAPourGroupementUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAir_APourGroupementUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourGroupement_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getAPourGroupementUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAir#getAPourGroupementUnite <em>APour Groupement Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Groupement Unite</em>' containment reference.
	 * @see #getAPourGroupementUnite()
	 * @generated
	 */
	void setAPourGroupementUnite(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>APour Adresse Adresse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Adresse Adresse</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Adresse Adresse</em>' containment reference.
	 * @see #setAPourAdresseAdresse(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAir_APourAdresseAdresse()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Adresse'"
	 *        extendedMetaData="kind='element' name='APourAdresse_Adresse'"
	 * @generated
	 */
	TypeAssociation getAPourAdresseAdresse();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAir#getAPourAdresseAdresse <em>APour Adresse Adresse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Adresse Adresse</em>' containment reference.
	 * @see #getAPourAdresseAdresse()
	 * @generated
	 */
	void setAPourAdresseAdresse(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Armements Armement Mission Appui Aerien</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeArmementMissionAppuiAerien}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Armements Armement Mission Appui Aerien</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Armements Armement Mission Appui Aerien</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionAir_APourArmementsArmementMissionAppuiAerien()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ArmementMissionAppuiAerien'"
	 *        extendedMetaData="kind='element' name='APourArmements_ArmementMissionAppuiAerien'"
	 * @generated
	 */
	EList<TypeArmementMissionAppuiAerien> getAPourArmementsArmementMissionAppuiAerien();

	/**
	 * Returns the value of the '<em><b>APour Phases Phase Mission Appui Aerien</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePhaseMissionAppuiAerien}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Phases Phase Mission Appui Aerien</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Phases Phase Mission Appui Aerien</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionAir_APourPhasesPhaseMissionAppuiAerien()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_PhaseMissionAppuiAerien'"
	 *        extendedMetaData="kind='element' name='APourPhases_PhaseMissionAppuiAerien'"
	 * @generated
	 */
	EList<TypePhaseMissionAppuiAerien> getAPourPhasesPhaseMissionAppuiAerien();

	/**
	 * Returns the value of the '<em><b>APour Taches Tache Appui Aerien</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTacheAppuiAerien}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Taches Tache Appui Aerien</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Taches Tache Appui Aerien</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionAir_APourTachesTacheAppuiAerien()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_TacheAppuiAerien'"
	 *        extendedMetaData="kind='element' name='APourTaches_TacheAppuiAerien'"
	 * @generated
	 */
	EList<TypeTacheAppuiAerien> getAPourTachesTacheAppuiAerien();

	/**
	 * Returns the value of the '<em><b>APour Type Ressource Ressource Activite Type</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeRessourceActiviteType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Type Ressource Ressource Activite Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Type Ressource Ressource Activite Type</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionAir_APourTypeRessourceRessourceActiviteType()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_RessourceActiviteType'"
	 *        extendedMetaData="kind='element' name='APourTypeRessource_RessourceActiviteType'"
	 * @generated
	 */
	EList<TypeRessourceActiviteType> getAPourTypeRessourceRessourceActiviteType();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Unite Mission Air</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Unite Mission Air</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Unite Mission Air</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionAir_EstObjetAssociationUniteMissionAir()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_MissionAir' target_entity='type_AssociationUniteMissionAir'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationUniteMissionAir'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationUniteMissionAir();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Personne Mission Air</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Personne Mission Air</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Personne Mission Air</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionAir_EstObjetAssociationPersonneMissionAir()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_MissionAir' target_entity='type_AssociationPersonneMissionAir'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationPersonneMissionAir'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationPersonneMissionAir();

	/**
	 * Returns the value of the '<em><b>APour Points Recuperation Autre Element Controle</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Points Recuperation Autre Element Controle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Points Recuperation Autre Element Controle</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionAir_APourPointsRecuperationAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourPointsRecuperation_AutreElementControle'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourPointsRecuperationAutreElementControle();

	/**
	 * Returns the value of the '<em><b>APour Point Depart Autre Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Point Depart Autre Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Point Depart Autre Element Controle</em>' containment reference.
	 * @see #setAPourPointDepartAutreElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAir_APourPointDepartAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourPointDepart_AutreElementControle'"
	 * @generated
	 */
	TypeAssociation getAPourPointDepartAutreElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAir#getAPourPointDepartAutreElementControle <em>APour Point Depart Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Point Depart Autre Element Controle</em>' containment reference.
	 * @see #getAPourPointDepartAutreElementControle()
	 * @generated
	 */
	void setAPourPointDepartAutreElementControle(TypeAssociation value);

} // TypeMissionAir
