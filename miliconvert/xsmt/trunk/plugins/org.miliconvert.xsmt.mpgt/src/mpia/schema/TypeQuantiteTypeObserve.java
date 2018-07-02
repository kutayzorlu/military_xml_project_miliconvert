/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Quantite Type Observe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeQuantiteTypeObserve#getQuantite <em>Quantite</em>}</li>
 *   <li>{@link mpia.schema.TypeQuantiteTypeObserve#getTypeElement <em>Type Element</em>}</li>
 *   <li>{@link mpia.schema.TypeQuantiteTypeObserve#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeQuantiteTypeObserve#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeQuantiteTypeObserve#getConcerneType <em>Concerne Type</em>}</li>
 *   <li>{@link mpia.schema.TypeQuantiteTypeObserve#getAPourNationaliteEntitePolitique <em>APour Nationalite Entite Politique</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeQuantiteTypeObserve()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_QuantiteTypeObserve' kind='elementOnly'"
 * @generated
 */
public interface TypeQuantiteTypeObserve extends EObject {
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
	 * @see mpia.schema.SchemaPackage#getTypeQuantiteTypeObserve_Quantite()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6" required="true"
	 *        extendedMetaData="kind='element' name='Quantite'"
	 * @generated
	 */
	long getQuantite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeQuantiteTypeObserve#getQuantite <em>Quantite</em>}' attribute.
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
	 * Unsets the value of the '{@link mpia.schema.TypeQuantiteTypeObserve#getQuantite <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantite()
	 * @see #getQuantite()
	 * @see #setQuantite(long)
	 * @generated
	 */
	void unsetQuantite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeQuantiteTypeObserve#getQuantite <em>Quantite</em>}' attribute is set.
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
	 * @see mpia.schema.SchemaPackage#getTypeQuantiteTypeObserve_TypeElement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeElement'"
	 * @generated
	 */
	TypeDictionaryDicoTypeElement getTypeElement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeQuantiteTypeObserve#getTypeElement <em>Type Element</em>}' attribute.
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
	 * Unsets the value of the '{@link mpia.schema.TypeQuantiteTypeObserve#getTypeElement <em>Type Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeElement()
	 * @see #getTypeElement()
	 * @see #setTypeElement(TypeDictionaryDicoTypeElement)
	 * @generated
	 */
	void unsetTypeElement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeQuantiteTypeObserve#getTypeElement <em>Type Element</em>}' attribute is set.
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
	 * @see mpia.schema.SchemaPackage#getTypeQuantiteTypeObserve_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeQuantiteTypeObserve#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeQuantiteTypeObserve_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeQuantiteTypeObserve#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Concerne Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Type</em>' containment reference.
	 * @see #setConcerneType(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeQuantiteTypeObserve_ConcerneType()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Type'"
	 *        extendedMetaData="kind='element' name='Concerne_Type'"
	 * @generated
	 */
	TypeAssociationEXT getConcerneType();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeQuantiteTypeObserve#getConcerneType <em>Concerne Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Type</em>' containment reference.
	 * @see #getConcerneType()
	 * @generated
	 */
	void setConcerneType(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>APour Nationalite Entite Politique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Nationalite Entite Politique</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Nationalite Entite Politique</em>' containment reference.
	 * @see #setAPourNationaliteEntitePolitique(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeQuantiteTypeObserve_APourNationaliteEntitePolitique()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_EntitePolitique'"
	 *        extendedMetaData="kind='element' name='APourNationalite_EntitePolitique'"
	 * @generated
	 */
	TypeAssociation getAPourNationaliteEntitePolitique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeQuantiteTypeObserve#getAPourNationaliteEntitePolitique <em>APour Nationalite Entite Politique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Nationalite Entite Politique</em>' containment reference.
	 * @see #getAPourNationaliteEntitePolitique()
	 * @generated
	 */
	void setAPourNationaliteEntitePolitique(TypeAssociation value);

} // TypeQuantiteTypeObserve
