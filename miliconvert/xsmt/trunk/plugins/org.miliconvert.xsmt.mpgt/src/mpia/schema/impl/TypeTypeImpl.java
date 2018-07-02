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
import mpia.schema.TypeType;

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
 * An implementation of the model object '<em><b>Type Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeTypeImpl#isFictif <em>Fictif</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeImpl#getEstComposeDotationTheorique <em>Est Compose Dotation Theorique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeImpl#getEstSpecifieCommePartCompositionDotationTheoriqueEnType <em>Est Specifie Comme Part Composition Dotation Theorique En Type</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeImpl#getEstAffilieAAssociationAffiliationType <em>Est Affilie AAssociation Affiliation Type</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeImpl#getAPourCapaciteAssociationTypeCapacite <em>APour Capacite Association Type Capacite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypeTypeImpl extends TypeRacineOperationnelleImpl implements TypeType {
	/**
	 * The default value of the '{@link #isFictif() <em>Fictif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFictif()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FICTIF_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFictif() <em>Fictif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFictif()
	 * @generated
	 * @ordered
	 */
	protected boolean fictif = FICTIF_EDEFAULT;

	/**
	 * This is true if the Fictif attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fictifESet;

	/**
	 * The cached value of the '{@link #getEstComposeDotationTheorique() <em>Est Compose Dotation Theorique</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstComposeDotationTheorique()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estComposeDotationTheorique;

	/**
	 * The cached value of the '{@link #getEstSpecifieCommePartCompositionDotationTheoriqueEnType() <em>Est Specifie Comme Part Composition Dotation Theorique En Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSpecifieCommePartCompositionDotationTheoriqueEnType()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSpecifieCommePartCompositionDotationTheoriqueEnType;

	/**
	 * The cached value of the '{@link #getEstAffilieAAssociationAffiliationType() <em>Est Affilie AAssociation Affiliation Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstAffilieAAssociationAffiliationType()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estAffilieAAssociationAffiliationType;

	/**
	 * The cached value of the '{@link #getAPourCapaciteAssociationTypeCapacite() <em>APour Capacite Association Type Capacite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCapaciteAssociationTypeCapacite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourCapaciteAssociationTypeCapacite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFictif() {
		return fictif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFictif(boolean newFictif) {
		boolean oldFictif = fictif;
		fictif = newFictif;
		boolean oldFictifESet = fictifESet;
		fictifESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE__FICTIF, oldFictif, fictif, !oldFictifESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFictif() {
		boolean oldFictif = fictif;
		boolean oldFictifESet = fictifESet;
		fictif = FICTIF_EDEFAULT;
		fictifESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE__FICTIF, oldFictif, FICTIF_EDEFAULT, oldFictifESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFictif() {
		return fictifESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstComposeDotationTheorique() {
		if (estComposeDotationTheorique == null) {
			estComposeDotationTheorique = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_TYPE__EST_COMPOSE_DOTATION_THEORIQUE);
		}
		return estComposeDotationTheorique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSpecifieCommePartCompositionDotationTheoriqueEnType() {
		if (estSpecifieCommePartCompositionDotationTheoriqueEnType == null) {
			estSpecifieCommePartCompositionDotationTheoriqueEnType = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_TYPE__EST_SPECIFIE_COMME_PART_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE);
		}
		return estSpecifieCommePartCompositionDotationTheoriqueEnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstAffilieAAssociationAffiliationType() {
		if (estAffilieAAssociationAffiliationType == null) {
			estAffilieAAssociationAffiliationType = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_TYPE__EST_AFFILIE_AASSOCIATION_AFFILIATION_TYPE);
		}
		return estAffilieAAssociationAffiliationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourCapaciteAssociationTypeCapacite() {
		if (aPourCapaciteAssociationTypeCapacite == null) {
			aPourCapaciteAssociationTypeCapacite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_TYPE__APOUR_CAPACITE_ASSOCIATION_TYPE_CAPACITE);
		}
		return aPourCapaciteAssociationTypeCapacite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_TYPE__EST_COMPOSE_DOTATION_THEORIQUE:
				return ((InternalEList<?>)getEstComposeDotationTheorique()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_TYPE__EST_SPECIFIE_COMME_PART_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE:
				return ((InternalEList<?>)getEstSpecifieCommePartCompositionDotationTheoriqueEnType()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_TYPE__EST_AFFILIE_AASSOCIATION_AFFILIATION_TYPE:
				return ((InternalEList<?>)getEstAffilieAAssociationAffiliationType()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_TYPE__APOUR_CAPACITE_ASSOCIATION_TYPE_CAPACITE:
				return ((InternalEList<?>)getAPourCapaciteAssociationTypeCapacite()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_TYPE__FICTIF:
				return isFictif() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_TYPE__EST_COMPOSE_DOTATION_THEORIQUE:
				return getEstComposeDotationTheorique();
			case SchemaPackage.TYPE_TYPE__EST_SPECIFIE_COMME_PART_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE:
				return getEstSpecifieCommePartCompositionDotationTheoriqueEnType();
			case SchemaPackage.TYPE_TYPE__EST_AFFILIE_AASSOCIATION_AFFILIATION_TYPE:
				return getEstAffilieAAssociationAffiliationType();
			case SchemaPackage.TYPE_TYPE__APOUR_CAPACITE_ASSOCIATION_TYPE_CAPACITE:
				return getAPourCapaciteAssociationTypeCapacite();
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
			case SchemaPackage.TYPE_TYPE__FICTIF:
				setFictif(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_TYPE__EST_COMPOSE_DOTATION_THEORIQUE:
				getEstComposeDotationTheorique().clear();
				getEstComposeDotationTheorique().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_TYPE__EST_SPECIFIE_COMME_PART_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE:
				getEstSpecifieCommePartCompositionDotationTheoriqueEnType().clear();
				getEstSpecifieCommePartCompositionDotationTheoriqueEnType().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_TYPE__EST_AFFILIE_AASSOCIATION_AFFILIATION_TYPE:
				getEstAffilieAAssociationAffiliationType().clear();
				getEstAffilieAAssociationAffiliationType().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_TYPE__APOUR_CAPACITE_ASSOCIATION_TYPE_CAPACITE:
				getAPourCapaciteAssociationTypeCapacite().clear();
				getAPourCapaciteAssociationTypeCapacite().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_TYPE__FICTIF:
				unsetFictif();
				return;
			case SchemaPackage.TYPE_TYPE__EST_COMPOSE_DOTATION_THEORIQUE:
				getEstComposeDotationTheorique().clear();
				return;
			case SchemaPackage.TYPE_TYPE__EST_SPECIFIE_COMME_PART_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE:
				getEstSpecifieCommePartCompositionDotationTheoriqueEnType().clear();
				return;
			case SchemaPackage.TYPE_TYPE__EST_AFFILIE_AASSOCIATION_AFFILIATION_TYPE:
				getEstAffilieAAssociationAffiliationType().clear();
				return;
			case SchemaPackage.TYPE_TYPE__APOUR_CAPACITE_ASSOCIATION_TYPE_CAPACITE:
				getAPourCapaciteAssociationTypeCapacite().clear();
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
			case SchemaPackage.TYPE_TYPE__FICTIF:
				return isSetFictif();
			case SchemaPackage.TYPE_TYPE__EST_COMPOSE_DOTATION_THEORIQUE:
				return estComposeDotationTheorique != null && !estComposeDotationTheorique.isEmpty();
			case SchemaPackage.TYPE_TYPE__EST_SPECIFIE_COMME_PART_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE:
				return estSpecifieCommePartCompositionDotationTheoriqueEnType != null && !estSpecifieCommePartCompositionDotationTheoriqueEnType.isEmpty();
			case SchemaPackage.TYPE_TYPE__EST_AFFILIE_AASSOCIATION_AFFILIATION_TYPE:
				return estAffilieAAssociationAffiliationType != null && !estAffilieAAssociationAffiliationType.isEmpty();
			case SchemaPackage.TYPE_TYPE__APOUR_CAPACITE_ASSOCIATION_TYPE_CAPACITE:
				return aPourCapaciteAssociationTypeCapacite != null && !aPourCapaciteAssociationTypeCapacite.isEmpty();
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
		result.append(" (fictif: ");
		if (fictifESet) result.append(fictif); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeTypeImpl
