/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoEffetTactiqueASS;
import mpia.schema.TypeEngagementAvecDelegation;

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
 * An implementation of the model object '<em><b>Type Engagement Avec Delegation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEngagementAvecDelegationImpl#getEffetRecherche <em>Effet Recherche</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEngagementAvecDelegationImpl#getAutreEffetRecherche <em>Autre Effet Recherche</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEngagementAvecDelegationImpl#getPourcentageDommagesRecherche <em>Pourcentage Dommages Recherche</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEngagementAvecDelegationImpl#getEffetMunition <em>Effet Munition</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEngagementAvecDelegationImpl#getVolumeMoyenTir <em>Volume Moyen Tir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEngagementAvecDelegationImpl#getNombreMaximumDemandeTir <em>Nombre Maximum Demande Tir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEngagementAvecDelegationImpl#getEffetSurEnvironnement <em>Effet Sur Environnement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEngagementAvecDelegationImpl#getAPourMunitionTypeMunition <em>APour Munition Type Munition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEngagementAvecDelegationImpl extends EObjectImpl implements TypeEngagementAvecDelegation {
	/**
	 * The default value of the '{@link #getEffetRecherche() <em>Effet Recherche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffetRecherche()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEffetTactiqueASS EFFET_RECHERCHE_EDEFAULT = TypeDictionaryDicoEffetTactiqueASS.NOS;

	/**
	 * The cached value of the '{@link #getEffetRecherche() <em>Effet Recherche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffetRecherche()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEffetTactiqueASS effetRecherche = EFFET_RECHERCHE_EDEFAULT;

	/**
	 * This is true if the Effet Recherche attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean effetRechercheESet;

	/**
	 * The default value of the '{@link #getAutreEffetRecherche() <em>Autre Effet Recherche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreEffetRecherche()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTRE_EFFET_RECHERCHE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutreEffetRecherche() <em>Autre Effet Recherche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreEffetRecherche()
	 * @generated
	 * @ordered
	 */
	protected String autreEffetRecherche = AUTRE_EFFET_RECHERCHE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPourcentageDommagesRecherche() <em>Pourcentage Dommages Recherche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPourcentageDommagesRecherche()
	 * @generated
	 * @ordered
	 */
	protected static final double POURCENTAGE_DOMMAGES_RECHERCHE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPourcentageDommagesRecherche() <em>Pourcentage Dommages Recherche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPourcentageDommagesRecherche()
	 * @generated
	 * @ordered
	 */
	protected double pourcentageDommagesRecherche = POURCENTAGE_DOMMAGES_RECHERCHE_EDEFAULT;

	/**
	 * This is true if the Pourcentage Dommages Recherche attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pourcentageDommagesRechercheESet;

	/**
	 * The default value of the '{@link #getEffetMunition() <em>Effet Munition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffetMunition()
	 * @generated
	 * @ordered
	 */
	protected static final double EFFET_MUNITION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEffetMunition() <em>Effet Munition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffetMunition()
	 * @generated
	 * @ordered
	 */
	protected double effetMunition = EFFET_MUNITION_EDEFAULT;

	/**
	 * This is true if the Effet Munition attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean effetMunitionESet;

	/**
	 * The default value of the '{@link #getVolumeMoyenTir() <em>Volume Moyen Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeMoyenTir()
	 * @generated
	 * @ordered
	 */
	protected static final long VOLUME_MOYEN_TIR_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getVolumeMoyenTir() <em>Volume Moyen Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeMoyenTir()
	 * @generated
	 * @ordered
	 */
	protected long volumeMoyenTir = VOLUME_MOYEN_TIR_EDEFAULT;

	/**
	 * This is true if the Volume Moyen Tir attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean volumeMoyenTirESet;

	/**
	 * The default value of the '{@link #getNombreMaximumDemandeTir() <em>Nombre Maximum Demande Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreMaximumDemandeTir()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_MAXIMUM_DEMANDE_TIR_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreMaximumDemandeTir() <em>Nombre Maximum Demande Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreMaximumDemandeTir()
	 * @generated
	 * @ordered
	 */
	protected long nombreMaximumDemandeTir = NOMBRE_MAXIMUM_DEMANDE_TIR_EDEFAULT;

	/**
	 * This is true if the Nombre Maximum Demande Tir attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreMaximumDemandeTirESet;

	/**
	 * The default value of the '{@link #getEffetSurEnvironnement() <em>Effet Sur Environnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffetSurEnvironnement()
	 * @generated
	 * @ordered
	 */
	protected static final String EFFET_SUR_ENVIRONNEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEffetSurEnvironnement() <em>Effet Sur Environnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffetSurEnvironnement()
	 * @generated
	 * @ordered
	 */
	protected String effetSurEnvironnement = EFFET_SUR_ENVIRONNEMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAPourMunitionTypeMunition() <em>APour Munition Type Munition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourMunitionTypeMunition()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociationEXT> aPourMunitionTypeMunition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEngagementAvecDelegationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEngagementAvecDelegation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEffetTactiqueASS getEffetRecherche() {
		return effetRecherche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffetRecherche(TypeDictionaryDicoEffetTactiqueASS newEffetRecherche) {
		TypeDictionaryDicoEffetTactiqueASS oldEffetRecherche = effetRecherche;
		effetRecherche = newEffetRecherche == null ? EFFET_RECHERCHE_EDEFAULT : newEffetRecherche;
		boolean oldEffetRechercheESet = effetRechercheESet;
		effetRechercheESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ENGAGEMENT_AVEC_DELEGATION__EFFET_RECHERCHE, oldEffetRecherche, effetRecherche, !oldEffetRechercheESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEffetRecherche() {
		TypeDictionaryDicoEffetTactiqueASS oldEffetRecherche = effetRecherche;
		boolean oldEffetRechercheESet = effetRechercheESet;
		effetRecherche = EFFET_RECHERCHE_EDEFAULT;
		effetRechercheESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ENGAGEMENT_AVEC_DELEGATION__EFFET_RECHERCHE, oldEffetRecherche, EFFET_RECHERCHE_EDEFAULT, oldEffetRechercheESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEffetRecherche() {
		return effetRechercheESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutreEffetRecherche() {
		return autreEffetRecherche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutreEffetRecherche(String newAutreEffetRecherche) {
		String oldAutreEffetRecherche = autreEffetRecherche;
		autreEffetRecherche = newAutreEffetRecherche;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ENGAGEMENT_AVEC_DELEGATION__AUTRE_EFFET_RECHERCHE, oldAutreEffetRecherche, autreEffetRecherche));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPourcentageDommagesRecherche() {
		return pourcentageDommagesRecherche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPourcentageDommagesRecherche(double newPourcentageDommagesRecherche) {
		double oldPourcentageDommagesRecherche = pourcentageDommagesRecherche;
		pourcentageDommagesRecherche = newPourcentageDommagesRecherche;
		boolean oldPourcentageDommagesRechercheESet = pourcentageDommagesRechercheESet;
		pourcentageDommagesRechercheESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ENGAGEMENT_AVEC_DELEGATION__POURCENTAGE_DOMMAGES_RECHERCHE, oldPourcentageDommagesRecherche, pourcentageDommagesRecherche, !oldPourcentageDommagesRechercheESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPourcentageDommagesRecherche() {
		double oldPourcentageDommagesRecherche = pourcentageDommagesRecherche;
		boolean oldPourcentageDommagesRechercheESet = pourcentageDommagesRechercheESet;
		pourcentageDommagesRecherche = POURCENTAGE_DOMMAGES_RECHERCHE_EDEFAULT;
		pourcentageDommagesRechercheESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ENGAGEMENT_AVEC_DELEGATION__POURCENTAGE_DOMMAGES_RECHERCHE, oldPourcentageDommagesRecherche, POURCENTAGE_DOMMAGES_RECHERCHE_EDEFAULT, oldPourcentageDommagesRechercheESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPourcentageDommagesRecherche() {
		return pourcentageDommagesRechercheESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEffetMunition() {
		return effetMunition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffetMunition(double newEffetMunition) {
		double oldEffetMunition = effetMunition;
		effetMunition = newEffetMunition;
		boolean oldEffetMunitionESet = effetMunitionESet;
		effetMunitionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ENGAGEMENT_AVEC_DELEGATION__EFFET_MUNITION, oldEffetMunition, effetMunition, !oldEffetMunitionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEffetMunition() {
		double oldEffetMunition = effetMunition;
		boolean oldEffetMunitionESet = effetMunitionESet;
		effetMunition = EFFET_MUNITION_EDEFAULT;
		effetMunitionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ENGAGEMENT_AVEC_DELEGATION__EFFET_MUNITION, oldEffetMunition, EFFET_MUNITION_EDEFAULT, oldEffetMunitionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEffetMunition() {
		return effetMunitionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getVolumeMoyenTir() {
		return volumeMoyenTir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolumeMoyenTir(long newVolumeMoyenTir) {
		long oldVolumeMoyenTir = volumeMoyenTir;
		volumeMoyenTir = newVolumeMoyenTir;
		boolean oldVolumeMoyenTirESet = volumeMoyenTirESet;
		volumeMoyenTirESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ENGAGEMENT_AVEC_DELEGATION__VOLUME_MOYEN_TIR, oldVolumeMoyenTir, volumeMoyenTir, !oldVolumeMoyenTirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVolumeMoyenTir() {
		long oldVolumeMoyenTir = volumeMoyenTir;
		boolean oldVolumeMoyenTirESet = volumeMoyenTirESet;
		volumeMoyenTir = VOLUME_MOYEN_TIR_EDEFAULT;
		volumeMoyenTirESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ENGAGEMENT_AVEC_DELEGATION__VOLUME_MOYEN_TIR, oldVolumeMoyenTir, VOLUME_MOYEN_TIR_EDEFAULT, oldVolumeMoyenTirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVolumeMoyenTir() {
		return volumeMoyenTirESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreMaximumDemandeTir() {
		return nombreMaximumDemandeTir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreMaximumDemandeTir(long newNombreMaximumDemandeTir) {
		long oldNombreMaximumDemandeTir = nombreMaximumDemandeTir;
		nombreMaximumDemandeTir = newNombreMaximumDemandeTir;
		boolean oldNombreMaximumDemandeTirESet = nombreMaximumDemandeTirESet;
		nombreMaximumDemandeTirESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ENGAGEMENT_AVEC_DELEGATION__NOMBRE_MAXIMUM_DEMANDE_TIR, oldNombreMaximumDemandeTir, nombreMaximumDemandeTir, !oldNombreMaximumDemandeTirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreMaximumDemandeTir() {
		long oldNombreMaximumDemandeTir = nombreMaximumDemandeTir;
		boolean oldNombreMaximumDemandeTirESet = nombreMaximumDemandeTirESet;
		nombreMaximumDemandeTir = NOMBRE_MAXIMUM_DEMANDE_TIR_EDEFAULT;
		nombreMaximumDemandeTirESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ENGAGEMENT_AVEC_DELEGATION__NOMBRE_MAXIMUM_DEMANDE_TIR, oldNombreMaximumDemandeTir, NOMBRE_MAXIMUM_DEMANDE_TIR_EDEFAULT, oldNombreMaximumDemandeTirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreMaximumDemandeTir() {
		return nombreMaximumDemandeTirESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEffetSurEnvironnement() {
		return effetSurEnvironnement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffetSurEnvironnement(String newEffetSurEnvironnement) {
		String oldEffetSurEnvironnement = effetSurEnvironnement;
		effetSurEnvironnement = newEffetSurEnvironnement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ENGAGEMENT_AVEC_DELEGATION__EFFET_SUR_ENVIRONNEMENT, oldEffetSurEnvironnement, effetSurEnvironnement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEXT> getAPourMunitionTypeMunition() {
		if (aPourMunitionTypeMunition == null) {
			aPourMunitionTypeMunition = new EObjectContainmentEList<TypeAssociationEXT>(TypeAssociationEXT.class, this, SchemaPackage.TYPE_ENGAGEMENT_AVEC_DELEGATION__APOUR_MUNITION_TYPE_MUNITION);
		}
		return aPourMunitionTypeMunition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ENGAGEMENT_AVEC_DELEGATION__APOUR_MUNITION_TYPE_MUNITION:
				return ((InternalEList<?>)getAPourMunitionTypeMunition()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_ENGAGEMENT_AVEC_DELEGATION__EFFET_RECHERCHE:
				return getEffetRecherche();
			case SchemaPackage.TYPE_ENGAGEMENT_AVEC_DELEGATION__AUTRE_EFFET_RECHERCHE:
				return getAutreEffetRecherche();
			case SchemaPackage.TYPE_ENGAGEMENT_AVEC_DELEGATION__POURCENTAGE_DOMMAGES_RECHERCHE:
				return new Double(getPourcentageDommagesRecherche());
			case SchemaPackage.TYPE_ENGAGEMENT_AVEC_DELEGATION__EFFET_MUNITION:
				return new Double(getEffetMunition());
			case SchemaPackage.TYPE_ENGAGEMENT_AVEC_DELEGATION__VOLUME_MOYEN_TIR:
				return new Long(getVolumeMoyenTir());
			case SchemaPackage.TYPE_ENGAGEMENT_AVEC_DELEGATION__NOMBRE_MAXIMUM_DEMANDE_TIR:
				return new Long(getNombreMaximumDemandeTir());
			case SchemaPackage.TYPE_ENGAGEMENT_AVEC_DELEGATION__EFFET_SUR_ENVIRONNEMENT:
				return getEffetSurEnvironnement();
			case SchemaPackage.TYPE_ENGAGEMENT_AVEC_DELEGATION__APOUR_MUNITION_TYPE_MUNITION:
				return getAPourMunitionTypeMunition();
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
			case SchemaPackage.TYPE_ENGAGEMENT_AVEC_DELEGATION__EFFET_RECHERCHE:
				setEffetRecherche((TypeDictionaryDicoEffetTactiqueASS)newValue);
				return;
			case SchemaPackage.TYPE_ENGAGEMENT_AVEC_DELEGATION__AUTRE_EFFET_RECHERCHE:
				setAutreEffetRecherche((String)newValue);
				return;
			case SchemaPackage.TYPE_ENGAGEMENT_AVEC_DELEGATION__POURCENTAGE_DOMMAGES_RECHERCHE:
				setPourcentageDommagesRecherche(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_ENGAGEMENT_AVEC_DELEGATION__EFFET_MUNITION:
				setEffetMunition(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_ENGAGEMENT_AVEC_DELEGATION__VOLUME_MOYEN_TIR:
				setVolumeMoyenTir(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_ENGAGEMENT_AVEC_DELEGATION__NOMBRE_MAXIMUM_DEMANDE_TIR:
				setNombreMaximumDemandeTir(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_ENGAGEMENT_AVEC_DELEGATION__EFFET_SUR_ENVIRONNEMENT:
				setEffetSurEnvironnement((String)newValue);
				return;
			case SchemaPackage.TYPE_ENGAGEMENT_AVEC_DELEGATION__APOUR_MUNITION_TYPE_MUNITION:
				getAPourMunitionTypeMunition().clear();
				getAPourMunitionTypeMunition().addAll((Collection<? extends TypeAssociationEXT>)newValue);
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
			case SchemaPackage.TYPE_ENGAGEMENT_AVEC_DELEGATION__EFFET_RECHERCHE:
				unsetEffetRecherche();
				return;
			case SchemaPackage.TYPE_ENGAGEMENT_AVEC_DELEGATION__AUTRE_EFFET_RECHERCHE:
				setAutreEffetRecherche(AUTRE_EFFET_RECHERCHE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ENGAGEMENT_AVEC_DELEGATION__POURCENTAGE_DOMMAGES_RECHERCHE:
				unsetPourcentageDommagesRecherche();
				return;
			case SchemaPackage.TYPE_ENGAGEMENT_AVEC_DELEGATION__EFFET_MUNITION:
				unsetEffetMunition();
				return;
			case SchemaPackage.TYPE_ENGAGEMENT_AVEC_DELEGATION__VOLUME_MOYEN_TIR:
				unsetVolumeMoyenTir();
				return;
			case SchemaPackage.TYPE_ENGAGEMENT_AVEC_DELEGATION__NOMBRE_MAXIMUM_DEMANDE_TIR:
				unsetNombreMaximumDemandeTir();
				return;
			case SchemaPackage.TYPE_ENGAGEMENT_AVEC_DELEGATION__EFFET_SUR_ENVIRONNEMENT:
				setEffetSurEnvironnement(EFFET_SUR_ENVIRONNEMENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ENGAGEMENT_AVEC_DELEGATION__APOUR_MUNITION_TYPE_MUNITION:
				getAPourMunitionTypeMunition().clear();
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
			case SchemaPackage.TYPE_ENGAGEMENT_AVEC_DELEGATION__EFFET_RECHERCHE:
				return isSetEffetRecherche();
			case SchemaPackage.TYPE_ENGAGEMENT_AVEC_DELEGATION__AUTRE_EFFET_RECHERCHE:
				return AUTRE_EFFET_RECHERCHE_EDEFAULT == null ? autreEffetRecherche != null : !AUTRE_EFFET_RECHERCHE_EDEFAULT.equals(autreEffetRecherche);
			case SchemaPackage.TYPE_ENGAGEMENT_AVEC_DELEGATION__POURCENTAGE_DOMMAGES_RECHERCHE:
				return isSetPourcentageDommagesRecherche();
			case SchemaPackage.TYPE_ENGAGEMENT_AVEC_DELEGATION__EFFET_MUNITION:
				return isSetEffetMunition();
			case SchemaPackage.TYPE_ENGAGEMENT_AVEC_DELEGATION__VOLUME_MOYEN_TIR:
				return isSetVolumeMoyenTir();
			case SchemaPackage.TYPE_ENGAGEMENT_AVEC_DELEGATION__NOMBRE_MAXIMUM_DEMANDE_TIR:
				return isSetNombreMaximumDemandeTir();
			case SchemaPackage.TYPE_ENGAGEMENT_AVEC_DELEGATION__EFFET_SUR_ENVIRONNEMENT:
				return EFFET_SUR_ENVIRONNEMENT_EDEFAULT == null ? effetSurEnvironnement != null : !EFFET_SUR_ENVIRONNEMENT_EDEFAULT.equals(effetSurEnvironnement);
			case SchemaPackage.TYPE_ENGAGEMENT_AVEC_DELEGATION__APOUR_MUNITION_TYPE_MUNITION:
				return aPourMunitionTypeMunition != null && !aPourMunitionTypeMunition.isEmpty();
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
		result.append(" (effetRecherche: ");
		if (effetRechercheESet) result.append(effetRecherche); else result.append("<unset>");
		result.append(", autreEffetRecherche: ");
		result.append(autreEffetRecherche);
		result.append(", pourcentageDommagesRecherche: ");
		if (pourcentageDommagesRechercheESet) result.append(pourcentageDommagesRecherche); else result.append("<unset>");
		result.append(", effetMunition: ");
		if (effetMunitionESet) result.append(effetMunition); else result.append("<unset>");
		result.append(", volumeMoyenTir: ");
		if (volumeMoyenTirESet) result.append(volumeMoyenTir); else result.append("<unset>");
		result.append(", nombreMaximumDemandeTir: ");
		if (nombreMaximumDemandeTirESet) result.append(nombreMaximumDemandeTir); else result.append("<unset>");
		result.append(", effetSurEnvironnement: ");
		result.append(effetSurEnvironnement);
		result.append(')');
		return result.toString();
	}

} //TypeEngagementAvecDelegationImpl
