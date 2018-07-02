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
 * A representation of the model object '<em><b>Type Etat Evenement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEtatEvenement#getDegreAchevement <em>Degre Achevement</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatEvenement#isFeinte <em>Feinte</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatEvenement#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatEvenement#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatEvenement#getEstRapporteParRapport <em>Est Rapporte Par Rapport</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEtatEvenement()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_EtatEvenement' kind='elementOnly'"
 * @generated
 */
public interface TypeEtatEvenement extends EObject {
	/**
	 * Returns the value of the '<em><b>Degre Achevement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Degre Achevement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degre Achevement</em>' attribute.
	 * @see #isSetDegreAchevement()
	 * @see #unsetDegreAchevement()
	 * @see #setDegreAchevement(double)
	 * @see mpia.schema.SchemaPackage#getTypeEtatEvenement_DegreAchevement()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeFraction" required="true"
	 *        extendedMetaData="kind='element' name='DegreAchevement'"
	 * @generated
	 */
	double getDegreAchevement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatEvenement#getDegreAchevement <em>Degre Achevement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degre Achevement</em>' attribute.
	 * @see #isSetDegreAchevement()
	 * @see #unsetDegreAchevement()
	 * @see #getDegreAchevement()
	 * @generated
	 */
	void setDegreAchevement(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatEvenement#getDegreAchevement <em>Degre Achevement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDegreAchevement()
	 * @see #getDegreAchevement()
	 * @see #setDegreAchevement(double)
	 * @generated
	 */
	void unsetDegreAchevement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatEvenement#getDegreAchevement <em>Degre Achevement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Degre Achevement</em>' attribute is set.
	 * @see #unsetDegreAchevement()
	 * @see #getDegreAchevement()
	 * @see #setDegreAchevement(double)
	 * @generated
	 */
	boolean isSetDegreAchevement();

	/**
	 * Returns the value of the '<em><b>Feinte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feinte</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feinte</em>' attribute.
	 * @see #isSetFeinte()
	 * @see #unsetFeinte()
	 * @see #setFeinte(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeEtatEvenement_Feinte()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='Feinte'"
	 * @generated
	 */
	boolean isFeinte();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatEvenement#isFeinte <em>Feinte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feinte</em>' attribute.
	 * @see #isSetFeinte()
	 * @see #unsetFeinte()
	 * @see #isFeinte()
	 * @generated
	 */
	void setFeinte(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatEvenement#isFeinte <em>Feinte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFeinte()
	 * @see #isFeinte()
	 * @see #setFeinte(boolean)
	 * @generated
	 */
	void unsetFeinte();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatEvenement#isFeinte <em>Feinte</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Feinte</em>' attribute is set.
	 * @see #unsetFeinte()
	 * @see #isFeinte()
	 * @see #setFeinte(boolean)
	 * @generated
	 */
	boolean isSetFeinte();

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
	 * @see mpia.schema.SchemaPackage#getTypeEtatEvenement_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatEvenement#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeEtatEvenement_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatEvenement#getCE <em>CE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeEtatEvenement_EstRapporteParRapport()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Rapport'"
	 *        extendedMetaData="kind='element' name='EstRapportePar_Rapport'"
	 * @generated
	 */
	TypeAssociation getEstRapporteParRapport();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatEvenement#getEstRapporteParRapport <em>Est Rapporte Par Rapport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Rapporte Par Rapport</em>' containment reference.
	 * @see #getEstRapporteParRapport()
	 * @generated
	 */
	void setEstRapporteParRapport(TypeAssociation value);

} // TypeEtatEvenement
