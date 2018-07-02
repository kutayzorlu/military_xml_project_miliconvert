/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeLongueur;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoPisteAtterrissageMethodeEvaluationRevetement;
import mpia.schema.TypeDictionaryDicoPisteAtterrissagePressionMaximalePneusRevetement;
import mpia.schema.TypeDictionaryDicoPisteAtterrissageRevetement;
import mpia.schema.TypeDictionaryDicoPisteAtterrissageSousClassificationRevetement;
import mpia.schema.TypeDictionaryDicoPisteAtterrissageTypeClassificationRevetement;
import mpia.schema.TypePisteAtterrissage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Piste Atterrissage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePisteAtterrissageImpl#getQFU1 <em>QFU1</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePisteAtterrissageImpl#isPistePrincipale <em>Piste Principale</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePisteAtterrissageImpl#isBalisage <em>Balisage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePisteAtterrissageImpl#getLongueurPiste <em>Longueur Piste</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePisteAtterrissageImpl#getLargeurPiste <em>Largeur Piste</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePisteAtterrissageImpl#isPrecisionAtterrissage <em>Precision Atterrissage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePisteAtterrissageImpl#getPressionMaximale <em>Pression Maximale</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePisteAtterrissageImpl#getRevetement <em>Revetement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePisteAtterrissageImpl#getTypeClassificationRevetement <em>Type Classification Revetement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePisteAtterrissageImpl#getSousClassificationRevetement <em>Sous Classification Revetement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePisteAtterrissageImpl#getNumeroClassificationRevetement <em>Numero Classification Revetement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePisteAtterrissageImpl#getPressionMaximalePneusRevetement <em>Pression Maximale Pneus Revetement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePisteAtterrissageImpl#getMethodeEvaluationRevetement <em>Methode Evaluation Revetement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePisteAtterrissageImpl extends TypeSiteImpl implements TypePisteAtterrissage {
	/**
	 * The default value of the '{@link #getQFU1() <em>QFU1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQFU1()
	 * @generated
	 * @ordered
	 */
	protected static final String QFU1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQFU1() <em>QFU1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQFU1()
	 * @generated
	 * @ordered
	 */
	protected String qFU1 = QFU1_EDEFAULT;

	/**
	 * The default value of the '{@link #isPistePrincipale() <em>Piste Principale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPistePrincipale()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PISTE_PRINCIPALE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPistePrincipale() <em>Piste Principale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPistePrincipale()
	 * @generated
	 * @ordered
	 */
	protected boolean pistePrincipale = PISTE_PRINCIPALE_EDEFAULT;

	/**
	 * This is true if the Piste Principale attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pistePrincipaleESet;

	/**
	 * The default value of the '{@link #isBalisage() <em>Balisage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBalisage()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BALISAGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBalisage() <em>Balisage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBalisage()
	 * @generated
	 * @ordered
	 */
	protected boolean balisage = BALISAGE_EDEFAULT;

	/**
	 * This is true if the Balisage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean balisageESet;

	/**
	 * The cached value of the '{@link #getLongueurPiste() <em>Longueur Piste</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongueurPiste()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur longueurPiste;

	/**
	 * The cached value of the '{@link #getLargeurPiste() <em>Largeur Piste</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeurPiste()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur largeurPiste;

	/**
	 * The default value of the '{@link #isPrecisionAtterrissage() <em>Precision Atterrissage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrecisionAtterrissage()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRECISION_ATTERRISSAGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPrecisionAtterrissage() <em>Precision Atterrissage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrecisionAtterrissage()
	 * @generated
	 * @ordered
	 */
	protected boolean precisionAtterrissage = PRECISION_ATTERRISSAGE_EDEFAULT;

	/**
	 * This is true if the Precision Atterrissage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean precisionAtterrissageESet;

	/**
	 * The default value of the '{@link #getPressionMaximale() <em>Pression Maximale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressionMaximale()
	 * @generated
	 * @ordered
	 */
	protected static final double PRESSION_MAXIMALE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPressionMaximale() <em>Pression Maximale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressionMaximale()
	 * @generated
	 * @ordered
	 */
	protected double pressionMaximale = PRESSION_MAXIMALE_EDEFAULT;

	/**
	 * This is true if the Pression Maximale attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pressionMaximaleESet;

	/**
	 * The default value of the '{@link #getRevetement() <em>Revetement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevetement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPisteAtterrissageRevetement REVETEMENT_EDEFAULT = TypeDictionaryDicoPisteAtterrissageRevetement.AM;

	/**
	 * The cached value of the '{@link #getRevetement() <em>Revetement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevetement()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPisteAtterrissageRevetement revetement = REVETEMENT_EDEFAULT;

	/**
	 * This is true if the Revetement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean revetementESet;

	/**
	 * The default value of the '{@link #getTypeClassificationRevetement() <em>Type Classification Revetement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeClassificationRevetement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPisteAtterrissageTypeClassificationRevetement TYPE_CLASSIFICATION_REVETEMENT_EDEFAULT = TypeDictionaryDicoPisteAtterrissageTypeClassificationRevetement.F;

	/**
	 * The cached value of the '{@link #getTypeClassificationRevetement() <em>Type Classification Revetement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeClassificationRevetement()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPisteAtterrissageTypeClassificationRevetement typeClassificationRevetement = TYPE_CLASSIFICATION_REVETEMENT_EDEFAULT;

	/**
	 * This is true if the Type Classification Revetement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeClassificationRevetementESet;

	/**
	 * The default value of the '{@link #getSousClassificationRevetement() <em>Sous Classification Revetement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSousClassificationRevetement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPisteAtterrissageSousClassificationRevetement SOUS_CLASSIFICATION_REVETEMENT_EDEFAULT = TypeDictionaryDicoPisteAtterrissageSousClassificationRevetement.A;

	/**
	 * The cached value of the '{@link #getSousClassificationRevetement() <em>Sous Classification Revetement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSousClassificationRevetement()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPisteAtterrissageSousClassificationRevetement sousClassificationRevetement = SOUS_CLASSIFICATION_REVETEMENT_EDEFAULT;

	/**
	 * This is true if the Sous Classification Revetement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sousClassificationRevetementESet;

	/**
	 * The default value of the '{@link #getNumeroClassificationRevetement() <em>Numero Classification Revetement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroClassificationRevetement()
	 * @generated
	 * @ordered
	 */
	protected static final long NUMERO_CLASSIFICATION_REVETEMENT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNumeroClassificationRevetement() <em>Numero Classification Revetement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroClassificationRevetement()
	 * @generated
	 * @ordered
	 */
	protected long numeroClassificationRevetement = NUMERO_CLASSIFICATION_REVETEMENT_EDEFAULT;

	/**
	 * This is true if the Numero Classification Revetement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numeroClassificationRevetementESet;

	/**
	 * The default value of the '{@link #getPressionMaximalePneusRevetement() <em>Pression Maximale Pneus Revetement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressionMaximalePneusRevetement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPisteAtterrissagePressionMaximalePneusRevetement PRESSION_MAXIMALE_PNEUS_REVETEMENT_EDEFAULT = TypeDictionaryDicoPisteAtterrissagePressionMaximalePneusRevetement.W;

	/**
	 * The cached value of the '{@link #getPressionMaximalePneusRevetement() <em>Pression Maximale Pneus Revetement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressionMaximalePneusRevetement()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPisteAtterrissagePressionMaximalePneusRevetement pressionMaximalePneusRevetement = PRESSION_MAXIMALE_PNEUS_REVETEMENT_EDEFAULT;

	/**
	 * This is true if the Pression Maximale Pneus Revetement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pressionMaximalePneusRevetementESet;

	/**
	 * The default value of the '{@link #getMethodeEvaluationRevetement() <em>Methode Evaluation Revetement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodeEvaluationRevetement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPisteAtterrissageMethodeEvaluationRevetement METHODE_EVALUATION_REVETEMENT_EDEFAULT = TypeDictionaryDicoPisteAtterrissageMethodeEvaluationRevetement.U;

	/**
	 * The cached value of the '{@link #getMethodeEvaluationRevetement() <em>Methode Evaluation Revetement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodeEvaluationRevetement()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPisteAtterrissageMethodeEvaluationRevetement methodeEvaluationRevetement = METHODE_EVALUATION_REVETEMENT_EDEFAULT;

	/**
	 * This is true if the Methode Evaluation Revetement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean methodeEvaluationRevetementESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypePisteAtterrissageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePisteAtterrissage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQFU1() {
		return qFU1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQFU1(String newQFU1) {
		String oldQFU1 = qFU1;
		qFU1 = newQFU1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PISTE_ATTERRISSAGE__QFU1, oldQFU1, qFU1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPistePrincipale() {
		return pistePrincipale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPistePrincipale(boolean newPistePrincipale) {
		boolean oldPistePrincipale = pistePrincipale;
		pistePrincipale = newPistePrincipale;
		boolean oldPistePrincipaleESet = pistePrincipaleESet;
		pistePrincipaleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PISTE_ATTERRISSAGE__PISTE_PRINCIPALE, oldPistePrincipale, pistePrincipale, !oldPistePrincipaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPistePrincipale() {
		boolean oldPistePrincipale = pistePrincipale;
		boolean oldPistePrincipaleESet = pistePrincipaleESet;
		pistePrincipale = PISTE_PRINCIPALE_EDEFAULT;
		pistePrincipaleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PISTE_ATTERRISSAGE__PISTE_PRINCIPALE, oldPistePrincipale, PISTE_PRINCIPALE_EDEFAULT, oldPistePrincipaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPistePrincipale() {
		return pistePrincipaleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBalisage() {
		return balisage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBalisage(boolean newBalisage) {
		boolean oldBalisage = balisage;
		balisage = newBalisage;
		boolean oldBalisageESet = balisageESet;
		balisageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PISTE_ATTERRISSAGE__BALISAGE, oldBalisage, balisage, !oldBalisageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBalisage() {
		boolean oldBalisage = balisage;
		boolean oldBalisageESet = balisageESet;
		balisage = BALISAGE_EDEFAULT;
		balisageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PISTE_ATTERRISSAGE__BALISAGE, oldBalisage, BALISAGE_EDEFAULT, oldBalisageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBalisage() {
		return balisageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getLongueurPiste() {
		return longueurPiste;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLongueurPiste(TypeDataTypeLongueur newLongueurPiste, NotificationChain msgs) {
		TypeDataTypeLongueur oldLongueurPiste = longueurPiste;
		longueurPiste = newLongueurPiste;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PISTE_ATTERRISSAGE__LONGUEUR_PISTE, oldLongueurPiste, newLongueurPiste);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongueurPiste(TypeDataTypeLongueur newLongueurPiste) {
		if (newLongueurPiste != longueurPiste) {
			NotificationChain msgs = null;
			if (longueurPiste != null)
				msgs = ((InternalEObject)longueurPiste).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PISTE_ATTERRISSAGE__LONGUEUR_PISTE, null, msgs);
			if (newLongueurPiste != null)
				msgs = ((InternalEObject)newLongueurPiste).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PISTE_ATTERRISSAGE__LONGUEUR_PISTE, null, msgs);
			msgs = basicSetLongueurPiste(newLongueurPiste, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PISTE_ATTERRISSAGE__LONGUEUR_PISTE, newLongueurPiste, newLongueurPiste));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getLargeurPiste() {
		return largeurPiste;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLargeurPiste(TypeDataTypeLongueur newLargeurPiste, NotificationChain msgs) {
		TypeDataTypeLongueur oldLargeurPiste = largeurPiste;
		largeurPiste = newLargeurPiste;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PISTE_ATTERRISSAGE__LARGEUR_PISTE, oldLargeurPiste, newLargeurPiste);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLargeurPiste(TypeDataTypeLongueur newLargeurPiste) {
		if (newLargeurPiste != largeurPiste) {
			NotificationChain msgs = null;
			if (largeurPiste != null)
				msgs = ((InternalEObject)largeurPiste).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PISTE_ATTERRISSAGE__LARGEUR_PISTE, null, msgs);
			if (newLargeurPiste != null)
				msgs = ((InternalEObject)newLargeurPiste).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PISTE_ATTERRISSAGE__LARGEUR_PISTE, null, msgs);
			msgs = basicSetLargeurPiste(newLargeurPiste, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PISTE_ATTERRISSAGE__LARGEUR_PISTE, newLargeurPiste, newLargeurPiste));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPrecisionAtterrissage() {
		return precisionAtterrissage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecisionAtterrissage(boolean newPrecisionAtterrissage) {
		boolean oldPrecisionAtterrissage = precisionAtterrissage;
		precisionAtterrissage = newPrecisionAtterrissage;
		boolean oldPrecisionAtterrissageESet = precisionAtterrissageESet;
		precisionAtterrissageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PISTE_ATTERRISSAGE__PRECISION_ATTERRISSAGE, oldPrecisionAtterrissage, precisionAtterrissage, !oldPrecisionAtterrissageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrecisionAtterrissage() {
		boolean oldPrecisionAtterrissage = precisionAtterrissage;
		boolean oldPrecisionAtterrissageESet = precisionAtterrissageESet;
		precisionAtterrissage = PRECISION_ATTERRISSAGE_EDEFAULT;
		precisionAtterrissageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PISTE_ATTERRISSAGE__PRECISION_ATTERRISSAGE, oldPrecisionAtterrissage, PRECISION_ATTERRISSAGE_EDEFAULT, oldPrecisionAtterrissageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrecisionAtterrissage() {
		return precisionAtterrissageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPressionMaximale() {
		return pressionMaximale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPressionMaximale(double newPressionMaximale) {
		double oldPressionMaximale = pressionMaximale;
		pressionMaximale = newPressionMaximale;
		boolean oldPressionMaximaleESet = pressionMaximaleESet;
		pressionMaximaleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PISTE_ATTERRISSAGE__PRESSION_MAXIMALE, oldPressionMaximale, pressionMaximale, !oldPressionMaximaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPressionMaximale() {
		double oldPressionMaximale = pressionMaximale;
		boolean oldPressionMaximaleESet = pressionMaximaleESet;
		pressionMaximale = PRESSION_MAXIMALE_EDEFAULT;
		pressionMaximaleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PISTE_ATTERRISSAGE__PRESSION_MAXIMALE, oldPressionMaximale, PRESSION_MAXIMALE_EDEFAULT, oldPressionMaximaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPressionMaximale() {
		return pressionMaximaleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPisteAtterrissageRevetement getRevetement() {
		return revetement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevetement(TypeDictionaryDicoPisteAtterrissageRevetement newRevetement) {
		TypeDictionaryDicoPisteAtterrissageRevetement oldRevetement = revetement;
		revetement = newRevetement == null ? REVETEMENT_EDEFAULT : newRevetement;
		boolean oldRevetementESet = revetementESet;
		revetementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PISTE_ATTERRISSAGE__REVETEMENT, oldRevetement, revetement, !oldRevetementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRevetement() {
		TypeDictionaryDicoPisteAtterrissageRevetement oldRevetement = revetement;
		boolean oldRevetementESet = revetementESet;
		revetement = REVETEMENT_EDEFAULT;
		revetementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PISTE_ATTERRISSAGE__REVETEMENT, oldRevetement, REVETEMENT_EDEFAULT, oldRevetementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRevetement() {
		return revetementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPisteAtterrissageTypeClassificationRevetement getTypeClassificationRevetement() {
		return typeClassificationRevetement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeClassificationRevetement(TypeDictionaryDicoPisteAtterrissageTypeClassificationRevetement newTypeClassificationRevetement) {
		TypeDictionaryDicoPisteAtterrissageTypeClassificationRevetement oldTypeClassificationRevetement = typeClassificationRevetement;
		typeClassificationRevetement = newTypeClassificationRevetement == null ? TYPE_CLASSIFICATION_REVETEMENT_EDEFAULT : newTypeClassificationRevetement;
		boolean oldTypeClassificationRevetementESet = typeClassificationRevetementESet;
		typeClassificationRevetementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PISTE_ATTERRISSAGE__TYPE_CLASSIFICATION_REVETEMENT, oldTypeClassificationRevetement, typeClassificationRevetement, !oldTypeClassificationRevetementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeClassificationRevetement() {
		TypeDictionaryDicoPisteAtterrissageTypeClassificationRevetement oldTypeClassificationRevetement = typeClassificationRevetement;
		boolean oldTypeClassificationRevetementESet = typeClassificationRevetementESet;
		typeClassificationRevetement = TYPE_CLASSIFICATION_REVETEMENT_EDEFAULT;
		typeClassificationRevetementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PISTE_ATTERRISSAGE__TYPE_CLASSIFICATION_REVETEMENT, oldTypeClassificationRevetement, TYPE_CLASSIFICATION_REVETEMENT_EDEFAULT, oldTypeClassificationRevetementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeClassificationRevetement() {
		return typeClassificationRevetementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPisteAtterrissageSousClassificationRevetement getSousClassificationRevetement() {
		return sousClassificationRevetement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSousClassificationRevetement(TypeDictionaryDicoPisteAtterrissageSousClassificationRevetement newSousClassificationRevetement) {
		TypeDictionaryDicoPisteAtterrissageSousClassificationRevetement oldSousClassificationRevetement = sousClassificationRevetement;
		sousClassificationRevetement = newSousClassificationRevetement == null ? SOUS_CLASSIFICATION_REVETEMENT_EDEFAULT : newSousClassificationRevetement;
		boolean oldSousClassificationRevetementESet = sousClassificationRevetementESet;
		sousClassificationRevetementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PISTE_ATTERRISSAGE__SOUS_CLASSIFICATION_REVETEMENT, oldSousClassificationRevetement, sousClassificationRevetement, !oldSousClassificationRevetementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSousClassificationRevetement() {
		TypeDictionaryDicoPisteAtterrissageSousClassificationRevetement oldSousClassificationRevetement = sousClassificationRevetement;
		boolean oldSousClassificationRevetementESet = sousClassificationRevetementESet;
		sousClassificationRevetement = SOUS_CLASSIFICATION_REVETEMENT_EDEFAULT;
		sousClassificationRevetementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PISTE_ATTERRISSAGE__SOUS_CLASSIFICATION_REVETEMENT, oldSousClassificationRevetement, SOUS_CLASSIFICATION_REVETEMENT_EDEFAULT, oldSousClassificationRevetementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSousClassificationRevetement() {
		return sousClassificationRevetementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNumeroClassificationRevetement() {
		return numeroClassificationRevetement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroClassificationRevetement(long newNumeroClassificationRevetement) {
		long oldNumeroClassificationRevetement = numeroClassificationRevetement;
		numeroClassificationRevetement = newNumeroClassificationRevetement;
		boolean oldNumeroClassificationRevetementESet = numeroClassificationRevetementESet;
		numeroClassificationRevetementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PISTE_ATTERRISSAGE__NUMERO_CLASSIFICATION_REVETEMENT, oldNumeroClassificationRevetement, numeroClassificationRevetement, !oldNumeroClassificationRevetementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumeroClassificationRevetement() {
		long oldNumeroClassificationRevetement = numeroClassificationRevetement;
		boolean oldNumeroClassificationRevetementESet = numeroClassificationRevetementESet;
		numeroClassificationRevetement = NUMERO_CLASSIFICATION_REVETEMENT_EDEFAULT;
		numeroClassificationRevetementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PISTE_ATTERRISSAGE__NUMERO_CLASSIFICATION_REVETEMENT, oldNumeroClassificationRevetement, NUMERO_CLASSIFICATION_REVETEMENT_EDEFAULT, oldNumeroClassificationRevetementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumeroClassificationRevetement() {
		return numeroClassificationRevetementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPisteAtterrissagePressionMaximalePneusRevetement getPressionMaximalePneusRevetement() {
		return pressionMaximalePneusRevetement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPressionMaximalePneusRevetement(TypeDictionaryDicoPisteAtterrissagePressionMaximalePneusRevetement newPressionMaximalePneusRevetement) {
		TypeDictionaryDicoPisteAtterrissagePressionMaximalePneusRevetement oldPressionMaximalePneusRevetement = pressionMaximalePneusRevetement;
		pressionMaximalePneusRevetement = newPressionMaximalePneusRevetement == null ? PRESSION_MAXIMALE_PNEUS_REVETEMENT_EDEFAULT : newPressionMaximalePneusRevetement;
		boolean oldPressionMaximalePneusRevetementESet = pressionMaximalePneusRevetementESet;
		pressionMaximalePneusRevetementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PISTE_ATTERRISSAGE__PRESSION_MAXIMALE_PNEUS_REVETEMENT, oldPressionMaximalePneusRevetement, pressionMaximalePneusRevetement, !oldPressionMaximalePneusRevetementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPressionMaximalePneusRevetement() {
		TypeDictionaryDicoPisteAtterrissagePressionMaximalePneusRevetement oldPressionMaximalePneusRevetement = pressionMaximalePneusRevetement;
		boolean oldPressionMaximalePneusRevetementESet = pressionMaximalePneusRevetementESet;
		pressionMaximalePneusRevetement = PRESSION_MAXIMALE_PNEUS_REVETEMENT_EDEFAULT;
		pressionMaximalePneusRevetementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PISTE_ATTERRISSAGE__PRESSION_MAXIMALE_PNEUS_REVETEMENT, oldPressionMaximalePneusRevetement, PRESSION_MAXIMALE_PNEUS_REVETEMENT_EDEFAULT, oldPressionMaximalePneusRevetementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPressionMaximalePneusRevetement() {
		return pressionMaximalePneusRevetementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPisteAtterrissageMethodeEvaluationRevetement getMethodeEvaluationRevetement() {
		return methodeEvaluationRevetement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodeEvaluationRevetement(TypeDictionaryDicoPisteAtterrissageMethodeEvaluationRevetement newMethodeEvaluationRevetement) {
		TypeDictionaryDicoPisteAtterrissageMethodeEvaluationRevetement oldMethodeEvaluationRevetement = methodeEvaluationRevetement;
		methodeEvaluationRevetement = newMethodeEvaluationRevetement == null ? METHODE_EVALUATION_REVETEMENT_EDEFAULT : newMethodeEvaluationRevetement;
		boolean oldMethodeEvaluationRevetementESet = methodeEvaluationRevetementESet;
		methodeEvaluationRevetementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PISTE_ATTERRISSAGE__METHODE_EVALUATION_REVETEMENT, oldMethodeEvaluationRevetement, methodeEvaluationRevetement, !oldMethodeEvaluationRevetementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMethodeEvaluationRevetement() {
		TypeDictionaryDicoPisteAtterrissageMethodeEvaluationRevetement oldMethodeEvaluationRevetement = methodeEvaluationRevetement;
		boolean oldMethodeEvaluationRevetementESet = methodeEvaluationRevetementESet;
		methodeEvaluationRevetement = METHODE_EVALUATION_REVETEMENT_EDEFAULT;
		methodeEvaluationRevetementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PISTE_ATTERRISSAGE__METHODE_EVALUATION_REVETEMENT, oldMethodeEvaluationRevetement, METHODE_EVALUATION_REVETEMENT_EDEFAULT, oldMethodeEvaluationRevetementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMethodeEvaluationRevetement() {
		return methodeEvaluationRevetementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__LONGUEUR_PISTE:
				return basicSetLongueurPiste(null, msgs);
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__LARGEUR_PISTE:
				return basicSetLargeurPiste(null, msgs);
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
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__QFU1:
				return getQFU1();
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__PISTE_PRINCIPALE:
				return isPistePrincipale() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__BALISAGE:
				return isBalisage() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__LONGUEUR_PISTE:
				return getLongueurPiste();
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__LARGEUR_PISTE:
				return getLargeurPiste();
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__PRECISION_ATTERRISSAGE:
				return isPrecisionAtterrissage() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__PRESSION_MAXIMALE:
				return new Double(getPressionMaximale());
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__REVETEMENT:
				return getRevetement();
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__TYPE_CLASSIFICATION_REVETEMENT:
				return getTypeClassificationRevetement();
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__SOUS_CLASSIFICATION_REVETEMENT:
				return getSousClassificationRevetement();
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__NUMERO_CLASSIFICATION_REVETEMENT:
				return new Long(getNumeroClassificationRevetement());
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__PRESSION_MAXIMALE_PNEUS_REVETEMENT:
				return getPressionMaximalePneusRevetement();
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__METHODE_EVALUATION_REVETEMENT:
				return getMethodeEvaluationRevetement();
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
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__QFU1:
				setQFU1((String)newValue);
				return;
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__PISTE_PRINCIPALE:
				setPistePrincipale(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__BALISAGE:
				setBalisage(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__LONGUEUR_PISTE:
				setLongueurPiste((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__LARGEUR_PISTE:
				setLargeurPiste((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__PRECISION_ATTERRISSAGE:
				setPrecisionAtterrissage(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__PRESSION_MAXIMALE:
				setPressionMaximale(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__REVETEMENT:
				setRevetement((TypeDictionaryDicoPisteAtterrissageRevetement)newValue);
				return;
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__TYPE_CLASSIFICATION_REVETEMENT:
				setTypeClassificationRevetement((TypeDictionaryDicoPisteAtterrissageTypeClassificationRevetement)newValue);
				return;
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__SOUS_CLASSIFICATION_REVETEMENT:
				setSousClassificationRevetement((TypeDictionaryDicoPisteAtterrissageSousClassificationRevetement)newValue);
				return;
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__NUMERO_CLASSIFICATION_REVETEMENT:
				setNumeroClassificationRevetement(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__PRESSION_MAXIMALE_PNEUS_REVETEMENT:
				setPressionMaximalePneusRevetement((TypeDictionaryDicoPisteAtterrissagePressionMaximalePneusRevetement)newValue);
				return;
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__METHODE_EVALUATION_REVETEMENT:
				setMethodeEvaluationRevetement((TypeDictionaryDicoPisteAtterrissageMethodeEvaluationRevetement)newValue);
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
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__QFU1:
				setQFU1(QFU1_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__PISTE_PRINCIPALE:
				unsetPistePrincipale();
				return;
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__BALISAGE:
				unsetBalisage();
				return;
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__LONGUEUR_PISTE:
				setLongueurPiste((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__LARGEUR_PISTE:
				setLargeurPiste((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__PRECISION_ATTERRISSAGE:
				unsetPrecisionAtterrissage();
				return;
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__PRESSION_MAXIMALE:
				unsetPressionMaximale();
				return;
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__REVETEMENT:
				unsetRevetement();
				return;
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__TYPE_CLASSIFICATION_REVETEMENT:
				unsetTypeClassificationRevetement();
				return;
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__SOUS_CLASSIFICATION_REVETEMENT:
				unsetSousClassificationRevetement();
				return;
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__NUMERO_CLASSIFICATION_REVETEMENT:
				unsetNumeroClassificationRevetement();
				return;
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__PRESSION_MAXIMALE_PNEUS_REVETEMENT:
				unsetPressionMaximalePneusRevetement();
				return;
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__METHODE_EVALUATION_REVETEMENT:
				unsetMethodeEvaluationRevetement();
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
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__QFU1:
				return QFU1_EDEFAULT == null ? qFU1 != null : !QFU1_EDEFAULT.equals(qFU1);
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__PISTE_PRINCIPALE:
				return isSetPistePrincipale();
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__BALISAGE:
				return isSetBalisage();
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__LONGUEUR_PISTE:
				return longueurPiste != null;
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__LARGEUR_PISTE:
				return largeurPiste != null;
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__PRECISION_ATTERRISSAGE:
				return isSetPrecisionAtterrissage();
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__PRESSION_MAXIMALE:
				return isSetPressionMaximale();
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__REVETEMENT:
				return isSetRevetement();
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__TYPE_CLASSIFICATION_REVETEMENT:
				return isSetTypeClassificationRevetement();
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__SOUS_CLASSIFICATION_REVETEMENT:
				return isSetSousClassificationRevetement();
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__NUMERO_CLASSIFICATION_REVETEMENT:
				return isSetNumeroClassificationRevetement();
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__PRESSION_MAXIMALE_PNEUS_REVETEMENT:
				return isSetPressionMaximalePneusRevetement();
			case SchemaPackage.TYPE_PISTE_ATTERRISSAGE__METHODE_EVALUATION_REVETEMENT:
				return isSetMethodeEvaluationRevetement();
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
		result.append(" (qFU1: ");
		result.append(qFU1);
		result.append(", pistePrincipale: ");
		if (pistePrincipaleESet) result.append(pistePrincipale); else result.append("<unset>");
		result.append(", balisage: ");
		if (balisageESet) result.append(balisage); else result.append("<unset>");
		result.append(", precisionAtterrissage: ");
		if (precisionAtterrissageESet) result.append(precisionAtterrissage); else result.append("<unset>");
		result.append(", pressionMaximale: ");
		if (pressionMaximaleESet) result.append(pressionMaximale); else result.append("<unset>");
		result.append(", revetement: ");
		if (revetementESet) result.append(revetement); else result.append("<unset>");
		result.append(", typeClassificationRevetement: ");
		if (typeClassificationRevetementESet) result.append(typeClassificationRevetement); else result.append("<unset>");
		result.append(", sousClassificationRevetement: ");
		if (sousClassificationRevetementESet) result.append(sousClassificationRevetement); else result.append("<unset>");
		result.append(", numeroClassificationRevetement: ");
		if (numeroClassificationRevetementESet) result.append(numeroClassificationRevetement); else result.append("<unset>");
		result.append(", pressionMaximalePneusRevetement: ");
		if (pressionMaximalePneusRevetementESet) result.append(pressionMaximalePneusRevetement); else result.append("<unset>");
		result.append(", methodeEvaluationRevetement: ");
		if (methodeEvaluationRevetementESet) result.append(methodeEvaluationRevetement); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypePisteAtterrissageImpl
