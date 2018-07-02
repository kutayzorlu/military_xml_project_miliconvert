/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeLocalisationGeometrique2D;
import mpia.schema.TypeMunitionsConsommeesSurPoint;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Munitions Consommees Sur Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMunitionsConsommeesSurPointImpl#getNombreMunitionsTypeTirees <em>Nombre Munitions Type Tirees</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMunitionsConsommeesSurPointImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMunitionsConsommeesSurPointImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMunitionsConsommeesSurPointImpl#getEstTypeTypeMunition <em>Est Type Type Munition</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMunitionsConsommeesSurPointImpl#getEstLocaliseEnLocalisationGeometrique2D <em>Est Localise En Localisation Geometrique2 D</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMunitionsConsommeesSurPointImpl extends EObjectImpl implements TypeMunitionsConsommeesSurPoint {
	/**
	 * The default value of the '{@link #getNombreMunitionsTypeTirees() <em>Nombre Munitions Type Tirees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreMunitionsTypeTirees()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_MUNITIONS_TYPE_TIREES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreMunitionsTypeTirees() <em>Nombre Munitions Type Tirees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreMunitionsTypeTirees()
	 * @generated
	 * @ordered
	 */
	protected long nombreMunitionsTypeTirees = NOMBRE_MUNITIONS_TYPE_TIREES_EDEFAULT;

	/**
	 * This is true if the Nombre Munitions Type Tirees attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreMunitionsTypeTireesESet;

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
	 * The cached value of the '{@link #getEstTypeTypeMunition() <em>Est Type Type Munition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstTypeTypeMunition()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT estTypeTypeMunition;

	/**
	 * The cached value of the '{@link #getEstLocaliseEnLocalisationGeometrique2D() <em>Est Localise En Localisation Geometrique2 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstLocaliseEnLocalisationGeometrique2D()
	 * @generated
	 * @ordered
	 */
	protected TypeLocalisationGeometrique2D estLocaliseEnLocalisationGeometrique2D;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMunitionsConsommeesSurPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMunitionsConsommeesSurPoint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreMunitionsTypeTirees() {
		return nombreMunitionsTypeTirees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreMunitionsTypeTirees(long newNombreMunitionsTypeTirees) {
		long oldNombreMunitionsTypeTirees = nombreMunitionsTypeTirees;
		nombreMunitionsTypeTirees = newNombreMunitionsTypeTirees;
		boolean oldNombreMunitionsTypeTireesESet = nombreMunitionsTypeTireesESet;
		nombreMunitionsTypeTireesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MUNITIONS_CONSOMMEES_SUR_POINT__NOMBRE_MUNITIONS_TYPE_TIREES, oldNombreMunitionsTypeTirees, nombreMunitionsTypeTirees, !oldNombreMunitionsTypeTireesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreMunitionsTypeTirees() {
		long oldNombreMunitionsTypeTirees = nombreMunitionsTypeTirees;
		boolean oldNombreMunitionsTypeTireesESet = nombreMunitionsTypeTireesESet;
		nombreMunitionsTypeTirees = NOMBRE_MUNITIONS_TYPE_TIREES_EDEFAULT;
		nombreMunitionsTypeTireesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MUNITIONS_CONSOMMEES_SUR_POINT__NOMBRE_MUNITIONS_TYPE_TIREES, oldNombreMunitionsTypeTirees, NOMBRE_MUNITIONS_TYPE_TIREES_EDEFAULT, oldNombreMunitionsTypeTireesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreMunitionsTypeTirees() {
		return nombreMunitionsTypeTireesESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MUNITIONS_CONSOMMEES_SUR_POINT__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MUNITIONS_CONSOMMEES_SUR_POINT__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getEstTypeTypeMunition() {
		return estTypeTypeMunition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstTypeTypeMunition(TypeAssociationEXT newEstTypeTypeMunition, NotificationChain msgs) {
		TypeAssociationEXT oldEstTypeTypeMunition = estTypeTypeMunition;
		estTypeTypeMunition = newEstTypeTypeMunition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MUNITIONS_CONSOMMEES_SUR_POINT__EST_TYPE_TYPE_MUNITION, oldEstTypeTypeMunition, newEstTypeTypeMunition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstTypeTypeMunition(TypeAssociationEXT newEstTypeTypeMunition) {
		if (newEstTypeTypeMunition != estTypeTypeMunition) {
			NotificationChain msgs = null;
			if (estTypeTypeMunition != null)
				msgs = ((InternalEObject)estTypeTypeMunition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MUNITIONS_CONSOMMEES_SUR_POINT__EST_TYPE_TYPE_MUNITION, null, msgs);
			if (newEstTypeTypeMunition != null)
				msgs = ((InternalEObject)newEstTypeTypeMunition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MUNITIONS_CONSOMMEES_SUR_POINT__EST_TYPE_TYPE_MUNITION, null, msgs);
			msgs = basicSetEstTypeTypeMunition(newEstTypeTypeMunition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MUNITIONS_CONSOMMEES_SUR_POINT__EST_TYPE_TYPE_MUNITION, newEstTypeTypeMunition, newEstTypeTypeMunition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeLocalisationGeometrique2D getEstLocaliseEnLocalisationGeometrique2D() {
		return estLocaliseEnLocalisationGeometrique2D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstLocaliseEnLocalisationGeometrique2D(TypeLocalisationGeometrique2D newEstLocaliseEnLocalisationGeometrique2D, NotificationChain msgs) {
		TypeLocalisationGeometrique2D oldEstLocaliseEnLocalisationGeometrique2D = estLocaliseEnLocalisationGeometrique2D;
		estLocaliseEnLocalisationGeometrique2D = newEstLocaliseEnLocalisationGeometrique2D;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MUNITIONS_CONSOMMEES_SUR_POINT__EST_LOCALISE_EN_LOCALISATION_GEOMETRIQUE2_D, oldEstLocaliseEnLocalisationGeometrique2D, newEstLocaliseEnLocalisationGeometrique2D);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstLocaliseEnLocalisationGeometrique2D(TypeLocalisationGeometrique2D newEstLocaliseEnLocalisationGeometrique2D) {
		if (newEstLocaliseEnLocalisationGeometrique2D != estLocaliseEnLocalisationGeometrique2D) {
			NotificationChain msgs = null;
			if (estLocaliseEnLocalisationGeometrique2D != null)
				msgs = ((InternalEObject)estLocaliseEnLocalisationGeometrique2D).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MUNITIONS_CONSOMMEES_SUR_POINT__EST_LOCALISE_EN_LOCALISATION_GEOMETRIQUE2_D, null, msgs);
			if (newEstLocaliseEnLocalisationGeometrique2D != null)
				msgs = ((InternalEObject)newEstLocaliseEnLocalisationGeometrique2D).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MUNITIONS_CONSOMMEES_SUR_POINT__EST_LOCALISE_EN_LOCALISATION_GEOMETRIQUE2_D, null, msgs);
			msgs = basicSetEstLocaliseEnLocalisationGeometrique2D(newEstLocaliseEnLocalisationGeometrique2D, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MUNITIONS_CONSOMMEES_SUR_POINT__EST_LOCALISE_EN_LOCALISATION_GEOMETRIQUE2_D, newEstLocaliseEnLocalisationGeometrique2D, newEstLocaliseEnLocalisationGeometrique2D));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MUNITIONS_CONSOMMEES_SUR_POINT__EST_TYPE_TYPE_MUNITION:
				return basicSetEstTypeTypeMunition(null, msgs);
			case SchemaPackage.TYPE_MUNITIONS_CONSOMMEES_SUR_POINT__EST_LOCALISE_EN_LOCALISATION_GEOMETRIQUE2_D:
				return basicSetEstLocaliseEnLocalisationGeometrique2D(null, msgs);
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
			case SchemaPackage.TYPE_MUNITIONS_CONSOMMEES_SUR_POINT__NOMBRE_MUNITIONS_TYPE_TIREES:
				return new Long(getNombreMunitionsTypeTirees());
			case SchemaPackage.TYPE_MUNITIONS_CONSOMMEES_SUR_POINT__CTE:
				return getCTE();
			case SchemaPackage.TYPE_MUNITIONS_CONSOMMEES_SUR_POINT__CE:
				return getCE();
			case SchemaPackage.TYPE_MUNITIONS_CONSOMMEES_SUR_POINT__EST_TYPE_TYPE_MUNITION:
				return getEstTypeTypeMunition();
			case SchemaPackage.TYPE_MUNITIONS_CONSOMMEES_SUR_POINT__EST_LOCALISE_EN_LOCALISATION_GEOMETRIQUE2_D:
				return getEstLocaliseEnLocalisationGeometrique2D();
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
			case SchemaPackage.TYPE_MUNITIONS_CONSOMMEES_SUR_POINT__NOMBRE_MUNITIONS_TYPE_TIREES:
				setNombreMunitionsTypeTirees(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_MUNITIONS_CONSOMMEES_SUR_POINT__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_MUNITIONS_CONSOMMEES_SUR_POINT__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_MUNITIONS_CONSOMMEES_SUR_POINT__EST_TYPE_TYPE_MUNITION:
				setEstTypeTypeMunition((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_MUNITIONS_CONSOMMEES_SUR_POINT__EST_LOCALISE_EN_LOCALISATION_GEOMETRIQUE2_D:
				setEstLocaliseEnLocalisationGeometrique2D((TypeLocalisationGeometrique2D)newValue);
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
			case SchemaPackage.TYPE_MUNITIONS_CONSOMMEES_SUR_POINT__NOMBRE_MUNITIONS_TYPE_TIREES:
				unsetNombreMunitionsTypeTirees();
				return;
			case SchemaPackage.TYPE_MUNITIONS_CONSOMMEES_SUR_POINT__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MUNITIONS_CONSOMMEES_SUR_POINT__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MUNITIONS_CONSOMMEES_SUR_POINT__EST_TYPE_TYPE_MUNITION:
				setEstTypeTypeMunition((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_MUNITIONS_CONSOMMEES_SUR_POINT__EST_LOCALISE_EN_LOCALISATION_GEOMETRIQUE2_D:
				setEstLocaliseEnLocalisationGeometrique2D((TypeLocalisationGeometrique2D)null);
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
			case SchemaPackage.TYPE_MUNITIONS_CONSOMMEES_SUR_POINT__NOMBRE_MUNITIONS_TYPE_TIREES:
				return isSetNombreMunitionsTypeTirees();
			case SchemaPackage.TYPE_MUNITIONS_CONSOMMEES_SUR_POINT__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_MUNITIONS_CONSOMMEES_SUR_POINT__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_MUNITIONS_CONSOMMEES_SUR_POINT__EST_TYPE_TYPE_MUNITION:
				return estTypeTypeMunition != null;
			case SchemaPackage.TYPE_MUNITIONS_CONSOMMEES_SUR_POINT__EST_LOCALISE_EN_LOCALISATION_GEOMETRIQUE2_D:
				return estLocaliseEnLocalisationGeometrique2D != null;
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
		result.append(" (nombreMunitionsTypeTirees: ");
		if (nombreMunitionsTypeTireesESet) result.append(nombreMunitionsTypeTirees); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeMunitionsConsommeesSurPointImpl
