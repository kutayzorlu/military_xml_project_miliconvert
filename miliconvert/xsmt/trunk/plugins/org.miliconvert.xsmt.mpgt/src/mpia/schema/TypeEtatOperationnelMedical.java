/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeDuree;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Etat Operationnel Medical</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEtatOperationnelMedical#getChirurgieRestanteJ <em>Chirurgie Restante J</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelMedical#getConsommablesSanteConsommableSante <em>Consommables Sante Consommable Sante</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelMedical#getACommeBlessesParPeriodeBlessesParPeriode <em>AComme Blesses Par Periode Blesses Par Periode</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelMedical#getACommeEvacuationPatientsEvacuationPatients <em>AComme Evacuation Patients Evacuation Patients</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelMedical#getACommeEvacuationParPeriodeEvacuationsParPeriode <em>AComme Evacuation Par Periode Evacuations Par Periode</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelMedical#getACommeOccupationLitsOccupationLits <em>AComme Occupation Lits Occupation Lits</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelMedical#getACommePertesParPeriodePertesParPeriode <em>AComme Pertes Par Periode Pertes Par Periode</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelMedical#getACommeTraitementPatientsTraitementPatients <em>AComme Traitement Patients Traitement Patients</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelMedical()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_EtatOperationnelMedical' kind='elementOnly'"
 * @generated
 */
public interface TypeEtatOperationnelMedical extends EObject {
	/**
	 * Returns the value of the '<em><b>Chirurgie Restante J</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chirurgie Restante J</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chirurgie Restante J</em>' containment reference.
	 * @see #setChirurgieRestanteJ(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelMedical_ChirurgieRestanteJ()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ChirurgieRestanteJ'"
	 * @generated
	 */
	TypeDataTypeDuree getChirurgieRestanteJ();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelMedical#getChirurgieRestanteJ <em>Chirurgie Restante J</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chirurgie Restante J</em>' containment reference.
	 * @see #getChirurgieRestanteJ()
	 * @generated
	 */
	void setChirurgieRestanteJ(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>Consommables Sante Consommable Sante</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeConsommableSante}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consommables Sante Consommable Sante</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consommables Sante Consommable Sante</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelMedical_ConsommablesSanteConsommableSante()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ConsommableSante'"
	 *        extendedMetaData="kind='element' name='ConsommablesSante_ConsommableSante'"
	 * @generated
	 */
	EList<TypeConsommableSante> getConsommablesSanteConsommableSante();

	/**
	 * Returns the value of the '<em><b>AComme Blesses Par Periode Blesses Par Periode</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeBlessesParPeriode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Blesses Par Periode Blesses Par Periode</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Blesses Par Periode Blesses Par Periode</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelMedical_ACommeBlessesParPeriodeBlessesParPeriode()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_BlessesParPeriode'"
	 *        extendedMetaData="kind='element' name='ACommeBlessesParPeriode_BlessesParPeriode'"
	 * @generated
	 */
	EList<TypeBlessesParPeriode> getACommeBlessesParPeriodeBlessesParPeriode();

	/**
	 * Returns the value of the '<em><b>AComme Evacuation Patients Evacuation Patients</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeEvacuationPatients}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Evacuation Patients Evacuation Patients</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Evacuation Patients Evacuation Patients</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelMedical_ACommeEvacuationPatientsEvacuationPatients()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EvacuationPatients'"
	 *        extendedMetaData="kind='element' name='ACommeEvacuationPatients_EvacuationPatients'"
	 * @generated
	 */
	EList<TypeEvacuationPatients> getACommeEvacuationPatientsEvacuationPatients();

	/**
	 * Returns the value of the '<em><b>AComme Evacuation Par Periode Evacuations Par Periode</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeEvacuationsParPeriode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Evacuation Par Periode Evacuations Par Periode</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Evacuation Par Periode Evacuations Par Periode</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelMedical_ACommeEvacuationParPeriodeEvacuationsParPeriode()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EvacuationsParPeriode'"
	 *        extendedMetaData="kind='element' name='ACommeEvacuationParPeriode_EvacuationsParPeriode'"
	 * @generated
	 */
	EList<TypeEvacuationsParPeriode> getACommeEvacuationParPeriodeEvacuationsParPeriode();

	/**
	 * Returns the value of the '<em><b>AComme Occupation Lits Occupation Lits</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeOccupationLits}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Occupation Lits Occupation Lits</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Occupation Lits Occupation Lits</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelMedical_ACommeOccupationLitsOccupationLits()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_OccupationLits'"
	 *        extendedMetaData="kind='element' name='ACommeOccupationLits_OccupationLits'"
	 * @generated
	 */
	EList<TypeOccupationLits> getACommeOccupationLitsOccupationLits();

	/**
	 * Returns the value of the '<em><b>AComme Pertes Par Periode Pertes Par Periode</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePertesParPeriode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Pertes Par Periode Pertes Par Periode</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Pertes Par Periode Pertes Par Periode</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelMedical_ACommePertesParPeriodePertesParPeriode()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_PertesParPeriode'"
	 *        extendedMetaData="kind='element' name='ACommePertesParPeriode_PertesParPeriode'"
	 * @generated
	 */
	EList<TypePertesParPeriode> getACommePertesParPeriodePertesParPeriode();

	/**
	 * Returns the value of the '<em><b>AComme Traitement Patients Traitement Patients</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTraitementPatients}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Traitement Patients Traitement Patients</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Traitement Patients Traitement Patients</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelMedical_ACommeTraitementPatientsTraitementPatients()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_TraitementPatients'"
	 *        extendedMetaData="kind='element' name='ACommeTraitementPatients_TraitementPatients'"
	 * @generated
	 */
	EList<TypeTraitementPatients> getACommeTraitementPatientsTraitementPatients();

} // TypeEtatOperationnelMedical
