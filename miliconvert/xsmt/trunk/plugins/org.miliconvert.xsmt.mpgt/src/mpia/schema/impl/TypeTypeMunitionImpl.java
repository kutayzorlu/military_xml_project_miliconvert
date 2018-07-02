/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoTypeMunitionCategorie;
import mpia.schema.TypeDictionaryDicoTypeMunitionChargement;
import mpia.schema.TypeDictionaryDicoTypeMunitionCouleurEclatMineExercice;
import mpia.schema.TypeDictionaryDicoTypeMunitionMecanismeTirMineMaritime;
import mpia.schema.TypeTypeMunition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Type Munition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeTypeMunitionImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeMunitionImpl#getChargement <em>Chargement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeMunitionImpl#getCalibre <em>Calibre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeMunitionImpl#getMecanismeTirMineMaritime <em>Mecanisme Tir Mine Maritime</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeMunitionImpl#getCouleurEclatMineExercice <em>Couleur Eclat Mine Exercice</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeMunitionImpl#getEstTypeMunitionsAssocieCapaciteFeux <em>Est Type Munitions Associe Capacite Feux</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeTypeMunitionImpl extends TypeTypeConsommableImpl implements TypeTypeMunition {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeMunitionCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoTypeMunitionCategorie.AAMIS;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeMunitionCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getChargement() <em>Chargement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeMunitionChargement CHARGEMENT_EDEFAULT = TypeDictionaryDicoTypeMunitionChargement.HEA;

	/**
	 * The cached value of the '{@link #getChargement() <em>Chargement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargement()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeMunitionChargement chargement = CHARGEMENT_EDEFAULT;

	/**
	 * This is true if the Chargement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean chargementESet;

	/**
	 * The default value of the '{@link #getCalibre() <em>Calibre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalibre()
	 * @generated
	 * @ordered
	 */
	protected static final String CALIBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCalibre() <em>Calibre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalibre()
	 * @generated
	 * @ordered
	 */
	protected String calibre = CALIBRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMecanismeTirMineMaritime() <em>Mecanisme Tir Mine Maritime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMecanismeTirMineMaritime()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeMunitionMecanismeTirMineMaritime MECANISME_TIR_MINE_MARITIME_EDEFAULT = TypeDictionaryDicoTypeMunitionMecanismeTirMineMaritime.ACTIVE;

	/**
	 * The cached value of the '{@link #getMecanismeTirMineMaritime() <em>Mecanisme Tir Mine Maritime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMecanismeTirMineMaritime()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeMunitionMecanismeTirMineMaritime mecanismeTirMineMaritime = MECANISME_TIR_MINE_MARITIME_EDEFAULT;

	/**
	 * This is true if the Mecanisme Tir Mine Maritime attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mecanismeTirMineMaritimeESet;

	/**
	 * The default value of the '{@link #getCouleurEclatMineExercice() <em>Couleur Eclat Mine Exercice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouleurEclatMineExercice()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeMunitionCouleurEclatMineExercice COULEUR_ECLAT_MINE_EXERCICE_EDEFAULT = TypeDictionaryDicoTypeMunitionCouleurEclatMineExercice.GREEN;

	/**
	 * The cached value of the '{@link #getCouleurEclatMineExercice() <em>Couleur Eclat Mine Exercice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouleurEclatMineExercice()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeMunitionCouleurEclatMineExercice couleurEclatMineExercice = COULEUR_ECLAT_MINE_EXERCICE_EDEFAULT;

	/**
	 * This is true if the Couleur Eclat Mine Exercice attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean couleurEclatMineExerciceESet;

	/**
	 * The cached value of the '{@link #getEstTypeMunitionsAssocieCapaciteFeux() <em>Est Type Munitions Associe Capacite Feux</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstTypeMunitionsAssocieCapaciteFeux()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation estTypeMunitionsAssocieCapaciteFeux;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeTypeMunitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeTypeMunition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeMunitionCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoTypeMunitionCategorie newCategorie) {
		TypeDictionaryDicoTypeMunitionCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_MUNITION__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoTypeMunitionCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_MUNITION__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeDictionaryDicoTypeMunitionChargement getChargement() {
		return chargement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChargement(TypeDictionaryDicoTypeMunitionChargement newChargement) {
		TypeDictionaryDicoTypeMunitionChargement oldChargement = chargement;
		chargement = newChargement == null ? CHARGEMENT_EDEFAULT : newChargement;
		boolean oldChargementESet = chargementESet;
		chargementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_MUNITION__CHARGEMENT, oldChargement, chargement, !oldChargementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetChargement() {
		TypeDictionaryDicoTypeMunitionChargement oldChargement = chargement;
		boolean oldChargementESet = chargementESet;
		chargement = CHARGEMENT_EDEFAULT;
		chargementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_MUNITION__CHARGEMENT, oldChargement, CHARGEMENT_EDEFAULT, oldChargementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetChargement() {
		return chargementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCalibre() {
		return calibre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalibre(String newCalibre) {
		String oldCalibre = calibre;
		calibre = newCalibre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_MUNITION__CALIBRE, oldCalibre, calibre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeMunitionMecanismeTirMineMaritime getMecanismeTirMineMaritime() {
		return mecanismeTirMineMaritime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMecanismeTirMineMaritime(TypeDictionaryDicoTypeMunitionMecanismeTirMineMaritime newMecanismeTirMineMaritime) {
		TypeDictionaryDicoTypeMunitionMecanismeTirMineMaritime oldMecanismeTirMineMaritime = mecanismeTirMineMaritime;
		mecanismeTirMineMaritime = newMecanismeTirMineMaritime == null ? MECANISME_TIR_MINE_MARITIME_EDEFAULT : newMecanismeTirMineMaritime;
		boolean oldMecanismeTirMineMaritimeESet = mecanismeTirMineMaritimeESet;
		mecanismeTirMineMaritimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_MUNITION__MECANISME_TIR_MINE_MARITIME, oldMecanismeTirMineMaritime, mecanismeTirMineMaritime, !oldMecanismeTirMineMaritimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMecanismeTirMineMaritime() {
		TypeDictionaryDicoTypeMunitionMecanismeTirMineMaritime oldMecanismeTirMineMaritime = mecanismeTirMineMaritime;
		boolean oldMecanismeTirMineMaritimeESet = mecanismeTirMineMaritimeESet;
		mecanismeTirMineMaritime = MECANISME_TIR_MINE_MARITIME_EDEFAULT;
		mecanismeTirMineMaritimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_MUNITION__MECANISME_TIR_MINE_MARITIME, oldMecanismeTirMineMaritime, MECANISME_TIR_MINE_MARITIME_EDEFAULT, oldMecanismeTirMineMaritimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMecanismeTirMineMaritime() {
		return mecanismeTirMineMaritimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeMunitionCouleurEclatMineExercice getCouleurEclatMineExercice() {
		return couleurEclatMineExercice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCouleurEclatMineExercice(TypeDictionaryDicoTypeMunitionCouleurEclatMineExercice newCouleurEclatMineExercice) {
		TypeDictionaryDicoTypeMunitionCouleurEclatMineExercice oldCouleurEclatMineExercice = couleurEclatMineExercice;
		couleurEclatMineExercice = newCouleurEclatMineExercice == null ? COULEUR_ECLAT_MINE_EXERCICE_EDEFAULT : newCouleurEclatMineExercice;
		boolean oldCouleurEclatMineExerciceESet = couleurEclatMineExerciceESet;
		couleurEclatMineExerciceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_MUNITION__COULEUR_ECLAT_MINE_EXERCICE, oldCouleurEclatMineExercice, couleurEclatMineExercice, !oldCouleurEclatMineExerciceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCouleurEclatMineExercice() {
		TypeDictionaryDicoTypeMunitionCouleurEclatMineExercice oldCouleurEclatMineExercice = couleurEclatMineExercice;
		boolean oldCouleurEclatMineExerciceESet = couleurEclatMineExerciceESet;
		couleurEclatMineExercice = COULEUR_ECLAT_MINE_EXERCICE_EDEFAULT;
		couleurEclatMineExerciceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_MUNITION__COULEUR_ECLAT_MINE_EXERCICE, oldCouleurEclatMineExercice, COULEUR_ECLAT_MINE_EXERCICE_EDEFAULT, oldCouleurEclatMineExerciceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCouleurEclatMineExercice() {
		return couleurEclatMineExerciceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getEstTypeMunitionsAssocieCapaciteFeux() {
		return estTypeMunitionsAssocieCapaciteFeux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstTypeMunitionsAssocieCapaciteFeux(TypeAssociation newEstTypeMunitionsAssocieCapaciteFeux, NotificationChain msgs) {
		TypeAssociation oldEstTypeMunitionsAssocieCapaciteFeux = estTypeMunitionsAssocieCapaciteFeux;
		estTypeMunitionsAssocieCapaciteFeux = newEstTypeMunitionsAssocieCapaciteFeux;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_MUNITION__EST_TYPE_MUNITIONS_ASSOCIE_CAPACITE_FEUX, oldEstTypeMunitionsAssocieCapaciteFeux, newEstTypeMunitionsAssocieCapaciteFeux);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstTypeMunitionsAssocieCapaciteFeux(TypeAssociation newEstTypeMunitionsAssocieCapaciteFeux) {
		if (newEstTypeMunitionsAssocieCapaciteFeux != estTypeMunitionsAssocieCapaciteFeux) {
			NotificationChain msgs = null;
			if (estTypeMunitionsAssocieCapaciteFeux != null)
				msgs = ((InternalEObject)estTypeMunitionsAssocieCapaciteFeux).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_MUNITION__EST_TYPE_MUNITIONS_ASSOCIE_CAPACITE_FEUX, null, msgs);
			if (newEstTypeMunitionsAssocieCapaciteFeux != null)
				msgs = ((InternalEObject)newEstTypeMunitionsAssocieCapaciteFeux).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_MUNITION__EST_TYPE_MUNITIONS_ASSOCIE_CAPACITE_FEUX, null, msgs);
			msgs = basicSetEstTypeMunitionsAssocieCapaciteFeux(newEstTypeMunitionsAssocieCapaciteFeux, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_MUNITION__EST_TYPE_MUNITIONS_ASSOCIE_CAPACITE_FEUX, newEstTypeMunitionsAssocieCapaciteFeux, newEstTypeMunitionsAssocieCapaciteFeux));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_TYPE_MUNITION__EST_TYPE_MUNITIONS_ASSOCIE_CAPACITE_FEUX:
				return basicSetEstTypeMunitionsAssocieCapaciteFeux(null, msgs);
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
			case SchemaPackage.TYPE_TYPE_MUNITION__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_TYPE_MUNITION__CHARGEMENT:
				return getChargement();
			case SchemaPackage.TYPE_TYPE_MUNITION__CALIBRE:
				return getCalibre();
			case SchemaPackage.TYPE_TYPE_MUNITION__MECANISME_TIR_MINE_MARITIME:
				return getMecanismeTirMineMaritime();
			case SchemaPackage.TYPE_TYPE_MUNITION__COULEUR_ECLAT_MINE_EXERCICE:
				return getCouleurEclatMineExercice();
			case SchemaPackage.TYPE_TYPE_MUNITION__EST_TYPE_MUNITIONS_ASSOCIE_CAPACITE_FEUX:
				return getEstTypeMunitionsAssocieCapaciteFeux();
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
			case SchemaPackage.TYPE_TYPE_MUNITION__CATEGORIE:
				setCategorie((TypeDictionaryDicoTypeMunitionCategorie)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_MUNITION__CHARGEMENT:
				setChargement((TypeDictionaryDicoTypeMunitionChargement)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_MUNITION__CALIBRE:
				setCalibre((String)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_MUNITION__MECANISME_TIR_MINE_MARITIME:
				setMecanismeTirMineMaritime((TypeDictionaryDicoTypeMunitionMecanismeTirMineMaritime)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_MUNITION__COULEUR_ECLAT_MINE_EXERCICE:
				setCouleurEclatMineExercice((TypeDictionaryDicoTypeMunitionCouleurEclatMineExercice)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_MUNITION__EST_TYPE_MUNITIONS_ASSOCIE_CAPACITE_FEUX:
				setEstTypeMunitionsAssocieCapaciteFeux((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_TYPE_MUNITION__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_TYPE_MUNITION__CHARGEMENT:
				unsetChargement();
				return;
			case SchemaPackage.TYPE_TYPE_MUNITION__CALIBRE:
				setCalibre(CALIBRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TYPE_MUNITION__MECANISME_TIR_MINE_MARITIME:
				unsetMecanismeTirMineMaritime();
				return;
			case SchemaPackage.TYPE_TYPE_MUNITION__COULEUR_ECLAT_MINE_EXERCICE:
				unsetCouleurEclatMineExercice();
				return;
			case SchemaPackage.TYPE_TYPE_MUNITION__EST_TYPE_MUNITIONS_ASSOCIE_CAPACITE_FEUX:
				setEstTypeMunitionsAssocieCapaciteFeux((TypeAssociation)null);
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
			case SchemaPackage.TYPE_TYPE_MUNITION__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_TYPE_MUNITION__CHARGEMENT:
				return isSetChargement();
			case SchemaPackage.TYPE_TYPE_MUNITION__CALIBRE:
				return CALIBRE_EDEFAULT == null ? calibre != null : !CALIBRE_EDEFAULT.equals(calibre);
			case SchemaPackage.TYPE_TYPE_MUNITION__MECANISME_TIR_MINE_MARITIME:
				return isSetMecanismeTirMineMaritime();
			case SchemaPackage.TYPE_TYPE_MUNITION__COULEUR_ECLAT_MINE_EXERCICE:
				return isSetCouleurEclatMineExercice();
			case SchemaPackage.TYPE_TYPE_MUNITION__EST_TYPE_MUNITIONS_ASSOCIE_CAPACITE_FEUX:
				return estTypeMunitionsAssocieCapaciteFeux != null;
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
		result.append(", chargement: ");
		if (chargementESet) result.append(chargement); else result.append("<unset>");
		result.append(", calibre: ");
		result.append(calibre);
		result.append(", mecanismeTirMineMaritime: ");
		if (mecanismeTirMineMaritimeESet) result.append(mecanismeTirMineMaritime); else result.append("<unset>");
		result.append(", couleurEclatMineExercice: ");
		if (couleurEclatMineExerciceESet) result.append(couleurEclatMineExercice); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeTypeMunitionImpl
