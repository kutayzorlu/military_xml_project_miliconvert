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
 * A representation of the model object '<em><b>Type Association Convoi Mouvement Par Route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationConvoiMouvementParRoute#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationConvoiMouvementParRoute#getAPourSujetConvoi <em>APour Sujet Convoi</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationConvoiMouvementParRoute#getAPourObjetMouvementParRoute <em>APour Objet Mouvement Par Route</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationConvoiMouvementParRoute()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationConvoiMouvementParRoute' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationConvoiMouvementParRoute extends TypeAssociationInstanceObjetActivite {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationConvoiMouvementParRouteCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationConvoiMouvementParRouteCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationConvoiMouvementParRouteCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationConvoiMouvementParRoute_Categorie()
	 * @model unsettable="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationConvoiMouvementParRouteCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationConvoiMouvementParRoute#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationConvoiMouvementParRouteCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationConvoiMouvementParRouteCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationConvoiMouvementParRoute#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationConvoiMouvementParRouteCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationConvoiMouvementParRoute#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationConvoiMouvementParRouteCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>APour Sujet Convoi</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Sujet Convoi</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Sujet Convoi</em>' containment reference.
	 * @see #setAPourSujetConvoi(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationConvoiMouvementParRoute_APourSujetConvoi()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationConvoiMouvementParRoute' target_entity='type_Convoi'"
	 *        extendedMetaData="kind='element' name='APourSujet_Convoi'"
	 * @generated
	 */
	TypeAssociation getAPourSujetConvoi();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationConvoiMouvementParRoute#getAPourSujetConvoi <em>APour Sujet Convoi</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Sujet Convoi</em>' containment reference.
	 * @see #getAPourSujetConvoi()
	 * @generated
	 */
	void setAPourSujetConvoi(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Objet Mouvement Par Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Objet Mouvement Par Route</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Objet Mouvement Par Route</em>' containment reference.
	 * @see #setAPourObjetMouvementParRoute(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationConvoiMouvementParRoute_APourObjetMouvementParRoute()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationConvoiMouvementParRoute' target_entity='type_MouvementParRoute'"
	 *        extendedMetaData="kind='element' name='APourObjet_MouvementParRoute'"
	 * @generated
	 */
	TypeAssociation getAPourObjetMouvementParRoute();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationConvoiMouvementParRoute#getAPourObjetMouvementParRoute <em>APour Objet Mouvement Par Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Objet Mouvement Par Route</em>' containment reference.
	 * @see #getAPourObjetMouvementParRoute()
	 * @generated
	 */
	void setAPourObjetMouvementParRoute(TypeAssociation value);

} // TypeAssociationConvoiMouvementParRoute
