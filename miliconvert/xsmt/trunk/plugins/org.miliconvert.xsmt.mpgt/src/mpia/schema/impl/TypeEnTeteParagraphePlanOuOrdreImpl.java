/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeEnTeteParagraphePlanOuOrdre;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type En Tete Paragraphe Plan Ou Ordre</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEnTeteParagraphePlanOuOrdreImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEnTeteParagraphePlanOuOrdreImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEnTeteParagraphePlanOuOrdreImpl#getSujet <em>Sujet</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEnTeteParagraphePlanOuOrdreImpl#getAPourDegreClassificationDegreClassification <em>APour Degre Classification Degre Classification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEnTeteParagraphePlanOuOrdreImpl extends EObjectImpl implements TypeEnTeteParagraphePlanOuOrdre {
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
	 * The default value of the '{@link #getSujet() <em>Sujet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSujet()
	 * @generated
	 * @ordered
	 */
	protected static final String SUJET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSujet() <em>Sujet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSujet()
	 * @generated
	 * @ordered
	 */
	protected String sujet = SUJET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAPourDegreClassificationDegreClassification() <em>APour Degre Classification Degre Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourDegreClassificationDegreClassification()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourDegreClassificationDegreClassification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEnTeteParagraphePlanOuOrdreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEnTeteParagraphePlanOuOrdre();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EN_TETE_PARAGRAPHE_PLAN_OU_ORDRE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EN_TETE_PARAGRAPHE_PLAN_OU_ORDRE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSujet() {
		return sujet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSujet(String newSujet) {
		String oldSujet = sujet;
		sujet = newSujet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EN_TETE_PARAGRAPHE_PLAN_OU_ORDRE__SUJET, oldSujet, sujet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourDegreClassificationDegreClassification() {
		return aPourDegreClassificationDegreClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourDegreClassificationDegreClassification(TypeAssociation newAPourDegreClassificationDegreClassification, NotificationChain msgs) {
		TypeAssociation oldAPourDegreClassificationDegreClassification = aPourDegreClassificationDegreClassification;
		aPourDegreClassificationDegreClassification = newAPourDegreClassificationDegreClassification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EN_TETE_PARAGRAPHE_PLAN_OU_ORDRE__APOUR_DEGRE_CLASSIFICATION_DEGRE_CLASSIFICATION, oldAPourDegreClassificationDegreClassification, newAPourDegreClassificationDegreClassification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourDegreClassificationDegreClassification(TypeAssociation newAPourDegreClassificationDegreClassification) {
		if (newAPourDegreClassificationDegreClassification != aPourDegreClassificationDegreClassification) {
			NotificationChain msgs = null;
			if (aPourDegreClassificationDegreClassification != null)
				msgs = ((InternalEObject)aPourDegreClassificationDegreClassification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EN_TETE_PARAGRAPHE_PLAN_OU_ORDRE__APOUR_DEGRE_CLASSIFICATION_DEGRE_CLASSIFICATION, null, msgs);
			if (newAPourDegreClassificationDegreClassification != null)
				msgs = ((InternalEObject)newAPourDegreClassificationDegreClassification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EN_TETE_PARAGRAPHE_PLAN_OU_ORDRE__APOUR_DEGRE_CLASSIFICATION_DEGRE_CLASSIFICATION, null, msgs);
			msgs = basicSetAPourDegreClassificationDegreClassification(newAPourDegreClassificationDegreClassification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EN_TETE_PARAGRAPHE_PLAN_OU_ORDRE__APOUR_DEGRE_CLASSIFICATION_DEGRE_CLASSIFICATION, newAPourDegreClassificationDegreClassification, newAPourDegreClassificationDegreClassification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_EN_TETE_PARAGRAPHE_PLAN_OU_ORDRE__APOUR_DEGRE_CLASSIFICATION_DEGRE_CLASSIFICATION:
				return basicSetAPourDegreClassificationDegreClassification(null, msgs);
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
			case SchemaPackage.TYPE_EN_TETE_PARAGRAPHE_PLAN_OU_ORDRE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_EN_TETE_PARAGRAPHE_PLAN_OU_ORDRE__CE:
				return getCE();
			case SchemaPackage.TYPE_EN_TETE_PARAGRAPHE_PLAN_OU_ORDRE__SUJET:
				return getSujet();
			case SchemaPackage.TYPE_EN_TETE_PARAGRAPHE_PLAN_OU_ORDRE__APOUR_DEGRE_CLASSIFICATION_DEGRE_CLASSIFICATION:
				return getAPourDegreClassificationDegreClassification();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SchemaPackage.TYPE_EN_TETE_PARAGRAPHE_PLAN_OU_ORDRE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_EN_TETE_PARAGRAPHE_PLAN_OU_ORDRE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_EN_TETE_PARAGRAPHE_PLAN_OU_ORDRE__SUJET:
				setSujet((String)newValue);
				return;
			case SchemaPackage.TYPE_EN_TETE_PARAGRAPHE_PLAN_OU_ORDRE__APOUR_DEGRE_CLASSIFICATION_DEGRE_CLASSIFICATION:
				setAPourDegreClassificationDegreClassification((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_EN_TETE_PARAGRAPHE_PLAN_OU_ORDRE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_EN_TETE_PARAGRAPHE_PLAN_OU_ORDRE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_EN_TETE_PARAGRAPHE_PLAN_OU_ORDRE__SUJET:
				setSujet(SUJET_EDEFAULT);
				return;
			case SchemaPackage.TYPE_EN_TETE_PARAGRAPHE_PLAN_OU_ORDRE__APOUR_DEGRE_CLASSIFICATION_DEGRE_CLASSIFICATION:
				setAPourDegreClassificationDegreClassification((TypeAssociation)null);
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
			case SchemaPackage.TYPE_EN_TETE_PARAGRAPHE_PLAN_OU_ORDRE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_EN_TETE_PARAGRAPHE_PLAN_OU_ORDRE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_EN_TETE_PARAGRAPHE_PLAN_OU_ORDRE__SUJET:
				return SUJET_EDEFAULT == null ? sujet != null : !SUJET_EDEFAULT.equals(sujet);
			case SchemaPackage.TYPE_EN_TETE_PARAGRAPHE_PLAN_OU_ORDRE__APOUR_DEGRE_CLASSIFICATION_DEGRE_CLASSIFICATION:
				return aPourDegreClassificationDegreClassification != null;
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
		result.append(", sujet: ");
		result.append(sujet);
		result.append(')');
		return result.toString();
	}

} //TypeEnTeteParagraphePlanOuOrdreImpl
