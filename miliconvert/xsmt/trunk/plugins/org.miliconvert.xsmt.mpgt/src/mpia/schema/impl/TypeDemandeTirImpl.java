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

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDemandeEngagementObjectif;
import mpia.schema.TypeDemandeTir;

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
 * An implementation of the model object '<em><b>Type Demande Tir</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeDemandeTirImpl#getNumeroDemande <em>Numero Demande</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDemandeTirImpl#getGDHcreation <em>GD Hcreation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDemandeTirImpl#getAPourDemandeurUnite <em>APour Demandeur Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDemandeTirImpl#getACommeDirectiveDirectiveTir <em>AComme Directive Directive Tir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDemandeTirImpl#getAPourCompteRenduCompteRenduTir <em>APour Compte Rendu Compte Rendu Tir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDemandeTirImpl#getAPourCaracteristiquesDemandeEngagementObjectif <em>APour Caracteristiques Demande Engagement Objectif</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeDemandeTirImpl extends TypeActiviteImpl implements TypeDemandeTir {
	/**
	 * The default value of the '{@link #getNumeroDemande() <em>Numero Demande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroDemande()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMERO_DEMANDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumeroDemande() <em>Numero Demande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroDemande()
	 * @generated
	 * @ordered
	 */
	protected String numeroDemande = NUMERO_DEMANDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGDHcreation() <em>GD Hcreation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHcreation()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GD_HCREATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGDHcreation() <em>GD Hcreation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHcreation()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gDHcreation = GD_HCREATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAPourDemandeurUnite() <em>APour Demandeur Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourDemandeurUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourDemandeurUnite;

	/**
	 * The cached value of the '{@link #getACommeDirectiveDirectiveTir() <em>AComme Directive Directive Tir</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeDirectiveDirectiveTir()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aCommeDirectiveDirectiveTir;

	/**
	 * The cached value of the '{@link #getAPourCompteRenduCompteRenduTir() <em>APour Compte Rendu Compte Rendu Tir</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCompteRenduCompteRenduTir()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourCompteRenduCompteRenduTir;

	/**
	 * The cached value of the '{@link #getAPourCaracteristiquesDemandeEngagementObjectif() <em>APour Caracteristiques Demande Engagement Objectif</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCaracteristiquesDemandeEngagementObjectif()
	 * @generated
	 * @ordered
	 */
	protected TypeDemandeEngagementObjectif aPourCaracteristiquesDemandeEngagementObjectif;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDemandeTirImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeDemandeTir();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumeroDemande() {
		return numeroDemande;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroDemande(String newNumeroDemande) {
		String oldNumeroDemande = numeroDemande;
		numeroDemande = newNumeroDemande;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEMANDE_TIR__NUMERO_DEMANDE, oldNumeroDemande, numeroDemande));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGDHcreation() {
		return gDHcreation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGDHcreation(XMLGregorianCalendar newGDHcreation) {
		XMLGregorianCalendar oldGDHcreation = gDHcreation;
		gDHcreation = newGDHcreation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEMANDE_TIR__GD_HCREATION, oldGDHcreation, gDHcreation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourDemandeurUnite() {
		return aPourDemandeurUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourDemandeurUnite(TypeAssociationEXT newAPourDemandeurUnite, NotificationChain msgs) {
		TypeAssociationEXT oldAPourDemandeurUnite = aPourDemandeurUnite;
		aPourDemandeurUnite = newAPourDemandeurUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEMANDE_TIR__APOUR_DEMANDEUR_UNITE, oldAPourDemandeurUnite, newAPourDemandeurUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourDemandeurUnite(TypeAssociationEXT newAPourDemandeurUnite) {
		if (newAPourDemandeurUnite != aPourDemandeurUnite) {
			NotificationChain msgs = null;
			if (aPourDemandeurUnite != null)
				msgs = ((InternalEObject)aPourDemandeurUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DEMANDE_TIR__APOUR_DEMANDEUR_UNITE, null, msgs);
			if (newAPourDemandeurUnite != null)
				msgs = ((InternalEObject)newAPourDemandeurUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DEMANDE_TIR__APOUR_DEMANDEUR_UNITE, null, msgs);
			msgs = basicSetAPourDemandeurUnite(newAPourDemandeurUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEMANDE_TIR__APOUR_DEMANDEUR_UNITE, newAPourDemandeurUnite, newAPourDemandeurUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getACommeDirectiveDirectiveTir() {
		if (aCommeDirectiveDirectiveTir == null) {
			aCommeDirectiveDirectiveTir = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_DEMANDE_TIR__ACOMME_DIRECTIVE_DIRECTIVE_TIR);
		}
		return aCommeDirectiveDirectiveTir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourCompteRenduCompteRenduTir() {
		if (aPourCompteRenduCompteRenduTir == null) {
			aPourCompteRenduCompteRenduTir = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_DEMANDE_TIR__APOUR_COMPTE_RENDU_COMPTE_RENDU_TIR);
		}
		return aPourCompteRenduCompteRenduTir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDemandeEngagementObjectif getAPourCaracteristiquesDemandeEngagementObjectif() {
		return aPourCaracteristiquesDemandeEngagementObjectif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourCaracteristiquesDemandeEngagementObjectif(TypeDemandeEngagementObjectif newAPourCaracteristiquesDemandeEngagementObjectif, NotificationChain msgs) {
		TypeDemandeEngagementObjectif oldAPourCaracteristiquesDemandeEngagementObjectif = aPourCaracteristiquesDemandeEngagementObjectif;
		aPourCaracteristiquesDemandeEngagementObjectif = newAPourCaracteristiquesDemandeEngagementObjectif;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEMANDE_TIR__APOUR_CARACTERISTIQUES_DEMANDE_ENGAGEMENT_OBJECTIF, oldAPourCaracteristiquesDemandeEngagementObjectif, newAPourCaracteristiquesDemandeEngagementObjectif);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourCaracteristiquesDemandeEngagementObjectif(TypeDemandeEngagementObjectif newAPourCaracteristiquesDemandeEngagementObjectif) {
		if (newAPourCaracteristiquesDemandeEngagementObjectif != aPourCaracteristiquesDemandeEngagementObjectif) {
			NotificationChain msgs = null;
			if (aPourCaracteristiquesDemandeEngagementObjectif != null)
				msgs = ((InternalEObject)aPourCaracteristiquesDemandeEngagementObjectif).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DEMANDE_TIR__APOUR_CARACTERISTIQUES_DEMANDE_ENGAGEMENT_OBJECTIF, null, msgs);
			if (newAPourCaracteristiquesDemandeEngagementObjectif != null)
				msgs = ((InternalEObject)newAPourCaracteristiquesDemandeEngagementObjectif).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DEMANDE_TIR__APOUR_CARACTERISTIQUES_DEMANDE_ENGAGEMENT_OBJECTIF, null, msgs);
			msgs = basicSetAPourCaracteristiquesDemandeEngagementObjectif(newAPourCaracteristiquesDemandeEngagementObjectif, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEMANDE_TIR__APOUR_CARACTERISTIQUES_DEMANDE_ENGAGEMENT_OBJECTIF, newAPourCaracteristiquesDemandeEngagementObjectif, newAPourCaracteristiquesDemandeEngagementObjectif));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_DEMANDE_TIR__APOUR_DEMANDEUR_UNITE:
				return basicSetAPourDemandeurUnite(null, msgs);
			case SchemaPackage.TYPE_DEMANDE_TIR__ACOMME_DIRECTIVE_DIRECTIVE_TIR:
				return ((InternalEList<?>)getACommeDirectiveDirectiveTir()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_DEMANDE_TIR__APOUR_COMPTE_RENDU_COMPTE_RENDU_TIR:
				return ((InternalEList<?>)getAPourCompteRenduCompteRenduTir()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_DEMANDE_TIR__APOUR_CARACTERISTIQUES_DEMANDE_ENGAGEMENT_OBJECTIF:
				return basicSetAPourCaracteristiquesDemandeEngagementObjectif(null, msgs);
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
			case SchemaPackage.TYPE_DEMANDE_TIR__NUMERO_DEMANDE:
				return getNumeroDemande();
			case SchemaPackage.TYPE_DEMANDE_TIR__GD_HCREATION:
				return getGDHcreation();
			case SchemaPackage.TYPE_DEMANDE_TIR__APOUR_DEMANDEUR_UNITE:
				return getAPourDemandeurUnite();
			case SchemaPackage.TYPE_DEMANDE_TIR__ACOMME_DIRECTIVE_DIRECTIVE_TIR:
				return getACommeDirectiveDirectiveTir();
			case SchemaPackage.TYPE_DEMANDE_TIR__APOUR_COMPTE_RENDU_COMPTE_RENDU_TIR:
				return getAPourCompteRenduCompteRenduTir();
			case SchemaPackage.TYPE_DEMANDE_TIR__APOUR_CARACTERISTIQUES_DEMANDE_ENGAGEMENT_OBJECTIF:
				return getAPourCaracteristiquesDemandeEngagementObjectif();
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
			case SchemaPackage.TYPE_DEMANDE_TIR__NUMERO_DEMANDE:
				setNumeroDemande((String)newValue);
				return;
			case SchemaPackage.TYPE_DEMANDE_TIR__GD_HCREATION:
				setGDHcreation((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_DEMANDE_TIR__APOUR_DEMANDEUR_UNITE:
				setAPourDemandeurUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_DEMANDE_TIR__ACOMME_DIRECTIVE_DIRECTIVE_TIR:
				getACommeDirectiveDirectiveTir().clear();
				getACommeDirectiveDirectiveTir().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_DEMANDE_TIR__APOUR_COMPTE_RENDU_COMPTE_RENDU_TIR:
				getAPourCompteRenduCompteRenduTir().clear();
				getAPourCompteRenduCompteRenduTir().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_DEMANDE_TIR__APOUR_CARACTERISTIQUES_DEMANDE_ENGAGEMENT_OBJECTIF:
				setAPourCaracteristiquesDemandeEngagementObjectif((TypeDemandeEngagementObjectif)newValue);
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
			case SchemaPackage.TYPE_DEMANDE_TIR__NUMERO_DEMANDE:
				setNumeroDemande(NUMERO_DEMANDE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DEMANDE_TIR__GD_HCREATION:
				setGDHcreation(GD_HCREATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DEMANDE_TIR__APOUR_DEMANDEUR_UNITE:
				setAPourDemandeurUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_DEMANDE_TIR__ACOMME_DIRECTIVE_DIRECTIVE_TIR:
				getACommeDirectiveDirectiveTir().clear();
				return;
			case SchemaPackage.TYPE_DEMANDE_TIR__APOUR_COMPTE_RENDU_COMPTE_RENDU_TIR:
				getAPourCompteRenduCompteRenduTir().clear();
				return;
			case SchemaPackage.TYPE_DEMANDE_TIR__APOUR_CARACTERISTIQUES_DEMANDE_ENGAGEMENT_OBJECTIF:
				setAPourCaracteristiquesDemandeEngagementObjectif((TypeDemandeEngagementObjectif)null);
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
			case SchemaPackage.TYPE_DEMANDE_TIR__NUMERO_DEMANDE:
				return NUMERO_DEMANDE_EDEFAULT == null ? numeroDemande != null : !NUMERO_DEMANDE_EDEFAULT.equals(numeroDemande);
			case SchemaPackage.TYPE_DEMANDE_TIR__GD_HCREATION:
				return GD_HCREATION_EDEFAULT == null ? gDHcreation != null : !GD_HCREATION_EDEFAULT.equals(gDHcreation);
			case SchemaPackage.TYPE_DEMANDE_TIR__APOUR_DEMANDEUR_UNITE:
				return aPourDemandeurUnite != null;
			case SchemaPackage.TYPE_DEMANDE_TIR__ACOMME_DIRECTIVE_DIRECTIVE_TIR:
				return aCommeDirectiveDirectiveTir != null && !aCommeDirectiveDirectiveTir.isEmpty();
			case SchemaPackage.TYPE_DEMANDE_TIR__APOUR_COMPTE_RENDU_COMPTE_RENDU_TIR:
				return aPourCompteRenduCompteRenduTir != null && !aPourCompteRenduCompteRenduTir.isEmpty();
			case SchemaPackage.TYPE_DEMANDE_TIR__APOUR_CARACTERISTIQUES_DEMANDE_ENGAGEMENT_OBJECTIF:
				return aPourCaracteristiquesDemandeEngagementObjectif != null;
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
		result.append(" (numeroDemande: ");
		result.append(numeroDemande);
		result.append(", gDHcreation: ");
		result.append(gDHcreation);
		result.append(')');
		return result.toString();
	}

} //TypeDemandeTirImpl
