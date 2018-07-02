/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Association Affiliation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationAffiliationType#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationAffiliationType#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationAffiliationType#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationAffiliationType#getConcerneAffiliationAffiliation <em>Concerne Affiliation Affiliation</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationAffiliationType#getConcerneTypeType <em>Concerne Type Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationAffiliationType()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationAffiliationType' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationAffiliationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationAffiliationTypeCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationAffiliationTypeCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationAffiliationTypeCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationAffiliationType_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationAffiliationTypeCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationAffiliationType#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationAffiliationTypeCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationAffiliationTypeCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationAffiliationType#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationAffiliationTypeCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationAffiliationType#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationAffiliationTypeCategorie)
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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationAffiliationType_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationAffiliationType#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationAffiliationType_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationAffiliationType#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Concerne Affiliation Affiliation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Affiliation Affiliation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Affiliation Affiliation</em>' containment reference.
	 * @see #setConcerneAffiliationAffiliation(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationAffiliationType_ConcerneAffiliationAffiliation()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Affiliation'"
	 *        extendedMetaData="kind='element' name='ConcerneAffiliation_Affiliation'"
	 * @generated
	 */
	TypeAssociationEXT getConcerneAffiliationAffiliation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationAffiliationType#getConcerneAffiliationAffiliation <em>Concerne Affiliation Affiliation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Affiliation Affiliation</em>' containment reference.
	 * @see #getConcerneAffiliationAffiliation()
	 * @generated
	 */
	void setConcerneAffiliationAffiliation(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>Concerne Type Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Type Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Type Type</em>' containment reference.
	 * @see #setConcerneTypeType(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationAffiliationType_ConcerneTypeType()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstAffilieA_AssociationAffiliationType' target_entity='type_Type'"
	 *        extendedMetaData="kind='element' name='ConcerneType_Type'"
	 * @generated
	 */
	TypeAssociation getConcerneTypeType();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationAffiliationType#getConcerneTypeType <em>Concerne Type Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Type Type</em>' containment reference.
	 * @see #getConcerneTypeType()
	 * @generated
	 */
	void setConcerneTypeType(TypeAssociation value);

} // TypeAssociationAffiliationType
