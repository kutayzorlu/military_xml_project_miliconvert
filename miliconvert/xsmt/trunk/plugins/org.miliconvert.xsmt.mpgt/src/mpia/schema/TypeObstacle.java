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
 * A representation of the model object '<em><b>Type Obstacle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeObstacle#getNumeroObstacle <em>Numero Obstacle</em>}</li>
 *   <li>{@link mpia.schema.TypeObstacle#isEstObstacleManoeuvre <em>Est Obstacle Manoeuvre</em>}</li>
 *   <li>{@link mpia.schema.TypeObstacle#isObstacleMarque <em>Obstacle Marque</em>}</li>
 *   <li>{@link mpia.schema.TypeObstacle#getTypeObjectifVise <em>Type Objectif Vise</em>}</li>
 *   <li>{@link mpia.schema.TypeObstacle#getTypeMines <em>Type Mines</em>}</li>
 *   <li>{@link mpia.schema.TypeObstacle#getAPourTypesComplementairesTypeObstacle <em>APour Types Complementaires Type Obstacle</em>}</li>
 *   <li>{@link mpia.schema.TypeObstacle#getAPourMinesOuExplosifsEmployesMineExplosif <em>APour Mines Ou Explosifs Employes Mine Explosif</em>}</li>
 *   <li>{@link mpia.schema.TypeObstacle#getAPourItineraireFranchissementOuContournementItineraireFranchissementOuContournement <em>APour Itineraire Franchissement Ou Contournement Itineraire Franchissement Ou Contournement</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeObstacle()
 * @model abstract="true"
 *        extendedMetaData="name='type_Obstacle' kind='elementOnly'"
 * @generated
 */
public interface TypeObstacle extends TypeSite {
	/**
	 * Returns the value of the '<em><b>Numero Obstacle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Obstacle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Obstacle</em>' attribute.
	 * @see #setNumeroObstacle(String)
	 * @see mpia.schema.SchemaPackage#getTypeObstacle_NumeroObstacle()
	 * @model dataType="mpia.meta.TypeDataTypeChaine09"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='NumeroObstacle'"
	 * @generated
	 */
	String getNumeroObstacle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObstacle#getNumeroObstacle <em>Numero Obstacle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Obstacle</em>' attribute.
	 * @see #getNumeroObstacle()
	 * @generated
	 */
	void setNumeroObstacle(String value);

	/**
	 * Returns the value of the '<em><b>Est Obstacle Manoeuvre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Obstacle Manoeuvre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Obstacle Manoeuvre</em>' attribute.
	 * @see #isSetEstObstacleManoeuvre()
	 * @see #unsetEstObstacleManoeuvre()
	 * @see #setEstObstacleManoeuvre(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeObstacle_EstObstacleManoeuvre()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='EstObstacleManoeuvre'"
	 * @generated
	 */
	boolean isEstObstacleManoeuvre();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObstacle#isEstObstacleManoeuvre <em>Est Obstacle Manoeuvre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Obstacle Manoeuvre</em>' attribute.
	 * @see #isSetEstObstacleManoeuvre()
	 * @see #unsetEstObstacleManoeuvre()
	 * @see #isEstObstacleManoeuvre()
	 * @generated
	 */
	void setEstObstacleManoeuvre(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeObstacle#isEstObstacleManoeuvre <em>Est Obstacle Manoeuvre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEstObstacleManoeuvre()
	 * @see #isEstObstacleManoeuvre()
	 * @see #setEstObstacleManoeuvre(boolean)
	 * @generated
	 */
	void unsetEstObstacleManoeuvre();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeObstacle#isEstObstacleManoeuvre <em>Est Obstacle Manoeuvre</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Est Obstacle Manoeuvre</em>' attribute is set.
	 * @see #unsetEstObstacleManoeuvre()
	 * @see #isEstObstacleManoeuvre()
	 * @see #setEstObstacleManoeuvre(boolean)
	 * @generated
	 */
	boolean isSetEstObstacleManoeuvre();

	/**
	 * Returns the value of the '<em><b>Obstacle Marque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Obstacle Marque</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obstacle Marque</em>' attribute.
	 * @see #isSetObstacleMarque()
	 * @see #unsetObstacleMarque()
	 * @see #setObstacleMarque(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeObstacle_ObstacleMarque()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='ObstacleMarque'"
	 * @generated
	 */
	boolean isObstacleMarque();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObstacle#isObstacleMarque <em>Obstacle Marque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obstacle Marque</em>' attribute.
	 * @see #isSetObstacleMarque()
	 * @see #unsetObstacleMarque()
	 * @see #isObstacleMarque()
	 * @generated
	 */
	void setObstacleMarque(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeObstacle#isObstacleMarque <em>Obstacle Marque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetObstacleMarque()
	 * @see #isObstacleMarque()
	 * @see #setObstacleMarque(boolean)
	 * @generated
	 */
	void unsetObstacleMarque();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeObstacle#isObstacleMarque <em>Obstacle Marque</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Obstacle Marque</em>' attribute is set.
	 * @see #unsetObstacleMarque()
	 * @see #isObstacleMarque()
	 * @see #setObstacleMarque(boolean)
	 * @generated
	 */
	boolean isSetObstacleMarque();

	/**
	 * Returns the value of the '<em><b>Type Objectif Vise</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoObstacleTypeObjectifVise}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Objectif Vise</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Objectif Vise</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoObstacleTypeObjectifVise
	 * @see #isSetTypeObjectifVise()
	 * @see #unsetTypeObjectifVise()
	 * @see #setTypeObjectifVise(TypeDictionaryDicoObstacleTypeObjectifVise)
	 * @see mpia.schema.SchemaPackage#getTypeObstacle_TypeObjectifVise()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeObjectifVise'"
	 * @generated
	 */
	TypeDictionaryDicoObstacleTypeObjectifVise getTypeObjectifVise();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObstacle#getTypeObjectifVise <em>Type Objectif Vise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Objectif Vise</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoObstacleTypeObjectifVise
	 * @see #isSetTypeObjectifVise()
	 * @see #unsetTypeObjectifVise()
	 * @see #getTypeObjectifVise()
	 * @generated
	 */
	void setTypeObjectifVise(TypeDictionaryDicoObstacleTypeObjectifVise value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeObstacle#getTypeObjectifVise <em>Type Objectif Vise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeObjectifVise()
	 * @see #getTypeObjectifVise()
	 * @see #setTypeObjectifVise(TypeDictionaryDicoObstacleTypeObjectifVise)
	 * @generated
	 */
	void unsetTypeObjectifVise();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeObstacle#getTypeObjectifVise <em>Type Objectif Vise</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Objectif Vise</em>' attribute is set.
	 * @see #unsetTypeObjectifVise()
	 * @see #getTypeObjectifVise()
	 * @see #setTypeObjectifVise(TypeDictionaryDicoObstacleTypeObjectifVise)
	 * @generated
	 */
	boolean isSetTypeObjectifVise();

	/**
	 * Returns the value of the '<em><b>Type Mines</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoObstacleTypeMines}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Mines</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Mines</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoObstacleTypeMines
	 * @see #isSetTypeMines()
	 * @see #unsetTypeMines()
	 * @see #setTypeMines(TypeDictionaryDicoObstacleTypeMines)
	 * @see mpia.schema.SchemaPackage#getTypeObstacle_TypeMines()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeMines'"
	 * @generated
	 */
	TypeDictionaryDicoObstacleTypeMines getTypeMines();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObstacle#getTypeMines <em>Type Mines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Mines</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoObstacleTypeMines
	 * @see #isSetTypeMines()
	 * @see #unsetTypeMines()
	 * @see #getTypeMines()
	 * @generated
	 */
	void setTypeMines(TypeDictionaryDicoObstacleTypeMines value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeObstacle#getTypeMines <em>Type Mines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeMines()
	 * @see #getTypeMines()
	 * @see #setTypeMines(TypeDictionaryDicoObstacleTypeMines)
	 * @generated
	 */
	void unsetTypeMines();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeObstacle#getTypeMines <em>Type Mines</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Mines</em>' attribute is set.
	 * @see #unsetTypeMines()
	 * @see #getTypeMines()
	 * @see #setTypeMines(TypeDictionaryDicoObstacleTypeMines)
	 * @generated
	 */
	boolean isSetTypeMines();

	/**
	 * Returns the value of the '<em><b>APour Types Complementaires Type Obstacle</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Types Complementaires Type Obstacle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Types Complementaires Type Obstacle</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeObstacle_APourTypesComplementairesTypeObstacle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeObstacle'"
	 *        extendedMetaData="kind='element' name='APourTypesComplementaires_TypeObstacle'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourTypesComplementairesTypeObstacle();

	/**
	 * Returns the value of the '<em><b>APour Mines Ou Explosifs Employes Mine Explosif</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMineExplosif}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Mines Ou Explosifs Employes Mine Explosif</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Mines Ou Explosifs Employes Mine Explosif</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeObstacle_APourMinesOuExplosifsEmployesMineExplosif()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_MineExplosif'"
	 *        extendedMetaData="kind='element' name='APourMinesOuExplosifsEmployes_MineExplosif'"
	 * @generated
	 */
	EList<TypeMineExplosif> getAPourMinesOuExplosifsEmployesMineExplosif();

	/**
	 * Returns the value of the '<em><b>APour Itineraire Franchissement Ou Contournement Itineraire Franchissement Ou Contournement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeItineraireFranchissementOuContournement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Itineraire Franchissement Ou Contournement Itineraire Franchissement Ou Contournement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Itineraire Franchissement Ou Contournement Itineraire Franchissement Ou Contournement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeObstacle_APourItineraireFranchissementOuContournementItineraireFranchissementOuContournement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ItineraireFranchissementOuContournement'"
	 *        extendedMetaData="kind='element' name='APourItineraireFranchissementOuContournement_ItineraireFranchissementOuContournement'"
	 * @generated
	 */
	EList<TypeItineraireFranchissementOuContournement> getAPourItineraireFranchissementOuContournementItineraireFranchissementOuContournement();

} // TypeObstacle
