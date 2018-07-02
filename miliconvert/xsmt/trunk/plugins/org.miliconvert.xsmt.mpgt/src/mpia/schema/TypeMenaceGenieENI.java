/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Menace Genie ENI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMenaceGenieENI#getProbabiliteMenace <em>Probabilite Menace</em>}</li>
 *   <li>{@link mpia.schema.TypeMenaceGenieENI#getButTactiqueObstacle <em>But Tactique Obstacle</em>}</li>
 *   <li>{@link mpia.schema.TypeMenaceGenieENI#getEffetTechniqueRecherche <em>Effet Technique Recherche</em>}</li>
 *   <li>{@link mpia.schema.TypeMenaceGenieENI#getComplementSurMinage <em>Complement Sur Minage</em>}</li>
 *   <li>{@link mpia.schema.TypeMenaceGenieENI#getACommeZoneObstacleAutreElementControle <em>AComme Zone Obstacle Autre Element Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMenaceGenieENI()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_MenaceGenieENI' kind='elementOnly'"
 * @generated
 */
public interface TypeMenaceGenieENI extends TypeMenace {
	/**
	 * Returns the value of the '<em><b>Probabilite Menace</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoProbabiliteEvenement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probabilite Menace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probabilite Menace</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoProbabiliteEvenement
	 * @see #isSetProbabiliteMenace()
	 * @see #unsetProbabiliteMenace()
	 * @see #setProbabiliteMenace(TypeDictionaryDicoProbabiliteEvenement)
	 * @see mpia.schema.SchemaPackage#getTypeMenaceGenieENI_ProbabiliteMenace()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ProbabiliteMenace'"
	 * @generated
	 */
	TypeDictionaryDicoProbabiliteEvenement getProbabiliteMenace();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMenaceGenieENI#getProbabiliteMenace <em>Probabilite Menace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probabilite Menace</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoProbabiliteEvenement
	 * @see #isSetProbabiliteMenace()
	 * @see #unsetProbabiliteMenace()
	 * @see #getProbabiliteMenace()
	 * @generated
	 */
	void setProbabiliteMenace(TypeDictionaryDicoProbabiliteEvenement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMenaceGenieENI#getProbabiliteMenace <em>Probabilite Menace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProbabiliteMenace()
	 * @see #getProbabiliteMenace()
	 * @see #setProbabiliteMenace(TypeDictionaryDicoProbabiliteEvenement)
	 * @generated
	 */
	void unsetProbabiliteMenace();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMenaceGenieENI#getProbabiliteMenace <em>Probabilite Menace</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Probabilite Menace</em>' attribute is set.
	 * @see #unsetProbabiliteMenace()
	 * @see #getProbabiliteMenace()
	 * @see #setProbabiliteMenace(TypeDictionaryDicoProbabiliteEvenement)
	 * @generated
	 */
	boolean isSetProbabiliteMenace();

	/**
	 * Returns the value of the '<em><b>But Tactique Obstacle</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMenaceGenieENIButTactiqueObstacle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>But Tactique Obstacle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>But Tactique Obstacle</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMenaceGenieENIButTactiqueObstacle
	 * @see #isSetButTactiqueObstacle()
	 * @see #unsetButTactiqueObstacle()
	 * @see #setButTactiqueObstacle(TypeDictionaryDicoMenaceGenieENIButTactiqueObstacle)
	 * @see mpia.schema.SchemaPackage#getTypeMenaceGenieENI_ButTactiqueObstacle()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ButTactiqueObstacle'"
	 * @generated
	 */
	TypeDictionaryDicoMenaceGenieENIButTactiqueObstacle getButTactiqueObstacle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMenaceGenieENI#getButTactiqueObstacle <em>But Tactique Obstacle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>But Tactique Obstacle</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMenaceGenieENIButTactiqueObstacle
	 * @see #isSetButTactiqueObstacle()
	 * @see #unsetButTactiqueObstacle()
	 * @see #getButTactiqueObstacle()
	 * @generated
	 */
	void setButTactiqueObstacle(TypeDictionaryDicoMenaceGenieENIButTactiqueObstacle value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMenaceGenieENI#getButTactiqueObstacle <em>But Tactique Obstacle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetButTactiqueObstacle()
	 * @see #getButTactiqueObstacle()
	 * @see #setButTactiqueObstacle(TypeDictionaryDicoMenaceGenieENIButTactiqueObstacle)
	 * @generated
	 */
	void unsetButTactiqueObstacle();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMenaceGenieENI#getButTactiqueObstacle <em>But Tactique Obstacle</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>But Tactique Obstacle</em>' attribute is set.
	 * @see #unsetButTactiqueObstacle()
	 * @see #getButTactiqueObstacle()
	 * @see #setButTactiqueObstacle(TypeDictionaryDicoMenaceGenieENIButTactiqueObstacle)
	 * @generated
	 */
	boolean isSetButTactiqueObstacle();

	/**
	 * Returns the value of the '<em><b>Effet Technique Recherche</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effet Technique Recherche</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effet Technique Recherche</em>' attribute.
	 * @see #setEffetTechniqueRecherche(String)
	 * @see mpia.schema.SchemaPackage#getTypeMenaceGenieENI_EffetTechniqueRecherche()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='EffetTechniqueRecherche'"
	 * @generated
	 */
	String getEffetTechniqueRecherche();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMenaceGenieENI#getEffetTechniqueRecherche <em>Effet Technique Recherche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effet Technique Recherche</em>' attribute.
	 * @see #getEffetTechniqueRecherche()
	 * @generated
	 */
	void setEffetTechniqueRecherche(String value);

	/**
	 * Returns the value of the '<em><b>Complement Sur Minage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complement Sur Minage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complement Sur Minage</em>' attribute.
	 * @see #setComplementSurMinage(String)
	 * @see mpia.schema.SchemaPackage#getTypeMenaceGenieENI_ComplementSurMinage()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='ComplementSurMinage'"
	 * @generated
	 */
	String getComplementSurMinage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMenaceGenieENI#getComplementSurMinage <em>Complement Sur Minage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complement Sur Minage</em>' attribute.
	 * @see #getComplementSurMinage()
	 * @generated
	 */
	void setComplementSurMinage(String value);

	/**
	 * Returns the value of the '<em><b>AComme Zone Obstacle Autre Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Zone Obstacle Autre Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Zone Obstacle Autre Element Controle</em>' containment reference.
	 * @see #setACommeZoneObstacleAutreElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeMenaceGenieENI_ACommeZoneObstacleAutreElementControle()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='ACommeZoneObstacle_AutreElementControle'"
	 * @generated
	 */
	TypeAssociation getACommeZoneObstacleAutreElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMenaceGenieENI#getACommeZoneObstacleAutreElementControle <em>AComme Zone Obstacle Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Zone Obstacle Autre Element Controle</em>' containment reference.
	 * @see #getACommeZoneObstacleAutreElementControle()
	 * @generated
	 */
	void setACommeZoneObstacleAutreElementControle(TypeAssociation value);

} // TypeMenaceGenieENI
