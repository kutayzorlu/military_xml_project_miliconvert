/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAdressePhysique;
import mpia.schema.TypeDictionaryDicoAdressePhysiqueCategorie;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Adresse Physique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAdressePhysiqueImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAdressePhysiqueImpl#getNomResidence <em>Nom Residence</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAdressePhysiqueImpl#getBoiteAuxLettres <em>Boite Aux Lettres</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAdressePhysiqueImpl#getNumero <em>Numero</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAdressePhysiqueImpl#getNomRue <em>Nom Rue</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAdressePhysiqueImpl#getBoitePostale <em>Boite Postale</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAdressePhysiqueImpl#getCodePostal <em>Code Postal</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAdressePhysiqueImpl#getVille <em>Ville</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAdressePhysiqueImpl#getRegionGeographique <em>Region Geographique</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAdressePhysiqueImpl extends TypeAdresseImpl implements TypeAdressePhysique {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAdressePhysiqueCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAdressePhysiqueCategorie.MLADDR;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAdressePhysiqueCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getNomResidence() <em>Nom Residence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomResidence()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_RESIDENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomResidence() <em>Nom Residence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomResidence()
	 * @generated
	 * @ordered
	 */
	protected String nomResidence = NOM_RESIDENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBoiteAuxLettres() <em>Boite Aux Lettres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoiteAuxLettres()
	 * @generated
	 * @ordered
	 */
	protected static final String BOITE_AUX_LETTRES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBoiteAuxLettres() <em>Boite Aux Lettres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoiteAuxLettres()
	 * @generated
	 * @ordered
	 */
	protected String boiteAuxLettres = BOITE_AUX_LETTRES_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumero() <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumero()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMERO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumero() <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumero()
	 * @generated
	 * @ordered
	 */
	protected String numero = NUMERO_EDEFAULT;

	/**
	 * The default value of the '{@link #getNomRue() <em>Nom Rue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomRue()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_RUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomRue() <em>Nom Rue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomRue()
	 * @generated
	 * @ordered
	 */
	protected String nomRue = NOM_RUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBoitePostale() <em>Boite Postale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoitePostale()
	 * @generated
	 * @ordered
	 */
	protected static final String BOITE_POSTALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBoitePostale() <em>Boite Postale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoitePostale()
	 * @generated
	 * @ordered
	 */
	protected String boitePostale = BOITE_POSTALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodePostal() <em>Code Postal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodePostal()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_POSTAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodePostal() <em>Code Postal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodePostal()
	 * @generated
	 * @ordered
	 */
	protected String codePostal = CODE_POSTAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getVille() <em>Ville</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVille()
	 * @generated
	 * @ordered
	 */
	protected static final String VILLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVille() <em>Ville</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVille()
	 * @generated
	 * @ordered
	 */
	protected String ville = VILLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegionGeographique() <em>Region Geographique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionGeographique()
	 * @generated
	 * @ordered
	 */
	protected static final String REGION_GEOGRAPHIQUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegionGeographique() <em>Region Geographique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionGeographique()
	 * @generated
	 * @ordered
	 */
	protected String regionGeographique = REGION_GEOGRAPHIQUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAdressePhysiqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAdressePhysique();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAdressePhysiqueCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAdressePhysiqueCategorie newCategorie) {
		TypeDictionaryDicoAdressePhysiqueCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ADRESSE_PHYSIQUE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAdressePhysiqueCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ADRESSE_PHYSIQUE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public String getNomResidence() {
		return nomResidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomResidence(String newNomResidence) {
		String oldNomResidence = nomResidence;
		nomResidence = newNomResidence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ADRESSE_PHYSIQUE__NOM_RESIDENCE, oldNomResidence, nomResidence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBoiteAuxLettres() {
		return boiteAuxLettres;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoiteAuxLettres(String newBoiteAuxLettres) {
		String oldBoiteAuxLettres = boiteAuxLettres;
		boiteAuxLettres = newBoiteAuxLettres;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ADRESSE_PHYSIQUE__BOITE_AUX_LETTRES, oldBoiteAuxLettres, boiteAuxLettres));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumero(String newNumero) {
		String oldNumero = numero;
		numero = newNumero;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ADRESSE_PHYSIQUE__NUMERO, oldNumero, numero));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomRue() {
		return nomRue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomRue(String newNomRue) {
		String oldNomRue = nomRue;
		nomRue = newNomRue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ADRESSE_PHYSIQUE__NOM_RUE, oldNomRue, nomRue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBoitePostale() {
		return boitePostale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoitePostale(String newBoitePostale) {
		String oldBoitePostale = boitePostale;
		boitePostale = newBoitePostale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ADRESSE_PHYSIQUE__BOITE_POSTALE, oldBoitePostale, boitePostale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodePostal() {
		return codePostal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodePostal(String newCodePostal) {
		String oldCodePostal = codePostal;
		codePostal = newCodePostal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ADRESSE_PHYSIQUE__CODE_POSTAL, oldCodePostal, codePostal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVille(String newVille) {
		String oldVille = ville;
		ville = newVille;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ADRESSE_PHYSIQUE__VILLE, oldVille, ville));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegionGeographique() {
		return regionGeographique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegionGeographique(String newRegionGeographique) {
		String oldRegionGeographique = regionGeographique;
		regionGeographique = newRegionGeographique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ADRESSE_PHYSIQUE__REGION_GEOGRAPHIQUE, oldRegionGeographique, regionGeographique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_ADRESSE_PHYSIQUE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ADRESSE_PHYSIQUE__NOM_RESIDENCE:
				return getNomResidence();
			case SchemaPackage.TYPE_ADRESSE_PHYSIQUE__BOITE_AUX_LETTRES:
				return getBoiteAuxLettres();
			case SchemaPackage.TYPE_ADRESSE_PHYSIQUE__NUMERO:
				return getNumero();
			case SchemaPackage.TYPE_ADRESSE_PHYSIQUE__NOM_RUE:
				return getNomRue();
			case SchemaPackage.TYPE_ADRESSE_PHYSIQUE__BOITE_POSTALE:
				return getBoitePostale();
			case SchemaPackage.TYPE_ADRESSE_PHYSIQUE__CODE_POSTAL:
				return getCodePostal();
			case SchemaPackage.TYPE_ADRESSE_PHYSIQUE__VILLE:
				return getVille();
			case SchemaPackage.TYPE_ADRESSE_PHYSIQUE__REGION_GEOGRAPHIQUE:
				return getRegionGeographique();
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
			case SchemaPackage.TYPE_ADRESSE_PHYSIQUE__CATEGORIE:
				setCategorie((TypeDictionaryDicoAdressePhysiqueCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ADRESSE_PHYSIQUE__NOM_RESIDENCE:
				setNomResidence((String)newValue);
				return;
			case SchemaPackage.TYPE_ADRESSE_PHYSIQUE__BOITE_AUX_LETTRES:
				setBoiteAuxLettres((String)newValue);
				return;
			case SchemaPackage.TYPE_ADRESSE_PHYSIQUE__NUMERO:
				setNumero((String)newValue);
				return;
			case SchemaPackage.TYPE_ADRESSE_PHYSIQUE__NOM_RUE:
				setNomRue((String)newValue);
				return;
			case SchemaPackage.TYPE_ADRESSE_PHYSIQUE__BOITE_POSTALE:
				setBoitePostale((String)newValue);
				return;
			case SchemaPackage.TYPE_ADRESSE_PHYSIQUE__CODE_POSTAL:
				setCodePostal((String)newValue);
				return;
			case SchemaPackage.TYPE_ADRESSE_PHYSIQUE__VILLE:
				setVille((String)newValue);
				return;
			case SchemaPackage.TYPE_ADRESSE_PHYSIQUE__REGION_GEOGRAPHIQUE:
				setRegionGeographique((String)newValue);
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
			case SchemaPackage.TYPE_ADRESSE_PHYSIQUE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ADRESSE_PHYSIQUE__NOM_RESIDENCE:
				setNomResidence(NOM_RESIDENCE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ADRESSE_PHYSIQUE__BOITE_AUX_LETTRES:
				setBoiteAuxLettres(BOITE_AUX_LETTRES_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ADRESSE_PHYSIQUE__NUMERO:
				setNumero(NUMERO_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ADRESSE_PHYSIQUE__NOM_RUE:
				setNomRue(NOM_RUE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ADRESSE_PHYSIQUE__BOITE_POSTALE:
				setBoitePostale(BOITE_POSTALE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ADRESSE_PHYSIQUE__CODE_POSTAL:
				setCodePostal(CODE_POSTAL_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ADRESSE_PHYSIQUE__VILLE:
				setVille(VILLE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ADRESSE_PHYSIQUE__REGION_GEOGRAPHIQUE:
				setRegionGeographique(REGION_GEOGRAPHIQUE_EDEFAULT);
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
			case SchemaPackage.TYPE_ADRESSE_PHYSIQUE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ADRESSE_PHYSIQUE__NOM_RESIDENCE:
				return NOM_RESIDENCE_EDEFAULT == null ? nomResidence != null : !NOM_RESIDENCE_EDEFAULT.equals(nomResidence);
			case SchemaPackage.TYPE_ADRESSE_PHYSIQUE__BOITE_AUX_LETTRES:
				return BOITE_AUX_LETTRES_EDEFAULT == null ? boiteAuxLettres != null : !BOITE_AUX_LETTRES_EDEFAULT.equals(boiteAuxLettres);
			case SchemaPackage.TYPE_ADRESSE_PHYSIQUE__NUMERO:
				return NUMERO_EDEFAULT == null ? numero != null : !NUMERO_EDEFAULT.equals(numero);
			case SchemaPackage.TYPE_ADRESSE_PHYSIQUE__NOM_RUE:
				return NOM_RUE_EDEFAULT == null ? nomRue != null : !NOM_RUE_EDEFAULT.equals(nomRue);
			case SchemaPackage.TYPE_ADRESSE_PHYSIQUE__BOITE_POSTALE:
				return BOITE_POSTALE_EDEFAULT == null ? boitePostale != null : !BOITE_POSTALE_EDEFAULT.equals(boitePostale);
			case SchemaPackage.TYPE_ADRESSE_PHYSIQUE__CODE_POSTAL:
				return CODE_POSTAL_EDEFAULT == null ? codePostal != null : !CODE_POSTAL_EDEFAULT.equals(codePostal);
			case SchemaPackage.TYPE_ADRESSE_PHYSIQUE__VILLE:
				return VILLE_EDEFAULT == null ? ville != null : !VILLE_EDEFAULT.equals(ville);
			case SchemaPackage.TYPE_ADRESSE_PHYSIQUE__REGION_GEOGRAPHIQUE:
				return REGION_GEOGRAPHIQUE_EDEFAULT == null ? regionGeographique != null : !REGION_GEOGRAPHIQUE_EDEFAULT.equals(regionGeographique);
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
		result.append(", nomResidence: ");
		result.append(nomResidence);
		result.append(", boiteAuxLettres: ");
		result.append(boiteAuxLettres);
		result.append(", numero: ");
		result.append(numero);
		result.append(", nomRue: ");
		result.append(nomRue);
		result.append(", boitePostale: ");
		result.append(boitePostale);
		result.append(", codePostal: ");
		result.append(codePostal);
		result.append(", ville: ");
		result.append(ville);
		result.append(", regionGeographique: ");
		result.append(regionGeographique);
		result.append(')');
		return result.toString();
	}

} //TypeAdressePhysiqueImpl
