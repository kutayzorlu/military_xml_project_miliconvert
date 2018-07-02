/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCRtraitementObjectif;
import mpia.schema.TypeDictionaryDicoCRtraitementObjectifCategorie;
import mpia.schema.TypeVolumeMunitionsASS;

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
 * An implementation of the model object '<em><b>Type CRtraitement Objectif</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCRtraitementObjectifImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCRtraitementObjectifImpl#getMotifsNonExecution <em>Motifs Non Execution</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCRtraitementObjectifImpl#getDebutTraitement <em>Debut Traitement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCRtraitementObjectifImpl#getFinTraitement <em>Fin Traitement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCRtraitementObjectifImpl#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCRtraitementObjectifImpl#getEffetConstate <em>Effet Constate</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCRtraitementObjectifImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCRtraitementObjectifImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCRtraitementObjectifImpl#getAPourUniteChargeeTraitementUnite <em>APour Unite Chargee Traitement Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCRtraitementObjectifImpl#getAPourUniteAAlerterUnite <em>APour Unite AAlerter Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCRtraitementObjectifImpl#getAPourMunitionsConsommeesVolumeMunitionsASS <em>APour Munitions Consommees Volume Munitions ASS</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCRtraitementObjectifImpl extends EObjectImpl implements TypeCRtraitementObjectif {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCRtraitementObjectifCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoCRtraitementObjectifCategorie.EXEC;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCRtraitementObjectifCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getMotifsNonExecution() <em>Motifs Non Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotifsNonExecution()
	 * @generated
	 * @ordered
	 */
	protected static final String MOTIFS_NON_EXECUTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMotifsNonExecution() <em>Motifs Non Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotifsNonExecution()
	 * @generated
	 * @ordered
	 */
	protected String motifsNonExecution = MOTIFS_NON_EXECUTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDebutTraitement() <em>Debut Traitement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebutTraitement()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DEBUT_TRAITEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDebutTraitement() <em>Debut Traitement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebutTraitement()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar debutTraitement = DEBUT_TRAITEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinTraitement() <em>Fin Traitement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinTraitement()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar FIN_TRAITEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFinTraitement() <em>Fin Traitement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinTraitement()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar finTraitement = FIN_TRAITEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommentaire() <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaire()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTAIRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommentaire() <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaire()
	 * @generated
	 * @ordered
	 */
	protected String commentaire = COMMENTAIRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEffetConstate() <em>Effet Constate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffetConstate()
	 * @generated
	 * @ordered
	 */
	protected static final double EFFET_CONSTATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEffetConstate() <em>Effet Constate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffetConstate()
	 * @generated
	 * @ordered
	 */
	protected double effetConstate = EFFET_CONSTATE_EDEFAULT;

	/**
	 * This is true if the Effet Constate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean effetConstateESet;

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
	 * The cached value of the '{@link #getAPourUniteChargeeTraitementUnite() <em>APour Unite Chargee Traitement Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUniteChargeeTraitementUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourUniteChargeeTraitementUnite;

	/**
	 * The cached value of the '{@link #getAPourUniteAAlerterUnite() <em>APour Unite AAlerter Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUniteAAlerterUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociationEXT> aPourUniteAAlerterUnite;

	/**
	 * The cached value of the '{@link #getAPourMunitionsConsommeesVolumeMunitionsASS() <em>APour Munitions Consommees Volume Munitions ASS</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourMunitionsConsommeesVolumeMunitionsASS()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeVolumeMunitionsASS> aPourMunitionsConsommeesVolumeMunitionsASS;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCRtraitementObjectifImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCRtraitementObjectif();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCRtraitementObjectifCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoCRtraitementObjectifCategorie newCategorie) {
		TypeDictionaryDicoCRtraitementObjectifCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoCRtraitementObjectifCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public String getMotifsNonExecution() {
		return motifsNonExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMotifsNonExecution(String newMotifsNonExecution) {
		String oldMotifsNonExecution = motifsNonExecution;
		motifsNonExecution = newMotifsNonExecution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__MOTIFS_NON_EXECUTION, oldMotifsNonExecution, motifsNonExecution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDebutTraitement() {
		return debutTraitement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebutTraitement(XMLGregorianCalendar newDebutTraitement) {
		XMLGregorianCalendar oldDebutTraitement = debutTraitement;
		debutTraitement = newDebutTraitement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__DEBUT_TRAITEMENT, oldDebutTraitement, debutTraitement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getFinTraitement() {
		return finTraitement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinTraitement(XMLGregorianCalendar newFinTraitement) {
		XMLGregorianCalendar oldFinTraitement = finTraitement;
		finTraitement = newFinTraitement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__FIN_TRAITEMENT, oldFinTraitement, finTraitement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommentaire() {
		return commentaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentaire(String newCommentaire) {
		String oldCommentaire = commentaire;
		commentaire = newCommentaire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__COMMENTAIRE, oldCommentaire, commentaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEffetConstate() {
		return effetConstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffetConstate(double newEffetConstate) {
		double oldEffetConstate = effetConstate;
		effetConstate = newEffetConstate;
		boolean oldEffetConstateESet = effetConstateESet;
		effetConstateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__EFFET_CONSTATE, oldEffetConstate, effetConstate, !oldEffetConstateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEffetConstate() {
		double oldEffetConstate = effetConstate;
		boolean oldEffetConstateESet = effetConstateESet;
		effetConstate = EFFET_CONSTATE_EDEFAULT;
		effetConstateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__EFFET_CONSTATE, oldEffetConstate, EFFET_CONSTATE_EDEFAULT, oldEffetConstateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEffetConstate() {
		return effetConstateESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourUniteChargeeTraitementUnite() {
		return aPourUniteChargeeTraitementUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourUniteChargeeTraitementUnite(TypeAssociationEXT newAPourUniteChargeeTraitementUnite, NotificationChain msgs) {
		TypeAssociationEXT oldAPourUniteChargeeTraitementUnite = aPourUniteChargeeTraitementUnite;
		aPourUniteChargeeTraitementUnite = newAPourUniteChargeeTraitementUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__APOUR_UNITE_CHARGEE_TRAITEMENT_UNITE, oldAPourUniteChargeeTraitementUnite, newAPourUniteChargeeTraitementUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourUniteChargeeTraitementUnite(TypeAssociationEXT newAPourUniteChargeeTraitementUnite) {
		if (newAPourUniteChargeeTraitementUnite != aPourUniteChargeeTraitementUnite) {
			NotificationChain msgs = null;
			if (aPourUniteChargeeTraitementUnite != null)
				msgs = ((InternalEObject)aPourUniteChargeeTraitementUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__APOUR_UNITE_CHARGEE_TRAITEMENT_UNITE, null, msgs);
			if (newAPourUniteChargeeTraitementUnite != null)
				msgs = ((InternalEObject)newAPourUniteChargeeTraitementUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__APOUR_UNITE_CHARGEE_TRAITEMENT_UNITE, null, msgs);
			msgs = basicSetAPourUniteChargeeTraitementUnite(newAPourUniteChargeeTraitementUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__APOUR_UNITE_CHARGEE_TRAITEMENT_UNITE, newAPourUniteChargeeTraitementUnite, newAPourUniteChargeeTraitementUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEXT> getAPourUniteAAlerterUnite() {
		if (aPourUniteAAlerterUnite == null) {
			aPourUniteAAlerterUnite = new EObjectContainmentEList<TypeAssociationEXT>(TypeAssociationEXT.class, this, SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__APOUR_UNITE_AALERTER_UNITE);
		}
		return aPourUniteAAlerterUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeVolumeMunitionsASS> getAPourMunitionsConsommeesVolumeMunitionsASS() {
		if (aPourMunitionsConsommeesVolumeMunitionsASS == null) {
			aPourMunitionsConsommeesVolumeMunitionsASS = new EObjectContainmentEList<TypeVolumeMunitionsASS>(TypeVolumeMunitionsASS.class, this, SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__APOUR_MUNITIONS_CONSOMMEES_VOLUME_MUNITIONS_ASS);
		}
		return aPourMunitionsConsommeesVolumeMunitionsASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__APOUR_UNITE_CHARGEE_TRAITEMENT_UNITE:
				return basicSetAPourUniteChargeeTraitementUnite(null, msgs);
			case SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__APOUR_UNITE_AALERTER_UNITE:
				return ((InternalEList<?>)getAPourUniteAAlerterUnite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__APOUR_MUNITIONS_CONSOMMEES_VOLUME_MUNITIONS_ASS:
				return ((InternalEList<?>)getAPourMunitionsConsommeesVolumeMunitionsASS()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__MOTIFS_NON_EXECUTION:
				return getMotifsNonExecution();
			case SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__DEBUT_TRAITEMENT:
				return getDebutTraitement();
			case SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__FIN_TRAITEMENT:
				return getFinTraitement();
			case SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__COMMENTAIRE:
				return getCommentaire();
			case SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__EFFET_CONSTATE:
				return new Double(getEffetConstate());
			case SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__CTE:
				return getCTE();
			case SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__CE:
				return getCE();
			case SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__APOUR_UNITE_CHARGEE_TRAITEMENT_UNITE:
				return getAPourUniteChargeeTraitementUnite();
			case SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__APOUR_UNITE_AALERTER_UNITE:
				return getAPourUniteAAlerterUnite();
			case SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__APOUR_MUNITIONS_CONSOMMEES_VOLUME_MUNITIONS_ASS:
				return getAPourMunitionsConsommeesVolumeMunitionsASS();
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
			case SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__CATEGORIE:
				setCategorie((TypeDictionaryDicoCRtraitementObjectifCategorie)newValue);
				return;
			case SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__MOTIFS_NON_EXECUTION:
				setMotifsNonExecution((String)newValue);
				return;
			case SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__DEBUT_TRAITEMENT:
				setDebutTraitement((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__FIN_TRAITEMENT:
				setFinTraitement((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__COMMENTAIRE:
				setCommentaire((String)newValue);
				return;
			case SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__EFFET_CONSTATE:
				setEffetConstate(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__APOUR_UNITE_CHARGEE_TRAITEMENT_UNITE:
				setAPourUniteChargeeTraitementUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__APOUR_UNITE_AALERTER_UNITE:
				getAPourUniteAAlerterUnite().clear();
				getAPourUniteAAlerterUnite().addAll((Collection<? extends TypeAssociationEXT>)newValue);
				return;
			case SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__APOUR_MUNITIONS_CONSOMMEES_VOLUME_MUNITIONS_ASS:
				getAPourMunitionsConsommeesVolumeMunitionsASS().clear();
				getAPourMunitionsConsommeesVolumeMunitionsASS().addAll((Collection<? extends TypeVolumeMunitionsASS>)newValue);
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
			case SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__MOTIFS_NON_EXECUTION:
				setMotifsNonExecution(MOTIFS_NON_EXECUTION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__DEBUT_TRAITEMENT:
				setDebutTraitement(DEBUT_TRAITEMENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__FIN_TRAITEMENT:
				setFinTraitement(FIN_TRAITEMENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__COMMENTAIRE:
				setCommentaire(COMMENTAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__EFFET_CONSTATE:
				unsetEffetConstate();
				return;
			case SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__APOUR_UNITE_CHARGEE_TRAITEMENT_UNITE:
				setAPourUniteChargeeTraitementUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__APOUR_UNITE_AALERTER_UNITE:
				getAPourUniteAAlerterUnite().clear();
				return;
			case SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__APOUR_MUNITIONS_CONSOMMEES_VOLUME_MUNITIONS_ASS:
				getAPourMunitionsConsommeesVolumeMunitionsASS().clear();
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
			case SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__MOTIFS_NON_EXECUTION:
				return MOTIFS_NON_EXECUTION_EDEFAULT == null ? motifsNonExecution != null : !MOTIFS_NON_EXECUTION_EDEFAULT.equals(motifsNonExecution);
			case SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__DEBUT_TRAITEMENT:
				return DEBUT_TRAITEMENT_EDEFAULT == null ? debutTraitement != null : !DEBUT_TRAITEMENT_EDEFAULT.equals(debutTraitement);
			case SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__FIN_TRAITEMENT:
				return FIN_TRAITEMENT_EDEFAULT == null ? finTraitement != null : !FIN_TRAITEMENT_EDEFAULT.equals(finTraitement);
			case SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__COMMENTAIRE:
				return COMMENTAIRE_EDEFAULT == null ? commentaire != null : !COMMENTAIRE_EDEFAULT.equals(commentaire);
			case SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__EFFET_CONSTATE:
				return isSetEffetConstate();
			case SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__APOUR_UNITE_CHARGEE_TRAITEMENT_UNITE:
				return aPourUniteChargeeTraitementUnite != null;
			case SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__APOUR_UNITE_AALERTER_UNITE:
				return aPourUniteAAlerterUnite != null && !aPourUniteAAlerterUnite.isEmpty();
			case SchemaPackage.TYPE_CRTRAITEMENT_OBJECTIF__APOUR_MUNITIONS_CONSOMMEES_VOLUME_MUNITIONS_ASS:
				return aPourMunitionsConsommeesVolumeMunitionsASS != null && !aPourMunitionsConsommeesVolumeMunitionsASS.isEmpty();
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
		result.append(", motifsNonExecution: ");
		result.append(motifsNonExecution);
		result.append(", debutTraitement: ");
		result.append(debutTraitement);
		result.append(", finTraitement: ");
		result.append(finTraitement);
		result.append(", commentaire: ");
		result.append(commentaire);
		result.append(", effetConstate: ");
		if (effetConstateESet) result.append(effetConstate); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeCRtraitementObjectifImpl
