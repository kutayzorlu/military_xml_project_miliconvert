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
 * A representation of the model object '<em><b>Type Objet Inconnu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeObjetInconnu#getNationalite <em>Nationalite</em>}</li>
 *   <li>{@link mpia.schema.TypeObjetInconnu#getAPourEtatEtatOperationnelObjetInconnu <em>APour Etat Etat Operationnel Objet Inconnu</em>}</li>
 *   <li>{@link mpia.schema.TypeObjetInconnu#getEstSujetAssociationObjetInconnuEltCtrl <em>Est Sujet Association Objet Inconnu Elt Ctrl</em>}</li>
 *   <li>{@link mpia.schema.TypeObjetInconnu#getEstSujetAssociationObjetInconnuEltTopo <em>Est Sujet Association Objet Inconnu Elt Topo</em>}</li>
 *   <li>{@link mpia.schema.TypeObjetInconnu#getEstSujetAssociationObjetInconnuSite <em>Est Sujet Association Objet Inconnu Site</em>}</li>
 *   <li>{@link mpia.schema.TypeObjetInconnu#getEstObjetAssociationEntiteOrgObjetInconnu <em>Est Objet Association Entite Org Objet Inconnu</em>}</li>
 *   <li>{@link mpia.schema.TypeObjetInconnu#getEstObjetAssociationPersonneObjetInconnu <em>Est Objet Association Personne Objet Inconnu</em>}</li>
 *   <li>{@link mpia.schema.TypeObjetInconnu#getEstObjetAssociationSiteObjetInconnu <em>Est Objet Association Site Objet Inconnu</em>}</li>
 *   <li>{@link mpia.schema.TypeObjetInconnu#getEstObjetAssociationMaterielObjetInconnu <em>Est Objet Association Materiel Objet Inconnu</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeObjetInconnu()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_ObjetInconnu' kind='elementOnly'"
 * @generated
 */
public interface TypeObjetInconnu extends TypeInstanceObjet {
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
	 * @see mpia.schema.SchemaPackage#getTypeObjetInconnu_Nationalite()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Nationalite'"
	 * @generated
	 */
	TypeDictionaryDicoEntitePolitiqueTrigramme getNationalite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjetInconnu#getNationalite <em>Nationalite</em>}' attribute.
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
	 * Unsets the value of the '{@link mpia.schema.TypeObjetInconnu#getNationalite <em>Nationalite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNationalite()
	 * @see #getNationalite()
	 * @see #setNationalite(TypeDictionaryDicoEntitePolitiqueTrigramme)
	 * @generated
	 */
	void unsetNationalite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeObjetInconnu#getNationalite <em>Nationalite</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>APour Etat Etat Operationnel Objet Inconnu</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeEtatOperationnelObjetInconnu}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Etat Etat Operationnel Objet Inconnu</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Etat Etat Operationnel Objet Inconnu</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeObjetInconnu_APourEtatEtatOperationnelObjetInconnu()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EtatOperationnelObjetInconnu'"
	 *        extendedMetaData="kind='element' name='APourEtat_EtatOperationnelObjetInconnu'"
	 * @generated
	 */
	EList<TypeEtatOperationnelObjetInconnu> getAPourEtatEtatOperationnelObjetInconnu();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Objet Inconnu Elt Ctrl</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Objet Inconnu Elt Ctrl</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Objet Inconnu Elt Ctrl</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeObjetInconnu_EstSujetAssociationObjetInconnuEltCtrl()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_ObjetInconnu' target_entity='type_AssociationObjetInconnuEltCtrl'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationObjetInconnuEltCtrl'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationObjetInconnuEltCtrl();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Objet Inconnu Elt Topo</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Objet Inconnu Elt Topo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Objet Inconnu Elt Topo</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeObjetInconnu_EstSujetAssociationObjetInconnuEltTopo()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_ObjetInconnu' target_entity='type_AssociationObjetInconnuEltTopo'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationObjetInconnuEltTopo'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationObjetInconnuEltTopo();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Objet Inconnu Site</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Objet Inconnu Site</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Objet Inconnu Site</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeObjetInconnu_EstSujetAssociationObjetInconnuSite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_ObjetInconnu' target_entity='type_AssociationObjetInconnuSite'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationObjetInconnuSite'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationObjetInconnuSite();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Entite Org Objet Inconnu</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Entite Org Objet Inconnu</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Entite Org Objet Inconnu</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeObjetInconnu_EstObjetAssociationEntiteOrgObjetInconnu()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_ObjetInconnu' target_entity='type_AssociationEntiteOrgObjetInconnu'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationEntiteOrgObjetInconnu'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationEntiteOrgObjetInconnu();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Personne Objet Inconnu</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Personne Objet Inconnu</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Personne Objet Inconnu</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeObjetInconnu_EstObjetAssociationPersonneObjetInconnu()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_ObjetInconnu' target_entity='type_AssociationPersonneObjetInconnu'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationPersonneObjetInconnu'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationPersonneObjetInconnu();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Site Objet Inconnu</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Site Objet Inconnu</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Site Objet Inconnu</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeObjetInconnu_EstObjetAssociationSiteObjetInconnu()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_ObjetInconnu' target_entity='type_AssociationSiteObjetInconnu'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationSiteObjetInconnu'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationSiteObjetInconnu();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Materiel Objet Inconnu</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Materiel Objet Inconnu</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Materiel Objet Inconnu</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeObjetInconnu_EstObjetAssociationMaterielObjetInconnu()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_ObjetInconnu' target_entity='type_AssociationMaterielObjetInconnu'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationMaterielObjetInconnu'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationMaterielObjetInconnu();

} // TypeObjetInconnu
