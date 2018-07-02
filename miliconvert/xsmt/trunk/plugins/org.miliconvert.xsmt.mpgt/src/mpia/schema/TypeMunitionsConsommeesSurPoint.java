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
 * A representation of the model object '<em><b>Type Munitions Consommees Sur Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMunitionsConsommeesSurPoint#getNombreMunitionsTypeTirees <em>Nombre Munitions Type Tirees</em>}</li>
 *   <li>{@link mpia.schema.TypeMunitionsConsommeesSurPoint#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeMunitionsConsommeesSurPoint#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeMunitionsConsommeesSurPoint#getEstTypeTypeMunition <em>Est Type Type Munition</em>}</li>
 *   <li>{@link mpia.schema.TypeMunitionsConsommeesSurPoint#getEstLocaliseEnLocalisationGeometrique2D <em>Est Localise En Localisation Geometrique2 D</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMunitionsConsommeesSurPoint()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_MunitionsConsommeesSurPoint' kind='elementOnly'"
 * @generated
 */
public interface TypeMunitionsConsommeesSurPoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre Munitions Type Tirees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Munitions Type Tirees</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Munitions Type Tirees</em>' attribute.
	 * @see #isSetNombreMunitionsTypeTirees()
	 * @see #unsetNombreMunitionsTypeTirees()
	 * @see #setNombreMunitionsTypeTirees(long)
	 * @see mpia.schema.SchemaPackage#getTypeMunitionsConsommeesSurPoint_NombreMunitionsTypeTirees()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NombreMunitionsTypeTirees'"
	 * @generated
	 */
	long getNombreMunitionsTypeTirees();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMunitionsConsommeesSurPoint#getNombreMunitionsTypeTirees <em>Nombre Munitions Type Tirees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Munitions Type Tirees</em>' attribute.
	 * @see #isSetNombreMunitionsTypeTirees()
	 * @see #unsetNombreMunitionsTypeTirees()
	 * @see #getNombreMunitionsTypeTirees()
	 * @generated
	 */
	void setNombreMunitionsTypeTirees(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMunitionsConsommeesSurPoint#getNombreMunitionsTypeTirees <em>Nombre Munitions Type Tirees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreMunitionsTypeTirees()
	 * @see #getNombreMunitionsTypeTirees()
	 * @see #setNombreMunitionsTypeTirees(long)
	 * @generated
	 */
	void unsetNombreMunitionsTypeTirees();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMunitionsConsommeesSurPoint#getNombreMunitionsTypeTirees <em>Nombre Munitions Type Tirees</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Munitions Type Tirees</em>' attribute is set.
	 * @see #unsetNombreMunitionsTypeTirees()
	 * @see #getNombreMunitionsTypeTirees()
	 * @see #setNombreMunitionsTypeTirees(long)
	 * @generated
	 */
	boolean isSetNombreMunitionsTypeTirees();

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
	 * @see mpia.schema.SchemaPackage#getTypeMunitionsConsommeesSurPoint_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMunitionsConsommeesSurPoint#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeMunitionsConsommeesSurPoint_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMunitionsConsommeesSurPoint#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Est Type Type Munition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Type Type Munition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Type Type Munition</em>' containment reference.
	 * @see #setEstTypeTypeMunition(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeMunitionsConsommeesSurPoint_EstTypeTypeMunition()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeMunition'"
	 *        extendedMetaData="kind='element' name='EstType_TypeMunition'"
	 * @generated
	 */
	TypeAssociationEXT getEstTypeTypeMunition();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMunitionsConsommeesSurPoint#getEstTypeTypeMunition <em>Est Type Type Munition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Type Type Munition</em>' containment reference.
	 * @see #getEstTypeTypeMunition()
	 * @generated
	 */
	void setEstTypeTypeMunition(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>Est Localise En Localisation Geometrique2 D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Localise En Localisation Geometrique2 D</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Localise En Localisation Geometrique2 D</em>' containment reference.
	 * @see #setEstLocaliseEnLocalisationGeometrique2D(TypeLocalisationGeometrique2D)
	 * @see mpia.schema.SchemaPackage#getTypeMunitionsConsommeesSurPoint_EstLocaliseEnLocalisationGeometrique2D()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_LocalisationGeometrique2D'"
	 *        extendedMetaData="kind='element' name='EstLocaliseEn_LocalisationGeometrique2D'"
	 * @generated
	 */
	TypeLocalisationGeometrique2D getEstLocaliseEnLocalisationGeometrique2D();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMunitionsConsommeesSurPoint#getEstLocaliseEnLocalisationGeometrique2D <em>Est Localise En Localisation Geometrique2 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Localise En Localisation Geometrique2 D</em>' containment reference.
	 * @see #getEstLocaliseEnLocalisationGeometrique2D()
	 * @generated
	 */
	void setEstLocaliseEnLocalisationGeometrique2D(TypeLocalisationGeometrique2D value);

} // TypeMunitionsConsommeesSurPoint
