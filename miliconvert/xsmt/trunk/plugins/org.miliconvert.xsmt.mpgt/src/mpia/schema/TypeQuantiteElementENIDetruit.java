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
 * A representation of the model object '<em><b>Type Quantite Element ENI Detruit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeQuantiteElementENIDetruit#getQuantite <em>Quantite</em>}</li>
 *   <li>{@link mpia.schema.TypeQuantiteElementENIDetruit#getTypeElement <em>Type Element</em>}</li>
 *   <li>{@link mpia.schema.TypeQuantiteElementENIDetruit#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeQuantiteElementENIDetruit#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeQuantiteElementENIDetruit#getCorrespondAType <em>Correspond AType</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeQuantiteElementENIDetruit()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_QuantiteElementENIDetruit' kind='elementOnly'"
 * @generated
 */
public interface TypeQuantiteElementENIDetruit extends EObject {
	/**
	 * Returns the value of the '<em><b>Quantite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite</em>' attribute.
	 * @see #isSetQuantite()
	 * @see #unsetQuantite()
	 * @see #setQuantite(long)
	 * @see mpia.schema.SchemaPackage#getTypeQuantiteElementENIDetruit_Quantite()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6" required="true"
	 *        extendedMetaData="kind='element' name='Quantite'"
	 * @generated
	 */
	long getQuantite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeQuantiteElementENIDetruit#getQuantite <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite</em>' attribute.
	 * @see #isSetQuantite()
	 * @see #unsetQuantite()
	 * @see #getQuantite()
	 * @generated
	 */
	void setQuantite(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeQuantiteElementENIDetruit#getQuantite <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantite()
	 * @see #getQuantite()
	 * @see #setQuantite(long)
	 * @generated
	 */
	void unsetQuantite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeQuantiteElementENIDetruit#getQuantite <em>Quantite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantite</em>' attribute is set.
	 * @see #unsetQuantite()
	 * @see #getQuantite()
	 * @see #setQuantite(long)
	 * @generated
	 */
	boolean isSetQuantite();

	/**
	 * Returns the value of the '<em><b>Type Element</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Element</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeElement
	 * @see #isSetTypeElement()
	 * @see #unsetTypeElement()
	 * @see #setTypeElement(TypeDictionaryDicoTypeElement)
	 * @see mpia.schema.SchemaPackage#getTypeQuantiteElementENIDetruit_TypeElement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeElement'"
	 * @generated
	 */
	TypeDictionaryDicoTypeElement getTypeElement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeQuantiteElementENIDetruit#getTypeElement <em>Type Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Element</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeElement
	 * @see #isSetTypeElement()
	 * @see #unsetTypeElement()
	 * @see #getTypeElement()
	 * @generated
	 */
	void setTypeElement(TypeDictionaryDicoTypeElement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeQuantiteElementENIDetruit#getTypeElement <em>Type Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeElement()
	 * @see #getTypeElement()
	 * @see #setTypeElement(TypeDictionaryDicoTypeElement)
	 * @generated
	 */
	void unsetTypeElement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeQuantiteElementENIDetruit#getTypeElement <em>Type Element</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Element</em>' attribute is set.
	 * @see #unsetTypeElement()
	 * @see #getTypeElement()
	 * @see #setTypeElement(TypeDictionaryDicoTypeElement)
	 * @generated
	 */
	boolean isSetTypeElement();

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
	 * @see mpia.schema.SchemaPackage#getTypeQuantiteElementENIDetruit_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeQuantiteElementENIDetruit#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeQuantiteElementENIDetruit_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeQuantiteElementENIDetruit#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Correspond AType</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correspond AType</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correspond AType</em>' containment reference.
	 * @see #setCorrespondAType(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeQuantiteElementENIDetruit_CorrespondAType()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Type'"
	 *        extendedMetaData="kind='element' name='CorrespondA_Type'"
	 * @generated
	 */
	TypeAssociationEXT getCorrespondAType();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeQuantiteElementENIDetruit#getCorrespondAType <em>Correspond AType</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correspond AType</em>' containment reference.
	 * @see #getCorrespondAType()
	 * @generated
	 */
	void setCorrespondAType(TypeAssociationEXT value);

} // TypeQuantiteElementENIDetruit
