/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociationEXT;
import mpia.meta.TypeDataTypeDateHeure;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Etat Regle Engagement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEtatRegleEngagement#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatRegleEngagement#getDateFin <em>Date Fin</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatRegleEngagement#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatRegleEngagement#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatRegleEngagement#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatRegleEngagement#getAPourEntiteResponsableEntiteOrganisationnelle <em>APour Entite Responsable Entite Organisationnelle</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEtatRegleEngagement()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_EtatRegleEngagement' kind='elementOnly'"
 * @generated
 */
public interface TypeEtatRegleEngagement extends EObject {
	/**
	 * Returns the value of the '<em><b>Date Debut</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Debut</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Debut</em>' containment reference.
	 * @see #setDateDebut(TypeDataTypeDateHeure)
	 * @see mpia.schema.SchemaPackage#getTypeEtatRegleEngagement_DateDebut()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DateDebut'"
	 * @generated
	 */
	TypeDataTypeDateHeure getDateDebut();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatRegleEngagement#getDateDebut <em>Date Debut</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Debut</em>' containment reference.
	 * @see #getDateDebut()
	 * @generated
	 */
	void setDateDebut(TypeDataTypeDateHeure value);

	/**
	 * Returns the value of the '<em><b>Date Fin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Fin</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Fin</em>' containment reference.
	 * @see #setDateFin(TypeDataTypeDateHeure)
	 * @see mpia.schema.SchemaPackage#getTypeEtatRegleEngagement_DateFin()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DateFin'"
	 * @generated
	 */
	TypeDataTypeDateHeure getDateFin();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatRegleEngagement#getDateFin <em>Date Fin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Fin</em>' containment reference.
	 * @see #getDateFin()
	 * @generated
	 */
	void setDateFin(TypeDataTypeDateHeure value);

	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatRegleEngagementCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatRegleEngagementCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoEtatRegleEngagementCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeEtatRegleEngagement_Categorie()
	 * @model unsettable="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoEtatRegleEngagementCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatRegleEngagement#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatRegleEngagementCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoEtatRegleEngagementCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatRegleEngagement#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoEtatRegleEngagementCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatRegleEngagement#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoEtatRegleEngagementCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

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
	 * @see mpia.schema.SchemaPackage#getTypeEtatRegleEngagement_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatRegleEngagement#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeEtatRegleEngagement_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatRegleEngagement#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Entite Responsable Entite Organisationnelle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Entite Responsable Entite Organisationnelle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Entite Responsable Entite Organisationnelle</em>' containment reference.
	 * @see #setAPourEntiteResponsableEntiteOrganisationnelle(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeEtatRegleEngagement_APourEntiteResponsableEntiteOrganisationnelle()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_EntiteOrganisationnelle'"
	 *        extendedMetaData="kind='element' name='APourEntiteResponsable_EntiteOrganisationnelle'"
	 * @generated
	 */
	TypeAssociationEXT getAPourEntiteResponsableEntiteOrganisationnelle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatRegleEngagement#getAPourEntiteResponsableEntiteOrganisationnelle <em>APour Entite Responsable Entite Organisationnelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Entite Responsable Entite Organisationnelle</em>' containment reference.
	 * @see #getAPourEntiteResponsableEntiteOrganisationnelle()
	 * @generated
	 */
	void setAPourEntiteResponsableEntiteOrganisationnelle(TypeAssociationEXT value);

} // TypeEtatRegleEngagement
