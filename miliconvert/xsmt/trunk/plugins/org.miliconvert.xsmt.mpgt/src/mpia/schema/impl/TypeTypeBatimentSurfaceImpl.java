/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeMasse;
import mpia.meta.TypeDataTypeVolume;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoTypeBatimentSurfaceCategorie;
import mpia.schema.TypeTypeBatimentSurface;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Type Batiment Surface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeTypeBatimentSurfaceImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeBatimentSurfaceImpl#getDeplacement <em>Deplacement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeBatimentSurfaceImpl#getChargeMaximalePont <em>Charge Maximale Pont</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeTypeBatimentSurfaceImpl extends TypeTypeBatimentImpl implements TypeTypeBatimentSurface {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeBatimentSurfaceCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoTypeBatimentSurfaceCategorie.CVS;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeBatimentSurfaceCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The cached value of the '{@link #getDeplacement() <em>Deplacement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeplacement()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeVolume deplacement;

	/**
	 * The cached value of the '{@link #getChargeMaximalePont() <em>Charge Maximale Pont</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargeMaximalePont()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeMasse chargeMaximalePont;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeTypeBatimentSurfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeTypeBatimentSurface();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeBatimentSurfaceCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoTypeBatimentSurfaceCategorie newCategorie) {
		TypeDictionaryDicoTypeBatimentSurfaceCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_BATIMENT_SURFACE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoTypeBatimentSurfaceCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_BATIMENT_SURFACE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCategorie() {
		return categorieESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeVolume getDeplacement() {
		return deplacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeplacement(TypeDataTypeVolume newDeplacement, NotificationChain msgs) {
		TypeDataTypeVolume oldDeplacement = deplacement;
		deplacement = newDeplacement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_BATIMENT_SURFACE__DEPLACEMENT, oldDeplacement, newDeplacement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeplacement(TypeDataTypeVolume newDeplacement) {
		if (newDeplacement != deplacement) {
			NotificationChain msgs = null;
			if (deplacement != null)
				msgs = ((InternalEObject)deplacement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_BATIMENT_SURFACE__DEPLACEMENT, null, msgs);
			if (newDeplacement != null)
				msgs = ((InternalEObject)newDeplacement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_BATIMENT_SURFACE__DEPLACEMENT, null, msgs);
			msgs = basicSetDeplacement(newDeplacement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_BATIMENT_SURFACE__DEPLACEMENT, newDeplacement, newDeplacement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeMasse getChargeMaximalePont() {
		return chargeMaximalePont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChargeMaximalePont(TypeDataTypeMasse newChargeMaximalePont, NotificationChain msgs) {
		TypeDataTypeMasse oldChargeMaximalePont = chargeMaximalePont;
		chargeMaximalePont = newChargeMaximalePont;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_BATIMENT_SURFACE__CHARGE_MAXIMALE_PONT, oldChargeMaximalePont, newChargeMaximalePont);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChargeMaximalePont(TypeDataTypeMasse newChargeMaximalePont) {
		if (newChargeMaximalePont != chargeMaximalePont) {
			NotificationChain msgs = null;
			if (chargeMaximalePont != null)
				msgs = ((InternalEObject)chargeMaximalePont).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_BATIMENT_SURFACE__CHARGE_MAXIMALE_PONT, null, msgs);
			if (newChargeMaximalePont != null)
				msgs = ((InternalEObject)newChargeMaximalePont).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_BATIMENT_SURFACE__CHARGE_MAXIMALE_PONT, null, msgs);
			msgs = basicSetChargeMaximalePont(newChargeMaximalePont, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_BATIMENT_SURFACE__CHARGE_MAXIMALE_PONT, newChargeMaximalePont, newChargeMaximalePont));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_TYPE_BATIMENT_SURFACE__DEPLACEMENT:
				return basicSetDeplacement(null, msgs);
			case SchemaPackage.TYPE_TYPE_BATIMENT_SURFACE__CHARGE_MAXIMALE_PONT:
				return basicSetChargeMaximalePont(null, msgs);
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
			case SchemaPackage.TYPE_TYPE_BATIMENT_SURFACE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_TYPE_BATIMENT_SURFACE__DEPLACEMENT:
				return getDeplacement();
			case SchemaPackage.TYPE_TYPE_BATIMENT_SURFACE__CHARGE_MAXIMALE_PONT:
				return getChargeMaximalePont();
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
			case SchemaPackage.TYPE_TYPE_BATIMENT_SURFACE__CATEGORIE:
				setCategorie((TypeDictionaryDicoTypeBatimentSurfaceCategorie)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_BATIMENT_SURFACE__DEPLACEMENT:
				setDeplacement((TypeDataTypeVolume)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_BATIMENT_SURFACE__CHARGE_MAXIMALE_PONT:
				setChargeMaximalePont((TypeDataTypeMasse)newValue);
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
			case SchemaPackage.TYPE_TYPE_BATIMENT_SURFACE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_TYPE_BATIMENT_SURFACE__DEPLACEMENT:
				setDeplacement((TypeDataTypeVolume)null);
				return;
			case SchemaPackage.TYPE_TYPE_BATIMENT_SURFACE__CHARGE_MAXIMALE_PONT:
				setChargeMaximalePont((TypeDataTypeMasse)null);
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
			case SchemaPackage.TYPE_TYPE_BATIMENT_SURFACE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_TYPE_BATIMENT_SURFACE__DEPLACEMENT:
				return deplacement != null;
			case SchemaPackage.TYPE_TYPE_BATIMENT_SURFACE__CHARGE_MAXIMALE_PONT:
				return chargeMaximalePont != null;
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
		result.append(" (categorie: ");
		if (categorieESet) result.append(categorie); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeTypeBatimentSurfaceImpl
