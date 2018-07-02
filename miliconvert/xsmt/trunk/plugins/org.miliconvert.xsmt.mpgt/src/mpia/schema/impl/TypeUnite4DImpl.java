/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoThreeStates;
import mpia.schema.TypeUnite4D;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Unite4 D</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeUnite4DImpl#getVideo <em>Video</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUnite4DImpl#getVoix <em>Voix</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUnite4DImpl#isAffichagePannes <em>Affichage Pannes</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUnite4DImpl#getSatellite <em>Satellite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUnite4DImpl#getReseauSI <em>Reseau SI</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUnite4DImpl#getTD <em>TD</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUnite4DImpl#getAutres <em>Autres</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUnite4DImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUnite4DImpl#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeUnite4DImpl extends EObjectImpl implements TypeUnite4D {
	/**
	 * The default value of the '{@link #getVideo() <em>Video</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideo()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoThreeStates VIDEO_EDEFAULT = TypeDictionaryDicoThreeStates.YES;

	/**
	 * The cached value of the '{@link #getVideo() <em>Video</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideo()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoThreeStates video = VIDEO_EDEFAULT;

	/**
	 * This is true if the Video attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean videoESet;

	/**
	 * The default value of the '{@link #getVoix() <em>Voix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoix()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoThreeStates VOIX_EDEFAULT = TypeDictionaryDicoThreeStates.YES;

	/**
	 * The cached value of the '{@link #getVoix() <em>Voix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoix()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoThreeStates voix = VOIX_EDEFAULT;

	/**
	 * This is true if the Voix attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean voixESet;

	/**
	 * The default value of the '{@link #isAffichagePannes() <em>Affichage Pannes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAffichagePannes()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AFFICHAGE_PANNES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAffichagePannes() <em>Affichage Pannes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAffichagePannes()
	 * @generated
	 * @ordered
	 */
	protected boolean affichagePannes = AFFICHAGE_PANNES_EDEFAULT;

	/**
	 * This is true if the Affichage Pannes attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean affichagePannesESet;

	/**
	 * The default value of the '{@link #getSatellite() <em>Satellite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatellite()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoThreeStates SATELLITE_EDEFAULT = TypeDictionaryDicoThreeStates.YES;

	/**
	 * The cached value of the '{@link #getSatellite() <em>Satellite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatellite()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoThreeStates satellite = SATELLITE_EDEFAULT;

	/**
	 * This is true if the Satellite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean satelliteESet;

	/**
	 * The default value of the '{@link #getReseauSI() <em>Reseau SI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReseauSI()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoThreeStates RESEAU_SI_EDEFAULT = TypeDictionaryDicoThreeStates.YES;

	/**
	 * The cached value of the '{@link #getReseauSI() <em>Reseau SI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReseauSI()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoThreeStates reseauSI = RESEAU_SI_EDEFAULT;

	/**
	 * This is true if the Reseau SI attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean reseauSIESet;

	/**
	 * The default value of the '{@link #getTD() <em>TD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTD()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoThreeStates TD_EDEFAULT = TypeDictionaryDicoThreeStates.YES;

	/**
	 * The cached value of the '{@link #getTD() <em>TD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTD()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoThreeStates tD = TD_EDEFAULT;

	/**
	 * This is true if the TD attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tDESet;

	/**
	 * The default value of the '{@link #getAutres() <em>Autres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutres()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoThreeStates AUTRES_EDEFAULT = TypeDictionaryDicoThreeStates.YES;

	/**
	 * The cached value of the '{@link #getAutres() <em>Autres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutres()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoThreeStates autres = AUTRES_EDEFAULT;

	/**
	 * This is true if the Autres attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean autresESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeUnite4DImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeUnite4D();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoThreeStates getVideo() {
		return video;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVideo(TypeDictionaryDicoThreeStates newVideo) {
		TypeDictionaryDicoThreeStates oldVideo = video;
		video = newVideo == null ? VIDEO_EDEFAULT : newVideo;
		boolean oldVideoESet = videoESet;
		videoESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE4_D__VIDEO, oldVideo, video, !oldVideoESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVideo() {
		TypeDictionaryDicoThreeStates oldVideo = video;
		boolean oldVideoESet = videoESet;
		video = VIDEO_EDEFAULT;
		videoESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_UNITE4_D__VIDEO, oldVideo, VIDEO_EDEFAULT, oldVideoESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVideo() {
		return videoESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoThreeStates getVoix() {
		return voix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoix(TypeDictionaryDicoThreeStates newVoix) {
		TypeDictionaryDicoThreeStates oldVoix = voix;
		voix = newVoix == null ? VOIX_EDEFAULT : newVoix;
		boolean oldVoixESet = voixESet;
		voixESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE4_D__VOIX, oldVoix, voix, !oldVoixESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVoix() {
		TypeDictionaryDicoThreeStates oldVoix = voix;
		boolean oldVoixESet = voixESet;
		voix = VOIX_EDEFAULT;
		voixESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_UNITE4_D__VOIX, oldVoix, VOIX_EDEFAULT, oldVoixESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVoix() {
		return voixESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAffichagePannes() {
		return affichagePannes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAffichagePannes(boolean newAffichagePannes) {
		boolean oldAffichagePannes = affichagePannes;
		affichagePannes = newAffichagePannes;
		boolean oldAffichagePannesESet = affichagePannesESet;
		affichagePannesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE4_D__AFFICHAGE_PANNES, oldAffichagePannes, affichagePannes, !oldAffichagePannesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAffichagePannes() {
		boolean oldAffichagePannes = affichagePannes;
		boolean oldAffichagePannesESet = affichagePannesESet;
		affichagePannes = AFFICHAGE_PANNES_EDEFAULT;
		affichagePannesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_UNITE4_D__AFFICHAGE_PANNES, oldAffichagePannes, AFFICHAGE_PANNES_EDEFAULT, oldAffichagePannesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAffichagePannes() {
		return affichagePannesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoThreeStates getSatellite() {
		return satellite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSatellite(TypeDictionaryDicoThreeStates newSatellite) {
		TypeDictionaryDicoThreeStates oldSatellite = satellite;
		satellite = newSatellite == null ? SATELLITE_EDEFAULT : newSatellite;
		boolean oldSatelliteESet = satelliteESet;
		satelliteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE4_D__SATELLITE, oldSatellite, satellite, !oldSatelliteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSatellite() {
		TypeDictionaryDicoThreeStates oldSatellite = satellite;
		boolean oldSatelliteESet = satelliteESet;
		satellite = SATELLITE_EDEFAULT;
		satelliteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_UNITE4_D__SATELLITE, oldSatellite, SATELLITE_EDEFAULT, oldSatelliteESet));
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
	public TypeDictionaryDicoThreeStates getReseauSI() {
		return reseauSI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReseauSI(TypeDictionaryDicoThreeStates newReseauSI) {
		TypeDictionaryDicoThreeStates oldReseauSI = reseauSI;
		reseauSI = newReseauSI == null ? RESEAU_SI_EDEFAULT : newReseauSI;
		boolean oldReseauSIESet = reseauSIESet;
		reseauSIESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE4_D__RESEAU_SI, oldReseauSI, reseauSI, !oldReseauSIESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReseauSI() {
		TypeDictionaryDicoThreeStates oldReseauSI = reseauSI;
		boolean oldReseauSIESet = reseauSIESet;
		reseauSI = RESEAU_SI_EDEFAULT;
		reseauSIESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_UNITE4_D__RESEAU_SI, oldReseauSI, RESEAU_SI_EDEFAULT, oldReseauSIESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReseauSI() {
		return reseauSIESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoThreeStates getTD() {
		return tD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTD(TypeDictionaryDicoThreeStates newTD) {
		TypeDictionaryDicoThreeStates oldTD = tD;
		tD = newTD == null ? TD_EDEFAULT : newTD;
		boolean oldTDESet = tDESet;
		tDESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE4_D__TD, oldTD, tD, !oldTDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTD() {
		TypeDictionaryDicoThreeStates oldTD = tD;
		boolean oldTDESet = tDESet;
		tD = TD_EDEFAULT;
		tDESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_UNITE4_D__TD, oldTD, TD_EDEFAULT, oldTDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTD() {
		return tDESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoThreeStates getAutres() {
		return autres;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutres(TypeDictionaryDicoThreeStates newAutres) {
		TypeDictionaryDicoThreeStates oldAutres = autres;
		autres = newAutres == null ? AUTRES_EDEFAULT : newAutres;
		boolean oldAutresESet = autresESet;
		autresESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE4_D__AUTRES, oldAutres, autres, !oldAutresESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAutres() {
		TypeDictionaryDicoThreeStates oldAutres = autres;
		boolean oldAutresESet = autresESet;
		autres = AUTRES_EDEFAULT;
		autresESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_UNITE4_D__AUTRES, oldAutres, AUTRES_EDEFAULT, oldAutresESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAutres() {
		return autresESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE4_D__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE4_D__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_UNITE4_D__VIDEO:
				return getVideo();
			case SchemaPackage.TYPE_UNITE4_D__VOIX:
				return getVoix();
			case SchemaPackage.TYPE_UNITE4_D__AFFICHAGE_PANNES:
				return isAffichagePannes() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_UNITE4_D__SATELLITE:
				return getSatellite();
			case SchemaPackage.TYPE_UNITE4_D__RESEAU_SI:
				return getReseauSI();
			case SchemaPackage.TYPE_UNITE4_D__TD:
				return getTD();
			case SchemaPackage.TYPE_UNITE4_D__AUTRES:
				return getAutres();
			case SchemaPackage.TYPE_UNITE4_D__CTE:
				return getCTE();
			case SchemaPackage.TYPE_UNITE4_D__CE:
				return getCE();
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
			case SchemaPackage.TYPE_UNITE4_D__VIDEO:
				setVideo((TypeDictionaryDicoThreeStates)newValue);
				return;
			case SchemaPackage.TYPE_UNITE4_D__VOIX:
				setVoix((TypeDictionaryDicoThreeStates)newValue);
				return;
			case SchemaPackage.TYPE_UNITE4_D__AFFICHAGE_PANNES:
				setAffichagePannes(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_UNITE4_D__SATELLITE:
				setSatellite((TypeDictionaryDicoThreeStates)newValue);
				return;
			case SchemaPackage.TYPE_UNITE4_D__RESEAU_SI:
				setReseauSI((TypeDictionaryDicoThreeStates)newValue);
				return;
			case SchemaPackage.TYPE_UNITE4_D__TD:
				setTD((TypeDictionaryDicoThreeStates)newValue);
				return;
			case SchemaPackage.TYPE_UNITE4_D__AUTRES:
				setAutres((TypeDictionaryDicoThreeStates)newValue);
				return;
			case SchemaPackage.TYPE_UNITE4_D__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_UNITE4_D__CE:
				setCE((String)newValue);
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
			case SchemaPackage.TYPE_UNITE4_D__VIDEO:
				unsetVideo();
				return;
			case SchemaPackage.TYPE_UNITE4_D__VOIX:
				unsetVoix();
				return;
			case SchemaPackage.TYPE_UNITE4_D__AFFICHAGE_PANNES:
				unsetAffichagePannes();
				return;
			case SchemaPackage.TYPE_UNITE4_D__SATELLITE:
				unsetSatellite();
				return;
			case SchemaPackage.TYPE_UNITE4_D__RESEAU_SI:
				unsetReseauSI();
				return;
			case SchemaPackage.TYPE_UNITE4_D__TD:
				unsetTD();
				return;
			case SchemaPackage.TYPE_UNITE4_D__AUTRES:
				unsetAutres();
				return;
			case SchemaPackage.TYPE_UNITE4_D__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_UNITE4_D__CE:
				setCE(CE_EDEFAULT);
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
			case SchemaPackage.TYPE_UNITE4_D__VIDEO:
				return isSetVideo();
			case SchemaPackage.TYPE_UNITE4_D__VOIX:
				return isSetVoix();
			case SchemaPackage.TYPE_UNITE4_D__AFFICHAGE_PANNES:
				return isSetAffichagePannes();
			case SchemaPackage.TYPE_UNITE4_D__SATELLITE:
				return isSetSatellite();
			case SchemaPackage.TYPE_UNITE4_D__RESEAU_SI:
				return isSetReseauSI();
			case SchemaPackage.TYPE_UNITE4_D__TD:
				return isSetTD();
			case SchemaPackage.TYPE_UNITE4_D__AUTRES:
				return isSetAutres();
			case SchemaPackage.TYPE_UNITE4_D__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_UNITE4_D__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
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
		result.append(" (video: ");
		if (videoESet) result.append(video); else result.append("<unset>");
		result.append(", voix: ");
		if (voixESet) result.append(voix); else result.append("<unset>");
		result.append(", affichagePannes: ");
		if (affichagePannesESet) result.append(affichagePannes); else result.append("<unset>");
		result.append(", satellite: ");
		if (satelliteESet) result.append(satellite); else result.append("<unset>");
		result.append(", reseauSI: ");
		if (reseauSIESet) result.append(reseauSI); else result.append("<unset>");
		result.append(", tD: ");
		if (tDESet) result.append(tD); else result.append("<unset>");
		result.append(", autres: ");
		if (autresESet) result.append(autres); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeUnite4DImpl
