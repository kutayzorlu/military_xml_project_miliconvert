/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeVitesseLineaire;
import mpia.meta.TypeDataTypeVolume;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoTypeSousMarinCategorie;
import mpia.schema.TypeTypeSousMarin;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Type Sous Marin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeTypeSousMarinImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeSousMarinImpl#isDispositifChargementTorpilles <em>Dispositif Chargement Torpilles</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeSousMarinImpl#getDeplacementEnPlongee <em>Deplacement En Plongee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeSousMarinImpl#getVitesseCavitation <em>Vitesse Cavitation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeTypeSousMarinImpl extends TypeTypeBatimentImpl implements TypeTypeSousMarin {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeSousMarinCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoTypeSousMarinCategorie.DSV;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeSousMarinCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #isDispositifChargementTorpilles() <em>Dispositif Chargement Torpilles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDispositifChargementTorpilles()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISPOSITIF_CHARGEMENT_TORPILLES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDispositifChargementTorpilles() <em>Dispositif Chargement Torpilles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDispositifChargementTorpilles()
	 * @generated
	 * @ordered
	 */
	protected boolean dispositifChargementTorpilles = DISPOSITIF_CHARGEMENT_TORPILLES_EDEFAULT;

	/**
	 * This is true if the Dispositif Chargement Torpilles attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dispositifChargementTorpillesESet;

	/**
	 * The cached value of the '{@link #getDeplacementEnPlongee() <em>Deplacement En Plongee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeplacementEnPlongee()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeVolume deplacementEnPlongee;

	/**
	 * The cached value of the '{@link #getVitesseCavitation() <em>Vitesse Cavitation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesseCavitation()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeVitesseLineaire vitesseCavitation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeTypeSousMarinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeTypeSousMarin();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeSousMarinCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoTypeSousMarinCategorie newCategorie) {
		TypeDictionaryDicoTypeSousMarinCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_SOUS_MARIN__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoTypeSousMarinCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_SOUS_MARIN__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public boolean isDispositifChargementTorpilles() {
		return dispositifChargementTorpilles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDispositifChargementTorpilles(boolean newDispositifChargementTorpilles) {
		boolean oldDispositifChargementTorpilles = dispositifChargementTorpilles;
		dispositifChargementTorpilles = newDispositifChargementTorpilles;
		boolean oldDispositifChargementTorpillesESet = dispositifChargementTorpillesESet;
		dispositifChargementTorpillesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_SOUS_MARIN__DISPOSITIF_CHARGEMENT_TORPILLES, oldDispositifChargementTorpilles, dispositifChargementTorpilles, !oldDispositifChargementTorpillesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDispositifChargementTorpilles() {
		boolean oldDispositifChargementTorpilles = dispositifChargementTorpilles;
		boolean oldDispositifChargementTorpillesESet = dispositifChargementTorpillesESet;
		dispositifChargementTorpilles = DISPOSITIF_CHARGEMENT_TORPILLES_EDEFAULT;
		dispositifChargementTorpillesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_SOUS_MARIN__DISPOSITIF_CHARGEMENT_TORPILLES, oldDispositifChargementTorpilles, DISPOSITIF_CHARGEMENT_TORPILLES_EDEFAULT, oldDispositifChargementTorpillesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDispositifChargementTorpilles() {
		return dispositifChargementTorpillesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeVolume getDeplacementEnPlongee() {
		return deplacementEnPlongee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeplacementEnPlongee(TypeDataTypeVolume newDeplacementEnPlongee, NotificationChain msgs) {
		TypeDataTypeVolume oldDeplacementEnPlongee = deplacementEnPlongee;
		deplacementEnPlongee = newDeplacementEnPlongee;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_SOUS_MARIN__DEPLACEMENT_EN_PLONGEE, oldDeplacementEnPlongee, newDeplacementEnPlongee);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeplacementEnPlongee(TypeDataTypeVolume newDeplacementEnPlongee) {
		if (newDeplacementEnPlongee != deplacementEnPlongee) {
			NotificationChain msgs = null;
			if (deplacementEnPlongee != null)
				msgs = ((InternalEObject)deplacementEnPlongee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_SOUS_MARIN__DEPLACEMENT_EN_PLONGEE, null, msgs);
			if (newDeplacementEnPlongee != null)
				msgs = ((InternalEObject)newDeplacementEnPlongee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_SOUS_MARIN__DEPLACEMENT_EN_PLONGEE, null, msgs);
			msgs = basicSetDeplacementEnPlongee(newDeplacementEnPlongee, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_SOUS_MARIN__DEPLACEMENT_EN_PLONGEE, newDeplacementEnPlongee, newDeplacementEnPlongee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeVitesseLineaire getVitesseCavitation() {
		return vitesseCavitation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVitesseCavitation(TypeDataTypeVitesseLineaire newVitesseCavitation, NotificationChain msgs) {
		TypeDataTypeVitesseLineaire oldVitesseCavitation = vitesseCavitation;
		vitesseCavitation = newVitesseCavitation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_SOUS_MARIN__VITESSE_CAVITATION, oldVitesseCavitation, newVitesseCavitation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVitesseCavitation(TypeDataTypeVitesseLineaire newVitesseCavitation) {
		if (newVitesseCavitation != vitesseCavitation) {
			NotificationChain msgs = null;
			if (vitesseCavitation != null)
				msgs = ((InternalEObject)vitesseCavitation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_SOUS_MARIN__VITESSE_CAVITATION, null, msgs);
			if (newVitesseCavitation != null)
				msgs = ((InternalEObject)newVitesseCavitation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_SOUS_MARIN__VITESSE_CAVITATION, null, msgs);
			msgs = basicSetVitesseCavitation(newVitesseCavitation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_SOUS_MARIN__VITESSE_CAVITATION, newVitesseCavitation, newVitesseCavitation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_TYPE_SOUS_MARIN__DEPLACEMENT_EN_PLONGEE:
				return basicSetDeplacementEnPlongee(null, msgs);
			case SchemaPackage.TYPE_TYPE_SOUS_MARIN__VITESSE_CAVITATION:
				return basicSetVitesseCavitation(null, msgs);
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
			case SchemaPackage.TYPE_TYPE_SOUS_MARIN__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_TYPE_SOUS_MARIN__DISPOSITIF_CHARGEMENT_TORPILLES:
				return isDispositifChargementTorpilles() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_TYPE_SOUS_MARIN__DEPLACEMENT_EN_PLONGEE:
				return getDeplacementEnPlongee();
			case SchemaPackage.TYPE_TYPE_SOUS_MARIN__VITESSE_CAVITATION:
				return getVitesseCavitation();
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
			case SchemaPackage.TYPE_TYPE_SOUS_MARIN__CATEGORIE:
				setCategorie((TypeDictionaryDicoTypeSousMarinCategorie)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_SOUS_MARIN__DISPOSITIF_CHARGEMENT_TORPILLES:
				setDispositifChargementTorpilles(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_TYPE_SOUS_MARIN__DEPLACEMENT_EN_PLONGEE:
				setDeplacementEnPlongee((TypeDataTypeVolume)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_SOUS_MARIN__VITESSE_CAVITATION:
				setVitesseCavitation((TypeDataTypeVitesseLineaire)newValue);
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
			case SchemaPackage.TYPE_TYPE_SOUS_MARIN__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_TYPE_SOUS_MARIN__DISPOSITIF_CHARGEMENT_TORPILLES:
				unsetDispositifChargementTorpilles();
				return;
			case SchemaPackage.TYPE_TYPE_SOUS_MARIN__DEPLACEMENT_EN_PLONGEE:
				setDeplacementEnPlongee((TypeDataTypeVolume)null);
				return;
			case SchemaPackage.TYPE_TYPE_SOUS_MARIN__VITESSE_CAVITATION:
				setVitesseCavitation((TypeDataTypeVitesseLineaire)null);
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
			case SchemaPackage.TYPE_TYPE_SOUS_MARIN__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_TYPE_SOUS_MARIN__DISPOSITIF_CHARGEMENT_TORPILLES:
				return isSetDispositifChargementTorpilles();
			case SchemaPackage.TYPE_TYPE_SOUS_MARIN__DEPLACEMENT_EN_PLONGEE:
				return deplacementEnPlongee != null;
			case SchemaPackage.TYPE_TYPE_SOUS_MARIN__VITESSE_CAVITATION:
				return vitesseCavitation != null;
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
		result.append(", dispositifChargementTorpilles: ");
		if (dispositifChargementTorpillesESet) result.append(dispositifChargementTorpilles); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeTypeSousMarinImpl
