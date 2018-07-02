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
 * A representation of the model object '<em><b>Type Association Element Controle Evenement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationElementControleEvenement#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationElementControleEvenement#getAPourSujetElementControle <em>APour Sujet Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationElementControleEvenement#getAPourObjetEvenement <em>APour Objet Evenement</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationElementControleEvenement()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationElementControleEvenement' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationElementControleEvenement extends TypeAssociationInstanceObjetActivite {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationElementControleEvenementCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationElementControleEvenementCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationElementControleEvenementCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationElementControleEvenement_Categorie()
	 * @model unsettable="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationElementControleEvenementCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationElementControleEvenement#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationElementControleEvenementCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationElementControleEvenementCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationElementControleEvenement#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationElementControleEvenementCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationElementControleEvenement#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationElementControleEvenementCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>APour Sujet Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Sujet Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Sujet Element Controle</em>' containment reference.
	 * @see #setAPourSujetElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationElementControleEvenement_APourSujetElementControle()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationElementControleEvenement' target_entity='type_ElementControle'"
	 *        extendedMetaData="kind='element' name='APourSujet_ElementControle'"
	 * @generated
	 */
	TypeAssociation getAPourSujetElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationElementControleEvenement#getAPourSujetElementControle <em>APour Sujet Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Sujet Element Controle</em>' containment reference.
	 * @see #getAPourSujetElementControle()
	 * @generated
	 */
	void setAPourSujetElementControle(TypeAssociation value);

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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationElementControleEvenement_APourObjetEvenement()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationElementControleEvenement' target_entity='type_Evenement'"
	 *        extendedMetaData="kind='element' name='APourObjet_Evenement'"
	 * @generated
	 */
	TypeAssociation getAPourObjetEvenement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationElementControleEvenement#getAPourObjetEvenement <em>APour Objet Evenement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Objet Evenement</em>' containment reference.
	 * @see #getAPourObjetEvenement()
	 * @generated
	 */
	void setAPourObjetEvenement(TypeAssociation value);

} // TypeAssociationElementControleEvenement
