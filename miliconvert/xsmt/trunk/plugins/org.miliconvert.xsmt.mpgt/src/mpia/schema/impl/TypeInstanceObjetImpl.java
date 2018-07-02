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
import mpia.schema.TypeAssocInstanceObjetLocalisation;
import mpia.schema.TypeComportement;
import mpia.schema.TypeComptageParActivite;
import mpia.schema.TypeDotationEffective;
import mpia.schema.TypeInstanceObjet;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Instance Objet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeInstanceObjetImpl#getAPourComportementComportement <em>APour Comportement Comportement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeInstanceObjetImpl#getEstAffilieAAssociationAffiliationInstanceObjet <em>Est Affilie AAssociation Affiliation Instance Objet</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeInstanceObjetImpl#getEstLocaliseParAssocInstanceObjetLocalisation <em>Est Localise Par Assoc Instance Objet Localisation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeInstanceObjetImpl#getAPourDotationEffectiveDotationEffective <em>APour Dotation Effective Dotation Effective</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeInstanceObjetImpl#getAPourDotationTheoriqueDotationTheoriqueInstanceObjet <em>APour Dotation Theorique Dotation Theorique Instance Objet</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeInstanceObjetImpl#getAssocieCommeAdresseAssociationInstanceObjetAdresse <em>Associe Comme Adresse Association Instance Objet Adresse</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeInstanceObjetImpl#getAssocieCommeObjectifActiviteObjectifActivite <em>Associe Comme Objectif Activite Objectif Activite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeInstanceObjetImpl#getEstPlaceDansAssocContexteInstanceObjet <em>Est Place Dans Assoc Contexte Instance Objet</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeInstanceObjetImpl#getAPourCapaciteAssociationInstanceObjetCapacite <em>APour Capacite Association Instance Objet Capacite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeInstanceObjetImpl#getAssocieCommeObjectifCiblageObjectifCiblage <em>Associe Comme Objectif Ciblage Objectif Ciblage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeInstanceObjetImpl#getAPourComptageParActiviteComptageParActivite <em>APour Comptage Par Activite Comptage Par Activite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypeInstanceObjetImpl extends TypeRacineOperationnelleImpl implements TypeInstanceObjet {
	/**
	 * The cached value of the '{@link #getAPourComportementComportement() <em>APour Comportement Comportement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourComportementComportement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeComportement> aPourComportementComportement;

	/**
	 * The cached value of the '{@link #getEstAffilieAAssociationAffiliationInstanceObjet() <em>Est Affilie AAssociation Affiliation Instance Objet</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstAffilieAAssociationAffiliationInstanceObjet()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estAffilieAAssociationAffiliationInstanceObjet;

	/**
	 * The cached value of the '{@link #getEstLocaliseParAssocInstanceObjetLocalisation() <em>Est Localise Par Assoc Instance Objet Localisation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstLocaliseParAssocInstanceObjetLocalisation()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssocInstanceObjetLocalisation> estLocaliseParAssocInstanceObjetLocalisation;

	/**
	 * The cached value of the '{@link #getAPourDotationEffectiveDotationEffective() <em>APour Dotation Effective Dotation Effective</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourDotationEffectiveDotationEffective()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeDotationEffective> aPourDotationEffectiveDotationEffective;

	/**
	 * The cached value of the '{@link #getAPourDotationTheoriqueDotationTheoriqueInstanceObjet() <em>APour Dotation Theorique Dotation Theorique Instance Objet</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourDotationTheoriqueDotationTheoriqueInstanceObjet()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourDotationTheoriqueDotationTheoriqueInstanceObjet;

	/**
	 * The cached value of the '{@link #getAssocieCommeAdresseAssociationInstanceObjetAdresse() <em>Associe Comme Adresse Association Instance Objet Adresse</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeAdresseAssociationInstanceObjetAdresse()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> associeCommeAdresseAssociationInstanceObjetAdresse;

	/**
	 * The cached value of the '{@link #getAssocieCommeObjectifActiviteObjectifActivite() <em>Associe Comme Objectif Activite Objectif Activite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeObjectifActiviteObjectifActivite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> associeCommeObjectifActiviteObjectifActivite;

	/**
	 * The cached value of the '{@link #getEstPlaceDansAssocContexteInstanceObjet() <em>Est Place Dans Assoc Contexte Instance Objet</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstPlaceDansAssocContexteInstanceObjet()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estPlaceDansAssocContexteInstanceObjet;

	/**
	 * The cached value of the '{@link #getAPourCapaciteAssociationInstanceObjetCapacite() <em>APour Capacite Association Instance Objet Capacite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCapaciteAssociationInstanceObjetCapacite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourCapaciteAssociationInstanceObjetCapacite;

	/**
	 * The cached value of the '{@link #getAssocieCommeObjectifCiblageObjectifCiblage() <em>Associe Comme Objectif Ciblage Objectif Ciblage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeObjectifCiblageObjectifCiblage()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> associeCommeObjectifCiblageObjectifCiblage;

	/**
	 * The cached value of the '{@link #getAPourComptageParActiviteComptageParActivite() <em>APour Comptage Par Activite Comptage Par Activite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourComptageParActiviteComptageParActivite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeComptageParActivite> aPourComptageParActiviteComptageParActivite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeInstanceObjetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeInstanceObjet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeComportement> getAPourComportementComportement() {
		if (aPourComportementComportement == null) {
			aPourComportementComportement = new EObjectContainmentEList<TypeComportement>(TypeComportement.class, this, SchemaPackage.TYPE_INSTANCE_OBJET__APOUR_COMPORTEMENT_COMPORTEMENT);
		}
		return aPourComportementComportement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstAffilieAAssociationAffiliationInstanceObjet() {
		if (estAffilieAAssociationAffiliationInstanceObjet == null) {
			estAffilieAAssociationAffiliationInstanceObjet = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_INSTANCE_OBJET__EST_AFFILIE_AASSOCIATION_AFFILIATION_INSTANCE_OBJET);
		}
		return estAffilieAAssociationAffiliationInstanceObjet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssocInstanceObjetLocalisation> getEstLocaliseParAssocInstanceObjetLocalisation() {
		if (estLocaliseParAssocInstanceObjetLocalisation == null) {
			estLocaliseParAssocInstanceObjetLocalisation = new EObjectContainmentEList<TypeAssocInstanceObjetLocalisation>(TypeAssocInstanceObjetLocalisation.class, this, SchemaPackage.TYPE_INSTANCE_OBJET__EST_LOCALISE_PAR_ASSOC_INSTANCE_OBJET_LOCALISATION);
		}
		return estLocaliseParAssocInstanceObjetLocalisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDotationEffective> getAPourDotationEffectiveDotationEffective() {
		if (aPourDotationEffectiveDotationEffective == null) {
			aPourDotationEffectiveDotationEffective = new EObjectContainmentEList<TypeDotationEffective>(TypeDotationEffective.class, this, SchemaPackage.TYPE_INSTANCE_OBJET__APOUR_DOTATION_EFFECTIVE_DOTATION_EFFECTIVE);
		}
		return aPourDotationEffectiveDotationEffective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourDotationTheoriqueDotationTheoriqueInstanceObjet() {
		if (aPourDotationTheoriqueDotationTheoriqueInstanceObjet == null) {
			aPourDotationTheoriqueDotationTheoriqueInstanceObjet = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_INSTANCE_OBJET__APOUR_DOTATION_THEORIQUE_DOTATION_THEORIQUE_INSTANCE_OBJET);
		}
		return aPourDotationTheoriqueDotationTheoriqueInstanceObjet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAssocieCommeAdresseAssociationInstanceObjetAdresse() {
		if (associeCommeAdresseAssociationInstanceObjetAdresse == null) {
			associeCommeAdresseAssociationInstanceObjetAdresse = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_INSTANCE_OBJET__ASSOCIE_COMME_ADRESSE_ASSOCIATION_INSTANCE_OBJET_ADRESSE);
		}
		return associeCommeAdresseAssociationInstanceObjetAdresse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAssocieCommeObjectifActiviteObjectifActivite() {
		if (associeCommeObjectifActiviteObjectifActivite == null) {
			associeCommeObjectifActiviteObjectifActivite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_INSTANCE_OBJET__ASSOCIE_COMME_OBJECTIF_ACTIVITE_OBJECTIF_ACTIVITE);
		}
		return associeCommeObjectifActiviteObjectifActivite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstPlaceDansAssocContexteInstanceObjet() {
		if (estPlaceDansAssocContexteInstanceObjet == null) {
			estPlaceDansAssocContexteInstanceObjet = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_INSTANCE_OBJET__EST_PLACE_DANS_ASSOC_CONTEXTE_INSTANCE_OBJET);
		}
		return estPlaceDansAssocContexteInstanceObjet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourCapaciteAssociationInstanceObjetCapacite() {
		if (aPourCapaciteAssociationInstanceObjetCapacite == null) {
			aPourCapaciteAssociationInstanceObjetCapacite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_INSTANCE_OBJET__APOUR_CAPACITE_ASSOCIATION_INSTANCE_OBJET_CAPACITE);
		}
		return aPourCapaciteAssociationInstanceObjetCapacite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAssocieCommeObjectifCiblageObjectifCiblage() {
		if (associeCommeObjectifCiblageObjectifCiblage == null) {
			associeCommeObjectifCiblageObjectifCiblage = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_INSTANCE_OBJET__ASSOCIE_COMME_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE);
		}
		return associeCommeObjectifCiblageObjectifCiblage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeComptageParActivite> getAPourComptageParActiviteComptageParActivite() {
		if (aPourComptageParActiviteComptageParActivite == null) {
			aPourComptageParActiviteComptageParActivite = new EObjectContainmentEList<TypeComptageParActivite>(TypeComptageParActivite.class, this, SchemaPackage.TYPE_INSTANCE_OBJET__APOUR_COMPTAGE_PAR_ACTIVITE_COMPTAGE_PAR_ACTIVITE);
		}
		return aPourComptageParActiviteComptageParActivite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_INSTANCE_OBJET__APOUR_COMPORTEMENT_COMPORTEMENT:
				return ((InternalEList<?>)getAPourComportementComportement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_INSTANCE_OBJET__EST_AFFILIE_AASSOCIATION_AFFILIATION_INSTANCE_OBJET:
				return ((InternalEList<?>)getEstAffilieAAssociationAffiliationInstanceObjet()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_INSTANCE_OBJET__EST_LOCALISE_PAR_ASSOC_INSTANCE_OBJET_LOCALISATION:
				return ((InternalEList<?>)getEstLocaliseParAssocInstanceObjetLocalisation()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_INSTANCE_OBJET__APOUR_DOTATION_EFFECTIVE_DOTATION_EFFECTIVE:
				return ((InternalEList<?>)getAPourDotationEffectiveDotationEffective()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_INSTANCE_OBJET__APOUR_DOTATION_THEORIQUE_DOTATION_THEORIQUE_INSTANCE_OBJET:
				return ((InternalEList<?>)getAPourDotationTheoriqueDotationTheoriqueInstanceObjet()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_INSTANCE_OBJET__ASSOCIE_COMME_ADRESSE_ASSOCIATION_INSTANCE_OBJET_ADRESSE:
				return ((InternalEList<?>)getAssocieCommeAdresseAssociationInstanceObjetAdresse()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_INSTANCE_OBJET__ASSOCIE_COMME_OBJECTIF_ACTIVITE_OBJECTIF_ACTIVITE:
				return ((InternalEList<?>)getAssocieCommeObjectifActiviteObjectifActivite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_INSTANCE_OBJET__EST_PLACE_DANS_ASSOC_CONTEXTE_INSTANCE_OBJET:
				return ((InternalEList<?>)getEstPlaceDansAssocContexteInstanceObjet()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_INSTANCE_OBJET__APOUR_CAPACITE_ASSOCIATION_INSTANCE_OBJET_CAPACITE:
				return ((InternalEList<?>)getAPourCapaciteAssociationInstanceObjetCapacite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_INSTANCE_OBJET__ASSOCIE_COMME_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE:
				return ((InternalEList<?>)getAssocieCommeObjectifCiblageObjectifCiblage()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_INSTANCE_OBJET__APOUR_COMPTAGE_PAR_ACTIVITE_COMPTAGE_PAR_ACTIVITE:
				return ((InternalEList<?>)getAPourComptageParActiviteComptageParActivite()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_INSTANCE_OBJET__APOUR_COMPORTEMENT_COMPORTEMENT:
				return getAPourComportementComportement();
			case SchemaPackage.TYPE_INSTANCE_OBJET__EST_AFFILIE_AASSOCIATION_AFFILIATION_INSTANCE_OBJET:
				return getEstAffilieAAssociationAffiliationInstanceObjet();
			case SchemaPackage.TYPE_INSTANCE_OBJET__EST_LOCALISE_PAR_ASSOC_INSTANCE_OBJET_LOCALISATION:
				return getEstLocaliseParAssocInstanceObjetLocalisation();
			case SchemaPackage.TYPE_INSTANCE_OBJET__APOUR_DOTATION_EFFECTIVE_DOTATION_EFFECTIVE:
				return getAPourDotationEffectiveDotationEffective();
			case SchemaPackage.TYPE_INSTANCE_OBJET__APOUR_DOTATION_THEORIQUE_DOTATION_THEORIQUE_INSTANCE_OBJET:
				return getAPourDotationTheoriqueDotationTheoriqueInstanceObjet();
			case SchemaPackage.TYPE_INSTANCE_OBJET__ASSOCIE_COMME_ADRESSE_ASSOCIATION_INSTANCE_OBJET_ADRESSE:
				return getAssocieCommeAdresseAssociationInstanceObjetAdresse();
			case SchemaPackage.TYPE_INSTANCE_OBJET__ASSOCIE_COMME_OBJECTIF_ACTIVITE_OBJECTIF_ACTIVITE:
				return getAssocieCommeObjectifActiviteObjectifActivite();
			case SchemaPackage.TYPE_INSTANCE_OBJET__EST_PLACE_DANS_ASSOC_CONTEXTE_INSTANCE_OBJET:
				return getEstPlaceDansAssocContexteInstanceObjet();
			case SchemaPackage.TYPE_INSTANCE_OBJET__APOUR_CAPACITE_ASSOCIATION_INSTANCE_OBJET_CAPACITE:
				return getAPourCapaciteAssociationInstanceObjetCapacite();
			case SchemaPackage.TYPE_INSTANCE_OBJET__ASSOCIE_COMME_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE:
				return getAssocieCommeObjectifCiblageObjectifCiblage();
			case SchemaPackage.TYPE_INSTANCE_OBJET__APOUR_COMPTAGE_PAR_ACTIVITE_COMPTAGE_PAR_ACTIVITE:
				return getAPourComptageParActiviteComptageParActivite();
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
			case SchemaPackage.TYPE_INSTANCE_OBJET__APOUR_COMPORTEMENT_COMPORTEMENT:
				getAPourComportementComportement().clear();
				getAPourComportementComportement().addAll((Collection<? extends TypeComportement>)newValue);
				return;
			case SchemaPackage.TYPE_INSTANCE_OBJET__EST_AFFILIE_AASSOCIATION_AFFILIATION_INSTANCE_OBJET:
				getEstAffilieAAssociationAffiliationInstanceObjet().clear();
				getEstAffilieAAssociationAffiliationInstanceObjet().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_INSTANCE_OBJET__EST_LOCALISE_PAR_ASSOC_INSTANCE_OBJET_LOCALISATION:
				getEstLocaliseParAssocInstanceObjetLocalisation().clear();
				getEstLocaliseParAssocInstanceObjetLocalisation().addAll((Collection<? extends TypeAssocInstanceObjetLocalisation>)newValue);
				return;
			case SchemaPackage.TYPE_INSTANCE_OBJET__APOUR_DOTATION_EFFECTIVE_DOTATION_EFFECTIVE:
				getAPourDotationEffectiveDotationEffective().clear();
				getAPourDotationEffectiveDotationEffective().addAll((Collection<? extends TypeDotationEffective>)newValue);
				return;
			case SchemaPackage.TYPE_INSTANCE_OBJET__APOUR_DOTATION_THEORIQUE_DOTATION_THEORIQUE_INSTANCE_OBJET:
				getAPourDotationTheoriqueDotationTheoriqueInstanceObjet().clear();
				getAPourDotationTheoriqueDotationTheoriqueInstanceObjet().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_INSTANCE_OBJET__ASSOCIE_COMME_ADRESSE_ASSOCIATION_INSTANCE_OBJET_ADRESSE:
				getAssocieCommeAdresseAssociationInstanceObjetAdresse().clear();
				getAssocieCommeAdresseAssociationInstanceObjetAdresse().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_INSTANCE_OBJET__ASSOCIE_COMME_OBJECTIF_ACTIVITE_OBJECTIF_ACTIVITE:
				getAssocieCommeObjectifActiviteObjectifActivite().clear();
				getAssocieCommeObjectifActiviteObjectifActivite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_INSTANCE_OBJET__EST_PLACE_DANS_ASSOC_CONTEXTE_INSTANCE_OBJET:
				getEstPlaceDansAssocContexteInstanceObjet().clear();
				getEstPlaceDansAssocContexteInstanceObjet().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_INSTANCE_OBJET__APOUR_CAPACITE_ASSOCIATION_INSTANCE_OBJET_CAPACITE:
				getAPourCapaciteAssociationInstanceObjetCapacite().clear();
				getAPourCapaciteAssociationInstanceObjetCapacite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_INSTANCE_OBJET__ASSOCIE_COMME_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE:
				getAssocieCommeObjectifCiblageObjectifCiblage().clear();
				getAssocieCommeObjectifCiblageObjectifCiblage().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_INSTANCE_OBJET__APOUR_COMPTAGE_PAR_ACTIVITE_COMPTAGE_PAR_ACTIVITE:
				getAPourComptageParActiviteComptageParActivite().clear();
				getAPourComptageParActiviteComptageParActivite().addAll((Collection<? extends TypeComptageParActivite>)newValue);
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
			case SchemaPackage.TYPE_INSTANCE_OBJET__APOUR_COMPORTEMENT_COMPORTEMENT:
				getAPourComportementComportement().clear();
				return;
			case SchemaPackage.TYPE_INSTANCE_OBJET__EST_AFFILIE_AASSOCIATION_AFFILIATION_INSTANCE_OBJET:
				getEstAffilieAAssociationAffiliationInstanceObjet().clear();
				return;
			case SchemaPackage.TYPE_INSTANCE_OBJET__EST_LOCALISE_PAR_ASSOC_INSTANCE_OBJET_LOCALISATION:
				getEstLocaliseParAssocInstanceObjetLocalisation().clear();
				return;
			case SchemaPackage.TYPE_INSTANCE_OBJET__APOUR_DOTATION_EFFECTIVE_DOTATION_EFFECTIVE:
				getAPourDotationEffectiveDotationEffective().clear();
				return;
			case SchemaPackage.TYPE_INSTANCE_OBJET__APOUR_DOTATION_THEORIQUE_DOTATION_THEORIQUE_INSTANCE_OBJET:
				getAPourDotationTheoriqueDotationTheoriqueInstanceObjet().clear();
				return;
			case SchemaPackage.TYPE_INSTANCE_OBJET__ASSOCIE_COMME_ADRESSE_ASSOCIATION_INSTANCE_OBJET_ADRESSE:
				getAssocieCommeAdresseAssociationInstanceObjetAdresse().clear();
				return;
			case SchemaPackage.TYPE_INSTANCE_OBJET__ASSOCIE_COMME_OBJECTIF_ACTIVITE_OBJECTIF_ACTIVITE:
				getAssocieCommeObjectifActiviteObjectifActivite().clear();
				return;
			case SchemaPackage.TYPE_INSTANCE_OBJET__EST_PLACE_DANS_ASSOC_CONTEXTE_INSTANCE_OBJET:
				getEstPlaceDansAssocContexteInstanceObjet().clear();
				return;
			case SchemaPackage.TYPE_INSTANCE_OBJET__APOUR_CAPACITE_ASSOCIATION_INSTANCE_OBJET_CAPACITE:
				getAPourCapaciteAssociationInstanceObjetCapacite().clear();
				return;
			case SchemaPackage.TYPE_INSTANCE_OBJET__ASSOCIE_COMME_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE:
				getAssocieCommeObjectifCiblageObjectifCiblage().clear();
				return;
			case SchemaPackage.TYPE_INSTANCE_OBJET__APOUR_COMPTAGE_PAR_ACTIVITE_COMPTAGE_PAR_ACTIVITE:
				getAPourComptageParActiviteComptageParActivite().clear();
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
			case SchemaPackage.TYPE_INSTANCE_OBJET__APOUR_COMPORTEMENT_COMPORTEMENT:
				return aPourComportementComportement != null && !aPourComportementComportement.isEmpty();
			case SchemaPackage.TYPE_INSTANCE_OBJET__EST_AFFILIE_AASSOCIATION_AFFILIATION_INSTANCE_OBJET:
				return estAffilieAAssociationAffiliationInstanceObjet != null && !estAffilieAAssociationAffiliationInstanceObjet.isEmpty();
			case SchemaPackage.TYPE_INSTANCE_OBJET__EST_LOCALISE_PAR_ASSOC_INSTANCE_OBJET_LOCALISATION:
				return estLocaliseParAssocInstanceObjetLocalisation != null && !estLocaliseParAssocInstanceObjetLocalisation.isEmpty();
			case SchemaPackage.TYPE_INSTANCE_OBJET__APOUR_DOTATION_EFFECTIVE_DOTATION_EFFECTIVE:
				return aPourDotationEffectiveDotationEffective != null && !aPourDotationEffectiveDotationEffective.isEmpty();
			case SchemaPackage.TYPE_INSTANCE_OBJET__APOUR_DOTATION_THEORIQUE_DOTATION_THEORIQUE_INSTANCE_OBJET:
				return aPourDotationTheoriqueDotationTheoriqueInstanceObjet != null && !aPourDotationTheoriqueDotationTheoriqueInstanceObjet.isEmpty();
			case SchemaPackage.TYPE_INSTANCE_OBJET__ASSOCIE_COMME_ADRESSE_ASSOCIATION_INSTANCE_OBJET_ADRESSE:
				return associeCommeAdresseAssociationInstanceObjetAdresse != null && !associeCommeAdresseAssociationInstanceObjetAdresse.isEmpty();
			case SchemaPackage.TYPE_INSTANCE_OBJET__ASSOCIE_COMME_OBJECTIF_ACTIVITE_OBJECTIF_ACTIVITE:
				return associeCommeObjectifActiviteObjectifActivite != null && !associeCommeObjectifActiviteObjectifActivite.isEmpty();
			case SchemaPackage.TYPE_INSTANCE_OBJET__EST_PLACE_DANS_ASSOC_CONTEXTE_INSTANCE_OBJET:
				return estPlaceDansAssocContexteInstanceObjet != null && !estPlaceDansAssocContexteInstanceObjet.isEmpty();
			case SchemaPackage.TYPE_INSTANCE_OBJET__APOUR_CAPACITE_ASSOCIATION_INSTANCE_OBJET_CAPACITE:
				return aPourCapaciteAssociationInstanceObjetCapacite != null && !aPourCapaciteAssociationInstanceObjetCapacite.isEmpty();
			case SchemaPackage.TYPE_INSTANCE_OBJET__ASSOCIE_COMME_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE:
				return associeCommeObjectifCiblageObjectifCiblage != null && !associeCommeObjectifCiblageObjectifCiblage.isEmpty();
			case SchemaPackage.TYPE_INSTANCE_OBJET__APOUR_COMPTAGE_PAR_ACTIVITE_COMPTAGE_PAR_ACTIVITE:
				return aPourComptageParActiviteComptageParActivite != null && !aPourComptageParActiviteComptageParActivite.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TypeInstanceObjetImpl
