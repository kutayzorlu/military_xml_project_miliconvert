/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeDuree;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDatation;
import mpia.schema.TypeDictionaryDicoHoraireManoeuvreNiveau;
import mpia.schema.TypeDictionaryDicoHoraireManoeuvrePhaseOuTemps;
import mpia.schema.TypeHoraireManoeuvre;
import mpia.schema.TypePrioriteTactiqueLogistique;

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
 * An implementation of the model object '<em><b>Type Horaire Manoeuvre</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeHoraireManoeuvreImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeHoraireManoeuvreImpl#getPhaseOuTemps <em>Phase Ou Temps</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeHoraireManoeuvreImpl#getNiveau <em>Niveau</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeHoraireManoeuvreImpl#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeHoraireManoeuvreImpl#getDateFin <em>Date Fin</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeHoraireManoeuvreImpl#getDureeTemps <em>Duree Temps</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeHoraireManoeuvreImpl#getDateDebutCalculee <em>Date Debut Calculee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeHoraireManoeuvreImpl#getDateFinCalculee <em>Date Fin Calculee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeHoraireManoeuvreImpl#getContraintesHoraires <em>Contraintes Horaires</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeHoraireManoeuvreImpl#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeHoraireManoeuvreImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeHoraireManoeuvreImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeHoraireManoeuvreImpl#getEstObjetAssociationHoraireManoeuvre <em>Est Objet Association Horaire Manoeuvre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeHoraireManoeuvreImpl#getEstSujetAssociationHoraireManoeuvre <em>Est Sujet Association Horaire Manoeuvre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeHoraireManoeuvreImpl#getConcerneMissionsActivite <em>Concerne Missions Activite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeHoraireManoeuvreImpl#getAPourPrioritesTactiquesLogistiquesPrioriteTactiqueLogistique <em>APour Priorites Tactiques Logistiques Priorite Tactique Logistique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeHoraireManoeuvreImpl#getDecritRapportForceRapportForce <em>Decrit Rapport Force Rapport Force</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeHoraireManoeuvreImpl#getACommeConsignesApplicablesConsigne <em>AComme Consignes Applicables Consigne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeHoraireManoeuvreImpl#getACommePointEntreeConsigne <em>AComme Point Entree Consigne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeHoraireManoeuvreImpl#getACommePointSortieConsigne <em>AComme Point Sortie Consigne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeHoraireManoeuvreImpl#getAPourDateDebutDatation <em>APour Date Debut Datation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeHoraireManoeuvreImpl#getAPourDateFinDatation <em>APour Date Fin Datation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeHoraireManoeuvreImpl extends EObjectImpl implements TypeHoraireManoeuvre {
	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhaseOuTemps() <em>Phase Ou Temps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseOuTemps()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoHoraireManoeuvrePhaseOuTemps PHASE_OU_TEMPS_EDEFAULT = TypeDictionaryDicoHoraireManoeuvrePhaseOuTemps.PHASE;

	/**
	 * The cached value of the '{@link #getPhaseOuTemps() <em>Phase Ou Temps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseOuTemps()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoHoraireManoeuvrePhaseOuTemps phaseOuTemps = PHASE_OU_TEMPS_EDEFAULT;

	/**
	 * This is true if the Phase Ou Temps attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean phaseOuTempsESet;

	/**
	 * The default value of the '{@link #getNiveau() <em>Niveau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveau()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoHoraireManoeuvreNiveau NIVEAU_EDEFAULT = TypeDictionaryDicoHoraireManoeuvreNiveau.MU;

	/**
	 * The cached value of the '{@link #getNiveau() <em>Niveau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveau()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoHoraireManoeuvreNiveau niveau = NIVEAU_EDEFAULT;

	/**
	 * This is true if the Niveau attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean niveauESet;

	/**
	 * The default value of the '{@link #getDateDebut() <em>Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebut()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_DEBUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateDebut() <em>Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebut()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateDebut = DATE_DEBUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateFin() <em>Date Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFin()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_FIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateFin() <em>Date Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFin()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateFin = DATE_FIN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDureeTemps() <em>Duree Temps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDureeTemps()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree dureeTemps;

	/**
	 * The default value of the '{@link #getDateDebutCalculee() <em>Date Debut Calculee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebutCalculee()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_DEBUT_CALCULEE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateDebutCalculee() <em>Date Debut Calculee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebutCalculee()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateDebutCalculee = DATE_DEBUT_CALCULEE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateFinCalculee() <em>Date Fin Calculee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFinCalculee()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_FIN_CALCULEE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateFinCalculee() <em>Date Fin Calculee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFinCalculee()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateFinCalculee = DATE_FIN_CALCULEE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContraintesHoraires() <em>Contraintes Horaires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContraintesHoraires()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTRAINTES_HORAIRES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContraintesHoraires() <em>Contraintes Horaires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContraintesHoraires()
	 * @generated
	 * @ordered
	 */
	protected String contraintesHoraires = CONTRAINTES_HORAIRES_EDEFAULT;

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
	 * The cached value of the '{@link #getEstObjetAssociationHoraireManoeuvre() <em>Est Objet Association Horaire Manoeuvre</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationHoraireManoeuvre()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationHoraireManoeuvre;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationHoraireManoeuvre() <em>Est Sujet Association Horaire Manoeuvre</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationHoraireManoeuvre()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationHoraireManoeuvre;

	/**
	 * The cached value of the '{@link #getConcerneMissionsActivite() <em>Concerne Missions Activite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneMissionsActivite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> concerneMissionsActivite;

	/**
	 * The cached value of the '{@link #getAPourPrioritesTactiquesLogistiquesPrioriteTactiqueLogistique() <em>APour Priorites Tactiques Logistiques Priorite Tactique Logistique</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourPrioritesTactiquesLogistiquesPrioriteTactiqueLogistique()
	 * @generated
	 * @ordered
	 */
	protected EList<TypePrioriteTactiqueLogistique> aPourPrioritesTactiquesLogistiquesPrioriteTactiqueLogistique;

	/**
	 * The cached value of the '{@link #getDecritRapportForceRapportForce() <em>Decrit Rapport Force Rapport Force</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecritRapportForceRapportForce()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> decritRapportForceRapportForce;

	/**
	 * The cached value of the '{@link #getACommeConsignesApplicablesConsigne() <em>AComme Consignes Applicables Consigne</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeConsignesApplicablesConsigne()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aCommeConsignesApplicablesConsigne;

	/**
	 * The cached value of the '{@link #getACommePointEntreeConsigne() <em>AComme Point Entree Consigne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommePointEntreeConsigne()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aCommePointEntreeConsigne;

	/**
	 * The cached value of the '{@link #getACommePointSortieConsigne() <em>AComme Point Sortie Consigne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommePointSortieConsigne()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aCommePointSortieConsigne;

	/**
	 * The cached value of the '{@link #getAPourDateDebutDatation() <em>APour Date Debut Datation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourDateDebutDatation()
	 * @generated
	 * @ordered
	 */
	protected TypeDatation aPourDateDebutDatation;

	/**
	 * The cached value of the '{@link #getAPourDateFinDatation() <em>APour Date Fin Datation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourDateFinDatation()
	 * @generated
	 * @ordered
	 */
	protected TypeDatation aPourDateFinDatation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeHoraireManoeuvreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeHoraireManoeuvre();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_HORAIRE_MANOEUVRE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoHoraireManoeuvrePhaseOuTemps getPhaseOuTemps() {
		return phaseOuTemps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhaseOuTemps(TypeDictionaryDicoHoraireManoeuvrePhaseOuTemps newPhaseOuTemps) {
		TypeDictionaryDicoHoraireManoeuvrePhaseOuTemps oldPhaseOuTemps = phaseOuTemps;
		phaseOuTemps = newPhaseOuTemps == null ? PHASE_OU_TEMPS_EDEFAULT : newPhaseOuTemps;
		boolean oldPhaseOuTempsESet = phaseOuTempsESet;
		phaseOuTempsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_HORAIRE_MANOEUVRE__PHASE_OU_TEMPS, oldPhaseOuTemps, phaseOuTemps, !oldPhaseOuTempsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPhaseOuTemps() {
		TypeDictionaryDicoHoraireManoeuvrePhaseOuTemps oldPhaseOuTemps = phaseOuTemps;
		boolean oldPhaseOuTempsESet = phaseOuTempsESet;
		phaseOuTemps = PHASE_OU_TEMPS_EDEFAULT;
		phaseOuTempsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_HORAIRE_MANOEUVRE__PHASE_OU_TEMPS, oldPhaseOuTemps, PHASE_OU_TEMPS_EDEFAULT, oldPhaseOuTempsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPhaseOuTemps() {
		return phaseOuTempsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoHoraireManoeuvreNiveau getNiveau() {
		return niveau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNiveau(TypeDictionaryDicoHoraireManoeuvreNiveau newNiveau) {
		TypeDictionaryDicoHoraireManoeuvreNiveau oldNiveau = niveau;
		niveau = newNiveau == null ? NIVEAU_EDEFAULT : newNiveau;
		boolean oldNiveauESet = niveauESet;
		niveauESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_HORAIRE_MANOEUVRE__NIVEAU, oldNiveau, niveau, !oldNiveauESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNiveau() {
		TypeDictionaryDicoHoraireManoeuvreNiveau oldNiveau = niveau;
		boolean oldNiveauESet = niveauESet;
		niveau = NIVEAU_EDEFAULT;
		niveauESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_HORAIRE_MANOEUVRE__NIVEAU, oldNiveau, NIVEAU_EDEFAULT, oldNiveauESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNiveau() {
		return niveauESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateDebut() {
		return dateDebut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDebut(XMLGregorianCalendar newDateDebut) {
		XMLGregorianCalendar oldDateDebut = dateDebut;
		dateDebut = newDateDebut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_HORAIRE_MANOEUVRE__DATE_DEBUT, oldDateDebut, dateDebut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateFin() {
		return dateFin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateFin(XMLGregorianCalendar newDateFin) {
		XMLGregorianCalendar oldDateFin = dateFin;
		dateFin = newDateFin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_HORAIRE_MANOEUVRE__DATE_FIN, oldDateFin, dateFin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getDureeTemps() {
		return dureeTemps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDureeTemps(TypeDataTypeDuree newDureeTemps, NotificationChain msgs) {
		TypeDataTypeDuree oldDureeTemps = dureeTemps;
		dureeTemps = newDureeTemps;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_HORAIRE_MANOEUVRE__DUREE_TEMPS, oldDureeTemps, newDureeTemps);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDureeTemps(TypeDataTypeDuree newDureeTemps) {
		if (newDureeTemps != dureeTemps) {
			NotificationChain msgs = null;
			if (dureeTemps != null)
				msgs = ((InternalEObject)dureeTemps).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_HORAIRE_MANOEUVRE__DUREE_TEMPS, null, msgs);
			if (newDureeTemps != null)
				msgs = ((InternalEObject)newDureeTemps).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_HORAIRE_MANOEUVRE__DUREE_TEMPS, null, msgs);
			msgs = basicSetDureeTemps(newDureeTemps, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_HORAIRE_MANOEUVRE__DUREE_TEMPS, newDureeTemps, newDureeTemps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateDebutCalculee() {
		return dateDebutCalculee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDebutCalculee(XMLGregorianCalendar newDateDebutCalculee) {
		XMLGregorianCalendar oldDateDebutCalculee = dateDebutCalculee;
		dateDebutCalculee = newDateDebutCalculee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_HORAIRE_MANOEUVRE__DATE_DEBUT_CALCULEE, oldDateDebutCalculee, dateDebutCalculee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateFinCalculee() {
		return dateFinCalculee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateFinCalculee(XMLGregorianCalendar newDateFinCalculee) {
		XMLGregorianCalendar oldDateFinCalculee = dateFinCalculee;
		dateFinCalculee = newDateFinCalculee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_HORAIRE_MANOEUVRE__DATE_FIN_CALCULEE, oldDateFinCalculee, dateFinCalculee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContraintesHoraires() {
		return contraintesHoraires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContraintesHoraires(String newContraintesHoraires) {
		String oldContraintesHoraires = contraintesHoraires;
		contraintesHoraires = newContraintesHoraires;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_HORAIRE_MANOEUVRE__CONTRAINTES_HORAIRES, oldContraintesHoraires, contraintesHoraires));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_HORAIRE_MANOEUVRE__COMMENTAIRE, oldCommentaire, commentaire));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_HORAIRE_MANOEUVRE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_HORAIRE_MANOEUVRE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationHoraireManoeuvre() {
		if (estObjetAssociationHoraireManoeuvre == null) {
			estObjetAssociationHoraireManoeuvre = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_HORAIRE_MANOEUVRE__EST_OBJET_ASSOCIATION_HORAIRE_MANOEUVRE);
		}
		return estObjetAssociationHoraireManoeuvre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationHoraireManoeuvre() {
		if (estSujetAssociationHoraireManoeuvre == null) {
			estSujetAssociationHoraireManoeuvre = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_HORAIRE_MANOEUVRE__EST_SUJET_ASSOCIATION_HORAIRE_MANOEUVRE);
		}
		return estSujetAssociationHoraireManoeuvre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getConcerneMissionsActivite() {
		if (concerneMissionsActivite == null) {
			concerneMissionsActivite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_HORAIRE_MANOEUVRE__CONCERNE_MISSIONS_ACTIVITE);
		}
		return concerneMissionsActivite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePrioriteTactiqueLogistique> getAPourPrioritesTactiquesLogistiquesPrioriteTactiqueLogistique() {
		if (aPourPrioritesTactiquesLogistiquesPrioriteTactiqueLogistique == null) {
			aPourPrioritesTactiquesLogistiquesPrioriteTactiqueLogistique = new EObjectContainmentEList<TypePrioriteTactiqueLogistique>(TypePrioriteTactiqueLogistique.class, this, SchemaPackage.TYPE_HORAIRE_MANOEUVRE__APOUR_PRIORITES_TACTIQUES_LOGISTIQUES_PRIORITE_TACTIQUE_LOGISTIQUE);
		}
		return aPourPrioritesTactiquesLogistiquesPrioriteTactiqueLogistique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getDecritRapportForceRapportForce() {
		if (decritRapportForceRapportForce == null) {
			decritRapportForceRapportForce = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_HORAIRE_MANOEUVRE__DECRIT_RAPPORT_FORCE_RAPPORT_FORCE);
		}
		return decritRapportForceRapportForce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getACommeConsignesApplicablesConsigne() {
		if (aCommeConsignesApplicablesConsigne == null) {
			aCommeConsignesApplicablesConsigne = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_HORAIRE_MANOEUVRE__ACOMME_CONSIGNES_APPLICABLES_CONSIGNE);
		}
		return aCommeConsignesApplicablesConsigne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getACommePointEntreeConsigne() {
		return aCommePointEntreeConsigne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommePointEntreeConsigne(TypeAssociation newACommePointEntreeConsigne, NotificationChain msgs) {
		TypeAssociation oldACommePointEntreeConsigne = aCommePointEntreeConsigne;
		aCommePointEntreeConsigne = newACommePointEntreeConsigne;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_HORAIRE_MANOEUVRE__ACOMME_POINT_ENTREE_CONSIGNE, oldACommePointEntreeConsigne, newACommePointEntreeConsigne);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommePointEntreeConsigne(TypeAssociation newACommePointEntreeConsigne) {
		if (newACommePointEntreeConsigne != aCommePointEntreeConsigne) {
			NotificationChain msgs = null;
			if (aCommePointEntreeConsigne != null)
				msgs = ((InternalEObject)aCommePointEntreeConsigne).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_HORAIRE_MANOEUVRE__ACOMME_POINT_ENTREE_CONSIGNE, null, msgs);
			if (newACommePointEntreeConsigne != null)
				msgs = ((InternalEObject)newACommePointEntreeConsigne).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_HORAIRE_MANOEUVRE__ACOMME_POINT_ENTREE_CONSIGNE, null, msgs);
			msgs = basicSetACommePointEntreeConsigne(newACommePointEntreeConsigne, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_HORAIRE_MANOEUVRE__ACOMME_POINT_ENTREE_CONSIGNE, newACommePointEntreeConsigne, newACommePointEntreeConsigne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getACommePointSortieConsigne() {
		return aCommePointSortieConsigne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommePointSortieConsigne(TypeAssociation newACommePointSortieConsigne, NotificationChain msgs) {
		TypeAssociation oldACommePointSortieConsigne = aCommePointSortieConsigne;
		aCommePointSortieConsigne = newACommePointSortieConsigne;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_HORAIRE_MANOEUVRE__ACOMME_POINT_SORTIE_CONSIGNE, oldACommePointSortieConsigne, newACommePointSortieConsigne);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommePointSortieConsigne(TypeAssociation newACommePointSortieConsigne) {
		if (newACommePointSortieConsigne != aCommePointSortieConsigne) {
			NotificationChain msgs = null;
			if (aCommePointSortieConsigne != null)
				msgs = ((InternalEObject)aCommePointSortieConsigne).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_HORAIRE_MANOEUVRE__ACOMME_POINT_SORTIE_CONSIGNE, null, msgs);
			if (newACommePointSortieConsigne != null)
				msgs = ((InternalEObject)newACommePointSortieConsigne).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_HORAIRE_MANOEUVRE__ACOMME_POINT_SORTIE_CONSIGNE, null, msgs);
			msgs = basicSetACommePointSortieConsigne(newACommePointSortieConsigne, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_HORAIRE_MANOEUVRE__ACOMME_POINT_SORTIE_CONSIGNE, newACommePointSortieConsigne, newACommePointSortieConsigne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDatation getAPourDateDebutDatation() {
		return aPourDateDebutDatation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourDateDebutDatation(TypeDatation newAPourDateDebutDatation, NotificationChain msgs) {
		TypeDatation oldAPourDateDebutDatation = aPourDateDebutDatation;
		aPourDateDebutDatation = newAPourDateDebutDatation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_HORAIRE_MANOEUVRE__APOUR_DATE_DEBUT_DATATION, oldAPourDateDebutDatation, newAPourDateDebutDatation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourDateDebutDatation(TypeDatation newAPourDateDebutDatation) {
		if (newAPourDateDebutDatation != aPourDateDebutDatation) {
			NotificationChain msgs = null;
			if (aPourDateDebutDatation != null)
				msgs = ((InternalEObject)aPourDateDebutDatation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_HORAIRE_MANOEUVRE__APOUR_DATE_DEBUT_DATATION, null, msgs);
			if (newAPourDateDebutDatation != null)
				msgs = ((InternalEObject)newAPourDateDebutDatation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_HORAIRE_MANOEUVRE__APOUR_DATE_DEBUT_DATATION, null, msgs);
			msgs = basicSetAPourDateDebutDatation(newAPourDateDebutDatation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_HORAIRE_MANOEUVRE__APOUR_DATE_DEBUT_DATATION, newAPourDateDebutDatation, newAPourDateDebutDatation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDatation getAPourDateFinDatation() {
		return aPourDateFinDatation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourDateFinDatation(TypeDatation newAPourDateFinDatation, NotificationChain msgs) {
		TypeDatation oldAPourDateFinDatation = aPourDateFinDatation;
		aPourDateFinDatation = newAPourDateFinDatation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_HORAIRE_MANOEUVRE__APOUR_DATE_FIN_DATATION, oldAPourDateFinDatation, newAPourDateFinDatation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourDateFinDatation(TypeDatation newAPourDateFinDatation) {
		if (newAPourDateFinDatation != aPourDateFinDatation) {
			NotificationChain msgs = null;
			if (aPourDateFinDatation != null)
				msgs = ((InternalEObject)aPourDateFinDatation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_HORAIRE_MANOEUVRE__APOUR_DATE_FIN_DATATION, null, msgs);
			if (newAPourDateFinDatation != null)
				msgs = ((InternalEObject)newAPourDateFinDatation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_HORAIRE_MANOEUVRE__APOUR_DATE_FIN_DATATION, null, msgs);
			msgs = basicSetAPourDateFinDatation(newAPourDateFinDatation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_HORAIRE_MANOEUVRE__APOUR_DATE_FIN_DATATION, newAPourDateFinDatation, newAPourDateFinDatation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__DUREE_TEMPS:
				return basicSetDureeTemps(null, msgs);
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__EST_OBJET_ASSOCIATION_HORAIRE_MANOEUVRE:
				return ((InternalEList<?>)getEstObjetAssociationHoraireManoeuvre()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__EST_SUJET_ASSOCIATION_HORAIRE_MANOEUVRE:
				return ((InternalEList<?>)getEstSujetAssociationHoraireManoeuvre()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__CONCERNE_MISSIONS_ACTIVITE:
				return ((InternalEList<?>)getConcerneMissionsActivite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__APOUR_PRIORITES_TACTIQUES_LOGISTIQUES_PRIORITE_TACTIQUE_LOGISTIQUE:
				return ((InternalEList<?>)getAPourPrioritesTactiquesLogistiquesPrioriteTactiqueLogistique()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__DECRIT_RAPPORT_FORCE_RAPPORT_FORCE:
				return ((InternalEList<?>)getDecritRapportForceRapportForce()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__ACOMME_CONSIGNES_APPLICABLES_CONSIGNE:
				return ((InternalEList<?>)getACommeConsignesApplicablesConsigne()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__ACOMME_POINT_ENTREE_CONSIGNE:
				return basicSetACommePointEntreeConsigne(null, msgs);
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__ACOMME_POINT_SORTIE_CONSIGNE:
				return basicSetACommePointSortieConsigne(null, msgs);
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__APOUR_DATE_DEBUT_DATATION:
				return basicSetAPourDateDebutDatation(null, msgs);
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__APOUR_DATE_FIN_DATATION:
				return basicSetAPourDateFinDatation(null, msgs);
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
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__NOM:
				return getNom();
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__PHASE_OU_TEMPS:
				return getPhaseOuTemps();
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__NIVEAU:
				return getNiveau();
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__DATE_DEBUT:
				return getDateDebut();
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__DATE_FIN:
				return getDateFin();
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__DUREE_TEMPS:
				return getDureeTemps();
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__DATE_DEBUT_CALCULEE:
				return getDateDebutCalculee();
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__DATE_FIN_CALCULEE:
				return getDateFinCalculee();
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__CONTRAINTES_HORAIRES:
				return getContraintesHoraires();
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__COMMENTAIRE:
				return getCommentaire();
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__CE:
				return getCE();
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__EST_OBJET_ASSOCIATION_HORAIRE_MANOEUVRE:
				return getEstObjetAssociationHoraireManoeuvre();
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__EST_SUJET_ASSOCIATION_HORAIRE_MANOEUVRE:
				return getEstSujetAssociationHoraireManoeuvre();
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__CONCERNE_MISSIONS_ACTIVITE:
				return getConcerneMissionsActivite();
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__APOUR_PRIORITES_TACTIQUES_LOGISTIQUES_PRIORITE_TACTIQUE_LOGISTIQUE:
				return getAPourPrioritesTactiquesLogistiquesPrioriteTactiqueLogistique();
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__DECRIT_RAPPORT_FORCE_RAPPORT_FORCE:
				return getDecritRapportForceRapportForce();
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__ACOMME_CONSIGNES_APPLICABLES_CONSIGNE:
				return getACommeConsignesApplicablesConsigne();
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__ACOMME_POINT_ENTREE_CONSIGNE:
				return getACommePointEntreeConsigne();
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__ACOMME_POINT_SORTIE_CONSIGNE:
				return getACommePointSortieConsigne();
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__APOUR_DATE_DEBUT_DATATION:
				return getAPourDateDebutDatation();
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__APOUR_DATE_FIN_DATATION:
				return getAPourDateFinDatation();
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
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__NOM:
				setNom((String)newValue);
				return;
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__PHASE_OU_TEMPS:
				setPhaseOuTemps((TypeDictionaryDicoHoraireManoeuvrePhaseOuTemps)newValue);
				return;
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__NIVEAU:
				setNiveau((TypeDictionaryDicoHoraireManoeuvreNiveau)newValue);
				return;
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__DATE_DEBUT:
				setDateDebut((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__DATE_FIN:
				setDateFin((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__DUREE_TEMPS:
				setDureeTemps((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__DATE_DEBUT_CALCULEE:
				setDateDebutCalculee((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__DATE_FIN_CALCULEE:
				setDateFinCalculee((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__CONTRAINTES_HORAIRES:
				setContraintesHoraires((String)newValue);
				return;
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__COMMENTAIRE:
				setCommentaire((String)newValue);
				return;
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__EST_OBJET_ASSOCIATION_HORAIRE_MANOEUVRE:
				getEstObjetAssociationHoraireManoeuvre().clear();
				getEstObjetAssociationHoraireManoeuvre().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__EST_SUJET_ASSOCIATION_HORAIRE_MANOEUVRE:
				getEstSujetAssociationHoraireManoeuvre().clear();
				getEstSujetAssociationHoraireManoeuvre().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__CONCERNE_MISSIONS_ACTIVITE:
				getConcerneMissionsActivite().clear();
				getConcerneMissionsActivite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__APOUR_PRIORITES_TACTIQUES_LOGISTIQUES_PRIORITE_TACTIQUE_LOGISTIQUE:
				getAPourPrioritesTactiquesLogistiquesPrioriteTactiqueLogistique().clear();
				getAPourPrioritesTactiquesLogistiquesPrioriteTactiqueLogistique().addAll((Collection<? extends TypePrioriteTactiqueLogistique>)newValue);
				return;
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__DECRIT_RAPPORT_FORCE_RAPPORT_FORCE:
				getDecritRapportForceRapportForce().clear();
				getDecritRapportForceRapportForce().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__ACOMME_CONSIGNES_APPLICABLES_CONSIGNE:
				getACommeConsignesApplicablesConsigne().clear();
				getACommeConsignesApplicablesConsigne().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__ACOMME_POINT_ENTREE_CONSIGNE:
				setACommePointEntreeConsigne((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__ACOMME_POINT_SORTIE_CONSIGNE:
				setACommePointSortieConsigne((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__APOUR_DATE_DEBUT_DATATION:
				setAPourDateDebutDatation((TypeDatation)newValue);
				return;
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__APOUR_DATE_FIN_DATATION:
				setAPourDateFinDatation((TypeDatation)newValue);
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
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__PHASE_OU_TEMPS:
				unsetPhaseOuTemps();
				return;
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__NIVEAU:
				unsetNiveau();
				return;
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__DATE_DEBUT:
				setDateDebut(DATE_DEBUT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__DATE_FIN:
				setDateFin(DATE_FIN_EDEFAULT);
				return;
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__DUREE_TEMPS:
				setDureeTemps((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__DATE_DEBUT_CALCULEE:
				setDateDebutCalculee(DATE_DEBUT_CALCULEE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__DATE_FIN_CALCULEE:
				setDateFinCalculee(DATE_FIN_CALCULEE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__CONTRAINTES_HORAIRES:
				setContraintesHoraires(CONTRAINTES_HORAIRES_EDEFAULT);
				return;
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__COMMENTAIRE:
				setCommentaire(COMMENTAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__EST_OBJET_ASSOCIATION_HORAIRE_MANOEUVRE:
				getEstObjetAssociationHoraireManoeuvre().clear();
				return;
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__EST_SUJET_ASSOCIATION_HORAIRE_MANOEUVRE:
				getEstSujetAssociationHoraireManoeuvre().clear();
				return;
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__CONCERNE_MISSIONS_ACTIVITE:
				getConcerneMissionsActivite().clear();
				return;
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__APOUR_PRIORITES_TACTIQUES_LOGISTIQUES_PRIORITE_TACTIQUE_LOGISTIQUE:
				getAPourPrioritesTactiquesLogistiquesPrioriteTactiqueLogistique().clear();
				return;
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__DECRIT_RAPPORT_FORCE_RAPPORT_FORCE:
				getDecritRapportForceRapportForce().clear();
				return;
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__ACOMME_CONSIGNES_APPLICABLES_CONSIGNE:
				getACommeConsignesApplicablesConsigne().clear();
				return;
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__ACOMME_POINT_ENTREE_CONSIGNE:
				setACommePointEntreeConsigne((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__ACOMME_POINT_SORTIE_CONSIGNE:
				setACommePointSortieConsigne((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__APOUR_DATE_DEBUT_DATATION:
				setAPourDateDebutDatation((TypeDatation)null);
				return;
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__APOUR_DATE_FIN_DATATION:
				setAPourDateFinDatation((TypeDatation)null);
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
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__PHASE_OU_TEMPS:
				return isSetPhaseOuTemps();
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__NIVEAU:
				return isSetNiveau();
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__DATE_DEBUT:
				return DATE_DEBUT_EDEFAULT == null ? dateDebut != null : !DATE_DEBUT_EDEFAULT.equals(dateDebut);
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__DATE_FIN:
				return DATE_FIN_EDEFAULT == null ? dateFin != null : !DATE_FIN_EDEFAULT.equals(dateFin);
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__DUREE_TEMPS:
				return dureeTemps != null;
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__DATE_DEBUT_CALCULEE:
				return DATE_DEBUT_CALCULEE_EDEFAULT == null ? dateDebutCalculee != null : !DATE_DEBUT_CALCULEE_EDEFAULT.equals(dateDebutCalculee);
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__DATE_FIN_CALCULEE:
				return DATE_FIN_CALCULEE_EDEFAULT == null ? dateFinCalculee != null : !DATE_FIN_CALCULEE_EDEFAULT.equals(dateFinCalculee);
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__CONTRAINTES_HORAIRES:
				return CONTRAINTES_HORAIRES_EDEFAULT == null ? contraintesHoraires != null : !CONTRAINTES_HORAIRES_EDEFAULT.equals(contraintesHoraires);
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__COMMENTAIRE:
				return COMMENTAIRE_EDEFAULT == null ? commentaire != null : !COMMENTAIRE_EDEFAULT.equals(commentaire);
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__EST_OBJET_ASSOCIATION_HORAIRE_MANOEUVRE:
				return estObjetAssociationHoraireManoeuvre != null && !estObjetAssociationHoraireManoeuvre.isEmpty();
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__EST_SUJET_ASSOCIATION_HORAIRE_MANOEUVRE:
				return estSujetAssociationHoraireManoeuvre != null && !estSujetAssociationHoraireManoeuvre.isEmpty();
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__CONCERNE_MISSIONS_ACTIVITE:
				return concerneMissionsActivite != null && !concerneMissionsActivite.isEmpty();
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__APOUR_PRIORITES_TACTIQUES_LOGISTIQUES_PRIORITE_TACTIQUE_LOGISTIQUE:
				return aPourPrioritesTactiquesLogistiquesPrioriteTactiqueLogistique != null && !aPourPrioritesTactiquesLogistiquesPrioriteTactiqueLogistique.isEmpty();
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__DECRIT_RAPPORT_FORCE_RAPPORT_FORCE:
				return decritRapportForceRapportForce != null && !decritRapportForceRapportForce.isEmpty();
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__ACOMME_CONSIGNES_APPLICABLES_CONSIGNE:
				return aCommeConsignesApplicablesConsigne != null && !aCommeConsignesApplicablesConsigne.isEmpty();
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__ACOMME_POINT_ENTREE_CONSIGNE:
				return aCommePointEntreeConsigne != null;
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__ACOMME_POINT_SORTIE_CONSIGNE:
				return aCommePointSortieConsigne != null;
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__APOUR_DATE_DEBUT_DATATION:
				return aPourDateDebutDatation != null;
			case SchemaPackage.TYPE_HORAIRE_MANOEUVRE__APOUR_DATE_FIN_DATATION:
				return aPourDateFinDatation != null;
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
		result.append(" (nom: ");
		result.append(nom);
		result.append(", phaseOuTemps: ");
		if (phaseOuTempsESet) result.append(phaseOuTemps); else result.append("<unset>");
		result.append(", niveau: ");
		if (niveauESet) result.append(niveau); else result.append("<unset>");
		result.append(", dateDebut: ");
		result.append(dateDebut);
		result.append(", dateFin: ");
		result.append(dateFin);
		result.append(", dateDebutCalculee: ");
		result.append(dateDebutCalculee);
		result.append(", dateFinCalculee: ");
		result.append(dateFinCalculee);
		result.append(", contraintesHoraires: ");
		result.append(contraintesHoraires);
		result.append(", commentaire: ");
		result.append(commentaire);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeHoraireManoeuvreImpl
