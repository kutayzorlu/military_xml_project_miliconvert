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
import mpia.schema.TypeDictionaryDicoActivitePrincipale;
import mpia.schema.TypeDictionaryDicoArmee;
import mpia.schema.TypeTypeOrganisationGouvernementale;

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
 * An implementation of the model object '<em><b>Type Type Organisation Gouvernementale</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeTypeOrganisationGouvernementaleImpl#getArmee <em>Armee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeOrganisationGouvernementaleImpl#getActivitePrincipale <em>Activite Principale</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeOrganisationGouvernementaleImpl#getEstSupporteeParTypeUnite <em>Est Supportee Par Type Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypeTypeOrganisationGouvernementaleImpl extends TypeTypeEntiteOrganisationnelleImpl implements TypeTypeOrganisationGouvernementale {
	/**
	 * The default value of the '{@link #getArmee() <em>Armee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArmee()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoArmee ARMEE_EDEFAULT = TypeDictionaryDicoArmee.AIRFRC;

	/**
	 * The cached value of the '{@link #getArmee() <em>Armee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArmee()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoArmee armee = ARMEE_EDEFAULT;

	/**
	 * This is true if the Armee attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean armeeESet;

	/**
	 * The default value of the '{@link #getActivitePrincipale() <em>Activite Principale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitePrincipale()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoActivitePrincipale ACTIVITE_PRINCIPALE_EDEFAULT = TypeDictionaryDicoActivitePrincipale.AGRCPR;

	/**
	 * The cached value of the '{@link #getActivitePrincipale() <em>Activite Principale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitePrincipale()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoActivitePrincipale activitePrincipale = ACTIVITE_PRINCIPALE_EDEFAULT;

	/**
	 * This is true if the Activite Principale attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean activitePrincipaleESet;

	/**
	 * The cached value of the '{@link #getEstSupporteeParTypeUnite() <em>Est Supportee Par Type Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSupporteeParTypeUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSupporteeParTypeUnite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeTypeOrganisationGouvernementaleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeTypeOrganisationGouvernementale();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoArmee getArmee() {
		return armee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArmee(TypeDictionaryDicoArmee newArmee) {
		TypeDictionaryDicoArmee oldArmee = armee;
		armee = newArmee == null ? ARMEE_EDEFAULT : newArmee;
		boolean oldArmeeESet = armeeESet;
		armeeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_ORGANISATION_GOUVERNEMENTALE__ARMEE, oldArmee, armee, !oldArmeeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetArmee() {
		TypeDictionaryDicoArmee oldArmee = armee;
		boolean oldArmeeESet = armeeESet;
		armee = ARMEE_EDEFAULT;
		armeeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_ORGANISATION_GOUVERNEMENTALE__ARMEE, oldArmee, ARMEE_EDEFAULT, oldArmeeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetArmee() {
		return armeeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoActivitePrincipale getActivitePrincipale() {
		return activitePrincipale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivitePrincipale(TypeDictionaryDicoActivitePrincipale newActivitePrincipale) {
		TypeDictionaryDicoActivitePrincipale oldActivitePrincipale = activitePrincipale;
		activitePrincipale = newActivitePrincipale == null ? ACTIVITE_PRINCIPALE_EDEFAULT : newActivitePrincipale;
		boolean oldActivitePrincipaleESet = activitePrincipaleESet;
		activitePrincipaleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_ORGANISATION_GOUVERNEMENTALE__ACTIVITE_PRINCIPALE, oldActivitePrincipale, activitePrincipale, !oldActivitePrincipaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetActivitePrincipale() {
		TypeDictionaryDicoActivitePrincipale oldActivitePrincipale = activitePrincipale;
		boolean oldActivitePrincipaleESet = activitePrincipaleESet;
		activitePrincipale = ACTIVITE_PRINCIPALE_EDEFAULT;
		activitePrincipaleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_ORGANISATION_GOUVERNEMENTALE__ACTIVITE_PRINCIPALE, oldActivitePrincipale, ACTIVITE_PRINCIPALE_EDEFAULT, oldActivitePrincipaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActivitePrincipale() {
		return activitePrincipaleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSupporteeParTypeUnite() {
		if (estSupporteeParTypeUnite == null) {
			estSupporteeParTypeUnite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_TYPE_ORGANISATION_GOUVERNEMENTALE__EST_SUPPORTEE_PAR_TYPE_UNITE);
		}
		return estSupporteeParTypeUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_TYPE_ORGANISATION_GOUVERNEMENTALE__EST_SUPPORTEE_PAR_TYPE_UNITE:
				return ((InternalEList<?>)getEstSupporteeParTypeUnite()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_TYPE_ORGANISATION_GOUVERNEMENTALE__ARMEE:
				return getArmee();
			case SchemaPackage.TYPE_TYPE_ORGANISATION_GOUVERNEMENTALE__ACTIVITE_PRINCIPALE:
				return getActivitePrincipale();
			case SchemaPackage.TYPE_TYPE_ORGANISATION_GOUVERNEMENTALE__EST_SUPPORTEE_PAR_TYPE_UNITE:
				return getEstSupporteeParTypeUnite();
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
			case SchemaPackage.TYPE_TYPE_ORGANISATION_GOUVERNEMENTALE__ARMEE:
				setArmee((TypeDictionaryDicoArmee)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_ORGANISATION_GOUVERNEMENTALE__ACTIVITE_PRINCIPALE:
				setActivitePrincipale((TypeDictionaryDicoActivitePrincipale)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_ORGANISATION_GOUVERNEMENTALE__EST_SUPPORTEE_PAR_TYPE_UNITE:
				getEstSupporteeParTypeUnite().clear();
				getEstSupporteeParTypeUnite().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_TYPE_ORGANISATION_GOUVERNEMENTALE__ARMEE:
				unsetArmee();
				return;
			case SchemaPackage.TYPE_TYPE_ORGANISATION_GOUVERNEMENTALE__ACTIVITE_PRINCIPALE:
				unsetActivitePrincipale();
				return;
			case SchemaPackage.TYPE_TYPE_ORGANISATION_GOUVERNEMENTALE__EST_SUPPORTEE_PAR_TYPE_UNITE:
				getEstSupporteeParTypeUnite().clear();
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
			case SchemaPackage.TYPE_TYPE_ORGANISATION_GOUVERNEMENTALE__ARMEE:
				return isSetArmee();
			case SchemaPackage.TYPE_TYPE_ORGANISATION_GOUVERNEMENTALE__ACTIVITE_PRINCIPALE:
				return isSetActivitePrincipale();
			case SchemaPackage.TYPE_TYPE_ORGANISATION_GOUVERNEMENTALE__EST_SUPPORTEE_PAR_TYPE_UNITE:
				return estSupporteeParTypeUnite != null && !estSupporteeParTypeUnite.isEmpty();
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
		result.append(" (armee: ");
		if (armeeESet) result.append(armee); else result.append("<unset>");
		result.append(", activitePrincipale: ");
		if (activitePrincipaleESet) result.append(activitePrincipale); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeTypeOrganisationGouvernementaleImpl
