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
import mpia.schema.TypeDictionaryDicoDotationEffectiveCategorie;
import mpia.schema.TypeDotationEffectiveEffectif;

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
 * An implementation of the model object '<em><b>Type Dotation Effective Effectif</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeDotationEffectiveEffectifImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDotationEffectiveEffectifImpl#getAssocieCommeTypeTypePersonne <em>Associe Comme Type Type Personne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDotationEffectiveEffectifImpl#getConstitueSituationEffectif <em>Constitue Situation Effectif</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeDotationEffectiveEffectifImpl extends TypeDotationEffectiveImpl implements TypeDotationEffectiveEffectif {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoDotationEffectiveCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoDotationEffectiveCategorie.ATT;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoDotationEffectiveCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The cached value of the '{@link #getAssocieCommeTypeTypePersonne() <em>Associe Comme Type Type Personne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeTypeTypePersonne()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeTypeTypePersonne;

	/**
	 * The cached value of the '{@link #getConstitueSituationEffectif() <em>Constitue Situation Effectif</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstitueSituationEffectif()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> constitueSituationEffectif;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDotationEffectiveEffectifImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeDotationEffectiveEffectif();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoDotationEffectiveCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoDotationEffectiveCategorie newCategorie) {
		TypeDictionaryDicoDotationEffectiveCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOTATION_EFFECTIVE_EFFECTIF__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoDotationEffectiveCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DOTATION_EFFECTIVE_EFFECTIF__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeAssociation getAssocieCommeTypeTypePersonne() {
		return associeCommeTypeTypePersonne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeTypeTypePersonne(TypeAssociation newAssocieCommeTypeTypePersonne, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeTypeTypePersonne = associeCommeTypeTypePersonne;
		associeCommeTypeTypePersonne = newAssocieCommeTypeTypePersonne;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOTATION_EFFECTIVE_EFFECTIF__ASSOCIE_COMME_TYPE_TYPE_PERSONNE, oldAssocieCommeTypeTypePersonne, newAssocieCommeTypeTypePersonne);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeTypeTypePersonne(TypeAssociation newAssocieCommeTypeTypePersonne) {
		if (newAssocieCommeTypeTypePersonne != associeCommeTypeTypePersonne) {
			NotificationChain msgs = null;
			if (associeCommeTypeTypePersonne != null)
				msgs = ((InternalEObject)associeCommeTypeTypePersonne).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DOTATION_EFFECTIVE_EFFECTIF__ASSOCIE_COMME_TYPE_TYPE_PERSONNE, null, msgs);
			if (newAssocieCommeTypeTypePersonne != null)
				msgs = ((InternalEObject)newAssocieCommeTypeTypePersonne).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DOTATION_EFFECTIVE_EFFECTIF__ASSOCIE_COMME_TYPE_TYPE_PERSONNE, null, msgs);
			msgs = basicSetAssocieCommeTypeTypePersonne(newAssocieCommeTypeTypePersonne, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOTATION_EFFECTIVE_EFFECTIF__ASSOCIE_COMME_TYPE_TYPE_PERSONNE, newAssocieCommeTypeTypePersonne, newAssocieCommeTypeTypePersonne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getConstitueSituationEffectif() {
		if (constitueSituationEffectif == null) {
			constitueSituationEffectif = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_DOTATION_EFFECTIVE_EFFECTIF__CONSTITUE_SITUATION_EFFECTIF);
		}
		return constitueSituationEffectif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE_EFFECTIF__ASSOCIE_COMME_TYPE_TYPE_PERSONNE:
				return basicSetAssocieCommeTypeTypePersonne(null, msgs);
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE_EFFECTIF__CONSTITUE_SITUATION_EFFECTIF:
				return ((InternalEList<?>)getConstitueSituationEffectif()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE_EFFECTIF__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE_EFFECTIF__ASSOCIE_COMME_TYPE_TYPE_PERSONNE:
				return getAssocieCommeTypeTypePersonne();
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE_EFFECTIF__CONSTITUE_SITUATION_EFFECTIF:
				return getConstitueSituationEffectif();
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
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE_EFFECTIF__CATEGORIE:
				setCategorie((TypeDictionaryDicoDotationEffectiveCategorie)newValue);
				return;
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE_EFFECTIF__ASSOCIE_COMME_TYPE_TYPE_PERSONNE:
				setAssocieCommeTypeTypePersonne((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE_EFFECTIF__CONSTITUE_SITUATION_EFFECTIF:
				getConstitueSituationEffectif().clear();
				getConstitueSituationEffectif().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE_EFFECTIF__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE_EFFECTIF__ASSOCIE_COMME_TYPE_TYPE_PERSONNE:
				setAssocieCommeTypeTypePersonne((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE_EFFECTIF__CONSTITUE_SITUATION_EFFECTIF:
				getConstitueSituationEffectif().clear();
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
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE_EFFECTIF__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE_EFFECTIF__ASSOCIE_COMME_TYPE_TYPE_PERSONNE:
				return associeCommeTypeTypePersonne != null;
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE_EFFECTIF__CONSTITUE_SITUATION_EFFECTIF:
				return constitueSituationEffectif != null && !constitueSituationEffectif.isEmpty();
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

} //TypeDotationEffectiveEffectifImpl
