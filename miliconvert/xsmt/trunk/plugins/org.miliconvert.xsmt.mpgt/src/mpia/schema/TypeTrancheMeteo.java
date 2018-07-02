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
 * A representation of the model object '<em><b>Type Tranche Meteo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeTrancheMeteo#getGDHdebut <em>GD Hdebut</em>}</li>
 *   <li>{@link mpia.schema.TypeTrancheMeteo#getGDHfin <em>GD Hfin</em>}</li>
 *   <li>{@link mpia.schema.TypeTrancheMeteo#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeTrancheMeteo#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeTrancheMeteo#getAPourCaracteristiqueElementMeteo <em>APour Caracteristique Element Meteo</em>}</li>
 *   <li>{@link mpia.schema.TypeTrancheMeteo#getConcerneEvenementNRBC <em>Concerne Evenement NRBC</em>}</li>
 *   <li>{@link mpia.schema.TypeTrancheMeteo#getConcerneSyntheseDetections <em>Concerne Synthese Detections</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeTrancheMeteo()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_TrancheMeteo' kind='elementOnly'"
 * @generated
 */
public interface TypeTrancheMeteo extends EObject {
	/**
	 * Returns the value of the '<em><b>GD Hdebut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GD Hdebut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GD Hdebut</em>' attribute.
	 * @see #setGDHdebut(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeTrancheMeteo_GDHdebut()
	 * @model dataType="mpia.meta.TypeDataTypeGDH" required="true"
	 *        extendedMetaData="kind='element' name='GDHdebut'"
	 * @generated
	 */
	XMLGregorianCalendar getGDHdebut();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTrancheMeteo#getGDHdebut <em>GD Hdebut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GD Hdebut</em>' attribute.
	 * @see #getGDHdebut()
	 * @generated
	 */
	void setGDHdebut(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>GD Hfin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GD Hfin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GD Hfin</em>' attribute.
	 * @see #setGDHfin(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeTrancheMeteo_GDHfin()
	 * @model dataType="mpia.meta.TypeDataTypeGDH" required="true"
	 *        extendedMetaData="kind='element' name='GDHfin'"
	 * @generated
	 */
	XMLGregorianCalendar getGDHfin();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTrancheMeteo#getGDHfin <em>GD Hfin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GD Hfin</em>' attribute.
	 * @see #getGDHfin()
	 * @generated
	 */
	void setGDHfin(XMLGregorianCalendar value);

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
	 * @see mpia.schema.SchemaPackage#getTypeTrancheMeteo_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTrancheMeteo#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeTrancheMeteo_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTrancheMeteo#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Caracteristique Element Meteo</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Caracteristique Element Meteo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Caracteristique Element Meteo</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeTrancheMeteo_APourCaracteristiqueElementMeteo()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourTrancheHoraire_TrancheMeteo' target_entity='type_ElementMeteo'"
	 *        extendedMetaData="kind='element' name='APourCaracteristique_ElementMeteo'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourCaracteristiqueElementMeteo();

	/**
	 * Returns the value of the '<em><b>Concerne Evenement NRBC</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Evenement NRBC</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Evenement NRBC</em>' containment reference.
	 * @see #setConcerneEvenementNRBC(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeTrancheMeteo_ConcerneEvenementNRBC()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourConditionsMeteo_TrancheMeteo' target_entity='type_EvenementNRBC'"
	 *        extendedMetaData="kind='element' name='Concerne_EvenementNRBC'"
	 * @generated
	 */
	TypeAssociation getConcerneEvenementNRBC();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTrancheMeteo#getConcerneEvenementNRBC <em>Concerne Evenement NRBC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Evenement NRBC</em>' containment reference.
	 * @see #getConcerneEvenementNRBC()
	 * @generated
	 */
	void setConcerneEvenementNRBC(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Concerne Synthese Detections</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Synthese Detections</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Synthese Detections</em>' containment reference.
	 * @see #setConcerneSyntheseDetections(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeTrancheMeteo_ConcerneSyntheseDetections()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourConditionsMeteo_TrancheMeteo' target_entity='type_SyntheseDetections'"
	 *        extendedMetaData="kind='element' name='Concerne_SyntheseDetections'"
	 * @generated
	 */
	TypeAssociation getConcerneSyntheseDetections();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTrancheMeteo#getConcerneSyntheseDetections <em>Concerne Synthese Detections</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Synthese Detections</em>' containment reference.
	 * @see #getConcerneSyntheseDetections()
	 * @generated
	 */
	void setConcerneSyntheseDetections(TypeAssociation value);

} // TypeTrancheMeteo
