/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeLongueur;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoTypeMaterielClasseRavitaillementOTAN;
import mpia.schema.TypeTypeMateriel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Type Materiel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeTypeMaterielImpl#getCodeNNO <em>Code NNO</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeMaterielImpl#getIntituleNNO <em>Intitule NNO</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeMaterielImpl#getCodeEMAT8 <em>Code EMAT8</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeMaterielImpl#getIntituleEMAT8 <em>Intitule EMAT8</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeMaterielImpl#getCodeRIC <em>Code RIC</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeMaterielImpl#getCodeNIC <em>Code NIC</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeMaterielImpl#getClasseRavitaillementOTAN <em>Classe Ravitaillement OTAN</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeMaterielImpl#getConditionnementLongueur <em>Conditionnement Longueur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeMaterielImpl#getConditionnementLargeur <em>Conditionnement Largeur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeMaterielImpl#getConditionnementHauteur <em>Conditionnement Hauteur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeMaterielImpl#getPrimaryService <em>Primary Service</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypeTypeMaterielImpl extends TypeTypeImpl implements TypeTypeMateriel {
	/**
	 * The default value of the '{@link #getCodeNNO() <em>Code NNO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeNNO()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_NNO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeNNO() <em>Code NNO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeNNO()
	 * @generated
	 * @ordered
	 */
	protected String codeNNO = CODE_NNO_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntituleNNO() <em>Intitule NNO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntituleNNO()
	 * @generated
	 * @ordered
	 */
	protected static final String INTITULE_NNO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntituleNNO() <em>Intitule NNO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntituleNNO()
	 * @generated
	 * @ordered
	 */
	protected String intituleNNO = INTITULE_NNO_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeEMAT8() <em>Code EMAT8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeEMAT8()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EMAT8_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeEMAT8() <em>Code EMAT8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeEMAT8()
	 * @generated
	 * @ordered
	 */
	protected String codeEMAT8 = CODE_EMAT8_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntituleEMAT8() <em>Intitule EMAT8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntituleEMAT8()
	 * @generated
	 * @ordered
	 */
	protected static final String INTITULE_EMAT8_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntituleEMAT8() <em>Intitule EMAT8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntituleEMAT8()
	 * @generated
	 * @ordered
	 */
	protected String intituleEMAT8 = INTITULE_EMAT8_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeRIC() <em>Code RIC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeRIC()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_RIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeRIC() <em>Code RIC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeRIC()
	 * @generated
	 * @ordered
	 */
	protected String codeRIC = CODE_RIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeNIC() <em>Code NIC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeNIC()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_NIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeNIC() <em>Code NIC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeNIC()
	 * @generated
	 * @ordered
	 */
	protected String codeNIC = CODE_NIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getClasseRavitaillementOTAN() <em>Classe Ravitaillement OTAN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasseRavitaillementOTAN()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeMaterielClasseRavitaillementOTAN CLASSE_RAVITAILLEMENT_OTAN_EDEFAULT = TypeDictionaryDicoTypeMaterielClasseRavitaillementOTAN.CLS1;

	/**
	 * The cached value of the '{@link #getClasseRavitaillementOTAN() <em>Classe Ravitaillement OTAN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasseRavitaillementOTAN()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeMaterielClasseRavitaillementOTAN classeRavitaillementOTAN = CLASSE_RAVITAILLEMENT_OTAN_EDEFAULT;

	/**
	 * This is true if the Classe Ravitaillement OTAN attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean classeRavitaillementOTANESet;

	/**
	 * The cached value of the '{@link #getConditionnementLongueur() <em>Conditionnement Longueur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionnementLongueur()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur conditionnementLongueur;

	/**
	 * The cached value of the '{@link #getConditionnementLargeur() <em>Conditionnement Largeur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionnementLargeur()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur conditionnementLargeur;

	/**
	 * The cached value of the '{@link #getConditionnementHauteur() <em>Conditionnement Hauteur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionnementHauteur()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur conditionnementHauteur;

	/**
	 * The default value of the '{@link #getPrimaryService() <em>Primary Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryService()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIMARY_SERVICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrimaryService() <em>Primary Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryService()
	 * @generated
	 * @ordered
	 */
	protected String primaryService = PRIMARY_SERVICE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeTypeMaterielImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeTypeMateriel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeNNO() {
		return codeNNO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeNNO(String newCodeNNO) {
		String oldCodeNNO = codeNNO;
		codeNNO = newCodeNNO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_MATERIEL__CODE_NNO, oldCodeNNO, codeNNO));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIntituleNNO() {
		return intituleNNO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntituleNNO(String newIntituleNNO) {
		String oldIntituleNNO = intituleNNO;
		intituleNNO = newIntituleNNO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_MATERIEL__INTITULE_NNO, oldIntituleNNO, intituleNNO));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeEMAT8() {
		return codeEMAT8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeEMAT8(String newCodeEMAT8) {
		String oldCodeEMAT8 = codeEMAT8;
		codeEMAT8 = newCodeEMAT8;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_MATERIEL__CODE_EMAT8, oldCodeEMAT8, codeEMAT8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIntituleEMAT8() {
		return intituleEMAT8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntituleEMAT8(String newIntituleEMAT8) {
		String oldIntituleEMAT8 = intituleEMAT8;
		intituleEMAT8 = newIntituleEMAT8;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_MATERIEL__INTITULE_EMAT8, oldIntituleEMAT8, intituleEMAT8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeRIC() {
		return codeRIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeRIC(String newCodeRIC) {
		String oldCodeRIC = codeRIC;
		codeRIC = newCodeRIC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_MATERIEL__CODE_RIC, oldCodeRIC, codeRIC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeNIC() {
		return codeNIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeNIC(String newCodeNIC) {
		String oldCodeNIC = codeNIC;
		codeNIC = newCodeNIC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_MATERIEL__CODE_NIC, oldCodeNIC, codeNIC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeMaterielClasseRavitaillementOTAN getClasseRavitaillementOTAN() {
		return classeRavitaillementOTAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClasseRavitaillementOTAN(TypeDictionaryDicoTypeMaterielClasseRavitaillementOTAN newClasseRavitaillementOTAN) {
		TypeDictionaryDicoTypeMaterielClasseRavitaillementOTAN oldClasseRavitaillementOTAN = classeRavitaillementOTAN;
		classeRavitaillementOTAN = newClasseRavitaillementOTAN == null ? CLASSE_RAVITAILLEMENT_OTAN_EDEFAULT : newClasseRavitaillementOTAN;
		boolean oldClasseRavitaillementOTANESet = classeRavitaillementOTANESet;
		classeRavitaillementOTANESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_MATERIEL__CLASSE_RAVITAILLEMENT_OTAN, oldClasseRavitaillementOTAN, classeRavitaillementOTAN, !oldClasseRavitaillementOTANESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClasseRavitaillementOTAN() {
		TypeDictionaryDicoTypeMaterielClasseRavitaillementOTAN oldClasseRavitaillementOTAN = classeRavitaillementOTAN;
		boolean oldClasseRavitaillementOTANESet = classeRavitaillementOTANESet;
		classeRavitaillementOTAN = CLASSE_RAVITAILLEMENT_OTAN_EDEFAULT;
		classeRavitaillementOTANESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_MATERIEL__CLASSE_RAVITAILLEMENT_OTAN, oldClasseRavitaillementOTAN, CLASSE_RAVITAILLEMENT_OTAN_EDEFAULT, oldClasseRavitaillementOTANESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClasseRavitaillementOTAN() {
		return classeRavitaillementOTANESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getConditionnementLongueur() {
		return conditionnementLongueur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionnementLongueur(TypeDataTypeLongueur newConditionnementLongueur, NotificationChain msgs) {
		TypeDataTypeLongueur oldConditionnementLongueur = conditionnementLongueur;
		conditionnementLongueur = newConditionnementLongueur;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_MATERIEL__CONDITIONNEMENT_LONGUEUR, oldConditionnementLongueur, newConditionnementLongueur);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionnementLongueur(TypeDataTypeLongueur newConditionnementLongueur) {
		if (newConditionnementLongueur != conditionnementLongueur) {
			NotificationChain msgs = null;
			if (conditionnementLongueur != null)
				msgs = ((InternalEObject)conditionnementLongueur).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_MATERIEL__CONDITIONNEMENT_LONGUEUR, null, msgs);
			if (newConditionnementLongueur != null)
				msgs = ((InternalEObject)newConditionnementLongueur).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_MATERIEL__CONDITIONNEMENT_LONGUEUR, null, msgs);
			msgs = basicSetConditionnementLongueur(newConditionnementLongueur, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_MATERIEL__CONDITIONNEMENT_LONGUEUR, newConditionnementLongueur, newConditionnementLongueur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getConditionnementLargeur() {
		return conditionnementLargeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionnementLargeur(TypeDataTypeLongueur newConditionnementLargeur, NotificationChain msgs) {
		TypeDataTypeLongueur oldConditionnementLargeur = conditionnementLargeur;
		conditionnementLargeur = newConditionnementLargeur;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_MATERIEL__CONDITIONNEMENT_LARGEUR, oldConditionnementLargeur, newConditionnementLargeur);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionnementLargeur(TypeDataTypeLongueur newConditionnementLargeur) {
		if (newConditionnementLargeur != conditionnementLargeur) {
			NotificationChain msgs = null;
			if (conditionnementLargeur != null)
				msgs = ((InternalEObject)conditionnementLargeur).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_MATERIEL__CONDITIONNEMENT_LARGEUR, null, msgs);
			if (newConditionnementLargeur != null)
				msgs = ((InternalEObject)newConditionnementLargeur).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_MATERIEL__CONDITIONNEMENT_LARGEUR, null, msgs);
			msgs = basicSetConditionnementLargeur(newConditionnementLargeur, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_MATERIEL__CONDITIONNEMENT_LARGEUR, newConditionnementLargeur, newConditionnementLargeur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getConditionnementHauteur() {
		return conditionnementHauteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionnementHauteur(TypeDataTypeLongueur newConditionnementHauteur, NotificationChain msgs) {
		TypeDataTypeLongueur oldConditionnementHauteur = conditionnementHauteur;
		conditionnementHauteur = newConditionnementHauteur;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_MATERIEL__CONDITIONNEMENT_HAUTEUR, oldConditionnementHauteur, newConditionnementHauteur);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionnementHauteur(TypeDataTypeLongueur newConditionnementHauteur) {
		if (newConditionnementHauteur != conditionnementHauteur) {
			NotificationChain msgs = null;
			if (conditionnementHauteur != null)
				msgs = ((InternalEObject)conditionnementHauteur).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_MATERIEL__CONDITIONNEMENT_HAUTEUR, null, msgs);
			if (newConditionnementHauteur != null)
				msgs = ((InternalEObject)newConditionnementHauteur).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_MATERIEL__CONDITIONNEMENT_HAUTEUR, null, msgs);
			msgs = basicSetConditionnementHauteur(newConditionnementHauteur, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_MATERIEL__CONDITIONNEMENT_HAUTEUR, newConditionnementHauteur, newConditionnementHauteur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrimaryService() {
		return primaryService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryService(String newPrimaryService) {
		String oldPrimaryService = primaryService;
		primaryService = newPrimaryService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_MATERIEL__PRIMARY_SERVICE, oldPrimaryService, primaryService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_TYPE_MATERIEL__CONDITIONNEMENT_LONGUEUR:
				return basicSetConditionnementLongueur(null, msgs);
			case SchemaPackage.TYPE_TYPE_MATERIEL__CONDITIONNEMENT_LARGEUR:
				return basicSetConditionnementLargeur(null, msgs);
			case SchemaPackage.TYPE_TYPE_MATERIEL__CONDITIONNEMENT_HAUTEUR:
				return basicSetConditionnementHauteur(null, msgs);
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
			case SchemaPackage.TYPE_TYPE_MATERIEL__CODE_NNO:
				return getCodeNNO();
			case SchemaPackage.TYPE_TYPE_MATERIEL__INTITULE_NNO:
				return getIntituleNNO();
			case SchemaPackage.TYPE_TYPE_MATERIEL__CODE_EMAT8:
				return getCodeEMAT8();
			case SchemaPackage.TYPE_TYPE_MATERIEL__INTITULE_EMAT8:
				return getIntituleEMAT8();
			case SchemaPackage.TYPE_TYPE_MATERIEL__CODE_RIC:
				return getCodeRIC();
			case SchemaPackage.TYPE_TYPE_MATERIEL__CODE_NIC:
				return getCodeNIC();
			case SchemaPackage.TYPE_TYPE_MATERIEL__CLASSE_RAVITAILLEMENT_OTAN:
				return getClasseRavitaillementOTAN();
			case SchemaPackage.TYPE_TYPE_MATERIEL__CONDITIONNEMENT_LONGUEUR:
				return getConditionnementLongueur();
			case SchemaPackage.TYPE_TYPE_MATERIEL__CONDITIONNEMENT_LARGEUR:
				return getConditionnementLargeur();
			case SchemaPackage.TYPE_TYPE_MATERIEL__CONDITIONNEMENT_HAUTEUR:
				return getConditionnementHauteur();
			case SchemaPackage.TYPE_TYPE_MATERIEL__PRIMARY_SERVICE:
				return getPrimaryService();
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
			case SchemaPackage.TYPE_TYPE_MATERIEL__CODE_NNO:
				setCodeNNO((String)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_MATERIEL__INTITULE_NNO:
				setIntituleNNO((String)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_MATERIEL__CODE_EMAT8:
				setCodeEMAT8((String)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_MATERIEL__INTITULE_EMAT8:
				setIntituleEMAT8((String)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_MATERIEL__CODE_RIC:
				setCodeRIC((String)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_MATERIEL__CODE_NIC:
				setCodeNIC((String)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_MATERIEL__CLASSE_RAVITAILLEMENT_OTAN:
				setClasseRavitaillementOTAN((TypeDictionaryDicoTypeMaterielClasseRavitaillementOTAN)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_MATERIEL__CONDITIONNEMENT_LONGUEUR:
				setConditionnementLongueur((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_MATERIEL__CONDITIONNEMENT_LARGEUR:
				setConditionnementLargeur((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_MATERIEL__CONDITIONNEMENT_HAUTEUR:
				setConditionnementHauteur((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_MATERIEL__PRIMARY_SERVICE:
				setPrimaryService((String)newValue);
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
			case SchemaPackage.TYPE_TYPE_MATERIEL__CODE_NNO:
				setCodeNNO(CODE_NNO_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TYPE_MATERIEL__INTITULE_NNO:
				setIntituleNNO(INTITULE_NNO_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TYPE_MATERIEL__CODE_EMAT8:
				setCodeEMAT8(CODE_EMAT8_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TYPE_MATERIEL__INTITULE_EMAT8:
				setIntituleEMAT8(INTITULE_EMAT8_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TYPE_MATERIEL__CODE_RIC:
				setCodeRIC(CODE_RIC_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TYPE_MATERIEL__CODE_NIC:
				setCodeNIC(CODE_NIC_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TYPE_MATERIEL__CLASSE_RAVITAILLEMENT_OTAN:
				unsetClasseRavitaillementOTAN();
				return;
			case SchemaPackage.TYPE_TYPE_MATERIEL__CONDITIONNEMENT_LONGUEUR:
				setConditionnementLongueur((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_TYPE_MATERIEL__CONDITIONNEMENT_LARGEUR:
				setConditionnementLargeur((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_TYPE_MATERIEL__CONDITIONNEMENT_HAUTEUR:
				setConditionnementHauteur((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_TYPE_MATERIEL__PRIMARY_SERVICE:
				setPrimaryService(PRIMARY_SERVICE_EDEFAULT);
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
			case SchemaPackage.TYPE_TYPE_MATERIEL__CODE_NNO:
				return CODE_NNO_EDEFAULT == null ? codeNNO != null : !CODE_NNO_EDEFAULT.equals(codeNNO);
			case SchemaPackage.TYPE_TYPE_MATERIEL__INTITULE_NNO:
				return INTITULE_NNO_EDEFAULT == null ? intituleNNO != null : !INTITULE_NNO_EDEFAULT.equals(intituleNNO);
			case SchemaPackage.TYPE_TYPE_MATERIEL__CODE_EMAT8:
				return CODE_EMAT8_EDEFAULT == null ? codeEMAT8 != null : !CODE_EMAT8_EDEFAULT.equals(codeEMAT8);
			case SchemaPackage.TYPE_TYPE_MATERIEL__INTITULE_EMAT8:
				return INTITULE_EMAT8_EDEFAULT == null ? intituleEMAT8 != null : !INTITULE_EMAT8_EDEFAULT.equals(intituleEMAT8);
			case SchemaPackage.TYPE_TYPE_MATERIEL__CODE_RIC:
				return CODE_RIC_EDEFAULT == null ? codeRIC != null : !CODE_RIC_EDEFAULT.equals(codeRIC);
			case SchemaPackage.TYPE_TYPE_MATERIEL__CODE_NIC:
				return CODE_NIC_EDEFAULT == null ? codeNIC != null : !CODE_NIC_EDEFAULT.equals(codeNIC);
			case SchemaPackage.TYPE_TYPE_MATERIEL__CLASSE_RAVITAILLEMENT_OTAN:
				return isSetClasseRavitaillementOTAN();
			case SchemaPackage.TYPE_TYPE_MATERIEL__CONDITIONNEMENT_LONGUEUR:
				return conditionnementLongueur != null;
			case SchemaPackage.TYPE_TYPE_MATERIEL__CONDITIONNEMENT_LARGEUR:
				return conditionnementLargeur != null;
			case SchemaPackage.TYPE_TYPE_MATERIEL__CONDITIONNEMENT_HAUTEUR:
				return conditionnementHauteur != null;
			case SchemaPackage.TYPE_TYPE_MATERIEL__PRIMARY_SERVICE:
				return PRIMARY_SERVICE_EDEFAULT == null ? primaryService != null : !PRIMARY_SERVICE_EDEFAULT.equals(primaryService);
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
		result.append(" (codeNNO: ");
		result.append(codeNNO);
		result.append(", intituleNNO: ");
		result.append(intituleNNO);
		result.append(", codeEMAT8: ");
		result.append(codeEMAT8);
		result.append(", intituleEMAT8: ");
		result.append(intituleEMAT8);
		result.append(", codeRIC: ");
		result.append(codeRIC);
		result.append(", codeNIC: ");
		result.append(codeNIC);
		result.append(", classeRavitaillementOTAN: ");
		if (classeRavitaillementOTANESet) result.append(classeRavitaillementOTAN); else result.append("<unset>");
		result.append(", primaryService: ");
		result.append(primaryService);
		result.append(')');
		return result.toString();
	}

} //TypeTypeMaterielImpl
