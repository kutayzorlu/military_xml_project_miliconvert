/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeLongueur;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Element CRintermediaire Acquisition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeElementCRintermediaireAcquisition#getDateAcquisitionObjectif <em>Date Acquisition Objectif</em>}</li>
 *   <li>{@link mpia.schema.TypeElementCRintermediaireAcquisition#getPrecisionPositionAmis <em>Precision Position Amis</em>}</li>
 *   <li>{@link mpia.schema.TypeElementCRintermediaireAcquisition#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeElementCRintermediaireAcquisition#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeElementCRintermediaireAcquisition#getAPourObjectifObjectifCiblage <em>APour Objectif Objectif Ciblage</em>}</li>
 *   <li>{@link mpia.schema.TypeElementCRintermediaireAcquisition#getAPourZoneSecuriteZoneSecurite <em>APour Zone Securite Zone Securite</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeElementCRintermediaireAcquisition()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ElementCRintermediaireAcquisition' kind='elementOnly'"
 * @generated
 */
public interface TypeElementCRintermediaireAcquisition extends EObject {
	/**
	 * Returns the value of the '<em><b>Date Acquisition Objectif</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Acquisition Objectif</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Acquisition Objectif</em>' attribute.
	 * @see #setDateAcquisitionObjectif(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeElementCRintermediaireAcquisition_DateAcquisitionObjectif()
	 * @model dataType="mpia.meta.TypeDataTypeGDH" required="true"
	 *        extendedMetaData="kind='element' name='DateAcquisitionObjectif'"
	 * @generated
	 */
	XMLGregorianCalendar getDateAcquisitionObjectif();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeElementCRintermediaireAcquisition#getDateAcquisitionObjectif <em>Date Acquisition Objectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Acquisition Objectif</em>' attribute.
	 * @see #getDateAcquisitionObjectif()
	 * @generated
	 */
	void setDateAcquisitionObjectif(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Precision Position Amis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision Position Amis</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision Position Amis</em>' containment reference.
	 * @see #setPrecisionPositionAmis(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeElementCRintermediaireAcquisition_PrecisionPositionAmis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PrecisionPositionAmis'"
	 * @generated
	 */
	TypeDataTypeLongueur getPrecisionPositionAmis();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeElementCRintermediaireAcquisition#getPrecisionPositionAmis <em>Precision Position Amis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision Position Amis</em>' containment reference.
	 * @see #getPrecisionPositionAmis()
	 * @generated
	 */
	void setPrecisionPositionAmis(TypeDataTypeLongueur value);

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
	 * @see mpia.schema.SchemaPackage#getTypeElementCRintermediaireAcquisition_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeElementCRintermediaireAcquisition#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeElementCRintermediaireAcquisition_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeElementCRintermediaireAcquisition#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Objectif Objectif Ciblage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Objectif Objectif Ciblage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Objectif Objectif Ciblage</em>' containment reference.
	 * @see #setAPourObjectifObjectifCiblage(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeElementCRintermediaireAcquisition_APourObjectifObjectifCiblage()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_ObjectifCiblage'"
	 *        extendedMetaData="kind='element' name='APourObjectif_ObjectifCiblage'"
	 * @generated
	 */
	TypeAssociation getAPourObjectifObjectifCiblage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeElementCRintermediaireAcquisition#getAPourObjectifObjectifCiblage <em>APour Objectif Objectif Ciblage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Objectif Objectif Ciblage</em>' containment reference.
	 * @see #getAPourObjectifObjectifCiblage()
	 * @generated
	 */
	void setAPourObjectifObjectifCiblage(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Zone Securite Zone Securite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeZoneSecurite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Zone Securite Zone Securite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Zone Securite Zone Securite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeElementCRintermediaireAcquisition_APourZoneSecuriteZoneSecurite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ZoneSecurite'"
	 *        extendedMetaData="kind='element' name='APourZoneSecurite_ZoneSecurite'"
	 * @generated
	 */
	EList<TypeZoneSecurite> getAPourZoneSecuriteZoneSecurite();

} // TypeElementCRintermediaireAcquisition
