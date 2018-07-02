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
import mpia.schema.TypeAutorisationListeObjectifsCandidats;
import mpia.schema.TypeListeObjectifsCandidats;

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
 * An implementation of the model object '<em><b>Type Liste Objectifs Candidats</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeListeObjectifsCandidatsImpl#getEstDefinieDansCadrePlanFeux <em>Est Definie Dans Cadre Plan Feux</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeListeObjectifsCandidatsImpl#getACommeAutorisationAutorisationListeObjectifsCandidats <em>AComme Autorisation Autorisation Liste Objectifs Candidats</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeListeObjectifsCandidatsImpl#getContraintAssocListeObjCandListeObjCand <em>Contraint Assoc Liste Obj Cand Liste Obj Cand</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeListeObjectifsCandidatsImpl#getDependAssocListeObjCandListeObjCand <em>Depend Assoc Liste Obj Cand Liste Obj Cand</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeListeObjectifsCandidatsImpl extends TypeListeObjectifsImpl implements TypeListeObjectifsCandidats {
	/**
	 * The cached value of the '{@link #getEstDefinieDansCadrePlanFeux() <em>Est Definie Dans Cadre Plan Feux</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstDefinieDansCadrePlanFeux()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation estDefinieDansCadrePlanFeux;

	/**
	 * The cached value of the '{@link #getACommeAutorisationAutorisationListeObjectifsCandidats() <em>AComme Autorisation Autorisation Liste Objectifs Candidats</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeAutorisationAutorisationListeObjectifsCandidats()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAutorisationListeObjectifsCandidats> aCommeAutorisationAutorisationListeObjectifsCandidats;

	/**
	 * The cached value of the '{@link #getContraintAssocListeObjCandListeObjCand() <em>Contraint Assoc Liste Obj Cand Liste Obj Cand</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContraintAssocListeObjCandListeObjCand()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> contraintAssocListeObjCandListeObjCand;

	/**
	 * The cached value of the '{@link #getDependAssocListeObjCandListeObjCand() <em>Depend Assoc Liste Obj Cand Liste Obj Cand</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependAssocListeObjCandListeObjCand()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> dependAssocListeObjCandListeObjCand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeListeObjectifsCandidatsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeListeObjectifsCandidats();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getEstDefinieDansCadrePlanFeux() {
		return estDefinieDansCadrePlanFeux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstDefinieDansCadrePlanFeux(TypeAssociation newEstDefinieDansCadrePlanFeux, NotificationChain msgs) {
		TypeAssociation oldEstDefinieDansCadrePlanFeux = estDefinieDansCadrePlanFeux;
		estDefinieDansCadrePlanFeux = newEstDefinieDansCadrePlanFeux;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LISTE_OBJECTIFS_CANDIDATS__EST_DEFINIE_DANS_CADRE_PLAN_FEUX, oldEstDefinieDansCadrePlanFeux, newEstDefinieDansCadrePlanFeux);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstDefinieDansCadrePlanFeux(TypeAssociation newEstDefinieDansCadrePlanFeux) {
		if (newEstDefinieDansCadrePlanFeux != estDefinieDansCadrePlanFeux) {
			NotificationChain msgs = null;
			if (estDefinieDansCadrePlanFeux != null)
				msgs = ((InternalEObject)estDefinieDansCadrePlanFeux).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_LISTE_OBJECTIFS_CANDIDATS__EST_DEFINIE_DANS_CADRE_PLAN_FEUX, null, msgs);
			if (newEstDefinieDansCadrePlanFeux != null)
				msgs = ((InternalEObject)newEstDefinieDansCadrePlanFeux).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_LISTE_OBJECTIFS_CANDIDATS__EST_DEFINIE_DANS_CADRE_PLAN_FEUX, null, msgs);
			msgs = basicSetEstDefinieDansCadrePlanFeux(newEstDefinieDansCadrePlanFeux, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LISTE_OBJECTIFS_CANDIDATS__EST_DEFINIE_DANS_CADRE_PLAN_FEUX, newEstDefinieDansCadrePlanFeux, newEstDefinieDansCadrePlanFeux));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAutorisationListeObjectifsCandidats> getACommeAutorisationAutorisationListeObjectifsCandidats() {
		if (aCommeAutorisationAutorisationListeObjectifsCandidats == null) {
			aCommeAutorisationAutorisationListeObjectifsCandidats = new EObjectContainmentEList<TypeAutorisationListeObjectifsCandidats>(TypeAutorisationListeObjectifsCandidats.class, this, SchemaPackage.TYPE_LISTE_OBJECTIFS_CANDIDATS__ACOMME_AUTORISATION_AUTORISATION_LISTE_OBJECTIFS_CANDIDATS);
		}
		return aCommeAutorisationAutorisationListeObjectifsCandidats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getContraintAssocListeObjCandListeObjCand() {
		if (contraintAssocListeObjCandListeObjCand == null) {
			contraintAssocListeObjCandListeObjCand = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_LISTE_OBJECTIFS_CANDIDATS__CONTRAINT_ASSOC_LISTE_OBJ_CAND_LISTE_OBJ_CAND);
		}
		return contraintAssocListeObjCandListeObjCand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getDependAssocListeObjCandListeObjCand() {
		if (dependAssocListeObjCandListeObjCand == null) {
			dependAssocListeObjCandListeObjCand = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_LISTE_OBJECTIFS_CANDIDATS__DEPEND_ASSOC_LISTE_OBJ_CAND_LISTE_OBJ_CAND);
		}
		return dependAssocListeObjCandListeObjCand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_LISTE_OBJECTIFS_CANDIDATS__EST_DEFINIE_DANS_CADRE_PLAN_FEUX:
				return basicSetEstDefinieDansCadrePlanFeux(null, msgs);
			case SchemaPackage.TYPE_LISTE_OBJECTIFS_CANDIDATS__ACOMME_AUTORISATION_AUTORISATION_LISTE_OBJECTIFS_CANDIDATS:
				return ((InternalEList<?>)getACommeAutorisationAutorisationListeObjectifsCandidats()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_LISTE_OBJECTIFS_CANDIDATS__CONTRAINT_ASSOC_LISTE_OBJ_CAND_LISTE_OBJ_CAND:
				return ((InternalEList<?>)getContraintAssocListeObjCandListeObjCand()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_LISTE_OBJECTIFS_CANDIDATS__DEPEND_ASSOC_LISTE_OBJ_CAND_LISTE_OBJ_CAND:
				return ((InternalEList<?>)getDependAssocListeObjCandListeObjCand()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_LISTE_OBJECTIFS_CANDIDATS__EST_DEFINIE_DANS_CADRE_PLAN_FEUX:
				return getEstDefinieDansCadrePlanFeux();
			case SchemaPackage.TYPE_LISTE_OBJECTIFS_CANDIDATS__ACOMME_AUTORISATION_AUTORISATION_LISTE_OBJECTIFS_CANDIDATS:
				return getACommeAutorisationAutorisationListeObjectifsCandidats();
			case SchemaPackage.TYPE_LISTE_OBJECTIFS_CANDIDATS__CONTRAINT_ASSOC_LISTE_OBJ_CAND_LISTE_OBJ_CAND:
				return getContraintAssocListeObjCandListeObjCand();
			case SchemaPackage.TYPE_LISTE_OBJECTIFS_CANDIDATS__DEPEND_ASSOC_LISTE_OBJ_CAND_LISTE_OBJ_CAND:
				return getDependAssocListeObjCandListeObjCand();
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
			case SchemaPackage.TYPE_LISTE_OBJECTIFS_CANDIDATS__EST_DEFINIE_DANS_CADRE_PLAN_FEUX:
				setEstDefinieDansCadrePlanFeux((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_LISTE_OBJECTIFS_CANDIDATS__ACOMME_AUTORISATION_AUTORISATION_LISTE_OBJECTIFS_CANDIDATS:
				getACommeAutorisationAutorisationListeObjectifsCandidats().clear();
				getACommeAutorisationAutorisationListeObjectifsCandidats().addAll((Collection<? extends TypeAutorisationListeObjectifsCandidats>)newValue);
				return;
			case SchemaPackage.TYPE_LISTE_OBJECTIFS_CANDIDATS__CONTRAINT_ASSOC_LISTE_OBJ_CAND_LISTE_OBJ_CAND:
				getContraintAssocListeObjCandListeObjCand().clear();
				getContraintAssocListeObjCandListeObjCand().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_LISTE_OBJECTIFS_CANDIDATS__DEPEND_ASSOC_LISTE_OBJ_CAND_LISTE_OBJ_CAND:
				getDependAssocListeObjCandListeObjCand().clear();
				getDependAssocListeObjCandListeObjCand().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_LISTE_OBJECTIFS_CANDIDATS__EST_DEFINIE_DANS_CADRE_PLAN_FEUX:
				setEstDefinieDansCadrePlanFeux((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_LISTE_OBJECTIFS_CANDIDATS__ACOMME_AUTORISATION_AUTORISATION_LISTE_OBJECTIFS_CANDIDATS:
				getACommeAutorisationAutorisationListeObjectifsCandidats().clear();
				return;
			case SchemaPackage.TYPE_LISTE_OBJECTIFS_CANDIDATS__CONTRAINT_ASSOC_LISTE_OBJ_CAND_LISTE_OBJ_CAND:
				getContraintAssocListeObjCandListeObjCand().clear();
				return;
			case SchemaPackage.TYPE_LISTE_OBJECTIFS_CANDIDATS__DEPEND_ASSOC_LISTE_OBJ_CAND_LISTE_OBJ_CAND:
				getDependAssocListeObjCandListeObjCand().clear();
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
			case SchemaPackage.TYPE_LISTE_OBJECTIFS_CANDIDATS__EST_DEFINIE_DANS_CADRE_PLAN_FEUX:
				return estDefinieDansCadrePlanFeux != null;
			case SchemaPackage.TYPE_LISTE_OBJECTIFS_CANDIDATS__ACOMME_AUTORISATION_AUTORISATION_LISTE_OBJECTIFS_CANDIDATS:
				return aCommeAutorisationAutorisationListeObjectifsCandidats != null && !aCommeAutorisationAutorisationListeObjectifsCandidats.isEmpty();
			case SchemaPackage.TYPE_LISTE_OBJECTIFS_CANDIDATS__CONTRAINT_ASSOC_LISTE_OBJ_CAND_LISTE_OBJ_CAND:
				return contraintAssocListeObjCandListeObjCand != null && !contraintAssocListeObjCandListeObjCand.isEmpty();
			case SchemaPackage.TYPE_LISTE_OBJECTIFS_CANDIDATS__DEPEND_ASSOC_LISTE_OBJ_CAND_LISTE_OBJ_CAND:
				return dependAssocListeObjCandListeObjCand != null && !dependAssocListeObjCandListeObjCand.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TypeListeObjectifsCandidatsImpl
