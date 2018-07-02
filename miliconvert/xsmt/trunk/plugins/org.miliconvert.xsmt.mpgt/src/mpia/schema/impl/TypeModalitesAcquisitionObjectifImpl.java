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
import mpia.meta.TypeAssociationEXT;
import mpia.meta.TypeDataTypeLongueur;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoRapportExactitude;
import mpia.schema.TypeEngagementAvecDelegation;
import mpia.schema.TypeModalitesAcquisitionObjectif;

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
 * An implementation of the model object '<em><b>Type Modalites Acquisition Objectif</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeModalitesAcquisitionObjectifImpl#getDateAquisition <em>Date Aquisition</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModalitesAcquisitionObjectifImpl#getNombreMinimumCRaTransmettre <em>Nombre Minimum CRa Transmettre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModalitesAcquisitionObjectifImpl#getPrecisionLocalisationDemandee <em>Precision Localisation Demandee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModalitesAcquisitionObjectifImpl#getFiabiliteIdentification <em>Fiabilite Identification</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModalitesAcquisitionObjectifImpl#getAutresMesuresCoordination <em>Autres Mesures Coordination</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModalitesAcquisitionObjectifImpl#getAPourZoneRechercheAutreElementControle <em>APour Zone Recherche Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModalitesAcquisitionObjectifImpl#getAPourConditionsEngagementEngagementAvecDelegation <em>APour Conditions Engagement Engagement Avec Delegation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModalitesAcquisitionObjectifImpl#getAPourResponsableSynthesesUnite <em>APour Responsable Syntheses Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeModalitesAcquisitionObjectifImpl extends EObjectImpl implements TypeModalitesAcquisitionObjectif {
	/**
	 * The default value of the '{@link #getDateAquisition() <em>Date Aquisition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateAquisition()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_AQUISITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateAquisition() <em>Date Aquisition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateAquisition()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateAquisition = DATE_AQUISITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNombreMinimumCRaTransmettre() <em>Nombre Minimum CRa Transmettre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreMinimumCRaTransmettre()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_MINIMUM_CRA_TRANSMETTRE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreMinimumCRaTransmettre() <em>Nombre Minimum CRa Transmettre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreMinimumCRaTransmettre()
	 * @generated
	 * @ordered
	 */
	protected long nombreMinimumCRaTransmettre = NOMBRE_MINIMUM_CRA_TRANSMETTRE_EDEFAULT;

	/**
	 * This is true if the Nombre Minimum CRa Transmettre attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreMinimumCRaTransmettreESet;

	/**
	 * The cached value of the '{@link #getPrecisionLocalisationDemandee() <em>Precision Localisation Demandee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecisionLocalisationDemandee()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur precisionLocalisationDemandee;

	/**
	 * The default value of the '{@link #getFiabiliteIdentification() <em>Fiabilite Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiabiliteIdentification()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoRapportExactitude FIABILITE_IDENTIFICATION_EDEFAULT = TypeDictionaryDicoRapportExactitude._1;

	/**
	 * The cached value of the '{@link #getFiabiliteIdentification() <em>Fiabilite Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiabiliteIdentification()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoRapportExactitude fiabiliteIdentification = FIABILITE_IDENTIFICATION_EDEFAULT;

	/**
	 * This is true if the Fiabilite Identification attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fiabiliteIdentificationESet;

	/**
	 * The default value of the '{@link #getAutresMesuresCoordination() <em>Autres Mesures Coordination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutresMesuresCoordination()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTRES_MESURES_COORDINATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutresMesuresCoordination() <em>Autres Mesures Coordination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutresMesuresCoordination()
	 * @generated
	 * @ordered
	 */
	protected String autresMesuresCoordination = AUTRES_MESURES_COORDINATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAPourZoneRechercheAutreElementControle() <em>APour Zone Recherche Autre Element Controle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourZoneRechercheAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourZoneRechercheAutreElementControle;

	/**
	 * The cached value of the '{@link #getAPourConditionsEngagementEngagementAvecDelegation() <em>APour Conditions Engagement Engagement Avec Delegation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourConditionsEngagementEngagementAvecDelegation()
	 * @generated
	 * @ordered
	 */
	protected TypeEngagementAvecDelegation aPourConditionsEngagementEngagementAvecDelegation;

	/**
	 * The cached value of the '{@link #getAPourResponsableSynthesesUnite() <em>APour Responsable Syntheses Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourResponsableSynthesesUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourResponsableSynthesesUnite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeModalitesAcquisitionObjectifImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeModalitesAcquisitionObjectif();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateAquisition() {
		return dateAquisition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateAquisition(XMLGregorianCalendar newDateAquisition) {
		XMLGregorianCalendar oldDateAquisition = dateAquisition;
		dateAquisition = newDateAquisition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__DATE_AQUISITION, oldDateAquisition, dateAquisition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreMinimumCRaTransmettre() {
		return nombreMinimumCRaTransmettre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreMinimumCRaTransmettre(long newNombreMinimumCRaTransmettre) {
		long oldNombreMinimumCRaTransmettre = nombreMinimumCRaTransmettre;
		nombreMinimumCRaTransmettre = newNombreMinimumCRaTransmettre;
		boolean oldNombreMinimumCRaTransmettreESet = nombreMinimumCRaTransmettreESet;
		nombreMinimumCRaTransmettreESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__NOMBRE_MINIMUM_CRA_TRANSMETTRE, oldNombreMinimumCRaTransmettre, nombreMinimumCRaTransmettre, !oldNombreMinimumCRaTransmettreESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreMinimumCRaTransmettre() {
		long oldNombreMinimumCRaTransmettre = nombreMinimumCRaTransmettre;
		boolean oldNombreMinimumCRaTransmettreESet = nombreMinimumCRaTransmettreESet;
		nombreMinimumCRaTransmettre = NOMBRE_MINIMUM_CRA_TRANSMETTRE_EDEFAULT;
		nombreMinimumCRaTransmettreESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__NOMBRE_MINIMUM_CRA_TRANSMETTRE, oldNombreMinimumCRaTransmettre, NOMBRE_MINIMUM_CRA_TRANSMETTRE_EDEFAULT, oldNombreMinimumCRaTransmettreESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreMinimumCRaTransmettre() {
		return nombreMinimumCRaTransmettreESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getPrecisionLocalisationDemandee() {
		return precisionLocalisationDemandee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrecisionLocalisationDemandee(TypeDataTypeLongueur newPrecisionLocalisationDemandee, NotificationChain msgs) {
		TypeDataTypeLongueur oldPrecisionLocalisationDemandee = precisionLocalisationDemandee;
		precisionLocalisationDemandee = newPrecisionLocalisationDemandee;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__PRECISION_LOCALISATION_DEMANDEE, oldPrecisionLocalisationDemandee, newPrecisionLocalisationDemandee);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecisionLocalisationDemandee(TypeDataTypeLongueur newPrecisionLocalisationDemandee) {
		if (newPrecisionLocalisationDemandee != precisionLocalisationDemandee) {
			NotificationChain msgs = null;
			if (precisionLocalisationDemandee != null)
				msgs = ((InternalEObject)precisionLocalisationDemandee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__PRECISION_LOCALISATION_DEMANDEE, null, msgs);
			if (newPrecisionLocalisationDemandee != null)
				msgs = ((InternalEObject)newPrecisionLocalisationDemandee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__PRECISION_LOCALISATION_DEMANDEE, null, msgs);
			msgs = basicSetPrecisionLocalisationDemandee(newPrecisionLocalisationDemandee, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__PRECISION_LOCALISATION_DEMANDEE, newPrecisionLocalisationDemandee, newPrecisionLocalisationDemandee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoRapportExactitude getFiabiliteIdentification() {
		return fiabiliteIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFiabiliteIdentification(TypeDictionaryDicoRapportExactitude newFiabiliteIdentification) {
		TypeDictionaryDicoRapportExactitude oldFiabiliteIdentification = fiabiliteIdentification;
		fiabiliteIdentification = newFiabiliteIdentification == null ? FIABILITE_IDENTIFICATION_EDEFAULT : newFiabiliteIdentification;
		boolean oldFiabiliteIdentificationESet = fiabiliteIdentificationESet;
		fiabiliteIdentificationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__FIABILITE_IDENTIFICATION, oldFiabiliteIdentification, fiabiliteIdentification, !oldFiabiliteIdentificationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFiabiliteIdentification() {
		TypeDictionaryDicoRapportExactitude oldFiabiliteIdentification = fiabiliteIdentification;
		boolean oldFiabiliteIdentificationESet = fiabiliteIdentificationESet;
		fiabiliteIdentification = FIABILITE_IDENTIFICATION_EDEFAULT;
		fiabiliteIdentificationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__FIABILITE_IDENTIFICATION, oldFiabiliteIdentification, FIABILITE_IDENTIFICATION_EDEFAULT, oldFiabiliteIdentificationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFiabiliteIdentification() {
		return fiabiliteIdentificationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutresMesuresCoordination() {
		return autresMesuresCoordination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutresMesuresCoordination(String newAutresMesuresCoordination) {
		String oldAutresMesuresCoordination = autresMesuresCoordination;
		autresMesuresCoordination = newAutresMesuresCoordination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__AUTRES_MESURES_COORDINATION, oldAutresMesuresCoordination, autresMesuresCoordination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourZoneRechercheAutreElementControle() {
		if (aPourZoneRechercheAutreElementControle == null) {
			aPourZoneRechercheAutreElementControle = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__APOUR_ZONE_RECHERCHE_AUTRE_ELEMENT_CONTROLE);
		}
		return aPourZoneRechercheAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeEngagementAvecDelegation getAPourConditionsEngagementEngagementAvecDelegation() {
		return aPourConditionsEngagementEngagementAvecDelegation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourConditionsEngagementEngagementAvecDelegation(TypeEngagementAvecDelegation newAPourConditionsEngagementEngagementAvecDelegation, NotificationChain msgs) {
		TypeEngagementAvecDelegation oldAPourConditionsEngagementEngagementAvecDelegation = aPourConditionsEngagementEngagementAvecDelegation;
		aPourConditionsEngagementEngagementAvecDelegation = newAPourConditionsEngagementEngagementAvecDelegation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__APOUR_CONDITIONS_ENGAGEMENT_ENGAGEMENT_AVEC_DELEGATION, oldAPourConditionsEngagementEngagementAvecDelegation, newAPourConditionsEngagementEngagementAvecDelegation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourConditionsEngagementEngagementAvecDelegation(TypeEngagementAvecDelegation newAPourConditionsEngagementEngagementAvecDelegation) {
		if (newAPourConditionsEngagementEngagementAvecDelegation != aPourConditionsEngagementEngagementAvecDelegation) {
			NotificationChain msgs = null;
			if (aPourConditionsEngagementEngagementAvecDelegation != null)
				msgs = ((InternalEObject)aPourConditionsEngagementEngagementAvecDelegation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__APOUR_CONDITIONS_ENGAGEMENT_ENGAGEMENT_AVEC_DELEGATION, null, msgs);
			if (newAPourConditionsEngagementEngagementAvecDelegation != null)
				msgs = ((InternalEObject)newAPourConditionsEngagementEngagementAvecDelegation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__APOUR_CONDITIONS_ENGAGEMENT_ENGAGEMENT_AVEC_DELEGATION, null, msgs);
			msgs = basicSetAPourConditionsEngagementEngagementAvecDelegation(newAPourConditionsEngagementEngagementAvecDelegation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__APOUR_CONDITIONS_ENGAGEMENT_ENGAGEMENT_AVEC_DELEGATION, newAPourConditionsEngagementEngagementAvecDelegation, newAPourConditionsEngagementEngagementAvecDelegation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourResponsableSynthesesUnite() {
		return aPourResponsableSynthesesUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourResponsableSynthesesUnite(TypeAssociationEXT newAPourResponsableSynthesesUnite, NotificationChain msgs) {
		TypeAssociationEXT oldAPourResponsableSynthesesUnite = aPourResponsableSynthesesUnite;
		aPourResponsableSynthesesUnite = newAPourResponsableSynthesesUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__APOUR_RESPONSABLE_SYNTHESES_UNITE, oldAPourResponsableSynthesesUnite, newAPourResponsableSynthesesUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourResponsableSynthesesUnite(TypeAssociationEXT newAPourResponsableSynthesesUnite) {
		if (newAPourResponsableSynthesesUnite != aPourResponsableSynthesesUnite) {
			NotificationChain msgs = null;
			if (aPourResponsableSynthesesUnite != null)
				msgs = ((InternalEObject)aPourResponsableSynthesesUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__APOUR_RESPONSABLE_SYNTHESES_UNITE, null, msgs);
			if (newAPourResponsableSynthesesUnite != null)
				msgs = ((InternalEObject)newAPourResponsableSynthesesUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__APOUR_RESPONSABLE_SYNTHESES_UNITE, null, msgs);
			msgs = basicSetAPourResponsableSynthesesUnite(newAPourResponsableSynthesesUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__APOUR_RESPONSABLE_SYNTHESES_UNITE, newAPourResponsableSynthesesUnite, newAPourResponsableSynthesesUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__PRECISION_LOCALISATION_DEMANDEE:
				return basicSetPrecisionLocalisationDemandee(null, msgs);
			case SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__APOUR_ZONE_RECHERCHE_AUTRE_ELEMENT_CONTROLE:
				return ((InternalEList<?>)getAPourZoneRechercheAutreElementControle()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__APOUR_CONDITIONS_ENGAGEMENT_ENGAGEMENT_AVEC_DELEGATION:
				return basicSetAPourConditionsEngagementEngagementAvecDelegation(null, msgs);
			case SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__APOUR_RESPONSABLE_SYNTHESES_UNITE:
				return basicSetAPourResponsableSynthesesUnite(null, msgs);
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
			case SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__DATE_AQUISITION:
				return getDateAquisition();
			case SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__NOMBRE_MINIMUM_CRA_TRANSMETTRE:
				return new Long(getNombreMinimumCRaTransmettre());
			case SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__PRECISION_LOCALISATION_DEMANDEE:
				return getPrecisionLocalisationDemandee();
			case SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__FIABILITE_IDENTIFICATION:
				return getFiabiliteIdentification();
			case SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__AUTRES_MESURES_COORDINATION:
				return getAutresMesuresCoordination();
			case SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__APOUR_ZONE_RECHERCHE_AUTRE_ELEMENT_CONTROLE:
				return getAPourZoneRechercheAutreElementControle();
			case SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__APOUR_CONDITIONS_ENGAGEMENT_ENGAGEMENT_AVEC_DELEGATION:
				return getAPourConditionsEngagementEngagementAvecDelegation();
			case SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__APOUR_RESPONSABLE_SYNTHESES_UNITE:
				return getAPourResponsableSynthesesUnite();
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
			case SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__DATE_AQUISITION:
				setDateAquisition((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__NOMBRE_MINIMUM_CRA_TRANSMETTRE:
				setNombreMinimumCRaTransmettre(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__PRECISION_LOCALISATION_DEMANDEE:
				setPrecisionLocalisationDemandee((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__FIABILITE_IDENTIFICATION:
				setFiabiliteIdentification((TypeDictionaryDicoRapportExactitude)newValue);
				return;
			case SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__AUTRES_MESURES_COORDINATION:
				setAutresMesuresCoordination((String)newValue);
				return;
			case SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__APOUR_ZONE_RECHERCHE_AUTRE_ELEMENT_CONTROLE:
				getAPourZoneRechercheAutreElementControle().clear();
				getAPourZoneRechercheAutreElementControle().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__APOUR_CONDITIONS_ENGAGEMENT_ENGAGEMENT_AVEC_DELEGATION:
				setAPourConditionsEngagementEngagementAvecDelegation((TypeEngagementAvecDelegation)newValue);
				return;
			case SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__APOUR_RESPONSABLE_SYNTHESES_UNITE:
				setAPourResponsableSynthesesUnite((TypeAssociationEXT)newValue);
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
			case SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__DATE_AQUISITION:
				setDateAquisition(DATE_AQUISITION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__NOMBRE_MINIMUM_CRA_TRANSMETTRE:
				unsetNombreMinimumCRaTransmettre();
				return;
			case SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__PRECISION_LOCALISATION_DEMANDEE:
				setPrecisionLocalisationDemandee((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__FIABILITE_IDENTIFICATION:
				unsetFiabiliteIdentification();
				return;
			case SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__AUTRES_MESURES_COORDINATION:
				setAutresMesuresCoordination(AUTRES_MESURES_COORDINATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__APOUR_ZONE_RECHERCHE_AUTRE_ELEMENT_CONTROLE:
				getAPourZoneRechercheAutreElementControle().clear();
				return;
			case SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__APOUR_CONDITIONS_ENGAGEMENT_ENGAGEMENT_AVEC_DELEGATION:
				setAPourConditionsEngagementEngagementAvecDelegation((TypeEngagementAvecDelegation)null);
				return;
			case SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__APOUR_RESPONSABLE_SYNTHESES_UNITE:
				setAPourResponsableSynthesesUnite((TypeAssociationEXT)null);
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
			case SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__DATE_AQUISITION:
				return DATE_AQUISITION_EDEFAULT == null ? dateAquisition != null : !DATE_AQUISITION_EDEFAULT.equals(dateAquisition);
			case SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__NOMBRE_MINIMUM_CRA_TRANSMETTRE:
				return isSetNombreMinimumCRaTransmettre();
			case SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__PRECISION_LOCALISATION_DEMANDEE:
				return precisionLocalisationDemandee != null;
			case SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__FIABILITE_IDENTIFICATION:
				return isSetFiabiliteIdentification();
			case SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__AUTRES_MESURES_COORDINATION:
				return AUTRES_MESURES_COORDINATION_EDEFAULT == null ? autresMesuresCoordination != null : !AUTRES_MESURES_COORDINATION_EDEFAULT.equals(autresMesuresCoordination);
			case SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__APOUR_ZONE_RECHERCHE_AUTRE_ELEMENT_CONTROLE:
				return aPourZoneRechercheAutreElementControle != null && !aPourZoneRechercheAutreElementControle.isEmpty();
			case SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__APOUR_CONDITIONS_ENGAGEMENT_ENGAGEMENT_AVEC_DELEGATION:
				return aPourConditionsEngagementEngagementAvecDelegation != null;
			case SchemaPackage.TYPE_MODALITES_ACQUISITION_OBJECTIF__APOUR_RESPONSABLE_SYNTHESES_UNITE:
				return aPourResponsableSynthesesUnite != null;
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
		result.append(" (dateAquisition: ");
		result.append(dateAquisition);
		result.append(", nombreMinimumCRaTransmettre: ");
		if (nombreMinimumCRaTransmettreESet) result.append(nombreMinimumCRaTransmettre); else result.append("<unset>");
		result.append(", fiabiliteIdentification: ");
		if (fiabiliteIdentificationESet) result.append(fiabiliteIdentification); else result.append("<unset>");
		result.append(", autresMesuresCoordination: ");
		result.append(autresMesuresCoordination);
		result.append(')');
		return result.toString();
	}

} //TypeModalitesAcquisitionObjectifImpl
