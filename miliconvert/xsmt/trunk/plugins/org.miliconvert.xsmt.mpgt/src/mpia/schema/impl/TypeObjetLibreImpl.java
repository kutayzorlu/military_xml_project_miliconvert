/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoCouleur;
import mpia.schema.TypeLocalisation;
import mpia.schema.TypeObjetLibre;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Objet Libre</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeObjetLibreImpl#getCouleur <em>Couleur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjetLibreImpl#isTraitEpais <em>Trait Epais</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjetLibreImpl#isTraitPointille <em>Trait Pointille</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjetLibreImpl#isZoneHachuree <em>Zone Hachuree</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjetLibreImpl#getEstLocaliseEnLocalisation <em>Est Localise En Localisation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeObjetLibreImpl extends TypeRacineOperationnelleImpl implements TypeObjetLibre {
	/**
	 * The default value of the '{@link #getCouleur() <em>Couleur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouleur()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCouleur COULEUR_EDEFAULT = TypeDictionaryDicoCouleur.BLACK;

	/**
	 * The cached value of the '{@link #getCouleur() <em>Couleur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouleur()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCouleur couleur = COULEUR_EDEFAULT;

	/**
	 * This is true if the Couleur attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean couleurESet;

	/**
	 * The default value of the '{@link #isTraitEpais() <em>Trait Epais</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTraitEpais()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRAIT_EPAIS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTraitEpais() <em>Trait Epais</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTraitEpais()
	 * @generated
	 * @ordered
	 */
	protected boolean traitEpais = TRAIT_EPAIS_EDEFAULT;

	/**
	 * This is true if the Trait Epais attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean traitEpaisESet;

	/**
	 * The default value of the '{@link #isTraitPointille() <em>Trait Pointille</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTraitPointille()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRAIT_POINTILLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTraitPointille() <em>Trait Pointille</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTraitPointille()
	 * @generated
	 * @ordered
	 */
	protected boolean traitPointille = TRAIT_POINTILLE_EDEFAULT;

	/**
	 * This is true if the Trait Pointille attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean traitPointilleESet;

	/**
	 * The default value of the '{@link #isZoneHachuree() <em>Zone Hachuree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZoneHachuree()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ZONE_HACHUREE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isZoneHachuree() <em>Zone Hachuree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZoneHachuree()
	 * @generated
	 * @ordered
	 */
	protected boolean zoneHachuree = ZONE_HACHUREE_EDEFAULT;

	/**
	 * This is true if the Zone Hachuree attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean zoneHachureeESet;

	/**
	 * The cached value of the '{@link #getEstLocaliseEnLocalisation() <em>Est Localise En Localisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstLocaliseEnLocalisation()
	 * @generated
	 * @ordered
	 */
	protected TypeLocalisation estLocaliseEnLocalisation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeObjetLibreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeObjetLibre();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCouleur getCouleur() {
		return couleur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCouleur(TypeDictionaryDicoCouleur newCouleur) {
		TypeDictionaryDicoCouleur oldCouleur = couleur;
		couleur = newCouleur == null ? COULEUR_EDEFAULT : newCouleur;
		boolean oldCouleurESet = couleurESet;
		couleurESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJET_LIBRE__COULEUR, oldCouleur, couleur, !oldCouleurESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCouleur() {
		TypeDictionaryDicoCouleur oldCouleur = couleur;
		boolean oldCouleurESet = couleurESet;
		couleur = COULEUR_EDEFAULT;
		couleurESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_OBJET_LIBRE__COULEUR, oldCouleur, COULEUR_EDEFAULT, oldCouleurESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCouleur() {
		return couleurESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTraitEpais() {
		return traitEpais;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraitEpais(boolean newTraitEpais) {
		boolean oldTraitEpais = traitEpais;
		traitEpais = newTraitEpais;
		boolean oldTraitEpaisESet = traitEpaisESet;
		traitEpaisESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJET_LIBRE__TRAIT_EPAIS, oldTraitEpais, traitEpais, !oldTraitEpaisESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTraitEpais() {
		boolean oldTraitEpais = traitEpais;
		boolean oldTraitEpaisESet = traitEpaisESet;
		traitEpais = TRAIT_EPAIS_EDEFAULT;
		traitEpaisESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_OBJET_LIBRE__TRAIT_EPAIS, oldTraitEpais, TRAIT_EPAIS_EDEFAULT, oldTraitEpaisESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTraitEpais() {
		return traitEpaisESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTraitPointille() {
		return traitPointille;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraitPointille(boolean newTraitPointille) {
		boolean oldTraitPointille = traitPointille;
		traitPointille = newTraitPointille;
		boolean oldTraitPointilleESet = traitPointilleESet;
		traitPointilleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJET_LIBRE__TRAIT_POINTILLE, oldTraitPointille, traitPointille, !oldTraitPointilleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTraitPointille() {
		boolean oldTraitPointille = traitPointille;
		boolean oldTraitPointilleESet = traitPointilleESet;
		traitPointille = TRAIT_POINTILLE_EDEFAULT;
		traitPointilleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_OBJET_LIBRE__TRAIT_POINTILLE, oldTraitPointille, TRAIT_POINTILLE_EDEFAULT, oldTraitPointilleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTraitPointille() {
		return traitPointilleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isZoneHachuree() {
		return zoneHachuree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZoneHachuree(boolean newZoneHachuree) {
		boolean oldZoneHachuree = zoneHachuree;
		zoneHachuree = newZoneHachuree;
		boolean oldZoneHachureeESet = zoneHachureeESet;
		zoneHachureeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJET_LIBRE__ZONE_HACHUREE, oldZoneHachuree, zoneHachuree, !oldZoneHachureeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetZoneHachuree() {
		boolean oldZoneHachuree = zoneHachuree;
		boolean oldZoneHachureeESet = zoneHachureeESet;
		zoneHachuree = ZONE_HACHUREE_EDEFAULT;
		zoneHachureeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_OBJET_LIBRE__ZONE_HACHUREE, oldZoneHachuree, ZONE_HACHUREE_EDEFAULT, oldZoneHachureeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetZoneHachuree() {
		return zoneHachureeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeLocalisation getEstLocaliseEnLocalisation() {
		return estLocaliseEnLocalisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstLocaliseEnLocalisation(TypeLocalisation newEstLocaliseEnLocalisation, NotificationChain msgs) {
		TypeLocalisation oldEstLocaliseEnLocalisation = estLocaliseEnLocalisation;
		estLocaliseEnLocalisation = newEstLocaliseEnLocalisation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJET_LIBRE__EST_LOCALISE_EN_LOCALISATION, oldEstLocaliseEnLocalisation, newEstLocaliseEnLocalisation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstLocaliseEnLocalisation(TypeLocalisation newEstLocaliseEnLocalisation) {
		if (newEstLocaliseEnLocalisation != estLocaliseEnLocalisation) {
			NotificationChain msgs = null;
			if (estLocaliseEnLocalisation != null)
				msgs = ((InternalEObject)estLocaliseEnLocalisation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBJET_LIBRE__EST_LOCALISE_EN_LOCALISATION, null, msgs);
			if (newEstLocaliseEnLocalisation != null)
				msgs = ((InternalEObject)newEstLocaliseEnLocalisation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBJET_LIBRE__EST_LOCALISE_EN_LOCALISATION, null, msgs);
			msgs = basicSetEstLocaliseEnLocalisation(newEstLocaliseEnLocalisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJET_LIBRE__EST_LOCALISE_EN_LOCALISATION, newEstLocaliseEnLocalisation, newEstLocaliseEnLocalisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_OBJET_LIBRE__EST_LOCALISE_EN_LOCALISATION:
				return basicSetEstLocaliseEnLocalisation(null, msgs);
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
			case SchemaPackage.TYPE_OBJET_LIBRE__COULEUR:
				return getCouleur();
			case SchemaPackage.TYPE_OBJET_LIBRE__TRAIT_EPAIS:
				return isTraitEpais() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_OBJET_LIBRE__TRAIT_POINTILLE:
				return isTraitPointille() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_OBJET_LIBRE__ZONE_HACHUREE:
				return isZoneHachuree() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_OBJET_LIBRE__EST_LOCALISE_EN_LOCALISATION:
				return getEstLocaliseEnLocalisation();
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
			case SchemaPackage.TYPE_OBJET_LIBRE__COULEUR:
				setCouleur((TypeDictionaryDicoCouleur)newValue);
				return;
			case SchemaPackage.TYPE_OBJET_LIBRE__TRAIT_EPAIS:
				setTraitEpais(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_OBJET_LIBRE__TRAIT_POINTILLE:
				setTraitPointille(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_OBJET_LIBRE__ZONE_HACHUREE:
				setZoneHachuree(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_OBJET_LIBRE__EST_LOCALISE_EN_LOCALISATION:
				setEstLocaliseEnLocalisation((TypeLocalisation)newValue);
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
			case SchemaPackage.TYPE_OBJET_LIBRE__COULEUR:
				unsetCouleur();
				return;
			case SchemaPackage.TYPE_OBJET_LIBRE__TRAIT_EPAIS:
				unsetTraitEpais();
				return;
			case SchemaPackage.TYPE_OBJET_LIBRE__TRAIT_POINTILLE:
				unsetTraitPointille();
				return;
			case SchemaPackage.TYPE_OBJET_LIBRE__ZONE_HACHUREE:
				unsetZoneHachuree();
				return;
			case SchemaPackage.TYPE_OBJET_LIBRE__EST_LOCALISE_EN_LOCALISATION:
				setEstLocaliseEnLocalisation((TypeLocalisation)null);
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
			case SchemaPackage.TYPE_OBJET_LIBRE__COULEUR:
				return isSetCouleur();
			case SchemaPackage.TYPE_OBJET_LIBRE__TRAIT_EPAIS:
				return isSetTraitEpais();
			case SchemaPackage.TYPE_OBJET_LIBRE__TRAIT_POINTILLE:
				return isSetTraitPointille();
			case SchemaPackage.TYPE_OBJET_LIBRE__ZONE_HACHUREE:
				return isSetZoneHachuree();
			case SchemaPackage.TYPE_OBJET_LIBRE__EST_LOCALISE_EN_LOCALISATION:
				return estLocaliseEnLocalisation != null;
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
		result.append(" (couleur: ");
		if (couleurESet) result.append(couleur); else result.append("<unset>");
		result.append(", traitEpais: ");
		if (traitEpaisESet) result.append(traitEpais); else result.append("<unset>");
		result.append(", traitPointille: ");
		if (traitPointilleESet) result.append(traitPointille); else result.append("<unset>");
		result.append(", zoneHachuree: ");
		if (zoneHachureeESet) result.append(zoneHachuree); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeObjetLibreImpl
