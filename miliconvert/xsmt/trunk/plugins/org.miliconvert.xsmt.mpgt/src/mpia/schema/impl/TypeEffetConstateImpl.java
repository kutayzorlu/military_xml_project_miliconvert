/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoEffetConstateEffetConstate;
import mpia.schema.TypeDictionaryDicoEffetConstateTypeCible;
import mpia.schema.TypeEffetConstate;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Effet Constate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEffetConstateImpl#getTypeCible <em>Type Cible</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEffetConstateImpl#getNombreElements <em>Nombre Elements</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEffetConstateImpl#getEffetConstate <em>Effet Constate</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEffetConstateImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEffetConstateImpl#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEffetConstateImpl extends EObjectImpl implements TypeEffetConstate {
	/**
	 * The default value of the '{@link #getTypeCible() <em>Type Cible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCible()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEffetConstateTypeCible TYPE_CIBLE_EDEFAULT = TypeDictionaryDicoEffetConstateTypeCible.ARMOR;

	/**
	 * The cached value of the '{@link #getTypeCible() <em>Type Cible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCible()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEffetConstateTypeCible typeCible = TYPE_CIBLE_EDEFAULT;

	/**
	 * This is true if the Type Cible attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeCibleESet;

	/**
	 * The default value of the '{@link #getNombreElements() <em>Nombre Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreElements()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_ELEMENTS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreElements() <em>Nombre Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreElements()
	 * @generated
	 * @ordered
	 */
	protected long nombreElements = NOMBRE_ELEMENTS_EDEFAULT;

	/**
	 * This is true if the Nombre Elements attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreElementsESet;

	/**
	 * The default value of the '{@link #getEffetConstate() <em>Effet Constate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffetConstate()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEffetConstateEffetConstate EFFET_CONSTATE_EDEFAULT = TypeDictionaryDicoEffetConstateEffetConstate._1;

	/**
	 * The cached value of the '{@link #getEffetConstate() <em>Effet Constate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffetConstate()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEffetConstateEffetConstate effetConstate = EFFET_CONSTATE_EDEFAULT;

	/**
	 * This is true if the Effet Constate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean effetConstateESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEffetConstateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEffetConstate();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEffetConstateTypeCible getTypeCible() {
		return typeCible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeCible(TypeDictionaryDicoEffetConstateTypeCible newTypeCible) {
		TypeDictionaryDicoEffetConstateTypeCible oldTypeCible = typeCible;
		typeCible = newTypeCible == null ? TYPE_CIBLE_EDEFAULT : newTypeCible;
		boolean oldTypeCibleESet = typeCibleESet;
		typeCibleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFET_CONSTATE__TYPE_CIBLE, oldTypeCible, typeCible, !oldTypeCibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeCible() {
		TypeDictionaryDicoEffetConstateTypeCible oldTypeCible = typeCible;
		boolean oldTypeCibleESet = typeCibleESet;
		typeCible = TYPE_CIBLE_EDEFAULT;
		typeCibleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EFFET_CONSTATE__TYPE_CIBLE, oldTypeCible, TYPE_CIBLE_EDEFAULT, oldTypeCibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeCible() {
		return typeCibleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreElements() {
		return nombreElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreElements(long newNombreElements) {
		long oldNombreElements = nombreElements;
		nombreElements = newNombreElements;
		boolean oldNombreElementsESet = nombreElementsESet;
		nombreElementsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFET_CONSTATE__NOMBRE_ELEMENTS, oldNombreElements, nombreElements, !oldNombreElementsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreElements() {
		long oldNombreElements = nombreElements;
		boolean oldNombreElementsESet = nombreElementsESet;
		nombreElements = NOMBRE_ELEMENTS_EDEFAULT;
		nombreElementsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EFFET_CONSTATE__NOMBRE_ELEMENTS, oldNombreElements, NOMBRE_ELEMENTS_EDEFAULT, oldNombreElementsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreElements() {
		return nombreElementsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEffetConstateEffetConstate getEffetConstate() {
		return effetConstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffetConstate(TypeDictionaryDicoEffetConstateEffetConstate newEffetConstate) {
		TypeDictionaryDicoEffetConstateEffetConstate oldEffetConstate = effetConstate;
		effetConstate = newEffetConstate == null ? EFFET_CONSTATE_EDEFAULT : newEffetConstate;
		boolean oldEffetConstateESet = effetConstateESet;
		effetConstateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFET_CONSTATE__EFFET_CONSTATE, oldEffetConstate, effetConstate, !oldEffetConstateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEffetConstate() {
		TypeDictionaryDicoEffetConstateEffetConstate oldEffetConstate = effetConstate;
		boolean oldEffetConstateESet = effetConstateESet;
		effetConstate = EFFET_CONSTATE_EDEFAULT;
		effetConstateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EFFET_CONSTATE__EFFET_CONSTATE, oldEffetConstate, EFFET_CONSTATE_EDEFAULT, oldEffetConstateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEffetConstate() {
		return effetConstateESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFET_CONSTATE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFET_CONSTATE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_EFFET_CONSTATE__TYPE_CIBLE:
				return getTypeCible();
			case SchemaPackage.TYPE_EFFET_CONSTATE__NOMBRE_ELEMENTS:
				return new Long(getNombreElements());
			case SchemaPackage.TYPE_EFFET_CONSTATE__EFFET_CONSTATE:
				return getEffetConstate();
			case SchemaPackage.TYPE_EFFET_CONSTATE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_EFFET_CONSTATE__CE:
				return getCE();
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
			case SchemaPackage.TYPE_EFFET_CONSTATE__TYPE_CIBLE:
				setTypeCible((TypeDictionaryDicoEffetConstateTypeCible)newValue);
				return;
			case SchemaPackage.TYPE_EFFET_CONSTATE__NOMBRE_ELEMENTS:
				setNombreElements(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_EFFET_CONSTATE__EFFET_CONSTATE:
				setEffetConstate((TypeDictionaryDicoEffetConstateEffetConstate)newValue);
				return;
			case SchemaPackage.TYPE_EFFET_CONSTATE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_EFFET_CONSTATE__CE:
				setCE((String)newValue);
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
			case SchemaPackage.TYPE_EFFET_CONSTATE__TYPE_CIBLE:
				unsetTypeCible();
				return;
			case SchemaPackage.TYPE_EFFET_CONSTATE__NOMBRE_ELEMENTS:
				unsetNombreElements();
				return;
			case SchemaPackage.TYPE_EFFET_CONSTATE__EFFET_CONSTATE:
				unsetEffetConstate();
				return;
			case SchemaPackage.TYPE_EFFET_CONSTATE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_EFFET_CONSTATE__CE:
				setCE(CE_EDEFAULT);
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
			case SchemaPackage.TYPE_EFFET_CONSTATE__TYPE_CIBLE:
				return isSetTypeCible();
			case SchemaPackage.TYPE_EFFET_CONSTATE__NOMBRE_ELEMENTS:
				return isSetNombreElements();
			case SchemaPackage.TYPE_EFFET_CONSTATE__EFFET_CONSTATE:
				return isSetEffetConstate();
			case SchemaPackage.TYPE_EFFET_CONSTATE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_EFFET_CONSTATE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
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
		result.append(" (typeCible: ");
		if (typeCibleESet) result.append(typeCible); else result.append("<unset>");
		result.append(", nombreElements: ");
		if (nombreElementsESet) result.append(nombreElements); else result.append("<unset>");
		result.append(", effetConstate: ");
		if (effetConstateESet) result.append(effetConstate); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeEffetConstateImpl
