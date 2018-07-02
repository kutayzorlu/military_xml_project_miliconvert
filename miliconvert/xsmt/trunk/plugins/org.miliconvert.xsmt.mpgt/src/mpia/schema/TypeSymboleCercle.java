/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeLongueur;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Symbole Cercle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeSymboleCercle#getRayon <em>Rayon</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeSymboleCercle()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_SymboleCercle' kind='elementOnly'"
 * @generated
 */
public interface TypeSymboleCercle extends TypeSymboleSurfacique {
	/**
	 * Returns the value of the '<em><b>Rayon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rayon</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rayon</em>' containment reference.
	 * @see #setRayon(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeSymboleCercle_Rayon()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Rayon'"
	 * @generated
	 */
	TypeDataTypeLongueur getRayon();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSymboleCercle#getRayon <em>Rayon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rayon</em>' containment reference.
	 * @see #getRayon()
	 * @generated
	 */
	void setRayon(TypeDataTypeLongueur value);

} // TypeSymboleCercle
