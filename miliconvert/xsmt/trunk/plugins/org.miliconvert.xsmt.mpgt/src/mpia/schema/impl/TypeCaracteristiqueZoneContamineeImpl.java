/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCaracteristiqueZoneContaminee;
import mpia.schema.TypeDictionaryDicoUniteDebitDoseDosage;
import mpia.schema.TypeDictionaryDicoUniteNiveauContamination;
import mpia.schema.TypeDictionaryDicoUniteNiveauDose;
import mpia.schema.TypeDictionaryDicoZoneContamineeNiveauDanger;

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
 * An implementation of the model object '<em><b>Type Caracteristique Zone Contaminee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiqueZoneContamineeImpl#getEffetsRecherches <em>Effets Recherches</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiqueZoneContamineeImpl#getDebutPersistance <em>Debut Persistance</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiqueZoneContamineeImpl#getFinPersistance <em>Fin Persistance</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiqueZoneContamineeImpl#getNiveauContamination <em>Niveau Contamination</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiqueZoneContamineeImpl#getUniteNiveauContamination <em>Unite Niveau Contamination</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiqueZoneContamineeImpl#getFiabiliteContamination <em>Fiabilite Contamination</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiqueZoneContamineeImpl#getNiveauDanger <em>Niveau Danger</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiqueZoneContamineeImpl#getPourcentageNiveauDanger <em>Pourcentage Niveau Danger</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiqueZoneContamineeImpl#getNiveauDose <em>Niveau Dose</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiqueZoneContamineeImpl#getUniteNiveauDose <em>Unite Niveau Dose</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiqueZoneContamineeImpl#getNiveauDebitDoseDosage <em>Niveau Debit Dose Dosage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiqueZoneContamineeImpl#getUniteDebitDoseDosage <em>Unite Debit Dose Dosage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiqueZoneContamineeImpl#getAgentsContaminantsTypeConsommable <em>Agents Contaminants Type Consommable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCaracteristiqueZoneContamineeImpl extends EObjectImpl implements TypeCaracteristiqueZoneContaminee {
	/**
	 * The default value of the '{@link #getEffetsRecherches() <em>Effets Recherches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffetsRecherches()
	 * @generated
	 * @ordered
	 */
	protected static final String EFFETS_RECHERCHES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEffetsRecherches() <em>Effets Recherches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffetsRecherches()
	 * @generated
	 * @ordered
	 */
	protected String effetsRecherches = EFFETS_RECHERCHES_EDEFAULT;

	/**
	 * The default value of the '{@link #getDebutPersistance() <em>Debut Persistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebutPersistance()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DEBUT_PERSISTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDebutPersistance() <em>Debut Persistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebutPersistance()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar debutPersistance = DEBUT_PERSISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinPersistance() <em>Fin Persistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinPersistance()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar FIN_PERSISTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFinPersistance() <em>Fin Persistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinPersistance()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar finPersistance = FIN_PERSISTANCE_EDEFAULT;

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
	 * The default value of the '{@link #getUniteNiveauContamination() <em>Unite Niveau Contamination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniteNiveauContamination()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoUniteNiveauContamination UNITE_NIVEAU_CONTAMINATION_EDEFAULT = TypeDictionaryDicoUniteNiveauContamination.BQM2;

	/**
	 * The cached value of the '{@link #getUniteNiveauContamination() <em>Unite Niveau Contamination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniteNiveauContamination()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoUniteNiveauContamination uniteNiveauContamination = UNITE_NIVEAU_CONTAMINATION_EDEFAULT;

	/**
	 * This is true if the Unite Niveau Contamination attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean uniteNiveauContaminationESet;

	/**
	 * The default value of the '{@link #getFiabiliteContamination() <em>Fiabilite Contamination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiabiliteContamination()
	 * @generated
	 * @ordered
	 */
	protected static final double FIABILITE_CONTAMINATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFiabiliteContamination() <em>Fiabilite Contamination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiabiliteContamination()
	 * @generated
	 * @ordered
	 */
	protected double fiabiliteContamination = FIABILITE_CONTAMINATION_EDEFAULT;

	/**
	 * This is true if the Fiabilite Contamination attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fiabiliteContaminationESet;

	/**
	 * The default value of the '{@link #getNiveauDanger() <em>Niveau Danger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauDanger()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoZoneContamineeNiveauDanger NIVEAU_DANGER_EDEFAULT = TypeDictionaryDicoZoneContamineeNiveauDanger.LD;

	/**
	 * The cached value of the '{@link #getNiveauDanger() <em>Niveau Danger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauDanger()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoZoneContamineeNiveauDanger niveauDanger = NIVEAU_DANGER_EDEFAULT;

	/**
	 * This is true if the Niveau Danger attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean niveauDangerESet;

	/**
	 * The default value of the '{@link #getPourcentageNiveauDanger() <em>Pourcentage Niveau Danger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPourcentageNiveauDanger()
	 * @generated
	 * @ordered
	 */
	protected static final double POURCENTAGE_NIVEAU_DANGER_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPourcentageNiveauDanger() <em>Pourcentage Niveau Danger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPourcentageNiveauDanger()
	 * @generated
	 * @ordered
	 */
	protected double pourcentageNiveauDanger = POURCENTAGE_NIVEAU_DANGER_EDEFAULT;

	/**
	 * This is true if the Pourcentage Niveau Danger attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pourcentageNiveauDangerESet;

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
	 * The default value of the '{@link #getUniteNiveauDose() <em>Unite Niveau Dose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniteNiveauDose()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoUniteNiveauDose UNITE_NIVEAU_DOSE_EDEFAULT = TypeDictionaryDicoUniteNiveauDose.CGY;

	/**
	 * The cached value of the '{@link #getUniteNiveauDose() <em>Unite Niveau Dose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniteNiveauDose()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoUniteNiveauDose uniteNiveauDose = UNITE_NIVEAU_DOSE_EDEFAULT;

	/**
	 * This is true if the Unite Niveau Dose attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean uniteNiveauDoseESet;

	/**
	 * The default value of the '{@link #getNiveauDebitDoseDosage() <em>Niveau Debit Dose Dosage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauDebitDoseDosage()
	 * @generated
	 * @ordered
	 */
	protected static final double NIVEAU_DEBIT_DOSE_DOSAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getNiveauDebitDoseDosage() <em>Niveau Debit Dose Dosage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauDebitDoseDosage()
	 * @generated
	 * @ordered
	 */
	protected double niveauDebitDoseDosage = NIVEAU_DEBIT_DOSE_DOSAGE_EDEFAULT;

	/**
	 * This is true if the Niveau Debit Dose Dosage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean niveauDebitDoseDosageESet;

	/**
	 * The default value of the '{@link #getUniteDebitDoseDosage() <em>Unite Debit Dose Dosage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniteDebitDoseDosage()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoUniteDebitDoseDosage UNITE_DEBIT_DOSE_DOSAGE_EDEFAULT = TypeDictionaryDicoUniteDebitDoseDosage.CGH;

	/**
	 * The cached value of the '{@link #getUniteDebitDoseDosage() <em>Unite Debit Dose Dosage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniteDebitDoseDosage()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoUniteDebitDoseDosage uniteDebitDoseDosage = UNITE_DEBIT_DOSE_DOSAGE_EDEFAULT;

	/**
	 * This is true if the Unite Debit Dose Dosage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean uniteDebitDoseDosageESet;

	/**
	 * The cached value of the '{@link #getAgentsContaminantsTypeConsommable() <em>Agents Contaminants Type Consommable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgentsContaminantsTypeConsommable()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociationEXT> agentsContaminantsTypeConsommable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCaracteristiqueZoneContamineeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCaracteristiqueZoneContaminee();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEffetsRecherches() {
		return effetsRecherches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffetsRecherches(String newEffetsRecherches) {
		String oldEffetsRecherches = effetsRecherches;
		effetsRecherches = newEffetsRecherches;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__EFFETS_RECHERCHES, oldEffetsRecherches, effetsRecherches));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDebutPersistance() {
		return debutPersistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebutPersistance(XMLGregorianCalendar newDebutPersistance) {
		XMLGregorianCalendar oldDebutPersistance = debutPersistance;
		debutPersistance = newDebutPersistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__DEBUT_PERSISTANCE, oldDebutPersistance, debutPersistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getFinPersistance() {
		return finPersistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinPersistance(XMLGregorianCalendar newFinPersistance) {
		XMLGregorianCalendar oldFinPersistance = finPersistance;
		finPersistance = newFinPersistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__FIN_PERSISTANCE, oldFinPersistance, finPersistance));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__NIVEAU_CONTAMINATION, oldNiveauContamination, niveauContamination, !oldNiveauContaminationESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__NIVEAU_CONTAMINATION, oldNiveauContamination, NIVEAU_CONTAMINATION_EDEFAULT, oldNiveauContaminationESet));
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
	public TypeDictionaryDicoUniteNiveauContamination getUniteNiveauContamination() {
		return uniteNiveauContamination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniteNiveauContamination(TypeDictionaryDicoUniteNiveauContamination newUniteNiveauContamination) {
		TypeDictionaryDicoUniteNiveauContamination oldUniteNiveauContamination = uniteNiveauContamination;
		uniteNiveauContamination = newUniteNiveauContamination == null ? UNITE_NIVEAU_CONTAMINATION_EDEFAULT : newUniteNiveauContamination;
		boolean oldUniteNiveauContaminationESet = uniteNiveauContaminationESet;
		uniteNiveauContaminationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__UNITE_NIVEAU_CONTAMINATION, oldUniteNiveauContamination, uniteNiveauContamination, !oldUniteNiveauContaminationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUniteNiveauContamination() {
		TypeDictionaryDicoUniteNiveauContamination oldUniteNiveauContamination = uniteNiveauContamination;
		boolean oldUniteNiveauContaminationESet = uniteNiveauContaminationESet;
		uniteNiveauContamination = UNITE_NIVEAU_CONTAMINATION_EDEFAULT;
		uniteNiveauContaminationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__UNITE_NIVEAU_CONTAMINATION, oldUniteNiveauContamination, UNITE_NIVEAU_CONTAMINATION_EDEFAULT, oldUniteNiveauContaminationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUniteNiveauContamination() {
		return uniteNiveauContaminationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFiabiliteContamination() {
		return fiabiliteContamination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFiabiliteContamination(double newFiabiliteContamination) {
		double oldFiabiliteContamination = fiabiliteContamination;
		fiabiliteContamination = newFiabiliteContamination;
		boolean oldFiabiliteContaminationESet = fiabiliteContaminationESet;
		fiabiliteContaminationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__FIABILITE_CONTAMINATION, oldFiabiliteContamination, fiabiliteContamination, !oldFiabiliteContaminationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFiabiliteContamination() {
		double oldFiabiliteContamination = fiabiliteContamination;
		boolean oldFiabiliteContaminationESet = fiabiliteContaminationESet;
		fiabiliteContamination = FIABILITE_CONTAMINATION_EDEFAULT;
		fiabiliteContaminationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__FIABILITE_CONTAMINATION, oldFiabiliteContamination, FIABILITE_CONTAMINATION_EDEFAULT, oldFiabiliteContaminationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFiabiliteContamination() {
		return fiabiliteContaminationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoZoneContamineeNiveauDanger getNiveauDanger() {
		return niveauDanger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNiveauDanger(TypeDictionaryDicoZoneContamineeNiveauDanger newNiveauDanger) {
		TypeDictionaryDicoZoneContamineeNiveauDanger oldNiveauDanger = niveauDanger;
		niveauDanger = newNiveauDanger == null ? NIVEAU_DANGER_EDEFAULT : newNiveauDanger;
		boolean oldNiveauDangerESet = niveauDangerESet;
		niveauDangerESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__NIVEAU_DANGER, oldNiveauDanger, niveauDanger, !oldNiveauDangerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNiveauDanger() {
		TypeDictionaryDicoZoneContamineeNiveauDanger oldNiveauDanger = niveauDanger;
		boolean oldNiveauDangerESet = niveauDangerESet;
		niveauDanger = NIVEAU_DANGER_EDEFAULT;
		niveauDangerESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__NIVEAU_DANGER, oldNiveauDanger, NIVEAU_DANGER_EDEFAULT, oldNiveauDangerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNiveauDanger() {
		return niveauDangerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPourcentageNiveauDanger() {
		return pourcentageNiveauDanger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPourcentageNiveauDanger(double newPourcentageNiveauDanger) {
		double oldPourcentageNiveauDanger = pourcentageNiveauDanger;
		pourcentageNiveauDanger = newPourcentageNiveauDanger;
		boolean oldPourcentageNiveauDangerESet = pourcentageNiveauDangerESet;
		pourcentageNiveauDangerESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__POURCENTAGE_NIVEAU_DANGER, oldPourcentageNiveauDanger, pourcentageNiveauDanger, !oldPourcentageNiveauDangerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPourcentageNiveauDanger() {
		double oldPourcentageNiveauDanger = pourcentageNiveauDanger;
		boolean oldPourcentageNiveauDangerESet = pourcentageNiveauDangerESet;
		pourcentageNiveauDanger = POURCENTAGE_NIVEAU_DANGER_EDEFAULT;
		pourcentageNiveauDangerESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__POURCENTAGE_NIVEAU_DANGER, oldPourcentageNiveauDanger, POURCENTAGE_NIVEAU_DANGER_EDEFAULT, oldPourcentageNiveauDangerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPourcentageNiveauDanger() {
		return pourcentageNiveauDangerESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__NIVEAU_DOSE, oldNiveauDose, niveauDose, !oldNiveauDoseESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__NIVEAU_DOSE, oldNiveauDose, NIVEAU_DOSE_EDEFAULT, oldNiveauDoseESet));
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
	public TypeDictionaryDicoUniteNiveauDose getUniteNiveauDose() {
		return uniteNiveauDose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniteNiveauDose(TypeDictionaryDicoUniteNiveauDose newUniteNiveauDose) {
		TypeDictionaryDicoUniteNiveauDose oldUniteNiveauDose = uniteNiveauDose;
		uniteNiveauDose = newUniteNiveauDose == null ? UNITE_NIVEAU_DOSE_EDEFAULT : newUniteNiveauDose;
		boolean oldUniteNiveauDoseESet = uniteNiveauDoseESet;
		uniteNiveauDoseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__UNITE_NIVEAU_DOSE, oldUniteNiveauDose, uniteNiveauDose, !oldUniteNiveauDoseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUniteNiveauDose() {
		TypeDictionaryDicoUniteNiveauDose oldUniteNiveauDose = uniteNiveauDose;
		boolean oldUniteNiveauDoseESet = uniteNiveauDoseESet;
		uniteNiveauDose = UNITE_NIVEAU_DOSE_EDEFAULT;
		uniteNiveauDoseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__UNITE_NIVEAU_DOSE, oldUniteNiveauDose, UNITE_NIVEAU_DOSE_EDEFAULT, oldUniteNiveauDoseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUniteNiveauDose() {
		return uniteNiveauDoseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNiveauDebitDoseDosage() {
		return niveauDebitDoseDosage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNiveauDebitDoseDosage(double newNiveauDebitDoseDosage) {
		double oldNiveauDebitDoseDosage = niveauDebitDoseDosage;
		niveauDebitDoseDosage = newNiveauDebitDoseDosage;
		boolean oldNiveauDebitDoseDosageESet = niveauDebitDoseDosageESet;
		niveauDebitDoseDosageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__NIVEAU_DEBIT_DOSE_DOSAGE, oldNiveauDebitDoseDosage, niveauDebitDoseDosage, !oldNiveauDebitDoseDosageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNiveauDebitDoseDosage() {
		double oldNiveauDebitDoseDosage = niveauDebitDoseDosage;
		boolean oldNiveauDebitDoseDosageESet = niveauDebitDoseDosageESet;
		niveauDebitDoseDosage = NIVEAU_DEBIT_DOSE_DOSAGE_EDEFAULT;
		niveauDebitDoseDosageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__NIVEAU_DEBIT_DOSE_DOSAGE, oldNiveauDebitDoseDosage, NIVEAU_DEBIT_DOSE_DOSAGE_EDEFAULT, oldNiveauDebitDoseDosageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNiveauDebitDoseDosage() {
		return niveauDebitDoseDosageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoUniteDebitDoseDosage getUniteDebitDoseDosage() {
		return uniteDebitDoseDosage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniteDebitDoseDosage(TypeDictionaryDicoUniteDebitDoseDosage newUniteDebitDoseDosage) {
		TypeDictionaryDicoUniteDebitDoseDosage oldUniteDebitDoseDosage = uniteDebitDoseDosage;
		uniteDebitDoseDosage = newUniteDebitDoseDosage == null ? UNITE_DEBIT_DOSE_DOSAGE_EDEFAULT : newUniteDebitDoseDosage;
		boolean oldUniteDebitDoseDosageESet = uniteDebitDoseDosageESet;
		uniteDebitDoseDosageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__UNITE_DEBIT_DOSE_DOSAGE, oldUniteDebitDoseDosage, uniteDebitDoseDosage, !oldUniteDebitDoseDosageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUniteDebitDoseDosage() {
		TypeDictionaryDicoUniteDebitDoseDosage oldUniteDebitDoseDosage = uniteDebitDoseDosage;
		boolean oldUniteDebitDoseDosageESet = uniteDebitDoseDosageESet;
		uniteDebitDoseDosage = UNITE_DEBIT_DOSE_DOSAGE_EDEFAULT;
		uniteDebitDoseDosageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__UNITE_DEBIT_DOSE_DOSAGE, oldUniteDebitDoseDosage, UNITE_DEBIT_DOSE_DOSAGE_EDEFAULT, oldUniteDebitDoseDosageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUniteDebitDoseDosage() {
		return uniteDebitDoseDosageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEXT> getAgentsContaminantsTypeConsommable() {
		if (agentsContaminantsTypeConsommable == null) {
			agentsContaminantsTypeConsommable = new EObjectContainmentEList<TypeAssociationEXT>(TypeAssociationEXT.class, this, SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__AGENTS_CONTAMINANTS_TYPE_CONSOMMABLE);
		}
		return agentsContaminantsTypeConsommable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__AGENTS_CONTAMINANTS_TYPE_CONSOMMABLE:
				return ((InternalEList<?>)getAgentsContaminantsTypeConsommable()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__EFFETS_RECHERCHES:
				return getEffetsRecherches();
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__DEBUT_PERSISTANCE:
				return getDebutPersistance();
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__FIN_PERSISTANCE:
				return getFinPersistance();
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__NIVEAU_CONTAMINATION:
				return new Double(getNiveauContamination());
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__UNITE_NIVEAU_CONTAMINATION:
				return getUniteNiveauContamination();
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__FIABILITE_CONTAMINATION:
				return new Double(getFiabiliteContamination());
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__NIVEAU_DANGER:
				return getNiveauDanger();
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__POURCENTAGE_NIVEAU_DANGER:
				return new Double(getPourcentageNiveauDanger());
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__NIVEAU_DOSE:
				return new Double(getNiveauDose());
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__UNITE_NIVEAU_DOSE:
				return getUniteNiveauDose();
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__NIVEAU_DEBIT_DOSE_DOSAGE:
				return new Double(getNiveauDebitDoseDosage());
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__UNITE_DEBIT_DOSE_DOSAGE:
				return getUniteDebitDoseDosage();
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__AGENTS_CONTAMINANTS_TYPE_CONSOMMABLE:
				return getAgentsContaminantsTypeConsommable();
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
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__EFFETS_RECHERCHES:
				setEffetsRecherches((String)newValue);
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__DEBUT_PERSISTANCE:
				setDebutPersistance((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__FIN_PERSISTANCE:
				setFinPersistance((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__NIVEAU_CONTAMINATION:
				setNiveauContamination(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__UNITE_NIVEAU_CONTAMINATION:
				setUniteNiveauContamination((TypeDictionaryDicoUniteNiveauContamination)newValue);
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__FIABILITE_CONTAMINATION:
				setFiabiliteContamination(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__NIVEAU_DANGER:
				setNiveauDanger((TypeDictionaryDicoZoneContamineeNiveauDanger)newValue);
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__POURCENTAGE_NIVEAU_DANGER:
				setPourcentageNiveauDanger(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__NIVEAU_DOSE:
				setNiveauDose(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__UNITE_NIVEAU_DOSE:
				setUniteNiveauDose((TypeDictionaryDicoUniteNiveauDose)newValue);
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__NIVEAU_DEBIT_DOSE_DOSAGE:
				setNiveauDebitDoseDosage(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__UNITE_DEBIT_DOSE_DOSAGE:
				setUniteDebitDoseDosage((TypeDictionaryDicoUniteDebitDoseDosage)newValue);
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__AGENTS_CONTAMINANTS_TYPE_CONSOMMABLE:
				getAgentsContaminantsTypeConsommable().clear();
				getAgentsContaminantsTypeConsommable().addAll((Collection<? extends TypeAssociationEXT>)newValue);
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
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__EFFETS_RECHERCHES:
				setEffetsRecherches(EFFETS_RECHERCHES_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__DEBUT_PERSISTANCE:
				setDebutPersistance(DEBUT_PERSISTANCE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__FIN_PERSISTANCE:
				setFinPersistance(FIN_PERSISTANCE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__NIVEAU_CONTAMINATION:
				unsetNiveauContamination();
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__UNITE_NIVEAU_CONTAMINATION:
				unsetUniteNiveauContamination();
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__FIABILITE_CONTAMINATION:
				unsetFiabiliteContamination();
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__NIVEAU_DANGER:
				unsetNiveauDanger();
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__POURCENTAGE_NIVEAU_DANGER:
				unsetPourcentageNiveauDanger();
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__NIVEAU_DOSE:
				unsetNiveauDose();
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__UNITE_NIVEAU_DOSE:
				unsetUniteNiveauDose();
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__NIVEAU_DEBIT_DOSE_DOSAGE:
				unsetNiveauDebitDoseDosage();
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__UNITE_DEBIT_DOSE_DOSAGE:
				unsetUniteDebitDoseDosage();
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__AGENTS_CONTAMINANTS_TYPE_CONSOMMABLE:
				getAgentsContaminantsTypeConsommable().clear();
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
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__EFFETS_RECHERCHES:
				return EFFETS_RECHERCHES_EDEFAULT == null ? effetsRecherches != null : !EFFETS_RECHERCHES_EDEFAULT.equals(effetsRecherches);
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__DEBUT_PERSISTANCE:
				return DEBUT_PERSISTANCE_EDEFAULT == null ? debutPersistance != null : !DEBUT_PERSISTANCE_EDEFAULT.equals(debutPersistance);
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__FIN_PERSISTANCE:
				return FIN_PERSISTANCE_EDEFAULT == null ? finPersistance != null : !FIN_PERSISTANCE_EDEFAULT.equals(finPersistance);
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__NIVEAU_CONTAMINATION:
				return isSetNiveauContamination();
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__UNITE_NIVEAU_CONTAMINATION:
				return isSetUniteNiveauContamination();
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__FIABILITE_CONTAMINATION:
				return isSetFiabiliteContamination();
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__NIVEAU_DANGER:
				return isSetNiveauDanger();
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__POURCENTAGE_NIVEAU_DANGER:
				return isSetPourcentageNiveauDanger();
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__NIVEAU_DOSE:
				return isSetNiveauDose();
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__UNITE_NIVEAU_DOSE:
				return isSetUniteNiveauDose();
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__NIVEAU_DEBIT_DOSE_DOSAGE:
				return isSetNiveauDebitDoseDosage();
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__UNITE_DEBIT_DOSE_DOSAGE:
				return isSetUniteDebitDoseDosage();
			case SchemaPackage.TYPE_CARACTERISTIQUE_ZONE_CONTAMINEE__AGENTS_CONTAMINANTS_TYPE_CONSOMMABLE:
				return agentsContaminantsTypeConsommable != null && !agentsContaminantsTypeConsommable.isEmpty();
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
		result.append(" (effetsRecherches: ");
		result.append(effetsRecherches);
		result.append(", debutPersistance: ");
		result.append(debutPersistance);
		result.append(", finPersistance: ");
		result.append(finPersistance);
		result.append(", niveauContamination: ");
		if (niveauContaminationESet) result.append(niveauContamination); else result.append("<unset>");
		result.append(", uniteNiveauContamination: ");
		if (uniteNiveauContaminationESet) result.append(uniteNiveauContamination); else result.append("<unset>");
		result.append(", fiabiliteContamination: ");
		if (fiabiliteContaminationESet) result.append(fiabiliteContamination); else result.append("<unset>");
		result.append(", niveauDanger: ");
		if (niveauDangerESet) result.append(niveauDanger); else result.append("<unset>");
		result.append(", pourcentageNiveauDanger: ");
		if (pourcentageNiveauDangerESet) result.append(pourcentageNiveauDanger); else result.append("<unset>");
		result.append(", niveauDose: ");
		if (niveauDoseESet) result.append(niveauDose); else result.append("<unset>");
		result.append(", uniteNiveauDose: ");
		if (uniteNiveauDoseESet) result.append(uniteNiveauDose); else result.append("<unset>");
		result.append(", niveauDebitDoseDosage: ");
		if (niveauDebitDoseDosageESet) result.append(niveauDebitDoseDosage); else result.append("<unset>");
		result.append(", uniteDebitDoseDosage: ");
		if (uniteDebitDoseDosageESet) result.append(uniteDebitDoseDosage); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeCaracteristiqueZoneContamineeImpl
