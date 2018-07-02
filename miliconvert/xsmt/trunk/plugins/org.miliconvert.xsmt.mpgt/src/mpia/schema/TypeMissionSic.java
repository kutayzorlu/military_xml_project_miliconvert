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
 * A representation of the model object '<em><b>Type Mission Sic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMissionSic#getComplementMission <em>Complement Mission</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionSic#getNumeroMission <em>Numero Mission</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionSic#getAPourUniteExecutanteUnite <em>APour Unite Executante Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionSic#getAPourBesoinLiaisonBesoinRaccordement <em>APour Besoin Liaison Besoin Raccordement</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionSic#getDecritLiaison <em>Decrit Liaison</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionSic#getAPourEmploiFrequenceEmploiFrequence <em>APour Emploi Frequence Emploi Frequence</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionSic#getEstObjetAssociationUniteMissionSic <em>Est Objet Association Unite Mission Sic</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMissionSic()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_MissionSic' kind='elementOnly'"
 * @generated
 */
public interface TypeMissionSic extends TypeMission {
	/**
	 * Returns the value of the '<em><b>Complement Mission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complement Mission</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complement Mission</em>' attribute.
	 * @see #setComplementMission(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionSic_ComplementMission()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='ComplementMission'"
	 * @generated
	 */
	String getComplementMission();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionSic#getComplementMission <em>Complement Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complement Mission</em>' attribute.
	 * @see #getComplementMission()
	 * @generated
	 */
	void setComplementMission(String value);

	/**
	 * Returns the value of the '<em><b>Numero Mission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Mission</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Mission</em>' attribute.
	 * @see #isSetNumeroMission()
	 * @see #unsetNumeroMission()
	 * @see #setNumeroMission(long)
	 * @see mpia.schema.SchemaPackage#getTypeMissionSic_NumeroMission()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3" required="true"
	 *        extendedMetaData="kind='element' name='NumeroMission'"
	 * @generated
	 */
	long getNumeroMission();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionSic#getNumeroMission <em>Numero Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Mission</em>' attribute.
	 * @see #isSetNumeroMission()
	 * @see #unsetNumeroMission()
	 * @see #getNumeroMission()
	 * @generated
	 */
	void setNumeroMission(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionSic#getNumeroMission <em>Numero Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumeroMission()
	 * @see #getNumeroMission()
	 * @see #setNumeroMission(long)
	 * @generated
	 */
	void unsetNumeroMission();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionSic#getNumeroMission <em>Numero Mission</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Numero Mission</em>' attribute is set.
	 * @see #unsetNumeroMission()
	 * @see #getNumeroMission()
	 * @see #setNumeroMission(long)
	 * @generated
	 */
	boolean isSetNumeroMission();

	/**
	 * Returns the value of the '<em><b>APour Unite Executante Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite Executante Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite Executante Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionSic_APourUniteExecutanteUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteExecutante_Unite'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourUniteExecutanteUnite();

	/**
	 * Returns the value of the '<em><b>APour Besoin Liaison Besoin Raccordement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeBesoinRaccordement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Besoin Liaison Besoin Raccordement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Besoin Liaison Besoin Raccordement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionSic_APourBesoinLiaisonBesoinRaccordement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_BesoinRaccordement'"
	 *        extendedMetaData="kind='element' name='APourBesoinLiaison_BesoinRaccordement'"
	 * @generated
	 */
	EList<TypeBesoinRaccordement> getAPourBesoinLiaisonBesoinRaccordement();

	/**
	 * Returns the value of the '<em><b>Decrit Liaison</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeLiaison}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decrit Liaison</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decrit Liaison</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionSic_DecritLiaison()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Liaison'"
	 *        extendedMetaData="kind='element' name='Decrit_Liaison'"
	 * @generated
	 */
	EList<TypeLiaison> getDecritLiaison();

	/**
	 * Returns the value of the '<em><b>APour Emploi Frequence Emploi Frequence</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeEmploiFrequence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Emploi Frequence Emploi Frequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Emploi Frequence Emploi Frequence</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionSic_APourEmploiFrequenceEmploiFrequence()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EmploiFrequence'"
	 *        extendedMetaData="kind='element' name='APourEmploiFrequence_EmploiFrequence'"
	 * @generated
	 */
	EList<TypeEmploiFrequence> getAPourEmploiFrequenceEmploiFrequence();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Unite Mission Sic</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Unite Mission Sic</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Unite Mission Sic</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionSic_EstObjetAssociationUniteMissionSic()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_MissionSic' target_entity='type_AssociationUniteMissionSic'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationUniteMissionSic'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationUniteMissionSic();

} // TypeMissionSic
