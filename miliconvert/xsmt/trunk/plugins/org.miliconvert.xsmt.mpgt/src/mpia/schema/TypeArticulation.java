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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Articulation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeArticulation#getNom <em>Nom</em>}</li>
 *   <li>{@link mpia.schema.TypeArticulation#getDescription <em>Description</em>}</li>
 *   <li>{@link mpia.schema.TypeArticulation#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeArticulation#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeArticulation#getAPourEntitePlusHautNiveauEntiteOrganisationnelle <em>APour Entite Plus Haut Niveau Entite Organisationnelle</em>}</li>
 *   <li>{@link mpia.schema.TypeArticulation#getEstConstitueDeAssociationEntiteOrgEntiteOrg <em>Est Constitue De Association Entite Org Entite Org</em>}</li>
 *   <li>{@link mpia.schema.TypeArticulation#getEstConstitueDeAssociationPersonnePersonne <em>Est Constitue De Association Personne Personne</em>}</li>
 *   <li>{@link mpia.schema.TypeArticulation#getEstConstitueDeAssociationEntiteOrgPersonne <em>Est Constitue De Association Entite Org Personne</em>}</li>
 *   <li>{@link mpia.schema.TypeArticulation#getEstRapporteeParRapport <em>Est Rapportee Par Rapport</em>}</li>
 *   <li>{@link mpia.schema.TypeArticulation#getEstSpecifieePourMission <em>Est Specifiee Pour Mission</em>}</li>
 *   <li>{@link mpia.schema.TypeArticulation#getEstSpecifieePourLogistiqueMission <em>Est Specifiee Pour Logistique Mission</em>}</li>
 *   <li>{@link mpia.schema.TypeArticulation#getEstSpecifieePourAction <em>Est Specifiee Pour Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeArticulation()
 * @model abstract="true"
 *        extendedMetaData="name='type_Articulation' kind='elementOnly'"
 * @generated
 */
public interface TypeArticulation extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see mpia.schema.SchemaPackage#getTypeArticulation_Nom()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='Nom'"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeArticulation#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see mpia.schema.SchemaPackage#getTypeArticulation_Description()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='Description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeArticulation#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>CTE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CTE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CTE</em>' attribute.
	 * @see #setCTE(String)
	 * @see mpia.schema.SchemaPackage#getTypeArticulation_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeArticulation#getCTE <em>CTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CTE</em>' attribute.
	 * @see #getCTE()
	 * @generated
	 */
	void setCTE(String value);

	/**
	 * Returns the value of the '<em><b>CE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CE</em>' attribute.
	 * @see #setCE(String)
	 * @see mpia.schema.SchemaPackage#getTypeArticulation_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeArticulation#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Entite Plus Haut Niveau Entite Organisationnelle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Entite Plus Haut Niveau Entite Organisationnelle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Entite Plus Haut Niveau Entite Organisationnelle</em>' containment reference.
	 * @see #setAPourEntitePlusHautNiveauEntiteOrganisationnelle(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeArticulation_APourEntitePlusHautNiveauEntiteOrganisationnelle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstEntitePlusHautNiveau_Articulation' target_entity='type_EntiteOrganisationnelle'"
	 *        extendedMetaData="kind='element' name='APourEntitePlusHautNiveau_EntiteOrganisationnelle'"
	 * @generated
	 */
	TypeAssociationEXT getAPourEntitePlusHautNiveauEntiteOrganisationnelle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeArticulation#getAPourEntitePlusHautNiveauEntiteOrganisationnelle <em>APour Entite Plus Haut Niveau Entite Organisationnelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Entite Plus Haut Niveau Entite Organisationnelle</em>' containment reference.
	 * @see #getAPourEntitePlusHautNiveauEntiteOrganisationnelle()
	 * @generated
	 */
	void setAPourEntitePlusHautNiveauEntiteOrganisationnelle(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>Est Constitue De Association Entite Org Entite Org</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Constitue De Association Entite Org Entite Org</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Constitue De Association Entite Org Entite Org</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeArticulation_EstConstitueDeAssociationEntiteOrgEntiteOrg()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstReferenceeDans_Articulation' target_entity='type_AssociationEntiteOrgEntiteOrg'"
	 *        extendedMetaData="kind='element' name='EstConstitueDe_AssociationEntiteOrgEntiteOrg'"
	 * @generated
	 */
	EList<TypeAssociation> getEstConstitueDeAssociationEntiteOrgEntiteOrg();

	/**
	 * Returns the value of the '<em><b>Est Constitue De Association Personne Personne</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Constitue De Association Personne Personne</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Constitue De Association Personne Personne</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeArticulation_EstConstitueDeAssociationPersonnePersonne()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstReferenceeDans_Articulation' target_entity='type_AssociationPersonnePersonne'"
	 *        extendedMetaData="kind='element' name='EstConstitueDe_AssociationPersonnePersonne'"
	 * @generated
	 */
	EList<TypeAssociation> getEstConstitueDeAssociationPersonnePersonne();

	/**
	 * Returns the value of the '<em><b>Est Constitue De Association Entite Org Personne</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Constitue De Association Entite Org Personne</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Constitue De Association Entite Org Personne</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeArticulation_EstConstitueDeAssociationEntiteOrgPersonne()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstReferenceeDans_Articulation' target_entity='type_AssociationEntiteOrgPersonne'"
	 *        extendedMetaData="kind='element' name='EstConstitueDe_AssociationEntiteOrgPersonne'"
	 * @generated
	 */
	EList<TypeAssociation> getEstConstitueDeAssociationEntiteOrgPersonne();

	/**
	 * Returns the value of the '<em><b>Est Rapportee Par Rapport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Rapportee Par Rapport</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Rapportee Par Rapport</em>' containment reference.
	 * @see #setEstRapporteeParRapport(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeArticulation_EstRapporteeParRapport()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Rapport'"
	 *        extendedMetaData="kind='element' name='EstRapporteePar_Rapport'"
	 * @generated
	 */
	TypeAssociation getEstRapporteeParRapport();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeArticulation#getEstRapporteeParRapport <em>Est Rapportee Par Rapport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Rapportee Par Rapport</em>' containment reference.
	 * @see #getEstRapporteeParRapport()
	 * @generated
	 */
	void setEstRapporteeParRapport(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Est Specifiee Pour Mission</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Specifiee Pour Mission</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Specifiee Pour Mission</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeArticulation_EstSpecifieePourMission()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='ACommeArticulation_Articulation' target_entity='type_Mission'"
	 *        extendedMetaData="kind='element' name='EstSpecifieePour_Mission'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSpecifieePourMission();

	/**
	 * Returns the value of the '<em><b>Est Specifiee Pour Logistique Mission</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Specifiee Pour Logistique Mission</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Specifiee Pour Logistique Mission</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeArticulation_EstSpecifieePourLogistiqueMission()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='ACommeCoordinationMissionEtLogistique_Articulation' target_entity='type_Mission'"
	 *        extendedMetaData="kind='element' name='EstSpecifieePourLogistique_Mission'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSpecifieePourLogistiqueMission();

	/**
	 * Returns the value of the '<em><b>Est Specifiee Pour Action</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Specifiee Pour Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Specifiee Pour Action</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeArticulation_EstSpecifieePourAction()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='Necessite_Articulation' target_entity='type_Action'"
	 *        extendedMetaData="kind='element' name='EstSpecifieePour_Action'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSpecifieePourAction();

} // TypeArticulation
