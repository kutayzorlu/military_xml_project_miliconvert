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
import mpia.schema.TypeDictionaryDicoNatureRejet;
import mpia.schema.TypeRessourceActiviteType;
import mpia.schema.TypeSyntheseDetections;

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
 * An implementation of the model object '<em><b>Type Synthese Detections</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeSyntheseDetectionsImpl#getCodeValidation <em>Code Validation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSyntheseDetectionsImpl#getNatureRejet <em>Nature Rejet</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSyntheseDetectionsImpl#getReferencesGeographiques <em>References Geographiques</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSyntheseDetectionsImpl#getGDHreference <em>GD Hreference</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSyntheseDetectionsImpl#getEstSujetAssociationSyntheseDetectionsEvenementNRBC <em>Est Sujet Association Synthese Detections Evenement NRBC</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSyntheseDetectionsImpl#getEstDetecteParTypeEquipementNRBC <em>Est Detecte Par Type Equipement NRBC</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSyntheseDetectionsImpl#getAPourZonesContamineesReellesAutreElementControle <em>APour Zones Contaminees Reelles Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSyntheseDetectionsImpl#getAPourConditionsMeteoTrancheMeteo <em>APour Conditions Meteo Tranche Meteo</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSyntheseDetectionsImpl#getAPourTypeRessourceRessourceActiviteType <em>APour Type Ressource Ressource Activite Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeSyntheseDetectionsImpl extends TypeActiviteImpl implements TypeSyntheseDetections {
	/**
	 * The default value of the '{@link #getCodeValidation() <em>Code Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeValidation()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_VALIDATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeValidation() <em>Code Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeValidation()
	 * @generated
	 * @ordered
	 */
	protected String codeValidation = CODE_VALIDATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNatureRejet() <em>Nature Rejet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatureRejet()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoNatureRejet NATURE_REJET_EDEFAULT = TypeDictionaryDicoNatureRejet.ARBRST;

	/**
	 * The cached value of the '{@link #getNatureRejet() <em>Nature Rejet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatureRejet()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoNatureRejet natureRejet = NATURE_REJET_EDEFAULT;

	/**
	 * This is true if the Nature Rejet attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean natureRejetESet;

	/**
	 * The default value of the '{@link #getReferencesGeographiques() <em>References Geographiques</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencesGeographiques()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCES_GEOGRAPHIQUES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferencesGeographiques() <em>References Geographiques</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencesGeographiques()
	 * @generated
	 * @ordered
	 */
	protected String referencesGeographiques = REFERENCES_GEOGRAPHIQUES_EDEFAULT;

	/**
	 * The default value of the '{@link #getGDHreference() <em>GD Hreference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHreference()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GD_HREFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGDHreference() <em>GD Hreference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHreference()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gDHreference = GD_HREFERENCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationSyntheseDetectionsEvenementNRBC() <em>Est Sujet Association Synthese Detections Evenement NRBC</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationSyntheseDetectionsEvenementNRBC()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationSyntheseDetectionsEvenementNRBC;

	/**
	 * The cached value of the '{@link #getEstDetecteParTypeEquipementNRBC() <em>Est Detecte Par Type Equipement NRBC</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstDetecteParTypeEquipementNRBC()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociationEXT> estDetecteParTypeEquipementNRBC;

	/**
	 * The cached value of the '{@link #getAPourZonesContamineesReellesAutreElementControle() <em>APour Zones Contaminees Reelles Autre Element Controle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourZonesContamineesReellesAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourZonesContamineesReellesAutreElementControle;

	/**
	 * The cached value of the '{@link #getAPourConditionsMeteoTrancheMeteo() <em>APour Conditions Meteo Tranche Meteo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourConditionsMeteoTrancheMeteo()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourConditionsMeteoTrancheMeteo;

	/**
	 * The cached value of the '{@link #getAPourTypeRessourceRessourceActiviteType() <em>APour Type Ressource Ressource Activite Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourTypeRessourceRessourceActiviteType()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeRessourceActiviteType> aPourTypeRessourceRessourceActiviteType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeSyntheseDetectionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeSyntheseDetections();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeValidation() {
		return codeValidation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeValidation(String newCodeValidation) {
		String oldCodeValidation = codeValidation;
		codeValidation = newCodeValidation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYNTHESE_DETECTIONS__CODE_VALIDATION, oldCodeValidation, codeValidation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoNatureRejet getNatureRejet() {
		return natureRejet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNatureRejet(TypeDictionaryDicoNatureRejet newNatureRejet) {
		TypeDictionaryDicoNatureRejet oldNatureRejet = natureRejet;
		natureRejet = newNatureRejet == null ? NATURE_REJET_EDEFAULT : newNatureRejet;
		boolean oldNatureRejetESet = natureRejetESet;
		natureRejetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYNTHESE_DETECTIONS__NATURE_REJET, oldNatureRejet, natureRejet, !oldNatureRejetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNatureRejet() {
		TypeDictionaryDicoNatureRejet oldNatureRejet = natureRejet;
		boolean oldNatureRejetESet = natureRejetESet;
		natureRejet = NATURE_REJET_EDEFAULT;
		natureRejetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SYNTHESE_DETECTIONS__NATURE_REJET, oldNatureRejet, NATURE_REJET_EDEFAULT, oldNatureRejetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNatureRejet() {
		return natureRejetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferencesGeographiques() {
		return referencesGeographiques;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencesGeographiques(String newReferencesGeographiques) {
		String oldReferencesGeographiques = referencesGeographiques;
		referencesGeographiques = newReferencesGeographiques;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYNTHESE_DETECTIONS__REFERENCES_GEOGRAPHIQUES, oldReferencesGeographiques, referencesGeographiques));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGDHreference() {
		return gDHreference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGDHreference(XMLGregorianCalendar newGDHreference) {
		XMLGregorianCalendar oldGDHreference = gDHreference;
		gDHreference = newGDHreference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYNTHESE_DETECTIONS__GD_HREFERENCE, oldGDHreference, gDHreference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationSyntheseDetectionsEvenementNRBC() {
		if (estSujetAssociationSyntheseDetectionsEvenementNRBC == null) {
			estSujetAssociationSyntheseDetectionsEvenementNRBC = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_SYNTHESE_DETECTIONS__EST_SUJET_ASSOCIATION_SYNTHESE_DETECTIONS_EVENEMENT_NRBC);
		}
		return estSujetAssociationSyntheseDetectionsEvenementNRBC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEXT> getEstDetecteParTypeEquipementNRBC() {
		if (estDetecteParTypeEquipementNRBC == null) {
			estDetecteParTypeEquipementNRBC = new EObjectContainmentEList<TypeAssociationEXT>(TypeAssociationEXT.class, this, SchemaPackage.TYPE_SYNTHESE_DETECTIONS__EST_DETECTE_PAR_TYPE_EQUIPEMENT_NRBC);
		}
		return estDetecteParTypeEquipementNRBC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourZonesContamineesReellesAutreElementControle() {
		if (aPourZonesContamineesReellesAutreElementControle == null) {
			aPourZonesContamineesReellesAutreElementControle = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_SYNTHESE_DETECTIONS__APOUR_ZONES_CONTAMINEES_REELLES_AUTRE_ELEMENT_CONTROLE);
		}
		return aPourZonesContamineesReellesAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourConditionsMeteoTrancheMeteo() {
		if (aPourConditionsMeteoTrancheMeteo == null) {
			aPourConditionsMeteoTrancheMeteo = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_SYNTHESE_DETECTIONS__APOUR_CONDITIONS_METEO_TRANCHE_METEO);
		}
		return aPourConditionsMeteoTrancheMeteo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeRessourceActiviteType> getAPourTypeRessourceRessourceActiviteType() {
		if (aPourTypeRessourceRessourceActiviteType == null) {
			aPourTypeRessourceRessourceActiviteType = new EObjectContainmentEList<TypeRessourceActiviteType>(TypeRessourceActiviteType.class, this, SchemaPackage.TYPE_SYNTHESE_DETECTIONS__APOUR_TYPE_RESSOURCE_RESSOURCE_ACTIVITE_TYPE);
		}
		return aPourTypeRessourceRessourceActiviteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_SYNTHESE_DETECTIONS__EST_SUJET_ASSOCIATION_SYNTHESE_DETECTIONS_EVENEMENT_NRBC:
				return ((InternalEList<?>)getEstSujetAssociationSyntheseDetectionsEvenementNRBC()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_SYNTHESE_DETECTIONS__EST_DETECTE_PAR_TYPE_EQUIPEMENT_NRBC:
				return ((InternalEList<?>)getEstDetecteParTypeEquipementNRBC()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_SYNTHESE_DETECTIONS__APOUR_ZONES_CONTAMINEES_REELLES_AUTRE_ELEMENT_CONTROLE:
				return ((InternalEList<?>)getAPourZonesContamineesReellesAutreElementControle()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_SYNTHESE_DETECTIONS__APOUR_CONDITIONS_METEO_TRANCHE_METEO:
				return ((InternalEList<?>)getAPourConditionsMeteoTrancheMeteo()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_SYNTHESE_DETECTIONS__APOUR_TYPE_RESSOURCE_RESSOURCE_ACTIVITE_TYPE:
				return ((InternalEList<?>)getAPourTypeRessourceRessourceActiviteType()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_SYNTHESE_DETECTIONS__CODE_VALIDATION:
				return getCodeValidation();
			case SchemaPackage.TYPE_SYNTHESE_DETECTIONS__NATURE_REJET:
				return getNatureRejet();
			case SchemaPackage.TYPE_SYNTHESE_DETECTIONS__REFERENCES_GEOGRAPHIQUES:
				return getReferencesGeographiques();
			case SchemaPackage.TYPE_SYNTHESE_DETECTIONS__GD_HREFERENCE:
				return getGDHreference();
			case SchemaPackage.TYPE_SYNTHESE_DETECTIONS__EST_SUJET_ASSOCIATION_SYNTHESE_DETECTIONS_EVENEMENT_NRBC:
				return getEstSujetAssociationSyntheseDetectionsEvenementNRBC();
			case SchemaPackage.TYPE_SYNTHESE_DETECTIONS__EST_DETECTE_PAR_TYPE_EQUIPEMENT_NRBC:
				return getEstDetecteParTypeEquipementNRBC();
			case SchemaPackage.TYPE_SYNTHESE_DETECTIONS__APOUR_ZONES_CONTAMINEES_REELLES_AUTRE_ELEMENT_CONTROLE:
				return getAPourZonesContamineesReellesAutreElementControle();
			case SchemaPackage.TYPE_SYNTHESE_DETECTIONS__APOUR_CONDITIONS_METEO_TRANCHE_METEO:
				return getAPourConditionsMeteoTrancheMeteo();
			case SchemaPackage.TYPE_SYNTHESE_DETECTIONS__APOUR_TYPE_RESSOURCE_RESSOURCE_ACTIVITE_TYPE:
				return getAPourTypeRessourceRessourceActiviteType();
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
			case SchemaPackage.TYPE_SYNTHESE_DETECTIONS__CODE_VALIDATION:
				setCodeValidation((String)newValue);
				return;
			case SchemaPackage.TYPE_SYNTHESE_DETECTIONS__NATURE_REJET:
				setNatureRejet((TypeDictionaryDicoNatureRejet)newValue);
				return;
			case SchemaPackage.TYPE_SYNTHESE_DETECTIONS__REFERENCES_GEOGRAPHIQUES:
				setReferencesGeographiques((String)newValue);
				return;
			case SchemaPackage.TYPE_SYNTHESE_DETECTIONS__GD_HREFERENCE:
				setGDHreference((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_SYNTHESE_DETECTIONS__EST_SUJET_ASSOCIATION_SYNTHESE_DETECTIONS_EVENEMENT_NRBC:
				getEstSujetAssociationSyntheseDetectionsEvenementNRBC().clear();
				getEstSujetAssociationSyntheseDetectionsEvenementNRBC().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_SYNTHESE_DETECTIONS__EST_DETECTE_PAR_TYPE_EQUIPEMENT_NRBC:
				getEstDetecteParTypeEquipementNRBC().clear();
				getEstDetecteParTypeEquipementNRBC().addAll((Collection<? extends TypeAssociationEXT>)newValue);
				return;
			case SchemaPackage.TYPE_SYNTHESE_DETECTIONS__APOUR_ZONES_CONTAMINEES_REELLES_AUTRE_ELEMENT_CONTROLE:
				getAPourZonesContamineesReellesAutreElementControle().clear();
				getAPourZonesContamineesReellesAutreElementControle().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_SYNTHESE_DETECTIONS__APOUR_CONDITIONS_METEO_TRANCHE_METEO:
				getAPourConditionsMeteoTrancheMeteo().clear();
				getAPourConditionsMeteoTrancheMeteo().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_SYNTHESE_DETECTIONS__APOUR_TYPE_RESSOURCE_RESSOURCE_ACTIVITE_TYPE:
				getAPourTypeRessourceRessourceActiviteType().clear();
				getAPourTypeRessourceRessourceActiviteType().addAll((Collection<? extends TypeRessourceActiviteType>)newValue);
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
			case SchemaPackage.TYPE_SYNTHESE_DETECTIONS__CODE_VALIDATION:
				setCodeValidation(CODE_VALIDATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SYNTHESE_DETECTIONS__NATURE_REJET:
				unsetNatureRejet();
				return;
			case SchemaPackage.TYPE_SYNTHESE_DETECTIONS__REFERENCES_GEOGRAPHIQUES:
				setReferencesGeographiques(REFERENCES_GEOGRAPHIQUES_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SYNTHESE_DETECTIONS__GD_HREFERENCE:
				setGDHreference(GD_HREFERENCE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SYNTHESE_DETECTIONS__EST_SUJET_ASSOCIATION_SYNTHESE_DETECTIONS_EVENEMENT_NRBC:
				getEstSujetAssociationSyntheseDetectionsEvenementNRBC().clear();
				return;
			case SchemaPackage.TYPE_SYNTHESE_DETECTIONS__EST_DETECTE_PAR_TYPE_EQUIPEMENT_NRBC:
				getEstDetecteParTypeEquipementNRBC().clear();
				return;
			case SchemaPackage.TYPE_SYNTHESE_DETECTIONS__APOUR_ZONES_CONTAMINEES_REELLES_AUTRE_ELEMENT_CONTROLE:
				getAPourZonesContamineesReellesAutreElementControle().clear();
				return;
			case SchemaPackage.TYPE_SYNTHESE_DETECTIONS__APOUR_CONDITIONS_METEO_TRANCHE_METEO:
				getAPourConditionsMeteoTrancheMeteo().clear();
				return;
			case SchemaPackage.TYPE_SYNTHESE_DETECTIONS__APOUR_TYPE_RESSOURCE_RESSOURCE_ACTIVITE_TYPE:
				getAPourTypeRessourceRessourceActiviteType().clear();
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
			case SchemaPackage.TYPE_SYNTHESE_DETECTIONS__CODE_VALIDATION:
				return CODE_VALIDATION_EDEFAULT == null ? codeValidation != null : !CODE_VALIDATION_EDEFAULT.equals(codeValidation);
			case SchemaPackage.TYPE_SYNTHESE_DETECTIONS__NATURE_REJET:
				return isSetNatureRejet();
			case SchemaPackage.TYPE_SYNTHESE_DETECTIONS__REFERENCES_GEOGRAPHIQUES:
				return REFERENCES_GEOGRAPHIQUES_EDEFAULT == null ? referencesGeographiques != null : !REFERENCES_GEOGRAPHIQUES_EDEFAULT.equals(referencesGeographiques);
			case SchemaPackage.TYPE_SYNTHESE_DETECTIONS__GD_HREFERENCE:
				return GD_HREFERENCE_EDEFAULT == null ? gDHreference != null : !GD_HREFERENCE_EDEFAULT.equals(gDHreference);
			case SchemaPackage.TYPE_SYNTHESE_DETECTIONS__EST_SUJET_ASSOCIATION_SYNTHESE_DETECTIONS_EVENEMENT_NRBC:
				return estSujetAssociationSyntheseDetectionsEvenementNRBC != null && !estSujetAssociationSyntheseDetectionsEvenementNRBC.isEmpty();
			case SchemaPackage.TYPE_SYNTHESE_DETECTIONS__EST_DETECTE_PAR_TYPE_EQUIPEMENT_NRBC:
				return estDetecteParTypeEquipementNRBC != null && !estDetecteParTypeEquipementNRBC.isEmpty();
			case SchemaPackage.TYPE_SYNTHESE_DETECTIONS__APOUR_ZONES_CONTAMINEES_REELLES_AUTRE_ELEMENT_CONTROLE:
				return aPourZonesContamineesReellesAutreElementControle != null && !aPourZonesContamineesReellesAutreElementControle.isEmpty();
			case SchemaPackage.TYPE_SYNTHESE_DETECTIONS__APOUR_CONDITIONS_METEO_TRANCHE_METEO:
				return aPourConditionsMeteoTrancheMeteo != null && !aPourConditionsMeteoTrancheMeteo.isEmpty();
			case SchemaPackage.TYPE_SYNTHESE_DETECTIONS__APOUR_TYPE_RESSOURCE_RESSOURCE_ACTIVITE_TYPE:
				return aPourTypeRessourceRessourceActiviteType != null && !aPourTypeRessourceRessourceActiviteType.isEmpty();
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
		result.append(" (codeValidation: ");
		result.append(codeValidation);
		result.append(", natureRejet: ");
		if (natureRejetESet) result.append(natureRejet); else result.append("<unset>");
		result.append(", referencesGeographiques: ");
		result.append(referencesGeographiques);
		result.append(", gDHreference: ");
		result.append(gDHreference);
		result.append(')');
		return result.toString();
	}

} //TypeSyntheseDetectionsImpl
