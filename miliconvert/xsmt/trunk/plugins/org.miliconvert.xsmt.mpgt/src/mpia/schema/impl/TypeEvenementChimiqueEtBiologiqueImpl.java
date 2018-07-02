/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeLongueur;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoEvenementChimiqueEtBiologiqueCategorie;
import mpia.schema.TypeDictionaryDicoEvenementChimiqueEtBiologiqueEparpillement;
import mpia.schema.TypeEvenementChimiqueEtBiologique;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Evenement Chimique Et Biologique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEvenementChimiqueEtBiologiqueImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementChimiqueEtBiologiqueImpl#getEparpillement <em>Eparpillement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementChimiqueEtBiologiqueImpl#getHauteurRejet <em>Hauteur Rejet</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEvenementChimiqueEtBiologiqueImpl extends TypeEvenementNRBCImpl implements TypeEvenementChimiqueEtBiologique {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEvenementChimiqueEtBiologiqueCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoEvenementChimiqueEtBiologiqueCategorie.BIOALM;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEvenementChimiqueEtBiologiqueCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getEparpillement() <em>Eparpillement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEparpillement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEvenementChimiqueEtBiologiqueEparpillement EPARPILLEMENT_EDEFAULT = TypeDictionaryDicoEvenementChimiqueEtBiologiqueEparpillement.XLG;

	/**
	 * The cached value of the '{@link #getEparpillement() <em>Eparpillement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEparpillement()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEvenementChimiqueEtBiologiqueEparpillement eparpillement = EPARPILLEMENT_EDEFAULT;

	/**
	 * This is true if the Eparpillement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eparpillementESet;

	/**
	 * The cached value of the '{@link #getHauteurRejet() <em>Hauteur Rejet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHauteurRejet()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur hauteurRejet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEvenementChimiqueEtBiologiqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEvenementChimiqueEtBiologique();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEvenementChimiqueEtBiologiqueCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoEvenementChimiqueEtBiologiqueCategorie newCategorie) {
		TypeDictionaryDicoEvenementChimiqueEtBiologiqueCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVENEMENT_CHIMIQUE_ET_BIOLOGIQUE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoEvenementChimiqueEtBiologiqueCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EVENEMENT_CHIMIQUE_ET_BIOLOGIQUE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeDictionaryDicoEvenementChimiqueEtBiologiqueEparpillement getEparpillement() {
		return eparpillement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEparpillement(TypeDictionaryDicoEvenementChimiqueEtBiologiqueEparpillement newEparpillement) {
		TypeDictionaryDicoEvenementChimiqueEtBiologiqueEparpillement oldEparpillement = eparpillement;
		eparpillement = newEparpillement == null ? EPARPILLEMENT_EDEFAULT : newEparpillement;
		boolean oldEparpillementESet = eparpillementESet;
		eparpillementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVENEMENT_CHIMIQUE_ET_BIOLOGIQUE__EPARPILLEMENT, oldEparpillement, eparpillement, !oldEparpillementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEparpillement() {
		TypeDictionaryDicoEvenementChimiqueEtBiologiqueEparpillement oldEparpillement = eparpillement;
		boolean oldEparpillementESet = eparpillementESet;
		eparpillement = EPARPILLEMENT_EDEFAULT;
		eparpillementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EVENEMENT_CHIMIQUE_ET_BIOLOGIQUE__EPARPILLEMENT, oldEparpillement, EPARPILLEMENT_EDEFAULT, oldEparpillementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEparpillement() {
		return eparpillementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getHauteurRejet() {
		return hauteurRejet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHauteurRejet(TypeDataTypeLongueur newHauteurRejet, NotificationChain msgs) {
		TypeDataTypeLongueur oldHauteurRejet = hauteurRejet;
		hauteurRejet = newHauteurRejet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVENEMENT_CHIMIQUE_ET_BIOLOGIQUE__HAUTEUR_REJET, oldHauteurRejet, newHauteurRejet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHauteurRejet(TypeDataTypeLongueur newHauteurRejet) {
		if (newHauteurRejet != hauteurRejet) {
			NotificationChain msgs = null;
			if (hauteurRejet != null)
				msgs = ((InternalEObject)hauteurRejet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EVENEMENT_CHIMIQUE_ET_BIOLOGIQUE__HAUTEUR_REJET, null, msgs);
			if (newHauteurRejet != null)
				msgs = ((InternalEObject)newHauteurRejet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EVENEMENT_CHIMIQUE_ET_BIOLOGIQUE__HAUTEUR_REJET, null, msgs);
			msgs = basicSetHauteurRejet(newHauteurRejet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVENEMENT_CHIMIQUE_ET_BIOLOGIQUE__HAUTEUR_REJET, newHauteurRejet, newHauteurRejet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_EVENEMENT_CHIMIQUE_ET_BIOLOGIQUE__HAUTEUR_REJET:
				return basicSetHauteurRejet(null, msgs);
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
			case SchemaPackage.TYPE_EVENEMENT_CHIMIQUE_ET_BIOLOGIQUE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_EVENEMENT_CHIMIQUE_ET_BIOLOGIQUE__EPARPILLEMENT:
				return getEparpillement();
			case SchemaPackage.TYPE_EVENEMENT_CHIMIQUE_ET_BIOLOGIQUE__HAUTEUR_REJET:
				return getHauteurRejet();
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
			case SchemaPackage.TYPE_EVENEMENT_CHIMIQUE_ET_BIOLOGIQUE__CATEGORIE:
				setCategorie((TypeDictionaryDicoEvenementChimiqueEtBiologiqueCategorie)newValue);
				return;
			case SchemaPackage.TYPE_EVENEMENT_CHIMIQUE_ET_BIOLOGIQUE__EPARPILLEMENT:
				setEparpillement((TypeDictionaryDicoEvenementChimiqueEtBiologiqueEparpillement)newValue);
				return;
			case SchemaPackage.TYPE_EVENEMENT_CHIMIQUE_ET_BIOLOGIQUE__HAUTEUR_REJET:
				setHauteurRejet((TypeDataTypeLongueur)newValue);
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
			case SchemaPackage.TYPE_EVENEMENT_CHIMIQUE_ET_BIOLOGIQUE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_EVENEMENT_CHIMIQUE_ET_BIOLOGIQUE__EPARPILLEMENT:
				unsetEparpillement();
				return;
			case SchemaPackage.TYPE_EVENEMENT_CHIMIQUE_ET_BIOLOGIQUE__HAUTEUR_REJET:
				setHauteurRejet((TypeDataTypeLongueur)null);
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
			case SchemaPackage.TYPE_EVENEMENT_CHIMIQUE_ET_BIOLOGIQUE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_EVENEMENT_CHIMIQUE_ET_BIOLOGIQUE__EPARPILLEMENT:
				return isSetEparpillement();
			case SchemaPackage.TYPE_EVENEMENT_CHIMIQUE_ET_BIOLOGIQUE__HAUTEUR_REJET:
				return hauteurRejet != null;
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
		result.append(", eparpillement: ");
		if (eparpillementESet) result.append(eparpillement); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeEvenementChimiqueEtBiologiqueImpl
