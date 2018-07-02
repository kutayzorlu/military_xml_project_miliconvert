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
 * A representation of the model object '<em><b>Type Association Mouvement Par Route Mouvement Par Route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationMouvementParRouteMouvementParRoute#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationMouvementParRouteMouvementParRoute#getAssocieCommeSujetMouvementParRoute <em>Associe Comme Sujet Mouvement Par Route</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationMouvementParRouteMouvementParRoute#getAssocieCommeObjetMouvementParRoute <em>Associe Comme Objet Mouvement Par Route</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationMouvementParRouteMouvementParRoute()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationMouvementParRouteMouvementParRoute' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationMouvementParRouteMouvementParRoute extends TypeAssociationFonctionnelleActivite {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationMouvementParRouteMouvementParRouteCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationMouvementParRouteMouvementParRouteCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationMouvementParRouteMouvementParRouteCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationMouvementParRouteMouvementParRoute_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationMouvementParRouteMouvementParRouteCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationMouvementParRouteMouvementParRoute#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationMouvementParRouteMouvementParRouteCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationMouvementParRouteMouvementParRouteCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationMouvementParRouteMouvementParRoute#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationMouvementParRouteMouvementParRouteCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationMouvementParRouteMouvementParRoute#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationMouvementParRouteMouvementParRouteCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Associe Comme Sujet Mouvement Par Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Sujet Mouvement Par Route</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Sujet Mouvement Par Route</em>' containment reference.
	 * @see #setAssocieCommeSujetMouvementParRoute(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationMouvementParRouteMouvementParRoute_AssocieCommeSujetMouvementParRoute()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationMouvementParRouteMouvementParRoute' target_entity='type_MouvementParRoute'"
	 *        extendedMetaData="kind='element' name='AssocieCommeSujet_MouvementParRoute'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeSujetMouvementParRoute();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationMouvementParRouteMouvementParRoute#getAssocieCommeSujetMouvementParRoute <em>Associe Comme Sujet Mouvement Par Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Sujet Mouvement Par Route</em>' containment reference.
	 * @see #getAssocieCommeSujetMouvementParRoute()
	 * @generated
	 */
	void setAssocieCommeSujetMouvementParRoute(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Associe Comme Objet Mouvement Par Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Objet Mouvement Par Route</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Objet Mouvement Par Route</em>' containment reference.
	 * @see #setAssocieCommeObjetMouvementParRoute(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationMouvementParRouteMouvementParRoute_AssocieCommeObjetMouvementParRoute()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationMouvementParRouteMouvementParRoute' target_entity='type_MouvementParRoute'"
	 *        extendedMetaData="kind='element' name='AssocieCommeObjet_MouvementParRoute'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeObjetMouvementParRoute();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationMouvementParRouteMouvementParRoute#getAssocieCommeObjetMouvementParRoute <em>Associe Comme Objet Mouvement Par Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Objet Mouvement Par Route</em>' containment reference.
	 * @see #getAssocieCommeObjetMouvementParRoute()
	 * @generated
	 */
	void setAssocieCommeObjetMouvementParRoute(TypeAssociation value);

} // TypeAssociationMouvementParRouteMouvementParRoute
