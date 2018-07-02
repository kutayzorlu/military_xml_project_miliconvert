/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeDateHeure;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Association Paragraphe POparagraphe PO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationParagraphePOparagraphePO#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationParagraphePOparagraphePO#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationParagraphePOparagraphePO#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationParagraphePOparagraphePO#getDate <em>Date</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationParagraphePOparagraphePO#getAPourSujetParagraphePlanOuOrdre <em>APour Sujet Paragraphe Plan Ou Ordre</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationParagraphePOparagraphePO#getAPourObjetParagraphePlanOuOrdre <em>APour Objet Paragraphe Plan Ou Ordre</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationParagraphePOparagraphePO()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationParagraphePOparagraphePO' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationParagraphePOparagraphePO extends EObject {
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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationParagraphePOparagraphePO_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationParagraphePOparagraphePO#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationParagraphePOparagraphePO_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationParagraphePOparagraphePO#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationParagraphePOparagraphePOCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationParagraphePOparagraphePOCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationParagraphePOparagraphePOCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationParagraphePOparagraphePO_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationParagraphePOparagraphePOCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationParagraphePOparagraphePO#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationParagraphePOparagraphePOCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationParagraphePOparagraphePOCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationParagraphePOparagraphePO#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationParagraphePOparagraphePOCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationParagraphePOparagraphePO#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationParagraphePOparagraphePOCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationParagraphePOparagraphePO_Date()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Date'"
	 * @generated
	 */
	TypeDataTypeDateHeure getDate();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationParagraphePOparagraphePO#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(TypeDataTypeDateHeure value);

	/**
	 * Returns the value of the '<em><b>APour Sujet Paragraphe Plan Ou Ordre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Sujet Paragraphe Plan Ou Ordre</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Sujet Paragraphe Plan Ou Ordre</em>' containment reference.
	 * @see #setAPourSujetParagraphePlanOuOrdre(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationParagraphePOparagraphePO_APourSujetParagraphePlanOuOrdre()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationParagraphePOparagraphePO' target_entity='type_ParagraphePlanOuOrdre'"
	 *        extendedMetaData="kind='element' name='APourSujet_ParagraphePlanOuOrdre'"
	 * @generated
	 */
	TypeAssociation getAPourSujetParagraphePlanOuOrdre();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationParagraphePOparagraphePO#getAPourSujetParagraphePlanOuOrdre <em>APour Sujet Paragraphe Plan Ou Ordre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Sujet Paragraphe Plan Ou Ordre</em>' containment reference.
	 * @see #getAPourSujetParagraphePlanOuOrdre()
	 * @generated
	 */
	void setAPourSujetParagraphePlanOuOrdre(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Objet Paragraphe Plan Ou Ordre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Objet Paragraphe Plan Ou Ordre</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Objet Paragraphe Plan Ou Ordre</em>' containment reference.
	 * @see #setAPourObjetParagraphePlanOuOrdre(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationParagraphePOparagraphePO_APourObjetParagraphePlanOuOrdre()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationParagraphePOparagraphePO' target_entity='type_ParagraphePlanOuOrdre'"
	 *        extendedMetaData="kind='element' name='APourObjet_ParagraphePlanOuOrdre'"
	 * @generated
	 */
	TypeAssociation getAPourObjetParagraphePlanOuOrdre();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationParagraphePOparagraphePO#getAPourObjetParagraphePlanOuOrdre <em>APour Objet Paragraphe Plan Ou Ordre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Objet Paragraphe Plan Ou Ordre</em>' containment reference.
	 * @see #getAPourObjetParagraphePlanOuOrdre()
	 * @generated
	 */
	void setAPourObjetParagraphePlanOuOrdre(TypeAssociation value);

} // TypeAssociationParagraphePOparagraphePO
