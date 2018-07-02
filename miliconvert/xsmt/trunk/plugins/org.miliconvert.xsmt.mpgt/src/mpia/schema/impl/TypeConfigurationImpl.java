/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeMasse;
import mpia.meta.TypeDataTypeVolume;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeConfiguration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeConfigurationImpl#getMasseMaxDecollageMunition <em>Masse Max Decollage Munition</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConfigurationImpl#getCapaciteMaxTransport <em>Capacite Max Transport</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConfigurationImpl#getMasseMaxDecollagePersConsommable <em>Masse Max Decollage Pers Consommable</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConfigurationImpl#getChargeEmbarqueMunition <em>Charge Embarque Munition</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConfigurationImpl#getQuantiteCarburantReserveSecurite <em>Quantite Carburant Reserve Securite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConfigurationImpl#getConsommationHoraireCarburant <em>Consommation Horaire Carburant</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConfigurationImpl#getCapaciteEffectiveCarburant <em>Capacite Effective Carburant</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConfigurationImpl#getQuantiteMaxCarburant <em>Quantite Max Carburant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeConfigurationImpl extends EObjectImpl implements TypeConfiguration {
	/**
	 * The cached value of the '{@link #getMasseMaxDecollageMunition() <em>Masse Max Decollage Munition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasseMaxDecollageMunition()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeMasse masseMaxDecollageMunition;

	/**
	 * The cached value of the '{@link #getCapaciteMaxTransport() <em>Capacite Max Transport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapaciteMaxTransport()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeMasse capaciteMaxTransport;

	/**
	 * The cached value of the '{@link #getMasseMaxDecollagePersConsommable() <em>Masse Max Decollage Pers Consommable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasseMaxDecollagePersConsommable()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeMasse masseMaxDecollagePersConsommable;

	/**
	 * The cached value of the '{@link #getChargeEmbarqueMunition() <em>Charge Embarque Munition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargeEmbarqueMunition()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeMasse chargeEmbarqueMunition;

	/**
	 * The cached value of the '{@link #getQuantiteCarburantReserveSecurite() <em>Quantite Carburant Reserve Securite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteCarburantReserveSecurite()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeVolume quantiteCarburantReserveSecurite;

	/**
	 * The cached value of the '{@link #getConsommationHoraireCarburant() <em>Consommation Horaire Carburant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsommationHoraireCarburant()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeVolume consommationHoraireCarburant;

	/**
	 * The cached value of the '{@link #getCapaciteEffectiveCarburant() <em>Capacite Effective Carburant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapaciteEffectiveCarburant()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeVolume capaciteEffectiveCarburant;

	/**
	 * The cached value of the '{@link #getQuantiteMaxCarburant() <em>Quantite Max Carburant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteMaxCarburant()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeVolume quantiteMaxCarburant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeConfiguration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeMasse getMasseMaxDecollageMunition() {
		return masseMaxDecollageMunition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMasseMaxDecollageMunition(TypeDataTypeMasse newMasseMaxDecollageMunition, NotificationChain msgs) {
		TypeDataTypeMasse oldMasseMaxDecollageMunition = masseMaxDecollageMunition;
		masseMaxDecollageMunition = newMasseMaxDecollageMunition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONFIGURATION__MASSE_MAX_DECOLLAGE_MUNITION, oldMasseMaxDecollageMunition, newMasseMaxDecollageMunition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMasseMaxDecollageMunition(TypeDataTypeMasse newMasseMaxDecollageMunition) {
		if (newMasseMaxDecollageMunition != masseMaxDecollageMunition) {
			NotificationChain msgs = null;
			if (masseMaxDecollageMunition != null)
				msgs = ((InternalEObject)masseMaxDecollageMunition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONFIGURATION__MASSE_MAX_DECOLLAGE_MUNITION, null, msgs);
			if (newMasseMaxDecollageMunition != null)
				msgs = ((InternalEObject)newMasseMaxDecollageMunition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONFIGURATION__MASSE_MAX_DECOLLAGE_MUNITION, null, msgs);
			msgs = basicSetMasseMaxDecollageMunition(newMasseMaxDecollageMunition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONFIGURATION__MASSE_MAX_DECOLLAGE_MUNITION, newMasseMaxDecollageMunition, newMasseMaxDecollageMunition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeMasse getCapaciteMaxTransport() {
		return capaciteMaxTransport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCapaciteMaxTransport(TypeDataTypeMasse newCapaciteMaxTransport, NotificationChain msgs) {
		TypeDataTypeMasse oldCapaciteMaxTransport = capaciteMaxTransport;
		capaciteMaxTransport = newCapaciteMaxTransport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONFIGURATION__CAPACITE_MAX_TRANSPORT, oldCapaciteMaxTransport, newCapaciteMaxTransport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapaciteMaxTransport(TypeDataTypeMasse newCapaciteMaxTransport) {
		if (newCapaciteMaxTransport != capaciteMaxTransport) {
			NotificationChain msgs = null;
			if (capaciteMaxTransport != null)
				msgs = ((InternalEObject)capaciteMaxTransport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONFIGURATION__CAPACITE_MAX_TRANSPORT, null, msgs);
			if (newCapaciteMaxTransport != null)
				msgs = ((InternalEObject)newCapaciteMaxTransport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONFIGURATION__CAPACITE_MAX_TRANSPORT, null, msgs);
			msgs = basicSetCapaciteMaxTransport(newCapaciteMaxTransport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONFIGURATION__CAPACITE_MAX_TRANSPORT, newCapaciteMaxTransport, newCapaciteMaxTransport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeMasse getMasseMaxDecollagePersConsommable() {
		return masseMaxDecollagePersConsommable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMasseMaxDecollagePersConsommable(TypeDataTypeMasse newMasseMaxDecollagePersConsommable, NotificationChain msgs) {
		TypeDataTypeMasse oldMasseMaxDecollagePersConsommable = masseMaxDecollagePersConsommable;
		masseMaxDecollagePersConsommable = newMasseMaxDecollagePersConsommable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONFIGURATION__MASSE_MAX_DECOLLAGE_PERS_CONSOMMABLE, oldMasseMaxDecollagePersConsommable, newMasseMaxDecollagePersConsommable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMasseMaxDecollagePersConsommable(TypeDataTypeMasse newMasseMaxDecollagePersConsommable) {
		if (newMasseMaxDecollagePersConsommable != masseMaxDecollagePersConsommable) {
			NotificationChain msgs = null;
			if (masseMaxDecollagePersConsommable != null)
				msgs = ((InternalEObject)masseMaxDecollagePersConsommable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONFIGURATION__MASSE_MAX_DECOLLAGE_PERS_CONSOMMABLE, null, msgs);
			if (newMasseMaxDecollagePersConsommable != null)
				msgs = ((InternalEObject)newMasseMaxDecollagePersConsommable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONFIGURATION__MASSE_MAX_DECOLLAGE_PERS_CONSOMMABLE, null, msgs);
			msgs = basicSetMasseMaxDecollagePersConsommable(newMasseMaxDecollagePersConsommable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONFIGURATION__MASSE_MAX_DECOLLAGE_PERS_CONSOMMABLE, newMasseMaxDecollagePersConsommable, newMasseMaxDecollagePersConsommable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeMasse getChargeEmbarqueMunition() {
		return chargeEmbarqueMunition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChargeEmbarqueMunition(TypeDataTypeMasse newChargeEmbarqueMunition, NotificationChain msgs) {
		TypeDataTypeMasse oldChargeEmbarqueMunition = chargeEmbarqueMunition;
		chargeEmbarqueMunition = newChargeEmbarqueMunition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONFIGURATION__CHARGE_EMBARQUE_MUNITION, oldChargeEmbarqueMunition, newChargeEmbarqueMunition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChargeEmbarqueMunition(TypeDataTypeMasse newChargeEmbarqueMunition) {
		if (newChargeEmbarqueMunition != chargeEmbarqueMunition) {
			NotificationChain msgs = null;
			if (chargeEmbarqueMunition != null)
				msgs = ((InternalEObject)chargeEmbarqueMunition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONFIGURATION__CHARGE_EMBARQUE_MUNITION, null, msgs);
			if (newChargeEmbarqueMunition != null)
				msgs = ((InternalEObject)newChargeEmbarqueMunition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONFIGURATION__CHARGE_EMBARQUE_MUNITION, null, msgs);
			msgs = basicSetChargeEmbarqueMunition(newChargeEmbarqueMunition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONFIGURATION__CHARGE_EMBARQUE_MUNITION, newChargeEmbarqueMunition, newChargeEmbarqueMunition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeVolume getQuantiteCarburantReserveSecurite() {
		return quantiteCarburantReserveSecurite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantiteCarburantReserveSecurite(TypeDataTypeVolume newQuantiteCarburantReserveSecurite, NotificationChain msgs) {
		TypeDataTypeVolume oldQuantiteCarburantReserveSecurite = quantiteCarburantReserveSecurite;
		quantiteCarburantReserveSecurite = newQuantiteCarburantReserveSecurite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONFIGURATION__QUANTITE_CARBURANT_RESERVE_SECURITE, oldQuantiteCarburantReserveSecurite, newQuantiteCarburantReserveSecurite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantiteCarburantReserveSecurite(TypeDataTypeVolume newQuantiteCarburantReserveSecurite) {
		if (newQuantiteCarburantReserveSecurite != quantiteCarburantReserveSecurite) {
			NotificationChain msgs = null;
			if (quantiteCarburantReserveSecurite != null)
				msgs = ((InternalEObject)quantiteCarburantReserveSecurite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONFIGURATION__QUANTITE_CARBURANT_RESERVE_SECURITE, null, msgs);
			if (newQuantiteCarburantReserveSecurite != null)
				msgs = ((InternalEObject)newQuantiteCarburantReserveSecurite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONFIGURATION__QUANTITE_CARBURANT_RESERVE_SECURITE, null, msgs);
			msgs = basicSetQuantiteCarburantReserveSecurite(newQuantiteCarburantReserveSecurite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONFIGURATION__QUANTITE_CARBURANT_RESERVE_SECURITE, newQuantiteCarburantReserveSecurite, newQuantiteCarburantReserveSecurite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeVolume getConsommationHoraireCarburant() {
		return consommationHoraireCarburant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConsommationHoraireCarburant(TypeDataTypeVolume newConsommationHoraireCarburant, NotificationChain msgs) {
		TypeDataTypeVolume oldConsommationHoraireCarburant = consommationHoraireCarburant;
		consommationHoraireCarburant = newConsommationHoraireCarburant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONFIGURATION__CONSOMMATION_HORAIRE_CARBURANT, oldConsommationHoraireCarburant, newConsommationHoraireCarburant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsommationHoraireCarburant(TypeDataTypeVolume newConsommationHoraireCarburant) {
		if (newConsommationHoraireCarburant != consommationHoraireCarburant) {
			NotificationChain msgs = null;
			if (consommationHoraireCarburant != null)
				msgs = ((InternalEObject)consommationHoraireCarburant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONFIGURATION__CONSOMMATION_HORAIRE_CARBURANT, null, msgs);
			if (newConsommationHoraireCarburant != null)
				msgs = ((InternalEObject)newConsommationHoraireCarburant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONFIGURATION__CONSOMMATION_HORAIRE_CARBURANT, null, msgs);
			msgs = basicSetConsommationHoraireCarburant(newConsommationHoraireCarburant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONFIGURATION__CONSOMMATION_HORAIRE_CARBURANT, newConsommationHoraireCarburant, newConsommationHoraireCarburant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeVolume getCapaciteEffectiveCarburant() {
		return capaciteEffectiveCarburant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCapaciteEffectiveCarburant(TypeDataTypeVolume newCapaciteEffectiveCarburant, NotificationChain msgs) {
		TypeDataTypeVolume oldCapaciteEffectiveCarburant = capaciteEffectiveCarburant;
		capaciteEffectiveCarburant = newCapaciteEffectiveCarburant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONFIGURATION__CAPACITE_EFFECTIVE_CARBURANT, oldCapaciteEffectiveCarburant, newCapaciteEffectiveCarburant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapaciteEffectiveCarburant(TypeDataTypeVolume newCapaciteEffectiveCarburant) {
		if (newCapaciteEffectiveCarburant != capaciteEffectiveCarburant) {
			NotificationChain msgs = null;
			if (capaciteEffectiveCarburant != null)
				msgs = ((InternalEObject)capaciteEffectiveCarburant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONFIGURATION__CAPACITE_EFFECTIVE_CARBURANT, null, msgs);
			if (newCapaciteEffectiveCarburant != null)
				msgs = ((InternalEObject)newCapaciteEffectiveCarburant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONFIGURATION__CAPACITE_EFFECTIVE_CARBURANT, null, msgs);
			msgs = basicSetCapaciteEffectiveCarburant(newCapaciteEffectiveCarburant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONFIGURATION__CAPACITE_EFFECTIVE_CARBURANT, newCapaciteEffectiveCarburant, newCapaciteEffectiveCarburant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeVolume getQuantiteMaxCarburant() {
		return quantiteMaxCarburant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantiteMaxCarburant(TypeDataTypeVolume newQuantiteMaxCarburant, NotificationChain msgs) {
		TypeDataTypeVolume oldQuantiteMaxCarburant = quantiteMaxCarburant;
		quantiteMaxCarburant = newQuantiteMaxCarburant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONFIGURATION__QUANTITE_MAX_CARBURANT, oldQuantiteMaxCarburant, newQuantiteMaxCarburant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantiteMaxCarburant(TypeDataTypeVolume newQuantiteMaxCarburant) {
		if (newQuantiteMaxCarburant != quantiteMaxCarburant) {
			NotificationChain msgs = null;
			if (quantiteMaxCarburant != null)
				msgs = ((InternalEObject)quantiteMaxCarburant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONFIGURATION__QUANTITE_MAX_CARBURANT, null, msgs);
			if (newQuantiteMaxCarburant != null)
				msgs = ((InternalEObject)newQuantiteMaxCarburant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONFIGURATION__QUANTITE_MAX_CARBURANT, null, msgs);
			msgs = basicSetQuantiteMaxCarburant(newQuantiteMaxCarburant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONFIGURATION__QUANTITE_MAX_CARBURANT, newQuantiteMaxCarburant, newQuantiteMaxCarburant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_CONFIGURATION__MASSE_MAX_DECOLLAGE_MUNITION:
				return basicSetMasseMaxDecollageMunition(null, msgs);
			case SchemaPackage.TYPE_CONFIGURATION__CAPACITE_MAX_TRANSPORT:
				return basicSetCapaciteMaxTransport(null, msgs);
			case SchemaPackage.TYPE_CONFIGURATION__MASSE_MAX_DECOLLAGE_PERS_CONSOMMABLE:
				return basicSetMasseMaxDecollagePersConsommable(null, msgs);
			case SchemaPackage.TYPE_CONFIGURATION__CHARGE_EMBARQUE_MUNITION:
				return basicSetChargeEmbarqueMunition(null, msgs);
			case SchemaPackage.TYPE_CONFIGURATION__QUANTITE_CARBURANT_RESERVE_SECURITE:
				return basicSetQuantiteCarburantReserveSecurite(null, msgs);
			case SchemaPackage.TYPE_CONFIGURATION__CONSOMMATION_HORAIRE_CARBURANT:
				return basicSetConsommationHoraireCarburant(null, msgs);
			case SchemaPackage.TYPE_CONFIGURATION__CAPACITE_EFFECTIVE_CARBURANT:
				return basicSetCapaciteEffectiveCarburant(null, msgs);
			case SchemaPackage.TYPE_CONFIGURATION__QUANTITE_MAX_CARBURANT:
				return basicSetQuantiteMaxCarburant(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_CONFIGURATION__MASSE_MAX_DECOLLAGE_MUNITION:
				return getMasseMaxDecollageMunition();
			case SchemaPackage.TYPE_CONFIGURATION__CAPACITE_MAX_TRANSPORT:
				return getCapaciteMaxTransport();
			case SchemaPackage.TYPE_CONFIGURATION__MASSE_MAX_DECOLLAGE_PERS_CONSOMMABLE:
				return getMasseMaxDecollagePersConsommable();
			case SchemaPackage.TYPE_CONFIGURATION__CHARGE_EMBARQUE_MUNITION:
				return getChargeEmbarqueMunition();
			case SchemaPackage.TYPE_CONFIGURATION__QUANTITE_CARBURANT_RESERVE_SECURITE:
				return getQuantiteCarburantReserveSecurite();
			case SchemaPackage.TYPE_CONFIGURATION__CONSOMMATION_HORAIRE_CARBURANT:
				return getConsommationHoraireCarburant();
			case SchemaPackage.TYPE_CONFIGURATION__CAPACITE_EFFECTIVE_CARBURANT:
				return getCapaciteEffectiveCarburant();
			case SchemaPackage.TYPE_CONFIGURATION__QUANTITE_MAX_CARBURANT:
				return getQuantiteMaxCarburant();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SchemaPackage.TYPE_CONFIGURATION__MASSE_MAX_DECOLLAGE_MUNITION:
				setMasseMaxDecollageMunition((TypeDataTypeMasse)newValue);
				return;
			case SchemaPackage.TYPE_CONFIGURATION__CAPACITE_MAX_TRANSPORT:
				setCapaciteMaxTransport((TypeDataTypeMasse)newValue);
				return;
			case SchemaPackage.TYPE_CONFIGURATION__MASSE_MAX_DECOLLAGE_PERS_CONSOMMABLE:
				setMasseMaxDecollagePersConsommable((TypeDataTypeMasse)newValue);
				return;
			case SchemaPackage.TYPE_CONFIGURATION__CHARGE_EMBARQUE_MUNITION:
				setChargeEmbarqueMunition((TypeDataTypeMasse)newValue);
				return;
			case SchemaPackage.TYPE_CONFIGURATION__QUANTITE_CARBURANT_RESERVE_SECURITE:
				setQuantiteCarburantReserveSecurite((TypeDataTypeVolume)newValue);
				return;
			case SchemaPackage.TYPE_CONFIGURATION__CONSOMMATION_HORAIRE_CARBURANT:
				setConsommationHoraireCarburant((TypeDataTypeVolume)newValue);
				return;
			case SchemaPackage.TYPE_CONFIGURATION__CAPACITE_EFFECTIVE_CARBURANT:
				setCapaciteEffectiveCarburant((TypeDataTypeVolume)newValue);
				return;
			case SchemaPackage.TYPE_CONFIGURATION__QUANTITE_MAX_CARBURANT:
				setQuantiteMaxCarburant((TypeDataTypeVolume)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SchemaPackage.TYPE_CONFIGURATION__MASSE_MAX_DECOLLAGE_MUNITION:
				setMasseMaxDecollageMunition((TypeDataTypeMasse)null);
				return;
			case SchemaPackage.TYPE_CONFIGURATION__CAPACITE_MAX_TRANSPORT:
				setCapaciteMaxTransport((TypeDataTypeMasse)null);
				return;
			case SchemaPackage.TYPE_CONFIGURATION__MASSE_MAX_DECOLLAGE_PERS_CONSOMMABLE:
				setMasseMaxDecollagePersConsommable((TypeDataTypeMasse)null);
				return;
			case SchemaPackage.TYPE_CONFIGURATION__CHARGE_EMBARQUE_MUNITION:
				setChargeEmbarqueMunition((TypeDataTypeMasse)null);
				return;
			case SchemaPackage.TYPE_CONFIGURATION__QUANTITE_CARBURANT_RESERVE_SECURITE:
				setQuantiteCarburantReserveSecurite((TypeDataTypeVolume)null);
				return;
			case SchemaPackage.TYPE_CONFIGURATION__CONSOMMATION_HORAIRE_CARBURANT:
				setConsommationHoraireCarburant((TypeDataTypeVolume)null);
				return;
			case SchemaPackage.TYPE_CONFIGURATION__CAPACITE_EFFECTIVE_CARBURANT:
				setCapaciteEffectiveCarburant((TypeDataTypeVolume)null);
				return;
			case SchemaPackage.TYPE_CONFIGURATION__QUANTITE_MAX_CARBURANT:
				setQuantiteMaxCarburant((TypeDataTypeVolume)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SchemaPackage.TYPE_CONFIGURATION__MASSE_MAX_DECOLLAGE_MUNITION:
				return masseMaxDecollageMunition != null;
			case SchemaPackage.TYPE_CONFIGURATION__CAPACITE_MAX_TRANSPORT:
				return capaciteMaxTransport != null;
			case SchemaPackage.TYPE_CONFIGURATION__MASSE_MAX_DECOLLAGE_PERS_CONSOMMABLE:
				return masseMaxDecollagePersConsommable != null;
			case SchemaPackage.TYPE_CONFIGURATION__CHARGE_EMBARQUE_MUNITION:
				return chargeEmbarqueMunition != null;
			case SchemaPackage.TYPE_CONFIGURATION__QUANTITE_CARBURANT_RESERVE_SECURITE:
				return quantiteCarburantReserveSecurite != null;
			case SchemaPackage.TYPE_CONFIGURATION__CONSOMMATION_HORAIRE_CARBURANT:
				return consommationHoraireCarburant != null;
			case SchemaPackage.TYPE_CONFIGURATION__CAPACITE_EFFECTIVE_CARBURANT:
				return capaciteEffectiveCarburant != null;
			case SchemaPackage.TYPE_CONFIGURATION__QUANTITE_MAX_CARBURANT:
				return quantiteMaxCarburant != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeConfigurationImpl
