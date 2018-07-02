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
 * A representation of the model object '<em><b>Type Mission Escorte Ou Appui Feu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMissionEscorteOuAppuiFeu#getTypeDefense <em>Type Defense</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionEscorteOuAppuiFeu#getMoyenContact <em>Moyen Contact</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionEscorteOuAppuiFeu#getEstObjetAssociationUniteMissionEscorteAF <em>Est Objet Association Unite Mission Escorte AF</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionEscorteOuAppuiFeu#getAPourItinerairesADefendreOuABattreItineraire <em>APour Itineraires ADefendre Ou ABattre Itineraire</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionEscorteOuAppuiFeu#getAPourZonesADefendreOuABattreAutreElementControle <em>APour Zones ADefendre Ou ABattre Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionEscorteOuAppuiFeu#getAPourLieuDeContactAutreElementControle <em>APour Lieu De Contact Autre Element Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMissionEscorteOuAppuiFeu()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_MissionEscorteOuAppuiFeu' kind='elementOnly'"
 * @generated
 */
public interface TypeMissionEscorteOuAppuiFeu extends TypeMission {
	/**
	 * Returns the value of the '<em><b>Type Defense</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Defense</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Defense</em>' attribute.
	 * @see #setTypeDefense(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionEscorteOuAppuiFeu_TypeDefense()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='TypeDefense'"
	 * @generated
	 */
	String getTypeDefense();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionEscorteOuAppuiFeu#getTypeDefense <em>Type Defense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Defense</em>' attribute.
	 * @see #getTypeDefense()
	 * @generated
	 */
	void setTypeDefense(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeMissionEscorteOuAppuiFeu_MoyenContact()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='MoyenContact'"
	 * @generated
	 */
	String getMoyenContact();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionEscorteOuAppuiFeu#getMoyenContact <em>Moyen Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moyen Contact</em>' attribute.
	 * @see #getMoyenContact()
	 * @generated
	 */
	void setMoyenContact(String value);

	/**
	 * Returns the value of the '<em><b>Est Objet Association Unite Mission Escorte AF</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Unite Mission Escorte AF</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Unite Mission Escorte AF</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionEscorteOuAppuiFeu_EstObjetAssociationUniteMissionEscorteAF()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_MissionEscorteOuAppuiFeu' target_entity='type_AssociationUniteMissionEscorteAF'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationUniteMissionEscorteAF'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationUniteMissionEscorteAF();

	/**
	 * Returns the value of the '<em><b>APour Itineraires ADefendre Ou ABattre Itineraire</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Itineraires ADefendre Ou ABattre Itineraire</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Itineraires ADefendre Ou ABattre Itineraire</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionEscorteOuAppuiFeu_APourItinerairesADefendreOuABattreItineraire()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Itineraire'"
	 *        extendedMetaData="kind='element' name='APourItinerairesADefendreOuABattre_Itineraire'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourItinerairesADefendreOuABattreItineraire();

	/**
	 * Returns the value of the '<em><b>APour Zones ADefendre Ou ABattre Autre Element Controle</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Zones ADefendre Ou ABattre Autre Element Controle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Zones ADefendre Ou ABattre Autre Element Controle</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionEscorteOuAppuiFeu_APourZonesADefendreOuABattreAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourZonesADefendreOuABattre_AutreElementControle'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourZonesADefendreOuABattreAutreElementControle();

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
	 * @see mpia.schema.SchemaPackage#getTypeMissionEscorteOuAppuiFeu_APourLieuDeContactAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourLieuDeContact_AutreElementControle'"
	 * @generated
	 */
	TypeAssociation getAPourLieuDeContactAutreElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionEscorteOuAppuiFeu#getAPourLieuDeContactAutreElementControle <em>APour Lieu De Contact Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Lieu De Contact Autre Element Controle</em>' containment reference.
	 * @see #getAPourLieuDeContactAutreElementControle()
	 * @generated
	 */
	void setAPourLieuDeContactAutreElementControle(TypeAssociation value);

} // TypeMissionEscorteOuAppuiFeu
