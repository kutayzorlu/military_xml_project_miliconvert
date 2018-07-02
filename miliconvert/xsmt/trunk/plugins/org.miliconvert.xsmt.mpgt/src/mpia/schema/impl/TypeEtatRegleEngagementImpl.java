/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociationEXT;
import mpia.meta.TypeDataTypeDateHeure;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoEtatRegleEngagementCategorie;
import mpia.schema.TypeEtatRegleEngagement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Etat Regle Engagement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEtatRegleEngagementImpl#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatRegleEngagementImpl#getDateFin <em>Date Fin</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatRegleEngagementImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatRegleEngagementImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatRegleEngagementImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatRegleEngagementImpl#getAPourEntiteResponsableEntiteOrganisationnelle <em>APour Entite Responsable Entite Organisationnelle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEtatRegleEngagementImpl extends EObjectImpl implements TypeEtatRegleEngagement {
	/**
	 * The cached value of the '{@link #getDateDebut() <em>Date Debut</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebut()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDateHeure dateDebut;

	/**
	 * The cached value of the '{@link #getDateFin() <em>Date Fin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFin()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDateHeure dateFin;

	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatRegleEngagementCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoEtatRegleEngagementCategorie.AUTHRS;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatRegleEngagementCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

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
	 * The cached value of the '{@link #getAPourEntiteResponsableEntiteOrganisationnelle() <em>APour Entite Responsable Entite Organisationnelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourEntiteResponsableEntiteOrganisationnelle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourEntiteResponsableEntiteOrganisationnelle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEtatRegleEngagementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEtatRegleEngagement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDateHeure getDateDebut() {
		return dateDebut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateDebut(TypeDataTypeDateHeure newDateDebut, NotificationChain msgs) {
		TypeDataTypeDateHeure oldDateDebut = dateDebut;
		dateDebut = newDateDebut;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_REGLE_ENGAGEMENT__DATE_DEBUT, oldDateDebut, newDateDebut);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDebut(TypeDataTypeDateHeure newDateDebut) {
		if (newDateDebut != dateDebut) {
			NotificationChain msgs = null;
			if (dateDebut != null)
				msgs = ((InternalEObject)dateDebut).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_REGLE_ENGAGEMENT__DATE_DEBUT, null, msgs);
			if (newDateDebut != null)
				msgs = ((InternalEObject)newDateDebut).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_REGLE_ENGAGEMENT__DATE_DEBUT, null, msgs);
			msgs = basicSetDateDebut(newDateDebut, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_REGLE_ENGAGEMENT__DATE_DEBUT, newDateDebut, newDateDebut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDateHeure getDateFin() {
		return dateFin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateFin(TypeDataTypeDateHeure newDateFin, NotificationChain msgs) {
		TypeDataTypeDateHeure oldDateFin = dateFin;
		dateFin = newDateFin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_REGLE_ENGAGEMENT__DATE_FIN, oldDateFin, newDateFin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateFin(TypeDataTypeDateHeure newDateFin) {
		if (newDateFin != dateFin) {
			NotificationChain msgs = null;
			if (dateFin != null)
				msgs = ((InternalEObject)dateFin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_REGLE_ENGAGEMENT__DATE_FIN, null, msgs);
			if (newDateFin != null)
				msgs = ((InternalEObject)newDateFin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_REGLE_ENGAGEMENT__DATE_FIN, null, msgs);
			msgs = basicSetDateFin(newDateFin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_REGLE_ENGAGEMENT__DATE_FIN, newDateFin, newDateFin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatRegleEngagementCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoEtatRegleEngagementCategorie newCategorie) {
		TypeDictionaryDicoEtatRegleEngagementCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_REGLE_ENGAGEMENT__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoEtatRegleEngagementCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_REGLE_ENGAGEMENT__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_REGLE_ENGAGEMENT__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_REGLE_ENGAGEMENT__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourEntiteResponsableEntiteOrganisationnelle() {
		return aPourEntiteResponsableEntiteOrganisationnelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourEntiteResponsableEntiteOrganisationnelle(TypeAssociationEXT newAPourEntiteResponsableEntiteOrganisationnelle, NotificationChain msgs) {
		TypeAssociationEXT oldAPourEntiteResponsableEntiteOrganisationnelle = aPourEntiteResponsableEntiteOrganisationnelle;
		aPourEntiteResponsableEntiteOrganisationnelle = newAPourEntiteResponsableEntiteOrganisationnelle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_REGLE_ENGAGEMENT__APOUR_ENTITE_RESPONSABLE_ENTITE_ORGANISATIONNELLE, oldAPourEntiteResponsableEntiteOrganisationnelle, newAPourEntiteResponsableEntiteOrganisationnelle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourEntiteResponsableEntiteOrganisationnelle(TypeAssociationEXT newAPourEntiteResponsableEntiteOrganisationnelle) {
		if (newAPourEntiteResponsableEntiteOrganisationnelle != aPourEntiteResponsableEntiteOrganisationnelle) {
			NotificationChain msgs = null;
			if (aPourEntiteResponsableEntiteOrganisationnelle != null)
				msgs = ((InternalEObject)aPourEntiteResponsableEntiteOrganisationnelle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_REGLE_ENGAGEMENT__APOUR_ENTITE_RESPONSABLE_ENTITE_ORGANISATIONNELLE, null, msgs);
			if (newAPourEntiteResponsableEntiteOrganisationnelle != null)
				msgs = ((InternalEObject)newAPourEntiteResponsableEntiteOrganisationnelle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_REGLE_ENGAGEMENT__APOUR_ENTITE_RESPONSABLE_ENTITE_ORGANISATIONNELLE, null, msgs);
			msgs = basicSetAPourEntiteResponsableEntiteOrganisationnelle(newAPourEntiteResponsableEntiteOrganisationnelle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_REGLE_ENGAGEMENT__APOUR_ENTITE_RESPONSABLE_ENTITE_ORGANISATIONNELLE, newAPourEntiteResponsableEntiteOrganisationnelle, newAPourEntiteResponsableEntiteOrganisationnelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ETAT_REGLE_ENGAGEMENT__DATE_DEBUT:
				return basicSetDateDebut(null, msgs);
			case SchemaPackage.TYPE_ETAT_REGLE_ENGAGEMENT__DATE_FIN:
				return basicSetDateFin(null, msgs);
			case SchemaPackage.TYPE_ETAT_REGLE_ENGAGEMENT__APOUR_ENTITE_RESPONSABLE_ENTITE_ORGANISATIONNELLE:
				return basicSetAPourEntiteResponsableEntiteOrganisationnelle(null, msgs);
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
			case SchemaPackage.TYPE_ETAT_REGLE_ENGAGEMENT__DATE_DEBUT:
				return getDateDebut();
			case SchemaPackage.TYPE_ETAT_REGLE_ENGAGEMENT__DATE_FIN:
				return getDateFin();
			case SchemaPackage.TYPE_ETAT_REGLE_ENGAGEMENT__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ETAT_REGLE_ENGAGEMENT__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ETAT_REGLE_ENGAGEMENT__CE:
				return getCE();
			case SchemaPackage.TYPE_ETAT_REGLE_ENGAGEMENT__APOUR_ENTITE_RESPONSABLE_ENTITE_ORGANISATIONNELLE:
				return getAPourEntiteResponsableEntiteOrganisationnelle();
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
			case SchemaPackage.TYPE_ETAT_REGLE_ENGAGEMENT__DATE_DEBUT:
				setDateDebut((TypeDataTypeDateHeure)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_REGLE_ENGAGEMENT__DATE_FIN:
				setDateFin((TypeDataTypeDateHeure)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_REGLE_ENGAGEMENT__CATEGORIE:
				setCategorie((TypeDictionaryDicoEtatRegleEngagementCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_REGLE_ENGAGEMENT__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_REGLE_ENGAGEMENT__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_REGLE_ENGAGEMENT__APOUR_ENTITE_RESPONSABLE_ENTITE_ORGANISATIONNELLE:
				setAPourEntiteResponsableEntiteOrganisationnelle((TypeAssociationEXT)newValue);
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
			case SchemaPackage.TYPE_ETAT_REGLE_ENGAGEMENT__DATE_DEBUT:
				setDateDebut((TypeDataTypeDateHeure)null);
				return;
			case SchemaPackage.TYPE_ETAT_REGLE_ENGAGEMENT__DATE_FIN:
				setDateFin((TypeDataTypeDateHeure)null);
				return;
			case SchemaPackage.TYPE_ETAT_REGLE_ENGAGEMENT__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ETAT_REGLE_ENGAGEMENT__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ETAT_REGLE_ENGAGEMENT__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ETAT_REGLE_ENGAGEMENT__APOUR_ENTITE_RESPONSABLE_ENTITE_ORGANISATIONNELLE:
				setAPourEntiteResponsableEntiteOrganisationnelle((TypeAssociationEXT)null);
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
			case SchemaPackage.TYPE_ETAT_REGLE_ENGAGEMENT__DATE_DEBUT:
				return dateDebut != null;
			case SchemaPackage.TYPE_ETAT_REGLE_ENGAGEMENT__DATE_FIN:
				return dateFin != null;
			case SchemaPackage.TYPE_ETAT_REGLE_ENGAGEMENT__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ETAT_REGLE_ENGAGEMENT__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ETAT_REGLE_ENGAGEMENT__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ETAT_REGLE_ENGAGEMENT__APOUR_ENTITE_RESPONSABLE_ENTITE_ORGANISATIONNELLE:
				return aPourEntiteResponsableEntiteOrganisationnelle != null;
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

} //TypeEtatRegleEngagementImpl
