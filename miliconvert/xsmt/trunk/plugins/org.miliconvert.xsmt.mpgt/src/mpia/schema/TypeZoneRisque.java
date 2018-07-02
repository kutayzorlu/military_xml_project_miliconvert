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
 * A representation of the model object '<em><b>Type Zone Risque</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeZoneRisque#getMesuresParticulieres <em>Mesures Particulieres</em>}</li>
 *   <li>{@link mpia.schema.TypeZoneRisque#getNiveauRisque <em>Niveau Risque</em>}</li>
 *   <li>{@link mpia.schema.TypeZoneRisque#getNatureRisque <em>Nature Risque</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeZoneRisque()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ZoneRisque' kind='elementOnly'"
 * @generated
 */
public interface TypeZoneRisque extends EObject {
	/**
	 * Returns the value of the '<em><b>Mesures Particulieres</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mesures Particulieres</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mesures Particulieres</em>' attribute.
	 * @see #setMesuresParticulieres(String)
	 * @see mpia.schema.SchemaPackage#getTypeZoneRisque_MesuresParticulieres()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='MesuresParticulieres'"
	 * @generated
	 */
	String getMesuresParticulieres();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneRisque#getMesuresParticulieres <em>Mesures Particulieres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mesures Particulieres</em>' attribute.
	 * @see #getMesuresParticulieres()
	 * @generated
	 */
	void setMesuresParticulieres(String value);

	/**
	 * Returns the value of the '<em><b>Niveau Risque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Niveau Risque</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau Risque</em>' attribute.
	 * @see #setNiveauRisque(String)
	 * @see mpia.schema.SchemaPackage#getTypeZoneRisque_NiveauRisque()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='NiveauRisque'"
	 * @generated
	 */
	String getNiveauRisque();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneRisque#getNiveauRisque <em>Niveau Risque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Niveau Risque</em>' attribute.
	 * @see #getNiveauRisque()
	 * @generated
	 */
	void setNiveauRisque(String value);

	/**
	 * Returns the value of the '<em><b>Nature Risque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nature Risque</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nature Risque</em>' attribute.
	 * @see #setNatureRisque(String)
	 * @see mpia.schema.SchemaPackage#getTypeZoneRisque_NatureRisque()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='NatureRisque'"
	 * @generated
	 */
	String getNatureRisque();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneRisque#getNatureRisque <em>Nature Risque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nature Risque</em>' attribute.
	 * @see #getNatureRisque()
	 * @generated
	 */
	void setNatureRisque(String value);

} // TypeZoneRisque
