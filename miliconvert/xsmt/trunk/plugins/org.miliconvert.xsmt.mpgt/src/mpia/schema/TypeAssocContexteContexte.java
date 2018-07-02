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
 * A representation of the model object '<em><b>Type Assoc Contexte Contexte</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssocContexteContexte#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssocContexteContexte#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssocContexteContexte#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssocContexteContexte#getAPourObjetContexte <em>APour Objet Contexte</em>}</li>
 *   <li>{@link mpia.schema.TypeAssocContexteContexte#getAPourEtatEtatAssociation <em>APour Etat Etat Association</em>}</li>
 *   <li>{@link mpia.schema.TypeAssocContexteContexte#getAPourSujetContexte <em>APour Sujet Contexte</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssocContexteContexte()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssocContexteContexte' kind='elementOnly'"
 * @generated
 */
public interface TypeAssocContexteContexte extends EObject {
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
	 * @see mpia.schema.SchemaPackage#getTypeAssocContexteContexte_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssocContexteContexte#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeAssocContexteContexte_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssocContexteContexte#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssocContexteContexteCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssocContexteContexteCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssocContexteContexteCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssocContexteContexte_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssocContexteContexteCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssocContexteContexte#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssocContexteContexteCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssocContexteContexteCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssocContexteContexte#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssocContexteContexteCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssocContexteContexte#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssocContexteContexteCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>APour Objet Contexte</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Objet Contexte</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Objet Contexte</em>' containment reference.
	 * @see #setAPourObjetContexte(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssocContexteContexte_APourObjetContexte()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssocContexteContexte' target_entity='type_Contexte'"
	 *        extendedMetaData="kind='element' name='APourObjet_Contexte'"
	 * @generated
	 */
	TypeAssociation getAPourObjetContexte();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssocContexteContexte#getAPourObjetContexte <em>APour Objet Contexte</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Objet Contexte</em>' containment reference.
	 * @see #getAPourObjetContexte()
	 * @generated
	 */
	void setAPourObjetContexte(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Etat Etat Association</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeEtatAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Etat Etat Association</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Etat Etat Association</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeAssocContexteContexte_APourEtatEtatAssociation()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EtatAssociation'"
	 *        extendedMetaData="kind='element' name='APourEtat_EtatAssociation'"
	 * @generated
	 */
	EList<TypeEtatAssociation> getAPourEtatEtatAssociation();

	/**
	 * Returns the value of the '<em><b>APour Sujet Contexte</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Sujet Contexte</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Sujet Contexte</em>' containment reference.
	 * @see #setAPourSujetContexte(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssocContexteContexte_APourSujetContexte()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssocContexteContexte' target_entity='type_Contexte'"
	 *        extendedMetaData="kind='element' name='APourSujet_Contexte'"
	 * @generated
	 */
	TypeAssociation getAPourSujetContexte();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssocContexteContexte#getAPourSujetContexte <em>APour Sujet Contexte</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Sujet Contexte</em>' containment reference.
	 * @see #getAPourSujetContexte()
	 * @generated
	 */
	void setAPourSujetContexte(TypeAssociation value);

} // TypeAssocContexteContexte
