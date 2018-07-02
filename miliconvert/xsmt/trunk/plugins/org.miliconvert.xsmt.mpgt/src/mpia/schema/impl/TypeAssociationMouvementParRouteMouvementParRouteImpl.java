/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationMouvementParRouteMouvementParRoute;
import mpia.schema.TypeDictionaryDicoAssociationMouvementParRouteMouvementParRouteCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Mouvement Par Route Mouvement Par Route</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationMouvementParRouteMouvementParRouteImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationMouvementParRouteMouvementParRouteImpl#getAssocieCommeSujetMouvementParRoute <em>Associe Comme Sujet Mouvement Par Route</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationMouvementParRouteMouvementParRouteImpl#getAssocieCommeObjetMouvementParRoute <em>Associe Comme Objet Mouvement Par Route</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationMouvementParRouteMouvementParRouteImpl extends TypeAssociationFonctionnelleActiviteImpl implements TypeAssociationMouvementParRouteMouvementParRoute {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAssociationMouvementParRouteMouvementParRouteCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssociationMouvementParRouteMouvementParRouteCategorie.INRSTO;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationMouvementParRouteMouvementParRouteCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The cached value of the '{@link #getAssocieCommeSujetMouvementParRoute() <em>Associe Comme Sujet Mouvement Par Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeSujetMouvementParRoute()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeSujetMouvementParRoute;

	/**
	 * The cached value of the '{@link #getAssocieCommeObjetMouvementParRoute() <em>Associe Comme Objet Mouvement Par Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeObjetMouvementParRoute()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeObjetMouvementParRoute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationMouvementParRouteMouvementParRouteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationMouvementParRouteMouvementParRoute();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssociationMouvementParRouteMouvementParRouteCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssociationMouvementParRouteMouvementParRouteCategorie newCategorie) {
		TypeDictionaryDicoAssociationMouvementParRouteMouvementParRouteCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_MOUVEMENT_PAR_ROUTE_MOUVEMENT_PAR_ROUTE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssociationMouvementParRouteMouvementParRouteCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_MOUVEMENT_PAR_ROUTE_MOUVEMENT_PAR_ROUTE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeAssociation getAssocieCommeSujetMouvementParRoute() {
		return associeCommeSujetMouvementParRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeSujetMouvementParRoute(TypeAssociation newAssocieCommeSujetMouvementParRoute, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeSujetMouvementParRoute = associeCommeSujetMouvementParRoute;
		associeCommeSujetMouvementParRoute = newAssocieCommeSujetMouvementParRoute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_MOUVEMENT_PAR_ROUTE_MOUVEMENT_PAR_ROUTE__ASSOCIE_COMME_SUJET_MOUVEMENT_PAR_ROUTE, oldAssocieCommeSujetMouvementParRoute, newAssocieCommeSujetMouvementParRoute);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeSujetMouvementParRoute(TypeAssociation newAssocieCommeSujetMouvementParRoute) {
		if (newAssocieCommeSujetMouvementParRoute != associeCommeSujetMouvementParRoute) {
			NotificationChain msgs = null;
			if (associeCommeSujetMouvementParRoute != null)
				msgs = ((InternalEObject)associeCommeSujetMouvementParRoute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_MOUVEMENT_PAR_ROUTE_MOUVEMENT_PAR_ROUTE__ASSOCIE_COMME_SUJET_MOUVEMENT_PAR_ROUTE, null, msgs);
			if (newAssocieCommeSujetMouvementParRoute != null)
				msgs = ((InternalEObject)newAssocieCommeSujetMouvementParRoute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_MOUVEMENT_PAR_ROUTE_MOUVEMENT_PAR_ROUTE__ASSOCIE_COMME_SUJET_MOUVEMENT_PAR_ROUTE, null, msgs);
			msgs = basicSetAssocieCommeSujetMouvementParRoute(newAssocieCommeSujetMouvementParRoute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_MOUVEMENT_PAR_ROUTE_MOUVEMENT_PAR_ROUTE__ASSOCIE_COMME_SUJET_MOUVEMENT_PAR_ROUTE, newAssocieCommeSujetMouvementParRoute, newAssocieCommeSujetMouvementParRoute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeObjetMouvementParRoute() {
		return associeCommeObjetMouvementParRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeObjetMouvementParRoute(TypeAssociation newAssocieCommeObjetMouvementParRoute, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeObjetMouvementParRoute = associeCommeObjetMouvementParRoute;
		associeCommeObjetMouvementParRoute = newAssocieCommeObjetMouvementParRoute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_MOUVEMENT_PAR_ROUTE_MOUVEMENT_PAR_ROUTE__ASSOCIE_COMME_OBJET_MOUVEMENT_PAR_ROUTE, oldAssocieCommeObjetMouvementParRoute, newAssocieCommeObjetMouvementParRoute);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeObjetMouvementParRoute(TypeAssociation newAssocieCommeObjetMouvementParRoute) {
		if (newAssocieCommeObjetMouvementParRoute != associeCommeObjetMouvementParRoute) {
			NotificationChain msgs = null;
			if (associeCommeObjetMouvementParRoute != null)
				msgs = ((InternalEObject)associeCommeObjetMouvementParRoute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_MOUVEMENT_PAR_ROUTE_MOUVEMENT_PAR_ROUTE__ASSOCIE_COMME_OBJET_MOUVEMENT_PAR_ROUTE, null, msgs);
			if (newAssocieCommeObjetMouvementParRoute != null)
				msgs = ((InternalEObject)newAssocieCommeObjetMouvementParRoute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_MOUVEMENT_PAR_ROUTE_MOUVEMENT_PAR_ROUTE__ASSOCIE_COMME_OBJET_MOUVEMENT_PAR_ROUTE, null, msgs);
			msgs = basicSetAssocieCommeObjetMouvementParRoute(newAssocieCommeObjetMouvementParRoute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_MOUVEMENT_PAR_ROUTE_MOUVEMENT_PAR_ROUTE__ASSOCIE_COMME_OBJET_MOUVEMENT_PAR_ROUTE, newAssocieCommeObjetMouvementParRoute, newAssocieCommeObjetMouvementParRoute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_MOUVEMENT_PAR_ROUTE_MOUVEMENT_PAR_ROUTE__ASSOCIE_COMME_SUJET_MOUVEMENT_PAR_ROUTE:
				return basicSetAssocieCommeSujetMouvementParRoute(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_MOUVEMENT_PAR_ROUTE_MOUVEMENT_PAR_ROUTE__ASSOCIE_COMME_OBJET_MOUVEMENT_PAR_ROUTE:
				return basicSetAssocieCommeObjetMouvementParRoute(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_MOUVEMENT_PAR_ROUTE_MOUVEMENT_PAR_ROUTE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_MOUVEMENT_PAR_ROUTE_MOUVEMENT_PAR_ROUTE__ASSOCIE_COMME_SUJET_MOUVEMENT_PAR_ROUTE:
				return getAssocieCommeSujetMouvementParRoute();
			case SchemaPackage.TYPE_ASSOCIATION_MOUVEMENT_PAR_ROUTE_MOUVEMENT_PAR_ROUTE__ASSOCIE_COMME_OBJET_MOUVEMENT_PAR_ROUTE:
				return getAssocieCommeObjetMouvementParRoute();
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
			case SchemaPackage.TYPE_ASSOCIATION_MOUVEMENT_PAR_ROUTE_MOUVEMENT_PAR_ROUTE__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationMouvementParRouteMouvementParRouteCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_MOUVEMENT_PAR_ROUTE_MOUVEMENT_PAR_ROUTE__ASSOCIE_COMME_SUJET_MOUVEMENT_PAR_ROUTE:
				setAssocieCommeSujetMouvementParRoute((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_MOUVEMENT_PAR_ROUTE_MOUVEMENT_PAR_ROUTE__ASSOCIE_COMME_OBJET_MOUVEMENT_PAR_ROUTE:
				setAssocieCommeObjetMouvementParRoute((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_MOUVEMENT_PAR_ROUTE_MOUVEMENT_PAR_ROUTE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_MOUVEMENT_PAR_ROUTE_MOUVEMENT_PAR_ROUTE__ASSOCIE_COMME_SUJET_MOUVEMENT_PAR_ROUTE:
				setAssocieCommeSujetMouvementParRoute((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_MOUVEMENT_PAR_ROUTE_MOUVEMENT_PAR_ROUTE__ASSOCIE_COMME_OBJET_MOUVEMENT_PAR_ROUTE:
				setAssocieCommeObjetMouvementParRoute((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_MOUVEMENT_PAR_ROUTE_MOUVEMENT_PAR_ROUTE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_MOUVEMENT_PAR_ROUTE_MOUVEMENT_PAR_ROUTE__ASSOCIE_COMME_SUJET_MOUVEMENT_PAR_ROUTE:
				return associeCommeSujetMouvementParRoute != null;
			case SchemaPackage.TYPE_ASSOCIATION_MOUVEMENT_PAR_ROUTE_MOUVEMENT_PAR_ROUTE__ASSOCIE_COMME_OBJET_MOUVEMENT_PAR_ROUTE:
				return associeCommeObjetMouvementParRoute != null;
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

} //TypeAssociationMouvementParRouteMouvementParRouteImpl
