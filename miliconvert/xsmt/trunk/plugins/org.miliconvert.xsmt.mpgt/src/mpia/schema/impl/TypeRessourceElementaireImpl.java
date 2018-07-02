/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoConditionnementUnite;
import mpia.schema.TypeRessourceElementaire;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Ressource Elementaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeRessourceElementaireImpl#getVolumeForces <em>Volume Forces</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRessourceElementaireImpl#getConditionnementUnite <em>Conditionnement Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRessourceElementaireImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRessourceElementaireImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRessourceElementaireImpl#getConcerneTypeRessourceTypeConsommable <em>Concerne Type Ressource Type Consommable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeRessourceElementaireImpl extends EObjectImpl implements TypeRessourceElementaire {
	/**
	 * The default value of the '{@link #getVolumeForces() <em>Volume Forces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeForces()
	 * @generated
	 * @ordered
	 */
	protected static final long VOLUME_FORCES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getVolumeForces() <em>Volume Forces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeForces()
	 * @generated
	 * @ordered
	 */
	protected long volumeForces = VOLUME_FORCES_EDEFAULT;

	/**
	 * This is true if the Volume Forces attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean volumeForcesESet;

	/**
	 * The default value of the '{@link #getConditionnementUnite() <em>Conditionnement Unite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionnementUnite()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoConditionnementUnite CONDITIONNEMENT_UNITE_EDEFAULT = TypeDictionaryDicoConditionnementUnite.CM;

	/**
	 * The cached value of the '{@link #getConditionnementUnite() <em>Conditionnement Unite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionnementUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoConditionnementUnite conditionnementUnite = CONDITIONNEMENT_UNITE_EDEFAULT;

	/**
	 * This is true if the Conditionnement Unite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean conditionnementUniteESet;

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
	 * The cached value of the '{@link #getConcerneTypeRessourceTypeConsommable() <em>Concerne Type Ressource Type Consommable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneTypeRessourceTypeConsommable()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT concerneTypeRessourceTypeConsommable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeRessourceElementaireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeRessourceElementaire();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getVolumeForces() {
		return volumeForces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolumeForces(long newVolumeForces) {
		long oldVolumeForces = volumeForces;
		volumeForces = newVolumeForces;
		boolean oldVolumeForcesESet = volumeForcesESet;
		volumeForcesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESSOURCE_ELEMENTAIRE__VOLUME_FORCES, oldVolumeForces, volumeForces, !oldVolumeForcesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVolumeForces() {
		long oldVolumeForces = volumeForces;
		boolean oldVolumeForcesESet = volumeForcesESet;
		volumeForces = VOLUME_FORCES_EDEFAULT;
		volumeForcesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_RESSOURCE_ELEMENTAIRE__VOLUME_FORCES, oldVolumeForces, VOLUME_FORCES_EDEFAULT, oldVolumeForcesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVolumeForces() {
		return volumeForcesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoConditionnementUnite getConditionnementUnite() {
		return conditionnementUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionnementUnite(TypeDictionaryDicoConditionnementUnite newConditionnementUnite) {
		TypeDictionaryDicoConditionnementUnite oldConditionnementUnite = conditionnementUnite;
		conditionnementUnite = newConditionnementUnite == null ? CONDITIONNEMENT_UNITE_EDEFAULT : newConditionnementUnite;
		boolean oldConditionnementUniteESet = conditionnementUniteESet;
		conditionnementUniteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESSOURCE_ELEMENTAIRE__CONDITIONNEMENT_UNITE, oldConditionnementUnite, conditionnementUnite, !oldConditionnementUniteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConditionnementUnite() {
		TypeDictionaryDicoConditionnementUnite oldConditionnementUnite = conditionnementUnite;
		boolean oldConditionnementUniteESet = conditionnementUniteESet;
		conditionnementUnite = CONDITIONNEMENT_UNITE_EDEFAULT;
		conditionnementUniteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_RESSOURCE_ELEMENTAIRE__CONDITIONNEMENT_UNITE, oldConditionnementUnite, CONDITIONNEMENT_UNITE_EDEFAULT, oldConditionnementUniteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConditionnementUnite() {
		return conditionnementUniteESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESSOURCE_ELEMENTAIRE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESSOURCE_ELEMENTAIRE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getConcerneTypeRessourceTypeConsommable() {
		return concerneTypeRessourceTypeConsommable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcerneTypeRessourceTypeConsommable(TypeAssociationEXT newConcerneTypeRessourceTypeConsommable, NotificationChain msgs) {
		TypeAssociationEXT oldConcerneTypeRessourceTypeConsommable = concerneTypeRessourceTypeConsommable;
		concerneTypeRessourceTypeConsommable = newConcerneTypeRessourceTypeConsommable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESSOURCE_ELEMENTAIRE__CONCERNE_TYPE_RESSOURCE_TYPE_CONSOMMABLE, oldConcerneTypeRessourceTypeConsommable, newConcerneTypeRessourceTypeConsommable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcerneTypeRessourceTypeConsommable(TypeAssociationEXT newConcerneTypeRessourceTypeConsommable) {
		if (newConcerneTypeRessourceTypeConsommable != concerneTypeRessourceTypeConsommable) {
			NotificationChain msgs = null;
			if (concerneTypeRessourceTypeConsommable != null)
				msgs = ((InternalEObject)concerneTypeRessourceTypeConsommable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RESSOURCE_ELEMENTAIRE__CONCERNE_TYPE_RESSOURCE_TYPE_CONSOMMABLE, null, msgs);
			if (newConcerneTypeRessourceTypeConsommable != null)
				msgs = ((InternalEObject)newConcerneTypeRessourceTypeConsommable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RESSOURCE_ELEMENTAIRE__CONCERNE_TYPE_RESSOURCE_TYPE_CONSOMMABLE, null, msgs);
			msgs = basicSetConcerneTypeRessourceTypeConsommable(newConcerneTypeRessourceTypeConsommable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESSOURCE_ELEMENTAIRE__CONCERNE_TYPE_RESSOURCE_TYPE_CONSOMMABLE, newConcerneTypeRessourceTypeConsommable, newConcerneTypeRessourceTypeConsommable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_RESSOURCE_ELEMENTAIRE__CONCERNE_TYPE_RESSOURCE_TYPE_CONSOMMABLE:
				return basicSetConcerneTypeRessourceTypeConsommable(null, msgs);
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
			case SchemaPackage.TYPE_RESSOURCE_ELEMENTAIRE__VOLUME_FORCES:
				return new Long(getVolumeForces());
			case SchemaPackage.TYPE_RESSOURCE_ELEMENTAIRE__CONDITIONNEMENT_UNITE:
				return getConditionnementUnite();
			case SchemaPackage.TYPE_RESSOURCE_ELEMENTAIRE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_RESSOURCE_ELEMENTAIRE__CE:
				return getCE();
			case SchemaPackage.TYPE_RESSOURCE_ELEMENTAIRE__CONCERNE_TYPE_RESSOURCE_TYPE_CONSOMMABLE:
				return getConcerneTypeRessourceTypeConsommable();
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
			case SchemaPackage.TYPE_RESSOURCE_ELEMENTAIRE__VOLUME_FORCES:
				setVolumeForces(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_RESSOURCE_ELEMENTAIRE__CONDITIONNEMENT_UNITE:
				setConditionnementUnite((TypeDictionaryDicoConditionnementUnite)newValue);
				return;
			case SchemaPackage.TYPE_RESSOURCE_ELEMENTAIRE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_RESSOURCE_ELEMENTAIRE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_RESSOURCE_ELEMENTAIRE__CONCERNE_TYPE_RESSOURCE_TYPE_CONSOMMABLE:
				setConcerneTypeRessourceTypeConsommable((TypeAssociationEXT)newValue);
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
			case SchemaPackage.TYPE_RESSOURCE_ELEMENTAIRE__VOLUME_FORCES:
				unsetVolumeForces();
				return;
			case SchemaPackage.TYPE_RESSOURCE_ELEMENTAIRE__CONDITIONNEMENT_UNITE:
				unsetConditionnementUnite();
				return;
			case SchemaPackage.TYPE_RESSOURCE_ELEMENTAIRE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RESSOURCE_ELEMENTAIRE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RESSOURCE_ELEMENTAIRE__CONCERNE_TYPE_RESSOURCE_TYPE_CONSOMMABLE:
				setConcerneTypeRessourceTypeConsommable((TypeAssociationEXT)null);
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
			case SchemaPackage.TYPE_RESSOURCE_ELEMENTAIRE__VOLUME_FORCES:
				return isSetVolumeForces();
			case SchemaPackage.TYPE_RESSOURCE_ELEMENTAIRE__CONDITIONNEMENT_UNITE:
				return isSetConditionnementUnite();
			case SchemaPackage.TYPE_RESSOURCE_ELEMENTAIRE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_RESSOURCE_ELEMENTAIRE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_RESSOURCE_ELEMENTAIRE__CONCERNE_TYPE_RESSOURCE_TYPE_CONSOMMABLE:
				return concerneTypeRessourceTypeConsommable != null;
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
		result.append(" (volumeForces: ");
		if (volumeForcesESet) result.append(volumeForces); else result.append("<unset>");
		result.append(", conditionnementUnite: ");
		if (conditionnementUniteESet) result.append(conditionnementUnite); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeRessourceElementaireImpl
