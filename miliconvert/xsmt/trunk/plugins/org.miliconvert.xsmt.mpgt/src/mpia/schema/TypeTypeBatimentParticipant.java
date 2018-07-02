/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Type Batiment Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeTypeBatimentParticipant#getNombre <em>Nombre</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeBatimentParticipant#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeBatimentParticipant#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeBatimentParticipant#getEstTypeTypeBatiment <em>Est Type Type Batiment</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeTypeBatimentParticipant()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_TypeBatimentParticipant' kind='elementOnly'"
 * @generated
 */
public interface TypeTypeBatimentParticipant extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #isSetNombre()
	 * @see #unsetNombre()
	 * @see #setNombre(long)
	 * @see mpia.schema.SchemaPackage#getTypeTypeBatimentParticipant_Nombre()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3" required="true"
	 *        extendedMetaData="kind='element' name='Nombre'"
	 * @generated
	 */
	long getNombre();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeBatimentParticipant#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #isSetNombre()
	 * @see #unsetNombre()
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeBatimentParticipant#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombre()
	 * @see #getNombre()
	 * @see #setNombre(long)
	 * @generated
	 */
	void unsetNombre();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeBatimentParticipant#getNombre <em>Nombre</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre</em>' attribute is set.
	 * @see #unsetNombre()
	 * @see #getNombre()
	 * @see #setNombre(long)
	 * @generated
	 */
	boolean isSetNombre();

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
	 * @see mpia.schema.SchemaPackage#getTypeTypeBatimentParticipant_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeBatimentParticipant#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeTypeBatimentParticipant_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeBatimentParticipant#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Est Type Type Batiment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Type Type Batiment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Type Type Batiment</em>' containment reference.
	 * @see #setEstTypeTypeBatiment(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeTypeBatimentParticipant_EstTypeTypeBatiment()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeBatiment'"
	 *        extendedMetaData="kind='element' name='EstType_TypeBatiment'"
	 * @generated
	 */
	TypeAssociationEXT getEstTypeTypeBatiment();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeBatimentParticipant#getEstTypeTypeBatiment <em>Est Type Type Batiment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Type Type Batiment</em>' containment reference.
	 * @see #getEstTypeTypeBatiment()
	 * @generated
	 */
	void setEstTypeTypeBatiment(TypeAssociationEXT value);

} // TypeTypeBatimentParticipant
