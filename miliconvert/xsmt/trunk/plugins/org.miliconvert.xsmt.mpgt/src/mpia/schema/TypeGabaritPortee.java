/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeLongueur;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Gabarit Portee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeGabaritPortee#getTypePortee <em>Type Portee</em>}</li>
 *   <li>{@link mpia.schema.TypeGabaritPortee#getPorteePratique <em>Portee Pratique</em>}</li>
 *   <li>{@link mpia.schema.TypeGabaritPortee#getPortee <em>Portee</em>}</li>
 *   <li>{@link mpia.schema.TypeGabaritPortee#getMoyenPortee <em>Moyen Portee</em>}</li>
 *   <li>{@link mpia.schema.TypeGabaritPortee#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeGabaritPortee#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeGabaritPortee()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_GabaritPortee' kind='elementOnly'"
 * @generated
 */
public interface TypeGabaritPortee extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Portee</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoGabaritPorteeTypePortee}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Portee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Portee</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoGabaritPorteeTypePortee
	 * @see #isSetTypePortee()
	 * @see #unsetTypePortee()
	 * @see #setTypePortee(TypeDictionaryDicoGabaritPorteeTypePortee)
	 * @see mpia.schema.SchemaPackage#getTypeGabaritPortee_TypePortee()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypePortee'"
	 * @generated
	 */
	TypeDictionaryDicoGabaritPorteeTypePortee getTypePortee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeGabaritPortee#getTypePortee <em>Type Portee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Portee</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoGabaritPorteeTypePortee
	 * @see #isSetTypePortee()
	 * @see #unsetTypePortee()
	 * @see #getTypePortee()
	 * @generated
	 */
	void setTypePortee(TypeDictionaryDicoGabaritPorteeTypePortee value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeGabaritPortee#getTypePortee <em>Type Portee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypePortee()
	 * @see #getTypePortee()
	 * @see #setTypePortee(TypeDictionaryDicoGabaritPorteeTypePortee)
	 * @generated
	 */
	void unsetTypePortee();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeGabaritPortee#getTypePortee <em>Type Portee</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Portee</em>' attribute is set.
	 * @see #unsetTypePortee()
	 * @see #getTypePortee()
	 * @see #setTypePortee(TypeDictionaryDicoGabaritPorteeTypePortee)
	 * @generated
	 */
	boolean isSetTypePortee();

	/**
	 * Returns the value of the '<em><b>Portee Pratique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portee Pratique</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portee Pratique</em>' containment reference.
	 * @see #setPorteePratique(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeGabaritPortee_PorteePratique()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PorteePratique'"
	 * @generated
	 */
	TypeDataTypeLongueur getPorteePratique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeGabaritPortee#getPorteePratique <em>Portee Pratique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portee Pratique</em>' containment reference.
	 * @see #getPorteePratique()
	 * @generated
	 */
	void setPorteePratique(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Portee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portee</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portee</em>' containment reference.
	 * @see #setPortee(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeGabaritPortee_Portee()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Portee'"
	 * @generated
	 */
	TypeDataTypeLongueur getPortee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeGabaritPortee#getPortee <em>Portee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portee</em>' containment reference.
	 * @see #getPortee()
	 * @generated
	 */
	void setPortee(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Moyen Portee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moyen Portee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moyen Portee</em>' attribute.
	 * @see #setMoyenPortee(String)
	 * @see mpia.schema.SchemaPackage#getTypeGabaritPortee_MoyenPortee()
	 * @model dataType="mpia.meta.TypeDataTypeChaine012"
	 *        extendedMetaData="kind='element' name='MoyenPortee'"
	 * @generated
	 */
	String getMoyenPortee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeGabaritPortee#getMoyenPortee <em>Moyen Portee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moyen Portee</em>' attribute.
	 * @see #getMoyenPortee()
	 * @generated
	 */
	void setMoyenPortee(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeGabaritPortee_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeGabaritPortee#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeGabaritPortee_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeGabaritPortee#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

} // TypeGabaritPortee
