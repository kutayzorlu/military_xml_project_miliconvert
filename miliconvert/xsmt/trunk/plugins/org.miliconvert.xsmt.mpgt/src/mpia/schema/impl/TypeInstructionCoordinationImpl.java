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
import mpia.schema.TypeInstructionCoordination;

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
 * An implementation of the model object '<em><b>Type Instruction Coordination</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeInstructionCoordinationImpl#getConditionDestructionOuvrageArt <em>Condition Destruction Ouvrage Art</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeInstructionCoordinationImpl#getGDHFourniturePlanMixte <em>GDH Fourniture Plan Mixte</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeInstructionCoordinationImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeInstructionCoordinationImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeInstructionCoordinationImpl#getConcerneUnite <em>Concerne Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeInstructionCoordinationImpl#getAPourAutoriteQualifieeUnite <em>APour Autorite Qualifiee Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeInstructionCoordinationImpl#getAPourZoneObstacleAutreElementControle <em>APour Zone Obstacle Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeInstructionCoordinationImpl#getAPourItineraireReserveItineraire <em>APour Itineraire Reserve Itineraire</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeInstructionCoordinationImpl extends EObjectImpl implements TypeInstructionCoordination {
	/**
	 * The default value of the '{@link #getConditionDestructionOuvrageArt() <em>Condition Destruction Ouvrage Art</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionDestructionOuvrageArt()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_DESTRUCTION_OUVRAGE_ART_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConditionDestructionOuvrageArt() <em>Condition Destruction Ouvrage Art</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionDestructionOuvrageArt()
	 * @generated
	 * @ordered
	 */
	protected String conditionDestructionOuvrageArt = CONDITION_DESTRUCTION_OUVRAGE_ART_EDEFAULT;

	/**
	 * The default value of the '{@link #getGDHFourniturePlanMixte() <em>GDH Fourniture Plan Mixte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHFourniturePlanMixte()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GDH_FOURNITURE_PLAN_MIXTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGDHFourniturePlanMixte() <em>GDH Fourniture Plan Mixte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHFourniturePlanMixte()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gDHFourniturePlanMixte = GDH_FOURNITURE_PLAN_MIXTE_EDEFAULT;

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
	 * The cached value of the '{@link #getConcerneUnite() <em>Concerne Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociationEXT> concerneUnite;

	/**
	 * The cached value of the '{@link #getAPourAutoriteQualifieeUnite() <em>APour Autorite Qualifiee Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourAutoriteQualifieeUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociationEXT> aPourAutoriteQualifieeUnite;

	/**
	 * The cached value of the '{@link #getAPourZoneObstacleAutreElementControle() <em>APour Zone Obstacle Autre Element Controle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourZoneObstacleAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourZoneObstacleAutreElementControle;

	/**
	 * The cached value of the '{@link #getAPourItineraireReserveItineraire() <em>APour Itineraire Reserve Itineraire</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourItineraireReserveItineraire()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourItineraireReserveItineraire;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeInstructionCoordinationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeInstructionCoordination();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConditionDestructionOuvrageArt() {
		return conditionDestructionOuvrageArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionDestructionOuvrageArt(String newConditionDestructionOuvrageArt) {
		String oldConditionDestructionOuvrageArt = conditionDestructionOuvrageArt;
		conditionDestructionOuvrageArt = newConditionDestructionOuvrageArt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INSTRUCTION_COORDINATION__CONDITION_DESTRUCTION_OUVRAGE_ART, oldConditionDestructionOuvrageArt, conditionDestructionOuvrageArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGDHFourniturePlanMixte() {
		return gDHFourniturePlanMixte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGDHFourniturePlanMixte(XMLGregorianCalendar newGDHFourniturePlanMixte) {
		XMLGregorianCalendar oldGDHFourniturePlanMixte = gDHFourniturePlanMixte;
		gDHFourniturePlanMixte = newGDHFourniturePlanMixte;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INSTRUCTION_COORDINATION__GDH_FOURNITURE_PLAN_MIXTE, oldGDHFourniturePlanMixte, gDHFourniturePlanMixte));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INSTRUCTION_COORDINATION__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INSTRUCTION_COORDINATION__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEXT> getConcerneUnite() {
		if (concerneUnite == null) {
			concerneUnite = new EObjectContainmentEList<TypeAssociationEXT>(TypeAssociationEXT.class, this, SchemaPackage.TYPE_INSTRUCTION_COORDINATION__CONCERNE_UNITE);
		}
		return concerneUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEXT> getAPourAutoriteQualifieeUnite() {
		if (aPourAutoriteQualifieeUnite == null) {
			aPourAutoriteQualifieeUnite = new EObjectContainmentEList<TypeAssociationEXT>(TypeAssociationEXT.class, this, SchemaPackage.TYPE_INSTRUCTION_COORDINATION__APOUR_AUTORITE_QUALIFIEE_UNITE);
		}
		return aPourAutoriteQualifieeUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourZoneObstacleAutreElementControle() {
		if (aPourZoneObstacleAutreElementControle == null) {
			aPourZoneObstacleAutreElementControle = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_INSTRUCTION_COORDINATION__APOUR_ZONE_OBSTACLE_AUTRE_ELEMENT_CONTROLE);
		}
		return aPourZoneObstacleAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourItineraireReserveItineraire() {
		if (aPourItineraireReserveItineraire == null) {
			aPourItineraireReserveItineraire = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_INSTRUCTION_COORDINATION__APOUR_ITINERAIRE_RESERVE_ITINERAIRE);
		}
		return aPourItineraireReserveItineraire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_INSTRUCTION_COORDINATION__CONCERNE_UNITE:
				return ((InternalEList<?>)getConcerneUnite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_INSTRUCTION_COORDINATION__APOUR_AUTORITE_QUALIFIEE_UNITE:
				return ((InternalEList<?>)getAPourAutoriteQualifieeUnite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_INSTRUCTION_COORDINATION__APOUR_ZONE_OBSTACLE_AUTRE_ELEMENT_CONTROLE:
				return ((InternalEList<?>)getAPourZoneObstacleAutreElementControle()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_INSTRUCTION_COORDINATION__APOUR_ITINERAIRE_RESERVE_ITINERAIRE:
				return ((InternalEList<?>)getAPourItineraireReserveItineraire()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_INSTRUCTION_COORDINATION__CONDITION_DESTRUCTION_OUVRAGE_ART:
				return getConditionDestructionOuvrageArt();
			case SchemaPackage.TYPE_INSTRUCTION_COORDINATION__GDH_FOURNITURE_PLAN_MIXTE:
				return getGDHFourniturePlanMixte();
			case SchemaPackage.TYPE_INSTRUCTION_COORDINATION__CTE:
				return getCTE();
			case SchemaPackage.TYPE_INSTRUCTION_COORDINATION__CE:
				return getCE();
			case SchemaPackage.TYPE_INSTRUCTION_COORDINATION__CONCERNE_UNITE:
				return getConcerneUnite();
			case SchemaPackage.TYPE_INSTRUCTION_COORDINATION__APOUR_AUTORITE_QUALIFIEE_UNITE:
				return getAPourAutoriteQualifieeUnite();
			case SchemaPackage.TYPE_INSTRUCTION_COORDINATION__APOUR_ZONE_OBSTACLE_AUTRE_ELEMENT_CONTROLE:
				return getAPourZoneObstacleAutreElementControle();
			case SchemaPackage.TYPE_INSTRUCTION_COORDINATION__APOUR_ITINERAIRE_RESERVE_ITINERAIRE:
				return getAPourItineraireReserveItineraire();
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
			case SchemaPackage.TYPE_INSTRUCTION_COORDINATION__CONDITION_DESTRUCTION_OUVRAGE_ART:
				setConditionDestructionOuvrageArt((String)newValue);
				return;
			case SchemaPackage.TYPE_INSTRUCTION_COORDINATION__GDH_FOURNITURE_PLAN_MIXTE:
				setGDHFourniturePlanMixte((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_INSTRUCTION_COORDINATION__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_INSTRUCTION_COORDINATION__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_INSTRUCTION_COORDINATION__CONCERNE_UNITE:
				getConcerneUnite().clear();
				getConcerneUnite().addAll((Collection<? extends TypeAssociationEXT>)newValue);
				return;
			case SchemaPackage.TYPE_INSTRUCTION_COORDINATION__APOUR_AUTORITE_QUALIFIEE_UNITE:
				getAPourAutoriteQualifieeUnite().clear();
				getAPourAutoriteQualifieeUnite().addAll((Collection<? extends TypeAssociationEXT>)newValue);
				return;
			case SchemaPackage.TYPE_INSTRUCTION_COORDINATION__APOUR_ZONE_OBSTACLE_AUTRE_ELEMENT_CONTROLE:
				getAPourZoneObstacleAutreElementControle().clear();
				getAPourZoneObstacleAutreElementControle().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_INSTRUCTION_COORDINATION__APOUR_ITINERAIRE_RESERVE_ITINERAIRE:
				getAPourItineraireReserveItineraire().clear();
				getAPourItineraireReserveItineraire().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_INSTRUCTION_COORDINATION__CONDITION_DESTRUCTION_OUVRAGE_ART:
				setConditionDestructionOuvrageArt(CONDITION_DESTRUCTION_OUVRAGE_ART_EDEFAULT);
				return;
			case SchemaPackage.TYPE_INSTRUCTION_COORDINATION__GDH_FOURNITURE_PLAN_MIXTE:
				setGDHFourniturePlanMixte(GDH_FOURNITURE_PLAN_MIXTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_INSTRUCTION_COORDINATION__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_INSTRUCTION_COORDINATION__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_INSTRUCTION_COORDINATION__CONCERNE_UNITE:
				getConcerneUnite().clear();
				return;
			case SchemaPackage.TYPE_INSTRUCTION_COORDINATION__APOUR_AUTORITE_QUALIFIEE_UNITE:
				getAPourAutoriteQualifieeUnite().clear();
				return;
			case SchemaPackage.TYPE_INSTRUCTION_COORDINATION__APOUR_ZONE_OBSTACLE_AUTRE_ELEMENT_CONTROLE:
				getAPourZoneObstacleAutreElementControle().clear();
				return;
			case SchemaPackage.TYPE_INSTRUCTION_COORDINATION__APOUR_ITINERAIRE_RESERVE_ITINERAIRE:
				getAPourItineraireReserveItineraire().clear();
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
			case SchemaPackage.TYPE_INSTRUCTION_COORDINATION__CONDITION_DESTRUCTION_OUVRAGE_ART:
				return CONDITION_DESTRUCTION_OUVRAGE_ART_EDEFAULT == null ? conditionDestructionOuvrageArt != null : !CONDITION_DESTRUCTION_OUVRAGE_ART_EDEFAULT.equals(conditionDestructionOuvrageArt);
			case SchemaPackage.TYPE_INSTRUCTION_COORDINATION__GDH_FOURNITURE_PLAN_MIXTE:
				return GDH_FOURNITURE_PLAN_MIXTE_EDEFAULT == null ? gDHFourniturePlanMixte != null : !GDH_FOURNITURE_PLAN_MIXTE_EDEFAULT.equals(gDHFourniturePlanMixte);
			case SchemaPackage.TYPE_INSTRUCTION_COORDINATION__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_INSTRUCTION_COORDINATION__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_INSTRUCTION_COORDINATION__CONCERNE_UNITE:
				return concerneUnite != null && !concerneUnite.isEmpty();
			case SchemaPackage.TYPE_INSTRUCTION_COORDINATION__APOUR_AUTORITE_QUALIFIEE_UNITE:
				return aPourAutoriteQualifieeUnite != null && !aPourAutoriteQualifieeUnite.isEmpty();
			case SchemaPackage.TYPE_INSTRUCTION_COORDINATION__APOUR_ZONE_OBSTACLE_AUTRE_ELEMENT_CONTROLE:
				return aPourZoneObstacleAutreElementControle != null && !aPourZoneObstacleAutreElementControle.isEmpty();
			case SchemaPackage.TYPE_INSTRUCTION_COORDINATION__APOUR_ITINERAIRE_RESERVE_ITINERAIRE:
				return aPourItineraireReserveItineraire != null && !aPourItineraireReserveItineraire.isEmpty();
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
		result.append(" (conditionDestructionOuvrageArt: ");
		result.append(conditionDestructionOuvrageArt);
		result.append(", gDHFourniturePlanMixte: ");
		result.append(gDHFourniturePlanMixte);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeInstructionCoordinationImpl
