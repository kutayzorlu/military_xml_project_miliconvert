/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoNiveau;
import mpia.schema.TypeDictionaryDicoTypeUniteCategorie;
import mpia.schema.TypeDictionaryDicoTypeUniteCategorieArme;
import mpia.schema.TypeDictionaryDicoTypeUniteMobiliteGenerale;
import mpia.schema.TypeDictionaryDicoTypeUniteQualificatifArme;
import mpia.schema.TypeDictionaryDicoTypeUniteSecondeSpecialisationArme;
import mpia.schema.TypeDictionaryDicoTypeUniteSpecialisationArme;
import mpia.schema.TypeTypeUnite;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Type Unite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeTypeUniteImpl#isGenerique <em>Generique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeUniteImpl#getNiveau <em>Niveau</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeUniteImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeUniteImpl#getCategorieArme <em>Categorie Arme</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeUniteImpl#getSpecialisationArme <em>Specialisation Arme</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeUniteImpl#getSecondeSpecialisationArme <em>Seconde Specialisation Arme</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeUniteImpl#getMobiliteGenerale <em>Mobilite Generale</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeUniteImpl#getQualificatifArme <em>Qualificatif Arme</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeUniteImpl#getAPourMaterielPrincipalTypeMateriel <em>APour Materiel Principal Type Materiel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeUniteImpl#getSupporteTypeOrganisationGouvernementale <em>Supporte Type Organisation Gouvernementale</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeTypeUniteImpl extends TypeTypeOrganisationGouvernementaleImpl implements TypeTypeUnite {
	/**
	 * The default value of the '{@link #isGenerique() <em>Generique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGenerique() <em>Generique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerique()
	 * @generated
	 * @ordered
	 */
	protected boolean generique = GENERIQUE_EDEFAULT;

	/**
	 * This is true if the Generique attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean generiqueESet;

	/**
	 * The default value of the '{@link #getNiveau() <em>Niveau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveau()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoNiveau NIVEAU_EDEFAULT = TypeDictionaryDicoNiveau.AG;

	/**
	 * The cached value of the '{@link #getNiveau() <em>Niveau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveau()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoNiveau niveau = NIVEAU_EDEFAULT;

	/**
	 * This is true if the Niveau attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean niveauESet;

	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeUniteCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoTypeUniteCategorie.COMBAT;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeUniteCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getCategorieArme() <em>Categorie Arme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorieArme()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeUniteCategorieArme CATEGORIE_ARME_EDEFAULT = TypeDictionaryDicoTypeUniteCategorieArme.ADMIN;

	/**
	 * The cached value of the '{@link #getCategorieArme() <em>Categorie Arme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorieArme()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeUniteCategorieArme categorieArme = CATEGORIE_ARME_EDEFAULT;

	/**
	 * This is true if the Categorie Arme attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieArmeESet;

	/**
	 * The default value of the '{@link #getSpecialisationArme() <em>Specialisation Arme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialisationArme()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeUniteSpecialisationArme SPECIALISATION_ARME_EDEFAULT = TypeDictionaryDicoTypeUniteSpecialisationArme.ENCNST;

	/**
	 * The cached value of the '{@link #getSpecialisationArme() <em>Specialisation Arme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialisationArme()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeUniteSpecialisationArme specialisationArme = SPECIALISATION_ARME_EDEFAULT;

	/**
	 * This is true if the Specialisation Arme attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean specialisationArmeESet;

	/**
	 * The default value of the '{@link #getSecondeSpecialisationArme() <em>Seconde Specialisation Arme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondeSpecialisationArme()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeUniteSecondeSpecialisationArme SECONDE_SPECIALISATION_ARME_EDEFAULT = TypeDictionaryDicoTypeUniteSecondeSpecialisationArme.ARASLT;

	/**
	 * The cached value of the '{@link #getSecondeSpecialisationArme() <em>Seconde Specialisation Arme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondeSpecialisationArme()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeUniteSecondeSpecialisationArme secondeSpecialisationArme = SECONDE_SPECIALISATION_ARME_EDEFAULT;

	/**
	 * This is true if the Seconde Specialisation Arme attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean secondeSpecialisationArmeESet;

	/**
	 * The default value of the '{@link #getMobiliteGenerale() <em>Mobilite Generale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMobiliteGenerale()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeUniteMobiliteGenerale MOBILITE_GENERALE_EDEFAULT = TypeDictionaryDicoTypeUniteMobiliteGenerale.AIR;

	/**
	 * The cached value of the '{@link #getMobiliteGenerale() <em>Mobilite Generale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMobiliteGenerale()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeUniteMobiliteGenerale mobiliteGenerale = MOBILITE_GENERALE_EDEFAULT;

	/**
	 * This is true if the Mobilite Generale attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mobiliteGeneraleESet;

	/**
	 * The default value of the '{@link #getQualificatifArme() <em>Qualificatif Arme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificatifArme()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeUniteQualificatifArme QUALIFICATIF_ARME_EDEFAULT = TypeDictionaryDicoTypeUniteQualificatifArme.CORPS;

	/**
	 * The cached value of the '{@link #getQualificatifArme() <em>Qualificatif Arme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificatifArme()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeUniteQualificatifArme qualificatifArme = QUALIFICATIF_ARME_EDEFAULT;

	/**
	 * This is true if the Qualificatif Arme attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean qualificatifArmeESet;

	/**
	 * The cached value of the '{@link #getAPourMaterielPrincipalTypeMateriel() <em>APour Materiel Principal Type Materiel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourMaterielPrincipalTypeMateriel()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourMaterielPrincipalTypeMateriel;

	/**
	 * The cached value of the '{@link #getSupporteTypeOrganisationGouvernementale() <em>Supporte Type Organisation Gouvernementale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupporteTypeOrganisationGouvernementale()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation supporteTypeOrganisationGouvernementale;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeTypeUniteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeTypeUnite();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGenerique() {
		return generique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerique(boolean newGenerique) {
		boolean oldGenerique = generique;
		generique = newGenerique;
		boolean oldGeneriqueESet = generiqueESet;
		generiqueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_UNITE__GENERIQUE, oldGenerique, generique, !oldGeneriqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGenerique() {
		boolean oldGenerique = generique;
		boolean oldGeneriqueESet = generiqueESet;
		generique = GENERIQUE_EDEFAULT;
		generiqueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_UNITE__GENERIQUE, oldGenerique, GENERIQUE_EDEFAULT, oldGeneriqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGenerique() {
		return generiqueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoNiveau getNiveau() {
		return niveau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNiveau(TypeDictionaryDicoNiveau newNiveau) {
		TypeDictionaryDicoNiveau oldNiveau = niveau;
		niveau = newNiveau == null ? NIVEAU_EDEFAULT : newNiveau;
		boolean oldNiveauESet = niveauESet;
		niveauESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_UNITE__NIVEAU, oldNiveau, niveau, !oldNiveauESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNiveau() {
		TypeDictionaryDicoNiveau oldNiveau = niveau;
		boolean oldNiveauESet = niveauESet;
		niveau = NIVEAU_EDEFAULT;
		niveauESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_UNITE__NIVEAU, oldNiveau, NIVEAU_EDEFAULT, oldNiveauESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNiveau() {
		return niveauESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeUniteCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoTypeUniteCategorie newCategorie) {
		TypeDictionaryDicoTypeUniteCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_UNITE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoTypeUniteCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_UNITE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeDictionaryDicoTypeUniteCategorieArme getCategorieArme() {
		return categorieArme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorieArme(TypeDictionaryDicoTypeUniteCategorieArme newCategorieArme) {
		TypeDictionaryDicoTypeUniteCategorieArme oldCategorieArme = categorieArme;
		categorieArme = newCategorieArme == null ? CATEGORIE_ARME_EDEFAULT : newCategorieArme;
		boolean oldCategorieArmeESet = categorieArmeESet;
		categorieArmeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_UNITE__CATEGORIE_ARME, oldCategorieArme, categorieArme, !oldCategorieArmeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorieArme() {
		TypeDictionaryDicoTypeUniteCategorieArme oldCategorieArme = categorieArme;
		boolean oldCategorieArmeESet = categorieArmeESet;
		categorieArme = CATEGORIE_ARME_EDEFAULT;
		categorieArmeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_UNITE__CATEGORIE_ARME, oldCategorieArme, CATEGORIE_ARME_EDEFAULT, oldCategorieArmeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCategorieArme() {
		return categorieArmeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeUniteSpecialisationArme getSpecialisationArme() {
		return specialisationArme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecialisationArme(TypeDictionaryDicoTypeUniteSpecialisationArme newSpecialisationArme) {
		TypeDictionaryDicoTypeUniteSpecialisationArme oldSpecialisationArme = specialisationArme;
		specialisationArme = newSpecialisationArme == null ? SPECIALISATION_ARME_EDEFAULT : newSpecialisationArme;
		boolean oldSpecialisationArmeESet = specialisationArmeESet;
		specialisationArmeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_UNITE__SPECIALISATION_ARME, oldSpecialisationArme, specialisationArme, !oldSpecialisationArmeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpecialisationArme() {
		TypeDictionaryDicoTypeUniteSpecialisationArme oldSpecialisationArme = specialisationArme;
		boolean oldSpecialisationArmeESet = specialisationArmeESet;
		specialisationArme = SPECIALISATION_ARME_EDEFAULT;
		specialisationArmeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_UNITE__SPECIALISATION_ARME, oldSpecialisationArme, SPECIALISATION_ARME_EDEFAULT, oldSpecialisationArmeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpecialisationArme() {
		return specialisationArmeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeUniteSecondeSpecialisationArme getSecondeSpecialisationArme() {
		return secondeSpecialisationArme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondeSpecialisationArme(TypeDictionaryDicoTypeUniteSecondeSpecialisationArme newSecondeSpecialisationArme) {
		TypeDictionaryDicoTypeUniteSecondeSpecialisationArme oldSecondeSpecialisationArme = secondeSpecialisationArme;
		secondeSpecialisationArme = newSecondeSpecialisationArme == null ? SECONDE_SPECIALISATION_ARME_EDEFAULT : newSecondeSpecialisationArme;
		boolean oldSecondeSpecialisationArmeESet = secondeSpecialisationArmeESet;
		secondeSpecialisationArmeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_UNITE__SECONDE_SPECIALISATION_ARME, oldSecondeSpecialisationArme, secondeSpecialisationArme, !oldSecondeSpecialisationArmeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSecondeSpecialisationArme() {
		TypeDictionaryDicoTypeUniteSecondeSpecialisationArme oldSecondeSpecialisationArme = secondeSpecialisationArme;
		boolean oldSecondeSpecialisationArmeESet = secondeSpecialisationArmeESet;
		secondeSpecialisationArme = SECONDE_SPECIALISATION_ARME_EDEFAULT;
		secondeSpecialisationArmeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_UNITE__SECONDE_SPECIALISATION_ARME, oldSecondeSpecialisationArme, SECONDE_SPECIALISATION_ARME_EDEFAULT, oldSecondeSpecialisationArmeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSecondeSpecialisationArme() {
		return secondeSpecialisationArmeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeUniteMobiliteGenerale getMobiliteGenerale() {
		return mobiliteGenerale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMobiliteGenerale(TypeDictionaryDicoTypeUniteMobiliteGenerale newMobiliteGenerale) {
		TypeDictionaryDicoTypeUniteMobiliteGenerale oldMobiliteGenerale = mobiliteGenerale;
		mobiliteGenerale = newMobiliteGenerale == null ? MOBILITE_GENERALE_EDEFAULT : newMobiliteGenerale;
		boolean oldMobiliteGeneraleESet = mobiliteGeneraleESet;
		mobiliteGeneraleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_UNITE__MOBILITE_GENERALE, oldMobiliteGenerale, mobiliteGenerale, !oldMobiliteGeneraleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMobiliteGenerale() {
		TypeDictionaryDicoTypeUniteMobiliteGenerale oldMobiliteGenerale = mobiliteGenerale;
		boolean oldMobiliteGeneraleESet = mobiliteGeneraleESet;
		mobiliteGenerale = MOBILITE_GENERALE_EDEFAULT;
		mobiliteGeneraleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_UNITE__MOBILITE_GENERALE, oldMobiliteGenerale, MOBILITE_GENERALE_EDEFAULT, oldMobiliteGeneraleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMobiliteGenerale() {
		return mobiliteGeneraleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeUniteQualificatifArme getQualificatifArme() {
		return qualificatifArme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualificatifArme(TypeDictionaryDicoTypeUniteQualificatifArme newQualificatifArme) {
		TypeDictionaryDicoTypeUniteQualificatifArme oldQualificatifArme = qualificatifArme;
		qualificatifArme = newQualificatifArme == null ? QUALIFICATIF_ARME_EDEFAULT : newQualificatifArme;
		boolean oldQualificatifArmeESet = qualificatifArmeESet;
		qualificatifArmeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_UNITE__QUALIFICATIF_ARME, oldQualificatifArme, qualificatifArme, !oldQualificatifArmeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQualificatifArme() {
		TypeDictionaryDicoTypeUniteQualificatifArme oldQualificatifArme = qualificatifArme;
		boolean oldQualificatifArmeESet = qualificatifArmeESet;
		qualificatifArme = QUALIFICATIF_ARME_EDEFAULT;
		qualificatifArmeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_UNITE__QUALIFICATIF_ARME, oldQualificatifArme, QUALIFICATIF_ARME_EDEFAULT, oldQualificatifArmeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQualificatifArme() {
		return qualificatifArmeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourMaterielPrincipalTypeMateriel() {
		return aPourMaterielPrincipalTypeMateriel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourMaterielPrincipalTypeMateriel(TypeAssociation newAPourMaterielPrincipalTypeMateriel, NotificationChain msgs) {
		TypeAssociation oldAPourMaterielPrincipalTypeMateriel = aPourMaterielPrincipalTypeMateriel;
		aPourMaterielPrincipalTypeMateriel = newAPourMaterielPrincipalTypeMateriel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_UNITE__APOUR_MATERIEL_PRINCIPAL_TYPE_MATERIEL, oldAPourMaterielPrincipalTypeMateriel, newAPourMaterielPrincipalTypeMateriel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourMaterielPrincipalTypeMateriel(TypeAssociation newAPourMaterielPrincipalTypeMateriel) {
		if (newAPourMaterielPrincipalTypeMateriel != aPourMaterielPrincipalTypeMateriel) {
			NotificationChain msgs = null;
			if (aPourMaterielPrincipalTypeMateriel != null)
				msgs = ((InternalEObject)aPourMaterielPrincipalTypeMateriel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_UNITE__APOUR_MATERIEL_PRINCIPAL_TYPE_MATERIEL, null, msgs);
			if (newAPourMaterielPrincipalTypeMateriel != null)
				msgs = ((InternalEObject)newAPourMaterielPrincipalTypeMateriel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_UNITE__APOUR_MATERIEL_PRINCIPAL_TYPE_MATERIEL, null, msgs);
			msgs = basicSetAPourMaterielPrincipalTypeMateriel(newAPourMaterielPrincipalTypeMateriel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_UNITE__APOUR_MATERIEL_PRINCIPAL_TYPE_MATERIEL, newAPourMaterielPrincipalTypeMateriel, newAPourMaterielPrincipalTypeMateriel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getSupporteTypeOrganisationGouvernementale() {
		return supporteTypeOrganisationGouvernementale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupporteTypeOrganisationGouvernementale(TypeAssociation newSupporteTypeOrganisationGouvernementale, NotificationChain msgs) {
		TypeAssociation oldSupporteTypeOrganisationGouvernementale = supporteTypeOrganisationGouvernementale;
		supporteTypeOrganisationGouvernementale = newSupporteTypeOrganisationGouvernementale;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_UNITE__SUPPORTE_TYPE_ORGANISATION_GOUVERNEMENTALE, oldSupporteTypeOrganisationGouvernementale, newSupporteTypeOrganisationGouvernementale);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupporteTypeOrganisationGouvernementale(TypeAssociation newSupporteTypeOrganisationGouvernementale) {
		if (newSupporteTypeOrganisationGouvernementale != supporteTypeOrganisationGouvernementale) {
			NotificationChain msgs = null;
			if (supporteTypeOrganisationGouvernementale != null)
				msgs = ((InternalEObject)supporteTypeOrganisationGouvernementale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_UNITE__SUPPORTE_TYPE_ORGANISATION_GOUVERNEMENTALE, null, msgs);
			if (newSupporteTypeOrganisationGouvernementale != null)
				msgs = ((InternalEObject)newSupporteTypeOrganisationGouvernementale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_UNITE__SUPPORTE_TYPE_ORGANISATION_GOUVERNEMENTALE, null, msgs);
			msgs = basicSetSupporteTypeOrganisationGouvernementale(newSupporteTypeOrganisationGouvernementale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_UNITE__SUPPORTE_TYPE_ORGANISATION_GOUVERNEMENTALE, newSupporteTypeOrganisationGouvernementale, newSupporteTypeOrganisationGouvernementale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_TYPE_UNITE__APOUR_MATERIEL_PRINCIPAL_TYPE_MATERIEL:
				return basicSetAPourMaterielPrincipalTypeMateriel(null, msgs);
			case SchemaPackage.TYPE_TYPE_UNITE__SUPPORTE_TYPE_ORGANISATION_GOUVERNEMENTALE:
				return basicSetSupporteTypeOrganisationGouvernementale(null, msgs);
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
			case SchemaPackage.TYPE_TYPE_UNITE__GENERIQUE:
				return isGenerique() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_TYPE_UNITE__NIVEAU:
				return getNiveau();
			case SchemaPackage.TYPE_TYPE_UNITE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_TYPE_UNITE__CATEGORIE_ARME:
				return getCategorieArme();
			case SchemaPackage.TYPE_TYPE_UNITE__SPECIALISATION_ARME:
				return getSpecialisationArme();
			case SchemaPackage.TYPE_TYPE_UNITE__SECONDE_SPECIALISATION_ARME:
				return getSecondeSpecialisationArme();
			case SchemaPackage.TYPE_TYPE_UNITE__MOBILITE_GENERALE:
				return getMobiliteGenerale();
			case SchemaPackage.TYPE_TYPE_UNITE__QUALIFICATIF_ARME:
				return getQualificatifArme();
			case SchemaPackage.TYPE_TYPE_UNITE__APOUR_MATERIEL_PRINCIPAL_TYPE_MATERIEL:
				return getAPourMaterielPrincipalTypeMateriel();
			case SchemaPackage.TYPE_TYPE_UNITE__SUPPORTE_TYPE_ORGANISATION_GOUVERNEMENTALE:
				return getSupporteTypeOrganisationGouvernementale();
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
			case SchemaPackage.TYPE_TYPE_UNITE__GENERIQUE:
				setGenerique(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_TYPE_UNITE__NIVEAU:
				setNiveau((TypeDictionaryDicoNiveau)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_UNITE__CATEGORIE:
				setCategorie((TypeDictionaryDicoTypeUniteCategorie)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_UNITE__CATEGORIE_ARME:
				setCategorieArme((TypeDictionaryDicoTypeUniteCategorieArme)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_UNITE__SPECIALISATION_ARME:
				setSpecialisationArme((TypeDictionaryDicoTypeUniteSpecialisationArme)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_UNITE__SECONDE_SPECIALISATION_ARME:
				setSecondeSpecialisationArme((TypeDictionaryDicoTypeUniteSecondeSpecialisationArme)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_UNITE__MOBILITE_GENERALE:
				setMobiliteGenerale((TypeDictionaryDicoTypeUniteMobiliteGenerale)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_UNITE__QUALIFICATIF_ARME:
				setQualificatifArme((TypeDictionaryDicoTypeUniteQualificatifArme)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_UNITE__APOUR_MATERIEL_PRINCIPAL_TYPE_MATERIEL:
				setAPourMaterielPrincipalTypeMateriel((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_UNITE__SUPPORTE_TYPE_ORGANISATION_GOUVERNEMENTALE:
				setSupporteTypeOrganisationGouvernementale((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_TYPE_UNITE__GENERIQUE:
				unsetGenerique();
				return;
			case SchemaPackage.TYPE_TYPE_UNITE__NIVEAU:
				unsetNiveau();
				return;
			case SchemaPackage.TYPE_TYPE_UNITE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_TYPE_UNITE__CATEGORIE_ARME:
				unsetCategorieArme();
				return;
			case SchemaPackage.TYPE_TYPE_UNITE__SPECIALISATION_ARME:
				unsetSpecialisationArme();
				return;
			case SchemaPackage.TYPE_TYPE_UNITE__SECONDE_SPECIALISATION_ARME:
				unsetSecondeSpecialisationArme();
				return;
			case SchemaPackage.TYPE_TYPE_UNITE__MOBILITE_GENERALE:
				unsetMobiliteGenerale();
				return;
			case SchemaPackage.TYPE_TYPE_UNITE__QUALIFICATIF_ARME:
				unsetQualificatifArme();
				return;
			case SchemaPackage.TYPE_TYPE_UNITE__APOUR_MATERIEL_PRINCIPAL_TYPE_MATERIEL:
				setAPourMaterielPrincipalTypeMateriel((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_TYPE_UNITE__SUPPORTE_TYPE_ORGANISATION_GOUVERNEMENTALE:
				setSupporteTypeOrganisationGouvernementale((TypeAssociation)null);
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
			case SchemaPackage.TYPE_TYPE_UNITE__GENERIQUE:
				return isSetGenerique();
			case SchemaPackage.TYPE_TYPE_UNITE__NIVEAU:
				return isSetNiveau();
			case SchemaPackage.TYPE_TYPE_UNITE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_TYPE_UNITE__CATEGORIE_ARME:
				return isSetCategorieArme();
			case SchemaPackage.TYPE_TYPE_UNITE__SPECIALISATION_ARME:
				return isSetSpecialisationArme();
			case SchemaPackage.TYPE_TYPE_UNITE__SECONDE_SPECIALISATION_ARME:
				return isSetSecondeSpecialisationArme();
			case SchemaPackage.TYPE_TYPE_UNITE__MOBILITE_GENERALE:
				return isSetMobiliteGenerale();
			case SchemaPackage.TYPE_TYPE_UNITE__QUALIFICATIF_ARME:
				return isSetQualificatifArme();
			case SchemaPackage.TYPE_TYPE_UNITE__APOUR_MATERIEL_PRINCIPAL_TYPE_MATERIEL:
				return aPourMaterielPrincipalTypeMateriel != null;
			case SchemaPackage.TYPE_TYPE_UNITE__SUPPORTE_TYPE_ORGANISATION_GOUVERNEMENTALE:
				return supporteTypeOrganisationGouvernementale != null;
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
		result.append(" (generique: ");
		if (generiqueESet) result.append(generique); else result.append("<unset>");
		result.append(", niveau: ");
		if (niveauESet) result.append(niveau); else result.append("<unset>");
		result.append(", categorie: ");
		if (categorieESet) result.append(categorie); else result.append("<unset>");
		result.append(", categorieArme: ");
		if (categorieArmeESet) result.append(categorieArme); else result.append("<unset>");
		result.append(", specialisationArme: ");
		if (specialisationArmeESet) result.append(specialisationArme); else result.append("<unset>");
		result.append(", secondeSpecialisationArme: ");
		if (secondeSpecialisationArmeESet) result.append(secondeSpecialisationArme); else result.append("<unset>");
		result.append(", mobiliteGenerale: ");
		if (mobiliteGeneraleESet) result.append(mobiliteGenerale); else result.append("<unset>");
		result.append(", qualificatifArme: ");
		if (qualificatifArmeESet) result.append(qualificatifArme); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeTypeUniteImpl
