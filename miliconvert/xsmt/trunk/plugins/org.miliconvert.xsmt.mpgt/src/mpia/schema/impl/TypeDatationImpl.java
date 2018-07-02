/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeDataTypeDuree;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDatation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Datation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeDatationImpl#getGDH <em>GDH</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDatationImpl#getDecalage <em>Decalage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDatationImpl#getInstantReference <em>Instant Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeDatationImpl extends EObjectImpl implements TypeDatation {
	/**
	 * The default value of the '{@link #getGDH() <em>GDH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDH()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GDH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGDH() <em>GDH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDH()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gDH = GDH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDecalage() <em>Decalage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecalage()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree decalage;

	/**
	 * The default value of the '{@link #getInstantReference() <em>Instant Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantReference()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANT_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstantReference() <em>Instant Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantReference()
	 * @generated
	 * @ordered
	 */
	protected String instantReference = INSTANT_REFERENCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDatationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeDatation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGDH() {
		return gDH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGDH(XMLGregorianCalendar newGDH) {
		XMLGregorianCalendar oldGDH = gDH;
		gDH = newGDH;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DATATION__GDH, oldGDH, gDH));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getDecalage() {
		return decalage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDecalage(TypeDataTypeDuree newDecalage, NotificationChain msgs) {
		TypeDataTypeDuree oldDecalage = decalage;
		decalage = newDecalage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DATATION__DECALAGE, oldDecalage, newDecalage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecalage(TypeDataTypeDuree newDecalage) {
		if (newDecalage != decalage) {
			NotificationChain msgs = null;
			if (decalage != null)
				msgs = ((InternalEObject)decalage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DATATION__DECALAGE, null, msgs);
			if (newDecalage != null)
				msgs = ((InternalEObject)newDecalage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DATATION__DECALAGE, null, msgs);
			msgs = basicSetDecalage(newDecalage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DATATION__DECALAGE, newDecalage, newDecalage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstantReference() {
		return instantReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstantReference(String newInstantReference) {
		String oldInstantReference = instantReference;
		instantReference = newInstantReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DATATION__INSTANT_REFERENCE, oldInstantReference, instantReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_DATATION__DECALAGE:
				return basicSetDecalage(null, msgs);
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
			case SchemaPackage.TYPE_DATATION__GDH:
				return getGDH();
			case SchemaPackage.TYPE_DATATION__DECALAGE:
				return getDecalage();
			case SchemaPackage.TYPE_DATATION__INSTANT_REFERENCE:
				return getInstantReference();
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
			case SchemaPackage.TYPE_DATATION__GDH:
				setGDH((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_DATATION__DECALAGE:
				setDecalage((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_DATATION__INSTANT_REFERENCE:
				setInstantReference((String)newValue);
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
			case SchemaPackage.TYPE_DATATION__GDH:
				setGDH(GDH_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DATATION__DECALAGE:
				setDecalage((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_DATATION__INSTANT_REFERENCE:
				setInstantReference(INSTANT_REFERENCE_EDEFAULT);
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
			case SchemaPackage.TYPE_DATATION__GDH:
				return GDH_EDEFAULT == null ? gDH != null : !GDH_EDEFAULT.equals(gDH);
			case SchemaPackage.TYPE_DATATION__DECALAGE:
				return decalage != null;
			case SchemaPackage.TYPE_DATATION__INSTANT_REFERENCE:
				return INSTANT_REFERENCE_EDEFAULT == null ? instantReference != null : !INSTANT_REFERENCE_EDEFAULT.equals(instantReference);
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
		result.append(" (gDH: ");
		result.append(gDH);
		result.append(", instantReference: ");
		result.append(instantReference);
		result.append(')');
		return result.toString();
	}

} //TypeDatationImpl
