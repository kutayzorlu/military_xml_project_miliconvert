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
import mpia.schema.TypeConsignesGeneralesTirASA;
import mpia.schema.TypeCriteresIdentification;
import mpia.schema.TypeDirectiveEMCONpourUniteASA;
import mpia.schema.TypeEtatAlerteUniteASA;
import mpia.schema.TypePolitiqueTirAeronef;

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
 * An implementation of the model object '<em><b>Type Consignes Generales Tir ASA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeConsignesGeneralesTirASAImpl#getDirectivesTir <em>Directives Tir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsignesGeneralesTirASAImpl#getMesuresControlePreetablies <em>Mesures Controle Preetablies</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsignesGeneralesTirASAImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsignesGeneralesTirASAImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsignesGeneralesTirASAImpl#getAPourCriteresIdentificationCriteresIdentification <em>APour Criteres Identification Criteres Identification</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsignesGeneralesTirASAImpl#getAPourDirectiveEMCONDirectiveEMCONpourUniteASA <em>APour Directive EMCON Directive EMCO Npour Unite ASA</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsignesGeneralesTirASAImpl#getAPourEtatAlerteUniteASAEtatAlerteUniteASA <em>APour Etat Alerte Unite ASA Etat Alerte Unite ASA</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsignesGeneralesTirASAImpl#getACommePolitiqueTirAeronefPolitiqueTirAeronef <em>AComme Politique Tir Aeronef Politique Tir Aeronef</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsignesGeneralesTirASAImpl#getAPourReglesEngagementRegleEngagement <em>APour Regles Engagement Regle Engagement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsignesGeneralesTirASAImpl#getAPourConsignesTirSecoursConsigneTir <em>APour Consignes Tir Secours Consigne Tir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsignesGeneralesTirASAImpl#getACommeTypeMesureCoordinationTypeMesureCoordination <em>AComme Type Mesure Coordination Type Mesure Coordination</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeConsignesGeneralesTirASAImpl extends EObjectImpl implements TypeConsignesGeneralesTirASA {
	/**
	 * The default value of the '{@link #getDirectivesTir() <em>Directives Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectivesTir()
	 * @generated
	 * @ordered
	 */
	protected static final String DIRECTIVES_TIR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDirectivesTir() <em>Directives Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectivesTir()
	 * @generated
	 * @ordered
	 */
	protected String directivesTir = DIRECTIVES_TIR_EDEFAULT;

	/**
	 * The default value of the '{@link #getMesuresControlePreetablies() <em>Mesures Controle Preetablies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMesuresControlePreetablies()
	 * @generated
	 * @ordered
	 */
	protected static final String MESURES_CONTROLE_PREETABLIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMesuresControlePreetablies() <em>Mesures Controle Preetablies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMesuresControlePreetablies()
	 * @generated
	 * @ordered
	 */
	protected String mesuresControlePreetablies = MESURES_CONTROLE_PREETABLIES_EDEFAULT;

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
	 * The cached value of the '{@link #getAPourCriteresIdentificationCriteresIdentification() <em>APour Criteres Identification Criteres Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCriteresIdentificationCriteresIdentification()
	 * @generated
	 * @ordered
	 */
	protected TypeCriteresIdentification aPourCriteresIdentificationCriteresIdentification;

	/**
	 * The cached value of the '{@link #getAPourDirectiveEMCONDirectiveEMCONpourUniteASA() <em>APour Directive EMCON Directive EMCO Npour Unite ASA</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourDirectiveEMCONDirectiveEMCONpourUniteASA()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeDirectiveEMCONpourUniteASA> aPourDirectiveEMCONDirectiveEMCONpourUniteASA;

	/**
	 * The cached value of the '{@link #getAPourEtatAlerteUniteASAEtatAlerteUniteASA() <em>APour Etat Alerte Unite ASA Etat Alerte Unite ASA</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourEtatAlerteUniteASAEtatAlerteUniteASA()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeEtatAlerteUniteASA> aPourEtatAlerteUniteASAEtatAlerteUniteASA;

	/**
	 * The cached value of the '{@link #getACommePolitiqueTirAeronefPolitiqueTirAeronef() <em>AComme Politique Tir Aeronef Politique Tir Aeronef</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommePolitiqueTirAeronefPolitiqueTirAeronef()
	 * @generated
	 * @ordered
	 */
	protected EList<TypePolitiqueTirAeronef> aCommePolitiqueTirAeronefPolitiqueTirAeronef;

	/**
	 * The cached value of the '{@link #getAPourReglesEngagementRegleEngagement() <em>APour Regles Engagement Regle Engagement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourReglesEngagementRegleEngagement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourReglesEngagementRegleEngagement;

	/**
	 * The cached value of the '{@link #getAPourConsignesTirSecoursConsigneTir() <em>APour Consignes Tir Secours Consigne Tir</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourConsignesTirSecoursConsigneTir()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourConsignesTirSecoursConsigneTir;

	/**
	 * The cached value of the '{@link #getACommeTypeMesureCoordinationTypeMesureCoordination() <em>AComme Type Mesure Coordination Type Mesure Coordination</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeTypeMesureCoordinationTypeMesureCoordination()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aCommeTypeMesureCoordinationTypeMesureCoordination;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeConsignesGeneralesTirASAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeConsignesGeneralesTirASA();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDirectivesTir() {
		return directivesTir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectivesTir(String newDirectivesTir) {
		String oldDirectivesTir = directivesTir;
		directivesTir = newDirectivesTir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__DIRECTIVES_TIR, oldDirectivesTir, directivesTir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMesuresControlePreetablies() {
		return mesuresControlePreetablies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMesuresControlePreetablies(String newMesuresControlePreetablies) {
		String oldMesuresControlePreetablies = mesuresControlePreetablies;
		mesuresControlePreetablies = newMesuresControlePreetablies;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__MESURES_CONTROLE_PREETABLIES, oldMesuresControlePreetablies, mesuresControlePreetablies));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeCriteresIdentification getAPourCriteresIdentificationCriteresIdentification() {
		return aPourCriteresIdentificationCriteresIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourCriteresIdentificationCriteresIdentification(TypeCriteresIdentification newAPourCriteresIdentificationCriteresIdentification, NotificationChain msgs) {
		TypeCriteresIdentification oldAPourCriteresIdentificationCriteresIdentification = aPourCriteresIdentificationCriteresIdentification;
		aPourCriteresIdentificationCriteresIdentification = newAPourCriteresIdentificationCriteresIdentification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__APOUR_CRITERES_IDENTIFICATION_CRITERES_IDENTIFICATION, oldAPourCriteresIdentificationCriteresIdentification, newAPourCriteresIdentificationCriteresIdentification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourCriteresIdentificationCriteresIdentification(TypeCriteresIdentification newAPourCriteresIdentificationCriteresIdentification) {
		if (newAPourCriteresIdentificationCriteresIdentification != aPourCriteresIdentificationCriteresIdentification) {
			NotificationChain msgs = null;
			if (aPourCriteresIdentificationCriteresIdentification != null)
				msgs = ((InternalEObject)aPourCriteresIdentificationCriteresIdentification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__APOUR_CRITERES_IDENTIFICATION_CRITERES_IDENTIFICATION, null, msgs);
			if (newAPourCriteresIdentificationCriteresIdentification != null)
				msgs = ((InternalEObject)newAPourCriteresIdentificationCriteresIdentification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__APOUR_CRITERES_IDENTIFICATION_CRITERES_IDENTIFICATION, null, msgs);
			msgs = basicSetAPourCriteresIdentificationCriteresIdentification(newAPourCriteresIdentificationCriteresIdentification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__APOUR_CRITERES_IDENTIFICATION_CRITERES_IDENTIFICATION, newAPourCriteresIdentificationCriteresIdentification, newAPourCriteresIdentificationCriteresIdentification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDirectiveEMCONpourUniteASA> getAPourDirectiveEMCONDirectiveEMCONpourUniteASA() {
		if (aPourDirectiveEMCONDirectiveEMCONpourUniteASA == null) {
			aPourDirectiveEMCONDirectiveEMCONpourUniteASA = new EObjectContainmentEList<TypeDirectiveEMCONpourUniteASA>(TypeDirectiveEMCONpourUniteASA.class, this, SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__APOUR_DIRECTIVE_EMCON_DIRECTIVE_EMCO_NPOUR_UNITE_ASA);
		}
		return aPourDirectiveEMCONDirectiveEMCONpourUniteASA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEtatAlerteUniteASA> getAPourEtatAlerteUniteASAEtatAlerteUniteASA() {
		if (aPourEtatAlerteUniteASAEtatAlerteUniteASA == null) {
			aPourEtatAlerteUniteASAEtatAlerteUniteASA = new EObjectContainmentEList<TypeEtatAlerteUniteASA>(TypeEtatAlerteUniteASA.class, this, SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__APOUR_ETAT_ALERTE_UNITE_ASA_ETAT_ALERTE_UNITE_ASA);
		}
		return aPourEtatAlerteUniteASAEtatAlerteUniteASA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePolitiqueTirAeronef> getACommePolitiqueTirAeronefPolitiqueTirAeronef() {
		if (aCommePolitiqueTirAeronefPolitiqueTirAeronef == null) {
			aCommePolitiqueTirAeronefPolitiqueTirAeronef = new EObjectContainmentEList<TypePolitiqueTirAeronef>(TypePolitiqueTirAeronef.class, this, SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__ACOMME_POLITIQUE_TIR_AERONEF_POLITIQUE_TIR_AERONEF);
		}
		return aCommePolitiqueTirAeronefPolitiqueTirAeronef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourReglesEngagementRegleEngagement() {
		if (aPourReglesEngagementRegleEngagement == null) {
			aPourReglesEngagementRegleEngagement = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__APOUR_REGLES_ENGAGEMENT_REGLE_ENGAGEMENT);
		}
		return aPourReglesEngagementRegleEngagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourConsignesTirSecoursConsigneTir() {
		if (aPourConsignesTirSecoursConsigneTir == null) {
			aPourConsignesTirSecoursConsigneTir = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__APOUR_CONSIGNES_TIR_SECOURS_CONSIGNE_TIR);
		}
		return aPourConsignesTirSecoursConsigneTir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getACommeTypeMesureCoordinationTypeMesureCoordination() {
		if (aCommeTypeMesureCoordinationTypeMesureCoordination == null) {
			aCommeTypeMesureCoordinationTypeMesureCoordination = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__ACOMME_TYPE_MESURE_COORDINATION_TYPE_MESURE_COORDINATION);
		}
		return aCommeTypeMesureCoordinationTypeMesureCoordination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__APOUR_CRITERES_IDENTIFICATION_CRITERES_IDENTIFICATION:
				return basicSetAPourCriteresIdentificationCriteresIdentification(null, msgs);
			case SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__APOUR_DIRECTIVE_EMCON_DIRECTIVE_EMCO_NPOUR_UNITE_ASA:
				return ((InternalEList<?>)getAPourDirectiveEMCONDirectiveEMCONpourUniteASA()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__APOUR_ETAT_ALERTE_UNITE_ASA_ETAT_ALERTE_UNITE_ASA:
				return ((InternalEList<?>)getAPourEtatAlerteUniteASAEtatAlerteUniteASA()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__ACOMME_POLITIQUE_TIR_AERONEF_POLITIQUE_TIR_AERONEF:
				return ((InternalEList<?>)getACommePolitiqueTirAeronefPolitiqueTirAeronef()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__APOUR_REGLES_ENGAGEMENT_REGLE_ENGAGEMENT:
				return ((InternalEList<?>)getAPourReglesEngagementRegleEngagement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__APOUR_CONSIGNES_TIR_SECOURS_CONSIGNE_TIR:
				return ((InternalEList<?>)getAPourConsignesTirSecoursConsigneTir()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__ACOMME_TYPE_MESURE_COORDINATION_TYPE_MESURE_COORDINATION:
				return ((InternalEList<?>)getACommeTypeMesureCoordinationTypeMesureCoordination()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__DIRECTIVES_TIR:
				return getDirectivesTir();
			case SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__MESURES_CONTROLE_PREETABLIES:
				return getMesuresControlePreetablies();
			case SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__CTE:
				return getCTE();
			case SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__CE:
				return getCE();
			case SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__APOUR_CRITERES_IDENTIFICATION_CRITERES_IDENTIFICATION:
				return getAPourCriteresIdentificationCriteresIdentification();
			case SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__APOUR_DIRECTIVE_EMCON_DIRECTIVE_EMCO_NPOUR_UNITE_ASA:
				return getAPourDirectiveEMCONDirectiveEMCONpourUniteASA();
			case SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__APOUR_ETAT_ALERTE_UNITE_ASA_ETAT_ALERTE_UNITE_ASA:
				return getAPourEtatAlerteUniteASAEtatAlerteUniteASA();
			case SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__ACOMME_POLITIQUE_TIR_AERONEF_POLITIQUE_TIR_AERONEF:
				return getACommePolitiqueTirAeronefPolitiqueTirAeronef();
			case SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__APOUR_REGLES_ENGAGEMENT_REGLE_ENGAGEMENT:
				return getAPourReglesEngagementRegleEngagement();
			case SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__APOUR_CONSIGNES_TIR_SECOURS_CONSIGNE_TIR:
				return getAPourConsignesTirSecoursConsigneTir();
			case SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__ACOMME_TYPE_MESURE_COORDINATION_TYPE_MESURE_COORDINATION:
				return getACommeTypeMesureCoordinationTypeMesureCoordination();
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
			case SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__DIRECTIVES_TIR:
				setDirectivesTir((String)newValue);
				return;
			case SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__MESURES_CONTROLE_PREETABLIES:
				setMesuresControlePreetablies((String)newValue);
				return;
			case SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__APOUR_CRITERES_IDENTIFICATION_CRITERES_IDENTIFICATION:
				setAPourCriteresIdentificationCriteresIdentification((TypeCriteresIdentification)newValue);
				return;
			case SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__APOUR_DIRECTIVE_EMCON_DIRECTIVE_EMCO_NPOUR_UNITE_ASA:
				getAPourDirectiveEMCONDirectiveEMCONpourUniteASA().clear();
				getAPourDirectiveEMCONDirectiveEMCONpourUniteASA().addAll((Collection<? extends TypeDirectiveEMCONpourUniteASA>)newValue);
				return;
			case SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__APOUR_ETAT_ALERTE_UNITE_ASA_ETAT_ALERTE_UNITE_ASA:
				getAPourEtatAlerteUniteASAEtatAlerteUniteASA().clear();
				getAPourEtatAlerteUniteASAEtatAlerteUniteASA().addAll((Collection<? extends TypeEtatAlerteUniteASA>)newValue);
				return;
			case SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__ACOMME_POLITIQUE_TIR_AERONEF_POLITIQUE_TIR_AERONEF:
				getACommePolitiqueTirAeronefPolitiqueTirAeronef().clear();
				getACommePolitiqueTirAeronefPolitiqueTirAeronef().addAll((Collection<? extends TypePolitiqueTirAeronef>)newValue);
				return;
			case SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__APOUR_REGLES_ENGAGEMENT_REGLE_ENGAGEMENT:
				getAPourReglesEngagementRegleEngagement().clear();
				getAPourReglesEngagementRegleEngagement().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__APOUR_CONSIGNES_TIR_SECOURS_CONSIGNE_TIR:
				getAPourConsignesTirSecoursConsigneTir().clear();
				getAPourConsignesTirSecoursConsigneTir().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__ACOMME_TYPE_MESURE_COORDINATION_TYPE_MESURE_COORDINATION:
				getACommeTypeMesureCoordinationTypeMesureCoordination().clear();
				getACommeTypeMesureCoordinationTypeMesureCoordination().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__DIRECTIVES_TIR:
				setDirectivesTir(DIRECTIVES_TIR_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__MESURES_CONTROLE_PREETABLIES:
				setMesuresControlePreetablies(MESURES_CONTROLE_PREETABLIES_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__APOUR_CRITERES_IDENTIFICATION_CRITERES_IDENTIFICATION:
				setAPourCriteresIdentificationCriteresIdentification((TypeCriteresIdentification)null);
				return;
			case SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__APOUR_DIRECTIVE_EMCON_DIRECTIVE_EMCO_NPOUR_UNITE_ASA:
				getAPourDirectiveEMCONDirectiveEMCONpourUniteASA().clear();
				return;
			case SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__APOUR_ETAT_ALERTE_UNITE_ASA_ETAT_ALERTE_UNITE_ASA:
				getAPourEtatAlerteUniteASAEtatAlerteUniteASA().clear();
				return;
			case SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__ACOMME_POLITIQUE_TIR_AERONEF_POLITIQUE_TIR_AERONEF:
				getACommePolitiqueTirAeronefPolitiqueTirAeronef().clear();
				return;
			case SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__APOUR_REGLES_ENGAGEMENT_REGLE_ENGAGEMENT:
				getAPourReglesEngagementRegleEngagement().clear();
				return;
			case SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__APOUR_CONSIGNES_TIR_SECOURS_CONSIGNE_TIR:
				getAPourConsignesTirSecoursConsigneTir().clear();
				return;
			case SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__ACOMME_TYPE_MESURE_COORDINATION_TYPE_MESURE_COORDINATION:
				getACommeTypeMesureCoordinationTypeMesureCoordination().clear();
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
			case SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__DIRECTIVES_TIR:
				return DIRECTIVES_TIR_EDEFAULT == null ? directivesTir != null : !DIRECTIVES_TIR_EDEFAULT.equals(directivesTir);
			case SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__MESURES_CONTROLE_PREETABLIES:
				return MESURES_CONTROLE_PREETABLIES_EDEFAULT == null ? mesuresControlePreetablies != null : !MESURES_CONTROLE_PREETABLIES_EDEFAULT.equals(mesuresControlePreetablies);
			case SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__APOUR_CRITERES_IDENTIFICATION_CRITERES_IDENTIFICATION:
				return aPourCriteresIdentificationCriteresIdentification != null;
			case SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__APOUR_DIRECTIVE_EMCON_DIRECTIVE_EMCO_NPOUR_UNITE_ASA:
				return aPourDirectiveEMCONDirectiveEMCONpourUniteASA != null && !aPourDirectiveEMCONDirectiveEMCONpourUniteASA.isEmpty();
			case SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__APOUR_ETAT_ALERTE_UNITE_ASA_ETAT_ALERTE_UNITE_ASA:
				return aPourEtatAlerteUniteASAEtatAlerteUniteASA != null && !aPourEtatAlerteUniteASAEtatAlerteUniteASA.isEmpty();
			case SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__ACOMME_POLITIQUE_TIR_AERONEF_POLITIQUE_TIR_AERONEF:
				return aCommePolitiqueTirAeronefPolitiqueTirAeronef != null && !aCommePolitiqueTirAeronefPolitiqueTirAeronef.isEmpty();
			case SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__APOUR_REGLES_ENGAGEMENT_REGLE_ENGAGEMENT:
				return aPourReglesEngagementRegleEngagement != null && !aPourReglesEngagementRegleEngagement.isEmpty();
			case SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__APOUR_CONSIGNES_TIR_SECOURS_CONSIGNE_TIR:
				return aPourConsignesTirSecoursConsigneTir != null && !aPourConsignesTirSecoursConsigneTir.isEmpty();
			case SchemaPackage.TYPE_CONSIGNES_GENERALES_TIR_ASA__ACOMME_TYPE_MESURE_COORDINATION_TYPE_MESURE_COORDINATION:
				return aCommeTypeMesureCoordinationTypeMesureCoordination != null && !aCommeTypeMesureCoordinationTypeMesureCoordination.isEmpty();
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
		result.append(" (directivesTir: ");
		result.append(directivesTir);
		result.append(", mesuresControlePreetablies: ");
		result.append(mesuresControlePreetablies);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeConsignesGeneralesTirASAImpl
