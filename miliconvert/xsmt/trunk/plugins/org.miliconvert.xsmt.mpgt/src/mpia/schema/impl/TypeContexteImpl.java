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
import mpia.schema.TypeContexte;
import mpia.schema.TypeElementContexte;
import mpia.schema.TypeEvaluation;

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
 * An implementation of the model object '<em><b>Type Contexte</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeContexteImpl#getAPourDegreClassificationDegreClassification <em>APour Degre Classification Degre Classification</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeContexteImpl#getFournitContextePourAssocContexteInstanceObjet <em>Fournit Contexte Pour Assoc Contexte Instance Objet</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeContexteImpl#getFournitContextePourAssocActiviteContexte <em>Fournit Contexte Pour Assoc Activite Contexte</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeContexteImpl#getEstObjetAssocContexteContexte <em>Est Objet Assoc Contexte Contexte</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeContexteImpl#getEstSujetAssocContexteContexte <em>Est Sujet Assoc Contexte Contexte</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeContexteImpl#getFournitContextePourAssociationContexteRapport <em>Fournit Contexte Pour Association Contexte Rapport</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeContexteImpl#getAPourConstituantElementContexte <em>APour Constituant Element Contexte</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeContexteImpl#getIdentifieDonneesPourEvaluation <em>Identifie Donnees Pour Evaluation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypeContexteImpl extends TypeRacineOperationnelleImpl implements TypeContexte {
	/**
	 * The cached value of the '{@link #getAPourDegreClassificationDegreClassification() <em>APour Degre Classification Degre Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourDegreClassificationDegreClassification()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourDegreClassificationDegreClassification;

	/**
	 * The cached value of the '{@link #getFournitContextePourAssocContexteInstanceObjet() <em>Fournit Contexte Pour Assoc Contexte Instance Objet</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFournitContextePourAssocContexteInstanceObjet()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> fournitContextePourAssocContexteInstanceObjet;

	/**
	 * The cached value of the '{@link #getFournitContextePourAssocActiviteContexte() <em>Fournit Contexte Pour Assoc Activite Contexte</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFournitContextePourAssocActiviteContexte()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> fournitContextePourAssocActiviteContexte;

	/**
	 * The cached value of the '{@link #getEstObjetAssocContexteContexte() <em>Est Objet Assoc Contexte Contexte</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssocContexteContexte()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssocContexteContexte;

	/**
	 * The cached value of the '{@link #getEstSujetAssocContexteContexte() <em>Est Sujet Assoc Contexte Contexte</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssocContexteContexte()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssocContexteContexte;

	/**
	 * The cached value of the '{@link #getFournitContextePourAssociationContexteRapport() <em>Fournit Contexte Pour Association Contexte Rapport</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFournitContextePourAssociationContexteRapport()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> fournitContextePourAssociationContexteRapport;

	/**
	 * The cached value of the '{@link #getAPourConstituantElementContexte() <em>APour Constituant Element Contexte</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourConstituantElementContexte()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeElementContexte> aPourConstituantElementContexte;

	/**
	 * The cached value of the '{@link #getIdentifieDonneesPourEvaluation() <em>Identifie Donnees Pour Evaluation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifieDonneesPourEvaluation()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeEvaluation> identifieDonneesPourEvaluation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeContexteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeContexte();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourDegreClassificationDegreClassification() {
		return aPourDegreClassificationDegreClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourDegreClassificationDegreClassification(TypeAssociation newAPourDegreClassificationDegreClassification, NotificationChain msgs) {
		TypeAssociation oldAPourDegreClassificationDegreClassification = aPourDegreClassificationDegreClassification;
		aPourDegreClassificationDegreClassification = newAPourDegreClassificationDegreClassification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTEXTE__APOUR_DEGRE_CLASSIFICATION_DEGRE_CLASSIFICATION, oldAPourDegreClassificationDegreClassification, newAPourDegreClassificationDegreClassification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourDegreClassificationDegreClassification(TypeAssociation newAPourDegreClassificationDegreClassification) {
		if (newAPourDegreClassificationDegreClassification != aPourDegreClassificationDegreClassification) {
			NotificationChain msgs = null;
			if (aPourDegreClassificationDegreClassification != null)
				msgs = ((InternalEObject)aPourDegreClassificationDegreClassification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONTEXTE__APOUR_DEGRE_CLASSIFICATION_DEGRE_CLASSIFICATION, null, msgs);
			if (newAPourDegreClassificationDegreClassification != null)
				msgs = ((InternalEObject)newAPourDegreClassificationDegreClassification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONTEXTE__APOUR_DEGRE_CLASSIFICATION_DEGRE_CLASSIFICATION, null, msgs);
			msgs = basicSetAPourDegreClassificationDegreClassification(newAPourDegreClassificationDegreClassification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTEXTE__APOUR_DEGRE_CLASSIFICATION_DEGRE_CLASSIFICATION, newAPourDegreClassificationDegreClassification, newAPourDegreClassificationDegreClassification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getFournitContextePourAssocContexteInstanceObjet() {
		if (fournitContextePourAssocContexteInstanceObjet == null) {
			fournitContextePourAssocContexteInstanceObjet = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_CONTEXTE__FOURNIT_CONTEXTE_POUR_ASSOC_CONTEXTE_INSTANCE_OBJET);
		}
		return fournitContextePourAssocContexteInstanceObjet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getFournitContextePourAssocActiviteContexte() {
		if (fournitContextePourAssocActiviteContexte == null) {
			fournitContextePourAssocActiviteContexte = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_CONTEXTE__FOURNIT_CONTEXTE_POUR_ASSOC_ACTIVITE_CONTEXTE);
		}
		return fournitContextePourAssocActiviteContexte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssocContexteContexte() {
		if (estObjetAssocContexteContexte == null) {
			estObjetAssocContexteContexte = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_CONTEXTE__EST_OBJET_ASSOC_CONTEXTE_CONTEXTE);
		}
		return estObjetAssocContexteContexte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssocContexteContexte() {
		if (estSujetAssocContexteContexte == null) {
			estSujetAssocContexteContexte = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_CONTEXTE__EST_SUJET_ASSOC_CONTEXTE_CONTEXTE);
		}
		return estSujetAssocContexteContexte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getFournitContextePourAssociationContexteRapport() {
		if (fournitContextePourAssociationContexteRapport == null) {
			fournitContextePourAssociationContexteRapport = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_CONTEXTE__FOURNIT_CONTEXTE_POUR_ASSOCIATION_CONTEXTE_RAPPORT);
		}
		return fournitContextePourAssociationContexteRapport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeElementContexte> getAPourConstituantElementContexte() {
		if (aPourConstituantElementContexte == null) {
			aPourConstituantElementContexte = new EObjectContainmentEList<TypeElementContexte>(TypeElementContexte.class, this, SchemaPackage.TYPE_CONTEXTE__APOUR_CONSTITUANT_ELEMENT_CONTEXTE);
		}
		return aPourConstituantElementContexte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEvaluation> getIdentifieDonneesPourEvaluation() {
		if (identifieDonneesPourEvaluation == null) {
			identifieDonneesPourEvaluation = new EObjectContainmentEList<TypeEvaluation>(TypeEvaluation.class, this, SchemaPackage.TYPE_CONTEXTE__IDENTIFIE_DONNEES_POUR_EVALUATION);
		}
		return identifieDonneesPourEvaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_CONTEXTE__APOUR_DEGRE_CLASSIFICATION_DEGRE_CLASSIFICATION:
				return basicSetAPourDegreClassificationDegreClassification(null, msgs);
			case SchemaPackage.TYPE_CONTEXTE__FOURNIT_CONTEXTE_POUR_ASSOC_CONTEXTE_INSTANCE_OBJET:
				return ((InternalEList<?>)getFournitContextePourAssocContexteInstanceObjet()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_CONTEXTE__FOURNIT_CONTEXTE_POUR_ASSOC_ACTIVITE_CONTEXTE:
				return ((InternalEList<?>)getFournitContextePourAssocActiviteContexte()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_CONTEXTE__EST_OBJET_ASSOC_CONTEXTE_CONTEXTE:
				return ((InternalEList<?>)getEstObjetAssocContexteContexte()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_CONTEXTE__EST_SUJET_ASSOC_CONTEXTE_CONTEXTE:
				return ((InternalEList<?>)getEstSujetAssocContexteContexte()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_CONTEXTE__FOURNIT_CONTEXTE_POUR_ASSOCIATION_CONTEXTE_RAPPORT:
				return ((InternalEList<?>)getFournitContextePourAssociationContexteRapport()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_CONTEXTE__APOUR_CONSTITUANT_ELEMENT_CONTEXTE:
				return ((InternalEList<?>)getAPourConstituantElementContexte()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_CONTEXTE__IDENTIFIE_DONNEES_POUR_EVALUATION:
				return ((InternalEList<?>)getIdentifieDonneesPourEvaluation()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_CONTEXTE__APOUR_DEGRE_CLASSIFICATION_DEGRE_CLASSIFICATION:
				return getAPourDegreClassificationDegreClassification();
			case SchemaPackage.TYPE_CONTEXTE__FOURNIT_CONTEXTE_POUR_ASSOC_CONTEXTE_INSTANCE_OBJET:
				return getFournitContextePourAssocContexteInstanceObjet();
			case SchemaPackage.TYPE_CONTEXTE__FOURNIT_CONTEXTE_POUR_ASSOC_ACTIVITE_CONTEXTE:
				return getFournitContextePourAssocActiviteContexte();
			case SchemaPackage.TYPE_CONTEXTE__EST_OBJET_ASSOC_CONTEXTE_CONTEXTE:
				return getEstObjetAssocContexteContexte();
			case SchemaPackage.TYPE_CONTEXTE__EST_SUJET_ASSOC_CONTEXTE_CONTEXTE:
				return getEstSujetAssocContexteContexte();
			case SchemaPackage.TYPE_CONTEXTE__FOURNIT_CONTEXTE_POUR_ASSOCIATION_CONTEXTE_RAPPORT:
				return getFournitContextePourAssociationContexteRapport();
			case SchemaPackage.TYPE_CONTEXTE__APOUR_CONSTITUANT_ELEMENT_CONTEXTE:
				return getAPourConstituantElementContexte();
			case SchemaPackage.TYPE_CONTEXTE__IDENTIFIE_DONNEES_POUR_EVALUATION:
				return getIdentifieDonneesPourEvaluation();
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
			case SchemaPackage.TYPE_CONTEXTE__APOUR_DEGRE_CLASSIFICATION_DEGRE_CLASSIFICATION:
				setAPourDegreClassificationDegreClassification((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_CONTEXTE__FOURNIT_CONTEXTE_POUR_ASSOC_CONTEXTE_INSTANCE_OBJET:
				getFournitContextePourAssocContexteInstanceObjet().clear();
				getFournitContextePourAssocContexteInstanceObjet().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_CONTEXTE__FOURNIT_CONTEXTE_POUR_ASSOC_ACTIVITE_CONTEXTE:
				getFournitContextePourAssocActiviteContexte().clear();
				getFournitContextePourAssocActiviteContexte().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_CONTEXTE__EST_OBJET_ASSOC_CONTEXTE_CONTEXTE:
				getEstObjetAssocContexteContexte().clear();
				getEstObjetAssocContexteContexte().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_CONTEXTE__EST_SUJET_ASSOC_CONTEXTE_CONTEXTE:
				getEstSujetAssocContexteContexte().clear();
				getEstSujetAssocContexteContexte().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_CONTEXTE__FOURNIT_CONTEXTE_POUR_ASSOCIATION_CONTEXTE_RAPPORT:
				getFournitContextePourAssociationContexteRapport().clear();
				getFournitContextePourAssociationContexteRapport().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_CONTEXTE__APOUR_CONSTITUANT_ELEMENT_CONTEXTE:
				getAPourConstituantElementContexte().clear();
				getAPourConstituantElementContexte().addAll((Collection<? extends TypeElementContexte>)newValue);
				return;
			case SchemaPackage.TYPE_CONTEXTE__IDENTIFIE_DONNEES_POUR_EVALUATION:
				getIdentifieDonneesPourEvaluation().clear();
				getIdentifieDonneesPourEvaluation().addAll((Collection<? extends TypeEvaluation>)newValue);
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
			case SchemaPackage.TYPE_CONTEXTE__APOUR_DEGRE_CLASSIFICATION_DEGRE_CLASSIFICATION:
				setAPourDegreClassificationDegreClassification((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_CONTEXTE__FOURNIT_CONTEXTE_POUR_ASSOC_CONTEXTE_INSTANCE_OBJET:
				getFournitContextePourAssocContexteInstanceObjet().clear();
				return;
			case SchemaPackage.TYPE_CONTEXTE__FOURNIT_CONTEXTE_POUR_ASSOC_ACTIVITE_CONTEXTE:
				getFournitContextePourAssocActiviteContexte().clear();
				return;
			case SchemaPackage.TYPE_CONTEXTE__EST_OBJET_ASSOC_CONTEXTE_CONTEXTE:
				getEstObjetAssocContexteContexte().clear();
				return;
			case SchemaPackage.TYPE_CONTEXTE__EST_SUJET_ASSOC_CONTEXTE_CONTEXTE:
				getEstSujetAssocContexteContexte().clear();
				return;
			case SchemaPackage.TYPE_CONTEXTE__FOURNIT_CONTEXTE_POUR_ASSOCIATION_CONTEXTE_RAPPORT:
				getFournitContextePourAssociationContexteRapport().clear();
				return;
			case SchemaPackage.TYPE_CONTEXTE__APOUR_CONSTITUANT_ELEMENT_CONTEXTE:
				getAPourConstituantElementContexte().clear();
				return;
			case SchemaPackage.TYPE_CONTEXTE__IDENTIFIE_DONNEES_POUR_EVALUATION:
				getIdentifieDonneesPourEvaluation().clear();
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
			case SchemaPackage.TYPE_CONTEXTE__APOUR_DEGRE_CLASSIFICATION_DEGRE_CLASSIFICATION:
				return aPourDegreClassificationDegreClassification != null;
			case SchemaPackage.TYPE_CONTEXTE__FOURNIT_CONTEXTE_POUR_ASSOC_CONTEXTE_INSTANCE_OBJET:
				return fournitContextePourAssocContexteInstanceObjet != null && !fournitContextePourAssocContexteInstanceObjet.isEmpty();
			case SchemaPackage.TYPE_CONTEXTE__FOURNIT_CONTEXTE_POUR_ASSOC_ACTIVITE_CONTEXTE:
				return fournitContextePourAssocActiviteContexte != null && !fournitContextePourAssocActiviteContexte.isEmpty();
			case SchemaPackage.TYPE_CONTEXTE__EST_OBJET_ASSOC_CONTEXTE_CONTEXTE:
				return estObjetAssocContexteContexte != null && !estObjetAssocContexteContexte.isEmpty();
			case SchemaPackage.TYPE_CONTEXTE__EST_SUJET_ASSOC_CONTEXTE_CONTEXTE:
				return estSujetAssocContexteContexte != null && !estSujetAssocContexteContexte.isEmpty();
			case SchemaPackage.TYPE_CONTEXTE__FOURNIT_CONTEXTE_POUR_ASSOCIATION_CONTEXTE_RAPPORT:
				return fournitContextePourAssociationContexteRapport != null && !fournitContextePourAssociationContexteRapport.isEmpty();
			case SchemaPackage.TYPE_CONTEXTE__APOUR_CONSTITUANT_ELEMENT_CONTEXTE:
				return aPourConstituantElementContexte != null && !aPourConstituantElementContexte.isEmpty();
			case SchemaPackage.TYPE_CONTEXTE__IDENTIFIE_DONNEES_POUR_EVALUATION:
				return identifieDonneesPourEvaluation != null && !identifieDonneesPourEvaluation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TypeContexteImpl
