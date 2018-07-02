/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoMesuresProtectionElectroniqueTypeMoyenRayonnant;
import mpia.schema.TypeMesuresProtectionElectronique;

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
 * An implementation of the model object '<em><b>Type Mesures Protection Electronique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMesuresProtectionElectroniqueImpl#getTypeMoyenRayonnant <em>Type Moyen Rayonnant</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMesuresProtectionElectroniqueImpl#getTypeMoyenRayonnantNonRep <em>Type Moyen Rayonnant Non Rep</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMesuresProtectionElectroniqueImpl#getPourcentageMoyensUtilises <em>Pourcentage Moyens Utilises</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMesuresProtectionElectroniqueImpl#getDateDebutEmploi <em>Date Debut Emploi</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMesuresProtectionElectroniqueImpl#getDateFinEmploi <em>Date Fin Emploi</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMesuresProtectionElectroniqueImpl#getComplementAuRegimeEmploi <em>Complement Au Regime Emploi</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMesuresProtectionElectroniqueImpl#getAutresMesuresPropresAASA <em>Autres Mesures Propres AASA</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMesuresProtectionElectroniqueImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMesuresProtectionElectroniqueImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMesuresProtectionElectroniqueImpl#getAPourUniteConcerneeUnite <em>APour Unite Concernee Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMesuresProtectionElectroniqueImpl extends EObjectImpl implements TypeMesuresProtectionElectronique {
	/**
	 * The default value of the '{@link #getTypeMoyenRayonnant() <em>Type Moyen Rayonnant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMoyenRayonnant()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMesuresProtectionElectroniqueTypeMoyenRayonnant TYPE_MOYEN_RAYONNANT_EDEFAULT = TypeDictionaryDicoMesuresProtectionElectroniqueTypeMoyenRayonnant.LARAD;

	/**
	 * The cached value of the '{@link #getTypeMoyenRayonnant() <em>Type Moyen Rayonnant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMoyenRayonnant()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMesuresProtectionElectroniqueTypeMoyenRayonnant typeMoyenRayonnant = TYPE_MOYEN_RAYONNANT_EDEFAULT;

	/**
	 * This is true if the Type Moyen Rayonnant attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeMoyenRayonnantESet;

	/**
	 * The default value of the '{@link #getTypeMoyenRayonnantNonRep() <em>Type Moyen Rayonnant Non Rep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMoyenRayonnantNonRep()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_MOYEN_RAYONNANT_NON_REP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeMoyenRayonnantNonRep() <em>Type Moyen Rayonnant Non Rep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMoyenRayonnantNonRep()
	 * @generated
	 * @ordered
	 */
	protected String typeMoyenRayonnantNonRep = TYPE_MOYEN_RAYONNANT_NON_REP_EDEFAULT;

	/**
	 * The default value of the '{@link #getPourcentageMoyensUtilises() <em>Pourcentage Moyens Utilises</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPourcentageMoyensUtilises()
	 * @generated
	 * @ordered
	 */
	protected static final double POURCENTAGE_MOYENS_UTILISES_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPourcentageMoyensUtilises() <em>Pourcentage Moyens Utilises</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPourcentageMoyensUtilises()
	 * @generated
	 * @ordered
	 */
	protected double pourcentageMoyensUtilises = POURCENTAGE_MOYENS_UTILISES_EDEFAULT;

	/**
	 * This is true if the Pourcentage Moyens Utilises attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pourcentageMoyensUtilisesESet;

	/**
	 * The default value of the '{@link #getDateDebutEmploi() <em>Date Debut Emploi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebutEmploi()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_DEBUT_EMPLOI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateDebutEmploi() <em>Date Debut Emploi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebutEmploi()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateDebutEmploi = DATE_DEBUT_EMPLOI_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateFinEmploi() <em>Date Fin Emploi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFinEmploi()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_FIN_EMPLOI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateFinEmploi() <em>Date Fin Emploi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFinEmploi()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateFinEmploi = DATE_FIN_EMPLOI_EDEFAULT;

	/**
	 * The default value of the '{@link #getComplementAuRegimeEmploi() <em>Complement Au Regime Emploi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplementAuRegimeEmploi()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPLEMENT_AU_REGIME_EMPLOI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComplementAuRegimeEmploi() <em>Complement Au Regime Emploi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplementAuRegimeEmploi()
	 * @generated
	 * @ordered
	 */
	protected String complementAuRegimeEmploi = COMPLEMENT_AU_REGIME_EMPLOI_EDEFAULT;

	/**
	 * The default value of the '{@link #getAutresMesuresPropresAASA() <em>Autres Mesures Propres AASA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutresMesuresPropresAASA()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTRES_MESURES_PROPRES_AASA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutresMesuresPropresAASA() <em>Autres Mesures Propres AASA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutresMesuresPropresAASA()
	 * @generated
	 * @ordered
	 */
	protected String autresMesuresPropresAASA = AUTRES_MESURES_PROPRES_AASA_EDEFAULT;

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
	 * The cached value of the '{@link #getAPourUniteConcerneeUnite() <em>APour Unite Concernee Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUniteConcerneeUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociationEXT> aPourUniteConcerneeUnite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMesuresProtectionElectroniqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMesuresProtectionElectronique();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMesuresProtectionElectroniqueTypeMoyenRayonnant getTypeMoyenRayonnant() {
		return typeMoyenRayonnant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeMoyenRayonnant(TypeDictionaryDicoMesuresProtectionElectroniqueTypeMoyenRayonnant newTypeMoyenRayonnant) {
		TypeDictionaryDicoMesuresProtectionElectroniqueTypeMoyenRayonnant oldTypeMoyenRayonnant = typeMoyenRayonnant;
		typeMoyenRayonnant = newTypeMoyenRayonnant == null ? TYPE_MOYEN_RAYONNANT_EDEFAULT : newTypeMoyenRayonnant;
		boolean oldTypeMoyenRayonnantESet = typeMoyenRayonnantESet;
		typeMoyenRayonnantESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__TYPE_MOYEN_RAYONNANT, oldTypeMoyenRayonnant, typeMoyenRayonnant, !oldTypeMoyenRayonnantESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeMoyenRayonnant() {
		TypeDictionaryDicoMesuresProtectionElectroniqueTypeMoyenRayonnant oldTypeMoyenRayonnant = typeMoyenRayonnant;
		boolean oldTypeMoyenRayonnantESet = typeMoyenRayonnantESet;
		typeMoyenRayonnant = TYPE_MOYEN_RAYONNANT_EDEFAULT;
		typeMoyenRayonnantESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__TYPE_MOYEN_RAYONNANT, oldTypeMoyenRayonnant, TYPE_MOYEN_RAYONNANT_EDEFAULT, oldTypeMoyenRayonnantESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeMoyenRayonnant() {
		return typeMoyenRayonnantESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeMoyenRayonnantNonRep() {
		return typeMoyenRayonnantNonRep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeMoyenRayonnantNonRep(String newTypeMoyenRayonnantNonRep) {
		String oldTypeMoyenRayonnantNonRep = typeMoyenRayonnantNonRep;
		typeMoyenRayonnantNonRep = newTypeMoyenRayonnantNonRep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__TYPE_MOYEN_RAYONNANT_NON_REP, oldTypeMoyenRayonnantNonRep, typeMoyenRayonnantNonRep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPourcentageMoyensUtilises() {
		return pourcentageMoyensUtilises;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPourcentageMoyensUtilises(double newPourcentageMoyensUtilises) {
		double oldPourcentageMoyensUtilises = pourcentageMoyensUtilises;
		pourcentageMoyensUtilises = newPourcentageMoyensUtilises;
		boolean oldPourcentageMoyensUtilisesESet = pourcentageMoyensUtilisesESet;
		pourcentageMoyensUtilisesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__POURCENTAGE_MOYENS_UTILISES, oldPourcentageMoyensUtilises, pourcentageMoyensUtilises, !oldPourcentageMoyensUtilisesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPourcentageMoyensUtilises() {
		double oldPourcentageMoyensUtilises = pourcentageMoyensUtilises;
		boolean oldPourcentageMoyensUtilisesESet = pourcentageMoyensUtilisesESet;
		pourcentageMoyensUtilises = POURCENTAGE_MOYENS_UTILISES_EDEFAULT;
		pourcentageMoyensUtilisesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__POURCENTAGE_MOYENS_UTILISES, oldPourcentageMoyensUtilises, POURCENTAGE_MOYENS_UTILISES_EDEFAULT, oldPourcentageMoyensUtilisesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPourcentageMoyensUtilises() {
		return pourcentageMoyensUtilisesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateDebutEmploi() {
		return dateDebutEmploi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDebutEmploi(XMLGregorianCalendar newDateDebutEmploi) {
		XMLGregorianCalendar oldDateDebutEmploi = dateDebutEmploi;
		dateDebutEmploi = newDateDebutEmploi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__DATE_DEBUT_EMPLOI, oldDateDebutEmploi, dateDebutEmploi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateFinEmploi() {
		return dateFinEmploi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateFinEmploi(XMLGregorianCalendar newDateFinEmploi) {
		XMLGregorianCalendar oldDateFinEmploi = dateFinEmploi;
		dateFinEmploi = newDateFinEmploi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__DATE_FIN_EMPLOI, oldDateFinEmploi, dateFinEmploi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComplementAuRegimeEmploi() {
		return complementAuRegimeEmploi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplementAuRegimeEmploi(String newComplementAuRegimeEmploi) {
		String oldComplementAuRegimeEmploi = complementAuRegimeEmploi;
		complementAuRegimeEmploi = newComplementAuRegimeEmploi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__COMPLEMENT_AU_REGIME_EMPLOI, oldComplementAuRegimeEmploi, complementAuRegimeEmploi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutresMesuresPropresAASA() {
		return autresMesuresPropresAASA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutresMesuresPropresAASA(String newAutresMesuresPropresAASA) {
		String oldAutresMesuresPropresAASA = autresMesuresPropresAASA;
		autresMesuresPropresAASA = newAutresMesuresPropresAASA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__AUTRES_MESURES_PROPRES_AASA, oldAutresMesuresPropresAASA, autresMesuresPropresAASA));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEXT> getAPourUniteConcerneeUnite() {
		if (aPourUniteConcerneeUnite == null) {
			aPourUniteConcerneeUnite = new EObjectContainmentEList<TypeAssociationEXT>(TypeAssociationEXT.class, this, SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__APOUR_UNITE_CONCERNEE_UNITE);
		}
		return aPourUniteConcerneeUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__APOUR_UNITE_CONCERNEE_UNITE:
				return ((InternalEList<?>)getAPourUniteConcerneeUnite()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__TYPE_MOYEN_RAYONNANT:
				return getTypeMoyenRayonnant();
			case SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__TYPE_MOYEN_RAYONNANT_NON_REP:
				return getTypeMoyenRayonnantNonRep();
			case SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__POURCENTAGE_MOYENS_UTILISES:
				return new Double(getPourcentageMoyensUtilises());
			case SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__DATE_DEBUT_EMPLOI:
				return getDateDebutEmploi();
			case SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__DATE_FIN_EMPLOI:
				return getDateFinEmploi();
			case SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__COMPLEMENT_AU_REGIME_EMPLOI:
				return getComplementAuRegimeEmploi();
			case SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__AUTRES_MESURES_PROPRES_AASA:
				return getAutresMesuresPropresAASA();
			case SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__CE:
				return getCE();
			case SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__APOUR_UNITE_CONCERNEE_UNITE:
				return getAPourUniteConcerneeUnite();
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
			case SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__TYPE_MOYEN_RAYONNANT:
				setTypeMoyenRayonnant((TypeDictionaryDicoMesuresProtectionElectroniqueTypeMoyenRayonnant)newValue);
				return;
			case SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__TYPE_MOYEN_RAYONNANT_NON_REP:
				setTypeMoyenRayonnantNonRep((String)newValue);
				return;
			case SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__POURCENTAGE_MOYENS_UTILISES:
				setPourcentageMoyensUtilises(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__DATE_DEBUT_EMPLOI:
				setDateDebutEmploi((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__DATE_FIN_EMPLOI:
				setDateFinEmploi((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__COMPLEMENT_AU_REGIME_EMPLOI:
				setComplementAuRegimeEmploi((String)newValue);
				return;
			case SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__AUTRES_MESURES_PROPRES_AASA:
				setAutresMesuresPropresAASA((String)newValue);
				return;
			case SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__APOUR_UNITE_CONCERNEE_UNITE:
				getAPourUniteConcerneeUnite().clear();
				getAPourUniteConcerneeUnite().addAll((Collection<? extends TypeAssociationEXT>)newValue);
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
			case SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__TYPE_MOYEN_RAYONNANT:
				unsetTypeMoyenRayonnant();
				return;
			case SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__TYPE_MOYEN_RAYONNANT_NON_REP:
				setTypeMoyenRayonnantNonRep(TYPE_MOYEN_RAYONNANT_NON_REP_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__POURCENTAGE_MOYENS_UTILISES:
				unsetPourcentageMoyensUtilises();
				return;
			case SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__DATE_DEBUT_EMPLOI:
				setDateDebutEmploi(DATE_DEBUT_EMPLOI_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__DATE_FIN_EMPLOI:
				setDateFinEmploi(DATE_FIN_EMPLOI_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__COMPLEMENT_AU_REGIME_EMPLOI:
				setComplementAuRegimeEmploi(COMPLEMENT_AU_REGIME_EMPLOI_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__AUTRES_MESURES_PROPRES_AASA:
				setAutresMesuresPropresAASA(AUTRES_MESURES_PROPRES_AASA_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__APOUR_UNITE_CONCERNEE_UNITE:
				getAPourUniteConcerneeUnite().clear();
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
			case SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__TYPE_MOYEN_RAYONNANT:
				return isSetTypeMoyenRayonnant();
			case SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__TYPE_MOYEN_RAYONNANT_NON_REP:
				return TYPE_MOYEN_RAYONNANT_NON_REP_EDEFAULT == null ? typeMoyenRayonnantNonRep != null : !TYPE_MOYEN_RAYONNANT_NON_REP_EDEFAULT.equals(typeMoyenRayonnantNonRep);
			case SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__POURCENTAGE_MOYENS_UTILISES:
				return isSetPourcentageMoyensUtilises();
			case SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__DATE_DEBUT_EMPLOI:
				return DATE_DEBUT_EMPLOI_EDEFAULT == null ? dateDebutEmploi != null : !DATE_DEBUT_EMPLOI_EDEFAULT.equals(dateDebutEmploi);
			case SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__DATE_FIN_EMPLOI:
				return DATE_FIN_EMPLOI_EDEFAULT == null ? dateFinEmploi != null : !DATE_FIN_EMPLOI_EDEFAULT.equals(dateFinEmploi);
			case SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__COMPLEMENT_AU_REGIME_EMPLOI:
				return COMPLEMENT_AU_REGIME_EMPLOI_EDEFAULT == null ? complementAuRegimeEmploi != null : !COMPLEMENT_AU_REGIME_EMPLOI_EDEFAULT.equals(complementAuRegimeEmploi);
			case SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__AUTRES_MESURES_PROPRES_AASA:
				return AUTRES_MESURES_PROPRES_AASA_EDEFAULT == null ? autresMesuresPropresAASA != null : !AUTRES_MESURES_PROPRES_AASA_EDEFAULT.equals(autresMesuresPropresAASA);
			case SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_MESURES_PROTECTION_ELECTRONIQUE__APOUR_UNITE_CONCERNEE_UNITE:
				return aPourUniteConcerneeUnite != null && !aPourUniteConcerneeUnite.isEmpty();
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
		result.append(" (typeMoyenRayonnant: ");
		if (typeMoyenRayonnantESet) result.append(typeMoyenRayonnant); else result.append("<unset>");
		result.append(", typeMoyenRayonnantNonRep: ");
		result.append(typeMoyenRayonnantNonRep);
		result.append(", pourcentageMoyensUtilises: ");
		if (pourcentageMoyensUtilisesESet) result.append(pourcentageMoyensUtilises); else result.append("<unset>");
		result.append(", dateDebutEmploi: ");
		result.append(dateDebutEmploi);
		result.append(", dateFinEmploi: ");
		result.append(dateFinEmploi);
		result.append(", complementAuRegimeEmploi: ");
		result.append(complementAuRegimeEmploi);
		result.append(", autresMesuresPropresAASA: ");
		result.append(autresMesuresPropresAASA);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeMesuresProtectionElectroniqueImpl
