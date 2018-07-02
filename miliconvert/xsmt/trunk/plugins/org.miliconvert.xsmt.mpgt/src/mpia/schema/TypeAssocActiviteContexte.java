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
 * A representation of the model object '<em><b>Type Assoc Activite Contexte</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssocActiviteContexte#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssocActiviteContexte#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssocActiviteContexte#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssocActiviteContexte#getAssocieCommeActiviteActivite <em>Associe Comme Activite Activite</em>}</li>
 *   <li>{@link mpia.schema.TypeAssocActiviteContexte#getAPourEtatEtatAssociation <em>APour Etat Etat Association</em>}</li>
 *   <li>{@link mpia.schema.TypeAssocActiviteContexte#getAssocieCommeContexteContexte <em>Associe Comme Contexte Contexte</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssocActiviteContexte()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssocActiviteContexte' kind='elementOnly'"
 * @generated
 */
public interface TypeAssocActiviteContexte extends EObject {
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
	 * @see mpia.schema.SchemaPackage#getTypeAssocActiviteContexte_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssocActiviteContexte#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeAssocActiviteContexte_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssocActiviteContexte#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssocActiviteContexteCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssocActiviteContexteCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssocActiviteContexteCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssocActiviteContexte_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssocActiviteContexteCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssocActiviteContexte#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssocActiviteContexteCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssocActiviteContexteCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssocActiviteContexte#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssocActiviteContexteCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssocActiviteContexte#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssocActiviteContexteCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Associe Comme Activite Activite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Activite Activite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Activite Activite</em>' containment reference.
	 * @see #setAssocieCommeActiviteActivite(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssocActiviteContexte_AssocieCommeActiviteActivite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstPlaceeDans_AssocActiviteContexte' target_entity='type_Activite'"
	 *        extendedMetaData="kind='element' name='AssocieCommeActivite_Activite'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeActiviteActivite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssocActiviteContexte#getAssocieCommeActiviteActivite <em>Associe Comme Activite Activite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Activite Activite</em>' containment reference.
	 * @see #getAssocieCommeActiviteActivite()
	 * @generated
	 */
	void setAssocieCommeActiviteActivite(TypeAssociation value);

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
	 * @see mpia.schema.SchemaPackage#getTypeAssocActiviteContexte_APourEtatEtatAssociation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EtatAssociation'"
	 *        extendedMetaData="kind='element' name='APourEtat_EtatAssociation'"
	 * @generated
	 */
	EList<TypeEtatAssociation> getAPourEtatEtatAssociation();

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
	 * @see mpia.schema.SchemaPackage#getTypeAssocActiviteContexte_AssocieCommeContexteContexte()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='FournitContextePour_AssocActiviteContexte' target_entity='type_Contexte'"
	 *        extendedMetaData="kind='element' name='AssocieCommeContexte_Contexte'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeContexteContexte();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssocActiviteContexte#getAssocieCommeContexteContexte <em>Associe Comme Contexte Contexte</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Contexte Contexte</em>' containment reference.
	 * @see #getAssocieCommeContexteContexte()
	 * @generated
	 */
	void setAssocieCommeContexteContexte(TypeAssociation value);

} // TypeAssocActiviteContexte
