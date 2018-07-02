/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;
import mpia.meta.TypeDataTypeDuree;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoIncidentMouvementCategorie;
import mpia.schema.TypeIncidentMouvement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Incident Mouvement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeIncidentMouvementImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeIncidentMouvementImpl#getDescriptionIncident <em>Description Incident</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeIncidentMouvementImpl#getGDHIncident <em>GDH Incident</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeIncidentMouvementImpl#getRetardAIncident <em>Retard AIncident</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeIncidentMouvementImpl#getNombreTotalVehiculesAChenilles <em>Nombre Total Vehicules AChenilles</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeIncidentMouvementImpl#getNombreTotalVehiculesARoues <em>Nombre Total Vehicules ARoues</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeIncidentMouvementImpl#getNombreVehiculesAChenillesDetruits <em>Nombre Vehicules AChenilles Detruits</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeIncidentMouvementImpl#getNombreVehiculesAChenillesImmobilises <em>Nombre Vehicules AChenilles Immobilises</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeIncidentMouvementImpl#getNombreVehiculesARouesDetruits <em>Nombre Vehicules ARoues Detruits</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeIncidentMouvementImpl#getNombreVehiculesARouesImmobilises <em>Nombre Vehicules ARoues Immobilises</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeIncidentMouvementImpl#getMesuresPrisesOuDemandeComplementaire <em>Mesures Prises Ou Demande Complementaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeIncidentMouvementImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeIncidentMouvementImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeIncidentMouvementImpl#getAPourUniteRendantCompteUnite <em>APour Unite Rendant Compte Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeIncidentMouvementImpl#getAPourLieuAutreElementControle <em>APour Lieu Autre Element Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeIncidentMouvementImpl extends EObjectImpl implements TypeIncidentMouvement {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoIncidentMouvementCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoIncidentMouvementCategorie.BLOCKN;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoIncidentMouvementCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getDescriptionIncident() <em>Description Incident</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionIncident()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_INCIDENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescriptionIncident() <em>Description Incident</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionIncident()
	 * @generated
	 * @ordered
	 */
	protected String descriptionIncident = DESCRIPTION_INCIDENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getGDHIncident() <em>GDH Incident</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHIncident()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GDH_INCIDENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGDHIncident() <em>GDH Incident</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHIncident()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gDHIncident = GDH_INCIDENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRetardAIncident() <em>Retard AIncident</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetardAIncident()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree retardAIncident;

	/**
	 * The default value of the '{@link #getNombreTotalVehiculesAChenilles() <em>Nombre Total Vehicules AChenilles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreTotalVehiculesAChenilles()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_TOTAL_VEHICULES_ACHENILLES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreTotalVehiculesAChenilles() <em>Nombre Total Vehicules AChenilles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreTotalVehiculesAChenilles()
	 * @generated
	 * @ordered
	 */
	protected long nombreTotalVehiculesAChenilles = NOMBRE_TOTAL_VEHICULES_ACHENILLES_EDEFAULT;

	/**
	 * This is true if the Nombre Total Vehicules AChenilles attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreTotalVehiculesAChenillesESet;

	/**
	 * The default value of the '{@link #getNombreTotalVehiculesARoues() <em>Nombre Total Vehicules ARoues</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreTotalVehiculesARoues()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_TOTAL_VEHICULES_AROUES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreTotalVehiculesARoues() <em>Nombre Total Vehicules ARoues</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreTotalVehiculesARoues()
	 * @generated
	 * @ordered
	 */
	protected long nombreTotalVehiculesARoues = NOMBRE_TOTAL_VEHICULES_AROUES_EDEFAULT;

	/**
	 * This is true if the Nombre Total Vehicules ARoues attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreTotalVehiculesARouesESet;

	/**
	 * The default value of the '{@link #getNombreVehiculesAChenillesDetruits() <em>Nombre Vehicules AChenilles Detruits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreVehiculesAChenillesDetruits()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_VEHICULES_ACHENILLES_DETRUITS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreVehiculesAChenillesDetruits() <em>Nombre Vehicules AChenilles Detruits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreVehiculesAChenillesDetruits()
	 * @generated
	 * @ordered
	 */
	protected long nombreVehiculesAChenillesDetruits = NOMBRE_VEHICULES_ACHENILLES_DETRUITS_EDEFAULT;

	/**
	 * This is true if the Nombre Vehicules AChenilles Detruits attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreVehiculesAChenillesDetruitsESet;

	/**
	 * The default value of the '{@link #getNombreVehiculesAChenillesImmobilises() <em>Nombre Vehicules AChenilles Immobilises</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreVehiculesAChenillesImmobilises()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_VEHICULES_ACHENILLES_IMMOBILISES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreVehiculesAChenillesImmobilises() <em>Nombre Vehicules AChenilles Immobilises</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreVehiculesAChenillesImmobilises()
	 * @generated
	 * @ordered
	 */
	protected long nombreVehiculesAChenillesImmobilises = NOMBRE_VEHICULES_ACHENILLES_IMMOBILISES_EDEFAULT;

	/**
	 * This is true if the Nombre Vehicules AChenilles Immobilises attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreVehiculesAChenillesImmobilisesESet;

	/**
	 * The default value of the '{@link #getNombreVehiculesARouesDetruits() <em>Nombre Vehicules ARoues Detruits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreVehiculesARouesDetruits()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_VEHICULES_AROUES_DETRUITS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreVehiculesARouesDetruits() <em>Nombre Vehicules ARoues Detruits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreVehiculesARouesDetruits()
	 * @generated
	 * @ordered
	 */
	protected long nombreVehiculesARouesDetruits = NOMBRE_VEHICULES_AROUES_DETRUITS_EDEFAULT;

	/**
	 * This is true if the Nombre Vehicules ARoues Detruits attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreVehiculesARouesDetruitsESet;

	/**
	 * The default value of the '{@link #getNombreVehiculesARouesImmobilises() <em>Nombre Vehicules ARoues Immobilises</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreVehiculesARouesImmobilises()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_VEHICULES_AROUES_IMMOBILISES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreVehiculesARouesImmobilises() <em>Nombre Vehicules ARoues Immobilises</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreVehiculesARouesImmobilises()
	 * @generated
	 * @ordered
	 */
	protected long nombreVehiculesARouesImmobilises = NOMBRE_VEHICULES_AROUES_IMMOBILISES_EDEFAULT;

	/**
	 * This is true if the Nombre Vehicules ARoues Immobilises attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreVehiculesARouesImmobilisesESet;

	/**
	 * The default value of the '{@link #getMesuresPrisesOuDemandeComplementaire() <em>Mesures Prises Ou Demande Complementaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMesuresPrisesOuDemandeComplementaire()
	 * @generated
	 * @ordered
	 */
	protected static final String MESURES_PRISES_OU_DEMANDE_COMPLEMENTAIRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMesuresPrisesOuDemandeComplementaire() <em>Mesures Prises Ou Demande Complementaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMesuresPrisesOuDemandeComplementaire()
	 * @generated
	 * @ordered
	 */
	protected String mesuresPrisesOuDemandeComplementaire = MESURES_PRISES_OU_DEMANDE_COMPLEMENTAIRE_EDEFAULT;

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
	 * The cached value of the '{@link #getAPourUniteRendantCompteUnite() <em>APour Unite Rendant Compte Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUniteRendantCompteUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourUniteRendantCompteUnite;

	/**
	 * The cached value of the '{@link #getAPourLieuAutreElementControle() <em>APour Lieu Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourLieuAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourLieuAutreElementControle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeIncidentMouvementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeIncidentMouvement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoIncidentMouvementCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoIncidentMouvementCategorie newCategorie) {
		TypeDictionaryDicoIncidentMouvementCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INCIDENT_MOUVEMENT__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoIncidentMouvementCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_INCIDENT_MOUVEMENT__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public String getDescriptionIncident() {
		return descriptionIncident;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptionIncident(String newDescriptionIncident) {
		String oldDescriptionIncident = descriptionIncident;
		descriptionIncident = newDescriptionIncident;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INCIDENT_MOUVEMENT__DESCRIPTION_INCIDENT, oldDescriptionIncident, descriptionIncident));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGDHIncident() {
		return gDHIncident;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGDHIncident(XMLGregorianCalendar newGDHIncident) {
		XMLGregorianCalendar oldGDHIncident = gDHIncident;
		gDHIncident = newGDHIncident;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INCIDENT_MOUVEMENT__GDH_INCIDENT, oldGDHIncident, gDHIncident));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getRetardAIncident() {
		return retardAIncident;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRetardAIncident(TypeDataTypeDuree newRetardAIncident, NotificationChain msgs) {
		TypeDataTypeDuree oldRetardAIncident = retardAIncident;
		retardAIncident = newRetardAIncident;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INCIDENT_MOUVEMENT__RETARD_AINCIDENT, oldRetardAIncident, newRetardAIncident);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetardAIncident(TypeDataTypeDuree newRetardAIncident) {
		if (newRetardAIncident != retardAIncident) {
			NotificationChain msgs = null;
			if (retardAIncident != null)
				msgs = ((InternalEObject)retardAIncident).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_INCIDENT_MOUVEMENT__RETARD_AINCIDENT, null, msgs);
			if (newRetardAIncident != null)
				msgs = ((InternalEObject)newRetardAIncident).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_INCIDENT_MOUVEMENT__RETARD_AINCIDENT, null, msgs);
			msgs = basicSetRetardAIncident(newRetardAIncident, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INCIDENT_MOUVEMENT__RETARD_AINCIDENT, newRetardAIncident, newRetardAIncident));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreTotalVehiculesAChenilles() {
		return nombreTotalVehiculesAChenilles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreTotalVehiculesAChenilles(long newNombreTotalVehiculesAChenilles) {
		long oldNombreTotalVehiculesAChenilles = nombreTotalVehiculesAChenilles;
		nombreTotalVehiculesAChenilles = newNombreTotalVehiculesAChenilles;
		boolean oldNombreTotalVehiculesAChenillesESet = nombreTotalVehiculesAChenillesESet;
		nombreTotalVehiculesAChenillesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INCIDENT_MOUVEMENT__NOMBRE_TOTAL_VEHICULES_ACHENILLES, oldNombreTotalVehiculesAChenilles, nombreTotalVehiculesAChenilles, !oldNombreTotalVehiculesAChenillesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreTotalVehiculesAChenilles() {
		long oldNombreTotalVehiculesAChenilles = nombreTotalVehiculesAChenilles;
		boolean oldNombreTotalVehiculesAChenillesESet = nombreTotalVehiculesAChenillesESet;
		nombreTotalVehiculesAChenilles = NOMBRE_TOTAL_VEHICULES_ACHENILLES_EDEFAULT;
		nombreTotalVehiculesAChenillesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_INCIDENT_MOUVEMENT__NOMBRE_TOTAL_VEHICULES_ACHENILLES, oldNombreTotalVehiculesAChenilles, NOMBRE_TOTAL_VEHICULES_ACHENILLES_EDEFAULT, oldNombreTotalVehiculesAChenillesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreTotalVehiculesAChenilles() {
		return nombreTotalVehiculesAChenillesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreTotalVehiculesARoues() {
		return nombreTotalVehiculesARoues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreTotalVehiculesARoues(long newNombreTotalVehiculesARoues) {
		long oldNombreTotalVehiculesARoues = nombreTotalVehiculesARoues;
		nombreTotalVehiculesARoues = newNombreTotalVehiculesARoues;
		boolean oldNombreTotalVehiculesARouesESet = nombreTotalVehiculesARouesESet;
		nombreTotalVehiculesARouesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INCIDENT_MOUVEMENT__NOMBRE_TOTAL_VEHICULES_AROUES, oldNombreTotalVehiculesARoues, nombreTotalVehiculesARoues, !oldNombreTotalVehiculesARouesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreTotalVehiculesARoues() {
		long oldNombreTotalVehiculesARoues = nombreTotalVehiculesARoues;
		boolean oldNombreTotalVehiculesARouesESet = nombreTotalVehiculesARouesESet;
		nombreTotalVehiculesARoues = NOMBRE_TOTAL_VEHICULES_AROUES_EDEFAULT;
		nombreTotalVehiculesARouesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_INCIDENT_MOUVEMENT__NOMBRE_TOTAL_VEHICULES_AROUES, oldNombreTotalVehiculesARoues, NOMBRE_TOTAL_VEHICULES_AROUES_EDEFAULT, oldNombreTotalVehiculesARouesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreTotalVehiculesARoues() {
		return nombreTotalVehiculesARouesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreVehiculesAChenillesDetruits() {
		return nombreVehiculesAChenillesDetruits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreVehiculesAChenillesDetruits(long newNombreVehiculesAChenillesDetruits) {
		long oldNombreVehiculesAChenillesDetruits = nombreVehiculesAChenillesDetruits;
		nombreVehiculesAChenillesDetruits = newNombreVehiculesAChenillesDetruits;
		boolean oldNombreVehiculesAChenillesDetruitsESet = nombreVehiculesAChenillesDetruitsESet;
		nombreVehiculesAChenillesDetruitsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INCIDENT_MOUVEMENT__NOMBRE_VEHICULES_ACHENILLES_DETRUITS, oldNombreVehiculesAChenillesDetruits, nombreVehiculesAChenillesDetruits, !oldNombreVehiculesAChenillesDetruitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreVehiculesAChenillesDetruits() {
		long oldNombreVehiculesAChenillesDetruits = nombreVehiculesAChenillesDetruits;
		boolean oldNombreVehiculesAChenillesDetruitsESet = nombreVehiculesAChenillesDetruitsESet;
		nombreVehiculesAChenillesDetruits = NOMBRE_VEHICULES_ACHENILLES_DETRUITS_EDEFAULT;
		nombreVehiculesAChenillesDetruitsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_INCIDENT_MOUVEMENT__NOMBRE_VEHICULES_ACHENILLES_DETRUITS, oldNombreVehiculesAChenillesDetruits, NOMBRE_VEHICULES_ACHENILLES_DETRUITS_EDEFAULT, oldNombreVehiculesAChenillesDetruitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreVehiculesAChenillesDetruits() {
		return nombreVehiculesAChenillesDetruitsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreVehiculesAChenillesImmobilises() {
		return nombreVehiculesAChenillesImmobilises;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreVehiculesAChenillesImmobilises(long newNombreVehiculesAChenillesImmobilises) {
		long oldNombreVehiculesAChenillesImmobilises = nombreVehiculesAChenillesImmobilises;
		nombreVehiculesAChenillesImmobilises = newNombreVehiculesAChenillesImmobilises;
		boolean oldNombreVehiculesAChenillesImmobilisesESet = nombreVehiculesAChenillesImmobilisesESet;
		nombreVehiculesAChenillesImmobilisesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INCIDENT_MOUVEMENT__NOMBRE_VEHICULES_ACHENILLES_IMMOBILISES, oldNombreVehiculesAChenillesImmobilises, nombreVehiculesAChenillesImmobilises, !oldNombreVehiculesAChenillesImmobilisesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreVehiculesAChenillesImmobilises() {
		long oldNombreVehiculesAChenillesImmobilises = nombreVehiculesAChenillesImmobilises;
		boolean oldNombreVehiculesAChenillesImmobilisesESet = nombreVehiculesAChenillesImmobilisesESet;
		nombreVehiculesAChenillesImmobilises = NOMBRE_VEHICULES_ACHENILLES_IMMOBILISES_EDEFAULT;
		nombreVehiculesAChenillesImmobilisesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_INCIDENT_MOUVEMENT__NOMBRE_VEHICULES_ACHENILLES_IMMOBILISES, oldNombreVehiculesAChenillesImmobilises, NOMBRE_VEHICULES_ACHENILLES_IMMOBILISES_EDEFAULT, oldNombreVehiculesAChenillesImmobilisesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreVehiculesAChenillesImmobilises() {
		return nombreVehiculesAChenillesImmobilisesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreVehiculesARouesDetruits() {
		return nombreVehiculesARouesDetruits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreVehiculesARouesDetruits(long newNombreVehiculesARouesDetruits) {
		long oldNombreVehiculesARouesDetruits = nombreVehiculesARouesDetruits;
		nombreVehiculesARouesDetruits = newNombreVehiculesARouesDetruits;
		boolean oldNombreVehiculesARouesDetruitsESet = nombreVehiculesARouesDetruitsESet;
		nombreVehiculesARouesDetruitsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INCIDENT_MOUVEMENT__NOMBRE_VEHICULES_AROUES_DETRUITS, oldNombreVehiculesARouesDetruits, nombreVehiculesARouesDetruits, !oldNombreVehiculesARouesDetruitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreVehiculesARouesDetruits() {
		long oldNombreVehiculesARouesDetruits = nombreVehiculesARouesDetruits;
		boolean oldNombreVehiculesARouesDetruitsESet = nombreVehiculesARouesDetruitsESet;
		nombreVehiculesARouesDetruits = NOMBRE_VEHICULES_AROUES_DETRUITS_EDEFAULT;
		nombreVehiculesARouesDetruitsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_INCIDENT_MOUVEMENT__NOMBRE_VEHICULES_AROUES_DETRUITS, oldNombreVehiculesARouesDetruits, NOMBRE_VEHICULES_AROUES_DETRUITS_EDEFAULT, oldNombreVehiculesARouesDetruitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreVehiculesARouesDetruits() {
		return nombreVehiculesARouesDetruitsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreVehiculesARouesImmobilises() {
		return nombreVehiculesARouesImmobilises;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreVehiculesARouesImmobilises(long newNombreVehiculesARouesImmobilises) {
		long oldNombreVehiculesARouesImmobilises = nombreVehiculesARouesImmobilises;
		nombreVehiculesARouesImmobilises = newNombreVehiculesARouesImmobilises;
		boolean oldNombreVehiculesARouesImmobilisesESet = nombreVehiculesARouesImmobilisesESet;
		nombreVehiculesARouesImmobilisesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INCIDENT_MOUVEMENT__NOMBRE_VEHICULES_AROUES_IMMOBILISES, oldNombreVehiculesARouesImmobilises, nombreVehiculesARouesImmobilises, !oldNombreVehiculesARouesImmobilisesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreVehiculesARouesImmobilises() {
		long oldNombreVehiculesARouesImmobilises = nombreVehiculesARouesImmobilises;
		boolean oldNombreVehiculesARouesImmobilisesESet = nombreVehiculesARouesImmobilisesESet;
		nombreVehiculesARouesImmobilises = NOMBRE_VEHICULES_AROUES_IMMOBILISES_EDEFAULT;
		nombreVehiculesARouesImmobilisesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_INCIDENT_MOUVEMENT__NOMBRE_VEHICULES_AROUES_IMMOBILISES, oldNombreVehiculesARouesImmobilises, NOMBRE_VEHICULES_AROUES_IMMOBILISES_EDEFAULT, oldNombreVehiculesARouesImmobilisesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreVehiculesARouesImmobilises() {
		return nombreVehiculesARouesImmobilisesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMesuresPrisesOuDemandeComplementaire() {
		return mesuresPrisesOuDemandeComplementaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMesuresPrisesOuDemandeComplementaire(String newMesuresPrisesOuDemandeComplementaire) {
		String oldMesuresPrisesOuDemandeComplementaire = mesuresPrisesOuDemandeComplementaire;
		mesuresPrisesOuDemandeComplementaire = newMesuresPrisesOuDemandeComplementaire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INCIDENT_MOUVEMENT__MESURES_PRISES_OU_DEMANDE_COMPLEMENTAIRE, oldMesuresPrisesOuDemandeComplementaire, mesuresPrisesOuDemandeComplementaire));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INCIDENT_MOUVEMENT__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INCIDENT_MOUVEMENT__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourUniteRendantCompteUnite() {
		return aPourUniteRendantCompteUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourUniteRendantCompteUnite(TypeAssociationEXT newAPourUniteRendantCompteUnite, NotificationChain msgs) {
		TypeAssociationEXT oldAPourUniteRendantCompteUnite = aPourUniteRendantCompteUnite;
		aPourUniteRendantCompteUnite = newAPourUniteRendantCompteUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INCIDENT_MOUVEMENT__APOUR_UNITE_RENDANT_COMPTE_UNITE, oldAPourUniteRendantCompteUnite, newAPourUniteRendantCompteUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourUniteRendantCompteUnite(TypeAssociationEXT newAPourUniteRendantCompteUnite) {
		if (newAPourUniteRendantCompteUnite != aPourUniteRendantCompteUnite) {
			NotificationChain msgs = null;
			if (aPourUniteRendantCompteUnite != null)
				msgs = ((InternalEObject)aPourUniteRendantCompteUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_INCIDENT_MOUVEMENT__APOUR_UNITE_RENDANT_COMPTE_UNITE, null, msgs);
			if (newAPourUniteRendantCompteUnite != null)
				msgs = ((InternalEObject)newAPourUniteRendantCompteUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_INCIDENT_MOUVEMENT__APOUR_UNITE_RENDANT_COMPTE_UNITE, null, msgs);
			msgs = basicSetAPourUniteRendantCompteUnite(newAPourUniteRendantCompteUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INCIDENT_MOUVEMENT__APOUR_UNITE_RENDANT_COMPTE_UNITE, newAPourUniteRendantCompteUnite, newAPourUniteRendantCompteUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourLieuAutreElementControle() {
		return aPourLieuAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourLieuAutreElementControle(TypeAssociation newAPourLieuAutreElementControle, NotificationChain msgs) {
		TypeAssociation oldAPourLieuAutreElementControle = aPourLieuAutreElementControle;
		aPourLieuAutreElementControle = newAPourLieuAutreElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INCIDENT_MOUVEMENT__APOUR_LIEU_AUTRE_ELEMENT_CONTROLE, oldAPourLieuAutreElementControle, newAPourLieuAutreElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourLieuAutreElementControle(TypeAssociation newAPourLieuAutreElementControle) {
		if (newAPourLieuAutreElementControle != aPourLieuAutreElementControle) {
			NotificationChain msgs = null;
			if (aPourLieuAutreElementControle != null)
				msgs = ((InternalEObject)aPourLieuAutreElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_INCIDENT_MOUVEMENT__APOUR_LIEU_AUTRE_ELEMENT_CONTROLE, null, msgs);
			if (newAPourLieuAutreElementControle != null)
				msgs = ((InternalEObject)newAPourLieuAutreElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_INCIDENT_MOUVEMENT__APOUR_LIEU_AUTRE_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetAPourLieuAutreElementControle(newAPourLieuAutreElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INCIDENT_MOUVEMENT__APOUR_LIEU_AUTRE_ELEMENT_CONTROLE, newAPourLieuAutreElementControle, newAPourLieuAutreElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__RETARD_AINCIDENT:
				return basicSetRetardAIncident(null, msgs);
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__APOUR_UNITE_RENDANT_COMPTE_UNITE:
				return basicSetAPourUniteRendantCompteUnite(null, msgs);
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__APOUR_LIEU_AUTRE_ELEMENT_CONTROLE:
				return basicSetAPourLieuAutreElementControle(null, msgs);
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
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__DESCRIPTION_INCIDENT:
				return getDescriptionIncident();
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__GDH_INCIDENT:
				return getGDHIncident();
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__RETARD_AINCIDENT:
				return getRetardAIncident();
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__NOMBRE_TOTAL_VEHICULES_ACHENILLES:
				return new Long(getNombreTotalVehiculesAChenilles());
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__NOMBRE_TOTAL_VEHICULES_AROUES:
				return new Long(getNombreTotalVehiculesARoues());
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__NOMBRE_VEHICULES_ACHENILLES_DETRUITS:
				return new Long(getNombreVehiculesAChenillesDetruits());
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__NOMBRE_VEHICULES_ACHENILLES_IMMOBILISES:
				return new Long(getNombreVehiculesAChenillesImmobilises());
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__NOMBRE_VEHICULES_AROUES_DETRUITS:
				return new Long(getNombreVehiculesARouesDetruits());
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__NOMBRE_VEHICULES_AROUES_IMMOBILISES:
				return new Long(getNombreVehiculesARouesImmobilises());
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__MESURES_PRISES_OU_DEMANDE_COMPLEMENTAIRE:
				return getMesuresPrisesOuDemandeComplementaire();
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__CTE:
				return getCTE();
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__CE:
				return getCE();
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__APOUR_UNITE_RENDANT_COMPTE_UNITE:
				return getAPourUniteRendantCompteUnite();
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__APOUR_LIEU_AUTRE_ELEMENT_CONTROLE:
				return getAPourLieuAutreElementControle();
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
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__CATEGORIE:
				setCategorie((TypeDictionaryDicoIncidentMouvementCategorie)newValue);
				return;
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__DESCRIPTION_INCIDENT:
				setDescriptionIncident((String)newValue);
				return;
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__GDH_INCIDENT:
				setGDHIncident((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__RETARD_AINCIDENT:
				setRetardAIncident((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__NOMBRE_TOTAL_VEHICULES_ACHENILLES:
				setNombreTotalVehiculesAChenilles(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__NOMBRE_TOTAL_VEHICULES_AROUES:
				setNombreTotalVehiculesARoues(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__NOMBRE_VEHICULES_ACHENILLES_DETRUITS:
				setNombreVehiculesAChenillesDetruits(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__NOMBRE_VEHICULES_ACHENILLES_IMMOBILISES:
				setNombreVehiculesAChenillesImmobilises(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__NOMBRE_VEHICULES_AROUES_DETRUITS:
				setNombreVehiculesARouesDetruits(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__NOMBRE_VEHICULES_AROUES_IMMOBILISES:
				setNombreVehiculesARouesImmobilises(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__MESURES_PRISES_OU_DEMANDE_COMPLEMENTAIRE:
				setMesuresPrisesOuDemandeComplementaire((String)newValue);
				return;
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__APOUR_UNITE_RENDANT_COMPTE_UNITE:
				setAPourUniteRendantCompteUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__APOUR_LIEU_AUTRE_ELEMENT_CONTROLE:
				setAPourLieuAutreElementControle((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__DESCRIPTION_INCIDENT:
				setDescriptionIncident(DESCRIPTION_INCIDENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__GDH_INCIDENT:
				setGDHIncident(GDH_INCIDENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__RETARD_AINCIDENT:
				setRetardAIncident((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__NOMBRE_TOTAL_VEHICULES_ACHENILLES:
				unsetNombreTotalVehiculesAChenilles();
				return;
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__NOMBRE_TOTAL_VEHICULES_AROUES:
				unsetNombreTotalVehiculesARoues();
				return;
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__NOMBRE_VEHICULES_ACHENILLES_DETRUITS:
				unsetNombreVehiculesAChenillesDetruits();
				return;
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__NOMBRE_VEHICULES_ACHENILLES_IMMOBILISES:
				unsetNombreVehiculesAChenillesImmobilises();
				return;
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__NOMBRE_VEHICULES_AROUES_DETRUITS:
				unsetNombreVehiculesARouesDetruits();
				return;
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__NOMBRE_VEHICULES_AROUES_IMMOBILISES:
				unsetNombreVehiculesARouesImmobilises();
				return;
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__MESURES_PRISES_OU_DEMANDE_COMPLEMENTAIRE:
				setMesuresPrisesOuDemandeComplementaire(MESURES_PRISES_OU_DEMANDE_COMPLEMENTAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__APOUR_UNITE_RENDANT_COMPTE_UNITE:
				setAPourUniteRendantCompteUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__APOUR_LIEU_AUTRE_ELEMENT_CONTROLE:
				setAPourLieuAutreElementControle((TypeAssociation)null);
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
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__DESCRIPTION_INCIDENT:
				return DESCRIPTION_INCIDENT_EDEFAULT == null ? descriptionIncident != null : !DESCRIPTION_INCIDENT_EDEFAULT.equals(descriptionIncident);
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__GDH_INCIDENT:
				return GDH_INCIDENT_EDEFAULT == null ? gDHIncident != null : !GDH_INCIDENT_EDEFAULT.equals(gDHIncident);
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__RETARD_AINCIDENT:
				return retardAIncident != null;
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__NOMBRE_TOTAL_VEHICULES_ACHENILLES:
				return isSetNombreTotalVehiculesAChenilles();
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__NOMBRE_TOTAL_VEHICULES_AROUES:
				return isSetNombreTotalVehiculesARoues();
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__NOMBRE_VEHICULES_ACHENILLES_DETRUITS:
				return isSetNombreVehiculesAChenillesDetruits();
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__NOMBRE_VEHICULES_ACHENILLES_IMMOBILISES:
				return isSetNombreVehiculesAChenillesImmobilises();
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__NOMBRE_VEHICULES_AROUES_DETRUITS:
				return isSetNombreVehiculesARouesDetruits();
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__NOMBRE_VEHICULES_AROUES_IMMOBILISES:
				return isSetNombreVehiculesARouesImmobilises();
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__MESURES_PRISES_OU_DEMANDE_COMPLEMENTAIRE:
				return MESURES_PRISES_OU_DEMANDE_COMPLEMENTAIRE_EDEFAULT == null ? mesuresPrisesOuDemandeComplementaire != null : !MESURES_PRISES_OU_DEMANDE_COMPLEMENTAIRE_EDEFAULT.equals(mesuresPrisesOuDemandeComplementaire);
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__APOUR_UNITE_RENDANT_COMPTE_UNITE:
				return aPourUniteRendantCompteUnite != null;
			case SchemaPackage.TYPE_INCIDENT_MOUVEMENT__APOUR_LIEU_AUTRE_ELEMENT_CONTROLE:
				return aPourLieuAutreElementControle != null;
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
		result.append(" (categorie: ");
		if (categorieESet) result.append(categorie); else result.append("<unset>");
		result.append(", descriptionIncident: ");
		result.append(descriptionIncident);
		result.append(", gDHIncident: ");
		result.append(gDHIncident);
		result.append(", nombreTotalVehiculesAChenilles: ");
		if (nombreTotalVehiculesAChenillesESet) result.append(nombreTotalVehiculesAChenilles); else result.append("<unset>");
		result.append(", nombreTotalVehiculesARoues: ");
		if (nombreTotalVehiculesARouesESet) result.append(nombreTotalVehiculesARoues); else result.append("<unset>");
		result.append(", nombreVehiculesAChenillesDetruits: ");
		if (nombreVehiculesAChenillesDetruitsESet) result.append(nombreVehiculesAChenillesDetruits); else result.append("<unset>");
		result.append(", nombreVehiculesAChenillesImmobilises: ");
		if (nombreVehiculesAChenillesImmobilisesESet) result.append(nombreVehiculesAChenillesImmobilises); else result.append("<unset>");
		result.append(", nombreVehiculesARouesDetruits: ");
		if (nombreVehiculesARouesDetruitsESet) result.append(nombreVehiculesARouesDetruits); else result.append("<unset>");
		result.append(", nombreVehiculesARouesImmobilises: ");
		if (nombreVehiculesARouesImmobilisesESet) result.append(nombreVehiculesARouesImmobilises); else result.append("<unset>");
		result.append(", mesuresPrisesOuDemandeComplementaire: ");
		result.append(mesuresPrisesOuDemandeComplementaire);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeIncidentMouvementImpl
