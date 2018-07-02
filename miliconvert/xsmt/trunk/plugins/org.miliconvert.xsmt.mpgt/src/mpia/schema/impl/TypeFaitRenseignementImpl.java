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
import mpia.schema.TypeDictionaryDicoFaitRenseignementDomaine;
import mpia.schema.TypeFaitRenseignement;
import mpia.schema.TypeNatureInformations;

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
 * An implementation of the model object '<em><b>Type Fait Renseignement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeFaitRenseignementImpl#getDomaine <em>Domaine</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeFaitRenseignementImpl#getDescriptionOuElementRecherche <em>Description Ou Element Recherche</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeFaitRenseignementImpl#getNumeroVersion <em>Numero Version</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeFaitRenseignementImpl#isRDII <em>RDII</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeFaitRenseignementImpl#getIndices <em>Indices</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeFaitRenseignementImpl#getACommeNatureInformationsARechercherNatureInformations <em>AComme Nature Informations ARechercher Nature Informations</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeFaitRenseignementImpl#getACommeAutoriteInteresseeUnite <em>AComme Autorite Interessee Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeFaitRenseignementImpl#getCorrespondAuBesoinEnRenseignementsBesoinsEnRenseignements <em>Correspond Au Besoin En Renseignements Besoins En Renseignements</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeFaitRenseignementImpl#getCorrespondAMissionMission <em>Correspond AMission Mission</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeFaitRenseignementImpl#getACommeObservationObservation <em>AComme Observation Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeFaitRenseignementImpl extends TypeRacineOperationnelleImpl implements TypeFaitRenseignement {
	/**
	 * The default value of the '{@link #getDomaine() <em>Domaine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomaine()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoFaitRenseignementDomaine DOMAINE_EDEFAULT = TypeDictionaryDicoFaitRenseignementDomaine.FORCE;

	/**
	 * The cached value of the '{@link #getDomaine() <em>Domaine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomaine()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoFaitRenseignementDomaine domaine = DOMAINE_EDEFAULT;

	/**
	 * This is true if the Domaine attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean domaineESet;

	/**
	 * The default value of the '{@link #getDescriptionOuElementRecherche() <em>Description Ou Element Recherche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionOuElementRecherche()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_OU_ELEMENT_RECHERCHE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescriptionOuElementRecherche() <em>Description Ou Element Recherche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionOuElementRecherche()
	 * @generated
	 * @ordered
	 */
	protected String descriptionOuElementRecherche = DESCRIPTION_OU_ELEMENT_RECHERCHE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumeroVersion() <em>Numero Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMERO_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumeroVersion() <em>Numero Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroVersion()
	 * @generated
	 * @ordered
	 */
	protected String numeroVersion = NUMERO_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #isRDII() <em>RDII</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRDII()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RDII_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRDII() <em>RDII</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRDII()
	 * @generated
	 * @ordered
	 */
	protected boolean rDII = RDII_EDEFAULT;

	/**
	 * This is true if the RDII attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rDIIESet;

	/**
	 * The default value of the '{@link #getIndices() <em>Indices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndices()
	 * @generated
	 * @ordered
	 */
	protected static final String INDICES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndices() <em>Indices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndices()
	 * @generated
	 * @ordered
	 */
	protected String indices = INDICES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getACommeNatureInformationsARechercherNatureInformations() <em>AComme Nature Informations ARechercher Nature Informations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeNatureInformationsARechercherNatureInformations()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeNatureInformations> aCommeNatureInformationsARechercherNatureInformations;

	/**
	 * The cached value of the '{@link #getACommeAutoriteInteresseeUnite() <em>AComme Autorite Interessee Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeAutoriteInteresseeUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociationEXT> aCommeAutoriteInteresseeUnite;

	/**
	 * The cached value of the '{@link #getCorrespondAuBesoinEnRenseignementsBesoinsEnRenseignements() <em>Correspond Au Besoin En Renseignements Besoins En Renseignements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrespondAuBesoinEnRenseignementsBesoinsEnRenseignements()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation correspondAuBesoinEnRenseignementsBesoinsEnRenseignements;

	/**
	 * The cached value of the '{@link #getCorrespondAMissionMission() <em>Correspond AMission Mission</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrespondAMissionMission()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> correspondAMissionMission;

	/**
	 * The cached value of the '{@link #getACommeObservationObservation() <em>AComme Observation Observation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeObservationObservation()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aCommeObservationObservation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeFaitRenseignementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeFaitRenseignement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoFaitRenseignementDomaine getDomaine() {
		return domaine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomaine(TypeDictionaryDicoFaitRenseignementDomaine newDomaine) {
		TypeDictionaryDicoFaitRenseignementDomaine oldDomaine = domaine;
		domaine = newDomaine == null ? DOMAINE_EDEFAULT : newDomaine;
		boolean oldDomaineESet = domaineESet;
		domaineESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__DOMAINE, oldDomaine, domaine, !oldDomaineESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDomaine() {
		TypeDictionaryDicoFaitRenseignementDomaine oldDomaine = domaine;
		boolean oldDomaineESet = domaineESet;
		domaine = DOMAINE_EDEFAULT;
		domaineESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__DOMAINE, oldDomaine, DOMAINE_EDEFAULT, oldDomaineESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDomaine() {
		return domaineESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescriptionOuElementRecherche() {
		return descriptionOuElementRecherche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptionOuElementRecherche(String newDescriptionOuElementRecherche) {
		String oldDescriptionOuElementRecherche = descriptionOuElementRecherche;
		descriptionOuElementRecherche = newDescriptionOuElementRecherche;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__DESCRIPTION_OU_ELEMENT_RECHERCHE, oldDescriptionOuElementRecherche, descriptionOuElementRecherche));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumeroVersion() {
		return numeroVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroVersion(String newNumeroVersion) {
		String oldNumeroVersion = numeroVersion;
		numeroVersion = newNumeroVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__NUMERO_VERSION, oldNumeroVersion, numeroVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRDII() {
		return rDII;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRDII(boolean newRDII) {
		boolean oldRDII = rDII;
		rDII = newRDII;
		boolean oldRDIIESet = rDIIESet;
		rDIIESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__RDII, oldRDII, rDII, !oldRDIIESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRDII() {
		boolean oldRDII = rDII;
		boolean oldRDIIESet = rDIIESet;
		rDII = RDII_EDEFAULT;
		rDIIESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__RDII, oldRDII, RDII_EDEFAULT, oldRDIIESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRDII() {
		return rDIIESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIndices() {
		return indices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndices(String newIndices) {
		String oldIndices = indices;
		indices = newIndices;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__INDICES, oldIndices, indices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeNatureInformations> getACommeNatureInformationsARechercherNatureInformations() {
		if (aCommeNatureInformationsARechercherNatureInformations == null) {
			aCommeNatureInformationsARechercherNatureInformations = new EObjectContainmentEList<TypeNatureInformations>(TypeNatureInformations.class, this, SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__ACOMME_NATURE_INFORMATIONS_ARECHERCHER_NATURE_INFORMATIONS);
		}
		return aCommeNatureInformationsARechercherNatureInformations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEXT> getACommeAutoriteInteresseeUnite() {
		if (aCommeAutoriteInteresseeUnite == null) {
			aCommeAutoriteInteresseeUnite = new EObjectContainmentEList<TypeAssociationEXT>(TypeAssociationEXT.class, this, SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__ACOMME_AUTORITE_INTERESSEE_UNITE);
		}
		return aCommeAutoriteInteresseeUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getCorrespondAuBesoinEnRenseignementsBesoinsEnRenseignements() {
		return correspondAuBesoinEnRenseignementsBesoinsEnRenseignements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorrespondAuBesoinEnRenseignementsBesoinsEnRenseignements(TypeAssociation newCorrespondAuBesoinEnRenseignementsBesoinsEnRenseignements, NotificationChain msgs) {
		TypeAssociation oldCorrespondAuBesoinEnRenseignementsBesoinsEnRenseignements = correspondAuBesoinEnRenseignementsBesoinsEnRenseignements;
		correspondAuBesoinEnRenseignementsBesoinsEnRenseignements = newCorrespondAuBesoinEnRenseignementsBesoinsEnRenseignements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__CORRESPOND_AU_BESOIN_EN_RENSEIGNEMENTS_BESOINS_EN_RENSEIGNEMENTS, oldCorrespondAuBesoinEnRenseignementsBesoinsEnRenseignements, newCorrespondAuBesoinEnRenseignementsBesoinsEnRenseignements);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrespondAuBesoinEnRenseignementsBesoinsEnRenseignements(TypeAssociation newCorrespondAuBesoinEnRenseignementsBesoinsEnRenseignements) {
		if (newCorrespondAuBesoinEnRenseignementsBesoinsEnRenseignements != correspondAuBesoinEnRenseignementsBesoinsEnRenseignements) {
			NotificationChain msgs = null;
			if (correspondAuBesoinEnRenseignementsBesoinsEnRenseignements != null)
				msgs = ((InternalEObject)correspondAuBesoinEnRenseignementsBesoinsEnRenseignements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__CORRESPOND_AU_BESOIN_EN_RENSEIGNEMENTS_BESOINS_EN_RENSEIGNEMENTS, null, msgs);
			if (newCorrespondAuBesoinEnRenseignementsBesoinsEnRenseignements != null)
				msgs = ((InternalEObject)newCorrespondAuBesoinEnRenseignementsBesoinsEnRenseignements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__CORRESPOND_AU_BESOIN_EN_RENSEIGNEMENTS_BESOINS_EN_RENSEIGNEMENTS, null, msgs);
			msgs = basicSetCorrespondAuBesoinEnRenseignementsBesoinsEnRenseignements(newCorrespondAuBesoinEnRenseignementsBesoinsEnRenseignements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__CORRESPOND_AU_BESOIN_EN_RENSEIGNEMENTS_BESOINS_EN_RENSEIGNEMENTS, newCorrespondAuBesoinEnRenseignementsBesoinsEnRenseignements, newCorrespondAuBesoinEnRenseignementsBesoinsEnRenseignements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getCorrespondAMissionMission() {
		if (correspondAMissionMission == null) {
			correspondAMissionMission = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__CORRESPOND_AMISSION_MISSION);
		}
		return correspondAMissionMission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getACommeObservationObservation() {
		if (aCommeObservationObservation == null) {
			aCommeObservationObservation = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__ACOMME_OBSERVATION_OBSERVATION);
		}
		return aCommeObservationObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__ACOMME_NATURE_INFORMATIONS_ARECHERCHER_NATURE_INFORMATIONS:
				return ((InternalEList<?>)getACommeNatureInformationsARechercherNatureInformations()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__ACOMME_AUTORITE_INTERESSEE_UNITE:
				return ((InternalEList<?>)getACommeAutoriteInteresseeUnite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__CORRESPOND_AU_BESOIN_EN_RENSEIGNEMENTS_BESOINS_EN_RENSEIGNEMENTS:
				return basicSetCorrespondAuBesoinEnRenseignementsBesoinsEnRenseignements(null, msgs);
			case SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__CORRESPOND_AMISSION_MISSION:
				return ((InternalEList<?>)getCorrespondAMissionMission()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__ACOMME_OBSERVATION_OBSERVATION:
				return ((InternalEList<?>)getACommeObservationObservation()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__DOMAINE:
				return getDomaine();
			case SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__DESCRIPTION_OU_ELEMENT_RECHERCHE:
				return getDescriptionOuElementRecherche();
			case SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__NUMERO_VERSION:
				return getNumeroVersion();
			case SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__RDII:
				return isRDII() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__INDICES:
				return getIndices();
			case SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__ACOMME_NATURE_INFORMATIONS_ARECHERCHER_NATURE_INFORMATIONS:
				return getACommeNatureInformationsARechercherNatureInformations();
			case SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__ACOMME_AUTORITE_INTERESSEE_UNITE:
				return getACommeAutoriteInteresseeUnite();
			case SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__CORRESPOND_AU_BESOIN_EN_RENSEIGNEMENTS_BESOINS_EN_RENSEIGNEMENTS:
				return getCorrespondAuBesoinEnRenseignementsBesoinsEnRenseignements();
			case SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__CORRESPOND_AMISSION_MISSION:
				return getCorrespondAMissionMission();
			case SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__ACOMME_OBSERVATION_OBSERVATION:
				return getACommeObservationObservation();
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
			case SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__DOMAINE:
				setDomaine((TypeDictionaryDicoFaitRenseignementDomaine)newValue);
				return;
			case SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__DESCRIPTION_OU_ELEMENT_RECHERCHE:
				setDescriptionOuElementRecherche((String)newValue);
				return;
			case SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__NUMERO_VERSION:
				setNumeroVersion((String)newValue);
				return;
			case SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__RDII:
				setRDII(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__INDICES:
				setIndices((String)newValue);
				return;
			case SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__ACOMME_NATURE_INFORMATIONS_ARECHERCHER_NATURE_INFORMATIONS:
				getACommeNatureInformationsARechercherNatureInformations().clear();
				getACommeNatureInformationsARechercherNatureInformations().addAll((Collection<? extends TypeNatureInformations>)newValue);
				return;
			case SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__ACOMME_AUTORITE_INTERESSEE_UNITE:
				getACommeAutoriteInteresseeUnite().clear();
				getACommeAutoriteInteresseeUnite().addAll((Collection<? extends TypeAssociationEXT>)newValue);
				return;
			case SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__CORRESPOND_AU_BESOIN_EN_RENSEIGNEMENTS_BESOINS_EN_RENSEIGNEMENTS:
				setCorrespondAuBesoinEnRenseignementsBesoinsEnRenseignements((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__CORRESPOND_AMISSION_MISSION:
				getCorrespondAMissionMission().clear();
				getCorrespondAMissionMission().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__ACOMME_OBSERVATION_OBSERVATION:
				getACommeObservationObservation().clear();
				getACommeObservationObservation().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__DOMAINE:
				unsetDomaine();
				return;
			case SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__DESCRIPTION_OU_ELEMENT_RECHERCHE:
				setDescriptionOuElementRecherche(DESCRIPTION_OU_ELEMENT_RECHERCHE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__NUMERO_VERSION:
				setNumeroVersion(NUMERO_VERSION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__RDII:
				unsetRDII();
				return;
			case SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__INDICES:
				setIndices(INDICES_EDEFAULT);
				return;
			case SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__ACOMME_NATURE_INFORMATIONS_ARECHERCHER_NATURE_INFORMATIONS:
				getACommeNatureInformationsARechercherNatureInformations().clear();
				return;
			case SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__ACOMME_AUTORITE_INTERESSEE_UNITE:
				getACommeAutoriteInteresseeUnite().clear();
				return;
			case SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__CORRESPOND_AU_BESOIN_EN_RENSEIGNEMENTS_BESOINS_EN_RENSEIGNEMENTS:
				setCorrespondAuBesoinEnRenseignementsBesoinsEnRenseignements((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__CORRESPOND_AMISSION_MISSION:
				getCorrespondAMissionMission().clear();
				return;
			case SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__ACOMME_OBSERVATION_OBSERVATION:
				getACommeObservationObservation().clear();
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
			case SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__DOMAINE:
				return isSetDomaine();
			case SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__DESCRIPTION_OU_ELEMENT_RECHERCHE:
				return DESCRIPTION_OU_ELEMENT_RECHERCHE_EDEFAULT == null ? descriptionOuElementRecherche != null : !DESCRIPTION_OU_ELEMENT_RECHERCHE_EDEFAULT.equals(descriptionOuElementRecherche);
			case SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__NUMERO_VERSION:
				return NUMERO_VERSION_EDEFAULT == null ? numeroVersion != null : !NUMERO_VERSION_EDEFAULT.equals(numeroVersion);
			case SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__RDII:
				return isSetRDII();
			case SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__INDICES:
				return INDICES_EDEFAULT == null ? indices != null : !INDICES_EDEFAULT.equals(indices);
			case SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__ACOMME_NATURE_INFORMATIONS_ARECHERCHER_NATURE_INFORMATIONS:
				return aCommeNatureInformationsARechercherNatureInformations != null && !aCommeNatureInformationsARechercherNatureInformations.isEmpty();
			case SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__ACOMME_AUTORITE_INTERESSEE_UNITE:
				return aCommeAutoriteInteresseeUnite != null && !aCommeAutoriteInteresseeUnite.isEmpty();
			case SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__CORRESPOND_AU_BESOIN_EN_RENSEIGNEMENTS_BESOINS_EN_RENSEIGNEMENTS:
				return correspondAuBesoinEnRenseignementsBesoinsEnRenseignements != null;
			case SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__CORRESPOND_AMISSION_MISSION:
				return correspondAMissionMission != null && !correspondAMissionMission.isEmpty();
			case SchemaPackage.TYPE_FAIT_RENSEIGNEMENT__ACOMME_OBSERVATION_OBSERVATION:
				return aCommeObservationObservation != null && !aCommeObservationObservation.isEmpty();
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
		result.append(" (domaine: ");
		if (domaineESet) result.append(domaine); else result.append("<unset>");
		result.append(", descriptionOuElementRecherche: ");
		result.append(descriptionOuElementRecherche);
		result.append(", numeroVersion: ");
		result.append(numeroVersion);
		result.append(", rDII: ");
		if (rDIIESet) result.append(rDII); else result.append("<unset>");
		result.append(", indices: ");
		result.append(indices);
		result.append(')');
		return result.toString();
	}

} //TypeFaitRenseignementImpl
