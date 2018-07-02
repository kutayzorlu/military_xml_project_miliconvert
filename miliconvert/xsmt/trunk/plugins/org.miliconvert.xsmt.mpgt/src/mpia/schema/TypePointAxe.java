/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeLongueur;
import mpia.meta.TypeDataTypeMasse;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Point Axe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypePointAxe#getToponyme <em>Toponyme</em>}</li>
 *   <li>{@link mpia.schema.TypePointAxe#getTypePointAxe <em>Type Point Axe</em>}</li>
 *   <li>{@link mpia.schema.TypePointAxe#isRecompletementCarburant <em>Recompletement Carburant</em>}</li>
 *   <li>{@link mpia.schema.TypePointAxe#isReparationMateriel <em>Reparation Materiel</em>}</li>
 *   <li>{@link mpia.schema.TypePointAxe#isPosteSecours <em>Poste Secours</em>}</li>
 *   <li>{@link mpia.schema.TypePointAxe#isFrontiere <em>Frontiere</em>}</li>
 *   <li>{@link mpia.schema.TypePointAxe#getClasseMilMaxPourVehiculesARoue <em>Classe Mil Max Pour Vehicules ARoue</em>}</li>
 *   <li>{@link mpia.schema.TypePointAxe#getClasseMiMaxPourVehiculesAChenilles <em>Classe Mi Max Pour Vehicules AChenilles</em>}</li>
 *   <li>{@link mpia.schema.TypePointAxe#getPTRAplusLourdARoues <em>PTR Aplus Lourd ARoues</em>}</li>
 *   <li>{@link mpia.schema.TypePointAxe#getPTRAplusLourdAChenilles <em>PTR Aplus Lourd AChenilles</em>}</li>
 *   <li>{@link mpia.schema.TypePointAxe#getChargeEssieu <em>Charge Essieu</em>}</li>
 *   <li>{@link mpia.schema.TypePointAxe#getHauteurMaximaleVehicules <em>Hauteur Maximale Vehicules</em>}</li>
 *   <li>{@link mpia.schema.TypePointAxe#getLargeurMaximaleVehicule <em>Largeur Maximale Vehicule</em>}</li>
 *   <li>{@link mpia.schema.TypePointAxe#getRayonBraquageMaximal <em>Rayon Braquage Maximal</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypePointAxe()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_PointAxe' kind='elementOnly'"
 * @generated
 */
public interface TypePointAxe extends TypeElementControle {
	/**
	 * Returns the value of the '<em><b>Toponyme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Toponyme</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Toponyme</em>' attribute.
	 * @see #setToponyme(String)
	 * @see mpia.schema.SchemaPackage#getTypePointAxe_Toponyme()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='Toponyme'"
	 * @generated
	 */
	String getToponyme();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointAxe#getToponyme <em>Toponyme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Toponyme</em>' attribute.
	 * @see #getToponyme()
	 * @generated
	 */
	void setToponyme(String value);

	/**
	 * Returns the value of the '<em><b>Type Point Axe</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypePointAxe}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Point Axe</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Point Axe</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypePointAxe
	 * @see #isSetTypePointAxe()
	 * @see #unsetTypePointAxe()
	 * @see #setTypePointAxe(TypeDictionaryDicoTypePointAxe)
	 * @see mpia.schema.SchemaPackage#getTypePointAxe_TypePointAxe()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypePointAxe'"
	 * @generated
	 */
	TypeDictionaryDicoTypePointAxe getTypePointAxe();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointAxe#getTypePointAxe <em>Type Point Axe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Point Axe</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypePointAxe
	 * @see #isSetTypePointAxe()
	 * @see #unsetTypePointAxe()
	 * @see #getTypePointAxe()
	 * @generated
	 */
	void setTypePointAxe(TypeDictionaryDicoTypePointAxe value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePointAxe#getTypePointAxe <em>Type Point Axe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypePointAxe()
	 * @see #getTypePointAxe()
	 * @see #setTypePointAxe(TypeDictionaryDicoTypePointAxe)
	 * @generated
	 */
	void unsetTypePointAxe();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePointAxe#getTypePointAxe <em>Type Point Axe</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Point Axe</em>' attribute is set.
	 * @see #unsetTypePointAxe()
	 * @see #getTypePointAxe()
	 * @see #setTypePointAxe(TypeDictionaryDicoTypePointAxe)
	 * @generated
	 */
	boolean isSetTypePointAxe();

	/**
	 * Returns the value of the '<em><b>Recompletement Carburant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recompletement Carburant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recompletement Carburant</em>' attribute.
	 * @see #isSetRecompletementCarburant()
	 * @see #unsetRecompletementCarburant()
	 * @see #setRecompletementCarburant(boolean)
	 * @see mpia.schema.SchemaPackage#getTypePointAxe_RecompletementCarburant()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='RecompletementCarburant'"
	 * @generated
	 */
	boolean isRecompletementCarburant();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointAxe#isRecompletementCarburant <em>Recompletement Carburant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recompletement Carburant</em>' attribute.
	 * @see #isSetRecompletementCarburant()
	 * @see #unsetRecompletementCarburant()
	 * @see #isRecompletementCarburant()
	 * @generated
	 */
	void setRecompletementCarburant(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePointAxe#isRecompletementCarburant <em>Recompletement Carburant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRecompletementCarburant()
	 * @see #isRecompletementCarburant()
	 * @see #setRecompletementCarburant(boolean)
	 * @generated
	 */
	void unsetRecompletementCarburant();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePointAxe#isRecompletementCarburant <em>Recompletement Carburant</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Recompletement Carburant</em>' attribute is set.
	 * @see #unsetRecompletementCarburant()
	 * @see #isRecompletementCarburant()
	 * @see #setRecompletementCarburant(boolean)
	 * @generated
	 */
	boolean isSetRecompletementCarburant();

	/**
	 * Returns the value of the '<em><b>Reparation Materiel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reparation Materiel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reparation Materiel</em>' attribute.
	 * @see #isSetReparationMateriel()
	 * @see #unsetReparationMateriel()
	 * @see #setReparationMateriel(boolean)
	 * @see mpia.schema.SchemaPackage#getTypePointAxe_ReparationMateriel()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='ReparationMateriel'"
	 * @generated
	 */
	boolean isReparationMateriel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointAxe#isReparationMateriel <em>Reparation Materiel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reparation Materiel</em>' attribute.
	 * @see #isSetReparationMateriel()
	 * @see #unsetReparationMateriel()
	 * @see #isReparationMateriel()
	 * @generated
	 */
	void setReparationMateriel(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePointAxe#isReparationMateriel <em>Reparation Materiel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReparationMateriel()
	 * @see #isReparationMateriel()
	 * @see #setReparationMateriel(boolean)
	 * @generated
	 */
	void unsetReparationMateriel();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePointAxe#isReparationMateriel <em>Reparation Materiel</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reparation Materiel</em>' attribute is set.
	 * @see #unsetReparationMateriel()
	 * @see #isReparationMateriel()
	 * @see #setReparationMateriel(boolean)
	 * @generated
	 */
	boolean isSetReparationMateriel();

	/**
	 * Returns the value of the '<em><b>Poste Secours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Poste Secours</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poste Secours</em>' attribute.
	 * @see #isSetPosteSecours()
	 * @see #unsetPosteSecours()
	 * @see #setPosteSecours(boolean)
	 * @see mpia.schema.SchemaPackage#getTypePointAxe_PosteSecours()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='PosteSecours'"
	 * @generated
	 */
	boolean isPosteSecours();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointAxe#isPosteSecours <em>Poste Secours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Poste Secours</em>' attribute.
	 * @see #isSetPosteSecours()
	 * @see #unsetPosteSecours()
	 * @see #isPosteSecours()
	 * @generated
	 */
	void setPosteSecours(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePointAxe#isPosteSecours <em>Poste Secours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPosteSecours()
	 * @see #isPosteSecours()
	 * @see #setPosteSecours(boolean)
	 * @generated
	 */
	void unsetPosteSecours();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePointAxe#isPosteSecours <em>Poste Secours</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Poste Secours</em>' attribute is set.
	 * @see #unsetPosteSecours()
	 * @see #isPosteSecours()
	 * @see #setPosteSecours(boolean)
	 * @generated
	 */
	boolean isSetPosteSecours();

	/**
	 * Returns the value of the '<em><b>Frontiere</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frontiere</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frontiere</em>' attribute.
	 * @see #isSetFrontiere()
	 * @see #unsetFrontiere()
	 * @see #setFrontiere(boolean)
	 * @see mpia.schema.SchemaPackage#getTypePointAxe_Frontiere()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='Frontiere'"
	 * @generated
	 */
	boolean isFrontiere();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointAxe#isFrontiere <em>Frontiere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frontiere</em>' attribute.
	 * @see #isSetFrontiere()
	 * @see #unsetFrontiere()
	 * @see #isFrontiere()
	 * @generated
	 */
	void setFrontiere(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePointAxe#isFrontiere <em>Frontiere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFrontiere()
	 * @see #isFrontiere()
	 * @see #setFrontiere(boolean)
	 * @generated
	 */
	void unsetFrontiere();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePointAxe#isFrontiere <em>Frontiere</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Frontiere</em>' attribute is set.
	 * @see #unsetFrontiere()
	 * @see #isFrontiere()
	 * @see #setFrontiere(boolean)
	 * @generated
	 */
	boolean isSetFrontiere();

	/**
	 * Returns the value of the '<em><b>Classe Mil Max Pour Vehicules ARoue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classe Mil Max Pour Vehicules ARoue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classe Mil Max Pour Vehicules ARoue</em>' attribute.
	 * @see #isSetClasseMilMaxPourVehiculesARoue()
	 * @see #unsetClasseMilMaxPourVehiculesARoue()
	 * @see #setClasseMilMaxPourVehiculesARoue(long)
	 * @see mpia.schema.SchemaPackage#getTypePointAxe_ClasseMilMaxPourVehiculesARoue()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='ClasseMilMaxPourVehiculesARoue'"
	 * @generated
	 */
	long getClasseMilMaxPourVehiculesARoue();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointAxe#getClasseMilMaxPourVehiculesARoue <em>Classe Mil Max Pour Vehicules ARoue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classe Mil Max Pour Vehicules ARoue</em>' attribute.
	 * @see #isSetClasseMilMaxPourVehiculesARoue()
	 * @see #unsetClasseMilMaxPourVehiculesARoue()
	 * @see #getClasseMilMaxPourVehiculesARoue()
	 * @generated
	 */
	void setClasseMilMaxPourVehiculesARoue(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePointAxe#getClasseMilMaxPourVehiculesARoue <em>Classe Mil Max Pour Vehicules ARoue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClasseMilMaxPourVehiculesARoue()
	 * @see #getClasseMilMaxPourVehiculesARoue()
	 * @see #setClasseMilMaxPourVehiculesARoue(long)
	 * @generated
	 */
	void unsetClasseMilMaxPourVehiculesARoue();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePointAxe#getClasseMilMaxPourVehiculesARoue <em>Classe Mil Max Pour Vehicules ARoue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Classe Mil Max Pour Vehicules ARoue</em>' attribute is set.
	 * @see #unsetClasseMilMaxPourVehiculesARoue()
	 * @see #getClasseMilMaxPourVehiculesARoue()
	 * @see #setClasseMilMaxPourVehiculesARoue(long)
	 * @generated
	 */
	boolean isSetClasseMilMaxPourVehiculesARoue();

	/**
	 * Returns the value of the '<em><b>Classe Mi Max Pour Vehicules AChenilles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classe Mi Max Pour Vehicules AChenilles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classe Mi Max Pour Vehicules AChenilles</em>' attribute.
	 * @see #isSetClasseMiMaxPourVehiculesAChenilles()
	 * @see #unsetClasseMiMaxPourVehiculesAChenilles()
	 * @see #setClasseMiMaxPourVehiculesAChenilles(long)
	 * @see mpia.schema.SchemaPackage#getTypePointAxe_ClasseMiMaxPourVehiculesAChenilles()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='ClasseMiMaxPourVehiculesAChenilles'"
	 * @generated
	 */
	long getClasseMiMaxPourVehiculesAChenilles();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointAxe#getClasseMiMaxPourVehiculesAChenilles <em>Classe Mi Max Pour Vehicules AChenilles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classe Mi Max Pour Vehicules AChenilles</em>' attribute.
	 * @see #isSetClasseMiMaxPourVehiculesAChenilles()
	 * @see #unsetClasseMiMaxPourVehiculesAChenilles()
	 * @see #getClasseMiMaxPourVehiculesAChenilles()
	 * @generated
	 */
	void setClasseMiMaxPourVehiculesAChenilles(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePointAxe#getClasseMiMaxPourVehiculesAChenilles <em>Classe Mi Max Pour Vehicules AChenilles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClasseMiMaxPourVehiculesAChenilles()
	 * @see #getClasseMiMaxPourVehiculesAChenilles()
	 * @see #setClasseMiMaxPourVehiculesAChenilles(long)
	 * @generated
	 */
	void unsetClasseMiMaxPourVehiculesAChenilles();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePointAxe#getClasseMiMaxPourVehiculesAChenilles <em>Classe Mi Max Pour Vehicules AChenilles</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Classe Mi Max Pour Vehicules AChenilles</em>' attribute is set.
	 * @see #unsetClasseMiMaxPourVehiculesAChenilles()
	 * @see #getClasseMiMaxPourVehiculesAChenilles()
	 * @see #setClasseMiMaxPourVehiculesAChenilles(long)
	 * @generated
	 */
	boolean isSetClasseMiMaxPourVehiculesAChenilles();

	/**
	 * Returns the value of the '<em><b>PTR Aplus Lourd ARoues</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PTR Aplus Lourd ARoues</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PTR Aplus Lourd ARoues</em>' containment reference.
	 * @see #setPTRAplusLourdARoues(TypeDataTypeMasse)
	 * @see mpia.schema.SchemaPackage#getTypePointAxe_PTRAplusLourdARoues()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PTRAplusLourdARoues'"
	 * @generated
	 */
	TypeDataTypeMasse getPTRAplusLourdARoues();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointAxe#getPTRAplusLourdARoues <em>PTR Aplus Lourd ARoues</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PTR Aplus Lourd ARoues</em>' containment reference.
	 * @see #getPTRAplusLourdARoues()
	 * @generated
	 */
	void setPTRAplusLourdARoues(TypeDataTypeMasse value);

	/**
	 * Returns the value of the '<em><b>PTR Aplus Lourd AChenilles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PTR Aplus Lourd AChenilles</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PTR Aplus Lourd AChenilles</em>' containment reference.
	 * @see #setPTRAplusLourdAChenilles(TypeDataTypeMasse)
	 * @see mpia.schema.SchemaPackage#getTypePointAxe_PTRAplusLourdAChenilles()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PTRAplusLourdAChenilles'"
	 * @generated
	 */
	TypeDataTypeMasse getPTRAplusLourdAChenilles();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointAxe#getPTRAplusLourdAChenilles <em>PTR Aplus Lourd AChenilles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PTR Aplus Lourd AChenilles</em>' containment reference.
	 * @see #getPTRAplusLourdAChenilles()
	 * @generated
	 */
	void setPTRAplusLourdAChenilles(TypeDataTypeMasse value);

	/**
	 * Returns the value of the '<em><b>Charge Essieu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charge Essieu</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charge Essieu</em>' attribute.
	 * @see #isSetChargeEssieu()
	 * @see #unsetChargeEssieu()
	 * @see #setChargeEssieu(long)
	 * @see mpia.schema.SchemaPackage#getTypePointAxe_ChargeEssieu()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='ChargeEssieu'"
	 * @generated
	 */
	long getChargeEssieu();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointAxe#getChargeEssieu <em>Charge Essieu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charge Essieu</em>' attribute.
	 * @see #isSetChargeEssieu()
	 * @see #unsetChargeEssieu()
	 * @see #getChargeEssieu()
	 * @generated
	 */
	void setChargeEssieu(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePointAxe#getChargeEssieu <em>Charge Essieu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetChargeEssieu()
	 * @see #getChargeEssieu()
	 * @see #setChargeEssieu(long)
	 * @generated
	 */
	void unsetChargeEssieu();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePointAxe#getChargeEssieu <em>Charge Essieu</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Charge Essieu</em>' attribute is set.
	 * @see #unsetChargeEssieu()
	 * @see #getChargeEssieu()
	 * @see #setChargeEssieu(long)
	 * @generated
	 */
	boolean isSetChargeEssieu();

	/**
	 * Returns the value of the '<em><b>Hauteur Maximale Vehicules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hauteur Maximale Vehicules</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hauteur Maximale Vehicules</em>' containment reference.
	 * @see #setHauteurMaximaleVehicules(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypePointAxe_HauteurMaximaleVehicules()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='HauteurMaximaleVehicules'"
	 * @generated
	 */
	TypeDataTypeLongueur getHauteurMaximaleVehicules();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointAxe#getHauteurMaximaleVehicules <em>Hauteur Maximale Vehicules</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hauteur Maximale Vehicules</em>' containment reference.
	 * @see #getHauteurMaximaleVehicules()
	 * @generated
	 */
	void setHauteurMaximaleVehicules(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Largeur Maximale Vehicule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Largeur Maximale Vehicule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Largeur Maximale Vehicule</em>' containment reference.
	 * @see #setLargeurMaximaleVehicule(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypePointAxe_LargeurMaximaleVehicule()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LargeurMaximaleVehicule'"
	 * @generated
	 */
	TypeDataTypeLongueur getLargeurMaximaleVehicule();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointAxe#getLargeurMaximaleVehicule <em>Largeur Maximale Vehicule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Largeur Maximale Vehicule</em>' containment reference.
	 * @see #getLargeurMaximaleVehicule()
	 * @generated
	 */
	void setLargeurMaximaleVehicule(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Rayon Braquage Maximal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rayon Braquage Maximal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rayon Braquage Maximal</em>' containment reference.
	 * @see #setRayonBraquageMaximal(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypePointAxe_RayonBraquageMaximal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RayonBraquageMaximal'"
	 * @generated
	 */
	TypeDataTypeLongueur getRayonBraquageMaximal();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointAxe#getRayonBraquageMaximal <em>Rayon Braquage Maximal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rayon Braquage Maximal</em>' containment reference.
	 * @see #getRayonBraquageMaximal()
	 * @generated
	 */
	void setRayonBraquageMaximal(TypeDataTypeLongueur value);

} // TypePointAxe
