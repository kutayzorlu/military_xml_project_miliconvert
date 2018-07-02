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
import mpia.schema.TypeDictionaryDicoObstacleTypeMines;
import mpia.schema.TypeDictionaryDicoObstacleTypeObjectifVise;
import mpia.schema.TypeItineraireFranchissementOuContournement;
import mpia.schema.TypeMineExplosif;
import mpia.schema.TypeObstacle;

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
 * An implementation of the model object '<em><b>Type Obstacle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeObstacleImpl#getNumeroObstacle <em>Numero Obstacle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObstacleImpl#isEstObstacleManoeuvre <em>Est Obstacle Manoeuvre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObstacleImpl#isObstacleMarque <em>Obstacle Marque</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObstacleImpl#getTypeObjectifVise <em>Type Objectif Vise</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObstacleImpl#getTypeMines <em>Type Mines</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObstacleImpl#getAPourTypesComplementairesTypeObstacle <em>APour Types Complementaires Type Obstacle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObstacleImpl#getAPourMinesOuExplosifsEmployesMineExplosif <em>APour Mines Ou Explosifs Employes Mine Explosif</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObstacleImpl#getAPourItineraireFranchissementOuContournementItineraireFranchissementOuContournement <em>APour Itineraire Franchissement Ou Contournement Itineraire Franchissement Ou Contournement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypeObstacleImpl extends TypeSiteImpl implements TypeObstacle {
	/**
	 * The default value of the '{@link #getNumeroObstacle() <em>Numero Obstacle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroObstacle()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMERO_OBSTACLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumeroObstacle() <em>Numero Obstacle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroObstacle()
	 * @generated
	 * @ordered
	 */
	protected String numeroObstacle = NUMERO_OBSTACLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isEstObstacleManoeuvre() <em>Est Obstacle Manoeuvre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEstObstacleManoeuvre()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EST_OBSTACLE_MANOEUVRE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEstObstacleManoeuvre() <em>Est Obstacle Manoeuvre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEstObstacleManoeuvre()
	 * @generated
	 * @ordered
	 */
	protected boolean estObstacleManoeuvre = EST_OBSTACLE_MANOEUVRE_EDEFAULT;

	/**
	 * This is true if the Est Obstacle Manoeuvre attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean estObstacleManoeuvreESet;

	/**
	 * The default value of the '{@link #isObstacleMarque() <em>Obstacle Marque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isObstacleMarque()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OBSTACLE_MARQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isObstacleMarque() <em>Obstacle Marque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isObstacleMarque()
	 * @generated
	 * @ordered
	 */
	protected boolean obstacleMarque = OBSTACLE_MARQUE_EDEFAULT;

	/**
	 * This is true if the Obstacle Marque attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean obstacleMarqueESet;

	/**
	 * The default value of the '{@link #getTypeObjectifVise() <em>Type Objectif Vise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeObjectifVise()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoObstacleTypeObjectifVise TYPE_OBJECTIF_VISE_EDEFAULT = TypeDictionaryDicoObstacleTypeObjectifVise.AR;

	/**
	 * The cached value of the '{@link #getTypeObjectifVise() <em>Type Objectif Vise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeObjectifVise()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoObstacleTypeObjectifVise typeObjectifVise = TYPE_OBJECTIF_VISE_EDEFAULT;

	/**
	 * This is true if the Type Objectif Vise attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeObjectifViseESet;

	/**
	 * The default value of the '{@link #getTypeMines() <em>Type Mines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMines()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoObstacleTypeMines TYPE_MINES_EDEFAULT = TypeDictionaryDicoObstacleTypeMines.A;

	/**
	 * The cached value of the '{@link #getTypeMines() <em>Type Mines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMines()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoObstacleTypeMines typeMines = TYPE_MINES_EDEFAULT;

	/**
	 * This is true if the Type Mines attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeMinesESet;

	/**
	 * The cached value of the '{@link #getAPourTypesComplementairesTypeObstacle() <em>APour Types Complementaires Type Obstacle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourTypesComplementairesTypeObstacle()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourTypesComplementairesTypeObstacle;

	/**
	 * The cached value of the '{@link #getAPourMinesOuExplosifsEmployesMineExplosif() <em>APour Mines Ou Explosifs Employes Mine Explosif</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourMinesOuExplosifsEmployesMineExplosif()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeMineExplosif> aPourMinesOuExplosifsEmployesMineExplosif;

	/**
	 * The cached value of the '{@link #getAPourItineraireFranchissementOuContournementItineraireFranchissementOuContournement() <em>APour Itineraire Franchissement Ou Contournement Itineraire Franchissement Ou Contournement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourItineraireFranchissementOuContournementItineraireFranchissementOuContournement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeItineraireFranchissementOuContournement> aPourItineraireFranchissementOuContournementItineraireFranchissementOuContournement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeObstacleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeObstacle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumeroObstacle() {
		return numeroObstacle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroObstacle(String newNumeroObstacle) {
		String oldNumeroObstacle = numeroObstacle;
		numeroObstacle = newNumeroObstacle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBSTACLE__NUMERO_OBSTACLE, oldNumeroObstacle, numeroObstacle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEstObstacleManoeuvre() {
		return estObstacleManoeuvre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstObstacleManoeuvre(boolean newEstObstacleManoeuvre) {
		boolean oldEstObstacleManoeuvre = estObstacleManoeuvre;
		estObstacleManoeuvre = newEstObstacleManoeuvre;
		boolean oldEstObstacleManoeuvreESet = estObstacleManoeuvreESet;
		estObstacleManoeuvreESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBSTACLE__EST_OBSTACLE_MANOEUVRE, oldEstObstacleManoeuvre, estObstacleManoeuvre, !oldEstObstacleManoeuvreESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEstObstacleManoeuvre() {
		boolean oldEstObstacleManoeuvre = estObstacleManoeuvre;
		boolean oldEstObstacleManoeuvreESet = estObstacleManoeuvreESet;
		estObstacleManoeuvre = EST_OBSTACLE_MANOEUVRE_EDEFAULT;
		estObstacleManoeuvreESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_OBSTACLE__EST_OBSTACLE_MANOEUVRE, oldEstObstacleManoeuvre, EST_OBSTACLE_MANOEUVRE_EDEFAULT, oldEstObstacleManoeuvreESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEstObstacleManoeuvre() {
		return estObstacleManoeuvreESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isObstacleMarque() {
		return obstacleMarque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObstacleMarque(boolean newObstacleMarque) {
		boolean oldObstacleMarque = obstacleMarque;
		obstacleMarque = newObstacleMarque;
		boolean oldObstacleMarqueESet = obstacleMarqueESet;
		obstacleMarqueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBSTACLE__OBSTACLE_MARQUE, oldObstacleMarque, obstacleMarque, !oldObstacleMarqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetObstacleMarque() {
		boolean oldObstacleMarque = obstacleMarque;
		boolean oldObstacleMarqueESet = obstacleMarqueESet;
		obstacleMarque = OBSTACLE_MARQUE_EDEFAULT;
		obstacleMarqueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_OBSTACLE__OBSTACLE_MARQUE, oldObstacleMarque, OBSTACLE_MARQUE_EDEFAULT, oldObstacleMarqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetObstacleMarque() {
		return obstacleMarqueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoObstacleTypeObjectifVise getTypeObjectifVise() {
		return typeObjectifVise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeObjectifVise(TypeDictionaryDicoObstacleTypeObjectifVise newTypeObjectifVise) {
		TypeDictionaryDicoObstacleTypeObjectifVise oldTypeObjectifVise = typeObjectifVise;
		typeObjectifVise = newTypeObjectifVise == null ? TYPE_OBJECTIF_VISE_EDEFAULT : newTypeObjectifVise;
		boolean oldTypeObjectifViseESet = typeObjectifViseESet;
		typeObjectifViseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBSTACLE__TYPE_OBJECTIF_VISE, oldTypeObjectifVise, typeObjectifVise, !oldTypeObjectifViseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeObjectifVise() {
		TypeDictionaryDicoObstacleTypeObjectifVise oldTypeObjectifVise = typeObjectifVise;
		boolean oldTypeObjectifViseESet = typeObjectifViseESet;
		typeObjectifVise = TYPE_OBJECTIF_VISE_EDEFAULT;
		typeObjectifViseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_OBSTACLE__TYPE_OBJECTIF_VISE, oldTypeObjectifVise, TYPE_OBJECTIF_VISE_EDEFAULT, oldTypeObjectifViseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeObjectifVise() {
		return typeObjectifViseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoObstacleTypeMines getTypeMines() {
		return typeMines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeMines(TypeDictionaryDicoObstacleTypeMines newTypeMines) {
		TypeDictionaryDicoObstacleTypeMines oldTypeMines = typeMines;
		typeMines = newTypeMines == null ? TYPE_MINES_EDEFAULT : newTypeMines;
		boolean oldTypeMinesESet = typeMinesESet;
		typeMinesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBSTACLE__TYPE_MINES, oldTypeMines, typeMines, !oldTypeMinesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeMines() {
		TypeDictionaryDicoObstacleTypeMines oldTypeMines = typeMines;
		boolean oldTypeMinesESet = typeMinesESet;
		typeMines = TYPE_MINES_EDEFAULT;
		typeMinesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_OBSTACLE__TYPE_MINES, oldTypeMines, TYPE_MINES_EDEFAULT, oldTypeMinesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeMines() {
		return typeMinesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourTypesComplementairesTypeObstacle() {
		if (aPourTypesComplementairesTypeObstacle == null) {
			aPourTypesComplementairesTypeObstacle = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_OBSTACLE__APOUR_TYPES_COMPLEMENTAIRES_TYPE_OBSTACLE);
		}
		return aPourTypesComplementairesTypeObstacle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMineExplosif> getAPourMinesOuExplosifsEmployesMineExplosif() {
		if (aPourMinesOuExplosifsEmployesMineExplosif == null) {
			aPourMinesOuExplosifsEmployesMineExplosif = new EObjectContainmentEList<TypeMineExplosif>(TypeMineExplosif.class, this, SchemaPackage.TYPE_OBSTACLE__APOUR_MINES_OU_EXPLOSIFS_EMPLOYES_MINE_EXPLOSIF);
		}
		return aPourMinesOuExplosifsEmployesMineExplosif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeItineraireFranchissementOuContournement> getAPourItineraireFranchissementOuContournementItineraireFranchissementOuContournement() {
		if (aPourItineraireFranchissementOuContournementItineraireFranchissementOuContournement == null) {
			aPourItineraireFranchissementOuContournementItineraireFranchissementOuContournement = new EObjectContainmentEList<TypeItineraireFranchissementOuContournement>(TypeItineraireFranchissementOuContournement.class, this, SchemaPackage.TYPE_OBSTACLE__APOUR_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT);
		}
		return aPourItineraireFranchissementOuContournementItineraireFranchissementOuContournement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_OBSTACLE__APOUR_TYPES_COMPLEMENTAIRES_TYPE_OBSTACLE:
				return ((InternalEList<?>)getAPourTypesComplementairesTypeObstacle()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_OBSTACLE__APOUR_MINES_OU_EXPLOSIFS_EMPLOYES_MINE_EXPLOSIF:
				return ((InternalEList<?>)getAPourMinesOuExplosifsEmployesMineExplosif()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_OBSTACLE__APOUR_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT:
				return ((InternalEList<?>)getAPourItineraireFranchissementOuContournementItineraireFranchissementOuContournement()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_OBSTACLE__NUMERO_OBSTACLE:
				return getNumeroObstacle();
			case SchemaPackage.TYPE_OBSTACLE__EST_OBSTACLE_MANOEUVRE:
				return isEstObstacleManoeuvre() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_OBSTACLE__OBSTACLE_MARQUE:
				return isObstacleMarque() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_OBSTACLE__TYPE_OBJECTIF_VISE:
				return getTypeObjectifVise();
			case SchemaPackage.TYPE_OBSTACLE__TYPE_MINES:
				return getTypeMines();
			case SchemaPackage.TYPE_OBSTACLE__APOUR_TYPES_COMPLEMENTAIRES_TYPE_OBSTACLE:
				return getAPourTypesComplementairesTypeObstacle();
			case SchemaPackage.TYPE_OBSTACLE__APOUR_MINES_OU_EXPLOSIFS_EMPLOYES_MINE_EXPLOSIF:
				return getAPourMinesOuExplosifsEmployesMineExplosif();
			case SchemaPackage.TYPE_OBSTACLE__APOUR_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT:
				return getAPourItineraireFranchissementOuContournementItineraireFranchissementOuContournement();
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
			case SchemaPackage.TYPE_OBSTACLE__NUMERO_OBSTACLE:
				setNumeroObstacle((String)newValue);
				return;
			case SchemaPackage.TYPE_OBSTACLE__EST_OBSTACLE_MANOEUVRE:
				setEstObstacleManoeuvre(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_OBSTACLE__OBSTACLE_MARQUE:
				setObstacleMarque(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_OBSTACLE__TYPE_OBJECTIF_VISE:
				setTypeObjectifVise((TypeDictionaryDicoObstacleTypeObjectifVise)newValue);
				return;
			case SchemaPackage.TYPE_OBSTACLE__TYPE_MINES:
				setTypeMines((TypeDictionaryDicoObstacleTypeMines)newValue);
				return;
			case SchemaPackage.TYPE_OBSTACLE__APOUR_TYPES_COMPLEMENTAIRES_TYPE_OBSTACLE:
				getAPourTypesComplementairesTypeObstacle().clear();
				getAPourTypesComplementairesTypeObstacle().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_OBSTACLE__APOUR_MINES_OU_EXPLOSIFS_EMPLOYES_MINE_EXPLOSIF:
				getAPourMinesOuExplosifsEmployesMineExplosif().clear();
				getAPourMinesOuExplosifsEmployesMineExplosif().addAll((Collection<? extends TypeMineExplosif>)newValue);
				return;
			case SchemaPackage.TYPE_OBSTACLE__APOUR_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT:
				getAPourItineraireFranchissementOuContournementItineraireFranchissementOuContournement().clear();
				getAPourItineraireFranchissementOuContournementItineraireFranchissementOuContournement().addAll((Collection<? extends TypeItineraireFranchissementOuContournement>)newValue);
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
			case SchemaPackage.TYPE_OBSTACLE__NUMERO_OBSTACLE:
				setNumeroObstacle(NUMERO_OBSTACLE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_OBSTACLE__EST_OBSTACLE_MANOEUVRE:
				unsetEstObstacleManoeuvre();
				return;
			case SchemaPackage.TYPE_OBSTACLE__OBSTACLE_MARQUE:
				unsetObstacleMarque();
				return;
			case SchemaPackage.TYPE_OBSTACLE__TYPE_OBJECTIF_VISE:
				unsetTypeObjectifVise();
				return;
			case SchemaPackage.TYPE_OBSTACLE__TYPE_MINES:
				unsetTypeMines();
				return;
			case SchemaPackage.TYPE_OBSTACLE__APOUR_TYPES_COMPLEMENTAIRES_TYPE_OBSTACLE:
				getAPourTypesComplementairesTypeObstacle().clear();
				return;
			case SchemaPackage.TYPE_OBSTACLE__APOUR_MINES_OU_EXPLOSIFS_EMPLOYES_MINE_EXPLOSIF:
				getAPourMinesOuExplosifsEmployesMineExplosif().clear();
				return;
			case SchemaPackage.TYPE_OBSTACLE__APOUR_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT:
				getAPourItineraireFranchissementOuContournementItineraireFranchissementOuContournement().clear();
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
			case SchemaPackage.TYPE_OBSTACLE__NUMERO_OBSTACLE:
				return NUMERO_OBSTACLE_EDEFAULT == null ? numeroObstacle != null : !NUMERO_OBSTACLE_EDEFAULT.equals(numeroObstacle);
			case SchemaPackage.TYPE_OBSTACLE__EST_OBSTACLE_MANOEUVRE:
				return isSetEstObstacleManoeuvre();
			case SchemaPackage.TYPE_OBSTACLE__OBSTACLE_MARQUE:
				return isSetObstacleMarque();
			case SchemaPackage.TYPE_OBSTACLE__TYPE_OBJECTIF_VISE:
				return isSetTypeObjectifVise();
			case SchemaPackage.TYPE_OBSTACLE__TYPE_MINES:
				return isSetTypeMines();
			case SchemaPackage.TYPE_OBSTACLE__APOUR_TYPES_COMPLEMENTAIRES_TYPE_OBSTACLE:
				return aPourTypesComplementairesTypeObstacle != null && !aPourTypesComplementairesTypeObstacle.isEmpty();
			case SchemaPackage.TYPE_OBSTACLE__APOUR_MINES_OU_EXPLOSIFS_EMPLOYES_MINE_EXPLOSIF:
				return aPourMinesOuExplosifsEmployesMineExplosif != null && !aPourMinesOuExplosifsEmployesMineExplosif.isEmpty();
			case SchemaPackage.TYPE_OBSTACLE__APOUR_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT:
				return aPourItineraireFranchissementOuContournementItineraireFranchissementOuContournement != null && !aPourItineraireFranchissementOuContournementItineraireFranchissementOuContournement.isEmpty();
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
		result.append(" (numeroObstacle: ");
		result.append(numeroObstacle);
		result.append(", estObstacleManoeuvre: ");
		if (estObstacleManoeuvreESet) result.append(estObstacleManoeuvre); else result.append("<unset>");
		result.append(", obstacleMarque: ");
		if (obstacleMarqueESet) result.append(obstacleMarque); else result.append("<unset>");
		result.append(", typeObjectifVise: ");
		if (typeObjectifViseESet) result.append(typeObjectifVise); else result.append("<unset>");
		result.append(", typeMines: ");
		if (typeMinesESet) result.append(typeMines); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeObstacleImpl
