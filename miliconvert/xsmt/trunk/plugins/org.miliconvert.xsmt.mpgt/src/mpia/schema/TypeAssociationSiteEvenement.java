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
 * A representation of the model object '<em><b>Type Association Site Evenement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationSiteEvenement#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationSiteEvenement#getAPourSujetSite <em>APour Sujet Site</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationSiteEvenement#getAPourObjetEvenement <em>APour Objet Evenement</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationSiteEvenement()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationSiteEvenement' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationSiteEvenement extends TypeAssociationInstanceObjetActivite {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationSiteEvenementCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationSiteEvenementCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationSiteEvenementCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationSiteEvenement_Categorie()
	 * @model unsettable="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationSiteEvenementCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationSiteEvenement#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationSiteEvenementCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationSiteEvenementCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationSiteEvenement#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationSiteEvenementCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationSiteEvenement#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationSiteEvenementCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>APour Sujet Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Sujet Site</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Sujet Site</em>' containment reference.
	 * @see #setAPourSujetSite(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationSiteEvenement_APourSujetSite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationSiteEvenement' target_entity='type_Site'"
	 *        extendedMetaData="kind='element' name='APourSujet_Site'"
	 * @generated
	 */
	TypeAssociation getAPourSujetSite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationSiteEvenement#getAPourSujetSite <em>APour Sujet Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Sujet Site</em>' containment reference.
	 * @see #getAPourSujetSite()
	 * @generated
	 */
	void setAPourSujetSite(TypeAssociation value);

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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationSiteEvenement_APourObjetEvenement()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationSiteEvenement' target_entity='type_Evenement'"
	 *        extendedMetaData="kind='element' name='APourObjet_Evenement'"
	 * @generated
	 */
	TypeAssociation getAPourObjetEvenement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationSiteEvenement#getAPourObjetEvenement <em>APour Objet Evenement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Objet Evenement</em>' containment reference.
	 * @see #getAPourObjetEvenement()
	 * @generated
	 */
	void setAPourObjetEvenement(TypeAssociation value);

} // TypeAssociationSiteEvenement
