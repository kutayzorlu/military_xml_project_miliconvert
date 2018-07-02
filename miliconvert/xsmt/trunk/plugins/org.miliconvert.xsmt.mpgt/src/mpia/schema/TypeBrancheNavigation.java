/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeAngle;
import mpia.meta.TypeDataTypeDuree;
import mpia.meta.TypeDataTypeLongueur;
import mpia.meta.TypeDataTypeVitesseLineaire;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Branche Navigation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeBrancheNavigation#getVitesseMoyenne <em>Vitesse Moyenne</em>}</li>
 *   <li>{@link mpia.schema.TypeBrancheNavigation#getTypeVol <em>Type Vol</em>}</li>
 *   <li>{@link mpia.schema.TypeBrancheNavigation#getLongueur <em>Longueur</em>}</li>
 *   <li>{@link mpia.schema.TypeBrancheNavigation#getPenteDecollageReelle <em>Pente Decollage Reelle</em>}</li>
 *   <li>{@link mpia.schema.TypeBrancheNavigation#getPenteAtterrissageReelle <em>Pente Atterrissage Reelle</em>}</li>
 *   <li>{@link mpia.schema.TypeBrancheNavigation#getTauxMonteeReel <em>Taux Montee Reel</em>}</li>
 *   <li>{@link mpia.schema.TypeBrancheNavigation#getTauxChuteReel <em>Taux Chute Reel</em>}</li>
 *   <li>{@link mpia.schema.TypeBrancheNavigation#getVitesse <em>Vitesse</em>}</li>
 *   <li>{@link mpia.schema.TypeBrancheNavigation#getDistanceCumulee <em>Distance Cumulee</em>}</li>
 *   <li>{@link mpia.schema.TypeBrancheNavigation#getDureePrevue <em>Duree Prevue</em>}</li>
 *   <li>{@link mpia.schema.TypeBrancheNavigation#getDureePrevueRestant <em>Duree Prevue Restant</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeBrancheNavigation()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_BrancheNavigation' kind='elementOnly'"
 * @generated
 */
public interface TypeBrancheNavigation extends TypeElementControle {
	/**
	 * Returns the value of the '<em><b>Vitesse Moyenne</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vitesse Moyenne</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vitesse Moyenne</em>' attribute.
	 * @see #isSetVitesseMoyenne()
	 * @see #unsetVitesseMoyenne()
	 * @see #setVitesseMoyenne(double)
	 * @see mpia.schema.SchemaPackage#getTypeBrancheNavigation_VitesseMoyenne()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='VitesseMoyenne'"
	 * @generated
	 */
	double getVitesseMoyenne();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBrancheNavigation#getVitesseMoyenne <em>Vitesse Moyenne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vitesse Moyenne</em>' attribute.
	 * @see #isSetVitesseMoyenne()
	 * @see #unsetVitesseMoyenne()
	 * @see #getVitesseMoyenne()
	 * @generated
	 */
	void setVitesseMoyenne(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeBrancheNavigation#getVitesseMoyenne <em>Vitesse Moyenne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVitesseMoyenne()
	 * @see #getVitesseMoyenne()
	 * @see #setVitesseMoyenne(double)
	 * @generated
	 */
	void unsetVitesseMoyenne();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeBrancheNavigation#getVitesseMoyenne <em>Vitesse Moyenne</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vitesse Moyenne</em>' attribute is set.
	 * @see #unsetVitesseMoyenne()
	 * @see #getVitesseMoyenne()
	 * @see #setVitesseMoyenne(double)
	 * @generated
	 */
	boolean isSetVitesseMoyenne();

	/**
	 * Returns the value of the '<em><b>Type Vol</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeVol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Vol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Vol</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeVol
	 * @see #isSetTypeVol()
	 * @see #unsetTypeVol()
	 * @see #setTypeVol(TypeDictionaryDicoTypeVol)
	 * @see mpia.schema.SchemaPackage#getTypeBrancheNavigation_TypeVol()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='TypeVol'"
	 * @generated
	 */
	TypeDictionaryDicoTypeVol getTypeVol();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBrancheNavigation#getTypeVol <em>Type Vol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Vol</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeVol
	 * @see #isSetTypeVol()
	 * @see #unsetTypeVol()
	 * @see #getTypeVol()
	 * @generated
	 */
	void setTypeVol(TypeDictionaryDicoTypeVol value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeBrancheNavigation#getTypeVol <em>Type Vol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeVol()
	 * @see #getTypeVol()
	 * @see #setTypeVol(TypeDictionaryDicoTypeVol)
	 * @generated
	 */
	void unsetTypeVol();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeBrancheNavigation#getTypeVol <em>Type Vol</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Vol</em>' attribute is set.
	 * @see #unsetTypeVol()
	 * @see #getTypeVol()
	 * @see #setTypeVol(TypeDictionaryDicoTypeVol)
	 * @generated
	 */
	boolean isSetTypeVol();

	/**
	 * Returns the value of the '<em><b>Longueur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Longueur</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longueur</em>' containment reference.
	 * @see #setLongueur(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeBrancheNavigation_Longueur()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Longueur'"
	 * @generated
	 */
	TypeDataTypeLongueur getLongueur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBrancheNavigation#getLongueur <em>Longueur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longueur</em>' containment reference.
	 * @see #getLongueur()
	 * @generated
	 */
	void setLongueur(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Pente Decollage Reelle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pente Decollage Reelle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pente Decollage Reelle</em>' containment reference.
	 * @see #setPenteDecollageReelle(TypeDataTypeAngle)
	 * @see mpia.schema.SchemaPackage#getTypeBrancheNavigation_PenteDecollageReelle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PenteDecollageReelle'"
	 * @generated
	 */
	TypeDataTypeAngle getPenteDecollageReelle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBrancheNavigation#getPenteDecollageReelle <em>Pente Decollage Reelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pente Decollage Reelle</em>' containment reference.
	 * @see #getPenteDecollageReelle()
	 * @generated
	 */
	void setPenteDecollageReelle(TypeDataTypeAngle value);

	/**
	 * Returns the value of the '<em><b>Pente Atterrissage Reelle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pente Atterrissage Reelle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pente Atterrissage Reelle</em>' containment reference.
	 * @see #setPenteAtterrissageReelle(TypeDataTypeAngle)
	 * @see mpia.schema.SchemaPackage#getTypeBrancheNavigation_PenteAtterrissageReelle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PenteAtterrissageReelle'"
	 * @generated
	 */
	TypeDataTypeAngle getPenteAtterrissageReelle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBrancheNavigation#getPenteAtterrissageReelle <em>Pente Atterrissage Reelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pente Atterrissage Reelle</em>' containment reference.
	 * @see #getPenteAtterrissageReelle()
	 * @generated
	 */
	void setPenteAtterrissageReelle(TypeDataTypeAngle value);

	/**
	 * Returns the value of the '<em><b>Taux Montee Reel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Taux Montee Reel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taux Montee Reel</em>' containment reference.
	 * @see #setTauxMonteeReel(TypeDataTypeVitesseLineaire)
	 * @see mpia.schema.SchemaPackage#getTypeBrancheNavigation_TauxMonteeReel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TauxMonteeReel'"
	 * @generated
	 */
	TypeDataTypeVitesseLineaire getTauxMonteeReel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBrancheNavigation#getTauxMonteeReel <em>Taux Montee Reel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taux Montee Reel</em>' containment reference.
	 * @see #getTauxMonteeReel()
	 * @generated
	 */
	void setTauxMonteeReel(TypeDataTypeVitesseLineaire value);

	/**
	 * Returns the value of the '<em><b>Taux Chute Reel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Taux Chute Reel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taux Chute Reel</em>' containment reference.
	 * @see #setTauxChuteReel(TypeDataTypeVitesseLineaire)
	 * @see mpia.schema.SchemaPackage#getTypeBrancheNavigation_TauxChuteReel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TauxChuteReel'"
	 * @generated
	 */
	TypeDataTypeVitesseLineaire getTauxChuteReel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBrancheNavigation#getTauxChuteReel <em>Taux Chute Reel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taux Chute Reel</em>' containment reference.
	 * @see #getTauxChuteReel()
	 * @generated
	 */
	void setTauxChuteReel(TypeDataTypeVitesseLineaire value);

	/**
	 * Returns the value of the '<em><b>Vitesse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vitesse</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vitesse</em>' containment reference.
	 * @see #setVitesse(TypeDataTypeVitesseLineaire)
	 * @see mpia.schema.SchemaPackage#getTypeBrancheNavigation_Vitesse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Vitesse'"
	 * @generated
	 */
	TypeDataTypeVitesseLineaire getVitesse();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBrancheNavigation#getVitesse <em>Vitesse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vitesse</em>' containment reference.
	 * @see #getVitesse()
	 * @generated
	 */
	void setVitesse(TypeDataTypeVitesseLineaire value);

	/**
	 * Returns the value of the '<em><b>Distance Cumulee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance Cumulee</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance Cumulee</em>' containment reference.
	 * @see #setDistanceCumulee(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeBrancheNavigation_DistanceCumulee()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DistanceCumulee'"
	 * @generated
	 */
	TypeDataTypeLongueur getDistanceCumulee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBrancheNavigation#getDistanceCumulee <em>Distance Cumulee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance Cumulee</em>' containment reference.
	 * @see #getDistanceCumulee()
	 * @generated
	 */
	void setDistanceCumulee(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Duree Prevue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duree Prevue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duree Prevue</em>' containment reference.
	 * @see #setDureePrevue(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeBrancheNavigation_DureePrevue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DureePrevue'"
	 * @generated
	 */
	TypeDataTypeDuree getDureePrevue();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBrancheNavigation#getDureePrevue <em>Duree Prevue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duree Prevue</em>' containment reference.
	 * @see #getDureePrevue()
	 * @generated
	 */
	void setDureePrevue(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>Duree Prevue Restant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duree Prevue Restant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duree Prevue Restant</em>' containment reference.
	 * @see #setDureePrevueRestant(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeBrancheNavigation_DureePrevueRestant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DureePrevueRestant'"
	 * @generated
	 */
	TypeDataTypeDuree getDureePrevueRestant();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBrancheNavigation#getDureePrevueRestant <em>Duree Prevue Restant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duree Prevue Restant</em>' containment reference.
	 * @see #getDureePrevueRestant()
	 * @generated
	 */
	void setDureePrevueRestant(TypeDataTypeDuree value);

} // TypeBrancheNavigation
