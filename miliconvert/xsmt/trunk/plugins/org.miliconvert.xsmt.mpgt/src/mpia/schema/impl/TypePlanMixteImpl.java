/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCrIncident;
import mpia.schema.TypePlanMixte;
import mpia.schema.TypePlanParticulier;
import mpia.schema.TypePlanification;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Plan Mixte</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePlanMixteImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanMixteImpl#getDateProposition <em>Date Proposition</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanMixteImpl#getDateApprobation <em>Date Approbation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanMixteImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanMixteImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanMixteImpl#getAPourPlanAideDeploiementPlanParticulier <em>APour Plan Aide Deploiement Plan Particulier</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanMixteImpl#getAPourPlanAppuiContreMobilitePlanParticulier <em>APour Plan Appui Contre Mobilite Plan Particulier</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanMixteImpl#getAPourPlanAppuiMobilitePlanParticulier <em>APour Plan Appui Mobilite Plan Particulier</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanMixteImpl#getAPourPlanificationPlanification <em>APour Planification Planification</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanMixteImpl#getAPourHypothesePlanification <em>APour Hypothese Planification</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanMixteImpl#getAPourCrIncidentCrIncident <em>APour Cr Incident Cr Incident</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePlanMixteImpl extends EObjectImpl implements TypePlanMixte {
	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateProposition() <em>Date Proposition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateProposition()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_PROPOSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateProposition() <em>Date Proposition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateProposition()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateProposition = DATE_PROPOSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateApprobation() <em>Date Approbation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateApprobation()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_APPROBATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateApprobation() <em>Date Approbation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateApprobation()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateApprobation = DATE_APPROBATION_EDEFAULT;

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
	 * The cached value of the '{@link #getAPourPlanAideDeploiementPlanParticulier() <em>APour Plan Aide Deploiement Plan Particulier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourPlanAideDeploiementPlanParticulier()
	 * @generated
	 * @ordered
	 */
	protected TypePlanParticulier aPourPlanAideDeploiementPlanParticulier;

	/**
	 * The cached value of the '{@link #getAPourPlanAppuiContreMobilitePlanParticulier() <em>APour Plan Appui Contre Mobilite Plan Particulier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourPlanAppuiContreMobilitePlanParticulier()
	 * @generated
	 * @ordered
	 */
	protected TypePlanParticulier aPourPlanAppuiContreMobilitePlanParticulier;

	/**
	 * The cached value of the '{@link #getAPourPlanAppuiMobilitePlanParticulier() <em>APour Plan Appui Mobilite Plan Particulier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourPlanAppuiMobilitePlanParticulier()
	 * @generated
	 * @ordered
	 */
	protected TypePlanParticulier aPourPlanAppuiMobilitePlanParticulier;

	/**
	 * The cached value of the '{@link #getAPourPlanificationPlanification() <em>APour Planification Planification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourPlanificationPlanification()
	 * @generated
	 * @ordered
	 */
	protected TypePlanification aPourPlanificationPlanification;

	/**
	 * The cached value of the '{@link #getAPourHypothesePlanification() <em>APour Hypothese Planification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourHypothesePlanification()
	 * @generated
	 * @ordered
	 */
	protected EList<TypePlanification> aPourHypothesePlanification;

	/**
	 * The cached value of the '{@link #getAPourCrIncidentCrIncident() <em>APour Cr Incident Cr Incident</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCrIncidentCrIncident()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeCrIncident> aPourCrIncidentCrIncident;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypePlanMixteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePlanMixte();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PLAN_MIXTE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateProposition() {
		return dateProposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateProposition(XMLGregorianCalendar newDateProposition) {
		XMLGregorianCalendar oldDateProposition = dateProposition;
		dateProposition = newDateProposition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PLAN_MIXTE__DATE_PROPOSITION, oldDateProposition, dateProposition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateApprobation() {
		return dateApprobation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateApprobation(XMLGregorianCalendar newDateApprobation) {
		XMLGregorianCalendar oldDateApprobation = dateApprobation;
		dateApprobation = newDateApprobation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PLAN_MIXTE__DATE_APPROBATION, oldDateApprobation, dateApprobation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PLAN_MIXTE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PLAN_MIXTE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypePlanParticulier getAPourPlanAideDeploiementPlanParticulier() {
		return aPourPlanAideDeploiementPlanParticulier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourPlanAideDeploiementPlanParticulier(TypePlanParticulier newAPourPlanAideDeploiementPlanParticulier, NotificationChain msgs) {
		TypePlanParticulier oldAPourPlanAideDeploiementPlanParticulier = aPourPlanAideDeploiementPlanParticulier;
		aPourPlanAideDeploiementPlanParticulier = newAPourPlanAideDeploiementPlanParticulier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PLAN_MIXTE__APOUR_PLAN_AIDE_DEPLOIEMENT_PLAN_PARTICULIER, oldAPourPlanAideDeploiementPlanParticulier, newAPourPlanAideDeploiementPlanParticulier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourPlanAideDeploiementPlanParticulier(TypePlanParticulier newAPourPlanAideDeploiementPlanParticulier) {
		if (newAPourPlanAideDeploiementPlanParticulier != aPourPlanAideDeploiementPlanParticulier) {
			NotificationChain msgs = null;
			if (aPourPlanAideDeploiementPlanParticulier != null)
				msgs = ((InternalEObject)aPourPlanAideDeploiementPlanParticulier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PLAN_MIXTE__APOUR_PLAN_AIDE_DEPLOIEMENT_PLAN_PARTICULIER, null, msgs);
			if (newAPourPlanAideDeploiementPlanParticulier != null)
				msgs = ((InternalEObject)newAPourPlanAideDeploiementPlanParticulier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PLAN_MIXTE__APOUR_PLAN_AIDE_DEPLOIEMENT_PLAN_PARTICULIER, null, msgs);
			msgs = basicSetAPourPlanAideDeploiementPlanParticulier(newAPourPlanAideDeploiementPlanParticulier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PLAN_MIXTE__APOUR_PLAN_AIDE_DEPLOIEMENT_PLAN_PARTICULIER, newAPourPlanAideDeploiementPlanParticulier, newAPourPlanAideDeploiementPlanParticulier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypePlanParticulier getAPourPlanAppuiContreMobilitePlanParticulier() {
		return aPourPlanAppuiContreMobilitePlanParticulier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourPlanAppuiContreMobilitePlanParticulier(TypePlanParticulier newAPourPlanAppuiContreMobilitePlanParticulier, NotificationChain msgs) {
		TypePlanParticulier oldAPourPlanAppuiContreMobilitePlanParticulier = aPourPlanAppuiContreMobilitePlanParticulier;
		aPourPlanAppuiContreMobilitePlanParticulier = newAPourPlanAppuiContreMobilitePlanParticulier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PLAN_MIXTE__APOUR_PLAN_APPUI_CONTRE_MOBILITE_PLAN_PARTICULIER, oldAPourPlanAppuiContreMobilitePlanParticulier, newAPourPlanAppuiContreMobilitePlanParticulier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourPlanAppuiContreMobilitePlanParticulier(TypePlanParticulier newAPourPlanAppuiContreMobilitePlanParticulier) {
		if (newAPourPlanAppuiContreMobilitePlanParticulier != aPourPlanAppuiContreMobilitePlanParticulier) {
			NotificationChain msgs = null;
			if (aPourPlanAppuiContreMobilitePlanParticulier != null)
				msgs = ((InternalEObject)aPourPlanAppuiContreMobilitePlanParticulier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PLAN_MIXTE__APOUR_PLAN_APPUI_CONTRE_MOBILITE_PLAN_PARTICULIER, null, msgs);
			if (newAPourPlanAppuiContreMobilitePlanParticulier != null)
				msgs = ((InternalEObject)newAPourPlanAppuiContreMobilitePlanParticulier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PLAN_MIXTE__APOUR_PLAN_APPUI_CONTRE_MOBILITE_PLAN_PARTICULIER, null, msgs);
			msgs = basicSetAPourPlanAppuiContreMobilitePlanParticulier(newAPourPlanAppuiContreMobilitePlanParticulier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PLAN_MIXTE__APOUR_PLAN_APPUI_CONTRE_MOBILITE_PLAN_PARTICULIER, newAPourPlanAppuiContreMobilitePlanParticulier, newAPourPlanAppuiContreMobilitePlanParticulier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypePlanParticulier getAPourPlanAppuiMobilitePlanParticulier() {
		return aPourPlanAppuiMobilitePlanParticulier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourPlanAppuiMobilitePlanParticulier(TypePlanParticulier newAPourPlanAppuiMobilitePlanParticulier, NotificationChain msgs) {
		TypePlanParticulier oldAPourPlanAppuiMobilitePlanParticulier = aPourPlanAppuiMobilitePlanParticulier;
		aPourPlanAppuiMobilitePlanParticulier = newAPourPlanAppuiMobilitePlanParticulier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PLAN_MIXTE__APOUR_PLAN_APPUI_MOBILITE_PLAN_PARTICULIER, oldAPourPlanAppuiMobilitePlanParticulier, newAPourPlanAppuiMobilitePlanParticulier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourPlanAppuiMobilitePlanParticulier(TypePlanParticulier newAPourPlanAppuiMobilitePlanParticulier) {
		if (newAPourPlanAppuiMobilitePlanParticulier != aPourPlanAppuiMobilitePlanParticulier) {
			NotificationChain msgs = null;
			if (aPourPlanAppuiMobilitePlanParticulier != null)
				msgs = ((InternalEObject)aPourPlanAppuiMobilitePlanParticulier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PLAN_MIXTE__APOUR_PLAN_APPUI_MOBILITE_PLAN_PARTICULIER, null, msgs);
			if (newAPourPlanAppuiMobilitePlanParticulier != null)
				msgs = ((InternalEObject)newAPourPlanAppuiMobilitePlanParticulier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PLAN_MIXTE__APOUR_PLAN_APPUI_MOBILITE_PLAN_PARTICULIER, null, msgs);
			msgs = basicSetAPourPlanAppuiMobilitePlanParticulier(newAPourPlanAppuiMobilitePlanParticulier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PLAN_MIXTE__APOUR_PLAN_APPUI_MOBILITE_PLAN_PARTICULIER, newAPourPlanAppuiMobilitePlanParticulier, newAPourPlanAppuiMobilitePlanParticulier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypePlanification getAPourPlanificationPlanification() {
		return aPourPlanificationPlanification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourPlanificationPlanification(TypePlanification newAPourPlanificationPlanification, NotificationChain msgs) {
		TypePlanification oldAPourPlanificationPlanification = aPourPlanificationPlanification;
		aPourPlanificationPlanification = newAPourPlanificationPlanification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PLAN_MIXTE__APOUR_PLANIFICATION_PLANIFICATION, oldAPourPlanificationPlanification, newAPourPlanificationPlanification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourPlanificationPlanification(TypePlanification newAPourPlanificationPlanification) {
		if (newAPourPlanificationPlanification != aPourPlanificationPlanification) {
			NotificationChain msgs = null;
			if (aPourPlanificationPlanification != null)
				msgs = ((InternalEObject)aPourPlanificationPlanification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PLAN_MIXTE__APOUR_PLANIFICATION_PLANIFICATION, null, msgs);
			if (newAPourPlanificationPlanification != null)
				msgs = ((InternalEObject)newAPourPlanificationPlanification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PLAN_MIXTE__APOUR_PLANIFICATION_PLANIFICATION, null, msgs);
			msgs = basicSetAPourPlanificationPlanification(newAPourPlanificationPlanification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PLAN_MIXTE__APOUR_PLANIFICATION_PLANIFICATION, newAPourPlanificationPlanification, newAPourPlanificationPlanification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePlanification> getAPourHypothesePlanification() {
		if (aPourHypothesePlanification == null) {
			aPourHypothesePlanification = new EObjectContainmentEList<TypePlanification>(TypePlanification.class, this, SchemaPackage.TYPE_PLAN_MIXTE__APOUR_HYPOTHESE_PLANIFICATION);
		}
		return aPourHypothesePlanification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeCrIncident> getAPourCrIncidentCrIncident() {
		if (aPourCrIncidentCrIncident == null) {
			aPourCrIncidentCrIncident = new EObjectContainmentEList<TypeCrIncident>(TypeCrIncident.class, this, SchemaPackage.TYPE_PLAN_MIXTE__APOUR_CR_INCIDENT_CR_INCIDENT);
		}
		return aPourCrIncidentCrIncident;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_PLAN_MIXTE__APOUR_PLAN_AIDE_DEPLOIEMENT_PLAN_PARTICULIER:
				return basicSetAPourPlanAideDeploiementPlanParticulier(null, msgs);
			case SchemaPackage.TYPE_PLAN_MIXTE__APOUR_PLAN_APPUI_CONTRE_MOBILITE_PLAN_PARTICULIER:
				return basicSetAPourPlanAppuiContreMobilitePlanParticulier(null, msgs);
			case SchemaPackage.TYPE_PLAN_MIXTE__APOUR_PLAN_APPUI_MOBILITE_PLAN_PARTICULIER:
				return basicSetAPourPlanAppuiMobilitePlanParticulier(null, msgs);
			case SchemaPackage.TYPE_PLAN_MIXTE__APOUR_PLANIFICATION_PLANIFICATION:
				return basicSetAPourPlanificationPlanification(null, msgs);
			case SchemaPackage.TYPE_PLAN_MIXTE__APOUR_HYPOTHESE_PLANIFICATION:
				return ((InternalEList<?>)getAPourHypothesePlanification()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PLAN_MIXTE__APOUR_CR_INCIDENT_CR_INCIDENT:
				return ((InternalEList<?>)getAPourCrIncidentCrIncident()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_PLAN_MIXTE__NOM:
				return getNom();
			case SchemaPackage.TYPE_PLAN_MIXTE__DATE_PROPOSITION:
				return getDateProposition();
			case SchemaPackage.TYPE_PLAN_MIXTE__DATE_APPROBATION:
				return getDateApprobation();
			case SchemaPackage.TYPE_PLAN_MIXTE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_PLAN_MIXTE__CE:
				return getCE();
			case SchemaPackage.TYPE_PLAN_MIXTE__APOUR_PLAN_AIDE_DEPLOIEMENT_PLAN_PARTICULIER:
				return getAPourPlanAideDeploiementPlanParticulier();
			case SchemaPackage.TYPE_PLAN_MIXTE__APOUR_PLAN_APPUI_CONTRE_MOBILITE_PLAN_PARTICULIER:
				return getAPourPlanAppuiContreMobilitePlanParticulier();
			case SchemaPackage.TYPE_PLAN_MIXTE__APOUR_PLAN_APPUI_MOBILITE_PLAN_PARTICULIER:
				return getAPourPlanAppuiMobilitePlanParticulier();
			case SchemaPackage.TYPE_PLAN_MIXTE__APOUR_PLANIFICATION_PLANIFICATION:
				return getAPourPlanificationPlanification();
			case SchemaPackage.TYPE_PLAN_MIXTE__APOUR_HYPOTHESE_PLANIFICATION:
				return getAPourHypothesePlanification();
			case SchemaPackage.TYPE_PLAN_MIXTE__APOUR_CR_INCIDENT_CR_INCIDENT:
				return getAPourCrIncidentCrIncident();
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
			case SchemaPackage.TYPE_PLAN_MIXTE__NOM:
				setNom((String)newValue);
				return;
			case SchemaPackage.TYPE_PLAN_MIXTE__DATE_PROPOSITION:
				setDateProposition((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_PLAN_MIXTE__DATE_APPROBATION:
				setDateApprobation((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_PLAN_MIXTE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_PLAN_MIXTE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_PLAN_MIXTE__APOUR_PLAN_AIDE_DEPLOIEMENT_PLAN_PARTICULIER:
				setAPourPlanAideDeploiementPlanParticulier((TypePlanParticulier)newValue);
				return;
			case SchemaPackage.TYPE_PLAN_MIXTE__APOUR_PLAN_APPUI_CONTRE_MOBILITE_PLAN_PARTICULIER:
				setAPourPlanAppuiContreMobilitePlanParticulier((TypePlanParticulier)newValue);
				return;
			case SchemaPackage.TYPE_PLAN_MIXTE__APOUR_PLAN_APPUI_MOBILITE_PLAN_PARTICULIER:
				setAPourPlanAppuiMobilitePlanParticulier((TypePlanParticulier)newValue);
				return;
			case SchemaPackage.TYPE_PLAN_MIXTE__APOUR_PLANIFICATION_PLANIFICATION:
				setAPourPlanificationPlanification((TypePlanification)newValue);
				return;
			case SchemaPackage.TYPE_PLAN_MIXTE__APOUR_HYPOTHESE_PLANIFICATION:
				getAPourHypothesePlanification().clear();
				getAPourHypothesePlanification().addAll((Collection<? extends TypePlanification>)newValue);
				return;
			case SchemaPackage.TYPE_PLAN_MIXTE__APOUR_CR_INCIDENT_CR_INCIDENT:
				getAPourCrIncidentCrIncident().clear();
				getAPourCrIncidentCrIncident().addAll((Collection<? extends TypeCrIncident>)newValue);
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
			case SchemaPackage.TYPE_PLAN_MIXTE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PLAN_MIXTE__DATE_PROPOSITION:
				setDateProposition(DATE_PROPOSITION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PLAN_MIXTE__DATE_APPROBATION:
				setDateApprobation(DATE_APPROBATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PLAN_MIXTE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PLAN_MIXTE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PLAN_MIXTE__APOUR_PLAN_AIDE_DEPLOIEMENT_PLAN_PARTICULIER:
				setAPourPlanAideDeploiementPlanParticulier((TypePlanParticulier)null);
				return;
			case SchemaPackage.TYPE_PLAN_MIXTE__APOUR_PLAN_APPUI_CONTRE_MOBILITE_PLAN_PARTICULIER:
				setAPourPlanAppuiContreMobilitePlanParticulier((TypePlanParticulier)null);
				return;
			case SchemaPackage.TYPE_PLAN_MIXTE__APOUR_PLAN_APPUI_MOBILITE_PLAN_PARTICULIER:
				setAPourPlanAppuiMobilitePlanParticulier((TypePlanParticulier)null);
				return;
			case SchemaPackage.TYPE_PLAN_MIXTE__APOUR_PLANIFICATION_PLANIFICATION:
				setAPourPlanificationPlanification((TypePlanification)null);
				return;
			case SchemaPackage.TYPE_PLAN_MIXTE__APOUR_HYPOTHESE_PLANIFICATION:
				getAPourHypothesePlanification().clear();
				return;
			case SchemaPackage.TYPE_PLAN_MIXTE__APOUR_CR_INCIDENT_CR_INCIDENT:
				getAPourCrIncidentCrIncident().clear();
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
			case SchemaPackage.TYPE_PLAN_MIXTE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case SchemaPackage.TYPE_PLAN_MIXTE__DATE_PROPOSITION:
				return DATE_PROPOSITION_EDEFAULT == null ? dateProposition != null : !DATE_PROPOSITION_EDEFAULT.equals(dateProposition);
			case SchemaPackage.TYPE_PLAN_MIXTE__DATE_APPROBATION:
				return DATE_APPROBATION_EDEFAULT == null ? dateApprobation != null : !DATE_APPROBATION_EDEFAULT.equals(dateApprobation);
			case SchemaPackage.TYPE_PLAN_MIXTE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_PLAN_MIXTE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_PLAN_MIXTE__APOUR_PLAN_AIDE_DEPLOIEMENT_PLAN_PARTICULIER:
				return aPourPlanAideDeploiementPlanParticulier != null;
			case SchemaPackage.TYPE_PLAN_MIXTE__APOUR_PLAN_APPUI_CONTRE_MOBILITE_PLAN_PARTICULIER:
				return aPourPlanAppuiContreMobilitePlanParticulier != null;
			case SchemaPackage.TYPE_PLAN_MIXTE__APOUR_PLAN_APPUI_MOBILITE_PLAN_PARTICULIER:
				return aPourPlanAppuiMobilitePlanParticulier != null;
			case SchemaPackage.TYPE_PLAN_MIXTE__APOUR_PLANIFICATION_PLANIFICATION:
				return aPourPlanificationPlanification != null;
			case SchemaPackage.TYPE_PLAN_MIXTE__APOUR_HYPOTHESE_PLANIFICATION:
				return aPourHypothesePlanification != null && !aPourHypothesePlanification.isEmpty();
			case SchemaPackage.TYPE_PLAN_MIXTE__APOUR_CR_INCIDENT_CR_INCIDENT:
				return aPourCrIncidentCrIncident != null && !aPourCrIncidentCrIncident.isEmpty();
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
		result.append(" (nom: ");
		result.append(nom);
		result.append(", dateProposition: ");
		result.append(dateProposition);
		result.append(", dateApprobation: ");
		result.append(dateApprobation);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypePlanMixteImpl
