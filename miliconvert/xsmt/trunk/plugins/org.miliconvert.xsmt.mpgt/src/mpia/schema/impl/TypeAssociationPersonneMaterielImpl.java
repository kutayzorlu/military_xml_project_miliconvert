/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationPersonneMateriel;
import mpia.schema.TypeDictionaryDicoAssociationPersonneMaterielCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Personne Materiel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationPersonneMaterielImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationPersonneMaterielImpl#getAPourObjetMateriel <em>APour Objet Materiel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationPersonneMaterielImpl#getAPourSujetPersonne <em>APour Sujet Personne</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationPersonneMaterielImpl extends TypeAssociationInstanceObjetInstanceObjetImpl implements TypeAssociationPersonneMateriel {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAssociationPersonneMaterielCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssociationPersonneMaterielCategorie.CONTRL;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationPersonneMaterielCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The cached value of the '{@link #getAPourObjetMateriel() <em>APour Objet Materiel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourObjetMateriel()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourObjetMateriel;

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
	protected TypeAssociationPersonneMaterielImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationPersonneMateriel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssociationPersonneMaterielCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssociationPersonneMaterielCategorie newCategorie) {
		TypeDictionaryDicoAssociationPersonneMaterielCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PERSONNE_MATERIEL__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssociationPersonneMaterielCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_PERSONNE_MATERIEL__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeAssociation getAPourObjetMateriel() {
		return aPourObjetMateriel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourObjetMateriel(TypeAssociation newAPourObjetMateriel, NotificationChain msgs) {
		TypeAssociation oldAPourObjetMateriel = aPourObjetMateriel;
		aPourObjetMateriel = newAPourObjetMateriel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PERSONNE_MATERIEL__APOUR_OBJET_MATERIEL, oldAPourObjetMateriel, newAPourObjetMateriel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourObjetMateriel(TypeAssociation newAPourObjetMateriel) {
		if (newAPourObjetMateriel != aPourObjetMateriel) {
			NotificationChain msgs = null;
			if (aPourObjetMateriel != null)
				msgs = ((InternalEObject)aPourObjetMateriel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_PERSONNE_MATERIEL__APOUR_OBJET_MATERIEL, null, msgs);
			if (newAPourObjetMateriel != null)
				msgs = ((InternalEObject)newAPourObjetMateriel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_PERSONNE_MATERIEL__APOUR_OBJET_MATERIEL, null, msgs);
			msgs = basicSetAPourObjetMateriel(newAPourObjetMateriel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PERSONNE_MATERIEL__APOUR_OBJET_MATERIEL, newAPourObjetMateriel, newAPourObjetMateriel));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PERSONNE_MATERIEL__APOUR_SUJET_PERSONNE, oldAPourSujetPersonne, newAPourSujetPersonne);
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
				msgs = ((InternalEObject)aPourSujetPersonne).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_PERSONNE_MATERIEL__APOUR_SUJET_PERSONNE, null, msgs);
			if (newAPourSujetPersonne != null)
				msgs = ((InternalEObject)newAPourSujetPersonne).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_PERSONNE_MATERIEL__APOUR_SUJET_PERSONNE, null, msgs);
			msgs = basicSetAPourSujetPersonne(newAPourSujetPersonne, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PERSONNE_MATERIEL__APOUR_SUJET_PERSONNE, newAPourSujetPersonne, newAPourSujetPersonne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_MATERIEL__APOUR_OBJET_MATERIEL:
				return basicSetAPourObjetMateriel(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_MATERIEL__APOUR_SUJET_PERSONNE:
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
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_MATERIEL__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_MATERIEL__APOUR_OBJET_MATERIEL:
				return getAPourObjetMateriel();
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_MATERIEL__APOUR_SUJET_PERSONNE:
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
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_MATERIEL__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationPersonneMaterielCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_MATERIEL__APOUR_OBJET_MATERIEL:
				setAPourObjetMateriel((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_MATERIEL__APOUR_SUJET_PERSONNE:
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
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_MATERIEL__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_MATERIEL__APOUR_OBJET_MATERIEL:
				setAPourObjetMateriel((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_MATERIEL__APOUR_SUJET_PERSONNE:
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
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_MATERIEL__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_MATERIEL__APOUR_OBJET_MATERIEL:
				return aPourObjetMateriel != null;
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_MATERIEL__APOUR_SUJET_PERSONNE:
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

} //TypeAssociationPersonneMaterielImpl
