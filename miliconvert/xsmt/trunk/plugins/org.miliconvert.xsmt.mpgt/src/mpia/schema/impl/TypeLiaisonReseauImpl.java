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
import mpia.meta.TypeDataTypeLongueur;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoLiaisonReseauCategorieDebit;
import mpia.schema.TypeDictionaryDicoLiaisonReseauModeCalcul;
import mpia.schema.TypeDictionaryDicoLiaisonReseauNaturePhysique;
import mpia.schema.TypeDictionaryDicoLiaisonReseauPolarisation;
import mpia.schema.TypeDictionaryDicoLiaisonReseauProfilTerrain;
import mpia.schema.TypeDictionaryDicoLiaisonReseauTypeClimat;
import mpia.schema.TypeEtatLiaison;
import mpia.schema.TypeLiaisonReseau;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Liaison Reseau</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeLiaisonReseauImpl#getNaturePhysique <em>Nature Physique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLiaisonReseauImpl#getMarge <em>Marge</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLiaisonReseauImpl#getGDHplanification <em>GD Hplanification</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLiaisonReseauImpl#getCoefficientRefractionAtmosphere <em>Coefficient Refraction Atmosphere</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLiaisonReseauImpl#getCategorieDebit <em>Categorie Debit</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLiaisonReseauImpl#getPasCoupe <em>Pas Coupe</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLiaisonReseauImpl#getModeCalcul <em>Mode Calcul</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLiaisonReseauImpl#getProfilTerrain <em>Profil Terrain</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLiaisonReseauImpl#getTypeClimat <em>Type Climat</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLiaisonReseauImpl#getNombreReductionsAutomatiquesContraintes <em>Nombre Reductions Automatiques Contraintes</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLiaisonReseauImpl#isTransmissionContrainte <em>Transmission Contrainte</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLiaisonReseauImpl#getPolarisation <em>Polarisation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLiaisonReseauImpl#isSursol <em>Sursol</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLiaisonReseauImpl#getEtatLiaisonEtatLiaison <em>Etat Liaison Etat Liaison</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLiaisonReseauImpl#getAPourTypeEquipementTypeEquipementElectronique <em>APour Type Equipement Type Equipement Electronique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLiaisonReseauImpl#getAPourExtremiteMaitrePionReseau <em>APour Extremite Maitre Pion Reseau</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLiaisonReseauImpl#getAPourExtremiteEsclavePionReseau <em>APour Extremite Esclave Pion Reseau</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeLiaisonReseauImpl extends TypeRacineOperationnelleImpl implements TypeLiaisonReseau {
	/**
	 * The default value of the '{@link #getNaturePhysique() <em>Nature Physique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNaturePhysique()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoLiaisonReseauNaturePhysique NATURE_PHYSIQUE_EDEFAULT = TypeDictionaryDicoLiaisonReseauNaturePhysique.CABLE;

	/**
	 * The cached value of the '{@link #getNaturePhysique() <em>Nature Physique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNaturePhysique()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoLiaisonReseauNaturePhysique naturePhysique = NATURE_PHYSIQUE_EDEFAULT;

	/**
	 * This is true if the Nature Physique attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean naturePhysiqueESet;

	/**
	 * The default value of the '{@link #getMarge() <em>Marge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarge()
	 * @generated
	 * @ordered
	 */
	protected static final double MARGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMarge() <em>Marge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarge()
	 * @generated
	 * @ordered
	 */
	protected double marge = MARGE_EDEFAULT;

	/**
	 * This is true if the Marge attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean margeESet;

	/**
	 * The default value of the '{@link #getGDHplanification() <em>GD Hplanification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHplanification()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GD_HPLANIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGDHplanification() <em>GD Hplanification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHplanification()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gDHplanification = GD_HPLANIFICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoefficientRefractionAtmosphere() <em>Coefficient Refraction Atmosphere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoefficientRefractionAtmosphere()
	 * @generated
	 * @ordered
	 */
	protected static final double COEFFICIENT_REFRACTION_ATMOSPHERE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCoefficientRefractionAtmosphere() <em>Coefficient Refraction Atmosphere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoefficientRefractionAtmosphere()
	 * @generated
	 * @ordered
	 */
	protected double coefficientRefractionAtmosphere = COEFFICIENT_REFRACTION_ATMOSPHERE_EDEFAULT;

	/**
	 * This is true if the Coefficient Refraction Atmosphere attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean coefficientRefractionAtmosphereESet;

	/**
	 * The default value of the '{@link #getCategorieDebit() <em>Categorie Debit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorieDebit()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoLiaisonReseauCategorieDebit CATEGORIE_DEBIT_EDEFAULT = TypeDictionaryDicoLiaisonReseauCategorieDebit.LB;

	/**
	 * The cached value of the '{@link #getCategorieDebit() <em>Categorie Debit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorieDebit()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoLiaisonReseauCategorieDebit categorieDebit = CATEGORIE_DEBIT_EDEFAULT;

	/**
	 * This is true if the Categorie Debit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieDebitESet;

	/**
	 * The cached value of the '{@link #getPasCoupe() <em>Pas Coupe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasCoupe()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur pasCoupe;

	/**
	 * The default value of the '{@link #getModeCalcul() <em>Mode Calcul</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeCalcul()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoLiaisonReseauModeCalcul MODE_CALCUL_EDEFAULT = TypeDictionaryDicoLiaisonReseauModeCalcul.OVGRNT;

	/**
	 * The cached value of the '{@link #getModeCalcul() <em>Mode Calcul</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeCalcul()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoLiaisonReseauModeCalcul modeCalcul = MODE_CALCUL_EDEFAULT;

	/**
	 * This is true if the Mode Calcul attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean modeCalculESet;

	/**
	 * The default value of the '{@link #getProfilTerrain() <em>Profil Terrain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfilTerrain()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoLiaisonReseauProfilTerrain PROFIL_TERRAIN_EDEFAULT = TypeDictionaryDicoLiaisonReseauProfilTerrain.HILL;

	/**
	 * The cached value of the '{@link #getProfilTerrain() <em>Profil Terrain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfilTerrain()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoLiaisonReseauProfilTerrain profilTerrain = PROFIL_TERRAIN_EDEFAULT;

	/**
	 * This is true if the Profil Terrain attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean profilTerrainESet;

	/**
	 * The default value of the '{@link #getTypeClimat() <em>Type Climat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeClimat()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoLiaisonReseauTypeClimat TYPE_CLIMAT_EDEFAULT = TypeDictionaryDicoLiaisonReseauTypeClimat.FAV;

	/**
	 * The cached value of the '{@link #getTypeClimat() <em>Type Climat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeClimat()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoLiaisonReseauTypeClimat typeClimat = TYPE_CLIMAT_EDEFAULT;

	/**
	 * This is true if the Type Climat attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeClimatESet;

	/**
	 * The default value of the '{@link #getNombreReductionsAutomatiquesContraintes() <em>Nombre Reductions Automatiques Contraintes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreReductionsAutomatiquesContraintes()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_REDUCTIONS_AUTOMATIQUES_CONTRAINTES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreReductionsAutomatiquesContraintes() <em>Nombre Reductions Automatiques Contraintes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreReductionsAutomatiquesContraintes()
	 * @generated
	 * @ordered
	 */
	protected long nombreReductionsAutomatiquesContraintes = NOMBRE_REDUCTIONS_AUTOMATIQUES_CONTRAINTES_EDEFAULT;

	/**
	 * This is true if the Nombre Reductions Automatiques Contraintes attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreReductionsAutomatiquesContraintesESet;

	/**
	 * The default value of the '{@link #isTransmissionContrainte() <em>Transmission Contrainte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransmissionContrainte()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSMISSION_CONTRAINTE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTransmissionContrainte() <em>Transmission Contrainte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransmissionContrainte()
	 * @generated
	 * @ordered
	 */
	protected boolean transmissionContrainte = TRANSMISSION_CONTRAINTE_EDEFAULT;

	/**
	 * This is true if the Transmission Contrainte attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transmissionContrainteESet;

	/**
	 * The default value of the '{@link #getPolarisation() <em>Polarisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolarisation()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoLiaisonReseauPolarisation POLARISATION_EDEFAULT = TypeDictionaryDicoLiaisonReseauPolarisation.VERT;

	/**
	 * The cached value of the '{@link #getPolarisation() <em>Polarisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolarisation()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoLiaisonReseauPolarisation polarisation = POLARISATION_EDEFAULT;

	/**
	 * This is true if the Polarisation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean polarisationESet;

	/**
	 * The default value of the '{@link #isSursol() <em>Sursol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSursol()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SURSOL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSursol() <em>Sursol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSursol()
	 * @generated
	 * @ordered
	 */
	protected boolean sursol = SURSOL_EDEFAULT;

	/**
	 * This is true if the Sursol attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sursolESet;

	/**
	 * The cached value of the '{@link #getEtatLiaisonEtatLiaison() <em>Etat Liaison Etat Liaison</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatLiaisonEtatLiaison()
	 * @generated
	 * @ordered
	 */
	protected TypeEtatLiaison etatLiaisonEtatLiaison;

	/**
	 * The cached value of the '{@link #getAPourTypeEquipementTypeEquipementElectronique() <em>APour Type Equipement Type Equipement Electronique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourTypeEquipementTypeEquipementElectronique()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourTypeEquipementTypeEquipementElectronique;

	/**
	 * The cached value of the '{@link #getAPourExtremiteMaitrePionReseau() <em>APour Extremite Maitre Pion Reseau</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourExtremiteMaitrePionReseau()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourExtremiteMaitrePionReseau;

	/**
	 * The cached value of the '{@link #getAPourExtremiteEsclavePionReseau() <em>APour Extremite Esclave Pion Reseau</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourExtremiteEsclavePionReseau()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourExtremiteEsclavePionReseau;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeLiaisonReseauImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeLiaisonReseau();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoLiaisonReseauNaturePhysique getNaturePhysique() {
		return naturePhysique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNaturePhysique(TypeDictionaryDicoLiaisonReseauNaturePhysique newNaturePhysique) {
		TypeDictionaryDicoLiaisonReseauNaturePhysique oldNaturePhysique = naturePhysique;
		naturePhysique = newNaturePhysique == null ? NATURE_PHYSIQUE_EDEFAULT : newNaturePhysique;
		boolean oldNaturePhysiqueESet = naturePhysiqueESet;
		naturePhysiqueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIAISON_RESEAU__NATURE_PHYSIQUE, oldNaturePhysique, naturePhysique, !oldNaturePhysiqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNaturePhysique() {
		TypeDictionaryDicoLiaisonReseauNaturePhysique oldNaturePhysique = naturePhysique;
		boolean oldNaturePhysiqueESet = naturePhysiqueESet;
		naturePhysique = NATURE_PHYSIQUE_EDEFAULT;
		naturePhysiqueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_LIAISON_RESEAU__NATURE_PHYSIQUE, oldNaturePhysique, NATURE_PHYSIQUE_EDEFAULT, oldNaturePhysiqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNaturePhysique() {
		return naturePhysiqueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMarge() {
		return marge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarge(double newMarge) {
		double oldMarge = marge;
		marge = newMarge;
		boolean oldMargeESet = margeESet;
		margeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIAISON_RESEAU__MARGE, oldMarge, marge, !oldMargeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMarge() {
		double oldMarge = marge;
		boolean oldMargeESet = margeESet;
		marge = MARGE_EDEFAULT;
		margeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_LIAISON_RESEAU__MARGE, oldMarge, MARGE_EDEFAULT, oldMargeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMarge() {
		return margeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGDHplanification() {
		return gDHplanification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGDHplanification(XMLGregorianCalendar newGDHplanification) {
		XMLGregorianCalendar oldGDHplanification = gDHplanification;
		gDHplanification = newGDHplanification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIAISON_RESEAU__GD_HPLANIFICATION, oldGDHplanification, gDHplanification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCoefficientRefractionAtmosphere() {
		return coefficientRefractionAtmosphere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoefficientRefractionAtmosphere(double newCoefficientRefractionAtmosphere) {
		double oldCoefficientRefractionAtmosphere = coefficientRefractionAtmosphere;
		coefficientRefractionAtmosphere = newCoefficientRefractionAtmosphere;
		boolean oldCoefficientRefractionAtmosphereESet = coefficientRefractionAtmosphereESet;
		coefficientRefractionAtmosphereESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIAISON_RESEAU__COEFFICIENT_REFRACTION_ATMOSPHERE, oldCoefficientRefractionAtmosphere, coefficientRefractionAtmosphere, !oldCoefficientRefractionAtmosphereESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCoefficientRefractionAtmosphere() {
		double oldCoefficientRefractionAtmosphere = coefficientRefractionAtmosphere;
		boolean oldCoefficientRefractionAtmosphereESet = coefficientRefractionAtmosphereESet;
		coefficientRefractionAtmosphere = COEFFICIENT_REFRACTION_ATMOSPHERE_EDEFAULT;
		coefficientRefractionAtmosphereESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_LIAISON_RESEAU__COEFFICIENT_REFRACTION_ATMOSPHERE, oldCoefficientRefractionAtmosphere, COEFFICIENT_REFRACTION_ATMOSPHERE_EDEFAULT, oldCoefficientRefractionAtmosphereESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCoefficientRefractionAtmosphere() {
		return coefficientRefractionAtmosphereESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoLiaisonReseauCategorieDebit getCategorieDebit() {
		return categorieDebit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorieDebit(TypeDictionaryDicoLiaisonReseauCategorieDebit newCategorieDebit) {
		TypeDictionaryDicoLiaisonReseauCategorieDebit oldCategorieDebit = categorieDebit;
		categorieDebit = newCategorieDebit == null ? CATEGORIE_DEBIT_EDEFAULT : newCategorieDebit;
		boolean oldCategorieDebitESet = categorieDebitESet;
		categorieDebitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIAISON_RESEAU__CATEGORIE_DEBIT, oldCategorieDebit, categorieDebit, !oldCategorieDebitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorieDebit() {
		TypeDictionaryDicoLiaisonReseauCategorieDebit oldCategorieDebit = categorieDebit;
		boolean oldCategorieDebitESet = categorieDebitESet;
		categorieDebit = CATEGORIE_DEBIT_EDEFAULT;
		categorieDebitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_LIAISON_RESEAU__CATEGORIE_DEBIT, oldCategorieDebit, CATEGORIE_DEBIT_EDEFAULT, oldCategorieDebitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCategorieDebit() {
		return categorieDebitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getPasCoupe() {
		return pasCoupe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPasCoupe(TypeDataTypeLongueur newPasCoupe, NotificationChain msgs) {
		TypeDataTypeLongueur oldPasCoupe = pasCoupe;
		pasCoupe = newPasCoupe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIAISON_RESEAU__PAS_COUPE, oldPasCoupe, newPasCoupe);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPasCoupe(TypeDataTypeLongueur newPasCoupe) {
		if (newPasCoupe != pasCoupe) {
			NotificationChain msgs = null;
			if (pasCoupe != null)
				msgs = ((InternalEObject)pasCoupe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_LIAISON_RESEAU__PAS_COUPE, null, msgs);
			if (newPasCoupe != null)
				msgs = ((InternalEObject)newPasCoupe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_LIAISON_RESEAU__PAS_COUPE, null, msgs);
			msgs = basicSetPasCoupe(newPasCoupe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIAISON_RESEAU__PAS_COUPE, newPasCoupe, newPasCoupe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoLiaisonReseauModeCalcul getModeCalcul() {
		return modeCalcul;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModeCalcul(TypeDictionaryDicoLiaisonReseauModeCalcul newModeCalcul) {
		TypeDictionaryDicoLiaisonReseauModeCalcul oldModeCalcul = modeCalcul;
		modeCalcul = newModeCalcul == null ? MODE_CALCUL_EDEFAULT : newModeCalcul;
		boolean oldModeCalculESet = modeCalculESet;
		modeCalculESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIAISON_RESEAU__MODE_CALCUL, oldModeCalcul, modeCalcul, !oldModeCalculESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetModeCalcul() {
		TypeDictionaryDicoLiaisonReseauModeCalcul oldModeCalcul = modeCalcul;
		boolean oldModeCalculESet = modeCalculESet;
		modeCalcul = MODE_CALCUL_EDEFAULT;
		modeCalculESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_LIAISON_RESEAU__MODE_CALCUL, oldModeCalcul, MODE_CALCUL_EDEFAULT, oldModeCalculESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetModeCalcul() {
		return modeCalculESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoLiaisonReseauProfilTerrain getProfilTerrain() {
		return profilTerrain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfilTerrain(TypeDictionaryDicoLiaisonReseauProfilTerrain newProfilTerrain) {
		TypeDictionaryDicoLiaisonReseauProfilTerrain oldProfilTerrain = profilTerrain;
		profilTerrain = newProfilTerrain == null ? PROFIL_TERRAIN_EDEFAULT : newProfilTerrain;
		boolean oldProfilTerrainESet = profilTerrainESet;
		profilTerrainESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIAISON_RESEAU__PROFIL_TERRAIN, oldProfilTerrain, profilTerrain, !oldProfilTerrainESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProfilTerrain() {
		TypeDictionaryDicoLiaisonReseauProfilTerrain oldProfilTerrain = profilTerrain;
		boolean oldProfilTerrainESet = profilTerrainESet;
		profilTerrain = PROFIL_TERRAIN_EDEFAULT;
		profilTerrainESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_LIAISON_RESEAU__PROFIL_TERRAIN, oldProfilTerrain, PROFIL_TERRAIN_EDEFAULT, oldProfilTerrainESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProfilTerrain() {
		return profilTerrainESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoLiaisonReseauTypeClimat getTypeClimat() {
		return typeClimat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeClimat(TypeDictionaryDicoLiaisonReseauTypeClimat newTypeClimat) {
		TypeDictionaryDicoLiaisonReseauTypeClimat oldTypeClimat = typeClimat;
		typeClimat = newTypeClimat == null ? TYPE_CLIMAT_EDEFAULT : newTypeClimat;
		boolean oldTypeClimatESet = typeClimatESet;
		typeClimatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIAISON_RESEAU__TYPE_CLIMAT, oldTypeClimat, typeClimat, !oldTypeClimatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeClimat() {
		TypeDictionaryDicoLiaisonReseauTypeClimat oldTypeClimat = typeClimat;
		boolean oldTypeClimatESet = typeClimatESet;
		typeClimat = TYPE_CLIMAT_EDEFAULT;
		typeClimatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_LIAISON_RESEAU__TYPE_CLIMAT, oldTypeClimat, TYPE_CLIMAT_EDEFAULT, oldTypeClimatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeClimat() {
		return typeClimatESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreReductionsAutomatiquesContraintes() {
		return nombreReductionsAutomatiquesContraintes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreReductionsAutomatiquesContraintes(long newNombreReductionsAutomatiquesContraintes) {
		long oldNombreReductionsAutomatiquesContraintes = nombreReductionsAutomatiquesContraintes;
		nombreReductionsAutomatiquesContraintes = newNombreReductionsAutomatiquesContraintes;
		boolean oldNombreReductionsAutomatiquesContraintesESet = nombreReductionsAutomatiquesContraintesESet;
		nombreReductionsAutomatiquesContraintesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIAISON_RESEAU__NOMBRE_REDUCTIONS_AUTOMATIQUES_CONTRAINTES, oldNombreReductionsAutomatiquesContraintes, nombreReductionsAutomatiquesContraintes, !oldNombreReductionsAutomatiquesContraintesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreReductionsAutomatiquesContraintes() {
		long oldNombreReductionsAutomatiquesContraintes = nombreReductionsAutomatiquesContraintes;
		boolean oldNombreReductionsAutomatiquesContraintesESet = nombreReductionsAutomatiquesContraintesESet;
		nombreReductionsAutomatiquesContraintes = NOMBRE_REDUCTIONS_AUTOMATIQUES_CONTRAINTES_EDEFAULT;
		nombreReductionsAutomatiquesContraintesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_LIAISON_RESEAU__NOMBRE_REDUCTIONS_AUTOMATIQUES_CONTRAINTES, oldNombreReductionsAutomatiquesContraintes, NOMBRE_REDUCTIONS_AUTOMATIQUES_CONTRAINTES_EDEFAULT, oldNombreReductionsAutomatiquesContraintesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreReductionsAutomatiquesContraintes() {
		return nombreReductionsAutomatiquesContraintesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTransmissionContrainte() {
		return transmissionContrainte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransmissionContrainte(boolean newTransmissionContrainte) {
		boolean oldTransmissionContrainte = transmissionContrainte;
		transmissionContrainte = newTransmissionContrainte;
		boolean oldTransmissionContrainteESet = transmissionContrainteESet;
		transmissionContrainteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIAISON_RESEAU__TRANSMISSION_CONTRAINTE, oldTransmissionContrainte, transmissionContrainte, !oldTransmissionContrainteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransmissionContrainte() {
		boolean oldTransmissionContrainte = transmissionContrainte;
		boolean oldTransmissionContrainteESet = transmissionContrainteESet;
		transmissionContrainte = TRANSMISSION_CONTRAINTE_EDEFAULT;
		transmissionContrainteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_LIAISON_RESEAU__TRANSMISSION_CONTRAINTE, oldTransmissionContrainte, TRANSMISSION_CONTRAINTE_EDEFAULT, oldTransmissionContrainteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransmissionContrainte() {
		return transmissionContrainteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoLiaisonReseauPolarisation getPolarisation() {
		return polarisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolarisation(TypeDictionaryDicoLiaisonReseauPolarisation newPolarisation) {
		TypeDictionaryDicoLiaisonReseauPolarisation oldPolarisation = polarisation;
		polarisation = newPolarisation == null ? POLARISATION_EDEFAULT : newPolarisation;
		boolean oldPolarisationESet = polarisationESet;
		polarisationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIAISON_RESEAU__POLARISATION, oldPolarisation, polarisation, !oldPolarisationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPolarisation() {
		TypeDictionaryDicoLiaisonReseauPolarisation oldPolarisation = polarisation;
		boolean oldPolarisationESet = polarisationESet;
		polarisation = POLARISATION_EDEFAULT;
		polarisationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_LIAISON_RESEAU__POLARISATION, oldPolarisation, POLARISATION_EDEFAULT, oldPolarisationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPolarisation() {
		return polarisationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSursol() {
		return sursol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSursol(boolean newSursol) {
		boolean oldSursol = sursol;
		sursol = newSursol;
		boolean oldSursolESet = sursolESet;
		sursolESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIAISON_RESEAU__SURSOL, oldSursol, sursol, !oldSursolESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSursol() {
		boolean oldSursol = sursol;
		boolean oldSursolESet = sursolESet;
		sursol = SURSOL_EDEFAULT;
		sursolESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_LIAISON_RESEAU__SURSOL, oldSursol, SURSOL_EDEFAULT, oldSursolESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSursol() {
		return sursolESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeEtatLiaison getEtatLiaisonEtatLiaison() {
		return etatLiaisonEtatLiaison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEtatLiaisonEtatLiaison(TypeEtatLiaison newEtatLiaisonEtatLiaison, NotificationChain msgs) {
		TypeEtatLiaison oldEtatLiaisonEtatLiaison = etatLiaisonEtatLiaison;
		etatLiaisonEtatLiaison = newEtatLiaisonEtatLiaison;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIAISON_RESEAU__ETAT_LIAISON_ETAT_LIAISON, oldEtatLiaisonEtatLiaison, newEtatLiaisonEtatLiaison);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatLiaisonEtatLiaison(TypeEtatLiaison newEtatLiaisonEtatLiaison) {
		if (newEtatLiaisonEtatLiaison != etatLiaisonEtatLiaison) {
			NotificationChain msgs = null;
			if (etatLiaisonEtatLiaison != null)
				msgs = ((InternalEObject)etatLiaisonEtatLiaison).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_LIAISON_RESEAU__ETAT_LIAISON_ETAT_LIAISON, null, msgs);
			if (newEtatLiaisonEtatLiaison != null)
				msgs = ((InternalEObject)newEtatLiaisonEtatLiaison).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_LIAISON_RESEAU__ETAT_LIAISON_ETAT_LIAISON, null, msgs);
			msgs = basicSetEtatLiaisonEtatLiaison(newEtatLiaisonEtatLiaison, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIAISON_RESEAU__ETAT_LIAISON_ETAT_LIAISON, newEtatLiaisonEtatLiaison, newEtatLiaisonEtatLiaison));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourTypeEquipementTypeEquipementElectronique() {
		return aPourTypeEquipementTypeEquipementElectronique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourTypeEquipementTypeEquipementElectronique(TypeAssociationEXT newAPourTypeEquipementTypeEquipementElectronique, NotificationChain msgs) {
		TypeAssociationEXT oldAPourTypeEquipementTypeEquipementElectronique = aPourTypeEquipementTypeEquipementElectronique;
		aPourTypeEquipementTypeEquipementElectronique = newAPourTypeEquipementTypeEquipementElectronique;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIAISON_RESEAU__APOUR_TYPE_EQUIPEMENT_TYPE_EQUIPEMENT_ELECTRONIQUE, oldAPourTypeEquipementTypeEquipementElectronique, newAPourTypeEquipementTypeEquipementElectronique);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourTypeEquipementTypeEquipementElectronique(TypeAssociationEXT newAPourTypeEquipementTypeEquipementElectronique) {
		if (newAPourTypeEquipementTypeEquipementElectronique != aPourTypeEquipementTypeEquipementElectronique) {
			NotificationChain msgs = null;
			if (aPourTypeEquipementTypeEquipementElectronique != null)
				msgs = ((InternalEObject)aPourTypeEquipementTypeEquipementElectronique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_LIAISON_RESEAU__APOUR_TYPE_EQUIPEMENT_TYPE_EQUIPEMENT_ELECTRONIQUE, null, msgs);
			if (newAPourTypeEquipementTypeEquipementElectronique != null)
				msgs = ((InternalEObject)newAPourTypeEquipementTypeEquipementElectronique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_LIAISON_RESEAU__APOUR_TYPE_EQUIPEMENT_TYPE_EQUIPEMENT_ELECTRONIQUE, null, msgs);
			msgs = basicSetAPourTypeEquipementTypeEquipementElectronique(newAPourTypeEquipementTypeEquipementElectronique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIAISON_RESEAU__APOUR_TYPE_EQUIPEMENT_TYPE_EQUIPEMENT_ELECTRONIQUE, newAPourTypeEquipementTypeEquipementElectronique, newAPourTypeEquipementTypeEquipementElectronique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourExtremiteMaitrePionReseau() {
		return aPourExtremiteMaitrePionReseau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourExtremiteMaitrePionReseau(TypeAssociation newAPourExtremiteMaitrePionReseau, NotificationChain msgs) {
		TypeAssociation oldAPourExtremiteMaitrePionReseau = aPourExtremiteMaitrePionReseau;
		aPourExtremiteMaitrePionReseau = newAPourExtremiteMaitrePionReseau;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIAISON_RESEAU__APOUR_EXTREMITE_MAITRE_PION_RESEAU, oldAPourExtremiteMaitrePionReseau, newAPourExtremiteMaitrePionReseau);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourExtremiteMaitrePionReseau(TypeAssociation newAPourExtremiteMaitrePionReseau) {
		if (newAPourExtremiteMaitrePionReseau != aPourExtremiteMaitrePionReseau) {
			NotificationChain msgs = null;
			if (aPourExtremiteMaitrePionReseau != null)
				msgs = ((InternalEObject)aPourExtremiteMaitrePionReseau).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_LIAISON_RESEAU__APOUR_EXTREMITE_MAITRE_PION_RESEAU, null, msgs);
			if (newAPourExtremiteMaitrePionReseau != null)
				msgs = ((InternalEObject)newAPourExtremiteMaitrePionReseau).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_LIAISON_RESEAU__APOUR_EXTREMITE_MAITRE_PION_RESEAU, null, msgs);
			msgs = basicSetAPourExtremiteMaitrePionReseau(newAPourExtremiteMaitrePionReseau, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIAISON_RESEAU__APOUR_EXTREMITE_MAITRE_PION_RESEAU, newAPourExtremiteMaitrePionReseau, newAPourExtremiteMaitrePionReseau));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourExtremiteEsclavePionReseau() {
		return aPourExtremiteEsclavePionReseau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourExtremiteEsclavePionReseau(TypeAssociation newAPourExtremiteEsclavePionReseau, NotificationChain msgs) {
		TypeAssociation oldAPourExtremiteEsclavePionReseau = aPourExtremiteEsclavePionReseau;
		aPourExtremiteEsclavePionReseau = newAPourExtremiteEsclavePionReseau;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIAISON_RESEAU__APOUR_EXTREMITE_ESCLAVE_PION_RESEAU, oldAPourExtremiteEsclavePionReseau, newAPourExtremiteEsclavePionReseau);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourExtremiteEsclavePionReseau(TypeAssociation newAPourExtremiteEsclavePionReseau) {
		if (newAPourExtremiteEsclavePionReseau != aPourExtremiteEsclavePionReseau) {
			NotificationChain msgs = null;
			if (aPourExtremiteEsclavePionReseau != null)
				msgs = ((InternalEObject)aPourExtremiteEsclavePionReseau).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_LIAISON_RESEAU__APOUR_EXTREMITE_ESCLAVE_PION_RESEAU, null, msgs);
			if (newAPourExtremiteEsclavePionReseau != null)
				msgs = ((InternalEObject)newAPourExtremiteEsclavePionReseau).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_LIAISON_RESEAU__APOUR_EXTREMITE_ESCLAVE_PION_RESEAU, null, msgs);
			msgs = basicSetAPourExtremiteEsclavePionReseau(newAPourExtremiteEsclavePionReseau, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIAISON_RESEAU__APOUR_EXTREMITE_ESCLAVE_PION_RESEAU, newAPourExtremiteEsclavePionReseau, newAPourExtremiteEsclavePionReseau));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_LIAISON_RESEAU__PAS_COUPE:
				return basicSetPasCoupe(null, msgs);
			case SchemaPackage.TYPE_LIAISON_RESEAU__ETAT_LIAISON_ETAT_LIAISON:
				return basicSetEtatLiaisonEtatLiaison(null, msgs);
			case SchemaPackage.TYPE_LIAISON_RESEAU__APOUR_TYPE_EQUIPEMENT_TYPE_EQUIPEMENT_ELECTRONIQUE:
				return basicSetAPourTypeEquipementTypeEquipementElectronique(null, msgs);
			case SchemaPackage.TYPE_LIAISON_RESEAU__APOUR_EXTREMITE_MAITRE_PION_RESEAU:
				return basicSetAPourExtremiteMaitrePionReseau(null, msgs);
			case SchemaPackage.TYPE_LIAISON_RESEAU__APOUR_EXTREMITE_ESCLAVE_PION_RESEAU:
				return basicSetAPourExtremiteEsclavePionReseau(null, msgs);
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
			case SchemaPackage.TYPE_LIAISON_RESEAU__NATURE_PHYSIQUE:
				return getNaturePhysique();
			case SchemaPackage.TYPE_LIAISON_RESEAU__MARGE:
				return new Double(getMarge());
			case SchemaPackage.TYPE_LIAISON_RESEAU__GD_HPLANIFICATION:
				return getGDHplanification();
			case SchemaPackage.TYPE_LIAISON_RESEAU__COEFFICIENT_REFRACTION_ATMOSPHERE:
				return new Double(getCoefficientRefractionAtmosphere());
			case SchemaPackage.TYPE_LIAISON_RESEAU__CATEGORIE_DEBIT:
				return getCategorieDebit();
			case SchemaPackage.TYPE_LIAISON_RESEAU__PAS_COUPE:
				return getPasCoupe();
			case SchemaPackage.TYPE_LIAISON_RESEAU__MODE_CALCUL:
				return getModeCalcul();
			case SchemaPackage.TYPE_LIAISON_RESEAU__PROFIL_TERRAIN:
				return getProfilTerrain();
			case SchemaPackage.TYPE_LIAISON_RESEAU__TYPE_CLIMAT:
				return getTypeClimat();
			case SchemaPackage.TYPE_LIAISON_RESEAU__NOMBRE_REDUCTIONS_AUTOMATIQUES_CONTRAINTES:
				return new Long(getNombreReductionsAutomatiquesContraintes());
			case SchemaPackage.TYPE_LIAISON_RESEAU__TRANSMISSION_CONTRAINTE:
				return isTransmissionContrainte() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_LIAISON_RESEAU__POLARISATION:
				return getPolarisation();
			case SchemaPackage.TYPE_LIAISON_RESEAU__SURSOL:
				return isSursol() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_LIAISON_RESEAU__ETAT_LIAISON_ETAT_LIAISON:
				return getEtatLiaisonEtatLiaison();
			case SchemaPackage.TYPE_LIAISON_RESEAU__APOUR_TYPE_EQUIPEMENT_TYPE_EQUIPEMENT_ELECTRONIQUE:
				return getAPourTypeEquipementTypeEquipementElectronique();
			case SchemaPackage.TYPE_LIAISON_RESEAU__APOUR_EXTREMITE_MAITRE_PION_RESEAU:
				return getAPourExtremiteMaitrePionReseau();
			case SchemaPackage.TYPE_LIAISON_RESEAU__APOUR_EXTREMITE_ESCLAVE_PION_RESEAU:
				return getAPourExtremiteEsclavePionReseau();
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
			case SchemaPackage.TYPE_LIAISON_RESEAU__NATURE_PHYSIQUE:
				setNaturePhysique((TypeDictionaryDicoLiaisonReseauNaturePhysique)newValue);
				return;
			case SchemaPackage.TYPE_LIAISON_RESEAU__MARGE:
				setMarge(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_LIAISON_RESEAU__GD_HPLANIFICATION:
				setGDHplanification((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_LIAISON_RESEAU__COEFFICIENT_REFRACTION_ATMOSPHERE:
				setCoefficientRefractionAtmosphere(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_LIAISON_RESEAU__CATEGORIE_DEBIT:
				setCategorieDebit((TypeDictionaryDicoLiaisonReseauCategorieDebit)newValue);
				return;
			case SchemaPackage.TYPE_LIAISON_RESEAU__PAS_COUPE:
				setPasCoupe((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_LIAISON_RESEAU__MODE_CALCUL:
				setModeCalcul((TypeDictionaryDicoLiaisonReseauModeCalcul)newValue);
				return;
			case SchemaPackage.TYPE_LIAISON_RESEAU__PROFIL_TERRAIN:
				setProfilTerrain((TypeDictionaryDicoLiaisonReseauProfilTerrain)newValue);
				return;
			case SchemaPackage.TYPE_LIAISON_RESEAU__TYPE_CLIMAT:
				setTypeClimat((TypeDictionaryDicoLiaisonReseauTypeClimat)newValue);
				return;
			case SchemaPackage.TYPE_LIAISON_RESEAU__NOMBRE_REDUCTIONS_AUTOMATIQUES_CONTRAINTES:
				setNombreReductionsAutomatiquesContraintes(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_LIAISON_RESEAU__TRANSMISSION_CONTRAINTE:
				setTransmissionContrainte(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_LIAISON_RESEAU__POLARISATION:
				setPolarisation((TypeDictionaryDicoLiaisonReseauPolarisation)newValue);
				return;
			case SchemaPackage.TYPE_LIAISON_RESEAU__SURSOL:
				setSursol(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_LIAISON_RESEAU__ETAT_LIAISON_ETAT_LIAISON:
				setEtatLiaisonEtatLiaison((TypeEtatLiaison)newValue);
				return;
			case SchemaPackage.TYPE_LIAISON_RESEAU__APOUR_TYPE_EQUIPEMENT_TYPE_EQUIPEMENT_ELECTRONIQUE:
				setAPourTypeEquipementTypeEquipementElectronique((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_LIAISON_RESEAU__APOUR_EXTREMITE_MAITRE_PION_RESEAU:
				setAPourExtremiteMaitrePionReseau((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_LIAISON_RESEAU__APOUR_EXTREMITE_ESCLAVE_PION_RESEAU:
				setAPourExtremiteEsclavePionReseau((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_LIAISON_RESEAU__NATURE_PHYSIQUE:
				unsetNaturePhysique();
				return;
			case SchemaPackage.TYPE_LIAISON_RESEAU__MARGE:
				unsetMarge();
				return;
			case SchemaPackage.TYPE_LIAISON_RESEAU__GD_HPLANIFICATION:
				setGDHplanification(GD_HPLANIFICATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_LIAISON_RESEAU__COEFFICIENT_REFRACTION_ATMOSPHERE:
				unsetCoefficientRefractionAtmosphere();
				return;
			case SchemaPackage.TYPE_LIAISON_RESEAU__CATEGORIE_DEBIT:
				unsetCategorieDebit();
				return;
			case SchemaPackage.TYPE_LIAISON_RESEAU__PAS_COUPE:
				setPasCoupe((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_LIAISON_RESEAU__MODE_CALCUL:
				unsetModeCalcul();
				return;
			case SchemaPackage.TYPE_LIAISON_RESEAU__PROFIL_TERRAIN:
				unsetProfilTerrain();
				return;
			case SchemaPackage.TYPE_LIAISON_RESEAU__TYPE_CLIMAT:
				unsetTypeClimat();
				return;
			case SchemaPackage.TYPE_LIAISON_RESEAU__NOMBRE_REDUCTIONS_AUTOMATIQUES_CONTRAINTES:
				unsetNombreReductionsAutomatiquesContraintes();
				return;
			case SchemaPackage.TYPE_LIAISON_RESEAU__TRANSMISSION_CONTRAINTE:
				unsetTransmissionContrainte();
				return;
			case SchemaPackage.TYPE_LIAISON_RESEAU__POLARISATION:
				unsetPolarisation();
				return;
			case SchemaPackage.TYPE_LIAISON_RESEAU__SURSOL:
				unsetSursol();
				return;
			case SchemaPackage.TYPE_LIAISON_RESEAU__ETAT_LIAISON_ETAT_LIAISON:
				setEtatLiaisonEtatLiaison((TypeEtatLiaison)null);
				return;
			case SchemaPackage.TYPE_LIAISON_RESEAU__APOUR_TYPE_EQUIPEMENT_TYPE_EQUIPEMENT_ELECTRONIQUE:
				setAPourTypeEquipementTypeEquipementElectronique((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_LIAISON_RESEAU__APOUR_EXTREMITE_MAITRE_PION_RESEAU:
				setAPourExtremiteMaitrePionReseau((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_LIAISON_RESEAU__APOUR_EXTREMITE_ESCLAVE_PION_RESEAU:
				setAPourExtremiteEsclavePionReseau((TypeAssociation)null);
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
			case SchemaPackage.TYPE_LIAISON_RESEAU__NATURE_PHYSIQUE:
				return isSetNaturePhysique();
			case SchemaPackage.TYPE_LIAISON_RESEAU__MARGE:
				return isSetMarge();
			case SchemaPackage.TYPE_LIAISON_RESEAU__GD_HPLANIFICATION:
				return GD_HPLANIFICATION_EDEFAULT == null ? gDHplanification != null : !GD_HPLANIFICATION_EDEFAULT.equals(gDHplanification);
			case SchemaPackage.TYPE_LIAISON_RESEAU__COEFFICIENT_REFRACTION_ATMOSPHERE:
				return isSetCoefficientRefractionAtmosphere();
			case SchemaPackage.TYPE_LIAISON_RESEAU__CATEGORIE_DEBIT:
				return isSetCategorieDebit();
			case SchemaPackage.TYPE_LIAISON_RESEAU__PAS_COUPE:
				return pasCoupe != null;
			case SchemaPackage.TYPE_LIAISON_RESEAU__MODE_CALCUL:
				return isSetModeCalcul();
			case SchemaPackage.TYPE_LIAISON_RESEAU__PROFIL_TERRAIN:
				return isSetProfilTerrain();
			case SchemaPackage.TYPE_LIAISON_RESEAU__TYPE_CLIMAT:
				return isSetTypeClimat();
			case SchemaPackage.TYPE_LIAISON_RESEAU__NOMBRE_REDUCTIONS_AUTOMATIQUES_CONTRAINTES:
				return isSetNombreReductionsAutomatiquesContraintes();
			case SchemaPackage.TYPE_LIAISON_RESEAU__TRANSMISSION_CONTRAINTE:
				return isSetTransmissionContrainte();
			case SchemaPackage.TYPE_LIAISON_RESEAU__POLARISATION:
				return isSetPolarisation();
			case SchemaPackage.TYPE_LIAISON_RESEAU__SURSOL:
				return isSetSursol();
			case SchemaPackage.TYPE_LIAISON_RESEAU__ETAT_LIAISON_ETAT_LIAISON:
				return etatLiaisonEtatLiaison != null;
			case SchemaPackage.TYPE_LIAISON_RESEAU__APOUR_TYPE_EQUIPEMENT_TYPE_EQUIPEMENT_ELECTRONIQUE:
				return aPourTypeEquipementTypeEquipementElectronique != null;
			case SchemaPackage.TYPE_LIAISON_RESEAU__APOUR_EXTREMITE_MAITRE_PION_RESEAU:
				return aPourExtremiteMaitrePionReseau != null;
			case SchemaPackage.TYPE_LIAISON_RESEAU__APOUR_EXTREMITE_ESCLAVE_PION_RESEAU:
				return aPourExtremiteEsclavePionReseau != null;
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
		result.append(" (naturePhysique: ");
		if (naturePhysiqueESet) result.append(naturePhysique); else result.append("<unset>");
		result.append(", marge: ");
		if (margeESet) result.append(marge); else result.append("<unset>");
		result.append(", gDHplanification: ");
		result.append(gDHplanification);
		result.append(", coefficientRefractionAtmosphere: ");
		if (coefficientRefractionAtmosphereESet) result.append(coefficientRefractionAtmosphere); else result.append("<unset>");
		result.append(", categorieDebit: ");
		if (categorieDebitESet) result.append(categorieDebit); else result.append("<unset>");
		result.append(", modeCalcul: ");
		if (modeCalculESet) result.append(modeCalcul); else result.append("<unset>");
		result.append(", profilTerrain: ");
		if (profilTerrainESet) result.append(profilTerrain); else result.append("<unset>");
		result.append(", typeClimat: ");
		if (typeClimatESet) result.append(typeClimat); else result.append("<unset>");
		result.append(", nombreReductionsAutomatiquesContraintes: ");
		if (nombreReductionsAutomatiquesContraintesESet) result.append(nombreReductionsAutomatiquesContraintes); else result.append("<unset>");
		result.append(", transmissionContrainte: ");
		if (transmissionContrainteESet) result.append(transmissionContrainte); else result.append("<unset>");
		result.append(", polarisation: ");
		if (polarisationESet) result.append(polarisation); else result.append("<unset>");
		result.append(", sursol: ");
		if (sursolESet) result.append(sursol); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeLiaisonReseauImpl
