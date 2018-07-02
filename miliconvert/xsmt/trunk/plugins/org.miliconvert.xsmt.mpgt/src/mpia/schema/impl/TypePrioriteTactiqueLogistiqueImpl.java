/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoPriorite;
import mpia.schema.TypePrioriteTactiqueLogistique;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Priorite Tactique Logistique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePrioriteTactiqueLogistiqueImpl#getPriorite <em>Priorite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrioriteTactiqueLogistiqueImpl#getFonctionOperationnelle <em>Fonction Operationnelle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrioriteTactiqueLogistiqueImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrioriteTactiqueLogistiqueImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrioriteTactiqueLogistiqueImpl#getConcerneUnite <em>Concerne Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePrioriteTactiqueLogistiqueImpl extends EObjectImpl implements TypePrioriteTactiqueLogistique {
	/**
	 * The default value of the '{@link #getPriorite() <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorite()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPriorite PRIORITE_EDEFAULT = TypeDictionaryDicoPriorite._1;

	/**
	 * The cached value of the '{@link #getPriorite() <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorite()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPriorite priorite = PRIORITE_EDEFAULT;

	/**
	 * This is true if the Priorite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean prioriteESet;

	/**
	 * The default value of the '{@link #getFonctionOperationnelle() <em>Fonction Operationnelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFonctionOperationnelle()
	 * @generated
	 * @ordered
	 */
	protected static final String FONCTION_OPERATIONNELLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFonctionOperationnelle() <em>Fonction Operationnelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFonctionOperationnelle()
	 * @generated
	 * @ordered
	 */
	protected String fonctionOperationnelle = FONCTION_OPERATIONNELLE_EDEFAULT;

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
	 * The cached value of the '{@link #getConcerneUnite() <em>Concerne Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT concerneUnite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypePrioriteTactiqueLogistiqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePrioriteTactiqueLogistique();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPriorite getPriorite() {
		return priorite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriorite(TypeDictionaryDicoPriorite newPriorite) {
		TypeDictionaryDicoPriorite oldPriorite = priorite;
		priorite = newPriorite == null ? PRIORITE_EDEFAULT : newPriorite;
		boolean oldPrioriteESet = prioriteESet;
		prioriteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRIORITE_TACTIQUE_LOGISTIQUE__PRIORITE, oldPriorite, priorite, !oldPrioriteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPriorite() {
		TypeDictionaryDicoPriorite oldPriorite = priorite;
		boolean oldPrioriteESet = prioriteESet;
		priorite = PRIORITE_EDEFAULT;
		prioriteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PRIORITE_TACTIQUE_LOGISTIQUE__PRIORITE, oldPriorite, PRIORITE_EDEFAULT, oldPrioriteESet));
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
	public String getFonctionOperationnelle() {
		return fonctionOperationnelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFonctionOperationnelle(String newFonctionOperationnelle) {
		String oldFonctionOperationnelle = fonctionOperationnelle;
		fonctionOperationnelle = newFonctionOperationnelle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRIORITE_TACTIQUE_LOGISTIQUE__FONCTION_OPERATIONNELLE, oldFonctionOperationnelle, fonctionOperationnelle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRIORITE_TACTIQUE_LOGISTIQUE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRIORITE_TACTIQUE_LOGISTIQUE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getConcerneUnite() {
		return concerneUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcerneUnite(TypeAssociationEXT newConcerneUnite, NotificationChain msgs) {
		TypeAssociationEXT oldConcerneUnite = concerneUnite;
		concerneUnite = newConcerneUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRIORITE_TACTIQUE_LOGISTIQUE__CONCERNE_UNITE, oldConcerneUnite, newConcerneUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcerneUnite(TypeAssociationEXT newConcerneUnite) {
		if (newConcerneUnite != concerneUnite) {
			NotificationChain msgs = null;
			if (concerneUnite != null)
				msgs = ((InternalEObject)concerneUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PRIORITE_TACTIQUE_LOGISTIQUE__CONCERNE_UNITE, null, msgs);
			if (newConcerneUnite != null)
				msgs = ((InternalEObject)newConcerneUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PRIORITE_TACTIQUE_LOGISTIQUE__CONCERNE_UNITE, null, msgs);
			msgs = basicSetConcerneUnite(newConcerneUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRIORITE_TACTIQUE_LOGISTIQUE__CONCERNE_UNITE, newConcerneUnite, newConcerneUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_PRIORITE_TACTIQUE_LOGISTIQUE__CONCERNE_UNITE:
				return basicSetConcerneUnite(null, msgs);
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
			case SchemaPackage.TYPE_PRIORITE_TACTIQUE_LOGISTIQUE__PRIORITE:
				return getPriorite();
			case SchemaPackage.TYPE_PRIORITE_TACTIQUE_LOGISTIQUE__FONCTION_OPERATIONNELLE:
				return getFonctionOperationnelle();
			case SchemaPackage.TYPE_PRIORITE_TACTIQUE_LOGISTIQUE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_PRIORITE_TACTIQUE_LOGISTIQUE__CE:
				return getCE();
			case SchemaPackage.TYPE_PRIORITE_TACTIQUE_LOGISTIQUE__CONCERNE_UNITE:
				return getConcerneUnite();
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
			case SchemaPackage.TYPE_PRIORITE_TACTIQUE_LOGISTIQUE__PRIORITE:
				setPriorite((TypeDictionaryDicoPriorite)newValue);
				return;
			case SchemaPackage.TYPE_PRIORITE_TACTIQUE_LOGISTIQUE__FONCTION_OPERATIONNELLE:
				setFonctionOperationnelle((String)newValue);
				return;
			case SchemaPackage.TYPE_PRIORITE_TACTIQUE_LOGISTIQUE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_PRIORITE_TACTIQUE_LOGISTIQUE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_PRIORITE_TACTIQUE_LOGISTIQUE__CONCERNE_UNITE:
				setConcerneUnite((TypeAssociationEXT)newValue);
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
			case SchemaPackage.TYPE_PRIORITE_TACTIQUE_LOGISTIQUE__PRIORITE:
				unsetPriorite();
				return;
			case SchemaPackage.TYPE_PRIORITE_TACTIQUE_LOGISTIQUE__FONCTION_OPERATIONNELLE:
				setFonctionOperationnelle(FONCTION_OPERATIONNELLE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PRIORITE_TACTIQUE_LOGISTIQUE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PRIORITE_TACTIQUE_LOGISTIQUE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PRIORITE_TACTIQUE_LOGISTIQUE__CONCERNE_UNITE:
				setConcerneUnite((TypeAssociationEXT)null);
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
			case SchemaPackage.TYPE_PRIORITE_TACTIQUE_LOGISTIQUE__PRIORITE:
				return isSetPriorite();
			case SchemaPackage.TYPE_PRIORITE_TACTIQUE_LOGISTIQUE__FONCTION_OPERATIONNELLE:
				return FONCTION_OPERATIONNELLE_EDEFAULT == null ? fonctionOperationnelle != null : !FONCTION_OPERATIONNELLE_EDEFAULT.equals(fonctionOperationnelle);
			case SchemaPackage.TYPE_PRIORITE_TACTIQUE_LOGISTIQUE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_PRIORITE_TACTIQUE_LOGISTIQUE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_PRIORITE_TACTIQUE_LOGISTIQUE__CONCERNE_UNITE:
				return concerneUnite != null;
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
		result.append(", fonctionOperationnelle: ");
		result.append(fonctionOperationnelle);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypePrioriteTactiqueLogistiqueImpl
