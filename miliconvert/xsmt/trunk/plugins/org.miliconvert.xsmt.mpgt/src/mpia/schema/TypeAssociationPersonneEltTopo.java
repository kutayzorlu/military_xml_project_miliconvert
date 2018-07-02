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
 * A representation of the model object '<em><b>Type Association Personne Elt Topo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationPersonneEltTopo#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationPersonneEltTopo#getAPourSujetPersonne <em>APour Sujet Personne</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationPersonneEltTopo#getAPourObjetElementTopographie <em>APour Objet Element Topographie</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationPersonneEltTopo()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationPersonneEltTopo' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationPersonneEltTopo extends TypeAssociationInstanceObjetInstanceObjet {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationPersonneEltTopoCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationPersonneEltTopoCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationPersonneEltTopoCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationPersonneEltTopo_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationPersonneEltTopoCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationPersonneEltTopo#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationPersonneEltTopoCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationPersonneEltTopoCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationPersonneEltTopo#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationPersonneEltTopoCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationPersonneEltTopo#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationPersonneEltTopoCategorie)
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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationPersonneEltTopo_APourSujetPersonne()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationPersonneEltTopo' target_entity='type_Personne'"
	 *        extendedMetaData="kind='element' name='APourSujet_Personne'"
	 * @generated
	 */
	TypeAssociation getAPourSujetPersonne();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationPersonneEltTopo#getAPourSujetPersonne <em>APour Sujet Personne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Sujet Personne</em>' containment reference.
	 * @see #getAPourSujetPersonne()
	 * @generated
	 */
	void setAPourSujetPersonne(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Objet Element Topographie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Objet Element Topographie</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Objet Element Topographie</em>' containment reference.
	 * @see #setAPourObjetElementTopographie(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationPersonneEltTopo_APourObjetElementTopographie()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationPersonneEltTopo' target_entity='type_ElementTopographie'"
	 *        extendedMetaData="kind='element' name='APourObjet_ElementTopographie'"
	 * @generated
	 */
	TypeAssociation getAPourObjetElementTopographie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationPersonneEltTopo#getAPourObjetElementTopographie <em>APour Objet Element Topographie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Objet Element Topographie</em>' containment reference.
	 * @see #getAPourObjetElementTopographie()
	 * @generated
	 */
	void setAPourObjetElementTopographie(TypeAssociation value);

} // TypeAssociationPersonneEltTopo
