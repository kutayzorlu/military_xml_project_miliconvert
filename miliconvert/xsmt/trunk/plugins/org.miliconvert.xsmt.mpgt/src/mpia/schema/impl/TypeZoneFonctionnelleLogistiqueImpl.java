/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoDomaineLogistique;
import mpia.schema.TypeLocalisation;
import mpia.schema.TypeZoneFonctionnelleLogistique;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Zone Fonctionnelle Logistique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeZoneFonctionnelleLogistiqueImpl#getDomaine <em>Domaine</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZoneFonctionnelleLogistiqueImpl#getComplement <em>Complement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZoneFonctionnelleLogistiqueImpl#getAPourLocalisationPCLocalisation <em>APour Localisation PC Localisation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeZoneFonctionnelleLogistiqueImpl extends TypeElementControleImpl implements TypeZoneFonctionnelleLogistique {
	/**
	 * The default value of the '{@link #getDomaine() <em>Domaine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomaine()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoDomaineLogistique DOMAINE_EDEFAULT = TypeDictionaryDicoDomaineLogistique.ADMIN;

	/**
	 * The cached value of the '{@link #getDomaine() <em>Domaine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomaine()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoDomaineLogistique domaine = DOMAINE_EDEFAULT;

	/**
	 * This is true if the Domaine attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean domaineESet;

	/**
	 * The default value of the '{@link #getComplement() <em>Complement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplement()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPLEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComplement() <em>Complement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplement()
	 * @generated
	 * @ordered
	 */
	protected String complement = COMPLEMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAPourLocalisationPCLocalisation() <em>APour Localisation PC Localisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourLocalisationPCLocalisation()
	 * @generated
	 * @ordered
	 */
	protected TypeLocalisation aPourLocalisationPCLocalisation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeZoneFonctionnelleLogistiqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeZoneFonctionnelleLogistique();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoDomaineLogistique getDomaine() {
		return domaine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomaine(TypeDictionaryDicoDomaineLogistique newDomaine) {
		TypeDictionaryDicoDomaineLogistique oldDomaine = domaine;
		domaine = newDomaine == null ? DOMAINE_EDEFAULT : newDomaine;
		boolean oldDomaineESet = domaineESet;
		domaineESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_FONCTIONNELLE_LOGISTIQUE__DOMAINE, oldDomaine, domaine, !oldDomaineESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDomaine() {
		TypeDictionaryDicoDomaineLogistique oldDomaine = domaine;
		boolean oldDomaineESet = domaineESet;
		domaine = DOMAINE_EDEFAULT;
		domaineESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ZONE_FONCTIONNELLE_LOGISTIQUE__DOMAINE, oldDomaine, DOMAINE_EDEFAULT, oldDomaineESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDomaine() {
		return domaineESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComplement() {
		return complement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplement(String newComplement) {
		String oldComplement = complement;
		complement = newComplement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_FONCTIONNELLE_LOGISTIQUE__COMPLEMENT, oldComplement, complement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeLocalisation getAPourLocalisationPCLocalisation() {
		return aPourLocalisationPCLocalisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourLocalisationPCLocalisation(TypeLocalisation newAPourLocalisationPCLocalisation, NotificationChain msgs) {
		TypeLocalisation oldAPourLocalisationPCLocalisation = aPourLocalisationPCLocalisation;
		aPourLocalisationPCLocalisation = newAPourLocalisationPCLocalisation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_FONCTIONNELLE_LOGISTIQUE__APOUR_LOCALISATION_PC_LOCALISATION, oldAPourLocalisationPCLocalisation, newAPourLocalisationPCLocalisation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourLocalisationPCLocalisation(TypeLocalisation newAPourLocalisationPCLocalisation) {
		if (newAPourLocalisationPCLocalisation != aPourLocalisationPCLocalisation) {
			NotificationChain msgs = null;
			if (aPourLocalisationPCLocalisation != null)
				msgs = ((InternalEObject)aPourLocalisationPCLocalisation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ZONE_FONCTIONNELLE_LOGISTIQUE__APOUR_LOCALISATION_PC_LOCALISATION, null, msgs);
			if (newAPourLocalisationPCLocalisation != null)
				msgs = ((InternalEObject)newAPourLocalisationPCLocalisation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ZONE_FONCTIONNELLE_LOGISTIQUE__APOUR_LOCALISATION_PC_LOCALISATION, null, msgs);
			msgs = basicSetAPourLocalisationPCLocalisation(newAPourLocalisationPCLocalisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_FONCTIONNELLE_LOGISTIQUE__APOUR_LOCALISATION_PC_LOCALISATION, newAPourLocalisationPCLocalisation, newAPourLocalisationPCLocalisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ZONE_FONCTIONNELLE_LOGISTIQUE__APOUR_LOCALISATION_PC_LOCALISATION:
				return basicSetAPourLocalisationPCLocalisation(null, msgs);
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
			case SchemaPackage.TYPE_ZONE_FONCTIONNELLE_LOGISTIQUE__DOMAINE:
				return getDomaine();
			case SchemaPackage.TYPE_ZONE_FONCTIONNELLE_LOGISTIQUE__COMPLEMENT:
				return getComplement();
			case SchemaPackage.TYPE_ZONE_FONCTIONNELLE_LOGISTIQUE__APOUR_LOCALISATION_PC_LOCALISATION:
				return getAPourLocalisationPCLocalisation();
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
			case SchemaPackage.TYPE_ZONE_FONCTIONNELLE_LOGISTIQUE__DOMAINE:
				setDomaine((TypeDictionaryDicoDomaineLogistique)newValue);
				return;
			case SchemaPackage.TYPE_ZONE_FONCTIONNELLE_LOGISTIQUE__COMPLEMENT:
				setComplement((String)newValue);
				return;
			case SchemaPackage.TYPE_ZONE_FONCTIONNELLE_LOGISTIQUE__APOUR_LOCALISATION_PC_LOCALISATION:
				setAPourLocalisationPCLocalisation((TypeLocalisation)newValue);
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
			case SchemaPackage.TYPE_ZONE_FONCTIONNELLE_LOGISTIQUE__DOMAINE:
				unsetDomaine();
				return;
			case SchemaPackage.TYPE_ZONE_FONCTIONNELLE_LOGISTIQUE__COMPLEMENT:
				setComplement(COMPLEMENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ZONE_FONCTIONNELLE_LOGISTIQUE__APOUR_LOCALISATION_PC_LOCALISATION:
				setAPourLocalisationPCLocalisation((TypeLocalisation)null);
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
			case SchemaPackage.TYPE_ZONE_FONCTIONNELLE_LOGISTIQUE__DOMAINE:
				return isSetDomaine();
			case SchemaPackage.TYPE_ZONE_FONCTIONNELLE_LOGISTIQUE__COMPLEMENT:
				return COMPLEMENT_EDEFAULT == null ? complement != null : !COMPLEMENT_EDEFAULT.equals(complement);
			case SchemaPackage.TYPE_ZONE_FONCTIONNELLE_LOGISTIQUE__APOUR_LOCALISATION_PC_LOCALISATION:
				return aPourLocalisationPCLocalisation != null;
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
		result.append(" (domaine: ");
		if (domaineESet) result.append(domaine); else result.append("<unset>");
		result.append(", complement: ");
		result.append(complement);
		result.append(')');
		return result.toString();
	}

} //TypeZoneFonctionnelleLogistiqueImpl
