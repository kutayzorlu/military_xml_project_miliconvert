/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeDateHeure;
import mpia.meta.TypeDataTypeLongueur;
import mpia.meta.TypeDataTypeMasse;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Etat Civil</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEtatCivil#getDateNaissance <em>Date Naissance</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatCivil#getGroupeSanguin <em>Groupe Sanguin</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatCivil#getLieuNaissance <em>Lieu Naissance</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatCivil#getPatronyme <em>Patronyme</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatCivil#getPoids <em>Poids</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatCivil#getCouleurCheveux <em>Couleur Cheveux</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatCivil#getDateDeces <em>Date Deces</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatCivil#getSituationFamille <em>Situation Famille</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatCivil#getCouleurYeux <em>Couleur Yeux</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatCivil#getNombreEnfants <em>Nombre Enfants</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatCivil#getTaille <em>Taille</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEtatCivil()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_EtatCivil' kind='elementOnly'"
 * @generated
 */
public interface TypeEtatCivil extends EObject {
	/**
	 * Returns the value of the '<em><b>Date Naissance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Naissance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Naissance</em>' containment reference.
	 * @see #setDateNaissance(TypeDataTypeDateHeure)
	 * @see mpia.schema.SchemaPackage#getTypeEtatCivil_DateNaissance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DateNaissance'"
	 * @generated
	 */
	TypeDataTypeDateHeure getDateNaissance();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatCivil#getDateNaissance <em>Date Naissance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Naissance</em>' containment reference.
	 * @see #getDateNaissance()
	 * @generated
	 */
	void setDateNaissance(TypeDataTypeDateHeure value);

