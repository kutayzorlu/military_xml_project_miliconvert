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
import mpia.schema.TypeDirectivesWEZ;
import mpia.schema.TypeMesureCoordination;
import mpia.schema.TypePeriode3D;

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
 * An implementation of the model object '<em><b>Type Mesure Coordination</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMesureCoordinationImpl#getCodeACM <em>Code ACM</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMesureCoordinationImpl#getBut <em>But</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMesureCoordinationImpl#getInstructionsTransit <em>Instructions Transit</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMesureCoordinationImpl#getReferenceAlerteConflit3D <em>Reference Alerte Conflit3 D</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMesureCoordinationImpl#getEstSoumiseAConsigneTir <em>Est Soumise AConsigne Tir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMesureCoordinationImpl#getAPourDirectivesWEZDirectivesWEZ <em>APour Directives WEZ Directives WEZ</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMesureCoordinationImpl#getEstSujetAssociationMesureCoordinationPlanFeux <em>Est Sujet Association Mesure Coordination Plan Feux</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMesureCoordinationImpl#getEstSujetAssociationMesureCoordMissionAerienne <em>Est Sujet Association Mesure Coord Mission Aerienne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMesureCoordinationImpl#getEstValidePourPeriode3D <em>Est Valide Pour Periode3 D</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMesureCoordinationImpl extends TypeElementControleImpl implements TypeMesureCoordination {
	/**
	 * The default value of the '{@link #getCodeACM() <em>Code ACM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeACM()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_ACM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeACM() <em>Code ACM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeACM()
	 * @generated
	 * @ordered
	 */
	protected String codeACM = CODE_ACM_EDEFAULT;

	/**
	 * The default value of the '{@link #getBut() <em>But</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBut()
	 * @generated
	 * @ordered
	 */
	protected static final String BUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBut() <em>But</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBut()
	 * @generated
	 * @ordered
	 */
	protected String but = BUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstructionsTransit() <em>Instructions Transit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructionsTransit()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTRUCTIONS_TRANSIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstructionsTransit() <em>Instructions Transit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructionsTransit()
	 * @generated
	 * @ordered
	 */
	protected String instructionsTransit = INSTRUCTIONS_TRANSIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReferenceAlerteConflit3D() <em>Reference Alerte Conflit3 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceAlerteConflit3D()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation referenceAlerteConflit3D;

	/**
	 * The cached value of the '{@link #getEstSoumiseAConsigneTir() <em>Est Soumise AConsigne Tir</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSoumiseAConsigneTir()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSoumiseAConsigneTir;

	/**
	 * The cached value of the '{@link #getAPourDirectivesWEZDirectivesWEZ() <em>APour Directives WEZ Directives WEZ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourDirectivesWEZDirectivesWEZ()
	 * @generated
	 * @ordered
	 */
	protected TypeDirectivesWEZ aPourDirectivesWEZDirectivesWEZ;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationMesureCoordinationPlanFeux() <em>Est Sujet Association Mesure Coordination Plan Feux</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationMesureCoordinationPlanFeux()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationMesureCoordinationPlanFeux;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationMesureCoordMissionAerienne() <em>Est Sujet Association Mesure Coord Mission Aerienne</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationMesureCoordMissionAerienne()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationMesureCoordMissionAerienne;

	/**
	 * The cached value of the '{@link #getEstValidePourPeriode3D() <em>Est Valide Pour Periode3 D</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstValidePourPeriode3D()
	 * @generated
	 * @ordered
	 */
	protected EList<TypePeriode3D> estValidePourPeriode3D;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMesureCoordinationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMesureCoordination();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeACM() {
		return codeACM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeACM(String newCodeACM) {
		String oldCodeACM = codeACM;
		codeACM = newCodeACM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MESURE_COORDINATION__CODE_ACM, oldCodeACM, codeACM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBut() {
		return but;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBut(String newBut) {
		String oldBut = but;
		but = newBut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MESURE_COORDINATION__BUT, oldBut, but));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstructionsTransit() {
		return instructionsTransit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstructionsTransit(String newInstructionsTransit) {
		String oldInstructionsTransit = instructionsTransit;
		instructionsTransit = newInstructionsTransit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MESURE_COORDINATION__INSTRUCTIONS_TRANSIT, oldInstructionsTransit, instructionsTransit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getReferenceAlerteConflit3D() {
		return referenceAlerteConflit3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceAlerteConflit3D(TypeAssociation newReferenceAlerteConflit3D, NotificationChain msgs) {
		TypeAssociation oldReferenceAlerteConflit3D = referenceAlerteConflit3D;
		referenceAlerteConflit3D = newReferenceAlerteConflit3D;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MESURE_COORDINATION__REFERENCE_ALERTE_CONFLIT3_D, oldReferenceAlerteConflit3D, newReferenceAlerteConflit3D);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceAlerteConflit3D(TypeAssociation newReferenceAlerteConflit3D) {
		if (newReferenceAlerteConflit3D != referenceAlerteConflit3D) {
			NotificationChain msgs = null;
			if (referenceAlerteConflit3D != null)
				msgs = ((InternalEObject)referenceAlerteConflit3D).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MESURE_COORDINATION__REFERENCE_ALERTE_CONFLIT3_D, null, msgs);
			if (newReferenceAlerteConflit3D != null)
				msgs = ((InternalEObject)newReferenceAlerteConflit3D).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MESURE_COORDINATION__REFERENCE_ALERTE_CONFLIT3_D, null, msgs);
			msgs = basicSetReferenceAlerteConflit3D(newReferenceAlerteConflit3D, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MESURE_COORDINATION__REFERENCE_ALERTE_CONFLIT3_D, newReferenceAlerteConflit3D, newReferenceAlerteConflit3D));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSoumiseAConsigneTir() {
		if (estSoumiseAConsigneTir == null) {
			estSoumiseAConsigneTir = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MESURE_COORDINATION__EST_SOUMISE_ACONSIGNE_TIR);
		}
		return estSoumiseAConsigneTir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDirectivesWEZ getAPourDirectivesWEZDirectivesWEZ() {
		return aPourDirectivesWEZDirectivesWEZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourDirectivesWEZDirectivesWEZ(TypeDirectivesWEZ newAPourDirectivesWEZDirectivesWEZ, NotificationChain msgs) {
		TypeDirectivesWEZ oldAPourDirectivesWEZDirectivesWEZ = aPourDirectivesWEZDirectivesWEZ;
		aPourDirectivesWEZDirectivesWEZ = newAPourDirectivesWEZDirectivesWEZ;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MESURE_COORDINATION__APOUR_DIRECTIVES_WEZ_DIRECTIVES_WEZ, oldAPourDirectivesWEZDirectivesWEZ, newAPourDirectivesWEZDirectivesWEZ);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourDirectivesWEZDirectivesWEZ(TypeDirectivesWEZ newAPourDirectivesWEZDirectivesWEZ) {
		if (newAPourDirectivesWEZDirectivesWEZ != aPourDirectivesWEZDirectivesWEZ) {
			NotificationChain msgs = null;
			if (aPourDirectivesWEZDirectivesWEZ != null)
				msgs = ((InternalEObject)aPourDirectivesWEZDirectivesWEZ).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MESURE_COORDINATION__APOUR_DIRECTIVES_WEZ_DIRECTIVES_WEZ, null, msgs);
			if (newAPourDirectivesWEZDirectivesWEZ != null)
				msgs = ((InternalEObject)newAPourDirectivesWEZDirectivesWEZ).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MESURE_COORDINATION__APOUR_DIRECTIVES_WEZ_DIRECTIVES_WEZ, null, msgs);
			msgs = basicSetAPourDirectivesWEZDirectivesWEZ(newAPourDirectivesWEZDirectivesWEZ, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MESURE_COORDINATION__APOUR_DIRECTIVES_WEZ_DIRECTIVES_WEZ, newAPourDirectivesWEZDirectivesWEZ, newAPourDirectivesWEZDirectivesWEZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationMesureCoordinationPlanFeux() {
		if (estSujetAssociationMesureCoordinationPlanFeux == null) {
			estSujetAssociationMesureCoordinationPlanFeux = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MESURE_COORDINATION__EST_SUJET_ASSOCIATION_MESURE_COORDINATION_PLAN_FEUX);
		}
		return estSujetAssociationMesureCoordinationPlanFeux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationMesureCoordMissionAerienne() {
		if (estSujetAssociationMesureCoordMissionAerienne == null) {
			estSujetAssociationMesureCoordMissionAerienne = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MESURE_COORDINATION__EST_SUJET_ASSOCIATION_MESURE_COORD_MISSION_AERIENNE);
		}
		return estSujetAssociationMesureCoordMissionAerienne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePeriode3D> getEstValidePourPeriode3D() {
		if (estValidePourPeriode3D == null) {
			estValidePourPeriode3D = new EObjectContainmentEList<TypePeriode3D>(TypePeriode3D.class, this, SchemaPackage.TYPE_MESURE_COORDINATION__EST_VALIDE_POUR_PERIODE3_D);
		}
		return estValidePourPeriode3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MESURE_COORDINATION__REFERENCE_ALERTE_CONFLIT3_D:
				return basicSetReferenceAlerteConflit3D(null, msgs);
			case SchemaPackage.TYPE_MESURE_COORDINATION__EST_SOUMISE_ACONSIGNE_TIR:
				return ((InternalEList<?>)getEstSoumiseAConsigneTir()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MESURE_COORDINATION__APOUR_DIRECTIVES_WEZ_DIRECTIVES_WEZ:
				return basicSetAPourDirectivesWEZDirectivesWEZ(null, msgs);
			case SchemaPackage.TYPE_MESURE_COORDINATION__EST_SUJET_ASSOCIATION_MESURE_COORDINATION_PLAN_FEUX:
				return ((InternalEList<?>)getEstSujetAssociationMesureCoordinationPlanFeux()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MESURE_COORDINATION__EST_SUJET_ASSOCIATION_MESURE_COORD_MISSION_AERIENNE:
				return ((InternalEList<?>)getEstSujetAssociationMesureCoordMissionAerienne()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MESURE_COORDINATION__EST_VALIDE_POUR_PERIODE3_D:
				return ((InternalEList<?>)getEstValidePourPeriode3D()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_MESURE_COORDINATION__CODE_ACM:
				return getCodeACM();
			case SchemaPackage.TYPE_MESURE_COORDINATION__BUT:
				return getBut();
			case SchemaPackage.TYPE_MESURE_COORDINATION__INSTRUCTIONS_TRANSIT:
				return getInstructionsTransit();
			case SchemaPackage.TYPE_MESURE_COORDINATION__REFERENCE_ALERTE_CONFLIT3_D:
				return getReferenceAlerteConflit3D();
			case SchemaPackage.TYPE_MESURE_COORDINATION__EST_SOUMISE_ACONSIGNE_TIR:
				return getEstSoumiseAConsigneTir();
			case SchemaPackage.TYPE_MESURE_COORDINATION__APOUR_DIRECTIVES_WEZ_DIRECTIVES_WEZ:
				return getAPourDirectivesWEZDirectivesWEZ();
			case SchemaPackage.TYPE_MESURE_COORDINATION__EST_SUJET_ASSOCIATION_MESURE_COORDINATION_PLAN_FEUX:
				return getEstSujetAssociationMesureCoordinationPlanFeux();
			case SchemaPackage.TYPE_MESURE_COORDINATION__EST_SUJET_ASSOCIATION_MESURE_COORD_MISSION_AERIENNE:
				return getEstSujetAssociationMesureCoordMissionAerienne();
			case SchemaPackage.TYPE_MESURE_COORDINATION__EST_VALIDE_POUR_PERIODE3_D:
				return getEstValidePourPeriode3D();
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
			case SchemaPackage.TYPE_MESURE_COORDINATION__CODE_ACM:
				setCodeACM((String)newValue);
				return;
			case SchemaPackage.TYPE_MESURE_COORDINATION__BUT:
				setBut((String)newValue);
				return;
			case SchemaPackage.TYPE_MESURE_COORDINATION__INSTRUCTIONS_TRANSIT:
				setInstructionsTransit((String)newValue);
				return;
			case SchemaPackage.TYPE_MESURE_COORDINATION__REFERENCE_ALERTE_CONFLIT3_D:
				setReferenceAlerteConflit3D((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_MESURE_COORDINATION__EST_SOUMISE_ACONSIGNE_TIR:
				getEstSoumiseAConsigneTir().clear();
				getEstSoumiseAConsigneTir().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MESURE_COORDINATION__APOUR_DIRECTIVES_WEZ_DIRECTIVES_WEZ:
				setAPourDirectivesWEZDirectivesWEZ((TypeDirectivesWEZ)newValue);
				return;
			case SchemaPackage.TYPE_MESURE_COORDINATION__EST_SUJET_ASSOCIATION_MESURE_COORDINATION_PLAN_FEUX:
				getEstSujetAssociationMesureCoordinationPlanFeux().clear();
				getEstSujetAssociationMesureCoordinationPlanFeux().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MESURE_COORDINATION__EST_SUJET_ASSOCIATION_MESURE_COORD_MISSION_AERIENNE:
				getEstSujetAssociationMesureCoordMissionAerienne().clear();
				getEstSujetAssociationMesureCoordMissionAerienne().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MESURE_COORDINATION__EST_VALIDE_POUR_PERIODE3_D:
				getEstValidePourPeriode3D().clear();
				getEstValidePourPeriode3D().addAll((Collection<? extends TypePeriode3D>)newValue);
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
			case SchemaPackage.TYPE_MESURE_COORDINATION__CODE_ACM:
				setCodeACM(CODE_ACM_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MESURE_COORDINATION__BUT:
				setBut(BUT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MESURE_COORDINATION__INSTRUCTIONS_TRANSIT:
				setInstructionsTransit(INSTRUCTIONS_TRANSIT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MESURE_COORDINATION__REFERENCE_ALERTE_CONFLIT3_D:
				setReferenceAlerteConflit3D((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_MESURE_COORDINATION__EST_SOUMISE_ACONSIGNE_TIR:
				getEstSoumiseAConsigneTir().clear();
				return;
			case SchemaPackage.TYPE_MESURE_COORDINATION__APOUR_DIRECTIVES_WEZ_DIRECTIVES_WEZ:
				setAPourDirectivesWEZDirectivesWEZ((TypeDirectivesWEZ)null);
				return;
			case SchemaPackage.TYPE_MESURE_COORDINATION__EST_SUJET_ASSOCIATION_MESURE_COORDINATION_PLAN_FEUX:
				getEstSujetAssociationMesureCoordinationPlanFeux().clear();
				return;
			case SchemaPackage.TYPE_MESURE_COORDINATION__EST_SUJET_ASSOCIATION_MESURE_COORD_MISSION_AERIENNE:
				getEstSujetAssociationMesureCoordMissionAerienne().clear();
				return;
			case SchemaPackage.TYPE_MESURE_COORDINATION__EST_VALIDE_POUR_PERIODE3_D:
				getEstValidePourPeriode3D().clear();
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
			case SchemaPackage.TYPE_MESURE_COORDINATION__CODE_ACM:
				return CODE_ACM_EDEFAULT == null ? codeACM != null : !CODE_ACM_EDEFAULT.equals(codeACM);
			case SchemaPackage.TYPE_MESURE_COORDINATION__BUT:
				return BUT_EDEFAULT == null ? but != null : !BUT_EDEFAULT.equals(but);
			case SchemaPackage.TYPE_MESURE_COORDINATION__INSTRUCTIONS_TRANSIT:
				return INSTRUCTIONS_TRANSIT_EDEFAULT == null ? instructionsTransit != null : !INSTRUCTIONS_TRANSIT_EDEFAULT.equals(instructionsTransit);
			case SchemaPackage.TYPE_MESURE_COORDINATION__REFERENCE_ALERTE_CONFLIT3_D:
				return referenceAlerteConflit3D != null;
			case SchemaPackage.TYPE_MESURE_COORDINATION__EST_SOUMISE_ACONSIGNE_TIR:
				return estSoumiseAConsigneTir != null && !estSoumiseAConsigneTir.isEmpty();
			case SchemaPackage.TYPE_MESURE_COORDINATION__APOUR_DIRECTIVES_WEZ_DIRECTIVES_WEZ:
				return aPourDirectivesWEZDirectivesWEZ != null;
			case SchemaPackage.TYPE_MESURE_COORDINATION__EST_SUJET_ASSOCIATION_MESURE_COORDINATION_PLAN_FEUX:
				return estSujetAssociationMesureCoordinationPlanFeux != null && !estSujetAssociationMesureCoordinationPlanFeux.isEmpty();
			case SchemaPackage.TYPE_MESURE_COORDINATION__EST_SUJET_ASSOCIATION_MESURE_COORD_MISSION_AERIENNE:
				return estSujetAssociationMesureCoordMissionAerienne != null && !estSujetAssociationMesureCoordMissionAerienne.isEmpty();
			case SchemaPackage.TYPE_MESURE_COORDINATION__EST_VALIDE_POUR_PERIODE3_D:
				return estValidePourPeriode3D != null && !estValidePourPeriode3D.isEmpty();
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
		result.append(" (codeACM: ");
		result.append(codeACM);
		result.append(", but: ");
		result.append(but);
		result.append(", instructionsTransit: ");
		result.append(instructionsTransit);
		result.append(')');
		return result.toString();
	}

} //TypeMesureCoordinationImpl
