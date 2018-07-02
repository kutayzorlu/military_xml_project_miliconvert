/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoTransfertDotationRaison;
import mpia.schema.TypeTransfertDotation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Transfert Dotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeTransfertDotationImpl#getQuantite <em>Quantite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTransfertDotationImpl#getRaison <em>Raison</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTransfertDotationImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTransfertDotationImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTransfertDotationImpl#getAPourFournisseurBeneficiaireInstanceObjet <em>APour Fournisseur Beneficiaire Instance Objet</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTransfertDotationImpl#getEstRapporteeParRapport <em>Est Rapportee Par Rapport</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeTransfertDotationImpl extends EObjectImpl implements TypeTransfertDotation {
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
	 * The default value of the '{@link #getRaison() <em>Raison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaison()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTransfertDotationRaison RAISON_EDEFAULT = TypeDictionaryDicoTransfertDotationRaison.TOTDIN;

	/**
	 * The cached value of the '{@link #getRaison() <em>Raison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaison()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTransfertDotationRaison raison = RAISON_EDEFAULT;

	/**
	 * This is true if the Raison attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean raisonESet;

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
	 * The cached value of the '{@link #getAPourFournisseurBeneficiaireInstanceObjet() <em>APour Fournisseur Beneficiaire Instance Objet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourFournisseurBeneficiaireInstanceObjet()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourFournisseurBeneficiaireInstanceObjet;

	/**
	 * The cached value of the '{@link #getEstRapporteeParRapport() <em>Est Rapportee Par Rapport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstRapporteeParRapport()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation estRapporteeParRapport;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeTransfertDotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeTransfertDotation();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRANSFERT_DOTATION__QUANTITE, oldQuantite, quantite, !oldQuantiteESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TRANSFERT_DOTATION__QUANTITE, oldQuantite, QUANTITE_EDEFAULT, oldQuantiteESet));
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
	public TypeDictionaryDicoTransfertDotationRaison getRaison() {
		return raison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRaison(TypeDictionaryDicoTransfertDotationRaison newRaison) {
		TypeDictionaryDicoTransfertDotationRaison oldRaison = raison;
		raison = newRaison == null ? RAISON_EDEFAULT : newRaison;
		boolean oldRaisonESet = raisonESet;
		raisonESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRANSFERT_DOTATION__RAISON, oldRaison, raison, !oldRaisonESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRaison() {
		TypeDictionaryDicoTransfertDotationRaison oldRaison = raison;
		boolean oldRaisonESet = raisonESet;
		raison = RAISON_EDEFAULT;
		raisonESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TRANSFERT_DOTATION__RAISON, oldRaison, RAISON_EDEFAULT, oldRaisonESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRaison() {
		return raisonESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRANSFERT_DOTATION__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRANSFERT_DOTATION__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourFournisseurBeneficiaireInstanceObjet() {
		return aPourFournisseurBeneficiaireInstanceObjet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourFournisseurBeneficiaireInstanceObjet(TypeAssociation newAPourFournisseurBeneficiaireInstanceObjet, NotificationChain msgs) {
		TypeAssociation oldAPourFournisseurBeneficiaireInstanceObjet = aPourFournisseurBeneficiaireInstanceObjet;
		aPourFournisseurBeneficiaireInstanceObjet = newAPourFournisseurBeneficiaireInstanceObjet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRANSFERT_DOTATION__APOUR_FOURNISSEUR_BENEFICIAIRE_INSTANCE_OBJET, oldAPourFournisseurBeneficiaireInstanceObjet, newAPourFournisseurBeneficiaireInstanceObjet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourFournisseurBeneficiaireInstanceObjet(TypeAssociation newAPourFournisseurBeneficiaireInstanceObjet) {
		if (newAPourFournisseurBeneficiaireInstanceObjet != aPourFournisseurBeneficiaireInstanceObjet) {
			NotificationChain msgs = null;
			if (aPourFournisseurBeneficiaireInstanceObjet != null)
				msgs = ((InternalEObject)aPourFournisseurBeneficiaireInstanceObjet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TRANSFERT_DOTATION__APOUR_FOURNISSEUR_BENEFICIAIRE_INSTANCE_OBJET, null, msgs);
			if (newAPourFournisseurBeneficiaireInstanceObjet != null)
				msgs = ((InternalEObject)newAPourFournisseurBeneficiaireInstanceObjet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TRANSFERT_DOTATION__APOUR_FOURNISSEUR_BENEFICIAIRE_INSTANCE_OBJET, null, msgs);
			msgs = basicSetAPourFournisseurBeneficiaireInstanceObjet(newAPourFournisseurBeneficiaireInstanceObjet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRANSFERT_DOTATION__APOUR_FOURNISSEUR_BENEFICIAIRE_INSTANCE_OBJET, newAPourFournisseurBeneficiaireInstanceObjet, newAPourFournisseurBeneficiaireInstanceObjet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getEstRapporteeParRapport() {
		return estRapporteeParRapport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstRapporteeParRapport(TypeAssociation newEstRapporteeParRapport, NotificationChain msgs) {
		TypeAssociation oldEstRapporteeParRapport = estRapporteeParRapport;
		estRapporteeParRapport = newEstRapporteeParRapport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRANSFERT_DOTATION__EST_RAPPORTEE_PAR_RAPPORT, oldEstRapporteeParRapport, newEstRapporteeParRapport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstRapporteeParRapport(TypeAssociation newEstRapporteeParRapport) {
		if (newEstRapporteeParRapport != estRapporteeParRapport) {
			NotificationChain msgs = null;
			if (estRapporteeParRapport != null)
				msgs = ((InternalEObject)estRapporteeParRapport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TRANSFERT_DOTATION__EST_RAPPORTEE_PAR_RAPPORT, null, msgs);
			if (newEstRapporteeParRapport != null)
				msgs = ((InternalEObject)newEstRapporteeParRapport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TRANSFERT_DOTATION__EST_RAPPORTEE_PAR_RAPPORT, null, msgs);
			msgs = basicSetEstRapporteeParRapport(newEstRapporteeParRapport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRANSFERT_DOTATION__EST_RAPPORTEE_PAR_RAPPORT, newEstRapporteeParRapport, newEstRapporteeParRapport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_TRANSFERT_DOTATION__APOUR_FOURNISSEUR_BENEFICIAIRE_INSTANCE_OBJET:
				return basicSetAPourFournisseurBeneficiaireInstanceObjet(null, msgs);
			case SchemaPackage.TYPE_TRANSFERT_DOTATION__EST_RAPPORTEE_PAR_RAPPORT:
				return basicSetEstRapporteeParRapport(null, msgs);
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
			case SchemaPackage.TYPE_TRANSFERT_DOTATION__QUANTITE:
				return new Long(getQuantite());
			case SchemaPackage.TYPE_TRANSFERT_DOTATION__RAISON:
				return getRaison();
			case SchemaPackage.TYPE_TRANSFERT_DOTATION__CTE:
				return getCTE();
			case SchemaPackage.TYPE_TRANSFERT_DOTATION__CE:
				return getCE();
			case SchemaPackage.TYPE_TRANSFERT_DOTATION__APOUR_FOURNISSEUR_BENEFICIAIRE_INSTANCE_OBJET:
				return getAPourFournisseurBeneficiaireInstanceObjet();
			case SchemaPackage.TYPE_TRANSFERT_DOTATION__EST_RAPPORTEE_PAR_RAPPORT:
				return getEstRapporteeParRapport();
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
			case SchemaPackage.TYPE_TRANSFERT_DOTATION__QUANTITE:
				setQuantite(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_TRANSFERT_DOTATION__RAISON:
				setRaison((TypeDictionaryDicoTransfertDotationRaison)newValue);
				return;
			case SchemaPackage.TYPE_TRANSFERT_DOTATION__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_TRANSFERT_DOTATION__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_TRANSFERT_DOTATION__APOUR_FOURNISSEUR_BENEFICIAIRE_INSTANCE_OBJET:
				setAPourFournisseurBeneficiaireInstanceObjet((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_TRANSFERT_DOTATION__EST_RAPPORTEE_PAR_RAPPORT:
				setEstRapporteeParRapport((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_TRANSFERT_DOTATION__QUANTITE:
				unsetQuantite();
				return;
			case SchemaPackage.TYPE_TRANSFERT_DOTATION__RAISON:
				unsetRaison();
				return;
			case SchemaPackage.TYPE_TRANSFERT_DOTATION__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TRANSFERT_DOTATION__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TRANSFERT_DOTATION__APOUR_FOURNISSEUR_BENEFICIAIRE_INSTANCE_OBJET:
				setAPourFournisseurBeneficiaireInstanceObjet((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_TRANSFERT_DOTATION__EST_RAPPORTEE_PAR_RAPPORT:
				setEstRapporteeParRapport((TypeAssociation)null);
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
			case SchemaPackage.TYPE_TRANSFERT_DOTATION__QUANTITE:
				return isSetQuantite();
			case SchemaPackage.TYPE_TRANSFERT_DOTATION__RAISON:
				return isSetRaison();
			case SchemaPackage.TYPE_TRANSFERT_DOTATION__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_TRANSFERT_DOTATION__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_TRANSFERT_DOTATION__APOUR_FOURNISSEUR_BENEFICIAIRE_INSTANCE_OBJET:
				return aPourFournisseurBeneficiaireInstanceObjet != null;
			case SchemaPackage.TYPE_TRANSFERT_DOTATION__EST_RAPPORTEE_PAR_RAPPORT:
				return estRapporteeParRapport != null;
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
		result.append(" (quantite: ");
		if (quantiteESet) result.append(quantite); else result.append("<unset>");
		result.append(", raison: ");
		if (raisonESet) result.append(raison); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeTransfertDotationImpl
