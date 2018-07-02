/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoMenaceGenieENIButTactiqueObstacle;
import mpia.schema.TypeDictionaryDicoProbabiliteEvenement;
import mpia.schema.TypeMenaceGenieENI;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Menace Genie ENI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMenaceGenieENIImpl#getProbabiliteMenace <em>Probabilite Menace</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMenaceGenieENIImpl#getButTactiqueObstacle <em>But Tactique Obstacle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMenaceGenieENIImpl#getEffetTechniqueRecherche <em>Effet Technique Recherche</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMenaceGenieENIImpl#getComplementSurMinage <em>Complement Sur Minage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMenaceGenieENIImpl#getACommeZoneObstacleAutreElementControle <em>AComme Zone Obstacle Autre Element Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMenaceGenieENIImpl extends TypeMenaceImpl implements TypeMenaceGenieENI {
	/**
	 * The default value of the '{@link #getProbabiliteMenace() <em>Probabilite Menace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbabiliteMenace()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoProbabiliteEvenement PROBABILITE_MENACE_EDEFAULT = TypeDictionaryDicoProbabiliteEvenement.HIGH;

	/**
	 * The cached value of the '{@link #getProbabiliteMenace() <em>Probabilite Menace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbabiliteMenace()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoProbabiliteEvenement probabiliteMenace = PROBABILITE_MENACE_EDEFAULT;

	/**
	 * This is true if the Probabilite Menace attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean probabiliteMenaceESet;

	/**
	 * The default value of the '{@link #getButTactiqueObstacle() <em>But Tactique Obstacle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButTactiqueObstacle()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMenaceGenieENIButTactiqueObstacle BUT_TACTIQUE_OBSTACLE_EDEFAULT = TypeDictionaryDicoMenaceGenieENIButTactiqueObstacle.BK;

	/**
	 * The cached value of the '{@link #getButTactiqueObstacle() <em>But Tactique Obstacle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButTactiqueObstacle()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMenaceGenieENIButTactiqueObstacle butTactiqueObstacle = BUT_TACTIQUE_OBSTACLE_EDEFAULT;

	/**
	 * This is true if the But Tactique Obstacle attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean butTactiqueObstacleESet;

	/**
	 * The default value of the '{@link #getEffetTechniqueRecherche() <em>Effet Technique Recherche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffetTechniqueRecherche()
	 * @generated
	 * @ordered
	 */
	protected static final String EFFET_TECHNIQUE_RECHERCHE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEffetTechniqueRecherche() <em>Effet Technique Recherche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffetTechniqueRecherche()
	 * @generated
	 * @ordered
	 */
	protected String effetTechniqueRecherche = EFFET_TECHNIQUE_RECHERCHE_EDEFAULT;

	/**
	 * The default value of the '{@link #getComplementSurMinage() <em>Complement Sur Minage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplementSurMinage()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPLEMENT_SUR_MINAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComplementSurMinage() <em>Complement Sur Minage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplementSurMinage()
	 * @generated
	 * @ordered
	 */
	protected String complementSurMinage = COMPLEMENT_SUR_MINAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getACommeZoneObstacleAutreElementControle() <em>AComme Zone Obstacle Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeZoneObstacleAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aCommeZoneObstacleAutreElementControle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMenaceGenieENIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMenaceGenieENI();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoProbabiliteEvenement getProbabiliteMenace() {
		return probabiliteMenace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbabiliteMenace(TypeDictionaryDicoProbabiliteEvenement newProbabiliteMenace) {
		TypeDictionaryDicoProbabiliteEvenement oldProbabiliteMenace = probabiliteMenace;
		probabiliteMenace = newProbabiliteMenace == null ? PROBABILITE_MENACE_EDEFAULT : newProbabiliteMenace;
		boolean oldProbabiliteMenaceESet = probabiliteMenaceESet;
		probabiliteMenaceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MENACE_GENIE_ENI__PROBABILITE_MENACE, oldProbabiliteMenace, probabiliteMenace, !oldProbabiliteMenaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProbabiliteMenace() {
		TypeDictionaryDicoProbabiliteEvenement oldProbabiliteMenace = probabiliteMenace;
		boolean oldProbabiliteMenaceESet = probabiliteMenaceESet;
		probabiliteMenace = PROBABILITE_MENACE_EDEFAULT;
		probabiliteMenaceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MENACE_GENIE_ENI__PROBABILITE_MENACE, oldProbabiliteMenace, PROBABILITE_MENACE_EDEFAULT, oldProbabiliteMenaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProbabiliteMenace() {
		return probabiliteMenaceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMenaceGenieENIButTactiqueObstacle getButTactiqueObstacle() {
		return butTactiqueObstacle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setButTactiqueObstacle(TypeDictionaryDicoMenaceGenieENIButTactiqueObstacle newButTactiqueObstacle) {
		TypeDictionaryDicoMenaceGenieENIButTactiqueObstacle oldButTactiqueObstacle = butTactiqueObstacle;
		butTactiqueObstacle = newButTactiqueObstacle == null ? BUT_TACTIQUE_OBSTACLE_EDEFAULT : newButTactiqueObstacle;
		boolean oldButTactiqueObstacleESet = butTactiqueObstacleESet;
		butTactiqueObstacleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MENACE_GENIE_ENI__BUT_TACTIQUE_OBSTACLE, oldButTactiqueObstacle, butTactiqueObstacle, !oldButTactiqueObstacleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetButTactiqueObstacle() {
		TypeDictionaryDicoMenaceGenieENIButTactiqueObstacle oldButTactiqueObstacle = butTactiqueObstacle;
		boolean oldButTactiqueObstacleESet = butTactiqueObstacleESet;
		butTactiqueObstacle = BUT_TACTIQUE_OBSTACLE_EDEFAULT;
		butTactiqueObstacleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MENACE_GENIE_ENI__BUT_TACTIQUE_OBSTACLE, oldButTactiqueObstacle, BUT_TACTIQUE_OBSTACLE_EDEFAULT, oldButTactiqueObstacleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetButTactiqueObstacle() {
		return butTactiqueObstacleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEffetTechniqueRecherche() {
		return effetTechniqueRecherche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffetTechniqueRecherche(String newEffetTechniqueRecherche) {
		String oldEffetTechniqueRecherche = effetTechniqueRecherche;
		effetTechniqueRecherche = newEffetTechniqueRecherche;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MENACE_GENIE_ENI__EFFET_TECHNIQUE_RECHERCHE, oldEffetTechniqueRecherche, effetTechniqueRecherche));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComplementSurMinage() {
		return complementSurMinage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplementSurMinage(String newComplementSurMinage) {
		String oldComplementSurMinage = complementSurMinage;
		complementSurMinage = newComplementSurMinage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MENACE_GENIE_ENI__COMPLEMENT_SUR_MINAGE, oldComplementSurMinage, complementSurMinage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getACommeZoneObstacleAutreElementControle() {
		return aCommeZoneObstacleAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeZoneObstacleAutreElementControle(TypeAssociation newACommeZoneObstacleAutreElementControle, NotificationChain msgs) {
		TypeAssociation oldACommeZoneObstacleAutreElementControle = aCommeZoneObstacleAutreElementControle;
		aCommeZoneObstacleAutreElementControle = newACommeZoneObstacleAutreElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MENACE_GENIE_ENI__ACOMME_ZONE_OBSTACLE_AUTRE_ELEMENT_CONTROLE, oldACommeZoneObstacleAutreElementControle, newACommeZoneObstacleAutreElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeZoneObstacleAutreElementControle(TypeAssociation newACommeZoneObstacleAutreElementControle) {
		if (newACommeZoneObstacleAutreElementControle != aCommeZoneObstacleAutreElementControle) {
			NotificationChain msgs = null;
			if (aCommeZoneObstacleAutreElementControle != null)
				msgs = ((InternalEObject)aCommeZoneObstacleAutreElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MENACE_GENIE_ENI__ACOMME_ZONE_OBSTACLE_AUTRE_ELEMENT_CONTROLE, null, msgs);
			if (newACommeZoneObstacleAutreElementControle != null)
				msgs = ((InternalEObject)newACommeZoneObstacleAutreElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MENACE_GENIE_ENI__ACOMME_ZONE_OBSTACLE_AUTRE_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetACommeZoneObstacleAutreElementControle(newACommeZoneObstacleAutreElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MENACE_GENIE_ENI__ACOMME_ZONE_OBSTACLE_AUTRE_ELEMENT_CONTROLE, newACommeZoneObstacleAutreElementControle, newACommeZoneObstacleAutreElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MENACE_GENIE_ENI__ACOMME_ZONE_OBSTACLE_AUTRE_ELEMENT_CONTROLE:
				return basicSetACommeZoneObstacleAutreElementControle(null, msgs);
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
			case SchemaPackage.TYPE_MENACE_GENIE_ENI__PROBABILITE_MENACE:
				return getProbabiliteMenace();
			case SchemaPackage.TYPE_MENACE_GENIE_ENI__BUT_TACTIQUE_OBSTACLE:
				return getButTactiqueObstacle();
			case SchemaPackage.TYPE_MENACE_GENIE_ENI__EFFET_TECHNIQUE_RECHERCHE:
				return getEffetTechniqueRecherche();
			case SchemaPackage.TYPE_MENACE_GENIE_ENI__COMPLEMENT_SUR_MINAGE:
				return getComplementSurMinage();
			case SchemaPackage.TYPE_MENACE_GENIE_ENI__ACOMME_ZONE_OBSTACLE_AUTRE_ELEMENT_CONTROLE:
				return getACommeZoneObstacleAutreElementControle();
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
			case SchemaPackage.TYPE_MENACE_GENIE_ENI__PROBABILITE_MENACE:
				setProbabiliteMenace((TypeDictionaryDicoProbabiliteEvenement)newValue);
				return;
			case SchemaPackage.TYPE_MENACE_GENIE_ENI__BUT_TACTIQUE_OBSTACLE:
				setButTactiqueObstacle((TypeDictionaryDicoMenaceGenieENIButTactiqueObstacle)newValue);
				return;
			case SchemaPackage.TYPE_MENACE_GENIE_ENI__EFFET_TECHNIQUE_RECHERCHE:
				setEffetTechniqueRecherche((String)newValue);
				return;
			case SchemaPackage.TYPE_MENACE_GENIE_ENI__COMPLEMENT_SUR_MINAGE:
				setComplementSurMinage((String)newValue);
				return;
			case SchemaPackage.TYPE_MENACE_GENIE_ENI__ACOMME_ZONE_OBSTACLE_AUTRE_ELEMENT_CONTROLE:
				setACommeZoneObstacleAutreElementControle((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_MENACE_GENIE_ENI__PROBABILITE_MENACE:
				unsetProbabiliteMenace();
				return;
			case SchemaPackage.TYPE_MENACE_GENIE_ENI__BUT_TACTIQUE_OBSTACLE:
				unsetButTactiqueObstacle();
				return;
			case SchemaPackage.TYPE_MENACE_GENIE_ENI__EFFET_TECHNIQUE_RECHERCHE:
				setEffetTechniqueRecherche(EFFET_TECHNIQUE_RECHERCHE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MENACE_GENIE_ENI__COMPLEMENT_SUR_MINAGE:
				setComplementSurMinage(COMPLEMENT_SUR_MINAGE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MENACE_GENIE_ENI__ACOMME_ZONE_OBSTACLE_AUTRE_ELEMENT_CONTROLE:
				setACommeZoneObstacleAutreElementControle((TypeAssociation)null);
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
			case SchemaPackage.TYPE_MENACE_GENIE_ENI__PROBABILITE_MENACE:
				return isSetProbabiliteMenace();
			case SchemaPackage.TYPE_MENACE_GENIE_ENI__BUT_TACTIQUE_OBSTACLE:
				return isSetButTactiqueObstacle();
			case SchemaPackage.TYPE_MENACE_GENIE_ENI__EFFET_TECHNIQUE_RECHERCHE:
				return EFFET_TECHNIQUE_RECHERCHE_EDEFAULT == null ? effetTechniqueRecherche != null : !EFFET_TECHNIQUE_RECHERCHE_EDEFAULT.equals(effetTechniqueRecherche);
			case SchemaPackage.TYPE_MENACE_GENIE_ENI__COMPLEMENT_SUR_MINAGE:
				return COMPLEMENT_SUR_MINAGE_EDEFAULT == null ? complementSurMinage != null : !COMPLEMENT_SUR_MINAGE_EDEFAULT.equals(complementSurMinage);
			case SchemaPackage.TYPE_MENACE_GENIE_ENI__ACOMME_ZONE_OBSTACLE_AUTRE_ELEMENT_CONTROLE:
				return aCommeZoneObstacleAutreElementControle != null;
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
		result.append(" (probabiliteMenace: ");
		if (probabiliteMenaceESet) result.append(probabiliteMenace); else result.append("<unset>");
		result.append(", butTactiqueObstacle: ");
		if (butTactiqueObstacleESet) result.append(butTactiqueObstacle); else result.append("<unset>");
		result.append(", effetTechniqueRecherche: ");
		result.append(effetTechniqueRecherche);
		result.append(", complementSurMinage: ");
		result.append(complementSurMinage);
		result.append(')');
		return result.toString();
	}

} //TypeMenaceGenieENIImpl
