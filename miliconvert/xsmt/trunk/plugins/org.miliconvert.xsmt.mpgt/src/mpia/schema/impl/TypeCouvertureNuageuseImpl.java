/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeLongueur;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCouvertureNuageuse;
import mpia.schema.TypeDictionaryDicoCouvertureNuageuseCategorie;
import mpia.schema.TypeDictionaryDicoCouvertureNuageuseDensiteMoyenne;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Couverture Nuageuse</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCouvertureNuageuseImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCouvertureNuageuseImpl#getDensiteMoyenne <em>Densite Moyenne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCouvertureNuageuseImpl#getDistanceMinimaleBase <em>Distance Minimale Base</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCouvertureNuageuseImpl#getDistanceMaximale <em>Distance Maximale</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCouvertureNuageuseImpl#getTauxRefraction <em>Taux Refraction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCouvertureNuageuseImpl extends EObjectImpl implements TypeCouvertureNuageuse {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCouvertureNuageuseCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoCouvertureNuageuseCategorie.C;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCouvertureNuageuseCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getDensiteMoyenne() <em>Densite Moyenne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDensiteMoyenne()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCouvertureNuageuseDensiteMoyenne DENSITE_MOYENNE_EDEFAULT = TypeDictionaryDicoCouvertureNuageuseDensiteMoyenne._0;

	/**
	 * The cached value of the '{@link #getDensiteMoyenne() <em>Densite Moyenne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDensiteMoyenne()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCouvertureNuageuseDensiteMoyenne densiteMoyenne = DENSITE_MOYENNE_EDEFAULT;

	/**
	 * This is true if the Densite Moyenne attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean densiteMoyenneESet;

	/**
	 * The cached value of the '{@link #getDistanceMinimaleBase() <em>Distance Minimale Base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceMinimaleBase()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur distanceMinimaleBase;

	/**
	 * The cached value of the '{@link #getDistanceMaximale() <em>Distance Maximale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceMaximale()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur distanceMaximale;

	/**
	 * The default value of the '{@link #getTauxRefraction() <em>Taux Refraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTauxRefraction()
	 * @generated
	 * @ordered
	 */
	protected static final double TAUX_REFRACTION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTauxRefraction() <em>Taux Refraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTauxRefraction()
	 * @generated
	 * @ordered
	 */
	protected double tauxRefraction = TAUX_REFRACTION_EDEFAULT;

	/**
	 * This is true if the Taux Refraction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tauxRefractionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCouvertureNuageuseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCouvertureNuageuse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCouvertureNuageuseCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoCouvertureNuageuseCategorie newCategorie) {
		TypeDictionaryDicoCouvertureNuageuseCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COUVERTURE_NUAGEUSE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoCouvertureNuageuseCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_COUVERTURE_NUAGEUSE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeDictionaryDicoCouvertureNuageuseDensiteMoyenne getDensiteMoyenne() {
		return densiteMoyenne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDensiteMoyenne(TypeDictionaryDicoCouvertureNuageuseDensiteMoyenne newDensiteMoyenne) {
		TypeDictionaryDicoCouvertureNuageuseDensiteMoyenne oldDensiteMoyenne = densiteMoyenne;
		densiteMoyenne = newDensiteMoyenne == null ? DENSITE_MOYENNE_EDEFAULT : newDensiteMoyenne;
		boolean oldDensiteMoyenneESet = densiteMoyenneESet;
		densiteMoyenneESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COUVERTURE_NUAGEUSE__DENSITE_MOYENNE, oldDensiteMoyenne, densiteMoyenne, !oldDensiteMoyenneESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDensiteMoyenne() {
		TypeDictionaryDicoCouvertureNuageuseDensiteMoyenne oldDensiteMoyenne = densiteMoyenne;
		boolean oldDensiteMoyenneESet = densiteMoyenneESet;
		densiteMoyenne = DENSITE_MOYENNE_EDEFAULT;
		densiteMoyenneESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_COUVERTURE_NUAGEUSE__DENSITE_MOYENNE, oldDensiteMoyenne, DENSITE_MOYENNE_EDEFAULT, oldDensiteMoyenneESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDensiteMoyenne() {
		return densiteMoyenneESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getDistanceMinimaleBase() {
		return distanceMinimaleBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistanceMinimaleBase(TypeDataTypeLongueur newDistanceMinimaleBase, NotificationChain msgs) {
		TypeDataTypeLongueur oldDistanceMinimaleBase = distanceMinimaleBase;
		distanceMinimaleBase = newDistanceMinimaleBase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COUVERTURE_NUAGEUSE__DISTANCE_MINIMALE_BASE, oldDistanceMinimaleBase, newDistanceMinimaleBase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistanceMinimaleBase(TypeDataTypeLongueur newDistanceMinimaleBase) {
		if (newDistanceMinimaleBase != distanceMinimaleBase) {
			NotificationChain msgs = null;
			if (distanceMinimaleBase != null)
				msgs = ((InternalEObject)distanceMinimaleBase).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_COUVERTURE_NUAGEUSE__DISTANCE_MINIMALE_BASE, null, msgs);
			if (newDistanceMinimaleBase != null)
				msgs = ((InternalEObject)newDistanceMinimaleBase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_COUVERTURE_NUAGEUSE__DISTANCE_MINIMALE_BASE, null, msgs);
			msgs = basicSetDistanceMinimaleBase(newDistanceMinimaleBase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COUVERTURE_NUAGEUSE__DISTANCE_MINIMALE_BASE, newDistanceMinimaleBase, newDistanceMinimaleBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getDistanceMaximale() {
		return distanceMaximale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistanceMaximale(TypeDataTypeLongueur newDistanceMaximale, NotificationChain msgs) {
		TypeDataTypeLongueur oldDistanceMaximale = distanceMaximale;
		distanceMaximale = newDistanceMaximale;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COUVERTURE_NUAGEUSE__DISTANCE_MAXIMALE, oldDistanceMaximale, newDistanceMaximale);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistanceMaximale(TypeDataTypeLongueur newDistanceMaximale) {
		if (newDistanceMaximale != distanceMaximale) {
			NotificationChain msgs = null;
			if (distanceMaximale != null)
				msgs = ((InternalEObject)distanceMaximale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_COUVERTURE_NUAGEUSE__DISTANCE_MAXIMALE, null, msgs);
			if (newDistanceMaximale != null)
				msgs = ((InternalEObject)newDistanceMaximale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_COUVERTURE_NUAGEUSE__DISTANCE_MAXIMALE, null, msgs);
			msgs = basicSetDistanceMaximale(newDistanceMaximale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COUVERTURE_NUAGEUSE__DISTANCE_MAXIMALE, newDistanceMaximale, newDistanceMaximale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTauxRefraction() {
		return tauxRefraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTauxRefraction(double newTauxRefraction) {
		double oldTauxRefraction = tauxRefraction;
		tauxRefraction = newTauxRefraction;
		boolean oldTauxRefractionESet = tauxRefractionESet;
		tauxRefractionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COUVERTURE_NUAGEUSE__TAUX_REFRACTION, oldTauxRefraction, tauxRefraction, !oldTauxRefractionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTauxRefraction() {
		double oldTauxRefraction = tauxRefraction;
		boolean oldTauxRefractionESet = tauxRefractionESet;
		tauxRefraction = TAUX_REFRACTION_EDEFAULT;
		tauxRefractionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_COUVERTURE_NUAGEUSE__TAUX_REFRACTION, oldTauxRefraction, TAUX_REFRACTION_EDEFAULT, oldTauxRefractionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTauxRefraction() {
		return tauxRefractionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_COUVERTURE_NUAGEUSE__DISTANCE_MINIMALE_BASE:
				return basicSetDistanceMinimaleBase(null, msgs);
			case SchemaPackage.TYPE_COUVERTURE_NUAGEUSE__DISTANCE_MAXIMALE:
				return basicSetDistanceMaximale(null, msgs);
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
			case SchemaPackage.TYPE_COUVERTURE_NUAGEUSE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_COUVERTURE_NUAGEUSE__DENSITE_MOYENNE:
				return getDensiteMoyenne();
			case SchemaPackage.TYPE_COUVERTURE_NUAGEUSE__DISTANCE_MINIMALE_BASE:
				return getDistanceMinimaleBase();
			case SchemaPackage.TYPE_COUVERTURE_NUAGEUSE__DISTANCE_MAXIMALE:
				return getDistanceMaximale();
			case SchemaPackage.TYPE_COUVERTURE_NUAGEUSE__TAUX_REFRACTION:
				return new Double(getTauxRefraction());
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
			case SchemaPackage.TYPE_COUVERTURE_NUAGEUSE__CATEGORIE:
				setCategorie((TypeDictionaryDicoCouvertureNuageuseCategorie)newValue);
				return;
			case SchemaPackage.TYPE_COUVERTURE_NUAGEUSE__DENSITE_MOYENNE:
				setDensiteMoyenne((TypeDictionaryDicoCouvertureNuageuseDensiteMoyenne)newValue);
				return;
			case SchemaPackage.TYPE_COUVERTURE_NUAGEUSE__DISTANCE_MINIMALE_BASE:
				setDistanceMinimaleBase((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_COUVERTURE_NUAGEUSE__DISTANCE_MAXIMALE:
				setDistanceMaximale((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_COUVERTURE_NUAGEUSE__TAUX_REFRACTION:
				setTauxRefraction(((Double)newValue).doubleValue());
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
			case SchemaPackage.TYPE_COUVERTURE_NUAGEUSE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_COUVERTURE_NUAGEUSE__DENSITE_MOYENNE:
				unsetDensiteMoyenne();
				return;
			case SchemaPackage.TYPE_COUVERTURE_NUAGEUSE__DISTANCE_MINIMALE_BASE:
				setDistanceMinimaleBase((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_COUVERTURE_NUAGEUSE__DISTANCE_MAXIMALE:
				setDistanceMaximale((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_COUVERTURE_NUAGEUSE__TAUX_REFRACTION:
				unsetTauxRefraction();
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
			case SchemaPackage.TYPE_COUVERTURE_NUAGEUSE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_COUVERTURE_NUAGEUSE__DENSITE_MOYENNE:
				return isSetDensiteMoyenne();
			case SchemaPackage.TYPE_COUVERTURE_NUAGEUSE__DISTANCE_MINIMALE_BASE:
				return distanceMinimaleBase != null;
			case SchemaPackage.TYPE_COUVERTURE_NUAGEUSE__DISTANCE_MAXIMALE:
				return distanceMaximale != null;
			case SchemaPackage.TYPE_COUVERTURE_NUAGEUSE__TAUX_REFRACTION:
				return isSetTauxRefraction();
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
		result.append(", densiteMoyenne: ");
		if (densiteMoyenneESet) result.append(densiteMoyenne); else result.append("<unset>");
		result.append(", tauxRefraction: ");
		if (tauxRefractionESet) result.append(tauxRefraction); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeCouvertureNuageuseImpl
