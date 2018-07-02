/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeAngle;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationEntiteOrgAction;
import mpia.schema.TypeDictionaryDicoAssociationEntiteOrgActionCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Entite Org Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationEntiteOrgActionImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationEntiteOrgActionImpl#getAngleAvecObservateur <em>Angle Avec Observateur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationEntiteOrgActionImpl#getIntention <em>Intention</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationEntiteOrgActionImpl#getAPourSujetEntiteOrganisationnelle <em>APour Sujet Entite Organisationnelle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationEntiteOrgActionImpl#getAPourObjetAction <em>APour Objet Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationEntiteOrgActionImpl extends TypeAssociationInstanceObjetActiviteImpl implements TypeAssociationEntiteOrgAction {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAssociationEntiteOrgActionCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssociationEntiteOrgActionCategorie.PLAN;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationEntiteOrgActionCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The cached value of the '{@link #getAngleAvecObservateur() <em>Angle Avec Observateur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleAvecObservateur()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAngle angleAvecObservateur;

	/**
	 * The default value of the '{@link #getIntention() <em>Intention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntention()
	 * @generated
	 * @ordered
	 */
	protected static final String INTENTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntention() <em>Intention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntention()
	 * @generated
	 * @ordered
	 */
	protected String intention = INTENTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAPourSujetEntiteOrganisationnelle() <em>APour Sujet Entite Organisationnelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourSujetEntiteOrganisationnelle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourSujetEntiteOrganisationnelle;

	/**
	 * The cached value of the '{@link #getAPourObjetAction() <em>APour Objet Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourObjetAction()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourObjetAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationEntiteOrgActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationEntiteOrgAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssociationEntiteOrgActionCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssociationEntiteOrgActionCategorie newCategorie) {
		TypeDictionaryDicoAssociationEntiteOrgActionCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ACTION__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssociationEntiteOrgActionCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ACTION__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeDataTypeAngle getAngleAvecObservateur() {
		return angleAvecObservateur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngleAvecObservateur(TypeDataTypeAngle newAngleAvecObservateur, NotificationChain msgs) {
		TypeDataTypeAngle oldAngleAvecObservateur = angleAvecObservateur;
		angleAvecObservateur = newAngleAvecObservateur;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ACTION__ANGLE_AVEC_OBSERVATEUR, oldAngleAvecObservateur, newAngleAvecObservateur);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngleAvecObservateur(TypeDataTypeAngle newAngleAvecObservateur) {
		if (newAngleAvecObservateur != angleAvecObservateur) {
			NotificationChain msgs = null;
			if (angleAvecObservateur != null)
				msgs = ((InternalEObject)angleAvecObservateur).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ACTION__ANGLE_AVEC_OBSERVATEUR, null, msgs);
			if (newAngleAvecObservateur != null)
				msgs = ((InternalEObject)newAngleAvecObservateur).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ACTION__ANGLE_AVEC_OBSERVATEUR, null, msgs);
			msgs = basicSetAngleAvecObservateur(newAngleAvecObservateur, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ACTION__ANGLE_AVEC_OBSERVATEUR, newAngleAvecObservateur, newAngleAvecObservateur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIntention() {
		return intention;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntention(String newIntention) {
		String oldIntention = intention;
		intention = newIntention;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ACTION__INTENTION, oldIntention, intention));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourSujetEntiteOrganisationnelle() {
		return aPourSujetEntiteOrganisationnelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourSujetEntiteOrganisationnelle(TypeAssociation newAPourSujetEntiteOrganisationnelle, NotificationChain msgs) {
		TypeAssociation oldAPourSujetEntiteOrganisationnelle = aPourSujetEntiteOrganisationnelle;
		aPourSujetEntiteOrganisationnelle = newAPourSujetEntiteOrganisationnelle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ACTION__APOUR_SUJET_ENTITE_ORGANISATIONNELLE, oldAPourSujetEntiteOrganisationnelle, newAPourSujetEntiteOrganisationnelle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourSujetEntiteOrganisationnelle(TypeAssociation newAPourSujetEntiteOrganisationnelle) {
		if (newAPourSujetEntiteOrganisationnelle != aPourSujetEntiteOrganisationnelle) {
			NotificationChain msgs = null;
			if (aPourSujetEntiteOrganisationnelle != null)
				msgs = ((InternalEObject)aPourSujetEntiteOrganisationnelle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ACTION__APOUR_SUJET_ENTITE_ORGANISATIONNELLE, null, msgs);
			if (newAPourSujetEntiteOrganisationnelle != null)
				msgs = ((InternalEObject)newAPourSujetEntiteOrganisationnelle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ACTION__APOUR_SUJET_ENTITE_ORGANISATIONNELLE, null, msgs);
			msgs = basicSetAPourSujetEntiteOrganisationnelle(newAPourSujetEntiteOrganisationnelle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ACTION__APOUR_SUJET_ENTITE_ORGANISATIONNELLE, newAPourSujetEntiteOrganisationnelle, newAPourSujetEntiteOrganisationnelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourObjetAction() {
		return aPourObjetAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourObjetAction(TypeAssociation newAPourObjetAction, NotificationChain msgs) {
		TypeAssociation oldAPourObjetAction = aPourObjetAction;
		aPourObjetAction = newAPourObjetAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ACTION__APOUR_OBJET_ACTION, oldAPourObjetAction, newAPourObjetAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourObjetAction(TypeAssociation newAPourObjetAction) {
		if (newAPourObjetAction != aPourObjetAction) {
			NotificationChain msgs = null;
			if (aPourObjetAction != null)
				msgs = ((InternalEObject)aPourObjetAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ACTION__APOUR_OBJET_ACTION, null, msgs);
			if (newAPourObjetAction != null)
				msgs = ((InternalEObject)newAPourObjetAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ACTION__APOUR_OBJET_ACTION, null, msgs);
			msgs = basicSetAPourObjetAction(newAPourObjetAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ACTION__APOUR_OBJET_ACTION, newAPourObjetAction, newAPourObjetAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ACTION__ANGLE_AVEC_OBSERVATEUR:
				return basicSetAngleAvecObservateur(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ACTION__APOUR_SUJET_ENTITE_ORGANISATIONNELLE:
				return basicSetAPourSujetEntiteOrganisationnelle(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ACTION__APOUR_OBJET_ACTION:
				return basicSetAPourObjetAction(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ACTION__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ACTION__ANGLE_AVEC_OBSERVATEUR:
				return getAngleAvecObservateur();
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ACTION__INTENTION:
				return getIntention();
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ACTION__APOUR_SUJET_ENTITE_ORGANISATIONNELLE:
				return getAPourSujetEntiteOrganisationnelle();
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ACTION__APOUR_OBJET_ACTION:
				return getAPourObjetAction();
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
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ACTION__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationEntiteOrgActionCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ACTION__ANGLE_AVEC_OBSERVATEUR:
				setAngleAvecObservateur((TypeDataTypeAngle)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ACTION__INTENTION:
				setIntention((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ACTION__APOUR_SUJET_ENTITE_ORGANISATIONNELLE:
				setAPourSujetEntiteOrganisationnelle((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ACTION__APOUR_OBJET_ACTION:
				setAPourObjetAction((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ACTION__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ACTION__ANGLE_AVEC_OBSERVATEUR:
				setAngleAvecObservateur((TypeDataTypeAngle)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ACTION__INTENTION:
				setIntention(INTENTION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ACTION__APOUR_SUJET_ENTITE_ORGANISATIONNELLE:
				setAPourSujetEntiteOrganisationnelle((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ACTION__APOUR_OBJET_ACTION:
				setAPourObjetAction((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ACTION__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ACTION__ANGLE_AVEC_OBSERVATEUR:
				return angleAvecObservateur != null;
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ACTION__INTENTION:
				return INTENTION_EDEFAULT == null ? intention != null : !INTENTION_EDEFAULT.equals(intention);
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ACTION__APOUR_SUJET_ENTITE_ORGANISATIONNELLE:
				return aPourSujetEntiteOrganisationnelle != null;
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ACTION__APOUR_OBJET_ACTION:
				return aPourObjetAction != null;
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
		result.append(", intention: ");
		result.append(intention);
		result.append(')');
		return result.toString();
	}

} //TypeAssociationEntiteOrgActionImpl
