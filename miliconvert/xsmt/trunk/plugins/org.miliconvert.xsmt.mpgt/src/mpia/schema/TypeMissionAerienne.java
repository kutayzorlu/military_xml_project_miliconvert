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
 * A representation of the model object '<em><b>Type Mission Aerienne</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMissionAerienne#getAutreOrdre <em>Autre Ordre</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAerienne#getCommentaireHoraire <em>Commentaire Horaire</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAerienne#getCommentaireMissionRecue <em>Commentaire Mission Recue</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAerienne#getCopieMissionOPOgtia <em>Copie Mission OP Ogtia</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAerienne#getDatePrevision <em>Date Prevision</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAerienne#getDateHeureH <em>Date Heure H</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAerienne#getDateEmissionHoraire <em>Date Emission Horaire</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAerienne#getIdentifiantAutreOrdre <em>Identifiant Autre Ordre</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAerienne#getIdentifiantMissionConjointeLiee <em>Identifiant Mission Conjointe Liee</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAerienne#getSyntheseSituationOPOgtia <em>Synthese Situation OP Ogtia</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAerienne#isValidationPrevisionMouvement <em>Validation Prevision Mouvement</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAerienne#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAerienne#getTypeDeclencheur <em>Type Declencheur</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAerienne#getEstObjetAssociationConflit3DMissionAerienne <em>Est Objet Association Conflit3 DMission Aerienne</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAerienne#getEstObjetAssociationMissionAerienneMissionAerienne <em>Est Objet Association Mission Aerienne Mission Aerienne</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAerienne#getEstSujetAssociationMissionAerienneMissionAerienne <em>Est Sujet Association Mission Aerienne Mission Aerienne</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAerienne#getACommeConsigneConsigne <em>AComme Consigne Consigne</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAerienne#getEstObjetAssociationMesureCoordMissionAerienne <em>Est Objet Association Mesure Coord Mission Aerienne</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAerienne#getConcerneModule <em>Concerne Module</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAerienne#getACommePositionPlotsPositionPlots <em>AComme Position Plots Position Plots</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAerienne#getACommeIntervenant3DTypeIntervenant3D <em>AComme Intervenant3 DType Intervenant3 D</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAerienne#getAPourTypeMissionAerienneTypeMissionAerienne <em>APour Type Mission Aerienne Type Mission Aerienne</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAerienne#getACommePhaseVolPhaseVolDrone <em>AComme Phase Vol Phase Vol Drone</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAerienne#getDonneLieuACRmouvementAerien <em>Donne Lieu AC Rmouvement Aerien</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAerienne#getACommeCaracteristiqueVolVol <em>AComme Caracteristique Vol Vol</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAerienne#getEstAssocieOverlay <em>Est Associe Overlay</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAerienne#getEstObjetAssociationUniteMissionAerienne <em>Est Objet Association Unite Mission Aerienne</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionAerienne#getAPourModuleExecutantModule <em>APour Module Executant Module</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMissionAerienne()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_MissionAerienne' kind='elementOnly'"
 * @generated
 */
public interface TypeMissionAerienne extends TypeMission {
	/**
	 * Returns the value of the '<em><b>Autre Ordre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Ordre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Ordre</em>' attribute.
	 * @see #setAutreOrdre(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAerienne_AutreOrdre()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='AutreOrdre'"
	 * @generated
	 */
	String getAutreOrdre();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAerienne#getAutreOrdre <em>Autre Ordre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autre Ordre</em>' attribute.
	 * @see #getAutreOrdre()
	 * @generated
	 */
	void setAutreOrdre(String value);

	/**
	 * Returns the value of the '<em><b>Commentaire Horaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commentaire Horaire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commentaire Horaire</em>' attribute.
	 * @see #setCommentaireHoraire(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAerienne_CommentaireHoraire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='CommentaireHoraire'"
	 * @generated
	 */
	String getCommentaireHoraire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAerienne#getCommentaireHoraire <em>Commentaire Horaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commentaire Horaire</em>' attribute.
	 * @see #getCommentaireHoraire()
	 * @generated
	 */
	void setCommentaireHoraire(String value);

	/**
	 * Returns the value of the '<em><b>Commentaire Mission Recue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commentaire Mission Recue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commentaire Mission Recue</em>' attribute.
	 * @see #setCommentaireMissionRecue(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAerienne_CommentaireMissionRecue()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='CommentaireMissionRecue'"
	 * @generated
	 */
	String getCommentaireMissionRecue();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAerienne#getCommentaireMissionRecue <em>Commentaire Mission Recue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commentaire Mission Recue</em>' attribute.
	 * @see #getCommentaireMissionRecue()
	 * @generated
	 */
	void setCommentaireMissionRecue(String value);

	/**
	 * Returns the value of the '<em><b>Copie Mission OP Ogtia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copie Mission OP Ogtia</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copie Mission OP Ogtia</em>' attribute.
	 * @see #setCopieMissionOPOgtia(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAerienne_CopieMissionOPOgtia()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='CopieMissionOPOgtia'"
	 * @generated
	 */
	String getCopieMissionOPOgtia();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAerienne#getCopieMissionOPOgtia <em>Copie Mission OP Ogtia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copie Mission OP Ogtia</em>' attribute.
	 * @see #getCopieMissionOPOgtia()
	 * @generated
	 */
	void setCopieMissionOPOgtia(String value);

	/**
	 * Returns the value of the '<em><b>Date Prevision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Prevision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Prevision</em>' attribute.
	 * @see #setDatePrevision(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAerienne_DatePrevision()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DatePrevision'"
	 * @generated
	 */
	XMLGregorianCalendar getDatePrevision();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAerienne#getDatePrevision <em>Date Prevision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Prevision</em>' attribute.
	 * @see #getDatePrevision()
	 * @generated
	 */
	void setDatePrevision(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Date Heure H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Heure H</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Heure H</em>' attribute.
	 * @see #setDateHeureH(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAerienne_DateHeureH()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateHeureH'"
	 * @generated
	 */
	XMLGregorianCalendar getDateHeureH();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAerienne#getDateHeureH <em>Date Heure H</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Heure H</em>' attribute.
	 * @see #getDateHeureH()
	 * @generated
	 */
	void setDateHeureH(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Date Emission Horaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Emission Horaire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Emission Horaire</em>' attribute.
	 * @see #setDateEmissionHoraire(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAerienne_DateEmissionHoraire()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateEmissionHoraire'"
	 * @generated
	 */
	XMLGregorianCalendar getDateEmissionHoraire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAerienne#getDateEmissionHoraire <em>Date Emission Horaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Emission Horaire</em>' attribute.
	 * @see #getDateEmissionHoraire()
	 * @generated
	 */
	void setDateEmissionHoraire(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Identifiant Autre Ordre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifiant Autre Ordre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifiant Autre Ordre</em>' attribute.
	 * @see #setIdentifiantAutreOrdre(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAerienne_IdentifiantAutreOrdre()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='IdentifiantAutreOrdre'"
	 * @generated
	 */
	String getIdentifiantAutreOrdre();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAerienne#getIdentifiantAutreOrdre <em>Identifiant Autre Ordre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifiant Autre Ordre</em>' attribute.
	 * @see #getIdentifiantAutreOrdre()
	 * @generated
	 */
	void setIdentifiantAutreOrdre(String value);

	/**
	 * Returns the value of the '<em><b>Identifiant Mission Conjointe Liee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifiant Mission Conjointe Liee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifiant Mission Conjointe Liee</em>' attribute.
	 * @see #setIdentifiantMissionConjointeLiee(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAerienne_IdentifiantMissionConjointeLiee()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='IdentifiantMissionConjointeLiee'"
	 * @generated
	 */
	String getIdentifiantMissionConjointeLiee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAerienne#getIdentifiantMissionConjointeLiee <em>Identifiant Mission Conjointe Liee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifiant Mission Conjointe Liee</em>' attribute.
	 * @see #getIdentifiantMissionConjointeLiee()
	 * @generated
	 */
	void setIdentifiantMissionConjointeLiee(String value);

	/**
	 * Returns the value of the '<em><b>Synthese Situation OP Ogtia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synthese Situation OP Ogtia</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synthese Situation OP Ogtia</em>' attribute.
	 * @see #setSyntheseSituationOPOgtia(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAerienne_SyntheseSituationOPOgtia()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='SyntheseSituationOPOgtia'"
	 * @generated
	 */
	String getSyntheseSituationOPOgtia();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAerienne#getSyntheseSituationOPOgtia <em>Synthese Situation OP Ogtia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synthese Situation OP Ogtia</em>' attribute.
	 * @see #getSyntheseSituationOPOgtia()
	 * @generated
	 */
	void setSyntheseSituationOPOgtia(String value);

	/**
	 * Returns the value of the '<em><b>Validation Prevision Mouvement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validation Prevision Mouvement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validation Prevision Mouvement</em>' attribute.
	 * @see #isSetValidationPrevisionMouvement()
	 * @see #unsetValidationPrevisionMouvement()
	 * @see #setValidationPrevisionMouvement(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAerienne_ValidationPrevisionMouvement()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='ValidationPrevisionMouvement'"
	 * @generated
	 */
	boolean isValidationPrevisionMouvement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAerienne#isValidationPrevisionMouvement <em>Validation Prevision Mouvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation Prevision Mouvement</em>' attribute.
	 * @see #isSetValidationPrevisionMouvement()
	 * @see #unsetValidationPrevisionMouvement()
	 * @see #isValidationPrevisionMouvement()
	 * @generated
	 */
	void setValidationPrevisionMouvement(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionAerienne#isValidationPrevisionMouvement <em>Validation Prevision Mouvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValidationPrevisionMouvement()
	 * @see #isValidationPrevisionMouvement()
	 * @see #setValidationPrevisionMouvement(boolean)
	 * @generated
	 */
	void unsetValidationPrevisionMouvement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionAerienne#isValidationPrevisionMouvement <em>Validation Prevision Mouvement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Validation Prevision Mouvement</em>' attribute is set.
	 * @see #unsetValidationPrevisionMouvement()
	 * @see #isValidationPrevisionMouvement()
	 * @see #setValidationPrevisionMouvement(boolean)
	 * @generated
	 */
	boolean isSetValidationPrevisionMouvement();

	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMissionAerienneCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionAerienneCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoMissionAerienneCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAerienne_Categorie()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoMissionAerienneCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAerienne#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionAerienneCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoMissionAerienneCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionAerienne#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoMissionAerienneCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionAerienne#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoMissionAerienneCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Type Declencheur</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMissionAerienneTypeDeclencheur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Declencheur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Declencheur</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionAerienneTypeDeclencheur
	 * @see #isSetTypeDeclencheur()
	 * @see #unsetTypeDeclencheur()
	 * @see #setTypeDeclencheur(TypeDictionaryDicoMissionAerienneTypeDeclencheur)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAerienne_TypeDeclencheur()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeDeclencheur'"
	 * @generated
	 */
	TypeDictionaryDicoMissionAerienneTypeDeclencheur getTypeDeclencheur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAerienne#getTypeDeclencheur <em>Type Declencheur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Declencheur</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionAerienneTypeDeclencheur
	 * @see #isSetTypeDeclencheur()
	 * @see #unsetTypeDeclencheur()
	 * @see #getTypeDeclencheur()
	 * @generated
	 */
	void setTypeDeclencheur(TypeDictionaryDicoMissionAerienneTypeDeclencheur value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionAerienne#getTypeDeclencheur <em>Type Declencheur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeDeclencheur()
	 * @see #getTypeDeclencheur()
	 * @see #setTypeDeclencheur(TypeDictionaryDicoMissionAerienneTypeDeclencheur)
	 * @generated
	 */
	void unsetTypeDeclencheur();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionAerienne#getTypeDeclencheur <em>Type Declencheur</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Declencheur</em>' attribute is set.
	 * @see #unsetTypeDeclencheur()
	 * @see #getTypeDeclencheur()
	 * @see #setTypeDeclencheur(TypeDictionaryDicoMissionAerienneTypeDeclencheur)
	 * @generated
	 */
	boolean isSetTypeDeclencheur();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Conflit3 DMission Aerienne</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Conflit3 DMission Aerienne</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Conflit3 DMission Aerienne</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionAerienne_EstObjetAssociationConflit3DMissionAerienne()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeObjet_MissionAerienne' target_entity='type_AssociationConflit3DMissionAerienne'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationConflit3DMissionAerienne'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationConflit3DMissionAerienne();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Mission Aerienne Mission Aerienne</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Mission Aerienne Mission Aerienne</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Mission Aerienne Mission Aerienne</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionAerienne_EstObjetAssociationMissionAerienneMissionAerienne()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeObjet_MissionAerienne' target_entity='type_AssociationMissionAerienneMissionAerienne'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationMissionAerienneMissionAerienne'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationMissionAerienneMissionAerienne();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Mission Aerienne Mission Aerienne</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Mission Aerienne Mission Aerienne</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Mission Aerienne Mission Aerienne</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionAerienne_EstSujetAssociationMissionAerienneMissionAerienne()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeSujet_MissionAerienne' target_entity='type_AssociationMissionAerienneMissionAerienne'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationMissionAerienneMissionAerienne'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationMissionAerienneMissionAerienne();

	/**
	 * Returns the value of the '<em><b>AComme Consigne Consigne</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Consigne Consigne</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Consigne Consigne</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionAerienne_ACommeConsigneConsigne()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Consigne'"
	 *        extendedMetaData="kind='element' name='ACommeConsigne_Consigne'"
	 * @generated
	 */
	EList<TypeAssociation> getACommeConsigneConsigne();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Mesure Coord Mission Aerienne</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Mesure Coord Mission Aerienne</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Mesure Coord Mission Aerienne</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionAerienne_EstObjetAssociationMesureCoordMissionAerienne()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_MissionAerienne' target_entity='type_AssociationMesureCoordMissionAerienne'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationMesureCoordMissionAerienne'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationMesureCoordMissionAerienne();

	/**
	 * Returns the value of the '<em><b>Concerne Module</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Module</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Module</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionAerienne_ConcerneModule()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Module'"
	 *        extendedMetaData="kind='element' name='Concerne_Module'"
	 * @generated
	 */
	EList<TypeAssociation> getConcerneModule();

	/**
	 * Returns the value of the '<em><b>AComme Position Plots Position Plots</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePositionPlots}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Position Plots Position Plots</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Position Plots Position Plots</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionAerienne_ACommePositionPlotsPositionPlots()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_PositionPlots'"
	 *        extendedMetaData="kind='element' name='ACommePositionPlots_PositionPlots'"
	 * @generated
	 */
	EList<TypePositionPlots> getACommePositionPlotsPositionPlots();

	/**
	 * Returns the value of the '<em><b>AComme Intervenant3 DType Intervenant3 D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Intervenant3 DType Intervenant3 D</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Intervenant3 DType Intervenant3 D</em>' containment reference.
	 * @see #setACommeIntervenant3DTypeIntervenant3D(TypeTypeIntervenant3D)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAerienne_ACommeIntervenant3DTypeIntervenant3D()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_TypeIntervenant3D'"
	 *        extendedMetaData="kind='element' name='ACommeIntervenant3D_TypeIntervenant3D'"
	 * @generated
	 */
	TypeTypeIntervenant3D getACommeIntervenant3DTypeIntervenant3D();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAerienne#getACommeIntervenant3DTypeIntervenant3D <em>AComme Intervenant3 DType Intervenant3 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Intervenant3 DType Intervenant3 D</em>' containment reference.
	 * @see #getACommeIntervenant3DTypeIntervenant3D()
	 * @generated
	 */
	void setACommeIntervenant3DTypeIntervenant3D(TypeTypeIntervenant3D value);

	/**
	 * Returns the value of the '<em><b>APour Type Mission Aerienne Type Mission Aerienne</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTypeMissionAerienne}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Type Mission Aerienne Type Mission Aerienne</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Type Mission Aerienne Type Mission Aerienne</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionAerienne_APourTypeMissionAerienneTypeMissionAerienne()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_TypeMissionAerienne'"
	 *        extendedMetaData="kind='element' name='APourTypeMissionAerienne_TypeMissionAerienne'"
	 * @generated
	 */
	EList<TypeTypeMissionAerienne> getAPourTypeMissionAerienneTypeMissionAerienne();

	/**
	 * Returns the value of the '<em><b>AComme Phase Vol Phase Vol Drone</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePhaseVolDrone}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Phase Vol Phase Vol Drone</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Phase Vol Phase Vol Drone</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionAerienne_ACommePhaseVolPhaseVolDrone()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_PhaseVolDrone'"
	 *        extendedMetaData="kind='element' name='ACommePhaseVol_PhaseVolDrone'"
	 * @generated
	 */
	EList<TypePhaseVolDrone> getACommePhaseVolPhaseVolDrone();

	/**
	 * Returns the value of the '<em><b>Donne Lieu AC Rmouvement Aerien</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeCRmouvementAerien}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Donne Lieu AC Rmouvement Aerien</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Donne Lieu AC Rmouvement Aerien</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionAerienne_DonneLieuACRmouvementAerien()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_CRmouvementAerien'"
	 *        extendedMetaData="kind='element' name='DonneLieuA_CRmouvementAerien'"
	 * @generated
	 */
	EList<TypeCRmouvementAerien> getDonneLieuACRmouvementAerien();

	/**
	 * Returns the value of the '<em><b>AComme Caracteristique Vol Vol</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Caracteristique Vol Vol</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Caracteristique Vol Vol</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionAerienne_ACommeCaracteristiqueVolVol()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Vol'"
	 *        extendedMetaData="kind='element' name='ACommeCaracteristiqueVol_Vol'"
	 * @generated
	 */
	EList<TypeAssociation> getACommeCaracteristiqueVolVol();

	/**
	 * Returns the value of the '<em><b>Est Associe Overlay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Associe Overlay</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Associe Overlay</em>' containment reference.
	 * @see #setEstAssocieOverlay(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeMissionAerienne_EstAssocieOverlay()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstReference_MissionAerienne' target_entity='type_Overlay'"
	 *        extendedMetaData="kind='element' name='EstAssocie_Overlay'"
	 * @generated
	 */
	TypeAssociation getEstAssocieOverlay();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionAerienne#getEstAssocieOverlay <em>Est Associe Overlay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Associe Overlay</em>' containment reference.
	 * @see #getEstAssocieOverlay()
	 * @generated
	 */
	void setEstAssocieOverlay(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Est Objet Association Unite Mission Aerienne</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Unite Mission Aerienne</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Unite Mission Aerienne</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionAerienne_EstObjetAssociationUniteMissionAerienne()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_MissionAerienne' target_entity='type_AssociationUniteMissionAerienne'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationUniteMissionAerienne'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationUniteMissionAerienne();

	/**
	 * Returns the value of the '<em><b>APour Module Executant Module</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Module Executant Module</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Module Executant Module</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionAerienne_APourModuleExecutantModule()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Module'"
	 *        extendedMetaData="kind='element' name='APourModuleExecutant_Module'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourModuleExecutantModule();

} // TypeMissionAerienne
