/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCompteRenduTir;
import mpia.schema.TypeDictionaryDicoCompteRenduTirCauseRefusTir;
import mpia.schema.TypeDictionaryDicoCompteRenduTirEtatSalve;
import mpia.schema.TypeDictionaryDicoCompteRenduTirTypeCR;
import mpia.schema.TypeDictionaryDicoCompteRenduTirValeurCRtir;
import mpia.schema.TypeVolumeMunitionsASS;

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
 * An implementation of the model object '<em><b>Type Compte Rendu Tir</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCompteRenduTirImpl#getTypeCR <em>Type CR</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCompteRenduTirImpl#getValeurCRtir <em>Valeur CRtir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCompteRenduTirImpl#getCauseRefusTir <em>Cause Refus Tir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCompteRenduTirImpl#getEtatSalve <em>Etat Salve</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCompteRenduTirImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCompteRenduTirImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCompteRenduTirImpl#getAPourEmetteurUnite <em>APour Emetteur Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCompteRenduTirImpl#getConcerneDemandeTir <em>Concerne Demande Tir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCompteRenduTirImpl#getConcerneDirectiveTir <em>Concerne Directive Tir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCompteRenduTirImpl#getAPourConsommationVolumeMunitionsASS <em>APour Consommation Volume Munitions ASS</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCompteRenduTirImpl extends EObjectImpl implements TypeCompteRenduTir {
	/**
	 * The default value of the '{@link #getTypeCR() <em>Type CR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCR()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCompteRenduTirTypeCR TYPE_CR_EDEFAULT = TypeDictionaryDicoCompteRenduTirTypeCR.INTER;

	/**
	 * The cached value of the '{@link #getTypeCR() <em>Type CR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCR()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCompteRenduTirTypeCR typeCR = TYPE_CR_EDEFAULT;

	/**
	 * This is true if the Type CR attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeCRESet;

	/**
	 * The default value of the '{@link #getValeurCRtir() <em>Valeur CRtir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeurCRtir()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCompteRenduTirValeurCRtir VALEUR_CRTIR_EDEFAULT = TypeDictionaryDicoCompteRenduTirValeurCRtir.STAT;

	/**
	 * The cached value of the '{@link #getValeurCRtir() <em>Valeur CRtir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeurCRtir()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCompteRenduTirValeurCRtir valeurCRtir = VALEUR_CRTIR_EDEFAULT;

	/**
	 * This is true if the Valeur CRtir attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valeurCRtirESet;

	/**
	 * The default value of the '{@link #getCauseRefusTir() <em>Cause Refus Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCauseRefusTir()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCompteRenduTirCauseRefusTir CAUSE_REFUS_TIR_EDEFAULT = TypeDictionaryDicoCompteRenduTirCauseRefusTir.NONENG;

	/**
	 * The cached value of the '{@link #getCauseRefusTir() <em>Cause Refus Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCauseRefusTir()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCompteRenduTirCauseRefusTir causeRefusTir = CAUSE_REFUS_TIR_EDEFAULT;

	/**
	 * This is true if the Cause Refus Tir attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean causeRefusTirESet;

	/**
	 * The default value of the '{@link #getEtatSalve() <em>Etat Salve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatSalve()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCompteRenduTirEtatSalve ETAT_SALVE_EDEFAULT = TypeDictionaryDicoCompteRenduTirEtatSalve.ENGAGE;

	/**
	 * The cached value of the '{@link #getEtatSalve() <em>Etat Salve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatSalve()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCompteRenduTirEtatSalve etatSalve = ETAT_SALVE_EDEFAULT;

	/**
	 * This is true if the Etat Salve attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean etatSalveESet;

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
	 * The cached value of the '{@link #getAPourEmetteurUnite() <em>APour Emetteur Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourEmetteurUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourEmetteurUnite;

	/**
	 * The cached value of the '{@link #getConcerneDemandeTir() <em>Concerne Demande Tir</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneDemandeTir()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation concerneDemandeTir;

	/**
	 * The cached value of the '{@link #getConcerneDirectiveTir() <em>Concerne Directive Tir</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneDirectiveTir()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation concerneDirectiveTir;

	/**
	 * The cached value of the '{@link #getAPourConsommationVolumeMunitionsASS() <em>APour Consommation Volume Munitions ASS</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourConsommationVolumeMunitionsASS()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeVolumeMunitionsASS> aPourConsommationVolumeMunitionsASS;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCompteRenduTirImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCompteRenduTir();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCompteRenduTirTypeCR getTypeCR() {
		return typeCR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeCR(TypeDictionaryDicoCompteRenduTirTypeCR newTypeCR) {
		TypeDictionaryDicoCompteRenduTirTypeCR oldTypeCR = typeCR;
		typeCR = newTypeCR == null ? TYPE_CR_EDEFAULT : newTypeCR;
		boolean oldTypeCRESet = typeCRESet;
		typeCRESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPTE_RENDU_TIR__TYPE_CR, oldTypeCR, typeCR, !oldTypeCRESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeCR() {
		TypeDictionaryDicoCompteRenduTirTypeCR oldTypeCR = typeCR;
		boolean oldTypeCRESet = typeCRESet;
		typeCR = TYPE_CR_EDEFAULT;
		typeCRESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_COMPTE_RENDU_TIR__TYPE_CR, oldTypeCR, TYPE_CR_EDEFAULT, oldTypeCRESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeCR() {
		return typeCRESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCompteRenduTirValeurCRtir getValeurCRtir() {
		return valeurCRtir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValeurCRtir(TypeDictionaryDicoCompteRenduTirValeurCRtir newValeurCRtir) {
		TypeDictionaryDicoCompteRenduTirValeurCRtir oldValeurCRtir = valeurCRtir;
		valeurCRtir = newValeurCRtir == null ? VALEUR_CRTIR_EDEFAULT : newValeurCRtir;
		boolean oldValeurCRtirESet = valeurCRtirESet;
		valeurCRtirESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPTE_RENDU_TIR__VALEUR_CRTIR, oldValeurCRtir, valeurCRtir, !oldValeurCRtirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValeurCRtir() {
		TypeDictionaryDicoCompteRenduTirValeurCRtir oldValeurCRtir = valeurCRtir;
		boolean oldValeurCRtirESet = valeurCRtirESet;
		valeurCRtir = VALEUR_CRTIR_EDEFAULT;
		valeurCRtirESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_COMPTE_RENDU_TIR__VALEUR_CRTIR, oldValeurCRtir, VALEUR_CRTIR_EDEFAULT, oldValeurCRtirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValeurCRtir() {
		return valeurCRtirESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCompteRenduTirCauseRefusTir getCauseRefusTir() {
		return causeRefusTir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCauseRefusTir(TypeDictionaryDicoCompteRenduTirCauseRefusTir newCauseRefusTir) {
		TypeDictionaryDicoCompteRenduTirCauseRefusTir oldCauseRefusTir = causeRefusTir;
		causeRefusTir = newCauseRefusTir == null ? CAUSE_REFUS_TIR_EDEFAULT : newCauseRefusTir;
		boolean oldCauseRefusTirESet = causeRefusTirESet;
		causeRefusTirESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPTE_RENDU_TIR__CAUSE_REFUS_TIR, oldCauseRefusTir, causeRefusTir, !oldCauseRefusTirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCauseRefusTir() {
		TypeDictionaryDicoCompteRenduTirCauseRefusTir oldCauseRefusTir = causeRefusTir;
		boolean oldCauseRefusTirESet = causeRefusTirESet;
		causeRefusTir = CAUSE_REFUS_TIR_EDEFAULT;
		causeRefusTirESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_COMPTE_RENDU_TIR__CAUSE_REFUS_TIR, oldCauseRefusTir, CAUSE_REFUS_TIR_EDEFAULT, oldCauseRefusTirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCauseRefusTir() {
		return causeRefusTirESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCompteRenduTirEtatSalve getEtatSalve() {
		return etatSalve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatSalve(TypeDictionaryDicoCompteRenduTirEtatSalve newEtatSalve) {
		TypeDictionaryDicoCompteRenduTirEtatSalve oldEtatSalve = etatSalve;
		etatSalve = newEtatSalve == null ? ETAT_SALVE_EDEFAULT : newEtatSalve;
		boolean oldEtatSalveESet = etatSalveESet;
		etatSalveESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPTE_RENDU_TIR__ETAT_SALVE, oldEtatSalve, etatSalve, !oldEtatSalveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEtatSalve() {
		TypeDictionaryDicoCompteRenduTirEtatSalve oldEtatSalve = etatSalve;
		boolean oldEtatSalveESet = etatSalveESet;
		etatSalve = ETAT_SALVE_EDEFAULT;
		etatSalveESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_COMPTE_RENDU_TIR__ETAT_SALVE, oldEtatSalve, ETAT_SALVE_EDEFAULT, oldEtatSalveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEtatSalve() {
		return etatSalveESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPTE_RENDU_TIR__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPTE_RENDU_TIR__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourEmetteurUnite() {
		return aPourEmetteurUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourEmetteurUnite(TypeAssociationEXT newAPourEmetteurUnite, NotificationChain msgs) {
		TypeAssociationEXT oldAPourEmetteurUnite = aPourEmetteurUnite;
		aPourEmetteurUnite = newAPourEmetteurUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPTE_RENDU_TIR__APOUR_EMETTEUR_UNITE, oldAPourEmetteurUnite, newAPourEmetteurUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourEmetteurUnite(TypeAssociationEXT newAPourEmetteurUnite) {
		if (newAPourEmetteurUnite != aPourEmetteurUnite) {
			NotificationChain msgs = null;
			if (aPourEmetteurUnite != null)
				msgs = ((InternalEObject)aPourEmetteurUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_COMPTE_RENDU_TIR__APOUR_EMETTEUR_UNITE, null, msgs);
			if (newAPourEmetteurUnite != null)
				msgs = ((InternalEObject)newAPourEmetteurUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_COMPTE_RENDU_TIR__APOUR_EMETTEUR_UNITE, null, msgs);
			msgs = basicSetAPourEmetteurUnite(newAPourEmetteurUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPTE_RENDU_TIR__APOUR_EMETTEUR_UNITE, newAPourEmetteurUnite, newAPourEmetteurUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getConcerneDemandeTir() {
		return concerneDemandeTir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcerneDemandeTir(TypeAssociation newConcerneDemandeTir, NotificationChain msgs) {
		TypeAssociation oldConcerneDemandeTir = concerneDemandeTir;
		concerneDemandeTir = newConcerneDemandeTir;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPTE_RENDU_TIR__CONCERNE_DEMANDE_TIR, oldConcerneDemandeTir, newConcerneDemandeTir);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcerneDemandeTir(TypeAssociation newConcerneDemandeTir) {
		if (newConcerneDemandeTir != concerneDemandeTir) {
			NotificationChain msgs = null;
			if (concerneDemandeTir != null)
				msgs = ((InternalEObject)concerneDemandeTir).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_COMPTE_RENDU_TIR__CONCERNE_DEMANDE_TIR, null, msgs);
			if (newConcerneDemandeTir != null)
				msgs = ((InternalEObject)newConcerneDemandeTir).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_COMPTE_RENDU_TIR__CONCERNE_DEMANDE_TIR, null, msgs);
			msgs = basicSetConcerneDemandeTir(newConcerneDemandeTir, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPTE_RENDU_TIR__CONCERNE_DEMANDE_TIR, newConcerneDemandeTir, newConcerneDemandeTir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getConcerneDirectiveTir() {
		return concerneDirectiveTir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcerneDirectiveTir(TypeAssociation newConcerneDirectiveTir, NotificationChain msgs) {
		TypeAssociation oldConcerneDirectiveTir = concerneDirectiveTir;
		concerneDirectiveTir = newConcerneDirectiveTir;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPTE_RENDU_TIR__CONCERNE_DIRECTIVE_TIR, oldConcerneDirectiveTir, newConcerneDirectiveTir);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcerneDirectiveTir(TypeAssociation newConcerneDirectiveTir) {
		if (newConcerneDirectiveTir != concerneDirectiveTir) {
			NotificationChain msgs = null;
			if (concerneDirectiveTir != null)
				msgs = ((InternalEObject)concerneDirectiveTir).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_COMPTE_RENDU_TIR__CONCERNE_DIRECTIVE_TIR, null, msgs);
			if (newConcerneDirectiveTir != null)
				msgs = ((InternalEObject)newConcerneDirectiveTir).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_COMPTE_RENDU_TIR__CONCERNE_DIRECTIVE_TIR, null, msgs);
			msgs = basicSetConcerneDirectiveTir(newConcerneDirectiveTir, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPTE_RENDU_TIR__CONCERNE_DIRECTIVE_TIR, newConcerneDirectiveTir, newConcerneDirectiveTir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeVolumeMunitionsASS> getAPourConsommationVolumeMunitionsASS() {
		if (aPourConsommationVolumeMunitionsASS == null) {
			aPourConsommationVolumeMunitionsASS = new EObjectContainmentEList<TypeVolumeMunitionsASS>(TypeVolumeMunitionsASS.class, this, SchemaPackage.TYPE_COMPTE_RENDU_TIR__APOUR_CONSOMMATION_VOLUME_MUNITIONS_ASS);
		}
		return aPourConsommationVolumeMunitionsASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_COMPTE_RENDU_TIR__APOUR_EMETTEUR_UNITE:
				return basicSetAPourEmetteurUnite(null, msgs);
			case SchemaPackage.TYPE_COMPTE_RENDU_TIR__CONCERNE_DEMANDE_TIR:
				return basicSetConcerneDemandeTir(null, msgs);
			case SchemaPackage.TYPE_COMPTE_RENDU_TIR__CONCERNE_DIRECTIVE_TIR:
				return basicSetConcerneDirectiveTir(null, msgs);
			case SchemaPackage.TYPE_COMPTE_RENDU_TIR__APOUR_CONSOMMATION_VOLUME_MUNITIONS_ASS:
				return ((InternalEList<?>)getAPourConsommationVolumeMunitionsASS()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_COMPTE_RENDU_TIR__TYPE_CR:
				return getTypeCR();
			case SchemaPackage.TYPE_COMPTE_RENDU_TIR__VALEUR_CRTIR:
				return getValeurCRtir();
			case SchemaPackage.TYPE_COMPTE_RENDU_TIR__CAUSE_REFUS_TIR:
				return getCauseRefusTir();
			case SchemaPackage.TYPE_COMPTE_RENDU_TIR__ETAT_SALVE:
				return getEtatSalve();
			case SchemaPackage.TYPE_COMPTE_RENDU_TIR__CTE:
				return getCTE();
			case SchemaPackage.TYPE_COMPTE_RENDU_TIR__CE:
				return getCE();
			case SchemaPackage.TYPE_COMPTE_RENDU_TIR__APOUR_EMETTEUR_UNITE:
				return getAPourEmetteurUnite();
			case SchemaPackage.TYPE_COMPTE_RENDU_TIR__CONCERNE_DEMANDE_TIR:
				return getConcerneDemandeTir();
			case SchemaPackage.TYPE_COMPTE_RENDU_TIR__CONCERNE_DIRECTIVE_TIR:
				return getConcerneDirectiveTir();
			case SchemaPackage.TYPE_COMPTE_RENDU_TIR__APOUR_CONSOMMATION_VOLUME_MUNITIONS_ASS:
				return getAPourConsommationVolumeMunitionsASS();
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
			case SchemaPackage.TYPE_COMPTE_RENDU_TIR__TYPE_CR:
				setTypeCR((TypeDictionaryDicoCompteRenduTirTypeCR)newValue);
				return;
			case SchemaPackage.TYPE_COMPTE_RENDU_TIR__VALEUR_CRTIR:
				setValeurCRtir((TypeDictionaryDicoCompteRenduTirValeurCRtir)newValue);
				return;
			case SchemaPackage.TYPE_COMPTE_RENDU_TIR__CAUSE_REFUS_TIR:
				setCauseRefusTir((TypeDictionaryDicoCompteRenduTirCauseRefusTir)newValue);
				return;
			case SchemaPackage.TYPE_COMPTE_RENDU_TIR__ETAT_SALVE:
				setEtatSalve((TypeDictionaryDicoCompteRenduTirEtatSalve)newValue);
				return;
			case SchemaPackage.TYPE_COMPTE_RENDU_TIR__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_COMPTE_RENDU_TIR__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_COMPTE_RENDU_TIR__APOUR_EMETTEUR_UNITE:
				setAPourEmetteurUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_COMPTE_RENDU_TIR__CONCERNE_DEMANDE_TIR:
				setConcerneDemandeTir((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_COMPTE_RENDU_TIR__CONCERNE_DIRECTIVE_TIR:
				setConcerneDirectiveTir((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_COMPTE_RENDU_TIR__APOUR_CONSOMMATION_VOLUME_MUNITIONS_ASS:
				getAPourConsommationVolumeMunitionsASS().clear();
				getAPourConsommationVolumeMunitionsASS().addAll((Collection<? extends TypeVolumeMunitionsASS>)newValue);
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
			case SchemaPackage.TYPE_COMPTE_RENDU_TIR__TYPE_CR:
				unsetTypeCR();
				return;
			case SchemaPackage.TYPE_COMPTE_RENDU_TIR__VALEUR_CRTIR:
				unsetValeurCRtir();
				return;
			case SchemaPackage.TYPE_COMPTE_RENDU_TIR__CAUSE_REFUS_TIR:
				unsetCauseRefusTir();
				return;
			case SchemaPackage.TYPE_COMPTE_RENDU_TIR__ETAT_SALVE:
				unsetEtatSalve();
				return;
			case SchemaPackage.TYPE_COMPTE_RENDU_TIR__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_COMPTE_RENDU_TIR__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_COMPTE_RENDU_TIR__APOUR_EMETTEUR_UNITE:
				setAPourEmetteurUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_COMPTE_RENDU_TIR__CONCERNE_DEMANDE_TIR:
				setConcerneDemandeTir((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_COMPTE_RENDU_TIR__CONCERNE_DIRECTIVE_TIR:
				setConcerneDirectiveTir((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_COMPTE_RENDU_TIR__APOUR_CONSOMMATION_VOLUME_MUNITIONS_ASS:
				getAPourConsommationVolumeMunitionsASS().clear();
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
			case SchemaPackage.TYPE_COMPTE_RENDU_TIR__TYPE_CR:
				return isSetTypeCR();
			case SchemaPackage.TYPE_COMPTE_RENDU_TIR__VALEUR_CRTIR:
				return isSetValeurCRtir();
			case SchemaPackage.TYPE_COMPTE_RENDU_TIR__CAUSE_REFUS_TIR:
				return isSetCauseRefusTir();
			case SchemaPackage.TYPE_COMPTE_RENDU_TIR__ETAT_SALVE:
				return isSetEtatSalve();
			case SchemaPackage.TYPE_COMPTE_RENDU_TIR__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_COMPTE_RENDU_TIR__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_COMPTE_RENDU_TIR__APOUR_EMETTEUR_UNITE:
				return aPourEmetteurUnite != null;
			case SchemaPackage.TYPE_COMPTE_RENDU_TIR__CONCERNE_DEMANDE_TIR:
				return concerneDemandeTir != null;
			case SchemaPackage.TYPE_COMPTE_RENDU_TIR__CONCERNE_DIRECTIVE_TIR:
				return concerneDirectiveTir != null;
			case SchemaPackage.TYPE_COMPTE_RENDU_TIR__APOUR_CONSOMMATION_VOLUME_MUNITIONS_ASS:
				return aPourConsommationVolumeMunitionsASS != null && !aPourConsommationVolumeMunitionsASS.isEmpty();
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
		result.append(" (typeCR: ");
		if (typeCRESet) result.append(typeCR); else result.append("<unset>");
		result.append(", valeurCRtir: ");
		if (valeurCRtirESet) result.append(valeurCRtir); else result.append("<unset>");
		result.append(", causeRefusTir: ");
		if (causeRefusTirESet) result.append(causeRefusTir); else result.append("<unset>");
		result.append(", etatSalve: ");
		if (etatSalveESet) result.append(etatSalve); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeCompteRenduTirImpl
