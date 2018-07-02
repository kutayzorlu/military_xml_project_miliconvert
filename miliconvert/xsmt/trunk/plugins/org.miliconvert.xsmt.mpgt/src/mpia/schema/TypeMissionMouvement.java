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
 * A representation of the model object '<em><b>Type Mission Mouvement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMissionMouvement#getNumeroMission <em>Numero Mission</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionMouvement#getTypeMissionMouvement <em>Type Mission Mouvement</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionMouvement#getActiviteCirculation <em>Activite Circulation</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionMouvement#getActiviteCirculationTextuelle <em>Activite Circulation Textuelle</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionMouvement#getDescriptionGenerale <em>Description Generale</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionMouvement#getPrioriteTextuelle <em>Priorite Textuelle</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionMouvement#getDescriptionEffort <em>Description Effort</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionMouvement#getAttitudeEnFinAction <em>Attitude En Fin Action</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionMouvement#getActionPreliminaire <em>Action Preliminaire</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionMouvement#getAPourUniteConcerneeUnite <em>APour Unite Concernee Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionMouvement#getEstSujetAssociationMissionMouvementMissionMouvement <em>Est Sujet Association Mission Mouvement Mission Mouvement</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionMouvement#getEstObjetAssociationMissionMouvementMissionMouvement <em>Est Objet Association Mission Mouvement Mission Mouvement</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMissionMouvement()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_MissionMouvement' kind='elementOnly'"
 * @generated
 */
