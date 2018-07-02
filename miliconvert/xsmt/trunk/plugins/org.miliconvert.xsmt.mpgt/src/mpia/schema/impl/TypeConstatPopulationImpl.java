/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeConstatPopulation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Constat Population</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeConstatPopulationImpl#isPresencePopulation <em>Presence Population</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConstatPopulationImpl#isPopulationDeplacement <em>Population Deplacement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConstatPopulationImpl#isPopulationRegroupee <em>Population Regroupee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConstatPopulationImpl#getItineraireEmprunte <em>Itineraire Emprunte</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeConstatPopulationImpl extends EObjectImpl implements TypeConstatPopulation {
	/**
	 * The default value of the '{@link #isPresencePopulation() <em>Presence Population</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPresencePopulation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRESENCE_POPULATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPresencePopulation() <em>Presence Population</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPresencePopulation()
	 * @generated
	 * @ordered
	 */
	protected boolean presencePopulation = PRESENCE_POPULATION_EDEFAULT;

	/**
	 * This is true if the Presence Population attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean presencePopulationESet;

	/**
	 * The default value of the '{@link #isPopulationDeplacement() <em>Population Deplacement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPopulationDeplacement()
	 * @generated
	 * @ordered
	 */
	protected static final boolean POPULATION_DEPLACEMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPopulationDeplacement() <em>Population Deplacement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPopulationDeplacement()
	 * @generated
	 * @ordered
	 */
	protected boolean populationDeplacement = POPULATION_DEPLACEMENT_EDEFAULT;

	/**
	 * This is true if the Population Deplacement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean populationDeplacementESet;

	/**
	 * The default value of the '{@link #isPopulationRegroupee() <em>Population Regroupee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPopulationRegroupee()
	 * @generated
	 * @ordered
	 */
	protected static final boolean POPULATION_REGROUPEE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPopulationRegroupee() <em>Population Regroupee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPopulationRegroupee()
	 * @generated
	 * @ordered
	 */
	protected boolean populationRegroupee = POPULATION_REGROUPEE_EDEFAULT;

	/**
	 * This is true if the Population Regroupee attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean populationRegroupeeESet;

	/**
	 * The default value of the '{@link #getItineraireEmprunte() <em>Itineraire Emprunte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItineraireEmprunte()
	 * @generated
	 * @ordered
	 */
	protected static final String ITINERAIRE_EMPRUNTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getItineraireEmprunte() <em>Itineraire Emprunte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItineraireEmprunte()
	 * @generated
	 * @ordered
	 */
	protected String itineraireEmprunte = ITINERAIRE_EMPRUNTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeConstatPopulationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeConstatPopulation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPresencePopulation() {
		return presencePopulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresencePopulation(boolean newPresencePopulation) {
		boolean oldPresencePopulation = presencePopulation;
		presencePopulation = newPresencePopulation;
		boolean oldPresencePopulationESet = presencePopulationESet;
		presencePopulationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSTAT_POPULATION__PRESENCE_POPULATION, oldPresencePopulation, presencePopulation, !oldPresencePopulationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPresencePopulation() {
		boolean oldPresencePopulation = presencePopulation;
		boolean oldPresencePopulationESet = presencePopulationESet;
		presencePopulation = PRESENCE_POPULATION_EDEFAULT;
		presencePopulationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CONSTAT_POPULATION__PRESENCE_POPULATION, oldPresencePopulation, PRESENCE_POPULATION_EDEFAULT, oldPresencePopulationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPresencePopulation() {
		return presencePopulationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPopulationDeplacement() {
		return populationDeplacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPopulationDeplacement(boolean newPopulationDeplacement) {
		boolean oldPopulationDeplacement = populationDeplacement;
		populationDeplacement = newPopulationDeplacement;
		boolean oldPopulationDeplacementESet = populationDeplacementESet;
		populationDeplacementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSTAT_POPULATION__POPULATION_DEPLACEMENT, oldPopulationDeplacement, populationDeplacement, !oldPopulationDeplacementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPopulationDeplacement() {
		boolean oldPopulationDeplacement = populationDeplacement;
		boolean oldPopulationDeplacementESet = populationDeplacementESet;
		populationDeplacement = POPULATION_DEPLACEMENT_EDEFAULT;
		populationDeplacementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CONSTAT_POPULATION__POPULATION_DEPLACEMENT, oldPopulationDeplacement, POPULATION_DEPLACEMENT_EDEFAULT, oldPopulationDeplacementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPopulationDeplacement() {
		return populationDeplacementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPopulationRegroupee() {
		return populationRegroupee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPopulationRegroupee(boolean newPopulationRegroupee) {
		boolean oldPopulationRegroupee = populationRegroupee;
		populationRegroupee = newPopulationRegroupee;
		boolean oldPopulationRegroupeeESet = populationRegroupeeESet;
		populationRegroupeeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSTAT_POPULATION__POPULATION_REGROUPEE, oldPopulationRegroupee, populationRegroupee, !oldPopulationRegroupeeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPopulationRegroupee() {
		boolean oldPopulationRegroupee = populationRegroupee;
		boolean oldPopulationRegroupeeESet = populationRegroupeeESet;
		populationRegroupee = POPULATION_REGROUPEE_EDEFAULT;
		populationRegroupeeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CONSTAT_POPULATION__POPULATION_REGROUPEE, oldPopulationRegroupee, POPULATION_REGROUPEE_EDEFAULT, oldPopulationRegroupeeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPopulationRegroupee() {
		return populationRegroupeeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getItineraireEmprunte() {
		return itineraireEmprunte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItineraireEmprunte(String newItineraireEmprunte) {
		String oldItineraireEmprunte = itineraireEmprunte;
		itineraireEmprunte = newItineraireEmprunte;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSTAT_POPULATION__ITINERAIRE_EMPRUNTE, oldItineraireEmprunte, itineraireEmprunte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_CONSTAT_POPULATION__PRESENCE_POPULATION:
				return isPresencePopulation() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_CONSTAT_POPULATION__POPULATION_DEPLACEMENT:
				return isPopulationDeplacement() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_CONSTAT_POPULATION__POPULATION_REGROUPEE:
				return isPopulationRegroupee() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_CONSTAT_POPULATION__ITINERAIRE_EMPRUNTE:
				return getItineraireEmprunte();
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
			case SchemaPackage.TYPE_CONSTAT_POPULATION__PRESENCE_POPULATION:
				setPresencePopulation(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_CONSTAT_POPULATION__POPULATION_DEPLACEMENT:
				setPopulationDeplacement(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_CONSTAT_POPULATION__POPULATION_REGROUPEE:
				setPopulationRegroupee(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_CONSTAT_POPULATION__ITINERAIRE_EMPRUNTE:
				setItineraireEmprunte((String)newValue);
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
			case SchemaPackage.TYPE_CONSTAT_POPULATION__PRESENCE_POPULATION:
				unsetPresencePopulation();
				return;
			case SchemaPackage.TYPE_CONSTAT_POPULATION__POPULATION_DEPLACEMENT:
				unsetPopulationDeplacement();
				return;
			case SchemaPackage.TYPE_CONSTAT_POPULATION__POPULATION_REGROUPEE:
				unsetPopulationRegroupee();
				return;
			case SchemaPackage.TYPE_CONSTAT_POPULATION__ITINERAIRE_EMPRUNTE:
				setItineraireEmprunte(ITINERAIRE_EMPRUNTE_EDEFAULT);
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
			case SchemaPackage.TYPE_CONSTAT_POPULATION__PRESENCE_POPULATION:
				return isSetPresencePopulation();
			case SchemaPackage.TYPE_CONSTAT_POPULATION__POPULATION_DEPLACEMENT:
				return isSetPopulationDeplacement();
			case SchemaPackage.TYPE_CONSTAT_POPULATION__POPULATION_REGROUPEE:
				return isSetPopulationRegroupee();
			case SchemaPackage.TYPE_CONSTAT_POPULATION__ITINERAIRE_EMPRUNTE:
				return ITINERAIRE_EMPRUNTE_EDEFAULT == null ? itineraireEmprunte != null : !ITINERAIRE_EMPRUNTE_EDEFAULT.equals(itineraireEmprunte);
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
		result.append(" (presencePopulation: ");
		if (presencePopulationESet) result.append(presencePopulation); else result.append("<unset>");
		result.append(", populationDeplacement: ");
		if (populationDeplacementESet) result.append(populationDeplacement); else result.append("<unset>");
		result.append(", populationRegroupee: ");
		if (populationRegroupeeESet) result.append(populationRegroupee); else result.append("<unset>");
		result.append(", itineraireEmprunte: ");
		result.append(itineraireEmprunte);
		result.append(')');
		return result.toString();
	}

} //TypeConstatPopulationImpl
