/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeRoute#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeRoute#getEtatRoute <em>Etat Route</em>}</li>
 *   <li>{@link mpia.schema.TypeRoute#getConditionMeteo <em>Condition Meteo</em>}</li>
 *   <li>{@link mpia.schema.TypeRoute#getDensiteTrafic <em>Densite Trafic</em>}</li>
 *   <li>{@link mpia.schema.TypeRoute#getLargueurBasCotes <em>Largueur Bas Cotes</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeRoute()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_Route' kind='elementOnly'"
 * @generated
 */
public interface TypeRoute extends TypeSite {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoRouteCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoRouteCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoRouteCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeRoute_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoRouteCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRoute#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoRouteCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoRouteCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeRoute#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoRouteCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeRoute#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoRouteCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Etat Route</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoRouteEtatRoute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Route</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Route</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoRouteEtatRoute
	 * @see #isSetEtatRoute()
	 * @see #unsetEtatRoute()
	 * @see #setEtatRoute(TypeDictionaryDicoRouteEtatRoute)
	 * @see mpia.schema.SchemaPackage#getTypeRoute_EtatRoute()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EtatRoute'"
	 * @generated
	 */
	TypeDictionaryDicoRouteEtatRoute getEtatRoute();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRoute#getEtatRoute <em>Etat Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Route</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoRouteEtatRoute
	 * @see #isSetEtatRoute()
	 * @see #unsetEtatRoute()
	 * @see #getEtatRoute()
	 * @generated
	 */
	void setEtatRoute(TypeDictionaryDicoRouteEtatRoute value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeRoute#getEtatRoute <em>Etat Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEtatRoute()
	 * @see #getEtatRoute()
	 * @see #setEtatRoute(TypeDictionaryDicoRouteEtatRoute)
	 * @generated
	 */
	void unsetEtatRoute();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeRoute#getEtatRoute <em>Etat Route</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Etat Route</em>' attribute is set.
	 * @see #unsetEtatRoute()
	 * @see #getEtatRoute()
	 * @see #setEtatRoute(TypeDictionaryDicoRouteEtatRoute)
	 * @generated
	 */
	boolean isSetEtatRoute();

	/**
	 * Returns the value of the '<em><b>Condition Meteo</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoRouteConditionMeteo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Meteo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Meteo</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoRouteConditionMeteo
	 * @see #isSetConditionMeteo()
	 * @see #unsetConditionMeteo()
	 * @see #setConditionMeteo(TypeDictionaryDicoRouteConditionMeteo)
	 * @see mpia.schema.SchemaPackage#getTypeRoute_ConditionMeteo()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ConditionMeteo'"
	 * @generated
	 */
	TypeDictionaryDicoRouteConditionMeteo getConditionMeteo();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRoute#getConditionMeteo <em>Condition Meteo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Meteo</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoRouteConditionMeteo
	 * @see #isSetConditionMeteo()
	 * @see #unsetConditionMeteo()
	 * @see #getConditionMeteo()
	 * @generated
	 */
	void setConditionMeteo(TypeDictionaryDicoRouteConditionMeteo value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeRoute#getConditionMeteo <em>Condition Meteo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConditionMeteo()
	 * @see #getConditionMeteo()
	 * @see #setConditionMeteo(TypeDictionaryDicoRouteConditionMeteo)
	 * @generated
	 */
	void unsetConditionMeteo();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeRoute#getConditionMeteo <em>Condition Meteo</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Condition Meteo</em>' attribute is set.
	 * @see #unsetConditionMeteo()
	 * @see #getConditionMeteo()
	 * @see #setConditionMeteo(TypeDictionaryDicoRouteConditionMeteo)
	 * @generated
	 */
	boolean isSetConditionMeteo();

	/**
	 * Returns the value of the '<em><b>Densite Trafic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Densite Trafic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Densite Trafic</em>' attribute.
	 * @see #isSetDensiteTrafic()
	 * @see #unsetDensiteTrafic()
	 * @see #setDensiteTrafic(double)
	 * @see mpia.schema.SchemaPackage#getTypeRoute_DensiteTrafic()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeRatio"
	 *        extendedMetaData="kind='element' name='DensiteTrafic'"
	 * @generated
	 */
	double getDensiteTrafic();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRoute#getDensiteTrafic <em>Densite Trafic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Densite Trafic</em>' attribute.
	 * @see #isSetDensiteTrafic()
	 * @see #unsetDensiteTrafic()
	 * @see #getDensiteTrafic()
	 * @generated
	 */
	void setDensiteTrafic(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeRoute#getDensiteTrafic <em>Densite Trafic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDensiteTrafic()
	 * @see #getDensiteTrafic()
	 * @see #setDensiteTrafic(double)
	 * @generated
	 */
	void unsetDensiteTrafic();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeRoute#getDensiteTrafic <em>Densite Trafic</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Densite Trafic</em>' attribute is set.
	 * @see #unsetDensiteTrafic()
	 * @see #getDensiteTrafic()
	 * @see #setDensiteTrafic(double)
	 * @generated
	 */
	boolean isSetDensiteTrafic();

	/**
	 * Returns the value of the '<em><b>Largueur Bas Cotes</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoRouteLargueurBasCotes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Largueur Bas Cotes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Largueur Bas Cotes</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoRouteLargueurBasCotes
	 * @see #isSetLargueurBasCotes()
	 * @see #unsetLargueurBasCotes()
	 * @see #setLargueurBasCotes(TypeDictionaryDicoRouteLargueurBasCotes)
	 * @see mpia.schema.SchemaPackage#getTypeRoute_LargueurBasCotes()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='LargueurBasCotes'"
	 * @generated
	 */
	TypeDictionaryDicoRouteLargueurBasCotes getLargueurBasCotes();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRoute#getLargueurBasCotes <em>Largueur Bas Cotes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Largueur Bas Cotes</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoRouteLargueurBasCotes
	 * @see #isSetLargueurBasCotes()
	 * @see #unsetLargueurBasCotes()
	 * @see #getLargueurBasCotes()
	 * @generated
	 */
	void setLargueurBasCotes(TypeDictionaryDicoRouteLargueurBasCotes value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeRoute#getLargueurBasCotes <em>Largueur Bas Cotes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLargueurBasCotes()
	 * @see #getLargueurBasCotes()
	 * @see #setLargueurBasCotes(TypeDictionaryDicoRouteLargueurBasCotes)
	 * @generated
	 */
	void unsetLargueurBasCotes();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeRoute#getLargueurBasCotes <em>Largueur Bas Cotes</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Largueur Bas Cotes</em>' attribute is set.
	 * @see #unsetLargueurBasCotes()
	 * @see #getLargueurBasCotes()
	 * @see #setLargueurBasCotes(TypeDictionaryDicoRouteLargueurBasCotes)
	 * @generated
	 */
	boolean isSetLargueurBasCotes();

} // TypeRoute
