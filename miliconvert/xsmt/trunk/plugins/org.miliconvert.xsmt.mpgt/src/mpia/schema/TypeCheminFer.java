/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeLongueur;
import mpia.meta.TypeDataTypeVitesseLineaire;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Chemin Fer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCheminFer#getNombreMaxTrain <em>Nombre Max Train</em>}</li>
 *   <li>{@link mpia.schema.TypeCheminFer#getNombreVoies <em>Nombre Voies</em>}</li>
 *   <li>{@link mpia.schema.TypeCheminFer#getEcartement <em>Ecartement</em>}</li>
 *   <li>{@link mpia.schema.TypeCheminFer#getEncombrement <em>Encombrement</em>}</li>
 *   <li>{@link mpia.schema.TypeCheminFer#getTraverse <em>Traverse</em>}</li>
 *   <li>{@link mpia.schema.TypeCheminFer#getTonnageMaximum <em>Tonnage Maximum</em>}</li>
 *   <li>{@link mpia.schema.TypeCheminFer#getVitesseMaximale <em>Vitesse Maximale</em>}</li>
 *   <li>{@link mpia.schema.TypeCheminFer#getTypeEnergie <em>Type Energie</em>}</li>
 *   <li>{@link mpia.schema.TypeCheminFer#getSystemeSignalisation <em>Systeme Signalisation</em>}</li>
 *   <li>{@link mpia.schema.TypeCheminFer#getEfficaciteSignalisation <em>Efficacite Signalisation</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCheminFer()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_CheminFer' kind='elementOnly'"
 * @generated
 */
public interface TypeCheminFer extends TypeSite {
	/**
	 * Returns the value of the '<em><b>Nombre Max Train</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Max Train</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Max Train</em>' attribute.
	 * @see #isSetNombreMaxTrain()
	 * @see #unsetNombreMaxTrain()
	 * @see #setNombreMaxTrain(long)
	 * @see mpia.schema.SchemaPackage#getTypeCheminFer_NombreMaxTrain()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier9"
	 *        extendedMetaData="kind='element' name='NombreMaxTrain'"
	 * @generated
	 */
	long getNombreMaxTrain();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCheminFer#getNombreMaxTrain <em>Nombre Max Train</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Max Train</em>' attribute.
	 * @see #isSetNombreMaxTrain()
	 * @see #unsetNombreMaxTrain()
	 * @see #getNombreMaxTrain()
	 * @generated
	 */
	void setNombreMaxTrain(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCheminFer#getNombreMaxTrain <em>Nombre Max Train</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreMaxTrain()
	 * @see #getNombreMaxTrain()
	 * @see #setNombreMaxTrain(long)
	 * @generated
	 */
	void unsetNombreMaxTrain();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCheminFer#getNombreMaxTrain <em>Nombre Max Train</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Max Train</em>' attribute is set.
	 * @see #unsetNombreMaxTrain()
	 * @see #getNombreMaxTrain()
	 * @see #setNombreMaxTrain(long)
	 * @generated
	 */
	boolean isSetNombreMaxTrain();

	/**
	 * Returns the value of the '<em><b>Nombre Voies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Voies</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Voies</em>' attribute.
	 * @see #isSetNombreVoies()
	 * @see #unsetNombreVoies()
	 * @see #setNombreVoies(long)
	 * @see mpia.schema.SchemaPackage#getTypeCheminFer_NombreVoies()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier9"
	 *        extendedMetaData="kind='element' name='NombreVoies'"
	 * @generated
	 */
	long getNombreVoies();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCheminFer#getNombreVoies <em>Nombre Voies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Voies</em>' attribute.
	 * @see #isSetNombreVoies()
	 * @see #unsetNombreVoies()
	 * @see #getNombreVoies()
	 * @generated
	 */
	void setNombreVoies(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCheminFer#getNombreVoies <em>Nombre Voies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreVoies()
	 * @see #getNombreVoies()
	 * @see #setNombreVoies(long)
	 * @generated
	 */
	void unsetNombreVoies();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCheminFer#getNombreVoies <em>Nombre Voies</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Voies</em>' attribute is set.
	 * @see #unsetNombreVoies()
	 * @see #getNombreVoies()
	 * @see #setNombreVoies(long)
	 * @generated
	 */
	boolean isSetNombreVoies();

	/**
	 * Returns the value of the '<em><b>Ecartement</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCheminFerEcartement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecartement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecartement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCheminFerEcartement
	 * @see #isSetEcartement()
	 * @see #unsetEcartement()
	 * @see #setEcartement(TypeDictionaryDicoCheminFerEcartement)
	 * @see mpia.schema.SchemaPackage#getTypeCheminFer_Ecartement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Ecartement'"
	 * @generated
	 */
	TypeDictionaryDicoCheminFerEcartement getEcartement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCheminFer#getEcartement <em>Ecartement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ecartement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCheminFerEcartement
	 * @see #isSetEcartement()
	 * @see #unsetEcartement()
	 * @see #getEcartement()
	 * @generated
	 */
	void setEcartement(TypeDictionaryDicoCheminFerEcartement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCheminFer#getEcartement <em>Ecartement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEcartement()
	 * @see #getEcartement()
	 * @see #setEcartement(TypeDictionaryDicoCheminFerEcartement)
	 * @generated
	 */
	void unsetEcartement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCheminFer#getEcartement <em>Ecartement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ecartement</em>' attribute is set.
	 * @see #unsetEcartement()
	 * @see #getEcartement()
	 * @see #setEcartement(TypeDictionaryDicoCheminFerEcartement)
	 * @generated
	 */
	boolean isSetEcartement();

	/**
	 * Returns the value of the '<em><b>Encombrement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encombrement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encombrement</em>' containment reference.
	 * @see #setEncombrement(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeCheminFer_Encombrement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Encombrement'"
	 * @generated
	 */
	TypeDataTypeLongueur getEncombrement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCheminFer#getEncombrement <em>Encombrement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encombrement</em>' containment reference.
	 * @see #getEncombrement()
	 * @generated
	 */
	void setEncombrement(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Traverse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Traverse</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traverse</em>' containment reference.
	 * @see #setTraverse(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeCheminFer_Traverse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Traverse'"
	 * @generated
	 */
	TypeDataTypeLongueur getTraverse();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCheminFer#getTraverse <em>Traverse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Traverse</em>' containment reference.
	 * @see #getTraverse()
	 * @generated
	 */
	void setTraverse(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Tonnage Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tonnage Maximum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tonnage Maximum</em>' attribute.
	 * @see #isSetTonnageMaximum()
	 * @see #unsetTonnageMaximum()
	 * @see #setTonnageMaximum(long)
	 * @see mpia.schema.SchemaPackage#getTypeCheminFer_TonnageMaximum()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier9"
	 *        extendedMetaData="kind='element' name='TonnageMaximum'"
	 * @generated
	 */
	long getTonnageMaximum();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCheminFer#getTonnageMaximum <em>Tonnage Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tonnage Maximum</em>' attribute.
	 * @see #isSetTonnageMaximum()
	 * @see #unsetTonnageMaximum()
	 * @see #getTonnageMaximum()
	 * @generated
	 */
	void setTonnageMaximum(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCheminFer#getTonnageMaximum <em>Tonnage Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTonnageMaximum()
	 * @see #getTonnageMaximum()
	 * @see #setTonnageMaximum(long)
	 * @generated
	 */
	void unsetTonnageMaximum();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCheminFer#getTonnageMaximum <em>Tonnage Maximum</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tonnage Maximum</em>' attribute is set.
	 * @see #unsetTonnageMaximum()
	 * @see #getTonnageMaximum()
	 * @see #setTonnageMaximum(long)
	 * @generated
	 */
	boolean isSetTonnageMaximum();

	/**
	 * Returns the value of the '<em><b>Vitesse Maximale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vitesse Maximale</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vitesse Maximale</em>' containment reference.
	 * @see #setVitesseMaximale(TypeDataTypeVitesseLineaire)
	 * @see mpia.schema.SchemaPackage#getTypeCheminFer_VitesseMaximale()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VitesseMaximale'"
	 * @generated
	 */
	TypeDataTypeVitesseLineaire getVitesseMaximale();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCheminFer#getVitesseMaximale <em>Vitesse Maximale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vitesse Maximale</em>' containment reference.
	 * @see #getVitesseMaximale()
	 * @generated
	 */
	void setVitesseMaximale(TypeDataTypeVitesseLineaire value);

	/**
	 * Returns the value of the '<em><b>Type Energie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCheminFerTypeEnergie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Energie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Energie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCheminFerTypeEnergie
	 * @see #isSetTypeEnergie()
	 * @see #unsetTypeEnergie()
	 * @see #setTypeEnergie(TypeDictionaryDicoCheminFerTypeEnergie)
	 * @see mpia.schema.SchemaPackage#getTypeCheminFer_TypeEnergie()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeEnergie'"
	 * @generated
	 */
	TypeDictionaryDicoCheminFerTypeEnergie getTypeEnergie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCheminFer#getTypeEnergie <em>Type Energie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Energie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCheminFerTypeEnergie
	 * @see #isSetTypeEnergie()
	 * @see #unsetTypeEnergie()
	 * @see #getTypeEnergie()
	 * @generated
	 */
	void setTypeEnergie(TypeDictionaryDicoCheminFerTypeEnergie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCheminFer#getTypeEnergie <em>Type Energie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeEnergie()
	 * @see #getTypeEnergie()
	 * @see #setTypeEnergie(TypeDictionaryDicoCheminFerTypeEnergie)
	 * @generated
	 */
	void unsetTypeEnergie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCheminFer#getTypeEnergie <em>Type Energie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Energie</em>' attribute is set.
	 * @see #unsetTypeEnergie()
	 * @see #getTypeEnergie()
	 * @see #setTypeEnergie(TypeDictionaryDicoCheminFerTypeEnergie)
	 * @generated
	 */
	boolean isSetTypeEnergie();

	/**
	 * Returns the value of the '<em><b>Systeme Signalisation</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCheminFerSystemeSignalisation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Systeme Signalisation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Systeme Signalisation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCheminFerSystemeSignalisation
	 * @see #isSetSystemeSignalisation()
	 * @see #unsetSystemeSignalisation()
	 * @see #setSystemeSignalisation(TypeDictionaryDicoCheminFerSystemeSignalisation)
	 * @see mpia.schema.SchemaPackage#getTypeCheminFer_SystemeSignalisation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SystemeSignalisation'"
	 * @generated
	 */
	TypeDictionaryDicoCheminFerSystemeSignalisation getSystemeSignalisation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCheminFer#getSystemeSignalisation <em>Systeme Signalisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Systeme Signalisation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCheminFerSystemeSignalisation
	 * @see #isSetSystemeSignalisation()
	 * @see #unsetSystemeSignalisation()
	 * @see #getSystemeSignalisation()
	 * @generated
	 */
	void setSystemeSignalisation(TypeDictionaryDicoCheminFerSystemeSignalisation value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCheminFer#getSystemeSignalisation <em>Systeme Signalisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSystemeSignalisation()
	 * @see #getSystemeSignalisation()
	 * @see #setSystemeSignalisation(TypeDictionaryDicoCheminFerSystemeSignalisation)
	 * @generated
	 */
	void unsetSystemeSignalisation();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCheminFer#getSystemeSignalisation <em>Systeme Signalisation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Systeme Signalisation</em>' attribute is set.
	 * @see #unsetSystemeSignalisation()
	 * @see #getSystemeSignalisation()
	 * @see #setSystemeSignalisation(TypeDictionaryDicoCheminFerSystemeSignalisation)
	 * @generated
	 */
	boolean isSetSystemeSignalisation();

	/**
	 * Returns the value of the '<em><b>Efficacite Signalisation</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCheminFerEfficaciteSignalisation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Efficacite Signalisation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Efficacite Signalisation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCheminFerEfficaciteSignalisation
	 * @see #isSetEfficaciteSignalisation()
	 * @see #unsetEfficaciteSignalisation()
	 * @see #setEfficaciteSignalisation(TypeDictionaryDicoCheminFerEfficaciteSignalisation)
	 * @see mpia.schema.SchemaPackage#getTypeCheminFer_EfficaciteSignalisation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EfficaciteSignalisation'"
	 * @generated
	 */
	TypeDictionaryDicoCheminFerEfficaciteSignalisation getEfficaciteSignalisation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCheminFer#getEfficaciteSignalisation <em>Efficacite Signalisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Efficacite Signalisation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCheminFerEfficaciteSignalisation
	 * @see #isSetEfficaciteSignalisation()
	 * @see #unsetEfficaciteSignalisation()
	 * @see #getEfficaciteSignalisation()
	 * @generated
	 */
	void setEfficaciteSignalisation(TypeDictionaryDicoCheminFerEfficaciteSignalisation value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCheminFer#getEfficaciteSignalisation <em>Efficacite Signalisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEfficaciteSignalisation()
	 * @see #getEfficaciteSignalisation()
	 * @see #setEfficaciteSignalisation(TypeDictionaryDicoCheminFerEfficaciteSignalisation)
	 * @generated
	 */
	void unsetEfficaciteSignalisation();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCheminFer#getEfficaciteSignalisation <em>Efficacite Signalisation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Efficacite Signalisation</em>' attribute is set.
	 * @see #unsetEfficaciteSignalisation()
	 * @see #getEfficaciteSignalisation()
	 * @see #setEfficaciteSignalisation(TypeDictionaryDicoCheminFerEfficaciteSignalisation)
	 * @generated
	 */
	boolean isSetEfficaciteSignalisation();

} // TypeCheminFer
