/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Association Fonctionnelle Activite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationFonctionnelleActivite#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationFonctionnelleActivite#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationFonctionnelleActivite#getEstSuivieSelonSuiviDemande <em>Est Suivie Selon Suivi Demande</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationFonctionnelleActivite()
 * @model abstract="true"
 *        extendedMetaData="name='type_AssociationFonctionnelleActivite' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationFonctionnelleActivite extends EObject {
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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationFonctionnelleActivite_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationFonctionnelleActivite#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationFonctionnelleActivite_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationFonctionnelleActivite#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Est Suivie Selon Suivi Demande</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Suivie Selon Suivi Demande</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Suivie Selon Suivi Demande</em>' containment reference.
	 * @see #setEstSuivieSelonSuiviDemande(TypeSuiviDemande)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationFonctionnelleActivite_EstSuivieSelonSuiviDemande()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_SuiviDemande'"
	 *        extendedMetaData="kind='element' name='EstSuivieSelon_SuiviDemande'"
	 * @generated
	 */
	TypeSuiviDemande getEstSuivieSelonSuiviDemande();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationFonctionnelleActivite#getEstSuivieSelonSuiviDemande <em>Est Suivie Selon Suivi Demande</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Suivie Selon Suivi Demande</em>' containment reference.
	 * @see #getEstSuivieSelonSuiviDemande()
	 * @generated
	 */
	void setEstSuivieSelonSuiviDemande(TypeSuiviDemande value);

} // TypeAssociationFonctionnelleActivite
