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
import mpia.schema.TypeArticulationMarine;
import mpia.schema.TypeDictionaryDicoArticulationMarineCategorie;
import mpia.schema.TypeDictionaryDicoArticulationMarineDomaineLutte;
import mpia.schema.TypeDictionaryDicoEtatMouvement;
import mpia.schema.TypeTypeBatimentParticipant;

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
 * An implementation of the model object '<em><b>Type Articulation Marine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeArticulationMarineImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeArticulationMarineImpl#getDomaineLutte <em>Domaine Lutte</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeArticulationMarineImpl#getEtatMouvement <em>Etat Mouvement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeArticulationMarineImpl#getAPourBatimentsParticipantsBatiment <em>APour Batiments Participants Batiment</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeArticulationMarineImpl#getAPourCompositionTypeBatimentParticipant <em>APour Composition Type Batiment Participant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeArticulationMarineImpl extends TypeArticulationImpl implements TypeArticulationMarine {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoArticulationMarineCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoArticulationMarineCategorie.GRNAVY;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoArticulationMarineCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getDomaineLutte() <em>Domaine Lutte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomaineLutte()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoArticulationMarineDomaineLutte DOMAINE_LUTTE_EDEFAULT = TypeDictionaryDicoArticulationMarineDomaineLutte.ATSR;

	/**
	 * The cached value of the '{@link #getDomaineLutte() <em>Domaine Lutte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomaineLutte()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoArticulationMarineDomaineLutte domaineLutte = DOMAINE_LUTTE_EDEFAULT;

	/**
	 * This is true if the Domaine Lutte attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean domaineLutteESet;

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
	 * The cached value of the '{@link #getAPourBatimentsParticipantsBatiment() <em>APour Batiments Participants Batiment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourBatimentsParticipantsBatiment()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourBatimentsParticipantsBatiment;

	/**
	 * The cached value of the '{@link #getAPourCompositionTypeBatimentParticipant() <em>APour Composition Type Batiment Participant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCompositionTypeBatimentParticipant()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeTypeBatimentParticipant> aPourCompositionTypeBatimentParticipant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeArticulationMarineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeArticulationMarine();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoArticulationMarineCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoArticulationMarineCategorie newCategorie) {
		TypeDictionaryDicoArticulationMarineCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ARTICULATION_MARINE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoArticulationMarineCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ARTICULATION_MARINE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeDictionaryDicoArticulationMarineDomaineLutte getDomaineLutte() {
		return domaineLutte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomaineLutte(TypeDictionaryDicoArticulationMarineDomaineLutte newDomaineLutte) {
		TypeDictionaryDicoArticulationMarineDomaineLutte oldDomaineLutte = domaineLutte;
		domaineLutte = newDomaineLutte == null ? DOMAINE_LUTTE_EDEFAULT : newDomaineLutte;
		boolean oldDomaineLutteESet = domaineLutteESet;
		domaineLutteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ARTICULATION_MARINE__DOMAINE_LUTTE, oldDomaineLutte, domaineLutte, !oldDomaineLutteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDomaineLutte() {
		TypeDictionaryDicoArticulationMarineDomaineLutte oldDomaineLutte = domaineLutte;
		boolean oldDomaineLutteESet = domaineLutteESet;
		domaineLutte = DOMAINE_LUTTE_EDEFAULT;
		domaineLutteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ARTICULATION_MARINE__DOMAINE_LUTTE, oldDomaineLutte, DOMAINE_LUTTE_EDEFAULT, oldDomaineLutteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDomaineLutte() {
		return domaineLutteESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ARTICULATION_MARINE__ETAT_MOUVEMENT, oldEtatMouvement, etatMouvement, !oldEtatMouvementESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ARTICULATION_MARINE__ETAT_MOUVEMENT, oldEtatMouvement, ETAT_MOUVEMENT_EDEFAULT, oldEtatMouvementESet));
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
	public EList<TypeAssociation> getAPourBatimentsParticipantsBatiment() {
		if (aPourBatimentsParticipantsBatiment == null) {
			aPourBatimentsParticipantsBatiment = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ARTICULATION_MARINE__APOUR_BATIMENTS_PARTICIPANTS_BATIMENT);
		}
		return aPourBatimentsParticipantsBatiment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTypeBatimentParticipant> getAPourCompositionTypeBatimentParticipant() {
		if (aPourCompositionTypeBatimentParticipant == null) {
			aPourCompositionTypeBatimentParticipant = new EObjectContainmentEList<TypeTypeBatimentParticipant>(TypeTypeBatimentParticipant.class, this, SchemaPackage.TYPE_ARTICULATION_MARINE__APOUR_COMPOSITION_TYPE_BATIMENT_PARTICIPANT);
		}
		return aPourCompositionTypeBatimentParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ARTICULATION_MARINE__APOUR_BATIMENTS_PARTICIPANTS_BATIMENT:
				return ((InternalEList<?>)getAPourBatimentsParticipantsBatiment()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ARTICULATION_MARINE__APOUR_COMPOSITION_TYPE_BATIMENT_PARTICIPANT:
				return ((InternalEList<?>)getAPourCompositionTypeBatimentParticipant()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_ARTICULATION_MARINE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ARTICULATION_MARINE__DOMAINE_LUTTE:
				return getDomaineLutte();
			case SchemaPackage.TYPE_ARTICULATION_MARINE__ETAT_MOUVEMENT:
				return getEtatMouvement();
			case SchemaPackage.TYPE_ARTICULATION_MARINE__APOUR_BATIMENTS_PARTICIPANTS_BATIMENT:
				return getAPourBatimentsParticipantsBatiment();
			case SchemaPackage.TYPE_ARTICULATION_MARINE__APOUR_COMPOSITION_TYPE_BATIMENT_PARTICIPANT:
				return getAPourCompositionTypeBatimentParticipant();
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
			case SchemaPackage.TYPE_ARTICULATION_MARINE__CATEGORIE:
				setCategorie((TypeDictionaryDicoArticulationMarineCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ARTICULATION_MARINE__DOMAINE_LUTTE:
				setDomaineLutte((TypeDictionaryDicoArticulationMarineDomaineLutte)newValue);
				return;
			case SchemaPackage.TYPE_ARTICULATION_MARINE__ETAT_MOUVEMENT:
				setEtatMouvement((TypeDictionaryDicoEtatMouvement)newValue);
				return;
			case SchemaPackage.TYPE_ARTICULATION_MARINE__APOUR_BATIMENTS_PARTICIPANTS_BATIMENT:
				getAPourBatimentsParticipantsBatiment().clear();
				getAPourBatimentsParticipantsBatiment().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ARTICULATION_MARINE__APOUR_COMPOSITION_TYPE_BATIMENT_PARTICIPANT:
				getAPourCompositionTypeBatimentParticipant().clear();
				getAPourCompositionTypeBatimentParticipant().addAll((Collection<? extends TypeTypeBatimentParticipant>)newValue);
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
			case SchemaPackage.TYPE_ARTICULATION_MARINE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ARTICULATION_MARINE__DOMAINE_LUTTE:
				unsetDomaineLutte();
				return;
			case SchemaPackage.TYPE_ARTICULATION_MARINE__ETAT_MOUVEMENT:
				unsetEtatMouvement();
				return;
			case SchemaPackage.TYPE_ARTICULATION_MARINE__APOUR_BATIMENTS_PARTICIPANTS_BATIMENT:
				getAPourBatimentsParticipantsBatiment().clear();
				return;
			case SchemaPackage.TYPE_ARTICULATION_MARINE__APOUR_COMPOSITION_TYPE_BATIMENT_PARTICIPANT:
				getAPourCompositionTypeBatimentParticipant().clear();
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
			case SchemaPackage.TYPE_ARTICULATION_MARINE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ARTICULATION_MARINE__DOMAINE_LUTTE:
				return isSetDomaineLutte();
			case SchemaPackage.TYPE_ARTICULATION_MARINE__ETAT_MOUVEMENT:
				return isSetEtatMouvement();
			case SchemaPackage.TYPE_ARTICULATION_MARINE__APOUR_BATIMENTS_PARTICIPANTS_BATIMENT:
				return aPourBatimentsParticipantsBatiment != null && !aPourBatimentsParticipantsBatiment.isEmpty();
			case SchemaPackage.TYPE_ARTICULATION_MARINE__APOUR_COMPOSITION_TYPE_BATIMENT_PARTICIPANT:
				return aPourCompositionTypeBatimentParticipant != null && !aPourCompositionTypeBatimentParticipant.isEmpty();
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
		result.append(", domaineLutte: ");
		if (domaineLutteESet) result.append(domaineLutte); else result.append("<unset>");
		result.append(", etatMouvement: ");
		if (etatMouvementESet) result.append(etatMouvement); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeArticulationMarineImpl
