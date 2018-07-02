/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoTypeMissionI3DTypeMissionI3D;
import mpia.schema.TypeTypeMissionI3D;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Type Mission I3D</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeTypeMissionI3DImpl#getTypeMissionI3DnonRepertorie <em>Type Mission I3 Dnon Repertorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeMissionI3DImpl#getTypeMissionI3D <em>Type Mission I3D</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeTypeMissionI3DImpl extends EObjectImpl implements TypeTypeMissionI3D {
	/**
	 * The default value of the '{@link #getTypeMissionI3DnonRepertorie() <em>Type Mission I3 Dnon Repertorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMissionI3DnonRepertorie()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_MISSION_I3_DNON_REPERTORIE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeMissionI3DnonRepertorie() <em>Type Mission I3 Dnon Repertorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMissionI3DnonRepertorie()
	 * @generated
	 * @ordered
	 */
	protected String typeMissionI3DnonRepertorie = TYPE_MISSION_I3_DNON_REPERTORIE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeMissionI3D() <em>Type Mission I3D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMissionI3D()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeMissionI3DTypeMissionI3D TYPE_MISSION_I3D_EDEFAULT = TypeDictionaryDicoTypeMissionI3DTypeMissionI3D.SUPPT;

	/**
	 * The cached value of the '{@link #getTypeMissionI3D() <em>Type Mission I3D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMissionI3D()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeMissionI3DTypeMissionI3D typeMissionI3D = TYPE_MISSION_I3D_EDEFAULT;

	/**
	 * This is true if the Type Mission I3D attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeMissionI3DESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeTypeMissionI3DImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeTypeMissionI3D();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeMissionI3DnonRepertorie() {
		return typeMissionI3DnonRepertorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeMissionI3DnonRepertorie(String newTypeMissionI3DnonRepertorie) {
		String oldTypeMissionI3DnonRepertorie = typeMissionI3DnonRepertorie;
		typeMissionI3DnonRepertorie = newTypeMissionI3DnonRepertorie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_MISSION_I3D__TYPE_MISSION_I3_DNON_REPERTORIE, oldTypeMissionI3DnonRepertorie, typeMissionI3DnonRepertorie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeMissionI3DTypeMissionI3D getTypeMissionI3D() {
		return typeMissionI3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeMissionI3D(TypeDictionaryDicoTypeMissionI3DTypeMissionI3D newTypeMissionI3D) {
		TypeDictionaryDicoTypeMissionI3DTypeMissionI3D oldTypeMissionI3D = typeMissionI3D;
		typeMissionI3D = newTypeMissionI3D == null ? TYPE_MISSION_I3D_EDEFAULT : newTypeMissionI3D;
		boolean oldTypeMissionI3DESet = typeMissionI3DESet;
		typeMissionI3DESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_MISSION_I3D__TYPE_MISSION_I3D, oldTypeMissionI3D, typeMissionI3D, !oldTypeMissionI3DESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeMissionI3D() {
		TypeDictionaryDicoTypeMissionI3DTypeMissionI3D oldTypeMissionI3D = typeMissionI3D;
		boolean oldTypeMissionI3DESet = typeMissionI3DESet;
		typeMissionI3D = TYPE_MISSION_I3D_EDEFAULT;
		typeMissionI3DESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_MISSION_I3D__TYPE_MISSION_I3D, oldTypeMissionI3D, TYPE_MISSION_I3D_EDEFAULT, oldTypeMissionI3DESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeMissionI3D() {
		return typeMissionI3DESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_TYPE_MISSION_I3D__TYPE_MISSION_I3_DNON_REPERTORIE:
				return getTypeMissionI3DnonRepertorie();
			case SchemaPackage.TYPE_TYPE_MISSION_I3D__TYPE_MISSION_I3D:
				return getTypeMissionI3D();
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
			case SchemaPackage.TYPE_TYPE_MISSION_I3D__TYPE_MISSION_I3_DNON_REPERTORIE:
				setTypeMissionI3DnonRepertorie((String)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_MISSION_I3D__TYPE_MISSION_I3D:
				setTypeMissionI3D((TypeDictionaryDicoTypeMissionI3DTypeMissionI3D)newValue);
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
			case SchemaPackage.TYPE_TYPE_MISSION_I3D__TYPE_MISSION_I3_DNON_REPERTORIE:
				setTypeMissionI3DnonRepertorie(TYPE_MISSION_I3_DNON_REPERTORIE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TYPE_MISSION_I3D__TYPE_MISSION_I3D:
				unsetTypeMissionI3D();
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
			case SchemaPackage.TYPE_TYPE_MISSION_I3D__TYPE_MISSION_I3_DNON_REPERTORIE:
				return TYPE_MISSION_I3_DNON_REPERTORIE_EDEFAULT == null ? typeMissionI3DnonRepertorie != null : !TYPE_MISSION_I3_DNON_REPERTORIE_EDEFAULT.equals(typeMissionI3DnonRepertorie);
			case SchemaPackage.TYPE_TYPE_MISSION_I3D__TYPE_MISSION_I3D:
				return isSetTypeMissionI3D();
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
		result.append(" (typeMissionI3DnonRepertorie: ");
		result.append(typeMissionI3DnonRepertorie);
		result.append(", typeMissionI3D: ");
		if (typeMissionI3DESet) result.append(typeMissionI3D); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeTypeMissionI3DImpl
