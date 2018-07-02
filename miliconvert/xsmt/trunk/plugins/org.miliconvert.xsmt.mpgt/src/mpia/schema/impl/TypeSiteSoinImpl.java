/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoSiteSoinType;
import mpia.schema.TypeSiteSoin;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Site Soin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeSiteSoinImpl#getNombreConsultation <em>Nombre Consultation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSiteSoinImpl#getType <em>Type</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSiteSoinImpl#getQualiteSoins <em>Qualite Soins</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSiteSoinImpl#getBlocsOperatoires <em>Blocs Operatoires</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSiteSoinImpl#getEquipements <em>Equipements</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSiteSoinImpl#getLitsChirurgie <em>Lits Chirurgie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSiteSoinImpl#getLitsNeuroChirurgie <em>Lits Neuro Chirurgie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSiteSoinImpl#isServiceReanimation <em>Service Reanimation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSiteSoinImpl#isEauCourante <em>Eau Courante</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSiteSoinImpl#isFacilitesSanitaires <em>Facilites Sanitaires</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSiteSoinImpl#getLitsGrandsBrules <em>Lits Grands Brules</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSiteSoinImpl#getLitsOphtalmologie <em>Lits Ophtalmologie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSiteSoinImpl#getMedicaments <em>Medicaments</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSiteSoinImpl#getLitsUrologie <em>Lits Urologie</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeSiteSoinImpl extends EObjectImpl implements TypeSiteSoin {
	/**
	 * The default value of the '{@link #getNombreConsultation() <em>Nombre Consultation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreConsultation()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_CONSULTATION_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreConsultation() <em>Nombre Consultation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreConsultation()
	 * @generated
	 * @ordered
	 */
	protected long nombreConsultation = NOMBRE_CONSULTATION_EDEFAULT;

	/**
	 * This is true if the Nombre Consultation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreConsultationESet;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoSiteSoinType TYPE_EDEFAULT = TypeDictionaryDicoSiteSoinType.HSPCENT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoSiteSoinType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #getQualiteSoins() <em>Qualite Soins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualiteSoins()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALITE_SOINS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualiteSoins() <em>Qualite Soins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualiteSoins()
	 * @generated
	 * @ordered
	 */
	protected String qualiteSoins = QUALITE_SOINS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlocsOperatoires() <em>Blocs Operatoires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocsOperatoires()
	 * @generated
	 * @ordered
	 */
	protected static final long BLOCS_OPERATOIRES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getBlocsOperatoires() <em>Blocs Operatoires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocsOperatoires()
	 * @generated
	 * @ordered
	 */
	protected long blocsOperatoires = BLOCS_OPERATOIRES_EDEFAULT;

	/**
	 * This is true if the Blocs Operatoires attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean blocsOperatoiresESet;

	/**
	 * The default value of the '{@link #getEquipements() <em>Equipements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquipements()
	 * @generated
	 * @ordered
	 */
	protected static final String EQUIPEMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEquipements() <em>Equipements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquipements()
	 * @generated
	 * @ordered
	 */
	protected String equipements = EQUIPEMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLitsChirurgie() <em>Lits Chirurgie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLitsChirurgie()
	 * @generated
	 * @ordered
	 */
	protected static final long LITS_CHIRURGIE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getLitsChirurgie() <em>Lits Chirurgie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLitsChirurgie()
	 * @generated
	 * @ordered
	 */
	protected long litsChirurgie = LITS_CHIRURGIE_EDEFAULT;

	/**
	 * This is true if the Lits Chirurgie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean litsChirurgieESet;

	/**
	 * The default value of the '{@link #getLitsNeuroChirurgie() <em>Lits Neuro Chirurgie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLitsNeuroChirurgie()
	 * @generated
	 * @ordered
	 */
	protected static final long LITS_NEURO_CHIRURGIE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getLitsNeuroChirurgie() <em>Lits Neuro Chirurgie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLitsNeuroChirurgie()
	 * @generated
	 * @ordered
	 */
	protected long litsNeuroChirurgie = LITS_NEURO_CHIRURGIE_EDEFAULT;

	/**
	 * This is true if the Lits Neuro Chirurgie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean litsNeuroChirurgieESet;

	/**
	 * The default value of the '{@link #isServiceReanimation() <em>Service Reanimation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isServiceReanimation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SERVICE_REANIMATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isServiceReanimation() <em>Service Reanimation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isServiceReanimation()
	 * @generated
	 * @ordered
	 */
	protected boolean serviceReanimation = SERVICE_REANIMATION_EDEFAULT;

	/**
	 * This is true if the Service Reanimation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean serviceReanimationESet;

	/**
	 * The default value of the '{@link #isEauCourante() <em>Eau Courante</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEauCourante()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EAU_COURANTE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEauCourante() <em>Eau Courante</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEauCourante()
	 * @generated
	 * @ordered
	 */
	protected boolean eauCourante = EAU_COURANTE_EDEFAULT;

	/**
	 * This is true if the Eau Courante attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eauCouranteESet;

	/**
	 * The default value of the '{@link #isFacilitesSanitaires() <em>Facilites Sanitaires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFacilitesSanitaires()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FACILITES_SANITAIRES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFacilitesSanitaires() <em>Facilites Sanitaires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFacilitesSanitaires()
	 * @generated
	 * @ordered
	 */
	protected boolean facilitesSanitaires = FACILITES_SANITAIRES_EDEFAULT;

	/**
	 * This is true if the Facilites Sanitaires attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean facilitesSanitairesESet;

	/**
	 * The default value of the '{@link #getLitsGrandsBrules() <em>Lits Grands Brules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLitsGrandsBrules()
	 * @generated
	 * @ordered
	 */
	protected static final long LITS_GRANDS_BRULES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getLitsGrandsBrules() <em>Lits Grands Brules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLitsGrandsBrules()
	 * @generated
	 * @ordered
	 */
	protected long litsGrandsBrules = LITS_GRANDS_BRULES_EDEFAULT;

	/**
	 * This is true if the Lits Grands Brules attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean litsGrandsBrulesESet;

	/**
	 * The default value of the '{@link #getLitsOphtalmologie() <em>Lits Ophtalmologie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLitsOphtalmologie()
	 * @generated
	 * @ordered
	 */
	protected static final long LITS_OPHTALMOLOGIE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getLitsOphtalmologie() <em>Lits Ophtalmologie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLitsOphtalmologie()
	 * @generated
	 * @ordered
	 */
	protected long litsOphtalmologie = LITS_OPHTALMOLOGIE_EDEFAULT;

	/**
	 * This is true if the Lits Ophtalmologie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean litsOphtalmologieESet;

	/**
	 * The default value of the '{@link #getMedicaments() <em>Medicaments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicaments()
	 * @generated
	 * @ordered
	 */
	protected static final String MEDICAMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMedicaments() <em>Medicaments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicaments()
	 * @generated
	 * @ordered
	 */
	protected String medicaments = MEDICAMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLitsUrologie() <em>Lits Urologie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLitsUrologie()
	 * @generated
	 * @ordered
	 */
	protected static final long LITS_UROLOGIE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getLitsUrologie() <em>Lits Urologie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLitsUrologie()
	 * @generated
	 * @ordered
	 */
	protected long litsUrologie = LITS_UROLOGIE_EDEFAULT;

	/**
	 * This is true if the Lits Urologie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean litsUrologieESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeSiteSoinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeSiteSoin();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreConsultation() {
		return nombreConsultation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreConsultation(long newNombreConsultation) {
		long oldNombreConsultation = nombreConsultation;
		nombreConsultation = newNombreConsultation;
		boolean oldNombreConsultationESet = nombreConsultationESet;
		nombreConsultationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITE_SOIN__NOMBRE_CONSULTATION, oldNombreConsultation, nombreConsultation, !oldNombreConsultationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreConsultation() {
		long oldNombreConsultation = nombreConsultation;
		boolean oldNombreConsultationESet = nombreConsultationESet;
		nombreConsultation = NOMBRE_CONSULTATION_EDEFAULT;
		nombreConsultationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SITE_SOIN__NOMBRE_CONSULTATION, oldNombreConsultation, NOMBRE_CONSULTATION_EDEFAULT, oldNombreConsultationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreConsultation() {
		return nombreConsultationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoSiteSoinType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeDictionaryDicoSiteSoinType newType) {
		TypeDictionaryDicoSiteSoinType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITE_SOIN__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeDictionaryDicoSiteSoinType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SITE_SOIN__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
	public String getQualiteSoins() {
		return qualiteSoins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualiteSoins(String newQualiteSoins) {
		String oldQualiteSoins = qualiteSoins;
		qualiteSoins = newQualiteSoins;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITE_SOIN__QUALITE_SOINS, oldQualiteSoins, qualiteSoins));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getBlocsOperatoires() {
		return blocsOperatoires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlocsOperatoires(long newBlocsOperatoires) {
		long oldBlocsOperatoires = blocsOperatoires;
		blocsOperatoires = newBlocsOperatoires;
		boolean oldBlocsOperatoiresESet = blocsOperatoiresESet;
		blocsOperatoiresESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITE_SOIN__BLOCS_OPERATOIRES, oldBlocsOperatoires, blocsOperatoires, !oldBlocsOperatoiresESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBlocsOperatoires() {
		long oldBlocsOperatoires = blocsOperatoires;
		boolean oldBlocsOperatoiresESet = blocsOperatoiresESet;
		blocsOperatoires = BLOCS_OPERATOIRES_EDEFAULT;
		blocsOperatoiresESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SITE_SOIN__BLOCS_OPERATOIRES, oldBlocsOperatoires, BLOCS_OPERATOIRES_EDEFAULT, oldBlocsOperatoiresESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBlocsOperatoires() {
		return blocsOperatoiresESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEquipements() {
		return equipements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEquipements(String newEquipements) {
		String oldEquipements = equipements;
		equipements = newEquipements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITE_SOIN__EQUIPEMENTS, oldEquipements, equipements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getLitsChirurgie() {
		return litsChirurgie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLitsChirurgie(long newLitsChirurgie) {
		long oldLitsChirurgie = litsChirurgie;
		litsChirurgie = newLitsChirurgie;
		boolean oldLitsChirurgieESet = litsChirurgieESet;
		litsChirurgieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITE_SOIN__LITS_CHIRURGIE, oldLitsChirurgie, litsChirurgie, !oldLitsChirurgieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLitsChirurgie() {
		long oldLitsChirurgie = litsChirurgie;
		boolean oldLitsChirurgieESet = litsChirurgieESet;
		litsChirurgie = LITS_CHIRURGIE_EDEFAULT;
		litsChirurgieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SITE_SOIN__LITS_CHIRURGIE, oldLitsChirurgie, LITS_CHIRURGIE_EDEFAULT, oldLitsChirurgieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLitsChirurgie() {
		return litsChirurgieESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getLitsNeuroChirurgie() {
		return litsNeuroChirurgie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLitsNeuroChirurgie(long newLitsNeuroChirurgie) {
		long oldLitsNeuroChirurgie = litsNeuroChirurgie;
		litsNeuroChirurgie = newLitsNeuroChirurgie;
		boolean oldLitsNeuroChirurgieESet = litsNeuroChirurgieESet;
		litsNeuroChirurgieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITE_SOIN__LITS_NEURO_CHIRURGIE, oldLitsNeuroChirurgie, litsNeuroChirurgie, !oldLitsNeuroChirurgieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLitsNeuroChirurgie() {
		long oldLitsNeuroChirurgie = litsNeuroChirurgie;
		boolean oldLitsNeuroChirurgieESet = litsNeuroChirurgieESet;
		litsNeuroChirurgie = LITS_NEURO_CHIRURGIE_EDEFAULT;
		litsNeuroChirurgieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SITE_SOIN__LITS_NEURO_CHIRURGIE, oldLitsNeuroChirurgie, LITS_NEURO_CHIRURGIE_EDEFAULT, oldLitsNeuroChirurgieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLitsNeuroChirurgie() {
		return litsNeuroChirurgieESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isServiceReanimation() {
		return serviceReanimation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceReanimation(boolean newServiceReanimation) {
		boolean oldServiceReanimation = serviceReanimation;
		serviceReanimation = newServiceReanimation;
		boolean oldServiceReanimationESet = serviceReanimationESet;
		serviceReanimationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITE_SOIN__SERVICE_REANIMATION, oldServiceReanimation, serviceReanimation, !oldServiceReanimationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetServiceReanimation() {
		boolean oldServiceReanimation = serviceReanimation;
		boolean oldServiceReanimationESet = serviceReanimationESet;
		serviceReanimation = SERVICE_REANIMATION_EDEFAULT;
		serviceReanimationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SITE_SOIN__SERVICE_REANIMATION, oldServiceReanimation, SERVICE_REANIMATION_EDEFAULT, oldServiceReanimationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetServiceReanimation() {
		return serviceReanimationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEauCourante() {
		return eauCourante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEauCourante(boolean newEauCourante) {
		boolean oldEauCourante = eauCourante;
		eauCourante = newEauCourante;
		boolean oldEauCouranteESet = eauCouranteESet;
		eauCouranteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITE_SOIN__EAU_COURANTE, oldEauCourante, eauCourante, !oldEauCouranteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEauCourante() {
		boolean oldEauCourante = eauCourante;
		boolean oldEauCouranteESet = eauCouranteESet;
		eauCourante = EAU_COURANTE_EDEFAULT;
		eauCouranteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SITE_SOIN__EAU_COURANTE, oldEauCourante, EAU_COURANTE_EDEFAULT, oldEauCouranteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEauCourante() {
		return eauCouranteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFacilitesSanitaires() {
		return facilitesSanitaires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFacilitesSanitaires(boolean newFacilitesSanitaires) {
		boolean oldFacilitesSanitaires = facilitesSanitaires;
		facilitesSanitaires = newFacilitesSanitaires;
		boolean oldFacilitesSanitairesESet = facilitesSanitairesESet;
		facilitesSanitairesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITE_SOIN__FACILITES_SANITAIRES, oldFacilitesSanitaires, facilitesSanitaires, !oldFacilitesSanitairesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFacilitesSanitaires() {
		boolean oldFacilitesSanitaires = facilitesSanitaires;
		boolean oldFacilitesSanitairesESet = facilitesSanitairesESet;
		facilitesSanitaires = FACILITES_SANITAIRES_EDEFAULT;
		facilitesSanitairesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SITE_SOIN__FACILITES_SANITAIRES, oldFacilitesSanitaires, FACILITES_SANITAIRES_EDEFAULT, oldFacilitesSanitairesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFacilitesSanitaires() {
		return facilitesSanitairesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getLitsGrandsBrules() {
		return litsGrandsBrules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLitsGrandsBrules(long newLitsGrandsBrules) {
		long oldLitsGrandsBrules = litsGrandsBrules;
		litsGrandsBrules = newLitsGrandsBrules;
		boolean oldLitsGrandsBrulesESet = litsGrandsBrulesESet;
		litsGrandsBrulesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITE_SOIN__LITS_GRANDS_BRULES, oldLitsGrandsBrules, litsGrandsBrules, !oldLitsGrandsBrulesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLitsGrandsBrules() {
		long oldLitsGrandsBrules = litsGrandsBrules;
		boolean oldLitsGrandsBrulesESet = litsGrandsBrulesESet;
		litsGrandsBrules = LITS_GRANDS_BRULES_EDEFAULT;
		litsGrandsBrulesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SITE_SOIN__LITS_GRANDS_BRULES, oldLitsGrandsBrules, LITS_GRANDS_BRULES_EDEFAULT, oldLitsGrandsBrulesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLitsGrandsBrules() {
		return litsGrandsBrulesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getLitsOphtalmologie() {
		return litsOphtalmologie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLitsOphtalmologie(long newLitsOphtalmologie) {
		long oldLitsOphtalmologie = litsOphtalmologie;
		litsOphtalmologie = newLitsOphtalmologie;
		boolean oldLitsOphtalmologieESet = litsOphtalmologieESet;
		litsOphtalmologieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITE_SOIN__LITS_OPHTALMOLOGIE, oldLitsOphtalmologie, litsOphtalmologie, !oldLitsOphtalmologieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLitsOphtalmologie() {
		long oldLitsOphtalmologie = litsOphtalmologie;
		boolean oldLitsOphtalmologieESet = litsOphtalmologieESet;
		litsOphtalmologie = LITS_OPHTALMOLOGIE_EDEFAULT;
		litsOphtalmologieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SITE_SOIN__LITS_OPHTALMOLOGIE, oldLitsOphtalmologie, LITS_OPHTALMOLOGIE_EDEFAULT, oldLitsOphtalmologieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLitsOphtalmologie() {
		return litsOphtalmologieESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMedicaments() {
		return medicaments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedicaments(String newMedicaments) {
		String oldMedicaments = medicaments;
		medicaments = newMedicaments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITE_SOIN__MEDICAMENTS, oldMedicaments, medicaments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getLitsUrologie() {
		return litsUrologie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLitsUrologie(long newLitsUrologie) {
		long oldLitsUrologie = litsUrologie;
		litsUrologie = newLitsUrologie;
		boolean oldLitsUrologieESet = litsUrologieESet;
		litsUrologieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITE_SOIN__LITS_UROLOGIE, oldLitsUrologie, litsUrologie, !oldLitsUrologieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLitsUrologie() {
		long oldLitsUrologie = litsUrologie;
		boolean oldLitsUrologieESet = litsUrologieESet;
		litsUrologie = LITS_UROLOGIE_EDEFAULT;
		litsUrologieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SITE_SOIN__LITS_UROLOGIE, oldLitsUrologie, LITS_UROLOGIE_EDEFAULT, oldLitsUrologieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLitsUrologie() {
		return litsUrologieESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_SITE_SOIN__NOMBRE_CONSULTATION:
				return new Long(getNombreConsultation());
			case SchemaPackage.TYPE_SITE_SOIN__TYPE:
				return getType();
			case SchemaPackage.TYPE_SITE_SOIN__QUALITE_SOINS:
				return getQualiteSoins();
			case SchemaPackage.TYPE_SITE_SOIN__BLOCS_OPERATOIRES:
				return new Long(getBlocsOperatoires());
			case SchemaPackage.TYPE_SITE_SOIN__EQUIPEMENTS:
				return getEquipements();
			case SchemaPackage.TYPE_SITE_SOIN__LITS_CHIRURGIE:
				return new Long(getLitsChirurgie());
			case SchemaPackage.TYPE_SITE_SOIN__LITS_NEURO_CHIRURGIE:
				return new Long(getLitsNeuroChirurgie());
			case SchemaPackage.TYPE_SITE_SOIN__SERVICE_REANIMATION:
				return isServiceReanimation() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_SITE_SOIN__EAU_COURANTE:
				return isEauCourante() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_SITE_SOIN__FACILITES_SANITAIRES:
				return isFacilitesSanitaires() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_SITE_SOIN__LITS_GRANDS_BRULES:
				return new Long(getLitsGrandsBrules());
			case SchemaPackage.TYPE_SITE_SOIN__LITS_OPHTALMOLOGIE:
				return new Long(getLitsOphtalmologie());
			case SchemaPackage.TYPE_SITE_SOIN__MEDICAMENTS:
				return getMedicaments();
			case SchemaPackage.TYPE_SITE_SOIN__LITS_UROLOGIE:
				return new Long(getLitsUrologie());
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
			case SchemaPackage.TYPE_SITE_SOIN__NOMBRE_CONSULTATION:
				setNombreConsultation(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_SITE_SOIN__TYPE:
				setType((TypeDictionaryDicoSiteSoinType)newValue);
				return;
			case SchemaPackage.TYPE_SITE_SOIN__QUALITE_SOINS:
				setQualiteSoins((String)newValue);
				return;
			case SchemaPackage.TYPE_SITE_SOIN__BLOCS_OPERATOIRES:
				setBlocsOperatoires(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_SITE_SOIN__EQUIPEMENTS:
				setEquipements((String)newValue);
				return;
			case SchemaPackage.TYPE_SITE_SOIN__LITS_CHIRURGIE:
				setLitsChirurgie(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_SITE_SOIN__LITS_NEURO_CHIRURGIE:
				setLitsNeuroChirurgie(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_SITE_SOIN__SERVICE_REANIMATION:
				setServiceReanimation(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_SITE_SOIN__EAU_COURANTE:
				setEauCourante(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_SITE_SOIN__FACILITES_SANITAIRES:
				setFacilitesSanitaires(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_SITE_SOIN__LITS_GRANDS_BRULES:
				setLitsGrandsBrules(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_SITE_SOIN__LITS_OPHTALMOLOGIE:
				setLitsOphtalmologie(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_SITE_SOIN__MEDICAMENTS:
				setMedicaments((String)newValue);
				return;
			case SchemaPackage.TYPE_SITE_SOIN__LITS_UROLOGIE:
				setLitsUrologie(((Long)newValue).longValue());
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
			case SchemaPackage.TYPE_SITE_SOIN__NOMBRE_CONSULTATION:
				unsetNombreConsultation();
				return;
			case SchemaPackage.TYPE_SITE_SOIN__TYPE:
				unsetType();
				return;
			case SchemaPackage.TYPE_SITE_SOIN__QUALITE_SOINS:
				setQualiteSoins(QUALITE_SOINS_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SITE_SOIN__BLOCS_OPERATOIRES:
				unsetBlocsOperatoires();
				return;
			case SchemaPackage.TYPE_SITE_SOIN__EQUIPEMENTS:
				setEquipements(EQUIPEMENTS_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SITE_SOIN__LITS_CHIRURGIE:
				unsetLitsChirurgie();
				return;
			case SchemaPackage.TYPE_SITE_SOIN__LITS_NEURO_CHIRURGIE:
				unsetLitsNeuroChirurgie();
				return;
			case SchemaPackage.TYPE_SITE_SOIN__SERVICE_REANIMATION:
				unsetServiceReanimation();
				return;
			case SchemaPackage.TYPE_SITE_SOIN__EAU_COURANTE:
				unsetEauCourante();
				return;
			case SchemaPackage.TYPE_SITE_SOIN__FACILITES_SANITAIRES:
				unsetFacilitesSanitaires();
				return;
			case SchemaPackage.TYPE_SITE_SOIN__LITS_GRANDS_BRULES:
				unsetLitsGrandsBrules();
				return;
			case SchemaPackage.TYPE_SITE_SOIN__LITS_OPHTALMOLOGIE:
				unsetLitsOphtalmologie();
				return;
			case SchemaPackage.TYPE_SITE_SOIN__MEDICAMENTS:
				setMedicaments(MEDICAMENTS_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SITE_SOIN__LITS_UROLOGIE:
				unsetLitsUrologie();
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
			case SchemaPackage.TYPE_SITE_SOIN__NOMBRE_CONSULTATION:
				return isSetNombreConsultation();
			case SchemaPackage.TYPE_SITE_SOIN__TYPE:
				return isSetType();
			case SchemaPackage.TYPE_SITE_SOIN__QUALITE_SOINS:
				return QUALITE_SOINS_EDEFAULT == null ? qualiteSoins != null : !QUALITE_SOINS_EDEFAULT.equals(qualiteSoins);
			case SchemaPackage.TYPE_SITE_SOIN__BLOCS_OPERATOIRES:
				return isSetBlocsOperatoires();
			case SchemaPackage.TYPE_SITE_SOIN__EQUIPEMENTS:
				return EQUIPEMENTS_EDEFAULT == null ? equipements != null : !EQUIPEMENTS_EDEFAULT.equals(equipements);
			case SchemaPackage.TYPE_SITE_SOIN__LITS_CHIRURGIE:
				return isSetLitsChirurgie();
			case SchemaPackage.TYPE_SITE_SOIN__LITS_NEURO_CHIRURGIE:
				return isSetLitsNeuroChirurgie();
			case SchemaPackage.TYPE_SITE_SOIN__SERVICE_REANIMATION:
				return isSetServiceReanimation();
			case SchemaPackage.TYPE_SITE_SOIN__EAU_COURANTE:
				return isSetEauCourante();
			case SchemaPackage.TYPE_SITE_SOIN__FACILITES_SANITAIRES:
				return isSetFacilitesSanitaires();
			case SchemaPackage.TYPE_SITE_SOIN__LITS_GRANDS_BRULES:
				return isSetLitsGrandsBrules();
			case SchemaPackage.TYPE_SITE_SOIN__LITS_OPHTALMOLOGIE:
				return isSetLitsOphtalmologie();
			case SchemaPackage.TYPE_SITE_SOIN__MEDICAMENTS:
				return MEDICAMENTS_EDEFAULT == null ? medicaments != null : !MEDICAMENTS_EDEFAULT.equals(medicaments);
			case SchemaPackage.TYPE_SITE_SOIN__LITS_UROLOGIE:
				return isSetLitsUrologie();
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
		result.append(" (nombreConsultation: ");
		if (nombreConsultationESet) result.append(nombreConsultation); else result.append("<unset>");
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", qualiteSoins: ");
		result.append(qualiteSoins);
		result.append(", blocsOperatoires: ");
		if (blocsOperatoiresESet) result.append(blocsOperatoires); else result.append("<unset>");
		result.append(", equipements: ");
		result.append(equipements);
		result.append(", litsChirurgie: ");
		if (litsChirurgieESet) result.append(litsChirurgie); else result.append("<unset>");
		result.append(", litsNeuroChirurgie: ");
		if (litsNeuroChirurgieESet) result.append(litsNeuroChirurgie); else result.append("<unset>");
		result.append(", serviceReanimation: ");
		if (serviceReanimationESet) result.append(serviceReanimation); else result.append("<unset>");
		result.append(", eauCourante: ");
		if (eauCouranteESet) result.append(eauCourante); else result.append("<unset>");
		result.append(", facilitesSanitaires: ");
		if (facilitesSanitairesESet) result.append(facilitesSanitaires); else result.append("<unset>");
		result.append(", litsGrandsBrules: ");
		if (litsGrandsBrulesESet) result.append(litsGrandsBrules); else result.append("<unset>");
		result.append(", litsOphtalmologie: ");
		if (litsOphtalmologieESet) result.append(litsOphtalmologie); else result.append("<unset>");
		result.append(", medicaments: ");
		result.append(medicaments);
		result.append(", litsUrologie: ");
		if (litsUrologieESet) result.append(litsUrologie); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeSiteSoinImpl
