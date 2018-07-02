/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeDuree;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationTemporelleActivite;
import mpia.schema.TypeDictionaryDicoAssociationTemporelleCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Temporelle Activite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationTemporelleActiviteImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationTemporelleActiviteImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationTemporelleActiviteImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationTemporelleActiviteImpl#getDureeRelative <em>Duree Relative</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationTemporelleActiviteImpl#getAssocieCommeSujetActivite <em>Associe Comme Sujet Activite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationTemporelleActiviteImpl#getAssocieCommeObjetActivite <em>Associe Comme Objet Activite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationTemporelleActiviteImpl extends EObjectImpl implements TypeAssociationTemporelleActivite {
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
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAssociationTemporelleCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssociationTemporelleCategorie.SAEAST;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationTemporelleCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The cached value of the '{@link #getDureeRelative() <em>Duree Relative</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDureeRelative()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree dureeRelative;

	/**
	 * The cached value of the '{@link #getAssocieCommeSujetActivite() <em>Associe Comme Sujet Activite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeSujetActivite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeSujetActivite;

	/**
	 * The cached value of the '{@link #getAssocieCommeObjetActivite() <em>Associe Comme Objet Activite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeObjetActivite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeObjetActivite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationTemporelleActiviteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationTemporelleActivite();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_TEMPORELLE_ACTIVITE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_TEMPORELLE_ACTIVITE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssociationTemporelleCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssociationTemporelleCategorie newCategorie) {
		TypeDictionaryDicoAssociationTemporelleCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_TEMPORELLE_ACTIVITE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssociationTemporelleCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_TEMPORELLE_ACTIVITE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeDataTypeDuree getDureeRelative() {
		return dureeRelative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDureeRelative(TypeDataTypeDuree newDureeRelative, NotificationChain msgs) {
		TypeDataTypeDuree oldDureeRelative = dureeRelative;
		dureeRelative = newDureeRelative;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_TEMPORELLE_ACTIVITE__DUREE_RELATIVE, oldDureeRelative, newDureeRelative);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDureeRelative(TypeDataTypeDuree newDureeRelative) {
		if (newDureeRelative != dureeRelative) {
			NotificationChain msgs = null;
			if (dureeRelative != null)
				msgs = ((InternalEObject)dureeRelative).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_TEMPORELLE_ACTIVITE__DUREE_RELATIVE, null, msgs);
			if (newDureeRelative != null)
				msgs = ((InternalEObject)newDureeRelative).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_TEMPORELLE_ACTIVITE__DUREE_RELATIVE, null, msgs);
			msgs = basicSetDureeRelative(newDureeRelative, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_TEMPORELLE_ACTIVITE__DUREE_RELATIVE, newDureeRelative, newDureeRelative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeSujetActivite() {
		return associeCommeSujetActivite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeSujetActivite(TypeAssociation newAssocieCommeSujetActivite, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeSujetActivite = associeCommeSujetActivite;
		associeCommeSujetActivite = newAssocieCommeSujetActivite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_TEMPORELLE_ACTIVITE__ASSOCIE_COMME_SUJET_ACTIVITE, oldAssocieCommeSujetActivite, newAssocieCommeSujetActivite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeSujetActivite(TypeAssociation newAssocieCommeSujetActivite) {
		if (newAssocieCommeSujetActivite != associeCommeSujetActivite) {
			NotificationChain msgs = null;
			if (associeCommeSujetActivite != null)
				msgs = ((InternalEObject)associeCommeSujetActivite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_TEMPORELLE_ACTIVITE__ASSOCIE_COMME_SUJET_ACTIVITE, null, msgs);
			if (newAssocieCommeSujetActivite != null)
				msgs = ((InternalEObject)newAssocieCommeSujetActivite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_TEMPORELLE_ACTIVITE__ASSOCIE_COMME_SUJET_ACTIVITE, null, msgs);
			msgs = basicSetAssocieCommeSujetActivite(newAssocieCommeSujetActivite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_TEMPORELLE_ACTIVITE__ASSOCIE_COMME_SUJET_ACTIVITE, newAssocieCommeSujetActivite, newAssocieCommeSujetActivite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeObjetActivite() {
		return associeCommeObjetActivite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeObjetActivite(TypeAssociation newAssocieCommeObjetActivite, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeObjetActivite = associeCommeObjetActivite;
		associeCommeObjetActivite = newAssocieCommeObjetActivite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_TEMPORELLE_ACTIVITE__ASSOCIE_COMME_OBJET_ACTIVITE, oldAssocieCommeObjetActivite, newAssocieCommeObjetActivite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeObjetActivite(TypeAssociation newAssocieCommeObjetActivite) {
		if (newAssocieCommeObjetActivite != associeCommeObjetActivite) {
			NotificationChain msgs = null;
			if (associeCommeObjetActivite != null)
				msgs = ((InternalEObject)associeCommeObjetActivite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_TEMPORELLE_ACTIVITE__ASSOCIE_COMME_OBJET_ACTIVITE, null, msgs);
			if (newAssocieCommeObjetActivite != null)
				msgs = ((InternalEObject)newAssocieCommeObjetActivite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_TEMPORELLE_ACTIVITE__ASSOCIE_COMME_OBJET_ACTIVITE, null, msgs);
			msgs = basicSetAssocieCommeObjetActivite(newAssocieCommeObjetActivite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_TEMPORELLE_ACTIVITE__ASSOCIE_COMME_OBJET_ACTIVITE, newAssocieCommeObjetActivite, newAssocieCommeObjetActivite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_TEMPORELLE_ACTIVITE__DUREE_RELATIVE:
				return basicSetDureeRelative(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_TEMPORELLE_ACTIVITE__ASSOCIE_COMME_SUJET_ACTIVITE:
				return basicSetAssocieCommeSujetActivite(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_TEMPORELLE_ACTIVITE__ASSOCIE_COMME_OBJET_ACTIVITE:
				return basicSetAssocieCommeObjetActivite(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_TEMPORELLE_ACTIVITE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ASSOCIATION_TEMPORELLE_ACTIVITE__CE:
				return getCE();
			case SchemaPackage.TYPE_ASSOCIATION_TEMPORELLE_ACTIVITE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_TEMPORELLE_ACTIVITE__DUREE_RELATIVE:
				return getDureeRelative();
			case SchemaPackage.TYPE_ASSOCIATION_TEMPORELLE_ACTIVITE__ASSOCIE_COMME_SUJET_ACTIVITE:
				return getAssocieCommeSujetActivite();
			case SchemaPackage.TYPE_ASSOCIATION_TEMPORELLE_ACTIVITE__ASSOCIE_COMME_OBJET_ACTIVITE:
				return getAssocieCommeObjetActivite();
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
			case SchemaPackage.TYPE_ASSOCIATION_TEMPORELLE_ACTIVITE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_TEMPORELLE_ACTIVITE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_TEMPORELLE_ACTIVITE__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationTemporelleCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_TEMPORELLE_ACTIVITE__DUREE_RELATIVE:
				setDureeRelative((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_TEMPORELLE_ACTIVITE__ASSOCIE_COMME_SUJET_ACTIVITE:
				setAssocieCommeSujetActivite((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_TEMPORELLE_ACTIVITE__ASSOCIE_COMME_OBJET_ACTIVITE:
				setAssocieCommeObjetActivite((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_TEMPORELLE_ACTIVITE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_TEMPORELLE_ACTIVITE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_TEMPORELLE_ACTIVITE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_TEMPORELLE_ACTIVITE__DUREE_RELATIVE:
				setDureeRelative((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_TEMPORELLE_ACTIVITE__ASSOCIE_COMME_SUJET_ACTIVITE:
				setAssocieCommeSujetActivite((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_TEMPORELLE_ACTIVITE__ASSOCIE_COMME_OBJET_ACTIVITE:
				setAssocieCommeObjetActivite((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_TEMPORELLE_ACTIVITE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ASSOCIATION_TEMPORELLE_ACTIVITE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ASSOCIATION_TEMPORELLE_ACTIVITE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_TEMPORELLE_ACTIVITE__DUREE_RELATIVE:
				return dureeRelative != null;
			case SchemaPackage.TYPE_ASSOCIATION_TEMPORELLE_ACTIVITE__ASSOCIE_COMME_SUJET_ACTIVITE:
				return associeCommeSujetActivite != null;
			case SchemaPackage.TYPE_ASSOCIATION_TEMPORELLE_ACTIVITE__ASSOCIE_COMME_OBJET_ACTIVITE:
				return associeCommeObjetActivite != null;
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
		result.append(" (cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(", categorie: ");
		if (categorieESet) result.append(categorie); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeAssociationTemporelleActiviteImpl
