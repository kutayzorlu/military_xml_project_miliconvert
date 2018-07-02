/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Personne</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypePersonne#getPrenoms <em>Prenoms</em>}</li>
 *   <li>{@link mpia.schema.TypePersonne#getNationalite <em>Nationalite</em>}</li>
 *   <li>{@link mpia.schema.TypePersonne#isPreferenceReligieuse <em>Preference Religieuse</em>}</li>
 *   <li>{@link mpia.schema.TypePersonne#getAPourEtatCivilEtatCivil <em>APour Etat Civil Etat Civil</em>}</li>
 *   <li>{@link mpia.schema.TypePersonne#getAPourCaracteristiqueMilitairePersonneMilitaire <em>APour Caracteristique Militaire Personne Militaire</em>}</li>
 *   <li>{@link mpia.schema.TypePersonne#getAPourTypeAssociationPersonneTypePersonne <em>APour Type Association Personne Type Personne</em>}</li>
 *   <li>{@link mpia.schema.TypePersonne#getAPourCompetenceLinguistiqueCompetenceLinguistique <em>APour Competence Linguistique Competence Linguistique</em>}</li>
 *   <li>{@link mpia.schema.TypePersonne#getAOccupeFonctionFonctionPersonne <em>AOccupe Fonction Fonction Personne</em>}</li>
 *   <li>{@link mpia.schema.TypePersonne#getAExerceEmploisEmploi <em>AExerce Emplois Emploi</em>}</li>
 *   <li>{@link mpia.schema.TypePersonne#getAPourSpecialiteSpecialitePersonne <em>APour Specialite Specialite Personne</em>}</li>
 *   <li>{@link mpia.schema.TypePersonne#getEstDecriteParDescriptionPersonne <em>Est Decrite Par Description Personne</em>}</li>
 *   <li>{@link mpia.schema.TypePersonne#getEstIdentifieParDocumentIdentificationPersonne <em>Est Identifie Par Document Identification Personne</em>}</li>
 *   <li>{@link mpia.schema.TypePersonne#getAPourEtatEtatOperationnelPersonnel <em>APour Etat Etat Operationnel Personnel</em>}</li>
 *   <li>{@link mpia.schema.TypePersonne#getAPourSuiviMedicalSuiviMedical <em>APour Suivi Medical Suivi Medical</em>}</li>
 *   <li>{@link mpia.schema.TypePersonne#getSEstDeplaceSelonDeplacementPersonne <em>SEst Deplace Selon Deplacement Personne</em>}</li>
 *   <li>{@link mpia.schema.TypePersonne#getEstObjetAssociationPersonnePersonne <em>Est Objet Association Personne Personne</em>}</li>
 *   <li>{@link mpia.schema.TypePersonne#getEstSujetAssociationPersonnePersonne <em>Est Sujet Association Personne Personne</em>}</li>
 *   <li>{@link mpia.schema.TypePersonne#getEstObjetAssociationEntiteOrgPersonne <em>Est Objet Association Entite Org Personne</em>}</li>
 *   <li>{@link mpia.schema.TypePersonne#getEstSujetAssociationPersonneEltCtrl <em>Est Sujet Association Personne Elt Ctrl</em>}</li>
 *   <li>{@link mpia.schema.TypePersonne#getEstSujetAssociationPersonneEltTopo <em>Est Sujet Association Personne Elt Topo</em>}</li>
 *   <li>{@link mpia.schema.TypePersonne#getEstSujetAssociationPersonneMissionAir <em>Est Sujet Association Personne Mission Air</em>}</li>
 *   <li>{@link mpia.schema.TypePersonne#getEstSujetAssociationPersonnePlanifOperation3D <em>Est Sujet Association Personne Planif Operation3 D</em>}</li>
 *   <li>{@link mpia.schema.TypePersonne#getEstAssocieeAActivite <em>Est Associee AActivite</em>}</li>
 *   <li>{@link mpia.schema.TypePersonne#getEstSujetAssociationPersonneEvenement <em>Est Sujet Association Personne Evenement</em>}</li>
 *   <li>{@link mpia.schema.TypePersonne#getEstObjetAssociationMaterielPersonne <em>Est Objet Association Materiel Personne</em>}</li>
 *   <li>{@link mpia.schema.TypePersonne#getEstSujetAssociationPersonneMateriel <em>Est Sujet Association Personne Materiel</em>}</li>
 *   <li>{@link mpia.schema.TypePersonne#getEstSujetAssociationPersonneSite <em>Est Sujet Association Personne Site</em>}</li>
 *   <li>{@link mpia.schema.TypePersonne#getEstSujetAssociationPersonneObjetInconnu <em>Est Sujet Association Personne Objet Inconnu</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypePersonne()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_Personne' kind='elementOnly'"
 * @generated
 */
public interface TypePersonne extends TypeInstanceObjet {
	/**
	 * Returns the value of the '<em><b>Prenoms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prenoms</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prenoms</em>' attribute.
	 * @see #setPrenoms(String)
	 * @see mpia.schema.SchemaPackage#getTypePersonne_Prenoms()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='Prenoms'"
	 * @generated
	 */
	String getPrenoms();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePersonne#getPrenoms <em>Prenoms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prenoms</em>' attribute.
	 * @see #getPrenoms()
	 * @generated
	 */
	void setPrenoms(String value);

	/**
	 * Returns the value of the '<em><b>Nationalite</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEntitePolitiqueTrigramme}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nationalite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nationalite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEntitePolitiqueTrigramme
	 * @see #isSetNationalite()
	 * @see #unsetNationalite()
	 * @see #setNationalite(TypeDictionaryDicoEntitePolitiqueTrigramme)
	 * @see mpia.schema.SchemaPackage#getTypePersonne_Nationalite()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Nationalite'"
	 * @generated
	 */
	TypeDictionaryDicoEntitePolitiqueTrigramme getNationalite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePersonne#getNationalite <em>Nationalite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nationalite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEntitePolitiqueTrigramme
	 * @see #isSetNationalite()
	 * @see #unsetNationalite()
	 * @see #getNationalite()
	 * @generated
	 */
	void setNationalite(TypeDictionaryDicoEntitePolitiqueTrigramme value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePersonne#getNationalite <em>Nationalite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNationalite()
	 * @see #getNationalite()
	 * @see #setNationalite(TypeDictionaryDicoEntitePolitiqueTrigramme)
	 * @generated
	 */
	void unsetNationalite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePersonne#getNationalite <em>Nationalite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nationalite</em>' attribute is set.
	 * @see #unsetNationalite()
	 * @see #getNationalite()
	 * @see #setNationalite(TypeDictionaryDicoEntitePolitiqueTrigramme)
	 * @generated
	 */
	boolean isSetNationalite();

	/**
	 * Returns the value of the '<em><b>Preference Religieuse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preference Religieuse</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preference Religieuse</em>' attribute.
	 * @see #isSetPreferenceReligieuse()
	 * @see #unsetPreferenceReligieuse()
	 * @see #setPreferenceReligieuse(boolean)
	 * @see mpia.schema.SchemaPackage#getTypePersonne_PreferenceReligieuse()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='PreferenceReligieuse'"
	 * @generated
	 */
	boolean isPreferenceReligieuse();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePersonne#isPreferenceReligieuse <em>Preference Religieuse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preference Religieuse</em>' attribute.
	 * @see #isSetPreferenceReligieuse()
	 * @see #unsetPreferenceReligieuse()
	 * @see #isPreferenceReligieuse()
	 * @generated
	 */
	void setPreferenceReligieuse(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePersonne#isPreferenceReligieuse <em>Preference Religieuse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPreferenceReligieuse()
	 * @see #isPreferenceReligieuse()
	 * @see #setPreferenceReligieuse(boolean)
	 * @generated
	 */
	void unsetPreferenceReligieuse();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePersonne#isPreferenceReligieuse <em>Preference Religieuse</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Preference Religieuse</em>' attribute is set.
	 * @see #unsetPreferenceReligieuse()
	 * @see #isPreferenceReligieuse()
	 * @see #setPreferenceReligieuse(boolean)
	 * @generated
	 */
	boolean isSetPreferenceReligieuse();

	/**
	 * Returns the value of the '<em><b>APour Etat Civil Etat Civil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Etat Civil Etat Civil</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Etat Civil Etat Civil</em>' containment reference.
	 * @see #setAPourEtatCivilEtatCivil(TypeEtatCivil)
	 * @see mpia.schema.SchemaPackage#getTypePersonne_APourEtatCivilEtatCivil()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EtatCivil'"
	 *        extendedMetaData="kind='element' name='APourEtatCivil_EtatCivil'"
	 * @generated
	 */
	TypeEtatCivil getAPourEtatCivilEtatCivil();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePersonne#getAPourEtatCivilEtatCivil <em>APour Etat Civil Etat Civil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Etat Civil Etat Civil</em>' containment reference.
	 * @see #getAPourEtatCivilEtatCivil()
	 * @generated
	 */
	void setAPourEtatCivilEtatCivil(TypeEtatCivil value);

	/**
	 * Returns the value of the '<em><b>APour Caracteristique Militaire Personne Militaire</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Caracteristique Militaire Personne Militaire</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Caracteristique Militaire Personne Militaire</em>' containment reference.
	 * @see #setAPourCaracteristiqueMilitairePersonneMilitaire(TypePersonneMilitaire)
	 * @see mpia.schema.SchemaPackage#getTypePersonne_APourCaracteristiqueMilitairePersonneMilitaire()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_PersonneMilitaire'"
	 *        extendedMetaData="kind='element' name='APourCaracteristiqueMilitaire_PersonneMilitaire'"
	 * @generated
	 */
	TypePersonneMilitaire getAPourCaracteristiqueMilitairePersonneMilitaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePersonne#getAPourCaracteristiqueMilitairePersonneMilitaire <em>APour Caracteristique Militaire Personne Militaire</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Caracteristique Militaire Personne Militaire</em>' containment reference.
	 * @see #getAPourCaracteristiqueMilitairePersonneMilitaire()
	 * @generated
	 */
	void setAPourCaracteristiqueMilitairePersonneMilitaire(TypePersonneMilitaire value);

	/**
	 * Returns the value of the '<em><b>APour Type Association Personne Type Personne</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Type Association Personne Type Personne</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Type Association Personne Type Personne</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePersonne_APourTypeAssociationPersonneTypePersonne()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeObjet_Personne' target_entity='type_AssociationPersonneTypePersonne'"
	 *        extendedMetaData="kind='element' name='APourType_AssociationPersonneTypePersonne'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourTypeAssociationPersonneTypePersonne();

	/**
	 * Returns the value of the '<em><b>APour Competence Linguistique Competence Linguistique</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeCompetenceLinguistique}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Competence Linguistique Competence Linguistique</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Competence Linguistique Competence Linguistique</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePersonne_APourCompetenceLinguistiqueCompetenceLinguistique()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_CompetenceLinguistique'"
	 *        extendedMetaData="kind='element' name='APourCompetenceLinguistique_CompetenceLinguistique'"
	 * @generated
	 */
	EList<TypeCompetenceLinguistique> getAPourCompetenceLinguistiqueCompetenceLinguistique();

	/**
	 * Returns the value of the '<em><b>AOccupe Fonction Fonction Personne</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeFonctionPersonne}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AOccupe Fonction Fonction Personne</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AOccupe Fonction Fonction Personne</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePersonne_AOccupeFonctionFonctionPersonne()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_FonctionPersonne'"
	 *        extendedMetaData="kind='element' name='AOccupeFonction_FonctionPersonne'"
	 * @generated
	 */
	EList<TypeFonctionPersonne> getAOccupeFonctionFonctionPersonne();

	/**
	 * Returns the value of the '<em><b>AExerce Emplois Emploi</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeEmploi}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AExerce Emplois Emploi</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AExerce Emplois Emploi</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePersonne_AExerceEmploisEmploi()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Emploi'"
	 *        extendedMetaData="kind='element' name='AExerceEmplois_Emploi'"
	 * @generated
	 */
	EList<TypeEmploi> getAExerceEmploisEmploi();

	/**
	 * Returns the value of the '<em><b>APour Specialite Specialite Personne</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeSpecialitePersonne}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Specialite Specialite Personne</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Specialite Specialite Personne</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePersonne_APourSpecialiteSpecialitePersonne()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_SpecialitePersonne'"
	 *        extendedMetaData="kind='element' name='APourSpecialite_SpecialitePersonne'"
	 * @generated
	 */
	EList<TypeSpecialitePersonne> getAPourSpecialiteSpecialitePersonne();

	/**
	 * Returns the value of the '<em><b>Est Decrite Par Description Personne</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeDescriptionPersonne}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Decrite Par Description Personne</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Decrite Par Description Personne</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePersonne_EstDecriteParDescriptionPersonne()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_DescriptionPersonne'"
	 *        extendedMetaData="kind='element' name='EstDecritePar_DescriptionPersonne'"
	 * @generated
	 */
	EList<TypeDescriptionPersonne> getEstDecriteParDescriptionPersonne();

	/**
	 * Returns the value of the '<em><b>Est Identifie Par Document Identification Personne</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeDocumentIdentificationPersonne}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Identifie Par Document Identification Personne</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Identifie Par Document Identification Personne</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePersonne_EstIdentifieParDocumentIdentificationPersonne()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_DocumentIdentificationPersonne'"
	 *        extendedMetaData="kind='element' name='EstIdentifiePar_DocumentIdentificationPersonne'"
	 * @generated
	 */
	EList<TypeDocumentIdentificationPersonne> getEstIdentifieParDocumentIdentificationPersonne();

	/**
	 * Returns the value of the '<em><b>APour Etat Etat Operationnel Personnel</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeEtatOperationnelPersonnel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Etat Etat Operationnel Personnel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Etat Etat Operationnel Personnel</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePersonne_APourEtatEtatOperationnelPersonnel()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EtatOperationnelPersonnel'"
	 *        extendedMetaData="kind='element' name='APourEtat_EtatOperationnelPersonnel'"
	 * @generated
	 */
	EList<TypeEtatOperationnelPersonnel> getAPourEtatEtatOperationnelPersonnel();

	/**
	 * Returns the value of the '<em><b>APour Suivi Medical Suivi Medical</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeSuiviMedical}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Suivi Medical Suivi Medical</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Suivi Medical Suivi Medical</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePersonne_APourSuiviMedicalSuiviMedical()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_SuiviMedical'"
	 *        extendedMetaData="kind='element' name='APourSuiviMedical_SuiviMedical'"
	 * @generated
	 */
	EList<TypeSuiviMedical> getAPourSuiviMedicalSuiviMedical();

	/**
	 * Returns the value of the '<em><b>SEst Deplace Selon Deplacement Personne</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeDeplacementPersonne}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SEst Deplace Selon Deplacement Personne</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SEst Deplace Selon Deplacement Personne</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePersonne_SEstDeplaceSelonDeplacementPersonne()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_DeplacementPersonne'"
	 *        extendedMetaData="kind='element' name='SEstDeplaceSelon_DeplacementPersonne'"
	 * @generated
	 */
	EList<TypeDeplacementPersonne> getSEstDeplaceSelonDeplacementPersonne();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Personne Personne</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Personne Personne</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Personne Personne</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePersonne_EstObjetAssociationPersonnePersonne()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_Personne' target_entity='type_AssociationPersonnePersonne'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationPersonnePersonne'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationPersonnePersonne();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Personne Personne</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Personne Personne</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Personne Personne</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePersonne_EstSujetAssociationPersonnePersonne()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_Personne' target_entity='type_AssociationPersonnePersonne'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationPersonnePersonne'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationPersonnePersonne();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Entite Org Personne</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Entite Org Personne</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Entite Org Personne</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePersonne_EstObjetAssociationEntiteOrgPersonne()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_Personne' target_entity='type_AssociationEntiteOrgPersonne'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationEntiteOrgPersonne'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationEntiteOrgPersonne();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Personne Elt Ctrl</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Personne Elt Ctrl</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Personne Elt Ctrl</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePersonne_EstSujetAssociationPersonneEltCtrl()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_Personne' target_entity='type_AssociationPersonneEltCtrl'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationPersonneEltCtrl'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationPersonneEltCtrl();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Personne Elt Topo</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Personne Elt Topo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Personne Elt Topo</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePersonne_EstSujetAssociationPersonneEltTopo()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_Personne' target_entity='type_AssociationPersonneEltTopo'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationPersonneEltTopo'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationPersonneEltTopo();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Personne Mission Air</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Personne Mission Air</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Personne Mission Air</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePersonne_EstSujetAssociationPersonneMissionAir()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_Personne' target_entity='type_AssociationPersonneMissionAir'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationPersonneMissionAir'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationPersonneMissionAir();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Personne Planif Operation3 D</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Personne Planif Operation3 D</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Personne Planif Operation3 D</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePersonne_EstSujetAssociationPersonnePlanifOperation3D()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_Personne' target_entity='type_AssociationPersonnePlanifOperation3D'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationPersonnePlanifOperation3D'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationPersonnePlanifOperation3D();

	/**
	 * Returns the value of the '<em><b>Est Associee AActivite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Associee AActivite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Associee AActivite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePersonne_EstAssocieeAActivite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstAssocieeA_Personne' target_entity='type_Activite'"
	 *        extendedMetaData="kind='element' name='EstAssocieeA_Activite'"
	 * @generated
	 */
	EList<TypeAssociation> getEstAssocieeAActivite();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Personne Evenement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Personne Evenement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Personne Evenement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePersonne_EstSujetAssociationPersonneEvenement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_Personne' target_entity='type_AssociationPersonneEvenement'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationPersonneEvenement'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationPersonneEvenement();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Materiel Personne</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Materiel Personne</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Materiel Personne</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePersonne_EstObjetAssociationMaterielPersonne()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_Personne' target_entity='type_AssociationMaterielPersonne'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationMaterielPersonne'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationMaterielPersonne();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Personne Materiel</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Personne Materiel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Personne Materiel</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePersonne_EstSujetAssociationPersonneMateriel()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_Personne' target_entity='type_AssociationPersonneMateriel'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationPersonneMateriel'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationPersonneMateriel();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Personne Site</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Personne Site</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Personne Site</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePersonne_EstSujetAssociationPersonneSite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_Personne' target_entity='type_AssociationPersonneSite'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationPersonneSite'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationPersonneSite();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Personne Objet Inconnu</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Personne Objet Inconnu</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Personne Objet Inconnu</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePersonne_EstSujetAssociationPersonneObjetInconnu()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_Personne' target_entity='type_AssociationPersonneObjetInconnu'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationPersonneObjetInconnu'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationPersonneObjetInconnu();

} // TypePersonne
