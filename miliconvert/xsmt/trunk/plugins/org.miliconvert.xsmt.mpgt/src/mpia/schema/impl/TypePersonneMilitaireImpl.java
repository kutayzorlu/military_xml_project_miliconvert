/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoArmee;
import mpia.schema.TypeDictionaryDicoPersonneMilitaireSituationMilitaire;
import mpia.schema.TypePersonneMilitaire;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Personne Militaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePersonneMilitaireImpl#getDecorations <em>Decorations</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePersonneMilitaireImpl#getSituationMilitaire <em>Situation Militaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePersonneMilitaireImpl#getFonction <em>Fonction</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePersonneMilitaireImpl#getArme <em>Arme</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePersonneMilitaireImpl#getArmee <em>Armee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePersonneMilitaireImpl#getNumeroMatricule <em>Numero Matricule</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePersonneMilitaireImpl#getEstRapporteeParRapport <em>Est Rapportee Par Rapport</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePersonneMilitaireImpl extends EObjectImpl implements TypePersonneMilitaire {
	/**
	 * The default value of the '{@link #getDecorations() <em>Decorations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecorations()
	 * @generated
	 * @ordered
	 */
	protected static final String DECORATIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDecorations() <em>Decorations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecorations()
	 * @generated
	 * @ordered
	 */
	protected String decorations = DECORATIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSituationMilitaire() <em>Situation Militaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSituationMilitaire()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPersonneMilitaireSituationMilitaire SITUATION_MILITAIRE_EDEFAULT = TypeDictionaryDicoPersonneMilitaireSituationMilitaire.CARREE;

	/**
	 * The cached value of the '{@link #getSituationMilitaire() <em>Situation Militaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSituationMilitaire()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPersonneMilitaireSituationMilitaire situationMilitaire = SITUATION_MILITAIRE_EDEFAULT;

	/**
	 * This is true if the Situation Militaire attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean situationMilitaireESet;

	/**
	 * The default value of the '{@link #getFonction() <em>Fonction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFonction()
	 * @generated
	 * @ordered
	 */
	protected static final String FONCTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFonction() <em>Fonction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFonction()
	 * @generated
	 * @ordered
	 */
	protected String fonction = FONCTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getArme() <em>Arme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArme()
	 * @generated
	 * @ordered
	 */
	protected static final String ARME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArme() <em>Arme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArme()
	 * @generated
	 * @ordered
	 */
	protected String arme = ARME_EDEFAULT;

	/**
	 * The default value of the '{@link #getArmee() <em>Armee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArmee()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoArmee ARMEE_EDEFAULT = TypeDictionaryDicoArmee.AIRFRC;

	/**
	 * The cached value of the '{@link #getArmee() <em>Armee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArmee()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoArmee armee = ARMEE_EDEFAULT;

	/**
	 * This is true if the Armee attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean armeeESet;

	/**
	 * The default value of the '{@link #getNumeroMatricule() <em>Numero Matricule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroMatricule()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMERO_MATRICULE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumeroMatricule() <em>Numero Matricule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroMatricule()
	 * @generated
	 * @ordered
	 */
	protected String numeroMatricule = NUMERO_MATRICULE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEstRapporteeParRapport() <em>Est Rapportee Par Rapport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstRapporteeParRapport()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation estRapporteeParRapport;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypePersonneMilitaireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePersonneMilitaire();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDecorations() {
		return decorations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecorations(String newDecorations) {
		String oldDecorations = decorations;
		decorations = newDecorations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PERSONNE_MILITAIRE__DECORATIONS, oldDecorations, decorations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPersonneMilitaireSituationMilitaire getSituationMilitaire() {
		return situationMilitaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSituationMilitaire(TypeDictionaryDicoPersonneMilitaireSituationMilitaire newSituationMilitaire) {
		TypeDictionaryDicoPersonneMilitaireSituationMilitaire oldSituationMilitaire = situationMilitaire;
		situationMilitaire = newSituationMilitaire == null ? SITUATION_MILITAIRE_EDEFAULT : newSituationMilitaire;
		boolean oldSituationMilitaireESet = situationMilitaireESet;
		situationMilitaireESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PERSONNE_MILITAIRE__SITUATION_MILITAIRE, oldSituationMilitaire, situationMilitaire, !oldSituationMilitaireESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSituationMilitaire() {
		TypeDictionaryDicoPersonneMilitaireSituationMilitaire oldSituationMilitaire = situationMilitaire;
		boolean oldSituationMilitaireESet = situationMilitaireESet;
		situationMilitaire = SITUATION_MILITAIRE_EDEFAULT;
		situationMilitaireESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PERSONNE_MILITAIRE__SITUATION_MILITAIRE, oldSituationMilitaire, SITUATION_MILITAIRE_EDEFAULT, oldSituationMilitaireESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSituationMilitaire() {
		return situationMilitaireESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFonction() {
		return fonction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFonction(String newFonction) {
		String oldFonction = fonction;
		fonction = newFonction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PERSONNE_MILITAIRE__FONCTION, oldFonction, fonction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArme() {
		return arme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArme(String newArme) {
		String oldArme = arme;
		arme = newArme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PERSONNE_MILITAIRE__ARME, oldArme, arme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoArmee getArmee() {
		return armee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArmee(TypeDictionaryDicoArmee newArmee) {
		TypeDictionaryDicoArmee oldArmee = armee;
		armee = newArmee == null ? ARMEE_EDEFAULT : newArmee;
		boolean oldArmeeESet = armeeESet;
		armeeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PERSONNE_MILITAIRE__ARMEE, oldArmee, armee, !oldArmeeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetArmee() {
		TypeDictionaryDicoArmee oldArmee = armee;
		boolean oldArmeeESet = armeeESet;
		armee = ARMEE_EDEFAULT;
		armeeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PERSONNE_MILITAIRE__ARMEE, oldArmee, ARMEE_EDEFAULT, oldArmeeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetArmee() {
		return armeeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumeroMatricule() {
		return numeroMatricule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroMatricule(String newNumeroMatricule) {
		String oldNumeroMatricule = numeroMatricule;
		numeroMatricule = newNumeroMatricule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PERSONNE_MILITAIRE__NUMERO_MATRICULE, oldNumeroMatricule, numeroMatricule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getEstRapporteeParRapport() {
		return estRapporteeParRapport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstRapporteeParRapport(TypeAssociation newEstRapporteeParRapport, NotificationChain msgs) {
		TypeAssociation oldEstRapporteeParRapport = estRapporteeParRapport;
		estRapporteeParRapport = newEstRapporteeParRapport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PERSONNE_MILITAIRE__EST_RAPPORTEE_PAR_RAPPORT, oldEstRapporteeParRapport, newEstRapporteeParRapport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstRapporteeParRapport(TypeAssociation newEstRapporteeParRapport) {
		if (newEstRapporteeParRapport != estRapporteeParRapport) {
			NotificationChain msgs = null;
			if (estRapporteeParRapport != null)
				msgs = ((InternalEObject)estRapporteeParRapport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PERSONNE_MILITAIRE__EST_RAPPORTEE_PAR_RAPPORT, null, msgs);
			if (newEstRapporteeParRapport != null)
				msgs = ((InternalEObject)newEstRapporteeParRapport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PERSONNE_MILITAIRE__EST_RAPPORTEE_PAR_RAPPORT, null, msgs);
			msgs = basicSetEstRapporteeParRapport(newEstRapporteeParRapport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PERSONNE_MILITAIRE__EST_RAPPORTEE_PAR_RAPPORT, newEstRapporteeParRapport, newEstRapporteeParRapport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_PERSONNE_MILITAIRE__EST_RAPPORTEE_PAR_RAPPORT:
				return basicSetEstRapporteeParRapport(null, msgs);
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
			case SchemaPackage.TYPE_PERSONNE_MILITAIRE__DECORATIONS:
				return getDecorations();
			case SchemaPackage.TYPE_PERSONNE_MILITAIRE__SITUATION_MILITAIRE:
				return getSituationMilitaire();
			case SchemaPackage.TYPE_PERSONNE_MILITAIRE__FONCTION:
				return getFonction();
			case SchemaPackage.TYPE_PERSONNE_MILITAIRE__ARME:
				return getArme();
			case SchemaPackage.TYPE_PERSONNE_MILITAIRE__ARMEE:
				return getArmee();
			case SchemaPackage.TYPE_PERSONNE_MILITAIRE__NUMERO_MATRICULE:
				return getNumeroMatricule();
			case SchemaPackage.TYPE_PERSONNE_MILITAIRE__EST_RAPPORTEE_PAR_RAPPORT:
				return getEstRapporteeParRapport();
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
			case SchemaPackage.TYPE_PERSONNE_MILITAIRE__DECORATIONS:
				setDecorations((String)newValue);
				return;
			case SchemaPackage.TYPE_PERSONNE_MILITAIRE__SITUATION_MILITAIRE:
				setSituationMilitaire((TypeDictionaryDicoPersonneMilitaireSituationMilitaire)newValue);
				return;
			case SchemaPackage.TYPE_PERSONNE_MILITAIRE__FONCTION:
				setFonction((String)newValue);
				return;
			case SchemaPackage.TYPE_PERSONNE_MILITAIRE__ARME:
				setArme((String)newValue);
				return;
			case SchemaPackage.TYPE_PERSONNE_MILITAIRE__ARMEE:
				setArmee((TypeDictionaryDicoArmee)newValue);
				return;
			case SchemaPackage.TYPE_PERSONNE_MILITAIRE__NUMERO_MATRICULE:
				setNumeroMatricule((String)newValue);
				return;
			case SchemaPackage.TYPE_PERSONNE_MILITAIRE__EST_RAPPORTEE_PAR_RAPPORT:
				setEstRapporteeParRapport((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_PERSONNE_MILITAIRE__DECORATIONS:
				setDecorations(DECORATIONS_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PERSONNE_MILITAIRE__SITUATION_MILITAIRE:
				unsetSituationMilitaire();
				return;
			case SchemaPackage.TYPE_PERSONNE_MILITAIRE__FONCTION:
				setFonction(FONCTION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PERSONNE_MILITAIRE__ARME:
				setArme(ARME_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PERSONNE_MILITAIRE__ARMEE:
				unsetArmee();
				return;
			case SchemaPackage.TYPE_PERSONNE_MILITAIRE__NUMERO_MATRICULE:
				setNumeroMatricule(NUMERO_MATRICULE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PERSONNE_MILITAIRE__EST_RAPPORTEE_PAR_RAPPORT:
				setEstRapporteeParRapport((TypeAssociation)null);
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
			case SchemaPackage.TYPE_PERSONNE_MILITAIRE__DECORATIONS:
				return DECORATIONS_EDEFAULT == null ? decorations != null : !DECORATIONS_EDEFAULT.equals(decorations);
			case SchemaPackage.TYPE_PERSONNE_MILITAIRE__SITUATION_MILITAIRE:
				return isSetSituationMilitaire();
			case SchemaPackage.TYPE_PERSONNE_MILITAIRE__FONCTION:
				return FONCTION_EDEFAULT == null ? fonction != null : !FONCTION_EDEFAULT.equals(fonction);
			case SchemaPackage.TYPE_PERSONNE_MILITAIRE__ARME:
				return ARME_EDEFAULT == null ? arme != null : !ARME_EDEFAULT.equals(arme);
			case SchemaPackage.TYPE_PERSONNE_MILITAIRE__ARMEE:
				return isSetArmee();
			case SchemaPackage.TYPE_PERSONNE_MILITAIRE__NUMERO_MATRICULE:
				return NUMERO_MATRICULE_EDEFAULT == null ? numeroMatricule != null : !NUMERO_MATRICULE_EDEFAULT.equals(numeroMatricule);
			case SchemaPackage.TYPE_PERSONNE_MILITAIRE__EST_RAPPORTEE_PAR_RAPPORT:
				return estRapporteeParRapport != null;
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
		result.append(" (decorations: ");
		result.append(decorations);
		result.append(", situationMilitaire: ");
		if (situationMilitaireESet) result.append(situationMilitaire); else result.append("<unset>");
		result.append(", fonction: ");
		result.append(fonction);
		result.append(", arme: ");
		result.append(arme);
		result.append(", armee: ");
		if (armeeESet) result.append(armee); else result.append("<unset>");
		result.append(", numeroMatricule: ");
		result.append(numeroMatricule);
		result.append(')');
		return result.toString();
	}

} //TypePersonneMilitaireImpl
