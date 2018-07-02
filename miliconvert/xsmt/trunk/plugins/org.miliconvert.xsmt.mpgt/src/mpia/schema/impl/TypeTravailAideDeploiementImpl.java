/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoAideDeploiementObjetTravail;
import mpia.schema.TypeDictionaryDicoZoneMiseTerreHomologation;
import mpia.schema.TypeInfrastructure;
import mpia.schema.TypeLocalisation;
import mpia.schema.TypeTravailAideDeploiement;

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
 * An implementation of the model object '<em><b>Type Travail Aide Deploiement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeTravailAideDeploiementImpl#getObjetTravail <em>Objet Travail</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTravailAideDeploiementImpl#getDateDescriptionTravail <em>Date Description Travail</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTravailAideDeploiementImpl#getDegreDurabilite <em>Degre Durabilite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTravailAideDeploiementImpl#getEstLocaliseParLocalisation <em>Est Localise Par Localisation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTravailAideDeploiementImpl#getAPourInfrastuctureInfrastructure <em>APour Infrastucture Infrastructure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeTravailAideDeploiementImpl extends TypeRacineOperationnelleImpl implements TypeTravailAideDeploiement {
	/**
	 * The default value of the '{@link #getObjetTravail() <em>Objet Travail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjetTravail()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAideDeploiementObjetTravail OBJET_TRAVAIL_EDEFAULT = TypeDictionaryDicoAideDeploiementObjetTravail.WATSPL;

	/**
	 * The cached value of the '{@link #getObjetTravail() <em>Objet Travail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjetTravail()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAideDeploiementObjetTravail objetTravail = OBJET_TRAVAIL_EDEFAULT;

	/**
	 * This is true if the Objet Travail attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean objetTravailESet;

	/**
	 * The default value of the '{@link #getDateDescriptionTravail() <em>Date Description Travail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDescriptionTravail()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_DESCRIPTION_TRAVAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateDescriptionTravail() <em>Date Description Travail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDescriptionTravail()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateDescriptionTravail = DATE_DESCRIPTION_TRAVAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDegreDurabilite() <em>Degre Durabilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegreDurabilite()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoZoneMiseTerreHomologation DEGRE_DURABILITE_EDEFAULT = TypeDictionaryDicoZoneMiseTerreHomologation.EMG;

	/**
	 * The cached value of the '{@link #getDegreDurabilite() <em>Degre Durabilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegreDurabilite()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoZoneMiseTerreHomologation degreDurabilite = DEGRE_DURABILITE_EDEFAULT;

	/**
	 * This is true if the Degre Durabilite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean degreDurabiliteESet;

	/**
	 * The cached value of the '{@link #getEstLocaliseParLocalisation() <em>Est Localise Par Localisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstLocaliseParLocalisation()
	 * @generated
	 * @ordered
	 */
	protected TypeLocalisation estLocaliseParLocalisation;

	/**
	 * The cached value of the '{@link #getAPourInfrastuctureInfrastructure() <em>APour Infrastucture Infrastructure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourInfrastuctureInfrastructure()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeInfrastructure> aPourInfrastuctureInfrastructure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeTravailAideDeploiementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeTravailAideDeploiement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAideDeploiementObjetTravail getObjetTravail() {
		return objetTravail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjetTravail(TypeDictionaryDicoAideDeploiementObjetTravail newObjetTravail) {
		TypeDictionaryDicoAideDeploiementObjetTravail oldObjetTravail = objetTravail;
		objetTravail = newObjetTravail == null ? OBJET_TRAVAIL_EDEFAULT : newObjetTravail;
		boolean oldObjetTravailESet = objetTravailESet;
		objetTravailESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRAVAIL_AIDE_DEPLOIEMENT__OBJET_TRAVAIL, oldObjetTravail, objetTravail, !oldObjetTravailESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetObjetTravail() {
		TypeDictionaryDicoAideDeploiementObjetTravail oldObjetTravail = objetTravail;
		boolean oldObjetTravailESet = objetTravailESet;
		objetTravail = OBJET_TRAVAIL_EDEFAULT;
		objetTravailESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TRAVAIL_AIDE_DEPLOIEMENT__OBJET_TRAVAIL, oldObjetTravail, OBJET_TRAVAIL_EDEFAULT, oldObjetTravailESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetObjetTravail() {
		return objetTravailESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateDescriptionTravail() {
		return dateDescriptionTravail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDescriptionTravail(XMLGregorianCalendar newDateDescriptionTravail) {
		XMLGregorianCalendar oldDateDescriptionTravail = dateDescriptionTravail;
		dateDescriptionTravail = newDateDescriptionTravail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRAVAIL_AIDE_DEPLOIEMENT__DATE_DESCRIPTION_TRAVAIL, oldDateDescriptionTravail, dateDescriptionTravail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoZoneMiseTerreHomologation getDegreDurabilite() {
		return degreDurabilite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDegreDurabilite(TypeDictionaryDicoZoneMiseTerreHomologation newDegreDurabilite) {
		TypeDictionaryDicoZoneMiseTerreHomologation oldDegreDurabilite = degreDurabilite;
		degreDurabilite = newDegreDurabilite == null ? DEGRE_DURABILITE_EDEFAULT : newDegreDurabilite;
		boolean oldDegreDurabiliteESet = degreDurabiliteESet;
		degreDurabiliteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRAVAIL_AIDE_DEPLOIEMENT__DEGRE_DURABILITE, oldDegreDurabilite, degreDurabilite, !oldDegreDurabiliteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDegreDurabilite() {
		TypeDictionaryDicoZoneMiseTerreHomologation oldDegreDurabilite = degreDurabilite;
		boolean oldDegreDurabiliteESet = degreDurabiliteESet;
		degreDurabilite = DEGRE_DURABILITE_EDEFAULT;
		degreDurabiliteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TRAVAIL_AIDE_DEPLOIEMENT__DEGRE_DURABILITE, oldDegreDurabilite, DEGRE_DURABILITE_EDEFAULT, oldDegreDurabiliteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDegreDurabilite() {
		return degreDurabiliteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeLocalisation getEstLocaliseParLocalisation() {
		return estLocaliseParLocalisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstLocaliseParLocalisation(TypeLocalisation newEstLocaliseParLocalisation, NotificationChain msgs) {
		TypeLocalisation oldEstLocaliseParLocalisation = estLocaliseParLocalisation;
		estLocaliseParLocalisation = newEstLocaliseParLocalisation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRAVAIL_AIDE_DEPLOIEMENT__EST_LOCALISE_PAR_LOCALISATION, oldEstLocaliseParLocalisation, newEstLocaliseParLocalisation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstLocaliseParLocalisation(TypeLocalisation newEstLocaliseParLocalisation) {
		if (newEstLocaliseParLocalisation != estLocaliseParLocalisation) {
			NotificationChain msgs = null;
			if (estLocaliseParLocalisation != null)
				msgs = ((InternalEObject)estLocaliseParLocalisation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TRAVAIL_AIDE_DEPLOIEMENT__EST_LOCALISE_PAR_LOCALISATION, null, msgs);
			if (newEstLocaliseParLocalisation != null)
				msgs = ((InternalEObject)newEstLocaliseParLocalisation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TRAVAIL_AIDE_DEPLOIEMENT__EST_LOCALISE_PAR_LOCALISATION, null, msgs);
			msgs = basicSetEstLocaliseParLocalisation(newEstLocaliseParLocalisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRAVAIL_AIDE_DEPLOIEMENT__EST_LOCALISE_PAR_LOCALISATION, newEstLocaliseParLocalisation, newEstLocaliseParLocalisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeInfrastructure> getAPourInfrastuctureInfrastructure() {
		if (aPourInfrastuctureInfrastructure == null) {
			aPourInfrastuctureInfrastructure = new EObjectContainmentEList<TypeInfrastructure>(TypeInfrastructure.class, this, SchemaPackage.TYPE_TRAVAIL_AIDE_DEPLOIEMENT__APOUR_INFRASTUCTURE_INFRASTRUCTURE);
		}
		return aPourInfrastuctureInfrastructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_TRAVAIL_AIDE_DEPLOIEMENT__EST_LOCALISE_PAR_LOCALISATION:
				return basicSetEstLocaliseParLocalisation(null, msgs);
			case SchemaPackage.TYPE_TRAVAIL_AIDE_DEPLOIEMENT__APOUR_INFRASTUCTURE_INFRASTRUCTURE:
				return ((InternalEList<?>)getAPourInfrastuctureInfrastructure()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_TRAVAIL_AIDE_DEPLOIEMENT__OBJET_TRAVAIL:
				return getObjetTravail();
			case SchemaPackage.TYPE_TRAVAIL_AIDE_DEPLOIEMENT__DATE_DESCRIPTION_TRAVAIL:
				return getDateDescriptionTravail();
			case SchemaPackage.TYPE_TRAVAIL_AIDE_DEPLOIEMENT__DEGRE_DURABILITE:
				return getDegreDurabilite();
			case SchemaPackage.TYPE_TRAVAIL_AIDE_DEPLOIEMENT__EST_LOCALISE_PAR_LOCALISATION:
				return getEstLocaliseParLocalisation();
			case SchemaPackage.TYPE_TRAVAIL_AIDE_DEPLOIEMENT__APOUR_INFRASTUCTURE_INFRASTRUCTURE:
				return getAPourInfrastuctureInfrastructure();
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
			case SchemaPackage.TYPE_TRAVAIL_AIDE_DEPLOIEMENT__OBJET_TRAVAIL:
				setObjetTravail((TypeDictionaryDicoAideDeploiementObjetTravail)newValue);
				return;
			case SchemaPackage.TYPE_TRAVAIL_AIDE_DEPLOIEMENT__DATE_DESCRIPTION_TRAVAIL:
				setDateDescriptionTravail((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_TRAVAIL_AIDE_DEPLOIEMENT__DEGRE_DURABILITE:
				setDegreDurabilite((TypeDictionaryDicoZoneMiseTerreHomologation)newValue);
				return;
			case SchemaPackage.TYPE_TRAVAIL_AIDE_DEPLOIEMENT__EST_LOCALISE_PAR_LOCALISATION:
				setEstLocaliseParLocalisation((TypeLocalisation)newValue);
				return;
			case SchemaPackage.TYPE_TRAVAIL_AIDE_DEPLOIEMENT__APOUR_INFRASTUCTURE_INFRASTRUCTURE:
				getAPourInfrastuctureInfrastructure().clear();
				getAPourInfrastuctureInfrastructure().addAll((Collection<? extends TypeInfrastructure>)newValue);
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
			case SchemaPackage.TYPE_TRAVAIL_AIDE_DEPLOIEMENT__OBJET_TRAVAIL:
				unsetObjetTravail();
				return;
			case SchemaPackage.TYPE_TRAVAIL_AIDE_DEPLOIEMENT__DATE_DESCRIPTION_TRAVAIL:
				setDateDescriptionTravail(DATE_DESCRIPTION_TRAVAIL_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TRAVAIL_AIDE_DEPLOIEMENT__DEGRE_DURABILITE:
				unsetDegreDurabilite();
				return;
			case SchemaPackage.TYPE_TRAVAIL_AIDE_DEPLOIEMENT__EST_LOCALISE_PAR_LOCALISATION:
				setEstLocaliseParLocalisation((TypeLocalisation)null);
				return;
			case SchemaPackage.TYPE_TRAVAIL_AIDE_DEPLOIEMENT__APOUR_INFRASTUCTURE_INFRASTRUCTURE:
				getAPourInfrastuctureInfrastructure().clear();
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
			case SchemaPackage.TYPE_TRAVAIL_AIDE_DEPLOIEMENT__OBJET_TRAVAIL:
				return isSetObjetTravail();
			case SchemaPackage.TYPE_TRAVAIL_AIDE_DEPLOIEMENT__DATE_DESCRIPTION_TRAVAIL:
				return DATE_DESCRIPTION_TRAVAIL_EDEFAULT == null ? dateDescriptionTravail != null : !DATE_DESCRIPTION_TRAVAIL_EDEFAULT.equals(dateDescriptionTravail);
			case SchemaPackage.TYPE_TRAVAIL_AIDE_DEPLOIEMENT__DEGRE_DURABILITE:
				return isSetDegreDurabilite();
			case SchemaPackage.TYPE_TRAVAIL_AIDE_DEPLOIEMENT__EST_LOCALISE_PAR_LOCALISATION:
				return estLocaliseParLocalisation != null;
			case SchemaPackage.TYPE_TRAVAIL_AIDE_DEPLOIEMENT__APOUR_INFRASTUCTURE_INFRASTRUCTURE:
				return aPourInfrastuctureInfrastructure != null && !aPourInfrastuctureInfrastructure.isEmpty();
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
		result.append(" (objetTravail: ");
		if (objetTravailESet) result.append(objetTravail); else result.append("<unset>");
		result.append(", dateDescriptionTravail: ");
		result.append(dateDescriptionTravail);
		result.append(", degreDurabilite: ");
		if (degreDurabiliteESet) result.append(degreDurabilite); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeTravailAideDeploiementImpl
