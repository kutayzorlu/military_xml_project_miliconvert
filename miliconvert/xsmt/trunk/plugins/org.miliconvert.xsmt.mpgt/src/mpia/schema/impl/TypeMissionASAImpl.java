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

import mpia.schema.SchemaPackage;
import mpia.schema.TypeConsignesGeneralesTirASA;
import mpia.schema.TypeDictionaryDicoMissionASATypeMissionASA;
import mpia.schema.TypeMenacePrioritaire;
import mpia.schema.TypeMissionASA;
import mpia.schema.TypeMissionDefenseParticuliere;
import mpia.schema.TypeMissionSurveillance;
import mpia.schema.TypeMissionZoneADefendre;
import mpia.schema.TypeStadeAlerteEmission;
import mpia.schema.TypeZonesImplantationProposees;

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
 * An implementation of the model object '<em><b>Type Mission ASA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMissionASAImpl#getNumeroMissionASA <em>Numero Mission ASA</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionASAImpl#getTypeMissionASA <em>Type Mission ASA</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionASAImpl#getDescriptionMissionGenerale <em>Description Mission Generale</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionASAImpl#getNombreBatteries <em>Nombre Batteries</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionASAImpl#getGDHdebutNouvelleMission <em>GD Hdebut Nouvelle Mission</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionASAImpl#getGDHfinMissionEnCours <em>GD Hfin Mission En Cours</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionASAImpl#getConsignesParticulieres <em>Consignes Particulieres</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionASAImpl#getEstObjetAssociationPlanificationOperation3DMissionASA <em>Est Objet Association Planification Operation3 DMission ASA</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionASAImpl#getAPourMissionSurveillanceMissionSurveillance <em>APour Mission Surveillance Mission Surveillance</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionASAImpl#getAPourMissionDefenseParticuliereMissionDefenseParticuliere <em>APour Mission Defense Particuliere Mission Defense Particuliere</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionASAImpl#getACommeZonesInterditesAutreElementControle <em>AComme Zones Interdites Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionASAImpl#getAPourConsignesGeneralesTirASAConsignesGeneralesTirASA <em>APour Consignes Generales Tir ASA Consignes Generales Tir ASA</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionASAImpl#getAPourMenacePrioritaireMenacePrioritaire <em>APour Menace Prioritaire Menace Prioritaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionASAImpl#getAPourStadeAlerteEtEmissionStadeAlerteEmission <em>APour Stade Alerte Et Emission Stade Alerte Emission</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionASAImpl#getACommeTypeSystemeArmeTypeArme <em>AComme Type Systeme Arme Type Arme</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionASAImpl#getAPourMissionZoneADefendreMissionZoneADefendre <em>APour Mission Zone ADefendre Mission Zone ADefendre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionASAImpl#getACommeImplantationSectionsZonesImplantationProposees <em>AComme Implantation Sections Zones Implantation Proposees</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionASAImpl#getAPourUniteConcerneeUnite <em>APour Unite Concernee Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionASAImpl#getAPourUniteExecutanteUnite <em>APour Unite Executante Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionASAImpl#getEstObjetAssociationUniteMissionASA <em>Est Objet Association Unite Mission ASA</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMissionASAImpl extends TypeMissionImpl implements TypeMissionASA {
	/**
	 * The default value of the '{@link #getNumeroMissionASA() <em>Numero Mission ASA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroMissionASA()
	 * @generated
	 * @ordered
	 */
	protected static final long NUMERO_MISSION_ASA_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNumeroMissionASA() <em>Numero Mission ASA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroMissionASA()
	 * @generated
	 * @ordered
	 */
	protected long numeroMissionASA = NUMERO_MISSION_ASA_EDEFAULT;

	/**
	 * This is true if the Numero Mission ASA attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numeroMissionASAESet;

	/**
	 * The default value of the '{@link #getTypeMissionASA() <em>Type Mission ASA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMissionASA()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMissionASATypeMissionASA TYPE_MISSION_ASA_EDEFAULT = TypeDictionaryDicoMissionASATypeMissionASA.ATDFMI;

	/**
	 * The cached value of the '{@link #getTypeMissionASA() <em>Type Mission ASA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMissionASA()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMissionASATypeMissionASA typeMissionASA = TYPE_MISSION_ASA_EDEFAULT;

	/**
	 * This is true if the Type Mission ASA attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeMissionASAESet;

	/**
	 * The default value of the '{@link #getDescriptionMissionGenerale() <em>Description Mission Generale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionMissionGenerale()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_MISSION_GENERALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescriptionMissionGenerale() <em>Description Mission Generale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionMissionGenerale()
	 * @generated
	 * @ordered
	 */
	protected String descriptionMissionGenerale = DESCRIPTION_MISSION_GENERALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNombreBatteries() <em>Nombre Batteries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreBatteries()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_BATTERIES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreBatteries() <em>Nombre Batteries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreBatteries()
	 * @generated
	 * @ordered
	 */
	protected long nombreBatteries = NOMBRE_BATTERIES_EDEFAULT;

	/**
	 * This is true if the Nombre Batteries attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreBatteriesESet;

	/**
	 * The default value of the '{@link #getGDHdebutNouvelleMission() <em>GD Hdebut Nouvelle Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHdebutNouvelleMission()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GD_HDEBUT_NOUVELLE_MISSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGDHdebutNouvelleMission() <em>GD Hdebut Nouvelle Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHdebutNouvelleMission()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gDHdebutNouvelleMission = GD_HDEBUT_NOUVELLE_MISSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getGDHfinMissionEnCours() <em>GD Hfin Mission En Cours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHfinMissionEnCours()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GD_HFIN_MISSION_EN_COURS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGDHfinMissionEnCours() <em>GD Hfin Mission En Cours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHfinMissionEnCours()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gDHfinMissionEnCours = GD_HFIN_MISSION_EN_COURS_EDEFAULT;

	/**
	 * The default value of the '{@link #getConsignesParticulieres() <em>Consignes Particulieres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsignesParticulieres()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSIGNES_PARTICULIERES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsignesParticulieres() <em>Consignes Particulieres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsignesParticulieres()
	 * @generated
	 * @ordered
	 */
	protected String consignesParticulieres = CONSIGNES_PARTICULIERES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationPlanificationOperation3DMissionASA() <em>Est Objet Association Planification Operation3 DMission ASA</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationPlanificationOperation3DMissionASA()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationPlanificationOperation3DMissionASA;

	/**
	 * The cached value of the '{@link #getAPourMissionSurveillanceMissionSurveillance() <em>APour Mission Surveillance Mission Surveillance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourMissionSurveillanceMissionSurveillance()
	 * @generated
	 * @ordered
	 */
	protected TypeMissionSurveillance aPourMissionSurveillanceMissionSurveillance;

	/**
	 * The cached value of the '{@link #getAPourMissionDefenseParticuliereMissionDefenseParticuliere() <em>APour Mission Defense Particuliere Mission Defense Particuliere</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourMissionDefenseParticuliereMissionDefenseParticuliere()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeMissionDefenseParticuliere> aPourMissionDefenseParticuliereMissionDefenseParticuliere;

	/**
	 * The cached value of the '{@link #getACommeZonesInterditesAutreElementControle() <em>AComme Zones Interdites Autre Element Controle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeZonesInterditesAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aCommeZonesInterditesAutreElementControle;

	/**
	 * The cached value of the '{@link #getAPourConsignesGeneralesTirASAConsignesGeneralesTirASA() <em>APour Consignes Generales Tir ASA Consignes Generales Tir ASA</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourConsignesGeneralesTirASAConsignesGeneralesTirASA()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeConsignesGeneralesTirASA> aPourConsignesGeneralesTirASAConsignesGeneralesTirASA;

	/**
	 * The cached value of the '{@link #getAPourMenacePrioritaireMenacePrioritaire() <em>APour Menace Prioritaire Menace Prioritaire</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourMenacePrioritaireMenacePrioritaire()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeMenacePrioritaire> aPourMenacePrioritaireMenacePrioritaire;

	/**
	 * The cached value of the '{@link #getAPourStadeAlerteEtEmissionStadeAlerteEmission() <em>APour Stade Alerte Et Emission Stade Alerte Emission</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourStadeAlerteEtEmissionStadeAlerteEmission()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeStadeAlerteEmission> aPourStadeAlerteEtEmissionStadeAlerteEmission;

	/**
	 * The cached value of the '{@link #getACommeTypeSystemeArmeTypeArme() <em>AComme Type Systeme Arme Type Arme</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeTypeSystemeArmeTypeArme()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociationEXT> aCommeTypeSystemeArmeTypeArme;

	/**
	 * The cached value of the '{@link #getAPourMissionZoneADefendreMissionZoneADefendre() <em>APour Mission Zone ADefendre Mission Zone ADefendre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourMissionZoneADefendreMissionZoneADefendre()
	 * @generated
	 * @ordered
	 */
	protected TypeMissionZoneADefendre aPourMissionZoneADefendreMissionZoneADefendre;

	/**
	 * The cached value of the '{@link #getACommeImplantationSectionsZonesImplantationProposees() <em>AComme Implantation Sections Zones Implantation Proposees</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeImplantationSectionsZonesImplantationProposees()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeZonesImplantationProposees> aCommeImplantationSectionsZonesImplantationProposees;

	/**
	 * The cached value of the '{@link #getAPourUniteConcerneeUnite() <em>APour Unite Concernee Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUniteConcerneeUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourUniteConcerneeUnite;

	/**
	 * The cached value of the '{@link #getAPourUniteExecutanteUnite() <em>APour Unite Executante Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUniteExecutanteUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourUniteExecutanteUnite;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationUniteMissionASA() <em>Est Objet Association Unite Mission ASA</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationUniteMissionASA()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationUniteMissionASA;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMissionASAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMissionASA();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNumeroMissionASA() {
		return numeroMissionASA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroMissionASA(long newNumeroMissionASA) {
		long oldNumeroMissionASA = numeroMissionASA;
		numeroMissionASA = newNumeroMissionASA;
		boolean oldNumeroMissionASAESet = numeroMissionASAESet;
		numeroMissionASAESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_ASA__NUMERO_MISSION_ASA, oldNumeroMissionASA, numeroMissionASA, !oldNumeroMissionASAESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumeroMissionASA() {
		long oldNumeroMissionASA = numeroMissionASA;
		boolean oldNumeroMissionASAESet = numeroMissionASAESet;
		numeroMissionASA = NUMERO_MISSION_ASA_EDEFAULT;
		numeroMissionASAESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_ASA__NUMERO_MISSION_ASA, oldNumeroMissionASA, NUMERO_MISSION_ASA_EDEFAULT, oldNumeroMissionASAESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumeroMissionASA() {
		return numeroMissionASAESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMissionASATypeMissionASA getTypeMissionASA() {
		return typeMissionASA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeMissionASA(TypeDictionaryDicoMissionASATypeMissionASA newTypeMissionASA) {
		TypeDictionaryDicoMissionASATypeMissionASA oldTypeMissionASA = typeMissionASA;
		typeMissionASA = newTypeMissionASA == null ? TYPE_MISSION_ASA_EDEFAULT : newTypeMissionASA;
		boolean oldTypeMissionASAESet = typeMissionASAESet;
		typeMissionASAESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_ASA__TYPE_MISSION_ASA, oldTypeMissionASA, typeMissionASA, !oldTypeMissionASAESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeMissionASA() {
		TypeDictionaryDicoMissionASATypeMissionASA oldTypeMissionASA = typeMissionASA;
		boolean oldTypeMissionASAESet = typeMissionASAESet;
		typeMissionASA = TYPE_MISSION_ASA_EDEFAULT;
		typeMissionASAESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_ASA__TYPE_MISSION_ASA, oldTypeMissionASA, TYPE_MISSION_ASA_EDEFAULT, oldTypeMissionASAESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeMissionASA() {
		return typeMissionASAESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescriptionMissionGenerale() {
		return descriptionMissionGenerale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptionMissionGenerale(String newDescriptionMissionGenerale) {
		String oldDescriptionMissionGenerale = descriptionMissionGenerale;
		descriptionMissionGenerale = newDescriptionMissionGenerale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_ASA__DESCRIPTION_MISSION_GENERALE, oldDescriptionMissionGenerale, descriptionMissionGenerale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreBatteries() {
		return nombreBatteries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreBatteries(long newNombreBatteries) {
		long oldNombreBatteries = nombreBatteries;
		nombreBatteries = newNombreBatteries;
		boolean oldNombreBatteriesESet = nombreBatteriesESet;
		nombreBatteriesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_ASA__NOMBRE_BATTERIES, oldNombreBatteries, nombreBatteries, !oldNombreBatteriesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreBatteries() {
		long oldNombreBatteries = nombreBatteries;
		boolean oldNombreBatteriesESet = nombreBatteriesESet;
		nombreBatteries = NOMBRE_BATTERIES_EDEFAULT;
		nombreBatteriesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_ASA__NOMBRE_BATTERIES, oldNombreBatteries, NOMBRE_BATTERIES_EDEFAULT, oldNombreBatteriesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreBatteries() {
		return nombreBatteriesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGDHdebutNouvelleMission() {
		return gDHdebutNouvelleMission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGDHdebutNouvelleMission(XMLGregorianCalendar newGDHdebutNouvelleMission) {
		XMLGregorianCalendar oldGDHdebutNouvelleMission = gDHdebutNouvelleMission;
		gDHdebutNouvelleMission = newGDHdebutNouvelleMission;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_ASA__GD_HDEBUT_NOUVELLE_MISSION, oldGDHdebutNouvelleMission, gDHdebutNouvelleMission));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGDHfinMissionEnCours() {
		return gDHfinMissionEnCours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGDHfinMissionEnCours(XMLGregorianCalendar newGDHfinMissionEnCours) {
		XMLGregorianCalendar oldGDHfinMissionEnCours = gDHfinMissionEnCours;
		gDHfinMissionEnCours = newGDHfinMissionEnCours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_ASA__GD_HFIN_MISSION_EN_COURS, oldGDHfinMissionEnCours, gDHfinMissionEnCours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConsignesParticulieres() {
		return consignesParticulieres;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsignesParticulieres(String newConsignesParticulieres) {
		String oldConsignesParticulieres = consignesParticulieres;
		consignesParticulieres = newConsignesParticulieres;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_ASA__CONSIGNES_PARTICULIERES, oldConsignesParticulieres, consignesParticulieres));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationPlanificationOperation3DMissionASA() {
		if (estObjetAssociationPlanificationOperation3DMissionASA == null) {
			estObjetAssociationPlanificationOperation3DMissionASA = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_ASA__EST_OBJET_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_ASA);
		}
		return estObjetAssociationPlanificationOperation3DMissionASA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeMissionSurveillance getAPourMissionSurveillanceMissionSurveillance() {
		return aPourMissionSurveillanceMissionSurveillance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourMissionSurveillanceMissionSurveillance(TypeMissionSurveillance newAPourMissionSurveillanceMissionSurveillance, NotificationChain msgs) {
		TypeMissionSurveillance oldAPourMissionSurveillanceMissionSurveillance = aPourMissionSurveillanceMissionSurveillance;
		aPourMissionSurveillanceMissionSurveillance = newAPourMissionSurveillanceMissionSurveillance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_ASA__APOUR_MISSION_SURVEILLANCE_MISSION_SURVEILLANCE, oldAPourMissionSurveillanceMissionSurveillance, newAPourMissionSurveillanceMissionSurveillance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourMissionSurveillanceMissionSurveillance(TypeMissionSurveillance newAPourMissionSurveillanceMissionSurveillance) {
		if (newAPourMissionSurveillanceMissionSurveillance != aPourMissionSurveillanceMissionSurveillance) {
			NotificationChain msgs = null;
			if (aPourMissionSurveillanceMissionSurveillance != null)
				msgs = ((InternalEObject)aPourMissionSurveillanceMissionSurveillance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_ASA__APOUR_MISSION_SURVEILLANCE_MISSION_SURVEILLANCE, null, msgs);
			if (newAPourMissionSurveillanceMissionSurveillance != null)
				msgs = ((InternalEObject)newAPourMissionSurveillanceMissionSurveillance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_ASA__APOUR_MISSION_SURVEILLANCE_MISSION_SURVEILLANCE, null, msgs);
			msgs = basicSetAPourMissionSurveillanceMissionSurveillance(newAPourMissionSurveillanceMissionSurveillance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_ASA__APOUR_MISSION_SURVEILLANCE_MISSION_SURVEILLANCE, newAPourMissionSurveillanceMissionSurveillance, newAPourMissionSurveillanceMissionSurveillance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMissionDefenseParticuliere> getAPourMissionDefenseParticuliereMissionDefenseParticuliere() {
		if (aPourMissionDefenseParticuliereMissionDefenseParticuliere == null) {
			aPourMissionDefenseParticuliereMissionDefenseParticuliere = new EObjectContainmentEList<TypeMissionDefenseParticuliere>(TypeMissionDefenseParticuliere.class, this, SchemaPackage.TYPE_MISSION_ASA__APOUR_MISSION_DEFENSE_PARTICULIERE_MISSION_DEFENSE_PARTICULIERE);
		}
		return aPourMissionDefenseParticuliereMissionDefenseParticuliere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getACommeZonesInterditesAutreElementControle() {
		if (aCommeZonesInterditesAutreElementControle == null) {
			aCommeZonesInterditesAutreElementControle = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_ASA__ACOMME_ZONES_INTERDITES_AUTRE_ELEMENT_CONTROLE);
		}
		return aCommeZonesInterditesAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeConsignesGeneralesTirASA> getAPourConsignesGeneralesTirASAConsignesGeneralesTirASA() {
		if (aPourConsignesGeneralesTirASAConsignesGeneralesTirASA == null) {
			aPourConsignesGeneralesTirASAConsignesGeneralesTirASA = new EObjectContainmentEList<TypeConsignesGeneralesTirASA>(TypeConsignesGeneralesTirASA.class, this, SchemaPackage.TYPE_MISSION_ASA__APOUR_CONSIGNES_GENERALES_TIR_ASA_CONSIGNES_GENERALES_TIR_ASA);
		}
		return aPourConsignesGeneralesTirASAConsignesGeneralesTirASA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMenacePrioritaire> getAPourMenacePrioritaireMenacePrioritaire() {
		if (aPourMenacePrioritaireMenacePrioritaire == null) {
			aPourMenacePrioritaireMenacePrioritaire = new EObjectContainmentEList<TypeMenacePrioritaire>(TypeMenacePrioritaire.class, this, SchemaPackage.TYPE_MISSION_ASA__APOUR_MENACE_PRIORITAIRE_MENACE_PRIORITAIRE);
		}
		return aPourMenacePrioritaireMenacePrioritaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeStadeAlerteEmission> getAPourStadeAlerteEtEmissionStadeAlerteEmission() {
		if (aPourStadeAlerteEtEmissionStadeAlerteEmission == null) {
			aPourStadeAlerteEtEmissionStadeAlerteEmission = new EObjectContainmentEList<TypeStadeAlerteEmission>(TypeStadeAlerteEmission.class, this, SchemaPackage.TYPE_MISSION_ASA__APOUR_STADE_ALERTE_ET_EMISSION_STADE_ALERTE_EMISSION);
		}
		return aPourStadeAlerteEtEmissionStadeAlerteEmission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEXT> getACommeTypeSystemeArmeTypeArme() {
		if (aCommeTypeSystemeArmeTypeArme == null) {
			aCommeTypeSystemeArmeTypeArme = new EObjectContainmentEList<TypeAssociationEXT>(TypeAssociationEXT.class, this, SchemaPackage.TYPE_MISSION_ASA__ACOMME_TYPE_SYSTEME_ARME_TYPE_ARME);
		}
		return aCommeTypeSystemeArmeTypeArme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeMissionZoneADefendre getAPourMissionZoneADefendreMissionZoneADefendre() {
		return aPourMissionZoneADefendreMissionZoneADefendre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourMissionZoneADefendreMissionZoneADefendre(TypeMissionZoneADefendre newAPourMissionZoneADefendreMissionZoneADefendre, NotificationChain msgs) {
		TypeMissionZoneADefendre oldAPourMissionZoneADefendreMissionZoneADefendre = aPourMissionZoneADefendreMissionZoneADefendre;
		aPourMissionZoneADefendreMissionZoneADefendre = newAPourMissionZoneADefendreMissionZoneADefendre;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_ASA__APOUR_MISSION_ZONE_ADEFENDRE_MISSION_ZONE_ADEFENDRE, oldAPourMissionZoneADefendreMissionZoneADefendre, newAPourMissionZoneADefendreMissionZoneADefendre);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourMissionZoneADefendreMissionZoneADefendre(TypeMissionZoneADefendre newAPourMissionZoneADefendreMissionZoneADefendre) {
		if (newAPourMissionZoneADefendreMissionZoneADefendre != aPourMissionZoneADefendreMissionZoneADefendre) {
			NotificationChain msgs = null;
			if (aPourMissionZoneADefendreMissionZoneADefendre != null)
				msgs = ((InternalEObject)aPourMissionZoneADefendreMissionZoneADefendre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_ASA__APOUR_MISSION_ZONE_ADEFENDRE_MISSION_ZONE_ADEFENDRE, null, msgs);
			if (newAPourMissionZoneADefendreMissionZoneADefendre != null)
				msgs = ((InternalEObject)newAPourMissionZoneADefendreMissionZoneADefendre).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_ASA__APOUR_MISSION_ZONE_ADEFENDRE_MISSION_ZONE_ADEFENDRE, null, msgs);
			msgs = basicSetAPourMissionZoneADefendreMissionZoneADefendre(newAPourMissionZoneADefendreMissionZoneADefendre, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_ASA__APOUR_MISSION_ZONE_ADEFENDRE_MISSION_ZONE_ADEFENDRE, newAPourMissionZoneADefendreMissionZoneADefendre, newAPourMissionZoneADefendreMissionZoneADefendre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeZonesImplantationProposees> getACommeImplantationSectionsZonesImplantationProposees() {
		if (aCommeImplantationSectionsZonesImplantationProposees == null) {
			aCommeImplantationSectionsZonesImplantationProposees = new EObjectContainmentEList<TypeZonesImplantationProposees>(TypeZonesImplantationProposees.class, this, SchemaPackage.TYPE_MISSION_ASA__ACOMME_IMPLANTATION_SECTIONS_ZONES_IMPLANTATION_PROPOSEES);
		}
		return aCommeImplantationSectionsZonesImplantationProposees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourUniteConcerneeUnite() {
		if (aPourUniteConcerneeUnite == null) {
			aPourUniteConcerneeUnite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_ASA__APOUR_UNITE_CONCERNEE_UNITE);
		}
		return aPourUniteConcerneeUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourUniteExecutanteUnite() {
		if (aPourUniteExecutanteUnite == null) {
			aPourUniteExecutanteUnite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_ASA__APOUR_UNITE_EXECUTANTE_UNITE);
		}
		return aPourUniteExecutanteUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationUniteMissionASA() {
		if (estObjetAssociationUniteMissionASA == null) {
			estObjetAssociationUniteMissionASA = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_ASA__EST_OBJET_ASSOCIATION_UNITE_MISSION_ASA);
		}
		return estObjetAssociationUniteMissionASA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MISSION_ASA__EST_OBJET_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_ASA:
				return ((InternalEList<?>)getEstObjetAssociationPlanificationOperation3DMissionASA()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_ASA__APOUR_MISSION_SURVEILLANCE_MISSION_SURVEILLANCE:
				return basicSetAPourMissionSurveillanceMissionSurveillance(null, msgs);
			case SchemaPackage.TYPE_MISSION_ASA__APOUR_MISSION_DEFENSE_PARTICULIERE_MISSION_DEFENSE_PARTICULIERE:
				return ((InternalEList<?>)getAPourMissionDefenseParticuliereMissionDefenseParticuliere()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_ASA__ACOMME_ZONES_INTERDITES_AUTRE_ELEMENT_CONTROLE:
				return ((InternalEList<?>)getACommeZonesInterditesAutreElementControle()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_ASA__APOUR_CONSIGNES_GENERALES_TIR_ASA_CONSIGNES_GENERALES_TIR_ASA:
				return ((InternalEList<?>)getAPourConsignesGeneralesTirASAConsignesGeneralesTirASA()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_ASA__APOUR_MENACE_PRIORITAIRE_MENACE_PRIORITAIRE:
				return ((InternalEList<?>)getAPourMenacePrioritaireMenacePrioritaire()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_ASA__APOUR_STADE_ALERTE_ET_EMISSION_STADE_ALERTE_EMISSION:
				return ((InternalEList<?>)getAPourStadeAlerteEtEmissionStadeAlerteEmission()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_ASA__ACOMME_TYPE_SYSTEME_ARME_TYPE_ARME:
				return ((InternalEList<?>)getACommeTypeSystemeArmeTypeArme()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_ASA__APOUR_MISSION_ZONE_ADEFENDRE_MISSION_ZONE_ADEFENDRE:
				return basicSetAPourMissionZoneADefendreMissionZoneADefendre(null, msgs);
			case SchemaPackage.TYPE_MISSION_ASA__ACOMME_IMPLANTATION_SECTIONS_ZONES_IMPLANTATION_PROPOSEES:
				return ((InternalEList<?>)getACommeImplantationSectionsZonesImplantationProposees()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_ASA__APOUR_UNITE_CONCERNEE_UNITE:
				return ((InternalEList<?>)getAPourUniteConcerneeUnite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_ASA__APOUR_UNITE_EXECUTANTE_UNITE:
				return ((InternalEList<?>)getAPourUniteExecutanteUnite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_ASA__EST_OBJET_ASSOCIATION_UNITE_MISSION_ASA:
				return ((InternalEList<?>)getEstObjetAssociationUniteMissionASA()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_MISSION_ASA__NUMERO_MISSION_ASA:
				return new Long(getNumeroMissionASA());
			case SchemaPackage.TYPE_MISSION_ASA__TYPE_MISSION_ASA:
				return getTypeMissionASA();
			case SchemaPackage.TYPE_MISSION_ASA__DESCRIPTION_MISSION_GENERALE:
				return getDescriptionMissionGenerale();
			case SchemaPackage.TYPE_MISSION_ASA__NOMBRE_BATTERIES:
				return new Long(getNombreBatteries());
			case SchemaPackage.TYPE_MISSION_ASA__GD_HDEBUT_NOUVELLE_MISSION:
				return getGDHdebutNouvelleMission();
			case SchemaPackage.TYPE_MISSION_ASA__GD_HFIN_MISSION_EN_COURS:
				return getGDHfinMissionEnCours();
			case SchemaPackage.TYPE_MISSION_ASA__CONSIGNES_PARTICULIERES:
				return getConsignesParticulieres();
			case SchemaPackage.TYPE_MISSION_ASA__EST_OBJET_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_ASA:
				return getEstObjetAssociationPlanificationOperation3DMissionASA();
			case SchemaPackage.TYPE_MISSION_ASA__APOUR_MISSION_SURVEILLANCE_MISSION_SURVEILLANCE:
				return getAPourMissionSurveillanceMissionSurveillance();
			case SchemaPackage.TYPE_MISSION_ASA__APOUR_MISSION_DEFENSE_PARTICULIERE_MISSION_DEFENSE_PARTICULIERE:
				return getAPourMissionDefenseParticuliereMissionDefenseParticuliere();
			case SchemaPackage.TYPE_MISSION_ASA__ACOMME_ZONES_INTERDITES_AUTRE_ELEMENT_CONTROLE:
				return getACommeZonesInterditesAutreElementControle();
			case SchemaPackage.TYPE_MISSION_ASA__APOUR_CONSIGNES_GENERALES_TIR_ASA_CONSIGNES_GENERALES_TIR_ASA:
				return getAPourConsignesGeneralesTirASAConsignesGeneralesTirASA();
			case SchemaPackage.TYPE_MISSION_ASA__APOUR_MENACE_PRIORITAIRE_MENACE_PRIORITAIRE:
				return getAPourMenacePrioritaireMenacePrioritaire();
			case SchemaPackage.TYPE_MISSION_ASA__APOUR_STADE_ALERTE_ET_EMISSION_STADE_ALERTE_EMISSION:
				return getAPourStadeAlerteEtEmissionStadeAlerteEmission();
			case SchemaPackage.TYPE_MISSION_ASA__ACOMME_TYPE_SYSTEME_ARME_TYPE_ARME:
				return getACommeTypeSystemeArmeTypeArme();
			case SchemaPackage.TYPE_MISSION_ASA__APOUR_MISSION_ZONE_ADEFENDRE_MISSION_ZONE_ADEFENDRE:
				return getAPourMissionZoneADefendreMissionZoneADefendre();
			case SchemaPackage.TYPE_MISSION_ASA__ACOMME_IMPLANTATION_SECTIONS_ZONES_IMPLANTATION_PROPOSEES:
				return getACommeImplantationSectionsZonesImplantationProposees();
			case SchemaPackage.TYPE_MISSION_ASA__APOUR_UNITE_CONCERNEE_UNITE:
				return getAPourUniteConcerneeUnite();
			case SchemaPackage.TYPE_MISSION_ASA__APOUR_UNITE_EXECUTANTE_UNITE:
				return getAPourUniteExecutanteUnite();
			case SchemaPackage.TYPE_MISSION_ASA__EST_OBJET_ASSOCIATION_UNITE_MISSION_ASA:
				return getEstObjetAssociationUniteMissionASA();
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
			case SchemaPackage.TYPE_MISSION_ASA__NUMERO_MISSION_ASA:
				setNumeroMissionASA(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_MISSION_ASA__TYPE_MISSION_ASA:
				setTypeMissionASA((TypeDictionaryDicoMissionASATypeMissionASA)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ASA__DESCRIPTION_MISSION_GENERALE:
				setDescriptionMissionGenerale((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ASA__NOMBRE_BATTERIES:
				setNombreBatteries(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_MISSION_ASA__GD_HDEBUT_NOUVELLE_MISSION:
				setGDHdebutNouvelleMission((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ASA__GD_HFIN_MISSION_EN_COURS:
				setGDHfinMissionEnCours((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ASA__CONSIGNES_PARTICULIERES:
				setConsignesParticulieres((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ASA__EST_OBJET_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_ASA:
				getEstObjetAssociationPlanificationOperation3DMissionASA().clear();
				getEstObjetAssociationPlanificationOperation3DMissionASA().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ASA__APOUR_MISSION_SURVEILLANCE_MISSION_SURVEILLANCE:
				setAPourMissionSurveillanceMissionSurveillance((TypeMissionSurveillance)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ASA__APOUR_MISSION_DEFENSE_PARTICULIERE_MISSION_DEFENSE_PARTICULIERE:
				getAPourMissionDefenseParticuliereMissionDefenseParticuliere().clear();
				getAPourMissionDefenseParticuliereMissionDefenseParticuliere().addAll((Collection<? extends TypeMissionDefenseParticuliere>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ASA__ACOMME_ZONES_INTERDITES_AUTRE_ELEMENT_CONTROLE:
				getACommeZonesInterditesAutreElementControle().clear();
				getACommeZonesInterditesAutreElementControle().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ASA__APOUR_CONSIGNES_GENERALES_TIR_ASA_CONSIGNES_GENERALES_TIR_ASA:
				getAPourConsignesGeneralesTirASAConsignesGeneralesTirASA().clear();
				getAPourConsignesGeneralesTirASAConsignesGeneralesTirASA().addAll((Collection<? extends TypeConsignesGeneralesTirASA>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ASA__APOUR_MENACE_PRIORITAIRE_MENACE_PRIORITAIRE:
				getAPourMenacePrioritaireMenacePrioritaire().clear();
				getAPourMenacePrioritaireMenacePrioritaire().addAll((Collection<? extends TypeMenacePrioritaire>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ASA__APOUR_STADE_ALERTE_ET_EMISSION_STADE_ALERTE_EMISSION:
				getAPourStadeAlerteEtEmissionStadeAlerteEmission().clear();
				getAPourStadeAlerteEtEmissionStadeAlerteEmission().addAll((Collection<? extends TypeStadeAlerteEmission>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ASA__ACOMME_TYPE_SYSTEME_ARME_TYPE_ARME:
				getACommeTypeSystemeArmeTypeArme().clear();
				getACommeTypeSystemeArmeTypeArme().addAll((Collection<? extends TypeAssociationEXT>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ASA__APOUR_MISSION_ZONE_ADEFENDRE_MISSION_ZONE_ADEFENDRE:
				setAPourMissionZoneADefendreMissionZoneADefendre((TypeMissionZoneADefendre)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ASA__ACOMME_IMPLANTATION_SECTIONS_ZONES_IMPLANTATION_PROPOSEES:
				getACommeImplantationSectionsZonesImplantationProposees().clear();
				getACommeImplantationSectionsZonesImplantationProposees().addAll((Collection<? extends TypeZonesImplantationProposees>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ASA__APOUR_UNITE_CONCERNEE_UNITE:
				getAPourUniteConcerneeUnite().clear();
				getAPourUniteConcerneeUnite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ASA__APOUR_UNITE_EXECUTANTE_UNITE:
				getAPourUniteExecutanteUnite().clear();
				getAPourUniteExecutanteUnite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ASA__EST_OBJET_ASSOCIATION_UNITE_MISSION_ASA:
				getEstObjetAssociationUniteMissionASA().clear();
				getEstObjetAssociationUniteMissionASA().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_MISSION_ASA__NUMERO_MISSION_ASA:
				unsetNumeroMissionASA();
				return;
			case SchemaPackage.TYPE_MISSION_ASA__TYPE_MISSION_ASA:
				unsetTypeMissionASA();
				return;
			case SchemaPackage.TYPE_MISSION_ASA__DESCRIPTION_MISSION_GENERALE:
				setDescriptionMissionGenerale(DESCRIPTION_MISSION_GENERALE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_ASA__NOMBRE_BATTERIES:
				unsetNombreBatteries();
				return;
			case SchemaPackage.TYPE_MISSION_ASA__GD_HDEBUT_NOUVELLE_MISSION:
				setGDHdebutNouvelleMission(GD_HDEBUT_NOUVELLE_MISSION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_ASA__GD_HFIN_MISSION_EN_COURS:
				setGDHfinMissionEnCours(GD_HFIN_MISSION_EN_COURS_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_ASA__CONSIGNES_PARTICULIERES:
				setConsignesParticulieres(CONSIGNES_PARTICULIERES_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_ASA__EST_OBJET_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_ASA:
				getEstObjetAssociationPlanificationOperation3DMissionASA().clear();
				return;
			case SchemaPackage.TYPE_MISSION_ASA__APOUR_MISSION_SURVEILLANCE_MISSION_SURVEILLANCE:
				setAPourMissionSurveillanceMissionSurveillance((TypeMissionSurveillance)null);
				return;
			case SchemaPackage.TYPE_MISSION_ASA__APOUR_MISSION_DEFENSE_PARTICULIERE_MISSION_DEFENSE_PARTICULIERE:
				getAPourMissionDefenseParticuliereMissionDefenseParticuliere().clear();
				return;
			case SchemaPackage.TYPE_MISSION_ASA__ACOMME_ZONES_INTERDITES_AUTRE_ELEMENT_CONTROLE:
				getACommeZonesInterditesAutreElementControle().clear();
				return;
			case SchemaPackage.TYPE_MISSION_ASA__APOUR_CONSIGNES_GENERALES_TIR_ASA_CONSIGNES_GENERALES_TIR_ASA:
				getAPourConsignesGeneralesTirASAConsignesGeneralesTirASA().clear();
				return;
			case SchemaPackage.TYPE_MISSION_ASA__APOUR_MENACE_PRIORITAIRE_MENACE_PRIORITAIRE:
				getAPourMenacePrioritaireMenacePrioritaire().clear();
				return;
			case SchemaPackage.TYPE_MISSION_ASA__APOUR_STADE_ALERTE_ET_EMISSION_STADE_ALERTE_EMISSION:
				getAPourStadeAlerteEtEmissionStadeAlerteEmission().clear();
				return;
			case SchemaPackage.TYPE_MISSION_ASA__ACOMME_TYPE_SYSTEME_ARME_TYPE_ARME:
				getACommeTypeSystemeArmeTypeArme().clear();
				return;
			case SchemaPackage.TYPE_MISSION_ASA__APOUR_MISSION_ZONE_ADEFENDRE_MISSION_ZONE_ADEFENDRE:
				setAPourMissionZoneADefendreMissionZoneADefendre((TypeMissionZoneADefendre)null);
				return;
			case SchemaPackage.TYPE_MISSION_ASA__ACOMME_IMPLANTATION_SECTIONS_ZONES_IMPLANTATION_PROPOSEES:
				getACommeImplantationSectionsZonesImplantationProposees().clear();
				return;
			case SchemaPackage.TYPE_MISSION_ASA__APOUR_UNITE_CONCERNEE_UNITE:
				getAPourUniteConcerneeUnite().clear();
				return;
			case SchemaPackage.TYPE_MISSION_ASA__APOUR_UNITE_EXECUTANTE_UNITE:
				getAPourUniteExecutanteUnite().clear();
				return;
			case SchemaPackage.TYPE_MISSION_ASA__EST_OBJET_ASSOCIATION_UNITE_MISSION_ASA:
				getEstObjetAssociationUniteMissionASA().clear();
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
			case SchemaPackage.TYPE_MISSION_ASA__NUMERO_MISSION_ASA:
				return isSetNumeroMissionASA();
			case SchemaPackage.TYPE_MISSION_ASA__TYPE_MISSION_ASA:
				return isSetTypeMissionASA();
			case SchemaPackage.TYPE_MISSION_ASA__DESCRIPTION_MISSION_GENERALE:
				return DESCRIPTION_MISSION_GENERALE_EDEFAULT == null ? descriptionMissionGenerale != null : !DESCRIPTION_MISSION_GENERALE_EDEFAULT.equals(descriptionMissionGenerale);
			case SchemaPackage.TYPE_MISSION_ASA__NOMBRE_BATTERIES:
				return isSetNombreBatteries();
			case SchemaPackage.TYPE_MISSION_ASA__GD_HDEBUT_NOUVELLE_MISSION:
				return GD_HDEBUT_NOUVELLE_MISSION_EDEFAULT == null ? gDHdebutNouvelleMission != null : !GD_HDEBUT_NOUVELLE_MISSION_EDEFAULT.equals(gDHdebutNouvelleMission);
			case SchemaPackage.TYPE_MISSION_ASA__GD_HFIN_MISSION_EN_COURS:
				return GD_HFIN_MISSION_EN_COURS_EDEFAULT == null ? gDHfinMissionEnCours != null : !GD_HFIN_MISSION_EN_COURS_EDEFAULT.equals(gDHfinMissionEnCours);
			case SchemaPackage.TYPE_MISSION_ASA__CONSIGNES_PARTICULIERES:
				return CONSIGNES_PARTICULIERES_EDEFAULT == null ? consignesParticulieres != null : !CONSIGNES_PARTICULIERES_EDEFAULT.equals(consignesParticulieres);
			case SchemaPackage.TYPE_MISSION_ASA__EST_OBJET_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_ASA:
				return estObjetAssociationPlanificationOperation3DMissionASA != null && !estObjetAssociationPlanificationOperation3DMissionASA.isEmpty();
			case SchemaPackage.TYPE_MISSION_ASA__APOUR_MISSION_SURVEILLANCE_MISSION_SURVEILLANCE:
				return aPourMissionSurveillanceMissionSurveillance != null;
			case SchemaPackage.TYPE_MISSION_ASA__APOUR_MISSION_DEFENSE_PARTICULIERE_MISSION_DEFENSE_PARTICULIERE:
				return aPourMissionDefenseParticuliereMissionDefenseParticuliere != null && !aPourMissionDefenseParticuliereMissionDefenseParticuliere.isEmpty();
			case SchemaPackage.TYPE_MISSION_ASA__ACOMME_ZONES_INTERDITES_AUTRE_ELEMENT_CONTROLE:
				return aCommeZonesInterditesAutreElementControle != null && !aCommeZonesInterditesAutreElementControle.isEmpty();
			case SchemaPackage.TYPE_MISSION_ASA__APOUR_CONSIGNES_GENERALES_TIR_ASA_CONSIGNES_GENERALES_TIR_ASA:
				return aPourConsignesGeneralesTirASAConsignesGeneralesTirASA != null && !aPourConsignesGeneralesTirASAConsignesGeneralesTirASA.isEmpty();
			case SchemaPackage.TYPE_MISSION_ASA__APOUR_MENACE_PRIORITAIRE_MENACE_PRIORITAIRE:
				return aPourMenacePrioritaireMenacePrioritaire != null && !aPourMenacePrioritaireMenacePrioritaire.isEmpty();
			case SchemaPackage.TYPE_MISSION_ASA__APOUR_STADE_ALERTE_ET_EMISSION_STADE_ALERTE_EMISSION:
				return aPourStadeAlerteEtEmissionStadeAlerteEmission != null && !aPourStadeAlerteEtEmissionStadeAlerteEmission.isEmpty();
			case SchemaPackage.TYPE_MISSION_ASA__ACOMME_TYPE_SYSTEME_ARME_TYPE_ARME:
				return aCommeTypeSystemeArmeTypeArme != null && !aCommeTypeSystemeArmeTypeArme.isEmpty();
			case SchemaPackage.TYPE_MISSION_ASA__APOUR_MISSION_ZONE_ADEFENDRE_MISSION_ZONE_ADEFENDRE:
				return aPourMissionZoneADefendreMissionZoneADefendre != null;
			case SchemaPackage.TYPE_MISSION_ASA__ACOMME_IMPLANTATION_SECTIONS_ZONES_IMPLANTATION_PROPOSEES:
				return aCommeImplantationSectionsZonesImplantationProposees != null && !aCommeImplantationSectionsZonesImplantationProposees.isEmpty();
			case SchemaPackage.TYPE_MISSION_ASA__APOUR_UNITE_CONCERNEE_UNITE:
				return aPourUniteConcerneeUnite != null && !aPourUniteConcerneeUnite.isEmpty();
			case SchemaPackage.TYPE_MISSION_ASA__APOUR_UNITE_EXECUTANTE_UNITE:
				return aPourUniteExecutanteUnite != null && !aPourUniteExecutanteUnite.isEmpty();
			case SchemaPackage.TYPE_MISSION_ASA__EST_OBJET_ASSOCIATION_UNITE_MISSION_ASA:
				return estObjetAssociationUniteMissionASA != null && !estObjetAssociationUniteMissionASA.isEmpty();
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
		result.append(" (numeroMissionASA: ");
		if (numeroMissionASAESet) result.append(numeroMissionASA); else result.append("<unset>");
		result.append(", typeMissionASA: ");
		if (typeMissionASAESet) result.append(typeMissionASA); else result.append("<unset>");
		result.append(", descriptionMissionGenerale: ");
		result.append(descriptionMissionGenerale);
		result.append(", nombreBatteries: ");
		if (nombreBatteriesESet) result.append(nombreBatteries); else result.append("<unset>");
		result.append(", gDHdebutNouvelleMission: ");
		result.append(gDHdebutNouvelleMission);
		result.append(", gDHfinMissionEnCours: ");
		result.append(gDHfinMissionEnCours);
		result.append(", consignesParticulieres: ");
		result.append(consignesParticulieres);
		result.append(')');
		return result.toString();
	}

} //TypeMissionASAImpl
