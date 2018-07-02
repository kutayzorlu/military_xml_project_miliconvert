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
 * A representation of the model object '<em><b>Type Mission Renseignement Objectif</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMissionRenseignementObjectif#getTypeSource <em>Type Source</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionRenseignementObjectif#getAutreTypeSource <em>Autre Type Source</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionRenseignementObjectif#getEstObjetAssociationRenseignementObjMisRenseignementObj <em>Est Objet Association Renseignement Obj Mis Renseignement Obj</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionRenseignementObjectif#getEstSujetAssociationMissionRensObjPlanTraitementObj <em>Est Sujet Association Mission Rens Obj Plan Traitement Obj</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionRenseignementObjectif#getEstSujetAssociationMissionRensObjTraitementObj <em>Est Sujet Association Mission Rens Obj Traitement Obj</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionRenseignementObjectif#getAPourComposanteResponsableComposanteAppui <em>APour Composante Responsable Composante Appui</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionRenseignementObjectif#getAPourACOreferenceListeMesuresCoordination3D <em>APour AC Oreference Liste Mesures Coordination3 D</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionRenseignementObjectif#getAPourVolumeTirMesureCoordination <em>APour Volume Tir Mesure Coordination</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionRenseignementObjectif#getAPourModalitesAcquisitionModalitesAcquisitionObjectif <em>APour Modalites Acquisition Modalites Acquisition Objectif</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionRenseignementObjectif#getAPourModalitesEvaluationDegatsModalitesEvaluationDegats <em>APour Modalites Evaluation Degats Modalites Evaluation Degats</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionRenseignementObjectif#getEstObjetAssociationUniteMissionRensObj <em>Est Objet Association Unite Mission Rens Obj</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMissionRenseignementObjectif()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_MissionRenseignementObjectif' kind='elementOnly'"
 * @generated
 */
public interface TypeMissionRenseignementObjectif extends TypeMission {
	/**
	 * Returns the value of the '<em><b>Type Source</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoRapportTypeSource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Source</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoRapportTypeSource
	 * @see #isSetTypeSource()
	 * @see #unsetTypeSource()
	 * @see #setTypeSource(TypeDictionaryDicoRapportTypeSource)
	 * @see mpia.schema.SchemaPackage#getTypeMissionRenseignementObjectif_TypeSource()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeSource'"
	 * @generated
	 */
	TypeDictionaryDicoRapportTypeSource getTypeSource();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionRenseignementObjectif#getTypeSource <em>Type Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Source</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoRapportTypeSource
	 * @see #isSetTypeSource()
	 * @see #unsetTypeSource()
	 * @see #getTypeSource()
	 * @generated
	 */
	void setTypeSource(TypeDictionaryDicoRapportTypeSource value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionRenseignementObjectif#getTypeSource <em>Type Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeSource()
	 * @see #getTypeSource()
	 * @see #setTypeSource(TypeDictionaryDicoRapportTypeSource)
	 * @generated
	 */
	void unsetTypeSource();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionRenseignementObjectif#getTypeSource <em>Type Source</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Source</em>' attribute is set.
	 * @see #unsetTypeSource()
	 * @see #getTypeSource()
	 * @see #setTypeSource(TypeDictionaryDicoRapportTypeSource)
	 * @generated
	 */
	boolean isSetTypeSource();

	/**
	 * Returns the value of the '<em><b>Autre Type Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Type Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Type Source</em>' attribute.
	 * @see #setAutreTypeSource(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionRenseignementObjectif_AutreTypeSource()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='AutreTypeSource'"
	 * @generated
	 */
	String getAutreTypeSource();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionRenseignementObjectif#getAutreTypeSource <em>Autre Type Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autre Type Source</em>' attribute.
	 * @see #getAutreTypeSource()
	 * @generated
	 */
	void setAutreTypeSource(String value);

	/**
	 * Returns the value of the '<em><b>Est Objet Association Renseignement Obj Mis Renseignement Obj</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Renseignement Obj Mis Renseignement Obj</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Renseignement Obj Mis Renseignement Obj</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionRenseignementObjectif_EstObjetAssociationRenseignementObjMisRenseignementObj()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeObjet_MissionRenseignementObjectif' target_entity='type_AssociationRenseignementObjMisRenseignementObj'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationRenseignementObjMisRenseignementObj'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationRenseignementObjMisRenseignementObj();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Mission Rens Obj Plan Traitement Obj</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Mission Rens Obj Plan Traitement Obj</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Mission Rens Obj Plan Traitement Obj</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionRenseignementObjectif_EstSujetAssociationMissionRensObjPlanTraitementObj()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeSujet_MissionRenseignementObjectif' target_entity='type_AssociationMissionRensObjPlanTraitementObj'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationMissionRensObjPlanTraitementObj'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationMissionRensObjPlanTraitementObj();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Mission Rens Obj Traitement Obj</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Mission Rens Obj Traitement Obj</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Mission Rens Obj Traitement Obj</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionRenseignementObjectif_EstSujetAssociationMissionRensObjTraitementObj()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeSujet_MissionRenseignementObjectif' target_entity='type_AssociationMissionRensObjTraitementObj'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationMissionRensObjTraitementObj'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationMissionRensObjTraitementObj();

	/**
	 * Returns the value of the '<em><b>APour Composante Responsable Composante Appui</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Composante Responsable Composante Appui</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Composante Responsable Composante Appui</em>' containment reference.
	 * @see #setAPourComposanteResponsableComposanteAppui(TypeComposanteAppui)
	 * @see mpia.schema.SchemaPackage#getTypeMissionRenseignementObjectif_APourComposanteResponsableComposanteAppui()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ComposanteAppui'"
	 *        extendedMetaData="kind='element' name='APourComposanteResponsable_ComposanteAppui'"
	 * @generated
	 */
	TypeComposanteAppui getAPourComposanteResponsableComposanteAppui();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionRenseignementObjectif#getAPourComposanteResponsableComposanteAppui <em>APour Composante Responsable Composante Appui</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Composante Responsable Composante Appui</em>' containment reference.
	 * @see #getAPourComposanteResponsableComposanteAppui()
	 * @generated
	 */
	void setAPourComposanteResponsableComposanteAppui(TypeComposanteAppui value);

	/**
	 * Returns the value of the '<em><b>APour AC Oreference Liste Mesures Coordination3 D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour AC Oreference Liste Mesures Coordination3 D</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour AC Oreference Liste Mesures Coordination3 D</em>' containment reference.
	 * @see #setAPourACOreferenceListeMesuresCoordination3D(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeMissionRenseignementObjectif_APourACOreferenceListeMesuresCoordination3D()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_ListeMesuresCoordination3D'"
	 *        extendedMetaData="kind='element' name='APourACOreference_ListeMesuresCoordination3D'"
	 * @generated
	 */
	TypeAssociation getAPourACOreferenceListeMesuresCoordination3D();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionRenseignementObjectif#getAPourACOreferenceListeMesuresCoordination3D <em>APour AC Oreference Liste Mesures Coordination3 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour AC Oreference Liste Mesures Coordination3 D</em>' containment reference.
	 * @see #getAPourACOreferenceListeMesuresCoordination3D()
	 * @generated
	 */
	void setAPourACOreferenceListeMesuresCoordination3D(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Volume Tir Mesure Coordination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Volume Tir Mesure Coordination</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Volume Tir Mesure Coordination</em>' containment reference.
	 * @see #setAPourVolumeTirMesureCoordination(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeMissionRenseignementObjectif_APourVolumeTirMesureCoordination()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_MesureCoordination'"
	 *        extendedMetaData="kind='element' name='APourVolumeTir_MesureCoordination'"
	 * @generated
	 */
	TypeAssociation getAPourVolumeTirMesureCoordination();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionRenseignementObjectif#getAPourVolumeTirMesureCoordination <em>APour Volume Tir Mesure Coordination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Volume Tir Mesure Coordination</em>' containment reference.
	 * @see #getAPourVolumeTirMesureCoordination()
	 * @generated
	 */
	void setAPourVolumeTirMesureCoordination(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Modalites Acquisition Modalites Acquisition Objectif</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Modalites Acquisition Modalites Acquisition Objectif</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Modalites Acquisition Modalites Acquisition Objectif</em>' containment reference.
	 * @see #setAPourModalitesAcquisitionModalitesAcquisitionObjectif(TypeModalitesAcquisitionObjectif)
	 * @see mpia.schema.SchemaPackage#getTypeMissionRenseignementObjectif_APourModalitesAcquisitionModalitesAcquisitionObjectif()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ModalitesAcquisitionObjectif'"
	 *        extendedMetaData="kind='element' name='APourModalitesAcquisition_ModalitesAcquisitionObjectif'"
	 * @generated
	 */
	TypeModalitesAcquisitionObjectif getAPourModalitesAcquisitionModalitesAcquisitionObjectif();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionRenseignementObjectif#getAPourModalitesAcquisitionModalitesAcquisitionObjectif <em>APour Modalites Acquisition Modalites Acquisition Objectif</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Modalites Acquisition Modalites Acquisition Objectif</em>' containment reference.
	 * @see #getAPourModalitesAcquisitionModalitesAcquisitionObjectif()
	 * @generated
	 */
	void setAPourModalitesAcquisitionModalitesAcquisitionObjectif(TypeModalitesAcquisitionObjectif value);

	/**
	 * Returns the value of the '<em><b>APour Modalites Evaluation Degats Modalites Evaluation Degats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Modalites Evaluation Degats Modalites Evaluation Degats</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Modalites Evaluation Degats Modalites Evaluation Degats</em>' containment reference.
	 * @see #setAPourModalitesEvaluationDegatsModalitesEvaluationDegats(TypeModalitesEvaluationDegats)
	 * @see mpia.schema.SchemaPackage#getTypeMissionRenseignementObjectif_APourModalitesEvaluationDegatsModalitesEvaluationDegats()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ModalitesEvaluationDegats'"
	 *        extendedMetaData="kind='element' name='APourModalitesEvaluationDegats_ModalitesEvaluationDegats'"
	 * @generated
	 */
	TypeModalitesEvaluationDegats getAPourModalitesEvaluationDegatsModalitesEvaluationDegats();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionRenseignementObjectif#getAPourModalitesEvaluationDegatsModalitesEvaluationDegats <em>APour Modalites Evaluation Degats Modalites Evaluation Degats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Modalites Evaluation Degats Modalites Evaluation Degats</em>' containment reference.
	 * @see #getAPourModalitesEvaluationDegatsModalitesEvaluationDegats()
	 * @generated
	 */
	void setAPourModalitesEvaluationDegatsModalitesEvaluationDegats(TypeModalitesEvaluationDegats value);

	/**
	 * Returns the value of the '<em><b>Est Objet Association Unite Mission Rens Obj</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Unite Mission Rens Obj</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Unite Mission Rens Obj</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionRenseignementObjectif_EstObjetAssociationUniteMissionRensObj()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_MissionRenseignementObjectif' target_entity='type_AssociationUniteMissionRensObj'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationUniteMissionRensObj'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationUniteMissionRensObj();

} // TypeMissionRenseignementObjectif
