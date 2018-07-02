/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Regle Engagement Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeRegleEngagementAction#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeRegleEngagementAction#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeRegleEngagementAction#getEstDesigneeParRegleEngagement <em>Est Designee Par Regle Engagement</em>}</li>
 *   <li>{@link mpia.schema.TypeRegleEngagementAction#getAPourEtatEtatRegleEngagement <em>APour Etat Etat Regle Engagement</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeRegleEngagementAction()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_RegleEngagementAction' kind='elementOnly'"
 * @generated
 */
public interface TypeRegleEngagementAction extends EObject {
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
	 * @see mpia.schema.SchemaPackage#getTypeRegleEngagementAction_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRegleEngagementAction#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeRegleEngagementAction_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRegleEngagementAction#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Est Designee Par Regle Engagement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Designee Par Regle Engagement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Designee Par Regle Engagement</em>' containment reference.
	 * @see #setEstDesigneeParRegleEngagement(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeRegleEngagementAction_EstDesigneeParRegleEngagement()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_RegleEngagement'"
	 *        extendedMetaData="kind='element' name='EstDesigneePar_RegleEngagement'"
	 * @generated
	 */
	TypeAssociation getEstDesigneeParRegleEngagement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRegleEngagementAction#getEstDesigneeParRegleEngagement <em>Est Designee Par Regle Engagement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Designee Par Regle Engagement</em>' containment reference.
	 * @see #getEstDesigneeParRegleEngagement()
	 * @generated
	 */
	void setEstDesigneeParRegleEngagement(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Etat Etat Regle Engagement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeEtatRegleEngagement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Etat Etat Regle Engagement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Etat Etat Regle Engagement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeRegleEngagementAction_APourEtatEtatRegleEngagement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EtatRegleEngagement'"
	 *        extendedMetaData="kind='element' name='APourEtat_EtatRegleEngagement'"
	 * @generated
	 */
	EList<TypeEtatRegleEngagement> getAPourEtatEtatRegleEngagement();

} // TypeRegleEngagementAction
