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
import mpia.schema.TypeMissionEscorteOuAppuiFeu;

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
 * An implementation of the model object '<em><b>Type Mission Escorte Ou Appui Feu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMissionEscorteOuAppuiFeuImpl#getTypeDefense <em>Type Defense</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionEscorteOuAppuiFeuImpl#getMoyenContact <em>Moyen Contact</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionEscorteOuAppuiFeuImpl#getEstObjetAssociationUniteMissionEscorteAF <em>Est Objet Association Unite Mission Escorte AF</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionEscorteOuAppuiFeuImpl#getAPourItinerairesADefendreOuABattreItineraire <em>APour Itineraires ADefendre Ou ABattre Itineraire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionEscorteOuAppuiFeuImpl#getAPourZonesADefendreOuABattreAutreElementControle <em>APour Zones ADefendre Ou ABattre Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionEscorteOuAppuiFeuImpl#getAPourLieuDeContactAutreElementControle <em>APour Lieu De Contact Autre Element Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMissionEscorteOuAppuiFeuImpl extends TypeMissionImpl implements TypeMissionEscorteOuAppuiFeu {
	/**
	 * The default value of the '{@link #getTypeDefense() <em>Type Defense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDefense()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_DEFENSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeDefense() <em>Type Defense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDefense()
	 * @generated
	 * @ordered
	 */
	protected String typeDefense = TYPE_DEFENSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMoyenContact() <em>Moyen Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyenContact()
	 * @generated
	 * @ordered
	 */
	protected static final String MOYEN_CONTACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMoyenContact() <em>Moyen Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyenContact()
	 * @generated
	 * @ordered
	 */
	protected String moyenContact = MOYEN_CONTACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationUniteMissionEscorteAF() <em>Est Objet Association Unite Mission Escorte AF</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationUniteMissionEscorteAF()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationUniteMissionEscorteAF;

	/**
	 * The cached value of the '{@link #getAPourItinerairesADefendreOuABattreItineraire() <em>APour Itineraires ADefendre Ou ABattre Itineraire</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourItinerairesADefendreOuABattreItineraire()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourItinerairesADefendreOuABattreItineraire;

	/**
	 * The cached value of the '{@link #getAPourZonesADefendreOuABattreAutreElementControle() <em>APour Zones ADefendre Ou ABattre Autre Element Controle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourZonesADefendreOuABattreAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourZonesADefendreOuABattreAutreElementControle;

	/**
	 * The cached value of the '{@link #getAPourLieuDeContactAutreElementControle() <em>APour Lieu De Contact Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourLieuDeContactAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourLieuDeContactAutreElementControle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMissionEscorteOuAppuiFeuImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMissionEscorteOuAppuiFeu();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeDefense() {
		return typeDefense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeDefense(String newTypeDefense) {
		String oldTypeDefense = typeDefense;
		typeDefense = newTypeDefense;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_ESCORTE_OU_APPUI_FEU__TYPE_DEFENSE, oldTypeDefense, typeDefense));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMoyenContact() {
		return moyenContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoyenContact(String newMoyenContact) {
		String oldMoyenContact = moyenContact;
		moyenContact = newMoyenContact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_ESCORTE_OU_APPUI_FEU__MOYEN_CONTACT, oldMoyenContact, moyenContact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationUniteMissionEscorteAF() {
		if (estObjetAssociationUniteMissionEscorteAF == null) {
			estObjetAssociationUniteMissionEscorteAF = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_ESCORTE_OU_APPUI_FEU__EST_OBJET_ASSOCIATION_UNITE_MISSION_ESCORTE_AF);
		}
		return estObjetAssociationUniteMissionEscorteAF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourItinerairesADefendreOuABattreItineraire() {
		if (aPourItinerairesADefendreOuABattreItineraire == null) {
			aPourItinerairesADefendreOuABattreItineraire = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_ESCORTE_OU_APPUI_FEU__APOUR_ITINERAIRES_ADEFENDRE_OU_ABATTRE_ITINERAIRE);
		}
		return aPourItinerairesADefendreOuABattreItineraire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourZonesADefendreOuABattreAutreElementControle() {
		if (aPourZonesADefendreOuABattreAutreElementControle == null) {
			aPourZonesADefendreOuABattreAutreElementControle = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_ESCORTE_OU_APPUI_FEU__APOUR_ZONES_ADEFENDRE_OU_ABATTRE_AUTRE_ELEMENT_CONTROLE);
		}
		return aPourZonesADefendreOuABattreAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourLieuDeContactAutreElementControle() {
		return aPourLieuDeContactAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourLieuDeContactAutreElementControle(TypeAssociation newAPourLieuDeContactAutreElementControle, NotificationChain msgs) {
		TypeAssociation oldAPourLieuDeContactAutreElementControle = aPourLieuDeContactAutreElementControle;
		aPourLieuDeContactAutreElementControle = newAPourLieuDeContactAutreElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_ESCORTE_OU_APPUI_FEU__APOUR_LIEU_DE_CONTACT_AUTRE_ELEMENT_CONTROLE, oldAPourLieuDeContactAutreElementControle, newAPourLieuDeContactAutreElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourLieuDeContactAutreElementControle(TypeAssociation newAPourLieuDeContactAutreElementControle) {
		if (newAPourLieuDeContactAutreElementControle != aPourLieuDeContactAutreElementControle) {
			NotificationChain msgs = null;
			if (aPourLieuDeContactAutreElementControle != null)
				msgs = ((InternalEObject)aPourLieuDeContactAutreElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_ESCORTE_OU_APPUI_FEU__APOUR_LIEU_DE_CONTACT_AUTRE_ELEMENT_CONTROLE, null, msgs);
			if (newAPourLieuDeContactAutreElementControle != null)
				msgs = ((InternalEObject)newAPourLieuDeContactAutreElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_ESCORTE_OU_APPUI_FEU__APOUR_LIEU_DE_CONTACT_AUTRE_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetAPourLieuDeContactAutreElementControle(newAPourLieuDeContactAutreElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_ESCORTE_OU_APPUI_FEU__APOUR_LIEU_DE_CONTACT_AUTRE_ELEMENT_CONTROLE, newAPourLieuDeContactAutreElementControle, newAPourLieuDeContactAutreElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MISSION_ESCORTE_OU_APPUI_FEU__EST_OBJET_ASSOCIATION_UNITE_MISSION_ESCORTE_AF:
				return ((InternalEList<?>)getEstObjetAssociationUniteMissionEscorteAF()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_ESCORTE_OU_APPUI_FEU__APOUR_ITINERAIRES_ADEFENDRE_OU_ABATTRE_ITINERAIRE:
				return ((InternalEList<?>)getAPourItinerairesADefendreOuABattreItineraire()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_ESCORTE_OU_APPUI_FEU__APOUR_ZONES_ADEFENDRE_OU_ABATTRE_AUTRE_ELEMENT_CONTROLE:
				return ((InternalEList<?>)getAPourZonesADefendreOuABattreAutreElementControle()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_ESCORTE_OU_APPUI_FEU__APOUR_LIEU_DE_CONTACT_AUTRE_ELEMENT_CONTROLE:
				return basicSetAPourLieuDeContactAutreElementControle(null, msgs);
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
			case SchemaPackage.TYPE_MISSION_ESCORTE_OU_APPUI_FEU__TYPE_DEFENSE:
				return getTypeDefense();
			case SchemaPackage.TYPE_MISSION_ESCORTE_OU_APPUI_FEU__MOYEN_CONTACT:
				return getMoyenContact();
			case SchemaPackage.TYPE_MISSION_ESCORTE_OU_APPUI_FEU__EST_OBJET_ASSOCIATION_UNITE_MISSION_ESCORTE_AF:
				return getEstObjetAssociationUniteMissionEscorteAF();
			case SchemaPackage.TYPE_MISSION_ESCORTE_OU_APPUI_FEU__APOUR_ITINERAIRES_ADEFENDRE_OU_ABATTRE_ITINERAIRE:
				return getAPourItinerairesADefendreOuABattreItineraire();
			case SchemaPackage.TYPE_MISSION_ESCORTE_OU_APPUI_FEU__APOUR_ZONES_ADEFENDRE_OU_ABATTRE_AUTRE_ELEMENT_CONTROLE:
				return getAPourZonesADefendreOuABattreAutreElementControle();
			case SchemaPackage.TYPE_MISSION_ESCORTE_OU_APPUI_FEU__APOUR_LIEU_DE_CONTACT_AUTRE_ELEMENT_CONTROLE:
				return getAPourLieuDeContactAutreElementControle();
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
			case SchemaPackage.TYPE_MISSION_ESCORTE_OU_APPUI_FEU__TYPE_DEFENSE:
				setTypeDefense((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ESCORTE_OU_APPUI_FEU__MOYEN_CONTACT:
				setMoyenContact((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ESCORTE_OU_APPUI_FEU__EST_OBJET_ASSOCIATION_UNITE_MISSION_ESCORTE_AF:
				getEstObjetAssociationUniteMissionEscorteAF().clear();
				getEstObjetAssociationUniteMissionEscorteAF().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ESCORTE_OU_APPUI_FEU__APOUR_ITINERAIRES_ADEFENDRE_OU_ABATTRE_ITINERAIRE:
				getAPourItinerairesADefendreOuABattreItineraire().clear();
				getAPourItinerairesADefendreOuABattreItineraire().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ESCORTE_OU_APPUI_FEU__APOUR_ZONES_ADEFENDRE_OU_ABATTRE_AUTRE_ELEMENT_CONTROLE:
				getAPourZonesADefendreOuABattreAutreElementControle().clear();
				getAPourZonesADefendreOuABattreAutreElementControle().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_ESCORTE_OU_APPUI_FEU__APOUR_LIEU_DE_CONTACT_AUTRE_ELEMENT_CONTROLE:
				setAPourLieuDeContactAutreElementControle((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_MISSION_ESCORTE_OU_APPUI_FEU__TYPE_DEFENSE:
				setTypeDefense(TYPE_DEFENSE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_ESCORTE_OU_APPUI_FEU__MOYEN_CONTACT:
				setMoyenContact(MOYEN_CONTACT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_ESCORTE_OU_APPUI_FEU__EST_OBJET_ASSOCIATION_UNITE_MISSION_ESCORTE_AF:
				getEstObjetAssociationUniteMissionEscorteAF().clear();
				return;
			case SchemaPackage.TYPE_MISSION_ESCORTE_OU_APPUI_FEU__APOUR_ITINERAIRES_ADEFENDRE_OU_ABATTRE_ITINERAIRE:
				getAPourItinerairesADefendreOuABattreItineraire().clear();
				return;
			case SchemaPackage.TYPE_MISSION_ESCORTE_OU_APPUI_FEU__APOUR_ZONES_ADEFENDRE_OU_ABATTRE_AUTRE_ELEMENT_CONTROLE:
				getAPourZonesADefendreOuABattreAutreElementControle().clear();
				return;
			case SchemaPackage.TYPE_MISSION_ESCORTE_OU_APPUI_FEU__APOUR_LIEU_DE_CONTACT_AUTRE_ELEMENT_CONTROLE:
				setAPourLieuDeContactAutreElementControle((TypeAssociation)null);
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
			case SchemaPackage.TYPE_MISSION_ESCORTE_OU_APPUI_FEU__TYPE_DEFENSE:
				return TYPE_DEFENSE_EDEFAULT == null ? typeDefense != null : !TYPE_DEFENSE_EDEFAULT.equals(typeDefense);
			case SchemaPackage.TYPE_MISSION_ESCORTE_OU_APPUI_FEU__MOYEN_CONTACT:
				return MOYEN_CONTACT_EDEFAULT == null ? moyenContact != null : !MOYEN_CONTACT_EDEFAULT.equals(moyenContact);
			case SchemaPackage.TYPE_MISSION_ESCORTE_OU_APPUI_FEU__EST_OBJET_ASSOCIATION_UNITE_MISSION_ESCORTE_AF:
				return estObjetAssociationUniteMissionEscorteAF != null && !estObjetAssociationUniteMissionEscorteAF.isEmpty();
			case SchemaPackage.TYPE_MISSION_ESCORTE_OU_APPUI_FEU__APOUR_ITINERAIRES_ADEFENDRE_OU_ABATTRE_ITINERAIRE:
				return aPourItinerairesADefendreOuABattreItineraire != null && !aPourItinerairesADefendreOuABattreItineraire.isEmpty();
			case SchemaPackage.TYPE_MISSION_ESCORTE_OU_APPUI_FEU__APOUR_ZONES_ADEFENDRE_OU_ABATTRE_AUTRE_ELEMENT_CONTROLE:
				return aPourZonesADefendreOuABattreAutreElementControle != null && !aPourZonesADefendreOuABattreAutreElementControle.isEmpty();
			case SchemaPackage.TYPE_MISSION_ESCORTE_OU_APPUI_FEU__APOUR_LIEU_DE_CONTACT_AUTRE_ELEMENT_CONTROLE:
				return aPourLieuDeContactAutreElementControle != null;
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
		result.append(" (typeDefense: ");
		result.append(typeDefense);
		result.append(", moyenContact: ");
		result.append(moyenContact);
		result.append(')');
		return result.toString();
	}

} //TypeMissionEscorteOuAppuiFeuImpl
