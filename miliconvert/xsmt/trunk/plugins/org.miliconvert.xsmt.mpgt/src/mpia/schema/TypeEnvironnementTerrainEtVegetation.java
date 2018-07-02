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
 * A representation of the model object '<em><b>Type Environnement Terrain Et Vegetation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEnvironnementTerrainEtVegetation#getDescriptionTerrain <em>Description Terrain</em>}</li>
 *   <li>{@link mpia.schema.TypeEnvironnementTerrainEtVegetation#getDescriptionVegetation <em>Description Vegetation</em>}</li>
 *   <li>{@link mpia.schema.TypeEnvironnementTerrainEtVegetation#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeEnvironnementTerrainEtVegetation#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEnvironnementTerrainEtVegetation()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_EnvironnementTerrainEtVegetation' kind='elementOnly'"
 * @generated
 */
public interface TypeEnvironnementTerrainEtVegetation extends EObject {
	/**
	 * Returns the value of the '<em><b>Description Terrain</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEnvironnementTerrainEtVegetationDescriptionTerrain}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description Terrain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Terrain</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEnvironnementTerrainEtVegetationDescriptionTerrain
	 * @see #isSetDescriptionTerrain()
	 * @see #unsetDescriptionTerrain()
	 * @see #setDescriptionTerrain(TypeDictionaryDicoEnvironnementTerrainEtVegetationDescriptionTerrain)
	 * @see mpia.schema.SchemaPackage#getTypeEnvironnementTerrainEtVegetation_DescriptionTerrain()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='DescriptionTerrain'"
	 * @generated
	 */
	TypeDictionaryDicoEnvironnementTerrainEtVegetationDescriptionTerrain getDescriptionTerrain();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEnvironnementTerrainEtVegetation#getDescriptionTerrain <em>Description Terrain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Terrain</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEnvironnementTerrainEtVegetationDescriptionTerrain
	 * @see #isSetDescriptionTerrain()
	 * @see #unsetDescriptionTerrain()
	 * @see #getDescriptionTerrain()
	 * @generated
	 */
	void setDescriptionTerrain(TypeDictionaryDicoEnvironnementTerrainEtVegetationDescriptionTerrain value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEnvironnementTerrainEtVegetation#getDescriptionTerrain <em>Description Terrain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDescriptionTerrain()
	 * @see #getDescriptionTerrain()
	 * @see #setDescriptionTerrain(TypeDictionaryDicoEnvironnementTerrainEtVegetationDescriptionTerrain)
	 * @generated
	 */
	void unsetDescriptionTerrain();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEnvironnementTerrainEtVegetation#getDescriptionTerrain <em>Description Terrain</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Description Terrain</em>' attribute is set.
	 * @see #unsetDescriptionTerrain()
	 * @see #getDescriptionTerrain()
	 * @see #setDescriptionTerrain(TypeDictionaryDicoEnvironnementTerrainEtVegetationDescriptionTerrain)
	 * @generated
	 */
	boolean isSetDescriptionTerrain();

	/**
	 * Returns the value of the '<em><b>Description Vegetation</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEnvironnementTerrainEtVegetationDescriptionVegetation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description Vegetation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Vegetation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEnvironnementTerrainEtVegetationDescriptionVegetation
	 * @see #isSetDescriptionVegetation()
	 * @see #unsetDescriptionVegetation()
	 * @see #setDescriptionVegetation(TypeDictionaryDicoEnvironnementTerrainEtVegetationDescriptionVegetation)
	 * @see mpia.schema.SchemaPackage#getTypeEnvironnementTerrainEtVegetation_DescriptionVegetation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='DescriptionVegetation'"
	 * @generated
	 */
	TypeDictionaryDicoEnvironnementTerrainEtVegetationDescriptionVegetation getDescriptionVegetation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEnvironnementTerrainEtVegetation#getDescriptionVegetation <em>Description Vegetation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Vegetation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEnvironnementTerrainEtVegetationDescriptionVegetation
	 * @see #isSetDescriptionVegetation()
	 * @see #unsetDescriptionVegetation()
	 * @see #getDescriptionVegetation()
	 * @generated
	 */
	void setDescriptionVegetation(TypeDictionaryDicoEnvironnementTerrainEtVegetationDescriptionVegetation value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEnvironnementTerrainEtVegetation#getDescriptionVegetation <em>Description Vegetation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDescriptionVegetation()
	 * @see #getDescriptionVegetation()
	 * @see #setDescriptionVegetation(TypeDictionaryDicoEnvironnementTerrainEtVegetationDescriptionVegetation)
	 * @generated
	 */
	void unsetDescriptionVegetation();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEnvironnementTerrainEtVegetation#getDescriptionVegetation <em>Description Vegetation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Description Vegetation</em>' attribute is set.
	 * @see #unsetDescriptionVegetation()
	 * @see #getDescriptionVegetation()
	 * @see #setDescriptionVegetation(TypeDictionaryDicoEnvironnementTerrainEtVegetationDescriptionVegetation)
	 * @generated
	 */
	boolean isSetDescriptionVegetation();

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
	 * @see mpia.schema.SchemaPackage#getTypeEnvironnementTerrainEtVegetation_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEnvironnementTerrainEtVegetation#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeEnvironnementTerrainEtVegetation_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEnvironnementTerrainEtVegetation#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

} // TypeEnvironnementTerrainEtVegetation
