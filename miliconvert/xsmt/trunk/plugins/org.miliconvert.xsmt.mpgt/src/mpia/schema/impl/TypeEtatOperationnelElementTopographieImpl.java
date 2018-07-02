/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoPresenceMines;
import mpia.schema.TypeEtatOperationnelElementTopographie;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Etat Operationnel Element Topographie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelElementTopographieImpl#getPresenceMines <em>Presence Mines</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelElementTopographieImpl#isRisqueProjection <em>Risque Projection</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelElementTopographieImpl#getCapaciteRestante <em>Capacite Restante</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypeEtatOperationnelElementTopographieImpl extends TypeEtatOperationnelImpl implements TypeEtatOperationnelElementTopographie {
	/**
	 * The default value of the '{@link #getPresenceMines() <em>Presence Mines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresenceMines()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPresenceMines PRESENCE_MINES_EDEFAULT = TypeDictionaryDicoPresenceMines.NO;

	/**
	 * The cached value of the '{@link #getPresenceMines() <em>Presence Mines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresenceMines()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPresenceMines presenceMines = PRESENCE_MINES_EDEFAULT;

	/**
	 * This is true if the Presence Mines attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean presenceMinesESet;

	/**
	 * The default value of the '{@link #isRisqueProjection() <em>Risque Projection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRisqueProjection()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RISQUE_PROJECTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRisqueProjection() <em>Risque Projection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRisqueProjection()
	 * @generated
	 * @ordered
	 */
	protected boolean risqueProjection = RISQUE_PROJECTION_EDEFAULT;

	/**
	 * This is true if the Risque Projection attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean risqueProjectionESet;

	/**
	 * The default value of the '{@link #getCapaciteRestante() <em>Capacite Restante</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapaciteRestante()
	 * @generated
	 * @ordered
	 */
	protected static final double CAPACITE_RESTANTE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCapaciteRestante() <em>Capacite Restante</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapaciteRestante()
	 * @generated
	 * @ordered
	 */
	protected double capaciteRestante = CAPACITE_RESTANTE_EDEFAULT;

	/**
	 * This is true if the Capacite Restante attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean capaciteRestanteESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEtatOperationnelElementTopographieImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEtatOperationnelElementTopographie();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPresenceMines getPresenceMines() {
		return presenceMines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresenceMines(TypeDictionaryDicoPresenceMines newPresenceMines) {
		TypeDictionaryDicoPresenceMines oldPresenceMines = presenceMines;
		presenceMines = newPresenceMines == null ? PRESENCE_MINES_EDEFAULT : newPresenceMines;
		boolean oldPresenceMinesESet = presenceMinesESet;
		presenceMinesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE__PRESENCE_MINES, oldPresenceMines, presenceMines, !oldPresenceMinesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPresenceMines() {
		TypeDictionaryDicoPresenceMines oldPresenceMines = presenceMines;
		boolean oldPresenceMinesESet = presenceMinesESet;
		presenceMines = PRESENCE_MINES_EDEFAULT;
		presenceMinesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE__PRESENCE_MINES, oldPresenceMines, PRESENCE_MINES_EDEFAULT, oldPresenceMinesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPresenceMines() {
		return presenceMinesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRisqueProjection() {
		return risqueProjection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRisqueProjection(boolean newRisqueProjection) {
		boolean oldRisqueProjection = risqueProjection;
		risqueProjection = newRisqueProjection;
		boolean oldRisqueProjectionESet = risqueProjectionESet;
		risqueProjectionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE__RISQUE_PROJECTION, oldRisqueProjection, risqueProjection, !oldRisqueProjectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRisqueProjection() {
		boolean oldRisqueProjection = risqueProjection;
		boolean oldRisqueProjectionESet = risqueProjectionESet;
		risqueProjection = RISQUE_PROJECTION_EDEFAULT;
		risqueProjectionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE__RISQUE_PROJECTION, oldRisqueProjection, RISQUE_PROJECTION_EDEFAULT, oldRisqueProjectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRisqueProjection() {
		return risqueProjectionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCapaciteRestante() {
		return capaciteRestante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapaciteRestante(double newCapaciteRestante) {
		double oldCapaciteRestante = capaciteRestante;
		capaciteRestante = newCapaciteRestante;
		boolean oldCapaciteRestanteESet = capaciteRestanteESet;
		capaciteRestanteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE__CAPACITE_RESTANTE, oldCapaciteRestante, capaciteRestante, !oldCapaciteRestanteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCapaciteRestante() {
		double oldCapaciteRestante = capaciteRestante;
		boolean oldCapaciteRestanteESet = capaciteRestanteESet;
		capaciteRestante = CAPACITE_RESTANTE_EDEFAULT;
		capaciteRestanteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE__CAPACITE_RESTANTE, oldCapaciteRestante, CAPACITE_RESTANTE_EDEFAULT, oldCapaciteRestanteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCapaciteRestante() {
		return capaciteRestanteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE__PRESENCE_MINES:
				return getPresenceMines();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE__RISQUE_PROJECTION:
				return isRisqueProjection() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE__CAPACITE_RESTANTE:
				return new Double(getCapaciteRestante());
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
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE__PRESENCE_MINES:
				setPresenceMines((TypeDictionaryDicoPresenceMines)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE__RISQUE_PROJECTION:
				setRisqueProjection(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE__CAPACITE_RESTANTE:
				setCapaciteRestante(((Double)newValue).doubleValue());
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
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE__PRESENCE_MINES:
				unsetPresenceMines();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE__RISQUE_PROJECTION:
				unsetRisqueProjection();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE__CAPACITE_RESTANTE:
				unsetCapaciteRestante();
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
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE__PRESENCE_MINES:
				return isSetPresenceMines();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE__RISQUE_PROJECTION:
				return isSetRisqueProjection();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE__CAPACITE_RESTANTE:
				return isSetCapaciteRestante();
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
		result.append(" (presenceMines: ");
		if (presenceMinesESet) result.append(presenceMines); else result.append("<unset>");
		result.append(", risqueProjection: ");
		if (risqueProjectionESet) result.append(risqueProjection); else result.append("<unset>");
		result.append(", capaciteRestante: ");
		if (capaciteRestanteESet) result.append(capaciteRestante); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeEtatOperationnelElementTopographieImpl
