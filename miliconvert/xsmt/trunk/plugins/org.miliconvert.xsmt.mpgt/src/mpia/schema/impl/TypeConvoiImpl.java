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
import mpia.meta.TypeDataTypeDuree;
import mpia.meta.TypeDataTypeLongueur;
import mpia.meta.TypeDataTypeVitesseLineaire;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeConvoi;

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
 * An implementation of the model object '<em><b>Type Convoi</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeConvoiImpl#getDatePrevueDepart <em>Date Prevue Depart</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConvoiImpl#getDatePrevueArrivee <em>Date Prevue Arrivee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConvoiImpl#getDescriptionMissionConvoi <em>Description Mission Convoi</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConvoiImpl#getDateDescription <em>Date Description</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConvoiImpl#getNombreVehicules <em>Nombre Vehicules</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConvoiImpl#getNombrePersonnes <em>Nombre Personnes</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConvoiImpl#getDistanceEntreRames <em>Distance Entre Rames</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConvoiImpl#getNombreVehiculesParRame <em>Nombre Vehicules Par Rame</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConvoiImpl#getDistanceEntreVehiculesJour <em>Distance Entre Vehicules Jour</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConvoiImpl#getDistanceEntreVehiculesNuit <em>Distance Entre Vehicules Nuit</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConvoiImpl#getVitesseJour <em>Vitesse Jour</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConvoiImpl#getVitesseNuit <em>Vitesse Nuit</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConvoiImpl#getDureeStationnement <em>Duree Stationnement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConvoiImpl#getEstSujetAssociationConvoiMouvementParRoute <em>Est Sujet Association Convoi Mouvement Par Route</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeConvoiImpl extends TypeEntiteOrganisationnelleImpl implements TypeConvoi {
	/**
	 * The default value of the '{@link #getDatePrevueDepart() <em>Date Prevue Depart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatePrevueDepart()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_PREVUE_DEPART_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatePrevueDepart() <em>Date Prevue Depart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatePrevueDepart()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar datePrevueDepart = DATE_PREVUE_DEPART_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatePrevueArrivee() <em>Date Prevue Arrivee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatePrevueArrivee()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_PREVUE_ARRIVEE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatePrevueArrivee() <em>Date Prevue Arrivee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatePrevueArrivee()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar datePrevueArrivee = DATE_PREVUE_ARRIVEE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescriptionMissionConvoi() <em>Description Mission Convoi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionMissionConvoi()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_MISSION_CONVOI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescriptionMissionConvoi() <em>Description Mission Convoi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionMissionConvoi()
	 * @generated
	 * @ordered
	 */
	protected String descriptionMissionConvoi = DESCRIPTION_MISSION_CONVOI_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateDescription() <em>Date Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDescription()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateDescription() <em>Date Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDescription()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateDescription = DATE_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNombreVehicules() <em>Nombre Vehicules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreVehicules()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_VEHICULES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreVehicules() <em>Nombre Vehicules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreVehicules()
	 * @generated
	 * @ordered
	 */
	protected long nombreVehicules = NOMBRE_VEHICULES_EDEFAULT;

	/**
	 * This is true if the Nombre Vehicules attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreVehiculesESet;

	/**
	 * The default value of the '{@link #getNombrePersonnes() <em>Nombre Personnes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombrePersonnes()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_PERSONNES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombrePersonnes() <em>Nombre Personnes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombrePersonnes()
	 * @generated
	 * @ordered
	 */
	protected long nombrePersonnes = NOMBRE_PERSONNES_EDEFAULT;

	/**
	 * This is true if the Nombre Personnes attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombrePersonnesESet;

	/**
	 * The cached value of the '{@link #getDistanceEntreRames() <em>Distance Entre Rames</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceEntreRames()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur distanceEntreRames;

	/**
	 * The default value of the '{@link #getNombreVehiculesParRame() <em>Nombre Vehicules Par Rame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreVehiculesParRame()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_VEHICULES_PAR_RAME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreVehiculesParRame() <em>Nombre Vehicules Par Rame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreVehiculesParRame()
	 * @generated
	 * @ordered
	 */
	protected long nombreVehiculesParRame = NOMBRE_VEHICULES_PAR_RAME_EDEFAULT;

	/**
	 * This is true if the Nombre Vehicules Par Rame attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreVehiculesParRameESet;

	/**
	 * The cached value of the '{@link #getDistanceEntreVehiculesJour() <em>Distance Entre Vehicules Jour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceEntreVehiculesJour()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur distanceEntreVehiculesJour;

	/**
	 * The cached value of the '{@link #getDistanceEntreVehiculesNuit() <em>Distance Entre Vehicules Nuit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceEntreVehiculesNuit()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur distanceEntreVehiculesNuit;

	/**
	 * The cached value of the '{@link #getVitesseJour() <em>Vitesse Jour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesseJour()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeVitesseLineaire vitesseJour;

	/**
	 * The cached value of the '{@link #getVitesseNuit() <em>Vitesse Nuit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesseNuit()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeVitesseLineaire vitesseNuit;

	/**
	 * The cached value of the '{@link #getDureeStationnement() <em>Duree Stationnement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDureeStationnement()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree dureeStationnement;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationConvoiMouvementParRoute() <em>Est Sujet Association Convoi Mouvement Par Route</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationConvoiMouvementParRoute()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationConvoiMouvementParRoute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeConvoiImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeConvoi();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDatePrevueDepart() {
		return datePrevueDepart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatePrevueDepart(XMLGregorianCalendar newDatePrevueDepart) {
		XMLGregorianCalendar oldDatePrevueDepart = datePrevueDepart;
		datePrevueDepart = newDatePrevueDepart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONVOI__DATE_PREVUE_DEPART, oldDatePrevueDepart, datePrevueDepart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDatePrevueArrivee() {
		return datePrevueArrivee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatePrevueArrivee(XMLGregorianCalendar newDatePrevueArrivee) {
		XMLGregorianCalendar oldDatePrevueArrivee = datePrevueArrivee;
		datePrevueArrivee = newDatePrevueArrivee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONVOI__DATE_PREVUE_ARRIVEE, oldDatePrevueArrivee, datePrevueArrivee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescriptionMissionConvoi() {
		return descriptionMissionConvoi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptionMissionConvoi(String newDescriptionMissionConvoi) {
		String oldDescriptionMissionConvoi = descriptionMissionConvoi;
		descriptionMissionConvoi = newDescriptionMissionConvoi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONVOI__DESCRIPTION_MISSION_CONVOI, oldDescriptionMissionConvoi, descriptionMissionConvoi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateDescription() {
		return dateDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDescription(XMLGregorianCalendar newDateDescription) {
		XMLGregorianCalendar oldDateDescription = dateDescription;
		dateDescription = newDateDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONVOI__DATE_DESCRIPTION, oldDateDescription, dateDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreVehicules() {
		return nombreVehicules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreVehicules(long newNombreVehicules) {
		long oldNombreVehicules = nombreVehicules;
		nombreVehicules = newNombreVehicules;
		boolean oldNombreVehiculesESet = nombreVehiculesESet;
		nombreVehiculesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONVOI__NOMBRE_VEHICULES, oldNombreVehicules, nombreVehicules, !oldNombreVehiculesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreVehicules() {
		long oldNombreVehicules = nombreVehicules;
		boolean oldNombreVehiculesESet = nombreVehiculesESet;
		nombreVehicules = NOMBRE_VEHICULES_EDEFAULT;
		nombreVehiculesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CONVOI__NOMBRE_VEHICULES, oldNombreVehicules, NOMBRE_VEHICULES_EDEFAULT, oldNombreVehiculesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreVehicules() {
		return nombreVehiculesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombrePersonnes() {
		return nombrePersonnes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombrePersonnes(long newNombrePersonnes) {
		long oldNombrePersonnes = nombrePersonnes;
		nombrePersonnes = newNombrePersonnes;
		boolean oldNombrePersonnesESet = nombrePersonnesESet;
		nombrePersonnesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONVOI__NOMBRE_PERSONNES, oldNombrePersonnes, nombrePersonnes, !oldNombrePersonnesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombrePersonnes() {
		long oldNombrePersonnes = nombrePersonnes;
		boolean oldNombrePersonnesESet = nombrePersonnesESet;
		nombrePersonnes = NOMBRE_PERSONNES_EDEFAULT;
		nombrePersonnesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CONVOI__NOMBRE_PERSONNES, oldNombrePersonnes, NOMBRE_PERSONNES_EDEFAULT, oldNombrePersonnesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombrePersonnes() {
		return nombrePersonnesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getDistanceEntreRames() {
		return distanceEntreRames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistanceEntreRames(TypeDataTypeLongueur newDistanceEntreRames, NotificationChain msgs) {
		TypeDataTypeLongueur oldDistanceEntreRames = distanceEntreRames;
		distanceEntreRames = newDistanceEntreRames;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONVOI__DISTANCE_ENTRE_RAMES, oldDistanceEntreRames, newDistanceEntreRames);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistanceEntreRames(TypeDataTypeLongueur newDistanceEntreRames) {
		if (newDistanceEntreRames != distanceEntreRames) {
			NotificationChain msgs = null;
			if (distanceEntreRames != null)
				msgs = ((InternalEObject)distanceEntreRames).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONVOI__DISTANCE_ENTRE_RAMES, null, msgs);
			if (newDistanceEntreRames != null)
				msgs = ((InternalEObject)newDistanceEntreRames).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONVOI__DISTANCE_ENTRE_RAMES, null, msgs);
			msgs = basicSetDistanceEntreRames(newDistanceEntreRames, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONVOI__DISTANCE_ENTRE_RAMES, newDistanceEntreRames, newDistanceEntreRames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreVehiculesParRame() {
		return nombreVehiculesParRame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreVehiculesParRame(long newNombreVehiculesParRame) {
		long oldNombreVehiculesParRame = nombreVehiculesParRame;
		nombreVehiculesParRame = newNombreVehiculesParRame;
		boolean oldNombreVehiculesParRameESet = nombreVehiculesParRameESet;
		nombreVehiculesParRameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONVOI__NOMBRE_VEHICULES_PAR_RAME, oldNombreVehiculesParRame, nombreVehiculesParRame, !oldNombreVehiculesParRameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreVehiculesParRame() {
		long oldNombreVehiculesParRame = nombreVehiculesParRame;
		boolean oldNombreVehiculesParRameESet = nombreVehiculesParRameESet;
		nombreVehiculesParRame = NOMBRE_VEHICULES_PAR_RAME_EDEFAULT;
		nombreVehiculesParRameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CONVOI__NOMBRE_VEHICULES_PAR_RAME, oldNombreVehiculesParRame, NOMBRE_VEHICULES_PAR_RAME_EDEFAULT, oldNombreVehiculesParRameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreVehiculesParRame() {
		return nombreVehiculesParRameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getDistanceEntreVehiculesJour() {
		return distanceEntreVehiculesJour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistanceEntreVehiculesJour(TypeDataTypeLongueur newDistanceEntreVehiculesJour, NotificationChain msgs) {
		TypeDataTypeLongueur oldDistanceEntreVehiculesJour = distanceEntreVehiculesJour;
		distanceEntreVehiculesJour = newDistanceEntreVehiculesJour;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONVOI__DISTANCE_ENTRE_VEHICULES_JOUR, oldDistanceEntreVehiculesJour, newDistanceEntreVehiculesJour);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistanceEntreVehiculesJour(TypeDataTypeLongueur newDistanceEntreVehiculesJour) {
		if (newDistanceEntreVehiculesJour != distanceEntreVehiculesJour) {
			NotificationChain msgs = null;
			if (distanceEntreVehiculesJour != null)
				msgs = ((InternalEObject)distanceEntreVehiculesJour).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONVOI__DISTANCE_ENTRE_VEHICULES_JOUR, null, msgs);
			if (newDistanceEntreVehiculesJour != null)
				msgs = ((InternalEObject)newDistanceEntreVehiculesJour).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONVOI__DISTANCE_ENTRE_VEHICULES_JOUR, null, msgs);
			msgs = basicSetDistanceEntreVehiculesJour(newDistanceEntreVehiculesJour, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONVOI__DISTANCE_ENTRE_VEHICULES_JOUR, newDistanceEntreVehiculesJour, newDistanceEntreVehiculesJour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getDistanceEntreVehiculesNuit() {
		return distanceEntreVehiculesNuit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistanceEntreVehiculesNuit(TypeDataTypeLongueur newDistanceEntreVehiculesNuit, NotificationChain msgs) {
		TypeDataTypeLongueur oldDistanceEntreVehiculesNuit = distanceEntreVehiculesNuit;
		distanceEntreVehiculesNuit = newDistanceEntreVehiculesNuit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONVOI__DISTANCE_ENTRE_VEHICULES_NUIT, oldDistanceEntreVehiculesNuit, newDistanceEntreVehiculesNuit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistanceEntreVehiculesNuit(TypeDataTypeLongueur newDistanceEntreVehiculesNuit) {
		if (newDistanceEntreVehiculesNuit != distanceEntreVehiculesNuit) {
			NotificationChain msgs = null;
			if (distanceEntreVehiculesNuit != null)
				msgs = ((InternalEObject)distanceEntreVehiculesNuit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONVOI__DISTANCE_ENTRE_VEHICULES_NUIT, null, msgs);
			if (newDistanceEntreVehiculesNuit != null)
				msgs = ((InternalEObject)newDistanceEntreVehiculesNuit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONVOI__DISTANCE_ENTRE_VEHICULES_NUIT, null, msgs);
			msgs = basicSetDistanceEntreVehiculesNuit(newDistanceEntreVehiculesNuit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONVOI__DISTANCE_ENTRE_VEHICULES_NUIT, newDistanceEntreVehiculesNuit, newDistanceEntreVehiculesNuit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeVitesseLineaire getVitesseJour() {
		return vitesseJour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVitesseJour(TypeDataTypeVitesseLineaire newVitesseJour, NotificationChain msgs) {
		TypeDataTypeVitesseLineaire oldVitesseJour = vitesseJour;
		vitesseJour = newVitesseJour;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONVOI__VITESSE_JOUR, oldVitesseJour, newVitesseJour);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVitesseJour(TypeDataTypeVitesseLineaire newVitesseJour) {
		if (newVitesseJour != vitesseJour) {
			NotificationChain msgs = null;
			if (vitesseJour != null)
				msgs = ((InternalEObject)vitesseJour).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONVOI__VITESSE_JOUR, null, msgs);
			if (newVitesseJour != null)
				msgs = ((InternalEObject)newVitesseJour).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONVOI__VITESSE_JOUR, null, msgs);
			msgs = basicSetVitesseJour(newVitesseJour, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONVOI__VITESSE_JOUR, newVitesseJour, newVitesseJour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeVitesseLineaire getVitesseNuit() {
		return vitesseNuit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVitesseNuit(TypeDataTypeVitesseLineaire newVitesseNuit, NotificationChain msgs) {
		TypeDataTypeVitesseLineaire oldVitesseNuit = vitesseNuit;
		vitesseNuit = newVitesseNuit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONVOI__VITESSE_NUIT, oldVitesseNuit, newVitesseNuit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVitesseNuit(TypeDataTypeVitesseLineaire newVitesseNuit) {
		if (newVitesseNuit != vitesseNuit) {
			NotificationChain msgs = null;
			if (vitesseNuit != null)
				msgs = ((InternalEObject)vitesseNuit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONVOI__VITESSE_NUIT, null, msgs);
			if (newVitesseNuit != null)
				msgs = ((InternalEObject)newVitesseNuit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONVOI__VITESSE_NUIT, null, msgs);
			msgs = basicSetVitesseNuit(newVitesseNuit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONVOI__VITESSE_NUIT, newVitesseNuit, newVitesseNuit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getDureeStationnement() {
		return dureeStationnement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDureeStationnement(TypeDataTypeDuree newDureeStationnement, NotificationChain msgs) {
		TypeDataTypeDuree oldDureeStationnement = dureeStationnement;
		dureeStationnement = newDureeStationnement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONVOI__DUREE_STATIONNEMENT, oldDureeStationnement, newDureeStationnement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDureeStationnement(TypeDataTypeDuree newDureeStationnement) {
		if (newDureeStationnement != dureeStationnement) {
			NotificationChain msgs = null;
			if (dureeStationnement != null)
				msgs = ((InternalEObject)dureeStationnement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONVOI__DUREE_STATIONNEMENT, null, msgs);
			if (newDureeStationnement != null)
				msgs = ((InternalEObject)newDureeStationnement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONVOI__DUREE_STATIONNEMENT, null, msgs);
			msgs = basicSetDureeStationnement(newDureeStationnement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONVOI__DUREE_STATIONNEMENT, newDureeStationnement, newDureeStationnement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationConvoiMouvementParRoute() {
		if (estSujetAssociationConvoiMouvementParRoute == null) {
			estSujetAssociationConvoiMouvementParRoute = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_CONVOI__EST_SUJET_ASSOCIATION_CONVOI_MOUVEMENT_PAR_ROUTE);
		}
		return estSujetAssociationConvoiMouvementParRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_CONVOI__DISTANCE_ENTRE_RAMES:
				return basicSetDistanceEntreRames(null, msgs);
			case SchemaPackage.TYPE_CONVOI__DISTANCE_ENTRE_VEHICULES_JOUR:
				return basicSetDistanceEntreVehiculesJour(null, msgs);
			case SchemaPackage.TYPE_CONVOI__DISTANCE_ENTRE_VEHICULES_NUIT:
				return basicSetDistanceEntreVehiculesNuit(null, msgs);
			case SchemaPackage.TYPE_CONVOI__VITESSE_JOUR:
				return basicSetVitesseJour(null, msgs);
			case SchemaPackage.TYPE_CONVOI__VITESSE_NUIT:
				return basicSetVitesseNuit(null, msgs);
			case SchemaPackage.TYPE_CONVOI__DUREE_STATIONNEMENT:
				return basicSetDureeStationnement(null, msgs);
			case SchemaPackage.TYPE_CONVOI__EST_SUJET_ASSOCIATION_CONVOI_MOUVEMENT_PAR_ROUTE:
				return ((InternalEList<?>)getEstSujetAssociationConvoiMouvementParRoute()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_CONVOI__DATE_PREVUE_DEPART:
				return getDatePrevueDepart();
			case SchemaPackage.TYPE_CONVOI__DATE_PREVUE_ARRIVEE:
				return getDatePrevueArrivee();
			case SchemaPackage.TYPE_CONVOI__DESCRIPTION_MISSION_CONVOI:
				return getDescriptionMissionConvoi();
			case SchemaPackage.TYPE_CONVOI__DATE_DESCRIPTION:
				return getDateDescription();
			case SchemaPackage.TYPE_CONVOI__NOMBRE_VEHICULES:
				return new Long(getNombreVehicules());
			case SchemaPackage.TYPE_CONVOI__NOMBRE_PERSONNES:
				return new Long(getNombrePersonnes());
			case SchemaPackage.TYPE_CONVOI__DISTANCE_ENTRE_RAMES:
				return getDistanceEntreRames();
			case SchemaPackage.TYPE_CONVOI__NOMBRE_VEHICULES_PAR_RAME:
				return new Long(getNombreVehiculesParRame());
			case SchemaPackage.TYPE_CONVOI__DISTANCE_ENTRE_VEHICULES_JOUR:
				return getDistanceEntreVehiculesJour();
			case SchemaPackage.TYPE_CONVOI__DISTANCE_ENTRE_VEHICULES_NUIT:
				return getDistanceEntreVehiculesNuit();
			case SchemaPackage.TYPE_CONVOI__VITESSE_JOUR:
				return getVitesseJour();
			case SchemaPackage.TYPE_CONVOI__VITESSE_NUIT:
				return getVitesseNuit();
			case SchemaPackage.TYPE_CONVOI__DUREE_STATIONNEMENT:
				return getDureeStationnement();
			case SchemaPackage.TYPE_CONVOI__EST_SUJET_ASSOCIATION_CONVOI_MOUVEMENT_PAR_ROUTE:
				return getEstSujetAssociationConvoiMouvementParRoute();
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
			case SchemaPackage.TYPE_CONVOI__DATE_PREVUE_DEPART:
				setDatePrevueDepart((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_CONVOI__DATE_PREVUE_ARRIVEE:
				setDatePrevueArrivee((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_CONVOI__DESCRIPTION_MISSION_CONVOI:
				setDescriptionMissionConvoi((String)newValue);
				return;
			case SchemaPackage.TYPE_CONVOI__DATE_DESCRIPTION:
				setDateDescription((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_CONVOI__NOMBRE_VEHICULES:
				setNombreVehicules(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CONVOI__NOMBRE_PERSONNES:
				setNombrePersonnes(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CONVOI__DISTANCE_ENTRE_RAMES:
				setDistanceEntreRames((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_CONVOI__NOMBRE_VEHICULES_PAR_RAME:
				setNombreVehiculesParRame(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CONVOI__DISTANCE_ENTRE_VEHICULES_JOUR:
				setDistanceEntreVehiculesJour((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_CONVOI__DISTANCE_ENTRE_VEHICULES_NUIT:
				setDistanceEntreVehiculesNuit((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_CONVOI__VITESSE_JOUR:
				setVitesseJour((TypeDataTypeVitesseLineaire)newValue);
				return;
			case SchemaPackage.TYPE_CONVOI__VITESSE_NUIT:
				setVitesseNuit((TypeDataTypeVitesseLineaire)newValue);
				return;
			case SchemaPackage.TYPE_CONVOI__DUREE_STATIONNEMENT:
				setDureeStationnement((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_CONVOI__EST_SUJET_ASSOCIATION_CONVOI_MOUVEMENT_PAR_ROUTE:
				getEstSujetAssociationConvoiMouvementParRoute().clear();
				getEstSujetAssociationConvoiMouvementParRoute().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_CONVOI__DATE_PREVUE_DEPART:
				setDatePrevueDepart(DATE_PREVUE_DEPART_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CONVOI__DATE_PREVUE_ARRIVEE:
				setDatePrevueArrivee(DATE_PREVUE_ARRIVEE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CONVOI__DESCRIPTION_MISSION_CONVOI:
				setDescriptionMissionConvoi(DESCRIPTION_MISSION_CONVOI_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CONVOI__DATE_DESCRIPTION:
				setDateDescription(DATE_DESCRIPTION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CONVOI__NOMBRE_VEHICULES:
				unsetNombreVehicules();
				return;
			case SchemaPackage.TYPE_CONVOI__NOMBRE_PERSONNES:
				unsetNombrePersonnes();
				return;
			case SchemaPackage.TYPE_CONVOI__DISTANCE_ENTRE_RAMES:
				setDistanceEntreRames((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_CONVOI__NOMBRE_VEHICULES_PAR_RAME:
				unsetNombreVehiculesParRame();
				return;
			case SchemaPackage.TYPE_CONVOI__DISTANCE_ENTRE_VEHICULES_JOUR:
				setDistanceEntreVehiculesJour((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_CONVOI__DISTANCE_ENTRE_VEHICULES_NUIT:
				setDistanceEntreVehiculesNuit((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_CONVOI__VITESSE_JOUR:
				setVitesseJour((TypeDataTypeVitesseLineaire)null);
				return;
			case SchemaPackage.TYPE_CONVOI__VITESSE_NUIT:
				setVitesseNuit((TypeDataTypeVitesseLineaire)null);
				return;
			case SchemaPackage.TYPE_CONVOI__DUREE_STATIONNEMENT:
				setDureeStationnement((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_CONVOI__EST_SUJET_ASSOCIATION_CONVOI_MOUVEMENT_PAR_ROUTE:
				getEstSujetAssociationConvoiMouvementParRoute().clear();
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
			case SchemaPackage.TYPE_CONVOI__DATE_PREVUE_DEPART:
				return DATE_PREVUE_DEPART_EDEFAULT == null ? datePrevueDepart != null : !DATE_PREVUE_DEPART_EDEFAULT.equals(datePrevueDepart);
			case SchemaPackage.TYPE_CONVOI__DATE_PREVUE_ARRIVEE:
				return DATE_PREVUE_ARRIVEE_EDEFAULT == null ? datePrevueArrivee != null : !DATE_PREVUE_ARRIVEE_EDEFAULT.equals(datePrevueArrivee);
			case SchemaPackage.TYPE_CONVOI__DESCRIPTION_MISSION_CONVOI:
				return DESCRIPTION_MISSION_CONVOI_EDEFAULT == null ? descriptionMissionConvoi != null : !DESCRIPTION_MISSION_CONVOI_EDEFAULT.equals(descriptionMissionConvoi);
			case SchemaPackage.TYPE_CONVOI__DATE_DESCRIPTION:
				return DATE_DESCRIPTION_EDEFAULT == null ? dateDescription != null : !DATE_DESCRIPTION_EDEFAULT.equals(dateDescription);
			case SchemaPackage.TYPE_CONVOI__NOMBRE_VEHICULES:
				return isSetNombreVehicules();
			case SchemaPackage.TYPE_CONVOI__NOMBRE_PERSONNES:
				return isSetNombrePersonnes();
			case SchemaPackage.TYPE_CONVOI__DISTANCE_ENTRE_RAMES:
				return distanceEntreRames != null;
			case SchemaPackage.TYPE_CONVOI__NOMBRE_VEHICULES_PAR_RAME:
				return isSetNombreVehiculesParRame();
			case SchemaPackage.TYPE_CONVOI__DISTANCE_ENTRE_VEHICULES_JOUR:
				return distanceEntreVehiculesJour != null;
			case SchemaPackage.TYPE_CONVOI__DISTANCE_ENTRE_VEHICULES_NUIT:
				return distanceEntreVehiculesNuit != null;
			case SchemaPackage.TYPE_CONVOI__VITESSE_JOUR:
				return vitesseJour != null;
			case SchemaPackage.TYPE_CONVOI__VITESSE_NUIT:
				return vitesseNuit != null;
			case SchemaPackage.TYPE_CONVOI__DUREE_STATIONNEMENT:
				return dureeStationnement != null;
			case SchemaPackage.TYPE_CONVOI__EST_SUJET_ASSOCIATION_CONVOI_MOUVEMENT_PAR_ROUTE:
				return estSujetAssociationConvoiMouvementParRoute != null && !estSujetAssociationConvoiMouvementParRoute.isEmpty();
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
		result.append(" (datePrevueDepart: ");
		result.append(datePrevueDepart);
		result.append(", datePrevueArrivee: ");
		result.append(datePrevueArrivee);
		result.append(", descriptionMissionConvoi: ");
		result.append(descriptionMissionConvoi);
		result.append(", dateDescription: ");
		result.append(dateDescription);
		result.append(", nombreVehicules: ");
		if (nombreVehiculesESet) result.append(nombreVehicules); else result.append("<unset>");
		result.append(", nombrePersonnes: ");
		if (nombrePersonnesESet) result.append(nombrePersonnes); else result.append("<unset>");
		result.append(", nombreVehiculesParRame: ");
		if (nombreVehiculesParRameESet) result.append(nombreVehiculesParRame); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeConvoiImpl
