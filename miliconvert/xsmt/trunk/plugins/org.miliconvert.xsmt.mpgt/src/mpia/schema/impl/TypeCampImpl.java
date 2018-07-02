/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCamp;
import mpia.schema.TypeDictionaryDicoCampType;
import mpia.schema.TypeDictionaryDicoComportement;
import mpia.schema.TypeDictionaryDicoEntitePolitiqueTrigramme;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Camp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCampImpl#getHommes <em>Hommes</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCampImpl#getCodeStanag3596 <em>Code Stanag3596</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCampImpl#getSituationPhysique <em>Situation Physique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCampImpl#getType <em>Type</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCampImpl#getNbPersonnesPresentes <em>Nb Personnes Presentes</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCampImpl#getTypePopulation <em>Type Population</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCampImpl#getNationaliteOccupants <em>Nationalite Occupants</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCampImpl#getEnfants <em>Enfants</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCampImpl#getFemmes <em>Femmes</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCampImpl#getConditionsGenerales <em>Conditions Generales</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCampImpl#getAttitude <em>Attitude</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCampImpl extends EObjectImpl implements TypeCamp {
	/**
	 * The default value of the '{@link #getHommes() <em>Hommes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHommes()
	 * @generated
	 * @ordered
	 */
	protected static final long HOMMES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getHommes() <em>Hommes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHommes()
	 * @generated
	 * @ordered
	 */
	protected long hommes = HOMMES_EDEFAULT;

	/**
	 * This is true if the Hommes attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hommesESet;

	/**
	 * The default value of the '{@link #getCodeStanag3596() <em>Code Stanag3596</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeStanag3596()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_STANAG3596_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeStanag3596() <em>Code Stanag3596</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeStanag3596()
	 * @generated
	 * @ordered
	 */
	protected String codeStanag3596 = CODE_STANAG3596_EDEFAULT;

	/**
	 * The default value of the '{@link #getSituationPhysique() <em>Situation Physique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSituationPhysique()
	 * @generated
	 * @ordered
	 */
	protected static final String SITUATION_PHYSIQUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSituationPhysique() <em>Situation Physique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSituationPhysique()
	 * @generated
	 * @ordered
	 */
	protected String situationPhysique = SITUATION_PHYSIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCampType TYPE_EDEFAULT = TypeDictionaryDicoCampType.ACCOM;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCampType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #getNbPersonnesPresentes() <em>Nb Personnes Presentes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbPersonnesPresentes()
	 * @generated
	 * @ordered
	 */
	protected static final long NB_PERSONNES_PRESENTES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNbPersonnesPresentes() <em>Nb Personnes Presentes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbPersonnesPresentes()
	 * @generated
	 * @ordered
	 */
	protected long nbPersonnesPresentes = NB_PERSONNES_PRESENTES_EDEFAULT;

	/**
	 * This is true if the Nb Personnes Presentes attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nbPersonnesPresentesESet;

	/**
	 * The default value of the '{@link #getTypePopulation() <em>Type Population</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypePopulation()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_POPULATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypePopulation() <em>Type Population</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypePopulation()
	 * @generated
	 * @ordered
	 */
	protected String typePopulation = TYPE_POPULATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNationaliteOccupants() <em>Nationalite Occupants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNationaliteOccupants()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEntitePolitiqueTrigramme NATIONALITE_OCCUPANTS_EDEFAULT = TypeDictionaryDicoEntitePolitiqueTrigramme.ATG;

	/**
	 * The cached value of the '{@link #getNationaliteOccupants() <em>Nationalite Occupants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNationaliteOccupants()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEntitePolitiqueTrigramme nationaliteOccupants = NATIONALITE_OCCUPANTS_EDEFAULT;

	/**
	 * This is true if the Nationalite Occupants attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nationaliteOccupantsESet;

	/**
	 * The default value of the '{@link #getEnfants() <em>Enfants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnfants()
	 * @generated
	 * @ordered
	 */
	protected static final long ENFANTS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getEnfants() <em>Enfants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnfants()
	 * @generated
	 * @ordered
	 */
	protected long enfants = ENFANTS_EDEFAULT;

	/**
	 * This is true if the Enfants attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean enfantsESet;

	/**
	 * The default value of the '{@link #getFemmes() <em>Femmes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFemmes()
	 * @generated
	 * @ordered
	 */
	protected static final long FEMMES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getFemmes() <em>Femmes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFemmes()
	 * @generated
	 * @ordered
	 */
	protected long femmes = FEMMES_EDEFAULT;

	/**
	 * This is true if the Femmes attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean femmesESet;

	/**
	 * The default value of the '{@link #getConditionsGenerales() <em>Conditions Generales</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionsGenerales()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITIONS_GENERALES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConditionsGenerales() <em>Conditions Generales</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionsGenerales()
	 * @generated
	 * @ordered
	 */
	protected String conditionsGenerales = CONDITIONS_GENERALES_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttitude() <em>Attitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttitude()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoComportement ATTITUDE_EDEFAULT = TypeDictionaryDicoComportement.AFR;

	/**
	 * The cached value of the '{@link #getAttitude() <em>Attitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttitude()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoComportement attitude = ATTITUDE_EDEFAULT;

	/**
	 * This is true if the Attitude attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean attitudeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCampImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCamp();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getHommes() {
		return hommes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHommes(long newHommes) {
		long oldHommes = hommes;
		hommes = newHommes;
		boolean oldHommesESet = hommesESet;
		hommesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAMP__HOMMES, oldHommes, hommes, !oldHommesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHommes() {
		long oldHommes = hommes;
		boolean oldHommesESet = hommesESet;
		hommes = HOMMES_EDEFAULT;
		hommesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAMP__HOMMES, oldHommes, HOMMES_EDEFAULT, oldHommesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHommes() {
		return hommesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeStanag3596() {
		return codeStanag3596;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeStanag3596(String newCodeStanag3596) {
		String oldCodeStanag3596 = codeStanag3596;
		codeStanag3596 = newCodeStanag3596;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAMP__CODE_STANAG3596, oldCodeStanag3596, codeStanag3596));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSituationPhysique() {
		return situationPhysique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSituationPhysique(String newSituationPhysique) {
		String oldSituationPhysique = situationPhysique;
		situationPhysique = newSituationPhysique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAMP__SITUATION_PHYSIQUE, oldSituationPhysique, situationPhysique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCampType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeDictionaryDicoCampType newType) {
		TypeDictionaryDicoCampType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAMP__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeDictionaryDicoCampType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAMP__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
	public long getNbPersonnesPresentes() {
		return nbPersonnesPresentes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbPersonnesPresentes(long newNbPersonnesPresentes) {
		long oldNbPersonnesPresentes = nbPersonnesPresentes;
		nbPersonnesPresentes = newNbPersonnesPresentes;
		boolean oldNbPersonnesPresentesESet = nbPersonnesPresentesESet;
		nbPersonnesPresentesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAMP__NB_PERSONNES_PRESENTES, oldNbPersonnesPresentes, nbPersonnesPresentes, !oldNbPersonnesPresentesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNbPersonnesPresentes() {
		long oldNbPersonnesPresentes = nbPersonnesPresentes;
		boolean oldNbPersonnesPresentesESet = nbPersonnesPresentesESet;
		nbPersonnesPresentes = NB_PERSONNES_PRESENTES_EDEFAULT;
		nbPersonnesPresentesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAMP__NB_PERSONNES_PRESENTES, oldNbPersonnesPresentes, NB_PERSONNES_PRESENTES_EDEFAULT, oldNbPersonnesPresentesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNbPersonnesPresentes() {
		return nbPersonnesPresentesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypePopulation() {
		return typePopulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypePopulation(String newTypePopulation) {
		String oldTypePopulation = typePopulation;
		typePopulation = newTypePopulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAMP__TYPE_POPULATION, oldTypePopulation, typePopulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEntitePolitiqueTrigramme getNationaliteOccupants() {
		return nationaliteOccupants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNationaliteOccupants(TypeDictionaryDicoEntitePolitiqueTrigramme newNationaliteOccupants) {
		TypeDictionaryDicoEntitePolitiqueTrigramme oldNationaliteOccupants = nationaliteOccupants;
		nationaliteOccupants = newNationaliteOccupants == null ? NATIONALITE_OCCUPANTS_EDEFAULT : newNationaliteOccupants;
		boolean oldNationaliteOccupantsESet = nationaliteOccupantsESet;
		nationaliteOccupantsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAMP__NATIONALITE_OCCUPANTS, oldNationaliteOccupants, nationaliteOccupants, !oldNationaliteOccupantsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNationaliteOccupants() {
		TypeDictionaryDicoEntitePolitiqueTrigramme oldNationaliteOccupants = nationaliteOccupants;
		boolean oldNationaliteOccupantsESet = nationaliteOccupantsESet;
		nationaliteOccupants = NATIONALITE_OCCUPANTS_EDEFAULT;
		nationaliteOccupantsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAMP__NATIONALITE_OCCUPANTS, oldNationaliteOccupants, NATIONALITE_OCCUPANTS_EDEFAULT, oldNationaliteOccupantsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNationaliteOccupants() {
		return nationaliteOccupantsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getEnfants() {
		return enfants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnfants(long newEnfants) {
		long oldEnfants = enfants;
		enfants = newEnfants;
		boolean oldEnfantsESet = enfantsESet;
		enfantsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAMP__ENFANTS, oldEnfants, enfants, !oldEnfantsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEnfants() {
		long oldEnfants = enfants;
		boolean oldEnfantsESet = enfantsESet;
		enfants = ENFANTS_EDEFAULT;
		enfantsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAMP__ENFANTS, oldEnfants, ENFANTS_EDEFAULT, oldEnfantsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEnfants() {
		return enfantsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getFemmes() {
		return femmes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFemmes(long newFemmes) {
		long oldFemmes = femmes;
		femmes = newFemmes;
		boolean oldFemmesESet = femmesESet;
		femmesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAMP__FEMMES, oldFemmes, femmes, !oldFemmesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFemmes() {
		long oldFemmes = femmes;
		boolean oldFemmesESet = femmesESet;
		femmes = FEMMES_EDEFAULT;
		femmesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAMP__FEMMES, oldFemmes, FEMMES_EDEFAULT, oldFemmesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFemmes() {
		return femmesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConditionsGenerales() {
		return conditionsGenerales;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionsGenerales(String newConditionsGenerales) {
		String oldConditionsGenerales = conditionsGenerales;
		conditionsGenerales = newConditionsGenerales;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAMP__CONDITIONS_GENERALES, oldConditionsGenerales, conditionsGenerales));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoComportement getAttitude() {
		return attitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttitude(TypeDictionaryDicoComportement newAttitude) {
		TypeDictionaryDicoComportement oldAttitude = attitude;
		attitude = newAttitude == null ? ATTITUDE_EDEFAULT : newAttitude;
		boolean oldAttitudeESet = attitudeESet;
		attitudeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAMP__ATTITUDE, oldAttitude, attitude, !oldAttitudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAttitude() {
		TypeDictionaryDicoComportement oldAttitude = attitude;
		boolean oldAttitudeESet = attitudeESet;
		attitude = ATTITUDE_EDEFAULT;
		attitudeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAMP__ATTITUDE, oldAttitude, ATTITUDE_EDEFAULT, oldAttitudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAttitude() {
		return attitudeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_CAMP__HOMMES:
				return new Long(getHommes());
			case SchemaPackage.TYPE_CAMP__CODE_STANAG3596:
				return getCodeStanag3596();
			case SchemaPackage.TYPE_CAMP__SITUATION_PHYSIQUE:
				return getSituationPhysique();
			case SchemaPackage.TYPE_CAMP__TYPE:
				return getType();
			case SchemaPackage.TYPE_CAMP__NB_PERSONNES_PRESENTES:
				return new Long(getNbPersonnesPresentes());
			case SchemaPackage.TYPE_CAMP__TYPE_POPULATION:
				return getTypePopulation();
			case SchemaPackage.TYPE_CAMP__NATIONALITE_OCCUPANTS:
				return getNationaliteOccupants();
			case SchemaPackage.TYPE_CAMP__ENFANTS:
				return new Long(getEnfants());
			case SchemaPackage.TYPE_CAMP__FEMMES:
				return new Long(getFemmes());
			case SchemaPackage.TYPE_CAMP__CONDITIONS_GENERALES:
				return getConditionsGenerales();
			case SchemaPackage.TYPE_CAMP__ATTITUDE:
				return getAttitude();
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
			case SchemaPackage.TYPE_CAMP__HOMMES:
				setHommes(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CAMP__CODE_STANAG3596:
				setCodeStanag3596((String)newValue);
				return;
			case SchemaPackage.TYPE_CAMP__SITUATION_PHYSIQUE:
				setSituationPhysique((String)newValue);
				return;
			case SchemaPackage.TYPE_CAMP__TYPE:
				setType((TypeDictionaryDicoCampType)newValue);
				return;
			case SchemaPackage.TYPE_CAMP__NB_PERSONNES_PRESENTES:
				setNbPersonnesPresentes(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CAMP__TYPE_POPULATION:
				setTypePopulation((String)newValue);
				return;
			case SchemaPackage.TYPE_CAMP__NATIONALITE_OCCUPANTS:
				setNationaliteOccupants((TypeDictionaryDicoEntitePolitiqueTrigramme)newValue);
				return;
			case SchemaPackage.TYPE_CAMP__ENFANTS:
				setEnfants(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CAMP__FEMMES:
				setFemmes(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CAMP__CONDITIONS_GENERALES:
				setConditionsGenerales((String)newValue);
				return;
			case SchemaPackage.TYPE_CAMP__ATTITUDE:
				setAttitude((TypeDictionaryDicoComportement)newValue);
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
			case SchemaPackage.TYPE_CAMP__HOMMES:
				unsetHommes();
				return;
			case SchemaPackage.TYPE_CAMP__CODE_STANAG3596:
				setCodeStanag3596(CODE_STANAG3596_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CAMP__SITUATION_PHYSIQUE:
				setSituationPhysique(SITUATION_PHYSIQUE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CAMP__TYPE:
				unsetType();
				return;
			case SchemaPackage.TYPE_CAMP__NB_PERSONNES_PRESENTES:
				unsetNbPersonnesPresentes();
				return;
			case SchemaPackage.TYPE_CAMP__TYPE_POPULATION:
				setTypePopulation(TYPE_POPULATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CAMP__NATIONALITE_OCCUPANTS:
				unsetNationaliteOccupants();
				return;
			case SchemaPackage.TYPE_CAMP__ENFANTS:
				unsetEnfants();
				return;
			case SchemaPackage.TYPE_CAMP__FEMMES:
				unsetFemmes();
				return;
			case SchemaPackage.TYPE_CAMP__CONDITIONS_GENERALES:
				setConditionsGenerales(CONDITIONS_GENERALES_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CAMP__ATTITUDE:
				unsetAttitude();
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
			case SchemaPackage.TYPE_CAMP__HOMMES:
				return isSetHommes();
			case SchemaPackage.TYPE_CAMP__CODE_STANAG3596:
				return CODE_STANAG3596_EDEFAULT == null ? codeStanag3596 != null : !CODE_STANAG3596_EDEFAULT.equals(codeStanag3596);
			case SchemaPackage.TYPE_CAMP__SITUATION_PHYSIQUE:
				return SITUATION_PHYSIQUE_EDEFAULT == null ? situationPhysique != null : !SITUATION_PHYSIQUE_EDEFAULT.equals(situationPhysique);
			case SchemaPackage.TYPE_CAMP__TYPE:
				return isSetType();
			case SchemaPackage.TYPE_CAMP__NB_PERSONNES_PRESENTES:
				return isSetNbPersonnesPresentes();
			case SchemaPackage.TYPE_CAMP__TYPE_POPULATION:
				return TYPE_POPULATION_EDEFAULT == null ? typePopulation != null : !TYPE_POPULATION_EDEFAULT.equals(typePopulation);
			case SchemaPackage.TYPE_CAMP__NATIONALITE_OCCUPANTS:
				return isSetNationaliteOccupants();
			case SchemaPackage.TYPE_CAMP__ENFANTS:
				return isSetEnfants();
			case SchemaPackage.TYPE_CAMP__FEMMES:
				return isSetFemmes();
			case SchemaPackage.TYPE_CAMP__CONDITIONS_GENERALES:
				return CONDITIONS_GENERALES_EDEFAULT == null ? conditionsGenerales != null : !CONDITIONS_GENERALES_EDEFAULT.equals(conditionsGenerales);
			case SchemaPackage.TYPE_CAMP__ATTITUDE:
				return isSetAttitude();
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
		result.append(" (hommes: ");
		if (hommesESet) result.append(hommes); else result.append("<unset>");
		result.append(", codeStanag3596: ");
		result.append(codeStanag3596);
		result.append(", situationPhysique: ");
		result.append(situationPhysique);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", nbPersonnesPresentes: ");
		if (nbPersonnesPresentesESet) result.append(nbPersonnesPresentes); else result.append("<unset>");
		result.append(", typePopulation: ");
		result.append(typePopulation);
		result.append(", nationaliteOccupants: ");
		if (nationaliteOccupantsESet) result.append(nationaliteOccupants); else result.append("<unset>");
		result.append(", enfants: ");
		if (enfantsESet) result.append(enfants); else result.append("<unset>");
		result.append(", femmes: ");
		if (femmesESet) result.append(femmes); else result.append("<unset>");
		result.append(", conditionsGenerales: ");
		result.append(conditionsGenerales);
		result.append(", attitude: ");
		if (attitudeESet) result.append(attitude); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeCampImpl
