/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeDataTypeLongueur;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCoordonneesLatLong;
import mpia.schema.TypeDictionaryDicoZDVparPeriodeConditionsInitiales;
import mpia.schema.TypeDictionaryDicoZDVparPeriodeTypeZDV;
import mpia.schema.TypeZDVparPeriode;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type ZD Vpar Periode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeZDVparPeriodeImpl#getTypeZDV <em>Type ZDV</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZDVparPeriodeImpl#getConditionsInitiales <em>Conditions Initiales</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZDVparPeriodeImpl#getDebutPeriodeValidite <em>Debut Periode Validite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZDVparPeriodeImpl#getRayonCercle <em>Rayon Cercle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZDVparPeriodeImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZDVparPeriodeImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZDVparPeriodeImpl#getAPourContourCoordonneesLatLong <em>APour Contour Coordonnees Lat Long</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeZDVparPeriodeImpl extends EObjectImpl implements TypeZDVparPeriode {
	/**
	 * The default value of the '{@link #getTypeZDV() <em>Type ZDV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeZDV()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoZDVparPeriodeTypeZDV TYPE_ZDV_EDEFAULT = TypeDictionaryDicoZDVparPeriodeTypeZDV.DHA01;

	/**
	 * The cached value of the '{@link #getTypeZDV() <em>Type ZDV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeZDV()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoZDVparPeriodeTypeZDV typeZDV = TYPE_ZDV_EDEFAULT;

	/**
	 * This is true if the Type ZDV attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeZDVESet;

	/**
	 * The default value of the '{@link #getConditionsInitiales() <em>Conditions Initiales</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionsInitiales()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoZDVparPeriodeConditionsInitiales CONDITIONS_INITIALES_EDEFAULT = TypeDictionaryDicoZDVparPeriodeConditionsInitiales.A1;

	/**
	 * The cached value of the '{@link #getConditionsInitiales() <em>Conditions Initiales</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionsInitiales()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoZDVparPeriodeConditionsInitiales conditionsInitiales = CONDITIONS_INITIALES_EDEFAULT;

	/**
	 * This is true if the Conditions Initiales attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean conditionsInitialesESet;

	/**
	 * The default value of the '{@link #getDebutPeriodeValidite() <em>Debut Periode Validite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebutPeriodeValidite()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DEBUT_PERIODE_VALIDITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDebutPeriodeValidite() <em>Debut Periode Validite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebutPeriodeValidite()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar debutPeriodeValidite = DEBUT_PERIODE_VALIDITE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRayonCercle() <em>Rayon Cercle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRayonCercle()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur rayonCercle;

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
	 * The cached value of the '{@link #getAPourContourCoordonneesLatLong() <em>APour Contour Coordonnees Lat Long</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourContourCoordonneesLatLong()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeCoordonneesLatLong> aPourContourCoordonneesLatLong;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeZDVparPeriodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeZDVparPeriode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoZDVparPeriodeTypeZDV getTypeZDV() {
		return typeZDV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeZDV(TypeDictionaryDicoZDVparPeriodeTypeZDV newTypeZDV) {
		TypeDictionaryDicoZDVparPeriodeTypeZDV oldTypeZDV = typeZDV;
		typeZDV = newTypeZDV == null ? TYPE_ZDV_EDEFAULT : newTypeZDV;
		boolean oldTypeZDVESet = typeZDVESet;
		typeZDVESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZD_VPAR_PERIODE__TYPE_ZDV, oldTypeZDV, typeZDV, !oldTypeZDVESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeZDV() {
		TypeDictionaryDicoZDVparPeriodeTypeZDV oldTypeZDV = typeZDV;
		boolean oldTypeZDVESet = typeZDVESet;
		typeZDV = TYPE_ZDV_EDEFAULT;
		typeZDVESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ZD_VPAR_PERIODE__TYPE_ZDV, oldTypeZDV, TYPE_ZDV_EDEFAULT, oldTypeZDVESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeZDV() {
		return typeZDVESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoZDVparPeriodeConditionsInitiales getConditionsInitiales() {
		return conditionsInitiales;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionsInitiales(TypeDictionaryDicoZDVparPeriodeConditionsInitiales newConditionsInitiales) {
		TypeDictionaryDicoZDVparPeriodeConditionsInitiales oldConditionsInitiales = conditionsInitiales;
		conditionsInitiales = newConditionsInitiales == null ? CONDITIONS_INITIALES_EDEFAULT : newConditionsInitiales;
		boolean oldConditionsInitialesESet = conditionsInitialesESet;
		conditionsInitialesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZD_VPAR_PERIODE__CONDITIONS_INITIALES, oldConditionsInitiales, conditionsInitiales, !oldConditionsInitialesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConditionsInitiales() {
		TypeDictionaryDicoZDVparPeriodeConditionsInitiales oldConditionsInitiales = conditionsInitiales;
		boolean oldConditionsInitialesESet = conditionsInitialesESet;
		conditionsInitiales = CONDITIONS_INITIALES_EDEFAULT;
		conditionsInitialesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ZD_VPAR_PERIODE__CONDITIONS_INITIALES, oldConditionsInitiales, CONDITIONS_INITIALES_EDEFAULT, oldConditionsInitialesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConditionsInitiales() {
		return conditionsInitialesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDebutPeriodeValidite() {
		return debutPeriodeValidite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebutPeriodeValidite(XMLGregorianCalendar newDebutPeriodeValidite) {
		XMLGregorianCalendar oldDebutPeriodeValidite = debutPeriodeValidite;
		debutPeriodeValidite = newDebutPeriodeValidite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZD_VPAR_PERIODE__DEBUT_PERIODE_VALIDITE, oldDebutPeriodeValidite, debutPeriodeValidite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getRayonCercle() {
		return rayonCercle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRayonCercle(TypeDataTypeLongueur newRayonCercle, NotificationChain msgs) {
		TypeDataTypeLongueur oldRayonCercle = rayonCercle;
		rayonCercle = newRayonCercle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZD_VPAR_PERIODE__RAYON_CERCLE, oldRayonCercle, newRayonCercle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRayonCercle(TypeDataTypeLongueur newRayonCercle) {
		if (newRayonCercle != rayonCercle) {
			NotificationChain msgs = null;
			if (rayonCercle != null)
				msgs = ((InternalEObject)rayonCercle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ZD_VPAR_PERIODE__RAYON_CERCLE, null, msgs);
			if (newRayonCercle != null)
				msgs = ((InternalEObject)newRayonCercle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ZD_VPAR_PERIODE__RAYON_CERCLE, null, msgs);
			msgs = basicSetRayonCercle(newRayonCercle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZD_VPAR_PERIODE__RAYON_CERCLE, newRayonCercle, newRayonCercle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZD_VPAR_PERIODE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZD_VPAR_PERIODE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeCoordonneesLatLong> getAPourContourCoordonneesLatLong() {
		if (aPourContourCoordonneesLatLong == null) {
			aPourContourCoordonneesLatLong = new EObjectContainmentEList<TypeCoordonneesLatLong>(TypeCoordonneesLatLong.class, this, SchemaPackage.TYPE_ZD_VPAR_PERIODE__APOUR_CONTOUR_COORDONNEES_LAT_LONG);
		}
		return aPourContourCoordonneesLatLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ZD_VPAR_PERIODE__RAYON_CERCLE:
				return basicSetRayonCercle(null, msgs);
			case SchemaPackage.TYPE_ZD_VPAR_PERIODE__APOUR_CONTOUR_COORDONNEES_LAT_LONG:
				return ((InternalEList<?>)getAPourContourCoordonneesLatLong()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_ZD_VPAR_PERIODE__TYPE_ZDV:
				return getTypeZDV();
			case SchemaPackage.TYPE_ZD_VPAR_PERIODE__CONDITIONS_INITIALES:
				return getConditionsInitiales();
			case SchemaPackage.TYPE_ZD_VPAR_PERIODE__DEBUT_PERIODE_VALIDITE:
				return getDebutPeriodeValidite();
			case SchemaPackage.TYPE_ZD_VPAR_PERIODE__RAYON_CERCLE:
				return getRayonCercle();
			case SchemaPackage.TYPE_ZD_VPAR_PERIODE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ZD_VPAR_PERIODE__CE:
				return getCE();
			case SchemaPackage.TYPE_ZD_VPAR_PERIODE__APOUR_CONTOUR_COORDONNEES_LAT_LONG:
				return getAPourContourCoordonneesLatLong();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SchemaPackage.TYPE_ZD_VPAR_PERIODE__TYPE_ZDV:
				setTypeZDV((TypeDictionaryDicoZDVparPeriodeTypeZDV)newValue);
				return;
			case SchemaPackage.TYPE_ZD_VPAR_PERIODE__CONDITIONS_INITIALES:
				setConditionsInitiales((TypeDictionaryDicoZDVparPeriodeConditionsInitiales)newValue);
				return;
			case SchemaPackage.TYPE_ZD_VPAR_PERIODE__DEBUT_PERIODE_VALIDITE:
				setDebutPeriodeValidite((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_ZD_VPAR_PERIODE__RAYON_CERCLE:
				setRayonCercle((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_ZD_VPAR_PERIODE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ZD_VPAR_PERIODE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ZD_VPAR_PERIODE__APOUR_CONTOUR_COORDONNEES_LAT_LONG:
				getAPourContourCoordonneesLatLong().clear();
				getAPourContourCoordonneesLatLong().addAll((Collection<? extends TypeCoordonneesLatLong>)newValue);
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
			case SchemaPackage.TYPE_ZD_VPAR_PERIODE__TYPE_ZDV:
				unsetTypeZDV();
				return;
			case SchemaPackage.TYPE_ZD_VPAR_PERIODE__CONDITIONS_INITIALES:
				unsetConditionsInitiales();
				return;
			case SchemaPackage.TYPE_ZD_VPAR_PERIODE__DEBUT_PERIODE_VALIDITE:
				setDebutPeriodeValidite(DEBUT_PERIODE_VALIDITE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ZD_VPAR_PERIODE__RAYON_CERCLE:
				setRayonCercle((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_ZD_VPAR_PERIODE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ZD_VPAR_PERIODE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ZD_VPAR_PERIODE__APOUR_CONTOUR_COORDONNEES_LAT_LONG:
				getAPourContourCoordonneesLatLong().clear();
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
			case SchemaPackage.TYPE_ZD_VPAR_PERIODE__TYPE_ZDV:
				return isSetTypeZDV();
			case SchemaPackage.TYPE_ZD_VPAR_PERIODE__CONDITIONS_INITIALES:
				return isSetConditionsInitiales();
			case SchemaPackage.TYPE_ZD_VPAR_PERIODE__DEBUT_PERIODE_VALIDITE:
				return DEBUT_PERIODE_VALIDITE_EDEFAULT == null ? debutPeriodeValidite != null : !DEBUT_PERIODE_VALIDITE_EDEFAULT.equals(debutPeriodeValidite);
			case SchemaPackage.TYPE_ZD_VPAR_PERIODE__RAYON_CERCLE:
				return rayonCercle != null;
			case SchemaPackage.TYPE_ZD_VPAR_PERIODE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ZD_VPAR_PERIODE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ZD_VPAR_PERIODE__APOUR_CONTOUR_COORDONNEES_LAT_LONG:
				return aPourContourCoordonneesLatLong != null && !aPourContourCoordonneesLatLong.isEmpty();
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
		result.append(" (typeZDV: ");
		if (typeZDVESet) result.append(typeZDV); else result.append("<unset>");
		result.append(", conditionsInitiales: ");
		if (conditionsInitialesESet) result.append(conditionsInitiales); else result.append("<unset>");
		result.append(", debutPeriodeValidite: ");
		result.append(debutPeriodeValidite);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeZDVparPeriodeImpl
