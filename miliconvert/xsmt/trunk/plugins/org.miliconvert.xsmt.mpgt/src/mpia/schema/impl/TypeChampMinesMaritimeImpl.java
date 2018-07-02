/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeDataTypeDuree;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeChampMinesMaritime;
import mpia.schema.TypeChampMinesMaritimeDommagesEstimes;
import mpia.schema.TypeDictionaryDicoChampMinesMaritimeCamouflageNaturelDuFond;
import mpia.schema.TypeDictionaryDicoChampMinesMaritimeFonction;
import mpia.schema.TypeDictionaryDicoChampMinesMaritimeProfondeurPlacement;
import mpia.schema.TypeDictionaryDicoChampMinesMaritimeSousFonction;
import mpia.schema.TypeEfficaciteProbabiliste;

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
 * An implementation of the model object '<em><b>Type Champ Mines Maritime</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeChampMinesMaritimeImpl#getFonction <em>Fonction</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeChampMinesMaritimeImpl#getSousFonction <em>Sous Fonction</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeChampMinesMaritimeImpl#getNombreMinesPosees <em>Nombre Mines Posees</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeChampMinesMaritimeImpl#getDetailUneMine <em>Detail Une Mine</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeChampMinesMaritimeImpl#getDureeVie <em>Duree Vie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeChampMinesMaritimeImpl#getProfondeurPlacement <em>Profondeur Placement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeChampMinesMaritimeImpl#getCamouflageNaturelDuFond <em>Camouflage Naturel Du Fond</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeChampMinesMaritimeImpl#getProbabiliteDetection <em>Probabilite Detection</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeChampMinesMaritimeImpl#getMesureEfficaciteEstimee <em>Mesure Efficacite Estimee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeChampMinesMaritimeImpl#getNbBatimentsAttendus <em>Nb Batiments Attendus</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeChampMinesMaritimeImpl#getACommeDommagesEstimesChampMinesMaritimeDommagesEstimes <em>AComme Dommages Estimes Champ Mines Maritime Dommages Estimes</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeChampMinesMaritimeImpl#getACommeEfficaciteProbabilisteEfficaciteProbabiliste <em>AComme Efficacite Probabiliste Efficacite Probabiliste</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeChampMinesMaritimeImpl extends TypeChampMinesImpl implements TypeChampMinesMaritime {
	/**
	 * The default value of the '{@link #getFonction() <em>Fonction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFonction()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoChampMinesMaritimeFonction FONCTION_EDEFAULT = TypeDictionaryDicoChampMinesMaritimeFonction.DEFSV;

	/**
	 * The cached value of the '{@link #getFonction() <em>Fonction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFonction()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoChampMinesMaritimeFonction fonction = FONCTION_EDEFAULT;

	/**
	 * This is true if the Fonction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fonctionESet;

	/**
	 * The default value of the '{@link #getSousFonction() <em>Sous Fonction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSousFonction()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoChampMinesMaritimeSousFonction SOUS_FONCTION_EDEFAULT = TypeDictionaryDicoChampMinesMaritimeSousFonction.ANTINV;

	/**
	 * The cached value of the '{@link #getSousFonction() <em>Sous Fonction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSousFonction()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoChampMinesMaritimeSousFonction sousFonction = SOUS_FONCTION_EDEFAULT;

	/**
	 * This is true if the Sous Fonction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sousFonctionESet;

	/**
	 * The default value of the '{@link #getNombreMinesPosees() <em>Nombre Mines Posees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreMinesPosees()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_MINES_POSEES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreMinesPosees() <em>Nombre Mines Posees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreMinesPosees()
	 * @generated
	 * @ordered
	 */
	protected long nombreMinesPosees = NOMBRE_MINES_POSEES_EDEFAULT;

	/**
	 * This is true if the Nombre Mines Posees attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreMinesPoseesESet;

	/**
	 * The default value of the '{@link #getDetailUneMine() <em>Detail Une Mine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailUneMine()
	 * @generated
	 * @ordered
	 */
	protected static final String DETAIL_UNE_MINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDetailUneMine() <em>Detail Une Mine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailUneMine()
	 * @generated
	 * @ordered
	 */
	protected String detailUneMine = DETAIL_UNE_MINE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDureeVie() <em>Duree Vie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDureeVie()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree dureeVie;

	/**
	 * The default value of the '{@link #getProfondeurPlacement() <em>Profondeur Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfondeurPlacement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoChampMinesMaritimeProfondeurPlacement PROFONDEUR_PLACEMENT_EDEFAULT = TypeDictionaryDicoChampMinesMaritimeProfondeurPlacement.BOTTOM;

	/**
	 * The cached value of the '{@link #getProfondeurPlacement() <em>Profondeur Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfondeurPlacement()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoChampMinesMaritimeProfondeurPlacement profondeurPlacement = PROFONDEUR_PLACEMENT_EDEFAULT;

	/**
	 * This is true if the Profondeur Placement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean profondeurPlacementESet;

	/**
	 * The default value of the '{@link #getCamouflageNaturelDuFond() <em>Camouflage Naturel Du Fond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCamouflageNaturelDuFond()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoChampMinesMaritimeCamouflageNaturelDuFond CAMOUFLAGE_NATUREL_DU_FOND_EDEFAULT = TypeDictionaryDicoChampMinesMaritimeCamouflageNaturelDuFond.STBSMT;

	/**
	 * The cached value of the '{@link #getCamouflageNaturelDuFond() <em>Camouflage Naturel Du Fond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCamouflageNaturelDuFond()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoChampMinesMaritimeCamouflageNaturelDuFond camouflageNaturelDuFond = CAMOUFLAGE_NATUREL_DU_FOND_EDEFAULT;

	/**
	 * This is true if the Camouflage Naturel Du Fond attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean camouflageNaturelDuFondESet;

	/**
	 * The default value of the '{@link #getProbabiliteDetection() <em>Probabilite Detection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbabiliteDetection()
	 * @generated
	 * @ordered
	 */
	protected static final double PROBABILITE_DETECTION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getProbabiliteDetection() <em>Probabilite Detection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbabiliteDetection()
	 * @generated
	 * @ordered
	 */
	protected double probabiliteDetection = PROBABILITE_DETECTION_EDEFAULT;

	/**
	 * This is true if the Probabilite Detection attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean probabiliteDetectionESet;

	/**
	 * The default value of the '{@link #getMesureEfficaciteEstimee() <em>Mesure Efficacite Estimee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMesureEfficaciteEstimee()
	 * @generated
	 * @ordered
	 */
	protected static final double MESURE_EFFICACITE_ESTIMEE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMesureEfficaciteEstimee() <em>Mesure Efficacite Estimee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMesureEfficaciteEstimee()
	 * @generated
	 * @ordered
	 */
	protected double mesureEfficaciteEstimee = MESURE_EFFICACITE_ESTIMEE_EDEFAULT;

	/**
	 * This is true if the Mesure Efficacite Estimee attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mesureEfficaciteEstimeeESet;

	/**
	 * The default value of the '{@link #getNbBatimentsAttendus() <em>Nb Batiments Attendus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbBatimentsAttendus()
	 * @generated
	 * @ordered
	 */
	protected static final long NB_BATIMENTS_ATTENDUS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNbBatimentsAttendus() <em>Nb Batiments Attendus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbBatimentsAttendus()
	 * @generated
	 * @ordered
	 */
	protected long nbBatimentsAttendus = NB_BATIMENTS_ATTENDUS_EDEFAULT;

	/**
	 * This is true if the Nb Batiments Attendus attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nbBatimentsAttendusESet;

	/**
	 * The cached value of the '{@link #getACommeDommagesEstimesChampMinesMaritimeDommagesEstimes() <em>AComme Dommages Estimes Champ Mines Maritime Dommages Estimes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeDommagesEstimesChampMinesMaritimeDommagesEstimes()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeChampMinesMaritimeDommagesEstimes> aCommeDommagesEstimesChampMinesMaritimeDommagesEstimes;

	/**
	 * The cached value of the '{@link #getACommeEfficaciteProbabilisteEfficaciteProbabiliste() <em>AComme Efficacite Probabiliste Efficacite Probabiliste</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeEfficaciteProbabilisteEfficaciteProbabiliste()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeEfficaciteProbabiliste> aCommeEfficaciteProbabilisteEfficaciteProbabiliste;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeChampMinesMaritimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeChampMinesMaritime();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoChampMinesMaritimeFonction getFonction() {
		return fonction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFonction(TypeDictionaryDicoChampMinesMaritimeFonction newFonction) {
		TypeDictionaryDicoChampMinesMaritimeFonction oldFonction = fonction;
		fonction = newFonction == null ? FONCTION_EDEFAULT : newFonction;
		boolean oldFonctionESet = fonctionESet;
		fonctionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CHAMP_MINES_MARITIME__FONCTION, oldFonction, fonction, !oldFonctionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFonction() {
		TypeDictionaryDicoChampMinesMaritimeFonction oldFonction = fonction;
		boolean oldFonctionESet = fonctionESet;
		fonction = FONCTION_EDEFAULT;
		fonctionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CHAMP_MINES_MARITIME__FONCTION, oldFonction, FONCTION_EDEFAULT, oldFonctionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFonction() {
		return fonctionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoChampMinesMaritimeSousFonction getSousFonction() {
		return sousFonction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSousFonction(TypeDictionaryDicoChampMinesMaritimeSousFonction newSousFonction) {
		TypeDictionaryDicoChampMinesMaritimeSousFonction oldSousFonction = sousFonction;
		sousFonction = newSousFonction == null ? SOUS_FONCTION_EDEFAULT : newSousFonction;
		boolean oldSousFonctionESet = sousFonctionESet;
		sousFonctionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CHAMP_MINES_MARITIME__SOUS_FONCTION, oldSousFonction, sousFonction, !oldSousFonctionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSousFonction() {
		TypeDictionaryDicoChampMinesMaritimeSousFonction oldSousFonction = sousFonction;
		boolean oldSousFonctionESet = sousFonctionESet;
		sousFonction = SOUS_FONCTION_EDEFAULT;
		sousFonctionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CHAMP_MINES_MARITIME__SOUS_FONCTION, oldSousFonction, SOUS_FONCTION_EDEFAULT, oldSousFonctionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSousFonction() {
		return sousFonctionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreMinesPosees() {
		return nombreMinesPosees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreMinesPosees(long newNombreMinesPosees) {
		long oldNombreMinesPosees = nombreMinesPosees;
		nombreMinesPosees = newNombreMinesPosees;
		boolean oldNombreMinesPoseesESet = nombreMinesPoseesESet;
		nombreMinesPoseesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CHAMP_MINES_MARITIME__NOMBRE_MINES_POSEES, oldNombreMinesPosees, nombreMinesPosees, !oldNombreMinesPoseesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreMinesPosees() {
		long oldNombreMinesPosees = nombreMinesPosees;
		boolean oldNombreMinesPoseesESet = nombreMinesPoseesESet;
		nombreMinesPosees = NOMBRE_MINES_POSEES_EDEFAULT;
		nombreMinesPoseesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CHAMP_MINES_MARITIME__NOMBRE_MINES_POSEES, oldNombreMinesPosees, NOMBRE_MINES_POSEES_EDEFAULT, oldNombreMinesPoseesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreMinesPosees() {
		return nombreMinesPoseesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDetailUneMine() {
		return detailUneMine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetailUneMine(String newDetailUneMine) {
		String oldDetailUneMine = detailUneMine;
		detailUneMine = newDetailUneMine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CHAMP_MINES_MARITIME__DETAIL_UNE_MINE, oldDetailUneMine, detailUneMine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getDureeVie() {
		return dureeVie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDureeVie(TypeDataTypeDuree newDureeVie, NotificationChain msgs) {
		TypeDataTypeDuree oldDureeVie = dureeVie;
		dureeVie = newDureeVie;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CHAMP_MINES_MARITIME__DUREE_VIE, oldDureeVie, newDureeVie);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDureeVie(TypeDataTypeDuree newDureeVie) {
		if (newDureeVie != dureeVie) {
			NotificationChain msgs = null;
			if (dureeVie != null)
				msgs = ((InternalEObject)dureeVie).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CHAMP_MINES_MARITIME__DUREE_VIE, null, msgs);
			if (newDureeVie != null)
				msgs = ((InternalEObject)newDureeVie).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CHAMP_MINES_MARITIME__DUREE_VIE, null, msgs);
			msgs = basicSetDureeVie(newDureeVie, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CHAMP_MINES_MARITIME__DUREE_VIE, newDureeVie, newDureeVie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoChampMinesMaritimeProfondeurPlacement getProfondeurPlacement() {
		return profondeurPlacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfondeurPlacement(TypeDictionaryDicoChampMinesMaritimeProfondeurPlacement newProfondeurPlacement) {
		TypeDictionaryDicoChampMinesMaritimeProfondeurPlacement oldProfondeurPlacement = profondeurPlacement;
		profondeurPlacement = newProfondeurPlacement == null ? PROFONDEUR_PLACEMENT_EDEFAULT : newProfondeurPlacement;
		boolean oldProfondeurPlacementESet = profondeurPlacementESet;
		profondeurPlacementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CHAMP_MINES_MARITIME__PROFONDEUR_PLACEMENT, oldProfondeurPlacement, profondeurPlacement, !oldProfondeurPlacementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProfondeurPlacement() {
		TypeDictionaryDicoChampMinesMaritimeProfondeurPlacement oldProfondeurPlacement = profondeurPlacement;
		boolean oldProfondeurPlacementESet = profondeurPlacementESet;
		profondeurPlacement = PROFONDEUR_PLACEMENT_EDEFAULT;
		profondeurPlacementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CHAMP_MINES_MARITIME__PROFONDEUR_PLACEMENT, oldProfondeurPlacement, PROFONDEUR_PLACEMENT_EDEFAULT, oldProfondeurPlacementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProfondeurPlacement() {
		return profondeurPlacementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoChampMinesMaritimeCamouflageNaturelDuFond getCamouflageNaturelDuFond() {
		return camouflageNaturelDuFond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCamouflageNaturelDuFond(TypeDictionaryDicoChampMinesMaritimeCamouflageNaturelDuFond newCamouflageNaturelDuFond) {
		TypeDictionaryDicoChampMinesMaritimeCamouflageNaturelDuFond oldCamouflageNaturelDuFond = camouflageNaturelDuFond;
		camouflageNaturelDuFond = newCamouflageNaturelDuFond == null ? CAMOUFLAGE_NATUREL_DU_FOND_EDEFAULT : newCamouflageNaturelDuFond;
		boolean oldCamouflageNaturelDuFondESet = camouflageNaturelDuFondESet;
		camouflageNaturelDuFondESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CHAMP_MINES_MARITIME__CAMOUFLAGE_NATUREL_DU_FOND, oldCamouflageNaturelDuFond, camouflageNaturelDuFond, !oldCamouflageNaturelDuFondESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCamouflageNaturelDuFond() {
		TypeDictionaryDicoChampMinesMaritimeCamouflageNaturelDuFond oldCamouflageNaturelDuFond = camouflageNaturelDuFond;
		boolean oldCamouflageNaturelDuFondESet = camouflageNaturelDuFondESet;
		camouflageNaturelDuFond = CAMOUFLAGE_NATUREL_DU_FOND_EDEFAULT;
		camouflageNaturelDuFondESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CHAMP_MINES_MARITIME__CAMOUFLAGE_NATUREL_DU_FOND, oldCamouflageNaturelDuFond, CAMOUFLAGE_NATUREL_DU_FOND_EDEFAULT, oldCamouflageNaturelDuFondESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCamouflageNaturelDuFond() {
		return camouflageNaturelDuFondESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getProbabiliteDetection() {
		return probabiliteDetection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbabiliteDetection(double newProbabiliteDetection) {
		double oldProbabiliteDetection = probabiliteDetection;
		probabiliteDetection = newProbabiliteDetection;
		boolean oldProbabiliteDetectionESet = probabiliteDetectionESet;
		probabiliteDetectionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CHAMP_MINES_MARITIME__PROBABILITE_DETECTION, oldProbabiliteDetection, probabiliteDetection, !oldProbabiliteDetectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProbabiliteDetection() {
		double oldProbabiliteDetection = probabiliteDetection;
		boolean oldProbabiliteDetectionESet = probabiliteDetectionESet;
		probabiliteDetection = PROBABILITE_DETECTION_EDEFAULT;
		probabiliteDetectionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CHAMP_MINES_MARITIME__PROBABILITE_DETECTION, oldProbabiliteDetection, PROBABILITE_DETECTION_EDEFAULT, oldProbabiliteDetectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProbabiliteDetection() {
		return probabiliteDetectionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMesureEfficaciteEstimee() {
		return mesureEfficaciteEstimee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMesureEfficaciteEstimee(double newMesureEfficaciteEstimee) {
		double oldMesureEfficaciteEstimee = mesureEfficaciteEstimee;
		mesureEfficaciteEstimee = newMesureEfficaciteEstimee;
		boolean oldMesureEfficaciteEstimeeESet = mesureEfficaciteEstimeeESet;
		mesureEfficaciteEstimeeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CHAMP_MINES_MARITIME__MESURE_EFFICACITE_ESTIMEE, oldMesureEfficaciteEstimee, mesureEfficaciteEstimee, !oldMesureEfficaciteEstimeeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMesureEfficaciteEstimee() {
		double oldMesureEfficaciteEstimee = mesureEfficaciteEstimee;
		boolean oldMesureEfficaciteEstimeeESet = mesureEfficaciteEstimeeESet;
		mesureEfficaciteEstimee = MESURE_EFFICACITE_ESTIMEE_EDEFAULT;
		mesureEfficaciteEstimeeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CHAMP_MINES_MARITIME__MESURE_EFFICACITE_ESTIMEE, oldMesureEfficaciteEstimee, MESURE_EFFICACITE_ESTIMEE_EDEFAULT, oldMesureEfficaciteEstimeeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMesureEfficaciteEstimee() {
		return mesureEfficaciteEstimeeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNbBatimentsAttendus() {
		return nbBatimentsAttendus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbBatimentsAttendus(long newNbBatimentsAttendus) {
		long oldNbBatimentsAttendus = nbBatimentsAttendus;
		nbBatimentsAttendus = newNbBatimentsAttendus;
		boolean oldNbBatimentsAttendusESet = nbBatimentsAttendusESet;
		nbBatimentsAttendusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CHAMP_MINES_MARITIME__NB_BATIMENTS_ATTENDUS, oldNbBatimentsAttendus, nbBatimentsAttendus, !oldNbBatimentsAttendusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNbBatimentsAttendus() {
		long oldNbBatimentsAttendus = nbBatimentsAttendus;
		boolean oldNbBatimentsAttendusESet = nbBatimentsAttendusESet;
		nbBatimentsAttendus = NB_BATIMENTS_ATTENDUS_EDEFAULT;
		nbBatimentsAttendusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CHAMP_MINES_MARITIME__NB_BATIMENTS_ATTENDUS, oldNbBatimentsAttendus, NB_BATIMENTS_ATTENDUS_EDEFAULT, oldNbBatimentsAttendusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNbBatimentsAttendus() {
		return nbBatimentsAttendusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeChampMinesMaritimeDommagesEstimes> getACommeDommagesEstimesChampMinesMaritimeDommagesEstimes() {
		if (aCommeDommagesEstimesChampMinesMaritimeDommagesEstimes == null) {
			aCommeDommagesEstimesChampMinesMaritimeDommagesEstimes = new EObjectContainmentEList<TypeChampMinesMaritimeDommagesEstimes>(TypeChampMinesMaritimeDommagesEstimes.class, this, SchemaPackage.TYPE_CHAMP_MINES_MARITIME__ACOMME_DOMMAGES_ESTIMES_CHAMP_MINES_MARITIME_DOMMAGES_ESTIMES);
		}
		return aCommeDommagesEstimesChampMinesMaritimeDommagesEstimes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEfficaciteProbabiliste> getACommeEfficaciteProbabilisteEfficaciteProbabiliste() {
		if (aCommeEfficaciteProbabilisteEfficaciteProbabiliste == null) {
			aCommeEfficaciteProbabilisteEfficaciteProbabiliste = new EObjectContainmentEList<TypeEfficaciteProbabiliste>(TypeEfficaciteProbabiliste.class, this, SchemaPackage.TYPE_CHAMP_MINES_MARITIME__ACOMME_EFFICACITE_PROBABILISTE_EFFICACITE_PROBABILISTE);
		}
		return aCommeEfficaciteProbabilisteEfficaciteProbabiliste;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME__DUREE_VIE:
				return basicSetDureeVie(null, msgs);
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME__ACOMME_DOMMAGES_ESTIMES_CHAMP_MINES_MARITIME_DOMMAGES_ESTIMES:
				return ((InternalEList<?>)getACommeDommagesEstimesChampMinesMaritimeDommagesEstimes()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME__ACOMME_EFFICACITE_PROBABILISTE_EFFICACITE_PROBABILISTE:
				return ((InternalEList<?>)getACommeEfficaciteProbabilisteEfficaciteProbabiliste()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME__FONCTION:
				return getFonction();
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME__SOUS_FONCTION:
				return getSousFonction();
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME__NOMBRE_MINES_POSEES:
				return new Long(getNombreMinesPosees());
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME__DETAIL_UNE_MINE:
				return getDetailUneMine();
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME__DUREE_VIE:
				return getDureeVie();
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME__PROFONDEUR_PLACEMENT:
				return getProfondeurPlacement();
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME__CAMOUFLAGE_NATUREL_DU_FOND:
				return getCamouflageNaturelDuFond();
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME__PROBABILITE_DETECTION:
				return new Double(getProbabiliteDetection());
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME__MESURE_EFFICACITE_ESTIMEE:
				return new Double(getMesureEfficaciteEstimee());
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME__NB_BATIMENTS_ATTENDUS:
				return new Long(getNbBatimentsAttendus());
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME__ACOMME_DOMMAGES_ESTIMES_CHAMP_MINES_MARITIME_DOMMAGES_ESTIMES:
				return getACommeDommagesEstimesChampMinesMaritimeDommagesEstimes();
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME__ACOMME_EFFICACITE_PROBABILISTE_EFFICACITE_PROBABILISTE:
				return getACommeEfficaciteProbabilisteEfficaciteProbabiliste();
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
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME__FONCTION:
				setFonction((TypeDictionaryDicoChampMinesMaritimeFonction)newValue);
				return;
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME__SOUS_FONCTION:
				setSousFonction((TypeDictionaryDicoChampMinesMaritimeSousFonction)newValue);
				return;
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME__NOMBRE_MINES_POSEES:
				setNombreMinesPosees(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME__DETAIL_UNE_MINE:
				setDetailUneMine((String)newValue);
				return;
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME__DUREE_VIE:
				setDureeVie((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME__PROFONDEUR_PLACEMENT:
				setProfondeurPlacement((TypeDictionaryDicoChampMinesMaritimeProfondeurPlacement)newValue);
				return;
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME__CAMOUFLAGE_NATUREL_DU_FOND:
				setCamouflageNaturelDuFond((TypeDictionaryDicoChampMinesMaritimeCamouflageNaturelDuFond)newValue);
				return;
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME__PROBABILITE_DETECTION:
				setProbabiliteDetection(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME__MESURE_EFFICACITE_ESTIMEE:
				setMesureEfficaciteEstimee(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME__NB_BATIMENTS_ATTENDUS:
				setNbBatimentsAttendus(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME__ACOMME_DOMMAGES_ESTIMES_CHAMP_MINES_MARITIME_DOMMAGES_ESTIMES:
				getACommeDommagesEstimesChampMinesMaritimeDommagesEstimes().clear();
				getACommeDommagesEstimesChampMinesMaritimeDommagesEstimes().addAll((Collection<? extends TypeChampMinesMaritimeDommagesEstimes>)newValue);
				return;
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME__ACOMME_EFFICACITE_PROBABILISTE_EFFICACITE_PROBABILISTE:
				getACommeEfficaciteProbabilisteEfficaciteProbabiliste().clear();
				getACommeEfficaciteProbabilisteEfficaciteProbabiliste().addAll((Collection<? extends TypeEfficaciteProbabiliste>)newValue);
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
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME__FONCTION:
				unsetFonction();
				return;
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME__SOUS_FONCTION:
				unsetSousFonction();
				return;
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME__NOMBRE_MINES_POSEES:
				unsetNombreMinesPosees();
				return;
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME__DETAIL_UNE_MINE:
				setDetailUneMine(DETAIL_UNE_MINE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME__DUREE_VIE:
				setDureeVie((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME__PROFONDEUR_PLACEMENT:
				unsetProfondeurPlacement();
				return;
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME__CAMOUFLAGE_NATUREL_DU_FOND:
				unsetCamouflageNaturelDuFond();
				return;
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME__PROBABILITE_DETECTION:
				unsetProbabiliteDetection();
				return;
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME__MESURE_EFFICACITE_ESTIMEE:
				unsetMesureEfficaciteEstimee();
				return;
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME__NB_BATIMENTS_ATTENDUS:
				unsetNbBatimentsAttendus();
				return;
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME__ACOMME_DOMMAGES_ESTIMES_CHAMP_MINES_MARITIME_DOMMAGES_ESTIMES:
				getACommeDommagesEstimesChampMinesMaritimeDommagesEstimes().clear();
				return;
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME__ACOMME_EFFICACITE_PROBABILISTE_EFFICACITE_PROBABILISTE:
				getACommeEfficaciteProbabilisteEfficaciteProbabiliste().clear();
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
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME__FONCTION:
				return isSetFonction();
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME__SOUS_FONCTION:
				return isSetSousFonction();
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME__NOMBRE_MINES_POSEES:
				return isSetNombreMinesPosees();
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME__DETAIL_UNE_MINE:
				return DETAIL_UNE_MINE_EDEFAULT == null ? detailUneMine != null : !DETAIL_UNE_MINE_EDEFAULT.equals(detailUneMine);
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME__DUREE_VIE:
				return dureeVie != null;
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME__PROFONDEUR_PLACEMENT:
				return isSetProfondeurPlacement();
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME__CAMOUFLAGE_NATUREL_DU_FOND:
				return isSetCamouflageNaturelDuFond();
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME__PROBABILITE_DETECTION:
				return isSetProbabiliteDetection();
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME__MESURE_EFFICACITE_ESTIMEE:
				return isSetMesureEfficaciteEstimee();
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME__NB_BATIMENTS_ATTENDUS:
				return isSetNbBatimentsAttendus();
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME__ACOMME_DOMMAGES_ESTIMES_CHAMP_MINES_MARITIME_DOMMAGES_ESTIMES:
				return aCommeDommagesEstimesChampMinesMaritimeDommagesEstimes != null && !aCommeDommagesEstimesChampMinesMaritimeDommagesEstimes.isEmpty();
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME__ACOMME_EFFICACITE_PROBABILISTE_EFFICACITE_PROBABILISTE:
				return aCommeEfficaciteProbabilisteEfficaciteProbabiliste != null && !aCommeEfficaciteProbabilisteEfficaciteProbabiliste.isEmpty();
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
		result.append(" (fonction: ");
		if (fonctionESet) result.append(fonction); else result.append("<unset>");
		result.append(", sousFonction: ");
		if (sousFonctionESet) result.append(sousFonction); else result.append("<unset>");
		result.append(", nombreMinesPosees: ");
		if (nombreMinesPoseesESet) result.append(nombreMinesPosees); else result.append("<unset>");
		result.append(", detailUneMine: ");
		result.append(detailUneMine);
		result.append(", profondeurPlacement: ");
		if (profondeurPlacementESet) result.append(profondeurPlacement); else result.append("<unset>");
		result.append(", camouflageNaturelDuFond: ");
		if (camouflageNaturelDuFondESet) result.append(camouflageNaturelDuFond); else result.append("<unset>");
		result.append(", probabiliteDetection: ");
		if (probabiliteDetectionESet) result.append(probabiliteDetection); else result.append("<unset>");
		result.append(", mesureEfficaciteEstimee: ");
		if (mesureEfficaciteEstimeeESet) result.append(mesureEfficaciteEstimee); else result.append("<unset>");
		result.append(", nbBatimentsAttendus: ");
		if (nbBatimentsAttendusESet) result.append(nbBatimentsAttendus); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeChampMinesMaritimeImpl
