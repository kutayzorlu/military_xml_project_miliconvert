/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Objet Libre</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeObjetLibre#getCouleur <em>Couleur</em>}</li>
 *   <li>{@link mpia.schema.TypeObjetLibre#isTraitEpais <em>Trait Epais</em>}</li>
 *   <li>{@link mpia.schema.TypeObjetLibre#isTraitPointille <em>Trait Pointille</em>}</li>
 *   <li>{@link mpia.schema.TypeObjetLibre#isZoneHachuree <em>Zone Hachuree</em>}</li>
 *   <li>{@link mpia.schema.TypeObjetLibre#getEstLocaliseEnLocalisation <em>Est Localise En Localisation</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeObjetLibre()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_ObjetLibre' kind='elementOnly'"
 * @generated
 */
public interface TypeObjetLibre extends TypeRacineOperationnelle {
	/**
	 * Returns the value of the '<em><b>Couleur</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCouleur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Couleur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Couleur</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCouleur
	 * @see #isSetCouleur()
	 * @see #unsetCouleur()
	 * @see #setCouleur(TypeDictionaryDicoCouleur)
	 * @see mpia.schema.SchemaPackage#getTypeObjetLibre_Couleur()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Couleur'"
	 * @generated
	 */
	TypeDictionaryDicoCouleur getCouleur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjetLibre#getCouleur <em>Couleur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Couleur</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCouleur
	 * @see #isSetCouleur()
	 * @see #unsetCouleur()
	 * @see #getCouleur()
	 * @generated
	 */
	void setCouleur(TypeDictionaryDicoCouleur value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeObjetLibre#getCouleur <em>Couleur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCouleur()
	 * @see #getCouleur()
	 * @see #setCouleur(TypeDictionaryDicoCouleur)
	 * @generated
	 */
	void unsetCouleur();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeObjetLibre#getCouleur <em>Couleur</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Couleur</em>' attribute is set.
	 * @see #unsetCouleur()
	 * @see #getCouleur()
	 * @see #setCouleur(TypeDictionaryDicoCouleur)
	 * @generated
	 */
	boolean isSetCouleur();

	/**
	 * Returns the value of the '<em><b>Trait Epais</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trait Epais</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trait Epais</em>' attribute.
	 * @see #isSetTraitEpais()
	 * @see #unsetTraitEpais()
	 * @see #setTraitEpais(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeObjetLibre_TraitEpais()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='TraitEpais'"
	 * @generated
	 */
	boolean isTraitEpais();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjetLibre#isTraitEpais <em>Trait Epais</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trait Epais</em>' attribute.
	 * @see #isSetTraitEpais()
	 * @see #unsetTraitEpais()
	 * @see #isTraitEpais()
	 * @generated
	 */
	void setTraitEpais(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeObjetLibre#isTraitEpais <em>Trait Epais</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTraitEpais()
	 * @see #isTraitEpais()
	 * @see #setTraitEpais(boolean)
	 * @generated
	 */
	void unsetTraitEpais();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeObjetLibre#isTraitEpais <em>Trait Epais</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Trait Epais</em>' attribute is set.
	 * @see #unsetTraitEpais()
	 * @see #isTraitEpais()
	 * @see #setTraitEpais(boolean)
	 * @generated
	 */
	boolean isSetTraitEpais();

	/**
	 * Returns the value of the '<em><b>Trait Pointille</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trait Pointille</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trait Pointille</em>' attribute.
	 * @see #isSetTraitPointille()
	 * @see #unsetTraitPointille()
	 * @see #setTraitPointille(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeObjetLibre_TraitPointille()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='TraitPointille'"
	 * @generated
	 */
	boolean isTraitPointille();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjetLibre#isTraitPointille <em>Trait Pointille</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trait Pointille</em>' attribute.
	 * @see #isSetTraitPointille()
	 * @see #unsetTraitPointille()
	 * @see #isTraitPointille()
	 * @generated
	 */
	void setTraitPointille(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeObjetLibre#isTraitPointille <em>Trait Pointille</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTraitPointille()
	 * @see #isTraitPointille()
	 * @see #setTraitPointille(boolean)
	 * @generated
	 */
	void unsetTraitPointille();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeObjetLibre#isTraitPointille <em>Trait Pointille</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Trait Pointille</em>' attribute is set.
	 * @see #unsetTraitPointille()
	 * @see #isTraitPointille()
	 * @see #setTraitPointille(boolean)
	 * @generated
	 */
	boolean isSetTraitPointille();

	/**
	 * Returns the value of the '<em><b>Zone Hachuree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zone Hachuree</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone Hachuree</em>' attribute.
	 * @see #isSetZoneHachuree()
	 * @see #unsetZoneHachuree()
	 * @see #setZoneHachuree(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeObjetLibre_ZoneHachuree()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='ZoneHachuree'"
	 * @generated
	 */
	boolean isZoneHachuree();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjetLibre#isZoneHachuree <em>Zone Hachuree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zone Hachuree</em>' attribute.
	 * @see #isSetZoneHachuree()
	 * @see #unsetZoneHachuree()
	 * @see #isZoneHachuree()
	 * @generated
	 */
	void setZoneHachuree(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeObjetLibre#isZoneHachuree <em>Zone Hachuree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetZoneHachuree()
	 * @see #isZoneHachuree()
	 * @see #setZoneHachuree(boolean)
	 * @generated
	 */
	void unsetZoneHachuree();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeObjetLibre#isZoneHachuree <em>Zone Hachuree</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Zone Hachuree</em>' attribute is set.
	 * @see #unsetZoneHachuree()
	 * @see #isZoneHachuree()
	 * @see #setZoneHachuree(boolean)
	 * @generated
	 */
	boolean isSetZoneHachuree();

	/**
	 * Returns the value of the '<em><b>Est Localise En Localisation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Localise En Localisation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Localise En Localisation</em>' containment reference.
	 * @see #setEstLocaliseEnLocalisation(TypeLocalisation)
	 * @see mpia.schema.SchemaPackage#getTypeObjetLibre_EstLocaliseEnLocalisation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Localisation'"
	 *        extendedMetaData="kind='element' name='EstLocaliseEn_Localisation'"
	 * @generated
	 */
	TypeLocalisation getEstLocaliseEnLocalisation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjetLibre#getEstLocaliseEnLocalisation <em>Est Localise En Localisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Localise En Localisation</em>' containment reference.
	 * @see #getEstLocaliseEnLocalisation()
	 * @generated
	 */
	void setEstLocaliseEnLocalisation(TypeLocalisation value);

} // TypeObjetLibre
