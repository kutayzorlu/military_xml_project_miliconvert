/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Plan Traitement Objectifs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypePlanTraitementObjectifs#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link mpia.schema.TypePlanTraitementObjectifs#getAPourInterventionGeneraleInterventionGenerale <em>APour Intervention Generale Intervention Generale</em>}</li>
 *   <li>{@link mpia.schema.TypePlanTraitementObjectifs#getEstObjetAssociationMissionRensObjPlanTraitementObj <em>Est Objet Association Mission Rens Obj Plan Traitement Obj</em>}</li>
 *   <li>{@link mpia.schema.TypePlanTraitementObjectifs#getEstObjetAssociationTraitementObjPlanTraitementObj <em>Est Objet Association Traitement Obj Plan Traitement Obj</em>}</li>
 *   <li>{@link mpia.schema.TypePlanTraitementObjectifs#getEstSujetAssociationPlanTraitementObjTraitementObj <em>Est Sujet Association Plan Traitement Obj Traitement Obj</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypePlanTraitementObjectifs()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_PlanTraitementObjectifs' kind='elementOnly'"
 * @generated
 */
public interface TypePlanTraitementObjectifs extends TypeActivite {
	/**
	 * Returns the value of the '<em><b>Date Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Debut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Debut</em>' attribute.
	 * @see #setDateDebut(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypePlanTraitementObjectifs_DateDebut()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateDebut'"
	 * @generated
	 */
	XMLGregorianCalendar getDateDebut();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePlanTraitementObjectifs#getDateDebut <em>Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Debut</em>' attribute.
	 * @see #getDateDebut()
	 * @generated
	 */
	void setDateDebut(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>APour Intervention Generale Intervention Generale</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Intervention Generale Intervention Generale</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Intervention Generale Intervention Generale</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePlanTraitementObjectifs_APourInterventionGeneraleInterventionGenerale()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='ConcernePlanTraitementObjectifs_PlanTraitementObjectifs' target_entity='type_InterventionGenerale'"
	 *        extendedMetaData="kind='element' name='APourInterventionGenerale_InterventionGenerale'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourInterventionGeneraleInterventionGenerale();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Mission Rens Obj Plan Traitement Obj</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Mission Rens Obj Plan Traitement Obj</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Mission Rens Obj Plan Traitement Obj</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePlanTraitementObjectifs_EstObjetAssociationMissionRensObjPlanTraitementObj()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeObjet_PlanTraitementObjectifs' target_entity='type_AssociationMissionRensObjPlanTraitementObj'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationMissionRensObjPlanTraitementObj'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationMissionRensObjPlanTraitementObj();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Traitement Obj Plan Traitement Obj</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Traitement Obj Plan Traitement Obj</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Traitement Obj Plan Traitement Obj</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePlanTraitementObjectifs_EstObjetAssociationTraitementObjPlanTraitementObj()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeObjet_PlanTraitementObjectifs' target_entity='type_AssociationTraitementObjPlanTraitementObj'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationTraitementObjPlanTraitementObj'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationTraitementObjPlanTraitementObj();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Plan Traitement Obj Traitement Obj</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Plan Traitement Obj Traitement Obj</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Plan Traitement Obj Traitement Obj</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePlanTraitementObjectifs_EstSujetAssociationPlanTraitementObjTraitementObj()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeSujet_PlanTraitementObjectifs' target_entity='type_AssociationPlanTraitementObjTraitementObj'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationPlanTraitementObjTraitementObj'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationPlanTraitementObjTraitementObj();

} // TypePlanTraitementObjectifs
