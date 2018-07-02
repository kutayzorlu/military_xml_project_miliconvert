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

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDoseRadiationAbsorbe;
import mpia.schema.TypeSituationRadiation;

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
 * An implementation of the model object '<em><b>Type Situation Radiation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeSituationRadiationImpl#getDateMesure <em>Date Mesure</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSituationRadiationImpl#getNiveauDebitDose <em>Niveau Debit Dose</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSituationRadiationImpl#getNiveauRadiation <em>Niveau Radiation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSituationRadiationImpl#getNiveauRadiationCumule <em>Niveau Radiation Cumule</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSituationRadiationImpl#getEvolutionDebitDose <em>Evolution Debit Dose</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSituationRadiationImpl#getTauxRelatifDecroissance <em>Taux Relatif Decroissance</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSituationRadiationImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSituationRadiationImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSituationRadiationImpl#getConcerneMateriel <em>Concerne Materiel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSituationRadiationImpl#getDecritDoseRadiationAbsorbe <em>Decrit Dose Radiation Absorbe</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeSituationRadiationImpl extends EObjectImpl implements TypeSituationRadiation {
	/**
	 * The default value of the '{@link #getDateMesure() <em>Date Mesure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateMesure()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_MESURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateMesure() <em>Date Mesure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateMesure()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateMesure = DATE_MESURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNiveauDebitDose() <em>Niveau Debit Dose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauDebitDose()
	 * @generated
	 * @ordered
	 */
	protected static final double NIVEAU_DEBIT_DOSE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getNiveauDebitDose() <em>Niveau Debit Dose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauDebitDose()
	 * @generated
	 * @ordered
	 */
	protected double niveauDebitDose = NIVEAU_DEBIT_DOSE_EDEFAULT;

	/**
	 * This is true if the Niveau Debit Dose attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean niveauDebitDoseESet;

	/**
	 * The default value of the '{@link #getNiveauRadiation() <em>Niveau Radiation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauRadiation()
	 * @generated
	 * @ordered
	 */
	protected static final double NIVEAU_RADIATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getNiveauRadiation() <em>Niveau Radiation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauRadiation()
	 * @generated
	 * @ordered
	 */
	protected double niveauRadiation = NIVEAU_RADIATION_EDEFAULT;

	/**
	 * This is true if the Niveau Radiation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean niveauRadiationESet;

	/**
	 * The default value of the '{@link #getNiveauRadiationCumule() <em>Niveau Radiation Cumule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauRadiationCumule()
	 * @generated
	 * @ordered
	 */
	protected static final double NIVEAU_RADIATION_CUMULE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getNiveauRadiationCumule() <em>Niveau Radiation Cumule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauRadiationCumule()
	 * @generated
	 * @ordered
	 */
	protected double niveauRadiationCumule = NIVEAU_RADIATION_CUMULE_EDEFAULT;

	/**
	 * This is true if the Niveau Radiation Cumule attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean niveauRadiationCumuleESet;

	/**
	 * The default value of the '{@link #getEvolutionDebitDose() <em>Evolution Debit Dose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvolutionDebitDose()
	 * @generated
	 * @ordered
	 */
	protected static final double EVOLUTION_DEBIT_DOSE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEvolutionDebitDose() <em>Evolution Debit Dose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvolutionDebitDose()
	 * @generated
	 * @ordered
	 */
	protected double evolutionDebitDose = EVOLUTION_DEBIT_DOSE_EDEFAULT;

	/**
	 * This is true if the Evolution Debit Dose attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean evolutionDebitDoseESet;

	/**
	 * The default value of the '{@link #getTauxRelatifDecroissance() <em>Taux Relatif Decroissance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTauxRelatifDecroissance()
	 * @generated
	 * @ordered
	 */
	protected static final double TAUX_RELATIF_DECROISSANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTauxRelatifDecroissance() <em>Taux Relatif Decroissance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTauxRelatifDecroissance()
	 * @generated
	 * @ordered
	 */
	protected double tauxRelatifDecroissance = TAUX_RELATIF_DECROISSANCE_EDEFAULT;

	/**
	 * This is true if the Taux Relatif Decroissance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tauxRelatifDecroissanceESet;

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
	 * The cached value of the '{@link #getConcerneMateriel() <em>Concerne Materiel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneMateriel()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> concerneMateriel;

	/**
	 * The cached value of the '{@link #getDecritDoseRadiationAbsorbe() <em>Decrit Dose Radiation Absorbe</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecritDoseRadiationAbsorbe()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeDoseRadiationAbsorbe> decritDoseRadiationAbsorbe;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeSituationRadiationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeSituationRadiation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateMesure() {
		return dateMesure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateMesure(XMLGregorianCalendar newDateMesure) {
		XMLGregorianCalendar oldDateMesure = dateMesure;
		dateMesure = newDateMesure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITUATION_RADIATION__DATE_MESURE, oldDateMesure, dateMesure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNiveauDebitDose() {
		return niveauDebitDose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNiveauDebitDose(double newNiveauDebitDose) {
		double oldNiveauDebitDose = niveauDebitDose;
		niveauDebitDose = newNiveauDebitDose;
		boolean oldNiveauDebitDoseESet = niveauDebitDoseESet;
		niveauDebitDoseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITUATION_RADIATION__NIVEAU_DEBIT_DOSE, oldNiveauDebitDose, niveauDebitDose, !oldNiveauDebitDoseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNiveauDebitDose() {
		double oldNiveauDebitDose = niveauDebitDose;
		boolean oldNiveauDebitDoseESet = niveauDebitDoseESet;
		niveauDebitDose = NIVEAU_DEBIT_DOSE_EDEFAULT;
		niveauDebitDoseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SITUATION_RADIATION__NIVEAU_DEBIT_DOSE, oldNiveauDebitDose, NIVEAU_DEBIT_DOSE_EDEFAULT, oldNiveauDebitDoseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNiveauDebitDose() {
		return niveauDebitDoseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNiveauRadiation() {
		return niveauRadiation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNiveauRadiation(double newNiveauRadiation) {
		double oldNiveauRadiation = niveauRadiation;
		niveauRadiation = newNiveauRadiation;
		boolean oldNiveauRadiationESet = niveauRadiationESet;
		niveauRadiationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITUATION_RADIATION__NIVEAU_RADIATION, oldNiveauRadiation, niveauRadiation, !oldNiveauRadiationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNiveauRadiation() {
		double oldNiveauRadiation = niveauRadiation;
		boolean oldNiveauRadiationESet = niveauRadiationESet;
		niveauRadiation = NIVEAU_RADIATION_EDEFAULT;
		niveauRadiationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SITUATION_RADIATION__NIVEAU_RADIATION, oldNiveauRadiation, NIVEAU_RADIATION_EDEFAULT, oldNiveauRadiationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNiveauRadiation() {
		return niveauRadiationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNiveauRadiationCumule() {
		return niveauRadiationCumule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNiveauRadiationCumule(double newNiveauRadiationCumule) {
		double oldNiveauRadiationCumule = niveauRadiationCumule;
		niveauRadiationCumule = newNiveauRadiationCumule;
		boolean oldNiveauRadiationCumuleESet = niveauRadiationCumuleESet;
		niveauRadiationCumuleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITUATION_RADIATION__NIVEAU_RADIATION_CUMULE, oldNiveauRadiationCumule, niveauRadiationCumule, !oldNiveauRadiationCumuleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNiveauRadiationCumule() {
		double oldNiveauRadiationCumule = niveauRadiationCumule;
		boolean oldNiveauRadiationCumuleESet = niveauRadiationCumuleESet;
		niveauRadiationCumule = NIVEAU_RADIATION_CUMULE_EDEFAULT;
		niveauRadiationCumuleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SITUATION_RADIATION__NIVEAU_RADIATION_CUMULE, oldNiveauRadiationCumule, NIVEAU_RADIATION_CUMULE_EDEFAULT, oldNiveauRadiationCumuleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNiveauRadiationCumule() {
		return niveauRadiationCumuleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEvolutionDebitDose() {
		return evolutionDebitDose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvolutionDebitDose(double newEvolutionDebitDose) {
		double oldEvolutionDebitDose = evolutionDebitDose;
		evolutionDebitDose = newEvolutionDebitDose;
		boolean oldEvolutionDebitDoseESet = evolutionDebitDoseESet;
		evolutionDebitDoseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITUATION_RADIATION__EVOLUTION_DEBIT_DOSE, oldEvolutionDebitDose, evolutionDebitDose, !oldEvolutionDebitDoseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEvolutionDebitDose() {
		double oldEvolutionDebitDose = evolutionDebitDose;
		boolean oldEvolutionDebitDoseESet = evolutionDebitDoseESet;
		evolutionDebitDose = EVOLUTION_DEBIT_DOSE_EDEFAULT;
		evolutionDebitDoseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SITUATION_RADIATION__EVOLUTION_DEBIT_DOSE, oldEvolutionDebitDose, EVOLUTION_DEBIT_DOSE_EDEFAULT, oldEvolutionDebitDoseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEvolutionDebitDose() {
		return evolutionDebitDoseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTauxRelatifDecroissance() {
		return tauxRelatifDecroissance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTauxRelatifDecroissance(double newTauxRelatifDecroissance) {
		double oldTauxRelatifDecroissance = tauxRelatifDecroissance;
		tauxRelatifDecroissance = newTauxRelatifDecroissance;
		boolean oldTauxRelatifDecroissanceESet = tauxRelatifDecroissanceESet;
		tauxRelatifDecroissanceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITUATION_RADIATION__TAUX_RELATIF_DECROISSANCE, oldTauxRelatifDecroissance, tauxRelatifDecroissance, !oldTauxRelatifDecroissanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTauxRelatifDecroissance() {
		double oldTauxRelatifDecroissance = tauxRelatifDecroissance;
		boolean oldTauxRelatifDecroissanceESet = tauxRelatifDecroissanceESet;
		tauxRelatifDecroissance = TAUX_RELATIF_DECROISSANCE_EDEFAULT;
		tauxRelatifDecroissanceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SITUATION_RADIATION__TAUX_RELATIF_DECROISSANCE, oldTauxRelatifDecroissance, TAUX_RELATIF_DECROISSANCE_EDEFAULT, oldTauxRelatifDecroissanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTauxRelatifDecroissance() {
		return tauxRelatifDecroissanceESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITUATION_RADIATION__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITUATION_RADIATION__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getConcerneMateriel() {
		if (concerneMateriel == null) {
			concerneMateriel = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_SITUATION_RADIATION__CONCERNE_MATERIEL);
		}
		return concerneMateriel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDoseRadiationAbsorbe> getDecritDoseRadiationAbsorbe() {
		if (decritDoseRadiationAbsorbe == null) {
			decritDoseRadiationAbsorbe = new EObjectContainmentEList<TypeDoseRadiationAbsorbe>(TypeDoseRadiationAbsorbe.class, this, SchemaPackage.TYPE_SITUATION_RADIATION__DECRIT_DOSE_RADIATION_ABSORBE);
		}
		return decritDoseRadiationAbsorbe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_SITUATION_RADIATION__CONCERNE_MATERIEL:
				return ((InternalEList<?>)getConcerneMateriel()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_SITUATION_RADIATION__DECRIT_DOSE_RADIATION_ABSORBE:
				return ((InternalEList<?>)getDecritDoseRadiationAbsorbe()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_SITUATION_RADIATION__DATE_MESURE:
				return getDateMesure();
			case SchemaPackage.TYPE_SITUATION_RADIATION__NIVEAU_DEBIT_DOSE:
				return new Double(getNiveauDebitDose());
			case SchemaPackage.TYPE_SITUATION_RADIATION__NIVEAU_RADIATION:
				return new Double(getNiveauRadiation());
			case SchemaPackage.TYPE_SITUATION_RADIATION__NIVEAU_RADIATION_CUMULE:
				return new Double(getNiveauRadiationCumule());
			case SchemaPackage.TYPE_SITUATION_RADIATION__EVOLUTION_DEBIT_DOSE:
				return new Double(getEvolutionDebitDose());
			case SchemaPackage.TYPE_SITUATION_RADIATION__TAUX_RELATIF_DECROISSANCE:
				return new Double(getTauxRelatifDecroissance());
			case SchemaPackage.TYPE_SITUATION_RADIATION__CTE:
				return getCTE();
			case SchemaPackage.TYPE_SITUATION_RADIATION__CE:
				return getCE();
			case SchemaPackage.TYPE_SITUATION_RADIATION__CONCERNE_MATERIEL:
				return getConcerneMateriel();
			case SchemaPackage.TYPE_SITUATION_RADIATION__DECRIT_DOSE_RADIATION_ABSORBE:
				return getDecritDoseRadiationAbsorbe();
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
			case SchemaPackage.TYPE_SITUATION_RADIATION__DATE_MESURE:
				setDateMesure((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_SITUATION_RADIATION__NIVEAU_DEBIT_DOSE:
				setNiveauDebitDose(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_SITUATION_RADIATION__NIVEAU_RADIATION:
				setNiveauRadiation(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_SITUATION_RADIATION__NIVEAU_RADIATION_CUMULE:
				setNiveauRadiationCumule(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_SITUATION_RADIATION__EVOLUTION_DEBIT_DOSE:
				setEvolutionDebitDose(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_SITUATION_RADIATION__TAUX_RELATIF_DECROISSANCE:
				setTauxRelatifDecroissance(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_SITUATION_RADIATION__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_SITUATION_RADIATION__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_SITUATION_RADIATION__CONCERNE_MATERIEL:
				getConcerneMateriel().clear();
				getConcerneMateriel().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_SITUATION_RADIATION__DECRIT_DOSE_RADIATION_ABSORBE:
				getDecritDoseRadiationAbsorbe().clear();
				getDecritDoseRadiationAbsorbe().addAll((Collection<? extends TypeDoseRadiationAbsorbe>)newValue);
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
			case SchemaPackage.TYPE_SITUATION_RADIATION__DATE_MESURE:
				setDateMesure(DATE_MESURE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SITUATION_RADIATION__NIVEAU_DEBIT_DOSE:
				unsetNiveauDebitDose();
				return;
			case SchemaPackage.TYPE_SITUATION_RADIATION__NIVEAU_RADIATION:
				unsetNiveauRadiation();
				return;
			case SchemaPackage.TYPE_SITUATION_RADIATION__NIVEAU_RADIATION_CUMULE:
				unsetNiveauRadiationCumule();
				return;
			case SchemaPackage.TYPE_SITUATION_RADIATION__EVOLUTION_DEBIT_DOSE:
				unsetEvolutionDebitDose();
				return;
			case SchemaPackage.TYPE_SITUATION_RADIATION__TAUX_RELATIF_DECROISSANCE:
				unsetTauxRelatifDecroissance();
				return;
			case SchemaPackage.TYPE_SITUATION_RADIATION__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SITUATION_RADIATION__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SITUATION_RADIATION__CONCERNE_MATERIEL:
				getConcerneMateriel().clear();
				return;
			case SchemaPackage.TYPE_SITUATION_RADIATION__DECRIT_DOSE_RADIATION_ABSORBE:
				getDecritDoseRadiationAbsorbe().clear();
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
			case SchemaPackage.TYPE_SITUATION_RADIATION__DATE_MESURE:
				return DATE_MESURE_EDEFAULT == null ? dateMesure != null : !DATE_MESURE_EDEFAULT.equals(dateMesure);
			case SchemaPackage.TYPE_SITUATION_RADIATION__NIVEAU_DEBIT_DOSE:
				return isSetNiveauDebitDose();
			case SchemaPackage.TYPE_SITUATION_RADIATION__NIVEAU_RADIATION:
				return isSetNiveauRadiation();
			case SchemaPackage.TYPE_SITUATION_RADIATION__NIVEAU_RADIATION_CUMULE:
				return isSetNiveauRadiationCumule();
			case SchemaPackage.TYPE_SITUATION_RADIATION__EVOLUTION_DEBIT_DOSE:
				return isSetEvolutionDebitDose();
			case SchemaPackage.TYPE_SITUATION_RADIATION__TAUX_RELATIF_DECROISSANCE:
				return isSetTauxRelatifDecroissance();
			case SchemaPackage.TYPE_SITUATION_RADIATION__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_SITUATION_RADIATION__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_SITUATION_RADIATION__CONCERNE_MATERIEL:
				return concerneMateriel != null && !concerneMateriel.isEmpty();
			case SchemaPackage.TYPE_SITUATION_RADIATION__DECRIT_DOSE_RADIATION_ABSORBE:
				return decritDoseRadiationAbsorbe != null && !decritDoseRadiationAbsorbe.isEmpty();
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
		result.append(" (dateMesure: ");
		result.append(dateMesure);
		result.append(", niveauDebitDose: ");
		if (niveauDebitDoseESet) result.append(niveauDebitDose); else result.append("<unset>");
		result.append(", niveauRadiation: ");
		if (niveauRadiationESet) result.append(niveauRadiation); else result.append("<unset>");
		result.append(", niveauRadiationCumule: ");
		if (niveauRadiationCumuleESet) result.append(niveauRadiationCumule); else result.append("<unset>");
		result.append(", evolutionDebitDose: ");
		if (evolutionDebitDoseESet) result.append(evolutionDebitDose); else result.append("<unset>");
		result.append(", tauxRelatifDecroissance: ");
		if (tauxRelatifDecroissanceESet) result.append(tauxRelatifDecroissance); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeSituationRadiationImpl
