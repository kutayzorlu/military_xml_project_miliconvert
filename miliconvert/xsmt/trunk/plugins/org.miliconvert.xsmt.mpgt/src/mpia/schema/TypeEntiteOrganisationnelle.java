/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Entite Organisationnelle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEntiteOrganisationnelle#getCodeIdentification <em>Code Identification</em>}</li>
 *   <li>{@link mpia.schema.TypeEntiteOrganisationnelle#getNationalite <em>Nationalite</em>}</li>
 *   <li>{@link mpia.schema.TypeEntiteOrganisationnelle#getAPourTypeAssocEntiteOrgTypeEntiteOrg <em>APour Type Assoc Entite Org Type Entite Org</em>}</li>
 *   <li>{@link mpia.schema.TypeEntiteOrganisationnelle#getAPourEtatEtatOperationnelEntiteOrganisationnelle <em>APour Etat Etat Operationnel Entite Organisationnelle</em>}</li>
 *   <li>{@link mpia.schema.TypeEntiteOrganisationnelle#getEstSujetAssociationEntiteOrgEntiteOrg <em>Est Sujet Association Entite Org Entite Org</em>}</li>
 *   <li>{@link mpia.schema.TypeEntiteOrganisationnelle#getEstObjetAssociationEntiteOrgEntiteOrg <em>Est Objet Association Entite Org Entite Org</em>}</li>
 *   <li>{@link mpia.schema.TypeEntiteOrganisationnelle#getEstSujetAssociationEntiteOrgMateriel <em>Est Sujet Association Entite Org Materiel</em>}</li>
 *   <li>{@link mpia.schema.TypeEntiteOrganisationnelle#getEstSujetAssociationEntiteOrgPersonne <em>Est Sujet Association Entite Org Personne</em>}</li>
 *   <li>{@link mpia.schema.TypeEntiteOrganisationnelle#getEstSujetAssociationEntiteOrgAction <em>Est Sujet Association Entite Org Action</em>}</li>
 *   <li>{@link mpia.schema.TypeEntiteOrganisationnelle#getEstSujetAssociationEntiteOrgEvenement <em>Est Sujet Association Entite Org Evenement</em>}</li>
 *   <li>{@link mpia.schema.TypeEntiteOrganisationnelle#getEstSujetAssociationEntiteOrgSite <em>Est Sujet Association Entite Org Site</em>}</li>
 *   <li>{@link mpia.schema.TypeEntiteOrganisationnelle#getEstSujetAssociationEntiteOrgEltCtrl <em>Est Sujet Association Entite Org Elt Ctrl</em>}</li>
 *   <li>{@link mpia.schema.TypeEntiteOrganisationnelle#getAPourEtatLiaisonEtatLiaison <em>APour Etat Liaison Etat Liaison</em>}</li>
 *   <li>{@link mpia.schema.TypeEntiteOrganisationnelle#getRedigeRapport <em>Redige Rapport</em>}</li>
 *   <li>{@link mpia.schema.TypeEntiteOrganisationnelle#getEstEntitePlusHautNiveauArticulation <em>Est Entite Plus Haut Niveau Articulation</em>}</li>
 *   <li>{@link mpia.schema.TypeEntiteOrganisationnelle#getEstCreateurRegleEngagement <em>Est Createur Regle Engagement</em>}</li>
 *   <li>{@link mpia.schema.TypeEntiteOrganisationnelle#getARoleDansAssociationEntiteOrganisationnellePlanOuOrdre <em>ARole Dans Association Entite Organisationnelle Plan Ou Ordre</em>}</li>
 *   <li>{@link mpia.schema.TypeEntiteOrganisationnelle#getAPourRoleDansAssociationGroupeInfoOpsEntiteOrganisationnelle <em>APour Role Dans Association Groupe Info Ops Entite Organisationnelle</em>}</li>
 *   <li>{@link mpia.schema.TypeEntiteOrganisationnelle#getEstSujetAssociationEntiteOrgEltTopo <em>Est Sujet Association Entite Org Elt Topo</em>}</li>
 *   <li>{@link mpia.schema.TypeEntiteOrganisationnelle#getEstSujetAssociationEntiteOrgObjetInconnu <em>Est Sujet Association Entite Org Objet Inconnu</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEntiteOrganisationnelle()
 * @model abstract="true"
 *        extendedMetaData="name='type_EntiteOrganisationnelle' kind='elementOnly'"
 * @generated
 */
public interface TypeEntiteOrganisationnelle extends TypeInstanceObjet {
	/**
	 * Returns the value of the '<em><b>Code Identification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Identification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Identification</em>' attribute.
	 * @see #setCodeIdentification(String)
	 * @see mpia.schema.SchemaPackage#getTypeEntiteOrganisationnelle_CodeIdentification()
	 * @model dataType="mpia.meta.TypeDataTypeChaine015"
	 *        extendedMetaData="kind='element' name='CodeIdentification'"
	 * @generated
	 */
	String getCodeIdentification();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEntiteOrganisationnelle#getCodeIdentification <em>Code Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Identification</em>' attribute.
	 * @see #getCodeIdentification()
	 * @generated
	 */
	void setCodeIdentification(String value);

	/**
	 * Returns the value of the '<em><b>Nationalite</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEntitePolitiqueTrigramme}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nationalite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nationalite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEntitePolitiqueTrigramme
	 * @see #isSetNationalite()
	 * @see #unsetNationalite()
	 * @see #setNationalite(TypeDictionaryDicoEntitePolitiqueTrigramme)
	 * @see mpia.schema.SchemaPackage#getTypeEntiteOrganisationnelle_Nationalite()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Nationalite'"
	 * @generated
	 */
	TypeDictionaryDicoEntitePolitiqueTrigramme getNationalite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEntiteOrganisationnelle#getNationalite <em>Nationalite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nationalite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEntitePolitiqueTrigramme
	 * @see #isSetNationalite()
	 * @see #unsetNationalite()
	 * @see #getNationalite()
	 * @generated
	 */
	void setNationalite(TypeDictionaryDicoEntitePolitiqueTrigramme value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEntiteOrganisationnelle#getNationalite <em>Nationalite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNationalite()
	 * @see #getNationalite()
	 * @see #setNationalite(TypeDictionaryDicoEntitePolitiqueTrigramme)
	 * @generated
	 */
	void unsetNationalite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEntiteOrganisationnelle#getNationalite <em>Nationalite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nationalite</em>' attribute is set.
	 * @see #unsetNationalite()
	 * @see #getNationalite()
	 * @see #setNationalite(TypeDictionaryDicoEntitePolitiqueTrigramme)
	 * @generated
	 */
	boolean isSetNationalite();

	/**
	 * Returns the value of the '<em><b>APour Type Assoc Entite Org Type Entite Org</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Type Assoc Entite Org Type Entite Org</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Type Assoc Entite Org Type Entite Org</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEntiteOrganisationnelle_APourTypeAssocEntiteOrgTypeEntiteOrg()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeObjet_EntiteOrganisationnelle' target_entity='type_AssocEntiteOrgTypeEntiteOrg'"
	 *        extendedMetaData="kind='element' name='APourType_AssocEntiteOrgTypeEntiteOrg'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourTypeAssocEntiteOrgTypeEntiteOrg();

	/**
	 * Returns the value of the '<em><b>APour Etat Etat Operationnel Entite Organisationnelle</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeEtatOperationnelEntiteOrganisationnelle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Etat Etat Operationnel Entite Organisationnelle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Etat Etat Operationnel Entite Organisationnelle</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEntiteOrganisationnelle_APourEtatEtatOperationnelEntiteOrganisationnelle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EtatOperationnelEntiteOrganisationnelle'"
	 *        extendedMetaData="kind='element' name='APourEtat_EtatOperationnelEntiteOrganisationnelle'"
	 * @generated
	 */
	EList<TypeEtatOperationnelEntiteOrganisationnelle> getAPourEtatEtatOperationnelEntiteOrganisationnelle();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Entite Org Entite Org</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Entite Org Entite Org</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Entite Org Entite Org</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEntiteOrganisationnelle_EstSujetAssociationEntiteOrgEntiteOrg()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_EntiteOrganisationnelle' target_entity='type_AssociationEntiteOrgEntiteOrg'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationEntiteOrgEntiteOrg'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationEntiteOrgEntiteOrg();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Entite Org Entite Org</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Entite Org Entite Org</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Entite Org Entite Org</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEntiteOrganisationnelle_EstObjetAssociationEntiteOrgEntiteOrg()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_EntiteOrganisationnelle' target_entity='type_AssociationEntiteOrgEntiteOrg'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationEntiteOrgEntiteOrg'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationEntiteOrgEntiteOrg();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Entite Org Materiel</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Entite Org Materiel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Entite Org Materiel</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEntiteOrganisationnelle_EstSujetAssociationEntiteOrgMateriel()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_EntiteOrganisationnelle' target_entity='type_AssociationEntiteOrgMateriel'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationEntiteOrgMateriel'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationEntiteOrgMateriel();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Entite Org Personne</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Entite Org Personne</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Entite Org Personne</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEntiteOrganisationnelle_EstSujetAssociationEntiteOrgPersonne()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_EntiteOrganisationnelle' target_entity='type_AssociationEntiteOrgPersonne'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationEntiteOrgPersonne'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationEntiteOrgPersonne();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Entite Org Action</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Entite Org Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Entite Org Action</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEntiteOrganisationnelle_EstSujetAssociationEntiteOrgAction()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_EntiteOrganisationnelle' target_entity='type_AssociationEntiteOrgAction'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationEntiteOrgAction'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationEntiteOrgAction();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Entite Org Evenement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Entite Org Evenement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Entite Org Evenement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEntiteOrganisationnelle_EstSujetAssociationEntiteOrgEvenement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_EntiteOrganisationnelle' target_entity='type_AssociationEntiteOrgEvenement'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationEntiteOrgEvenement'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationEntiteOrgEvenement();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Entite Org Site</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Entite Org Site</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Entite Org Site</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEntiteOrganisationnelle_EstSujetAssociationEntiteOrgSite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_EntiteOrganisationnelle' target_entity='type_AssociationEntiteOrgSite'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationEntiteOrgSite'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationEntiteOrgSite();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Entite Org Elt Ctrl</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Entite Org Elt Ctrl</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Entite Org Elt Ctrl</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEntiteOrganisationnelle_EstSujetAssociationEntiteOrgEltCtrl()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_EntiteOrganisationnelle' target_entity='type_AssociationEntiteOrgEltCtrl'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationEntiteOrgEltCtrl'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationEntiteOrgEltCtrl();

	/**
	 * Returns the value of the '<em><b>APour Etat Liaison Etat Liaison</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeEtatLiaison}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Etat Liaison Etat Liaison</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Etat Liaison Etat Liaison</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEntiteOrganisationnelle_APourEtatLiaisonEtatLiaison()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EtatLiaison'"
	 *        extendedMetaData="kind='element' name='APourEtatLiaison_EtatLiaison'"
	 * @generated
	 */
	EList<TypeEtatLiaison> getAPourEtatLiaisonEtatLiaison();

	/**
	 * Returns the value of the '<em><b>Redige Rapport</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redige Rapport</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redige Rapport</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEntiteOrganisationnelle_RedigeRapport()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstRedigePar_EntiteOrganisationnelle' target_entity='type_Rapport'"
	 *        extendedMetaData="kind='element' name='Redige_Rapport'"
	 * @generated
	 */
	EList<TypeAssociation> getRedigeRapport();

	/**
	 * Returns the value of the '<em><b>Est Entite Plus Haut Niveau Articulation</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Entite Plus Haut Niveau Articulation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Entite Plus Haut Niveau Articulation</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEntiteOrganisationnelle_EstEntitePlusHautNiveauArticulation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourEntitePlusHautNiveau_EntiteOrganisationnelle' target_entity='type_Articulation'"
	 *        extendedMetaData="kind='element' name='EstEntitePlusHautNiveau_Articulation'"
	 * @generated
	 */
	EList<TypeAssociation> getEstEntitePlusHautNiveauArticulation();

	/**
	 * Returns the value of the '<em><b>Est Createur Regle Engagement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Createur Regle Engagement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Createur Regle Engagement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEntiteOrganisationnelle_EstCreateurRegleEngagement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourCreateur_EntiteOrganisationnelle' target_entity='type_RegleEngagement'"
	 *        extendedMetaData="kind='element' name='EstCreateur_RegleEngagement'"
	 * @generated
	 */
	EList<TypeAssociation> getEstCreateurRegleEngagement();

	/**
	 * Returns the value of the '<em><b>ARole Dans Association Entite Organisationnelle Plan Ou Ordre</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ARole Dans Association Entite Organisationnelle Plan Ou Ordre</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ARole Dans Association Entite Organisationnelle Plan Ou Ordre</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEntiteOrganisationnelle_ARoleDansAssociationEntiteOrganisationnellePlanOuOrdre()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_EntiteOrganisationnelle' target_entity='type_AssociationEntiteOrganisationnellePlanOuOrdre'"
	 *        extendedMetaData="kind='element' name='ARoleDans_AssociationEntiteOrganisationnellePlanOuOrdre'"
	 * @generated
	 */
	EList<TypeAssociation> getARoleDansAssociationEntiteOrganisationnellePlanOuOrdre();

	/**
	 * Returns the value of the '<em><b>APour Role Dans Association Groupe Info Ops Entite Organisationnelle</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Role Dans Association Groupe Info Ops Entite Organisationnelle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Role Dans Association Groupe Info Ops Entite Organisationnelle</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEntiteOrganisationnelle_APourRoleDansAssociationGroupeInfoOpsEntiteOrganisationnelle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeResponsable_EntiteOrganisationnelle' target_entity='type_AssociationGroupeInfoOpsEntiteOrganisationnelle'"
	 *        extendedMetaData="kind='element' name='APourRoleDans_AssociationGroupeInfoOpsEntiteOrganisationnelle'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourRoleDansAssociationGroupeInfoOpsEntiteOrganisationnelle();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Entite Org Elt Topo</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Entite Org Elt Topo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Entite Org Elt Topo</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEntiteOrganisationnelle_EstSujetAssociationEntiteOrgEltTopo()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_EntiteOrganisationnelle' target_entity='type_AssociationEntiteOrgEltTopo'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationEntiteOrgEltTopo'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationEntiteOrgEltTopo();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Entite Org Objet Inconnu</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Entite Org Objet Inconnu</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Entite Org Objet Inconnu</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEntiteOrganisationnelle_EstSujetAssociationEntiteOrgObjetInconnu()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_EntiteOrganisationnelle' target_entity='type_AssociationEntiteOrgObjetInconnu'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationEntiteOrgObjetInconnu'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationEntiteOrgObjetInconnu();

} // TypeEntiteOrganisationnelle
