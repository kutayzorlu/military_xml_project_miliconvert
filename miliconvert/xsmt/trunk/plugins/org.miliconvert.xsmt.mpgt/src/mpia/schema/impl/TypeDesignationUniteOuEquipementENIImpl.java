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
import mpia.schema.TypeDesignationUniteOuEquipementENI;
import mpia.schema.TypeQuantiteTypeEquipement;
import mpia.schema.TypeQuantiteTypeUnite;

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
 * An implementation of the model object '<em><b>Type Designation Unite Ou Equipement ENI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeDesignationUniteOuEquipementENIImpl#getCapaciteOpsGlobale <em>Capacite Ops Globale</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDesignationUniteOuEquipementENIImpl#isIndicateurRenforcement <em>Indicateur Renforcement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDesignationUniteOuEquipementENIImpl#getAPourZoneMenaceAutreElementControle <em>APour Zone Menace Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDesignationUniteOuEquipementENIImpl#getAPourLocalisationPiecesOuUnitesASAeniAutreElementControle <em>APour Localisation Pieces Ou Unites AS Aeni Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDesignationUniteOuEquipementENIImpl#getEmploieCommeUniteUnite <em>Emploie Comme Unite Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDesignationUniteOuEquipementENIImpl#getAPourQuantiteTypeUniteEmployeQuantiteTypeUnite <em>APour Quantite Type Unite Employe Quantite Type Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDesignationUniteOuEquipementENIImpl#getAPourQuantiteTypeEquipementEmployeQuantiteTypeEquipement <em>APour Quantite Type Equipement Employe Quantite Type Equipement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeDesignationUniteOuEquipementENIImpl extends EObjectImpl implements TypeDesignationUniteOuEquipementENI {
	/**
	 * The default value of the '{@link #getCapaciteOpsGlobale() <em>Capacite Ops Globale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapaciteOpsGlobale()
	 * @generated
	 * @ordered
	 */
	protected static final double CAPACITE_OPS_GLOBALE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCapaciteOpsGlobale() <em>Capacite Ops Globale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapaciteOpsGlobale()
	 * @generated
	 * @ordered
	 */
	protected double capaciteOpsGlobale = CAPACITE_OPS_GLOBALE_EDEFAULT;

	/**
	 * This is true if the Capacite Ops Globale attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean capaciteOpsGlobaleESet;

	/**
	 * The default value of the '{@link #isIndicateurRenforcement() <em>Indicateur Renforcement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIndicateurRenforcement()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INDICATEUR_RENFORCEMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIndicateurRenforcement() <em>Indicateur Renforcement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIndicateurRenforcement()
	 * @generated
	 * @ordered
	 */
	protected boolean indicateurRenforcement = INDICATEUR_RENFORCEMENT_EDEFAULT;

	/**
	 * This is true if the Indicateur Renforcement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean indicateurRenforcementESet;

	/**
	 * The cached value of the '{@link #getAPourZoneMenaceAutreElementControle() <em>APour Zone Menace Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourZoneMenaceAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourZoneMenaceAutreElementControle;

	/**
	 * The cached value of the '{@link #getAPourLocalisationPiecesOuUnitesASAeniAutreElementControle() <em>APour Localisation Pieces Ou Unites AS Aeni Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourLocalisationPiecesOuUnitesASAeniAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourLocalisationPiecesOuUnitesASAeniAutreElementControle;

	/**
	 * The cached value of the '{@link #getEmploieCommeUniteUnite() <em>Emploie Comme Unite Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmploieCommeUniteUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociationEXT> emploieCommeUniteUnite;

	/**
	 * The cached value of the '{@link #getAPourQuantiteTypeUniteEmployeQuantiteTypeUnite() <em>APour Quantite Type Unite Employe Quantite Type Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourQuantiteTypeUniteEmployeQuantiteTypeUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeQuantiteTypeUnite> aPourQuantiteTypeUniteEmployeQuantiteTypeUnite;

	/**
	 * The cached value of the '{@link #getAPourQuantiteTypeEquipementEmployeQuantiteTypeEquipement() <em>APour Quantite Type Equipement Employe Quantite Type Equipement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourQuantiteTypeEquipementEmployeQuantiteTypeEquipement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeQuantiteTypeEquipement> aPourQuantiteTypeEquipementEmployeQuantiteTypeEquipement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDesignationUniteOuEquipementENIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeDesignationUniteOuEquipementENI();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCapaciteOpsGlobale() {
		return capaciteOpsGlobale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapaciteOpsGlobale(double newCapaciteOpsGlobale) {
		double oldCapaciteOpsGlobale = capaciteOpsGlobale;
		capaciteOpsGlobale = newCapaciteOpsGlobale;
		boolean oldCapaciteOpsGlobaleESet = capaciteOpsGlobaleESet;
		capaciteOpsGlobaleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI__CAPACITE_OPS_GLOBALE, oldCapaciteOpsGlobale, capaciteOpsGlobale, !oldCapaciteOpsGlobaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCapaciteOpsGlobale() {
		double oldCapaciteOpsGlobale = capaciteOpsGlobale;
		boolean oldCapaciteOpsGlobaleESet = capaciteOpsGlobaleESet;
		capaciteOpsGlobale = CAPACITE_OPS_GLOBALE_EDEFAULT;
		capaciteOpsGlobaleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI__CAPACITE_OPS_GLOBALE, oldCapaciteOpsGlobale, CAPACITE_OPS_GLOBALE_EDEFAULT, oldCapaciteOpsGlobaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCapaciteOpsGlobale() {
		return capaciteOpsGlobaleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIndicateurRenforcement() {
		return indicateurRenforcement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndicateurRenforcement(boolean newIndicateurRenforcement) {
		boolean oldIndicateurRenforcement = indicateurRenforcement;
		indicateurRenforcement = newIndicateurRenforcement;
		boolean oldIndicateurRenforcementESet = indicateurRenforcementESet;
		indicateurRenforcementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI__INDICATEUR_RENFORCEMENT, oldIndicateurRenforcement, indicateurRenforcement, !oldIndicateurRenforcementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIndicateurRenforcement() {
		boolean oldIndicateurRenforcement = indicateurRenforcement;
		boolean oldIndicateurRenforcementESet = indicateurRenforcementESet;
		indicateurRenforcement = INDICATEUR_RENFORCEMENT_EDEFAULT;
		indicateurRenforcementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI__INDICATEUR_RENFORCEMENT, oldIndicateurRenforcement, INDICATEUR_RENFORCEMENT_EDEFAULT, oldIndicateurRenforcementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIndicateurRenforcement() {
		return indicateurRenforcementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourZoneMenaceAutreElementControle() {
		return aPourZoneMenaceAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourZoneMenaceAutreElementControle(TypeAssociation newAPourZoneMenaceAutreElementControle, NotificationChain msgs) {
		TypeAssociation oldAPourZoneMenaceAutreElementControle = aPourZoneMenaceAutreElementControle;
		aPourZoneMenaceAutreElementControle = newAPourZoneMenaceAutreElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI__APOUR_ZONE_MENACE_AUTRE_ELEMENT_CONTROLE, oldAPourZoneMenaceAutreElementControle, newAPourZoneMenaceAutreElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourZoneMenaceAutreElementControle(TypeAssociation newAPourZoneMenaceAutreElementControle) {
		if (newAPourZoneMenaceAutreElementControle != aPourZoneMenaceAutreElementControle) {
			NotificationChain msgs = null;
			if (aPourZoneMenaceAutreElementControle != null)
				msgs = ((InternalEObject)aPourZoneMenaceAutreElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI__APOUR_ZONE_MENACE_AUTRE_ELEMENT_CONTROLE, null, msgs);
			if (newAPourZoneMenaceAutreElementControle != null)
				msgs = ((InternalEObject)newAPourZoneMenaceAutreElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI__APOUR_ZONE_MENACE_AUTRE_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetAPourZoneMenaceAutreElementControle(newAPourZoneMenaceAutreElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI__APOUR_ZONE_MENACE_AUTRE_ELEMENT_CONTROLE, newAPourZoneMenaceAutreElementControle, newAPourZoneMenaceAutreElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourLocalisationPiecesOuUnitesASAeniAutreElementControle() {
		return aPourLocalisationPiecesOuUnitesASAeniAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourLocalisationPiecesOuUnitesASAeniAutreElementControle(TypeAssociation newAPourLocalisationPiecesOuUnitesASAeniAutreElementControle, NotificationChain msgs) {
		TypeAssociation oldAPourLocalisationPiecesOuUnitesASAeniAutreElementControle = aPourLocalisationPiecesOuUnitesASAeniAutreElementControle;
		aPourLocalisationPiecesOuUnitesASAeniAutreElementControle = newAPourLocalisationPiecesOuUnitesASAeniAutreElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI__APOUR_LOCALISATION_PIECES_OU_UNITES_AS_AENI_AUTRE_ELEMENT_CONTROLE, oldAPourLocalisationPiecesOuUnitesASAeniAutreElementControle, newAPourLocalisationPiecesOuUnitesASAeniAutreElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourLocalisationPiecesOuUnitesASAeniAutreElementControle(TypeAssociation newAPourLocalisationPiecesOuUnitesASAeniAutreElementControle) {
		if (newAPourLocalisationPiecesOuUnitesASAeniAutreElementControle != aPourLocalisationPiecesOuUnitesASAeniAutreElementControle) {
			NotificationChain msgs = null;
			if (aPourLocalisationPiecesOuUnitesASAeniAutreElementControle != null)
				msgs = ((InternalEObject)aPourLocalisationPiecesOuUnitesASAeniAutreElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI__APOUR_LOCALISATION_PIECES_OU_UNITES_AS_AENI_AUTRE_ELEMENT_CONTROLE, null, msgs);
			if (newAPourLocalisationPiecesOuUnitesASAeniAutreElementControle != null)
				msgs = ((InternalEObject)newAPourLocalisationPiecesOuUnitesASAeniAutreElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI__APOUR_LOCALISATION_PIECES_OU_UNITES_AS_AENI_AUTRE_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetAPourLocalisationPiecesOuUnitesASAeniAutreElementControle(newAPourLocalisationPiecesOuUnitesASAeniAutreElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI__APOUR_LOCALISATION_PIECES_OU_UNITES_AS_AENI_AUTRE_ELEMENT_CONTROLE, newAPourLocalisationPiecesOuUnitesASAeniAutreElementControle, newAPourLocalisationPiecesOuUnitesASAeniAutreElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEXT> getEmploieCommeUniteUnite() {
		if (emploieCommeUniteUnite == null) {
			emploieCommeUniteUnite = new EObjectContainmentEList<TypeAssociationEXT>(TypeAssociationEXT.class, this, SchemaPackage.TYPE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI__EMPLOIE_COMME_UNITE_UNITE);
		}
		return emploieCommeUniteUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeQuantiteTypeUnite> getAPourQuantiteTypeUniteEmployeQuantiteTypeUnite() {
		if (aPourQuantiteTypeUniteEmployeQuantiteTypeUnite == null) {
			aPourQuantiteTypeUniteEmployeQuantiteTypeUnite = new EObjectContainmentEList<TypeQuantiteTypeUnite>(TypeQuantiteTypeUnite.class, this, SchemaPackage.TYPE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI__APOUR_QUANTITE_TYPE_UNITE_EMPLOYE_QUANTITE_TYPE_UNITE);
		}
		return aPourQuantiteTypeUniteEmployeQuantiteTypeUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeQuantiteTypeEquipement> getAPourQuantiteTypeEquipementEmployeQuantiteTypeEquipement() {
		if (aPourQuantiteTypeEquipementEmployeQuantiteTypeEquipement == null) {
			aPourQuantiteTypeEquipementEmployeQuantiteTypeEquipement = new EObjectContainmentEList<TypeQuantiteTypeEquipement>(TypeQuantiteTypeEquipement.class, this, SchemaPackage.TYPE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI__APOUR_QUANTITE_TYPE_EQUIPEMENT_EMPLOYE_QUANTITE_TYPE_EQUIPEMENT);
		}
		return aPourQuantiteTypeEquipementEmployeQuantiteTypeEquipement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI__APOUR_ZONE_MENACE_AUTRE_ELEMENT_CONTROLE:
				return basicSetAPourZoneMenaceAutreElementControle(null, msgs);
			case SchemaPackage.TYPE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI__APOUR_LOCALISATION_PIECES_OU_UNITES_AS_AENI_AUTRE_ELEMENT_CONTROLE:
				return basicSetAPourLocalisationPiecesOuUnitesASAeniAutreElementControle(null, msgs);
			case SchemaPackage.TYPE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI__EMPLOIE_COMME_UNITE_UNITE:
				return ((InternalEList<?>)getEmploieCommeUniteUnite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI__APOUR_QUANTITE_TYPE_UNITE_EMPLOYE_QUANTITE_TYPE_UNITE:
				return ((InternalEList<?>)getAPourQuantiteTypeUniteEmployeQuantiteTypeUnite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI__APOUR_QUANTITE_TYPE_EQUIPEMENT_EMPLOYE_QUANTITE_TYPE_EQUIPEMENT:
				return ((InternalEList<?>)getAPourQuantiteTypeEquipementEmployeQuantiteTypeEquipement()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI__CAPACITE_OPS_GLOBALE:
				return new Double(getCapaciteOpsGlobale());
			case SchemaPackage.TYPE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI__INDICATEUR_RENFORCEMENT:
				return isIndicateurRenforcement() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI__APOUR_ZONE_MENACE_AUTRE_ELEMENT_CONTROLE:
				return getAPourZoneMenaceAutreElementControle();
			case SchemaPackage.TYPE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI__APOUR_LOCALISATION_PIECES_OU_UNITES_AS_AENI_AUTRE_ELEMENT_CONTROLE:
				return getAPourLocalisationPiecesOuUnitesASAeniAutreElementControle();
			case SchemaPackage.TYPE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI__EMPLOIE_COMME_UNITE_UNITE:
				return getEmploieCommeUniteUnite();
			case SchemaPackage.TYPE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI__APOUR_QUANTITE_TYPE_UNITE_EMPLOYE_QUANTITE_TYPE_UNITE:
				return getAPourQuantiteTypeUniteEmployeQuantiteTypeUnite();
			case SchemaPackage.TYPE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI__APOUR_QUANTITE_TYPE_EQUIPEMENT_EMPLOYE_QUANTITE_TYPE_EQUIPEMENT:
				return getAPourQuantiteTypeEquipementEmployeQuantiteTypeEquipement();
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
			case SchemaPackage.TYPE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI__CAPACITE_OPS_GLOBALE:
				setCapaciteOpsGlobale(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI__INDICATEUR_RENFORCEMENT:
				setIndicateurRenforcement(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI__APOUR_ZONE_MENACE_AUTRE_ELEMENT_CONTROLE:
				setAPourZoneMenaceAutreElementControle((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI__APOUR_LOCALISATION_PIECES_OU_UNITES_AS_AENI_AUTRE_ELEMENT_CONTROLE:
				setAPourLocalisationPiecesOuUnitesASAeniAutreElementControle((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI__EMPLOIE_COMME_UNITE_UNITE:
				getEmploieCommeUniteUnite().clear();
				getEmploieCommeUniteUnite().addAll((Collection<? extends TypeAssociationEXT>)newValue);
				return;
			case SchemaPackage.TYPE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI__APOUR_QUANTITE_TYPE_UNITE_EMPLOYE_QUANTITE_TYPE_UNITE:
				getAPourQuantiteTypeUniteEmployeQuantiteTypeUnite().clear();
				getAPourQuantiteTypeUniteEmployeQuantiteTypeUnite().addAll((Collection<? extends TypeQuantiteTypeUnite>)newValue);
				return;
			case SchemaPackage.TYPE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI__APOUR_QUANTITE_TYPE_EQUIPEMENT_EMPLOYE_QUANTITE_TYPE_EQUIPEMENT:
				getAPourQuantiteTypeEquipementEmployeQuantiteTypeEquipement().clear();
				getAPourQuantiteTypeEquipementEmployeQuantiteTypeEquipement().addAll((Collection<? extends TypeQuantiteTypeEquipement>)newValue);
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
			case SchemaPackage.TYPE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI__CAPACITE_OPS_GLOBALE:
				unsetCapaciteOpsGlobale();
				return;
			case SchemaPackage.TYPE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI__INDICATEUR_RENFORCEMENT:
				unsetIndicateurRenforcement();
				return;
			case SchemaPackage.TYPE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI__APOUR_ZONE_MENACE_AUTRE_ELEMENT_CONTROLE:
				setAPourZoneMenaceAutreElementControle((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI__APOUR_LOCALISATION_PIECES_OU_UNITES_AS_AENI_AUTRE_ELEMENT_CONTROLE:
				setAPourLocalisationPiecesOuUnitesASAeniAutreElementControle((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI__EMPLOIE_COMME_UNITE_UNITE:
				getEmploieCommeUniteUnite().clear();
				return;
			case SchemaPackage.TYPE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI__APOUR_QUANTITE_TYPE_UNITE_EMPLOYE_QUANTITE_TYPE_UNITE:
				getAPourQuantiteTypeUniteEmployeQuantiteTypeUnite().clear();
				return;
			case SchemaPackage.TYPE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI__APOUR_QUANTITE_TYPE_EQUIPEMENT_EMPLOYE_QUANTITE_TYPE_EQUIPEMENT:
				getAPourQuantiteTypeEquipementEmployeQuantiteTypeEquipement().clear();
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
			case SchemaPackage.TYPE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI__CAPACITE_OPS_GLOBALE:
				return isSetCapaciteOpsGlobale();
			case SchemaPackage.TYPE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI__INDICATEUR_RENFORCEMENT:
				return isSetIndicateurRenforcement();
			case SchemaPackage.TYPE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI__APOUR_ZONE_MENACE_AUTRE_ELEMENT_CONTROLE:
				return aPourZoneMenaceAutreElementControle != null;
			case SchemaPackage.TYPE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI__APOUR_LOCALISATION_PIECES_OU_UNITES_AS_AENI_AUTRE_ELEMENT_CONTROLE:
				return aPourLocalisationPiecesOuUnitesASAeniAutreElementControle != null;
			case SchemaPackage.TYPE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI__EMPLOIE_COMME_UNITE_UNITE:
				return emploieCommeUniteUnite != null && !emploieCommeUniteUnite.isEmpty();
			case SchemaPackage.TYPE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI__APOUR_QUANTITE_TYPE_UNITE_EMPLOYE_QUANTITE_TYPE_UNITE:
				return aPourQuantiteTypeUniteEmployeQuantiteTypeUnite != null && !aPourQuantiteTypeUniteEmployeQuantiteTypeUnite.isEmpty();
			case SchemaPackage.TYPE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI__APOUR_QUANTITE_TYPE_EQUIPEMENT_EMPLOYE_QUANTITE_TYPE_EQUIPEMENT:
				return aPourQuantiteTypeEquipementEmployeQuantiteTypeEquipement != null && !aPourQuantiteTypeEquipementEmployeQuantiteTypeEquipement.isEmpty();
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
		result.append(" (capaciteOpsGlobale: ");
		if (capaciteOpsGlobaleESet) result.append(capaciteOpsGlobale); else result.append("<unset>");
		result.append(", indicateurRenforcement: ");
		if (indicateurRenforcementESet) result.append(indicateurRenforcement); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeDesignationUniteOuEquipementENIImpl
