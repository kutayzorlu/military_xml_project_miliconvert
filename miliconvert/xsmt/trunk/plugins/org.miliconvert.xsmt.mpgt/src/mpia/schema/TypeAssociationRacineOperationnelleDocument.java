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
 * A representation of the model object '<em><b>Type Association Racine Operationnelle Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationRacineOperationnelleDocument#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationRacineOperationnelleDocument#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationRacineOperationnelleDocument#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationRacineOperationnelleDocument#getDescription <em>Description</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationRacineOperationnelleDocument#getAssocieCommeObjetDocument <em>Associe Comme Objet Document</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationRacineOperationnelleDocument#getAssocieCommeSujetRacineOperationnelle <em>Associe Comme Sujet Racine Operationnelle</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationRacineOperationnelleDocument#getEstRapporteeParRapport <em>Est Rapportee Par Rapport</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationRacineOperationnelleDocument()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationRacineOperationnelleDocument' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationRacineOperationnelleDocument extends EObject {
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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationRacineOperationnelleDocument_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationRacineOperationnelleDocument#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationRacineOperationnelleDocument_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationRacineOperationnelleDocument#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationRacineOperationnelleDocument_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationRacineOperationnelleDocumentCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationRacineOperationnelleDocument#getCategorie <em>Categorie</em>}' attribute.
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
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationRacineOperationnelleDocument#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationRacineOperationnelleDocumentCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationRacineOperationnelleDocument#getCategorie <em>Categorie</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationRacineOperationnelleDocument_Description()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='Description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationRacineOperationnelleDocument#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationRacineOperationnelleDocument_AssocieCommeObjetDocument()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='Documente_AssociationRacineOperationnelleDocument' target_entity='type_Document'"
	 *        extendedMetaData="kind='element' name='AssocieCommeObjet_Document'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeObjetDocument();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationRacineOperationnelleDocument#getAssocieCommeObjetDocument <em>Associe Comme Objet Document</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Objet Document</em>' containment reference.
	 * @see #getAssocieCommeObjetDocument()
	 * @generated
	 */
	void setAssocieCommeObjetDocument(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Associe Comme Sujet Racine Operationnelle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Sujet Racine Operationnelle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Sujet Racine Operationnelle</em>' containment reference.
	 * @see #setAssocieCommeSujetRacineOperationnelle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationRacineOperationnelleDocument_AssocieCommeSujetRacineOperationnelle()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourDocumentAssocie_AssociationRacineOperationnelleDocument' target_entity='type_RacineOperationnelle'"
	 *        extendedMetaData="kind='element' name='AssocieCommeSujet_RacineOperationnelle'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeSujetRacineOperationnelle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationRacineOperationnelleDocument#getAssocieCommeSujetRacineOperationnelle <em>Associe Comme Sujet Racine Operationnelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Sujet Racine Operationnelle</em>' containment reference.
	 * @see #getAssocieCommeSujetRacineOperationnelle()
	 * @generated
	 */
	void setAssocieCommeSujetRacineOperationnelle(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Est Rapportee Par Rapport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Rapportee Par Rapport</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Rapportee Par Rapport</em>' containment reference.
	 * @see #setEstRapporteeParRapport(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationRacineOperationnelleDocument_EstRapporteeParRapport()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Rapport'"
	 *        extendedMetaData="kind='element' name='EstRapporteePar_Rapport'"
	 * @generated
	 */
	TypeAssociation getEstRapporteeParRapport();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationRacineOperationnelleDocument#getEstRapporteeParRapport <em>Est Rapportee Par Rapport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Rapportee Par Rapport</em>' containment reference.
	 * @see #getEstRapporteeParRapport()
	 * @generated
	 */
	void setEstRapporteeParRapport(TypeAssociation value);

} // TypeAssociationRacineOperationnelleDocument
