/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCRevaluationDegats;
import mpia.schema.TypeDictionaryDicoEffetConstateEffetConstate;
import mpia.schema.TypeQuantiteMaterielOuMoyen;

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
 * An implementation of the model object '<em><b>Type CRevaluation Degats</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCRevaluationDegatsImpl#getTypeEffetConstate <em>Type Effet Constate</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCRevaluationDegatsImpl#getPourcentageEstimeDesDommages <em>Pourcentage Estime Des Dommages</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCRevaluationDegatsImpl#getNombreEstimeDesVictimes <em>Nombre Estime Des Victimes</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCRevaluationDegatsImpl#getEffetSurEnvironnement <em>Effet Sur Environnement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCRevaluationDegatsImpl#getAPourLocalisationAutreElementControle <em>APour Localisation Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCRevaluationDegatsImpl#getAPourObjectifObjectifCiblage <em>APour Objectif Objectif Ciblage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCRevaluationDegatsImpl#getACommeMaterielOuMoyenEndommageQuantiteMaterielOuMoyen <em>AComme Materiel Ou Moyen Endommage Quantite Materiel Ou Moyen</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCRevaluationDegatsImpl#getACommeMaterielOuMoyenRestantQuantiteMaterielOuMoyen <em>AComme Materiel Ou Moyen Restant Quantite Materiel Ou Moyen</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCRevaluationDegatsImpl extends EObjectImpl implements TypeCRevaluationDegats {
	/**
	 * The default value of the '{@link #getTypeEffetConstate() <em>Type Effet Constate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeEffetConstate()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEffetConstateEffetConstate TYPE_EFFET_CONSTATE_EDEFAULT = TypeDictionaryDicoEffetConstateEffetConstate._1;

	/**
	 * The cached value of the '{@link #getTypeEffetConstate() <em>Type Effet Constate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeEffetConstate()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEffetConstateEffetConstate typeEffetConstate = TYPE_EFFET_CONSTATE_EDEFAULT;

	/**
	 * This is true if the Type Effet Constate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeEffetConstateESet;

	/**
	 * The default value of the '{@link #getPourcentageEstimeDesDommages() <em>Pourcentage Estime Des Dommages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPourcentageEstimeDesDommages()
	 * @generated
	 * @ordered
	 */
	protected static final double POURCENTAGE_ESTIME_DES_DOMMAGES_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPourcentageEstimeDesDommages() <em>Pourcentage Estime Des Dommages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPourcentageEstimeDesDommages()
	 * @generated
	 * @ordered
	 */
	protected double pourcentageEstimeDesDommages = POURCENTAGE_ESTIME_DES_DOMMAGES_EDEFAULT;

	/**
	 * This is true if the Pourcentage Estime Des Dommages attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pourcentageEstimeDesDommagesESet;

	/**
	 * The default value of the '{@link #getNombreEstimeDesVictimes() <em>Nombre Estime Des Victimes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreEstimeDesVictimes()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_ESTIME_DES_VICTIMES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreEstimeDesVictimes() <em>Nombre Estime Des Victimes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreEstimeDesVictimes()
	 * @generated
	 * @ordered
	 */
	protected long nombreEstimeDesVictimes = NOMBRE_ESTIME_DES_VICTIMES_EDEFAULT;

	/**
	 * This is true if the Nombre Estime Des Victimes attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreEstimeDesVictimesESet;

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
	 * The cached value of the '{@link #getAPourLocalisationAutreElementControle() <em>APour Localisation Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourLocalisationAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourLocalisationAutreElementControle;

	/**
	 * The cached value of the '{@link #getAPourObjectifObjectifCiblage() <em>APour Objectif Objectif Ciblage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourObjectifObjectifCiblage()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourObjectifObjectifCiblage;

	/**
	 * The cached value of the '{@link #getACommeMaterielOuMoyenEndommageQuantiteMaterielOuMoyen() <em>AComme Materiel Ou Moyen Endommage Quantite Materiel Ou Moyen</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeMaterielOuMoyenEndommageQuantiteMaterielOuMoyen()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeQuantiteMaterielOuMoyen> aCommeMaterielOuMoyenEndommageQuantiteMaterielOuMoyen;

	/**
	 * The cached value of the '{@link #getACommeMaterielOuMoyenRestantQuantiteMaterielOuMoyen() <em>AComme Materiel Ou Moyen Restant Quantite Materiel Ou Moyen</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeMaterielOuMoyenRestantQuantiteMaterielOuMoyen()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeQuantiteMaterielOuMoyen> aCommeMaterielOuMoyenRestantQuantiteMaterielOuMoyen;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCRevaluationDegatsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCRevaluationDegats();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEffetConstateEffetConstate getTypeEffetConstate() {
		return typeEffetConstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeEffetConstate(TypeDictionaryDicoEffetConstateEffetConstate newTypeEffetConstate) {
		TypeDictionaryDicoEffetConstateEffetConstate oldTypeEffetConstate = typeEffetConstate;
		typeEffetConstate = newTypeEffetConstate == null ? TYPE_EFFET_CONSTATE_EDEFAULT : newTypeEffetConstate;
		boolean oldTypeEffetConstateESet = typeEffetConstateESet;
		typeEffetConstateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CREVALUATION_DEGATS__TYPE_EFFET_CONSTATE, oldTypeEffetConstate, typeEffetConstate, !oldTypeEffetConstateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeEffetConstate() {
		TypeDictionaryDicoEffetConstateEffetConstate oldTypeEffetConstate = typeEffetConstate;
		boolean oldTypeEffetConstateESet = typeEffetConstateESet;
		typeEffetConstate = TYPE_EFFET_CONSTATE_EDEFAULT;
		typeEffetConstateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CREVALUATION_DEGATS__TYPE_EFFET_CONSTATE, oldTypeEffetConstate, TYPE_EFFET_CONSTATE_EDEFAULT, oldTypeEffetConstateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeEffetConstate() {
		return typeEffetConstateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPourcentageEstimeDesDommages() {
		return pourcentageEstimeDesDommages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPourcentageEstimeDesDommages(double newPourcentageEstimeDesDommages) {
		double oldPourcentageEstimeDesDommages = pourcentageEstimeDesDommages;
		pourcentageEstimeDesDommages = newPourcentageEstimeDesDommages;
		boolean oldPourcentageEstimeDesDommagesESet = pourcentageEstimeDesDommagesESet;
		pourcentageEstimeDesDommagesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CREVALUATION_DEGATS__POURCENTAGE_ESTIME_DES_DOMMAGES, oldPourcentageEstimeDesDommages, pourcentageEstimeDesDommages, !oldPourcentageEstimeDesDommagesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPourcentageEstimeDesDommages() {
		double oldPourcentageEstimeDesDommages = pourcentageEstimeDesDommages;
		boolean oldPourcentageEstimeDesDommagesESet = pourcentageEstimeDesDommagesESet;
		pourcentageEstimeDesDommages = POURCENTAGE_ESTIME_DES_DOMMAGES_EDEFAULT;
		pourcentageEstimeDesDommagesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CREVALUATION_DEGATS__POURCENTAGE_ESTIME_DES_DOMMAGES, oldPourcentageEstimeDesDommages, POURCENTAGE_ESTIME_DES_DOMMAGES_EDEFAULT, oldPourcentageEstimeDesDommagesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPourcentageEstimeDesDommages() {
		return pourcentageEstimeDesDommagesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreEstimeDesVictimes() {
		return nombreEstimeDesVictimes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreEstimeDesVictimes(long newNombreEstimeDesVictimes) {
		long oldNombreEstimeDesVictimes = nombreEstimeDesVictimes;
		nombreEstimeDesVictimes = newNombreEstimeDesVictimes;
		boolean oldNombreEstimeDesVictimesESet = nombreEstimeDesVictimesESet;
		nombreEstimeDesVictimesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CREVALUATION_DEGATS__NOMBRE_ESTIME_DES_VICTIMES, oldNombreEstimeDesVictimes, nombreEstimeDesVictimes, !oldNombreEstimeDesVictimesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreEstimeDesVictimes() {
		long oldNombreEstimeDesVictimes = nombreEstimeDesVictimes;
		boolean oldNombreEstimeDesVictimesESet = nombreEstimeDesVictimesESet;
		nombreEstimeDesVictimes = NOMBRE_ESTIME_DES_VICTIMES_EDEFAULT;
		nombreEstimeDesVictimesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CREVALUATION_DEGATS__NOMBRE_ESTIME_DES_VICTIMES, oldNombreEstimeDesVictimes, NOMBRE_ESTIME_DES_VICTIMES_EDEFAULT, oldNombreEstimeDesVictimesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreEstimeDesVictimes() {
		return nombreEstimeDesVictimesESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CREVALUATION_DEGATS__EFFET_SUR_ENVIRONNEMENT, oldEffetSurEnvironnement, effetSurEnvironnement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourLocalisationAutreElementControle() {
		return aPourLocalisationAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourLocalisationAutreElementControle(TypeAssociation newAPourLocalisationAutreElementControle, NotificationChain msgs) {
		TypeAssociation oldAPourLocalisationAutreElementControle = aPourLocalisationAutreElementControle;
		aPourLocalisationAutreElementControle = newAPourLocalisationAutreElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CREVALUATION_DEGATS__APOUR_LOCALISATION_AUTRE_ELEMENT_CONTROLE, oldAPourLocalisationAutreElementControle, newAPourLocalisationAutreElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourLocalisationAutreElementControle(TypeAssociation newAPourLocalisationAutreElementControle) {
		if (newAPourLocalisationAutreElementControle != aPourLocalisationAutreElementControle) {
			NotificationChain msgs = null;
			if (aPourLocalisationAutreElementControle != null)
				msgs = ((InternalEObject)aPourLocalisationAutreElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CREVALUATION_DEGATS__APOUR_LOCALISATION_AUTRE_ELEMENT_CONTROLE, null, msgs);
			if (newAPourLocalisationAutreElementControle != null)
				msgs = ((InternalEObject)newAPourLocalisationAutreElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CREVALUATION_DEGATS__APOUR_LOCALISATION_AUTRE_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetAPourLocalisationAutreElementControle(newAPourLocalisationAutreElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CREVALUATION_DEGATS__APOUR_LOCALISATION_AUTRE_ELEMENT_CONTROLE, newAPourLocalisationAutreElementControle, newAPourLocalisationAutreElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourObjectifObjectifCiblage() {
		return aPourObjectifObjectifCiblage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourObjectifObjectifCiblage(TypeAssociation newAPourObjectifObjectifCiblage, NotificationChain msgs) {
		TypeAssociation oldAPourObjectifObjectifCiblage = aPourObjectifObjectifCiblage;
		aPourObjectifObjectifCiblage = newAPourObjectifObjectifCiblage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CREVALUATION_DEGATS__APOUR_OBJECTIF_OBJECTIF_CIBLAGE, oldAPourObjectifObjectifCiblage, newAPourObjectifObjectifCiblage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourObjectifObjectifCiblage(TypeAssociation newAPourObjectifObjectifCiblage) {
		if (newAPourObjectifObjectifCiblage != aPourObjectifObjectifCiblage) {
			NotificationChain msgs = null;
			if (aPourObjectifObjectifCiblage != null)
				msgs = ((InternalEObject)aPourObjectifObjectifCiblage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CREVALUATION_DEGATS__APOUR_OBJECTIF_OBJECTIF_CIBLAGE, null, msgs);
			if (newAPourObjectifObjectifCiblage != null)
				msgs = ((InternalEObject)newAPourObjectifObjectifCiblage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CREVALUATION_DEGATS__APOUR_OBJECTIF_OBJECTIF_CIBLAGE, null, msgs);
			msgs = basicSetAPourObjectifObjectifCiblage(newAPourObjectifObjectifCiblage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CREVALUATION_DEGATS__APOUR_OBJECTIF_OBJECTIF_CIBLAGE, newAPourObjectifObjectifCiblage, newAPourObjectifObjectifCiblage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeQuantiteMaterielOuMoyen> getACommeMaterielOuMoyenEndommageQuantiteMaterielOuMoyen() {
		if (aCommeMaterielOuMoyenEndommageQuantiteMaterielOuMoyen == null) {
			aCommeMaterielOuMoyenEndommageQuantiteMaterielOuMoyen = new EObjectContainmentEList<TypeQuantiteMaterielOuMoyen>(TypeQuantiteMaterielOuMoyen.class, this, SchemaPackage.TYPE_CREVALUATION_DEGATS__ACOMME_MATERIEL_OU_MOYEN_ENDOMMAGE_QUANTITE_MATERIEL_OU_MOYEN);
		}
		return aCommeMaterielOuMoyenEndommageQuantiteMaterielOuMoyen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeQuantiteMaterielOuMoyen> getACommeMaterielOuMoyenRestantQuantiteMaterielOuMoyen() {
		if (aCommeMaterielOuMoyenRestantQuantiteMaterielOuMoyen == null) {
			aCommeMaterielOuMoyenRestantQuantiteMaterielOuMoyen = new EObjectContainmentEList<TypeQuantiteMaterielOuMoyen>(TypeQuantiteMaterielOuMoyen.class, this, SchemaPackage.TYPE_CREVALUATION_DEGATS__ACOMME_MATERIEL_OU_MOYEN_RESTANT_QUANTITE_MATERIEL_OU_MOYEN);
		}
		return aCommeMaterielOuMoyenRestantQuantiteMaterielOuMoyen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_CREVALUATION_DEGATS__APOUR_LOCALISATION_AUTRE_ELEMENT_CONTROLE:
				return basicSetAPourLocalisationAutreElementControle(null, msgs);
			case SchemaPackage.TYPE_CREVALUATION_DEGATS__APOUR_OBJECTIF_OBJECTIF_CIBLAGE:
				return basicSetAPourObjectifObjectifCiblage(null, msgs);
			case SchemaPackage.TYPE_CREVALUATION_DEGATS__ACOMME_MATERIEL_OU_MOYEN_ENDOMMAGE_QUANTITE_MATERIEL_OU_MOYEN:
				return ((InternalEList<?>)getACommeMaterielOuMoyenEndommageQuantiteMaterielOuMoyen()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_CREVALUATION_DEGATS__ACOMME_MATERIEL_OU_MOYEN_RESTANT_QUANTITE_MATERIEL_OU_MOYEN:
				return ((InternalEList<?>)getACommeMaterielOuMoyenRestantQuantiteMaterielOuMoyen()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_CREVALUATION_DEGATS__TYPE_EFFET_CONSTATE:
				return getTypeEffetConstate();
			case SchemaPackage.TYPE_CREVALUATION_DEGATS__POURCENTAGE_ESTIME_DES_DOMMAGES:
				return new Double(getPourcentageEstimeDesDommages());
			case SchemaPackage.TYPE_CREVALUATION_DEGATS__NOMBRE_ESTIME_DES_VICTIMES:
				return new Long(getNombreEstimeDesVictimes());
			case SchemaPackage.TYPE_CREVALUATION_DEGATS__EFFET_SUR_ENVIRONNEMENT:
				return getEffetSurEnvironnement();
			case SchemaPackage.TYPE_CREVALUATION_DEGATS__APOUR_LOCALISATION_AUTRE_ELEMENT_CONTROLE:
				return getAPourLocalisationAutreElementControle();
			case SchemaPackage.TYPE_CREVALUATION_DEGATS__APOUR_OBJECTIF_OBJECTIF_CIBLAGE:
				return getAPourObjectifObjectifCiblage();
			case SchemaPackage.TYPE_CREVALUATION_DEGATS__ACOMME_MATERIEL_OU_MOYEN_ENDOMMAGE_QUANTITE_MATERIEL_OU_MOYEN:
				return getACommeMaterielOuMoyenEndommageQuantiteMaterielOuMoyen();
			case SchemaPackage.TYPE_CREVALUATION_DEGATS__ACOMME_MATERIEL_OU_MOYEN_RESTANT_QUANTITE_MATERIEL_OU_MOYEN:
				return getACommeMaterielOuMoyenRestantQuantiteMaterielOuMoyen();
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
			case SchemaPackage.TYPE_CREVALUATION_DEGATS__TYPE_EFFET_CONSTATE:
				setTypeEffetConstate((TypeDictionaryDicoEffetConstateEffetConstate)newValue);
				return;
			case SchemaPackage.TYPE_CREVALUATION_DEGATS__POURCENTAGE_ESTIME_DES_DOMMAGES:
				setPourcentageEstimeDesDommages(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_CREVALUATION_DEGATS__NOMBRE_ESTIME_DES_VICTIMES:
				setNombreEstimeDesVictimes(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CREVALUATION_DEGATS__EFFET_SUR_ENVIRONNEMENT:
				setEffetSurEnvironnement((String)newValue);
				return;
			case SchemaPackage.TYPE_CREVALUATION_DEGATS__APOUR_LOCALISATION_AUTRE_ELEMENT_CONTROLE:
				setAPourLocalisationAutreElementControle((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_CREVALUATION_DEGATS__APOUR_OBJECTIF_OBJECTIF_CIBLAGE:
				setAPourObjectifObjectifCiblage((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_CREVALUATION_DEGATS__ACOMME_MATERIEL_OU_MOYEN_ENDOMMAGE_QUANTITE_MATERIEL_OU_MOYEN:
				getACommeMaterielOuMoyenEndommageQuantiteMaterielOuMoyen().clear();
				getACommeMaterielOuMoyenEndommageQuantiteMaterielOuMoyen().addAll((Collection<? extends TypeQuantiteMaterielOuMoyen>)newValue);
				return;
			case SchemaPackage.TYPE_CREVALUATION_DEGATS__ACOMME_MATERIEL_OU_MOYEN_RESTANT_QUANTITE_MATERIEL_OU_MOYEN:
				getACommeMaterielOuMoyenRestantQuantiteMaterielOuMoyen().clear();
				getACommeMaterielOuMoyenRestantQuantiteMaterielOuMoyen().addAll((Collection<? extends TypeQuantiteMaterielOuMoyen>)newValue);
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
			case SchemaPackage.TYPE_CREVALUATION_DEGATS__TYPE_EFFET_CONSTATE:
				unsetTypeEffetConstate();
				return;
			case SchemaPackage.TYPE_CREVALUATION_DEGATS__POURCENTAGE_ESTIME_DES_DOMMAGES:
				unsetPourcentageEstimeDesDommages();
				return;
			case SchemaPackage.TYPE_CREVALUATION_DEGATS__NOMBRE_ESTIME_DES_VICTIMES:
				unsetNombreEstimeDesVictimes();
				return;
			case SchemaPackage.TYPE_CREVALUATION_DEGATS__EFFET_SUR_ENVIRONNEMENT:
				setEffetSurEnvironnement(EFFET_SUR_ENVIRONNEMENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CREVALUATION_DEGATS__APOUR_LOCALISATION_AUTRE_ELEMENT_CONTROLE:
				setAPourLocalisationAutreElementControle((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_CREVALUATION_DEGATS__APOUR_OBJECTIF_OBJECTIF_CIBLAGE:
				setAPourObjectifObjectifCiblage((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_CREVALUATION_DEGATS__ACOMME_MATERIEL_OU_MOYEN_ENDOMMAGE_QUANTITE_MATERIEL_OU_MOYEN:
				getACommeMaterielOuMoyenEndommageQuantiteMaterielOuMoyen().clear();
				return;
			case SchemaPackage.TYPE_CREVALUATION_DEGATS__ACOMME_MATERIEL_OU_MOYEN_RESTANT_QUANTITE_MATERIEL_OU_MOYEN:
				getACommeMaterielOuMoyenRestantQuantiteMaterielOuMoyen().clear();
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
			case SchemaPackage.TYPE_CREVALUATION_DEGATS__TYPE_EFFET_CONSTATE:
				return isSetTypeEffetConstate();
			case SchemaPackage.TYPE_CREVALUATION_DEGATS__POURCENTAGE_ESTIME_DES_DOMMAGES:
				return isSetPourcentageEstimeDesDommages();
			case SchemaPackage.TYPE_CREVALUATION_DEGATS__NOMBRE_ESTIME_DES_VICTIMES:
				return isSetNombreEstimeDesVictimes();
			case SchemaPackage.TYPE_CREVALUATION_DEGATS__EFFET_SUR_ENVIRONNEMENT:
				return EFFET_SUR_ENVIRONNEMENT_EDEFAULT == null ? effetSurEnvironnement != null : !EFFET_SUR_ENVIRONNEMENT_EDEFAULT.equals(effetSurEnvironnement);
			case SchemaPackage.TYPE_CREVALUATION_DEGATS__APOUR_LOCALISATION_AUTRE_ELEMENT_CONTROLE:
				return aPourLocalisationAutreElementControle != null;
			case SchemaPackage.TYPE_CREVALUATION_DEGATS__APOUR_OBJECTIF_OBJECTIF_CIBLAGE:
				return aPourObjectifObjectifCiblage != null;
			case SchemaPackage.TYPE_CREVALUATION_DEGATS__ACOMME_MATERIEL_OU_MOYEN_ENDOMMAGE_QUANTITE_MATERIEL_OU_MOYEN:
				return aCommeMaterielOuMoyenEndommageQuantiteMaterielOuMoyen != null && !aCommeMaterielOuMoyenEndommageQuantiteMaterielOuMoyen.isEmpty();
			case SchemaPackage.TYPE_CREVALUATION_DEGATS__ACOMME_MATERIEL_OU_MOYEN_RESTANT_QUANTITE_MATERIEL_OU_MOYEN:
				return aCommeMaterielOuMoyenRestantQuantiteMaterielOuMoyen != null && !aCommeMaterielOuMoyenRestantQuantiteMaterielOuMoyen.isEmpty();
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
		result.append(" (typeEffetConstate: ");
		if (typeEffetConstateESet) result.append(typeEffetConstate); else result.append("<unset>");
		result.append(", pourcentageEstimeDesDommages: ");
		if (pourcentageEstimeDesDommagesESet) result.append(pourcentageEstimeDesDommages); else result.append("<unset>");
		result.append(", nombreEstimeDesVictimes: ");
		if (nombreEstimeDesVictimesESet) result.append(nombreEstimeDesVictimes); else result.append("<unset>");
		result.append(", effetSurEnvironnement: ");
		result.append(effetSurEnvironnement);
		result.append(')');
		return result.toString();
	}

} //TypeCRevaluationDegatsImpl
