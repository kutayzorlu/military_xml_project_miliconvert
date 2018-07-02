/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationSyntheseDetectionsEvenementNRBC;
import mpia.schema.TypeDictionaryDicoAssociationFonctionnelleUARCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Synthese Detections Evenement NRBC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationSyntheseDetectionsEvenementNRBCImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationSyntheseDetectionsEvenementNRBCImpl#getAssocieCommeSujetSyntheseDetections <em>Associe Comme Sujet Synthese Detections</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationSyntheseDetectionsEvenementNRBCImpl#getAssocieCommeObjetEvenementNRBC <em>Associe Comme Objet Evenement NRBC</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationSyntheseDetectionsEvenementNRBCImpl extends TypeAssociationFonctionnelleActiviteImpl implements TypeAssociationSyntheseDetectionsEvenementNRBC {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAssociationFonctionnelleUARCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssociationFonctionnelleUARCategorie.UAR;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationFonctionnelleUARCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The cached value of the '{@link #getAssocieCommeSujetSyntheseDetections() <em>Associe Comme Sujet Synthese Detections</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeSujetSyntheseDetections()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeSujetSyntheseDetections;

	/**
	 * The cached value of the '{@link #getAssocieCommeObjetEvenementNRBC() <em>Associe Comme Objet Evenement NRBC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeObjetEvenementNRBC()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeObjetEvenementNRBC;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationSyntheseDetectionsEvenementNRBCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationSyntheseDetectionsEvenementNRBC();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssociationFonctionnelleUARCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssociationFonctionnelleUARCategorie newCategorie) {
		TypeDictionaryDicoAssociationFonctionnelleUARCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_SYNTHESE_DETECTIONS_EVENEMENT_NRBC__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssociationFonctionnelleUARCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_SYNTHESE_DETECTIONS_EVENEMENT_NRBC__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCategorie() {
		return categorieESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeSujetSyntheseDetections() {
		return associeCommeSujetSyntheseDetections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeSujetSyntheseDetections(TypeAssociation newAssocieCommeSujetSyntheseDetections, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeSujetSyntheseDetections = associeCommeSujetSyntheseDetections;
		associeCommeSujetSyntheseDetections = newAssocieCommeSujetSyntheseDetections;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_SYNTHESE_DETECTIONS_EVENEMENT_NRBC__ASSOCIE_COMME_SUJET_SYNTHESE_DETECTIONS, oldAssocieCommeSujetSyntheseDetections, newAssocieCommeSujetSyntheseDetections);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeSujetSyntheseDetections(TypeAssociation newAssocieCommeSujetSyntheseDetections) {
		if (newAssocieCommeSujetSyntheseDetections != associeCommeSujetSyntheseDetections) {
			NotificationChain msgs = null;
			if (associeCommeSujetSyntheseDetections != null)
				msgs = ((InternalEObject)associeCommeSujetSyntheseDetections).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_SYNTHESE_DETECTIONS_EVENEMENT_NRBC__ASSOCIE_COMME_SUJET_SYNTHESE_DETECTIONS, null, msgs);
			if (newAssocieCommeSujetSyntheseDetections != null)
				msgs = ((InternalEObject)newAssocieCommeSujetSyntheseDetections).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_SYNTHESE_DETECTIONS_EVENEMENT_NRBC__ASSOCIE_COMME_SUJET_SYNTHESE_DETECTIONS, null, msgs);
			msgs = basicSetAssocieCommeSujetSyntheseDetections(newAssocieCommeSujetSyntheseDetections, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_SYNTHESE_DETECTIONS_EVENEMENT_NRBC__ASSOCIE_COMME_SUJET_SYNTHESE_DETECTIONS, newAssocieCommeSujetSyntheseDetections, newAssocieCommeSujetSyntheseDetections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeObjetEvenementNRBC() {
		return associeCommeObjetEvenementNRBC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeObjetEvenementNRBC(TypeAssociation newAssocieCommeObjetEvenementNRBC, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeObjetEvenementNRBC = associeCommeObjetEvenementNRBC;
		associeCommeObjetEvenementNRBC = newAssocieCommeObjetEvenementNRBC;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_SYNTHESE_DETECTIONS_EVENEMENT_NRBC__ASSOCIE_COMME_OBJET_EVENEMENT_NRBC, oldAssocieCommeObjetEvenementNRBC, newAssocieCommeObjetEvenementNRBC);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeObjetEvenementNRBC(TypeAssociation newAssocieCommeObjetEvenementNRBC) {
		if (newAssocieCommeObjetEvenementNRBC != associeCommeObjetEvenementNRBC) {
			NotificationChain msgs = null;
			if (associeCommeObjetEvenementNRBC != null)
				msgs = ((InternalEObject)associeCommeObjetEvenementNRBC).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_SYNTHESE_DETECTIONS_EVENEMENT_NRBC__ASSOCIE_COMME_OBJET_EVENEMENT_NRBC, null, msgs);
			if (newAssocieCommeObjetEvenementNRBC != null)
				msgs = ((InternalEObject)newAssocieCommeObjetEvenementNRBC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_SYNTHESE_DETECTIONS_EVENEMENT_NRBC__ASSOCIE_COMME_OBJET_EVENEMENT_NRBC, null, msgs);
			msgs = basicSetAssocieCommeObjetEvenementNRBC(newAssocieCommeObjetEvenementNRBC, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_SYNTHESE_DETECTIONS_EVENEMENT_NRBC__ASSOCIE_COMME_OBJET_EVENEMENT_NRBC, newAssocieCommeObjetEvenementNRBC, newAssocieCommeObjetEvenementNRBC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_SYNTHESE_DETECTIONS_EVENEMENT_NRBC__ASSOCIE_COMME_SUJET_SYNTHESE_DETECTIONS:
				return basicSetAssocieCommeSujetSyntheseDetections(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_SYNTHESE_DETECTIONS_EVENEMENT_NRBC__ASSOCIE_COMME_OBJET_EVENEMENT_NRBC:
				return basicSetAssocieCommeObjetEvenementNRBC(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_SYNTHESE_DETECTIONS_EVENEMENT_NRBC__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_SYNTHESE_DETECTIONS_EVENEMENT_NRBC__ASSOCIE_COMME_SUJET_SYNTHESE_DETECTIONS:
				return getAssocieCommeSujetSyntheseDetections();
			case SchemaPackage.TYPE_ASSOCIATION_SYNTHESE_DETECTIONS_EVENEMENT_NRBC__ASSOCIE_COMME_OBJET_EVENEMENT_NRBC:
				return getAssocieCommeObjetEvenementNRBC();
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
			case SchemaPackage.TYPE_ASSOCIATION_SYNTHESE_DETECTIONS_EVENEMENT_NRBC__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationFonctionnelleUARCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_SYNTHESE_DETECTIONS_EVENEMENT_NRBC__ASSOCIE_COMME_SUJET_SYNTHESE_DETECTIONS:
				setAssocieCommeSujetSyntheseDetections((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_SYNTHESE_DETECTIONS_EVENEMENT_NRBC__ASSOCIE_COMME_OBJET_EVENEMENT_NRBC:
				setAssocieCommeObjetEvenementNRBC((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_SYNTHESE_DETECTIONS_EVENEMENT_NRBC__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_SYNTHESE_DETECTIONS_EVENEMENT_NRBC__ASSOCIE_COMME_SUJET_SYNTHESE_DETECTIONS:
				setAssocieCommeSujetSyntheseDetections((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_SYNTHESE_DETECTIONS_EVENEMENT_NRBC__ASSOCIE_COMME_OBJET_EVENEMENT_NRBC:
				setAssocieCommeObjetEvenementNRBC((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_SYNTHESE_DETECTIONS_EVENEMENT_NRBC__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_SYNTHESE_DETECTIONS_EVENEMENT_NRBC__ASSOCIE_COMME_SUJET_SYNTHESE_DETECTIONS:
				return associeCommeSujetSyntheseDetections != null;
			case SchemaPackage.TYPE_ASSOCIATION_SYNTHESE_DETECTIONS_EVENEMENT_NRBC__ASSOCIE_COMME_OBJET_EVENEMENT_NRBC:
				return associeCommeObjetEvenementNRBC != null;
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
		result.append(" (categorie: ");
		if (categorieESet) result.append(categorie); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeAssociationSyntheseDetectionsEvenementNRBCImpl
