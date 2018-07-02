/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeDataTypeAngle;
import mpia.meta.TypeDataTypeDuree;
import mpia.meta.TypeDataTypeLongueur;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoPuissanceDetonation;
import mpia.schema.TypeEvenementArmeNucleaire;
import mpia.schema.TypeLocalisation;
import mpia.schema.TypeMesureNuage;
import mpia.schema.TypeParametresZoneRetombees;

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
 * An implementation of the model object '<em><b>Type Evenement Arme Nucleaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEvenementArmeNucleaireImpl#getDureePropagationBang <em>Duree Propagation Bang</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementArmeNucleaireImpl#isPresenceCratere <em>Presence Cratere</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementArmeNucleaireImpl#getLargeurCratere <em>Largeur Cratere</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementArmeNucleaireImpl#getQuantiteEnergieLiberee <em>Quantite Energie Liberee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementArmeNucleaireImpl#getAngleNuageH5 <em>Angle Nuage H5</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementArmeNucleaireImpl#getDirectionNuage <em>Direction Nuage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementArmeNucleaireImpl#getCategorieEnergieLiberee <em>Categorie Energie Liberee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementArmeNucleaireImpl#getAPourLocalisationNuageLocalisation <em>APour Localisation Nuage Localisation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementArmeNucleaireImpl#getMesureH10MesureNuage <em>Mesure H10 Mesure Nuage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenementArmeNucleaireImpl#getAPourParametresPrevisionnelsParametresZoneRetombees <em>APour Parametres Previsionnels Parametres Zone Retombees</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEvenementArmeNucleaireImpl extends TypeEvenementNucleaireImpl implements TypeEvenementArmeNucleaire {
	/**
	 * The cached value of the '{@link #getDureePropagationBang() <em>Duree Propagation Bang</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDureePropagationBang()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree dureePropagationBang;

	/**
	 * The default value of the '{@link #isPresenceCratere() <em>Presence Cratere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPresenceCratere()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRESENCE_CRATERE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPresenceCratere() <em>Presence Cratere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPresenceCratere()
	 * @generated
	 * @ordered
	 */
	protected boolean presenceCratere = PRESENCE_CRATERE_EDEFAULT;

	/**
	 * This is true if the Presence Cratere attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean presenceCratereESet;

	/**
	 * The cached value of the '{@link #getLargeurCratere() <em>Largeur Cratere</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeurCratere()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur largeurCratere;

	/**
	 * The default value of the '{@link #getQuantiteEnergieLiberee() <em>Quantite Energie Liberee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteEnergieLiberee()
	 * @generated
	 * @ordered
	 */
	protected static final double QUANTITE_ENERGIE_LIBEREE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getQuantiteEnergieLiberee() <em>Quantite Energie Liberee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteEnergieLiberee()
	 * @generated
	 * @ordered
	 */
	protected double quantiteEnergieLiberee = QUANTITE_ENERGIE_LIBEREE_EDEFAULT;

	/**
	 * This is true if the Quantite Energie Liberee attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quantiteEnergieLibereeESet;

	/**
	 * The cached value of the '{@link #getAngleNuageH5() <em>Angle Nuage H5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleNuageH5()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAngle angleNuageH5;

	/**
	 * The cached value of the '{@link #getDirectionNuage() <em>Direction Nuage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectionNuage()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAngle directionNuage;

	/**
	 * The default value of the '{@link #getCategorieEnergieLiberee() <em>Categorie Energie Liberee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorieEnergieLiberee()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPuissanceDetonation CATEGORIE_ENERGIE_LIBEREE_EDEFAULT = TypeDictionaryDicoPuissanceDetonation.ALFA;

	/**
	 * The cached value of the '{@link #getCategorieEnergieLiberee() <em>Categorie Energie Liberee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorieEnergieLiberee()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPuissanceDetonation categorieEnergieLiberee = CATEGORIE_ENERGIE_LIBEREE_EDEFAULT;

	/**
	 * This is true if the Categorie Energie Liberee attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieEnergieLibereeESet;

	/**
	 * The cached value of the '{@link #getAPourLocalisationNuageLocalisation() <em>APour Localisation Nuage Localisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourLocalisationNuageLocalisation()
	 * @generated
	 * @ordered
	 */
	protected TypeLocalisation aPourLocalisationNuageLocalisation;

	/**
	 * The cached value of the '{@link #getMesureH10MesureNuage() <em>Mesure H10 Mesure Nuage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMesureH10MesureNuage()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeMesureNuage> mesureH10MesureNuage;

	/**
	 * The cached value of the '{@link #getAPourParametresPrevisionnelsParametresZoneRetombees() <em>APour Parametres Previsionnels Parametres Zone Retombees</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourParametresPrevisionnelsParametresZoneRetombees()
	 * @generated
	 * @ordered
	 */
	protected TypeParametresZoneRetombees aPourParametresPrevisionnelsParametresZoneRetombees;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEvenementArmeNucleaireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEvenementArmeNucleaire();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getDureePropagationBang() {
		return dureePropagationBang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDureePropagationBang(TypeDataTypeDuree newDureePropagationBang, NotificationChain msgs) {
		TypeDataTypeDuree oldDureePropagationBang = dureePropagationBang;
		dureePropagationBang = newDureePropagationBang;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__DUREE_PROPAGATION_BANG, oldDureePropagationBang, newDureePropagationBang);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDureePropagationBang(TypeDataTypeDuree newDureePropagationBang) {
		if (newDureePropagationBang != dureePropagationBang) {
			NotificationChain msgs = null;
			if (dureePropagationBang != null)
				msgs = ((InternalEObject)dureePropagationBang).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__DUREE_PROPAGATION_BANG, null, msgs);
			if (newDureePropagationBang != null)
				msgs = ((InternalEObject)newDureePropagationBang).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__DUREE_PROPAGATION_BANG, null, msgs);
			msgs = basicSetDureePropagationBang(newDureePropagationBang, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__DUREE_PROPAGATION_BANG, newDureePropagationBang, newDureePropagationBang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPresenceCratere() {
		return presenceCratere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresenceCratere(boolean newPresenceCratere) {
		boolean oldPresenceCratere = presenceCratere;
		presenceCratere = newPresenceCratere;
		boolean oldPresenceCratereESet = presenceCratereESet;
		presenceCratereESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__PRESENCE_CRATERE, oldPresenceCratere, presenceCratere, !oldPresenceCratereESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPresenceCratere() {
		boolean oldPresenceCratere = presenceCratere;
		boolean oldPresenceCratereESet = presenceCratereESet;
		presenceCratere = PRESENCE_CRATERE_EDEFAULT;
		presenceCratereESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__PRESENCE_CRATERE, oldPresenceCratere, PRESENCE_CRATERE_EDEFAULT, oldPresenceCratereESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPresenceCratere() {
		return presenceCratereESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getLargeurCratere() {
		return largeurCratere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLargeurCratere(TypeDataTypeLongueur newLargeurCratere, NotificationChain msgs) {
		TypeDataTypeLongueur oldLargeurCratere = largeurCratere;
		largeurCratere = newLargeurCratere;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__LARGEUR_CRATERE, oldLargeurCratere, newLargeurCratere);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLargeurCratere(TypeDataTypeLongueur newLargeurCratere) {
		if (newLargeurCratere != largeurCratere) {
			NotificationChain msgs = null;
			if (largeurCratere != null)
				msgs = ((InternalEObject)largeurCratere).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__LARGEUR_CRATERE, null, msgs);
			if (newLargeurCratere != null)
				msgs = ((InternalEObject)newLargeurCratere).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__LARGEUR_CRATERE, null, msgs);
			msgs = basicSetLargeurCratere(newLargeurCratere, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__LARGEUR_CRATERE, newLargeurCratere, newLargeurCratere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getQuantiteEnergieLiberee() {
		return quantiteEnergieLiberee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantiteEnergieLiberee(double newQuantiteEnergieLiberee) {
		double oldQuantiteEnergieLiberee = quantiteEnergieLiberee;
		quantiteEnergieLiberee = newQuantiteEnergieLiberee;
		boolean oldQuantiteEnergieLibereeESet = quantiteEnergieLibereeESet;
		quantiteEnergieLibereeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__QUANTITE_ENERGIE_LIBEREE, oldQuantiteEnergieLiberee, quantiteEnergieLiberee, !oldQuantiteEnergieLibereeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuantiteEnergieLiberee() {
		double oldQuantiteEnergieLiberee = quantiteEnergieLiberee;
		boolean oldQuantiteEnergieLibereeESet = quantiteEnergieLibereeESet;
		quantiteEnergieLiberee = QUANTITE_ENERGIE_LIBEREE_EDEFAULT;
		quantiteEnergieLibereeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__QUANTITE_ENERGIE_LIBEREE, oldQuantiteEnergieLiberee, QUANTITE_ENERGIE_LIBEREE_EDEFAULT, oldQuantiteEnergieLibereeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuantiteEnergieLiberee() {
		return quantiteEnergieLibereeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAngle getAngleNuageH5() {
		return angleNuageH5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngleNuageH5(TypeDataTypeAngle newAngleNuageH5, NotificationChain msgs) {
		TypeDataTypeAngle oldAngleNuageH5 = angleNuageH5;
		angleNuageH5 = newAngleNuageH5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__ANGLE_NUAGE_H5, oldAngleNuageH5, newAngleNuageH5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngleNuageH5(TypeDataTypeAngle newAngleNuageH5) {
		if (newAngleNuageH5 != angleNuageH5) {
			NotificationChain msgs = null;
			if (angleNuageH5 != null)
				msgs = ((InternalEObject)angleNuageH5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__ANGLE_NUAGE_H5, null, msgs);
			if (newAngleNuageH5 != null)
				msgs = ((InternalEObject)newAngleNuageH5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__ANGLE_NUAGE_H5, null, msgs);
			msgs = basicSetAngleNuageH5(newAngleNuageH5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__ANGLE_NUAGE_H5, newAngleNuageH5, newAngleNuageH5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAngle getDirectionNuage() {
		return directionNuage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirectionNuage(TypeDataTypeAngle newDirectionNuage, NotificationChain msgs) {
		TypeDataTypeAngle oldDirectionNuage = directionNuage;
		directionNuage = newDirectionNuage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__DIRECTION_NUAGE, oldDirectionNuage, newDirectionNuage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectionNuage(TypeDataTypeAngle newDirectionNuage) {
		if (newDirectionNuage != directionNuage) {
			NotificationChain msgs = null;
			if (directionNuage != null)
				msgs = ((InternalEObject)directionNuage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__DIRECTION_NUAGE, null, msgs);
			if (newDirectionNuage != null)
				msgs = ((InternalEObject)newDirectionNuage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__DIRECTION_NUAGE, null, msgs);
			msgs = basicSetDirectionNuage(newDirectionNuage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__DIRECTION_NUAGE, newDirectionNuage, newDirectionNuage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPuissanceDetonation getCategorieEnergieLiberee() {
		return categorieEnergieLiberee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorieEnergieLiberee(TypeDictionaryDicoPuissanceDetonation newCategorieEnergieLiberee) {
		TypeDictionaryDicoPuissanceDetonation oldCategorieEnergieLiberee = categorieEnergieLiberee;
		categorieEnergieLiberee = newCategorieEnergieLiberee == null ? CATEGORIE_ENERGIE_LIBEREE_EDEFAULT : newCategorieEnergieLiberee;
		boolean oldCategorieEnergieLibereeESet = categorieEnergieLibereeESet;
		categorieEnergieLibereeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__CATEGORIE_ENERGIE_LIBEREE, oldCategorieEnergieLiberee, categorieEnergieLiberee, !oldCategorieEnergieLibereeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorieEnergieLiberee() {
		TypeDictionaryDicoPuissanceDetonation oldCategorieEnergieLiberee = categorieEnergieLiberee;
		boolean oldCategorieEnergieLibereeESet = categorieEnergieLibereeESet;
		categorieEnergieLiberee = CATEGORIE_ENERGIE_LIBEREE_EDEFAULT;
		categorieEnergieLibereeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__CATEGORIE_ENERGIE_LIBEREE, oldCategorieEnergieLiberee, CATEGORIE_ENERGIE_LIBEREE_EDEFAULT, oldCategorieEnergieLibereeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCategorieEnergieLiberee() {
		return categorieEnergieLibereeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeLocalisation getAPourLocalisationNuageLocalisation() {
		return aPourLocalisationNuageLocalisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourLocalisationNuageLocalisation(TypeLocalisation newAPourLocalisationNuageLocalisation, NotificationChain msgs) {
		TypeLocalisation oldAPourLocalisationNuageLocalisation = aPourLocalisationNuageLocalisation;
		aPourLocalisationNuageLocalisation = newAPourLocalisationNuageLocalisation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__APOUR_LOCALISATION_NUAGE_LOCALISATION, oldAPourLocalisationNuageLocalisation, newAPourLocalisationNuageLocalisation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourLocalisationNuageLocalisation(TypeLocalisation newAPourLocalisationNuageLocalisation) {
		if (newAPourLocalisationNuageLocalisation != aPourLocalisationNuageLocalisation) {
			NotificationChain msgs = null;
			if (aPourLocalisationNuageLocalisation != null)
				msgs = ((InternalEObject)aPourLocalisationNuageLocalisation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__APOUR_LOCALISATION_NUAGE_LOCALISATION, null, msgs);
			if (newAPourLocalisationNuageLocalisation != null)
				msgs = ((InternalEObject)newAPourLocalisationNuageLocalisation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__APOUR_LOCALISATION_NUAGE_LOCALISATION, null, msgs);
			msgs = basicSetAPourLocalisationNuageLocalisation(newAPourLocalisationNuageLocalisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__APOUR_LOCALISATION_NUAGE_LOCALISATION, newAPourLocalisationNuageLocalisation, newAPourLocalisationNuageLocalisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMesureNuage> getMesureH10MesureNuage() {
		if (mesureH10MesureNuage == null) {
			mesureH10MesureNuage = new EObjectContainmentEList<TypeMesureNuage>(TypeMesureNuage.class, this, SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__MESURE_H10_MESURE_NUAGE);
		}
		return mesureH10MesureNuage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeParametresZoneRetombees getAPourParametresPrevisionnelsParametresZoneRetombees() {
		return aPourParametresPrevisionnelsParametresZoneRetombees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourParametresPrevisionnelsParametresZoneRetombees(TypeParametresZoneRetombees newAPourParametresPrevisionnelsParametresZoneRetombees, NotificationChain msgs) {
		TypeParametresZoneRetombees oldAPourParametresPrevisionnelsParametresZoneRetombees = aPourParametresPrevisionnelsParametresZoneRetombees;
		aPourParametresPrevisionnelsParametresZoneRetombees = newAPourParametresPrevisionnelsParametresZoneRetombees;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__APOUR_PARAMETRES_PREVISIONNELS_PARAMETRES_ZONE_RETOMBEES, oldAPourParametresPrevisionnelsParametresZoneRetombees, newAPourParametresPrevisionnelsParametresZoneRetombees);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourParametresPrevisionnelsParametresZoneRetombees(TypeParametresZoneRetombees newAPourParametresPrevisionnelsParametresZoneRetombees) {
		if (newAPourParametresPrevisionnelsParametresZoneRetombees != aPourParametresPrevisionnelsParametresZoneRetombees) {
			NotificationChain msgs = null;
			if (aPourParametresPrevisionnelsParametresZoneRetombees != null)
				msgs = ((InternalEObject)aPourParametresPrevisionnelsParametresZoneRetombees).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__APOUR_PARAMETRES_PREVISIONNELS_PARAMETRES_ZONE_RETOMBEES, null, msgs);
			if (newAPourParametresPrevisionnelsParametresZoneRetombees != null)
				msgs = ((InternalEObject)newAPourParametresPrevisionnelsParametresZoneRetombees).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__APOUR_PARAMETRES_PREVISIONNELS_PARAMETRES_ZONE_RETOMBEES, null, msgs);
			msgs = basicSetAPourParametresPrevisionnelsParametresZoneRetombees(newAPourParametresPrevisionnelsParametresZoneRetombees, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__APOUR_PARAMETRES_PREVISIONNELS_PARAMETRES_ZONE_RETOMBEES, newAPourParametresPrevisionnelsParametresZoneRetombees, newAPourParametresPrevisionnelsParametresZoneRetombees));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__DUREE_PROPAGATION_BANG:
				return basicSetDureePropagationBang(null, msgs);
			case SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__LARGEUR_CRATERE:
				return basicSetLargeurCratere(null, msgs);
			case SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__ANGLE_NUAGE_H5:
				return basicSetAngleNuageH5(null, msgs);
			case SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__DIRECTION_NUAGE:
				return basicSetDirectionNuage(null, msgs);
			case SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__APOUR_LOCALISATION_NUAGE_LOCALISATION:
				return basicSetAPourLocalisationNuageLocalisation(null, msgs);
			case SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__MESURE_H10_MESURE_NUAGE:
				return ((InternalEList<?>)getMesureH10MesureNuage()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__APOUR_PARAMETRES_PREVISIONNELS_PARAMETRES_ZONE_RETOMBEES:
				return basicSetAPourParametresPrevisionnelsParametresZoneRetombees(null, msgs);
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
			case SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__DUREE_PROPAGATION_BANG:
				return getDureePropagationBang();
			case SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__PRESENCE_CRATERE:
				return isPresenceCratere() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__LARGEUR_CRATERE:
				return getLargeurCratere();
			case SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__QUANTITE_ENERGIE_LIBEREE:
				return new Double(getQuantiteEnergieLiberee());
			case SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__ANGLE_NUAGE_H5:
				return getAngleNuageH5();
			case SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__DIRECTION_NUAGE:
				return getDirectionNuage();
			case SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__CATEGORIE_ENERGIE_LIBEREE:
				return getCategorieEnergieLiberee();
			case SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__APOUR_LOCALISATION_NUAGE_LOCALISATION:
				return getAPourLocalisationNuageLocalisation();
			case SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__MESURE_H10_MESURE_NUAGE:
				return getMesureH10MesureNuage();
			case SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__APOUR_PARAMETRES_PREVISIONNELS_PARAMETRES_ZONE_RETOMBEES:
				return getAPourParametresPrevisionnelsParametresZoneRetombees();
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
			case SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__DUREE_PROPAGATION_BANG:
				setDureePropagationBang((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__PRESENCE_CRATERE:
				setPresenceCratere(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__LARGEUR_CRATERE:
				setLargeurCratere((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__QUANTITE_ENERGIE_LIBEREE:
				setQuantiteEnergieLiberee(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__ANGLE_NUAGE_H5:
				setAngleNuageH5((TypeDataTypeAngle)newValue);
				return;
			case SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__DIRECTION_NUAGE:
				setDirectionNuage((TypeDataTypeAngle)newValue);
				return;
			case SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__CATEGORIE_ENERGIE_LIBEREE:
				setCategorieEnergieLiberee((TypeDictionaryDicoPuissanceDetonation)newValue);
				return;
			case SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__APOUR_LOCALISATION_NUAGE_LOCALISATION:
				setAPourLocalisationNuageLocalisation((TypeLocalisation)newValue);
				return;
			case SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__MESURE_H10_MESURE_NUAGE:
				getMesureH10MesureNuage().clear();
				getMesureH10MesureNuage().addAll((Collection<? extends TypeMesureNuage>)newValue);
				return;
			case SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__APOUR_PARAMETRES_PREVISIONNELS_PARAMETRES_ZONE_RETOMBEES:
				setAPourParametresPrevisionnelsParametresZoneRetombees((TypeParametresZoneRetombees)newValue);
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
			case SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__DUREE_PROPAGATION_BANG:
				setDureePropagationBang((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__PRESENCE_CRATERE:
				unsetPresenceCratere();
				return;
			case SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__LARGEUR_CRATERE:
				setLargeurCratere((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__QUANTITE_ENERGIE_LIBEREE:
				unsetQuantiteEnergieLiberee();
				return;
			case SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__ANGLE_NUAGE_H5:
				setAngleNuageH5((TypeDataTypeAngle)null);
				return;
			case SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__DIRECTION_NUAGE:
				setDirectionNuage((TypeDataTypeAngle)null);
				return;
			case SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__CATEGORIE_ENERGIE_LIBEREE:
				unsetCategorieEnergieLiberee();
				return;
			case SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__APOUR_LOCALISATION_NUAGE_LOCALISATION:
				setAPourLocalisationNuageLocalisation((TypeLocalisation)null);
				return;
			case SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__MESURE_H10_MESURE_NUAGE:
				getMesureH10MesureNuage().clear();
				return;
			case SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__APOUR_PARAMETRES_PREVISIONNELS_PARAMETRES_ZONE_RETOMBEES:
				setAPourParametresPrevisionnelsParametresZoneRetombees((TypeParametresZoneRetombees)null);
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
			case SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__DUREE_PROPAGATION_BANG:
				return dureePropagationBang != null;
			case SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__PRESENCE_CRATERE:
				return isSetPresenceCratere();
			case SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__LARGEUR_CRATERE:
				return largeurCratere != null;
			case SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__QUANTITE_ENERGIE_LIBEREE:
				return isSetQuantiteEnergieLiberee();
			case SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__ANGLE_NUAGE_H5:
				return angleNuageH5 != null;
			case SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__DIRECTION_NUAGE:
				return directionNuage != null;
			case SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__CATEGORIE_ENERGIE_LIBEREE:
				return isSetCategorieEnergieLiberee();
			case SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__APOUR_LOCALISATION_NUAGE_LOCALISATION:
				return aPourLocalisationNuageLocalisation != null;
			case SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__MESURE_H10_MESURE_NUAGE:
				return mesureH10MesureNuage != null && !mesureH10MesureNuage.isEmpty();
			case SchemaPackage.TYPE_EVENEMENT_ARME_NUCLEAIRE__APOUR_PARAMETRES_PREVISIONNELS_PARAMETRES_ZONE_RETOMBEES:
				return aPourParametresPrevisionnelsParametresZoneRetombees != null;
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
		result.append(" (presenceCratere: ");
		if (presenceCratereESet) result.append(presenceCratere); else result.append("<unset>");
		result.append(", quantiteEnergieLiberee: ");
		if (quantiteEnergieLibereeESet) result.append(quantiteEnergieLiberee); else result.append("<unset>");
		result.append(", categorieEnergieLiberee: ");
		if (categorieEnergieLibereeESet) result.append(categorieEnergieLiberee); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeEvenementArmeNucleaireImpl
