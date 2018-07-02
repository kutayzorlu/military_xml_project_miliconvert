/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDefenseAuProfitUnite;
import mpia.schema.TypeDictionaryDicoPriorite;
import mpia.schema.TypeLocalisation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Defense Au Profit Unite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeDefenseAuProfitUniteImpl#getPrioriteDefense <em>Priorite Defense</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDefenseAuProfitUniteImpl#getAPourLocalisationPCLocalisation <em>APour Localisation PC Localisation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeDefenseAuProfitUniteImpl extends EObjectImpl implements TypeDefenseAuProfitUnite {
	/**
	 * The default value of the '{@link #getPrioriteDefense() <em>Priorite Defense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrioriteDefense()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPriorite PRIORITE_DEFENSE_EDEFAULT = TypeDictionaryDicoPriorite._1;

	/**
	 * The cached value of the '{@link #getPrioriteDefense() <em>Priorite Defense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrioriteDefense()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPriorite prioriteDefense = PRIORITE_DEFENSE_EDEFAULT;

	/**
	 * This is true if the Priorite Defense attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean prioriteDefenseESet;

	/**
	 * The cached value of the '{@link #getAPourLocalisationPCLocalisation() <em>APour Localisation PC Localisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourLocalisationPCLocalisation()
	 * @generated
	 * @ordered
	 */
	protected TypeLocalisation aPourLocalisationPCLocalisation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDefenseAuProfitUniteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeDefenseAuProfitUnite();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPriorite getPrioriteDefense() {
		return prioriteDefense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrioriteDefense(TypeDictionaryDicoPriorite newPrioriteDefense) {
		TypeDictionaryDicoPriorite oldPrioriteDefense = prioriteDefense;
		prioriteDefense = newPrioriteDefense == null ? PRIORITE_DEFENSE_EDEFAULT : newPrioriteDefense;
		boolean oldPrioriteDefenseESet = prioriteDefenseESet;
		prioriteDefenseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEFENSE_AU_PROFIT_UNITE__PRIORITE_DEFENSE, oldPrioriteDefense, prioriteDefense, !oldPrioriteDefenseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrioriteDefense() {
		TypeDictionaryDicoPriorite oldPrioriteDefense = prioriteDefense;
		boolean oldPrioriteDefenseESet = prioriteDefenseESet;
		prioriteDefense = PRIORITE_DEFENSE_EDEFAULT;
		prioriteDefenseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DEFENSE_AU_PROFIT_UNITE__PRIORITE_DEFENSE, oldPrioriteDefense, PRIORITE_DEFENSE_EDEFAULT, oldPrioriteDefenseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrioriteDefense() {
		return prioriteDefenseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeLocalisation getAPourLocalisationPCLocalisation() {
		return aPourLocalisationPCLocalisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourLocalisationPCLocalisation(TypeLocalisation newAPourLocalisationPCLocalisation, NotificationChain msgs) {
		TypeLocalisation oldAPourLocalisationPCLocalisation = aPourLocalisationPCLocalisation;
		aPourLocalisationPCLocalisation = newAPourLocalisationPCLocalisation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEFENSE_AU_PROFIT_UNITE__APOUR_LOCALISATION_PC_LOCALISATION, oldAPourLocalisationPCLocalisation, newAPourLocalisationPCLocalisation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourLocalisationPCLocalisation(TypeLocalisation newAPourLocalisationPCLocalisation) {
		if (newAPourLocalisationPCLocalisation != aPourLocalisationPCLocalisation) {
			NotificationChain msgs = null;
			if (aPourLocalisationPCLocalisation != null)
				msgs = ((InternalEObject)aPourLocalisationPCLocalisation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DEFENSE_AU_PROFIT_UNITE__APOUR_LOCALISATION_PC_LOCALISATION, null, msgs);
			if (newAPourLocalisationPCLocalisation != null)
				msgs = ((InternalEObject)newAPourLocalisationPCLocalisation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DEFENSE_AU_PROFIT_UNITE__APOUR_LOCALISATION_PC_LOCALISATION, null, msgs);
			msgs = basicSetAPourLocalisationPCLocalisation(newAPourLocalisationPCLocalisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEFENSE_AU_PROFIT_UNITE__APOUR_LOCALISATION_PC_LOCALISATION, newAPourLocalisationPCLocalisation, newAPourLocalisationPCLocalisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_DEFENSE_AU_PROFIT_UNITE__APOUR_LOCALISATION_PC_LOCALISATION:
				return basicSetAPourLocalisationPCLocalisation(null, msgs);
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
			case SchemaPackage.TYPE_DEFENSE_AU_PROFIT_UNITE__PRIORITE_DEFENSE:
				return getPrioriteDefense();
			case SchemaPackage.TYPE_DEFENSE_AU_PROFIT_UNITE__APOUR_LOCALISATION_PC_LOCALISATION:
				return getAPourLocalisationPCLocalisation();
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
			case SchemaPackage.TYPE_DEFENSE_AU_PROFIT_UNITE__PRIORITE_DEFENSE:
				setPrioriteDefense((TypeDictionaryDicoPriorite)newValue);
				return;
			case SchemaPackage.TYPE_DEFENSE_AU_PROFIT_UNITE__APOUR_LOCALISATION_PC_LOCALISATION:
				setAPourLocalisationPCLocalisation((TypeLocalisation)newValue);
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
			case SchemaPackage.TYPE_DEFENSE_AU_PROFIT_UNITE__PRIORITE_DEFENSE:
				unsetPrioriteDefense();
				return;
			case SchemaPackage.TYPE_DEFENSE_AU_PROFIT_UNITE__APOUR_LOCALISATION_PC_LOCALISATION:
				setAPourLocalisationPCLocalisation((TypeLocalisation)null);
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
			case SchemaPackage.TYPE_DEFENSE_AU_PROFIT_UNITE__PRIORITE_DEFENSE:
				return isSetPrioriteDefense();
			case SchemaPackage.TYPE_DEFENSE_AU_PROFIT_UNITE__APOUR_LOCALISATION_PC_LOCALISATION:
				return aPourLocalisationPCLocalisation != null;
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
		result.append(" (prioriteDefense: ");
		if (prioriteDefenseESet) result.append(prioriteDefense); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeDefenseAuProfitUniteImpl
