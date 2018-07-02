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
 * A representation of the model object '<em><b>Type Plan Numerotation Objectifs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypePlanNumerotationObjectifs#getDebutPlan <em>Debut Plan</em>}</li>
 *   <li>{@link mpia.schema.TypePlanNumerotationObjectifs#getFinPlan <em>Fin Plan</em>}</li>
 *   <li>{@link mpia.schema.TypePlanNumerotationObjectifs#getAppartientAHoraireManoeuvre <em>Appartient AHoraire Manoeuvre</em>}</li>
 *   <li>{@link mpia.schema.TypePlanNumerotationObjectifs#getSeComposePlageNumerotation <em>Se Compose Plage Numerotation</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypePlanNumerotationObjectifs()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_PlanNumerotationObjectifs' kind='elementOnly'"
 * @generated
 */
public interface TypePlanNumerotationObjectifs extends TypeRacineOperationnelle {
	/**
	 * Returns the value of the '<em><b>Debut Plan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debut Plan</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debut Plan</em>' attribute.
	 * @see #setDebutPlan(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypePlanNumerotationObjectifs_DebutPlan()
	 * @model dataType="mpia.meta.TypeDataTypeGDH" required="true"
	 *        extendedMetaData="kind='element' name='DebutPlan'"
	 * @generated
	 */
	XMLGregorianCalendar getDebutPlan();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePlanNumerotationObjectifs#getDebutPlan <em>Debut Plan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debut Plan</em>' attribute.
	 * @see #getDebutPlan()
	 * @generated
	 */
	void setDebutPlan(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Fin Plan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fin Plan</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin Plan</em>' attribute.
	 * @see #setFinPlan(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypePlanNumerotationObjectifs_FinPlan()
	 * @model dataType="mpia.meta.TypeDataTypeGDH" required="true"
	 *        extendedMetaData="kind='element' name='FinPlan'"
	 * @generated
	 */
	XMLGregorianCalendar getFinPlan();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePlanNumerotationObjectifs#getFinPlan <em>Fin Plan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin Plan</em>' attribute.
	 * @see #getFinPlan()
	 * @generated
	 */
	void setFinPlan(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Appartient AHoraire Manoeuvre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appartient AHoraire Manoeuvre</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appartient AHoraire Manoeuvre</em>' containment reference.
	 * @see #setAppartientAHoraireManoeuvre(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypePlanNumerotationObjectifs_AppartientAHoraireManoeuvre()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_HoraireManoeuvre'"
	 *        extendedMetaData="kind='element' name='AppartientA_HoraireManoeuvre'"
	 * @generated
	 */
	TypeAssociation getAppartientAHoraireManoeuvre();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePlanNumerotationObjectifs#getAppartientAHoraireManoeuvre <em>Appartient AHoraire Manoeuvre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appartient AHoraire Manoeuvre</em>' containment reference.
	 * @see #getAppartientAHoraireManoeuvre()
	 * @generated
	 */
	void setAppartientAHoraireManoeuvre(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Se Compose Plage Numerotation</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePlageNumerotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Se Compose Plage Numerotation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Se Compose Plage Numerotation</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePlanNumerotationObjectifs_SeComposePlageNumerotation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_PlageNumerotation'"
	 *        extendedMetaData="kind='element' name='SeCompose_PlageNumerotation'"
	 * @generated
	 */
	EList<TypePlageNumerotation> getSeComposePlageNumerotation();

} // TypePlanNumerotationObjectifs
