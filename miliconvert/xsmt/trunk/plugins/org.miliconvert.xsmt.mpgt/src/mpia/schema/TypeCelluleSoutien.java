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
 * A representation of the model object '<em><b>Type Cellule Soutien</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCelluleSoutien#getDescriptionMission <em>Description Mission</em>}</li>
 *   <li>{@link mpia.schema.TypeCelluleSoutien#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeCelluleSoutien#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeCelluleSoutien#getAPourUniteResponsableUnite <em>APour Unite Responsable Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeCelluleSoutien#getAPourActivitePrincipaleAction <em>APour Activite Principale Action</em>}</li>
 *   <li>{@link mpia.schema.TypeCelluleSoutien#getAPourActiviteSecondaireAction <em>APour Activite Secondaire Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCelluleSoutien()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_CelluleSoutien' kind='elementOnly'"
 * @generated
 */
public interface TypeCelluleSoutien extends EObject {
	/**
	 * Returns the value of the '<em><b>Description Mission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description Mission</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Mission</em>' attribute.
	 * @see #setDescriptionMission(String)
	 * @see mpia.schema.SchemaPackage#getTypeCelluleSoutien_DescriptionMission()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='DescriptionMission'"
	 * @generated
	 */
	String getDescriptionMission();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCelluleSoutien#getDescriptionMission <em>Description Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Mission</em>' attribute.
	 * @see #getDescriptionMission()
	 * @generated
	 */
	void setDescriptionMission(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeCelluleSoutien_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCelluleSoutien#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeCelluleSoutien_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCelluleSoutien#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Unite Responsable Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite Responsable Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite Responsable Unite</em>' containment reference.
	 * @see #setAPourUniteResponsableUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeCelluleSoutien_APourUniteResponsableUnite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteResponsable_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getAPourUniteResponsableUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCelluleSoutien#getAPourUniteResponsableUnite <em>APour Unite Responsable Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Unite Responsable Unite</em>' containment reference.
	 * @see #getAPourUniteResponsableUnite()
	 * @generated
	 */
	void setAPourUniteResponsableUnite(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>APour Activite Principale Action</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Activite Principale Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Activite Principale Action</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeCelluleSoutien_APourActivitePrincipaleAction()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Action'"
	 *        extendedMetaData="kind='element' name='APourActivitePrincipale_Action'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourActivitePrincipaleAction();

	/**
	 * Returns the value of the '<em><b>APour Activite Secondaire Action</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Activite Secondaire Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Activite Secondaire Action</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeCelluleSoutien_APourActiviteSecondaireAction()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Action'"
	 *        extendedMetaData="kind='element' name='APourActiviteSecondaire_Action'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourActiviteSecondaireAction();

} // TypeCelluleSoutien
