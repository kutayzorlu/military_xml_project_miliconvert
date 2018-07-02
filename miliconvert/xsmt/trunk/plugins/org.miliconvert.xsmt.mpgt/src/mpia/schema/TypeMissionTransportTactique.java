/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Mission Transport Tactique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMissionTransportTactique#getVolumeMateriel <em>Volume Materiel</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionTransportTactique#getMasseMateriel <em>Masse Materiel</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionTransportTactique#getNbrPersonne <em>Nbr Personne</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionTransportTactique#getMoyenContact <em>Moyen Contact</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionTransportTactique#getAPourLieuDeMiseADispositionAutreElementControle <em>APour Lieu De Mise ADisposition Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionTransportTactique#getEstObjetAssociationUniteMissionTranspTact <em>Est Objet Association Unite Mission Transp Tact</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionTransportTactique#getAPourZoneDEnleverAutreElementControle <em>APour Zone DEnlever Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionTransportTactique#getAPourZoneDePoserAutreElementControle <em>APour Zone De Poser Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionTransportTactique#getAPourLieuDeContactAutreElementControle <em>APour Lieu De Contact Autre Element Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMissionTransportTactique()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_MissionTransportTactique' kind='elementOnly'"
 * @generated
 */
public interface TypeMissionTransportTactique extends TypeMission {
	/**
	 * Returns the value of the '<em><b>Volume Materiel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volume Materiel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume Materiel</em>' attribute.
	 * @see #isSetVolumeMateriel()
	 * @see #unsetVolumeMateriel()
	 * @see #setVolumeMateriel(long)
	 * @see mpia.schema.SchemaPackage#getTypeMissionTransportTactique_VolumeMateriel()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='VolumeMateriel'"
	 * @generated
	 */
	long getVolumeMateriel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionTransportTactique#getVolumeMateriel <em>Volume Materiel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume Materiel</em>' attribute.
	 * @see #isSetVolumeMateriel()
	 * @see #unsetVolumeMateriel()
	 * @see #getVolumeMateriel()
	 * @generated
	 */
	void setVolumeMateriel(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionTransportTactique#getVolumeMateriel <em>Volume Materiel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVolumeMateriel()
	 * @see #getVolumeMateriel()
	 * @see #setVolumeMateriel(long)
	 * @generated
	 */
	void unsetVolumeMateriel();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionTransportTactique#getVolumeMateriel <em>Volume Materiel</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Volume Materiel</em>' attribute is set.
	 * @see #unsetVolumeMateriel()
	 * @see #getVolumeMateriel()
	 * @see #setVolumeMateriel(long)
	 * @generated
	 */
	boolean isSetVolumeMateriel();

	/**
	 * Returns the value of the '<em><b>Masse Materiel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Masse Materiel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Masse Materiel</em>' attribute.
	 * @see #isSetMasseMateriel()
	 * @see #unsetMasseMateriel()
	 * @see #setMasseMateriel(long)
	 * @see mpia.schema.SchemaPackage#getTypeMissionTransportTactique_MasseMateriel()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='MasseMateriel'"
	 * @generated
	 */
	long getMasseMateriel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionTransportTactique#getMasseMateriel <em>Masse Materiel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Masse Materiel</em>' attribute.
	 * @see #isSetMasseMateriel()
	 * @see #unsetMasseMateriel()
	 * @see #getMasseMateriel()
	 * @generated
	 */
	void setMasseMateriel(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionTransportTactique#getMasseMateriel <em>Masse Materiel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMasseMateriel()
	 * @see #getMasseMateriel()
	 * @see #setMasseMateriel(long)
	 * @generated
	 */
	void unsetMasseMateriel();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionTransportTactique#getMasseMateriel <em>Masse Materiel</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Masse Materiel</em>' attribute is set.
	 * @see #unsetMasseMateriel()
	 * @see #getMasseMateriel()
	 * @see #setMasseMateriel(long)
	 * @generated
	 */
	boolean isSetMasseMateriel();

	/**
	 * Returns the value of the '<em><b>Nbr Personne</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nbr Personne</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nbr Personne</em>' attribute.
	 * @see #isSetNbrPersonne()
	 * @see #unsetNbrPersonne()
	 * @see #setNbrPersonne(long)
	 * @see mpia.schema.SchemaPackage#getTypeMissionTransportTactique_NbrPersonne()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier9"
	 *        extendedMetaData="kind='element' name='NbrPersonne'"
	 * @generated
	 */
	long getNbrPersonne();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionTransportTactique#getNbrPersonne <em>Nbr Personne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nbr Personne</em>' attribute.
	 * @see #isSetNbrPersonne()
	 * @see #unsetNbrPersonne()
	 * @see #getNbrPersonne()
	 * @generated
	 */
	void setNbrPersonne(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionTransportTactique#getNbrPersonne <em>Nbr Personne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNbrPersonne()
	 * @see #getNbrPersonne()
	 * @see #setNbrPersonne(long)
	 * @generated
	 */
	void unsetNbrPersonne();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionTransportTactique#getNbrPersonne <em>Nbr Personne</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nbr Personne</em>' attribute is set.
	 * @see #unsetNbrPersonne()
	 * @see #getNbrPersonne()
	 * @see #setNbrPersonne(long)
	 * @generated
	 */
	boolean isSetNbrPersonne();

	/**
	 * Returns the value of the '<em><b>Moyen Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moyen Contact</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moyen Contact</em>' attribute.
	 * @see #setMoyenContact(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionTransportTactique_MoyenContact()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='MoyenContact'"
	 * @generated
	 */
	String getMoyenContact();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionTransportTactique#getMoyenContact <em>Moyen Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moyen Contact</em>' attribute.
	 * @see #getMoyenContact()
	 * @generated
	 */
	void setMoyenContact(String value);

	/**
	 * Returns the value of the '<em><b>APour Lieu De Mise ADisposition Autre Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Lieu De Mise ADisposition Autre Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Lieu De Mise ADisposition Autre Element Controle</em>' containment reference.
	 * @see #setAPourLieuDeMiseADispositionAutreElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeMissionTransportTactique_APourLieuDeMiseADispositionAutreElementControle()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourLieuDeMiseADisposition_AutreElementControle'"
	 * @generated
	 */
	TypeAssociation getAPourLieuDeMiseADispositionAutreElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionTransportTactique#getAPourLieuDeMiseADispositionAutreElementControle <em>APour Lieu De Mise ADisposition Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Lieu De Mise ADisposition Autre Element Controle</em>' containment reference.
	 * @see #getAPourLieuDeMiseADispositionAutreElementControle()
	 * @generated
	 */
	void setAPourLieuDeMiseADispositionAutreElementControle(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Est Objet Association Unite Mission Transp Tact</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Unite Mission Transp Tact</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Unite Mission Transp Tact</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionTransportTactique_EstObjetAssociationUniteMissionTranspTact()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_MissionTransportTactique' target_entity='type_AssociationUniteMissionTranspTact'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationUniteMissionTranspTact'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationUniteMissionTranspTact();

	/**
	 * Returns the value of the '<em><b>APour Zone DEnlever Autre Element Controle</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Zone DEnlever Autre Element Controle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Zone DEnlever Autre Element Controle</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionTransportTactique_APourZoneDEnleverAutreElementControle()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourZoneDEnlever_AutreElementControle'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourZoneDEnleverAutreElementControle();

	/**
	 * Returns the value of the '<em><b>APour Zone De Poser Autre Element Controle</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Zone De Poser Autre Element Controle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Zone De Poser Autre Element Controle</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionTransportTactique_APourZoneDePoserAutreElementControle()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourZoneDePoser_AutreElementControle'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourZoneDePoserAutreElementControle();

	/**
	 * Returns the value of the '<em><b>APour Lieu De Contact Autre Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Lieu De Contact Autre Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Lieu De Contact Autre Element Controle</em>' containment reference.
	 * @see #setAPourLieuDeContactAutreElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeMissionTransportTactique_APourLieuDeContactAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourLieuDeContact_AutreElementControle'"
	 * @generated
	 */
	TypeAssociation getAPourLieuDeContactAutreElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionTransportTactique#getAPourLieuDeContactAutreElementControle <em>APour Lieu De Contact Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Lieu De Contact Autre Element Controle</em>' containment reference.
	 * @see #getAPourLieuDeContactAutreElementControle()
	 * @generated
	 */
	void setAPourLieuDeContactAutreElementControle(TypeAssociation value);

} // TypeMissionTransportTactique
