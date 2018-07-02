/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeDateHeure;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Etat Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEtatAssociation#getEtat <em>Etat</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatAssociation#getDate <em>Date</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatAssociation#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatAssociation#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatAssociation#getEstEtabliParEntiteOrganisationnelle <em>Est Etabli Par Entite Organisationnelle</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEtatAssociation()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_EtatAssociation' kind='elementOnly'"
 * @generated
 */
public interface TypeEtatAssociation extends EObject {
	/**
	 * Returns the value of the '<em><b>Etat</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatAssociation
	 * @see #isSetEtat()
	 * @see #unsetEtat()
	 * @see #setEtat(TypeDictionaryDicoEtatAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeEtatAssociation_Etat()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Etat'"
	 * @generated
	 */
	TypeDictionaryDicoEtatAssociation getEtat();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatAssociation#getEtat <em>Etat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatAssociation
	 * @see #isSetEtat()
	 * @see #unsetEtat()
	 * @see #getEtat()
	 * @generated
	 */
	void setEtat(TypeDictionaryDicoEtatAssociation value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatAssociation#getEtat <em>Etat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEtat()
	 * @see #getEtat()
	 * @see #setEtat(TypeDictionaryDicoEtatAssociation)
	 * @generated
	 */
	void unsetEtat();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatAssociation#getEtat <em>Etat</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Etat</em>' attribute is set.
	 * @see #unsetEtat()
	 * @see #getEtat()
	 * @see #setEtat(TypeDictionaryDicoEtatAssociation)
	 * @generated
	 */
	boolean isSetEtat();

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(TypeDataTypeDateHeure)
	 * @see mpia.schema.SchemaPackage#getTypeEtatAssociation_Date()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Date'"
	 * @generated
	 */
	TypeDataTypeDateHeure getDate();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatAssociation#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(TypeDataTypeDateHeure value);

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
	 * @see mpia.schema.SchemaPackage#getTypeEtatAssociation_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatAssociation#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeEtatAssociation_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatAssociation#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Est Etabli Par Entite Organisationnelle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Etabli Par Entite Organisationnelle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Etabli Par Entite Organisationnelle</em>' containment reference.
	 * @see #setEstEtabliParEntiteOrganisationnelle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeEtatAssociation_EstEtabliParEntiteOrganisationnelle()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_EntiteOrganisationnelle'"
	 *        extendedMetaData="kind='element' name='EstEtabliPar_EntiteOrganisationnelle'"
	 * @generated
	 */
	TypeAssociation getEstEtabliParEntiteOrganisationnelle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatAssociation#getEstEtabliParEntiteOrganisationnelle <em>Est Etabli Par Entite Organisationnelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Etabli Par Entite Organisationnelle</em>' containment reference.
	 * @see #getEstEtabliParEntiteOrganisationnelle()
	 * @generated
	 */
	void setEstEtabliParEntiteOrganisationnelle(TypeAssociation value);

} // TypeEtatAssociation
