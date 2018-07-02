/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Vehicule Exceptionnel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeVehiculeExceptionnel#getTypeVehiculeExceptionnel <em>Type Vehicule Exceptionnel</em>}</li>
 *   <li>{@link mpia.schema.TypeVehiculeExceptionnel#getNombreEssieuxTracteur <em>Nombre Essieux Tracteur</em>}</li>
 *   <li>{@link mpia.schema.TypeVehiculeExceptionnel#getNombreEssieuxSemiRemorque <em>Nombre Essieux Semi Remorque</em>}</li>
 *   <li>{@link mpia.schema.TypeVehiculeExceptionnel#getPoidsTotal <em>Poids Total</em>}</li>
 *   <li>{@link mpia.schema.TypeVehiculeExceptionnel#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeVehiculeExceptionnel#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeVehiculeExceptionnel#getACommeCaracteristiqueEssieuEssieu <em>AComme Caracteristique Essieu Essieu</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeVehiculeExceptionnel()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_VehiculeExceptionnel' kind='elementOnly'"
 * @generated
 */
public interface TypeVehiculeExceptionnel extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Vehicule Exceptionnel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Vehicule Exceptionnel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Vehicule Exceptionnel</em>' attribute.
	 * @see #setTypeVehiculeExceptionnel(String)
	 * @see mpia.schema.SchemaPackage#getTypeVehiculeExceptionnel_TypeVehiculeExceptionnel()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080" required="true"
	 *        extendedMetaData="kind='element' name='TypeVehiculeExceptionnel'"
	 * @generated
	 */
	String getTypeVehiculeExceptionnel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVehiculeExceptionnel#getTypeVehiculeExceptionnel <em>Type Vehicule Exceptionnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Vehicule Exceptionnel</em>' attribute.
	 * @see #getTypeVehiculeExceptionnel()
	 * @generated
	 */
	void setTypeVehiculeExceptionnel(String value);

	/**
	 * Returns the value of the '<em><b>Nombre Essieux Tracteur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Essieux Tracteur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Essieux Tracteur</em>' attribute.
	 * @see #isSetNombreEssieuxTracteur()
	 * @see #unsetNombreEssieuxTracteur()
	 * @see #setNombreEssieuxTracteur(long)
	 * @see mpia.schema.SchemaPackage#getTypeVehiculeExceptionnel_NombreEssieuxTracteur()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NombreEssieuxTracteur'"
	 * @generated
	 */
	long getNombreEssieuxTracteur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVehiculeExceptionnel#getNombreEssieuxTracteur <em>Nombre Essieux Tracteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Essieux Tracteur</em>' attribute.
	 * @see #isSetNombreEssieuxTracteur()
	 * @see #unsetNombreEssieuxTracteur()
	 * @see #getNombreEssieuxTracteur()
	 * @generated
	 */
	void setNombreEssieuxTracteur(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeVehiculeExceptionnel#getNombreEssieuxTracteur <em>Nombre Essieux Tracteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreEssieuxTracteur()
	 * @see #getNombreEssieuxTracteur()
	 * @see #setNombreEssieuxTracteur(long)
	 * @generated
	 */
	void unsetNombreEssieuxTracteur();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeVehiculeExceptionnel#getNombreEssieuxTracteur <em>Nombre Essieux Tracteur</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Essieux Tracteur</em>' attribute is set.
	 * @see #unsetNombreEssieuxTracteur()
	 * @see #getNombreEssieuxTracteur()
	 * @see #setNombreEssieuxTracteur(long)
	 * @generated
	 */
	boolean isSetNombreEssieuxTracteur();

	/**
	 * Returns the value of the '<em><b>Nombre Essieux Semi Remorque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Essieux Semi Remorque</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Essieux Semi Remorque</em>' attribute.
	 * @see #isSetNombreEssieuxSemiRemorque()
	 * @see #unsetNombreEssieuxSemiRemorque()
	 * @see #setNombreEssieuxSemiRemorque(long)
	 * @see mpia.schema.SchemaPackage#getTypeVehiculeExceptionnel_NombreEssieuxSemiRemorque()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NombreEssieuxSemiRemorque'"
	 * @generated
	 */
	long getNombreEssieuxSemiRemorque();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVehiculeExceptionnel#getNombreEssieuxSemiRemorque <em>Nombre Essieux Semi Remorque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Essieux Semi Remorque</em>' attribute.
	 * @see #isSetNombreEssieuxSemiRemorque()
	 * @see #unsetNombreEssieuxSemiRemorque()
	 * @see #getNombreEssieuxSemiRemorque()
	 * @generated
	 */
	void setNombreEssieuxSemiRemorque(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeVehiculeExceptionnel#getNombreEssieuxSemiRemorque <em>Nombre Essieux Semi Remorque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreEssieuxSemiRemorque()
	 * @see #getNombreEssieuxSemiRemorque()
	 * @see #setNombreEssieuxSemiRemorque(long)
	 * @generated
	 */
	void unsetNombreEssieuxSemiRemorque();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeVehiculeExceptionnel#getNombreEssieuxSemiRemorque <em>Nombre Essieux Semi Remorque</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Essieux Semi Remorque</em>' attribute is set.
	 * @see #unsetNombreEssieuxSemiRemorque()
	 * @see #getNombreEssieuxSemiRemorque()
	 * @see #setNombreEssieuxSemiRemorque(long)
	 * @generated
	 */
	boolean isSetNombreEssieuxSemiRemorque();

	/**
	 * Returns the value of the '<em><b>Poids Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Poids Total</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poids Total</em>' attribute.
	 * @see #isSetPoidsTotal()
	 * @see #unsetPoidsTotal()
	 * @see #setPoidsTotal(long)
	 * @see mpia.schema.SchemaPackage#getTypeVehiculeExceptionnel_PoidsTotal()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='PoidsTotal'"
	 * @generated
	 */
	long getPoidsTotal();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVehiculeExceptionnel#getPoidsTotal <em>Poids Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Poids Total</em>' attribute.
	 * @see #isSetPoidsTotal()
	 * @see #unsetPoidsTotal()
	 * @see #getPoidsTotal()
	 * @generated
	 */
	void setPoidsTotal(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeVehiculeExceptionnel#getPoidsTotal <em>Poids Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPoidsTotal()
	 * @see #getPoidsTotal()
	 * @see #setPoidsTotal(long)
	 * @generated
	 */
	void unsetPoidsTotal();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeVehiculeExceptionnel#getPoidsTotal <em>Poids Total</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Poids Total</em>' attribute is set.
	 * @see #unsetPoidsTotal()
	 * @see #getPoidsTotal()
	 * @see #setPoidsTotal(long)
	 * @generated
	 */
	boolean isSetPoidsTotal();

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
	 * @see mpia.schema.SchemaPackage#getTypeVehiculeExceptionnel_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVehiculeExceptionnel#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeVehiculeExceptionnel_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVehiculeExceptionnel#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>AComme Caracteristique Essieu Essieu</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeEssieu}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Caracteristique Essieu Essieu</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Caracteristique Essieu Essieu</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeVehiculeExceptionnel_ACommeCaracteristiqueEssieuEssieu()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Essieu'"
	 *        extendedMetaData="kind='element' name='ACommeCaracteristiqueEssieu_Essieu'"
	 * @generated
	 */
	EList<TypeEssieu> getACommeCaracteristiqueEssieuEssieu();

} // TypeVehiculeExceptionnel
