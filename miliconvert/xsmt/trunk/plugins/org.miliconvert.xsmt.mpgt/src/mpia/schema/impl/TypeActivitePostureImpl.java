/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;
import mpia.meta.TypeDataTypeAngle;
import mpia.meta.TypeDataTypeVitesseLineaire;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeActivitePosture;
import mpia.schema.TypeDictionaryDicoActivitePostureCategorie;
import mpia.schema.TypeDictionaryDicoMissionNiveauConfirmation;
import mpia.schema.TypeLocalisation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Activite Posture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeActivitePostureImpl#getDescriptionGeneraleObjectif <em>Description Generale Objectif</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActivitePostureImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActivitePostureImpl#getVitesse <em>Vitesse</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActivitePostureImpl#getAngleMouvement <em>Angle Mouvement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActivitePostureImpl#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActivitePostureImpl#getNbAxesActivite <em>Nb Axes Activite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActivitePostureImpl#getNiveauConfirmation <em>Niveau Confirmation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActivitePostureImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActivitePostureImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActivitePostureImpl#getEstLocaliseEnLocalisation <em>Est Localise En Localisation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActivitePostureImpl#getAPourObjectifActiviteInstanceObjet <em>APour Objectif Activite Instance Objet</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActivitePostureImpl#getConcerneObservation <em>Concerne Observation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActivitePostureImpl#getConcerneUnite <em>Concerne Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeActivitePostureImpl extends EObjectImpl implements TypeActivitePosture {
	/**
	 * The default value of the '{@link #getDescriptionGeneraleObjectif() <em>Description Generale Objectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionGeneraleObjectif()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_GENERALE_OBJECTIF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescriptionGeneraleObjectif() <em>Description Generale Objectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionGeneraleObjectif()
	 * @generated
	 * @ordered
	 */
	protected String descriptionGeneraleObjectif = DESCRIPTION_GENERALE_OBJECTIF_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoActivitePostureCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoActivitePostureCategorie.ARASLT;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoActivitePostureCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The cached value of the '{@link #getVitesse() <em>Vitesse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesse()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeVitesseLineaire vitesse;

	/**
	 * The cached value of the '{@link #getAngleMouvement() <em>Angle Mouvement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleMouvement()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAngle angleMouvement;

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
	 * The default value of the '{@link #getNbAxesActivite() <em>Nb Axes Activite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbAxesActivite()
	 * @generated
	 * @ordered
	 */
	protected static final long NB_AXES_ACTIVITE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNbAxesActivite() <em>Nb Axes Activite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbAxesActivite()
	 * @generated
	 * @ordered
	 */
	protected long nbAxesActivite = NB_AXES_ACTIVITE_EDEFAULT;

	/**
	 * This is true if the Nb Axes Activite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nbAxesActiviteESet;

	/**
	 * The default value of the '{@link #getNiveauConfirmation() <em>Niveau Confirmation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauConfirmation()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMissionNiveauConfirmation NIVEAU_CONFIRMATION_EDEFAULT = TypeDictionaryDicoMissionNiveauConfirmation.A;

	/**
	 * The cached value of the '{@link #getNiveauConfirmation() <em>Niveau Confirmation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauConfirmation()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMissionNiveauConfirmation niveauConfirmation = NIVEAU_CONFIRMATION_EDEFAULT;

	/**
	 * This is true if the Niveau Confirmation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean niveauConfirmationESet;

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
	 * The cached value of the '{@link #getEstLocaliseEnLocalisation() <em>Est Localise En Localisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstLocaliseEnLocalisation()
	 * @generated
	 * @ordered
	 */
	protected TypeLocalisation estLocaliseEnLocalisation;

	/**
	 * The cached value of the '{@link #getAPourObjectifActiviteInstanceObjet() <em>APour Objectif Activite Instance Objet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourObjectifActiviteInstanceObjet()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourObjectifActiviteInstanceObjet;

	/**
	 * The cached value of the '{@link #getConcerneObservation() <em>Concerne Observation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneObservation()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation concerneObservation;

	/**
	 * The cached value of the '{@link #getConcerneUnite() <em>Concerne Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT concerneUnite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeActivitePostureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeActivitePosture();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescriptionGeneraleObjectif() {
		return descriptionGeneraleObjectif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptionGeneraleObjectif(String newDescriptionGeneraleObjectif) {
		String oldDescriptionGeneraleObjectif = descriptionGeneraleObjectif;
		descriptionGeneraleObjectif = newDescriptionGeneraleObjectif;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTIVITE_POSTURE__DESCRIPTION_GENERALE_OBJECTIF, oldDescriptionGeneraleObjectif, descriptionGeneraleObjectif));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoActivitePostureCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoActivitePostureCategorie newCategorie) {
		TypeDictionaryDicoActivitePostureCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTIVITE_POSTURE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoActivitePostureCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ACTIVITE_POSTURE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeDataTypeVitesseLineaire getVitesse() {
		return vitesse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVitesse(TypeDataTypeVitesseLineaire newVitesse, NotificationChain msgs) {
		TypeDataTypeVitesseLineaire oldVitesse = vitesse;
		vitesse = newVitesse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTIVITE_POSTURE__VITESSE, oldVitesse, newVitesse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVitesse(TypeDataTypeVitesseLineaire newVitesse) {
		if (newVitesse != vitesse) {
			NotificationChain msgs = null;
			if (vitesse != null)
				msgs = ((InternalEObject)vitesse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ACTIVITE_POSTURE__VITESSE, null, msgs);
			if (newVitesse != null)
				msgs = ((InternalEObject)newVitesse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ACTIVITE_POSTURE__VITESSE, null, msgs);
			msgs = basicSetVitesse(newVitesse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTIVITE_POSTURE__VITESSE, newVitesse, newVitesse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAngle getAngleMouvement() {
		return angleMouvement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngleMouvement(TypeDataTypeAngle newAngleMouvement, NotificationChain msgs) {
		TypeDataTypeAngle oldAngleMouvement = angleMouvement;
		angleMouvement = newAngleMouvement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTIVITE_POSTURE__ANGLE_MOUVEMENT, oldAngleMouvement, newAngleMouvement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngleMouvement(TypeDataTypeAngle newAngleMouvement) {
		if (newAngleMouvement != angleMouvement) {
			NotificationChain msgs = null;
			if (angleMouvement != null)
				msgs = ((InternalEObject)angleMouvement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ACTIVITE_POSTURE__ANGLE_MOUVEMENT, null, msgs);
			if (newAngleMouvement != null)
				msgs = ((InternalEObject)newAngleMouvement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ACTIVITE_POSTURE__ANGLE_MOUVEMENT, null, msgs);
			msgs = basicSetAngleMouvement(newAngleMouvement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTIVITE_POSTURE__ANGLE_MOUVEMENT, newAngleMouvement, newAngleMouvement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTIVITE_POSTURE__COMMENTAIRE, oldCommentaire, commentaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNbAxesActivite() {
		return nbAxesActivite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbAxesActivite(long newNbAxesActivite) {
		long oldNbAxesActivite = nbAxesActivite;
		nbAxesActivite = newNbAxesActivite;
		boolean oldNbAxesActiviteESet = nbAxesActiviteESet;
		nbAxesActiviteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTIVITE_POSTURE__NB_AXES_ACTIVITE, oldNbAxesActivite, nbAxesActivite, !oldNbAxesActiviteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNbAxesActivite() {
		long oldNbAxesActivite = nbAxesActivite;
		boolean oldNbAxesActiviteESet = nbAxesActiviteESet;
		nbAxesActivite = NB_AXES_ACTIVITE_EDEFAULT;
		nbAxesActiviteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ACTIVITE_POSTURE__NB_AXES_ACTIVITE, oldNbAxesActivite, NB_AXES_ACTIVITE_EDEFAULT, oldNbAxesActiviteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNbAxesActivite() {
		return nbAxesActiviteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMissionNiveauConfirmation getNiveauConfirmation() {
		return niveauConfirmation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNiveauConfirmation(TypeDictionaryDicoMissionNiveauConfirmation newNiveauConfirmation) {
		TypeDictionaryDicoMissionNiveauConfirmation oldNiveauConfirmation = niveauConfirmation;
		niveauConfirmation = newNiveauConfirmation == null ? NIVEAU_CONFIRMATION_EDEFAULT : newNiveauConfirmation;
		boolean oldNiveauConfirmationESet = niveauConfirmationESet;
		niveauConfirmationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTIVITE_POSTURE__NIVEAU_CONFIRMATION, oldNiveauConfirmation, niveauConfirmation, !oldNiveauConfirmationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNiveauConfirmation() {
		TypeDictionaryDicoMissionNiveauConfirmation oldNiveauConfirmation = niveauConfirmation;
		boolean oldNiveauConfirmationESet = niveauConfirmationESet;
		niveauConfirmation = NIVEAU_CONFIRMATION_EDEFAULT;
		niveauConfirmationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ACTIVITE_POSTURE__NIVEAU_CONFIRMATION, oldNiveauConfirmation, NIVEAU_CONFIRMATION_EDEFAULT, oldNiveauConfirmationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNiveauConfirmation() {
		return niveauConfirmationESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTIVITE_POSTURE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTIVITE_POSTURE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeLocalisation getEstLocaliseEnLocalisation() {
		return estLocaliseEnLocalisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstLocaliseEnLocalisation(TypeLocalisation newEstLocaliseEnLocalisation, NotificationChain msgs) {
		TypeLocalisation oldEstLocaliseEnLocalisation = estLocaliseEnLocalisation;
		estLocaliseEnLocalisation = newEstLocaliseEnLocalisation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTIVITE_POSTURE__EST_LOCALISE_EN_LOCALISATION, oldEstLocaliseEnLocalisation, newEstLocaliseEnLocalisation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstLocaliseEnLocalisation(TypeLocalisation newEstLocaliseEnLocalisation) {
		if (newEstLocaliseEnLocalisation != estLocaliseEnLocalisation) {
			NotificationChain msgs = null;
			if (estLocaliseEnLocalisation != null)
				msgs = ((InternalEObject)estLocaliseEnLocalisation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ACTIVITE_POSTURE__EST_LOCALISE_EN_LOCALISATION, null, msgs);
			if (newEstLocaliseEnLocalisation != null)
				msgs = ((InternalEObject)newEstLocaliseEnLocalisation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ACTIVITE_POSTURE__EST_LOCALISE_EN_LOCALISATION, null, msgs);
			msgs = basicSetEstLocaliseEnLocalisation(newEstLocaliseEnLocalisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTIVITE_POSTURE__EST_LOCALISE_EN_LOCALISATION, newEstLocaliseEnLocalisation, newEstLocaliseEnLocalisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourObjectifActiviteInstanceObjet() {
		return aPourObjectifActiviteInstanceObjet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourObjectifActiviteInstanceObjet(TypeAssociation newAPourObjectifActiviteInstanceObjet, NotificationChain msgs) {
		TypeAssociation oldAPourObjectifActiviteInstanceObjet = aPourObjectifActiviteInstanceObjet;
		aPourObjectifActiviteInstanceObjet = newAPourObjectifActiviteInstanceObjet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTIVITE_POSTURE__APOUR_OBJECTIF_ACTIVITE_INSTANCE_OBJET, oldAPourObjectifActiviteInstanceObjet, newAPourObjectifActiviteInstanceObjet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourObjectifActiviteInstanceObjet(TypeAssociation newAPourObjectifActiviteInstanceObjet) {
		if (newAPourObjectifActiviteInstanceObjet != aPourObjectifActiviteInstanceObjet) {
			NotificationChain msgs = null;
			if (aPourObjectifActiviteInstanceObjet != null)
				msgs = ((InternalEObject)aPourObjectifActiviteInstanceObjet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ACTIVITE_POSTURE__APOUR_OBJECTIF_ACTIVITE_INSTANCE_OBJET, null, msgs);
			if (newAPourObjectifActiviteInstanceObjet != null)
				msgs = ((InternalEObject)newAPourObjectifActiviteInstanceObjet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ACTIVITE_POSTURE__APOUR_OBJECTIF_ACTIVITE_INSTANCE_OBJET, null, msgs);
			msgs = basicSetAPourObjectifActiviteInstanceObjet(newAPourObjectifActiviteInstanceObjet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTIVITE_POSTURE__APOUR_OBJECTIF_ACTIVITE_INSTANCE_OBJET, newAPourObjectifActiviteInstanceObjet, newAPourObjectifActiviteInstanceObjet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getConcerneObservation() {
		return concerneObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcerneObservation(TypeAssociation newConcerneObservation, NotificationChain msgs) {
		TypeAssociation oldConcerneObservation = concerneObservation;
		concerneObservation = newConcerneObservation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTIVITE_POSTURE__CONCERNE_OBSERVATION, oldConcerneObservation, newConcerneObservation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcerneObservation(TypeAssociation newConcerneObservation) {
		if (newConcerneObservation != concerneObservation) {
			NotificationChain msgs = null;
			if (concerneObservation != null)
				msgs = ((InternalEObject)concerneObservation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ACTIVITE_POSTURE__CONCERNE_OBSERVATION, null, msgs);
			if (newConcerneObservation != null)
				msgs = ((InternalEObject)newConcerneObservation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ACTIVITE_POSTURE__CONCERNE_OBSERVATION, null, msgs);
			msgs = basicSetConcerneObservation(newConcerneObservation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTIVITE_POSTURE__CONCERNE_OBSERVATION, newConcerneObservation, newConcerneObservation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getConcerneUnite() {
		return concerneUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcerneUnite(TypeAssociationEXT newConcerneUnite, NotificationChain msgs) {
		TypeAssociationEXT oldConcerneUnite = concerneUnite;
		concerneUnite = newConcerneUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTIVITE_POSTURE__CONCERNE_UNITE, oldConcerneUnite, newConcerneUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcerneUnite(TypeAssociationEXT newConcerneUnite) {
		if (newConcerneUnite != concerneUnite) {
			NotificationChain msgs = null;
			if (concerneUnite != null)
				msgs = ((InternalEObject)concerneUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ACTIVITE_POSTURE__CONCERNE_UNITE, null, msgs);
			if (newConcerneUnite != null)
				msgs = ((InternalEObject)newConcerneUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ACTIVITE_POSTURE__CONCERNE_UNITE, null, msgs);
			msgs = basicSetConcerneUnite(newConcerneUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTIVITE_POSTURE__CONCERNE_UNITE, newConcerneUnite, newConcerneUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__VITESSE:
				return basicSetVitesse(null, msgs);
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__ANGLE_MOUVEMENT:
				return basicSetAngleMouvement(null, msgs);
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__EST_LOCALISE_EN_LOCALISATION:
				return basicSetEstLocaliseEnLocalisation(null, msgs);
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__APOUR_OBJECTIF_ACTIVITE_INSTANCE_OBJET:
				return basicSetAPourObjectifActiviteInstanceObjet(null, msgs);
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__CONCERNE_OBSERVATION:
				return basicSetConcerneObservation(null, msgs);
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__CONCERNE_UNITE:
				return basicSetConcerneUnite(null, msgs);
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
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__DESCRIPTION_GENERALE_OBJECTIF:
				return getDescriptionGeneraleObjectif();
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__VITESSE:
				return getVitesse();
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__ANGLE_MOUVEMENT:
				return getAngleMouvement();
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__COMMENTAIRE:
				return getCommentaire();
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__NB_AXES_ACTIVITE:
				return new Long(getNbAxesActivite());
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__NIVEAU_CONFIRMATION:
				return getNiveauConfirmation();
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__CE:
				return getCE();
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__EST_LOCALISE_EN_LOCALISATION:
				return getEstLocaliseEnLocalisation();
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__APOUR_OBJECTIF_ACTIVITE_INSTANCE_OBJET:
				return getAPourObjectifActiviteInstanceObjet();
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__CONCERNE_OBSERVATION:
				return getConcerneObservation();
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__CONCERNE_UNITE:
				return getConcerneUnite();
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
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__DESCRIPTION_GENERALE_OBJECTIF:
				setDescriptionGeneraleObjectif((String)newValue);
				return;
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__CATEGORIE:
				setCategorie((TypeDictionaryDicoActivitePostureCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__VITESSE:
				setVitesse((TypeDataTypeVitesseLineaire)newValue);
				return;
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__ANGLE_MOUVEMENT:
				setAngleMouvement((TypeDataTypeAngle)newValue);
				return;
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__COMMENTAIRE:
				setCommentaire((String)newValue);
				return;
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__NB_AXES_ACTIVITE:
				setNbAxesActivite(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__NIVEAU_CONFIRMATION:
				setNiveauConfirmation((TypeDictionaryDicoMissionNiveauConfirmation)newValue);
				return;
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__EST_LOCALISE_EN_LOCALISATION:
				setEstLocaliseEnLocalisation((TypeLocalisation)newValue);
				return;
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__APOUR_OBJECTIF_ACTIVITE_INSTANCE_OBJET:
				setAPourObjectifActiviteInstanceObjet((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__CONCERNE_OBSERVATION:
				setConcerneObservation((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__CONCERNE_UNITE:
				setConcerneUnite((TypeAssociationEXT)newValue);
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
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__DESCRIPTION_GENERALE_OBJECTIF:
				setDescriptionGeneraleObjectif(DESCRIPTION_GENERALE_OBJECTIF_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__VITESSE:
				setVitesse((TypeDataTypeVitesseLineaire)null);
				return;
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__ANGLE_MOUVEMENT:
				setAngleMouvement((TypeDataTypeAngle)null);
				return;
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__COMMENTAIRE:
				setCommentaire(COMMENTAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__NB_AXES_ACTIVITE:
				unsetNbAxesActivite();
				return;
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__NIVEAU_CONFIRMATION:
				unsetNiveauConfirmation();
				return;
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__EST_LOCALISE_EN_LOCALISATION:
				setEstLocaliseEnLocalisation((TypeLocalisation)null);
				return;
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__APOUR_OBJECTIF_ACTIVITE_INSTANCE_OBJET:
				setAPourObjectifActiviteInstanceObjet((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__CONCERNE_OBSERVATION:
				setConcerneObservation((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__CONCERNE_UNITE:
				setConcerneUnite((TypeAssociationEXT)null);
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
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__DESCRIPTION_GENERALE_OBJECTIF:
				return DESCRIPTION_GENERALE_OBJECTIF_EDEFAULT == null ? descriptionGeneraleObjectif != null : !DESCRIPTION_GENERALE_OBJECTIF_EDEFAULT.equals(descriptionGeneraleObjectif);
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__VITESSE:
				return vitesse != null;
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__ANGLE_MOUVEMENT:
				return angleMouvement != null;
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__COMMENTAIRE:
				return COMMENTAIRE_EDEFAULT == null ? commentaire != null : !COMMENTAIRE_EDEFAULT.equals(commentaire);
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__NB_AXES_ACTIVITE:
				return isSetNbAxesActivite();
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__NIVEAU_CONFIRMATION:
				return isSetNiveauConfirmation();
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__EST_LOCALISE_EN_LOCALISATION:
				return estLocaliseEnLocalisation != null;
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__APOUR_OBJECTIF_ACTIVITE_INSTANCE_OBJET:
				return aPourObjectifActiviteInstanceObjet != null;
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__CONCERNE_OBSERVATION:
				return concerneObservation != null;
			case SchemaPackage.TYPE_ACTIVITE_POSTURE__CONCERNE_UNITE:
				return concerneUnite != null;
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
		result.append(" (descriptionGeneraleObjectif: ");
		result.append(descriptionGeneraleObjectif);
		result.append(", categorie: ");
		if (categorieESet) result.append(categorie); else result.append("<unset>");
		result.append(", commentaire: ");
		result.append(commentaire);
		result.append(", nbAxesActivite: ");
		if (nbAxesActiviteESet) result.append(nbAxesActivite); else result.append("<unset>");
		result.append(", niveauConfirmation: ");
		if (niveauConfirmationESet) result.append(niveauConfirmation); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeActivitePostureImpl
