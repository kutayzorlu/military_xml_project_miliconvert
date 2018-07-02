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
 * A representation of the model object '<em><b>Type Association Element Topographie Evenement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationElementTopographieEvenement#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationElementTopographieEvenement#getAPourSujetElementTopographie <em>APour Sujet Element Topographie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationElementTopographieEvenement#getAPourObjetEvenement <em>APour Objet Evenement</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationElementTopographieEvenement()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationElementTopographieEvenement' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationElementTopographieEvenement extends TypeAssociationInstanceObjetActivite {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationElementTopographieEvenementCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationElementTopographieEvenementCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationElementTopographieEvenementCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationElementTopographieEvenement_Categorie()
	 * @model unsettable="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationElementTopographieEvenementCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationElementTopographieEvenement#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationElementTopographieEvenementCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationElementTopographieEvenementCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationElementTopographieEvenement#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationElementTopographieEvenementCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationElementTopographieEvenement#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationElementTopographieEvenementCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>APour Sujet Element Topographie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Sujet Element Topographie</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Sujet Element Topographie</em>' containment reference.
	 * @see #setAPourSujetElementTopographie(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationElementTopographieEvenement_APourSujetElementTopographie()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationElementTopographieEvenement' target_entity='type_ElementTopographie'"
	 *        extendedMetaData="kind='element' name='APourSujet_ElementTopographie'"
	 * @generated
	 */
	TypeAssociation getAPourSujetElementTopographie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationElementTopographieEvenement#getAPourSujetElementTopographie <em>APour Sujet Element Topographie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Sujet Element Topographie</em>' containment reference.
	 * @see #getAPourSujetElementTopographie()
	 * @generated
	 */
	void setAPourSujetElementTopographie(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Objet Evenement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Objet Evenement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Objet Evenement</em>' containment reference.
	 * @see #setAPourObjetEvenement(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationElementTopographieEvenement_APourObjetEvenement()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationElementTopographieEvenement' target_entity='type_Evenement'"
	 *        extendedMetaData="kind='element' name='APourObjet_Evenement'"
	 * @generated
	 */
	TypeAssociation getAPourObjetEvenement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationElementTopographieEvenement#getAPourObjetEvenement <em>APour Objet Evenement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Objet Evenement</em>' containment reference.
	 * @see #getAPourObjetEvenement()
	 * @generated
	 */
	void setAPourObjetEvenement(TypeAssociation value);

} // TypeAssociationElementTopographieEvenement
