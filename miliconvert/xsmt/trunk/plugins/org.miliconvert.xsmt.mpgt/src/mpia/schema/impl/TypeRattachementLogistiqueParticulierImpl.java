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
import mpia.schema.TypeRattachementLogistiqueParticulier;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Rattachement Logistique Particulier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeRattachementLogistiqueParticulierImpl#getDomaineLogistique <em>Domaine Logistique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRattachementLogistiqueParticulierImpl#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRattachementLogistiqueParticulierImpl#getDateFin <em>Date Fin</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRattachementLogistiqueParticulierImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRattachementLogistiqueParticulierImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRattachementLogistiqueParticulierImpl#getVautPendantHoraireManoeuvre <em>Vaut Pendant Horaire Manoeuvre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRattachementLogistiqueParticulierImpl#getAPourUniteRattacheeUnite <em>APour Unite Rattachee Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRattachementLogistiqueParticulierImpl#getAPourUniteRattachementUnite <em>APour Unite Rattachement Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRattachementLogistiqueParticulierImpl#getAPourZoneRattachementZoneLogistique <em>APour Zone Rattachement Zone Logistique</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeRattachementLogistiqueParticulierImpl extends EObjectImpl implements TypeRattachementLogistiqueParticulier {
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
	 * The cached value of the '{@link #getVautPendantHoraireManoeuvre() <em>Vaut Pendant Horaire Manoeuvre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVautPendantHoraireManoeuvre()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation vautPendantHoraireManoeuvre;

	/**
	 * The cached value of the '{@link #getAPourUniteRattacheeUnite() <em>APour Unite Rattachee Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUniteRattacheeUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourUniteRattacheeUnite;

	/**
	 * The cached value of the '{@link #getAPourUniteRattachementUnite() <em>APour Unite Rattachement Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUniteRattachementUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourUniteRattachementUnite;

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
	protected TypeRattachementLogistiqueParticulierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeRattachementLogistiqueParticulier();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__DOMAINE_LOGISTIQUE, oldDomaineLogistique, domaineLogistique, !oldDomaineLogistiqueESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__DOMAINE_LOGISTIQUE, oldDomaineLogistique, DOMAINE_LOGISTIQUE_EDEFAULT, oldDomaineLogistiqueESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__DATE_DEBUT, oldDateDebut, dateDebut));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__DATE_FIN, oldDateFin, dateFin));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getVautPendantHoraireManoeuvre() {
		return vautPendantHoraireManoeuvre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVautPendantHoraireManoeuvre(TypeAssociation newVautPendantHoraireManoeuvre, NotificationChain msgs) {
		TypeAssociation oldVautPendantHoraireManoeuvre = vautPendantHoraireManoeuvre;
		vautPendantHoraireManoeuvre = newVautPendantHoraireManoeuvre;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__VAUT_PENDANT_HORAIRE_MANOEUVRE, oldVautPendantHoraireManoeuvre, newVautPendantHoraireManoeuvre);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVautPendantHoraireManoeuvre(TypeAssociation newVautPendantHoraireManoeuvre) {
		if (newVautPendantHoraireManoeuvre != vautPendantHoraireManoeuvre) {
			NotificationChain msgs = null;
			if (vautPendantHoraireManoeuvre != null)
				msgs = ((InternalEObject)vautPendantHoraireManoeuvre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__VAUT_PENDANT_HORAIRE_MANOEUVRE, null, msgs);
			if (newVautPendantHoraireManoeuvre != null)
				msgs = ((InternalEObject)newVautPendantHoraireManoeuvre).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__VAUT_PENDANT_HORAIRE_MANOEUVRE, null, msgs);
			msgs = basicSetVautPendantHoraireManoeuvre(newVautPendantHoraireManoeuvre, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__VAUT_PENDANT_HORAIRE_MANOEUVRE, newVautPendantHoraireManoeuvre, newVautPendantHoraireManoeuvre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourUniteRattacheeUnite() {
		return aPourUniteRattacheeUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourUniteRattacheeUnite(TypeAssociationEXT newAPourUniteRattacheeUnite, NotificationChain msgs) {
		TypeAssociationEXT oldAPourUniteRattacheeUnite = aPourUniteRattacheeUnite;
		aPourUniteRattacheeUnite = newAPourUniteRattacheeUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__APOUR_UNITE_RATTACHEE_UNITE, oldAPourUniteRattacheeUnite, newAPourUniteRattacheeUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourUniteRattacheeUnite(TypeAssociationEXT newAPourUniteRattacheeUnite) {
		if (newAPourUniteRattacheeUnite != aPourUniteRattacheeUnite) {
			NotificationChain msgs = null;
			if (aPourUniteRattacheeUnite != null)
				msgs = ((InternalEObject)aPourUniteRattacheeUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__APOUR_UNITE_RATTACHEE_UNITE, null, msgs);
			if (newAPourUniteRattacheeUnite != null)
				msgs = ((InternalEObject)newAPourUniteRattacheeUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__APOUR_UNITE_RATTACHEE_UNITE, null, msgs);
			msgs = basicSetAPourUniteRattacheeUnite(newAPourUniteRattacheeUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__APOUR_UNITE_RATTACHEE_UNITE, newAPourUniteRattacheeUnite, newAPourUniteRattacheeUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourUniteRattachementUnite() {
		return aPourUniteRattachementUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourUniteRattachementUnite(TypeAssociationEXT newAPourUniteRattachementUnite, NotificationChain msgs) {
		TypeAssociationEXT oldAPourUniteRattachementUnite = aPourUniteRattachementUnite;
		aPourUniteRattachementUnite = newAPourUniteRattachementUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__APOUR_UNITE_RATTACHEMENT_UNITE, oldAPourUniteRattachementUnite, newAPourUniteRattachementUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourUniteRattachementUnite(TypeAssociationEXT newAPourUniteRattachementUnite) {
		if (newAPourUniteRattachementUnite != aPourUniteRattachementUnite) {
			NotificationChain msgs = null;
			if (aPourUniteRattachementUnite != null)
				msgs = ((InternalEObject)aPourUniteRattachementUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__APOUR_UNITE_RATTACHEMENT_UNITE, null, msgs);
			if (newAPourUniteRattachementUnite != null)
				msgs = ((InternalEObject)newAPourUniteRattachementUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__APOUR_UNITE_RATTACHEMENT_UNITE, null, msgs);
			msgs = basicSetAPourUniteRattachementUnite(newAPourUniteRattachementUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__APOUR_UNITE_RATTACHEMENT_UNITE, newAPourUniteRattachementUnite, newAPourUniteRattachementUnite));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__APOUR_ZONE_RATTACHEMENT_ZONE_LOGISTIQUE, oldAPourZoneRattachementZoneLogistique, newAPourZoneRattachementZoneLogistique);
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
				msgs = ((InternalEObject)aPourZoneRattachementZoneLogistique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__APOUR_ZONE_RATTACHEMENT_ZONE_LOGISTIQUE, null, msgs);
			if (newAPourZoneRattachementZoneLogistique != null)
				msgs = ((InternalEObject)newAPourZoneRattachementZoneLogistique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__APOUR_ZONE_RATTACHEMENT_ZONE_LOGISTIQUE, null, msgs);
			msgs = basicSetAPourZoneRattachementZoneLogistique(newAPourZoneRattachementZoneLogistique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__APOUR_ZONE_RATTACHEMENT_ZONE_LOGISTIQUE, newAPourZoneRattachementZoneLogistique, newAPourZoneRattachementZoneLogistique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__VAUT_PENDANT_HORAIRE_MANOEUVRE:
				return basicSetVautPendantHoraireManoeuvre(null, msgs);
			case SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__APOUR_UNITE_RATTACHEE_UNITE:
				return basicSetAPourUniteRattacheeUnite(null, msgs);
			case SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__APOUR_UNITE_RATTACHEMENT_UNITE:
				return basicSetAPourUniteRattachementUnite(null, msgs);
			case SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__APOUR_ZONE_RATTACHEMENT_ZONE_LOGISTIQUE:
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
			case SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__DOMAINE_LOGISTIQUE:
				return getDomaineLogistique();
			case SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__DATE_DEBUT:
				return getDateDebut();
			case SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__DATE_FIN:
				return getDateFin();
			case SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__CTE:
				return getCTE();
			case SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__CE:
				return getCE();
			case SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__VAUT_PENDANT_HORAIRE_MANOEUVRE:
				return getVautPendantHoraireManoeuvre();
			case SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__APOUR_UNITE_RATTACHEE_UNITE:
				return getAPourUniteRattacheeUnite();
			case SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__APOUR_UNITE_RATTACHEMENT_UNITE:
				return getAPourUniteRattachementUnite();
			case SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__APOUR_ZONE_RATTACHEMENT_ZONE_LOGISTIQUE:
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
			case SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__DOMAINE_LOGISTIQUE:
				setDomaineLogistique((TypeDictionaryDicoDomaineLogistique)newValue);
				return;
			case SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__DATE_DEBUT:
				setDateDebut((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__DATE_FIN:
				setDateFin((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__VAUT_PENDANT_HORAIRE_MANOEUVRE:
				setVautPendantHoraireManoeuvre((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__APOUR_UNITE_RATTACHEE_UNITE:
				setAPourUniteRattacheeUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__APOUR_UNITE_RATTACHEMENT_UNITE:
				setAPourUniteRattachementUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__APOUR_ZONE_RATTACHEMENT_ZONE_LOGISTIQUE:
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
			case SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__DOMAINE_LOGISTIQUE:
				unsetDomaineLogistique();
				return;
			case SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__DATE_DEBUT:
				setDateDebut(DATE_DEBUT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__DATE_FIN:
				setDateFin(DATE_FIN_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__VAUT_PENDANT_HORAIRE_MANOEUVRE:
				setVautPendantHoraireManoeuvre((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__APOUR_UNITE_RATTACHEE_UNITE:
				setAPourUniteRattacheeUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__APOUR_UNITE_RATTACHEMENT_UNITE:
				setAPourUniteRattachementUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__APOUR_ZONE_RATTACHEMENT_ZONE_LOGISTIQUE:
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
			case SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__DOMAINE_LOGISTIQUE:
				return isSetDomaineLogistique();
			case SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__DATE_DEBUT:
				return DATE_DEBUT_EDEFAULT == null ? dateDebut != null : !DATE_DEBUT_EDEFAULT.equals(dateDebut);
			case SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__DATE_FIN:
				return DATE_FIN_EDEFAULT == null ? dateFin != null : !DATE_FIN_EDEFAULT.equals(dateFin);
			case SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__VAUT_PENDANT_HORAIRE_MANOEUVRE:
				return vautPendantHoraireManoeuvre != null;
			case SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__APOUR_UNITE_RATTACHEE_UNITE:
				return aPourUniteRattacheeUnite != null;
			case SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__APOUR_UNITE_RATTACHEMENT_UNITE:
				return aPourUniteRattachementUnite != null;
			case SchemaPackage.TYPE_RATTACHEMENT_LOGISTIQUE_PARTICULIER__APOUR_ZONE_RATTACHEMENT_ZONE_LOGISTIQUE:
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
		result.append(" (domaineLogistique: ");
		if (domaineLogistiqueESet) result.append(domaineLogistique); else result.append("<unset>");
		result.append(", dateDebut: ");
		result.append(dateDebut);
		result.append(", dateFin: ");
		result.append(dateFin);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeRattachementLogistiqueParticulierImpl
