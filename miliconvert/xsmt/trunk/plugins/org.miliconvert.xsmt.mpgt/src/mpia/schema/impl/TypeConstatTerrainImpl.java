/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeConstatTerrain;
import mpia.schema.TypeDictionaryDicoConstatTerrainAttitudeTenue;
import mpia.schema.TypeDictionaryDicoConstatTerrainTypeObstacle;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Constat Terrain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeConstatTerrainImpl#getNatureObstacle <em>Nature Obstacle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConstatTerrainImpl#getTypeObstacle <em>Type Obstacle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConstatTerrainImpl#getAttitudeTenue <em>Attitude Tenue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeConstatTerrainImpl extends EObjectImpl implements TypeConstatTerrain {
	/**
	 * The default value of the '{@link #getNatureObstacle() <em>Nature Obstacle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatureObstacle()
	 * @generated
	 * @ordered
	 */
	protected static final String NATURE_OBSTACLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNatureObstacle() <em>Nature Obstacle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatureObstacle()
	 * @generated
	 * @ordered
	 */
	protected String natureObstacle = NATURE_OBSTACLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeObstacle() <em>Type Obstacle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeObstacle()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoConstatTerrainTypeObstacle TYPE_OBSTACLE_EDEFAULT = TypeDictionaryDicoConstatTerrainTypeObstacle.FRIEND;

	/**
	 * The cached value of the '{@link #getTypeObstacle() <em>Type Obstacle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeObstacle()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoConstatTerrainTypeObstacle typeObstacle = TYPE_OBSTACLE_EDEFAULT;

	/**
	 * This is true if the Type Obstacle attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeObstacleESet;

	/**
	 * The default value of the '{@link #getAttitudeTenue() <em>Attitude Tenue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttitudeTenue()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoConstatTerrainAttitudeTenue ATTITUDE_TENUE_EDEFAULT = TypeDictionaryDicoConstatTerrainAttitudeTenue.BYPAS;

	/**
	 * The cached value of the '{@link #getAttitudeTenue() <em>Attitude Tenue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttitudeTenue()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoConstatTerrainAttitudeTenue attitudeTenue = ATTITUDE_TENUE_EDEFAULT;

	/**
	 * This is true if the Attitude Tenue attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean attitudeTenueESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeConstatTerrainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeConstatTerrain();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNatureObstacle() {
		return natureObstacle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNatureObstacle(String newNatureObstacle) {
		String oldNatureObstacle = natureObstacle;
		natureObstacle = newNatureObstacle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSTAT_TERRAIN__NATURE_OBSTACLE, oldNatureObstacle, natureObstacle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoConstatTerrainTypeObstacle getTypeObstacle() {
		return typeObstacle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeObstacle(TypeDictionaryDicoConstatTerrainTypeObstacle newTypeObstacle) {
		TypeDictionaryDicoConstatTerrainTypeObstacle oldTypeObstacle = typeObstacle;
		typeObstacle = newTypeObstacle == null ? TYPE_OBSTACLE_EDEFAULT : newTypeObstacle;
		boolean oldTypeObstacleESet = typeObstacleESet;
		typeObstacleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSTAT_TERRAIN__TYPE_OBSTACLE, oldTypeObstacle, typeObstacle, !oldTypeObstacleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeObstacle() {
		TypeDictionaryDicoConstatTerrainTypeObstacle oldTypeObstacle = typeObstacle;
		boolean oldTypeObstacleESet = typeObstacleESet;
		typeObstacle = TYPE_OBSTACLE_EDEFAULT;
		typeObstacleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CONSTAT_TERRAIN__TYPE_OBSTACLE, oldTypeObstacle, TYPE_OBSTACLE_EDEFAULT, oldTypeObstacleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeObstacle() {
		return typeObstacleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoConstatTerrainAttitudeTenue getAttitudeTenue() {
		return attitudeTenue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttitudeTenue(TypeDictionaryDicoConstatTerrainAttitudeTenue newAttitudeTenue) {
		TypeDictionaryDicoConstatTerrainAttitudeTenue oldAttitudeTenue = attitudeTenue;
		attitudeTenue = newAttitudeTenue == null ? ATTITUDE_TENUE_EDEFAULT : newAttitudeTenue;
		boolean oldAttitudeTenueESet = attitudeTenueESet;
		attitudeTenueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSTAT_TERRAIN__ATTITUDE_TENUE, oldAttitudeTenue, attitudeTenue, !oldAttitudeTenueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAttitudeTenue() {
		TypeDictionaryDicoConstatTerrainAttitudeTenue oldAttitudeTenue = attitudeTenue;
		boolean oldAttitudeTenueESet = attitudeTenueESet;
		attitudeTenue = ATTITUDE_TENUE_EDEFAULT;
		attitudeTenueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CONSTAT_TERRAIN__ATTITUDE_TENUE, oldAttitudeTenue, ATTITUDE_TENUE_EDEFAULT, oldAttitudeTenueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAttitudeTenue() {
		return attitudeTenueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_CONSTAT_TERRAIN__NATURE_OBSTACLE:
				return getNatureObstacle();
			case SchemaPackage.TYPE_CONSTAT_TERRAIN__TYPE_OBSTACLE:
				return getTypeObstacle();
			case SchemaPackage.TYPE_CONSTAT_TERRAIN__ATTITUDE_TENUE:
				return getAttitudeTenue();
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
			case SchemaPackage.TYPE_CONSTAT_TERRAIN__NATURE_OBSTACLE:
				setNatureObstacle((String)newValue);
				return;
			case SchemaPackage.TYPE_CONSTAT_TERRAIN__TYPE_OBSTACLE:
				setTypeObstacle((TypeDictionaryDicoConstatTerrainTypeObstacle)newValue);
				return;
			case SchemaPackage.TYPE_CONSTAT_TERRAIN__ATTITUDE_TENUE:
				setAttitudeTenue((TypeDictionaryDicoConstatTerrainAttitudeTenue)newValue);
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
			case SchemaPackage.TYPE_CONSTAT_TERRAIN__NATURE_OBSTACLE:
				setNatureObstacle(NATURE_OBSTACLE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CONSTAT_TERRAIN__TYPE_OBSTACLE:
				unsetTypeObstacle();
				return;
			case SchemaPackage.TYPE_CONSTAT_TERRAIN__ATTITUDE_TENUE:
				unsetAttitudeTenue();
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
			case SchemaPackage.TYPE_CONSTAT_TERRAIN__NATURE_OBSTACLE:
				return NATURE_OBSTACLE_EDEFAULT == null ? natureObstacle != null : !NATURE_OBSTACLE_EDEFAULT.equals(natureObstacle);
			case SchemaPackage.TYPE_CONSTAT_TERRAIN__TYPE_OBSTACLE:
				return isSetTypeObstacle();
			case SchemaPackage.TYPE_CONSTAT_TERRAIN__ATTITUDE_TENUE:
				return isSetAttitudeTenue();
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
		result.append(" (natureObstacle: ");
		result.append(natureObstacle);
		result.append(", typeObstacle: ");
		if (typeObstacleESet) result.append(typeObstacle); else result.append("<unset>");
		result.append(", attitudeTenue: ");
		if (attitudeTenueESet) result.append(attitudeTenue); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeConstatTerrainImpl
