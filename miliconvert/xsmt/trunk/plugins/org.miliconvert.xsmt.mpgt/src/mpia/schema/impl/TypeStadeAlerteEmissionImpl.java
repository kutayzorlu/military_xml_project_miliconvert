/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoStadeAlerteEmissionStadeAlerte;
import mpia.schema.TypePeriode3D;
import mpia.schema.TypeStadeAlerteEmission;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Stade Alerte Emission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeStadeAlerteEmissionImpl#getStadeAlerte <em>Stade Alerte</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeStadeAlerteEmissionImpl#getStadeEmission <em>Stade Emission</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeStadeAlerteEmissionImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeStadeAlerteEmissionImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeStadeAlerteEmissionImpl#getAPourCreneauTempsPeriode3D <em>APour Creneau Temps Periode3 D</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeStadeAlerteEmissionImpl extends EObjectImpl implements TypeStadeAlerteEmission {
	/**
	 * The default value of the '{@link #getStadeAlerte() <em>Stade Alerte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStadeAlerte()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoStadeAlerteEmissionStadeAlerte STADE_ALERTE_EDEFAULT = TypeDictionaryDicoStadeAlerteEmissionStadeAlerte._1M;

	/**
	 * The cached value of the '{@link #getStadeAlerte() <em>Stade Alerte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStadeAlerte()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoStadeAlerteEmissionStadeAlerte stadeAlerte = STADE_ALERTE_EDEFAULT;

	/**
	 * This is true if the Stade Alerte attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stadeAlerteESet;

	/**
	 * The default value of the '{@link #getStadeEmission() <em>Stade Emission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStadeEmission()
	 * @generated
	 * @ordered
	 */
	protected static final String STADE_EMISSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStadeEmission() <em>Stade Emission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStadeEmission()
	 * @generated
	 * @ordered
	 */
	protected String stadeEmission = STADE_EMISSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCTE() <em>CTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCTE()
	 * @generated
	 * @ordered
	 */
	protected static final String CTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCTE() <em>CTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCTE()
	 * @generated
	 * @ordered
	 */
	protected String cTE = CTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCE() <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCE()
	 * @generated
	 * @ordered
	 */
	protected static final String CE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCE() <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCE()
	 * @generated
	 * @ordered
	 */
	protected String cE = CE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAPourCreneauTempsPeriode3D() <em>APour Creneau Temps Periode3 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCreneauTempsPeriode3D()
	 * @generated
	 * @ordered
	 */
	protected TypePeriode3D aPourCreneauTempsPeriode3D;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeStadeAlerteEmissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeStadeAlerteEmission();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoStadeAlerteEmissionStadeAlerte getStadeAlerte() {
		return stadeAlerte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStadeAlerte(TypeDictionaryDicoStadeAlerteEmissionStadeAlerte newStadeAlerte) {
		TypeDictionaryDicoStadeAlerteEmissionStadeAlerte oldStadeAlerte = stadeAlerte;
		stadeAlerte = newStadeAlerte == null ? STADE_ALERTE_EDEFAULT : newStadeAlerte;
		boolean oldStadeAlerteESet = stadeAlerteESet;
		stadeAlerteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_STADE_ALERTE_EMISSION__STADE_ALERTE, oldStadeAlerte, stadeAlerte, !oldStadeAlerteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStadeAlerte() {
		TypeDictionaryDicoStadeAlerteEmissionStadeAlerte oldStadeAlerte = stadeAlerte;
		boolean oldStadeAlerteESet = stadeAlerteESet;
		stadeAlerte = STADE_ALERTE_EDEFAULT;
		stadeAlerteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_STADE_ALERTE_EMISSION__STADE_ALERTE, oldStadeAlerte, STADE_ALERTE_EDEFAULT, oldStadeAlerteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStadeAlerte() {
		return stadeAlerteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStadeEmission() {
		return stadeEmission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStadeEmission(String newStadeEmission) {
		String oldStadeEmission = stadeEmission;
		stadeEmission = newStadeEmission;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_STADE_ALERTE_EMISSION__STADE_EMISSION, oldStadeEmission, stadeEmission));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCTE() {
		return cTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCTE(String newCTE) {
		String oldCTE = cTE;
		cTE = newCTE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_STADE_ALERTE_EMISSION__CTE, oldCTE, cTE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCE() {
		return cE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCE(String newCE) {
		String oldCE = cE;
		cE = newCE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_STADE_ALERTE_EMISSION__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypePeriode3D getAPourCreneauTempsPeriode3D() {
		return aPourCreneauTempsPeriode3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourCreneauTempsPeriode3D(TypePeriode3D newAPourCreneauTempsPeriode3D, NotificationChain msgs) {
		TypePeriode3D oldAPourCreneauTempsPeriode3D = aPourCreneauTempsPeriode3D;
		aPourCreneauTempsPeriode3D = newAPourCreneauTempsPeriode3D;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_STADE_ALERTE_EMISSION__APOUR_CRENEAU_TEMPS_PERIODE3_D, oldAPourCreneauTempsPeriode3D, newAPourCreneauTempsPeriode3D);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourCreneauTempsPeriode3D(TypePeriode3D newAPourCreneauTempsPeriode3D) {
		if (newAPourCreneauTempsPeriode3D != aPourCreneauTempsPeriode3D) {
			NotificationChain msgs = null;
			if (aPourCreneauTempsPeriode3D != null)
				msgs = ((InternalEObject)aPourCreneauTempsPeriode3D).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_STADE_ALERTE_EMISSION__APOUR_CRENEAU_TEMPS_PERIODE3_D, null, msgs);
			if (newAPourCreneauTempsPeriode3D != null)
				msgs = ((InternalEObject)newAPourCreneauTempsPeriode3D).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_STADE_ALERTE_EMISSION__APOUR_CRENEAU_TEMPS_PERIODE3_D, null, msgs);
			msgs = basicSetAPourCreneauTempsPeriode3D(newAPourCreneauTempsPeriode3D, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_STADE_ALERTE_EMISSION__APOUR_CRENEAU_TEMPS_PERIODE3_D, newAPourCreneauTempsPeriode3D, newAPourCreneauTempsPeriode3D));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_STADE_ALERTE_EMISSION__APOUR_CRENEAU_TEMPS_PERIODE3_D:
				return basicSetAPourCreneauTempsPeriode3D(null, msgs);
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
			case SchemaPackage.TYPE_STADE_ALERTE_EMISSION__STADE_ALERTE:
				return getStadeAlerte();
			case SchemaPackage.TYPE_STADE_ALERTE_EMISSION__STADE_EMISSION:
				return getStadeEmission();
			case SchemaPackage.TYPE_STADE_ALERTE_EMISSION__CTE:
				return getCTE();
			case SchemaPackage.TYPE_STADE_ALERTE_EMISSION__CE:
				return getCE();
			case SchemaPackage.TYPE_STADE_ALERTE_EMISSION__APOUR_CRENEAU_TEMPS_PERIODE3_D:
				return getAPourCreneauTempsPeriode3D();
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
			case SchemaPackage.TYPE_STADE_ALERTE_EMISSION__STADE_ALERTE:
				setStadeAlerte((TypeDictionaryDicoStadeAlerteEmissionStadeAlerte)newValue);
				return;
			case SchemaPackage.TYPE_STADE_ALERTE_EMISSION__STADE_EMISSION:
				setStadeEmission((String)newValue);
				return;
			case SchemaPackage.TYPE_STADE_ALERTE_EMISSION__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_STADE_ALERTE_EMISSION__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_STADE_ALERTE_EMISSION__APOUR_CRENEAU_TEMPS_PERIODE3_D:
				setAPourCreneauTempsPeriode3D((TypePeriode3D)newValue);
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
			case SchemaPackage.TYPE_STADE_ALERTE_EMISSION__STADE_ALERTE:
				unsetStadeAlerte();
				return;
			case SchemaPackage.TYPE_STADE_ALERTE_EMISSION__STADE_EMISSION:
				setStadeEmission(STADE_EMISSION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_STADE_ALERTE_EMISSION__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_STADE_ALERTE_EMISSION__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_STADE_ALERTE_EMISSION__APOUR_CRENEAU_TEMPS_PERIODE3_D:
				setAPourCreneauTempsPeriode3D((TypePeriode3D)null);
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
			case SchemaPackage.TYPE_STADE_ALERTE_EMISSION__STADE_ALERTE:
				return isSetStadeAlerte();
			case SchemaPackage.TYPE_STADE_ALERTE_EMISSION__STADE_EMISSION:
				return STADE_EMISSION_EDEFAULT == null ? stadeEmission != null : !STADE_EMISSION_EDEFAULT.equals(stadeEmission);
			case SchemaPackage.TYPE_STADE_ALERTE_EMISSION__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_STADE_ALERTE_EMISSION__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_STADE_ALERTE_EMISSION__APOUR_CRENEAU_TEMPS_PERIODE3_D:
				return aPourCreneauTempsPeriode3D != null;
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
		result.append(" (stadeAlerte: ");
		if (stadeAlerteESet) result.append(stadeAlerte); else result.append("<unset>");
		result.append(", stadeEmission: ");
		result.append(stadeEmission);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeStadeAlerteEmissionImpl
