/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeZoneRisque;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Zone Risque</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeZoneRisqueImpl#getMesuresParticulieres <em>Mesures Particulieres</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZoneRisqueImpl#getNiveauRisque <em>Niveau Risque</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZoneRisqueImpl#getNatureRisque <em>Nature Risque</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeZoneRisqueImpl extends EObjectImpl implements TypeZoneRisque {
	/**
	 * The default value of the '{@link #getMesuresParticulieres() <em>Mesures Particulieres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMesuresParticulieres()
	 * @generated
	 * @ordered
	 */
	protected static final String MESURES_PARTICULIERES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMesuresParticulieres() <em>Mesures Particulieres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMesuresParticulieres()
	 * @generated
	 * @ordered
	 */
	protected String mesuresParticulieres = MESURES_PARTICULIERES_EDEFAULT;

	/**
	 * The default value of the '{@link #getNiveauRisque() <em>Niveau Risque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauRisque()
	 * @generated
	 * @ordered
	 */
	protected static final String NIVEAU_RISQUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNiveauRisque() <em>Niveau Risque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauRisque()
	 * @generated
	 * @ordered
	 */
	protected String niveauRisque = NIVEAU_RISQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNatureRisque() <em>Nature Risque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatureRisque()
	 * @generated
	 * @ordered
	 */
	protected static final String NATURE_RISQUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNatureRisque() <em>Nature Risque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatureRisque()
	 * @generated
	 * @ordered
	 */
	protected String natureRisque = NATURE_RISQUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeZoneRisqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeZoneRisque();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMesuresParticulieres() {
		return mesuresParticulieres;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMesuresParticulieres(String newMesuresParticulieres) {
		String oldMesuresParticulieres = mesuresParticulieres;
		mesuresParticulieres = newMesuresParticulieres;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_RISQUE__MESURES_PARTICULIERES, oldMesuresParticulieres, mesuresParticulieres));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNiveauRisque() {
		return niveauRisque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNiveauRisque(String newNiveauRisque) {
		String oldNiveauRisque = niveauRisque;
		niveauRisque = newNiveauRisque;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_RISQUE__NIVEAU_RISQUE, oldNiveauRisque, niveauRisque));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNatureRisque() {
		return natureRisque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNatureRisque(String newNatureRisque) {
		String oldNatureRisque = natureRisque;
		natureRisque = newNatureRisque;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_RISQUE__NATURE_RISQUE, oldNatureRisque, natureRisque));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_ZONE_RISQUE__MESURES_PARTICULIERES:
				return getMesuresParticulieres();
			case SchemaPackage.TYPE_ZONE_RISQUE__NIVEAU_RISQUE:
				return getNiveauRisque();
			case SchemaPackage.TYPE_ZONE_RISQUE__NATURE_RISQUE:
				return getNatureRisque();
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
			case SchemaPackage.TYPE_ZONE_RISQUE__MESURES_PARTICULIERES:
				setMesuresParticulieres((String)newValue);
				return;
			case SchemaPackage.TYPE_ZONE_RISQUE__NIVEAU_RISQUE:
				setNiveauRisque((String)newValue);
				return;
			case SchemaPackage.TYPE_ZONE_RISQUE__NATURE_RISQUE:
				setNatureRisque((String)newValue);
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
			case SchemaPackage.TYPE_ZONE_RISQUE__MESURES_PARTICULIERES:
				setMesuresParticulieres(MESURES_PARTICULIERES_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ZONE_RISQUE__NIVEAU_RISQUE:
				setNiveauRisque(NIVEAU_RISQUE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ZONE_RISQUE__NATURE_RISQUE:
				setNatureRisque(NATURE_RISQUE_EDEFAULT);
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
			case SchemaPackage.TYPE_ZONE_RISQUE__MESURES_PARTICULIERES:
				return MESURES_PARTICULIERES_EDEFAULT == null ? mesuresParticulieres != null : !MESURES_PARTICULIERES_EDEFAULT.equals(mesuresParticulieres);
			case SchemaPackage.TYPE_ZONE_RISQUE__NIVEAU_RISQUE:
				return NIVEAU_RISQUE_EDEFAULT == null ? niveauRisque != null : !NIVEAU_RISQUE_EDEFAULT.equals(niveauRisque);
			case SchemaPackage.TYPE_ZONE_RISQUE__NATURE_RISQUE:
				return NATURE_RISQUE_EDEFAULT == null ? natureRisque != null : !NATURE_RISQUE_EDEFAULT.equals(natureRisque);
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
		result.append(" (mesuresParticulieres: ");
		result.append(mesuresParticulieres);
		result.append(", niveauRisque: ");
		result.append(niveauRisque);
		result.append(", natureRisque: ");
		result.append(natureRisque);
		result.append(')');
		return result.toString();
	}

} //TypeZoneRisqueImpl
