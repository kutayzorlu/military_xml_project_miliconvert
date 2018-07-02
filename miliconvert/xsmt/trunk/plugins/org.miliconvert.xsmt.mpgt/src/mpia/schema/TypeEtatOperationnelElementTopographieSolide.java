/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Etat Operationnel Element Topographie Solide</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEtatOperationnelElementTopographieSolide#getEtatOperationnel <em>Etat Operationnel</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelElementTopographieSolide#getEtatDemolition <em>Etat Demolition</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelElementTopographieSolide#getEtatSurface <em>Etat Surface</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelElementTopographieSolide#getEtatVegetation <em>Etat Vegetation</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelElementTopographieSolide#getSouEtatVegetation <em>Sou Etat Vegetation</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelElementTopographieSolide#getStabilite <em>Stabilite</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelElementTopographieSolide()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_EtatOperationnelElementTopographieSolide' kind='elementOnly'"
 * @generated
 */
public interface TypeEtatOperationnelElementTopographieSolide extends TypeEtatOperationnelElementTopographie {
	/**
	 * Returns the value of the '<em><b>Etat Operationnel</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOperationnelElementTopographieSolideEtatOperationnel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Operationnel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Operationnel</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelElementTopographieSolideEtatOperationnel
	 * @see #isSetEtatOperationnel()
	 * @see #unsetEtatOperationnel()
	 * @see #setEtatOperationnel(TypeDictionaryDicoEtatOperationnelElementTopographieSolideEtatOperationnel)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelElementTopographieSolide_EtatOperationnel()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EtatOperationnel'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnelElementTopographieSolideEtatOperationnel getEtatOperationnel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelElementTopographieSolide#getEtatOperationnel <em>Etat Operationnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Operationnel</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelElementTopographieSolideEtatOperationnel
	 * @see #isSetEtatOperationnel()
	 * @see #unsetEtatOperationnel()
	 * @see #getEtatOperationnel()
	 * @generated
	 */
	void setEtatOperationnel(TypeDictionaryDicoEtatOperationnelElementTopographieSolideEtatOperationnel value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelElementTopographieSolide#getEtatOperationnel <em>Etat Operationnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEtatOperationnel()
	 * @see #getEtatOperationnel()
	 * @see #setEtatOperationnel(TypeDictionaryDicoEtatOperationnelElementTopographieSolideEtatOperationnel)
	 * @generated
	 */
	void unsetEtatOperationnel();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelElementTopographieSolide#getEtatOperationnel <em>Etat Operationnel</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Etat Operationnel</em>' attribute is set.
	 * @see #unsetEtatOperationnel()
	 * @see #getEtatOperationnel()
	 * @see #setEtatOperationnel(TypeDictionaryDicoEtatOperationnelElementTopographieSolideEtatOperationnel)
	 * @generated
	 */
	boolean isSetEtatOperationnel();

	/**
	 * Returns the value of the '<em><b>Etat Demolition</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatDemolition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Demolition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Demolition</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatDemolition
	 * @see #isSetEtatDemolition()
	 * @see #unsetEtatDemolition()
	 * @see #setEtatDemolition(TypeDictionaryDicoEtatDemolition)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelElementTopographieSolide_EtatDemolition()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EtatDemolition'"
	 * @generated
	 */
	TypeDictionaryDicoEtatDemolition getEtatDemolition();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelElementTopographieSolide#getEtatDemolition <em>Etat Demolition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Demolition</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatDemolition
	 * @see #isSetEtatDemolition()
	 * @see #unsetEtatDemolition()
	 * @see #getEtatDemolition()
	 * @generated
	 */
	void setEtatDemolition(TypeDictionaryDicoEtatDemolition value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelElementTopographieSolide#getEtatDemolition <em>Etat Demolition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEtatDemolition()
	 * @see #getEtatDemolition()
	 * @see #setEtatDemolition(TypeDictionaryDicoEtatDemolition)
	 * @generated
	 */
	void unsetEtatDemolition();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelElementTopographieSolide#getEtatDemolition <em>Etat Demolition</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Etat Demolition</em>' attribute is set.
	 * @see #unsetEtatDemolition()
	 * @see #getEtatDemolition()
	 * @see #setEtatDemolition(TypeDictionaryDicoEtatDemolition)
	 * @generated
	 */
	boolean isSetEtatDemolition();

	/**
	 * Returns the value of the '<em><b>Etat Surface</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOperationnelElementTopographieSolideEtatSurface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Surface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Surface</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelElementTopographieSolideEtatSurface
	 * @see #isSetEtatSurface()
	 * @see #unsetEtatSurface()
	 * @see #setEtatSurface(TypeDictionaryDicoEtatOperationnelElementTopographieSolideEtatSurface)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelElementTopographieSolide_EtatSurface()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EtatSurface'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnelElementTopographieSolideEtatSurface getEtatSurface();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelElementTopographieSolide#getEtatSurface <em>Etat Surface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Surface</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelElementTopographieSolideEtatSurface
	 * @see #isSetEtatSurface()
	 * @see #unsetEtatSurface()
	 * @see #getEtatSurface()
	 * @generated
	 */
	void setEtatSurface(TypeDictionaryDicoEtatOperationnelElementTopographieSolideEtatSurface value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelElementTopographieSolide#getEtatSurface <em>Etat Surface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEtatSurface()
	 * @see #getEtatSurface()
	 * @see #setEtatSurface(TypeDictionaryDicoEtatOperationnelElementTopographieSolideEtatSurface)
	 * @generated
	 */
	void unsetEtatSurface();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelElementTopographieSolide#getEtatSurface <em>Etat Surface</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Etat Surface</em>' attribute is set.
	 * @see #unsetEtatSurface()
	 * @see #getEtatSurface()
	 * @see #setEtatSurface(TypeDictionaryDicoEtatOperationnelElementTopographieSolideEtatSurface)
	 * @generated
	 */
	boolean isSetEtatSurface();

	/**
	 * Returns the value of the '<em><b>Etat Vegetation</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoVegetation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Vegetation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Vegetation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoVegetation
	 * @see #isSetEtatVegetation()
	 * @see #unsetEtatVegetation()
	 * @see #setEtatVegetation(TypeDictionaryDicoVegetation)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelElementTopographieSolide_EtatVegetation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EtatVegetation'"
	 * @generated
	 */
	TypeDictionaryDicoVegetation getEtatVegetation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelElementTopographieSolide#getEtatVegetation <em>Etat Vegetation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Vegetation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoVegetation
	 * @see #isSetEtatVegetation()
	 * @see #unsetEtatVegetation()
	 * @see #getEtatVegetation()
	 * @generated
	 */
	void setEtatVegetation(TypeDictionaryDicoVegetation value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelElementTopographieSolide#getEtatVegetation <em>Etat Vegetation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEtatVegetation()
	 * @see #getEtatVegetation()
	 * @see #setEtatVegetation(TypeDictionaryDicoVegetation)
	 * @generated
	 */
	void unsetEtatVegetation();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelElementTopographieSolide#getEtatVegetation <em>Etat Vegetation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Etat Vegetation</em>' attribute is set.
	 * @see #unsetEtatVegetation()
	 * @see #getEtatVegetation()
	 * @see #setEtatVegetation(TypeDictionaryDicoVegetation)
	 * @generated
	 */
	boolean isSetEtatVegetation();

	/**
	 * Returns the value of the '<em><b>Sou Etat Vegetation</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoSousTypeVegetation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sou Etat Vegetation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sou Etat Vegetation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoSousTypeVegetation
	 * @see #isSetSouEtatVegetation()
	 * @see #unsetSouEtatVegetation()
	 * @see #setSouEtatVegetation(TypeDictionaryDicoSousTypeVegetation)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelElementTopographieSolide_SouEtatVegetation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SouEtatVegetation'"
	 * @generated
	 */
	TypeDictionaryDicoSousTypeVegetation getSouEtatVegetation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelElementTopographieSolide#getSouEtatVegetation <em>Sou Etat Vegetation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sou Etat Vegetation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoSousTypeVegetation
	 * @see #isSetSouEtatVegetation()
	 * @see #unsetSouEtatVegetation()
	 * @see #getSouEtatVegetation()
	 * @generated
	 */
	void setSouEtatVegetation(TypeDictionaryDicoSousTypeVegetation value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelElementTopographieSolide#getSouEtatVegetation <em>Sou Etat Vegetation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSouEtatVegetation()
	 * @see #getSouEtatVegetation()
	 * @see #setSouEtatVegetation(TypeDictionaryDicoSousTypeVegetation)
	 * @generated
	 */
	void unsetSouEtatVegetation();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelElementTopographieSolide#getSouEtatVegetation <em>Sou Etat Vegetation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sou Etat Vegetation</em>' attribute is set.
	 * @see #unsetSouEtatVegetation()
	 * @see #getSouEtatVegetation()
	 * @see #setSouEtatVegetation(TypeDictionaryDicoSousTypeVegetation)
	 * @generated
	 */
	boolean isSetSouEtatVegetation();

	/**
	 * Returns the value of the '<em><b>Stabilite</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOperationnelElementTopographieSolideStabilite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stabilite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stabilite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelElementTopographieSolideStabilite
	 * @see #isSetStabilite()
	 * @see #unsetStabilite()
	 * @see #setStabilite(TypeDictionaryDicoEtatOperationnelElementTopographieSolideStabilite)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelElementTopographieSolide_Stabilite()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Stabilite'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnelElementTopographieSolideStabilite getStabilite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelElementTopographieSolide#getStabilite <em>Stabilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stabilite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelElementTopographieSolideStabilite
	 * @see #isSetStabilite()
	 * @see #unsetStabilite()
	 * @see #getStabilite()
	 * @generated
	 */
	void setStabilite(TypeDictionaryDicoEtatOperationnelElementTopographieSolideStabilite value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelElementTopographieSolide#getStabilite <em>Stabilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStabilite()
	 * @see #getStabilite()
	 * @see #setStabilite(TypeDictionaryDicoEtatOperationnelElementTopographieSolideStabilite)
	 * @generated
	 */
	void unsetStabilite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelElementTopographieSolide#getStabilite <em>Stabilite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stabilite</em>' attribute is set.
	 * @see #unsetStabilite()
	 * @see #getStabilite()
	 * @see #setStabilite(TypeDictionaryDicoEtatOperationnelElementTopographieSolideStabilite)
	 * @generated
	 */
	boolean isSetStabilite();

} // TypeEtatOperationnelElementTopographieSolide
