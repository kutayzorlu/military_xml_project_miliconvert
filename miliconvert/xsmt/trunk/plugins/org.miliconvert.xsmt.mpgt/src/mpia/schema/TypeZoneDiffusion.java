/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeLongueur;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Zone Diffusion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeZoneDiffusion#getLargZoneDiffusion <em>Larg Zone Diffusion</em>}</li>
 *   <li>{@link mpia.schema.TypeZoneDiffusion#getHautZoneDiffusion <em>Haut Zone Diffusion</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeZoneDiffusion()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ZoneDiffusion' kind='elementOnly'"
 * @generated
 */
public interface TypeZoneDiffusion extends EObject {
	/**
	 * Returns the value of the '<em><b>Larg Zone Diffusion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Larg Zone Diffusion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Larg Zone Diffusion</em>' containment reference.
	 * @see #setLargZoneDiffusion(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeZoneDiffusion_LargZoneDiffusion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LargZoneDiffusion'"
	 * @generated
	 */
	TypeDataTypeLongueur getLargZoneDiffusion();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneDiffusion#getLargZoneDiffusion <em>Larg Zone Diffusion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Larg Zone Diffusion</em>' containment reference.
	 * @see #getLargZoneDiffusion()
	 * @generated
	 */
	void setLargZoneDiffusion(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Haut Zone Diffusion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Haut Zone Diffusion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Haut Zone Diffusion</em>' containment reference.
	 * @see #setHautZoneDiffusion(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeZoneDiffusion_HautZoneDiffusion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='HautZoneDiffusion'"
	 * @generated
	 */
	TypeDataTypeLongueur getHautZoneDiffusion();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneDiffusion#getHautZoneDiffusion <em>Haut Zone Diffusion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Haut Zone Diffusion</em>' containment reference.
	 * @see #getHautZoneDiffusion()
	 * @generated
	 */
	void setHautZoneDiffusion(TypeDataTypeLongueur value);

} // TypeZoneDiffusion
