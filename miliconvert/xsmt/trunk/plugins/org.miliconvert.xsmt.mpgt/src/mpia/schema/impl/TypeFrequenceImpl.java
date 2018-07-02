/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeDateHeure;
import mpia.meta.TypeDataTypeFrequence;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoFrequenceBandeFrequence;
import mpia.schema.TypeDictionaryDicoFrequenceCategorieRestriction;
import mpia.schema.TypeDictionaryDicoFrequenceIdentificationBande;
import mpia.schema.TypeDictionaryDicoFrequenceModulation;
import mpia.schema.TypeFrequence;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Frequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeFrequenceImpl#getReferenceAOPT <em>Reference AOPT</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeFrequenceImpl#getFrequence <em>Frequence</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeFrequenceImpl#getNumeroCanal <em>Numero Canal</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeFrequenceImpl#getNomCode <em>Nom Code</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeFrequenceImpl#getCategorieRestriction <em>Categorie Restriction</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeFrequenceImpl#getFrequenceMinimale <em>Frequence Minimale</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeFrequenceImpl#getFrequenceMaximale <em>Frequence Maximale</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeFrequenceImpl#getBandeFrequence <em>Bande Frequence</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeFrequenceImpl#getIdentificationBande <em>Identification Bande</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeFrequenceImpl#getModulation <em>Modulation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeFrequenceImpl#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeFrequenceImpl#getDateFin <em>Date Fin</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeFrequenceImpl#getFinalite <em>Finalite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeFrequenceImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeFrequenceImpl#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeFrequenceImpl extends EObjectImpl implements TypeFrequence {
	/**
	 * The default value of the '{@link #getReferenceAOPT() <em>Reference AOPT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceAOPT()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_AOPT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferenceAOPT() <em>Reference AOPT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceAOPT()
	 * @generated
	 * @ordered
	 */
	protected String referenceAOPT = REFERENCE_AOPT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFrequence() <em>Frequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequence()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeFrequence frequence;

	/**
	 * The default value of the '{@link #getNumeroCanal() <em>Numero Canal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroCanal()
	 * @generated
	 * @ordered
	 */
	protected static final long NUMERO_CANAL_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNumeroCanal() <em>Numero Canal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroCanal()
	 * @generated
	 * @ordered
	 */
	protected long numeroCanal = NUMERO_CANAL_EDEFAULT;

	/**
	 * This is true if the Numero Canal attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numeroCanalESet;

	/**
	 * The default value of the '{@link #getNomCode() <em>Nom Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomCode()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomCode() <em>Nom Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomCode()
	 * @generated
	 * @ordered
	 */
	protected String nomCode = NOM_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategorieRestriction() <em>Categorie Restriction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorieRestriction()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoFrequenceCategorieRestriction CATEGORIE_RESTRICTION_EDEFAULT = TypeDictionaryDicoFrequenceCategorieRestriction.TABOO;

	/**
	 * The cached value of the '{@link #getCategorieRestriction() <em>Categorie Restriction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorieRestriction()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoFrequenceCategorieRestriction categorieRestriction = CATEGORIE_RESTRICTION_EDEFAULT;

	/**
	 * This is true if the Categorie Restriction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieRestrictionESet;

	/**
	 * The cached value of the '{@link #getFrequenceMinimale() <em>Frequence Minimale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequenceMinimale()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeFrequence frequenceMinimale;

	/**
	 * The cached value of the '{@link #getFrequenceMaximale() <em>Frequence Maximale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequenceMaximale()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeFrequence frequenceMaximale;

	/**
	 * The default value of the '{@link #getBandeFrequence() <em>Bande Frequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandeFrequence()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoFrequenceBandeFrequence BANDE_FREQUENCE_EDEFAULT = TypeDictionaryDicoFrequenceBandeFrequence.EHF;

	/**
	 * The cached value of the '{@link #getBandeFrequence() <em>Bande Frequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandeFrequence()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoFrequenceBandeFrequence bandeFrequence = BANDE_FREQUENCE_EDEFAULT;

	/**
	 * This is true if the Bande Frequence attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bandeFrequenceESet;

	/**
	 * The default value of the '{@link #getIdentificationBande() <em>Identification Bande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentificationBande()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoFrequenceIdentificationBande IDENTIFICATION_BANDE_EDEFAULT = TypeDictionaryDicoFrequenceIdentificationBande.NUABAND;

	/**
	 * The cached value of the '{@link #getIdentificationBande() <em>Identification Bande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentificationBande()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoFrequenceIdentificationBande identificationBande = IDENTIFICATION_BANDE_EDEFAULT;

	/**
	 * This is true if the Identification Bande attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean identificationBandeESet;

	/**
	 * The default value of the '{@link #getModulation() <em>Modulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModulation()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoFrequenceModulation MODULATION_EDEFAULT = TypeDictionaryDicoFrequenceModulation.DBSBND;

	/**
	 * The cached value of the '{@link #getModulation() <em>Modulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModulation()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoFrequenceModulation modulation = MODULATION_EDEFAULT;

	/**
	 * This is true if the Modulation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean modulationESet;

	/**
	 * The cached value of the '{@link #getDateDebut() <em>Date Debut</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebut()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDateHeure dateDebut;

	/**
	 * The cached value of the '{@link #getDateFin() <em>Date Fin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFin()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDateHeure dateFin;

	/**
	 * The default value of the '{@link #getFinalite() <em>Finalite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalite()
	 * @generated
	 * @ordered
	 */
	protected static final String FINALITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFinalite() <em>Finalite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalite()
	 * @generated
	 * @ordered
	 */
	protected String finalite = FINALITE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeFrequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeFrequence();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferenceAOPT() {
		return referenceAOPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceAOPT(String newReferenceAOPT) {
		String oldReferenceAOPT = referenceAOPT;
		referenceAOPT = newReferenceAOPT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_FREQUENCE__REFERENCE_AOPT, oldReferenceAOPT, referenceAOPT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeFrequence getFrequence() {
		return frequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrequence(TypeDataTypeFrequence newFrequence, NotificationChain msgs) {
		TypeDataTypeFrequence oldFrequence = frequence;
		frequence = newFrequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_FREQUENCE__FREQUENCE, oldFrequence, newFrequence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequence(TypeDataTypeFrequence newFrequence) {
		if (newFrequence != frequence) {
			NotificationChain msgs = null;
			if (frequence != null)
				msgs = ((InternalEObject)frequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_FREQUENCE__FREQUENCE, null, msgs);
			if (newFrequence != null)
				msgs = ((InternalEObject)newFrequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_FREQUENCE__FREQUENCE, null, msgs);
			msgs = basicSetFrequence(newFrequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_FREQUENCE__FREQUENCE, newFrequence, newFrequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNumeroCanal() {
		return numeroCanal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroCanal(long newNumeroCanal) {
		long oldNumeroCanal = numeroCanal;
		numeroCanal = newNumeroCanal;
		boolean oldNumeroCanalESet = numeroCanalESet;
		numeroCanalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_FREQUENCE__NUMERO_CANAL, oldNumeroCanal, numeroCanal, !oldNumeroCanalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumeroCanal() {
		long oldNumeroCanal = numeroCanal;
		boolean oldNumeroCanalESet = numeroCanalESet;
		numeroCanal = NUMERO_CANAL_EDEFAULT;
		numeroCanalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_FREQUENCE__NUMERO_CANAL, oldNumeroCanal, NUMERO_CANAL_EDEFAULT, oldNumeroCanalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumeroCanal() {
		return numeroCanalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomCode() {
		return nomCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomCode(String newNomCode) {
		String oldNomCode = nomCode;
		nomCode = newNomCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_FREQUENCE__NOM_CODE, oldNomCode, nomCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoFrequenceCategorieRestriction getCategorieRestriction() {
		return categorieRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorieRestriction(TypeDictionaryDicoFrequenceCategorieRestriction newCategorieRestriction) {
		TypeDictionaryDicoFrequenceCategorieRestriction oldCategorieRestriction = categorieRestriction;
		categorieRestriction = newCategorieRestriction == null ? CATEGORIE_RESTRICTION_EDEFAULT : newCategorieRestriction;
		boolean oldCategorieRestrictionESet = categorieRestrictionESet;
		categorieRestrictionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_FREQUENCE__CATEGORIE_RESTRICTION, oldCategorieRestriction, categorieRestriction, !oldCategorieRestrictionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorieRestriction() {
		TypeDictionaryDicoFrequenceCategorieRestriction oldCategorieRestriction = categorieRestriction;
		boolean oldCategorieRestrictionESet = categorieRestrictionESet;
		categorieRestriction = CATEGORIE_RESTRICTION_EDEFAULT;
		categorieRestrictionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_FREQUENCE__CATEGORIE_RESTRICTION, oldCategorieRestriction, CATEGORIE_RESTRICTION_EDEFAULT, oldCategorieRestrictionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCategorieRestriction() {
		return categorieRestrictionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeFrequence getFrequenceMinimale() {
		return frequenceMinimale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrequenceMinimale(TypeDataTypeFrequence newFrequenceMinimale, NotificationChain msgs) {
		TypeDataTypeFrequence oldFrequenceMinimale = frequenceMinimale;
		frequenceMinimale = newFrequenceMinimale;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_FREQUENCE__FREQUENCE_MINIMALE, oldFrequenceMinimale, newFrequenceMinimale);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequenceMinimale(TypeDataTypeFrequence newFrequenceMinimale) {
		if (newFrequenceMinimale != frequenceMinimale) {
			NotificationChain msgs = null;
			if (frequenceMinimale != null)
				msgs = ((InternalEObject)frequenceMinimale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_FREQUENCE__FREQUENCE_MINIMALE, null, msgs);
			if (newFrequenceMinimale != null)
				msgs = ((InternalEObject)newFrequenceMinimale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_FREQUENCE__FREQUENCE_MINIMALE, null, msgs);
			msgs = basicSetFrequenceMinimale(newFrequenceMinimale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_FREQUENCE__FREQUENCE_MINIMALE, newFrequenceMinimale, newFrequenceMinimale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeFrequence getFrequenceMaximale() {
		return frequenceMaximale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrequenceMaximale(TypeDataTypeFrequence newFrequenceMaximale, NotificationChain msgs) {
		TypeDataTypeFrequence oldFrequenceMaximale = frequenceMaximale;
		frequenceMaximale = newFrequenceMaximale;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_FREQUENCE__FREQUENCE_MAXIMALE, oldFrequenceMaximale, newFrequenceMaximale);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequenceMaximale(TypeDataTypeFrequence newFrequenceMaximale) {
		if (newFrequenceMaximale != frequenceMaximale) {
			NotificationChain msgs = null;
			if (frequenceMaximale != null)
				msgs = ((InternalEObject)frequenceMaximale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_FREQUENCE__FREQUENCE_MAXIMALE, null, msgs);
			if (newFrequenceMaximale != null)
				msgs = ((InternalEObject)newFrequenceMaximale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_FREQUENCE__FREQUENCE_MAXIMALE, null, msgs);
			msgs = basicSetFrequenceMaximale(newFrequenceMaximale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_FREQUENCE__FREQUENCE_MAXIMALE, newFrequenceMaximale, newFrequenceMaximale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoFrequenceBandeFrequence getBandeFrequence() {
		return bandeFrequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBandeFrequence(TypeDictionaryDicoFrequenceBandeFrequence newBandeFrequence) {
		TypeDictionaryDicoFrequenceBandeFrequence oldBandeFrequence = bandeFrequence;
		bandeFrequence = newBandeFrequence == null ? BANDE_FREQUENCE_EDEFAULT : newBandeFrequence;
		boolean oldBandeFrequenceESet = bandeFrequenceESet;
		bandeFrequenceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_FREQUENCE__BANDE_FREQUENCE, oldBandeFrequence, bandeFrequence, !oldBandeFrequenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBandeFrequence() {
		TypeDictionaryDicoFrequenceBandeFrequence oldBandeFrequence = bandeFrequence;
		boolean oldBandeFrequenceESet = bandeFrequenceESet;
		bandeFrequence = BANDE_FREQUENCE_EDEFAULT;
		bandeFrequenceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_FREQUENCE__BANDE_FREQUENCE, oldBandeFrequence, BANDE_FREQUENCE_EDEFAULT, oldBandeFrequenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBandeFrequence() {
		return bandeFrequenceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoFrequenceIdentificationBande getIdentificationBande() {
		return identificationBande;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentificationBande(TypeDictionaryDicoFrequenceIdentificationBande newIdentificationBande) {
		TypeDictionaryDicoFrequenceIdentificationBande oldIdentificationBande = identificationBande;
		identificationBande = newIdentificationBande == null ? IDENTIFICATION_BANDE_EDEFAULT : newIdentificationBande;
		boolean oldIdentificationBandeESet = identificationBandeESet;
		identificationBandeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_FREQUENCE__IDENTIFICATION_BANDE, oldIdentificationBande, identificationBande, !oldIdentificationBandeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIdentificationBande() {
		TypeDictionaryDicoFrequenceIdentificationBande oldIdentificationBande = identificationBande;
		boolean oldIdentificationBandeESet = identificationBandeESet;
		identificationBande = IDENTIFICATION_BANDE_EDEFAULT;
		identificationBandeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_FREQUENCE__IDENTIFICATION_BANDE, oldIdentificationBande, IDENTIFICATION_BANDE_EDEFAULT, oldIdentificationBandeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIdentificationBande() {
		return identificationBandeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoFrequenceModulation getModulation() {
		return modulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModulation(TypeDictionaryDicoFrequenceModulation newModulation) {
		TypeDictionaryDicoFrequenceModulation oldModulation = modulation;
		modulation = newModulation == null ? MODULATION_EDEFAULT : newModulation;
		boolean oldModulationESet = modulationESet;
		modulationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_FREQUENCE__MODULATION, oldModulation, modulation, !oldModulationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetModulation() {
		TypeDictionaryDicoFrequenceModulation oldModulation = modulation;
		boolean oldModulationESet = modulationESet;
		modulation = MODULATION_EDEFAULT;
		modulationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_FREQUENCE__MODULATION, oldModulation, MODULATION_EDEFAULT, oldModulationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetModulation() {
		return modulationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDateHeure getDateDebut() {
		return dateDebut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateDebut(TypeDataTypeDateHeure newDateDebut, NotificationChain msgs) {
		TypeDataTypeDateHeure oldDateDebut = dateDebut;
		dateDebut = newDateDebut;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_FREQUENCE__DATE_DEBUT, oldDateDebut, newDateDebut);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDebut(TypeDataTypeDateHeure newDateDebut) {
		if (newDateDebut != dateDebut) {
			NotificationChain msgs = null;
			if (dateDebut != null)
				msgs = ((InternalEObject)dateDebut).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_FREQUENCE__DATE_DEBUT, null, msgs);
			if (newDateDebut != null)
				msgs = ((InternalEObject)newDateDebut).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_FREQUENCE__DATE_DEBUT, null, msgs);
			msgs = basicSetDateDebut(newDateDebut, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_FREQUENCE__DATE_DEBUT, newDateDebut, newDateDebut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDateHeure getDateFin() {
		return dateFin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateFin(TypeDataTypeDateHeure newDateFin, NotificationChain msgs) {
		TypeDataTypeDateHeure oldDateFin = dateFin;
		dateFin = newDateFin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_FREQUENCE__DATE_FIN, oldDateFin, newDateFin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateFin(TypeDataTypeDateHeure newDateFin) {
		if (newDateFin != dateFin) {
			NotificationChain msgs = null;
			if (dateFin != null)
				msgs = ((InternalEObject)dateFin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_FREQUENCE__DATE_FIN, null, msgs);
			if (newDateFin != null)
				msgs = ((InternalEObject)newDateFin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_FREQUENCE__DATE_FIN, null, msgs);
			msgs = basicSetDateFin(newDateFin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_FREQUENCE__DATE_FIN, newDateFin, newDateFin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFinalite() {
		return finalite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinalite(String newFinalite) {
		String oldFinalite = finalite;
		finalite = newFinalite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_FREQUENCE__FINALITE, oldFinalite, finalite));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_FREQUENCE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_FREQUENCE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_FREQUENCE__FREQUENCE:
				return basicSetFrequence(null, msgs);
			case SchemaPackage.TYPE_FREQUENCE__FREQUENCE_MINIMALE:
				return basicSetFrequenceMinimale(null, msgs);
			case SchemaPackage.TYPE_FREQUENCE__FREQUENCE_MAXIMALE:
				return basicSetFrequenceMaximale(null, msgs);
			case SchemaPackage.TYPE_FREQUENCE__DATE_DEBUT:
				return basicSetDateDebut(null, msgs);
			case SchemaPackage.TYPE_FREQUENCE__DATE_FIN:
				return basicSetDateFin(null, msgs);
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
			case SchemaPackage.TYPE_FREQUENCE__REFERENCE_AOPT:
				return getReferenceAOPT();
			case SchemaPackage.TYPE_FREQUENCE__FREQUENCE:
				return getFrequence();
			case SchemaPackage.TYPE_FREQUENCE__NUMERO_CANAL:
				return new Long(getNumeroCanal());
			case SchemaPackage.TYPE_FREQUENCE__NOM_CODE:
				return getNomCode();
			case SchemaPackage.TYPE_FREQUENCE__CATEGORIE_RESTRICTION:
				return getCategorieRestriction();
			case SchemaPackage.TYPE_FREQUENCE__FREQUENCE_MINIMALE:
				return getFrequenceMinimale();
			case SchemaPackage.TYPE_FREQUENCE__FREQUENCE_MAXIMALE:
				return getFrequenceMaximale();
			case SchemaPackage.TYPE_FREQUENCE__BANDE_FREQUENCE:
				return getBandeFrequence();
			case SchemaPackage.TYPE_FREQUENCE__IDENTIFICATION_BANDE:
				return getIdentificationBande();
			case SchemaPackage.TYPE_FREQUENCE__MODULATION:
				return getModulation();
			case SchemaPackage.TYPE_FREQUENCE__DATE_DEBUT:
				return getDateDebut();
			case SchemaPackage.TYPE_FREQUENCE__DATE_FIN:
				return getDateFin();
			case SchemaPackage.TYPE_FREQUENCE__FINALITE:
				return getFinalite();
			case SchemaPackage.TYPE_FREQUENCE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_FREQUENCE__CE:
				return getCE();
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
			case SchemaPackage.TYPE_FREQUENCE__REFERENCE_AOPT:
				setReferenceAOPT((String)newValue);
				return;
			case SchemaPackage.TYPE_FREQUENCE__FREQUENCE:
				setFrequence((TypeDataTypeFrequence)newValue);
				return;
			case SchemaPackage.TYPE_FREQUENCE__NUMERO_CANAL:
				setNumeroCanal(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_FREQUENCE__NOM_CODE:
				setNomCode((String)newValue);
				return;
			case SchemaPackage.TYPE_FREQUENCE__CATEGORIE_RESTRICTION:
				setCategorieRestriction((TypeDictionaryDicoFrequenceCategorieRestriction)newValue);
				return;
			case SchemaPackage.TYPE_FREQUENCE__FREQUENCE_MINIMALE:
				setFrequenceMinimale((TypeDataTypeFrequence)newValue);
				return;
			case SchemaPackage.TYPE_FREQUENCE__FREQUENCE_MAXIMALE:
				setFrequenceMaximale((TypeDataTypeFrequence)newValue);
				return;
			case SchemaPackage.TYPE_FREQUENCE__BANDE_FREQUENCE:
				setBandeFrequence((TypeDictionaryDicoFrequenceBandeFrequence)newValue);
				return;
			case SchemaPackage.TYPE_FREQUENCE__IDENTIFICATION_BANDE:
				setIdentificationBande((TypeDictionaryDicoFrequenceIdentificationBande)newValue);
				return;
			case SchemaPackage.TYPE_FREQUENCE__MODULATION:
				setModulation((TypeDictionaryDicoFrequenceModulation)newValue);
				return;
			case SchemaPackage.TYPE_FREQUENCE__DATE_DEBUT:
				setDateDebut((TypeDataTypeDateHeure)newValue);
				return;
			case SchemaPackage.TYPE_FREQUENCE__DATE_FIN:
				setDateFin((TypeDataTypeDateHeure)newValue);
				return;
			case SchemaPackage.TYPE_FREQUENCE__FINALITE:
				setFinalite((String)newValue);
				return;
			case SchemaPackage.TYPE_FREQUENCE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_FREQUENCE__CE:
				setCE((String)newValue);
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
			case SchemaPackage.TYPE_FREQUENCE__REFERENCE_AOPT:
				setReferenceAOPT(REFERENCE_AOPT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_FREQUENCE__FREQUENCE:
				setFrequence((TypeDataTypeFrequence)null);
				return;
			case SchemaPackage.TYPE_FREQUENCE__NUMERO_CANAL:
				unsetNumeroCanal();
				return;
			case SchemaPackage.TYPE_FREQUENCE__NOM_CODE:
				setNomCode(NOM_CODE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_FREQUENCE__CATEGORIE_RESTRICTION:
				unsetCategorieRestriction();
				return;
			case SchemaPackage.TYPE_FREQUENCE__FREQUENCE_MINIMALE:
				setFrequenceMinimale((TypeDataTypeFrequence)null);
				return;
			case SchemaPackage.TYPE_FREQUENCE__FREQUENCE_MAXIMALE:
				setFrequenceMaximale((TypeDataTypeFrequence)null);
				return;
			case SchemaPackage.TYPE_FREQUENCE__BANDE_FREQUENCE:
				unsetBandeFrequence();
				return;
			case SchemaPackage.TYPE_FREQUENCE__IDENTIFICATION_BANDE:
				unsetIdentificationBande();
				return;
			case SchemaPackage.TYPE_FREQUENCE__MODULATION:
				unsetModulation();
				return;
			case SchemaPackage.TYPE_FREQUENCE__DATE_DEBUT:
				setDateDebut((TypeDataTypeDateHeure)null);
				return;
			case SchemaPackage.TYPE_FREQUENCE__DATE_FIN:
				setDateFin((TypeDataTypeDateHeure)null);
				return;
			case SchemaPackage.TYPE_FREQUENCE__FINALITE:
				setFinalite(FINALITE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_FREQUENCE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_FREQUENCE__CE:
				setCE(CE_EDEFAULT);
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
			case SchemaPackage.TYPE_FREQUENCE__REFERENCE_AOPT:
				return REFERENCE_AOPT_EDEFAULT == null ? referenceAOPT != null : !REFERENCE_AOPT_EDEFAULT.equals(referenceAOPT);
			case SchemaPackage.TYPE_FREQUENCE__FREQUENCE:
				return frequence != null;
			case SchemaPackage.TYPE_FREQUENCE__NUMERO_CANAL:
				return isSetNumeroCanal();
			case SchemaPackage.TYPE_FREQUENCE__NOM_CODE:
				return NOM_CODE_EDEFAULT == null ? nomCode != null : !NOM_CODE_EDEFAULT.equals(nomCode);
			case SchemaPackage.TYPE_FREQUENCE__CATEGORIE_RESTRICTION:
				return isSetCategorieRestriction();
			case SchemaPackage.TYPE_FREQUENCE__FREQUENCE_MINIMALE:
				return frequenceMinimale != null;
			case SchemaPackage.TYPE_FREQUENCE__FREQUENCE_MAXIMALE:
				return frequenceMaximale != null;
			case SchemaPackage.TYPE_FREQUENCE__BANDE_FREQUENCE:
				return isSetBandeFrequence();
			case SchemaPackage.TYPE_FREQUENCE__IDENTIFICATION_BANDE:
				return isSetIdentificationBande();
			case SchemaPackage.TYPE_FREQUENCE__MODULATION:
				return isSetModulation();
			case SchemaPackage.TYPE_FREQUENCE__DATE_DEBUT:
				return dateDebut != null;
			case SchemaPackage.TYPE_FREQUENCE__DATE_FIN:
				return dateFin != null;
			case SchemaPackage.TYPE_FREQUENCE__FINALITE:
				return FINALITE_EDEFAULT == null ? finalite != null : !FINALITE_EDEFAULT.equals(finalite);
			case SchemaPackage.TYPE_FREQUENCE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_FREQUENCE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
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
		result.append(" (referenceAOPT: ");
		result.append(referenceAOPT);
		result.append(", numeroCanal: ");
		if (numeroCanalESet) result.append(numeroCanal); else result.append("<unset>");
		result.append(", nomCode: ");
		result.append(nomCode);
		result.append(", categorieRestriction: ");
		if (categorieRestrictionESet) result.append(categorieRestriction); else result.append("<unset>");
		result.append(", bandeFrequence: ");
		if (bandeFrequenceESet) result.append(bandeFrequence); else result.append("<unset>");
		result.append(", identificationBande: ");
		if (identificationBandeESet) result.append(identificationBande); else result.append("<unset>");
		result.append(", modulation: ");
		if (modulationESet) result.append(modulation); else result.append("<unset>");
		result.append(", finalite: ");
		result.append(finalite);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeFrequenceImpl
