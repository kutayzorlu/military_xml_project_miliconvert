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
 * A representation of the model object '<em><b>Type Quantite Type Unite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeQuantiteTypeUnite#getQuantiteMin <em>Quantite Min</em>}</li>
 *   <li>{@link mpia.schema.TypeQuantiteTypeUnite#getQuantiteMax <em>Quantite Max</em>}</li>
 *   <li>{@link mpia.schema.TypeQuantiteTypeUnite#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeQuantiteTypeUnite#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeQuantiteTypeUnite#getConcerneTypeUnite <em>Concerne Type Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeQuantiteTypeUnite()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_QuantiteTypeUnite' kind='elementOnly'"
 * @generated
 */
public interface TypeQuantiteTypeUnite extends EObject {
	/**
	 * Returns the value of the '<em><b>Quantite Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantite Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite Min</em>' attribute.
	 * @see #isSetQuantiteMin()
	 * @see #unsetQuantiteMin()
	 * @see #setQuantiteMin(long)
	 * @see mpia.schema.SchemaPackage#getTypeQuantiteTypeUnite_QuantiteMin()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6" required="true"
	 *        extendedMetaData="kind='element' name='QuantiteMin'"
	 * @generated
	 */
	long getQuantiteMin();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeQuantiteTypeUnite#getQuantiteMin <em>Quantite Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite Min</em>' attribute.
	 * @see #isSetQuantiteMin()
	 * @see #unsetQuantiteMin()
	 * @see #getQuantiteMin()
	 * @generated
	 */
	void setQuantiteMin(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeQuantiteTypeUnite#getQuantiteMin <em>Quantite Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantiteMin()
	 * @see #getQuantiteMin()
	 * @see #setQuantiteMin(long)
	 * @generated
	 */
	void unsetQuantiteMin();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeQuantiteTypeUnite#getQuantiteMin <em>Quantite Min</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantite Min</em>' attribute is set.
	 * @see #unsetQuantiteMin()
	 * @see #getQuantiteMin()
	 * @see #setQuantiteMin(long)
	 * @generated
	 */
	boolean isSetQuantiteMin();

	/**
	 * Returns the value of the '<em><b>Quantite Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantite Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite Max</em>' attribute.
	 * @see #isSetQuantiteMax()
	 * @see #unsetQuantiteMax()
	 * @see #setQuantiteMax(long)
	 * @see mpia.schema.SchemaPackage#getTypeQuantiteTypeUnite_QuantiteMax()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='QuantiteMax'"
	 * @generated
	 */
	long getQuantiteMax();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeQuantiteTypeUnite#getQuantiteMax <em>Quantite Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite Max</em>' attribute.
	 * @see #isSetQuantiteMax()
	 * @see #unsetQuantiteMax()
	 * @see #getQuantiteMax()
	 * @generated
	 */
	void setQuantiteMax(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeQuantiteTypeUnite#getQuantiteMax <em>Quantite Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantiteMax()
	 * @see #getQuantiteMax()
	 * @see #setQuantiteMax(long)
	 * @generated
	 */
	void unsetQuantiteMax();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeQuantiteTypeUnite#getQuantiteMax <em>Quantite Max</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantite Max</em>' attribute is set.
	 * @see #unsetQuantiteMax()
	 * @see #getQuantiteMax()
	 * @see #setQuantiteMax(long)
	 * @generated
	 */
	boolean isSetQuantiteMax();

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
	 * @see mpia.schema.SchemaPackage#getTypeQuantiteTypeUnite_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeQuantiteTypeUnite#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeQuantiteTypeUnite_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeQuantiteTypeUnite#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Concerne Type Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Type Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Type Unite</em>' containment reference.
	 * @see #setConcerneTypeUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeQuantiteTypeUnite_ConcerneTypeUnite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeUnite'"
	 *        extendedMetaData="kind='element' name='Concerne_TypeUnite'"
	 * @generated
	 */
	TypeAssociationEXT getConcerneTypeUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeQuantiteTypeUnite#getConcerneTypeUnite <em>Concerne Type Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Type Unite</em>' containment reference.
	 * @see #getConcerneTypeUnite()
	 * @generated
	 */
	void setConcerneTypeUnite(TypeAssociationEXT value);

} // TypeQuantiteTypeUnite
