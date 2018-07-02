/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoTypeElement;
import mpia.schema.TypeQuantiteTypeObserve;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Quantite Type Observe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeQuantiteTypeObserveImpl#getQuantite <em>Quantite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeQuantiteTypeObserveImpl#getTypeElement <em>Type Element</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeQuantiteTypeObserveImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeQuantiteTypeObserveImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeQuantiteTypeObserveImpl#getConcerneType <em>Concerne Type</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeQuantiteTypeObserveImpl#getAPourNationaliteEntitePolitique <em>APour Nationalite Entite Politique</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeQuantiteTypeObserveImpl extends EObjectImpl implements TypeQuantiteTypeObserve {
	/**
	 * The default value of the '{@link #getQuantite() <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantite()
	 * @generated
	 * @ordered
	 */
	protected static final long QUANTITE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getQuantite() <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantite()
	 * @generated
	 * @ordered
	 */
	protected long quantite = QUANTITE_EDEFAULT;

	/**
	 * This is true if the Quantite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quantiteESet;

	/**
	 * The default value of the '{@link #getTypeElement() <em>Type Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeElement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeElement TYPE_ELEMENT_EDEFAULT = TypeDictionaryDicoTypeElement.TANK;

	/**
	 * The cached value of the '{@link #getTypeElement() <em>Type Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeElement()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeElement typeElement = TYPE_ELEMENT_EDEFAULT;

	/**
	 * This is true if the Type Element attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeElementESet;

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
	 * The cached value of the '{@link #getConcerneType() <em>Concerne Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneType()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT concerneType;

	/**
	 * The cached value of the '{@link #getAPourNationaliteEntitePolitique() <em>APour Nationalite Entite Politique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourNationaliteEntitePolitique()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourNationaliteEntitePolitique;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeQuantiteTypeObserveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeQuantiteTypeObserve();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getQuantite() {
		return quantite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantite(long newQuantite) {
		long oldQuantite = quantite;
		quantite = newQuantite;
		boolean oldQuantiteESet = quantiteESet;
		quantiteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUANTITE_TYPE_OBSERVE__QUANTITE, oldQuantite, quantite, !oldQuantiteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuantite() {
		long oldQuantite = quantite;
		boolean oldQuantiteESet = quantiteESet;
		quantite = QUANTITE_EDEFAULT;
		quantiteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_QUANTITE_TYPE_OBSERVE__QUANTITE, oldQuantite, QUANTITE_EDEFAULT, oldQuantiteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuantite() {
		return quantiteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeElement getTypeElement() {
		return typeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeElement(TypeDictionaryDicoTypeElement newTypeElement) {
		TypeDictionaryDicoTypeElement oldTypeElement = typeElement;
		typeElement = newTypeElement == null ? TYPE_ELEMENT_EDEFAULT : newTypeElement;
		boolean oldTypeElementESet = typeElementESet;
		typeElementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUANTITE_TYPE_OBSERVE__TYPE_ELEMENT, oldTypeElement, typeElement, !oldTypeElementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeElement() {
		TypeDictionaryDicoTypeElement oldTypeElement = typeElement;
		boolean oldTypeElementESet = typeElementESet;
		typeElement = TYPE_ELEMENT_EDEFAULT;
		typeElementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_QUANTITE_TYPE_OBSERVE__TYPE_ELEMENT, oldTypeElement, TYPE_ELEMENT_EDEFAULT, oldTypeElementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeElement() {
		return typeElementESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUANTITE_TYPE_OBSERVE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUANTITE_TYPE_OBSERVE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getConcerneType() {
		return concerneType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcerneType(TypeAssociationEXT newConcerneType, NotificationChain msgs) {
		TypeAssociationEXT oldConcerneType = concerneType;
		concerneType = newConcerneType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUANTITE_TYPE_OBSERVE__CONCERNE_TYPE, oldConcerneType, newConcerneType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcerneType(TypeAssociationEXT newConcerneType) {
		if (newConcerneType != concerneType) {
			NotificationChain msgs = null;
			if (concerneType != null)
				msgs = ((InternalEObject)concerneType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_QUANTITE_TYPE_OBSERVE__CONCERNE_TYPE, null, msgs);
			if (newConcerneType != null)
				msgs = ((InternalEObject)newConcerneType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_QUANTITE_TYPE_OBSERVE__CONCERNE_TYPE, null, msgs);
			msgs = basicSetConcerneType(newConcerneType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUANTITE_TYPE_OBSERVE__CONCERNE_TYPE, newConcerneType, newConcerneType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourNationaliteEntitePolitique() {
		return aPourNationaliteEntitePolitique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourNationaliteEntitePolitique(TypeAssociation newAPourNationaliteEntitePolitique, NotificationChain msgs) {
		TypeAssociation oldAPourNationaliteEntitePolitique = aPourNationaliteEntitePolitique;
		aPourNationaliteEntitePolitique = newAPourNationaliteEntitePolitique;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUANTITE_TYPE_OBSERVE__APOUR_NATIONALITE_ENTITE_POLITIQUE, oldAPourNationaliteEntitePolitique, newAPourNationaliteEntitePolitique);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourNationaliteEntitePolitique(TypeAssociation newAPourNationaliteEntitePolitique) {
		if (newAPourNationaliteEntitePolitique != aPourNationaliteEntitePolitique) {
			NotificationChain msgs = null;
			if (aPourNationaliteEntitePolitique != null)
				msgs = ((InternalEObject)aPourNationaliteEntitePolitique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_QUANTITE_TYPE_OBSERVE__APOUR_NATIONALITE_ENTITE_POLITIQUE, null, msgs);
			if (newAPourNationaliteEntitePolitique != null)
				msgs = ((InternalEObject)newAPourNationaliteEntitePolitique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_QUANTITE_TYPE_OBSERVE__APOUR_NATIONALITE_ENTITE_POLITIQUE, null, msgs);
			msgs = basicSetAPourNationaliteEntitePolitique(newAPourNationaliteEntitePolitique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUANTITE_TYPE_OBSERVE__APOUR_NATIONALITE_ENTITE_POLITIQUE, newAPourNationaliteEntitePolitique, newAPourNationaliteEntitePolitique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_QUANTITE_TYPE_OBSERVE__CONCERNE_TYPE:
				return basicSetConcerneType(null, msgs);
			case SchemaPackage.TYPE_QUANTITE_TYPE_OBSERVE__APOUR_NATIONALITE_ENTITE_POLITIQUE:
				return basicSetAPourNationaliteEntitePolitique(null, msgs);
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
			case SchemaPackage.TYPE_QUANTITE_TYPE_OBSERVE__QUANTITE:
				return new Long(getQuantite());
			case SchemaPackage.TYPE_QUANTITE_TYPE_OBSERVE__TYPE_ELEMENT:
				return getTypeElement();
			case SchemaPackage.TYPE_QUANTITE_TYPE_OBSERVE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_QUANTITE_TYPE_OBSERVE__CE:
				return getCE();
			case SchemaPackage.TYPE_QUANTITE_TYPE_OBSERVE__CONCERNE_TYPE:
				return getConcerneType();
			case SchemaPackage.TYPE_QUANTITE_TYPE_OBSERVE__APOUR_NATIONALITE_ENTITE_POLITIQUE:
				return getAPourNationaliteEntitePolitique();
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
			case SchemaPackage.TYPE_QUANTITE_TYPE_OBSERVE__QUANTITE:
				setQuantite(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_QUANTITE_TYPE_OBSERVE__TYPE_ELEMENT:
				setTypeElement((TypeDictionaryDicoTypeElement)newValue);
				return;
			case SchemaPackage.TYPE_QUANTITE_TYPE_OBSERVE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_QUANTITE_TYPE_OBSERVE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_QUANTITE_TYPE_OBSERVE__CONCERNE_TYPE:
				setConcerneType((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_QUANTITE_TYPE_OBSERVE__APOUR_NATIONALITE_ENTITE_POLITIQUE:
				setAPourNationaliteEntitePolitique((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_QUANTITE_TYPE_OBSERVE__QUANTITE:
				unsetQuantite();
				return;
			case SchemaPackage.TYPE_QUANTITE_TYPE_OBSERVE__TYPE_ELEMENT:
				unsetTypeElement();
				return;
			case SchemaPackage.TYPE_QUANTITE_TYPE_OBSERVE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_QUANTITE_TYPE_OBSERVE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_QUANTITE_TYPE_OBSERVE__CONCERNE_TYPE:
				setConcerneType((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_QUANTITE_TYPE_OBSERVE__APOUR_NATIONALITE_ENTITE_POLITIQUE:
				setAPourNationaliteEntitePolitique((TypeAssociation)null);
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
			case SchemaPackage.TYPE_QUANTITE_TYPE_OBSERVE__QUANTITE:
				return isSetQuantite();
			case SchemaPackage.TYPE_QUANTITE_TYPE_OBSERVE__TYPE_ELEMENT:
				return isSetTypeElement();
			case SchemaPackage.TYPE_QUANTITE_TYPE_OBSERVE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_QUANTITE_TYPE_OBSERVE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_QUANTITE_TYPE_OBSERVE__CONCERNE_TYPE:
				return concerneType != null;
			case SchemaPackage.TYPE_QUANTITE_TYPE_OBSERVE__APOUR_NATIONALITE_ENTITE_POLITIQUE:
				return aPourNationaliteEntitePolitique != null;
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
		result.append(" (quantite: ");
		if (quantiteESet) result.append(quantite); else result.append("<unset>");
		result.append(", typeElement: ");
		if (typeElementESet) result.append(typeElement); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeQuantiteTypeObserveImpl
