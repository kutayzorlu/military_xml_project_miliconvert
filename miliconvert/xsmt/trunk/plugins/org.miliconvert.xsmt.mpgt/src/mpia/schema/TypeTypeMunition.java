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
 * A representation of the model object '<em><b>Type Type Munition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeTypeMunition#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeMunition#getChargement <em>Chargement</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeMunition#getCalibre <em>Calibre</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeMunition#getMecanismeTirMineMaritime <em>Mecanisme Tir Mine Maritime</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeMunition#getCouleurEclatMineExercice <em>Couleur Eclat Mine Exercice</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeMunition#getEstTypeMunitionsAssocieCapaciteFeux <em>Est Type Munitions Associe Capacite Feux</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeTypeMunition()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_TypeMunition' kind='elementOnly'"
 * @generated
 */
public interface TypeTypeMunition extends TypeTypeConsommable {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeMunitionCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeMunitionCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypeMunitionCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeTypeMunition_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoTypeMunitionCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeMunition#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeMunitionCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoTypeMunitionCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeMunition#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypeMunitionCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeMunition#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypeMunitionCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Chargement</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeMunitionChargement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chargement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chargement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeMunitionChargement
	 * @see #isSetChargement()
	 * @see #unsetChargement()
	 * @see #setChargement(TypeDictionaryDicoTypeMunitionChargement)
	 * @see mpia.schema.SchemaPackage#getTypeTypeMunition_Chargement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Chargement'"
	 * @generated
	 */
	TypeDictionaryDicoTypeMunitionChargement getChargement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeMunition#getChargement <em>Chargement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chargement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeMunitionChargement
	 * @see #isSetChargement()
	 * @see #unsetChargement()
	 * @see #getChargement()
	 * @generated
	 */
	void setChargement(TypeDictionaryDicoTypeMunitionChargement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeMunition#getChargement <em>Chargement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetChargement()
	 * @see #getChargement()
	 * @see #setChargement(TypeDictionaryDicoTypeMunitionChargement)
	 * @generated
	 */
	void unsetChargement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeMunition#getChargement <em>Chargement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Chargement</em>' attribute is set.
	 * @see #unsetChargement()
	 * @see #getChargement()
	 * @see #setChargement(TypeDictionaryDicoTypeMunitionChargement)
	 * @generated
	 */
	boolean isSetChargement();

	/**
	 * Returns the value of the '<em><b>Calibre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calibre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calibre</em>' attribute.
	 * @see #setCalibre(String)
	 * @see mpia.schema.SchemaPackage#getTypeTypeMunition_Calibre()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='Calibre'"
	 * @generated
	 */
	String getCalibre();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeMunition#getCalibre <em>Calibre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calibre</em>' attribute.
	 * @see #getCalibre()
	 * @generated
	 */
	void setCalibre(String value);

	/**
	 * Returns the value of the '<em><b>Mecanisme Tir Mine Maritime</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeMunitionMecanismeTirMineMaritime}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mecanisme Tir Mine Maritime</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mecanisme Tir Mine Maritime</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeMunitionMecanismeTirMineMaritime
	 * @see #isSetMecanismeTirMineMaritime()
	 * @see #unsetMecanismeTirMineMaritime()
	 * @see #setMecanismeTirMineMaritime(TypeDictionaryDicoTypeMunitionMecanismeTirMineMaritime)
	 * @see mpia.schema.SchemaPackage#getTypeTypeMunition_MecanismeTirMineMaritime()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='MecanismeTirMineMaritime'"
	 * @generated
	 */
	TypeDictionaryDicoTypeMunitionMecanismeTirMineMaritime getMecanismeTirMineMaritime();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeMunition#getMecanismeTirMineMaritime <em>Mecanisme Tir Mine Maritime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mecanisme Tir Mine Maritime</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeMunitionMecanismeTirMineMaritime
	 * @see #isSetMecanismeTirMineMaritime()
	 * @see #unsetMecanismeTirMineMaritime()
	 * @see #getMecanismeTirMineMaritime()
	 * @generated
	 */
	void setMecanismeTirMineMaritime(TypeDictionaryDicoTypeMunitionMecanismeTirMineMaritime value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeMunition#getMecanismeTirMineMaritime <em>Mecanisme Tir Mine Maritime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMecanismeTirMineMaritime()
	 * @see #getMecanismeTirMineMaritime()
	 * @see #setMecanismeTirMineMaritime(TypeDictionaryDicoTypeMunitionMecanismeTirMineMaritime)
	 * @generated
	 */
	void unsetMecanismeTirMineMaritime();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeMunition#getMecanismeTirMineMaritime <em>Mecanisme Tir Mine Maritime</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mecanisme Tir Mine Maritime</em>' attribute is set.
	 * @see #unsetMecanismeTirMineMaritime()
	 * @see #getMecanismeTirMineMaritime()
	 * @see #setMecanismeTirMineMaritime(TypeDictionaryDicoTypeMunitionMecanismeTirMineMaritime)
	 * @generated
	 */
	boolean isSetMecanismeTirMineMaritime();

	/**
	 * Returns the value of the '<em><b>Couleur Eclat Mine Exercice</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeMunitionCouleurEclatMineExercice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Couleur Eclat Mine Exercice</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Couleur Eclat Mine Exercice</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeMunitionCouleurEclatMineExercice
	 * @see #isSetCouleurEclatMineExercice()
	 * @see #unsetCouleurEclatMineExercice()
	 * @see #setCouleurEclatMineExercice(TypeDictionaryDicoTypeMunitionCouleurEclatMineExercice)
	 * @see mpia.schema.SchemaPackage#getTypeTypeMunition_CouleurEclatMineExercice()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='CouleurEclatMineExercice'"
	 * @generated
	 */
	TypeDictionaryDicoTypeMunitionCouleurEclatMineExercice getCouleurEclatMineExercice();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeMunition#getCouleurEclatMineExercice <em>Couleur Eclat Mine Exercice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Couleur Eclat Mine Exercice</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeMunitionCouleurEclatMineExercice
	 * @see #isSetCouleurEclatMineExercice()
	 * @see #unsetCouleurEclatMineExercice()
	 * @see #getCouleurEclatMineExercice()
	 * @generated
	 */
	void setCouleurEclatMineExercice(TypeDictionaryDicoTypeMunitionCouleurEclatMineExercice value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeMunition#getCouleurEclatMineExercice <em>Couleur Eclat Mine Exercice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCouleurEclatMineExercice()
	 * @see #getCouleurEclatMineExercice()
	 * @see #setCouleurEclatMineExercice(TypeDictionaryDicoTypeMunitionCouleurEclatMineExercice)
	 * @generated
	 */
	void unsetCouleurEclatMineExercice();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeMunition#getCouleurEclatMineExercice <em>Couleur Eclat Mine Exercice</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Couleur Eclat Mine Exercice</em>' attribute is set.
	 * @see #unsetCouleurEclatMineExercice()
	 * @see #getCouleurEclatMineExercice()
	 * @see #setCouleurEclatMineExercice(TypeDictionaryDicoTypeMunitionCouleurEclatMineExercice)
	 * @generated
	 */
	boolean isSetCouleurEclatMineExercice();

	/**
	 * Returns the value of the '<em><b>Est Type Munitions Associe Capacite Feux</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Type Munitions Associe Capacite Feux</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Type Munitions Associe Capacite Feux</em>' containment reference.
	 * @see #setEstTypeMunitionsAssocieCapaciteFeux(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeTypeMunition_EstTypeMunitionsAssocieCapaciteFeux()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeMunitions_TypeMunition' target_entity='type_CapaciteFeux'"
	 *        extendedMetaData="kind='element' name='EstTypeMunitionsAssocie_CapaciteFeux'"
	 * @generated
	 */
	TypeAssociation getEstTypeMunitionsAssocieCapaciteFeux();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeMunition#getEstTypeMunitionsAssocieCapaciteFeux <em>Est Type Munitions Associe Capacite Feux</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Type Munitions Associe Capacite Feux</em>' containment reference.
	 * @see #getEstTypeMunitionsAssocieCapaciteFeux()
	 * @generated
	 */
	void setEstTypeMunitionsAssocieCapaciteFeux(TypeAssociation value);

} // TypeTypeMunition
