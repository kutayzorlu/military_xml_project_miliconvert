/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoModeFonctionnement;
import mpia.schema.TypeDictionaryDicoOrganismeControleTypeOrganismeAir;
import mpia.schema.TypeOrganismeControle;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Organisme Controle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeOrganismeControleImpl#getTypeOrganismeAir <em>Type Organisme Air</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeOrganismeControleImpl#getAutreTypeOrganismeAir <em>Autre Type Organisme Air</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeOrganismeControleImpl#getComplementIdentification <em>Complement Identification</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeOrganismeControleImpl#getModeFonctionnement <em>Mode Fonctionnement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeOrganismeControleImpl#getAutreModeFonctionnement <em>Autre Mode Fonctionnement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeOrganismeControleImpl#getConsignesParticulieres <em>Consignes Particulieres</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeOrganismeControleImpl extends EObjectImpl implements TypeOrganismeControle {
	/**
	 * The default value of the '{@link #getTypeOrganismeAir() <em>Type Organisme Air</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOrganismeAir()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoOrganismeControleTypeOrganismeAir TYPE_ORGANISME_AIR_EDEFAULT = TypeDictionaryDicoOrganismeControleTypeOrganismeAir.DCC;

	/**
	 * The cached value of the '{@link #getTypeOrganismeAir() <em>Type Organisme Air</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOrganismeAir()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoOrganismeControleTypeOrganismeAir typeOrganismeAir = TYPE_ORGANISME_AIR_EDEFAULT;

	/**
	 * This is true if the Type Organisme Air attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeOrganismeAirESet;

	/**
	 * The default value of the '{@link #getAutreTypeOrganismeAir() <em>Autre Type Organisme Air</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreTypeOrganismeAir()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTRE_TYPE_ORGANISME_AIR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutreTypeOrganismeAir() <em>Autre Type Organisme Air</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreTypeOrganismeAir()
	 * @generated
	 * @ordered
	 */
	protected String autreTypeOrganismeAir = AUTRE_TYPE_ORGANISME_AIR_EDEFAULT;

	/**
	 * The default value of the '{@link #getComplementIdentification() <em>Complement Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplementIdentification()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPLEMENT_IDENTIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComplementIdentification() <em>Complement Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplementIdentification()
	 * @generated
	 * @ordered
	 */
	protected String complementIdentification = COMPLEMENT_IDENTIFICATION_EDEFAULT;

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
	protected TypeOrganismeControleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeOrganismeControle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoOrganismeControleTypeOrganismeAir getTypeOrganismeAir() {
		return typeOrganismeAir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeOrganismeAir(TypeDictionaryDicoOrganismeControleTypeOrganismeAir newTypeOrganismeAir) {
		TypeDictionaryDicoOrganismeControleTypeOrganismeAir oldTypeOrganismeAir = typeOrganismeAir;
		typeOrganismeAir = newTypeOrganismeAir == null ? TYPE_ORGANISME_AIR_EDEFAULT : newTypeOrganismeAir;
		boolean oldTypeOrganismeAirESet = typeOrganismeAirESet;
		typeOrganismeAirESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ORGANISME_CONTROLE__TYPE_ORGANISME_AIR, oldTypeOrganismeAir, typeOrganismeAir, !oldTypeOrganismeAirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeOrganismeAir() {
		TypeDictionaryDicoOrganismeControleTypeOrganismeAir oldTypeOrganismeAir = typeOrganismeAir;
		boolean oldTypeOrganismeAirESet = typeOrganismeAirESet;
		typeOrganismeAir = TYPE_ORGANISME_AIR_EDEFAULT;
		typeOrganismeAirESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ORGANISME_CONTROLE__TYPE_ORGANISME_AIR, oldTypeOrganismeAir, TYPE_ORGANISME_AIR_EDEFAULT, oldTypeOrganismeAirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeOrganismeAir() {
		return typeOrganismeAirESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutreTypeOrganismeAir() {
		return autreTypeOrganismeAir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutreTypeOrganismeAir(String newAutreTypeOrganismeAir) {
		String oldAutreTypeOrganismeAir = autreTypeOrganismeAir;
		autreTypeOrganismeAir = newAutreTypeOrganismeAir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ORGANISME_CONTROLE__AUTRE_TYPE_ORGANISME_AIR, oldAutreTypeOrganismeAir, autreTypeOrganismeAir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComplementIdentification() {
		return complementIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplementIdentification(String newComplementIdentification) {
		String oldComplementIdentification = complementIdentification;
		complementIdentification = newComplementIdentification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ORGANISME_CONTROLE__COMPLEMENT_IDENTIFICATION, oldComplementIdentification, complementIdentification));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ORGANISME_CONTROLE__MODE_FONCTIONNEMENT, oldModeFonctionnement, modeFonctionnement, !oldModeFonctionnementESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ORGANISME_CONTROLE__MODE_FONCTIONNEMENT, oldModeFonctionnement, MODE_FONCTIONNEMENT_EDEFAULT, oldModeFonctionnementESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ORGANISME_CONTROLE__AUTRE_MODE_FONCTIONNEMENT, oldAutreModeFonctionnement, autreModeFonctionnement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ORGANISME_CONTROLE__CONSIGNES_PARTICULIERES, oldConsignesParticulieres, consignesParticulieres));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_ORGANISME_CONTROLE__TYPE_ORGANISME_AIR:
				return getTypeOrganismeAir();
			case SchemaPackage.TYPE_ORGANISME_CONTROLE__AUTRE_TYPE_ORGANISME_AIR:
				return getAutreTypeOrganismeAir();
			case SchemaPackage.TYPE_ORGANISME_CONTROLE__COMPLEMENT_IDENTIFICATION:
				return getComplementIdentification();
			case SchemaPackage.TYPE_ORGANISME_CONTROLE__MODE_FONCTIONNEMENT:
				return getModeFonctionnement();
			case SchemaPackage.TYPE_ORGANISME_CONTROLE__AUTRE_MODE_FONCTIONNEMENT:
				return getAutreModeFonctionnement();
			case SchemaPackage.TYPE_ORGANISME_CONTROLE__CONSIGNES_PARTICULIERES:
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
			case SchemaPackage.TYPE_ORGANISME_CONTROLE__TYPE_ORGANISME_AIR:
				setTypeOrganismeAir((TypeDictionaryDicoOrganismeControleTypeOrganismeAir)newValue);
				return;
			case SchemaPackage.TYPE_ORGANISME_CONTROLE__AUTRE_TYPE_ORGANISME_AIR:
				setAutreTypeOrganismeAir((String)newValue);
				return;
			case SchemaPackage.TYPE_ORGANISME_CONTROLE__COMPLEMENT_IDENTIFICATION:
				setComplementIdentification((String)newValue);
				return;
			case SchemaPackage.TYPE_ORGANISME_CONTROLE__MODE_FONCTIONNEMENT:
				setModeFonctionnement((TypeDictionaryDicoModeFonctionnement)newValue);
				return;
			case SchemaPackage.TYPE_ORGANISME_CONTROLE__AUTRE_MODE_FONCTIONNEMENT:
				setAutreModeFonctionnement((String)newValue);
				return;
			case SchemaPackage.TYPE_ORGANISME_CONTROLE__CONSIGNES_PARTICULIERES:
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
			case SchemaPackage.TYPE_ORGANISME_CONTROLE__TYPE_ORGANISME_AIR:
				unsetTypeOrganismeAir();
				return;
			case SchemaPackage.TYPE_ORGANISME_CONTROLE__AUTRE_TYPE_ORGANISME_AIR:
				setAutreTypeOrganismeAir(AUTRE_TYPE_ORGANISME_AIR_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ORGANISME_CONTROLE__COMPLEMENT_IDENTIFICATION:
				setComplementIdentification(COMPLEMENT_IDENTIFICATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ORGANISME_CONTROLE__MODE_FONCTIONNEMENT:
				unsetModeFonctionnement();
				return;
			case SchemaPackage.TYPE_ORGANISME_CONTROLE__AUTRE_MODE_FONCTIONNEMENT:
				setAutreModeFonctionnement(AUTRE_MODE_FONCTIONNEMENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ORGANISME_CONTROLE__CONSIGNES_PARTICULIERES:
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
			case SchemaPackage.TYPE_ORGANISME_CONTROLE__TYPE_ORGANISME_AIR:
				return isSetTypeOrganismeAir();
			case SchemaPackage.TYPE_ORGANISME_CONTROLE__AUTRE_TYPE_ORGANISME_AIR:
				return AUTRE_TYPE_ORGANISME_AIR_EDEFAULT == null ? autreTypeOrganismeAir != null : !AUTRE_TYPE_ORGANISME_AIR_EDEFAULT.equals(autreTypeOrganismeAir);
			case SchemaPackage.TYPE_ORGANISME_CONTROLE__COMPLEMENT_IDENTIFICATION:
				return COMPLEMENT_IDENTIFICATION_EDEFAULT == null ? complementIdentification != null : !COMPLEMENT_IDENTIFICATION_EDEFAULT.equals(complementIdentification);
			case SchemaPackage.TYPE_ORGANISME_CONTROLE__MODE_FONCTIONNEMENT:
				return isSetModeFonctionnement();
			case SchemaPackage.TYPE_ORGANISME_CONTROLE__AUTRE_MODE_FONCTIONNEMENT:
				return AUTRE_MODE_FONCTIONNEMENT_EDEFAULT == null ? autreModeFonctionnement != null : !AUTRE_MODE_FONCTIONNEMENT_EDEFAULT.equals(autreModeFonctionnement);
			case SchemaPackage.TYPE_ORGANISME_CONTROLE__CONSIGNES_PARTICULIERES:
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
		result.append(" (typeOrganismeAir: ");
		if (typeOrganismeAirESet) result.append(typeOrganismeAir); else result.append("<unset>");
		result.append(", autreTypeOrganismeAir: ");
		result.append(autreTypeOrganismeAir);
		result.append(", complementIdentification: ");
		result.append(complementIdentification);
		result.append(", modeFonctionnement: ");
		if (modeFonctionnementESet) result.append(modeFonctionnement); else result.append("<unset>");
		result.append(", autreModeFonctionnement: ");
		result.append(autreModeFonctionnement);
		result.append(", consignesParticulieres: ");
		result.append(consignesParticulieres);
		result.append(')');
		return result.toString();
	}

} //TypeOrganismeControleImpl
