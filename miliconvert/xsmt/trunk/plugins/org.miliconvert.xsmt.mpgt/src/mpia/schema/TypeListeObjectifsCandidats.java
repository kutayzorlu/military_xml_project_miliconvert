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
 * A representation of the model object '<em><b>Type Liste Objectifs Candidats</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeListeObjectifsCandidats#getEstDefinieDansCadrePlanFeux <em>Est Definie Dans Cadre Plan Feux</em>}</li>
 *   <li>{@link mpia.schema.TypeListeObjectifsCandidats#getACommeAutorisationAutorisationListeObjectifsCandidats <em>AComme Autorisation Autorisation Liste Objectifs Candidats</em>}</li>
 *   <li>{@link mpia.schema.TypeListeObjectifsCandidats#getContraintAssocListeObjCandListeObjCand <em>Contraint Assoc Liste Obj Cand Liste Obj Cand</em>}</li>
 *   <li>{@link mpia.schema.TypeListeObjectifsCandidats#getDependAssocListeObjCandListeObjCand <em>Depend Assoc Liste Obj Cand Liste Obj Cand</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeListeObjectifsCandidats()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_ListeObjectifsCandidats' kind='elementOnly'"
 * @generated
 */
public interface TypeListeObjectifsCandidats extends TypeListeObjectifs {
	/**
	 * Returns the value of the '<em><b>Est Definie Dans Cadre Plan Feux</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Definie Dans Cadre Plan Feux</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Definie Dans Cadre Plan Feux</em>' containment reference.
	 * @see #setEstDefinieDansCadrePlanFeux(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeListeObjectifsCandidats_EstDefinieDansCadrePlanFeux()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourListesObjectifsCandidats_ListeObjectifsCandidats' target_entity='type_PlanFeux'"
	 *        extendedMetaData="kind='element' name='EstDefinieDansCadre_PlanFeux'"
	 * @generated
	 */
	TypeAssociation getEstDefinieDansCadrePlanFeux();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeListeObjectifsCandidats#getEstDefinieDansCadrePlanFeux <em>Est Definie Dans Cadre Plan Feux</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Definie Dans Cadre Plan Feux</em>' containment reference.
	 * @see #getEstDefinieDansCadrePlanFeux()
	 * @generated
	 */
	void setEstDefinieDansCadrePlanFeux(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>AComme Autorisation Autorisation Liste Objectifs Candidats</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAutorisationListeObjectifsCandidats}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Autorisation Autorisation Liste Objectifs Candidats</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Autorisation Autorisation Liste Objectifs Candidats</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeListeObjectifsCandidats_ACommeAutorisationAutorisationListeObjectifsCandidats()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_AutorisationListeObjectifsCandidats'"
	 *        extendedMetaData="kind='element' name='ACommeAutorisation_AutorisationListeObjectifsCandidats'"
	 * @generated
	 */
	EList<TypeAutorisationListeObjectifsCandidats> getACommeAutorisationAutorisationListeObjectifsCandidats();

	/**
	 * Returns the value of the '<em><b>Contraint Assoc Liste Obj Cand Liste Obj Cand</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contraint Assoc Liste Obj Cand Liste Obj Cand</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contraint Assoc Liste Obj Cand Liste Obj Cand</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeListeObjectifsCandidats_ContraintAssocListeObjCandListeObjCand()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourListeObjectifsSujet_ListeObjectifsCandidats' target_entity='type_AssocListeObjCandListeObjCand'"
	 *        extendedMetaData="kind='element' name='Contraint_AssocListeObjCandListeObjCand'"
	 * @generated
	 */
	EList<TypeAssociation> getContraintAssocListeObjCandListeObjCand();

	/**
	 * Returns the value of the '<em><b>Depend Assoc Liste Obj Cand Liste Obj Cand</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depend Assoc Liste Obj Cand Liste Obj Cand</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depend Assoc Liste Obj Cand Liste Obj Cand</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeListeObjectifsCandidats_DependAssocListeObjCandListeObjCand()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourListeObjectifsObjet_ListeObjectifsCandidats' target_entity='type_AssocListeObjCandListeObjCand'"
	 *        extendedMetaData="kind='element' name='Depend_AssocListeObjCandListeObjCand'"
	 * @generated
	 */
	EList<TypeAssociation> getDependAssocListeObjCandListeObjCand();

} // TypeListeObjectifsCandidats
