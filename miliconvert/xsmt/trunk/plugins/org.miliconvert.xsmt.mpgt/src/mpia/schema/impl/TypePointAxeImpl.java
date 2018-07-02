/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeLongueur;
import mpia.meta.TypeDataTypeMasse;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoTypePointAxe;
import mpia.schema.TypePointAxe;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Point Axe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePointAxeImpl#getToponyme <em>Toponyme</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePointAxeImpl#getTypePointAxe <em>Type Point Axe</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePointAxeImpl#isRecompletementCarburant <em>Recompletement Carburant</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePointAxeImpl#isReparationMateriel <em>Reparation Materiel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePointAxeImpl#isPosteSecours <em>Poste Secours</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePointAxeImpl#isFrontiere <em>Frontiere</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePointAxeImpl#getClasseMilMaxPourVehiculesARoue <em>Classe Mil Max Pour Vehicules ARoue</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePointAxeImpl#getClasseMiMaxPourVehiculesAChenilles <em>Classe Mi Max Pour Vehicules AChenilles</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePointAxeImpl#getPTRAplusLourdARoues <em>PTR Aplus Lourd ARoues</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePointAxeImpl#getPTRAplusLourdAChenilles <em>PTR Aplus Lourd AChenilles</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePointAxeImpl#getChargeEssieu <em>Charge Essieu</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePointAxeImpl#getHauteurMaximaleVehicules <em>Hauteur Maximale Vehicules</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePointAxeImpl#getLargeurMaximaleVehicule <em>Largeur Maximale Vehicule</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePointAxeImpl#getRayonBraquageMaximal <em>Rayon Braquage Maximal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePointAxeImpl extends TypeElementControleImpl implements TypePointAxe {
	/**
	 * The default value of the '{@link #getToponyme() <em>Toponyme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToponyme()
	 * @generated
	 * @ordered
	 */
	protected static final String TOPONYME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToponyme() <em>Toponyme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToponyme()
	 * @generated
	 * @ordered
	 */
	protected String toponyme = TOPONYME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypePointAxe() <em>Type Point Axe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypePointAxe()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypePointAxe TYPE_POINT_AXE_EDEFAULT = TypeDictionaryDicoTypePointAxe.TOWN;

	/**
	 * The cached value of the '{@link #getTypePointAxe() <em>Type Point Axe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypePointAxe()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypePointAxe typePointAxe = TYPE_POINT_AXE_EDEFAULT;

	/**
	 * This is true if the Type Point Axe attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typePointAxeESet;

	/**
	 * The default value of the '{@link #isRecompletementCarburant() <em>Recompletement Carburant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRecompletementCarburant()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RECOMPLETEMENT_CARBURANT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRecompletementCarburant() <em>Recompletement Carburant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRecompletementCarburant()
	 * @generated
	 * @ordered
	 */
	protected boolean recompletementCarburant = RECOMPLETEMENT_CARBURANT_EDEFAULT;

	/**
	 * This is true if the Recompletement Carburant attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean recompletementCarburantESet;

	/**
	 * The default value of the '{@link #isReparationMateriel() <em>Reparation Materiel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReparationMateriel()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REPARATION_MATERIEL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReparationMateriel() <em>Reparation Materiel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReparationMateriel()
	 * @generated
	 * @ordered
	 */
	protected boolean reparationMateriel = REPARATION_MATERIEL_EDEFAULT;

	/**
	 * This is true if the Reparation Materiel attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean reparationMaterielESet;

	/**
	 * The default value of the '{@link #isPosteSecours() <em>Poste Secours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPosteSecours()
	 * @generated
	 * @ordered
	 */
	protected static final boolean POSTE_SECOURS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPosteSecours() <em>Poste Secours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPosteSecours()
	 * @generated
	 * @ordered
	 */
	protected boolean posteSecours = POSTE_SECOURS_EDEFAULT;

	/**
	 * This is true if the Poste Secours attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean posteSecoursESet;

	/**
	 * The default value of the '{@link #isFrontiere() <em>Frontiere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFrontiere()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FRONTIERE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFrontiere() <em>Frontiere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFrontiere()
	 * @generated
	 * @ordered
	 */
	protected boolean frontiere = FRONTIERE_EDEFAULT;

	/**
	 * This is true if the Frontiere attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean frontiereESet;

	/**
	 * The default value of the '{@link #getClasseMilMaxPourVehiculesARoue() <em>Classe Mil Max Pour Vehicules ARoue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasseMilMaxPourVehiculesARoue()
	 * @generated
	 * @ordered
	 */
	protected static final long CLASSE_MIL_MAX_POUR_VEHICULES_AROUE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getClasseMilMaxPourVehiculesARoue() <em>Classe Mil Max Pour Vehicules ARoue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasseMilMaxPourVehiculesARoue()
	 * @generated
	 * @ordered
	 */
	protected long classeMilMaxPourVehiculesARoue = CLASSE_MIL_MAX_POUR_VEHICULES_AROUE_EDEFAULT;

	/**
	 * This is true if the Classe Mil Max Pour Vehicules ARoue attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean classeMilMaxPourVehiculesARoueESet;

	/**
	 * The default value of the '{@link #getClasseMiMaxPourVehiculesAChenilles() <em>Classe Mi Max Pour Vehicules AChenilles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasseMiMaxPourVehiculesAChenilles()
	 * @generated
	 * @ordered
	 */
	protected static final long CLASSE_MI_MAX_POUR_VEHICULES_ACHENILLES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getClasseMiMaxPourVehiculesAChenilles() <em>Classe Mi Max Pour Vehicules AChenilles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasseMiMaxPourVehiculesAChenilles()
	 * @generated
	 * @ordered
	 */
	protected long classeMiMaxPourVehiculesAChenilles = CLASSE_MI_MAX_POUR_VEHICULES_ACHENILLES_EDEFAULT;

	/**
	 * This is true if the Classe Mi Max Pour Vehicules AChenilles attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean classeMiMaxPourVehiculesAChenillesESet;

	/**
	 * The cached value of the '{@link #getPTRAplusLourdARoues() <em>PTR Aplus Lourd ARoues</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPTRAplusLourdARoues()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeMasse pTRAplusLourdARoues;

	/**
	 * The cached value of the '{@link #getPTRAplusLourdAChenilles() <em>PTR Aplus Lourd AChenilles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPTRAplusLourdAChenilles()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeMasse pTRAplusLourdAChenilles;

	/**
	 * The default value of the '{@link #getChargeEssieu() <em>Charge Essieu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargeEssieu()
	 * @generated
	 * @ordered
	 */
	protected static final long CHARGE_ESSIEU_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getChargeEssieu() <em>Charge Essieu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargeEssieu()
	 * @generated
	 * @ordered
	 */
	protected long chargeEssieu = CHARGE_ESSIEU_EDEFAULT;

	/**
	 * This is true if the Charge Essieu attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean chargeEssieuESet;

	/**
	 * The cached value of the '{@link #getHauteurMaximaleVehicules() <em>Hauteur Maximale Vehicules</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHauteurMaximaleVehicules()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur hauteurMaximaleVehicules;

	/**
	 * The cached value of the '{@link #getLargeurMaximaleVehicule() <em>Largeur Maximale Vehicule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeurMaximaleVehicule()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur largeurMaximaleVehicule;

	/**
	 * The cached value of the '{@link #getRayonBraquageMaximal() <em>Rayon Braquage Maximal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRayonBraquageMaximal()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur rayonBraquageMaximal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypePointAxeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePointAxe();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getToponyme() {
		return toponyme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToponyme(String newToponyme) {
		String oldToponyme = toponyme;
		toponyme = newToponyme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_AXE__TOPONYME, oldToponyme, toponyme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypePointAxe getTypePointAxe() {
		return typePointAxe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypePointAxe(TypeDictionaryDicoTypePointAxe newTypePointAxe) {
		TypeDictionaryDicoTypePointAxe oldTypePointAxe = typePointAxe;
		typePointAxe = newTypePointAxe == null ? TYPE_POINT_AXE_EDEFAULT : newTypePointAxe;
		boolean oldTypePointAxeESet = typePointAxeESet;
		typePointAxeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_AXE__TYPE_POINT_AXE, oldTypePointAxe, typePointAxe, !oldTypePointAxeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypePointAxe() {
		TypeDictionaryDicoTypePointAxe oldTypePointAxe = typePointAxe;
		boolean oldTypePointAxeESet = typePointAxeESet;
		typePointAxe = TYPE_POINT_AXE_EDEFAULT;
		typePointAxeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_POINT_AXE__TYPE_POINT_AXE, oldTypePointAxe, TYPE_POINT_AXE_EDEFAULT, oldTypePointAxeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypePointAxe() {
		return typePointAxeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRecompletementCarburant() {
		return recompletementCarburant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecompletementCarburant(boolean newRecompletementCarburant) {
		boolean oldRecompletementCarburant = recompletementCarburant;
		recompletementCarburant = newRecompletementCarburant;
		boolean oldRecompletementCarburantESet = recompletementCarburantESet;
		recompletementCarburantESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_AXE__RECOMPLETEMENT_CARBURANT, oldRecompletementCarburant, recompletementCarburant, !oldRecompletementCarburantESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRecompletementCarburant() {
		boolean oldRecompletementCarburant = recompletementCarburant;
		boolean oldRecompletementCarburantESet = recompletementCarburantESet;
		recompletementCarburant = RECOMPLETEMENT_CARBURANT_EDEFAULT;
		recompletementCarburantESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_POINT_AXE__RECOMPLETEMENT_CARBURANT, oldRecompletementCarburant, RECOMPLETEMENT_CARBURANT_EDEFAULT, oldRecompletementCarburantESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRecompletementCarburant() {
		return recompletementCarburantESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReparationMateriel() {
		return reparationMateriel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReparationMateriel(boolean newReparationMateriel) {
		boolean oldReparationMateriel = reparationMateriel;
		reparationMateriel = newReparationMateriel;
		boolean oldReparationMaterielESet = reparationMaterielESet;
		reparationMaterielESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_AXE__REPARATION_MATERIEL, oldReparationMateriel, reparationMateriel, !oldReparationMaterielESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReparationMateriel() {
		boolean oldReparationMateriel = reparationMateriel;
		boolean oldReparationMaterielESet = reparationMaterielESet;
		reparationMateriel = REPARATION_MATERIEL_EDEFAULT;
		reparationMaterielESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_POINT_AXE__REPARATION_MATERIEL, oldReparationMateriel, REPARATION_MATERIEL_EDEFAULT, oldReparationMaterielESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReparationMateriel() {
		return reparationMaterielESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPosteSecours() {
		return posteSecours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosteSecours(boolean newPosteSecours) {
		boolean oldPosteSecours = posteSecours;
		posteSecours = newPosteSecours;
		boolean oldPosteSecoursESet = posteSecoursESet;
		posteSecoursESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_AXE__POSTE_SECOURS, oldPosteSecours, posteSecours, !oldPosteSecoursESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPosteSecours() {
		boolean oldPosteSecours = posteSecours;
		boolean oldPosteSecoursESet = posteSecoursESet;
		posteSecours = POSTE_SECOURS_EDEFAULT;
		posteSecoursESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_POINT_AXE__POSTE_SECOURS, oldPosteSecours, POSTE_SECOURS_EDEFAULT, oldPosteSecoursESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPosteSecours() {
		return posteSecoursESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFrontiere() {
		return frontiere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrontiere(boolean newFrontiere) {
		boolean oldFrontiere = frontiere;
		frontiere = newFrontiere;
		boolean oldFrontiereESet = frontiereESet;
		frontiereESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_AXE__FRONTIERE, oldFrontiere, frontiere, !oldFrontiereESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFrontiere() {
		boolean oldFrontiere = frontiere;
		boolean oldFrontiereESet = frontiereESet;
		frontiere = FRONTIERE_EDEFAULT;
		frontiereESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_POINT_AXE__FRONTIERE, oldFrontiere, FRONTIERE_EDEFAULT, oldFrontiereESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFrontiere() {
		return frontiereESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getClasseMilMaxPourVehiculesARoue() {
		return classeMilMaxPourVehiculesARoue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClasseMilMaxPourVehiculesARoue(long newClasseMilMaxPourVehiculesARoue) {
		long oldClasseMilMaxPourVehiculesARoue = classeMilMaxPourVehiculesARoue;
		classeMilMaxPourVehiculesARoue = newClasseMilMaxPourVehiculesARoue;
		boolean oldClasseMilMaxPourVehiculesARoueESet = classeMilMaxPourVehiculesARoueESet;
		classeMilMaxPourVehiculesARoueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_AXE__CLASSE_MIL_MAX_POUR_VEHICULES_AROUE, oldClasseMilMaxPourVehiculesARoue, classeMilMaxPourVehiculesARoue, !oldClasseMilMaxPourVehiculesARoueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClasseMilMaxPourVehiculesARoue() {
		long oldClasseMilMaxPourVehiculesARoue = classeMilMaxPourVehiculesARoue;
		boolean oldClasseMilMaxPourVehiculesARoueESet = classeMilMaxPourVehiculesARoueESet;
		classeMilMaxPourVehiculesARoue = CLASSE_MIL_MAX_POUR_VEHICULES_AROUE_EDEFAULT;
		classeMilMaxPourVehiculesARoueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_POINT_AXE__CLASSE_MIL_MAX_POUR_VEHICULES_AROUE, oldClasseMilMaxPourVehiculesARoue, CLASSE_MIL_MAX_POUR_VEHICULES_AROUE_EDEFAULT, oldClasseMilMaxPourVehiculesARoueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClasseMilMaxPourVehiculesARoue() {
		return classeMilMaxPourVehiculesARoueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getClasseMiMaxPourVehiculesAChenilles() {
		return classeMiMaxPourVehiculesAChenilles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClasseMiMaxPourVehiculesAChenilles(long newClasseMiMaxPourVehiculesAChenilles) {
		long oldClasseMiMaxPourVehiculesAChenilles = classeMiMaxPourVehiculesAChenilles;
		classeMiMaxPourVehiculesAChenilles = newClasseMiMaxPourVehiculesAChenilles;
		boolean oldClasseMiMaxPourVehiculesAChenillesESet = classeMiMaxPourVehiculesAChenillesESet;
		classeMiMaxPourVehiculesAChenillesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_AXE__CLASSE_MI_MAX_POUR_VEHICULES_ACHENILLES, oldClasseMiMaxPourVehiculesAChenilles, classeMiMaxPourVehiculesAChenilles, !oldClasseMiMaxPourVehiculesAChenillesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClasseMiMaxPourVehiculesAChenilles() {
		long oldClasseMiMaxPourVehiculesAChenilles = classeMiMaxPourVehiculesAChenilles;
		boolean oldClasseMiMaxPourVehiculesAChenillesESet = classeMiMaxPourVehiculesAChenillesESet;
		classeMiMaxPourVehiculesAChenilles = CLASSE_MI_MAX_POUR_VEHICULES_ACHENILLES_EDEFAULT;
		classeMiMaxPourVehiculesAChenillesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_POINT_AXE__CLASSE_MI_MAX_POUR_VEHICULES_ACHENILLES, oldClasseMiMaxPourVehiculesAChenilles, CLASSE_MI_MAX_POUR_VEHICULES_ACHENILLES_EDEFAULT, oldClasseMiMaxPourVehiculesAChenillesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClasseMiMaxPourVehiculesAChenilles() {
		return classeMiMaxPourVehiculesAChenillesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeMasse getPTRAplusLourdARoues() {
		return pTRAplusLourdARoues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPTRAplusLourdARoues(TypeDataTypeMasse newPTRAplusLourdARoues, NotificationChain msgs) {
		TypeDataTypeMasse oldPTRAplusLourdARoues = pTRAplusLourdARoues;
		pTRAplusLourdARoues = newPTRAplusLourdARoues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_AXE__PTR_APLUS_LOURD_AROUES, oldPTRAplusLourdARoues, newPTRAplusLourdARoues);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPTRAplusLourdARoues(TypeDataTypeMasse newPTRAplusLourdARoues) {
		if (newPTRAplusLourdARoues != pTRAplusLourdARoues) {
			NotificationChain msgs = null;
			if (pTRAplusLourdARoues != null)
				msgs = ((InternalEObject)pTRAplusLourdARoues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POINT_AXE__PTR_APLUS_LOURD_AROUES, null, msgs);
			if (newPTRAplusLourdARoues != null)
				msgs = ((InternalEObject)newPTRAplusLourdARoues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POINT_AXE__PTR_APLUS_LOURD_AROUES, null, msgs);
			msgs = basicSetPTRAplusLourdARoues(newPTRAplusLourdARoues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_AXE__PTR_APLUS_LOURD_AROUES, newPTRAplusLourdARoues, newPTRAplusLourdARoues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeMasse getPTRAplusLourdAChenilles() {
		return pTRAplusLourdAChenilles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPTRAplusLourdAChenilles(TypeDataTypeMasse newPTRAplusLourdAChenilles, NotificationChain msgs) {
		TypeDataTypeMasse oldPTRAplusLourdAChenilles = pTRAplusLourdAChenilles;
		pTRAplusLourdAChenilles = newPTRAplusLourdAChenilles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_AXE__PTR_APLUS_LOURD_ACHENILLES, oldPTRAplusLourdAChenilles, newPTRAplusLourdAChenilles);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPTRAplusLourdAChenilles(TypeDataTypeMasse newPTRAplusLourdAChenilles) {
		if (newPTRAplusLourdAChenilles != pTRAplusLourdAChenilles) {
			NotificationChain msgs = null;
			if (pTRAplusLourdAChenilles != null)
				msgs = ((InternalEObject)pTRAplusLourdAChenilles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POINT_AXE__PTR_APLUS_LOURD_ACHENILLES, null, msgs);
			if (newPTRAplusLourdAChenilles != null)
				msgs = ((InternalEObject)newPTRAplusLourdAChenilles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POINT_AXE__PTR_APLUS_LOURD_ACHENILLES, null, msgs);
			msgs = basicSetPTRAplusLourdAChenilles(newPTRAplusLourdAChenilles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_AXE__PTR_APLUS_LOURD_ACHENILLES, newPTRAplusLourdAChenilles, newPTRAplusLourdAChenilles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getChargeEssieu() {
		return chargeEssieu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChargeEssieu(long newChargeEssieu) {
		long oldChargeEssieu = chargeEssieu;
		chargeEssieu = newChargeEssieu;
		boolean oldChargeEssieuESet = chargeEssieuESet;
		chargeEssieuESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_AXE__CHARGE_ESSIEU, oldChargeEssieu, chargeEssieu, !oldChargeEssieuESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetChargeEssieu() {
		long oldChargeEssieu = chargeEssieu;
		boolean oldChargeEssieuESet = chargeEssieuESet;
		chargeEssieu = CHARGE_ESSIEU_EDEFAULT;
		chargeEssieuESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_POINT_AXE__CHARGE_ESSIEU, oldChargeEssieu, CHARGE_ESSIEU_EDEFAULT, oldChargeEssieuESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetChargeEssieu() {
		return chargeEssieuESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getHauteurMaximaleVehicules() {
		return hauteurMaximaleVehicules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHauteurMaximaleVehicules(TypeDataTypeLongueur newHauteurMaximaleVehicules, NotificationChain msgs) {
		TypeDataTypeLongueur oldHauteurMaximaleVehicules = hauteurMaximaleVehicules;
		hauteurMaximaleVehicules = newHauteurMaximaleVehicules;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_AXE__HAUTEUR_MAXIMALE_VEHICULES, oldHauteurMaximaleVehicules, newHauteurMaximaleVehicules);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHauteurMaximaleVehicules(TypeDataTypeLongueur newHauteurMaximaleVehicules) {
		if (newHauteurMaximaleVehicules != hauteurMaximaleVehicules) {
			NotificationChain msgs = null;
			if (hauteurMaximaleVehicules != null)
				msgs = ((InternalEObject)hauteurMaximaleVehicules).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POINT_AXE__HAUTEUR_MAXIMALE_VEHICULES, null, msgs);
			if (newHauteurMaximaleVehicules != null)
				msgs = ((InternalEObject)newHauteurMaximaleVehicules).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POINT_AXE__HAUTEUR_MAXIMALE_VEHICULES, null, msgs);
			msgs = basicSetHauteurMaximaleVehicules(newHauteurMaximaleVehicules, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_AXE__HAUTEUR_MAXIMALE_VEHICULES, newHauteurMaximaleVehicules, newHauteurMaximaleVehicules));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getLargeurMaximaleVehicule() {
		return largeurMaximaleVehicule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLargeurMaximaleVehicule(TypeDataTypeLongueur newLargeurMaximaleVehicule, NotificationChain msgs) {
		TypeDataTypeLongueur oldLargeurMaximaleVehicule = largeurMaximaleVehicule;
		largeurMaximaleVehicule = newLargeurMaximaleVehicule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_AXE__LARGEUR_MAXIMALE_VEHICULE, oldLargeurMaximaleVehicule, newLargeurMaximaleVehicule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLargeurMaximaleVehicule(TypeDataTypeLongueur newLargeurMaximaleVehicule) {
		if (newLargeurMaximaleVehicule != largeurMaximaleVehicule) {
			NotificationChain msgs = null;
			if (largeurMaximaleVehicule != null)
				msgs = ((InternalEObject)largeurMaximaleVehicule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POINT_AXE__LARGEUR_MAXIMALE_VEHICULE, null, msgs);
			if (newLargeurMaximaleVehicule != null)
				msgs = ((InternalEObject)newLargeurMaximaleVehicule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POINT_AXE__LARGEUR_MAXIMALE_VEHICULE, null, msgs);
			msgs = basicSetLargeurMaximaleVehicule(newLargeurMaximaleVehicule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_AXE__LARGEUR_MAXIMALE_VEHICULE, newLargeurMaximaleVehicule, newLargeurMaximaleVehicule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getRayonBraquageMaximal() {
		return rayonBraquageMaximal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRayonBraquageMaximal(TypeDataTypeLongueur newRayonBraquageMaximal, NotificationChain msgs) {
		TypeDataTypeLongueur oldRayonBraquageMaximal = rayonBraquageMaximal;
		rayonBraquageMaximal = newRayonBraquageMaximal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_AXE__RAYON_BRAQUAGE_MAXIMAL, oldRayonBraquageMaximal, newRayonBraquageMaximal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRayonBraquageMaximal(TypeDataTypeLongueur newRayonBraquageMaximal) {
		if (newRayonBraquageMaximal != rayonBraquageMaximal) {
			NotificationChain msgs = null;
			if (rayonBraquageMaximal != null)
				msgs = ((InternalEObject)rayonBraquageMaximal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POINT_AXE__RAYON_BRAQUAGE_MAXIMAL, null, msgs);
			if (newRayonBraquageMaximal != null)
				msgs = ((InternalEObject)newRayonBraquageMaximal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POINT_AXE__RAYON_BRAQUAGE_MAXIMAL, null, msgs);
			msgs = basicSetRayonBraquageMaximal(newRayonBraquageMaximal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_AXE__RAYON_BRAQUAGE_MAXIMAL, newRayonBraquageMaximal, newRayonBraquageMaximal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_POINT_AXE__PTR_APLUS_LOURD_AROUES:
				return basicSetPTRAplusLourdARoues(null, msgs);
			case SchemaPackage.TYPE_POINT_AXE__PTR_APLUS_LOURD_ACHENILLES:
				return basicSetPTRAplusLourdAChenilles(null, msgs);
			case SchemaPackage.TYPE_POINT_AXE__HAUTEUR_MAXIMALE_VEHICULES:
				return basicSetHauteurMaximaleVehicules(null, msgs);
			case SchemaPackage.TYPE_POINT_AXE__LARGEUR_MAXIMALE_VEHICULE:
				return basicSetLargeurMaximaleVehicule(null, msgs);
			case SchemaPackage.TYPE_POINT_AXE__RAYON_BRAQUAGE_MAXIMAL:
				return basicSetRayonBraquageMaximal(null, msgs);
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
			case SchemaPackage.TYPE_POINT_AXE__TOPONYME:
				return getToponyme();
			case SchemaPackage.TYPE_POINT_AXE__TYPE_POINT_AXE:
				return getTypePointAxe();
			case SchemaPackage.TYPE_POINT_AXE__RECOMPLETEMENT_CARBURANT:
				return isRecompletementCarburant() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_POINT_AXE__REPARATION_MATERIEL:
				return isReparationMateriel() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_POINT_AXE__POSTE_SECOURS:
				return isPosteSecours() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_POINT_AXE__FRONTIERE:
				return isFrontiere() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_POINT_AXE__CLASSE_MIL_MAX_POUR_VEHICULES_AROUE:
				return new Long(getClasseMilMaxPourVehiculesARoue());
			case SchemaPackage.TYPE_POINT_AXE__CLASSE_MI_MAX_POUR_VEHICULES_ACHENILLES:
				return new Long(getClasseMiMaxPourVehiculesAChenilles());
			case SchemaPackage.TYPE_POINT_AXE__PTR_APLUS_LOURD_AROUES:
				return getPTRAplusLourdARoues();
			case SchemaPackage.TYPE_POINT_AXE__PTR_APLUS_LOURD_ACHENILLES:
				return getPTRAplusLourdAChenilles();
			case SchemaPackage.TYPE_POINT_AXE__CHARGE_ESSIEU:
				return new Long(getChargeEssieu());
			case SchemaPackage.TYPE_POINT_AXE__HAUTEUR_MAXIMALE_VEHICULES:
				return getHauteurMaximaleVehicules();
			case SchemaPackage.TYPE_POINT_AXE__LARGEUR_MAXIMALE_VEHICULE:
				return getLargeurMaximaleVehicule();
			case SchemaPackage.TYPE_POINT_AXE__RAYON_BRAQUAGE_MAXIMAL:
				return getRayonBraquageMaximal();
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
			case SchemaPackage.TYPE_POINT_AXE__TOPONYME:
				setToponyme((String)newValue);
				return;
			case SchemaPackage.TYPE_POINT_AXE__TYPE_POINT_AXE:
				setTypePointAxe((TypeDictionaryDicoTypePointAxe)newValue);
				return;
			case SchemaPackage.TYPE_POINT_AXE__RECOMPLETEMENT_CARBURANT:
				setRecompletementCarburant(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_POINT_AXE__REPARATION_MATERIEL:
				setReparationMateriel(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_POINT_AXE__POSTE_SECOURS:
				setPosteSecours(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_POINT_AXE__FRONTIERE:
				setFrontiere(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_POINT_AXE__CLASSE_MIL_MAX_POUR_VEHICULES_AROUE:
				setClasseMilMaxPourVehiculesARoue(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_POINT_AXE__CLASSE_MI_MAX_POUR_VEHICULES_ACHENILLES:
				setClasseMiMaxPourVehiculesAChenilles(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_POINT_AXE__PTR_APLUS_LOURD_AROUES:
				setPTRAplusLourdARoues((TypeDataTypeMasse)newValue);
				return;
			case SchemaPackage.TYPE_POINT_AXE__PTR_APLUS_LOURD_ACHENILLES:
				setPTRAplusLourdAChenilles((TypeDataTypeMasse)newValue);
				return;
			case SchemaPackage.TYPE_POINT_AXE__CHARGE_ESSIEU:
				setChargeEssieu(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_POINT_AXE__HAUTEUR_MAXIMALE_VEHICULES:
				setHauteurMaximaleVehicules((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_POINT_AXE__LARGEUR_MAXIMALE_VEHICULE:
				setLargeurMaximaleVehicule((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_POINT_AXE__RAYON_BRAQUAGE_MAXIMAL:
				setRayonBraquageMaximal((TypeDataTypeLongueur)newValue);
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
			case SchemaPackage.TYPE_POINT_AXE__TOPONYME:
				setToponyme(TOPONYME_EDEFAULT);
				return;
			case SchemaPackage.TYPE_POINT_AXE__TYPE_POINT_AXE:
				unsetTypePointAxe();
				return;
			case SchemaPackage.TYPE_POINT_AXE__RECOMPLETEMENT_CARBURANT:
				unsetRecompletementCarburant();
				return;
			case SchemaPackage.TYPE_POINT_AXE__REPARATION_MATERIEL:
				unsetReparationMateriel();
				return;
			case SchemaPackage.TYPE_POINT_AXE__POSTE_SECOURS:
				unsetPosteSecours();
				return;
			case SchemaPackage.TYPE_POINT_AXE__FRONTIERE:
				unsetFrontiere();
				return;
			case SchemaPackage.TYPE_POINT_AXE__CLASSE_MIL_MAX_POUR_VEHICULES_AROUE:
				unsetClasseMilMaxPourVehiculesARoue();
				return;
			case SchemaPackage.TYPE_POINT_AXE__CLASSE_MI_MAX_POUR_VEHICULES_ACHENILLES:
				unsetClasseMiMaxPourVehiculesAChenilles();
				return;
			case SchemaPackage.TYPE_POINT_AXE__PTR_APLUS_LOURD_AROUES:
				setPTRAplusLourdARoues((TypeDataTypeMasse)null);
				return;
			case SchemaPackage.TYPE_POINT_AXE__PTR_APLUS_LOURD_ACHENILLES:
				setPTRAplusLourdAChenilles((TypeDataTypeMasse)null);
				return;
			case SchemaPackage.TYPE_POINT_AXE__CHARGE_ESSIEU:
				unsetChargeEssieu();
				return;
			case SchemaPackage.TYPE_POINT_AXE__HAUTEUR_MAXIMALE_VEHICULES:
				setHauteurMaximaleVehicules((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_POINT_AXE__LARGEUR_MAXIMALE_VEHICULE:
				setLargeurMaximaleVehicule((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_POINT_AXE__RAYON_BRAQUAGE_MAXIMAL:
				setRayonBraquageMaximal((TypeDataTypeLongueur)null);
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
			case SchemaPackage.TYPE_POINT_AXE__TOPONYME:
				return TOPONYME_EDEFAULT == null ? toponyme != null : !TOPONYME_EDEFAULT.equals(toponyme);
			case SchemaPackage.TYPE_POINT_AXE__TYPE_POINT_AXE:
				return isSetTypePointAxe();
			case SchemaPackage.TYPE_POINT_AXE__RECOMPLETEMENT_CARBURANT:
				return isSetRecompletementCarburant();
			case SchemaPackage.TYPE_POINT_AXE__REPARATION_MATERIEL:
				return isSetReparationMateriel();
			case SchemaPackage.TYPE_POINT_AXE__POSTE_SECOURS:
				return isSetPosteSecours();
			case SchemaPackage.TYPE_POINT_AXE__FRONTIERE:
				return isSetFrontiere();
			case SchemaPackage.TYPE_POINT_AXE__CLASSE_MIL_MAX_POUR_VEHICULES_AROUE:
				return isSetClasseMilMaxPourVehiculesARoue();
			case SchemaPackage.TYPE_POINT_AXE__CLASSE_MI_MAX_POUR_VEHICULES_ACHENILLES:
				return isSetClasseMiMaxPourVehiculesAChenilles();
			case SchemaPackage.TYPE_POINT_AXE__PTR_APLUS_LOURD_AROUES:
				return pTRAplusLourdARoues != null;
			case SchemaPackage.TYPE_POINT_AXE__PTR_APLUS_LOURD_ACHENILLES:
				return pTRAplusLourdAChenilles != null;
			case SchemaPackage.TYPE_POINT_AXE__CHARGE_ESSIEU:
				return isSetChargeEssieu();
			case SchemaPackage.TYPE_POINT_AXE__HAUTEUR_MAXIMALE_VEHICULES:
				return hauteurMaximaleVehicules != null;
			case SchemaPackage.TYPE_POINT_AXE__LARGEUR_MAXIMALE_VEHICULE:
				return largeurMaximaleVehicule != null;
			case SchemaPackage.TYPE_POINT_AXE__RAYON_BRAQUAGE_MAXIMAL:
				return rayonBraquageMaximal != null;
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
		result.append(" (toponyme: ");
		result.append(toponyme);
		result.append(", typePointAxe: ");
		if (typePointAxeESet) result.append(typePointAxe); else result.append("<unset>");
		result.append(", recompletementCarburant: ");
		if (recompletementCarburantESet) result.append(recompletementCarburant); else result.append("<unset>");
		result.append(", reparationMateriel: ");
		if (reparationMaterielESet) result.append(reparationMateriel); else result.append("<unset>");
		result.append(", posteSecours: ");
		if (posteSecoursESet) result.append(posteSecours); else result.append("<unset>");
		result.append(", frontiere: ");
		if (frontiereESet) result.append(frontiere); else result.append("<unset>");
		result.append(", classeMilMaxPourVehiculesARoue: ");
		if (classeMilMaxPourVehiculesARoueESet) result.append(classeMilMaxPourVehiculesARoue); else result.append("<unset>");
		result.append(", classeMiMaxPourVehiculesAChenilles: ");
		if (classeMiMaxPourVehiculesAChenillesESet) result.append(classeMiMaxPourVehiculesAChenilles); else result.append("<unset>");
		result.append(", chargeEssieu: ");
		if (chargeEssieuESet) result.append(chargeEssieu); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypePointAxeImpl
