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
 * A representation of the model object '<em><b>Type Moyens Aeriens Dont Beneficie GU</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMoyensAeriensDontBeneficieGU#getHeureDebutDisponibilite <em>Heure Debut Disponibilite</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyensAeriensDontBeneficieGU#getHeureFinDisponibilite <em>Heure Fin Disponibilite</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyensAeriensDontBeneficieGU#getCapaciteOpsGlobale <em>Capacite Ops Globale</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyensAeriensDontBeneficieGU#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyensAeriensDontBeneficieGU#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyensAeriensDontBeneficieGU#getAPourMoyensAMIPrelevementDetachement <em>APour Moyens AMI Prelevement Detachement</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMoyensAeriensDontBeneficieGU()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_MoyensAeriensDontBeneficieGU' kind='elementOnly'"
 * @generated
 */
public interface TypeMoyensAeriensDontBeneficieGU extends EObject {
	/**
	 * Returns the value of the '<em><b>Heure Debut Disponibilite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heure Debut Disponibilite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heure Debut Disponibilite</em>' attribute.
	 * @see #setHeureDebutDisponibilite(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeMoyensAeriensDontBeneficieGU_HeureDebutDisponibilite()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='HeureDebutDisponibilite'"
	 * @generated
	 */
	XMLGregorianCalendar getHeureDebutDisponibilite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyensAeriensDontBeneficieGU#getHeureDebutDisponibilite <em>Heure Debut Disponibilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heure Debut Disponibilite</em>' attribute.
	 * @see #getHeureDebutDisponibilite()
	 * @generated
	 */
	void setHeureDebutDisponibilite(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Heure Fin Disponibilite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heure Fin Disponibilite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heure Fin Disponibilite</em>' attribute.
	 * @see #setHeureFinDisponibilite(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeMoyensAeriensDontBeneficieGU_HeureFinDisponibilite()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='HeureFinDisponibilite'"
	 * @generated
	 */
	XMLGregorianCalendar getHeureFinDisponibilite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyensAeriensDontBeneficieGU#getHeureFinDisponibilite <em>Heure Fin Disponibilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heure Fin Disponibilite</em>' attribute.
	 * @see #getHeureFinDisponibilite()
	 * @generated
	 */
	void setHeureFinDisponibilite(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Capacite Ops Globale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacite Ops Globale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacite Ops Globale</em>' attribute.
	 * @see #isSetCapaciteOpsGlobale()
	 * @see #unsetCapaciteOpsGlobale()
	 * @see #setCapaciteOpsGlobale(double)
	 * @see mpia.schema.SchemaPackage#getTypeMoyensAeriensDontBeneficieGU_CapaciteOpsGlobale()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeRatio"
	 *        extendedMetaData="kind='element' name='CapaciteOpsGlobale'"
	 * @generated
	 */
	double getCapaciteOpsGlobale();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyensAeriensDontBeneficieGU#getCapaciteOpsGlobale <em>Capacite Ops Globale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacite Ops Globale</em>' attribute.
	 * @see #isSetCapaciteOpsGlobale()
	 * @see #unsetCapaciteOpsGlobale()
	 * @see #getCapaciteOpsGlobale()
	 * @generated
	 */
	void setCapaciteOpsGlobale(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMoyensAeriensDontBeneficieGU#getCapaciteOpsGlobale <em>Capacite Ops Globale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCapaciteOpsGlobale()
	 * @see #getCapaciteOpsGlobale()
	 * @see #setCapaciteOpsGlobale(double)
	 * @generated
	 */
	void unsetCapaciteOpsGlobale();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMoyensAeriensDontBeneficieGU#getCapaciteOpsGlobale <em>Capacite Ops Globale</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Capacite Ops Globale</em>' attribute is set.
	 * @see #unsetCapaciteOpsGlobale()
	 * @see #getCapaciteOpsGlobale()
	 * @see #setCapaciteOpsGlobale(double)
	 * @generated
	 */
	boolean isSetCapaciteOpsGlobale();

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
	 * @see mpia.schema.SchemaPackage#getTypeMoyensAeriensDontBeneficieGU_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyensAeriensDontBeneficieGU#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeMoyensAeriensDontBeneficieGU_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyensAeriensDontBeneficieGU#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Moyens AMI Prelevement Detachement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Moyens AMI Prelevement Detachement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Moyens AMI Prelevement Detachement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMoyensAeriensDontBeneficieGU_APourMoyensAMIPrelevementDetachement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_PrelevementDetachement'"
	 *        extendedMetaData="kind='element' name='APourMoyensAMI_PrelevementDetachement'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourMoyensAMIPrelevementDetachement();

} // TypeMoyensAeriensDontBeneficieGU
