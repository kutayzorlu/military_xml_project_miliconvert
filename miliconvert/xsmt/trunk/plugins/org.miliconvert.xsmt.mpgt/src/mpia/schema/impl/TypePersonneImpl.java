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
import mpia.schema.TypeCompetenceLinguistique;
import mpia.schema.TypeDeplacementPersonne;
import mpia.schema.TypeDescriptionPersonne;
import mpia.schema.TypeDictionaryDicoEntitePolitiqueTrigramme;
import mpia.schema.TypeDocumentIdentificationPersonne;
import mpia.schema.TypeEmploi;
import mpia.schema.TypeEtatCivil;
import mpia.schema.TypeEtatOperationnelPersonnel;
import mpia.schema.TypeFonctionPersonne;
import mpia.schema.TypePersonne;
import mpia.schema.TypePersonneMilitaire;
import mpia.schema.TypeSpecialitePersonne;
import mpia.schema.TypeSuiviMedical;

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
 * An implementation of the model object '<em><b>Type Personne</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePersonneImpl#getPrenoms <em>Prenoms</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePersonneImpl#getNationalite <em>Nationalite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePersonneImpl#isPreferenceReligieuse <em>Preference Religieuse</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePersonneImpl#getAPourEtatCivilEtatCivil <em>APour Etat Civil Etat Civil</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePersonneImpl#getAPourCaracteristiqueMilitairePersonneMilitaire <em>APour Caracteristique Militaire Personne Militaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePersonneImpl#getAPourTypeAssociationPersonneTypePersonne <em>APour Type Association Personne Type Personne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePersonneImpl#getAPourCompetenceLinguistiqueCompetenceLinguistique <em>APour Competence Linguistique Competence Linguistique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePersonneImpl#getAOccupeFonctionFonctionPersonne <em>AOccupe Fonction Fonction Personne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePersonneImpl#getAExerceEmploisEmploi <em>AExerce Emplois Emploi</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePersonneImpl#getAPourSpecialiteSpecialitePersonne <em>APour Specialite Specialite Personne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePersonneImpl#getEstDecriteParDescriptionPersonne <em>Est Decrite Par Description Personne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePersonneImpl#getEstIdentifieParDocumentIdentificationPersonne <em>Est Identifie Par Document Identification Personne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePersonneImpl#getAPourEtatEtatOperationnelPersonnel <em>APour Etat Etat Operationnel Personnel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePersonneImpl#getAPourSuiviMedicalSuiviMedical <em>APour Suivi Medical Suivi Medical</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePersonneImpl#getSEstDeplaceSelonDeplacementPersonne <em>SEst Deplace Selon Deplacement Personne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePersonneImpl#getEstObjetAssociationPersonnePersonne <em>Est Objet Association Personne Personne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePersonneImpl#getEstSujetAssociationPersonnePersonne <em>Est Sujet Association Personne Personne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePersonneImpl#getEstObjetAssociationEntiteOrgPersonne <em>Est Objet Association Entite Org Personne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePersonneImpl#getEstSujetAssociationPersonneEltCtrl <em>Est Sujet Association Personne Elt Ctrl</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePersonneImpl#getEstSujetAssociationPersonneEltTopo <em>Est Sujet Association Personne Elt Topo</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePersonneImpl#getEstSujetAssociationPersonneMissionAir <em>Est Sujet Association Personne Mission Air</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePersonneImpl#getEstSujetAssociationPersonnePlanifOperation3D <em>Est Sujet Association Personne Planif Operation3 D</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePersonneImpl#getEstAssocieeAActivite <em>Est Associee AActivite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePersonneImpl#getEstSujetAssociationPersonneEvenement <em>Est Sujet Association Personne Evenement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePersonneImpl#getEstObjetAssociationMaterielPersonne <em>Est Objet Association Materiel Personne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePersonneImpl#getEstSujetAssociationPersonneMateriel <em>Est Sujet Association Personne Materiel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePersonneImpl#getEstSujetAssociationPersonneSite <em>Est Sujet Association Personne Site</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePersonneImpl#getEstSujetAssociationPersonneObjetInconnu <em>Est Sujet Association Personne Objet Inconnu</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePersonneImpl extends TypeInstanceObjetImpl implements TypePersonne {
	/**
	 * The default value of the '{@link #getPrenoms() <em>Prenoms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrenoms()
	 * @generated
	 * @ordered
	 */
	protected static final String PRENOMS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrenoms() <em>Prenoms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrenoms()
	 * @generated
	 * @ordered
	 */
	protected String prenoms = PRENOMS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNationalite() <em>Nationalite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNationalite()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEntitePolitiqueTrigramme NATIONALITE_EDEFAULT = TypeDictionaryDicoEntitePolitiqueTrigramme.ATG;

	/**
	 * The cached value of the '{@link #getNationalite() <em>Nationalite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNationalite()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEntitePolitiqueTrigramme nationalite = NATIONALITE_EDEFAULT;

	/**
	 * This is true if the Nationalite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nationaliteESet;

	/**
	 * The default value of the '{@link #isPreferenceReligieuse() <em>Preference Religieuse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPreferenceReligieuse()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PREFERENCE_RELIGIEUSE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPreferenceReligieuse() <em>Preference Religieuse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPreferenceReligieuse()
	 * @generated
	 * @ordered
	 */
	protected boolean preferenceReligieuse = PREFERENCE_RELIGIEUSE_EDEFAULT;

	/**
	 * This is true if the Preference Religieuse attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean preferenceReligieuseESet;

	/**
	 * The cached value of the '{@link #getAPourEtatCivilEtatCivil() <em>APour Etat Civil Etat Civil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourEtatCivilEtatCivil()
	 * @generated
	 * @ordered
	 */
	protected TypeEtatCivil aPourEtatCivilEtatCivil;

	/**
	 * The cached value of the '{@link #getAPourCaracteristiqueMilitairePersonneMilitaire() <em>APour Caracteristique Militaire Personne Militaire</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCaracteristiqueMilitairePersonneMilitaire()
	 * @generated
	 * @ordered
	 */
	protected TypePersonneMilitaire aPourCaracteristiqueMilitairePersonneMilitaire;

	/**
	 * The cached value of the '{@link #getAPourTypeAssociationPersonneTypePersonne() <em>APour Type Association Personne Type Personne</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourTypeAssociationPersonneTypePersonne()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourTypeAssociationPersonneTypePersonne;

	/**
	 * The cached value of the '{@link #getAPourCompetenceLinguistiqueCompetenceLinguistique() <em>APour Competence Linguistique Competence Linguistique</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCompetenceLinguistiqueCompetenceLinguistique()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeCompetenceLinguistique> aPourCompetenceLinguistiqueCompetenceLinguistique;

	/**
	 * The cached value of the '{@link #getAOccupeFonctionFonctionPersonne() <em>AOccupe Fonction Fonction Personne</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAOccupeFonctionFonctionPersonne()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeFonctionPersonne> aOccupeFonctionFonctionPersonne;

	/**
	 * The cached value of the '{@link #getAExerceEmploisEmploi() <em>AExerce Emplois Emploi</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAExerceEmploisEmploi()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeEmploi> aExerceEmploisEmploi;

	/**
	 * The cached value of the '{@link #getAPourSpecialiteSpecialitePersonne() <em>APour Specialite Specialite Personne</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourSpecialiteSpecialitePersonne()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeSpecialitePersonne> aPourSpecialiteSpecialitePersonne;

	/**
	 * The cached value of the '{@link #getEstDecriteParDescriptionPersonne() <em>Est Decrite Par Description Personne</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstDecriteParDescriptionPersonne()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeDescriptionPersonne> estDecriteParDescriptionPersonne;

	/**
	 * The cached value of the '{@link #getEstIdentifieParDocumentIdentificationPersonne() <em>Est Identifie Par Document Identification Personne</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstIdentifieParDocumentIdentificationPersonne()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeDocumentIdentificationPersonne> estIdentifieParDocumentIdentificationPersonne;

	/**
	 * The cached value of the '{@link #getAPourEtatEtatOperationnelPersonnel() <em>APour Etat Etat Operationnel Personnel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourEtatEtatOperationnelPersonnel()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeEtatOperationnelPersonnel> aPourEtatEtatOperationnelPersonnel;

	/**
	 * The cached value of the '{@link #getAPourSuiviMedicalSuiviMedical() <em>APour Suivi Medical Suivi Medical</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourSuiviMedicalSuiviMedical()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeSuiviMedical> aPourSuiviMedicalSuiviMedical;

	/**
	 * The cached value of the '{@link #getSEstDeplaceSelonDeplacementPersonne() <em>SEst Deplace Selon Deplacement Personne</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSEstDeplaceSelonDeplacementPersonne()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeDeplacementPersonne> sEstDeplaceSelonDeplacementPersonne;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationPersonnePersonne() <em>Est Objet Association Personne Personne</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationPersonnePersonne()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationPersonnePersonne;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationPersonnePersonne() <em>Est Sujet Association Personne Personne</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationPersonnePersonne()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationPersonnePersonne;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationEntiteOrgPersonne() <em>Est Objet Association Entite Org Personne</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationEntiteOrgPersonne()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationEntiteOrgPersonne;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationPersonneEltCtrl() <em>Est Sujet Association Personne Elt Ctrl</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationPersonneEltCtrl()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationPersonneEltCtrl;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationPersonneEltTopo() <em>Est Sujet Association Personne Elt Topo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationPersonneEltTopo()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationPersonneEltTopo;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationPersonneMissionAir() <em>Est Sujet Association Personne Mission Air</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationPersonneMissionAir()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationPersonneMissionAir;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationPersonnePlanifOperation3D() <em>Est Sujet Association Personne Planif Operation3 D</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationPersonnePlanifOperation3D()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationPersonnePlanifOperation3D;

	/**
	 * The cached value of the '{@link #getEstAssocieeAActivite() <em>Est Associee AActivite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstAssocieeAActivite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estAssocieeAActivite;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationPersonneEvenement() <em>Est Sujet Association Personne Evenement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationPersonneEvenement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationPersonneEvenement;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationMaterielPersonne() <em>Est Objet Association Materiel Personne</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationMaterielPersonne()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationMaterielPersonne;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationPersonneMateriel() <em>Est Sujet Association Personne Materiel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationPersonneMateriel()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationPersonneMateriel;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationPersonneSite() <em>Est Sujet Association Personne Site</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationPersonneSite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationPersonneSite;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationPersonneObjetInconnu() <em>Est Sujet Association Personne Objet Inconnu</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationPersonneObjetInconnu()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationPersonneObjetInconnu;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypePersonneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePersonne();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrenoms() {
		return prenoms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrenoms(String newPrenoms) {
		String oldPrenoms = prenoms;
		prenoms = newPrenoms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PERSONNE__PRENOMS, oldPrenoms, prenoms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEntitePolitiqueTrigramme getNationalite() {
		return nationalite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNationalite(TypeDictionaryDicoEntitePolitiqueTrigramme newNationalite) {
		TypeDictionaryDicoEntitePolitiqueTrigramme oldNationalite = nationalite;
		nationalite = newNationalite == null ? NATIONALITE_EDEFAULT : newNationalite;
		boolean oldNationaliteESet = nationaliteESet;
		nationaliteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PERSONNE__NATIONALITE, oldNationalite, nationalite, !oldNationaliteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNationalite() {
		TypeDictionaryDicoEntitePolitiqueTrigramme oldNationalite = nationalite;
		boolean oldNationaliteESet = nationaliteESet;
		nationalite = NATIONALITE_EDEFAULT;
		nationaliteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PERSONNE__NATIONALITE, oldNationalite, NATIONALITE_EDEFAULT, oldNationaliteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNationalite() {
		return nationaliteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPreferenceReligieuse() {
		return preferenceReligieuse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreferenceReligieuse(boolean newPreferenceReligieuse) {
		boolean oldPreferenceReligieuse = preferenceReligieuse;
		preferenceReligieuse = newPreferenceReligieuse;
		boolean oldPreferenceReligieuseESet = preferenceReligieuseESet;
		preferenceReligieuseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PERSONNE__PREFERENCE_RELIGIEUSE, oldPreferenceReligieuse, preferenceReligieuse, !oldPreferenceReligieuseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPreferenceReligieuse() {
		boolean oldPreferenceReligieuse = preferenceReligieuse;
		boolean oldPreferenceReligieuseESet = preferenceReligieuseESet;
		preferenceReligieuse = PREFERENCE_RELIGIEUSE_EDEFAULT;
		preferenceReligieuseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PERSONNE__PREFERENCE_RELIGIEUSE, oldPreferenceReligieuse, PREFERENCE_RELIGIEUSE_EDEFAULT, oldPreferenceReligieuseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPreferenceReligieuse() {
		return preferenceReligieuseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeEtatCivil getAPourEtatCivilEtatCivil() {
		return aPourEtatCivilEtatCivil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourEtatCivilEtatCivil(TypeEtatCivil newAPourEtatCivilEtatCivil, NotificationChain msgs) {
		TypeEtatCivil oldAPourEtatCivilEtatCivil = aPourEtatCivilEtatCivil;
		aPourEtatCivilEtatCivil = newAPourEtatCivilEtatCivil;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PERSONNE__APOUR_ETAT_CIVIL_ETAT_CIVIL, oldAPourEtatCivilEtatCivil, newAPourEtatCivilEtatCivil);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourEtatCivilEtatCivil(TypeEtatCivil newAPourEtatCivilEtatCivil) {
		if (newAPourEtatCivilEtatCivil != aPourEtatCivilEtatCivil) {
			NotificationChain msgs = null;
			if (aPourEtatCivilEtatCivil != null)
				msgs = ((InternalEObject)aPourEtatCivilEtatCivil).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PERSONNE__APOUR_ETAT_CIVIL_ETAT_CIVIL, null, msgs);
			if (newAPourEtatCivilEtatCivil != null)
				msgs = ((InternalEObject)newAPourEtatCivilEtatCivil).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PERSONNE__APOUR_ETAT_CIVIL_ETAT_CIVIL, null, msgs);
			msgs = basicSetAPourEtatCivilEtatCivil(newAPourEtatCivilEtatCivil, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PERSONNE__APOUR_ETAT_CIVIL_ETAT_CIVIL, newAPourEtatCivilEtatCivil, newAPourEtatCivilEtatCivil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypePersonneMilitaire getAPourCaracteristiqueMilitairePersonneMilitaire() {
		return aPourCaracteristiqueMilitairePersonneMilitaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourCaracteristiqueMilitairePersonneMilitaire(TypePersonneMilitaire newAPourCaracteristiqueMilitairePersonneMilitaire, NotificationChain msgs) {
		TypePersonneMilitaire oldAPourCaracteristiqueMilitairePersonneMilitaire = aPourCaracteristiqueMilitairePersonneMilitaire;
		aPourCaracteristiqueMilitairePersonneMilitaire = newAPourCaracteristiqueMilitairePersonneMilitaire;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PERSONNE__APOUR_CARACTERISTIQUE_MILITAIRE_PERSONNE_MILITAIRE, oldAPourCaracteristiqueMilitairePersonneMilitaire, newAPourCaracteristiqueMilitairePersonneMilitaire);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourCaracteristiqueMilitairePersonneMilitaire(TypePersonneMilitaire newAPourCaracteristiqueMilitairePersonneMilitaire) {
		if (newAPourCaracteristiqueMilitairePersonneMilitaire != aPourCaracteristiqueMilitairePersonneMilitaire) {
			NotificationChain msgs = null;
			if (aPourCaracteristiqueMilitairePersonneMilitaire != null)
				msgs = ((InternalEObject)aPourCaracteristiqueMilitairePersonneMilitaire).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PERSONNE__APOUR_CARACTERISTIQUE_MILITAIRE_PERSONNE_MILITAIRE, null, msgs);
			if (newAPourCaracteristiqueMilitairePersonneMilitaire != null)
				msgs = ((InternalEObject)newAPourCaracteristiqueMilitairePersonneMilitaire).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PERSONNE__APOUR_CARACTERISTIQUE_MILITAIRE_PERSONNE_MILITAIRE, null, msgs);
			msgs = basicSetAPourCaracteristiqueMilitairePersonneMilitaire(newAPourCaracteristiqueMilitairePersonneMilitaire, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PERSONNE__APOUR_CARACTERISTIQUE_MILITAIRE_PERSONNE_MILITAIRE, newAPourCaracteristiqueMilitairePersonneMilitaire, newAPourCaracteristiqueMilitairePersonneMilitaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourTypeAssociationPersonneTypePersonne() {
		if (aPourTypeAssociationPersonneTypePersonne == null) {
			aPourTypeAssociationPersonneTypePersonne = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_PERSONNE__APOUR_TYPE_ASSOCIATION_PERSONNE_TYPE_PERSONNE);
		}
		return aPourTypeAssociationPersonneTypePersonne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeCompetenceLinguistique> getAPourCompetenceLinguistiqueCompetenceLinguistique() {
		if (aPourCompetenceLinguistiqueCompetenceLinguistique == null) {
			aPourCompetenceLinguistiqueCompetenceLinguistique = new EObjectContainmentEList<TypeCompetenceLinguistique>(TypeCompetenceLinguistique.class, this, SchemaPackage.TYPE_PERSONNE__APOUR_COMPETENCE_LINGUISTIQUE_COMPETENCE_LINGUISTIQUE);
		}
		return aPourCompetenceLinguistiqueCompetenceLinguistique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeFonctionPersonne> getAOccupeFonctionFonctionPersonne() {
		if (aOccupeFonctionFonctionPersonne == null) {
			aOccupeFonctionFonctionPersonne = new EObjectContainmentEList<TypeFonctionPersonne>(TypeFonctionPersonne.class, this, SchemaPackage.TYPE_PERSONNE__AOCCUPE_FONCTION_FONCTION_PERSONNE);
		}
		return aOccupeFonctionFonctionPersonne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEmploi> getAExerceEmploisEmploi() {
		if (aExerceEmploisEmploi == null) {
			aExerceEmploisEmploi = new EObjectContainmentEList<TypeEmploi>(TypeEmploi.class, this, SchemaPackage.TYPE_PERSONNE__AEXERCE_EMPLOIS_EMPLOI);
		}
		return aExerceEmploisEmploi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeSpecialitePersonne> getAPourSpecialiteSpecialitePersonne() {
		if (aPourSpecialiteSpecialitePersonne == null) {
			aPourSpecialiteSpecialitePersonne = new EObjectContainmentEList<TypeSpecialitePersonne>(TypeSpecialitePersonne.class, this, SchemaPackage.TYPE_PERSONNE__APOUR_SPECIALITE_SPECIALITE_PERSONNE);
		}
		return aPourSpecialiteSpecialitePersonne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDescriptionPersonne> getEstDecriteParDescriptionPersonne() {
		if (estDecriteParDescriptionPersonne == null) {
			estDecriteParDescriptionPersonne = new EObjectContainmentEList<TypeDescriptionPersonne>(TypeDescriptionPersonne.class, this, SchemaPackage.TYPE_PERSONNE__EST_DECRITE_PAR_DESCRIPTION_PERSONNE);
		}
		return estDecriteParDescriptionPersonne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDocumentIdentificationPersonne> getEstIdentifieParDocumentIdentificationPersonne() {
		if (estIdentifieParDocumentIdentificationPersonne == null) {
			estIdentifieParDocumentIdentificationPersonne = new EObjectContainmentEList<TypeDocumentIdentificationPersonne>(TypeDocumentIdentificationPersonne.class, this, SchemaPackage.TYPE_PERSONNE__EST_IDENTIFIE_PAR_DOCUMENT_IDENTIFICATION_PERSONNE);
		}
		return estIdentifieParDocumentIdentificationPersonne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEtatOperationnelPersonnel> getAPourEtatEtatOperationnelPersonnel() {
		if (aPourEtatEtatOperationnelPersonnel == null) {
			aPourEtatEtatOperationnelPersonnel = new EObjectContainmentEList<TypeEtatOperationnelPersonnel>(TypeEtatOperationnelPersonnel.class, this, SchemaPackage.TYPE_PERSONNE__APOUR_ETAT_ETAT_OPERATIONNEL_PERSONNEL);
		}
		return aPourEtatEtatOperationnelPersonnel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeSuiviMedical> getAPourSuiviMedicalSuiviMedical() {
		if (aPourSuiviMedicalSuiviMedical == null) {
			aPourSuiviMedicalSuiviMedical = new EObjectContainmentEList<TypeSuiviMedical>(TypeSuiviMedical.class, this, SchemaPackage.TYPE_PERSONNE__APOUR_SUIVI_MEDICAL_SUIVI_MEDICAL);
		}
		return aPourSuiviMedicalSuiviMedical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDeplacementPersonne> getSEstDeplaceSelonDeplacementPersonne() {
		if (sEstDeplaceSelonDeplacementPersonne == null) {
			sEstDeplaceSelonDeplacementPersonne = new EObjectContainmentEList<TypeDeplacementPersonne>(TypeDeplacementPersonne.class, this, SchemaPackage.TYPE_PERSONNE__SEST_DEPLACE_SELON_DEPLACEMENT_PERSONNE);
		}
		return sEstDeplaceSelonDeplacementPersonne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationPersonnePersonne() {
		if (estObjetAssociationPersonnePersonne == null) {
			estObjetAssociationPersonnePersonne = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_PERSONNE__EST_OBJET_ASSOCIATION_PERSONNE_PERSONNE);
		}
		return estObjetAssociationPersonnePersonne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationPersonnePersonne() {
		if (estSujetAssociationPersonnePersonne == null) {
			estSujetAssociationPersonnePersonne = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_PERSONNE);
		}
		return estSujetAssociationPersonnePersonne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationEntiteOrgPersonne() {
		if (estObjetAssociationEntiteOrgPersonne == null) {
			estObjetAssociationEntiteOrgPersonne = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_PERSONNE__EST_OBJET_ASSOCIATION_ENTITE_ORG_PERSONNE);
		}
		return estObjetAssociationEntiteOrgPersonne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationPersonneEltCtrl() {
		if (estSujetAssociationPersonneEltCtrl == null) {
			estSujetAssociationPersonneEltCtrl = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_ELT_CTRL);
		}
		return estSujetAssociationPersonneEltCtrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationPersonneEltTopo() {
		if (estSujetAssociationPersonneEltTopo == null) {
			estSujetAssociationPersonneEltTopo = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_ELT_TOPO);
		}
		return estSujetAssociationPersonneEltTopo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationPersonneMissionAir() {
		if (estSujetAssociationPersonneMissionAir == null) {
			estSujetAssociationPersonneMissionAir = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_MISSION_AIR);
		}
		return estSujetAssociationPersonneMissionAir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationPersonnePlanifOperation3D() {
		if (estSujetAssociationPersonnePlanifOperation3D == null) {
			estSujetAssociationPersonnePlanifOperation3D = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_PLANIF_OPERATION3_D);
		}
		return estSujetAssociationPersonnePlanifOperation3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstAssocieeAActivite() {
		if (estAssocieeAActivite == null) {
			estAssocieeAActivite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_PERSONNE__EST_ASSOCIEE_AACTIVITE);
		}
		return estAssocieeAActivite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationPersonneEvenement() {
		if (estSujetAssociationPersonneEvenement == null) {
			estSujetAssociationPersonneEvenement = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_EVENEMENT);
		}
		return estSujetAssociationPersonneEvenement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationMaterielPersonne() {
		if (estObjetAssociationMaterielPersonne == null) {
			estObjetAssociationMaterielPersonne = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_PERSONNE__EST_OBJET_ASSOCIATION_MATERIEL_PERSONNE);
		}
		return estObjetAssociationMaterielPersonne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationPersonneMateriel() {
		if (estSujetAssociationPersonneMateriel == null) {
			estSujetAssociationPersonneMateriel = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_MATERIEL);
		}
		return estSujetAssociationPersonneMateriel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationPersonneSite() {
		if (estSujetAssociationPersonneSite == null) {
			estSujetAssociationPersonneSite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_SITE);
		}
		return estSujetAssociationPersonneSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationPersonneObjetInconnu() {
		if (estSujetAssociationPersonneObjetInconnu == null) {
			estSujetAssociationPersonneObjetInconnu = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_OBJET_INCONNU);
		}
		return estSujetAssociationPersonneObjetInconnu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_PERSONNE__APOUR_ETAT_CIVIL_ETAT_CIVIL:
				return basicSetAPourEtatCivilEtatCivil(null, msgs);
			case SchemaPackage.TYPE_PERSONNE__APOUR_CARACTERISTIQUE_MILITAIRE_PERSONNE_MILITAIRE:
				return basicSetAPourCaracteristiqueMilitairePersonneMilitaire(null, msgs);
			case SchemaPackage.TYPE_PERSONNE__APOUR_TYPE_ASSOCIATION_PERSONNE_TYPE_PERSONNE:
				return ((InternalEList<?>)getAPourTypeAssociationPersonneTypePersonne()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PERSONNE__APOUR_COMPETENCE_LINGUISTIQUE_COMPETENCE_LINGUISTIQUE:
				return ((InternalEList<?>)getAPourCompetenceLinguistiqueCompetenceLinguistique()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PERSONNE__AOCCUPE_FONCTION_FONCTION_PERSONNE:
				return ((InternalEList<?>)getAOccupeFonctionFonctionPersonne()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PERSONNE__AEXERCE_EMPLOIS_EMPLOI:
				return ((InternalEList<?>)getAExerceEmploisEmploi()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PERSONNE__APOUR_SPECIALITE_SPECIALITE_PERSONNE:
				return ((InternalEList<?>)getAPourSpecialiteSpecialitePersonne()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PERSONNE__EST_DECRITE_PAR_DESCRIPTION_PERSONNE:
				return ((InternalEList<?>)getEstDecriteParDescriptionPersonne()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PERSONNE__EST_IDENTIFIE_PAR_DOCUMENT_IDENTIFICATION_PERSONNE:
				return ((InternalEList<?>)getEstIdentifieParDocumentIdentificationPersonne()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PERSONNE__APOUR_ETAT_ETAT_OPERATIONNEL_PERSONNEL:
				return ((InternalEList<?>)getAPourEtatEtatOperationnelPersonnel()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PERSONNE__APOUR_SUIVI_MEDICAL_SUIVI_MEDICAL:
				return ((InternalEList<?>)getAPourSuiviMedicalSuiviMedical()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PERSONNE__SEST_DEPLACE_SELON_DEPLACEMENT_PERSONNE:
				return ((InternalEList<?>)getSEstDeplaceSelonDeplacementPersonne()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PERSONNE__EST_OBJET_ASSOCIATION_PERSONNE_PERSONNE:
				return ((InternalEList<?>)getEstObjetAssociationPersonnePersonne()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_PERSONNE:
				return ((InternalEList<?>)getEstSujetAssociationPersonnePersonne()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PERSONNE__EST_OBJET_ASSOCIATION_ENTITE_ORG_PERSONNE:
				return ((InternalEList<?>)getEstObjetAssociationEntiteOrgPersonne()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_ELT_CTRL:
				return ((InternalEList<?>)getEstSujetAssociationPersonneEltCtrl()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_ELT_TOPO:
				return ((InternalEList<?>)getEstSujetAssociationPersonneEltTopo()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_MISSION_AIR:
				return ((InternalEList<?>)getEstSujetAssociationPersonneMissionAir()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_PLANIF_OPERATION3_D:
				return ((InternalEList<?>)getEstSujetAssociationPersonnePlanifOperation3D()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PERSONNE__EST_ASSOCIEE_AACTIVITE:
				return ((InternalEList<?>)getEstAssocieeAActivite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_EVENEMENT:
				return ((InternalEList<?>)getEstSujetAssociationPersonneEvenement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PERSONNE__EST_OBJET_ASSOCIATION_MATERIEL_PERSONNE:
				return ((InternalEList<?>)getEstObjetAssociationMaterielPersonne()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_MATERIEL:
				return ((InternalEList<?>)getEstSujetAssociationPersonneMateriel()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_SITE:
				return ((InternalEList<?>)getEstSujetAssociationPersonneSite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_OBJET_INCONNU:
				return ((InternalEList<?>)getEstSujetAssociationPersonneObjetInconnu()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_PERSONNE__PRENOMS:
				return getPrenoms();
			case SchemaPackage.TYPE_PERSONNE__NATIONALITE:
				return getNationalite();
			case SchemaPackage.TYPE_PERSONNE__PREFERENCE_RELIGIEUSE:
				return isPreferenceReligieuse() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_PERSONNE__APOUR_ETAT_CIVIL_ETAT_CIVIL:
				return getAPourEtatCivilEtatCivil();
			case SchemaPackage.TYPE_PERSONNE__APOUR_CARACTERISTIQUE_MILITAIRE_PERSONNE_MILITAIRE:
				return getAPourCaracteristiqueMilitairePersonneMilitaire();
			case SchemaPackage.TYPE_PERSONNE__APOUR_TYPE_ASSOCIATION_PERSONNE_TYPE_PERSONNE:
				return getAPourTypeAssociationPersonneTypePersonne();
			case SchemaPackage.TYPE_PERSONNE__APOUR_COMPETENCE_LINGUISTIQUE_COMPETENCE_LINGUISTIQUE:
				return getAPourCompetenceLinguistiqueCompetenceLinguistique();
			case SchemaPackage.TYPE_PERSONNE__AOCCUPE_FONCTION_FONCTION_PERSONNE:
				return getAOccupeFonctionFonctionPersonne();
			case SchemaPackage.TYPE_PERSONNE__AEXERCE_EMPLOIS_EMPLOI:
				return getAExerceEmploisEmploi();
			case SchemaPackage.TYPE_PERSONNE__APOUR_SPECIALITE_SPECIALITE_PERSONNE:
				return getAPourSpecialiteSpecialitePersonne();
			case SchemaPackage.TYPE_PERSONNE__EST_DECRITE_PAR_DESCRIPTION_PERSONNE:
				return getEstDecriteParDescriptionPersonne();
			case SchemaPackage.TYPE_PERSONNE__EST_IDENTIFIE_PAR_DOCUMENT_IDENTIFICATION_PERSONNE:
				return getEstIdentifieParDocumentIdentificationPersonne();
			case SchemaPackage.TYPE_PERSONNE__APOUR_ETAT_ETAT_OPERATIONNEL_PERSONNEL:
				return getAPourEtatEtatOperationnelPersonnel();
			case SchemaPackage.TYPE_PERSONNE__APOUR_SUIVI_MEDICAL_SUIVI_MEDICAL:
				return getAPourSuiviMedicalSuiviMedical();
			case SchemaPackage.TYPE_PERSONNE__SEST_DEPLACE_SELON_DEPLACEMENT_PERSONNE:
				return getSEstDeplaceSelonDeplacementPersonne();
			case SchemaPackage.TYPE_PERSONNE__EST_OBJET_ASSOCIATION_PERSONNE_PERSONNE:
				return getEstObjetAssociationPersonnePersonne();
			case SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_PERSONNE:
				return getEstSujetAssociationPersonnePersonne();
			case SchemaPackage.TYPE_PERSONNE__EST_OBJET_ASSOCIATION_ENTITE_ORG_PERSONNE:
				return getEstObjetAssociationEntiteOrgPersonne();
			case SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_ELT_CTRL:
				return getEstSujetAssociationPersonneEltCtrl();
			case SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_ELT_TOPO:
				return getEstSujetAssociationPersonneEltTopo();
			case SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_MISSION_AIR:
				return getEstSujetAssociationPersonneMissionAir();
			case SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_PLANIF_OPERATION3_D:
				return getEstSujetAssociationPersonnePlanifOperation3D();
			case SchemaPackage.TYPE_PERSONNE__EST_ASSOCIEE_AACTIVITE:
				return getEstAssocieeAActivite();
			case SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_EVENEMENT:
				return getEstSujetAssociationPersonneEvenement();
			case SchemaPackage.TYPE_PERSONNE__EST_OBJET_ASSOCIATION_MATERIEL_PERSONNE:
				return getEstObjetAssociationMaterielPersonne();
			case SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_MATERIEL:
				return getEstSujetAssociationPersonneMateriel();
			case SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_SITE:
				return getEstSujetAssociationPersonneSite();
			case SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_OBJET_INCONNU:
				return getEstSujetAssociationPersonneObjetInconnu();
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
			case SchemaPackage.TYPE_PERSONNE__PRENOMS:
				setPrenoms((String)newValue);
				return;
			case SchemaPackage.TYPE_PERSONNE__NATIONALITE:
				setNationalite((TypeDictionaryDicoEntitePolitiqueTrigramme)newValue);
				return;
			case SchemaPackage.TYPE_PERSONNE__PREFERENCE_RELIGIEUSE:
				setPreferenceReligieuse(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_PERSONNE__APOUR_ETAT_CIVIL_ETAT_CIVIL:
				setAPourEtatCivilEtatCivil((TypeEtatCivil)newValue);
				return;
			case SchemaPackage.TYPE_PERSONNE__APOUR_CARACTERISTIQUE_MILITAIRE_PERSONNE_MILITAIRE:
				setAPourCaracteristiqueMilitairePersonneMilitaire((TypePersonneMilitaire)newValue);
				return;
			case SchemaPackage.TYPE_PERSONNE__APOUR_TYPE_ASSOCIATION_PERSONNE_TYPE_PERSONNE:
				getAPourTypeAssociationPersonneTypePersonne().clear();
				getAPourTypeAssociationPersonneTypePersonne().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_PERSONNE__APOUR_COMPETENCE_LINGUISTIQUE_COMPETENCE_LINGUISTIQUE:
				getAPourCompetenceLinguistiqueCompetenceLinguistique().clear();
				getAPourCompetenceLinguistiqueCompetenceLinguistique().addAll((Collection<? extends TypeCompetenceLinguistique>)newValue);
				return;
			case SchemaPackage.TYPE_PERSONNE__AOCCUPE_FONCTION_FONCTION_PERSONNE:
				getAOccupeFonctionFonctionPersonne().clear();
				getAOccupeFonctionFonctionPersonne().addAll((Collection<? extends TypeFonctionPersonne>)newValue);
				return;
			case SchemaPackage.TYPE_PERSONNE__AEXERCE_EMPLOIS_EMPLOI:
				getAExerceEmploisEmploi().clear();
				getAExerceEmploisEmploi().addAll((Collection<? extends TypeEmploi>)newValue);
				return;
			case SchemaPackage.TYPE_PERSONNE__APOUR_SPECIALITE_SPECIALITE_PERSONNE:
				getAPourSpecialiteSpecialitePersonne().clear();
				getAPourSpecialiteSpecialitePersonne().addAll((Collection<? extends TypeSpecialitePersonne>)newValue);
				return;
			case SchemaPackage.TYPE_PERSONNE__EST_DECRITE_PAR_DESCRIPTION_PERSONNE:
				getEstDecriteParDescriptionPersonne().clear();
				getEstDecriteParDescriptionPersonne().addAll((Collection<? extends TypeDescriptionPersonne>)newValue);
				return;
			case SchemaPackage.TYPE_PERSONNE__EST_IDENTIFIE_PAR_DOCUMENT_IDENTIFICATION_PERSONNE:
				getEstIdentifieParDocumentIdentificationPersonne().clear();
				getEstIdentifieParDocumentIdentificationPersonne().addAll((Collection<? extends TypeDocumentIdentificationPersonne>)newValue);
				return;
			case SchemaPackage.TYPE_PERSONNE__APOUR_ETAT_ETAT_OPERATIONNEL_PERSONNEL:
				getAPourEtatEtatOperationnelPersonnel().clear();
				getAPourEtatEtatOperationnelPersonnel().addAll((Collection<? extends TypeEtatOperationnelPersonnel>)newValue);
				return;
			case SchemaPackage.TYPE_PERSONNE__APOUR_SUIVI_MEDICAL_SUIVI_MEDICAL:
				getAPourSuiviMedicalSuiviMedical().clear();
				getAPourSuiviMedicalSuiviMedical().addAll((Collection<? extends TypeSuiviMedical>)newValue);
				return;
			case SchemaPackage.TYPE_PERSONNE__SEST_DEPLACE_SELON_DEPLACEMENT_PERSONNE:
				getSEstDeplaceSelonDeplacementPersonne().clear();
				getSEstDeplaceSelonDeplacementPersonne().addAll((Collection<? extends TypeDeplacementPersonne>)newValue);
				return;
			case SchemaPackage.TYPE_PERSONNE__EST_OBJET_ASSOCIATION_PERSONNE_PERSONNE:
				getEstObjetAssociationPersonnePersonne().clear();
				getEstObjetAssociationPersonnePersonne().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_PERSONNE:
				getEstSujetAssociationPersonnePersonne().clear();
				getEstSujetAssociationPersonnePersonne().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_PERSONNE__EST_OBJET_ASSOCIATION_ENTITE_ORG_PERSONNE:
				getEstObjetAssociationEntiteOrgPersonne().clear();
				getEstObjetAssociationEntiteOrgPersonne().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_ELT_CTRL:
				getEstSujetAssociationPersonneEltCtrl().clear();
				getEstSujetAssociationPersonneEltCtrl().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_ELT_TOPO:
				getEstSujetAssociationPersonneEltTopo().clear();
				getEstSujetAssociationPersonneEltTopo().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_MISSION_AIR:
				getEstSujetAssociationPersonneMissionAir().clear();
				getEstSujetAssociationPersonneMissionAir().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_PLANIF_OPERATION3_D:
				getEstSujetAssociationPersonnePlanifOperation3D().clear();
				getEstSujetAssociationPersonnePlanifOperation3D().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_PERSONNE__EST_ASSOCIEE_AACTIVITE:
				getEstAssocieeAActivite().clear();
				getEstAssocieeAActivite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_EVENEMENT:
				getEstSujetAssociationPersonneEvenement().clear();
				getEstSujetAssociationPersonneEvenement().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_PERSONNE__EST_OBJET_ASSOCIATION_MATERIEL_PERSONNE:
				getEstObjetAssociationMaterielPersonne().clear();
				getEstObjetAssociationMaterielPersonne().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_MATERIEL:
				getEstSujetAssociationPersonneMateriel().clear();
				getEstSujetAssociationPersonneMateriel().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_SITE:
				getEstSujetAssociationPersonneSite().clear();
				getEstSujetAssociationPersonneSite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_OBJET_INCONNU:
				getEstSujetAssociationPersonneObjetInconnu().clear();
				getEstSujetAssociationPersonneObjetInconnu().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_PERSONNE__PRENOMS:
				setPrenoms(PRENOMS_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PERSONNE__NATIONALITE:
				unsetNationalite();
				return;
			case SchemaPackage.TYPE_PERSONNE__PREFERENCE_RELIGIEUSE:
				unsetPreferenceReligieuse();
				return;
			case SchemaPackage.TYPE_PERSONNE__APOUR_ETAT_CIVIL_ETAT_CIVIL:
				setAPourEtatCivilEtatCivil((TypeEtatCivil)null);
				return;
			case SchemaPackage.TYPE_PERSONNE__APOUR_CARACTERISTIQUE_MILITAIRE_PERSONNE_MILITAIRE:
				setAPourCaracteristiqueMilitairePersonneMilitaire((TypePersonneMilitaire)null);
				return;
			case SchemaPackage.TYPE_PERSONNE__APOUR_TYPE_ASSOCIATION_PERSONNE_TYPE_PERSONNE:
				getAPourTypeAssociationPersonneTypePersonne().clear();
				return;
			case SchemaPackage.TYPE_PERSONNE__APOUR_COMPETENCE_LINGUISTIQUE_COMPETENCE_LINGUISTIQUE:
				getAPourCompetenceLinguistiqueCompetenceLinguistique().clear();
				return;
			case SchemaPackage.TYPE_PERSONNE__AOCCUPE_FONCTION_FONCTION_PERSONNE:
				getAOccupeFonctionFonctionPersonne().clear();
				return;
			case SchemaPackage.TYPE_PERSONNE__AEXERCE_EMPLOIS_EMPLOI:
				getAExerceEmploisEmploi().clear();
				return;
			case SchemaPackage.TYPE_PERSONNE__APOUR_SPECIALITE_SPECIALITE_PERSONNE:
				getAPourSpecialiteSpecialitePersonne().clear();
				return;
			case SchemaPackage.TYPE_PERSONNE__EST_DECRITE_PAR_DESCRIPTION_PERSONNE:
				getEstDecriteParDescriptionPersonne().clear();
				return;
			case SchemaPackage.TYPE_PERSONNE__EST_IDENTIFIE_PAR_DOCUMENT_IDENTIFICATION_PERSONNE:
				getEstIdentifieParDocumentIdentificationPersonne().clear();
				return;
			case SchemaPackage.TYPE_PERSONNE__APOUR_ETAT_ETAT_OPERATIONNEL_PERSONNEL:
				getAPourEtatEtatOperationnelPersonnel().clear();
				return;
			case SchemaPackage.TYPE_PERSONNE__APOUR_SUIVI_MEDICAL_SUIVI_MEDICAL:
				getAPourSuiviMedicalSuiviMedical().clear();
				return;
			case SchemaPackage.TYPE_PERSONNE__SEST_DEPLACE_SELON_DEPLACEMENT_PERSONNE:
				getSEstDeplaceSelonDeplacementPersonne().clear();
				return;
			case SchemaPackage.TYPE_PERSONNE__EST_OBJET_ASSOCIATION_PERSONNE_PERSONNE:
				getEstObjetAssociationPersonnePersonne().clear();
				return;
			case SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_PERSONNE:
				getEstSujetAssociationPersonnePersonne().clear();
				return;
			case SchemaPackage.TYPE_PERSONNE__EST_OBJET_ASSOCIATION_ENTITE_ORG_PERSONNE:
				getEstObjetAssociationEntiteOrgPersonne().clear();
				return;
			case SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_ELT_CTRL:
				getEstSujetAssociationPersonneEltCtrl().clear();
				return;
			case SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_ELT_TOPO:
				getEstSujetAssociationPersonneEltTopo().clear();
				return;
			case SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_MISSION_AIR:
				getEstSujetAssociationPersonneMissionAir().clear();
				return;
			case SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_PLANIF_OPERATION3_D:
				getEstSujetAssociationPersonnePlanifOperation3D().clear();
				return;
			case SchemaPackage.TYPE_PERSONNE__EST_ASSOCIEE_AACTIVITE:
				getEstAssocieeAActivite().clear();
				return;
			case SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_EVENEMENT:
				getEstSujetAssociationPersonneEvenement().clear();
				return;
			case SchemaPackage.TYPE_PERSONNE__EST_OBJET_ASSOCIATION_MATERIEL_PERSONNE:
				getEstObjetAssociationMaterielPersonne().clear();
				return;
			case SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_MATERIEL:
				getEstSujetAssociationPersonneMateriel().clear();
				return;
			case SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_SITE:
				getEstSujetAssociationPersonneSite().clear();
				return;
			case SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_OBJET_INCONNU:
				getEstSujetAssociationPersonneObjetInconnu().clear();
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
			case SchemaPackage.TYPE_PERSONNE__PRENOMS:
				return PRENOMS_EDEFAULT == null ? prenoms != null : !PRENOMS_EDEFAULT.equals(prenoms);
			case SchemaPackage.TYPE_PERSONNE__NATIONALITE:
				return isSetNationalite();
			case SchemaPackage.TYPE_PERSONNE__PREFERENCE_RELIGIEUSE:
				return isSetPreferenceReligieuse();
			case SchemaPackage.TYPE_PERSONNE__APOUR_ETAT_CIVIL_ETAT_CIVIL:
				return aPourEtatCivilEtatCivil != null;
			case SchemaPackage.TYPE_PERSONNE__APOUR_CARACTERISTIQUE_MILITAIRE_PERSONNE_MILITAIRE:
				return aPourCaracteristiqueMilitairePersonneMilitaire != null;
			case SchemaPackage.TYPE_PERSONNE__APOUR_TYPE_ASSOCIATION_PERSONNE_TYPE_PERSONNE:
				return aPourTypeAssociationPersonneTypePersonne != null && !aPourTypeAssociationPersonneTypePersonne.isEmpty();
			case SchemaPackage.TYPE_PERSONNE__APOUR_COMPETENCE_LINGUISTIQUE_COMPETENCE_LINGUISTIQUE:
				return aPourCompetenceLinguistiqueCompetenceLinguistique != null && !aPourCompetenceLinguistiqueCompetenceLinguistique.isEmpty();
			case SchemaPackage.TYPE_PERSONNE__AOCCUPE_FONCTION_FONCTION_PERSONNE:
				return aOccupeFonctionFonctionPersonne != null && !aOccupeFonctionFonctionPersonne.isEmpty();
			case SchemaPackage.TYPE_PERSONNE__AEXERCE_EMPLOIS_EMPLOI:
				return aExerceEmploisEmploi != null && !aExerceEmploisEmploi.isEmpty();
			case SchemaPackage.TYPE_PERSONNE__APOUR_SPECIALITE_SPECIALITE_PERSONNE:
				return aPourSpecialiteSpecialitePersonne != null && !aPourSpecialiteSpecialitePersonne.isEmpty();
			case SchemaPackage.TYPE_PERSONNE__EST_DECRITE_PAR_DESCRIPTION_PERSONNE:
				return estDecriteParDescriptionPersonne != null && !estDecriteParDescriptionPersonne.isEmpty();
			case SchemaPackage.TYPE_PERSONNE__EST_IDENTIFIE_PAR_DOCUMENT_IDENTIFICATION_PERSONNE:
				return estIdentifieParDocumentIdentificationPersonne != null && !estIdentifieParDocumentIdentificationPersonne.isEmpty();
			case SchemaPackage.TYPE_PERSONNE__APOUR_ETAT_ETAT_OPERATIONNEL_PERSONNEL:
				return aPourEtatEtatOperationnelPersonnel != null && !aPourEtatEtatOperationnelPersonnel.isEmpty();
			case SchemaPackage.TYPE_PERSONNE__APOUR_SUIVI_MEDICAL_SUIVI_MEDICAL:
				return aPourSuiviMedicalSuiviMedical != null && !aPourSuiviMedicalSuiviMedical.isEmpty();
			case SchemaPackage.TYPE_PERSONNE__SEST_DEPLACE_SELON_DEPLACEMENT_PERSONNE:
				return sEstDeplaceSelonDeplacementPersonne != null && !sEstDeplaceSelonDeplacementPersonne.isEmpty();
			case SchemaPackage.TYPE_PERSONNE__EST_OBJET_ASSOCIATION_PERSONNE_PERSONNE:
				return estObjetAssociationPersonnePersonne != null && !estObjetAssociationPersonnePersonne.isEmpty();
			case SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_PERSONNE:
				return estSujetAssociationPersonnePersonne != null && !estSujetAssociationPersonnePersonne.isEmpty();
			case SchemaPackage.TYPE_PERSONNE__EST_OBJET_ASSOCIATION_ENTITE_ORG_PERSONNE:
				return estObjetAssociationEntiteOrgPersonne != null && !estObjetAssociationEntiteOrgPersonne.isEmpty();
			case SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_ELT_CTRL:
				return estSujetAssociationPersonneEltCtrl != null && !estSujetAssociationPersonneEltCtrl.isEmpty();
			case SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_ELT_TOPO:
				return estSujetAssociationPersonneEltTopo != null && !estSujetAssociationPersonneEltTopo.isEmpty();
			case SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_MISSION_AIR:
				return estSujetAssociationPersonneMissionAir != null && !estSujetAssociationPersonneMissionAir.isEmpty();
			case SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_PLANIF_OPERATION3_D:
				return estSujetAssociationPersonnePlanifOperation3D != null && !estSujetAssociationPersonnePlanifOperation3D.isEmpty();
			case SchemaPackage.TYPE_PERSONNE__EST_ASSOCIEE_AACTIVITE:
				return estAssocieeAActivite != null && !estAssocieeAActivite.isEmpty();
			case SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_EVENEMENT:
				return estSujetAssociationPersonneEvenement != null && !estSujetAssociationPersonneEvenement.isEmpty();
			case SchemaPackage.TYPE_PERSONNE__EST_OBJET_ASSOCIATION_MATERIEL_PERSONNE:
				return estObjetAssociationMaterielPersonne != null && !estObjetAssociationMaterielPersonne.isEmpty();
			case SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_MATERIEL:
				return estSujetAssociationPersonneMateriel != null && !estSujetAssociationPersonneMateriel.isEmpty();
			case SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_SITE:
				return estSujetAssociationPersonneSite != null && !estSujetAssociationPersonneSite.isEmpty();
			case SchemaPackage.TYPE_PERSONNE__EST_SUJET_ASSOCIATION_PERSONNE_OBJET_INCONNU:
				return estSujetAssociationPersonneObjetInconnu != null && !estSujetAssociationPersonneObjetInconnu.isEmpty();
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
		result.append(" (prenoms: ");
		result.append(prenoms);
		result.append(", nationalite: ");
		if (nationaliteESet) result.append(nationalite); else result.append("<unset>");
		result.append(", preferenceReligieuse: ");
		if (preferenceReligieuseESet) result.append(preferenceReligieuse); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypePersonneImpl
