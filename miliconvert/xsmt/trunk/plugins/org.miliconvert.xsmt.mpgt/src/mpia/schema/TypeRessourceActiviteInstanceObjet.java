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
 * A representation of the model object '<em><b>Type Ressource Activite Instance Objet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeRessourceActiviteInstanceObjet#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeRessourceActiviteInstanceObjet#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.TypeRessourceActiviteInstanceObjet#getAssocieCommeInstanceObjetInstanceObjet <em>Associe Comme Instance Objet Instance Objet</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeRessourceActiviteInstanceObjet()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_RessourceActiviteInstanceObjet' kind='elementOnly'"
 * @generated
 */
public interface TypeRessourceActiviteInstanceObjet extends TypeRessourceActivite {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoRessourceActiviteInstanceObjetCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoRessourceActiviteInstanceObjetCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoRessourceActiviteInstanceObjetCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeRessourceActiviteInstanceObjet_Categorie()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoRessourceActiviteInstanceObjetCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRessourceActiviteInstanceObjet#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoRessourceActiviteInstanceObjetCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoRessourceActiviteInstanceObjetCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeRessourceActiviteInstanceObjet#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoRessourceActiviteInstanceObjetCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeRessourceActiviteInstanceObjet#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoRessourceActiviteInstanceObjetCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Commentaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commentaire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commentaire</em>' attribute.
	 * @see #setCommentaire(String)
	 * @see mpia.schema.SchemaPackage#getTypeRessourceActiviteInstanceObjet_Commentaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='Commentaire'"
	 * @generated
	 */
	String getCommentaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRessourceActiviteInstanceObjet#getCommentaire <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commentaire</em>' attribute.
	 * @see #getCommentaire()
	 * @generated
	 */
	void setCommentaire(String value);

	/**
	 * Returns the value of the '<em><b>Associe Comme Instance Objet Instance Objet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Instance Objet Instance Objet</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Instance Objet Instance Objet</em>' containment reference.
	 * @see #setAssocieCommeInstanceObjetInstanceObjet(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeRessourceActiviteInstanceObjet_AssocieCommeInstanceObjetInstanceObjet()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_InstanceObjet'"
	 *        extendedMetaData="kind='element' name='AssocieCommeInstanceObjet_InstanceObjet'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeInstanceObjetInstanceObjet();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRessourceActiviteInstanceObjet#getAssocieCommeInstanceObjetInstanceObjet <em>Associe Comme Instance Objet Instance Objet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Instance Objet Instance Objet</em>' containment reference.
	 * @see #getAssocieCommeInstanceObjetInstanceObjet()
	 * @generated
	 */
	void setAssocieCommeInstanceObjetInstanceObjet(TypeAssociation value);

} // TypeRessourceActiviteInstanceObjet
