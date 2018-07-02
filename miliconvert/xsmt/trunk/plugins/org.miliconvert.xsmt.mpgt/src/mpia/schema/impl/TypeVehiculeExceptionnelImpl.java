/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeEssieu;
import mpia.schema.TypeVehiculeExceptionnel;

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
 * An implementation of the model object '<em><b>Type Vehicule Exceptionnel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeVehiculeExceptionnelImpl#getTypeVehiculeExceptionnel <em>Type Vehicule Exceptionnel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeVehiculeExceptionnelImpl#getNombreEssieuxTracteur <em>Nombre Essieux Tracteur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeVehiculeExceptionnelImpl#getNombreEssieuxSemiRemorque <em>Nombre Essieux Semi Remorque</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeVehiculeExceptionnelImpl#getPoidsTotal <em>Poids Total</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeVehiculeExceptionnelImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeVehiculeExceptionnelImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeVehiculeExceptionnelImpl#getACommeCaracteristiqueEssieuEssieu <em>AComme Caracteristique Essieu Essieu</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeVehiculeExceptionnelImpl extends EObjectImpl implements TypeVehiculeExceptionnel {
	/**
	 * The default value of the '{@link #getTypeVehiculeExceptionnel() <em>Type Vehicule Exceptionnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeVehiculeExceptionnel()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_VEHICULE_EXCEPTIONNEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeVehiculeExceptionnel() <em>Type Vehicule Exceptionnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeVehiculeExceptionnel()
	 * @generated
	 * @ordered
	 */
	protected String typeVehiculeExceptionnel = TYPE_VEHICULE_EXCEPTIONNEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getNombreEssieuxTracteur() <em>Nombre Essieux Tracteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreEssieuxTracteur()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_ESSIEUX_TRACTEUR_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreEssieuxTracteur() <em>Nombre Essieux Tracteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreEssieuxTracteur()
	 * @generated
	 * @ordered
	 */
	protected long nombreEssieuxTracteur = NOMBRE_ESSIEUX_TRACTEUR_EDEFAULT;

	/**
	 * This is true if the Nombre Essieux Tracteur attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreEssieuxTracteurESet;

	/**
	 * The default value of the '{@link #getNombreEssieuxSemiRemorque() <em>Nombre Essieux Semi Remorque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreEssieuxSemiRemorque()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_ESSIEUX_SEMI_REMORQUE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreEssieuxSemiRemorque() <em>Nombre Essieux Semi Remorque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreEssieuxSemiRemorque()
	 * @generated
	 * @ordered
	 */
	protected long nombreEssieuxSemiRemorque = NOMBRE_ESSIEUX_SEMI_REMORQUE_EDEFAULT;

	/**
	 * This is true if the Nombre Essieux Semi Remorque attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreEssieuxSemiRemorqueESet;

	/**
	 * The default value of the '{@link #getPoidsTotal() <em>Poids Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoidsTotal()
	 * @generated
	 * @ordered
	 */
	protected static final long POIDS_TOTAL_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getPoidsTotal() <em>Poids Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoidsTotal()
	 * @generated
	 * @ordered
	 */
	protected long poidsTotal = POIDS_TOTAL_EDEFAULT;

	/**
	 * This is true if the Poids Total attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean poidsTotalESet;

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
	 * The cached value of the '{@link #getACommeCaracteristiqueEssieuEssieu() <em>AComme Caracteristique Essieu Essieu</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeCaracteristiqueEssieuEssieu()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeEssieu> aCommeCaracteristiqueEssieuEssieu;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeVehiculeExceptionnelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeVehiculeExceptionnel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeVehiculeExceptionnel() {
		return typeVehiculeExceptionnel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeVehiculeExceptionnel(String newTypeVehiculeExceptionnel) {
		String oldTypeVehiculeExceptionnel = typeVehiculeExceptionnel;
		typeVehiculeExceptionnel = newTypeVehiculeExceptionnel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VEHICULE_EXCEPTIONNEL__TYPE_VEHICULE_EXCEPTIONNEL, oldTypeVehiculeExceptionnel, typeVehiculeExceptionnel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreEssieuxTracteur() {
		return nombreEssieuxTracteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreEssieuxTracteur(long newNombreEssieuxTracteur) {
		long oldNombreEssieuxTracteur = nombreEssieuxTracteur;
		nombreEssieuxTracteur = newNombreEssieuxTracteur;
		boolean oldNombreEssieuxTracteurESet = nombreEssieuxTracteurESet;
		nombreEssieuxTracteurESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VEHICULE_EXCEPTIONNEL__NOMBRE_ESSIEUX_TRACTEUR, oldNombreEssieuxTracteur, nombreEssieuxTracteur, !oldNombreEssieuxTracteurESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreEssieuxTracteur() {
		long oldNombreEssieuxTracteur = nombreEssieuxTracteur;
		boolean oldNombreEssieuxTracteurESet = nombreEssieuxTracteurESet;
		nombreEssieuxTracteur = NOMBRE_ESSIEUX_TRACTEUR_EDEFAULT;
		nombreEssieuxTracteurESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_VEHICULE_EXCEPTIONNEL__NOMBRE_ESSIEUX_TRACTEUR, oldNombreEssieuxTracteur, NOMBRE_ESSIEUX_TRACTEUR_EDEFAULT, oldNombreEssieuxTracteurESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreEssieuxTracteur() {
		return nombreEssieuxTracteurESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreEssieuxSemiRemorque() {
		return nombreEssieuxSemiRemorque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreEssieuxSemiRemorque(long newNombreEssieuxSemiRemorque) {
		long oldNombreEssieuxSemiRemorque = nombreEssieuxSemiRemorque;
		nombreEssieuxSemiRemorque = newNombreEssieuxSemiRemorque;
		boolean oldNombreEssieuxSemiRemorqueESet = nombreEssieuxSemiRemorqueESet;
		nombreEssieuxSemiRemorqueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VEHICULE_EXCEPTIONNEL__NOMBRE_ESSIEUX_SEMI_REMORQUE, oldNombreEssieuxSemiRemorque, nombreEssieuxSemiRemorque, !oldNombreEssieuxSemiRemorqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreEssieuxSemiRemorque() {
		long oldNombreEssieuxSemiRemorque = nombreEssieuxSemiRemorque;
		boolean oldNombreEssieuxSemiRemorqueESet = nombreEssieuxSemiRemorqueESet;
		nombreEssieuxSemiRemorque = NOMBRE_ESSIEUX_SEMI_REMORQUE_EDEFAULT;
		nombreEssieuxSemiRemorqueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_VEHICULE_EXCEPTIONNEL__NOMBRE_ESSIEUX_SEMI_REMORQUE, oldNombreEssieuxSemiRemorque, NOMBRE_ESSIEUX_SEMI_REMORQUE_EDEFAULT, oldNombreEssieuxSemiRemorqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreEssieuxSemiRemorque() {
		return nombreEssieuxSemiRemorqueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getPoidsTotal() {
		return poidsTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoidsTotal(long newPoidsTotal) {
		long oldPoidsTotal = poidsTotal;
		poidsTotal = newPoidsTotal;
		boolean oldPoidsTotalESet = poidsTotalESet;
		poidsTotalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VEHICULE_EXCEPTIONNEL__POIDS_TOTAL, oldPoidsTotal, poidsTotal, !oldPoidsTotalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPoidsTotal() {
		long oldPoidsTotal = poidsTotal;
		boolean oldPoidsTotalESet = poidsTotalESet;
		poidsTotal = POIDS_TOTAL_EDEFAULT;
		poidsTotalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_VEHICULE_EXCEPTIONNEL__POIDS_TOTAL, oldPoidsTotal, POIDS_TOTAL_EDEFAULT, oldPoidsTotalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPoidsTotal() {
		return poidsTotalESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VEHICULE_EXCEPTIONNEL__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VEHICULE_EXCEPTIONNEL__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEssieu> getACommeCaracteristiqueEssieuEssieu() {
		if (aCommeCaracteristiqueEssieuEssieu == null) {
			aCommeCaracteristiqueEssieuEssieu = new EObjectContainmentEList<TypeEssieu>(TypeEssieu.class, this, SchemaPackage.TYPE_VEHICULE_EXCEPTIONNEL__ACOMME_CARACTERISTIQUE_ESSIEU_ESSIEU);
		}
		return aCommeCaracteristiqueEssieuEssieu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_VEHICULE_EXCEPTIONNEL__ACOMME_CARACTERISTIQUE_ESSIEU_ESSIEU:
				return ((InternalEList<?>)getACommeCaracteristiqueEssieuEssieu()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_VEHICULE_EXCEPTIONNEL__TYPE_VEHICULE_EXCEPTIONNEL:
				return getTypeVehiculeExceptionnel();
			case SchemaPackage.TYPE_VEHICULE_EXCEPTIONNEL__NOMBRE_ESSIEUX_TRACTEUR:
				return new Long(getNombreEssieuxTracteur());
			case SchemaPackage.TYPE_VEHICULE_EXCEPTIONNEL__NOMBRE_ESSIEUX_SEMI_REMORQUE:
				return new Long(getNombreEssieuxSemiRemorque());
			case SchemaPackage.TYPE_VEHICULE_EXCEPTIONNEL__POIDS_TOTAL:
				return new Long(getPoidsTotal());
			case SchemaPackage.TYPE_VEHICULE_EXCEPTIONNEL__CTE:
				return getCTE();
			case SchemaPackage.TYPE_VEHICULE_EXCEPTIONNEL__CE:
				return getCE();
			case SchemaPackage.TYPE_VEHICULE_EXCEPTIONNEL__ACOMME_CARACTERISTIQUE_ESSIEU_ESSIEU:
				return getACommeCaracteristiqueEssieuEssieu();
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
			case SchemaPackage.TYPE_VEHICULE_EXCEPTIONNEL__TYPE_VEHICULE_EXCEPTIONNEL:
				setTypeVehiculeExceptionnel((String)newValue);
				return;
			case SchemaPackage.TYPE_VEHICULE_EXCEPTIONNEL__NOMBRE_ESSIEUX_TRACTEUR:
				setNombreEssieuxTracteur(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_VEHICULE_EXCEPTIONNEL__NOMBRE_ESSIEUX_SEMI_REMORQUE:
				setNombreEssieuxSemiRemorque(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_VEHICULE_EXCEPTIONNEL__POIDS_TOTAL:
				setPoidsTotal(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_VEHICULE_EXCEPTIONNEL__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_VEHICULE_EXCEPTIONNEL__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_VEHICULE_EXCEPTIONNEL__ACOMME_CARACTERISTIQUE_ESSIEU_ESSIEU:
				getACommeCaracteristiqueEssieuEssieu().clear();
				getACommeCaracteristiqueEssieuEssieu().addAll((Collection<? extends TypeEssieu>)newValue);
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
			case SchemaPackage.TYPE_VEHICULE_EXCEPTIONNEL__TYPE_VEHICULE_EXCEPTIONNEL:
				setTypeVehiculeExceptionnel(TYPE_VEHICULE_EXCEPTIONNEL_EDEFAULT);
				return;
			case SchemaPackage.TYPE_VEHICULE_EXCEPTIONNEL__NOMBRE_ESSIEUX_TRACTEUR:
				unsetNombreEssieuxTracteur();
				return;
			case SchemaPackage.TYPE_VEHICULE_EXCEPTIONNEL__NOMBRE_ESSIEUX_SEMI_REMORQUE:
				unsetNombreEssieuxSemiRemorque();
				return;
			case SchemaPackage.TYPE_VEHICULE_EXCEPTIONNEL__POIDS_TOTAL:
				unsetPoidsTotal();
				return;
			case SchemaPackage.TYPE_VEHICULE_EXCEPTIONNEL__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_VEHICULE_EXCEPTIONNEL__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_VEHICULE_EXCEPTIONNEL__ACOMME_CARACTERISTIQUE_ESSIEU_ESSIEU:
				getACommeCaracteristiqueEssieuEssieu().clear();
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
			case SchemaPackage.TYPE_VEHICULE_EXCEPTIONNEL__TYPE_VEHICULE_EXCEPTIONNEL:
				return TYPE_VEHICULE_EXCEPTIONNEL_EDEFAULT == null ? typeVehiculeExceptionnel != null : !TYPE_VEHICULE_EXCEPTIONNEL_EDEFAULT.equals(typeVehiculeExceptionnel);
			case SchemaPackage.TYPE_VEHICULE_EXCEPTIONNEL__NOMBRE_ESSIEUX_TRACTEUR:
				return isSetNombreEssieuxTracteur();
			case SchemaPackage.TYPE_VEHICULE_EXCEPTIONNEL__NOMBRE_ESSIEUX_SEMI_REMORQUE:
				return isSetNombreEssieuxSemiRemorque();
			case SchemaPackage.TYPE_VEHICULE_EXCEPTIONNEL__POIDS_TOTAL:
				return isSetPoidsTotal();
			case SchemaPackage.TYPE_VEHICULE_EXCEPTIONNEL__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_VEHICULE_EXCEPTIONNEL__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_VEHICULE_EXCEPTIONNEL__ACOMME_CARACTERISTIQUE_ESSIEU_ESSIEU:
				return aCommeCaracteristiqueEssieuEssieu != null && !aCommeCaracteristiqueEssieuEssieu.isEmpty();
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
		result.append(" (typeVehiculeExceptionnel: ");
		result.append(typeVehiculeExceptionnel);
		result.append(", nombreEssieuxTracteur: ");
		if (nombreEssieuxTracteurESet) result.append(nombreEssieuxTracteur); else result.append("<unset>");
		result.append(", nombreEssieuxSemiRemorque: ");
		if (nombreEssieuxSemiRemorqueESet) result.append(nombreEssieuxSemiRemorque); else result.append("<unset>");
		result.append(", poidsTotal: ");
		if (poidsTotalESet) result.append(poidsTotal); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeVehiculeExceptionnelImpl
