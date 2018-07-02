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
 * A representation of the model object '<em><b>Type Etat Element Contexte</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEtatElementContexte#getEtat <em>Etat</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatElementContexte#getDateEffectiveRelation <em>Date Effective Relation</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatElementContexte#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatElementContexte#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatElementContexte#getEstEtabliParEntiteOrganisationnelle <em>Est Etabli Par Entite Organisationnelle</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEtatElementContexte()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_EtatElementContexte' kind='elementOnly'"
 * @generated
 */
public interface TypeEtatElementContexte extends EObject {
	/**
	 * Returns the value of the '<em><b>Etat</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatElementContexteEtat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatElementContexteEtat
	 * @see #isSetEtat()
	 * @see #unsetEtat()
	 * @see #setEtat(TypeDictionaryDicoEtatElementContexteEtat)
	 * @see mpia.schema.SchemaPackage#getTypeEtatElementContexte_Etat()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Etat'"
	 * @generated
	 */
	TypeDictionaryDicoEtatElementContexteEtat getEtat();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatElementContexte#getEtat <em>Etat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatElementContexteEtat
	 * @see #isSetEtat()
	 * @see #unsetEtat()
	 * @see #getEtat()
	 * @generated
	 */
	void setEtat(TypeDictionaryDicoEtatElementContexteEtat value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatElementContexte#getEtat <em>Etat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEtat()
	 * @see #getEtat()
	 * @see #setEtat(TypeDictionaryDicoEtatElementContexteEtat)
	 * @generated
	 */
	void unsetEtat();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatElementContexte#getEtat <em>Etat</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Etat</em>' attribute is set.
	 * @see #unsetEtat()
	 * @see #getEtat()
	 * @see #setEtat(TypeDictionaryDicoEtatElementContexteEtat)
	 * @generated
	 */
	boolean isSetEtat();

	/**
	 * Returns the value of the '<em><b>Date Effective Relation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Effective Relation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Effective Relation</em>' containment reference.
	 * @see #setDateEffectiveRelation(TypeDataTypeDateHeure)
	 * @see mpia.schema.SchemaPackage#getTypeEtatElementContexte_DateEffectiveRelation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DateEffectiveRelation'"
	 * @generated
	 */
	TypeDataTypeDateHeure getDateEffectiveRelation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatElementContexte#getDateEffectiveRelation <em>Date Effective Relation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Effective Relation</em>' containment reference.
	 * @see #getDateEffectiveRelation()
	 * @generated
	 */
	void setDateEffectiveRelation(TypeDataTypeDateHeure value);

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
	 * @see mpia.schema.SchemaPackage#getTypeEtatElementContexte_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatElementContexte#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeEtatElementContexte_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatElementContexte#getCE <em>CE</em>}' attribute.
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
	 * @see #setEstEtabliParEntiteOrganisationnelle(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeEtatElementContexte_EstEtabliParEntiteOrganisationnelle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_EntiteOrganisationnelle'"
	 *        extendedMetaData="kind='element' name='EstEtabliPar_EntiteOrganisationnelle'"
	 * @generated
	 */
	TypeAssociationEXT getEstEtabliParEntiteOrganisationnelle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatElementContexte#getEstEtabliParEntiteOrganisationnelle <em>Est Etabli Par Entite Organisationnelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Etabli Par Entite Organisationnelle</em>' containment reference.
	 * @see #getEstEtabliParEntiteOrganisationnelle()
	 * @generated
	 */
	void setEstEtabliParEntiteOrganisationnelle(TypeAssociationEXT value);

} // TypeEtatElementContexte
