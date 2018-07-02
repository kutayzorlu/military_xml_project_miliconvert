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
import mpia.schema.TypeBesoinsEnRenseignements;
import mpia.schema.TypeDictionaryDicoImportance;

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
 * An implementation of the model object '<em><b>Type Besoins En Renseignements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeBesoinsEnRenseignementsImpl#getPriorite <em>Priorite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBesoinsEnRenseignementsImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBesoinsEnRenseignementsImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBesoinsEnRenseignementsImpl#getACommeRenseignementsARechercherFaitRenseignement <em>AComme Renseignements ARechercher Fait Renseignement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBesoinsEnRenseignementsImpl#getAPourZoneASurveillerAutreElementControle <em>APour Zone ASurveiller Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBesoinsEnRenseignementsImpl#getAPourConduiteATenirPrisonniersRegleEngagement <em>APour Conduite ATenir Prisonniers Regle Engagement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeBesoinsEnRenseignementsImpl extends EObjectImpl implements TypeBesoinsEnRenseignements {
	/**
	 * The default value of the '{@link #getPriorite() <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorite()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoImportance PRIORITE_EDEFAULT = TypeDictionaryDicoImportance._1;

	/**
	 * The cached value of the '{@link #getPriorite() <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorite()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoImportance priorite = PRIORITE_EDEFAULT;

	/**
	 * This is true if the Priorite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean prioriteESet;

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
	 * The cached value of the '{@link #getACommeRenseignementsARechercherFaitRenseignement() <em>AComme Renseignements ARechercher Fait Renseignement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeRenseignementsARechercherFaitRenseignement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aCommeRenseignementsARechercherFaitRenseignement;

	/**
	 * The cached value of the '{@link #getAPourZoneASurveillerAutreElementControle() <em>APour Zone ASurveiller Autre Element Controle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourZoneASurveillerAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourZoneASurveillerAutreElementControle;

	/**
	 * The cached value of the '{@link #getAPourConduiteATenirPrisonniersRegleEngagement() <em>APour Conduite ATenir Prisonniers Regle Engagement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourConduiteATenirPrisonniersRegleEngagement()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourConduiteATenirPrisonniersRegleEngagement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeBesoinsEnRenseignementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeBesoinsEnRenseignements();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoImportance getPriorite() {
		return priorite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriorite(TypeDictionaryDicoImportance newPriorite) {
		TypeDictionaryDicoImportance oldPriorite = priorite;
		priorite = newPriorite == null ? PRIORITE_EDEFAULT : newPriorite;
		boolean oldPrioriteESet = prioriteESet;
		prioriteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BESOINS_EN_RENSEIGNEMENTS__PRIORITE, oldPriorite, priorite, !oldPrioriteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPriorite() {
		TypeDictionaryDicoImportance oldPriorite = priorite;
		boolean oldPrioriteESet = prioriteESet;
		priorite = PRIORITE_EDEFAULT;
		prioriteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_BESOINS_EN_RENSEIGNEMENTS__PRIORITE, oldPriorite, PRIORITE_EDEFAULT, oldPrioriteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPriorite() {
		return prioriteESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BESOINS_EN_RENSEIGNEMENTS__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BESOINS_EN_RENSEIGNEMENTS__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getACommeRenseignementsARechercherFaitRenseignement() {
		if (aCommeRenseignementsARechercherFaitRenseignement == null) {
			aCommeRenseignementsARechercherFaitRenseignement = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_BESOINS_EN_RENSEIGNEMENTS__ACOMME_RENSEIGNEMENTS_ARECHERCHER_FAIT_RENSEIGNEMENT);
		}
		return aCommeRenseignementsARechercherFaitRenseignement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourZoneASurveillerAutreElementControle() {
		if (aPourZoneASurveillerAutreElementControle == null) {
			aPourZoneASurveillerAutreElementControle = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_BESOINS_EN_RENSEIGNEMENTS__APOUR_ZONE_ASURVEILLER_AUTRE_ELEMENT_CONTROLE);
		}
		return aPourZoneASurveillerAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourConduiteATenirPrisonniersRegleEngagement() {
		return aPourConduiteATenirPrisonniersRegleEngagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourConduiteATenirPrisonniersRegleEngagement(TypeAssociation newAPourConduiteATenirPrisonniersRegleEngagement, NotificationChain msgs) {
		TypeAssociation oldAPourConduiteATenirPrisonniersRegleEngagement = aPourConduiteATenirPrisonniersRegleEngagement;
		aPourConduiteATenirPrisonniersRegleEngagement = newAPourConduiteATenirPrisonniersRegleEngagement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BESOINS_EN_RENSEIGNEMENTS__APOUR_CONDUITE_ATENIR_PRISONNIERS_REGLE_ENGAGEMENT, oldAPourConduiteATenirPrisonniersRegleEngagement, newAPourConduiteATenirPrisonniersRegleEngagement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourConduiteATenirPrisonniersRegleEngagement(TypeAssociation newAPourConduiteATenirPrisonniersRegleEngagement) {
		if (newAPourConduiteATenirPrisonniersRegleEngagement != aPourConduiteATenirPrisonniersRegleEngagement) {
			NotificationChain msgs = null;
			if (aPourConduiteATenirPrisonniersRegleEngagement != null)
				msgs = ((InternalEObject)aPourConduiteATenirPrisonniersRegleEngagement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BESOINS_EN_RENSEIGNEMENTS__APOUR_CONDUITE_ATENIR_PRISONNIERS_REGLE_ENGAGEMENT, null, msgs);
			if (newAPourConduiteATenirPrisonniersRegleEngagement != null)
				msgs = ((InternalEObject)newAPourConduiteATenirPrisonniersRegleEngagement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BESOINS_EN_RENSEIGNEMENTS__APOUR_CONDUITE_ATENIR_PRISONNIERS_REGLE_ENGAGEMENT, null, msgs);
			msgs = basicSetAPourConduiteATenirPrisonniersRegleEngagement(newAPourConduiteATenirPrisonniersRegleEngagement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BESOINS_EN_RENSEIGNEMENTS__APOUR_CONDUITE_ATENIR_PRISONNIERS_REGLE_ENGAGEMENT, newAPourConduiteATenirPrisonniersRegleEngagement, newAPourConduiteATenirPrisonniersRegleEngagement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_BESOINS_EN_RENSEIGNEMENTS__ACOMME_RENSEIGNEMENTS_ARECHERCHER_FAIT_RENSEIGNEMENT:
				return ((InternalEList<?>)getACommeRenseignementsARechercherFaitRenseignement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_BESOINS_EN_RENSEIGNEMENTS__APOUR_ZONE_ASURVEILLER_AUTRE_ELEMENT_CONTROLE:
				return ((InternalEList<?>)getAPourZoneASurveillerAutreElementControle()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_BESOINS_EN_RENSEIGNEMENTS__APOUR_CONDUITE_ATENIR_PRISONNIERS_REGLE_ENGAGEMENT:
				return basicSetAPourConduiteATenirPrisonniersRegleEngagement(null, msgs);
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
			case SchemaPackage.TYPE_BESOINS_EN_RENSEIGNEMENTS__PRIORITE:
				return getPriorite();
			case SchemaPackage.TYPE_BESOINS_EN_RENSEIGNEMENTS__CTE:
				return getCTE();
			case SchemaPackage.TYPE_BESOINS_EN_RENSEIGNEMENTS__CE:
				return getCE();
			case SchemaPackage.TYPE_BESOINS_EN_RENSEIGNEMENTS__ACOMME_RENSEIGNEMENTS_ARECHERCHER_FAIT_RENSEIGNEMENT:
				return getACommeRenseignementsARechercherFaitRenseignement();
			case SchemaPackage.TYPE_BESOINS_EN_RENSEIGNEMENTS__APOUR_ZONE_ASURVEILLER_AUTRE_ELEMENT_CONTROLE:
				return getAPourZoneASurveillerAutreElementControle();
			case SchemaPackage.TYPE_BESOINS_EN_RENSEIGNEMENTS__APOUR_CONDUITE_ATENIR_PRISONNIERS_REGLE_ENGAGEMENT:
				return getAPourConduiteATenirPrisonniersRegleEngagement();
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
			case SchemaPackage.TYPE_BESOINS_EN_RENSEIGNEMENTS__PRIORITE:
				setPriorite((TypeDictionaryDicoImportance)newValue);
				return;
			case SchemaPackage.TYPE_BESOINS_EN_RENSEIGNEMENTS__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_BESOINS_EN_RENSEIGNEMENTS__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_BESOINS_EN_RENSEIGNEMENTS__ACOMME_RENSEIGNEMENTS_ARECHERCHER_FAIT_RENSEIGNEMENT:
				getACommeRenseignementsARechercherFaitRenseignement().clear();
				getACommeRenseignementsARechercherFaitRenseignement().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_BESOINS_EN_RENSEIGNEMENTS__APOUR_ZONE_ASURVEILLER_AUTRE_ELEMENT_CONTROLE:
				getAPourZoneASurveillerAutreElementControle().clear();
				getAPourZoneASurveillerAutreElementControle().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_BESOINS_EN_RENSEIGNEMENTS__APOUR_CONDUITE_ATENIR_PRISONNIERS_REGLE_ENGAGEMENT:
				setAPourConduiteATenirPrisonniersRegleEngagement((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_BESOINS_EN_RENSEIGNEMENTS__PRIORITE:
				unsetPriorite();
				return;
			case SchemaPackage.TYPE_BESOINS_EN_RENSEIGNEMENTS__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_BESOINS_EN_RENSEIGNEMENTS__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_BESOINS_EN_RENSEIGNEMENTS__ACOMME_RENSEIGNEMENTS_ARECHERCHER_FAIT_RENSEIGNEMENT:
				getACommeRenseignementsARechercherFaitRenseignement().clear();
				return;
			case SchemaPackage.TYPE_BESOINS_EN_RENSEIGNEMENTS__APOUR_ZONE_ASURVEILLER_AUTRE_ELEMENT_CONTROLE:
				getAPourZoneASurveillerAutreElementControle().clear();
				return;
			case SchemaPackage.TYPE_BESOINS_EN_RENSEIGNEMENTS__APOUR_CONDUITE_ATENIR_PRISONNIERS_REGLE_ENGAGEMENT:
				setAPourConduiteATenirPrisonniersRegleEngagement((TypeAssociation)null);
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
			case SchemaPackage.TYPE_BESOINS_EN_RENSEIGNEMENTS__PRIORITE:
				return isSetPriorite();
			case SchemaPackage.TYPE_BESOINS_EN_RENSEIGNEMENTS__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_BESOINS_EN_RENSEIGNEMENTS__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_BESOINS_EN_RENSEIGNEMENTS__ACOMME_RENSEIGNEMENTS_ARECHERCHER_FAIT_RENSEIGNEMENT:
				return aCommeRenseignementsARechercherFaitRenseignement != null && !aCommeRenseignementsARechercherFaitRenseignement.isEmpty();
			case SchemaPackage.TYPE_BESOINS_EN_RENSEIGNEMENTS__APOUR_ZONE_ASURVEILLER_AUTRE_ELEMENT_CONTROLE:
				return aPourZoneASurveillerAutreElementControle != null && !aPourZoneASurveillerAutreElementControle.isEmpty();
			case SchemaPackage.TYPE_BESOINS_EN_RENSEIGNEMENTS__APOUR_CONDUITE_ATENIR_PRISONNIERS_REGLE_ENGAGEMENT:
				return aPourConduiteATenirPrisonniersRegleEngagement != null;
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
		result.append(" (priorite: ");
		if (prioriteESet) result.append(priorite); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeBesoinsEnRenseignementsImpl
