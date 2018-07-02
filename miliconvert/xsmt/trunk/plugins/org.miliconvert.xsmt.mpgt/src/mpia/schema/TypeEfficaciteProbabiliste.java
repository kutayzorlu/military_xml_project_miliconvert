/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeDuree;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Efficacite Probabiliste</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEfficaciteProbabiliste#getMenaceEstimeeOuPlanifiee <em>Menace Estimee Ou Planifiee</em>}</li>
 *   <li>{@link mpia.schema.TypeEfficaciteProbabiliste#getDureeEstimeeOuPlanifiee <em>Duree Estimee Ou Planifiee</em>}</li>
 *   <li>{@link mpia.schema.TypeEfficaciteProbabiliste#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeEfficaciteProbabiliste#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEfficaciteProbabiliste()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_EfficaciteProbabiliste' kind='elementOnly'"
 * @generated
 */
public interface TypeEfficaciteProbabiliste extends EObject {
	/**
	 * Returns the value of the '<em><b>Menace Estimee Ou Planifiee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menace Estimee Ou Planifiee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menace Estimee Ou Planifiee</em>' attribute.
	 * @see #isSetMenaceEstimeeOuPlanifiee()
	 * @see #unsetMenaceEstimeeOuPlanifiee()
	 * @see #setMenaceEstimeeOuPlanifiee(double)
	 * @see mpia.schema.SchemaPackage#getTypeEfficaciteProbabiliste_MenaceEstimeeOuPlanifiee()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeFraction"
	 *        extendedMetaData="kind='element' name='MenaceEstimeeOuPlanifiee'"
	 * @generated
	 */
	double getMenaceEstimeeOuPlanifiee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEfficaciteProbabiliste#getMenaceEstimeeOuPlanifiee <em>Menace Estimee Ou Planifiee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Menace Estimee Ou Planifiee</em>' attribute.
	 * @see #isSetMenaceEstimeeOuPlanifiee()
	 * @see #unsetMenaceEstimeeOuPlanifiee()
	 * @see #getMenaceEstimeeOuPlanifiee()
	 * @generated
	 */
	void setMenaceEstimeeOuPlanifiee(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEfficaciteProbabiliste#getMenaceEstimeeOuPlanifiee <em>Menace Estimee Ou Planifiee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMenaceEstimeeOuPlanifiee()
	 * @see #getMenaceEstimeeOuPlanifiee()
	 * @see #setMenaceEstimeeOuPlanifiee(double)
	 * @generated
	 */
	void unsetMenaceEstimeeOuPlanifiee();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEfficaciteProbabiliste#getMenaceEstimeeOuPlanifiee <em>Menace Estimee Ou Planifiee</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Menace Estimee Ou Planifiee</em>' attribute is set.
	 * @see #unsetMenaceEstimeeOuPlanifiee()
	 * @see #getMenaceEstimeeOuPlanifiee()
	 * @see #setMenaceEstimeeOuPlanifiee(double)
	 * @generated
	 */
	boolean isSetMenaceEstimeeOuPlanifiee();

	/**
	 * Returns the value of the '<em><b>Duree Estimee Ou Planifiee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duree Estimee Ou Planifiee</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duree Estimee Ou Planifiee</em>' containment reference.
	 * @see #setDureeEstimeeOuPlanifiee(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeEfficaciteProbabiliste_DureeEstimeeOuPlanifiee()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DureeEstimeeOuPlanifiee'"
	 * @generated
	 */
	TypeDataTypeDuree getDureeEstimeeOuPlanifiee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEfficaciteProbabiliste#getDureeEstimeeOuPlanifiee <em>Duree Estimee Ou Planifiee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duree Estimee Ou Planifiee</em>' containment reference.
	 * @see #getDureeEstimeeOuPlanifiee()
	 * @generated
	 */
	void setDureeEstimeeOuPlanifiee(TypeDataTypeDuree value);

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
	 * @see mpia.schema.SchemaPackage#getTypeEfficaciteProbabiliste_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEfficaciteProbabiliste#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeEfficaciteProbabiliste_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEfficaciteProbabiliste#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

} // TypeEfficaciteProbabiliste
