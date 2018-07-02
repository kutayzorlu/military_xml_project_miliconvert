/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Association Entite Org Personne</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationEntiteOrgPersonne#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationEntiteOrgPersonne#getEstReferenceeDansArticulation <em>Est Referencee Dans Articulation</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationEntiteOrgPersonne#getAPourObjetPersonne <em>APour Objet Personne</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationEntiteOrgPersonne#getAPourSujetEntiteOrganisationnelle <em>APour Sujet Entite Organisationnelle</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationEntiteOrgPersonne()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationEntiteOrgPersonne' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationEntiteOrgPersonne extends TypeAssociationInstanceObjetInstanceObjet {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationEntiteOrgPersonneCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationEntiteOrgPersonneCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationEntiteOrgPersonneCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationEntiteOrgPersonne_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationEntiteOrgPersonneCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationEntiteOrgPersonne#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationEntiteOrgPersonneCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationEntiteOrgPersonneCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationEntiteOrgPersonne#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationEntiteOrgPersonneCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationEntiteOrgPersonne#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationEntiteOrgPersonneCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Est Referencee Dans Articulation</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociationEXT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Referencee Dans Articulation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Referencee Dans Articulation</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeAssociationEntiteOrgPersonne_EstReferenceeDansArticulation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstConstitueDe_AssociationEntiteOrgPersonne' target_entity='type_Articulation'"
	 *        extendedMetaData="kind='element' name='EstReferenceeDans_Articulation'"
	 * @generated
	 */
	EList<TypeAssociationEXT> getEstReferenceeDansArticulation();

	/**
	 * Returns the value of the '<em><b>APour Objet Personne</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Objet Personne</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Objet Personne</em>' containment reference.
	 * @see #setAPourObjetPersonne(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationEntiteOrgPersonne_APourObjetPersonne()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationEntiteOrgPersonne' target_entity='type_Personne'"
	 *        extendedMetaData="kind='element' name='APourObjet_Personne'"
	 * @generated
	 */
	TypeAssociation getAPourObjetPersonne();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationEntiteOrgPersonne#getAPourObjetPersonne <em>APour Objet Personne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Objet Personne</em>' containment reference.
	 * @see #getAPourObjetPersonne()
	 * @generated
	 */
	void setAPourObjetPersonne(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Sujet Entite Organisationnelle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Sujet Entite Organisationnelle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Sujet Entite Organisationnelle</em>' containment reference.
	 * @see #setAPourSujetEntiteOrganisationnelle(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationEntiteOrgPersonne_APourSujetEntiteOrganisationnelle()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationEntiteOrgPersonne' target_entity='type_EntiteOrganisationnelle'"
	 *        extendedMetaData="kind='element' name='APourSujet_EntiteOrganisationnelle'"
	 * @generated
	 */
	TypeAssociationEXT getAPourSujetEntiteOrganisationnelle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationEntiteOrgPersonne#getAPourSujetEntiteOrganisationnelle <em>APour Sujet Entite Organisationnelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Sujet Entite Organisationnelle</em>' containment reference.
	 * @see #getAPourSujetEntiteOrganisationnelle()
	 * @generated
	 */
	void setAPourSujetEntiteOrganisationnelle(TypeAssociationEXT value);

} // TypeAssociationEntiteOrgPersonne
