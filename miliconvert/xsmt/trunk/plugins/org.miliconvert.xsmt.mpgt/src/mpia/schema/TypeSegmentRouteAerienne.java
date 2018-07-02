/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeVitesseLineaire;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Segment Route Aerienne</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeSegmentRouteAerienne#getEmploi <em>Emploi</em>}</li>
 *   <li>{@link mpia.schema.TypeSegmentRouteAerienne#getStatut <em>Statut</em>}</li>
 *   <li>{@link mpia.schema.TypeSegmentRouteAerienne#getCapaciteNecessaire <em>Capacite Necessaire</em>}</li>
 *   <li>{@link mpia.schema.TypeSegmentRouteAerienne#getVitesseAMaintenir <em>Vitesse AMaintenir</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeSegmentRouteAerienne()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_SegmentRouteAerienne' kind='elementOnly'"
 * @generated
 */
public interface TypeSegmentRouteAerienne extends TypeSegmentItineraire {
	/**
	 * Returns the value of the '<em><b>Emploi</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoSegmentRouteAerienneEmploi}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emploi</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emploi</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoSegmentRouteAerienneEmploi
	 * @see #isSetEmploi()
	 * @see #unsetEmploi()
	 * @see #setEmploi(TypeDictionaryDicoSegmentRouteAerienneEmploi)
	 * @see mpia.schema.SchemaPackage#getTypeSegmentRouteAerienne_Emploi()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Emploi'"
	 * @generated
	 */
	TypeDictionaryDicoSegmentRouteAerienneEmploi getEmploi();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSegmentRouteAerienne#getEmploi <em>Emploi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emploi</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoSegmentRouteAerienneEmploi
	 * @see #isSetEmploi()
	 * @see #unsetEmploi()
	 * @see #getEmploi()
	 * @generated
	 */
	void setEmploi(TypeDictionaryDicoSegmentRouteAerienneEmploi value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSegmentRouteAerienne#getEmploi <em>Emploi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEmploi()
	 * @see #getEmploi()
	 * @see #setEmploi(TypeDictionaryDicoSegmentRouteAerienneEmploi)
	 * @generated
	 */
	void unsetEmploi();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSegmentRouteAerienne#getEmploi <em>Emploi</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Emploi</em>' attribute is set.
	 * @see #unsetEmploi()
	 * @see #getEmploi()
	 * @see #setEmploi(TypeDictionaryDicoSegmentRouteAerienneEmploi)
	 * @generated
	 */
	boolean isSetEmploi();

	/**
	 * Returns the value of the '<em><b>Statut</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoSegmentRouteAerienneStatut}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statut</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoSegmentRouteAerienneStatut
	 * @see #isSetStatut()
	 * @see #unsetStatut()
	 * @see #setStatut(TypeDictionaryDicoSegmentRouteAerienneStatut)
	 * @see mpia.schema.SchemaPackage#getTypeSegmentRouteAerienne_Statut()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Statut'"
	 * @generated
	 */
	TypeDictionaryDicoSegmentRouteAerienneStatut getStatut();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSegmentRouteAerienne#getStatut <em>Statut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statut</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoSegmentRouteAerienneStatut
	 * @see #isSetStatut()
	 * @see #unsetStatut()
	 * @see #getStatut()
	 * @generated
	 */
	void setStatut(TypeDictionaryDicoSegmentRouteAerienneStatut value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSegmentRouteAerienne#getStatut <em>Statut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStatut()
	 * @see #getStatut()
	 * @see #setStatut(TypeDictionaryDicoSegmentRouteAerienneStatut)
	 * @generated
	 */
	void unsetStatut();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSegmentRouteAerienne#getStatut <em>Statut</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Statut</em>' attribute is set.
	 * @see #unsetStatut()
	 * @see #getStatut()
	 * @see #setStatut(TypeDictionaryDicoSegmentRouteAerienneStatut)
	 * @generated
	 */
	boolean isSetStatut();

	/**
	 * Returns the value of the '<em><b>Capacite Necessaire</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoSegmentRouteAerienneCapaciteNecessaire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacite Necessaire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacite Necessaire</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoSegmentRouteAerienneCapaciteNecessaire
	 * @see #isSetCapaciteNecessaire()
	 * @see #unsetCapaciteNecessaire()
	 * @see #setCapaciteNecessaire(TypeDictionaryDicoSegmentRouteAerienneCapaciteNecessaire)
	 * @see mpia.schema.SchemaPackage#getTypeSegmentRouteAerienne_CapaciteNecessaire()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='CapaciteNecessaire'"
	 * @generated
	 */
	TypeDictionaryDicoSegmentRouteAerienneCapaciteNecessaire getCapaciteNecessaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSegmentRouteAerienne#getCapaciteNecessaire <em>Capacite Necessaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacite Necessaire</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoSegmentRouteAerienneCapaciteNecessaire
	 * @see #isSetCapaciteNecessaire()
	 * @see #unsetCapaciteNecessaire()
	 * @see #getCapaciteNecessaire()
	 * @generated
	 */
	void setCapaciteNecessaire(TypeDictionaryDicoSegmentRouteAerienneCapaciteNecessaire value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSegmentRouteAerienne#getCapaciteNecessaire <em>Capacite Necessaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCapaciteNecessaire()
	 * @see #getCapaciteNecessaire()
	 * @see #setCapaciteNecessaire(TypeDictionaryDicoSegmentRouteAerienneCapaciteNecessaire)
	 * @generated
	 */
	void unsetCapaciteNecessaire();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSegmentRouteAerienne#getCapaciteNecessaire <em>Capacite Necessaire</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Capacite Necessaire</em>' attribute is set.
	 * @see #unsetCapaciteNecessaire()
	 * @see #getCapaciteNecessaire()
	 * @see #setCapaciteNecessaire(TypeDictionaryDicoSegmentRouteAerienneCapaciteNecessaire)
	 * @generated
	 */
	boolean isSetCapaciteNecessaire();

	/**
	 * Returns the value of the '<em><b>Vitesse AMaintenir</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vitesse AMaintenir</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vitesse AMaintenir</em>' containment reference.
	 * @see #setVitesseAMaintenir(TypeDataTypeVitesseLineaire)
	 * @see mpia.schema.SchemaPackage#getTypeSegmentRouteAerienne_VitesseAMaintenir()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VitesseAMaintenir'"
	 * @generated
	 */
	TypeDataTypeVitesseLineaire getVitesseAMaintenir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSegmentRouteAerienne#getVitesseAMaintenir <em>Vitesse AMaintenir</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vitesse AMaintenir</em>' containment reference.
	 * @see #getVitesseAMaintenir()
	 * @generated
	 */
	void setVitesseAMaintenir(TypeDataTypeVitesseLineaire value);

} // TypeSegmentRouteAerienne
