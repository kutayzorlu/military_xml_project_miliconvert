/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeAngle;
import mpia.meta.TypeDataTypeVitesseLineaire;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssocInstanceObjetLocalisation;
import mpia.schema.TypeCaracteristiquesAssocInstanceObjetLocalisation;
import mpia.schema.TypeDictionaryDicoAssocInstanceObjetLocalisationCategorie;
import mpia.schema.TypeDictionaryDicoAssocInstanceObjetLocalisationSitePC;
import mpia.schema.TypeLocalisation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Assoc Instance Objet Localisation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssocInstanceObjetLocalisationImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssocInstanceObjetLocalisationImpl#getSitePC <em>Site PC</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssocInstanceObjetLocalisationImpl#getAngleMouvement <em>Angle Mouvement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssocInstanceObjetLocalisationImpl#getVitesse <em>Vitesse</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssocInstanceObjetLocalisationImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssocInstanceObjetLocalisationImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssocInstanceObjetLocalisationImpl#getNomSitePC <em>Nom Site PC</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssocInstanceObjetLocalisationImpl#getEstLocaliseEnLocalisation <em>Est Localise En Localisation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssocInstanceObjetLocalisationImpl#getAPourCaracteristiquesCaracteristiquesAssocInstanceObjetLocalisation <em>APour Caracteristiques Caracteristiques Assoc Instance Objet Localisation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssocInstanceObjetLocalisationImpl#getEstRapporteeParRapport <em>Est Rapportee Par Rapport</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssocInstanceObjetLocalisationImpl extends EObjectImpl implements TypeAssocInstanceObjetLocalisation {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAssocInstanceObjetLocalisationCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssocInstanceObjetLocalisationCategorie.CEOFMA;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssocInstanceObjetLocalisationCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getSitePC() <em>Site PC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSitePC()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAssocInstanceObjetLocalisationSitePC SITE_PC_EDEFAULT = TypeDictionaryDicoAssocInstanceObjetLocalisationSitePC.REF;

	/**
	 * The cached value of the '{@link #getSitePC() <em>Site PC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSitePC()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssocInstanceObjetLocalisationSitePC sitePC = SITE_PC_EDEFAULT;

	/**
	 * This is true if the Site PC attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sitePCESet;

	/**
	 * The cached value of the '{@link #getAngleMouvement() <em>Angle Mouvement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleMouvement()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAngle angleMouvement;

	/**
	 * The cached value of the '{@link #getVitesse() <em>Vitesse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesse()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeVitesseLineaire vitesse;

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
	 * The default value of the '{@link #getNomSitePC() <em>Nom Site PC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomSitePC()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_SITE_PC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomSitePC() <em>Nom Site PC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomSitePC()
	 * @generated
	 * @ordered
	 */
	protected String nomSitePC = NOM_SITE_PC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEstLocaliseEnLocalisation() <em>Est Localise En Localisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstLocaliseEnLocalisation()
	 * @generated
	 * @ordered
	 */
	protected TypeLocalisation estLocaliseEnLocalisation;

	/**
	 * The cached value of the '{@link #getAPourCaracteristiquesCaracteristiquesAssocInstanceObjetLocalisation() <em>APour Caracteristiques Caracteristiques Assoc Instance Objet Localisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCaracteristiquesCaracteristiquesAssocInstanceObjetLocalisation()
	 * @generated
	 * @ordered
	 */
	protected TypeCaracteristiquesAssocInstanceObjetLocalisation aPourCaracteristiquesCaracteristiquesAssocInstanceObjetLocalisation;

	/**
	 * The cached value of the '{@link #getEstRapporteeParRapport() <em>Est Rapportee Par Rapport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstRapporteeParRapport()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation estRapporteeParRapport;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssocInstanceObjetLocalisationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssocInstanceObjetLocalisation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssocInstanceObjetLocalisationCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssocInstanceObjetLocalisationCategorie newCategorie) {
		TypeDictionaryDicoAssocInstanceObjetLocalisationCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssocInstanceObjetLocalisationCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeDictionaryDicoAssocInstanceObjetLocalisationSitePC getSitePC() {
		return sitePC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSitePC(TypeDictionaryDicoAssocInstanceObjetLocalisationSitePC newSitePC) {
		TypeDictionaryDicoAssocInstanceObjetLocalisationSitePC oldSitePC = sitePC;
		sitePC = newSitePC == null ? SITE_PC_EDEFAULT : newSitePC;
		boolean oldSitePCESet = sitePCESet;
		sitePCESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__SITE_PC, oldSitePC, sitePC, !oldSitePCESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSitePC() {
		TypeDictionaryDicoAssocInstanceObjetLocalisationSitePC oldSitePC = sitePC;
		boolean oldSitePCESet = sitePCESet;
		sitePC = SITE_PC_EDEFAULT;
		sitePCESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__SITE_PC, oldSitePC, SITE_PC_EDEFAULT, oldSitePCESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSitePC() {
		return sitePCESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAngle getAngleMouvement() {
		return angleMouvement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngleMouvement(TypeDataTypeAngle newAngleMouvement, NotificationChain msgs) {
		TypeDataTypeAngle oldAngleMouvement = angleMouvement;
		angleMouvement = newAngleMouvement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__ANGLE_MOUVEMENT, oldAngleMouvement, newAngleMouvement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngleMouvement(TypeDataTypeAngle newAngleMouvement) {
		if (newAngleMouvement != angleMouvement) {
			NotificationChain msgs = null;
			if (angleMouvement != null)
				msgs = ((InternalEObject)angleMouvement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__ANGLE_MOUVEMENT, null, msgs);
			if (newAngleMouvement != null)
				msgs = ((InternalEObject)newAngleMouvement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__ANGLE_MOUVEMENT, null, msgs);
			msgs = basicSetAngleMouvement(newAngleMouvement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__ANGLE_MOUVEMENT, newAngleMouvement, newAngleMouvement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeVitesseLineaire getVitesse() {
		return vitesse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVitesse(TypeDataTypeVitesseLineaire newVitesse, NotificationChain msgs) {
		TypeDataTypeVitesseLineaire oldVitesse = vitesse;
		vitesse = newVitesse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__VITESSE, oldVitesse, newVitesse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVitesse(TypeDataTypeVitesseLineaire newVitesse) {
		if (newVitesse != vitesse) {
			NotificationChain msgs = null;
			if (vitesse != null)
				msgs = ((InternalEObject)vitesse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__VITESSE, null, msgs);
			if (newVitesse != null)
				msgs = ((InternalEObject)newVitesse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__VITESSE, null, msgs);
			msgs = basicSetVitesse(newVitesse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__VITESSE, newVitesse, newVitesse));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomSitePC() {
		return nomSitePC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomSitePC(String newNomSitePC) {
		String oldNomSitePC = nomSitePC;
		nomSitePC = newNomSitePC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__NOM_SITE_PC, oldNomSitePC, nomSitePC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeLocalisation getEstLocaliseEnLocalisation() {
		return estLocaliseEnLocalisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstLocaliseEnLocalisation(TypeLocalisation newEstLocaliseEnLocalisation, NotificationChain msgs) {
		TypeLocalisation oldEstLocaliseEnLocalisation = estLocaliseEnLocalisation;
		estLocaliseEnLocalisation = newEstLocaliseEnLocalisation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__EST_LOCALISE_EN_LOCALISATION, oldEstLocaliseEnLocalisation, newEstLocaliseEnLocalisation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstLocaliseEnLocalisation(TypeLocalisation newEstLocaliseEnLocalisation) {
		if (newEstLocaliseEnLocalisation != estLocaliseEnLocalisation) {
			NotificationChain msgs = null;
			if (estLocaliseEnLocalisation != null)
				msgs = ((InternalEObject)estLocaliseEnLocalisation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__EST_LOCALISE_EN_LOCALISATION, null, msgs);
			if (newEstLocaliseEnLocalisation != null)
				msgs = ((InternalEObject)newEstLocaliseEnLocalisation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__EST_LOCALISE_EN_LOCALISATION, null, msgs);
			msgs = basicSetEstLocaliseEnLocalisation(newEstLocaliseEnLocalisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__EST_LOCALISE_EN_LOCALISATION, newEstLocaliseEnLocalisation, newEstLocaliseEnLocalisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeCaracteristiquesAssocInstanceObjetLocalisation getAPourCaracteristiquesCaracteristiquesAssocInstanceObjetLocalisation() {
		return aPourCaracteristiquesCaracteristiquesAssocInstanceObjetLocalisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourCaracteristiquesCaracteristiquesAssocInstanceObjetLocalisation(TypeCaracteristiquesAssocInstanceObjetLocalisation newAPourCaracteristiquesCaracteristiquesAssocInstanceObjetLocalisation, NotificationChain msgs) {
		TypeCaracteristiquesAssocInstanceObjetLocalisation oldAPourCaracteristiquesCaracteristiquesAssocInstanceObjetLocalisation = aPourCaracteristiquesCaracteristiquesAssocInstanceObjetLocalisation;
		aPourCaracteristiquesCaracteristiquesAssocInstanceObjetLocalisation = newAPourCaracteristiquesCaracteristiquesAssocInstanceObjetLocalisation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__APOUR_CARACTERISTIQUES_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION, oldAPourCaracteristiquesCaracteristiquesAssocInstanceObjetLocalisation, newAPourCaracteristiquesCaracteristiquesAssocInstanceObjetLocalisation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourCaracteristiquesCaracteristiquesAssocInstanceObjetLocalisation(TypeCaracteristiquesAssocInstanceObjetLocalisation newAPourCaracteristiquesCaracteristiquesAssocInstanceObjetLocalisation) {
		if (newAPourCaracteristiquesCaracteristiquesAssocInstanceObjetLocalisation != aPourCaracteristiquesCaracteristiquesAssocInstanceObjetLocalisation) {
			NotificationChain msgs = null;
			if (aPourCaracteristiquesCaracteristiquesAssocInstanceObjetLocalisation != null)
				msgs = ((InternalEObject)aPourCaracteristiquesCaracteristiquesAssocInstanceObjetLocalisation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__APOUR_CARACTERISTIQUES_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION, null, msgs);
			if (newAPourCaracteristiquesCaracteristiquesAssocInstanceObjetLocalisation != null)
				msgs = ((InternalEObject)newAPourCaracteristiquesCaracteristiquesAssocInstanceObjetLocalisation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__APOUR_CARACTERISTIQUES_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION, null, msgs);
			msgs = basicSetAPourCaracteristiquesCaracteristiquesAssocInstanceObjetLocalisation(newAPourCaracteristiquesCaracteristiquesAssocInstanceObjetLocalisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__APOUR_CARACTERISTIQUES_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION, newAPourCaracteristiquesCaracteristiquesAssocInstanceObjetLocalisation, newAPourCaracteristiquesCaracteristiquesAssocInstanceObjetLocalisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getEstRapporteeParRapport() {
		return estRapporteeParRapport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstRapporteeParRapport(TypeAssociation newEstRapporteeParRapport, NotificationChain msgs) {
		TypeAssociation oldEstRapporteeParRapport = estRapporteeParRapport;
		estRapporteeParRapport = newEstRapporteeParRapport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__EST_RAPPORTEE_PAR_RAPPORT, oldEstRapporteeParRapport, newEstRapporteeParRapport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstRapporteeParRapport(TypeAssociation newEstRapporteeParRapport) {
		if (newEstRapporteeParRapport != estRapporteeParRapport) {
			NotificationChain msgs = null;
			if (estRapporteeParRapport != null)
				msgs = ((InternalEObject)estRapporteeParRapport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__EST_RAPPORTEE_PAR_RAPPORT, null, msgs);
			if (newEstRapporteeParRapport != null)
				msgs = ((InternalEObject)newEstRapporteeParRapport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__EST_RAPPORTEE_PAR_RAPPORT, null, msgs);
			msgs = basicSetEstRapporteeParRapport(newEstRapporteeParRapport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__EST_RAPPORTEE_PAR_RAPPORT, newEstRapporteeParRapport, newEstRapporteeParRapport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__ANGLE_MOUVEMENT:
				return basicSetAngleMouvement(null, msgs);
			case SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__VITESSE:
				return basicSetVitesse(null, msgs);
			case SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__EST_LOCALISE_EN_LOCALISATION:
				return basicSetEstLocaliseEnLocalisation(null, msgs);
			case SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__APOUR_CARACTERISTIQUES_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION:
				return basicSetAPourCaracteristiquesCaracteristiquesAssocInstanceObjetLocalisation(null, msgs);
			case SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__EST_RAPPORTEE_PAR_RAPPORT:
				return basicSetEstRapporteeParRapport(null, msgs);
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
			case SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__SITE_PC:
				return getSitePC();
			case SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__ANGLE_MOUVEMENT:
				return getAngleMouvement();
			case SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__VITESSE:
				return getVitesse();
			case SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__CE:
				return getCE();
			case SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__NOM_SITE_PC:
				return getNomSitePC();
			case SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__EST_LOCALISE_EN_LOCALISATION:
				return getEstLocaliseEnLocalisation();
			case SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__APOUR_CARACTERISTIQUES_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION:
				return getAPourCaracteristiquesCaracteristiquesAssocInstanceObjetLocalisation();
			case SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__EST_RAPPORTEE_PAR_RAPPORT:
				return getEstRapporteeParRapport();
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
			case SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssocInstanceObjetLocalisationCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__SITE_PC:
				setSitePC((TypeDictionaryDicoAssocInstanceObjetLocalisationSitePC)newValue);
				return;
			case SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__ANGLE_MOUVEMENT:
				setAngleMouvement((TypeDataTypeAngle)newValue);
				return;
			case SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__VITESSE:
				setVitesse((TypeDataTypeVitesseLineaire)newValue);
				return;
			case SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__NOM_SITE_PC:
				setNomSitePC((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__EST_LOCALISE_EN_LOCALISATION:
				setEstLocaliseEnLocalisation((TypeLocalisation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__APOUR_CARACTERISTIQUES_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION:
				setAPourCaracteristiquesCaracteristiquesAssocInstanceObjetLocalisation((TypeCaracteristiquesAssocInstanceObjetLocalisation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__EST_RAPPORTEE_PAR_RAPPORT:
				setEstRapporteeParRapport((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__SITE_PC:
				unsetSitePC();
				return;
			case SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__ANGLE_MOUVEMENT:
				setAngleMouvement((TypeDataTypeAngle)null);
				return;
			case SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__VITESSE:
				setVitesse((TypeDataTypeVitesseLineaire)null);
				return;
			case SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__NOM_SITE_PC:
				setNomSitePC(NOM_SITE_PC_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__EST_LOCALISE_EN_LOCALISATION:
				setEstLocaliseEnLocalisation((TypeLocalisation)null);
				return;
			case SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__APOUR_CARACTERISTIQUES_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION:
				setAPourCaracteristiquesCaracteristiquesAssocInstanceObjetLocalisation((TypeCaracteristiquesAssocInstanceObjetLocalisation)null);
				return;
			case SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__EST_RAPPORTEE_PAR_RAPPORT:
				setEstRapporteeParRapport((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__SITE_PC:
				return isSetSitePC();
			case SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__ANGLE_MOUVEMENT:
				return angleMouvement != null;
			case SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__VITESSE:
				return vitesse != null;
			case SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__NOM_SITE_PC:
				return NOM_SITE_PC_EDEFAULT == null ? nomSitePC != null : !NOM_SITE_PC_EDEFAULT.equals(nomSitePC);
			case SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__EST_LOCALISE_EN_LOCALISATION:
				return estLocaliseEnLocalisation != null;
			case SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__APOUR_CARACTERISTIQUES_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION:
				return aPourCaracteristiquesCaracteristiquesAssocInstanceObjetLocalisation != null;
			case SchemaPackage.TYPE_ASSOC_INSTANCE_OBJET_LOCALISATION__EST_RAPPORTEE_PAR_RAPPORT:
				return estRapporteeParRapport != null;
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
		result.append(", sitePC: ");
		if (sitePCESet) result.append(sitePC); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(", nomSitePC: ");
		result.append(nomSitePC);
		result.append(')');
		return result.toString();
	}

} //TypeAssocInstanceObjetLocalisationImpl
