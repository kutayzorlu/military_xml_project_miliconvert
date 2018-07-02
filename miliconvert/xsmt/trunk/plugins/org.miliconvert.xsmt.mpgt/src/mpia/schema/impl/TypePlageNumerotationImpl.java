/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypePlageNumerotation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Plage Numerotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePlageNumerotationImpl#getDebutPlage <em>Debut Plage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlageNumerotationImpl#getFinPlage <em>Fin Plage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlageNumerotationImpl#getCellule <em>Cellule</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlageNumerotationImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlageNumerotationImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlageNumerotationImpl#getEstAttribueeAUnite <em>Est Attribuee AUnite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePlageNumerotationImpl extends EObjectImpl implements TypePlageNumerotation {
	/**
	 * The default value of the '{@link #getDebutPlage() <em>Debut Plage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebutPlage()
	 * @generated
	 * @ordered
	 */
	protected static final String DEBUT_PLAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDebutPlage() <em>Debut Plage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebutPlage()
	 * @generated
	 * @ordered
	 */
	protected String debutPlage = DEBUT_PLAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinPlage() <em>Fin Plage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinPlage()
	 * @generated
	 * @ordered
	 */
	protected static final String FIN_PLAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFinPlage() <em>Fin Plage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinPlage()
	 * @generated
	 * @ordered
	 */
	protected String finPlage = FIN_PLAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCellule() <em>Cellule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellule()
	 * @generated
	 * @ordered
	 */
	protected static final String CELLULE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCellule() <em>Cellule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellule()
	 * @generated
	 * @ordered
	 */
	protected String cellule = CELLULE_EDEFAULT;

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
	 * The cached value of the '{@link #getEstAttribueeAUnite() <em>Est Attribuee AUnite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstAttribueeAUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT estAttribueeAUnite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypePlageNumerotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePlageNumerotation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDebutPlage() {
		return debutPlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebutPlage(String newDebutPlage) {
		String oldDebutPlage = debutPlage;
		debutPlage = newDebutPlage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PLAGE_NUMEROTATION__DEBUT_PLAGE, oldDebutPlage, debutPlage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFinPlage() {
		return finPlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinPlage(String newFinPlage) {
		String oldFinPlage = finPlage;
		finPlage = newFinPlage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PLAGE_NUMEROTATION__FIN_PLAGE, oldFinPlage, finPlage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCellule() {
		return cellule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCellule(String newCellule) {
		String oldCellule = cellule;
		cellule = newCellule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PLAGE_NUMEROTATION__CELLULE, oldCellule, cellule));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PLAGE_NUMEROTATION__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PLAGE_NUMEROTATION__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getEstAttribueeAUnite() {
		return estAttribueeAUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstAttribueeAUnite(TypeAssociationEXT newEstAttribueeAUnite, NotificationChain msgs) {
		TypeAssociationEXT oldEstAttribueeAUnite = estAttribueeAUnite;
		estAttribueeAUnite = newEstAttribueeAUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PLAGE_NUMEROTATION__EST_ATTRIBUEE_AUNITE, oldEstAttribueeAUnite, newEstAttribueeAUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstAttribueeAUnite(TypeAssociationEXT newEstAttribueeAUnite) {
		if (newEstAttribueeAUnite != estAttribueeAUnite) {
			NotificationChain msgs = null;
			if (estAttribueeAUnite != null)
				msgs = ((InternalEObject)estAttribueeAUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PLAGE_NUMEROTATION__EST_ATTRIBUEE_AUNITE, null, msgs);
			if (newEstAttribueeAUnite != null)
				msgs = ((InternalEObject)newEstAttribueeAUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PLAGE_NUMEROTATION__EST_ATTRIBUEE_AUNITE, null, msgs);
			msgs = basicSetEstAttribueeAUnite(newEstAttribueeAUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PLAGE_NUMEROTATION__EST_ATTRIBUEE_AUNITE, newEstAttribueeAUnite, newEstAttribueeAUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_PLAGE_NUMEROTATION__EST_ATTRIBUEE_AUNITE:
				return basicSetEstAttribueeAUnite(null, msgs);
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
			case SchemaPackage.TYPE_PLAGE_NUMEROTATION__DEBUT_PLAGE:
				return getDebutPlage();
			case SchemaPackage.TYPE_PLAGE_NUMEROTATION__FIN_PLAGE:
				return getFinPlage();
			case SchemaPackage.TYPE_PLAGE_NUMEROTATION__CELLULE:
				return getCellule();
			case SchemaPackage.TYPE_PLAGE_NUMEROTATION__CTE:
				return getCTE();
			case SchemaPackage.TYPE_PLAGE_NUMEROTATION__CE:
				return getCE();
			case SchemaPackage.TYPE_PLAGE_NUMEROTATION__EST_ATTRIBUEE_AUNITE:
				return getEstAttribueeAUnite();
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
			case SchemaPackage.TYPE_PLAGE_NUMEROTATION__DEBUT_PLAGE:
				setDebutPlage((String)newValue);
				return;
			case SchemaPackage.TYPE_PLAGE_NUMEROTATION__FIN_PLAGE:
				setFinPlage((String)newValue);
				return;
			case SchemaPackage.TYPE_PLAGE_NUMEROTATION__CELLULE:
				setCellule((String)newValue);
				return;
			case SchemaPackage.TYPE_PLAGE_NUMEROTATION__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_PLAGE_NUMEROTATION__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_PLAGE_NUMEROTATION__EST_ATTRIBUEE_AUNITE:
				setEstAttribueeAUnite((TypeAssociationEXT)newValue);
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
			case SchemaPackage.TYPE_PLAGE_NUMEROTATION__DEBUT_PLAGE:
				setDebutPlage(DEBUT_PLAGE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PLAGE_NUMEROTATION__FIN_PLAGE:
				setFinPlage(FIN_PLAGE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PLAGE_NUMEROTATION__CELLULE:
				setCellule(CELLULE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PLAGE_NUMEROTATION__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PLAGE_NUMEROTATION__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PLAGE_NUMEROTATION__EST_ATTRIBUEE_AUNITE:
				setEstAttribueeAUnite((TypeAssociationEXT)null);
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
			case SchemaPackage.TYPE_PLAGE_NUMEROTATION__DEBUT_PLAGE:
				return DEBUT_PLAGE_EDEFAULT == null ? debutPlage != null : !DEBUT_PLAGE_EDEFAULT.equals(debutPlage);
			case SchemaPackage.TYPE_PLAGE_NUMEROTATION__FIN_PLAGE:
				return FIN_PLAGE_EDEFAULT == null ? finPlage != null : !FIN_PLAGE_EDEFAULT.equals(finPlage);
			case SchemaPackage.TYPE_PLAGE_NUMEROTATION__CELLULE:
				return CELLULE_EDEFAULT == null ? cellule != null : !CELLULE_EDEFAULT.equals(cellule);
			case SchemaPackage.TYPE_PLAGE_NUMEROTATION__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_PLAGE_NUMEROTATION__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_PLAGE_NUMEROTATION__EST_ATTRIBUEE_AUNITE:
				return estAttribueeAUnite != null;
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
		result.append(" (debutPlage: ");
		result.append(debutPlage);
		result.append(", finPlage: ");
		result.append(finPlage);
		result.append(", cellule: ");
		result.append(cellule);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypePlageNumerotationImpl
