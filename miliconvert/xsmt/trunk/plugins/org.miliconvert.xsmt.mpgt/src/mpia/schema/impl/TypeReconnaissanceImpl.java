/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeReconnaissance;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Reconnaissance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeReconnaissanceImpl#getDateDepartEnReconnaissance <em>Date Depart En Reconnaissance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeReconnaissanceImpl extends EObjectImpl implements TypeReconnaissance {
	/**
	 * The default value of the '{@link #getDateDepartEnReconnaissance() <em>Date Depart En Reconnaissance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDepartEnReconnaissance()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_DEPART_EN_RECONNAISSANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateDepartEnReconnaissance() <em>Date Depart En Reconnaissance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDepartEnReconnaissance()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateDepartEnReconnaissance = DATE_DEPART_EN_RECONNAISSANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeReconnaissanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeReconnaissance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateDepartEnReconnaissance() {
		return dateDepartEnReconnaissance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDepartEnReconnaissance(XMLGregorianCalendar newDateDepartEnReconnaissance) {
		XMLGregorianCalendar oldDateDepartEnReconnaissance = dateDepartEnReconnaissance;
		dateDepartEnReconnaissance = newDateDepartEnReconnaissance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RECONNAISSANCE__DATE_DEPART_EN_RECONNAISSANCE, oldDateDepartEnReconnaissance, dateDepartEnReconnaissance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_RECONNAISSANCE__DATE_DEPART_EN_RECONNAISSANCE:
				return getDateDepartEnReconnaissance();
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
			case SchemaPackage.TYPE_RECONNAISSANCE__DATE_DEPART_EN_RECONNAISSANCE:
				setDateDepartEnReconnaissance((XMLGregorianCalendar)newValue);
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
			case SchemaPackage.TYPE_RECONNAISSANCE__DATE_DEPART_EN_RECONNAISSANCE:
				setDateDepartEnReconnaissance(DATE_DEPART_EN_RECONNAISSANCE_EDEFAULT);
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
			case SchemaPackage.TYPE_RECONNAISSANCE__DATE_DEPART_EN_RECONNAISSANCE:
				return DATE_DEPART_EN_RECONNAISSANCE_EDEFAULT == null ? dateDepartEnReconnaissance != null : !DATE_DEPART_EN_RECONNAISSANCE_EDEFAULT.equals(dateDepartEnReconnaissance);
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
		result.append(" (dateDepartEnReconnaissance: ");
		result.append(dateDepartEnReconnaissance);
		result.append(')');
		return result.toString();
	}

} //TypeReconnaissanceImpl
