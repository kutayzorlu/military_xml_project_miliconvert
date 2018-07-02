/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeEquipementOuRessourceEnQuantite;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Equipement Ou Ressource En Quantite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEquipementOuRessourceEnQuantiteImpl#getQuantiteMin <em>Quantite Min</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEquipementOuRessourceEnQuantiteImpl#getQuantiteMax <em>Quantite Max</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEquipementOuRessourceEnQuantiteImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEquipementOuRessourceEnQuantiteImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEquipementOuRessourceEnQuantiteImpl#getConcerneTypeMaterielTypeMateriel <em>Concerne Type Materiel Type Materiel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEquipementOuRessourceEnQuantiteImpl extends EObjectImpl implements TypeEquipementOuRessourceEnQuantite {
	/**
	 * The default value of the '{@link #getQuantiteMin() <em>Quantite Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteMin()
	 * @generated
	 * @ordered
	 */
	protected static final double QUANTITE_MIN_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getQuantiteMin() <em>Quantite Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteMin()
	 * @generated
	 * @ordered
	 */
	protected double quantiteMin = QUANTITE_MIN_EDEFAULT;

	/**
	 * This is true if the Quantite Min attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quantiteMinESet;

	/**
	 * The default value of the '{@link #getQuantiteMax() <em>Quantite Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteMax()
	 * @generated
	 * @ordered
	 */
	protected static final double QUANTITE_MAX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getQuantiteMax() <em>Quantite Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteMax()
	 * @generated
	 * @ordered
	 */
	protected double quantiteMax = QUANTITE_MAX_EDEFAULT;

	/**
	 * This is true if the Quantite Max attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quantiteMaxESet;

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
	 * The cached value of the '{@link #getConcerneTypeMaterielTypeMateriel() <em>Concerne Type Materiel Type Materiel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneTypeMaterielTypeMateriel()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT concerneTypeMaterielTypeMateriel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEquipementOuRessourceEnQuantiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEquipementOuRessourceEnQuantite();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getQuantiteMin() {
		return quantiteMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantiteMin(double newQuantiteMin) {
		double oldQuantiteMin = quantiteMin;
		quantiteMin = newQuantiteMin;
		boolean oldQuantiteMinESet = quantiteMinESet;
		quantiteMinESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EQUIPEMENT_OU_RESSOURCE_EN_QUANTITE__QUANTITE_MIN, oldQuantiteMin, quantiteMin, !oldQuantiteMinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuantiteMin() {
		double oldQuantiteMin = quantiteMin;
		boolean oldQuantiteMinESet = quantiteMinESet;
		quantiteMin = QUANTITE_MIN_EDEFAULT;
		quantiteMinESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EQUIPEMENT_OU_RESSOURCE_EN_QUANTITE__QUANTITE_MIN, oldQuantiteMin, QUANTITE_MIN_EDEFAULT, oldQuantiteMinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuantiteMin() {
		return quantiteMinESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getQuantiteMax() {
		return quantiteMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantiteMax(double newQuantiteMax) {
		double oldQuantiteMax = quantiteMax;
		quantiteMax = newQuantiteMax;
		boolean oldQuantiteMaxESet = quantiteMaxESet;
		quantiteMaxESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EQUIPEMENT_OU_RESSOURCE_EN_QUANTITE__QUANTITE_MAX, oldQuantiteMax, quantiteMax, !oldQuantiteMaxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuantiteMax() {
		double oldQuantiteMax = quantiteMax;
		boolean oldQuantiteMaxESet = quantiteMaxESet;
		quantiteMax = QUANTITE_MAX_EDEFAULT;
		quantiteMaxESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EQUIPEMENT_OU_RESSOURCE_EN_QUANTITE__QUANTITE_MAX, oldQuantiteMax, QUANTITE_MAX_EDEFAULT, oldQuantiteMaxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuantiteMax() {
		return quantiteMaxESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EQUIPEMENT_OU_RESSOURCE_EN_QUANTITE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EQUIPEMENT_OU_RESSOURCE_EN_QUANTITE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getConcerneTypeMaterielTypeMateriel() {
		return concerneTypeMaterielTypeMateriel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcerneTypeMaterielTypeMateriel(TypeAssociationEXT newConcerneTypeMaterielTypeMateriel, NotificationChain msgs) {
		TypeAssociationEXT oldConcerneTypeMaterielTypeMateriel = concerneTypeMaterielTypeMateriel;
		concerneTypeMaterielTypeMateriel = newConcerneTypeMaterielTypeMateriel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EQUIPEMENT_OU_RESSOURCE_EN_QUANTITE__CONCERNE_TYPE_MATERIEL_TYPE_MATERIEL, oldConcerneTypeMaterielTypeMateriel, newConcerneTypeMaterielTypeMateriel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcerneTypeMaterielTypeMateriel(TypeAssociationEXT newConcerneTypeMaterielTypeMateriel) {
		if (newConcerneTypeMaterielTypeMateriel != concerneTypeMaterielTypeMateriel) {
			NotificationChain msgs = null;
			if (concerneTypeMaterielTypeMateriel != null)
				msgs = ((InternalEObject)concerneTypeMaterielTypeMateriel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EQUIPEMENT_OU_RESSOURCE_EN_QUANTITE__CONCERNE_TYPE_MATERIEL_TYPE_MATERIEL, null, msgs);
			if (newConcerneTypeMaterielTypeMateriel != null)
				msgs = ((InternalEObject)newConcerneTypeMaterielTypeMateriel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EQUIPEMENT_OU_RESSOURCE_EN_QUANTITE__CONCERNE_TYPE_MATERIEL_TYPE_MATERIEL, null, msgs);
			msgs = basicSetConcerneTypeMaterielTypeMateriel(newConcerneTypeMaterielTypeMateriel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EQUIPEMENT_OU_RESSOURCE_EN_QUANTITE__CONCERNE_TYPE_MATERIEL_TYPE_MATERIEL, newConcerneTypeMaterielTypeMateriel, newConcerneTypeMaterielTypeMateriel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_EQUIPEMENT_OU_RESSOURCE_EN_QUANTITE__CONCERNE_TYPE_MATERIEL_TYPE_MATERIEL:
				return basicSetConcerneTypeMaterielTypeMateriel(null, msgs);
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
			case SchemaPackage.TYPE_EQUIPEMENT_OU_RESSOURCE_EN_QUANTITE__QUANTITE_MIN:
				return new Double(getQuantiteMin());
			case SchemaPackage.TYPE_EQUIPEMENT_OU_RESSOURCE_EN_QUANTITE__QUANTITE_MAX:
				return new Double(getQuantiteMax());
			case SchemaPackage.TYPE_EQUIPEMENT_OU_RESSOURCE_EN_QUANTITE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_EQUIPEMENT_OU_RESSOURCE_EN_QUANTITE__CE:
				return getCE();
			case SchemaPackage.TYPE_EQUIPEMENT_OU_RESSOURCE_EN_QUANTITE__CONCERNE_TYPE_MATERIEL_TYPE_MATERIEL:
				return getConcerneTypeMaterielTypeMateriel();
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
			case SchemaPackage.TYPE_EQUIPEMENT_OU_RESSOURCE_EN_QUANTITE__QUANTITE_MIN:
				setQuantiteMin(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_EQUIPEMENT_OU_RESSOURCE_EN_QUANTITE__QUANTITE_MAX:
				setQuantiteMax(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_EQUIPEMENT_OU_RESSOURCE_EN_QUANTITE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_EQUIPEMENT_OU_RESSOURCE_EN_QUANTITE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_EQUIPEMENT_OU_RESSOURCE_EN_QUANTITE__CONCERNE_TYPE_MATERIEL_TYPE_MATERIEL:
				setConcerneTypeMaterielTypeMateriel((TypeAssociationEXT)newValue);
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
			case SchemaPackage.TYPE_EQUIPEMENT_OU_RESSOURCE_EN_QUANTITE__QUANTITE_MIN:
				unsetQuantiteMin();
				return;
			case SchemaPackage.TYPE_EQUIPEMENT_OU_RESSOURCE_EN_QUANTITE__QUANTITE_MAX:
				unsetQuantiteMax();
				return;
			case SchemaPackage.TYPE_EQUIPEMENT_OU_RESSOURCE_EN_QUANTITE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_EQUIPEMENT_OU_RESSOURCE_EN_QUANTITE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_EQUIPEMENT_OU_RESSOURCE_EN_QUANTITE__CONCERNE_TYPE_MATERIEL_TYPE_MATERIEL:
				setConcerneTypeMaterielTypeMateriel((TypeAssociationEXT)null);
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
			case SchemaPackage.TYPE_EQUIPEMENT_OU_RESSOURCE_EN_QUANTITE__QUANTITE_MIN:
				return isSetQuantiteMin();
			case SchemaPackage.TYPE_EQUIPEMENT_OU_RESSOURCE_EN_QUANTITE__QUANTITE_MAX:
				return isSetQuantiteMax();
			case SchemaPackage.TYPE_EQUIPEMENT_OU_RESSOURCE_EN_QUANTITE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_EQUIPEMENT_OU_RESSOURCE_EN_QUANTITE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_EQUIPEMENT_OU_RESSOURCE_EN_QUANTITE__CONCERNE_TYPE_MATERIEL_TYPE_MATERIEL:
				return concerneTypeMaterielTypeMateriel != null;
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
		result.append(" (quantiteMin: ");
		if (quantiteMinESet) result.append(quantiteMin); else result.append("<unset>");
		result.append(", quantiteMax: ");
		if (quantiteMaxESet) result.append(quantiteMax); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeEquipementOuRessourceEnQuantiteImpl
