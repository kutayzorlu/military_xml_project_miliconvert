/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeMasse;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoCodeConditionnement;
import mpia.schema.TypeDictionaryDicoConditionnementUnite;
import mpia.schema.TypeDictionaryDicoTypeConsommableIdentificationProduitDangereux;
import mpia.schema.TypeDictionaryDicoTypeConsommableRisque;
import mpia.schema.TypeTypeConsommable;

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
 * An implementation of the model object '<em><b>Type Type Consommable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeTypeConsommableImpl#isPerissabilite <em>Perissabilite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeConsommableImpl#getIdentificationProduitDangereux <em>Identification Produit Dangereux</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeConsommableImpl#getRisque <em>Risque</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeConsommableImpl#getPriorite <em>Priorite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeConsommableImpl#getConditionnement <em>Conditionnement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeConsommableImpl#getNomConditionnement <em>Nom Conditionnement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeConsommableImpl#getConditionnementQuantite <em>Conditionnement Quantite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeConsommableImpl#getConditionnementUnite <em>Conditionnement Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeConsommableImpl#getConditionnementPoids <em>Conditionnement Poids</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeConsommableImpl#getConditionnementRatio <em>Conditionnement Ratio</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeConsommableImpl#isCalculEmport <em>Calcul Emport</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeConsommableImpl#getEstConsommableMajeurAssociationConsommableMajeur <em>Est Consommable Majeur Association Consommable Majeur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeConsommableImpl#getEstObjetAssociationConsommation <em>Est Objet Association Consommation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypeTypeConsommableImpl extends TypeTypeMaterielImpl implements TypeTypeConsommable {
	/**
	 * The default value of the '{@link #isPerissabilite() <em>Perissabilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPerissabilite()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PERISSABILITE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPerissabilite() <em>Perissabilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPerissabilite()
	 * @generated
	 * @ordered
	 */
	protected boolean perissabilite = PERISSABILITE_EDEFAULT;

	/**
	 * This is true if the Perissabilite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean perissabiliteESet;

	/**
	 * The default value of the '{@link #getIdentificationProduitDangereux() <em>Identification Produit Dangereux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentificationProduitDangereux()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeConsommableIdentificationProduitDangereux IDENTIFICATION_PRODUIT_DANGEREUX_EDEFAULT = TypeDictionaryDicoTypeConsommableIdentificationProduitDangereux._1005;

	/**
	 * The cached value of the '{@link #getIdentificationProduitDangereux() <em>Identification Produit Dangereux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentificationProduitDangereux()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeConsommableIdentificationProduitDangereux identificationProduitDangereux = IDENTIFICATION_PRODUIT_DANGEREUX_EDEFAULT;

	/**
	 * This is true if the Identification Produit Dangereux attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean identificationProduitDangereuxESet;

	/**
	 * The default value of the '{@link #getRisque() <em>Risque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRisque()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeConsommableRisque RISQUE_EDEFAULT = TypeDictionaryDicoTypeConsommableRisque.COR;

	/**
	 * The cached value of the '{@link #getRisque() <em>Risque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRisque()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeConsommableRisque risque = RISQUE_EDEFAULT;

	/**
	 * This is true if the Risque attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean risqueESet;

	/**
	 * The default value of the '{@link #getPriorite() <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorite()
	 * @generated
	 * @ordered
	 */
	protected static final long PRIORITE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getPriorite() <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorite()
	 * @generated
	 * @ordered
	 */
	protected long priorite = PRIORITE_EDEFAULT;

	/**
	 * This is true if the Priorite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean prioriteESet;

	/**
	 * The default value of the '{@link #getConditionnement() <em>Conditionnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionnement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCodeConditionnement CONDITIONNEMENT_EDEFAULT = TypeDictionaryDicoCodeConditionnement.BLK;

	/**
	 * The cached value of the '{@link #getConditionnement() <em>Conditionnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionnement()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCodeConditionnement conditionnement = CONDITIONNEMENT_EDEFAULT;

	/**
	 * This is true if the Conditionnement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean conditionnementESet;

	/**
	 * The default value of the '{@link #getNomConditionnement() <em>Nom Conditionnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomConditionnement()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_CONDITIONNEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomConditionnement() <em>Nom Conditionnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomConditionnement()
	 * @generated
	 * @ordered
	 */
	protected String nomConditionnement = NOM_CONDITIONNEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getConditionnementQuantite() <em>Conditionnement Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionnementQuantite()
	 * @generated
	 * @ordered
	 */
	protected static final long CONDITIONNEMENT_QUANTITE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getConditionnementQuantite() <em>Conditionnement Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionnementQuantite()
	 * @generated
	 * @ordered
	 */
	protected long conditionnementQuantite = CONDITIONNEMENT_QUANTITE_EDEFAULT;

	/**
	 * This is true if the Conditionnement Quantite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean conditionnementQuantiteESet;

	/**
	 * The default value of the '{@link #getConditionnementUnite() <em>Conditionnement Unite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionnementUnite()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoConditionnementUnite CONDITIONNEMENT_UNITE_EDEFAULT = TypeDictionaryDicoConditionnementUnite.CM;

	/**
	 * The cached value of the '{@link #getConditionnementUnite() <em>Conditionnement Unite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionnementUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoConditionnementUnite conditionnementUnite = CONDITIONNEMENT_UNITE_EDEFAULT;

	/**
	 * This is true if the Conditionnement Unite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean conditionnementUniteESet;

	/**
	 * The cached value of the '{@link #getConditionnementPoids() <em>Conditionnement Poids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionnementPoids()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeMasse conditionnementPoids;

	/**
	 * The default value of the '{@link #getConditionnementRatio() <em>Conditionnement Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionnementRatio()
	 * @generated
	 * @ordered
	 */
	protected static final long CONDITIONNEMENT_RATIO_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getConditionnementRatio() <em>Conditionnement Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionnementRatio()
	 * @generated
	 * @ordered
	 */
	protected long conditionnementRatio = CONDITIONNEMENT_RATIO_EDEFAULT;

	/**
	 * This is true if the Conditionnement Ratio attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean conditionnementRatioESet;

	/**
	 * The default value of the '{@link #isCalculEmport() <em>Calcul Emport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCalculEmport()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CALCUL_EMPORT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCalculEmport() <em>Calcul Emport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCalculEmport()
	 * @generated
	 * @ordered
	 */
	protected boolean calculEmport = CALCUL_EMPORT_EDEFAULT;

	/**
	 * This is true if the Calcul Emport attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean calculEmportESet;

	/**
	 * The cached value of the '{@link #getEstConsommableMajeurAssociationConsommableMajeur() <em>Est Consommable Majeur Association Consommable Majeur</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstConsommableMajeurAssociationConsommableMajeur()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estConsommableMajeurAssociationConsommableMajeur;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationConsommation() <em>Est Objet Association Consommation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationConsommation()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationConsommation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeTypeConsommableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeTypeConsommable();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPerissabilite() {
		return perissabilite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerissabilite(boolean newPerissabilite) {
		boolean oldPerissabilite = perissabilite;
		perissabilite = newPerissabilite;
		boolean oldPerissabiliteESet = perissabiliteESet;
		perissabiliteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_CONSOMMABLE__PERISSABILITE, oldPerissabilite, perissabilite, !oldPerissabiliteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPerissabilite() {
		boolean oldPerissabilite = perissabilite;
		boolean oldPerissabiliteESet = perissabiliteESet;
		perissabilite = PERISSABILITE_EDEFAULT;
		perissabiliteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_CONSOMMABLE__PERISSABILITE, oldPerissabilite, PERISSABILITE_EDEFAULT, oldPerissabiliteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPerissabilite() {
		return perissabiliteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeConsommableIdentificationProduitDangereux getIdentificationProduitDangereux() {
		return identificationProduitDangereux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentificationProduitDangereux(TypeDictionaryDicoTypeConsommableIdentificationProduitDangereux newIdentificationProduitDangereux) {
		TypeDictionaryDicoTypeConsommableIdentificationProduitDangereux oldIdentificationProduitDangereux = identificationProduitDangereux;
		identificationProduitDangereux = newIdentificationProduitDangereux == null ? IDENTIFICATION_PRODUIT_DANGEREUX_EDEFAULT : newIdentificationProduitDangereux;
		boolean oldIdentificationProduitDangereuxESet = identificationProduitDangereuxESet;
		identificationProduitDangereuxESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_CONSOMMABLE__IDENTIFICATION_PRODUIT_DANGEREUX, oldIdentificationProduitDangereux, identificationProduitDangereux, !oldIdentificationProduitDangereuxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIdentificationProduitDangereux() {
		TypeDictionaryDicoTypeConsommableIdentificationProduitDangereux oldIdentificationProduitDangereux = identificationProduitDangereux;
		boolean oldIdentificationProduitDangereuxESet = identificationProduitDangereuxESet;
		identificationProduitDangereux = IDENTIFICATION_PRODUIT_DANGEREUX_EDEFAULT;
		identificationProduitDangereuxESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_CONSOMMABLE__IDENTIFICATION_PRODUIT_DANGEREUX, oldIdentificationProduitDangereux, IDENTIFICATION_PRODUIT_DANGEREUX_EDEFAULT, oldIdentificationProduitDangereuxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIdentificationProduitDangereux() {
		return identificationProduitDangereuxESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeConsommableRisque getRisque() {
		return risque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRisque(TypeDictionaryDicoTypeConsommableRisque newRisque) {
		TypeDictionaryDicoTypeConsommableRisque oldRisque = risque;
		risque = newRisque == null ? RISQUE_EDEFAULT : newRisque;
		boolean oldRisqueESet = risqueESet;
		risqueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_CONSOMMABLE__RISQUE, oldRisque, risque, !oldRisqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRisque() {
		TypeDictionaryDicoTypeConsommableRisque oldRisque = risque;
		boolean oldRisqueESet = risqueESet;
		risque = RISQUE_EDEFAULT;
		risqueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_CONSOMMABLE__RISQUE, oldRisque, RISQUE_EDEFAULT, oldRisqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRisque() {
		return risqueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getPriorite() {
		return priorite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriorite(long newPriorite) {
		long oldPriorite = priorite;
		priorite = newPriorite;
		boolean oldPrioriteESet = prioriteESet;
		prioriteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_CONSOMMABLE__PRIORITE, oldPriorite, priorite, !oldPrioriteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPriorite() {
		long oldPriorite = priorite;
		boolean oldPrioriteESet = prioriteESet;
		priorite = PRIORITE_EDEFAULT;
		prioriteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_CONSOMMABLE__PRIORITE, oldPriorite, PRIORITE_EDEFAULT, oldPrioriteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPriorite() {
		return prioriteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCodeConditionnement getConditionnement() {
		return conditionnement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionnement(TypeDictionaryDicoCodeConditionnement newConditionnement) {
		TypeDictionaryDicoCodeConditionnement oldConditionnement = conditionnement;
		conditionnement = newConditionnement == null ? CONDITIONNEMENT_EDEFAULT : newConditionnement;
		boolean oldConditionnementESet = conditionnementESet;
		conditionnementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_CONSOMMABLE__CONDITIONNEMENT, oldConditionnement, conditionnement, !oldConditionnementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConditionnement() {
		TypeDictionaryDicoCodeConditionnement oldConditionnement = conditionnement;
		boolean oldConditionnementESet = conditionnementESet;
		conditionnement = CONDITIONNEMENT_EDEFAULT;
		conditionnementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_CONSOMMABLE__CONDITIONNEMENT, oldConditionnement, CONDITIONNEMENT_EDEFAULT, oldConditionnementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConditionnement() {
		return conditionnementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomConditionnement() {
		return nomConditionnement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomConditionnement(String newNomConditionnement) {
		String oldNomConditionnement = nomConditionnement;
		nomConditionnement = newNomConditionnement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_CONSOMMABLE__NOM_CONDITIONNEMENT, oldNomConditionnement, nomConditionnement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getConditionnementQuantite() {
		return conditionnementQuantite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionnementQuantite(long newConditionnementQuantite) {
		long oldConditionnementQuantite = conditionnementQuantite;
		conditionnementQuantite = newConditionnementQuantite;
		boolean oldConditionnementQuantiteESet = conditionnementQuantiteESet;
		conditionnementQuantiteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_CONSOMMABLE__CONDITIONNEMENT_QUANTITE, oldConditionnementQuantite, conditionnementQuantite, !oldConditionnementQuantiteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConditionnementQuantite() {
		long oldConditionnementQuantite = conditionnementQuantite;
		boolean oldConditionnementQuantiteESet = conditionnementQuantiteESet;
		conditionnementQuantite = CONDITIONNEMENT_QUANTITE_EDEFAULT;
		conditionnementQuantiteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_CONSOMMABLE__CONDITIONNEMENT_QUANTITE, oldConditionnementQuantite, CONDITIONNEMENT_QUANTITE_EDEFAULT, oldConditionnementQuantiteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConditionnementQuantite() {
		return conditionnementQuantiteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoConditionnementUnite getConditionnementUnite() {
		return conditionnementUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionnementUnite(TypeDictionaryDicoConditionnementUnite newConditionnementUnite) {
		TypeDictionaryDicoConditionnementUnite oldConditionnementUnite = conditionnementUnite;
		conditionnementUnite = newConditionnementUnite == null ? CONDITIONNEMENT_UNITE_EDEFAULT : newConditionnementUnite;
		boolean oldConditionnementUniteESet = conditionnementUniteESet;
		conditionnementUniteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_CONSOMMABLE__CONDITIONNEMENT_UNITE, oldConditionnementUnite, conditionnementUnite, !oldConditionnementUniteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConditionnementUnite() {
		TypeDictionaryDicoConditionnementUnite oldConditionnementUnite = conditionnementUnite;
		boolean oldConditionnementUniteESet = conditionnementUniteESet;
		conditionnementUnite = CONDITIONNEMENT_UNITE_EDEFAULT;
		conditionnementUniteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_CONSOMMABLE__CONDITIONNEMENT_UNITE, oldConditionnementUnite, CONDITIONNEMENT_UNITE_EDEFAULT, oldConditionnementUniteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConditionnementUnite() {
		return conditionnementUniteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeMasse getConditionnementPoids() {
		return conditionnementPoids;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionnementPoids(TypeDataTypeMasse newConditionnementPoids, NotificationChain msgs) {
		TypeDataTypeMasse oldConditionnementPoids = conditionnementPoids;
		conditionnementPoids = newConditionnementPoids;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_CONSOMMABLE__CONDITIONNEMENT_POIDS, oldConditionnementPoids, newConditionnementPoids);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionnementPoids(TypeDataTypeMasse newConditionnementPoids) {
		if (newConditionnementPoids != conditionnementPoids) {
			NotificationChain msgs = null;
			if (conditionnementPoids != null)
				msgs = ((InternalEObject)conditionnementPoids).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_CONSOMMABLE__CONDITIONNEMENT_POIDS, null, msgs);
			if (newConditionnementPoids != null)
				msgs = ((InternalEObject)newConditionnementPoids).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_CONSOMMABLE__CONDITIONNEMENT_POIDS, null, msgs);
			msgs = basicSetConditionnementPoids(newConditionnementPoids, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_CONSOMMABLE__CONDITIONNEMENT_POIDS, newConditionnementPoids, newConditionnementPoids));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getConditionnementRatio() {
		return conditionnementRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionnementRatio(long newConditionnementRatio) {
		long oldConditionnementRatio = conditionnementRatio;
		conditionnementRatio = newConditionnementRatio;
		boolean oldConditionnementRatioESet = conditionnementRatioESet;
		conditionnementRatioESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_CONSOMMABLE__CONDITIONNEMENT_RATIO, oldConditionnementRatio, conditionnementRatio, !oldConditionnementRatioESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConditionnementRatio() {
		long oldConditionnementRatio = conditionnementRatio;
		boolean oldConditionnementRatioESet = conditionnementRatioESet;
		conditionnementRatio = CONDITIONNEMENT_RATIO_EDEFAULT;
		conditionnementRatioESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_CONSOMMABLE__CONDITIONNEMENT_RATIO, oldConditionnementRatio, CONDITIONNEMENT_RATIO_EDEFAULT, oldConditionnementRatioESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConditionnementRatio() {
		return conditionnementRatioESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCalculEmport() {
		return calculEmport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalculEmport(boolean newCalculEmport) {
		boolean oldCalculEmport = calculEmport;
		calculEmport = newCalculEmport;
		boolean oldCalculEmportESet = calculEmportESet;
		calculEmportESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_CONSOMMABLE__CALCUL_EMPORT, oldCalculEmport, calculEmport, !oldCalculEmportESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCalculEmport() {
		boolean oldCalculEmport = calculEmport;
		boolean oldCalculEmportESet = calculEmportESet;
		calculEmport = CALCUL_EMPORT_EDEFAULT;
		calculEmportESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_CONSOMMABLE__CALCUL_EMPORT, oldCalculEmport, CALCUL_EMPORT_EDEFAULT, oldCalculEmportESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCalculEmport() {
		return calculEmportESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstConsommableMajeurAssociationConsommableMajeur() {
		if (estConsommableMajeurAssociationConsommableMajeur == null) {
			estConsommableMajeurAssociationConsommableMajeur = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_TYPE_CONSOMMABLE__EST_CONSOMMABLE_MAJEUR_ASSOCIATION_CONSOMMABLE_MAJEUR);
		}
		return estConsommableMajeurAssociationConsommableMajeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationConsommation() {
		if (estObjetAssociationConsommation == null) {
			estObjetAssociationConsommation = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_TYPE_CONSOMMABLE__EST_OBJET_ASSOCIATION_CONSOMMATION);
		}
		return estObjetAssociationConsommation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__CONDITIONNEMENT_POIDS:
				return basicSetConditionnementPoids(null, msgs);
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__EST_CONSOMMABLE_MAJEUR_ASSOCIATION_CONSOMMABLE_MAJEUR:
				return ((InternalEList<?>)getEstConsommableMajeurAssociationConsommableMajeur()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__EST_OBJET_ASSOCIATION_CONSOMMATION:
				return ((InternalEList<?>)getEstObjetAssociationConsommation()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__PERISSABILITE:
				return isPerissabilite() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__IDENTIFICATION_PRODUIT_DANGEREUX:
				return getIdentificationProduitDangereux();
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__RISQUE:
				return getRisque();
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__PRIORITE:
				return new Long(getPriorite());
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__CONDITIONNEMENT:
				return getConditionnement();
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__NOM_CONDITIONNEMENT:
				return getNomConditionnement();
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__CONDITIONNEMENT_QUANTITE:
				return new Long(getConditionnementQuantite());
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__CONDITIONNEMENT_UNITE:
				return getConditionnementUnite();
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__CONDITIONNEMENT_POIDS:
				return getConditionnementPoids();
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__CONDITIONNEMENT_RATIO:
				return new Long(getConditionnementRatio());
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__CALCUL_EMPORT:
				return isCalculEmport() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__EST_CONSOMMABLE_MAJEUR_ASSOCIATION_CONSOMMABLE_MAJEUR:
				return getEstConsommableMajeurAssociationConsommableMajeur();
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__EST_OBJET_ASSOCIATION_CONSOMMATION:
				return getEstObjetAssociationConsommation();
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
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__PERISSABILITE:
				setPerissabilite(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__IDENTIFICATION_PRODUIT_DANGEREUX:
				setIdentificationProduitDangereux((TypeDictionaryDicoTypeConsommableIdentificationProduitDangereux)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__RISQUE:
				setRisque((TypeDictionaryDicoTypeConsommableRisque)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__PRIORITE:
				setPriorite(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__CONDITIONNEMENT:
				setConditionnement((TypeDictionaryDicoCodeConditionnement)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__NOM_CONDITIONNEMENT:
				setNomConditionnement((String)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__CONDITIONNEMENT_QUANTITE:
				setConditionnementQuantite(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__CONDITIONNEMENT_UNITE:
				setConditionnementUnite((TypeDictionaryDicoConditionnementUnite)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__CONDITIONNEMENT_POIDS:
				setConditionnementPoids((TypeDataTypeMasse)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__CONDITIONNEMENT_RATIO:
				setConditionnementRatio(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__CALCUL_EMPORT:
				setCalculEmport(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__EST_CONSOMMABLE_MAJEUR_ASSOCIATION_CONSOMMABLE_MAJEUR:
				getEstConsommableMajeurAssociationConsommableMajeur().clear();
				getEstConsommableMajeurAssociationConsommableMajeur().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__EST_OBJET_ASSOCIATION_CONSOMMATION:
				getEstObjetAssociationConsommation().clear();
				getEstObjetAssociationConsommation().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__PERISSABILITE:
				unsetPerissabilite();
				return;
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__IDENTIFICATION_PRODUIT_DANGEREUX:
				unsetIdentificationProduitDangereux();
				return;
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__RISQUE:
				unsetRisque();
				return;
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__PRIORITE:
				unsetPriorite();
				return;
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__CONDITIONNEMENT:
				unsetConditionnement();
				return;
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__NOM_CONDITIONNEMENT:
				setNomConditionnement(NOM_CONDITIONNEMENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__CONDITIONNEMENT_QUANTITE:
				unsetConditionnementQuantite();
				return;
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__CONDITIONNEMENT_UNITE:
				unsetConditionnementUnite();
				return;
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__CONDITIONNEMENT_POIDS:
				setConditionnementPoids((TypeDataTypeMasse)null);
				return;
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__CONDITIONNEMENT_RATIO:
				unsetConditionnementRatio();
				return;
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__CALCUL_EMPORT:
				unsetCalculEmport();
				return;
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__EST_CONSOMMABLE_MAJEUR_ASSOCIATION_CONSOMMABLE_MAJEUR:
				getEstConsommableMajeurAssociationConsommableMajeur().clear();
				return;
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__EST_OBJET_ASSOCIATION_CONSOMMATION:
				getEstObjetAssociationConsommation().clear();
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
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__PERISSABILITE:
				return isSetPerissabilite();
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__IDENTIFICATION_PRODUIT_DANGEREUX:
				return isSetIdentificationProduitDangereux();
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__RISQUE:
				return isSetRisque();
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__PRIORITE:
				return isSetPriorite();
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__CONDITIONNEMENT:
				return isSetConditionnement();
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__NOM_CONDITIONNEMENT:
				return NOM_CONDITIONNEMENT_EDEFAULT == null ? nomConditionnement != null : !NOM_CONDITIONNEMENT_EDEFAULT.equals(nomConditionnement);
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__CONDITIONNEMENT_QUANTITE:
				return isSetConditionnementQuantite();
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__CONDITIONNEMENT_UNITE:
				return isSetConditionnementUnite();
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__CONDITIONNEMENT_POIDS:
				return conditionnementPoids != null;
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__CONDITIONNEMENT_RATIO:
				return isSetConditionnementRatio();
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__CALCUL_EMPORT:
				return isSetCalculEmport();
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__EST_CONSOMMABLE_MAJEUR_ASSOCIATION_CONSOMMABLE_MAJEUR:
				return estConsommableMajeurAssociationConsommableMajeur != null && !estConsommableMajeurAssociationConsommableMajeur.isEmpty();
			case SchemaPackage.TYPE_TYPE_CONSOMMABLE__EST_OBJET_ASSOCIATION_CONSOMMATION:
				return estObjetAssociationConsommation != null && !estObjetAssociationConsommation.isEmpty();
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
		result.append(" (perissabilite: ");
		if (perissabiliteESet) result.append(perissabilite); else result.append("<unset>");
		result.append(", identificationProduitDangereux: ");
		if (identificationProduitDangereuxESet) result.append(identificationProduitDangereux); else result.append("<unset>");
		result.append(", risque: ");
		if (risqueESet) result.append(risque); else result.append("<unset>");
		result.append(", priorite: ");
		if (prioriteESet) result.append(priorite); else result.append("<unset>");
		result.append(", conditionnement: ");
		if (conditionnementESet) result.append(conditionnement); else result.append("<unset>");
		result.append(", nomConditionnement: ");
		result.append(nomConditionnement);
		result.append(", conditionnementQuantite: ");
		if (conditionnementQuantiteESet) result.append(conditionnementQuantite); else result.append("<unset>");
		result.append(", conditionnementUnite: ");
		if (conditionnementUniteESet) result.append(conditionnementUnite); else result.append("<unset>");
		result.append(", conditionnementRatio: ");
		if (conditionnementRatioESet) result.append(conditionnementRatio); else result.append("<unset>");
		result.append(", calculEmport: ");
		if (calculEmportESet) result.append(calculEmport); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeTypeConsommableImpl
