/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeChampMinesTerrestre;
import mpia.schema.TypeDictionaryDicoChampMinesTerrestreDispersion;
import mpia.schema.TypeDictionaryDicoChampMinesTerrestreEnfouissement;
import mpia.schema.TypeDictionaryDicoChampMinesTerrestreFonction;
import mpia.schema.TypeDictionaryDicoChampMinesTerrestrePersistance;
import mpia.schema.TypeDictionaryDicoChampMinesTerrestrePouvoirArret;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Champ Mines Terrestre</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeChampMinesTerrestreImpl#getFonction <em>Fonction</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeChampMinesTerrestreImpl#getEnfouissement <em>Enfouissement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeChampMinesTerrestreImpl#getDispersion <em>Dispersion</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeChampMinesTerrestreImpl#getPersistance <em>Persistance</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeChampMinesTerrestreImpl#getPouvoirArret <em>Pouvoir Arret</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeChampMinesTerrestreImpl extends TypeChampMinesImpl implements TypeChampMinesTerrestre {
	/**
	 * The default value of the '{@link #getFonction() <em>Fonction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFonction()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoChampMinesTerrestreFonction FONCTION_EDEFAULT = TypeDictionaryDicoChampMinesTerrestreFonction.HTACT;

	/**
	 * The cached value of the '{@link #getFonction() <em>Fonction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFonction()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoChampMinesTerrestreFonction fonction = FONCTION_EDEFAULT;

	/**
	 * This is true if the Fonction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fonctionESet;

	/**
	 * The default value of the '{@link #getEnfouissement() <em>Enfouissement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnfouissement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoChampMinesTerrestreEnfouissement ENFOUISSEMENT_EDEFAULT = TypeDictionaryDicoChampMinesTerrestreEnfouissement.SURFCE;

	/**
	 * The cached value of the '{@link #getEnfouissement() <em>Enfouissement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnfouissement()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoChampMinesTerrestreEnfouissement enfouissement = ENFOUISSEMENT_EDEFAULT;

	/**
	 * This is true if the Enfouissement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean enfouissementESet;

	/**
	 * The default value of the '{@link #getDispersion() <em>Dispersion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispersion()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoChampMinesTerrestreDispersion DISPERSION_EDEFAULT = TypeDictionaryDicoChampMinesTerrestreDispersion.NKN;

	/**
	 * The cached value of the '{@link #getDispersion() <em>Dispersion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispersion()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoChampMinesTerrestreDispersion dispersion = DISPERSION_EDEFAULT;

	/**
	 * This is true if the Dispersion attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dispersionESet;

	/**
	 * The default value of the '{@link #getPersistance() <em>Persistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistance()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoChampMinesTerrestrePersistance PERSISTANCE_EDEFAULT = TypeDictionaryDicoChampMinesTerrestrePersistance.NKN;

	/**
	 * The cached value of the '{@link #getPersistance() <em>Persistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistance()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoChampMinesTerrestrePersistance persistance = PERSISTANCE_EDEFAULT;

	/**
	 * This is true if the Persistance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean persistanceESet;

	/**
	 * The default value of the '{@link #getPouvoirArret() <em>Pouvoir Arret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPouvoirArret()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoChampMinesTerrestrePouvoirArret POUVOIR_ARRET_EDEFAULT = TypeDictionaryDicoChampMinesTerrestrePouvoirArret.HIGH;

	/**
	 * The cached value of the '{@link #getPouvoirArret() <em>Pouvoir Arret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPouvoirArret()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoChampMinesTerrestrePouvoirArret pouvoirArret = POUVOIR_ARRET_EDEFAULT;

	/**
	 * This is true if the Pouvoir Arret attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pouvoirArretESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeChampMinesTerrestreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeChampMinesTerrestre();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoChampMinesTerrestreFonction getFonction() {
		return fonction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFonction(TypeDictionaryDicoChampMinesTerrestreFonction newFonction) {
		TypeDictionaryDicoChampMinesTerrestreFonction oldFonction = fonction;
		fonction = newFonction == null ? FONCTION_EDEFAULT : newFonction;
		boolean oldFonctionESet = fonctionESet;
		fonctionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CHAMP_MINES_TERRESTRE__FONCTION, oldFonction, fonction, !oldFonctionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFonction() {
		TypeDictionaryDicoChampMinesTerrestreFonction oldFonction = fonction;
		boolean oldFonctionESet = fonctionESet;
		fonction = FONCTION_EDEFAULT;
		fonctionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CHAMP_MINES_TERRESTRE__FONCTION, oldFonction, FONCTION_EDEFAULT, oldFonctionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFonction() {
		return fonctionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoChampMinesTerrestreEnfouissement getEnfouissement() {
		return enfouissement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnfouissement(TypeDictionaryDicoChampMinesTerrestreEnfouissement newEnfouissement) {
		TypeDictionaryDicoChampMinesTerrestreEnfouissement oldEnfouissement = enfouissement;
		enfouissement = newEnfouissement == null ? ENFOUISSEMENT_EDEFAULT : newEnfouissement;
		boolean oldEnfouissementESet = enfouissementESet;
		enfouissementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CHAMP_MINES_TERRESTRE__ENFOUISSEMENT, oldEnfouissement, enfouissement, !oldEnfouissementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEnfouissement() {
		TypeDictionaryDicoChampMinesTerrestreEnfouissement oldEnfouissement = enfouissement;
		boolean oldEnfouissementESet = enfouissementESet;
		enfouissement = ENFOUISSEMENT_EDEFAULT;
		enfouissementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CHAMP_MINES_TERRESTRE__ENFOUISSEMENT, oldEnfouissement, ENFOUISSEMENT_EDEFAULT, oldEnfouissementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEnfouissement() {
		return enfouissementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoChampMinesTerrestreDispersion getDispersion() {
		return dispersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDispersion(TypeDictionaryDicoChampMinesTerrestreDispersion newDispersion) {
		TypeDictionaryDicoChampMinesTerrestreDispersion oldDispersion = dispersion;
		dispersion = newDispersion == null ? DISPERSION_EDEFAULT : newDispersion;
		boolean oldDispersionESet = dispersionESet;
		dispersionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CHAMP_MINES_TERRESTRE__DISPERSION, oldDispersion, dispersion, !oldDispersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDispersion() {
		TypeDictionaryDicoChampMinesTerrestreDispersion oldDispersion = dispersion;
		boolean oldDispersionESet = dispersionESet;
		dispersion = DISPERSION_EDEFAULT;
		dispersionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CHAMP_MINES_TERRESTRE__DISPERSION, oldDispersion, DISPERSION_EDEFAULT, oldDispersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDispersion() {
		return dispersionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoChampMinesTerrestrePersistance getPersistance() {
		return persistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistance(TypeDictionaryDicoChampMinesTerrestrePersistance newPersistance) {
		TypeDictionaryDicoChampMinesTerrestrePersistance oldPersistance = persistance;
		persistance = newPersistance == null ? PERSISTANCE_EDEFAULT : newPersistance;
		boolean oldPersistanceESet = persistanceESet;
		persistanceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CHAMP_MINES_TERRESTRE__PERSISTANCE, oldPersistance, persistance, !oldPersistanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPersistance() {
		TypeDictionaryDicoChampMinesTerrestrePersistance oldPersistance = persistance;
		boolean oldPersistanceESet = persistanceESet;
		persistance = PERSISTANCE_EDEFAULT;
		persistanceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CHAMP_MINES_TERRESTRE__PERSISTANCE, oldPersistance, PERSISTANCE_EDEFAULT, oldPersistanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPersistance() {
		return persistanceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoChampMinesTerrestrePouvoirArret getPouvoirArret() {
		return pouvoirArret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPouvoirArret(TypeDictionaryDicoChampMinesTerrestrePouvoirArret newPouvoirArret) {
		TypeDictionaryDicoChampMinesTerrestrePouvoirArret oldPouvoirArret = pouvoirArret;
		pouvoirArret = newPouvoirArret == null ? POUVOIR_ARRET_EDEFAULT : newPouvoirArret;
		boolean oldPouvoirArretESet = pouvoirArretESet;
		pouvoirArretESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CHAMP_MINES_TERRESTRE__POUVOIR_ARRET, oldPouvoirArret, pouvoirArret, !oldPouvoirArretESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPouvoirArret() {
		TypeDictionaryDicoChampMinesTerrestrePouvoirArret oldPouvoirArret = pouvoirArret;
		boolean oldPouvoirArretESet = pouvoirArretESet;
		pouvoirArret = POUVOIR_ARRET_EDEFAULT;
		pouvoirArretESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CHAMP_MINES_TERRESTRE__POUVOIR_ARRET, oldPouvoirArret, POUVOIR_ARRET_EDEFAULT, oldPouvoirArretESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPouvoirArret() {
		return pouvoirArretESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_CHAMP_MINES_TERRESTRE__FONCTION:
				return getFonction();
			case SchemaPackage.TYPE_CHAMP_MINES_TERRESTRE__ENFOUISSEMENT:
				return getEnfouissement();
			case SchemaPackage.TYPE_CHAMP_MINES_TERRESTRE__DISPERSION:
				return getDispersion();
			case SchemaPackage.TYPE_CHAMP_MINES_TERRESTRE__PERSISTANCE:
				return getPersistance();
			case SchemaPackage.TYPE_CHAMP_MINES_TERRESTRE__POUVOIR_ARRET:
				return getPouvoirArret();
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
			case SchemaPackage.TYPE_CHAMP_MINES_TERRESTRE__FONCTION:
				setFonction((TypeDictionaryDicoChampMinesTerrestreFonction)newValue);
				return;
			case SchemaPackage.TYPE_CHAMP_MINES_TERRESTRE__ENFOUISSEMENT:
				setEnfouissement((TypeDictionaryDicoChampMinesTerrestreEnfouissement)newValue);
				return;
			case SchemaPackage.TYPE_CHAMP_MINES_TERRESTRE__DISPERSION:
				setDispersion((TypeDictionaryDicoChampMinesTerrestreDispersion)newValue);
				return;
			case SchemaPackage.TYPE_CHAMP_MINES_TERRESTRE__PERSISTANCE:
				setPersistance((TypeDictionaryDicoChampMinesTerrestrePersistance)newValue);
				return;
			case SchemaPackage.TYPE_CHAMP_MINES_TERRESTRE__POUVOIR_ARRET:
				setPouvoirArret((TypeDictionaryDicoChampMinesTerrestrePouvoirArret)newValue);
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
			case SchemaPackage.TYPE_CHAMP_MINES_TERRESTRE__FONCTION:
				unsetFonction();
				return;
			case SchemaPackage.TYPE_CHAMP_MINES_TERRESTRE__ENFOUISSEMENT:
				unsetEnfouissement();
				return;
			case SchemaPackage.TYPE_CHAMP_MINES_TERRESTRE__DISPERSION:
				unsetDispersion();
				return;
			case SchemaPackage.TYPE_CHAMP_MINES_TERRESTRE__PERSISTANCE:
				unsetPersistance();
				return;
			case SchemaPackage.TYPE_CHAMP_MINES_TERRESTRE__POUVOIR_ARRET:
				unsetPouvoirArret();
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
			case SchemaPackage.TYPE_CHAMP_MINES_TERRESTRE__FONCTION:
				return isSetFonction();
			case SchemaPackage.TYPE_CHAMP_MINES_TERRESTRE__ENFOUISSEMENT:
				return isSetEnfouissement();
			case SchemaPackage.TYPE_CHAMP_MINES_TERRESTRE__DISPERSION:
				return isSetDispersion();
			case SchemaPackage.TYPE_CHAMP_MINES_TERRESTRE__PERSISTANCE:
				return isSetPersistance();
			case SchemaPackage.TYPE_CHAMP_MINES_TERRESTRE__POUVOIR_ARRET:
				return isSetPouvoirArret();
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
		result.append(" (fonction: ");
		if (fonctionESet) result.append(fonction); else result.append("<unset>");
		result.append(", enfouissement: ");
		if (enfouissementESet) result.append(enfouissement); else result.append("<unset>");
		result.append(", dispersion: ");
		if (dispersionESet) result.append(dispersion); else result.append("<unset>");
		result.append(", persistance: ");
		if (persistanceESet) result.append(persistance); else result.append("<unset>");
		result.append(", pouvoirArret: ");
		if (pouvoirArretESet) result.append(pouvoirArret); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeChampMinesTerrestreImpl
