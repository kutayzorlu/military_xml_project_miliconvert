/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeArticulationASS;
import mpia.schema.TypeDictionaryDicoArticulationASSTypeRepartition;
import mpia.schema.TypeDictionaryDicoTypeDLO;
import mpia.schema.TypeDictionaryDicoTypeMissionASS;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Articulation ASS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeArticulationASSImpl#getTypeRepartition <em>Type Repartition</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeArticulationASSImpl#getTypeDLO <em>Type DLO</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeArticulationASSImpl#getTypeDLOnonRenseigne <em>Type DL Onon Renseigne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeArticulationASSImpl#getNatureMission <em>Nature Mission</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeArticulationASSImpl#getNbEquipesLiaison <em>Nb Equipes Liaison</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeArticulationASSImpl#getNbEquipesObservation <em>Nb Equipes Observation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeArticulationASSImpl#getNbEquipesRadar <em>Nb Equipes Radar</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeArticulationASSImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeArticulationASSImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeArticulationASSImpl#getACommeUniteFournisseurUnite <em>AComme Unite Fournisseur Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeArticulationASSImpl#getACommeUniteBeneficiaireUnite <em>AComme Unite Beneficiaire Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeArticulationASSImpl#getAPourCoordonneesRadioAdresseRadio <em>APour Coordonnees Radio Adresse Radio</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeArticulationASSImpl#getEstCaracteriseParTypeUnite <em>Est Caracterise Par Type Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeArticulationASSImpl extends EObjectImpl implements TypeArticulationASS {
	/**
	 * The default value of the '{@link #getTypeRepartition() <em>Type Repartition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeRepartition()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoArticulationASSTypeRepartition TYPE_REPARTITION_EDEFAULT = TypeDictionaryDicoArticulationASSTypeRepartition.AUTONO;

	/**
	 * The cached value of the '{@link #getTypeRepartition() <em>Type Repartition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeRepartition()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoArticulationASSTypeRepartition typeRepartition = TYPE_REPARTITION_EDEFAULT;

	/**
	 * This is true if the Type Repartition attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeRepartitionESet;

	/**
	 * The default value of the '{@link #getTypeDLO() <em>Type DLO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDLO()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeDLO TYPE_DLO_EDEFAULT = TypeDictionaryDicoTypeDLO.LOD;

	/**
	 * The cached value of the '{@link #getTypeDLO() <em>Type DLO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDLO()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeDLO typeDLO = TYPE_DLO_EDEFAULT;

	/**
	 * This is true if the Type DLO attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeDLOESet;

	/**
	 * The default value of the '{@link #getTypeDLOnonRenseigne() <em>Type DL Onon Renseigne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDLOnonRenseigne()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_DL_ONON_RENSEIGNE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeDLOnonRenseigne() <em>Type DL Onon Renseigne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDLOnonRenseigne()
	 * @generated
	 * @ordered
	 */
	protected String typeDLOnonRenseigne = TYPE_DL_ONON_RENSEIGNE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNatureMission() <em>Nature Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatureMission()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeMissionASS NATURE_MISSION_EDEFAULT = TypeDictionaryDicoTypeMissionASS.CBATT;

	/**
	 * The cached value of the '{@link #getNatureMission() <em>Nature Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatureMission()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeMissionASS natureMission = NATURE_MISSION_EDEFAULT;

	/**
	 * This is true if the Nature Mission attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean natureMissionESet;

	/**
	 * The default value of the '{@link #getNbEquipesLiaison() <em>Nb Equipes Liaison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbEquipesLiaison()
	 * @generated
	 * @ordered
	 */
	protected static final long NB_EQUIPES_LIAISON_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNbEquipesLiaison() <em>Nb Equipes Liaison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbEquipesLiaison()
	 * @generated
	 * @ordered
	 */
	protected long nbEquipesLiaison = NB_EQUIPES_LIAISON_EDEFAULT;

	/**
	 * This is true if the Nb Equipes Liaison attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nbEquipesLiaisonESet;

	/**
	 * The default value of the '{@link #getNbEquipesObservation() <em>Nb Equipes Observation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbEquipesObservation()
	 * @generated
	 * @ordered
	 */
	protected static final long NB_EQUIPES_OBSERVATION_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNbEquipesObservation() <em>Nb Equipes Observation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbEquipesObservation()
	 * @generated
	 * @ordered
	 */
	protected long nbEquipesObservation = NB_EQUIPES_OBSERVATION_EDEFAULT;

	/**
	 * This is true if the Nb Equipes Observation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nbEquipesObservationESet;

	/**
	 * The default value of the '{@link #getNbEquipesRadar() <em>Nb Equipes Radar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbEquipesRadar()
	 * @generated
	 * @ordered
	 */
	protected static final long NB_EQUIPES_RADAR_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNbEquipesRadar() <em>Nb Equipes Radar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbEquipesRadar()
	 * @generated
	 * @ordered
	 */
	protected long nbEquipesRadar = NB_EQUIPES_RADAR_EDEFAULT;

	/**
	 * This is true if the Nb Equipes Radar attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nbEquipesRadarESet;

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
	 * The cached value of the '{@link #getACommeUniteFournisseurUnite() <em>AComme Unite Fournisseur Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeUniteFournisseurUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aCommeUniteFournisseurUnite;

	/**
	 * The cached value of the '{@link #getACommeUniteBeneficiaireUnite() <em>AComme Unite Beneficiaire Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeUniteBeneficiaireUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aCommeUniteBeneficiaireUnite;

	/**
	 * The cached value of the '{@link #getAPourCoordonneesRadioAdresseRadio() <em>APour Coordonnees Radio Adresse Radio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCoordonneesRadioAdresseRadio()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourCoordonneesRadioAdresseRadio;

	/**
	 * The cached value of the '{@link #getEstCaracteriseParTypeUnite() <em>Est Caracterise Par Type Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstCaracteriseParTypeUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT estCaracteriseParTypeUnite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeArticulationASSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeArticulationASS();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoArticulationASSTypeRepartition getTypeRepartition() {
		return typeRepartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeRepartition(TypeDictionaryDicoArticulationASSTypeRepartition newTypeRepartition) {
		TypeDictionaryDicoArticulationASSTypeRepartition oldTypeRepartition = typeRepartition;
		typeRepartition = newTypeRepartition == null ? TYPE_REPARTITION_EDEFAULT : newTypeRepartition;
		boolean oldTypeRepartitionESet = typeRepartitionESet;
		typeRepartitionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ARTICULATION_ASS__TYPE_REPARTITION, oldTypeRepartition, typeRepartition, !oldTypeRepartitionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeRepartition() {
		TypeDictionaryDicoArticulationASSTypeRepartition oldTypeRepartition = typeRepartition;
		boolean oldTypeRepartitionESet = typeRepartitionESet;
		typeRepartition = TYPE_REPARTITION_EDEFAULT;
		typeRepartitionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ARTICULATION_ASS__TYPE_REPARTITION, oldTypeRepartition, TYPE_REPARTITION_EDEFAULT, oldTypeRepartitionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeRepartition() {
		return typeRepartitionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeDLO getTypeDLO() {
		return typeDLO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeDLO(TypeDictionaryDicoTypeDLO newTypeDLO) {
		TypeDictionaryDicoTypeDLO oldTypeDLO = typeDLO;
		typeDLO = newTypeDLO == null ? TYPE_DLO_EDEFAULT : newTypeDLO;
		boolean oldTypeDLOESet = typeDLOESet;
		typeDLOESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ARTICULATION_ASS__TYPE_DLO, oldTypeDLO, typeDLO, !oldTypeDLOESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeDLO() {
		TypeDictionaryDicoTypeDLO oldTypeDLO = typeDLO;
		boolean oldTypeDLOESet = typeDLOESet;
		typeDLO = TYPE_DLO_EDEFAULT;
		typeDLOESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ARTICULATION_ASS__TYPE_DLO, oldTypeDLO, TYPE_DLO_EDEFAULT, oldTypeDLOESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeDLO() {
		return typeDLOESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeDLOnonRenseigne() {
		return typeDLOnonRenseigne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeDLOnonRenseigne(String newTypeDLOnonRenseigne) {
		String oldTypeDLOnonRenseigne = typeDLOnonRenseigne;
		typeDLOnonRenseigne = newTypeDLOnonRenseigne;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ARTICULATION_ASS__TYPE_DL_ONON_RENSEIGNE, oldTypeDLOnonRenseigne, typeDLOnonRenseigne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeMissionASS getNatureMission() {
		return natureMission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNatureMission(TypeDictionaryDicoTypeMissionASS newNatureMission) {
		TypeDictionaryDicoTypeMissionASS oldNatureMission = natureMission;
		natureMission = newNatureMission == null ? NATURE_MISSION_EDEFAULT : newNatureMission;
		boolean oldNatureMissionESet = natureMissionESet;
		natureMissionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ARTICULATION_ASS__NATURE_MISSION, oldNatureMission, natureMission, !oldNatureMissionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNatureMission() {
		TypeDictionaryDicoTypeMissionASS oldNatureMission = natureMission;
		boolean oldNatureMissionESet = natureMissionESet;
		natureMission = NATURE_MISSION_EDEFAULT;
		natureMissionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ARTICULATION_ASS__NATURE_MISSION, oldNatureMission, NATURE_MISSION_EDEFAULT, oldNatureMissionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNatureMission() {
		return natureMissionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNbEquipesLiaison() {
		return nbEquipesLiaison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbEquipesLiaison(long newNbEquipesLiaison) {
		long oldNbEquipesLiaison = nbEquipesLiaison;
		nbEquipesLiaison = newNbEquipesLiaison;
		boolean oldNbEquipesLiaisonESet = nbEquipesLiaisonESet;
		nbEquipesLiaisonESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ARTICULATION_ASS__NB_EQUIPES_LIAISON, oldNbEquipesLiaison, nbEquipesLiaison, !oldNbEquipesLiaisonESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNbEquipesLiaison() {
		long oldNbEquipesLiaison = nbEquipesLiaison;
		boolean oldNbEquipesLiaisonESet = nbEquipesLiaisonESet;
		nbEquipesLiaison = NB_EQUIPES_LIAISON_EDEFAULT;
		nbEquipesLiaisonESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ARTICULATION_ASS__NB_EQUIPES_LIAISON, oldNbEquipesLiaison, NB_EQUIPES_LIAISON_EDEFAULT, oldNbEquipesLiaisonESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNbEquipesLiaison() {
		return nbEquipesLiaisonESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNbEquipesObservation() {
		return nbEquipesObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbEquipesObservation(long newNbEquipesObservation) {
		long oldNbEquipesObservation = nbEquipesObservation;
		nbEquipesObservation = newNbEquipesObservation;
		boolean oldNbEquipesObservationESet = nbEquipesObservationESet;
		nbEquipesObservationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ARTICULATION_ASS__NB_EQUIPES_OBSERVATION, oldNbEquipesObservation, nbEquipesObservation, !oldNbEquipesObservationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNbEquipesObservation() {
		long oldNbEquipesObservation = nbEquipesObservation;
		boolean oldNbEquipesObservationESet = nbEquipesObservationESet;
		nbEquipesObservation = NB_EQUIPES_OBSERVATION_EDEFAULT;
		nbEquipesObservationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ARTICULATION_ASS__NB_EQUIPES_OBSERVATION, oldNbEquipesObservation, NB_EQUIPES_OBSERVATION_EDEFAULT, oldNbEquipesObservationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNbEquipesObservation() {
		return nbEquipesObservationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNbEquipesRadar() {
		return nbEquipesRadar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbEquipesRadar(long newNbEquipesRadar) {
		long oldNbEquipesRadar = nbEquipesRadar;
		nbEquipesRadar = newNbEquipesRadar;
		boolean oldNbEquipesRadarESet = nbEquipesRadarESet;
		nbEquipesRadarESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ARTICULATION_ASS__NB_EQUIPES_RADAR, oldNbEquipesRadar, nbEquipesRadar, !oldNbEquipesRadarESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNbEquipesRadar() {
		long oldNbEquipesRadar = nbEquipesRadar;
		boolean oldNbEquipesRadarESet = nbEquipesRadarESet;
		nbEquipesRadar = NB_EQUIPES_RADAR_EDEFAULT;
		nbEquipesRadarESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ARTICULATION_ASS__NB_EQUIPES_RADAR, oldNbEquipesRadar, NB_EQUIPES_RADAR_EDEFAULT, oldNbEquipesRadarESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNbEquipesRadar() {
		return nbEquipesRadarESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ARTICULATION_ASS__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ARTICULATION_ASS__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getACommeUniteFournisseurUnite() {
		return aCommeUniteFournisseurUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeUniteFournisseurUnite(TypeAssociationEXT newACommeUniteFournisseurUnite, NotificationChain msgs) {
		TypeAssociationEXT oldACommeUniteFournisseurUnite = aCommeUniteFournisseurUnite;
		aCommeUniteFournisseurUnite = newACommeUniteFournisseurUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ARTICULATION_ASS__ACOMME_UNITE_FOURNISSEUR_UNITE, oldACommeUniteFournisseurUnite, newACommeUniteFournisseurUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeUniteFournisseurUnite(TypeAssociationEXT newACommeUniteFournisseurUnite) {
		if (newACommeUniteFournisseurUnite != aCommeUniteFournisseurUnite) {
			NotificationChain msgs = null;
			if (aCommeUniteFournisseurUnite != null)
				msgs = ((InternalEObject)aCommeUniteFournisseurUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ARTICULATION_ASS__ACOMME_UNITE_FOURNISSEUR_UNITE, null, msgs);
			if (newACommeUniteFournisseurUnite != null)
				msgs = ((InternalEObject)newACommeUniteFournisseurUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ARTICULATION_ASS__ACOMME_UNITE_FOURNISSEUR_UNITE, null, msgs);
			msgs = basicSetACommeUniteFournisseurUnite(newACommeUniteFournisseurUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ARTICULATION_ASS__ACOMME_UNITE_FOURNISSEUR_UNITE, newACommeUniteFournisseurUnite, newACommeUniteFournisseurUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getACommeUniteBeneficiaireUnite() {
		return aCommeUniteBeneficiaireUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeUniteBeneficiaireUnite(TypeAssociationEXT newACommeUniteBeneficiaireUnite, NotificationChain msgs) {
		TypeAssociationEXT oldACommeUniteBeneficiaireUnite = aCommeUniteBeneficiaireUnite;
		aCommeUniteBeneficiaireUnite = newACommeUniteBeneficiaireUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ARTICULATION_ASS__ACOMME_UNITE_BENEFICIAIRE_UNITE, oldACommeUniteBeneficiaireUnite, newACommeUniteBeneficiaireUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeUniteBeneficiaireUnite(TypeAssociationEXT newACommeUniteBeneficiaireUnite) {
		if (newACommeUniteBeneficiaireUnite != aCommeUniteBeneficiaireUnite) {
			NotificationChain msgs = null;
			if (aCommeUniteBeneficiaireUnite != null)
				msgs = ((InternalEObject)aCommeUniteBeneficiaireUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ARTICULATION_ASS__ACOMME_UNITE_BENEFICIAIRE_UNITE, null, msgs);
			if (newACommeUniteBeneficiaireUnite != null)
				msgs = ((InternalEObject)newACommeUniteBeneficiaireUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ARTICULATION_ASS__ACOMME_UNITE_BENEFICIAIRE_UNITE, null, msgs);
			msgs = basicSetACommeUniteBeneficiaireUnite(newACommeUniteBeneficiaireUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ARTICULATION_ASS__ACOMME_UNITE_BENEFICIAIRE_UNITE, newACommeUniteBeneficiaireUnite, newACommeUniteBeneficiaireUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourCoordonneesRadioAdresseRadio() {
		return aPourCoordonneesRadioAdresseRadio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourCoordonneesRadioAdresseRadio(TypeAssociation newAPourCoordonneesRadioAdresseRadio, NotificationChain msgs) {
		TypeAssociation oldAPourCoordonneesRadioAdresseRadio = aPourCoordonneesRadioAdresseRadio;
		aPourCoordonneesRadioAdresseRadio = newAPourCoordonneesRadioAdresseRadio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ARTICULATION_ASS__APOUR_COORDONNEES_RADIO_ADRESSE_RADIO, oldAPourCoordonneesRadioAdresseRadio, newAPourCoordonneesRadioAdresseRadio);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourCoordonneesRadioAdresseRadio(TypeAssociation newAPourCoordonneesRadioAdresseRadio) {
		if (newAPourCoordonneesRadioAdresseRadio != aPourCoordonneesRadioAdresseRadio) {
			NotificationChain msgs = null;
			if (aPourCoordonneesRadioAdresseRadio != null)
				msgs = ((InternalEObject)aPourCoordonneesRadioAdresseRadio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ARTICULATION_ASS__APOUR_COORDONNEES_RADIO_ADRESSE_RADIO, null, msgs);
			if (newAPourCoordonneesRadioAdresseRadio != null)
				msgs = ((InternalEObject)newAPourCoordonneesRadioAdresseRadio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ARTICULATION_ASS__APOUR_COORDONNEES_RADIO_ADRESSE_RADIO, null, msgs);
			msgs = basicSetAPourCoordonneesRadioAdresseRadio(newAPourCoordonneesRadioAdresseRadio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ARTICULATION_ASS__APOUR_COORDONNEES_RADIO_ADRESSE_RADIO, newAPourCoordonneesRadioAdresseRadio, newAPourCoordonneesRadioAdresseRadio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getEstCaracteriseParTypeUnite() {
		return estCaracteriseParTypeUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstCaracteriseParTypeUnite(TypeAssociationEXT newEstCaracteriseParTypeUnite, NotificationChain msgs) {
		TypeAssociationEXT oldEstCaracteriseParTypeUnite = estCaracteriseParTypeUnite;
		estCaracteriseParTypeUnite = newEstCaracteriseParTypeUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ARTICULATION_ASS__EST_CARACTERISE_PAR_TYPE_UNITE, oldEstCaracteriseParTypeUnite, newEstCaracteriseParTypeUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstCaracteriseParTypeUnite(TypeAssociationEXT newEstCaracteriseParTypeUnite) {
		if (newEstCaracteriseParTypeUnite != estCaracteriseParTypeUnite) {
			NotificationChain msgs = null;
			if (estCaracteriseParTypeUnite != null)
				msgs = ((InternalEObject)estCaracteriseParTypeUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ARTICULATION_ASS__EST_CARACTERISE_PAR_TYPE_UNITE, null, msgs);
			if (newEstCaracteriseParTypeUnite != null)
				msgs = ((InternalEObject)newEstCaracteriseParTypeUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ARTICULATION_ASS__EST_CARACTERISE_PAR_TYPE_UNITE, null, msgs);
			msgs = basicSetEstCaracteriseParTypeUnite(newEstCaracteriseParTypeUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ARTICULATION_ASS__EST_CARACTERISE_PAR_TYPE_UNITE, newEstCaracteriseParTypeUnite, newEstCaracteriseParTypeUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ARTICULATION_ASS__ACOMME_UNITE_FOURNISSEUR_UNITE:
				return basicSetACommeUniteFournisseurUnite(null, msgs);
			case SchemaPackage.TYPE_ARTICULATION_ASS__ACOMME_UNITE_BENEFICIAIRE_UNITE:
				return basicSetACommeUniteBeneficiaireUnite(null, msgs);
			case SchemaPackage.TYPE_ARTICULATION_ASS__APOUR_COORDONNEES_RADIO_ADRESSE_RADIO:
				return basicSetAPourCoordonneesRadioAdresseRadio(null, msgs);
			case SchemaPackage.TYPE_ARTICULATION_ASS__EST_CARACTERISE_PAR_TYPE_UNITE:
				return basicSetEstCaracteriseParTypeUnite(null, msgs);
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
			case SchemaPackage.TYPE_ARTICULATION_ASS__TYPE_REPARTITION:
				return getTypeRepartition();
			case SchemaPackage.TYPE_ARTICULATION_ASS__TYPE_DLO:
				return getTypeDLO();
			case SchemaPackage.TYPE_ARTICULATION_ASS__TYPE_DL_ONON_RENSEIGNE:
				return getTypeDLOnonRenseigne();
			case SchemaPackage.TYPE_ARTICULATION_ASS__NATURE_MISSION:
				return getNatureMission();
			case SchemaPackage.TYPE_ARTICULATION_ASS__NB_EQUIPES_LIAISON:
				return new Long(getNbEquipesLiaison());
			case SchemaPackage.TYPE_ARTICULATION_ASS__NB_EQUIPES_OBSERVATION:
				return new Long(getNbEquipesObservation());
			case SchemaPackage.TYPE_ARTICULATION_ASS__NB_EQUIPES_RADAR:
				return new Long(getNbEquipesRadar());
			case SchemaPackage.TYPE_ARTICULATION_ASS__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ARTICULATION_ASS__CE:
				return getCE();
			case SchemaPackage.TYPE_ARTICULATION_ASS__ACOMME_UNITE_FOURNISSEUR_UNITE:
				return getACommeUniteFournisseurUnite();
			case SchemaPackage.TYPE_ARTICULATION_ASS__ACOMME_UNITE_BENEFICIAIRE_UNITE:
				return getACommeUniteBeneficiaireUnite();
			case SchemaPackage.TYPE_ARTICULATION_ASS__APOUR_COORDONNEES_RADIO_ADRESSE_RADIO:
				return getAPourCoordonneesRadioAdresseRadio();
			case SchemaPackage.TYPE_ARTICULATION_ASS__EST_CARACTERISE_PAR_TYPE_UNITE:
				return getEstCaracteriseParTypeUnite();
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
			case SchemaPackage.TYPE_ARTICULATION_ASS__TYPE_REPARTITION:
				setTypeRepartition((TypeDictionaryDicoArticulationASSTypeRepartition)newValue);
				return;
			case SchemaPackage.TYPE_ARTICULATION_ASS__TYPE_DLO:
				setTypeDLO((TypeDictionaryDicoTypeDLO)newValue);
				return;
			case SchemaPackage.TYPE_ARTICULATION_ASS__TYPE_DL_ONON_RENSEIGNE:
				setTypeDLOnonRenseigne((String)newValue);
				return;
			case SchemaPackage.TYPE_ARTICULATION_ASS__NATURE_MISSION:
				setNatureMission((TypeDictionaryDicoTypeMissionASS)newValue);
				return;
			case SchemaPackage.TYPE_ARTICULATION_ASS__NB_EQUIPES_LIAISON:
				setNbEquipesLiaison(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_ARTICULATION_ASS__NB_EQUIPES_OBSERVATION:
				setNbEquipesObservation(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_ARTICULATION_ASS__NB_EQUIPES_RADAR:
				setNbEquipesRadar(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_ARTICULATION_ASS__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ARTICULATION_ASS__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ARTICULATION_ASS__ACOMME_UNITE_FOURNISSEUR_UNITE:
				setACommeUniteFournisseurUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_ARTICULATION_ASS__ACOMME_UNITE_BENEFICIAIRE_UNITE:
				setACommeUniteBeneficiaireUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_ARTICULATION_ASS__APOUR_COORDONNEES_RADIO_ADRESSE_RADIO:
				setAPourCoordonneesRadioAdresseRadio((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ARTICULATION_ASS__EST_CARACTERISE_PAR_TYPE_UNITE:
				setEstCaracteriseParTypeUnite((TypeAssociationEXT)newValue);
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
			case SchemaPackage.TYPE_ARTICULATION_ASS__TYPE_REPARTITION:
				unsetTypeRepartition();
				return;
			case SchemaPackage.TYPE_ARTICULATION_ASS__TYPE_DLO:
				unsetTypeDLO();
				return;
			case SchemaPackage.TYPE_ARTICULATION_ASS__TYPE_DL_ONON_RENSEIGNE:
				setTypeDLOnonRenseigne(TYPE_DL_ONON_RENSEIGNE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ARTICULATION_ASS__NATURE_MISSION:
				unsetNatureMission();
				return;
			case SchemaPackage.TYPE_ARTICULATION_ASS__NB_EQUIPES_LIAISON:
				unsetNbEquipesLiaison();
				return;
			case SchemaPackage.TYPE_ARTICULATION_ASS__NB_EQUIPES_OBSERVATION:
				unsetNbEquipesObservation();
				return;
			case SchemaPackage.TYPE_ARTICULATION_ASS__NB_EQUIPES_RADAR:
				unsetNbEquipesRadar();
				return;
			case SchemaPackage.TYPE_ARTICULATION_ASS__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ARTICULATION_ASS__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ARTICULATION_ASS__ACOMME_UNITE_FOURNISSEUR_UNITE:
				setACommeUniteFournisseurUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_ARTICULATION_ASS__ACOMME_UNITE_BENEFICIAIRE_UNITE:
				setACommeUniteBeneficiaireUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_ARTICULATION_ASS__APOUR_COORDONNEES_RADIO_ADRESSE_RADIO:
				setAPourCoordonneesRadioAdresseRadio((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ARTICULATION_ASS__EST_CARACTERISE_PAR_TYPE_UNITE:
				setEstCaracteriseParTypeUnite((TypeAssociationEXT)null);
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
			case SchemaPackage.TYPE_ARTICULATION_ASS__TYPE_REPARTITION:
				return isSetTypeRepartition();
			case SchemaPackage.TYPE_ARTICULATION_ASS__TYPE_DLO:
				return isSetTypeDLO();
			case SchemaPackage.TYPE_ARTICULATION_ASS__TYPE_DL_ONON_RENSEIGNE:
				return TYPE_DL_ONON_RENSEIGNE_EDEFAULT == null ? typeDLOnonRenseigne != null : !TYPE_DL_ONON_RENSEIGNE_EDEFAULT.equals(typeDLOnonRenseigne);
			case SchemaPackage.TYPE_ARTICULATION_ASS__NATURE_MISSION:
				return isSetNatureMission();
			case SchemaPackage.TYPE_ARTICULATION_ASS__NB_EQUIPES_LIAISON:
				return isSetNbEquipesLiaison();
			case SchemaPackage.TYPE_ARTICULATION_ASS__NB_EQUIPES_OBSERVATION:
				return isSetNbEquipesObservation();
			case SchemaPackage.TYPE_ARTICULATION_ASS__NB_EQUIPES_RADAR:
				return isSetNbEquipesRadar();
			case SchemaPackage.TYPE_ARTICULATION_ASS__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ARTICULATION_ASS__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ARTICULATION_ASS__ACOMME_UNITE_FOURNISSEUR_UNITE:
				return aCommeUniteFournisseurUnite != null;
			case SchemaPackage.TYPE_ARTICULATION_ASS__ACOMME_UNITE_BENEFICIAIRE_UNITE:
				return aCommeUniteBeneficiaireUnite != null;
			case SchemaPackage.TYPE_ARTICULATION_ASS__APOUR_COORDONNEES_RADIO_ADRESSE_RADIO:
				return aPourCoordonneesRadioAdresseRadio != null;
			case SchemaPackage.TYPE_ARTICULATION_ASS__EST_CARACTERISE_PAR_TYPE_UNITE:
				return estCaracteriseParTypeUnite != null;
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
		result.append(" (typeRepartition: ");
		if (typeRepartitionESet) result.append(typeRepartition); else result.append("<unset>");
		result.append(", typeDLO: ");
		if (typeDLOESet) result.append(typeDLO); else result.append("<unset>");
		result.append(", typeDLOnonRenseigne: ");
		result.append(typeDLOnonRenseigne);
		result.append(", natureMission: ");
		if (natureMissionESet) result.append(natureMission); else result.append("<unset>");
		result.append(", nbEquipesLiaison: ");
		if (nbEquipesLiaisonESet) result.append(nbEquipesLiaison); else result.append("<unset>");
		result.append(", nbEquipesObservation: ");
		if (nbEquipesObservationESet) result.append(nbEquipesObservation); else result.append("<unset>");
		result.append(", nbEquipesRadar: ");
		if (nbEquipesRadarESet) result.append(nbEquipesRadar); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeArticulationASSImpl
