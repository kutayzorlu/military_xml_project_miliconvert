/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Etat Service Reseau</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEtatServiceReseau#isServiceReseauActif <em>Service Reseau Actif</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatServiceReseau#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatServiceReseau#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatServiceReseau#getEstRapporteParRapport <em>Est Rapporte Par Rapport</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEtatServiceReseau()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_EtatServiceReseau' kind='elementOnly'"
 * @generated
 */
public interface TypeEtatServiceReseau extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Reseau Actif</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Reseau Actif</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Reseau Actif</em>' attribute.
	 * @see #isSetServiceReseauActif()
	 * @see #unsetServiceReseauActif()
	 * @see #setServiceReseauActif(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeEtatServiceReseau_ServiceReseauActif()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='ServiceReseauActif'"
	 * @generated
	 */
	boolean isServiceReseauActif();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatServiceReseau#isServiceReseauActif <em>Service Reseau Actif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Reseau Actif</em>' attribute.
	 * @see #isSetServiceReseauActif()
	 * @see #unsetServiceReseauActif()
	 * @see #isServiceReseauActif()
	 * @generated
	 */
	void setServiceReseauActif(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatServiceReseau#isServiceReseauActif <em>Service Reseau Actif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServiceReseauActif()
	 * @see #isServiceReseauActif()
	 * @see #setServiceReseauActif(boolean)
	 * @generated
	 */
	void unsetServiceReseauActif();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatServiceReseau#isServiceReseauActif <em>Service Reseau Actif</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Service Reseau Actif</em>' attribute is set.
	 * @see #unsetServiceReseauActif()
	 * @see #isServiceReseauActif()
	 * @see #setServiceReseauActif(boolean)
	 * @generated
	 */
	boolean isSetServiceReseauActif();

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
	 * @see mpia.schema.SchemaPackage#getTypeEtatServiceReseau_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatServiceReseau#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeEtatServiceReseau_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatServiceReseau#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Est Rapporte Par Rapport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Rapporte Par Rapport</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Rapporte Par Rapport</em>' containment reference.
	 * @see #setEstRapporteParRapport(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeEtatServiceReseau_EstRapporteParRapport()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Rapport'"
	 *        extendedMetaData="kind='element' name='EstRapportePar_Rapport'"
	 * @generated
	 */
	TypeAssociation getEstRapporteParRapport();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatServiceReseau#getEstRapporteParRapport <em>Est Rapporte Par Rapport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Rapporte Par Rapport</em>' containment reference.
	 * @see #getEstRapporteParRapport()
	 * @generated
	 */
	void setEstRapporteParRapport(TypeAssociation value);

} // TypeEtatServiceReseau
