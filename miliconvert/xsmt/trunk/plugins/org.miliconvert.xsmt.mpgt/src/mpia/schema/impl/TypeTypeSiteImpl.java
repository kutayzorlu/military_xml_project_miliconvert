/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoCapaciteMobiliteMobiliteSite;
import mpia.schema.TypeTypeSite;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Type Site</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeTypeSiteImpl#getMobilite <em>Mobilite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeSiteImpl#getEstTypeSiteAssocieCapaciteGenie <em>Est Type Site Associe Capacite Genie</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypeTypeSiteImpl extends TypeTypeImpl implements TypeTypeSite {
	/**
	 * The default value of the '{@link #getMobilite() <em>Mobilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMobilite()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCapaciteMobiliteMobiliteSite MOBILITE_EDEFAULT = TypeDictionaryDicoCapaciteMobiliteMobiliteSite.FIXED;

	/**
	 * The cached value of the '{@link #getMobilite() <em>Mobilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMobilite()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCapaciteMobiliteMobiliteSite mobilite = MOBILITE_EDEFAULT;

	/**
	 * This is true if the Mobilite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mobiliteESet;

	/**
	 * The cached value of the '{@link #getEstTypeSiteAssocieCapaciteGenie() <em>Est Type Site Associe Capacite Genie</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstTypeSiteAssocieCapaciteGenie()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estTypeSiteAssocieCapaciteGenie;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeTypeSiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeTypeSite();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCapaciteMobiliteMobiliteSite getMobilite() {
		return mobilite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMobilite(TypeDictionaryDicoCapaciteMobiliteMobiliteSite newMobilite) {
		TypeDictionaryDicoCapaciteMobiliteMobiliteSite oldMobilite = mobilite;
		mobilite = newMobilite == null ? MOBILITE_EDEFAULT : newMobilite;
		boolean oldMobiliteESet = mobiliteESet;
		mobiliteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_SITE__MOBILITE, oldMobilite, mobilite, !oldMobiliteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMobilite() {
		TypeDictionaryDicoCapaciteMobiliteMobiliteSite oldMobilite = mobilite;
		boolean oldMobiliteESet = mobiliteESet;
		mobilite = MOBILITE_EDEFAULT;
		mobiliteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_SITE__MOBILITE, oldMobilite, MOBILITE_EDEFAULT, oldMobiliteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMobilite() {
		return mobiliteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstTypeSiteAssocieCapaciteGenie() {
		if (estTypeSiteAssocieCapaciteGenie == null) {
			estTypeSiteAssocieCapaciteGenie = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_TYPE_SITE__EST_TYPE_SITE_ASSOCIE_CAPACITE_GENIE);
		}
		return estTypeSiteAssocieCapaciteGenie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_TYPE_SITE__EST_TYPE_SITE_ASSOCIE_CAPACITE_GENIE:
				return ((InternalEList<?>)getEstTypeSiteAssocieCapaciteGenie()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_TYPE_SITE__MOBILITE:
				return getMobilite();
			case SchemaPackage.TYPE_TYPE_SITE__EST_TYPE_SITE_ASSOCIE_CAPACITE_GENIE:
				return getEstTypeSiteAssocieCapaciteGenie();
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
			case SchemaPackage.TYPE_TYPE_SITE__MOBILITE:
				setMobilite((TypeDictionaryDicoCapaciteMobiliteMobiliteSite)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_SITE__EST_TYPE_SITE_ASSOCIE_CAPACITE_GENIE:
				getEstTypeSiteAssocieCapaciteGenie().clear();
				getEstTypeSiteAssocieCapaciteGenie().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_TYPE_SITE__MOBILITE:
				unsetMobilite();
				return;
			case SchemaPackage.TYPE_TYPE_SITE__EST_TYPE_SITE_ASSOCIE_CAPACITE_GENIE:
				getEstTypeSiteAssocieCapaciteGenie().clear();
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
			case SchemaPackage.TYPE_TYPE_SITE__MOBILITE:
				return isSetMobilite();
			case SchemaPackage.TYPE_TYPE_SITE__EST_TYPE_SITE_ASSOCIE_CAPACITE_GENIE:
				return estTypeSiteAssocieCapaciteGenie != null && !estTypeSiteAssocieCapaciteGenie.isEmpty();
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
		result.append(" (mobilite: ");
		if (mobiliteESet) result.append(mobilite); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeTypeSiteImpl
