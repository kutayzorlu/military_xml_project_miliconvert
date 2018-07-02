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
 * A representation of the model object '<em><b>Type Assoc Symbole Tactique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssocSymboleTactique#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssocSymboleTactique#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssocSymboleTactique#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssocSymboleTactique#getAssocieCommeSujetSymboleTactique <em>Associe Comme Sujet Symbole Tactique</em>}</li>
 *   <li>{@link mpia.schema.TypeAssocSymboleTactique#getAssocieCommeObjetSymboleTactique <em>Associe Comme Objet Symbole Tactique</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssocSymboleTactique()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssocSymboleTactique' kind='elementOnly'"
 * @generated
 */
public interface TypeAssocSymboleTactique extends EObject {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssocSymboleTactiqueCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssocSymboleTactiqueCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssocSymboleTactiqueCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssocSymboleTactique_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssocSymboleTactiqueCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssocSymboleTactique#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssocSymboleTactiqueCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssocSymboleTactiqueCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssocSymboleTactique#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssocSymboleTactiqueCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssocSymboleTactique#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssocSymboleTactiqueCategorie)
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
	 * @see mpia.schema.SchemaPackage#getTypeAssocSymboleTactique_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssocSymboleTactique#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeAssocSymboleTactique_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssocSymboleTactique#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Associe Comme Sujet Symbole Tactique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Sujet Symbole Tactique</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Sujet Symbole Tactique</em>' containment reference.
	 * @see #setAssocieCommeSujetSymboleTactique(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssocSymboleTactique_AssocieCommeSujetSymboleTactique()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssocSymboleTactique' target_entity='type_SymboleTactique'"
	 *        extendedMetaData="kind='element' name='AssocieCommeSujet_SymboleTactique'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeSujetSymboleTactique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssocSymboleTactique#getAssocieCommeSujetSymboleTactique <em>Associe Comme Sujet Symbole Tactique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Sujet Symbole Tactique</em>' containment reference.
	 * @see #getAssocieCommeSujetSymboleTactique()
	 * @generated
	 */
	void setAssocieCommeSujetSymboleTactique(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Associe Comme Objet Symbole Tactique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Objet Symbole Tactique</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Objet Symbole Tactique</em>' containment reference.
	 * @see #setAssocieCommeObjetSymboleTactique(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssocSymboleTactique_AssocieCommeObjetSymboleTactique()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssocSymboleTactique' target_entity='type_SymboleTactique'"
	 *        extendedMetaData="kind='element' name='AssocieCommeObjet_SymboleTactique'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeObjetSymboleTactique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssocSymboleTactique#getAssocieCommeObjetSymboleTactique <em>Associe Comme Objet Symbole Tactique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Objet Symbole Tactique</em>' containment reference.
	 * @see #getAssocieCommeObjetSymboleTactique()
	 * @generated
	 */
	void setAssocieCommeObjetSymboleTactique(TypeAssociation value);

} // TypeAssocSymboleTactique
