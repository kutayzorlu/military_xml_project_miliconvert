/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeLongueur;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Type Materiel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeTypeMateriel#getCodeNNO <em>Code NNO</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeMateriel#getIntituleNNO <em>Intitule NNO</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeMateriel#getCodeEMAT8 <em>Code EMAT8</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeMateriel#getIntituleEMAT8 <em>Intitule EMAT8</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeMateriel#getCodeRIC <em>Code RIC</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeMateriel#getCodeNIC <em>Code NIC</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeMateriel#getClasseRavitaillementOTAN <em>Classe Ravitaillement OTAN</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeMateriel#getConditionnementLongueur <em>Conditionnement Longueur</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeMateriel#getConditionnementLargeur <em>Conditionnement Largeur</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeMateriel#getConditionnementHauteur <em>Conditionnement Hauteur</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeMateriel#getPrimaryService <em>Primary Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeTypeMateriel()
 * @model abstract="true"
 *        extendedMetaData="name='type_TypeMateriel' kind='elementOnly'"
 * @generated
 */
public interface TypeTypeMateriel extends TypeType {
	/**
	 * Returns the value of the '<em><b>Code NNO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code NNO</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code NNO</em>' attribute.
	 * @see #setCodeNNO(String)
	 * @see mpia.schema.SchemaPackage#getTypeTypeMateriel_CodeNNO()
	 * @model dataType="mpia.meta.TypeDataTypeChaine015"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='CodeNNO'"
	 * @generated
	 */
	String getCodeNNO();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeMateriel#getCodeNNO <em>Code NNO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code NNO</em>' attribute.
	 * @see #getCodeNNO()
	 * @generated
	 */
	void setCodeNNO(String value);

	/**
	 * Returns the value of the '<em><b>Intitule NNO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intitule NNO</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intitule NNO</em>' attribute.
	 * @see #setIntituleNNO(String)
	 * @see mpia.schema.SchemaPackage#getTypeTypeMateriel_IntituleNNO()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='IntituleNNO'"
	 * @generated
	 */
	String getIntituleNNO();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeMateriel#getIntituleNNO <em>Intitule NNO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intitule NNO</em>' attribute.
	 * @see #getIntituleNNO()
	 * @generated
	 */
	void setIntituleNNO(String value);

	/**
	 * Returns the value of the '<em><b>Code EMAT8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code EMAT8</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code EMAT8</em>' attribute.
	 * @see #setCodeEMAT8(String)
	 * @see mpia.schema.SchemaPackage#getTypeTypeMateriel_CodeEMAT8()
	 * @model dataType="mpia.meta.TypeDataTypeChaine08"
	 *        extendedMetaData="kind='element' name='CodeEMAT8'"
	 * @generated
	 */
	String getCodeEMAT8();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeMateriel#getCodeEMAT8 <em>Code EMAT8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code EMAT8</em>' attribute.
	 * @see #getCodeEMAT8()
	 * @generated
	 */
	void setCodeEMAT8(String value);

	/**
	 * Returns the value of the '<em><b>Intitule EMAT8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intitule EMAT8</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intitule EMAT8</em>' attribute.
	 * @see #setIntituleEMAT8(String)
	 * @see mpia.schema.SchemaPackage#getTypeTypeMateriel_IntituleEMAT8()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='IntituleEMAT8'"
	 * @generated
	 */
	String getIntituleEMAT8();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeMateriel#getIntituleEMAT8 <em>Intitule EMAT8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intitule EMAT8</em>' attribute.
	 * @see #getIntituleEMAT8()
	 * @generated
	 */
	void setIntituleEMAT8(String value);

	/**
	 * Returns the value of the '<em><b>Code RIC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code RIC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code RIC</em>' attribute.
	 * @see #setCodeRIC(String)
	 * @see mpia.schema.SchemaPackage#getTypeTypeMateriel_CodeRIC()
	 * @model dataType="mpia.meta.TypeDataTypeChaine06"
	 *        extendedMetaData="kind='element' name='CodeRIC'"
	 * @generated
	 */
	String getCodeRIC();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeMateriel#getCodeRIC <em>Code RIC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code RIC</em>' attribute.
	 * @see #getCodeRIC()
	 * @generated
	 */
	void setCodeRIC(String value);

	/**
	 * Returns the value of the '<em><b>Code NIC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code NIC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code NIC</em>' attribute.
	 * @see #setCodeNIC(String)
	 * @see mpia.schema.SchemaPackage#getTypeTypeMateriel_CodeNIC()
	 * @model dataType="mpia.meta.TypeDataTypeChaine015"
	 *        extendedMetaData="kind='element' name='CodeNIC'"
	 * @generated
	 */
	String getCodeNIC();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeMateriel#getCodeNIC <em>Code NIC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code NIC</em>' attribute.
	 * @see #getCodeNIC()
	 * @generated
	 */
	void setCodeNIC(String value);

	/**
	 * Returns the value of the '<em><b>Classe Ravitaillement OTAN</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeMaterielClasseRavitaillementOTAN}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classe Ravitaillement OTAN</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classe Ravitaillement OTAN</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeMaterielClasseRavitaillementOTAN
	 * @see #isSetClasseRavitaillementOTAN()
	 * @see #unsetClasseRavitaillementOTAN()
	 * @see #setClasseRavitaillementOTAN(TypeDictionaryDicoTypeMaterielClasseRavitaillementOTAN)
	 * @see mpia.schema.SchemaPackage#getTypeTypeMateriel_ClasseRavitaillementOTAN()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ClasseRavitaillementOTAN'"
	 * @generated
	 */
	TypeDictionaryDicoTypeMaterielClasseRavitaillementOTAN getClasseRavitaillementOTAN();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeMateriel#getClasseRavitaillementOTAN <em>Classe Ravitaillement OTAN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classe Ravitaillement OTAN</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeMaterielClasseRavitaillementOTAN
	 * @see #isSetClasseRavitaillementOTAN()
	 * @see #unsetClasseRavitaillementOTAN()
	 * @see #getClasseRavitaillementOTAN()
	 * @generated
	 */
	void setClasseRavitaillementOTAN(TypeDictionaryDicoTypeMaterielClasseRavitaillementOTAN value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeMateriel#getClasseRavitaillementOTAN <em>Classe Ravitaillement OTAN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClasseRavitaillementOTAN()
	 * @see #getClasseRavitaillementOTAN()
	 * @see #setClasseRavitaillementOTAN(TypeDictionaryDicoTypeMaterielClasseRavitaillementOTAN)
	 * @generated
	 */
	void unsetClasseRavitaillementOTAN();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeMateriel#getClasseRavitaillementOTAN <em>Classe Ravitaillement OTAN</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Classe Ravitaillement OTAN</em>' attribute is set.
	 * @see #unsetClasseRavitaillementOTAN()
	 * @see #getClasseRavitaillementOTAN()
	 * @see #setClasseRavitaillementOTAN(TypeDictionaryDicoTypeMaterielClasseRavitaillementOTAN)
	 * @generated
	 */
	boolean isSetClasseRavitaillementOTAN();

	/**
	 * Returns the value of the '<em><b>Conditionnement Longueur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditionnement Longueur</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditionnement Longueur</em>' containment reference.
	 * @see #setConditionnementLongueur(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeTypeMateriel_ConditionnementLongueur()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ConditionnementLongueur'"
	 * @generated
	 */
	TypeDataTypeLongueur getConditionnementLongueur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeMateriel#getConditionnementLongueur <em>Conditionnement Longueur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditionnement Longueur</em>' containment reference.
	 * @see #getConditionnementLongueur()
	 * @generated
	 */
	void setConditionnementLongueur(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Conditionnement Largeur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditionnement Largeur</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditionnement Largeur</em>' containment reference.
	 * @see #setConditionnementLargeur(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeTypeMateriel_ConditionnementLargeur()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ConditionnementLargeur'"
	 * @generated
	 */
	TypeDataTypeLongueur getConditionnementLargeur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeMateriel#getConditionnementLargeur <em>Conditionnement Largeur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditionnement Largeur</em>' containment reference.
	 * @see #getConditionnementLargeur()
	 * @generated
	 */
	void setConditionnementLargeur(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Conditionnement Hauteur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditionnement Hauteur</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditionnement Hauteur</em>' containment reference.
	 * @see #setConditionnementHauteur(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeTypeMateriel_ConditionnementHauteur()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ConditionnementHauteur'"
	 * @generated
	 */
	TypeDataTypeLongueur getConditionnementHauteur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeMateriel#getConditionnementHauteur <em>Conditionnement Hauteur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditionnement Hauteur</em>' containment reference.
	 * @see #getConditionnementHauteur()
	 * @generated
	 */
	void setConditionnementHauteur(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Primary Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Service</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Service</em>' attribute.
	 * @see #setPrimaryService(String)
	 * @see mpia.schema.SchemaPackage#getTypeTypeMateriel_PrimaryService()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='PrimaryService'"
	 * @generated
	 */
	String getPrimaryService();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeMateriel#getPrimaryService <em>Primary Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Service</em>' attribute.
	 * @see #getPrimaryService()
	 * @generated
	 */
	void setPrimaryService(String value);

} // TypeTypeMateriel
