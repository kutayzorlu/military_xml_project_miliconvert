/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeComptage;
import mpia.schema.TypeDictionaryDicoComptageDelaiTraitement;
import mpia.schema.TypeDictionaryDicoComptageGroupeAge;
import mpia.schema.TypeDictionaryDicoComptageMaladie;
import mpia.schema.TypeDictionaryDicoComptageQualificatifCompte;
import mpia.schema.TypeDictionaryDicoLangue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Comptage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeComptageImpl#getQuantite <em>Quantite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeComptageImpl#getQualificatifCompte <em>Qualificatif Compte</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeComptageImpl#getMaladie <em>Maladie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeComptageImpl#isEstTransmissible <em>Est Transmissible</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeComptageImpl#getGroupeAge <em>Groupe Age</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeComptageImpl#getLangue <em>Langue</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeComptageImpl#getDelaiTraitement <em>Delai Traitement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeComptageImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeComptageImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeComptageImpl#getEstComptePourTypePersonne <em>Est Compte Pour Type Personne</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeComptageImpl extends EObjectImpl implements TypeComptage {
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
	 * The default value of the '{@link #getQualificatifCompte() <em>Qualificatif Compte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificatifCompte()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoComptageQualificatifCompte QUALIFICATIF_COMPTE_EDEFAULT = TypeDictionaryDicoComptageQualificatifCompte.AILING;

	/**
	 * The cached value of the '{@link #getQualificatifCompte() <em>Qualificatif Compte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificatifCompte()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoComptageQualificatifCompte qualificatifCompte = QUALIFICATIF_COMPTE_EDEFAULT;

	/**
	 * This is true if the Qualificatif Compte attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean qualificatifCompteESet;

	/**
	 * The default value of the '{@link #getMaladie() <em>Maladie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaladie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoComptageMaladie MALADIE_EDEFAULT = TypeDictionaryDicoComptageMaladie.AFRTRP;

	/**
	 * The cached value of the '{@link #getMaladie() <em>Maladie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaladie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoComptageMaladie maladie = MALADIE_EDEFAULT;

	/**
	 * This is true if the Maladie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maladieESet;

	/**
	 * The default value of the '{@link #isEstTransmissible() <em>Est Transmissible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEstTransmissible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EST_TRANSMISSIBLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEstTransmissible() <em>Est Transmissible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEstTransmissible()
	 * @generated
	 * @ordered
	 */
	protected boolean estTransmissible = EST_TRANSMISSIBLE_EDEFAULT;

	/**
	 * This is true if the Est Transmissible attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean estTransmissibleESet;

	/**
	 * The default value of the '{@link #getGroupeAge() <em>Groupe Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupeAge()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoComptageGroupeAge GROUPE_AGE_EDEFAULT = TypeDictionaryDicoComptageGroupeAge.ADULT;

	/**
	 * The cached value of the '{@link #getGroupeAge() <em>Groupe Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupeAge()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoComptageGroupeAge groupeAge = GROUPE_AGE_EDEFAULT;

	/**
	 * This is true if the Groupe Age attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean groupeAgeESet;

	/**
	 * The default value of the '{@link #getLangue() <em>Langue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangue()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoLangue LANGUE_EDEFAULT = TypeDictionaryDicoLangue.AFGHAN;

	/**
	 * The cached value of the '{@link #getLangue() <em>Langue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangue()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoLangue langue = LANGUE_EDEFAULT;

	/**
	 * This is true if the Langue attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean langueESet;

	/**
	 * The default value of the '{@link #getDelaiTraitement() <em>Delai Traitement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelaiTraitement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoComptageDelaiTraitement DELAI_TRAITEMENT_EDEFAULT = TypeDictionaryDicoComptageDelaiTraitement.T1;

	/**
	 * The cached value of the '{@link #getDelaiTraitement() <em>Delai Traitement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelaiTraitement()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoComptageDelaiTraitement delaiTraitement = DELAI_TRAITEMENT_EDEFAULT;

	/**
	 * This is true if the Delai Traitement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean delaiTraitementESet;

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
	 * The cached value of the '{@link #getEstComptePourTypePersonne() <em>Est Compte Pour Type Personne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstComptePourTypePersonne()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT estComptePourTypePersonne;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeComptageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeComptage();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPTAGE__QUANTITE, oldQuantite, quantite, !oldQuantiteESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_COMPTAGE__QUANTITE, oldQuantite, QUANTITE_EDEFAULT, oldQuantiteESet));
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
	public TypeDictionaryDicoComptageQualificatifCompte getQualificatifCompte() {
		return qualificatifCompte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualificatifCompte(TypeDictionaryDicoComptageQualificatifCompte newQualificatifCompte) {
		TypeDictionaryDicoComptageQualificatifCompte oldQualificatifCompte = qualificatifCompte;
		qualificatifCompte = newQualificatifCompte == null ? QUALIFICATIF_COMPTE_EDEFAULT : newQualificatifCompte;
		boolean oldQualificatifCompteESet = qualificatifCompteESet;
		qualificatifCompteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPTAGE__QUALIFICATIF_COMPTE, oldQualificatifCompte, qualificatifCompte, !oldQualificatifCompteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQualificatifCompte() {
		TypeDictionaryDicoComptageQualificatifCompte oldQualificatifCompte = qualificatifCompte;
		boolean oldQualificatifCompteESet = qualificatifCompteESet;
		qualificatifCompte = QUALIFICATIF_COMPTE_EDEFAULT;
		qualificatifCompteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_COMPTAGE__QUALIFICATIF_COMPTE, oldQualificatifCompte, QUALIFICATIF_COMPTE_EDEFAULT, oldQualificatifCompteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQualificatifCompte() {
		return qualificatifCompteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoComptageMaladie getMaladie() {
		return maladie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaladie(TypeDictionaryDicoComptageMaladie newMaladie) {
		TypeDictionaryDicoComptageMaladie oldMaladie = maladie;
		maladie = newMaladie == null ? MALADIE_EDEFAULT : newMaladie;
		boolean oldMaladieESet = maladieESet;
		maladieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPTAGE__MALADIE, oldMaladie, maladie, !oldMaladieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaladie() {
		TypeDictionaryDicoComptageMaladie oldMaladie = maladie;
		boolean oldMaladieESet = maladieESet;
		maladie = MALADIE_EDEFAULT;
		maladieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_COMPTAGE__MALADIE, oldMaladie, MALADIE_EDEFAULT, oldMaladieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaladie() {
		return maladieESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEstTransmissible() {
		return estTransmissible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstTransmissible(boolean newEstTransmissible) {
		boolean oldEstTransmissible = estTransmissible;
		estTransmissible = newEstTransmissible;
		boolean oldEstTransmissibleESet = estTransmissibleESet;
		estTransmissibleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPTAGE__EST_TRANSMISSIBLE, oldEstTransmissible, estTransmissible, !oldEstTransmissibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEstTransmissible() {
		boolean oldEstTransmissible = estTransmissible;
		boolean oldEstTransmissibleESet = estTransmissibleESet;
		estTransmissible = EST_TRANSMISSIBLE_EDEFAULT;
		estTransmissibleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_COMPTAGE__EST_TRANSMISSIBLE, oldEstTransmissible, EST_TRANSMISSIBLE_EDEFAULT, oldEstTransmissibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEstTransmissible() {
		return estTransmissibleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoComptageGroupeAge getGroupeAge() {
		return groupeAge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupeAge(TypeDictionaryDicoComptageGroupeAge newGroupeAge) {
		TypeDictionaryDicoComptageGroupeAge oldGroupeAge = groupeAge;
		groupeAge = newGroupeAge == null ? GROUPE_AGE_EDEFAULT : newGroupeAge;
		boolean oldGroupeAgeESet = groupeAgeESet;
		groupeAgeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPTAGE__GROUPE_AGE, oldGroupeAge, groupeAge, !oldGroupeAgeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGroupeAge() {
		TypeDictionaryDicoComptageGroupeAge oldGroupeAge = groupeAge;
		boolean oldGroupeAgeESet = groupeAgeESet;
		groupeAge = GROUPE_AGE_EDEFAULT;
		groupeAgeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_COMPTAGE__GROUPE_AGE, oldGroupeAge, GROUPE_AGE_EDEFAULT, oldGroupeAgeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGroupeAge() {
		return groupeAgeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoLangue getLangue() {
		return langue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLangue(TypeDictionaryDicoLangue newLangue) {
		TypeDictionaryDicoLangue oldLangue = langue;
		langue = newLangue == null ? LANGUE_EDEFAULT : newLangue;
		boolean oldLangueESet = langueESet;
		langueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPTAGE__LANGUE, oldLangue, langue, !oldLangueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLangue() {
		TypeDictionaryDicoLangue oldLangue = langue;
		boolean oldLangueESet = langueESet;
		langue = LANGUE_EDEFAULT;
		langueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_COMPTAGE__LANGUE, oldLangue, LANGUE_EDEFAULT, oldLangueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLangue() {
		return langueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoComptageDelaiTraitement getDelaiTraitement() {
		return delaiTraitement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelaiTraitement(TypeDictionaryDicoComptageDelaiTraitement newDelaiTraitement) {
		TypeDictionaryDicoComptageDelaiTraitement oldDelaiTraitement = delaiTraitement;
		delaiTraitement = newDelaiTraitement == null ? DELAI_TRAITEMENT_EDEFAULT : newDelaiTraitement;
		boolean oldDelaiTraitementESet = delaiTraitementESet;
		delaiTraitementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPTAGE__DELAI_TRAITEMENT, oldDelaiTraitement, delaiTraitement, !oldDelaiTraitementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDelaiTraitement() {
		TypeDictionaryDicoComptageDelaiTraitement oldDelaiTraitement = delaiTraitement;
		boolean oldDelaiTraitementESet = delaiTraitementESet;
		delaiTraitement = DELAI_TRAITEMENT_EDEFAULT;
		delaiTraitementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_COMPTAGE__DELAI_TRAITEMENT, oldDelaiTraitement, DELAI_TRAITEMENT_EDEFAULT, oldDelaiTraitementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDelaiTraitement() {
		return delaiTraitementESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPTAGE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPTAGE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getEstComptePourTypePersonne() {
		return estComptePourTypePersonne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstComptePourTypePersonne(TypeAssociationEXT newEstComptePourTypePersonne, NotificationChain msgs) {
		TypeAssociationEXT oldEstComptePourTypePersonne = estComptePourTypePersonne;
		estComptePourTypePersonne = newEstComptePourTypePersonne;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPTAGE__EST_COMPTE_POUR_TYPE_PERSONNE, oldEstComptePourTypePersonne, newEstComptePourTypePersonne);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstComptePourTypePersonne(TypeAssociationEXT newEstComptePourTypePersonne) {
		if (newEstComptePourTypePersonne != estComptePourTypePersonne) {
			NotificationChain msgs = null;
			if (estComptePourTypePersonne != null)
				msgs = ((InternalEObject)estComptePourTypePersonne).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_COMPTAGE__EST_COMPTE_POUR_TYPE_PERSONNE, null, msgs);
			if (newEstComptePourTypePersonne != null)
				msgs = ((InternalEObject)newEstComptePourTypePersonne).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_COMPTAGE__EST_COMPTE_POUR_TYPE_PERSONNE, null, msgs);
			msgs = basicSetEstComptePourTypePersonne(newEstComptePourTypePersonne, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPTAGE__EST_COMPTE_POUR_TYPE_PERSONNE, newEstComptePourTypePersonne, newEstComptePourTypePersonne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_COMPTAGE__EST_COMPTE_POUR_TYPE_PERSONNE:
				return basicSetEstComptePourTypePersonne(null, msgs);
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
			case SchemaPackage.TYPE_COMPTAGE__QUANTITE:
				return new Long(getQuantite());
			case SchemaPackage.TYPE_COMPTAGE__QUALIFICATIF_COMPTE:
				return getQualificatifCompte();
			case SchemaPackage.TYPE_COMPTAGE__MALADIE:
				return getMaladie();
			case SchemaPackage.TYPE_COMPTAGE__EST_TRANSMISSIBLE:
				return isEstTransmissible() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_COMPTAGE__GROUPE_AGE:
				return getGroupeAge();
			case SchemaPackage.TYPE_COMPTAGE__LANGUE:
				return getLangue();
			case SchemaPackage.TYPE_COMPTAGE__DELAI_TRAITEMENT:
				return getDelaiTraitement();
			case SchemaPackage.TYPE_COMPTAGE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_COMPTAGE__CE:
				return getCE();
			case SchemaPackage.TYPE_COMPTAGE__EST_COMPTE_POUR_TYPE_PERSONNE:
				return getEstComptePourTypePersonne();
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
			case SchemaPackage.TYPE_COMPTAGE__QUANTITE:
				setQuantite(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_COMPTAGE__QUALIFICATIF_COMPTE:
				setQualificatifCompte((TypeDictionaryDicoComptageQualificatifCompte)newValue);
				return;
			case SchemaPackage.TYPE_COMPTAGE__MALADIE:
				setMaladie((TypeDictionaryDicoComptageMaladie)newValue);
				return;
			case SchemaPackage.TYPE_COMPTAGE__EST_TRANSMISSIBLE:
				setEstTransmissible(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_COMPTAGE__GROUPE_AGE:
				setGroupeAge((TypeDictionaryDicoComptageGroupeAge)newValue);
				return;
			case SchemaPackage.TYPE_COMPTAGE__LANGUE:
				setLangue((TypeDictionaryDicoLangue)newValue);
				return;
			case SchemaPackage.TYPE_COMPTAGE__DELAI_TRAITEMENT:
				setDelaiTraitement((TypeDictionaryDicoComptageDelaiTraitement)newValue);
				return;
			case SchemaPackage.TYPE_COMPTAGE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_COMPTAGE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_COMPTAGE__EST_COMPTE_POUR_TYPE_PERSONNE:
				setEstComptePourTypePersonne((TypeAssociationEXT)newValue);
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
			case SchemaPackage.TYPE_COMPTAGE__QUANTITE:
				unsetQuantite();
				return;
			case SchemaPackage.TYPE_COMPTAGE__QUALIFICATIF_COMPTE:
				unsetQualificatifCompte();
				return;
			case SchemaPackage.TYPE_COMPTAGE__MALADIE:
				unsetMaladie();
				return;
			case SchemaPackage.TYPE_COMPTAGE__EST_TRANSMISSIBLE:
				unsetEstTransmissible();
				return;
			case SchemaPackage.TYPE_COMPTAGE__GROUPE_AGE:
				unsetGroupeAge();
				return;
			case SchemaPackage.TYPE_COMPTAGE__LANGUE:
				unsetLangue();
				return;
			case SchemaPackage.TYPE_COMPTAGE__DELAI_TRAITEMENT:
				unsetDelaiTraitement();
				return;
			case SchemaPackage.TYPE_COMPTAGE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_COMPTAGE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_COMPTAGE__EST_COMPTE_POUR_TYPE_PERSONNE:
				setEstComptePourTypePersonne((TypeAssociationEXT)null);
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
			case SchemaPackage.TYPE_COMPTAGE__QUANTITE:
				return isSetQuantite();
			case SchemaPackage.TYPE_COMPTAGE__QUALIFICATIF_COMPTE:
				return isSetQualificatifCompte();
			case SchemaPackage.TYPE_COMPTAGE__MALADIE:
				return isSetMaladie();
			case SchemaPackage.TYPE_COMPTAGE__EST_TRANSMISSIBLE:
				return isSetEstTransmissible();
			case SchemaPackage.TYPE_COMPTAGE__GROUPE_AGE:
				return isSetGroupeAge();
			case SchemaPackage.TYPE_COMPTAGE__LANGUE:
				return isSetLangue();
			case SchemaPackage.TYPE_COMPTAGE__DELAI_TRAITEMENT:
				return isSetDelaiTraitement();
			case SchemaPackage.TYPE_COMPTAGE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_COMPTAGE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_COMPTAGE__EST_COMPTE_POUR_TYPE_PERSONNE:
				return estComptePourTypePersonne != null;
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
		result.append(", qualificatifCompte: ");
		if (qualificatifCompteESet) result.append(qualificatifCompte); else result.append("<unset>");
		result.append(", maladie: ");
		if (maladieESet) result.append(maladie); else result.append("<unset>");
		result.append(", estTransmissible: ");
		if (estTransmissibleESet) result.append(estTransmissible); else result.append("<unset>");
		result.append(", groupeAge: ");
		if (groupeAgeESet) result.append(groupeAge); else result.append("<unset>");
		result.append(", langue: ");
		if (langueESet) result.append(langue); else result.append("<unset>");
		result.append(", delaiTraitement: ");
		if (delaiTraitementESet) result.append(delaiTraitement); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeComptageImpl
