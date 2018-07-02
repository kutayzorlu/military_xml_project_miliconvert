/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoPrevisionObservationCategorie;
import mpia.schema.TypePrevisionObservation;
import mpia.schema.TypePrevisionObservationParTranche;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Prevision Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePrevisionObservationImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrevisionObservationImpl#getGdhDebutValidite <em>Gdh Debut Validite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrevisionObservationImpl#getGdhFinValidite <em>Gdh Fin Validite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrevisionObservationImpl#getAPourCaracteristiqueDeuxiemeTranchePrevisionObservationParTranche <em>APour Caracteristique Deuxieme Tranche Prevision Observation Par Tranche</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrevisionObservationImpl#getAPourCaracteristiquePremiereTranchePrevisionObservationParTranche <em>APour Caracteristique Premiere Tranche Prevision Observation Par Tranche</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrevisionObservationImpl#getAPourCaracteristiqueTroisiemeTranchePrevisionObservationParTranche <em>APour Caracteristique Troisieme Tranche Prevision Observation Par Tranche</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePrevisionObservationImpl extends TypeInstanceObjetImpl implements TypePrevisionObservation {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPrevisionObservationCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoPrevisionObservationCategorie.WEAOBS;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPrevisionObservationCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getGdhDebutValidite() <em>Gdh Debut Validite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGdhDebutValidite()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GDH_DEBUT_VALIDITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGdhDebutValidite() <em>Gdh Debut Validite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGdhDebutValidite()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gdhDebutValidite = GDH_DEBUT_VALIDITE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGdhFinValidite() <em>Gdh Fin Validite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGdhFinValidite()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GDH_FIN_VALIDITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGdhFinValidite() <em>Gdh Fin Validite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGdhFinValidite()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gdhFinValidite = GDH_FIN_VALIDITE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAPourCaracteristiqueDeuxiemeTranchePrevisionObservationParTranche() <em>APour Caracteristique Deuxieme Tranche Prevision Observation Par Tranche</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCaracteristiqueDeuxiemeTranchePrevisionObservationParTranche()
	 * @generated
	 * @ordered
	 */
	protected TypePrevisionObservationParTranche aPourCaracteristiqueDeuxiemeTranchePrevisionObservationParTranche;

	/**
	 * The cached value of the '{@link #getAPourCaracteristiquePremiereTranchePrevisionObservationParTranche() <em>APour Caracteristique Premiere Tranche Prevision Observation Par Tranche</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCaracteristiquePremiereTranchePrevisionObservationParTranche()
	 * @generated
	 * @ordered
	 */
	protected TypePrevisionObservationParTranche aPourCaracteristiquePremiereTranchePrevisionObservationParTranche;

	/**
	 * The cached value of the '{@link #getAPourCaracteristiqueTroisiemeTranchePrevisionObservationParTranche() <em>APour Caracteristique Troisieme Tranche Prevision Observation Par Tranche</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCaracteristiqueTroisiemeTranchePrevisionObservationParTranche()
	 * @generated
	 * @ordered
	 */
	protected TypePrevisionObservationParTranche aPourCaracteristiqueTroisiemeTranchePrevisionObservationParTranche;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypePrevisionObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePrevisionObservation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPrevisionObservationCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoPrevisionObservationCategorie newCategorie) {
		TypeDictionaryDicoPrevisionObservationCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PREVISION_OBSERVATION__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoPrevisionObservationCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PREVISION_OBSERVATION__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public XMLGregorianCalendar getGdhDebutValidite() {
		return gdhDebutValidite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGdhDebutValidite(XMLGregorianCalendar newGdhDebutValidite) {
		XMLGregorianCalendar oldGdhDebutValidite = gdhDebutValidite;
		gdhDebutValidite = newGdhDebutValidite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PREVISION_OBSERVATION__GDH_DEBUT_VALIDITE, oldGdhDebutValidite, gdhDebutValidite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGdhFinValidite() {
		return gdhFinValidite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGdhFinValidite(XMLGregorianCalendar newGdhFinValidite) {
		XMLGregorianCalendar oldGdhFinValidite = gdhFinValidite;
		gdhFinValidite = newGdhFinValidite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PREVISION_OBSERVATION__GDH_FIN_VALIDITE, oldGdhFinValidite, gdhFinValidite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypePrevisionObservationParTranche getAPourCaracteristiqueDeuxiemeTranchePrevisionObservationParTranche() {
		return aPourCaracteristiqueDeuxiemeTranchePrevisionObservationParTranche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourCaracteristiqueDeuxiemeTranchePrevisionObservationParTranche(TypePrevisionObservationParTranche newAPourCaracteristiqueDeuxiemeTranchePrevisionObservationParTranche, NotificationChain msgs) {
		TypePrevisionObservationParTranche oldAPourCaracteristiqueDeuxiemeTranchePrevisionObservationParTranche = aPourCaracteristiqueDeuxiemeTranchePrevisionObservationParTranche;
		aPourCaracteristiqueDeuxiemeTranchePrevisionObservationParTranche = newAPourCaracteristiqueDeuxiemeTranchePrevisionObservationParTranche;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PREVISION_OBSERVATION__APOUR_CARACTERISTIQUE_DEUXIEME_TRANCHE_PREVISION_OBSERVATION_PAR_TRANCHE, oldAPourCaracteristiqueDeuxiemeTranchePrevisionObservationParTranche, newAPourCaracteristiqueDeuxiemeTranchePrevisionObservationParTranche);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourCaracteristiqueDeuxiemeTranchePrevisionObservationParTranche(TypePrevisionObservationParTranche newAPourCaracteristiqueDeuxiemeTranchePrevisionObservationParTranche) {
		if (newAPourCaracteristiqueDeuxiemeTranchePrevisionObservationParTranche != aPourCaracteristiqueDeuxiemeTranchePrevisionObservationParTranche) {
			NotificationChain msgs = null;
			if (aPourCaracteristiqueDeuxiemeTranchePrevisionObservationParTranche != null)
				msgs = ((InternalEObject)aPourCaracteristiqueDeuxiemeTranchePrevisionObservationParTranche).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PREVISION_OBSERVATION__APOUR_CARACTERISTIQUE_DEUXIEME_TRANCHE_PREVISION_OBSERVATION_PAR_TRANCHE, null, msgs);
			if (newAPourCaracteristiqueDeuxiemeTranchePrevisionObservationParTranche != null)
				msgs = ((InternalEObject)newAPourCaracteristiqueDeuxiemeTranchePrevisionObservationParTranche).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PREVISION_OBSERVATION__APOUR_CARACTERISTIQUE_DEUXIEME_TRANCHE_PREVISION_OBSERVATION_PAR_TRANCHE, null, msgs);
			msgs = basicSetAPourCaracteristiqueDeuxiemeTranchePrevisionObservationParTranche(newAPourCaracteristiqueDeuxiemeTranchePrevisionObservationParTranche, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PREVISION_OBSERVATION__APOUR_CARACTERISTIQUE_DEUXIEME_TRANCHE_PREVISION_OBSERVATION_PAR_TRANCHE, newAPourCaracteristiqueDeuxiemeTranchePrevisionObservationParTranche, newAPourCaracteristiqueDeuxiemeTranchePrevisionObservationParTranche));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypePrevisionObservationParTranche getAPourCaracteristiquePremiereTranchePrevisionObservationParTranche() {
		return aPourCaracteristiquePremiereTranchePrevisionObservationParTranche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourCaracteristiquePremiereTranchePrevisionObservationParTranche(TypePrevisionObservationParTranche newAPourCaracteristiquePremiereTranchePrevisionObservationParTranche, NotificationChain msgs) {
		TypePrevisionObservationParTranche oldAPourCaracteristiquePremiereTranchePrevisionObservationParTranche = aPourCaracteristiquePremiereTranchePrevisionObservationParTranche;
		aPourCaracteristiquePremiereTranchePrevisionObservationParTranche = newAPourCaracteristiquePremiereTranchePrevisionObservationParTranche;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PREVISION_OBSERVATION__APOUR_CARACTERISTIQUE_PREMIERE_TRANCHE_PREVISION_OBSERVATION_PAR_TRANCHE, oldAPourCaracteristiquePremiereTranchePrevisionObservationParTranche, newAPourCaracteristiquePremiereTranchePrevisionObservationParTranche);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourCaracteristiquePremiereTranchePrevisionObservationParTranche(TypePrevisionObservationParTranche newAPourCaracteristiquePremiereTranchePrevisionObservationParTranche) {
		if (newAPourCaracteristiquePremiereTranchePrevisionObservationParTranche != aPourCaracteristiquePremiereTranchePrevisionObservationParTranche) {
			NotificationChain msgs = null;
			if (aPourCaracteristiquePremiereTranchePrevisionObservationParTranche != null)
				msgs = ((InternalEObject)aPourCaracteristiquePremiereTranchePrevisionObservationParTranche).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PREVISION_OBSERVATION__APOUR_CARACTERISTIQUE_PREMIERE_TRANCHE_PREVISION_OBSERVATION_PAR_TRANCHE, null, msgs);
			if (newAPourCaracteristiquePremiereTranchePrevisionObservationParTranche != null)
				msgs = ((InternalEObject)newAPourCaracteristiquePremiereTranchePrevisionObservationParTranche).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PREVISION_OBSERVATION__APOUR_CARACTERISTIQUE_PREMIERE_TRANCHE_PREVISION_OBSERVATION_PAR_TRANCHE, null, msgs);
			msgs = basicSetAPourCaracteristiquePremiereTranchePrevisionObservationParTranche(newAPourCaracteristiquePremiereTranchePrevisionObservationParTranche, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PREVISION_OBSERVATION__APOUR_CARACTERISTIQUE_PREMIERE_TRANCHE_PREVISION_OBSERVATION_PAR_TRANCHE, newAPourCaracteristiquePremiereTranchePrevisionObservationParTranche, newAPourCaracteristiquePremiereTranchePrevisionObservationParTranche));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypePrevisionObservationParTranche getAPourCaracteristiqueTroisiemeTranchePrevisionObservationParTranche() {
		return aPourCaracteristiqueTroisiemeTranchePrevisionObservationParTranche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourCaracteristiqueTroisiemeTranchePrevisionObservationParTranche(TypePrevisionObservationParTranche newAPourCaracteristiqueTroisiemeTranchePrevisionObservationParTranche, NotificationChain msgs) {
		TypePrevisionObservationParTranche oldAPourCaracteristiqueTroisiemeTranchePrevisionObservationParTranche = aPourCaracteristiqueTroisiemeTranchePrevisionObservationParTranche;
		aPourCaracteristiqueTroisiemeTranchePrevisionObservationParTranche = newAPourCaracteristiqueTroisiemeTranchePrevisionObservationParTranche;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PREVISION_OBSERVATION__APOUR_CARACTERISTIQUE_TROISIEME_TRANCHE_PREVISION_OBSERVATION_PAR_TRANCHE, oldAPourCaracteristiqueTroisiemeTranchePrevisionObservationParTranche, newAPourCaracteristiqueTroisiemeTranchePrevisionObservationParTranche);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourCaracteristiqueTroisiemeTranchePrevisionObservationParTranche(TypePrevisionObservationParTranche newAPourCaracteristiqueTroisiemeTranchePrevisionObservationParTranche) {
		if (newAPourCaracteristiqueTroisiemeTranchePrevisionObservationParTranche != aPourCaracteristiqueTroisiemeTranchePrevisionObservationParTranche) {
			NotificationChain msgs = null;
			if (aPourCaracteristiqueTroisiemeTranchePrevisionObservationParTranche != null)
				msgs = ((InternalEObject)aPourCaracteristiqueTroisiemeTranchePrevisionObservationParTranche).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PREVISION_OBSERVATION__APOUR_CARACTERISTIQUE_TROISIEME_TRANCHE_PREVISION_OBSERVATION_PAR_TRANCHE, null, msgs);
			if (newAPourCaracteristiqueTroisiemeTranchePrevisionObservationParTranche != null)
				msgs = ((InternalEObject)newAPourCaracteristiqueTroisiemeTranchePrevisionObservationParTranche).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PREVISION_OBSERVATION__APOUR_CARACTERISTIQUE_TROISIEME_TRANCHE_PREVISION_OBSERVATION_PAR_TRANCHE, null, msgs);
			msgs = basicSetAPourCaracteristiqueTroisiemeTranchePrevisionObservationParTranche(newAPourCaracteristiqueTroisiemeTranchePrevisionObservationParTranche, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PREVISION_OBSERVATION__APOUR_CARACTERISTIQUE_TROISIEME_TRANCHE_PREVISION_OBSERVATION_PAR_TRANCHE, newAPourCaracteristiqueTroisiemeTranchePrevisionObservationParTranche, newAPourCaracteristiqueTroisiemeTranchePrevisionObservationParTranche));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_PREVISION_OBSERVATION__APOUR_CARACTERISTIQUE_DEUXIEME_TRANCHE_PREVISION_OBSERVATION_PAR_TRANCHE:
				return basicSetAPourCaracteristiqueDeuxiemeTranchePrevisionObservationParTranche(null, msgs);
			case SchemaPackage.TYPE_PREVISION_OBSERVATION__APOUR_CARACTERISTIQUE_PREMIERE_TRANCHE_PREVISION_OBSERVATION_PAR_TRANCHE:
				return basicSetAPourCaracteristiquePremiereTranchePrevisionObservationParTranche(null, msgs);
			case SchemaPackage.TYPE_PREVISION_OBSERVATION__APOUR_CARACTERISTIQUE_TROISIEME_TRANCHE_PREVISION_OBSERVATION_PAR_TRANCHE:
				return basicSetAPourCaracteristiqueTroisiemeTranchePrevisionObservationParTranche(null, msgs);
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
			case SchemaPackage.TYPE_PREVISION_OBSERVATION__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_PREVISION_OBSERVATION__GDH_DEBUT_VALIDITE:
				return getGdhDebutValidite();
			case SchemaPackage.TYPE_PREVISION_OBSERVATION__GDH_FIN_VALIDITE:
				return getGdhFinValidite();
			case SchemaPackage.TYPE_PREVISION_OBSERVATION__APOUR_CARACTERISTIQUE_DEUXIEME_TRANCHE_PREVISION_OBSERVATION_PAR_TRANCHE:
				return getAPourCaracteristiqueDeuxiemeTranchePrevisionObservationParTranche();
			case SchemaPackage.TYPE_PREVISION_OBSERVATION__APOUR_CARACTERISTIQUE_PREMIERE_TRANCHE_PREVISION_OBSERVATION_PAR_TRANCHE:
				return getAPourCaracteristiquePremiereTranchePrevisionObservationParTranche();
			case SchemaPackage.TYPE_PREVISION_OBSERVATION__APOUR_CARACTERISTIQUE_TROISIEME_TRANCHE_PREVISION_OBSERVATION_PAR_TRANCHE:
				return getAPourCaracteristiqueTroisiemeTranchePrevisionObservationParTranche();
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
			case SchemaPackage.TYPE_PREVISION_OBSERVATION__CATEGORIE:
				setCategorie((TypeDictionaryDicoPrevisionObservationCategorie)newValue);
				return;
			case SchemaPackage.TYPE_PREVISION_OBSERVATION__GDH_DEBUT_VALIDITE:
				setGdhDebutValidite((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_PREVISION_OBSERVATION__GDH_FIN_VALIDITE:
				setGdhFinValidite((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_PREVISION_OBSERVATION__APOUR_CARACTERISTIQUE_DEUXIEME_TRANCHE_PREVISION_OBSERVATION_PAR_TRANCHE:
				setAPourCaracteristiqueDeuxiemeTranchePrevisionObservationParTranche((TypePrevisionObservationParTranche)newValue);
				return;
			case SchemaPackage.TYPE_PREVISION_OBSERVATION__APOUR_CARACTERISTIQUE_PREMIERE_TRANCHE_PREVISION_OBSERVATION_PAR_TRANCHE:
				setAPourCaracteristiquePremiereTranchePrevisionObservationParTranche((TypePrevisionObservationParTranche)newValue);
				return;
			case SchemaPackage.TYPE_PREVISION_OBSERVATION__APOUR_CARACTERISTIQUE_TROISIEME_TRANCHE_PREVISION_OBSERVATION_PAR_TRANCHE:
				setAPourCaracteristiqueTroisiemeTranchePrevisionObservationParTranche((TypePrevisionObservationParTranche)newValue);
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
			case SchemaPackage.TYPE_PREVISION_OBSERVATION__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_PREVISION_OBSERVATION__GDH_DEBUT_VALIDITE:
				setGdhDebutValidite(GDH_DEBUT_VALIDITE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PREVISION_OBSERVATION__GDH_FIN_VALIDITE:
				setGdhFinValidite(GDH_FIN_VALIDITE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PREVISION_OBSERVATION__APOUR_CARACTERISTIQUE_DEUXIEME_TRANCHE_PREVISION_OBSERVATION_PAR_TRANCHE:
				setAPourCaracteristiqueDeuxiemeTranchePrevisionObservationParTranche((TypePrevisionObservationParTranche)null);
				return;
			case SchemaPackage.TYPE_PREVISION_OBSERVATION__APOUR_CARACTERISTIQUE_PREMIERE_TRANCHE_PREVISION_OBSERVATION_PAR_TRANCHE:
				setAPourCaracteristiquePremiereTranchePrevisionObservationParTranche((TypePrevisionObservationParTranche)null);
				return;
			case SchemaPackage.TYPE_PREVISION_OBSERVATION__APOUR_CARACTERISTIQUE_TROISIEME_TRANCHE_PREVISION_OBSERVATION_PAR_TRANCHE:
				setAPourCaracteristiqueTroisiemeTranchePrevisionObservationParTranche((TypePrevisionObservationParTranche)null);
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
			case SchemaPackage.TYPE_PREVISION_OBSERVATION__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_PREVISION_OBSERVATION__GDH_DEBUT_VALIDITE:
				return GDH_DEBUT_VALIDITE_EDEFAULT == null ? gdhDebutValidite != null : !GDH_DEBUT_VALIDITE_EDEFAULT.equals(gdhDebutValidite);
			case SchemaPackage.TYPE_PREVISION_OBSERVATION__GDH_FIN_VALIDITE:
				return GDH_FIN_VALIDITE_EDEFAULT == null ? gdhFinValidite != null : !GDH_FIN_VALIDITE_EDEFAULT.equals(gdhFinValidite);
			case SchemaPackage.TYPE_PREVISION_OBSERVATION__APOUR_CARACTERISTIQUE_DEUXIEME_TRANCHE_PREVISION_OBSERVATION_PAR_TRANCHE:
				return aPourCaracteristiqueDeuxiemeTranchePrevisionObservationParTranche != null;
			case SchemaPackage.TYPE_PREVISION_OBSERVATION__APOUR_CARACTERISTIQUE_PREMIERE_TRANCHE_PREVISION_OBSERVATION_PAR_TRANCHE:
				return aPourCaracteristiquePremiereTranchePrevisionObservationParTranche != null;
			case SchemaPackage.TYPE_PREVISION_OBSERVATION__APOUR_CARACTERISTIQUE_TROISIEME_TRANCHE_PREVISION_OBSERVATION_PAR_TRANCHE:
				return aPourCaracteristiqueTroisiemeTranchePrevisionObservationParTranche != null;
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
		result.append(", gdhDebutValidite: ");
		result.append(gdhDebutValidite);
		result.append(", gdhFinValidite: ");
		result.append(gdhFinValidite);
		result.append(')');
		return result.toString();
	}

} //TypePrevisionObservationImpl
