/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoRegleEngagementCategorie;
import mpia.schema.TypeRegleEngagement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Regle Engagement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeRegleEngagementImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRegleEngagementImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRegleEngagementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRegleEngagementImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRegleEngagementImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRegleEngagementImpl#getAPourCreateurEntiteOrganisationnelle <em>APour Createur Entite Organisationnelle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeRegleEngagementImpl extends EObjectImpl implements TypeRegleEngagement {
	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoRegleEngagementCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoRegleEngagementCategorie.ENGRUL;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoRegleEngagementCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
	 * The cached value of the '{@link #getAPourCreateurEntiteOrganisationnelle() <em>APour Createur Entite Organisationnelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCreateurEntiteOrganisationnelle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourCreateurEntiteOrganisationnelle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeRegleEngagementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeRegleEngagement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_REGLE_ENGAGEMENT__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoRegleEngagementCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoRegleEngagementCategorie newCategorie) {
		TypeDictionaryDicoRegleEngagementCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_REGLE_ENGAGEMENT__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoRegleEngagementCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_REGLE_ENGAGEMENT__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_REGLE_ENGAGEMENT__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_REGLE_ENGAGEMENT__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_REGLE_ENGAGEMENT__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourCreateurEntiteOrganisationnelle() {
		return aPourCreateurEntiteOrganisationnelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourCreateurEntiteOrganisationnelle(TypeAssociationEXT newAPourCreateurEntiteOrganisationnelle, NotificationChain msgs) {
		TypeAssociationEXT oldAPourCreateurEntiteOrganisationnelle = aPourCreateurEntiteOrganisationnelle;
		aPourCreateurEntiteOrganisationnelle = newAPourCreateurEntiteOrganisationnelle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_REGLE_ENGAGEMENT__APOUR_CREATEUR_ENTITE_ORGANISATIONNELLE, oldAPourCreateurEntiteOrganisationnelle, newAPourCreateurEntiteOrganisationnelle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourCreateurEntiteOrganisationnelle(TypeAssociationEXT newAPourCreateurEntiteOrganisationnelle) {
		if (newAPourCreateurEntiteOrganisationnelle != aPourCreateurEntiteOrganisationnelle) {
			NotificationChain msgs = null;
			if (aPourCreateurEntiteOrganisationnelle != null)
				msgs = ((InternalEObject)aPourCreateurEntiteOrganisationnelle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_REGLE_ENGAGEMENT__APOUR_CREATEUR_ENTITE_ORGANISATIONNELLE, null, msgs);
			if (newAPourCreateurEntiteOrganisationnelle != null)
				msgs = ((InternalEObject)newAPourCreateurEntiteOrganisationnelle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_REGLE_ENGAGEMENT__APOUR_CREATEUR_ENTITE_ORGANISATIONNELLE, null, msgs);
			msgs = basicSetAPourCreateurEntiteOrganisationnelle(newAPourCreateurEntiteOrganisationnelle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_REGLE_ENGAGEMENT__APOUR_CREATEUR_ENTITE_ORGANISATIONNELLE, newAPourCreateurEntiteOrganisationnelle, newAPourCreateurEntiteOrganisationnelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_REGLE_ENGAGEMENT__APOUR_CREATEUR_ENTITE_ORGANISATIONNELLE:
				return basicSetAPourCreateurEntiteOrganisationnelle(null, msgs);
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
			case SchemaPackage.TYPE_REGLE_ENGAGEMENT__NOM:
				return getNom();
			case SchemaPackage.TYPE_REGLE_ENGAGEMENT__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_REGLE_ENGAGEMENT__DESCRIPTION:
				return getDescription();
			case SchemaPackage.TYPE_REGLE_ENGAGEMENT__CTE:
				return getCTE();
			case SchemaPackage.TYPE_REGLE_ENGAGEMENT__CE:
				return getCE();
			case SchemaPackage.TYPE_REGLE_ENGAGEMENT__APOUR_CREATEUR_ENTITE_ORGANISATIONNELLE:
				return getAPourCreateurEntiteOrganisationnelle();
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
			case SchemaPackage.TYPE_REGLE_ENGAGEMENT__NOM:
				setNom((String)newValue);
				return;
			case SchemaPackage.TYPE_REGLE_ENGAGEMENT__CATEGORIE:
				setCategorie((TypeDictionaryDicoRegleEngagementCategorie)newValue);
				return;
			case SchemaPackage.TYPE_REGLE_ENGAGEMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SchemaPackage.TYPE_REGLE_ENGAGEMENT__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_REGLE_ENGAGEMENT__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_REGLE_ENGAGEMENT__APOUR_CREATEUR_ENTITE_ORGANISATIONNELLE:
				setAPourCreateurEntiteOrganisationnelle((TypeAssociationEXT)newValue);
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
			case SchemaPackage.TYPE_REGLE_ENGAGEMENT__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case SchemaPackage.TYPE_REGLE_ENGAGEMENT__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_REGLE_ENGAGEMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_REGLE_ENGAGEMENT__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_REGLE_ENGAGEMENT__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_REGLE_ENGAGEMENT__APOUR_CREATEUR_ENTITE_ORGANISATIONNELLE:
				setAPourCreateurEntiteOrganisationnelle((TypeAssociationEXT)null);
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
			case SchemaPackage.TYPE_REGLE_ENGAGEMENT__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case SchemaPackage.TYPE_REGLE_ENGAGEMENT__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_REGLE_ENGAGEMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SchemaPackage.TYPE_REGLE_ENGAGEMENT__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_REGLE_ENGAGEMENT__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_REGLE_ENGAGEMENT__APOUR_CREATEUR_ENTITE_ORGANISATIONNELLE:
				return aPourCreateurEntiteOrganisationnelle != null;
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
		result.append(" (nom: ");
		result.append(nom);
		result.append(", categorie: ");
		if (categorieESet) result.append(categorie); else result.append("<unset>");
		result.append(", description: ");
		result.append(description);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeRegleEngagementImpl
