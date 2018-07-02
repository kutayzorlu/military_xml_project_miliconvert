/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeDuree;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Mission Maintenance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMissionMaintenance#getAllocationsConsenties <em>Allocations Consenties</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionMaintenance#getDommagesPrevisionnels <em>Dommages Previsionnels</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionMaintenance#getEchelonUniteSoutenue <em>Echelon Unite Soutenue</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionMaintenance#getForceASoutenir <em>Force ASoutenir</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionMaintenance#getMissionUlterieure <em>Mission Ulterieure</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionMaintenance#getRessourcesAttendues <em>Ressources Attendues</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionMaintenance#getStabiliteEscomptee <em>Stabilite Escomptee</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionMaintenance#getAPourUniteMettantEnOeuvreMaterielUniteMateriel <em>APour Unite Mettant En Oeuvre Materiel Unite Materiel</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionMaintenance#getAPourRattachementInterneRattachement <em>APour Rattachement Interne Rattachement</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionMaintenance#getACommeConduiteATenirConduiteATenir <em>AComme Conduite ATenir Conduite ATenir</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionMaintenance#getACommeConsigneParticuliereConsigneParticuliere <em>AComme Consigne Particuliere Consigne Particuliere</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionMaintenance#getAPourDureeDInterventionDureeIntervention <em>APour Duree DIntervention Duree Intervention</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionMaintenance#getAPourPrioritesTactiquesPrioriteTactique <em>APour Priorites Tactiques Priorite Tactique</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionMaintenance#getAPourPrioritesTechniquesPrioriteTechnique <em>APour Priorites Techniques Priorite Technique</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMissionMaintenance()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_MissionMaintenance' kind='elementOnly'"
 * @generated
 */
public interface TypeMissionMaintenance extends TypeMissionLogistique {
	/**
	 * Returns the value of the '<em><b>Allocations Consenties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocations Consenties</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocations Consenties</em>' attribute.
	 * @see #setAllocationsConsenties(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionMaintenance_AllocationsConsenties()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='AllocationsConsenties'"
	 * @generated
	 */
	String getAllocationsConsenties();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionMaintenance#getAllocationsConsenties <em>Allocations Consenties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocations Consenties</em>' attribute.
	 * @see #getAllocationsConsenties()
	 * @generated
	 */
	void setAllocationsConsenties(String value);

	/**
	 * Returns the value of the '<em><b>Dommages Previsionnels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dommages Previsionnels</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dommages Previsionnels</em>' attribute.
	 * @see #setDommagesPrevisionnels(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionMaintenance_DommagesPrevisionnels()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='DommagesPrevisionnels'"
	 * @generated
	 */
	String getDommagesPrevisionnels();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionMaintenance#getDommagesPrevisionnels <em>Dommages Previsionnels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dommages Previsionnels</em>' attribute.
	 * @see #getDommagesPrevisionnels()
	 * @generated
	 */
	void setDommagesPrevisionnels(String value);

