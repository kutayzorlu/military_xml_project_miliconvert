/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeAngle;
import mpia.meta.TypeDataTypeLongueur;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Systeme Atterrissage Aux Instruments</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeSystemeAtterrissageAuxInstruments#getLargeurRayon <em>Largeur Rayon</em>}</li>
 *   <li>{@link mpia.schema.TypeSystemeAtterrissageAuxInstruments#getAngleAlignementDescente <em>Angle Alignement Descente</em>}</li>
 *   <li>{@link mpia.schema.TypeSystemeAtterrissageAuxInstruments#getAngleVariationMagnetique <em>Angle Variation Magnetique</em>}</li>
 *   <li>{@link mpia.schema.TypeSystemeAtterrissageAuxInstruments#getAngleCorrection <em>Angle Correction</em>}</li>
 *   <li>{@link mpia.schema.TypeSystemeAtterrissageAuxInstruments#getAngleAlignementPiste <em>Angle Alignement Piste</em>}</li>
 *   <li>{@link mpia.schema.TypeSystemeAtterrissageAuxInstruments#getHauteurCroisementSeuil <em>Hauteur Croisement Seuil</em>}</li>
 *   <li>{@link mpia.schema.TypeSystemeAtterrissageAuxInstruments#getDistanceRadiophare <em>Distance Radiophare</em>}</li>
 *   <li>{@link mpia.schema.TypeSystemeAtterrissageAuxInstruments#getDistanceAppareilMesure <em>Distance Appareil Mesure</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeSystemeAtterrissageAuxInstruments()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_SystemeAtterrissageAuxInstruments' kind='elementOnly'"
 * @generated
 */
public interface TypeSystemeAtterrissageAuxInstruments extends TypeMateriel {
	/**
	 * Returns the value of the '<em><b>Largeur Rayon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Largeur Rayon</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Largeur Rayon</em>' containment reference.
	 * @see #setLargeurRayon(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeSystemeAtterrissageAuxInstruments_LargeurRayon()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LargeurRayon'"
	 * @generated
	 */
	TypeDataTypeLongueur getLargeurRayon();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSystemeAtterrissageAuxInstruments#getLargeurRayon <em>Largeur Rayon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Largeur Rayon</em>' containment reference.
	 * @see #getLargeurRayon()
	 * @generated
	 */
	void setLargeurRayon(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Angle Alignement Descente</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle Alignement Descente</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle Alignement Descente</em>' containment reference.
	 * @see #setAngleAlignementDescente(TypeDataTypeAngle)
	 * @see mpia.schema.SchemaPackage#getTypeSystemeAtterrissageAuxInstruments_AngleAlignementDescente()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AngleAlignementDescente'"
	 * @generated
	 */
	TypeDataTypeAngle getAngleAlignementDescente();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSystemeAtterrissageAuxInstruments#getAngleAlignementDescente <em>Angle Alignement Descente</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Alignement Descente</em>' containment reference.
	 * @see #getAngleAlignementDescente()
	 * @generated
	 */
	void setAngleAlignementDescente(TypeDataTypeAngle value);

	/**
	 * Returns the value of the '<em><b>Angle Variation Magnetique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle Variation Magnetique</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle Variation Magnetique</em>' containment reference.
	 * @see #setAngleVariationMagnetique(TypeDataTypeAngle)
	 * @see mpia.schema.SchemaPackage#getTypeSystemeAtterrissageAuxInstruments_AngleVariationMagnetique()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AngleVariationMagnetique'"
	 * @generated
	 */
	TypeDataTypeAngle getAngleVariationMagnetique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSystemeAtterrissageAuxInstruments#getAngleVariationMagnetique <em>Angle Variation Magnetique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Variation Magnetique</em>' containment reference.
	 * @see #getAngleVariationMagnetique()
	 * @generated
	 */
	void setAngleVariationMagnetique(TypeDataTypeAngle value);

	/**
	 * Returns the value of the '<em><b>Angle Correction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle Correction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle Correction</em>' containment reference.
	 * @see #setAngleCorrection(TypeDataTypeAngle)
	 * @see mpia.schema.SchemaPackage#getTypeSystemeAtterrissageAuxInstruments_AngleCorrection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AngleCorrection'"
	 * @generated
	 */
	TypeDataTypeAngle getAngleCorrection();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSystemeAtterrissageAuxInstruments#getAngleCorrection <em>Angle Correction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Correction</em>' containment reference.
	 * @see #getAngleCorrection()
	 * @generated
	 */
	void setAngleCorrection(TypeDataTypeAngle value);

	/**
	 * Returns the value of the '<em><b>Angle Alignement Piste</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle Alignement Piste</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle Alignement Piste</em>' containment reference.
	 * @see #setAngleAlignementPiste(TypeDataTypeAngle)
	 * @see mpia.schema.SchemaPackage#getTypeSystemeAtterrissageAuxInstruments_AngleAlignementPiste()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AngleAlignementPiste'"
	 * @generated
	 */
	TypeDataTypeAngle getAngleAlignementPiste();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSystemeAtterrissageAuxInstruments#getAngleAlignementPiste <em>Angle Alignement Piste</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Alignement Piste</em>' containment reference.
	 * @see #getAngleAlignementPiste()
	 * @generated
	 */
	void setAngleAlignementPiste(TypeDataTypeAngle value);

	/**
	 * Returns the value of the '<em><b>Hauteur Croisement Seuil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hauteur Croisement Seuil</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hauteur Croisement Seuil</em>' containment reference.
	 * @see #setHauteurCroisementSeuil(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeSystemeAtterrissageAuxInstruments_HauteurCroisementSeuil()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='HauteurCroisementSeuil'"
	 * @generated
	 */
	TypeDataTypeLongueur getHauteurCroisementSeuil();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSystemeAtterrissageAuxInstruments#getHauteurCroisementSeuil <em>Hauteur Croisement Seuil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hauteur Croisement Seuil</em>' containment reference.
	 * @see #getHauteurCroisementSeuil()
	 * @generated
	 */
	void setHauteurCroisementSeuil(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Distance Radiophare</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance Radiophare</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance Radiophare</em>' containment reference.
	 * @see #setDistanceRadiophare(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeSystemeAtterrissageAuxInstruments_DistanceRadiophare()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DistanceRadiophare'"
	 * @generated
	 */
	TypeDataTypeLongueur getDistanceRadiophare();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSystemeAtterrissageAuxInstruments#getDistanceRadiophare <em>Distance Radiophare</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance Radiophare</em>' containment reference.
	 * @see #getDistanceRadiophare()
	 * @generated
	 */
	void setDistanceRadiophare(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Distance Appareil Mesure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance Appareil Mesure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance Appareil Mesure</em>' containment reference.
	 * @see #setDistanceAppareilMesure(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeSystemeAtterrissageAuxInstruments_DistanceAppareilMesure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DistanceAppareilMesure'"
	 * @generated
	 */
	TypeDataTypeLongueur getDistanceAppareilMesure();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSystemeAtterrissageAuxInstruments#getDistanceAppareilMesure <em>Distance Appareil Mesure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance Appareil Mesure</em>' containment reference.
	 * @see #getDistanceAppareilMesure()
	 * @generated
	 */
	void setDistanceAppareilMesure(TypeDataTypeLongueur value);

} // TypeSystemeAtterrissageAuxInstruments
