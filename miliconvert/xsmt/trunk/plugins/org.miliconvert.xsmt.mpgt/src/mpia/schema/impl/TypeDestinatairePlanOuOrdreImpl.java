/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeDateHeure;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeApercuDestinatairePlanOuOrdre;
import mpia.schema.TypeDestinatairePlanOuOrdre;
import mpia.schema.TypeDictionaryDicoDestinatairePlanOrdreCategorie;

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
 * An implementation of the model object '<em><b>Type Destinataire Plan Ou Ordre</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeDestinatairePlanOuOrdreImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDestinatairePlanOuOrdreImpl#getDateEnvoi <em>Date Envoi</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDestinatairePlanOuOrdreImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDestinatairePlanOuOrdreImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDestinatairePlanOuOrdreImpl#getAPourDestinataireEntiteOrganisationnelle <em>APour Destinataire Entite Organisationnelle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDestinatairePlanOuOrdreImpl#getAPourApercuApercuDestinatairePlanOuOrdre <em>APour Apercu Apercu Destinataire Plan Ou Ordre</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeDestinatairePlanOuOrdreImpl extends EObjectImpl implements TypeDestinatairePlanOuOrdre {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoDestinatairePlanOrdreCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoDestinatairePlanOrdreCategorie.DSTEXE;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoDestinatairePlanOrdreCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The cached value of the '{@link #getDateEnvoi() <em>Date Envoi</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateEnvoi()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDateHeure dateEnvoi;

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
	 * The cached value of the '{@link #getAPourDestinataireEntiteOrganisationnelle() <em>APour Destinataire Entite Organisationnelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourDestinataireEntiteOrganisationnelle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourDestinataireEntiteOrganisationnelle;

	/**
	 * The cached value of the '{@link #getAPourApercuApercuDestinatairePlanOuOrdre() <em>APour Apercu Apercu Destinataire Plan Ou Ordre</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourApercuApercuDestinatairePlanOuOrdre()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeApercuDestinatairePlanOuOrdre> aPourApercuApercuDestinatairePlanOuOrdre;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDestinatairePlanOuOrdreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeDestinatairePlanOuOrdre();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoDestinatairePlanOrdreCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoDestinatairePlanOrdreCategorie newCategorie) {
		TypeDictionaryDicoDestinatairePlanOrdreCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DESTINATAIRE_PLAN_OU_ORDRE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoDestinatairePlanOrdreCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DESTINATAIRE_PLAN_OU_ORDRE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeDataTypeDateHeure getDateEnvoi() {
		return dateEnvoi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateEnvoi(TypeDataTypeDateHeure newDateEnvoi, NotificationChain msgs) {
		TypeDataTypeDateHeure oldDateEnvoi = dateEnvoi;
		dateEnvoi = newDateEnvoi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DESTINATAIRE_PLAN_OU_ORDRE__DATE_ENVOI, oldDateEnvoi, newDateEnvoi);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateEnvoi(TypeDataTypeDateHeure newDateEnvoi) {
		if (newDateEnvoi != dateEnvoi) {
			NotificationChain msgs = null;
			if (dateEnvoi != null)
				msgs = ((InternalEObject)dateEnvoi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DESTINATAIRE_PLAN_OU_ORDRE__DATE_ENVOI, null, msgs);
			if (newDateEnvoi != null)
				msgs = ((InternalEObject)newDateEnvoi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DESTINATAIRE_PLAN_OU_ORDRE__DATE_ENVOI, null, msgs);
			msgs = basicSetDateEnvoi(newDateEnvoi, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DESTINATAIRE_PLAN_OU_ORDRE__DATE_ENVOI, newDateEnvoi, newDateEnvoi));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DESTINATAIRE_PLAN_OU_ORDRE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DESTINATAIRE_PLAN_OU_ORDRE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourDestinataireEntiteOrganisationnelle() {
		return aPourDestinataireEntiteOrganisationnelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourDestinataireEntiteOrganisationnelle(TypeAssociation newAPourDestinataireEntiteOrganisationnelle, NotificationChain msgs) {
		TypeAssociation oldAPourDestinataireEntiteOrganisationnelle = aPourDestinataireEntiteOrganisationnelle;
		aPourDestinataireEntiteOrganisationnelle = newAPourDestinataireEntiteOrganisationnelle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DESTINATAIRE_PLAN_OU_ORDRE__APOUR_DESTINATAIRE_ENTITE_ORGANISATIONNELLE, oldAPourDestinataireEntiteOrganisationnelle, newAPourDestinataireEntiteOrganisationnelle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourDestinataireEntiteOrganisationnelle(TypeAssociation newAPourDestinataireEntiteOrganisationnelle) {
		if (newAPourDestinataireEntiteOrganisationnelle != aPourDestinataireEntiteOrganisationnelle) {
			NotificationChain msgs = null;
			if (aPourDestinataireEntiteOrganisationnelle != null)
				msgs = ((InternalEObject)aPourDestinataireEntiteOrganisationnelle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DESTINATAIRE_PLAN_OU_ORDRE__APOUR_DESTINATAIRE_ENTITE_ORGANISATIONNELLE, null, msgs);
			if (newAPourDestinataireEntiteOrganisationnelle != null)
				msgs = ((InternalEObject)newAPourDestinataireEntiteOrganisationnelle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DESTINATAIRE_PLAN_OU_ORDRE__APOUR_DESTINATAIRE_ENTITE_ORGANISATIONNELLE, null, msgs);
			msgs = basicSetAPourDestinataireEntiteOrganisationnelle(newAPourDestinataireEntiteOrganisationnelle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DESTINATAIRE_PLAN_OU_ORDRE__APOUR_DESTINATAIRE_ENTITE_ORGANISATIONNELLE, newAPourDestinataireEntiteOrganisationnelle, newAPourDestinataireEntiteOrganisationnelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeApercuDestinatairePlanOuOrdre> getAPourApercuApercuDestinatairePlanOuOrdre() {
		if (aPourApercuApercuDestinatairePlanOuOrdre == null) {
			aPourApercuApercuDestinatairePlanOuOrdre = new EObjectContainmentEList<TypeApercuDestinatairePlanOuOrdre>(TypeApercuDestinatairePlanOuOrdre.class, this, SchemaPackage.TYPE_DESTINATAIRE_PLAN_OU_ORDRE__APOUR_APERCU_APERCU_DESTINATAIRE_PLAN_OU_ORDRE);
		}
		return aPourApercuApercuDestinatairePlanOuOrdre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_DESTINATAIRE_PLAN_OU_ORDRE__DATE_ENVOI:
				return basicSetDateEnvoi(null, msgs);
			case SchemaPackage.TYPE_DESTINATAIRE_PLAN_OU_ORDRE__APOUR_DESTINATAIRE_ENTITE_ORGANISATIONNELLE:
				return basicSetAPourDestinataireEntiteOrganisationnelle(null, msgs);
			case SchemaPackage.TYPE_DESTINATAIRE_PLAN_OU_ORDRE__APOUR_APERCU_APERCU_DESTINATAIRE_PLAN_OU_ORDRE:
				return ((InternalEList<?>)getAPourApercuApercuDestinatairePlanOuOrdre()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_DESTINATAIRE_PLAN_OU_ORDRE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_DESTINATAIRE_PLAN_OU_ORDRE__DATE_ENVOI:
				return getDateEnvoi();
			case SchemaPackage.TYPE_DESTINATAIRE_PLAN_OU_ORDRE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_DESTINATAIRE_PLAN_OU_ORDRE__CE:
				return getCE();
			case SchemaPackage.TYPE_DESTINATAIRE_PLAN_OU_ORDRE__APOUR_DESTINATAIRE_ENTITE_ORGANISATIONNELLE:
				return getAPourDestinataireEntiteOrganisationnelle();
			case SchemaPackage.TYPE_DESTINATAIRE_PLAN_OU_ORDRE__APOUR_APERCU_APERCU_DESTINATAIRE_PLAN_OU_ORDRE:
				return getAPourApercuApercuDestinatairePlanOuOrdre();
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
			case SchemaPackage.TYPE_DESTINATAIRE_PLAN_OU_ORDRE__CATEGORIE:
				setCategorie((TypeDictionaryDicoDestinatairePlanOrdreCategorie)newValue);
				return;
			case SchemaPackage.TYPE_DESTINATAIRE_PLAN_OU_ORDRE__DATE_ENVOI:
				setDateEnvoi((TypeDataTypeDateHeure)newValue);
				return;
			case SchemaPackage.TYPE_DESTINATAIRE_PLAN_OU_ORDRE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_DESTINATAIRE_PLAN_OU_ORDRE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_DESTINATAIRE_PLAN_OU_ORDRE__APOUR_DESTINATAIRE_ENTITE_ORGANISATIONNELLE:
				setAPourDestinataireEntiteOrganisationnelle((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_DESTINATAIRE_PLAN_OU_ORDRE__APOUR_APERCU_APERCU_DESTINATAIRE_PLAN_OU_ORDRE:
				getAPourApercuApercuDestinatairePlanOuOrdre().clear();
				getAPourApercuApercuDestinatairePlanOuOrdre().addAll((Collection<? extends TypeApercuDestinatairePlanOuOrdre>)newValue);
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
			case SchemaPackage.TYPE_DESTINATAIRE_PLAN_OU_ORDRE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_DESTINATAIRE_PLAN_OU_ORDRE__DATE_ENVOI:
				setDateEnvoi((TypeDataTypeDateHeure)null);
				return;
			case SchemaPackage.TYPE_DESTINATAIRE_PLAN_OU_ORDRE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DESTINATAIRE_PLAN_OU_ORDRE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DESTINATAIRE_PLAN_OU_ORDRE__APOUR_DESTINATAIRE_ENTITE_ORGANISATIONNELLE:
				setAPourDestinataireEntiteOrganisationnelle((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_DESTINATAIRE_PLAN_OU_ORDRE__APOUR_APERCU_APERCU_DESTINATAIRE_PLAN_OU_ORDRE:
				getAPourApercuApercuDestinatairePlanOuOrdre().clear();
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
			case SchemaPackage.TYPE_DESTINATAIRE_PLAN_OU_ORDRE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_DESTINATAIRE_PLAN_OU_ORDRE__DATE_ENVOI:
				return dateEnvoi != null;
			case SchemaPackage.TYPE_DESTINATAIRE_PLAN_OU_ORDRE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_DESTINATAIRE_PLAN_OU_ORDRE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_DESTINATAIRE_PLAN_OU_ORDRE__APOUR_DESTINATAIRE_ENTITE_ORGANISATIONNELLE:
				return aPourDestinataireEntiteOrganisationnelle != null;
			case SchemaPackage.TYPE_DESTINATAIRE_PLAN_OU_ORDRE__APOUR_APERCU_APERCU_DESTINATAIRE_PLAN_OU_ORDRE:
				return aPourApercuApercuDestinatairePlanOuOrdre != null && !aPourApercuApercuDestinatairePlanOuOrdre.isEmpty();
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
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeDestinatairePlanOuOrdreImpl
