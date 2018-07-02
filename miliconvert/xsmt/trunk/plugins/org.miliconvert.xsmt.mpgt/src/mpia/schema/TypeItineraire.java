/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeDuree;
import mpia.meta.TypeDataTypeVitesseLineaire;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Itineraire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeItineraire#getClasseMilitaire <em>Classe Militaire</em>}</li>
 *   <li>{@link mpia.schema.TypeItineraire#getPraticabilite <em>Praticabilite</em>}</li>
 *   <li>{@link mpia.schema.TypeItineraire#getMoyenTransport <em>Moyen Transport</em>}</li>
 *   <li>{@link mpia.schema.TypeItineraire#getMobilite <em>Mobilite</em>}</li>
 *   <li>{@link mpia.schema.TypeItineraire#getCouleur <em>Couleur</em>}</li>
 *   <li>{@link mpia.schema.TypeItineraire#getSensTrafic <em>Sens Trafic</em>}</li>
 *   <li>{@link mpia.schema.TypeItineraire#getVitesse <em>Vitesse</em>}</li>
 *   <li>{@link mpia.schema.TypeItineraire#getDuree <em>Duree</em>}</li>
 *   <li>{@link mpia.schema.TypeItineraire#getComplementCaracteristique <em>Complement Caracteristique</em>}</li>
 *   <li>{@link mpia.schema.TypeItineraire#getAPourCaracteristiqueAxeAxe <em>APour Caracteristique Axe Axe</em>}</li>
 *   <li>{@link mpia.schema.TypeItineraire#getAPourPointParticulierPointParticulierItineraire <em>APour Point Particulier Point Particulier Itineraire</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeItineraire()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_Itineraire' kind='elementOnly'"
 * @generated
 */
public interface TypeItineraire extends TypeElementControle {
	/**
	 * Returns the value of the '<em><b>Classe Militaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classe Militaire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classe Militaire</em>' attribute.
	 * @see #isSetClasseMilitaire()
	 * @see #unsetClasseMilitaire()
	 * @see #setClasseMilitaire(long)
	 * @see mpia.schema.SchemaPackage#getTypeItineraire_ClasseMilitaire()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='ClasseMilitaire'"
	 * @generated
	 */
	long getClasseMilitaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeItineraire#getClasseMilitaire <em>Classe Militaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classe Militaire</em>' attribute.
	 * @see #isSetClasseMilitaire()
	 * @see #unsetClasseMilitaire()
	 * @see #getClasseMilitaire()
	 * @generated
	 */
	void setClasseMilitaire(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeItineraire#getClasseMilitaire <em>Classe Militaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClasseMilitaire()
	 * @see #getClasseMilitaire()
	 * @see #setClasseMilitaire(long)
	 * @generated
	 */
	void unsetClasseMilitaire();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeItineraire#getClasseMilitaire <em>Classe Militaire</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Classe Militaire</em>' attribute is set.
	 * @see #unsetClasseMilitaire()
	 * @see #getClasseMilitaire()
	 * @see #setClasseMilitaire(long)
	 * @generated
	 */
	boolean isSetClasseMilitaire();

	/**
	 * Returns the value of the '<em><b>Praticabilite</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoItinerairePraticabilite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Praticabilite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Praticabilite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoItinerairePraticabilite
	 * @see #isSetPraticabilite()
	 * @see #unsetPraticabilite()
	 * @see #setPraticabilite(TypeDictionaryDicoItinerairePraticabilite)
	 * @see mpia.schema.SchemaPackage#getTypeItineraire_Praticabilite()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Praticabilite'"
	 * @generated
	 */
	TypeDictionaryDicoItinerairePraticabilite getPraticabilite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeItineraire#getPraticabilite <em>Praticabilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Praticabilite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoItinerairePraticabilite
	 * @see #isSetPraticabilite()
	 * @see #unsetPraticabilite()
	 * @see #getPraticabilite()
	 * @generated
	 */
	void setPraticabilite(TypeDictionaryDicoItinerairePraticabilite value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeItineraire#getPraticabilite <em>Praticabilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPraticabilite()
	 * @see #getPraticabilite()
	 * @see #setPraticabilite(TypeDictionaryDicoItinerairePraticabilite)
	 * @generated
	 */
	void unsetPraticabilite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeItineraire#getPraticabilite <em>Praticabilite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Praticabilite</em>' attribute is set.
	 * @see #unsetPraticabilite()
	 * @see #getPraticabilite()
	 * @see #setPraticabilite(TypeDictionaryDicoItinerairePraticabilite)
	 * @generated
	 */
	boolean isSetPraticabilite();

	/**
	 * Returns the value of the '<em><b>Moyen Transport</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMoyenTransport}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moyen Transport</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moyen Transport</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMoyenTransport
	 * @see #isSetMoyenTransport()
	 * @see #unsetMoyenTransport()
	 * @see #setMoyenTransport(TypeDictionaryDicoMoyenTransport)
	 * @see mpia.schema.SchemaPackage#getTypeItineraire_MoyenTransport()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='MoyenTransport'"
	 * @generated
	 */
	TypeDictionaryDicoMoyenTransport getMoyenTransport();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeItineraire#getMoyenTransport <em>Moyen Transport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moyen Transport</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMoyenTransport
	 * @see #isSetMoyenTransport()
	 * @see #unsetMoyenTransport()
	 * @see #getMoyenTransport()
	 * @generated
	 */
	void setMoyenTransport(TypeDictionaryDicoMoyenTransport value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeItineraire#getMoyenTransport <em>Moyen Transport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMoyenTransport()
	 * @see #getMoyenTransport()
	 * @see #setMoyenTransport(TypeDictionaryDicoMoyenTransport)
	 * @generated
	 */
	void unsetMoyenTransport();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeItineraire#getMoyenTransport <em>Moyen Transport</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Moyen Transport</em>' attribute is set.
	 * @see #unsetMoyenTransport()
	 * @see #getMoyenTransport()
	 * @see #setMoyenTransport(TypeDictionaryDicoMoyenTransport)
	 * @generated
	 */
	boolean isSetMoyenTransport();

	/**
	 * Returns the value of the '<em><b>Mobilite</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMobilite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mobilite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mobilite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMobilite
	 * @see #isSetMobilite()
	 * @see #unsetMobilite()
	 * @see #setMobilite(TypeDictionaryDicoMobilite)
	 * @see mpia.schema.SchemaPackage#getTypeItineraire_Mobilite()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Mobilite'"
	 * @generated
	 */
	TypeDictionaryDicoMobilite getMobilite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeItineraire#getMobilite <em>Mobilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mobilite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMobilite
	 * @see #isSetMobilite()
	 * @see #unsetMobilite()
	 * @see #getMobilite()
	 * @generated
	 */
	void setMobilite(TypeDictionaryDicoMobilite value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeItineraire#getMobilite <em>Mobilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMobilite()
	 * @see #getMobilite()
	 * @see #setMobilite(TypeDictionaryDicoMobilite)
	 * @generated
	 */
	void unsetMobilite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeItineraire#getMobilite <em>Mobilite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mobilite</em>' attribute is set.
	 * @see #unsetMobilite()
	 * @see #getMobilite()
	 * @see #setMobilite(TypeDictionaryDicoMobilite)
	 * @generated
	 */
	boolean isSetMobilite();

	/**
	 * Returns the value of the '<em><b>Couleur</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoItineraireCouleur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Couleur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Couleur</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoItineraireCouleur
	 * @see #isSetCouleur()
	 * @see #unsetCouleur()
	 * @see #setCouleur(TypeDictionaryDicoItineraireCouleur)
	 * @see mpia.schema.SchemaPackage#getTypeItineraire_Couleur()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Couleur'"
	 * @generated
	 */
	TypeDictionaryDicoItineraireCouleur getCouleur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeItineraire#getCouleur <em>Couleur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Couleur</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoItineraireCouleur
	 * @see #isSetCouleur()
	 * @see #unsetCouleur()
	 * @see #getCouleur()
	 * @generated
	 */
	void setCouleur(TypeDictionaryDicoItineraireCouleur value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeItineraire#getCouleur <em>Couleur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCouleur()
	 * @see #getCouleur()
	 * @see #setCouleur(TypeDictionaryDicoItineraireCouleur)
	 * @generated
	 */
	void unsetCouleur();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeItineraire#getCouleur <em>Couleur</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Couleur</em>' attribute is set.
	 * @see #unsetCouleur()
	 * @see #getCouleur()
	 * @see #setCouleur(TypeDictionaryDicoItineraireCouleur)
	 * @generated
	 */
	boolean isSetCouleur();

	/**
	 * Returns the value of the '<em><b>Sens Trafic</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoSensTrafic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sens Trafic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sens Trafic</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoSensTrafic
	 * @see #isSetSensTrafic()
	 * @see #unsetSensTrafic()
	 * @see #setSensTrafic(TypeDictionaryDicoSensTrafic)
	 * @see mpia.schema.SchemaPackage#getTypeItineraire_SensTrafic()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SensTrafic'"
	 * @generated
	 */
	TypeDictionaryDicoSensTrafic getSensTrafic();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeItineraire#getSensTrafic <em>Sens Trafic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sens Trafic</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoSensTrafic
	 * @see #isSetSensTrafic()
	 * @see #unsetSensTrafic()
	 * @see #getSensTrafic()
	 * @generated
	 */
	void setSensTrafic(TypeDictionaryDicoSensTrafic value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeItineraire#getSensTrafic <em>Sens Trafic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSensTrafic()
	 * @see #getSensTrafic()
	 * @see #setSensTrafic(TypeDictionaryDicoSensTrafic)
	 * @generated
	 */
	void unsetSensTrafic();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeItineraire#getSensTrafic <em>Sens Trafic</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sens Trafic</em>' attribute is set.
	 * @see #unsetSensTrafic()
	 * @see #getSensTrafic()
	 * @see #setSensTrafic(TypeDictionaryDicoSensTrafic)
	 * @generated
	 */
	boolean isSetSensTrafic();

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
	 * @see mpia.schema.SchemaPackage#getTypeItineraire_Vitesse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Vitesse'"
	 * @generated
	 */
	TypeDataTypeVitesseLineaire getVitesse();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeItineraire#getVitesse <em>Vitesse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vitesse</em>' containment reference.
	 * @see #getVitesse()
	 * @generated
	 */
	void setVitesse(TypeDataTypeVitesseLineaire value);

	/**
	 * Returns the value of the '<em><b>Duree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duree</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duree</em>' containment reference.
	 * @see #setDuree(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeItineraire_Duree()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Duree'"
	 * @generated
	 */
	TypeDataTypeDuree getDuree();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeItineraire#getDuree <em>Duree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duree</em>' containment reference.
	 * @see #getDuree()
	 * @generated
	 */
	void setDuree(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>Complement Caracteristique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complement Caracteristique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complement Caracteristique</em>' attribute.
	 * @see #setComplementCaracteristique(String)
	 * @see mpia.schema.SchemaPackage#getTypeItineraire_ComplementCaracteristique()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='ComplementCaracteristique'"
	 * @generated
	 */
	String getComplementCaracteristique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeItineraire#getComplementCaracteristique <em>Complement Caracteristique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complement Caracteristique</em>' attribute.
	 * @see #getComplementCaracteristique()
	 * @generated
	 */
	void setComplementCaracteristique(String value);

	/**
	 * Returns the value of the '<em><b>APour Caracteristique Axe Axe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Caracteristique Axe Axe</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Caracteristique Axe Axe</em>' containment reference.
	 * @see #setAPourCaracteristiqueAxeAxe(TypeAxe)
	 * @see mpia.schema.SchemaPackage#getTypeItineraire_APourCaracteristiqueAxeAxe()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Axe'"
	 *        extendedMetaData="kind='element' name='APourCaracteristiqueAxe_Axe'"
	 * @generated
	 */
	TypeAxe getAPourCaracteristiqueAxeAxe();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeItineraire#getAPourCaracteristiqueAxeAxe <em>APour Caracteristique Axe Axe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Caracteristique Axe Axe</em>' containment reference.
	 * @see #getAPourCaracteristiqueAxeAxe()
	 * @generated
	 */
	void setAPourCaracteristiqueAxeAxe(TypeAxe value);

	/**
	 * Returns the value of the '<em><b>APour Point Particulier Point Particulier Itineraire</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePointParticulierItineraire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Point Particulier Point Particulier Itineraire</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Point Particulier Point Particulier Itineraire</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeItineraire_APourPointParticulierPointParticulierItineraire()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_PointParticulierItineraire'"
	 *        extendedMetaData="kind='element' name='APourPointParticulier_PointParticulierItineraire'"
	 * @generated
	 */
	EList<TypePointParticulierItineraire> getAPourPointParticulierPointParticulierItineraire();

} // TypeItineraire
