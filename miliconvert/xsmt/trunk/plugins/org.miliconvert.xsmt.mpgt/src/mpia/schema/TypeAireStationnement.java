/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Aire Stationnement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAireStationnement#getForceExercee <em>Force Exercee</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAireStationnement()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AireStationnement' kind='elementOnly'"
 * @generated
 */
public interface TypeAireStationnement extends TypeSite {
	/**
	 * Returns the value of the '<em><b>Force Exercee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Force Exercee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Force Exercee</em>' attribute.
	 * @see #isSetForceExercee()
	 * @see #unsetForceExercee()
	 * @see #setForceExercee(double)
	 * @see mpia.schema.SchemaPackage#getTypeAireStationnement_ForceExercee()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='ForceExercee'"
	 * @generated
	 */
	double getForceExercee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAireStationnement#getForceExercee <em>Force Exercee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Force Exercee</em>' attribute.
	 * @see #isSetForceExercee()
	 * @see #unsetForceExercee()
	 * @see #getForceExercee()
	 * @generated
	 */
	void setForceExercee(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAireStationnement#getForceExercee <em>Force Exercee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetForceExercee()
	 * @see #getForceExercee()
	 * @see #setForceExercee(double)
	 * @generated
	 */
	void unsetForceExercee();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAireStationnement#getForceExercee <em>Force Exercee</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Force Exercee</em>' attribute is set.
	 * @see #unsetForceExercee()
	 * @see #getForceExercee()
	 * @see #setForceExercee(double)
	 * @generated
	 */
	boolean isSetForceExercee();

} // TypeAireStationnement
