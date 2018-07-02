/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeVitesseLineaire;
import mpia.meta.TypeDataTypeVolume;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Type Sous Marin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeTypeSousMarin#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeSousMarin#isDispositifChargementTorpilles <em>Dispositif Chargement Torpilles</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeSousMarin#getDeplacementEnPlongee <em>Deplacement En Plongee</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeSousMarin#getVitesseCavitation <em>Vitesse Cavitation</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeTypeSousMarin()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_TypeSousMarin' kind='elementOnly'"
 * @generated
 */
public interface TypeTypeSousMarin extends TypeTypeBatiment {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeSousMarinCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeSousMarinCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypeSousMarinCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeTypeSousMarin_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoTypeSousMarinCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeSousMarin#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeSousMarinCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoTypeSousMarinCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeSousMarin#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypeSousMarinCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeSousMarin#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypeSousMarinCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Dispositif Chargement Torpilles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dispositif Chargement Torpilles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dispositif Chargement Torpilles</em>' attribute.
	 * @see #isSetDispositifChargementTorpilles()
	 * @see #unsetDispositifChargementTorpilles()
	 * @see #setDispositifChargementTorpilles(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeTypeSousMarin_DispositifChargementTorpilles()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='DispositifChargementTorpilles'"
	 * @generated
	 */
	boolean isDispositifChargementTorpilles();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeSousMarin#isDispositifChargementTorpilles <em>Dispositif Chargement Torpilles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dispositif Chargement Torpilles</em>' attribute.
	 * @see #isSetDispositifChargementTorpilles()
	 * @see #unsetDispositifChargementTorpilles()
	 * @see #isDispositifChargementTorpilles()
	 * @generated
	 */
	void setDispositifChargementTorpilles(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeSousMarin#isDispositifChargementTorpilles <em>Dispositif Chargement Torpilles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDispositifChargementTorpilles()
	 * @see #isDispositifChargementTorpilles()
	 * @see #setDispositifChargementTorpilles(boolean)
	 * @generated
	 */
	void unsetDispositifChargementTorpilles();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeSousMarin#isDispositifChargementTorpilles <em>Dispositif Chargement Torpilles</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dispositif Chargement Torpilles</em>' attribute is set.
	 * @see #unsetDispositifChargementTorpilles()
	 * @see #isDispositifChargementTorpilles()
	 * @see #setDispositifChargementTorpilles(boolean)
	 * @generated
	 */
	boolean isSetDispositifChargementTorpilles();

	/**
	 * Returns the value of the '<em><b>Deplacement En Plongee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deplacement En Plongee</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deplacement En Plongee</em>' containment reference.
	 * @see #setDeplacementEnPlongee(TypeDataTypeVolume)
	 * @see mpia.schema.SchemaPackage#getTypeTypeSousMarin_DeplacementEnPlongee()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DeplacementEnPlongee'"
	 * @generated
	 */
	TypeDataTypeVolume getDeplacementEnPlongee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeSousMarin#getDeplacementEnPlongee <em>Deplacement En Plongee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deplacement En Plongee</em>' containment reference.
	 * @see #getDeplacementEnPlongee()
	 * @generated
	 */
	void setDeplacementEnPlongee(TypeDataTypeVolume value);

	/**
	 * Returns the value of the '<em><b>Vitesse Cavitation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vitesse Cavitation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vitesse Cavitation</em>' containment reference.
	 * @see #setVitesseCavitation(TypeDataTypeVitesseLineaire)
	 * @see mpia.schema.SchemaPackage#getTypeTypeSousMarin_VitesseCavitation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VitesseCavitation'"
	 * @generated
	 */
	TypeDataTypeVitesseLineaire getVitesseCavitation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeSousMarin#getVitesseCavitation <em>Vitesse Cavitation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vitesse Cavitation</em>' containment reference.
	 * @see #getVitesseCavitation()
	 * @generated
	 */
	void setVitesseCavitation(TypeDataTypeVitesseLineaire value);

} // TypeTypeSousMarin
