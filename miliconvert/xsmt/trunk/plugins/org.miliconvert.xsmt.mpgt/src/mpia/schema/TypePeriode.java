/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Periode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypePeriode#getDateDebutCalculee <em>Date Debut Calculee</em>}</li>
 *   <li>{@link mpia.schema.TypePeriode#getDateFinCalculee <em>Date Fin Calculee</em>}</li>
 *   <li>{@link mpia.schema.TypePeriode#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypePeriode#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypePeriode#getAPourDateDebutPrevisionnelleDatation <em>APour Date Debut Previsionnelle Datation</em>}</li>
 *   <li>{@link mpia.schema.TypePeriode#getAPourDateFinPrevisionnelleDatation <em>APour Date Fin Previsionnelle Datation</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypePeriode()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_Periode' kind='elementOnly'"
 * @generated
 */
public interface TypePeriode extends EObject {
	/**
	 * Returns the value of the '<em><b>Date Debut Calculee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Debut Calculee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Debut Calculee</em>' attribute.
	 * @see #setDateDebutCalculee(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypePeriode_DateDebutCalculee()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateDebutCalculee'"
	 * @generated
	 */
	XMLGregorianCalendar getDateDebutCalculee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePeriode#getDateDebutCalculee <em>Date Debut Calculee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Debut Calculee</em>' attribute.
	 * @see #getDateDebutCalculee()
	 * @generated
	 */
	void setDateDebutCalculee(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Date Fin Calculee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Fin Calculee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Fin Calculee</em>' attribute.
	 * @see #setDateFinCalculee(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypePeriode_DateFinCalculee()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateFinCalculee'"
	 * @generated
	 */
	XMLGregorianCalendar getDateFinCalculee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePeriode#getDateFinCalculee <em>Date Fin Calculee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Fin Calculee</em>' attribute.
	 * @see #getDateFinCalculee()
	 * @generated
	 */
	void setDateFinCalculee(XMLGregorianCalendar value);

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
	 * @see mpia.schema.SchemaPackage#getTypePeriode_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePeriode#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypePeriode_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePeriode#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Date Debut Previsionnelle Datation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Date Debut Previsionnelle Datation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Date Debut Previsionnelle Datation</em>' containment reference.
	 * @see #setAPourDateDebutPrevisionnelleDatation(TypeDatation)
	 * @see mpia.schema.SchemaPackage#getTypePeriode_APourDateDebutPrevisionnelleDatation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Datation'"
	 *        extendedMetaData="kind='element' name='APourDateDebutPrevisionnelle_Datation'"
	 * @generated
	 */
	TypeDatation getAPourDateDebutPrevisionnelleDatation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePeriode#getAPourDateDebutPrevisionnelleDatation <em>APour Date Debut Previsionnelle Datation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Date Debut Previsionnelle Datation</em>' containment reference.
	 * @see #getAPourDateDebutPrevisionnelleDatation()
	 * @generated
	 */
	void setAPourDateDebutPrevisionnelleDatation(TypeDatation value);

	/**
	 * Returns the value of the '<em><b>APour Date Fin Previsionnelle Datation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Date Fin Previsionnelle Datation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Date Fin Previsionnelle Datation</em>' containment reference.
	 * @see #setAPourDateFinPrevisionnelleDatation(TypeDatation)
	 * @see mpia.schema.SchemaPackage#getTypePeriode_APourDateFinPrevisionnelleDatation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Datation'"
	 *        extendedMetaData="kind='element' name='APourDateFinPrevisionnelle_Datation'"
	 * @generated
	 */
	TypeDatation getAPourDateFinPrevisionnelleDatation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePeriode#getAPourDateFinPrevisionnelleDatation <em>APour Date Fin Previsionnelle Datation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Date Fin Previsionnelle Datation</em>' containment reference.
	 * @see #getAPourDateFinPrevisionnelleDatation()
	 * @generated
	 */
	void setAPourDateFinPrevisionnelleDatation(TypeDatation value);

} // TypePeriode