	/**
	 * Returns the value of the '<em><b>Echelon Unite Soutenue</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEchelonEchelon}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Echelon Unite Soutenue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Echelon Unite Soutenue</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEchelonEchelon
	 * @see #isSetEchelonUniteSoutenue()
	 * @see #unsetEchelonUniteSoutenue()
	 * @see #setEchelonUniteSoutenue(TypeDictionaryDicoEchelonEchelon)
	 * @see mpia.schema.SchemaPackage#getTypeMissionMaintenance_EchelonUniteSoutenue()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='EchelonUniteSoutenue'"
	 * @generated
	 */
	TypeDictionaryDicoEchelonEchelon getEchelonUniteSoutenue();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionMaintenance#getEchelonUniteSoutenue <em>Echelon Unite Soutenue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Echelon Unite Soutenue</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEchelonEchelon
	 * @see #isSetEchelonUniteSoutenue()
	 * @see #unsetEchelonUniteSoutenue()
	 * @see #getEchelonUniteSoutenue()
	 * @generated
	 */
	void setEchelonUniteSoutenue(TypeDictionaryDicoEchelonEchelon value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionMaintenance#getEchelonUniteSoutenue <em>Echelon Unite Soutenue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEchelonUniteSoutenue()
	 * @see #getEchelonUniteSoutenue()
	 * @see #setEchelonUniteSoutenue(TypeDictionaryDicoEchelonEchelon)
	 * @generated
	 */
	void unsetEchelonUniteSoutenue();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionMaintenance#getEchelonUniteSoutenue <em>Echelon Unite Soutenue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Echelon Unite Soutenue</em>' attribute is set.
	 * @see #unsetEchelonUniteSoutenue()
	 * @see #getEchelonUniteSoutenue()
	 * @see #setEchelonUniteSoutenue(TypeDictionaryDicoEchelonEchelon)
	 * @generated
	 */
	boolean isSetEchelonUniteSoutenue();

	/**
	 * Returns the value of the '<em><b>Force ASoutenir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Force ASoutenir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Force ASoutenir</em>' attribute.
	 * @see #setForceASoutenir(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionMaintenance_ForceASoutenir()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='ForceASoutenir'"
	 * @generated
	 */
	String getForceASoutenir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionMaintenance#getForceASoutenir <em>Force ASoutenir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Force ASoutenir</em>' attribute.
	 * @see #getForceASoutenir()
	 * @generated
	 */
	void setForceASoutenir(String value);

	/**
	 * Returns the value of the '<em><b>Mission Ulterieure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mission Ulterieure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mission Ulterieure</em>' attribute.
	 * @see #setMissionUlterieure(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionMaintenance_MissionUlterieure()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='MissionUlterieure'"
	 * @generated
	 */
	String getMissionUlterieure();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionMaintenance#getMissionUlterieure <em>Mission Ulterieure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mission Ulterieure</em>' attribute.
	 * @see #getMissionUlterieure()
	 * @generated
	 */
	void setMissionUlterieure(String value);

	/**
	 * Returns the value of the '<em><b>Ressources Attendues</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ressources Attendues</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ressources Attendues</em>' attribute.
	 * @see #setRessourcesAttendues(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionMaintenance_RessourcesAttendues()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='RessourcesAttendues'"
	 * @generated
	 */
	String getRessourcesAttendues();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionMaintenance#getRessourcesAttendues <em>Ressources Attendues</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ressources Attendues</em>' attribute.
	 * @see #getRessourcesAttendues()
	 * @generated
	 */
	void setRessourcesAttendues(String value);

	/**
	 * Returns the value of the '<em><b>Stabilite Escomptee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stabilite Escomptee</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stabilite Escomptee</em>' containment reference.
	 * @see #setStabiliteEscomptee(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeMissionMaintenance_StabiliteEscomptee()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='StabiliteEscomptee'"
	 * @generated
	 */
	TypeDataTypeDuree getStabiliteEscomptee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionMaintenance#getStabiliteEscomptee <em>Stabilite Escomptee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stabilite Escomptee</em>' containment reference.
	 * @see #getStabiliteEscomptee()
	 * @generated
	 */
	void setStabiliteEscomptee(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>APour Unite Mettant En Oeuvre Materiel Unite Materiel</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeUniteMateriel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite Mettant En Oeuvre Materiel Unite Materiel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite Mettant En Oeuvre Materiel Unite Materiel</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionMaintenance_APourUniteMettantEnOeuvreMaterielUniteMateriel()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_UniteMateriel'"
	 *        extendedMetaData="kind='element' name='APourUniteMettantEnOeuvreMateriel_UniteMateriel'"
	 * @generated
	 */
	EList<TypeUniteMateriel> getAPourUniteMettantEnOeuvreMaterielUniteMateriel();

	/**
	 * Returns the value of the '<em><b>APour Rattachement Interne Rattachement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeRattachement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Rattachement Interne Rattachement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Rattachement Interne Rattachement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionMaintenance_APourRattachementInterneRattachement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Rattachement'"
	 *        extendedMetaData="kind='element' name='APourRattachementInterne_Rattachement'"
	 * @generated
	 */
	EList<TypeRattachement> getAPourRattachementInterneRattachement();

	/**
	 * Returns the value of the '<em><b>AComme Conduite ATenir Conduite ATenir</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeConduiteATenir}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Conduite ATenir Conduite ATenir</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Conduite ATenir Conduite ATenir</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionMaintenance_ACommeConduiteATenirConduiteATenir()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ConduiteATenir'"
	 *        extendedMetaData="kind='element' name='ACommeConduiteATenir_ConduiteATenir'"
	 * @generated
	 */
	EList<TypeConduiteATenir> getACommeConduiteATenirConduiteATenir();

	/**
	 * Returns the value of the '<em><b>AComme Consigne Particuliere Consigne Particuliere</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Consigne Particuliere Consigne Particuliere</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Consigne Particuliere Consigne Particuliere</em>' containment reference.
	 * @see #setACommeConsigneParticuliereConsigneParticuliere(TypeConsigneParticuliere)
	 * @see mpia.schema.SchemaPackage#getTypeMissionMaintenance_ACommeConsigneParticuliereConsigneParticuliere()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ConsigneParticuliere'"
	 *        extendedMetaData="kind='element' name='ACommeConsigneParticuliere_ConsigneParticuliere'"
	 * @generated
	 */
	TypeConsigneParticuliere getACommeConsigneParticuliereConsigneParticuliere();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionMaintenance#getACommeConsigneParticuliereConsigneParticuliere <em>AComme Consigne Particuliere Consigne Particuliere</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Consigne Particuliere Consigne Particuliere</em>' containment reference.
	 * @see #getACommeConsigneParticuliereConsigneParticuliere()
	 * @generated
	 */
	void setACommeConsigneParticuliereConsigneParticuliere(TypeConsigneParticuliere value);

	/**
	 * Returns the value of the '<em><b>APour Duree DIntervention Duree Intervention</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeDureeIntervention}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Duree DIntervention Duree Intervention</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Duree DIntervention Duree Intervention</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionMaintenance_APourDureeDInterventionDureeIntervention()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_DureeIntervention'"
	 *        extendedMetaData="kind='element' name='APourDureeDIntervention_DureeIntervention'"
	 * @generated
	 */
	EList<TypeDureeIntervention> getAPourDureeDInterventionDureeIntervention();

	/**
	 * Returns the value of the '<em><b>APour Priorites Tactiques Priorite Tactique</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Priorites Tactiques Priorite Tactique</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Priorites Tactiques Priorite Tactique</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionMaintenance_APourPrioritesTactiquesPrioriteTactique()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_PrioriteTactique'"
	 *        extendedMetaData="kind='element' name='APourPrioritesTactiques_PrioriteTactique'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourPrioritesTactiquesPrioriteTactique();

	/**
	 * Returns the value of the '<em><b>APour Priorites Techniques Priorite Technique</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Priorites Techniques Priorite Technique</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Priorites Techniques Priorite Technique</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionMaintenance_APourPrioritesTechniquesPrioriteTechnique()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_PrioriteTechnique'"
	 *        extendedMetaData="kind='element' name='APourPrioritesTechniques_PrioriteTechnique'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourPrioritesTechniquesPrioriteTechnique();

} // TypeMissionMaintenance
