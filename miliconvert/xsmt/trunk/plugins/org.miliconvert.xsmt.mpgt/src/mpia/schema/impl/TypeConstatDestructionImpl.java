/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeConstatDestruction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Constat Destruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeConstatDestructionImpl#isDestructionChar <em>Destruction Char</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConstatDestructionImpl#getNatureForce <em>Nature Force</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeConstatDestructionImpl extends EObjectImpl implements TypeConstatDestruction {
	/**
	 * The default value of the '{@link #isDestructionChar() <em>Destruction Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDestructionChar()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DESTRUCTION_CHAR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDestructionChar() <em>Destruction Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDestructionChar()
	 * @generated
	 * @ordered
	 */
	protected boolean destructionChar = DESTRUCTION_CHAR_EDEFAULT;

	/**
	 * This is true if the Destruction Char attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean destructionCharESet;

	/**
	 * The default value of the '{@link #getNatureForce() <em>Nature Force</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatureForce()
	 * @generated
	 * @ordered
	 */
	protected static final String NATURE_FORCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNatureForce() <em>Nature Force</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatureForce()
	 * @generated
	 * @ordered
	 */
	protected String natureForce = NATURE_FORCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeConstatDestructionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeConstatDestruction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDestructionChar() {
		return destructionChar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestructionChar(boolean newDestructionChar) {
		boolean oldDestructionChar = destructionChar;
		destructionChar = newDestructionChar;
		boolean oldDestructionCharESet = destructionCharESet;
		destructionCharESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSTAT_DESTRUCTION__DESTRUCTION_CHAR, oldDestructionChar, destructionChar, !oldDestructionCharESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDestructionChar() {
		boolean oldDestructionChar = destructionChar;
		boolean oldDestructionCharESet = destructionCharESet;
		destructionChar = DESTRUCTION_CHAR_EDEFAULT;
		destructionCharESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CONSTAT_DESTRUCTION__DESTRUCTION_CHAR, oldDestructionChar, DESTRUCTION_CHAR_EDEFAULT, oldDestructionCharESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDestructionChar() {
		return destructionCharESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNatureForce() {
		return natureForce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNatureForce(String newNatureForce) {
		String oldNatureForce = natureForce;
		natureForce = newNatureForce;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSTAT_DESTRUCTION__NATURE_FORCE, oldNatureForce, natureForce));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_CONSTAT_DESTRUCTION__DESTRUCTION_CHAR:
				return isDestructionChar() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_CONSTAT_DESTRUCTION__NATURE_FORCE:
				return getNatureForce();
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
			case SchemaPackage.TYPE_CONSTAT_DESTRUCTION__DESTRUCTION_CHAR:
				setDestructionChar(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_CONSTAT_DESTRUCTION__NATURE_FORCE:
				setNatureForce((String)newValue);
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
			case SchemaPackage.TYPE_CONSTAT_DESTRUCTION__DESTRUCTION_CHAR:
				unsetDestructionChar();
				return;
			case SchemaPackage.TYPE_CONSTAT_DESTRUCTION__NATURE_FORCE:
				setNatureForce(NATURE_FORCE_EDEFAULT);
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
			case SchemaPackage.TYPE_CONSTAT_DESTRUCTION__DESTRUCTION_CHAR:
				return isSetDestructionChar();
			case SchemaPackage.TYPE_CONSTAT_DESTRUCTION__NATURE_FORCE:
				return NATURE_FORCE_EDEFAULT == null ? natureForce != null : !NATURE_FORCE_EDEFAULT.equals(natureForce);
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
		result.append(" (destructionChar: ");
		if (destructionCharESet) result.append(destructionChar); else result.append("<unset>");
		result.append(", natureForce: ");
		result.append(natureForce);
		result.append(')');
		return result.toString();
	}

} //TypeConstatDestructionImpl
