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
 * A representation of the model object '<em><b>Type Mesure Coordination</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMesureCoordination#getCodeACM <em>Code ACM</em>}</li>
 *   <li>{@link mpia.schema.TypeMesureCoordination#getBut <em>But</em>}</li>
 *   <li>{@link mpia.schema.TypeMesureCoordination#getInstructionsTransit <em>Instructions Transit</em>}</li>
 *   <li>{@link mpia.schema.TypeMesureCoordination#getReferenceAlerteConflit3D <em>Reference Alerte Conflit3 D</em>}</li>
 *   <li>{@link mpia.schema.TypeMesureCoordination#getEstSoumiseAConsigneTir <em>Est Soumise AConsigne Tir</em>}</li>
 *   <li>{@link mpia.schema.TypeMesureCoordination#getAPourDirectivesWEZDirectivesWEZ <em>APour Directives WEZ Directives WEZ</em>}</li>
 *   <li>{@link mpia.schema.TypeMesureCoordination#getEstSujetAssociationMesureCoordinationPlanFeux <em>Est Sujet Association Mesure Coordination Plan Feux</em>}</li>
 *   <li>{@link mpia.schema.TypeMesureCoordination#getEstSujetAssociationMesureCoordMissionAerienne <em>Est Sujet Association Mesure Coord Mission Aerienne</em>}</li>
 *   <li>{@link mpia.schema.TypeMesureCoordination#getEstValidePourPeriode3D <em>Est Valide Pour Periode3 D</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMesureCoordination()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_MesureCoordination' kind='elementOnly'"
 * @generated
 */
public interface TypeMesureCoordination extends TypeElementControle {
	/**
	 * Returns the value of the '<em><b>Code ACM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code ACM</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code ACM</em>' attribute.
	 * @see #setCodeACM(String)
	 * @see mpia.schema.SchemaPackage#getTypeMesureCoordination_CodeACM()
	 * @model dataType="mpia.meta.TypeDataTypeChaine06" required="true"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='CodeACM'"
	 * @generated
	 */
	String getCodeACM();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMesureCoordination#getCodeACM <em>Code ACM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code ACM</em>' attribute.
	 * @see #getCodeACM()
	 * @generated
	 */
	void setCodeACM(String value);

	/**
	 * Returns the value of the '<em><b>But</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>But</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>But</em>' attribute.
	 * @see #setBut(String)
	 * @see mpia.schema.SchemaPackage#getTypeMesureCoordination_But()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='But'"
	 * @generated
	 */
	String getBut();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMesureCoordination#getBut <em>But</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>But</em>' attribute.
	 * @see #getBut()
	 * @generated
	 */
	void setBut(String value);

	/**
	 * Returns the value of the '<em><b>Instructions Transit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instructions Transit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions Transit</em>' attribute.
	 * @see #setInstructionsTransit(String)
	 * @see mpia.schema.SchemaPackage#getTypeMesureCoordination_InstructionsTransit()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='InstructionsTransit'"
	 * @generated
	 */
	String getInstructionsTransit();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMesureCoordination#getInstructionsTransit <em>Instructions Transit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instructions Transit</em>' attribute.
	 * @see #getInstructionsTransit()
	 * @generated
	 */
	void setInstructionsTransit(String value);

	/**
	 * Returns the value of the '<em><b>Reference Alerte Conflit3 D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Alerte Conflit3 D</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Alerte Conflit3 D</em>' containment reference.
	 * @see #setReferenceAlerteConflit3D(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeMesureCoordination_ReferenceAlerteConflit3D()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourACMenConflit_MesureCoordination' target_entity='type_Conflit3D'"
	 *        extendedMetaData="kind='element' name='ReferenceAlerte_Conflit3D'"
	 * @generated
	 */
	TypeAssociation getReferenceAlerteConflit3D();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMesureCoordination#getReferenceAlerteConflit3D <em>Reference Alerte Conflit3 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Alerte Conflit3 D</em>' containment reference.
	 * @see #getReferenceAlerteConflit3D()
	 * @generated
	 */
	void setReferenceAlerteConflit3D(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Est Soumise AConsigne Tir</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Soumise AConsigne Tir</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Soumise AConsigne Tir</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMesureCoordination_EstSoumiseAConsigneTir()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='DefinitPourMesureCoordination_MesureCoordination' target_entity='type_ConsigneTir'"
	 *        extendedMetaData="kind='element' name='EstSoumiseA_ConsigneTir'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSoumiseAConsigneTir();

	/**
	 * Returns the value of the '<em><b>APour Directives WEZ Directives WEZ</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Directives WEZ Directives WEZ</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Directives WEZ Directives WEZ</em>' containment reference.
	 * @see #setAPourDirectivesWEZDirectivesWEZ(TypeDirectivesWEZ)
	 * @see mpia.schema.SchemaPackage#getTypeMesureCoordination_APourDirectivesWEZDirectivesWEZ()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_DirectivesWEZ'"
	 *        extendedMetaData="kind='element' name='APourDirectivesWEZ_DirectivesWEZ'"
	 * @generated
	 */
	TypeDirectivesWEZ getAPourDirectivesWEZDirectivesWEZ();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMesureCoordination#getAPourDirectivesWEZDirectivesWEZ <em>APour Directives WEZ Directives WEZ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Directives WEZ Directives WEZ</em>' containment reference.
	 * @see #getAPourDirectivesWEZDirectivesWEZ()
	 * @generated
	 */
	void setAPourDirectivesWEZDirectivesWEZ(TypeDirectivesWEZ value);

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Mesure Coordination Plan Feux</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Mesure Coordination Plan Feux</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Mesure Coordination Plan Feux</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMesureCoordination_EstSujetAssociationMesureCoordinationPlanFeux()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_MesureCoordination' target_entity='type_AssociationMesureCoordinationPlanFeux'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationMesureCoordinationPlanFeux'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationMesureCoordinationPlanFeux();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Mesure Coord Mission Aerienne</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Mesure Coord Mission Aerienne</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Mesure Coord Mission Aerienne</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMesureCoordination_EstSujetAssociationMesureCoordMissionAerienne()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_MesureCoordination' target_entity='type_AssociationMesureCoordMissionAerienne'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationMesureCoordMissionAerienne'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationMesureCoordMissionAerienne();

	/**
	 * Returns the value of the '<em><b>Est Valide Pour Periode3 D</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePeriode3D}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Valide Pour Periode3 D</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Valide Pour Periode3 D</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMesureCoordination_EstValidePourPeriode3D()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Periode3D'"
	 *        extendedMetaData="kind='element' name='EstValidePour_Periode3D'"
	 * @generated
	 */
	EList<TypePeriode3D> getEstValidePourPeriode3D();

} // TypeMesureCoordination
