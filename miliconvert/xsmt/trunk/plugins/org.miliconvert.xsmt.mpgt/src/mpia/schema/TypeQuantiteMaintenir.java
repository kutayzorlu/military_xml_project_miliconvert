/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Quantite Maintenir</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeQuantiteMaintenir#getQuantiteAMaintenir <em>Quantite AMaintenir</em>}</li>
 *   <li>{@link mpia.schema.TypeQuantiteMaintenir#getQuantiteStockAMaintenir <em>Quantite Stock AMaintenir</em>}</li>
 *   <li>{@link mpia.schema.TypeQuantiteMaintenir#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeQuantiteMaintenir#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeQuantiteMaintenir#getAmaintenirParUnite <em>Amaintenir Par Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeQuantiteMaintenir()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_QuantiteMaintenir' kind='elementOnly'"
 * @generated
 */
public interface TypeQuantiteMaintenir extends EObject {
	/**
	 * Returns the value of the '<em><b>Quantite AMaintenir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantite AMaintenir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite AMaintenir</em>' attribute.
	 * @see #isSetQuantiteAMaintenir()
	 * @see #unsetQuantiteAMaintenir()
	 * @see #setQuantiteAMaintenir(long)
	 * @see mpia.schema.SchemaPackage#getTypeQuantiteMaintenir_QuantiteAMaintenir()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier9"
	 *        extendedMetaData="kind='element' name='QuantiteAMaintenir'"
	 * @generated
	 */
	long getQuantiteAMaintenir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeQuantiteMaintenir#getQuantiteAMaintenir <em>Quantite AMaintenir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite AMaintenir</em>' attribute.
	 * @see #isSetQuantiteAMaintenir()
	 * @see #unsetQuantiteAMaintenir()
	 * @see #getQuantiteAMaintenir()
	 * @generated
	 */
	void setQuantiteAMaintenir(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeQuantiteMaintenir#getQuantiteAMaintenir <em>Quantite AMaintenir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantiteAMaintenir()
	 * @see #getQuantiteAMaintenir()
	 * @see #setQuantiteAMaintenir(long)
	 * @generated
	 */
	void unsetQuantiteAMaintenir();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeQuantiteMaintenir#getQuantiteAMaintenir <em>Quantite AMaintenir</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantite AMaintenir</em>' attribute is set.
	 * @see #unsetQuantiteAMaintenir()
	 * @see #getQuantiteAMaintenir()
	 * @see #setQuantiteAMaintenir(long)
	 * @generated
	 */
	boolean isSetQuantiteAMaintenir();

	/**
	 * Returns the value of the '<em><b>Quantite Stock AMaintenir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantite Stock AMaintenir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite Stock AMaintenir</em>' attribute.
	 * @see #isSetQuantiteStockAMaintenir()
	 * @see #unsetQuantiteStockAMaintenir()
	 * @see #setQuantiteStockAMaintenir(long)
	 * @see mpia.schema.SchemaPackage#getTypeQuantiteMaintenir_QuantiteStockAMaintenir()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier9"
	 *        extendedMetaData="kind='element' name='QuantiteStockAMaintenir'"
	 * @generated
	 */
	long getQuantiteStockAMaintenir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeQuantiteMaintenir#getQuantiteStockAMaintenir <em>Quantite Stock AMaintenir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite Stock AMaintenir</em>' attribute.
	 * @see #isSetQuantiteStockAMaintenir()
	 * @see #unsetQuantiteStockAMaintenir()
	 * @see #getQuantiteStockAMaintenir()
	 * @generated
	 */
	void setQuantiteStockAMaintenir(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeQuantiteMaintenir#getQuantiteStockAMaintenir <em>Quantite Stock AMaintenir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantiteStockAMaintenir()
	 * @see #getQuantiteStockAMaintenir()
	 * @see #setQuantiteStockAMaintenir(long)
	 * @generated
	 */
	void unsetQuantiteStockAMaintenir();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeQuantiteMaintenir#getQuantiteStockAMaintenir <em>Quantite Stock AMaintenir</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantite Stock AMaintenir</em>' attribute is set.
	 * @see #unsetQuantiteStockAMaintenir()
	 * @see #getQuantiteStockAMaintenir()
	 * @see #setQuantiteStockAMaintenir(long)
	 * @generated
	 */
	boolean isSetQuantiteStockAMaintenir();

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
	 * @see mpia.schema.SchemaPackage#getTypeQuantiteMaintenir_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeQuantiteMaintenir#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeQuantiteMaintenir_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeQuantiteMaintenir#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Amaintenir Par Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amaintenir Par Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amaintenir Par Unite</em>' containment reference.
	 * @see #setAmaintenirParUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeQuantiteMaintenir_AmaintenirParUnite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='AmaintenirPar_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getAmaintenirParUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeQuantiteMaintenir#getAmaintenirParUnite <em>Amaintenir Par Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amaintenir Par Unite</em>' containment reference.
	 * @see #getAmaintenirParUnite()
	 * @generated
	 */
	void setAmaintenirParUnite(TypeAssociationEXT value);

} // TypeQuantiteMaintenir
