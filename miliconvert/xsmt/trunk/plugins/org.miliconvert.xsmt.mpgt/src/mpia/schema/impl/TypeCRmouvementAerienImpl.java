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
import mpia.schema.TypeAutonomieModule;
import mpia.schema.TypeBilanModule;
import mpia.schema.TypeCRmouvementAerien;
import mpia.schema.TypePassageModule;
import mpia.schema.TypePotentielAeronef;

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
 * An implementation of the model object '<em><b>Type CRmouvement Aerien</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCRmouvementAerienImpl#getGDHredaction <em>GD Hredaction</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCRmouvementAerienImpl#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCRmouvementAerienImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCRmouvementAerienImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCRmouvementAerienImpl#getAEteEmisParUnite <em>AEte Emis Par Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCRmouvementAerienImpl#getRendCompteBilansModulesBilanModule <em>Rend Compte Bilans Modules Bilan Module</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCRmouvementAerienImpl#getRendComptePotentielsAeronefPotentielAeronef <em>Rend Compte Potentiels Aeronef Potentiel Aeronef</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCRmouvementAerienImpl#getAutonomieModuleAutonomieModule <em>Autonomie Module Autonomie Module</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCRmouvementAerienImpl#getPassageModulePassageModule <em>Passage Module Passage Module</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCRmouvementAerienImpl#getRendCompteDecollageBilanModule <em>Rend Compte Decollage Bilan Module</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCRmouvementAerienImpl extends EObjectImpl implements TypeCRmouvementAerien {
	/**
	 * The default value of the '{@link #getGDHredaction() <em>GD Hredaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHredaction()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GD_HREDACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGDHredaction() <em>GD Hredaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHredaction()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gDHredaction = GD_HREDACTION_EDEFAULT;

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
	 * The cached value of the '{@link #getAEteEmisParUnite() <em>AEte Emis Par Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAEteEmisParUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aEteEmisParUnite;

	/**
	 * The cached value of the '{@link #getRendCompteBilansModulesBilanModule() <em>Rend Compte Bilans Modules Bilan Module</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRendCompteBilansModulesBilanModule()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeBilanModule> rendCompteBilansModulesBilanModule;

	/**
	 * The cached value of the '{@link #getRendComptePotentielsAeronefPotentielAeronef() <em>Rend Compte Potentiels Aeronef Potentiel Aeronef</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRendComptePotentielsAeronefPotentielAeronef()
	 * @generated
	 * @ordered
	 */
	protected EList<TypePotentielAeronef> rendComptePotentielsAeronefPotentielAeronef;

	/**
	 * The cached value of the '{@link #getAutonomieModuleAutonomieModule() <em>Autonomie Module Autonomie Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutonomieModuleAutonomieModule()
	 * @generated
	 * @ordered
	 */
	protected TypeAutonomieModule autonomieModuleAutonomieModule;

	/**
	 * The cached value of the '{@link #getPassageModulePassageModule() <em>Passage Module Passage Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassageModulePassageModule()
	 * @generated
	 * @ordered
	 */
	protected TypePassageModule passageModulePassageModule;

	/**
	 * The cached value of the '{@link #getRendCompteDecollageBilanModule() <em>Rend Compte Decollage Bilan Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRendCompteDecollageBilanModule()
	 * @generated
	 * @ordered
	 */
	protected TypeBilanModule rendCompteDecollageBilanModule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCRmouvementAerienImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCRmouvementAerien();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGDHredaction() {
		return gDHredaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGDHredaction(XMLGregorianCalendar newGDHredaction) {
		XMLGregorianCalendar oldGDHredaction = gDHredaction;
		gDHredaction = newGDHredaction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__GD_HREDACTION, oldGDHredaction, gDHredaction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__COMMENTAIRE, oldCommentaire, commentaire));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAEteEmisParUnite() {
		return aEteEmisParUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAEteEmisParUnite(TypeAssociationEXT newAEteEmisParUnite, NotificationChain msgs) {
		TypeAssociationEXT oldAEteEmisParUnite = aEteEmisParUnite;
		aEteEmisParUnite = newAEteEmisParUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__AETE_EMIS_PAR_UNITE, oldAEteEmisParUnite, newAEteEmisParUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAEteEmisParUnite(TypeAssociationEXT newAEteEmisParUnite) {
		if (newAEteEmisParUnite != aEteEmisParUnite) {
			NotificationChain msgs = null;
			if (aEteEmisParUnite != null)
				msgs = ((InternalEObject)aEteEmisParUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__AETE_EMIS_PAR_UNITE, null, msgs);
			if (newAEteEmisParUnite != null)
				msgs = ((InternalEObject)newAEteEmisParUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__AETE_EMIS_PAR_UNITE, null, msgs);
			msgs = basicSetAEteEmisParUnite(newAEteEmisParUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__AETE_EMIS_PAR_UNITE, newAEteEmisParUnite, newAEteEmisParUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeBilanModule> getRendCompteBilansModulesBilanModule() {
		if (rendCompteBilansModulesBilanModule == null) {
			rendCompteBilansModulesBilanModule = new EObjectContainmentEList<TypeBilanModule>(TypeBilanModule.class, this, SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__REND_COMPTE_BILANS_MODULES_BILAN_MODULE);
		}
		return rendCompteBilansModulesBilanModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePotentielAeronef> getRendComptePotentielsAeronefPotentielAeronef() {
		if (rendComptePotentielsAeronefPotentielAeronef == null) {
			rendComptePotentielsAeronefPotentielAeronef = new EObjectContainmentEList<TypePotentielAeronef>(TypePotentielAeronef.class, this, SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__REND_COMPTE_POTENTIELS_AERONEF_POTENTIEL_AERONEF);
		}
		return rendComptePotentielsAeronefPotentielAeronef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAutonomieModule getAutonomieModuleAutonomieModule() {
		return autonomieModuleAutonomieModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAutonomieModuleAutonomieModule(TypeAutonomieModule newAutonomieModuleAutonomieModule, NotificationChain msgs) {
		TypeAutonomieModule oldAutonomieModuleAutonomieModule = autonomieModuleAutonomieModule;
		autonomieModuleAutonomieModule = newAutonomieModuleAutonomieModule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__AUTONOMIE_MODULE_AUTONOMIE_MODULE, oldAutonomieModuleAutonomieModule, newAutonomieModuleAutonomieModule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutonomieModuleAutonomieModule(TypeAutonomieModule newAutonomieModuleAutonomieModule) {
		if (newAutonomieModuleAutonomieModule != autonomieModuleAutonomieModule) {
			NotificationChain msgs = null;
			if (autonomieModuleAutonomieModule != null)
				msgs = ((InternalEObject)autonomieModuleAutonomieModule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__AUTONOMIE_MODULE_AUTONOMIE_MODULE, null, msgs);
			if (newAutonomieModuleAutonomieModule != null)
				msgs = ((InternalEObject)newAutonomieModuleAutonomieModule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__AUTONOMIE_MODULE_AUTONOMIE_MODULE, null, msgs);
			msgs = basicSetAutonomieModuleAutonomieModule(newAutonomieModuleAutonomieModule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__AUTONOMIE_MODULE_AUTONOMIE_MODULE, newAutonomieModuleAutonomieModule, newAutonomieModuleAutonomieModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypePassageModule getPassageModulePassageModule() {
		return passageModulePassageModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPassageModulePassageModule(TypePassageModule newPassageModulePassageModule, NotificationChain msgs) {
		TypePassageModule oldPassageModulePassageModule = passageModulePassageModule;
		passageModulePassageModule = newPassageModulePassageModule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__PASSAGE_MODULE_PASSAGE_MODULE, oldPassageModulePassageModule, newPassageModulePassageModule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassageModulePassageModule(TypePassageModule newPassageModulePassageModule) {
		if (newPassageModulePassageModule != passageModulePassageModule) {
			NotificationChain msgs = null;
			if (passageModulePassageModule != null)
				msgs = ((InternalEObject)passageModulePassageModule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__PASSAGE_MODULE_PASSAGE_MODULE, null, msgs);
			if (newPassageModulePassageModule != null)
				msgs = ((InternalEObject)newPassageModulePassageModule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__PASSAGE_MODULE_PASSAGE_MODULE, null, msgs);
			msgs = basicSetPassageModulePassageModule(newPassageModulePassageModule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__PASSAGE_MODULE_PASSAGE_MODULE, newPassageModulePassageModule, newPassageModulePassageModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeBilanModule getRendCompteDecollageBilanModule() {
		return rendCompteDecollageBilanModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRendCompteDecollageBilanModule(TypeBilanModule newRendCompteDecollageBilanModule, NotificationChain msgs) {
		TypeBilanModule oldRendCompteDecollageBilanModule = rendCompteDecollageBilanModule;
		rendCompteDecollageBilanModule = newRendCompteDecollageBilanModule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__REND_COMPTE_DECOLLAGE_BILAN_MODULE, oldRendCompteDecollageBilanModule, newRendCompteDecollageBilanModule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRendCompteDecollageBilanModule(TypeBilanModule newRendCompteDecollageBilanModule) {
		if (newRendCompteDecollageBilanModule != rendCompteDecollageBilanModule) {
			NotificationChain msgs = null;
			if (rendCompteDecollageBilanModule != null)
				msgs = ((InternalEObject)rendCompteDecollageBilanModule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__REND_COMPTE_DECOLLAGE_BILAN_MODULE, null, msgs);
			if (newRendCompteDecollageBilanModule != null)
				msgs = ((InternalEObject)newRendCompteDecollageBilanModule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__REND_COMPTE_DECOLLAGE_BILAN_MODULE, null, msgs);
			msgs = basicSetRendCompteDecollageBilanModule(newRendCompteDecollageBilanModule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__REND_COMPTE_DECOLLAGE_BILAN_MODULE, newRendCompteDecollageBilanModule, newRendCompteDecollageBilanModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__AETE_EMIS_PAR_UNITE:
				return basicSetAEteEmisParUnite(null, msgs);
			case SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__REND_COMPTE_BILANS_MODULES_BILAN_MODULE:
				return ((InternalEList<?>)getRendCompteBilansModulesBilanModule()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__REND_COMPTE_POTENTIELS_AERONEF_POTENTIEL_AERONEF:
				return ((InternalEList<?>)getRendComptePotentielsAeronefPotentielAeronef()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__AUTONOMIE_MODULE_AUTONOMIE_MODULE:
				return basicSetAutonomieModuleAutonomieModule(null, msgs);
			case SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__PASSAGE_MODULE_PASSAGE_MODULE:
				return basicSetPassageModulePassageModule(null, msgs);
			case SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__REND_COMPTE_DECOLLAGE_BILAN_MODULE:
				return basicSetRendCompteDecollageBilanModule(null, msgs);
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
			case SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__GD_HREDACTION:
				return getGDHredaction();
			case SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__COMMENTAIRE:
				return getCommentaire();
			case SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__CTE:
				return getCTE();
			case SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__CE:
				return getCE();
			case SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__AETE_EMIS_PAR_UNITE:
				return getAEteEmisParUnite();
			case SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__REND_COMPTE_BILANS_MODULES_BILAN_MODULE:
				return getRendCompteBilansModulesBilanModule();
			case SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__REND_COMPTE_POTENTIELS_AERONEF_POTENTIEL_AERONEF:
				return getRendComptePotentielsAeronefPotentielAeronef();
			case SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__AUTONOMIE_MODULE_AUTONOMIE_MODULE:
				return getAutonomieModuleAutonomieModule();
			case SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__PASSAGE_MODULE_PASSAGE_MODULE:
				return getPassageModulePassageModule();
			case SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__REND_COMPTE_DECOLLAGE_BILAN_MODULE:
				return getRendCompteDecollageBilanModule();
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
			case SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__GD_HREDACTION:
				setGDHredaction((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__COMMENTAIRE:
				setCommentaire((String)newValue);
				return;
			case SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__AETE_EMIS_PAR_UNITE:
				setAEteEmisParUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__REND_COMPTE_BILANS_MODULES_BILAN_MODULE:
				getRendCompteBilansModulesBilanModule().clear();
				getRendCompteBilansModulesBilanModule().addAll((Collection<? extends TypeBilanModule>)newValue);
				return;
			case SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__REND_COMPTE_POTENTIELS_AERONEF_POTENTIEL_AERONEF:
				getRendComptePotentielsAeronefPotentielAeronef().clear();
				getRendComptePotentielsAeronefPotentielAeronef().addAll((Collection<? extends TypePotentielAeronef>)newValue);
				return;
			case SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__AUTONOMIE_MODULE_AUTONOMIE_MODULE:
				setAutonomieModuleAutonomieModule((TypeAutonomieModule)newValue);
				return;
			case SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__PASSAGE_MODULE_PASSAGE_MODULE:
				setPassageModulePassageModule((TypePassageModule)newValue);
				return;
			case SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__REND_COMPTE_DECOLLAGE_BILAN_MODULE:
				setRendCompteDecollageBilanModule((TypeBilanModule)newValue);
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
			case SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__GD_HREDACTION:
				setGDHredaction(GD_HREDACTION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__COMMENTAIRE:
				setCommentaire(COMMENTAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__AETE_EMIS_PAR_UNITE:
				setAEteEmisParUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__REND_COMPTE_BILANS_MODULES_BILAN_MODULE:
				getRendCompteBilansModulesBilanModule().clear();
				return;
			case SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__REND_COMPTE_POTENTIELS_AERONEF_POTENTIEL_AERONEF:
				getRendComptePotentielsAeronefPotentielAeronef().clear();
				return;
			case SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__AUTONOMIE_MODULE_AUTONOMIE_MODULE:
				setAutonomieModuleAutonomieModule((TypeAutonomieModule)null);
				return;
			case SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__PASSAGE_MODULE_PASSAGE_MODULE:
				setPassageModulePassageModule((TypePassageModule)null);
				return;
			case SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__REND_COMPTE_DECOLLAGE_BILAN_MODULE:
				setRendCompteDecollageBilanModule((TypeBilanModule)null);
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
			case SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__GD_HREDACTION:
				return GD_HREDACTION_EDEFAULT == null ? gDHredaction != null : !GD_HREDACTION_EDEFAULT.equals(gDHredaction);
			case SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__COMMENTAIRE:
				return COMMENTAIRE_EDEFAULT == null ? commentaire != null : !COMMENTAIRE_EDEFAULT.equals(commentaire);
			case SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__AETE_EMIS_PAR_UNITE:
				return aEteEmisParUnite != null;
			case SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__REND_COMPTE_BILANS_MODULES_BILAN_MODULE:
				return rendCompteBilansModulesBilanModule != null && !rendCompteBilansModulesBilanModule.isEmpty();
			case SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__REND_COMPTE_POTENTIELS_AERONEF_POTENTIEL_AERONEF:
				return rendComptePotentielsAeronefPotentielAeronef != null && !rendComptePotentielsAeronefPotentielAeronef.isEmpty();
			case SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__AUTONOMIE_MODULE_AUTONOMIE_MODULE:
				return autonomieModuleAutonomieModule != null;
			case SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__PASSAGE_MODULE_PASSAGE_MODULE:
				return passageModulePassageModule != null;
			case SchemaPackage.TYPE_CRMOUVEMENT_AERIEN__REND_COMPTE_DECOLLAGE_BILAN_MODULE:
				return rendCompteDecollageBilanModule != null;
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
		result.append(" (gDHredaction: ");
		result.append(gDHredaction);
		result.append(", commentaire: ");
		result.append(commentaire);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeCRmouvementAerienImpl
