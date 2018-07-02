/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoInfrastructureEtatInfrastructure;
import mpia.schema.TypeInfrastructure;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Infrastructure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeInfrastructureImpl#getNatureInfrastructure <em>Nature Infrastructure</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeInfrastructureImpl#getEtatInfrastructure <em>Etat Infrastructure</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeInfrastructureImpl#isInfrastructureReparable <em>Infrastructure Reparable</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeInfrastructureImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeInfrastructureImpl#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeInfrastructureImpl extends EObjectImpl implements TypeInfrastructure {
	/**
	 * The default value of the '{@link #getNatureInfrastructure() <em>Nature Infrastructure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatureInfrastructure()
	 * @generated
	 * @ordered
	 */
	protected static final String NATURE_INFRASTRUCTURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNatureInfrastructure() <em>Nature Infrastructure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatureInfrastructure()
	 * @generated
	 * @ordered
	 */
	protected String natureInfrastructure = NATURE_INFRASTRUCTURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEtatInfrastructure() <em>Etat Infrastructure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatInfrastructure()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoInfrastructureEtatInfrastructure ETAT_INFRASTRUCTURE_EDEFAULT = TypeDictionaryDicoInfrastructureEtatInfrastructure.GOOD;

	/**
	 * The cached value of the '{@link #getEtatInfrastructure() <em>Etat Infrastructure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatInfrastructure()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoInfrastructureEtatInfrastructure etatInfrastructure = ETAT_INFRASTRUCTURE_EDEFAULT;

	/**
	 * This is true if the Etat Infrastructure attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean etatInfrastructureESet;

	/**
	 * The default value of the '{@link #isInfrastructureReparable() <em>Infrastructure Reparable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInfrastructureReparable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INFRASTRUCTURE_REPARABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInfrastructureReparable() <em>Infrastructure Reparable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInfrastructureReparable()
	 * @generated
	 * @ordered
	 */
	protected boolean infrastructureReparable = INFRASTRUCTURE_REPARABLE_EDEFAULT;

	/**
	 * This is true if the Infrastructure Reparable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean infrastructureReparableESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeInfrastructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeInfrastructure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNatureInfrastructure() {
		return natureInfrastructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNatureInfrastructure(String newNatureInfrastructure) {
		String oldNatureInfrastructure = natureInfrastructure;
		natureInfrastructure = newNatureInfrastructure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INFRASTRUCTURE__NATURE_INFRASTRUCTURE, oldNatureInfrastructure, natureInfrastructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoInfrastructureEtatInfrastructure getEtatInfrastructure() {
		return etatInfrastructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatInfrastructure(TypeDictionaryDicoInfrastructureEtatInfrastructure newEtatInfrastructure) {
		TypeDictionaryDicoInfrastructureEtatInfrastructure oldEtatInfrastructure = etatInfrastructure;
		etatInfrastructure = newEtatInfrastructure == null ? ETAT_INFRASTRUCTURE_EDEFAULT : newEtatInfrastructure;
		boolean oldEtatInfrastructureESet = etatInfrastructureESet;
		etatInfrastructureESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INFRASTRUCTURE__ETAT_INFRASTRUCTURE, oldEtatInfrastructure, etatInfrastructure, !oldEtatInfrastructureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEtatInfrastructure() {
		TypeDictionaryDicoInfrastructureEtatInfrastructure oldEtatInfrastructure = etatInfrastructure;
		boolean oldEtatInfrastructureESet = etatInfrastructureESet;
		etatInfrastructure = ETAT_INFRASTRUCTURE_EDEFAULT;
		etatInfrastructureESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_INFRASTRUCTURE__ETAT_INFRASTRUCTURE, oldEtatInfrastructure, ETAT_INFRASTRUCTURE_EDEFAULT, oldEtatInfrastructureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEtatInfrastructure() {
		return etatInfrastructureESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInfrastructureReparable() {
		return infrastructureReparable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfrastructureReparable(boolean newInfrastructureReparable) {
		boolean oldInfrastructureReparable = infrastructureReparable;
		infrastructureReparable = newInfrastructureReparable;
		boolean oldInfrastructureReparableESet = infrastructureReparableESet;
		infrastructureReparableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INFRASTRUCTURE__INFRASTRUCTURE_REPARABLE, oldInfrastructureReparable, infrastructureReparable, !oldInfrastructureReparableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInfrastructureReparable() {
		boolean oldInfrastructureReparable = infrastructureReparable;
		boolean oldInfrastructureReparableESet = infrastructureReparableESet;
		infrastructureReparable = INFRASTRUCTURE_REPARABLE_EDEFAULT;
		infrastructureReparableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_INFRASTRUCTURE__INFRASTRUCTURE_REPARABLE, oldInfrastructureReparable, INFRASTRUCTURE_REPARABLE_EDEFAULT, oldInfrastructureReparableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInfrastructureReparable() {
		return infrastructureReparableESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INFRASTRUCTURE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INFRASTRUCTURE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_INFRASTRUCTURE__NATURE_INFRASTRUCTURE:
				return getNatureInfrastructure();
			case SchemaPackage.TYPE_INFRASTRUCTURE__ETAT_INFRASTRUCTURE:
				return getEtatInfrastructure();
			case SchemaPackage.TYPE_INFRASTRUCTURE__INFRASTRUCTURE_REPARABLE:
				return isInfrastructureReparable() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_INFRASTRUCTURE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_INFRASTRUCTURE__CE:
				return getCE();
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
			case SchemaPackage.TYPE_INFRASTRUCTURE__NATURE_INFRASTRUCTURE:
				setNatureInfrastructure((String)newValue);
				return;
			case SchemaPackage.TYPE_INFRASTRUCTURE__ETAT_INFRASTRUCTURE:
				setEtatInfrastructure((TypeDictionaryDicoInfrastructureEtatInfrastructure)newValue);
				return;
			case SchemaPackage.TYPE_INFRASTRUCTURE__INFRASTRUCTURE_REPARABLE:
				setInfrastructureReparable(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_INFRASTRUCTURE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_INFRASTRUCTURE__CE:
				setCE((String)newValue);
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
			case SchemaPackage.TYPE_INFRASTRUCTURE__NATURE_INFRASTRUCTURE:
				setNatureInfrastructure(NATURE_INFRASTRUCTURE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_INFRASTRUCTURE__ETAT_INFRASTRUCTURE:
				unsetEtatInfrastructure();
				return;
			case SchemaPackage.TYPE_INFRASTRUCTURE__INFRASTRUCTURE_REPARABLE:
				unsetInfrastructureReparable();
				return;
			case SchemaPackage.TYPE_INFRASTRUCTURE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_INFRASTRUCTURE__CE:
				setCE(CE_EDEFAULT);
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
			case SchemaPackage.TYPE_INFRASTRUCTURE__NATURE_INFRASTRUCTURE:
				return NATURE_INFRASTRUCTURE_EDEFAULT == null ? natureInfrastructure != null : !NATURE_INFRASTRUCTURE_EDEFAULT.equals(natureInfrastructure);
			case SchemaPackage.TYPE_INFRASTRUCTURE__ETAT_INFRASTRUCTURE:
				return isSetEtatInfrastructure();
			case SchemaPackage.TYPE_INFRASTRUCTURE__INFRASTRUCTURE_REPARABLE:
				return isSetInfrastructureReparable();
			case SchemaPackage.TYPE_INFRASTRUCTURE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_INFRASTRUCTURE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
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
		result.append(" (natureInfrastructure: ");
		result.append(natureInfrastructure);
		result.append(", etatInfrastructure: ");
		if (etatInfrastructureESet) result.append(etatInfrastructure); else result.append("<unset>");
		result.append(", infrastructureReparable: ");
		if (infrastructureReparableESet) result.append(infrastructureReparable); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeInfrastructureImpl
