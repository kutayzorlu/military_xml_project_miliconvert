/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeLongueur;
import mpia.meta.TypeDataTypeVitesseLineaire;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCheminFer;
import mpia.schema.TypeDictionaryDicoCheminFerEcartement;
import mpia.schema.TypeDictionaryDicoCheminFerEfficaciteSignalisation;
import mpia.schema.TypeDictionaryDicoCheminFerSystemeSignalisation;
import mpia.schema.TypeDictionaryDicoCheminFerTypeEnergie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Chemin Fer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCheminFerImpl#getNombreMaxTrain <em>Nombre Max Train</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCheminFerImpl#getNombreVoies <em>Nombre Voies</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCheminFerImpl#getEcartement <em>Ecartement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCheminFerImpl#getEncombrement <em>Encombrement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCheminFerImpl#getTraverse <em>Traverse</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCheminFerImpl#getTonnageMaximum <em>Tonnage Maximum</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCheminFerImpl#getVitesseMaximale <em>Vitesse Maximale</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCheminFerImpl#getTypeEnergie <em>Type Energie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCheminFerImpl#getSystemeSignalisation <em>Systeme Signalisation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCheminFerImpl#getEfficaciteSignalisation <em>Efficacite Signalisation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCheminFerImpl extends TypeSiteImpl implements TypeCheminFer {
	/**
	 * The default value of the '{@link #getNombreMaxTrain() <em>Nombre Max Train</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreMaxTrain()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_MAX_TRAIN_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreMaxTrain() <em>Nombre Max Train</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreMaxTrain()
	 * @generated
	 * @ordered
	 */
	protected long nombreMaxTrain = NOMBRE_MAX_TRAIN_EDEFAULT;

	/**
	 * This is true if the Nombre Max Train attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreMaxTrainESet;

	/**
	 * The default value of the '{@link #getNombreVoies() <em>Nombre Voies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreVoies()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_VOIES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreVoies() <em>Nombre Voies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreVoies()
	 * @generated
	 * @ordered
	 */
	protected long nombreVoies = NOMBRE_VOIES_EDEFAULT;

	/**
	 * This is true if the Nombre Voies attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreVoiesESet;

	/**
	 * The default value of the '{@link #getEcartement() <em>Ecartement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcartement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCheminFerEcartement ECARTEMENT_EDEFAULT = TypeDictionaryDicoCheminFerEcartement.NAR;

	/**
	 * The cached value of the '{@link #getEcartement() <em>Ecartement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcartement()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCheminFerEcartement ecartement = ECARTEMENT_EDEFAULT;

	/**
	 * This is true if the Ecartement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ecartementESet;

	/**
	 * The cached value of the '{@link #getEncombrement() <em>Encombrement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncombrement()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur encombrement;

	/**
	 * The cached value of the '{@link #getTraverse() <em>Traverse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraverse()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur traverse;

	/**
	 * The default value of the '{@link #getTonnageMaximum() <em>Tonnage Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTonnageMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final long TONNAGE_MAXIMUM_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTonnageMaximum() <em>Tonnage Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTonnageMaximum()
	 * @generated
	 * @ordered
	 */
	protected long tonnageMaximum = TONNAGE_MAXIMUM_EDEFAULT;

	/**
	 * This is true if the Tonnage Maximum attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tonnageMaximumESet;

	/**
	 * The cached value of the '{@link #getVitesseMaximale() <em>Vitesse Maximale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesseMaximale()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeVitesseLineaire vitesseMaximale;

	/**
	 * The default value of the '{@link #getTypeEnergie() <em>Type Energie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeEnergie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCheminFerTypeEnergie TYPE_ENERGIE_EDEFAULT = TypeDictionaryDicoCheminFerTypeEnergie.E;

	/**
	 * The cached value of the '{@link #getTypeEnergie() <em>Type Energie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeEnergie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCheminFerTypeEnergie typeEnergie = TYPE_ENERGIE_EDEFAULT;

	/**
	 * This is true if the Type Energie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeEnergieESet;

	/**
	 * The default value of the '{@link #getSystemeSignalisation() <em>Systeme Signalisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemeSignalisation()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCheminFerSystemeSignalisation SYSTEME_SIGNALISATION_EDEFAULT = TypeDictionaryDicoCheminFerSystemeSignalisation.CL;

	/**
	 * The cached value of the '{@link #getSystemeSignalisation() <em>Systeme Signalisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemeSignalisation()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCheminFerSystemeSignalisation systemeSignalisation = SYSTEME_SIGNALISATION_EDEFAULT;

	/**
	 * This is true if the Systeme Signalisation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean systemeSignalisationESet;

	/**
	 * The default value of the '{@link #getEfficaciteSignalisation() <em>Efficacite Signalisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEfficaciteSignalisation()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCheminFerEfficaciteSignalisation EFFICACITE_SIGNALISATION_EDEFAULT = TypeDictionaryDicoCheminFerEfficaciteSignalisation._50;

	/**
	 * The cached value of the '{@link #getEfficaciteSignalisation() <em>Efficacite Signalisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEfficaciteSignalisation()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCheminFerEfficaciteSignalisation efficaciteSignalisation = EFFICACITE_SIGNALISATION_EDEFAULT;

	/**
	 * This is true if the Efficacite Signalisation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean efficaciteSignalisationESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCheminFerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCheminFer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreMaxTrain() {
		return nombreMaxTrain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreMaxTrain(long newNombreMaxTrain) {
		long oldNombreMaxTrain = nombreMaxTrain;
		nombreMaxTrain = newNombreMaxTrain;
		boolean oldNombreMaxTrainESet = nombreMaxTrainESet;
		nombreMaxTrainESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CHEMIN_FER__NOMBRE_MAX_TRAIN, oldNombreMaxTrain, nombreMaxTrain, !oldNombreMaxTrainESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreMaxTrain() {
		long oldNombreMaxTrain = nombreMaxTrain;
		boolean oldNombreMaxTrainESet = nombreMaxTrainESet;
		nombreMaxTrain = NOMBRE_MAX_TRAIN_EDEFAULT;
		nombreMaxTrainESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CHEMIN_FER__NOMBRE_MAX_TRAIN, oldNombreMaxTrain, NOMBRE_MAX_TRAIN_EDEFAULT, oldNombreMaxTrainESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreMaxTrain() {
		return nombreMaxTrainESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreVoies() {
		return nombreVoies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreVoies(long newNombreVoies) {
		long oldNombreVoies = nombreVoies;
		nombreVoies = newNombreVoies;
		boolean oldNombreVoiesESet = nombreVoiesESet;
		nombreVoiesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CHEMIN_FER__NOMBRE_VOIES, oldNombreVoies, nombreVoies, !oldNombreVoiesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreVoies() {
		long oldNombreVoies = nombreVoies;
		boolean oldNombreVoiesESet = nombreVoiesESet;
		nombreVoies = NOMBRE_VOIES_EDEFAULT;
		nombreVoiesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CHEMIN_FER__NOMBRE_VOIES, oldNombreVoies, NOMBRE_VOIES_EDEFAULT, oldNombreVoiesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreVoies() {
		return nombreVoiesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCheminFerEcartement getEcartement() {
		return ecartement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcartement(TypeDictionaryDicoCheminFerEcartement newEcartement) {
		TypeDictionaryDicoCheminFerEcartement oldEcartement = ecartement;
		ecartement = newEcartement == null ? ECARTEMENT_EDEFAULT : newEcartement;
		boolean oldEcartementESet = ecartementESet;
		ecartementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CHEMIN_FER__ECARTEMENT, oldEcartement, ecartement, !oldEcartementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEcartement() {
		TypeDictionaryDicoCheminFerEcartement oldEcartement = ecartement;
		boolean oldEcartementESet = ecartementESet;
		ecartement = ECARTEMENT_EDEFAULT;
		ecartementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CHEMIN_FER__ECARTEMENT, oldEcartement, ECARTEMENT_EDEFAULT, oldEcartementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEcartement() {
		return ecartementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getEncombrement() {
		return encombrement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncombrement(TypeDataTypeLongueur newEncombrement, NotificationChain msgs) {
		TypeDataTypeLongueur oldEncombrement = encombrement;
		encombrement = newEncombrement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CHEMIN_FER__ENCOMBREMENT, oldEncombrement, newEncombrement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncombrement(TypeDataTypeLongueur newEncombrement) {
		if (newEncombrement != encombrement) {
			NotificationChain msgs = null;
			if (encombrement != null)
				msgs = ((InternalEObject)encombrement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CHEMIN_FER__ENCOMBREMENT, null, msgs);
			if (newEncombrement != null)
				msgs = ((InternalEObject)newEncombrement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CHEMIN_FER__ENCOMBREMENT, null, msgs);
			msgs = basicSetEncombrement(newEncombrement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CHEMIN_FER__ENCOMBREMENT, newEncombrement, newEncombrement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getTraverse() {
		return traverse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTraverse(TypeDataTypeLongueur newTraverse, NotificationChain msgs) {
		TypeDataTypeLongueur oldTraverse = traverse;
		traverse = newTraverse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CHEMIN_FER__TRAVERSE, oldTraverse, newTraverse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraverse(TypeDataTypeLongueur newTraverse) {
		if (newTraverse != traverse) {
			NotificationChain msgs = null;
			if (traverse != null)
				msgs = ((InternalEObject)traverse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CHEMIN_FER__TRAVERSE, null, msgs);
			if (newTraverse != null)
				msgs = ((InternalEObject)newTraverse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CHEMIN_FER__TRAVERSE, null, msgs);
			msgs = basicSetTraverse(newTraverse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CHEMIN_FER__TRAVERSE, newTraverse, newTraverse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTonnageMaximum() {
		return tonnageMaximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTonnageMaximum(long newTonnageMaximum) {
		long oldTonnageMaximum = tonnageMaximum;
		tonnageMaximum = newTonnageMaximum;
		boolean oldTonnageMaximumESet = tonnageMaximumESet;
		tonnageMaximumESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CHEMIN_FER__TONNAGE_MAXIMUM, oldTonnageMaximum, tonnageMaximum, !oldTonnageMaximumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTonnageMaximum() {
		long oldTonnageMaximum = tonnageMaximum;
		boolean oldTonnageMaximumESet = tonnageMaximumESet;
		tonnageMaximum = TONNAGE_MAXIMUM_EDEFAULT;
		tonnageMaximumESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CHEMIN_FER__TONNAGE_MAXIMUM, oldTonnageMaximum, TONNAGE_MAXIMUM_EDEFAULT, oldTonnageMaximumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTonnageMaximum() {
		return tonnageMaximumESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeVitesseLineaire getVitesseMaximale() {
		return vitesseMaximale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVitesseMaximale(TypeDataTypeVitesseLineaire newVitesseMaximale, NotificationChain msgs) {
		TypeDataTypeVitesseLineaire oldVitesseMaximale = vitesseMaximale;
		vitesseMaximale = newVitesseMaximale;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CHEMIN_FER__VITESSE_MAXIMALE, oldVitesseMaximale, newVitesseMaximale);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVitesseMaximale(TypeDataTypeVitesseLineaire newVitesseMaximale) {
		if (newVitesseMaximale != vitesseMaximale) {
			NotificationChain msgs = null;
			if (vitesseMaximale != null)
				msgs = ((InternalEObject)vitesseMaximale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CHEMIN_FER__VITESSE_MAXIMALE, null, msgs);
			if (newVitesseMaximale != null)
				msgs = ((InternalEObject)newVitesseMaximale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CHEMIN_FER__VITESSE_MAXIMALE, null, msgs);
			msgs = basicSetVitesseMaximale(newVitesseMaximale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CHEMIN_FER__VITESSE_MAXIMALE, newVitesseMaximale, newVitesseMaximale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCheminFerTypeEnergie getTypeEnergie() {
		return typeEnergie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeEnergie(TypeDictionaryDicoCheminFerTypeEnergie newTypeEnergie) {
		TypeDictionaryDicoCheminFerTypeEnergie oldTypeEnergie = typeEnergie;
		typeEnergie = newTypeEnergie == null ? TYPE_ENERGIE_EDEFAULT : newTypeEnergie;
		boolean oldTypeEnergieESet = typeEnergieESet;
		typeEnergieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CHEMIN_FER__TYPE_ENERGIE, oldTypeEnergie, typeEnergie, !oldTypeEnergieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeEnergie() {
		TypeDictionaryDicoCheminFerTypeEnergie oldTypeEnergie = typeEnergie;
		boolean oldTypeEnergieESet = typeEnergieESet;
		typeEnergie = TYPE_ENERGIE_EDEFAULT;
		typeEnergieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CHEMIN_FER__TYPE_ENERGIE, oldTypeEnergie, TYPE_ENERGIE_EDEFAULT, oldTypeEnergieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeEnergie() {
		return typeEnergieESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCheminFerSystemeSignalisation getSystemeSignalisation() {
		return systemeSignalisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemeSignalisation(TypeDictionaryDicoCheminFerSystemeSignalisation newSystemeSignalisation) {
		TypeDictionaryDicoCheminFerSystemeSignalisation oldSystemeSignalisation = systemeSignalisation;
		systemeSignalisation = newSystemeSignalisation == null ? SYSTEME_SIGNALISATION_EDEFAULT : newSystemeSignalisation;
		boolean oldSystemeSignalisationESet = systemeSignalisationESet;
		systemeSignalisationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CHEMIN_FER__SYSTEME_SIGNALISATION, oldSystemeSignalisation, systemeSignalisation, !oldSystemeSignalisationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSystemeSignalisation() {
		TypeDictionaryDicoCheminFerSystemeSignalisation oldSystemeSignalisation = systemeSignalisation;
		boolean oldSystemeSignalisationESet = systemeSignalisationESet;
		systemeSignalisation = SYSTEME_SIGNALISATION_EDEFAULT;
		systemeSignalisationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CHEMIN_FER__SYSTEME_SIGNALISATION, oldSystemeSignalisation, SYSTEME_SIGNALISATION_EDEFAULT, oldSystemeSignalisationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSystemeSignalisation() {
		return systemeSignalisationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCheminFerEfficaciteSignalisation getEfficaciteSignalisation() {
		return efficaciteSignalisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEfficaciteSignalisation(TypeDictionaryDicoCheminFerEfficaciteSignalisation newEfficaciteSignalisation) {
		TypeDictionaryDicoCheminFerEfficaciteSignalisation oldEfficaciteSignalisation = efficaciteSignalisation;
		efficaciteSignalisation = newEfficaciteSignalisation == null ? EFFICACITE_SIGNALISATION_EDEFAULT : newEfficaciteSignalisation;
		boolean oldEfficaciteSignalisationESet = efficaciteSignalisationESet;
		efficaciteSignalisationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CHEMIN_FER__EFFICACITE_SIGNALISATION, oldEfficaciteSignalisation, efficaciteSignalisation, !oldEfficaciteSignalisationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEfficaciteSignalisation() {
		TypeDictionaryDicoCheminFerEfficaciteSignalisation oldEfficaciteSignalisation = efficaciteSignalisation;
		boolean oldEfficaciteSignalisationESet = efficaciteSignalisationESet;
		efficaciteSignalisation = EFFICACITE_SIGNALISATION_EDEFAULT;
		efficaciteSignalisationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CHEMIN_FER__EFFICACITE_SIGNALISATION, oldEfficaciteSignalisation, EFFICACITE_SIGNALISATION_EDEFAULT, oldEfficaciteSignalisationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEfficaciteSignalisation() {
		return efficaciteSignalisationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_CHEMIN_FER__ENCOMBREMENT:
				return basicSetEncombrement(null, msgs);
			case SchemaPackage.TYPE_CHEMIN_FER__TRAVERSE:
				return basicSetTraverse(null, msgs);
			case SchemaPackage.TYPE_CHEMIN_FER__VITESSE_MAXIMALE:
				return basicSetVitesseMaximale(null, msgs);
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
			case SchemaPackage.TYPE_CHEMIN_FER__NOMBRE_MAX_TRAIN:
				return new Long(getNombreMaxTrain());
			case SchemaPackage.TYPE_CHEMIN_FER__NOMBRE_VOIES:
				return new Long(getNombreVoies());
			case SchemaPackage.TYPE_CHEMIN_FER__ECARTEMENT:
				return getEcartement();
			case SchemaPackage.TYPE_CHEMIN_FER__ENCOMBREMENT:
				return getEncombrement();
			case SchemaPackage.TYPE_CHEMIN_FER__TRAVERSE:
				return getTraverse();
			case SchemaPackage.TYPE_CHEMIN_FER__TONNAGE_MAXIMUM:
				return new Long(getTonnageMaximum());
			case SchemaPackage.TYPE_CHEMIN_FER__VITESSE_MAXIMALE:
				return getVitesseMaximale();
			case SchemaPackage.TYPE_CHEMIN_FER__TYPE_ENERGIE:
				return getTypeEnergie();
			case SchemaPackage.TYPE_CHEMIN_FER__SYSTEME_SIGNALISATION:
				return getSystemeSignalisation();
			case SchemaPackage.TYPE_CHEMIN_FER__EFFICACITE_SIGNALISATION:
				return getEfficaciteSignalisation();
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
			case SchemaPackage.TYPE_CHEMIN_FER__NOMBRE_MAX_TRAIN:
				setNombreMaxTrain(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CHEMIN_FER__NOMBRE_VOIES:
				setNombreVoies(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CHEMIN_FER__ECARTEMENT:
				setEcartement((TypeDictionaryDicoCheminFerEcartement)newValue);
				return;
			case SchemaPackage.TYPE_CHEMIN_FER__ENCOMBREMENT:
				setEncombrement((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_CHEMIN_FER__TRAVERSE:
				setTraverse((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_CHEMIN_FER__TONNAGE_MAXIMUM:
				setTonnageMaximum(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CHEMIN_FER__VITESSE_MAXIMALE:
				setVitesseMaximale((TypeDataTypeVitesseLineaire)newValue);
				return;
			case SchemaPackage.TYPE_CHEMIN_FER__TYPE_ENERGIE:
				setTypeEnergie((TypeDictionaryDicoCheminFerTypeEnergie)newValue);
				return;
			case SchemaPackage.TYPE_CHEMIN_FER__SYSTEME_SIGNALISATION:
				setSystemeSignalisation((TypeDictionaryDicoCheminFerSystemeSignalisation)newValue);
				return;
			case SchemaPackage.TYPE_CHEMIN_FER__EFFICACITE_SIGNALISATION:
				setEfficaciteSignalisation((TypeDictionaryDicoCheminFerEfficaciteSignalisation)newValue);
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
			case SchemaPackage.TYPE_CHEMIN_FER__NOMBRE_MAX_TRAIN:
				unsetNombreMaxTrain();
				return;
			case SchemaPackage.TYPE_CHEMIN_FER__NOMBRE_VOIES:
				unsetNombreVoies();
				return;
			case SchemaPackage.TYPE_CHEMIN_FER__ECARTEMENT:
				unsetEcartement();
				return;
			case SchemaPackage.TYPE_CHEMIN_FER__ENCOMBREMENT:
				setEncombrement((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_CHEMIN_FER__TRAVERSE:
				setTraverse((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_CHEMIN_FER__TONNAGE_MAXIMUM:
				unsetTonnageMaximum();
				return;
			case SchemaPackage.TYPE_CHEMIN_FER__VITESSE_MAXIMALE:
				setVitesseMaximale((TypeDataTypeVitesseLineaire)null);
				return;
			case SchemaPackage.TYPE_CHEMIN_FER__TYPE_ENERGIE:
				unsetTypeEnergie();
				return;
			case SchemaPackage.TYPE_CHEMIN_FER__SYSTEME_SIGNALISATION:
				unsetSystemeSignalisation();
				return;
			case SchemaPackage.TYPE_CHEMIN_FER__EFFICACITE_SIGNALISATION:
				unsetEfficaciteSignalisation();
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
			case SchemaPackage.TYPE_CHEMIN_FER__NOMBRE_MAX_TRAIN:
				return isSetNombreMaxTrain();
			case SchemaPackage.TYPE_CHEMIN_FER__NOMBRE_VOIES:
				return isSetNombreVoies();
			case SchemaPackage.TYPE_CHEMIN_FER__ECARTEMENT:
				return isSetEcartement();
			case SchemaPackage.TYPE_CHEMIN_FER__ENCOMBREMENT:
				return encombrement != null;
			case SchemaPackage.TYPE_CHEMIN_FER__TRAVERSE:
				return traverse != null;
			case SchemaPackage.TYPE_CHEMIN_FER__TONNAGE_MAXIMUM:
				return isSetTonnageMaximum();
			case SchemaPackage.TYPE_CHEMIN_FER__VITESSE_MAXIMALE:
				return vitesseMaximale != null;
			case SchemaPackage.TYPE_CHEMIN_FER__TYPE_ENERGIE:
				return isSetTypeEnergie();
			case SchemaPackage.TYPE_CHEMIN_FER__SYSTEME_SIGNALISATION:
				return isSetSystemeSignalisation();
			case SchemaPackage.TYPE_CHEMIN_FER__EFFICACITE_SIGNALISATION:
				return isSetEfficaciteSignalisation();
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
		result.append(" (nombreMaxTrain: ");
		if (nombreMaxTrainESet) result.append(nombreMaxTrain); else result.append("<unset>");
		result.append(", nombreVoies: ");
		if (nombreVoiesESet) result.append(nombreVoies); else result.append("<unset>");
		result.append(", ecartement: ");
		if (ecartementESet) result.append(ecartement); else result.append("<unset>");
		result.append(", tonnageMaximum: ");
		if (tonnageMaximumESet) result.append(tonnageMaximum); else result.append("<unset>");
		result.append(", typeEnergie: ");
		if (typeEnergieESet) result.append(typeEnergie); else result.append("<unset>");
		result.append(", systemeSignalisation: ");
		if (systemeSignalisationESet) result.append(systemeSignalisation); else result.append("<unset>");
		result.append(", efficaciteSignalisation: ");
		if (efficaciteSignalisationESet) result.append(efficaciteSignalisation); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeCheminFerImpl
