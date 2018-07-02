/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;
import mpia.meta.TypeDataTypeDuree;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Objectif Ciblage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeObjectifCiblage#getNormeIdentification <em>Norme Identification</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifCiblage#getIdentification <em>Identification</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifCiblage#getPriorite <em>Priorite</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifCiblage#getType <em>Type</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifCiblage#getAutoriteEngagement <em>Autorite Engagement</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifCiblage#getEffetRecherche <em>Effet Recherche</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifCiblage#getNature <em>Nature</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifCiblage#getEchelonTactique <em>Echelon Tactique</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifCiblage#getVolume <em>Volume</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifCiblage#getDureeDisponibilite <em>Duree Disponibilite</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifCiblage#getDommagesCollateraux <em>Dommages Collateraux</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifCiblage#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifCiblage#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifCiblage#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifCiblage#getAssocieCommeTypeObjectifActiviteType <em>Associe Comme Type Objectif Activite Type</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifCiblage#getACommeProtectionPersonnelProtectionPersonnel <em>AComme Protection Personnel Protection Personnel</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifCiblage#getAPourMobiliteMobilite <em>APour Mobilite Mobilite</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifCiblage#getEstLocaliseParAssociationObjectifCiblageLocalisation <em>Est Localise Par Association Objectif Ciblage Localisation</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifCiblage#getAPourCaracteristiquesObjectifMajeurObjectifMajeur <em>APour Caracteristiques Objectif Majeur Objectif Majeur</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifCiblage#getAPourCaracteristiquesASSObjectifASS <em>APour Caracteristiques ASS Objectif ASS</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifCiblage#getAPourCaracteristiqueAlatObjectifAlat <em>APour Caracteristique Alat Objectif Alat</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifCiblage#getAPourCreateurUnite <em>APour Createur Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifCiblage#getAPourUniteFeuxAEngagerReservationUnite <em>APour Unite Feux AEngager Reservation Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifCiblage#getAPourDocumentAssocieAssociationObjectifCiblageDocument <em>APour Document Associe Association Objectif Ciblage Document</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifCiblage#getACommeAutorisationAutorisationObjectifCiblage <em>AComme Autorisation Autorisation Objectif Ciblage</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifCiblage#getEstIdentifieParMarquageObjectif <em>Est Identifie Par Marquage Objectif</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifCiblage#getCorrespondAObjectifActivite <em>Correspond AObjectif Activite</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifCiblage#getACommeListeObjectifsListeObjectifs <em>AComme Liste Objectifs Liste Objectifs</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifCiblage#getContraintAssociationObjectifCiblageObjectifCiblage <em>Contraint Association Objectif Ciblage Objectif Ciblage</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifCiblage#getDependAssociationObjectifCiblageObjectifCiblage <em>Depend Association Objectif Ciblage Objectif Ciblage</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifCiblage#getAssocieCommeInstanceObjetInstanceObjet <em>Associe Comme Instance Objet Instance Objet</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeObjectifCiblage()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_ObjectifCiblage' kind='elementOnly'"
 * @generated
 */
public interface TypeObjectifCiblage extends EObject {
	/**
	 * Returns the value of the '<em><b>Norme Identification</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoObjectifCiblageNormeIdentification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Norme Identification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Norme Identification</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoObjectifCiblageNormeIdentification
	 * @see #isSetNormeIdentification()
	 * @see #unsetNormeIdentification()
	 * @see #setNormeIdentification(TypeDictionaryDicoObjectifCiblageNormeIdentification)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifCiblage_NormeIdentification()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='NormeIdentification'"
	 * @generated
	 */
	TypeDictionaryDicoObjectifCiblageNormeIdentification getNormeIdentification();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifCiblage#getNormeIdentification <em>Norme Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Norme Identification</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoObjectifCiblageNormeIdentification
	 * @see #isSetNormeIdentification()
	 * @see #unsetNormeIdentification()
	 * @see #getNormeIdentification()
	 * @generated
	 */
	void setNormeIdentification(TypeDictionaryDicoObjectifCiblageNormeIdentification value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeObjectifCiblage#getNormeIdentification <em>Norme Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNormeIdentification()
	 * @see #getNormeIdentification()
	 * @see #setNormeIdentification(TypeDictionaryDicoObjectifCiblageNormeIdentification)
	 * @generated
	 */
	void unsetNormeIdentification();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeObjectifCiblage#getNormeIdentification <em>Norme Identification</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Norme Identification</em>' attribute is set.
	 * @see #unsetNormeIdentification()
	 * @see #getNormeIdentification()
	 * @see #setNormeIdentification(TypeDictionaryDicoObjectifCiblageNormeIdentification)
	 * @generated
	 */
	boolean isSetNormeIdentification();

	/**
	 * Returns the value of the '<em><b>Identification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identification</em>' attribute.
	 * @see #setIdentification(String)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifCiblage_Identification()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='Identification'"
	 * @generated
	 */
	String getIdentification();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifCiblage#getIdentification <em>Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identification</em>' attribute.
	 * @see #getIdentification()
	 * @generated
	 */
	void setIdentification(String value);

	/**
	 * Returns the value of the '<em><b>Priorite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priorite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priorite</em>' attribute.
	 * @see #isSetPriorite()
	 * @see #unsetPriorite()
	 * @see #setPriorite(long)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifCiblage_Priorite()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='Priorite'"
	 * @generated
	 */
	long getPriorite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifCiblage#getPriorite <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priorite</em>' attribute.
	 * @see #isSetPriorite()
	 * @see #unsetPriorite()
	 * @see #getPriorite()
	 * @generated
	 */
	void setPriorite(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeObjectifCiblage#getPriorite <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPriorite()
	 * @see #getPriorite()
	 * @see #setPriorite(long)
	 * @generated
	 */
	void unsetPriorite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeObjectifCiblage#getPriorite <em>Priorite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Priorite</em>' attribute is set.
	 * @see #unsetPriorite()
	 * @see #getPriorite()
	 * @see #setPriorite(long)
	 * @generated
	 */
	boolean isSetPriorite();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoObjectifCiblageType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoObjectifCiblageType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeDictionaryDicoObjectifCiblageType)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifCiblage_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Type'"
	 * @generated
	 */
	TypeDictionaryDicoObjectifCiblageType getType();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifCiblage#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoObjectifCiblageType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeDictionaryDicoObjectifCiblageType value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeObjectifCiblage#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeDictionaryDicoObjectifCiblageType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeObjectifCiblage#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeDictionaryDicoObjectifCiblageType)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Autorite Engagement</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoObjectifCiblageAutoriteEngagement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autorite Engagement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autorite Engagement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoObjectifCiblageAutoriteEngagement
	 * @see #isSetAutoriteEngagement()
	 * @see #unsetAutoriteEngagement()
	 * @see #setAutoriteEngagement(TypeDictionaryDicoObjectifCiblageAutoriteEngagement)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifCiblage_AutoriteEngagement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='AutoriteEngagement'"
	 * @generated
	 */
	TypeDictionaryDicoObjectifCiblageAutoriteEngagement getAutoriteEngagement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifCiblage#getAutoriteEngagement <em>Autorite Engagement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autorite Engagement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoObjectifCiblageAutoriteEngagement
	 * @see #isSetAutoriteEngagement()
	 * @see #unsetAutoriteEngagement()
	 * @see #getAutoriteEngagement()
	 * @generated
	 */
	void setAutoriteEngagement(TypeDictionaryDicoObjectifCiblageAutoriteEngagement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeObjectifCiblage#getAutoriteEngagement <em>Autorite Engagement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAutoriteEngagement()
	 * @see #getAutoriteEngagement()
	 * @see #setAutoriteEngagement(TypeDictionaryDicoObjectifCiblageAutoriteEngagement)
	 * @generated
	 */
	void unsetAutoriteEngagement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeObjectifCiblage#getAutoriteEngagement <em>Autorite Engagement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Autorite Engagement</em>' attribute is set.
	 * @see #unsetAutoriteEngagement()
	 * @see #getAutoriteEngagement()
	 * @see #setAutoriteEngagement(TypeDictionaryDicoObjectifCiblageAutoriteEngagement)
	 * @generated
	 */
	boolean isSetAutoriteEngagement();

	/**
	 * Returns the value of the '<em><b>Effet Recherche</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoObjectifCiblageEffetRecherche}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effet Recherche</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effet Recherche</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoObjectifCiblageEffetRecherche
	 * @see #isSetEffetRecherche()
	 * @see #unsetEffetRecherche()
	 * @see #setEffetRecherche(TypeDictionaryDicoObjectifCiblageEffetRecherche)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifCiblage_EffetRecherche()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EffetRecherche'"
	 * @generated
	 */
	TypeDictionaryDicoObjectifCiblageEffetRecherche getEffetRecherche();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifCiblage#getEffetRecherche <em>Effet Recherche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effet Recherche</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoObjectifCiblageEffetRecherche
	 * @see #isSetEffetRecherche()
	 * @see #unsetEffetRecherche()
	 * @see #getEffetRecherche()
	 * @generated
	 */
	void setEffetRecherche(TypeDictionaryDicoObjectifCiblageEffetRecherche value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeObjectifCiblage#getEffetRecherche <em>Effet Recherche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEffetRecherche()
	 * @see #getEffetRecherche()
	 * @see #setEffetRecherche(TypeDictionaryDicoObjectifCiblageEffetRecherche)
	 * @generated
	 */
	void unsetEffetRecherche();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeObjectifCiblage#getEffetRecherche <em>Effet Recherche</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Effet Recherche</em>' attribute is set.
	 * @see #unsetEffetRecherche()
	 * @see #getEffetRecherche()
	 * @see #setEffetRecherche(TypeDictionaryDicoObjectifCiblageEffetRecherche)
	 * @generated
	 */
	boolean isSetEffetRecherche();

	/**
	 * Returns the value of the '<em><b>Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nature</em>' attribute.
	 * @see #setNature(String)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifCiblage_Nature()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='Nature'"
	 * @generated
	 */
	String getNature();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifCiblage#getNature <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nature</em>' attribute.
	 * @see #getNature()
	 * @generated
	 */
	void setNature(String value);

	/**
	 * Returns the value of the '<em><b>Echelon Tactique</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEchelonTactiqueObjectif}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Echelon Tactique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Echelon Tactique</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEchelonTactiqueObjectif
	 * @see #isSetEchelonTactique()
	 * @see #unsetEchelonTactique()
	 * @see #setEchelonTactique(TypeDictionaryDicoEchelonTactiqueObjectif)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifCiblage_EchelonTactique()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EchelonTactique'"
	 * @generated
	 */
	TypeDictionaryDicoEchelonTactiqueObjectif getEchelonTactique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifCiblage#getEchelonTactique <em>Echelon Tactique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Echelon Tactique</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEchelonTactiqueObjectif
	 * @see #isSetEchelonTactique()
	 * @see #unsetEchelonTactique()
	 * @see #getEchelonTactique()
	 * @generated
	 */
	void setEchelonTactique(TypeDictionaryDicoEchelonTactiqueObjectif value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeObjectifCiblage#getEchelonTactique <em>Echelon Tactique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEchelonTactique()
	 * @see #getEchelonTactique()
	 * @see #setEchelonTactique(TypeDictionaryDicoEchelonTactiqueObjectif)
	 * @generated
	 */
	void unsetEchelonTactique();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeObjectifCiblage#getEchelonTactique <em>Echelon Tactique</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Echelon Tactique</em>' attribute is set.
	 * @see #unsetEchelonTactique()
	 * @see #getEchelonTactique()
	 * @see #setEchelonTactique(TypeDictionaryDicoEchelonTactiqueObjectif)
	 * @generated
	 */
	boolean isSetEchelonTactique();

	/**
	 * Returns the value of the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volume</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume</em>' attribute.
	 * @see #setVolume(String)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifCiblage_Volume()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='Volume'"
	 * @generated
	 */
	String getVolume();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifCiblage#getVolume <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume</em>' attribute.
	 * @see #getVolume()
	 * @generated
	 */
	void setVolume(String value);

	/**
	 * Returns the value of the '<em><b>Duree Disponibilite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duree Disponibilite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duree Disponibilite</em>' containment reference.
	 * @see #setDureeDisponibilite(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifCiblage_DureeDisponibilite()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DureeDisponibilite'"
	 * @generated
	 */
	TypeDataTypeDuree getDureeDisponibilite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifCiblage#getDureeDisponibilite <em>Duree Disponibilite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duree Disponibilite</em>' containment reference.
	 * @see #getDureeDisponibilite()
	 * @generated
	 */
	void setDureeDisponibilite(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>Dommages Collateraux</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dommages Collateraux</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dommages Collateraux</em>' attribute.
	 * @see #setDommagesCollateraux(String)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifCiblage_DommagesCollateraux()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='DommagesCollateraux'"
	 * @generated
	 */
	String getDommagesCollateraux();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifCiblage#getDommagesCollateraux <em>Dommages Collateraux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dommages Collateraux</em>' attribute.
	 * @see #getDommagesCollateraux()
	 * @generated
	 */
	void setDommagesCollateraux(String value);

	/**
	 * Returns the value of the '<em><b>Commentaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commentaire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commentaire</em>' attribute.
	 * @see #setCommentaire(String)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifCiblage_Commentaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine020"
	 *        extendedMetaData="kind='element' name='Commentaire'"
	 * @generated
	 */
	String getCommentaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifCiblage#getCommentaire <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commentaire</em>' attribute.
	 * @see #getCommentaire()
	 * @generated
	 */
	void setCommentaire(String value);

	/**
	 * Returns the value of the '<em><b>CTE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CTE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CTE</em>' attribute.
	 * @see #setCTE(String)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifCiblage_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifCiblage#getCTE <em>CTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CTE</em>' attribute.
	 * @see #getCTE()
	 * @generated
	 */
	void setCTE(String value);

	/**
	 * Returns the value of the '<em><b>CE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CE</em>' attribute.
	 * @see #setCE(String)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifCiblage_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifCiblage#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Associe Comme Type Objectif Activite Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Type Objectif Activite Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Type Objectif Activite Type</em>' containment reference.
	 * @see #setAssocieCommeTypeObjectifActiviteType(TypeObjectifActiviteType)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifCiblage_AssocieCommeTypeObjectifActiviteType()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ObjectifActiviteType'"
	 *        extendedMetaData="kind='element' name='AssocieCommeType_ObjectifActiviteType'"
	 * @generated
	 */
	TypeObjectifActiviteType getAssocieCommeTypeObjectifActiviteType();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifCiblage#getAssocieCommeTypeObjectifActiviteType <em>Associe Comme Type Objectif Activite Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Type Objectif Activite Type</em>' containment reference.
	 * @see #getAssocieCommeTypeObjectifActiviteType()
	 * @generated
	 */
	void setAssocieCommeTypeObjectifActiviteType(TypeObjectifActiviteType value);

	/**
	 * Returns the value of the '<em><b>AComme Protection Personnel Protection Personnel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Protection Personnel Protection Personnel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Protection Personnel Protection Personnel</em>' containment reference.
	 * @see #setACommeProtectionPersonnelProtectionPersonnel(TypeProtectionPersonnel)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifCiblage_ACommeProtectionPersonnelProtectionPersonnel()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ProtectionPersonnel'"
	 *        extendedMetaData="kind='element' name='ACommeProtectionPersonnel_ProtectionPersonnel'"
	 * @generated
	 */
	TypeProtectionPersonnel getACommeProtectionPersonnelProtectionPersonnel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifCiblage#getACommeProtectionPersonnelProtectionPersonnel <em>AComme Protection Personnel Protection Personnel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Protection Personnel Protection Personnel</em>' containment reference.
	 * @see #getACommeProtectionPersonnelProtectionPersonnel()
	 * @generated
	 */
	void setACommeProtectionPersonnelProtectionPersonnel(TypeProtectionPersonnel value);

	/**
	 * Returns the value of the '<em><b>APour Mobilite Mobilite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Mobilite Mobilite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Mobilite Mobilite</em>' containment reference.
	 * @see #setAPourMobiliteMobilite(TypeMobilite)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifCiblage_APourMobiliteMobilite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Mobilite'"
	 *        extendedMetaData="kind='element' name='APourMobilite_Mobilite'"
	 * @generated
	 */
	TypeMobilite getAPourMobiliteMobilite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifCiblage#getAPourMobiliteMobilite <em>APour Mobilite Mobilite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Mobilite Mobilite</em>' containment reference.
	 * @see #getAPourMobiliteMobilite()
	 * @generated
	 */
	void setAPourMobiliteMobilite(TypeMobilite value);

	/**
	 * Returns the value of the '<em><b>Est Localise Par Association Objectif Ciblage Localisation</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationObjectifCiblageLocalisation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Localise Par Association Objectif Ciblage Localisation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Localise Par Association Objectif Ciblage Localisation</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeObjectifCiblage_EstLocaliseParAssociationObjectifCiblageLocalisation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_AssociationObjectifCiblageLocalisation'"
	 *        extendedMetaData="kind='element' name='EstLocalisePar_AssociationObjectifCiblageLocalisation'"
	 * @generated
	 */
	EList<TypeAssociationObjectifCiblageLocalisation> getEstLocaliseParAssociationObjectifCiblageLocalisation();

	/**
	 * Returns the value of the '<em><b>APour Caracteristiques Objectif Majeur Objectif Majeur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Caracteristiques Objectif Majeur Objectif Majeur</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Caracteristiques Objectif Majeur Objectif Majeur</em>' containment reference.
	 * @see #setAPourCaracteristiquesObjectifMajeurObjectifMajeur(TypeObjectifMajeur)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifCiblage_APourCaracteristiquesObjectifMajeurObjectifMajeur()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ObjectifMajeur'"
	 *        extendedMetaData="kind='element' name='APourCaracteristiquesObjectifMajeur_ObjectifMajeur'"
	 * @generated
	 */
	TypeObjectifMajeur getAPourCaracteristiquesObjectifMajeurObjectifMajeur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifCiblage#getAPourCaracteristiquesObjectifMajeurObjectifMajeur <em>APour Caracteristiques Objectif Majeur Objectif Majeur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Caracteristiques Objectif Majeur Objectif Majeur</em>' containment reference.
	 * @see #getAPourCaracteristiquesObjectifMajeurObjectifMajeur()
	 * @generated
	 */
	void setAPourCaracteristiquesObjectifMajeurObjectifMajeur(TypeObjectifMajeur value);

	/**
	 * Returns the value of the '<em><b>APour Caracteristiques ASS Objectif ASS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Caracteristiques ASS Objectif ASS</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Caracteristiques ASS Objectif ASS</em>' containment reference.
	 * @see #setAPourCaracteristiquesASSObjectifASS(TypeObjectifASS)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifCiblage_APourCaracteristiquesASSObjectifASS()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ObjectifASS'"
	 *        extendedMetaData="kind='element' name='APourCaracteristiquesASS_ObjectifASS'"
	 * @generated
	 */
	TypeObjectifASS getAPourCaracteristiquesASSObjectifASS();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifCiblage#getAPourCaracteristiquesASSObjectifASS <em>APour Caracteristiques ASS Objectif ASS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Caracteristiques ASS Objectif ASS</em>' containment reference.
	 * @see #getAPourCaracteristiquesASSObjectifASS()
	 * @generated
	 */
	void setAPourCaracteristiquesASSObjectifASS(TypeObjectifASS value);

	/**
	 * Returns the value of the '<em><b>APour Caracteristique Alat Objectif Alat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Caracteristique Alat Objectif Alat</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Caracteristique Alat Objectif Alat</em>' containment reference.
	 * @see #setAPourCaracteristiqueAlatObjectifAlat(TypeObjectifAlat)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifCiblage_APourCaracteristiqueAlatObjectifAlat()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ObjectifAlat'"
	 *        extendedMetaData="kind='element' name='APourCaracteristiqueAlat_ObjectifAlat'"
	 * @generated
	 */
	TypeObjectifAlat getAPourCaracteristiqueAlatObjectifAlat();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifCiblage#getAPourCaracteristiqueAlatObjectifAlat <em>APour Caracteristique Alat Objectif Alat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Caracteristique Alat Objectif Alat</em>' containment reference.
	 * @see #getAPourCaracteristiqueAlatObjectifAlat()
	 * @generated
	 */
	void setAPourCaracteristiqueAlatObjectifAlat(TypeObjectifAlat value);

	/**
	 * Returns the value of the '<em><b>APour Createur Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Createur Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Createur Unite</em>' containment reference.
	 * @see #setAPourCreateurUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifCiblage_APourCreateurUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourCreateur_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getAPourCreateurUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifCiblage#getAPourCreateurUnite <em>APour Createur Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Createur Unite</em>' containment reference.
	 * @see #getAPourCreateurUnite()
	 * @generated
	 */
	void setAPourCreateurUnite(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>APour Unite Feux AEngager Reservation Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite Feux AEngager Reservation Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite Feux AEngager Reservation Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeObjectifCiblage_APourUniteFeuxAEngagerReservationUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='Concerne_ObjectifCiblage' target_entity='type_ReservationUnite'"
	 *        extendedMetaData="kind='element' name='APourUniteFeuxAEngager_ReservationUnite'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourUniteFeuxAEngagerReservationUnite();

	/**
	 * Returns the value of the '<em><b>APour Document Associe Association Objectif Ciblage Document</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Document Associe Association Objectif Ciblage Document</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Document Associe Association Objectif Ciblage Document</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeObjectifCiblage_APourDocumentAssocieAssociationObjectifCiblageDocument()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeSujet_ObjectifCiblage' target_entity='type_AssociationObjectifCiblageDocument'"
	 *        extendedMetaData="kind='element' name='APourDocumentAssocie_AssociationObjectifCiblageDocument'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourDocumentAssocieAssociationObjectifCiblageDocument();

	/**
	 * Returns the value of the '<em><b>AComme Autorisation Autorisation Objectif Ciblage</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAutorisationObjectifCiblage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Autorisation Autorisation Objectif Ciblage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Autorisation Autorisation Objectif Ciblage</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeObjectifCiblage_ACommeAutorisationAutorisationObjectifCiblage()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_AutorisationObjectifCiblage'"
	 *        extendedMetaData="kind='element' name='ACommeAutorisation_AutorisationObjectifCiblage'"
	 * @generated
	 */
	EList<TypeAutorisationObjectifCiblage> getACommeAutorisationAutorisationObjectifCiblage();

	/**
	 * Returns the value of the '<em><b>Est Identifie Par Marquage Objectif</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMarquageObjectif}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Identifie Par Marquage Objectif</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Identifie Par Marquage Objectif</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeObjectifCiblage_EstIdentifieParMarquageObjectif()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_MarquageObjectif'"
	 *        extendedMetaData="kind='element' name='EstIdentifiePar_MarquageObjectif'"
	 * @generated
	 */
	EList<TypeMarquageObjectif> getEstIdentifieParMarquageObjectif();

	/**
	 * Returns the value of the '<em><b>Correspond AObjectif Activite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correspond AObjectif Activite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correspond AObjectif Activite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeObjectifCiblage_CorrespondAObjectifActivite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='ACommeObjectifCiblage_ObjectifCiblage' target_entity='type_ObjectifActivite'"
	 *        extendedMetaData="kind='element' name='CorrespondA_ObjectifActivite'"
	 * @generated
	 */
	EList<TypeAssociation> getCorrespondAObjectifActivite();

	/**
	 * Returns the value of the '<em><b>AComme Liste Objectifs Liste Objectifs</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Liste Objectifs Liste Objectifs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Liste Objectifs Liste Objectifs</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeObjectifCiblage_ACommeListeObjectifsListeObjectifs()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='ACommeObjectifCiblage_ObjectifCiblage' target_entity='type_ListeObjectifs'"
	 *        extendedMetaData="kind='element' name='ACommeListeObjectifs_ListeObjectifs'"
	 * @generated
	 */
	EList<TypeAssociation> getACommeListeObjectifsListeObjectifs();

	/**
	 * Returns the value of the '<em><b>Contraint Association Objectif Ciblage Objectif Ciblage</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contraint Association Objectif Ciblage Objectif Ciblage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contraint Association Objectif Ciblage Objectif Ciblage</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeObjectifCiblage_ContraintAssociationObjectifCiblageObjectifCiblage()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjectifSujet_ObjectifCiblage' target_entity='type_AssociationObjectifCiblageObjectifCiblage'"
	 *        extendedMetaData="kind='element' name='Contraint_AssociationObjectifCiblageObjectifCiblage'"
	 * @generated
	 */
	EList<TypeAssociation> getContraintAssociationObjectifCiblageObjectifCiblage();

	/**
	 * Returns the value of the '<em><b>Depend Association Objectif Ciblage Objectif Ciblage</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depend Association Objectif Ciblage Objectif Ciblage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depend Association Objectif Ciblage Objectif Ciblage</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeObjectifCiblage_DependAssociationObjectifCiblageObjectifCiblage()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjectifObjet_ObjectifCiblage' target_entity='type_AssociationObjectifCiblageObjectifCiblage'"
	 *        extendedMetaData="kind='element' name='Depend_AssociationObjectifCiblageObjectifCiblage'"
	 * @generated
	 */
	EList<TypeAssociation> getDependAssociationObjectifCiblageObjectifCiblage();

	/**
	 * Returns the value of the '<em><b>Associe Comme Instance Objet Instance Objet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Instance Objet Instance Objet</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Instance Objet Instance Objet</em>' containment reference.
	 * @see #setAssocieCommeInstanceObjetInstanceObjet(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifCiblage_AssocieCommeInstanceObjetInstanceObjet()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeObjectifCiblage_ObjectifCiblage' target_entity='type_InstanceObjet'"
	 *        extendedMetaData="kind='element' name='AssocieCommeInstanceObjet_InstanceObjet'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeInstanceObjetInstanceObjet();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifCiblage#getAssocieCommeInstanceObjetInstanceObjet <em>Associe Comme Instance Objet Instance Objet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Instance Objet Instance Objet</em>' containment reference.
	 * @see #getAssocieCommeInstanceObjetInstanceObjet()
	 * @generated
	 */
	void setAssocieCommeInstanceObjetInstanceObjet(TypeAssociation value);

} // TypeObjectifCiblage
