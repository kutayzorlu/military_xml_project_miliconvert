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
 * A representation of the model object '<em><b>Type Association Contenu Paragraphe Plan Ou Ordre Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationContenuParagraphePlanOuOrdreDocument#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationContenuParagraphePlanOuOrdreDocument#getDate <em>Date</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationContenuParagraphePlanOuOrdreDocument#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationContenuParagraphePlanOuOrdreDocument#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationContenuParagraphePlanOuOrdreDocument#getAssocieCommeObjetDocument <em>Associe Comme Objet Document</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationContenuParagraphePlanOuOrdreDocument()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_AssociationContenuParagraphePlanOuOrdreDocument' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationContenuParagraphePlanOuOrdreDocument extends EObject {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationContenuParagraphePlanOuOrdreDocumentCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationContenuParagraphePlanOuOrdreDocumentCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationContenuParagraphePlanOuOrdreDocumentCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationContenuParagraphePlanOuOrdreDocument_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationContenuParagraphePlanOuOrdreDocumentCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationContenuParagraphePlanOuOrdreDocument#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationContenuParagraphePlanOuOrdreDocumentCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationContenuParagraphePlanOuOrdreDocumentCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationContenuParagraphePlanOuOrdreDocument#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationContenuParagraphePlanOuOrdreDocumentCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationContenuParagraphePlanOuOrdreDocument#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationContenuParagraphePlanOuOrdreDocumentCategorie)
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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationContenuParagraphePlanOuOrdreDocument_Date()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Date'"
	 * @generated
	 */
	TypeDataTypeDateHeure getDate();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationContenuParagraphePlanOuOrdreDocument#getDate <em>Date</em>}' containment reference.
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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationContenuParagraphePlanOuOrdreDocument_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationContenuParagraphePlanOuOrdreDocument#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationContenuParagraphePlanOuOrdreDocument_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationContenuParagraphePlanOuOrdreDocument#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Associe Comme Objet Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Objet Document</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Objet Document</em>' containment reference.
	 * @see #setAssocieCommeObjetDocument(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationContenuParagraphePlanOuOrdreDocument_AssocieCommeObjetDocument()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Document'"
	 *        extendedMetaData="kind='element' name='AssocieCommeObjet_Document'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeObjetDocument();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationContenuParagraphePlanOuOrdreDocument#getAssocieCommeObjetDocument <em>Associe Comme Objet Document</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Objet Document</em>' containment reference.
	 * @see #getAssocieCommeObjetDocument()
	 * @generated
	 */
	void setAssocieCommeObjetDocument(TypeAssociation value);

} // TypeAssociationContenuParagraphePlanOuOrdreDocument
