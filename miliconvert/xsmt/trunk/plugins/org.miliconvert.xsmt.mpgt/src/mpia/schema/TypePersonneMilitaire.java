/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Personne Militaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypePersonneMilitaire#getDecorations <em>Decorations</em>}</li>
 *   <li>{@link mpia.schema.TypePersonneMilitaire#getSituationMilitaire <em>Situation Militaire</em>}</li>
 *   <li>{@link mpia.schema.TypePersonneMilitaire#getFonction <em>Fonction</em>}</li>
 *   <li>{@link mpia.schema.TypePersonneMilitaire#getArme <em>Arme</em>}</li>
 *   <li>{@link mpia.schema.TypePersonneMilitaire#getArmee <em>Armee</em>}</li>
 *   <li>{@link mpia.schema.TypePersonneMilitaire#getNumeroMatricule <em>Numero Matricule</em>}</li>
 *   <li>{@link mpia.schema.TypePersonneMilitaire#getEstRapporteeParRapport <em>Est Rapportee Par Rapport</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypePersonneMilitaire()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_PersonneMilitaire' kind='elementOnly'"
 * @generated
 */
public interface TypePersonneMilitaire extends EObject {
	/**
	 * Returns the value of the '<em><b>Decorations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decorations</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decorations</em>' attribute.
	 * @see #setDecorations(String)
	 * @see mpia.schema.SchemaPackage#getTypePersonneMilitaire_Decorations()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='Decorations'"
	 * @generated
	 */
	String getDecorations();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePersonneMilitaire#getDecorations <em>Decorations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decorations</em>' attribute.
	 * @see #getDecorations()
	 * @generated
	 */
	void setDecorations(String value);

	/**
	 * Returns the value of the '<em><b>Situation Militaire</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPersonneMilitaireSituationMilitaire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Situation Militaire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Situation Militaire</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPersonneMilitaireSituationMilitaire
	 * @see #isSetSituationMilitaire()
	 * @see #unsetSituationMilitaire()
	 * @see #setSituationMilitaire(TypeDictionaryDicoPersonneMilitaireSituationMilitaire)
	 * @see mpia.schema.SchemaPackage#getTypePersonneMilitaire_SituationMilitaire()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SituationMilitaire'"
	 * @generated
	 */
	TypeDictionaryDicoPersonneMilitaireSituationMilitaire getSituationMilitaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePersonneMilitaire#getSituationMilitaire <em>Situation Militaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Situation Militaire</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPersonneMilitaireSituationMilitaire
	 * @see #isSetSituationMilitaire()
	 * @see #unsetSituationMilitaire()
	 * @see #getSituationMilitaire()
	 * @generated
	 */
	void setSituationMilitaire(TypeDictionaryDicoPersonneMilitaireSituationMilitaire value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePersonneMilitaire#getSituationMilitaire <em>Situation Militaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSituationMilitaire()
	 * @see #getSituationMilitaire()
	 * @see #setSituationMilitaire(TypeDictionaryDicoPersonneMilitaireSituationMilitaire)
	 * @generated
	 */
	void unsetSituationMilitaire();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePersonneMilitaire#getSituationMilitaire <em>Situation Militaire</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Situation Militaire</em>' attribute is set.
	 * @see #unsetSituationMilitaire()
	 * @see #getSituationMilitaire()
	 * @see #setSituationMilitaire(TypeDictionaryDicoPersonneMilitaireSituationMilitaire)
	 * @generated
	 */
	boolean isSetSituationMilitaire();

	/**
	 * Returns the value of the '<em><b>Fonction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fonction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fonction</em>' attribute.
	 * @see #setFonction(String)
	 * @see mpia.schema.SchemaPackage#getTypePersonneMilitaire_Fonction()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='Fonction'"
	 * @generated
	 */
	String getFonction();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePersonneMilitaire#getFonction <em>Fonction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fonction</em>' attribute.
	 * @see #getFonction()
	 * @generated
	 */
	void setFonction(String value);

	/**
	 * Returns the value of the '<em><b>Arme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arme</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arme</em>' attribute.
	 * @see #setArme(String)
	 * @see mpia.schema.SchemaPackage#getTypePersonneMilitaire_Arme()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='Arme'"
	 * @generated
	 */
	String getArme();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePersonneMilitaire#getArme <em>Arme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arme</em>' attribute.
	 * @see #getArme()
	 * @generated
	 */
	void setArme(String value);

	/**
	 * Returns the value of the '<em><b>Armee</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoArmee}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Armee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Armee</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoArmee
	 * @see #isSetArmee()
	 * @see #unsetArmee()
	 * @see #setArmee(TypeDictionaryDicoArmee)
	 * @see mpia.schema.SchemaPackage#getTypePersonneMilitaire_Armee()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Armee'"
	 * @generated
	 */
	TypeDictionaryDicoArmee getArmee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePersonneMilitaire#getArmee <em>Armee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Armee</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoArmee
	 * @see #isSetArmee()
	 * @see #unsetArmee()
	 * @see #getArmee()
	 * @generated
	 */
	void setArmee(TypeDictionaryDicoArmee value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePersonneMilitaire#getArmee <em>Armee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArmee()
	 * @see #getArmee()
	 * @see #setArmee(TypeDictionaryDicoArmee)
	 * @generated
	 */
	void unsetArmee();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePersonneMilitaire#getArmee <em>Armee</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Armee</em>' attribute is set.
	 * @see #unsetArmee()
	 * @see #getArmee()
	 * @see #setArmee(TypeDictionaryDicoArmee)
	 * @generated
	 */
	boolean isSetArmee();

	/**
	 * Returns the value of the '<em><b>Numero Matricule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Matricule</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Matricule</em>' attribute.
	 * @see #setNumeroMatricule(String)
	 * @see mpia.schema.SchemaPackage#getTypePersonneMilitaire_NumeroMatricule()
	 * @model dataType="mpia.meta.TypeDataTypeChaine020"
	 *        extendedMetaData="kind='element' name='NumeroMatricule'"
	 * @generated
	 */
	String getNumeroMatricule();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePersonneMilitaire#getNumeroMatricule <em>Numero Matricule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Matricule</em>' attribute.
	 * @see #getNumeroMatricule()
	 * @generated
	 */
	void setNumeroMatricule(String value);

	/**
	 * Returns the value of the '<em><b>Est Rapportee Par Rapport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Rapportee Par Rapport</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Rapportee Par Rapport</em>' containment reference.
	 * @see #setEstRapporteeParRapport(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypePersonneMilitaire_EstRapporteeParRapport()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Rapport'"
	 *        extendedMetaData="kind='element' name='EstRapporteePar_Rapport'"
	 * @generated
	 */
	TypeAssociation getEstRapporteeParRapport();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePersonneMilitaire#getEstRapporteeParRapport <em>Est Rapportee Par Rapport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Rapportee Par Rapport</em>' containment reference.
	 * @see #getEstRapporteeParRapport()
	 * @generated
	 */
	void setEstRapporteeParRapport(TypeAssociation value);

} // TypePersonneMilitaire
