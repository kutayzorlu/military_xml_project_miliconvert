/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Disponibilite Pour Plan Feux</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeDisponibilitePourPlanFeux#getDebutCreneauHoraire <em>Debut Creneau Horaire</em>}</li>
 *   <li>{@link mpia.schema.TypeDisponibilitePourPlanFeux#getFinCreneauHoraire <em>Fin Creneau Horaire</em>}</li>
 *   <li>{@link mpia.schema.TypeDisponibilitePourPlanFeux#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeDisponibilitePourPlanFeux#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeDisponibilitePourPlanFeux#getAPourMoyensTirQuantiteMoyensTirASS <em>APour Moyens Tir Quantite Moyens Tir ASS</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeDisponibilitePourPlanFeux()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_DisponibilitePourPlanFeux' kind='elementOnly'"
 * @generated
 */
public interface TypeDisponibilitePourPlanFeux extends EObject {
	/**
	 * Returns the value of the '<em><b>Debut Creneau Horaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debut Creneau Horaire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debut Creneau Horaire</em>' attribute.
	 * @see #setDebutCreneauHoraire(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeDisponibilitePourPlanFeux_DebutCreneauHoraire()
	 * @model dataType="mpia.meta.TypeDataTypeGDH" required="true"
	 *        extendedMetaData="kind='element' name='DebutCreneauHoraire'"
	 * @generated
	 */
	XMLGregorianCalendar getDebutCreneauHoraire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDisponibilitePourPlanFeux#getDebutCreneauHoraire <em>Debut Creneau Horaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debut Creneau Horaire</em>' attribute.
	 * @see #getDebutCreneauHoraire()
	 * @generated
	 */
	void setDebutCreneauHoraire(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Fin Creneau Horaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fin Creneau Horaire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin Creneau Horaire</em>' attribute.
	 * @see #setFinCreneauHoraire(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeDisponibilitePourPlanFeux_FinCreneauHoraire()
	 * @model dataType="mpia.meta.TypeDataTypeGDH" required="true"
	 *        extendedMetaData="kind='element' name='FinCreneauHoraire'"
	 * @generated
	 */
	XMLGregorianCalendar getFinCreneauHoraire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDisponibilitePourPlanFeux#getFinCreneauHoraire <em>Fin Creneau Horaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin Creneau Horaire</em>' attribute.
	 * @see #getFinCreneauHoraire()
	 * @generated
	 */
	void setFinCreneauHoraire(XMLGregorianCalendar value);

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
	 * @see mpia.schema.SchemaPackage#getTypeDisponibilitePourPlanFeux_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDisponibilitePourPlanFeux#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeDisponibilitePourPlanFeux_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDisponibilitePourPlanFeux#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Moyens Tir Quantite Moyens Tir ASS</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeQuantiteMoyensTirASS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Moyens Tir Quantite Moyens Tir ASS</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Moyens Tir Quantite Moyens Tir ASS</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeDisponibilitePourPlanFeux_APourMoyensTirQuantiteMoyensTirASS()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_QuantiteMoyensTirASS'"
	 *        extendedMetaData="kind='element' name='APourMoyensTir_QuantiteMoyensTirASS'"
	 * @generated
	 */
	EList<TypeQuantiteMoyensTirASS> getAPourMoyensTirQuantiteMoyensTirASS();

} // TypeDisponibilitePourPlanFeux
