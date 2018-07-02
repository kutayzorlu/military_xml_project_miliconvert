/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;
import mpia.meta.TypeDataTypeVitesseLineaire;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoAltitude;
import mpia.schema.TypeMoyensENIutilises;

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
 * An implementation of the model object '<em><b>Type Moyens EN Iutilises</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMoyensENIutilisesImpl#getVitesseAeronef <em>Vitesse Aeronef</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyensENIutilisesImpl#getAltitudeAeronef <em>Altitude Aeronef</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyensENIutilisesImpl#getNatureVolumeENI <em>Nature Volume ENI</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyensENIutilisesImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyensENIutilisesImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyensENIutilisesImpl#getUtiliseCommeTypeAeronefTypeAeronef <em>Utilise Comme Type Aeronef Type Aeronef</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyensENIutilisesImpl#getUtiliseCommeArmementOuEquipementTypeMateriel <em>Utilise Comme Armement Ou Equipement Type Materiel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyensENIutilisesImpl#getAPourAxeApprocheAutreElementControle <em>APour Axe Approche Autre Element Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMoyensENIutilisesImpl extends EObjectImpl implements TypeMoyensENIutilises {
	/**
	 * The cached value of the '{@link #getVitesseAeronef() <em>Vitesse Aeronef</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesseAeronef()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeVitesseLineaire vitesseAeronef;

	/**
	 * The default value of the '{@link #getAltitudeAeronef() <em>Altitude Aeronef</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitudeAeronef()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAltitude ALTITUDE_AERONEF_EDEFAULT = TypeDictionaryDicoAltitude.VL;

	/**
	 * The cached value of the '{@link #getAltitudeAeronef() <em>Altitude Aeronef</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitudeAeronef()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAltitude altitudeAeronef = ALTITUDE_AERONEF_EDEFAULT;

	/**
	 * This is true if the Altitude Aeronef attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean altitudeAeronefESet;

	/**
	 * The default value of the '{@link #getNatureVolumeENI() <em>Nature Volume ENI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatureVolumeENI()
	 * @generated
	 * @ordered
	 */
	protected static final String NATURE_VOLUME_ENI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNatureVolumeENI() <em>Nature Volume ENI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatureVolumeENI()
	 * @generated
	 * @ordered
	 */
	protected String natureVolumeENI = NATURE_VOLUME_ENI_EDEFAULT;

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
	 * The cached value of the '{@link #getUtiliseCommeTypeAeronefTypeAeronef() <em>Utilise Comme Type Aeronef Type Aeronef</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtiliseCommeTypeAeronefTypeAeronef()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT utiliseCommeTypeAeronefTypeAeronef;

	/**
	 * The cached value of the '{@link #getUtiliseCommeArmementOuEquipementTypeMateriel() <em>Utilise Comme Armement Ou Equipement Type Materiel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtiliseCommeArmementOuEquipementTypeMateriel()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociationEXT> utiliseCommeArmementOuEquipementTypeMateriel;

	/**
	 * The cached value of the '{@link #getAPourAxeApprocheAutreElementControle() <em>APour Axe Approche Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourAxeApprocheAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourAxeApprocheAutreElementControle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMoyensENIutilisesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMoyensENIutilises();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeVitesseLineaire getVitesseAeronef() {
		return vitesseAeronef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVitesseAeronef(TypeDataTypeVitesseLineaire newVitesseAeronef, NotificationChain msgs) {
		TypeDataTypeVitesseLineaire oldVitesseAeronef = vitesseAeronef;
		vitesseAeronef = newVitesseAeronef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_EN_IUTILISES__VITESSE_AERONEF, oldVitesseAeronef, newVitesseAeronef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVitesseAeronef(TypeDataTypeVitesseLineaire newVitesseAeronef) {
		if (newVitesseAeronef != vitesseAeronef) {
			NotificationChain msgs = null;
			if (vitesseAeronef != null)
				msgs = ((InternalEObject)vitesseAeronef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MOYENS_EN_IUTILISES__VITESSE_AERONEF, null, msgs);
			if (newVitesseAeronef != null)
				msgs = ((InternalEObject)newVitesseAeronef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MOYENS_EN_IUTILISES__VITESSE_AERONEF, null, msgs);
			msgs = basicSetVitesseAeronef(newVitesseAeronef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_EN_IUTILISES__VITESSE_AERONEF, newVitesseAeronef, newVitesseAeronef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAltitude getAltitudeAeronef() {
		return altitudeAeronef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAltitudeAeronef(TypeDictionaryDicoAltitude newAltitudeAeronef) {
		TypeDictionaryDicoAltitude oldAltitudeAeronef = altitudeAeronef;
		altitudeAeronef = newAltitudeAeronef == null ? ALTITUDE_AERONEF_EDEFAULT : newAltitudeAeronef;
		boolean oldAltitudeAeronefESet = altitudeAeronefESet;
		altitudeAeronefESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_EN_IUTILISES__ALTITUDE_AERONEF, oldAltitudeAeronef, altitudeAeronef, !oldAltitudeAeronefESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAltitudeAeronef() {
		TypeDictionaryDicoAltitude oldAltitudeAeronef = altitudeAeronef;
		boolean oldAltitudeAeronefESet = altitudeAeronefESet;
		altitudeAeronef = ALTITUDE_AERONEF_EDEFAULT;
		altitudeAeronefESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MOYENS_EN_IUTILISES__ALTITUDE_AERONEF, oldAltitudeAeronef, ALTITUDE_AERONEF_EDEFAULT, oldAltitudeAeronefESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAltitudeAeronef() {
		return altitudeAeronefESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNatureVolumeENI() {
		return natureVolumeENI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNatureVolumeENI(String newNatureVolumeENI) {
		String oldNatureVolumeENI = natureVolumeENI;
		natureVolumeENI = newNatureVolumeENI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_EN_IUTILISES__NATURE_VOLUME_ENI, oldNatureVolumeENI, natureVolumeENI));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_EN_IUTILISES__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_EN_IUTILISES__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getUtiliseCommeTypeAeronefTypeAeronef() {
		return utiliseCommeTypeAeronefTypeAeronef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUtiliseCommeTypeAeronefTypeAeronef(TypeAssociationEXT newUtiliseCommeTypeAeronefTypeAeronef, NotificationChain msgs) {
		TypeAssociationEXT oldUtiliseCommeTypeAeronefTypeAeronef = utiliseCommeTypeAeronefTypeAeronef;
		utiliseCommeTypeAeronefTypeAeronef = newUtiliseCommeTypeAeronefTypeAeronef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_EN_IUTILISES__UTILISE_COMME_TYPE_AERONEF_TYPE_AERONEF, oldUtiliseCommeTypeAeronefTypeAeronef, newUtiliseCommeTypeAeronefTypeAeronef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUtiliseCommeTypeAeronefTypeAeronef(TypeAssociationEXT newUtiliseCommeTypeAeronefTypeAeronef) {
		if (newUtiliseCommeTypeAeronefTypeAeronef != utiliseCommeTypeAeronefTypeAeronef) {
			NotificationChain msgs = null;
			if (utiliseCommeTypeAeronefTypeAeronef != null)
				msgs = ((InternalEObject)utiliseCommeTypeAeronefTypeAeronef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MOYENS_EN_IUTILISES__UTILISE_COMME_TYPE_AERONEF_TYPE_AERONEF, null, msgs);
			if (newUtiliseCommeTypeAeronefTypeAeronef != null)
				msgs = ((InternalEObject)newUtiliseCommeTypeAeronefTypeAeronef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MOYENS_EN_IUTILISES__UTILISE_COMME_TYPE_AERONEF_TYPE_AERONEF, null, msgs);
			msgs = basicSetUtiliseCommeTypeAeronefTypeAeronef(newUtiliseCommeTypeAeronefTypeAeronef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_EN_IUTILISES__UTILISE_COMME_TYPE_AERONEF_TYPE_AERONEF, newUtiliseCommeTypeAeronefTypeAeronef, newUtiliseCommeTypeAeronefTypeAeronef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEXT> getUtiliseCommeArmementOuEquipementTypeMateriel() {
		if (utiliseCommeArmementOuEquipementTypeMateriel == null) {
			utiliseCommeArmementOuEquipementTypeMateriel = new EObjectContainmentEList<TypeAssociationEXT>(TypeAssociationEXT.class, this, SchemaPackage.TYPE_MOYENS_EN_IUTILISES__UTILISE_COMME_ARMEMENT_OU_EQUIPEMENT_TYPE_MATERIEL);
		}
		return utiliseCommeArmementOuEquipementTypeMateriel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourAxeApprocheAutreElementControle() {
		return aPourAxeApprocheAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourAxeApprocheAutreElementControle(TypeAssociation newAPourAxeApprocheAutreElementControle, NotificationChain msgs) {
		TypeAssociation oldAPourAxeApprocheAutreElementControle = aPourAxeApprocheAutreElementControle;
		aPourAxeApprocheAutreElementControle = newAPourAxeApprocheAutreElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_EN_IUTILISES__APOUR_AXE_APPROCHE_AUTRE_ELEMENT_CONTROLE, oldAPourAxeApprocheAutreElementControle, newAPourAxeApprocheAutreElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourAxeApprocheAutreElementControle(TypeAssociation newAPourAxeApprocheAutreElementControle) {
		if (newAPourAxeApprocheAutreElementControle != aPourAxeApprocheAutreElementControle) {
			NotificationChain msgs = null;
			if (aPourAxeApprocheAutreElementControle != null)
				msgs = ((InternalEObject)aPourAxeApprocheAutreElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MOYENS_EN_IUTILISES__APOUR_AXE_APPROCHE_AUTRE_ELEMENT_CONTROLE, null, msgs);
			if (newAPourAxeApprocheAutreElementControle != null)
				msgs = ((InternalEObject)newAPourAxeApprocheAutreElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MOYENS_EN_IUTILISES__APOUR_AXE_APPROCHE_AUTRE_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetAPourAxeApprocheAutreElementControle(newAPourAxeApprocheAutreElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_EN_IUTILISES__APOUR_AXE_APPROCHE_AUTRE_ELEMENT_CONTROLE, newAPourAxeApprocheAutreElementControle, newAPourAxeApprocheAutreElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MOYENS_EN_IUTILISES__VITESSE_AERONEF:
				return basicSetVitesseAeronef(null, msgs);
			case SchemaPackage.TYPE_MOYENS_EN_IUTILISES__UTILISE_COMME_TYPE_AERONEF_TYPE_AERONEF:
				return basicSetUtiliseCommeTypeAeronefTypeAeronef(null, msgs);
			case SchemaPackage.TYPE_MOYENS_EN_IUTILISES__UTILISE_COMME_ARMEMENT_OU_EQUIPEMENT_TYPE_MATERIEL:
				return ((InternalEList<?>)getUtiliseCommeArmementOuEquipementTypeMateriel()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MOYENS_EN_IUTILISES__APOUR_AXE_APPROCHE_AUTRE_ELEMENT_CONTROLE:
				return basicSetAPourAxeApprocheAutreElementControle(null, msgs);
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
			case SchemaPackage.TYPE_MOYENS_EN_IUTILISES__VITESSE_AERONEF:
				return getVitesseAeronef();
			case SchemaPackage.TYPE_MOYENS_EN_IUTILISES__ALTITUDE_AERONEF:
				return getAltitudeAeronef();
			case SchemaPackage.TYPE_MOYENS_EN_IUTILISES__NATURE_VOLUME_ENI:
				return getNatureVolumeENI();
			case SchemaPackage.TYPE_MOYENS_EN_IUTILISES__CTE:
				return getCTE();
			case SchemaPackage.TYPE_MOYENS_EN_IUTILISES__CE:
				return getCE();
			case SchemaPackage.TYPE_MOYENS_EN_IUTILISES__UTILISE_COMME_TYPE_AERONEF_TYPE_AERONEF:
				return getUtiliseCommeTypeAeronefTypeAeronef();
			case SchemaPackage.TYPE_MOYENS_EN_IUTILISES__UTILISE_COMME_ARMEMENT_OU_EQUIPEMENT_TYPE_MATERIEL:
				return getUtiliseCommeArmementOuEquipementTypeMateriel();
			case SchemaPackage.TYPE_MOYENS_EN_IUTILISES__APOUR_AXE_APPROCHE_AUTRE_ELEMENT_CONTROLE:
				return getAPourAxeApprocheAutreElementControle();
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
			case SchemaPackage.TYPE_MOYENS_EN_IUTILISES__VITESSE_AERONEF:
				setVitesseAeronef((TypeDataTypeVitesseLineaire)newValue);
				return;
			case SchemaPackage.TYPE_MOYENS_EN_IUTILISES__ALTITUDE_AERONEF:
				setAltitudeAeronef((TypeDictionaryDicoAltitude)newValue);
				return;
			case SchemaPackage.TYPE_MOYENS_EN_IUTILISES__NATURE_VOLUME_ENI:
				setNatureVolumeENI((String)newValue);
				return;
			case SchemaPackage.TYPE_MOYENS_EN_IUTILISES__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_MOYENS_EN_IUTILISES__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_MOYENS_EN_IUTILISES__UTILISE_COMME_TYPE_AERONEF_TYPE_AERONEF:
				setUtiliseCommeTypeAeronefTypeAeronef((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_MOYENS_EN_IUTILISES__UTILISE_COMME_ARMEMENT_OU_EQUIPEMENT_TYPE_MATERIEL:
				getUtiliseCommeArmementOuEquipementTypeMateriel().clear();
				getUtiliseCommeArmementOuEquipementTypeMateriel().addAll((Collection<? extends TypeAssociationEXT>)newValue);
				return;
			case SchemaPackage.TYPE_MOYENS_EN_IUTILISES__APOUR_AXE_APPROCHE_AUTRE_ELEMENT_CONTROLE:
				setAPourAxeApprocheAutreElementControle((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_MOYENS_EN_IUTILISES__VITESSE_AERONEF:
				setVitesseAeronef((TypeDataTypeVitesseLineaire)null);
				return;
			case SchemaPackage.TYPE_MOYENS_EN_IUTILISES__ALTITUDE_AERONEF:
				unsetAltitudeAeronef();
				return;
			case SchemaPackage.TYPE_MOYENS_EN_IUTILISES__NATURE_VOLUME_ENI:
				setNatureVolumeENI(NATURE_VOLUME_ENI_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MOYENS_EN_IUTILISES__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MOYENS_EN_IUTILISES__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MOYENS_EN_IUTILISES__UTILISE_COMME_TYPE_AERONEF_TYPE_AERONEF:
				setUtiliseCommeTypeAeronefTypeAeronef((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_MOYENS_EN_IUTILISES__UTILISE_COMME_ARMEMENT_OU_EQUIPEMENT_TYPE_MATERIEL:
				getUtiliseCommeArmementOuEquipementTypeMateriel().clear();
				return;
			case SchemaPackage.TYPE_MOYENS_EN_IUTILISES__APOUR_AXE_APPROCHE_AUTRE_ELEMENT_CONTROLE:
				setAPourAxeApprocheAutreElementControle((TypeAssociation)null);
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
			case SchemaPackage.TYPE_MOYENS_EN_IUTILISES__VITESSE_AERONEF:
				return vitesseAeronef != null;
			case SchemaPackage.TYPE_MOYENS_EN_IUTILISES__ALTITUDE_AERONEF:
				return isSetAltitudeAeronef();
			case SchemaPackage.TYPE_MOYENS_EN_IUTILISES__NATURE_VOLUME_ENI:
				return NATURE_VOLUME_ENI_EDEFAULT == null ? natureVolumeENI != null : !NATURE_VOLUME_ENI_EDEFAULT.equals(natureVolumeENI);
			case SchemaPackage.TYPE_MOYENS_EN_IUTILISES__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_MOYENS_EN_IUTILISES__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_MOYENS_EN_IUTILISES__UTILISE_COMME_TYPE_AERONEF_TYPE_AERONEF:
				return utiliseCommeTypeAeronefTypeAeronef != null;
			case SchemaPackage.TYPE_MOYENS_EN_IUTILISES__UTILISE_COMME_ARMEMENT_OU_EQUIPEMENT_TYPE_MATERIEL:
				return utiliseCommeArmementOuEquipementTypeMateriel != null && !utiliseCommeArmementOuEquipementTypeMateriel.isEmpty();
			case SchemaPackage.TYPE_MOYENS_EN_IUTILISES__APOUR_AXE_APPROCHE_AUTRE_ELEMENT_CONTROLE:
				return aPourAxeApprocheAutreElementControle != null;
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
		result.append(" (altitudeAeronef: ");
		if (altitudeAeronefESet) result.append(altitudeAeronef); else result.append("<unset>");
		result.append(", natureVolumeENI: ");
		result.append(natureVolumeENI);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeMoyensENIutilisesImpl
