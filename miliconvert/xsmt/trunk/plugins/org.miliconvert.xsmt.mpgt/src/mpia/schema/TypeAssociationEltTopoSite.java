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
 * A representation of the model object '<em><b>Type Association Elt Topo Site</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationEltTopoSite#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationEltTopoSite#getAPourSujetElementTopographie <em>APour Sujet Element Topographie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationEltTopoSite#getAPourObjetSite <em>APour Objet Site</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationEltTopoSite()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationEltTopoSite' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationEltTopoSite extends TypeAssociationInstanceObjetInstanceObjet {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationEltTopoSiteCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationEltTopoSiteCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationEltTopoSiteCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationEltTopoSite_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationEltTopoSiteCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationEltTopoSite#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationEltTopoSiteCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationEltTopoSiteCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationEltTopoSite#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationEltTopoSiteCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationEltTopoSite#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationEltTopoSiteCategorie)
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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationEltTopoSite_APourSujetElementTopographie()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationEltTopoSite' target_entity='type_ElementTopographie'"
	 *        extendedMetaData="kind='element' name='APourSujet_ElementTopographie'"
	 * @generated
	 */
	TypeAssociation getAPourSujetElementTopographie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationEltTopoSite#getAPourSujetElementTopographie <em>APour Sujet Element Topographie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Sujet Element Topographie</em>' containment reference.
	 * @see #getAPourSujetElementTopographie()
	 * @generated
	 */
	void setAPourSujetElementTopographie(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Objet Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Objet Site</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Objet Site</em>' containment reference.
	 * @see #setAPourObjetSite(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationEltTopoSite_APourObjetSite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationEltTopoSite' target_entity='type_Site'"
	 *        extendedMetaData="kind='element' name='APourObjet_Site'"
	 * @generated
	 */
	TypeAssociation getAPourObjetSite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationEltTopoSite#getAPourObjetSite <em>APour Objet Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Objet Site</em>' containment reference.
	 * @see #getAPourObjetSite()
	 * @generated
	 */
	void setAPourObjetSite(TypeAssociation value);

} // TypeAssociationEltTopoSite
