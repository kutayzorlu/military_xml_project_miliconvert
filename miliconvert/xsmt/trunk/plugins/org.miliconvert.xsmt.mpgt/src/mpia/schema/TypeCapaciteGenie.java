/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeLongueur;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Capacite Genie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCapaciteGenie#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteGenie#getType <em>Type</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteGenie#getSiteHauteur <em>Site Hauteur</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteGenie#getSiteLongueur <em>Site Longueur</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteGenie#getSiteLargeur <em>Site Largeur</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteGenie#getAssocieCommeSiteTypeSite <em>Associe Comme Site Type Site</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCapaciteGenie()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_CapaciteGenie' kind='elementOnly'"
 * @generated
 */
public interface TypeCapaciteGenie extends TypeCapacite {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCapaciteGenieCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteGenieCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoCapaciteGenieCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteGenie_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoCapaciteGenieCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteGenie#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteGenieCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoCapaciteGenieCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapaciteGenie#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoCapaciteGenieCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapaciteGenie#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoCapaciteGenieCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCapaciteGenieType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteGenieType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeDictionaryDicoCapaciteGenieType)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteGenie_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Type'"
	 * @generated
	 */
	TypeDictionaryDicoCapaciteGenieType getType();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteGenie#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteGenieType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeDictionaryDicoCapaciteGenieType value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapaciteGenie#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeDictionaryDicoCapaciteGenieType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapaciteGenie#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeDictionaryDicoCapaciteGenieType)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Site Hauteur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Site Hauteur</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site Hauteur</em>' containment reference.
	 * @see #setSiteHauteur(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteGenie_SiteHauteur()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SiteHauteur'"
	 * @generated
	 */
	TypeDataTypeLongueur getSiteHauteur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteGenie#getSiteHauteur <em>Site Hauteur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site Hauteur</em>' containment reference.
	 * @see #getSiteHauteur()
	 * @generated
	 */
	void setSiteHauteur(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Site Longueur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Site Longueur</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site Longueur</em>' containment reference.
	 * @see #setSiteLongueur(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteGenie_SiteLongueur()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SiteLongueur'"
	 * @generated
	 */
	TypeDataTypeLongueur getSiteLongueur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteGenie#getSiteLongueur <em>Site Longueur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site Longueur</em>' containment reference.
	 * @see #getSiteLongueur()
	 * @generated
	 */
	void setSiteLongueur(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Site Largeur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Site Largeur</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site Largeur</em>' containment reference.
	 * @see #setSiteLargeur(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteGenie_SiteLargeur()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SiteLargeur'"
	 * @generated
	 */
	TypeDataTypeLongueur getSiteLargeur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteGenie#getSiteLargeur <em>Site Largeur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site Largeur</em>' containment reference.
	 * @see #getSiteLargeur()
	 * @generated
	 */
	void setSiteLargeur(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Associe Comme Site Type Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Site Type Site</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Site Type Site</em>' containment reference.
	 * @see #setAssocieCommeSiteTypeSite(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteGenie_AssocieCommeSiteTypeSite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstTypeSiteAssocie_CapaciteGenie' target_entity='type_TypeSite'"
	 *        extendedMetaData="kind='element' name='AssocieCommeSite_TypeSite'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeSiteTypeSite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteGenie#getAssocieCommeSiteTypeSite <em>Associe Comme Site Type Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Site Type Site</em>' containment reference.
	 * @see #getAssocieCommeSiteTypeSite()
	 * @generated
	 */
	void setAssocieCommeSiteTypeSite(TypeAssociation value);

} // TypeCapaciteGenie