	/**
	 * Returns the value of the '<em><b>Groupe Sanguin</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatCivilGroupeSanguin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groupe Sanguin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groupe Sanguin</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatCivilGroupeSanguin
	 * @see #isSetGroupeSanguin()
	 * @see #unsetGroupeSanguin()
	 * @see #setGroupeSanguin(TypeDictionaryDicoEtatCivilGroupeSanguin)
	 * @see mpia.schema.SchemaPackage#getTypeEtatCivil_GroupeSanguin()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='GroupeSanguin'"
	 * @generated
	 */
	TypeDictionaryDicoEtatCivilGroupeSanguin getGroupeSanguin();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatCivil#getGroupeSanguin <em>Groupe Sanguin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Groupe Sanguin</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatCivilGroupeSanguin
	 * @see #isSetGroupeSanguin()
	 * @see #unsetGroupeSanguin()
	 * @see #getGroupeSanguin()
	 * @generated
	 */
	void setGroupeSanguin(TypeDictionaryDicoEtatCivilGroupeSanguin value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatCivil#getGroupeSanguin <em>Groupe Sanguin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGroupeSanguin()
	 * @see #getGroupeSanguin()
	 * @see #setGroupeSanguin(TypeDictionaryDicoEtatCivilGroupeSanguin)
	 * @generated
	 */
	void unsetGroupeSanguin();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatCivil#getGroupeSanguin <em>Groupe Sanguin</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Groupe Sanguin</em>' attribute is set.
	 * @see #unsetGroupeSanguin()
	 * @see #getGroupeSanguin()
	 * @see #setGroupeSanguin(TypeDictionaryDicoEtatCivilGroupeSanguin)
	 * @generated
	 */
	boolean isSetGroupeSanguin();

	/**
	 * Returns the value of the '<em><b>Lieu Naissance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lieu Naissance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lieu Naissance</em>' attribute.
	 * @see #setLieuNaissance(String)
	 * @see mpia.schema.SchemaPackage#getTypeEtatCivil_LieuNaissance()
	 * @model dataType="mpia.meta.TypeDataTypeChaine050"
	 *        extendedMetaData="kind='element' name='LieuNaissance'"
	 * @generated
	 */
	String getLieuNaissance();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatCivil#getLieuNaissance <em>Lieu Naissance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lieu Naissance</em>' attribute.
	 * @see #getLieuNaissance()
	 * @generated
	 */
	void setLieuNaissance(String value);

	/**
	 * Returns the value of the '<em><b>Patronyme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patronyme</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patronyme</em>' attribute.
	 * @see #setPatronyme(String)
	 * @see mpia.schema.SchemaPackage#getTypeEtatCivil_Patronyme()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='Patronyme'"
	 * @generated
	 */
	String getPatronyme();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatCivil#getPatronyme <em>Patronyme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patronyme</em>' attribute.
	 * @see #getPatronyme()
	 * @generated
	 */
	void setPatronyme(String value);

	/**
	 * Returns the value of the '<em><b>Poids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Poids</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poids</em>' containment reference.
	 * @see #setPoids(TypeDataTypeMasse)
	 * @see mpia.schema.SchemaPackage#getTypeEtatCivil_Poids()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Poids'"
	 * @generated
	 */
	TypeDataTypeMasse getPoids();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatCivil#getPoids <em>Poids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Poids</em>' containment reference.
	 * @see #getPoids()
	 * @generated
	 */
	void setPoids(TypeDataTypeMasse value);

	/**
	 * Returns the value of the '<em><b>Couleur Cheveux</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Couleur Cheveux</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Couleur Cheveux</em>' attribute.
	 * @see #setCouleurCheveux(String)
	 * @see mpia.schema.SchemaPackage#getTypeEtatCivil_CouleurCheveux()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='CouleurCheveux'"
	 * @generated
	 */
	String getCouleurCheveux();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatCivil#getCouleurCheveux <em>Couleur Cheveux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Couleur Cheveux</em>' attribute.
	 * @see #getCouleurCheveux()
	 * @generated
	 */
	void setCouleurCheveux(String value);

	/**
	 * Returns the value of the '<em><b>Date Deces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Deces</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Deces</em>' containment reference.
	 * @see #setDateDeces(TypeDataTypeDateHeure)
	 * @see mpia.schema.SchemaPackage#getTypeEtatCivil_DateDeces()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DateDeces'"
	 * @generated
	 */
	TypeDataTypeDateHeure getDateDeces();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatCivil#getDateDeces <em>Date Deces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Deces</em>' containment reference.
	 * @see #getDateDeces()
	 * @generated
	 */
	void setDateDeces(TypeDataTypeDateHeure value);

	/**
	 * Returns the value of the '<em><b>Situation Famille</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatCivilSituationFamille}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Situation Famille</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Situation Famille</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatCivilSituationFamille
	 * @see #isSetSituationFamille()
	 * @see #unsetSituationFamille()
	 * @see #setSituationFamille(TypeDictionaryDicoEtatCivilSituationFamille)
	 * @see mpia.schema.SchemaPackage#getTypeEtatCivil_SituationFamille()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SituationFamille'"
	 * @generated
	 */
	TypeDictionaryDicoEtatCivilSituationFamille getSituationFamille();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatCivil#getSituationFamille <em>Situation Famille</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Situation Famille</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatCivilSituationFamille
	 * @see #isSetSituationFamille()
	 * @see #unsetSituationFamille()
	 * @see #getSituationFamille()
	 * @generated
	 */
	void setSituationFamille(TypeDictionaryDicoEtatCivilSituationFamille value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatCivil#getSituationFamille <em>Situation Famille</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSituationFamille()
	 * @see #getSituationFamille()
	 * @see #setSituationFamille(TypeDictionaryDicoEtatCivilSituationFamille)
	 * @generated
	 */
	void unsetSituationFamille();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatCivil#getSituationFamille <em>Situation Famille</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Situation Famille</em>' attribute is set.
	 * @see #unsetSituationFamille()
	 * @see #getSituationFamille()
	 * @see #setSituationFamille(TypeDictionaryDicoEtatCivilSituationFamille)
	 * @generated
	 */
	boolean isSetSituationFamille();

	/**
	 * Returns the value of the '<em><b>Couleur Yeux</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Couleur Yeux</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Couleur Yeux</em>' attribute.
	 * @see #setCouleurYeux(String)
	 * @see mpia.schema.SchemaPackage#getTypeEtatCivil_CouleurYeux()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='CouleurYeux'"
	 * @generated
	 */
	String getCouleurYeux();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatCivil#getCouleurYeux <em>Couleur Yeux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Couleur Yeux</em>' attribute.
	 * @see #getCouleurYeux()
	 * @generated
	 */
	void setCouleurYeux(String value);

	/**
	 * Returns the value of the '<em><b>Nombre Enfants</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Enfants</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Enfants</em>' attribute.
	 * @see #setNombreEnfants(String)
	 * @see mpia.schema.SchemaPackage#getTypeEtatCivil_NombreEnfants()
	 * @model dataType="mpia.meta.TypeDataTypeChaine03"
	 *        extendedMetaData="kind='element' name='NombreEnfants'"
	 * @generated
	 */
	String getNombreEnfants();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatCivil#getNombreEnfants <em>Nombre Enfants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Enfants</em>' attribute.
	 * @see #getNombreEnfants()
	 * @generated
	 */
	void setNombreEnfants(String value);

	/**
	 * Returns the value of the '<em><b>Taille</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Taille</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taille</em>' containment reference.
	 * @see #setTaille(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeEtatCivil_Taille()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Taille'"
	 * @generated
	 */
	TypeDataTypeLongueur getTaille();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatCivil#getTaille <em>Taille</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taille</em>' containment reference.
	 * @see #getTaille()
	 * @generated
	 */
	void setTaille(TypeDataTypeLongueur value);

} // TypeEtatCivil
