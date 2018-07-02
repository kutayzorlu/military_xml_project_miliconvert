/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.meta;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Association EXT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.meta.TypeAssociationEXT#getRefCTE <em>Ref CTE</em>}</li>
 *   <li>{@link mpia.meta.TypeAssociationEXT#getRefEXT <em>Ref EXT</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.meta.MetaPackage#getTypeAssociationEXT()
 * @model extendedMetaData="name='typeAssociationEXT' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationEXT extends EObject {
	/**
	 * Returns the value of the '<em><b>Ref CTE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref CTE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref CTE</em>' attribute.
	 * @see #setRefCTE(String)
	 * @see mpia.meta.MetaPackage#getTypeAssociationEXT_RefCTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='refCTE'"
	 * @generated
	 */
	String getRefCTE();

	/**
	 * Sets the value of the '{@link mpia.meta.TypeAssociationEXT#getRefCTE <em>Ref CTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref CTE</em>' attribute.
	 * @see #getRefCTE()
	 * @generated
	 */
	void setRefCTE(String value);

	/**
	 * Returns the value of the '<em><b>Ref EXT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref EXT</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref EXT</em>' attribute.
	 * @see #setRefEXT(String)
	 * @see mpia.meta.MetaPackage#getTypeAssociationEXT_RefEXT()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='refEXT'"
	 * @generated
	 */
	String getRefEXT();

	/**
	 * Sets the value of the '{@link mpia.meta.TypeAssociationEXT#getRefEXT <em>Ref EXT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref EXT</em>' attribute.
	 * @see #getRefEXT()
	 * @generated
	 */
	void setRefEXT(String value);

} // TypeAssociationEXT
