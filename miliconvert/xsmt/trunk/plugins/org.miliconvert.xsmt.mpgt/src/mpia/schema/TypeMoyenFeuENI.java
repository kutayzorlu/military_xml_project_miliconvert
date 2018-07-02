/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Moyen Feu ENI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMoyenFeuENI#getTypeMoyenFeuENI <em>Type Moyen Feu ENI</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyenFeuENI#getMoyenFeuENInonRepertorie <em>Moyen Feu EN Inon Repertorie</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyenFeuENI#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyenFeuENI#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMoyenFeuENI()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_MoyenFeuENI' kind='elementOnly'"
 * @generated
 */
public interface TypeMoyenFeuENI extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Moyen Feu ENI</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMoyenFeuENITypeMoyenFeuENI}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Moyen Feu ENI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Moyen Feu ENI</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMoyenFeuENITypeMoyenFeuENI
	 * @see #isSetTypeMoyenFeuENI()
	 * @see #unsetTypeMoyenFeuENI()
	 * @see #setTypeMoyenFeuENI(TypeDictionaryDicoMoyenFeuENITypeMoyenFeuENI)
	 * @see mpia.schema.SchemaPackage#getTypeMoyenFeuENI_TypeMoyenFeuENI()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='TypeMoyenFeuENI'"
	 * @generated
	 */
	TypeDictionaryDicoMoyenFeuENITypeMoyenFeuENI getTypeMoyenFeuENI();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyenFeuENI#getTypeMoyenFeuENI <em>Type Moyen Feu ENI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Moyen Feu ENI</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMoyenFeuENITypeMoyenFeuENI
	 * @see #isSetTypeMoyenFeuENI()
	 * @see #unsetTypeMoyenFeuENI()
	 * @see #getTypeMoyenFeuENI()
	 * @generated
	 */
	void setTypeMoyenFeuENI(TypeDictionaryDicoMoyenFeuENITypeMoyenFeuENI value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMoyenFeuENI#getTypeMoyenFeuENI <em>Type Moyen Feu ENI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeMoyenFeuENI()
	 * @see #getTypeMoyenFeuENI()
	 * @see #setTypeMoyenFeuENI(TypeDictionaryDicoMoyenFeuENITypeMoyenFeuENI)
	 * @generated
	 */
	void unsetTypeMoyenFeuENI();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMoyenFeuENI#getTypeMoyenFeuENI <em>Type Moyen Feu ENI</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Moyen Feu ENI</em>' attribute is set.
	 * @see #unsetTypeMoyenFeuENI()
	 * @see #getTypeMoyenFeuENI()
	 * @see #setTypeMoyenFeuENI(TypeDictionaryDicoMoyenFeuENITypeMoyenFeuENI)
	 * @generated
	 */
	boolean isSetTypeMoyenFeuENI();

	/**
	 * Returns the value of the '<em><b>Moyen Feu EN Inon Repertorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moyen Feu EN Inon Repertorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moyen Feu EN Inon Repertorie</em>' attribute.
	 * @see #setMoyenFeuENInonRepertorie(String)
	 * @see mpia.schema.SchemaPackage#getTypeMoyenFeuENI_MoyenFeuENInonRepertorie()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='MoyenFeuENInonRepertorie'"
	 * @generated
	 */
	String getMoyenFeuENInonRepertorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyenFeuENI#getMoyenFeuENInonRepertorie <em>Moyen Feu EN Inon Repertorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moyen Feu EN Inon Repertorie</em>' attribute.
	 * @see #getMoyenFeuENInonRepertorie()
	 * @generated
	 */
	void setMoyenFeuENInonRepertorie(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeMoyenFeuENI_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyenFeuENI#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeMoyenFeuENI_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyenFeuENI#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

} // TypeMoyenFeuENI
