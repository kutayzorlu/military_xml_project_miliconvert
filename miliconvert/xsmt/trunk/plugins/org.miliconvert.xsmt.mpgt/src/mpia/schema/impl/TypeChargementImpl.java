/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeDataTypeVolume;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeChargement;
import mpia.schema.TypeDotationEffectiveConsommable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Chargement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeChargementImpl#getNombrePersonnesEmbarquees <em>Nombre Personnes Embarquees</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeChargementImpl#getQuantiteCarburantPrevue <em>Quantite Carburant Prevue</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeChargementImpl#getNombrePersonnesDebarquees <em>Nombre Personnes Debarquees</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeChargementImpl#getQuantiteMaterielEmbarque <em>Quantite Materiel Embarque</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeChargementImpl#getQuantiteMaterielDebarque <em>Quantite Materiel Debarque</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeChargementImpl#getAPourRessourceDechargeeDotationEffectiveConsommable <em>APour Ressource Dechargee Dotation Effective Consommable</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeChargementImpl#getAPourRessourceChargeeDotationEffectiveConsommable <em>APour Ressource Chargee Dotation Effective Consommable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeChargementImpl extends EObjectImpl implements TypeChargement {
	/**
	 * The default value of the '{@link #getNombrePersonnesEmbarquees() <em>Nombre Personnes Embarquees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombrePersonnesEmbarquees()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_PERSONNES_EMBARQUEES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombrePersonnesEmbarquees() <em>Nombre Personnes Embarquees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombrePersonnesEmbarquees()
	 * @generated
	 * @ordered
	 */
	protected long nombrePersonnesEmbarquees = NOMBRE_PERSONNES_EMBARQUEES_EDEFAULT;

	/**
	 * This is true if the Nombre Personnes Embarquees attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombrePersonnesEmbarqueesESet;

	/**
	 * The cached value of the '{@link #getQuantiteCarburantPrevue() <em>Quantite Carburant Prevue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteCarburantPrevue()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeVolume quantiteCarburantPrevue;

	/**
	 * The default value of the '{@link #getNombrePersonnesDebarquees() <em>Nombre Personnes Debarquees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombrePersonnesDebarquees()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_PERSONNES_DEBARQUEES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombrePersonnesDebarquees() <em>Nombre Personnes Debarquees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombrePersonnesDebarquees()
	 * @generated
	 * @ordered
	 */
	protected long nombrePersonnesDebarquees = NOMBRE_PERSONNES_DEBARQUEES_EDEFAULT;

	/**
	 * This is true if the Nombre Personnes Debarquees attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombrePersonnesDebarqueesESet;

	/**
	 * The default value of the '{@link #getQuantiteMaterielEmbarque() <em>Quantite Materiel Embarque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteMaterielEmbarque()
	 * @generated
	 * @ordered
	 */
	protected static final long QUANTITE_MATERIEL_EMBARQUE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getQuantiteMaterielEmbarque() <em>Quantite Materiel Embarque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteMaterielEmbarque()
	 * @generated
	 * @ordered
	 */
	protected long quantiteMaterielEmbarque = QUANTITE_MATERIEL_EMBARQUE_EDEFAULT;

	/**
	 * This is true if the Quantite Materiel Embarque attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quantiteMaterielEmbarqueESet;

	/**
	 * The default value of the '{@link #getQuantiteMaterielDebarque() <em>Quantite Materiel Debarque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteMaterielDebarque()
	 * @generated
	 * @ordered
	 */
	protected static final long QUANTITE_MATERIEL_DEBARQUE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getQuantiteMaterielDebarque() <em>Quantite Materiel Debarque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteMaterielDebarque()
	 * @generated
	 * @ordered
	 */
	protected long quantiteMaterielDebarque = QUANTITE_MATERIEL_DEBARQUE_EDEFAULT;

	/**
	 * This is true if the Quantite Materiel Debarque attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quantiteMaterielDebarqueESet;

	/**
	 * The cached value of the '{@link #getAPourRessourceDechargeeDotationEffectiveConsommable() <em>APour Ressource Dechargee Dotation Effective Consommable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourRessourceDechargeeDotationEffectiveConsommable()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeDotationEffectiveConsommable> aPourRessourceDechargeeDotationEffectiveConsommable;

	/**
	 * The cached value of the '{@link #getAPourRessourceChargeeDotationEffectiveConsommable() <em>APour Ressource Chargee Dotation Effective Consommable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourRessourceChargeeDotationEffectiveConsommable()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeDotationEffectiveConsommable> aPourRessourceChargeeDotationEffectiveConsommable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeChargementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeChargement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombrePersonnesEmbarquees() {
		return nombrePersonnesEmbarquees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombrePersonnesEmbarquees(long newNombrePersonnesEmbarquees) {
		long oldNombrePersonnesEmbarquees = nombrePersonnesEmbarquees;
		nombrePersonnesEmbarquees = newNombrePersonnesEmbarquees;
		boolean oldNombrePersonnesEmbarqueesESet = nombrePersonnesEmbarqueesESet;
		nombrePersonnesEmbarqueesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CHARGEMENT__NOMBRE_PERSONNES_EMBARQUEES, oldNombrePersonnesEmbarquees, nombrePersonnesEmbarquees, !oldNombrePersonnesEmbarqueesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombrePersonnesEmbarquees() {
		long oldNombrePersonnesEmbarquees = nombrePersonnesEmbarquees;
		boolean oldNombrePersonnesEmbarqueesESet = nombrePersonnesEmbarqueesESet;
		nombrePersonnesEmbarquees = NOMBRE_PERSONNES_EMBARQUEES_EDEFAULT;
		nombrePersonnesEmbarqueesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CHARGEMENT__NOMBRE_PERSONNES_EMBARQUEES, oldNombrePersonnesEmbarquees, NOMBRE_PERSONNES_EMBARQUEES_EDEFAULT, oldNombrePersonnesEmbarqueesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombrePersonnesEmbarquees() {
		return nombrePersonnesEmbarqueesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeVolume getQuantiteCarburantPrevue() {
		return quantiteCarburantPrevue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantiteCarburantPrevue(TypeDataTypeVolume newQuantiteCarburantPrevue, NotificationChain msgs) {
		TypeDataTypeVolume oldQuantiteCarburantPrevue = quantiteCarburantPrevue;
		quantiteCarburantPrevue = newQuantiteCarburantPrevue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CHARGEMENT__QUANTITE_CARBURANT_PREVUE, oldQuantiteCarburantPrevue, newQuantiteCarburantPrevue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantiteCarburantPrevue(TypeDataTypeVolume newQuantiteCarburantPrevue) {
		if (newQuantiteCarburantPrevue != quantiteCarburantPrevue) {
			NotificationChain msgs = null;
			if (quantiteCarburantPrevue != null)
				msgs = ((InternalEObject)quantiteCarburantPrevue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CHARGEMENT__QUANTITE_CARBURANT_PREVUE, null, msgs);
			if (newQuantiteCarburantPrevue != null)
				msgs = ((InternalEObject)newQuantiteCarburantPrevue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CHARGEMENT__QUANTITE_CARBURANT_PREVUE, null, msgs);
			msgs = basicSetQuantiteCarburantPrevue(newQuantiteCarburantPrevue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CHARGEMENT__QUANTITE_CARBURANT_PREVUE, newQuantiteCarburantPrevue, newQuantiteCarburantPrevue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombrePersonnesDebarquees() {
		return nombrePersonnesDebarquees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombrePersonnesDebarquees(long newNombrePersonnesDebarquees) {
		long oldNombrePersonnesDebarquees = nombrePersonnesDebarquees;
		nombrePersonnesDebarquees = newNombrePersonnesDebarquees;
		boolean oldNombrePersonnesDebarqueesESet = nombrePersonnesDebarqueesESet;
		nombrePersonnesDebarqueesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CHARGEMENT__NOMBRE_PERSONNES_DEBARQUEES, oldNombrePersonnesDebarquees, nombrePersonnesDebarquees, !oldNombrePersonnesDebarqueesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombrePersonnesDebarquees() {
		long oldNombrePersonnesDebarquees = nombrePersonnesDebarquees;
		boolean oldNombrePersonnesDebarqueesESet = nombrePersonnesDebarqueesESet;
		nombrePersonnesDebarquees = NOMBRE_PERSONNES_DEBARQUEES_EDEFAULT;
		nombrePersonnesDebarqueesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CHARGEMENT__NOMBRE_PERSONNES_DEBARQUEES, oldNombrePersonnesDebarquees, NOMBRE_PERSONNES_DEBARQUEES_EDEFAULT, oldNombrePersonnesDebarqueesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombrePersonnesDebarquees() {
		return nombrePersonnesDebarqueesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getQuantiteMaterielEmbarque() {
		return quantiteMaterielEmbarque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantiteMaterielEmbarque(long newQuantiteMaterielEmbarque) {
		long oldQuantiteMaterielEmbarque = quantiteMaterielEmbarque;
		quantiteMaterielEmbarque = newQuantiteMaterielEmbarque;
		boolean oldQuantiteMaterielEmbarqueESet = quantiteMaterielEmbarqueESet;
		quantiteMaterielEmbarqueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CHARGEMENT__QUANTITE_MATERIEL_EMBARQUE, oldQuantiteMaterielEmbarque, quantiteMaterielEmbarque, !oldQuantiteMaterielEmbarqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuantiteMaterielEmbarque() {
		long oldQuantiteMaterielEmbarque = quantiteMaterielEmbarque;
		boolean oldQuantiteMaterielEmbarqueESet = quantiteMaterielEmbarqueESet;
		quantiteMaterielEmbarque = QUANTITE_MATERIEL_EMBARQUE_EDEFAULT;
		quantiteMaterielEmbarqueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CHARGEMENT__QUANTITE_MATERIEL_EMBARQUE, oldQuantiteMaterielEmbarque, QUANTITE_MATERIEL_EMBARQUE_EDEFAULT, oldQuantiteMaterielEmbarqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuantiteMaterielEmbarque() {
		return quantiteMaterielEmbarqueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getQuantiteMaterielDebarque() {
		return quantiteMaterielDebarque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantiteMaterielDebarque(long newQuantiteMaterielDebarque) {
		long oldQuantiteMaterielDebarque = quantiteMaterielDebarque;
		quantiteMaterielDebarque = newQuantiteMaterielDebarque;
		boolean oldQuantiteMaterielDebarqueESet = quantiteMaterielDebarqueESet;
		quantiteMaterielDebarqueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CHARGEMENT__QUANTITE_MATERIEL_DEBARQUE, oldQuantiteMaterielDebarque, quantiteMaterielDebarque, !oldQuantiteMaterielDebarqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuantiteMaterielDebarque() {
		long oldQuantiteMaterielDebarque = quantiteMaterielDebarque;
		boolean oldQuantiteMaterielDebarqueESet = quantiteMaterielDebarqueESet;
		quantiteMaterielDebarque = QUANTITE_MATERIEL_DEBARQUE_EDEFAULT;
		quantiteMaterielDebarqueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CHARGEMENT__QUANTITE_MATERIEL_DEBARQUE, oldQuantiteMaterielDebarque, QUANTITE_MATERIEL_DEBARQUE_EDEFAULT, oldQuantiteMaterielDebarqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuantiteMaterielDebarque() {
		return quantiteMaterielDebarqueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDotationEffectiveConsommable> getAPourRessourceDechargeeDotationEffectiveConsommable() {
		if (aPourRessourceDechargeeDotationEffectiveConsommable == null) {
			aPourRessourceDechargeeDotationEffectiveConsommable = new EObjectContainmentEList<TypeDotationEffectiveConsommable>(TypeDotationEffectiveConsommable.class, this, SchemaPackage.TYPE_CHARGEMENT__APOUR_RESSOURCE_DECHARGEE_DOTATION_EFFECTIVE_CONSOMMABLE);
		}
		return aPourRessourceDechargeeDotationEffectiveConsommable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDotationEffectiveConsommable> getAPourRessourceChargeeDotationEffectiveConsommable() {
		if (aPourRessourceChargeeDotationEffectiveConsommable == null) {
			aPourRessourceChargeeDotationEffectiveConsommable = new EObjectContainmentEList<TypeDotationEffectiveConsommable>(TypeDotationEffectiveConsommable.class, this, SchemaPackage.TYPE_CHARGEMENT__APOUR_RESSOURCE_CHARGEE_DOTATION_EFFECTIVE_CONSOMMABLE);
		}
		return aPourRessourceChargeeDotationEffectiveConsommable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_CHARGEMENT__QUANTITE_CARBURANT_PREVUE:
				return basicSetQuantiteCarburantPrevue(null, msgs);
			case SchemaPackage.TYPE_CHARGEMENT__APOUR_RESSOURCE_DECHARGEE_DOTATION_EFFECTIVE_CONSOMMABLE:
				return ((InternalEList<?>)getAPourRessourceDechargeeDotationEffectiveConsommable()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_CHARGEMENT__APOUR_RESSOURCE_CHARGEE_DOTATION_EFFECTIVE_CONSOMMABLE:
				return ((InternalEList<?>)getAPourRessourceChargeeDotationEffectiveConsommable()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_CHARGEMENT__NOMBRE_PERSONNES_EMBARQUEES:
				return new Long(getNombrePersonnesEmbarquees());
			case SchemaPackage.TYPE_CHARGEMENT__QUANTITE_CARBURANT_PREVUE:
				return getQuantiteCarburantPrevue();
			case SchemaPackage.TYPE_CHARGEMENT__NOMBRE_PERSONNES_DEBARQUEES:
				return new Long(getNombrePersonnesDebarquees());
			case SchemaPackage.TYPE_CHARGEMENT__QUANTITE_MATERIEL_EMBARQUE:
				return new Long(getQuantiteMaterielEmbarque());
			case SchemaPackage.TYPE_CHARGEMENT__QUANTITE_MATERIEL_DEBARQUE:
				return new Long(getQuantiteMaterielDebarque());
			case SchemaPackage.TYPE_CHARGEMENT__APOUR_RESSOURCE_DECHARGEE_DOTATION_EFFECTIVE_CONSOMMABLE:
				return getAPourRessourceDechargeeDotationEffectiveConsommable();
			case SchemaPackage.TYPE_CHARGEMENT__APOUR_RESSOURCE_CHARGEE_DOTATION_EFFECTIVE_CONSOMMABLE:
				return getAPourRessourceChargeeDotationEffectiveConsommable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SchemaPackage.TYPE_CHARGEMENT__NOMBRE_PERSONNES_EMBARQUEES:
				setNombrePersonnesEmbarquees(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CHARGEMENT__QUANTITE_CARBURANT_PREVUE:
				setQuantiteCarburantPrevue((TypeDataTypeVolume)newValue);
				return;
			case SchemaPackage.TYPE_CHARGEMENT__NOMBRE_PERSONNES_DEBARQUEES:
				setNombrePersonnesDebarquees(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CHARGEMENT__QUANTITE_MATERIEL_EMBARQUE:
				setQuantiteMaterielEmbarque(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CHARGEMENT__QUANTITE_MATERIEL_DEBARQUE:
				setQuantiteMaterielDebarque(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CHARGEMENT__APOUR_RESSOURCE_DECHARGEE_DOTATION_EFFECTIVE_CONSOMMABLE:
				getAPourRessourceDechargeeDotationEffectiveConsommable().clear();
				getAPourRessourceDechargeeDotationEffectiveConsommable().addAll((Collection<? extends TypeDotationEffectiveConsommable>)newValue);
				return;
			case SchemaPackage.TYPE_CHARGEMENT__APOUR_RESSOURCE_CHARGEE_DOTATION_EFFECTIVE_CONSOMMABLE:
				getAPourRessourceChargeeDotationEffectiveConsommable().clear();
				getAPourRessourceChargeeDotationEffectiveConsommable().addAll((Collection<? extends TypeDotationEffectiveConsommable>)newValue);
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
			case SchemaPackage.TYPE_CHARGEMENT__NOMBRE_PERSONNES_EMBARQUEES:
				unsetNombrePersonnesEmbarquees();
				return;
			case SchemaPackage.TYPE_CHARGEMENT__QUANTITE_CARBURANT_PREVUE:
				setQuantiteCarburantPrevue((TypeDataTypeVolume)null);
				return;
			case SchemaPackage.TYPE_CHARGEMENT__NOMBRE_PERSONNES_DEBARQUEES:
				unsetNombrePersonnesDebarquees();
				return;
			case SchemaPackage.TYPE_CHARGEMENT__QUANTITE_MATERIEL_EMBARQUE:
				unsetQuantiteMaterielEmbarque();
				return;
			case SchemaPackage.TYPE_CHARGEMENT__QUANTITE_MATERIEL_DEBARQUE:
				unsetQuantiteMaterielDebarque();
				return;
			case SchemaPackage.TYPE_CHARGEMENT__APOUR_RESSOURCE_DECHARGEE_DOTATION_EFFECTIVE_CONSOMMABLE:
				getAPourRessourceDechargeeDotationEffectiveConsommable().clear();
				return;
			case SchemaPackage.TYPE_CHARGEMENT__APOUR_RESSOURCE_CHARGEE_DOTATION_EFFECTIVE_CONSOMMABLE:
				getAPourRessourceChargeeDotationEffectiveConsommable().clear();
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
			case SchemaPackage.TYPE_CHARGEMENT__NOMBRE_PERSONNES_EMBARQUEES:
				return isSetNombrePersonnesEmbarquees();
			case SchemaPackage.TYPE_CHARGEMENT__QUANTITE_CARBURANT_PREVUE:
				return quantiteCarburantPrevue != null;
			case SchemaPackage.TYPE_CHARGEMENT__NOMBRE_PERSONNES_DEBARQUEES:
				return isSetNombrePersonnesDebarquees();
			case SchemaPackage.TYPE_CHARGEMENT__QUANTITE_MATERIEL_EMBARQUE:
				return isSetQuantiteMaterielEmbarque();
			case SchemaPackage.TYPE_CHARGEMENT__QUANTITE_MATERIEL_DEBARQUE:
				return isSetQuantiteMaterielDebarque();
			case SchemaPackage.TYPE_CHARGEMENT__APOUR_RESSOURCE_DECHARGEE_DOTATION_EFFECTIVE_CONSOMMABLE:
				return aPourRessourceDechargeeDotationEffectiveConsommable != null && !aPourRessourceDechargeeDotationEffectiveConsommable.isEmpty();
			case SchemaPackage.TYPE_CHARGEMENT__APOUR_RESSOURCE_CHARGEE_DOTATION_EFFECTIVE_CONSOMMABLE:
				return aPourRessourceChargeeDotationEffectiveConsommable != null && !aPourRessourceChargeeDotationEffectiveConsommable.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nombrePersonnesEmbarquees: ");
		if (nombrePersonnesEmbarqueesESet) result.append(nombrePersonnesEmbarquees); else result.append("<unset>");
		result.append(", nombrePersonnesDebarquees: ");
		if (nombrePersonnesDebarqueesESet) result.append(nombrePersonnesDebarquees); else result.append("<unset>");
		result.append(", quantiteMaterielEmbarque: ");
		if (quantiteMaterielEmbarqueESet) result.append(quantiteMaterielEmbarque); else result.append("<unset>");
		result.append(", quantiteMaterielDebarque: ");
		if (quantiteMaterielDebarqueESet) result.append(quantiteMaterielDebarque); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeChargementImpl
