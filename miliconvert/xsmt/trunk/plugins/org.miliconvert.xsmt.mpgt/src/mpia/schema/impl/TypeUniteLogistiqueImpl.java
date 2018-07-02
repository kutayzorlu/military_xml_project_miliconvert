/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeRattachementOuAbonnement;
import mpia.schema.TypeUniteLogistique;

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
 * An implementation of the model object '<em><b>Type Unite Logistique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeUniteLogistiqueImpl#getAbonnements <em>Abonnements</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteLogistiqueImpl#getModalitesParticulieresFonctionnement <em>Modalites Particulieres Fonctionnement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteLogistiqueImpl#getCapacitesTechniques <em>Capacites Techniques</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteLogistiqueImpl#getAssureSoutienRattachementOuAbonnement <em>Assure Soutien Rattachement Ou Abonnement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeUniteLogistiqueImpl extends EObjectImpl implements TypeUniteLogistique {
	/**
	 * The default value of the '{@link #getAbonnements() <em>Abonnements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbonnements()
	 * @generated
	 * @ordered
	 */
	protected static final String ABONNEMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbonnements() <em>Abonnements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbonnements()
	 * @generated
	 * @ordered
	 */
	protected String abonnements = ABONNEMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getModalitesParticulieresFonctionnement() <em>Modalites Particulieres Fonctionnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModalitesParticulieresFonctionnement()
	 * @generated
	 * @ordered
	 */
	protected static final String MODALITES_PARTICULIERES_FONCTIONNEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModalitesParticulieresFonctionnement() <em>Modalites Particulieres Fonctionnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModalitesParticulieresFonctionnement()
	 * @generated
	 * @ordered
	 */
	protected String modalitesParticulieresFonctionnement = MODALITES_PARTICULIERES_FONCTIONNEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapacitesTechniques() <em>Capacites Techniques</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacitesTechniques()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPACITES_TECHNIQUES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCapacitesTechniques() <em>Capacites Techniques</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacitesTechniques()
	 * @generated
	 * @ordered
	 */
	protected String capacitesTechniques = CAPACITES_TECHNIQUES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssureSoutienRattachementOuAbonnement() <em>Assure Soutien Rattachement Ou Abonnement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssureSoutienRattachementOuAbonnement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeRattachementOuAbonnement> assureSoutienRattachementOuAbonnement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeUniteLogistiqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeUniteLogistique();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAbonnements() {
		return abonnements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbonnements(String newAbonnements) {
		String oldAbonnements = abonnements;
		abonnements = newAbonnements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE_LOGISTIQUE__ABONNEMENTS, oldAbonnements, abonnements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModalitesParticulieresFonctionnement() {
		return modalitesParticulieresFonctionnement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModalitesParticulieresFonctionnement(String newModalitesParticulieresFonctionnement) {
		String oldModalitesParticulieresFonctionnement = modalitesParticulieresFonctionnement;
		modalitesParticulieresFonctionnement = newModalitesParticulieresFonctionnement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE_LOGISTIQUE__MODALITES_PARTICULIERES_FONCTIONNEMENT, oldModalitesParticulieresFonctionnement, modalitesParticulieresFonctionnement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCapacitesTechniques() {
		return capacitesTechniques;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacitesTechniques(String newCapacitesTechniques) {
		String oldCapacitesTechniques = capacitesTechniques;
		capacitesTechniques = newCapacitesTechniques;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE_LOGISTIQUE__CAPACITES_TECHNIQUES, oldCapacitesTechniques, capacitesTechniques));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeRattachementOuAbonnement> getAssureSoutienRattachementOuAbonnement() {
		if (assureSoutienRattachementOuAbonnement == null) {
			assureSoutienRattachementOuAbonnement = new EObjectContainmentEList<TypeRattachementOuAbonnement>(TypeRattachementOuAbonnement.class, this, SchemaPackage.TYPE_UNITE_LOGISTIQUE__ASSURE_SOUTIEN_RATTACHEMENT_OU_ABONNEMENT);
		}
		return assureSoutienRattachementOuAbonnement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_UNITE_LOGISTIQUE__ASSURE_SOUTIEN_RATTACHEMENT_OU_ABONNEMENT:
				return ((InternalEList<?>)getAssureSoutienRattachementOuAbonnement()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_UNITE_LOGISTIQUE__ABONNEMENTS:
				return getAbonnements();
			case SchemaPackage.TYPE_UNITE_LOGISTIQUE__MODALITES_PARTICULIERES_FONCTIONNEMENT:
				return getModalitesParticulieresFonctionnement();
			case SchemaPackage.TYPE_UNITE_LOGISTIQUE__CAPACITES_TECHNIQUES:
				return getCapacitesTechniques();
			case SchemaPackage.TYPE_UNITE_LOGISTIQUE__ASSURE_SOUTIEN_RATTACHEMENT_OU_ABONNEMENT:
				return getAssureSoutienRattachementOuAbonnement();
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
			case SchemaPackage.TYPE_UNITE_LOGISTIQUE__ABONNEMENTS:
				setAbonnements((String)newValue);
				return;
			case SchemaPackage.TYPE_UNITE_LOGISTIQUE__MODALITES_PARTICULIERES_FONCTIONNEMENT:
				setModalitesParticulieresFonctionnement((String)newValue);
				return;
			case SchemaPackage.TYPE_UNITE_LOGISTIQUE__CAPACITES_TECHNIQUES:
				setCapacitesTechniques((String)newValue);
				return;
			case SchemaPackage.TYPE_UNITE_LOGISTIQUE__ASSURE_SOUTIEN_RATTACHEMENT_OU_ABONNEMENT:
				getAssureSoutienRattachementOuAbonnement().clear();
				getAssureSoutienRattachementOuAbonnement().addAll((Collection<? extends TypeRattachementOuAbonnement>)newValue);
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
			case SchemaPackage.TYPE_UNITE_LOGISTIQUE__ABONNEMENTS:
				setAbonnements(ABONNEMENTS_EDEFAULT);
				return;
			case SchemaPackage.TYPE_UNITE_LOGISTIQUE__MODALITES_PARTICULIERES_FONCTIONNEMENT:
				setModalitesParticulieresFonctionnement(MODALITES_PARTICULIERES_FONCTIONNEMENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_UNITE_LOGISTIQUE__CAPACITES_TECHNIQUES:
				setCapacitesTechniques(CAPACITES_TECHNIQUES_EDEFAULT);
				return;
			case SchemaPackage.TYPE_UNITE_LOGISTIQUE__ASSURE_SOUTIEN_RATTACHEMENT_OU_ABONNEMENT:
				getAssureSoutienRattachementOuAbonnement().clear();
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
			case SchemaPackage.TYPE_UNITE_LOGISTIQUE__ABONNEMENTS:
				return ABONNEMENTS_EDEFAULT == null ? abonnements != null : !ABONNEMENTS_EDEFAULT.equals(abonnements);
			case SchemaPackage.TYPE_UNITE_LOGISTIQUE__MODALITES_PARTICULIERES_FONCTIONNEMENT:
				return MODALITES_PARTICULIERES_FONCTIONNEMENT_EDEFAULT == null ? modalitesParticulieresFonctionnement != null : !MODALITES_PARTICULIERES_FONCTIONNEMENT_EDEFAULT.equals(modalitesParticulieresFonctionnement);
			case SchemaPackage.TYPE_UNITE_LOGISTIQUE__CAPACITES_TECHNIQUES:
				return CAPACITES_TECHNIQUES_EDEFAULT == null ? capacitesTechniques != null : !CAPACITES_TECHNIQUES_EDEFAULT.equals(capacitesTechniques);
			case SchemaPackage.TYPE_UNITE_LOGISTIQUE__ASSURE_SOUTIEN_RATTACHEMENT_OU_ABONNEMENT:
				return assureSoutienRattachementOuAbonnement != null && !assureSoutienRattachementOuAbonnement.isEmpty();
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
		result.append(" (abonnements: ");
		result.append(abonnements);
		result.append(", modalitesParticulieresFonctionnement: ");
		result.append(modalitesParticulieresFonctionnement);
		result.append(", capacitesTechniques: ");
		result.append(capacitesTechniques);
		result.append(')');
		return result.toString();
	}

} //TypeUniteLogistiqueImpl
