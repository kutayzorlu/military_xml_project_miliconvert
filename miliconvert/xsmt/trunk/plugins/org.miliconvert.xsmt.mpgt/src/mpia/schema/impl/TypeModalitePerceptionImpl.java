/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoZoneLogistiqueType;
import mpia.schema.TypeModalitePerception;
import mpia.schema.TypeRessourceAttendue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Modalite Perception</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeModalitePerceptionImpl#getDateDeDebut <em>Date De Debut</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModalitePerceptionImpl#getTypeFormationLogistique <em>Type Formation Logistique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModalitePerceptionImpl#getComplement <em>Complement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModalitePerceptionImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModalitePerceptionImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModalitePerceptionImpl#getACommeRessourceRavitaillementRessourceAttendue <em>AComme Ressource Ravitaillement Ressource Attendue</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModalitePerceptionImpl#getAPourBeneficiaireUnite <em>APour Beneficiaire Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModalitePerceptionImpl#getAPourBeneficiaireItineraire <em>APour Beneficiaire Itineraire</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeModalitePerceptionImpl extends EObjectImpl implements TypeModalitePerception {
	/**
	 * The default value of the '{@link #getDateDeDebut() <em>Date De Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDeDebut()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_DE_DEBUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateDeDebut() <em>Date De Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDeDebut()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateDeDebut = DATE_DE_DEBUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeFormationLogistique() <em>Type Formation Logistique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeFormationLogistique()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoZoneLogistiqueType TYPE_FORMATION_LOGISTIQUE_EDEFAULT = TypeDictionaryDicoZoneLogistiqueType.TLA;

	/**
	 * The cached value of the '{@link #getTypeFormationLogistique() <em>Type Formation Logistique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeFormationLogistique()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoZoneLogistiqueType typeFormationLogistique = TYPE_FORMATION_LOGISTIQUE_EDEFAULT;

	/**
	 * This is true if the Type Formation Logistique attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeFormationLogistiqueESet;

	/**
	 * The default value of the '{@link #getComplement() <em>Complement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplement()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPLEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComplement() <em>Complement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplement()
	 * @generated
	 * @ordered
	 */
	protected String complement = COMPLEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCTE() <em>CTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCTE()
	 * @generated
	 * @ordered
	 */
	protected static final String CTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCTE() <em>CTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCTE()
	 * @generated
	 * @ordered
	 */
	protected String cTE = CTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCE() <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCE()
	 * @generated
	 * @ordered
	 */
	protected static final String CE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCE() <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCE()
	 * @generated
	 * @ordered
	 */
	protected String cE = CE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getACommeRessourceRavitaillementRessourceAttendue() <em>AComme Ressource Ravitaillement Ressource Attendue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeRessourceRavitaillementRessourceAttendue()
	 * @generated
	 * @ordered
	 */
	protected TypeRessourceAttendue aCommeRessourceRavitaillementRessourceAttendue;

	/**
	 * The cached value of the '{@link #getAPourBeneficiaireUnite() <em>APour Beneficiaire Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourBeneficiaireUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociationEXT> aPourBeneficiaireUnite;

	/**
	 * The cached value of the '{@link #getAPourBeneficiaireItineraire() <em>APour Beneficiaire Itineraire</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourBeneficiaireItineraire()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourBeneficiaireItineraire;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeModalitePerceptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeModalitePerception();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateDeDebut() {
		return dateDeDebut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDeDebut(XMLGregorianCalendar newDateDeDebut) {
		XMLGregorianCalendar oldDateDeDebut = dateDeDebut;
		dateDeDebut = newDateDeDebut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITE_PERCEPTION__DATE_DE_DEBUT, oldDateDeDebut, dateDeDebut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoZoneLogistiqueType getTypeFormationLogistique() {
		return typeFormationLogistique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeFormationLogistique(TypeDictionaryDicoZoneLogistiqueType newTypeFormationLogistique) {
		TypeDictionaryDicoZoneLogistiqueType oldTypeFormationLogistique = typeFormationLogistique;
		typeFormationLogistique = newTypeFormationLogistique == null ? TYPE_FORMATION_LOGISTIQUE_EDEFAULT : newTypeFormationLogistique;
		boolean oldTypeFormationLogistiqueESet = typeFormationLogistiqueESet;
		typeFormationLogistiqueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITE_PERCEPTION__TYPE_FORMATION_LOGISTIQUE, oldTypeFormationLogistique, typeFormationLogistique, !oldTypeFormationLogistiqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeFormationLogistique() {
		TypeDictionaryDicoZoneLogistiqueType oldTypeFormationLogistique = typeFormationLogistique;
		boolean oldTypeFormationLogistiqueESet = typeFormationLogistiqueESet;
		typeFormationLogistique = TYPE_FORMATION_LOGISTIQUE_EDEFAULT;
		typeFormationLogistiqueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MODALITE_PERCEPTION__TYPE_FORMATION_LOGISTIQUE, oldTypeFormationLogistique, TYPE_FORMATION_LOGISTIQUE_EDEFAULT, oldTypeFormationLogistiqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeFormationLogistique() {
		return typeFormationLogistiqueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComplement() {
		return complement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplement(String newComplement) {
		String oldComplement = complement;
		complement = newComplement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITE_PERCEPTION__COMPLEMENT, oldComplement, complement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCTE() {
		return cTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCTE(String newCTE) {
		String oldCTE = cTE;
		cTE = newCTE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITE_PERCEPTION__CTE, oldCTE, cTE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCE() {
		return cE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCE(String newCE) {
		String oldCE = cE;
		cE = newCE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITE_PERCEPTION__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRessourceAttendue getACommeRessourceRavitaillementRessourceAttendue() {
		return aCommeRessourceRavitaillementRessourceAttendue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeRessourceRavitaillementRessourceAttendue(TypeRessourceAttendue newACommeRessourceRavitaillementRessourceAttendue, NotificationChain msgs) {
		TypeRessourceAttendue oldACommeRessourceRavitaillementRessourceAttendue = aCommeRessourceRavitaillementRessourceAttendue;
		aCommeRessourceRavitaillementRessourceAttendue = newACommeRessourceRavitaillementRessourceAttendue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITE_PERCEPTION__ACOMME_RESSOURCE_RAVITAILLEMENT_RESSOURCE_ATTENDUE, oldACommeRessourceRavitaillementRessourceAttendue, newACommeRessourceRavitaillementRessourceAttendue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeRessourceRavitaillementRessourceAttendue(TypeRessourceAttendue newACommeRessourceRavitaillementRessourceAttendue) {
		if (newACommeRessourceRavitaillementRessourceAttendue != aCommeRessourceRavitaillementRessourceAttendue) {
			NotificationChain msgs = null;
			if (aCommeRessourceRavitaillementRessourceAttendue != null)
				msgs = ((InternalEObject)aCommeRessourceRavitaillementRessourceAttendue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MODALITE_PERCEPTION__ACOMME_RESSOURCE_RAVITAILLEMENT_RESSOURCE_ATTENDUE, null, msgs);
			if (newACommeRessourceRavitaillementRessourceAttendue != null)
				msgs = ((InternalEObject)newACommeRessourceRavitaillementRessourceAttendue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MODALITE_PERCEPTION__ACOMME_RESSOURCE_RAVITAILLEMENT_RESSOURCE_ATTENDUE, null, msgs);
			msgs = basicSetACommeRessourceRavitaillementRessourceAttendue(newACommeRessourceRavitaillementRessourceAttendue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITE_PERCEPTION__ACOMME_RESSOURCE_RAVITAILLEMENT_RESSOURCE_ATTENDUE, newACommeRessourceRavitaillementRessourceAttendue, newACommeRessourceRavitaillementRessourceAttendue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEXT> getAPourBeneficiaireUnite() {
		if (aPourBeneficiaireUnite == null) {
			aPourBeneficiaireUnite = new EObjectContainmentEList<TypeAssociationEXT>(TypeAssociationEXT.class, this, SchemaPackage.TYPE_MODALITE_PERCEPTION__APOUR_BENEFICIAIRE_UNITE);
		}
		return aPourBeneficiaireUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourBeneficiaireItineraire() {
		if (aPourBeneficiaireItineraire == null) {
			aPourBeneficiaireItineraire = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MODALITE_PERCEPTION__APOUR_BENEFICIAIRE_ITINERAIRE);
		}
		return aPourBeneficiaireItineraire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MODALITE_PERCEPTION__ACOMME_RESSOURCE_RAVITAILLEMENT_RESSOURCE_ATTENDUE:
				return basicSetACommeRessourceRavitaillementRessourceAttendue(null, msgs);
			case SchemaPackage.TYPE_MODALITE_PERCEPTION__APOUR_BENEFICIAIRE_UNITE:
				return ((InternalEList<?>)getAPourBeneficiaireUnite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MODALITE_PERCEPTION__APOUR_BENEFICIAIRE_ITINERAIRE:
				return ((InternalEList<?>)getAPourBeneficiaireItineraire()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_MODALITE_PERCEPTION__DATE_DE_DEBUT:
				return getDateDeDebut();
			case SchemaPackage.TYPE_MODALITE_PERCEPTION__TYPE_FORMATION_LOGISTIQUE:
				return getTypeFormationLogistique();
			case SchemaPackage.TYPE_MODALITE_PERCEPTION__COMPLEMENT:
				return getComplement();
			case SchemaPackage.TYPE_MODALITE_PERCEPTION__CTE:
				return getCTE();
			case SchemaPackage.TYPE_MODALITE_PERCEPTION__CE:
				return getCE();
			case SchemaPackage.TYPE_MODALITE_PERCEPTION__ACOMME_RESSOURCE_RAVITAILLEMENT_RESSOURCE_ATTENDUE:
				return getACommeRessourceRavitaillementRessourceAttendue();
			case SchemaPackage.TYPE_MODALITE_PERCEPTION__APOUR_BENEFICIAIRE_UNITE:
				return getAPourBeneficiaireUnite();
			case SchemaPackage.TYPE_MODALITE_PERCEPTION__APOUR_BENEFICIAIRE_ITINERAIRE:
				return getAPourBeneficiaireItineraire();
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
			case SchemaPackage.TYPE_MODALITE_PERCEPTION__DATE_DE_DEBUT:
				setDateDeDebut((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_MODALITE_PERCEPTION__TYPE_FORMATION_LOGISTIQUE:
				setTypeFormationLogistique((TypeDictionaryDicoZoneLogistiqueType)newValue);
				return;
			case SchemaPackage.TYPE_MODALITE_PERCEPTION__COMPLEMENT:
				setComplement((String)newValue);
				return;
			case SchemaPackage.TYPE_MODALITE_PERCEPTION__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_MODALITE_PERCEPTION__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_MODALITE_PERCEPTION__ACOMME_RESSOURCE_RAVITAILLEMENT_RESSOURCE_ATTENDUE:
				setACommeRessourceRavitaillementRessourceAttendue((TypeRessourceAttendue)newValue);
				return;
			case SchemaPackage.TYPE_MODALITE_PERCEPTION__APOUR_BENEFICIAIRE_UNITE:
				getAPourBeneficiaireUnite().clear();
				getAPourBeneficiaireUnite().addAll((Collection<? extends TypeAssociationEXT>)newValue);
				return;
			case SchemaPackage.TYPE_MODALITE_PERCEPTION__APOUR_BENEFICIAIRE_ITINERAIRE:
				getAPourBeneficiaireItineraire().clear();
				getAPourBeneficiaireItineraire().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_MODALITE_PERCEPTION__DATE_DE_DEBUT:
				setDateDeDebut(DATE_DE_DEBUT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MODALITE_PERCEPTION__TYPE_FORMATION_LOGISTIQUE:
				unsetTypeFormationLogistique();
				return;
			case SchemaPackage.TYPE_MODALITE_PERCEPTION__COMPLEMENT:
				setComplement(COMPLEMENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MODALITE_PERCEPTION__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MODALITE_PERCEPTION__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MODALITE_PERCEPTION__ACOMME_RESSOURCE_RAVITAILLEMENT_RESSOURCE_ATTENDUE:
				setACommeRessourceRavitaillementRessourceAttendue((TypeRessourceAttendue)null);
				return;
			case SchemaPackage.TYPE_MODALITE_PERCEPTION__APOUR_BENEFICIAIRE_UNITE:
				getAPourBeneficiaireUnite().clear();
				return;
			case SchemaPackage.TYPE_MODALITE_PERCEPTION__APOUR_BENEFICIAIRE_ITINERAIRE:
				getAPourBeneficiaireItineraire().clear();
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
			case SchemaPackage.TYPE_MODALITE_PERCEPTION__DATE_DE_DEBUT:
				return DATE_DE_DEBUT_EDEFAULT == null ? dateDeDebut != null : !DATE_DE_DEBUT_EDEFAULT.equals(dateDeDebut);
			case SchemaPackage.TYPE_MODALITE_PERCEPTION__TYPE_FORMATION_LOGISTIQUE:
				return isSetTypeFormationLogistique();
			case SchemaPackage.TYPE_MODALITE_PERCEPTION__COMPLEMENT:
				return COMPLEMENT_EDEFAULT == null ? complement != null : !COMPLEMENT_EDEFAULT.equals(complement);
			case SchemaPackage.TYPE_MODALITE_PERCEPTION__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_MODALITE_PERCEPTION__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_MODALITE_PERCEPTION__ACOMME_RESSOURCE_RAVITAILLEMENT_RESSOURCE_ATTENDUE:
				return aCommeRessourceRavitaillementRessourceAttendue != null;
			case SchemaPackage.TYPE_MODALITE_PERCEPTION__APOUR_BENEFICIAIRE_UNITE:
				return aPourBeneficiaireUnite != null && !aPourBeneficiaireUnite.isEmpty();
			case SchemaPackage.TYPE_MODALITE_PERCEPTION__APOUR_BENEFICIAIRE_ITINERAIRE:
				return aPourBeneficiaireItineraire != null && !aPourBeneficiaireItineraire.isEmpty();
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
		result.append(" (dateDeDebut: ");
		result.append(dateDeDebut);
		result.append(", typeFormationLogistique: ");
		if (typeFormationLogistiqueESet) result.append(typeFormationLogistique); else result.append("<unset>");
		result.append(", complement: ");
		result.append(complement);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeModalitePerceptionImpl
