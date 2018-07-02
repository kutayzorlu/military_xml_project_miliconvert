/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoEffectifNecessaireSpecialiteAAD;
import mpia.schema.TypeDictionaryDicoEffectifNecessaireSpecialiteGenie;
import mpia.schema.TypeEffectifNecessaire;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Effectif Necessaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEffectifNecessaireImpl#getQuantite <em>Quantite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEffectifNecessaireImpl#getSpecialiteAAD <em>Specialite AAD</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEffectifNecessaireImpl#getSpecialiteGenie <em>Specialite Genie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEffectifNecessaireImpl#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEffectifNecessaireImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEffectifNecessaireImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEffectifNecessaireImpl#getEstDecritParTypeUnite <em>Est Decrit Par Type Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEffectifNecessaireImpl extends EObjectImpl implements TypeEffectifNecessaire {
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
	 * The default value of the '{@link #getSpecialiteAAD() <em>Specialite AAD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialiteAAD()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEffectifNecessaireSpecialiteAAD SPECIALITE_AAD_EDEFAULT = TypeDictionaryDicoEffectifNecessaireSpecialiteAAD.DEP;

	/**
	 * The cached value of the '{@link #getSpecialiteAAD() <em>Specialite AAD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialiteAAD()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEffectifNecessaireSpecialiteAAD specialiteAAD = SPECIALITE_AAD_EDEFAULT;

	/**
	 * This is true if the Specialite AAD attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean specialiteAADESet;

	/**
	 * The default value of the '{@link #getSpecialiteGenie() <em>Specialite Genie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialiteGenie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEffectifNecessaireSpecialiteGenie SPECIALITE_GENIE_EDEFAULT = TypeDictionaryDicoEffectifNecessaireSpecialiteGenie.RECO;

	/**
	 * The cached value of the '{@link #getSpecialiteGenie() <em>Specialite Genie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialiteGenie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEffectifNecessaireSpecialiteGenie specialiteGenie = SPECIALITE_GENIE_EDEFAULT;

	/**
	 * This is true if the Specialite Genie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean specialiteGenieESet;

	/**
	 * The default value of the '{@link #getCommentaire() <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaire()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTAIRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommentaire() <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaire()
	 * @generated
	 * @ordered
	 */
	protected String commentaire = COMMENTAIRE_EDEFAULT;

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
	 * The cached value of the '{@link #getEstDecritParTypeUnite() <em>Est Decrit Par Type Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstDecritParTypeUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT estDecritParTypeUnite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEffectifNecessaireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEffectifNecessaire();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFECTIF_NECESSAIRE__QUANTITE, oldQuantite, quantite, !oldQuantiteESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EFFECTIF_NECESSAIRE__QUANTITE, oldQuantite, QUANTITE_EDEFAULT, oldQuantiteESet));
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
	public TypeDictionaryDicoEffectifNecessaireSpecialiteAAD getSpecialiteAAD() {
		return specialiteAAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecialiteAAD(TypeDictionaryDicoEffectifNecessaireSpecialiteAAD newSpecialiteAAD) {
		TypeDictionaryDicoEffectifNecessaireSpecialiteAAD oldSpecialiteAAD = specialiteAAD;
		specialiteAAD = newSpecialiteAAD == null ? SPECIALITE_AAD_EDEFAULT : newSpecialiteAAD;
		boolean oldSpecialiteAADESet = specialiteAADESet;
		specialiteAADESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFECTIF_NECESSAIRE__SPECIALITE_AAD, oldSpecialiteAAD, specialiteAAD, !oldSpecialiteAADESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpecialiteAAD() {
		TypeDictionaryDicoEffectifNecessaireSpecialiteAAD oldSpecialiteAAD = specialiteAAD;
		boolean oldSpecialiteAADESet = specialiteAADESet;
		specialiteAAD = SPECIALITE_AAD_EDEFAULT;
		specialiteAADESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EFFECTIF_NECESSAIRE__SPECIALITE_AAD, oldSpecialiteAAD, SPECIALITE_AAD_EDEFAULT, oldSpecialiteAADESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpecialiteAAD() {
		return specialiteAADESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEffectifNecessaireSpecialiteGenie getSpecialiteGenie() {
		return specialiteGenie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecialiteGenie(TypeDictionaryDicoEffectifNecessaireSpecialiteGenie newSpecialiteGenie) {
		TypeDictionaryDicoEffectifNecessaireSpecialiteGenie oldSpecialiteGenie = specialiteGenie;
		specialiteGenie = newSpecialiteGenie == null ? SPECIALITE_GENIE_EDEFAULT : newSpecialiteGenie;
		boolean oldSpecialiteGenieESet = specialiteGenieESet;
		specialiteGenieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFECTIF_NECESSAIRE__SPECIALITE_GENIE, oldSpecialiteGenie, specialiteGenie, !oldSpecialiteGenieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpecialiteGenie() {
		TypeDictionaryDicoEffectifNecessaireSpecialiteGenie oldSpecialiteGenie = specialiteGenie;
		boolean oldSpecialiteGenieESet = specialiteGenieESet;
		specialiteGenie = SPECIALITE_GENIE_EDEFAULT;
		specialiteGenieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EFFECTIF_NECESSAIRE__SPECIALITE_GENIE, oldSpecialiteGenie, SPECIALITE_GENIE_EDEFAULT, oldSpecialiteGenieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpecialiteGenie() {
		return specialiteGenieESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommentaire() {
		return commentaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentaire(String newCommentaire) {
		String oldCommentaire = commentaire;
		commentaire = newCommentaire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFECTIF_NECESSAIRE__COMMENTAIRE, oldCommentaire, commentaire));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFECTIF_NECESSAIRE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFECTIF_NECESSAIRE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getEstDecritParTypeUnite() {
		return estDecritParTypeUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstDecritParTypeUnite(TypeAssociationEXT newEstDecritParTypeUnite, NotificationChain msgs) {
		TypeAssociationEXT oldEstDecritParTypeUnite = estDecritParTypeUnite;
		estDecritParTypeUnite = newEstDecritParTypeUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFECTIF_NECESSAIRE__EST_DECRIT_PAR_TYPE_UNITE, oldEstDecritParTypeUnite, newEstDecritParTypeUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstDecritParTypeUnite(TypeAssociationEXT newEstDecritParTypeUnite) {
		if (newEstDecritParTypeUnite != estDecritParTypeUnite) {
			NotificationChain msgs = null;
			if (estDecritParTypeUnite != null)
				msgs = ((InternalEObject)estDecritParTypeUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EFFECTIF_NECESSAIRE__EST_DECRIT_PAR_TYPE_UNITE, null, msgs);
			if (newEstDecritParTypeUnite != null)
				msgs = ((InternalEObject)newEstDecritParTypeUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EFFECTIF_NECESSAIRE__EST_DECRIT_PAR_TYPE_UNITE, null, msgs);
			msgs = basicSetEstDecritParTypeUnite(newEstDecritParTypeUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFECTIF_NECESSAIRE__EST_DECRIT_PAR_TYPE_UNITE, newEstDecritParTypeUnite, newEstDecritParTypeUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_EFFECTIF_NECESSAIRE__EST_DECRIT_PAR_TYPE_UNITE:
				return basicSetEstDecritParTypeUnite(null, msgs);
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
			case SchemaPackage.TYPE_EFFECTIF_NECESSAIRE__QUANTITE:
				return new Long(getQuantite());
			case SchemaPackage.TYPE_EFFECTIF_NECESSAIRE__SPECIALITE_AAD:
				return getSpecialiteAAD();
			case SchemaPackage.TYPE_EFFECTIF_NECESSAIRE__SPECIALITE_GENIE:
				return getSpecialiteGenie();
			case SchemaPackage.TYPE_EFFECTIF_NECESSAIRE__COMMENTAIRE:
				return getCommentaire();
			case SchemaPackage.TYPE_EFFECTIF_NECESSAIRE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_EFFECTIF_NECESSAIRE__CE:
				return getCE();
			case SchemaPackage.TYPE_EFFECTIF_NECESSAIRE__EST_DECRIT_PAR_TYPE_UNITE:
				return getEstDecritParTypeUnite();
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
			case SchemaPackage.TYPE_EFFECTIF_NECESSAIRE__QUANTITE:
				setQuantite(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_EFFECTIF_NECESSAIRE__SPECIALITE_AAD:
				setSpecialiteAAD((TypeDictionaryDicoEffectifNecessaireSpecialiteAAD)newValue);
				return;
			case SchemaPackage.TYPE_EFFECTIF_NECESSAIRE__SPECIALITE_GENIE:
				setSpecialiteGenie((TypeDictionaryDicoEffectifNecessaireSpecialiteGenie)newValue);
				return;
			case SchemaPackage.TYPE_EFFECTIF_NECESSAIRE__COMMENTAIRE:
				setCommentaire((String)newValue);
				return;
			case SchemaPackage.TYPE_EFFECTIF_NECESSAIRE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_EFFECTIF_NECESSAIRE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_EFFECTIF_NECESSAIRE__EST_DECRIT_PAR_TYPE_UNITE:
				setEstDecritParTypeUnite((TypeAssociationEXT)newValue);
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
			case SchemaPackage.TYPE_EFFECTIF_NECESSAIRE__QUANTITE:
				unsetQuantite();
				return;
			case SchemaPackage.TYPE_EFFECTIF_NECESSAIRE__SPECIALITE_AAD:
				unsetSpecialiteAAD();
				return;
			case SchemaPackage.TYPE_EFFECTIF_NECESSAIRE__SPECIALITE_GENIE:
				unsetSpecialiteGenie();
				return;
			case SchemaPackage.TYPE_EFFECTIF_NECESSAIRE__COMMENTAIRE:
				setCommentaire(COMMENTAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_EFFECTIF_NECESSAIRE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_EFFECTIF_NECESSAIRE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_EFFECTIF_NECESSAIRE__EST_DECRIT_PAR_TYPE_UNITE:
				setEstDecritParTypeUnite((TypeAssociationEXT)null);
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
			case SchemaPackage.TYPE_EFFECTIF_NECESSAIRE__QUANTITE:
				return isSetQuantite();
			case SchemaPackage.TYPE_EFFECTIF_NECESSAIRE__SPECIALITE_AAD:
				return isSetSpecialiteAAD();
			case SchemaPackage.TYPE_EFFECTIF_NECESSAIRE__SPECIALITE_GENIE:
				return isSetSpecialiteGenie();
			case SchemaPackage.TYPE_EFFECTIF_NECESSAIRE__COMMENTAIRE:
				return COMMENTAIRE_EDEFAULT == null ? commentaire != null : !COMMENTAIRE_EDEFAULT.equals(commentaire);
			case SchemaPackage.TYPE_EFFECTIF_NECESSAIRE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_EFFECTIF_NECESSAIRE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_EFFECTIF_NECESSAIRE__EST_DECRIT_PAR_TYPE_UNITE:
				return estDecritParTypeUnite != null;
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
		result.append(", specialiteAAD: ");
		if (specialiteAADESet) result.append(specialiteAAD); else result.append("<unset>");
		result.append(", specialiteGenie: ");
		if (specialiteGenieESet) result.append(specialiteGenie); else result.append("<unset>");
		result.append(", commentaire: ");
		result.append(commentaire);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeEffectifNecessaireImpl
