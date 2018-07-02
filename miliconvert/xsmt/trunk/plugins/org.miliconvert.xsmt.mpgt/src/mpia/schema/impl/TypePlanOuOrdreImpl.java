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
import mpia.schema.TypeDestinatairePlanOuOrdre;
import mpia.schema.TypeEntetePlanOuOrdre;
import mpia.schema.TypePlanOuOrdre;

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
 * An implementation of the model object '<em><b>Type Plan Ou Ordre</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePlanOuOrdreImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanOuOrdreImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanOuOrdreImpl#getAPourEnteteEntetePlanOuOrdre <em>APour Entete Entete Plan Ou Ordre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanOuOrdreImpl#getApourDestinataireDestinatairePlanOuOrdre <em>Apour Destinataire Destinataire Plan Ou Ordre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanOuOrdreImpl#getInclusParagraphePlanOuOrdre <em>Inclus Paragraphe Plan Ou Ordre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanOuOrdreImpl#getEstSoumisAAssociationEntiteOrganisationnellePlanOuOrdre <em>Est Soumis AAssociation Entite Organisationnelle Plan Ou Ordre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanOuOrdreImpl#getEstObjetAssociationPlanOuOrdrePlanOuOrdre <em>Est Objet Association Plan Ou Ordre Plan Ou Ordre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanOuOrdreImpl#getEstSujetAssociationPlanOuOrdrePlanOuOrdre <em>Est Sujet Association Plan Ou Ordre Plan Ou Ordre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanOuOrdreImpl#getEstCiteDansAssociationGroupeInfoOpsPlanOuOrdre <em>Est Cite Dans Association Groupe Info Ops Plan Ou Ordre</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypePlanOuOrdreImpl extends EObjectImpl implements TypePlanOuOrdre {
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
	 * The cached value of the '{@link #getAPourEnteteEntetePlanOuOrdre() <em>APour Entete Entete Plan Ou Ordre</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourEnteteEntetePlanOuOrdre()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeEntetePlanOuOrdre> aPourEnteteEntetePlanOuOrdre;

	/**
	 * The cached value of the '{@link #getApourDestinataireDestinatairePlanOuOrdre() <em>Apour Destinataire Destinataire Plan Ou Ordre</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApourDestinataireDestinatairePlanOuOrdre()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeDestinatairePlanOuOrdre> apourDestinataireDestinatairePlanOuOrdre;

	/**
	 * The cached value of the '{@link #getInclusParagraphePlanOuOrdre() <em>Inclus Paragraphe Plan Ou Ordre</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclusParagraphePlanOuOrdre()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> inclusParagraphePlanOuOrdre;

	/**
	 * The cached value of the '{@link #getEstSoumisAAssociationEntiteOrganisationnellePlanOuOrdre() <em>Est Soumis AAssociation Entite Organisationnelle Plan Ou Ordre</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSoumisAAssociationEntiteOrganisationnellePlanOuOrdre()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSoumisAAssociationEntiteOrganisationnellePlanOuOrdre;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationPlanOuOrdrePlanOuOrdre() <em>Est Objet Association Plan Ou Ordre Plan Ou Ordre</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationPlanOuOrdrePlanOuOrdre()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationPlanOuOrdrePlanOuOrdre;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationPlanOuOrdrePlanOuOrdre() <em>Est Sujet Association Plan Ou Ordre Plan Ou Ordre</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationPlanOuOrdrePlanOuOrdre()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationPlanOuOrdrePlanOuOrdre;

	/**
	 * The cached value of the '{@link #getEstCiteDansAssociationGroupeInfoOpsPlanOuOrdre() <em>Est Cite Dans Association Groupe Info Ops Plan Ou Ordre</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstCiteDansAssociationGroupeInfoOpsPlanOuOrdre()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estCiteDansAssociationGroupeInfoOpsPlanOuOrdre;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypePlanOuOrdreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePlanOuOrdre();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PLAN_OU_ORDRE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PLAN_OU_ORDRE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEntetePlanOuOrdre> getAPourEnteteEntetePlanOuOrdre() {
		if (aPourEnteteEntetePlanOuOrdre == null) {
			aPourEnteteEntetePlanOuOrdre = new EObjectContainmentEList<TypeEntetePlanOuOrdre>(TypeEntetePlanOuOrdre.class, this, SchemaPackage.TYPE_PLAN_OU_ORDRE__APOUR_ENTETE_ENTETE_PLAN_OU_ORDRE);
		}
		return aPourEnteteEntetePlanOuOrdre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDestinatairePlanOuOrdre> getApourDestinataireDestinatairePlanOuOrdre() {
		if (apourDestinataireDestinatairePlanOuOrdre == null) {
			apourDestinataireDestinatairePlanOuOrdre = new EObjectContainmentEList<TypeDestinatairePlanOuOrdre>(TypeDestinatairePlanOuOrdre.class, this, SchemaPackage.TYPE_PLAN_OU_ORDRE__APOUR_DESTINATAIRE_DESTINATAIRE_PLAN_OU_ORDRE);
		}
		return apourDestinataireDestinatairePlanOuOrdre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getInclusParagraphePlanOuOrdre() {
		if (inclusParagraphePlanOuOrdre == null) {
			inclusParagraphePlanOuOrdre = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_PLAN_OU_ORDRE__INCLUS_PARAGRAPHE_PLAN_OU_ORDRE);
		}
		return inclusParagraphePlanOuOrdre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSoumisAAssociationEntiteOrganisationnellePlanOuOrdre() {
		if (estSoumisAAssociationEntiteOrganisationnellePlanOuOrdre == null) {
			estSoumisAAssociationEntiteOrganisationnellePlanOuOrdre = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_PLAN_OU_ORDRE__EST_SOUMIS_AASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE);
		}
		return estSoumisAAssociationEntiteOrganisationnellePlanOuOrdre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationPlanOuOrdrePlanOuOrdre() {
		if (estObjetAssociationPlanOuOrdrePlanOuOrdre == null) {
			estObjetAssociationPlanOuOrdrePlanOuOrdre = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_PLAN_OU_ORDRE__EST_OBJET_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE);
		}
		return estObjetAssociationPlanOuOrdrePlanOuOrdre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationPlanOuOrdrePlanOuOrdre() {
		if (estSujetAssociationPlanOuOrdrePlanOuOrdre == null) {
			estSujetAssociationPlanOuOrdrePlanOuOrdre = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_PLAN_OU_ORDRE__EST_SUJET_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE);
		}
		return estSujetAssociationPlanOuOrdrePlanOuOrdre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstCiteDansAssociationGroupeInfoOpsPlanOuOrdre() {
		if (estCiteDansAssociationGroupeInfoOpsPlanOuOrdre == null) {
			estCiteDansAssociationGroupeInfoOpsPlanOuOrdre = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_PLAN_OU_ORDRE__EST_CITE_DANS_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE);
		}
		return estCiteDansAssociationGroupeInfoOpsPlanOuOrdre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_PLAN_OU_ORDRE__APOUR_ENTETE_ENTETE_PLAN_OU_ORDRE:
				return ((InternalEList<?>)getAPourEnteteEntetePlanOuOrdre()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PLAN_OU_ORDRE__APOUR_DESTINATAIRE_DESTINATAIRE_PLAN_OU_ORDRE:
				return ((InternalEList<?>)getApourDestinataireDestinatairePlanOuOrdre()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PLAN_OU_ORDRE__INCLUS_PARAGRAPHE_PLAN_OU_ORDRE:
				return ((InternalEList<?>)getInclusParagraphePlanOuOrdre()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PLAN_OU_ORDRE__EST_SOUMIS_AASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE:
				return ((InternalEList<?>)getEstSoumisAAssociationEntiteOrganisationnellePlanOuOrdre()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PLAN_OU_ORDRE__EST_OBJET_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE:
				return ((InternalEList<?>)getEstObjetAssociationPlanOuOrdrePlanOuOrdre()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PLAN_OU_ORDRE__EST_SUJET_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE:
				return ((InternalEList<?>)getEstSujetAssociationPlanOuOrdrePlanOuOrdre()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PLAN_OU_ORDRE__EST_CITE_DANS_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE:
				return ((InternalEList<?>)getEstCiteDansAssociationGroupeInfoOpsPlanOuOrdre()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_PLAN_OU_ORDRE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_PLAN_OU_ORDRE__CE:
				return getCE();
			case SchemaPackage.TYPE_PLAN_OU_ORDRE__APOUR_ENTETE_ENTETE_PLAN_OU_ORDRE:
				return getAPourEnteteEntetePlanOuOrdre();
			case SchemaPackage.TYPE_PLAN_OU_ORDRE__APOUR_DESTINATAIRE_DESTINATAIRE_PLAN_OU_ORDRE:
				return getApourDestinataireDestinatairePlanOuOrdre();
			case SchemaPackage.TYPE_PLAN_OU_ORDRE__INCLUS_PARAGRAPHE_PLAN_OU_ORDRE:
				return getInclusParagraphePlanOuOrdre();
			case SchemaPackage.TYPE_PLAN_OU_ORDRE__EST_SOUMIS_AASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE:
				return getEstSoumisAAssociationEntiteOrganisationnellePlanOuOrdre();
			case SchemaPackage.TYPE_PLAN_OU_ORDRE__EST_OBJET_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE:
				return getEstObjetAssociationPlanOuOrdrePlanOuOrdre();
			case SchemaPackage.TYPE_PLAN_OU_ORDRE__EST_SUJET_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE:
				return getEstSujetAssociationPlanOuOrdrePlanOuOrdre();
			case SchemaPackage.TYPE_PLAN_OU_ORDRE__EST_CITE_DANS_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE:
				return getEstCiteDansAssociationGroupeInfoOpsPlanOuOrdre();
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
			case SchemaPackage.TYPE_PLAN_OU_ORDRE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_PLAN_OU_ORDRE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_PLAN_OU_ORDRE__APOUR_ENTETE_ENTETE_PLAN_OU_ORDRE:
				getAPourEnteteEntetePlanOuOrdre().clear();
				getAPourEnteteEntetePlanOuOrdre().addAll((Collection<? extends TypeEntetePlanOuOrdre>)newValue);
				return;
			case SchemaPackage.TYPE_PLAN_OU_ORDRE__APOUR_DESTINATAIRE_DESTINATAIRE_PLAN_OU_ORDRE:
				getApourDestinataireDestinatairePlanOuOrdre().clear();
				getApourDestinataireDestinatairePlanOuOrdre().addAll((Collection<? extends TypeDestinatairePlanOuOrdre>)newValue);
				return;
			case SchemaPackage.TYPE_PLAN_OU_ORDRE__INCLUS_PARAGRAPHE_PLAN_OU_ORDRE:
				getInclusParagraphePlanOuOrdre().clear();
				getInclusParagraphePlanOuOrdre().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_PLAN_OU_ORDRE__EST_SOUMIS_AASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE:
				getEstSoumisAAssociationEntiteOrganisationnellePlanOuOrdre().clear();
				getEstSoumisAAssociationEntiteOrganisationnellePlanOuOrdre().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_PLAN_OU_ORDRE__EST_OBJET_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE:
				getEstObjetAssociationPlanOuOrdrePlanOuOrdre().clear();
				getEstObjetAssociationPlanOuOrdrePlanOuOrdre().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_PLAN_OU_ORDRE__EST_SUJET_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE:
				getEstSujetAssociationPlanOuOrdrePlanOuOrdre().clear();
				getEstSujetAssociationPlanOuOrdrePlanOuOrdre().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_PLAN_OU_ORDRE__EST_CITE_DANS_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE:
				getEstCiteDansAssociationGroupeInfoOpsPlanOuOrdre().clear();
				getEstCiteDansAssociationGroupeInfoOpsPlanOuOrdre().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_PLAN_OU_ORDRE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PLAN_OU_ORDRE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PLAN_OU_ORDRE__APOUR_ENTETE_ENTETE_PLAN_OU_ORDRE:
				getAPourEnteteEntetePlanOuOrdre().clear();
				return;
			case SchemaPackage.TYPE_PLAN_OU_ORDRE__APOUR_DESTINATAIRE_DESTINATAIRE_PLAN_OU_ORDRE:
				getApourDestinataireDestinatairePlanOuOrdre().clear();
				return;
			case SchemaPackage.TYPE_PLAN_OU_ORDRE__INCLUS_PARAGRAPHE_PLAN_OU_ORDRE:
				getInclusParagraphePlanOuOrdre().clear();
				return;
			case SchemaPackage.TYPE_PLAN_OU_ORDRE__EST_SOUMIS_AASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE:
				getEstSoumisAAssociationEntiteOrganisationnellePlanOuOrdre().clear();
				return;
			case SchemaPackage.TYPE_PLAN_OU_ORDRE__EST_OBJET_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE:
				getEstObjetAssociationPlanOuOrdrePlanOuOrdre().clear();
				return;
			case SchemaPackage.TYPE_PLAN_OU_ORDRE__EST_SUJET_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE:
				getEstSujetAssociationPlanOuOrdrePlanOuOrdre().clear();
				return;
			case SchemaPackage.TYPE_PLAN_OU_ORDRE__EST_CITE_DANS_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE:
				getEstCiteDansAssociationGroupeInfoOpsPlanOuOrdre().clear();
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
			case SchemaPackage.TYPE_PLAN_OU_ORDRE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_PLAN_OU_ORDRE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_PLAN_OU_ORDRE__APOUR_ENTETE_ENTETE_PLAN_OU_ORDRE:
				return aPourEnteteEntetePlanOuOrdre != null && !aPourEnteteEntetePlanOuOrdre.isEmpty();
			case SchemaPackage.TYPE_PLAN_OU_ORDRE__APOUR_DESTINATAIRE_DESTINATAIRE_PLAN_OU_ORDRE:
				return apourDestinataireDestinatairePlanOuOrdre != null && !apourDestinataireDestinatairePlanOuOrdre.isEmpty();
			case SchemaPackage.TYPE_PLAN_OU_ORDRE__INCLUS_PARAGRAPHE_PLAN_OU_ORDRE:
				return inclusParagraphePlanOuOrdre != null && !inclusParagraphePlanOuOrdre.isEmpty();
			case SchemaPackage.TYPE_PLAN_OU_ORDRE__EST_SOUMIS_AASSOCIATION_ENTITE_ORGANISATIONNELLE_PLAN_OU_ORDRE:
				return estSoumisAAssociationEntiteOrganisationnellePlanOuOrdre != null && !estSoumisAAssociationEntiteOrganisationnellePlanOuOrdre.isEmpty();
			case SchemaPackage.TYPE_PLAN_OU_ORDRE__EST_OBJET_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE:
				return estObjetAssociationPlanOuOrdrePlanOuOrdre != null && !estObjetAssociationPlanOuOrdrePlanOuOrdre.isEmpty();
			case SchemaPackage.TYPE_PLAN_OU_ORDRE__EST_SUJET_ASSOCIATION_PLAN_OU_ORDRE_PLAN_OU_ORDRE:
				return estSujetAssociationPlanOuOrdrePlanOuOrdre != null && !estSujetAssociationPlanOuOrdrePlanOuOrdre.isEmpty();
			case SchemaPackage.TYPE_PLAN_OU_ORDRE__EST_CITE_DANS_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE:
				return estCiteDansAssociationGroupeInfoOpsPlanOuOrdre != null && !estCiteDansAssociationGroupeInfoOpsPlanOuOrdre.isEmpty();
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
		result.append(" (cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypePlanOuOrdreImpl
