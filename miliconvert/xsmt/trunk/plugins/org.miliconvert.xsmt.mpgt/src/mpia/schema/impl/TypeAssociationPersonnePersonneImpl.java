/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationPersonnePersonne;
import mpia.schema.TypeDictionaryDicoAssociationPersonnePersonneCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Personne Personne</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationPersonnePersonneImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationPersonnePersonneImpl#getEstReferenceeDansArticulation <em>Est Referencee Dans Articulation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationPersonnePersonneImpl#getAPourObjetPersonne <em>APour Objet Personne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationPersonnePersonneImpl#getAPourSujetPersonne <em>APour Sujet Personne</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationPersonnePersonneImpl extends TypeAssociationInstanceObjetInstanceObjetImpl implements TypeAssociationPersonnePersonne {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAssociationPersonnePersonneCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssociationPersonnePersonneCategorie.ISAUNT;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationPersonnePersonneCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The cached value of the '{@link #getEstReferenceeDansArticulation() <em>Est Referencee Dans Articulation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstReferenceeDansArticulation()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociationEXT> estReferenceeDansArticulation;

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
	protected TypeAssociationPersonnePersonneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationPersonnePersonne();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssociationPersonnePersonneCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssociationPersonnePersonneCategorie newCategorie) {
		TypeDictionaryDicoAssociationPersonnePersonneCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PERSONNE_PERSONNE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssociationPersonnePersonneCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_PERSONNE_PERSONNE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public EList<TypeAssociationEXT> getEstReferenceeDansArticulation() {
		if (estReferenceeDansArticulation == null) {
			estReferenceeDansArticulation = new EObjectContainmentEList<TypeAssociationEXT>(TypeAssociationEXT.class, this, SchemaPackage.TYPE_ASSOCIATION_PERSONNE_PERSONNE__EST_REFERENCEE_DANS_ARTICULATION);
		}
		return estReferenceeDansArticulation;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PERSONNE_PERSONNE__APOUR_OBJET_PERSONNE, oldAPourObjetPersonne, newAPourObjetPersonne);
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
				msgs = ((InternalEObject)aPourObjetPersonne).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_PERSONNE_PERSONNE__APOUR_OBJET_PERSONNE, null, msgs);
			if (newAPourObjetPersonne != null)
				msgs = ((InternalEObject)newAPourObjetPersonne).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_PERSONNE_PERSONNE__APOUR_OBJET_PERSONNE, null, msgs);
			msgs = basicSetAPourObjetPersonne(newAPourObjetPersonne, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PERSONNE_PERSONNE__APOUR_OBJET_PERSONNE, newAPourObjetPersonne, newAPourObjetPersonne));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PERSONNE_PERSONNE__APOUR_SUJET_PERSONNE, oldAPourSujetPersonne, newAPourSujetPersonne);
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
				msgs = ((InternalEObject)aPourSujetPersonne).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_PERSONNE_PERSONNE__APOUR_SUJET_PERSONNE, null, msgs);
			if (newAPourSujetPersonne != null)
				msgs = ((InternalEObject)newAPourSujetPersonne).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_PERSONNE_PERSONNE__APOUR_SUJET_PERSONNE, null, msgs);
			msgs = basicSetAPourSujetPersonne(newAPourSujetPersonne, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PERSONNE_PERSONNE__APOUR_SUJET_PERSONNE, newAPourSujetPersonne, newAPourSujetPersonne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_PERSONNE__EST_REFERENCEE_DANS_ARTICULATION:
				return ((InternalEList<?>)getEstReferenceeDansArticulation()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_PERSONNE__APOUR_OBJET_PERSONNE:
				return basicSetAPourObjetPersonne(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_PERSONNE__APOUR_SUJET_PERSONNE:
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
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_PERSONNE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_PERSONNE__EST_REFERENCEE_DANS_ARTICULATION:
				return getEstReferenceeDansArticulation();
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_PERSONNE__APOUR_OBJET_PERSONNE:
				return getAPourObjetPersonne();
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_PERSONNE__APOUR_SUJET_PERSONNE:
				return getAPourSujetPersonne();
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
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_PERSONNE__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationPersonnePersonneCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_PERSONNE__EST_REFERENCEE_DANS_ARTICULATION:
				getEstReferenceeDansArticulation().clear();
				getEstReferenceeDansArticulation().addAll((Collection<? extends TypeAssociationEXT>)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_PERSONNE__APOUR_OBJET_PERSONNE:
				setAPourObjetPersonne((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_PERSONNE__APOUR_SUJET_PERSONNE:
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
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_PERSONNE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_PERSONNE__EST_REFERENCEE_DANS_ARTICULATION:
				getEstReferenceeDansArticulation().clear();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_PERSONNE__APOUR_OBJET_PERSONNE:
				setAPourObjetPersonne((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_PERSONNE__APOUR_SUJET_PERSONNE:
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
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_PERSONNE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_PERSONNE__EST_REFERENCEE_DANS_ARTICULATION:
				return estReferenceeDansArticulation != null && !estReferenceeDansArticulation.isEmpty();
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_PERSONNE__APOUR_OBJET_PERSONNE:
				return aPourObjetPersonne != null;
			case SchemaPackage.TYPE_ASSOCIATION_PERSONNE_PERSONNE__APOUR_SUJET_PERSONNE:
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

} //TypeAssociationPersonnePersonneImpl
