/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssocContexteInstanceObjet;
import mpia.schema.TypeDictionaryDicoAssocContexteInstanceObjetCategorie;
import mpia.schema.TypeEtatAssociation;

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
 * An implementation of the model object '<em><b>Type Assoc Contexte Instance Objet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssocContexteInstanceObjetImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssocContexteInstanceObjetImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssocContexteInstanceObjetImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssocContexteInstanceObjetImpl#getAPourEtatEtatAssociation <em>APour Etat Etat Association</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssocContexteInstanceObjetImpl#getAssocieCommeInstanceObjetInstanceObjet <em>Associe Comme Instance Objet Instance Objet</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssocContexteInstanceObjetImpl#getAssocieCommeContexteContexte <em>Associe Comme Contexte Contexte</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssocContexteInstanceObjetImpl extends EObjectImpl implements TypeAssocContexteInstanceObjet {
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
	protected static final TypeDictionaryDicoAssocContexteInstanceObjetCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssocContexteInstanceObjetCategorie.INCLDE;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssocContexteInstanceObjetCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The cached value of the '{@link #getAPourEtatEtatAssociation() <em>APour Etat Etat Association</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourEtatEtatAssociation()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeEtatAssociation> aPourEtatEtatAssociation;

	/**
	 * The cached value of the '{@link #getAssocieCommeInstanceObjetInstanceObjet() <em>Associe Comme Instance Objet Instance Objet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeInstanceObjetInstanceObjet()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeInstanceObjetInstanceObjet;

	/**
	 * The cached value of the '{@link #getAssocieCommeContexteContexte() <em>Associe Comme Contexte Contexte</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeContexteContexte()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeContexteContexte;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssocContexteInstanceObjetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssocContexteInstanceObjet();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_CONTEXTE_INSTANCE_OBJET__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_CONTEXTE_INSTANCE_OBJET__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssocContexteInstanceObjetCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssocContexteInstanceObjetCategorie newCategorie) {
		TypeDictionaryDicoAssocContexteInstanceObjetCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_CONTEXTE_INSTANCE_OBJET__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssocContexteInstanceObjetCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOC_CONTEXTE_INSTANCE_OBJET__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public EList<TypeEtatAssociation> getAPourEtatEtatAssociation() {
		if (aPourEtatEtatAssociation == null) {
			aPourEtatEtatAssociation = new EObjectContainmentEList<TypeEtatAssociation>(TypeEtatAssociation.class, this, SchemaPackage.TYPE_ASSOC_CONTEXTE_INSTANCE_OBJET__APOUR_ETAT_ETAT_ASSOCIATION);
		}
		return aPourEtatEtatAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeInstanceObjetInstanceObjet() {
		return associeCommeInstanceObjetInstanceObjet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeInstanceObjetInstanceObjet(TypeAssociation newAssocieCommeInstanceObjetInstanceObjet, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeInstanceObjetInstanceObjet = associeCommeInstanceObjetInstanceObjet;
		associeCommeInstanceObjetInstanceObjet = newAssocieCommeInstanceObjetInstanceObjet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_CONTEXTE_INSTANCE_OBJET__ASSOCIE_COMME_INSTANCE_OBJET_INSTANCE_OBJET, oldAssocieCommeInstanceObjetInstanceObjet, newAssocieCommeInstanceObjetInstanceObjet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeInstanceObjetInstanceObjet(TypeAssociation newAssocieCommeInstanceObjetInstanceObjet) {
		if (newAssocieCommeInstanceObjetInstanceObjet != associeCommeInstanceObjetInstanceObjet) {
			NotificationChain msgs = null;
			if (associeCommeInstanceObjetInstanceObjet != null)
				msgs = ((InternalEObject)associeCommeInstanceObjetInstanceObjet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOC_CONTEXTE_INSTANCE_OBJET__ASSOCIE_COMME_INSTANCE_OBJET_INSTANCE_OBJET, null, msgs);
			if (newAssocieCommeInstanceObjetInstanceObjet != null)
				msgs = ((InternalEObject)newAssocieCommeInstanceObjetInstanceObjet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOC_CONTEXTE_INSTANCE_OBJET__ASSOCIE_COMME_INSTANCE_OBJET_INSTANCE_OBJET, null, msgs);
			msgs = basicSetAssocieCommeInstanceObjetInstanceObjet(newAssocieCommeInstanceObjetInstanceObjet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_CONTEXTE_INSTANCE_OBJET__ASSOCIE_COMME_INSTANCE_OBJET_INSTANCE_OBJET, newAssocieCommeInstanceObjetInstanceObjet, newAssocieCommeInstanceObjetInstanceObjet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeContexteContexte() {
		return associeCommeContexteContexte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeContexteContexte(TypeAssociation newAssocieCommeContexteContexte, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeContexteContexte = associeCommeContexteContexte;
		associeCommeContexteContexte = newAssocieCommeContexteContexte;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_CONTEXTE_INSTANCE_OBJET__ASSOCIE_COMME_CONTEXTE_CONTEXTE, oldAssocieCommeContexteContexte, newAssocieCommeContexteContexte);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeContexteContexte(TypeAssociation newAssocieCommeContexteContexte) {
		if (newAssocieCommeContexteContexte != associeCommeContexteContexte) {
			NotificationChain msgs = null;
			if (associeCommeContexteContexte != null)
				msgs = ((InternalEObject)associeCommeContexteContexte).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOC_CONTEXTE_INSTANCE_OBJET__ASSOCIE_COMME_CONTEXTE_CONTEXTE, null, msgs);
			if (newAssocieCommeContexteContexte != null)
				msgs = ((InternalEObject)newAssocieCommeContexteContexte).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOC_CONTEXTE_INSTANCE_OBJET__ASSOCIE_COMME_CONTEXTE_CONTEXTE, null, msgs);
			msgs = basicSetAssocieCommeContexteContexte(newAssocieCommeContexteContexte, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_CONTEXTE_INSTANCE_OBJET__ASSOCIE_COMME_CONTEXTE_CONTEXTE, newAssocieCommeContexteContexte, newAssocieCommeContexteContexte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_INSTANCE_OBJET__APOUR_ETAT_ETAT_ASSOCIATION:
				return ((InternalEList<?>)getAPourEtatEtatAssociation()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_INSTANCE_OBJET__ASSOCIE_COMME_INSTANCE_OBJET_INSTANCE_OBJET:
				return basicSetAssocieCommeInstanceObjetInstanceObjet(null, msgs);
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_INSTANCE_OBJET__ASSOCIE_COMME_CONTEXTE_CONTEXTE:
				return basicSetAssocieCommeContexteContexte(null, msgs);
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
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_INSTANCE_OBJET__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_INSTANCE_OBJET__CE:
				return getCE();
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_INSTANCE_OBJET__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_INSTANCE_OBJET__APOUR_ETAT_ETAT_ASSOCIATION:
				return getAPourEtatEtatAssociation();
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_INSTANCE_OBJET__ASSOCIE_COMME_INSTANCE_OBJET_INSTANCE_OBJET:
				return getAssocieCommeInstanceObjetInstanceObjet();
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_INSTANCE_OBJET__ASSOCIE_COMME_CONTEXTE_CONTEXTE:
				return getAssocieCommeContexteContexte();
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
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_INSTANCE_OBJET__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_INSTANCE_OBJET__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_INSTANCE_OBJET__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssocContexteInstanceObjetCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_INSTANCE_OBJET__APOUR_ETAT_ETAT_ASSOCIATION:
				getAPourEtatEtatAssociation().clear();
				getAPourEtatEtatAssociation().addAll((Collection<? extends TypeEtatAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_INSTANCE_OBJET__ASSOCIE_COMME_INSTANCE_OBJET_INSTANCE_OBJET:
				setAssocieCommeInstanceObjetInstanceObjet((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_INSTANCE_OBJET__ASSOCIE_COMME_CONTEXTE_CONTEXTE:
				setAssocieCommeContexteContexte((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_INSTANCE_OBJET__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_INSTANCE_OBJET__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_INSTANCE_OBJET__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_INSTANCE_OBJET__APOUR_ETAT_ETAT_ASSOCIATION:
				getAPourEtatEtatAssociation().clear();
				return;
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_INSTANCE_OBJET__ASSOCIE_COMME_INSTANCE_OBJET_INSTANCE_OBJET:
				setAssocieCommeInstanceObjetInstanceObjet((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_INSTANCE_OBJET__ASSOCIE_COMME_CONTEXTE_CONTEXTE:
				setAssocieCommeContexteContexte((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_INSTANCE_OBJET__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_INSTANCE_OBJET__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_INSTANCE_OBJET__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_INSTANCE_OBJET__APOUR_ETAT_ETAT_ASSOCIATION:
				return aPourEtatEtatAssociation != null && !aPourEtatEtatAssociation.isEmpty();
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_INSTANCE_OBJET__ASSOCIE_COMME_INSTANCE_OBJET_INSTANCE_OBJET:
				return associeCommeInstanceObjetInstanceObjet != null;
			case SchemaPackage.TYPE_ASSOC_CONTEXTE_INSTANCE_OBJET__ASSOCIE_COMME_CONTEXTE_CONTEXTE:
				return associeCommeContexteContexte != null;
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

} //TypeAssocContexteInstanceObjetImpl
