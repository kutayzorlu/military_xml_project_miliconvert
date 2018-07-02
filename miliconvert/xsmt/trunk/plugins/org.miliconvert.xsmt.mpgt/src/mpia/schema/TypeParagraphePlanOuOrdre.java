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
 * A representation of the model object '<em><b>Type Paragraphe Plan Ou Ordre</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeParagraphePlanOuOrdre#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeParagraphePlanOuOrdre#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeParagraphePlanOuOrdre#getFaitPartiePlanOuOrdre <em>Fait Partie Plan Ou Ordre</em>}</li>
 *   <li>{@link mpia.schema.TypeParagraphePlanOuOrdre#getEstSujetAssociationParagraphePOparagraphePO <em>Est Sujet Association Paragraphe POparagraphe PO</em>}</li>
 *   <li>{@link mpia.schema.TypeParagraphePlanOuOrdre#getEstObjetAssociationParagraphePOparagraphePO <em>Est Objet Association Paragraphe POparagraphe PO</em>}</li>
 *   <li>{@link mpia.schema.TypeParagraphePlanOuOrdre#getEstDefiniParContenuParagraphePlanOuOrdre <em>Est Defini Par Contenu Paragraphe Plan Ou Ordre</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeParagraphePlanOuOrdre()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_ParagraphePlanOuOrdre' kind='elementOnly'"
 * @generated
 */
public interface TypeParagraphePlanOuOrdre extends EObject {
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
	 * @see mpia.schema.SchemaPackage#getTypeParagraphePlanOuOrdre_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeParagraphePlanOuOrdre#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeParagraphePlanOuOrdre_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeParagraphePlanOuOrdre#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Fait Partie Plan Ou Ordre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fait Partie Plan Ou Ordre</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fait Partie Plan Ou Ordre</em>' containment reference.
	 * @see #setFaitPartiePlanOuOrdre(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeParagraphePlanOuOrdre_FaitPartiePlanOuOrdre()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='Inclus_ParagraphePlanOuOrdre' target_entity='type_PlanOuOrdre'"
	 *        extendedMetaData="kind='element' name='FaitPartie_PlanOuOrdre'"
	 * @generated
	 */
	TypeAssociation getFaitPartiePlanOuOrdre();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeParagraphePlanOuOrdre#getFaitPartiePlanOuOrdre <em>Fait Partie Plan Ou Ordre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fait Partie Plan Ou Ordre</em>' containment reference.
	 * @see #getFaitPartiePlanOuOrdre()
	 * @generated
	 */
	void setFaitPartiePlanOuOrdre(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Paragraphe POparagraphe PO</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Paragraphe POparagraphe PO</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Paragraphe POparagraphe PO</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeParagraphePlanOuOrdre_EstSujetAssociationParagraphePOparagraphePO()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_ParagraphePlanOuOrdre' target_entity='type_AssociationParagraphePOparagraphePO'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationParagraphePOparagraphePO'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationParagraphePOparagraphePO();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Paragraphe POparagraphe PO</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Paragraphe POparagraphe PO</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Paragraphe POparagraphe PO</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeParagraphePlanOuOrdre_EstObjetAssociationParagraphePOparagraphePO()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_ParagraphePlanOuOrdre' target_entity='type_AssociationParagraphePOparagraphePO'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationParagraphePOparagraphePO'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationParagraphePOparagraphePO();

	/**
	 * Returns the value of the '<em><b>Est Defini Par Contenu Paragraphe Plan Ou Ordre</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeContenuParagraphePlanOuOrdre}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Defini Par Contenu Paragraphe Plan Ou Ordre</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Defini Par Contenu Paragraphe Plan Ou Ordre</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeParagraphePlanOuOrdre_EstDefiniParContenuParagraphePlanOuOrdre()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ContenuParagraphePlanOuOrdre'"
	 *        extendedMetaData="kind='element' name='EstDefiniPar_ContenuParagraphePlanOuOrdre'"
	 * @generated
	 */
	EList<TypeContenuParagraphePlanOuOrdre> getEstDefiniParContenuParagraphePlanOuOrdre();

} // TypeParagraphePlanOuOrdre
