/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationMaterielEltTopo;
import mpia.schema.TypeDictionaryDicoAssociationMaterielEltTopoCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Materiel Elt Topo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationMaterielEltTopoImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationMaterielEltTopoImpl#getAPourObjetElementTopographie <em>APour Objet Element Topographie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationMaterielEltTopoImpl#getAPourSujetMateriel <em>APour Sujet Materiel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationMaterielEltTopoImpl extends TypeAssociationInstanceObjetInstanceObjetImpl implements TypeAssociationMaterielEltTopo {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAssociationMaterielEltTopoCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssociationMaterielEltTopoCategorie.ISSITU;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationMaterielEltTopoCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

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
	 * The cached value of the '{@link #getAPourSujetMateriel() <em>APour Sujet Materiel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourSujetMateriel()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourSujetMateriel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationMaterielEltTopoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationMaterielEltTopo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssociationMaterielEltTopoCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssociationMaterielEltTopoCategorie newCategorie) {
		TypeDictionaryDicoAssociationMaterielEltTopoCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_MATERIEL_ELT_TOPO__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssociationMaterielEltTopoCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_MATERIEL_ELT_TOPO__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_MATERIEL_ELT_TOPO__APOUR_OBJET_ELEMENT_TOPOGRAPHIE, oldAPourObjetElementTopographie, newAPourObjetElementTopographie);
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
				msgs = ((InternalEObject)aPourObjetElementTopographie).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_MATERIEL_ELT_TOPO__APOUR_OBJET_ELEMENT_TOPOGRAPHIE, null, msgs);
			if (newAPourObjetElementTopographie != null)
				msgs = ((InternalEObject)newAPourObjetElementTopographie).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_MATERIEL_ELT_TOPO__APOUR_OBJET_ELEMENT_TOPOGRAPHIE, null, msgs);
			msgs = basicSetAPourObjetElementTopographie(newAPourObjetElementTopographie, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_MATERIEL_ELT_TOPO__APOUR_OBJET_ELEMENT_TOPOGRAPHIE, newAPourObjetElementTopographie, newAPourObjetElementTopographie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourSujetMateriel() {
		return aPourSujetMateriel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourSujetMateriel(TypeAssociation newAPourSujetMateriel, NotificationChain msgs) {
		TypeAssociation oldAPourSujetMateriel = aPourSujetMateriel;
		aPourSujetMateriel = newAPourSujetMateriel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_MATERIEL_ELT_TOPO__APOUR_SUJET_MATERIEL, oldAPourSujetMateriel, newAPourSujetMateriel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourSujetMateriel(TypeAssociation newAPourSujetMateriel) {
		if (newAPourSujetMateriel != aPourSujetMateriel) {
			NotificationChain msgs = null;
			if (aPourSujetMateriel != null)
				msgs = ((InternalEObject)aPourSujetMateriel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_MATERIEL_ELT_TOPO__APOUR_SUJET_MATERIEL, null, msgs);
			if (newAPourSujetMateriel != null)
				msgs = ((InternalEObject)newAPourSujetMateriel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_MATERIEL_ELT_TOPO__APOUR_SUJET_MATERIEL, null, msgs);
			msgs = basicSetAPourSujetMateriel(newAPourSujetMateriel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_MATERIEL_ELT_TOPO__APOUR_SUJET_MATERIEL, newAPourSujetMateriel, newAPourSujetMateriel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_MATERIEL_ELT_TOPO__APOUR_OBJET_ELEMENT_TOPOGRAPHIE:
				return basicSetAPourObjetElementTopographie(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_MATERIEL_ELT_TOPO__APOUR_SUJET_MATERIEL:
				return basicSetAPourSujetMateriel(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_MATERIEL_ELT_TOPO__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_MATERIEL_ELT_TOPO__APOUR_OBJET_ELEMENT_TOPOGRAPHIE:
				return getAPourObjetElementTopographie();
			case SchemaPackage.TYPE_ASSOCIATION_MATERIEL_ELT_TOPO__APOUR_SUJET_MATERIEL:
				return getAPourSujetMateriel();
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
			case SchemaPackage.TYPE_ASSOCIATION_MATERIEL_ELT_TOPO__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationMaterielEltTopoCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_MATERIEL_ELT_TOPO__APOUR_OBJET_ELEMENT_TOPOGRAPHIE:
				setAPourObjetElementTopographie((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_MATERIEL_ELT_TOPO__APOUR_SUJET_MATERIEL:
				setAPourSujetMateriel((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_MATERIEL_ELT_TOPO__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_MATERIEL_ELT_TOPO__APOUR_OBJET_ELEMENT_TOPOGRAPHIE:
				setAPourObjetElementTopographie((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_MATERIEL_ELT_TOPO__APOUR_SUJET_MATERIEL:
				setAPourSujetMateriel((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_MATERIEL_ELT_TOPO__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_MATERIEL_ELT_TOPO__APOUR_OBJET_ELEMENT_TOPOGRAPHIE:
				return aPourObjetElementTopographie != null;
			case SchemaPackage.TYPE_ASSOCIATION_MATERIEL_ELT_TOPO__APOUR_SUJET_MATERIEL:
				return aPourSujetMateriel != null;
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

} //TypeAssociationMaterielEltTopoImpl
