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
 * A representation of the model object '<em><b>Type Detachement Identifie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeDetachementIdentifie#getTypeDetach <em>Type Detach</em>}</li>
 *   <li>{@link mpia.schema.TypeDetachementIdentifie#getMoyensPersonnel <em>Moyens Personnel</em>}</li>
 *   <li>{@link mpia.schema.TypeDetachementIdentifie#getMoyensEnMateriel <em>Moyens En Materiel</em>}</li>
 *   <li>{@link mpia.schema.TypeDetachementIdentifie#getModaliteMission <em>Modalite Mission</em>}</li>
 *   <li>{@link mpia.schema.TypeDetachementIdentifie#getACommeLienVersOrigineAssociationEntiteOrgEntiteOrg <em>AComme Lien Vers Origine Association Entite Org Entite Org</em>}</li>
 *   <li>{@link mpia.schema.TypeDetachementIdentifie#getACommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg <em>AComme Lien Vers Beneficiaire Association Entite Org Entite Org</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeDetachementIdentifie()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_DetachementIdentifie' kind='elementOnly'"
 * @generated
 */
public interface TypeDetachementIdentifie extends TypePrelevementDetachement {
	/**
	 * Returns the value of the '<em><b>Type Detach</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Detach</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Detach</em>' attribute.
	 * @see #setTypeDetach(String)
	 * @see mpia.schema.SchemaPackage#getTypeDetachementIdentifie_TypeDetach()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080" required="true"
	 *        extendedMetaData="kind='element' name='TypeDetach'"
	 * @generated
	 */
	String getTypeDetach();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDetachementIdentifie#getTypeDetach <em>Type Detach</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Detach</em>' attribute.
	 * @see #getTypeDetach()
	 * @generated
	 */
	void setTypeDetach(String value);

	/**
	 * Returns the value of the '<em><b>Moyens Personnel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moyens Personnel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moyens Personnel</em>' attribute.
	 * @see #setMoyensPersonnel(String)
	 * @see mpia.schema.SchemaPackage#getTypeDetachementIdentifie_MoyensPersonnel()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='MoyensPersonnel'"
	 * @generated
	 */
	String getMoyensPersonnel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDetachementIdentifie#getMoyensPersonnel <em>Moyens Personnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moyens Personnel</em>' attribute.
	 * @see #getMoyensPersonnel()
	 * @generated
	 */
	void setMoyensPersonnel(String value);

	/**
	 * Returns the value of the '<em><b>Moyens En Materiel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moyens En Materiel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moyens En Materiel</em>' attribute.
	 * @see #setMoyensEnMateriel(String)
	 * @see mpia.schema.SchemaPackage#getTypeDetachementIdentifie_MoyensEnMateriel()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='MoyensEnMateriel'"
	 * @generated
	 */
	String getMoyensEnMateriel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDetachementIdentifie#getMoyensEnMateriel <em>Moyens En Materiel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moyens En Materiel</em>' attribute.
	 * @see #getMoyensEnMateriel()
	 * @generated
	 */
	void setMoyensEnMateriel(String value);

	/**
	 * Returns the value of the '<em><b>Modalite Mission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modalite Mission</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modalite Mission</em>' attribute.
	 * @see #setModaliteMission(String)
	 * @see mpia.schema.SchemaPackage#getTypeDetachementIdentifie_ModaliteMission()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='ModaliteMission'"
	 * @generated
	 */
	String getModaliteMission();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDetachementIdentifie#getModaliteMission <em>Modalite Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modalite Mission</em>' attribute.
	 * @see #getModaliteMission()
	 * @generated
	 */
	void setModaliteMission(String value);

	/**
	 * Returns the value of the '<em><b>AComme Lien Vers Origine Association Entite Org Entite Org</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Lien Vers Origine Association Entite Org Entite Org</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Lien Vers Origine Association Entite Org Entite Org</em>' containment reference.
	 * @see #setACommeLienVersOrigineAssociationEntiteOrgEntiteOrg(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeDetachementIdentifie_ACommeLienVersOrigineAssociationEntiteOrgEntiteOrg()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AssociationEntiteOrgEntiteOrg'"
	 *        extendedMetaData="kind='element' name='ACommeLienVersOrigine_AssociationEntiteOrgEntiteOrg'"
	 * @generated
	 */
	TypeAssociation getACommeLienVersOrigineAssociationEntiteOrgEntiteOrg();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDetachementIdentifie#getACommeLienVersOrigineAssociationEntiteOrgEntiteOrg <em>AComme Lien Vers Origine Association Entite Org Entite Org</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Lien Vers Origine Association Entite Org Entite Org</em>' containment reference.
	 * @see #getACommeLienVersOrigineAssociationEntiteOrgEntiteOrg()
	 * @generated
	 */
	void setACommeLienVersOrigineAssociationEntiteOrgEntiteOrg(TypeAssociation value);

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
	 * @see mpia.schema.SchemaPackage#getTypeDetachementIdentifie_ACommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AssociationEntiteOrgEntiteOrg'"
	 *        extendedMetaData="kind='element' name='ACommeLienVersBeneficiaire_AssociationEntiteOrgEntiteOrg'"
	 * @generated
	 */
	TypeAssociation getACommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDetachementIdentifie#getACommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg <em>AComme Lien Vers Beneficiaire Association Entite Org Entite Org</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Lien Vers Beneficiaire Association Entite Org Entite Org</em>' containment reference.
	 * @see #getACommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg()
	 * @generated
	 */
	void setACommeLienVersBeneficiaireAssociationEntiteOrgEntiteOrg(TypeAssociation value);

} // TypeDetachementIdentifie
