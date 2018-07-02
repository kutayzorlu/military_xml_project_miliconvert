/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeLongueur;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoTypeEntiteOrganisationnelleTypeCommandement;
import mpia.schema.TypeTypeEntiteOrganisationnelle;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Type Entite Organisationnelle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeTypeEntiteOrganisationnelleImpl#isFonctionCommandement <em>Fonction Commandement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeEntiteOrganisationnelleImpl#getTypeCommandement <em>Type Commandement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeEntiteOrganisationnelleImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeEntiteOrganisationnelleImpl#getLargZoneDiffusion <em>Larg Zone Diffusion</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeEntiteOrganisationnelleImpl#getHautZoneDiffusion <em>Haut Zone Diffusion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypeTypeEntiteOrganisationnelleImpl extends TypeTypeImpl implements TypeTypeEntiteOrganisationnelle {
	/**
	 * The default value of the '{@link #isFonctionCommandement() <em>Fonction Commandement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFonctionCommandement()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FONCTION_COMMANDEMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFonctionCommandement() <em>Fonction Commandement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFonctionCommandement()
	 * @generated
	 * @ordered
	 */
	protected boolean fonctionCommandement = FONCTION_COMMANDEMENT_EDEFAULT;

	/**
	 * This is true if the Fonction Commandement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fonctionCommandementESet;

	/**
	 * The default value of the '{@link #getTypeCommandement() <em>Type Commandement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCommandement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeEntiteOrganisationnelleTypeCommandement TYPE_COMMANDEMENT_EDEFAULT = TypeDictionaryDicoTypeEntiteOrganisationnelleTypeCommandement.CP;

	/**
	 * The cached value of the '{@link #getTypeCommandement() <em>Type Commandement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCommandement()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeEntiteOrganisationnelleTypeCommandement typeCommandement = TYPE_COMMANDEMENT_EDEFAULT;

	/**
	 * This is true if the Type Commandement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeCommandementESet;

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
	 * The cached value of the '{@link #getLargZoneDiffusion() <em>Larg Zone Diffusion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargZoneDiffusion()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur largZoneDiffusion;

	/**
	 * The cached value of the '{@link #getHautZoneDiffusion() <em>Haut Zone Diffusion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHautZoneDiffusion()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur hautZoneDiffusion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeTypeEntiteOrganisationnelleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeTypeEntiteOrganisationnelle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFonctionCommandement() {
		return fonctionCommandement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFonctionCommandement(boolean newFonctionCommandement) {
		boolean oldFonctionCommandement = fonctionCommandement;
		fonctionCommandement = newFonctionCommandement;
		boolean oldFonctionCommandementESet = fonctionCommandementESet;
		fonctionCommandementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_ENTITE_ORGANISATIONNELLE__FONCTION_COMMANDEMENT, oldFonctionCommandement, fonctionCommandement, !oldFonctionCommandementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFonctionCommandement() {
		boolean oldFonctionCommandement = fonctionCommandement;
		boolean oldFonctionCommandementESet = fonctionCommandementESet;
		fonctionCommandement = FONCTION_COMMANDEMENT_EDEFAULT;
		fonctionCommandementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_ENTITE_ORGANISATIONNELLE__FONCTION_COMMANDEMENT, oldFonctionCommandement, FONCTION_COMMANDEMENT_EDEFAULT, oldFonctionCommandementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFonctionCommandement() {
		return fonctionCommandementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeEntiteOrganisationnelleTypeCommandement getTypeCommandement() {
		return typeCommandement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeCommandement(TypeDictionaryDicoTypeEntiteOrganisationnelleTypeCommandement newTypeCommandement) {
		TypeDictionaryDicoTypeEntiteOrganisationnelleTypeCommandement oldTypeCommandement = typeCommandement;
		typeCommandement = newTypeCommandement == null ? TYPE_COMMANDEMENT_EDEFAULT : newTypeCommandement;
		boolean oldTypeCommandementESet = typeCommandementESet;
		typeCommandementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_ENTITE_ORGANISATIONNELLE__TYPE_COMMANDEMENT, oldTypeCommandement, typeCommandement, !oldTypeCommandementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeCommandement() {
		TypeDictionaryDicoTypeEntiteOrganisationnelleTypeCommandement oldTypeCommandement = typeCommandement;
		boolean oldTypeCommandementESet = typeCommandementESet;
		typeCommandement = TYPE_COMMANDEMENT_EDEFAULT;
		typeCommandementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_ENTITE_ORGANISATIONNELLE__TYPE_COMMANDEMENT, oldTypeCommandement, TYPE_COMMANDEMENT_EDEFAULT, oldTypeCommandementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeCommandement() {
		return typeCommandementESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_ENTITE_ORGANISATIONNELLE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getLargZoneDiffusion() {
		return largZoneDiffusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLargZoneDiffusion(TypeDataTypeLongueur newLargZoneDiffusion, NotificationChain msgs) {
		TypeDataTypeLongueur oldLargZoneDiffusion = largZoneDiffusion;
		largZoneDiffusion = newLargZoneDiffusion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_ENTITE_ORGANISATIONNELLE__LARG_ZONE_DIFFUSION, oldLargZoneDiffusion, newLargZoneDiffusion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLargZoneDiffusion(TypeDataTypeLongueur newLargZoneDiffusion) {
		if (newLargZoneDiffusion != largZoneDiffusion) {
			NotificationChain msgs = null;
			if (largZoneDiffusion != null)
				msgs = ((InternalEObject)largZoneDiffusion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_ENTITE_ORGANISATIONNELLE__LARG_ZONE_DIFFUSION, null, msgs);
			if (newLargZoneDiffusion != null)
				msgs = ((InternalEObject)newLargZoneDiffusion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_ENTITE_ORGANISATIONNELLE__LARG_ZONE_DIFFUSION, null, msgs);
			msgs = basicSetLargZoneDiffusion(newLargZoneDiffusion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_ENTITE_ORGANISATIONNELLE__LARG_ZONE_DIFFUSION, newLargZoneDiffusion, newLargZoneDiffusion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getHautZoneDiffusion() {
		return hautZoneDiffusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHautZoneDiffusion(TypeDataTypeLongueur newHautZoneDiffusion, NotificationChain msgs) {
		TypeDataTypeLongueur oldHautZoneDiffusion = hautZoneDiffusion;
		hautZoneDiffusion = newHautZoneDiffusion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_ENTITE_ORGANISATIONNELLE__HAUT_ZONE_DIFFUSION, oldHautZoneDiffusion, newHautZoneDiffusion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHautZoneDiffusion(TypeDataTypeLongueur newHautZoneDiffusion) {
		if (newHautZoneDiffusion != hautZoneDiffusion) {
			NotificationChain msgs = null;
			if (hautZoneDiffusion != null)
				msgs = ((InternalEObject)hautZoneDiffusion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_ENTITE_ORGANISATIONNELLE__HAUT_ZONE_DIFFUSION, null, msgs);
			if (newHautZoneDiffusion != null)
				msgs = ((InternalEObject)newHautZoneDiffusion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_ENTITE_ORGANISATIONNELLE__HAUT_ZONE_DIFFUSION, null, msgs);
			msgs = basicSetHautZoneDiffusion(newHautZoneDiffusion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_ENTITE_ORGANISATIONNELLE__HAUT_ZONE_DIFFUSION, newHautZoneDiffusion, newHautZoneDiffusion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_TYPE_ENTITE_ORGANISATIONNELLE__LARG_ZONE_DIFFUSION:
				return basicSetLargZoneDiffusion(null, msgs);
			case SchemaPackage.TYPE_TYPE_ENTITE_ORGANISATIONNELLE__HAUT_ZONE_DIFFUSION:
				return basicSetHautZoneDiffusion(null, msgs);
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
			case SchemaPackage.TYPE_TYPE_ENTITE_ORGANISATIONNELLE__FONCTION_COMMANDEMENT:
				return isFonctionCommandement() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_TYPE_ENTITE_ORGANISATIONNELLE__TYPE_COMMANDEMENT:
				return getTypeCommandement();
			case SchemaPackage.TYPE_TYPE_ENTITE_ORGANISATIONNELLE__DESCRIPTION:
				return getDescription();
			case SchemaPackage.TYPE_TYPE_ENTITE_ORGANISATIONNELLE__LARG_ZONE_DIFFUSION:
				return getLargZoneDiffusion();
			case SchemaPackage.TYPE_TYPE_ENTITE_ORGANISATIONNELLE__HAUT_ZONE_DIFFUSION:
				return getHautZoneDiffusion();
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
			case SchemaPackage.TYPE_TYPE_ENTITE_ORGANISATIONNELLE__FONCTION_COMMANDEMENT:
				setFonctionCommandement(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_TYPE_ENTITE_ORGANISATIONNELLE__TYPE_COMMANDEMENT:
				setTypeCommandement((TypeDictionaryDicoTypeEntiteOrganisationnelleTypeCommandement)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_ENTITE_ORGANISATIONNELLE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_ENTITE_ORGANISATIONNELLE__LARG_ZONE_DIFFUSION:
				setLargZoneDiffusion((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_ENTITE_ORGANISATIONNELLE__HAUT_ZONE_DIFFUSION:
				setHautZoneDiffusion((TypeDataTypeLongueur)newValue);
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
			case SchemaPackage.TYPE_TYPE_ENTITE_ORGANISATIONNELLE__FONCTION_COMMANDEMENT:
				unsetFonctionCommandement();
				return;
			case SchemaPackage.TYPE_TYPE_ENTITE_ORGANISATIONNELLE__TYPE_COMMANDEMENT:
				unsetTypeCommandement();
				return;
			case SchemaPackage.TYPE_TYPE_ENTITE_ORGANISATIONNELLE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TYPE_ENTITE_ORGANISATIONNELLE__LARG_ZONE_DIFFUSION:
				setLargZoneDiffusion((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_TYPE_ENTITE_ORGANISATIONNELLE__HAUT_ZONE_DIFFUSION:
				setHautZoneDiffusion((TypeDataTypeLongueur)null);
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
			case SchemaPackage.TYPE_TYPE_ENTITE_ORGANISATIONNELLE__FONCTION_COMMANDEMENT:
				return isSetFonctionCommandement();
			case SchemaPackage.TYPE_TYPE_ENTITE_ORGANISATIONNELLE__TYPE_COMMANDEMENT:
				return isSetTypeCommandement();
			case SchemaPackage.TYPE_TYPE_ENTITE_ORGANISATIONNELLE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SchemaPackage.TYPE_TYPE_ENTITE_ORGANISATIONNELLE__LARG_ZONE_DIFFUSION:
				return largZoneDiffusion != null;
			case SchemaPackage.TYPE_TYPE_ENTITE_ORGANISATIONNELLE__HAUT_ZONE_DIFFUSION:
				return hautZoneDiffusion != null;
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
		result.append(" (fonctionCommandement: ");
		if (fonctionCommandementESet) result.append(fonctionCommandement); else result.append("<unset>");
		result.append(", typeCommandement: ");
		if (typeCommandementESet) result.append(typeCommandement); else result.append("<unset>");
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //TypeTypeEntiteOrganisationnelleImpl
