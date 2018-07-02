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
 * A representation of the model object '<em><b>Type Menace Detection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMenaceDetection#getTypeCapteur <em>Type Capteur</em>}</li>
 *   <li>{@link mpia.schema.TypeMenaceDetection#getTypeCapteurNonRepertorie <em>Type Capteur Non Repertorie</em>}</li>
 *   <li>{@link mpia.schema.TypeMenaceDetection#getNatureDetection <em>Nature Detection</em>}</li>
 *   <li>{@link mpia.schema.TypeMenaceDetection#getNatureDetectionNonRepertoriee <em>Nature Detection Non Repertoriee</em>}</li>
 *   <li>{@link mpia.schema.TypeMenaceDetection#getNombreCapteurs <em>Nombre Capteurs</em>}</li>
 *   <li>{@link mpia.schema.TypeMenaceDetection#getComplementEventuel <em>Complement Eventuel</em>}</li>
 *   <li>{@link mpia.schema.TypeMenaceDetection#getAPourZoneCouvertureAutreElementControle <em>APour Zone Couverture Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeMenaceDetection#getAPourZoneDeploiementAutreElementControle <em>APour Zone Deploiement Autre Element Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMenaceDetection()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_MenaceDetection' kind='elementOnly'"
 * @generated
 */
public interface TypeMenaceDetection extends TypeMenace {
	/**
	 * Returns the value of the '<em><b>Type Capteur</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMenaceDetectionTypeCapteur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Capteur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Capteur</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMenaceDetectionTypeCapteur
	 * @see #isSetTypeCapteur()
	 * @see #unsetTypeCapteur()
	 * @see #setTypeCapteur(TypeDictionaryDicoMenaceDetectionTypeCapteur)
	 * @see mpia.schema.SchemaPackage#getTypeMenaceDetection_TypeCapteur()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='TypeCapteur'"
	 * @generated
	 */
	TypeDictionaryDicoMenaceDetectionTypeCapteur getTypeCapteur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMenaceDetection#getTypeCapteur <em>Type Capteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Capteur</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMenaceDetectionTypeCapteur
	 * @see #isSetTypeCapteur()
	 * @see #unsetTypeCapteur()
	 * @see #getTypeCapteur()
	 * @generated
	 */
	void setTypeCapteur(TypeDictionaryDicoMenaceDetectionTypeCapteur value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMenaceDetection#getTypeCapteur <em>Type Capteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeCapteur()
	 * @see #getTypeCapteur()
	 * @see #setTypeCapteur(TypeDictionaryDicoMenaceDetectionTypeCapteur)
	 * @generated
	 */
	void unsetTypeCapteur();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMenaceDetection#getTypeCapteur <em>Type Capteur</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Capteur</em>' attribute is set.
	 * @see #unsetTypeCapteur()
	 * @see #getTypeCapteur()
	 * @see #setTypeCapteur(TypeDictionaryDicoMenaceDetectionTypeCapteur)
	 * @generated
	 */
	boolean isSetTypeCapteur();

	/**
	 * Returns the value of the '<em><b>Type Capteur Non Repertorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Capteur Non Repertorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Capteur Non Repertorie</em>' attribute.
	 * @see #setTypeCapteurNonRepertorie(String)
	 * @see mpia.schema.SchemaPackage#getTypeMenaceDetection_TypeCapteurNonRepertorie()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='TypeCapteurNonRepertorie'"
	 * @generated
	 */
	String getTypeCapteurNonRepertorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMenaceDetection#getTypeCapteurNonRepertorie <em>Type Capteur Non Repertorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Capteur Non Repertorie</em>' attribute.
	 * @see #getTypeCapteurNonRepertorie()
	 * @generated
	 */
	void setTypeCapteurNonRepertorie(String value);

	/**
	 * Returns the value of the '<em><b>Nature Detection</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMenaceDetectionNatureDetection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nature Detection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nature Detection</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMenaceDetectionNatureDetection
	 * @see #isSetNatureDetection()
	 * @see #unsetNatureDetection()
	 * @see #setNatureDetection(TypeDictionaryDicoMenaceDetectionNatureDetection)
	 * @see mpia.schema.SchemaPackage#getTypeMenaceDetection_NatureDetection()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='NatureDetection'"
	 * @generated
	 */
	TypeDictionaryDicoMenaceDetectionNatureDetection getNatureDetection();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMenaceDetection#getNatureDetection <em>Nature Detection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nature Detection</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMenaceDetectionNatureDetection
	 * @see #isSetNatureDetection()
	 * @see #unsetNatureDetection()
	 * @see #getNatureDetection()
	 * @generated
	 */
	void setNatureDetection(TypeDictionaryDicoMenaceDetectionNatureDetection value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMenaceDetection#getNatureDetection <em>Nature Detection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNatureDetection()
	 * @see #getNatureDetection()
	 * @see #setNatureDetection(TypeDictionaryDicoMenaceDetectionNatureDetection)
	 * @generated
	 */
	void unsetNatureDetection();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMenaceDetection#getNatureDetection <em>Nature Detection</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nature Detection</em>' attribute is set.
	 * @see #unsetNatureDetection()
	 * @see #getNatureDetection()
	 * @see #setNatureDetection(TypeDictionaryDicoMenaceDetectionNatureDetection)
	 * @generated
	 */
	boolean isSetNatureDetection();

	/**
	 * Returns the value of the '<em><b>Nature Detection Non Repertoriee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nature Detection Non Repertoriee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nature Detection Non Repertoriee</em>' attribute.
	 * @see #setNatureDetectionNonRepertoriee(String)
	 * @see mpia.schema.SchemaPackage#getTypeMenaceDetection_NatureDetectionNonRepertoriee()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='NatureDetectionNonRepertoriee'"
	 * @generated
	 */
	String getNatureDetectionNonRepertoriee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMenaceDetection#getNatureDetectionNonRepertoriee <em>Nature Detection Non Repertoriee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nature Detection Non Repertoriee</em>' attribute.
	 * @see #getNatureDetectionNonRepertoriee()
	 * @generated
	 */
	void setNatureDetectionNonRepertoriee(String value);

	/**
	 * Returns the value of the '<em><b>Nombre Capteurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Capteurs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Capteurs</em>' attribute.
	 * @see #isSetNombreCapteurs()
	 * @see #unsetNombreCapteurs()
	 * @see #setNombreCapteurs(long)
	 * @see mpia.schema.SchemaPackage#getTypeMenaceDetection_NombreCapteurs()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NombreCapteurs'"
	 * @generated
	 */
	long getNombreCapteurs();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMenaceDetection#getNombreCapteurs <em>Nombre Capteurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Capteurs</em>' attribute.
	 * @see #isSetNombreCapteurs()
	 * @see #unsetNombreCapteurs()
	 * @see #getNombreCapteurs()
	 * @generated
	 */
	void setNombreCapteurs(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMenaceDetection#getNombreCapteurs <em>Nombre Capteurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreCapteurs()
	 * @see #getNombreCapteurs()
	 * @see #setNombreCapteurs(long)
	 * @generated
	 */
	void unsetNombreCapteurs();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMenaceDetection#getNombreCapteurs <em>Nombre Capteurs</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Capteurs</em>' attribute is set.
	 * @see #unsetNombreCapteurs()
	 * @see #getNombreCapteurs()
	 * @see #setNombreCapteurs(long)
	 * @generated
	 */
	boolean isSetNombreCapteurs();

	/**
	 * Returns the value of the '<em><b>Complement Eventuel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complement Eventuel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complement Eventuel</em>' attribute.
	 * @see #setComplementEventuel(String)
	 * @see mpia.schema.SchemaPackage#getTypeMenaceDetection_ComplementEventuel()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='ComplementEventuel'"
	 * @generated
	 */
	String getComplementEventuel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMenaceDetection#getComplementEventuel <em>Complement Eventuel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complement Eventuel</em>' attribute.
	 * @see #getComplementEventuel()
	 * @generated
	 */
	void setComplementEventuel(String value);

	/**
	 * Returns the value of the '<em><b>APour Zone Couverture Autre Element Controle</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Zone Couverture Autre Element Controle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Zone Couverture Autre Element Controle</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMenaceDetection_APourZoneCouvertureAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourZoneCouverture_AutreElementControle'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourZoneCouvertureAutreElementControle();

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
	 * @see mpia.schema.SchemaPackage#getTypeMenaceDetection_APourZoneDeploiementAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourZoneDeploiement_AutreElementControle'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourZoneDeploiementAutreElementControle();

} // TypeMenaceDetection
