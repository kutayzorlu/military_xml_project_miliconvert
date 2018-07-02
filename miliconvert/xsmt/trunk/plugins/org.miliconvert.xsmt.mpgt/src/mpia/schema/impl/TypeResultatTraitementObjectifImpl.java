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
import mpia.schema.TypeDictionaryDicoResultatTraitementObjectifEffetConstate;
import mpia.schema.TypeMunitionsConsommeesSurPoint;
import mpia.schema.TypeResultatTraitementObjectif;

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
 * An implementation of the model object '<em><b>Type Resultat Traitement Objectif</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeResultatTraitementObjectifImpl#getDescriptionEleme <em>Description Eleme</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeResultatTraitementObjectifImpl#getDescriptionTypeEquipement <em>Description Type Equipement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeResultatTraitementObjectifImpl#getNombreEquipementsDetruits <em>Nombre Equipements Detruits</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeResultatTraitementObjectifImpl#getPourcentagePerte <em>Pourcentage Perte</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeResultatTraitementObjectifImpl#getEffetConstate <em>Effet Constate</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeResultatTraitementObjectifImpl#isConfirmationImage <em>Confirmation Image</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeResultatTraitementObjectifImpl#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeResultatTraitementObjectifImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeResultatTraitementObjectifImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeResultatTraitementObjectifImpl#getAPourMunitionsConsommeesSurPointMunitionsConsommeesSurPoint <em>APour Munitions Consommees Sur Point Munitions Consommees Sur Point</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeResultatTraitementObjectifImpl#getAObserveObservation <em>AObserve Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeResultatTraitementObjectifImpl extends EObjectImpl implements TypeResultatTraitementObjectif {
	/**
	 * The default value of the '{@link #getDescriptionEleme() <em>Description Eleme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionEleme()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_ELEME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescriptionEleme() <em>Description Eleme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionEleme()
	 * @generated
	 * @ordered
	 */
	protected String descriptionEleme = DESCRIPTION_ELEME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescriptionTypeEquipement() <em>Description Type Equipement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionTypeEquipement()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_TYPE_EQUIPEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescriptionTypeEquipement() <em>Description Type Equipement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionTypeEquipement()
	 * @generated
	 * @ordered
	 */
	protected String descriptionTypeEquipement = DESCRIPTION_TYPE_EQUIPEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNombreEquipementsDetruits() <em>Nombre Equipements Detruits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreEquipementsDetruits()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_EQUIPEMENTS_DETRUITS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreEquipementsDetruits() <em>Nombre Equipements Detruits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreEquipementsDetruits()
	 * @generated
	 * @ordered
	 */
	protected long nombreEquipementsDetruits = NOMBRE_EQUIPEMENTS_DETRUITS_EDEFAULT;

	/**
	 * This is true if the Nombre Equipements Detruits attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreEquipementsDetruitsESet;

	/**
	 * The default value of the '{@link #getPourcentagePerte() <em>Pourcentage Perte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPourcentagePerte()
	 * @generated
	 * @ordered
	 */
	protected static final long POURCENTAGE_PERTE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getPourcentagePerte() <em>Pourcentage Perte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPourcentagePerte()
	 * @generated
	 * @ordered
	 */
	protected long pourcentagePerte = POURCENTAGE_PERTE_EDEFAULT;

	/**
	 * This is true if the Pourcentage Perte attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pourcentagePerteESet;

	/**
	 * The default value of the '{@link #getEffetConstate() <em>Effet Constate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffetConstate()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoResultatTraitementObjectifEffetConstate EFFET_CONSTATE_EDEFAULT = TypeDictionaryDicoResultatTraitementObjectifEffetConstate.ACTIVE;

	/**
	 * The cached value of the '{@link #getEffetConstate() <em>Effet Constate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffetConstate()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoResultatTraitementObjectifEffetConstate effetConstate = EFFET_CONSTATE_EDEFAULT;

	/**
	 * This is true if the Effet Constate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean effetConstateESet;

	/**
	 * The default value of the '{@link #isConfirmationImage() <em>Confirmation Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConfirmationImage()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONFIRMATION_IMAGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConfirmationImage() <em>Confirmation Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConfirmationImage()
	 * @generated
	 * @ordered
	 */
	protected boolean confirmationImage = CONFIRMATION_IMAGE_EDEFAULT;

	/**
	 * This is true if the Confirmation Image attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean confirmationImageESet;

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
	 * The cached value of the '{@link #getAPourMunitionsConsommeesSurPointMunitionsConsommeesSurPoint() <em>APour Munitions Consommees Sur Point Munitions Consommees Sur Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourMunitionsConsommeesSurPointMunitionsConsommeesSurPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeMunitionsConsommeesSurPoint> aPourMunitionsConsommeesSurPointMunitionsConsommeesSurPoint;

	/**
	 * The cached value of the '{@link #getAObserveObservation() <em>AObserve Observation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAObserveObservation()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aObserveObservation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeResultatTraitementObjectifImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeResultatTraitementObjectif();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescriptionEleme() {
		return descriptionEleme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptionEleme(String newDescriptionEleme) {
		String oldDescriptionEleme = descriptionEleme;
		descriptionEleme = newDescriptionEleme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__DESCRIPTION_ELEME, oldDescriptionEleme, descriptionEleme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescriptionTypeEquipement() {
		return descriptionTypeEquipement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptionTypeEquipement(String newDescriptionTypeEquipement) {
		String oldDescriptionTypeEquipement = descriptionTypeEquipement;
		descriptionTypeEquipement = newDescriptionTypeEquipement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__DESCRIPTION_TYPE_EQUIPEMENT, oldDescriptionTypeEquipement, descriptionTypeEquipement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreEquipementsDetruits() {
		return nombreEquipementsDetruits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreEquipementsDetruits(long newNombreEquipementsDetruits) {
		long oldNombreEquipementsDetruits = nombreEquipementsDetruits;
		nombreEquipementsDetruits = newNombreEquipementsDetruits;
		boolean oldNombreEquipementsDetruitsESet = nombreEquipementsDetruitsESet;
		nombreEquipementsDetruitsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__NOMBRE_EQUIPEMENTS_DETRUITS, oldNombreEquipementsDetruits, nombreEquipementsDetruits, !oldNombreEquipementsDetruitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreEquipementsDetruits() {
		long oldNombreEquipementsDetruits = nombreEquipementsDetruits;
		boolean oldNombreEquipementsDetruitsESet = nombreEquipementsDetruitsESet;
		nombreEquipementsDetruits = NOMBRE_EQUIPEMENTS_DETRUITS_EDEFAULT;
		nombreEquipementsDetruitsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__NOMBRE_EQUIPEMENTS_DETRUITS, oldNombreEquipementsDetruits, NOMBRE_EQUIPEMENTS_DETRUITS_EDEFAULT, oldNombreEquipementsDetruitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreEquipementsDetruits() {
		return nombreEquipementsDetruitsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getPourcentagePerte() {
		return pourcentagePerte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPourcentagePerte(long newPourcentagePerte) {
		long oldPourcentagePerte = pourcentagePerte;
		pourcentagePerte = newPourcentagePerte;
		boolean oldPourcentagePerteESet = pourcentagePerteESet;
		pourcentagePerteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__POURCENTAGE_PERTE, oldPourcentagePerte, pourcentagePerte, !oldPourcentagePerteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPourcentagePerte() {
		long oldPourcentagePerte = pourcentagePerte;
		boolean oldPourcentagePerteESet = pourcentagePerteESet;
		pourcentagePerte = POURCENTAGE_PERTE_EDEFAULT;
		pourcentagePerteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__POURCENTAGE_PERTE, oldPourcentagePerte, POURCENTAGE_PERTE_EDEFAULT, oldPourcentagePerteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPourcentagePerte() {
		return pourcentagePerteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoResultatTraitementObjectifEffetConstate getEffetConstate() {
		return effetConstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffetConstate(TypeDictionaryDicoResultatTraitementObjectifEffetConstate newEffetConstate) {
		TypeDictionaryDicoResultatTraitementObjectifEffetConstate oldEffetConstate = effetConstate;
		effetConstate = newEffetConstate == null ? EFFET_CONSTATE_EDEFAULT : newEffetConstate;
		boolean oldEffetConstateESet = effetConstateESet;
		effetConstateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__EFFET_CONSTATE, oldEffetConstate, effetConstate, !oldEffetConstateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEffetConstate() {
		TypeDictionaryDicoResultatTraitementObjectifEffetConstate oldEffetConstate = effetConstate;
		boolean oldEffetConstateESet = effetConstateESet;
		effetConstate = EFFET_CONSTATE_EDEFAULT;
		effetConstateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__EFFET_CONSTATE, oldEffetConstate, EFFET_CONSTATE_EDEFAULT, oldEffetConstateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEffetConstate() {
		return effetConstateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConfirmationImage() {
		return confirmationImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfirmationImage(boolean newConfirmationImage) {
		boolean oldConfirmationImage = confirmationImage;
		confirmationImage = newConfirmationImage;
		boolean oldConfirmationImageESet = confirmationImageESet;
		confirmationImageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__CONFIRMATION_IMAGE, oldConfirmationImage, confirmationImage, !oldConfirmationImageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConfirmationImage() {
		boolean oldConfirmationImage = confirmationImage;
		boolean oldConfirmationImageESet = confirmationImageESet;
		confirmationImage = CONFIRMATION_IMAGE_EDEFAULT;
		confirmationImageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__CONFIRMATION_IMAGE, oldConfirmationImage, CONFIRMATION_IMAGE_EDEFAULT, oldConfirmationImageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConfirmationImage() {
		return confirmationImageESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__COMMENTAIRE, oldCommentaire, commentaire));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMunitionsConsommeesSurPoint> getAPourMunitionsConsommeesSurPointMunitionsConsommeesSurPoint() {
		if (aPourMunitionsConsommeesSurPointMunitionsConsommeesSurPoint == null) {
			aPourMunitionsConsommeesSurPointMunitionsConsommeesSurPoint = new EObjectContainmentEList<TypeMunitionsConsommeesSurPoint>(TypeMunitionsConsommeesSurPoint.class, this, SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__APOUR_MUNITIONS_CONSOMMEES_SUR_POINT_MUNITIONS_CONSOMMEES_SUR_POINT);
		}
		return aPourMunitionsConsommeesSurPointMunitionsConsommeesSurPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAObserveObservation() {
		if (aObserveObservation == null) {
			aObserveObservation = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__AOBSERVE_OBSERVATION);
		}
		return aObserveObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__APOUR_MUNITIONS_CONSOMMEES_SUR_POINT_MUNITIONS_CONSOMMEES_SUR_POINT:
				return ((InternalEList<?>)getAPourMunitionsConsommeesSurPointMunitionsConsommeesSurPoint()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__AOBSERVE_OBSERVATION:
				return ((InternalEList<?>)getAObserveObservation()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__DESCRIPTION_ELEME:
				return getDescriptionEleme();
			case SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__DESCRIPTION_TYPE_EQUIPEMENT:
				return getDescriptionTypeEquipement();
			case SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__NOMBRE_EQUIPEMENTS_DETRUITS:
				return new Long(getNombreEquipementsDetruits());
			case SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__POURCENTAGE_PERTE:
				return new Long(getPourcentagePerte());
			case SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__EFFET_CONSTATE:
				return getEffetConstate();
			case SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__CONFIRMATION_IMAGE:
				return isConfirmationImage() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__COMMENTAIRE:
				return getCommentaire();
			case SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__CTE:
				return getCTE();
			case SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__CE:
				return getCE();
			case SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__APOUR_MUNITIONS_CONSOMMEES_SUR_POINT_MUNITIONS_CONSOMMEES_SUR_POINT:
				return getAPourMunitionsConsommeesSurPointMunitionsConsommeesSurPoint();
			case SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__AOBSERVE_OBSERVATION:
				return getAObserveObservation();
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
			case SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__DESCRIPTION_ELEME:
				setDescriptionEleme((String)newValue);
				return;
			case SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__DESCRIPTION_TYPE_EQUIPEMENT:
				setDescriptionTypeEquipement((String)newValue);
				return;
			case SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__NOMBRE_EQUIPEMENTS_DETRUITS:
				setNombreEquipementsDetruits(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__POURCENTAGE_PERTE:
				setPourcentagePerte(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__EFFET_CONSTATE:
				setEffetConstate((TypeDictionaryDicoResultatTraitementObjectifEffetConstate)newValue);
				return;
			case SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__CONFIRMATION_IMAGE:
				setConfirmationImage(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__COMMENTAIRE:
				setCommentaire((String)newValue);
				return;
			case SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__APOUR_MUNITIONS_CONSOMMEES_SUR_POINT_MUNITIONS_CONSOMMEES_SUR_POINT:
				getAPourMunitionsConsommeesSurPointMunitionsConsommeesSurPoint().clear();
				getAPourMunitionsConsommeesSurPointMunitionsConsommeesSurPoint().addAll((Collection<? extends TypeMunitionsConsommeesSurPoint>)newValue);
				return;
			case SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__AOBSERVE_OBSERVATION:
				getAObserveObservation().clear();
				getAObserveObservation().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__DESCRIPTION_ELEME:
				setDescriptionEleme(DESCRIPTION_ELEME_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__DESCRIPTION_TYPE_EQUIPEMENT:
				setDescriptionTypeEquipement(DESCRIPTION_TYPE_EQUIPEMENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__NOMBRE_EQUIPEMENTS_DETRUITS:
				unsetNombreEquipementsDetruits();
				return;
			case SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__POURCENTAGE_PERTE:
				unsetPourcentagePerte();
				return;
			case SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__EFFET_CONSTATE:
				unsetEffetConstate();
				return;
			case SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__CONFIRMATION_IMAGE:
				unsetConfirmationImage();
				return;
			case SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__COMMENTAIRE:
				setCommentaire(COMMENTAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__APOUR_MUNITIONS_CONSOMMEES_SUR_POINT_MUNITIONS_CONSOMMEES_SUR_POINT:
				getAPourMunitionsConsommeesSurPointMunitionsConsommeesSurPoint().clear();
				return;
			case SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__AOBSERVE_OBSERVATION:
				getAObserveObservation().clear();
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
			case SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__DESCRIPTION_ELEME:
				return DESCRIPTION_ELEME_EDEFAULT == null ? descriptionEleme != null : !DESCRIPTION_ELEME_EDEFAULT.equals(descriptionEleme);
			case SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__DESCRIPTION_TYPE_EQUIPEMENT:
				return DESCRIPTION_TYPE_EQUIPEMENT_EDEFAULT == null ? descriptionTypeEquipement != null : !DESCRIPTION_TYPE_EQUIPEMENT_EDEFAULT.equals(descriptionTypeEquipement);
			case SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__NOMBRE_EQUIPEMENTS_DETRUITS:
				return isSetNombreEquipementsDetruits();
			case SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__POURCENTAGE_PERTE:
				return isSetPourcentagePerte();
			case SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__EFFET_CONSTATE:
				return isSetEffetConstate();
			case SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__CONFIRMATION_IMAGE:
				return isSetConfirmationImage();
			case SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__COMMENTAIRE:
				return COMMENTAIRE_EDEFAULT == null ? commentaire != null : !COMMENTAIRE_EDEFAULT.equals(commentaire);
			case SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__APOUR_MUNITIONS_CONSOMMEES_SUR_POINT_MUNITIONS_CONSOMMEES_SUR_POINT:
				return aPourMunitionsConsommeesSurPointMunitionsConsommeesSurPoint != null && !aPourMunitionsConsommeesSurPointMunitionsConsommeesSurPoint.isEmpty();
			case SchemaPackage.TYPE_RESULTAT_TRAITEMENT_OBJECTIF__AOBSERVE_OBSERVATION:
				return aObserveObservation != null && !aObserveObservation.isEmpty();
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
		result.append(" (descriptionEleme: ");
		result.append(descriptionEleme);
		result.append(", descriptionTypeEquipement: ");
		result.append(descriptionTypeEquipement);
		result.append(", nombreEquipementsDetruits: ");
		if (nombreEquipementsDetruitsESet) result.append(nombreEquipementsDetruits); else result.append("<unset>");
		result.append(", pourcentagePerte: ");
		if (pourcentagePerteESet) result.append(pourcentagePerte); else result.append("<unset>");
		result.append(", effetConstate: ");
		if (effetConstateESet) result.append(effetConstate); else result.append("<unset>");
		result.append(", confirmationImage: ");
		if (confirmationImageESet) result.append(confirmationImage); else result.append("<unset>");
		result.append(", commentaire: ");
		result.append(commentaire);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeResultatTraitementObjectifImpl
