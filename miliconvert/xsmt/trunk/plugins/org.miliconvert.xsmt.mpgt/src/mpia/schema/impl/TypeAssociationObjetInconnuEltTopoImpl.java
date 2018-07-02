/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationObjetInconnuEltTopo;
import mpia.schema.TypeDictionaryDicoAssociationObjetInconnuEltTopoCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Objet Inconnu Elt Topo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationObjetInconnuEltTopoImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationObjetInconnuEltTopoImpl#getAPourSujetObjetInconnu <em>APour Sujet Objet Inconnu</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationObjetInconnuEltTopoImpl#getAPourObjetElementTopographie <em>APour Objet Element Topographie</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationObjetInconnuEltTopoImpl extends TypeAssociationInstanceObjetInstanceObjetImpl implements TypeAssociationObjetInconnuEltTopo {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAssociationObjetInconnuEltTopoCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssociationObjetInconnuEltTopoCategorie.ISSITU;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationObjetInconnuEltTopoCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The cached value of the '{@link #getAPourSujetObjetInconnu() <em>APour Sujet Objet Inconnu</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourSujetObjetInconnu()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourSujetObjetInconnu;

	/**
	 * The cached value of the '{@link #getAPourObjetElementTopographie() <em>APour Objet Element Topographie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourObjetElementTopographie()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourObjetElementTopographie;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationObjetInconnuEltTopoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationObjetInconnuEltTopo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssociationObjetInconnuEltTopoCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssociationObjetInconnuEltTopoCategorie newCategorie) {
		TypeDictionaryDicoAssociationObjetInconnuEltTopoCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_OBJET_INCONNU_ELT_TOPO__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssociationObjetInconnuEltTopoCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_OBJET_INCONNU_ELT_TOPO__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeAssociation getAPourSujetObjetInconnu() {
		return aPourSujetObjetInconnu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourSujetObjetInconnu(TypeAssociation newAPourSujetObjetInconnu, NotificationChain msgs) {
		TypeAssociation oldAPourSujetObjetInconnu = aPourSujetObjetInconnu;
		aPourSujetObjetInconnu = newAPourSujetObjetInconnu;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_OBJET_INCONNU_ELT_TOPO__APOUR_SUJET_OBJET_INCONNU, oldAPourSujetObjetInconnu, newAPourSujetObjetInconnu);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourSujetObjetInconnu(TypeAssociation newAPourSujetObjetInconnu) {
		if (newAPourSujetObjetInconnu != aPourSujetObjetInconnu) {
			NotificationChain msgs = null;
			if (aPourSujetObjetInconnu != null)
				msgs = ((InternalEObject)aPourSujetObjetInconnu).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_OBJET_INCONNU_ELT_TOPO__APOUR_SUJET_OBJET_INCONNU, null, msgs);
			if (newAPourSujetObjetInconnu != null)
				msgs = ((InternalEObject)newAPourSujetObjetInconnu).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_OBJET_INCONNU_ELT_TOPO__APOUR_SUJET_OBJET_INCONNU, null, msgs);
			msgs = basicSetAPourSujetObjetInconnu(newAPourSujetObjetInconnu, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_OBJET_INCONNU_ELT_TOPO__APOUR_SUJET_OBJET_INCONNU, newAPourSujetObjetInconnu, newAPourSujetObjetInconnu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourObjetElementTopographie() {
		return aPourObjetElementTopographie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourObjetElementTopographie(TypeAssociation newAPourObjetElementTopographie, NotificationChain msgs) {
		TypeAssociation oldAPourObjetElementTopographie = aPourObjetElementTopographie;
		aPourObjetElementTopographie = newAPourObjetElementTopographie;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_OBJET_INCONNU_ELT_TOPO__APOUR_OBJET_ELEMENT_TOPOGRAPHIE, oldAPourObjetElementTopographie, newAPourObjetElementTopographie);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourObjetElementTopographie(TypeAssociation newAPourObjetElementTopographie) {
		if (newAPourObjetElementTopographie != aPourObjetElementTopographie) {
			NotificationChain msgs = null;
			if (aPourObjetElementTopographie != null)
				msgs = ((InternalEObject)aPourObjetElementTopographie).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_OBJET_INCONNU_ELT_TOPO__APOUR_OBJET_ELEMENT_TOPOGRAPHIE, null, msgs);
			if (newAPourObjetElementTopographie != null)
				msgs = ((InternalEObject)newAPourObjetElementTopographie).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_OBJET_INCONNU_ELT_TOPO__APOUR_OBJET_ELEMENT_TOPOGRAPHIE, null, msgs);
			msgs = basicSetAPourObjetElementTopographie(newAPourObjetElementTopographie, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_OBJET_INCONNU_ELT_TOPO__APOUR_OBJET_ELEMENT_TOPOGRAPHIE, newAPourObjetElementTopographie, newAPourObjetElementTopographie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_OBJET_INCONNU_ELT_TOPO__APOUR_SUJET_OBJET_INCONNU:
				return basicSetAPourSujetObjetInconnu(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_OBJET_INCONNU_ELT_TOPO__APOUR_OBJET_ELEMENT_TOPOGRAPHIE:
				return basicSetAPourObjetElementTopographie(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_OBJET_INCONNU_ELT_TOPO__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_OBJET_INCONNU_ELT_TOPO__APOUR_SUJET_OBJET_INCONNU:
				return getAPourSujetObjetInconnu();
			case SchemaPackage.TYPE_ASSOCIATION_OBJET_INCONNU_ELT_TOPO__APOUR_OBJET_ELEMENT_TOPOGRAPHIE:
				return getAPourObjetElementTopographie();
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
			case SchemaPackage.TYPE_ASSOCIATION_OBJET_INCONNU_ELT_TOPO__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationObjetInconnuEltTopoCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_OBJET_INCONNU_ELT_TOPO__APOUR_SUJET_OBJET_INCONNU:
				setAPourSujetObjetInconnu((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_OBJET_INCONNU_ELT_TOPO__APOUR_OBJET_ELEMENT_TOPOGRAPHIE:
				setAPourObjetElementTopographie((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_OBJET_INCONNU_ELT_TOPO__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_OBJET_INCONNU_ELT_TOPO__APOUR_SUJET_OBJET_INCONNU:
				setAPourSujetObjetInconnu((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_OBJET_INCONNU_ELT_TOPO__APOUR_OBJET_ELEMENT_TOPOGRAPHIE:
				setAPourObjetElementTopographie((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_OBJET_INCONNU_ELT_TOPO__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_OBJET_INCONNU_ELT_TOPO__APOUR_SUJET_OBJET_INCONNU:
				return aPourSujetObjetInconnu != null;
			case SchemaPackage.TYPE_ASSOCIATION_OBJET_INCONNU_ELT_TOPO__APOUR_OBJET_ELEMENT_TOPOGRAPHIE:
				return aPourObjetElementTopographie != null;
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

} //TypeAssociationObjetInconnuEltTopoImpl
