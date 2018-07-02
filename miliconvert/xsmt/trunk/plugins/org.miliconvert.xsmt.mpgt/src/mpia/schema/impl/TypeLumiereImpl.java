/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeDateHeure;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoLumiereCategorie;
import mpia.schema.TypeDictionaryDicoLumierePhaseLune;
import mpia.schema.TypeLumiere;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Lumiere</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeLumiereImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLumiereImpl#getDebutPeriode <em>Debut Periode</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLumiereImpl#getFinPeriode <em>Fin Periode</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLumiereImpl#getPhaseLune <em>Phase Lune</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeLumiereImpl extends EObjectImpl implements TypeLumiere {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoLumiereCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoLumiereCategorie.DAY;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoLumiereCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The cached value of the '{@link #getDebutPeriode() <em>Debut Periode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebutPeriode()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDateHeure debutPeriode;

	/**
	 * The cached value of the '{@link #getFinPeriode() <em>Fin Periode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinPeriode()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDateHeure finPeriode;

	/**
	 * The default value of the '{@link #getPhaseLune() <em>Phase Lune</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseLune()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoLumierePhaseLune PHASE_LUNE_EDEFAULT = TypeDictionaryDicoLumierePhaseLune.WAX;

	/**
	 * The cached value of the '{@link #getPhaseLune() <em>Phase Lune</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseLune()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoLumierePhaseLune phaseLune = PHASE_LUNE_EDEFAULT;

	/**
	 * This is true if the Phase Lune attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean phaseLuneESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeLumiereImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeLumiere();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoLumiereCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoLumiereCategorie newCategorie) {
		TypeDictionaryDicoLumiereCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LUMIERE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoLumiereCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_LUMIERE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeDataTypeDateHeure getDebutPeriode() {
		return debutPeriode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDebutPeriode(TypeDataTypeDateHeure newDebutPeriode, NotificationChain msgs) {
		TypeDataTypeDateHeure oldDebutPeriode = debutPeriode;
		debutPeriode = newDebutPeriode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LUMIERE__DEBUT_PERIODE, oldDebutPeriode, newDebutPeriode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebutPeriode(TypeDataTypeDateHeure newDebutPeriode) {
		if (newDebutPeriode != debutPeriode) {
			NotificationChain msgs = null;
			if (debutPeriode != null)
				msgs = ((InternalEObject)debutPeriode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_LUMIERE__DEBUT_PERIODE, null, msgs);
			if (newDebutPeriode != null)
				msgs = ((InternalEObject)newDebutPeriode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_LUMIERE__DEBUT_PERIODE, null, msgs);
			msgs = basicSetDebutPeriode(newDebutPeriode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LUMIERE__DEBUT_PERIODE, newDebutPeriode, newDebutPeriode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDateHeure getFinPeriode() {
		return finPeriode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinPeriode(TypeDataTypeDateHeure newFinPeriode, NotificationChain msgs) {
		TypeDataTypeDateHeure oldFinPeriode = finPeriode;
		finPeriode = newFinPeriode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LUMIERE__FIN_PERIODE, oldFinPeriode, newFinPeriode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinPeriode(TypeDataTypeDateHeure newFinPeriode) {
		if (newFinPeriode != finPeriode) {
			NotificationChain msgs = null;
			if (finPeriode != null)
				msgs = ((InternalEObject)finPeriode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_LUMIERE__FIN_PERIODE, null, msgs);
			if (newFinPeriode != null)
				msgs = ((InternalEObject)newFinPeriode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_LUMIERE__FIN_PERIODE, null, msgs);
			msgs = basicSetFinPeriode(newFinPeriode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LUMIERE__FIN_PERIODE, newFinPeriode, newFinPeriode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoLumierePhaseLune getPhaseLune() {
		return phaseLune;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhaseLune(TypeDictionaryDicoLumierePhaseLune newPhaseLune) {
		TypeDictionaryDicoLumierePhaseLune oldPhaseLune = phaseLune;
		phaseLune = newPhaseLune == null ? PHASE_LUNE_EDEFAULT : newPhaseLune;
		boolean oldPhaseLuneESet = phaseLuneESet;
		phaseLuneESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LUMIERE__PHASE_LUNE, oldPhaseLune, phaseLune, !oldPhaseLuneESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPhaseLune() {
		TypeDictionaryDicoLumierePhaseLune oldPhaseLune = phaseLune;
		boolean oldPhaseLuneESet = phaseLuneESet;
		phaseLune = PHASE_LUNE_EDEFAULT;
		phaseLuneESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_LUMIERE__PHASE_LUNE, oldPhaseLune, PHASE_LUNE_EDEFAULT, oldPhaseLuneESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPhaseLune() {
		return phaseLuneESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_LUMIERE__DEBUT_PERIODE:
				return basicSetDebutPeriode(null, msgs);
			case SchemaPackage.TYPE_LUMIERE__FIN_PERIODE:
				return basicSetFinPeriode(null, msgs);
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
			case SchemaPackage.TYPE_LUMIERE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_LUMIERE__DEBUT_PERIODE:
				return getDebutPeriode();
			case SchemaPackage.TYPE_LUMIERE__FIN_PERIODE:
				return getFinPeriode();
			case SchemaPackage.TYPE_LUMIERE__PHASE_LUNE:
				return getPhaseLune();
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
			case SchemaPackage.TYPE_LUMIERE__CATEGORIE:
				setCategorie((TypeDictionaryDicoLumiereCategorie)newValue);
				return;
			case SchemaPackage.TYPE_LUMIERE__DEBUT_PERIODE:
				setDebutPeriode((TypeDataTypeDateHeure)newValue);
				return;
			case SchemaPackage.TYPE_LUMIERE__FIN_PERIODE:
				setFinPeriode((TypeDataTypeDateHeure)newValue);
				return;
			case SchemaPackage.TYPE_LUMIERE__PHASE_LUNE:
				setPhaseLune((TypeDictionaryDicoLumierePhaseLune)newValue);
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
			case SchemaPackage.TYPE_LUMIERE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_LUMIERE__DEBUT_PERIODE:
				setDebutPeriode((TypeDataTypeDateHeure)null);
				return;
			case SchemaPackage.TYPE_LUMIERE__FIN_PERIODE:
				setFinPeriode((TypeDataTypeDateHeure)null);
				return;
			case SchemaPackage.TYPE_LUMIERE__PHASE_LUNE:
				unsetPhaseLune();
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
			case SchemaPackage.TYPE_LUMIERE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_LUMIERE__DEBUT_PERIODE:
				return debutPeriode != null;
			case SchemaPackage.TYPE_LUMIERE__FIN_PERIODE:
				return finPeriode != null;
			case SchemaPackage.TYPE_LUMIERE__PHASE_LUNE:
				return isSetPhaseLune();
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
		result.append(", phaseLune: ");
		if (phaseLuneESet) result.append(phaseLune); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeLumiereImpl
