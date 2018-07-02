/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeAngle;
import mpia.meta.TypeDataTypeLongueur;
import mpia.meta.TypeDataTypeVitesseLineaire;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCaracteristiquesAssocInstanceObjetLocalisation;
import mpia.schema.TypeDictionaryDicoCaracteristiquesAssocInstanceObjetLocalisationVitesseRel;
import mpia.schema.TypeDictionaryDicoPrecisionAngle;
import mpia.schema.TypeDictionaryDicoPrecisionVitesse;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Caracteristiques Assoc Instance Objet Localisation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiquesAssocInstanceObjetLocalisationImpl#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiquesAssocInstanceObjetLocalisationImpl#getNomBapteme <em>Nom Bapteme</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiquesAssocInstanceObjetLocalisationImpl#getNumeroOrdre <em>Numero Ordre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiquesAssocInstanceObjetLocalisationImpl#getAngleInclinaison <em>Angle Inclinaison</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiquesAssocInstanceObjetLocalisationImpl#getIncertitudeAngleInclinaison <em>Incertitude Angle Inclinaison</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiquesAssocInstanceObjetLocalisationImpl#getIncertitudeAngleMouvement <em>Incertitude Angle Mouvement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiquesAssocInstanceObjetLocalisationImpl#getIncertitudeHorizontale <em>Incertitude Horizontale</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiquesAssocInstanceObjetLocalisationImpl#getIncertitudeVerticale <em>Incertitude Verticale</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiquesAssocInstanceObjetLocalisationImpl#getIncertitudeVitesse <em>Incertitude Vitesse</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiquesAssocInstanceObjetLocalisationImpl#getPrecisionAngleInclinaison <em>Precision Angle Inclinaison</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiquesAssocInstanceObjetLocalisationImpl#getPrecisionAngleMouvement <em>Precision Angle Mouvement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiquesAssocInstanceObjetLocalisationImpl#getPrecisionVitesse <em>Precision Vitesse</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiquesAssocInstanceObjetLocalisationImpl#getVitesseRel <em>Vitesse Rel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCaracteristiquesAssocInstanceObjetLocalisationImpl extends EObjectImpl implements TypeCaracteristiquesAssocInstanceObjetLocalisation {
	/**
	 * The default value of the '{@link #getCommentaire() <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaire()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTAIRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommentaire() <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaire()
	 * @generated
	 * @ordered
	 */
	protected String commentaire = COMMENTAIRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNomBapteme() <em>Nom Bapteme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomBapteme()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_BAPTEME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomBapteme() <em>Nom Bapteme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomBapteme()
	 * @generated
	 * @ordered
	 */
	protected String nomBapteme = NOM_BAPTEME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumeroOrdre() <em>Numero Ordre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroOrdre()
	 * @generated
	 * @ordered
	 */
	protected static final long NUMERO_ORDRE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNumeroOrdre() <em>Numero Ordre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroOrdre()
	 * @generated
	 * @ordered
	 */
	protected long numeroOrdre = NUMERO_ORDRE_EDEFAULT;

	/**
	 * This is true if the Numero Ordre attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numeroOrdreESet;

	/**
	 * The cached value of the '{@link #getAngleInclinaison() <em>Angle Inclinaison</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleInclinaison()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAngle angleInclinaison;

	/**
	 * The cached value of the '{@link #getIncertitudeAngleInclinaison() <em>Incertitude Angle Inclinaison</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncertitudeAngleInclinaison()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAngle incertitudeAngleInclinaison;

	/**
	 * The cached value of the '{@link #getIncertitudeAngleMouvement() <em>Incertitude Angle Mouvement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncertitudeAngleMouvement()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAngle incertitudeAngleMouvement;

	/**
	 * The cached value of the '{@link #getIncertitudeHorizontale() <em>Incertitude Horizontale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncertitudeHorizontale()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur incertitudeHorizontale;

	/**
	 * The cached value of the '{@link #getIncertitudeVerticale() <em>Incertitude Verticale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncertitudeVerticale()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur incertitudeVerticale;

	/**
	 * The cached value of the '{@link #getIncertitudeVitesse() <em>Incertitude Vitesse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncertitudeVitesse()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeVitesseLineaire incertitudeVitesse;

	/**
	 * The default value of the '{@link #getPrecisionAngleInclinaison() <em>Precision Angle Inclinaison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecisionAngleInclinaison()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPrecisionAngle PRECISION_ANGLE_INCLINAISON_EDEFAULT = TypeDictionaryDicoPrecisionAngle._1000MN;

	/**
	 * The cached value of the '{@link #getPrecisionAngleInclinaison() <em>Precision Angle Inclinaison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecisionAngleInclinaison()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPrecisionAngle precisionAngleInclinaison = PRECISION_ANGLE_INCLINAISON_EDEFAULT;

	/**
	 * This is true if the Precision Angle Inclinaison attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean precisionAngleInclinaisonESet;

	/**
	 * The default value of the '{@link #getPrecisionAngleMouvement() <em>Precision Angle Mouvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecisionAngleMouvement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPrecisionAngle PRECISION_ANGLE_MOUVEMENT_EDEFAULT = TypeDictionaryDicoPrecisionAngle._1000MN;

	/**
	 * The cached value of the '{@link #getPrecisionAngleMouvement() <em>Precision Angle Mouvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecisionAngleMouvement()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPrecisionAngle precisionAngleMouvement = PRECISION_ANGLE_MOUVEMENT_EDEFAULT;

	/**
	 * This is true if the Precision Angle Mouvement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean precisionAngleMouvementESet;

	/**
	 * The default value of the '{@link #getPrecisionVitesse() <em>Precision Vitesse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecisionVitesse()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPrecisionVitesse PRECISION_VITESSE_EDEFAULT = TypeDictionaryDicoPrecisionVitesse.KPH;

	/**
	 * The cached value of the '{@link #getPrecisionVitesse() <em>Precision Vitesse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecisionVitesse()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPrecisionVitesse precisionVitesse = PRECISION_VITESSE_EDEFAULT;

	/**
	 * This is true if the Precision Vitesse attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean precisionVitesseESet;

	/**
	 * The default value of the '{@link #getVitesseRel() <em>Vitesse Rel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesseRel()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCaracteristiquesAssocInstanceObjetLocalisationVitesseRel VITESSE_REL_EDEFAULT = TypeDictionaryDicoCaracteristiquesAssocInstanceObjetLocalisationVitesseRel.FAST;

	/**
	 * The cached value of the '{@link #getVitesseRel() <em>Vitesse Rel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesseRel()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCaracteristiquesAssocInstanceObjetLocalisationVitesseRel vitesseRel = VITESSE_REL_EDEFAULT;

	/**
	 * This is true if the Vitesse Rel attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean vitesseRelESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCaracteristiquesAssocInstanceObjetLocalisationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCaracteristiquesAssocInstanceObjetLocalisation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommentaire() {
		return commentaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentaire(String newCommentaire) {
		String oldCommentaire = commentaire;
		commentaire = newCommentaire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__COMMENTAIRE, oldCommentaire, commentaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomBapteme() {
		return nomBapteme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomBapteme(String newNomBapteme) {
		String oldNomBapteme = nomBapteme;
		nomBapteme = newNomBapteme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__NOM_BAPTEME, oldNomBapteme, nomBapteme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNumeroOrdre() {
		return numeroOrdre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroOrdre(long newNumeroOrdre) {
		long oldNumeroOrdre = numeroOrdre;
		numeroOrdre = newNumeroOrdre;
		boolean oldNumeroOrdreESet = numeroOrdreESet;
		numeroOrdreESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__NUMERO_ORDRE, oldNumeroOrdre, numeroOrdre, !oldNumeroOrdreESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumeroOrdre() {
		long oldNumeroOrdre = numeroOrdre;
		boolean oldNumeroOrdreESet = numeroOrdreESet;
		numeroOrdre = NUMERO_ORDRE_EDEFAULT;
		numeroOrdreESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__NUMERO_ORDRE, oldNumeroOrdre, NUMERO_ORDRE_EDEFAULT, oldNumeroOrdreESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumeroOrdre() {
		return numeroOrdreESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAngle getAngleInclinaison() {
		return angleInclinaison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngleInclinaison(TypeDataTypeAngle newAngleInclinaison, NotificationChain msgs) {
		TypeDataTypeAngle oldAngleInclinaison = angleInclinaison;
		angleInclinaison = newAngleInclinaison;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__ANGLE_INCLINAISON, oldAngleInclinaison, newAngleInclinaison);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngleInclinaison(TypeDataTypeAngle newAngleInclinaison) {
		if (newAngleInclinaison != angleInclinaison) {
			NotificationChain msgs = null;
			if (angleInclinaison != null)
				msgs = ((InternalEObject)angleInclinaison).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__ANGLE_INCLINAISON, null, msgs);
			if (newAngleInclinaison != null)
				msgs = ((InternalEObject)newAngleInclinaison).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__ANGLE_INCLINAISON, null, msgs);
			msgs = basicSetAngleInclinaison(newAngleInclinaison, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__ANGLE_INCLINAISON, newAngleInclinaison, newAngleInclinaison));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAngle getIncertitudeAngleInclinaison() {
		return incertitudeAngleInclinaison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncertitudeAngleInclinaison(TypeDataTypeAngle newIncertitudeAngleInclinaison, NotificationChain msgs) {
		TypeDataTypeAngle oldIncertitudeAngleInclinaison = incertitudeAngleInclinaison;
		incertitudeAngleInclinaison = newIncertitudeAngleInclinaison;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__INCERTITUDE_ANGLE_INCLINAISON, oldIncertitudeAngleInclinaison, newIncertitudeAngleInclinaison);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncertitudeAngleInclinaison(TypeDataTypeAngle newIncertitudeAngleInclinaison) {
		if (newIncertitudeAngleInclinaison != incertitudeAngleInclinaison) {
			NotificationChain msgs = null;
			if (incertitudeAngleInclinaison != null)
				msgs = ((InternalEObject)incertitudeAngleInclinaison).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__INCERTITUDE_ANGLE_INCLINAISON, null, msgs);
			if (newIncertitudeAngleInclinaison != null)
				msgs = ((InternalEObject)newIncertitudeAngleInclinaison).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__INCERTITUDE_ANGLE_INCLINAISON, null, msgs);
			msgs = basicSetIncertitudeAngleInclinaison(newIncertitudeAngleInclinaison, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__INCERTITUDE_ANGLE_INCLINAISON, newIncertitudeAngleInclinaison, newIncertitudeAngleInclinaison));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAngle getIncertitudeAngleMouvement() {
		return incertitudeAngleMouvement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncertitudeAngleMouvement(TypeDataTypeAngle newIncertitudeAngleMouvement, NotificationChain msgs) {
		TypeDataTypeAngle oldIncertitudeAngleMouvement = incertitudeAngleMouvement;
		incertitudeAngleMouvement = newIncertitudeAngleMouvement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__INCERTITUDE_ANGLE_MOUVEMENT, oldIncertitudeAngleMouvement, newIncertitudeAngleMouvement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncertitudeAngleMouvement(TypeDataTypeAngle newIncertitudeAngleMouvement) {
		if (newIncertitudeAngleMouvement != incertitudeAngleMouvement) {
			NotificationChain msgs = null;
			if (incertitudeAngleMouvement != null)
				msgs = ((InternalEObject)incertitudeAngleMouvement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__INCERTITUDE_ANGLE_MOUVEMENT, null, msgs);
			if (newIncertitudeAngleMouvement != null)
				msgs = ((InternalEObject)newIncertitudeAngleMouvement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__INCERTITUDE_ANGLE_MOUVEMENT, null, msgs);
			msgs = basicSetIncertitudeAngleMouvement(newIncertitudeAngleMouvement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__INCERTITUDE_ANGLE_MOUVEMENT, newIncertitudeAngleMouvement, newIncertitudeAngleMouvement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getIncertitudeHorizontale() {
		return incertitudeHorizontale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncertitudeHorizontale(TypeDataTypeLongueur newIncertitudeHorizontale, NotificationChain msgs) {
		TypeDataTypeLongueur oldIncertitudeHorizontale = incertitudeHorizontale;
		incertitudeHorizontale = newIncertitudeHorizontale;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__INCERTITUDE_HORIZONTALE, oldIncertitudeHorizontale, newIncertitudeHorizontale);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncertitudeHorizontale(TypeDataTypeLongueur newIncertitudeHorizontale) {
		if (newIncertitudeHorizontale != incertitudeHorizontale) {
			NotificationChain msgs = null;
			if (incertitudeHorizontale != null)
				msgs = ((InternalEObject)incertitudeHorizontale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__INCERTITUDE_HORIZONTALE, null, msgs);
			if (newIncertitudeHorizontale != null)
				msgs = ((InternalEObject)newIncertitudeHorizontale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__INCERTITUDE_HORIZONTALE, null, msgs);
			msgs = basicSetIncertitudeHorizontale(newIncertitudeHorizontale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__INCERTITUDE_HORIZONTALE, newIncertitudeHorizontale, newIncertitudeHorizontale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getIncertitudeVerticale() {
		return incertitudeVerticale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncertitudeVerticale(TypeDataTypeLongueur newIncertitudeVerticale, NotificationChain msgs) {
		TypeDataTypeLongueur oldIncertitudeVerticale = incertitudeVerticale;
		incertitudeVerticale = newIncertitudeVerticale;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__INCERTITUDE_VERTICALE, oldIncertitudeVerticale, newIncertitudeVerticale);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncertitudeVerticale(TypeDataTypeLongueur newIncertitudeVerticale) {
		if (newIncertitudeVerticale != incertitudeVerticale) {
			NotificationChain msgs = null;
			if (incertitudeVerticale != null)
				msgs = ((InternalEObject)incertitudeVerticale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__INCERTITUDE_VERTICALE, null, msgs);
			if (newIncertitudeVerticale != null)
				msgs = ((InternalEObject)newIncertitudeVerticale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__INCERTITUDE_VERTICALE, null, msgs);
			msgs = basicSetIncertitudeVerticale(newIncertitudeVerticale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__INCERTITUDE_VERTICALE, newIncertitudeVerticale, newIncertitudeVerticale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeVitesseLineaire getIncertitudeVitesse() {
		return incertitudeVitesse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncertitudeVitesse(TypeDataTypeVitesseLineaire newIncertitudeVitesse, NotificationChain msgs) {
		TypeDataTypeVitesseLineaire oldIncertitudeVitesse = incertitudeVitesse;
		incertitudeVitesse = newIncertitudeVitesse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__INCERTITUDE_VITESSE, oldIncertitudeVitesse, newIncertitudeVitesse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncertitudeVitesse(TypeDataTypeVitesseLineaire newIncertitudeVitesse) {
		if (newIncertitudeVitesse != incertitudeVitesse) {
			NotificationChain msgs = null;
			if (incertitudeVitesse != null)
				msgs = ((InternalEObject)incertitudeVitesse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__INCERTITUDE_VITESSE, null, msgs);
			if (newIncertitudeVitesse != null)
				msgs = ((InternalEObject)newIncertitudeVitesse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__INCERTITUDE_VITESSE, null, msgs);
			msgs = basicSetIncertitudeVitesse(newIncertitudeVitesse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__INCERTITUDE_VITESSE, newIncertitudeVitesse, newIncertitudeVitesse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPrecisionAngle getPrecisionAngleInclinaison() {
		return precisionAngleInclinaison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecisionAngleInclinaison(TypeDictionaryDicoPrecisionAngle newPrecisionAngleInclinaison) {
		TypeDictionaryDicoPrecisionAngle oldPrecisionAngleInclinaison = precisionAngleInclinaison;
		precisionAngleInclinaison = newPrecisionAngleInclinaison == null ? PRECISION_ANGLE_INCLINAISON_EDEFAULT : newPrecisionAngleInclinaison;
		boolean oldPrecisionAngleInclinaisonESet = precisionAngleInclinaisonESet;
		precisionAngleInclinaisonESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__PRECISION_ANGLE_INCLINAISON, oldPrecisionAngleInclinaison, precisionAngleInclinaison, !oldPrecisionAngleInclinaisonESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrecisionAngleInclinaison() {
		TypeDictionaryDicoPrecisionAngle oldPrecisionAngleInclinaison = precisionAngleInclinaison;
		boolean oldPrecisionAngleInclinaisonESet = precisionAngleInclinaisonESet;
		precisionAngleInclinaison = PRECISION_ANGLE_INCLINAISON_EDEFAULT;
		precisionAngleInclinaisonESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__PRECISION_ANGLE_INCLINAISON, oldPrecisionAngleInclinaison, PRECISION_ANGLE_INCLINAISON_EDEFAULT, oldPrecisionAngleInclinaisonESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrecisionAngleInclinaison() {
		return precisionAngleInclinaisonESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPrecisionAngle getPrecisionAngleMouvement() {
		return precisionAngleMouvement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecisionAngleMouvement(TypeDictionaryDicoPrecisionAngle newPrecisionAngleMouvement) {
		TypeDictionaryDicoPrecisionAngle oldPrecisionAngleMouvement = precisionAngleMouvement;
		precisionAngleMouvement = newPrecisionAngleMouvement == null ? PRECISION_ANGLE_MOUVEMENT_EDEFAULT : newPrecisionAngleMouvement;
		boolean oldPrecisionAngleMouvementESet = precisionAngleMouvementESet;
		precisionAngleMouvementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__PRECISION_ANGLE_MOUVEMENT, oldPrecisionAngleMouvement, precisionAngleMouvement, !oldPrecisionAngleMouvementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrecisionAngleMouvement() {
		TypeDictionaryDicoPrecisionAngle oldPrecisionAngleMouvement = precisionAngleMouvement;
		boolean oldPrecisionAngleMouvementESet = precisionAngleMouvementESet;
		precisionAngleMouvement = PRECISION_ANGLE_MOUVEMENT_EDEFAULT;
		precisionAngleMouvementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__PRECISION_ANGLE_MOUVEMENT, oldPrecisionAngleMouvement, PRECISION_ANGLE_MOUVEMENT_EDEFAULT, oldPrecisionAngleMouvementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrecisionAngleMouvement() {
		return precisionAngleMouvementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPrecisionVitesse getPrecisionVitesse() {
		return precisionVitesse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecisionVitesse(TypeDictionaryDicoPrecisionVitesse newPrecisionVitesse) {
		TypeDictionaryDicoPrecisionVitesse oldPrecisionVitesse = precisionVitesse;
		precisionVitesse = newPrecisionVitesse == null ? PRECISION_VITESSE_EDEFAULT : newPrecisionVitesse;
		boolean oldPrecisionVitesseESet = precisionVitesseESet;
		precisionVitesseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__PRECISION_VITESSE, oldPrecisionVitesse, precisionVitesse, !oldPrecisionVitesseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrecisionVitesse() {
		TypeDictionaryDicoPrecisionVitesse oldPrecisionVitesse = precisionVitesse;
		boolean oldPrecisionVitesseESet = precisionVitesseESet;
		precisionVitesse = PRECISION_VITESSE_EDEFAULT;
		precisionVitesseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__PRECISION_VITESSE, oldPrecisionVitesse, PRECISION_VITESSE_EDEFAULT, oldPrecisionVitesseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrecisionVitesse() {
		return precisionVitesseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCaracteristiquesAssocInstanceObjetLocalisationVitesseRel getVitesseRel() {
		return vitesseRel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVitesseRel(TypeDictionaryDicoCaracteristiquesAssocInstanceObjetLocalisationVitesseRel newVitesseRel) {
		TypeDictionaryDicoCaracteristiquesAssocInstanceObjetLocalisationVitesseRel oldVitesseRel = vitesseRel;
		vitesseRel = newVitesseRel == null ? VITESSE_REL_EDEFAULT : newVitesseRel;
		boolean oldVitesseRelESet = vitesseRelESet;
		vitesseRelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__VITESSE_REL, oldVitesseRel, vitesseRel, !oldVitesseRelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVitesseRel() {
		TypeDictionaryDicoCaracteristiquesAssocInstanceObjetLocalisationVitesseRel oldVitesseRel = vitesseRel;
		boolean oldVitesseRelESet = vitesseRelESet;
		vitesseRel = VITESSE_REL_EDEFAULT;
		vitesseRelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__VITESSE_REL, oldVitesseRel, VITESSE_REL_EDEFAULT, oldVitesseRelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVitesseRel() {
		return vitesseRelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__ANGLE_INCLINAISON:
				return basicSetAngleInclinaison(null, msgs);
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__INCERTITUDE_ANGLE_INCLINAISON:
				return basicSetIncertitudeAngleInclinaison(null, msgs);
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__INCERTITUDE_ANGLE_MOUVEMENT:
				return basicSetIncertitudeAngleMouvement(null, msgs);
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__INCERTITUDE_HORIZONTALE:
				return basicSetIncertitudeHorizontale(null, msgs);
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__INCERTITUDE_VERTICALE:
				return basicSetIncertitudeVerticale(null, msgs);
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__INCERTITUDE_VITESSE:
				return basicSetIncertitudeVitesse(null, msgs);
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
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__COMMENTAIRE:
				return getCommentaire();
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__NOM_BAPTEME:
				return getNomBapteme();
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__NUMERO_ORDRE:
				return new Long(getNumeroOrdre());
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__ANGLE_INCLINAISON:
				return getAngleInclinaison();
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__INCERTITUDE_ANGLE_INCLINAISON:
				return getIncertitudeAngleInclinaison();
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__INCERTITUDE_ANGLE_MOUVEMENT:
				return getIncertitudeAngleMouvement();
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__INCERTITUDE_HORIZONTALE:
				return getIncertitudeHorizontale();
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__INCERTITUDE_VERTICALE:
				return getIncertitudeVerticale();
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__INCERTITUDE_VITESSE:
				return getIncertitudeVitesse();
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__PRECISION_ANGLE_INCLINAISON:
				return getPrecisionAngleInclinaison();
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__PRECISION_ANGLE_MOUVEMENT:
				return getPrecisionAngleMouvement();
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__PRECISION_VITESSE:
				return getPrecisionVitesse();
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__VITESSE_REL:
				return getVitesseRel();
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
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__COMMENTAIRE:
				setCommentaire((String)newValue);
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__NOM_BAPTEME:
				setNomBapteme((String)newValue);
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__NUMERO_ORDRE:
				setNumeroOrdre(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__ANGLE_INCLINAISON:
				setAngleInclinaison((TypeDataTypeAngle)newValue);
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__INCERTITUDE_ANGLE_INCLINAISON:
				setIncertitudeAngleInclinaison((TypeDataTypeAngle)newValue);
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__INCERTITUDE_ANGLE_MOUVEMENT:
				setIncertitudeAngleMouvement((TypeDataTypeAngle)newValue);
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__INCERTITUDE_HORIZONTALE:
				setIncertitudeHorizontale((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__INCERTITUDE_VERTICALE:
				setIncertitudeVerticale((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__INCERTITUDE_VITESSE:
				setIncertitudeVitesse((TypeDataTypeVitesseLineaire)newValue);
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__PRECISION_ANGLE_INCLINAISON:
				setPrecisionAngleInclinaison((TypeDictionaryDicoPrecisionAngle)newValue);
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__PRECISION_ANGLE_MOUVEMENT:
				setPrecisionAngleMouvement((TypeDictionaryDicoPrecisionAngle)newValue);
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__PRECISION_VITESSE:
				setPrecisionVitesse((TypeDictionaryDicoPrecisionVitesse)newValue);
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__VITESSE_REL:
				setVitesseRel((TypeDictionaryDicoCaracteristiquesAssocInstanceObjetLocalisationVitesseRel)newValue);
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
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__COMMENTAIRE:
				setCommentaire(COMMENTAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__NOM_BAPTEME:
				setNomBapteme(NOM_BAPTEME_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__NUMERO_ORDRE:
				unsetNumeroOrdre();
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__ANGLE_INCLINAISON:
				setAngleInclinaison((TypeDataTypeAngle)null);
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__INCERTITUDE_ANGLE_INCLINAISON:
				setIncertitudeAngleInclinaison((TypeDataTypeAngle)null);
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__INCERTITUDE_ANGLE_MOUVEMENT:
				setIncertitudeAngleMouvement((TypeDataTypeAngle)null);
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__INCERTITUDE_HORIZONTALE:
				setIncertitudeHorizontale((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__INCERTITUDE_VERTICALE:
				setIncertitudeVerticale((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__INCERTITUDE_VITESSE:
				setIncertitudeVitesse((TypeDataTypeVitesseLineaire)null);
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__PRECISION_ANGLE_INCLINAISON:
				unsetPrecisionAngleInclinaison();
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__PRECISION_ANGLE_MOUVEMENT:
				unsetPrecisionAngleMouvement();
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__PRECISION_VITESSE:
				unsetPrecisionVitesse();
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__VITESSE_REL:
				unsetVitesseRel();
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
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__COMMENTAIRE:
				return COMMENTAIRE_EDEFAULT == null ? commentaire != null : !COMMENTAIRE_EDEFAULT.equals(commentaire);
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__NOM_BAPTEME:
				return NOM_BAPTEME_EDEFAULT == null ? nomBapteme != null : !NOM_BAPTEME_EDEFAULT.equals(nomBapteme);
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__NUMERO_ORDRE:
				return isSetNumeroOrdre();
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__ANGLE_INCLINAISON:
				return angleInclinaison != null;
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__INCERTITUDE_ANGLE_INCLINAISON:
				return incertitudeAngleInclinaison != null;
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__INCERTITUDE_ANGLE_MOUVEMENT:
				return incertitudeAngleMouvement != null;
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__INCERTITUDE_HORIZONTALE:
				return incertitudeHorizontale != null;
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__INCERTITUDE_VERTICALE:
				return incertitudeVerticale != null;
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__INCERTITUDE_VITESSE:
				return incertitudeVitesse != null;
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__PRECISION_ANGLE_INCLINAISON:
				return isSetPrecisionAngleInclinaison();
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__PRECISION_ANGLE_MOUVEMENT:
				return isSetPrecisionAngleMouvement();
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__PRECISION_VITESSE:
				return isSetPrecisionVitesse();
			case SchemaPackage.TYPE_CARACTERISTIQUES_ASSOC_INSTANCE_OBJET_LOCALISATION__VITESSE_REL:
				return isSetVitesseRel();
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
		result.append(" (commentaire: ");
		result.append(commentaire);
		result.append(", nomBapteme: ");
		result.append(nomBapteme);
		result.append(", numeroOrdre: ");
		if (numeroOrdreESet) result.append(numeroOrdre); else result.append("<unset>");
		result.append(", precisionAngleInclinaison: ");
		if (precisionAngleInclinaisonESet) result.append(precisionAngleInclinaison); else result.append("<unset>");
		result.append(", precisionAngleMouvement: ");
		if (precisionAngleMouvementESet) result.append(precisionAngleMouvement); else result.append("<unset>");
		result.append(", precisionVitesse: ");
		if (precisionVitesseESet) result.append(precisionVitesse); else result.append("<unset>");
		result.append(", vitesseRel: ");
		if (vitesseRelESet) result.append(vitesseRel); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeCaracteristiquesAssocInstanceObjetLocalisationImpl
