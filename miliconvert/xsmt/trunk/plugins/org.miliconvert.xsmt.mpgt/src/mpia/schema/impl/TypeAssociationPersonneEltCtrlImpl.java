/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationPersonneEltCtrl;
import mpia.schema.TypeDictionaryDicoAssociationPersonneEltCtrlCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Personne Elt Ctrl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationPersonneEltCtrlImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationPersonneEltCtrlImpl#getAPourObjetElementControle <em>APour Objet Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationPersonneEltCtrlImpl#getAPourSujetPersonne <em>APour Sujet Personne</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationPersonneEltCtrlImpl extends TypeAssociationInstanceObjetInstanceObjetImpl implements TypeAssociationPersonneEltCtrl {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAssociationPersonneEltCtrlCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssociationPersonneEltCtrlCategorie.ISSITU;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationPersonneEltCtrlCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The cached value of the '{@link #getAPourObjetElementControle() <em>APour Objet Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourObjetElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourObjetElementControle;

	/**
	 * The cached value of the '{@link #getAPourSujetPersonne() <em>APour Sujet Personne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourSujetPersonne()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourSujetPersonne;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationPersonneEltCtrlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationPersonneEltCtrl();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssociationPersonneEltCtrlCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssociationPersonneEltCtrlCategorie newCategorie) {
		TypeDictionaryDicoAssociationPersonneEltCtrlCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PERSONNE_ELT_CTRL__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssociationPersonneEltCtrlCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_PERSONNE_ELT_CTRL__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeAssociation getAPourObjetElementControle() {
		return aPourObjetElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourObjetElementControle(TypeAssociation newAPourObjetElementControle, NotificationChain msgs) {
		TypeAssociation oldAPourObjetElementControle = aPourObjetElementControle;
		aPourObjetElementControle = newAPourObjetElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PERSONNE_ELT_CTRL__APOUR_OBJET_ELEMENT_CONTROLE, oldAPourObjetElementControle, newAPourObjetElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourObjetElementControle(TypeAssociation newAPourObjetElementControle) {
		if (newAPourObjetElementControle != aPourObjetElementControle) {
			NotificationChain msgs = null;
			if (aPourObjetElementControle != null)
				msgs = ((InternalEObject)aPourObjetElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_PERSONNE_ELT_CTRL__APOUR_OBJET_ELEMENT_CONTROLE, null, msgs);
			if (newAPourObjetElementControle != null)
				msgs = ((InternalEObject)newAPourObjetElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_PERSONNE_ELT_CTRL__APOUR_OBJET_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetAPourObjetElementControle(newAPourObjetElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PERSONNE_ELT_CTRL__APOUR_OBJET_ELEMENT_CONTROLE, newAPourObjetElementControle, newAPourObjetElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourSujetPersonne() {
		return aPourSujetPersonne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourSujetPersonne(TypeAssociation newAPourSujetPersonne, NotificationChain msgs) {
		TypeAssociation oldAPourSujetPersonne = aPourSujetPersonne;
		aPourSujetPersonne = newAPourSujetPersonne;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PERSONNE_ELT_CTRL__APOUR_SUJET_PERSONNE, oldAPourSujetPersonne, newAPourSujetPersonne);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourSujetPersonne(TypeAssociation newAPourSujetPersonne) {
		if (newAPourSujetPersonne != aPourSujetPersonne) {
			NotificationChain msgs = null;
			if (aPourSujetPersonne != null)
				msgs = ((InternalEObject)aPourSujetPersonne).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_PERSONNE_ELT_CTRL__APOUR_SUJET_PERSONNE, null, msgs);
			if (newAPourSujetPersonne != null)
				msgs = ((InternalEObject)newAPourSujetPersonne).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_PERSONNE_ELT_CTRL__APOUR_SUJET_PERSONNE, null, msgs);
			msgs = basicSetAPourSujetPersonne(newAPourSujetPersonne, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PERSONNE_ELT_CTRL__APOUR_SUJET_PERSONNE, newAPourSujetPersonne, newAPourSujetPersonne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_ELT_CTRL__APOUR_OBJET_ELEMENT_CONTROLE:
				return basicSetAPourObjetElementControle(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_ELT_CTRL__APOUR_SUJET_PERSONNE:
				return basicSetAPourSujetPersonne(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_ELT_CTRL__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_ELT_CTRL__APOUR_OBJET_ELEMENT_CONTROLE:
				return getAPourObjetElementControle();
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_ELT_CTRL__APOUR_SUJET_PERSONNE:
				return getAPourSujetPersonne();
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
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_ELT_CTRL__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationPersonneEltCtrlCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_ELT_CTRL__APOUR_OBJET_ELEMENT_CONTROLE:
				setAPourObjetElementControle((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_ELT_CTRL__APOUR_SUJET_PERSONNE:
				setAPourSujetPersonne((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_ELT_CTRL__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_ELT_CTRL__APOUR_OBJET_ELEMENT_CONTROLE:
				setAPourObjetElementControle((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_ELT_CTRL__APOUR_SUJET_PERSONNE:
				setAPourSujetPersonne((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_ELT_CTRL__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_ELT_CTRL__APOUR_OBJET_ELEMENT_CONTROLE:
				return aPourObjetElementControle != null;
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_ELT_CTRL__APOUR_SUJET_PERSONNE:
				return aPourSujetPersonne != null;
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

} //TypeAssociationPersonneEltCtrlImpl
