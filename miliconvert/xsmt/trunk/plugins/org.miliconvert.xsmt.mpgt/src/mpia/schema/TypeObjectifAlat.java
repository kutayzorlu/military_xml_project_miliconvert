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
 * A representation of the model object '<em><b>Type Objectif Alat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeObjectifAlat#getNom <em>Nom</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifAlat#getMenace <em>Menace</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifAlat#getGdhObservation <em>Gdh Observation</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifAlat#getLieu <em>Lieu</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifAlat#getAPourLocalisationLocalisationObjectif <em>APour Localisation Localisation Objectif</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeObjectifAlat()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ObjectifAlat' kind='elementOnly'"
 * @generated
 */
public interface TypeObjectifAlat extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifAlat_Nom()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='Nom'"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifAlat#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Menace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menace</em>' attribute.
	 * @see #setMenace(String)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifAlat_Menace()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='Menace'"
	 * @generated
	 */
	String getMenace();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifAlat#getMenace <em>Menace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Menace</em>' attribute.
	 * @see #getMenace()
	 * @generated
	 */
	void setMenace(String value);

	/**
	 * Returns the value of the '<em><b>Gdh Observation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gdh Observation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gdh Observation</em>' attribute.
	 * @see #setGdhObservation(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifAlat_GdhObservation()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='GdhObservation'"
	 * @generated
	 */
	XMLGregorianCalendar getGdhObservation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifAlat#getGdhObservation <em>Gdh Observation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gdh Observation</em>' attribute.
	 * @see #getGdhObservation()
	 * @generated
	 */
	void setGdhObservation(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Lieu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lieu</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lieu</em>' attribute.
	 * @see #setLieu(String)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifAlat_Lieu()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='Lieu'"
	 * @generated
	 */
	String getLieu();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifAlat#getLieu <em>Lieu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lieu</em>' attribute.
	 * @see #getLieu()
	 * @generated
	 */
	void setLieu(String value);

	/**
	 * Returns the value of the '<em><b>APour Localisation Localisation Objectif</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Localisation Localisation Objectif</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Localisation Localisation Objectif</em>' containment reference.
	 * @see #setAPourLocalisationLocalisationObjectif(TypeLocalisationObjectif)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifAlat_APourLocalisationLocalisationObjectif()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_LocalisationObjectif'"
	 *        extendedMetaData="kind='element' name='APourLocalisation_LocalisationObjectif'"
	 * @generated
	 */
	TypeLocalisationObjectif getAPourLocalisationLocalisationObjectif();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifAlat#getAPourLocalisationLocalisationObjectif <em>APour Localisation Localisation Objectif</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Localisation Localisation Objectif</em>' containment reference.
	 * @see #getAPourLocalisationLocalisationObjectif()
	 * @generated
	 */
	void setAPourLocalisationLocalisationObjectif(TypeLocalisationObjectif value);

} // TypeObjectifAlat
