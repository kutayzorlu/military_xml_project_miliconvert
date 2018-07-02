/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationHoraireManoeuvre;
import mpia.schema.TypeDictionaryDicoAssociationHoraireManoeuvreCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Horaire Manoeuvre</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationHoraireManoeuvreImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationHoraireManoeuvreImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationHoraireManoeuvreImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationHoraireManoeuvreImpl#getAssocieCommeSujetHoraireManoeuvre <em>Associe Comme Sujet Horaire Manoeuvre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationHoraireManoeuvreImpl#getAssocieCommeObjetHoraireManoeuvre <em>Associe Comme Objet Horaire Manoeuvre</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationHoraireManoeuvreImpl extends EObjectImpl implements TypeAssociationHoraireManoeuvre {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAssociationHoraireManoeuvreCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssociationHoraireManoeuvreCategorie.SAEAST;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationHoraireManoeuvreCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

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
	 * The cached value of the '{@link #getAssocieCommeSujetHoraireManoeuvre() <em>Associe Comme Sujet Horaire Manoeuvre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeSujetHoraireManoeuvre()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeSujetHoraireManoeuvre;

	/**
	 * The cached value of the '{@link #getAssocieCommeObjetHoraireManoeuvre() <em>Associe Comme Objet Horaire Manoeuvre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeObjetHoraireManoeuvre()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeObjetHoraireManoeuvre;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationHoraireManoeuvreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationHoraireManoeuvre();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssociationHoraireManoeuvreCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssociationHoraireManoeuvreCategorie newCategorie) {
		TypeDictionaryDicoAssociationHoraireManoeuvreCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_HORAIRE_MANOEUVRE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssociationHoraireManoeuvreCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_HORAIRE_MANOEUVRE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_HORAIRE_MANOEUVRE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_HORAIRE_MANOEUVRE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeSujetHoraireManoeuvre() {
		return associeCommeSujetHoraireManoeuvre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeSujetHoraireManoeuvre(TypeAssociation newAssocieCommeSujetHoraireManoeuvre, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeSujetHoraireManoeuvre = associeCommeSujetHoraireManoeuvre;
		associeCommeSujetHoraireManoeuvre = newAssocieCommeSujetHoraireManoeuvre;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_HORAIRE_MANOEUVRE__ASSOCIE_COMME_SUJET_HORAIRE_MANOEUVRE, oldAssocieCommeSujetHoraireManoeuvre, newAssocieCommeSujetHoraireManoeuvre);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeSujetHoraireManoeuvre(TypeAssociation newAssocieCommeSujetHoraireManoeuvre) {
		if (newAssocieCommeSujetHoraireManoeuvre != associeCommeSujetHoraireManoeuvre) {
			NotificationChain msgs = null;
			if (associeCommeSujetHoraireManoeuvre != null)
				msgs = ((InternalEObject)associeCommeSujetHoraireManoeuvre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_HORAIRE_MANOEUVRE__ASSOCIE_COMME_SUJET_HORAIRE_MANOEUVRE, null, msgs);
			if (newAssocieCommeSujetHoraireManoeuvre != null)
				msgs = ((InternalEObject)newAssocieCommeSujetHoraireManoeuvre).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_HORAIRE_MANOEUVRE__ASSOCIE_COMME_SUJET_HORAIRE_MANOEUVRE, null, msgs);
			msgs = basicSetAssocieCommeSujetHoraireManoeuvre(newAssocieCommeSujetHoraireManoeuvre, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_HORAIRE_MANOEUVRE__ASSOCIE_COMME_SUJET_HORAIRE_MANOEUVRE, newAssocieCommeSujetHoraireManoeuvre, newAssocieCommeSujetHoraireManoeuvre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeObjetHoraireManoeuvre() {
		return associeCommeObjetHoraireManoeuvre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeObjetHoraireManoeuvre(TypeAssociation newAssocieCommeObjetHoraireManoeuvre, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeObjetHoraireManoeuvre = associeCommeObjetHoraireManoeuvre;
		associeCommeObjetHoraireManoeuvre = newAssocieCommeObjetHoraireManoeuvre;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_HORAIRE_MANOEUVRE__ASSOCIE_COMME_OBJET_HORAIRE_MANOEUVRE, oldAssocieCommeObjetHoraireManoeuvre, newAssocieCommeObjetHoraireManoeuvre);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeObjetHoraireManoeuvre(TypeAssociation newAssocieCommeObjetHoraireManoeuvre) {
		if (newAssocieCommeObjetHoraireManoeuvre != associeCommeObjetHoraireManoeuvre) {
			NotificationChain msgs = null;
			if (associeCommeObjetHoraireManoeuvre != null)
				msgs = ((InternalEObject)associeCommeObjetHoraireManoeuvre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_HORAIRE_MANOEUVRE__ASSOCIE_COMME_OBJET_HORAIRE_MANOEUVRE, null, msgs);
			if (newAssocieCommeObjetHoraireManoeuvre != null)
				msgs = ((InternalEObject)newAssocieCommeObjetHoraireManoeuvre).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_HORAIRE_MANOEUVRE__ASSOCIE_COMME_OBJET_HORAIRE_MANOEUVRE, null, msgs);
			msgs = basicSetAssocieCommeObjetHoraireManoeuvre(newAssocieCommeObjetHoraireManoeuvre, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_HORAIRE_MANOEUVRE__ASSOCIE_COMME_OBJET_HORAIRE_MANOEUVRE, newAssocieCommeObjetHoraireManoeuvre, newAssocieCommeObjetHoraireManoeuvre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_HORAIRE_MANOEUVRE__ASSOCIE_COMME_SUJET_HORAIRE_MANOEUVRE:
				return basicSetAssocieCommeSujetHoraireManoeuvre(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_HORAIRE_MANOEUVRE__ASSOCIE_COMME_OBJET_HORAIRE_MANOEUVRE:
				return basicSetAssocieCommeObjetHoraireManoeuvre(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_HORAIRE_MANOEUVRE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_HORAIRE_MANOEUVRE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ASSOCIATION_HORAIRE_MANOEUVRE__CE:
				return getCE();
			case SchemaPackage.TYPE_ASSOCIATION_HORAIRE_MANOEUVRE__ASSOCIE_COMME_SUJET_HORAIRE_MANOEUVRE:
				return getAssocieCommeSujetHoraireManoeuvre();
			case SchemaPackage.TYPE_ASSOCIATION_HORAIRE_MANOEUVRE__ASSOCIE_COMME_OBJET_HORAIRE_MANOEUVRE:
				return getAssocieCommeObjetHoraireManoeuvre();
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
			case SchemaPackage.TYPE_ASSOCIATION_HORAIRE_MANOEUVRE__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationHoraireManoeuvreCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_HORAIRE_MANOEUVRE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_HORAIRE_MANOEUVRE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_HORAIRE_MANOEUVRE__ASSOCIE_COMME_SUJET_HORAIRE_MANOEUVRE:
				setAssocieCommeSujetHoraireManoeuvre((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_HORAIRE_MANOEUVRE__ASSOCIE_COMME_OBJET_HORAIRE_MANOEUVRE:
				setAssocieCommeObjetHoraireManoeuvre((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_HORAIRE_MANOEUVRE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_HORAIRE_MANOEUVRE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_HORAIRE_MANOEUVRE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_HORAIRE_MANOEUVRE__ASSOCIE_COMME_SUJET_HORAIRE_MANOEUVRE:
				setAssocieCommeSujetHoraireManoeuvre((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_HORAIRE_MANOEUVRE__ASSOCIE_COMME_OBJET_HORAIRE_MANOEUVRE:
				setAssocieCommeObjetHoraireManoeuvre((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_HORAIRE_MANOEUVRE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_HORAIRE_MANOEUVRE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ASSOCIATION_HORAIRE_MANOEUVRE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ASSOCIATION_HORAIRE_MANOEUVRE__ASSOCIE_COMME_SUJET_HORAIRE_MANOEUVRE:
				return associeCommeSujetHoraireManoeuvre != null;
			case SchemaPackage.TYPE_ASSOCIATION_HORAIRE_MANOEUVRE__ASSOCIE_COMME_OBJET_HORAIRE_MANOEUVRE:
				return associeCommeObjetHoraireManoeuvre != null;
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
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeAssociationHoraireManoeuvreImpl
