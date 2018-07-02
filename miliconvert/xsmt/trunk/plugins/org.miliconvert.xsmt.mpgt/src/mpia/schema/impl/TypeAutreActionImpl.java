/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAction3Deni;
import mpia.schema.TypeActionASAeni;
import mpia.schema.TypeActionGenieENI;
import mpia.schema.TypeAutreAction;
import mpia.schema.TypeDictionaryDicoActionActivite;
import mpia.schema.TypeDictionaryDicoActionSousActivite;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Autre Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAutreActionImpl#getActivite <em>Activite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAutreActionImpl#getSousActivite <em>Sous Activite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAutreActionImpl#getAPourCaracteristiquesActionASAeniActionASAeni <em>APour Caracteristiques Action AS Aeni Action AS Aeni</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAutreActionImpl#getAPourCaracteristiquesAction3DeniAction3Deni <em>APour Caracteristiques Action3 Deni Action3 Deni</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAutreActionImpl#getAPourCaracteristiquesActionGenieENIActionGenieENI <em>APour Caracteristiques Action Genie ENI Action Genie ENI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAutreActionImpl extends TypeActionImpl implements TypeAutreAction {
	/**
	 * The default value of the '{@link #getActivite() <em>Activite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivite()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoActionActivite ACTIVITE_EDEFAULT = TypeDictionaryDicoActionActivite.ATT;

	/**
	 * The cached value of the '{@link #getActivite() <em>Activite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivite()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoActionActivite activite = ACTIVITE_EDEFAULT;

	/**
	 * This is true if the Activite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean activiteESet;

	/**
	 * The default value of the '{@link #getSousActivite() <em>Sous Activite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSousActivite()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoActionSousActivite SOUS_ACTIVITE_EDEFAULT = TypeDictionaryDicoActionSousActivite.ADVANC;

	/**
	 * The cached value of the '{@link #getSousActivite() <em>Sous Activite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSousActivite()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoActionSousActivite sousActivite = SOUS_ACTIVITE_EDEFAULT;

	/**
	 * This is true if the Sous Activite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sousActiviteESet;

	/**
	 * The cached value of the '{@link #getAPourCaracteristiquesActionASAeniActionASAeni() <em>APour Caracteristiques Action AS Aeni Action AS Aeni</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCaracteristiquesActionASAeniActionASAeni()
	 * @generated
	 * @ordered
	 */
	protected TypeActionASAeni aPourCaracteristiquesActionASAeniActionASAeni;

	/**
	 * The cached value of the '{@link #getAPourCaracteristiquesAction3DeniAction3Deni() <em>APour Caracteristiques Action3 Deni Action3 Deni</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCaracteristiquesAction3DeniAction3Deni()
	 * @generated
	 * @ordered
	 */
	protected TypeAction3Deni aPourCaracteristiquesAction3DeniAction3Deni;

	/**
	 * The cached value of the '{@link #getAPourCaracteristiquesActionGenieENIActionGenieENI() <em>APour Caracteristiques Action Genie ENI Action Genie ENI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCaracteristiquesActionGenieENIActionGenieENI()
	 * @generated
	 * @ordered
	 */
	protected TypeActionGenieENI aPourCaracteristiquesActionGenieENIActionGenieENI;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAutreActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAutreAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoActionActivite getActivite() {
		return activite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivite(TypeDictionaryDicoActionActivite newActivite) {
		TypeDictionaryDicoActionActivite oldActivite = activite;
		activite = newActivite == null ? ACTIVITE_EDEFAULT : newActivite;
		boolean oldActiviteESet = activiteESet;
		activiteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AUTRE_ACTION__ACTIVITE, oldActivite, activite, !oldActiviteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetActivite() {
		TypeDictionaryDicoActionActivite oldActivite = activite;
		boolean oldActiviteESet = activiteESet;
		activite = ACTIVITE_EDEFAULT;
		activiteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_AUTRE_ACTION__ACTIVITE, oldActivite, ACTIVITE_EDEFAULT, oldActiviteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActivite() {
		return activiteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoActionSousActivite getSousActivite() {
		return sousActivite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSousActivite(TypeDictionaryDicoActionSousActivite newSousActivite) {
		TypeDictionaryDicoActionSousActivite oldSousActivite = sousActivite;
		sousActivite = newSousActivite == null ? SOUS_ACTIVITE_EDEFAULT : newSousActivite;
		boolean oldSousActiviteESet = sousActiviteESet;
		sousActiviteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AUTRE_ACTION__SOUS_ACTIVITE, oldSousActivite, sousActivite, !oldSousActiviteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSousActivite() {
		TypeDictionaryDicoActionSousActivite oldSousActivite = sousActivite;
		boolean oldSousActiviteESet = sousActiviteESet;
		sousActivite = SOUS_ACTIVITE_EDEFAULT;
		sousActiviteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_AUTRE_ACTION__SOUS_ACTIVITE, oldSousActivite, SOUS_ACTIVITE_EDEFAULT, oldSousActiviteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSousActivite() {
		return sousActiviteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeActionASAeni getAPourCaracteristiquesActionASAeniActionASAeni() {
		return aPourCaracteristiquesActionASAeniActionASAeni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourCaracteristiquesActionASAeniActionASAeni(TypeActionASAeni newAPourCaracteristiquesActionASAeniActionASAeni, NotificationChain msgs) {
		TypeActionASAeni oldAPourCaracteristiquesActionASAeniActionASAeni = aPourCaracteristiquesActionASAeniActionASAeni;
		aPourCaracteristiquesActionASAeniActionASAeni = newAPourCaracteristiquesActionASAeniActionASAeni;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AUTRE_ACTION__APOUR_CARACTERISTIQUES_ACTION_AS_AENI_ACTION_AS_AENI, oldAPourCaracteristiquesActionASAeniActionASAeni, newAPourCaracteristiquesActionASAeniActionASAeni);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourCaracteristiquesActionASAeniActionASAeni(TypeActionASAeni newAPourCaracteristiquesActionASAeniActionASAeni) {
		if (newAPourCaracteristiquesActionASAeniActionASAeni != aPourCaracteristiquesActionASAeniActionASAeni) {
			NotificationChain msgs = null;
			if (aPourCaracteristiquesActionASAeniActionASAeni != null)
				msgs = ((InternalEObject)aPourCaracteristiquesActionASAeniActionASAeni).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_AUTRE_ACTION__APOUR_CARACTERISTIQUES_ACTION_AS_AENI_ACTION_AS_AENI, null, msgs);
			if (newAPourCaracteristiquesActionASAeniActionASAeni != null)
				msgs = ((InternalEObject)newAPourCaracteristiquesActionASAeniActionASAeni).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_AUTRE_ACTION__APOUR_CARACTERISTIQUES_ACTION_AS_AENI_ACTION_AS_AENI, null, msgs);
			msgs = basicSetAPourCaracteristiquesActionASAeniActionASAeni(newAPourCaracteristiquesActionASAeniActionASAeni, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AUTRE_ACTION__APOUR_CARACTERISTIQUES_ACTION_AS_AENI_ACTION_AS_AENI, newAPourCaracteristiquesActionASAeniActionASAeni, newAPourCaracteristiquesActionASAeniActionASAeni));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAction3Deni getAPourCaracteristiquesAction3DeniAction3Deni() {
		return aPourCaracteristiquesAction3DeniAction3Deni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourCaracteristiquesAction3DeniAction3Deni(TypeAction3Deni newAPourCaracteristiquesAction3DeniAction3Deni, NotificationChain msgs) {
		TypeAction3Deni oldAPourCaracteristiquesAction3DeniAction3Deni = aPourCaracteristiquesAction3DeniAction3Deni;
		aPourCaracteristiquesAction3DeniAction3Deni = newAPourCaracteristiquesAction3DeniAction3Deni;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AUTRE_ACTION__APOUR_CARACTERISTIQUES_ACTION3_DENI_ACTION3_DENI, oldAPourCaracteristiquesAction3DeniAction3Deni, newAPourCaracteristiquesAction3DeniAction3Deni);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourCaracteristiquesAction3DeniAction3Deni(TypeAction3Deni newAPourCaracteristiquesAction3DeniAction3Deni) {
		if (newAPourCaracteristiquesAction3DeniAction3Deni != aPourCaracteristiquesAction3DeniAction3Deni) {
			NotificationChain msgs = null;
			if (aPourCaracteristiquesAction3DeniAction3Deni != null)
				msgs = ((InternalEObject)aPourCaracteristiquesAction3DeniAction3Deni).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_AUTRE_ACTION__APOUR_CARACTERISTIQUES_ACTION3_DENI_ACTION3_DENI, null, msgs);
			if (newAPourCaracteristiquesAction3DeniAction3Deni != null)
				msgs = ((InternalEObject)newAPourCaracteristiquesAction3DeniAction3Deni).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_AUTRE_ACTION__APOUR_CARACTERISTIQUES_ACTION3_DENI_ACTION3_DENI, null, msgs);
			msgs = basicSetAPourCaracteristiquesAction3DeniAction3Deni(newAPourCaracteristiquesAction3DeniAction3Deni, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AUTRE_ACTION__APOUR_CARACTERISTIQUES_ACTION3_DENI_ACTION3_DENI, newAPourCaracteristiquesAction3DeniAction3Deni, newAPourCaracteristiquesAction3DeniAction3Deni));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeActionGenieENI getAPourCaracteristiquesActionGenieENIActionGenieENI() {
		return aPourCaracteristiquesActionGenieENIActionGenieENI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourCaracteristiquesActionGenieENIActionGenieENI(TypeActionGenieENI newAPourCaracteristiquesActionGenieENIActionGenieENI, NotificationChain msgs) {
		TypeActionGenieENI oldAPourCaracteristiquesActionGenieENIActionGenieENI = aPourCaracteristiquesActionGenieENIActionGenieENI;
		aPourCaracteristiquesActionGenieENIActionGenieENI = newAPourCaracteristiquesActionGenieENIActionGenieENI;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AUTRE_ACTION__APOUR_CARACTERISTIQUES_ACTION_GENIE_ENI_ACTION_GENIE_ENI, oldAPourCaracteristiquesActionGenieENIActionGenieENI, newAPourCaracteristiquesActionGenieENIActionGenieENI);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourCaracteristiquesActionGenieENIActionGenieENI(TypeActionGenieENI newAPourCaracteristiquesActionGenieENIActionGenieENI) {
		if (newAPourCaracteristiquesActionGenieENIActionGenieENI != aPourCaracteristiquesActionGenieENIActionGenieENI) {
			NotificationChain msgs = null;
			if (aPourCaracteristiquesActionGenieENIActionGenieENI != null)
				msgs = ((InternalEObject)aPourCaracteristiquesActionGenieENIActionGenieENI).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_AUTRE_ACTION__APOUR_CARACTERISTIQUES_ACTION_GENIE_ENI_ACTION_GENIE_ENI, null, msgs);
			if (newAPourCaracteristiquesActionGenieENIActionGenieENI != null)
				msgs = ((InternalEObject)newAPourCaracteristiquesActionGenieENIActionGenieENI).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_AUTRE_ACTION__APOUR_CARACTERISTIQUES_ACTION_GENIE_ENI_ACTION_GENIE_ENI, null, msgs);
			msgs = basicSetAPourCaracteristiquesActionGenieENIActionGenieENI(newAPourCaracteristiquesActionGenieENIActionGenieENI, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AUTRE_ACTION__APOUR_CARACTERISTIQUES_ACTION_GENIE_ENI_ACTION_GENIE_ENI, newAPourCaracteristiquesActionGenieENIActionGenieENI, newAPourCaracteristiquesActionGenieENIActionGenieENI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_AUTRE_ACTION__APOUR_CARACTERISTIQUES_ACTION_AS_AENI_ACTION_AS_AENI:
				return basicSetAPourCaracteristiquesActionASAeniActionASAeni(null, msgs);
			case SchemaPackage.TYPE_AUTRE_ACTION__APOUR_CARACTERISTIQUES_ACTION3_DENI_ACTION3_DENI:
				return basicSetAPourCaracteristiquesAction3DeniAction3Deni(null, msgs);
			case SchemaPackage.TYPE_AUTRE_ACTION__APOUR_CARACTERISTIQUES_ACTION_GENIE_ENI_ACTION_GENIE_ENI:
				return basicSetAPourCaracteristiquesActionGenieENIActionGenieENI(null, msgs);
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
			case SchemaPackage.TYPE_AUTRE_ACTION__ACTIVITE:
				return getActivite();
			case SchemaPackage.TYPE_AUTRE_ACTION__SOUS_ACTIVITE:
				return getSousActivite();
			case SchemaPackage.TYPE_AUTRE_ACTION__APOUR_CARACTERISTIQUES_ACTION_AS_AENI_ACTION_AS_AENI:
				return getAPourCaracteristiquesActionASAeniActionASAeni();
			case SchemaPackage.TYPE_AUTRE_ACTION__APOUR_CARACTERISTIQUES_ACTION3_DENI_ACTION3_DENI:
				return getAPourCaracteristiquesAction3DeniAction3Deni();
			case SchemaPackage.TYPE_AUTRE_ACTION__APOUR_CARACTERISTIQUES_ACTION_GENIE_ENI_ACTION_GENIE_ENI:
				return getAPourCaracteristiquesActionGenieENIActionGenieENI();
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
			case SchemaPackage.TYPE_AUTRE_ACTION__ACTIVITE:
				setActivite((TypeDictionaryDicoActionActivite)newValue);
				return;
			case SchemaPackage.TYPE_AUTRE_ACTION__SOUS_ACTIVITE:
				setSousActivite((TypeDictionaryDicoActionSousActivite)newValue);
				return;
			case SchemaPackage.TYPE_AUTRE_ACTION__APOUR_CARACTERISTIQUES_ACTION_AS_AENI_ACTION_AS_AENI:
				setAPourCaracteristiquesActionASAeniActionASAeni((TypeActionASAeni)newValue);
				return;
			case SchemaPackage.TYPE_AUTRE_ACTION__APOUR_CARACTERISTIQUES_ACTION3_DENI_ACTION3_DENI:
				setAPourCaracteristiquesAction3DeniAction3Deni((TypeAction3Deni)newValue);
				return;
			case SchemaPackage.TYPE_AUTRE_ACTION__APOUR_CARACTERISTIQUES_ACTION_GENIE_ENI_ACTION_GENIE_ENI:
				setAPourCaracteristiquesActionGenieENIActionGenieENI((TypeActionGenieENI)newValue);
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
			case SchemaPackage.TYPE_AUTRE_ACTION__ACTIVITE:
				unsetActivite();
				return;
			case SchemaPackage.TYPE_AUTRE_ACTION__SOUS_ACTIVITE:
				unsetSousActivite();
				return;
			case SchemaPackage.TYPE_AUTRE_ACTION__APOUR_CARACTERISTIQUES_ACTION_AS_AENI_ACTION_AS_AENI:
				setAPourCaracteristiquesActionASAeniActionASAeni((TypeActionASAeni)null);
				return;
			case SchemaPackage.TYPE_AUTRE_ACTION__APOUR_CARACTERISTIQUES_ACTION3_DENI_ACTION3_DENI:
				setAPourCaracteristiquesAction3DeniAction3Deni((TypeAction3Deni)null);
				return;
			case SchemaPackage.TYPE_AUTRE_ACTION__APOUR_CARACTERISTIQUES_ACTION_GENIE_ENI_ACTION_GENIE_ENI:
				setAPourCaracteristiquesActionGenieENIActionGenieENI((TypeActionGenieENI)null);
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
			case SchemaPackage.TYPE_AUTRE_ACTION__ACTIVITE:
				return isSetActivite();
			case SchemaPackage.TYPE_AUTRE_ACTION__SOUS_ACTIVITE:
				return isSetSousActivite();
			case SchemaPackage.TYPE_AUTRE_ACTION__APOUR_CARACTERISTIQUES_ACTION_AS_AENI_ACTION_AS_AENI:
				return aPourCaracteristiquesActionASAeniActionASAeni != null;
			case SchemaPackage.TYPE_AUTRE_ACTION__APOUR_CARACTERISTIQUES_ACTION3_DENI_ACTION3_DENI:
				return aPourCaracteristiquesAction3DeniAction3Deni != null;
			case SchemaPackage.TYPE_AUTRE_ACTION__APOUR_CARACTERISTIQUES_ACTION_GENIE_ENI_ACTION_GENIE_ENI:
				return aPourCaracteristiquesActionGenieENIActionGenieENI != null;
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
		result.append(" (activite: ");
		if (activiteESet) result.append(activite); else result.append("<unset>");
		result.append(", sousActivite: ");
		if (sousActiviteESet) result.append(sousActivite); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeAutreActionImpl
