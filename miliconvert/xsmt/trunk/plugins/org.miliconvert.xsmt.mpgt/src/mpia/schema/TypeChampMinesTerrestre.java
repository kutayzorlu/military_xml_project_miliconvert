/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Champ Mines Terrestre</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeChampMinesTerrestre#getFonction <em>Fonction</em>}</li>
 *   <li>{@link mpia.schema.TypeChampMinesTerrestre#getEnfouissement <em>Enfouissement</em>}</li>
 *   <li>{@link mpia.schema.TypeChampMinesTerrestre#getDispersion <em>Dispersion</em>}</li>
 *   <li>{@link mpia.schema.TypeChampMinesTerrestre#getPersistance <em>Persistance</em>}</li>
 *   <li>{@link mpia.schema.TypeChampMinesTerrestre#getPouvoirArret <em>Pouvoir Arret</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeChampMinesTerrestre()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_ChampMinesTerrestre' kind='elementOnly'"
 * @generated
 */
public interface TypeChampMinesTerrestre extends TypeChampMines {
	/**
	 * Returns the value of the '<em><b>Fonction</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoChampMinesTerrestreFonction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fonction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fonction</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoChampMinesTerrestreFonction
	 * @see #isSetFonction()
	 * @see #unsetFonction()
	 * @see #setFonction(TypeDictionaryDicoChampMinesTerrestreFonction)
	 * @see mpia.schema.SchemaPackage#getTypeChampMinesTerrestre_Fonction()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Fonction'"
	 * @generated
	 */
	TypeDictionaryDicoChampMinesTerrestreFonction getFonction();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeChampMinesTerrestre#getFonction <em>Fonction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fonction</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoChampMinesTerrestreFonction
	 * @see #isSetFonction()
	 * @see #unsetFonction()
	 * @see #getFonction()
	 * @generated
	 */
	void setFonction(TypeDictionaryDicoChampMinesTerrestreFonction value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeChampMinesTerrestre#getFonction <em>Fonction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFonction()
	 * @see #getFonction()
	 * @see #setFonction(TypeDictionaryDicoChampMinesTerrestreFonction)
	 * @generated
	 */
	void unsetFonction();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeChampMinesTerrestre#getFonction <em>Fonction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fonction</em>' attribute is set.
	 * @see #unsetFonction()
	 * @see #getFonction()
	 * @see #setFonction(TypeDictionaryDicoChampMinesTerrestreFonction)
	 * @generated
	 */
	boolean isSetFonction();

	/**
	 * Returns the value of the '<em><b>Enfouissement</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoChampMinesTerrestreEnfouissement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enfouissement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enfouissement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoChampMinesTerrestreEnfouissement
	 * @see #isSetEnfouissement()
	 * @see #unsetEnfouissement()
	 * @see #setEnfouissement(TypeDictionaryDicoChampMinesTerrestreEnfouissement)
	 * @see mpia.schema.SchemaPackage#getTypeChampMinesTerrestre_Enfouissement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Enfouissement'"
	 * @generated
	 */
	TypeDictionaryDicoChampMinesTerrestreEnfouissement getEnfouissement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeChampMinesTerrestre#getEnfouissement <em>Enfouissement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enfouissement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoChampMinesTerrestreEnfouissement
	 * @see #isSetEnfouissement()
	 * @see #unsetEnfouissement()
	 * @see #getEnfouissement()
	 * @generated
	 */
	void setEnfouissement(TypeDictionaryDicoChampMinesTerrestreEnfouissement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeChampMinesTerrestre#getEnfouissement <em>Enfouissement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnfouissement()
	 * @see #getEnfouissement()
	 * @see #setEnfouissement(TypeDictionaryDicoChampMinesTerrestreEnfouissement)
	 * @generated
	 */
	void unsetEnfouissement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeChampMinesTerrestre#getEnfouissement <em>Enfouissement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Enfouissement</em>' attribute is set.
	 * @see #unsetEnfouissement()
	 * @see #getEnfouissement()
	 * @see #setEnfouissement(TypeDictionaryDicoChampMinesTerrestreEnfouissement)
	 * @generated
	 */
	boolean isSetEnfouissement();

	/**
	 * Returns the value of the '<em><b>Dispersion</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoChampMinesTerrestreDispersion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dispersion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dispersion</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoChampMinesTerrestreDispersion
	 * @see #isSetDispersion()
	 * @see #unsetDispersion()
	 * @see #setDispersion(TypeDictionaryDicoChampMinesTerrestreDispersion)
	 * @see mpia.schema.SchemaPackage#getTypeChampMinesTerrestre_Dispersion()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Dispersion'"
	 * @generated
	 */
	TypeDictionaryDicoChampMinesTerrestreDispersion getDispersion();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeChampMinesTerrestre#getDispersion <em>Dispersion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dispersion</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoChampMinesTerrestreDispersion
	 * @see #isSetDispersion()
	 * @see #unsetDispersion()
	 * @see #getDispersion()
	 * @generated
	 */
	void setDispersion(TypeDictionaryDicoChampMinesTerrestreDispersion value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeChampMinesTerrestre#getDispersion <em>Dispersion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDispersion()
	 * @see #getDispersion()
	 * @see #setDispersion(TypeDictionaryDicoChampMinesTerrestreDispersion)
	 * @generated
	 */
	void unsetDispersion();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeChampMinesTerrestre#getDispersion <em>Dispersion</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dispersion</em>' attribute is set.
	 * @see #unsetDispersion()
	 * @see #getDispersion()
	 * @see #setDispersion(TypeDictionaryDicoChampMinesTerrestreDispersion)
	 * @generated
	 */
	boolean isSetDispersion();

	/**
	 * Returns the value of the '<em><b>Persistance</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoChampMinesTerrestrePersistance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistance</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoChampMinesTerrestrePersistance
	 * @see #isSetPersistance()
	 * @see #unsetPersistance()
	 * @see #setPersistance(TypeDictionaryDicoChampMinesTerrestrePersistance)
	 * @see mpia.schema.SchemaPackage#getTypeChampMinesTerrestre_Persistance()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Persistance'"
	 * @generated
	 */
	TypeDictionaryDicoChampMinesTerrestrePersistance getPersistance();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeChampMinesTerrestre#getPersistance <em>Persistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistance</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoChampMinesTerrestrePersistance
	 * @see #isSetPersistance()
	 * @see #unsetPersistance()
	 * @see #getPersistance()
	 * @generated
	 */
	void setPersistance(TypeDictionaryDicoChampMinesTerrestrePersistance value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeChampMinesTerrestre#getPersistance <em>Persistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPersistance()
	 * @see #getPersistance()
	 * @see #setPersistance(TypeDictionaryDicoChampMinesTerrestrePersistance)
	 * @generated
	 */
	void unsetPersistance();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeChampMinesTerrestre#getPersistance <em>Persistance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Persistance</em>' attribute is set.
	 * @see #unsetPersistance()
	 * @see #getPersistance()
	 * @see #setPersistance(TypeDictionaryDicoChampMinesTerrestrePersistance)
	 * @generated
	 */
	boolean isSetPersistance();

	/**
	 * Returns the value of the '<em><b>Pouvoir Arret</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoChampMinesTerrestrePouvoirArret}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pouvoir Arret</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pouvoir Arret</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoChampMinesTerrestrePouvoirArret
	 * @see #isSetPouvoirArret()
	 * @see #unsetPouvoirArret()
	 * @see #setPouvoirArret(TypeDictionaryDicoChampMinesTerrestrePouvoirArret)
	 * @see mpia.schema.SchemaPackage#getTypeChampMinesTerrestre_PouvoirArret()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='PouvoirArret'"
	 * @generated
	 */
	TypeDictionaryDicoChampMinesTerrestrePouvoirArret getPouvoirArret();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeChampMinesTerrestre#getPouvoirArret <em>Pouvoir Arret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pouvoir Arret</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoChampMinesTerrestrePouvoirArret
	 * @see #isSetPouvoirArret()
	 * @see #unsetPouvoirArret()
	 * @see #getPouvoirArret()
	 * @generated
	 */
	void setPouvoirArret(TypeDictionaryDicoChampMinesTerrestrePouvoirArret value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeChampMinesTerrestre#getPouvoirArret <em>Pouvoir Arret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPouvoirArret()
	 * @see #getPouvoirArret()
	 * @see #setPouvoirArret(TypeDictionaryDicoChampMinesTerrestrePouvoirArret)
	 * @generated
	 */
	void unsetPouvoirArret();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeChampMinesTerrestre#getPouvoirArret <em>Pouvoir Arret</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pouvoir Arret</em>' attribute is set.
	 * @see #unsetPouvoirArret()
	 * @see #getPouvoirArret()
	 * @see #setPouvoirArret(TypeDictionaryDicoChampMinesTerrestrePouvoirArret)
	 * @generated
	 */
	boolean isSetPouvoirArret();

} // TypeChampMinesTerrestre
