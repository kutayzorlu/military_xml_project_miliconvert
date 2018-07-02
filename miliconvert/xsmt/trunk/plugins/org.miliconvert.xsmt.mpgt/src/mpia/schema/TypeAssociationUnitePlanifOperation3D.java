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
 * A representation of the model object '<em><b>Type Association Unite Planif Operation3 D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationUnitePlanifOperation3D#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationUnitePlanifOperation3D#getAPourSujetUnite <em>APour Sujet Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationUnitePlanifOperation3D#getAPourObjetPlanificationOperation3D <em>APour Objet Planification Operation3 D</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationUnitePlanifOperation3D()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationUnitePlanifOperation3D' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationUnitePlanifOperation3D extends TypeAssociationInstanceObjetActivite {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationUnitePlanifOperation3DCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationUnitePlanifOperation3DCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationUnitePlanifOperation3DCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationUnitePlanifOperation3D_Categorie()
	 * @model unsettable="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationUnitePlanifOperation3DCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationUnitePlanifOperation3D#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationUnitePlanifOperation3DCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationUnitePlanifOperation3DCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationUnitePlanifOperation3D#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationUnitePlanifOperation3DCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationUnitePlanifOperation3D#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationUnitePlanifOperation3DCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>APour Sujet Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Sujet Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Sujet Unite</em>' containment reference.
	 * @see #setAPourSujetUnite(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationUnitePlanifOperation3D_APourSujetUnite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationUnitePlanifOperation3D' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourSujet_Unite'"
	 * @generated
	 */
	TypeAssociation getAPourSujetUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationUnitePlanifOperation3D#getAPourSujetUnite <em>APour Sujet Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Sujet Unite</em>' containment reference.
	 * @see #getAPourSujetUnite()
	 * @generated
	 */
	void setAPourSujetUnite(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Objet Planification Operation3 D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Objet Planification Operation3 D</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Objet Planification Operation3 D</em>' containment reference.
	 * @see #setAPourObjetPlanificationOperation3D(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationUnitePlanifOperation3D_APourObjetPlanificationOperation3D()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationUnitePlanifOperation3D' target_entity='type_PlanificationOperation3D'"
	 *        extendedMetaData="kind='element' name='APourObjet_PlanificationOperation3D'"
	 * @generated
	 */
	TypeAssociation getAPourObjetPlanificationOperation3D();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationUnitePlanifOperation3D#getAPourObjetPlanificationOperation3D <em>APour Objet Planification Operation3 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Objet Planification Operation3 D</em>' containment reference.
	 * @see #getAPourObjetPlanificationOperation3D()
	 * @generated
	 */
	void setAPourObjetPlanificationOperation3D(TypeAssociation value);

} // TypeAssociationUnitePlanifOperation3D
