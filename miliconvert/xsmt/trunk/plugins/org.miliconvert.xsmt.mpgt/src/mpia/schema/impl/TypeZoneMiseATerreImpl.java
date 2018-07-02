/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeAngle;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoZoneMiseTerreHomologation;
import mpia.schema.TypeZoneMiseATerre;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Zone Mise ATerre</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeZoneMiseATerreImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZoneMiseATerreImpl#getAxeApproche <em>Axe Approche</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZoneMiseATerreImpl#getAxeLargage <em>Axe Largage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZoneMiseATerreImpl#getPenetrometrie <em>Penetrometrie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZoneMiseATerreImpl#getHomologation <em>Homologation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeZoneMiseATerreImpl extends TypeElementControleImpl implements TypeZoneMiseATerre {
	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAngle orientation;

	/**
	 * The cached value of the '{@link #getAxeApproche() <em>Axe Approche</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxeApproche()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAngle axeApproche;

	/**
	 * The cached value of the '{@link #getAxeLargage() <em>Axe Largage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxeLargage()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAngle axeLargage;

	/**
	 * The default value of the '{@link #getPenetrometrie() <em>Penetrometrie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPenetrometrie()
	 * @generated
	 * @ordered
	 */
	protected static final long PENETROMETRIE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getPenetrometrie() <em>Penetrometrie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPenetrometrie()
	 * @generated
	 * @ordered
	 */
	protected long penetrometrie = PENETROMETRIE_EDEFAULT;

	/**
	 * This is true if the Penetrometrie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean penetrometrieESet;

	/**
	 * The default value of the '{@link #getHomologation() <em>Homologation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomologation()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoZoneMiseTerreHomologation HOMOLOGATION_EDEFAULT = TypeDictionaryDicoZoneMiseTerreHomologation.EMG;

	/**
	 * The cached value of the '{@link #getHomologation() <em>Homologation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomologation()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoZoneMiseTerreHomologation homologation = HOMOLOGATION_EDEFAULT;

	/**
	 * This is true if the Homologation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean homologationESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeZoneMiseATerreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeZoneMiseATerre();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAngle getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrientation(TypeDataTypeAngle newOrientation, NotificationChain msgs) {
		TypeDataTypeAngle oldOrientation = orientation;
		orientation = newOrientation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_MISE_ATERRE__ORIENTATION, oldOrientation, newOrientation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientation(TypeDataTypeAngle newOrientation) {
		if (newOrientation != orientation) {
			NotificationChain msgs = null;
			if (orientation != null)
				msgs = ((InternalEObject)orientation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ZONE_MISE_ATERRE__ORIENTATION, null, msgs);
			if (newOrientation != null)
				msgs = ((InternalEObject)newOrientation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ZONE_MISE_ATERRE__ORIENTATION, null, msgs);
			msgs = basicSetOrientation(newOrientation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_MISE_ATERRE__ORIENTATION, newOrientation, newOrientation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAngle getAxeApproche() {
		return axeApproche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAxeApproche(TypeDataTypeAngle newAxeApproche, NotificationChain msgs) {
		TypeDataTypeAngle oldAxeApproche = axeApproche;
		axeApproche = newAxeApproche;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_MISE_ATERRE__AXE_APPROCHE, oldAxeApproche, newAxeApproche);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxeApproche(TypeDataTypeAngle newAxeApproche) {
		if (newAxeApproche != axeApproche) {
			NotificationChain msgs = null;
			if (axeApproche != null)
				msgs = ((InternalEObject)axeApproche).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ZONE_MISE_ATERRE__AXE_APPROCHE, null, msgs);
			if (newAxeApproche != null)
				msgs = ((InternalEObject)newAxeApproche).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ZONE_MISE_ATERRE__AXE_APPROCHE, null, msgs);
			msgs = basicSetAxeApproche(newAxeApproche, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_MISE_ATERRE__AXE_APPROCHE, newAxeApproche, newAxeApproche));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAngle getAxeLargage() {
		return axeLargage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAxeLargage(TypeDataTypeAngle newAxeLargage, NotificationChain msgs) {
		TypeDataTypeAngle oldAxeLargage = axeLargage;
		axeLargage = newAxeLargage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_MISE_ATERRE__AXE_LARGAGE, oldAxeLargage, newAxeLargage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxeLargage(TypeDataTypeAngle newAxeLargage) {
		if (newAxeLargage != axeLargage) {
			NotificationChain msgs = null;
			if (axeLargage != null)
				msgs = ((InternalEObject)axeLargage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ZONE_MISE_ATERRE__AXE_LARGAGE, null, msgs);
			if (newAxeLargage != null)
				msgs = ((InternalEObject)newAxeLargage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ZONE_MISE_ATERRE__AXE_LARGAGE, null, msgs);
			msgs = basicSetAxeLargage(newAxeLargage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_MISE_ATERRE__AXE_LARGAGE, newAxeLargage, newAxeLargage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getPenetrometrie() {
		return penetrometrie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPenetrometrie(long newPenetrometrie) {
		long oldPenetrometrie = penetrometrie;
		penetrometrie = newPenetrometrie;
		boolean oldPenetrometrieESet = penetrometrieESet;
		penetrometrieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_MISE_ATERRE__PENETROMETRIE, oldPenetrometrie, penetrometrie, !oldPenetrometrieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPenetrometrie() {
		long oldPenetrometrie = penetrometrie;
		boolean oldPenetrometrieESet = penetrometrieESet;
		penetrometrie = PENETROMETRIE_EDEFAULT;
		penetrometrieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ZONE_MISE_ATERRE__PENETROMETRIE, oldPenetrometrie, PENETROMETRIE_EDEFAULT, oldPenetrometrieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPenetrometrie() {
		return penetrometrieESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoZoneMiseTerreHomologation getHomologation() {
		return homologation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHomologation(TypeDictionaryDicoZoneMiseTerreHomologation newHomologation) {
		TypeDictionaryDicoZoneMiseTerreHomologation oldHomologation = homologation;
		homologation = newHomologation == null ? HOMOLOGATION_EDEFAULT : newHomologation;
		boolean oldHomologationESet = homologationESet;
		homologationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_MISE_ATERRE__HOMOLOGATION, oldHomologation, homologation, !oldHomologationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHomologation() {
		TypeDictionaryDicoZoneMiseTerreHomologation oldHomologation = homologation;
		boolean oldHomologationESet = homologationESet;
		homologation = HOMOLOGATION_EDEFAULT;
		homologationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ZONE_MISE_ATERRE__HOMOLOGATION, oldHomologation, HOMOLOGATION_EDEFAULT, oldHomologationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHomologation() {
		return homologationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ZONE_MISE_ATERRE__ORIENTATION:
				return basicSetOrientation(null, msgs);
			case SchemaPackage.TYPE_ZONE_MISE_ATERRE__AXE_APPROCHE:
				return basicSetAxeApproche(null, msgs);
			case SchemaPackage.TYPE_ZONE_MISE_ATERRE__AXE_LARGAGE:
				return basicSetAxeLargage(null, msgs);
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
			case SchemaPackage.TYPE_ZONE_MISE_ATERRE__ORIENTATION:
				return getOrientation();
			case SchemaPackage.TYPE_ZONE_MISE_ATERRE__AXE_APPROCHE:
				return getAxeApproche();
			case SchemaPackage.TYPE_ZONE_MISE_ATERRE__AXE_LARGAGE:
				return getAxeLargage();
			case SchemaPackage.TYPE_ZONE_MISE_ATERRE__PENETROMETRIE:
				return new Long(getPenetrometrie());
			case SchemaPackage.TYPE_ZONE_MISE_ATERRE__HOMOLOGATION:
				return getHomologation();
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
			case SchemaPackage.TYPE_ZONE_MISE_ATERRE__ORIENTATION:
				setOrientation((TypeDataTypeAngle)newValue);
				return;
			case SchemaPackage.TYPE_ZONE_MISE_ATERRE__AXE_APPROCHE:
				setAxeApproche((TypeDataTypeAngle)newValue);
				return;
			case SchemaPackage.TYPE_ZONE_MISE_ATERRE__AXE_LARGAGE:
				setAxeLargage((TypeDataTypeAngle)newValue);
				return;
			case SchemaPackage.TYPE_ZONE_MISE_ATERRE__PENETROMETRIE:
				setPenetrometrie(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_ZONE_MISE_ATERRE__HOMOLOGATION:
				setHomologation((TypeDictionaryDicoZoneMiseTerreHomologation)newValue);
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
			case SchemaPackage.TYPE_ZONE_MISE_ATERRE__ORIENTATION:
				setOrientation((TypeDataTypeAngle)null);
				return;
			case SchemaPackage.TYPE_ZONE_MISE_ATERRE__AXE_APPROCHE:
				setAxeApproche((TypeDataTypeAngle)null);
				return;
			case SchemaPackage.TYPE_ZONE_MISE_ATERRE__AXE_LARGAGE:
				setAxeLargage((TypeDataTypeAngle)null);
				return;
			case SchemaPackage.TYPE_ZONE_MISE_ATERRE__PENETROMETRIE:
				unsetPenetrometrie();
				return;
			case SchemaPackage.TYPE_ZONE_MISE_ATERRE__HOMOLOGATION:
				unsetHomologation();
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
			case SchemaPackage.TYPE_ZONE_MISE_ATERRE__ORIENTATION:
				return orientation != null;
			case SchemaPackage.TYPE_ZONE_MISE_ATERRE__AXE_APPROCHE:
				return axeApproche != null;
			case SchemaPackage.TYPE_ZONE_MISE_ATERRE__AXE_LARGAGE:
				return axeLargage != null;
			case SchemaPackage.TYPE_ZONE_MISE_ATERRE__PENETROMETRIE:
				return isSetPenetrometrie();
			case SchemaPackage.TYPE_ZONE_MISE_ATERRE__HOMOLOGATION:
				return isSetHomologation();
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
		result.append(" (penetrometrie: ");
		if (penetrometrieESet) result.append(penetrometrie); else result.append("<unset>");
		result.append(", homologation: ");
		if (homologationESet) result.append(homologation); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeZoneMiseATerreImpl
