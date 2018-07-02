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
 * A representation of the model object '<em><b>Type Coordination4 D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCoordination4D#getDomaineRestriction <em>Domaine Restriction</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCoordination4D()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_Coordination4D' kind='elementOnly'"
 * @generated
 */
public interface TypeCoordination4D extends EObject {
	/**
	 * Returns the value of the '<em><b>Domaine Restriction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domaine Restriction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domaine Restriction</em>' attribute.
	 * @see #setDomaineRestriction(String)
	 * @see mpia.schema.SchemaPackage#getTypeCoordination4D_DomaineRestriction()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080" required="true"
	 *        extendedMetaData="kind='element' name='DomaineRestriction'"
	 * @generated
	 */
	String getDomaineRestriction();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCoordination4D#getDomaineRestriction <em>Domaine Restriction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domaine Restriction</em>' attribute.
	 * @see #getDomaineRestriction()
	 * @generated
	 */
	void setDomaineRestriction(String value);

} // TypeCoordination4D
