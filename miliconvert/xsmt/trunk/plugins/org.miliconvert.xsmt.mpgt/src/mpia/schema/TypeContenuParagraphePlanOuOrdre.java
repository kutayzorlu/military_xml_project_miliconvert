/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeDateHeure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Contenu Paragraphe Plan Ou Ordre</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeContenuParagraphePlanOuOrdre#getNumeroSequence <em>Numero Sequence</em>}</li>
 *   <li>{@link mpia.schema.TypeContenuParagraphePlanOuOrdre#getDate <em>Date</em>}</li>
 *   <li>{@link mpia.schema.TypeContenuParagraphePlanOuOrdre#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeContenuParagraphePlanOuOrdre#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeContenuParagraphePlanOuOrdre#getAPourContenuStructureAutreContexte <em>APour Contenu Structure Autre Contexte</em>}</li>
 *   <li>{@link mpia.schema.TypeContenuParagraphePlanOuOrdre#getAPourDocumentAssocieAssociationContenuParagraphePlanOuOrdreDocument <em>APour Document Associe Association Contenu Paragraphe Plan Ou Ordre Document</em>}</li>
 *   <li>{@link mpia.schema.TypeContenuParagraphePlanOuOrdre#getAPourContenuTextuelContenuTextuel <em>APour Contenu Textuel Contenu Textuel</em>}</li>
 *   <li>{@link mpia.schema.TypeContenuParagraphePlanOuOrdre#getAPourEnteteEnTeteParagraphePlanOuOrdre <em>APour Entete En Tete Paragraphe Plan Ou Ordre</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeContenuParagraphePlanOuOrdre()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ContenuParagraphePlanOuOrdre' kind='elementOnly'"
 * @generated
 */
public interface TypeContenuParagraphePlanOuOrdre extends EObject {
	/**
	 * Returns the value of the '<em><b>Numero Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Sequence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Sequence</em>' attribute.
	 * @see #isSetNumeroSequence()
	 * @see #unsetNumeroSequence()
	 * @see #setNumeroSequence(long)
	 * @see mpia.schema.SchemaPackage#getTypeContenuParagraphePlanOuOrdre_NumeroSequence()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NumeroSequence'"
	 * @generated
	 */
	long getNumeroSequence();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeContenuParagraphePlanOuOrdre#getNumeroSequence <em>Numero Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Sequence</em>' attribute.
	 * @see #isSetNumeroSequence()
	 * @see #unsetNumeroSequence()
	 * @see #getNumeroSequence()
	 * @generated
	 */
	void setNumeroSequence(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeContenuParagraphePlanOuOrdre#getNumeroSequence <em>Numero Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumeroSequence()
	 * @see #getNumeroSequence()
	 * @see #setNumeroSequence(long)
	 * @generated
	 */
	void unsetNumeroSequence();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeContenuParagraphePlanOuOrdre#getNumeroSequence <em>Numero Sequence</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Numero Sequence</em>' attribute is set.
	 * @see #unsetNumeroSequence()
	 * @see #getNumeroSequence()
	 * @see #setNumeroSequence(long)
	 * @generated
	 */
	boolean isSetNumeroSequence();

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(TypeDataTypeDateHeure)
	 * @see mpia.schema.SchemaPackage#getTypeContenuParagraphePlanOuOrdre_Date()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Date'"
	 * @generated
	 */
	TypeDataTypeDateHeure getDate();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeContenuParagraphePlanOuOrdre#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(TypeDataTypeDateHeure value);

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
	 * @see mpia.schema.SchemaPackage#getTypeContenuParagraphePlanOuOrdre_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeContenuParagraphePlanOuOrdre#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeContenuParagraphePlanOuOrdre_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeContenuParagraphePlanOuOrdre#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Contenu Structure Autre Contexte</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Contenu Structure Autre Contexte</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Contenu Structure Autre Contexte</em>' containment reference.
	 * @see #setAPourContenuStructureAutreContexte(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeContenuParagraphePlanOuOrdre_APourContenuStructureAutreContexte()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreContexte'"
	 *        extendedMetaData="kind='element' name='APourContenuStructure_AutreContexte'"
	 * @generated
	 */
	TypeAssociation getAPourContenuStructureAutreContexte();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeContenuParagraphePlanOuOrdre#getAPourContenuStructureAutreContexte <em>APour Contenu Structure Autre Contexte</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Contenu Structure Autre Contexte</em>' containment reference.
	 * @see #getAPourContenuStructureAutreContexte()
	 * @generated
	 */
	void setAPourContenuStructureAutreContexte(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Document Associe Association Contenu Paragraphe Plan Ou Ordre Document</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationContenuParagraphePlanOuOrdreDocument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Document Associe Association Contenu Paragraphe Plan Ou Ordre Document</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Document Associe Association Contenu Paragraphe Plan Ou Ordre Document</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeContenuParagraphePlanOuOrdre_APourDocumentAssocieAssociationContenuParagraphePlanOuOrdreDocument()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_AssociationContenuParagraphePlanOuOrdreDocument'"
	 *        extendedMetaData="kind='element' name='APourDocumentAssocie_AssociationContenuParagraphePlanOuOrdreDocument'"
	 * @generated
	 */
	EList<TypeAssociationContenuParagraphePlanOuOrdreDocument> getAPourDocumentAssocieAssociationContenuParagraphePlanOuOrdreDocument();

	/**
	 * Returns the value of the '<em><b>APour Contenu Textuel Contenu Textuel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Contenu Textuel Contenu Textuel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Contenu Textuel Contenu Textuel</em>' containment reference.
	 * @see #setAPourContenuTextuelContenuTextuel(TypeContenuTextuel)
	 * @see mpia.schema.SchemaPackage#getTypeContenuParagraphePlanOuOrdre_APourContenuTextuelContenuTextuel()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ContenuTextuel'"
	 *        extendedMetaData="kind='element' name='APourContenuTextuel_ContenuTextuel'"
	 * @generated
	 */
	TypeContenuTextuel getAPourContenuTextuelContenuTextuel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeContenuParagraphePlanOuOrdre#getAPourContenuTextuelContenuTextuel <em>APour Contenu Textuel Contenu Textuel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Contenu Textuel Contenu Textuel</em>' containment reference.
	 * @see #getAPourContenuTextuelContenuTextuel()
	 * @generated
	 */
	void setAPourContenuTextuelContenuTextuel(TypeContenuTextuel value);

	/**
	 * Returns the value of the '<em><b>APour Entete En Tete Paragraphe Plan Ou Ordre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Entete En Tete Paragraphe Plan Ou Ordre</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Entete En Tete Paragraphe Plan Ou Ordre</em>' containment reference.
	 * @see #setAPourEnteteEnTeteParagraphePlanOuOrdre(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeContenuParagraphePlanOuOrdre_APourEnteteEnTeteParagraphePlanOuOrdre()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_EnTeteParagraphePlanOuOrdre'"
	 *        extendedMetaData="kind='element' name='APourEntete_EnTeteParagraphePlanOuOrdre'"
	 * @generated
	 */
	TypeAssociation getAPourEnteteEnTeteParagraphePlanOuOrdre();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeContenuParagraphePlanOuOrdre#getAPourEnteteEnTeteParagraphePlanOuOrdre <em>APour Entete En Tete Paragraphe Plan Ou Ordre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Entete En Tete Paragraphe Plan Ou Ordre</em>' containment reference.
	 * @see #getAPourEnteteEnTeteParagraphePlanOuOrdre()
	 * @generated
	 */
	void setAPourEnteteEnTeteParagraphePlanOuOrdre(TypeAssociation value);

} // TypeContenuParagraphePlanOuOrdre
