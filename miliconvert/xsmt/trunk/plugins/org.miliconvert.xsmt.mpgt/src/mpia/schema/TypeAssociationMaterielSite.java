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
 * A representation of the model object '<em><b>Type Association Materiel Site</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationMaterielSite#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationMaterielSite#getAPourObjetSite <em>APour Objet Site</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationMaterielSite#getAPourSujetMateriel <em>APour Sujet Materiel</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationMaterielSite()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationMaterielSite' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationMaterielSite extends TypeAssociationInstanceObjetInstanceObjet {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationMaterielSiteCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationMaterielSiteCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationMaterielSiteCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationMaterielSite_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationMaterielSiteCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationMaterielSite#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationMaterielSiteCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationMaterielSiteCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationMaterielSite#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationMaterielSiteCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationMaterielSite#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationMaterielSiteCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationMaterielSite_APourObjetSite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationMaterielSite' target_entity='type_Site'"
	 *        extendedMetaData="kind='element' name='APourObjet_Site'"
	 * @generated
	 */
	TypeAssociation getAPourObjetSite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationMaterielSite#getAPourObjetSite <em>APour Objet Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Objet Site</em>' containment reference.
	 * @see #getAPourObjetSite()
	 * @generated
	 */
	void setAPourObjetSite(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Sujet Materiel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Sujet Materiel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Sujet Materiel</em>' containment reference.
	 * @see #setAPourSujetMateriel(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationMaterielSite_APourSujetMateriel()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationMaterielSite' target_entity='type_Materiel'"
	 *        extendedMetaData="kind='element' name='APourSujet_Materiel'"
	 * @generated
	 */
	TypeAssociation getAPourSujetMateriel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationMaterielSite#getAPourSujetMateriel <em>APour Sujet Materiel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Sujet Materiel</em>' containment reference.
	 * @see #getAPourSujetMateriel()
	 * @generated
	 */
	void setAPourSujetMateriel(TypeAssociation value);

} // TypeAssociationMaterielSite
