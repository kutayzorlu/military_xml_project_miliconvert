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
import mpia.schema.TypeDictionaryDicoDirectiveControle;
import mpia.schema.TypeDictionaryDicoInterventionGeneraleCategorie;
import mpia.schema.TypeInterventionGenerale;

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
 * An implementation of the model object '<em><b>Type Intervention Generale</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeInterventionGeneraleImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeInterventionGeneraleImpl#getSousCategorie <em>Sous Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeInterventionGeneraleImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeInterventionGeneraleImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeInterventionGeneraleImpl#getAPourDonneurOrdreUnite <em>APour Donneur Ordre Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeInterventionGeneraleImpl#getConcernePlanFeuxPlanFeux <em>Concerne Plan Feux Plan Feux</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeInterventionGeneraleImpl#getConcerneObjectifObjectifCiblage <em>Concerne Objectif Objectif Ciblage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeInterventionGeneraleImpl#getConcernePlanTraitementObjectifsPlanTraitementObjectifs <em>Concerne Plan Traitement Objectifs Plan Traitement Objectifs</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeInterventionGeneraleImpl#getConcerneTraitementObjectifTraitementObjectif <em>Concerne Traitement Objectif Traitement Objectif</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeInterventionGeneraleImpl#getConcerneZoneAutreElementControle <em>Concerne Zone Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeInterventionGeneraleImpl#getConcerneUniteUnite <em>Concerne Unite Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeInterventionGeneraleImpl extends EObjectImpl implements TypeInterventionGenerale {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoInterventionGeneraleCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoInterventionGeneraleCategorie.CDAP;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoInterventionGeneraleCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getSousCategorie() <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSousCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoDirectiveControle SOUS_CATEGORIE_EDEFAULT = TypeDictionaryDicoDirectiveControle.CANCLD;

	/**
	 * The cached value of the '{@link #getSousCategorie() <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSousCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoDirectiveControle sousCategorie = SOUS_CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Sous Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sousCategorieESet;

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
	 * The cached value of the '{@link #getAPourDonneurOrdreUnite() <em>APour Donneur Ordre Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourDonneurOrdreUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourDonneurOrdreUnite;

	/**
	 * The cached value of the '{@link #getConcernePlanFeuxPlanFeux() <em>Concerne Plan Feux Plan Feux</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcernePlanFeuxPlanFeux()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation concernePlanFeuxPlanFeux;

	/**
	 * The cached value of the '{@link #getConcerneObjectifObjectifCiblage() <em>Concerne Objectif Objectif Ciblage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneObjectifObjectifCiblage()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> concerneObjectifObjectifCiblage;

	/**
	 * The cached value of the '{@link #getConcernePlanTraitementObjectifsPlanTraitementObjectifs() <em>Concerne Plan Traitement Objectifs Plan Traitement Objectifs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcernePlanTraitementObjectifsPlanTraitementObjectifs()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation concernePlanTraitementObjectifsPlanTraitementObjectifs;

	/**
	 * The cached value of the '{@link #getConcerneTraitementObjectifTraitementObjectif() <em>Concerne Traitement Objectif Traitement Objectif</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneTraitementObjectifTraitementObjectif()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation concerneTraitementObjectifTraitementObjectif;

	/**
	 * The cached value of the '{@link #getConcerneZoneAutreElementControle() <em>Concerne Zone Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneZoneAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation concerneZoneAutreElementControle;

	/**
	 * The cached value of the '{@link #getConcerneUniteUnite() <em>Concerne Unite Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneUniteUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT concerneUniteUnite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeInterventionGeneraleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeInterventionGenerale();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoInterventionGeneraleCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoInterventionGeneraleCategorie newCategorie) {
		TypeDictionaryDicoInterventionGeneraleCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INTERVENTION_GENERALE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoInterventionGeneraleCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_INTERVENTION_GENERALE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCategorie() {
		return categorieESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoDirectiveControle getSousCategorie() {
		return sousCategorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSousCategorie(TypeDictionaryDicoDirectiveControle newSousCategorie) {
		TypeDictionaryDicoDirectiveControle oldSousCategorie = sousCategorie;
		sousCategorie = newSousCategorie == null ? SOUS_CATEGORIE_EDEFAULT : newSousCategorie;
		boolean oldSousCategorieESet = sousCategorieESet;
		sousCategorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INTERVENTION_GENERALE__SOUS_CATEGORIE, oldSousCategorie, sousCategorie, !oldSousCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSousCategorie() {
		TypeDictionaryDicoDirectiveControle oldSousCategorie = sousCategorie;
		boolean oldSousCategorieESet = sousCategorieESet;
		sousCategorie = SOUS_CATEGORIE_EDEFAULT;
		sousCategorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_INTERVENTION_GENERALE__SOUS_CATEGORIE, oldSousCategorie, SOUS_CATEGORIE_EDEFAULT, oldSousCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSousCategorie() {
		return sousCategorieESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INTERVENTION_GENERALE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INTERVENTION_GENERALE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourDonneurOrdreUnite() {
		return aPourDonneurOrdreUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourDonneurOrdreUnite(TypeAssociationEXT newAPourDonneurOrdreUnite, NotificationChain msgs) {
		TypeAssociationEXT oldAPourDonneurOrdreUnite = aPourDonneurOrdreUnite;
		aPourDonneurOrdreUnite = newAPourDonneurOrdreUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INTERVENTION_GENERALE__APOUR_DONNEUR_ORDRE_UNITE, oldAPourDonneurOrdreUnite, newAPourDonneurOrdreUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourDonneurOrdreUnite(TypeAssociationEXT newAPourDonneurOrdreUnite) {
		if (newAPourDonneurOrdreUnite != aPourDonneurOrdreUnite) {
			NotificationChain msgs = null;
			if (aPourDonneurOrdreUnite != null)
				msgs = ((InternalEObject)aPourDonneurOrdreUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_INTERVENTION_GENERALE__APOUR_DONNEUR_ORDRE_UNITE, null, msgs);
			if (newAPourDonneurOrdreUnite != null)
				msgs = ((InternalEObject)newAPourDonneurOrdreUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_INTERVENTION_GENERALE__APOUR_DONNEUR_ORDRE_UNITE, null, msgs);
			msgs = basicSetAPourDonneurOrdreUnite(newAPourDonneurOrdreUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INTERVENTION_GENERALE__APOUR_DONNEUR_ORDRE_UNITE, newAPourDonneurOrdreUnite, newAPourDonneurOrdreUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getConcernePlanFeuxPlanFeux() {
		return concernePlanFeuxPlanFeux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcernePlanFeuxPlanFeux(TypeAssociation newConcernePlanFeuxPlanFeux, NotificationChain msgs) {
		TypeAssociation oldConcernePlanFeuxPlanFeux = concernePlanFeuxPlanFeux;
		concernePlanFeuxPlanFeux = newConcernePlanFeuxPlanFeux;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INTERVENTION_GENERALE__CONCERNE_PLAN_FEUX_PLAN_FEUX, oldConcernePlanFeuxPlanFeux, newConcernePlanFeuxPlanFeux);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcernePlanFeuxPlanFeux(TypeAssociation newConcernePlanFeuxPlanFeux) {
		if (newConcernePlanFeuxPlanFeux != concernePlanFeuxPlanFeux) {
			NotificationChain msgs = null;
			if (concernePlanFeuxPlanFeux != null)
				msgs = ((InternalEObject)concernePlanFeuxPlanFeux).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_INTERVENTION_GENERALE__CONCERNE_PLAN_FEUX_PLAN_FEUX, null, msgs);
			if (newConcernePlanFeuxPlanFeux != null)
				msgs = ((InternalEObject)newConcernePlanFeuxPlanFeux).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_INTERVENTION_GENERALE__CONCERNE_PLAN_FEUX_PLAN_FEUX, null, msgs);
			msgs = basicSetConcernePlanFeuxPlanFeux(newConcernePlanFeuxPlanFeux, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INTERVENTION_GENERALE__CONCERNE_PLAN_FEUX_PLAN_FEUX, newConcernePlanFeuxPlanFeux, newConcernePlanFeuxPlanFeux));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getConcerneObjectifObjectifCiblage() {
		if (concerneObjectifObjectifCiblage == null) {
			concerneObjectifObjectifCiblage = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_INTERVENTION_GENERALE__CONCERNE_OBJECTIF_OBJECTIF_CIBLAGE);
		}
		return concerneObjectifObjectifCiblage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getConcernePlanTraitementObjectifsPlanTraitementObjectifs() {
		return concernePlanTraitementObjectifsPlanTraitementObjectifs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcernePlanTraitementObjectifsPlanTraitementObjectifs(TypeAssociation newConcernePlanTraitementObjectifsPlanTraitementObjectifs, NotificationChain msgs) {
		TypeAssociation oldConcernePlanTraitementObjectifsPlanTraitementObjectifs = concernePlanTraitementObjectifsPlanTraitementObjectifs;
		concernePlanTraitementObjectifsPlanTraitementObjectifs = newConcernePlanTraitementObjectifsPlanTraitementObjectifs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INTERVENTION_GENERALE__CONCERNE_PLAN_TRAITEMENT_OBJECTIFS_PLAN_TRAITEMENT_OBJECTIFS, oldConcernePlanTraitementObjectifsPlanTraitementObjectifs, newConcernePlanTraitementObjectifsPlanTraitementObjectifs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcernePlanTraitementObjectifsPlanTraitementObjectifs(TypeAssociation newConcernePlanTraitementObjectifsPlanTraitementObjectifs) {
		if (newConcernePlanTraitementObjectifsPlanTraitementObjectifs != concernePlanTraitementObjectifsPlanTraitementObjectifs) {
			NotificationChain msgs = null;
			if (concernePlanTraitementObjectifsPlanTraitementObjectifs != null)
				msgs = ((InternalEObject)concernePlanTraitementObjectifsPlanTraitementObjectifs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_INTERVENTION_GENERALE__CONCERNE_PLAN_TRAITEMENT_OBJECTIFS_PLAN_TRAITEMENT_OBJECTIFS, null, msgs);
			if (newConcernePlanTraitementObjectifsPlanTraitementObjectifs != null)
				msgs = ((InternalEObject)newConcernePlanTraitementObjectifsPlanTraitementObjectifs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_INTERVENTION_GENERALE__CONCERNE_PLAN_TRAITEMENT_OBJECTIFS_PLAN_TRAITEMENT_OBJECTIFS, null, msgs);
			msgs = basicSetConcernePlanTraitementObjectifsPlanTraitementObjectifs(newConcernePlanTraitementObjectifsPlanTraitementObjectifs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INTERVENTION_GENERALE__CONCERNE_PLAN_TRAITEMENT_OBJECTIFS_PLAN_TRAITEMENT_OBJECTIFS, newConcernePlanTraitementObjectifsPlanTraitementObjectifs, newConcernePlanTraitementObjectifsPlanTraitementObjectifs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getConcerneTraitementObjectifTraitementObjectif() {
		return concerneTraitementObjectifTraitementObjectif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcerneTraitementObjectifTraitementObjectif(TypeAssociation newConcerneTraitementObjectifTraitementObjectif, NotificationChain msgs) {
		TypeAssociation oldConcerneTraitementObjectifTraitementObjectif = concerneTraitementObjectifTraitementObjectif;
		concerneTraitementObjectifTraitementObjectif = newConcerneTraitementObjectifTraitementObjectif;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INTERVENTION_GENERALE__CONCERNE_TRAITEMENT_OBJECTIF_TRAITEMENT_OBJECTIF, oldConcerneTraitementObjectifTraitementObjectif, newConcerneTraitementObjectifTraitementObjectif);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcerneTraitementObjectifTraitementObjectif(TypeAssociation newConcerneTraitementObjectifTraitementObjectif) {
		if (newConcerneTraitementObjectifTraitementObjectif != concerneTraitementObjectifTraitementObjectif) {
			NotificationChain msgs = null;
			if (concerneTraitementObjectifTraitementObjectif != null)
				msgs = ((InternalEObject)concerneTraitementObjectifTraitementObjectif).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_INTERVENTION_GENERALE__CONCERNE_TRAITEMENT_OBJECTIF_TRAITEMENT_OBJECTIF, null, msgs);
			if (newConcerneTraitementObjectifTraitementObjectif != null)
				msgs = ((InternalEObject)newConcerneTraitementObjectifTraitementObjectif).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_INTERVENTION_GENERALE__CONCERNE_TRAITEMENT_OBJECTIF_TRAITEMENT_OBJECTIF, null, msgs);
			msgs = basicSetConcerneTraitementObjectifTraitementObjectif(newConcerneTraitementObjectifTraitementObjectif, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INTERVENTION_GENERALE__CONCERNE_TRAITEMENT_OBJECTIF_TRAITEMENT_OBJECTIF, newConcerneTraitementObjectifTraitementObjectif, newConcerneTraitementObjectifTraitementObjectif));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getConcerneZoneAutreElementControle() {
		return concerneZoneAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcerneZoneAutreElementControle(TypeAssociation newConcerneZoneAutreElementControle, NotificationChain msgs) {
		TypeAssociation oldConcerneZoneAutreElementControle = concerneZoneAutreElementControle;
		concerneZoneAutreElementControle = newConcerneZoneAutreElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INTERVENTION_GENERALE__CONCERNE_ZONE_AUTRE_ELEMENT_CONTROLE, oldConcerneZoneAutreElementControle, newConcerneZoneAutreElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcerneZoneAutreElementControle(TypeAssociation newConcerneZoneAutreElementControle) {
		if (newConcerneZoneAutreElementControle != concerneZoneAutreElementControle) {
			NotificationChain msgs = null;
			if (concerneZoneAutreElementControle != null)
				msgs = ((InternalEObject)concerneZoneAutreElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_INTERVENTION_GENERALE__CONCERNE_ZONE_AUTRE_ELEMENT_CONTROLE, null, msgs);
			if (newConcerneZoneAutreElementControle != null)
				msgs = ((InternalEObject)newConcerneZoneAutreElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_INTERVENTION_GENERALE__CONCERNE_ZONE_AUTRE_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetConcerneZoneAutreElementControle(newConcerneZoneAutreElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INTERVENTION_GENERALE__CONCERNE_ZONE_AUTRE_ELEMENT_CONTROLE, newConcerneZoneAutreElementControle, newConcerneZoneAutreElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getConcerneUniteUnite() {
		return concerneUniteUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcerneUniteUnite(TypeAssociationEXT newConcerneUniteUnite, NotificationChain msgs) {
		TypeAssociationEXT oldConcerneUniteUnite = concerneUniteUnite;
		concerneUniteUnite = newConcerneUniteUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INTERVENTION_GENERALE__CONCERNE_UNITE_UNITE, oldConcerneUniteUnite, newConcerneUniteUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcerneUniteUnite(TypeAssociationEXT newConcerneUniteUnite) {
		if (newConcerneUniteUnite != concerneUniteUnite) {
			NotificationChain msgs = null;
			if (concerneUniteUnite != null)
				msgs = ((InternalEObject)concerneUniteUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_INTERVENTION_GENERALE__CONCERNE_UNITE_UNITE, null, msgs);
			if (newConcerneUniteUnite != null)
				msgs = ((InternalEObject)newConcerneUniteUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_INTERVENTION_GENERALE__CONCERNE_UNITE_UNITE, null, msgs);
			msgs = basicSetConcerneUniteUnite(newConcerneUniteUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INTERVENTION_GENERALE__CONCERNE_UNITE_UNITE, newConcerneUniteUnite, newConcerneUniteUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_INTERVENTION_GENERALE__APOUR_DONNEUR_ORDRE_UNITE:
				return basicSetAPourDonneurOrdreUnite(null, msgs);
			case SchemaPackage.TYPE_INTERVENTION_GENERALE__CONCERNE_PLAN_FEUX_PLAN_FEUX:
				return basicSetConcernePlanFeuxPlanFeux(null, msgs);
			case SchemaPackage.TYPE_INTERVENTION_GENERALE__CONCERNE_OBJECTIF_OBJECTIF_CIBLAGE:
				return ((InternalEList<?>)getConcerneObjectifObjectifCiblage()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_INTERVENTION_GENERALE__CONCERNE_PLAN_TRAITEMENT_OBJECTIFS_PLAN_TRAITEMENT_OBJECTIFS:
				return basicSetConcernePlanTraitementObjectifsPlanTraitementObjectifs(null, msgs);
			case SchemaPackage.TYPE_INTERVENTION_GENERALE__CONCERNE_TRAITEMENT_OBJECTIF_TRAITEMENT_OBJECTIF:
				return basicSetConcerneTraitementObjectifTraitementObjectif(null, msgs);
			case SchemaPackage.TYPE_INTERVENTION_GENERALE__CONCERNE_ZONE_AUTRE_ELEMENT_CONTROLE:
				return basicSetConcerneZoneAutreElementControle(null, msgs);
			case SchemaPackage.TYPE_INTERVENTION_GENERALE__CONCERNE_UNITE_UNITE:
				return basicSetConcerneUniteUnite(null, msgs);
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
			case SchemaPackage.TYPE_INTERVENTION_GENERALE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_INTERVENTION_GENERALE__SOUS_CATEGORIE:
				return getSousCategorie();
			case SchemaPackage.TYPE_INTERVENTION_GENERALE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_INTERVENTION_GENERALE__CE:
				return getCE();
			case SchemaPackage.TYPE_INTERVENTION_GENERALE__APOUR_DONNEUR_ORDRE_UNITE:
				return getAPourDonneurOrdreUnite();
			case SchemaPackage.TYPE_INTERVENTION_GENERALE__CONCERNE_PLAN_FEUX_PLAN_FEUX:
				return getConcernePlanFeuxPlanFeux();
			case SchemaPackage.TYPE_INTERVENTION_GENERALE__CONCERNE_OBJECTIF_OBJECTIF_CIBLAGE:
				return getConcerneObjectifObjectifCiblage();
			case SchemaPackage.TYPE_INTERVENTION_GENERALE__CONCERNE_PLAN_TRAITEMENT_OBJECTIFS_PLAN_TRAITEMENT_OBJECTIFS:
				return getConcernePlanTraitementObjectifsPlanTraitementObjectifs();
			case SchemaPackage.TYPE_INTERVENTION_GENERALE__CONCERNE_TRAITEMENT_OBJECTIF_TRAITEMENT_OBJECTIF:
				return getConcerneTraitementObjectifTraitementObjectif();
			case SchemaPackage.TYPE_INTERVENTION_GENERALE__CONCERNE_ZONE_AUTRE_ELEMENT_CONTROLE:
				return getConcerneZoneAutreElementControle();
			case SchemaPackage.TYPE_INTERVENTION_GENERALE__CONCERNE_UNITE_UNITE:
				return getConcerneUniteUnite();
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
			case SchemaPackage.TYPE_INTERVENTION_GENERALE__CATEGORIE:
				setCategorie((TypeDictionaryDicoInterventionGeneraleCategorie)newValue);
				return;
			case SchemaPackage.TYPE_INTERVENTION_GENERALE__SOUS_CATEGORIE:
				setSousCategorie((TypeDictionaryDicoDirectiveControle)newValue);
				return;
			case SchemaPackage.TYPE_INTERVENTION_GENERALE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_INTERVENTION_GENERALE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_INTERVENTION_GENERALE__APOUR_DONNEUR_ORDRE_UNITE:
				setAPourDonneurOrdreUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_INTERVENTION_GENERALE__CONCERNE_PLAN_FEUX_PLAN_FEUX:
				setConcernePlanFeuxPlanFeux((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_INTERVENTION_GENERALE__CONCERNE_OBJECTIF_OBJECTIF_CIBLAGE:
				getConcerneObjectifObjectifCiblage().clear();
				getConcerneObjectifObjectifCiblage().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_INTERVENTION_GENERALE__CONCERNE_PLAN_TRAITEMENT_OBJECTIFS_PLAN_TRAITEMENT_OBJECTIFS:
				setConcernePlanTraitementObjectifsPlanTraitementObjectifs((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_INTERVENTION_GENERALE__CONCERNE_TRAITEMENT_OBJECTIF_TRAITEMENT_OBJECTIF:
				setConcerneTraitementObjectifTraitementObjectif((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_INTERVENTION_GENERALE__CONCERNE_ZONE_AUTRE_ELEMENT_CONTROLE:
				setConcerneZoneAutreElementControle((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_INTERVENTION_GENERALE__CONCERNE_UNITE_UNITE:
				setConcerneUniteUnite((TypeAssociationEXT)newValue);
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
			case SchemaPackage.TYPE_INTERVENTION_GENERALE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_INTERVENTION_GENERALE__SOUS_CATEGORIE:
				unsetSousCategorie();
				return;
			case SchemaPackage.TYPE_INTERVENTION_GENERALE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_INTERVENTION_GENERALE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_INTERVENTION_GENERALE__APOUR_DONNEUR_ORDRE_UNITE:
				setAPourDonneurOrdreUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_INTERVENTION_GENERALE__CONCERNE_PLAN_FEUX_PLAN_FEUX:
				setConcernePlanFeuxPlanFeux((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_INTERVENTION_GENERALE__CONCERNE_OBJECTIF_OBJECTIF_CIBLAGE:
				getConcerneObjectifObjectifCiblage().clear();
				return;
			case SchemaPackage.TYPE_INTERVENTION_GENERALE__CONCERNE_PLAN_TRAITEMENT_OBJECTIFS_PLAN_TRAITEMENT_OBJECTIFS:
				setConcernePlanTraitementObjectifsPlanTraitementObjectifs((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_INTERVENTION_GENERALE__CONCERNE_TRAITEMENT_OBJECTIF_TRAITEMENT_OBJECTIF:
				setConcerneTraitementObjectifTraitementObjectif((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_INTERVENTION_GENERALE__CONCERNE_ZONE_AUTRE_ELEMENT_CONTROLE:
				setConcerneZoneAutreElementControle((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_INTERVENTION_GENERALE__CONCERNE_UNITE_UNITE:
				setConcerneUniteUnite((TypeAssociationEXT)null);
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
			case SchemaPackage.TYPE_INTERVENTION_GENERALE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_INTERVENTION_GENERALE__SOUS_CATEGORIE:
				return isSetSousCategorie();
			case SchemaPackage.TYPE_INTERVENTION_GENERALE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_INTERVENTION_GENERALE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_INTERVENTION_GENERALE__APOUR_DONNEUR_ORDRE_UNITE:
				return aPourDonneurOrdreUnite != null;
			case SchemaPackage.TYPE_INTERVENTION_GENERALE__CONCERNE_PLAN_FEUX_PLAN_FEUX:
				return concernePlanFeuxPlanFeux != null;
			case SchemaPackage.TYPE_INTERVENTION_GENERALE__CONCERNE_OBJECTIF_OBJECTIF_CIBLAGE:
				return concerneObjectifObjectifCiblage != null && !concerneObjectifObjectifCiblage.isEmpty();
			case SchemaPackage.TYPE_INTERVENTION_GENERALE__CONCERNE_PLAN_TRAITEMENT_OBJECTIFS_PLAN_TRAITEMENT_OBJECTIFS:
				return concernePlanTraitementObjectifsPlanTraitementObjectifs != null;
			case SchemaPackage.TYPE_INTERVENTION_GENERALE__CONCERNE_TRAITEMENT_OBJECTIF_TRAITEMENT_OBJECTIF:
				return concerneTraitementObjectifTraitementObjectif != null;
			case SchemaPackage.TYPE_INTERVENTION_GENERALE__CONCERNE_ZONE_AUTRE_ELEMENT_CONTROLE:
				return concerneZoneAutreElementControle != null;
			case SchemaPackage.TYPE_INTERVENTION_GENERALE__CONCERNE_UNITE_UNITE:
				return concerneUniteUnite != null;
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
		result.append(" (categorie: ");
		if (categorieESet) result.append(categorie); else result.append("<unset>");
		result.append(", sousCategorie: ");
		if (sousCategorieESet) result.append(sousCategorie); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeInterventionGeneraleImpl
