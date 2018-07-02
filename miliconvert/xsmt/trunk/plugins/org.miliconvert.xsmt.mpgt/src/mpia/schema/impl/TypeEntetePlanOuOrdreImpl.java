/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeDateHeure;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoEntetePlanOuOrdreFuseauHoraire;
import mpia.schema.TypeEntetePlanOuOrdre;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Entete Plan Ou Ordre</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEntetePlanOuOrdreImpl#getDate <em>Date</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEntetePlanOuOrdreImpl#getFuseauHoraire <em>Fuseau Horaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEntetePlanOuOrdreImpl#getNumeroSerie <em>Numero Serie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEntetePlanOuOrdreImpl#getNumeroReference <em>Numero Reference</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEntetePlanOuOrdreImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEntetePlanOuOrdreImpl#getSurnom <em>Surnom</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEntetePlanOuOrdreImpl#getTypeForceConcerne <em>Type Force Concerne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEntetePlanOuOrdreImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEntetePlanOuOrdreImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEntetePlanOuOrdreImpl#getAPourDegreClassificationDegreClassification <em>APour Degre Classification Degre Classification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEntetePlanOuOrdreImpl extends EObjectImpl implements TypeEntetePlanOuOrdre {
	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDateHeure date;

	/**
	 * The default value of the '{@link #getFuseauHoraire() <em>Fuseau Horaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuseauHoraire()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEntetePlanOuOrdreFuseauHoraire FUSEAU_HORAIRE_EDEFAULT = TypeDictionaryDicoEntetePlanOuOrdreFuseauHoraire.Z;

	/**
	 * The cached value of the '{@link #getFuseauHoraire() <em>Fuseau Horaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuseauHoraire()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEntetePlanOuOrdreFuseauHoraire fuseauHoraire = FUSEAU_HORAIRE_EDEFAULT;

	/**
	 * This is true if the Fuseau Horaire attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fuseauHoraireESet;

	/**
	 * The default value of the '{@link #getNumeroSerie() <em>Numero Serie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroSerie()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMERO_SERIE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumeroSerie() <em>Numero Serie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroSerie()
	 * @generated
	 * @ordered
	 */
	protected String numeroSerie = NUMERO_SERIE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumeroReference() <em>Numero Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroReference()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMERO_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumeroReference() <em>Numero Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroReference()
	 * @generated
	 * @ordered
	 */
	protected String numeroReference = NUMERO_REFERENCE_EDEFAULT;

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
	 * The default value of the '{@link #getSurnom() <em>Surnom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurnom()
	 * @generated
	 * @ordered
	 */
	protected static final String SURNOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSurnom() <em>Surnom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurnom()
	 * @generated
	 * @ordered
	 */
	protected String surnom = SURNOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeForceConcerne() <em>Type Force Concerne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeForceConcerne()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_FORCE_CONCERNE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeForceConcerne() <em>Type Force Concerne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeForceConcerne()
	 * @generated
	 * @ordered
	 */
	protected String typeForceConcerne = TYPE_FORCE_CONCERNE_EDEFAULT;

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
	 * The cached value of the '{@link #getAPourDegreClassificationDegreClassification() <em>APour Degre Classification Degre Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourDegreClassificationDegreClassification()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourDegreClassificationDegreClassification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEntetePlanOuOrdreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEntetePlanOuOrdre();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDateHeure getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(TypeDataTypeDateHeure newDate, NotificationChain msgs) {
		TypeDataTypeDateHeure oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__DATE, oldDate, newDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(TypeDataTypeDateHeure newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEntetePlanOuOrdreFuseauHoraire getFuseauHoraire() {
		return fuseauHoraire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFuseauHoraire(TypeDictionaryDicoEntetePlanOuOrdreFuseauHoraire newFuseauHoraire) {
		TypeDictionaryDicoEntetePlanOuOrdreFuseauHoraire oldFuseauHoraire = fuseauHoraire;
		fuseauHoraire = newFuseauHoraire == null ? FUSEAU_HORAIRE_EDEFAULT : newFuseauHoraire;
		boolean oldFuseauHoraireESet = fuseauHoraireESet;
		fuseauHoraireESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__FUSEAU_HORAIRE, oldFuseauHoraire, fuseauHoraire, !oldFuseauHoraireESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFuseauHoraire() {
		TypeDictionaryDicoEntetePlanOuOrdreFuseauHoraire oldFuseauHoraire = fuseauHoraire;
		boolean oldFuseauHoraireESet = fuseauHoraireESet;
		fuseauHoraire = FUSEAU_HORAIRE_EDEFAULT;
		fuseauHoraireESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__FUSEAU_HORAIRE, oldFuseauHoraire, FUSEAU_HORAIRE_EDEFAULT, oldFuseauHoraireESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFuseauHoraire() {
		return fuseauHoraireESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumeroSerie() {
		return numeroSerie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroSerie(String newNumeroSerie) {
		String oldNumeroSerie = numeroSerie;
		numeroSerie = newNumeroSerie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__NUMERO_SERIE, oldNumeroSerie, numeroSerie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumeroReference() {
		return numeroReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroReference(String newNumeroReference) {
		String oldNumeroReference = numeroReference;
		numeroReference = newNumeroReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__NUMERO_REFERENCE, oldNumeroReference, numeroReference));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSurnom() {
		return surnom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSurnom(String newSurnom) {
		String oldSurnom = surnom;
		surnom = newSurnom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__SURNOM, oldSurnom, surnom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeForceConcerne() {
		return typeForceConcerne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeForceConcerne(String newTypeForceConcerne) {
		String oldTypeForceConcerne = typeForceConcerne;
		typeForceConcerne = newTypeForceConcerne;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__TYPE_FORCE_CONCERNE, oldTypeForceConcerne, typeForceConcerne));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourDegreClassificationDegreClassification() {
		return aPourDegreClassificationDegreClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourDegreClassificationDegreClassification(TypeAssociation newAPourDegreClassificationDegreClassification, NotificationChain msgs) {
		TypeAssociation oldAPourDegreClassificationDegreClassification = aPourDegreClassificationDegreClassification;
		aPourDegreClassificationDegreClassification = newAPourDegreClassificationDegreClassification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__APOUR_DEGRE_CLASSIFICATION_DEGRE_CLASSIFICATION, oldAPourDegreClassificationDegreClassification, newAPourDegreClassificationDegreClassification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourDegreClassificationDegreClassification(TypeAssociation newAPourDegreClassificationDegreClassification) {
		if (newAPourDegreClassificationDegreClassification != aPourDegreClassificationDegreClassification) {
			NotificationChain msgs = null;
			if (aPourDegreClassificationDegreClassification != null)
				msgs = ((InternalEObject)aPourDegreClassificationDegreClassification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__APOUR_DEGRE_CLASSIFICATION_DEGRE_CLASSIFICATION, null, msgs);
			if (newAPourDegreClassificationDegreClassification != null)
				msgs = ((InternalEObject)newAPourDegreClassificationDegreClassification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__APOUR_DEGRE_CLASSIFICATION_DEGRE_CLASSIFICATION, null, msgs);
			msgs = basicSetAPourDegreClassificationDegreClassification(newAPourDegreClassificationDegreClassification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__APOUR_DEGRE_CLASSIFICATION_DEGRE_CLASSIFICATION, newAPourDegreClassificationDegreClassification, newAPourDegreClassificationDegreClassification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__DATE:
				return basicSetDate(null, msgs);
			case SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__APOUR_DEGRE_CLASSIFICATION_DEGRE_CLASSIFICATION:
				return basicSetAPourDegreClassificationDegreClassification(null, msgs);
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
			case SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__DATE:
				return getDate();
			case SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__FUSEAU_HORAIRE:
				return getFuseauHoraire();
			case SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__NUMERO_SERIE:
				return getNumeroSerie();
			case SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__NUMERO_REFERENCE:
				return getNumeroReference();
			case SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__NOM:
				return getNom();
			case SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__SURNOM:
				return getSurnom();
			case SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__TYPE_FORCE_CONCERNE:
				return getTypeForceConcerne();
			case SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__CE:
				return getCE();
			case SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__APOUR_DEGRE_CLASSIFICATION_DEGRE_CLASSIFICATION:
				return getAPourDegreClassificationDegreClassification();
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
			case SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__DATE:
				setDate((TypeDataTypeDateHeure)newValue);
				return;
			case SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__FUSEAU_HORAIRE:
				setFuseauHoraire((TypeDictionaryDicoEntetePlanOuOrdreFuseauHoraire)newValue);
				return;
			case SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__NUMERO_SERIE:
				setNumeroSerie((String)newValue);
				return;
			case SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__NUMERO_REFERENCE:
				setNumeroReference((String)newValue);
				return;
			case SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__NOM:
				setNom((String)newValue);
				return;
			case SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__SURNOM:
				setSurnom((String)newValue);
				return;
			case SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__TYPE_FORCE_CONCERNE:
				setTypeForceConcerne((String)newValue);
				return;
			case SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__APOUR_DEGRE_CLASSIFICATION_DEGRE_CLASSIFICATION:
				setAPourDegreClassificationDegreClassification((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__DATE:
				setDate((TypeDataTypeDateHeure)null);
				return;
			case SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__FUSEAU_HORAIRE:
				unsetFuseauHoraire();
				return;
			case SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__NUMERO_SERIE:
				setNumeroSerie(NUMERO_SERIE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__NUMERO_REFERENCE:
				setNumeroReference(NUMERO_REFERENCE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__SURNOM:
				setSurnom(SURNOM_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__TYPE_FORCE_CONCERNE:
				setTypeForceConcerne(TYPE_FORCE_CONCERNE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__APOUR_DEGRE_CLASSIFICATION_DEGRE_CLASSIFICATION:
				setAPourDegreClassificationDegreClassification((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__DATE:
				return date != null;
			case SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__FUSEAU_HORAIRE:
				return isSetFuseauHoraire();
			case SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__NUMERO_SERIE:
				return NUMERO_SERIE_EDEFAULT == null ? numeroSerie != null : !NUMERO_SERIE_EDEFAULT.equals(numeroSerie);
			case SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__NUMERO_REFERENCE:
				return NUMERO_REFERENCE_EDEFAULT == null ? numeroReference != null : !NUMERO_REFERENCE_EDEFAULT.equals(numeroReference);
			case SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__SURNOM:
				return SURNOM_EDEFAULT == null ? surnom != null : !SURNOM_EDEFAULT.equals(surnom);
			case SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__TYPE_FORCE_CONCERNE:
				return TYPE_FORCE_CONCERNE_EDEFAULT == null ? typeForceConcerne != null : !TYPE_FORCE_CONCERNE_EDEFAULT.equals(typeForceConcerne);
			case SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ENTETE_PLAN_OU_ORDRE__APOUR_DEGRE_CLASSIFICATION_DEGRE_CLASSIFICATION:
				return aPourDegreClassificationDegreClassification != null;
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
		result.append(" (fuseauHoraire: ");
		if (fuseauHoraireESet) result.append(fuseauHoraire); else result.append("<unset>");
		result.append(", numeroSerie: ");
		result.append(numeroSerie);
		result.append(", numeroReference: ");
		result.append(numeroReference);
		result.append(", nom: ");
		result.append(nom);
		result.append(", surnom: ");
		result.append(surnom);
		result.append(", typeForceConcerne: ");
		result.append(typeForceConcerne);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeEntetePlanOuOrdreImpl
