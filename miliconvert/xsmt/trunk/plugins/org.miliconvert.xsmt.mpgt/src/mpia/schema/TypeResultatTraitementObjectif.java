/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Resultat Traitement Objectif</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeResultatTraitementObjectif#getDescriptionEleme <em>Description Eleme</em>}</li>
 *   <li>{@link mpia.schema.TypeResultatTraitementObjectif#getDescriptionTypeEquipement <em>Description Type Equipement</em>}</li>
 *   <li>{@link mpia.schema.TypeResultatTraitementObjectif#getNombreEquipementsDetruits <em>Nombre Equipements Detruits</em>}</li>
 *   <li>{@link mpia.schema.TypeResultatTraitementObjectif#getPourcentagePerte <em>Pourcentage Perte</em>}</li>
 *   <li>{@link mpia.schema.TypeResultatTraitementObjectif#getEffetConstate <em>Effet Constate</em>}</li>
 *   <li>{@link mpia.schema.TypeResultatTraitementObjectif#isConfirmationImage <em>Confirmation Image</em>}</li>
 *   <li>{@link mpia.schema.TypeResultatTraitementObjectif#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.TypeResultatTraitementObjectif#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeResultatTraitementObjectif#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeResultatTraitementObjectif#getAPourMunitionsConsommeesSurPointMunitionsConsommeesSurPoint <em>APour Munitions Consommees Sur Point Munitions Consommees Sur Point</em>}</li>
 *   <li>{@link mpia.schema.TypeResultatTraitementObjectif#getAObserveObservation <em>AObserve Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeResultatTraitementObjectif()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ResultatTraitementObjectif' kind='elementOnly'"
 * @generated
 */
public interface TypeResultatTraitementObjectif extends EObject {
	/**
	 * Returns the value of the '<em><b>Description Eleme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description Eleme</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Eleme</em>' attribute.
	 * @see #setDescriptionEleme(String)
	 * @see mpia.schema.SchemaPackage#getTypeResultatTraitementObjectif_DescriptionEleme()
	 * @model dataType="mpia.meta.TypeDataTypeChaine020"
	 *        extendedMetaData="kind='element' name='DescriptionEleme'"
	 * @generated
	 */
	String getDescriptionEleme();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeResultatTraitementObjectif#getDescriptionEleme <em>Description Eleme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Eleme</em>' attribute.
	 * @see #getDescriptionEleme()
	 * @generated
	 */
	void setDescriptionEleme(String value);

	/**
	 * Returns the value of the '<em><b>Description Type Equipement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description Type Equipement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Type Equipement</em>' attribute.
	 * @see #setDescriptionTypeEquipement(String)
	 * @see mpia.schema.SchemaPackage#getTypeResultatTraitementObjectif_DescriptionTypeEquipement()
	 * @model dataType="mpia.meta.TypeDataTypeChaine020"
	 *        extendedMetaData="kind='element' name='DescriptionTypeEquipement'"
	 * @generated
	 */
	String getDescriptionTypeEquipement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeResultatTraitementObjectif#getDescriptionTypeEquipement <em>Description Type Equipement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Type Equipement</em>' attribute.
	 * @see #getDescriptionTypeEquipement()
	 * @generated
	 */
	void setDescriptionTypeEquipement(String value);

	/**
	 * Returns the value of the '<em><b>Nombre Equipements Detruits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Equipements Detruits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Equipements Detruits</em>' attribute.
	 * @see #isSetNombreEquipementsDetruits()
	 * @see #unsetNombreEquipementsDetruits()
	 * @see #setNombreEquipementsDetruits(long)
	 * @see mpia.schema.SchemaPackage#getTypeResultatTraitementObjectif_NombreEquipementsDetruits()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NombreEquipementsDetruits'"
	 * @generated
	 */
	long getNombreEquipementsDetruits();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeResultatTraitementObjectif#getNombreEquipementsDetruits <em>Nombre Equipements Detruits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Equipements Detruits</em>' attribute.
	 * @see #isSetNombreEquipementsDetruits()
	 * @see #unsetNombreEquipementsDetruits()
	 * @see #getNombreEquipementsDetruits()
	 * @generated
	 */
	void setNombreEquipementsDetruits(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeResultatTraitementObjectif#getNombreEquipementsDetruits <em>Nombre Equipements Detruits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreEquipementsDetruits()
	 * @see #getNombreEquipementsDetruits()
	 * @see #setNombreEquipementsDetruits(long)
	 * @generated
	 */
	void unsetNombreEquipementsDetruits();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeResultatTraitementObjectif#getNombreEquipementsDetruits <em>Nombre Equipements Detruits</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Equipements Detruits</em>' attribute is set.
	 * @see #unsetNombreEquipementsDetruits()
	 * @see #getNombreEquipementsDetruits()
	 * @see #setNombreEquipementsDetruits(long)
	 * @generated
	 */
	boolean isSetNombreEquipementsDetruits();

	/**
	 * Returns the value of the '<em><b>Pourcentage Perte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pourcentage Perte</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pourcentage Perte</em>' attribute.
	 * @see #isSetPourcentagePerte()
	 * @see #unsetPourcentagePerte()
	 * @see #setPourcentagePerte(long)
	 * @see mpia.schema.SchemaPackage#getTypeResultatTraitementObjectif_PourcentagePerte()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='PourcentagePerte'"
	 * @generated
	 */
	long getPourcentagePerte();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeResultatTraitementObjectif#getPourcentagePerte <em>Pourcentage Perte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pourcentage Perte</em>' attribute.
	 * @see #isSetPourcentagePerte()
	 * @see #unsetPourcentagePerte()
	 * @see #getPourcentagePerte()
	 * @generated
	 */
	void setPourcentagePerte(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeResultatTraitementObjectif#getPourcentagePerte <em>Pourcentage Perte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPourcentagePerte()
	 * @see #getPourcentagePerte()
	 * @see #setPourcentagePerte(long)
	 * @generated
	 */
	void unsetPourcentagePerte();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeResultatTraitementObjectif#getPourcentagePerte <em>Pourcentage Perte</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pourcentage Perte</em>' attribute is set.
	 * @see #unsetPourcentagePerte()
	 * @see #getPourcentagePerte()
	 * @see #setPourcentagePerte(long)
	 * @generated
	 */
	boolean isSetPourcentagePerte();

	/**
	 * Returns the value of the '<em><b>Effet Constate</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoResultatTraitementObjectifEffetConstate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effet Constate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effet Constate</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoResultatTraitementObjectifEffetConstate
	 * @see #isSetEffetConstate()
	 * @see #unsetEffetConstate()
	 * @see #setEffetConstate(TypeDictionaryDicoResultatTraitementObjectifEffetConstate)
	 * @see mpia.schema.SchemaPackage#getTypeResultatTraitementObjectif_EffetConstate()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EffetConstate'"
	 * @generated
	 */
	TypeDictionaryDicoResultatTraitementObjectifEffetConstate getEffetConstate();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeResultatTraitementObjectif#getEffetConstate <em>Effet Constate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effet Constate</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoResultatTraitementObjectifEffetConstate
	 * @see #isSetEffetConstate()
	 * @see #unsetEffetConstate()
	 * @see #getEffetConstate()
	 * @generated
	 */
	void setEffetConstate(TypeDictionaryDicoResultatTraitementObjectifEffetConstate value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeResultatTraitementObjectif#getEffetConstate <em>Effet Constate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEffetConstate()
	 * @see #getEffetConstate()
	 * @see #setEffetConstate(TypeDictionaryDicoResultatTraitementObjectifEffetConstate)
	 * @generated
	 */
	void unsetEffetConstate();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeResultatTraitementObjectif#getEffetConstate <em>Effet Constate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Effet Constate</em>' attribute is set.
	 * @see #unsetEffetConstate()
	 * @see #getEffetConstate()
	 * @see #setEffetConstate(TypeDictionaryDicoResultatTraitementObjectifEffetConstate)
	 * @generated
	 */
	boolean isSetEffetConstate();

	/**
	 * Returns the value of the '<em><b>Confirmation Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confirmation Image</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confirmation Image</em>' attribute.
	 * @see #isSetConfirmationImage()
	 * @see #unsetConfirmationImage()
	 * @see #setConfirmationImage(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeResultatTraitementObjectif_ConfirmationImage()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='ConfirmationImage'"
	 * @generated
	 */
	boolean isConfirmationImage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeResultatTraitementObjectif#isConfirmationImage <em>Confirmation Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confirmation Image</em>' attribute.
	 * @see #isSetConfirmationImage()
	 * @see #unsetConfirmationImage()
	 * @see #isConfirmationImage()
	 * @generated
	 */
	void setConfirmationImage(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeResultatTraitementObjectif#isConfirmationImage <em>Confirmation Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConfirmationImage()
	 * @see #isConfirmationImage()
	 * @see #setConfirmationImage(boolean)
	 * @generated
	 */
	void unsetConfirmationImage();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeResultatTraitementObjectif#isConfirmationImage <em>Confirmation Image</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Confirmation Image</em>' attribute is set.
	 * @see #unsetConfirmationImage()
	 * @see #isConfirmationImage()
	 * @see #setConfirmationImage(boolean)
	 * @generated
	 */
	boolean isSetConfirmationImage();

	/**
	 * Returns the value of the '<em><b>Commentaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commentaire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commentaire</em>' attribute.
	 * @see #setCommentaire(String)
	 * @see mpia.schema.SchemaPackage#getTypeResultatTraitementObjectif_Commentaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='Commentaire'"
	 * @generated
	 */
	String getCommentaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeResultatTraitementObjectif#getCommentaire <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commentaire</em>' attribute.
	 * @see #getCommentaire()
	 * @generated
	 */
	void setCommentaire(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeResultatTraitementObjectif_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeResultatTraitementObjectif#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeResultatTraitementObjectif_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeResultatTraitementObjectif#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Munitions Consommees Sur Point Munitions Consommees Sur Point</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMunitionsConsommeesSurPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Munitions Consommees Sur Point Munitions Consommees Sur Point</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Munitions Consommees Sur Point Munitions Consommees Sur Point</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeResultatTraitementObjectif_APourMunitionsConsommeesSurPointMunitionsConsommeesSurPoint()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_MunitionsConsommeesSurPoint'"
	 *        extendedMetaData="kind='element' name='APourMunitionsConsommeesSurPoint_MunitionsConsommeesSurPoint'"
	 * @generated
	 */
	EList<TypeMunitionsConsommeesSurPoint> getAPourMunitionsConsommeesSurPointMunitionsConsommeesSurPoint();

	/**
	 * Returns the value of the '<em><b>AObserve Observation</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AObserve Observation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AObserve Observation</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeResultatTraitementObjectif_AObserveObservation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Observation'"
	 *        extendedMetaData="kind='element' name='AObserve_Observation'"
	 * @generated
	 */
	EList<TypeAssociation> getAObserveObservation();

} // TypeResultatTraitementObjectif
