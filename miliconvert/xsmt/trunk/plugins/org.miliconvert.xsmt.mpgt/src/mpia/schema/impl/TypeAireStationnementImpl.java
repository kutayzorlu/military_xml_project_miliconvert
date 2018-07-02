/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAireStationnement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Aire Stationnement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAireStationnementImpl#getForceExercee <em>Force Exercee</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAireStationnementImpl extends TypeSiteImpl implements TypeAireStationnement {
	/**
	 * The default value of the '{@link #getForceExercee() <em>Force Exercee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForceExercee()
	 * @generated
	 * @ordered
	 */
	protected static final double FORCE_EXERCEE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getForceExercee() <em>Force Exercee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForceExercee()
	 * @generated
	 * @ordered
	 */
	protected double forceExercee = FORCE_EXERCEE_EDEFAULT;

	/**
	 * This is true if the Force Exercee attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean forceExerceeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAireStationnementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAireStationnement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getForceExercee() {
		return forceExercee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForceExercee(double newForceExercee) {
		double oldForceExercee = forceExercee;
		forceExercee = newForceExercee;
		boolean oldForceExerceeESet = forceExerceeESet;
		forceExerceeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AIRE_STATIONNEMENT__FORCE_EXERCEE, oldForceExercee, forceExercee, !oldForceExerceeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetForceExercee() {
		double oldForceExercee = forceExercee;
		boolean oldForceExerceeESet = forceExerceeESet;
		forceExercee = FORCE_EXERCEE_EDEFAULT;
		forceExerceeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_AIRE_STATIONNEMENT__FORCE_EXERCEE, oldForceExercee, FORCE_EXERCEE_EDEFAULT, oldForceExerceeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetForceExercee() {
		return forceExerceeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_AIRE_STATIONNEMENT__FORCE_EXERCEE:
				return new Double(getForceExercee());
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
			case SchemaPackage.TYPE_AIRE_STATIONNEMENT__FORCE_EXERCEE:
				setForceExercee(((Double)newValue).doubleValue());
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
			case SchemaPackage.TYPE_AIRE_STATIONNEMENT__FORCE_EXERCEE:
				unsetForceExercee();
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
			case SchemaPackage.TYPE_AIRE_STATIONNEMENT__FORCE_EXERCEE:
				return isSetForceExercee();
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
		result.append(" (forceExercee: ");
		if (forceExerceeESet) result.append(forceExercee); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeAireStationnementImpl
