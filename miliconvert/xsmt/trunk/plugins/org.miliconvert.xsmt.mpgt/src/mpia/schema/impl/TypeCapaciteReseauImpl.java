/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCapaciteReseau;
import mpia.schema.TypeDictionaryDicoCapaciteReseauTypeLargeurBande;
import mpia.schema.TypeDictionaryDicoCapaciteReseauTypeProtocole;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Capacite Reseau</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCapaciteReseauImpl#getTypeLargeurBande <em>Type Largeur Bande</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteReseauImpl#getTypeProtocole <em>Type Protocole</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteReseauImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteReseauImpl#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCapaciteReseauImpl extends EObjectImpl implements TypeCapaciteReseau {
	/**
	 * The default value of the '{@link #getTypeLargeurBande() <em>Type Largeur Bande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeLargeurBande()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCapaciteReseauTypeLargeurBande TYPE_LARGEUR_BANDE_EDEFAULT = TypeDictionaryDicoCapaciteReseauTypeLargeurBande.E1;

	/**
	 * The cached value of the '{@link #getTypeLargeurBande() <em>Type Largeur Bande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeLargeurBande()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCapaciteReseauTypeLargeurBande typeLargeurBande = TYPE_LARGEUR_BANDE_EDEFAULT;

	/**
	 * This is true if the Type Largeur Bande attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeLargeurBandeESet;

	/**
	 * The default value of the '{@link #getTypeProtocole() <em>Type Protocole</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeProtocole()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCapaciteReseauTypeProtocole TYPE_PROTOCOLE_EDEFAULT = TypeDictionaryDicoCapaciteReseauTypeProtocole.ATM;

	/**
	 * The cached value of the '{@link #getTypeProtocole() <em>Type Protocole</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeProtocole()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCapaciteReseauTypeProtocole typeProtocole = TYPE_PROTOCOLE_EDEFAULT;

	/**
	 * This is true if the Type Protocole attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeProtocoleESet;

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
	protected TypeCapaciteReseauImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCapaciteReseau();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCapaciteReseauTypeLargeurBande getTypeLargeurBande() {
		return typeLargeurBande;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeLargeurBande(TypeDictionaryDicoCapaciteReseauTypeLargeurBande newTypeLargeurBande) {
		TypeDictionaryDicoCapaciteReseauTypeLargeurBande oldTypeLargeurBande = typeLargeurBande;
		typeLargeurBande = newTypeLargeurBande == null ? TYPE_LARGEUR_BANDE_EDEFAULT : newTypeLargeurBande;
		boolean oldTypeLargeurBandeESet = typeLargeurBandeESet;
		typeLargeurBandeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_RESEAU__TYPE_LARGEUR_BANDE, oldTypeLargeurBande, typeLargeurBande, !oldTypeLargeurBandeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeLargeurBande() {
		TypeDictionaryDicoCapaciteReseauTypeLargeurBande oldTypeLargeurBande = typeLargeurBande;
		boolean oldTypeLargeurBandeESet = typeLargeurBandeESet;
		typeLargeurBande = TYPE_LARGEUR_BANDE_EDEFAULT;
		typeLargeurBandeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPACITE_RESEAU__TYPE_LARGEUR_BANDE, oldTypeLargeurBande, TYPE_LARGEUR_BANDE_EDEFAULT, oldTypeLargeurBandeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeLargeurBande() {
		return typeLargeurBandeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCapaciteReseauTypeProtocole getTypeProtocole() {
		return typeProtocole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeProtocole(TypeDictionaryDicoCapaciteReseauTypeProtocole newTypeProtocole) {
		TypeDictionaryDicoCapaciteReseauTypeProtocole oldTypeProtocole = typeProtocole;
		typeProtocole = newTypeProtocole == null ? TYPE_PROTOCOLE_EDEFAULT : newTypeProtocole;
		boolean oldTypeProtocoleESet = typeProtocoleESet;
		typeProtocoleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_RESEAU__TYPE_PROTOCOLE, oldTypeProtocole, typeProtocole, !oldTypeProtocoleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeProtocole() {
		TypeDictionaryDicoCapaciteReseauTypeProtocole oldTypeProtocole = typeProtocole;
		boolean oldTypeProtocoleESet = typeProtocoleESet;
		typeProtocole = TYPE_PROTOCOLE_EDEFAULT;
		typeProtocoleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPACITE_RESEAU__TYPE_PROTOCOLE, oldTypeProtocole, TYPE_PROTOCOLE_EDEFAULT, oldTypeProtocoleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeProtocole() {
		return typeProtocoleESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_RESEAU__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_RESEAU__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_CAPACITE_RESEAU__TYPE_LARGEUR_BANDE:
				return getTypeLargeurBande();
			case SchemaPackage.TYPE_CAPACITE_RESEAU__TYPE_PROTOCOLE:
				return getTypeProtocole();
			case SchemaPackage.TYPE_CAPACITE_RESEAU__CTE:
				return getCTE();
			case SchemaPackage.TYPE_CAPACITE_RESEAU__CE:
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
			case SchemaPackage.TYPE_CAPACITE_RESEAU__TYPE_LARGEUR_BANDE:
				setTypeLargeurBande((TypeDictionaryDicoCapaciteReseauTypeLargeurBande)newValue);
				return;
			case SchemaPackage.TYPE_CAPACITE_RESEAU__TYPE_PROTOCOLE:
				setTypeProtocole((TypeDictionaryDicoCapaciteReseauTypeProtocole)newValue);
				return;
			case SchemaPackage.TYPE_CAPACITE_RESEAU__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_CAPACITE_RESEAU__CE:
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
			case SchemaPackage.TYPE_CAPACITE_RESEAU__TYPE_LARGEUR_BANDE:
				unsetTypeLargeurBande();
				return;
			case SchemaPackage.TYPE_CAPACITE_RESEAU__TYPE_PROTOCOLE:
				unsetTypeProtocole();
				return;
			case SchemaPackage.TYPE_CAPACITE_RESEAU__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CAPACITE_RESEAU__CE:
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
			case SchemaPackage.TYPE_CAPACITE_RESEAU__TYPE_LARGEUR_BANDE:
				return isSetTypeLargeurBande();
			case SchemaPackage.TYPE_CAPACITE_RESEAU__TYPE_PROTOCOLE:
				return isSetTypeProtocole();
			case SchemaPackage.TYPE_CAPACITE_RESEAU__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_CAPACITE_RESEAU__CE:
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
		result.append(" (typeLargeurBande: ");
		if (typeLargeurBandeESet) result.append(typeLargeurBande); else result.append("<unset>");
		result.append(", typeProtocole: ");
		if (typeProtocoleESet) result.append(typeProtocole); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeCapaciteReseauImpl
