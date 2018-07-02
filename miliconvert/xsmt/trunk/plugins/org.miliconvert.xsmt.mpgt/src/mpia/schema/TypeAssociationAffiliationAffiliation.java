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
 * A representation of the model object '<em><b>Type Association Affiliation Affiliation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationAffiliationAffiliation#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationAffiliationAffiliation#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationAffiliationAffiliation#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationAffiliationAffiliation#getComportement <em>Comportement</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationAffiliationAffiliation#getAssocieCommeObjetAffiliation <em>Associe Comme Objet Affiliation</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationAffiliationAffiliation#getAssocieCommeSujetAffiliation <em>Associe Comme Sujet Affiliation</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationAffiliationAffiliation()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationAffiliationAffiliation' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationAffiliationAffiliation extends EObject {
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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationAffiliationAffiliation_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationAffiliationAffiliation#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationAffiliationAffiliation_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationAffiliationAffiliation#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationAffiliationAffiliationCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationAffiliationAffiliationCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationAffiliationAffiliationCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationAffiliationAffiliation_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationAffiliationAffiliationCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationAffiliationAffiliation#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationAffiliationAffiliationCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationAffiliationAffiliationCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationAffiliationAffiliation#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationAffiliationAffiliationCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationAffiliationAffiliation#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationAffiliationAffiliationCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Comportement</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationAffiliationComportement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comportement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comportement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationAffiliationComportement
	 * @see #isSetComportement()
	 * @see #unsetComportement()
	 * @see #setComportement(TypeDictionaryDicoAssociationAffiliationComportement)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationAffiliationAffiliation_Comportement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Comportement'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationAffiliationComportement getComportement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationAffiliationAffiliation#getComportement <em>Comportement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comportement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationAffiliationComportement
	 * @see #isSetComportement()
	 * @see #unsetComportement()
	 * @see #getComportement()
	 * @generated
	 */
	void setComportement(TypeDictionaryDicoAssociationAffiliationComportement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationAffiliationAffiliation#getComportement <em>Comportement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetComportement()
	 * @see #getComportement()
	 * @see #setComportement(TypeDictionaryDicoAssociationAffiliationComportement)
	 * @generated
	 */
	void unsetComportement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationAffiliationAffiliation#getComportement <em>Comportement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Comportement</em>' attribute is set.
	 * @see #unsetComportement()
	 * @see #getComportement()
	 * @see #setComportement(TypeDictionaryDicoAssociationAffiliationComportement)
	 * @generated
	 */
	boolean isSetComportement();

	/**
	 * Returns the value of the '<em><b>Associe Comme Objet Affiliation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Objet Affiliation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Objet Affiliation</em>' containment reference.
	 * @see #setAssocieCommeObjetAffiliation(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationAffiliationAffiliation_AssocieCommeObjetAffiliation()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationAffiliationAffiliation' target_entity='type_Affiliation'"
	 *        extendedMetaData="kind='element' name='AssocieCommeObjet_Affiliation'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeObjetAffiliation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationAffiliationAffiliation#getAssocieCommeObjetAffiliation <em>Associe Comme Objet Affiliation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Objet Affiliation</em>' containment reference.
	 * @see #getAssocieCommeObjetAffiliation()
	 * @generated
	 */
	void setAssocieCommeObjetAffiliation(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Associe Comme Sujet Affiliation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Sujet Affiliation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Sujet Affiliation</em>' containment reference.
	 * @see #setAssocieCommeSujetAffiliation(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationAffiliationAffiliation_AssocieCommeSujetAffiliation()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationAffiliationAffiliation' target_entity='type_Affiliation'"
	 *        extendedMetaData="kind='element' name='AssocieCommeSujet_Affiliation'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeSujetAffiliation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationAffiliationAffiliation#getAssocieCommeSujetAffiliation <em>Associe Comme Sujet Affiliation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Sujet Affiliation</em>' containment reference.
	 * @see #getAssocieCommeSujetAffiliation()
	 * @generated
	 */
	void setAssocieCommeSujetAffiliation(TypeAssociation value);

} // TypeAssociationAffiliationAffiliation
