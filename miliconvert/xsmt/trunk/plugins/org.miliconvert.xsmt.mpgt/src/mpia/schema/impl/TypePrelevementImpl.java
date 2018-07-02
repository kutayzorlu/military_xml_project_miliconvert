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

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoPrelevementEvolutionDebitDose;
import mpia.schema.TypeDictionaryDicoPrelevementTauxRelatifDecroissance;
import mpia.schema.TypeDictionaryDicoPrelevementTypePrelevement;
import mpia.schema.TypeDictionaryDicoUniteDebitDoseDosage;
import mpia.schema.TypeDictionaryDicoUniteNiveauContamination;
import mpia.schema.TypeDictionaryDicoUniteNiveauDose;
import mpia.schema.TypeEnvironnementTerrainEtVegetation;
import mpia.schema.TypeLocalisationGeometrique2D;
import mpia.schema.TypePrelevement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Prelevement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePrelevementImpl#getTypePrelevement <em>Type Prelevement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrelevementImpl#getDateReleve <em>Date Releve</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrelevementImpl#getNiveauDebitDose <em>Niveau Debit Dose</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrelevementImpl#getUniteMesureDebitDose <em>Unite Mesure Debit Dose</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrelevementImpl#getNiveauDose <em>Niveau Dose</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrelevementImpl#getUniteMesureDose <em>Unite Mesure Dose</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrelevementImpl#getNiveauContamination <em>Niveau Contamination</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrelevementImpl#getUniteMesureContamination <em>Unite Mesure Contamination</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrelevementImpl#getEvolutionDebitDose <em>Evolution Debit Dose</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrelevementImpl#getTauxReelDecroissance <em>Taux Reel Decroissance</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrelevementImpl#getTauxRelatifDecroissance <em>Taux Relatif Decroissance</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrelevementImpl#getDateDetection <em>Date Detection</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrelevementImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrelevementImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrelevementImpl#getUtiliseTypeEquipementNRBC <em>Utilise Type Equipement NRBC</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrelevementImpl#getEstLocaliseParLocalisationGeometrique2D <em>Est Localise Par Localisation Geometrique2 D</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrelevementImpl#getAPourEnvironnementEnvironnementTerrainEtVegetation <em>APour Environnement Environnement Terrain Et Vegetation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrelevementImpl#getAPourConditionsMeteoTrancheMeteo <em>APour Conditions Meteo Tranche Meteo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePrelevementImpl extends EObjectImpl implements TypePrelevement {
	/**
	 * The default value of the '{@link #getTypePrelevement() <em>Type Prelevement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypePrelevement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPrelevementTypePrelevement TYPE_PRELEVEMENT_EDEFAULT = TypeDictionaryDicoPrelevementTypePrelevement.NOS;

	/**
	 * The cached value of the '{@link #getTypePrelevement() <em>Type Prelevement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypePrelevement()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPrelevementTypePrelevement typePrelevement = TYPE_PRELEVEMENT_EDEFAULT;

	/**
	 * This is true if the Type Prelevement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typePrelevementESet;

	/**
	 * The default value of the '{@link #getDateReleve() <em>Date Releve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateReleve()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_RELEVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateReleve() <em>Date Releve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateReleve()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateReleve = DATE_RELEVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNiveauDebitDose() <em>Niveau Debit Dose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauDebitDose()
	 * @generated
	 * @ordered
	 */
	protected static final double NIVEAU_DEBIT_DOSE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getNiveauDebitDose() <em>Niveau Debit Dose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauDebitDose()
	 * @generated
	 * @ordered
	 */
	protected double niveauDebitDose = NIVEAU_DEBIT_DOSE_EDEFAULT;

	/**
	 * This is true if the Niveau Debit Dose attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean niveauDebitDoseESet;

	/**
	 * The default value of the '{@link #getUniteMesureDebitDose() <em>Unite Mesure Debit Dose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniteMesureDebitDose()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoUniteDebitDoseDosage UNITE_MESURE_DEBIT_DOSE_EDEFAULT = TypeDictionaryDicoUniteDebitDoseDosage.CGH;

	/**
	 * The cached value of the '{@link #getUniteMesureDebitDose() <em>Unite Mesure Debit Dose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniteMesureDebitDose()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoUniteDebitDoseDosage uniteMesureDebitDose = UNITE_MESURE_DEBIT_DOSE_EDEFAULT;

	/**
	 * This is true if the Unite Mesure Debit Dose attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean uniteMesureDebitDoseESet;

	/**
	 * The default value of the '{@link #getNiveauDose() <em>Niveau Dose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauDose()
	 * @generated
	 * @ordered
	 */
	protected static final double NIVEAU_DOSE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getNiveauDose() <em>Niveau Dose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauDose()
	 * @generated
	 * @ordered
	 */
	protected double niveauDose = NIVEAU_DOSE_EDEFAULT;

	/**
	 * This is true if the Niveau Dose attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean niveauDoseESet;

	/**
	 * The default value of the '{@link #getUniteMesureDose() <em>Unite Mesure Dose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniteMesureDose()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoUniteNiveauDose UNITE_MESURE_DOSE_EDEFAULT = TypeDictionaryDicoUniteNiveauDose.CGY;

	/**
	 * The cached value of the '{@link #getUniteMesureDose() <em>Unite Mesure Dose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniteMesureDose()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoUniteNiveauDose uniteMesureDose = UNITE_MESURE_DOSE_EDEFAULT;

	/**
	 * This is true if the Unite Mesure Dose attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean uniteMesureDoseESet;

	/**
	 * The default value of the '{@link #getNiveauContamination() <em>Niveau Contamination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauContamination()
	 * @generated
	 * @ordered
	 */
	protected static final double NIVEAU_CONTAMINATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getNiveauContamination() <em>Niveau Contamination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauContamination()
	 * @generated
	 * @ordered
	 */
	protected double niveauContamination = NIVEAU_CONTAMINATION_EDEFAULT;

	/**
	 * This is true if the Niveau Contamination attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean niveauContaminationESet;

	/**
	 * The default value of the '{@link #getUniteMesureContamination() <em>Unite Mesure Contamination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniteMesureContamination()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoUniteNiveauContamination UNITE_MESURE_CONTAMINATION_EDEFAULT = TypeDictionaryDicoUniteNiveauContamination.BQM2;

	/**
	 * The cached value of the '{@link #getUniteMesureContamination() <em>Unite Mesure Contamination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniteMesureContamination()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoUniteNiveauContamination uniteMesureContamination = UNITE_MESURE_CONTAMINATION_EDEFAULT;

	/**
	 * This is true if the Unite Mesure Contamination attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean uniteMesureContaminationESet;

	/**
	 * The default value of the '{@link #getEvolutionDebitDose() <em>Evolution Debit Dose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvolutionDebitDose()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPrelevementEvolutionDebitDose EVOLUTION_DEBIT_DOSE_EDEFAULT = TypeDictionaryDicoPrelevementEvolutionDebitDose.DECR;

	/**
	 * The cached value of the '{@link #getEvolutionDebitDose() <em>Evolution Debit Dose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvolutionDebitDose()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPrelevementEvolutionDebitDose evolutionDebitDose = EVOLUTION_DEBIT_DOSE_EDEFAULT;

	/**
	 * This is true if the Evolution Debit Dose attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean evolutionDebitDoseESet;

	/**
	 * The default value of the '{@link #getTauxReelDecroissance() <em>Taux Reel Decroissance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTauxReelDecroissance()
	 * @generated
	 * @ordered
	 */
	protected static final double TAUX_REEL_DECROISSANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTauxReelDecroissance() <em>Taux Reel Decroissance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTauxReelDecroissance()
	 * @generated
	 * @ordered
	 */
	protected double tauxReelDecroissance = TAUX_REEL_DECROISSANCE_EDEFAULT;

	/**
	 * This is true if the Taux Reel Decroissance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tauxReelDecroissanceESet;

	/**
	 * The default value of the '{@link #getTauxRelatifDecroissance() <em>Taux Relatif Decroissance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTauxRelatifDecroissance()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPrelevementTauxRelatifDecroissance TAUX_RELATIF_DECROISSANCE_EDEFAULT = TypeDictionaryDicoPrelevementTauxRelatifDecroissance.DF;

	/**
	 * The cached value of the '{@link #getTauxRelatifDecroissance() <em>Taux Relatif Decroissance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTauxRelatifDecroissance()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPrelevementTauxRelatifDecroissance tauxRelatifDecroissance = TAUX_RELATIF_DECROISSANCE_EDEFAULT;

	/**
	 * This is true if the Taux Relatif Decroissance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tauxRelatifDecroissanceESet;

	/**
	 * The default value of the '{@link #getDateDetection() <em>Date Detection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDetection()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_DETECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateDetection() <em>Date Detection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDetection()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateDetection = DATE_DETECTION_EDEFAULT;

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
	 * The cached value of the '{@link #getUtiliseTypeEquipementNRBC() <em>Utilise Type Equipement NRBC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtiliseTypeEquipementNRBC()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT utiliseTypeEquipementNRBC;

	/**
	 * The cached value of the '{@link #getEstLocaliseParLocalisationGeometrique2D() <em>Est Localise Par Localisation Geometrique2 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstLocaliseParLocalisationGeometrique2D()
	 * @generated
	 * @ordered
	 */
	protected TypeLocalisationGeometrique2D estLocaliseParLocalisationGeometrique2D;

	/**
	 * The cached value of the '{@link #getAPourEnvironnementEnvironnementTerrainEtVegetation() <em>APour Environnement Environnement Terrain Et Vegetation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourEnvironnementEnvironnementTerrainEtVegetation()
	 * @generated
	 * @ordered
	 */
	protected TypeEnvironnementTerrainEtVegetation aPourEnvironnementEnvironnementTerrainEtVegetation;

	/**
	 * The cached value of the '{@link #getAPourConditionsMeteoTrancheMeteo() <em>APour Conditions Meteo Tranche Meteo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourConditionsMeteoTrancheMeteo()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourConditionsMeteoTrancheMeteo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypePrelevementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePrelevement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPrelevementTypePrelevement getTypePrelevement() {
		return typePrelevement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypePrelevement(TypeDictionaryDicoPrelevementTypePrelevement newTypePrelevement) {
		TypeDictionaryDicoPrelevementTypePrelevement oldTypePrelevement = typePrelevement;
		typePrelevement = newTypePrelevement == null ? TYPE_PRELEVEMENT_EDEFAULT : newTypePrelevement;
		boolean oldTypePrelevementESet = typePrelevementESet;
		typePrelevementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT__TYPE_PRELEVEMENT, oldTypePrelevement, typePrelevement, !oldTypePrelevementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypePrelevement() {
		TypeDictionaryDicoPrelevementTypePrelevement oldTypePrelevement = typePrelevement;
		boolean oldTypePrelevementESet = typePrelevementESet;
		typePrelevement = TYPE_PRELEVEMENT_EDEFAULT;
		typePrelevementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PRELEVEMENT__TYPE_PRELEVEMENT, oldTypePrelevement, TYPE_PRELEVEMENT_EDEFAULT, oldTypePrelevementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypePrelevement() {
		return typePrelevementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateReleve() {
		return dateReleve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateReleve(XMLGregorianCalendar newDateReleve) {
		XMLGregorianCalendar oldDateReleve = dateReleve;
		dateReleve = newDateReleve;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT__DATE_RELEVE, oldDateReleve, dateReleve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNiveauDebitDose() {
		return niveauDebitDose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNiveauDebitDose(double newNiveauDebitDose) {
		double oldNiveauDebitDose = niveauDebitDose;
		niveauDebitDose = newNiveauDebitDose;
		boolean oldNiveauDebitDoseESet = niveauDebitDoseESet;
		niveauDebitDoseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT__NIVEAU_DEBIT_DOSE, oldNiveauDebitDose, niveauDebitDose, !oldNiveauDebitDoseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNiveauDebitDose() {
		double oldNiveauDebitDose = niveauDebitDose;
		boolean oldNiveauDebitDoseESet = niveauDebitDoseESet;
		niveauDebitDose = NIVEAU_DEBIT_DOSE_EDEFAULT;
		niveauDebitDoseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PRELEVEMENT__NIVEAU_DEBIT_DOSE, oldNiveauDebitDose, NIVEAU_DEBIT_DOSE_EDEFAULT, oldNiveauDebitDoseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNiveauDebitDose() {
		return niveauDebitDoseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoUniteDebitDoseDosage getUniteMesureDebitDose() {
		return uniteMesureDebitDose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniteMesureDebitDose(TypeDictionaryDicoUniteDebitDoseDosage newUniteMesureDebitDose) {
		TypeDictionaryDicoUniteDebitDoseDosage oldUniteMesureDebitDose = uniteMesureDebitDose;
		uniteMesureDebitDose = newUniteMesureDebitDose == null ? UNITE_MESURE_DEBIT_DOSE_EDEFAULT : newUniteMesureDebitDose;
		boolean oldUniteMesureDebitDoseESet = uniteMesureDebitDoseESet;
		uniteMesureDebitDoseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT__UNITE_MESURE_DEBIT_DOSE, oldUniteMesureDebitDose, uniteMesureDebitDose, !oldUniteMesureDebitDoseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUniteMesureDebitDose() {
		TypeDictionaryDicoUniteDebitDoseDosage oldUniteMesureDebitDose = uniteMesureDebitDose;
		boolean oldUniteMesureDebitDoseESet = uniteMesureDebitDoseESet;
		uniteMesureDebitDose = UNITE_MESURE_DEBIT_DOSE_EDEFAULT;
		uniteMesureDebitDoseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PRELEVEMENT__UNITE_MESURE_DEBIT_DOSE, oldUniteMesureDebitDose, UNITE_MESURE_DEBIT_DOSE_EDEFAULT, oldUniteMesureDebitDoseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUniteMesureDebitDose() {
		return uniteMesureDebitDoseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNiveauDose() {
		return niveauDose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNiveauDose(double newNiveauDose) {
		double oldNiveauDose = niveauDose;
		niveauDose = newNiveauDose;
		boolean oldNiveauDoseESet = niveauDoseESet;
		niveauDoseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT__NIVEAU_DOSE, oldNiveauDose, niveauDose, !oldNiveauDoseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNiveauDose() {
		double oldNiveauDose = niveauDose;
		boolean oldNiveauDoseESet = niveauDoseESet;
		niveauDose = NIVEAU_DOSE_EDEFAULT;
		niveauDoseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PRELEVEMENT__NIVEAU_DOSE, oldNiveauDose, NIVEAU_DOSE_EDEFAULT, oldNiveauDoseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNiveauDose() {
		return niveauDoseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoUniteNiveauDose getUniteMesureDose() {
		return uniteMesureDose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniteMesureDose(TypeDictionaryDicoUniteNiveauDose newUniteMesureDose) {
		TypeDictionaryDicoUniteNiveauDose oldUniteMesureDose = uniteMesureDose;
		uniteMesureDose = newUniteMesureDose == null ? UNITE_MESURE_DOSE_EDEFAULT : newUniteMesureDose;
		boolean oldUniteMesureDoseESet = uniteMesureDoseESet;
		uniteMesureDoseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT__UNITE_MESURE_DOSE, oldUniteMesureDose, uniteMesureDose, !oldUniteMesureDoseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUniteMesureDose() {
		TypeDictionaryDicoUniteNiveauDose oldUniteMesureDose = uniteMesureDose;
		boolean oldUniteMesureDoseESet = uniteMesureDoseESet;
		uniteMesureDose = UNITE_MESURE_DOSE_EDEFAULT;
		uniteMesureDoseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PRELEVEMENT__UNITE_MESURE_DOSE, oldUniteMesureDose, UNITE_MESURE_DOSE_EDEFAULT, oldUniteMesureDoseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUniteMesureDose() {
		return uniteMesureDoseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNiveauContamination() {
		return niveauContamination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNiveauContamination(double newNiveauContamination) {
		double oldNiveauContamination = niveauContamination;
		niveauContamination = newNiveauContamination;
		boolean oldNiveauContaminationESet = niveauContaminationESet;
		niveauContaminationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT__NIVEAU_CONTAMINATION, oldNiveauContamination, niveauContamination, !oldNiveauContaminationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNiveauContamination() {
		double oldNiveauContamination = niveauContamination;
		boolean oldNiveauContaminationESet = niveauContaminationESet;
		niveauContamination = NIVEAU_CONTAMINATION_EDEFAULT;
		niveauContaminationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PRELEVEMENT__NIVEAU_CONTAMINATION, oldNiveauContamination, NIVEAU_CONTAMINATION_EDEFAULT, oldNiveauContaminationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNiveauContamination() {
		return niveauContaminationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoUniteNiveauContamination getUniteMesureContamination() {
		return uniteMesureContamination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniteMesureContamination(TypeDictionaryDicoUniteNiveauContamination newUniteMesureContamination) {
		TypeDictionaryDicoUniteNiveauContamination oldUniteMesureContamination = uniteMesureContamination;
		uniteMesureContamination = newUniteMesureContamination == null ? UNITE_MESURE_CONTAMINATION_EDEFAULT : newUniteMesureContamination;
		boolean oldUniteMesureContaminationESet = uniteMesureContaminationESet;
		uniteMesureContaminationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT__UNITE_MESURE_CONTAMINATION, oldUniteMesureContamination, uniteMesureContamination, !oldUniteMesureContaminationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUniteMesureContamination() {
		TypeDictionaryDicoUniteNiveauContamination oldUniteMesureContamination = uniteMesureContamination;
		boolean oldUniteMesureContaminationESet = uniteMesureContaminationESet;
		uniteMesureContamination = UNITE_MESURE_CONTAMINATION_EDEFAULT;
		uniteMesureContaminationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PRELEVEMENT__UNITE_MESURE_CONTAMINATION, oldUniteMesureContamination, UNITE_MESURE_CONTAMINATION_EDEFAULT, oldUniteMesureContaminationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUniteMesureContamination() {
		return uniteMesureContaminationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPrelevementEvolutionDebitDose getEvolutionDebitDose() {
		return evolutionDebitDose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvolutionDebitDose(TypeDictionaryDicoPrelevementEvolutionDebitDose newEvolutionDebitDose) {
		TypeDictionaryDicoPrelevementEvolutionDebitDose oldEvolutionDebitDose = evolutionDebitDose;
		evolutionDebitDose = newEvolutionDebitDose == null ? EVOLUTION_DEBIT_DOSE_EDEFAULT : newEvolutionDebitDose;
		boolean oldEvolutionDebitDoseESet = evolutionDebitDoseESet;
		evolutionDebitDoseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT__EVOLUTION_DEBIT_DOSE, oldEvolutionDebitDose, evolutionDebitDose, !oldEvolutionDebitDoseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEvolutionDebitDose() {
		TypeDictionaryDicoPrelevementEvolutionDebitDose oldEvolutionDebitDose = evolutionDebitDose;
		boolean oldEvolutionDebitDoseESet = evolutionDebitDoseESet;
		evolutionDebitDose = EVOLUTION_DEBIT_DOSE_EDEFAULT;
		evolutionDebitDoseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PRELEVEMENT__EVOLUTION_DEBIT_DOSE, oldEvolutionDebitDose, EVOLUTION_DEBIT_DOSE_EDEFAULT, oldEvolutionDebitDoseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEvolutionDebitDose() {
		return evolutionDebitDoseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTauxReelDecroissance() {
		return tauxReelDecroissance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTauxReelDecroissance(double newTauxReelDecroissance) {
		double oldTauxReelDecroissance = tauxReelDecroissance;
		tauxReelDecroissance = newTauxReelDecroissance;
		boolean oldTauxReelDecroissanceESet = tauxReelDecroissanceESet;
		tauxReelDecroissanceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT__TAUX_REEL_DECROISSANCE, oldTauxReelDecroissance, tauxReelDecroissance, !oldTauxReelDecroissanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTauxReelDecroissance() {
		double oldTauxReelDecroissance = tauxReelDecroissance;
		boolean oldTauxReelDecroissanceESet = tauxReelDecroissanceESet;
		tauxReelDecroissance = TAUX_REEL_DECROISSANCE_EDEFAULT;
		tauxReelDecroissanceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PRELEVEMENT__TAUX_REEL_DECROISSANCE, oldTauxReelDecroissance, TAUX_REEL_DECROISSANCE_EDEFAULT, oldTauxReelDecroissanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTauxReelDecroissance() {
		return tauxReelDecroissanceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPrelevementTauxRelatifDecroissance getTauxRelatifDecroissance() {
		return tauxRelatifDecroissance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTauxRelatifDecroissance(TypeDictionaryDicoPrelevementTauxRelatifDecroissance newTauxRelatifDecroissance) {
		TypeDictionaryDicoPrelevementTauxRelatifDecroissance oldTauxRelatifDecroissance = tauxRelatifDecroissance;
		tauxRelatifDecroissance = newTauxRelatifDecroissance == null ? TAUX_RELATIF_DECROISSANCE_EDEFAULT : newTauxRelatifDecroissance;
		boolean oldTauxRelatifDecroissanceESet = tauxRelatifDecroissanceESet;
		tauxRelatifDecroissanceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT__TAUX_RELATIF_DECROISSANCE, oldTauxRelatifDecroissance, tauxRelatifDecroissance, !oldTauxRelatifDecroissanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTauxRelatifDecroissance() {
		TypeDictionaryDicoPrelevementTauxRelatifDecroissance oldTauxRelatifDecroissance = tauxRelatifDecroissance;
		boolean oldTauxRelatifDecroissanceESet = tauxRelatifDecroissanceESet;
		tauxRelatifDecroissance = TAUX_RELATIF_DECROISSANCE_EDEFAULT;
		tauxRelatifDecroissanceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PRELEVEMENT__TAUX_RELATIF_DECROISSANCE, oldTauxRelatifDecroissance, TAUX_RELATIF_DECROISSANCE_EDEFAULT, oldTauxRelatifDecroissanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTauxRelatifDecroissance() {
		return tauxRelatifDecroissanceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateDetection() {
		return dateDetection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDetection(XMLGregorianCalendar newDateDetection) {
		XMLGregorianCalendar oldDateDetection = dateDetection;
		dateDetection = newDateDetection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT__DATE_DETECTION, oldDateDetection, dateDetection));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getUtiliseTypeEquipementNRBC() {
		return utiliseTypeEquipementNRBC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUtiliseTypeEquipementNRBC(TypeAssociationEXT newUtiliseTypeEquipementNRBC, NotificationChain msgs) {
		TypeAssociationEXT oldUtiliseTypeEquipementNRBC = utiliseTypeEquipementNRBC;
		utiliseTypeEquipementNRBC = newUtiliseTypeEquipementNRBC;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT__UTILISE_TYPE_EQUIPEMENT_NRBC, oldUtiliseTypeEquipementNRBC, newUtiliseTypeEquipementNRBC);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUtiliseTypeEquipementNRBC(TypeAssociationEXT newUtiliseTypeEquipementNRBC) {
		if (newUtiliseTypeEquipementNRBC != utiliseTypeEquipementNRBC) {
			NotificationChain msgs = null;
			if (utiliseTypeEquipementNRBC != null)
				msgs = ((InternalEObject)utiliseTypeEquipementNRBC).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PRELEVEMENT__UTILISE_TYPE_EQUIPEMENT_NRBC, null, msgs);
			if (newUtiliseTypeEquipementNRBC != null)
				msgs = ((InternalEObject)newUtiliseTypeEquipementNRBC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PRELEVEMENT__UTILISE_TYPE_EQUIPEMENT_NRBC, null, msgs);
			msgs = basicSetUtiliseTypeEquipementNRBC(newUtiliseTypeEquipementNRBC, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT__UTILISE_TYPE_EQUIPEMENT_NRBC, newUtiliseTypeEquipementNRBC, newUtiliseTypeEquipementNRBC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeLocalisationGeometrique2D getEstLocaliseParLocalisationGeometrique2D() {
		return estLocaliseParLocalisationGeometrique2D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstLocaliseParLocalisationGeometrique2D(TypeLocalisationGeometrique2D newEstLocaliseParLocalisationGeometrique2D, NotificationChain msgs) {
		TypeLocalisationGeometrique2D oldEstLocaliseParLocalisationGeometrique2D = estLocaliseParLocalisationGeometrique2D;
		estLocaliseParLocalisationGeometrique2D = newEstLocaliseParLocalisationGeometrique2D;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT__EST_LOCALISE_PAR_LOCALISATION_GEOMETRIQUE2_D, oldEstLocaliseParLocalisationGeometrique2D, newEstLocaliseParLocalisationGeometrique2D);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstLocaliseParLocalisationGeometrique2D(TypeLocalisationGeometrique2D newEstLocaliseParLocalisationGeometrique2D) {
		if (newEstLocaliseParLocalisationGeometrique2D != estLocaliseParLocalisationGeometrique2D) {
			NotificationChain msgs = null;
			if (estLocaliseParLocalisationGeometrique2D != null)
				msgs = ((InternalEObject)estLocaliseParLocalisationGeometrique2D).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PRELEVEMENT__EST_LOCALISE_PAR_LOCALISATION_GEOMETRIQUE2_D, null, msgs);
			if (newEstLocaliseParLocalisationGeometrique2D != null)
				msgs = ((InternalEObject)newEstLocaliseParLocalisationGeometrique2D).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PRELEVEMENT__EST_LOCALISE_PAR_LOCALISATION_GEOMETRIQUE2_D, null, msgs);
			msgs = basicSetEstLocaliseParLocalisationGeometrique2D(newEstLocaliseParLocalisationGeometrique2D, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT__EST_LOCALISE_PAR_LOCALISATION_GEOMETRIQUE2_D, newEstLocaliseParLocalisationGeometrique2D, newEstLocaliseParLocalisationGeometrique2D));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeEnvironnementTerrainEtVegetation getAPourEnvironnementEnvironnementTerrainEtVegetation() {
		return aPourEnvironnementEnvironnementTerrainEtVegetation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourEnvironnementEnvironnementTerrainEtVegetation(TypeEnvironnementTerrainEtVegetation newAPourEnvironnementEnvironnementTerrainEtVegetation, NotificationChain msgs) {
		TypeEnvironnementTerrainEtVegetation oldAPourEnvironnementEnvironnementTerrainEtVegetation = aPourEnvironnementEnvironnementTerrainEtVegetation;
		aPourEnvironnementEnvironnementTerrainEtVegetation = newAPourEnvironnementEnvironnementTerrainEtVegetation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT__APOUR_ENVIRONNEMENT_ENVIRONNEMENT_TERRAIN_ET_VEGETATION, oldAPourEnvironnementEnvironnementTerrainEtVegetation, newAPourEnvironnementEnvironnementTerrainEtVegetation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourEnvironnementEnvironnementTerrainEtVegetation(TypeEnvironnementTerrainEtVegetation newAPourEnvironnementEnvironnementTerrainEtVegetation) {
		if (newAPourEnvironnementEnvironnementTerrainEtVegetation != aPourEnvironnementEnvironnementTerrainEtVegetation) {
			NotificationChain msgs = null;
			if (aPourEnvironnementEnvironnementTerrainEtVegetation != null)
				msgs = ((InternalEObject)aPourEnvironnementEnvironnementTerrainEtVegetation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PRELEVEMENT__APOUR_ENVIRONNEMENT_ENVIRONNEMENT_TERRAIN_ET_VEGETATION, null, msgs);
			if (newAPourEnvironnementEnvironnementTerrainEtVegetation != null)
				msgs = ((InternalEObject)newAPourEnvironnementEnvironnementTerrainEtVegetation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PRELEVEMENT__APOUR_ENVIRONNEMENT_ENVIRONNEMENT_TERRAIN_ET_VEGETATION, null, msgs);
			msgs = basicSetAPourEnvironnementEnvironnementTerrainEtVegetation(newAPourEnvironnementEnvironnementTerrainEtVegetation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT__APOUR_ENVIRONNEMENT_ENVIRONNEMENT_TERRAIN_ET_VEGETATION, newAPourEnvironnementEnvironnementTerrainEtVegetation, newAPourEnvironnementEnvironnementTerrainEtVegetation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourConditionsMeteoTrancheMeteo() {
		return aPourConditionsMeteoTrancheMeteo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourConditionsMeteoTrancheMeteo(TypeAssociation newAPourConditionsMeteoTrancheMeteo, NotificationChain msgs) {
		TypeAssociation oldAPourConditionsMeteoTrancheMeteo = aPourConditionsMeteoTrancheMeteo;
		aPourConditionsMeteoTrancheMeteo = newAPourConditionsMeteoTrancheMeteo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT__APOUR_CONDITIONS_METEO_TRANCHE_METEO, oldAPourConditionsMeteoTrancheMeteo, newAPourConditionsMeteoTrancheMeteo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourConditionsMeteoTrancheMeteo(TypeAssociation newAPourConditionsMeteoTrancheMeteo) {
		if (newAPourConditionsMeteoTrancheMeteo != aPourConditionsMeteoTrancheMeteo) {
			NotificationChain msgs = null;
			if (aPourConditionsMeteoTrancheMeteo != null)
				msgs = ((InternalEObject)aPourConditionsMeteoTrancheMeteo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PRELEVEMENT__APOUR_CONDITIONS_METEO_TRANCHE_METEO, null, msgs);
			if (newAPourConditionsMeteoTrancheMeteo != null)
				msgs = ((InternalEObject)newAPourConditionsMeteoTrancheMeteo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PRELEVEMENT__APOUR_CONDITIONS_METEO_TRANCHE_METEO, null, msgs);
			msgs = basicSetAPourConditionsMeteoTrancheMeteo(newAPourConditionsMeteoTrancheMeteo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT__APOUR_CONDITIONS_METEO_TRANCHE_METEO, newAPourConditionsMeteoTrancheMeteo, newAPourConditionsMeteoTrancheMeteo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_PRELEVEMENT__UTILISE_TYPE_EQUIPEMENT_NRBC:
				return basicSetUtiliseTypeEquipementNRBC(null, msgs);
			case SchemaPackage.TYPE_PRELEVEMENT__EST_LOCALISE_PAR_LOCALISATION_GEOMETRIQUE2_D:
				return basicSetEstLocaliseParLocalisationGeometrique2D(null, msgs);
			case SchemaPackage.TYPE_PRELEVEMENT__APOUR_ENVIRONNEMENT_ENVIRONNEMENT_TERRAIN_ET_VEGETATION:
				return basicSetAPourEnvironnementEnvironnementTerrainEtVegetation(null, msgs);
			case SchemaPackage.TYPE_PRELEVEMENT__APOUR_CONDITIONS_METEO_TRANCHE_METEO:
				return basicSetAPourConditionsMeteoTrancheMeteo(null, msgs);
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
			case SchemaPackage.TYPE_PRELEVEMENT__TYPE_PRELEVEMENT:
				return getTypePrelevement();
			case SchemaPackage.TYPE_PRELEVEMENT__DATE_RELEVE:
				return getDateReleve();
			case SchemaPackage.TYPE_PRELEVEMENT__NIVEAU_DEBIT_DOSE:
				return new Double(getNiveauDebitDose());
			case SchemaPackage.TYPE_PRELEVEMENT__UNITE_MESURE_DEBIT_DOSE:
				return getUniteMesureDebitDose();
			case SchemaPackage.TYPE_PRELEVEMENT__NIVEAU_DOSE:
				return new Double(getNiveauDose());
			case SchemaPackage.TYPE_PRELEVEMENT__UNITE_MESURE_DOSE:
				return getUniteMesureDose();
			case SchemaPackage.TYPE_PRELEVEMENT__NIVEAU_CONTAMINATION:
				return new Double(getNiveauContamination());
			case SchemaPackage.TYPE_PRELEVEMENT__UNITE_MESURE_CONTAMINATION:
				return getUniteMesureContamination();
			case SchemaPackage.TYPE_PRELEVEMENT__EVOLUTION_DEBIT_DOSE:
				return getEvolutionDebitDose();
			case SchemaPackage.TYPE_PRELEVEMENT__TAUX_REEL_DECROISSANCE:
				return new Double(getTauxReelDecroissance());
			case SchemaPackage.TYPE_PRELEVEMENT__TAUX_RELATIF_DECROISSANCE:
				return getTauxRelatifDecroissance();
			case SchemaPackage.TYPE_PRELEVEMENT__DATE_DETECTION:
				return getDateDetection();
			case SchemaPackage.TYPE_PRELEVEMENT__CTE:
				return getCTE();
			case SchemaPackage.TYPE_PRELEVEMENT__CE:
				return getCE();
			case SchemaPackage.TYPE_PRELEVEMENT__UTILISE_TYPE_EQUIPEMENT_NRBC:
				return getUtiliseTypeEquipementNRBC();
			case SchemaPackage.TYPE_PRELEVEMENT__EST_LOCALISE_PAR_LOCALISATION_GEOMETRIQUE2_D:
				return getEstLocaliseParLocalisationGeometrique2D();
			case SchemaPackage.TYPE_PRELEVEMENT__APOUR_ENVIRONNEMENT_ENVIRONNEMENT_TERRAIN_ET_VEGETATION:
				return getAPourEnvironnementEnvironnementTerrainEtVegetation();
			case SchemaPackage.TYPE_PRELEVEMENT__APOUR_CONDITIONS_METEO_TRANCHE_METEO:
				return getAPourConditionsMeteoTrancheMeteo();
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
			case SchemaPackage.TYPE_PRELEVEMENT__TYPE_PRELEVEMENT:
				setTypePrelevement((TypeDictionaryDicoPrelevementTypePrelevement)newValue);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT__DATE_RELEVE:
				setDateReleve((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT__NIVEAU_DEBIT_DOSE:
				setNiveauDebitDose(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_PRELEVEMENT__UNITE_MESURE_DEBIT_DOSE:
				setUniteMesureDebitDose((TypeDictionaryDicoUniteDebitDoseDosage)newValue);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT__NIVEAU_DOSE:
				setNiveauDose(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_PRELEVEMENT__UNITE_MESURE_DOSE:
				setUniteMesureDose((TypeDictionaryDicoUniteNiveauDose)newValue);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT__NIVEAU_CONTAMINATION:
				setNiveauContamination(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_PRELEVEMENT__UNITE_MESURE_CONTAMINATION:
				setUniteMesureContamination((TypeDictionaryDicoUniteNiveauContamination)newValue);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT__EVOLUTION_DEBIT_DOSE:
				setEvolutionDebitDose((TypeDictionaryDicoPrelevementEvolutionDebitDose)newValue);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT__TAUX_REEL_DECROISSANCE:
				setTauxReelDecroissance(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_PRELEVEMENT__TAUX_RELATIF_DECROISSANCE:
				setTauxRelatifDecroissance((TypeDictionaryDicoPrelevementTauxRelatifDecroissance)newValue);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT__DATE_DETECTION:
				setDateDetection((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT__UTILISE_TYPE_EQUIPEMENT_NRBC:
				setUtiliseTypeEquipementNRBC((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT__EST_LOCALISE_PAR_LOCALISATION_GEOMETRIQUE2_D:
				setEstLocaliseParLocalisationGeometrique2D((TypeLocalisationGeometrique2D)newValue);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT__APOUR_ENVIRONNEMENT_ENVIRONNEMENT_TERRAIN_ET_VEGETATION:
				setAPourEnvironnementEnvironnementTerrainEtVegetation((TypeEnvironnementTerrainEtVegetation)newValue);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT__APOUR_CONDITIONS_METEO_TRANCHE_METEO:
				setAPourConditionsMeteoTrancheMeteo((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_PRELEVEMENT__TYPE_PRELEVEMENT:
				unsetTypePrelevement();
				return;
			case SchemaPackage.TYPE_PRELEVEMENT__DATE_RELEVE:
				setDateReleve(DATE_RELEVE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT__NIVEAU_DEBIT_DOSE:
				unsetNiveauDebitDose();
				return;
			case SchemaPackage.TYPE_PRELEVEMENT__UNITE_MESURE_DEBIT_DOSE:
				unsetUniteMesureDebitDose();
				return;
			case SchemaPackage.TYPE_PRELEVEMENT__NIVEAU_DOSE:
				unsetNiveauDose();
				return;
			case SchemaPackage.TYPE_PRELEVEMENT__UNITE_MESURE_DOSE:
				unsetUniteMesureDose();
				return;
			case SchemaPackage.TYPE_PRELEVEMENT__NIVEAU_CONTAMINATION:
				unsetNiveauContamination();
				return;
			case SchemaPackage.TYPE_PRELEVEMENT__UNITE_MESURE_CONTAMINATION:
				unsetUniteMesureContamination();
				return;
			case SchemaPackage.TYPE_PRELEVEMENT__EVOLUTION_DEBIT_DOSE:
				unsetEvolutionDebitDose();
				return;
			case SchemaPackage.TYPE_PRELEVEMENT__TAUX_REEL_DECROISSANCE:
				unsetTauxReelDecroissance();
				return;
			case SchemaPackage.TYPE_PRELEVEMENT__TAUX_RELATIF_DECROISSANCE:
				unsetTauxRelatifDecroissance();
				return;
			case SchemaPackage.TYPE_PRELEVEMENT__DATE_DETECTION:
				setDateDetection(DATE_DETECTION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT__UTILISE_TYPE_EQUIPEMENT_NRBC:
				setUtiliseTypeEquipementNRBC((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT__EST_LOCALISE_PAR_LOCALISATION_GEOMETRIQUE2_D:
				setEstLocaliseParLocalisationGeometrique2D((TypeLocalisationGeometrique2D)null);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT__APOUR_ENVIRONNEMENT_ENVIRONNEMENT_TERRAIN_ET_VEGETATION:
				setAPourEnvironnementEnvironnementTerrainEtVegetation((TypeEnvironnementTerrainEtVegetation)null);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT__APOUR_CONDITIONS_METEO_TRANCHE_METEO:
				setAPourConditionsMeteoTrancheMeteo((TypeAssociation)null);
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
			case SchemaPackage.TYPE_PRELEVEMENT__TYPE_PRELEVEMENT:
				return isSetTypePrelevement();
			case SchemaPackage.TYPE_PRELEVEMENT__DATE_RELEVE:
				return DATE_RELEVE_EDEFAULT == null ? dateReleve != null : !DATE_RELEVE_EDEFAULT.equals(dateReleve);
			case SchemaPackage.TYPE_PRELEVEMENT__NIVEAU_DEBIT_DOSE:
				return isSetNiveauDebitDose();
			case SchemaPackage.TYPE_PRELEVEMENT__UNITE_MESURE_DEBIT_DOSE:
				return isSetUniteMesureDebitDose();
			case SchemaPackage.TYPE_PRELEVEMENT__NIVEAU_DOSE:
				return isSetNiveauDose();
			case SchemaPackage.TYPE_PRELEVEMENT__UNITE_MESURE_DOSE:
				return isSetUniteMesureDose();
			case SchemaPackage.TYPE_PRELEVEMENT__NIVEAU_CONTAMINATION:
				return isSetNiveauContamination();
			case SchemaPackage.TYPE_PRELEVEMENT__UNITE_MESURE_CONTAMINATION:
				return isSetUniteMesureContamination();
			case SchemaPackage.TYPE_PRELEVEMENT__EVOLUTION_DEBIT_DOSE:
				return isSetEvolutionDebitDose();
			case SchemaPackage.TYPE_PRELEVEMENT__TAUX_REEL_DECROISSANCE:
				return isSetTauxReelDecroissance();
			case SchemaPackage.TYPE_PRELEVEMENT__TAUX_RELATIF_DECROISSANCE:
				return isSetTauxRelatifDecroissance();
			case SchemaPackage.TYPE_PRELEVEMENT__DATE_DETECTION:
				return DATE_DETECTION_EDEFAULT == null ? dateDetection != null : !DATE_DETECTION_EDEFAULT.equals(dateDetection);
			case SchemaPackage.TYPE_PRELEVEMENT__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_PRELEVEMENT__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_PRELEVEMENT__UTILISE_TYPE_EQUIPEMENT_NRBC:
				return utiliseTypeEquipementNRBC != null;
			case SchemaPackage.TYPE_PRELEVEMENT__EST_LOCALISE_PAR_LOCALISATION_GEOMETRIQUE2_D:
				return estLocaliseParLocalisationGeometrique2D != null;
			case SchemaPackage.TYPE_PRELEVEMENT__APOUR_ENVIRONNEMENT_ENVIRONNEMENT_TERRAIN_ET_VEGETATION:
				return aPourEnvironnementEnvironnementTerrainEtVegetation != null;
			case SchemaPackage.TYPE_PRELEVEMENT__APOUR_CONDITIONS_METEO_TRANCHE_METEO:
				return aPourConditionsMeteoTrancheMeteo != null;
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
		result.append(" (typePrelevement: ");
		if (typePrelevementESet) result.append(typePrelevement); else result.append("<unset>");
		result.append(", dateReleve: ");
		result.append(dateReleve);
		result.append(", niveauDebitDose: ");
		if (niveauDebitDoseESet) result.append(niveauDebitDose); else result.append("<unset>");
		result.append(", uniteMesureDebitDose: ");
		if (uniteMesureDebitDoseESet) result.append(uniteMesureDebitDose); else result.append("<unset>");
		result.append(", niveauDose: ");
		if (niveauDoseESet) result.append(niveauDose); else result.append("<unset>");
		result.append(", uniteMesureDose: ");
		if (uniteMesureDoseESet) result.append(uniteMesureDose); else result.append("<unset>");
		result.append(", niveauContamination: ");
		if (niveauContaminationESet) result.append(niveauContamination); else result.append("<unset>");
		result.append(", uniteMesureContamination: ");
		if (uniteMesureContaminationESet) result.append(uniteMesureContamination); else result.append("<unset>");
		result.append(", evolutionDebitDose: ");
		if (evolutionDebitDoseESet) result.append(evolutionDebitDose); else result.append("<unset>");
		result.append(", tauxReelDecroissance: ");
		if (tauxReelDecroissanceESet) result.append(tauxReelDecroissance); else result.append("<unset>");
		result.append(", tauxRelatifDecroissance: ");
		if (tauxRelatifDecroissanceESet) result.append(tauxRelatifDecroissance); else result.append("<unset>");
		result.append(", dateDetection: ");
		result.append(dateDetection);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypePrelevementImpl
