/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationConvoiMouvementParRoute;
import mpia.schema.TypeDictionaryDicoAssociationConvoiMouvementParRouteCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Convoi Mouvement Par Route</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationConvoiMouvementParRouteImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationConvoiMouvementParRouteImpl#getAPourSujetConvoi <em>APour Sujet Convoi</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationConvoiMouvementParRouteImpl#getAPourObjetMouvementParRoute <em>APour Objet Mouvement Par Route</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationConvoiMouvementParRouteImpl extends TypeAssociationInstanceObjetActiviteImpl implements TypeAssociationConvoiMouvementParRoute {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAssociationConvoiMouvementParRouteCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssociationConvoiMouvementParRouteCategorie.MOVING;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationConvoiMouvementParRouteCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The cached value of the '{@link #getAPourSujetConvoi() <em>APour Sujet Convoi</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourSujetConvoi()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourSujetConvoi;

	/**
	 * The cached value of the '{@link #getAPourObjetMouvementParRoute() <em>APour Objet Mouvement Par Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourObjetMouvementParRoute()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourObjetMouvementParRoute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationConvoiMouvementParRouteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationConvoiMouvementParRoute();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssociationConvoiMouvementParRouteCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssociationConvoiMouvementParRouteCategorie newCategorie) {
		TypeDictionaryDicoAssociationConvoiMouvementParRouteCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_CONVOI_MOUVEMENT_PAR_ROUTE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssociationConvoiMouvementParRouteCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_CONVOI_MOUVEMENT_PAR_ROUTE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeAssociation getAPourSujetConvoi() {
		return aPourSujetConvoi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourSujetConvoi(TypeAssociation newAPourSujetConvoi, NotificationChain msgs) {
		TypeAssociation oldAPourSujetConvoi = aPourSujetConvoi;
		aPourSujetConvoi = newAPourSujetConvoi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_CONVOI_MOUVEMENT_PAR_ROUTE__APOUR_SUJET_CONVOI, oldAPourSujetConvoi, newAPourSujetConvoi);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourSujetConvoi(TypeAssociation newAPourSujetConvoi) {
		if (newAPourSujetConvoi != aPourSujetConvoi) {
			NotificationChain msgs = null;
			if (aPourSujetConvoi != null)
				msgs = ((InternalEObject)aPourSujetConvoi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_CONVOI_MOUVEMENT_PAR_ROUTE__APOUR_SUJET_CONVOI, null, msgs);
			if (newAPourSujetConvoi != null)
				msgs = ((InternalEObject)newAPourSujetConvoi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_CONVOI_MOUVEMENT_PAR_ROUTE__APOUR_SUJET_CONVOI, null, msgs);
			msgs = basicSetAPourSujetConvoi(newAPourSujetConvoi, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_CONVOI_MOUVEMENT_PAR_ROUTE__APOUR_SUJET_CONVOI, newAPourSujetConvoi, newAPourSujetConvoi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourObjetMouvementParRoute() {
		return aPourObjetMouvementParRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourObjetMouvementParRoute(TypeAssociation newAPourObjetMouvementParRoute, NotificationChain msgs) {
		TypeAssociation oldAPourObjetMouvementParRoute = aPourObjetMouvementParRoute;
		aPourObjetMouvementParRoute = newAPourObjetMouvementParRoute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_CONVOI_MOUVEMENT_PAR_ROUTE__APOUR_OBJET_MOUVEMENT_PAR_ROUTE, oldAPourObjetMouvementParRoute, newAPourObjetMouvementParRoute);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourObjetMouvementParRoute(TypeAssociation newAPourObjetMouvementParRoute) {
		if (newAPourObjetMouvementParRoute != aPourObjetMouvementParRoute) {
			NotificationChain msgs = null;
			if (aPourObjetMouvementParRoute != null)
				msgs = ((InternalEObject)aPourObjetMouvementParRoute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_CONVOI_MOUVEMENT_PAR_ROUTE__APOUR_OBJET_MOUVEMENT_PAR_ROUTE, null, msgs);
			if (newAPourObjetMouvementParRoute != null)
				msgs = ((InternalEObject)newAPourObjetMouvementParRoute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_CONVOI_MOUVEMENT_PAR_ROUTE__APOUR_OBJET_MOUVEMENT_PAR_ROUTE, null, msgs);
			msgs = basicSetAPourObjetMouvementParRoute(newAPourObjetMouvementParRoute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_CONVOI_MOUVEMENT_PAR_ROUTE__APOUR_OBJET_MOUVEMENT_PAR_ROUTE, newAPourObjetMouvementParRoute, newAPourObjetMouvementParRoute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_CONVOI_MOUVEMENT_PAR_ROUTE__APOUR_SUJET_CONVOI:
				return basicSetAPourSujetConvoi(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_CONVOI_MOUVEMENT_PAR_ROUTE__APOUR_OBJET_MOUVEMENT_PAR_ROUTE:
				return basicSetAPourObjetMouvementParRoute(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_CONVOI_MOUVEMENT_PAR_ROUTE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_CONVOI_MOUVEMENT_PAR_ROUTE__APOUR_SUJET_CONVOI:
				return getAPourSujetConvoi();
			case SchemaPackage.TYPE_ASSOCIATION_CONVOI_MOUVEMENT_PAR_ROUTE__APOUR_OBJET_MOUVEMENT_PAR_ROUTE:
				return getAPourObjetMouvementParRoute();
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
			case SchemaPackage.TYPE_ASSOCIATION_CONVOI_MOUVEMENT_PAR_ROUTE__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationConvoiMouvementParRouteCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_CONVOI_MOUVEMENT_PAR_ROUTE__APOUR_SUJET_CONVOI:
				setAPourSujetConvoi((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_CONVOI_MOUVEMENT_PAR_ROUTE__APOUR_OBJET_MOUVEMENT_PAR_ROUTE:
				setAPourObjetMouvementParRoute((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_CONVOI_MOUVEMENT_PAR_ROUTE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_CONVOI_MOUVEMENT_PAR_ROUTE__APOUR_SUJET_CONVOI:
				setAPourSujetConvoi((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_CONVOI_MOUVEMENT_PAR_ROUTE__APOUR_OBJET_MOUVEMENT_PAR_ROUTE:
				setAPourObjetMouvementParRoute((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_CONVOI_MOUVEMENT_PAR_ROUTE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_CONVOI_MOUVEMENT_PAR_ROUTE__APOUR_SUJET_CONVOI:
				return aPourSujetConvoi != null;
			case SchemaPackage.TYPE_ASSOCIATION_CONVOI_MOUVEMENT_PAR_ROUTE__APOUR_OBJET_MOUVEMENT_PAR_ROUTE:
				return aPourObjetMouvementParRoute != null;
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

} //TypeAssociationConvoiMouvementParRouteImpl
