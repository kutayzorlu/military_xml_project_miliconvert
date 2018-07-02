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
 * A representation of the model object '<em><b>Type Mise En Oeuvre ROE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMiseEnOeuvreROE#getGDHmiseEnApplication <em>GD Hmise En Application</em>}</li>
 *   <li>{@link mpia.schema.TypeMiseEnOeuvreROE#getTendancesEtDirectivesGenerales <em>Tendances Et Directives Generales</em>}</li>
 *   <li>{@link mpia.schema.TypeMiseEnOeuvreROE#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeMiseEnOeuvreROE#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeMiseEnOeuvreROE#getSeDeclineEnROEparOrganisation <em>Se Decline En RO Epar Organisation</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMiseEnOeuvreROE()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_MiseEnOeuvreROE' kind='elementOnly'"
 * @generated
 */
public interface TypeMiseEnOeuvreROE extends EObject {
	/**
	 * Returns the value of the '<em><b>GD Hmise En Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GD Hmise En Application</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GD Hmise En Application</em>' attribute.
	 * @see #setGDHmiseEnApplication(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeMiseEnOeuvreROE_GDHmiseEnApplication()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='GDHmiseEnApplication'"
	 * @generated
	 */
	XMLGregorianCalendar getGDHmiseEnApplication();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMiseEnOeuvreROE#getGDHmiseEnApplication <em>GD Hmise En Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GD Hmise En Application</em>' attribute.
	 * @see #getGDHmiseEnApplication()
	 * @generated
	 */
	void setGDHmiseEnApplication(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Tendances Et Directives Generales</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tendances Et Directives Generales</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tendances Et Directives Generales</em>' attribute.
	 * @see #setTendancesEtDirectivesGenerales(String)
	 * @see mpia.schema.SchemaPackage#getTypeMiseEnOeuvreROE_TendancesEtDirectivesGenerales()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='TendancesEtDirectivesGenerales'"
	 * @generated
	 */
	String getTendancesEtDirectivesGenerales();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMiseEnOeuvreROE#getTendancesEtDirectivesGenerales <em>Tendances Et Directives Generales</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tendances Et Directives Generales</em>' attribute.
	 * @see #getTendancesEtDirectivesGenerales()
	 * @generated
	 */
	void setTendancesEtDirectivesGenerales(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeMiseEnOeuvreROE_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMiseEnOeuvreROE#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeMiseEnOeuvreROE_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMiseEnOeuvreROE#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Se Decline En RO Epar Organisation</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeROEparOrganisation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Se Decline En RO Epar Organisation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Se Decline En RO Epar Organisation</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMiseEnOeuvreROE_SeDeclineEnROEparOrganisation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ROEparOrganisation'"
	 *        extendedMetaData="kind='element' name='SeDeclineEn_ROEparOrganisation'"
	 * @generated
	 */
	EList<TypeROEparOrganisation> getSeDeclineEnROEparOrganisation();

} // TypeMiseEnOeuvreROE
