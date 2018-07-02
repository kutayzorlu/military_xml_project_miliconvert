/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoRouteCategorie;
import mpia.schema.TypeDictionaryDicoRouteConditionMeteo;
import mpia.schema.TypeDictionaryDicoRouteEtatRoute;
import mpia.schema.TypeDictionaryDicoRouteLargueurBasCotes;
import mpia.schema.TypeRoute;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Route</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeRouteImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRouteImpl#getEtatRoute <em>Etat Route</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRouteImpl#getConditionMeteo <em>Condition Meteo</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRouteImpl#getDensiteTrafic <em>Densite Trafic</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRouteImpl#getLargueurBasCotes <em>Largueur Bas Cotes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeRouteImpl extends TypeSiteImpl implements TypeRoute {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoRouteCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoRouteCategorie.E;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoRouteCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getEtatRoute() <em>Etat Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatRoute()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoRouteEtatRoute ETAT_ROUTE_EDEFAULT = TypeDictionaryDicoRouteEtatRoute.E;

	/**
	 * The cached value of the '{@link #getEtatRoute() <em>Etat Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatRoute()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoRouteEtatRoute etatRoute = ETAT_ROUTE_EDEFAULT;

	/**
	 * This is true if the Etat Route attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean etatRouteESet;

	/**
	 * The default value of the '{@link #getConditionMeteo() <em>Condition Meteo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionMeteo()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoRouteConditionMeteo CONDITION_METEO_EDEFAULT = TypeDictionaryDicoRouteConditionMeteo.AWR;

	/**
	 * The cached value of the '{@link #getConditionMeteo() <em>Condition Meteo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionMeteo()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoRouteConditionMeteo conditionMeteo = CONDITION_METEO_EDEFAULT;

	/**
	 * This is true if the Condition Meteo attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean conditionMeteoESet;

	/**
	 * The default value of the '{@link #getDensiteTrafic() <em>Densite Trafic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDensiteTrafic()
	 * @generated
	 * @ordered
	 */
	protected static final double DENSITE_TRAFIC_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDensiteTrafic() <em>Densite Trafic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDensiteTrafic()
	 * @generated
	 * @ordered
	 */
	protected double densiteTrafic = DENSITE_TRAFIC_EDEFAULT;

	/**
	 * This is true if the Densite Trafic attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean densiteTraficESet;

	/**
	 * The default value of the '{@link #getLargueurBasCotes() <em>Largueur Bas Cotes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargueurBasCotes()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoRouteLargueurBasCotes LARGUEUR_BAS_COTES_EDEFAULT = TypeDictionaryDicoRouteLargueurBasCotes._1;

	/**
	 * The cached value of the '{@link #getLargueurBasCotes() <em>Largueur Bas Cotes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargueurBasCotes()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoRouteLargueurBasCotes largueurBasCotes = LARGUEUR_BAS_COTES_EDEFAULT;

	/**
	 * This is true if the Largueur Bas Cotes attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean largueurBasCotesESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeRouteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeRoute();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoRouteCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoRouteCategorie newCategorie) {
		TypeDictionaryDicoRouteCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ROUTE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoRouteCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ROUTE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeDictionaryDicoRouteEtatRoute getEtatRoute() {
		return etatRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatRoute(TypeDictionaryDicoRouteEtatRoute newEtatRoute) {
		TypeDictionaryDicoRouteEtatRoute oldEtatRoute = etatRoute;
		etatRoute = newEtatRoute == null ? ETAT_ROUTE_EDEFAULT : newEtatRoute;
		boolean oldEtatRouteESet = etatRouteESet;
		etatRouteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ROUTE__ETAT_ROUTE, oldEtatRoute, etatRoute, !oldEtatRouteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEtatRoute() {
		TypeDictionaryDicoRouteEtatRoute oldEtatRoute = etatRoute;
		boolean oldEtatRouteESet = etatRouteESet;
		etatRoute = ETAT_ROUTE_EDEFAULT;
		etatRouteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ROUTE__ETAT_ROUTE, oldEtatRoute, ETAT_ROUTE_EDEFAULT, oldEtatRouteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEtatRoute() {
		return etatRouteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoRouteConditionMeteo getConditionMeteo() {
		return conditionMeteo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionMeteo(TypeDictionaryDicoRouteConditionMeteo newConditionMeteo) {
		TypeDictionaryDicoRouteConditionMeteo oldConditionMeteo = conditionMeteo;
		conditionMeteo = newConditionMeteo == null ? CONDITION_METEO_EDEFAULT : newConditionMeteo;
		boolean oldConditionMeteoESet = conditionMeteoESet;
		conditionMeteoESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ROUTE__CONDITION_METEO, oldConditionMeteo, conditionMeteo, !oldConditionMeteoESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConditionMeteo() {
		TypeDictionaryDicoRouteConditionMeteo oldConditionMeteo = conditionMeteo;
		boolean oldConditionMeteoESet = conditionMeteoESet;
		conditionMeteo = CONDITION_METEO_EDEFAULT;
		conditionMeteoESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ROUTE__CONDITION_METEO, oldConditionMeteo, CONDITION_METEO_EDEFAULT, oldConditionMeteoESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConditionMeteo() {
		return conditionMeteoESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDensiteTrafic() {
		return densiteTrafic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDensiteTrafic(double newDensiteTrafic) {
		double oldDensiteTrafic = densiteTrafic;
		densiteTrafic = newDensiteTrafic;
		boolean oldDensiteTraficESet = densiteTraficESet;
		densiteTraficESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ROUTE__DENSITE_TRAFIC, oldDensiteTrafic, densiteTrafic, !oldDensiteTraficESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDensiteTrafic() {
		double oldDensiteTrafic = densiteTrafic;
		boolean oldDensiteTraficESet = densiteTraficESet;
		densiteTrafic = DENSITE_TRAFIC_EDEFAULT;
		densiteTraficESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ROUTE__DENSITE_TRAFIC, oldDensiteTrafic, DENSITE_TRAFIC_EDEFAULT, oldDensiteTraficESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDensiteTrafic() {
		return densiteTraficESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoRouteLargueurBasCotes getLargueurBasCotes() {
		return largueurBasCotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLargueurBasCotes(TypeDictionaryDicoRouteLargueurBasCotes newLargueurBasCotes) {
		TypeDictionaryDicoRouteLargueurBasCotes oldLargueurBasCotes = largueurBasCotes;
		largueurBasCotes = newLargueurBasCotes == null ? LARGUEUR_BAS_COTES_EDEFAULT : newLargueurBasCotes;
		boolean oldLargueurBasCotesESet = largueurBasCotesESet;
		largueurBasCotesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ROUTE__LARGUEUR_BAS_COTES, oldLargueurBasCotes, largueurBasCotes, !oldLargueurBasCotesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLargueurBasCotes() {
		TypeDictionaryDicoRouteLargueurBasCotes oldLargueurBasCotes = largueurBasCotes;
		boolean oldLargueurBasCotesESet = largueurBasCotesESet;
		largueurBasCotes = LARGUEUR_BAS_COTES_EDEFAULT;
		largueurBasCotesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ROUTE__LARGUEUR_BAS_COTES, oldLargueurBasCotes, LARGUEUR_BAS_COTES_EDEFAULT, oldLargueurBasCotesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLargueurBasCotes() {
		return largueurBasCotesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_ROUTE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ROUTE__ETAT_ROUTE:
				return getEtatRoute();
			case SchemaPackage.TYPE_ROUTE__CONDITION_METEO:
				return getConditionMeteo();
			case SchemaPackage.TYPE_ROUTE__DENSITE_TRAFIC:
				return new Double(getDensiteTrafic());
			case SchemaPackage.TYPE_ROUTE__LARGUEUR_BAS_COTES:
				return getLargueurBasCotes();
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
			case SchemaPackage.TYPE_ROUTE__CATEGORIE:
				setCategorie((TypeDictionaryDicoRouteCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ROUTE__ETAT_ROUTE:
				setEtatRoute((TypeDictionaryDicoRouteEtatRoute)newValue);
				return;
			case SchemaPackage.TYPE_ROUTE__CONDITION_METEO:
				setConditionMeteo((TypeDictionaryDicoRouteConditionMeteo)newValue);
				return;
			case SchemaPackage.TYPE_ROUTE__DENSITE_TRAFIC:
				setDensiteTrafic(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_ROUTE__LARGUEUR_BAS_COTES:
				setLargueurBasCotes((TypeDictionaryDicoRouteLargueurBasCotes)newValue);
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
			case SchemaPackage.TYPE_ROUTE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ROUTE__ETAT_ROUTE:
				unsetEtatRoute();
				return;
			case SchemaPackage.TYPE_ROUTE__CONDITION_METEO:
				unsetConditionMeteo();
				return;
			case SchemaPackage.TYPE_ROUTE__DENSITE_TRAFIC:
				unsetDensiteTrafic();
				return;
			case SchemaPackage.TYPE_ROUTE__LARGUEUR_BAS_COTES:
				unsetLargueurBasCotes();
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
			case SchemaPackage.TYPE_ROUTE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ROUTE__ETAT_ROUTE:
				return isSetEtatRoute();
			case SchemaPackage.TYPE_ROUTE__CONDITION_METEO:
				return isSetConditionMeteo();
			case SchemaPackage.TYPE_ROUTE__DENSITE_TRAFIC:
				return isSetDensiteTrafic();
			case SchemaPackage.TYPE_ROUTE__LARGUEUR_BAS_COTES:
				return isSetLargueurBasCotes();
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
		result.append(", etatRoute: ");
		if (etatRouteESet) result.append(etatRoute); else result.append("<unset>");
		result.append(", conditionMeteo: ");
		if (conditionMeteoESet) result.append(conditionMeteo); else result.append("<unset>");
		result.append(", densiteTrafic: ");
		if (densiteTraficESet) result.append(densiteTrafic); else result.append("<unset>");
		result.append(", largueurBasCotes: ");
		if (largueurBasCotesESet) result.append(largueurBasCotes); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeRouteImpl
