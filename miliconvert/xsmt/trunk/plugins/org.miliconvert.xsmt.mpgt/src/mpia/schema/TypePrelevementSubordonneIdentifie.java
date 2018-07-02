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
 * A representation of the model object '<em><b>Type Prelevement Subordonne Identifie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypePrelevementSubordonneIdentifie#getACommeLienVersFournisseurAssociationEntiteOrgEntiteOrg <em>AComme Lien Vers Fournisseur Association Entite Org Entite Org</em>}</li>
 *   <li>{@link mpia.schema.TypePrelevementSubordonneIdentifie#getACommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg <em>AComme Lien Vers Beneficiaire Association Entite Org Entite Org</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypePrelevementSubordonneIdentifie()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_PrelevementSubordonneIdentifie' kind='elementOnly'"
 * @generated
 */
public interface TypePrelevementSubordonneIdentifie extends TypePrelevementDetachement {
	/**
	 * Returns the value of the '<em><b>AComme Lien Vers Fournisseur Association Entite Org Entite Org</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Lien Vers Fournisseur Association Entite Org Entite Org</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Lien Vers Fournisseur Association Entite Org Entite Org</em>' containment reference.
	 * @see #setACommeLienVersFournisseurAssociationEntiteOrgEntiteOrg(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypePrelevementSubordonneIdentifie_ACommeLienVersFournisseurAssociationEntiteOrgEntiteOrg()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AssociationEntiteOrgEntiteOrg'"
	 *        extendedMetaData="kind='element' name='ACommeLienVersFournisseur_AssociationEntiteOrgEntiteOrg'"
	 * @generated
	 */
	TypeAssociation getACommeLienVersFournisseurAssociationEntiteOrgEntiteOrg();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrelevementSubordonneIdentifie#getACommeLienVersFournisseurAssociationEntiteOrgEntiteOrg <em>AComme Lien Vers Fournisseur Association Entite Org Entite Org</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Lien Vers Fournisseur Association Entite Org Entite Org</em>' containment reference.
	 * @see #getACommeLienVersFournisseurAssociationEntiteOrgEntiteOrg()
	 * @generated
	 */
	void setACommeLienVersFournisseurAssociationEntiteOrgEntiteOrg(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>AComme Lien Vers Beneficiaire Association Entite Org Entite Org</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Lien Vers Beneficiaire Association Entite Org Entite Org</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Lien Vers Beneficiaire Association Entite Org Entite Org</em>' containment reference.
	 * @see #setACommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypePrelevementSubordonneIdentifie_ACommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AssociationEntiteOrgEntiteOrg'"
	 *        extendedMetaData="kind='element' name='ACommeLienVersBeneficiaire_AssociationEntiteOrgEntiteOrg'"
	 * @generated
	 */
	TypeAssociation getACommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrelevementSubordonneIdentifie#getACommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg <em>AComme Lien Vers Beneficiaire Association Entite Org Entite Org</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Lien Vers Beneficiaire Association Entite Org Entite Org</em>' containment reference.
	 * @see #getACommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg()
	 * @generated
	 */
	void setACommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg(TypeAssociation value);

} // TypePrelevementSubordonneIdentifie
