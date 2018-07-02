/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeDataTypeDuree;
import mpia.meta.TypeDataTypeLongueur;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDatation;
import mpia.schema.TypeDictionaryDicoObjectifASSEnvironnement;
import mpia.schema.TypeLocalisationObjectif;
import mpia.schema.TypeObjectifASS;
import mpia.schema.TypeTypeObjectifASS;

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
 * An implementation of the model object '<em><b>Type Objectif ASS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeObjectifASSImpl#getDureeEngagement <em>Duree Engagement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifASSImpl#getEnvironnement <em>Environnement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifASSImpl#getAutreEnvironnement <em>Autre Environnement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifASSImpl#getNombreElements <em>Nombre Elements</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifASSImpl#getNumeroOccurrenceDansPDF <em>Numero Occurrence Dans PDF</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifASSImpl#getPrecisionLocalisation <em>Precision Localisation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifASSImpl#getEtat <em>Etat</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifASSImpl#getAPourLocalisationLocalisationObjectif <em>APour Localisation Localisation Objectif</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifASSImpl#getAPourDebutTraitementADemandeDatation <em>APour Debut Traitement ADemande Datation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifASSImpl#getAPourFinTraitementADemandeDatation <em>APour Fin Traitement ADemande Datation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifASSImpl#getAPourHoraireTraitementAHoraireDatation <em>APour Horaire Traitement AHoraire Datation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifASSImpl#getAPourTypeTypeObjectifASS <em>APour Type Type Objectif ASS</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeObjectifASSImpl extends EObjectImpl implements TypeObjectifASS {
	/**
	 * The cached value of the '{@link #getDureeEngagement() <em>Duree Engagement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDureeEngagement()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree dureeEngagement;

	/**
	 * The default value of the '{@link #getEnvironnement() <em>Environnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironnement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoObjectifASSEnvironnement ENVIRONNEMENT_EDEFAULT = TypeDictionaryDicoObjectifASSEnvironnement.LBLTA;

	/**
	 * The cached value of the '{@link #getEnvironnement() <em>Environnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironnement()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoObjectifASSEnvironnement environnement = ENVIRONNEMENT_EDEFAULT;

	/**
	 * This is true if the Environnement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean environnementESet;

	/**
	 * The default value of the '{@link #getAutreEnvironnement() <em>Autre Environnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreEnvironnement()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTRE_ENVIRONNEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutreEnvironnement() <em>Autre Environnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreEnvironnement()
	 * @generated
	 * @ordered
	 */
	protected String autreEnvironnement = AUTRE_ENVIRONNEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNombreElements() <em>Nombre Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreElements()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_ELEMENTS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreElements() <em>Nombre Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreElements()
	 * @generated
	 * @ordered
	 */
	protected long nombreElements = NOMBRE_ELEMENTS_EDEFAULT;

	/**
	 * This is true if the Nombre Elements attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreElementsESet;

	/**
	 * The default value of the '{@link #getNumeroOccurrenceDansPDF() <em>Numero Occurrence Dans PDF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroOccurrenceDansPDF()
	 * @generated
	 * @ordered
	 */
	protected static final long NUMERO_OCCURRENCE_DANS_PDF_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNumeroOccurrenceDansPDF() <em>Numero Occurrence Dans PDF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroOccurrenceDansPDF()
	 * @generated
	 * @ordered
	 */
	protected long numeroOccurrenceDansPDF = NUMERO_OCCURRENCE_DANS_PDF_EDEFAULT;

	/**
	 * This is true if the Numero Occurrence Dans PDF attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numeroOccurrenceDansPDFESet;

	/**
	 * The cached value of the '{@link #getPrecisionLocalisation() <em>Precision Localisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecisionLocalisation()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur precisionLocalisation;

	/**
	 * The default value of the '{@link #getEtat() <em>Etat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtat()
	 * @generated
	 * @ordered
	 */
	protected static final String ETAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEtat() <em>Etat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtat()
	 * @generated
	 * @ordered
	 */
	protected String etat = ETAT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAPourLocalisationLocalisationObjectif() <em>APour Localisation Localisation Objectif</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourLocalisationLocalisationObjectif()
	 * @generated
	 * @ordered
	 */
	protected TypeLocalisationObjectif aPourLocalisationLocalisationObjectif;

	/**
	 * The cached value of the '{@link #getAPourDebutTraitementADemandeDatation() <em>APour Debut Traitement ADemande Datation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourDebutTraitementADemandeDatation()
	 * @generated
	 * @ordered
	 */
	protected TypeDatation aPourDebutTraitementADemandeDatation;

	/**
	 * The cached value of the '{@link #getAPourFinTraitementADemandeDatation() <em>APour Fin Traitement ADemande Datation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourFinTraitementADemandeDatation()
	 * @generated
	 * @ordered
	 */
	protected TypeDatation aPourFinTraitementADemandeDatation;

	/**
	 * The cached value of the '{@link #getAPourHoraireTraitementAHoraireDatation() <em>APour Horaire Traitement AHoraire Datation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourHoraireTraitementAHoraireDatation()
	 * @generated
	 * @ordered
	 */
	protected TypeDatation aPourHoraireTraitementAHoraireDatation;

	/**
	 * The cached value of the '{@link #getAPourTypeTypeObjectifASS() <em>APour Type Type Objectif ASS</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourTypeTypeObjectifASS()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeTypeObjectifASS> aPourTypeTypeObjectifASS;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeObjectifASSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeObjectifASS();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getDureeEngagement() {
		return dureeEngagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDureeEngagement(TypeDataTypeDuree newDureeEngagement, NotificationChain msgs) {
		TypeDataTypeDuree oldDureeEngagement = dureeEngagement;
		dureeEngagement = newDureeEngagement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_ASS__DUREE_ENGAGEMENT, oldDureeEngagement, newDureeEngagement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDureeEngagement(TypeDataTypeDuree newDureeEngagement) {
		if (newDureeEngagement != dureeEngagement) {
			NotificationChain msgs = null;
			if (dureeEngagement != null)
				msgs = ((InternalEObject)dureeEngagement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBJECTIF_ASS__DUREE_ENGAGEMENT, null, msgs);
			if (newDureeEngagement != null)
				msgs = ((InternalEObject)newDureeEngagement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBJECTIF_ASS__DUREE_ENGAGEMENT, null, msgs);
			msgs = basicSetDureeEngagement(newDureeEngagement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_ASS__DUREE_ENGAGEMENT, newDureeEngagement, newDureeEngagement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoObjectifASSEnvironnement getEnvironnement() {
		return environnement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironnement(TypeDictionaryDicoObjectifASSEnvironnement newEnvironnement) {
		TypeDictionaryDicoObjectifASSEnvironnement oldEnvironnement = environnement;
		environnement = newEnvironnement == null ? ENVIRONNEMENT_EDEFAULT : newEnvironnement;
		boolean oldEnvironnementESet = environnementESet;
		environnementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_ASS__ENVIRONNEMENT, oldEnvironnement, environnement, !oldEnvironnementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEnvironnement() {
		TypeDictionaryDicoObjectifASSEnvironnement oldEnvironnement = environnement;
		boolean oldEnvironnementESet = environnementESet;
		environnement = ENVIRONNEMENT_EDEFAULT;
		environnementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_OBJECTIF_ASS__ENVIRONNEMENT, oldEnvironnement, ENVIRONNEMENT_EDEFAULT, oldEnvironnementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEnvironnement() {
		return environnementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutreEnvironnement() {
		return autreEnvironnement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutreEnvironnement(String newAutreEnvironnement) {
		String oldAutreEnvironnement = autreEnvironnement;
		autreEnvironnement = newAutreEnvironnement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_ASS__AUTRE_ENVIRONNEMENT, oldAutreEnvironnement, autreEnvironnement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreElements() {
		return nombreElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreElements(long newNombreElements) {
		long oldNombreElements = nombreElements;
		nombreElements = newNombreElements;
		boolean oldNombreElementsESet = nombreElementsESet;
		nombreElementsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_ASS__NOMBRE_ELEMENTS, oldNombreElements, nombreElements, !oldNombreElementsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreElements() {
		long oldNombreElements = nombreElements;
		boolean oldNombreElementsESet = nombreElementsESet;
		nombreElements = NOMBRE_ELEMENTS_EDEFAULT;
		nombreElementsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_OBJECTIF_ASS__NOMBRE_ELEMENTS, oldNombreElements, NOMBRE_ELEMENTS_EDEFAULT, oldNombreElementsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreElements() {
		return nombreElementsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNumeroOccurrenceDansPDF() {
		return numeroOccurrenceDansPDF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroOccurrenceDansPDF(long newNumeroOccurrenceDansPDF) {
		long oldNumeroOccurrenceDansPDF = numeroOccurrenceDansPDF;
		numeroOccurrenceDansPDF = newNumeroOccurrenceDansPDF;
		boolean oldNumeroOccurrenceDansPDFESet = numeroOccurrenceDansPDFESet;
		numeroOccurrenceDansPDFESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_ASS__NUMERO_OCCURRENCE_DANS_PDF, oldNumeroOccurrenceDansPDF, numeroOccurrenceDansPDF, !oldNumeroOccurrenceDansPDFESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumeroOccurrenceDansPDF() {
		long oldNumeroOccurrenceDansPDF = numeroOccurrenceDansPDF;
		boolean oldNumeroOccurrenceDansPDFESet = numeroOccurrenceDansPDFESet;
		numeroOccurrenceDansPDF = NUMERO_OCCURRENCE_DANS_PDF_EDEFAULT;
		numeroOccurrenceDansPDFESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_OBJECTIF_ASS__NUMERO_OCCURRENCE_DANS_PDF, oldNumeroOccurrenceDansPDF, NUMERO_OCCURRENCE_DANS_PDF_EDEFAULT, oldNumeroOccurrenceDansPDFESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumeroOccurrenceDansPDF() {
		return numeroOccurrenceDansPDFESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getPrecisionLocalisation() {
		return precisionLocalisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrecisionLocalisation(TypeDataTypeLongueur newPrecisionLocalisation, NotificationChain msgs) {
		TypeDataTypeLongueur oldPrecisionLocalisation = precisionLocalisation;
		precisionLocalisation = newPrecisionLocalisation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_ASS__PRECISION_LOCALISATION, oldPrecisionLocalisation, newPrecisionLocalisation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecisionLocalisation(TypeDataTypeLongueur newPrecisionLocalisation) {
		if (newPrecisionLocalisation != precisionLocalisation) {
			NotificationChain msgs = null;
			if (precisionLocalisation != null)
				msgs = ((InternalEObject)precisionLocalisation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBJECTIF_ASS__PRECISION_LOCALISATION, null, msgs);
			if (newPrecisionLocalisation != null)
				msgs = ((InternalEObject)newPrecisionLocalisation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBJECTIF_ASS__PRECISION_LOCALISATION, null, msgs);
			msgs = basicSetPrecisionLocalisation(newPrecisionLocalisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_ASS__PRECISION_LOCALISATION, newPrecisionLocalisation, newPrecisionLocalisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtat() {
		return etat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtat(String newEtat) {
		String oldEtat = etat;
		etat = newEtat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_ASS__ETAT, oldEtat, etat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeLocalisationObjectif getAPourLocalisationLocalisationObjectif() {
		return aPourLocalisationLocalisationObjectif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourLocalisationLocalisationObjectif(TypeLocalisationObjectif newAPourLocalisationLocalisationObjectif, NotificationChain msgs) {
		TypeLocalisationObjectif oldAPourLocalisationLocalisationObjectif = aPourLocalisationLocalisationObjectif;
		aPourLocalisationLocalisationObjectif = newAPourLocalisationLocalisationObjectif;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_ASS__APOUR_LOCALISATION_LOCALISATION_OBJECTIF, oldAPourLocalisationLocalisationObjectif, newAPourLocalisationLocalisationObjectif);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourLocalisationLocalisationObjectif(TypeLocalisationObjectif newAPourLocalisationLocalisationObjectif) {
		if (newAPourLocalisationLocalisationObjectif != aPourLocalisationLocalisationObjectif) {
			NotificationChain msgs = null;
			if (aPourLocalisationLocalisationObjectif != null)
				msgs = ((InternalEObject)aPourLocalisationLocalisationObjectif).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBJECTIF_ASS__APOUR_LOCALISATION_LOCALISATION_OBJECTIF, null, msgs);
			if (newAPourLocalisationLocalisationObjectif != null)
				msgs = ((InternalEObject)newAPourLocalisationLocalisationObjectif).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBJECTIF_ASS__APOUR_LOCALISATION_LOCALISATION_OBJECTIF, null, msgs);
			msgs = basicSetAPourLocalisationLocalisationObjectif(newAPourLocalisationLocalisationObjectif, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_ASS__APOUR_LOCALISATION_LOCALISATION_OBJECTIF, newAPourLocalisationLocalisationObjectif, newAPourLocalisationLocalisationObjectif));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDatation getAPourDebutTraitementADemandeDatation() {
		return aPourDebutTraitementADemandeDatation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourDebutTraitementADemandeDatation(TypeDatation newAPourDebutTraitementADemandeDatation, NotificationChain msgs) {
		TypeDatation oldAPourDebutTraitementADemandeDatation = aPourDebutTraitementADemandeDatation;
		aPourDebutTraitementADemandeDatation = newAPourDebutTraitementADemandeDatation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_ASS__APOUR_DEBUT_TRAITEMENT_ADEMANDE_DATATION, oldAPourDebutTraitementADemandeDatation, newAPourDebutTraitementADemandeDatation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourDebutTraitementADemandeDatation(TypeDatation newAPourDebutTraitementADemandeDatation) {
		if (newAPourDebutTraitementADemandeDatation != aPourDebutTraitementADemandeDatation) {
			NotificationChain msgs = null;
			if (aPourDebutTraitementADemandeDatation != null)
				msgs = ((InternalEObject)aPourDebutTraitementADemandeDatation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBJECTIF_ASS__APOUR_DEBUT_TRAITEMENT_ADEMANDE_DATATION, null, msgs);
			if (newAPourDebutTraitementADemandeDatation != null)
				msgs = ((InternalEObject)newAPourDebutTraitementADemandeDatation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBJECTIF_ASS__APOUR_DEBUT_TRAITEMENT_ADEMANDE_DATATION, null, msgs);
			msgs = basicSetAPourDebutTraitementADemandeDatation(newAPourDebutTraitementADemandeDatation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_ASS__APOUR_DEBUT_TRAITEMENT_ADEMANDE_DATATION, newAPourDebutTraitementADemandeDatation, newAPourDebutTraitementADemandeDatation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDatation getAPourFinTraitementADemandeDatation() {
		return aPourFinTraitementADemandeDatation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourFinTraitementADemandeDatation(TypeDatation newAPourFinTraitementADemandeDatation, NotificationChain msgs) {
		TypeDatation oldAPourFinTraitementADemandeDatation = aPourFinTraitementADemandeDatation;
		aPourFinTraitementADemandeDatation = newAPourFinTraitementADemandeDatation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_ASS__APOUR_FIN_TRAITEMENT_ADEMANDE_DATATION, oldAPourFinTraitementADemandeDatation, newAPourFinTraitementADemandeDatation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourFinTraitementADemandeDatation(TypeDatation newAPourFinTraitementADemandeDatation) {
		if (newAPourFinTraitementADemandeDatation != aPourFinTraitementADemandeDatation) {
			NotificationChain msgs = null;
			if (aPourFinTraitementADemandeDatation != null)
				msgs = ((InternalEObject)aPourFinTraitementADemandeDatation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBJECTIF_ASS__APOUR_FIN_TRAITEMENT_ADEMANDE_DATATION, null, msgs);
			if (newAPourFinTraitementADemandeDatation != null)
				msgs = ((InternalEObject)newAPourFinTraitementADemandeDatation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBJECTIF_ASS__APOUR_FIN_TRAITEMENT_ADEMANDE_DATATION, null, msgs);
			msgs = basicSetAPourFinTraitementADemandeDatation(newAPourFinTraitementADemandeDatation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_ASS__APOUR_FIN_TRAITEMENT_ADEMANDE_DATATION, newAPourFinTraitementADemandeDatation, newAPourFinTraitementADemandeDatation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDatation getAPourHoraireTraitementAHoraireDatation() {
		return aPourHoraireTraitementAHoraireDatation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourHoraireTraitementAHoraireDatation(TypeDatation newAPourHoraireTraitementAHoraireDatation, NotificationChain msgs) {
		TypeDatation oldAPourHoraireTraitementAHoraireDatation = aPourHoraireTraitementAHoraireDatation;
		aPourHoraireTraitementAHoraireDatation = newAPourHoraireTraitementAHoraireDatation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_ASS__APOUR_HORAIRE_TRAITEMENT_AHORAIRE_DATATION, oldAPourHoraireTraitementAHoraireDatation, newAPourHoraireTraitementAHoraireDatation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourHoraireTraitementAHoraireDatation(TypeDatation newAPourHoraireTraitementAHoraireDatation) {
		if (newAPourHoraireTraitementAHoraireDatation != aPourHoraireTraitementAHoraireDatation) {
			NotificationChain msgs = null;
			if (aPourHoraireTraitementAHoraireDatation != null)
				msgs = ((InternalEObject)aPourHoraireTraitementAHoraireDatation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBJECTIF_ASS__APOUR_HORAIRE_TRAITEMENT_AHORAIRE_DATATION, null, msgs);
			if (newAPourHoraireTraitementAHoraireDatation != null)
				msgs = ((InternalEObject)newAPourHoraireTraitementAHoraireDatation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBJECTIF_ASS__APOUR_HORAIRE_TRAITEMENT_AHORAIRE_DATATION, null, msgs);
			msgs = basicSetAPourHoraireTraitementAHoraireDatation(newAPourHoraireTraitementAHoraireDatation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_ASS__APOUR_HORAIRE_TRAITEMENT_AHORAIRE_DATATION, newAPourHoraireTraitementAHoraireDatation, newAPourHoraireTraitementAHoraireDatation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTypeObjectifASS> getAPourTypeTypeObjectifASS() {
		if (aPourTypeTypeObjectifASS == null) {
			aPourTypeTypeObjectifASS = new EObjectContainmentEList<TypeTypeObjectifASS>(TypeTypeObjectifASS.class, this, SchemaPackage.TYPE_OBJECTIF_ASS__APOUR_TYPE_TYPE_OBJECTIF_ASS);
		}
		return aPourTypeTypeObjectifASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_OBJECTIF_ASS__DUREE_ENGAGEMENT:
				return basicSetDureeEngagement(null, msgs);
			case SchemaPackage.TYPE_OBJECTIF_ASS__PRECISION_LOCALISATION:
				return basicSetPrecisionLocalisation(null, msgs);
			case SchemaPackage.TYPE_OBJECTIF_ASS__APOUR_LOCALISATION_LOCALISATION_OBJECTIF:
				return basicSetAPourLocalisationLocalisationObjectif(null, msgs);
			case SchemaPackage.TYPE_OBJECTIF_ASS__APOUR_DEBUT_TRAITEMENT_ADEMANDE_DATATION:
				return basicSetAPourDebutTraitementADemandeDatation(null, msgs);
			case SchemaPackage.TYPE_OBJECTIF_ASS__APOUR_FIN_TRAITEMENT_ADEMANDE_DATATION:
				return basicSetAPourFinTraitementADemandeDatation(null, msgs);
			case SchemaPackage.TYPE_OBJECTIF_ASS__APOUR_HORAIRE_TRAITEMENT_AHORAIRE_DATATION:
				return basicSetAPourHoraireTraitementAHoraireDatation(null, msgs);
			case SchemaPackage.TYPE_OBJECTIF_ASS__APOUR_TYPE_TYPE_OBJECTIF_ASS:
				return ((InternalEList<?>)getAPourTypeTypeObjectifASS()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_OBJECTIF_ASS__DUREE_ENGAGEMENT:
				return getDureeEngagement();
			case SchemaPackage.TYPE_OBJECTIF_ASS__ENVIRONNEMENT:
				return getEnvironnement();
			case SchemaPackage.TYPE_OBJECTIF_ASS__AUTRE_ENVIRONNEMENT:
				return getAutreEnvironnement();
			case SchemaPackage.TYPE_OBJECTIF_ASS__NOMBRE_ELEMENTS:
				return new Long(getNombreElements());
			case SchemaPackage.TYPE_OBJECTIF_ASS__NUMERO_OCCURRENCE_DANS_PDF:
				return new Long(getNumeroOccurrenceDansPDF());
			case SchemaPackage.TYPE_OBJECTIF_ASS__PRECISION_LOCALISATION:
				return getPrecisionLocalisation();
			case SchemaPackage.TYPE_OBJECTIF_ASS__ETAT:
				return getEtat();
			case SchemaPackage.TYPE_OBJECTIF_ASS__APOUR_LOCALISATION_LOCALISATION_OBJECTIF:
				return getAPourLocalisationLocalisationObjectif();
			case SchemaPackage.TYPE_OBJECTIF_ASS__APOUR_DEBUT_TRAITEMENT_ADEMANDE_DATATION:
				return getAPourDebutTraitementADemandeDatation();
			case SchemaPackage.TYPE_OBJECTIF_ASS__APOUR_FIN_TRAITEMENT_ADEMANDE_DATATION:
				return getAPourFinTraitementADemandeDatation();
			case SchemaPackage.TYPE_OBJECTIF_ASS__APOUR_HORAIRE_TRAITEMENT_AHORAIRE_DATATION:
				return getAPourHoraireTraitementAHoraireDatation();
			case SchemaPackage.TYPE_OBJECTIF_ASS__APOUR_TYPE_TYPE_OBJECTIF_ASS:
				return getAPourTypeTypeObjectifASS();
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
			case SchemaPackage.TYPE_OBJECTIF_ASS__DUREE_ENGAGEMENT:
				setDureeEngagement((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_ASS__ENVIRONNEMENT:
				setEnvironnement((TypeDictionaryDicoObjectifASSEnvironnement)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_ASS__AUTRE_ENVIRONNEMENT:
				setAutreEnvironnement((String)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_ASS__NOMBRE_ELEMENTS:
				setNombreElements(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_OBJECTIF_ASS__NUMERO_OCCURRENCE_DANS_PDF:
				setNumeroOccurrenceDansPDF(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_OBJECTIF_ASS__PRECISION_LOCALISATION:
				setPrecisionLocalisation((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_ASS__ETAT:
				setEtat((String)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_ASS__APOUR_LOCALISATION_LOCALISATION_OBJECTIF:
				setAPourLocalisationLocalisationObjectif((TypeLocalisationObjectif)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_ASS__APOUR_DEBUT_TRAITEMENT_ADEMANDE_DATATION:
				setAPourDebutTraitementADemandeDatation((TypeDatation)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_ASS__APOUR_FIN_TRAITEMENT_ADEMANDE_DATATION:
				setAPourFinTraitementADemandeDatation((TypeDatation)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_ASS__APOUR_HORAIRE_TRAITEMENT_AHORAIRE_DATATION:
				setAPourHoraireTraitementAHoraireDatation((TypeDatation)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_ASS__APOUR_TYPE_TYPE_OBJECTIF_ASS:
				getAPourTypeTypeObjectifASS().clear();
				getAPourTypeTypeObjectifASS().addAll((Collection<? extends TypeTypeObjectifASS>)newValue);
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
			case SchemaPackage.TYPE_OBJECTIF_ASS__DUREE_ENGAGEMENT:
				setDureeEngagement((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_OBJECTIF_ASS__ENVIRONNEMENT:
				unsetEnvironnement();
				return;
			case SchemaPackage.TYPE_OBJECTIF_ASS__AUTRE_ENVIRONNEMENT:
				setAutreEnvironnement(AUTRE_ENVIRONNEMENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_OBJECTIF_ASS__NOMBRE_ELEMENTS:
				unsetNombreElements();
				return;
			case SchemaPackage.TYPE_OBJECTIF_ASS__NUMERO_OCCURRENCE_DANS_PDF:
				unsetNumeroOccurrenceDansPDF();
				return;
			case SchemaPackage.TYPE_OBJECTIF_ASS__PRECISION_LOCALISATION:
				setPrecisionLocalisation((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_OBJECTIF_ASS__ETAT:
				setEtat(ETAT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_OBJECTIF_ASS__APOUR_LOCALISATION_LOCALISATION_OBJECTIF:
				setAPourLocalisationLocalisationObjectif((TypeLocalisationObjectif)null);
				return;
			case SchemaPackage.TYPE_OBJECTIF_ASS__APOUR_DEBUT_TRAITEMENT_ADEMANDE_DATATION:
				setAPourDebutTraitementADemandeDatation((TypeDatation)null);
				return;
			case SchemaPackage.TYPE_OBJECTIF_ASS__APOUR_FIN_TRAITEMENT_ADEMANDE_DATATION:
				setAPourFinTraitementADemandeDatation((TypeDatation)null);
				return;
			case SchemaPackage.TYPE_OBJECTIF_ASS__APOUR_HORAIRE_TRAITEMENT_AHORAIRE_DATATION:
				setAPourHoraireTraitementAHoraireDatation((TypeDatation)null);
				return;
			case SchemaPackage.TYPE_OBJECTIF_ASS__APOUR_TYPE_TYPE_OBJECTIF_ASS:
				getAPourTypeTypeObjectifASS().clear();
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
			case SchemaPackage.TYPE_OBJECTIF_ASS__DUREE_ENGAGEMENT:
				return dureeEngagement != null;
			case SchemaPackage.TYPE_OBJECTIF_ASS__ENVIRONNEMENT:
				return isSetEnvironnement();
			case SchemaPackage.TYPE_OBJECTIF_ASS__AUTRE_ENVIRONNEMENT:
				return AUTRE_ENVIRONNEMENT_EDEFAULT == null ? autreEnvironnement != null : !AUTRE_ENVIRONNEMENT_EDEFAULT.equals(autreEnvironnement);
			case SchemaPackage.TYPE_OBJECTIF_ASS__NOMBRE_ELEMENTS:
				return isSetNombreElements();
			case SchemaPackage.TYPE_OBJECTIF_ASS__NUMERO_OCCURRENCE_DANS_PDF:
				return isSetNumeroOccurrenceDansPDF();
			case SchemaPackage.TYPE_OBJECTIF_ASS__PRECISION_LOCALISATION:
				return precisionLocalisation != null;
			case SchemaPackage.TYPE_OBJECTIF_ASS__ETAT:
				return ETAT_EDEFAULT == null ? etat != null : !ETAT_EDEFAULT.equals(etat);
			case SchemaPackage.TYPE_OBJECTIF_ASS__APOUR_LOCALISATION_LOCALISATION_OBJECTIF:
				return aPourLocalisationLocalisationObjectif != null;
			case SchemaPackage.TYPE_OBJECTIF_ASS__APOUR_DEBUT_TRAITEMENT_ADEMANDE_DATATION:
				return aPourDebutTraitementADemandeDatation != null;
			case SchemaPackage.TYPE_OBJECTIF_ASS__APOUR_FIN_TRAITEMENT_ADEMANDE_DATATION:
				return aPourFinTraitementADemandeDatation != null;
			case SchemaPackage.TYPE_OBJECTIF_ASS__APOUR_HORAIRE_TRAITEMENT_AHORAIRE_DATATION:
				return aPourHoraireTraitementAHoraireDatation != null;
			case SchemaPackage.TYPE_OBJECTIF_ASS__APOUR_TYPE_TYPE_OBJECTIF_ASS:
				return aPourTypeTypeObjectifASS != null && !aPourTypeTypeObjectifASS.isEmpty();
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
		result.append(" (environnement: ");
		if (environnementESet) result.append(environnement); else result.append("<unset>");
		result.append(", autreEnvironnement: ");
		result.append(autreEnvironnement);
		result.append(", nombreElements: ");
		if (nombreElementsESet) result.append(nombreElements); else result.append("<unset>");
		result.append(", numeroOccurrenceDansPDF: ");
		if (numeroOccurrenceDansPDFESet) result.append(numeroOccurrenceDansPDF); else result.append("<unset>");
		result.append(", etat: ");
		result.append(etat);
		result.append(')');
		return result.toString();
	}

} //TypeObjectifASSImpl
