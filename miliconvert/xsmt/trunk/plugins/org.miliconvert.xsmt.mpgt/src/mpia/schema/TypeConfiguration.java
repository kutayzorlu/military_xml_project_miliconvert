/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeMasse;
import mpia.meta.TypeDataTypeVolume;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeConfiguration#getMasseMaxDecollageMunition <em>Masse Max Decollage Munition</em>}</li>
 *   <li>{@link mpia.schema.TypeConfiguration#getCapaciteMaxTransport <em>Capacite Max Transport</em>}</li>
 *   <li>{@link mpia.schema.TypeConfiguration#getMasseMaxDecollagePersConsommable <em>Masse Max Decollage Pers Consommable</em>}</li>
 *   <li>{@link mpia.schema.TypeConfiguration#getChargeEmbarqueMunition <em>Charge Embarque Munition</em>}</li>
 *   <li>{@link mpia.schema.TypeConfiguration#getQuantiteCarburantReserveSecurite <em>Quantite Carburant Reserve Securite</em>}</li>
 *   <li>{@link mpia.schema.TypeConfiguration#getConsommationHoraireCarburant <em>Consommation Horaire Carburant</em>}</li>
 *   <li>{@link mpia.schema.TypeConfiguration#getCapaciteEffectiveCarburant <em>Capacite Effective Carburant</em>}</li>
 *   <li>{@link mpia.schema.TypeConfiguration#getQuantiteMaxCarburant <em>Quantite Max Carburant</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeConfiguration()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_Configuration' kind='elementOnly'"
 * @generated
 */
public interface TypeConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Masse Max Decollage Munition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Masse Max Decollage Munition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Masse Max Decollage Munition</em>' containment reference.
	 * @see #setMasseMaxDecollageMunition(TypeDataTypeMasse)
	 * @see mpia.schema.SchemaPackage#getTypeConfiguration_MasseMaxDecollageMunition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MasseMaxDecollageMunition'"
	 * @generated
	 */
	TypeDataTypeMasse getMasseMaxDecollageMunition();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConfiguration#getMasseMaxDecollageMunition <em>Masse Max Decollage Munition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Masse Max Decollage Munition</em>' containment reference.
	 * @see #getMasseMaxDecollageMunition()
	 * @generated
	 */
	void setMasseMaxDecollageMunition(TypeDataTypeMasse value);

	/**
	 * Returns the value of the '<em><b>Capacite Max Transport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacite Max Transport</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacite Max Transport</em>' containment reference.
	 * @see #setCapaciteMaxTransport(TypeDataTypeMasse)
	 * @see mpia.schema.SchemaPackage#getTypeConfiguration_CapaciteMaxTransport()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CapaciteMaxTransport'"
	 * @generated
	 */
	TypeDataTypeMasse getCapaciteMaxTransport();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConfiguration#getCapaciteMaxTransport <em>Capacite Max Transport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacite Max Transport</em>' containment reference.
	 * @see #getCapaciteMaxTransport()
	 * @generated
	 */
	void setCapaciteMaxTransport(TypeDataTypeMasse value);

	/**
	 * Returns the value of the '<em><b>Masse Max Decollage Pers Consommable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Masse Max Decollage Pers Consommable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Masse Max Decollage Pers Consommable</em>' containment reference.
	 * @see #setMasseMaxDecollagePersConsommable(TypeDataTypeMasse)
	 * @see mpia.schema.SchemaPackage#getTypeConfiguration_MasseMaxDecollagePersConsommable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MasseMaxDecollagePersConsommable'"
	 * @generated
	 */
	TypeDataTypeMasse getMasseMaxDecollagePersConsommable();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConfiguration#getMasseMaxDecollagePersConsommable <em>Masse Max Decollage Pers Consommable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Masse Max Decollage Pers Consommable</em>' containment reference.
	 * @see #getMasseMaxDecollagePersConsommable()
	 * @generated
	 */
	void setMasseMaxDecollagePersConsommable(TypeDataTypeMasse value);

	/**
	 * Returns the value of the '<em><b>Charge Embarque Munition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charge Embarque Munition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charge Embarque Munition</em>' containment reference.
	 * @see #setChargeEmbarqueMunition(TypeDataTypeMasse)
	 * @see mpia.schema.SchemaPackage#getTypeConfiguration_ChargeEmbarqueMunition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ChargeEmbarqueMunition'"
	 * @generated
	 */
	TypeDataTypeMasse getChargeEmbarqueMunition();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConfiguration#getChargeEmbarqueMunition <em>Charge Embarque Munition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charge Embarque Munition</em>' containment reference.
	 * @see #getChargeEmbarqueMunition()
	 * @generated
	 */
	void setChargeEmbarqueMunition(TypeDataTypeMasse value);

	/**
	 * Returns the value of the '<em><b>Quantite Carburant Reserve Securite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantite Carburant Reserve Securite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite Carburant Reserve Securite</em>' containment reference.
	 * @see #setQuantiteCarburantReserveSecurite(TypeDataTypeVolume)
	 * @see mpia.schema.SchemaPackage#getTypeConfiguration_QuantiteCarburantReserveSecurite()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='QuantiteCarburantReserveSecurite'"
	 * @generated
	 */
	TypeDataTypeVolume getQuantiteCarburantReserveSecurite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConfiguration#getQuantiteCarburantReserveSecurite <em>Quantite Carburant Reserve Securite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite Carburant Reserve Securite</em>' containment reference.
	 * @see #getQuantiteCarburantReserveSecurite()
	 * @generated
	 */
	void setQuantiteCarburantReserveSecurite(TypeDataTypeVolume value);

	/**
	 * Returns the value of the '<em><b>Consommation Horaire Carburant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consommation Horaire Carburant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consommation Horaire Carburant</em>' containment reference.
	 * @see #setConsommationHoraireCarburant(TypeDataTypeVolume)
	 * @see mpia.schema.SchemaPackage#getTypeConfiguration_ConsommationHoraireCarburant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ConsommationHoraireCarburant'"
	 * @generated
	 */
	TypeDataTypeVolume getConsommationHoraireCarburant();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConfiguration#getConsommationHoraireCarburant <em>Consommation Horaire Carburant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consommation Horaire Carburant</em>' containment reference.
	 * @see #getConsommationHoraireCarburant()
	 * @generated
	 */
	void setConsommationHoraireCarburant(TypeDataTypeVolume value);

	/**
	 * Returns the value of the '<em><b>Capacite Effective Carburant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacite Effective Carburant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacite Effective Carburant</em>' containment reference.
	 * @see #setCapaciteEffectiveCarburant(TypeDataTypeVolume)
	 * @see mpia.schema.SchemaPackage#getTypeConfiguration_CapaciteEffectiveCarburant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CapaciteEffectiveCarburant'"
	 * @generated
	 */
	TypeDataTypeVolume getCapaciteEffectiveCarburant();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConfiguration#getCapaciteEffectiveCarburant <em>Capacite Effective Carburant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacite Effective Carburant</em>' containment reference.
	 * @see #getCapaciteEffectiveCarburant()
	 * @generated
	 */
	void setCapaciteEffectiveCarburant(TypeDataTypeVolume value);

	/**
	 * Returns the value of the '<em><b>Quantite Max Carburant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantite Max Carburant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite Max Carburant</em>' containment reference.
	 * @see #setQuantiteMaxCarburant(TypeDataTypeVolume)
	 * @see mpia.schema.SchemaPackage#getTypeConfiguration_QuantiteMaxCarburant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='QuantiteMaxCarburant'"
	 * @generated
	 */
	TypeDataTypeVolume getQuantiteMaxCarburant();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConfiguration#getQuantiteMaxCarburant <em>Quantite Max Carburant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite Max Carburant</em>' containment reference.
	 * @see #getQuantiteMaxCarburant()
	 * @generated
	 */
	void setQuantiteMaxCarburant(TypeDataTypeVolume value);

} // TypeConfiguration
