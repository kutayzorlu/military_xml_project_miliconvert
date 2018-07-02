/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeDuree;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoEffetTactiqueASS;
import mpia.schema.TypeInterventionType;
import mpia.schema.TypeTypeObjectifASS;
import mpia.schema.TypeVolumeMunitionsASS;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Intervention Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeInterventionTypeImpl#getEffetRecherche <em>Effet Recherche</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeInterventionTypeImpl#getPourcentageDommagesRecherches <em>Pourcentage Dommages Recherches</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeInterventionTypeImpl#getDureeTraitement <em>Duree Traitement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeInterventionTypeImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeInterventionTypeImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeInterventionTypeImpl#getSAppliqueAuTypeObjectifTypeObjectifASS <em>SApplique Au Type Objectif Type Objectif ASS</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeInterventionTypeImpl#getImposeVolumeMunitionsASS <em>Impose Volume Munitions ASS</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeInterventionTypeImpl#getEstDefinieParPolitiqueTir <em>Est Definie Par Politique Tir</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeInterventionTypeImpl extends EObjectImpl implements TypeInterventionType {
	/**
	 * The default value of the '{@link #getEffetRecherche() <em>Effet Recherche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffetRecherche()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEffetTactiqueASS EFFET_RECHERCHE_EDEFAULT = TypeDictionaryDicoEffetTactiqueASS.NOS;

	/**
	 * The cached value of the '{@link #getEffetRecherche() <em>Effet Recherche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffetRecherche()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEffetTactiqueASS effetRecherche = EFFET_RECHERCHE_EDEFAULT;

	/**
	 * This is true if the Effet Recherche attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean effetRechercheESet;

	/**
	 * The default value of the '{@link #getPourcentageDommagesRecherches() <em>Pourcentage Dommages Recherches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPourcentageDommagesRecherches()
	 * @generated
	 * @ordered
	 */
	protected static final double POURCENTAGE_DOMMAGES_RECHERCHES_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPourcentageDommagesRecherches() <em>Pourcentage Dommages Recherches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPourcentageDommagesRecherches()
	 * @generated
	 * @ordered
	 */
	protected double pourcentageDommagesRecherches = POURCENTAGE_DOMMAGES_RECHERCHES_EDEFAULT;

	/**
	 * This is true if the Pourcentage Dommages Recherches attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pourcentageDommagesRecherchesESet;

	/**
	 * The cached value of the '{@link #getDureeTraitement() <em>Duree Traitement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDureeTraitement()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree dureeTraitement;

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
	 * The cached value of the '{@link #getSAppliqueAuTypeObjectifTypeObjectifASS() <em>SApplique Au Type Objectif Type Objectif ASS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAppliqueAuTypeObjectifTypeObjectifASS()
	 * @generated
	 * @ordered
	 */
	protected TypeTypeObjectifASS sAppliqueAuTypeObjectifTypeObjectifASS;

	/**
	 * The cached value of the '{@link #getImposeVolumeMunitionsASS() <em>Impose Volume Munitions ASS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImposeVolumeMunitionsASS()
	 * @generated
	 * @ordered
	 */
	protected TypeVolumeMunitionsASS imposeVolumeMunitionsASS;

	/**
	 * The cached value of the '{@link #getEstDefinieParPolitiqueTir() <em>Est Definie Par Politique Tir</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstDefinieParPolitiqueTir()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation estDefinieParPolitiqueTir;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeInterventionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeInterventionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEffetTactiqueASS getEffetRecherche() {
		return effetRecherche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffetRecherche(TypeDictionaryDicoEffetTactiqueASS newEffetRecherche) {
		TypeDictionaryDicoEffetTactiqueASS oldEffetRecherche = effetRecherche;
		effetRecherche = newEffetRecherche == null ? EFFET_RECHERCHE_EDEFAULT : newEffetRecherche;
		boolean oldEffetRechercheESet = effetRechercheESet;
		effetRechercheESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INTERVENTION_TYPE__EFFET_RECHERCHE, oldEffetRecherche, effetRecherche, !oldEffetRechercheESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEffetRecherche() {
		TypeDictionaryDicoEffetTactiqueASS oldEffetRecherche = effetRecherche;
		boolean oldEffetRechercheESet = effetRechercheESet;
		effetRecherche = EFFET_RECHERCHE_EDEFAULT;
		effetRechercheESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_INTERVENTION_TYPE__EFFET_RECHERCHE, oldEffetRecherche, EFFET_RECHERCHE_EDEFAULT, oldEffetRechercheESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEffetRecherche() {
		return effetRechercheESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPourcentageDommagesRecherches() {
		return pourcentageDommagesRecherches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPourcentageDommagesRecherches(double newPourcentageDommagesRecherches) {
		double oldPourcentageDommagesRecherches = pourcentageDommagesRecherches;
		pourcentageDommagesRecherches = newPourcentageDommagesRecherches;
		boolean oldPourcentageDommagesRecherchesESet = pourcentageDommagesRecherchesESet;
		pourcentageDommagesRecherchesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INTERVENTION_TYPE__POURCENTAGE_DOMMAGES_RECHERCHES, oldPourcentageDommagesRecherches, pourcentageDommagesRecherches, !oldPourcentageDommagesRecherchesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPourcentageDommagesRecherches() {
		double oldPourcentageDommagesRecherches = pourcentageDommagesRecherches;
		boolean oldPourcentageDommagesRecherchesESet = pourcentageDommagesRecherchesESet;
		pourcentageDommagesRecherches = POURCENTAGE_DOMMAGES_RECHERCHES_EDEFAULT;
		pourcentageDommagesRecherchesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_INTERVENTION_TYPE__POURCENTAGE_DOMMAGES_RECHERCHES, oldPourcentageDommagesRecherches, POURCENTAGE_DOMMAGES_RECHERCHES_EDEFAULT, oldPourcentageDommagesRecherchesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPourcentageDommagesRecherches() {
		return pourcentageDommagesRecherchesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getDureeTraitement() {
		return dureeTraitement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDureeTraitement(TypeDataTypeDuree newDureeTraitement, NotificationChain msgs) {
		TypeDataTypeDuree oldDureeTraitement = dureeTraitement;
		dureeTraitement = newDureeTraitement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INTERVENTION_TYPE__DUREE_TRAITEMENT, oldDureeTraitement, newDureeTraitement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDureeTraitement(TypeDataTypeDuree newDureeTraitement) {
		if (newDureeTraitement != dureeTraitement) {
			NotificationChain msgs = null;
			if (dureeTraitement != null)
				msgs = ((InternalEObject)dureeTraitement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_INTERVENTION_TYPE__DUREE_TRAITEMENT, null, msgs);
			if (newDureeTraitement != null)
				msgs = ((InternalEObject)newDureeTraitement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_INTERVENTION_TYPE__DUREE_TRAITEMENT, null, msgs);
			msgs = basicSetDureeTraitement(newDureeTraitement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INTERVENTION_TYPE__DUREE_TRAITEMENT, newDureeTraitement, newDureeTraitement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INTERVENTION_TYPE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INTERVENTION_TYPE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeTypeObjectifASS getSAppliqueAuTypeObjectifTypeObjectifASS() {
		return sAppliqueAuTypeObjectifTypeObjectifASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSAppliqueAuTypeObjectifTypeObjectifASS(TypeTypeObjectifASS newSAppliqueAuTypeObjectifTypeObjectifASS, NotificationChain msgs) {
		TypeTypeObjectifASS oldSAppliqueAuTypeObjectifTypeObjectifASS = sAppliqueAuTypeObjectifTypeObjectifASS;
		sAppliqueAuTypeObjectifTypeObjectifASS = newSAppliqueAuTypeObjectifTypeObjectifASS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INTERVENTION_TYPE__SAPPLIQUE_AU_TYPE_OBJECTIF_TYPE_OBJECTIF_ASS, oldSAppliqueAuTypeObjectifTypeObjectifASS, newSAppliqueAuTypeObjectifTypeObjectifASS);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSAppliqueAuTypeObjectifTypeObjectifASS(TypeTypeObjectifASS newSAppliqueAuTypeObjectifTypeObjectifASS) {
		if (newSAppliqueAuTypeObjectifTypeObjectifASS != sAppliqueAuTypeObjectifTypeObjectifASS) {
			NotificationChain msgs = null;
			if (sAppliqueAuTypeObjectifTypeObjectifASS != null)
				msgs = ((InternalEObject)sAppliqueAuTypeObjectifTypeObjectifASS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_INTERVENTION_TYPE__SAPPLIQUE_AU_TYPE_OBJECTIF_TYPE_OBJECTIF_ASS, null, msgs);
			if (newSAppliqueAuTypeObjectifTypeObjectifASS != null)
				msgs = ((InternalEObject)newSAppliqueAuTypeObjectifTypeObjectifASS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_INTERVENTION_TYPE__SAPPLIQUE_AU_TYPE_OBJECTIF_TYPE_OBJECTIF_ASS, null, msgs);
			msgs = basicSetSAppliqueAuTypeObjectifTypeObjectifASS(newSAppliqueAuTypeObjectifTypeObjectifASS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INTERVENTION_TYPE__SAPPLIQUE_AU_TYPE_OBJECTIF_TYPE_OBJECTIF_ASS, newSAppliqueAuTypeObjectifTypeObjectifASS, newSAppliqueAuTypeObjectifTypeObjectifASS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeVolumeMunitionsASS getImposeVolumeMunitionsASS() {
		return imposeVolumeMunitionsASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImposeVolumeMunitionsASS(TypeVolumeMunitionsASS newImposeVolumeMunitionsASS, NotificationChain msgs) {
		TypeVolumeMunitionsASS oldImposeVolumeMunitionsASS = imposeVolumeMunitionsASS;
		imposeVolumeMunitionsASS = newImposeVolumeMunitionsASS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INTERVENTION_TYPE__IMPOSE_VOLUME_MUNITIONS_ASS, oldImposeVolumeMunitionsASS, newImposeVolumeMunitionsASS);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImposeVolumeMunitionsASS(TypeVolumeMunitionsASS newImposeVolumeMunitionsASS) {
		if (newImposeVolumeMunitionsASS != imposeVolumeMunitionsASS) {
			NotificationChain msgs = null;
			if (imposeVolumeMunitionsASS != null)
				msgs = ((InternalEObject)imposeVolumeMunitionsASS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_INTERVENTION_TYPE__IMPOSE_VOLUME_MUNITIONS_ASS, null, msgs);
			if (newImposeVolumeMunitionsASS != null)
				msgs = ((InternalEObject)newImposeVolumeMunitionsASS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_INTERVENTION_TYPE__IMPOSE_VOLUME_MUNITIONS_ASS, null, msgs);
			msgs = basicSetImposeVolumeMunitionsASS(newImposeVolumeMunitionsASS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INTERVENTION_TYPE__IMPOSE_VOLUME_MUNITIONS_ASS, newImposeVolumeMunitionsASS, newImposeVolumeMunitionsASS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getEstDefinieParPolitiqueTir() {
		return estDefinieParPolitiqueTir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstDefinieParPolitiqueTir(TypeAssociation newEstDefinieParPolitiqueTir, NotificationChain msgs) {
		TypeAssociation oldEstDefinieParPolitiqueTir = estDefinieParPolitiqueTir;
		estDefinieParPolitiqueTir = newEstDefinieParPolitiqueTir;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INTERVENTION_TYPE__EST_DEFINIE_PAR_POLITIQUE_TIR, oldEstDefinieParPolitiqueTir, newEstDefinieParPolitiqueTir);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstDefinieParPolitiqueTir(TypeAssociation newEstDefinieParPolitiqueTir) {
		if (newEstDefinieParPolitiqueTir != estDefinieParPolitiqueTir) {
			NotificationChain msgs = null;
			if (estDefinieParPolitiqueTir != null)
				msgs = ((InternalEObject)estDefinieParPolitiqueTir).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_INTERVENTION_TYPE__EST_DEFINIE_PAR_POLITIQUE_TIR, null, msgs);
			if (newEstDefinieParPolitiqueTir != null)
				msgs = ((InternalEObject)newEstDefinieParPolitiqueTir).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_INTERVENTION_TYPE__EST_DEFINIE_PAR_POLITIQUE_TIR, null, msgs);
			msgs = basicSetEstDefinieParPolitiqueTir(newEstDefinieParPolitiqueTir, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INTERVENTION_TYPE__EST_DEFINIE_PAR_POLITIQUE_TIR, newEstDefinieParPolitiqueTir, newEstDefinieParPolitiqueTir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_INTERVENTION_TYPE__DUREE_TRAITEMENT:
				return basicSetDureeTraitement(null, msgs);
			case SchemaPackage.TYPE_INTERVENTION_TYPE__SAPPLIQUE_AU_TYPE_OBJECTIF_TYPE_OBJECTIF_ASS:
				return basicSetSAppliqueAuTypeObjectifTypeObjectifASS(null, msgs);
			case SchemaPackage.TYPE_INTERVENTION_TYPE__IMPOSE_VOLUME_MUNITIONS_ASS:
				return basicSetImposeVolumeMunitionsASS(null, msgs);
			case SchemaPackage.TYPE_INTERVENTION_TYPE__EST_DEFINIE_PAR_POLITIQUE_TIR:
				return basicSetEstDefinieParPolitiqueTir(null, msgs);
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
			case SchemaPackage.TYPE_INTERVENTION_TYPE__EFFET_RECHERCHE:
				return getEffetRecherche();
			case SchemaPackage.TYPE_INTERVENTION_TYPE__POURCENTAGE_DOMMAGES_RECHERCHES:
				return new Double(getPourcentageDommagesRecherches());
			case SchemaPackage.TYPE_INTERVENTION_TYPE__DUREE_TRAITEMENT:
				return getDureeTraitement();
			case SchemaPackage.TYPE_INTERVENTION_TYPE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_INTERVENTION_TYPE__CE:
				return getCE();
			case SchemaPackage.TYPE_INTERVENTION_TYPE__SAPPLIQUE_AU_TYPE_OBJECTIF_TYPE_OBJECTIF_ASS:
				return getSAppliqueAuTypeObjectifTypeObjectifASS();
			case SchemaPackage.TYPE_INTERVENTION_TYPE__IMPOSE_VOLUME_MUNITIONS_ASS:
				return getImposeVolumeMunitionsASS();
			case SchemaPackage.TYPE_INTERVENTION_TYPE__EST_DEFINIE_PAR_POLITIQUE_TIR:
				return getEstDefinieParPolitiqueTir();
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
			case SchemaPackage.TYPE_INTERVENTION_TYPE__EFFET_RECHERCHE:
				setEffetRecherche((TypeDictionaryDicoEffetTactiqueASS)newValue);
				return;
			case SchemaPackage.TYPE_INTERVENTION_TYPE__POURCENTAGE_DOMMAGES_RECHERCHES:
				setPourcentageDommagesRecherches(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_INTERVENTION_TYPE__DUREE_TRAITEMENT:
				setDureeTraitement((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_INTERVENTION_TYPE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_INTERVENTION_TYPE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_INTERVENTION_TYPE__SAPPLIQUE_AU_TYPE_OBJECTIF_TYPE_OBJECTIF_ASS:
				setSAppliqueAuTypeObjectifTypeObjectifASS((TypeTypeObjectifASS)newValue);
				return;
			case SchemaPackage.TYPE_INTERVENTION_TYPE__IMPOSE_VOLUME_MUNITIONS_ASS:
				setImposeVolumeMunitionsASS((TypeVolumeMunitionsASS)newValue);
				return;
			case SchemaPackage.TYPE_INTERVENTION_TYPE__EST_DEFINIE_PAR_POLITIQUE_TIR:
				setEstDefinieParPolitiqueTir((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_INTERVENTION_TYPE__EFFET_RECHERCHE:
				unsetEffetRecherche();
				return;
			case SchemaPackage.TYPE_INTERVENTION_TYPE__POURCENTAGE_DOMMAGES_RECHERCHES:
				unsetPourcentageDommagesRecherches();
				return;
			case SchemaPackage.TYPE_INTERVENTION_TYPE__DUREE_TRAITEMENT:
				setDureeTraitement((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_INTERVENTION_TYPE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_INTERVENTION_TYPE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_INTERVENTION_TYPE__SAPPLIQUE_AU_TYPE_OBJECTIF_TYPE_OBJECTIF_ASS:
				setSAppliqueAuTypeObjectifTypeObjectifASS((TypeTypeObjectifASS)null);
				return;
			case SchemaPackage.TYPE_INTERVENTION_TYPE__IMPOSE_VOLUME_MUNITIONS_ASS:
				setImposeVolumeMunitionsASS((TypeVolumeMunitionsASS)null);
				return;
			case SchemaPackage.TYPE_INTERVENTION_TYPE__EST_DEFINIE_PAR_POLITIQUE_TIR:
				setEstDefinieParPolitiqueTir((TypeAssociation)null);
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
			case SchemaPackage.TYPE_INTERVENTION_TYPE__EFFET_RECHERCHE:
				return isSetEffetRecherche();
			case SchemaPackage.TYPE_INTERVENTION_TYPE__POURCENTAGE_DOMMAGES_RECHERCHES:
				return isSetPourcentageDommagesRecherches();
			case SchemaPackage.TYPE_INTERVENTION_TYPE__DUREE_TRAITEMENT:
				return dureeTraitement != null;
			case SchemaPackage.TYPE_INTERVENTION_TYPE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_INTERVENTION_TYPE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_INTERVENTION_TYPE__SAPPLIQUE_AU_TYPE_OBJECTIF_TYPE_OBJECTIF_ASS:
				return sAppliqueAuTypeObjectifTypeObjectifASS != null;
			case SchemaPackage.TYPE_INTERVENTION_TYPE__IMPOSE_VOLUME_MUNITIONS_ASS:
				return imposeVolumeMunitionsASS != null;
			case SchemaPackage.TYPE_INTERVENTION_TYPE__EST_DEFINIE_PAR_POLITIQUE_TIR:
				return estDefinieParPolitiqueTir != null;
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
		result.append(" (effetRecherche: ");
		if (effetRechercheESet) result.append(effetRecherche); else result.append("<unset>");
		result.append(", pourcentageDommagesRecherches: ");
		if (pourcentageDommagesRecherchesESet) result.append(pourcentageDommagesRecherches); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeInterventionTypeImpl
