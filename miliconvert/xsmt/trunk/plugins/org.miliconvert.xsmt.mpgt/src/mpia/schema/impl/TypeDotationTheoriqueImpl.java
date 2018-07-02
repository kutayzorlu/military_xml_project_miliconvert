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
import mpia.schema.TypeDictionaryDicoDotationTheoriqueCategorie;
import mpia.schema.TypeDictionaryDicoDotationTheoriqueEnvironnement;
import mpia.schema.TypeDictionaryDicoDotationTheoriqueTypeOperation;
import mpia.schema.TypeDotationTheorique;

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
 * An implementation of the model object '<em><b>Type Dotation Theorique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeDotationTheoriqueImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDotationTheoriqueImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDotationTheoriqueImpl#getTypeOperation <em>Type Operation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDotationTheoriqueImpl#getEnvironnement <em>Environnement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDotationTheoriqueImpl#getDateValidite <em>Date Validite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDotationTheoriqueImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDotationTheoriqueImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDotationTheoriqueImpl#getEstSpecifieAuTraversCompositionDotationTheoriqueEnType <em>Est Specifie Au Travers Composition Dotation Theorique En Type</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDotationTheoriqueImpl#getSpecifieCompositionType <em>Specifie Composition Type</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDotationTheoriqueImpl#getEstAffecteAuTraversDotationTheoriqueInstanceObjet <em>Est Affecte Au Travers Dotation Theorique Instance Objet</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDotationTheoriqueImpl#getEstDotationTheoriqueAssociationProfilDotationTheorique <em>Est Dotation Theorique Association Profil Dotation Theorique</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeDotationTheoriqueImpl extends EObjectImpl implements TypeDotationTheorique {
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
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoDotationTheoriqueCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoDotationTheoriqueCategorie.CES;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoDotationTheoriqueCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getTypeOperation() <em>Type Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOperation()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoDotationTheoriqueTypeOperation TYPE_OPERATION_EDEFAULT = TypeDictionaryDicoDotationTheoriqueTypeOperation.CV;

	/**
	 * The cached value of the '{@link #getTypeOperation() <em>Type Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOperation()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoDotationTheoriqueTypeOperation typeOperation = TYPE_OPERATION_EDEFAULT;

	/**
	 * This is true if the Type Operation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeOperationESet;

	/**
	 * The default value of the '{@link #getEnvironnement() <em>Environnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironnement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoDotationTheoriqueEnvironnement ENVIRONNEMENT_EDEFAULT = TypeDictionaryDicoDotationTheoriqueEnvironnement.ARC;

	/**
	 * The cached value of the '{@link #getEnvironnement() <em>Environnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironnement()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoDotationTheoriqueEnvironnement environnement = ENVIRONNEMENT_EDEFAULT;

	/**
	 * This is true if the Environnement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean environnementESet;

	/**
	 * The default value of the '{@link #getDateValidite() <em>Date Validite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateValidite()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_VALIDITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateValidite() <em>Date Validite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateValidite()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateValidite = DATE_VALIDITE_EDEFAULT;

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
	 * The cached value of the '{@link #getEstSpecifieAuTraversCompositionDotationTheoriqueEnType() <em>Est Specifie Au Travers Composition Dotation Theorique En Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSpecifieAuTraversCompositionDotationTheoriqueEnType()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSpecifieAuTraversCompositionDotationTheoriqueEnType;

	/**
	 * The cached value of the '{@link #getSpecifieCompositionType() <em>Specifie Composition Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecifieCompositionType()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation specifieCompositionType;

	/**
	 * The cached value of the '{@link #getEstAffecteAuTraversDotationTheoriqueInstanceObjet() <em>Est Affecte Au Travers Dotation Theorique Instance Objet</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstAffecteAuTraversDotationTheoriqueInstanceObjet()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estAffecteAuTraversDotationTheoriqueInstanceObjet;

	/**
	 * The cached value of the '{@link #getEstDotationTheoriqueAssociationProfilDotationTheorique() <em>Est Dotation Theorique Association Profil Dotation Theorique</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstDotationTheoriqueAssociationProfilDotationTheorique()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estDotationTheoriqueAssociationProfilDotationTheorique;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDotationTheoriqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeDotationTheorique();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOTATION_THEORIQUE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoDotationTheoriqueCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoDotationTheoriqueCategorie newCategorie) {
		TypeDictionaryDicoDotationTheoriqueCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOTATION_THEORIQUE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoDotationTheoriqueCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DOTATION_THEORIQUE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeDictionaryDicoDotationTheoriqueTypeOperation getTypeOperation() {
		return typeOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeOperation(TypeDictionaryDicoDotationTheoriqueTypeOperation newTypeOperation) {
		TypeDictionaryDicoDotationTheoriqueTypeOperation oldTypeOperation = typeOperation;
		typeOperation = newTypeOperation == null ? TYPE_OPERATION_EDEFAULT : newTypeOperation;
		boolean oldTypeOperationESet = typeOperationESet;
		typeOperationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOTATION_THEORIQUE__TYPE_OPERATION, oldTypeOperation, typeOperation, !oldTypeOperationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeOperation() {
		TypeDictionaryDicoDotationTheoriqueTypeOperation oldTypeOperation = typeOperation;
		boolean oldTypeOperationESet = typeOperationESet;
		typeOperation = TYPE_OPERATION_EDEFAULT;
		typeOperationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DOTATION_THEORIQUE__TYPE_OPERATION, oldTypeOperation, TYPE_OPERATION_EDEFAULT, oldTypeOperationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeOperation() {
		return typeOperationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoDotationTheoriqueEnvironnement getEnvironnement() {
		return environnement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironnement(TypeDictionaryDicoDotationTheoriqueEnvironnement newEnvironnement) {
		TypeDictionaryDicoDotationTheoriqueEnvironnement oldEnvironnement = environnement;
		environnement = newEnvironnement == null ? ENVIRONNEMENT_EDEFAULT : newEnvironnement;
		boolean oldEnvironnementESet = environnementESet;
		environnementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOTATION_THEORIQUE__ENVIRONNEMENT, oldEnvironnement, environnement, !oldEnvironnementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEnvironnement() {
		TypeDictionaryDicoDotationTheoriqueEnvironnement oldEnvironnement = environnement;
		boolean oldEnvironnementESet = environnementESet;
		environnement = ENVIRONNEMENT_EDEFAULT;
		environnementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DOTATION_THEORIQUE__ENVIRONNEMENT, oldEnvironnement, ENVIRONNEMENT_EDEFAULT, oldEnvironnementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEnvironnement() {
		return environnementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateValidite() {
		return dateValidite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateValidite(XMLGregorianCalendar newDateValidite) {
		XMLGregorianCalendar oldDateValidite = dateValidite;
		dateValidite = newDateValidite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOTATION_THEORIQUE__DATE_VALIDITE, oldDateValidite, dateValidite));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOTATION_THEORIQUE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOTATION_THEORIQUE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSpecifieAuTraversCompositionDotationTheoriqueEnType() {
		if (estSpecifieAuTraversCompositionDotationTheoriqueEnType == null) {
			estSpecifieAuTraversCompositionDotationTheoriqueEnType = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_DOTATION_THEORIQUE__EST_SPECIFIE_AU_TRAVERS_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE);
		}
		return estSpecifieAuTraversCompositionDotationTheoriqueEnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getSpecifieCompositionType() {
		return specifieCompositionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecifieCompositionType(TypeAssociation newSpecifieCompositionType, NotificationChain msgs) {
		TypeAssociation oldSpecifieCompositionType = specifieCompositionType;
		specifieCompositionType = newSpecifieCompositionType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOTATION_THEORIQUE__SPECIFIE_COMPOSITION_TYPE, oldSpecifieCompositionType, newSpecifieCompositionType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecifieCompositionType(TypeAssociation newSpecifieCompositionType) {
		if (newSpecifieCompositionType != specifieCompositionType) {
			NotificationChain msgs = null;
			if (specifieCompositionType != null)
				msgs = ((InternalEObject)specifieCompositionType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DOTATION_THEORIQUE__SPECIFIE_COMPOSITION_TYPE, null, msgs);
			if (newSpecifieCompositionType != null)
				msgs = ((InternalEObject)newSpecifieCompositionType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DOTATION_THEORIQUE__SPECIFIE_COMPOSITION_TYPE, null, msgs);
			msgs = basicSetSpecifieCompositionType(newSpecifieCompositionType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOTATION_THEORIQUE__SPECIFIE_COMPOSITION_TYPE, newSpecifieCompositionType, newSpecifieCompositionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstAffecteAuTraversDotationTheoriqueInstanceObjet() {
		if (estAffecteAuTraversDotationTheoriqueInstanceObjet == null) {
			estAffecteAuTraversDotationTheoriqueInstanceObjet = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_DOTATION_THEORIQUE__EST_AFFECTE_AU_TRAVERS_DOTATION_THEORIQUE_INSTANCE_OBJET);
		}
		return estAffecteAuTraversDotationTheoriqueInstanceObjet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstDotationTheoriqueAssociationProfilDotationTheorique() {
		if (estDotationTheoriqueAssociationProfilDotationTheorique == null) {
			estDotationTheoriqueAssociationProfilDotationTheorique = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_DOTATION_THEORIQUE__EST_DOTATION_THEORIQUE_ASSOCIATION_PROFIL_DOTATION_THEORIQUE);
		}
		return estDotationTheoriqueAssociationProfilDotationTheorique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_DOTATION_THEORIQUE__EST_SPECIFIE_AU_TRAVERS_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE:
				return ((InternalEList<?>)getEstSpecifieAuTraversCompositionDotationTheoriqueEnType()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_DOTATION_THEORIQUE__SPECIFIE_COMPOSITION_TYPE:
				return basicSetSpecifieCompositionType(null, msgs);
			case SchemaPackage.TYPE_DOTATION_THEORIQUE__EST_AFFECTE_AU_TRAVERS_DOTATION_THEORIQUE_INSTANCE_OBJET:
				return ((InternalEList<?>)getEstAffecteAuTraversDotationTheoriqueInstanceObjet()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_DOTATION_THEORIQUE__EST_DOTATION_THEORIQUE_ASSOCIATION_PROFIL_DOTATION_THEORIQUE:
				return ((InternalEList<?>)getEstDotationTheoriqueAssociationProfilDotationTheorique()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_DOTATION_THEORIQUE__NOM:
				return getNom();
			case SchemaPackage.TYPE_DOTATION_THEORIQUE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_DOTATION_THEORIQUE__TYPE_OPERATION:
				return getTypeOperation();
			case SchemaPackage.TYPE_DOTATION_THEORIQUE__ENVIRONNEMENT:
				return getEnvironnement();
			case SchemaPackage.TYPE_DOTATION_THEORIQUE__DATE_VALIDITE:
				return getDateValidite();
			case SchemaPackage.TYPE_DOTATION_THEORIQUE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_DOTATION_THEORIQUE__CE:
				return getCE();
			case SchemaPackage.TYPE_DOTATION_THEORIQUE__EST_SPECIFIE_AU_TRAVERS_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE:
				return getEstSpecifieAuTraversCompositionDotationTheoriqueEnType();
			case SchemaPackage.TYPE_DOTATION_THEORIQUE__SPECIFIE_COMPOSITION_TYPE:
				return getSpecifieCompositionType();
			case SchemaPackage.TYPE_DOTATION_THEORIQUE__EST_AFFECTE_AU_TRAVERS_DOTATION_THEORIQUE_INSTANCE_OBJET:
				return getEstAffecteAuTraversDotationTheoriqueInstanceObjet();
			case SchemaPackage.TYPE_DOTATION_THEORIQUE__EST_DOTATION_THEORIQUE_ASSOCIATION_PROFIL_DOTATION_THEORIQUE:
				return getEstDotationTheoriqueAssociationProfilDotationTheorique();
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
			case SchemaPackage.TYPE_DOTATION_THEORIQUE__NOM:
				setNom((String)newValue);
				return;
			case SchemaPackage.TYPE_DOTATION_THEORIQUE__CATEGORIE:
				setCategorie((TypeDictionaryDicoDotationTheoriqueCategorie)newValue);
				return;
			case SchemaPackage.TYPE_DOTATION_THEORIQUE__TYPE_OPERATION:
				setTypeOperation((TypeDictionaryDicoDotationTheoriqueTypeOperation)newValue);
				return;
			case SchemaPackage.TYPE_DOTATION_THEORIQUE__ENVIRONNEMENT:
				setEnvironnement((TypeDictionaryDicoDotationTheoriqueEnvironnement)newValue);
				return;
			case SchemaPackage.TYPE_DOTATION_THEORIQUE__DATE_VALIDITE:
				setDateValidite((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_DOTATION_THEORIQUE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_DOTATION_THEORIQUE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_DOTATION_THEORIQUE__EST_SPECIFIE_AU_TRAVERS_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE:
				getEstSpecifieAuTraversCompositionDotationTheoriqueEnType().clear();
				getEstSpecifieAuTraversCompositionDotationTheoriqueEnType().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_DOTATION_THEORIQUE__SPECIFIE_COMPOSITION_TYPE:
				setSpecifieCompositionType((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_DOTATION_THEORIQUE__EST_AFFECTE_AU_TRAVERS_DOTATION_THEORIQUE_INSTANCE_OBJET:
				getEstAffecteAuTraversDotationTheoriqueInstanceObjet().clear();
				getEstAffecteAuTraversDotationTheoriqueInstanceObjet().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_DOTATION_THEORIQUE__EST_DOTATION_THEORIQUE_ASSOCIATION_PROFIL_DOTATION_THEORIQUE:
				getEstDotationTheoriqueAssociationProfilDotationTheorique().clear();
				getEstDotationTheoriqueAssociationProfilDotationTheorique().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_DOTATION_THEORIQUE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DOTATION_THEORIQUE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_DOTATION_THEORIQUE__TYPE_OPERATION:
				unsetTypeOperation();
				return;
			case SchemaPackage.TYPE_DOTATION_THEORIQUE__ENVIRONNEMENT:
				unsetEnvironnement();
				return;
			case SchemaPackage.TYPE_DOTATION_THEORIQUE__DATE_VALIDITE:
				setDateValidite(DATE_VALIDITE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DOTATION_THEORIQUE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DOTATION_THEORIQUE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DOTATION_THEORIQUE__EST_SPECIFIE_AU_TRAVERS_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE:
				getEstSpecifieAuTraversCompositionDotationTheoriqueEnType().clear();
				return;
			case SchemaPackage.TYPE_DOTATION_THEORIQUE__SPECIFIE_COMPOSITION_TYPE:
				setSpecifieCompositionType((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_DOTATION_THEORIQUE__EST_AFFECTE_AU_TRAVERS_DOTATION_THEORIQUE_INSTANCE_OBJET:
				getEstAffecteAuTraversDotationTheoriqueInstanceObjet().clear();
				return;
			case SchemaPackage.TYPE_DOTATION_THEORIQUE__EST_DOTATION_THEORIQUE_ASSOCIATION_PROFIL_DOTATION_THEORIQUE:
				getEstDotationTheoriqueAssociationProfilDotationTheorique().clear();
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
			case SchemaPackage.TYPE_DOTATION_THEORIQUE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case SchemaPackage.TYPE_DOTATION_THEORIQUE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_DOTATION_THEORIQUE__TYPE_OPERATION:
				return isSetTypeOperation();
			case SchemaPackage.TYPE_DOTATION_THEORIQUE__ENVIRONNEMENT:
				return isSetEnvironnement();
			case SchemaPackage.TYPE_DOTATION_THEORIQUE__DATE_VALIDITE:
				return DATE_VALIDITE_EDEFAULT == null ? dateValidite != null : !DATE_VALIDITE_EDEFAULT.equals(dateValidite);
			case SchemaPackage.TYPE_DOTATION_THEORIQUE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_DOTATION_THEORIQUE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_DOTATION_THEORIQUE__EST_SPECIFIE_AU_TRAVERS_COMPOSITION_DOTATION_THEORIQUE_EN_TYPE:
				return estSpecifieAuTraversCompositionDotationTheoriqueEnType != null && !estSpecifieAuTraversCompositionDotationTheoriqueEnType.isEmpty();
			case SchemaPackage.TYPE_DOTATION_THEORIQUE__SPECIFIE_COMPOSITION_TYPE:
				return specifieCompositionType != null;
			case SchemaPackage.TYPE_DOTATION_THEORIQUE__EST_AFFECTE_AU_TRAVERS_DOTATION_THEORIQUE_INSTANCE_OBJET:
				return estAffecteAuTraversDotationTheoriqueInstanceObjet != null && !estAffecteAuTraversDotationTheoriqueInstanceObjet.isEmpty();
			case SchemaPackage.TYPE_DOTATION_THEORIQUE__EST_DOTATION_THEORIQUE_ASSOCIATION_PROFIL_DOTATION_THEORIQUE:
				return estDotationTheoriqueAssociationProfilDotationTheorique != null && !estDotationTheoriqueAssociationProfilDotationTheorique.isEmpty();
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
		result.append(", categorie: ");
		if (categorieESet) result.append(categorie); else result.append("<unset>");
		result.append(", typeOperation: ");
		if (typeOperationESet) result.append(typeOperation); else result.append("<unset>");
		result.append(", environnement: ");
		if (environnementESet) result.append(environnement); else result.append("<unset>");
		result.append(", dateValidite: ");
		result.append(dateValidite);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeDotationTheoriqueImpl
