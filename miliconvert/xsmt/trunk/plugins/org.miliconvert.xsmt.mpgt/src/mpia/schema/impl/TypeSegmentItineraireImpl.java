/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoMobilite;
import mpia.schema.TypeDictionaryDicoMoyenTransport;
import mpia.schema.TypeSegmentItineraire;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Segment Itineraire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeSegmentItineraireImpl#getMoyenTransport <em>Moyen Transport</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSegmentItineraireImpl#getMobilite <em>Mobilite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypeSegmentItineraireImpl extends TypeElementControleImpl implements TypeSegmentItineraire {
	/**
	 * The default value of the '{@link #getMoyenTransport() <em>Moyen Transport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyenTransport()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMoyenTransport MOYEN_TRANSPORT_EDEFAULT = TypeDictionaryDicoMoyenTransport.AIR;

	/**
	 * The cached value of the '{@link #getMoyenTransport() <em>Moyen Transport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyenTransport()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMoyenTransport moyenTransport = MOYEN_TRANSPORT_EDEFAULT;

	/**
	 * This is true if the Moyen Transport attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean moyenTransportESet;

	/**
	 * The default value of the '{@link #getMobilite() <em>Mobilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMobilite()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMobilite MOBILITE_EDEFAULT = TypeDictionaryDicoMobilite.FOOT;

	/**
	 * The cached value of the '{@link #getMobilite() <em>Mobilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMobilite()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMobilite mobilite = MOBILITE_EDEFAULT;

	/**
	 * This is true if the Mobilite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mobiliteESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeSegmentItineraireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeSegmentItineraire();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMoyenTransport getMoyenTransport() {
		return moyenTransport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoyenTransport(TypeDictionaryDicoMoyenTransport newMoyenTransport) {
		TypeDictionaryDicoMoyenTransport oldMoyenTransport = moyenTransport;
		moyenTransport = newMoyenTransport == null ? MOYEN_TRANSPORT_EDEFAULT : newMoyenTransport;
		boolean oldMoyenTransportESet = moyenTransportESet;
		moyenTransportESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SEGMENT_ITINERAIRE__MOYEN_TRANSPORT, oldMoyenTransport, moyenTransport, !oldMoyenTransportESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMoyenTransport() {
		TypeDictionaryDicoMoyenTransport oldMoyenTransport = moyenTransport;
		boolean oldMoyenTransportESet = moyenTransportESet;
		moyenTransport = MOYEN_TRANSPORT_EDEFAULT;
		moyenTransportESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SEGMENT_ITINERAIRE__MOYEN_TRANSPORT, oldMoyenTransport, MOYEN_TRANSPORT_EDEFAULT, oldMoyenTransportESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMoyenTransport() {
		return moyenTransportESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMobilite getMobilite() {
		return mobilite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMobilite(TypeDictionaryDicoMobilite newMobilite) {
		TypeDictionaryDicoMobilite oldMobilite = mobilite;
		mobilite = newMobilite == null ? MOBILITE_EDEFAULT : newMobilite;
		boolean oldMobiliteESet = mobiliteESet;
		mobiliteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SEGMENT_ITINERAIRE__MOBILITE, oldMobilite, mobilite, !oldMobiliteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMobilite() {
		TypeDictionaryDicoMobilite oldMobilite = mobilite;
		boolean oldMobiliteESet = mobiliteESet;
		mobilite = MOBILITE_EDEFAULT;
		mobiliteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SEGMENT_ITINERAIRE__MOBILITE, oldMobilite, MOBILITE_EDEFAULT, oldMobiliteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMobilite() {
		return mobiliteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_SEGMENT_ITINERAIRE__MOYEN_TRANSPORT:
				return getMoyenTransport();
			case SchemaPackage.TYPE_SEGMENT_ITINERAIRE__MOBILITE:
				return getMobilite();
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
			case SchemaPackage.TYPE_SEGMENT_ITINERAIRE__MOYEN_TRANSPORT:
				setMoyenTransport((TypeDictionaryDicoMoyenTransport)newValue);
				return;
			case SchemaPackage.TYPE_SEGMENT_ITINERAIRE__MOBILITE:
				setMobilite((TypeDictionaryDicoMobilite)newValue);
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
			case SchemaPackage.TYPE_SEGMENT_ITINERAIRE__MOYEN_TRANSPORT:
				unsetMoyenTransport();
				return;
			case SchemaPackage.TYPE_SEGMENT_ITINERAIRE__MOBILITE:
				unsetMobilite();
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
			case SchemaPackage.TYPE_SEGMENT_ITINERAIRE__MOYEN_TRANSPORT:
				return isSetMoyenTransport();
			case SchemaPackage.TYPE_SEGMENT_ITINERAIRE__MOBILITE:
				return isSetMobilite();
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
		result.append(" (moyenTransport: ");
		if (moyenTransportESet) result.append(moyenTransport); else result.append("<unset>");
		result.append(", mobilite: ");
		if (mobiliteESet) result.append(mobilite); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeSegmentItineraireImpl
