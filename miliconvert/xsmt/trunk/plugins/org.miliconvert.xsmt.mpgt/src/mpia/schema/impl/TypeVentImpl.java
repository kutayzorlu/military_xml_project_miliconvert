/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeAngle;
import mpia.meta.TypeDataTypeVitesseLineaire;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoPuissanceDetonation;
import mpia.schema.TypeDictionaryDicoVentCategorie;
import mpia.schema.TypeDictionaryDicoVentCoucheAltitude;
import mpia.schema.TypeDictionaryDicoVentStabiliteAir;
import mpia.schema.TypeVent;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Vent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeVentImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeVentImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeVentImpl#getVitesse <em>Vitesse</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeVentImpl#getCoucheAltitude <em>Couche Altitude</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeVentImpl#getStabiliteAir <em>Stabilite Air</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeVentImpl#getTypePourNucleaire <em>Type Pour Nucleaire</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeVentImpl extends EObjectImpl implements TypeVent {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoVentCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoVentCategorie.CONST;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoVentCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAngle direction;

	/**
	 * The cached value of the '{@link #getVitesse() <em>Vitesse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesse()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeVitesseLineaire vitesse;

	/**
	 * The default value of the '{@link #getCoucheAltitude() <em>Couche Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoucheAltitude()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoVentCoucheAltitude COUCHE_ALTITUDE_EDEFAULT = TypeDictionaryDicoVentCoucheAltitude._2;

	/**
	 * The cached value of the '{@link #getCoucheAltitude() <em>Couche Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoucheAltitude()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoVentCoucheAltitude coucheAltitude = COUCHE_ALTITUDE_EDEFAULT;

	/**
	 * This is true if the Couche Altitude attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean coucheAltitudeESet;

	/**
	 * The default value of the '{@link #getStabiliteAir() <em>Stabilite Air</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStabiliteAir()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoVentStabiliteAir STABILITE_AIR_EDEFAULT = TypeDictionaryDicoVentStabiliteAir.U;

	/**
	 * The cached value of the '{@link #getStabiliteAir() <em>Stabilite Air</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStabiliteAir()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoVentStabiliteAir stabiliteAir = STABILITE_AIR_EDEFAULT;

	/**
	 * This is true if the Stabilite Air attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stabiliteAirESet;

	/**
	 * The default value of the '{@link #getTypePourNucleaire() <em>Type Pour Nucleaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypePourNucleaire()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPuissanceDetonation TYPE_POUR_NUCLEAIRE_EDEFAULT = TypeDictionaryDicoPuissanceDetonation.ALFA;

	/**
	 * The cached value of the '{@link #getTypePourNucleaire() <em>Type Pour Nucleaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypePourNucleaire()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPuissanceDetonation typePourNucleaire = TYPE_POUR_NUCLEAIRE_EDEFAULT;

	/**
	 * This is true if the Type Pour Nucleaire attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typePourNucleaireESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeVentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeVent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoVentCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoVentCategorie newCategorie) {
		TypeDictionaryDicoVentCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VENT__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoVentCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_VENT__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCategorie() {
		return categorieESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAngle getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirection(TypeDataTypeAngle newDirection, NotificationChain msgs) {
		TypeDataTypeAngle oldDirection = direction;
		direction = newDirection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VENT__DIRECTION, oldDirection, newDirection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(TypeDataTypeAngle newDirection) {
		if (newDirection != direction) {
			NotificationChain msgs = null;
			if (direction != null)
				msgs = ((InternalEObject)direction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_VENT__DIRECTION, null, msgs);
			if (newDirection != null)
				msgs = ((InternalEObject)newDirection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_VENT__DIRECTION, null, msgs);
			msgs = basicSetDirection(newDirection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VENT__DIRECTION, newDirection, newDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeVitesseLineaire getVitesse() {
		return vitesse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVitesse(TypeDataTypeVitesseLineaire newVitesse, NotificationChain msgs) {
		TypeDataTypeVitesseLineaire oldVitesse = vitesse;
		vitesse = newVitesse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VENT__VITESSE, oldVitesse, newVitesse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVitesse(TypeDataTypeVitesseLineaire newVitesse) {
		if (newVitesse != vitesse) {
			NotificationChain msgs = null;
			if (vitesse != null)
				msgs = ((InternalEObject)vitesse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_VENT__VITESSE, null, msgs);
			if (newVitesse != null)
				msgs = ((InternalEObject)newVitesse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_VENT__VITESSE, null, msgs);
			msgs = basicSetVitesse(newVitesse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VENT__VITESSE, newVitesse, newVitesse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoVentCoucheAltitude getCoucheAltitude() {
		return coucheAltitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoucheAltitude(TypeDictionaryDicoVentCoucheAltitude newCoucheAltitude) {
		TypeDictionaryDicoVentCoucheAltitude oldCoucheAltitude = coucheAltitude;
		coucheAltitude = newCoucheAltitude == null ? COUCHE_ALTITUDE_EDEFAULT : newCoucheAltitude;
		boolean oldCoucheAltitudeESet = coucheAltitudeESet;
		coucheAltitudeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VENT__COUCHE_ALTITUDE, oldCoucheAltitude, coucheAltitude, !oldCoucheAltitudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCoucheAltitude() {
		TypeDictionaryDicoVentCoucheAltitude oldCoucheAltitude = coucheAltitude;
		boolean oldCoucheAltitudeESet = coucheAltitudeESet;
		coucheAltitude = COUCHE_ALTITUDE_EDEFAULT;
		coucheAltitudeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_VENT__COUCHE_ALTITUDE, oldCoucheAltitude, COUCHE_ALTITUDE_EDEFAULT, oldCoucheAltitudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCoucheAltitude() {
		return coucheAltitudeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoVentStabiliteAir getStabiliteAir() {
		return stabiliteAir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStabiliteAir(TypeDictionaryDicoVentStabiliteAir newStabiliteAir) {
		TypeDictionaryDicoVentStabiliteAir oldStabiliteAir = stabiliteAir;
		stabiliteAir = newStabiliteAir == null ? STABILITE_AIR_EDEFAULT : newStabiliteAir;
		boolean oldStabiliteAirESet = stabiliteAirESet;
		stabiliteAirESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VENT__STABILITE_AIR, oldStabiliteAir, stabiliteAir, !oldStabiliteAirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStabiliteAir() {
		TypeDictionaryDicoVentStabiliteAir oldStabiliteAir = stabiliteAir;
		boolean oldStabiliteAirESet = stabiliteAirESet;
		stabiliteAir = STABILITE_AIR_EDEFAULT;
		stabiliteAirESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_VENT__STABILITE_AIR, oldStabiliteAir, STABILITE_AIR_EDEFAULT, oldStabiliteAirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStabiliteAir() {
		return stabiliteAirESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPuissanceDetonation getTypePourNucleaire() {
		return typePourNucleaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypePourNucleaire(TypeDictionaryDicoPuissanceDetonation newTypePourNucleaire) {
		TypeDictionaryDicoPuissanceDetonation oldTypePourNucleaire = typePourNucleaire;
		typePourNucleaire = newTypePourNucleaire == null ? TYPE_POUR_NUCLEAIRE_EDEFAULT : newTypePourNucleaire;
		boolean oldTypePourNucleaireESet = typePourNucleaireESet;
		typePourNucleaireESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VENT__TYPE_POUR_NUCLEAIRE, oldTypePourNucleaire, typePourNucleaire, !oldTypePourNucleaireESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypePourNucleaire() {
		TypeDictionaryDicoPuissanceDetonation oldTypePourNucleaire = typePourNucleaire;
		boolean oldTypePourNucleaireESet = typePourNucleaireESet;
		typePourNucleaire = TYPE_POUR_NUCLEAIRE_EDEFAULT;
		typePourNucleaireESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_VENT__TYPE_POUR_NUCLEAIRE, oldTypePourNucleaire, TYPE_POUR_NUCLEAIRE_EDEFAULT, oldTypePourNucleaireESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypePourNucleaire() {
		return typePourNucleaireESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_VENT__DIRECTION:
				return basicSetDirection(null, msgs);
			case SchemaPackage.TYPE_VENT__VITESSE:
				return basicSetVitesse(null, msgs);
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
			case SchemaPackage.TYPE_VENT__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_VENT__DIRECTION:
				return getDirection();
			case SchemaPackage.TYPE_VENT__VITESSE:
				return getVitesse();
			case SchemaPackage.TYPE_VENT__COUCHE_ALTITUDE:
				return getCoucheAltitude();
			case SchemaPackage.TYPE_VENT__STABILITE_AIR:
				return getStabiliteAir();
			case SchemaPackage.TYPE_VENT__TYPE_POUR_NUCLEAIRE:
				return getTypePourNucleaire();
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
			case SchemaPackage.TYPE_VENT__CATEGORIE:
				setCategorie((TypeDictionaryDicoVentCategorie)newValue);
				return;
			case SchemaPackage.TYPE_VENT__DIRECTION:
				setDirection((TypeDataTypeAngle)newValue);
				return;
			case SchemaPackage.TYPE_VENT__VITESSE:
				setVitesse((TypeDataTypeVitesseLineaire)newValue);
				return;
			case SchemaPackage.TYPE_VENT__COUCHE_ALTITUDE:
				setCoucheAltitude((TypeDictionaryDicoVentCoucheAltitude)newValue);
				return;
			case SchemaPackage.TYPE_VENT__STABILITE_AIR:
				setStabiliteAir((TypeDictionaryDicoVentStabiliteAir)newValue);
				return;
			case SchemaPackage.TYPE_VENT__TYPE_POUR_NUCLEAIRE:
				setTypePourNucleaire((TypeDictionaryDicoPuissanceDetonation)newValue);
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
			case SchemaPackage.TYPE_VENT__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_VENT__DIRECTION:
				setDirection((TypeDataTypeAngle)null);
				return;
			case SchemaPackage.TYPE_VENT__VITESSE:
				setVitesse((TypeDataTypeVitesseLineaire)null);
				return;
			case SchemaPackage.TYPE_VENT__COUCHE_ALTITUDE:
				unsetCoucheAltitude();
				return;
			case SchemaPackage.TYPE_VENT__STABILITE_AIR:
				unsetStabiliteAir();
				return;
			case SchemaPackage.TYPE_VENT__TYPE_POUR_NUCLEAIRE:
				unsetTypePourNucleaire();
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
			case SchemaPackage.TYPE_VENT__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_VENT__DIRECTION:
				return direction != null;
			case SchemaPackage.TYPE_VENT__VITESSE:
				return vitesse != null;
			case SchemaPackage.TYPE_VENT__COUCHE_ALTITUDE:
				return isSetCoucheAltitude();
			case SchemaPackage.TYPE_VENT__STABILITE_AIR:
				return isSetStabiliteAir();
			case SchemaPackage.TYPE_VENT__TYPE_POUR_NUCLEAIRE:
				return isSetTypePourNucleaire();
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
		result.append(" (categorie: ");
		if (categorieESet) result.append(categorie); else result.append("<unset>");
		result.append(", coucheAltitude: ");
		if (coucheAltitudeESet) result.append(coucheAltitude); else result.append("<unset>");
		result.append(", stabiliteAir: ");
		if (stabiliteAirESet) result.append(stabiliteAir); else result.append("<unset>");
		result.append(", typePourNucleaire: ");
		if (typePourNucleaireESet) result.append(typePourNucleaire); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeVentImpl
