/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoEntitePolitiqueTrigramme;
import mpia.schema.TypeLocalisation;
import mpia.schema.TypeMoyenCommunication;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Moyen Communication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMoyenCommunicationImpl#getIdentifiant <em>Identifiant</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyenCommunicationImpl#getNationalite <em>Nationalite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyenCommunicationImpl#isRadio <em>Radio</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyenCommunicationImpl#getPortee <em>Portee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyenCommunicationImpl#isAffichageCouverture <em>Affichage Couverture</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyenCommunicationImpl#isSatellite <em>Satellite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyenCommunicationImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyenCommunicationImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyenCommunicationImpl#getTypeEquipementTypeEquipement <em>Type Equipement Type Equipement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyenCommunicationImpl#getLocalisationLocalisation <em>Localisation Localisation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMoyenCommunicationImpl extends EObjectImpl implements TypeMoyenCommunication {
	/**
	 * The default value of the '{@link #getIdentifiant() <em>Identifiant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiant()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIANT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifiant() <em>Identifiant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiant()
	 * @generated
	 * @ordered
	 */
	protected String identifiant = IDENTIFIANT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNationalite() <em>Nationalite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNationalite()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEntitePolitiqueTrigramme NATIONALITE_EDEFAULT = TypeDictionaryDicoEntitePolitiqueTrigramme.ATG;

	/**
	 * The cached value of the '{@link #getNationalite() <em>Nationalite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNationalite()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEntitePolitiqueTrigramme nationalite = NATIONALITE_EDEFAULT;

	/**
	 * This is true if the Nationalite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nationaliteESet;

	/**
	 * The default value of the '{@link #isRadio() <em>Radio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRadio()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RADIO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRadio() <em>Radio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRadio()
	 * @generated
	 * @ordered
	 */
	protected boolean radio = RADIO_EDEFAULT;

	/**
	 * This is true if the Radio attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean radioESet;

	/**
	 * The default value of the '{@link #getPortee() <em>Portee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortee()
	 * @generated
	 * @ordered
	 */
	protected static final long PORTEE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getPortee() <em>Portee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortee()
	 * @generated
	 * @ordered
	 */
	protected long portee = PORTEE_EDEFAULT;

	/**
	 * This is true if the Portee attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean porteeESet;

	/**
	 * The default value of the '{@link #isAffichageCouverture() <em>Affichage Couverture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAffichageCouverture()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AFFICHAGE_COUVERTURE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAffichageCouverture() <em>Affichage Couverture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAffichageCouverture()
	 * @generated
	 * @ordered
	 */
	protected boolean affichageCouverture = AFFICHAGE_COUVERTURE_EDEFAULT;

	/**
	 * This is true if the Affichage Couverture attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean affichageCouvertureESet;

	/**
	 * The default value of the '{@link #isSatellite() <em>Satellite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSatellite()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SATELLITE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSatellite() <em>Satellite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSatellite()
	 * @generated
	 * @ordered
	 */
	protected boolean satellite = SATELLITE_EDEFAULT;

	/**
	 * This is true if the Satellite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean satelliteESet;

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
	 * The cached value of the '{@link #getTypeEquipementTypeEquipement() <em>Type Equipement Type Equipement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeEquipementTypeEquipement()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT typeEquipementTypeEquipement;

	/**
	 * The cached value of the '{@link #getLocalisationLocalisation() <em>Localisation Localisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalisationLocalisation()
	 * @generated
	 * @ordered
	 */
	protected TypeLocalisation localisationLocalisation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMoyenCommunicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMoyenCommunication();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifiant() {
		return identifiant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifiant(String newIdentifiant) {
		String oldIdentifiant = identifiant;
		identifiant = newIdentifiant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYEN_COMMUNICATION__IDENTIFIANT, oldIdentifiant, identifiant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEntitePolitiqueTrigramme getNationalite() {
		return nationalite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNationalite(TypeDictionaryDicoEntitePolitiqueTrigramme newNationalite) {
		TypeDictionaryDicoEntitePolitiqueTrigramme oldNationalite = nationalite;
		nationalite = newNationalite == null ? NATIONALITE_EDEFAULT : newNationalite;
		boolean oldNationaliteESet = nationaliteESet;
		nationaliteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYEN_COMMUNICATION__NATIONALITE, oldNationalite, nationalite, !oldNationaliteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNationalite() {
		TypeDictionaryDicoEntitePolitiqueTrigramme oldNationalite = nationalite;
		boolean oldNationaliteESet = nationaliteESet;
		nationalite = NATIONALITE_EDEFAULT;
		nationaliteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MOYEN_COMMUNICATION__NATIONALITE, oldNationalite, NATIONALITE_EDEFAULT, oldNationaliteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNationalite() {
		return nationaliteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRadio() {
		return radio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadio(boolean newRadio) {
		boolean oldRadio = radio;
		radio = newRadio;
		boolean oldRadioESet = radioESet;
		radioESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYEN_COMMUNICATION__RADIO, oldRadio, radio, !oldRadioESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRadio() {
		boolean oldRadio = radio;
		boolean oldRadioESet = radioESet;
		radio = RADIO_EDEFAULT;
		radioESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MOYEN_COMMUNICATION__RADIO, oldRadio, RADIO_EDEFAULT, oldRadioESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRadio() {
		return radioESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getPortee() {
		return portee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortee(long newPortee) {
		long oldPortee = portee;
		portee = newPortee;
		boolean oldPorteeESet = porteeESet;
		porteeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYEN_COMMUNICATION__PORTEE, oldPortee, portee, !oldPorteeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPortee() {
		long oldPortee = portee;
		boolean oldPorteeESet = porteeESet;
		portee = PORTEE_EDEFAULT;
		porteeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MOYEN_COMMUNICATION__PORTEE, oldPortee, PORTEE_EDEFAULT, oldPorteeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPortee() {
		return porteeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAffichageCouverture() {
		return affichageCouverture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAffichageCouverture(boolean newAffichageCouverture) {
		boolean oldAffichageCouverture = affichageCouverture;
		affichageCouverture = newAffichageCouverture;
		boolean oldAffichageCouvertureESet = affichageCouvertureESet;
		affichageCouvertureESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYEN_COMMUNICATION__AFFICHAGE_COUVERTURE, oldAffichageCouverture, affichageCouverture, !oldAffichageCouvertureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAffichageCouverture() {
		boolean oldAffichageCouverture = affichageCouverture;
		boolean oldAffichageCouvertureESet = affichageCouvertureESet;
		affichageCouverture = AFFICHAGE_COUVERTURE_EDEFAULT;
		affichageCouvertureESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MOYEN_COMMUNICATION__AFFICHAGE_COUVERTURE, oldAffichageCouverture, AFFICHAGE_COUVERTURE_EDEFAULT, oldAffichageCouvertureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAffichageCouverture() {
		return affichageCouvertureESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSatellite() {
		return satellite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSatellite(boolean newSatellite) {
		boolean oldSatellite = satellite;
		satellite = newSatellite;
		boolean oldSatelliteESet = satelliteESet;
		satelliteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYEN_COMMUNICATION__SATELLITE, oldSatellite, satellite, !oldSatelliteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSatellite() {
		boolean oldSatellite = satellite;
		boolean oldSatelliteESet = satelliteESet;
		satellite = SATELLITE_EDEFAULT;
		satelliteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MOYEN_COMMUNICATION__SATELLITE, oldSatellite, SATELLITE_EDEFAULT, oldSatelliteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSatellite() {
		return satelliteESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYEN_COMMUNICATION__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYEN_COMMUNICATION__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getTypeEquipementTypeEquipement() {
		return typeEquipementTypeEquipement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeEquipementTypeEquipement(TypeAssociationEXT newTypeEquipementTypeEquipement, NotificationChain msgs) {
		TypeAssociationEXT oldTypeEquipementTypeEquipement = typeEquipementTypeEquipement;
		typeEquipementTypeEquipement = newTypeEquipementTypeEquipement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYEN_COMMUNICATION__TYPE_EQUIPEMENT_TYPE_EQUIPEMENT, oldTypeEquipementTypeEquipement, newTypeEquipementTypeEquipement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeEquipementTypeEquipement(TypeAssociationEXT newTypeEquipementTypeEquipement) {
		if (newTypeEquipementTypeEquipement != typeEquipementTypeEquipement) {
			NotificationChain msgs = null;
			if (typeEquipementTypeEquipement != null)
				msgs = ((InternalEObject)typeEquipementTypeEquipement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MOYEN_COMMUNICATION__TYPE_EQUIPEMENT_TYPE_EQUIPEMENT, null, msgs);
			if (newTypeEquipementTypeEquipement != null)
				msgs = ((InternalEObject)newTypeEquipementTypeEquipement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MOYEN_COMMUNICATION__TYPE_EQUIPEMENT_TYPE_EQUIPEMENT, null, msgs);
			msgs = basicSetTypeEquipementTypeEquipement(newTypeEquipementTypeEquipement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYEN_COMMUNICATION__TYPE_EQUIPEMENT_TYPE_EQUIPEMENT, newTypeEquipementTypeEquipement, newTypeEquipementTypeEquipement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeLocalisation getLocalisationLocalisation() {
		return localisationLocalisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalisationLocalisation(TypeLocalisation newLocalisationLocalisation, NotificationChain msgs) {
		TypeLocalisation oldLocalisationLocalisation = localisationLocalisation;
		localisationLocalisation = newLocalisationLocalisation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYEN_COMMUNICATION__LOCALISATION_LOCALISATION, oldLocalisationLocalisation, newLocalisationLocalisation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalisationLocalisation(TypeLocalisation newLocalisationLocalisation) {
		if (newLocalisationLocalisation != localisationLocalisation) {
			NotificationChain msgs = null;
			if (localisationLocalisation != null)
				msgs = ((InternalEObject)localisationLocalisation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MOYEN_COMMUNICATION__LOCALISATION_LOCALISATION, null, msgs);
			if (newLocalisationLocalisation != null)
				msgs = ((InternalEObject)newLocalisationLocalisation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MOYEN_COMMUNICATION__LOCALISATION_LOCALISATION, null, msgs);
			msgs = basicSetLocalisationLocalisation(newLocalisationLocalisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYEN_COMMUNICATION__LOCALISATION_LOCALISATION, newLocalisationLocalisation, newLocalisationLocalisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MOYEN_COMMUNICATION__TYPE_EQUIPEMENT_TYPE_EQUIPEMENT:
				return basicSetTypeEquipementTypeEquipement(null, msgs);
			case SchemaPackage.TYPE_MOYEN_COMMUNICATION__LOCALISATION_LOCALISATION:
				return basicSetLocalisationLocalisation(null, msgs);
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
			case SchemaPackage.TYPE_MOYEN_COMMUNICATION__IDENTIFIANT:
				return getIdentifiant();
			case SchemaPackage.TYPE_MOYEN_COMMUNICATION__NATIONALITE:
				return getNationalite();
			case SchemaPackage.TYPE_MOYEN_COMMUNICATION__RADIO:
				return isRadio() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_MOYEN_COMMUNICATION__PORTEE:
				return new Long(getPortee());
			case SchemaPackage.TYPE_MOYEN_COMMUNICATION__AFFICHAGE_COUVERTURE:
				return isAffichageCouverture() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_MOYEN_COMMUNICATION__SATELLITE:
				return isSatellite() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_MOYEN_COMMUNICATION__CTE:
				return getCTE();
			case SchemaPackage.TYPE_MOYEN_COMMUNICATION__CE:
				return getCE();
			case SchemaPackage.TYPE_MOYEN_COMMUNICATION__TYPE_EQUIPEMENT_TYPE_EQUIPEMENT:
				return getTypeEquipementTypeEquipement();
			case SchemaPackage.TYPE_MOYEN_COMMUNICATION__LOCALISATION_LOCALISATION:
				return getLocalisationLocalisation();
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
			case SchemaPackage.TYPE_MOYEN_COMMUNICATION__IDENTIFIANT:
				setIdentifiant((String)newValue);
				return;
			case SchemaPackage.TYPE_MOYEN_COMMUNICATION__NATIONALITE:
				setNationalite((TypeDictionaryDicoEntitePolitiqueTrigramme)newValue);
				return;
			case SchemaPackage.TYPE_MOYEN_COMMUNICATION__RADIO:
				setRadio(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_MOYEN_COMMUNICATION__PORTEE:
				setPortee(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_MOYEN_COMMUNICATION__AFFICHAGE_COUVERTURE:
				setAffichageCouverture(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_MOYEN_COMMUNICATION__SATELLITE:
				setSatellite(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_MOYEN_COMMUNICATION__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_MOYEN_COMMUNICATION__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_MOYEN_COMMUNICATION__TYPE_EQUIPEMENT_TYPE_EQUIPEMENT:
				setTypeEquipementTypeEquipement((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_MOYEN_COMMUNICATION__LOCALISATION_LOCALISATION:
				setLocalisationLocalisation((TypeLocalisation)newValue);
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
			case SchemaPackage.TYPE_MOYEN_COMMUNICATION__IDENTIFIANT:
				setIdentifiant(IDENTIFIANT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MOYEN_COMMUNICATION__NATIONALITE:
				unsetNationalite();
				return;
			case SchemaPackage.TYPE_MOYEN_COMMUNICATION__RADIO:
				unsetRadio();
				return;
			case SchemaPackage.TYPE_MOYEN_COMMUNICATION__PORTEE:
				unsetPortee();
				return;
			case SchemaPackage.TYPE_MOYEN_COMMUNICATION__AFFICHAGE_COUVERTURE:
				unsetAffichageCouverture();
				return;
			case SchemaPackage.TYPE_MOYEN_COMMUNICATION__SATELLITE:
				unsetSatellite();
				return;
			case SchemaPackage.TYPE_MOYEN_COMMUNICATION__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MOYEN_COMMUNICATION__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MOYEN_COMMUNICATION__TYPE_EQUIPEMENT_TYPE_EQUIPEMENT:
				setTypeEquipementTypeEquipement((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_MOYEN_COMMUNICATION__LOCALISATION_LOCALISATION:
				setLocalisationLocalisation((TypeLocalisation)null);
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
			case SchemaPackage.TYPE_MOYEN_COMMUNICATION__IDENTIFIANT:
				return IDENTIFIANT_EDEFAULT == null ? identifiant != null : !IDENTIFIANT_EDEFAULT.equals(identifiant);
			case SchemaPackage.TYPE_MOYEN_COMMUNICATION__NATIONALITE:
				return isSetNationalite();
			case SchemaPackage.TYPE_MOYEN_COMMUNICATION__RADIO:
				return isSetRadio();
			case SchemaPackage.TYPE_MOYEN_COMMUNICATION__PORTEE:
				return isSetPortee();
			case SchemaPackage.TYPE_MOYEN_COMMUNICATION__AFFICHAGE_COUVERTURE:
				return isSetAffichageCouverture();
			case SchemaPackage.TYPE_MOYEN_COMMUNICATION__SATELLITE:
				return isSetSatellite();
			case SchemaPackage.TYPE_MOYEN_COMMUNICATION__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_MOYEN_COMMUNICATION__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_MOYEN_COMMUNICATION__TYPE_EQUIPEMENT_TYPE_EQUIPEMENT:
				return typeEquipementTypeEquipement != null;
			case SchemaPackage.TYPE_MOYEN_COMMUNICATION__LOCALISATION_LOCALISATION:
				return localisationLocalisation != null;
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
		result.append(" (identifiant: ");
		result.append(identifiant);
		result.append(", nationalite: ");
		if (nationaliteESet) result.append(nationalite); else result.append("<unset>");
		result.append(", radio: ");
		if (radioESet) result.append(radio); else result.append("<unset>");
		result.append(", portee: ");
		if (porteeESet) result.append(portee); else result.append("<unset>");
		result.append(", affichageCouverture: ");
		if (affichageCouvertureESet) result.append(affichageCouverture); else result.append("<unset>");
		result.append(", satellite: ");
		if (satelliteESet) result.append(satellite); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeMoyenCommunicationImpl
