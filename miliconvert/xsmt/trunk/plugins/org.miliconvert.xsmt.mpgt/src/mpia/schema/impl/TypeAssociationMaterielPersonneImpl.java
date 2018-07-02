/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationMaterielPersonne;
import mpia.schema.TypeDictionaryDicoAssociationMaterielPersonneCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Materiel Personne</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationMaterielPersonneImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationMaterielPersonneImpl#getAPourSujetMateriel <em>APour Sujet Materiel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationMaterielPersonneImpl#getAPourObjetPersonne <em>APour Objet Personne</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationMaterielPersonneImpl extends TypeAssociationInstanceObjetInstanceObjetImpl implements TypeAssociationMaterielPersonne {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAssociationMaterielPersonneCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssociationMaterielPersonneCategorie.NKN;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationMaterielPersonneCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

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
	 * The cached value of the '{@link #getAPourObjetPersonne() <em>APour Objet Personne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourObjetPersonne()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourObjetPersonne;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationMaterielPersonneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationMaterielPersonne();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssociationMaterielPersonneCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssociationMaterielPersonneCategorie newCategorie) {
		TypeDictionaryDicoAssociationMaterielPersonneCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_MATERIEL_PERSONNE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssociationMaterielPersonneCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_MATERIEL_PERSONNE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_MATERIEL_PERSONNE__APOUR_SUJET_MATERIEL, oldAPourSujetMateriel, newAPourSujetMateriel);
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
				msgs = ((InternalEObject)aPourSujetMateriel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_MATERIEL_PERSONNE__APOUR_SUJET_MATERIEL, null, msgs);
			if (newAPourSujetMateriel != null)
				msgs = ((InternalEObject)newAPourSujetMateriel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_MATERIEL_PERSONNE__APOUR_SUJET_MATERIEL, null, msgs);
			msgs = basicSetAPourSujetMateriel(newAPourSujetMateriel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_MATERIEL_PERSONNE__APOUR_SUJET_MATERIEL, newAPourSujetMateriel, newAPourSujetMateriel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourObjetPersonne() {
		return aPourObjetPersonne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourObjetPersonne(TypeAssociation newAPourObjetPersonne, NotificationChain msgs) {
		TypeAssociation oldAPourObjetPersonne = aPourObjetPersonne;
		aPourObjetPersonne = newAPourObjetPersonne;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_MATERIEL_PERSONNE__APOUR_OBJET_PERSONNE, oldAPourObjetPersonne, newAPourObjetPersonne);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourObjetPersonne(TypeAssociation newAPourObjetPersonne) {
		if (newAPourObjetPersonne != aPourObjetPersonne) {
			NotificationChain msgs = null;
			if (aPourObjetPersonne != null)
				msgs = ((InternalEObject)aPourObjetPersonne).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_MATERIEL_PERSONNE__APOUR_OBJET_PERSONNE, null, msgs);
			if (newAPourObjetPersonne != null)
				msgs = ((InternalEObject)newAPourObjetPersonne).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_MATERIEL_PERSONNE__APOUR_OBJET_PERSONNE, null, msgs);
			msgs = basicSetAPourObjetPersonne(newAPourObjetPersonne, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_MATERIEL_PERSONNE__APOUR_OBJET_PERSONNE, newAPourObjetPersonne, newAPourObjetPersonne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_MATERIEL_PERSONNE__APOUR_SUJET_MATERIEL:
				return basicSetAPourSujetMateriel(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_MATERIEL_PERSONNE__APOUR_OBJET_PERSONNE:
				return basicSetAPourObjetPersonne(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_MATERIEL_PERSONNE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_MATERIEL_PERSONNE__APOUR_SUJET_MATERIEL:
				return getAPourSujetMateriel();
			case SchemaPackage.TYPE_ASSOCIATION_MATERIEL_PERSONNE__APOUR_OBJET_PERSONNE:
				return getAPourObjetPersonne();
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
			case SchemaPackage.TYPE_ASSOCIATION_MATERIEL_PERSONNE__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationMaterielPersonneCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_MATERIEL_PERSONNE__APOUR_SUJET_MATERIEL:
				setAPourSujetMateriel((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_MATERIEL_PERSONNE__APOUR_OBJET_PERSONNE:
				setAPourObjetPersonne((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_MATERIEL_PERSONNE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_MATERIEL_PERSONNE__APOUR_SUJET_MATERIEL:
				setAPourSujetMateriel((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_MATERIEL_PERSONNE__APOUR_OBJET_PERSONNE:
				setAPourObjetPersonne((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_MATERIEL_PERSONNE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_MATERIEL_PERSONNE__APOUR_SUJET_MATERIEL:
				return aPourSujetMateriel != null;
			case SchemaPackage.TYPE_ASSOCIATION_MATERIEL_PERSONNE__APOUR_OBJET_PERSONNE:
				return aPourObjetPersonne != null;
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

} //TypeAssociationMaterielPersonneImpl
