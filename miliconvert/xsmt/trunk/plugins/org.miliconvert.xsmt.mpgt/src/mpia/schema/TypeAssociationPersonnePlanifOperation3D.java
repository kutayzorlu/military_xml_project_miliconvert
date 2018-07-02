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
 * A representation of the model object '<em><b>Type Association Personne Planif Operation3 D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationPersonnePlanifOperation3D#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationPersonnePlanifOperation3D#getAPourSujetPersonne <em>APour Sujet Personne</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationPersonnePlanifOperation3D#getAPourObjetPlanificationOperation3D <em>APour Objet Planification Operation3 D</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationPersonnePlanifOperation3D()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationPersonnePlanifOperation3D' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationPersonnePlanifOperation3D extends TypeAssociationInstanceObjetActivite {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationPersonnePlanifOperation3DCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationPersonnePlanifOperation3DCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationPersonnePlanifOperation3DCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationPersonnePlanifOperation3D_Categorie()
	 * @model unsettable="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationPersonnePlanifOperation3DCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationPersonnePlanifOperation3D#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationPersonnePlanifOperation3DCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationPersonnePlanifOperation3DCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationPersonnePlanifOperation3D#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationPersonnePlanifOperation3DCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationPersonnePlanifOperation3D#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationPersonnePlanifOperation3DCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>APour Sujet Personne</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Sujet Personne</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Sujet Personne</em>' containment reference.
	 * @see #setAPourSujetPersonne(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationPersonnePlanifOperation3D_APourSujetPersonne()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationPersonnePlanifOperation3D' target_entity='type_Personne'"
	 *        extendedMetaData="kind='element' name='APourSujet_Personne'"
	 * @generated
	 */
	TypeAssociation getAPourSujetPersonne();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationPersonnePlanifOperation3D#getAPourSujetPersonne <em>APour Sujet Personne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Sujet Personne</em>' containment reference.
	 * @see #getAPourSujetPersonne()
	 * @generated
	 */
	void setAPourSujetPersonne(TypeAssociation value);

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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationPersonnePlanifOperation3D_APourObjetPlanificationOperation3D()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationPersonnePlanifOperation3D' target_entity='type_PlanificationOperation3D'"
	 *        extendedMetaData="kind='element' name='APourObjet_PlanificationOperation3D'"
	 * @generated
	 */
	TypeAssociation getAPourObjetPlanificationOperation3D();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationPersonnePlanifOperation3D#getAPourObjetPlanificationOperation3D <em>APour Objet Planification Operation3 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Objet Planification Operation3 D</em>' containment reference.
	 * @see #getAPourObjetPlanificationOperation3D()
	 * @generated
	 */
	void setAPourObjetPlanificationOperation3D(TypeAssociation value);

} // TypeAssociationPersonnePlanifOperation3D
