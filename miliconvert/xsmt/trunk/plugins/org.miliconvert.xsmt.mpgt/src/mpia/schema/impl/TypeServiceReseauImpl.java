/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoServiceReseauCategorie;
import mpia.schema.TypeDictionaryDicoServiceReseauSousCategorie;
import mpia.schema.TypeEtatServiceReseau;
import mpia.schema.TypeServiceReseau;

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
 * An implementation of the model object '<em><b>Type Service Reseau</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeServiceReseauImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeServiceReseauImpl#getSousCategorie <em>Sous Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeServiceReseauImpl#getAutreSousCategorie <em>Autre Sous Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeServiceReseauImpl#isCrypte <em>Crypte</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeServiceReseauImpl#getCodeCryptage <em>Code Cryptage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeServiceReseauImpl#getPlanCryptage <em>Plan Cryptage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeServiceReseauImpl#getCodeIFF <em>Code IFF</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeServiceReseauImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeServiceReseauImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeServiceReseauImpl#getAPourDegreClassificationDegreClassification <em>APour Degre Classification Degre Classification</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeServiceReseauImpl#getEstAssocieAuReseauReseauTelecommunication <em>Est Associe Au Reseau Reseau Telecommunication</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeServiceReseauImpl#getEstAccedeParAdresseElectronique <em>Est Accede Par Adresse Electronique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeServiceReseauImpl#getACommeEtatEtatServiceReseau <em>AComme Etat Etat Service Reseau</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeServiceReseauImpl extends EObjectImpl implements TypeServiceReseau {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoServiceReseauCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoServiceReseauCategorie.FAX;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoServiceReseauCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getSousCategorie() <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSousCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoServiceReseauSousCategorie SOUS_CATEGORIE_EDEFAULT = TypeDictionaryDicoServiceReseauSousCategorie.DRCTRY;

	/**
	 * The cached value of the '{@link #getSousCategorie() <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSousCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoServiceReseauSousCategorie sousCategorie = SOUS_CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Sous Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sousCategorieESet;

	/**
	 * The default value of the '{@link #getAutreSousCategorie() <em>Autre Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreSousCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTRE_SOUS_CATEGORIE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutreSousCategorie() <em>Autre Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreSousCategorie()
	 * @generated
	 * @ordered
	 */
	protected String autreSousCategorie = AUTRE_SOUS_CATEGORIE_EDEFAULT;

	/**
	 * The default value of the '{@link #isCrypte() <em>Crypte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCrypte()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CRYPTE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCrypte() <em>Crypte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCrypte()
	 * @generated
	 * @ordered
	 */
	protected boolean crypte = CRYPTE_EDEFAULT;

	/**
	 * This is true if the Crypte attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean crypteESet;

	/**
	 * The default value of the '{@link #getCodeCryptage() <em>Code Cryptage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeCryptage()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_CRYPTAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeCryptage() <em>Code Cryptage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeCryptage()
	 * @generated
	 * @ordered
	 */
	protected String codeCryptage = CODE_CRYPTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlanCryptage() <em>Plan Cryptage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanCryptage()
	 * @generated
	 * @ordered
	 */
	protected static final String PLAN_CRYPTAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlanCryptage() <em>Plan Cryptage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanCryptage()
	 * @generated
	 * @ordered
	 */
	protected String planCryptage = PLAN_CRYPTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeIFF() <em>Code IFF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeIFF()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_IFF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeIFF() <em>Code IFF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeIFF()
	 * @generated
	 * @ordered
	 */
	protected String codeIFF = CODE_IFF_EDEFAULT;

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
	 * The cached value of the '{@link #getEstAssocieAuReseauReseauTelecommunication() <em>Est Associe Au Reseau Reseau Telecommunication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstAssocieAuReseauReseauTelecommunication()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation estAssocieAuReseauReseauTelecommunication;

	/**
	 * The cached value of the '{@link #getEstAccedeParAdresseElectronique() <em>Est Accede Par Adresse Electronique</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstAccedeParAdresseElectronique()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estAccedeParAdresseElectronique;

	/**
	 * The cached value of the '{@link #getACommeEtatEtatServiceReseau() <em>AComme Etat Etat Service Reseau</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeEtatEtatServiceReseau()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeEtatServiceReseau> aCommeEtatEtatServiceReseau;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeServiceReseauImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeServiceReseau();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoServiceReseauCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoServiceReseauCategorie newCategorie) {
		TypeDictionaryDicoServiceReseauCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SERVICE_RESEAU__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoServiceReseauCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SERVICE_RESEAU__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeDictionaryDicoServiceReseauSousCategorie getSousCategorie() {
		return sousCategorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSousCategorie(TypeDictionaryDicoServiceReseauSousCategorie newSousCategorie) {
		TypeDictionaryDicoServiceReseauSousCategorie oldSousCategorie = sousCategorie;
		sousCategorie = newSousCategorie == null ? SOUS_CATEGORIE_EDEFAULT : newSousCategorie;
		boolean oldSousCategorieESet = sousCategorieESet;
		sousCategorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SERVICE_RESEAU__SOUS_CATEGORIE, oldSousCategorie, sousCategorie, !oldSousCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSousCategorie() {
		TypeDictionaryDicoServiceReseauSousCategorie oldSousCategorie = sousCategorie;
		boolean oldSousCategorieESet = sousCategorieESet;
		sousCategorie = SOUS_CATEGORIE_EDEFAULT;
		sousCategorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SERVICE_RESEAU__SOUS_CATEGORIE, oldSousCategorie, SOUS_CATEGORIE_EDEFAULT, oldSousCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSousCategorie() {
		return sousCategorieESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutreSousCategorie() {
		return autreSousCategorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutreSousCategorie(String newAutreSousCategorie) {
		String oldAutreSousCategorie = autreSousCategorie;
		autreSousCategorie = newAutreSousCategorie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SERVICE_RESEAU__AUTRE_SOUS_CATEGORIE, oldAutreSousCategorie, autreSousCategorie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCrypte() {
		return crypte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrypte(boolean newCrypte) {
		boolean oldCrypte = crypte;
		crypte = newCrypte;
		boolean oldCrypteESet = crypteESet;
		crypteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SERVICE_RESEAU__CRYPTE, oldCrypte, crypte, !oldCrypteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCrypte() {
		boolean oldCrypte = crypte;
		boolean oldCrypteESet = crypteESet;
		crypte = CRYPTE_EDEFAULT;
		crypteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SERVICE_RESEAU__CRYPTE, oldCrypte, CRYPTE_EDEFAULT, oldCrypteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCrypte() {
		return crypteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeCryptage() {
		return codeCryptage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeCryptage(String newCodeCryptage) {
		String oldCodeCryptage = codeCryptage;
		codeCryptage = newCodeCryptage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SERVICE_RESEAU__CODE_CRYPTAGE, oldCodeCryptage, codeCryptage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlanCryptage() {
		return planCryptage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlanCryptage(String newPlanCryptage) {
		String oldPlanCryptage = planCryptage;
		planCryptage = newPlanCryptage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SERVICE_RESEAU__PLAN_CRYPTAGE, oldPlanCryptage, planCryptage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeIFF() {
		return codeIFF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeIFF(String newCodeIFF) {
		String oldCodeIFF = codeIFF;
		codeIFF = newCodeIFF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SERVICE_RESEAU__CODE_IFF, oldCodeIFF, codeIFF));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SERVICE_RESEAU__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SERVICE_RESEAU__CE, oldCE, cE));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SERVICE_RESEAU__APOUR_DEGRE_CLASSIFICATION_DEGRE_CLASSIFICATION, oldAPourDegreClassificationDegreClassification, newAPourDegreClassificationDegreClassification);
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
				msgs = ((InternalEObject)aPourDegreClassificationDegreClassification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SERVICE_RESEAU__APOUR_DEGRE_CLASSIFICATION_DEGRE_CLASSIFICATION, null, msgs);
			if (newAPourDegreClassificationDegreClassification != null)
				msgs = ((InternalEObject)newAPourDegreClassificationDegreClassification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SERVICE_RESEAU__APOUR_DEGRE_CLASSIFICATION_DEGRE_CLASSIFICATION, null, msgs);
			msgs = basicSetAPourDegreClassificationDegreClassification(newAPourDegreClassificationDegreClassification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SERVICE_RESEAU__APOUR_DEGRE_CLASSIFICATION_DEGRE_CLASSIFICATION, newAPourDegreClassificationDegreClassification, newAPourDegreClassificationDegreClassification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getEstAssocieAuReseauReseauTelecommunication() {
		return estAssocieAuReseauReseauTelecommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstAssocieAuReseauReseauTelecommunication(TypeAssociation newEstAssocieAuReseauReseauTelecommunication, NotificationChain msgs) {
		TypeAssociation oldEstAssocieAuReseauReseauTelecommunication = estAssocieAuReseauReseauTelecommunication;
		estAssocieAuReseauReseauTelecommunication = newEstAssocieAuReseauReseauTelecommunication;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SERVICE_RESEAU__EST_ASSOCIE_AU_RESEAU_RESEAU_TELECOMMUNICATION, oldEstAssocieAuReseauReseauTelecommunication, newEstAssocieAuReseauReseauTelecommunication);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstAssocieAuReseauReseauTelecommunication(TypeAssociation newEstAssocieAuReseauReseauTelecommunication) {
		if (newEstAssocieAuReseauReseauTelecommunication != estAssocieAuReseauReseauTelecommunication) {
			NotificationChain msgs = null;
			if (estAssocieAuReseauReseauTelecommunication != null)
				msgs = ((InternalEObject)estAssocieAuReseauReseauTelecommunication).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SERVICE_RESEAU__EST_ASSOCIE_AU_RESEAU_RESEAU_TELECOMMUNICATION, null, msgs);
			if (newEstAssocieAuReseauReseauTelecommunication != null)
				msgs = ((InternalEObject)newEstAssocieAuReseauReseauTelecommunication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SERVICE_RESEAU__EST_ASSOCIE_AU_RESEAU_RESEAU_TELECOMMUNICATION, null, msgs);
			msgs = basicSetEstAssocieAuReseauReseauTelecommunication(newEstAssocieAuReseauReseauTelecommunication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SERVICE_RESEAU__EST_ASSOCIE_AU_RESEAU_RESEAU_TELECOMMUNICATION, newEstAssocieAuReseauReseauTelecommunication, newEstAssocieAuReseauReseauTelecommunication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstAccedeParAdresseElectronique() {
		if (estAccedeParAdresseElectronique == null) {
			estAccedeParAdresseElectronique = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_SERVICE_RESEAU__EST_ACCEDE_PAR_ADRESSE_ELECTRONIQUE);
		}
		return estAccedeParAdresseElectronique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEtatServiceReseau> getACommeEtatEtatServiceReseau() {
		if (aCommeEtatEtatServiceReseau == null) {
			aCommeEtatEtatServiceReseau = new EObjectContainmentEList<TypeEtatServiceReseau>(TypeEtatServiceReseau.class, this, SchemaPackage.TYPE_SERVICE_RESEAU__ACOMME_ETAT_ETAT_SERVICE_RESEAU);
		}
		return aCommeEtatEtatServiceReseau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_SERVICE_RESEAU__APOUR_DEGRE_CLASSIFICATION_DEGRE_CLASSIFICATION:
				return basicSetAPourDegreClassificationDegreClassification(null, msgs);
			case SchemaPackage.TYPE_SERVICE_RESEAU__EST_ASSOCIE_AU_RESEAU_RESEAU_TELECOMMUNICATION:
				return basicSetEstAssocieAuReseauReseauTelecommunication(null, msgs);
			case SchemaPackage.TYPE_SERVICE_RESEAU__EST_ACCEDE_PAR_ADRESSE_ELECTRONIQUE:
				return ((InternalEList<?>)getEstAccedeParAdresseElectronique()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_SERVICE_RESEAU__ACOMME_ETAT_ETAT_SERVICE_RESEAU:
				return ((InternalEList<?>)getACommeEtatEtatServiceReseau()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_SERVICE_RESEAU__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_SERVICE_RESEAU__SOUS_CATEGORIE:
				return getSousCategorie();
			case SchemaPackage.TYPE_SERVICE_RESEAU__AUTRE_SOUS_CATEGORIE:
				return getAutreSousCategorie();
			case SchemaPackage.TYPE_SERVICE_RESEAU__CRYPTE:
				return isCrypte() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_SERVICE_RESEAU__CODE_CRYPTAGE:
				return getCodeCryptage();
			case SchemaPackage.TYPE_SERVICE_RESEAU__PLAN_CRYPTAGE:
				return getPlanCryptage();
			case SchemaPackage.TYPE_SERVICE_RESEAU__CODE_IFF:
				return getCodeIFF();
			case SchemaPackage.TYPE_SERVICE_RESEAU__CTE:
				return getCTE();
			case SchemaPackage.TYPE_SERVICE_RESEAU__CE:
				return getCE();
			case SchemaPackage.TYPE_SERVICE_RESEAU__APOUR_DEGRE_CLASSIFICATION_DEGRE_CLASSIFICATION:
				return getAPourDegreClassificationDegreClassification();
			case SchemaPackage.TYPE_SERVICE_RESEAU__EST_ASSOCIE_AU_RESEAU_RESEAU_TELECOMMUNICATION:
				return getEstAssocieAuReseauReseauTelecommunication();
			case SchemaPackage.TYPE_SERVICE_RESEAU__EST_ACCEDE_PAR_ADRESSE_ELECTRONIQUE:
				return getEstAccedeParAdresseElectronique();
			case SchemaPackage.TYPE_SERVICE_RESEAU__ACOMME_ETAT_ETAT_SERVICE_RESEAU:
				return getACommeEtatEtatServiceReseau();
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
			case SchemaPackage.TYPE_SERVICE_RESEAU__CATEGORIE:
				setCategorie((TypeDictionaryDicoServiceReseauCategorie)newValue);
				return;
			case SchemaPackage.TYPE_SERVICE_RESEAU__SOUS_CATEGORIE:
				setSousCategorie((TypeDictionaryDicoServiceReseauSousCategorie)newValue);
				return;
			case SchemaPackage.TYPE_SERVICE_RESEAU__AUTRE_SOUS_CATEGORIE:
				setAutreSousCategorie((String)newValue);
				return;
			case SchemaPackage.TYPE_SERVICE_RESEAU__CRYPTE:
				setCrypte(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_SERVICE_RESEAU__CODE_CRYPTAGE:
				setCodeCryptage((String)newValue);
				return;
			case SchemaPackage.TYPE_SERVICE_RESEAU__PLAN_CRYPTAGE:
				setPlanCryptage((String)newValue);
				return;
			case SchemaPackage.TYPE_SERVICE_RESEAU__CODE_IFF:
				setCodeIFF((String)newValue);
				return;
			case SchemaPackage.TYPE_SERVICE_RESEAU__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_SERVICE_RESEAU__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_SERVICE_RESEAU__APOUR_DEGRE_CLASSIFICATION_DEGRE_CLASSIFICATION:
				setAPourDegreClassificationDegreClassification((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_SERVICE_RESEAU__EST_ASSOCIE_AU_RESEAU_RESEAU_TELECOMMUNICATION:
				setEstAssocieAuReseauReseauTelecommunication((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_SERVICE_RESEAU__EST_ACCEDE_PAR_ADRESSE_ELECTRONIQUE:
				getEstAccedeParAdresseElectronique().clear();
				getEstAccedeParAdresseElectronique().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_SERVICE_RESEAU__ACOMME_ETAT_ETAT_SERVICE_RESEAU:
				getACommeEtatEtatServiceReseau().clear();
				getACommeEtatEtatServiceReseau().addAll((Collection<? extends TypeEtatServiceReseau>)newValue);
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
			case SchemaPackage.TYPE_SERVICE_RESEAU__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_SERVICE_RESEAU__SOUS_CATEGORIE:
				unsetSousCategorie();
				return;
			case SchemaPackage.TYPE_SERVICE_RESEAU__AUTRE_SOUS_CATEGORIE:
				setAutreSousCategorie(AUTRE_SOUS_CATEGORIE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SERVICE_RESEAU__CRYPTE:
				unsetCrypte();
				return;
			case SchemaPackage.TYPE_SERVICE_RESEAU__CODE_CRYPTAGE:
				setCodeCryptage(CODE_CRYPTAGE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SERVICE_RESEAU__PLAN_CRYPTAGE:
				setPlanCryptage(PLAN_CRYPTAGE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SERVICE_RESEAU__CODE_IFF:
				setCodeIFF(CODE_IFF_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SERVICE_RESEAU__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SERVICE_RESEAU__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SERVICE_RESEAU__APOUR_DEGRE_CLASSIFICATION_DEGRE_CLASSIFICATION:
				setAPourDegreClassificationDegreClassification((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_SERVICE_RESEAU__EST_ASSOCIE_AU_RESEAU_RESEAU_TELECOMMUNICATION:
				setEstAssocieAuReseauReseauTelecommunication((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_SERVICE_RESEAU__EST_ACCEDE_PAR_ADRESSE_ELECTRONIQUE:
				getEstAccedeParAdresseElectronique().clear();
				return;
			case SchemaPackage.TYPE_SERVICE_RESEAU__ACOMME_ETAT_ETAT_SERVICE_RESEAU:
				getACommeEtatEtatServiceReseau().clear();
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
			case SchemaPackage.TYPE_SERVICE_RESEAU__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_SERVICE_RESEAU__SOUS_CATEGORIE:
				return isSetSousCategorie();
			case SchemaPackage.TYPE_SERVICE_RESEAU__AUTRE_SOUS_CATEGORIE:
				return AUTRE_SOUS_CATEGORIE_EDEFAULT == null ? autreSousCategorie != null : !AUTRE_SOUS_CATEGORIE_EDEFAULT.equals(autreSousCategorie);
			case SchemaPackage.TYPE_SERVICE_RESEAU__CRYPTE:
				return isSetCrypte();
			case SchemaPackage.TYPE_SERVICE_RESEAU__CODE_CRYPTAGE:
				return CODE_CRYPTAGE_EDEFAULT == null ? codeCryptage != null : !CODE_CRYPTAGE_EDEFAULT.equals(codeCryptage);
			case SchemaPackage.TYPE_SERVICE_RESEAU__PLAN_CRYPTAGE:
				return PLAN_CRYPTAGE_EDEFAULT == null ? planCryptage != null : !PLAN_CRYPTAGE_EDEFAULT.equals(planCryptage);
			case SchemaPackage.TYPE_SERVICE_RESEAU__CODE_IFF:
				return CODE_IFF_EDEFAULT == null ? codeIFF != null : !CODE_IFF_EDEFAULT.equals(codeIFF);
			case SchemaPackage.TYPE_SERVICE_RESEAU__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_SERVICE_RESEAU__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_SERVICE_RESEAU__APOUR_DEGRE_CLASSIFICATION_DEGRE_CLASSIFICATION:
				return aPourDegreClassificationDegreClassification != null;
			case SchemaPackage.TYPE_SERVICE_RESEAU__EST_ASSOCIE_AU_RESEAU_RESEAU_TELECOMMUNICATION:
				return estAssocieAuReseauReseauTelecommunication != null;
			case SchemaPackage.TYPE_SERVICE_RESEAU__EST_ACCEDE_PAR_ADRESSE_ELECTRONIQUE:
				return estAccedeParAdresseElectronique != null && !estAccedeParAdresseElectronique.isEmpty();
			case SchemaPackage.TYPE_SERVICE_RESEAU__ACOMME_ETAT_ETAT_SERVICE_RESEAU:
				return aCommeEtatEtatServiceReseau != null && !aCommeEtatEtatServiceReseau.isEmpty();
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
		result.append(", sousCategorie: ");
		if (sousCategorieESet) result.append(sousCategorie); else result.append("<unset>");
		result.append(", autreSousCategorie: ");
		result.append(autreSousCategorie);
		result.append(", crypte: ");
		if (crypteESet) result.append(crypte); else result.append("<unset>");
		result.append(", codeCryptage: ");
		result.append(codeCryptage);
		result.append(", planCryptage: ");
		result.append(planCryptage);
		result.append(", codeIFF: ");
		result.append(codeIFF);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeServiceReseauImpl
