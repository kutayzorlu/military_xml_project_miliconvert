/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeDuree;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeEfficaciteProbabiliste;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Efficacite Probabiliste</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEfficaciteProbabilisteImpl#getMenaceEstimeeOuPlanifiee <em>Menace Estimee Ou Planifiee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEfficaciteProbabilisteImpl#getDureeEstimeeOuPlanifiee <em>Duree Estimee Ou Planifiee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEfficaciteProbabilisteImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEfficaciteProbabilisteImpl#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEfficaciteProbabilisteImpl extends EObjectImpl implements TypeEfficaciteProbabiliste {
	/**
	 * The default value of the '{@link #getMenaceEstimeeOuPlanifiee() <em>Menace Estimee Ou Planifiee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenaceEstimeeOuPlanifiee()
	 * @generated
	 * @ordered
	 */
	protected static final double MENACE_ESTIMEE_OU_PLANIFIEE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMenaceEstimeeOuPlanifiee() <em>Menace Estimee Ou Planifiee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenaceEstimeeOuPlanifiee()
	 * @generated
	 * @ordered
	 */
	protected double menaceEstimeeOuPlanifiee = MENACE_ESTIMEE_OU_PLANIFIEE_EDEFAULT;

	/**
	 * This is true if the Menace Estimee Ou Planifiee attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean menaceEstimeeOuPlanifieeESet;

	/**
	 * The cached value of the '{@link #getDureeEstimeeOuPlanifiee() <em>Duree Estimee Ou Planifiee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDureeEstimeeOuPlanifiee()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree dureeEstimeeOuPlanifiee;

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
	protected TypeEfficaciteProbabilisteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEfficaciteProbabiliste();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMenaceEstimeeOuPlanifiee() {
		return menaceEstimeeOuPlanifiee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMenaceEstimeeOuPlanifiee(double newMenaceEstimeeOuPlanifiee) {
		double oldMenaceEstimeeOuPlanifiee = menaceEstimeeOuPlanifiee;
		menaceEstimeeOuPlanifiee = newMenaceEstimeeOuPlanifiee;
		boolean oldMenaceEstimeeOuPlanifieeESet = menaceEstimeeOuPlanifieeESet;
		menaceEstimeeOuPlanifieeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFICACITE_PROBABILISTE__MENACE_ESTIMEE_OU_PLANIFIEE, oldMenaceEstimeeOuPlanifiee, menaceEstimeeOuPlanifiee, !oldMenaceEstimeeOuPlanifieeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMenaceEstimeeOuPlanifiee() {
		double oldMenaceEstimeeOuPlanifiee = menaceEstimeeOuPlanifiee;
		boolean oldMenaceEstimeeOuPlanifieeESet = menaceEstimeeOuPlanifieeESet;
		menaceEstimeeOuPlanifiee = MENACE_ESTIMEE_OU_PLANIFIEE_EDEFAULT;
		menaceEstimeeOuPlanifieeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EFFICACITE_PROBABILISTE__MENACE_ESTIMEE_OU_PLANIFIEE, oldMenaceEstimeeOuPlanifiee, MENACE_ESTIMEE_OU_PLANIFIEE_EDEFAULT, oldMenaceEstimeeOuPlanifieeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMenaceEstimeeOuPlanifiee() {
		return menaceEstimeeOuPlanifieeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getDureeEstimeeOuPlanifiee() {
		return dureeEstimeeOuPlanifiee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDureeEstimeeOuPlanifiee(TypeDataTypeDuree newDureeEstimeeOuPlanifiee, NotificationChain msgs) {
		TypeDataTypeDuree oldDureeEstimeeOuPlanifiee = dureeEstimeeOuPlanifiee;
		dureeEstimeeOuPlanifiee = newDureeEstimeeOuPlanifiee;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFICACITE_PROBABILISTE__DUREE_ESTIMEE_OU_PLANIFIEE, oldDureeEstimeeOuPlanifiee, newDureeEstimeeOuPlanifiee);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDureeEstimeeOuPlanifiee(TypeDataTypeDuree newDureeEstimeeOuPlanifiee) {
		if (newDureeEstimeeOuPlanifiee != dureeEstimeeOuPlanifiee) {
			NotificationChain msgs = null;
			if (dureeEstimeeOuPlanifiee != null)
				msgs = ((InternalEObject)dureeEstimeeOuPlanifiee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EFFICACITE_PROBABILISTE__DUREE_ESTIMEE_OU_PLANIFIEE, null, msgs);
			if (newDureeEstimeeOuPlanifiee != null)
				msgs = ((InternalEObject)newDureeEstimeeOuPlanifiee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EFFICACITE_PROBABILISTE__DUREE_ESTIMEE_OU_PLANIFIEE, null, msgs);
			msgs = basicSetDureeEstimeeOuPlanifiee(newDureeEstimeeOuPlanifiee, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFICACITE_PROBABILISTE__DUREE_ESTIMEE_OU_PLANIFIEE, newDureeEstimeeOuPlanifiee, newDureeEstimeeOuPlanifiee));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFICACITE_PROBABILISTE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFICACITE_PROBABILISTE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_EFFICACITE_PROBABILISTE__DUREE_ESTIMEE_OU_PLANIFIEE:
				return basicSetDureeEstimeeOuPlanifiee(null, msgs);
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
			case SchemaPackage.TYPE_EFFICACITE_PROBABILISTE__MENACE_ESTIMEE_OU_PLANIFIEE:
				return new Double(getMenaceEstimeeOuPlanifiee());
			case SchemaPackage.TYPE_EFFICACITE_PROBABILISTE__DUREE_ESTIMEE_OU_PLANIFIEE:
				return getDureeEstimeeOuPlanifiee();
			case SchemaPackage.TYPE_EFFICACITE_PROBABILISTE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_EFFICACITE_PROBABILISTE__CE:
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
			case SchemaPackage.TYPE_EFFICACITE_PROBABILISTE__MENACE_ESTIMEE_OU_PLANIFIEE:
				setMenaceEstimeeOuPlanifiee(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_EFFICACITE_PROBABILISTE__DUREE_ESTIMEE_OU_PLANIFIEE:
				setDureeEstimeeOuPlanifiee((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_EFFICACITE_PROBABILISTE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_EFFICACITE_PROBABILISTE__CE:
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
			case SchemaPackage.TYPE_EFFICACITE_PROBABILISTE__MENACE_ESTIMEE_OU_PLANIFIEE:
				unsetMenaceEstimeeOuPlanifiee();
				return;
			case SchemaPackage.TYPE_EFFICACITE_PROBABILISTE__DUREE_ESTIMEE_OU_PLANIFIEE:
				setDureeEstimeeOuPlanifiee((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_EFFICACITE_PROBABILISTE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_EFFICACITE_PROBABILISTE__CE:
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
			case SchemaPackage.TYPE_EFFICACITE_PROBABILISTE__MENACE_ESTIMEE_OU_PLANIFIEE:
				return isSetMenaceEstimeeOuPlanifiee();
			case SchemaPackage.TYPE_EFFICACITE_PROBABILISTE__DUREE_ESTIMEE_OU_PLANIFIEE:
				return dureeEstimeeOuPlanifiee != null;
			case SchemaPackage.TYPE_EFFICACITE_PROBABILISTE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_EFFICACITE_PROBABILISTE__CE:
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
		result.append(" (menaceEstimeeOuPlanifiee: ");
		if (menaceEstimeeOuPlanifieeESet) result.append(menaceEstimeeOuPlanifiee); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeEfficaciteProbabilisteImpl
