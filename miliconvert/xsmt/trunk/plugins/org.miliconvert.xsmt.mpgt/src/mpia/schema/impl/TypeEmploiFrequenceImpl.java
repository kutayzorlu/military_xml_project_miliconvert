/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;
import mpia.meta.TypeDataTypeDateHeure;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeEmploiFrequence;
import mpia.schema.TypeFrequence;

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
 * An implementation of the model object '<em><b>Type Emploi Frequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEmploiFrequenceImpl#getDateDebutRestriction <em>Date Debut Restriction</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEmploiFrequenceImpl#getDateFinRestriction <em>Date Fin Restriction</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEmploiFrequenceImpl#getAPourUniteConcerneUnite <em>APour Unite Concerne Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEmploiFrequenceImpl#getAPourRestrictionFrequenceFrequence <em>APour Restriction Frequence Frequence</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEmploiFrequenceImpl#getAPourZoneApplicationAutreElementControle <em>APour Zone Application Autre Element Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEmploiFrequenceImpl extends EObjectImpl implements TypeEmploiFrequence {
	/**
	 * The cached value of the '{@link #getDateDebutRestriction() <em>Date Debut Restriction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebutRestriction()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDateHeure dateDebutRestriction;

	/**
	 * The cached value of the '{@link #getDateFinRestriction() <em>Date Fin Restriction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFinRestriction()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDateHeure dateFinRestriction;

	/**
	 * The cached value of the '{@link #getAPourUniteConcerneUnite() <em>APour Unite Concerne Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUniteConcerneUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourUniteConcerneUnite;

	/**
	 * The cached value of the '{@link #getAPourRestrictionFrequenceFrequence() <em>APour Restriction Frequence Frequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourRestrictionFrequenceFrequence()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeFrequence> aPourRestrictionFrequenceFrequence;

	/**
	 * The cached value of the '{@link #getAPourZoneApplicationAutreElementControle() <em>APour Zone Application Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourZoneApplicationAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourZoneApplicationAutreElementControle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEmploiFrequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEmploiFrequence();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDateHeure getDateDebutRestriction() {
		return dateDebutRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateDebutRestriction(TypeDataTypeDateHeure newDateDebutRestriction, NotificationChain msgs) {
		TypeDataTypeDateHeure oldDateDebutRestriction = dateDebutRestriction;
		dateDebutRestriction = newDateDebutRestriction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EMPLOI_FREQUENCE__DATE_DEBUT_RESTRICTION, oldDateDebutRestriction, newDateDebutRestriction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDebutRestriction(TypeDataTypeDateHeure newDateDebutRestriction) {
		if (newDateDebutRestriction != dateDebutRestriction) {
			NotificationChain msgs = null;
			if (dateDebutRestriction != null)
				msgs = ((InternalEObject)dateDebutRestriction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EMPLOI_FREQUENCE__DATE_DEBUT_RESTRICTION, null, msgs);
			if (newDateDebutRestriction != null)
				msgs = ((InternalEObject)newDateDebutRestriction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EMPLOI_FREQUENCE__DATE_DEBUT_RESTRICTION, null, msgs);
			msgs = basicSetDateDebutRestriction(newDateDebutRestriction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EMPLOI_FREQUENCE__DATE_DEBUT_RESTRICTION, newDateDebutRestriction, newDateDebutRestriction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDateHeure getDateFinRestriction() {
		return dateFinRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateFinRestriction(TypeDataTypeDateHeure newDateFinRestriction, NotificationChain msgs) {
		TypeDataTypeDateHeure oldDateFinRestriction = dateFinRestriction;
		dateFinRestriction = newDateFinRestriction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EMPLOI_FREQUENCE__DATE_FIN_RESTRICTION, oldDateFinRestriction, newDateFinRestriction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateFinRestriction(TypeDataTypeDateHeure newDateFinRestriction) {
		if (newDateFinRestriction != dateFinRestriction) {
			NotificationChain msgs = null;
			if (dateFinRestriction != null)
				msgs = ((InternalEObject)dateFinRestriction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EMPLOI_FREQUENCE__DATE_FIN_RESTRICTION, null, msgs);
			if (newDateFinRestriction != null)
				msgs = ((InternalEObject)newDateFinRestriction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EMPLOI_FREQUENCE__DATE_FIN_RESTRICTION, null, msgs);
			msgs = basicSetDateFinRestriction(newDateFinRestriction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EMPLOI_FREQUENCE__DATE_FIN_RESTRICTION, newDateFinRestriction, newDateFinRestriction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourUniteConcerneUnite() {
		return aPourUniteConcerneUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourUniteConcerneUnite(TypeAssociationEXT newAPourUniteConcerneUnite, NotificationChain msgs) {
		TypeAssociationEXT oldAPourUniteConcerneUnite = aPourUniteConcerneUnite;
		aPourUniteConcerneUnite = newAPourUniteConcerneUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EMPLOI_FREQUENCE__APOUR_UNITE_CONCERNE_UNITE, oldAPourUniteConcerneUnite, newAPourUniteConcerneUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourUniteConcerneUnite(TypeAssociationEXT newAPourUniteConcerneUnite) {
		if (newAPourUniteConcerneUnite != aPourUniteConcerneUnite) {
			NotificationChain msgs = null;
			if (aPourUniteConcerneUnite != null)
				msgs = ((InternalEObject)aPourUniteConcerneUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EMPLOI_FREQUENCE__APOUR_UNITE_CONCERNE_UNITE, null, msgs);
			if (newAPourUniteConcerneUnite != null)
				msgs = ((InternalEObject)newAPourUniteConcerneUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EMPLOI_FREQUENCE__APOUR_UNITE_CONCERNE_UNITE, null, msgs);
			msgs = basicSetAPourUniteConcerneUnite(newAPourUniteConcerneUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EMPLOI_FREQUENCE__APOUR_UNITE_CONCERNE_UNITE, newAPourUniteConcerneUnite, newAPourUniteConcerneUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeFrequence> getAPourRestrictionFrequenceFrequence() {
		if (aPourRestrictionFrequenceFrequence == null) {
			aPourRestrictionFrequenceFrequence = new EObjectContainmentEList<TypeFrequence>(TypeFrequence.class, this, SchemaPackage.TYPE_EMPLOI_FREQUENCE__APOUR_RESTRICTION_FREQUENCE_FREQUENCE);
		}
		return aPourRestrictionFrequenceFrequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourZoneApplicationAutreElementControle() {
		return aPourZoneApplicationAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourZoneApplicationAutreElementControle(TypeAssociation newAPourZoneApplicationAutreElementControle, NotificationChain msgs) {
		TypeAssociation oldAPourZoneApplicationAutreElementControle = aPourZoneApplicationAutreElementControle;
		aPourZoneApplicationAutreElementControle = newAPourZoneApplicationAutreElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EMPLOI_FREQUENCE__APOUR_ZONE_APPLICATION_AUTRE_ELEMENT_CONTROLE, oldAPourZoneApplicationAutreElementControle, newAPourZoneApplicationAutreElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourZoneApplicationAutreElementControle(TypeAssociation newAPourZoneApplicationAutreElementControle) {
		if (newAPourZoneApplicationAutreElementControle != aPourZoneApplicationAutreElementControle) {
			NotificationChain msgs = null;
			if (aPourZoneApplicationAutreElementControle != null)
				msgs = ((InternalEObject)aPourZoneApplicationAutreElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EMPLOI_FREQUENCE__APOUR_ZONE_APPLICATION_AUTRE_ELEMENT_CONTROLE, null, msgs);
			if (newAPourZoneApplicationAutreElementControle != null)
				msgs = ((InternalEObject)newAPourZoneApplicationAutreElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EMPLOI_FREQUENCE__APOUR_ZONE_APPLICATION_AUTRE_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetAPourZoneApplicationAutreElementControle(newAPourZoneApplicationAutreElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EMPLOI_FREQUENCE__APOUR_ZONE_APPLICATION_AUTRE_ELEMENT_CONTROLE, newAPourZoneApplicationAutreElementControle, newAPourZoneApplicationAutreElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_EMPLOI_FREQUENCE__DATE_DEBUT_RESTRICTION:
				return basicSetDateDebutRestriction(null, msgs);
			case SchemaPackage.TYPE_EMPLOI_FREQUENCE__DATE_FIN_RESTRICTION:
				return basicSetDateFinRestriction(null, msgs);
			case SchemaPackage.TYPE_EMPLOI_FREQUENCE__APOUR_UNITE_CONCERNE_UNITE:
				return basicSetAPourUniteConcerneUnite(null, msgs);
			case SchemaPackage.TYPE_EMPLOI_FREQUENCE__APOUR_RESTRICTION_FREQUENCE_FREQUENCE:
				return ((InternalEList<?>)getAPourRestrictionFrequenceFrequence()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_EMPLOI_FREQUENCE__APOUR_ZONE_APPLICATION_AUTRE_ELEMENT_CONTROLE:
				return basicSetAPourZoneApplicationAutreElementControle(null, msgs);
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
			case SchemaPackage.TYPE_EMPLOI_FREQUENCE__DATE_DEBUT_RESTRICTION:
				return getDateDebutRestriction();
			case SchemaPackage.TYPE_EMPLOI_FREQUENCE__DATE_FIN_RESTRICTION:
				return getDateFinRestriction();
			case SchemaPackage.TYPE_EMPLOI_FREQUENCE__APOUR_UNITE_CONCERNE_UNITE:
				return getAPourUniteConcerneUnite();
			case SchemaPackage.TYPE_EMPLOI_FREQUENCE__APOUR_RESTRICTION_FREQUENCE_FREQUENCE:
				return getAPourRestrictionFrequenceFrequence();
			case SchemaPackage.TYPE_EMPLOI_FREQUENCE__APOUR_ZONE_APPLICATION_AUTRE_ELEMENT_CONTROLE:
				return getAPourZoneApplicationAutreElementControle();
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
			case SchemaPackage.TYPE_EMPLOI_FREQUENCE__DATE_DEBUT_RESTRICTION:
				setDateDebutRestriction((TypeDataTypeDateHeure)newValue);
				return;
			case SchemaPackage.TYPE_EMPLOI_FREQUENCE__DATE_FIN_RESTRICTION:
				setDateFinRestriction((TypeDataTypeDateHeure)newValue);
				return;
			case SchemaPackage.TYPE_EMPLOI_FREQUENCE__APOUR_UNITE_CONCERNE_UNITE:
				setAPourUniteConcerneUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_EMPLOI_FREQUENCE__APOUR_RESTRICTION_FREQUENCE_FREQUENCE:
				getAPourRestrictionFrequenceFrequence().clear();
				getAPourRestrictionFrequenceFrequence().addAll((Collection<? extends TypeFrequence>)newValue);
				return;
			case SchemaPackage.TYPE_EMPLOI_FREQUENCE__APOUR_ZONE_APPLICATION_AUTRE_ELEMENT_CONTROLE:
				setAPourZoneApplicationAutreElementControle((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_EMPLOI_FREQUENCE__DATE_DEBUT_RESTRICTION:
				setDateDebutRestriction((TypeDataTypeDateHeure)null);
				return;
			case SchemaPackage.TYPE_EMPLOI_FREQUENCE__DATE_FIN_RESTRICTION:
				setDateFinRestriction((TypeDataTypeDateHeure)null);
				return;
			case SchemaPackage.TYPE_EMPLOI_FREQUENCE__APOUR_UNITE_CONCERNE_UNITE:
				setAPourUniteConcerneUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_EMPLOI_FREQUENCE__APOUR_RESTRICTION_FREQUENCE_FREQUENCE:
				getAPourRestrictionFrequenceFrequence().clear();
				return;
			case SchemaPackage.TYPE_EMPLOI_FREQUENCE__APOUR_ZONE_APPLICATION_AUTRE_ELEMENT_CONTROLE:
				setAPourZoneApplicationAutreElementControle((TypeAssociation)null);
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
			case SchemaPackage.TYPE_EMPLOI_FREQUENCE__DATE_DEBUT_RESTRICTION:
				return dateDebutRestriction != null;
			case SchemaPackage.TYPE_EMPLOI_FREQUENCE__DATE_FIN_RESTRICTION:
				return dateFinRestriction != null;
			case SchemaPackage.TYPE_EMPLOI_FREQUENCE__APOUR_UNITE_CONCERNE_UNITE:
				return aPourUniteConcerneUnite != null;
			case SchemaPackage.TYPE_EMPLOI_FREQUENCE__APOUR_RESTRICTION_FREQUENCE_FREQUENCE:
				return aPourRestrictionFrequenceFrequence != null && !aPourRestrictionFrequenceFrequence.isEmpty();
			case SchemaPackage.TYPE_EMPLOI_FREQUENCE__APOUR_ZONE_APPLICATION_AUTRE_ELEMENT_CONTROLE:
				return aPourZoneApplicationAutreElementControle != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeEmploiFrequenceImpl
