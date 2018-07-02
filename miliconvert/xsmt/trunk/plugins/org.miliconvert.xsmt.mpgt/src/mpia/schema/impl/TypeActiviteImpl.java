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
import mpia.schema.TypeActivite;
import mpia.schema.TypeAssociationActiviteLocalisation;
import mpia.schema.TypeComportement;
import mpia.schema.TypeEffet;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Activite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeActiviteImpl#getAPourComportementComportement <em>APour Comportement Comportement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActiviteImpl#getCorrespondAHoraireManoeuvre <em>Correspond AHoraire Manoeuvre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActiviteImpl#getAPourObjectifObjectifActivite <em>APour Objectif Objectif Activite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActiviteImpl#getAPourEffetEffet <em>APour Effet Effet</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActiviteImpl#getEstSujetAssociationActiviteLocalisation <em>Est Sujet Association Activite Localisation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActiviteImpl#getEstObjetAssociationTemporelleActivite <em>Est Objet Association Temporelle Activite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActiviteImpl#getEstSujetAssociationTemporelleActivite <em>Est Sujet Association Temporelle Activite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActiviteImpl#getEstAssocieeAPersonne <em>Est Associee APersonne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActiviteImpl#getEstActiviteAssociationActiviteCapacite <em>Est Activite Association Activite Capacite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActiviteImpl#getEstPlaceeDansAssocActiviteContexte <em>Est Placee Dans Assoc Activite Contexte</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypeActiviteImpl extends TypeRacineOperationnelleImpl implements TypeActivite {
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
	 * The cached value of the '{@link #getCorrespondAHoraireManoeuvre() <em>Correspond AHoraire Manoeuvre</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrespondAHoraireManoeuvre()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> correspondAHoraireManoeuvre;

	/**
	 * The cached value of the '{@link #getAPourObjectifObjectifActivite() <em>APour Objectif Objectif Activite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourObjectifObjectifActivite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourObjectifObjectifActivite;

	/**
	 * The cached value of the '{@link #getAPourEffetEffet() <em>APour Effet Effet</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourEffetEffet()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeEffet> aPourEffetEffet;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationActiviteLocalisation() <em>Est Sujet Association Activite Localisation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationActiviteLocalisation()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociationActiviteLocalisation> estSujetAssociationActiviteLocalisation;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationTemporelleActivite() <em>Est Objet Association Temporelle Activite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationTemporelleActivite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationTemporelleActivite;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationTemporelleActivite() <em>Est Sujet Association Temporelle Activite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationTemporelleActivite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationTemporelleActivite;

	/**
	 * The cached value of the '{@link #getEstAssocieeAPersonne() <em>Est Associee APersonne</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstAssocieeAPersonne()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estAssocieeAPersonne;

	/**
	 * The cached value of the '{@link #getEstActiviteAssociationActiviteCapacite() <em>Est Activite Association Activite Capacite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstActiviteAssociationActiviteCapacite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estActiviteAssociationActiviteCapacite;

	/**
	 * The cached value of the '{@link #getEstPlaceeDansAssocActiviteContexte() <em>Est Placee Dans Assoc Activite Contexte</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstPlaceeDansAssocActiviteContexte()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estPlaceeDansAssocActiviteContexte;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeActiviteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeActivite();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeComportement> getAPourComportementComportement() {
		if (aPourComportementComportement == null) {
			aPourComportementComportement = new EObjectContainmentEList<TypeComportement>(TypeComportement.class, this, SchemaPackage.TYPE_ACTIVITE__APOUR_COMPORTEMENT_COMPORTEMENT);
		}
		return aPourComportementComportement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getCorrespondAHoraireManoeuvre() {
		if (correspondAHoraireManoeuvre == null) {
			correspondAHoraireManoeuvre = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ACTIVITE__CORRESPOND_AHORAIRE_MANOEUVRE);
		}
		return correspondAHoraireManoeuvre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourObjectifObjectifActivite() {
		if (aPourObjectifObjectifActivite == null) {
			aPourObjectifObjectifActivite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ACTIVITE__APOUR_OBJECTIF_OBJECTIF_ACTIVITE);
		}
		return aPourObjectifObjectifActivite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEffet> getAPourEffetEffet() {
		if (aPourEffetEffet == null) {
			aPourEffetEffet = new EObjectContainmentEList<TypeEffet>(TypeEffet.class, this, SchemaPackage.TYPE_ACTIVITE__APOUR_EFFET_EFFET);
		}
		return aPourEffetEffet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationActiviteLocalisation> getEstSujetAssociationActiviteLocalisation() {
		if (estSujetAssociationActiviteLocalisation == null) {
			estSujetAssociationActiviteLocalisation = new EObjectContainmentEList<TypeAssociationActiviteLocalisation>(TypeAssociationActiviteLocalisation.class, this, SchemaPackage.TYPE_ACTIVITE__EST_SUJET_ASSOCIATION_ACTIVITE_LOCALISATION);
		}
		return estSujetAssociationActiviteLocalisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationTemporelleActivite() {
		if (estObjetAssociationTemporelleActivite == null) {
			estObjetAssociationTemporelleActivite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ACTIVITE__EST_OBJET_ASSOCIATION_TEMPORELLE_ACTIVITE);
		}
		return estObjetAssociationTemporelleActivite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationTemporelleActivite() {
		if (estSujetAssociationTemporelleActivite == null) {
			estSujetAssociationTemporelleActivite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ACTIVITE__EST_SUJET_ASSOCIATION_TEMPORELLE_ACTIVITE);
		}
		return estSujetAssociationTemporelleActivite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstAssocieeAPersonne() {
		if (estAssocieeAPersonne == null) {
			estAssocieeAPersonne = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ACTIVITE__EST_ASSOCIEE_APERSONNE);
		}
		return estAssocieeAPersonne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstActiviteAssociationActiviteCapacite() {
		if (estActiviteAssociationActiviteCapacite == null) {
			estActiviteAssociationActiviteCapacite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ACTIVITE__EST_ACTIVITE_ASSOCIATION_ACTIVITE_CAPACITE);
		}
		return estActiviteAssociationActiviteCapacite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstPlaceeDansAssocActiviteContexte() {
		if (estPlaceeDansAssocActiviteContexte == null) {
			estPlaceeDansAssocActiviteContexte = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ACTIVITE__EST_PLACEE_DANS_ASSOC_ACTIVITE_CONTEXTE);
		}
		return estPlaceeDansAssocActiviteContexte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ACTIVITE__APOUR_COMPORTEMENT_COMPORTEMENT:
				return ((InternalEList<?>)getAPourComportementComportement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ACTIVITE__CORRESPOND_AHORAIRE_MANOEUVRE:
				return ((InternalEList<?>)getCorrespondAHoraireManoeuvre()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ACTIVITE__APOUR_OBJECTIF_OBJECTIF_ACTIVITE:
				return ((InternalEList<?>)getAPourObjectifObjectifActivite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ACTIVITE__APOUR_EFFET_EFFET:
				return ((InternalEList<?>)getAPourEffetEffet()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ACTIVITE__EST_SUJET_ASSOCIATION_ACTIVITE_LOCALISATION:
				return ((InternalEList<?>)getEstSujetAssociationActiviteLocalisation()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ACTIVITE__EST_OBJET_ASSOCIATION_TEMPORELLE_ACTIVITE:
				return ((InternalEList<?>)getEstObjetAssociationTemporelleActivite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ACTIVITE__EST_SUJET_ASSOCIATION_TEMPORELLE_ACTIVITE:
				return ((InternalEList<?>)getEstSujetAssociationTemporelleActivite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ACTIVITE__EST_ASSOCIEE_APERSONNE:
				return ((InternalEList<?>)getEstAssocieeAPersonne()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ACTIVITE__EST_ACTIVITE_ASSOCIATION_ACTIVITE_CAPACITE:
				return ((InternalEList<?>)getEstActiviteAssociationActiviteCapacite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ACTIVITE__EST_PLACEE_DANS_ASSOC_ACTIVITE_CONTEXTE:
				return ((InternalEList<?>)getEstPlaceeDansAssocActiviteContexte()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_ACTIVITE__APOUR_COMPORTEMENT_COMPORTEMENT:
				return getAPourComportementComportement();
			case SchemaPackage.TYPE_ACTIVITE__CORRESPOND_AHORAIRE_MANOEUVRE:
				return getCorrespondAHoraireManoeuvre();
			case SchemaPackage.TYPE_ACTIVITE__APOUR_OBJECTIF_OBJECTIF_ACTIVITE:
				return getAPourObjectifObjectifActivite();
			case SchemaPackage.TYPE_ACTIVITE__APOUR_EFFET_EFFET:
				return getAPourEffetEffet();
			case SchemaPackage.TYPE_ACTIVITE__EST_SUJET_ASSOCIATION_ACTIVITE_LOCALISATION:
				return getEstSujetAssociationActiviteLocalisation();
			case SchemaPackage.TYPE_ACTIVITE__EST_OBJET_ASSOCIATION_TEMPORELLE_ACTIVITE:
				return getEstObjetAssociationTemporelleActivite();
			case SchemaPackage.TYPE_ACTIVITE__EST_SUJET_ASSOCIATION_TEMPORELLE_ACTIVITE:
				return getEstSujetAssociationTemporelleActivite();
			case SchemaPackage.TYPE_ACTIVITE__EST_ASSOCIEE_APERSONNE:
				return getEstAssocieeAPersonne();
			case SchemaPackage.TYPE_ACTIVITE__EST_ACTIVITE_ASSOCIATION_ACTIVITE_CAPACITE:
				return getEstActiviteAssociationActiviteCapacite();
			case SchemaPackage.TYPE_ACTIVITE__EST_PLACEE_DANS_ASSOC_ACTIVITE_CONTEXTE:
				return getEstPlaceeDansAssocActiviteContexte();
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
			case SchemaPackage.TYPE_ACTIVITE__APOUR_COMPORTEMENT_COMPORTEMENT:
				getAPourComportementComportement().clear();
				getAPourComportementComportement().addAll((Collection<? extends TypeComportement>)newValue);
				return;
			case SchemaPackage.TYPE_ACTIVITE__CORRESPOND_AHORAIRE_MANOEUVRE:
				getCorrespondAHoraireManoeuvre().clear();
				getCorrespondAHoraireManoeuvre().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ACTIVITE__APOUR_OBJECTIF_OBJECTIF_ACTIVITE:
				getAPourObjectifObjectifActivite().clear();
				getAPourObjectifObjectifActivite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ACTIVITE__APOUR_EFFET_EFFET:
				getAPourEffetEffet().clear();
				getAPourEffetEffet().addAll((Collection<? extends TypeEffet>)newValue);
				return;
			case SchemaPackage.TYPE_ACTIVITE__EST_SUJET_ASSOCIATION_ACTIVITE_LOCALISATION:
				getEstSujetAssociationActiviteLocalisation().clear();
				getEstSujetAssociationActiviteLocalisation().addAll((Collection<? extends TypeAssociationActiviteLocalisation>)newValue);
				return;
			case SchemaPackage.TYPE_ACTIVITE__EST_OBJET_ASSOCIATION_TEMPORELLE_ACTIVITE:
				getEstObjetAssociationTemporelleActivite().clear();
				getEstObjetAssociationTemporelleActivite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ACTIVITE__EST_SUJET_ASSOCIATION_TEMPORELLE_ACTIVITE:
				getEstSujetAssociationTemporelleActivite().clear();
				getEstSujetAssociationTemporelleActivite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ACTIVITE__EST_ASSOCIEE_APERSONNE:
				getEstAssocieeAPersonne().clear();
				getEstAssocieeAPersonne().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ACTIVITE__EST_ACTIVITE_ASSOCIATION_ACTIVITE_CAPACITE:
				getEstActiviteAssociationActiviteCapacite().clear();
				getEstActiviteAssociationActiviteCapacite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ACTIVITE__EST_PLACEE_DANS_ASSOC_ACTIVITE_CONTEXTE:
				getEstPlaceeDansAssocActiviteContexte().clear();
				getEstPlaceeDansAssocActiviteContexte().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_ACTIVITE__APOUR_COMPORTEMENT_COMPORTEMENT:
				getAPourComportementComportement().clear();
				return;
			case SchemaPackage.TYPE_ACTIVITE__CORRESPOND_AHORAIRE_MANOEUVRE:
				getCorrespondAHoraireManoeuvre().clear();
				return;
			case SchemaPackage.TYPE_ACTIVITE__APOUR_OBJECTIF_OBJECTIF_ACTIVITE:
				getAPourObjectifObjectifActivite().clear();
				return;
			case SchemaPackage.TYPE_ACTIVITE__APOUR_EFFET_EFFET:
				getAPourEffetEffet().clear();
				return;
			case SchemaPackage.TYPE_ACTIVITE__EST_SUJET_ASSOCIATION_ACTIVITE_LOCALISATION:
				getEstSujetAssociationActiviteLocalisation().clear();
				return;
			case SchemaPackage.TYPE_ACTIVITE__EST_OBJET_ASSOCIATION_TEMPORELLE_ACTIVITE:
				getEstObjetAssociationTemporelleActivite().clear();
				return;
			case SchemaPackage.TYPE_ACTIVITE__EST_SUJET_ASSOCIATION_TEMPORELLE_ACTIVITE:
				getEstSujetAssociationTemporelleActivite().clear();
				return;
			case SchemaPackage.TYPE_ACTIVITE__EST_ASSOCIEE_APERSONNE:
				getEstAssocieeAPersonne().clear();
				return;
			case SchemaPackage.TYPE_ACTIVITE__EST_ACTIVITE_ASSOCIATION_ACTIVITE_CAPACITE:
				getEstActiviteAssociationActiviteCapacite().clear();
				return;
			case SchemaPackage.TYPE_ACTIVITE__EST_PLACEE_DANS_ASSOC_ACTIVITE_CONTEXTE:
				getEstPlaceeDansAssocActiviteContexte().clear();
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
			case SchemaPackage.TYPE_ACTIVITE__APOUR_COMPORTEMENT_COMPORTEMENT:
				return aPourComportementComportement != null && !aPourComportementComportement.isEmpty();
			case SchemaPackage.TYPE_ACTIVITE__CORRESPOND_AHORAIRE_MANOEUVRE:
				return correspondAHoraireManoeuvre != null && !correspondAHoraireManoeuvre.isEmpty();
			case SchemaPackage.TYPE_ACTIVITE__APOUR_OBJECTIF_OBJECTIF_ACTIVITE:
				return aPourObjectifObjectifActivite != null && !aPourObjectifObjectifActivite.isEmpty();
			case SchemaPackage.TYPE_ACTIVITE__APOUR_EFFET_EFFET:
				return aPourEffetEffet != null && !aPourEffetEffet.isEmpty();
			case SchemaPackage.TYPE_ACTIVITE__EST_SUJET_ASSOCIATION_ACTIVITE_LOCALISATION:
				return estSujetAssociationActiviteLocalisation != null && !estSujetAssociationActiviteLocalisation.isEmpty();
			case SchemaPackage.TYPE_ACTIVITE__EST_OBJET_ASSOCIATION_TEMPORELLE_ACTIVITE:
				return estObjetAssociationTemporelleActivite != null && !estObjetAssociationTemporelleActivite.isEmpty();
			case SchemaPackage.TYPE_ACTIVITE__EST_SUJET_ASSOCIATION_TEMPORELLE_ACTIVITE:
				return estSujetAssociationTemporelleActivite != null && !estSujetAssociationTemporelleActivite.isEmpty();
			case SchemaPackage.TYPE_ACTIVITE__EST_ASSOCIEE_APERSONNE:
				return estAssocieeAPersonne != null && !estAssocieeAPersonne.isEmpty();
			case SchemaPackage.TYPE_ACTIVITE__EST_ACTIVITE_ASSOCIATION_ACTIVITE_CAPACITE:
				return estActiviteAssociationActiviteCapacite != null && !estActiviteAssociationActiviteCapacite.isEmpty();
			case SchemaPackage.TYPE_ACTIVITE__EST_PLACEE_DANS_ASSOC_ACTIVITE_CONTEXTE:
				return estPlaceeDansAssocActiviteContexte != null && !estPlaceeDansAssocActiviteContexte.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TypeActiviteImpl
