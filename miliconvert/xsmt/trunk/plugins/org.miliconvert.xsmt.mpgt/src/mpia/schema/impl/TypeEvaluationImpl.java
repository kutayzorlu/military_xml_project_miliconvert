/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoEvaluationElementsLogistiquesLimitants;
import mpia.schema.TypeEvaluation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Evaluation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEvaluationImpl#getElementsLogistiquesLimitants <em>Elements Logistiques Limitants</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvaluationImpl#getAppreciation <em>Appreciation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvaluationImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvaluationImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvaluationImpl#getEstRapporteeParRapport <em>Est Rapportee Par Rapport</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEvaluationImpl extends EObjectImpl implements TypeEvaluation {
	/**
	 * The default value of the '{@link #getElementsLogistiquesLimitants() <em>Elements Logistiques Limitants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementsLogistiquesLimitants()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEvaluationElementsLogistiquesLimitants ELEMENTS_LOGISTIQUES_LIMITANTS_EDEFAULT = TypeDictionaryDicoEvaluationElementsLogistiquesLimitants.CROSS;

	/**
	 * The cached value of the '{@link #getElementsLogistiquesLimitants() <em>Elements Logistiques Limitants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementsLogistiquesLimitants()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEvaluationElementsLogistiquesLimitants elementsLogistiquesLimitants = ELEMENTS_LOGISTIQUES_LIMITANTS_EDEFAULT;

	/**
	 * This is true if the Elements Logistiques Limitants attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean elementsLogistiquesLimitantsESet;

	/**
	 * The default value of the '{@link #getAppreciation() <em>Appreciation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppreciation()
	 * @generated
	 * @ordered
	 */
	protected static final String APPRECIATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAppreciation() <em>Appreciation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppreciation()
	 * @generated
	 * @ordered
	 */
	protected String appreciation = APPRECIATION_EDEFAULT;

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
	 * The cached value of the '{@link #getEstRapporteeParRapport() <em>Est Rapportee Par Rapport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstRapporteeParRapport()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation estRapporteeParRapport;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEvaluationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEvaluation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEvaluationElementsLogistiquesLimitants getElementsLogistiquesLimitants() {
		return elementsLogistiquesLimitants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementsLogistiquesLimitants(TypeDictionaryDicoEvaluationElementsLogistiquesLimitants newElementsLogistiquesLimitants) {
		TypeDictionaryDicoEvaluationElementsLogistiquesLimitants oldElementsLogistiquesLimitants = elementsLogistiquesLimitants;
		elementsLogistiquesLimitants = newElementsLogistiquesLimitants == null ? ELEMENTS_LOGISTIQUES_LIMITANTS_EDEFAULT : newElementsLogistiquesLimitants;
		boolean oldElementsLogistiquesLimitantsESet = elementsLogistiquesLimitantsESet;
		elementsLogistiquesLimitantsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVALUATION__ELEMENTS_LOGISTIQUES_LIMITANTS, oldElementsLogistiquesLimitants, elementsLogistiquesLimitants, !oldElementsLogistiquesLimitantsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetElementsLogistiquesLimitants() {
		TypeDictionaryDicoEvaluationElementsLogistiquesLimitants oldElementsLogistiquesLimitants = elementsLogistiquesLimitants;
		boolean oldElementsLogistiquesLimitantsESet = elementsLogistiquesLimitantsESet;
		elementsLogistiquesLimitants = ELEMENTS_LOGISTIQUES_LIMITANTS_EDEFAULT;
		elementsLogistiquesLimitantsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EVALUATION__ELEMENTS_LOGISTIQUES_LIMITANTS, oldElementsLogistiquesLimitants, ELEMENTS_LOGISTIQUES_LIMITANTS_EDEFAULT, oldElementsLogistiquesLimitantsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetElementsLogistiquesLimitants() {
		return elementsLogistiquesLimitantsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAppreciation() {
		return appreciation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppreciation(String newAppreciation) {
		String oldAppreciation = appreciation;
		appreciation = newAppreciation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVALUATION__APPRECIATION, oldAppreciation, appreciation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVALUATION__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVALUATION__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getEstRapporteeParRapport() {
		return estRapporteeParRapport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstRapporteeParRapport(TypeAssociation newEstRapporteeParRapport, NotificationChain msgs) {
		TypeAssociation oldEstRapporteeParRapport = estRapporteeParRapport;
		estRapporteeParRapport = newEstRapporteeParRapport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVALUATION__EST_RAPPORTEE_PAR_RAPPORT, oldEstRapporteeParRapport, newEstRapporteeParRapport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstRapporteeParRapport(TypeAssociation newEstRapporteeParRapport) {
		if (newEstRapporteeParRapport != estRapporteeParRapport) {
			NotificationChain msgs = null;
			if (estRapporteeParRapport != null)
				msgs = ((InternalEObject)estRapporteeParRapport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EVALUATION__EST_RAPPORTEE_PAR_RAPPORT, null, msgs);
			if (newEstRapporteeParRapport != null)
				msgs = ((InternalEObject)newEstRapporteeParRapport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EVALUATION__EST_RAPPORTEE_PAR_RAPPORT, null, msgs);
			msgs = basicSetEstRapporteeParRapport(newEstRapporteeParRapport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVALUATION__EST_RAPPORTEE_PAR_RAPPORT, newEstRapporteeParRapport, newEstRapporteeParRapport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_EVALUATION__EST_RAPPORTEE_PAR_RAPPORT:
				return basicSetEstRapporteeParRapport(null, msgs);
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
			case SchemaPackage.TYPE_EVALUATION__ELEMENTS_LOGISTIQUES_LIMITANTS:
				return getElementsLogistiquesLimitants();
			case SchemaPackage.TYPE_EVALUATION__APPRECIATION:
				return getAppreciation();
			case SchemaPackage.TYPE_EVALUATION__CTE:
				return getCTE();
			case SchemaPackage.TYPE_EVALUATION__CE:
				return getCE();
			case SchemaPackage.TYPE_EVALUATION__EST_RAPPORTEE_PAR_RAPPORT:
				return getEstRapporteeParRapport();
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
			case SchemaPackage.TYPE_EVALUATION__ELEMENTS_LOGISTIQUES_LIMITANTS:
				setElementsLogistiquesLimitants((TypeDictionaryDicoEvaluationElementsLogistiquesLimitants)newValue);
				return;
			case SchemaPackage.TYPE_EVALUATION__APPRECIATION:
				setAppreciation((String)newValue);
				return;
			case SchemaPackage.TYPE_EVALUATION__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_EVALUATION__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_EVALUATION__EST_RAPPORTEE_PAR_RAPPORT:
				setEstRapporteeParRapport((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_EVALUATION__ELEMENTS_LOGISTIQUES_LIMITANTS:
				unsetElementsLogistiquesLimitants();
				return;
			case SchemaPackage.TYPE_EVALUATION__APPRECIATION:
				setAppreciation(APPRECIATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_EVALUATION__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_EVALUATION__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_EVALUATION__EST_RAPPORTEE_PAR_RAPPORT:
				setEstRapporteeParRapport((TypeAssociation)null);
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
			case SchemaPackage.TYPE_EVALUATION__ELEMENTS_LOGISTIQUES_LIMITANTS:
				return isSetElementsLogistiquesLimitants();
			case SchemaPackage.TYPE_EVALUATION__APPRECIATION:
				return APPRECIATION_EDEFAULT == null ? appreciation != null : !APPRECIATION_EDEFAULT.equals(appreciation);
			case SchemaPackage.TYPE_EVALUATION__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_EVALUATION__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_EVALUATION__EST_RAPPORTEE_PAR_RAPPORT:
				return estRapporteeParRapport != null;
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
		result.append(" (elementsLogistiquesLimitants: ");
		if (elementsLogistiquesLimitantsESet) result.append(elementsLogistiquesLimitants); else result.append("<unset>");
		result.append(", appreciation: ");
		result.append(appreciation);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeEvaluationImpl
