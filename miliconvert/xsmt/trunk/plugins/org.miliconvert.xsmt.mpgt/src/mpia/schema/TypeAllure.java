/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeVitesseLineaire;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Allure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAllure#getAllure <em>Allure</em>}</li>
 *   <li>{@link mpia.schema.TypeAllure#getVitesse <em>Vitesse</em>}</li>
 *   <li>{@link mpia.schema.TypeAllure#getMajorantDistance <em>Majorant Distance</em>}</li>
 *   <li>{@link mpia.schema.TypeAllure#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeAllure#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAllure()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_Allure' kind='elementOnly'"
 * @generated
 */
public interface TypeAllure extends EObject {
	/**
	 * Returns the value of the '<em><b>Allure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allure</em>' attribute.
	 * @see #setAllure(String)
	 * @see mpia.schema.SchemaPackage#getTypeAllure_Allure()
	 * @model dataType="mpia.meta.TypeDataTypeChaine015" required="true"
	 *        extendedMetaData="kind='element' name='Allure'"
	 * @generated
	 */
	String getAllure();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAllure#getAllure <em>Allure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allure</em>' attribute.
	 * @see #getAllure()
	 * @generated
	 */
	void setAllure(String value);

	/**
	 * Returns the value of the '<em><b>Vitesse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vitesse</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vitesse</em>' containment reference.
	 * @see #setVitesse(TypeDataTypeVitesseLineaire)
	 * @see mpia.schema.SchemaPackage#getTypeAllure_Vitesse()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Vitesse'"
	 * @generated
	 */
	TypeDataTypeVitesseLineaire getVitesse();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAllure#getVitesse <em>Vitesse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vitesse</em>' containment reference.
	 * @see #getVitesse()
	 * @generated
	 */
	void setVitesse(TypeDataTypeVitesseLineaire value);

	/**
	 * Returns the value of the '<em><b>Majorant Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Majorant Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Majorant Distance</em>' attribute.
	 * @see #isSetMajorantDistance()
	 * @see #unsetMajorantDistance()
	 * @see #setMajorantDistance(long)
	 * @see mpia.schema.SchemaPackage#getTypeAllure_MajorantDistance()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3" required="true"
	 *        extendedMetaData="kind='element' name='MajorantDistance'"
	 * @generated
	 */
	long getMajorantDistance();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAllure#getMajorantDistance <em>Majorant Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Majorant Distance</em>' attribute.
	 * @see #isSetMajorantDistance()
	 * @see #unsetMajorantDistance()
	 * @see #getMajorantDistance()
	 * @generated
	 */
	void setMajorantDistance(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAllure#getMajorantDistance <em>Majorant Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMajorantDistance()
	 * @see #getMajorantDistance()
	 * @see #setMajorantDistance(long)
	 * @generated
	 */
	void unsetMajorantDistance();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAllure#getMajorantDistance <em>Majorant Distance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Majorant Distance</em>' attribute is set.
	 * @see #unsetMajorantDistance()
	 * @see #getMajorantDistance()
	 * @see #setMajorantDistance(long)
	 * @generated
	 */
	boolean isSetMajorantDistance();

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
	 * @see mpia.schema.SchemaPackage#getTypeAllure_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAllure#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeAllure_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAllure#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

} // TypeAllure
