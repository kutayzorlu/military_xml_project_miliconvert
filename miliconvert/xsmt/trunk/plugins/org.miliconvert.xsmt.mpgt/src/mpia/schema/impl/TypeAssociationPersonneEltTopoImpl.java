/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationPersonneEltTopo;
import mpia.schema.TypeDictionaryDicoAssociationPersonneEltTopoCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Personne Elt Topo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationPersonneEltTopoImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationPersonneEltTopoImpl#getAPourSujetPersonne <em>APour Sujet Personne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationPersonneEltTopoImpl#getAPourObjetElementTopographie <em>APour Objet Element Topographie</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationPersonneEltTopoImpl extends TypeAssociationInstanceObjetInstanceObjetImpl implements TypeAssociationPersonneEltTopo {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAssociationPersonneEltTopoCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssociationPersonneEltTopoCategorie.ISSITU;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationPersonneEltTopoCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

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
	protected TypeAssociationPersonneEltTopoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationPersonneEltTopo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssociationPersonneEltTopoCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssociationPersonneEltTopoCategorie newCategorie) {
		TypeDictionaryDicoAssociationPersonneEltTopoCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PERSONNE_ELT_TOPO__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssociationPersonneEltTopoCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_PERSONNE_ELT_TOPO__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PERSONNE_ELT_TOPO__APOUR_SUJET_PERSONNE, oldAPourSujetPersonne, newAPourSujetPersonne);
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
				msgs = ((InternalEObject)aPourSujetPersonne).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_PERSONNE_ELT_TOPO__APOUR_SUJET_PERSONNE, null, msgs);
			if (newAPourSujetPersonne != null)
				msgs = ((InternalEObject)newAPourSujetPersonne).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_PERSONNE_ELT_TOPO__APOUR_SUJET_PERSONNE, null, msgs);
			msgs = basicSetAPourSujetPersonne(newAPourSujetPersonne, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PERSONNE_ELT_TOPO__APOUR_SUJET_PERSONNE, newAPourSujetPersonne, newAPourSujetPersonne));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PERSONNE_ELT_TOPO__APOUR_OBJET_ELEMENT_TOPOGRAPHIE, oldAPourObjetElementTopographie, newAPourObjetElementTopographie);
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
				msgs = ((InternalEObject)aPourObjetElementTopographie).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_PERSONNE_ELT_TOPO__APOUR_OBJET_ELEMENT_TOPOGRAPHIE, null, msgs);
			if (newAPourObjetElementTopographie != null)
				msgs = ((InternalEObject)newAPourObjetElementTopographie).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_PERSONNE_ELT_TOPO__APOUR_OBJET_ELEMENT_TOPOGRAPHIE, null, msgs);
			msgs = basicSetAPourObjetElementTopographie(newAPourObjetElementTopographie, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PERSONNE_ELT_TOPO__APOUR_OBJET_ELEMENT_TOPOGRAPHIE, newAPourObjetElementTopographie, newAPourObjetElementTopographie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_ELT_TOPO__APOUR_SUJET_PERSONNE:
				return basicSetAPourSujetPersonne(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_ELT_TOPO__APOUR_OBJET_ELEMENT_TOPOGRAPHIE:
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
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_ELT_TOPO__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_ELT_TOPO__APOUR_SUJET_PERSONNE:
				return getAPourSujetPersonne();
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_ELT_TOPO__APOUR_OBJET_ELEMENT_TOPOGRAPHIE:
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
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_ELT_TOPO__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationPersonneEltTopoCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_ELT_TOPO__APOUR_SUJET_PERSONNE:
				setAPourSujetPersonne((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_ELT_TOPO__APOUR_OBJET_ELEMENT_TOPOGRAPHIE:
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
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_ELT_TOPO__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_ELT_TOPO__APOUR_SUJET_PERSONNE:
				setAPourSujetPersonne((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_ELT_TOPO__APOUR_OBJET_ELEMENT_TOPOGRAPHIE:
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
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_ELT_TOPO__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_ELT_TOPO__APOUR_SUJET_PERSONNE:
				return aPourSujetPersonne != null;
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_ELT_TOPO__APOUR_OBJET_ELEMENT_TOPOGRAPHIE:
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

} //TypeAssociationPersonneEltTopoImpl
