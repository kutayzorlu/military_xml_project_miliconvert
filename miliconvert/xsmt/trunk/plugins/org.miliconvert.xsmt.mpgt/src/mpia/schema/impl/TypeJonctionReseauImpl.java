/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoJonctionReseauEtatOperationnel;
import mpia.schema.TypeDictionaryDicoJonctionReseauEtatSaturation;
import mpia.schema.TypeDictionaryDicoLiaisonReseauCategorieDebit;
import mpia.schema.TypeJonctionReseau;

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
 * An implementation of the model object '<em><b>Type Jonction Reseau</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeJonctionReseauImpl#getGDHplanification <em>GD Hplanification</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeJonctionReseauImpl#getCategorieDebit <em>Categorie Debit</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeJonctionReseauImpl#getEtatOperationnel <em>Etat Operationnel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeJonctionReseauImpl#getEtatSaturation <em>Etat Saturation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeJonctionReseauImpl#getAPourLiaisonLiaisonReseau <em>APour Liaison Liaison Reseau</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeJonctionReseauImpl#getAPourExtremiteMaitrePionReseau <em>APour Extremite Maitre Pion Reseau</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeJonctionReseauImpl#getAPourExtremiteEsclavePionReseau <em>APour Extremite Esclave Pion Reseau</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeJonctionReseauImpl extends TypeRacineOperationnelleImpl implements TypeJonctionReseau {
	/**
	 * The default value of the '{@link #getGDHplanification() <em>GD Hplanification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHplanification()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GD_HPLANIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGDHplanification() <em>GD Hplanification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHplanification()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gDHplanification = GD_HPLANIFICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategorieDebit() <em>Categorie Debit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorieDebit()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoLiaisonReseauCategorieDebit CATEGORIE_DEBIT_EDEFAULT = TypeDictionaryDicoLiaisonReseauCategorieDebit.LB;

	/**
	 * The cached value of the '{@link #getCategorieDebit() <em>Categorie Debit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorieDebit()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoLiaisonReseauCategorieDebit categorieDebit = CATEGORIE_DEBIT_EDEFAULT;

	/**
	 * This is true if the Categorie Debit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieDebitESet;

	/**
	 * The default value of the '{@link #getEtatOperationnel() <em>Etat Operationnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatOperationnel()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoJonctionReseauEtatOperationnel ETAT_OPERATIONNEL_EDEFAULT = TypeDictionaryDicoJonctionReseauEtatOperationnel.OP;

	/**
	 * The cached value of the '{@link #getEtatOperationnel() <em>Etat Operationnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatOperationnel()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoJonctionReseauEtatOperationnel etatOperationnel = ETAT_OPERATIONNEL_EDEFAULT;

	/**
	 * This is true if the Etat Operationnel attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean etatOperationnelESet;

	/**
	 * The default value of the '{@link #getEtatSaturation() <em>Etat Saturation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatSaturation()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoJonctionReseauEtatSaturation ETAT_SATURATION_EDEFAULT = TypeDictionaryDicoJonctionReseauEtatSaturation.NOTSAT;

	/**
	 * The cached value of the '{@link #getEtatSaturation() <em>Etat Saturation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatSaturation()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoJonctionReseauEtatSaturation etatSaturation = ETAT_SATURATION_EDEFAULT;

	/**
	 * This is true if the Etat Saturation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean etatSaturationESet;

	/**
	 * The cached value of the '{@link #getAPourLiaisonLiaisonReseau() <em>APour Liaison Liaison Reseau</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourLiaisonLiaisonReseau()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourLiaisonLiaisonReseau;

	/**
	 * The cached value of the '{@link #getAPourExtremiteMaitrePionReseau() <em>APour Extremite Maitre Pion Reseau</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourExtremiteMaitrePionReseau()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourExtremiteMaitrePionReseau;

	/**
	 * The cached value of the '{@link #getAPourExtremiteEsclavePionReseau() <em>APour Extremite Esclave Pion Reseau</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourExtremiteEsclavePionReseau()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourExtremiteEsclavePionReseau;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeJonctionReseauImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeJonctionReseau();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGDHplanification() {
		return gDHplanification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGDHplanification(XMLGregorianCalendar newGDHplanification) {
		XMLGregorianCalendar oldGDHplanification = gDHplanification;
		gDHplanification = newGDHplanification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_JONCTION_RESEAU__GD_HPLANIFICATION, oldGDHplanification, gDHplanification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoLiaisonReseauCategorieDebit getCategorieDebit() {
		return categorieDebit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorieDebit(TypeDictionaryDicoLiaisonReseauCategorieDebit newCategorieDebit) {
		TypeDictionaryDicoLiaisonReseauCategorieDebit oldCategorieDebit = categorieDebit;
		categorieDebit = newCategorieDebit == null ? CATEGORIE_DEBIT_EDEFAULT : newCategorieDebit;
		boolean oldCategorieDebitESet = categorieDebitESet;
		categorieDebitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_JONCTION_RESEAU__CATEGORIE_DEBIT, oldCategorieDebit, categorieDebit, !oldCategorieDebitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorieDebit() {
		TypeDictionaryDicoLiaisonReseauCategorieDebit oldCategorieDebit = categorieDebit;
		boolean oldCategorieDebitESet = categorieDebitESet;
		categorieDebit = CATEGORIE_DEBIT_EDEFAULT;
		categorieDebitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_JONCTION_RESEAU__CATEGORIE_DEBIT, oldCategorieDebit, CATEGORIE_DEBIT_EDEFAULT, oldCategorieDebitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCategorieDebit() {
		return categorieDebitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoJonctionReseauEtatOperationnel getEtatOperationnel() {
		return etatOperationnel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatOperationnel(TypeDictionaryDicoJonctionReseauEtatOperationnel newEtatOperationnel) {
		TypeDictionaryDicoJonctionReseauEtatOperationnel oldEtatOperationnel = etatOperationnel;
		etatOperationnel = newEtatOperationnel == null ? ETAT_OPERATIONNEL_EDEFAULT : newEtatOperationnel;
		boolean oldEtatOperationnelESet = etatOperationnelESet;
		etatOperationnelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_JONCTION_RESEAU__ETAT_OPERATIONNEL, oldEtatOperationnel, etatOperationnel, !oldEtatOperationnelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEtatOperationnel() {
		TypeDictionaryDicoJonctionReseauEtatOperationnel oldEtatOperationnel = etatOperationnel;
		boolean oldEtatOperationnelESet = etatOperationnelESet;
		etatOperationnel = ETAT_OPERATIONNEL_EDEFAULT;
		etatOperationnelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_JONCTION_RESEAU__ETAT_OPERATIONNEL, oldEtatOperationnel, ETAT_OPERATIONNEL_EDEFAULT, oldEtatOperationnelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEtatOperationnel() {
		return etatOperationnelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoJonctionReseauEtatSaturation getEtatSaturation() {
		return etatSaturation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatSaturation(TypeDictionaryDicoJonctionReseauEtatSaturation newEtatSaturation) {
		TypeDictionaryDicoJonctionReseauEtatSaturation oldEtatSaturation = etatSaturation;
		etatSaturation = newEtatSaturation == null ? ETAT_SATURATION_EDEFAULT : newEtatSaturation;
		boolean oldEtatSaturationESet = etatSaturationESet;
		etatSaturationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_JONCTION_RESEAU__ETAT_SATURATION, oldEtatSaturation, etatSaturation, !oldEtatSaturationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEtatSaturation() {
		TypeDictionaryDicoJonctionReseauEtatSaturation oldEtatSaturation = etatSaturation;
		boolean oldEtatSaturationESet = etatSaturationESet;
		etatSaturation = ETAT_SATURATION_EDEFAULT;
		etatSaturationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_JONCTION_RESEAU__ETAT_SATURATION, oldEtatSaturation, ETAT_SATURATION_EDEFAULT, oldEtatSaturationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEtatSaturation() {
		return etatSaturationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourLiaisonLiaisonReseau() {
		if (aPourLiaisonLiaisonReseau == null) {
			aPourLiaisonLiaisonReseau = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_JONCTION_RESEAU__APOUR_LIAISON_LIAISON_RESEAU);
		}
		return aPourLiaisonLiaisonReseau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourExtremiteMaitrePionReseau() {
		return aPourExtremiteMaitrePionReseau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourExtremiteMaitrePionReseau(TypeAssociation newAPourExtremiteMaitrePionReseau, NotificationChain msgs) {
		TypeAssociation oldAPourExtremiteMaitrePionReseau = aPourExtremiteMaitrePionReseau;
		aPourExtremiteMaitrePionReseau = newAPourExtremiteMaitrePionReseau;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_JONCTION_RESEAU__APOUR_EXTREMITE_MAITRE_PION_RESEAU, oldAPourExtremiteMaitrePionReseau, newAPourExtremiteMaitrePionReseau);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourExtremiteMaitrePionReseau(TypeAssociation newAPourExtremiteMaitrePionReseau) {
		if (newAPourExtremiteMaitrePionReseau != aPourExtremiteMaitrePionReseau) {
			NotificationChain msgs = null;
			if (aPourExtremiteMaitrePionReseau != null)
				msgs = ((InternalEObject)aPourExtremiteMaitrePionReseau).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_JONCTION_RESEAU__APOUR_EXTREMITE_MAITRE_PION_RESEAU, null, msgs);
			if (newAPourExtremiteMaitrePionReseau != null)
				msgs = ((InternalEObject)newAPourExtremiteMaitrePionReseau).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_JONCTION_RESEAU__APOUR_EXTREMITE_MAITRE_PION_RESEAU, null, msgs);
			msgs = basicSetAPourExtremiteMaitrePionReseau(newAPourExtremiteMaitrePionReseau, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_JONCTION_RESEAU__APOUR_EXTREMITE_MAITRE_PION_RESEAU, newAPourExtremiteMaitrePionReseau, newAPourExtremiteMaitrePionReseau));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourExtremiteEsclavePionReseau() {
		return aPourExtremiteEsclavePionReseau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourExtremiteEsclavePionReseau(TypeAssociation newAPourExtremiteEsclavePionReseau, NotificationChain msgs) {
		TypeAssociation oldAPourExtremiteEsclavePionReseau = aPourExtremiteEsclavePionReseau;
		aPourExtremiteEsclavePionReseau = newAPourExtremiteEsclavePionReseau;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_JONCTION_RESEAU__APOUR_EXTREMITE_ESCLAVE_PION_RESEAU, oldAPourExtremiteEsclavePionReseau, newAPourExtremiteEsclavePionReseau);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourExtremiteEsclavePionReseau(TypeAssociation newAPourExtremiteEsclavePionReseau) {
		if (newAPourExtremiteEsclavePionReseau != aPourExtremiteEsclavePionReseau) {
			NotificationChain msgs = null;
			if (aPourExtremiteEsclavePionReseau != null)
				msgs = ((InternalEObject)aPourExtremiteEsclavePionReseau).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_JONCTION_RESEAU__APOUR_EXTREMITE_ESCLAVE_PION_RESEAU, null, msgs);
			if (newAPourExtremiteEsclavePionReseau != null)
				msgs = ((InternalEObject)newAPourExtremiteEsclavePionReseau).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_JONCTION_RESEAU__APOUR_EXTREMITE_ESCLAVE_PION_RESEAU, null, msgs);
			msgs = basicSetAPourExtremiteEsclavePionReseau(newAPourExtremiteEsclavePionReseau, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_JONCTION_RESEAU__APOUR_EXTREMITE_ESCLAVE_PION_RESEAU, newAPourExtremiteEsclavePionReseau, newAPourExtremiteEsclavePionReseau));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_JONCTION_RESEAU__APOUR_LIAISON_LIAISON_RESEAU:
				return ((InternalEList<?>)getAPourLiaisonLiaisonReseau()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_JONCTION_RESEAU__APOUR_EXTREMITE_MAITRE_PION_RESEAU:
				return basicSetAPourExtremiteMaitrePionReseau(null, msgs);
			case SchemaPackage.TYPE_JONCTION_RESEAU__APOUR_EXTREMITE_ESCLAVE_PION_RESEAU:
				return basicSetAPourExtremiteEsclavePionReseau(null, msgs);
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
			case SchemaPackage.TYPE_JONCTION_RESEAU__GD_HPLANIFICATION:
				return getGDHplanification();
			case SchemaPackage.TYPE_JONCTION_RESEAU__CATEGORIE_DEBIT:
				return getCategorieDebit();
			case SchemaPackage.TYPE_JONCTION_RESEAU__ETAT_OPERATIONNEL:
				return getEtatOperationnel();
			case SchemaPackage.TYPE_JONCTION_RESEAU__ETAT_SATURATION:
				return getEtatSaturation();
			case SchemaPackage.TYPE_JONCTION_RESEAU__APOUR_LIAISON_LIAISON_RESEAU:
				return getAPourLiaisonLiaisonReseau();
			case SchemaPackage.TYPE_JONCTION_RESEAU__APOUR_EXTREMITE_MAITRE_PION_RESEAU:
				return getAPourExtremiteMaitrePionReseau();
			case SchemaPackage.TYPE_JONCTION_RESEAU__APOUR_EXTREMITE_ESCLAVE_PION_RESEAU:
				return getAPourExtremiteEsclavePionReseau();
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
			case SchemaPackage.TYPE_JONCTION_RESEAU__GD_HPLANIFICATION:
				setGDHplanification((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_JONCTION_RESEAU__CATEGORIE_DEBIT:
				setCategorieDebit((TypeDictionaryDicoLiaisonReseauCategorieDebit)newValue);
				return;
			case SchemaPackage.TYPE_JONCTION_RESEAU__ETAT_OPERATIONNEL:
				setEtatOperationnel((TypeDictionaryDicoJonctionReseauEtatOperationnel)newValue);
				return;
			case SchemaPackage.TYPE_JONCTION_RESEAU__ETAT_SATURATION:
				setEtatSaturation((TypeDictionaryDicoJonctionReseauEtatSaturation)newValue);
				return;
			case SchemaPackage.TYPE_JONCTION_RESEAU__APOUR_LIAISON_LIAISON_RESEAU:
				getAPourLiaisonLiaisonReseau().clear();
				getAPourLiaisonLiaisonReseau().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_JONCTION_RESEAU__APOUR_EXTREMITE_MAITRE_PION_RESEAU:
				setAPourExtremiteMaitrePionReseau((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_JONCTION_RESEAU__APOUR_EXTREMITE_ESCLAVE_PION_RESEAU:
				setAPourExtremiteEsclavePionReseau((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_JONCTION_RESEAU__GD_HPLANIFICATION:
				setGDHplanification(GD_HPLANIFICATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_JONCTION_RESEAU__CATEGORIE_DEBIT:
				unsetCategorieDebit();
				return;
			case SchemaPackage.TYPE_JONCTION_RESEAU__ETAT_OPERATIONNEL:
				unsetEtatOperationnel();
				return;
			case SchemaPackage.TYPE_JONCTION_RESEAU__ETAT_SATURATION:
				unsetEtatSaturation();
				return;
			case SchemaPackage.TYPE_JONCTION_RESEAU__APOUR_LIAISON_LIAISON_RESEAU:
				getAPourLiaisonLiaisonReseau().clear();
				return;
			case SchemaPackage.TYPE_JONCTION_RESEAU__APOUR_EXTREMITE_MAITRE_PION_RESEAU:
				setAPourExtremiteMaitrePionReseau((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_JONCTION_RESEAU__APOUR_EXTREMITE_ESCLAVE_PION_RESEAU:
				setAPourExtremiteEsclavePionReseau((TypeAssociation)null);
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
			case SchemaPackage.TYPE_JONCTION_RESEAU__GD_HPLANIFICATION:
				return GD_HPLANIFICATION_EDEFAULT == null ? gDHplanification != null : !GD_HPLANIFICATION_EDEFAULT.equals(gDHplanification);
			case SchemaPackage.TYPE_JONCTION_RESEAU__CATEGORIE_DEBIT:
				return isSetCategorieDebit();
			case SchemaPackage.TYPE_JONCTION_RESEAU__ETAT_OPERATIONNEL:
				return isSetEtatOperationnel();
			case SchemaPackage.TYPE_JONCTION_RESEAU__ETAT_SATURATION:
				return isSetEtatSaturation();
			case SchemaPackage.TYPE_JONCTION_RESEAU__APOUR_LIAISON_LIAISON_RESEAU:
				return aPourLiaisonLiaisonReseau != null && !aPourLiaisonLiaisonReseau.isEmpty();
			case SchemaPackage.TYPE_JONCTION_RESEAU__APOUR_EXTREMITE_MAITRE_PION_RESEAU:
				return aPourExtremiteMaitrePionReseau != null;
			case SchemaPackage.TYPE_JONCTION_RESEAU__APOUR_EXTREMITE_ESCLAVE_PION_RESEAU:
				return aPourExtremiteEsclavePionReseau != null;
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
		result.append(" (gDHplanification: ");
		result.append(gDHplanification);
		result.append(", categorieDebit: ");
		if (categorieDebitESet) result.append(categorieDebit); else result.append("<unset>");
		result.append(", etatOperationnel: ");
		if (etatOperationnelESet) result.append(etatOperationnel); else result.append("<unset>");
		result.append(", etatSaturation: ");
		if (etatSaturationESet) result.append(etatSaturation); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeJonctionReseauImpl
