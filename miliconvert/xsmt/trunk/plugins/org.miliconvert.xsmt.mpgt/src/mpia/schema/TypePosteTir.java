/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociationEXT;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Poste Tir</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypePosteTir#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypePosteTir#getEstAssocieTypeMateriel <em>Est Associe Type Materiel</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypePosteTir()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_PosteTir' kind='elementOnly'"
 * @generated
 */
public interface TypePosteTir extends TypeElementControle {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see #setCategorie(String)
	 * @see mpia.schema.SchemaPackage#getTypePosteTir_Categorie()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	String getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePosteTir#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(String value);

	/**
	 * Returns the value of the '<em><b>Est Associe Type Materiel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Associe Type Materiel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Associe Type Materiel</em>' containment reference.
	 * @see #setEstAssocieTypeMateriel(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypePosteTir_EstAssocieTypeMateriel()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeMateriel'"
	 *        extendedMetaData="kind='element' name='EstAssocie_TypeMateriel'"
	 * @generated
	 */
	TypeAssociationEXT getEstAssocieTypeMateriel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePosteTir#getEstAssocieTypeMateriel <em>Est Associe Type Materiel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Associe Type Materiel</em>' containment reference.
	 * @see #getEstAssocieTypeMateriel()
	 * @generated
	 */
	void setEstAssocieTypeMateriel(TypeAssociationEXT value);

} // TypePosteTir
