/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeDuree;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Specialite Personne</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeSpecialitePersonne#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeSpecialitePersonne#getSousCategorie <em>Sous Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeSpecialitePersonne#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeSpecialitePersonne#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeSpecialitePersonne#getFonction <em>Fonction</em>}</li>
 *   <li>{@link mpia.schema.TypeSpecialitePersonne#getNbrHeuresVolCumule <em>Nbr Heures Vol Cumule</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeSpecialitePersonne()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_SpecialitePersonne' kind='elementOnly'"
 * @generated
 */
public interface TypeSpecialitePersonne extends EObject {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoSpecialitePersonneCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoSpecialitePersonneCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoSpecialitePersonneCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeSpecialitePersonne_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoSpecialitePersonneCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSpecialitePersonne#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoSpecialitePersonneCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoSpecialitePersonneCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSpecialitePersonne#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoSpecialitePersonneCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSpecialitePersonne#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoSpecialitePersonneCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Sous Categorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sous Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sous Categorie</em>' attribute.
	 * @see #setSousCategorie(String)
	 * @see mpia.schema.SchemaPackage#getTypeSpecialitePersonne_SousCategorie()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='SousCategorie'"
	 * @generated
	 */
	String getSousCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSpecialitePersonne#getSousCategorie <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sous Categorie</em>' attribute.
	 * @see #getSousCategorie()
	 * @generated
	 */
	void setSousCategorie(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeSpecialitePersonne_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSpecialitePersonne#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeSpecialitePersonne_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSpecialitePersonne#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Fonction</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoSpecialitePersonneFonction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fonction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fonction</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoSpecialitePersonneFonction
	 * @see #isSetFonction()
	 * @see #unsetFonction()
	 * @see #setFonction(TypeDictionaryDicoSpecialitePersonneFonction)
	 * @see mpia.schema.SchemaPackage#getTypeSpecialitePersonne_Fonction()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Fonction'"
	 * @generated
	 */
	TypeDictionaryDicoSpecialitePersonneFonction getFonction();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSpecialitePersonne#getFonction <em>Fonction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fonction</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoSpecialitePersonneFonction
	 * @see #isSetFonction()
	 * @see #unsetFonction()
	 * @see #getFonction()
	 * @generated
	 */
	void setFonction(TypeDictionaryDicoSpecialitePersonneFonction value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSpecialitePersonne#getFonction <em>Fonction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFonction()
	 * @see #getFonction()
	 * @see #setFonction(TypeDictionaryDicoSpecialitePersonneFonction)
	 * @generated
	 */
	void unsetFonction();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSpecialitePersonne#getFonction <em>Fonction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fonction</em>' attribute is set.
	 * @see #unsetFonction()
	 * @see #getFonction()
	 * @see #setFonction(TypeDictionaryDicoSpecialitePersonneFonction)
	 * @generated
	 */
	boolean isSetFonction();

	/**
	 * Returns the value of the '<em><b>Nbr Heures Vol Cumule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nbr Heures Vol Cumule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nbr Heures Vol Cumule</em>' containment reference.
	 * @see #setNbrHeuresVolCumule(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeSpecialitePersonne_NbrHeuresVolCumule()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NbrHeuresVolCumule'"
	 * @generated
	 */
	TypeDataTypeDuree getNbrHeuresVolCumule();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSpecialitePersonne#getNbrHeuresVolCumule <em>Nbr Heures Vol Cumule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nbr Heures Vol Cumule</em>' containment reference.
	 * @see #getNbrHeuresVolCumule()
	 * @generated
	 */
	void setNbrHeuresVolCumule(TypeDataTypeDuree value);

} // TypeSpecialitePersonne
