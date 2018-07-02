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
 * A representation of the model object '<em><b>Type Assoc Contexte Instance Objet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssocContexteInstanceObjet#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssocContexteInstanceObjet#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssocContexteInstanceObjet#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssocContexteInstanceObjet#getAPourEtatEtatAssociation <em>APour Etat Etat Association</em>}</li>
 *   <li>{@link mpia.schema.TypeAssocContexteInstanceObjet#getAssocieCommeInstanceObjetInstanceObjet <em>Associe Comme Instance Objet Instance Objet</em>}</li>
 *   <li>{@link mpia.schema.TypeAssocContexteInstanceObjet#getAssocieCommeContexteContexte <em>Associe Comme Contexte Contexte</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssocContexteInstanceObjet()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssocContexteInstanceObjet' kind='elementOnly'"
 * @generated
 */
public interface TypeAssocContexteInstanceObjet extends EObject {
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
	 * @see mpia.schema.SchemaPackage#getTypeAssocContexteInstanceObjet_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssocContexteInstanceObjet#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeAssocContexteInstanceObjet_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssocContexteInstanceObjet#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssocContexteInstanceObjetCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssocContexteInstanceObjetCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssocContexteInstanceObjetCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssocContexteInstanceObjet_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssocContexteInstanceObjetCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssocContexteInstanceObjet#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssocContexteInstanceObjetCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssocContexteInstanceObjetCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssocContexteInstanceObjet#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssocContexteInstanceObjetCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssocContexteInstanceObjet#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssocContexteInstanceObjetCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

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
	 * @see mpia.schema.SchemaPackage#getTypeAssocContexteInstanceObjet_APourEtatEtatAssociation()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EtatAssociation'"
	 *        extendedMetaData="kind='element' name='APourEtat_EtatAssociation'"
	 * @generated
	 */
	EList<TypeEtatAssociation> getAPourEtatEtatAssociation();

	/**
	 * Returns the value of the '<em><b>Associe Comme Instance Objet Instance Objet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Instance Objet Instance Objet</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Instance Objet Instance Objet</em>' containment reference.
	 * @see #setAssocieCommeInstanceObjetInstanceObjet(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssocContexteInstanceObjet_AssocieCommeInstanceObjetInstanceObjet()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstPlaceDans_AssocContexteInstanceObjet' target_entity='type_InstanceObjet'"
	 *        extendedMetaData="kind='element' name='AssocieCommeInstanceObjet_InstanceObjet'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeInstanceObjetInstanceObjet();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssocContexteInstanceObjet#getAssocieCommeInstanceObjetInstanceObjet <em>Associe Comme Instance Objet Instance Objet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Instance Objet Instance Objet</em>' containment reference.
	 * @see #getAssocieCommeInstanceObjetInstanceObjet()
	 * @generated
	 */
	void setAssocieCommeInstanceObjetInstanceObjet(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Associe Comme Contexte Contexte</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Contexte Contexte</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Contexte Contexte</em>' containment reference.
	 * @see #setAssocieCommeContexteContexte(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssocContexteInstanceObjet_AssocieCommeContexteContexte()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='FournitContextePour_AssocContexteInstanceObjet' target_entity='type_Contexte'"
	 *        extendedMetaData="kind='element' name='AssocieCommeContexte_Contexte'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeContexteContexte();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssocContexteInstanceObjet#getAssocieCommeContexteContexte <em>Associe Comme Contexte Contexte</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Contexte Contexte</em>' containment reference.
	 * @see #getAssocieCommeContexteContexte()
	 * @generated
	 */
	void setAssocieCommeContexteContexte(TypeAssociation value);

} // TypeAssocContexteInstanceObjet
