/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoPriorite;
import mpia.schema.TypeMissionI3D;
import mpia.schema.TypeTypeIntervenant3D;
import mpia.schema.TypeTypeMissionI3D;

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
 * An implementation of the model object '<em><b>Type Mission I3D</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMissionI3DImpl#getPriorite <em>Priorite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionI3DImpl#getMesuresParticulieresI3D <em>Mesures Particulieres I3D</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionI3DImpl#getAPourTypeMissionAerienneTypeMissionI3D <em>APour Type Mission Aerienne Type Mission I3D</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionI3DImpl#getAPourZonesCoordinationAutreElementControle <em>APour Zones Coordination Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionI3DImpl#getEstRealiseeParTypeIntervenant3D <em>Est Realisee Par Type Intervenant3 D</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMissionI3DImpl extends TypeMissionImpl implements TypeMissionI3D {
	/**
	 * The default value of the '{@link #getPriorite() <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorite()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPriorite PRIORITE_EDEFAULT = TypeDictionaryDicoPriorite._1;

	/**
	 * The cached value of the '{@link #getPriorite() <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorite()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPriorite priorite = PRIORITE_EDEFAULT;

	/**
	 * This is true if the Priorite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean prioriteESet;

	/**
	 * The default value of the '{@link #getMesuresParticulieresI3D() <em>Mesures Particulieres I3D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMesuresParticulieresI3D()
	 * @generated
	 * @ordered
	 */
	protected static final String MESURES_PARTICULIERES_I3D_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMesuresParticulieresI3D() <em>Mesures Particulieres I3D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMesuresParticulieresI3D()
	 * @generated
	 * @ordered
	 */
	protected String mesuresParticulieresI3D = MESURES_PARTICULIERES_I3D_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAPourTypeMissionAerienneTypeMissionI3D() <em>APour Type Mission Aerienne Type Mission I3D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourTypeMissionAerienneTypeMissionI3D()
	 * @generated
	 * @ordered
	 */
	protected TypeTypeMissionI3D aPourTypeMissionAerienneTypeMissionI3D;

	/**
	 * The cached value of the '{@link #getAPourZonesCoordinationAutreElementControle() <em>APour Zones Coordination Autre Element Controle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourZonesCoordinationAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourZonesCoordinationAutreElementControle;

	/**
	 * The cached value of the '{@link #getEstRealiseeParTypeIntervenant3D() <em>Est Realisee Par Type Intervenant3 D</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstRealiseeParTypeIntervenant3D()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeTypeIntervenant3D> estRealiseeParTypeIntervenant3D;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMissionI3DImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMissionI3D();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPriorite getPriorite() {
		return priorite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriorite(TypeDictionaryDicoPriorite newPriorite) {
		TypeDictionaryDicoPriorite oldPriorite = priorite;
		priorite = newPriorite == null ? PRIORITE_EDEFAULT : newPriorite;
		boolean oldPrioriteESet = prioriteESet;
		prioriteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_I3D__PRIORITE, oldPriorite, priorite, !oldPrioriteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPriorite() {
		TypeDictionaryDicoPriorite oldPriorite = priorite;
		boolean oldPrioriteESet = prioriteESet;
		priorite = PRIORITE_EDEFAULT;
		prioriteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_I3D__PRIORITE, oldPriorite, PRIORITE_EDEFAULT, oldPrioriteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPriorite() {
		return prioriteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMesuresParticulieresI3D() {
		return mesuresParticulieresI3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMesuresParticulieresI3D(String newMesuresParticulieresI3D) {
		String oldMesuresParticulieresI3D = mesuresParticulieresI3D;
		mesuresParticulieresI3D = newMesuresParticulieresI3D;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_I3D__MESURES_PARTICULIERES_I3D, oldMesuresParticulieresI3D, mesuresParticulieresI3D));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeTypeMissionI3D getAPourTypeMissionAerienneTypeMissionI3D() {
		return aPourTypeMissionAerienneTypeMissionI3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourTypeMissionAerienneTypeMissionI3D(TypeTypeMissionI3D newAPourTypeMissionAerienneTypeMissionI3D, NotificationChain msgs) {
		TypeTypeMissionI3D oldAPourTypeMissionAerienneTypeMissionI3D = aPourTypeMissionAerienneTypeMissionI3D;
		aPourTypeMissionAerienneTypeMissionI3D = newAPourTypeMissionAerienneTypeMissionI3D;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_I3D__APOUR_TYPE_MISSION_AERIENNE_TYPE_MISSION_I3D, oldAPourTypeMissionAerienneTypeMissionI3D, newAPourTypeMissionAerienneTypeMissionI3D);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourTypeMissionAerienneTypeMissionI3D(TypeTypeMissionI3D newAPourTypeMissionAerienneTypeMissionI3D) {
		if (newAPourTypeMissionAerienneTypeMissionI3D != aPourTypeMissionAerienneTypeMissionI3D) {
			NotificationChain msgs = null;
			if (aPourTypeMissionAerienneTypeMissionI3D != null)
				msgs = ((InternalEObject)aPourTypeMissionAerienneTypeMissionI3D).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_I3D__APOUR_TYPE_MISSION_AERIENNE_TYPE_MISSION_I3D, null, msgs);
			if (newAPourTypeMissionAerienneTypeMissionI3D != null)
				msgs = ((InternalEObject)newAPourTypeMissionAerienneTypeMissionI3D).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_I3D__APOUR_TYPE_MISSION_AERIENNE_TYPE_MISSION_I3D, null, msgs);
			msgs = basicSetAPourTypeMissionAerienneTypeMissionI3D(newAPourTypeMissionAerienneTypeMissionI3D, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_I3D__APOUR_TYPE_MISSION_AERIENNE_TYPE_MISSION_I3D, newAPourTypeMissionAerienneTypeMissionI3D, newAPourTypeMissionAerienneTypeMissionI3D));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourZonesCoordinationAutreElementControle() {
		if (aPourZonesCoordinationAutreElementControle == null) {
			aPourZonesCoordinationAutreElementControle = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_I3D__APOUR_ZONES_COORDINATION_AUTRE_ELEMENT_CONTROLE);
		}
		return aPourZonesCoordinationAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTypeIntervenant3D> getEstRealiseeParTypeIntervenant3D() {
		if (estRealiseeParTypeIntervenant3D == null) {
			estRealiseeParTypeIntervenant3D = new EObjectContainmentEList<TypeTypeIntervenant3D>(TypeTypeIntervenant3D.class, this, SchemaPackage.TYPE_MISSION_I3D__EST_REALISEE_PAR_TYPE_INTERVENANT3_D);
		}
		return estRealiseeParTypeIntervenant3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MISSION_I3D__APOUR_TYPE_MISSION_AERIENNE_TYPE_MISSION_I3D:
				return basicSetAPourTypeMissionAerienneTypeMissionI3D(null, msgs);
			case SchemaPackage.TYPE_MISSION_I3D__APOUR_ZONES_COORDINATION_AUTRE_ELEMENT_CONTROLE:
				return ((InternalEList<?>)getAPourZonesCoordinationAutreElementControle()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_I3D__EST_REALISEE_PAR_TYPE_INTERVENANT3_D:
				return ((InternalEList<?>)getEstRealiseeParTypeIntervenant3D()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_MISSION_I3D__PRIORITE:
				return getPriorite();
			case SchemaPackage.TYPE_MISSION_I3D__MESURES_PARTICULIERES_I3D:
				return getMesuresParticulieresI3D();
			case SchemaPackage.TYPE_MISSION_I3D__APOUR_TYPE_MISSION_AERIENNE_TYPE_MISSION_I3D:
				return getAPourTypeMissionAerienneTypeMissionI3D();
			case SchemaPackage.TYPE_MISSION_I3D__APOUR_ZONES_COORDINATION_AUTRE_ELEMENT_CONTROLE:
				return getAPourZonesCoordinationAutreElementControle();
			case SchemaPackage.TYPE_MISSION_I3D__EST_REALISEE_PAR_TYPE_INTERVENANT3_D:
				return getEstRealiseeParTypeIntervenant3D();
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
			case SchemaPackage.TYPE_MISSION_I3D__PRIORITE:
				setPriorite((TypeDictionaryDicoPriorite)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_I3D__MESURES_PARTICULIERES_I3D:
				setMesuresParticulieresI3D((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_I3D__APOUR_TYPE_MISSION_AERIENNE_TYPE_MISSION_I3D:
				setAPourTypeMissionAerienneTypeMissionI3D((TypeTypeMissionI3D)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_I3D__APOUR_ZONES_COORDINATION_AUTRE_ELEMENT_CONTROLE:
				getAPourZonesCoordinationAutreElementControle().clear();
				getAPourZonesCoordinationAutreElementControle().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_I3D__EST_REALISEE_PAR_TYPE_INTERVENANT3_D:
				getEstRealiseeParTypeIntervenant3D().clear();
				getEstRealiseeParTypeIntervenant3D().addAll((Collection<? extends TypeTypeIntervenant3D>)newValue);
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
			case SchemaPackage.TYPE_MISSION_I3D__PRIORITE:
				unsetPriorite();
				return;
			case SchemaPackage.TYPE_MISSION_I3D__MESURES_PARTICULIERES_I3D:
				setMesuresParticulieresI3D(MESURES_PARTICULIERES_I3D_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_I3D__APOUR_TYPE_MISSION_AERIENNE_TYPE_MISSION_I3D:
				setAPourTypeMissionAerienneTypeMissionI3D((TypeTypeMissionI3D)null);
				return;
			case SchemaPackage.TYPE_MISSION_I3D__APOUR_ZONES_COORDINATION_AUTRE_ELEMENT_CONTROLE:
				getAPourZonesCoordinationAutreElementControle().clear();
				return;
			case SchemaPackage.TYPE_MISSION_I3D__EST_REALISEE_PAR_TYPE_INTERVENANT3_D:
				getEstRealiseeParTypeIntervenant3D().clear();
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
			case SchemaPackage.TYPE_MISSION_I3D__PRIORITE:
				return isSetPriorite();
			case SchemaPackage.TYPE_MISSION_I3D__MESURES_PARTICULIERES_I3D:
				return MESURES_PARTICULIERES_I3D_EDEFAULT == null ? mesuresParticulieresI3D != null : !MESURES_PARTICULIERES_I3D_EDEFAULT.equals(mesuresParticulieresI3D);
			case SchemaPackage.TYPE_MISSION_I3D__APOUR_TYPE_MISSION_AERIENNE_TYPE_MISSION_I3D:
				return aPourTypeMissionAerienneTypeMissionI3D != null;
			case SchemaPackage.TYPE_MISSION_I3D__APOUR_ZONES_COORDINATION_AUTRE_ELEMENT_CONTROLE:
				return aPourZonesCoordinationAutreElementControle != null && !aPourZonesCoordinationAutreElementControle.isEmpty();
			case SchemaPackage.TYPE_MISSION_I3D__EST_REALISEE_PAR_TYPE_INTERVENANT3_D:
				return estRealiseeParTypeIntervenant3D != null && !estRealiseeParTypeIntervenant3D.isEmpty();
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
		result.append(" (priorite: ");
		if (prioriteESet) result.append(priorite); else result.append("<unset>");
		result.append(", mesuresParticulieresI3D: ");
		result.append(mesuresParticulieresI3D);
		result.append(')');
		return result.toString();
	}

} //TypeMissionI3DImpl
