/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeLongueur;
import mpia.meta.TypeDataTypeVolume;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Type Vehicule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeTypeVehicule#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeVehicule#getClasse <em>Classe</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeVehicule#getNombreEssieux <em>Nombre Essieux</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeVehicule#getNombreRoues <em>Nombre Roues</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeVehicule#getChargeParEssieu <em>Charge Par Essieu</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeVehicule#getCapaciteReservoirPrincipale <em>Capacite Reservoir Principale</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeVehicule#getCapaciteReservoirSec <em>Capacite Reservoir Sec</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeVehicule#getRayonBraquageMaximal <em>Rayon Braquage Maximal</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeVehicule#getNombreGalets <em>Nombre Galets</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeVehicule#getNombreNourrices <em>Nombre Nourrices</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeVehicule#getMotricite <em>Motricite</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeVehicule#getSpecialisation <em>Specialisation</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeTypeVehicule()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_TypeVehicule' kind='elementOnly'"
 * @generated
 */
public interface TypeTypeVehicule extends TypeTypeEquipement {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeVehiculeCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeVehiculeCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypeVehiculeCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeTypeVehicule_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoTypeVehiculeCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeVehicule#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeVehiculeCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoTypeVehiculeCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeVehicule#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypeVehiculeCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeVehicule#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypeVehiculeCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Classe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classe</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classe</em>' attribute.
	 * @see #isSetClasse()
	 * @see #unsetClasse()
	 * @see #setClasse(long)
	 * @see mpia.schema.SchemaPackage#getTypeTypeVehicule_Classe()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='Classe'"
	 * @generated
	 */
	long getClasse();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeVehicule#getClasse <em>Classe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classe</em>' attribute.
	 * @see #isSetClasse()
	 * @see #unsetClasse()
	 * @see #getClasse()
	 * @generated
	 */
	void setClasse(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeVehicule#getClasse <em>Classe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClasse()
	 * @see #getClasse()
	 * @see #setClasse(long)
	 * @generated
	 */
	void unsetClasse();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeVehicule#getClasse <em>Classe</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Classe</em>' attribute is set.
	 * @see #unsetClasse()
	 * @see #getClasse()
	 * @see #setClasse(long)
	 * @generated
	 */
	boolean isSetClasse();

	/**
	 * Returns the value of the '<em><b>Nombre Essieux</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Essieux</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Essieux</em>' attribute.
	 * @see #isSetNombreEssieux()
	 * @see #unsetNombreEssieux()
	 * @see #setNombreEssieux(long)
	 * @see mpia.schema.SchemaPackage#getTypeTypeVehicule_NombreEssieux()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NombreEssieux'"
	 * @generated
	 */
	long getNombreEssieux();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeVehicule#getNombreEssieux <em>Nombre Essieux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Essieux</em>' attribute.
	 * @see #isSetNombreEssieux()
	 * @see #unsetNombreEssieux()
	 * @see #getNombreEssieux()
	 * @generated
	 */
	void setNombreEssieux(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeVehicule#getNombreEssieux <em>Nombre Essieux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreEssieux()
	 * @see #getNombreEssieux()
	 * @see #setNombreEssieux(long)
	 * @generated
	 */
	void unsetNombreEssieux();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeVehicule#getNombreEssieux <em>Nombre Essieux</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Essieux</em>' attribute is set.
	 * @see #unsetNombreEssieux()
	 * @see #getNombreEssieux()
	 * @see #setNombreEssieux(long)
	 * @generated
	 */
	boolean isSetNombreEssieux();

	/**
	 * Returns the value of the '<em><b>Nombre Roues</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Roues</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Roues</em>' attribute.
	 * @see #isSetNombreRoues()
	 * @see #unsetNombreRoues()
	 * @see #setNombreRoues(long)
	 * @see mpia.schema.SchemaPackage#getTypeTypeVehicule_NombreRoues()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NombreRoues'"
	 * @generated
	 */
	long getNombreRoues();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeVehicule#getNombreRoues <em>Nombre Roues</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Roues</em>' attribute.
	 * @see #isSetNombreRoues()
	 * @see #unsetNombreRoues()
	 * @see #getNombreRoues()
	 * @generated
	 */
	void setNombreRoues(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeVehicule#getNombreRoues <em>Nombre Roues</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreRoues()
	 * @see #getNombreRoues()
	 * @see #setNombreRoues(long)
	 * @generated
	 */
	void unsetNombreRoues();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeVehicule#getNombreRoues <em>Nombre Roues</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Roues</em>' attribute is set.
	 * @see #unsetNombreRoues()
	 * @see #getNombreRoues()
	 * @see #setNombreRoues(long)
	 * @generated
	 */
	boolean isSetNombreRoues();

	/**
	 * Returns the value of the '<em><b>Charge Par Essieu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charge Par Essieu</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charge Par Essieu</em>' attribute.
	 * @see #isSetChargeParEssieu()
	 * @see #unsetChargeParEssieu()
	 * @see #setChargeParEssieu(long)
	 * @see mpia.schema.SchemaPackage#getTypeTypeVehicule_ChargeParEssieu()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='ChargeParEssieu'"
	 * @generated
	 */
	long getChargeParEssieu();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeVehicule#getChargeParEssieu <em>Charge Par Essieu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charge Par Essieu</em>' attribute.
	 * @see #isSetChargeParEssieu()
	 * @see #unsetChargeParEssieu()
	 * @see #getChargeParEssieu()
	 * @generated
	 */
	void setChargeParEssieu(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeVehicule#getChargeParEssieu <em>Charge Par Essieu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetChargeParEssieu()
	 * @see #getChargeParEssieu()
	 * @see #setChargeParEssieu(long)
	 * @generated
	 */
	void unsetChargeParEssieu();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeVehicule#getChargeParEssieu <em>Charge Par Essieu</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Charge Par Essieu</em>' attribute is set.
	 * @see #unsetChargeParEssieu()
	 * @see #getChargeParEssieu()
	 * @see #setChargeParEssieu(long)
	 * @generated
	 */
	boolean isSetChargeParEssieu();

	/**
	 * Returns the value of the '<em><b>Capacite Reservoir Principale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacite Reservoir Principale</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacite Reservoir Principale</em>' containment reference.
	 * @see #setCapaciteReservoirPrincipale(TypeDataTypeVolume)
	 * @see mpia.schema.SchemaPackage#getTypeTypeVehicule_CapaciteReservoirPrincipale()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CapaciteReservoirPrincipale'"
	 * @generated
	 */
	TypeDataTypeVolume getCapaciteReservoirPrincipale();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeVehicule#getCapaciteReservoirPrincipale <em>Capacite Reservoir Principale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacite Reservoir Principale</em>' containment reference.
	 * @see #getCapaciteReservoirPrincipale()
	 * @generated
	 */
	void setCapaciteReservoirPrincipale(TypeDataTypeVolume value);

	/**
	 * Returns the value of the '<em><b>Capacite Reservoir Sec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacite Reservoir Sec</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacite Reservoir Sec</em>' containment reference.
	 * @see #setCapaciteReservoirSec(TypeDataTypeVolume)
	 * @see mpia.schema.SchemaPackage#getTypeTypeVehicule_CapaciteReservoirSec()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CapaciteReservoirSec'"
	 * @generated
	 */
	TypeDataTypeVolume getCapaciteReservoirSec();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeVehicule#getCapaciteReservoirSec <em>Capacite Reservoir Sec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacite Reservoir Sec</em>' containment reference.
	 * @see #getCapaciteReservoirSec()
	 * @generated
	 */
	void setCapaciteReservoirSec(TypeDataTypeVolume value);

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
	 * @see mpia.schema.SchemaPackage#getTypeTypeVehicule_RayonBraquageMaximal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RayonBraquageMaximal'"
	 * @generated
	 */
	TypeDataTypeLongueur getRayonBraquageMaximal();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeVehicule#getRayonBraquageMaximal <em>Rayon Braquage Maximal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rayon Braquage Maximal</em>' containment reference.
	 * @see #getRayonBraquageMaximal()
	 * @generated
	 */
	void setRayonBraquageMaximal(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Nombre Galets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Galets</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Galets</em>' attribute.
	 * @see #isSetNombreGalets()
	 * @see #unsetNombreGalets()
	 * @see #setNombreGalets(long)
	 * @see mpia.schema.SchemaPackage#getTypeTypeVehicule_NombreGalets()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NombreGalets'"
	 * @generated
	 */
	long getNombreGalets();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeVehicule#getNombreGalets <em>Nombre Galets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Galets</em>' attribute.
	 * @see #isSetNombreGalets()
	 * @see #unsetNombreGalets()
	 * @see #getNombreGalets()
	 * @generated
	 */
	void setNombreGalets(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeVehicule#getNombreGalets <em>Nombre Galets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreGalets()
	 * @see #getNombreGalets()
	 * @see #setNombreGalets(long)
	 * @generated
	 */
	void unsetNombreGalets();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeVehicule#getNombreGalets <em>Nombre Galets</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Galets</em>' attribute is set.
	 * @see #unsetNombreGalets()
	 * @see #getNombreGalets()
	 * @see #setNombreGalets(long)
	 * @generated
	 */
	boolean isSetNombreGalets();

	/**
	 * Returns the value of the '<em><b>Nombre Nourrices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Nourrices</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Nourrices</em>' attribute.
	 * @see #isSetNombreNourrices()
	 * @see #unsetNombreNourrices()
	 * @see #setNombreNourrices(long)
	 * @see mpia.schema.SchemaPackage#getTypeTypeVehicule_NombreNourrices()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NombreNourrices'"
	 * @generated
	 */
	long getNombreNourrices();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeVehicule#getNombreNourrices <em>Nombre Nourrices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Nourrices</em>' attribute.
	 * @see #isSetNombreNourrices()
	 * @see #unsetNombreNourrices()
	 * @see #getNombreNourrices()
	 * @generated
	 */
	void setNombreNourrices(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeVehicule#getNombreNourrices <em>Nombre Nourrices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreNourrices()
	 * @see #getNombreNourrices()
	 * @see #setNombreNourrices(long)
	 * @generated
	 */
	void unsetNombreNourrices();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeVehicule#getNombreNourrices <em>Nombre Nourrices</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Nourrices</em>' attribute is set.
	 * @see #unsetNombreNourrices()
	 * @see #getNombreNourrices()
	 * @see #setNombreNourrices(long)
	 * @generated
	 */
	boolean isSetNombreNourrices();

	/**
	 * Returns the value of the '<em><b>Motricite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Motricite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Motricite</em>' attribute.
	 * @see #setMotricite(String)
	 * @see mpia.schema.SchemaPackage#getTypeTypeVehicule_Motricite()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='Motricite'"
	 * @generated
	 */
	String getMotricite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeVehicule#getMotricite <em>Motricite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Motricite</em>' attribute.
	 * @see #getMotricite()
	 * @generated
	 */
	void setMotricite(String value);

	/**
	 * Returns the value of the '<em><b>Specialisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specialisation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialisation</em>' attribute.
	 * @see #setSpecialisation(String)
	 * @see mpia.schema.SchemaPackage#getTypeTypeVehicule_Specialisation()
	 * @model dataType="mpia.meta.TypeDataTypeChaine020"
	 *        extendedMetaData="kind='element' name='Specialisation'"
	 * @generated
	 */
	String getSpecialisation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeVehicule#getSpecialisation <em>Specialisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialisation</em>' attribute.
	 * @see #getSpecialisation()
	 * @generated
	 */
	void setSpecialisation(String value);

} // TypeTypeVehicule