public interface TypeMissionMouvement extends TypeMission {
	/**
	 * Returns the value of the '<em><b>Numero Mission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Mission</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Mission</em>' attribute.
	 * @see #isSetNumeroMission()
	 * @see #unsetNumeroMission()
	 * @see #setNumeroMission(long)
	 * @see mpia.schema.SchemaPackage#getTypeMissionMouvement_NumeroMission()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NumeroMission'"
	 * @generated
	 */
	long getNumeroMission();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionMouvement#getNumeroMission <em>Numero Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Mission</em>' attribute.
	 * @see #isSetNumeroMission()
	 * @see #unsetNumeroMission()
	 * @see #getNumeroMission()
	 * @generated
	 */
	void setNumeroMission(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionMouvement#getNumeroMission <em>Numero Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumeroMission()
	 * @see #getNumeroMission()
	 * @see #setNumeroMission(long)
	 * @generated
	 */
	void unsetNumeroMission();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionMouvement#getNumeroMission <em>Numero Mission</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Numero Mission</em>' attribute is set.
	 * @see #unsetNumeroMission()
	 * @see #getNumeroMission()
	 * @see #setNumeroMission(long)
	 * @generated
	 */
	boolean isSetNumeroMission();

	/**
	 * Returns the value of the '<em><b>Type Mission Mouvement</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMissionMouvementTypeMissionMouvement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Mission Mouvement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Mission Mouvement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionMouvementTypeMissionMouvement
	 * @see #isSetTypeMissionMouvement()
	 * @see #unsetTypeMissionMouvement()
	 * @see #setTypeMissionMouvement(TypeDictionaryDicoMissionMouvementTypeMissionMouvement)
	 * @see mpia.schema.SchemaPackage#getTypeMissionMouvement_TypeMissionMouvement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeMissionMouvement'"
	 * @generated
	 */
	TypeDictionaryDicoMissionMouvementTypeMissionMouvement getTypeMissionMouvement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionMouvement#getTypeMissionMouvement <em>Type Mission Mouvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Mission Mouvement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionMouvementTypeMissionMouvement
	 * @see #isSetTypeMissionMouvement()
	 * @see #unsetTypeMissionMouvement()
	 * @see #getTypeMissionMouvement()
	 * @generated
	 */
	void setTypeMissionMouvement(TypeDictionaryDicoMissionMouvementTypeMissionMouvement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionMouvement#getTypeMissionMouvement <em>Type Mission Mouvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeMissionMouvement()
	 * @see #getTypeMissionMouvement()
	 * @see #setTypeMissionMouvement(TypeDictionaryDicoMissionMouvementTypeMissionMouvement)
	 * @generated
	 */
	void unsetTypeMissionMouvement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionMouvement#getTypeMissionMouvement <em>Type Mission Mouvement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Mission Mouvement</em>' attribute is set.
	 * @see #unsetTypeMissionMouvement()
	 * @see #getTypeMissionMouvement()
	 * @see #setTypeMissionMouvement(TypeDictionaryDicoMissionMouvementTypeMissionMouvement)
	 * @generated
	 */
	boolean isSetTypeMissionMouvement();

	/**
	 * Returns the value of the '<em><b>Activite Circulation</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMissionMouvementActiviteCirculation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activite Circulation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activite Circulation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionMouvementActiviteCirculation
	 * @see #isSetActiviteCirculation()
	 * @see #unsetActiviteCirculation()
	 * @see #setActiviteCirculation(TypeDictionaryDicoMissionMouvementActiviteCirculation)
	 * @see mpia.schema.SchemaPackage#getTypeMissionMouvement_ActiviteCirculation()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ActiviteCirculation'"
	 * @generated
	 */
	TypeDictionaryDicoMissionMouvementActiviteCirculation getActiviteCirculation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionMouvement#getActiviteCirculation <em>Activite Circulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activite Circulation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionMouvementActiviteCirculation
	 * @see #isSetActiviteCirculation()
	 * @see #unsetActiviteCirculation()
	 * @see #getActiviteCirculation()
	 * @generated
	 */
	void setActiviteCirculation(TypeDictionaryDicoMissionMouvementActiviteCirculation value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionMouvement#getActiviteCirculation <em>Activite Circulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActiviteCirculation()
	 * @see #getActiviteCirculation()
	 * @see #setActiviteCirculation(TypeDictionaryDicoMissionMouvementActiviteCirculation)
	 * @generated
	 */
	void unsetActiviteCirculation();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionMouvement#getActiviteCirculation <em>Activite Circulation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Activite Circulation</em>' attribute is set.
	 * @see #unsetActiviteCirculation()
	 * @see #getActiviteCirculation()
	 * @see #setActiviteCirculation(TypeDictionaryDicoMissionMouvementActiviteCirculation)
	 * @generated
	 */
	boolean isSetActiviteCirculation();

	/**
	 * Returns the value of the '<em><b>Activite Circulation Textuelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activite Circulation Textuelle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activite Circulation Textuelle</em>' attribute.
	 * @see #setActiviteCirculationTextuelle(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionMouvement_ActiviteCirculationTextuelle()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='ActiviteCirculationTextuelle'"
	 * @generated
	 */
	String getActiviteCirculationTextuelle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionMouvement#getActiviteCirculationTextuelle <em>Activite Circulation Textuelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activite Circulation Textuelle</em>' attribute.
	 * @see #getActiviteCirculationTextuelle()
	 * @generated
	 */
	void setActiviteCirculationTextuelle(String value);

	/**
	 * Returns the value of the '<em><b>Description Generale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description Generale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Generale</em>' attribute.
	 * @see #setDescriptionGenerale(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionMouvement_DescriptionGenerale()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255" required="true"
	 *        extendedMetaData="kind='element' name='DescriptionGenerale'"
	 * @generated
	 */
	String getDescriptionGenerale();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionMouvement#getDescriptionGenerale <em>Description Generale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Generale</em>' attribute.
	 * @see #getDescriptionGenerale()
	 * @generated
	 */
	void setDescriptionGenerale(String value);

	/**
	 * Returns the value of the '<em><b>Priorite Textuelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priorite Textuelle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priorite Textuelle</em>' attribute.
	 * @see #setPrioriteTextuelle(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionMouvement_PrioriteTextuelle()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='PrioriteTextuelle'"
	 * @generated
	 */
	String getPrioriteTextuelle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionMouvement#getPrioriteTextuelle <em>Priorite Textuelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priorite Textuelle</em>' attribute.
	 * @see #getPrioriteTextuelle()
	 * @generated
	 */
	void setPrioriteTextuelle(String value);

	/**
	 * Returns the value of the '<em><b>Description Effort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description Effort</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Effort</em>' attribute.
	 * @see #setDescriptionEffort(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionMouvement_DescriptionEffort()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='DescriptionEffort'"
	 * @generated
	 */
	String getDescriptionEffort();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionMouvement#getDescriptionEffort <em>Description Effort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Effort</em>' attribute.
	 * @see #getDescriptionEffort()
	 * @generated
	 */
	void setDescriptionEffort(String value);

	/**
	 * Returns the value of the '<em><b>Attitude En Fin Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attitude En Fin Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attitude En Fin Action</em>' attribute.
	 * @see #setAttitudeEnFinAction(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionMouvement_AttitudeEnFinAction()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='AttitudeEnFinAction'"
	 * @generated
	 */
	String getAttitudeEnFinAction();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionMouvement#getAttitudeEnFinAction <em>Attitude En Fin Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attitude En Fin Action</em>' attribute.
	 * @see #getAttitudeEnFinAction()
	 * @generated
	 */
	void setAttitudeEnFinAction(String value);

	/**
	 * Returns the value of the '<em><b>Action Preliminaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Preliminaire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Preliminaire</em>' attribute.
	 * @see #setActionPreliminaire(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionMouvement_ActionPreliminaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='ActionPreliminaire'"
	 * @generated
	 */
	String getActionPreliminaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionMouvement#getActionPreliminaire <em>Action Preliminaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Preliminaire</em>' attribute.
	 * @see #getActionPreliminaire()
	 * @generated
	 */
	void setActionPreliminaire(String value);

	/**
	 * Returns the value of the '<em><b>APour Unite Concernee Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite Concernee Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite Concernee Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionMouvement_APourUniteConcerneeUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteConcernee_Unite'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourUniteConcerneeUnite();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Mission Mouvement Mission Mouvement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Mission Mouvement Mission Mouvement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Mission Mouvement Mission Mouvement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionMouvement_EstSujetAssociationMissionMouvementMissionMouvement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeSujet_MissionMouvement' target_entity='type_AssociationMissionMouvementMissionMouvement'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationMissionMouvementMissionMouvement'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationMissionMouvementMissionMouvement();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Mission Mouvement Mission Mouvement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Mission Mouvement Mission Mouvement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Mission Mouvement Mission Mouvement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionMouvement_EstObjetAssociationMissionMouvementMissionMouvement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeObjet_MissionMouvement' target_entity='type_AssociationMissionMouvementMissionMouvement'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationMissionMouvementMissionMouvement'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationMissionMouvementMissionMouvement();

} // TypeMissionMouvement
