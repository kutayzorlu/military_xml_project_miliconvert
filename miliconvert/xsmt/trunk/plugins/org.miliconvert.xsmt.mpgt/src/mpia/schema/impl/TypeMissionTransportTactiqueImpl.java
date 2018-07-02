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
import mpia.schema.TypeMissionTransportTactique;

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
 * An implementation of the model object '<em><b>Type Mission Transport Tactique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMissionTransportTactiqueImpl#getVolumeMateriel <em>Volume Materiel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionTransportTactiqueImpl#getMasseMateriel <em>Masse Materiel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionTransportTactiqueImpl#getNbrPersonne <em>Nbr Personne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionTransportTactiqueImpl#getMoyenContact <em>Moyen Contact</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionTransportTactiqueImpl#getAPourLieuDeMiseADispositionAutreElementControle <em>APour Lieu De Mise ADisposition Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionTransportTactiqueImpl#getEstObjetAssociationUniteMissionTranspTact <em>Est Objet Association Unite Mission Transp Tact</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionTransportTactiqueImpl#getAPourZoneDEnleverAutreElementControle <em>APour Zone DEnlever Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionTransportTactiqueImpl#getAPourZoneDePoserAutreElementControle <em>APour Zone De Poser Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionTransportTactiqueImpl#getAPourLieuDeContactAutreElementControle <em>APour Lieu De Contact Autre Element Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMissionTransportTactiqueImpl extends TypeMissionImpl implements TypeMissionTransportTactique {
	/**
	 * The default value of the '{@link #getVolumeMateriel() <em>Volume Materiel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeMateriel()
	 * @generated
	 * @ordered
	 */
	protected static final long VOLUME_MATERIEL_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getVolumeMateriel() <em>Volume Materiel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeMateriel()
	 * @generated
	 * @ordered
	 */
	protected long volumeMateriel = VOLUME_MATERIEL_EDEFAULT;

	/**
	 * This is true if the Volume Materiel attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean volumeMaterielESet;

	/**
	 * The default value of the '{@link #getMasseMateriel() <em>Masse Materiel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasseMateriel()
	 * @generated
	 * @ordered
	 */
	protected static final long MASSE_MATERIEL_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMasseMateriel() <em>Masse Materiel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasseMateriel()
	 * @generated
	 * @ordered
	 */
	protected long masseMateriel = MASSE_MATERIEL_EDEFAULT;

	/**
	 * This is true if the Masse Materiel attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean masseMaterielESet;

	/**
	 * The default value of the '{@link #getNbrPersonne() <em>Nbr Personne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbrPersonne()
	 * @generated
	 * @ordered
	 */
	protected static final long NBR_PERSONNE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNbrPersonne() <em>Nbr Personne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbrPersonne()
	 * @generated
	 * @ordered
	 */
	protected long nbrPersonne = NBR_PERSONNE_EDEFAULT;

	/**
	 * This is true if the Nbr Personne attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nbrPersonneESet;

	/**
	 * The default value of the '{@link #getMoyenContact() <em>Moyen Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyenContact()
	 * @generated
	 * @ordered
	 */
	protected static final String MOYEN_CONTACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMoyenContact() <em>Moyen Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyenContact()
	 * @generated
	 * @ordered
	 */
	protected String moyenContact = MOYEN_CONTACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAPourLieuDeMiseADispositionAutreElementControle() <em>APour Lieu De Mise ADisposition Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourLieuDeMiseADispositionAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourLieuDeMiseADispositionAutreElementControle;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationUniteMissionTranspTact() <em>Est Objet Association Unite Mission Transp Tact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationUniteMissionTranspTact()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationUniteMissionTranspTact;

	/**
	 * The cached value of the '{@link #getAPourZoneDEnleverAutreElementControle() <em>APour Zone DEnlever Autre Element Controle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourZoneDEnleverAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourZoneDEnleverAutreElementControle;

	/**
	 * The cached value of the '{@link #getAPourZoneDePoserAutreElementControle() <em>APour Zone De Poser Autre Element Controle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourZoneDePoserAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourZoneDePoserAutreElementControle;

	/**
	 * The cached value of the '{@link #getAPourLieuDeContactAutreElementControle() <em>APour Lieu De Contact Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourLieuDeContactAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourLieuDeContactAutreElementControle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMissionTransportTactiqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMissionTransportTactique();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getVolumeMateriel() {
		return volumeMateriel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolumeMateriel(long newVolumeMateriel) {
		long oldVolumeMateriel = volumeMateriel;
		volumeMateriel = newVolumeMateriel;
		boolean oldVolumeMaterielESet = volumeMaterielESet;
		volumeMaterielESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__VOLUME_MATERIEL, oldVolumeMateriel, volumeMateriel, !oldVolumeMaterielESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVolumeMateriel() {
		long oldVolumeMateriel = volumeMateriel;
		boolean oldVolumeMaterielESet = volumeMaterielESet;
		volumeMateriel = VOLUME_MATERIEL_EDEFAULT;
		volumeMaterielESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__VOLUME_MATERIEL, oldVolumeMateriel, VOLUME_MATERIEL_EDEFAULT, oldVolumeMaterielESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVolumeMateriel() {
		return volumeMaterielESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMasseMateriel() {
		return masseMateriel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMasseMateriel(long newMasseMateriel) {
		long oldMasseMateriel = masseMateriel;
		masseMateriel = newMasseMateriel;
		boolean oldMasseMaterielESet = masseMaterielESet;
		masseMaterielESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__MASSE_MATERIEL, oldMasseMateriel, masseMateriel, !oldMasseMaterielESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMasseMateriel() {
		long oldMasseMateriel = masseMateriel;
		boolean oldMasseMaterielESet = masseMaterielESet;
		masseMateriel = MASSE_MATERIEL_EDEFAULT;
		masseMaterielESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__MASSE_MATERIEL, oldMasseMateriel, MASSE_MATERIEL_EDEFAULT, oldMasseMaterielESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMasseMateriel() {
		return masseMaterielESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNbrPersonne() {
		return nbrPersonne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbrPersonne(long newNbrPersonne) {
		long oldNbrPersonne = nbrPersonne;
		nbrPersonne = newNbrPersonne;
		boolean oldNbrPersonneESet = nbrPersonneESet;
		nbrPersonneESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__NBR_PERSONNE, oldNbrPersonne, nbrPersonne, !oldNbrPersonneESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNbrPersonne() {
		long oldNbrPersonne = nbrPersonne;
		boolean oldNbrPersonneESet = nbrPersonneESet;
		nbrPersonne = NBR_PERSONNE_EDEFAULT;
		nbrPersonneESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__NBR_PERSONNE, oldNbrPersonne, NBR_PERSONNE_EDEFAULT, oldNbrPersonneESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNbrPersonne() {
		return nbrPersonneESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMoyenContact() {
		return moyenContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoyenContact(String newMoyenContact) {
		String oldMoyenContact = moyenContact;
		moyenContact = newMoyenContact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__MOYEN_CONTACT, oldMoyenContact, moyenContact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourLieuDeMiseADispositionAutreElementControle() {
		return aPourLieuDeMiseADispositionAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourLieuDeMiseADispositionAutreElementControle(TypeAssociation newAPourLieuDeMiseADispositionAutreElementControle, NotificationChain msgs) {
		TypeAssociation oldAPourLieuDeMiseADispositionAutreElementControle = aPourLieuDeMiseADispositionAutreElementControle;
		aPourLieuDeMiseADispositionAutreElementControle = newAPourLieuDeMiseADispositionAutreElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__APOUR_LIEU_DE_MISE_ADISPOSITION_AUTRE_ELEMENT_CONTROLE, oldAPourLieuDeMiseADispositionAutreElementControle, newAPourLieuDeMiseADispositionAutreElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourLieuDeMiseADispositionAutreElementControle(TypeAssociation newAPourLieuDeMiseADispositionAutreElementControle) {
		if (newAPourLieuDeMiseADispositionAutreElementControle != aPourLieuDeMiseADispositionAutreElementControle) {
			NotificationChain msgs = null;
			if (aPourLieuDeMiseADispositionAutreElementControle != null)
				msgs = ((InternalEObject)aPourLieuDeMiseADispositionAutreElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__APOUR_LIEU_DE_MISE_ADISPOSITION_AUTRE_ELEMENT_CONTROLE, null, msgs);
			if (newAPourLieuDeMiseADispositionAutreElementControle != null)
				msgs = ((InternalEObject)newAPourLieuDeMiseADispositionAutreElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__APOUR_LIEU_DE_MISE_ADISPOSITION_AUTRE_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetAPourLieuDeMiseADispositionAutreElementControle(newAPourLieuDeMiseADispositionAutreElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__APOUR_LIEU_DE_MISE_ADISPOSITION_AUTRE_ELEMENT_CONTROLE, newAPourLieuDeMiseADispositionAutreElementControle, newAPourLieuDeMiseADispositionAutreElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationUniteMissionTranspTact() {
		if (estObjetAssociationUniteMissionTranspTact == null) {
			estObjetAssociationUniteMissionTranspTact = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__EST_OBJET_ASSOCIATION_UNITE_MISSION_TRANSP_TACT);
		}
		return estObjetAssociationUniteMissionTranspTact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourZoneDEnleverAutreElementControle() {
		if (aPourZoneDEnleverAutreElementControle == null) {
			aPourZoneDEnleverAutreElementControle = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__APOUR_ZONE_DENLEVER_AUTRE_ELEMENT_CONTROLE);
		}
		return aPourZoneDEnleverAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourZoneDePoserAutreElementControle() {
		if (aPourZoneDePoserAutreElementControle == null) {
			aPourZoneDePoserAutreElementControle = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__APOUR_ZONE_DE_POSER_AUTRE_ELEMENT_CONTROLE);
		}
		return aPourZoneDePoserAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourLieuDeContactAutreElementControle() {
		return aPourLieuDeContactAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourLieuDeContactAutreElementControle(TypeAssociation newAPourLieuDeContactAutreElementControle, NotificationChain msgs) {
		TypeAssociation oldAPourLieuDeContactAutreElementControle = aPourLieuDeContactAutreElementControle;
		aPourLieuDeContactAutreElementControle = newAPourLieuDeContactAutreElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__APOUR_LIEU_DE_CONTACT_AUTRE_ELEMENT_CONTROLE, oldAPourLieuDeContactAutreElementControle, newAPourLieuDeContactAutreElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourLieuDeContactAutreElementControle(TypeAssociation newAPourLieuDeContactAutreElementControle) {
		if (newAPourLieuDeContactAutreElementControle != aPourLieuDeContactAutreElementControle) {
			NotificationChain msgs = null;
			if (aPourLieuDeContactAutreElementControle != null)
				msgs = ((InternalEObject)aPourLieuDeContactAutreElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__APOUR_LIEU_DE_CONTACT_AUTRE_ELEMENT_CONTROLE, null, msgs);
			if (newAPourLieuDeContactAutreElementControle != null)
				msgs = ((InternalEObject)newAPourLieuDeContactAutreElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__APOUR_LIEU_DE_CONTACT_AUTRE_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetAPourLieuDeContactAutreElementControle(newAPourLieuDeContactAutreElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__APOUR_LIEU_DE_CONTACT_AUTRE_ELEMENT_CONTROLE, newAPourLieuDeContactAutreElementControle, newAPourLieuDeContactAutreElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__APOUR_LIEU_DE_MISE_ADISPOSITION_AUTRE_ELEMENT_CONTROLE:
				return basicSetAPourLieuDeMiseADispositionAutreElementControle(null, msgs);
			case SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__EST_OBJET_ASSOCIATION_UNITE_MISSION_TRANSP_TACT:
				return ((InternalEList<?>)getEstObjetAssociationUniteMissionTranspTact()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__APOUR_ZONE_DENLEVER_AUTRE_ELEMENT_CONTROLE:
				return ((InternalEList<?>)getAPourZoneDEnleverAutreElementControle()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__APOUR_ZONE_DE_POSER_AUTRE_ELEMENT_CONTROLE:
				return ((InternalEList<?>)getAPourZoneDePoserAutreElementControle()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__APOUR_LIEU_DE_CONTACT_AUTRE_ELEMENT_CONTROLE:
				return basicSetAPourLieuDeContactAutreElementControle(null, msgs);
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
			case SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__VOLUME_MATERIEL:
				return new Long(getVolumeMateriel());
			case SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__MASSE_MATERIEL:
				return new Long(getMasseMateriel());
			case SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__NBR_PERSONNE:
				return new Long(getNbrPersonne());
			case SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__MOYEN_CONTACT:
				return getMoyenContact();
			case SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__APOUR_LIEU_DE_MISE_ADISPOSITION_AUTRE_ELEMENT_CONTROLE:
				return getAPourLieuDeMiseADispositionAutreElementControle();
			case SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__EST_OBJET_ASSOCIATION_UNITE_MISSION_TRANSP_TACT:
				return getEstObjetAssociationUniteMissionTranspTact();
			case SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__APOUR_ZONE_DENLEVER_AUTRE_ELEMENT_CONTROLE:
				return getAPourZoneDEnleverAutreElementControle();
			case SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__APOUR_ZONE_DE_POSER_AUTRE_ELEMENT_CONTROLE:
				return getAPourZoneDePoserAutreElementControle();
			case SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__APOUR_LIEU_DE_CONTACT_AUTRE_ELEMENT_CONTROLE:
				return getAPourLieuDeContactAutreElementControle();
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
			case SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__VOLUME_MATERIEL:
				setVolumeMateriel(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__MASSE_MATERIEL:
				setMasseMateriel(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__NBR_PERSONNE:
				setNbrPersonne(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__MOYEN_CONTACT:
				setMoyenContact((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__APOUR_LIEU_DE_MISE_ADISPOSITION_AUTRE_ELEMENT_CONTROLE:
				setAPourLieuDeMiseADispositionAutreElementControle((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__EST_OBJET_ASSOCIATION_UNITE_MISSION_TRANSP_TACT:
				getEstObjetAssociationUniteMissionTranspTact().clear();
				getEstObjetAssociationUniteMissionTranspTact().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__APOUR_ZONE_DENLEVER_AUTRE_ELEMENT_CONTROLE:
				getAPourZoneDEnleverAutreElementControle().clear();
				getAPourZoneDEnleverAutreElementControle().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__APOUR_ZONE_DE_POSER_AUTRE_ELEMENT_CONTROLE:
				getAPourZoneDePoserAutreElementControle().clear();
				getAPourZoneDePoserAutreElementControle().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__APOUR_LIEU_DE_CONTACT_AUTRE_ELEMENT_CONTROLE:
				setAPourLieuDeContactAutreElementControle((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__VOLUME_MATERIEL:
				unsetVolumeMateriel();
				return;
			case SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__MASSE_MATERIEL:
				unsetMasseMateriel();
				return;
			case SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__NBR_PERSONNE:
				unsetNbrPersonne();
				return;
			case SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__MOYEN_CONTACT:
				setMoyenContact(MOYEN_CONTACT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__APOUR_LIEU_DE_MISE_ADISPOSITION_AUTRE_ELEMENT_CONTROLE:
				setAPourLieuDeMiseADispositionAutreElementControle((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__EST_OBJET_ASSOCIATION_UNITE_MISSION_TRANSP_TACT:
				getEstObjetAssociationUniteMissionTranspTact().clear();
				return;
			case SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__APOUR_ZONE_DENLEVER_AUTRE_ELEMENT_CONTROLE:
				getAPourZoneDEnleverAutreElementControle().clear();
				return;
			case SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__APOUR_ZONE_DE_POSER_AUTRE_ELEMENT_CONTROLE:
				getAPourZoneDePoserAutreElementControle().clear();
				return;
			case SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__APOUR_LIEU_DE_CONTACT_AUTRE_ELEMENT_CONTROLE:
				setAPourLieuDeContactAutreElementControle((TypeAssociation)null);
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
			case SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__VOLUME_MATERIEL:
				return isSetVolumeMateriel();
			case SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__MASSE_MATERIEL:
				return isSetMasseMateriel();
			case SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__NBR_PERSONNE:
				return isSetNbrPersonne();
			case SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__MOYEN_CONTACT:
				return MOYEN_CONTACT_EDEFAULT == null ? moyenContact != null : !MOYEN_CONTACT_EDEFAULT.equals(moyenContact);
			case SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__APOUR_LIEU_DE_MISE_ADISPOSITION_AUTRE_ELEMENT_CONTROLE:
				return aPourLieuDeMiseADispositionAutreElementControle != null;
			case SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__EST_OBJET_ASSOCIATION_UNITE_MISSION_TRANSP_TACT:
				return estObjetAssociationUniteMissionTranspTact != null && !estObjetAssociationUniteMissionTranspTact.isEmpty();
			case SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__APOUR_ZONE_DENLEVER_AUTRE_ELEMENT_CONTROLE:
				return aPourZoneDEnleverAutreElementControle != null && !aPourZoneDEnleverAutreElementControle.isEmpty();
			case SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__APOUR_ZONE_DE_POSER_AUTRE_ELEMENT_CONTROLE:
				return aPourZoneDePoserAutreElementControle != null && !aPourZoneDePoserAutreElementControle.isEmpty();
			case SchemaPackage.TYPE_MISSION_TRANSPORT_TACTIQUE__APOUR_LIEU_DE_CONTACT_AUTRE_ELEMENT_CONTROLE:
				return aPourLieuDeContactAutreElementControle != null;
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
		result.append(" (volumeMateriel: ");
		if (volumeMaterielESet) result.append(volumeMateriel); else result.append("<unset>");
		result.append(", masseMateriel: ");
		if (masseMaterielESet) result.append(masseMateriel); else result.append("<unset>");
		result.append(", nbrPersonne: ");
		if (nbrPersonneESet) result.append(nbrPersonne); else result.append("<unset>");
		result.append(", moyenContact: ");
		result.append(moyenContact);
		result.append(')');
		return result.toString();
	}

} //TypeMissionTransportTactiqueImpl
