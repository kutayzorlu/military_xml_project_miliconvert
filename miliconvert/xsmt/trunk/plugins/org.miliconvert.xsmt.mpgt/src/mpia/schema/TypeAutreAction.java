/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Autre Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAutreAction#getActivite <em>Activite</em>}</li>
 *   <li>{@link mpia.schema.TypeAutreAction#getSousActivite <em>Sous Activite</em>}</li>
 *   <li>{@link mpia.schema.TypeAutreAction#getAPourCaracteristiquesActionASAeniActionASAeni <em>APour Caracteristiques Action AS Aeni Action AS Aeni</em>}</li>
 *   <li>{@link mpia.schema.TypeAutreAction#getAPourCaracteristiquesAction3DeniAction3Deni <em>APour Caracteristiques Action3 Deni Action3 Deni</em>}</li>
 *   <li>{@link mpia.schema.TypeAutreAction#getAPourCaracteristiquesActionGenieENIActionGenieENI <em>APour Caracteristiques Action Genie ENI Action Genie ENI</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAutreAction()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AutreAction' kind='elementOnly'"
 * @generated
 */
public interface TypeAutreAction extends TypeAction {
	/**
	 * Returns the value of the '<em><b>Activite</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoActionActivite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoActionActivite
	 * @see #isSetActivite()
	 * @see #unsetActivite()
	 * @see #setActivite(TypeDictionaryDicoActionActivite)
	 * @see mpia.schema.SchemaPackage#getTypeAutreAction_Activite()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Activite'"
	 * @generated
	 */
	TypeDictionaryDicoActionActivite getActivite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAutreAction#getActivite <em>Activite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoActionActivite
	 * @see #isSetActivite()
	 * @see #unsetActivite()
	 * @see #getActivite()
	 * @generated
	 */
	void setActivite(TypeDictionaryDicoActionActivite value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAutreAction#getActivite <em>Activite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActivite()
	 * @see #getActivite()
	 * @see #setActivite(TypeDictionaryDicoActionActivite)
	 * @generated
	 */
	void unsetActivite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAutreAction#getActivite <em>Activite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Activite</em>' attribute is set.
	 * @see #unsetActivite()
	 * @see #getActivite()
	 * @see #setActivite(TypeDictionaryDicoActionActivite)
	 * @generated
	 */
	boolean isSetActivite();

	/**
	 * Returns the value of the '<em><b>Sous Activite</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoActionSousActivite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sous Activite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sous Activite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoActionSousActivite
	 * @see #isSetSousActivite()
	 * @see #unsetSousActivite()
	 * @see #setSousActivite(TypeDictionaryDicoActionSousActivite)
	 * @see mpia.schema.SchemaPackage#getTypeAutreAction_SousActivite()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SousActivite'"
	 * @generated
	 */
	TypeDictionaryDicoActionSousActivite getSousActivite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAutreAction#getSousActivite <em>Sous Activite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sous Activite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoActionSousActivite
	 * @see #isSetSousActivite()
	 * @see #unsetSousActivite()
	 * @see #getSousActivite()
	 * @generated
	 */
	void setSousActivite(TypeDictionaryDicoActionSousActivite value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAutreAction#getSousActivite <em>Sous Activite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSousActivite()
	 * @see #getSousActivite()
	 * @see #setSousActivite(TypeDictionaryDicoActionSousActivite)
	 * @generated
	 */
	void unsetSousActivite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAutreAction#getSousActivite <em>Sous Activite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sous Activite</em>' attribute is set.
	 * @see #unsetSousActivite()
	 * @see #getSousActivite()
	 * @see #setSousActivite(TypeDictionaryDicoActionSousActivite)
	 * @generated
	 */
	boolean isSetSousActivite();

	/**
	 * Returns the value of the '<em><b>APour Caracteristiques Action AS Aeni Action AS Aeni</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Caracteristiques Action AS Aeni Action AS Aeni</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Caracteristiques Action AS Aeni Action AS Aeni</em>' containment reference.
	 * @see #setAPourCaracteristiquesActionASAeniActionASAeni(TypeActionASAeni)
	 * @see mpia.schema.SchemaPackage#getTypeAutreAction_APourCaracteristiquesActionASAeniActionASAeni()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ActionASAeni'"
	 *        extendedMetaData="kind='element' name='APourCaracteristiquesActionASAeni_ActionASAeni'"
	 * @generated
	 */
	TypeActionASAeni getAPourCaracteristiquesActionASAeniActionASAeni();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAutreAction#getAPourCaracteristiquesActionASAeniActionASAeni <em>APour Caracteristiques Action AS Aeni Action AS Aeni</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Caracteristiques Action AS Aeni Action AS Aeni</em>' containment reference.
	 * @see #getAPourCaracteristiquesActionASAeniActionASAeni()
	 * @generated
	 */
	void setAPourCaracteristiquesActionASAeniActionASAeni(TypeActionASAeni value);

	/**
	 * Returns the value of the '<em><b>APour Caracteristiques Action3 Deni Action3 Deni</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Caracteristiques Action3 Deni Action3 Deni</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Caracteristiques Action3 Deni Action3 Deni</em>' containment reference.
	 * @see #setAPourCaracteristiquesAction3DeniAction3Deni(TypeAction3Deni)
	 * @see mpia.schema.SchemaPackage#getTypeAutreAction_APourCaracteristiquesAction3DeniAction3Deni()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Action3Deni'"
	 *        extendedMetaData="kind='element' name='APourCaracteristiquesAction3Deni_Action3Deni'"
	 * @generated
	 */
	TypeAction3Deni getAPourCaracteristiquesAction3DeniAction3Deni();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAutreAction#getAPourCaracteristiquesAction3DeniAction3Deni <em>APour Caracteristiques Action3 Deni Action3 Deni</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Caracteristiques Action3 Deni Action3 Deni</em>' containment reference.
	 * @see #getAPourCaracteristiquesAction3DeniAction3Deni()
	 * @generated
	 */
	void setAPourCaracteristiquesAction3DeniAction3Deni(TypeAction3Deni value);

	/**
	 * Returns the value of the '<em><b>APour Caracteristiques Action Genie ENI Action Genie ENI</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Caracteristiques Action Genie ENI Action Genie ENI</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Caracteristiques Action Genie ENI Action Genie ENI</em>' containment reference.
	 * @see #setAPourCaracteristiquesActionGenieENIActionGenieENI(TypeActionGenieENI)
	 * @see mpia.schema.SchemaPackage#getTypeAutreAction_APourCaracteristiquesActionGenieENIActionGenieENI()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ActionGenieENI'"
	 *        extendedMetaData="kind='element' name='APourCaracteristiquesActionGenieENI_ActionGenieENI'"
	 * @generated
	 */
	TypeActionGenieENI getAPourCaracteristiquesActionGenieENIActionGenieENI();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAutreAction#getAPourCaracteristiquesActionGenieENIActionGenieENI <em>APour Caracteristiques Action Genie ENI Action Genie ENI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Caracteristiques Action Genie ENI Action Genie ENI</em>' containment reference.
	 * @see #getAPourCaracteristiquesActionGenieENIActionGenieENI()
	 * @generated
	 */
	void setAPourCaracteristiquesActionGenieENIActionGenieENI(TypeActionGenieENI value);

} // TypeAutreAction
