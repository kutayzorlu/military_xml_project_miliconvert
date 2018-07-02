/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeAngle;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCaleLancement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Cale Lancement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCaleLancementImpl#getAngle <em>Angle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCaleLancementImpl#getCaracteresSpecifiques <em>Caracteres Specifiques</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCaleLancementImpl extends TypeSiteImpl implements TypeCaleLancement {
	/**
	 * The cached value of the '{@link #getAngle() <em>Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngle()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAngle angle;

	/**
	 * The default value of the '{@link #getCaracteresSpecifiques() <em>Caracteres Specifiques</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaracteresSpecifiques()
	 * @generated
	 * @ordered
	 */
	protected static final String CARACTERES_SPECIFIQUES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaracteresSpecifiques() <em>Caracteres Specifiques</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaracteresSpecifiques()
	 * @generated
	 * @ordered
	 */
	protected String caracteresSpecifiques = CARACTERES_SPECIFIQUES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCaleLancementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCaleLancement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAngle getAngle() {
		return angle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngle(TypeDataTypeAngle newAngle, NotificationChain msgs) {
		TypeDataTypeAngle oldAngle = angle;
		angle = newAngle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CALE_LANCEMENT__ANGLE, oldAngle, newAngle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngle(TypeDataTypeAngle newAngle) {
		if (newAngle != angle) {
			NotificationChain msgs = null;
			if (angle != null)
				msgs = ((InternalEObject)angle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CALE_LANCEMENT__ANGLE, null, msgs);
			if (newAngle != null)
				msgs = ((InternalEObject)newAngle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CALE_LANCEMENT__ANGLE, null, msgs);
			msgs = basicSetAngle(newAngle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CALE_LANCEMENT__ANGLE, newAngle, newAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCaracteresSpecifiques() {
		return caracteresSpecifiques;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaracteresSpecifiques(String newCaracteresSpecifiques) {
		String oldCaracteresSpecifiques = caracteresSpecifiques;
		caracteresSpecifiques = newCaracteresSpecifiques;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CALE_LANCEMENT__CARACTERES_SPECIFIQUES, oldCaracteresSpecifiques, caracteresSpecifiques));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_CALE_LANCEMENT__ANGLE:
				return basicSetAngle(null, msgs);
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
			case SchemaPackage.TYPE_CALE_LANCEMENT__ANGLE:
				return getAngle();
			case SchemaPackage.TYPE_CALE_LANCEMENT__CARACTERES_SPECIFIQUES:
				return getCaracteresSpecifiques();
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
			case SchemaPackage.TYPE_CALE_LANCEMENT__ANGLE:
				setAngle((TypeDataTypeAngle)newValue);
				return;
			case SchemaPackage.TYPE_CALE_LANCEMENT__CARACTERES_SPECIFIQUES:
				setCaracteresSpecifiques((String)newValue);
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
			case SchemaPackage.TYPE_CALE_LANCEMENT__ANGLE:
				setAngle((TypeDataTypeAngle)null);
				return;
			case SchemaPackage.TYPE_CALE_LANCEMENT__CARACTERES_SPECIFIQUES:
				setCaracteresSpecifiques(CARACTERES_SPECIFIQUES_EDEFAULT);
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
			case SchemaPackage.TYPE_CALE_LANCEMENT__ANGLE:
				return angle != null;
			case SchemaPackage.TYPE_CALE_LANCEMENT__CARACTERES_SPECIFIQUES:
				return CARACTERES_SPECIFIQUES_EDEFAULT == null ? caracteresSpecifiques != null : !CARACTERES_SPECIFIQUES_EDEFAULT.equals(caracteresSpecifiques);
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
		result.append(" (caracteresSpecifiques: ");
		result.append(caracteresSpecifiques);
		result.append(')');
		return result.toString();
	}

} //TypeCaleLancementImpl
