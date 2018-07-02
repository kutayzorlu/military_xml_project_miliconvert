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
 * A representation of the model object '<em><b>Type Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.meta.TypeAssociation#getRefCTE <em>Ref CTE</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.meta.MetaPackage#getTypeAssociation()
 * @model extendedMetaData="name='typeAssociation' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociation extends EObject {
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
	 * @see mpia.meta.MetaPackage#getTypeAssociation_RefCTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='refCTE'"
	 * @generated
	 */
	String getRefCTE();

	/**
	 * Sets the value of the '{@link mpia.meta.TypeAssociation#getRefCTE <em>Ref CTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref CTE</em>' attribute.
	 * @see #getRefCTE()
	 * @generated
	 */
	void setRefCTE(String value);

} // TypeAssociation
