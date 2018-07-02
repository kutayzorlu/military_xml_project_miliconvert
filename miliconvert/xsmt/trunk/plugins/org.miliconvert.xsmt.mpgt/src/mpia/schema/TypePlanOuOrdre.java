/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Plan Ou Ordre</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypePlanOuOrdre#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypePlanOuOrdre#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypePlanOuOrdre#getAPourEnteteEntetePlanOuOrdre <em>APour Entete Entete Plan Ou Ordre</em>}</li>
 *   <li>{@link mpia.schema.TypePlanOuOrdre#getApourDestinataireDestinatairePlanOuOrdre <em>Apour Destinataire Destinataire Plan Ou Ordre</em>}</li>
 *   <li>{@link mpia.schema.TypePlanOuOrdre#getInclusParagraphePlanOuOrdre <em>Inclus Paragraphe Plan Ou Ordre</em>}</li>
 *   <li>{@link mpia.schema.TypePlanOuOrdre#getEstSoumisAAssociationEntiteOrganisationnellePlanOuOrdre <em>Est Soumis AAssociation Entite Organisationnelle Plan Ou Ordre</em>}</li>
 *   <li>{@link mpia.schema.TypePlanOuOrdre#getEstObjetAssociationPlanOuOrdrePlanOuOrdre <em>Est Objet Association Plan Ou Ordre Plan Ou Ordre</em>}</li>
 *   <li>{@link mpia.schema.TypePlanOuOrdre#getEstSujetAssociationPlanOuOrdrePlanOuOrdre <em>Est Sujet Association Plan Ou Ordre Plan Ou Ordre</em>}</li>
 *   <li>{@link mpia.schema.TypePlanOuOrdre#getEstCiteDansAssociationGroupeInfoOpsPlanOuOrdre <em>Est Cite Dans Association Groupe Info Ops Plan Ou Ordre</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypePlanOuOrdre()
 * @model abstract="true"
 *        extendedMetaData="name='type_PlanOuOrdre' kind='elementOnly'"
 * @generated
 */
public interface TypePlanOuOrdre extends EObject {
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
	 * @see mpia.schema.SchemaPackage#getTypePlanOuOrdre_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePlanOuOrdre#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypePlanOuOrdre_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePlanOuOrdre#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Entete Entete Plan Ou Ordre</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeEntetePlanOuOrdre}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Entete Entete Plan Ou Ordre</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Entete Entete Plan Ou Ordre</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePlanOuOrdre_APourEnteteEntetePlanOuOrdre()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EntetePlanOuOrdre'"
	 *        extendedMetaData="kind='element' name='APourEntete_EntetePlanOuOrdre'"
	 * @generated
	 */
	EList<TypeEntetePlanOuOrdre> getAPourEnteteEntetePlanOuOrdre();

	/**
	 * Returns the value of the '<em><b>Apour Destinataire Destinataire Plan Ou Ordre</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeDestinatairePlanOuOrdre}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apour Destinataire Destinataire Plan Ou Ordre</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apour Destinataire Destinataire Plan Ou Ordre</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePlanOuOrdre_ApourDestinataireDestinatairePlanOuOrdre()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_DestinatairePlanOuOrdre'"
	 *        extendedMetaData="kind='element' name='ApourDestinataire_DestinatairePlanOuOrdre'"
	 * @generated
	 */
	EList<TypeDestinatairePlanOuOrdre> getApourDestinataireDestinatairePlanOuOrdre();

	/**
	 * Returns the value of the '<em><b>Inclus Paragraphe Plan Ou Ordre</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inclus Paragraphe Plan Ou Ordre</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inclus Paragraphe Plan Ou Ordre</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePlanOuOrdre_InclusParagraphePlanOuOrdre()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='FaitPartie_PlanOuOrdre' target_entity='type_ParagraphePlanOuOrdre'"
	 *        extendedMetaData="kind='element' name='Inclus_ParagraphePlanOuOrdre'"
	 * @generated
	 */
	EList<TypeAssociation> getInclusParagraphePlanOuOrdre();

	/**
	 * Returns the value of the '<em><b>Est Soumis AAssociation Entite Organisationnelle Plan Ou Ordre</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Soumis AAssociation Entite Organisationnelle Plan Ou Ordre</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Soumis AAssociation Entite Organisationnelle Plan Ou Ordre</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePlanOuOrdre_EstSoumisAAssociationEntiteOrganisationnellePlanOuOrdre()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_PlanOuOrdre' target_entity='type_AssociationEntiteOrganisationnellePlanOuOrdre'"
	 *        extendedMetaData="kind='element' name='EstSoumisA_AssociationEntiteOrganisationnellePlanOuOrdre'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSoumisAAssociationEntiteOrganisationnellePlanOuOrdre();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Plan Ou Ordre Plan Ou Ordre</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Plan Ou Ordre Plan Ou Ordre</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Plan Ou Ordre Plan Ou Ordre</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePlanOuOrdre_EstObjetAssociationPlanOuOrdrePlanOuOrdre()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_PlanOuOrdre' target_entity='type_AssociationPlanOuOrdrePlanOuOrdre'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationPlanOuOrdrePlanOuOrdre'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationPlanOuOrdrePlanOuOrdre();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Plan Ou Ordre Plan Ou Ordre</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Plan Ou Ordre Plan Ou Ordre</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Plan Ou Ordre Plan Ou Ordre</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePlanOuOrdre_EstSujetAssociationPlanOuOrdrePlanOuOrdre()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_PlanOuOrdre' target_entity='type_AssociationPlanOuOrdrePlanOuOrdre'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationPlanOuOrdrePlanOuOrdre'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationPlanOuOrdrePlanOuOrdre();

	/**
	 * Returns the value of the '<em><b>Est Cite Dans Association Groupe Info Ops Plan Ou Ordre</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Cite Dans Association Groupe Info Ops Plan Ou Ordre</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Cite Dans Association Groupe Info Ops Plan Ou Ordre</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePlanOuOrdre_EstCiteDansAssociationGroupeInfoOpsPlanOuOrdre()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='Cites_PlanOuOrdre' target_entity='type_AssociationGroupeInfoOpsPlanOuOrdre'"
	 *        extendedMetaData="kind='element' name='EstCiteDans_AssociationGroupeInfoOpsPlanOuOrdre'"
	 * @generated
	 */
	EList<TypeAssociation> getEstCiteDansAssociationGroupeInfoOpsPlanOuOrdre();

} // TypePlanOuOrdre
