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
 * A representation of the model object '<em><b>Type Stade Alerte Emission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeStadeAlerteEmission#getStadeAlerte <em>Stade Alerte</em>}</li>
 *   <li>{@link mpia.schema.TypeStadeAlerteEmission#getStadeEmission <em>Stade Emission</em>}</li>
 *   <li>{@link mpia.schema.TypeStadeAlerteEmission#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeStadeAlerteEmission#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeStadeAlerteEmission#getAPourCreneauTempsPeriode3D <em>APour Creneau Temps Periode3 D</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeStadeAlerteEmission()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_StadeAlerteEmission' kind='elementOnly'"
 * @generated
 */
public interface TypeStadeAlerteEmission extends EObject {
	/**
	 * Returns the value of the '<em><b>Stade Alerte</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoStadeAlerteEmissionStadeAlerte}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stade Alerte</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stade Alerte</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoStadeAlerteEmissionStadeAlerte
	 * @see #isSetStadeAlerte()
	 * @see #unsetStadeAlerte()
	 * @see #setStadeAlerte(TypeDictionaryDicoStadeAlerteEmissionStadeAlerte)
	 * @see mpia.schema.SchemaPackage#getTypeStadeAlerteEmission_StadeAlerte()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='StadeAlerte'"
	 * @generated
	 */
	TypeDictionaryDicoStadeAlerteEmissionStadeAlerte getStadeAlerte();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeStadeAlerteEmission#getStadeAlerte <em>Stade Alerte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stade Alerte</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoStadeAlerteEmissionStadeAlerte
	 * @see #isSetStadeAlerte()
	 * @see #unsetStadeAlerte()
	 * @see #getStadeAlerte()
	 * @generated
	 */
	void setStadeAlerte(TypeDictionaryDicoStadeAlerteEmissionStadeAlerte value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeStadeAlerteEmission#getStadeAlerte <em>Stade Alerte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStadeAlerte()
	 * @see #getStadeAlerte()
	 * @see #setStadeAlerte(TypeDictionaryDicoStadeAlerteEmissionStadeAlerte)
	 * @generated
	 */
	void unsetStadeAlerte();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeStadeAlerteEmission#getStadeAlerte <em>Stade Alerte</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stade Alerte</em>' attribute is set.
	 * @see #unsetStadeAlerte()
	 * @see #getStadeAlerte()
	 * @see #setStadeAlerte(TypeDictionaryDicoStadeAlerteEmissionStadeAlerte)
	 * @generated
	 */
	boolean isSetStadeAlerte();

	/**
	 * Returns the value of the '<em><b>Stade Emission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stade Emission</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stade Emission</em>' attribute.
	 * @see #setStadeEmission(String)
	 * @see mpia.schema.SchemaPackage#getTypeStadeAlerteEmission_StadeEmission()
	 * @model dataType="mpia.meta.TypeDataTypeChaine020"
	 *        extendedMetaData="kind='element' name='StadeEmission'"
	 * @generated
	 */
	String getStadeEmission();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeStadeAlerteEmission#getStadeEmission <em>Stade Emission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stade Emission</em>' attribute.
	 * @see #getStadeEmission()
	 * @generated
	 */
	void setStadeEmission(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeStadeAlerteEmission_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeStadeAlerteEmission#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeStadeAlerteEmission_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeStadeAlerteEmission#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Creneau Temps Periode3 D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Creneau Temps Periode3 D</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Creneau Temps Periode3 D</em>' containment reference.
	 * @see #setAPourCreneauTempsPeriode3D(TypePeriode3D)
	 * @see mpia.schema.SchemaPackage#getTypeStadeAlerteEmission_APourCreneauTempsPeriode3D()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Periode3D'"
	 *        extendedMetaData="kind='element' name='APourCreneauTemps_Periode3D'"
	 * @generated
	 */
	TypePeriode3D getAPourCreneauTempsPeriode3D();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeStadeAlerteEmission#getAPourCreneauTempsPeriode3D <em>APour Creneau Temps Periode3 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Creneau Temps Periode3 D</em>' containment reference.
	 * @see #getAPourCreneauTempsPeriode3D()
	 * @generated
	 */
	void setAPourCreneauTempsPeriode3D(TypePeriode3D value);

} // TypeStadeAlerteEmission
