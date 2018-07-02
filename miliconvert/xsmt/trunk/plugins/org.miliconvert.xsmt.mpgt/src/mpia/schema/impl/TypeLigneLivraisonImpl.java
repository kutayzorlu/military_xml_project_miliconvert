/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoCodeConditionnement;
import mpia.schema.TypeDictionaryDicoConditionnementUnite;
import mpia.schema.TypeLigneLivraison;

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
 * An implementation of the model object '<em><b>Type Ligne Livraison</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeLigneLivraisonImpl#getQuantite <em>Quantite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLigneLivraisonImpl#getConditionnement <em>Conditionnement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLigneLivraisonImpl#getNomConditionnement <em>Nom Conditionnement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLigneLivraisonImpl#getConditionnementUnite <em>Conditionnement Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLigneLivraisonImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLigneLivraisonImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLigneLivraisonImpl#getConcerneChargementMateriel <em>Concerne Chargement Materiel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLigneLivraisonImpl#getConcerneTypeMaterielTypeMateriel <em>Concerne Type Materiel Type Materiel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLigneLivraisonImpl#getDecritLivraison <em>Decrit Livraison</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeLigneLivraisonImpl extends EObjectImpl implements TypeLigneLivraison {
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
	 * The cached value of the '{@link #getConcerneChargementMateriel() <em>Concerne Chargement Materiel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneChargementMateriel()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> concerneChargementMateriel;

	/**
	 * The cached value of the '{@link #getConcerneTypeMaterielTypeMateriel() <em>Concerne Type Materiel Type Materiel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneTypeMaterielTypeMateriel()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT concerneTypeMaterielTypeMateriel;

	/**
	 * The cached value of the '{@link #getDecritLivraison() <em>Decrit Livraison</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecritLivraison()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation decritLivraison;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeLigneLivraisonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeLigneLivraison();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIGNE_LIVRAISON__QUANTITE, oldQuantite, quantite, !oldQuantiteESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_LIGNE_LIVRAISON__QUANTITE, oldQuantite, QUANTITE_EDEFAULT, oldQuantiteESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIGNE_LIVRAISON__CONDITIONNEMENT, oldConditionnement, conditionnement, !oldConditionnementESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_LIGNE_LIVRAISON__CONDITIONNEMENT, oldConditionnement, CONDITIONNEMENT_EDEFAULT, oldConditionnementESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIGNE_LIVRAISON__NOM_CONDITIONNEMENT, oldNomConditionnement, nomConditionnement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIGNE_LIVRAISON__CONDITIONNEMENT_UNITE, oldConditionnementUnite, conditionnementUnite, !oldConditionnementUniteESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_LIGNE_LIVRAISON__CONDITIONNEMENT_UNITE, oldConditionnementUnite, CONDITIONNEMENT_UNITE_EDEFAULT, oldConditionnementUniteESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIGNE_LIVRAISON__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIGNE_LIVRAISON__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getConcerneChargementMateriel() {
		if (concerneChargementMateriel == null) {
			concerneChargementMateriel = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_LIGNE_LIVRAISON__CONCERNE_CHARGEMENT_MATERIEL);
		}
		return concerneChargementMateriel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getConcerneTypeMaterielTypeMateriel() {
		return concerneTypeMaterielTypeMateriel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcerneTypeMaterielTypeMateriel(TypeAssociationEXT newConcerneTypeMaterielTypeMateriel, NotificationChain msgs) {
		TypeAssociationEXT oldConcerneTypeMaterielTypeMateriel = concerneTypeMaterielTypeMateriel;
		concerneTypeMaterielTypeMateriel = newConcerneTypeMaterielTypeMateriel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIGNE_LIVRAISON__CONCERNE_TYPE_MATERIEL_TYPE_MATERIEL, oldConcerneTypeMaterielTypeMateriel, newConcerneTypeMaterielTypeMateriel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcerneTypeMaterielTypeMateriel(TypeAssociationEXT newConcerneTypeMaterielTypeMateriel) {
		if (newConcerneTypeMaterielTypeMateriel != concerneTypeMaterielTypeMateriel) {
			NotificationChain msgs = null;
			if (concerneTypeMaterielTypeMateriel != null)
				msgs = ((InternalEObject)concerneTypeMaterielTypeMateriel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_LIGNE_LIVRAISON__CONCERNE_TYPE_MATERIEL_TYPE_MATERIEL, null, msgs);
			if (newConcerneTypeMaterielTypeMateriel != null)
				msgs = ((InternalEObject)newConcerneTypeMaterielTypeMateriel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_LIGNE_LIVRAISON__CONCERNE_TYPE_MATERIEL_TYPE_MATERIEL, null, msgs);
			msgs = basicSetConcerneTypeMaterielTypeMateriel(newConcerneTypeMaterielTypeMateriel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIGNE_LIVRAISON__CONCERNE_TYPE_MATERIEL_TYPE_MATERIEL, newConcerneTypeMaterielTypeMateriel, newConcerneTypeMaterielTypeMateriel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getDecritLivraison() {
		return decritLivraison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDecritLivraison(TypeAssociation newDecritLivraison, NotificationChain msgs) {
		TypeAssociation oldDecritLivraison = decritLivraison;
		decritLivraison = newDecritLivraison;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIGNE_LIVRAISON__DECRIT_LIVRAISON, oldDecritLivraison, newDecritLivraison);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecritLivraison(TypeAssociation newDecritLivraison) {
		if (newDecritLivraison != decritLivraison) {
			NotificationChain msgs = null;
			if (decritLivraison != null)
				msgs = ((InternalEObject)decritLivraison).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_LIGNE_LIVRAISON__DECRIT_LIVRAISON, null, msgs);
			if (newDecritLivraison != null)
				msgs = ((InternalEObject)newDecritLivraison).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_LIGNE_LIVRAISON__DECRIT_LIVRAISON, null, msgs);
			msgs = basicSetDecritLivraison(newDecritLivraison, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIGNE_LIVRAISON__DECRIT_LIVRAISON, newDecritLivraison, newDecritLivraison));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_LIGNE_LIVRAISON__CONCERNE_CHARGEMENT_MATERIEL:
				return ((InternalEList<?>)getConcerneChargementMateriel()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_LIGNE_LIVRAISON__CONCERNE_TYPE_MATERIEL_TYPE_MATERIEL:
				return basicSetConcerneTypeMaterielTypeMateriel(null, msgs);
			case SchemaPackage.TYPE_LIGNE_LIVRAISON__DECRIT_LIVRAISON:
				return basicSetDecritLivraison(null, msgs);
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
			case SchemaPackage.TYPE_LIGNE_LIVRAISON__QUANTITE:
				return new Long(getQuantite());
			case SchemaPackage.TYPE_LIGNE_LIVRAISON__CONDITIONNEMENT:
				return getConditionnement();
			case SchemaPackage.TYPE_LIGNE_LIVRAISON__NOM_CONDITIONNEMENT:
				return getNomConditionnement();
			case SchemaPackage.TYPE_LIGNE_LIVRAISON__CONDITIONNEMENT_UNITE:
				return getConditionnementUnite();
			case SchemaPackage.TYPE_LIGNE_LIVRAISON__CTE:
				return getCTE();
			case SchemaPackage.TYPE_LIGNE_LIVRAISON__CE:
				return getCE();
			case SchemaPackage.TYPE_LIGNE_LIVRAISON__CONCERNE_CHARGEMENT_MATERIEL:
				return getConcerneChargementMateriel();
			case SchemaPackage.TYPE_LIGNE_LIVRAISON__CONCERNE_TYPE_MATERIEL_TYPE_MATERIEL:
				return getConcerneTypeMaterielTypeMateriel();
			case SchemaPackage.TYPE_LIGNE_LIVRAISON__DECRIT_LIVRAISON:
				return getDecritLivraison();
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
			case SchemaPackage.TYPE_LIGNE_LIVRAISON__QUANTITE:
				setQuantite(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_LIGNE_LIVRAISON__CONDITIONNEMENT:
				setConditionnement((TypeDictionaryDicoCodeConditionnement)newValue);
				return;
			case SchemaPackage.TYPE_LIGNE_LIVRAISON__NOM_CONDITIONNEMENT:
				setNomConditionnement((String)newValue);
				return;
			case SchemaPackage.TYPE_LIGNE_LIVRAISON__CONDITIONNEMENT_UNITE:
				setConditionnementUnite((TypeDictionaryDicoConditionnementUnite)newValue);
				return;
			case SchemaPackage.TYPE_LIGNE_LIVRAISON__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_LIGNE_LIVRAISON__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_LIGNE_LIVRAISON__CONCERNE_CHARGEMENT_MATERIEL:
				getConcerneChargementMateriel().clear();
				getConcerneChargementMateriel().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_LIGNE_LIVRAISON__CONCERNE_TYPE_MATERIEL_TYPE_MATERIEL:
				setConcerneTypeMaterielTypeMateriel((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_LIGNE_LIVRAISON__DECRIT_LIVRAISON:
				setDecritLivraison((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_LIGNE_LIVRAISON__QUANTITE:
				unsetQuantite();
				return;
			case SchemaPackage.TYPE_LIGNE_LIVRAISON__CONDITIONNEMENT:
				unsetConditionnement();
				return;
			case SchemaPackage.TYPE_LIGNE_LIVRAISON__NOM_CONDITIONNEMENT:
				setNomConditionnement(NOM_CONDITIONNEMENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_LIGNE_LIVRAISON__CONDITIONNEMENT_UNITE:
				unsetConditionnementUnite();
				return;
			case SchemaPackage.TYPE_LIGNE_LIVRAISON__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_LIGNE_LIVRAISON__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_LIGNE_LIVRAISON__CONCERNE_CHARGEMENT_MATERIEL:
				getConcerneChargementMateriel().clear();
				return;
			case SchemaPackage.TYPE_LIGNE_LIVRAISON__CONCERNE_TYPE_MATERIEL_TYPE_MATERIEL:
				setConcerneTypeMaterielTypeMateriel((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_LIGNE_LIVRAISON__DECRIT_LIVRAISON:
				setDecritLivraison((TypeAssociation)null);
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
			case SchemaPackage.TYPE_LIGNE_LIVRAISON__QUANTITE:
				return isSetQuantite();
			case SchemaPackage.TYPE_LIGNE_LIVRAISON__CONDITIONNEMENT:
				return isSetConditionnement();
			case SchemaPackage.TYPE_LIGNE_LIVRAISON__NOM_CONDITIONNEMENT:
				return NOM_CONDITIONNEMENT_EDEFAULT == null ? nomConditionnement != null : !NOM_CONDITIONNEMENT_EDEFAULT.equals(nomConditionnement);
			case SchemaPackage.TYPE_LIGNE_LIVRAISON__CONDITIONNEMENT_UNITE:
				return isSetConditionnementUnite();
			case SchemaPackage.TYPE_LIGNE_LIVRAISON__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_LIGNE_LIVRAISON__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_LIGNE_LIVRAISON__CONCERNE_CHARGEMENT_MATERIEL:
				return concerneChargementMateriel != null && !concerneChargementMateriel.isEmpty();
			case SchemaPackage.TYPE_LIGNE_LIVRAISON__CONCERNE_TYPE_MATERIEL_TYPE_MATERIEL:
				return concerneTypeMaterielTypeMateriel != null;
			case SchemaPackage.TYPE_LIGNE_LIVRAISON__DECRIT_LIVRAISON:
				return decritLivraison != null;
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
		result.append(", conditionnement: ");
		if (conditionnementESet) result.append(conditionnement); else result.append("<unset>");
		result.append(", nomConditionnement: ");
		result.append(nomConditionnement);
		result.append(", conditionnementUnite: ");
		if (conditionnementUniteESet) result.append(conditionnementUnite); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeLigneLivraisonImpl
