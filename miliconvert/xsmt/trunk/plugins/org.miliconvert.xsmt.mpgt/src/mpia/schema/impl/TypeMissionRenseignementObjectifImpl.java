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
import mpia.schema.TypeComposanteAppui;
import mpia.schema.TypeDictionaryDicoRapportTypeSource;
import mpia.schema.TypeMissionRenseignementObjectif;
import mpia.schema.TypeModalitesAcquisitionObjectif;
import mpia.schema.TypeModalitesEvaluationDegats;

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
 * An implementation of the model object '<em><b>Type Mission Renseignement Objectif</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMissionRenseignementObjectifImpl#getTypeSource <em>Type Source</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionRenseignementObjectifImpl#getAutreTypeSource <em>Autre Type Source</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionRenseignementObjectifImpl#getEstObjetAssociationRenseignementObjMisRenseignementObj <em>Est Objet Association Renseignement Obj Mis Renseignement Obj</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionRenseignementObjectifImpl#getEstSujetAssociationMissionRensObjPlanTraitementObj <em>Est Sujet Association Mission Rens Obj Plan Traitement Obj</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionRenseignementObjectifImpl#getEstSujetAssociationMissionRensObjTraitementObj <em>Est Sujet Association Mission Rens Obj Traitement Obj</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionRenseignementObjectifImpl#getAPourComposanteResponsableComposanteAppui <em>APour Composante Responsable Composante Appui</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionRenseignementObjectifImpl#getAPourACOreferenceListeMesuresCoordination3D <em>APour AC Oreference Liste Mesures Coordination3 D</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionRenseignementObjectifImpl#getAPourVolumeTirMesureCoordination <em>APour Volume Tir Mesure Coordination</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionRenseignementObjectifImpl#getAPourModalitesAcquisitionModalitesAcquisitionObjectif <em>APour Modalites Acquisition Modalites Acquisition Objectif</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionRenseignementObjectifImpl#getAPourModalitesEvaluationDegatsModalitesEvaluationDegats <em>APour Modalites Evaluation Degats Modalites Evaluation Degats</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionRenseignementObjectifImpl#getEstObjetAssociationUniteMissionRensObj <em>Est Objet Association Unite Mission Rens Obj</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMissionRenseignementObjectifImpl extends TypeMissionImpl implements TypeMissionRenseignementObjectif {
	/**
	 * The default value of the '{@link #getTypeSource() <em>Type Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeSource()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoRapportTypeSource TYPE_SOURCE_EDEFAULT = TypeDictionaryDicoRapportTypeSource.AIRREC;

	/**
	 * The cached value of the '{@link #getTypeSource() <em>Type Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeSource()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoRapportTypeSource typeSource = TYPE_SOURCE_EDEFAULT;

	/**
	 * This is true if the Type Source attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeSourceESet;

	/**
	 * The default value of the '{@link #getAutreTypeSource() <em>Autre Type Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreTypeSource()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTRE_TYPE_SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutreTypeSource() <em>Autre Type Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreTypeSource()
	 * @generated
	 * @ordered
	 */
	protected String autreTypeSource = AUTRE_TYPE_SOURCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationRenseignementObjMisRenseignementObj() <em>Est Objet Association Renseignement Obj Mis Renseignement Obj</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationRenseignementObjMisRenseignementObj()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationRenseignementObjMisRenseignementObj;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationMissionRensObjPlanTraitementObj() <em>Est Sujet Association Mission Rens Obj Plan Traitement Obj</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationMissionRensObjPlanTraitementObj()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationMissionRensObjPlanTraitementObj;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationMissionRensObjTraitementObj() <em>Est Sujet Association Mission Rens Obj Traitement Obj</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationMissionRensObjTraitementObj()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationMissionRensObjTraitementObj;

	/**
	 * The cached value of the '{@link #getAPourComposanteResponsableComposanteAppui() <em>APour Composante Responsable Composante Appui</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourComposanteResponsableComposanteAppui()
	 * @generated
	 * @ordered
	 */
	protected TypeComposanteAppui aPourComposanteResponsableComposanteAppui;

	/**
	 * The cached value of the '{@link #getAPourACOreferenceListeMesuresCoordination3D() <em>APour AC Oreference Liste Mesures Coordination3 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourACOreferenceListeMesuresCoordination3D()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourACOreferenceListeMesuresCoordination3D;

	/**
	 * The cached value of the '{@link #getAPourVolumeTirMesureCoordination() <em>APour Volume Tir Mesure Coordination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourVolumeTirMesureCoordination()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourVolumeTirMesureCoordination;

	/**
	 * The cached value of the '{@link #getAPourModalitesAcquisitionModalitesAcquisitionObjectif() <em>APour Modalites Acquisition Modalites Acquisition Objectif</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourModalitesAcquisitionModalitesAcquisitionObjectif()
	 * @generated
	 * @ordered
	 */
	protected TypeModalitesAcquisitionObjectif aPourModalitesAcquisitionModalitesAcquisitionObjectif;

	/**
	 * The cached value of the '{@link #getAPourModalitesEvaluationDegatsModalitesEvaluationDegats() <em>APour Modalites Evaluation Degats Modalites Evaluation Degats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourModalitesEvaluationDegatsModalitesEvaluationDegats()
	 * @generated
	 * @ordered
	 */
	protected TypeModalitesEvaluationDegats aPourModalitesEvaluationDegatsModalitesEvaluationDegats;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationUniteMissionRensObj() <em>Est Objet Association Unite Mission Rens Obj</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationUniteMissionRensObj()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationUniteMissionRensObj;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMissionRenseignementObjectifImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMissionRenseignementObjectif();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoRapportTypeSource getTypeSource() {
		return typeSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeSource(TypeDictionaryDicoRapportTypeSource newTypeSource) {
		TypeDictionaryDicoRapportTypeSource oldTypeSource = typeSource;
		typeSource = newTypeSource == null ? TYPE_SOURCE_EDEFAULT : newTypeSource;
		boolean oldTypeSourceESet = typeSourceESet;
		typeSourceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__TYPE_SOURCE, oldTypeSource, typeSource, !oldTypeSourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeSource() {
		TypeDictionaryDicoRapportTypeSource oldTypeSource = typeSource;
		boolean oldTypeSourceESet = typeSourceESet;
		typeSource = TYPE_SOURCE_EDEFAULT;
		typeSourceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__TYPE_SOURCE, oldTypeSource, TYPE_SOURCE_EDEFAULT, oldTypeSourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeSource() {
		return typeSourceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutreTypeSource() {
		return autreTypeSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutreTypeSource(String newAutreTypeSource) {
		String oldAutreTypeSource = autreTypeSource;
		autreTypeSource = newAutreTypeSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__AUTRE_TYPE_SOURCE, oldAutreTypeSource, autreTypeSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationRenseignementObjMisRenseignementObj() {
		if (estObjetAssociationRenseignementObjMisRenseignementObj == null) {
			estObjetAssociationRenseignementObjMisRenseignementObj = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__EST_OBJET_ASSOCIATION_RENSEIGNEMENT_OBJ_MIS_RENSEIGNEMENT_OBJ);
		}
		return estObjetAssociationRenseignementObjMisRenseignementObj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationMissionRensObjPlanTraitementObj() {
		if (estSujetAssociationMissionRensObjPlanTraitementObj == null) {
			estSujetAssociationMissionRensObjPlanTraitementObj = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__EST_SUJET_ASSOCIATION_MISSION_RENS_OBJ_PLAN_TRAITEMENT_OBJ);
		}
		return estSujetAssociationMissionRensObjPlanTraitementObj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationMissionRensObjTraitementObj() {
		if (estSujetAssociationMissionRensObjTraitementObj == null) {
			estSujetAssociationMissionRensObjTraitementObj = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__EST_SUJET_ASSOCIATION_MISSION_RENS_OBJ_TRAITEMENT_OBJ);
		}
		return estSujetAssociationMissionRensObjTraitementObj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeComposanteAppui getAPourComposanteResponsableComposanteAppui() {
		return aPourComposanteResponsableComposanteAppui;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourComposanteResponsableComposanteAppui(TypeComposanteAppui newAPourComposanteResponsableComposanteAppui, NotificationChain msgs) {
		TypeComposanteAppui oldAPourComposanteResponsableComposanteAppui = aPourComposanteResponsableComposanteAppui;
		aPourComposanteResponsableComposanteAppui = newAPourComposanteResponsableComposanteAppui;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__APOUR_COMPOSANTE_RESPONSABLE_COMPOSANTE_APPUI, oldAPourComposanteResponsableComposanteAppui, newAPourComposanteResponsableComposanteAppui);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourComposanteResponsableComposanteAppui(TypeComposanteAppui newAPourComposanteResponsableComposanteAppui) {
		if (newAPourComposanteResponsableComposanteAppui != aPourComposanteResponsableComposanteAppui) {
			NotificationChain msgs = null;
			if (aPourComposanteResponsableComposanteAppui != null)
				msgs = ((InternalEObject)aPourComposanteResponsableComposanteAppui).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__APOUR_COMPOSANTE_RESPONSABLE_COMPOSANTE_APPUI, null, msgs);
			if (newAPourComposanteResponsableComposanteAppui != null)
				msgs = ((InternalEObject)newAPourComposanteResponsableComposanteAppui).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__APOUR_COMPOSANTE_RESPONSABLE_COMPOSANTE_APPUI, null, msgs);
			msgs = basicSetAPourComposanteResponsableComposanteAppui(newAPourComposanteResponsableComposanteAppui, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__APOUR_COMPOSANTE_RESPONSABLE_COMPOSANTE_APPUI, newAPourComposanteResponsableComposanteAppui, newAPourComposanteResponsableComposanteAppui));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourACOreferenceListeMesuresCoordination3D() {
		return aPourACOreferenceListeMesuresCoordination3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourACOreferenceListeMesuresCoordination3D(TypeAssociation newAPourACOreferenceListeMesuresCoordination3D, NotificationChain msgs) {
		TypeAssociation oldAPourACOreferenceListeMesuresCoordination3D = aPourACOreferenceListeMesuresCoordination3D;
		aPourACOreferenceListeMesuresCoordination3D = newAPourACOreferenceListeMesuresCoordination3D;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__APOUR_AC_OREFERENCE_LISTE_MESURES_COORDINATION3_D, oldAPourACOreferenceListeMesuresCoordination3D, newAPourACOreferenceListeMesuresCoordination3D);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourACOreferenceListeMesuresCoordination3D(TypeAssociation newAPourACOreferenceListeMesuresCoordination3D) {
		if (newAPourACOreferenceListeMesuresCoordination3D != aPourACOreferenceListeMesuresCoordination3D) {
			NotificationChain msgs = null;
			if (aPourACOreferenceListeMesuresCoordination3D != null)
				msgs = ((InternalEObject)aPourACOreferenceListeMesuresCoordination3D).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__APOUR_AC_OREFERENCE_LISTE_MESURES_COORDINATION3_D, null, msgs);
			if (newAPourACOreferenceListeMesuresCoordination3D != null)
				msgs = ((InternalEObject)newAPourACOreferenceListeMesuresCoordination3D).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__APOUR_AC_OREFERENCE_LISTE_MESURES_COORDINATION3_D, null, msgs);
			msgs = basicSetAPourACOreferenceListeMesuresCoordination3D(newAPourACOreferenceListeMesuresCoordination3D, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__APOUR_AC_OREFERENCE_LISTE_MESURES_COORDINATION3_D, newAPourACOreferenceListeMesuresCoordination3D, newAPourACOreferenceListeMesuresCoordination3D));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourVolumeTirMesureCoordination() {
		return aPourVolumeTirMesureCoordination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourVolumeTirMesureCoordination(TypeAssociation newAPourVolumeTirMesureCoordination, NotificationChain msgs) {
		TypeAssociation oldAPourVolumeTirMesureCoordination = aPourVolumeTirMesureCoordination;
		aPourVolumeTirMesureCoordination = newAPourVolumeTirMesureCoordination;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__APOUR_VOLUME_TIR_MESURE_COORDINATION, oldAPourVolumeTirMesureCoordination, newAPourVolumeTirMesureCoordination);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourVolumeTirMesureCoordination(TypeAssociation newAPourVolumeTirMesureCoordination) {
		if (newAPourVolumeTirMesureCoordination != aPourVolumeTirMesureCoordination) {
			NotificationChain msgs = null;
			if (aPourVolumeTirMesureCoordination != null)
				msgs = ((InternalEObject)aPourVolumeTirMesureCoordination).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__APOUR_VOLUME_TIR_MESURE_COORDINATION, null, msgs);
			if (newAPourVolumeTirMesureCoordination != null)
				msgs = ((InternalEObject)newAPourVolumeTirMesureCoordination).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__APOUR_VOLUME_TIR_MESURE_COORDINATION, null, msgs);
			msgs = basicSetAPourVolumeTirMesureCoordination(newAPourVolumeTirMesureCoordination, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__APOUR_VOLUME_TIR_MESURE_COORDINATION, newAPourVolumeTirMesureCoordination, newAPourVolumeTirMesureCoordination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeModalitesAcquisitionObjectif getAPourModalitesAcquisitionModalitesAcquisitionObjectif() {
		return aPourModalitesAcquisitionModalitesAcquisitionObjectif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourModalitesAcquisitionModalitesAcquisitionObjectif(TypeModalitesAcquisitionObjectif newAPourModalitesAcquisitionModalitesAcquisitionObjectif, NotificationChain msgs) {
		TypeModalitesAcquisitionObjectif oldAPourModalitesAcquisitionModalitesAcquisitionObjectif = aPourModalitesAcquisitionModalitesAcquisitionObjectif;
		aPourModalitesAcquisitionModalitesAcquisitionObjectif = newAPourModalitesAcquisitionModalitesAcquisitionObjectif;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__APOUR_MODALITES_ACQUISITION_MODALITES_ACQUISITION_OBJECTIF, oldAPourModalitesAcquisitionModalitesAcquisitionObjectif, newAPourModalitesAcquisitionModalitesAcquisitionObjectif);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourModalitesAcquisitionModalitesAcquisitionObjectif(TypeModalitesAcquisitionObjectif newAPourModalitesAcquisitionModalitesAcquisitionObjectif) {
		if (newAPourModalitesAcquisitionModalitesAcquisitionObjectif != aPourModalitesAcquisitionModalitesAcquisitionObjectif) {
			NotificationChain msgs = null;
			if (aPourModalitesAcquisitionModalitesAcquisitionObjectif != null)
				msgs = ((InternalEObject)aPourModalitesAcquisitionModalitesAcquisitionObjectif).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__APOUR_MODALITES_ACQUISITION_MODALITES_ACQUISITION_OBJECTIF, null, msgs);
			if (newAPourModalitesAcquisitionModalitesAcquisitionObjectif != null)
				msgs = ((InternalEObject)newAPourModalitesAcquisitionModalitesAcquisitionObjectif).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__APOUR_MODALITES_ACQUISITION_MODALITES_ACQUISITION_OBJECTIF, null, msgs);
			msgs = basicSetAPourModalitesAcquisitionModalitesAcquisitionObjectif(newAPourModalitesAcquisitionModalitesAcquisitionObjectif, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__APOUR_MODALITES_ACQUISITION_MODALITES_ACQUISITION_OBJECTIF, newAPourModalitesAcquisitionModalitesAcquisitionObjectif, newAPourModalitesAcquisitionModalitesAcquisitionObjectif));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeModalitesEvaluationDegats getAPourModalitesEvaluationDegatsModalitesEvaluationDegats() {
		return aPourModalitesEvaluationDegatsModalitesEvaluationDegats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourModalitesEvaluationDegatsModalitesEvaluationDegats(TypeModalitesEvaluationDegats newAPourModalitesEvaluationDegatsModalitesEvaluationDegats, NotificationChain msgs) {
		TypeModalitesEvaluationDegats oldAPourModalitesEvaluationDegatsModalitesEvaluationDegats = aPourModalitesEvaluationDegatsModalitesEvaluationDegats;
		aPourModalitesEvaluationDegatsModalitesEvaluationDegats = newAPourModalitesEvaluationDegatsModalitesEvaluationDegats;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__APOUR_MODALITES_EVALUATION_DEGATS_MODALITES_EVALUATION_DEGATS, oldAPourModalitesEvaluationDegatsModalitesEvaluationDegats, newAPourModalitesEvaluationDegatsModalitesEvaluationDegats);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourModalitesEvaluationDegatsModalitesEvaluationDegats(TypeModalitesEvaluationDegats newAPourModalitesEvaluationDegatsModalitesEvaluationDegats) {
		if (newAPourModalitesEvaluationDegatsModalitesEvaluationDegats != aPourModalitesEvaluationDegatsModalitesEvaluationDegats) {
			NotificationChain msgs = null;
			if (aPourModalitesEvaluationDegatsModalitesEvaluationDegats != null)
				msgs = ((InternalEObject)aPourModalitesEvaluationDegatsModalitesEvaluationDegats).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__APOUR_MODALITES_EVALUATION_DEGATS_MODALITES_EVALUATION_DEGATS, null, msgs);
			if (newAPourModalitesEvaluationDegatsModalitesEvaluationDegats != null)
				msgs = ((InternalEObject)newAPourModalitesEvaluationDegatsModalitesEvaluationDegats).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__APOUR_MODALITES_EVALUATION_DEGATS_MODALITES_EVALUATION_DEGATS, null, msgs);
			msgs = basicSetAPourModalitesEvaluationDegatsModalitesEvaluationDegats(newAPourModalitesEvaluationDegatsModalitesEvaluationDegats, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__APOUR_MODALITES_EVALUATION_DEGATS_MODALITES_EVALUATION_DEGATS, newAPourModalitesEvaluationDegatsModalitesEvaluationDegats, newAPourModalitesEvaluationDegatsModalitesEvaluationDegats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationUniteMissionRensObj() {
		if (estObjetAssociationUniteMissionRensObj == null) {
			estObjetAssociationUniteMissionRensObj = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__EST_OBJET_ASSOCIATION_UNITE_MISSION_RENS_OBJ);
		}
		return estObjetAssociationUniteMissionRensObj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__EST_OBJET_ASSOCIATION_RENSEIGNEMENT_OBJ_MIS_RENSEIGNEMENT_OBJ:
				return ((InternalEList<?>)getEstObjetAssociationRenseignementObjMisRenseignementObj()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__EST_SUJET_ASSOCIATION_MISSION_RENS_OBJ_PLAN_TRAITEMENT_OBJ:
				return ((InternalEList<?>)getEstSujetAssociationMissionRensObjPlanTraitementObj()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__EST_SUJET_ASSOCIATION_MISSION_RENS_OBJ_TRAITEMENT_OBJ:
				return ((InternalEList<?>)getEstSujetAssociationMissionRensObjTraitementObj()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__APOUR_COMPOSANTE_RESPONSABLE_COMPOSANTE_APPUI:
				return basicSetAPourComposanteResponsableComposanteAppui(null, msgs);
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__APOUR_AC_OREFERENCE_LISTE_MESURES_COORDINATION3_D:
				return basicSetAPourACOreferenceListeMesuresCoordination3D(null, msgs);
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__APOUR_VOLUME_TIR_MESURE_COORDINATION:
				return basicSetAPourVolumeTirMesureCoordination(null, msgs);
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__APOUR_MODALITES_ACQUISITION_MODALITES_ACQUISITION_OBJECTIF:
				return basicSetAPourModalitesAcquisitionModalitesAcquisitionObjectif(null, msgs);
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__APOUR_MODALITES_EVALUATION_DEGATS_MODALITES_EVALUATION_DEGATS:
				return basicSetAPourModalitesEvaluationDegatsModalitesEvaluationDegats(null, msgs);
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__EST_OBJET_ASSOCIATION_UNITE_MISSION_RENS_OBJ:
				return ((InternalEList<?>)getEstObjetAssociationUniteMissionRensObj()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__TYPE_SOURCE:
				return getTypeSource();
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__AUTRE_TYPE_SOURCE:
				return getAutreTypeSource();
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__EST_OBJET_ASSOCIATION_RENSEIGNEMENT_OBJ_MIS_RENSEIGNEMENT_OBJ:
				return getEstObjetAssociationRenseignementObjMisRenseignementObj();
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__EST_SUJET_ASSOCIATION_MISSION_RENS_OBJ_PLAN_TRAITEMENT_OBJ:
				return getEstSujetAssociationMissionRensObjPlanTraitementObj();
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__EST_SUJET_ASSOCIATION_MISSION_RENS_OBJ_TRAITEMENT_OBJ:
				return getEstSujetAssociationMissionRensObjTraitementObj();
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__APOUR_COMPOSANTE_RESPONSABLE_COMPOSANTE_APPUI:
				return getAPourComposanteResponsableComposanteAppui();
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__APOUR_AC_OREFERENCE_LISTE_MESURES_COORDINATION3_D:
				return getAPourACOreferenceListeMesuresCoordination3D();
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__APOUR_VOLUME_TIR_MESURE_COORDINATION:
				return getAPourVolumeTirMesureCoordination();
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__APOUR_MODALITES_ACQUISITION_MODALITES_ACQUISITION_OBJECTIF:
				return getAPourModalitesAcquisitionModalitesAcquisitionObjectif();
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__APOUR_MODALITES_EVALUATION_DEGATS_MODALITES_EVALUATION_DEGATS:
				return getAPourModalitesEvaluationDegatsModalitesEvaluationDegats();
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__EST_OBJET_ASSOCIATION_UNITE_MISSION_RENS_OBJ:
				return getEstObjetAssociationUniteMissionRensObj();
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
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__TYPE_SOURCE:
				setTypeSource((TypeDictionaryDicoRapportTypeSource)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__AUTRE_TYPE_SOURCE:
				setAutreTypeSource((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__EST_OBJET_ASSOCIATION_RENSEIGNEMENT_OBJ_MIS_RENSEIGNEMENT_OBJ:
				getEstObjetAssociationRenseignementObjMisRenseignementObj().clear();
				getEstObjetAssociationRenseignementObjMisRenseignementObj().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__EST_SUJET_ASSOCIATION_MISSION_RENS_OBJ_PLAN_TRAITEMENT_OBJ:
				getEstSujetAssociationMissionRensObjPlanTraitementObj().clear();
				getEstSujetAssociationMissionRensObjPlanTraitementObj().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__EST_SUJET_ASSOCIATION_MISSION_RENS_OBJ_TRAITEMENT_OBJ:
				getEstSujetAssociationMissionRensObjTraitementObj().clear();
				getEstSujetAssociationMissionRensObjTraitementObj().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__APOUR_COMPOSANTE_RESPONSABLE_COMPOSANTE_APPUI:
				setAPourComposanteResponsableComposanteAppui((TypeComposanteAppui)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__APOUR_AC_OREFERENCE_LISTE_MESURES_COORDINATION3_D:
				setAPourACOreferenceListeMesuresCoordination3D((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__APOUR_VOLUME_TIR_MESURE_COORDINATION:
				setAPourVolumeTirMesureCoordination((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__APOUR_MODALITES_ACQUISITION_MODALITES_ACQUISITION_OBJECTIF:
				setAPourModalitesAcquisitionModalitesAcquisitionObjectif((TypeModalitesAcquisitionObjectif)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__APOUR_MODALITES_EVALUATION_DEGATS_MODALITES_EVALUATION_DEGATS:
				setAPourModalitesEvaluationDegatsModalitesEvaluationDegats((TypeModalitesEvaluationDegats)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__EST_OBJET_ASSOCIATION_UNITE_MISSION_RENS_OBJ:
				getEstObjetAssociationUniteMissionRensObj().clear();
				getEstObjetAssociationUniteMissionRensObj().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__TYPE_SOURCE:
				unsetTypeSource();
				return;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__AUTRE_TYPE_SOURCE:
				setAutreTypeSource(AUTRE_TYPE_SOURCE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__EST_OBJET_ASSOCIATION_RENSEIGNEMENT_OBJ_MIS_RENSEIGNEMENT_OBJ:
				getEstObjetAssociationRenseignementObjMisRenseignementObj().clear();
				return;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__EST_SUJET_ASSOCIATION_MISSION_RENS_OBJ_PLAN_TRAITEMENT_OBJ:
				getEstSujetAssociationMissionRensObjPlanTraitementObj().clear();
				return;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__EST_SUJET_ASSOCIATION_MISSION_RENS_OBJ_TRAITEMENT_OBJ:
				getEstSujetAssociationMissionRensObjTraitementObj().clear();
				return;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__APOUR_COMPOSANTE_RESPONSABLE_COMPOSANTE_APPUI:
				setAPourComposanteResponsableComposanteAppui((TypeComposanteAppui)null);
				return;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__APOUR_AC_OREFERENCE_LISTE_MESURES_COORDINATION3_D:
				setAPourACOreferenceListeMesuresCoordination3D((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__APOUR_VOLUME_TIR_MESURE_COORDINATION:
				setAPourVolumeTirMesureCoordination((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__APOUR_MODALITES_ACQUISITION_MODALITES_ACQUISITION_OBJECTIF:
				setAPourModalitesAcquisitionModalitesAcquisitionObjectif((TypeModalitesAcquisitionObjectif)null);
				return;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__APOUR_MODALITES_EVALUATION_DEGATS_MODALITES_EVALUATION_DEGATS:
				setAPourModalitesEvaluationDegatsModalitesEvaluationDegats((TypeModalitesEvaluationDegats)null);
				return;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__EST_OBJET_ASSOCIATION_UNITE_MISSION_RENS_OBJ:
				getEstObjetAssociationUniteMissionRensObj().clear();
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
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__TYPE_SOURCE:
				return isSetTypeSource();
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__AUTRE_TYPE_SOURCE:
				return AUTRE_TYPE_SOURCE_EDEFAULT == null ? autreTypeSource != null : !AUTRE_TYPE_SOURCE_EDEFAULT.equals(autreTypeSource);
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__EST_OBJET_ASSOCIATION_RENSEIGNEMENT_OBJ_MIS_RENSEIGNEMENT_OBJ:
				return estObjetAssociationRenseignementObjMisRenseignementObj != null && !estObjetAssociationRenseignementObjMisRenseignementObj.isEmpty();
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__EST_SUJET_ASSOCIATION_MISSION_RENS_OBJ_PLAN_TRAITEMENT_OBJ:
				return estSujetAssociationMissionRensObjPlanTraitementObj != null && !estSujetAssociationMissionRensObjPlanTraitementObj.isEmpty();
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__EST_SUJET_ASSOCIATION_MISSION_RENS_OBJ_TRAITEMENT_OBJ:
				return estSujetAssociationMissionRensObjTraitementObj != null && !estSujetAssociationMissionRensObjTraitementObj.isEmpty();
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__APOUR_COMPOSANTE_RESPONSABLE_COMPOSANTE_APPUI:
				return aPourComposanteResponsableComposanteAppui != null;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__APOUR_AC_OREFERENCE_LISTE_MESURES_COORDINATION3_D:
				return aPourACOreferenceListeMesuresCoordination3D != null;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__APOUR_VOLUME_TIR_MESURE_COORDINATION:
				return aPourVolumeTirMesureCoordination != null;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__APOUR_MODALITES_ACQUISITION_MODALITES_ACQUISITION_OBJECTIF:
				return aPourModalitesAcquisitionModalitesAcquisitionObjectif != null;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__APOUR_MODALITES_EVALUATION_DEGATS_MODALITES_EVALUATION_DEGATS:
				return aPourModalitesEvaluationDegatsModalitesEvaluationDegats != null;
			case SchemaPackage.TYPE_MISSION_RENSEIGNEMENT_OBJECTIF__EST_OBJET_ASSOCIATION_UNITE_MISSION_RENS_OBJ:
				return estObjetAssociationUniteMissionRensObj != null && !estObjetAssociationUniteMissionRensObj.isEmpty();
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
		result.append(" (typeSource: ");
		if (typeSourceESet) result.append(typeSource); else result.append("<unset>");
		result.append(", autreTypeSource: ");
		result.append(autreTypeSource);
		result.append(')');
		return result.toString();
	}

} //TypeMissionRenseignementObjectifImpl
