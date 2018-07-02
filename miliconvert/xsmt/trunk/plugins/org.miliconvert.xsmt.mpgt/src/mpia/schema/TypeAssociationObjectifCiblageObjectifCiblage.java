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
 * A representation of the model object '<em><b>Type Association Objectif Ciblage Objectif Ciblage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationObjectifCiblageObjectifCiblage#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationObjectifCiblageObjectifCiblage#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationObjectifCiblageObjectifCiblage#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationObjectifCiblageObjectifCiblage#getAPourObjectifObjetObjectifCiblage <em>APour Objectif Objet Objectif Ciblage</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationObjectifCiblageObjectifCiblage#getAPourObjectifSujetObjectifCiblage <em>APour Objectif Sujet Objectif Ciblage</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationObjectifCiblageObjectifCiblage()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationObjectifCiblageObjectifCiblage' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationObjectifCiblageObjectifCiblage extends EObject {
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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationObjectifCiblageObjectifCiblage_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationObjectifCiblageObjectifCiblage#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationObjectifCiblageObjectifCiblage_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationObjectifCiblageObjectifCiblage#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationObjectifCiblageObjectifCiblageCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationObjectifCiblageObjectifCiblageCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationObjectifCiblageObjectifCiblageCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationObjectifCiblageObjectifCiblage_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationObjectifCiblageObjectifCiblageCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationObjectifCiblageObjectifCiblage#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationObjectifCiblageObjectifCiblageCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationObjectifCiblageObjectifCiblageCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationObjectifCiblageObjectifCiblage#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationObjectifCiblageObjectifCiblageCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationObjectifCiblageObjectifCiblage#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationObjectifCiblageObjectifCiblageCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>APour Objectif Objet Objectif Ciblage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Objectif Objet Objectif Ciblage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Objectif Objet Objectif Ciblage</em>' containment reference.
	 * @see #setAPourObjectifObjetObjectifCiblage(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationObjectifCiblageObjectifCiblage_APourObjectifObjetObjectifCiblage()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='Depend_AssociationObjectifCiblageObjectifCiblage' target_entity='type_ObjectifCiblage'"
	 *        extendedMetaData="kind='element' name='APourObjectifObjet_ObjectifCiblage'"
	 * @generated
	 */
	TypeAssociation getAPourObjectifObjetObjectifCiblage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationObjectifCiblageObjectifCiblage#getAPourObjectifObjetObjectifCiblage <em>APour Objectif Objet Objectif Ciblage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Objectif Objet Objectif Ciblage</em>' containment reference.
	 * @see #getAPourObjectifObjetObjectifCiblage()
	 * @generated
	 */
	void setAPourObjectifObjetObjectifCiblage(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Objectif Sujet Objectif Ciblage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Objectif Sujet Objectif Ciblage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Objectif Sujet Objectif Ciblage</em>' containment reference.
	 * @see #setAPourObjectifSujetObjectifCiblage(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationObjectifCiblageObjectifCiblage_APourObjectifSujetObjectifCiblage()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='Contraint_AssociationObjectifCiblageObjectifCiblage' target_entity='type_ObjectifCiblage'"
	 *        extendedMetaData="kind='element' name='APourObjectifSujet_ObjectifCiblage'"
	 * @generated
	 */
	TypeAssociation getAPourObjectifSujetObjectifCiblage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationObjectifCiblageObjectifCiblage#getAPourObjectifSujetObjectifCiblage <em>APour Objectif Sujet Objectif Ciblage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Objectif Sujet Objectif Ciblage</em>' containment reference.
	 * @see #getAPourObjectifSujetObjectifCiblage()
	 * @generated
	 */
	void setAPourObjectifSujetObjectifCiblage(TypeAssociation value);

} // TypeAssociationObjectifCiblageObjectifCiblage
