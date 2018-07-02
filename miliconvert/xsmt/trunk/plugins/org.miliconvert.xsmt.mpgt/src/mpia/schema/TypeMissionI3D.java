/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Mission I3D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMissionI3D#getPriorite <em>Priorite</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionI3D#getMesuresParticulieresI3D <em>Mesures Particulieres I3D</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionI3D#getAPourTypeMissionAerienneTypeMissionI3D <em>APour Type Mission Aerienne Type Mission I3D</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionI3D#getAPourZonesCoordinationAutreElementControle <em>APour Zones Coordination Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionI3D#getEstRealiseeParTypeIntervenant3D <em>Est Realisee Par Type Intervenant3 D</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMissionI3D()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_MissionI3D' kind='elementOnly'"
 * @generated
 */
public interface TypeMissionI3D extends TypeMission {
	/**
	 * Returns the value of the '<em><b>Priorite</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPriorite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priorite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priorite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPriorite
	 * @see #isSetPriorite()
	 * @see #unsetPriorite()
	 * @see #setPriorite(TypeDictionaryDicoPriorite)
	 * @see mpia.schema.SchemaPackage#getTypeMissionI3D_Priorite()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Priorite'"
	 * @generated
	 */
	TypeDictionaryDicoPriorite getPriorite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionI3D#getPriorite <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priorite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPriorite
	 * @see #isSetPriorite()
	 * @see #unsetPriorite()
	 * @see #getPriorite()
	 * @generated
	 */
	void setPriorite(TypeDictionaryDicoPriorite value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionI3D#getPriorite <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPriorite()
	 * @see #getPriorite()
	 * @see #setPriorite(TypeDictionaryDicoPriorite)
	 * @generated
	 */
	void unsetPriorite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionI3D#getPriorite <em>Priorite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Priorite</em>' attribute is set.
	 * @see #unsetPriorite()
	 * @see #getPriorite()
	 * @see #setPriorite(TypeDictionaryDicoPriorite)
	 * @generated
	 */
	boolean isSetPriorite();

	/**
	 * Returns the value of the '<em><b>Mesures Particulieres I3D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mesures Particulieres I3D</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mesures Particulieres I3D</em>' attribute.
	 * @see #setMesuresParticulieresI3D(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionI3D_MesuresParticulieresI3D()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='MesuresParticulieresI3D'"
	 * @generated
	 */
	String getMesuresParticulieresI3D();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionI3D#getMesuresParticulieresI3D <em>Mesures Particulieres I3D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mesures Particulieres I3D</em>' attribute.
	 * @see #getMesuresParticulieresI3D()
	 * @generated
	 */
	void setMesuresParticulieresI3D(String value);

	/**
	 * Returns the value of the '<em><b>APour Type Mission Aerienne Type Mission I3D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Type Mission Aerienne Type Mission I3D</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Type Mission Aerienne Type Mission I3D</em>' containment reference.
	 * @see #setAPourTypeMissionAerienneTypeMissionI3D(TypeTypeMissionI3D)
	 * @see mpia.schema.SchemaPackage#getTypeMissionI3D_APourTypeMissionAerienneTypeMissionI3D()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_TypeMissionI3D'"
	 *        extendedMetaData="kind='element' name='APourTypeMissionAerienne_TypeMissionI3D'"
	 * @generated
	 */
	TypeTypeMissionI3D getAPourTypeMissionAerienneTypeMissionI3D();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionI3D#getAPourTypeMissionAerienneTypeMissionI3D <em>APour Type Mission Aerienne Type Mission I3D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Type Mission Aerienne Type Mission I3D</em>' containment reference.
	 * @see #getAPourTypeMissionAerienneTypeMissionI3D()
	 * @generated
	 */
	void setAPourTypeMissionAerienneTypeMissionI3D(TypeTypeMissionI3D value);

	/**
	 * Returns the value of the '<em><b>APour Zones Coordination Autre Element Controle</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Zones Coordination Autre Element Controle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Zones Coordination Autre Element Controle</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionI3D_APourZonesCoordinationAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourZonesCoordination_AutreElementControle'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourZonesCoordinationAutreElementControle();

	/**
	 * Returns the value of the '<em><b>Est Realisee Par Type Intervenant3 D</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTypeIntervenant3D}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Realisee Par Type Intervenant3 D</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Realisee Par Type Intervenant3 D</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionI3D_EstRealiseeParTypeIntervenant3D()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_TypeIntervenant3D'"
	 *        extendedMetaData="kind='element' name='EstRealiseePar_TypeIntervenant3D'"
	 * @generated
	 */
	EList<TypeTypeIntervenant3D> getEstRealiseeParTypeIntervenant3D();

} // TypeMissionI3D
