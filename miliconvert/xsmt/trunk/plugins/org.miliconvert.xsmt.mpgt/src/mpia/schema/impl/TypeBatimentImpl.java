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
import mpia.schema.TypeBatiment;
import mpia.schema.TypeDictionaryDicoEtatMouvement;

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
 * An implementation of the model object '<em><b>Type Batiment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeBatimentImpl#getIndicatifInternational <em>Indicatif International</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBatimentImpl#getTrigramme <em>Trigramme</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBatimentImpl#getNumeroDansClasse <em>Numero Dans Classe</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBatimentImpl#getEtatMouvement <em>Etat Mouvement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBatimentImpl#getAPourArticulationArticulationMarine <em>APour Articulation Articulation Marine</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeBatimentImpl extends TypeMaterielImpl implements TypeBatiment {
	/**
	 * The default value of the '{@link #getIndicatifInternational() <em>Indicatif International</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicatifInternational()
	 * @generated
	 * @ordered
	 */
	protected static final String INDICATIF_INTERNATIONAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndicatifInternational() <em>Indicatif International</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicatifInternational()
	 * @generated
	 * @ordered
	 */
	protected String indicatifInternational = INDICATIF_INTERNATIONAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrigramme() <em>Trigramme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigramme()
	 * @generated
	 * @ordered
	 */
	protected static final String TRIGRAMME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrigramme() <em>Trigramme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigramme()
	 * @generated
	 * @ordered
	 */
	protected String trigramme = TRIGRAMME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumeroDansClasse() <em>Numero Dans Classe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroDansClasse()
	 * @generated
	 * @ordered
	 */
	protected static final long NUMERO_DANS_CLASSE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNumeroDansClasse() <em>Numero Dans Classe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroDansClasse()
	 * @generated
	 * @ordered
	 */
	protected long numeroDansClasse = NUMERO_DANS_CLASSE_EDEFAULT;

	/**
	 * This is true if the Numero Dans Classe attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numeroDansClasseESet;

	/**
	 * The default value of the '{@link #getEtatMouvement() <em>Etat Mouvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatMouvement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatMouvement ETAT_MOUVEMENT_EDEFAULT = TypeDictionaryDicoEtatMouvement.ANC;

	/**
	 * The cached value of the '{@link #getEtatMouvement() <em>Etat Mouvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatMouvement()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatMouvement etatMouvement = ETAT_MOUVEMENT_EDEFAULT;

	/**
	 * This is true if the Etat Mouvement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean etatMouvementESet;

	/**
	 * The cached value of the '{@link #getAPourArticulationArticulationMarine() <em>APour Articulation Articulation Marine</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourArticulationArticulationMarine()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourArticulationArticulationMarine;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeBatimentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeBatiment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIndicatifInternational() {
		return indicatifInternational;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndicatifInternational(String newIndicatifInternational) {
		String oldIndicatifInternational = indicatifInternational;
		indicatifInternational = newIndicatifInternational;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BATIMENT__INDICATIF_INTERNATIONAL, oldIndicatifInternational, indicatifInternational));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTrigramme() {
		return trigramme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrigramme(String newTrigramme) {
		String oldTrigramme = trigramme;
		trigramme = newTrigramme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BATIMENT__TRIGRAMME, oldTrigramme, trigramme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNumeroDansClasse() {
		return numeroDansClasse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroDansClasse(long newNumeroDansClasse) {
		long oldNumeroDansClasse = numeroDansClasse;
		numeroDansClasse = newNumeroDansClasse;
		boolean oldNumeroDansClasseESet = numeroDansClasseESet;
		numeroDansClasseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BATIMENT__NUMERO_DANS_CLASSE, oldNumeroDansClasse, numeroDansClasse, !oldNumeroDansClasseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumeroDansClasse() {
		long oldNumeroDansClasse = numeroDansClasse;
		boolean oldNumeroDansClasseESet = numeroDansClasseESet;
		numeroDansClasse = NUMERO_DANS_CLASSE_EDEFAULT;
		numeroDansClasseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_BATIMENT__NUMERO_DANS_CLASSE, oldNumeroDansClasse, NUMERO_DANS_CLASSE_EDEFAULT, oldNumeroDansClasseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumeroDansClasse() {
		return numeroDansClasseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatMouvement getEtatMouvement() {
		return etatMouvement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatMouvement(TypeDictionaryDicoEtatMouvement newEtatMouvement) {
		TypeDictionaryDicoEtatMouvement oldEtatMouvement = etatMouvement;
		etatMouvement = newEtatMouvement == null ? ETAT_MOUVEMENT_EDEFAULT : newEtatMouvement;
		boolean oldEtatMouvementESet = etatMouvementESet;
		etatMouvementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BATIMENT__ETAT_MOUVEMENT, oldEtatMouvement, etatMouvement, !oldEtatMouvementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEtatMouvement() {
		TypeDictionaryDicoEtatMouvement oldEtatMouvement = etatMouvement;
		boolean oldEtatMouvementESet = etatMouvementESet;
		etatMouvement = ETAT_MOUVEMENT_EDEFAULT;
		etatMouvementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_BATIMENT__ETAT_MOUVEMENT, oldEtatMouvement, ETAT_MOUVEMENT_EDEFAULT, oldEtatMouvementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEtatMouvement() {
		return etatMouvementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourArticulationArticulationMarine() {
		if (aPourArticulationArticulationMarine == null) {
			aPourArticulationArticulationMarine = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_BATIMENT__APOUR_ARTICULATION_ARTICULATION_MARINE);
		}
		return aPourArticulationArticulationMarine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_BATIMENT__APOUR_ARTICULATION_ARTICULATION_MARINE:
				return ((InternalEList<?>)getAPourArticulationArticulationMarine()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_BATIMENT__INDICATIF_INTERNATIONAL:
				return getIndicatifInternational();
			case SchemaPackage.TYPE_BATIMENT__TRIGRAMME:
				return getTrigramme();
			case SchemaPackage.TYPE_BATIMENT__NUMERO_DANS_CLASSE:
				return new Long(getNumeroDansClasse());
			case SchemaPackage.TYPE_BATIMENT__ETAT_MOUVEMENT:
				return getEtatMouvement();
			case SchemaPackage.TYPE_BATIMENT__APOUR_ARTICULATION_ARTICULATION_MARINE:
				return getAPourArticulationArticulationMarine();
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
			case SchemaPackage.TYPE_BATIMENT__INDICATIF_INTERNATIONAL:
				setIndicatifInternational((String)newValue);
				return;
			case SchemaPackage.TYPE_BATIMENT__TRIGRAMME:
				setTrigramme((String)newValue);
				return;
			case SchemaPackage.TYPE_BATIMENT__NUMERO_DANS_CLASSE:
				setNumeroDansClasse(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_BATIMENT__ETAT_MOUVEMENT:
				setEtatMouvement((TypeDictionaryDicoEtatMouvement)newValue);
				return;
			case SchemaPackage.TYPE_BATIMENT__APOUR_ARTICULATION_ARTICULATION_MARINE:
				getAPourArticulationArticulationMarine().clear();
				getAPourArticulationArticulationMarine().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_BATIMENT__INDICATIF_INTERNATIONAL:
				setIndicatifInternational(INDICATIF_INTERNATIONAL_EDEFAULT);
				return;
			case SchemaPackage.TYPE_BATIMENT__TRIGRAMME:
				setTrigramme(TRIGRAMME_EDEFAULT);
				return;
			case SchemaPackage.TYPE_BATIMENT__NUMERO_DANS_CLASSE:
				unsetNumeroDansClasse();
				return;
			case SchemaPackage.TYPE_BATIMENT__ETAT_MOUVEMENT:
				unsetEtatMouvement();
				return;
			case SchemaPackage.TYPE_BATIMENT__APOUR_ARTICULATION_ARTICULATION_MARINE:
				getAPourArticulationArticulationMarine().clear();
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
			case SchemaPackage.TYPE_BATIMENT__INDICATIF_INTERNATIONAL:
				return INDICATIF_INTERNATIONAL_EDEFAULT == null ? indicatifInternational != null : !INDICATIF_INTERNATIONAL_EDEFAULT.equals(indicatifInternational);
			case SchemaPackage.TYPE_BATIMENT__TRIGRAMME:
				return TRIGRAMME_EDEFAULT == null ? trigramme != null : !TRIGRAMME_EDEFAULT.equals(trigramme);
			case SchemaPackage.TYPE_BATIMENT__NUMERO_DANS_CLASSE:
				return isSetNumeroDansClasse();
			case SchemaPackage.TYPE_BATIMENT__ETAT_MOUVEMENT:
				return isSetEtatMouvement();
			case SchemaPackage.TYPE_BATIMENT__APOUR_ARTICULATION_ARTICULATION_MARINE:
				return aPourArticulationArticulationMarine != null && !aPourArticulationArticulationMarine.isEmpty();
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
		result.append(" (indicatifInternational: ");
		result.append(indicatifInternational);
		result.append(", trigramme: ");
		result.append(trigramme);
		result.append(", numeroDansClasse: ");
		if (numeroDansClasseESet) result.append(numeroDansClasse); else result.append("<unset>");
		result.append(", etatMouvement: ");
		if (etatMouvementESet) result.append(etatMouvement); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeBatimentImpl
