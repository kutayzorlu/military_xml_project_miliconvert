/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoDomaineLogistique;
import mpia.schema.TypeDictionaryDicoRattachementOuAbonnementSpecialiteMaintenance;
import mpia.schema.TypeRattachementOuAbonnement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Rattachement Ou Abonnement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeRattachementOuAbonnementImpl#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRattachementOuAbonnementImpl#getDateFin <em>Date Fin</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRattachementOuAbonnementImpl#getDomaineLogistique <em>Domaine Logistique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRattachementOuAbonnementImpl#getSpecialiteMaintenance2 <em>Specialite Maintenance2</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRattachementOuAbonnementImpl#getSpecialiteMaintenance1 <em>Specialite Maintenance1</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRattachementOuAbonnementImpl#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRattachementOuAbonnementImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRattachementOuAbonnementImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRattachementOuAbonnementImpl#getAPourUniteSoutenueUnite <em>APour Unite Soutenue Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRattachementOuAbonnementImpl#getAPourZoneRattachementZoneLogistique <em>APour Zone Rattachement Zone Logistique</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeRattachementOuAbonnementImpl extends EObjectImpl implements TypeRattachementOuAbonnement {
	/**
	 * The default value of the '{@link #getDateDebut() <em>Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebut()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_DEBUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateDebut() <em>Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebut()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateDebut = DATE_DEBUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateFin() <em>Date Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFin()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_FIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateFin() <em>Date Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFin()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateFin = DATE_FIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDomaineLogistique() <em>Domaine Logistique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomaineLogistique()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoDomaineLogistique DOMAINE_LOGISTIQUE_EDEFAULT = TypeDictionaryDicoDomaineLogistique.ADMIN;

	/**
	 * The cached value of the '{@link #getDomaineLogistique() <em>Domaine Logistique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomaineLogistique()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoDomaineLogistique domaineLogistique = DOMAINE_LOGISTIQUE_EDEFAULT;

	/**
	 * This is true if the Domaine Logistique attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean domaineLogistiqueESet;

	/**
	 * The default value of the '{@link #getSpecialiteMaintenance2() <em>Specialite Maintenance2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialiteMaintenance2()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoRattachementOuAbonnementSpecialiteMaintenance SPECIALITE_MAINTENANCE2_EDEFAULT = TypeDictionaryDicoRattachementOuAbonnementSpecialiteMaintenance.REP;

	/**
	 * The cached value of the '{@link #getSpecialiteMaintenance2() <em>Specialite Maintenance2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialiteMaintenance2()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoRattachementOuAbonnementSpecialiteMaintenance specialiteMaintenance2 = SPECIALITE_MAINTENANCE2_EDEFAULT;

	/**
	 * This is true if the Specialite Maintenance2 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean specialiteMaintenance2ESet;

	/**
	 * The default value of the '{@link #getSpecialiteMaintenance1() <em>Specialite Maintenance1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialiteMaintenance1()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoRattachementOuAbonnementSpecialiteMaintenance SPECIALITE_MAINTENANCE1_EDEFAULT = TypeDictionaryDicoRattachementOuAbonnementSpecialiteMaintenance.REP;

	/**
	 * The cached value of the '{@link #getSpecialiteMaintenance1() <em>Specialite Maintenance1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialiteMaintenance1()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoRattachementOuAbonnementSpecialiteMaintenance specialiteMaintenance1 = SPECIALITE_MAINTENANCE1_EDEFAULT;

	/**
	 * This is true if the Specialite Maintenance1 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean specialiteMaintenance1ESet;

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
	 * The cached value of the '{@link #getAPourUniteSoutenueUnite() <em>APour Unite Soutenue Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUniteSoutenueUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourUniteSoutenueUnite;

	/**
	 * The cached value of the '{@link #getAPourZoneRattachementZoneLogistique() <em>APour Zone Rattachement Zone Logistique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourZoneRattachementZoneLogistique()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourZoneRattachementZoneLogistique;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeRattachementOuAbonnementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeRattachementOuAbonnement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateDebut() {
		return dateDebut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDebut(XMLGregorianCalendar newDateDebut) {
		XMLGregorianCalendar oldDateDebut = dateDebut;
		dateDebut = newDateDebut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__DATE_DEBUT, oldDateDebut, dateDebut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateFin() {
		return dateFin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateFin(XMLGregorianCalendar newDateFin) {
		XMLGregorianCalendar oldDateFin = dateFin;
		dateFin = newDateFin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__DATE_FIN, oldDateFin, dateFin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoDomaineLogistique getDomaineLogistique() {
		return domaineLogistique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomaineLogistique(TypeDictionaryDicoDomaineLogistique newDomaineLogistique) {
		TypeDictionaryDicoDomaineLogistique oldDomaineLogistique = domaineLogistique;
		domaineLogistique = newDomaineLogistique == null ? DOMAINE_LOGISTIQUE_EDEFAULT : newDomaineLogistique;
		boolean oldDomaineLogistiqueESet = domaineLogistiqueESet;
		domaineLogistiqueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__DOMAINE_LOGISTIQUE, oldDomaineLogistique, domaineLogistique, !oldDomaineLogistiqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDomaineLogistique() {
		TypeDictionaryDicoDomaineLogistique oldDomaineLogistique = domaineLogistique;
		boolean oldDomaineLogistiqueESet = domaineLogistiqueESet;
		domaineLogistique = DOMAINE_LOGISTIQUE_EDEFAULT;
		domaineLogistiqueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__DOMAINE_LOGISTIQUE, oldDomaineLogistique, DOMAINE_LOGISTIQUE_EDEFAULT, oldDomaineLogistiqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDomaineLogistique() {
		return domaineLogistiqueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoRattachementOuAbonnementSpecialiteMaintenance getSpecialiteMaintenance2() {
		return specialiteMaintenance2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecialiteMaintenance2(TypeDictionaryDicoRattachementOuAbonnementSpecialiteMaintenance newSpecialiteMaintenance2) {
		TypeDictionaryDicoRattachementOuAbonnementSpecialiteMaintenance oldSpecialiteMaintenance2 = specialiteMaintenance2;
		specialiteMaintenance2 = newSpecialiteMaintenance2 == null ? SPECIALITE_MAINTENANCE2_EDEFAULT : newSpecialiteMaintenance2;
		boolean oldSpecialiteMaintenance2ESet = specialiteMaintenance2ESet;
		specialiteMaintenance2ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__SPECIALITE_MAINTENANCE2, oldSpecialiteMaintenance2, specialiteMaintenance2, !oldSpecialiteMaintenance2ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpecialiteMaintenance2() {
		TypeDictionaryDicoRattachementOuAbonnementSpecialiteMaintenance oldSpecialiteMaintenance2 = specialiteMaintenance2;
		boolean oldSpecialiteMaintenance2ESet = specialiteMaintenance2ESet;
		specialiteMaintenance2 = SPECIALITE_MAINTENANCE2_EDEFAULT;
		specialiteMaintenance2ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__SPECIALITE_MAINTENANCE2, oldSpecialiteMaintenance2, SPECIALITE_MAINTENANCE2_EDEFAULT, oldSpecialiteMaintenance2ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpecialiteMaintenance2() {
		return specialiteMaintenance2ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoRattachementOuAbonnementSpecialiteMaintenance getSpecialiteMaintenance1() {
		return specialiteMaintenance1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecialiteMaintenance1(TypeDictionaryDicoRattachementOuAbonnementSpecialiteMaintenance newSpecialiteMaintenance1) {
		TypeDictionaryDicoRattachementOuAbonnementSpecialiteMaintenance oldSpecialiteMaintenance1 = specialiteMaintenance1;
		specialiteMaintenance1 = newSpecialiteMaintenance1 == null ? SPECIALITE_MAINTENANCE1_EDEFAULT : newSpecialiteMaintenance1;
		boolean oldSpecialiteMaintenance1ESet = specialiteMaintenance1ESet;
		specialiteMaintenance1ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__SPECIALITE_MAINTENANCE1, oldSpecialiteMaintenance1, specialiteMaintenance1, !oldSpecialiteMaintenance1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpecialiteMaintenance1() {
		TypeDictionaryDicoRattachementOuAbonnementSpecialiteMaintenance oldSpecialiteMaintenance1 = specialiteMaintenance1;
		boolean oldSpecialiteMaintenance1ESet = specialiteMaintenance1ESet;
		specialiteMaintenance1 = SPECIALITE_MAINTENANCE1_EDEFAULT;
		specialiteMaintenance1ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__SPECIALITE_MAINTENANCE1, oldSpecialiteMaintenance1, SPECIALITE_MAINTENANCE1_EDEFAULT, oldSpecialiteMaintenance1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpecialiteMaintenance1() {
		return specialiteMaintenance1ESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__COMMENTAIRE, oldCommentaire, commentaire));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourUniteSoutenueUnite() {
		return aPourUniteSoutenueUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourUniteSoutenueUnite(TypeAssociationEXT newAPourUniteSoutenueUnite, NotificationChain msgs) {
		TypeAssociationEXT oldAPourUniteSoutenueUnite = aPourUniteSoutenueUnite;
		aPourUniteSoutenueUnite = newAPourUniteSoutenueUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__APOUR_UNITE_SOUTENUE_UNITE, oldAPourUniteSoutenueUnite, newAPourUniteSoutenueUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourUniteSoutenueUnite(TypeAssociationEXT newAPourUniteSoutenueUnite) {
		if (newAPourUniteSoutenueUnite != aPourUniteSoutenueUnite) {
			NotificationChain msgs = null;
			if (aPourUniteSoutenueUnite != null)
				msgs = ((InternalEObject)aPourUniteSoutenueUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__APOUR_UNITE_SOUTENUE_UNITE, null, msgs);
			if (newAPourUniteSoutenueUnite != null)
				msgs = ((InternalEObject)newAPourUniteSoutenueUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__APOUR_UNITE_SOUTENUE_UNITE, null, msgs);
			msgs = basicSetAPourUniteSoutenueUnite(newAPourUniteSoutenueUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__APOUR_UNITE_SOUTENUE_UNITE, newAPourUniteSoutenueUnite, newAPourUniteSoutenueUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourZoneRattachementZoneLogistique() {
		return aPourZoneRattachementZoneLogistique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourZoneRattachementZoneLogistique(TypeAssociation newAPourZoneRattachementZoneLogistique, NotificationChain msgs) {
		TypeAssociation oldAPourZoneRattachementZoneLogistique = aPourZoneRattachementZoneLogistique;
		aPourZoneRattachementZoneLogistique = newAPourZoneRattachementZoneLogistique;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__APOUR_ZONE_RATTACHEMENT_ZONE_LOGISTIQUE, oldAPourZoneRattachementZoneLogistique, newAPourZoneRattachementZoneLogistique);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourZoneRattachementZoneLogistique(TypeAssociation newAPourZoneRattachementZoneLogistique) {
		if (newAPourZoneRattachementZoneLogistique != aPourZoneRattachementZoneLogistique) {
			NotificationChain msgs = null;
			if (aPourZoneRattachementZoneLogistique != null)
				msgs = ((InternalEObject)aPourZoneRattachementZoneLogistique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__APOUR_ZONE_RATTACHEMENT_ZONE_LOGISTIQUE, null, msgs);
			if (newAPourZoneRattachementZoneLogistique != null)
				msgs = ((InternalEObject)newAPourZoneRattachementZoneLogistique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__APOUR_ZONE_RATTACHEMENT_ZONE_LOGISTIQUE, null, msgs);
			msgs = basicSetAPourZoneRattachementZoneLogistique(newAPourZoneRattachementZoneLogistique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__APOUR_ZONE_RATTACHEMENT_ZONE_LOGISTIQUE, newAPourZoneRattachementZoneLogistique, newAPourZoneRattachementZoneLogistique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__APOUR_UNITE_SOUTENUE_UNITE:
				return basicSetAPourUniteSoutenueUnite(null, msgs);
			case SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__APOUR_ZONE_RATTACHEMENT_ZONE_LOGISTIQUE:
				return basicSetAPourZoneRattachementZoneLogistique(null, msgs);
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
			case SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__DATE_DEBUT:
				return getDateDebut();
			case SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__DATE_FIN:
				return getDateFin();
			case SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__DOMAINE_LOGISTIQUE:
				return getDomaineLogistique();
			case SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__SPECIALITE_MAINTENANCE2:
				return getSpecialiteMaintenance2();
			case SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__SPECIALITE_MAINTENANCE1:
				return getSpecialiteMaintenance1();
			case SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__COMMENTAIRE:
				return getCommentaire();
			case SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__CTE:
				return getCTE();
			case SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__CE:
				return getCE();
			case SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__APOUR_UNITE_SOUTENUE_UNITE:
				return getAPourUniteSoutenueUnite();
			case SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__APOUR_ZONE_RATTACHEMENT_ZONE_LOGISTIQUE:
				return getAPourZoneRattachementZoneLogistique();
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
			case SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__DATE_DEBUT:
				setDateDebut((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__DATE_FIN:
				setDateFin((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__DOMAINE_LOGISTIQUE:
				setDomaineLogistique((TypeDictionaryDicoDomaineLogistique)newValue);
				return;
			case SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__SPECIALITE_MAINTENANCE2:
				setSpecialiteMaintenance2((TypeDictionaryDicoRattachementOuAbonnementSpecialiteMaintenance)newValue);
				return;
			case SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__SPECIALITE_MAINTENANCE1:
				setSpecialiteMaintenance1((TypeDictionaryDicoRattachementOuAbonnementSpecialiteMaintenance)newValue);
				return;
			case SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__COMMENTAIRE:
				setCommentaire((String)newValue);
				return;
			case SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__APOUR_UNITE_SOUTENUE_UNITE:
				setAPourUniteSoutenueUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__APOUR_ZONE_RATTACHEMENT_ZONE_LOGISTIQUE:
				setAPourZoneRattachementZoneLogistique((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__DATE_DEBUT:
				setDateDebut(DATE_DEBUT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__DATE_FIN:
				setDateFin(DATE_FIN_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__DOMAINE_LOGISTIQUE:
				unsetDomaineLogistique();
				return;
			case SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__SPECIALITE_MAINTENANCE2:
				unsetSpecialiteMaintenance2();
				return;
			case SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__SPECIALITE_MAINTENANCE1:
				unsetSpecialiteMaintenance1();
				return;
			case SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__COMMENTAIRE:
				setCommentaire(COMMENTAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__APOUR_UNITE_SOUTENUE_UNITE:
				setAPourUniteSoutenueUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__APOUR_ZONE_RATTACHEMENT_ZONE_LOGISTIQUE:
				setAPourZoneRattachementZoneLogistique((TypeAssociation)null);
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
			case SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__DATE_DEBUT:
				return DATE_DEBUT_EDEFAULT == null ? dateDebut != null : !DATE_DEBUT_EDEFAULT.equals(dateDebut);
			case SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__DATE_FIN:
				return DATE_FIN_EDEFAULT == null ? dateFin != null : !DATE_FIN_EDEFAULT.equals(dateFin);
			case SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__DOMAINE_LOGISTIQUE:
				return isSetDomaineLogistique();
			case SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__SPECIALITE_MAINTENANCE2:
				return isSetSpecialiteMaintenance2();
			case SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__SPECIALITE_MAINTENANCE1:
				return isSetSpecialiteMaintenance1();
			case SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__COMMENTAIRE:
				return COMMENTAIRE_EDEFAULT == null ? commentaire != null : !COMMENTAIRE_EDEFAULT.equals(commentaire);
			case SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__APOUR_UNITE_SOUTENUE_UNITE:
				return aPourUniteSoutenueUnite != null;
			case SchemaPackage.TYPE_RATTACHEMENT_OU_ABONNEMENT__APOUR_ZONE_RATTACHEMENT_ZONE_LOGISTIQUE:
				return aPourZoneRattachementZoneLogistique != null;
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
		result.append(" (dateDebut: ");
		result.append(dateDebut);
		result.append(", dateFin: ");
		result.append(dateFin);
		result.append(", domaineLogistique: ");
		if (domaineLogistiqueESet) result.append(domaineLogistique); else result.append("<unset>");
		result.append(", specialiteMaintenance2: ");
		if (specialiteMaintenance2ESet) result.append(specialiteMaintenance2); else result.append("<unset>");
		result.append(", specialiteMaintenance1: ");
		if (specialiteMaintenance1ESet) result.append(specialiteMaintenance1); else result.append("<unset>");
		result.append(", commentaire: ");
		result.append(commentaire);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeRattachementOuAbonnementImpl
