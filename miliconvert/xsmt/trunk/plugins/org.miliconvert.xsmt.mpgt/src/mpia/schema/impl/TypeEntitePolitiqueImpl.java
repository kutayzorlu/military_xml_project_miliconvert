/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeComportement;
import mpia.schema.TypeDictionaryDicoEntitePolitiqueNationaliteBigramme;
import mpia.schema.TypeDictionaryDicoEntitePolitiqueTrigramme;
import mpia.schema.TypeEntitePolitique;

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
 * An implementation of the model object '<em><b>Type Entite Politique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEntitePolitiqueImpl#getTrigramme <em>Trigramme</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEntitePolitiqueImpl#getNationaliteBigramme <em>Nationalite Bigramme</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEntitePolitiqueImpl#getAPourComportementComportement <em>APour Comportement Comportement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEntitePolitiqueImpl extends TypeAffiliationImpl implements TypeEntitePolitique {
	/**
	 * The default value of the '{@link #getTrigramme() <em>Trigramme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigramme()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEntitePolitiqueTrigramme TRIGRAMME_EDEFAULT = TypeDictionaryDicoEntitePolitiqueTrigramme.ATG;

	/**
	 * The cached value of the '{@link #getTrigramme() <em>Trigramme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigramme()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEntitePolitiqueTrigramme trigramme = TRIGRAMME_EDEFAULT;

	/**
	 * This is true if the Trigramme attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean trigrammeESet;

	/**
	 * The default value of the '{@link #getNationaliteBigramme() <em>Nationalite Bigramme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNationaliteBigramme()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEntitePolitiqueNationaliteBigramme NATIONALITE_BIGRAMME_EDEFAULT = TypeDictionaryDicoEntitePolitiqueNationaliteBigramme.AF;

	/**
	 * The cached value of the '{@link #getNationaliteBigramme() <em>Nationalite Bigramme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNationaliteBigramme()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEntitePolitiqueNationaliteBigramme nationaliteBigramme = NATIONALITE_BIGRAMME_EDEFAULT;

	/**
	 * This is true if the Nationalite Bigramme attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nationaliteBigrammeESet;

	/**
	 * The cached value of the '{@link #getAPourComportementComportement() <em>APour Comportement Comportement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourComportementComportement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeComportement> aPourComportementComportement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEntitePolitiqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEntitePolitique();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEntitePolitiqueTrigramme getTrigramme() {
		return trigramme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrigramme(TypeDictionaryDicoEntitePolitiqueTrigramme newTrigramme) {
		TypeDictionaryDicoEntitePolitiqueTrigramme oldTrigramme = trigramme;
		trigramme = newTrigramme == null ? TRIGRAMME_EDEFAULT : newTrigramme;
		boolean oldTrigrammeESet = trigrammeESet;
		trigrammeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ENTITE_POLITIQUE__TRIGRAMME, oldTrigramme, trigramme, !oldTrigrammeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTrigramme() {
		TypeDictionaryDicoEntitePolitiqueTrigramme oldTrigramme = trigramme;
		boolean oldTrigrammeESet = trigrammeESet;
		trigramme = TRIGRAMME_EDEFAULT;
		trigrammeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ENTITE_POLITIQUE__TRIGRAMME, oldTrigramme, TRIGRAMME_EDEFAULT, oldTrigrammeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTrigramme() {
		return trigrammeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEntitePolitiqueNationaliteBigramme getNationaliteBigramme() {
		return nationaliteBigramme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNationaliteBigramme(TypeDictionaryDicoEntitePolitiqueNationaliteBigramme newNationaliteBigramme) {
		TypeDictionaryDicoEntitePolitiqueNationaliteBigramme oldNationaliteBigramme = nationaliteBigramme;
		nationaliteBigramme = newNationaliteBigramme == null ? NATIONALITE_BIGRAMME_EDEFAULT : newNationaliteBigramme;
		boolean oldNationaliteBigrammeESet = nationaliteBigrammeESet;
		nationaliteBigrammeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ENTITE_POLITIQUE__NATIONALITE_BIGRAMME, oldNationaliteBigramme, nationaliteBigramme, !oldNationaliteBigrammeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNationaliteBigramme() {
		TypeDictionaryDicoEntitePolitiqueNationaliteBigramme oldNationaliteBigramme = nationaliteBigramme;
		boolean oldNationaliteBigrammeESet = nationaliteBigrammeESet;
		nationaliteBigramme = NATIONALITE_BIGRAMME_EDEFAULT;
		nationaliteBigrammeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ENTITE_POLITIQUE__NATIONALITE_BIGRAMME, oldNationaliteBigramme, NATIONALITE_BIGRAMME_EDEFAULT, oldNationaliteBigrammeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNationaliteBigramme() {
		return nationaliteBigrammeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeComportement> getAPourComportementComportement() {
		if (aPourComportementComportement == null) {
			aPourComportementComportement = new EObjectContainmentEList<TypeComportement>(TypeComportement.class, this, SchemaPackage.TYPE_ENTITE_POLITIQUE__APOUR_COMPORTEMENT_COMPORTEMENT);
		}
		return aPourComportementComportement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ENTITE_POLITIQUE__APOUR_COMPORTEMENT_COMPORTEMENT:
				return ((InternalEList<?>)getAPourComportementComportement()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_ENTITE_POLITIQUE__TRIGRAMME:
				return getTrigramme();
			case SchemaPackage.TYPE_ENTITE_POLITIQUE__NATIONALITE_BIGRAMME:
				return getNationaliteBigramme();
			case SchemaPackage.TYPE_ENTITE_POLITIQUE__APOUR_COMPORTEMENT_COMPORTEMENT:
				return getAPourComportementComportement();
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
			case SchemaPackage.TYPE_ENTITE_POLITIQUE__TRIGRAMME:
				setTrigramme((TypeDictionaryDicoEntitePolitiqueTrigramme)newValue);
				return;
			case SchemaPackage.TYPE_ENTITE_POLITIQUE__NATIONALITE_BIGRAMME:
				setNationaliteBigramme((TypeDictionaryDicoEntitePolitiqueNationaliteBigramme)newValue);
				return;
			case SchemaPackage.TYPE_ENTITE_POLITIQUE__APOUR_COMPORTEMENT_COMPORTEMENT:
				getAPourComportementComportement().clear();
				getAPourComportementComportement().addAll((Collection<? extends TypeComportement>)newValue);
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
			case SchemaPackage.TYPE_ENTITE_POLITIQUE__TRIGRAMME:
				unsetTrigramme();
				return;
			case SchemaPackage.TYPE_ENTITE_POLITIQUE__NATIONALITE_BIGRAMME:
				unsetNationaliteBigramme();
				return;
			case SchemaPackage.TYPE_ENTITE_POLITIQUE__APOUR_COMPORTEMENT_COMPORTEMENT:
				getAPourComportementComportement().clear();
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
			case SchemaPackage.TYPE_ENTITE_POLITIQUE__TRIGRAMME:
				return isSetTrigramme();
			case SchemaPackage.TYPE_ENTITE_POLITIQUE__NATIONALITE_BIGRAMME:
				return isSetNationaliteBigramme();
			case SchemaPackage.TYPE_ENTITE_POLITIQUE__APOUR_COMPORTEMENT_COMPORTEMENT:
				return aPourComportementComportement != null && !aPourComportementComportement.isEmpty();
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
		result.append(" (trigramme: ");
		if (trigrammeESet) result.append(trigramme); else result.append("<unset>");
		result.append(", nationaliteBigramme: ");
		if (nationaliteBigrammeESet) result.append(nationaliteBigramme); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeEntitePolitiqueImpl
