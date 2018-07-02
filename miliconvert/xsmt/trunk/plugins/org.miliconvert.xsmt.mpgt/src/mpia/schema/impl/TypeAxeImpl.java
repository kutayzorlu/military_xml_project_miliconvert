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
import mpia.schema.TypeAxe;
import mpia.schema.TypeDictionaryDicoAxeCategorie;
import mpia.schema.TypeDictionaryDicoChoixCouleur;
import mpia.schema.TypeDictionaryDicoModaliteSens;

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
 * An implementation of the model object '<em><b>Type Axe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAxeImpl#getCouleur <em>Couleur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAxeImpl#getLongueurAxe <em>Longueur Axe</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAxeImpl#getSensTrajet <em>Sens Trajet</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAxeImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAxeImpl#getIdentifiant <em>Identifiant</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAxeImpl#getNombreVoies <em>Nombre Voies</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAxeImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAxeImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAxeImpl#getACommePontAssociePont <em>AComme Pont Associe Pont</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAxeImpl#getACommeObstacleAssocieObstacle <em>AComme Obstacle Associe Obstacle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAxeImpl extends EObjectImpl implements TypeAxe {
	/**
	 * The default value of the '{@link #getCouleur() <em>Couleur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouleur()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoChoixCouleur COULEUR_EDEFAULT = TypeDictionaryDicoChoixCouleur.AQUAMARINE;

	/**
	 * The cached value of the '{@link #getCouleur() <em>Couleur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouleur()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoChoixCouleur couleur = COULEUR_EDEFAULT;

	/**
	 * This is true if the Couleur attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean couleurESet;

	/**
	 * The default value of the '{@link #getLongueurAxe() <em>Longueur Axe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongueurAxe()
	 * @generated
	 * @ordered
	 */
	protected static final double LONGUEUR_AXE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLongueurAxe() <em>Longueur Axe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongueurAxe()
	 * @generated
	 * @ordered
	 */
	protected double longueurAxe = LONGUEUR_AXE_EDEFAULT;

	/**
	 * This is true if the Longueur Axe attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean longueurAxeESet;

	/**
	 * The default value of the '{@link #getSensTrajet() <em>Sens Trajet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensTrajet()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoModaliteSens SENS_TRAJET_EDEFAULT = TypeDictionaryDicoModaliteSens.DIRCRE;

	/**
	 * The cached value of the '{@link #getSensTrajet() <em>Sens Trajet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensTrajet()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoModaliteSens sensTrajet = SENS_TRAJET_EDEFAULT;

	/**
	 * This is true if the Sens Trajet attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sensTrajetESet;

	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAxeCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAxeCategorie.MWY;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAxeCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getIdentifiant() <em>Identifiant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiant()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIANT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifiant() <em>Identifiant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiant()
	 * @generated
	 * @ordered
	 */
	protected String identifiant = IDENTIFIANT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNombreVoies() <em>Nombre Voies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreVoies()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_VOIES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreVoies() <em>Nombre Voies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreVoies()
	 * @generated
	 * @ordered
	 */
	protected long nombreVoies = NOMBRE_VOIES_EDEFAULT;

	/**
	 * This is true if the Nombre Voies attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreVoiesESet;

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
	 * The cached value of the '{@link #getACommePontAssociePont() <em>AComme Pont Associe Pont</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommePontAssociePont()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aCommePontAssociePont;

	/**
	 * The cached value of the '{@link #getACommeObstacleAssocieObstacle() <em>AComme Obstacle Associe Obstacle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeObstacleAssocieObstacle()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aCommeObstacleAssocieObstacle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAxeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAxe();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoChoixCouleur getCouleur() {
		return couleur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCouleur(TypeDictionaryDicoChoixCouleur newCouleur) {
		TypeDictionaryDicoChoixCouleur oldCouleur = couleur;
		couleur = newCouleur == null ? COULEUR_EDEFAULT : newCouleur;
		boolean oldCouleurESet = couleurESet;
		couleurESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AXE__COULEUR, oldCouleur, couleur, !oldCouleurESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCouleur() {
		TypeDictionaryDicoChoixCouleur oldCouleur = couleur;
		boolean oldCouleurESet = couleurESet;
		couleur = COULEUR_EDEFAULT;
		couleurESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_AXE__COULEUR, oldCouleur, COULEUR_EDEFAULT, oldCouleurESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCouleur() {
		return couleurESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLongueurAxe() {
		return longueurAxe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongueurAxe(double newLongueurAxe) {
		double oldLongueurAxe = longueurAxe;
		longueurAxe = newLongueurAxe;
		boolean oldLongueurAxeESet = longueurAxeESet;
		longueurAxeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AXE__LONGUEUR_AXE, oldLongueurAxe, longueurAxe, !oldLongueurAxeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLongueurAxe() {
		double oldLongueurAxe = longueurAxe;
		boolean oldLongueurAxeESet = longueurAxeESet;
		longueurAxe = LONGUEUR_AXE_EDEFAULT;
		longueurAxeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_AXE__LONGUEUR_AXE, oldLongueurAxe, LONGUEUR_AXE_EDEFAULT, oldLongueurAxeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLongueurAxe() {
		return longueurAxeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoModaliteSens getSensTrajet() {
		return sensTrajet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensTrajet(TypeDictionaryDicoModaliteSens newSensTrajet) {
		TypeDictionaryDicoModaliteSens oldSensTrajet = sensTrajet;
		sensTrajet = newSensTrajet == null ? SENS_TRAJET_EDEFAULT : newSensTrajet;
		boolean oldSensTrajetESet = sensTrajetESet;
		sensTrajetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AXE__SENS_TRAJET, oldSensTrajet, sensTrajet, !oldSensTrajetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSensTrajet() {
		TypeDictionaryDicoModaliteSens oldSensTrajet = sensTrajet;
		boolean oldSensTrajetESet = sensTrajetESet;
		sensTrajet = SENS_TRAJET_EDEFAULT;
		sensTrajetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_AXE__SENS_TRAJET, oldSensTrajet, SENS_TRAJET_EDEFAULT, oldSensTrajetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSensTrajet() {
		return sensTrajetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAxeCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAxeCategorie newCategorie) {
		TypeDictionaryDicoAxeCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AXE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAxeCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_AXE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public String getIdentifiant() {
		return identifiant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifiant(String newIdentifiant) {
		String oldIdentifiant = identifiant;
		identifiant = newIdentifiant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AXE__IDENTIFIANT, oldIdentifiant, identifiant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreVoies() {
		return nombreVoies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreVoies(long newNombreVoies) {
		long oldNombreVoies = nombreVoies;
		nombreVoies = newNombreVoies;
		boolean oldNombreVoiesESet = nombreVoiesESet;
		nombreVoiesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AXE__NOMBRE_VOIES, oldNombreVoies, nombreVoies, !oldNombreVoiesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreVoies() {
		long oldNombreVoies = nombreVoies;
		boolean oldNombreVoiesESet = nombreVoiesESet;
		nombreVoies = NOMBRE_VOIES_EDEFAULT;
		nombreVoiesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_AXE__NOMBRE_VOIES, oldNombreVoies, NOMBRE_VOIES_EDEFAULT, oldNombreVoiesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreVoies() {
		return nombreVoiesESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AXE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AXE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getACommePontAssociePont() {
		if (aCommePontAssociePont == null) {
			aCommePontAssociePont = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_AXE__ACOMME_PONT_ASSOCIE_PONT);
		}
		return aCommePontAssociePont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getACommeObstacleAssocieObstacle() {
		if (aCommeObstacleAssocieObstacle == null) {
			aCommeObstacleAssocieObstacle = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_AXE__ACOMME_OBSTACLE_ASSOCIE_OBSTACLE);
		}
		return aCommeObstacleAssocieObstacle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_AXE__ACOMME_PONT_ASSOCIE_PONT:
				return ((InternalEList<?>)getACommePontAssociePont()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_AXE__ACOMME_OBSTACLE_ASSOCIE_OBSTACLE:
				return ((InternalEList<?>)getACommeObstacleAssocieObstacle()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_AXE__COULEUR:
				return getCouleur();
			case SchemaPackage.TYPE_AXE__LONGUEUR_AXE:
				return new Double(getLongueurAxe());
			case SchemaPackage.TYPE_AXE__SENS_TRAJET:
				return getSensTrajet();
			case SchemaPackage.TYPE_AXE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_AXE__IDENTIFIANT:
				return getIdentifiant();
			case SchemaPackage.TYPE_AXE__NOMBRE_VOIES:
				return new Long(getNombreVoies());
			case SchemaPackage.TYPE_AXE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_AXE__CE:
				return getCE();
			case SchemaPackage.TYPE_AXE__ACOMME_PONT_ASSOCIE_PONT:
				return getACommePontAssociePont();
			case SchemaPackage.TYPE_AXE__ACOMME_OBSTACLE_ASSOCIE_OBSTACLE:
				return getACommeObstacleAssocieObstacle();
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
			case SchemaPackage.TYPE_AXE__COULEUR:
				setCouleur((TypeDictionaryDicoChoixCouleur)newValue);
				return;
			case SchemaPackage.TYPE_AXE__LONGUEUR_AXE:
				setLongueurAxe(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_AXE__SENS_TRAJET:
				setSensTrajet((TypeDictionaryDicoModaliteSens)newValue);
				return;
			case SchemaPackage.TYPE_AXE__CATEGORIE:
				setCategorie((TypeDictionaryDicoAxeCategorie)newValue);
				return;
			case SchemaPackage.TYPE_AXE__IDENTIFIANT:
				setIdentifiant((String)newValue);
				return;
			case SchemaPackage.TYPE_AXE__NOMBRE_VOIES:
				setNombreVoies(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_AXE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_AXE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_AXE__ACOMME_PONT_ASSOCIE_PONT:
				getACommePontAssociePont().clear();
				getACommePontAssociePont().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_AXE__ACOMME_OBSTACLE_ASSOCIE_OBSTACLE:
				getACommeObstacleAssocieObstacle().clear();
				getACommeObstacleAssocieObstacle().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_AXE__COULEUR:
				unsetCouleur();
				return;
			case SchemaPackage.TYPE_AXE__LONGUEUR_AXE:
				unsetLongueurAxe();
				return;
			case SchemaPackage.TYPE_AXE__SENS_TRAJET:
				unsetSensTrajet();
				return;
			case SchemaPackage.TYPE_AXE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_AXE__IDENTIFIANT:
				setIdentifiant(IDENTIFIANT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_AXE__NOMBRE_VOIES:
				unsetNombreVoies();
				return;
			case SchemaPackage.TYPE_AXE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_AXE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_AXE__ACOMME_PONT_ASSOCIE_PONT:
				getACommePontAssociePont().clear();
				return;
			case SchemaPackage.TYPE_AXE__ACOMME_OBSTACLE_ASSOCIE_OBSTACLE:
				getACommeObstacleAssocieObstacle().clear();
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
			case SchemaPackage.TYPE_AXE__COULEUR:
				return isSetCouleur();
			case SchemaPackage.TYPE_AXE__LONGUEUR_AXE:
				return isSetLongueurAxe();
			case SchemaPackage.TYPE_AXE__SENS_TRAJET:
				return isSetSensTrajet();
			case SchemaPackage.TYPE_AXE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_AXE__IDENTIFIANT:
				return IDENTIFIANT_EDEFAULT == null ? identifiant != null : !IDENTIFIANT_EDEFAULT.equals(identifiant);
			case SchemaPackage.TYPE_AXE__NOMBRE_VOIES:
				return isSetNombreVoies();
			case SchemaPackage.TYPE_AXE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_AXE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_AXE__ACOMME_PONT_ASSOCIE_PONT:
				return aCommePontAssociePont != null && !aCommePontAssociePont.isEmpty();
			case SchemaPackage.TYPE_AXE__ACOMME_OBSTACLE_ASSOCIE_OBSTACLE:
				return aCommeObstacleAssocieObstacle != null && !aCommeObstacleAssocieObstacle.isEmpty();
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
		result.append(" (couleur: ");
		if (couleurESet) result.append(couleur); else result.append("<unset>");
		result.append(", longueurAxe: ");
		if (longueurAxeESet) result.append(longueurAxe); else result.append("<unset>");
		result.append(", sensTrajet: ");
		if (sensTrajetESet) result.append(sensTrajet); else result.append("<unset>");
		result.append(", categorie: ");
		if (categorieESet) result.append(categorie); else result.append("<unset>");
		result.append(", identifiant: ");
		result.append(identifiant);
		result.append(", nombreVoies: ");
		if (nombreVoiesESet) result.append(nombreVoies); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeAxeImpl
