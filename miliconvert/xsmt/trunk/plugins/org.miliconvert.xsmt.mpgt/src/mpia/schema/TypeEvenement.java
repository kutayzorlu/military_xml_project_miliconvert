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
 * A representation of the model object '<em><b>Type Evenement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEvenement#getEstDetailleParDetailEvenement <em>Est Detaille Par Detail Evenement</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenement#getAPourEtatEtatEvenement <em>APour Etat Etat Evenement</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenement#getEstObjetAssociationEntiteOrgEvenement <em>Est Objet Association Entite Org Evenement</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenement#getEstObjetAssociationPersonneEvenement <em>Est Objet Association Personne Evenement</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenement#getEstObjetAssociationMaterielEvenement <em>Est Objet Association Materiel Evenement</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenement#getEstObjetAssociationSiteEvenement <em>Est Objet Association Site Evenement</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenement#getEstObjetAssociationElementControleEvenement <em>Est Objet Association Element Controle Evenement</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenement#getEstObjetAssociationElementTopographieEvenement <em>Est Objet Association Element Topographie Evenement</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenement#getAPourRessourceRessourceActivite <em>APour Ressource Ressource Activite</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEvenement()
 * @model abstract="true"
 *        extendedMetaData="name='type_Evenement' kind='elementOnly'"
 * @generated
 */
public interface TypeEvenement extends TypeActivite {
	/**
	 * Returns the value of the '<em><b>Est Detaille Par Detail Evenement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeDetailEvenement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Detaille Par Detail Evenement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Detaille Par Detail Evenement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEvenement_EstDetailleParDetailEvenement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_DetailEvenement'"
	 *        extendedMetaData="kind='element' name='EstDetaillePar_DetailEvenement'"
	 * @generated
	 */
	EList<TypeDetailEvenement> getEstDetailleParDetailEvenement();

	/**
	 * Returns the value of the '<em><b>APour Etat Etat Evenement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeEtatEvenement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Etat Etat Evenement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Etat Etat Evenement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEvenement_APourEtatEtatEvenement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EtatEvenement'"
	 *        extendedMetaData="kind='element' name='APourEtat_EtatEvenement'"
	 * @generated
	 */
	EList<TypeEtatEvenement> getAPourEtatEtatEvenement();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Entite Org Evenement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Entite Org Evenement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Entite Org Evenement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEvenement_EstObjetAssociationEntiteOrgEvenement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_Evenement' target_entity='type_AssociationEntiteOrgEvenement'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationEntiteOrgEvenement'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationEntiteOrgEvenement();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Personne Evenement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Personne Evenement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Personne Evenement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEvenement_EstObjetAssociationPersonneEvenement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_Evenement' target_entity='type_AssociationPersonneEvenement'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationPersonneEvenement'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationPersonneEvenement();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Materiel Evenement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Materiel Evenement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Materiel Evenement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEvenement_EstObjetAssociationMaterielEvenement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_Evenement' target_entity='type_AssociationMaterielEvenement'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationMaterielEvenement'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationMaterielEvenement();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Site Evenement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Site Evenement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Site Evenement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEvenement_EstObjetAssociationSiteEvenement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_Evenement' target_entity='type_AssociationSiteEvenement'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationSiteEvenement'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationSiteEvenement();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Element Controle Evenement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Element Controle Evenement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Element Controle Evenement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEvenement_EstObjetAssociationElementControleEvenement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_Evenement' target_entity='type_AssociationElementControleEvenement'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationElementControleEvenement'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationElementControleEvenement();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Element Topographie Evenement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Element Topographie Evenement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Element Topographie Evenement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEvenement_EstObjetAssociationElementTopographieEvenement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_Evenement' target_entity='type_AssociationElementTopographieEvenement'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationElementTopographieEvenement'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationElementTopographieEvenement();

	/**
	 * Returns the value of the '<em><b>APour Ressource Ressource Activite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeRessourceActivite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Ressource Ressource Activite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Ressource Ressource Activite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEvenement_APourRessourceRessourceActivite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_RessourceActivite'"
	 *        extendedMetaData="kind='element' name='APourRessource_RessourceActivite'"
	 * @generated
	 */
	EList<TypeRessourceActivite> getAPourRessourceRessourceActivite();

} // TypeEvenement
