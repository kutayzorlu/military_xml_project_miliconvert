/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoConfidentialiteOTAN;
import mpia.schema.TypeDictionaryDicoEtatLiaisonMarquageSpecial;
import mpia.schema.TypeDictionaryDicoEtatSicEtatSystemeCommunication;
import mpia.schema.TypeDictionaryDicoEtatSicTypeSystemeCommunication;
import mpia.schema.TypeDictionaryDicoRapportConfirmation;
import mpia.schema.TypeEtatSic;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Etat Sic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEtatSicImpl#getConfirmation <em>Confirmation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatSicImpl#getTypeSystemeCommunication <em>Type Systeme Communication</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatSicImpl#getNomDuReseau <em>Nom Du Reseau</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatSicImpl#getEtatSystemeCommunication <em>Etat Systeme Communication</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatSicImpl#getClassificationNato <em>Classification Nato</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatSicImpl#getMarquageSpecial <em>Marquage Special</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatSicImpl#getTypeSystemeSecurite <em>Type Systeme Securite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatSicImpl#isOperationnel <em>Operationnel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatSicImpl#getNbAbonnesPermanents <em>Nb Abonnes Permanents</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatSicImpl#getNbAbonnesTemporaires <em>Nb Abonnes Temporaires</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatSicImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatSicImpl#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEtatSicImpl extends EObjectImpl implements TypeEtatSic {
	/**
	 * The default value of the '{@link #getConfirmation() <em>Confirmation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfirmation()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoRapportConfirmation CONFIRMATION_EDEFAULT = TypeDictionaryDicoRapportConfirmation.ASS;

	/**
	 * The cached value of the '{@link #getConfirmation() <em>Confirmation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfirmation()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoRapportConfirmation confirmation = CONFIRMATION_EDEFAULT;

	/**
	 * This is true if the Confirmation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean confirmationESet;

	/**
	 * The default value of the '{@link #getTypeSystemeCommunication() <em>Type Systeme Communication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeSystemeCommunication()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatSicTypeSystemeCommunication TYPE_SYSTEME_COMMUNICATION_EDEFAULT = TypeDictionaryDicoEtatSicTypeSystemeCommunication.AAVN;

	/**
	 * The cached value of the '{@link #getTypeSystemeCommunication() <em>Type Systeme Communication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeSystemeCommunication()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatSicTypeSystemeCommunication typeSystemeCommunication = TYPE_SYSTEME_COMMUNICATION_EDEFAULT;

	/**
	 * This is true if the Type Systeme Communication attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeSystemeCommunicationESet;

	/**
	 * The default value of the '{@link #getNomDuReseau() <em>Nom Du Reseau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomDuReseau()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_DU_RESEAU_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomDuReseau() <em>Nom Du Reseau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomDuReseau()
	 * @generated
	 * @ordered
	 */
	protected String nomDuReseau = NOM_DU_RESEAU_EDEFAULT;

	/**
	 * The default value of the '{@link #getEtatSystemeCommunication() <em>Etat Systeme Communication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatSystemeCommunication()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatSicEtatSystemeCommunication ETAT_SYSTEME_COMMUNICATION_EDEFAULT = TypeDictionaryDicoEtatSicEtatSystemeCommunication.IRUPT;

	/**
	 * The cached value of the '{@link #getEtatSystemeCommunication() <em>Etat Systeme Communication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatSystemeCommunication()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatSicEtatSystemeCommunication etatSystemeCommunication = ETAT_SYSTEME_COMMUNICATION_EDEFAULT;

	/**
	 * This is true if the Etat Systeme Communication attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean etatSystemeCommunicationESet;

	/**
	 * The default value of the '{@link #getClassificationNato() <em>Classification Nato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationNato()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoConfidentialiteOTAN CLASSIFICATION_NATO_EDEFAULT = TypeDictionaryDicoConfidentialiteOTAN.NU;

	/**
	 * The cached value of the '{@link #getClassificationNato() <em>Classification Nato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationNato()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoConfidentialiteOTAN classificationNato = CLASSIFICATION_NATO_EDEFAULT;

	/**
	 * This is true if the Classification Nato attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean classificationNatoESet;

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
	 * The default value of the '{@link #getTypeSystemeSecurite() <em>Type Systeme Securite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeSystemeSecurite()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_SYSTEME_SECURITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeSystemeSecurite() <em>Type Systeme Securite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeSystemeSecurite()
	 * @generated
	 * @ordered
	 */
	protected String typeSystemeSecurite = TYPE_SYSTEME_SECURITE_EDEFAULT;

	/**
	 * The default value of the '{@link #isOperationnel() <em>Operationnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOperationnel()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPERATIONNEL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOperationnel() <em>Operationnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOperationnel()
	 * @generated
	 * @ordered
	 */
	protected boolean operationnel = OPERATIONNEL_EDEFAULT;

	/**
	 * This is true if the Operationnel attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean operationnelESet;

	/**
	 * The default value of the '{@link #getNbAbonnesPermanents() <em>Nb Abonnes Permanents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbAbonnesPermanents()
	 * @generated
	 * @ordered
	 */
	protected static final long NB_ABONNES_PERMANENTS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNbAbonnesPermanents() <em>Nb Abonnes Permanents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbAbonnesPermanents()
	 * @generated
	 * @ordered
	 */
	protected long nbAbonnesPermanents = NB_ABONNES_PERMANENTS_EDEFAULT;

	/**
	 * This is true if the Nb Abonnes Permanents attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nbAbonnesPermanentsESet;

	/**
	 * The default value of the '{@link #getNbAbonnesTemporaires() <em>Nb Abonnes Temporaires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbAbonnesTemporaires()
	 * @generated
	 * @ordered
	 */
	protected static final long NB_ABONNES_TEMPORAIRES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNbAbonnesTemporaires() <em>Nb Abonnes Temporaires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbAbonnesTemporaires()
	 * @generated
	 * @ordered
	 */
	protected long nbAbonnesTemporaires = NB_ABONNES_TEMPORAIRES_EDEFAULT;

	/**
	 * This is true if the Nb Abonnes Temporaires attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nbAbonnesTemporairesESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEtatSicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEtatSic();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoRapportConfirmation getConfirmation() {
		return confirmation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfirmation(TypeDictionaryDicoRapportConfirmation newConfirmation) {
		TypeDictionaryDicoRapportConfirmation oldConfirmation = confirmation;
		confirmation = newConfirmation == null ? CONFIRMATION_EDEFAULT : newConfirmation;
		boolean oldConfirmationESet = confirmationESet;
		confirmationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_SIC__CONFIRMATION, oldConfirmation, confirmation, !oldConfirmationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConfirmation() {
		TypeDictionaryDicoRapportConfirmation oldConfirmation = confirmation;
		boolean oldConfirmationESet = confirmationESet;
		confirmation = CONFIRMATION_EDEFAULT;
		confirmationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_SIC__CONFIRMATION, oldConfirmation, CONFIRMATION_EDEFAULT, oldConfirmationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConfirmation() {
		return confirmationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatSicTypeSystemeCommunication getTypeSystemeCommunication() {
		return typeSystemeCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeSystemeCommunication(TypeDictionaryDicoEtatSicTypeSystemeCommunication newTypeSystemeCommunication) {
		TypeDictionaryDicoEtatSicTypeSystemeCommunication oldTypeSystemeCommunication = typeSystemeCommunication;
		typeSystemeCommunication = newTypeSystemeCommunication == null ? TYPE_SYSTEME_COMMUNICATION_EDEFAULT : newTypeSystemeCommunication;
		boolean oldTypeSystemeCommunicationESet = typeSystemeCommunicationESet;
		typeSystemeCommunicationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_SIC__TYPE_SYSTEME_COMMUNICATION, oldTypeSystemeCommunication, typeSystemeCommunication, !oldTypeSystemeCommunicationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeSystemeCommunication() {
		TypeDictionaryDicoEtatSicTypeSystemeCommunication oldTypeSystemeCommunication = typeSystemeCommunication;
		boolean oldTypeSystemeCommunicationESet = typeSystemeCommunicationESet;
		typeSystemeCommunication = TYPE_SYSTEME_COMMUNICATION_EDEFAULT;
		typeSystemeCommunicationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_SIC__TYPE_SYSTEME_COMMUNICATION, oldTypeSystemeCommunication, TYPE_SYSTEME_COMMUNICATION_EDEFAULT, oldTypeSystemeCommunicationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeSystemeCommunication() {
		return typeSystemeCommunicationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomDuReseau() {
		return nomDuReseau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomDuReseau(String newNomDuReseau) {
		String oldNomDuReseau = nomDuReseau;
		nomDuReseau = newNomDuReseau;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_SIC__NOM_DU_RESEAU, oldNomDuReseau, nomDuReseau));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatSicEtatSystemeCommunication getEtatSystemeCommunication() {
		return etatSystemeCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatSystemeCommunication(TypeDictionaryDicoEtatSicEtatSystemeCommunication newEtatSystemeCommunication) {
		TypeDictionaryDicoEtatSicEtatSystemeCommunication oldEtatSystemeCommunication = etatSystemeCommunication;
		etatSystemeCommunication = newEtatSystemeCommunication == null ? ETAT_SYSTEME_COMMUNICATION_EDEFAULT : newEtatSystemeCommunication;
		boolean oldEtatSystemeCommunicationESet = etatSystemeCommunicationESet;
		etatSystemeCommunicationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_SIC__ETAT_SYSTEME_COMMUNICATION, oldEtatSystemeCommunication, etatSystemeCommunication, !oldEtatSystemeCommunicationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEtatSystemeCommunication() {
		TypeDictionaryDicoEtatSicEtatSystemeCommunication oldEtatSystemeCommunication = etatSystemeCommunication;
		boolean oldEtatSystemeCommunicationESet = etatSystemeCommunicationESet;
		etatSystemeCommunication = ETAT_SYSTEME_COMMUNICATION_EDEFAULT;
		etatSystemeCommunicationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_SIC__ETAT_SYSTEME_COMMUNICATION, oldEtatSystemeCommunication, ETAT_SYSTEME_COMMUNICATION_EDEFAULT, oldEtatSystemeCommunicationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEtatSystemeCommunication() {
		return etatSystemeCommunicationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoConfidentialiteOTAN getClassificationNato() {
		return classificationNato;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassificationNato(TypeDictionaryDicoConfidentialiteOTAN newClassificationNato) {
		TypeDictionaryDicoConfidentialiteOTAN oldClassificationNato = classificationNato;
		classificationNato = newClassificationNato == null ? CLASSIFICATION_NATO_EDEFAULT : newClassificationNato;
		boolean oldClassificationNatoESet = classificationNatoESet;
		classificationNatoESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_SIC__CLASSIFICATION_NATO, oldClassificationNato, classificationNato, !oldClassificationNatoESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClassificationNato() {
		TypeDictionaryDicoConfidentialiteOTAN oldClassificationNato = classificationNato;
		boolean oldClassificationNatoESet = classificationNatoESet;
		classificationNato = CLASSIFICATION_NATO_EDEFAULT;
		classificationNatoESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_SIC__CLASSIFICATION_NATO, oldClassificationNato, CLASSIFICATION_NATO_EDEFAULT, oldClassificationNatoESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClassificationNato() {
		return classificationNatoESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_SIC__MARQUAGE_SPECIAL, oldMarquageSpecial, marquageSpecial, !oldMarquageSpecialESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_SIC__MARQUAGE_SPECIAL, oldMarquageSpecial, MARQUAGE_SPECIAL_EDEFAULT, oldMarquageSpecialESet));
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
	public String getTypeSystemeSecurite() {
		return typeSystemeSecurite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeSystemeSecurite(String newTypeSystemeSecurite) {
		String oldTypeSystemeSecurite = typeSystemeSecurite;
		typeSystemeSecurite = newTypeSystemeSecurite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_SIC__TYPE_SYSTEME_SECURITE, oldTypeSystemeSecurite, typeSystemeSecurite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOperationnel() {
		return operationnel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationnel(boolean newOperationnel) {
		boolean oldOperationnel = operationnel;
		operationnel = newOperationnel;
		boolean oldOperationnelESet = operationnelESet;
		operationnelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_SIC__OPERATIONNEL, oldOperationnel, operationnel, !oldOperationnelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOperationnel() {
		boolean oldOperationnel = operationnel;
		boolean oldOperationnelESet = operationnelESet;
		operationnel = OPERATIONNEL_EDEFAULT;
		operationnelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_SIC__OPERATIONNEL, oldOperationnel, OPERATIONNEL_EDEFAULT, oldOperationnelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOperationnel() {
		return operationnelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNbAbonnesPermanents() {
		return nbAbonnesPermanents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbAbonnesPermanents(long newNbAbonnesPermanents) {
		long oldNbAbonnesPermanents = nbAbonnesPermanents;
		nbAbonnesPermanents = newNbAbonnesPermanents;
		boolean oldNbAbonnesPermanentsESet = nbAbonnesPermanentsESet;
		nbAbonnesPermanentsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_SIC__NB_ABONNES_PERMANENTS, oldNbAbonnesPermanents, nbAbonnesPermanents, !oldNbAbonnesPermanentsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNbAbonnesPermanents() {
		long oldNbAbonnesPermanents = nbAbonnesPermanents;
		boolean oldNbAbonnesPermanentsESet = nbAbonnesPermanentsESet;
		nbAbonnesPermanents = NB_ABONNES_PERMANENTS_EDEFAULT;
		nbAbonnesPermanentsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_SIC__NB_ABONNES_PERMANENTS, oldNbAbonnesPermanents, NB_ABONNES_PERMANENTS_EDEFAULT, oldNbAbonnesPermanentsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNbAbonnesPermanents() {
		return nbAbonnesPermanentsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNbAbonnesTemporaires() {
		return nbAbonnesTemporaires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbAbonnesTemporaires(long newNbAbonnesTemporaires) {
		long oldNbAbonnesTemporaires = nbAbonnesTemporaires;
		nbAbonnesTemporaires = newNbAbonnesTemporaires;
		boolean oldNbAbonnesTemporairesESet = nbAbonnesTemporairesESet;
		nbAbonnesTemporairesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_SIC__NB_ABONNES_TEMPORAIRES, oldNbAbonnesTemporaires, nbAbonnesTemporaires, !oldNbAbonnesTemporairesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNbAbonnesTemporaires() {
		long oldNbAbonnesTemporaires = nbAbonnesTemporaires;
		boolean oldNbAbonnesTemporairesESet = nbAbonnesTemporairesESet;
		nbAbonnesTemporaires = NB_ABONNES_TEMPORAIRES_EDEFAULT;
		nbAbonnesTemporairesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_SIC__NB_ABONNES_TEMPORAIRES, oldNbAbonnesTemporaires, NB_ABONNES_TEMPORAIRES_EDEFAULT, oldNbAbonnesTemporairesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNbAbonnesTemporaires() {
		return nbAbonnesTemporairesESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_SIC__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_SIC__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_ETAT_SIC__CONFIRMATION:
				return getConfirmation();
			case SchemaPackage.TYPE_ETAT_SIC__TYPE_SYSTEME_COMMUNICATION:
				return getTypeSystemeCommunication();
			case SchemaPackage.TYPE_ETAT_SIC__NOM_DU_RESEAU:
				return getNomDuReseau();
			case SchemaPackage.TYPE_ETAT_SIC__ETAT_SYSTEME_COMMUNICATION:
				return getEtatSystemeCommunication();
			case SchemaPackage.TYPE_ETAT_SIC__CLASSIFICATION_NATO:
				return getClassificationNato();
			case SchemaPackage.TYPE_ETAT_SIC__MARQUAGE_SPECIAL:
				return getMarquageSpecial();
			case SchemaPackage.TYPE_ETAT_SIC__TYPE_SYSTEME_SECURITE:
				return getTypeSystemeSecurite();
			case SchemaPackage.TYPE_ETAT_SIC__OPERATIONNEL:
				return isOperationnel() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_ETAT_SIC__NB_ABONNES_PERMANENTS:
				return new Long(getNbAbonnesPermanents());
			case SchemaPackage.TYPE_ETAT_SIC__NB_ABONNES_TEMPORAIRES:
				return new Long(getNbAbonnesTemporaires());
			case SchemaPackage.TYPE_ETAT_SIC__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ETAT_SIC__CE:
				return getCE();
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
			case SchemaPackage.TYPE_ETAT_SIC__CONFIRMATION:
				setConfirmation((TypeDictionaryDicoRapportConfirmation)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_SIC__TYPE_SYSTEME_COMMUNICATION:
				setTypeSystemeCommunication((TypeDictionaryDicoEtatSicTypeSystemeCommunication)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_SIC__NOM_DU_RESEAU:
				setNomDuReseau((String)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_SIC__ETAT_SYSTEME_COMMUNICATION:
				setEtatSystemeCommunication((TypeDictionaryDicoEtatSicEtatSystemeCommunication)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_SIC__CLASSIFICATION_NATO:
				setClassificationNato((TypeDictionaryDicoConfidentialiteOTAN)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_SIC__MARQUAGE_SPECIAL:
				setMarquageSpecial((TypeDictionaryDicoEtatLiaisonMarquageSpecial)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_SIC__TYPE_SYSTEME_SECURITE:
				setTypeSystemeSecurite((String)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_SIC__OPERATIONNEL:
				setOperationnel(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_ETAT_SIC__NB_ABONNES_PERMANENTS:
				setNbAbonnesPermanents(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_ETAT_SIC__NB_ABONNES_TEMPORAIRES:
				setNbAbonnesTemporaires(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_ETAT_SIC__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_SIC__CE:
				setCE((String)newValue);
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
			case SchemaPackage.TYPE_ETAT_SIC__CONFIRMATION:
				unsetConfirmation();
				return;
			case SchemaPackage.TYPE_ETAT_SIC__TYPE_SYSTEME_COMMUNICATION:
				unsetTypeSystemeCommunication();
				return;
			case SchemaPackage.TYPE_ETAT_SIC__NOM_DU_RESEAU:
				setNomDuReseau(NOM_DU_RESEAU_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ETAT_SIC__ETAT_SYSTEME_COMMUNICATION:
				unsetEtatSystemeCommunication();
				return;
			case SchemaPackage.TYPE_ETAT_SIC__CLASSIFICATION_NATO:
				unsetClassificationNato();
				return;
			case SchemaPackage.TYPE_ETAT_SIC__MARQUAGE_SPECIAL:
				unsetMarquageSpecial();
				return;
			case SchemaPackage.TYPE_ETAT_SIC__TYPE_SYSTEME_SECURITE:
				setTypeSystemeSecurite(TYPE_SYSTEME_SECURITE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ETAT_SIC__OPERATIONNEL:
				unsetOperationnel();
				return;
			case SchemaPackage.TYPE_ETAT_SIC__NB_ABONNES_PERMANENTS:
				unsetNbAbonnesPermanents();
				return;
			case SchemaPackage.TYPE_ETAT_SIC__NB_ABONNES_TEMPORAIRES:
				unsetNbAbonnesTemporaires();
				return;
			case SchemaPackage.TYPE_ETAT_SIC__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ETAT_SIC__CE:
				setCE(CE_EDEFAULT);
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
			case SchemaPackage.TYPE_ETAT_SIC__CONFIRMATION:
				return isSetConfirmation();
			case SchemaPackage.TYPE_ETAT_SIC__TYPE_SYSTEME_COMMUNICATION:
				return isSetTypeSystemeCommunication();
			case SchemaPackage.TYPE_ETAT_SIC__NOM_DU_RESEAU:
				return NOM_DU_RESEAU_EDEFAULT == null ? nomDuReseau != null : !NOM_DU_RESEAU_EDEFAULT.equals(nomDuReseau);
			case SchemaPackage.TYPE_ETAT_SIC__ETAT_SYSTEME_COMMUNICATION:
				return isSetEtatSystemeCommunication();
			case SchemaPackage.TYPE_ETAT_SIC__CLASSIFICATION_NATO:
				return isSetClassificationNato();
			case SchemaPackage.TYPE_ETAT_SIC__MARQUAGE_SPECIAL:
				return isSetMarquageSpecial();
			case SchemaPackage.TYPE_ETAT_SIC__TYPE_SYSTEME_SECURITE:
				return TYPE_SYSTEME_SECURITE_EDEFAULT == null ? typeSystemeSecurite != null : !TYPE_SYSTEME_SECURITE_EDEFAULT.equals(typeSystemeSecurite);
			case SchemaPackage.TYPE_ETAT_SIC__OPERATIONNEL:
				return isSetOperationnel();
			case SchemaPackage.TYPE_ETAT_SIC__NB_ABONNES_PERMANENTS:
				return isSetNbAbonnesPermanents();
			case SchemaPackage.TYPE_ETAT_SIC__NB_ABONNES_TEMPORAIRES:
				return isSetNbAbonnesTemporaires();
			case SchemaPackage.TYPE_ETAT_SIC__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ETAT_SIC__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
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
		result.append(" (confirmation: ");
		if (confirmationESet) result.append(confirmation); else result.append("<unset>");
		result.append(", typeSystemeCommunication: ");
		if (typeSystemeCommunicationESet) result.append(typeSystemeCommunication); else result.append("<unset>");
		result.append(", nomDuReseau: ");
		result.append(nomDuReseau);
		result.append(", etatSystemeCommunication: ");
		if (etatSystemeCommunicationESet) result.append(etatSystemeCommunication); else result.append("<unset>");
		result.append(", classificationNato: ");
		if (classificationNatoESet) result.append(classificationNato); else result.append("<unset>");
		result.append(", marquageSpecial: ");
		if (marquageSpecialESet) result.append(marquageSpecial); else result.append("<unset>");
		result.append(", typeSystemeSecurite: ");
		result.append(typeSystemeSecurite);
		result.append(", operationnel: ");
		if (operationnelESet) result.append(operationnel); else result.append("<unset>");
		result.append(", nbAbonnesPermanents: ");
		if (nbAbonnesPermanentsESet) result.append(nbAbonnesPermanents); else result.append("<unset>");
		result.append(", nbAbonnesTemporaires: ");
		if (nbAbonnesTemporairesESet) result.append(nbAbonnesTemporaires); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeEtatSicImpl
