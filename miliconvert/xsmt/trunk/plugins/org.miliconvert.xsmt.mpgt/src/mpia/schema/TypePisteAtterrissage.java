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
 * A representation of the model object '<em><b>Type Piste Atterrissage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypePisteAtterrissage#getQFU1 <em>QFU1</em>}</li>
 *   <li>{@link mpia.schema.TypePisteAtterrissage#isPistePrincipale <em>Piste Principale</em>}</li>
 *   <li>{@link mpia.schema.TypePisteAtterrissage#isBalisage <em>Balisage</em>}</li>
 *   <li>{@link mpia.schema.TypePisteAtterrissage#getLongueurPiste <em>Longueur Piste</em>}</li>
 *   <li>{@link mpia.schema.TypePisteAtterrissage#getLargeurPiste <em>Largeur Piste</em>}</li>
 *   <li>{@link mpia.schema.TypePisteAtterrissage#isPrecisionAtterrissage <em>Precision Atterrissage</em>}</li>
 *   <li>{@link mpia.schema.TypePisteAtterrissage#getPressionMaximale <em>Pression Maximale</em>}</li>
 *   <li>{@link mpia.schema.TypePisteAtterrissage#getRevetement <em>Revetement</em>}</li>
 *   <li>{@link mpia.schema.TypePisteAtterrissage#getTypeClassificationRevetement <em>Type Classification Revetement</em>}</li>
 *   <li>{@link mpia.schema.TypePisteAtterrissage#getSousClassificationRevetement <em>Sous Classification Revetement</em>}</li>
 *   <li>{@link mpia.schema.TypePisteAtterrissage#getNumeroClassificationRevetement <em>Numero Classification Revetement</em>}</li>
 *   <li>{@link mpia.schema.TypePisteAtterrissage#getPressionMaximalePneusRevetement <em>Pression Maximale Pneus Revetement</em>}</li>
 *   <li>{@link mpia.schema.TypePisteAtterrissage#getMethodeEvaluationRevetement <em>Methode Evaluation Revetement</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypePisteAtterrissage()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_PisteAtterrissage' kind='elementOnly'"
 * @generated
 */
public interface TypePisteAtterrissage extends TypeSite {
	/**
	 * Returns the value of the '<em><b>QFU1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QFU1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QFU1</em>' attribute.
	 * @see #setQFU1(String)
	 * @see mpia.schema.SchemaPackage#getTypePisteAtterrissage_QFU1()
	 * @model dataType="mpia.meta.TypeDataTypeChaine03"
	 *        extendedMetaData="kind='element' name='QFU1'"
	 * @generated
	 */
	String getQFU1();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePisteAtterrissage#getQFU1 <em>QFU1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QFU1</em>' attribute.
	 * @see #getQFU1()
	 * @generated
	 */
	void setQFU1(String value);

	/**
	 * Returns the value of the '<em><b>Piste Principale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Piste Principale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Piste Principale</em>' attribute.
	 * @see #isSetPistePrincipale()
	 * @see #unsetPistePrincipale()
	 * @see #setPistePrincipale(boolean)
	 * @see mpia.schema.SchemaPackage#getTypePisteAtterrissage_PistePrincipale()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='PistePrincipale'"
	 * @generated
	 */
	boolean isPistePrincipale();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePisteAtterrissage#isPistePrincipale <em>Piste Principale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Piste Principale</em>' attribute.
	 * @see #isSetPistePrincipale()
	 * @see #unsetPistePrincipale()
	 * @see #isPistePrincipale()
	 * @generated
	 */
	void setPistePrincipale(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePisteAtterrissage#isPistePrincipale <em>Piste Principale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPistePrincipale()
	 * @see #isPistePrincipale()
	 * @see #setPistePrincipale(boolean)
	 * @generated
	 */
	void unsetPistePrincipale();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePisteAtterrissage#isPistePrincipale <em>Piste Principale</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Piste Principale</em>' attribute is set.
	 * @see #unsetPistePrincipale()
	 * @see #isPistePrincipale()
	 * @see #setPistePrincipale(boolean)
	 * @generated
	 */
	boolean isSetPistePrincipale();

	/**
	 * Returns the value of the '<em><b>Balisage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Balisage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Balisage</em>' attribute.
	 * @see #isSetBalisage()
	 * @see #unsetBalisage()
	 * @see #setBalisage(boolean)
	 * @see mpia.schema.SchemaPackage#getTypePisteAtterrissage_Balisage()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='Balisage'"
	 * @generated
	 */
	boolean isBalisage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePisteAtterrissage#isBalisage <em>Balisage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Balisage</em>' attribute.
	 * @see #isSetBalisage()
	 * @see #unsetBalisage()
	 * @see #isBalisage()
	 * @generated
	 */
	void setBalisage(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePisteAtterrissage#isBalisage <em>Balisage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBalisage()
	 * @see #isBalisage()
	 * @see #setBalisage(boolean)
	 * @generated
	 */
	void unsetBalisage();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePisteAtterrissage#isBalisage <em>Balisage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Balisage</em>' attribute is set.
	 * @see #unsetBalisage()
	 * @see #isBalisage()
	 * @see #setBalisage(boolean)
	 * @generated
	 */
	boolean isSetBalisage();

	/**
	 * Returns the value of the '<em><b>Longueur Piste</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Longueur Piste</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longueur Piste</em>' containment reference.
	 * @see #setLongueurPiste(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypePisteAtterrissage_LongueurPiste()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LongueurPiste'"
	 * @generated
	 */
	TypeDataTypeLongueur getLongueurPiste();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePisteAtterrissage#getLongueurPiste <em>Longueur Piste</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longueur Piste</em>' containment reference.
	 * @see #getLongueurPiste()
	 * @generated
	 */
	void setLongueurPiste(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Largeur Piste</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Largeur Piste</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Largeur Piste</em>' containment reference.
	 * @see #setLargeurPiste(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypePisteAtterrissage_LargeurPiste()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LargeurPiste'"
	 * @generated
	 */
	TypeDataTypeLongueur getLargeurPiste();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePisteAtterrissage#getLargeurPiste <em>Largeur Piste</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Largeur Piste</em>' containment reference.
	 * @see #getLargeurPiste()
	 * @generated
	 */
	void setLargeurPiste(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Precision Atterrissage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision Atterrissage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision Atterrissage</em>' attribute.
	 * @see #isSetPrecisionAtterrissage()
	 * @see #unsetPrecisionAtterrissage()
	 * @see #setPrecisionAtterrissage(boolean)
	 * @see mpia.schema.SchemaPackage#getTypePisteAtterrissage_PrecisionAtterrissage()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='PrecisionAtterrissage'"
	 * @generated
	 */
	boolean isPrecisionAtterrissage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePisteAtterrissage#isPrecisionAtterrissage <em>Precision Atterrissage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision Atterrissage</em>' attribute.
	 * @see #isSetPrecisionAtterrissage()
	 * @see #unsetPrecisionAtterrissage()
	 * @see #isPrecisionAtterrissage()
	 * @generated
	 */
	void setPrecisionAtterrissage(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePisteAtterrissage#isPrecisionAtterrissage <em>Precision Atterrissage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrecisionAtterrissage()
	 * @see #isPrecisionAtterrissage()
	 * @see #setPrecisionAtterrissage(boolean)
	 * @generated
	 */
	void unsetPrecisionAtterrissage();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePisteAtterrissage#isPrecisionAtterrissage <em>Precision Atterrissage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Precision Atterrissage</em>' attribute is set.
	 * @see #unsetPrecisionAtterrissage()
	 * @see #isPrecisionAtterrissage()
	 * @see #setPrecisionAtterrissage(boolean)
	 * @generated
	 */
	boolean isSetPrecisionAtterrissage();

	/**
	 * Returns the value of the '<em><b>Pression Maximale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pression Maximale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pression Maximale</em>' attribute.
	 * @see #isSetPressionMaximale()
	 * @see #unsetPressionMaximale()
	 * @see #setPressionMaximale(double)
	 * @see mpia.schema.SchemaPackage#getTypePisteAtterrissage_PressionMaximale()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='PressionMaximale'"
	 * @generated
	 */
	double getPressionMaximale();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePisteAtterrissage#getPressionMaximale <em>Pression Maximale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pression Maximale</em>' attribute.
	 * @see #isSetPressionMaximale()
	 * @see #unsetPressionMaximale()
	 * @see #getPressionMaximale()
	 * @generated
	 */
	void setPressionMaximale(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePisteAtterrissage#getPressionMaximale <em>Pression Maximale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPressionMaximale()
	 * @see #getPressionMaximale()
	 * @see #setPressionMaximale(double)
	 * @generated
	 */
	void unsetPressionMaximale();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePisteAtterrissage#getPressionMaximale <em>Pression Maximale</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pression Maximale</em>' attribute is set.
	 * @see #unsetPressionMaximale()
	 * @see #getPressionMaximale()
	 * @see #setPressionMaximale(double)
	 * @generated
	 */
	boolean isSetPressionMaximale();

	/**
	 * Returns the value of the '<em><b>Revetement</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPisteAtterrissageRevetement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revetement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revetement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPisteAtterrissageRevetement
	 * @see #isSetRevetement()
	 * @see #unsetRevetement()
	 * @see #setRevetement(TypeDictionaryDicoPisteAtterrissageRevetement)
	 * @see mpia.schema.SchemaPackage#getTypePisteAtterrissage_Revetement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Revetement'"
	 * @generated
	 */
	TypeDictionaryDicoPisteAtterrissageRevetement getRevetement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePisteAtterrissage#getRevetement <em>Revetement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revetement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPisteAtterrissageRevetement
	 * @see #isSetRevetement()
	 * @see #unsetRevetement()
	 * @see #getRevetement()
	 * @generated
	 */
	void setRevetement(TypeDictionaryDicoPisteAtterrissageRevetement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePisteAtterrissage#getRevetement <em>Revetement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRevetement()
	 * @see #getRevetement()
	 * @see #setRevetement(TypeDictionaryDicoPisteAtterrissageRevetement)
	 * @generated
	 */
	void unsetRevetement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePisteAtterrissage#getRevetement <em>Revetement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Revetement</em>' attribute is set.
	 * @see #unsetRevetement()
	 * @see #getRevetement()
	 * @see #setRevetement(TypeDictionaryDicoPisteAtterrissageRevetement)
	 * @generated
	 */
	boolean isSetRevetement();

	/**
	 * Returns the value of the '<em><b>Type Classification Revetement</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPisteAtterrissageTypeClassificationRevetement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Classification Revetement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Classification Revetement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPisteAtterrissageTypeClassificationRevetement
	 * @see #isSetTypeClassificationRevetement()
	 * @see #unsetTypeClassificationRevetement()
	 * @see #setTypeClassificationRevetement(TypeDictionaryDicoPisteAtterrissageTypeClassificationRevetement)
	 * @see mpia.schema.SchemaPackage#getTypePisteAtterrissage_TypeClassificationRevetement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeClassificationRevetement'"
	 * @generated
	 */
	TypeDictionaryDicoPisteAtterrissageTypeClassificationRevetement getTypeClassificationRevetement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePisteAtterrissage#getTypeClassificationRevetement <em>Type Classification Revetement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Classification Revetement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPisteAtterrissageTypeClassificationRevetement
	 * @see #isSetTypeClassificationRevetement()
	 * @see #unsetTypeClassificationRevetement()
	 * @see #getTypeClassificationRevetement()
	 * @generated
	 */
	void setTypeClassificationRevetement(TypeDictionaryDicoPisteAtterrissageTypeClassificationRevetement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePisteAtterrissage#getTypeClassificationRevetement <em>Type Classification Revetement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeClassificationRevetement()
	 * @see #getTypeClassificationRevetement()
	 * @see #setTypeClassificationRevetement(TypeDictionaryDicoPisteAtterrissageTypeClassificationRevetement)
	 * @generated
	 */
	void unsetTypeClassificationRevetement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePisteAtterrissage#getTypeClassificationRevetement <em>Type Classification Revetement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Classification Revetement</em>' attribute is set.
	 * @see #unsetTypeClassificationRevetement()
	 * @see #getTypeClassificationRevetement()
	 * @see #setTypeClassificationRevetement(TypeDictionaryDicoPisteAtterrissageTypeClassificationRevetement)
	 * @generated
	 */
	boolean isSetTypeClassificationRevetement();

	/**
	 * Returns the value of the '<em><b>Sous Classification Revetement</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPisteAtterrissageSousClassificationRevetement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sous Classification Revetement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sous Classification Revetement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPisteAtterrissageSousClassificationRevetement
	 * @see #isSetSousClassificationRevetement()
	 * @see #unsetSousClassificationRevetement()
	 * @see #setSousClassificationRevetement(TypeDictionaryDicoPisteAtterrissageSousClassificationRevetement)
	 * @see mpia.schema.SchemaPackage#getTypePisteAtterrissage_SousClassificationRevetement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SousClassificationRevetement'"
	 * @generated
	 */
	TypeDictionaryDicoPisteAtterrissageSousClassificationRevetement getSousClassificationRevetement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePisteAtterrissage#getSousClassificationRevetement <em>Sous Classification Revetement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sous Classification Revetement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPisteAtterrissageSousClassificationRevetement
	 * @see #isSetSousClassificationRevetement()
	 * @see #unsetSousClassificationRevetement()
	 * @see #getSousClassificationRevetement()
	 * @generated
	 */
	void setSousClassificationRevetement(TypeDictionaryDicoPisteAtterrissageSousClassificationRevetement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePisteAtterrissage#getSousClassificationRevetement <em>Sous Classification Revetement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSousClassificationRevetement()
	 * @see #getSousClassificationRevetement()
	 * @see #setSousClassificationRevetement(TypeDictionaryDicoPisteAtterrissageSousClassificationRevetement)
	 * @generated
	 */
	void unsetSousClassificationRevetement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePisteAtterrissage#getSousClassificationRevetement <em>Sous Classification Revetement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sous Classification Revetement</em>' attribute is set.
	 * @see #unsetSousClassificationRevetement()
	 * @see #getSousClassificationRevetement()
	 * @see #setSousClassificationRevetement(TypeDictionaryDicoPisteAtterrissageSousClassificationRevetement)
	 * @generated
	 */
	boolean isSetSousClassificationRevetement();

	/**
	 * Returns the value of the '<em><b>Numero Classification Revetement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Classification Revetement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Classification Revetement</em>' attribute.
	 * @see #isSetNumeroClassificationRevetement()
	 * @see #unsetNumeroClassificationRevetement()
	 * @see #setNumeroClassificationRevetement(long)
	 * @see mpia.schema.SchemaPackage#getTypePisteAtterrissage_NumeroClassificationRevetement()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NumeroClassificationRevetement'"
	 * @generated
	 */
	long getNumeroClassificationRevetement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePisteAtterrissage#getNumeroClassificationRevetement <em>Numero Classification Revetement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Classification Revetement</em>' attribute.
	 * @see #isSetNumeroClassificationRevetement()
	 * @see #unsetNumeroClassificationRevetement()
	 * @see #getNumeroClassificationRevetement()
	 * @generated
	 */
	void setNumeroClassificationRevetement(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePisteAtterrissage#getNumeroClassificationRevetement <em>Numero Classification Revetement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumeroClassificationRevetement()
	 * @see #getNumeroClassificationRevetement()
	 * @see #setNumeroClassificationRevetement(long)
	 * @generated
	 */
	void unsetNumeroClassificationRevetement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePisteAtterrissage#getNumeroClassificationRevetement <em>Numero Classification Revetement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Numero Classification Revetement</em>' attribute is set.
	 * @see #unsetNumeroClassificationRevetement()
	 * @see #getNumeroClassificationRevetement()
	 * @see #setNumeroClassificationRevetement(long)
	 * @generated
	 */
	boolean isSetNumeroClassificationRevetement();

	/**
	 * Returns the value of the '<em><b>Pression Maximale Pneus Revetement</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPisteAtterrissagePressionMaximalePneusRevetement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pression Maximale Pneus Revetement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pression Maximale Pneus Revetement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPisteAtterrissagePressionMaximalePneusRevetement
	 * @see #isSetPressionMaximalePneusRevetement()
	 * @see #unsetPressionMaximalePneusRevetement()
	 * @see #setPressionMaximalePneusRevetement(TypeDictionaryDicoPisteAtterrissagePressionMaximalePneusRevetement)
	 * @see mpia.schema.SchemaPackage#getTypePisteAtterrissage_PressionMaximalePneusRevetement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='PressionMaximalePneusRevetement'"
	 * @generated
	 */
	TypeDictionaryDicoPisteAtterrissagePressionMaximalePneusRevetement getPressionMaximalePneusRevetement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePisteAtterrissage#getPressionMaximalePneusRevetement <em>Pression Maximale Pneus Revetement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pression Maximale Pneus Revetement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPisteAtterrissagePressionMaximalePneusRevetement
	 * @see #isSetPressionMaximalePneusRevetement()
	 * @see #unsetPressionMaximalePneusRevetement()
	 * @see #getPressionMaximalePneusRevetement()
	 * @generated
	 */
	void setPressionMaximalePneusRevetement(TypeDictionaryDicoPisteAtterrissagePressionMaximalePneusRevetement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePisteAtterrissage#getPressionMaximalePneusRevetement <em>Pression Maximale Pneus Revetement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPressionMaximalePneusRevetement()
	 * @see #getPressionMaximalePneusRevetement()
	 * @see #setPressionMaximalePneusRevetement(TypeDictionaryDicoPisteAtterrissagePressionMaximalePneusRevetement)
	 * @generated
	 */
	void unsetPressionMaximalePneusRevetement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePisteAtterrissage#getPressionMaximalePneusRevetement <em>Pression Maximale Pneus Revetement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pression Maximale Pneus Revetement</em>' attribute is set.
	 * @see #unsetPressionMaximalePneusRevetement()
	 * @see #getPressionMaximalePneusRevetement()
	 * @see #setPressionMaximalePneusRevetement(TypeDictionaryDicoPisteAtterrissagePressionMaximalePneusRevetement)
	 * @generated
	 */
	boolean isSetPressionMaximalePneusRevetement();

	/**
	 * Returns the value of the '<em><b>Methode Evaluation Revetement</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPisteAtterrissageMethodeEvaluationRevetement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methode Evaluation Revetement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methode Evaluation Revetement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPisteAtterrissageMethodeEvaluationRevetement
	 * @see #isSetMethodeEvaluationRevetement()
	 * @see #unsetMethodeEvaluationRevetement()
	 * @see #setMethodeEvaluationRevetement(TypeDictionaryDicoPisteAtterrissageMethodeEvaluationRevetement)
	 * @see mpia.schema.SchemaPackage#getTypePisteAtterrissage_MethodeEvaluationRevetement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='MethodeEvaluationRevetement'"
	 * @generated
	 */
	TypeDictionaryDicoPisteAtterrissageMethodeEvaluationRevetement getMethodeEvaluationRevetement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePisteAtterrissage#getMethodeEvaluationRevetement <em>Methode Evaluation Revetement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Methode Evaluation Revetement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPisteAtterrissageMethodeEvaluationRevetement
	 * @see #isSetMethodeEvaluationRevetement()
	 * @see #unsetMethodeEvaluationRevetement()
	 * @see #getMethodeEvaluationRevetement()
	 * @generated
	 */
	void setMethodeEvaluationRevetement(TypeDictionaryDicoPisteAtterrissageMethodeEvaluationRevetement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePisteAtterrissage#getMethodeEvaluationRevetement <em>Methode Evaluation Revetement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMethodeEvaluationRevetement()
	 * @see #getMethodeEvaluationRevetement()
	 * @see #setMethodeEvaluationRevetement(TypeDictionaryDicoPisteAtterrissageMethodeEvaluationRevetement)
	 * @generated
	 */
	void unsetMethodeEvaluationRevetement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePisteAtterrissage#getMethodeEvaluationRevetement <em>Methode Evaluation Revetement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Methode Evaluation Revetement</em>' attribute is set.
	 * @see #unsetMethodeEvaluationRevetement()
	 * @see #getMethodeEvaluationRevetement()
	 * @see #setMethodeEvaluationRevetement(TypeDictionaryDicoPisteAtterrissageMethodeEvaluationRevetement)
	 * @generated
	 */
	boolean isSetMethodeEvaluationRevetement();

} // TypePisteAtterrissage
