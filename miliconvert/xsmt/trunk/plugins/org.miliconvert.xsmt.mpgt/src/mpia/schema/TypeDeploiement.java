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
 * A representation of the model object '<em><b>Type Deploiement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeDeploiement#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeDeploiement#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeDeploiement#getAppliquePourHoraireManoeuvre <em>Applique Pour Horaire Manoeuvre</em>}</li>
 *   <li>{@link mpia.schema.TypeDeploiement#getAPourUniteRattacheeUnite <em>APour Unite Rattachee Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeDeploiement#getAPourUniteLogistiqueUnite <em>APour Unite Logistique Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeDeploiement()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_Deploiement' kind='elementOnly'"
 * @generated
 */
public interface TypeDeploiement extends EObject {
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
	 * @see mpia.schema.SchemaPackage#getTypeDeploiement_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDeploiement#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeDeploiement_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDeploiement#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Applique Pour Horaire Manoeuvre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applique Pour Horaire Manoeuvre</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applique Pour Horaire Manoeuvre</em>' containment reference.
	 * @see #setAppliquePourHoraireManoeuvre(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeDeploiement_AppliquePourHoraireManoeuvre()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_HoraireManoeuvre'"
	 *        extendedMetaData="kind='element' name='AppliquePour_HoraireManoeuvre'"
	 * @generated
	 */
	TypeAssociation getAppliquePourHoraireManoeuvre();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDeploiement#getAppliquePourHoraireManoeuvre <em>Applique Pour Horaire Manoeuvre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applique Pour Horaire Manoeuvre</em>' containment reference.
	 * @see #getAppliquePourHoraireManoeuvre()
	 * @generated
	 */
	void setAppliquePourHoraireManoeuvre(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Unite Rattachee Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite Rattachee Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite Rattachee Unite</em>' containment reference.
	 * @see #setAPourUniteRattacheeUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeDeploiement_APourUniteRattacheeUnite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteRattachee_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getAPourUniteRattacheeUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDeploiement#getAPourUniteRattacheeUnite <em>APour Unite Rattachee Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Unite Rattachee Unite</em>' containment reference.
	 * @see #getAPourUniteRattacheeUnite()
	 * @generated
	 */
	void setAPourUniteRattacheeUnite(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>APour Unite Logistique Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociationEXT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite Logistique Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite Logistique Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeDeploiement_APourUniteLogistiqueUnite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteLogistique_Unite'"
	 * @generated
	 */
	EList<TypeAssociationEXT> getAPourUniteLogistiqueUnite();

} // TypeDeploiement
