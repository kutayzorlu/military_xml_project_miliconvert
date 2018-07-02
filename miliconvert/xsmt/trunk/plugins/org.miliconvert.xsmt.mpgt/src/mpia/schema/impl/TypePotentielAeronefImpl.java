/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeDuree;
import mpia.meta.TypeDataTypeVolume;

import mpia.schema.SchemaPackage;
import mpia.schema.TypePotentielAeronef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Potentiel Aeronef</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePotentielAeronefImpl#isDisponibiliteAeronautique <em>Disponibilite Aeronautique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePotentielAeronefImpl#isDisponibiliteSystemeArmeMajeur <em>Disponibilite Systeme Arme Majeur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePotentielAeronefImpl#getDisponibiliteSousSystemes <em>Disponibilite Sous Systemes</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePotentielAeronefImpl#getNombreLitresCarburantRestant <em>Nombre Litres Carburant Restant</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePotentielAeronefImpl#getPotentielHoraireRestant <em>Potentiel Horaire Restant</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePotentielAeronefImpl#getTempsVolConsommeAuCoursMouvement <em>Temps Vol Consomme Au Cours Mouvement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePotentielAeronefImpl#getTypeVI <em>Type VI</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePotentielAeronefImpl#getHeureCelluleVI <em>Heure Cellule VI</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePotentielAeronefImpl#getPotentielHoraireVI <em>Potentiel Horaire VI</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePotentielAeronefImpl#getPotentielHoraireVP <em>Potentiel Horaire VP</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePotentielAeronefImpl#getComplements <em>Complements</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePotentielAeronefImpl#getRestrictionEmploi <em>Restriction Emploi</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePotentielAeronefImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePotentielAeronefImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePotentielAeronefImpl#getConcerneAeronef <em>Concerne Aeronef</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePotentielAeronefImpl extends EObjectImpl implements TypePotentielAeronef {
	/**
	 * The default value of the '{@link #isDisponibiliteAeronautique() <em>Disponibilite Aeronautique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisponibiliteAeronautique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISPONIBILITE_AERONAUTIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDisponibiliteAeronautique() <em>Disponibilite Aeronautique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisponibiliteAeronautique()
	 * @generated
	 * @ordered
	 */
	protected boolean disponibiliteAeronautique = DISPONIBILITE_AERONAUTIQUE_EDEFAULT;

	/**
	 * This is true if the Disponibilite Aeronautique attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean disponibiliteAeronautiqueESet;

	/**
	 * The default value of the '{@link #isDisponibiliteSystemeArmeMajeur() <em>Disponibilite Systeme Arme Majeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisponibiliteSystemeArmeMajeur()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISPONIBILITE_SYSTEME_ARME_MAJEUR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDisponibiliteSystemeArmeMajeur() <em>Disponibilite Systeme Arme Majeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisponibiliteSystemeArmeMajeur()
	 * @generated
	 * @ordered
	 */
	protected boolean disponibiliteSystemeArmeMajeur = DISPONIBILITE_SYSTEME_ARME_MAJEUR_EDEFAULT;

	/**
	 * This is true if the Disponibilite Systeme Arme Majeur attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean disponibiliteSystemeArmeMajeurESet;

	/**
	 * The default value of the '{@link #getDisponibiliteSousSystemes() <em>Disponibilite Sous Systemes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisponibiliteSousSystemes()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPONIBILITE_SOUS_SYSTEMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisponibiliteSousSystemes() <em>Disponibilite Sous Systemes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisponibiliteSousSystemes()
	 * @generated
	 * @ordered
	 */
	protected String disponibiliteSousSystemes = DISPONIBILITE_SOUS_SYSTEMES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNombreLitresCarburantRestant() <em>Nombre Litres Carburant Restant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreLitresCarburantRestant()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeVolume nombreLitresCarburantRestant;

	/**
	 * The cached value of the '{@link #getPotentielHoraireRestant() <em>Potentiel Horaire Restant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPotentielHoraireRestant()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree potentielHoraireRestant;

	/**
	 * The cached value of the '{@link #getTempsVolConsommeAuCoursMouvement() <em>Temps Vol Consomme Au Cours Mouvement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempsVolConsommeAuCoursMouvement()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree tempsVolConsommeAuCoursMouvement;

	/**
	 * The default value of the '{@link #getTypeVI() <em>Type VI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeVI()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_VI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeVI() <em>Type VI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeVI()
	 * @generated
	 * @ordered
	 */
	protected String typeVI = TYPE_VI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHeureCelluleVI() <em>Heure Cellule VI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeureCelluleVI()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree heureCelluleVI;

	/**
	 * The cached value of the '{@link #getPotentielHoraireVI() <em>Potentiel Horaire VI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPotentielHoraireVI()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree potentielHoraireVI;

	/**
	 * The cached value of the '{@link #getPotentielHoraireVP() <em>Potentiel Horaire VP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPotentielHoraireVP()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree potentielHoraireVP;

	/**
	 * The default value of the '{@link #getComplements() <em>Complements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplements()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPLEMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComplements() <em>Complements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplements()
	 * @generated
	 * @ordered
	 */
	protected String complements = COMPLEMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRestrictionEmploi() <em>Restriction Emploi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestrictionEmploi()
	 * @generated
	 * @ordered
	 */
	protected static final String RESTRICTION_EMPLOI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRestrictionEmploi() <em>Restriction Emploi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestrictionEmploi()
	 * @generated
	 * @ordered
	 */
	protected String restrictionEmploi = RESTRICTION_EMPLOI_EDEFAULT;

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
	 * The cached value of the '{@link #getConcerneAeronef() <em>Concerne Aeronef</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneAeronef()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation concerneAeronef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypePotentielAeronefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePotentielAeronef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisponibiliteAeronautique() {
		return disponibiliteAeronautique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisponibiliteAeronautique(boolean newDisponibiliteAeronautique) {
		boolean oldDisponibiliteAeronautique = disponibiliteAeronautique;
		disponibiliteAeronautique = newDisponibiliteAeronautique;
		boolean oldDisponibiliteAeronautiqueESet = disponibiliteAeronautiqueESet;
		disponibiliteAeronautiqueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POTENTIEL_AERONEF__DISPONIBILITE_AERONAUTIQUE, oldDisponibiliteAeronautique, disponibiliteAeronautique, !oldDisponibiliteAeronautiqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisponibiliteAeronautique() {
		boolean oldDisponibiliteAeronautique = disponibiliteAeronautique;
		boolean oldDisponibiliteAeronautiqueESet = disponibiliteAeronautiqueESet;
		disponibiliteAeronautique = DISPONIBILITE_AERONAUTIQUE_EDEFAULT;
		disponibiliteAeronautiqueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_POTENTIEL_AERONEF__DISPONIBILITE_AERONAUTIQUE, oldDisponibiliteAeronautique, DISPONIBILITE_AERONAUTIQUE_EDEFAULT, oldDisponibiliteAeronautiqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisponibiliteAeronautique() {
		return disponibiliteAeronautiqueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisponibiliteSystemeArmeMajeur() {
		return disponibiliteSystemeArmeMajeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisponibiliteSystemeArmeMajeur(boolean newDisponibiliteSystemeArmeMajeur) {
		boolean oldDisponibiliteSystemeArmeMajeur = disponibiliteSystemeArmeMajeur;
		disponibiliteSystemeArmeMajeur = newDisponibiliteSystemeArmeMajeur;
		boolean oldDisponibiliteSystemeArmeMajeurESet = disponibiliteSystemeArmeMajeurESet;
		disponibiliteSystemeArmeMajeurESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POTENTIEL_AERONEF__DISPONIBILITE_SYSTEME_ARME_MAJEUR, oldDisponibiliteSystemeArmeMajeur, disponibiliteSystemeArmeMajeur, !oldDisponibiliteSystemeArmeMajeurESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisponibiliteSystemeArmeMajeur() {
		boolean oldDisponibiliteSystemeArmeMajeur = disponibiliteSystemeArmeMajeur;
		boolean oldDisponibiliteSystemeArmeMajeurESet = disponibiliteSystemeArmeMajeurESet;
		disponibiliteSystemeArmeMajeur = DISPONIBILITE_SYSTEME_ARME_MAJEUR_EDEFAULT;
		disponibiliteSystemeArmeMajeurESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_POTENTIEL_AERONEF__DISPONIBILITE_SYSTEME_ARME_MAJEUR, oldDisponibiliteSystemeArmeMajeur, DISPONIBILITE_SYSTEME_ARME_MAJEUR_EDEFAULT, oldDisponibiliteSystemeArmeMajeurESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisponibiliteSystemeArmeMajeur() {
		return disponibiliteSystemeArmeMajeurESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisponibiliteSousSystemes() {
		return disponibiliteSousSystemes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisponibiliteSousSystemes(String newDisponibiliteSousSystemes) {
		String oldDisponibiliteSousSystemes = disponibiliteSousSystemes;
		disponibiliteSousSystemes = newDisponibiliteSousSystemes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POTENTIEL_AERONEF__DISPONIBILITE_SOUS_SYSTEMES, oldDisponibiliteSousSystemes, disponibiliteSousSystemes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeVolume getNombreLitresCarburantRestant() {
		return nombreLitresCarburantRestant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNombreLitresCarburantRestant(TypeDataTypeVolume newNombreLitresCarburantRestant, NotificationChain msgs) {
		TypeDataTypeVolume oldNombreLitresCarburantRestant = nombreLitresCarburantRestant;
		nombreLitresCarburantRestant = newNombreLitresCarburantRestant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POTENTIEL_AERONEF__NOMBRE_LITRES_CARBURANT_RESTANT, oldNombreLitresCarburantRestant, newNombreLitresCarburantRestant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreLitresCarburantRestant(TypeDataTypeVolume newNombreLitresCarburantRestant) {
		if (newNombreLitresCarburantRestant != nombreLitresCarburantRestant) {
			NotificationChain msgs = null;
			if (nombreLitresCarburantRestant != null)
				msgs = ((InternalEObject)nombreLitresCarburantRestant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POTENTIEL_AERONEF__NOMBRE_LITRES_CARBURANT_RESTANT, null, msgs);
			if (newNombreLitresCarburantRestant != null)
				msgs = ((InternalEObject)newNombreLitresCarburantRestant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POTENTIEL_AERONEF__NOMBRE_LITRES_CARBURANT_RESTANT, null, msgs);
			msgs = basicSetNombreLitresCarburantRestant(newNombreLitresCarburantRestant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POTENTIEL_AERONEF__NOMBRE_LITRES_CARBURANT_RESTANT, newNombreLitresCarburantRestant, newNombreLitresCarburantRestant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getPotentielHoraireRestant() {
		return potentielHoraireRestant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPotentielHoraireRestant(TypeDataTypeDuree newPotentielHoraireRestant, NotificationChain msgs) {
		TypeDataTypeDuree oldPotentielHoraireRestant = potentielHoraireRestant;
		potentielHoraireRestant = newPotentielHoraireRestant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POTENTIEL_AERONEF__POTENTIEL_HORAIRE_RESTANT, oldPotentielHoraireRestant, newPotentielHoraireRestant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPotentielHoraireRestant(TypeDataTypeDuree newPotentielHoraireRestant) {
		if (newPotentielHoraireRestant != potentielHoraireRestant) {
			NotificationChain msgs = null;
			if (potentielHoraireRestant != null)
				msgs = ((InternalEObject)potentielHoraireRestant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POTENTIEL_AERONEF__POTENTIEL_HORAIRE_RESTANT, null, msgs);
			if (newPotentielHoraireRestant != null)
				msgs = ((InternalEObject)newPotentielHoraireRestant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POTENTIEL_AERONEF__POTENTIEL_HORAIRE_RESTANT, null, msgs);
			msgs = basicSetPotentielHoraireRestant(newPotentielHoraireRestant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POTENTIEL_AERONEF__POTENTIEL_HORAIRE_RESTANT, newPotentielHoraireRestant, newPotentielHoraireRestant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getTempsVolConsommeAuCoursMouvement() {
		return tempsVolConsommeAuCoursMouvement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTempsVolConsommeAuCoursMouvement(TypeDataTypeDuree newTempsVolConsommeAuCoursMouvement, NotificationChain msgs) {
		TypeDataTypeDuree oldTempsVolConsommeAuCoursMouvement = tempsVolConsommeAuCoursMouvement;
		tempsVolConsommeAuCoursMouvement = newTempsVolConsommeAuCoursMouvement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POTENTIEL_AERONEF__TEMPS_VOL_CONSOMME_AU_COURS_MOUVEMENT, oldTempsVolConsommeAuCoursMouvement, newTempsVolConsommeAuCoursMouvement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTempsVolConsommeAuCoursMouvement(TypeDataTypeDuree newTempsVolConsommeAuCoursMouvement) {
		if (newTempsVolConsommeAuCoursMouvement != tempsVolConsommeAuCoursMouvement) {
			NotificationChain msgs = null;
			if (tempsVolConsommeAuCoursMouvement != null)
				msgs = ((InternalEObject)tempsVolConsommeAuCoursMouvement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POTENTIEL_AERONEF__TEMPS_VOL_CONSOMME_AU_COURS_MOUVEMENT, null, msgs);
			if (newTempsVolConsommeAuCoursMouvement != null)
				msgs = ((InternalEObject)newTempsVolConsommeAuCoursMouvement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POTENTIEL_AERONEF__TEMPS_VOL_CONSOMME_AU_COURS_MOUVEMENT, null, msgs);
			msgs = basicSetTempsVolConsommeAuCoursMouvement(newTempsVolConsommeAuCoursMouvement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POTENTIEL_AERONEF__TEMPS_VOL_CONSOMME_AU_COURS_MOUVEMENT, newTempsVolConsommeAuCoursMouvement, newTempsVolConsommeAuCoursMouvement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeVI() {
		return typeVI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeVI(String newTypeVI) {
		String oldTypeVI = typeVI;
		typeVI = newTypeVI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POTENTIEL_AERONEF__TYPE_VI, oldTypeVI, typeVI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getHeureCelluleVI() {
		return heureCelluleVI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeureCelluleVI(TypeDataTypeDuree newHeureCelluleVI, NotificationChain msgs) {
		TypeDataTypeDuree oldHeureCelluleVI = heureCelluleVI;
		heureCelluleVI = newHeureCelluleVI;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POTENTIEL_AERONEF__HEURE_CELLULE_VI, oldHeureCelluleVI, newHeureCelluleVI);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeureCelluleVI(TypeDataTypeDuree newHeureCelluleVI) {
		if (newHeureCelluleVI != heureCelluleVI) {
			NotificationChain msgs = null;
			if (heureCelluleVI != null)
				msgs = ((InternalEObject)heureCelluleVI).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POTENTIEL_AERONEF__HEURE_CELLULE_VI, null, msgs);
			if (newHeureCelluleVI != null)
				msgs = ((InternalEObject)newHeureCelluleVI).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POTENTIEL_AERONEF__HEURE_CELLULE_VI, null, msgs);
			msgs = basicSetHeureCelluleVI(newHeureCelluleVI, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POTENTIEL_AERONEF__HEURE_CELLULE_VI, newHeureCelluleVI, newHeureCelluleVI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getPotentielHoraireVI() {
		return potentielHoraireVI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPotentielHoraireVI(TypeDataTypeDuree newPotentielHoraireVI, NotificationChain msgs) {
		TypeDataTypeDuree oldPotentielHoraireVI = potentielHoraireVI;
		potentielHoraireVI = newPotentielHoraireVI;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POTENTIEL_AERONEF__POTENTIEL_HORAIRE_VI, oldPotentielHoraireVI, newPotentielHoraireVI);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPotentielHoraireVI(TypeDataTypeDuree newPotentielHoraireVI) {
		if (newPotentielHoraireVI != potentielHoraireVI) {
			NotificationChain msgs = null;
			if (potentielHoraireVI != null)
				msgs = ((InternalEObject)potentielHoraireVI).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POTENTIEL_AERONEF__POTENTIEL_HORAIRE_VI, null, msgs);
			if (newPotentielHoraireVI != null)
				msgs = ((InternalEObject)newPotentielHoraireVI).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POTENTIEL_AERONEF__POTENTIEL_HORAIRE_VI, null, msgs);
			msgs = basicSetPotentielHoraireVI(newPotentielHoraireVI, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POTENTIEL_AERONEF__POTENTIEL_HORAIRE_VI, newPotentielHoraireVI, newPotentielHoraireVI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getPotentielHoraireVP() {
		return potentielHoraireVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPotentielHoraireVP(TypeDataTypeDuree newPotentielHoraireVP, NotificationChain msgs) {
		TypeDataTypeDuree oldPotentielHoraireVP = potentielHoraireVP;
		potentielHoraireVP = newPotentielHoraireVP;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POTENTIEL_AERONEF__POTENTIEL_HORAIRE_VP, oldPotentielHoraireVP, newPotentielHoraireVP);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPotentielHoraireVP(TypeDataTypeDuree newPotentielHoraireVP) {
		if (newPotentielHoraireVP != potentielHoraireVP) {
			NotificationChain msgs = null;
			if (potentielHoraireVP != null)
				msgs = ((InternalEObject)potentielHoraireVP).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POTENTIEL_AERONEF__POTENTIEL_HORAIRE_VP, null, msgs);
			if (newPotentielHoraireVP != null)
				msgs = ((InternalEObject)newPotentielHoraireVP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POTENTIEL_AERONEF__POTENTIEL_HORAIRE_VP, null, msgs);
			msgs = basicSetPotentielHoraireVP(newPotentielHoraireVP, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POTENTIEL_AERONEF__POTENTIEL_HORAIRE_VP, newPotentielHoraireVP, newPotentielHoraireVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComplements() {
		return complements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplements(String newComplements) {
		String oldComplements = complements;
		complements = newComplements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POTENTIEL_AERONEF__COMPLEMENTS, oldComplements, complements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRestrictionEmploi() {
		return restrictionEmploi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestrictionEmploi(String newRestrictionEmploi) {
		String oldRestrictionEmploi = restrictionEmploi;
		restrictionEmploi = newRestrictionEmploi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POTENTIEL_AERONEF__RESTRICTION_EMPLOI, oldRestrictionEmploi, restrictionEmploi));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POTENTIEL_AERONEF__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POTENTIEL_AERONEF__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getConcerneAeronef() {
		return concerneAeronef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcerneAeronef(TypeAssociation newConcerneAeronef, NotificationChain msgs) {
		TypeAssociation oldConcerneAeronef = concerneAeronef;
		concerneAeronef = newConcerneAeronef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POTENTIEL_AERONEF__CONCERNE_AERONEF, oldConcerneAeronef, newConcerneAeronef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcerneAeronef(TypeAssociation newConcerneAeronef) {
		if (newConcerneAeronef != concerneAeronef) {
			NotificationChain msgs = null;
			if (concerneAeronef != null)
				msgs = ((InternalEObject)concerneAeronef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POTENTIEL_AERONEF__CONCERNE_AERONEF, null, msgs);
			if (newConcerneAeronef != null)
				msgs = ((InternalEObject)newConcerneAeronef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POTENTIEL_AERONEF__CONCERNE_AERONEF, null, msgs);
			msgs = basicSetConcerneAeronef(newConcerneAeronef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POTENTIEL_AERONEF__CONCERNE_AERONEF, newConcerneAeronef, newConcerneAeronef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__NOMBRE_LITRES_CARBURANT_RESTANT:
				return basicSetNombreLitresCarburantRestant(null, msgs);
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__POTENTIEL_HORAIRE_RESTANT:
				return basicSetPotentielHoraireRestant(null, msgs);
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__TEMPS_VOL_CONSOMME_AU_COURS_MOUVEMENT:
				return basicSetTempsVolConsommeAuCoursMouvement(null, msgs);
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__HEURE_CELLULE_VI:
				return basicSetHeureCelluleVI(null, msgs);
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__POTENTIEL_HORAIRE_VI:
				return basicSetPotentielHoraireVI(null, msgs);
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__POTENTIEL_HORAIRE_VP:
				return basicSetPotentielHoraireVP(null, msgs);
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__CONCERNE_AERONEF:
				return basicSetConcerneAeronef(null, msgs);
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
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__DISPONIBILITE_AERONAUTIQUE:
				return isDisponibiliteAeronautique() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__DISPONIBILITE_SYSTEME_ARME_MAJEUR:
				return isDisponibiliteSystemeArmeMajeur() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__DISPONIBILITE_SOUS_SYSTEMES:
				return getDisponibiliteSousSystemes();
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__NOMBRE_LITRES_CARBURANT_RESTANT:
				return getNombreLitresCarburantRestant();
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__POTENTIEL_HORAIRE_RESTANT:
				return getPotentielHoraireRestant();
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__TEMPS_VOL_CONSOMME_AU_COURS_MOUVEMENT:
				return getTempsVolConsommeAuCoursMouvement();
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__TYPE_VI:
				return getTypeVI();
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__HEURE_CELLULE_VI:
				return getHeureCelluleVI();
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__POTENTIEL_HORAIRE_VI:
				return getPotentielHoraireVI();
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__POTENTIEL_HORAIRE_VP:
				return getPotentielHoraireVP();
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__COMPLEMENTS:
				return getComplements();
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__RESTRICTION_EMPLOI:
				return getRestrictionEmploi();
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__CTE:
				return getCTE();
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__CE:
				return getCE();
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__CONCERNE_AERONEF:
				return getConcerneAeronef();
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
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__DISPONIBILITE_AERONAUTIQUE:
				setDisponibiliteAeronautique(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__DISPONIBILITE_SYSTEME_ARME_MAJEUR:
				setDisponibiliteSystemeArmeMajeur(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__DISPONIBILITE_SOUS_SYSTEMES:
				setDisponibiliteSousSystemes((String)newValue);
				return;
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__NOMBRE_LITRES_CARBURANT_RESTANT:
				setNombreLitresCarburantRestant((TypeDataTypeVolume)newValue);
				return;
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__POTENTIEL_HORAIRE_RESTANT:
				setPotentielHoraireRestant((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__TEMPS_VOL_CONSOMME_AU_COURS_MOUVEMENT:
				setTempsVolConsommeAuCoursMouvement((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__TYPE_VI:
				setTypeVI((String)newValue);
				return;
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__HEURE_CELLULE_VI:
				setHeureCelluleVI((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__POTENTIEL_HORAIRE_VI:
				setPotentielHoraireVI((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__POTENTIEL_HORAIRE_VP:
				setPotentielHoraireVP((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__COMPLEMENTS:
				setComplements((String)newValue);
				return;
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__RESTRICTION_EMPLOI:
				setRestrictionEmploi((String)newValue);
				return;
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__CONCERNE_AERONEF:
				setConcerneAeronef((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__DISPONIBILITE_AERONAUTIQUE:
				unsetDisponibiliteAeronautique();
				return;
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__DISPONIBILITE_SYSTEME_ARME_MAJEUR:
				unsetDisponibiliteSystemeArmeMajeur();
				return;
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__DISPONIBILITE_SOUS_SYSTEMES:
				setDisponibiliteSousSystemes(DISPONIBILITE_SOUS_SYSTEMES_EDEFAULT);
				return;
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__NOMBRE_LITRES_CARBURANT_RESTANT:
				setNombreLitresCarburantRestant((TypeDataTypeVolume)null);
				return;
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__POTENTIEL_HORAIRE_RESTANT:
				setPotentielHoraireRestant((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__TEMPS_VOL_CONSOMME_AU_COURS_MOUVEMENT:
				setTempsVolConsommeAuCoursMouvement((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__TYPE_VI:
				setTypeVI(TYPE_VI_EDEFAULT);
				return;
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__HEURE_CELLULE_VI:
				setHeureCelluleVI((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__POTENTIEL_HORAIRE_VI:
				setPotentielHoraireVI((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__POTENTIEL_HORAIRE_VP:
				setPotentielHoraireVP((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__COMPLEMENTS:
				setComplements(COMPLEMENTS_EDEFAULT);
				return;
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__RESTRICTION_EMPLOI:
				setRestrictionEmploi(RESTRICTION_EMPLOI_EDEFAULT);
				return;
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__CONCERNE_AERONEF:
				setConcerneAeronef((TypeAssociation)null);
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
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__DISPONIBILITE_AERONAUTIQUE:
				return isSetDisponibiliteAeronautique();
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__DISPONIBILITE_SYSTEME_ARME_MAJEUR:
				return isSetDisponibiliteSystemeArmeMajeur();
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__DISPONIBILITE_SOUS_SYSTEMES:
				return DISPONIBILITE_SOUS_SYSTEMES_EDEFAULT == null ? disponibiliteSousSystemes != null : !DISPONIBILITE_SOUS_SYSTEMES_EDEFAULT.equals(disponibiliteSousSystemes);
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__NOMBRE_LITRES_CARBURANT_RESTANT:
				return nombreLitresCarburantRestant != null;
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__POTENTIEL_HORAIRE_RESTANT:
				return potentielHoraireRestant != null;
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__TEMPS_VOL_CONSOMME_AU_COURS_MOUVEMENT:
				return tempsVolConsommeAuCoursMouvement != null;
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__TYPE_VI:
				return TYPE_VI_EDEFAULT == null ? typeVI != null : !TYPE_VI_EDEFAULT.equals(typeVI);
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__HEURE_CELLULE_VI:
				return heureCelluleVI != null;
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__POTENTIEL_HORAIRE_VI:
				return potentielHoraireVI != null;
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__POTENTIEL_HORAIRE_VP:
				return potentielHoraireVP != null;
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__COMPLEMENTS:
				return COMPLEMENTS_EDEFAULT == null ? complements != null : !COMPLEMENTS_EDEFAULT.equals(complements);
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__RESTRICTION_EMPLOI:
				return RESTRICTION_EMPLOI_EDEFAULT == null ? restrictionEmploi != null : !RESTRICTION_EMPLOI_EDEFAULT.equals(restrictionEmploi);
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_POTENTIEL_AERONEF__CONCERNE_AERONEF:
				return concerneAeronef != null;
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
		result.append(" (disponibiliteAeronautique: ");
		if (disponibiliteAeronautiqueESet) result.append(disponibiliteAeronautique); else result.append("<unset>");
		result.append(", disponibiliteSystemeArmeMajeur: ");
		if (disponibiliteSystemeArmeMajeurESet) result.append(disponibiliteSystemeArmeMajeur); else result.append("<unset>");
		result.append(", disponibiliteSousSystemes: ");
		result.append(disponibiliteSousSystemes);
		result.append(", typeVI: ");
		result.append(typeVI);
		result.append(", complements: ");
		result.append(complements);
		result.append(", restrictionEmploi: ");
		result.append(restrictionEmploi);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypePotentielAeronefImpl
