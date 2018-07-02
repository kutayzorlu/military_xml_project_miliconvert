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
 * A representation of the model object '<em><b>Type Association Groupe Info Ops Entite Organisationnelle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationGroupeInfoOpsEntiteOrganisationnelle#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationGroupeInfoOpsEntiteOrganisationnelle#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationGroupeInfoOpsEntiteOrganisationnelle#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationGroupeInfoOpsEntiteOrganisationnelle#getAssocieCommeResponsableEntiteOrganisationnelle <em>Associe Comme Responsable Entite Organisationnelle</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationGroupeInfoOpsEntiteOrganisationnelle#getAPourEtatEtatAssociation <em>APour Etat Etat Association</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationGroupeInfoOpsEntiteOrganisationnelle#getAssocieCommeGroupeInformationsOperationnellesGroupeInformationsOperationnelles <em>Associe Comme Groupe Informations Operationnelles Groupe Informations Operationnelles</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationGroupeInfoOpsEntiteOrganisationnelle()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationGroupeInfoOpsEntiteOrganisationnelle' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationGroupeInfoOpsEntiteOrganisationnelle extends EObject {
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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationGroupeInfoOpsEntiteOrganisationnelle_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationGroupeInfoOpsEntiteOrganisationnelle#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationGroupeInfoOpsEntiteOrganisationnelle_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationGroupeInfoOpsEntiteOrganisationnelle#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationGroupeInfoOpsEntiteOrganisationnelleCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationGroupeInfoOpsEntiteOrganisationnelleCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationGroupeInfoOpsEntiteOrganisationnelleCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationGroupeInfoOpsEntiteOrganisationnelle_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationGroupeInfoOpsEntiteOrganisationnelleCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationGroupeInfoOpsEntiteOrganisationnelle#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationGroupeInfoOpsEntiteOrganisationnelleCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationGroupeInfoOpsEntiteOrganisationnelleCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationGroupeInfoOpsEntiteOrganisationnelle#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationGroupeInfoOpsEntiteOrganisationnelleCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationGroupeInfoOpsEntiteOrganisationnelle#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationGroupeInfoOpsEntiteOrganisationnelleCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Associe Comme Responsable Entite Organisationnelle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Responsable Entite Organisationnelle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Responsable Entite Organisationnelle</em>' containment reference.
	 * @see #setAssocieCommeResponsableEntiteOrganisationnelle(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationGroupeInfoOpsEntiteOrganisationnelle_AssocieCommeResponsableEntiteOrganisationnelle()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourRoleDans_AssociationGroupeInfoOpsEntiteOrganisationnelle' target_entity='type_EntiteOrganisationnelle'"
	 *        extendedMetaData="kind='element' name='AssocieCommeResponsable_EntiteOrganisationnelle'"
	 * @generated
	 */
	TypeAssociationEXT getAssocieCommeResponsableEntiteOrganisationnelle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationGroupeInfoOpsEntiteOrganisationnelle#getAssocieCommeResponsableEntiteOrganisationnelle <em>Associe Comme Responsable Entite Organisationnelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Responsable Entite Organisationnelle</em>' containment reference.
	 * @see #getAssocieCommeResponsableEntiteOrganisationnelle()
	 * @generated
	 */
	void setAssocieCommeResponsableEntiteOrganisationnelle(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>APour Etat Etat Association</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeEtatAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Etat Etat Association</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Etat Etat Association</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeAssociationGroupeInfoOpsEntiteOrganisationnelle_APourEtatEtatAssociation()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EtatAssociation'"
	 *        extendedMetaData="kind='element' name='APourEtat_EtatAssociation'"
	 * @generated
	 */
	EList<TypeEtatAssociation> getAPourEtatEtatAssociation();

	/**
	 * Returns the value of the '<em><b>Associe Comme Groupe Informations Operationnelles Groupe Informations Operationnelles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Groupe Informations Operationnelles Groupe Informations Operationnelles</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Groupe Informations Operationnelles Groupe Informations Operationnelles</em>' containment reference.
	 * @see #setAssocieCommeGroupeInformationsOperationnellesGroupeInformationsOperationnelles(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationGroupeInfoOpsEntiteOrganisationnelle_AssocieCommeGroupeInformationsOperationnellesGroupeInformationsOperationnelles()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstCitePar_AssociationGroupeInfoOpsEntiteOrganisationnelle' target_entity='type_GroupeInformationsOperationnelles'"
	 *        extendedMetaData="kind='element' name='AssocieCommeGroupeInformationsOperationnelles_GroupeInformationsOperationnelles'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeGroupeInformationsOperationnellesGroupeInformationsOperationnelles();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationGroupeInfoOpsEntiteOrganisationnelle#getAssocieCommeGroupeInformationsOperationnellesGroupeInformationsOperationnelles <em>Associe Comme Groupe Informations Operationnelles Groupe Informations Operationnelles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Groupe Informations Operationnelles Groupe Informations Operationnelles</em>' containment reference.
	 * @see #getAssocieCommeGroupeInformationsOperationnellesGroupeInformationsOperationnelles()
	 * @generated
	 */
	void setAssocieCommeGroupeInformationsOperationnellesGroupeInformationsOperationnelles(TypeAssociation value);

} // TypeAssociationGroupeInfoOpsEntiteOrganisationnelle
