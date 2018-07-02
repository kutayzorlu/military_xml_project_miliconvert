/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeROEparOrganisation;

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
 * An implementation of the model object '<em><b>Type RO Epar Organisation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeROEparOrganisationImpl#getResumeReglesEnVigueur <em>Resume Regles En Vigueur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeROEparOrganisationImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeROEparOrganisationImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeROEparOrganisationImpl#getAPourRegleActiveeRegleEngagement <em>APour Regle Activee Regle Engagement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeROEparOrganisationImpl#getAPourRegleAnnuleeRegleEngagement <em>APour Regle Annulee Regle Engagement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeROEparOrganisationImpl#getConcerneEntiteOrganisationnelle <em>Concerne Entite Organisationnelle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeROEparOrganisationImpl extends EObjectImpl implements TypeROEparOrganisation {
	/**
	 * The default value of the '{@link #getResumeReglesEnVigueur() <em>Resume Regles En Vigueur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResumeReglesEnVigueur()
	 * @generated
	 * @ordered
	 */
	protected static final String RESUME_REGLES_EN_VIGUEUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResumeReglesEnVigueur() <em>Resume Regles En Vigueur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResumeReglesEnVigueur()
	 * @generated
	 * @ordered
	 */
	protected String resumeReglesEnVigueur = RESUME_REGLES_EN_VIGUEUR_EDEFAULT;

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
	 * The cached value of the '{@link #getAPourRegleActiveeRegleEngagement() <em>APour Regle Activee Regle Engagement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourRegleActiveeRegleEngagement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourRegleActiveeRegleEngagement;

	/**
	 * The cached value of the '{@link #getAPourRegleAnnuleeRegleEngagement() <em>APour Regle Annulee Regle Engagement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourRegleAnnuleeRegleEngagement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourRegleAnnuleeRegleEngagement;

	/**
	 * The cached value of the '{@link #getConcerneEntiteOrganisationnelle() <em>Concerne Entite Organisationnelle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneEntiteOrganisationnelle()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociationEXT> concerneEntiteOrganisationnelle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeROEparOrganisationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeROEparOrganisation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResumeReglesEnVigueur() {
		return resumeReglesEnVigueur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResumeReglesEnVigueur(String newResumeReglesEnVigueur) {
		String oldResumeReglesEnVigueur = resumeReglesEnVigueur;
		resumeReglesEnVigueur = newResumeReglesEnVigueur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RO_EPAR_ORGANISATION__RESUME_REGLES_EN_VIGUEUR, oldResumeReglesEnVigueur, resumeReglesEnVigueur));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RO_EPAR_ORGANISATION__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RO_EPAR_ORGANISATION__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourRegleActiveeRegleEngagement() {
		if (aPourRegleActiveeRegleEngagement == null) {
			aPourRegleActiveeRegleEngagement = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_RO_EPAR_ORGANISATION__APOUR_REGLE_ACTIVEE_REGLE_ENGAGEMENT);
		}
		return aPourRegleActiveeRegleEngagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourRegleAnnuleeRegleEngagement() {
		if (aPourRegleAnnuleeRegleEngagement == null) {
			aPourRegleAnnuleeRegleEngagement = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_RO_EPAR_ORGANISATION__APOUR_REGLE_ANNULEE_REGLE_ENGAGEMENT);
		}
		return aPourRegleAnnuleeRegleEngagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEXT> getConcerneEntiteOrganisationnelle() {
		if (concerneEntiteOrganisationnelle == null) {
			concerneEntiteOrganisationnelle = new EObjectContainmentEList<TypeAssociationEXT>(TypeAssociationEXT.class, this, SchemaPackage.TYPE_RO_EPAR_ORGANISATION__CONCERNE_ENTITE_ORGANISATIONNELLE);
		}
		return concerneEntiteOrganisationnelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_RO_EPAR_ORGANISATION__APOUR_REGLE_ACTIVEE_REGLE_ENGAGEMENT:
				return ((InternalEList<?>)getAPourRegleActiveeRegleEngagement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_RO_EPAR_ORGANISATION__APOUR_REGLE_ANNULEE_REGLE_ENGAGEMENT:
				return ((InternalEList<?>)getAPourRegleAnnuleeRegleEngagement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_RO_EPAR_ORGANISATION__CONCERNE_ENTITE_ORGANISATIONNELLE:
				return ((InternalEList<?>)getConcerneEntiteOrganisationnelle()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_RO_EPAR_ORGANISATION__RESUME_REGLES_EN_VIGUEUR:
				return getResumeReglesEnVigueur();
			case SchemaPackage.TYPE_RO_EPAR_ORGANISATION__CTE:
				return getCTE();
			case SchemaPackage.TYPE_RO_EPAR_ORGANISATION__CE:
				return getCE();
			case SchemaPackage.TYPE_RO_EPAR_ORGANISATION__APOUR_REGLE_ACTIVEE_REGLE_ENGAGEMENT:
				return getAPourRegleActiveeRegleEngagement();
			case SchemaPackage.TYPE_RO_EPAR_ORGANISATION__APOUR_REGLE_ANNULEE_REGLE_ENGAGEMENT:
				return getAPourRegleAnnuleeRegleEngagement();
			case SchemaPackage.TYPE_RO_EPAR_ORGANISATION__CONCERNE_ENTITE_ORGANISATIONNELLE:
				return getConcerneEntiteOrganisationnelle();
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
			case SchemaPackage.TYPE_RO_EPAR_ORGANISATION__RESUME_REGLES_EN_VIGUEUR:
				setResumeReglesEnVigueur((String)newValue);
				return;
			case SchemaPackage.TYPE_RO_EPAR_ORGANISATION__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_RO_EPAR_ORGANISATION__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_RO_EPAR_ORGANISATION__APOUR_REGLE_ACTIVEE_REGLE_ENGAGEMENT:
				getAPourRegleActiveeRegleEngagement().clear();
				getAPourRegleActiveeRegleEngagement().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_RO_EPAR_ORGANISATION__APOUR_REGLE_ANNULEE_REGLE_ENGAGEMENT:
				getAPourRegleAnnuleeRegleEngagement().clear();
				getAPourRegleAnnuleeRegleEngagement().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_RO_EPAR_ORGANISATION__CONCERNE_ENTITE_ORGANISATIONNELLE:
				getConcerneEntiteOrganisationnelle().clear();
				getConcerneEntiteOrganisationnelle().addAll((Collection<? extends TypeAssociationEXT>)newValue);
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
			case SchemaPackage.TYPE_RO_EPAR_ORGANISATION__RESUME_REGLES_EN_VIGUEUR:
				setResumeReglesEnVigueur(RESUME_REGLES_EN_VIGUEUR_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RO_EPAR_ORGANISATION__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RO_EPAR_ORGANISATION__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RO_EPAR_ORGANISATION__APOUR_REGLE_ACTIVEE_REGLE_ENGAGEMENT:
				getAPourRegleActiveeRegleEngagement().clear();
				return;
			case SchemaPackage.TYPE_RO_EPAR_ORGANISATION__APOUR_REGLE_ANNULEE_REGLE_ENGAGEMENT:
				getAPourRegleAnnuleeRegleEngagement().clear();
				return;
			case SchemaPackage.TYPE_RO_EPAR_ORGANISATION__CONCERNE_ENTITE_ORGANISATIONNELLE:
				getConcerneEntiteOrganisationnelle().clear();
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
			case SchemaPackage.TYPE_RO_EPAR_ORGANISATION__RESUME_REGLES_EN_VIGUEUR:
				return RESUME_REGLES_EN_VIGUEUR_EDEFAULT == null ? resumeReglesEnVigueur != null : !RESUME_REGLES_EN_VIGUEUR_EDEFAULT.equals(resumeReglesEnVigueur);
			case SchemaPackage.TYPE_RO_EPAR_ORGANISATION__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_RO_EPAR_ORGANISATION__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_RO_EPAR_ORGANISATION__APOUR_REGLE_ACTIVEE_REGLE_ENGAGEMENT:
				return aPourRegleActiveeRegleEngagement != null && !aPourRegleActiveeRegleEngagement.isEmpty();
			case SchemaPackage.TYPE_RO_EPAR_ORGANISATION__APOUR_REGLE_ANNULEE_REGLE_ENGAGEMENT:
				return aPourRegleAnnuleeRegleEngagement != null && !aPourRegleAnnuleeRegleEngagement.isEmpty();
			case SchemaPackage.TYPE_RO_EPAR_ORGANISATION__CONCERNE_ENTITE_ORGANISATIONNELLE:
				return concerneEntiteOrganisationnelle != null && !concerneEntiteOrganisationnelle.isEmpty();
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
		result.append(" (resumeReglesEnVigueur: ");
		result.append(resumeReglesEnVigueur);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeROEparOrganisationImpl
