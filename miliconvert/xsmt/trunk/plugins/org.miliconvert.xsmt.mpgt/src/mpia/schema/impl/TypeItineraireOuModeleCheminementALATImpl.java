/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoModaliteSens;
import mpia.schema.TypeItineraireOuModeleCheminementALAT;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Itineraire Ou Modele Cheminement ALAT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeItineraireOuModeleCheminementALATImpl#getSensRoute <em>Sens Route</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeItineraireOuModeleCheminementALATImpl#getInclusSite <em>Inclus Site</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeItineraireOuModeleCheminementALATImpl extends TypeElementControleImpl implements TypeItineraireOuModeleCheminementALAT {
	/**
	 * The default value of the '{@link #getSensRoute() <em>Sens Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensRoute()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoModaliteSens SENS_ROUTE_EDEFAULT = TypeDictionaryDicoModaliteSens.DIRCRE;

	/**
	 * The cached value of the '{@link #getSensRoute() <em>Sens Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensRoute()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoModaliteSens sensRoute = SENS_ROUTE_EDEFAULT;

	/**
	 * This is true if the Sens Route attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sensRouteESet;

	/**
	 * The cached value of the '{@link #getInclusSite() <em>Inclus Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclusSite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation inclusSite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeItineraireOuModeleCheminementALATImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeItineraireOuModeleCheminementALAT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoModaliteSens getSensRoute() {
		return sensRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensRoute(TypeDictionaryDicoModaliteSens newSensRoute) {
		TypeDictionaryDicoModaliteSens oldSensRoute = sensRoute;
		sensRoute = newSensRoute == null ? SENS_ROUTE_EDEFAULT : newSensRoute;
		boolean oldSensRouteESet = sensRouteESet;
		sensRouteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ITINERAIRE_OU_MODELE_CHEMINEMENT_ALAT__SENS_ROUTE, oldSensRoute, sensRoute, !oldSensRouteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSensRoute() {
		TypeDictionaryDicoModaliteSens oldSensRoute = sensRoute;
		boolean oldSensRouteESet = sensRouteESet;
		sensRoute = SENS_ROUTE_EDEFAULT;
		sensRouteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ITINERAIRE_OU_MODELE_CHEMINEMENT_ALAT__SENS_ROUTE, oldSensRoute, SENS_ROUTE_EDEFAULT, oldSensRouteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSensRoute() {
		return sensRouteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getInclusSite() {
		return inclusSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInclusSite(TypeAssociation newInclusSite, NotificationChain msgs) {
		TypeAssociation oldInclusSite = inclusSite;
		inclusSite = newInclusSite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ITINERAIRE_OU_MODELE_CHEMINEMENT_ALAT__INCLUS_SITE, oldInclusSite, newInclusSite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInclusSite(TypeAssociation newInclusSite) {
		if (newInclusSite != inclusSite) {
			NotificationChain msgs = null;
			if (inclusSite != null)
				msgs = ((InternalEObject)inclusSite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ITINERAIRE_OU_MODELE_CHEMINEMENT_ALAT__INCLUS_SITE, null, msgs);
			if (newInclusSite != null)
				msgs = ((InternalEObject)newInclusSite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ITINERAIRE_OU_MODELE_CHEMINEMENT_ALAT__INCLUS_SITE, null, msgs);
			msgs = basicSetInclusSite(newInclusSite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ITINERAIRE_OU_MODELE_CHEMINEMENT_ALAT__INCLUS_SITE, newInclusSite, newInclusSite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ITINERAIRE_OU_MODELE_CHEMINEMENT_ALAT__INCLUS_SITE:
				return basicSetInclusSite(null, msgs);
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
			case SchemaPackage.TYPE_ITINERAIRE_OU_MODELE_CHEMINEMENT_ALAT__SENS_ROUTE:
				return getSensRoute();
			case SchemaPackage.TYPE_ITINERAIRE_OU_MODELE_CHEMINEMENT_ALAT__INCLUS_SITE:
				return getInclusSite();
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
			case SchemaPackage.TYPE_ITINERAIRE_OU_MODELE_CHEMINEMENT_ALAT__SENS_ROUTE:
				setSensRoute((TypeDictionaryDicoModaliteSens)newValue);
				return;
			case SchemaPackage.TYPE_ITINERAIRE_OU_MODELE_CHEMINEMENT_ALAT__INCLUS_SITE:
				setInclusSite((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ITINERAIRE_OU_MODELE_CHEMINEMENT_ALAT__SENS_ROUTE:
				unsetSensRoute();
				return;
			case SchemaPackage.TYPE_ITINERAIRE_OU_MODELE_CHEMINEMENT_ALAT__INCLUS_SITE:
				setInclusSite((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ITINERAIRE_OU_MODELE_CHEMINEMENT_ALAT__SENS_ROUTE:
				return isSetSensRoute();
			case SchemaPackage.TYPE_ITINERAIRE_OU_MODELE_CHEMINEMENT_ALAT__INCLUS_SITE:
				return inclusSite != null;
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
		result.append(" (sensRoute: ");
		if (sensRouteESet) result.append(sensRoute); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeItineraireOuModeleCheminementALATImpl
