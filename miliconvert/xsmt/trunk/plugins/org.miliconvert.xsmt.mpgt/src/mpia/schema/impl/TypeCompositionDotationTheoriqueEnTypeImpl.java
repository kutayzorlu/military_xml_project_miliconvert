/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCompositionDotationTheoriqueEnType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Composition Dotation Theorique En Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCompositionDotationTheoriqueEnTypeImpl#isPartieMajeure <em>Partie Majeure</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCompositionDotationTheoriqueEnTypeImpl#getQuantite <em>Quantite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCompositionDotationTheoriqueEnTypeImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCompositionDotationTheoriqueEnTypeImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCompositionDotationTheoriqueEnTypeImpl#getEstComposantDotationTheorique <em>Est Composant Dotation Theorique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCompositionDotationTheoriqueEnTypeImpl#getAPourReferenceType <em>APour Reference Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCompositionDotationTheoriqueEnTypeImpl extends EObjectImpl implements TypeCompositionDotationTheoriqueEnType {
	/**
	 * The default value of the '{@link #isPartieMajeure() <em>Partie Majeure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPartieMajeure()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PARTIE_MAJEURE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPartieMajeure() <em>Partie Majeure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPartieMajeure()
	 * @generated
	 * @ordered
	 */
	protected boolean partieMajeure = PARTIE_MAJEURE_EDEFAULT;

	/**
	 * This is true if the Partie Majeure attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean partieMajeureESet;

	/**
	 * The default value of the '{@link #getQuantite() <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantite()
	 * @generated
	 * @ordered
	 */
	protected static final long QUANTITE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getQuantite() <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantite()
	 * @generated
	 * @ordered
	 */
	protected long quantite = QUANTITE_EDEFAULT;

	/**
	 * This is true if the Quantite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quantiteESet;

	/**
	 * The default value of the '{@link #getCTE() <em>CTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCTE()
	 * @generated
	 * @ordered
	 */
	protected static final String CTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCTE() <em>CTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCTE()
	 * @generated
	 * @ordered
	 */
	protected String cTE = CTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCE() <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCE()
	 * @generated
	 * @ordered
	 */
	protected static final String CE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCE() <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCE()
	 * @generated
	 * @ordered
	 */
	protected String cE = CE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEstComposantDotationTheorique() <em>Est Composant Dotation Theorique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstComposantDotationTheorique()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation estComposantDotationTheorique;

	/**
	 * The cached value of the '{@link #getAPourReferenceType() <em>APour Reference Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourReferenceType()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourReferenceType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCompositionDotationTheoriqueEnTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCompositionDotationTheoriqueEnType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPartieMajeure() {
		return partieMajeure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartieMajeure(boolean newPartieMajeure) {
		boolean oldPartieMajeure = partieMajeure;
		partieMajeure = newPartieMajeure;
		boolean oldPartieMajeureESet = partieMajeureESet;
		partieMajeureESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE__PARTIE_MAJEURE, oldPartieMajeure, partieMajeure, !oldPartieMajeureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPartieMajeure() {
		boolean oldPartieMajeure = partieMajeure;
		boolean oldPartieMajeureESet = partieMajeureESet;
		partieMajeure = PARTIE_MAJEURE_EDEFAULT;
		partieMajeureESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE__PARTIE_MAJEURE, oldPartieMajeure, PARTIE_MAJEURE_EDEFAULT, oldPartieMajeureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPartieMajeure() {
		return partieMajeureESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getQuantite() {
		return quantite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantite(long newQuantite) {
		long oldQuantite = quantite;
		quantite = newQuantite;
		boolean oldQuantiteESet = quantiteESet;
		quantiteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE__QUANTITE, oldQuantite, quantite, !oldQuantiteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuantite() {
		long oldQuantite = quantite;
		boolean oldQuantiteESet = quantiteESet;
		quantite = QUANTITE_EDEFAULT;
		quantiteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE__QUANTITE, oldQuantite, QUANTITE_EDEFAULT, oldQuantiteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuantite() {
		return quantiteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCTE() {
		return cTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCTE(String newCTE) {
		String oldCTE = cTE;
		cTE = newCTE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE__CTE, oldCTE, cTE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCE() {
		return cE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCE(String newCE) {
		String oldCE = cE;
		cE = newCE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getEstComposantDotationTheorique() {
		return estComposantDotationTheorique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstComposantDotationTheorique(TypeAssociation newEstComposantDotationTheorique, NotificationChain msgs) {
		TypeAssociation oldEstComposantDotationTheorique = estComposantDotationTheorique;
		estComposantDotationTheorique = newEstComposantDotationTheorique;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE__EST_COMPOSANT_DOTATION_THEORIQUE, oldEstComposantDotationTheorique, newEstComposantDotationTheorique);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstComposantDotationTheorique(TypeAssociation newEstComposantDotationTheorique) {
		if (newEstComposantDotationTheorique != estComposantDotationTheorique) {
			NotificationChain msgs = null;
			if (estComposantDotationTheorique != null)
				msgs = ((InternalEObject)estComposantDotationTheorique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE__EST_COMPOSANT_DOTATION_THEORIQUE, null, msgs);
			if (newEstComposantDotationTheorique != null)
				msgs = ((InternalEObject)newEstComposantDotationTheorique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE__EST_COMPOSANT_DOTATION_THEORIQUE, null, msgs);
			msgs = basicSetEstComposantDotationTheorique(newEstComposantDotationTheorique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE__EST_COMPOSANT_DOTATION_THEORIQUE, newEstComposantDotationTheorique, newEstComposantDotationTheorique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourReferenceType() {
		return aPourReferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourReferenceType(TypeAssociation newAPourReferenceType, NotificationChain msgs) {
		TypeAssociation oldAPourReferenceType = aPourReferenceType;
		aPourReferenceType = newAPourReferenceType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE__APOUR_REFERENCE_TYPE, oldAPourReferenceType, newAPourReferenceType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourReferenceType(TypeAssociation newAPourReferenceType) {
		if (newAPourReferenceType != aPourReferenceType) {
			NotificationChain msgs = null;
			if (aPourReferenceType != null)
				msgs = ((InternalEObject)aPourReferenceType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE__APOUR_REFERENCE_TYPE, null, msgs);
			if (newAPourReferenceType != null)
				msgs = ((InternalEObject)newAPourReferenceType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE__APOUR_REFERENCE_TYPE, null, msgs);
			msgs = basicSetAPourReferenceType(newAPourReferenceType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE__APOUR_REFERENCE_TYPE, newAPourReferenceType, newAPourReferenceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE__EST_COMPOSANT_DOTATION_THEORIQUE:
				return basicSetEstComposantDotationTheorique(null, msgs);
			case SchemaPackage.TYPE_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE__APOUR_REFERENCE_TYPE:
				return basicSetAPourReferenceType(null, msgs);
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
			case SchemaPackage.TYPE_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE__PARTIE_MAJEURE:
				return isPartieMajeure() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE__QUANTITE:
				return new Long(getQuantite());
			case SchemaPackage.TYPE_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE__CE:
				return getCE();
			case SchemaPackage.TYPE_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE__EST_COMPOSANT_DOTATION_THEORIQUE:
				return getEstComposantDotationTheorique();
			case SchemaPackage.TYPE_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE__APOUR_REFERENCE_TYPE:
				return getAPourReferenceType();
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
			case SchemaPackage.TYPE_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE__PARTIE_MAJEURE:
				setPartieMajeure(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE__QUANTITE:
				setQuantite(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE__EST_COMPOSANT_DOTATION_THEORIQUE:
				setEstComposantDotationTheorique((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE__APOUR_REFERENCE_TYPE:
				setAPourReferenceType((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE__PARTIE_MAJEURE:
				unsetPartieMajeure();
				return;
			case SchemaPackage.TYPE_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE__QUANTITE:
				unsetQuantite();
				return;
			case SchemaPackage.TYPE_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE__EST_COMPOSANT_DOTATION_THEORIQUE:
				setEstComposantDotationTheorique((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE__APOUR_REFERENCE_TYPE:
				setAPourReferenceType((TypeAssociation)null);
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
			case SchemaPackage.TYPE_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE__PARTIE_MAJEURE:
				return isSetPartieMajeure();
			case SchemaPackage.TYPE_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE__QUANTITE:
				return isSetQuantite();
			case SchemaPackage.TYPE_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE__EST_COMPOSANT_DOTATION_THEORIQUE:
				return estComposantDotationTheorique != null;
			case SchemaPackage.TYPE_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE__APOUR_REFERENCE_TYPE:
				return aPourReferenceType != null;
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
		result.append(" (partieMajeure: ");
		if (partieMajeureESet) result.append(partieMajeure); else result.append("<unset>");
		result.append(", quantite: ");
		if (quantiteESet) result.append(quantite); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeCompositionDotationTheoriqueEnTypeImpl
