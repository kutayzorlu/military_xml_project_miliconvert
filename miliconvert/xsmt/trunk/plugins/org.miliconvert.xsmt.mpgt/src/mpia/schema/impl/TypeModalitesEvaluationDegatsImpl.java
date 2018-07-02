/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociationEXT;
import mpia.meta.TypeDataTypeDuree;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoEffetTactiqueASS;
import mpia.schema.TypeModalitesEvaluationDegats;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Modalites Evaluation Degats</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeModalitesEvaluationDegatsImpl#getEffetRecherche <em>Effet Recherche</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModalitesEvaluationDegatsImpl#getAutreEffetRecherche <em>Autre Effet Recherche</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModalitesEvaluationDegatsImpl#getDureeEffetRecherche <em>Duree Effet Recherche</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModalitesEvaluationDegatsImpl#getPourcentageAttenduEffet <em>Pourcentage Attendu Effet</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModalitesEvaluationDegatsImpl#getDateEvaluationObjectif <em>Date Evaluation Objectif</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModalitesEvaluationDegatsImpl#getDateDebutTraitement <em>Date Debut Traitement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModalitesEvaluationDegatsImpl#getDateFinTraitement <em>Date Fin Traitement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModalitesEvaluationDegatsImpl#getEffetSurEnvironnement <em>Effet Sur Environnement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModalitesEvaluationDegatsImpl#getAPourResponsableCoordinationUnite <em>APour Responsable Coordination Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeModalitesEvaluationDegatsImpl extends EObjectImpl implements TypeModalitesEvaluationDegats {
	/**
	 * The default value of the '{@link #getEffetRecherche() <em>Effet Recherche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffetRecherche()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEffetTactiqueASS EFFET_RECHERCHE_EDEFAULT = TypeDictionaryDicoEffetTactiqueASS.NOS;

	/**
	 * The cached value of the '{@link #getEffetRecherche() <em>Effet Recherche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffetRecherche()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEffetTactiqueASS effetRecherche = EFFET_RECHERCHE_EDEFAULT;

	/**
	 * This is true if the Effet Recherche attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean effetRechercheESet;

	/**
	 * The default value of the '{@link #getAutreEffetRecherche() <em>Autre Effet Recherche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreEffetRecherche()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTRE_EFFET_RECHERCHE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutreEffetRecherche() <em>Autre Effet Recherche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreEffetRecherche()
	 * @generated
	 * @ordered
	 */
	protected String autreEffetRecherche = AUTRE_EFFET_RECHERCHE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDureeEffetRecherche() <em>Duree Effet Recherche</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDureeEffetRecherche()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree dureeEffetRecherche;

	/**
	 * The default value of the '{@link #getPourcentageAttenduEffet() <em>Pourcentage Attendu Effet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPourcentageAttenduEffet()
	 * @generated
	 * @ordered
	 */
	protected static final double POURCENTAGE_ATTENDU_EFFET_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPourcentageAttenduEffet() <em>Pourcentage Attendu Effet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPourcentageAttenduEffet()
	 * @generated
	 * @ordered
	 */
	protected double pourcentageAttenduEffet = POURCENTAGE_ATTENDU_EFFET_EDEFAULT;

	/**
	 * This is true if the Pourcentage Attendu Effet attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pourcentageAttenduEffetESet;

	/**
	 * The default value of the '{@link #getDateEvaluationObjectif() <em>Date Evaluation Objectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateEvaluationObjectif()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_EVALUATION_OBJECTIF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateEvaluationObjectif() <em>Date Evaluation Objectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateEvaluationObjectif()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateEvaluationObjectif = DATE_EVALUATION_OBJECTIF_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateDebutTraitement() <em>Date Debut Traitement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebutTraitement()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_DEBUT_TRAITEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateDebutTraitement() <em>Date Debut Traitement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebutTraitement()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateDebutTraitement = DATE_DEBUT_TRAITEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateFinTraitement() <em>Date Fin Traitement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFinTraitement()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_FIN_TRAITEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateFinTraitement() <em>Date Fin Traitement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFinTraitement()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateFinTraitement = DATE_FIN_TRAITEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEffetSurEnvironnement() <em>Effet Sur Environnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffetSurEnvironnement()
	 * @generated
	 * @ordered
	 */
	protected static final String EFFET_SUR_ENVIRONNEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEffetSurEnvironnement() <em>Effet Sur Environnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffetSurEnvironnement()
	 * @generated
	 * @ordered
	 */
	protected String effetSurEnvironnement = EFFET_SUR_ENVIRONNEMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAPourResponsableCoordinationUnite() <em>APour Responsable Coordination Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourResponsableCoordinationUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourResponsableCoordinationUnite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeModalitesEvaluationDegatsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeModalitesEvaluationDegats();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEffetTactiqueASS getEffetRecherche() {
		return effetRecherche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffetRecherche(TypeDictionaryDicoEffetTactiqueASS newEffetRecherche) {
		TypeDictionaryDicoEffetTactiqueASS oldEffetRecherche = effetRecherche;
		effetRecherche = newEffetRecherche == null ? EFFET_RECHERCHE_EDEFAULT : newEffetRecherche;
		boolean oldEffetRechercheESet = effetRechercheESet;
		effetRechercheESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__EFFET_RECHERCHE, oldEffetRecherche, effetRecherche, !oldEffetRechercheESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEffetRecherche() {
		TypeDictionaryDicoEffetTactiqueASS oldEffetRecherche = effetRecherche;
		boolean oldEffetRechercheESet = effetRechercheESet;
		effetRecherche = EFFET_RECHERCHE_EDEFAULT;
		effetRechercheESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__EFFET_RECHERCHE, oldEffetRecherche, EFFET_RECHERCHE_EDEFAULT, oldEffetRechercheESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEffetRecherche() {
		return effetRechercheESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutreEffetRecherche() {
		return autreEffetRecherche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutreEffetRecherche(String newAutreEffetRecherche) {
		String oldAutreEffetRecherche = autreEffetRecherche;
		autreEffetRecherche = newAutreEffetRecherche;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__AUTRE_EFFET_RECHERCHE, oldAutreEffetRecherche, autreEffetRecherche));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getDureeEffetRecherche() {
		return dureeEffetRecherche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDureeEffetRecherche(TypeDataTypeDuree newDureeEffetRecherche, NotificationChain msgs) {
		TypeDataTypeDuree oldDureeEffetRecherche = dureeEffetRecherche;
		dureeEffetRecherche = newDureeEffetRecherche;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__DUREE_EFFET_RECHERCHE, oldDureeEffetRecherche, newDureeEffetRecherche);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDureeEffetRecherche(TypeDataTypeDuree newDureeEffetRecherche) {
		if (newDureeEffetRecherche != dureeEffetRecherche) {
			NotificationChain msgs = null;
			if (dureeEffetRecherche != null)
				msgs = ((InternalEObject)dureeEffetRecherche).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__DUREE_EFFET_RECHERCHE, null, msgs);
			if (newDureeEffetRecherche != null)
				msgs = ((InternalEObject)newDureeEffetRecherche).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__DUREE_EFFET_RECHERCHE, null, msgs);
			msgs = basicSetDureeEffetRecherche(newDureeEffetRecherche, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__DUREE_EFFET_RECHERCHE, newDureeEffetRecherche, newDureeEffetRecherche));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPourcentageAttenduEffet() {
		return pourcentageAttenduEffet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPourcentageAttenduEffet(double newPourcentageAttenduEffet) {
		double oldPourcentageAttenduEffet = pourcentageAttenduEffet;
		pourcentageAttenduEffet = newPourcentageAttenduEffet;
		boolean oldPourcentageAttenduEffetESet = pourcentageAttenduEffetESet;
		pourcentageAttenduEffetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__POURCENTAGE_ATTENDU_EFFET, oldPourcentageAttenduEffet, pourcentageAttenduEffet, !oldPourcentageAttenduEffetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPourcentageAttenduEffet() {
		double oldPourcentageAttenduEffet = pourcentageAttenduEffet;
		boolean oldPourcentageAttenduEffetESet = pourcentageAttenduEffetESet;
		pourcentageAttenduEffet = POURCENTAGE_ATTENDU_EFFET_EDEFAULT;
		pourcentageAttenduEffetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__POURCENTAGE_ATTENDU_EFFET, oldPourcentageAttenduEffet, POURCENTAGE_ATTENDU_EFFET_EDEFAULT, oldPourcentageAttenduEffetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPourcentageAttenduEffet() {
		return pourcentageAttenduEffetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateEvaluationObjectif() {
		return dateEvaluationObjectif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateEvaluationObjectif(XMLGregorianCalendar newDateEvaluationObjectif) {
		XMLGregorianCalendar oldDateEvaluationObjectif = dateEvaluationObjectif;
		dateEvaluationObjectif = newDateEvaluationObjectif;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__DATE_EVALUATION_OBJECTIF, oldDateEvaluationObjectif, dateEvaluationObjectif));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateDebutTraitement() {
		return dateDebutTraitement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDebutTraitement(XMLGregorianCalendar newDateDebutTraitement) {
		XMLGregorianCalendar oldDateDebutTraitement = dateDebutTraitement;
		dateDebutTraitement = newDateDebutTraitement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__DATE_DEBUT_TRAITEMENT, oldDateDebutTraitement, dateDebutTraitement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateFinTraitement() {
		return dateFinTraitement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateFinTraitement(XMLGregorianCalendar newDateFinTraitement) {
		XMLGregorianCalendar oldDateFinTraitement = dateFinTraitement;
		dateFinTraitement = newDateFinTraitement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__DATE_FIN_TRAITEMENT, oldDateFinTraitement, dateFinTraitement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEffetSurEnvironnement() {
		return effetSurEnvironnement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffetSurEnvironnement(String newEffetSurEnvironnement) {
		String oldEffetSurEnvironnement = effetSurEnvironnement;
		effetSurEnvironnement = newEffetSurEnvironnement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__EFFET_SUR_ENVIRONNEMENT, oldEffetSurEnvironnement, effetSurEnvironnement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourResponsableCoordinationUnite() {
		return aPourResponsableCoordinationUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourResponsableCoordinationUnite(TypeAssociationEXT newAPourResponsableCoordinationUnite, NotificationChain msgs) {
		TypeAssociationEXT oldAPourResponsableCoordinationUnite = aPourResponsableCoordinationUnite;
		aPourResponsableCoordinationUnite = newAPourResponsableCoordinationUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__APOUR_RESPONSABLE_COORDINATION_UNITE, oldAPourResponsableCoordinationUnite, newAPourResponsableCoordinationUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourResponsableCoordinationUnite(TypeAssociationEXT newAPourResponsableCoordinationUnite) {
		if (newAPourResponsableCoordinationUnite != aPourResponsableCoordinationUnite) {
			NotificationChain msgs = null;
			if (aPourResponsableCoordinationUnite != null)
				msgs = ((InternalEObject)aPourResponsableCoordinationUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__APOUR_RESPONSABLE_COORDINATION_UNITE, null, msgs);
			if (newAPourResponsableCoordinationUnite != null)
				msgs = ((InternalEObject)newAPourResponsableCoordinationUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__APOUR_RESPONSABLE_COORDINATION_UNITE, null, msgs);
			msgs = basicSetAPourResponsableCoordinationUnite(newAPourResponsableCoordinationUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__APOUR_RESPONSABLE_COORDINATION_UNITE, newAPourResponsableCoordinationUnite, newAPourResponsableCoordinationUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__DUREE_EFFET_RECHERCHE:
				return basicSetDureeEffetRecherche(null, msgs);
			case SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__APOUR_RESPONSABLE_COORDINATION_UNITE:
				return basicSetAPourResponsableCoordinationUnite(null, msgs);
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
			case SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__EFFET_RECHERCHE:
				return getEffetRecherche();
			case SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__AUTRE_EFFET_RECHERCHE:
				return getAutreEffetRecherche();
			case SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__DUREE_EFFET_RECHERCHE:
				return getDureeEffetRecherche();
			case SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__POURCENTAGE_ATTENDU_EFFET:
				return new Double(getPourcentageAttenduEffet());
			case SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__DATE_EVALUATION_OBJECTIF:
				return getDateEvaluationObjectif();
			case SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__DATE_DEBUT_TRAITEMENT:
				return getDateDebutTraitement();
			case SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__DATE_FIN_TRAITEMENT:
				return getDateFinTraitement();
			case SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__EFFET_SUR_ENVIRONNEMENT:
				return getEffetSurEnvironnement();
			case SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__APOUR_RESPONSABLE_COORDINATION_UNITE:
				return getAPourResponsableCoordinationUnite();
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
			case SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__EFFET_RECHERCHE:
				setEffetRecherche((TypeDictionaryDicoEffetTactiqueASS)newValue);
				return;
			case SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__AUTRE_EFFET_RECHERCHE:
				setAutreEffetRecherche((String)newValue);
				return;
			case SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__DUREE_EFFET_RECHERCHE:
				setDureeEffetRecherche((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__POURCENTAGE_ATTENDU_EFFET:
				setPourcentageAttenduEffet(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__DATE_EVALUATION_OBJECTIF:
				setDateEvaluationObjectif((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__DATE_DEBUT_TRAITEMENT:
				setDateDebutTraitement((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__DATE_FIN_TRAITEMENT:
				setDateFinTraitement((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__EFFET_SUR_ENVIRONNEMENT:
				setEffetSurEnvironnement((String)newValue);
				return;
			case SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__APOUR_RESPONSABLE_COORDINATION_UNITE:
				setAPourResponsableCoordinationUnite((TypeAssociationEXT)newValue);
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
			case SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__EFFET_RECHERCHE:
				unsetEffetRecherche();
				return;
			case SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__AUTRE_EFFET_RECHERCHE:
				setAutreEffetRecherche(AUTRE_EFFET_RECHERCHE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__DUREE_EFFET_RECHERCHE:
				setDureeEffetRecherche((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__POURCENTAGE_ATTENDU_EFFET:
				unsetPourcentageAttenduEffet();
				return;
			case SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__DATE_EVALUATION_OBJECTIF:
				setDateEvaluationObjectif(DATE_EVALUATION_OBJECTIF_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__DATE_DEBUT_TRAITEMENT:
				setDateDebutTraitement(DATE_DEBUT_TRAITEMENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__DATE_FIN_TRAITEMENT:
				setDateFinTraitement(DATE_FIN_TRAITEMENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__EFFET_SUR_ENVIRONNEMENT:
				setEffetSurEnvironnement(EFFET_SUR_ENVIRONNEMENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__APOUR_RESPONSABLE_COORDINATION_UNITE:
				setAPourResponsableCoordinationUnite((TypeAssociationEXT)null);
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
			case SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__EFFET_RECHERCHE:
				return isSetEffetRecherche();
			case SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__AUTRE_EFFET_RECHERCHE:
				return AUTRE_EFFET_RECHERCHE_EDEFAULT == null ? autreEffetRecherche != null : !AUTRE_EFFET_RECHERCHE_EDEFAULT.equals(autreEffetRecherche);
			case SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__DUREE_EFFET_RECHERCHE:
				return dureeEffetRecherche != null;
			case SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__POURCENTAGE_ATTENDU_EFFET:
				return isSetPourcentageAttenduEffet();
			case SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__DATE_EVALUATION_OBJECTIF:
				return DATE_EVALUATION_OBJECTIF_EDEFAULT == null ? dateEvaluationObjectif != null : !DATE_EVALUATION_OBJECTIF_EDEFAULT.equals(dateEvaluationObjectif);
			case SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__DATE_DEBUT_TRAITEMENT:
				return DATE_DEBUT_TRAITEMENT_EDEFAULT == null ? dateDebutTraitement != null : !DATE_DEBUT_TRAITEMENT_EDEFAULT.equals(dateDebutTraitement);
			case SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__DATE_FIN_TRAITEMENT:
				return DATE_FIN_TRAITEMENT_EDEFAULT == null ? dateFinTraitement != null : !DATE_FIN_TRAITEMENT_EDEFAULT.equals(dateFinTraitement);
			case SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__EFFET_SUR_ENVIRONNEMENT:
				return EFFET_SUR_ENVIRONNEMENT_EDEFAULT == null ? effetSurEnvironnement != null : !EFFET_SUR_ENVIRONNEMENT_EDEFAULT.equals(effetSurEnvironnement);
			case SchemaPackage.TYPE_MODALITES_EVALUATION_DEGATS__APOUR_RESPONSABLE_COORDINATION_UNITE:
				return aPourResponsableCoordinationUnite != null;
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
		result.append(" (effetRecherche: ");
		if (effetRechercheESet) result.append(effetRecherche); else result.append("<unset>");
		result.append(", autreEffetRecherche: ");
		result.append(autreEffetRecherche);
		result.append(", pourcentageAttenduEffet: ");
		if (pourcentageAttenduEffetESet) result.append(pourcentageAttenduEffet); else result.append("<unset>");
		result.append(", dateEvaluationObjectif: ");
		result.append(dateEvaluationObjectif);
		result.append(", dateDebutTraitement: ");
		result.append(dateDebutTraitement);
		result.append(", dateFinTraitement: ");
		result.append(dateFinTraitement);
		result.append(", effetSurEnvironnement: ");
		result.append(effetSurEnvironnement);
		result.append(')');
		return result.toString();
	}

} //TypeModalitesEvaluationDegatsImpl
