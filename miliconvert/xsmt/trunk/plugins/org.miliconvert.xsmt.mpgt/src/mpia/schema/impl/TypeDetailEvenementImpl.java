/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDetailEvenement;
import mpia.schema.TypeDictionaryDicoDetailEvenementClassificationSujet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Detail Evenement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeDetailEvenementImpl#getClassificationSujet <em>Classification Sujet</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDetailEvenementImpl#isCrime <em>Crime</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDetailEvenementImpl#getDescriptionDetaillee <em>Description Detaillee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDetailEvenementImpl#getRisquesMesures <em>Risques Mesures</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDetailEvenementImpl#getConsequencesEvenement <em>Consequences Evenement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDetailEvenementImpl#getDispositionsPrises <em>Dispositions Prises</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDetailEvenementImpl#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDetailEvenementImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDetailEvenementImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDetailEvenementImpl#getEstRapporteParRapport <em>Est Rapporte Par Rapport</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeDetailEvenementImpl extends EObjectImpl implements TypeDetailEvenement {
	/**
	 * The default value of the '{@link #getClassificationSujet() <em>Classification Sujet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationSujet()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoDetailEvenementClassificationSujet CLASSIFICATION_SUJET_EDEFAULT = TypeDictionaryDicoDetailEvenementClassificationSujet.ECONMC;

	/**
	 * The cached value of the '{@link #getClassificationSujet() <em>Classification Sujet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationSujet()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoDetailEvenementClassificationSujet classificationSujet = CLASSIFICATION_SUJET_EDEFAULT;

	/**
	 * This is true if the Classification Sujet attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean classificationSujetESet;

	/**
	 * The default value of the '{@link #isCrime() <em>Crime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCrime()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CRIME_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCrime() <em>Crime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCrime()
	 * @generated
	 * @ordered
	 */
	protected boolean crime = CRIME_EDEFAULT;

	/**
	 * This is true if the Crime attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean crimeESet;

	/**
	 * The default value of the '{@link #getDescriptionDetaillee() <em>Description Detaillee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionDetaillee()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_DETAILLEE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescriptionDetaillee() <em>Description Detaillee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionDetaillee()
	 * @generated
	 * @ordered
	 */
	protected String descriptionDetaillee = DESCRIPTION_DETAILLEE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRisquesMesures() <em>Risques Mesures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRisquesMesures()
	 * @generated
	 * @ordered
	 */
	protected static final String RISQUES_MESURES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRisquesMesures() <em>Risques Mesures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRisquesMesures()
	 * @generated
	 * @ordered
	 */
	protected String risquesMesures = RISQUES_MESURES_EDEFAULT;

	/**
	 * The default value of the '{@link #getConsequencesEvenement() <em>Consequences Evenement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsequencesEvenement()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSEQUENCES_EVENEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsequencesEvenement() <em>Consequences Evenement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsequencesEvenement()
	 * @generated
	 * @ordered
	 */
	protected String consequencesEvenement = CONSEQUENCES_EVENEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDispositionsPrises() <em>Dispositions Prises</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispositionsPrises()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPOSITIONS_PRISES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDispositionsPrises() <em>Dispositions Prises</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispositionsPrises()
	 * @generated
	 * @ordered
	 */
	protected String dispositionsPrises = DISPOSITIONS_PRISES_EDEFAULT;

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
	 * The cached value of the '{@link #getEstRapporteParRapport() <em>Est Rapporte Par Rapport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstRapporteParRapport()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation estRapporteParRapport;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDetailEvenementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeDetailEvenement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoDetailEvenementClassificationSujet getClassificationSujet() {
		return classificationSujet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassificationSujet(TypeDictionaryDicoDetailEvenementClassificationSujet newClassificationSujet) {
		TypeDictionaryDicoDetailEvenementClassificationSujet oldClassificationSujet = classificationSujet;
		classificationSujet = newClassificationSujet == null ? CLASSIFICATION_SUJET_EDEFAULT : newClassificationSujet;
		boolean oldClassificationSujetESet = classificationSujetESet;
		classificationSujetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DETAIL_EVENEMENT__CLASSIFICATION_SUJET, oldClassificationSujet, classificationSujet, !oldClassificationSujetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClassificationSujet() {
		TypeDictionaryDicoDetailEvenementClassificationSujet oldClassificationSujet = classificationSujet;
		boolean oldClassificationSujetESet = classificationSujetESet;
		classificationSujet = CLASSIFICATION_SUJET_EDEFAULT;
		classificationSujetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DETAIL_EVENEMENT__CLASSIFICATION_SUJET, oldClassificationSujet, CLASSIFICATION_SUJET_EDEFAULT, oldClassificationSujetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClassificationSujet() {
		return classificationSujetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCrime() {
		return crime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrime(boolean newCrime) {
		boolean oldCrime = crime;
		crime = newCrime;
		boolean oldCrimeESet = crimeESet;
		crimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DETAIL_EVENEMENT__CRIME, oldCrime, crime, !oldCrimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCrime() {
		boolean oldCrime = crime;
		boolean oldCrimeESet = crimeESet;
		crime = CRIME_EDEFAULT;
		crimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DETAIL_EVENEMENT__CRIME, oldCrime, CRIME_EDEFAULT, oldCrimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCrime() {
		return crimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescriptionDetaillee() {
		return descriptionDetaillee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptionDetaillee(String newDescriptionDetaillee) {
		String oldDescriptionDetaillee = descriptionDetaillee;
		descriptionDetaillee = newDescriptionDetaillee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DETAIL_EVENEMENT__DESCRIPTION_DETAILLEE, oldDescriptionDetaillee, descriptionDetaillee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRisquesMesures() {
		return risquesMesures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRisquesMesures(String newRisquesMesures) {
		String oldRisquesMesures = risquesMesures;
		risquesMesures = newRisquesMesures;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DETAIL_EVENEMENT__RISQUES_MESURES, oldRisquesMesures, risquesMesures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConsequencesEvenement() {
		return consequencesEvenement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsequencesEvenement(String newConsequencesEvenement) {
		String oldConsequencesEvenement = consequencesEvenement;
		consequencesEvenement = newConsequencesEvenement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DETAIL_EVENEMENT__CONSEQUENCES_EVENEMENT, oldConsequencesEvenement, consequencesEvenement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDispositionsPrises() {
		return dispositionsPrises;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDispositionsPrises(String newDispositionsPrises) {
		String oldDispositionsPrises = dispositionsPrises;
		dispositionsPrises = newDispositionsPrises;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DETAIL_EVENEMENT__DISPOSITIONS_PRISES, oldDispositionsPrises, dispositionsPrises));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DETAIL_EVENEMENT__COMMENTAIRE, oldCommentaire, commentaire));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DETAIL_EVENEMENT__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DETAIL_EVENEMENT__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getEstRapporteParRapport() {
		return estRapporteParRapport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstRapporteParRapport(TypeAssociation newEstRapporteParRapport, NotificationChain msgs) {
		TypeAssociation oldEstRapporteParRapport = estRapporteParRapport;
		estRapporteParRapport = newEstRapporteParRapport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DETAIL_EVENEMENT__EST_RAPPORTE_PAR_RAPPORT, oldEstRapporteParRapport, newEstRapporteParRapport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstRapporteParRapport(TypeAssociation newEstRapporteParRapport) {
		if (newEstRapporteParRapport != estRapporteParRapport) {
			NotificationChain msgs = null;
			if (estRapporteParRapport != null)
				msgs = ((InternalEObject)estRapporteParRapport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DETAIL_EVENEMENT__EST_RAPPORTE_PAR_RAPPORT, null, msgs);
			if (newEstRapporteParRapport != null)
				msgs = ((InternalEObject)newEstRapporteParRapport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DETAIL_EVENEMENT__EST_RAPPORTE_PAR_RAPPORT, null, msgs);
			msgs = basicSetEstRapporteParRapport(newEstRapporteParRapport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DETAIL_EVENEMENT__EST_RAPPORTE_PAR_RAPPORT, newEstRapporteParRapport, newEstRapporteParRapport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_DETAIL_EVENEMENT__EST_RAPPORTE_PAR_RAPPORT:
				return basicSetEstRapporteParRapport(null, msgs);
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
			case SchemaPackage.TYPE_DETAIL_EVENEMENT__CLASSIFICATION_SUJET:
				return getClassificationSujet();
			case SchemaPackage.TYPE_DETAIL_EVENEMENT__CRIME:
				return isCrime() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_DETAIL_EVENEMENT__DESCRIPTION_DETAILLEE:
				return getDescriptionDetaillee();
			case SchemaPackage.TYPE_DETAIL_EVENEMENT__RISQUES_MESURES:
				return getRisquesMesures();
			case SchemaPackage.TYPE_DETAIL_EVENEMENT__CONSEQUENCES_EVENEMENT:
				return getConsequencesEvenement();
			case SchemaPackage.TYPE_DETAIL_EVENEMENT__DISPOSITIONS_PRISES:
				return getDispositionsPrises();
			case SchemaPackage.TYPE_DETAIL_EVENEMENT__COMMENTAIRE:
				return getCommentaire();
			case SchemaPackage.TYPE_DETAIL_EVENEMENT__CTE:
				return getCTE();
			case SchemaPackage.TYPE_DETAIL_EVENEMENT__CE:
				return getCE();
			case SchemaPackage.TYPE_DETAIL_EVENEMENT__EST_RAPPORTE_PAR_RAPPORT:
				return getEstRapporteParRapport();
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
			case SchemaPackage.TYPE_DETAIL_EVENEMENT__CLASSIFICATION_SUJET:
				setClassificationSujet((TypeDictionaryDicoDetailEvenementClassificationSujet)newValue);
				return;
			case SchemaPackage.TYPE_DETAIL_EVENEMENT__CRIME:
				setCrime(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_DETAIL_EVENEMENT__DESCRIPTION_DETAILLEE:
				setDescriptionDetaillee((String)newValue);
				return;
			case SchemaPackage.TYPE_DETAIL_EVENEMENT__RISQUES_MESURES:
				setRisquesMesures((String)newValue);
				return;
			case SchemaPackage.TYPE_DETAIL_EVENEMENT__CONSEQUENCES_EVENEMENT:
				setConsequencesEvenement((String)newValue);
				return;
			case SchemaPackage.TYPE_DETAIL_EVENEMENT__DISPOSITIONS_PRISES:
				setDispositionsPrises((String)newValue);
				return;
			case SchemaPackage.TYPE_DETAIL_EVENEMENT__COMMENTAIRE:
				setCommentaire((String)newValue);
				return;
			case SchemaPackage.TYPE_DETAIL_EVENEMENT__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_DETAIL_EVENEMENT__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_DETAIL_EVENEMENT__EST_RAPPORTE_PAR_RAPPORT:
				setEstRapporteParRapport((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_DETAIL_EVENEMENT__CLASSIFICATION_SUJET:
				unsetClassificationSujet();
				return;
			case SchemaPackage.TYPE_DETAIL_EVENEMENT__CRIME:
				unsetCrime();
				return;
			case SchemaPackage.TYPE_DETAIL_EVENEMENT__DESCRIPTION_DETAILLEE:
				setDescriptionDetaillee(DESCRIPTION_DETAILLEE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DETAIL_EVENEMENT__RISQUES_MESURES:
				setRisquesMesures(RISQUES_MESURES_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DETAIL_EVENEMENT__CONSEQUENCES_EVENEMENT:
				setConsequencesEvenement(CONSEQUENCES_EVENEMENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DETAIL_EVENEMENT__DISPOSITIONS_PRISES:
				setDispositionsPrises(DISPOSITIONS_PRISES_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DETAIL_EVENEMENT__COMMENTAIRE:
				setCommentaire(COMMENTAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DETAIL_EVENEMENT__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DETAIL_EVENEMENT__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DETAIL_EVENEMENT__EST_RAPPORTE_PAR_RAPPORT:
				setEstRapporteParRapport((TypeAssociation)null);
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
			case SchemaPackage.TYPE_DETAIL_EVENEMENT__CLASSIFICATION_SUJET:
				return isSetClassificationSujet();
			case SchemaPackage.TYPE_DETAIL_EVENEMENT__CRIME:
				return isSetCrime();
			case SchemaPackage.TYPE_DETAIL_EVENEMENT__DESCRIPTION_DETAILLEE:
				return DESCRIPTION_DETAILLEE_EDEFAULT == null ? descriptionDetaillee != null : !DESCRIPTION_DETAILLEE_EDEFAULT.equals(descriptionDetaillee);
			case SchemaPackage.TYPE_DETAIL_EVENEMENT__RISQUES_MESURES:
				return RISQUES_MESURES_EDEFAULT == null ? risquesMesures != null : !RISQUES_MESURES_EDEFAULT.equals(risquesMesures);
			case SchemaPackage.TYPE_DETAIL_EVENEMENT__CONSEQUENCES_EVENEMENT:
				return CONSEQUENCES_EVENEMENT_EDEFAULT == null ? consequencesEvenement != null : !CONSEQUENCES_EVENEMENT_EDEFAULT.equals(consequencesEvenement);
			case SchemaPackage.TYPE_DETAIL_EVENEMENT__DISPOSITIONS_PRISES:
				return DISPOSITIONS_PRISES_EDEFAULT == null ? dispositionsPrises != null : !DISPOSITIONS_PRISES_EDEFAULT.equals(dispositionsPrises);
			case SchemaPackage.TYPE_DETAIL_EVENEMENT__COMMENTAIRE:
				return COMMENTAIRE_EDEFAULT == null ? commentaire != null : !COMMENTAIRE_EDEFAULT.equals(commentaire);
			case SchemaPackage.TYPE_DETAIL_EVENEMENT__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_DETAIL_EVENEMENT__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_DETAIL_EVENEMENT__EST_RAPPORTE_PAR_RAPPORT:
				return estRapporteParRapport != null;
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
		result.append(" (classificationSujet: ");
		if (classificationSujetESet) result.append(classificationSujet); else result.append("<unset>");
		result.append(", crime: ");
		if (crimeESet) result.append(crime); else result.append("<unset>");
		result.append(", descriptionDetaillee: ");
		result.append(descriptionDetaillee);
		result.append(", risquesMesures: ");
		result.append(risquesMesures);
		result.append(", consequencesEvenement: ");
		result.append(consequencesEvenement);
		result.append(", dispositionsPrises: ");
		result.append(dispositionsPrises);
		result.append(", commentaire: ");
		result.append(commentaire);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeDetailEvenementImpl
