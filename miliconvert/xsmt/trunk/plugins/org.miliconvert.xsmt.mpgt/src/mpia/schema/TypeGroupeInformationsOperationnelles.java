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
 * A representation of the model object '<em><b>Type Groupe Informations Operationnelles</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeGroupeInformationsOperationnelles#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeGroupeInformationsOperationnelles#getInclusAssociationGroupeInfoOpsPlanOuOrdre <em>Inclus Association Groupe Info Ops Plan Ou Ordre</em>}</li>
 *   <li>{@link mpia.schema.TypeGroupeInformationsOperationnelles#getEstCiteParAssociationGroupeInfoOpsEntiteOrganisationnelle <em>Est Cite Par Association Groupe Info Ops Entite Organisationnelle</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeGroupeInformationsOperationnelles()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_GroupeInformationsOperationnelles' kind='elementOnly'"
 * @generated
 */
public interface TypeGroupeInformationsOperationnelles extends TypeContexte {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoGroupeInformationsOperationnellesCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoGroupeInformationsOperationnellesCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoGroupeInformationsOperationnellesCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeGroupeInformationsOperationnelles_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoGroupeInformationsOperationnellesCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeGroupeInformationsOperationnelles#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoGroupeInformationsOperationnellesCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoGroupeInformationsOperationnellesCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeGroupeInformationsOperationnelles#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoGroupeInformationsOperationnellesCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeGroupeInformationsOperationnelles#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoGroupeInformationsOperationnellesCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Inclus Association Groupe Info Ops Plan Ou Ordre</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inclus Association Groupe Info Ops Plan Ou Ordre</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inclus Association Groupe Info Ops Plan Ou Ordre</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeGroupeInformationsOperationnelles_InclusAssociationGroupeInfoOpsPlanOuOrdre()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstInclusDans_GroupeInformationsOperationnelles' target_entity='type_AssociationGroupeInfoOpsPlanOuOrdre'"
	 *        extendedMetaData="kind='element' name='Inclus_AssociationGroupeInfoOpsPlanOuOrdre'"
	 * @generated
	 */
	EList<TypeAssociation> getInclusAssociationGroupeInfoOpsPlanOuOrdre();

	/**
	 * Returns the value of the '<em><b>Est Cite Par Association Groupe Info Ops Entite Organisationnelle</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Cite Par Association Groupe Info Ops Entite Organisationnelle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Cite Par Association Groupe Info Ops Entite Organisationnelle</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeGroupeInformationsOperationnelles_EstCiteParAssociationGroupeInfoOpsEntiteOrganisationnelle()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeGroupeInformationsOperationnelles_GroupeInformationsOperationnelles' target_entity='type_AssociationGroupeInfoOpsEntiteOrganisationnelle'"
	 *        extendedMetaData="kind='element' name='EstCitePar_AssociationGroupeInfoOpsEntiteOrganisationnelle'"
	 * @generated
	 */
	EList<TypeAssociation> getEstCiteParAssociationGroupeInfoOpsEntiteOrganisationnelle();

} // TypeGroupeInformationsOperationnelles
