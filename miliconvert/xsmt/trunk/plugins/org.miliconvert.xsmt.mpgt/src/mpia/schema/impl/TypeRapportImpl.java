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
import mpia.meta.TypeAssociationEXT;
import mpia.meta.TypeDataTypeDateHeure;
import mpia.meta.TypeDataTypeDuree;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoRapportConfiance;
import mpia.schema.TypeDictionaryDicoRapportConfirmation;
import mpia.schema.TypeDictionaryDicoRapportDonneeReelleDurantExercice;
import mpia.schema.TypeDictionaryDicoRapportExactitude;
import mpia.schema.TypeDictionaryDicoRapportFiabiliteSource;
import mpia.schema.TypeDictionaryDicoRapportTypeSource;
import mpia.schema.TypeRapport;

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
 * An implementation of the model object '<em><b>Type Rapport</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeRapportImpl#getExactitude <em>Exactitude</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRapportImpl#getConfirmation <em>Confirmation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRapportImpl#isComptage <em>Comptage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRapportImpl#getConfiance <em>Confiance</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRapportImpl#getGDHrapport <em>GD Hrapport</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRapportImpl#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRapportImpl#getDateFin <em>Date Fin</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRapportImpl#getDureeValidite <em>Duree Validite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRapportImpl#getEcartRelatifAAction <em>Ecart Relatif AAction</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRapportImpl#getTypeSource <em>Type Source</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRapportImpl#getNomSource <em>Nom Source</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRapportImpl#getFiabiliteSource <em>Fiabilite Source</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRapportImpl#getDonneeReelleDurantExercice <em>Donnee Reelle Durant Exercice</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRapportImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRapportImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRapportImpl#getEstRedigeParEntiteOrganisationnelle <em>Est Redige Par Entite Organisationnelle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRapportImpl#getAPourReferenceActivite <em>APour Reference Activite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRapportImpl#getEstPlaceDansAssociationContexteRapport <em>Est Place Dans Association Contexte Rapport</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeRapportImpl extends EObjectImpl implements TypeRapport {
	/**
	 * The default value of the '{@link #getExactitude() <em>Exactitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExactitude()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoRapportExactitude EXACTITUDE_EDEFAULT = TypeDictionaryDicoRapportExactitude._1;

	/**
	 * The cached value of the '{@link #getExactitude() <em>Exactitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExactitude()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoRapportExactitude exactitude = EXACTITUDE_EDEFAULT;

	/**
	 * This is true if the Exactitude attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean exactitudeESet;

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
	 * The default value of the '{@link #isComptage() <em>Comptage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isComptage()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COMPTAGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isComptage() <em>Comptage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isComptage()
	 * @generated
	 * @ordered
	 */
	protected boolean comptage = COMPTAGE_EDEFAULT;

	/**
	 * This is true if the Comptage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean comptageESet;

	/**
	 * The default value of the '{@link #getConfiance() <em>Confiance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiance()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoRapportConfiance CONFIANCE_EDEFAULT = TypeDictionaryDicoRapportConfiance.IND;

	/**
	 * The cached value of the '{@link #getConfiance() <em>Confiance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiance()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoRapportConfiance confiance = CONFIANCE_EDEFAULT;

	/**
	 * This is true if the Confiance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean confianceESet;

	/**
	 * The default value of the '{@link #getGDHrapport() <em>GD Hrapport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHrapport()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GD_HRAPPORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGDHrapport() <em>GD Hrapport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHrapport()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gDHrapport = GD_HRAPPORT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDateDebut() <em>Date Debut</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebut()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDateHeure dateDebut;

	/**
	 * The cached value of the '{@link #getDateFin() <em>Date Fin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFin()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDateHeure dateFin;

	/**
	 * The cached value of the '{@link #getDureeValidite() <em>Duree Validite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDureeValidite()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree dureeValidite;

	/**
	 * The cached value of the '{@link #getEcartRelatifAAction() <em>Ecart Relatif AAction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcartRelatifAAction()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree ecartRelatifAAction;

	/**
	 * The default value of the '{@link #getTypeSource() <em>Type Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeSource()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoRapportTypeSource TYPE_SOURCE_EDEFAULT = TypeDictionaryDicoRapportTypeSource.AIRREC;

	/**
	 * The cached value of the '{@link #getTypeSource() <em>Type Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeSource()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoRapportTypeSource typeSource = TYPE_SOURCE_EDEFAULT;

	/**
	 * This is true if the Type Source attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeSourceESet;

	/**
	 * The default value of the '{@link #getNomSource() <em>Nom Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomSource()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomSource() <em>Nom Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomSource()
	 * @generated
	 * @ordered
	 */
	protected String nomSource = NOM_SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFiabiliteSource() <em>Fiabilite Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiabiliteSource()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoRapportFiabiliteSource FIABILITE_SOURCE_EDEFAULT = TypeDictionaryDicoRapportFiabiliteSource.A;

	/**
	 * The cached value of the '{@link #getFiabiliteSource() <em>Fiabilite Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiabiliteSource()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoRapportFiabiliteSource fiabiliteSource = FIABILITE_SOURCE_EDEFAULT;

	/**
	 * This is true if the Fiabilite Source attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fiabiliteSourceESet;

	/**
	 * The default value of the '{@link #getDonneeReelleDurantExercice() <em>Donnee Reelle Durant Exercice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDonneeReelleDurantExercice()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoRapportDonneeReelleDurantExercice DONNEE_REELLE_DURANT_EXERCICE_EDEFAULT = TypeDictionaryDicoRapportDonneeReelleDurantExercice.REAL;

	/**
	 * The cached value of the '{@link #getDonneeReelleDurantExercice() <em>Donnee Reelle Durant Exercice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDonneeReelleDurantExercice()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoRapportDonneeReelleDurantExercice donneeReelleDurantExercice = DONNEE_REELLE_DURANT_EXERCICE_EDEFAULT;

	/**
	 * This is true if the Donnee Reelle Durant Exercice attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean donneeReelleDurantExerciceESet;

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
	 * The cached value of the '{@link #getEstRedigeParEntiteOrganisationnelle() <em>Est Redige Par Entite Organisationnelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstRedigeParEntiteOrganisationnelle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT estRedigeParEntiteOrganisationnelle;

	/**
	 * The cached value of the '{@link #getAPourReferenceActivite() <em>APour Reference Activite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourReferenceActivite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourReferenceActivite;

	/**
	 * The cached value of the '{@link #getEstPlaceDansAssociationContexteRapport() <em>Est Place Dans Association Contexte Rapport</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstPlaceDansAssociationContexteRapport()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estPlaceDansAssociationContexteRapport;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeRapportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeRapport();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoRapportExactitude getExactitude() {
		return exactitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExactitude(TypeDictionaryDicoRapportExactitude newExactitude) {
		TypeDictionaryDicoRapportExactitude oldExactitude = exactitude;
		exactitude = newExactitude == null ? EXACTITUDE_EDEFAULT : newExactitude;
		boolean oldExactitudeESet = exactitudeESet;
		exactitudeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RAPPORT__EXACTITUDE, oldExactitude, exactitude, !oldExactitudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExactitude() {
		TypeDictionaryDicoRapportExactitude oldExactitude = exactitude;
		boolean oldExactitudeESet = exactitudeESet;
		exactitude = EXACTITUDE_EDEFAULT;
		exactitudeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_RAPPORT__EXACTITUDE, oldExactitude, EXACTITUDE_EDEFAULT, oldExactitudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExactitude() {
		return exactitudeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RAPPORT__CONFIRMATION, oldConfirmation, confirmation, !oldConfirmationESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_RAPPORT__CONFIRMATION, oldConfirmation, CONFIRMATION_EDEFAULT, oldConfirmationESet));
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
	public boolean isComptage() {
		return comptage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComptage(boolean newComptage) {
		boolean oldComptage = comptage;
		comptage = newComptage;
		boolean oldComptageESet = comptageESet;
		comptageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RAPPORT__COMPTAGE, oldComptage, comptage, !oldComptageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetComptage() {
		boolean oldComptage = comptage;
		boolean oldComptageESet = comptageESet;
		comptage = COMPTAGE_EDEFAULT;
		comptageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_RAPPORT__COMPTAGE, oldComptage, COMPTAGE_EDEFAULT, oldComptageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetComptage() {
		return comptageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoRapportConfiance getConfiance() {
		return confiance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiance(TypeDictionaryDicoRapportConfiance newConfiance) {
		TypeDictionaryDicoRapportConfiance oldConfiance = confiance;
		confiance = newConfiance == null ? CONFIANCE_EDEFAULT : newConfiance;
		boolean oldConfianceESet = confianceESet;
		confianceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RAPPORT__CONFIANCE, oldConfiance, confiance, !oldConfianceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConfiance() {
		TypeDictionaryDicoRapportConfiance oldConfiance = confiance;
		boolean oldConfianceESet = confianceESet;
		confiance = CONFIANCE_EDEFAULT;
		confianceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_RAPPORT__CONFIANCE, oldConfiance, CONFIANCE_EDEFAULT, oldConfianceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConfiance() {
		return confianceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGDHrapport() {
		return gDHrapport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGDHrapport(XMLGregorianCalendar newGDHrapport) {
		XMLGregorianCalendar oldGDHrapport = gDHrapport;
		gDHrapport = newGDHrapport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RAPPORT__GD_HRAPPORT, oldGDHrapport, gDHrapport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDateHeure getDateDebut() {
		return dateDebut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateDebut(TypeDataTypeDateHeure newDateDebut, NotificationChain msgs) {
		TypeDataTypeDateHeure oldDateDebut = dateDebut;
		dateDebut = newDateDebut;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RAPPORT__DATE_DEBUT, oldDateDebut, newDateDebut);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDebut(TypeDataTypeDateHeure newDateDebut) {
		if (newDateDebut != dateDebut) {
			NotificationChain msgs = null;
			if (dateDebut != null)
				msgs = ((InternalEObject)dateDebut).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RAPPORT__DATE_DEBUT, null, msgs);
			if (newDateDebut != null)
				msgs = ((InternalEObject)newDateDebut).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RAPPORT__DATE_DEBUT, null, msgs);
			msgs = basicSetDateDebut(newDateDebut, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RAPPORT__DATE_DEBUT, newDateDebut, newDateDebut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDateHeure getDateFin() {
		return dateFin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateFin(TypeDataTypeDateHeure newDateFin, NotificationChain msgs) {
		TypeDataTypeDateHeure oldDateFin = dateFin;
		dateFin = newDateFin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RAPPORT__DATE_FIN, oldDateFin, newDateFin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateFin(TypeDataTypeDateHeure newDateFin) {
		if (newDateFin != dateFin) {
			NotificationChain msgs = null;
			if (dateFin != null)
				msgs = ((InternalEObject)dateFin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RAPPORT__DATE_FIN, null, msgs);
			if (newDateFin != null)
				msgs = ((InternalEObject)newDateFin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RAPPORT__DATE_FIN, null, msgs);
			msgs = basicSetDateFin(newDateFin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RAPPORT__DATE_FIN, newDateFin, newDateFin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getDureeValidite() {
		return dureeValidite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDureeValidite(TypeDataTypeDuree newDureeValidite, NotificationChain msgs) {
		TypeDataTypeDuree oldDureeValidite = dureeValidite;
		dureeValidite = newDureeValidite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RAPPORT__DUREE_VALIDITE, oldDureeValidite, newDureeValidite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDureeValidite(TypeDataTypeDuree newDureeValidite) {
		if (newDureeValidite != dureeValidite) {
			NotificationChain msgs = null;
			if (dureeValidite != null)
				msgs = ((InternalEObject)dureeValidite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RAPPORT__DUREE_VALIDITE, null, msgs);
			if (newDureeValidite != null)
				msgs = ((InternalEObject)newDureeValidite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RAPPORT__DUREE_VALIDITE, null, msgs);
			msgs = basicSetDureeValidite(newDureeValidite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RAPPORT__DUREE_VALIDITE, newDureeValidite, newDureeValidite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getEcartRelatifAAction() {
		return ecartRelatifAAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEcartRelatifAAction(TypeDataTypeDuree newEcartRelatifAAction, NotificationChain msgs) {
		TypeDataTypeDuree oldEcartRelatifAAction = ecartRelatifAAction;
		ecartRelatifAAction = newEcartRelatifAAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RAPPORT__ECART_RELATIF_AACTION, oldEcartRelatifAAction, newEcartRelatifAAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcartRelatifAAction(TypeDataTypeDuree newEcartRelatifAAction) {
		if (newEcartRelatifAAction != ecartRelatifAAction) {
			NotificationChain msgs = null;
			if (ecartRelatifAAction != null)
				msgs = ((InternalEObject)ecartRelatifAAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RAPPORT__ECART_RELATIF_AACTION, null, msgs);
			if (newEcartRelatifAAction != null)
				msgs = ((InternalEObject)newEcartRelatifAAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RAPPORT__ECART_RELATIF_AACTION, null, msgs);
			msgs = basicSetEcartRelatifAAction(newEcartRelatifAAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RAPPORT__ECART_RELATIF_AACTION, newEcartRelatifAAction, newEcartRelatifAAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoRapportTypeSource getTypeSource() {
		return typeSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeSource(TypeDictionaryDicoRapportTypeSource newTypeSource) {
		TypeDictionaryDicoRapportTypeSource oldTypeSource = typeSource;
		typeSource = newTypeSource == null ? TYPE_SOURCE_EDEFAULT : newTypeSource;
		boolean oldTypeSourceESet = typeSourceESet;
		typeSourceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RAPPORT__TYPE_SOURCE, oldTypeSource, typeSource, !oldTypeSourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeSource() {
		TypeDictionaryDicoRapportTypeSource oldTypeSource = typeSource;
		boolean oldTypeSourceESet = typeSourceESet;
		typeSource = TYPE_SOURCE_EDEFAULT;
		typeSourceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_RAPPORT__TYPE_SOURCE, oldTypeSource, TYPE_SOURCE_EDEFAULT, oldTypeSourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeSource() {
		return typeSourceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomSource() {
		return nomSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomSource(String newNomSource) {
		String oldNomSource = nomSource;
		nomSource = newNomSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RAPPORT__NOM_SOURCE, oldNomSource, nomSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoRapportFiabiliteSource getFiabiliteSource() {
		return fiabiliteSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFiabiliteSource(TypeDictionaryDicoRapportFiabiliteSource newFiabiliteSource) {
		TypeDictionaryDicoRapportFiabiliteSource oldFiabiliteSource = fiabiliteSource;
		fiabiliteSource = newFiabiliteSource == null ? FIABILITE_SOURCE_EDEFAULT : newFiabiliteSource;
		boolean oldFiabiliteSourceESet = fiabiliteSourceESet;
		fiabiliteSourceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RAPPORT__FIABILITE_SOURCE, oldFiabiliteSource, fiabiliteSource, !oldFiabiliteSourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFiabiliteSource() {
		TypeDictionaryDicoRapportFiabiliteSource oldFiabiliteSource = fiabiliteSource;
		boolean oldFiabiliteSourceESet = fiabiliteSourceESet;
		fiabiliteSource = FIABILITE_SOURCE_EDEFAULT;
		fiabiliteSourceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_RAPPORT__FIABILITE_SOURCE, oldFiabiliteSource, FIABILITE_SOURCE_EDEFAULT, oldFiabiliteSourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFiabiliteSource() {
		return fiabiliteSourceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoRapportDonneeReelleDurantExercice getDonneeReelleDurantExercice() {
		return donneeReelleDurantExercice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDonneeReelleDurantExercice(TypeDictionaryDicoRapportDonneeReelleDurantExercice newDonneeReelleDurantExercice) {
		TypeDictionaryDicoRapportDonneeReelleDurantExercice oldDonneeReelleDurantExercice = donneeReelleDurantExercice;
		donneeReelleDurantExercice = newDonneeReelleDurantExercice == null ? DONNEE_REELLE_DURANT_EXERCICE_EDEFAULT : newDonneeReelleDurantExercice;
		boolean oldDonneeReelleDurantExerciceESet = donneeReelleDurantExerciceESet;
		donneeReelleDurantExerciceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RAPPORT__DONNEE_REELLE_DURANT_EXERCICE, oldDonneeReelleDurantExercice, donneeReelleDurantExercice, !oldDonneeReelleDurantExerciceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDonneeReelleDurantExercice() {
		TypeDictionaryDicoRapportDonneeReelleDurantExercice oldDonneeReelleDurantExercice = donneeReelleDurantExercice;
		boolean oldDonneeReelleDurantExerciceESet = donneeReelleDurantExerciceESet;
		donneeReelleDurantExercice = DONNEE_REELLE_DURANT_EXERCICE_EDEFAULT;
		donneeReelleDurantExerciceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_RAPPORT__DONNEE_REELLE_DURANT_EXERCICE, oldDonneeReelleDurantExercice, DONNEE_REELLE_DURANT_EXERCICE_EDEFAULT, oldDonneeReelleDurantExerciceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDonneeReelleDurantExercice() {
		return donneeReelleDurantExerciceESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RAPPORT__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RAPPORT__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getEstRedigeParEntiteOrganisationnelle() {
		return estRedigeParEntiteOrganisationnelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstRedigeParEntiteOrganisationnelle(TypeAssociationEXT newEstRedigeParEntiteOrganisationnelle, NotificationChain msgs) {
		TypeAssociationEXT oldEstRedigeParEntiteOrganisationnelle = estRedigeParEntiteOrganisationnelle;
		estRedigeParEntiteOrganisationnelle = newEstRedigeParEntiteOrganisationnelle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RAPPORT__EST_REDIGE_PAR_ENTITE_ORGANISATIONNELLE, oldEstRedigeParEntiteOrganisationnelle, newEstRedigeParEntiteOrganisationnelle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstRedigeParEntiteOrganisationnelle(TypeAssociationEXT newEstRedigeParEntiteOrganisationnelle) {
		if (newEstRedigeParEntiteOrganisationnelle != estRedigeParEntiteOrganisationnelle) {
			NotificationChain msgs = null;
			if (estRedigeParEntiteOrganisationnelle != null)
				msgs = ((InternalEObject)estRedigeParEntiteOrganisationnelle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RAPPORT__EST_REDIGE_PAR_ENTITE_ORGANISATIONNELLE, null, msgs);
			if (newEstRedigeParEntiteOrganisationnelle != null)
				msgs = ((InternalEObject)newEstRedigeParEntiteOrganisationnelle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RAPPORT__EST_REDIGE_PAR_ENTITE_ORGANISATIONNELLE, null, msgs);
			msgs = basicSetEstRedigeParEntiteOrganisationnelle(newEstRedigeParEntiteOrganisationnelle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RAPPORT__EST_REDIGE_PAR_ENTITE_ORGANISATIONNELLE, newEstRedigeParEntiteOrganisationnelle, newEstRedigeParEntiteOrganisationnelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourReferenceActivite() {
		return aPourReferenceActivite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourReferenceActivite(TypeAssociation newAPourReferenceActivite, NotificationChain msgs) {
		TypeAssociation oldAPourReferenceActivite = aPourReferenceActivite;
		aPourReferenceActivite = newAPourReferenceActivite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RAPPORT__APOUR_REFERENCE_ACTIVITE, oldAPourReferenceActivite, newAPourReferenceActivite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourReferenceActivite(TypeAssociation newAPourReferenceActivite) {
		if (newAPourReferenceActivite != aPourReferenceActivite) {
			NotificationChain msgs = null;
			if (aPourReferenceActivite != null)
				msgs = ((InternalEObject)aPourReferenceActivite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RAPPORT__APOUR_REFERENCE_ACTIVITE, null, msgs);
			if (newAPourReferenceActivite != null)
				msgs = ((InternalEObject)newAPourReferenceActivite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RAPPORT__APOUR_REFERENCE_ACTIVITE, null, msgs);
			msgs = basicSetAPourReferenceActivite(newAPourReferenceActivite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RAPPORT__APOUR_REFERENCE_ACTIVITE, newAPourReferenceActivite, newAPourReferenceActivite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstPlaceDansAssociationContexteRapport() {
		if (estPlaceDansAssociationContexteRapport == null) {
			estPlaceDansAssociationContexteRapport = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_RAPPORT__EST_PLACE_DANS_ASSOCIATION_CONTEXTE_RAPPORT);
		}
		return estPlaceDansAssociationContexteRapport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_RAPPORT__DATE_DEBUT:
				return basicSetDateDebut(null, msgs);
			case SchemaPackage.TYPE_RAPPORT__DATE_FIN:
				return basicSetDateFin(null, msgs);
			case SchemaPackage.TYPE_RAPPORT__DUREE_VALIDITE:
				return basicSetDureeValidite(null, msgs);
			case SchemaPackage.TYPE_RAPPORT__ECART_RELATIF_AACTION:
				return basicSetEcartRelatifAAction(null, msgs);
			case SchemaPackage.TYPE_RAPPORT__EST_REDIGE_PAR_ENTITE_ORGANISATIONNELLE:
				return basicSetEstRedigeParEntiteOrganisationnelle(null, msgs);
			case SchemaPackage.TYPE_RAPPORT__APOUR_REFERENCE_ACTIVITE:
				return basicSetAPourReferenceActivite(null, msgs);
			case SchemaPackage.TYPE_RAPPORT__EST_PLACE_DANS_ASSOCIATION_CONTEXTE_RAPPORT:
				return ((InternalEList<?>)getEstPlaceDansAssociationContexteRapport()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_RAPPORT__EXACTITUDE:
				return getExactitude();
			case SchemaPackage.TYPE_RAPPORT__CONFIRMATION:
				return getConfirmation();
			case SchemaPackage.TYPE_RAPPORT__COMPTAGE:
				return isComptage() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_RAPPORT__CONFIANCE:
				return getConfiance();
			case SchemaPackage.TYPE_RAPPORT__GD_HRAPPORT:
				return getGDHrapport();
			case SchemaPackage.TYPE_RAPPORT__DATE_DEBUT:
				return getDateDebut();
			case SchemaPackage.TYPE_RAPPORT__DATE_FIN:
				return getDateFin();
			case SchemaPackage.TYPE_RAPPORT__DUREE_VALIDITE:
				return getDureeValidite();
			case SchemaPackage.TYPE_RAPPORT__ECART_RELATIF_AACTION:
				return getEcartRelatifAAction();
			case SchemaPackage.TYPE_RAPPORT__TYPE_SOURCE:
				return getTypeSource();
			case SchemaPackage.TYPE_RAPPORT__NOM_SOURCE:
				return getNomSource();
			case SchemaPackage.TYPE_RAPPORT__FIABILITE_SOURCE:
				return getFiabiliteSource();
			case SchemaPackage.TYPE_RAPPORT__DONNEE_REELLE_DURANT_EXERCICE:
				return getDonneeReelleDurantExercice();
			case SchemaPackage.TYPE_RAPPORT__CTE:
				return getCTE();
			case SchemaPackage.TYPE_RAPPORT__CE:
				return getCE();
			case SchemaPackage.TYPE_RAPPORT__EST_REDIGE_PAR_ENTITE_ORGANISATIONNELLE:
				return getEstRedigeParEntiteOrganisationnelle();
			case SchemaPackage.TYPE_RAPPORT__APOUR_REFERENCE_ACTIVITE:
				return getAPourReferenceActivite();
			case SchemaPackage.TYPE_RAPPORT__EST_PLACE_DANS_ASSOCIATION_CONTEXTE_RAPPORT:
				return getEstPlaceDansAssociationContexteRapport();
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
			case SchemaPackage.TYPE_RAPPORT__EXACTITUDE:
				setExactitude((TypeDictionaryDicoRapportExactitude)newValue);
				return;
			case SchemaPackage.TYPE_RAPPORT__CONFIRMATION:
				setConfirmation((TypeDictionaryDicoRapportConfirmation)newValue);
				return;
			case SchemaPackage.TYPE_RAPPORT__COMPTAGE:
				setComptage(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_RAPPORT__CONFIANCE:
				setConfiance((TypeDictionaryDicoRapportConfiance)newValue);
				return;
			case SchemaPackage.TYPE_RAPPORT__GD_HRAPPORT:
				setGDHrapport((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_RAPPORT__DATE_DEBUT:
				setDateDebut((TypeDataTypeDateHeure)newValue);
				return;
			case SchemaPackage.TYPE_RAPPORT__DATE_FIN:
				setDateFin((TypeDataTypeDateHeure)newValue);
				return;
			case SchemaPackage.TYPE_RAPPORT__DUREE_VALIDITE:
				setDureeValidite((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_RAPPORT__ECART_RELATIF_AACTION:
				setEcartRelatifAAction((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_RAPPORT__TYPE_SOURCE:
				setTypeSource((TypeDictionaryDicoRapportTypeSource)newValue);
				return;
			case SchemaPackage.TYPE_RAPPORT__NOM_SOURCE:
				setNomSource((String)newValue);
				return;
			case SchemaPackage.TYPE_RAPPORT__FIABILITE_SOURCE:
				setFiabiliteSource((TypeDictionaryDicoRapportFiabiliteSource)newValue);
				return;
			case SchemaPackage.TYPE_RAPPORT__DONNEE_REELLE_DURANT_EXERCICE:
				setDonneeReelleDurantExercice((TypeDictionaryDicoRapportDonneeReelleDurantExercice)newValue);
				return;
			case SchemaPackage.TYPE_RAPPORT__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_RAPPORT__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_RAPPORT__EST_REDIGE_PAR_ENTITE_ORGANISATIONNELLE:
				setEstRedigeParEntiteOrganisationnelle((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_RAPPORT__APOUR_REFERENCE_ACTIVITE:
				setAPourReferenceActivite((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_RAPPORT__EST_PLACE_DANS_ASSOCIATION_CONTEXTE_RAPPORT:
				getEstPlaceDansAssociationContexteRapport().clear();
				getEstPlaceDansAssociationContexteRapport().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_RAPPORT__EXACTITUDE:
				unsetExactitude();
				return;
			case SchemaPackage.TYPE_RAPPORT__CONFIRMATION:
				unsetConfirmation();
				return;
			case SchemaPackage.TYPE_RAPPORT__COMPTAGE:
				unsetComptage();
				return;
			case SchemaPackage.TYPE_RAPPORT__CONFIANCE:
				unsetConfiance();
				return;
			case SchemaPackage.TYPE_RAPPORT__GD_HRAPPORT:
				setGDHrapport(GD_HRAPPORT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RAPPORT__DATE_DEBUT:
				setDateDebut((TypeDataTypeDateHeure)null);
				return;
			case SchemaPackage.TYPE_RAPPORT__DATE_FIN:
				setDateFin((TypeDataTypeDateHeure)null);
				return;
			case SchemaPackage.TYPE_RAPPORT__DUREE_VALIDITE:
				setDureeValidite((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_RAPPORT__ECART_RELATIF_AACTION:
				setEcartRelatifAAction((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_RAPPORT__TYPE_SOURCE:
				unsetTypeSource();
				return;
			case SchemaPackage.TYPE_RAPPORT__NOM_SOURCE:
				setNomSource(NOM_SOURCE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RAPPORT__FIABILITE_SOURCE:
				unsetFiabiliteSource();
				return;
			case SchemaPackage.TYPE_RAPPORT__DONNEE_REELLE_DURANT_EXERCICE:
				unsetDonneeReelleDurantExercice();
				return;
			case SchemaPackage.TYPE_RAPPORT__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RAPPORT__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RAPPORT__EST_REDIGE_PAR_ENTITE_ORGANISATIONNELLE:
				setEstRedigeParEntiteOrganisationnelle((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_RAPPORT__APOUR_REFERENCE_ACTIVITE:
				setAPourReferenceActivite((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_RAPPORT__EST_PLACE_DANS_ASSOCIATION_CONTEXTE_RAPPORT:
				getEstPlaceDansAssociationContexteRapport().clear();
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
			case SchemaPackage.TYPE_RAPPORT__EXACTITUDE:
				return isSetExactitude();
			case SchemaPackage.TYPE_RAPPORT__CONFIRMATION:
				return isSetConfirmation();
			case SchemaPackage.TYPE_RAPPORT__COMPTAGE:
				return isSetComptage();
			case SchemaPackage.TYPE_RAPPORT__CONFIANCE:
				return isSetConfiance();
			case SchemaPackage.TYPE_RAPPORT__GD_HRAPPORT:
				return GD_HRAPPORT_EDEFAULT == null ? gDHrapport != null : !GD_HRAPPORT_EDEFAULT.equals(gDHrapport);
			case SchemaPackage.TYPE_RAPPORT__DATE_DEBUT:
				return dateDebut != null;
			case SchemaPackage.TYPE_RAPPORT__DATE_FIN:
				return dateFin != null;
			case SchemaPackage.TYPE_RAPPORT__DUREE_VALIDITE:
				return dureeValidite != null;
			case SchemaPackage.TYPE_RAPPORT__ECART_RELATIF_AACTION:
				return ecartRelatifAAction != null;
			case SchemaPackage.TYPE_RAPPORT__TYPE_SOURCE:
				return isSetTypeSource();
			case SchemaPackage.TYPE_RAPPORT__NOM_SOURCE:
				return NOM_SOURCE_EDEFAULT == null ? nomSource != null : !NOM_SOURCE_EDEFAULT.equals(nomSource);
			case SchemaPackage.TYPE_RAPPORT__FIABILITE_SOURCE:
				return isSetFiabiliteSource();
			case SchemaPackage.TYPE_RAPPORT__DONNEE_REELLE_DURANT_EXERCICE:
				return isSetDonneeReelleDurantExercice();
			case SchemaPackage.TYPE_RAPPORT__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_RAPPORT__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_RAPPORT__EST_REDIGE_PAR_ENTITE_ORGANISATIONNELLE:
				return estRedigeParEntiteOrganisationnelle != null;
			case SchemaPackage.TYPE_RAPPORT__APOUR_REFERENCE_ACTIVITE:
				return aPourReferenceActivite != null;
			case SchemaPackage.TYPE_RAPPORT__EST_PLACE_DANS_ASSOCIATION_CONTEXTE_RAPPORT:
				return estPlaceDansAssociationContexteRapport != null && !estPlaceDansAssociationContexteRapport.isEmpty();
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
		result.append(" (exactitude: ");
		if (exactitudeESet) result.append(exactitude); else result.append("<unset>");
		result.append(", confirmation: ");
		if (confirmationESet) result.append(confirmation); else result.append("<unset>");
		result.append(", comptage: ");
		if (comptageESet) result.append(comptage); else result.append("<unset>");
		result.append(", confiance: ");
		if (confianceESet) result.append(confiance); else result.append("<unset>");
		result.append(", gDHrapport: ");
		result.append(gDHrapport);
		result.append(", typeSource: ");
		if (typeSourceESet) result.append(typeSource); else result.append("<unset>");
		result.append(", nomSource: ");
		result.append(nomSource);
		result.append(", fiabiliteSource: ");
		if (fiabiliteSourceESet) result.append(fiabiliteSource); else result.append("<unset>");
		result.append(", donneeReelleDurantExercice: ");
		if (donneeReelleDurantExerciceESet) result.append(donneeReelleDurantExercice); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeRapportImpl
