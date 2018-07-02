/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCentreNC23;
import mpia.schema.TypeDictionaryDicoModeFonctionnement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Centre NC23</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCentreNC23Impl#isResponsabiliteLiaisonAvecCentreAir <em>Responsabilite Liaison Avec Centre Air</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCentreNC23Impl#getModeFonctionnement <em>Mode Fonctionnement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCentreNC23Impl#getAutreModeFonctionnement <em>Autre Mode Fonctionnement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCentreNC23Impl#getConsignesParticulieres <em>Consignes Particulieres</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCentreNC23Impl extends EObjectImpl implements TypeCentreNC23 {
	/**
	 * The default value of the '{@link #isResponsabiliteLiaisonAvecCentreAir() <em>Responsabilite Liaison Avec Centre Air</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResponsabiliteLiaisonAvecCentreAir()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESPONSABILITE_LIAISON_AVEC_CENTRE_AIR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isResponsabiliteLiaisonAvecCentreAir() <em>Responsabilite Liaison Avec Centre Air</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResponsabiliteLiaisonAvecCentreAir()
	 * @generated
	 * @ordered
	 */
	protected boolean responsabiliteLiaisonAvecCentreAir = RESPONSABILITE_LIAISON_AVEC_CENTRE_AIR_EDEFAULT;

	/**
	 * This is true if the Responsabilite Liaison Avec Centre Air attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean responsabiliteLiaisonAvecCentreAirESet;

	/**
	 * The default value of the '{@link #getModeFonctionnement() <em>Mode Fonctionnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeFonctionnement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoModeFonctionnement MODE_FONCTIONNEMENT_EDEFAULT = TypeDictionaryDicoModeFonctionnement.ACTIVE;

	/**
	 * The cached value of the '{@link #getModeFonctionnement() <em>Mode Fonctionnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeFonctionnement()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoModeFonctionnement modeFonctionnement = MODE_FONCTIONNEMENT_EDEFAULT;

	/**
	 * This is true if the Mode Fonctionnement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean modeFonctionnementESet;

	/**
	 * The default value of the '{@link #getAutreModeFonctionnement() <em>Autre Mode Fonctionnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreModeFonctionnement()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTRE_MODE_FONCTIONNEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutreModeFonctionnement() <em>Autre Mode Fonctionnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreModeFonctionnement()
	 * @generated
	 * @ordered
	 */
	protected String autreModeFonctionnement = AUTRE_MODE_FONCTIONNEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getConsignesParticulieres() <em>Consignes Particulieres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsignesParticulieres()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSIGNES_PARTICULIERES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsignesParticulieres() <em>Consignes Particulieres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsignesParticulieres()
	 * @generated
	 * @ordered
	 */
	protected String consignesParticulieres = CONSIGNES_PARTICULIERES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCentreNC23Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCentreNC23();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isResponsabiliteLiaisonAvecCentreAir() {
		return responsabiliteLiaisonAvecCentreAir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsabiliteLiaisonAvecCentreAir(boolean newResponsabiliteLiaisonAvecCentreAir) {
		boolean oldResponsabiliteLiaisonAvecCentreAir = responsabiliteLiaisonAvecCentreAir;
		responsabiliteLiaisonAvecCentreAir = newResponsabiliteLiaisonAvecCentreAir;
		boolean oldResponsabiliteLiaisonAvecCentreAirESet = responsabiliteLiaisonAvecCentreAirESet;
		responsabiliteLiaisonAvecCentreAirESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CENTRE_NC23__RESPONSABILITE_LIAISON_AVEC_CENTRE_AIR, oldResponsabiliteLiaisonAvecCentreAir, responsabiliteLiaisonAvecCentreAir, !oldResponsabiliteLiaisonAvecCentreAirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetResponsabiliteLiaisonAvecCentreAir() {
		boolean oldResponsabiliteLiaisonAvecCentreAir = responsabiliteLiaisonAvecCentreAir;
		boolean oldResponsabiliteLiaisonAvecCentreAirESet = responsabiliteLiaisonAvecCentreAirESet;
		responsabiliteLiaisonAvecCentreAir = RESPONSABILITE_LIAISON_AVEC_CENTRE_AIR_EDEFAULT;
		responsabiliteLiaisonAvecCentreAirESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CENTRE_NC23__RESPONSABILITE_LIAISON_AVEC_CENTRE_AIR, oldResponsabiliteLiaisonAvecCentreAir, RESPONSABILITE_LIAISON_AVEC_CENTRE_AIR_EDEFAULT, oldResponsabiliteLiaisonAvecCentreAirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetResponsabiliteLiaisonAvecCentreAir() {
		return responsabiliteLiaisonAvecCentreAirESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoModeFonctionnement getModeFonctionnement() {
		return modeFonctionnement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModeFonctionnement(TypeDictionaryDicoModeFonctionnement newModeFonctionnement) {
		TypeDictionaryDicoModeFonctionnement oldModeFonctionnement = modeFonctionnement;
		modeFonctionnement = newModeFonctionnement == null ? MODE_FONCTIONNEMENT_EDEFAULT : newModeFonctionnement;
		boolean oldModeFonctionnementESet = modeFonctionnementESet;
		modeFonctionnementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CENTRE_NC23__MODE_FONCTIONNEMENT, oldModeFonctionnement, modeFonctionnement, !oldModeFonctionnementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetModeFonctionnement() {
		TypeDictionaryDicoModeFonctionnement oldModeFonctionnement = modeFonctionnement;
		boolean oldModeFonctionnementESet = modeFonctionnementESet;
		modeFonctionnement = MODE_FONCTIONNEMENT_EDEFAULT;
		modeFonctionnementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CENTRE_NC23__MODE_FONCTIONNEMENT, oldModeFonctionnement, MODE_FONCTIONNEMENT_EDEFAULT, oldModeFonctionnementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetModeFonctionnement() {
		return modeFonctionnementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutreModeFonctionnement() {
		return autreModeFonctionnement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutreModeFonctionnement(String newAutreModeFonctionnement) {
		String oldAutreModeFonctionnement = autreModeFonctionnement;
		autreModeFonctionnement = newAutreModeFonctionnement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CENTRE_NC23__AUTRE_MODE_FONCTIONNEMENT, oldAutreModeFonctionnement, autreModeFonctionnement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConsignesParticulieres() {
		return consignesParticulieres;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsignesParticulieres(String newConsignesParticulieres) {
		String oldConsignesParticulieres = consignesParticulieres;
		consignesParticulieres = newConsignesParticulieres;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CENTRE_NC23__CONSIGNES_PARTICULIERES, oldConsignesParticulieres, consignesParticulieres));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_CENTRE_NC23__RESPONSABILITE_LIAISON_AVEC_CENTRE_AIR:
				return isResponsabiliteLiaisonAvecCentreAir() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_CENTRE_NC23__MODE_FONCTIONNEMENT:
				return getModeFonctionnement();
			case SchemaPackage.TYPE_CENTRE_NC23__AUTRE_MODE_FONCTIONNEMENT:
				return getAutreModeFonctionnement();
			case SchemaPackage.TYPE_CENTRE_NC23__CONSIGNES_PARTICULIERES:
				return getConsignesParticulieres();
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
			case SchemaPackage.TYPE_CENTRE_NC23__RESPONSABILITE_LIAISON_AVEC_CENTRE_AIR:
				setResponsabiliteLiaisonAvecCentreAir(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_CENTRE_NC23__MODE_FONCTIONNEMENT:
				setModeFonctionnement((TypeDictionaryDicoModeFonctionnement)newValue);
				return;
			case SchemaPackage.TYPE_CENTRE_NC23__AUTRE_MODE_FONCTIONNEMENT:
				setAutreModeFonctionnement((String)newValue);
				return;
			case SchemaPackage.TYPE_CENTRE_NC23__CONSIGNES_PARTICULIERES:
				setConsignesParticulieres((String)newValue);
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
			case SchemaPackage.TYPE_CENTRE_NC23__RESPONSABILITE_LIAISON_AVEC_CENTRE_AIR:
				unsetResponsabiliteLiaisonAvecCentreAir();
				return;
			case SchemaPackage.TYPE_CENTRE_NC23__MODE_FONCTIONNEMENT:
				unsetModeFonctionnement();
				return;
			case SchemaPackage.TYPE_CENTRE_NC23__AUTRE_MODE_FONCTIONNEMENT:
				setAutreModeFonctionnement(AUTRE_MODE_FONCTIONNEMENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CENTRE_NC23__CONSIGNES_PARTICULIERES:
				setConsignesParticulieres(CONSIGNES_PARTICULIERES_EDEFAULT);
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
			case SchemaPackage.TYPE_CENTRE_NC23__RESPONSABILITE_LIAISON_AVEC_CENTRE_AIR:
				return isSetResponsabiliteLiaisonAvecCentreAir();
			case SchemaPackage.TYPE_CENTRE_NC23__MODE_FONCTIONNEMENT:
				return isSetModeFonctionnement();
			case SchemaPackage.TYPE_CENTRE_NC23__AUTRE_MODE_FONCTIONNEMENT:
				return AUTRE_MODE_FONCTIONNEMENT_EDEFAULT == null ? autreModeFonctionnement != null : !AUTRE_MODE_FONCTIONNEMENT_EDEFAULT.equals(autreModeFonctionnement);
			case SchemaPackage.TYPE_CENTRE_NC23__CONSIGNES_PARTICULIERES:
				return CONSIGNES_PARTICULIERES_EDEFAULT == null ? consignesParticulieres != null : !CONSIGNES_PARTICULIERES_EDEFAULT.equals(consignesParticulieres);
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
		result.append(" (responsabiliteLiaisonAvecCentreAir: ");
		if (responsabiliteLiaisonAvecCentreAirESet) result.append(responsabiliteLiaisonAvecCentreAir); else result.append("<unset>");
		result.append(", modeFonctionnement: ");
		if (modeFonctionnementESet) result.append(modeFonctionnement); else result.append("<unset>");
		result.append(", autreModeFonctionnement: ");
		result.append(autreModeFonctionnement);
		result.append(", consignesParticulieres: ");
		result.append(consignesParticulieres);
		result.append(')');
		return result.toString();
	}

} //TypeCentreNC23Impl
