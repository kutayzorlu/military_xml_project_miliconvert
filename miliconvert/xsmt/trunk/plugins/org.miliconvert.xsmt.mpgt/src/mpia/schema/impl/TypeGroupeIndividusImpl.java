/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoGroupeIndividusTypeLieu;
import mpia.schema.TypeGroupeIndividus;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Groupe Individus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeGroupeIndividusImpl#getEthnie <em>Ethnie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeGroupeIndividusImpl#getDescriptionPopulation <em>Description Population</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeGroupeIndividusImpl#getTypeLieu <em>Type Lieu</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeGroupeIndividusImpl#getConsequences <em>Consequences</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeGroupeIndividusImpl#getNomRangResponsable <em>Nom Rang Responsable</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeGroupeIndividusImpl#getFonctionResponsable <em>Fonction Responsable</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeGroupeIndividusImpl#getAPourResponsableUnite <em>APour Responsable Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeGroupeIndividusImpl extends TypeEntiteOrganisationnelleImpl implements TypeGroupeIndividus {
	/**
	 * The default value of the '{@link #getEthnie() <em>Ethnie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEthnie()
	 * @generated
	 * @ordered
	 */
	protected static final String ETHNIE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEthnie() <em>Ethnie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEthnie()
	 * @generated
	 * @ordered
	 */
	protected String ethnie = ETHNIE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescriptionPopulation() <em>Description Population</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionPopulation()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_POPULATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescriptionPopulation() <em>Description Population</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionPopulation()
	 * @generated
	 * @ordered
	 */
	protected String descriptionPopulation = DESCRIPTION_POPULATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeLieu() <em>Type Lieu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeLieu()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoGroupeIndividusTypeLieu TYPE_LIEU_EDEFAULT = TypeDictionaryDicoGroupeIndividusTypeLieu.PCZ;

	/**
	 * The cached value of the '{@link #getTypeLieu() <em>Type Lieu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeLieu()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoGroupeIndividusTypeLieu typeLieu = TYPE_LIEU_EDEFAULT;

	/**
	 * This is true if the Type Lieu attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeLieuESet;

	/**
	 * The default value of the '{@link #getConsequences() <em>Consequences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsequences()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSEQUENCES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsequences() <em>Consequences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsequences()
	 * @generated
	 * @ordered
	 */
	protected String consequences = CONSEQUENCES_EDEFAULT;

	/**
	 * The default value of the '{@link #getNomRangResponsable() <em>Nom Rang Responsable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomRangResponsable()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_RANG_RESPONSABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomRangResponsable() <em>Nom Rang Responsable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomRangResponsable()
	 * @generated
	 * @ordered
	 */
	protected String nomRangResponsable = NOM_RANG_RESPONSABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFonctionResponsable() <em>Fonction Responsable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFonctionResponsable()
	 * @generated
	 * @ordered
	 */
	protected static final String FONCTION_RESPONSABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFonctionResponsable() <em>Fonction Responsable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFonctionResponsable()
	 * @generated
	 * @ordered
	 */
	protected String fonctionResponsable = FONCTION_RESPONSABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAPourResponsableUnite() <em>APour Responsable Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourResponsableUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourResponsableUnite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeGroupeIndividusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeGroupeIndividus();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEthnie() {
		return ethnie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEthnie(String newEthnie) {
		String oldEthnie = ethnie;
		ethnie = newEthnie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_GROUPE_INDIVIDUS__ETHNIE, oldEthnie, ethnie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescriptionPopulation() {
		return descriptionPopulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptionPopulation(String newDescriptionPopulation) {
		String oldDescriptionPopulation = descriptionPopulation;
		descriptionPopulation = newDescriptionPopulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_GROUPE_INDIVIDUS__DESCRIPTION_POPULATION, oldDescriptionPopulation, descriptionPopulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoGroupeIndividusTypeLieu getTypeLieu() {
		return typeLieu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeLieu(TypeDictionaryDicoGroupeIndividusTypeLieu newTypeLieu) {
		TypeDictionaryDicoGroupeIndividusTypeLieu oldTypeLieu = typeLieu;
		typeLieu = newTypeLieu == null ? TYPE_LIEU_EDEFAULT : newTypeLieu;
		boolean oldTypeLieuESet = typeLieuESet;
		typeLieuESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_GROUPE_INDIVIDUS__TYPE_LIEU, oldTypeLieu, typeLieu, !oldTypeLieuESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeLieu() {
		TypeDictionaryDicoGroupeIndividusTypeLieu oldTypeLieu = typeLieu;
		boolean oldTypeLieuESet = typeLieuESet;
		typeLieu = TYPE_LIEU_EDEFAULT;
		typeLieuESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_GROUPE_INDIVIDUS__TYPE_LIEU, oldTypeLieu, TYPE_LIEU_EDEFAULT, oldTypeLieuESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeLieu() {
		return typeLieuESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConsequences() {
		return consequences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsequences(String newConsequences) {
		String oldConsequences = consequences;
		consequences = newConsequences;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_GROUPE_INDIVIDUS__CONSEQUENCES, oldConsequences, consequences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomRangResponsable() {
		return nomRangResponsable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomRangResponsable(String newNomRangResponsable) {
		String oldNomRangResponsable = nomRangResponsable;
		nomRangResponsable = newNomRangResponsable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_GROUPE_INDIVIDUS__NOM_RANG_RESPONSABLE, oldNomRangResponsable, nomRangResponsable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFonctionResponsable() {
		return fonctionResponsable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFonctionResponsable(String newFonctionResponsable) {
		String oldFonctionResponsable = fonctionResponsable;
		fonctionResponsable = newFonctionResponsable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_GROUPE_INDIVIDUS__FONCTION_RESPONSABLE, oldFonctionResponsable, fonctionResponsable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourResponsableUnite() {
		return aPourResponsableUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourResponsableUnite(TypeAssociationEXT newAPourResponsableUnite, NotificationChain msgs) {
		TypeAssociationEXT oldAPourResponsableUnite = aPourResponsableUnite;
		aPourResponsableUnite = newAPourResponsableUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_GROUPE_INDIVIDUS__APOUR_RESPONSABLE_UNITE, oldAPourResponsableUnite, newAPourResponsableUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourResponsableUnite(TypeAssociationEXT newAPourResponsableUnite) {
		if (newAPourResponsableUnite != aPourResponsableUnite) {
			NotificationChain msgs = null;
			if (aPourResponsableUnite != null)
				msgs = ((InternalEObject)aPourResponsableUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_GROUPE_INDIVIDUS__APOUR_RESPONSABLE_UNITE, null, msgs);
			if (newAPourResponsableUnite != null)
				msgs = ((InternalEObject)newAPourResponsableUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_GROUPE_INDIVIDUS__APOUR_RESPONSABLE_UNITE, null, msgs);
			msgs = basicSetAPourResponsableUnite(newAPourResponsableUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_GROUPE_INDIVIDUS__APOUR_RESPONSABLE_UNITE, newAPourResponsableUnite, newAPourResponsableUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_GROUPE_INDIVIDUS__APOUR_RESPONSABLE_UNITE:
				return basicSetAPourResponsableUnite(null, msgs);
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
			case SchemaPackage.TYPE_GROUPE_INDIVIDUS__ETHNIE:
				return getEthnie();
			case SchemaPackage.TYPE_GROUPE_INDIVIDUS__DESCRIPTION_POPULATION:
				return getDescriptionPopulation();
			case SchemaPackage.TYPE_GROUPE_INDIVIDUS__TYPE_LIEU:
				return getTypeLieu();
			case SchemaPackage.TYPE_GROUPE_INDIVIDUS__CONSEQUENCES:
				return getConsequences();
			case SchemaPackage.TYPE_GROUPE_INDIVIDUS__NOM_RANG_RESPONSABLE:
				return getNomRangResponsable();
			case SchemaPackage.TYPE_GROUPE_INDIVIDUS__FONCTION_RESPONSABLE:
				return getFonctionResponsable();
			case SchemaPackage.TYPE_GROUPE_INDIVIDUS__APOUR_RESPONSABLE_UNITE:
				return getAPourResponsableUnite();
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
			case SchemaPackage.TYPE_GROUPE_INDIVIDUS__ETHNIE:
				setEthnie((String)newValue);
				return;
			case SchemaPackage.TYPE_GROUPE_INDIVIDUS__DESCRIPTION_POPULATION:
				setDescriptionPopulation((String)newValue);
				return;
			case SchemaPackage.TYPE_GROUPE_INDIVIDUS__TYPE_LIEU:
				setTypeLieu((TypeDictionaryDicoGroupeIndividusTypeLieu)newValue);
				return;
			case SchemaPackage.TYPE_GROUPE_INDIVIDUS__CONSEQUENCES:
				setConsequences((String)newValue);
				return;
			case SchemaPackage.TYPE_GROUPE_INDIVIDUS__NOM_RANG_RESPONSABLE:
				setNomRangResponsable((String)newValue);
				return;
			case SchemaPackage.TYPE_GROUPE_INDIVIDUS__FONCTION_RESPONSABLE:
				setFonctionResponsable((String)newValue);
				return;
			case SchemaPackage.TYPE_GROUPE_INDIVIDUS__APOUR_RESPONSABLE_UNITE:
				setAPourResponsableUnite((TypeAssociationEXT)newValue);
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
			case SchemaPackage.TYPE_GROUPE_INDIVIDUS__ETHNIE:
				setEthnie(ETHNIE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_GROUPE_INDIVIDUS__DESCRIPTION_POPULATION:
				setDescriptionPopulation(DESCRIPTION_POPULATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_GROUPE_INDIVIDUS__TYPE_LIEU:
				unsetTypeLieu();
				return;
			case SchemaPackage.TYPE_GROUPE_INDIVIDUS__CONSEQUENCES:
				setConsequences(CONSEQUENCES_EDEFAULT);
				return;
			case SchemaPackage.TYPE_GROUPE_INDIVIDUS__NOM_RANG_RESPONSABLE:
				setNomRangResponsable(NOM_RANG_RESPONSABLE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_GROUPE_INDIVIDUS__FONCTION_RESPONSABLE:
				setFonctionResponsable(FONCTION_RESPONSABLE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_GROUPE_INDIVIDUS__APOUR_RESPONSABLE_UNITE:
				setAPourResponsableUnite((TypeAssociationEXT)null);
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
			case SchemaPackage.TYPE_GROUPE_INDIVIDUS__ETHNIE:
				return ETHNIE_EDEFAULT == null ? ethnie != null : !ETHNIE_EDEFAULT.equals(ethnie);
			case SchemaPackage.TYPE_GROUPE_INDIVIDUS__DESCRIPTION_POPULATION:
				return DESCRIPTION_POPULATION_EDEFAULT == null ? descriptionPopulation != null : !DESCRIPTION_POPULATION_EDEFAULT.equals(descriptionPopulation);
			case SchemaPackage.TYPE_GROUPE_INDIVIDUS__TYPE_LIEU:
				return isSetTypeLieu();
			case SchemaPackage.TYPE_GROUPE_INDIVIDUS__CONSEQUENCES:
				return CONSEQUENCES_EDEFAULT == null ? consequences != null : !CONSEQUENCES_EDEFAULT.equals(consequences);
			case SchemaPackage.TYPE_GROUPE_INDIVIDUS__NOM_RANG_RESPONSABLE:
				return NOM_RANG_RESPONSABLE_EDEFAULT == null ? nomRangResponsable != null : !NOM_RANG_RESPONSABLE_EDEFAULT.equals(nomRangResponsable);
			case SchemaPackage.TYPE_GROUPE_INDIVIDUS__FONCTION_RESPONSABLE:
				return FONCTION_RESPONSABLE_EDEFAULT == null ? fonctionResponsable != null : !FONCTION_RESPONSABLE_EDEFAULT.equals(fonctionResponsable);
			case SchemaPackage.TYPE_GROUPE_INDIVIDUS__APOUR_RESPONSABLE_UNITE:
				return aPourResponsableUnite != null;
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
		result.append(" (ethnie: ");
		result.append(ethnie);
		result.append(", descriptionPopulation: ");
		result.append(descriptionPopulation);
		result.append(", typeLieu: ");
		if (typeLieuESet) result.append(typeLieu); else result.append("<unset>");
		result.append(", consequences: ");
		result.append(consequences);
		result.append(", nomRangResponsable: ");
		result.append(nomRangResponsable);
		result.append(", fonctionResponsable: ");
		result.append(fonctionResponsable);
		result.append(')');
		return result.toString();
	}

} //TypeGroupeIndividusImpl
