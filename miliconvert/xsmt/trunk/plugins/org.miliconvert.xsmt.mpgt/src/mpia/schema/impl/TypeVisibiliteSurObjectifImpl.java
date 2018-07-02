/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeLongueur;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoVisibiliteSurObjectifTypeVisibilite;
import mpia.schema.TypeVisibiliteSurObjectif;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Visibilite Sur Objectif</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeVisibiliteSurObjectifImpl#getTypeVisibilite <em>Type Visibilite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeVisibiliteSurObjectifImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeVisibiliteSurObjectifImpl#isCamouflageIR <em>Camouflage IR</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeVisibiliteSurObjectifImpl extends EObjectImpl implements TypeVisibiliteSurObjectif {
	/**
	 * The default value of the '{@link #getTypeVisibilite() <em>Type Visibilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeVisibilite()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoVisibiliteSurObjectifTypeVisibilite TYPE_VISIBILITE_EDEFAULT = TypeDictionaryDicoVisibiliteSurObjectifTypeVisibilite.H;

	/**
	 * The cached value of the '{@link #getTypeVisibilite() <em>Type Visibilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeVisibilite()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoVisibiliteSurObjectifTypeVisibilite typeVisibilite = TYPE_VISIBILITE_EDEFAULT;

	/**
	 * This is true if the Type Visibilite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeVisibiliteESet;

	/**
	 * The cached value of the '{@link #getDistance() <em>Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur distance;

	/**
	 * The default value of the '{@link #isCamouflageIR() <em>Camouflage IR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCamouflageIR()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAMOUFLAGE_IR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCamouflageIR() <em>Camouflage IR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCamouflageIR()
	 * @generated
	 * @ordered
	 */
	protected boolean camouflageIR = CAMOUFLAGE_IR_EDEFAULT;

	/**
	 * This is true if the Camouflage IR attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean camouflageIRESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeVisibiliteSurObjectifImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeVisibiliteSurObjectif();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoVisibiliteSurObjectifTypeVisibilite getTypeVisibilite() {
		return typeVisibilite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeVisibilite(TypeDictionaryDicoVisibiliteSurObjectifTypeVisibilite newTypeVisibilite) {
		TypeDictionaryDicoVisibiliteSurObjectifTypeVisibilite oldTypeVisibilite = typeVisibilite;
		typeVisibilite = newTypeVisibilite == null ? TYPE_VISIBILITE_EDEFAULT : newTypeVisibilite;
		boolean oldTypeVisibiliteESet = typeVisibiliteESet;
		typeVisibiliteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VISIBILITE_SUR_OBJECTIF__TYPE_VISIBILITE, oldTypeVisibilite, typeVisibilite, !oldTypeVisibiliteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeVisibilite() {
		TypeDictionaryDicoVisibiliteSurObjectifTypeVisibilite oldTypeVisibilite = typeVisibilite;
		boolean oldTypeVisibiliteESet = typeVisibiliteESet;
		typeVisibilite = TYPE_VISIBILITE_EDEFAULT;
		typeVisibiliteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_VISIBILITE_SUR_OBJECTIF__TYPE_VISIBILITE, oldTypeVisibilite, TYPE_VISIBILITE_EDEFAULT, oldTypeVisibiliteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeVisibilite() {
		return typeVisibiliteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getDistance() {
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistance(TypeDataTypeLongueur newDistance, NotificationChain msgs) {
		TypeDataTypeLongueur oldDistance = distance;
		distance = newDistance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VISIBILITE_SUR_OBJECTIF__DISTANCE, oldDistance, newDistance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistance(TypeDataTypeLongueur newDistance) {
		if (newDistance != distance) {
			NotificationChain msgs = null;
			if (distance != null)
				msgs = ((InternalEObject)distance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_VISIBILITE_SUR_OBJECTIF__DISTANCE, null, msgs);
			if (newDistance != null)
				msgs = ((InternalEObject)newDistance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_VISIBILITE_SUR_OBJECTIF__DISTANCE, null, msgs);
			msgs = basicSetDistance(newDistance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VISIBILITE_SUR_OBJECTIF__DISTANCE, newDistance, newDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCamouflageIR() {
		return camouflageIR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCamouflageIR(boolean newCamouflageIR) {
		boolean oldCamouflageIR = camouflageIR;
		camouflageIR = newCamouflageIR;
		boolean oldCamouflageIRESet = camouflageIRESet;
		camouflageIRESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VISIBILITE_SUR_OBJECTIF__CAMOUFLAGE_IR, oldCamouflageIR, camouflageIR, !oldCamouflageIRESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCamouflageIR() {
		boolean oldCamouflageIR = camouflageIR;
		boolean oldCamouflageIRESet = camouflageIRESet;
		camouflageIR = CAMOUFLAGE_IR_EDEFAULT;
		camouflageIRESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_VISIBILITE_SUR_OBJECTIF__CAMOUFLAGE_IR, oldCamouflageIR, CAMOUFLAGE_IR_EDEFAULT, oldCamouflageIRESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCamouflageIR() {
		return camouflageIRESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_VISIBILITE_SUR_OBJECTIF__DISTANCE:
				return basicSetDistance(null, msgs);
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
			case SchemaPackage.TYPE_VISIBILITE_SUR_OBJECTIF__TYPE_VISIBILITE:
				return getTypeVisibilite();
			case SchemaPackage.TYPE_VISIBILITE_SUR_OBJECTIF__DISTANCE:
				return getDistance();
			case SchemaPackage.TYPE_VISIBILITE_SUR_OBJECTIF__CAMOUFLAGE_IR:
				return isCamouflageIR() ? Boolean.TRUE : Boolean.FALSE;
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
			case SchemaPackage.TYPE_VISIBILITE_SUR_OBJECTIF__TYPE_VISIBILITE:
				setTypeVisibilite((TypeDictionaryDicoVisibiliteSurObjectifTypeVisibilite)newValue);
				return;
			case SchemaPackage.TYPE_VISIBILITE_SUR_OBJECTIF__DISTANCE:
				setDistance((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_VISIBILITE_SUR_OBJECTIF__CAMOUFLAGE_IR:
				setCamouflageIR(((Boolean)newValue).booleanValue());
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
			case SchemaPackage.TYPE_VISIBILITE_SUR_OBJECTIF__TYPE_VISIBILITE:
				unsetTypeVisibilite();
				return;
			case SchemaPackage.TYPE_VISIBILITE_SUR_OBJECTIF__DISTANCE:
				setDistance((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_VISIBILITE_SUR_OBJECTIF__CAMOUFLAGE_IR:
				unsetCamouflageIR();
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
			case SchemaPackage.TYPE_VISIBILITE_SUR_OBJECTIF__TYPE_VISIBILITE:
				return isSetTypeVisibilite();
			case SchemaPackage.TYPE_VISIBILITE_SUR_OBJECTIF__DISTANCE:
				return distance != null;
			case SchemaPackage.TYPE_VISIBILITE_SUR_OBJECTIF__CAMOUFLAGE_IR:
				return isSetCamouflageIR();
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
		result.append(" (typeVisibilite: ");
		if (typeVisibiliteESet) result.append(typeVisibilite); else result.append("<unset>");
		result.append(", camouflageIR: ");
		if (camouflageIRESet) result.append(camouflageIR); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeVisibiliteSurObjectifImpl
