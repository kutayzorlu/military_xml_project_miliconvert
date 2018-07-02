/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoMenaceDetectionNatureDetection;
import mpia.schema.TypeDictionaryDicoMenaceDetectionTypeCapteur;
import mpia.schema.TypeMenaceDetection;

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
 * An implementation of the model object '<em><b>Type Menace Detection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMenaceDetectionImpl#getTypeCapteur <em>Type Capteur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMenaceDetectionImpl#getTypeCapteurNonRepertorie <em>Type Capteur Non Repertorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMenaceDetectionImpl#getNatureDetection <em>Nature Detection</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMenaceDetectionImpl#getNatureDetectionNonRepertoriee <em>Nature Detection Non Repertoriee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMenaceDetectionImpl#getNombreCapteurs <em>Nombre Capteurs</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMenaceDetectionImpl#getComplementEventuel <em>Complement Eventuel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMenaceDetectionImpl#getAPourZoneCouvertureAutreElementControle <em>APour Zone Couverture Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMenaceDetectionImpl#getAPourZoneDeploiementAutreElementControle <em>APour Zone Deploiement Autre Element Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMenaceDetectionImpl extends TypeMenaceImpl implements TypeMenaceDetection {
	/**
	 * The default value of the '{@link #getTypeCapteur() <em>Type Capteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCapteur()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMenaceDetectionTypeCapteur TYPE_CAPTEUR_EDEFAULT = TypeDictionaryDicoMenaceDetectionTypeCapteur.SUAV;

	/**
	 * The cached value of the '{@link #getTypeCapteur() <em>Type Capteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCapteur()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMenaceDetectionTypeCapteur typeCapteur = TYPE_CAPTEUR_EDEFAULT;

	/**
	 * This is true if the Type Capteur attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeCapteurESet;

	/**
	 * The default value of the '{@link #getTypeCapteurNonRepertorie() <em>Type Capteur Non Repertorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCapteurNonRepertorie()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_CAPTEUR_NON_REPERTORIE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeCapteurNonRepertorie() <em>Type Capteur Non Repertorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCapteurNonRepertorie()
	 * @generated
	 * @ordered
	 */
	protected String typeCapteurNonRepertorie = TYPE_CAPTEUR_NON_REPERTORIE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNatureDetection() <em>Nature Detection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatureDetection()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMenaceDetectionNatureDetection NATURE_DETECTION_EDEFAULT = TypeDictionaryDicoMenaceDetectionNatureDetection.IR;

	/**
	 * The cached value of the '{@link #getNatureDetection() <em>Nature Detection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatureDetection()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMenaceDetectionNatureDetection natureDetection = NATURE_DETECTION_EDEFAULT;

	/**
	 * This is true if the Nature Detection attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean natureDetectionESet;

	/**
	 * The default value of the '{@link #getNatureDetectionNonRepertoriee() <em>Nature Detection Non Repertoriee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatureDetectionNonRepertoriee()
	 * @generated
	 * @ordered
	 */
	protected static final String NATURE_DETECTION_NON_REPERTORIEE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNatureDetectionNonRepertoriee() <em>Nature Detection Non Repertoriee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatureDetectionNonRepertoriee()
	 * @generated
	 * @ordered
	 */
	protected String natureDetectionNonRepertoriee = NATURE_DETECTION_NON_REPERTORIEE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNombreCapteurs() <em>Nombre Capteurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreCapteurs()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_CAPTEURS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreCapteurs() <em>Nombre Capteurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreCapteurs()
	 * @generated
	 * @ordered
	 */
	protected long nombreCapteurs = NOMBRE_CAPTEURS_EDEFAULT;

	/**
	 * This is true if the Nombre Capteurs attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreCapteursESet;

	/**
	 * The default value of the '{@link #getComplementEventuel() <em>Complement Eventuel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplementEventuel()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPLEMENT_EVENTUEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComplementEventuel() <em>Complement Eventuel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplementEventuel()
	 * @generated
	 * @ordered
	 */
	protected String complementEventuel = COMPLEMENT_EVENTUEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAPourZoneCouvertureAutreElementControle() <em>APour Zone Couverture Autre Element Controle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourZoneCouvertureAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourZoneCouvertureAutreElementControle;

	/**
	 * The cached value of the '{@link #getAPourZoneDeploiementAutreElementControle() <em>APour Zone Deploiement Autre Element Controle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourZoneDeploiementAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourZoneDeploiementAutreElementControle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMenaceDetectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMenaceDetection();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMenaceDetectionTypeCapteur getTypeCapteur() {
		return typeCapteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeCapteur(TypeDictionaryDicoMenaceDetectionTypeCapteur newTypeCapteur) {
		TypeDictionaryDicoMenaceDetectionTypeCapteur oldTypeCapteur = typeCapteur;
		typeCapteur = newTypeCapteur == null ? TYPE_CAPTEUR_EDEFAULT : newTypeCapteur;
		boolean oldTypeCapteurESet = typeCapteurESet;
		typeCapteurESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MENACE_DETECTION__TYPE_CAPTEUR, oldTypeCapteur, typeCapteur, !oldTypeCapteurESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeCapteur() {
		TypeDictionaryDicoMenaceDetectionTypeCapteur oldTypeCapteur = typeCapteur;
		boolean oldTypeCapteurESet = typeCapteurESet;
		typeCapteur = TYPE_CAPTEUR_EDEFAULT;
		typeCapteurESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MENACE_DETECTION__TYPE_CAPTEUR, oldTypeCapteur, TYPE_CAPTEUR_EDEFAULT, oldTypeCapteurESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeCapteur() {
		return typeCapteurESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeCapteurNonRepertorie() {
		return typeCapteurNonRepertorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeCapteurNonRepertorie(String newTypeCapteurNonRepertorie) {
		String oldTypeCapteurNonRepertorie = typeCapteurNonRepertorie;
		typeCapteurNonRepertorie = newTypeCapteurNonRepertorie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MENACE_DETECTION__TYPE_CAPTEUR_NON_REPERTORIE, oldTypeCapteurNonRepertorie, typeCapteurNonRepertorie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMenaceDetectionNatureDetection getNatureDetection() {
		return natureDetection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNatureDetection(TypeDictionaryDicoMenaceDetectionNatureDetection newNatureDetection) {
		TypeDictionaryDicoMenaceDetectionNatureDetection oldNatureDetection = natureDetection;
		natureDetection = newNatureDetection == null ? NATURE_DETECTION_EDEFAULT : newNatureDetection;
		boolean oldNatureDetectionESet = natureDetectionESet;
		natureDetectionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MENACE_DETECTION__NATURE_DETECTION, oldNatureDetection, natureDetection, !oldNatureDetectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNatureDetection() {
		TypeDictionaryDicoMenaceDetectionNatureDetection oldNatureDetection = natureDetection;
		boolean oldNatureDetectionESet = natureDetectionESet;
		natureDetection = NATURE_DETECTION_EDEFAULT;
		natureDetectionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MENACE_DETECTION__NATURE_DETECTION, oldNatureDetection, NATURE_DETECTION_EDEFAULT, oldNatureDetectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNatureDetection() {
		return natureDetectionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNatureDetectionNonRepertoriee() {
		return natureDetectionNonRepertoriee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNatureDetectionNonRepertoriee(String newNatureDetectionNonRepertoriee) {
		String oldNatureDetectionNonRepertoriee = natureDetectionNonRepertoriee;
		natureDetectionNonRepertoriee = newNatureDetectionNonRepertoriee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MENACE_DETECTION__NATURE_DETECTION_NON_REPERTORIEE, oldNatureDetectionNonRepertoriee, natureDetectionNonRepertoriee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreCapteurs() {
		return nombreCapteurs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreCapteurs(long newNombreCapteurs) {
		long oldNombreCapteurs = nombreCapteurs;
		nombreCapteurs = newNombreCapteurs;
		boolean oldNombreCapteursESet = nombreCapteursESet;
		nombreCapteursESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MENACE_DETECTION__NOMBRE_CAPTEURS, oldNombreCapteurs, nombreCapteurs, !oldNombreCapteursESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreCapteurs() {
		long oldNombreCapteurs = nombreCapteurs;
		boolean oldNombreCapteursESet = nombreCapteursESet;
		nombreCapteurs = NOMBRE_CAPTEURS_EDEFAULT;
		nombreCapteursESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MENACE_DETECTION__NOMBRE_CAPTEURS, oldNombreCapteurs, NOMBRE_CAPTEURS_EDEFAULT, oldNombreCapteursESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreCapteurs() {
		return nombreCapteursESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComplementEventuel() {
		return complementEventuel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplementEventuel(String newComplementEventuel) {
		String oldComplementEventuel = complementEventuel;
		complementEventuel = newComplementEventuel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MENACE_DETECTION__COMPLEMENT_EVENTUEL, oldComplementEventuel, complementEventuel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourZoneCouvertureAutreElementControle() {
		if (aPourZoneCouvertureAutreElementControle == null) {
			aPourZoneCouvertureAutreElementControle = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MENACE_DETECTION__APOUR_ZONE_COUVERTURE_AUTRE_ELEMENT_CONTROLE);
		}
		return aPourZoneCouvertureAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourZoneDeploiementAutreElementControle() {
		if (aPourZoneDeploiementAutreElementControle == null) {
			aPourZoneDeploiementAutreElementControle = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MENACE_DETECTION__APOUR_ZONE_DEPLOIEMENT_AUTRE_ELEMENT_CONTROLE);
		}
		return aPourZoneDeploiementAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MENACE_DETECTION__APOUR_ZONE_COUVERTURE_AUTRE_ELEMENT_CONTROLE:
				return ((InternalEList<?>)getAPourZoneCouvertureAutreElementControle()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MENACE_DETECTION__APOUR_ZONE_DEPLOIEMENT_AUTRE_ELEMENT_CONTROLE:
				return ((InternalEList<?>)getAPourZoneDeploiementAutreElementControle()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_MENACE_DETECTION__TYPE_CAPTEUR:
				return getTypeCapteur();
			case SchemaPackage.TYPE_MENACE_DETECTION__TYPE_CAPTEUR_NON_REPERTORIE:
				return getTypeCapteurNonRepertorie();
			case SchemaPackage.TYPE_MENACE_DETECTION__NATURE_DETECTION:
				return getNatureDetection();
			case SchemaPackage.TYPE_MENACE_DETECTION__NATURE_DETECTION_NON_REPERTORIEE:
				return getNatureDetectionNonRepertoriee();
			case SchemaPackage.TYPE_MENACE_DETECTION__NOMBRE_CAPTEURS:
				return new Long(getNombreCapteurs());
			case SchemaPackage.TYPE_MENACE_DETECTION__COMPLEMENT_EVENTUEL:
				return getComplementEventuel();
			case SchemaPackage.TYPE_MENACE_DETECTION__APOUR_ZONE_COUVERTURE_AUTRE_ELEMENT_CONTROLE:
				return getAPourZoneCouvertureAutreElementControle();
			case SchemaPackage.TYPE_MENACE_DETECTION__APOUR_ZONE_DEPLOIEMENT_AUTRE_ELEMENT_CONTROLE:
				return getAPourZoneDeploiementAutreElementControle();
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
			case SchemaPackage.TYPE_MENACE_DETECTION__TYPE_CAPTEUR:
				setTypeCapteur((TypeDictionaryDicoMenaceDetectionTypeCapteur)newValue);
				return;
			case SchemaPackage.TYPE_MENACE_DETECTION__TYPE_CAPTEUR_NON_REPERTORIE:
				setTypeCapteurNonRepertorie((String)newValue);
				return;
			case SchemaPackage.TYPE_MENACE_DETECTION__NATURE_DETECTION:
				setNatureDetection((TypeDictionaryDicoMenaceDetectionNatureDetection)newValue);
				return;
			case SchemaPackage.TYPE_MENACE_DETECTION__NATURE_DETECTION_NON_REPERTORIEE:
				setNatureDetectionNonRepertoriee((String)newValue);
				return;
			case SchemaPackage.TYPE_MENACE_DETECTION__NOMBRE_CAPTEURS:
				setNombreCapteurs(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_MENACE_DETECTION__COMPLEMENT_EVENTUEL:
				setComplementEventuel((String)newValue);
				return;
			case SchemaPackage.TYPE_MENACE_DETECTION__APOUR_ZONE_COUVERTURE_AUTRE_ELEMENT_CONTROLE:
				getAPourZoneCouvertureAutreElementControle().clear();
				getAPourZoneCouvertureAutreElementControle().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MENACE_DETECTION__APOUR_ZONE_DEPLOIEMENT_AUTRE_ELEMENT_CONTROLE:
				getAPourZoneDeploiementAutreElementControle().clear();
				getAPourZoneDeploiementAutreElementControle().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_MENACE_DETECTION__TYPE_CAPTEUR:
				unsetTypeCapteur();
				return;
			case SchemaPackage.TYPE_MENACE_DETECTION__TYPE_CAPTEUR_NON_REPERTORIE:
				setTypeCapteurNonRepertorie(TYPE_CAPTEUR_NON_REPERTORIE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MENACE_DETECTION__NATURE_DETECTION:
				unsetNatureDetection();
				return;
			case SchemaPackage.TYPE_MENACE_DETECTION__NATURE_DETECTION_NON_REPERTORIEE:
				setNatureDetectionNonRepertoriee(NATURE_DETECTION_NON_REPERTORIEE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MENACE_DETECTION__NOMBRE_CAPTEURS:
				unsetNombreCapteurs();
				return;
			case SchemaPackage.TYPE_MENACE_DETECTION__COMPLEMENT_EVENTUEL:
				setComplementEventuel(COMPLEMENT_EVENTUEL_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MENACE_DETECTION__APOUR_ZONE_COUVERTURE_AUTRE_ELEMENT_CONTROLE:
				getAPourZoneCouvertureAutreElementControle().clear();
				return;
			case SchemaPackage.TYPE_MENACE_DETECTION__APOUR_ZONE_DEPLOIEMENT_AUTRE_ELEMENT_CONTROLE:
				getAPourZoneDeploiementAutreElementControle().clear();
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
			case SchemaPackage.TYPE_MENACE_DETECTION__TYPE_CAPTEUR:
				return isSetTypeCapteur();
			case SchemaPackage.TYPE_MENACE_DETECTION__TYPE_CAPTEUR_NON_REPERTORIE:
				return TYPE_CAPTEUR_NON_REPERTORIE_EDEFAULT == null ? typeCapteurNonRepertorie != null : !TYPE_CAPTEUR_NON_REPERTORIE_EDEFAULT.equals(typeCapteurNonRepertorie);
			case SchemaPackage.TYPE_MENACE_DETECTION__NATURE_DETECTION:
				return isSetNatureDetection();
			case SchemaPackage.TYPE_MENACE_DETECTION__NATURE_DETECTION_NON_REPERTORIEE:
				return NATURE_DETECTION_NON_REPERTORIEE_EDEFAULT == null ? natureDetectionNonRepertoriee != null : !NATURE_DETECTION_NON_REPERTORIEE_EDEFAULT.equals(natureDetectionNonRepertoriee);
			case SchemaPackage.TYPE_MENACE_DETECTION__NOMBRE_CAPTEURS:
				return isSetNombreCapteurs();
			case SchemaPackage.TYPE_MENACE_DETECTION__COMPLEMENT_EVENTUEL:
				return COMPLEMENT_EVENTUEL_EDEFAULT == null ? complementEventuel != null : !COMPLEMENT_EVENTUEL_EDEFAULT.equals(complementEventuel);
			case SchemaPackage.TYPE_MENACE_DETECTION__APOUR_ZONE_COUVERTURE_AUTRE_ELEMENT_CONTROLE:
				return aPourZoneCouvertureAutreElementControle != null && !aPourZoneCouvertureAutreElementControle.isEmpty();
			case SchemaPackage.TYPE_MENACE_DETECTION__APOUR_ZONE_DEPLOIEMENT_AUTRE_ELEMENT_CONTROLE:
				return aPourZoneDeploiementAutreElementControle != null && !aPourZoneDeploiementAutreElementControle.isEmpty();
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
		result.append(" (typeCapteur: ");
		if (typeCapteurESet) result.append(typeCapteur); else result.append("<unset>");
		result.append(", typeCapteurNonRepertorie: ");
		result.append(typeCapteurNonRepertorie);
		result.append(", natureDetection: ");
		if (natureDetectionESet) result.append(natureDetection); else result.append("<unset>");
		result.append(", natureDetectionNonRepertoriee: ");
		result.append(natureDetectionNonRepertoriee);
		result.append(", nombreCapteurs: ");
		if (nombreCapteursESet) result.append(nombreCapteurs); else result.append("<unset>");
		result.append(", complementEventuel: ");
		result.append(complementEventuel);
		result.append(')');
		return result.toString();
	}

} //TypeMenaceDetectionImpl
