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
 * A representation of the model object '<em><b>Type Element Controle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeElementControle#getNationalite <em>Nationalite</em>}</li>
 *   <li>{@link mpia.schema.TypeElementControle#getAPourTypeAssociationEltCtrlTypeEltCtrl <em>APour Type Association Elt Ctrl Type Elt Ctrl</em>}</li>
 *   <li>{@link mpia.schema.TypeElementControle#getAPourEtatEtatOperationnelElementControle <em>APour Etat Etat Operationnel Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeElementControle#getEstObjetAssociationEntiteOrgEltCtrl <em>Est Objet Association Entite Org Elt Ctrl</em>}</li>
 *   <li>{@link mpia.schema.TypeElementControle#getEstSujetAssociationEltCtrlEltCtrl <em>Est Sujet Association Elt Ctrl Elt Ctrl</em>}</li>
 *   <li>{@link mpia.schema.TypeElementControle#getEstObjetAssociationEltCtrlEltCtrl <em>Est Objet Association Elt Ctrl Elt Ctrl</em>}</li>
 *   <li>{@link mpia.schema.TypeElementControle#getEstSujetAssociationEltCtrlEltTopo <em>Est Sujet Association Elt Ctrl Elt Topo</em>}</li>
 *   <li>{@link mpia.schema.TypeElementControle#getEstSujetAssociationEltCtrlSite <em>Est Sujet Association Elt Ctrl Site</em>}</li>
 *   <li>{@link mpia.schema.TypeElementControle#getEstSujetAssociationElementControleEvenement <em>Est Sujet Association Element Controle Evenement</em>}</li>
 *   <li>{@link mpia.schema.TypeElementControle#getEstObjetAssociationSiteEltCtrl <em>Est Objet Association Site Elt Ctrl</em>}</li>
 *   <li>{@link mpia.schema.TypeElementControle#getEstObjetAssociationPersonneEltCtrl <em>Est Objet Association Personne Elt Ctrl</em>}</li>
 *   <li>{@link mpia.schema.TypeElementControle#getEstObjetAssociationMaterielEltCtrl <em>Est Objet Association Materiel Elt Ctrl</em>}</li>
 *   <li>{@link mpia.schema.TypeElementControle#getEstSujetAssociationEltCtrlMateriel <em>Est Sujet Association Elt Ctrl Materiel</em>}</li>
 *   <li>{@link mpia.schema.TypeElementControle#getEstObjetAssociationObjetInconnuEltCtrl <em>Est Objet Association Objet Inconnu Elt Ctrl</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeElementControle()
 * @model abstract="true"
 *        extendedMetaData="name='type_ElementControle' kind='elementOnly'"
 * @generated
 */
public interface TypeElementControle extends TypeInstanceObjet {
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
	 * @see mpia.schema.SchemaPackage#getTypeElementControle_Nationalite()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Nationalite'"
	 * @generated
	 */
	TypeDictionaryDicoEntitePolitiqueTrigramme getNationalite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeElementControle#getNationalite <em>Nationalite</em>}' attribute.
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
	 * Unsets the value of the '{@link mpia.schema.TypeElementControle#getNationalite <em>Nationalite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNationalite()
	 * @see #getNationalite()
	 * @see #setNationalite(TypeDictionaryDicoEntitePolitiqueTrigramme)
	 * @generated
	 */
	void unsetNationalite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeElementControle#getNationalite <em>Nationalite</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>APour Type Association Elt Ctrl Type Elt Ctrl</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Type Association Elt Ctrl Type Elt Ctrl</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Type Association Elt Ctrl Type Elt Ctrl</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeElementControle_APourTypeAssociationEltCtrlTypeEltCtrl()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeObjet_ElementControle' target_entity='type_AssociationEltCtrlTypeEltCtrl'"
	 *        extendedMetaData="kind='element' name='APourType_AssociationEltCtrlTypeEltCtrl'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourTypeAssociationEltCtrlTypeEltCtrl();

	/**
	 * Returns the value of the '<em><b>APour Etat Etat Operationnel Element Controle</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeEtatOperationnelElementControle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Etat Etat Operationnel Element Controle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Etat Etat Operationnel Element Controle</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeElementControle_APourEtatEtatOperationnelElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EtatOperationnelElementControle'"
	 *        extendedMetaData="kind='element' name='APourEtat_EtatOperationnelElementControle'"
	 * @generated
	 */
	EList<TypeEtatOperationnelElementControle> getAPourEtatEtatOperationnelElementControle();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Entite Org Elt Ctrl</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Entite Org Elt Ctrl</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Entite Org Elt Ctrl</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeElementControle_EstObjetAssociationEntiteOrgEltCtrl()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_ElementControle' target_entity='type_AssociationEntiteOrgEltCtrl'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationEntiteOrgEltCtrl'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationEntiteOrgEltCtrl();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Elt Ctrl Elt Ctrl</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Elt Ctrl Elt Ctrl</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Elt Ctrl Elt Ctrl</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeElementControle_EstSujetAssociationEltCtrlEltCtrl()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_ElementControle' target_entity='type_AssociationEltCtrlEltCtrl'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationEltCtrlEltCtrl'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationEltCtrlEltCtrl();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Elt Ctrl Elt Ctrl</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Elt Ctrl Elt Ctrl</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Elt Ctrl Elt Ctrl</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeElementControle_EstObjetAssociationEltCtrlEltCtrl()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_ElementControle' target_entity='type_AssociationEltCtrlEltCtrl'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationEltCtrlEltCtrl'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationEltCtrlEltCtrl();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Elt Ctrl Elt Topo</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Elt Ctrl Elt Topo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Elt Ctrl Elt Topo</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeElementControle_EstSujetAssociationEltCtrlEltTopo()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_ElementControle' target_entity='type_AssociationEltCtrlEltTopo'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationEltCtrlEltTopo'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationEltCtrlEltTopo();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Elt Ctrl Site</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Elt Ctrl Site</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Elt Ctrl Site</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeElementControle_EstSujetAssociationEltCtrlSite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_ElementControle' target_entity='type_AssociationEltCtrlSite'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationEltCtrlSite'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationEltCtrlSite();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Element Controle Evenement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Element Controle Evenement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Element Controle Evenement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeElementControle_EstSujetAssociationElementControleEvenement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_ElementControle' target_entity='type_AssociationElementControleEvenement'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationElementControleEvenement'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationElementControleEvenement();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Site Elt Ctrl</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Site Elt Ctrl</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Site Elt Ctrl</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeElementControle_EstObjetAssociationSiteEltCtrl()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_ElementControle' target_entity='type_AssociationSiteEltCtrl'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationSiteEltCtrl'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationSiteEltCtrl();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Personne Elt Ctrl</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Personne Elt Ctrl</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Personne Elt Ctrl</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeElementControle_EstObjetAssociationPersonneEltCtrl()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_ElementControle' target_entity='type_AssociationPersonneEltCtrl'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationPersonneEltCtrl'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationPersonneEltCtrl();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Materiel Elt Ctrl</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Materiel Elt Ctrl</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Materiel Elt Ctrl</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeElementControle_EstObjetAssociationMaterielEltCtrl()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_ElementControle' target_entity='type_AssociationMaterielEltCtrl'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationMaterielEltCtrl'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationMaterielEltCtrl();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Elt Ctrl Materiel</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Elt Ctrl Materiel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Elt Ctrl Materiel</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeElementControle_EstSujetAssociationEltCtrlMateriel()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_ElementControle' target_entity='type_AssociationEltCtrlMateriel'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationEltCtrlMateriel'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationEltCtrlMateriel();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Objet Inconnu Elt Ctrl</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Objet Inconnu Elt Ctrl</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Objet Inconnu Elt Ctrl</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeElementControle_EstObjetAssociationObjetInconnuEltCtrl()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_ElementControle' target_entity='type_AssociationObjetInconnuEltCtrl'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationObjetInconnuEltCtrl'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationObjetInconnuEltCtrl();

} // TypeElementControle
