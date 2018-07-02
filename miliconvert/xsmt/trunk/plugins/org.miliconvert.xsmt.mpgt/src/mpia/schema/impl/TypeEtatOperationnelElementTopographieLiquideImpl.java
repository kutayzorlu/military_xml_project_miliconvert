/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoDirection;
import mpia.schema.TypeDictionaryDicoEtatOperationnelElementTopographieLiquideEtatMer;
import mpia.schema.TypeDictionaryDicoEtatOperationnelElementTopographieLiquideEtatSurface;
import mpia.schema.TypeEtatOperationnelElementTopographieLiquide;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Etat Operationnel Element Topographie Liquide</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelElementTopographieLiquideImpl#getEtatMer <em>Etat Mer</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelElementTopographieLiquideImpl#getEtatSurface <em>Etat Surface</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelElementTopographieLiquideImpl#getDirectionOndes <em>Direction Ondes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEtatOperationnelElementTopographieLiquideImpl extends TypeEtatOperationnelElementTopographieImpl implements TypeEtatOperationnelElementTopographieLiquide {
	/**
	 * The default value of the '{@link #getEtatMer() <em>Etat Mer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatMer()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOperationnelElementTopographieLiquideEtatMer ETAT_MER_EDEFAULT = TypeDictionaryDicoEtatOperationnelElementTopographieLiquideEtatMer._0;

	/**
	 * The cached value of the '{@link #getEtatMer() <em>Etat Mer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatMer()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnelElementTopographieLiquideEtatMer etatMer = ETAT_MER_EDEFAULT;

	/**
	 * This is true if the Etat Mer attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean etatMerESet;

	/**
	 * The default value of the '{@link #getEtatSurface() <em>Etat Surface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatSurface()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOperationnelElementTopographieLiquideEtatSurface ETAT_SURFACE_EDEFAULT = TypeDictionaryDicoEtatOperationnelElementTopographieLiquideEtatSurface.DRAIND;

	/**
	 * The cached value of the '{@link #getEtatSurface() <em>Etat Surface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatSurface()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnelElementTopographieLiquideEtatSurface etatSurface = ETAT_SURFACE_EDEFAULT;

	/**
	 * This is true if the Etat Surface attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean etatSurfaceESet;

	/**
	 * The default value of the '{@link #getDirectionOndes() <em>Direction Ondes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectionOndes()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoDirection DIRECTION_ONDES_EDEFAULT = TypeDictionaryDicoDirection.N;

	/**
	 * The cached value of the '{@link #getDirectionOndes() <em>Direction Ondes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectionOndes()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoDirection directionOndes = DIRECTION_ONDES_EDEFAULT;

	/**
	 * This is true if the Direction Ondes attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean directionOndesESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEtatOperationnelElementTopographieLiquideImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEtatOperationnelElementTopographieLiquide();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatOperationnelElementTopographieLiquideEtatMer getEtatMer() {
		return etatMer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatMer(TypeDictionaryDicoEtatOperationnelElementTopographieLiquideEtatMer newEtatMer) {
		TypeDictionaryDicoEtatOperationnelElementTopographieLiquideEtatMer oldEtatMer = etatMer;
		etatMer = newEtatMer == null ? ETAT_MER_EDEFAULT : newEtatMer;
		boolean oldEtatMerESet = etatMerESet;
		etatMerESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_LIQUIDE__ETAT_MER, oldEtatMer, etatMer, !oldEtatMerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEtatMer() {
		TypeDictionaryDicoEtatOperationnelElementTopographieLiquideEtatMer oldEtatMer = etatMer;
		boolean oldEtatMerESet = etatMerESet;
		etatMer = ETAT_MER_EDEFAULT;
		etatMerESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_LIQUIDE__ETAT_MER, oldEtatMer, ETAT_MER_EDEFAULT, oldEtatMerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEtatMer() {
		return etatMerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatOperationnelElementTopographieLiquideEtatSurface getEtatSurface() {
		return etatSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatSurface(TypeDictionaryDicoEtatOperationnelElementTopographieLiquideEtatSurface newEtatSurface) {
		TypeDictionaryDicoEtatOperationnelElementTopographieLiquideEtatSurface oldEtatSurface = etatSurface;
		etatSurface = newEtatSurface == null ? ETAT_SURFACE_EDEFAULT : newEtatSurface;
		boolean oldEtatSurfaceESet = etatSurfaceESet;
		etatSurfaceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_LIQUIDE__ETAT_SURFACE, oldEtatSurface, etatSurface, !oldEtatSurfaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEtatSurface() {
		TypeDictionaryDicoEtatOperationnelElementTopographieLiquideEtatSurface oldEtatSurface = etatSurface;
		boolean oldEtatSurfaceESet = etatSurfaceESet;
		etatSurface = ETAT_SURFACE_EDEFAULT;
		etatSurfaceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_LIQUIDE__ETAT_SURFACE, oldEtatSurface, ETAT_SURFACE_EDEFAULT, oldEtatSurfaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEtatSurface() {
		return etatSurfaceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoDirection getDirectionOndes() {
		return directionOndes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectionOndes(TypeDictionaryDicoDirection newDirectionOndes) {
		TypeDictionaryDicoDirection oldDirectionOndes = directionOndes;
		directionOndes = newDirectionOndes == null ? DIRECTION_ONDES_EDEFAULT : newDirectionOndes;
		boolean oldDirectionOndesESet = directionOndesESet;
		directionOndesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_LIQUIDE__DIRECTION_ONDES, oldDirectionOndes, directionOndes, !oldDirectionOndesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDirectionOndes() {
		TypeDictionaryDicoDirection oldDirectionOndes = directionOndes;
		boolean oldDirectionOndesESet = directionOndesESet;
		directionOndes = DIRECTION_ONDES_EDEFAULT;
		directionOndesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_LIQUIDE__DIRECTION_ONDES, oldDirectionOndes, DIRECTION_ONDES_EDEFAULT, oldDirectionOndesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDirectionOndes() {
		return directionOndesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_LIQUIDE__ETAT_MER:
				return getEtatMer();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_LIQUIDE__ETAT_SURFACE:
				return getEtatSurface();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_LIQUIDE__DIRECTION_ONDES:
				return getDirectionOndes();
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
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_LIQUIDE__ETAT_MER:
				setEtatMer((TypeDictionaryDicoEtatOperationnelElementTopographieLiquideEtatMer)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_LIQUIDE__ETAT_SURFACE:
				setEtatSurface((TypeDictionaryDicoEtatOperationnelElementTopographieLiquideEtatSurface)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_LIQUIDE__DIRECTION_ONDES:
				setDirectionOndes((TypeDictionaryDicoDirection)newValue);
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
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_LIQUIDE__ETAT_MER:
				unsetEtatMer();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_LIQUIDE__ETAT_SURFACE:
				unsetEtatSurface();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_LIQUIDE__DIRECTION_ONDES:
				unsetDirectionOndes();
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
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_LIQUIDE__ETAT_MER:
				return isSetEtatMer();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_LIQUIDE__ETAT_SURFACE:
				return isSetEtatSurface();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_LIQUIDE__DIRECTION_ONDES:
				return isSetDirectionOndes();
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
		result.append(" (etatMer: ");
		if (etatMerESet) result.append(etatMer); else result.append("<unset>");
		result.append(", etatSurface: ");
		if (etatSurfaceESet) result.append(etatSurface); else result.append("<unset>");
		result.append(", directionOndes: ");
		if (directionOndesESet) result.append(directionOndes); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeEtatOperationnelElementTopographieLiquideImpl
