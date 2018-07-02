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
 * A representation of the model object '<em><b>Type Armement Mission Appui Aerien</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeArmementMissionAppuiAerien#getNombreMunitions <em>Nombre Munitions</em>}</li>
 *   <li>{@link mpia.schema.TypeArmementMissionAppuiAerien#getCodeSCL <em>Code SCL</em>}</li>
 *   <li>{@link mpia.schema.TypeArmementMissionAppuiAerien#getTypeFusee <em>Type Fusee</em>}</li>
 *   <li>{@link mpia.schema.TypeArmementMissionAppuiAerien#getDescriptionTypeMunitions <em>Description Type Munitions</em>}</li>
 *   <li>{@link mpia.schema.TypeArmementMissionAppuiAerien#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeArmementMissionAppuiAerien#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeArmementMissionAppuiAerien()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ArmementMissionAppuiAerien' kind='elementOnly'"
 * @generated
 */
public interface TypeArmementMissionAppuiAerien extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre Munitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Munitions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Munitions</em>' attribute.
	 * @see #isSetNombreMunitions()
	 * @see #unsetNombreMunitions()
	 * @see #setNombreMunitions(long)
	 * @see mpia.schema.SchemaPackage#getTypeArmementMissionAppuiAerien_NombreMunitions()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NombreMunitions'"
	 * @generated
	 */
	long getNombreMunitions();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeArmementMissionAppuiAerien#getNombreMunitions <em>Nombre Munitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Munitions</em>' attribute.
	 * @see #isSetNombreMunitions()
	 * @see #unsetNombreMunitions()
	 * @see #getNombreMunitions()
	 * @generated
	 */
	void setNombreMunitions(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeArmementMissionAppuiAerien#getNombreMunitions <em>Nombre Munitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreMunitions()
	 * @see #getNombreMunitions()
	 * @see #setNombreMunitions(long)
	 * @generated
	 */
	void unsetNombreMunitions();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeArmementMissionAppuiAerien#getNombreMunitions <em>Nombre Munitions</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Munitions</em>' attribute is set.
	 * @see #unsetNombreMunitions()
	 * @see #getNombreMunitions()
	 * @see #setNombreMunitions(long)
	 * @generated
	 */
	boolean isSetNombreMunitions();

	/**
	 * Returns the value of the '<em><b>Code SCL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code SCL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code SCL</em>' attribute.
	 * @see #setCodeSCL(String)
	 * @see mpia.schema.SchemaPackage#getTypeArmementMissionAppuiAerien_CodeSCL()
	 * @model dataType="mpia.meta.TypeDataTypeChaine08"
	 *        extendedMetaData="kind='element' name='CodeSCL'"
	 * @generated
	 */
	String getCodeSCL();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeArmementMissionAppuiAerien#getCodeSCL <em>Code SCL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code SCL</em>' attribute.
	 * @see #getCodeSCL()
	 * @generated
	 */
	void setCodeSCL(String value);

	/**
	 * Returns the value of the '<em><b>Type Fusee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Fusee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Fusee</em>' attribute.
	 * @see #setTypeFusee(String)
	 * @see mpia.schema.SchemaPackage#getTypeArmementMissionAppuiAerien_TypeFusee()
	 * @model dataType="mpia.meta.TypeDataTypeChaine020"
	 *        extendedMetaData="kind='element' name='TypeFusee'"
	 * @generated
	 */
	String getTypeFusee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeArmementMissionAppuiAerien#getTypeFusee <em>Type Fusee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Fusee</em>' attribute.
	 * @see #getTypeFusee()
	 * @generated
	 */
	void setTypeFusee(String value);

	/**
	 * Returns the value of the '<em><b>Description Type Munitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description Type Munitions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Type Munitions</em>' attribute.
	 * @see #setDescriptionTypeMunitions(String)
	 * @see mpia.schema.SchemaPackage#getTypeArmementMissionAppuiAerien_DescriptionTypeMunitions()
	 * @model dataType="mpia.meta.TypeDataTypeChaine015"
	 *        extendedMetaData="kind='element' name='DescriptionTypeMunitions'"
	 * @generated
	 */
	String getDescriptionTypeMunitions();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeArmementMissionAppuiAerien#getDescriptionTypeMunitions <em>Description Type Munitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Type Munitions</em>' attribute.
	 * @see #getDescriptionTypeMunitions()
	 * @generated
	 */
	void setDescriptionTypeMunitions(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeArmementMissionAppuiAerien_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeArmementMissionAppuiAerien#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeArmementMissionAppuiAerien_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeArmementMissionAppuiAerien#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

} // TypeArmementMissionAppuiAerien
