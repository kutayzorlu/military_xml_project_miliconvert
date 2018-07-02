/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeChampMagnetique;
import mpia.meta.TypeDataTypeLongueur;
import mpia.meta.TypeDataTypeVolume;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Type Batiment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeTypeBatiment#getTirantEau <em>Tirant Eau</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeBatiment#getChargeEnLourd <em>Charge En Lourd</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeBatiment#getVitesseMaximale <em>Vitesse Maximale</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeBatiment#getNombreHelices <em>Nombre Helices</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeBatiment#getPropulsion <em>Propulsion</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeBatiment#getDeplacementOperationnel <em>Deplacement Operationnel</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeBatiment#getJaugeBrute <em>Jauge Brute</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeBatiment#getHauteurAuDessusLigneFlottaison <em>Hauteur Au Dessus Ligne Flottaison</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeBatiment#getNiveauAcoustique <em>Niveau Acoustique</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeBatiment#getChampMagnetiqueVertical <em>Champ Magnetique Vertical</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeBatiment#getPrismaticCoefficient <em>Prismatic Coefficient</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeBatiment#getComplements <em>Complements</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeTypeBatiment()
 * @model abstract="true"
 *        extendedMetaData="name='type_TypeBatiment' kind='elementOnly'"
 * @generated
 */
public interface TypeTypeBatiment extends TypeTypeEquipement {
	/**
	 * Returns the value of the '<em><b>Tirant Eau</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tirant Eau</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tirant Eau</em>' containment reference.
	 * @see #setTirantEau(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeTypeBatiment_TirantEau()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TirantEau'"
	 * @generated
	 */
	TypeDataTypeLongueur getTirantEau();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeBatiment#getTirantEau <em>Tirant Eau</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tirant Eau</em>' containment reference.
	 * @see #getTirantEau()
	 * @generated
	 */
	void setTirantEau(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Charge En Lourd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charge En Lourd</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charge En Lourd</em>' attribute.
	 * @see #isSetChargeEnLourd()
	 * @see #unsetChargeEnLourd()
	 * @see #setChargeEnLourd(long)
	 * @see mpia.schema.SchemaPackage#getTypeTypeBatiment_ChargeEnLourd()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='ChargeEnLourd'"
	 * @generated
	 */
	long getChargeEnLourd();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeBatiment#getChargeEnLourd <em>Charge En Lourd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charge En Lourd</em>' attribute.
	 * @see #isSetChargeEnLourd()
	 * @see #unsetChargeEnLourd()
	 * @see #getChargeEnLourd()
	 * @generated
	 */
	void setChargeEnLourd(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeBatiment#getChargeEnLourd <em>Charge En Lourd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetChargeEnLourd()
	 * @see #getChargeEnLourd()
	 * @see #setChargeEnLourd(long)
	 * @generated
	 */
	void unsetChargeEnLourd();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeBatiment#getChargeEnLourd <em>Charge En Lourd</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Charge En Lourd</em>' attribute is set.
	 * @see #unsetChargeEnLourd()
	 * @see #getChargeEnLourd()
	 * @see #setChargeEnLourd(long)
	 * @generated
	 */
	boolean isSetChargeEnLourd();

	/**
	 * Returns the value of the '<em><b>Vitesse Maximale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vitesse Maximale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vitesse Maximale</em>' attribute.
	 * @see #isSetVitesseMaximale()
	 * @see #unsetVitesseMaximale()
	 * @see #setVitesseMaximale(double)
	 * @see mpia.schema.SchemaPackage#getTypeTypeBatiment_VitesseMaximale()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='VitesseMaximale'"
	 * @generated
	 */
	double getVitesseMaximale();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeBatiment#getVitesseMaximale <em>Vitesse Maximale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vitesse Maximale</em>' attribute.
	 * @see #isSetVitesseMaximale()
	 * @see #unsetVitesseMaximale()
	 * @see #getVitesseMaximale()
	 * @generated
	 */
	void setVitesseMaximale(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeBatiment#getVitesseMaximale <em>Vitesse Maximale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVitesseMaximale()
	 * @see #getVitesseMaximale()
	 * @see #setVitesseMaximale(double)
	 * @generated
	 */
	void unsetVitesseMaximale();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeBatiment#getVitesseMaximale <em>Vitesse Maximale</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vitesse Maximale</em>' attribute is set.
	 * @see #unsetVitesseMaximale()
	 * @see #getVitesseMaximale()
	 * @see #setVitesseMaximale(double)
	 * @generated
	 */
	boolean isSetVitesseMaximale();

	/**
	 * Returns the value of the '<em><b>Nombre Helices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Helices</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Helices</em>' attribute.
	 * @see #isSetNombreHelices()
	 * @see #unsetNombreHelices()
	 * @see #setNombreHelices(long)
	 * @see mpia.schema.SchemaPackage#getTypeTypeBatiment_NombreHelices()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NombreHelices'"
	 * @generated
	 */
	long getNombreHelices();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeBatiment#getNombreHelices <em>Nombre Helices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Helices</em>' attribute.
	 * @see #isSetNombreHelices()
	 * @see #unsetNombreHelices()
	 * @see #getNombreHelices()
	 * @generated
	 */
	void setNombreHelices(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeBatiment#getNombreHelices <em>Nombre Helices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreHelices()
	 * @see #getNombreHelices()
	 * @see #setNombreHelices(long)
	 * @generated
	 */
	void unsetNombreHelices();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeBatiment#getNombreHelices <em>Nombre Helices</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Helices</em>' attribute is set.
	 * @see #unsetNombreHelices()
	 * @see #getNombreHelices()
	 * @see #setNombreHelices(long)
	 * @generated
	 */
	boolean isSetNombreHelices();

	/**
	 * Returns the value of the '<em><b>Propulsion</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeBatimentPropulsion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Propulsion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Propulsion</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeBatimentPropulsion
	 * @see #isSetPropulsion()
	 * @see #unsetPropulsion()
	 * @see #setPropulsion(TypeDictionaryDicoTypeBatimentPropulsion)
	 * @see mpia.schema.SchemaPackage#getTypeTypeBatiment_Propulsion()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Propulsion'"
	 * @generated
	 */
	TypeDictionaryDicoTypeBatimentPropulsion getPropulsion();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeBatiment#getPropulsion <em>Propulsion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Propulsion</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeBatimentPropulsion
	 * @see #isSetPropulsion()
	 * @see #unsetPropulsion()
	 * @see #getPropulsion()
	 * @generated
	 */
	void setPropulsion(TypeDictionaryDicoTypeBatimentPropulsion value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeBatiment#getPropulsion <em>Propulsion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPropulsion()
	 * @see #getPropulsion()
	 * @see #setPropulsion(TypeDictionaryDicoTypeBatimentPropulsion)
	 * @generated
	 */
	void unsetPropulsion();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeBatiment#getPropulsion <em>Propulsion</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Propulsion</em>' attribute is set.
	 * @see #unsetPropulsion()
	 * @see #getPropulsion()
	 * @see #setPropulsion(TypeDictionaryDicoTypeBatimentPropulsion)
	 * @generated
	 */
	boolean isSetPropulsion();

	/**
	 * Returns the value of the '<em><b>Deplacement Operationnel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deplacement Operationnel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deplacement Operationnel</em>' attribute.
	 * @see #isSetDeplacementOperationnel()
	 * @see #unsetDeplacementOperationnel()
	 * @see #setDeplacementOperationnel(long)
	 * @see mpia.schema.SchemaPackage#getTypeTypeBatiment_DeplacementOperationnel()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier9"
	 *        extendedMetaData="kind='element' name='DeplacementOperationnel'"
	 * @generated
	 */
	long getDeplacementOperationnel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeBatiment#getDeplacementOperationnel <em>Deplacement Operationnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deplacement Operationnel</em>' attribute.
	 * @see #isSetDeplacementOperationnel()
	 * @see #unsetDeplacementOperationnel()
	 * @see #getDeplacementOperationnel()
	 * @generated
	 */
	void setDeplacementOperationnel(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeBatiment#getDeplacementOperationnel <em>Deplacement Operationnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeplacementOperationnel()
	 * @see #getDeplacementOperationnel()
	 * @see #setDeplacementOperationnel(long)
	 * @generated
	 */
	void unsetDeplacementOperationnel();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeBatiment#getDeplacementOperationnel <em>Deplacement Operationnel</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Deplacement Operationnel</em>' attribute is set.
	 * @see #unsetDeplacementOperationnel()
	 * @see #getDeplacementOperationnel()
	 * @see #setDeplacementOperationnel(long)
	 * @generated
	 */
	boolean isSetDeplacementOperationnel();

	/**
	 * Returns the value of the '<em><b>Jauge Brute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jauge Brute</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jauge Brute</em>' containment reference.
	 * @see #setJaugeBrute(TypeDataTypeVolume)
	 * @see mpia.schema.SchemaPackage#getTypeTypeBatiment_JaugeBrute()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='JaugeBrute'"
	 * @generated
	 */
	TypeDataTypeVolume getJaugeBrute();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeBatiment#getJaugeBrute <em>Jauge Brute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jauge Brute</em>' containment reference.
	 * @see #getJaugeBrute()
	 * @generated
	 */
	void setJaugeBrute(TypeDataTypeVolume value);

	/**
	 * Returns the value of the '<em><b>Hauteur Au Dessus Ligne Flottaison</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hauteur Au Dessus Ligne Flottaison</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hauteur Au Dessus Ligne Flottaison</em>' containment reference.
	 * @see #setHauteurAuDessusLigneFlottaison(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeTypeBatiment_HauteurAuDessusLigneFlottaison()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='HauteurAuDessusLigneFlottaison'"
	 * @generated
	 */
	TypeDataTypeLongueur getHauteurAuDessusLigneFlottaison();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeBatiment#getHauteurAuDessusLigneFlottaison <em>Hauteur Au Dessus Ligne Flottaison</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hauteur Au Dessus Ligne Flottaison</em>' containment reference.
	 * @see #getHauteurAuDessusLigneFlottaison()
	 * @generated
	 */
	void setHauteurAuDessusLigneFlottaison(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Niveau Acoustique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Niveau Acoustique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau Acoustique</em>' attribute.
	 * @see #isSetNiveauAcoustique()
	 * @see #unsetNiveauAcoustique()
	 * @see #setNiveauAcoustique(long)
	 * @see mpia.schema.SchemaPackage#getTypeTypeBatiment_NiveauAcoustique()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NiveauAcoustique'"
	 * @generated
	 */
	long getNiveauAcoustique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeBatiment#getNiveauAcoustique <em>Niveau Acoustique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Niveau Acoustique</em>' attribute.
	 * @see #isSetNiveauAcoustique()
	 * @see #unsetNiveauAcoustique()
	 * @see #getNiveauAcoustique()
	 * @generated
	 */
	void setNiveauAcoustique(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeBatiment#getNiveauAcoustique <em>Niveau Acoustique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNiveauAcoustique()
	 * @see #getNiveauAcoustique()
	 * @see #setNiveauAcoustique(long)
	 * @generated
	 */
	void unsetNiveauAcoustique();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeBatiment#getNiveauAcoustique <em>Niveau Acoustique</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Niveau Acoustique</em>' attribute is set.
	 * @see #unsetNiveauAcoustique()
	 * @see #getNiveauAcoustique()
	 * @see #setNiveauAcoustique(long)
	 * @generated
	 */
	boolean isSetNiveauAcoustique();

	/**
	 * Returns the value of the '<em><b>Champ Magnetique Vertical</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Champ Magnetique Vertical</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Champ Magnetique Vertical</em>' containment reference.
	 * @see #setChampMagnetiqueVertical(TypeDataTypeChampMagnetique)
	 * @see mpia.schema.SchemaPackage#getTypeTypeBatiment_ChampMagnetiqueVertical()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ChampMagnetiqueVertical'"
	 * @generated
	 */
	TypeDataTypeChampMagnetique getChampMagnetiqueVertical();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeBatiment#getChampMagnetiqueVertical <em>Champ Magnetique Vertical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Champ Magnetique Vertical</em>' containment reference.
	 * @see #getChampMagnetiqueVertical()
	 * @generated
	 */
	void setChampMagnetiqueVertical(TypeDataTypeChampMagnetique value);

	/**
	 * Returns the value of the '<em><b>Prismatic Coefficient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prismatic Coefficient</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prismatic Coefficient</em>' attribute.
	 * @see #isSetPrismaticCoefficient()
	 * @see #unsetPrismaticCoefficient()
	 * @see #setPrismaticCoefficient(double)
	 * @see mpia.schema.SchemaPackage#getTypeTypeBatiment_PrismaticCoefficient()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeFraction"
	 *        extendedMetaData="kind='element' name='PrismaticCoefficient'"
	 * @generated
	 */
	double getPrismaticCoefficient();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeBatiment#getPrismaticCoefficient <em>Prismatic Coefficient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prismatic Coefficient</em>' attribute.
	 * @see #isSetPrismaticCoefficient()
	 * @see #unsetPrismaticCoefficient()
	 * @see #getPrismaticCoefficient()
	 * @generated
	 */
	void setPrismaticCoefficient(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeBatiment#getPrismaticCoefficient <em>Prismatic Coefficient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrismaticCoefficient()
	 * @see #getPrismaticCoefficient()
	 * @see #setPrismaticCoefficient(double)
	 * @generated
	 */
	void unsetPrismaticCoefficient();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeBatiment#getPrismaticCoefficient <em>Prismatic Coefficient</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Prismatic Coefficient</em>' attribute is set.
	 * @see #unsetPrismaticCoefficient()
	 * @see #getPrismaticCoefficient()
	 * @see #setPrismaticCoefficient(double)
	 * @generated
	 */
	boolean isSetPrismaticCoefficient();

	/**
	 * Returns the value of the '<em><b>Complements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complements</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complements</em>' attribute.
	 * @see #setComplements(String)
	 * @see mpia.schema.SchemaPackage#getTypeTypeBatiment_Complements()
	 * @model dataType="mpia.meta.TypeDataTypeChaine06"
	 *        extendedMetaData="kind='element' name='Complements'"
	 * @generated
	 */
	String getComplements();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeBatiment#getComplements <em>Complements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complements</em>' attribute.
	 * @see #getComplements()
	 * @generated
	 */
	void setComplements(String value);

} // TypeTypeBatiment
