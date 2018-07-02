/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Association Mesure Coordination Plan Feux</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationMesureCoordinationPlanFeux#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationMesureCoordinationPlanFeux#getAPourSujetMesureCoordination <em>APour Sujet Mesure Coordination</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationMesureCoordinationPlanFeux#getAPourObjetPlanFeux <em>APour Objet Plan Feux</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationMesureCoordinationPlanFeux()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationMesureCoordinationPlanFeux' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationMesureCoordinationPlanFeux extends TypeAssociationInstanceObjetActivite {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationMesureCoordinationPlanFeuxCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationMesureCoordinationPlanFeuxCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationMesureCoordinationPlanFeuxCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationMesureCoordinationPlanFeux_Categorie()
	 * @model unsettable="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationMesureCoordinationPlanFeuxCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationMesureCoordinationPlanFeux#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationMesureCoordinationPlanFeuxCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationMesureCoordinationPlanFeuxCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationMesureCoordinationPlanFeux#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationMesureCoordinationPlanFeuxCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationMesureCoordinationPlanFeux#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationMesureCoordinationPlanFeuxCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>APour Sujet Mesure Coordination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Sujet Mesure Coordination</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Sujet Mesure Coordination</em>' containment reference.
	 * @see #setAPourSujetMesureCoordination(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationMesureCoordinationPlanFeux_APourSujetMesureCoordination()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationMesureCoordinationPlanFeux' target_entity='type_MesureCoordination'"
	 *        extendedMetaData="kind='element' name='APourSujet_MesureCoordination'"
	 * @generated
	 */
	TypeAssociation getAPourSujetMesureCoordination();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationMesureCoordinationPlanFeux#getAPourSujetMesureCoordination <em>APour Sujet Mesure Coordination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Sujet Mesure Coordination</em>' containment reference.
	 * @see #getAPourSujetMesureCoordination()
	 * @generated
	 */
	void setAPourSujetMesureCoordination(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Objet Plan Feux</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Objet Plan Feux</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Objet Plan Feux</em>' containment reference.
	 * @see #setAPourObjetPlanFeux(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationMesureCoordinationPlanFeux_APourObjetPlanFeux()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationMesureCoordinationPlanFeux' target_entity='type_PlanFeux'"
	 *        extendedMetaData="kind='element' name='APourObjet_PlanFeux'"
	 * @generated
	 */
	TypeAssociation getAPourObjetPlanFeux();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationMesureCoordinationPlanFeux#getAPourObjetPlanFeux <em>APour Objet Plan Feux</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Objet Plan Feux</em>' containment reference.
	 * @see #getAPourObjetPlanFeux()
	 * @generated
	 */
	void setAPourObjetPlanFeux(TypeAssociation value);

} // TypeAssociationMesureCoordinationPlanFeux
