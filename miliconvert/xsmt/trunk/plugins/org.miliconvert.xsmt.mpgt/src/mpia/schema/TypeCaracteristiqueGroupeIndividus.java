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
 * A representation of the model object '<em><b>Type Caracteristique Groupe Individus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCaracteristiqueGroupeIndividus#getNombreIndividus <em>Nombre Individus</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCaracteristiqueGroupeIndividus()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_CaracteristiqueGroupeIndividus' kind='elementOnly'"
 * @generated
 */
public interface TypeCaracteristiqueGroupeIndividus extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre Individus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Individus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Individus</em>' attribute.
	 * @see #isSetNombreIndividus()
	 * @see #unsetNombreIndividus()
	 * @see #setNombreIndividus(long)
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiqueGroupeIndividus_NombreIndividus()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier15" required="true"
	 *        extendedMetaData="kind='element' name='NombreIndividus'"
	 * @generated
	 */
	long getNombreIndividus();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiqueGroupeIndividus#getNombreIndividus <em>Nombre Individus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Individus</em>' attribute.
	 * @see #isSetNombreIndividus()
	 * @see #unsetNombreIndividus()
	 * @see #getNombreIndividus()
	 * @generated
	 */
	void setNombreIndividus(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCaracteristiqueGroupeIndividus#getNombreIndividus <em>Nombre Individus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreIndividus()
	 * @see #getNombreIndividus()
	 * @see #setNombreIndividus(long)
	 * @generated
	 */
	void unsetNombreIndividus();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCaracteristiqueGroupeIndividus#getNombreIndividus <em>Nombre Individus</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Individus</em>' attribute is set.
	 * @see #unsetNombreIndividus()
	 * @see #getNombreIndividus()
	 * @see #setNombreIndividus(long)
	 * @generated
	 */
	boolean isSetNombreIndividus();

} // TypeCaracteristiqueGroupeIndividus
