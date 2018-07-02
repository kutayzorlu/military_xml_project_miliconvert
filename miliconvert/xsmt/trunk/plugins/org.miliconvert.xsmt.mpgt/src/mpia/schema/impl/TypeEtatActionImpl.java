/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoEtatActionCategorie;
import mpia.schema.TypeDictionaryDicoEtatActionEtatAvancement;
import mpia.schema.TypeDictionaryDicoEtatActionQualificatifRapport;
import mpia.schema.TypeEtatAction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Etat Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEtatActionImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatActionImpl#getEtatAvancement <em>Etat Avancement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatActionImpl#getDegreAchevement <em>Degre Achevement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatActionImpl#isPlanifie <em>Planifie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatActionImpl#isFeinte <em>Feinte</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatActionImpl#getQualificatifRapport <em>Qualificatif Rapport</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatActionImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatActionImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatActionImpl#getEstRapporteParRapport <em>Est Rapporte Par Rapport</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEtatActionImpl extends EObjectImpl implements TypeEtatAction {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatActionCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoEtatActionCategorie.ORD;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatActionCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getEtatAvancement() <em>Etat Avancement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatAvancement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatActionEtatAvancement ETAT_AVANCEMENT_EDEFAULT = TypeDictionaryDicoEtatActionEtatAvancement.ABO;

	/**
	 * The cached value of the '{@link #getEtatAvancement() <em>Etat Avancement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatAvancement()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatActionEtatAvancement etatAvancement = ETAT_AVANCEMENT_EDEFAULT;

	/**
	 * This is true if the Etat Avancement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean etatAvancementESet;

	/**
	 * The default value of the '{@link #getDegreAchevement() <em>Degre Achevement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegreAchevement()
	 * @generated
	 * @ordered
	 */
	protected static final double DEGRE_ACHEVEMENT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDegreAchevement() <em>Degre Achevement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegreAchevement()
	 * @generated
	 * @ordered
	 */
	protected double degreAchevement = DEGRE_ACHEVEMENT_EDEFAULT;

	/**
	 * This is true if the Degre Achevement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean degreAchevementESet;

	/**
	 * The default value of the '{@link #isPlanifie() <em>Planifie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPlanifie()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PLANIFIE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPlanifie() <em>Planifie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPlanifie()
	 * @generated
	 * @ordered
	 */
	protected boolean planifie = PLANIFIE_EDEFAULT;

	/**
	 * This is true if the Planifie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean planifieESet;

	/**
	 * The default value of the '{@link #isFeinte() <em>Feinte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFeinte()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FEINTE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFeinte() <em>Feinte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFeinte()
	 * @generated
	 * @ordered
	 */
	protected boolean feinte = FEINTE_EDEFAULT;

	/**
	 * This is true if the Feinte attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean feinteESet;

	/**
	 * The default value of the '{@link #getQualificatifRapport() <em>Qualificatif Rapport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificatifRapport()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatActionQualificatifRapport QUALIFICATIF_RAPPORT_EDEFAULT = TypeDictionaryDicoEtatActionQualificatifRapport.RQSEAT;

	/**
	 * The cached value of the '{@link #getQualificatifRapport() <em>Qualificatif Rapport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificatifRapport()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatActionQualificatifRapport qualificatifRapport = QUALIFICATIF_RAPPORT_EDEFAULT;

	/**
	 * This is true if the Qualificatif Rapport attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean qualificatifRapportESet;

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
	 * The cached value of the '{@link #getEstRapporteParRapport() <em>Est Rapporte Par Rapport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstRapporteParRapport()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation estRapporteParRapport;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEtatActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEtatAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatActionCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoEtatActionCategorie newCategorie) {
		TypeDictionaryDicoEtatActionCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_ACTION__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoEtatActionCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_ACTION__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeDictionaryDicoEtatActionEtatAvancement getEtatAvancement() {
		return etatAvancement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatAvancement(TypeDictionaryDicoEtatActionEtatAvancement newEtatAvancement) {
		TypeDictionaryDicoEtatActionEtatAvancement oldEtatAvancement = etatAvancement;
		etatAvancement = newEtatAvancement == null ? ETAT_AVANCEMENT_EDEFAULT : newEtatAvancement;
		boolean oldEtatAvancementESet = etatAvancementESet;
		etatAvancementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_ACTION__ETAT_AVANCEMENT, oldEtatAvancement, etatAvancement, !oldEtatAvancementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEtatAvancement() {
		TypeDictionaryDicoEtatActionEtatAvancement oldEtatAvancement = etatAvancement;
		boolean oldEtatAvancementESet = etatAvancementESet;
		etatAvancement = ETAT_AVANCEMENT_EDEFAULT;
		etatAvancementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_ACTION__ETAT_AVANCEMENT, oldEtatAvancement, ETAT_AVANCEMENT_EDEFAULT, oldEtatAvancementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEtatAvancement() {
		return etatAvancementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDegreAchevement() {
		return degreAchevement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDegreAchevement(double newDegreAchevement) {
		double oldDegreAchevement = degreAchevement;
		degreAchevement = newDegreAchevement;
		boolean oldDegreAchevementESet = degreAchevementESet;
		degreAchevementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_ACTION__DEGRE_ACHEVEMENT, oldDegreAchevement, degreAchevement, !oldDegreAchevementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDegreAchevement() {
		double oldDegreAchevement = degreAchevement;
		boolean oldDegreAchevementESet = degreAchevementESet;
		degreAchevement = DEGRE_ACHEVEMENT_EDEFAULT;
		degreAchevementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_ACTION__DEGRE_ACHEVEMENT, oldDegreAchevement, DEGRE_ACHEVEMENT_EDEFAULT, oldDegreAchevementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDegreAchevement() {
		return degreAchevementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPlanifie() {
		return planifie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlanifie(boolean newPlanifie) {
		boolean oldPlanifie = planifie;
		planifie = newPlanifie;
		boolean oldPlanifieESet = planifieESet;
		planifieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_ACTION__PLANIFIE, oldPlanifie, planifie, !oldPlanifieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPlanifie() {
		boolean oldPlanifie = planifie;
		boolean oldPlanifieESet = planifieESet;
		planifie = PLANIFIE_EDEFAULT;
		planifieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_ACTION__PLANIFIE, oldPlanifie, PLANIFIE_EDEFAULT, oldPlanifieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPlanifie() {
		return planifieESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFeinte() {
		return feinte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeinte(boolean newFeinte) {
		boolean oldFeinte = feinte;
		feinte = newFeinte;
		boolean oldFeinteESet = feinteESet;
		feinteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_ACTION__FEINTE, oldFeinte, feinte, !oldFeinteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFeinte() {
		boolean oldFeinte = feinte;
		boolean oldFeinteESet = feinteESet;
		feinte = FEINTE_EDEFAULT;
		feinteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_ACTION__FEINTE, oldFeinte, FEINTE_EDEFAULT, oldFeinteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFeinte() {
		return feinteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatActionQualificatifRapport getQualificatifRapport() {
		return qualificatifRapport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualificatifRapport(TypeDictionaryDicoEtatActionQualificatifRapport newQualificatifRapport) {
		TypeDictionaryDicoEtatActionQualificatifRapport oldQualificatifRapport = qualificatifRapport;
		qualificatifRapport = newQualificatifRapport == null ? QUALIFICATIF_RAPPORT_EDEFAULT : newQualificatifRapport;
		boolean oldQualificatifRapportESet = qualificatifRapportESet;
		qualificatifRapportESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_ACTION__QUALIFICATIF_RAPPORT, oldQualificatifRapport, qualificatifRapport, !oldQualificatifRapportESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQualificatifRapport() {
		TypeDictionaryDicoEtatActionQualificatifRapport oldQualificatifRapport = qualificatifRapport;
		boolean oldQualificatifRapportESet = qualificatifRapportESet;
		qualificatifRapport = QUALIFICATIF_RAPPORT_EDEFAULT;
		qualificatifRapportESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_ACTION__QUALIFICATIF_RAPPORT, oldQualificatifRapport, QUALIFICATIF_RAPPORT_EDEFAULT, oldQualificatifRapportESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQualificatifRapport() {
		return qualificatifRapportESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_ACTION__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_ACTION__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getEstRapporteParRapport() {
		return estRapporteParRapport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstRapporteParRapport(TypeAssociation newEstRapporteParRapport, NotificationChain msgs) {
		TypeAssociation oldEstRapporteParRapport = estRapporteParRapport;
		estRapporteParRapport = newEstRapporteParRapport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_ACTION__EST_RAPPORTE_PAR_RAPPORT, oldEstRapporteParRapport, newEstRapporteParRapport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstRapporteParRapport(TypeAssociation newEstRapporteParRapport) {
		if (newEstRapporteParRapport != estRapporteParRapport) {
			NotificationChain msgs = null;
			if (estRapporteParRapport != null)
				msgs = ((InternalEObject)estRapporteParRapport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_ACTION__EST_RAPPORTE_PAR_RAPPORT, null, msgs);
			if (newEstRapporteParRapport != null)
				msgs = ((InternalEObject)newEstRapporteParRapport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_ACTION__EST_RAPPORTE_PAR_RAPPORT, null, msgs);
			msgs = basicSetEstRapporteParRapport(newEstRapporteParRapport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_ACTION__EST_RAPPORTE_PAR_RAPPORT, newEstRapporteParRapport, newEstRapporteParRapport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ETAT_ACTION__EST_RAPPORTE_PAR_RAPPORT:
				return basicSetEstRapporteParRapport(null, msgs);
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
			case SchemaPackage.TYPE_ETAT_ACTION__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ETAT_ACTION__ETAT_AVANCEMENT:
				return getEtatAvancement();
			case SchemaPackage.TYPE_ETAT_ACTION__DEGRE_ACHEVEMENT:
				return new Double(getDegreAchevement());
			case SchemaPackage.TYPE_ETAT_ACTION__PLANIFIE:
				return isPlanifie() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_ETAT_ACTION__FEINTE:
				return isFeinte() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_ETAT_ACTION__QUALIFICATIF_RAPPORT:
				return getQualificatifRapport();
			case SchemaPackage.TYPE_ETAT_ACTION__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ETAT_ACTION__CE:
				return getCE();
			case SchemaPackage.TYPE_ETAT_ACTION__EST_RAPPORTE_PAR_RAPPORT:
				return getEstRapporteParRapport();
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
			case SchemaPackage.TYPE_ETAT_ACTION__CATEGORIE:
				setCategorie((TypeDictionaryDicoEtatActionCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_ACTION__ETAT_AVANCEMENT:
				setEtatAvancement((TypeDictionaryDicoEtatActionEtatAvancement)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_ACTION__DEGRE_ACHEVEMENT:
				setDegreAchevement(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_ETAT_ACTION__PLANIFIE:
				setPlanifie(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_ETAT_ACTION__FEINTE:
				setFeinte(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_ETAT_ACTION__QUALIFICATIF_RAPPORT:
				setQualificatifRapport((TypeDictionaryDicoEtatActionQualificatifRapport)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_ACTION__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_ACTION__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_ACTION__EST_RAPPORTE_PAR_RAPPORT:
				setEstRapporteParRapport((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ETAT_ACTION__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ETAT_ACTION__ETAT_AVANCEMENT:
				unsetEtatAvancement();
				return;
			case SchemaPackage.TYPE_ETAT_ACTION__DEGRE_ACHEVEMENT:
				unsetDegreAchevement();
				return;
			case SchemaPackage.TYPE_ETAT_ACTION__PLANIFIE:
				unsetPlanifie();
				return;
			case SchemaPackage.TYPE_ETAT_ACTION__FEINTE:
				unsetFeinte();
				return;
			case SchemaPackage.TYPE_ETAT_ACTION__QUALIFICATIF_RAPPORT:
				unsetQualificatifRapport();
				return;
			case SchemaPackage.TYPE_ETAT_ACTION__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ETAT_ACTION__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ETAT_ACTION__EST_RAPPORTE_PAR_RAPPORT:
				setEstRapporteParRapport((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ETAT_ACTION__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ETAT_ACTION__ETAT_AVANCEMENT:
				return isSetEtatAvancement();
			case SchemaPackage.TYPE_ETAT_ACTION__DEGRE_ACHEVEMENT:
				return isSetDegreAchevement();
			case SchemaPackage.TYPE_ETAT_ACTION__PLANIFIE:
				return isSetPlanifie();
			case SchemaPackage.TYPE_ETAT_ACTION__FEINTE:
				return isSetFeinte();
			case SchemaPackage.TYPE_ETAT_ACTION__QUALIFICATIF_RAPPORT:
				return isSetQualificatifRapport();
			case SchemaPackage.TYPE_ETAT_ACTION__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ETAT_ACTION__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ETAT_ACTION__EST_RAPPORTE_PAR_RAPPORT:
				return estRapporteParRapport != null;
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
		result.append(", etatAvancement: ");
		if (etatAvancementESet) result.append(etatAvancement); else result.append("<unset>");
		result.append(", degreAchevement: ");
		if (degreAchevementESet) result.append(degreAchevement); else result.append("<unset>");
		result.append(", planifie: ");
		if (planifieESet) result.append(planifie); else result.append("<unset>");
		result.append(", feinte: ");
		if (feinteESet) result.append(feinte); else result.append("<unset>");
		result.append(", qualificatifRapport: ");
		if (qualificatifRapportESet) result.append(qualificatifRapport); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeEtatActionImpl
