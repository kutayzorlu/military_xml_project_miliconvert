/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeLongueur;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCaleSeche;
import mpia.schema.TypeDictionaryDicoCaleSecheCapaciteVoieFerreeSousMarine;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Cale Seche</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCaleSecheImpl#getTonnagePouvantEtreSouleve <em>Tonnage Pouvant Etre Souleve</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCaleSecheImpl#getProfondeurEauDisponible <em>Profondeur Eau Disponible</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCaleSecheImpl#getCapaciteVoieFerreeSousMarine <em>Capacite Voie Ferree Sous Marine</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCaleSecheImpl#getSpecificites <em>Specificites</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCaleSecheImpl extends TypeSiteImpl implements TypeCaleSeche {
	/**
	 * The default value of the '{@link #getTonnagePouvantEtreSouleve() <em>Tonnage Pouvant Etre Souleve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTonnagePouvantEtreSouleve()
	 * @generated
	 * @ordered
	 */
	protected static final long TONNAGE_POUVANT_ETRE_SOULEVE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTonnagePouvantEtreSouleve() <em>Tonnage Pouvant Etre Souleve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTonnagePouvantEtreSouleve()
	 * @generated
	 * @ordered
	 */
	protected long tonnagePouvantEtreSouleve = TONNAGE_POUVANT_ETRE_SOULEVE_EDEFAULT;

	/**
	 * This is true if the Tonnage Pouvant Etre Souleve attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tonnagePouvantEtreSouleveESet;

	/**
	 * The cached value of the '{@link #getProfondeurEauDisponible() <em>Profondeur Eau Disponible</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfondeurEauDisponible()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur profondeurEauDisponible;

	/**
	 * The default value of the '{@link #getCapaciteVoieFerreeSousMarine() <em>Capacite Voie Ferree Sous Marine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapaciteVoieFerreeSousMarine()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCaleSecheCapaciteVoieFerreeSousMarine CAPACITE_VOIE_FERREE_SOUS_MARINE_EDEFAULT = TypeDictionaryDicoCaleSecheCapaciteVoieFerreeSousMarine.S;

	/**
	 * The cached value of the '{@link #getCapaciteVoieFerreeSousMarine() <em>Capacite Voie Ferree Sous Marine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapaciteVoieFerreeSousMarine()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCaleSecheCapaciteVoieFerreeSousMarine capaciteVoieFerreeSousMarine = CAPACITE_VOIE_FERREE_SOUS_MARINE_EDEFAULT;

	/**
	 * This is true if the Capacite Voie Ferree Sous Marine attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean capaciteVoieFerreeSousMarineESet;

	/**
	 * The default value of the '{@link #getSpecificites() <em>Specificites</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificites()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIFICITES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecificites() <em>Specificites</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificites()
	 * @generated
	 * @ordered
	 */
	protected String specificites = SPECIFICITES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCaleSecheImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCaleSeche();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTonnagePouvantEtreSouleve() {
		return tonnagePouvantEtreSouleve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTonnagePouvantEtreSouleve(long newTonnagePouvantEtreSouleve) {
		long oldTonnagePouvantEtreSouleve = tonnagePouvantEtreSouleve;
		tonnagePouvantEtreSouleve = newTonnagePouvantEtreSouleve;
		boolean oldTonnagePouvantEtreSouleveESet = tonnagePouvantEtreSouleveESet;
		tonnagePouvantEtreSouleveESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CALE_SECHE__TONNAGE_POUVANT_ETRE_SOULEVE, oldTonnagePouvantEtreSouleve, tonnagePouvantEtreSouleve, !oldTonnagePouvantEtreSouleveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTonnagePouvantEtreSouleve() {
		long oldTonnagePouvantEtreSouleve = tonnagePouvantEtreSouleve;
		boolean oldTonnagePouvantEtreSouleveESet = tonnagePouvantEtreSouleveESet;
		tonnagePouvantEtreSouleve = TONNAGE_POUVANT_ETRE_SOULEVE_EDEFAULT;
		tonnagePouvantEtreSouleveESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CALE_SECHE__TONNAGE_POUVANT_ETRE_SOULEVE, oldTonnagePouvantEtreSouleve, TONNAGE_POUVANT_ETRE_SOULEVE_EDEFAULT, oldTonnagePouvantEtreSouleveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTonnagePouvantEtreSouleve() {
		return tonnagePouvantEtreSouleveESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getProfondeurEauDisponible() {
		return profondeurEauDisponible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProfondeurEauDisponible(TypeDataTypeLongueur newProfondeurEauDisponible, NotificationChain msgs) {
		TypeDataTypeLongueur oldProfondeurEauDisponible = profondeurEauDisponible;
		profondeurEauDisponible = newProfondeurEauDisponible;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CALE_SECHE__PROFONDEUR_EAU_DISPONIBLE, oldProfondeurEauDisponible, newProfondeurEauDisponible);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfondeurEauDisponible(TypeDataTypeLongueur newProfondeurEauDisponible) {
		if (newProfondeurEauDisponible != profondeurEauDisponible) {
			NotificationChain msgs = null;
			if (profondeurEauDisponible != null)
				msgs = ((InternalEObject)profondeurEauDisponible).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CALE_SECHE__PROFONDEUR_EAU_DISPONIBLE, null, msgs);
			if (newProfondeurEauDisponible != null)
				msgs = ((InternalEObject)newProfondeurEauDisponible).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CALE_SECHE__PROFONDEUR_EAU_DISPONIBLE, null, msgs);
			msgs = basicSetProfondeurEauDisponible(newProfondeurEauDisponible, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CALE_SECHE__PROFONDEUR_EAU_DISPONIBLE, newProfondeurEauDisponible, newProfondeurEauDisponible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCaleSecheCapaciteVoieFerreeSousMarine getCapaciteVoieFerreeSousMarine() {
		return capaciteVoieFerreeSousMarine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapaciteVoieFerreeSousMarine(TypeDictionaryDicoCaleSecheCapaciteVoieFerreeSousMarine newCapaciteVoieFerreeSousMarine) {
		TypeDictionaryDicoCaleSecheCapaciteVoieFerreeSousMarine oldCapaciteVoieFerreeSousMarine = capaciteVoieFerreeSousMarine;
		capaciteVoieFerreeSousMarine = newCapaciteVoieFerreeSousMarine == null ? CAPACITE_VOIE_FERREE_SOUS_MARINE_EDEFAULT : newCapaciteVoieFerreeSousMarine;
		boolean oldCapaciteVoieFerreeSousMarineESet = capaciteVoieFerreeSousMarineESet;
		capaciteVoieFerreeSousMarineESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CALE_SECHE__CAPACITE_VOIE_FERREE_SOUS_MARINE, oldCapaciteVoieFerreeSousMarine, capaciteVoieFerreeSousMarine, !oldCapaciteVoieFerreeSousMarineESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCapaciteVoieFerreeSousMarine() {
		TypeDictionaryDicoCaleSecheCapaciteVoieFerreeSousMarine oldCapaciteVoieFerreeSousMarine = capaciteVoieFerreeSousMarine;
		boolean oldCapaciteVoieFerreeSousMarineESet = capaciteVoieFerreeSousMarineESet;
		capaciteVoieFerreeSousMarine = CAPACITE_VOIE_FERREE_SOUS_MARINE_EDEFAULT;
		capaciteVoieFerreeSousMarineESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CALE_SECHE__CAPACITE_VOIE_FERREE_SOUS_MARINE, oldCapaciteVoieFerreeSousMarine, CAPACITE_VOIE_FERREE_SOUS_MARINE_EDEFAULT, oldCapaciteVoieFerreeSousMarineESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCapaciteVoieFerreeSousMarine() {
		return capaciteVoieFerreeSousMarineESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpecificites() {
		return specificites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecificites(String newSpecificites) {
		String oldSpecificites = specificites;
		specificites = newSpecificites;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CALE_SECHE__SPECIFICITES, oldSpecificites, specificites));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_CALE_SECHE__PROFONDEUR_EAU_DISPONIBLE:
				return basicSetProfondeurEauDisponible(null, msgs);
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
			case SchemaPackage.TYPE_CALE_SECHE__TONNAGE_POUVANT_ETRE_SOULEVE:
				return new Long(getTonnagePouvantEtreSouleve());
			case SchemaPackage.TYPE_CALE_SECHE__PROFONDEUR_EAU_DISPONIBLE:
				return getProfondeurEauDisponible();
			case SchemaPackage.TYPE_CALE_SECHE__CAPACITE_VOIE_FERREE_SOUS_MARINE:
				return getCapaciteVoieFerreeSousMarine();
			case SchemaPackage.TYPE_CALE_SECHE__SPECIFICITES:
				return getSpecificites();
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
			case SchemaPackage.TYPE_CALE_SECHE__TONNAGE_POUVANT_ETRE_SOULEVE:
				setTonnagePouvantEtreSouleve(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CALE_SECHE__PROFONDEUR_EAU_DISPONIBLE:
				setProfondeurEauDisponible((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_CALE_SECHE__CAPACITE_VOIE_FERREE_SOUS_MARINE:
				setCapaciteVoieFerreeSousMarine((TypeDictionaryDicoCaleSecheCapaciteVoieFerreeSousMarine)newValue);
				return;
			case SchemaPackage.TYPE_CALE_SECHE__SPECIFICITES:
				setSpecificites((String)newValue);
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
			case SchemaPackage.TYPE_CALE_SECHE__TONNAGE_POUVANT_ETRE_SOULEVE:
				unsetTonnagePouvantEtreSouleve();
				return;
			case SchemaPackage.TYPE_CALE_SECHE__PROFONDEUR_EAU_DISPONIBLE:
				setProfondeurEauDisponible((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_CALE_SECHE__CAPACITE_VOIE_FERREE_SOUS_MARINE:
				unsetCapaciteVoieFerreeSousMarine();
				return;
			case SchemaPackage.TYPE_CALE_SECHE__SPECIFICITES:
				setSpecificites(SPECIFICITES_EDEFAULT);
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
			case SchemaPackage.TYPE_CALE_SECHE__TONNAGE_POUVANT_ETRE_SOULEVE:
				return isSetTonnagePouvantEtreSouleve();
			case SchemaPackage.TYPE_CALE_SECHE__PROFONDEUR_EAU_DISPONIBLE:
				return profondeurEauDisponible != null;
			case SchemaPackage.TYPE_CALE_SECHE__CAPACITE_VOIE_FERREE_SOUS_MARINE:
				return isSetCapaciteVoieFerreeSousMarine();
			case SchemaPackage.TYPE_CALE_SECHE__SPECIFICITES:
				return SPECIFICITES_EDEFAULT == null ? specificites != null : !SPECIFICITES_EDEFAULT.equals(specificites);
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
		result.append(" (tonnagePouvantEtreSouleve: ");
		if (tonnagePouvantEtreSouleveESet) result.append(tonnagePouvantEtreSouleve); else result.append("<unset>");
		result.append(", capaciteVoieFerreeSousMarine: ");
		if (capaciteVoieFerreeSousMarineESet) result.append(capaciteVoieFerreeSousMarine); else result.append("<unset>");
		result.append(", specificites: ");
		result.append(specificites);
		result.append(')');
		return result.toString();
	}

} //TypeCaleSecheImpl
