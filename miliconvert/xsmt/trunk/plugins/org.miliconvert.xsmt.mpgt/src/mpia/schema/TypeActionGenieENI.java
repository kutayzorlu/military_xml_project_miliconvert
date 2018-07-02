/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Action Genie ENI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeActionGenieENI#getTypeUniteENI <em>Type Unite ENI</em>}</li>
 *   <li>{@link mpia.schema.TypeActionGenieENI#getTypeMissionPossible <em>Type Mission Possible</em>}</li>
 *   <li>{@link mpia.schema.TypeActionGenieENI#getComplement <em>Complement</em>}</li>
 *   <li>{@link mpia.schema.TypeActionGenieENI#getACommeZoneApplicationAutreElementControle <em>AComme Zone Application Autre Element Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeActionGenieENI()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ActionGenieENI' kind='elementOnly'"
 * @generated
 */
public interface TypeActionGenieENI extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Unite ENI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Unite ENI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Unite ENI</em>' attribute.
	 * @see #setTypeUniteENI(String)
	 * @see mpia.schema.SchemaPackage#getTypeActionGenieENI_TypeUniteENI()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='TypeUniteENI'"
	 * @generated
	 */
	String getTypeUniteENI();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeActionGenieENI#getTypeUniteENI <em>Type Unite ENI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Unite ENI</em>' attribute.
	 * @see #getTypeUniteENI()
	 * @generated
	 */
	void setTypeUniteENI(String value);

	/**
	 * Returns the value of the '<em><b>Type Mission Possible</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoActionGenieENITypeMissionPossible}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Mission Possible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Mission Possible</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoActionGenieENITypeMissionPossible
	 * @see #isSetTypeMissionPossible()
	 * @see #unsetTypeMissionPossible()
	 * @see #setTypeMissionPossible(TypeDictionaryDicoActionGenieENITypeMissionPossible)
	 * @see mpia.schema.SchemaPackage#getTypeActionGenieENI_TypeMissionPossible()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeMissionPossible'"
	 * @generated
	 */
	TypeDictionaryDicoActionGenieENITypeMissionPossible getTypeMissionPossible();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeActionGenieENI#getTypeMissionPossible <em>Type Mission Possible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Mission Possible</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoActionGenieENITypeMissionPossible
	 * @see #isSetTypeMissionPossible()
	 * @see #unsetTypeMissionPossible()
	 * @see #getTypeMissionPossible()
	 * @generated
	 */
	void setTypeMissionPossible(TypeDictionaryDicoActionGenieENITypeMissionPossible value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeActionGenieENI#getTypeMissionPossible <em>Type Mission Possible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeMissionPossible()
	 * @see #getTypeMissionPossible()
	 * @see #setTypeMissionPossible(TypeDictionaryDicoActionGenieENITypeMissionPossible)
	 * @generated
	 */
	void unsetTypeMissionPossible();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeActionGenieENI#getTypeMissionPossible <em>Type Mission Possible</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Mission Possible</em>' attribute is set.
	 * @see #unsetTypeMissionPossible()
	 * @see #getTypeMissionPossible()
	 * @see #setTypeMissionPossible(TypeDictionaryDicoActionGenieENITypeMissionPossible)
	 * @generated
	 */
	boolean isSetTypeMissionPossible();

	/**
	 * Returns the value of the '<em><b>Complement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complement</em>' attribute.
	 * @see #setComplement(String)
	 * @see mpia.schema.SchemaPackage#getTypeActionGenieENI_Complement()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='Complement'"
	 * @generated
	 */
	String getComplement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeActionGenieENI#getComplement <em>Complement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complement</em>' attribute.
	 * @see #getComplement()
	 * @generated
	 */
	void setComplement(String value);

	/**
	 * Returns the value of the '<em><b>AComme Zone Application Autre Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Zone Application Autre Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Zone Application Autre Element Controle</em>' containment reference.
	 * @see #setACommeZoneApplicationAutreElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeActionGenieENI_ACommeZoneApplicationAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='ACommeZoneApplication_AutreElementControle'"
	 * @generated
	 */
	TypeAssociation getACommeZoneApplicationAutreElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeActionGenieENI#getACommeZoneApplicationAutreElementControle <em>AComme Zone Application Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Zone Application Autre Element Controle</em>' containment reference.
	 * @see #getACommeZoneApplicationAutreElementControle()
	 * @generated
	 */
	void setACommeZoneApplicationAutreElementControle(TypeAssociation value);

} // TypeActionGenieENI
