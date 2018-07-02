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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Situation Radiation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeSituationRadiation#getDateMesure <em>Date Mesure</em>}</li>
 *   <li>{@link mpia.schema.TypeSituationRadiation#getNiveauDebitDose <em>Niveau Debit Dose</em>}</li>
 *   <li>{@link mpia.schema.TypeSituationRadiation#getNiveauRadiation <em>Niveau Radiation</em>}</li>
 *   <li>{@link mpia.schema.TypeSituationRadiation#getNiveauRadiationCumule <em>Niveau Radiation Cumule</em>}</li>
 *   <li>{@link mpia.schema.TypeSituationRadiation#getEvolutionDebitDose <em>Evolution Debit Dose</em>}</li>
 *   <li>{@link mpia.schema.TypeSituationRadiation#getTauxRelatifDecroissance <em>Taux Relatif Decroissance</em>}</li>
 *   <li>{@link mpia.schema.TypeSituationRadiation#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeSituationRadiation#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeSituationRadiation#getConcerneMateriel <em>Concerne Materiel</em>}</li>
 *   <li>{@link mpia.schema.TypeSituationRadiation#getDecritDoseRadiationAbsorbe <em>Decrit Dose Radiation Absorbe</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeSituationRadiation()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_SituationRadiation' kind='elementOnly'"
 * @generated
 */
public interface TypeSituationRadiation extends EObject {
	/**
	 * Returns the value of the '<em><b>Date Mesure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Mesure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Mesure</em>' attribute.
	 * @see #setDateMesure(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeSituationRadiation_DateMesure()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateMesure'"
	 * @generated
	 */
	XMLGregorianCalendar getDateMesure();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSituationRadiation#getDateMesure <em>Date Mesure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Mesure</em>' attribute.
	 * @see #getDateMesure()
	 * @generated
	 */
	void setDateMesure(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Niveau Debit Dose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Niveau Debit Dose</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau Debit Dose</em>' attribute.
	 * @see #isSetNiveauDebitDose()
	 * @see #unsetNiveauDebitDose()
	 * @see #setNiveauDebitDose(double)
	 * @see mpia.schema.SchemaPackage#getTypeSituationRadiation_NiveauDebitDose()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='NiveauDebitDose'"
	 * @generated
	 */
	double getNiveauDebitDose();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSituationRadiation#getNiveauDebitDose <em>Niveau Debit Dose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Niveau Debit Dose</em>' attribute.
	 * @see #isSetNiveauDebitDose()
	 * @see #unsetNiveauDebitDose()
	 * @see #getNiveauDebitDose()
	 * @generated
	 */
	void setNiveauDebitDose(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSituationRadiation#getNiveauDebitDose <em>Niveau Debit Dose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNiveauDebitDose()
	 * @see #getNiveauDebitDose()
	 * @see #setNiveauDebitDose(double)
	 * @generated
	 */
	void unsetNiveauDebitDose();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSituationRadiation#getNiveauDebitDose <em>Niveau Debit Dose</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Niveau Debit Dose</em>' attribute is set.
	 * @see #unsetNiveauDebitDose()
	 * @see #getNiveauDebitDose()
	 * @see #setNiveauDebitDose(double)
	 * @generated
	 */
	boolean isSetNiveauDebitDose();

	/**
	 * Returns the value of the '<em><b>Niveau Radiation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Niveau Radiation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau Radiation</em>' attribute.
	 * @see #isSetNiveauRadiation()
	 * @see #unsetNiveauRadiation()
	 * @see #setNiveauRadiation(double)
	 * @see mpia.schema.SchemaPackage#getTypeSituationRadiation_NiveauRadiation()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal" required="true"
	 *        extendedMetaData="kind='element' name='NiveauRadiation'"
	 * @generated
	 */
	double getNiveauRadiation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSituationRadiation#getNiveauRadiation <em>Niveau Radiation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Niveau Radiation</em>' attribute.
	 * @see #isSetNiveauRadiation()
	 * @see #unsetNiveauRadiation()
	 * @see #getNiveauRadiation()
	 * @generated
	 */
	void setNiveauRadiation(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSituationRadiation#getNiveauRadiation <em>Niveau Radiation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNiveauRadiation()
	 * @see #getNiveauRadiation()
	 * @see #setNiveauRadiation(double)
	 * @generated
	 */
	void unsetNiveauRadiation();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSituationRadiation#getNiveauRadiation <em>Niveau Radiation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Niveau Radiation</em>' attribute is set.
	 * @see #unsetNiveauRadiation()
	 * @see #getNiveauRadiation()
	 * @see #setNiveauRadiation(double)
	 * @generated
	 */
	boolean isSetNiveauRadiation();

	/**
	 * Returns the value of the '<em><b>Niveau Radiation Cumule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Niveau Radiation Cumule</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau Radiation Cumule</em>' attribute.
	 * @see #isSetNiveauRadiationCumule()
	 * @see #unsetNiveauRadiationCumule()
	 * @see #setNiveauRadiationCumule(double)
	 * @see mpia.schema.SchemaPackage#getTypeSituationRadiation_NiveauRadiationCumule()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='NiveauRadiationCumule'"
	 * @generated
	 */
	double getNiveauRadiationCumule();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSituationRadiation#getNiveauRadiationCumule <em>Niveau Radiation Cumule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Niveau Radiation Cumule</em>' attribute.
	 * @see #isSetNiveauRadiationCumule()
	 * @see #unsetNiveauRadiationCumule()
	 * @see #getNiveauRadiationCumule()
	 * @generated
	 */
	void setNiveauRadiationCumule(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSituationRadiation#getNiveauRadiationCumule <em>Niveau Radiation Cumule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNiveauRadiationCumule()
	 * @see #getNiveauRadiationCumule()
	 * @see #setNiveauRadiationCumule(double)
	 * @generated
	 */
	void unsetNiveauRadiationCumule();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSituationRadiation#getNiveauRadiationCumule <em>Niveau Radiation Cumule</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Niveau Radiation Cumule</em>' attribute is set.
	 * @see #unsetNiveauRadiationCumule()
	 * @see #getNiveauRadiationCumule()
	 * @see #setNiveauRadiationCumule(double)
	 * @generated
	 */
	boolean isSetNiveauRadiationCumule();

	/**
	 * Returns the value of the '<em><b>Evolution Debit Dose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evolution Debit Dose</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evolution Debit Dose</em>' attribute.
	 * @see #isSetEvolutionDebitDose()
	 * @see #unsetEvolutionDebitDose()
	 * @see #setEvolutionDebitDose(double)
	 * @see mpia.schema.SchemaPackage#getTypeSituationRadiation_EvolutionDebitDose()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='EvolutionDebitDose'"
	 * @generated
	 */
	double getEvolutionDebitDose();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSituationRadiation#getEvolutionDebitDose <em>Evolution Debit Dose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evolution Debit Dose</em>' attribute.
	 * @see #isSetEvolutionDebitDose()
	 * @see #unsetEvolutionDebitDose()
	 * @see #getEvolutionDebitDose()
	 * @generated
	 */
	void setEvolutionDebitDose(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSituationRadiation#getEvolutionDebitDose <em>Evolution Debit Dose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEvolutionDebitDose()
	 * @see #getEvolutionDebitDose()
	 * @see #setEvolutionDebitDose(double)
	 * @generated
	 */
	void unsetEvolutionDebitDose();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSituationRadiation#getEvolutionDebitDose <em>Evolution Debit Dose</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Evolution Debit Dose</em>' attribute is set.
	 * @see #unsetEvolutionDebitDose()
	 * @see #getEvolutionDebitDose()
	 * @see #setEvolutionDebitDose(double)
	 * @generated
	 */
	boolean isSetEvolutionDebitDose();

	/**
	 * Returns the value of the '<em><b>Taux Relatif Decroissance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Taux Relatif Decroissance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taux Relatif Decroissance</em>' attribute.
	 * @see #isSetTauxRelatifDecroissance()
	 * @see #unsetTauxRelatifDecroissance()
	 * @see #setTauxRelatifDecroissance(double)
	 * @see mpia.schema.SchemaPackage#getTypeSituationRadiation_TauxRelatifDecroissance()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='TauxRelatifDecroissance'"
	 * @generated
	 */
	double getTauxRelatifDecroissance();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSituationRadiation#getTauxRelatifDecroissance <em>Taux Relatif Decroissance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taux Relatif Decroissance</em>' attribute.
	 * @see #isSetTauxRelatifDecroissance()
	 * @see #unsetTauxRelatifDecroissance()
	 * @see #getTauxRelatifDecroissance()
	 * @generated
	 */
	void setTauxRelatifDecroissance(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSituationRadiation#getTauxRelatifDecroissance <em>Taux Relatif Decroissance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTauxRelatifDecroissance()
	 * @see #getTauxRelatifDecroissance()
	 * @see #setTauxRelatifDecroissance(double)
	 * @generated
	 */
	void unsetTauxRelatifDecroissance();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSituationRadiation#getTauxRelatifDecroissance <em>Taux Relatif Decroissance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Taux Relatif Decroissance</em>' attribute is set.
	 * @see #unsetTauxRelatifDecroissance()
	 * @see #getTauxRelatifDecroissance()
	 * @see #setTauxRelatifDecroissance(double)
	 * @generated
	 */
	boolean isSetTauxRelatifDecroissance();

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
	 * @see mpia.schema.SchemaPackage#getTypeSituationRadiation_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSituationRadiation#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeSituationRadiation_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSituationRadiation#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Concerne Materiel</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Materiel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Materiel</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeSituationRadiation_ConcerneMateriel()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSituationRadiation_SituationRadiation' target_entity='type_Materiel'"
	 *        extendedMetaData="kind='element' name='Concerne_Materiel'"
	 * @generated
	 */
	EList<TypeAssociation> getConcerneMateriel();

	/**
	 * Returns the value of the '<em><b>Decrit Dose Radiation Absorbe</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeDoseRadiationAbsorbe}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decrit Dose Radiation Absorbe</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decrit Dose Radiation Absorbe</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeSituationRadiation_DecritDoseRadiationAbsorbe()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_DoseRadiationAbsorbe'"
	 *        extendedMetaData="kind='element' name='Decrit_DoseRadiationAbsorbe'"
	 * @generated
	 */
	EList<TypeDoseRadiationAbsorbe> getDecritDoseRadiationAbsorbe();

} // TypeSituationRadiation
