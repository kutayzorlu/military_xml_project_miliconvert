/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeDuree;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Mission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMission#getNiveauConfirmation <em>Niveau Confirmation</em>}</li>
 *   <li>{@link mpia.schema.TypeMission#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link mpia.schema.TypeMission#getDateFin <em>Date Fin</em>}</li>
 *   <li>{@link mpia.schema.TypeMission#getDuree <em>Duree</em>}</li>
 *   <li>{@link mpia.schema.TypeMission#getButAAtteindre <em>But AAtteindre</em>}</li>
 *   <li>{@link mpia.schema.TypeMission#getACommeArticulationArticulation <em>AComme Articulation Articulation</em>}</li>
 *   <li>{@link mpia.schema.TypeMission#getAPourZoneDeploiementAutreElementControle <em>APour Zone Deploiement Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeMission#getACommeCoordinationMissionEtLogistiqueArticulation <em>AComme Coordination Mission Et Logistique Articulation</em>}</li>
 *   <li>{@link mpia.schema.TypeMission#getACommeFaitRechercheFaitRenseignement <em>AComme Fait Recherche Fait Renseignement</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMission()
 * @model abstract="true"
 *        extendedMetaData="name='type_Mission' kind='elementOnly'"
 * @generated
 */
public interface TypeMission extends TypeActivite {
	/**
	 * Returns the value of the '<em><b>Niveau Confirmation</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMissionNiveauConfirmation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Niveau Confirmation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau Confirmation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionNiveauConfirmation
	 * @see #isSetNiveauConfirmation()
	 * @see #unsetNiveauConfirmation()
	 * @see #setNiveauConfirmation(TypeDictionaryDicoMissionNiveauConfirmation)
	 * @see mpia.schema.SchemaPackage#getTypeMission_NiveauConfirmation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='NiveauConfirmation'"
	 * @generated
	 */
	TypeDictionaryDicoMissionNiveauConfirmation getNiveauConfirmation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMission#getNiveauConfirmation <em>Niveau Confirmation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Niveau Confirmation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionNiveauConfirmation
	 * @see #isSetNiveauConfirmation()
	 * @see #unsetNiveauConfirmation()
	 * @see #getNiveauConfirmation()
	 * @generated
	 */
	void setNiveauConfirmation(TypeDictionaryDicoMissionNiveauConfirmation value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMission#getNiveauConfirmation <em>Niveau Confirmation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNiveauConfirmation()
	 * @see #getNiveauConfirmation()
	 * @see #setNiveauConfirmation(TypeDictionaryDicoMissionNiveauConfirmation)
	 * @generated
	 */
	void unsetNiveauConfirmation();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMission#getNiveauConfirmation <em>Niveau Confirmation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Niveau Confirmation</em>' attribute is set.
	 * @see #unsetNiveauConfirmation()
	 * @see #getNiveauConfirmation()
	 * @see #setNiveauConfirmation(TypeDictionaryDicoMissionNiveauConfirmation)
	 * @generated
	 */
	boolean isSetNiveauConfirmation();

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
	 * @see mpia.schema.SchemaPackage#getTypeMission_DateDebut()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateDebut'"
	 * @generated
	 */
	XMLGregorianCalendar getDateDebut();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMission#getDateDebut <em>Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Debut</em>' attribute.
	 * @see #getDateDebut()
	 * @generated
	 */
	void setDateDebut(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Date Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Fin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Fin</em>' attribute.
	 * @see #setDateFin(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeMission_DateFin()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateFin'"
	 * @generated
	 */
	XMLGregorianCalendar getDateFin();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMission#getDateFin <em>Date Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Fin</em>' attribute.
	 * @see #getDateFin()
	 * @generated
	 */
	void setDateFin(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Duree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duree</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duree</em>' containment reference.
	 * @see #setDuree(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeMission_Duree()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Duree'"
	 * @generated
	 */
	TypeDataTypeDuree getDuree();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMission#getDuree <em>Duree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duree</em>' containment reference.
	 * @see #getDuree()
	 * @generated
	 */
	void setDuree(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>But AAtteindre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>But AAtteindre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>But AAtteindre</em>' attribute.
	 * @see #setButAAtteindre(String)
	 * @see mpia.schema.SchemaPackage#getTypeMission_ButAAtteindre()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='ButAAtteindre'"
	 * @generated
	 */
	String getButAAtteindre();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMission#getButAAtteindre <em>But AAtteindre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>But AAtteindre</em>' attribute.
	 * @see #getButAAtteindre()
	 * @generated
	 */
	void setButAAtteindre(String value);

	/**
	 * Returns the value of the '<em><b>AComme Articulation Articulation</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Articulation Articulation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Articulation Articulation</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMission_ACommeArticulationArticulation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSpecifieePour_Mission' target_entity='type_Articulation'"
	 *        extendedMetaData="kind='element' name='ACommeArticulation_Articulation'"
	 * @generated
	 */
	EList<TypeAssociation> getACommeArticulationArticulation();

	/**
	 * Returns the value of the '<em><b>APour Zone Deploiement Autre Element Controle</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Zone Deploiement Autre Element Controle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Zone Deploiement Autre Element Controle</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMission_APourZoneDeploiementAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourZoneDeploiement_AutreElementControle'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourZoneDeploiementAutreElementControle();

	/**
	 * Returns the value of the '<em><b>AComme Coordination Mission Et Logistique Articulation</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Coordination Mission Et Logistique Articulation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Coordination Mission Et Logistique Articulation</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMission_ACommeCoordinationMissionEtLogistiqueArticulation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSpecifieePourLogistique_Mission' target_entity='type_Articulation'"
	 *        extendedMetaData="kind='element' name='ACommeCoordinationMissionEtLogistique_Articulation'"
	 * @generated
	 */
	EList<TypeAssociation> getACommeCoordinationMissionEtLogistiqueArticulation();

	/**
	 * Returns the value of the '<em><b>AComme Fait Recherche Fait Renseignement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Fait Recherche Fait Renseignement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Fait Recherche Fait Renseignement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMission_ACommeFaitRechercheFaitRenseignement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='CorrespondAMission_Mission' target_entity='type_FaitRenseignement'"
	 *        extendedMetaData="kind='element' name='ACommeFaitRecherche_FaitRenseignement'"
	 * @generated
	 */
	EList<TypeAssociation> getACommeFaitRechercheFaitRenseignement();

} // TypeMission
