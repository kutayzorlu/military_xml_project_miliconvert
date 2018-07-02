/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeDebitTransmission;
import mpia.meta.TypeDataTypeLongueur;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoPionReseauCategorie;
import mpia.schema.TypeDictionaryDicoPionReseauDebit;
import mpia.schema.TypeDictionaryDicoPionReseauNature;
import mpia.schema.TypeDictionaryDicoPionReseauNatureStationCommutateur;
import mpia.schema.TypePionReseau;

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
 * An implementation of the model object '<em><b>Type Pion Reseau</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePionReseauImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePionReseauImpl#getNatureStationCommutateur <em>Nature Station Commutateur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePionReseauImpl#getNature <em>Nature</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePionReseauImpl#getDebit <em>Debit</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePionReseauImpl#getValeurDebit <em>Valeur Debit</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePionReseauImpl#getHauteurAntenne <em>Hauteur Antenne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePionReseauImpl#getEstEsclaveJonctionReseau <em>Est Esclave Jonction Reseau</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePionReseauImpl#getEstMaitreJonctionReseau <em>Est Maitre Jonction Reseau</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePionReseauImpl#getEstEsclaveLiaisonReseau <em>Est Esclave Liaison Reseau</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePionReseauImpl#getEstMaitreLiaisonReseau <em>Est Maitre Liaison Reseau</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePionReseauImpl extends TypeSiteImpl implements TypePionReseau {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPionReseauCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoPionReseauCategorie.A;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPionReseauCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getNatureStationCommutateur() <em>Nature Station Commutateur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatureStationCommutateur()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPionReseauNatureStationCommutateur NATURE_STATION_COMMUTATEUR_EDEFAULT = TypeDictionaryDicoPionReseauNatureStationCommutateur.TNAC;

	/**
	 * The cached value of the '{@link #getNatureStationCommutateur() <em>Nature Station Commutateur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatureStationCommutateur()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPionReseauNatureStationCommutateur natureStationCommutateur = NATURE_STATION_COMMUTATEUR_EDEFAULT;

	/**
	 * This is true if the Nature Station Commutateur attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean natureStationCommutateurESet;

	/**
	 * The default value of the '{@link #getNature() <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNature()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPionReseauNature NATURE_EDEFAULT = TypeDictionaryDicoPionReseauNature.COMT;

	/**
	 * The cached value of the '{@link #getNature() <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNature()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPionReseauNature nature = NATURE_EDEFAULT;

	/**
	 * This is true if the Nature attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean natureESet;

	/**
	 * The default value of the '{@link #getDebit() <em>Debit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebit()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPionReseauDebit DEBIT_EDEFAULT = TypeDictionaryDicoPionReseauDebit.LO;

	/**
	 * The cached value of the '{@link #getDebit() <em>Debit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebit()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPionReseauDebit debit = DEBIT_EDEFAULT;

	/**
	 * This is true if the Debit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean debitESet;

	/**
	 * The cached value of the '{@link #getValeurDebit() <em>Valeur Debit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeurDebit()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDebitTransmission valeurDebit;

	/**
	 * The cached value of the '{@link #getHauteurAntenne() <em>Hauteur Antenne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHauteurAntenne()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur hauteurAntenne;

	/**
	 * The cached value of the '{@link #getEstEsclaveJonctionReseau() <em>Est Esclave Jonction Reseau</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstEsclaveJonctionReseau()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estEsclaveJonctionReseau;

	/**
	 * The cached value of the '{@link #getEstMaitreJonctionReseau() <em>Est Maitre Jonction Reseau</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstMaitreJonctionReseau()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estMaitreJonctionReseau;

	/**
	 * The cached value of the '{@link #getEstEsclaveLiaisonReseau() <em>Est Esclave Liaison Reseau</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstEsclaveLiaisonReseau()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estEsclaveLiaisonReseau;

	/**
	 * The cached value of the '{@link #getEstMaitreLiaisonReseau() <em>Est Maitre Liaison Reseau</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstMaitreLiaisonReseau()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estMaitreLiaisonReseau;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypePionReseauImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePionReseau();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPionReseauCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoPionReseauCategorie newCategorie) {
		TypeDictionaryDicoPionReseauCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PION_RESEAU__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoPionReseauCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PION_RESEAU__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeDictionaryDicoPionReseauNatureStationCommutateur getNatureStationCommutateur() {
		return natureStationCommutateur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNatureStationCommutateur(TypeDictionaryDicoPionReseauNatureStationCommutateur newNatureStationCommutateur) {
		TypeDictionaryDicoPionReseauNatureStationCommutateur oldNatureStationCommutateur = natureStationCommutateur;
		natureStationCommutateur = newNatureStationCommutateur == null ? NATURE_STATION_COMMUTATEUR_EDEFAULT : newNatureStationCommutateur;
		boolean oldNatureStationCommutateurESet = natureStationCommutateurESet;
		natureStationCommutateurESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PION_RESEAU__NATURE_STATION_COMMUTATEUR, oldNatureStationCommutateur, natureStationCommutateur, !oldNatureStationCommutateurESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNatureStationCommutateur() {
		TypeDictionaryDicoPionReseauNatureStationCommutateur oldNatureStationCommutateur = natureStationCommutateur;
		boolean oldNatureStationCommutateurESet = natureStationCommutateurESet;
		natureStationCommutateur = NATURE_STATION_COMMUTATEUR_EDEFAULT;
		natureStationCommutateurESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PION_RESEAU__NATURE_STATION_COMMUTATEUR, oldNatureStationCommutateur, NATURE_STATION_COMMUTATEUR_EDEFAULT, oldNatureStationCommutateurESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNatureStationCommutateur() {
		return natureStationCommutateurESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPionReseauNature getNature() {
		return nature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNature(TypeDictionaryDicoPionReseauNature newNature) {
		TypeDictionaryDicoPionReseauNature oldNature = nature;
		nature = newNature == null ? NATURE_EDEFAULT : newNature;
		boolean oldNatureESet = natureESet;
		natureESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PION_RESEAU__NATURE, oldNature, nature, !oldNatureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNature() {
		TypeDictionaryDicoPionReseauNature oldNature = nature;
		boolean oldNatureESet = natureESet;
		nature = NATURE_EDEFAULT;
		natureESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PION_RESEAU__NATURE, oldNature, NATURE_EDEFAULT, oldNatureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNature() {
		return natureESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPionReseauDebit getDebit() {
		return debit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebit(TypeDictionaryDicoPionReseauDebit newDebit) {
		TypeDictionaryDicoPionReseauDebit oldDebit = debit;
		debit = newDebit == null ? DEBIT_EDEFAULT : newDebit;
		boolean oldDebitESet = debitESet;
		debitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PION_RESEAU__DEBIT, oldDebit, debit, !oldDebitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDebit() {
		TypeDictionaryDicoPionReseauDebit oldDebit = debit;
		boolean oldDebitESet = debitESet;
		debit = DEBIT_EDEFAULT;
		debitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PION_RESEAU__DEBIT, oldDebit, DEBIT_EDEFAULT, oldDebitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDebit() {
		return debitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDebitTransmission getValeurDebit() {
		return valeurDebit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValeurDebit(TypeDataTypeDebitTransmission newValeurDebit, NotificationChain msgs) {
		TypeDataTypeDebitTransmission oldValeurDebit = valeurDebit;
		valeurDebit = newValeurDebit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PION_RESEAU__VALEUR_DEBIT, oldValeurDebit, newValeurDebit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValeurDebit(TypeDataTypeDebitTransmission newValeurDebit) {
		if (newValeurDebit != valeurDebit) {
			NotificationChain msgs = null;
			if (valeurDebit != null)
				msgs = ((InternalEObject)valeurDebit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PION_RESEAU__VALEUR_DEBIT, null, msgs);
			if (newValeurDebit != null)
				msgs = ((InternalEObject)newValeurDebit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PION_RESEAU__VALEUR_DEBIT, null, msgs);
			msgs = basicSetValeurDebit(newValeurDebit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PION_RESEAU__VALEUR_DEBIT, newValeurDebit, newValeurDebit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getHauteurAntenne() {
		return hauteurAntenne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHauteurAntenne(TypeDataTypeLongueur newHauteurAntenne, NotificationChain msgs) {
		TypeDataTypeLongueur oldHauteurAntenne = hauteurAntenne;
		hauteurAntenne = newHauteurAntenne;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PION_RESEAU__HAUTEUR_ANTENNE, oldHauteurAntenne, newHauteurAntenne);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHauteurAntenne(TypeDataTypeLongueur newHauteurAntenne) {
		if (newHauteurAntenne != hauteurAntenne) {
			NotificationChain msgs = null;
			if (hauteurAntenne != null)
				msgs = ((InternalEObject)hauteurAntenne).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PION_RESEAU__HAUTEUR_ANTENNE, null, msgs);
			if (newHauteurAntenne != null)
				msgs = ((InternalEObject)newHauteurAntenne).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PION_RESEAU__HAUTEUR_ANTENNE, null, msgs);
			msgs = basicSetHauteurAntenne(newHauteurAntenne, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PION_RESEAU__HAUTEUR_ANTENNE, newHauteurAntenne, newHauteurAntenne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstEsclaveJonctionReseau() {
		if (estEsclaveJonctionReseau == null) {
			estEsclaveJonctionReseau = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_PION_RESEAU__EST_ESCLAVE_JONCTION_RESEAU);
		}
		return estEsclaveJonctionReseau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstMaitreJonctionReseau() {
		if (estMaitreJonctionReseau == null) {
			estMaitreJonctionReseau = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_PION_RESEAU__EST_MAITRE_JONCTION_RESEAU);
		}
		return estMaitreJonctionReseau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstEsclaveLiaisonReseau() {
		if (estEsclaveLiaisonReseau == null) {
			estEsclaveLiaisonReseau = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_PION_RESEAU__EST_ESCLAVE_LIAISON_RESEAU);
		}
		return estEsclaveLiaisonReseau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstMaitreLiaisonReseau() {
		if (estMaitreLiaisonReseau == null) {
			estMaitreLiaisonReseau = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_PION_RESEAU__EST_MAITRE_LIAISON_RESEAU);
		}
		return estMaitreLiaisonReseau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_PION_RESEAU__VALEUR_DEBIT:
				return basicSetValeurDebit(null, msgs);
			case SchemaPackage.TYPE_PION_RESEAU__HAUTEUR_ANTENNE:
				return basicSetHauteurAntenne(null, msgs);
			case SchemaPackage.TYPE_PION_RESEAU__EST_ESCLAVE_JONCTION_RESEAU:
				return ((InternalEList<?>)getEstEsclaveJonctionReseau()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PION_RESEAU__EST_MAITRE_JONCTION_RESEAU:
				return ((InternalEList<?>)getEstMaitreJonctionReseau()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PION_RESEAU__EST_ESCLAVE_LIAISON_RESEAU:
				return ((InternalEList<?>)getEstEsclaveLiaisonReseau()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PION_RESEAU__EST_MAITRE_LIAISON_RESEAU:
				return ((InternalEList<?>)getEstMaitreLiaisonReseau()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_PION_RESEAU__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_PION_RESEAU__NATURE_STATION_COMMUTATEUR:
				return getNatureStationCommutateur();
			case SchemaPackage.TYPE_PION_RESEAU__NATURE:
				return getNature();
			case SchemaPackage.TYPE_PION_RESEAU__DEBIT:
				return getDebit();
			case SchemaPackage.TYPE_PION_RESEAU__VALEUR_DEBIT:
				return getValeurDebit();
			case SchemaPackage.TYPE_PION_RESEAU__HAUTEUR_ANTENNE:
				return getHauteurAntenne();
			case SchemaPackage.TYPE_PION_RESEAU__EST_ESCLAVE_JONCTION_RESEAU:
				return getEstEsclaveJonctionReseau();
			case SchemaPackage.TYPE_PION_RESEAU__EST_MAITRE_JONCTION_RESEAU:
				return getEstMaitreJonctionReseau();
			case SchemaPackage.TYPE_PION_RESEAU__EST_ESCLAVE_LIAISON_RESEAU:
				return getEstEsclaveLiaisonReseau();
			case SchemaPackage.TYPE_PION_RESEAU__EST_MAITRE_LIAISON_RESEAU:
				return getEstMaitreLiaisonReseau();
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
			case SchemaPackage.TYPE_PION_RESEAU__CATEGORIE:
				setCategorie((TypeDictionaryDicoPionReseauCategorie)newValue);
				return;
			case SchemaPackage.TYPE_PION_RESEAU__NATURE_STATION_COMMUTATEUR:
				setNatureStationCommutateur((TypeDictionaryDicoPionReseauNatureStationCommutateur)newValue);
				return;
			case SchemaPackage.TYPE_PION_RESEAU__NATURE:
				setNature((TypeDictionaryDicoPionReseauNature)newValue);
				return;
			case SchemaPackage.TYPE_PION_RESEAU__DEBIT:
				setDebit((TypeDictionaryDicoPionReseauDebit)newValue);
				return;
			case SchemaPackage.TYPE_PION_RESEAU__VALEUR_DEBIT:
				setValeurDebit((TypeDataTypeDebitTransmission)newValue);
				return;
			case SchemaPackage.TYPE_PION_RESEAU__HAUTEUR_ANTENNE:
				setHauteurAntenne((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_PION_RESEAU__EST_ESCLAVE_JONCTION_RESEAU:
				getEstEsclaveJonctionReseau().clear();
				getEstEsclaveJonctionReseau().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_PION_RESEAU__EST_MAITRE_JONCTION_RESEAU:
				getEstMaitreJonctionReseau().clear();
				getEstMaitreJonctionReseau().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_PION_RESEAU__EST_ESCLAVE_LIAISON_RESEAU:
				getEstEsclaveLiaisonReseau().clear();
				getEstEsclaveLiaisonReseau().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_PION_RESEAU__EST_MAITRE_LIAISON_RESEAU:
				getEstMaitreLiaisonReseau().clear();
				getEstMaitreLiaisonReseau().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_PION_RESEAU__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_PION_RESEAU__NATURE_STATION_COMMUTATEUR:
				unsetNatureStationCommutateur();
				return;
			case SchemaPackage.TYPE_PION_RESEAU__NATURE:
				unsetNature();
				return;
			case SchemaPackage.TYPE_PION_RESEAU__DEBIT:
				unsetDebit();
				return;
			case SchemaPackage.TYPE_PION_RESEAU__VALEUR_DEBIT:
				setValeurDebit((TypeDataTypeDebitTransmission)null);
				return;
			case SchemaPackage.TYPE_PION_RESEAU__HAUTEUR_ANTENNE:
				setHauteurAntenne((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_PION_RESEAU__EST_ESCLAVE_JONCTION_RESEAU:
				getEstEsclaveJonctionReseau().clear();
				return;
			case SchemaPackage.TYPE_PION_RESEAU__EST_MAITRE_JONCTION_RESEAU:
				getEstMaitreJonctionReseau().clear();
				return;
			case SchemaPackage.TYPE_PION_RESEAU__EST_ESCLAVE_LIAISON_RESEAU:
				getEstEsclaveLiaisonReseau().clear();
				return;
			case SchemaPackage.TYPE_PION_RESEAU__EST_MAITRE_LIAISON_RESEAU:
				getEstMaitreLiaisonReseau().clear();
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
			case SchemaPackage.TYPE_PION_RESEAU__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_PION_RESEAU__NATURE_STATION_COMMUTATEUR:
				return isSetNatureStationCommutateur();
			case SchemaPackage.TYPE_PION_RESEAU__NATURE:
				return isSetNature();
			case SchemaPackage.TYPE_PION_RESEAU__DEBIT:
				return isSetDebit();
			case SchemaPackage.TYPE_PION_RESEAU__VALEUR_DEBIT:
				return valeurDebit != null;
			case SchemaPackage.TYPE_PION_RESEAU__HAUTEUR_ANTENNE:
				return hauteurAntenne != null;
			case SchemaPackage.TYPE_PION_RESEAU__EST_ESCLAVE_JONCTION_RESEAU:
				return estEsclaveJonctionReseau != null && !estEsclaveJonctionReseau.isEmpty();
			case SchemaPackage.TYPE_PION_RESEAU__EST_MAITRE_JONCTION_RESEAU:
				return estMaitreJonctionReseau != null && !estMaitreJonctionReseau.isEmpty();
			case SchemaPackage.TYPE_PION_RESEAU__EST_ESCLAVE_LIAISON_RESEAU:
				return estEsclaveLiaisonReseau != null && !estEsclaveLiaisonReseau.isEmpty();
			case SchemaPackage.TYPE_PION_RESEAU__EST_MAITRE_LIAISON_RESEAU:
				return estMaitreLiaisonReseau != null && !estMaitreLiaisonReseau.isEmpty();
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
		result.append(", natureStationCommutateur: ");
		if (natureStationCommutateurESet) result.append(natureStationCommutateur); else result.append("<unset>");
		result.append(", nature: ");
		if (natureESet) result.append(nature); else result.append("<unset>");
		result.append(", debit: ");
		if (debitESet) result.append(debit); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypePionReseauImpl
