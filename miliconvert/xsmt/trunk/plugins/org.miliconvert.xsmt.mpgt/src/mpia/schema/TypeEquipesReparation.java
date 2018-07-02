/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Equipes Reparation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEquipesReparation#getDomaineReparation <em>Domaine Reparation</em>}</li>
 *   <li>{@link mpia.schema.TypeEquipesReparation#getSpecialiteReparation <em>Specialite Reparation</em>}</li>
 *   <li>{@link mpia.schema.TypeEquipesReparation#getEquipesExistantes <em>Equipes Existantes</em>}</li>
 *   <li>{@link mpia.schema.TypeEquipesReparation#getEquipesDisponibles <em>Equipes Disponibles</em>}</li>
 *   <li>{@link mpia.schema.TypeEquipesReparation#getChargeTravail <em>Charge Travail</em>}</li>
 *   <li>{@link mpia.schema.TypeEquipesReparation#getRegimeTravail <em>Regime Travail</em>}</li>
 *   <li>{@link mpia.schema.TypeEquipesReparation#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeEquipesReparation#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEquipesReparation()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_EquipesReparation' kind='elementOnly'"
 * @generated
 */
public interface TypeEquipesReparation extends EObject {
	/**
	 * Returns the value of the '<em><b>Domaine Reparation</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEquipesReparationDomaineReparation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domaine Reparation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domaine Reparation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEquipesReparationDomaineReparation
	 * @see #isSetDomaineReparation()
	 * @see #unsetDomaineReparation()
	 * @see #setDomaineReparation(TypeDictionaryDicoEquipesReparationDomaineReparation)
	 * @see mpia.schema.SchemaPackage#getTypeEquipesReparation_DomaineReparation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='DomaineReparation'"
	 * @generated
	 */
	TypeDictionaryDicoEquipesReparationDomaineReparation getDomaineReparation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEquipesReparation#getDomaineReparation <em>Domaine Reparation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domaine Reparation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEquipesReparationDomaineReparation
	 * @see #isSetDomaineReparation()
	 * @see #unsetDomaineReparation()
	 * @see #getDomaineReparation()
	 * @generated
	 */
	void setDomaineReparation(TypeDictionaryDicoEquipesReparationDomaineReparation value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEquipesReparation#getDomaineReparation <em>Domaine Reparation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDomaineReparation()
	 * @see #getDomaineReparation()
	 * @see #setDomaineReparation(TypeDictionaryDicoEquipesReparationDomaineReparation)
	 * @generated
	 */
	void unsetDomaineReparation();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEquipesReparation#getDomaineReparation <em>Domaine Reparation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Domaine Reparation</em>' attribute is set.
	 * @see #unsetDomaineReparation()
	 * @see #getDomaineReparation()
	 * @see #setDomaineReparation(TypeDictionaryDicoEquipesReparationDomaineReparation)
	 * @generated
	 */
	boolean isSetDomaineReparation();

	/**
	 * Returns the value of the '<em><b>Specialite Reparation</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEquipesReparationSpecialiteReparation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specialite Reparation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialite Reparation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEquipesReparationSpecialiteReparation
	 * @see #isSetSpecialiteReparation()
	 * @see #unsetSpecialiteReparation()
	 * @see #setSpecialiteReparation(TypeDictionaryDicoEquipesReparationSpecialiteReparation)
	 * @see mpia.schema.SchemaPackage#getTypeEquipesReparation_SpecialiteReparation()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='SpecialiteReparation'"
	 * @generated
	 */
	TypeDictionaryDicoEquipesReparationSpecialiteReparation getSpecialiteReparation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEquipesReparation#getSpecialiteReparation <em>Specialite Reparation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialite Reparation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEquipesReparationSpecialiteReparation
	 * @see #isSetSpecialiteReparation()
	 * @see #unsetSpecialiteReparation()
	 * @see #getSpecialiteReparation()
	 * @generated
	 */
	void setSpecialiteReparation(TypeDictionaryDicoEquipesReparationSpecialiteReparation value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEquipesReparation#getSpecialiteReparation <em>Specialite Reparation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpecialiteReparation()
	 * @see #getSpecialiteReparation()
	 * @see #setSpecialiteReparation(TypeDictionaryDicoEquipesReparationSpecialiteReparation)
	 * @generated
	 */
	void unsetSpecialiteReparation();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEquipesReparation#getSpecialiteReparation <em>Specialite Reparation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Specialite Reparation</em>' attribute is set.
	 * @see #unsetSpecialiteReparation()
	 * @see #getSpecialiteReparation()
	 * @see #setSpecialiteReparation(TypeDictionaryDicoEquipesReparationSpecialiteReparation)
	 * @generated
	 */
	boolean isSetSpecialiteReparation();

	/**
	 * Returns the value of the '<em><b>Equipes Existantes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equipes Existantes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equipes Existantes</em>' attribute.
	 * @see #isSetEquipesExistantes()
	 * @see #unsetEquipesExistantes()
	 * @see #setEquipesExistantes(long)
	 * @see mpia.schema.SchemaPackage#getTypeEquipesReparation_EquipesExistantes()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3" required="true"
	 *        extendedMetaData="kind='element' name='EquipesExistantes'"
	 * @generated
	 */
	long getEquipesExistantes();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEquipesReparation#getEquipesExistantes <em>Equipes Existantes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equipes Existantes</em>' attribute.
	 * @see #isSetEquipesExistantes()
	 * @see #unsetEquipesExistantes()
	 * @see #getEquipesExistantes()
	 * @generated
	 */
	void setEquipesExistantes(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEquipesReparation#getEquipesExistantes <em>Equipes Existantes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEquipesExistantes()
	 * @see #getEquipesExistantes()
	 * @see #setEquipesExistantes(long)
	 * @generated
	 */
	void unsetEquipesExistantes();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEquipesReparation#getEquipesExistantes <em>Equipes Existantes</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Equipes Existantes</em>' attribute is set.
	 * @see #unsetEquipesExistantes()
	 * @see #getEquipesExistantes()
	 * @see #setEquipesExistantes(long)
	 * @generated
	 */
	boolean isSetEquipesExistantes();

	/**
	 * Returns the value of the '<em><b>Equipes Disponibles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equipes Disponibles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equipes Disponibles</em>' attribute.
	 * @see #isSetEquipesDisponibles()
	 * @see #unsetEquipesDisponibles()
	 * @see #setEquipesDisponibles(long)
	 * @see mpia.schema.SchemaPackage#getTypeEquipesReparation_EquipesDisponibles()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3" required="true"
	 *        extendedMetaData="kind='element' name='EquipesDisponibles'"
	 * @generated
	 */
	long getEquipesDisponibles();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEquipesReparation#getEquipesDisponibles <em>Equipes Disponibles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equipes Disponibles</em>' attribute.
	 * @see #isSetEquipesDisponibles()
	 * @see #unsetEquipesDisponibles()
	 * @see #getEquipesDisponibles()
	 * @generated
	 */
	void setEquipesDisponibles(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEquipesReparation#getEquipesDisponibles <em>Equipes Disponibles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEquipesDisponibles()
	 * @see #getEquipesDisponibles()
	 * @see #setEquipesDisponibles(long)
	 * @generated
	 */
	void unsetEquipesDisponibles();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEquipesReparation#getEquipesDisponibles <em>Equipes Disponibles</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Equipes Disponibles</em>' attribute is set.
	 * @see #unsetEquipesDisponibles()
	 * @see #getEquipesDisponibles()
	 * @see #setEquipesDisponibles(long)
	 * @generated
	 */
	boolean isSetEquipesDisponibles();

	/**
	 * Returns the value of the '<em><b>Charge Travail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charge Travail</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charge Travail</em>' attribute.
	 * @see #isSetChargeTravail()
	 * @see #unsetChargeTravail()
	 * @see #setChargeTravail(double)
	 * @see mpia.schema.SchemaPackage#getTypeEquipesReparation_ChargeTravail()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal" required="true"
	 *        extendedMetaData="kind='element' name='ChargeTravail'"
	 * @generated
	 */
	double getChargeTravail();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEquipesReparation#getChargeTravail <em>Charge Travail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charge Travail</em>' attribute.
	 * @see #isSetChargeTravail()
	 * @see #unsetChargeTravail()
	 * @see #getChargeTravail()
	 * @generated
	 */
	void setChargeTravail(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEquipesReparation#getChargeTravail <em>Charge Travail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetChargeTravail()
	 * @see #getChargeTravail()
	 * @see #setChargeTravail(double)
	 * @generated
	 */
	void unsetChargeTravail();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEquipesReparation#getChargeTravail <em>Charge Travail</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Charge Travail</em>' attribute is set.
	 * @see #unsetChargeTravail()
	 * @see #getChargeTravail()
	 * @see #setChargeTravail(double)
	 * @generated
	 */
	boolean isSetChargeTravail();

	/**
	 * Returns the value of the '<em><b>Regime Travail</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEquipesReparationRegimeTravail}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regime Travail</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regime Travail</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEquipesReparationRegimeTravail
	 * @see #isSetRegimeTravail()
	 * @see #unsetRegimeTravail()
	 * @see #setRegimeTravail(TypeDictionaryDicoEquipesReparationRegimeTravail)
	 * @see mpia.schema.SchemaPackage#getTypeEquipesReparation_RegimeTravail()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='RegimeTravail'"
	 * @generated
	 */
	TypeDictionaryDicoEquipesReparationRegimeTravail getRegimeTravail();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEquipesReparation#getRegimeTravail <em>Regime Travail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regime Travail</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEquipesReparationRegimeTravail
	 * @see #isSetRegimeTravail()
	 * @see #unsetRegimeTravail()
	 * @see #getRegimeTravail()
	 * @generated
	 */
	void setRegimeTravail(TypeDictionaryDicoEquipesReparationRegimeTravail value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEquipesReparation#getRegimeTravail <em>Regime Travail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRegimeTravail()
	 * @see #getRegimeTravail()
	 * @see #setRegimeTravail(TypeDictionaryDicoEquipesReparationRegimeTravail)
	 * @generated
	 */
	void unsetRegimeTravail();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEquipesReparation#getRegimeTravail <em>Regime Travail</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Regime Travail</em>' attribute is set.
	 * @see #unsetRegimeTravail()
	 * @see #getRegimeTravail()
	 * @see #setRegimeTravail(TypeDictionaryDicoEquipesReparationRegimeTravail)
	 * @generated
	 */
	boolean isSetRegimeTravail();

	/**
	 * Returns the value of the '<em><b>CTE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CTE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CTE</em>' attribute.
	 * @see #setCTE(String)
	 * @see mpia.schema.SchemaPackage#getTypeEquipesReparation_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEquipesReparation#getCTE <em>CTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CTE</em>' attribute.
	 * @see #getCTE()
	 * @generated
	 */
	void setCTE(String value);

	/**
	 * Returns the value of the '<em><b>CE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CE</em>' attribute.
	 * @see #setCE(String)
	 * @see mpia.schema.SchemaPackage#getTypeEquipesReparation_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEquipesReparation#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

} // TypeEquipesReparation
