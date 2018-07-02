/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.meta;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Data Type Longitude</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.meta.TypeDataTypeLongitude#getValue <em>Value</em>}</li>
 *   <li>{@link mpia.meta.TypeDataTypeLongitude#getUnite <em>Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.meta.MetaPackage#getTypeDataTypeLongitude()
 * @model extendedMetaData="name='typeDataTypeLongitude' kind='simple'"
 * @generated
 */
public interface TypeDataTypeLongitude extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(BigDecimal)
	 * @see mpia.meta.MetaPackage#getTypeDataTypeLongitude_Value()
	 * @model dataType="mpia.meta.TypeRestrictionLongitude"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	BigDecimal getValue();

	/**
	 * Sets the value of the '{@link mpia.meta.TypeDataTypeLongitude#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Unite</b></em>' attribute.
	 * The default value is <code>"D"</code>.
	 * The literals are from the enumeration {@link mpia.meta.TypeDictionnaryUniteCode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unite</em>' attribute.
	 * @see mpia.meta.TypeDictionnaryUniteCode
	 * @see #isSetUnite()
	 * @see #unsetUnite()
	 * @see #setUnite(TypeDictionnaryUniteCode)
	 * @see mpia.meta.MetaPackage#getTypeDataTypeLongitude_Unite()
	 * @model default="D" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='Unite'"
	 * @generated
	 */
	TypeDictionnaryUniteCode getUnite();

	/**
	 * Sets the value of the '{@link mpia.meta.TypeDataTypeLongitude#getUnite <em>Unite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unite</em>' attribute.
	 * @see mpia.meta.TypeDictionnaryUniteCode
	 * @see #isSetUnite()
	 * @see #unsetUnite()
	 * @see #getUnite()
	 * @generated
	 */
	void setUnite(TypeDictionnaryUniteCode value);

	/**
	 * Unsets the value of the '{@link mpia.meta.TypeDataTypeLongitude#getUnite <em>Unite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnite()
	 * @see #getUnite()
	 * @see #setUnite(TypeDictionnaryUniteCode)
	 * @generated
	 */
	void unsetUnite();

	/**
	 * Returns whether the value of the '{@link mpia.meta.TypeDataTypeLongitude#getUnite <em>Unite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unite</em>' attribute is set.
	 * @see #unsetUnite()
	 * @see #getUnite()
	 * @see #setUnite(TypeDictionnaryUniteCode)
	 * @generated
	 */
	boolean isSetUnite();

} // TypeDataTypeLongitude
