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
import mpia.schema.TypeOrganisationTraitement;

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
 * An implementation of the model object '<em><b>Type Organisation Traitement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeOrganisationTraitementImpl#getCategorieUrgence <em>Categorie Urgence</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeOrganisationTraitementImpl#getModalitesTechniquesGenerales <em>Modalites Techniques Generales</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeOrganisationTraitementImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeOrganisationTraitementImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeOrganisationTraitementImpl#getAPourLieuTraitementAutreElementControle <em>APour Lieu Traitement Autre Element Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeOrganisationTraitementImpl extends EObjectImpl implements TypeOrganisationTraitement {
	/**
	 * The default value of the '{@link #getCategorieUrgence() <em>Categorie Urgence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorieUrgence()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORIE_URGENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategorieUrgence() <em>Categorie Urgence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorieUrgence()
	 * @generated
	 * @ordered
	 */
	protected String categorieUrgence = CATEGORIE_URGENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getModalitesTechniquesGenerales() <em>Modalites Techniques Generales</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModalitesTechniquesGenerales()
	 * @generated
	 * @ordered
	 */
	protected static final String MODALITES_TECHNIQUES_GENERALES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModalitesTechniquesGenerales() <em>Modalites Techniques Generales</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModalitesTechniquesGenerales()
	 * @generated
	 * @ordered
	 */
	protected String modalitesTechniquesGenerales = MODALITES_TECHNIQUES_GENERALES_EDEFAULT;

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
	 * The cached value of the '{@link #getAPourLieuTraitementAutreElementControle() <em>APour Lieu Traitement Autre Element Controle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourLieuTraitementAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourLieuTraitementAutreElementControle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeOrganisationTraitementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeOrganisationTraitement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategorieUrgence() {
		return categorieUrgence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorieUrgence(String newCategorieUrgence) {
		String oldCategorieUrgence = categorieUrgence;
		categorieUrgence = newCategorieUrgence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ORGANISATION_TRAITEMENT__CATEGORIE_URGENCE, oldCategorieUrgence, categorieUrgence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModalitesTechniquesGenerales() {
		return modalitesTechniquesGenerales;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModalitesTechniquesGenerales(String newModalitesTechniquesGenerales) {
		String oldModalitesTechniquesGenerales = modalitesTechniquesGenerales;
		modalitesTechniquesGenerales = newModalitesTechniquesGenerales;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ORGANISATION_TRAITEMENT__MODALITES_TECHNIQUES_GENERALES, oldModalitesTechniquesGenerales, modalitesTechniquesGenerales));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ORGANISATION_TRAITEMENT__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ORGANISATION_TRAITEMENT__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourLieuTraitementAutreElementControle() {
		if (aPourLieuTraitementAutreElementControle == null) {
			aPourLieuTraitementAutreElementControle = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ORGANISATION_TRAITEMENT__APOUR_LIEU_TRAITEMENT_AUTRE_ELEMENT_CONTROLE);
		}
		return aPourLieuTraitementAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ORGANISATION_TRAITEMENT__APOUR_LIEU_TRAITEMENT_AUTRE_ELEMENT_CONTROLE:
				return ((InternalEList<?>)getAPourLieuTraitementAutreElementControle()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_ORGANISATION_TRAITEMENT__CATEGORIE_URGENCE:
				return getCategorieUrgence();
			case SchemaPackage.TYPE_ORGANISATION_TRAITEMENT__MODALITES_TECHNIQUES_GENERALES:
				return getModalitesTechniquesGenerales();
			case SchemaPackage.TYPE_ORGANISATION_TRAITEMENT__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ORGANISATION_TRAITEMENT__CE:
				return getCE();
			case SchemaPackage.TYPE_ORGANISATION_TRAITEMENT__APOUR_LIEU_TRAITEMENT_AUTRE_ELEMENT_CONTROLE:
				return getAPourLieuTraitementAutreElementControle();
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
			case SchemaPackage.TYPE_ORGANISATION_TRAITEMENT__CATEGORIE_URGENCE:
				setCategorieUrgence((String)newValue);
				return;
			case SchemaPackage.TYPE_ORGANISATION_TRAITEMENT__MODALITES_TECHNIQUES_GENERALES:
				setModalitesTechniquesGenerales((String)newValue);
				return;
			case SchemaPackage.TYPE_ORGANISATION_TRAITEMENT__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ORGANISATION_TRAITEMENT__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ORGANISATION_TRAITEMENT__APOUR_LIEU_TRAITEMENT_AUTRE_ELEMENT_CONTROLE:
				getAPourLieuTraitementAutreElementControle().clear();
				getAPourLieuTraitementAutreElementControle().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_ORGANISATION_TRAITEMENT__CATEGORIE_URGENCE:
				setCategorieUrgence(CATEGORIE_URGENCE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ORGANISATION_TRAITEMENT__MODALITES_TECHNIQUES_GENERALES:
				setModalitesTechniquesGenerales(MODALITES_TECHNIQUES_GENERALES_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ORGANISATION_TRAITEMENT__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ORGANISATION_TRAITEMENT__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ORGANISATION_TRAITEMENT__APOUR_LIEU_TRAITEMENT_AUTRE_ELEMENT_CONTROLE:
				getAPourLieuTraitementAutreElementControle().clear();
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
			case SchemaPackage.TYPE_ORGANISATION_TRAITEMENT__CATEGORIE_URGENCE:
				return CATEGORIE_URGENCE_EDEFAULT == null ? categorieUrgence != null : !CATEGORIE_URGENCE_EDEFAULT.equals(categorieUrgence);
			case SchemaPackage.TYPE_ORGANISATION_TRAITEMENT__MODALITES_TECHNIQUES_GENERALES:
				return MODALITES_TECHNIQUES_GENERALES_EDEFAULT == null ? modalitesTechniquesGenerales != null : !MODALITES_TECHNIQUES_GENERALES_EDEFAULT.equals(modalitesTechniquesGenerales);
			case SchemaPackage.TYPE_ORGANISATION_TRAITEMENT__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ORGANISATION_TRAITEMENT__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ORGANISATION_TRAITEMENT__APOUR_LIEU_TRAITEMENT_AUTRE_ELEMENT_CONTROLE:
				return aPourLieuTraitementAutreElementControle != null && !aPourLieuTraitementAutreElementControle.isEmpty();
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
		result.append(" (categorieUrgence: ");
		result.append(categorieUrgence);
		result.append(", modalitesTechniquesGenerales: ");
		result.append(modalitesTechniquesGenerales);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeOrganisationTraitementImpl
