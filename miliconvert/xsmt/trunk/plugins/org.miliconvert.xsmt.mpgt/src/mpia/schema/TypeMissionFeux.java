/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeDuree;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Mission Feux</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMissionFeux#getTypeMission <em>Type Mission</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionFeux#getDisponibiliteInstantanee <em>Disponibilite Instantanee</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionFeux#getDisponibiliteDifferee <em>Disponibilite Differee</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionFeux#getEffetsRecherches <em>Effets Recherches</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionFeux#getEffetRechercheNonRepertorie <em>Effet Recherche Non Repertorie</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionFeux#getModaliteDeclenchementTirs <em>Modalite Declenchement Tirs</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionFeux#getMoyenAcquisition <em>Moyen Acquisition</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionFeux#getMoyenAcquisitionNonRepertorie <em>Moyen Acquisition Non Repertorie</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionFeux#getPreavis <em>Preavis</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionFeux#getCommentaireSurObjectif <em>Commentaire Sur Objectif</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionFeux#getAPourZoneApplicationFeuxAutreElementControle <em>APour Zone Application Feux Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionFeux#getRechercheEffet <em>Recherche Effet</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionFeux#getSInteresseATypeObjectifASS <em>SInteresse AType Objectif ASS</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionFeux#getAPourVolumeEnReserveTypeRepartition <em>APour Volume En Reserve Type Repartition</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionFeux#getAPourUniteExecutanteUnite <em>APour Unite Executante Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionFeux#getAPourUniteMeleePrioritaireUnite <em>APour Unite Melee Prioritaire Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionFeux#getAPourConsommationAlloueeTypeRepartition <em>APour Consommation Allouee Type Repartition</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMissionFeux()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_MissionFeux' kind='elementOnly'"
 * @generated
 */
public interface TypeMissionFeux extends TypeMission {
	/**
	 * Returns the value of the '<em><b>Type Mission</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMissionFeuxTypeMission}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Mission</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Mission</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionFeuxTypeMission
	 * @see #isSetTypeMission()
	 * @see #unsetTypeMission()
	 * @see #setTypeMission(TypeDictionaryDicoMissionFeuxTypeMission)
	 * @see mpia.schema.SchemaPackage#getTypeMissionFeux_TypeMission()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeMission'"
	 * @generated
	 */
	TypeDictionaryDicoMissionFeuxTypeMission getTypeMission();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionFeux#getTypeMission <em>Type Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Mission</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionFeuxTypeMission
	 * @see #isSetTypeMission()
	 * @see #unsetTypeMission()
	 * @see #getTypeMission()
	 * @generated
	 */
	void setTypeMission(TypeDictionaryDicoMissionFeuxTypeMission value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionFeux#getTypeMission <em>Type Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeMission()
	 * @see #getTypeMission()
	 * @see #setTypeMission(TypeDictionaryDicoMissionFeuxTypeMission)
	 * @generated
	 */
	void unsetTypeMission();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionFeux#getTypeMission <em>Type Mission</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Mission</em>' attribute is set.
	 * @see #unsetTypeMission()
	 * @see #getTypeMission()
	 * @see #setTypeMission(TypeDictionaryDicoMissionFeuxTypeMission)
	 * @generated
	 */
	boolean isSetTypeMission();

	/**
	 * Returns the value of the '<em><b>Disponibilite Instantanee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disponibilite Instantanee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disponibilite Instantanee</em>' attribute.
	 * @see #isSetDisponibiliteInstantanee()
	 * @see #unsetDisponibiliteInstantanee()
	 * @see #setDisponibiliteInstantanee(double)
	 * @see mpia.schema.SchemaPackage#getTypeMissionFeux_DisponibiliteInstantanee()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeFraction"
	 *        extendedMetaData="kind='element' name='DisponibiliteInstantanee'"
	 * @generated
	 */
	double getDisponibiliteInstantanee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionFeux#getDisponibiliteInstantanee <em>Disponibilite Instantanee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disponibilite Instantanee</em>' attribute.
	 * @see #isSetDisponibiliteInstantanee()
	 * @see #unsetDisponibiliteInstantanee()
	 * @see #getDisponibiliteInstantanee()
	 * @generated
	 */
	void setDisponibiliteInstantanee(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionFeux#getDisponibiliteInstantanee <em>Disponibilite Instantanee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisponibiliteInstantanee()
	 * @see #getDisponibiliteInstantanee()
	 * @see #setDisponibiliteInstantanee(double)
	 * @generated
	 */
	void unsetDisponibiliteInstantanee();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionFeux#getDisponibiliteInstantanee <em>Disponibilite Instantanee</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Disponibilite Instantanee</em>' attribute is set.
	 * @see #unsetDisponibiliteInstantanee()
	 * @see #getDisponibiliteInstantanee()
	 * @see #setDisponibiliteInstantanee(double)
	 * @generated
	 */
	boolean isSetDisponibiliteInstantanee();

	/**
	 * Returns the value of the '<em><b>Disponibilite Differee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disponibilite Differee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disponibilite Differee</em>' attribute.
	 * @see #isSetDisponibiliteDifferee()
	 * @see #unsetDisponibiliteDifferee()
	 * @see #setDisponibiliteDifferee(double)
	 * @see mpia.schema.SchemaPackage#getTypeMissionFeux_DisponibiliteDifferee()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeFraction"
	 *        extendedMetaData="kind='element' name='DisponibiliteDifferee'"
	 * @generated
	 */
	double getDisponibiliteDifferee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionFeux#getDisponibiliteDifferee <em>Disponibilite Differee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disponibilite Differee</em>' attribute.
	 * @see #isSetDisponibiliteDifferee()
	 * @see #unsetDisponibiliteDifferee()
	 * @see #getDisponibiliteDifferee()
	 * @generated
	 */
	void setDisponibiliteDifferee(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionFeux#getDisponibiliteDifferee <em>Disponibilite Differee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisponibiliteDifferee()
	 * @see #getDisponibiliteDifferee()
	 * @see #setDisponibiliteDifferee(double)
	 * @generated
	 */
	void unsetDisponibiliteDifferee();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionFeux#getDisponibiliteDifferee <em>Disponibilite Differee</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Disponibilite Differee</em>' attribute is set.
	 * @see #unsetDisponibiliteDifferee()
	 * @see #getDisponibiliteDifferee()
	 * @see #setDisponibiliteDifferee(double)
	 * @generated
	 */
	boolean isSetDisponibiliteDifferee();

	/**
	 * Returns the value of the '<em><b>Effets Recherches</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEffetTactiqueRecherche}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effets Recherches</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effets Recherches</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEffetTactiqueRecherche
	 * @see #isSetEffetsRecherches()
	 * @see #unsetEffetsRecherches()
	 * @see #setEffetsRecherches(TypeDictionaryDicoEffetTactiqueRecherche)
	 * @see mpia.schema.SchemaPackage#getTypeMissionFeux_EffetsRecherches()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EffetsRecherches'"
	 * @generated
	 */
	TypeDictionaryDicoEffetTactiqueRecherche getEffetsRecherches();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionFeux#getEffetsRecherches <em>Effets Recherches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effets Recherches</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEffetTactiqueRecherche
	 * @see #isSetEffetsRecherches()
	 * @see #unsetEffetsRecherches()
	 * @see #getEffetsRecherches()
	 * @generated
	 */
	void setEffetsRecherches(TypeDictionaryDicoEffetTactiqueRecherche value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionFeux#getEffetsRecherches <em>Effets Recherches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEffetsRecherches()
	 * @see #getEffetsRecherches()
	 * @see #setEffetsRecherches(TypeDictionaryDicoEffetTactiqueRecherche)
	 * @generated
	 */
	void unsetEffetsRecherches();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionFeux#getEffetsRecherches <em>Effets Recherches</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Effets Recherches</em>' attribute is set.
	 * @see #unsetEffetsRecherches()
	 * @see #getEffetsRecherches()
	 * @see #setEffetsRecherches(TypeDictionaryDicoEffetTactiqueRecherche)
	 * @generated
	 */
	boolean isSetEffetsRecherches();

	/**
	 * Returns the value of the '<em><b>Effet Recherche Non Repertorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effet Recherche Non Repertorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effet Recherche Non Repertorie</em>' attribute.
	 * @see #setEffetRechercheNonRepertorie(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionFeux_EffetRechercheNonRepertorie()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='EffetRechercheNonRepertorie'"
	 * @generated
	 */
	String getEffetRechercheNonRepertorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionFeux#getEffetRechercheNonRepertorie <em>Effet Recherche Non Repertorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effet Recherche Non Repertorie</em>' attribute.
	 * @see #getEffetRechercheNonRepertorie()
	 * @generated
	 */
	void setEffetRechercheNonRepertorie(String value);

	/**
	 * Returns the value of the '<em><b>Modalite Declenchement Tirs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modalite Declenchement Tirs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modalite Declenchement Tirs</em>' attribute.
	 * @see #setModaliteDeclenchementTirs(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionFeux_ModaliteDeclenchementTirs()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='ModaliteDeclenchementTirs'"
	 * @generated
	 */
	String getModaliteDeclenchementTirs();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionFeux#getModaliteDeclenchementTirs <em>Modalite Declenchement Tirs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modalite Declenchement Tirs</em>' attribute.
	 * @see #getModaliteDeclenchementTirs()
	 * @generated
	 */
	void setModaliteDeclenchementTirs(String value);

	/**
	 * Returns the value of the '<em><b>Moyen Acquisition</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMissionFeuxMoyenAcquisition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moyen Acquisition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moyen Acquisition</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionFeuxMoyenAcquisition
	 * @see #isSetMoyenAcquisition()
	 * @see #unsetMoyenAcquisition()
	 * @see #setMoyenAcquisition(TypeDictionaryDicoMissionFeuxMoyenAcquisition)
	 * @see mpia.schema.SchemaPackage#getTypeMissionFeux_MoyenAcquisition()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='MoyenAcquisition'"
	 * @generated
	 */
	TypeDictionaryDicoMissionFeuxMoyenAcquisition getMoyenAcquisition();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionFeux#getMoyenAcquisition <em>Moyen Acquisition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moyen Acquisition</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionFeuxMoyenAcquisition
	 * @see #isSetMoyenAcquisition()
	 * @see #unsetMoyenAcquisition()
	 * @see #getMoyenAcquisition()
	 * @generated
	 */
	void setMoyenAcquisition(TypeDictionaryDicoMissionFeuxMoyenAcquisition value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionFeux#getMoyenAcquisition <em>Moyen Acquisition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMoyenAcquisition()
	 * @see #getMoyenAcquisition()
	 * @see #setMoyenAcquisition(TypeDictionaryDicoMissionFeuxMoyenAcquisition)
	 * @generated
	 */
	void unsetMoyenAcquisition();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionFeux#getMoyenAcquisition <em>Moyen Acquisition</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Moyen Acquisition</em>' attribute is set.
	 * @see #unsetMoyenAcquisition()
	 * @see #getMoyenAcquisition()
	 * @see #setMoyenAcquisition(TypeDictionaryDicoMissionFeuxMoyenAcquisition)
	 * @generated
	 */
	boolean isSetMoyenAcquisition();

	/**
	 * Returns the value of the '<em><b>Moyen Acquisition Non Repertorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moyen Acquisition Non Repertorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moyen Acquisition Non Repertorie</em>' attribute.
	 * @see #setMoyenAcquisitionNonRepertorie(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionFeux_MoyenAcquisitionNonRepertorie()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='MoyenAcquisitionNonRepertorie'"
	 * @generated
	 */
	String getMoyenAcquisitionNonRepertorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionFeux#getMoyenAcquisitionNonRepertorie <em>Moyen Acquisition Non Repertorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moyen Acquisition Non Repertorie</em>' attribute.
	 * @see #getMoyenAcquisitionNonRepertorie()
	 * @generated
	 */
	void setMoyenAcquisitionNonRepertorie(String value);

	/**
	 * Returns the value of the '<em><b>Preavis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preavis</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preavis</em>' containment reference.
	 * @see #setPreavis(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeMissionFeux_Preavis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Preavis'"
	 * @generated
	 */
	TypeDataTypeDuree getPreavis();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionFeux#getPreavis <em>Preavis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preavis</em>' containment reference.
	 * @see #getPreavis()
	 * @generated
	 */
	void setPreavis(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>Commentaire Sur Objectif</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commentaire Sur Objectif</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commentaire Sur Objectif</em>' attribute.
	 * @see #setCommentaireSurObjectif(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionFeux_CommentaireSurObjectif()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='CommentaireSurObjectif'"
	 * @generated
	 */
	String getCommentaireSurObjectif();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionFeux#getCommentaireSurObjectif <em>Commentaire Sur Objectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commentaire Sur Objectif</em>' attribute.
	 * @see #getCommentaireSurObjectif()
	 * @generated
	 */
	void setCommentaireSurObjectif(String value);

	/**
	 * Returns the value of the '<em><b>APour Zone Application Feux Autre Element Controle</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Zone Application Feux Autre Element Controle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Zone Application Feux Autre Element Controle</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionFeux_APourZoneApplicationFeuxAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourZoneApplicationFeux_AutreElementControle'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourZoneApplicationFeuxAutreElementControle();

	/**
	 * Returns the value of the '<em><b>Recherche Effet</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeEffet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recherche Effet</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recherche Effet</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionFeux_RechercheEffet()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Effet'"
	 *        extendedMetaData="kind='element' name='Recherche_Effet'"
	 * @generated
	 */
	EList<TypeEffet> getRechercheEffet();

	/**
	 * Returns the value of the '<em><b>SInteresse AType Objectif ASS</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTypeObjectifASS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SInteresse AType Objectif ASS</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SInteresse AType Objectif ASS</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionFeux_SInteresseATypeObjectifASS()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_TypeObjectifASS'"
	 *        extendedMetaData="kind='element' name='SInteresseA_TypeObjectifASS'"
	 * @generated
	 */
	EList<TypeTypeObjectifASS> getSInteresseATypeObjectifASS();

	/**
	 * Returns the value of the '<em><b>APour Volume En Reserve Type Repartition</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTypeRepartition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Volume En Reserve Type Repartition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Volume En Reserve Type Repartition</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionFeux_APourVolumeEnReserveTypeRepartition()
	 * @model containment="true" upper="2"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_TypeRepartition'"
	 *        extendedMetaData="kind='element' name='APourVolumeEnReserve_TypeRepartition'"
	 * @generated
	 */
	EList<TypeTypeRepartition> getAPourVolumeEnReserveTypeRepartition();

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
	 * @see mpia.schema.SchemaPackage#getTypeMissionFeux_APourUniteExecutanteUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteExecutante_Unite'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourUniteExecutanteUnite();

	/**
	 * Returns the value of the '<em><b>APour Unite Melee Prioritaire Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite Melee Prioritaire Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite Melee Prioritaire Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionFeux_APourUniteMeleePrioritaireUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteMeleePrioritaire_Unite'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourUniteMeleePrioritaireUnite();

	/**
	 * Returns the value of the '<em><b>APour Consommation Allouee Type Repartition</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTypeRepartition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Consommation Allouee Type Repartition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Consommation Allouee Type Repartition</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionFeux_APourConsommationAlloueeTypeRepartition()
	 * @model containment="true" upper="2"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_TypeRepartition'"
	 *        extendedMetaData="kind='element' name='APourConsommationAllouee_TypeRepartition'"
	 * @generated
	 */
	EList<TypeTypeRepartition> getAPourConsommationAlloueeTypeRepartition();

} // TypeMissionFeux
