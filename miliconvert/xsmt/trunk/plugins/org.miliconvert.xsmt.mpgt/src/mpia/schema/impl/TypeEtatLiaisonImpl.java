/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeDebitTransmission;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoConfidentialiteOTAN;
import mpia.schema.TypeDictionaryDicoEtatLiaisonCategorie;
import mpia.schema.TypeDictionaryDicoEtatLiaisonMarquageSpecial;
import mpia.schema.TypeDictionaryDicoEtatLiaisonTypeTraffic;
import mpia.schema.TypeDictionaryDicoFrequenceBandeFrequence;
import mpia.schema.TypeDictionaryDicoReseauTelecommunicationNiveauQualite;
import mpia.schema.TypeDictionaryDicoThreeStates;
import mpia.schema.TypeEtatLiaison;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Etat Liaison</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEtatLiaisonImpl#getEnPanne <em>En Panne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatLiaisonImpl#getEtat <em>Etat</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatLiaisonImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatLiaisonImpl#getTypeTraffic <em>Type Traffic</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatLiaisonImpl#getDebitMax <em>Debit Max</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatLiaisonImpl#getClassificationOTAN <em>Classification OTAN</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatLiaisonImpl#getMarquageSpecial <em>Marquage Special</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatLiaisonImpl#getBandeFrequence <em>Bande Frequence</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatLiaisonImpl#getQuantiteEquipement <em>Quantite Equipement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatLiaisonImpl#isAffichagePanne <em>Affichage Panne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatLiaisonImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatLiaisonImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatLiaisonImpl#getEstRapporteParRapport <em>Est Rapporte Par Rapport</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEtatLiaisonImpl extends EObjectImpl implements TypeEtatLiaison {
	/**
	 * The default value of the '{@link #getEnPanne() <em>En Panne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnPanne()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoThreeStates EN_PANNE_EDEFAULT = TypeDictionaryDicoThreeStates.YES;

	/**
	 * The cached value of the '{@link #getEnPanne() <em>En Panne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnPanne()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoThreeStates enPanne = EN_PANNE_EDEFAULT;

	/**
	 * This is true if the En Panne attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean enPanneESet;

	/**
	 * The default value of the '{@link #getEtat() <em>Etat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtat()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoReseauTelecommunicationNiveauQualite ETAT_EDEFAULT = TypeDictionaryDicoReseauTelecommunicationNiveauQualite.GREEN;

	/**
	 * The cached value of the '{@link #getEtat() <em>Etat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtat()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoReseauTelecommunicationNiveauQualite etat = ETAT_EDEFAULT;

	/**
	 * This is true if the Etat attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean etatESet;

	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatLiaisonCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoEtatLiaisonCategorie.CBL;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatLiaisonCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getTypeTraffic() <em>Type Traffic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeTraffic()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatLiaisonTypeTraffic TYPE_TRAFFIC_EDEFAULT = TypeDictionaryDicoEtatLiaisonTypeTraffic.DATA;

	/**
	 * The cached value of the '{@link #getTypeTraffic() <em>Type Traffic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeTraffic()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatLiaisonTypeTraffic typeTraffic = TYPE_TRAFFIC_EDEFAULT;

	/**
	 * This is true if the Type Traffic attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeTrafficESet;

	/**
	 * The cached value of the '{@link #getDebitMax() <em>Debit Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebitMax()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDebitTransmission debitMax;

	/**
	 * The default value of the '{@link #getClassificationOTAN() <em>Classification OTAN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationOTAN()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoConfidentialiteOTAN CLASSIFICATION_OTAN_EDEFAULT = TypeDictionaryDicoConfidentialiteOTAN.NU;

	/**
	 * The cached value of the '{@link #getClassificationOTAN() <em>Classification OTAN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationOTAN()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoConfidentialiteOTAN classificationOTAN = CLASSIFICATION_OTAN_EDEFAULT;

	/**
	 * This is true if the Classification OTAN attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean classificationOTANESet;

	/**
	 * The default value of the '{@link #getMarquageSpecial() <em>Marquage Special</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarquageSpecial()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatLiaisonMarquageSpecial MARQUAGE_SPECIAL_EDEFAULT = TypeDictionaryDicoEtatLiaisonMarquageSpecial.ATOMAL;

	/**
	 * The cached value of the '{@link #getMarquageSpecial() <em>Marquage Special</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarquageSpecial()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatLiaisonMarquageSpecial marquageSpecial = MARQUAGE_SPECIAL_EDEFAULT;

	/**
	 * This is true if the Marquage Special attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean marquageSpecialESet;

	/**
	 * The default value of the '{@link #getBandeFrequence() <em>Bande Frequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandeFrequence()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoFrequenceBandeFrequence BANDE_FREQUENCE_EDEFAULT = TypeDictionaryDicoFrequenceBandeFrequence.EHF;

	/**
	 * The cached value of the '{@link #getBandeFrequence() <em>Bande Frequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandeFrequence()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoFrequenceBandeFrequence bandeFrequence = BANDE_FREQUENCE_EDEFAULT;

	/**
	 * This is true if the Bande Frequence attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bandeFrequenceESet;

	/**
	 * The default value of the '{@link #getQuantiteEquipement() <em>Quantite Equipement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteEquipement()
	 * @generated
	 * @ordered
	 */
	protected static final long QUANTITE_EQUIPEMENT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getQuantiteEquipement() <em>Quantite Equipement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteEquipement()
	 * @generated
	 * @ordered
	 */
	protected long quantiteEquipement = QUANTITE_EQUIPEMENT_EDEFAULT;

	/**
	 * This is true if the Quantite Equipement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quantiteEquipementESet;

	/**
	 * The default value of the '{@link #isAffichagePanne() <em>Affichage Panne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAffichagePanne()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AFFICHAGE_PANNE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAffichagePanne() <em>Affichage Panne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAffichagePanne()
	 * @generated
	 * @ordered
	 */
	protected boolean affichagePanne = AFFICHAGE_PANNE_EDEFAULT;

	/**
	 * This is true if the Affichage Panne attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean affichagePanneESet;

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
	 * The cached value of the '{@link #getEstRapporteParRapport() <em>Est Rapporte Par Rapport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstRapporteParRapport()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation estRapporteParRapport;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEtatLiaisonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEtatLiaison();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoThreeStates getEnPanne() {
		return enPanne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnPanne(TypeDictionaryDicoThreeStates newEnPanne) {
		TypeDictionaryDicoThreeStates oldEnPanne = enPanne;
		enPanne = newEnPanne == null ? EN_PANNE_EDEFAULT : newEnPanne;
		boolean oldEnPanneESet = enPanneESet;
		enPanneESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_LIAISON__EN_PANNE, oldEnPanne, enPanne, !oldEnPanneESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEnPanne() {
		TypeDictionaryDicoThreeStates oldEnPanne = enPanne;
		boolean oldEnPanneESet = enPanneESet;
		enPanne = EN_PANNE_EDEFAULT;
		enPanneESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_LIAISON__EN_PANNE, oldEnPanne, EN_PANNE_EDEFAULT, oldEnPanneESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEnPanne() {
		return enPanneESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoReseauTelecommunicationNiveauQualite getEtat() {
		return etat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtat(TypeDictionaryDicoReseauTelecommunicationNiveauQualite newEtat) {
		TypeDictionaryDicoReseauTelecommunicationNiveauQualite oldEtat = etat;
		etat = newEtat == null ? ETAT_EDEFAULT : newEtat;
		boolean oldEtatESet = etatESet;
		etatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_LIAISON__ETAT, oldEtat, etat, !oldEtatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEtat() {
		TypeDictionaryDicoReseauTelecommunicationNiveauQualite oldEtat = etat;
		boolean oldEtatESet = etatESet;
		etat = ETAT_EDEFAULT;
		etatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_LIAISON__ETAT, oldEtat, ETAT_EDEFAULT, oldEtatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEtat() {
		return etatESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatLiaisonCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoEtatLiaisonCategorie newCategorie) {
		TypeDictionaryDicoEtatLiaisonCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_LIAISON__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoEtatLiaisonCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_LIAISON__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeDictionaryDicoEtatLiaisonTypeTraffic getTypeTraffic() {
		return typeTraffic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeTraffic(TypeDictionaryDicoEtatLiaisonTypeTraffic newTypeTraffic) {
		TypeDictionaryDicoEtatLiaisonTypeTraffic oldTypeTraffic = typeTraffic;
		typeTraffic = newTypeTraffic == null ? TYPE_TRAFFIC_EDEFAULT : newTypeTraffic;
		boolean oldTypeTrafficESet = typeTrafficESet;
		typeTrafficESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_LIAISON__TYPE_TRAFFIC, oldTypeTraffic, typeTraffic, !oldTypeTrafficESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeTraffic() {
		TypeDictionaryDicoEtatLiaisonTypeTraffic oldTypeTraffic = typeTraffic;
		boolean oldTypeTrafficESet = typeTrafficESet;
		typeTraffic = TYPE_TRAFFIC_EDEFAULT;
		typeTrafficESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_LIAISON__TYPE_TRAFFIC, oldTypeTraffic, TYPE_TRAFFIC_EDEFAULT, oldTypeTrafficESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeTraffic() {
		return typeTrafficESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDebitTransmission getDebitMax() {
		return debitMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDebitMax(TypeDataTypeDebitTransmission newDebitMax, NotificationChain msgs) {
		TypeDataTypeDebitTransmission oldDebitMax = debitMax;
		debitMax = newDebitMax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_LIAISON__DEBIT_MAX, oldDebitMax, newDebitMax);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebitMax(TypeDataTypeDebitTransmission newDebitMax) {
		if (newDebitMax != debitMax) {
			NotificationChain msgs = null;
			if (debitMax != null)
				msgs = ((InternalEObject)debitMax).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_LIAISON__DEBIT_MAX, null, msgs);
			if (newDebitMax != null)
				msgs = ((InternalEObject)newDebitMax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_LIAISON__DEBIT_MAX, null, msgs);
			msgs = basicSetDebitMax(newDebitMax, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_LIAISON__DEBIT_MAX, newDebitMax, newDebitMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoConfidentialiteOTAN getClassificationOTAN() {
		return classificationOTAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassificationOTAN(TypeDictionaryDicoConfidentialiteOTAN newClassificationOTAN) {
		TypeDictionaryDicoConfidentialiteOTAN oldClassificationOTAN = classificationOTAN;
		classificationOTAN = newClassificationOTAN == null ? CLASSIFICATION_OTAN_EDEFAULT : newClassificationOTAN;
		boolean oldClassificationOTANESet = classificationOTANESet;
		classificationOTANESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_LIAISON__CLASSIFICATION_OTAN, oldClassificationOTAN, classificationOTAN, !oldClassificationOTANESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClassificationOTAN() {
		TypeDictionaryDicoConfidentialiteOTAN oldClassificationOTAN = classificationOTAN;
		boolean oldClassificationOTANESet = classificationOTANESet;
		classificationOTAN = CLASSIFICATION_OTAN_EDEFAULT;
		classificationOTANESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_LIAISON__CLASSIFICATION_OTAN, oldClassificationOTAN, CLASSIFICATION_OTAN_EDEFAULT, oldClassificationOTANESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClassificationOTAN() {
		return classificationOTANESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatLiaisonMarquageSpecial getMarquageSpecial() {
		return marquageSpecial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarquageSpecial(TypeDictionaryDicoEtatLiaisonMarquageSpecial newMarquageSpecial) {
		TypeDictionaryDicoEtatLiaisonMarquageSpecial oldMarquageSpecial = marquageSpecial;
		marquageSpecial = newMarquageSpecial == null ? MARQUAGE_SPECIAL_EDEFAULT : newMarquageSpecial;
		boolean oldMarquageSpecialESet = marquageSpecialESet;
		marquageSpecialESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_LIAISON__MARQUAGE_SPECIAL, oldMarquageSpecial, marquageSpecial, !oldMarquageSpecialESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMarquageSpecial() {
		TypeDictionaryDicoEtatLiaisonMarquageSpecial oldMarquageSpecial = marquageSpecial;
		boolean oldMarquageSpecialESet = marquageSpecialESet;
		marquageSpecial = MARQUAGE_SPECIAL_EDEFAULT;
		marquageSpecialESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_LIAISON__MARQUAGE_SPECIAL, oldMarquageSpecial, MARQUAGE_SPECIAL_EDEFAULT, oldMarquageSpecialESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMarquageSpecial() {
		return marquageSpecialESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoFrequenceBandeFrequence getBandeFrequence() {
		return bandeFrequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBandeFrequence(TypeDictionaryDicoFrequenceBandeFrequence newBandeFrequence) {
		TypeDictionaryDicoFrequenceBandeFrequence oldBandeFrequence = bandeFrequence;
		bandeFrequence = newBandeFrequence == null ? BANDE_FREQUENCE_EDEFAULT : newBandeFrequence;
		boolean oldBandeFrequenceESet = bandeFrequenceESet;
		bandeFrequenceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_LIAISON__BANDE_FREQUENCE, oldBandeFrequence, bandeFrequence, !oldBandeFrequenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBandeFrequence() {
		TypeDictionaryDicoFrequenceBandeFrequence oldBandeFrequence = bandeFrequence;
		boolean oldBandeFrequenceESet = bandeFrequenceESet;
		bandeFrequence = BANDE_FREQUENCE_EDEFAULT;
		bandeFrequenceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_LIAISON__BANDE_FREQUENCE, oldBandeFrequence, BANDE_FREQUENCE_EDEFAULT, oldBandeFrequenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBandeFrequence() {
		return bandeFrequenceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getQuantiteEquipement() {
		return quantiteEquipement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantiteEquipement(long newQuantiteEquipement) {
		long oldQuantiteEquipement = quantiteEquipement;
		quantiteEquipement = newQuantiteEquipement;
		boolean oldQuantiteEquipementESet = quantiteEquipementESet;
		quantiteEquipementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_LIAISON__QUANTITE_EQUIPEMENT, oldQuantiteEquipement, quantiteEquipement, !oldQuantiteEquipementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuantiteEquipement() {
		long oldQuantiteEquipement = quantiteEquipement;
		boolean oldQuantiteEquipementESet = quantiteEquipementESet;
		quantiteEquipement = QUANTITE_EQUIPEMENT_EDEFAULT;
		quantiteEquipementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_LIAISON__QUANTITE_EQUIPEMENT, oldQuantiteEquipement, QUANTITE_EQUIPEMENT_EDEFAULT, oldQuantiteEquipementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuantiteEquipement() {
		return quantiteEquipementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAffichagePanne() {
		return affichagePanne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAffichagePanne(boolean newAffichagePanne) {
		boolean oldAffichagePanne = affichagePanne;
		affichagePanne = newAffichagePanne;
		boolean oldAffichagePanneESet = affichagePanneESet;
		affichagePanneESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_LIAISON__AFFICHAGE_PANNE, oldAffichagePanne, affichagePanne, !oldAffichagePanneESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAffichagePanne() {
		boolean oldAffichagePanne = affichagePanne;
		boolean oldAffichagePanneESet = affichagePanneESet;
		affichagePanne = AFFICHAGE_PANNE_EDEFAULT;
		affichagePanneESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_LIAISON__AFFICHAGE_PANNE, oldAffichagePanne, AFFICHAGE_PANNE_EDEFAULT, oldAffichagePanneESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAffichagePanne() {
		return affichagePanneESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_LIAISON__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_LIAISON__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getEstRapporteParRapport() {
		return estRapporteParRapport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstRapporteParRapport(TypeAssociation newEstRapporteParRapport, NotificationChain msgs) {
		TypeAssociation oldEstRapporteParRapport = estRapporteParRapport;
		estRapporteParRapport = newEstRapporteParRapport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_LIAISON__EST_RAPPORTE_PAR_RAPPORT, oldEstRapporteParRapport, newEstRapporteParRapport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstRapporteParRapport(TypeAssociation newEstRapporteParRapport) {
		if (newEstRapporteParRapport != estRapporteParRapport) {
			NotificationChain msgs = null;
			if (estRapporteParRapport != null)
				msgs = ((InternalEObject)estRapporteParRapport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_LIAISON__EST_RAPPORTE_PAR_RAPPORT, null, msgs);
			if (newEstRapporteParRapport != null)
				msgs = ((InternalEObject)newEstRapporteParRapport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_LIAISON__EST_RAPPORTE_PAR_RAPPORT, null, msgs);
			msgs = basicSetEstRapporteParRapport(newEstRapporteParRapport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_LIAISON__EST_RAPPORTE_PAR_RAPPORT, newEstRapporteParRapport, newEstRapporteParRapport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ETAT_LIAISON__DEBIT_MAX:
				return basicSetDebitMax(null, msgs);
			case SchemaPackage.TYPE_ETAT_LIAISON__EST_RAPPORTE_PAR_RAPPORT:
				return basicSetEstRapporteParRapport(null, msgs);
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
			case SchemaPackage.TYPE_ETAT_LIAISON__EN_PANNE:
				return getEnPanne();
			case SchemaPackage.TYPE_ETAT_LIAISON__ETAT:
				return getEtat();
			case SchemaPackage.TYPE_ETAT_LIAISON__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ETAT_LIAISON__TYPE_TRAFFIC:
				return getTypeTraffic();
			case SchemaPackage.TYPE_ETAT_LIAISON__DEBIT_MAX:
				return getDebitMax();
			case SchemaPackage.TYPE_ETAT_LIAISON__CLASSIFICATION_OTAN:
				return getClassificationOTAN();
			case SchemaPackage.TYPE_ETAT_LIAISON__MARQUAGE_SPECIAL:
				return getMarquageSpecial();
			case SchemaPackage.TYPE_ETAT_LIAISON__BANDE_FREQUENCE:
				return getBandeFrequence();
			case SchemaPackage.TYPE_ETAT_LIAISON__QUANTITE_EQUIPEMENT:
				return new Long(getQuantiteEquipement());
			case SchemaPackage.TYPE_ETAT_LIAISON__AFFICHAGE_PANNE:
				return isAffichagePanne() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_ETAT_LIAISON__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ETAT_LIAISON__CE:
				return getCE();
			case SchemaPackage.TYPE_ETAT_LIAISON__EST_RAPPORTE_PAR_RAPPORT:
				return getEstRapporteParRapport();
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
			case SchemaPackage.TYPE_ETAT_LIAISON__EN_PANNE:
				setEnPanne((TypeDictionaryDicoThreeStates)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_LIAISON__ETAT:
				setEtat((TypeDictionaryDicoReseauTelecommunicationNiveauQualite)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_LIAISON__CATEGORIE:
				setCategorie((TypeDictionaryDicoEtatLiaisonCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_LIAISON__TYPE_TRAFFIC:
				setTypeTraffic((TypeDictionaryDicoEtatLiaisonTypeTraffic)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_LIAISON__DEBIT_MAX:
				setDebitMax((TypeDataTypeDebitTransmission)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_LIAISON__CLASSIFICATION_OTAN:
				setClassificationOTAN((TypeDictionaryDicoConfidentialiteOTAN)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_LIAISON__MARQUAGE_SPECIAL:
				setMarquageSpecial((TypeDictionaryDicoEtatLiaisonMarquageSpecial)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_LIAISON__BANDE_FREQUENCE:
				setBandeFrequence((TypeDictionaryDicoFrequenceBandeFrequence)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_LIAISON__QUANTITE_EQUIPEMENT:
				setQuantiteEquipement(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_ETAT_LIAISON__AFFICHAGE_PANNE:
				setAffichagePanne(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_ETAT_LIAISON__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_LIAISON__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_LIAISON__EST_RAPPORTE_PAR_RAPPORT:
				setEstRapporteParRapport((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ETAT_LIAISON__EN_PANNE:
				unsetEnPanne();
				return;
			case SchemaPackage.TYPE_ETAT_LIAISON__ETAT:
				unsetEtat();
				return;
			case SchemaPackage.TYPE_ETAT_LIAISON__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ETAT_LIAISON__TYPE_TRAFFIC:
				unsetTypeTraffic();
				return;
			case SchemaPackage.TYPE_ETAT_LIAISON__DEBIT_MAX:
				setDebitMax((TypeDataTypeDebitTransmission)null);
				return;
			case SchemaPackage.TYPE_ETAT_LIAISON__CLASSIFICATION_OTAN:
				unsetClassificationOTAN();
				return;
			case SchemaPackage.TYPE_ETAT_LIAISON__MARQUAGE_SPECIAL:
				unsetMarquageSpecial();
				return;
			case SchemaPackage.TYPE_ETAT_LIAISON__BANDE_FREQUENCE:
				unsetBandeFrequence();
				return;
			case SchemaPackage.TYPE_ETAT_LIAISON__QUANTITE_EQUIPEMENT:
				unsetQuantiteEquipement();
				return;
			case SchemaPackage.TYPE_ETAT_LIAISON__AFFICHAGE_PANNE:
				unsetAffichagePanne();
				return;
			case SchemaPackage.TYPE_ETAT_LIAISON__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ETAT_LIAISON__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ETAT_LIAISON__EST_RAPPORTE_PAR_RAPPORT:
				setEstRapporteParRapport((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ETAT_LIAISON__EN_PANNE:
				return isSetEnPanne();
			case SchemaPackage.TYPE_ETAT_LIAISON__ETAT:
				return isSetEtat();
			case SchemaPackage.TYPE_ETAT_LIAISON__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ETAT_LIAISON__TYPE_TRAFFIC:
				return isSetTypeTraffic();
			case SchemaPackage.TYPE_ETAT_LIAISON__DEBIT_MAX:
				return debitMax != null;
			case SchemaPackage.TYPE_ETAT_LIAISON__CLASSIFICATION_OTAN:
				return isSetClassificationOTAN();
			case SchemaPackage.TYPE_ETAT_LIAISON__MARQUAGE_SPECIAL:
				return isSetMarquageSpecial();
			case SchemaPackage.TYPE_ETAT_LIAISON__BANDE_FREQUENCE:
				return isSetBandeFrequence();
			case SchemaPackage.TYPE_ETAT_LIAISON__QUANTITE_EQUIPEMENT:
				return isSetQuantiteEquipement();
			case SchemaPackage.TYPE_ETAT_LIAISON__AFFICHAGE_PANNE:
				return isSetAffichagePanne();
			case SchemaPackage.TYPE_ETAT_LIAISON__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ETAT_LIAISON__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ETAT_LIAISON__EST_RAPPORTE_PAR_RAPPORT:
				return estRapporteParRapport != null;
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
		result.append(" (enPanne: ");
		if (enPanneESet) result.append(enPanne); else result.append("<unset>");
		result.append(", etat: ");
		if (etatESet) result.append(etat); else result.append("<unset>");
		result.append(", categorie: ");
		if (categorieESet) result.append(categorie); else result.append("<unset>");
		result.append(", typeTraffic: ");
		if (typeTrafficESet) result.append(typeTraffic); else result.append("<unset>");
		result.append(", classificationOTAN: ");
		if (classificationOTANESet) result.append(classificationOTAN); else result.append("<unset>");
		result.append(", marquageSpecial: ");
		if (marquageSpecialESet) result.append(marquageSpecial); else result.append("<unset>");
		result.append(", bandeFrequence: ");
		if (bandeFrequenceESet) result.append(bandeFrequence); else result.append("<unset>");
		result.append(", quantiteEquipement: ");
		if (quantiteEquipementESet) result.append(quantiteEquipement); else result.append("<unset>");
		result.append(", affichagePanne: ");
		if (affichagePanneESet) result.append(affichagePanne); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeEtatLiaisonImpl
