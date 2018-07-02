/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoTypeEquipementASSCaracteristiques;
import mpia.schema.TypeTypeEquipementASS;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Type Equipement ASS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeTypeEquipementASSImpl#getNiveauPriorite <em>Niveau Priorite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeEquipementASSImpl#getCaracteristiques <em>Caracteristiques</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeEquipementASSImpl#getNbrFardeau <em>Nbr Fardeau</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeTypeEquipementASSImpl extends EObjectImpl implements TypeTypeEquipementASS {
	/**
	 * The default value of the '{@link #getNiveauPriorite() <em>Niveau Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauPriorite()
	 * @generated
	 * @ordered
	 */
	protected static final long NIVEAU_PRIORITE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNiveauPriorite() <em>Niveau Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauPriorite()
	 * @generated
	 * @ordered
	 */
	protected long niveauPriorite = NIVEAU_PRIORITE_EDEFAULT;

	/**
	 * This is true if the Niveau Priorite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean niveauPrioriteESet;

	/**
	 * The default value of the '{@link #getCaracteristiques() <em>Caracteristiques</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaracteristiques()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeEquipementASSCaracteristiques CARACTERISTIQUES_EDEFAULT = TypeDictionaryDicoTypeEquipementASSCaracteristiques.REGEQP;

	/**
	 * The cached value of the '{@link #getCaracteristiques() <em>Caracteristiques</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaracteristiques()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeEquipementASSCaracteristiques caracteristiques = CARACTERISTIQUES_EDEFAULT;

	/**
	 * This is true if the Caracteristiques attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean caracteristiquesESet;

	/**
	 * The default value of the '{@link #getNbrFardeau() <em>Nbr Fardeau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbrFardeau()
	 * @generated
	 * @ordered
	 */
	protected static final long NBR_FARDEAU_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNbrFardeau() <em>Nbr Fardeau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbrFardeau()
	 * @generated
	 * @ordered
	 */
	protected long nbrFardeau = NBR_FARDEAU_EDEFAULT;

	/**
	 * This is true if the Nbr Fardeau attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nbrFardeauESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeTypeEquipementASSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeTypeEquipementASS();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNiveauPriorite() {
		return niveauPriorite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNiveauPriorite(long newNiveauPriorite) {
		long oldNiveauPriorite = niveauPriorite;
		niveauPriorite = newNiveauPriorite;
		boolean oldNiveauPrioriteESet = niveauPrioriteESet;
		niveauPrioriteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_EQUIPEMENT_ASS__NIVEAU_PRIORITE, oldNiveauPriorite, niveauPriorite, !oldNiveauPrioriteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNiveauPriorite() {
		long oldNiveauPriorite = niveauPriorite;
		boolean oldNiveauPrioriteESet = niveauPrioriteESet;
		niveauPriorite = NIVEAU_PRIORITE_EDEFAULT;
		niveauPrioriteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_EQUIPEMENT_ASS__NIVEAU_PRIORITE, oldNiveauPriorite, NIVEAU_PRIORITE_EDEFAULT, oldNiveauPrioriteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNiveauPriorite() {
		return niveauPrioriteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeEquipementASSCaracteristiques getCaracteristiques() {
		return caracteristiques;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaracteristiques(TypeDictionaryDicoTypeEquipementASSCaracteristiques newCaracteristiques) {
		TypeDictionaryDicoTypeEquipementASSCaracteristiques oldCaracteristiques = caracteristiques;
		caracteristiques = newCaracteristiques == null ? CARACTERISTIQUES_EDEFAULT : newCaracteristiques;
		boolean oldCaracteristiquesESet = caracteristiquesESet;
		caracteristiquesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_EQUIPEMENT_ASS__CARACTERISTIQUES, oldCaracteristiques, caracteristiques, !oldCaracteristiquesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCaracteristiques() {
		TypeDictionaryDicoTypeEquipementASSCaracteristiques oldCaracteristiques = caracteristiques;
		boolean oldCaracteristiquesESet = caracteristiquesESet;
		caracteristiques = CARACTERISTIQUES_EDEFAULT;
		caracteristiquesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_EQUIPEMENT_ASS__CARACTERISTIQUES, oldCaracteristiques, CARACTERISTIQUES_EDEFAULT, oldCaracteristiquesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCaracteristiques() {
		return caracteristiquesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNbrFardeau() {
		return nbrFardeau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbrFardeau(long newNbrFardeau) {
		long oldNbrFardeau = nbrFardeau;
		nbrFardeau = newNbrFardeau;
		boolean oldNbrFardeauESet = nbrFardeauESet;
		nbrFardeauESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_EQUIPEMENT_ASS__NBR_FARDEAU, oldNbrFardeau, nbrFardeau, !oldNbrFardeauESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNbrFardeau() {
		long oldNbrFardeau = nbrFardeau;
		boolean oldNbrFardeauESet = nbrFardeauESet;
		nbrFardeau = NBR_FARDEAU_EDEFAULT;
		nbrFardeauESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_EQUIPEMENT_ASS__NBR_FARDEAU, oldNbrFardeau, NBR_FARDEAU_EDEFAULT, oldNbrFardeauESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNbrFardeau() {
		return nbrFardeauESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT_ASS__NIVEAU_PRIORITE:
				return new Long(getNiveauPriorite());
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT_ASS__CARACTERISTIQUES:
				return getCaracteristiques();
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT_ASS__NBR_FARDEAU:
				return new Long(getNbrFardeau());
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
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT_ASS__NIVEAU_PRIORITE:
				setNiveauPriorite(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT_ASS__CARACTERISTIQUES:
				setCaracteristiques((TypeDictionaryDicoTypeEquipementASSCaracteristiques)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT_ASS__NBR_FARDEAU:
				setNbrFardeau(((Long)newValue).longValue());
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
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT_ASS__NIVEAU_PRIORITE:
				unsetNiveauPriorite();
				return;
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT_ASS__CARACTERISTIQUES:
				unsetCaracteristiques();
				return;
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT_ASS__NBR_FARDEAU:
				unsetNbrFardeau();
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
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT_ASS__NIVEAU_PRIORITE:
				return isSetNiveauPriorite();
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT_ASS__CARACTERISTIQUES:
				return isSetCaracteristiques();
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT_ASS__NBR_FARDEAU:
				return isSetNbrFardeau();
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
		result.append(" (niveauPriorite: ");
		if (niveauPrioriteESet) result.append(niveauPriorite); else result.append("<unset>");
		result.append(", caracteristiques: ");
		if (caracteristiquesESet) result.append(caracteristiques); else result.append("<unset>");
		result.append(", nbrFardeau: ");
		if (nbrFardeauESet) result.append(nbrFardeau); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeTypeEquipementASSImpl
