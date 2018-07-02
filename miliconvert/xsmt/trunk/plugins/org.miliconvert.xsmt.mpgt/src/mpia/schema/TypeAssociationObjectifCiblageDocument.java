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
 * A representation of the model object '<em><b>Type Association Objectif Ciblage Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationObjectifCiblageDocument#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationObjectifCiblageDocument#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationObjectifCiblageDocument#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationObjectifCiblageDocument#getAssocieCommeObjetDocument <em>Associe Comme Objet Document</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationObjectifCiblageDocument#getAssocieCommeSujetObjectifCiblage <em>Associe Comme Sujet Objectif Ciblage</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationObjectifCiblageDocument()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationObjectifCiblageDocument' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationObjectifCiblageDocument extends EObject {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationRacineOperationnelleDocumentCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationRacineOperationnelleDocumentCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationRacineOperationnelleDocumentCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationObjectifCiblageDocument_Categorie()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationRacineOperationnelleDocumentCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationObjectifCiblageDocument#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationRacineOperationnelleDocumentCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationRacineOperationnelleDocumentCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationObjectifCiblageDocument#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationRacineOperationnelleDocumentCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationObjectifCiblageDocument#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationRacineOperationnelleDocumentCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationObjectifCiblageDocument_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationObjectifCiblageDocument#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationObjectifCiblageDocument_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationObjectifCiblageDocument#getCE <em>CE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationObjectifCiblageDocument_AssocieCommeObjetDocument()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='Documente_AssociationObjectifCiblageDocument' target_entity='type_Document'"
	 *        extendedMetaData="kind='element' name='AssocieCommeObjet_Document'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeObjetDocument();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationObjectifCiblageDocument#getAssocieCommeObjetDocument <em>Associe Comme Objet Document</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Objet Document</em>' containment reference.
	 * @see #getAssocieCommeObjetDocument()
	 * @generated
	 */
	void setAssocieCommeObjetDocument(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Associe Comme Sujet Objectif Ciblage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Sujet Objectif Ciblage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Sujet Objectif Ciblage</em>' containment reference.
	 * @see #setAssocieCommeSujetObjectifCiblage(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationObjectifCiblageDocument_AssocieCommeSujetObjectifCiblage()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourDocumentAssocie_AssociationObjectifCiblageDocument' target_entity='type_ObjectifCiblage'"
	 *        extendedMetaData="kind='element' name='AssocieCommeSujet_ObjectifCiblage'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeSujetObjectifCiblage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationObjectifCiblageDocument#getAssocieCommeSujetObjectifCiblage <em>Associe Comme Sujet Objectif Ciblage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Sujet Objectif Ciblage</em>' containment reference.
	 * @see #getAssocieCommeSujetObjectifCiblage()
	 * @generated
	 */
	void setAssocieCommeSujetObjectifCiblage(TypeAssociation value);

} // TypeAssociationObjectifCiblageDocument
