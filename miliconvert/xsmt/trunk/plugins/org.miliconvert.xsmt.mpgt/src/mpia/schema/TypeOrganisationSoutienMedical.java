/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Organisation Soutien Medical</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeOrganisationSoutienMedical#getMesuresHygiene <em>Mesures Hygiene</em>}</li>
 *   <li>{@link mpia.schema.TypeOrganisationSoutienMedical#getReactionsMentalesModalites <em>Reactions Mentales Modalites</em>}</li>
 *   <li>{@link mpia.schema.TypeOrganisationSoutienMedical#getReactionsMentalesConceptGen <em>Reactions Mentales Concept Gen</em>}</li>
 *   <li>{@link mpia.schema.TypeOrganisationSoutienMedical#getRisquesParticuliers <em>Risques Particuliers</em>}</li>
 *   <li>{@link mpia.schema.TypeOrganisationSoutienMedical#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeOrganisationSoutienMedical#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeOrganisationSoutienMedical#getOrganiseEvacuationSelonOrganisationEvacuations <em>Organise Evacuation Selon Organisation Evacuations</em>}</li>
 *   <li>{@link mpia.schema.TypeOrganisationSoutienMedical#getOrganiseRamassageSelonOrganisationRamassage <em>Organise Ramassage Selon Organisation Ramassage</em>}</li>
 *   <li>{@link mpia.schema.TypeOrganisationSoutienMedical#getAPourModalitesRavitaillementModalitesRavitaillement <em>APour Modalites Ravitaillement Modalites Ravitaillement</em>}</li>
 *   <li>{@link mpia.schema.TypeOrganisationSoutienMedical#getAPourMoyensNiveau2MoyenPourSoutienMedical <em>APour Moyens Niveau2 Moyen Pour Soutien Medical</em>}</li>
 *   <li>{@link mpia.schema.TypeOrganisationSoutienMedical#getAPourMoyensNiveau3MoyenPourSoutienMedical <em>APour Moyens Niveau3 Moyen Pour Soutien Medical</em>}</li>
 *   <li>{@link mpia.schema.TypeOrganisationSoutienMedical#getAPourMoyensNiveau4MoyensNiveau4 <em>APour Moyens Niveau4 Moyens Niveau4</em>}</li>
 *   <li>{@link mpia.schema.TypeOrganisationSoutienMedical#getDoitMaintenirNiveauAMaintenir <em>Doit Maintenir Niveau AMaintenir</em>}</li>
 *   <li>{@link mpia.schema.TypeOrganisationSoutienMedical#getOrganiseTraitementSelonOrganisationTraitement <em>Organise Traitement Selon Organisation Traitement</em>}</li>
 *   <li>{@link mpia.schema.TypeOrganisationSoutienMedical#getOrganiseTriageSelonOrganisationTriage <em>Organise Triage Selon Organisation Triage</em>}</li>
 *   <li>{@link mpia.schema.TypeOrganisationSoutienMedical#getAPourMoyensNiveau1Unite <em>APour Moyens Niveau1 Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeOrganisationSoutienMedical#getAPourPosteDeSecoursAutreSite <em>APour Poste De Secours Autre Site</em>}</li>
 *   <li>{@link mpia.schema.TypeOrganisationSoutienMedical#getAPourReactionsAuCombatReactionsMentalesAuCombat <em>APour Reactions Au Combat Reactions Mentales Au Combat</em>}</li>
 *   <li>{@link mpia.schema.TypeOrganisationSoutienMedical#getAPourTriageTriage <em>APour Triage Triage</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeOrganisationSoutienMedical()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_OrganisationSoutienMedical' kind='elementOnly'"
 * @generated
 */
public interface TypeOrganisationSoutienMedical extends EObject {
	/**
	 * Returns the value of the '<em><b>Mesures Hygiene</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mesures Hygiene</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mesures Hygiene</em>' attribute.
	 * @see #setMesuresHygiene(String)
	 * @see mpia.schema.SchemaPackage#getTypeOrganisationSoutienMedical_MesuresHygiene()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='MesuresHygiene'"
	 * @generated
	 */
	String getMesuresHygiene();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeOrganisationSoutienMedical#getMesuresHygiene <em>Mesures Hygiene</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mesures Hygiene</em>' attribute.
	 * @see #getMesuresHygiene()
	 * @generated
	 */
	void setMesuresHygiene(String value);

	/**
	 * Returns the value of the '<em><b>Reactions Mentales Modalites</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reactions Mentales Modalites</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reactions Mentales Modalites</em>' attribute.
	 * @see #setReactionsMentalesModalites(String)
	 * @see mpia.schema.SchemaPackage#getTypeOrganisationSoutienMedical_ReactionsMentalesModalites()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='ReactionsMentalesModalites'"
	 * @generated
	 */
	String getReactionsMentalesModalites();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeOrganisationSoutienMedical#getReactionsMentalesModalites <em>Reactions Mentales Modalites</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reactions Mentales Modalites</em>' attribute.
	 * @see #getReactionsMentalesModalites()
	 * @generated
	 */
	void setReactionsMentalesModalites(String value);

	/**
	 * Returns the value of the '<em><b>Reactions Mentales Concept Gen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reactions Mentales Concept Gen</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reactions Mentales Concept Gen</em>' attribute.
	 * @see #setReactionsMentalesConceptGen(String)
	 * @see mpia.schema.SchemaPackage#getTypeOrganisationSoutienMedical_ReactionsMentalesConceptGen()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='ReactionsMentalesConceptGen'"
	 * @generated
	 */
	String getReactionsMentalesConceptGen();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeOrganisationSoutienMedical#getReactionsMentalesConceptGen <em>Reactions Mentales Concept Gen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reactions Mentales Concept Gen</em>' attribute.
	 * @see #getReactionsMentalesConceptGen()
	 * @generated
	 */
	void setReactionsMentalesConceptGen(String value);

	/**
	 * Returns the value of the '<em><b>Risques Particuliers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Risques Particuliers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Risques Particuliers</em>' attribute.
	 * @see #setRisquesParticuliers(String)
	 * @see mpia.schema.SchemaPackage#getTypeOrganisationSoutienMedical_RisquesParticuliers()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='RisquesParticuliers'"
	 * @generated
	 */
	String getRisquesParticuliers();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeOrganisationSoutienMedical#getRisquesParticuliers <em>Risques Particuliers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Risques Particuliers</em>' attribute.
	 * @see #getRisquesParticuliers()
	 * @generated
	 */
	void setRisquesParticuliers(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeOrganisationSoutienMedical_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeOrganisationSoutienMedical#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeOrganisationSoutienMedical_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeOrganisationSoutienMedical#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Organise Evacuation Selon Organisation Evacuations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organise Evacuation Selon Organisation Evacuations</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organise Evacuation Selon Organisation Evacuations</em>' containment reference.
	 * @see #setOrganiseEvacuationSelonOrganisationEvacuations(TypeOrganisationEvacuations)
	 * @see mpia.schema.SchemaPackage#getTypeOrganisationSoutienMedical_OrganiseEvacuationSelonOrganisationEvacuations()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_OrganisationEvacuations'"
	 *        extendedMetaData="kind='element' name='OrganiseEvacuationSelon_OrganisationEvacuations'"
	 * @generated
	 */
	TypeOrganisationEvacuations getOrganiseEvacuationSelonOrganisationEvacuations();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeOrganisationSoutienMedical#getOrganiseEvacuationSelonOrganisationEvacuations <em>Organise Evacuation Selon Organisation Evacuations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organise Evacuation Selon Organisation Evacuations</em>' containment reference.
	 * @see #getOrganiseEvacuationSelonOrganisationEvacuations()
	 * @generated
	 */
	void setOrganiseEvacuationSelonOrganisationEvacuations(TypeOrganisationEvacuations value);

	/**
	 * Returns the value of the '<em><b>Organise Ramassage Selon Organisation Ramassage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organise Ramassage Selon Organisation Ramassage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organise Ramassage Selon Organisation Ramassage</em>' containment reference.
	 * @see #setOrganiseRamassageSelonOrganisationRamassage(TypeOrganisationRamassage)
	 * @see mpia.schema.SchemaPackage#getTypeOrganisationSoutienMedical_OrganiseRamassageSelonOrganisationRamassage()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_OrganisationRamassage'"
	 *        extendedMetaData="kind='element' name='OrganiseRamassageSelon_OrganisationRamassage'"
	 * @generated
	 */
	TypeOrganisationRamassage getOrganiseRamassageSelonOrganisationRamassage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeOrganisationSoutienMedical#getOrganiseRamassageSelonOrganisationRamassage <em>Organise Ramassage Selon Organisation Ramassage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organise Ramassage Selon Organisation Ramassage</em>' containment reference.
	 * @see #getOrganiseRamassageSelonOrganisationRamassage()
	 * @generated
	 */
	void setOrganiseRamassageSelonOrganisationRamassage(TypeOrganisationRamassage value);

	/**
	 * Returns the value of the '<em><b>APour Modalites Ravitaillement Modalites Ravitaillement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeModalitesRavitaillement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Modalites Ravitaillement Modalites Ravitaillement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Modalites Ravitaillement Modalites Ravitaillement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeOrganisationSoutienMedical_APourModalitesRavitaillementModalitesRavitaillement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ModalitesRavitaillement'"
	 *        extendedMetaData="kind='element' name='APourModalitesRavitaillement_ModalitesRavitaillement'"
	 * @generated
	 */
	EList<TypeModalitesRavitaillement> getAPourModalitesRavitaillementModalitesRavitaillement();

	/**
	 * Returns the value of the '<em><b>APour Moyens Niveau2 Moyen Pour Soutien Medical</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMoyenPourSoutienMedical}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Moyens Niveau2 Moyen Pour Soutien Medical</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Moyens Niveau2 Moyen Pour Soutien Medical</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeOrganisationSoutienMedical_APourMoyensNiveau2MoyenPourSoutienMedical()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_MoyenPourSoutienMedical'"
	 *        extendedMetaData="kind='element' name='APourMoyensNiveau2_MoyenPourSoutienMedical'"
	 * @generated
	 */
	EList<TypeMoyenPourSoutienMedical> getAPourMoyensNiveau2MoyenPourSoutienMedical();

	/**
	 * Returns the value of the '<em><b>APour Moyens Niveau3 Moyen Pour Soutien Medical</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMoyenPourSoutienMedical}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Moyens Niveau3 Moyen Pour Soutien Medical</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Moyens Niveau3 Moyen Pour Soutien Medical</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeOrganisationSoutienMedical_APourMoyensNiveau3MoyenPourSoutienMedical()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_MoyenPourSoutienMedical'"
	 *        extendedMetaData="kind='element' name='APourMoyensNiveau3_MoyenPourSoutienMedical'"
	 * @generated
	 */
	EList<TypeMoyenPourSoutienMedical> getAPourMoyensNiveau3MoyenPourSoutienMedical();

	/**
	 * Returns the value of the '<em><b>APour Moyens Niveau4 Moyens Niveau4</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMoyensNiveau4}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Moyens Niveau4 Moyens Niveau4</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Moyens Niveau4 Moyens Niveau4</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeOrganisationSoutienMedical_APourMoyensNiveau4MoyensNiveau4()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_MoyensNiveau4'"
	 *        extendedMetaData="kind='element' name='APourMoyensNiveau4_MoyensNiveau4'"
	 * @generated
	 */
	EList<TypeMoyensNiveau4> getAPourMoyensNiveau4MoyensNiveau4();

	/**
	 * Returns the value of the '<em><b>Doit Maintenir Niveau AMaintenir</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeNiveauAMaintenir}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Doit Maintenir Niveau AMaintenir</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doit Maintenir Niveau AMaintenir</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeOrganisationSoutienMedical_DoitMaintenirNiveauAMaintenir()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_NiveauAMaintenir'"
	 *        extendedMetaData="kind='element' name='DoitMaintenir_NiveauAMaintenir'"
	 * @generated
	 */
	EList<TypeNiveauAMaintenir> getDoitMaintenirNiveauAMaintenir();

	/**
	 * Returns the value of the '<em><b>Organise Traitement Selon Organisation Traitement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeOrganisationTraitement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organise Traitement Selon Organisation Traitement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organise Traitement Selon Organisation Traitement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeOrganisationSoutienMedical_OrganiseTraitementSelonOrganisationTraitement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_OrganisationTraitement'"
	 *        extendedMetaData="kind='element' name='OrganiseTraitementSelon_OrganisationTraitement'"
	 * @generated
	 */
	EList<TypeOrganisationTraitement> getOrganiseTraitementSelonOrganisationTraitement();

	/**
	 * Returns the value of the '<em><b>Organise Triage Selon Organisation Triage</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeOrganisationTriage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organise Triage Selon Organisation Triage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organise Triage Selon Organisation Triage</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeOrganisationSoutienMedical_OrganiseTriageSelonOrganisationTriage()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_OrganisationTriage'"
	 *        extendedMetaData="kind='element' name='OrganiseTriageSelon_OrganisationTriage'"
	 * @generated
	 */
	EList<TypeOrganisationTriage> getOrganiseTriageSelonOrganisationTriage();

	/**
	 * Returns the value of the '<em><b>APour Moyens Niveau1 Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociationEXT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Moyens Niveau1 Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Moyens Niveau1 Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeOrganisationSoutienMedical_APourMoyensNiveau1Unite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourMoyensNiveau1_Unite'"
	 * @generated
	 */
	EList<TypeAssociationEXT> getAPourMoyensNiveau1Unite();

	/**
	 * Returns the value of the '<em><b>APour Poste De Secours Autre Site</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Poste De Secours Autre Site</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Poste De Secours Autre Site</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeOrganisationSoutienMedical_APourPosteDeSecoursAutreSite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreSite'"
	 *        extendedMetaData="kind='element' name='APourPosteDeSecours_AutreSite'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourPosteDeSecoursAutreSite();

	/**
	 * Returns the value of the '<em><b>APour Reactions Au Combat Reactions Mentales Au Combat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Reactions Au Combat Reactions Mentales Au Combat</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Reactions Au Combat Reactions Mentales Au Combat</em>' containment reference.
	 * @see #setAPourReactionsAuCombatReactionsMentalesAuCombat(TypeReactionsMentalesAuCombat)
	 * @see mpia.schema.SchemaPackage#getTypeOrganisationSoutienMedical_APourReactionsAuCombatReactionsMentalesAuCombat()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ReactionsMentalesAuCombat'"
	 *        extendedMetaData="kind='element' name='APourReactionsAuCombat_ReactionsMentalesAuCombat'"
	 * @generated
	 */
	TypeReactionsMentalesAuCombat getAPourReactionsAuCombatReactionsMentalesAuCombat();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeOrganisationSoutienMedical#getAPourReactionsAuCombatReactionsMentalesAuCombat <em>APour Reactions Au Combat Reactions Mentales Au Combat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Reactions Au Combat Reactions Mentales Au Combat</em>' containment reference.
	 * @see #getAPourReactionsAuCombatReactionsMentalesAuCombat()
	 * @generated
	 */
	void setAPourReactionsAuCombatReactionsMentalesAuCombat(TypeReactionsMentalesAuCombat value);

	/**
	 * Returns the value of the '<em><b>APour Triage Triage</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTriage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Triage Triage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Triage Triage</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeOrganisationSoutienMedical_APourTriageTriage()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Triage'"
	 *        extendedMetaData="kind='element' name='APourTriage_Triage'"
	 * @generated
	 */
	EList<TypeTriage> getAPourTriageTriage();

} // TypeOrganisationSoutienMedical
