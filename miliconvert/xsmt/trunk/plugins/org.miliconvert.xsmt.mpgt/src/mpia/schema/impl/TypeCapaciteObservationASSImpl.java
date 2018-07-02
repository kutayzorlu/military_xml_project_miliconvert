/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCapaciteObservationASS;
import mpia.schema.TypeDictionaryDicoTypeMoyenAcquisitionASS;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Capacite Observation ASS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCapaciteObservationASSImpl#getTypeMoyenAcquisition <em>Type Moyen Acquisition</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteObservationASSImpl#getNombreEquipesEngagees <em>Nombre Equipes Engagees</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteObservationASSImpl#getNombreEquipesDisponibles <em>Nombre Equipes Disponibles</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteObservationASSImpl#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteObservationASSImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteObservationASSImpl#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCapaciteObservationASSImpl extends EObjectImpl implements TypeCapaciteObservationASS {
	/**
	 * The default value of the '{@link #getTypeMoyenAcquisition() <em>Type Moyen Acquisition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMoyenAcquisition()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeMoyenAcquisitionASS TYPE_MOYEN_ACQUISITION_EDEFAULT = TypeDictionaryDicoTypeMoyenAcquisitionASS.FIST;

	/**
	 * The cached value of the '{@link #getTypeMoyenAcquisition() <em>Type Moyen Acquisition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMoyenAcquisition()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeMoyenAcquisitionASS typeMoyenAcquisition = TYPE_MOYEN_ACQUISITION_EDEFAULT;

	/**
	 * This is true if the Type Moyen Acquisition attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeMoyenAcquisitionESet;

	/**
	 * The default value of the '{@link #getNombreEquipesEngagees() <em>Nombre Equipes Engagees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreEquipesEngagees()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_EQUIPES_ENGAGEES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreEquipesEngagees() <em>Nombre Equipes Engagees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreEquipesEngagees()
	 * @generated
	 * @ordered
	 */
	protected long nombreEquipesEngagees = NOMBRE_EQUIPES_ENGAGEES_EDEFAULT;

	/**
	 * This is true if the Nombre Equipes Engagees attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreEquipesEngageesESet;

	/**
	 * The default value of the '{@link #getNombreEquipesDisponibles() <em>Nombre Equipes Disponibles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreEquipesDisponibles()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_EQUIPES_DISPONIBLES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreEquipesDisponibles() <em>Nombre Equipes Disponibles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreEquipesDisponibles()
	 * @generated
	 * @ordered
	 */
	protected long nombreEquipesDisponibles = NOMBRE_EQUIPES_DISPONIBLES_EDEFAULT;

	/**
	 * This is true if the Nombre Equipes Disponibles attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreEquipesDisponiblesESet;

	/**
	 * The default value of the '{@link #getCommentaire() <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaire()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTAIRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommentaire() <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaire()
	 * @generated
	 * @ordered
	 */
	protected String commentaire = COMMENTAIRE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCapaciteObservationASSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCapaciteObservationASS();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeMoyenAcquisitionASS getTypeMoyenAcquisition() {
		return typeMoyenAcquisition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeMoyenAcquisition(TypeDictionaryDicoTypeMoyenAcquisitionASS newTypeMoyenAcquisition) {
		TypeDictionaryDicoTypeMoyenAcquisitionASS oldTypeMoyenAcquisition = typeMoyenAcquisition;
		typeMoyenAcquisition = newTypeMoyenAcquisition == null ? TYPE_MOYEN_ACQUISITION_EDEFAULT : newTypeMoyenAcquisition;
		boolean oldTypeMoyenAcquisitionESet = typeMoyenAcquisitionESet;
		typeMoyenAcquisitionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_OBSERVATION_ASS__TYPE_MOYEN_ACQUISITION, oldTypeMoyenAcquisition, typeMoyenAcquisition, !oldTypeMoyenAcquisitionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeMoyenAcquisition() {
		TypeDictionaryDicoTypeMoyenAcquisitionASS oldTypeMoyenAcquisition = typeMoyenAcquisition;
		boolean oldTypeMoyenAcquisitionESet = typeMoyenAcquisitionESet;
		typeMoyenAcquisition = TYPE_MOYEN_ACQUISITION_EDEFAULT;
		typeMoyenAcquisitionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPACITE_OBSERVATION_ASS__TYPE_MOYEN_ACQUISITION, oldTypeMoyenAcquisition, TYPE_MOYEN_ACQUISITION_EDEFAULT, oldTypeMoyenAcquisitionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeMoyenAcquisition() {
		return typeMoyenAcquisitionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreEquipesEngagees() {
		return nombreEquipesEngagees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreEquipesEngagees(long newNombreEquipesEngagees) {
		long oldNombreEquipesEngagees = nombreEquipesEngagees;
		nombreEquipesEngagees = newNombreEquipesEngagees;
		boolean oldNombreEquipesEngageesESet = nombreEquipesEngageesESet;
		nombreEquipesEngageesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_OBSERVATION_ASS__NOMBRE_EQUIPES_ENGAGEES, oldNombreEquipesEngagees, nombreEquipesEngagees, !oldNombreEquipesEngageesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreEquipesEngagees() {
		long oldNombreEquipesEngagees = nombreEquipesEngagees;
		boolean oldNombreEquipesEngageesESet = nombreEquipesEngageesESet;
		nombreEquipesEngagees = NOMBRE_EQUIPES_ENGAGEES_EDEFAULT;
		nombreEquipesEngageesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPACITE_OBSERVATION_ASS__NOMBRE_EQUIPES_ENGAGEES, oldNombreEquipesEngagees, NOMBRE_EQUIPES_ENGAGEES_EDEFAULT, oldNombreEquipesEngageesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreEquipesEngagees() {
		return nombreEquipesEngageesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreEquipesDisponibles() {
		return nombreEquipesDisponibles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreEquipesDisponibles(long newNombreEquipesDisponibles) {
		long oldNombreEquipesDisponibles = nombreEquipesDisponibles;
		nombreEquipesDisponibles = newNombreEquipesDisponibles;
		boolean oldNombreEquipesDisponiblesESet = nombreEquipesDisponiblesESet;
		nombreEquipesDisponiblesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_OBSERVATION_ASS__NOMBRE_EQUIPES_DISPONIBLES, oldNombreEquipesDisponibles, nombreEquipesDisponibles, !oldNombreEquipesDisponiblesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreEquipesDisponibles() {
		long oldNombreEquipesDisponibles = nombreEquipesDisponibles;
		boolean oldNombreEquipesDisponiblesESet = nombreEquipesDisponiblesESet;
		nombreEquipesDisponibles = NOMBRE_EQUIPES_DISPONIBLES_EDEFAULT;
		nombreEquipesDisponiblesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPACITE_OBSERVATION_ASS__NOMBRE_EQUIPES_DISPONIBLES, oldNombreEquipesDisponibles, NOMBRE_EQUIPES_DISPONIBLES_EDEFAULT, oldNombreEquipesDisponiblesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreEquipesDisponibles() {
		return nombreEquipesDisponiblesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommentaire() {
		return commentaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentaire(String newCommentaire) {
		String oldCommentaire = commentaire;
		commentaire = newCommentaire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_OBSERVATION_ASS__COMMENTAIRE, oldCommentaire, commentaire));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_OBSERVATION_ASS__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_OBSERVATION_ASS__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_CAPACITE_OBSERVATION_ASS__TYPE_MOYEN_ACQUISITION:
				return getTypeMoyenAcquisition();
			case SchemaPackage.TYPE_CAPACITE_OBSERVATION_ASS__NOMBRE_EQUIPES_ENGAGEES:
				return new Long(getNombreEquipesEngagees());
			case SchemaPackage.TYPE_CAPACITE_OBSERVATION_ASS__NOMBRE_EQUIPES_DISPONIBLES:
				return new Long(getNombreEquipesDisponibles());
			case SchemaPackage.TYPE_CAPACITE_OBSERVATION_ASS__COMMENTAIRE:
				return getCommentaire();
			case SchemaPackage.TYPE_CAPACITE_OBSERVATION_ASS__CTE:
				return getCTE();
			case SchemaPackage.TYPE_CAPACITE_OBSERVATION_ASS__CE:
				return getCE();
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
			case SchemaPackage.TYPE_CAPACITE_OBSERVATION_ASS__TYPE_MOYEN_ACQUISITION:
				setTypeMoyenAcquisition((TypeDictionaryDicoTypeMoyenAcquisitionASS)newValue);
				return;
			case SchemaPackage.TYPE_CAPACITE_OBSERVATION_ASS__NOMBRE_EQUIPES_ENGAGEES:
				setNombreEquipesEngagees(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CAPACITE_OBSERVATION_ASS__NOMBRE_EQUIPES_DISPONIBLES:
				setNombreEquipesDisponibles(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CAPACITE_OBSERVATION_ASS__COMMENTAIRE:
				setCommentaire((String)newValue);
				return;
			case SchemaPackage.TYPE_CAPACITE_OBSERVATION_ASS__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_CAPACITE_OBSERVATION_ASS__CE:
				setCE((String)newValue);
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
			case SchemaPackage.TYPE_CAPACITE_OBSERVATION_ASS__TYPE_MOYEN_ACQUISITION:
				unsetTypeMoyenAcquisition();
				return;
			case SchemaPackage.TYPE_CAPACITE_OBSERVATION_ASS__NOMBRE_EQUIPES_ENGAGEES:
				unsetNombreEquipesEngagees();
				return;
			case SchemaPackage.TYPE_CAPACITE_OBSERVATION_ASS__NOMBRE_EQUIPES_DISPONIBLES:
				unsetNombreEquipesDisponibles();
				return;
			case SchemaPackage.TYPE_CAPACITE_OBSERVATION_ASS__COMMENTAIRE:
				setCommentaire(COMMENTAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CAPACITE_OBSERVATION_ASS__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CAPACITE_OBSERVATION_ASS__CE:
				setCE(CE_EDEFAULT);
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
			case SchemaPackage.TYPE_CAPACITE_OBSERVATION_ASS__TYPE_MOYEN_ACQUISITION:
				return isSetTypeMoyenAcquisition();
			case SchemaPackage.TYPE_CAPACITE_OBSERVATION_ASS__NOMBRE_EQUIPES_ENGAGEES:
				return isSetNombreEquipesEngagees();
			case SchemaPackage.TYPE_CAPACITE_OBSERVATION_ASS__NOMBRE_EQUIPES_DISPONIBLES:
				return isSetNombreEquipesDisponibles();
			case SchemaPackage.TYPE_CAPACITE_OBSERVATION_ASS__COMMENTAIRE:
				return COMMENTAIRE_EDEFAULT == null ? commentaire != null : !COMMENTAIRE_EDEFAULT.equals(commentaire);
			case SchemaPackage.TYPE_CAPACITE_OBSERVATION_ASS__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_CAPACITE_OBSERVATION_ASS__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
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
		result.append(" (typeMoyenAcquisition: ");
		if (typeMoyenAcquisitionESet) result.append(typeMoyenAcquisition); else result.append("<unset>");
		result.append(", nombreEquipesEngagees: ");
		if (nombreEquipesEngageesESet) result.append(nombreEquipesEngagees); else result.append("<unset>");
		result.append(", nombreEquipesDisponibles: ");
		if (nombreEquipesDisponiblesESet) result.append(nombreEquipesDisponibles); else result.append("<unset>");
		result.append(", commentaire: ");
		result.append(commentaire);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeCapaciteObservationASSImpl
