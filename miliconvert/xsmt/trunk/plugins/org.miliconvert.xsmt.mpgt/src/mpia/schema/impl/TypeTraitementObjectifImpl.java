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
import mpia.meta.TypeDataTypeLongueur;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCRtraitementObjectif;
import mpia.schema.TypeComposanteAppui;
import mpia.schema.TypeDictionaryDicoEffetTactiqueRecherche;
import mpia.schema.TypeDictionaryDicoRapportTypeSource;
import mpia.schema.TypeQuantiteTypeUnite;
import mpia.schema.TypeTraitementObjectif;
import mpia.schema.TypeVolumeMunitionsASS;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Traitement Objectif</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeTraitementObjectifImpl#getNumeroOrdre <em>Numero Ordre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTraitementObjectifImpl#getEffetARealiser <em>Effet ARealiser</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTraitementObjectifImpl#getDuree <em>Duree</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTraitementObjectifImpl#getDebut <em>Debut</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTraitementObjectifImpl#getFin <em>Fin</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTraitementObjectifImpl#getPrecisionDemandee <em>Precision Demandee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTraitementObjectifImpl#getCapteurPreferentiel <em>Capteur Preferentiel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTraitementObjectifImpl#getMesuresCoordination <em>Mesures Coordination</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTraitementObjectifImpl#getNombreMunitions <em>Nombre Munitions</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTraitementObjectifImpl#getMoyensAlloues <em>Moyens Alloues</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTraitementObjectifImpl#getEstSujetAssociationTraitementObjPlanTraitementObj <em>Est Sujet Association Traitement Obj Plan Traitement Obj</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTraitementObjectifImpl#getEstObjetAssociationPlanTraitementObjTraitementObj <em>Est Objet Association Plan Traitement Obj Traitement Obj</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTraitementObjectifImpl#getEstObjetAssociationMissionRensObjTraitementObj <em>Est Objet Association Mission Rens Obj Traitement Obj</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTraitementObjectifImpl#getAPourZIOassocieeAutreElementControle <em>APour ZI Oassociee Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTraitementObjectifImpl#getAPourComposanteAppuiAcquisitionComposanteAppui <em>APour Composante Appui Acquisition Composante Appui</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTraitementObjectifImpl#getAPourComposanteAppuiEvaluationComposanteAppui <em>APour Composante Appui Evaluation Composante Appui</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTraitementObjectifImpl#getAPourComposanteAppuiTraitementComposanteAppui <em>APour Composante Appui Traitement Composante Appui</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTraitementObjectifImpl#getAPourCompteRenduCRtraitementObjectif <em>APour Compte Rendu CRtraitement Objectif</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTraitementObjectifImpl#getAPourTypeUniteAlloueQuantiteTypeUnite <em>APour Type Unite Alloue Quantite Type Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTraitementObjectifImpl#getAPourMunitionsAlloueesVolumeMunitionsASS <em>APour Munitions Allouees Volume Munitions ASS</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTraitementObjectifImpl#getAPourInterventionGeneraleInterventionGenerale <em>APour Intervention Generale Intervention Generale</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeTraitementObjectifImpl extends TypeActiviteImpl implements TypeTraitementObjectif {
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
	 * The default value of the '{@link #getEffetARealiser() <em>Effet ARealiser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffetARealiser()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEffetTactiqueRecherche EFFET_AREALISER_EDEFAULT = TypeDictionaryDicoEffetTactiqueRecherche.NEUT;

	/**
	 * The cached value of the '{@link #getEffetARealiser() <em>Effet ARealiser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffetARealiser()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEffetTactiqueRecherche effetARealiser = EFFET_AREALISER_EDEFAULT;

	/**
	 * This is true if the Effet ARealiser attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean effetARealiserESet;

	/**
	 * The cached value of the '{@link #getDuree() <em>Duree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuree()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree duree;

	/**
	 * The default value of the '{@link #getDebut() <em>Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebut()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DEBUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDebut() <em>Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebut()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar debut = DEBUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFin() <em>Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFin()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar FIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFin() <em>Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFin()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar fin = FIN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPrecisionDemandee() <em>Precision Demandee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecisionDemandee()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur precisionDemandee;

	/**
	 * The default value of the '{@link #getCapteurPreferentiel() <em>Capteur Preferentiel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapteurPreferentiel()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoRapportTypeSource CAPTEUR_PREFERENTIEL_EDEFAULT = TypeDictionaryDicoRapportTypeSource.AIRREC;

	/**
	 * The cached value of the '{@link #getCapteurPreferentiel() <em>Capteur Preferentiel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapteurPreferentiel()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoRapportTypeSource capteurPreferentiel = CAPTEUR_PREFERENTIEL_EDEFAULT;

	/**
	 * This is true if the Capteur Preferentiel attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean capteurPreferentielESet;

	/**
	 * The default value of the '{@link #getMesuresCoordination() <em>Mesures Coordination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMesuresCoordination()
	 * @generated
	 * @ordered
	 */
	protected static final String MESURES_COORDINATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMesuresCoordination() <em>Mesures Coordination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMesuresCoordination()
	 * @generated
	 * @ordered
	 */
	protected String mesuresCoordination = MESURES_COORDINATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNombreMunitions() <em>Nombre Munitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreMunitions()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_MUNITIONS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreMunitions() <em>Nombre Munitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreMunitions()
	 * @generated
	 * @ordered
	 */
	protected long nombreMunitions = NOMBRE_MUNITIONS_EDEFAULT;

	/**
	 * This is true if the Nombre Munitions attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreMunitionsESet;

	/**
	 * The default value of the '{@link #getMoyensAlloues() <em>Moyens Alloues</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyensAlloues()
	 * @generated
	 * @ordered
	 */
	protected static final String MOYENS_ALLOUES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMoyensAlloues() <em>Moyens Alloues</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyensAlloues()
	 * @generated
	 * @ordered
	 */
	protected String moyensAlloues = MOYENS_ALLOUES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationTraitementObjPlanTraitementObj() <em>Est Sujet Association Traitement Obj Plan Traitement Obj</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationTraitementObjPlanTraitementObj()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationTraitementObjPlanTraitementObj;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationPlanTraitementObjTraitementObj() <em>Est Objet Association Plan Traitement Obj Traitement Obj</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationPlanTraitementObjTraitementObj()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationPlanTraitementObjTraitementObj;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationMissionRensObjTraitementObj() <em>Est Objet Association Mission Rens Obj Traitement Obj</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationMissionRensObjTraitementObj()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationMissionRensObjTraitementObj;

	/**
	 * The cached value of the '{@link #getAPourZIOassocieeAutreElementControle() <em>APour ZI Oassociee Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourZIOassocieeAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourZIOassocieeAutreElementControle;

	/**
	 * The cached value of the '{@link #getAPourComposanteAppuiAcquisitionComposanteAppui() <em>APour Composante Appui Acquisition Composante Appui</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourComposanteAppuiAcquisitionComposanteAppui()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeComposanteAppui> aPourComposanteAppuiAcquisitionComposanteAppui;

	/**
	 * The cached value of the '{@link #getAPourComposanteAppuiEvaluationComposanteAppui() <em>APour Composante Appui Evaluation Composante Appui</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourComposanteAppuiEvaluationComposanteAppui()
	 * @generated
	 * @ordered
	 */
	protected TypeComposanteAppui aPourComposanteAppuiEvaluationComposanteAppui;

	/**
	 * The cached value of the '{@link #getAPourComposanteAppuiTraitementComposanteAppui() <em>APour Composante Appui Traitement Composante Appui</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourComposanteAppuiTraitementComposanteAppui()
	 * @generated
	 * @ordered
	 */
	protected TypeComposanteAppui aPourComposanteAppuiTraitementComposanteAppui;

	/**
	 * The cached value of the '{@link #getAPourCompteRenduCRtraitementObjectif() <em>APour Compte Rendu CRtraitement Objectif</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCompteRenduCRtraitementObjectif()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeCRtraitementObjectif> aPourCompteRenduCRtraitementObjectif;

	/**
	 * The cached value of the '{@link #getAPourTypeUniteAlloueQuantiteTypeUnite() <em>APour Type Unite Alloue Quantite Type Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourTypeUniteAlloueQuantiteTypeUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeQuantiteTypeUnite> aPourTypeUniteAlloueQuantiteTypeUnite;

	/**
	 * The cached value of the '{@link #getAPourMunitionsAlloueesVolumeMunitionsASS() <em>APour Munitions Allouees Volume Munitions ASS</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourMunitionsAlloueesVolumeMunitionsASS()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeVolumeMunitionsASS> aPourMunitionsAlloueesVolumeMunitionsASS;

	/**
	 * The cached value of the '{@link #getAPourInterventionGeneraleInterventionGenerale() <em>APour Intervention Generale Intervention Generale</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourInterventionGeneraleInterventionGenerale()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourInterventionGeneraleInterventionGenerale;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeTraitementObjectifImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeTraitementObjectif();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__NUMERO_ORDRE, oldNumeroOrdre, numeroOrdre, !oldNumeroOrdreESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__NUMERO_ORDRE, oldNumeroOrdre, NUMERO_ORDRE_EDEFAULT, oldNumeroOrdreESet));
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
	public TypeDictionaryDicoEffetTactiqueRecherche getEffetARealiser() {
		return effetARealiser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffetARealiser(TypeDictionaryDicoEffetTactiqueRecherche newEffetARealiser) {
		TypeDictionaryDicoEffetTactiqueRecherche oldEffetARealiser = effetARealiser;
		effetARealiser = newEffetARealiser == null ? EFFET_AREALISER_EDEFAULT : newEffetARealiser;
		boolean oldEffetARealiserESet = effetARealiserESet;
		effetARealiserESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__EFFET_AREALISER, oldEffetARealiser, effetARealiser, !oldEffetARealiserESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEffetARealiser() {
		TypeDictionaryDicoEffetTactiqueRecherche oldEffetARealiser = effetARealiser;
		boolean oldEffetARealiserESet = effetARealiserESet;
		effetARealiser = EFFET_AREALISER_EDEFAULT;
		effetARealiserESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__EFFET_AREALISER, oldEffetARealiser, EFFET_AREALISER_EDEFAULT, oldEffetARealiserESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEffetARealiser() {
		return effetARealiserESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getDuree() {
		return duree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDuree(TypeDataTypeDuree newDuree, NotificationChain msgs) {
		TypeDataTypeDuree oldDuree = duree;
		duree = newDuree;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__DUREE, oldDuree, newDuree);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuree(TypeDataTypeDuree newDuree) {
		if (newDuree != duree) {
			NotificationChain msgs = null;
			if (duree != null)
				msgs = ((InternalEObject)duree).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__DUREE, null, msgs);
			if (newDuree != null)
				msgs = ((InternalEObject)newDuree).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__DUREE, null, msgs);
			msgs = basicSetDuree(newDuree, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__DUREE, newDuree, newDuree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDebut() {
		return debut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebut(XMLGregorianCalendar newDebut) {
		XMLGregorianCalendar oldDebut = debut;
		debut = newDebut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__DEBUT, oldDebut, debut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getFin() {
		return fin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFin(XMLGregorianCalendar newFin) {
		XMLGregorianCalendar oldFin = fin;
		fin = newFin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__FIN, oldFin, fin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getPrecisionDemandee() {
		return precisionDemandee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrecisionDemandee(TypeDataTypeLongueur newPrecisionDemandee, NotificationChain msgs) {
		TypeDataTypeLongueur oldPrecisionDemandee = precisionDemandee;
		precisionDemandee = newPrecisionDemandee;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__PRECISION_DEMANDEE, oldPrecisionDemandee, newPrecisionDemandee);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecisionDemandee(TypeDataTypeLongueur newPrecisionDemandee) {
		if (newPrecisionDemandee != precisionDemandee) {
			NotificationChain msgs = null;
			if (precisionDemandee != null)
				msgs = ((InternalEObject)precisionDemandee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__PRECISION_DEMANDEE, null, msgs);
			if (newPrecisionDemandee != null)
				msgs = ((InternalEObject)newPrecisionDemandee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__PRECISION_DEMANDEE, null, msgs);
			msgs = basicSetPrecisionDemandee(newPrecisionDemandee, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__PRECISION_DEMANDEE, newPrecisionDemandee, newPrecisionDemandee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoRapportTypeSource getCapteurPreferentiel() {
		return capteurPreferentiel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapteurPreferentiel(TypeDictionaryDicoRapportTypeSource newCapteurPreferentiel) {
		TypeDictionaryDicoRapportTypeSource oldCapteurPreferentiel = capteurPreferentiel;
		capteurPreferentiel = newCapteurPreferentiel == null ? CAPTEUR_PREFERENTIEL_EDEFAULT : newCapteurPreferentiel;
		boolean oldCapteurPreferentielESet = capteurPreferentielESet;
		capteurPreferentielESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__CAPTEUR_PREFERENTIEL, oldCapteurPreferentiel, capteurPreferentiel, !oldCapteurPreferentielESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCapteurPreferentiel() {
		TypeDictionaryDicoRapportTypeSource oldCapteurPreferentiel = capteurPreferentiel;
		boolean oldCapteurPreferentielESet = capteurPreferentielESet;
		capteurPreferentiel = CAPTEUR_PREFERENTIEL_EDEFAULT;
		capteurPreferentielESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__CAPTEUR_PREFERENTIEL, oldCapteurPreferentiel, CAPTEUR_PREFERENTIEL_EDEFAULT, oldCapteurPreferentielESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCapteurPreferentiel() {
		return capteurPreferentielESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMesuresCoordination() {
		return mesuresCoordination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMesuresCoordination(String newMesuresCoordination) {
		String oldMesuresCoordination = mesuresCoordination;
		mesuresCoordination = newMesuresCoordination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__MESURES_COORDINATION, oldMesuresCoordination, mesuresCoordination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreMunitions() {
		return nombreMunitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreMunitions(long newNombreMunitions) {
		long oldNombreMunitions = nombreMunitions;
		nombreMunitions = newNombreMunitions;
		boolean oldNombreMunitionsESet = nombreMunitionsESet;
		nombreMunitionsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__NOMBRE_MUNITIONS, oldNombreMunitions, nombreMunitions, !oldNombreMunitionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreMunitions() {
		long oldNombreMunitions = nombreMunitions;
		boolean oldNombreMunitionsESet = nombreMunitionsESet;
		nombreMunitions = NOMBRE_MUNITIONS_EDEFAULT;
		nombreMunitionsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__NOMBRE_MUNITIONS, oldNombreMunitions, NOMBRE_MUNITIONS_EDEFAULT, oldNombreMunitionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreMunitions() {
		return nombreMunitionsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMoyensAlloues() {
		return moyensAlloues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoyensAlloues(String newMoyensAlloues) {
		String oldMoyensAlloues = moyensAlloues;
		moyensAlloues = newMoyensAlloues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__MOYENS_ALLOUES, oldMoyensAlloues, moyensAlloues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationTraitementObjPlanTraitementObj() {
		if (estSujetAssociationTraitementObjPlanTraitementObj == null) {
			estSujetAssociationTraitementObjPlanTraitementObj = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__EST_SUJET_ASSOCIATION_TRAITEMENT_OBJ_PLAN_TRAITEMENT_OBJ);
		}
		return estSujetAssociationTraitementObjPlanTraitementObj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationPlanTraitementObjTraitementObj() {
		if (estObjetAssociationPlanTraitementObjTraitementObj == null) {
			estObjetAssociationPlanTraitementObjTraitementObj = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__EST_OBJET_ASSOCIATION_PLAN_TRAITEMENT_OBJ_TRAITEMENT_OBJ);
		}
		return estObjetAssociationPlanTraitementObjTraitementObj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationMissionRensObjTraitementObj() {
		if (estObjetAssociationMissionRensObjTraitementObj == null) {
			estObjetAssociationMissionRensObjTraitementObj = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__EST_OBJET_ASSOCIATION_MISSION_RENS_OBJ_TRAITEMENT_OBJ);
		}
		return estObjetAssociationMissionRensObjTraitementObj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourZIOassocieeAutreElementControle() {
		return aPourZIOassocieeAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourZIOassocieeAutreElementControle(TypeAssociation newAPourZIOassocieeAutreElementControle, NotificationChain msgs) {
		TypeAssociation oldAPourZIOassocieeAutreElementControle = aPourZIOassocieeAutreElementControle;
		aPourZIOassocieeAutreElementControle = newAPourZIOassocieeAutreElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_ZI_OASSOCIEE_AUTRE_ELEMENT_CONTROLE, oldAPourZIOassocieeAutreElementControle, newAPourZIOassocieeAutreElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourZIOassocieeAutreElementControle(TypeAssociation newAPourZIOassocieeAutreElementControle) {
		if (newAPourZIOassocieeAutreElementControle != aPourZIOassocieeAutreElementControle) {
			NotificationChain msgs = null;
			if (aPourZIOassocieeAutreElementControle != null)
				msgs = ((InternalEObject)aPourZIOassocieeAutreElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_ZI_OASSOCIEE_AUTRE_ELEMENT_CONTROLE, null, msgs);
			if (newAPourZIOassocieeAutreElementControle != null)
				msgs = ((InternalEObject)newAPourZIOassocieeAutreElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_ZI_OASSOCIEE_AUTRE_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetAPourZIOassocieeAutreElementControle(newAPourZIOassocieeAutreElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_ZI_OASSOCIEE_AUTRE_ELEMENT_CONTROLE, newAPourZIOassocieeAutreElementControle, newAPourZIOassocieeAutreElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeComposanteAppui> getAPourComposanteAppuiAcquisitionComposanteAppui() {
		if (aPourComposanteAppuiAcquisitionComposanteAppui == null) {
			aPourComposanteAppuiAcquisitionComposanteAppui = new EObjectContainmentEList<TypeComposanteAppui>(TypeComposanteAppui.class, this, SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_COMPOSANTE_APPUI_ACQUISITION_COMPOSANTE_APPUI);
		}
		return aPourComposanteAppuiAcquisitionComposanteAppui;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeComposanteAppui getAPourComposanteAppuiEvaluationComposanteAppui() {
		return aPourComposanteAppuiEvaluationComposanteAppui;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourComposanteAppuiEvaluationComposanteAppui(TypeComposanteAppui newAPourComposanteAppuiEvaluationComposanteAppui, NotificationChain msgs) {
		TypeComposanteAppui oldAPourComposanteAppuiEvaluationComposanteAppui = aPourComposanteAppuiEvaluationComposanteAppui;
		aPourComposanteAppuiEvaluationComposanteAppui = newAPourComposanteAppuiEvaluationComposanteAppui;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_COMPOSANTE_APPUI_EVALUATION_COMPOSANTE_APPUI, oldAPourComposanteAppuiEvaluationComposanteAppui, newAPourComposanteAppuiEvaluationComposanteAppui);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourComposanteAppuiEvaluationComposanteAppui(TypeComposanteAppui newAPourComposanteAppuiEvaluationComposanteAppui) {
		if (newAPourComposanteAppuiEvaluationComposanteAppui != aPourComposanteAppuiEvaluationComposanteAppui) {
			NotificationChain msgs = null;
			if (aPourComposanteAppuiEvaluationComposanteAppui != null)
				msgs = ((InternalEObject)aPourComposanteAppuiEvaluationComposanteAppui).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_COMPOSANTE_APPUI_EVALUATION_COMPOSANTE_APPUI, null, msgs);
			if (newAPourComposanteAppuiEvaluationComposanteAppui != null)
				msgs = ((InternalEObject)newAPourComposanteAppuiEvaluationComposanteAppui).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_COMPOSANTE_APPUI_EVALUATION_COMPOSANTE_APPUI, null, msgs);
			msgs = basicSetAPourComposanteAppuiEvaluationComposanteAppui(newAPourComposanteAppuiEvaluationComposanteAppui, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_COMPOSANTE_APPUI_EVALUATION_COMPOSANTE_APPUI, newAPourComposanteAppuiEvaluationComposanteAppui, newAPourComposanteAppuiEvaluationComposanteAppui));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeComposanteAppui getAPourComposanteAppuiTraitementComposanteAppui() {
		return aPourComposanteAppuiTraitementComposanteAppui;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourComposanteAppuiTraitementComposanteAppui(TypeComposanteAppui newAPourComposanteAppuiTraitementComposanteAppui, NotificationChain msgs) {
		TypeComposanteAppui oldAPourComposanteAppuiTraitementComposanteAppui = aPourComposanteAppuiTraitementComposanteAppui;
		aPourComposanteAppuiTraitementComposanteAppui = newAPourComposanteAppuiTraitementComposanteAppui;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_COMPOSANTE_APPUI_TRAITEMENT_COMPOSANTE_APPUI, oldAPourComposanteAppuiTraitementComposanteAppui, newAPourComposanteAppuiTraitementComposanteAppui);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourComposanteAppuiTraitementComposanteAppui(TypeComposanteAppui newAPourComposanteAppuiTraitementComposanteAppui) {
		if (newAPourComposanteAppuiTraitementComposanteAppui != aPourComposanteAppuiTraitementComposanteAppui) {
			NotificationChain msgs = null;
			if (aPourComposanteAppuiTraitementComposanteAppui != null)
				msgs = ((InternalEObject)aPourComposanteAppuiTraitementComposanteAppui).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_COMPOSANTE_APPUI_TRAITEMENT_COMPOSANTE_APPUI, null, msgs);
			if (newAPourComposanteAppuiTraitementComposanteAppui != null)
				msgs = ((InternalEObject)newAPourComposanteAppuiTraitementComposanteAppui).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_COMPOSANTE_APPUI_TRAITEMENT_COMPOSANTE_APPUI, null, msgs);
			msgs = basicSetAPourComposanteAppuiTraitementComposanteAppui(newAPourComposanteAppuiTraitementComposanteAppui, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_COMPOSANTE_APPUI_TRAITEMENT_COMPOSANTE_APPUI, newAPourComposanteAppuiTraitementComposanteAppui, newAPourComposanteAppuiTraitementComposanteAppui));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeCRtraitementObjectif> getAPourCompteRenduCRtraitementObjectif() {
		if (aPourCompteRenduCRtraitementObjectif == null) {
			aPourCompteRenduCRtraitementObjectif = new EObjectContainmentEList<TypeCRtraitementObjectif>(TypeCRtraitementObjectif.class, this, SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_COMPTE_RENDU_CRTRAITEMENT_OBJECTIF);
		}
		return aPourCompteRenduCRtraitementObjectif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeQuantiteTypeUnite> getAPourTypeUniteAlloueQuantiteTypeUnite() {
		if (aPourTypeUniteAlloueQuantiteTypeUnite == null) {
			aPourTypeUniteAlloueQuantiteTypeUnite = new EObjectContainmentEList<TypeQuantiteTypeUnite>(TypeQuantiteTypeUnite.class, this, SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_TYPE_UNITE_ALLOUE_QUANTITE_TYPE_UNITE);
		}
		return aPourTypeUniteAlloueQuantiteTypeUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeVolumeMunitionsASS> getAPourMunitionsAlloueesVolumeMunitionsASS() {
		if (aPourMunitionsAlloueesVolumeMunitionsASS == null) {
			aPourMunitionsAlloueesVolumeMunitionsASS = new EObjectContainmentEList<TypeVolumeMunitionsASS>(TypeVolumeMunitionsASS.class, this, SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_MUNITIONS_ALLOUEES_VOLUME_MUNITIONS_ASS);
		}
		return aPourMunitionsAlloueesVolumeMunitionsASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourInterventionGeneraleInterventionGenerale() {
		if (aPourInterventionGeneraleInterventionGenerale == null) {
			aPourInterventionGeneraleInterventionGenerale = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_INTERVENTION_GENERALE_INTERVENTION_GENERALE);
		}
		return aPourInterventionGeneraleInterventionGenerale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__DUREE:
				return basicSetDuree(null, msgs);
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__PRECISION_DEMANDEE:
				return basicSetPrecisionDemandee(null, msgs);
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__EST_SUJET_ASSOCIATION_TRAITEMENT_OBJ_PLAN_TRAITEMENT_OBJ:
				return ((InternalEList<?>)getEstSujetAssociationTraitementObjPlanTraitementObj()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__EST_OBJET_ASSOCIATION_PLAN_TRAITEMENT_OBJ_TRAITEMENT_OBJ:
				return ((InternalEList<?>)getEstObjetAssociationPlanTraitementObjTraitementObj()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__EST_OBJET_ASSOCIATION_MISSION_RENS_OBJ_TRAITEMENT_OBJ:
				return ((InternalEList<?>)getEstObjetAssociationMissionRensObjTraitementObj()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_ZI_OASSOCIEE_AUTRE_ELEMENT_CONTROLE:
				return basicSetAPourZIOassocieeAutreElementControle(null, msgs);
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_COMPOSANTE_APPUI_ACQUISITION_COMPOSANTE_APPUI:
				return ((InternalEList<?>)getAPourComposanteAppuiAcquisitionComposanteAppui()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_COMPOSANTE_APPUI_EVALUATION_COMPOSANTE_APPUI:
				return basicSetAPourComposanteAppuiEvaluationComposanteAppui(null, msgs);
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_COMPOSANTE_APPUI_TRAITEMENT_COMPOSANTE_APPUI:
				return basicSetAPourComposanteAppuiTraitementComposanteAppui(null, msgs);
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_COMPTE_RENDU_CRTRAITEMENT_OBJECTIF:
				return ((InternalEList<?>)getAPourCompteRenduCRtraitementObjectif()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_TYPE_UNITE_ALLOUE_QUANTITE_TYPE_UNITE:
				return ((InternalEList<?>)getAPourTypeUniteAlloueQuantiteTypeUnite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_MUNITIONS_ALLOUEES_VOLUME_MUNITIONS_ASS:
				return ((InternalEList<?>)getAPourMunitionsAlloueesVolumeMunitionsASS()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_INTERVENTION_GENERALE_INTERVENTION_GENERALE:
				return ((InternalEList<?>)getAPourInterventionGeneraleInterventionGenerale()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__NUMERO_ORDRE:
				return new Long(getNumeroOrdre());
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__EFFET_AREALISER:
				return getEffetARealiser();
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__DUREE:
				return getDuree();
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__DEBUT:
				return getDebut();
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__FIN:
				return getFin();
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__PRECISION_DEMANDEE:
				return getPrecisionDemandee();
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__CAPTEUR_PREFERENTIEL:
				return getCapteurPreferentiel();
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__MESURES_COORDINATION:
				return getMesuresCoordination();
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__NOMBRE_MUNITIONS:
				return new Long(getNombreMunitions());
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__MOYENS_ALLOUES:
				return getMoyensAlloues();
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__EST_SUJET_ASSOCIATION_TRAITEMENT_OBJ_PLAN_TRAITEMENT_OBJ:
				return getEstSujetAssociationTraitementObjPlanTraitementObj();
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__EST_OBJET_ASSOCIATION_PLAN_TRAITEMENT_OBJ_TRAITEMENT_OBJ:
				return getEstObjetAssociationPlanTraitementObjTraitementObj();
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__EST_OBJET_ASSOCIATION_MISSION_RENS_OBJ_TRAITEMENT_OBJ:
				return getEstObjetAssociationMissionRensObjTraitementObj();
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_ZI_OASSOCIEE_AUTRE_ELEMENT_CONTROLE:
				return getAPourZIOassocieeAutreElementControle();
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_COMPOSANTE_APPUI_ACQUISITION_COMPOSANTE_APPUI:
				return getAPourComposanteAppuiAcquisitionComposanteAppui();
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_COMPOSANTE_APPUI_EVALUATION_COMPOSANTE_APPUI:
				return getAPourComposanteAppuiEvaluationComposanteAppui();
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_COMPOSANTE_APPUI_TRAITEMENT_COMPOSANTE_APPUI:
				return getAPourComposanteAppuiTraitementComposanteAppui();
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_COMPTE_RENDU_CRTRAITEMENT_OBJECTIF:
				return getAPourCompteRenduCRtraitementObjectif();
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_TYPE_UNITE_ALLOUE_QUANTITE_TYPE_UNITE:
				return getAPourTypeUniteAlloueQuantiteTypeUnite();
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_MUNITIONS_ALLOUEES_VOLUME_MUNITIONS_ASS:
				return getAPourMunitionsAlloueesVolumeMunitionsASS();
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_INTERVENTION_GENERALE_INTERVENTION_GENERALE:
				return getAPourInterventionGeneraleInterventionGenerale();
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
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__NUMERO_ORDRE:
				setNumeroOrdre(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__EFFET_AREALISER:
				setEffetARealiser((TypeDictionaryDicoEffetTactiqueRecherche)newValue);
				return;
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__DUREE:
				setDuree((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__DEBUT:
				setDebut((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__FIN:
				setFin((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__PRECISION_DEMANDEE:
				setPrecisionDemandee((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__CAPTEUR_PREFERENTIEL:
				setCapteurPreferentiel((TypeDictionaryDicoRapportTypeSource)newValue);
				return;
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__MESURES_COORDINATION:
				setMesuresCoordination((String)newValue);
				return;
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__NOMBRE_MUNITIONS:
				setNombreMunitions(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__MOYENS_ALLOUES:
				setMoyensAlloues((String)newValue);
				return;
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__EST_SUJET_ASSOCIATION_TRAITEMENT_OBJ_PLAN_TRAITEMENT_OBJ:
				getEstSujetAssociationTraitementObjPlanTraitementObj().clear();
				getEstSujetAssociationTraitementObjPlanTraitementObj().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__EST_OBJET_ASSOCIATION_PLAN_TRAITEMENT_OBJ_TRAITEMENT_OBJ:
				getEstObjetAssociationPlanTraitementObjTraitementObj().clear();
				getEstObjetAssociationPlanTraitementObjTraitementObj().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__EST_OBJET_ASSOCIATION_MISSION_RENS_OBJ_TRAITEMENT_OBJ:
				getEstObjetAssociationMissionRensObjTraitementObj().clear();
				getEstObjetAssociationMissionRensObjTraitementObj().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_ZI_OASSOCIEE_AUTRE_ELEMENT_CONTROLE:
				setAPourZIOassocieeAutreElementControle((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_COMPOSANTE_APPUI_ACQUISITION_COMPOSANTE_APPUI:
				getAPourComposanteAppuiAcquisitionComposanteAppui().clear();
				getAPourComposanteAppuiAcquisitionComposanteAppui().addAll((Collection<? extends TypeComposanteAppui>)newValue);
				return;
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_COMPOSANTE_APPUI_EVALUATION_COMPOSANTE_APPUI:
				setAPourComposanteAppuiEvaluationComposanteAppui((TypeComposanteAppui)newValue);
				return;
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_COMPOSANTE_APPUI_TRAITEMENT_COMPOSANTE_APPUI:
				setAPourComposanteAppuiTraitementComposanteAppui((TypeComposanteAppui)newValue);
				return;
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_COMPTE_RENDU_CRTRAITEMENT_OBJECTIF:
				getAPourCompteRenduCRtraitementObjectif().clear();
				getAPourCompteRenduCRtraitementObjectif().addAll((Collection<? extends TypeCRtraitementObjectif>)newValue);
				return;
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_TYPE_UNITE_ALLOUE_QUANTITE_TYPE_UNITE:
				getAPourTypeUniteAlloueQuantiteTypeUnite().clear();
				getAPourTypeUniteAlloueQuantiteTypeUnite().addAll((Collection<? extends TypeQuantiteTypeUnite>)newValue);
				return;
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_MUNITIONS_ALLOUEES_VOLUME_MUNITIONS_ASS:
				getAPourMunitionsAlloueesVolumeMunitionsASS().clear();
				getAPourMunitionsAlloueesVolumeMunitionsASS().addAll((Collection<? extends TypeVolumeMunitionsASS>)newValue);
				return;
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_INTERVENTION_GENERALE_INTERVENTION_GENERALE:
				getAPourInterventionGeneraleInterventionGenerale().clear();
				getAPourInterventionGeneraleInterventionGenerale().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__NUMERO_ORDRE:
				unsetNumeroOrdre();
				return;
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__EFFET_AREALISER:
				unsetEffetARealiser();
				return;
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__DUREE:
				setDuree((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__DEBUT:
				setDebut(DEBUT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__FIN:
				setFin(FIN_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__PRECISION_DEMANDEE:
				setPrecisionDemandee((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__CAPTEUR_PREFERENTIEL:
				unsetCapteurPreferentiel();
				return;
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__MESURES_COORDINATION:
				setMesuresCoordination(MESURES_COORDINATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__NOMBRE_MUNITIONS:
				unsetNombreMunitions();
				return;
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__MOYENS_ALLOUES:
				setMoyensAlloues(MOYENS_ALLOUES_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__EST_SUJET_ASSOCIATION_TRAITEMENT_OBJ_PLAN_TRAITEMENT_OBJ:
				getEstSujetAssociationTraitementObjPlanTraitementObj().clear();
				return;
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__EST_OBJET_ASSOCIATION_PLAN_TRAITEMENT_OBJ_TRAITEMENT_OBJ:
				getEstObjetAssociationPlanTraitementObjTraitementObj().clear();
				return;
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__EST_OBJET_ASSOCIATION_MISSION_RENS_OBJ_TRAITEMENT_OBJ:
				getEstObjetAssociationMissionRensObjTraitementObj().clear();
				return;
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_ZI_OASSOCIEE_AUTRE_ELEMENT_CONTROLE:
				setAPourZIOassocieeAutreElementControle((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_COMPOSANTE_APPUI_ACQUISITION_COMPOSANTE_APPUI:
				getAPourComposanteAppuiAcquisitionComposanteAppui().clear();
				return;
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_COMPOSANTE_APPUI_EVALUATION_COMPOSANTE_APPUI:
				setAPourComposanteAppuiEvaluationComposanteAppui((TypeComposanteAppui)null);
				return;
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_COMPOSANTE_APPUI_TRAITEMENT_COMPOSANTE_APPUI:
				setAPourComposanteAppuiTraitementComposanteAppui((TypeComposanteAppui)null);
				return;
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_COMPTE_RENDU_CRTRAITEMENT_OBJECTIF:
				getAPourCompteRenduCRtraitementObjectif().clear();
				return;
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_TYPE_UNITE_ALLOUE_QUANTITE_TYPE_UNITE:
				getAPourTypeUniteAlloueQuantiteTypeUnite().clear();
				return;
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_MUNITIONS_ALLOUEES_VOLUME_MUNITIONS_ASS:
				getAPourMunitionsAlloueesVolumeMunitionsASS().clear();
				return;
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_INTERVENTION_GENERALE_INTERVENTION_GENERALE:
				getAPourInterventionGeneraleInterventionGenerale().clear();
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
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__NUMERO_ORDRE:
				return isSetNumeroOrdre();
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__EFFET_AREALISER:
				return isSetEffetARealiser();
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__DUREE:
				return duree != null;
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__DEBUT:
				return DEBUT_EDEFAULT == null ? debut != null : !DEBUT_EDEFAULT.equals(debut);
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__FIN:
				return FIN_EDEFAULT == null ? fin != null : !FIN_EDEFAULT.equals(fin);
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__PRECISION_DEMANDEE:
				return precisionDemandee != null;
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__CAPTEUR_PREFERENTIEL:
				return isSetCapteurPreferentiel();
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__MESURES_COORDINATION:
				return MESURES_COORDINATION_EDEFAULT == null ? mesuresCoordination != null : !MESURES_COORDINATION_EDEFAULT.equals(mesuresCoordination);
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__NOMBRE_MUNITIONS:
				return isSetNombreMunitions();
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__MOYENS_ALLOUES:
				return MOYENS_ALLOUES_EDEFAULT == null ? moyensAlloues != null : !MOYENS_ALLOUES_EDEFAULT.equals(moyensAlloues);
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__EST_SUJET_ASSOCIATION_TRAITEMENT_OBJ_PLAN_TRAITEMENT_OBJ:
				return estSujetAssociationTraitementObjPlanTraitementObj != null && !estSujetAssociationTraitementObjPlanTraitementObj.isEmpty();
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__EST_OBJET_ASSOCIATION_PLAN_TRAITEMENT_OBJ_TRAITEMENT_OBJ:
				return estObjetAssociationPlanTraitementObjTraitementObj != null && !estObjetAssociationPlanTraitementObjTraitementObj.isEmpty();
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__EST_OBJET_ASSOCIATION_MISSION_RENS_OBJ_TRAITEMENT_OBJ:
				return estObjetAssociationMissionRensObjTraitementObj != null && !estObjetAssociationMissionRensObjTraitementObj.isEmpty();
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_ZI_OASSOCIEE_AUTRE_ELEMENT_CONTROLE:
				return aPourZIOassocieeAutreElementControle != null;
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_COMPOSANTE_APPUI_ACQUISITION_COMPOSANTE_APPUI:
				return aPourComposanteAppuiAcquisitionComposanteAppui != null && !aPourComposanteAppuiAcquisitionComposanteAppui.isEmpty();
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_COMPOSANTE_APPUI_EVALUATION_COMPOSANTE_APPUI:
				return aPourComposanteAppuiEvaluationComposanteAppui != null;
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_COMPOSANTE_APPUI_TRAITEMENT_COMPOSANTE_APPUI:
				return aPourComposanteAppuiTraitementComposanteAppui != null;
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_COMPTE_RENDU_CRTRAITEMENT_OBJECTIF:
				return aPourCompteRenduCRtraitementObjectif != null && !aPourCompteRenduCRtraitementObjectif.isEmpty();
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_TYPE_UNITE_ALLOUE_QUANTITE_TYPE_UNITE:
				return aPourTypeUniteAlloueQuantiteTypeUnite != null && !aPourTypeUniteAlloueQuantiteTypeUnite.isEmpty();
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_MUNITIONS_ALLOUEES_VOLUME_MUNITIONS_ASS:
				return aPourMunitionsAlloueesVolumeMunitionsASS != null && !aPourMunitionsAlloueesVolumeMunitionsASS.isEmpty();
			case SchemaPackage.TYPE_TRAITEMENT_OBJECTIF__APOUR_INTERVENTION_GENERALE_INTERVENTION_GENERALE:
				return aPourInterventionGeneraleInterventionGenerale != null && !aPourInterventionGeneraleInterventionGenerale.isEmpty();
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
		result.append(" (numeroOrdre: ");
		if (numeroOrdreESet) result.append(numeroOrdre); else result.append("<unset>");
		result.append(", effetARealiser: ");
		if (effetARealiserESet) result.append(effetARealiser); else result.append("<unset>");
		result.append(", debut: ");
		result.append(debut);
		result.append(", fin: ");
		result.append(fin);
		result.append(", capteurPreferentiel: ");
		if (capteurPreferentielESet) result.append(capteurPreferentiel); else result.append("<unset>");
		result.append(", mesuresCoordination: ");
		result.append(mesuresCoordination);
		result.append(", nombreMunitions: ");
		if (nombreMunitionsESet) result.append(nombreMunitions); else result.append("<unset>");
		result.append(", moyensAlloues: ");
		result.append(moyensAlloues);
		result.append(')');
		return result.toString();
	}

} //TypeTraitementObjectifImpl
