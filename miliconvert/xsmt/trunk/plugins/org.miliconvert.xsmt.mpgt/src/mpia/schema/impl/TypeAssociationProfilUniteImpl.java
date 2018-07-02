/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationProfilUnite;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Profil Unite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationProfilUniteImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationProfilUniteImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationProfilUniteImpl#getEtatPersonnel <em>Etat Personnel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationProfilUniteImpl#getDegreEngagement <em>Degre Engagement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationProfilUniteImpl#getTempsReaction <em>Temps Reaction</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationProfilUniteImpl#getReactiviteEmploi <em>Reactivite Emploi</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationProfilUniteImpl#getAssocieCommeSujetUnite <em>Associe Comme Sujet Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationProfilUniteImpl#getAssocieCommeObjetProfil <em>Associe Comme Objet Profil</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationProfilUniteImpl extends EObjectImpl implements TypeAssociationProfilUnite {
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
	 * The default value of the '{@link #getEtatPersonnel() <em>Etat Personnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatPersonnel()
	 * @generated
	 * @ordered
	 */
	protected static final String ETAT_PERSONNEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEtatPersonnel() <em>Etat Personnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatPersonnel()
	 * @generated
	 * @ordered
	 */
	protected String etatPersonnel = ETAT_PERSONNEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDegreEngagement() <em>Degre Engagement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegreEngagement()
	 * @generated
	 * @ordered
	 */
	protected static final String DEGRE_ENGAGEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDegreEngagement() <em>Degre Engagement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegreEngagement()
	 * @generated
	 * @ordered
	 */
	protected String degreEngagement = DEGRE_ENGAGEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTempsReaction() <em>Temps Reaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempsReaction()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPS_REACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTempsReaction() <em>Temps Reaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempsReaction()
	 * @generated
	 * @ordered
	 */
	protected String tempsReaction = TEMPS_REACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getReactiviteEmploi() <em>Reactivite Emploi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactiviteEmploi()
	 * @generated
	 * @ordered
	 */
	protected static final String REACTIVITE_EMPLOI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReactiviteEmploi() <em>Reactivite Emploi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactiviteEmploi()
	 * @generated
	 * @ordered
	 */
	protected String reactiviteEmploi = REACTIVITE_EMPLOI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssocieCommeSujetUnite() <em>Associe Comme Sujet Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeSujetUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT associeCommeSujetUnite;

	/**
	 * The cached value of the '{@link #getAssocieCommeObjetProfil() <em>Associe Comme Objet Profil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeObjetProfil()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeObjetProfil;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationProfilUniteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationProfilUnite();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PROFIL_UNITE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PROFIL_UNITE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtatPersonnel() {
		return etatPersonnel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatPersonnel(String newEtatPersonnel) {
		String oldEtatPersonnel = etatPersonnel;
		etatPersonnel = newEtatPersonnel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PROFIL_UNITE__ETAT_PERSONNEL, oldEtatPersonnel, etatPersonnel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDegreEngagement() {
		return degreEngagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDegreEngagement(String newDegreEngagement) {
		String oldDegreEngagement = degreEngagement;
		degreEngagement = newDegreEngagement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PROFIL_UNITE__DEGRE_ENGAGEMENT, oldDegreEngagement, degreEngagement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTempsReaction() {
		return tempsReaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTempsReaction(String newTempsReaction) {
		String oldTempsReaction = tempsReaction;
		tempsReaction = newTempsReaction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PROFIL_UNITE__TEMPS_REACTION, oldTempsReaction, tempsReaction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReactiviteEmploi() {
		return reactiviteEmploi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactiviteEmploi(String newReactiviteEmploi) {
		String oldReactiviteEmploi = reactiviteEmploi;
		reactiviteEmploi = newReactiviteEmploi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PROFIL_UNITE__REACTIVITE_EMPLOI, oldReactiviteEmploi, reactiviteEmploi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAssocieCommeSujetUnite() {
		return associeCommeSujetUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeSujetUnite(TypeAssociationEXT newAssocieCommeSujetUnite, NotificationChain msgs) {
		TypeAssociationEXT oldAssocieCommeSujetUnite = associeCommeSujetUnite;
		associeCommeSujetUnite = newAssocieCommeSujetUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PROFIL_UNITE__ASSOCIE_COMME_SUJET_UNITE, oldAssocieCommeSujetUnite, newAssocieCommeSujetUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeSujetUnite(TypeAssociationEXT newAssocieCommeSujetUnite) {
		if (newAssocieCommeSujetUnite != associeCommeSujetUnite) {
			NotificationChain msgs = null;
			if (associeCommeSujetUnite != null)
				msgs = ((InternalEObject)associeCommeSujetUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_PROFIL_UNITE__ASSOCIE_COMME_SUJET_UNITE, null, msgs);
			if (newAssocieCommeSujetUnite != null)
				msgs = ((InternalEObject)newAssocieCommeSujetUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_PROFIL_UNITE__ASSOCIE_COMME_SUJET_UNITE, null, msgs);
			msgs = basicSetAssocieCommeSujetUnite(newAssocieCommeSujetUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PROFIL_UNITE__ASSOCIE_COMME_SUJET_UNITE, newAssocieCommeSujetUnite, newAssocieCommeSujetUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeObjetProfil() {
		return associeCommeObjetProfil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeObjetProfil(TypeAssociation newAssocieCommeObjetProfil, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeObjetProfil = associeCommeObjetProfil;
		associeCommeObjetProfil = newAssocieCommeObjetProfil;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PROFIL_UNITE__ASSOCIE_COMME_OBJET_PROFIL, oldAssocieCommeObjetProfil, newAssocieCommeObjetProfil);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeObjetProfil(TypeAssociation newAssocieCommeObjetProfil) {
		if (newAssocieCommeObjetProfil != associeCommeObjetProfil) {
			NotificationChain msgs = null;
			if (associeCommeObjetProfil != null)
				msgs = ((InternalEObject)associeCommeObjetProfil).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_PROFIL_UNITE__ASSOCIE_COMME_OBJET_PROFIL, null, msgs);
			if (newAssocieCommeObjetProfil != null)
				msgs = ((InternalEObject)newAssocieCommeObjetProfil).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_PROFIL_UNITE__ASSOCIE_COMME_OBJET_PROFIL, null, msgs);
			msgs = basicSetAssocieCommeObjetProfil(newAssocieCommeObjetProfil, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PROFIL_UNITE__ASSOCIE_COMME_OBJET_PROFIL, newAssocieCommeObjetProfil, newAssocieCommeObjetProfil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_UNITE__ASSOCIE_COMME_SUJET_UNITE:
				return basicSetAssocieCommeSujetUnite(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_UNITE__ASSOCIE_COMME_OBJET_PROFIL:
				return basicSetAssocieCommeObjetProfil(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_UNITE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_UNITE__CE:
				return getCE();
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_UNITE__ETAT_PERSONNEL:
				return getEtatPersonnel();
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_UNITE__DEGRE_ENGAGEMENT:
				return getDegreEngagement();
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_UNITE__TEMPS_REACTION:
				return getTempsReaction();
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_UNITE__REACTIVITE_EMPLOI:
				return getReactiviteEmploi();
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_UNITE__ASSOCIE_COMME_SUJET_UNITE:
				return getAssocieCommeSujetUnite();
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_UNITE__ASSOCIE_COMME_OBJET_PROFIL:
				return getAssocieCommeObjetProfil();
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
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_UNITE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_UNITE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_UNITE__ETAT_PERSONNEL:
				setEtatPersonnel((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_UNITE__DEGRE_ENGAGEMENT:
				setDegreEngagement((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_UNITE__TEMPS_REACTION:
				setTempsReaction((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_UNITE__REACTIVITE_EMPLOI:
				setReactiviteEmploi((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_UNITE__ASSOCIE_COMME_SUJET_UNITE:
				setAssocieCommeSujetUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_UNITE__ASSOCIE_COMME_OBJET_PROFIL:
				setAssocieCommeObjetProfil((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_UNITE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_UNITE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_UNITE__ETAT_PERSONNEL:
				setEtatPersonnel(ETAT_PERSONNEL_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_UNITE__DEGRE_ENGAGEMENT:
				setDegreEngagement(DEGRE_ENGAGEMENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_UNITE__TEMPS_REACTION:
				setTempsReaction(TEMPS_REACTION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_UNITE__REACTIVITE_EMPLOI:
				setReactiviteEmploi(REACTIVITE_EMPLOI_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_UNITE__ASSOCIE_COMME_SUJET_UNITE:
				setAssocieCommeSujetUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_UNITE__ASSOCIE_COMME_OBJET_PROFIL:
				setAssocieCommeObjetProfil((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_UNITE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_UNITE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_UNITE__ETAT_PERSONNEL:
				return ETAT_PERSONNEL_EDEFAULT == null ? etatPersonnel != null : !ETAT_PERSONNEL_EDEFAULT.equals(etatPersonnel);
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_UNITE__DEGRE_ENGAGEMENT:
				return DEGRE_ENGAGEMENT_EDEFAULT == null ? degreEngagement != null : !DEGRE_ENGAGEMENT_EDEFAULT.equals(degreEngagement);
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_UNITE__TEMPS_REACTION:
				return TEMPS_REACTION_EDEFAULT == null ? tempsReaction != null : !TEMPS_REACTION_EDEFAULT.equals(tempsReaction);
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_UNITE__REACTIVITE_EMPLOI:
				return REACTIVITE_EMPLOI_EDEFAULT == null ? reactiviteEmploi != null : !REACTIVITE_EMPLOI_EDEFAULT.equals(reactiviteEmploi);
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_UNITE__ASSOCIE_COMME_SUJET_UNITE:
				return associeCommeSujetUnite != null;
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_UNITE__ASSOCIE_COMME_OBJET_PROFIL:
				return associeCommeObjetProfil != null;
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
		result.append(" (cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(", etatPersonnel: ");
		result.append(etatPersonnel);
		result.append(", degreEngagement: ");
		result.append(degreEngagement);
		result.append(", tempsReaction: ");
		result.append(tempsReaction);
		result.append(", reactiviteEmploi: ");
		result.append(reactiviteEmploi);
		result.append(')');
		return result.toString();
	}

} //TypeAssociationProfilUniteImpl
