/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeDateHeure;
import mpia.meta.TypeDataTypeLongueur;
import mpia.meta.TypeDataTypeMasse;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoEtatCivilGroupeSanguin;
import mpia.schema.TypeDictionaryDicoEtatCivilSituationFamille;
import mpia.schema.TypeEtatCivil;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Etat Civil</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEtatCivilImpl#getDateNaissance <em>Date Naissance</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatCivilImpl#getGroupeSanguin <em>Groupe Sanguin</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatCivilImpl#getLieuNaissance <em>Lieu Naissance</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatCivilImpl#getPatronyme <em>Patronyme</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatCivilImpl#getPoids <em>Poids</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatCivilImpl#getCouleurCheveux <em>Couleur Cheveux</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatCivilImpl#getDateDeces <em>Date Deces</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatCivilImpl#getSituationFamille <em>Situation Famille</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatCivilImpl#getCouleurYeux <em>Couleur Yeux</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatCivilImpl#getNombreEnfants <em>Nombre Enfants</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatCivilImpl#getTaille <em>Taille</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEtatCivilImpl extends EObjectImpl implements TypeEtatCivil {
	/**
	 * The cached value of the '{@link #getDateNaissance() <em>Date Naissance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateNaissance()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDateHeure dateNaissance;

	/**
	 * The default value of the '{@link #getGroupeSanguin() <em>Groupe Sanguin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupeSanguin()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatCivilGroupeSanguin GROUPE_SANGUIN_EDEFAULT = TypeDictionaryDicoEtatCivilGroupeSanguin.APLUS;

	/**
	 * The cached value of the '{@link #getGroupeSanguin() <em>Groupe Sanguin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupeSanguin()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatCivilGroupeSanguin groupeSanguin = GROUPE_SANGUIN_EDEFAULT;

	/**
	 * This is true if the Groupe Sanguin attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean groupeSanguinESet;

	/**
	 * The default value of the '{@link #getLieuNaissance() <em>Lieu Naissance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLieuNaissance()
	 * @generated
	 * @ordered
	 */
	protected static final String LIEU_NAISSANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLieuNaissance() <em>Lieu Naissance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLieuNaissance()
	 * @generated
	 * @ordered
	 */
	protected String lieuNaissance = LIEU_NAISSANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPatronyme() <em>Patronyme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatronyme()
	 * @generated
	 * @ordered
	 */
	protected static final String PATRONYME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPatronyme() <em>Patronyme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatronyme()
	 * @generated
	 * @ordered
	 */
	protected String patronyme = PATRONYME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPoids() <em>Poids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoids()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeMasse poids;

	/**
	 * The default value of the '{@link #getCouleurCheveux() <em>Couleur Cheveux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouleurCheveux()
	 * @generated
	 * @ordered
	 */
	protected static final String COULEUR_CHEVEUX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCouleurCheveux() <em>Couleur Cheveux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouleurCheveux()
	 * @generated
	 * @ordered
	 */
	protected String couleurCheveux = COULEUR_CHEVEUX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDateDeces() <em>Date Deces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDeces()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDateHeure dateDeces;

	/**
	 * The default value of the '{@link #getSituationFamille() <em>Situation Famille</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSituationFamille()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatCivilSituationFamille SITUATION_FAMILLE_EDEFAULT = TypeDictionaryDicoEtatCivilSituationFamille.SINGLE;

	/**
	 * The cached value of the '{@link #getSituationFamille() <em>Situation Famille</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSituationFamille()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatCivilSituationFamille situationFamille = SITUATION_FAMILLE_EDEFAULT;

	/**
	 * This is true if the Situation Famille attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean situationFamilleESet;

	/**
	 * The default value of the '{@link #getCouleurYeux() <em>Couleur Yeux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouleurYeux()
	 * @generated
	 * @ordered
	 */
	protected static final String COULEUR_YEUX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCouleurYeux() <em>Couleur Yeux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouleurYeux()
	 * @generated
	 * @ordered
	 */
	protected String couleurYeux = COULEUR_YEUX_EDEFAULT;

	/**
	 * The default value of the '{@link #getNombreEnfants() <em>Nombre Enfants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreEnfants()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_ENFANTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombreEnfants() <em>Nombre Enfants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreEnfants()
	 * @generated
	 * @ordered
	 */
	protected String nombreEnfants = NOMBRE_ENFANTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTaille() <em>Taille</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaille()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur taille;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEtatCivilImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEtatCivil();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDateHeure getDateNaissance() {
		return dateNaissance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateNaissance(TypeDataTypeDateHeure newDateNaissance, NotificationChain msgs) {
		TypeDataTypeDateHeure oldDateNaissance = dateNaissance;
		dateNaissance = newDateNaissance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_CIVIL__DATE_NAISSANCE, oldDateNaissance, newDateNaissance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateNaissance(TypeDataTypeDateHeure newDateNaissance) {
		if (newDateNaissance != dateNaissance) {
			NotificationChain msgs = null;
			if (dateNaissance != null)
				msgs = ((InternalEObject)dateNaissance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_CIVIL__DATE_NAISSANCE, null, msgs);
			if (newDateNaissance != null)
				msgs = ((InternalEObject)newDateNaissance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_CIVIL__DATE_NAISSANCE, null, msgs);
			msgs = basicSetDateNaissance(newDateNaissance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_CIVIL__DATE_NAISSANCE, newDateNaissance, newDateNaissance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatCivilGroupeSanguin getGroupeSanguin() {
		return groupeSanguin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupeSanguin(TypeDictionaryDicoEtatCivilGroupeSanguin newGroupeSanguin) {
		TypeDictionaryDicoEtatCivilGroupeSanguin oldGroupeSanguin = groupeSanguin;
		groupeSanguin = newGroupeSanguin == null ? GROUPE_SANGUIN_EDEFAULT : newGroupeSanguin;
		boolean oldGroupeSanguinESet = groupeSanguinESet;
		groupeSanguinESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_CIVIL__GROUPE_SANGUIN, oldGroupeSanguin, groupeSanguin, !oldGroupeSanguinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGroupeSanguin() {
		TypeDictionaryDicoEtatCivilGroupeSanguin oldGroupeSanguin = groupeSanguin;
		boolean oldGroupeSanguinESet = groupeSanguinESet;
		groupeSanguin = GROUPE_SANGUIN_EDEFAULT;
		groupeSanguinESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_CIVIL__GROUPE_SANGUIN, oldGroupeSanguin, GROUPE_SANGUIN_EDEFAULT, oldGroupeSanguinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGroupeSanguin() {
		return groupeSanguinESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLieuNaissance() {
		return lieuNaissance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLieuNaissance(String newLieuNaissance) {
		String oldLieuNaissance = lieuNaissance;
		lieuNaissance = newLieuNaissance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_CIVIL__LIEU_NAISSANCE, oldLieuNaissance, lieuNaissance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPatronyme() {
		return patronyme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatronyme(String newPatronyme) {
		String oldPatronyme = patronyme;
		patronyme = newPatronyme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_CIVIL__PATRONYME, oldPatronyme, patronyme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeMasse getPoids() {
		return poids;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPoids(TypeDataTypeMasse newPoids, NotificationChain msgs) {
		TypeDataTypeMasse oldPoids = poids;
		poids = newPoids;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_CIVIL__POIDS, oldPoids, newPoids);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoids(TypeDataTypeMasse newPoids) {
		if (newPoids != poids) {
			NotificationChain msgs = null;
			if (poids != null)
				msgs = ((InternalEObject)poids).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_CIVIL__POIDS, null, msgs);
			if (newPoids != null)
				msgs = ((InternalEObject)newPoids).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_CIVIL__POIDS, null, msgs);
			msgs = basicSetPoids(newPoids, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_CIVIL__POIDS, newPoids, newPoids));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCouleurCheveux() {
		return couleurCheveux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCouleurCheveux(String newCouleurCheveux) {
		String oldCouleurCheveux = couleurCheveux;
		couleurCheveux = newCouleurCheveux;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_CIVIL__COULEUR_CHEVEUX, oldCouleurCheveux, couleurCheveux));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDateHeure getDateDeces() {
		return dateDeces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateDeces(TypeDataTypeDateHeure newDateDeces, NotificationChain msgs) {
		TypeDataTypeDateHeure oldDateDeces = dateDeces;
		dateDeces = newDateDeces;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_CIVIL__DATE_DECES, oldDateDeces, newDateDeces);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDeces(TypeDataTypeDateHeure newDateDeces) {
		if (newDateDeces != dateDeces) {
			NotificationChain msgs = null;
			if (dateDeces != null)
				msgs = ((InternalEObject)dateDeces).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_CIVIL__DATE_DECES, null, msgs);
			if (newDateDeces != null)
				msgs = ((InternalEObject)newDateDeces).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_CIVIL__DATE_DECES, null, msgs);
			msgs = basicSetDateDeces(newDateDeces, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_CIVIL__DATE_DECES, newDateDeces, newDateDeces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatCivilSituationFamille getSituationFamille() {
		return situationFamille;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSituationFamille(TypeDictionaryDicoEtatCivilSituationFamille newSituationFamille) {
		TypeDictionaryDicoEtatCivilSituationFamille oldSituationFamille = situationFamille;
		situationFamille = newSituationFamille == null ? SITUATION_FAMILLE_EDEFAULT : newSituationFamille;
		boolean oldSituationFamilleESet = situationFamilleESet;
		situationFamilleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_CIVIL__SITUATION_FAMILLE, oldSituationFamille, situationFamille, !oldSituationFamilleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSituationFamille() {
		TypeDictionaryDicoEtatCivilSituationFamille oldSituationFamille = situationFamille;
		boolean oldSituationFamilleESet = situationFamilleESet;
		situationFamille = SITUATION_FAMILLE_EDEFAULT;
		situationFamilleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_CIVIL__SITUATION_FAMILLE, oldSituationFamille, SITUATION_FAMILLE_EDEFAULT, oldSituationFamilleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSituationFamille() {
		return situationFamilleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCouleurYeux() {
		return couleurYeux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCouleurYeux(String newCouleurYeux) {
		String oldCouleurYeux = couleurYeux;
		couleurYeux = newCouleurYeux;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_CIVIL__COULEUR_YEUX, oldCouleurYeux, couleurYeux));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombreEnfants() {
		return nombreEnfants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreEnfants(String newNombreEnfants) {
		String oldNombreEnfants = nombreEnfants;
		nombreEnfants = newNombreEnfants;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_CIVIL__NOMBRE_ENFANTS, oldNombreEnfants, nombreEnfants));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getTaille() {
		return taille;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTaille(TypeDataTypeLongueur newTaille, NotificationChain msgs) {
		TypeDataTypeLongueur oldTaille = taille;
		taille = newTaille;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_CIVIL__TAILLE, oldTaille, newTaille);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaille(TypeDataTypeLongueur newTaille) {
		if (newTaille != taille) {
			NotificationChain msgs = null;
			if (taille != null)
				msgs = ((InternalEObject)taille).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_CIVIL__TAILLE, null, msgs);
			if (newTaille != null)
				msgs = ((InternalEObject)newTaille).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_CIVIL__TAILLE, null, msgs);
			msgs = basicSetTaille(newTaille, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_CIVIL__TAILLE, newTaille, newTaille));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ETAT_CIVIL__DATE_NAISSANCE:
				return basicSetDateNaissance(null, msgs);
			case SchemaPackage.TYPE_ETAT_CIVIL__POIDS:
				return basicSetPoids(null, msgs);
			case SchemaPackage.TYPE_ETAT_CIVIL__DATE_DECES:
				return basicSetDateDeces(null, msgs);
			case SchemaPackage.TYPE_ETAT_CIVIL__TAILLE:
				return basicSetTaille(null, msgs);
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
			case SchemaPackage.TYPE_ETAT_CIVIL__DATE_NAISSANCE:
				return getDateNaissance();
			case SchemaPackage.TYPE_ETAT_CIVIL__GROUPE_SANGUIN:
				return getGroupeSanguin();
			case SchemaPackage.TYPE_ETAT_CIVIL__LIEU_NAISSANCE:
				return getLieuNaissance();
			case SchemaPackage.TYPE_ETAT_CIVIL__PATRONYME:
				return getPatronyme();
			case SchemaPackage.TYPE_ETAT_CIVIL__POIDS:
				return getPoids();
			case SchemaPackage.TYPE_ETAT_CIVIL__COULEUR_CHEVEUX:
				return getCouleurCheveux();
			case SchemaPackage.TYPE_ETAT_CIVIL__DATE_DECES:
				return getDateDeces();
			case SchemaPackage.TYPE_ETAT_CIVIL__SITUATION_FAMILLE:
				return getSituationFamille();
			case SchemaPackage.TYPE_ETAT_CIVIL__COULEUR_YEUX:
				return getCouleurYeux();
			case SchemaPackage.TYPE_ETAT_CIVIL__NOMBRE_ENFANTS:
				return getNombreEnfants();
			case SchemaPackage.TYPE_ETAT_CIVIL__TAILLE:
				return getTaille();
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
			case SchemaPackage.TYPE_ETAT_CIVIL__DATE_NAISSANCE:
				setDateNaissance((TypeDataTypeDateHeure)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_CIVIL__GROUPE_SANGUIN:
				setGroupeSanguin((TypeDictionaryDicoEtatCivilGroupeSanguin)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_CIVIL__LIEU_NAISSANCE:
				setLieuNaissance((String)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_CIVIL__PATRONYME:
				setPatronyme((String)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_CIVIL__POIDS:
				setPoids((TypeDataTypeMasse)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_CIVIL__COULEUR_CHEVEUX:
				setCouleurCheveux((String)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_CIVIL__DATE_DECES:
				setDateDeces((TypeDataTypeDateHeure)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_CIVIL__SITUATION_FAMILLE:
				setSituationFamille((TypeDictionaryDicoEtatCivilSituationFamille)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_CIVIL__COULEUR_YEUX:
				setCouleurYeux((String)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_CIVIL__NOMBRE_ENFANTS:
				setNombreEnfants((String)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_CIVIL__TAILLE:
				setTaille((TypeDataTypeLongueur)newValue);
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
			case SchemaPackage.TYPE_ETAT_CIVIL__DATE_NAISSANCE:
				setDateNaissance((TypeDataTypeDateHeure)null);
				return;
			case SchemaPackage.TYPE_ETAT_CIVIL__GROUPE_SANGUIN:
				unsetGroupeSanguin();
				return;
			case SchemaPackage.TYPE_ETAT_CIVIL__LIEU_NAISSANCE:
				setLieuNaissance(LIEU_NAISSANCE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ETAT_CIVIL__PATRONYME:
				setPatronyme(PATRONYME_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ETAT_CIVIL__POIDS:
				setPoids((TypeDataTypeMasse)null);
				return;
			case SchemaPackage.TYPE_ETAT_CIVIL__COULEUR_CHEVEUX:
				setCouleurCheveux(COULEUR_CHEVEUX_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ETAT_CIVIL__DATE_DECES:
				setDateDeces((TypeDataTypeDateHeure)null);
				return;
			case SchemaPackage.TYPE_ETAT_CIVIL__SITUATION_FAMILLE:
				unsetSituationFamille();
				return;
			case SchemaPackage.TYPE_ETAT_CIVIL__COULEUR_YEUX:
				setCouleurYeux(COULEUR_YEUX_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ETAT_CIVIL__NOMBRE_ENFANTS:
				setNombreEnfants(NOMBRE_ENFANTS_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ETAT_CIVIL__TAILLE:
				setTaille((TypeDataTypeLongueur)null);
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
			case SchemaPackage.TYPE_ETAT_CIVIL__DATE_NAISSANCE:
				return dateNaissance != null;
			case SchemaPackage.TYPE_ETAT_CIVIL__GROUPE_SANGUIN:
				return isSetGroupeSanguin();
			case SchemaPackage.TYPE_ETAT_CIVIL__LIEU_NAISSANCE:
				return LIEU_NAISSANCE_EDEFAULT == null ? lieuNaissance != null : !LIEU_NAISSANCE_EDEFAULT.equals(lieuNaissance);
			case SchemaPackage.TYPE_ETAT_CIVIL__PATRONYME:
				return PATRONYME_EDEFAULT == null ? patronyme != null : !PATRONYME_EDEFAULT.equals(patronyme);
			case SchemaPackage.TYPE_ETAT_CIVIL__POIDS:
				return poids != null;
			case SchemaPackage.TYPE_ETAT_CIVIL__COULEUR_CHEVEUX:
				return COULEUR_CHEVEUX_EDEFAULT == null ? couleurCheveux != null : !COULEUR_CHEVEUX_EDEFAULT.equals(couleurCheveux);
			case SchemaPackage.TYPE_ETAT_CIVIL__DATE_DECES:
				return dateDeces != null;
			case SchemaPackage.TYPE_ETAT_CIVIL__SITUATION_FAMILLE:
				return isSetSituationFamille();
			case SchemaPackage.TYPE_ETAT_CIVIL__COULEUR_YEUX:
				return COULEUR_YEUX_EDEFAULT == null ? couleurYeux != null : !COULEUR_YEUX_EDEFAULT.equals(couleurYeux);
			case SchemaPackage.TYPE_ETAT_CIVIL__NOMBRE_ENFANTS:
				return NOMBRE_ENFANTS_EDEFAULT == null ? nombreEnfants != null : !NOMBRE_ENFANTS_EDEFAULT.equals(nombreEnfants);
			case SchemaPackage.TYPE_ETAT_CIVIL__TAILLE:
				return taille != null;
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
		result.append(" (groupeSanguin: ");
		if (groupeSanguinESet) result.append(groupeSanguin); else result.append("<unset>");
		result.append(", lieuNaissance: ");
		result.append(lieuNaissance);
		result.append(", patronyme: ");
		result.append(patronyme);
		result.append(", couleurCheveux: ");
		result.append(couleurCheveux);
		result.append(", situationFamille: ");
		if (situationFamilleESet) result.append(situationFamille); else result.append("<unset>");
		result.append(", couleurYeux: ");
		result.append(couleurYeux);
		result.append(", nombreEnfants: ");
		result.append(nombreEnfants);
		result.append(')');
		return result.toString();
	}

} //TypeEtatCivilImpl
