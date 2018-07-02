/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoZoneInterventionNatureSol;
import mpia.schema.TypeDictionaryDicoZoneInterventionPraticabilite;
import mpia.schema.TypeDictionaryDicoZoneInterventionType;
import mpia.schema.TypeDictionaryDicoZoneInterventionZoneReconnue;
import mpia.schema.TypeZoneIntervention;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Zone Intervention</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeZoneInterventionImpl#getAptitudeJourNuit <em>Aptitude Jour Nuit</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZoneInterventionImpl#getDateDeReconnaiss <em>Date De Reconnaiss</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZoneInterventionImpl#getAxesApproche <em>Axes Approche</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZoneInterventionImpl#getFrequences <em>Frequences</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZoneInterventionImpl#getNombreMaxiHelico <em>Nombre Maxi Helico</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZoneInterventionImpl#getPraticabilite <em>Praticabilite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZoneInterventionImpl#getType <em>Type</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZoneInterventionImpl#getNatureSol <em>Nature Sol</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZoneInterventionImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZoneInterventionImpl#getTailleMaximum <em>Taille Maximum</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZoneInterventionImpl#getZoneReconnue <em>Zone Reconnue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeZoneInterventionImpl extends EObjectImpl implements TypeZoneIntervention {
	/**
	 * The default value of the '{@link #getAptitudeJourNuit() <em>Aptitude Jour Nuit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAptitudeJourNuit()
	 * @generated
	 * @ordered
	 */
	protected static final String APTITUDE_JOUR_NUIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAptitudeJourNuit() <em>Aptitude Jour Nuit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAptitudeJourNuit()
	 * @generated
	 * @ordered
	 */
	protected String aptitudeJourNuit = APTITUDE_JOUR_NUIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateDeReconnaiss() <em>Date De Reconnaiss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDeReconnaiss()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_DE_RECONNAISS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateDeReconnaiss() <em>Date De Reconnaiss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDeReconnaiss()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateDeReconnaiss = DATE_DE_RECONNAISS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAxesApproche() <em>Axes Approche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxesApproche()
	 * @generated
	 * @ordered
	 */
	protected static final String AXES_APPROCHE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAxesApproche() <em>Axes Approche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxesApproche()
	 * @generated
	 * @ordered
	 */
	protected String axesApproche = AXES_APPROCHE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrequences() <em>Frequences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequences()
	 * @generated
	 * @ordered
	 */
	protected static final String FREQUENCES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrequences() <em>Frequences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequences()
	 * @generated
	 * @ordered
	 */
	protected String frequences = FREQUENCES_EDEFAULT;

	/**
	 * The default value of the '{@link #getNombreMaxiHelico() <em>Nombre Maxi Helico</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreMaxiHelico()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_MAXI_HELICO_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreMaxiHelico() <em>Nombre Maxi Helico</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreMaxiHelico()
	 * @generated
	 * @ordered
	 */
	protected long nombreMaxiHelico = NOMBRE_MAXI_HELICO_EDEFAULT;

	/**
	 * This is true if the Nombre Maxi Helico attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreMaxiHelicoESet;

	/**
	 * The default value of the '{@link #getPraticabilite() <em>Praticabilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPraticabilite()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoZoneInterventionPraticabilite PRATICABILITE_EDEFAULT = TypeDictionaryDicoZoneInterventionPraticabilite.SUMMER;

	/**
	 * The cached value of the '{@link #getPraticabilite() <em>Praticabilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPraticabilite()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoZoneInterventionPraticabilite praticabilite = PRATICABILITE_EDEFAULT;

	/**
	 * This is true if the Praticabilite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean praticabiliteESet;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoZoneInterventionType TYPE_EDEFAULT = TypeDictionaryDicoZoneInterventionType.HPD;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoZoneInterventionType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #getNatureSol() <em>Nature Sol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatureSol()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoZoneInterventionNatureSol NATURE_SOL_EDEFAULT = TypeDictionaryDicoZoneInterventionNatureSol.CONC;

	/**
	 * The cached value of the '{@link #getNatureSol() <em>Nature Sol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatureSol()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoZoneInterventionNatureSol natureSol = NATURE_SOL_EDEFAULT;

	/**
	 * This is true if the Nature Sol attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean natureSolESet;

	/**
	 * The default value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final double ORIENTATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected double orientation = ORIENTATION_EDEFAULT;

	/**
	 * This is true if the Orientation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean orientationESet;

	/**
	 * The default value of the '{@link #getTailleMaximum() <em>Taille Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTailleMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final double TAILLE_MAXIMUM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTailleMaximum() <em>Taille Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTailleMaximum()
	 * @generated
	 * @ordered
	 */
	protected double tailleMaximum = TAILLE_MAXIMUM_EDEFAULT;

	/**
	 * This is true if the Taille Maximum attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tailleMaximumESet;

	/**
	 * The default value of the '{@link #getZoneReconnue() <em>Zone Reconnue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZoneReconnue()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoZoneInterventionZoneReconnue ZONE_RECONNUE_EDEFAULT = TypeDictionaryDicoZoneInterventionZoneReconnue.YES;

	/**
	 * The cached value of the '{@link #getZoneReconnue() <em>Zone Reconnue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZoneReconnue()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoZoneInterventionZoneReconnue zoneReconnue = ZONE_RECONNUE_EDEFAULT;

	/**
	 * This is true if the Zone Reconnue attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean zoneReconnueESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeZoneInterventionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeZoneIntervention();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAptitudeJourNuit() {
		return aptitudeJourNuit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAptitudeJourNuit(String newAptitudeJourNuit) {
		String oldAptitudeJourNuit = aptitudeJourNuit;
		aptitudeJourNuit = newAptitudeJourNuit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_INTERVENTION__APTITUDE_JOUR_NUIT, oldAptitudeJourNuit, aptitudeJourNuit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateDeReconnaiss() {
		return dateDeReconnaiss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDeReconnaiss(XMLGregorianCalendar newDateDeReconnaiss) {
		XMLGregorianCalendar oldDateDeReconnaiss = dateDeReconnaiss;
		dateDeReconnaiss = newDateDeReconnaiss;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_INTERVENTION__DATE_DE_RECONNAISS, oldDateDeReconnaiss, dateDeReconnaiss));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAxesApproche() {
		return axesApproche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxesApproche(String newAxesApproche) {
		String oldAxesApproche = axesApproche;
		axesApproche = newAxesApproche;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_INTERVENTION__AXES_APPROCHE, oldAxesApproche, axesApproche));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFrequences() {
		return frequences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequences(String newFrequences) {
		String oldFrequences = frequences;
		frequences = newFrequences;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_INTERVENTION__FREQUENCES, oldFrequences, frequences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreMaxiHelico() {
		return nombreMaxiHelico;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreMaxiHelico(long newNombreMaxiHelico) {
		long oldNombreMaxiHelico = nombreMaxiHelico;
		nombreMaxiHelico = newNombreMaxiHelico;
		boolean oldNombreMaxiHelicoESet = nombreMaxiHelicoESet;
		nombreMaxiHelicoESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_INTERVENTION__NOMBRE_MAXI_HELICO, oldNombreMaxiHelico, nombreMaxiHelico, !oldNombreMaxiHelicoESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreMaxiHelico() {
		long oldNombreMaxiHelico = nombreMaxiHelico;
		boolean oldNombreMaxiHelicoESet = nombreMaxiHelicoESet;
		nombreMaxiHelico = NOMBRE_MAXI_HELICO_EDEFAULT;
		nombreMaxiHelicoESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ZONE_INTERVENTION__NOMBRE_MAXI_HELICO, oldNombreMaxiHelico, NOMBRE_MAXI_HELICO_EDEFAULT, oldNombreMaxiHelicoESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreMaxiHelico() {
		return nombreMaxiHelicoESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoZoneInterventionPraticabilite getPraticabilite() {
		return praticabilite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPraticabilite(TypeDictionaryDicoZoneInterventionPraticabilite newPraticabilite) {
		TypeDictionaryDicoZoneInterventionPraticabilite oldPraticabilite = praticabilite;
		praticabilite = newPraticabilite == null ? PRATICABILITE_EDEFAULT : newPraticabilite;
		boolean oldPraticabiliteESet = praticabiliteESet;
		praticabiliteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_INTERVENTION__PRATICABILITE, oldPraticabilite, praticabilite, !oldPraticabiliteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPraticabilite() {
		TypeDictionaryDicoZoneInterventionPraticabilite oldPraticabilite = praticabilite;
		boolean oldPraticabiliteESet = praticabiliteESet;
		praticabilite = PRATICABILITE_EDEFAULT;
		praticabiliteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ZONE_INTERVENTION__PRATICABILITE, oldPraticabilite, PRATICABILITE_EDEFAULT, oldPraticabiliteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPraticabilite() {
		return praticabiliteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoZoneInterventionType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeDictionaryDicoZoneInterventionType newType) {
		TypeDictionaryDicoZoneInterventionType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_INTERVENTION__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeDictionaryDicoZoneInterventionType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ZONE_INTERVENTION__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoZoneInterventionNatureSol getNatureSol() {
		return natureSol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNatureSol(TypeDictionaryDicoZoneInterventionNatureSol newNatureSol) {
		TypeDictionaryDicoZoneInterventionNatureSol oldNatureSol = natureSol;
		natureSol = newNatureSol == null ? NATURE_SOL_EDEFAULT : newNatureSol;
		boolean oldNatureSolESet = natureSolESet;
		natureSolESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_INTERVENTION__NATURE_SOL, oldNatureSol, natureSol, !oldNatureSolESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNatureSol() {
		TypeDictionaryDicoZoneInterventionNatureSol oldNatureSol = natureSol;
		boolean oldNatureSolESet = natureSolESet;
		natureSol = NATURE_SOL_EDEFAULT;
		natureSolESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ZONE_INTERVENTION__NATURE_SOL, oldNatureSol, NATURE_SOL_EDEFAULT, oldNatureSolESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNatureSol() {
		return natureSolESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientation(double newOrientation) {
		double oldOrientation = orientation;
		orientation = newOrientation;
		boolean oldOrientationESet = orientationESet;
		orientationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_INTERVENTION__ORIENTATION, oldOrientation, orientation, !oldOrientationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOrientation() {
		double oldOrientation = orientation;
		boolean oldOrientationESet = orientationESet;
		orientation = ORIENTATION_EDEFAULT;
		orientationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ZONE_INTERVENTION__ORIENTATION, oldOrientation, ORIENTATION_EDEFAULT, oldOrientationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOrientation() {
		return orientationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTailleMaximum() {
		return tailleMaximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTailleMaximum(double newTailleMaximum) {
		double oldTailleMaximum = tailleMaximum;
		tailleMaximum = newTailleMaximum;
		boolean oldTailleMaximumESet = tailleMaximumESet;
		tailleMaximumESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_INTERVENTION__TAILLE_MAXIMUM, oldTailleMaximum, tailleMaximum, !oldTailleMaximumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTailleMaximum() {
		double oldTailleMaximum = tailleMaximum;
		boolean oldTailleMaximumESet = tailleMaximumESet;
		tailleMaximum = TAILLE_MAXIMUM_EDEFAULT;
		tailleMaximumESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ZONE_INTERVENTION__TAILLE_MAXIMUM, oldTailleMaximum, TAILLE_MAXIMUM_EDEFAULT, oldTailleMaximumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTailleMaximum() {
		return tailleMaximumESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoZoneInterventionZoneReconnue getZoneReconnue() {
		return zoneReconnue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZoneReconnue(TypeDictionaryDicoZoneInterventionZoneReconnue newZoneReconnue) {
		TypeDictionaryDicoZoneInterventionZoneReconnue oldZoneReconnue = zoneReconnue;
		zoneReconnue = newZoneReconnue == null ? ZONE_RECONNUE_EDEFAULT : newZoneReconnue;
		boolean oldZoneReconnueESet = zoneReconnueESet;
		zoneReconnueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_INTERVENTION__ZONE_RECONNUE, oldZoneReconnue, zoneReconnue, !oldZoneReconnueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetZoneReconnue() {
		TypeDictionaryDicoZoneInterventionZoneReconnue oldZoneReconnue = zoneReconnue;
		boolean oldZoneReconnueESet = zoneReconnueESet;
		zoneReconnue = ZONE_RECONNUE_EDEFAULT;
		zoneReconnueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ZONE_INTERVENTION__ZONE_RECONNUE, oldZoneReconnue, ZONE_RECONNUE_EDEFAULT, oldZoneReconnueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetZoneReconnue() {
		return zoneReconnueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_ZONE_INTERVENTION__APTITUDE_JOUR_NUIT:
				return getAptitudeJourNuit();
			case SchemaPackage.TYPE_ZONE_INTERVENTION__DATE_DE_RECONNAISS:
				return getDateDeReconnaiss();
			case SchemaPackage.TYPE_ZONE_INTERVENTION__AXES_APPROCHE:
				return getAxesApproche();
			case SchemaPackage.TYPE_ZONE_INTERVENTION__FREQUENCES:
				return getFrequences();
			case SchemaPackage.TYPE_ZONE_INTERVENTION__NOMBRE_MAXI_HELICO:
				return new Long(getNombreMaxiHelico());
			case SchemaPackage.TYPE_ZONE_INTERVENTION__PRATICABILITE:
				return getPraticabilite();
			case SchemaPackage.TYPE_ZONE_INTERVENTION__TYPE:
				return getType();
			case SchemaPackage.TYPE_ZONE_INTERVENTION__NATURE_SOL:
				return getNatureSol();
			case SchemaPackage.TYPE_ZONE_INTERVENTION__ORIENTATION:
				return new Double(getOrientation());
			case SchemaPackage.TYPE_ZONE_INTERVENTION__TAILLE_MAXIMUM:
				return new Double(getTailleMaximum());
			case SchemaPackage.TYPE_ZONE_INTERVENTION__ZONE_RECONNUE:
				return getZoneReconnue();
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
			case SchemaPackage.TYPE_ZONE_INTERVENTION__APTITUDE_JOUR_NUIT:
				setAptitudeJourNuit((String)newValue);
				return;
			case SchemaPackage.TYPE_ZONE_INTERVENTION__DATE_DE_RECONNAISS:
				setDateDeReconnaiss((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_ZONE_INTERVENTION__AXES_APPROCHE:
				setAxesApproche((String)newValue);
				return;
			case SchemaPackage.TYPE_ZONE_INTERVENTION__FREQUENCES:
				setFrequences((String)newValue);
				return;
			case SchemaPackage.TYPE_ZONE_INTERVENTION__NOMBRE_MAXI_HELICO:
				setNombreMaxiHelico(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_ZONE_INTERVENTION__PRATICABILITE:
				setPraticabilite((TypeDictionaryDicoZoneInterventionPraticabilite)newValue);
				return;
			case SchemaPackage.TYPE_ZONE_INTERVENTION__TYPE:
				setType((TypeDictionaryDicoZoneInterventionType)newValue);
				return;
			case SchemaPackage.TYPE_ZONE_INTERVENTION__NATURE_SOL:
				setNatureSol((TypeDictionaryDicoZoneInterventionNatureSol)newValue);
				return;
			case SchemaPackage.TYPE_ZONE_INTERVENTION__ORIENTATION:
				setOrientation(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_ZONE_INTERVENTION__TAILLE_MAXIMUM:
				setTailleMaximum(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_ZONE_INTERVENTION__ZONE_RECONNUE:
				setZoneReconnue((TypeDictionaryDicoZoneInterventionZoneReconnue)newValue);
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
			case SchemaPackage.TYPE_ZONE_INTERVENTION__APTITUDE_JOUR_NUIT:
				setAptitudeJourNuit(APTITUDE_JOUR_NUIT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ZONE_INTERVENTION__DATE_DE_RECONNAISS:
				setDateDeReconnaiss(DATE_DE_RECONNAISS_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ZONE_INTERVENTION__AXES_APPROCHE:
				setAxesApproche(AXES_APPROCHE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ZONE_INTERVENTION__FREQUENCES:
				setFrequences(FREQUENCES_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ZONE_INTERVENTION__NOMBRE_MAXI_HELICO:
				unsetNombreMaxiHelico();
				return;
			case SchemaPackage.TYPE_ZONE_INTERVENTION__PRATICABILITE:
				unsetPraticabilite();
				return;
			case SchemaPackage.TYPE_ZONE_INTERVENTION__TYPE:
				unsetType();
				return;
			case SchemaPackage.TYPE_ZONE_INTERVENTION__NATURE_SOL:
				unsetNatureSol();
				return;
			case SchemaPackage.TYPE_ZONE_INTERVENTION__ORIENTATION:
				unsetOrientation();
				return;
			case SchemaPackage.TYPE_ZONE_INTERVENTION__TAILLE_MAXIMUM:
				unsetTailleMaximum();
				return;
			case SchemaPackage.TYPE_ZONE_INTERVENTION__ZONE_RECONNUE:
				unsetZoneReconnue();
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
			case SchemaPackage.TYPE_ZONE_INTERVENTION__APTITUDE_JOUR_NUIT:
				return APTITUDE_JOUR_NUIT_EDEFAULT == null ? aptitudeJourNuit != null : !APTITUDE_JOUR_NUIT_EDEFAULT.equals(aptitudeJourNuit);
			case SchemaPackage.TYPE_ZONE_INTERVENTION__DATE_DE_RECONNAISS:
				return DATE_DE_RECONNAISS_EDEFAULT == null ? dateDeReconnaiss != null : !DATE_DE_RECONNAISS_EDEFAULT.equals(dateDeReconnaiss);
			case SchemaPackage.TYPE_ZONE_INTERVENTION__AXES_APPROCHE:
				return AXES_APPROCHE_EDEFAULT == null ? axesApproche != null : !AXES_APPROCHE_EDEFAULT.equals(axesApproche);
			case SchemaPackage.TYPE_ZONE_INTERVENTION__FREQUENCES:
				return FREQUENCES_EDEFAULT == null ? frequences != null : !FREQUENCES_EDEFAULT.equals(frequences);
			case SchemaPackage.TYPE_ZONE_INTERVENTION__NOMBRE_MAXI_HELICO:
				return isSetNombreMaxiHelico();
			case SchemaPackage.TYPE_ZONE_INTERVENTION__PRATICABILITE:
				return isSetPraticabilite();
			case SchemaPackage.TYPE_ZONE_INTERVENTION__TYPE:
				return isSetType();
			case SchemaPackage.TYPE_ZONE_INTERVENTION__NATURE_SOL:
				return isSetNatureSol();
			case SchemaPackage.TYPE_ZONE_INTERVENTION__ORIENTATION:
				return isSetOrientation();
			case SchemaPackage.TYPE_ZONE_INTERVENTION__TAILLE_MAXIMUM:
				return isSetTailleMaximum();
			case SchemaPackage.TYPE_ZONE_INTERVENTION__ZONE_RECONNUE:
				return isSetZoneReconnue();
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
		result.append(" (aptitudeJourNuit: ");
		result.append(aptitudeJourNuit);
		result.append(", dateDeReconnaiss: ");
		result.append(dateDeReconnaiss);
		result.append(", axesApproche: ");
		result.append(axesApproche);
		result.append(", frequences: ");
		result.append(frequences);
		result.append(", nombreMaxiHelico: ");
		if (nombreMaxiHelicoESet) result.append(nombreMaxiHelico); else result.append("<unset>");
		result.append(", praticabilite: ");
		if (praticabiliteESet) result.append(praticabilite); else result.append("<unset>");
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", natureSol: ");
		if (natureSolESet) result.append(natureSol); else result.append("<unset>");
		result.append(", orientation: ");
		if (orientationESet) result.append(orientation); else result.append("<unset>");
		result.append(", tailleMaximum: ");
		if (tailleMaximumESet) result.append(tailleMaximum); else result.append("<unset>");
		result.append(", zoneReconnue: ");
		if (zoneReconnueESet) result.append(zoneReconnue); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeZoneInterventionImpl
