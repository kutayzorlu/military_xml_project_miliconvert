/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoTypeArmeCategorie;
import mpia.schema.TypeDictionaryDicoTypeArmeDiametreTube;
import mpia.schema.TypeDictionaryDicoTypeArmeModele;
import mpia.schema.TypeDictionaryDicoTypeArmeMoyensIFF;
import mpia.schema.TypeDictionaryDicoTypeArmeSousCategorie;
import mpia.schema.TypeTypeArme;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Type Arme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeTypeArmeImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeArmeImpl#getSousCategorie <em>Sous Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeArmeImpl#getAutreSousCategorie <em>Autre Sous Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeArmeImpl#getModele <em>Modele</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeArmeImpl#getDiametreTube <em>Diametre Tube</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeArmeImpl#getCalibre <em>Calibre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeArmeImpl#isGuidage <em>Guidage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeArmeImpl#getMoyensIFF <em>Moyens IFF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeTypeArmeImpl extends TypeTypeEquipementImpl implements TypeTypeArme {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeArmeCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoTypeArmeCategorie.AD;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeArmeCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getSousCategorie() <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSousCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeArmeSousCategorie SOUS_CATEGORIE_EDEFAULT = TypeDictionaryDicoTypeArmeSousCategorie.ADCAN;

	/**
	 * The cached value of the '{@link #getSousCategorie() <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSousCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeArmeSousCategorie sousCategorie = SOUS_CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Sous Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sousCategorieESet;

	/**
	 * The default value of the '{@link #getAutreSousCategorie() <em>Autre Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreSousCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTRE_SOUS_CATEGORIE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutreSousCategorie() <em>Autre Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreSousCategorie()
	 * @generated
	 * @ordered
	 */
	protected String autreSousCategorie = AUTRE_SOUS_CATEGORIE_EDEFAULT;

	/**
	 * The default value of the '{@link #getModele() <em>Modele</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModele()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeArmeModele MODELE_EDEFAULT = TypeDictionaryDicoTypeArmeModele._109A3G;

	/**
	 * The cached value of the '{@link #getModele() <em>Modele</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModele()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeArmeModele modele = MODELE_EDEFAULT;

	/**
	 * This is true if the Modele attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean modeleESet;

	/**
	 * The default value of the '{@link #getDiametreTube() <em>Diametre Tube</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiametreTube()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeArmeDiametreTube DIAMETRE_TUBE_EDEFAULT = TypeDictionaryDicoTypeArmeDiametreTube._81MM;

	/**
	 * The cached value of the '{@link #getDiametreTube() <em>Diametre Tube</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiametreTube()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeArmeDiametreTube diametreTube = DIAMETRE_TUBE_EDEFAULT;

	/**
	 * This is true if the Diametre Tube attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean diametreTubeESet;

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
	 * The default value of the '{@link #isGuidage() <em>Guidage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGuidage()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GUIDAGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGuidage() <em>Guidage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGuidage()
	 * @generated
	 * @ordered
	 */
	protected boolean guidage = GUIDAGE_EDEFAULT;

	/**
	 * This is true if the Guidage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean guidageESet;

	/**
	 * The default value of the '{@link #getMoyensIFF() <em>Moyens IFF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyensIFF()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeArmeMoyensIFF MOYENS_IFF_EDEFAULT = TypeDictionaryDicoTypeArmeMoyensIFF.SHORAD1;

	/**
	 * The cached value of the '{@link #getMoyensIFF() <em>Moyens IFF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyensIFF()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeArmeMoyensIFF moyensIFF = MOYENS_IFF_EDEFAULT;

	/**
	 * This is true if the Moyens IFF attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean moyensIFFESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeTypeArmeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeTypeArme();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeArmeCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoTypeArmeCategorie newCategorie) {
		TypeDictionaryDicoTypeArmeCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_ARME__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoTypeArmeCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_ARME__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeDictionaryDicoTypeArmeSousCategorie getSousCategorie() {
		return sousCategorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSousCategorie(TypeDictionaryDicoTypeArmeSousCategorie newSousCategorie) {
		TypeDictionaryDicoTypeArmeSousCategorie oldSousCategorie = sousCategorie;
		sousCategorie = newSousCategorie == null ? SOUS_CATEGORIE_EDEFAULT : newSousCategorie;
		boolean oldSousCategorieESet = sousCategorieESet;
		sousCategorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_ARME__SOUS_CATEGORIE, oldSousCategorie, sousCategorie, !oldSousCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSousCategorie() {
		TypeDictionaryDicoTypeArmeSousCategorie oldSousCategorie = sousCategorie;
		boolean oldSousCategorieESet = sousCategorieESet;
		sousCategorie = SOUS_CATEGORIE_EDEFAULT;
		sousCategorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_ARME__SOUS_CATEGORIE, oldSousCategorie, SOUS_CATEGORIE_EDEFAULT, oldSousCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSousCategorie() {
		return sousCategorieESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutreSousCategorie() {
		return autreSousCategorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutreSousCategorie(String newAutreSousCategorie) {
		String oldAutreSousCategorie = autreSousCategorie;
		autreSousCategorie = newAutreSousCategorie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_ARME__AUTRE_SOUS_CATEGORIE, oldAutreSousCategorie, autreSousCategorie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeArmeModele getModele() {
		return modele;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModele(TypeDictionaryDicoTypeArmeModele newModele) {
		TypeDictionaryDicoTypeArmeModele oldModele = modele;
		modele = newModele == null ? MODELE_EDEFAULT : newModele;
		boolean oldModeleESet = modeleESet;
		modeleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_ARME__MODELE, oldModele, modele, !oldModeleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetModele() {
		TypeDictionaryDicoTypeArmeModele oldModele = modele;
		boolean oldModeleESet = modeleESet;
		modele = MODELE_EDEFAULT;
		modeleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_ARME__MODELE, oldModele, MODELE_EDEFAULT, oldModeleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetModele() {
		return modeleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeArmeDiametreTube getDiametreTube() {
		return diametreTube;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiametreTube(TypeDictionaryDicoTypeArmeDiametreTube newDiametreTube) {
		TypeDictionaryDicoTypeArmeDiametreTube oldDiametreTube = diametreTube;
		diametreTube = newDiametreTube == null ? DIAMETRE_TUBE_EDEFAULT : newDiametreTube;
		boolean oldDiametreTubeESet = diametreTubeESet;
		diametreTubeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_ARME__DIAMETRE_TUBE, oldDiametreTube, diametreTube, !oldDiametreTubeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDiametreTube() {
		TypeDictionaryDicoTypeArmeDiametreTube oldDiametreTube = diametreTube;
		boolean oldDiametreTubeESet = diametreTubeESet;
		diametreTube = DIAMETRE_TUBE_EDEFAULT;
		diametreTubeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_ARME__DIAMETRE_TUBE, oldDiametreTube, DIAMETRE_TUBE_EDEFAULT, oldDiametreTubeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDiametreTube() {
		return diametreTubeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_ARME__CALIBRE, oldCalibre, calibre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGuidage() {
		return guidage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuidage(boolean newGuidage) {
		boolean oldGuidage = guidage;
		guidage = newGuidage;
		boolean oldGuidageESet = guidageESet;
		guidageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_ARME__GUIDAGE, oldGuidage, guidage, !oldGuidageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGuidage() {
		boolean oldGuidage = guidage;
		boolean oldGuidageESet = guidageESet;
		guidage = GUIDAGE_EDEFAULT;
		guidageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_ARME__GUIDAGE, oldGuidage, GUIDAGE_EDEFAULT, oldGuidageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGuidage() {
		return guidageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeArmeMoyensIFF getMoyensIFF() {
		return moyensIFF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoyensIFF(TypeDictionaryDicoTypeArmeMoyensIFF newMoyensIFF) {
		TypeDictionaryDicoTypeArmeMoyensIFF oldMoyensIFF = moyensIFF;
		moyensIFF = newMoyensIFF == null ? MOYENS_IFF_EDEFAULT : newMoyensIFF;
		boolean oldMoyensIFFESet = moyensIFFESet;
		moyensIFFESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_ARME__MOYENS_IFF, oldMoyensIFF, moyensIFF, !oldMoyensIFFESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMoyensIFF() {
		TypeDictionaryDicoTypeArmeMoyensIFF oldMoyensIFF = moyensIFF;
		boolean oldMoyensIFFESet = moyensIFFESet;
		moyensIFF = MOYENS_IFF_EDEFAULT;
		moyensIFFESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_ARME__MOYENS_IFF, oldMoyensIFF, MOYENS_IFF_EDEFAULT, oldMoyensIFFESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMoyensIFF() {
		return moyensIFFESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_TYPE_ARME__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_TYPE_ARME__SOUS_CATEGORIE:
				return getSousCategorie();
			case SchemaPackage.TYPE_TYPE_ARME__AUTRE_SOUS_CATEGORIE:
				return getAutreSousCategorie();
			case SchemaPackage.TYPE_TYPE_ARME__MODELE:
				return getModele();
			case SchemaPackage.TYPE_TYPE_ARME__DIAMETRE_TUBE:
				return getDiametreTube();
			case SchemaPackage.TYPE_TYPE_ARME__CALIBRE:
				return getCalibre();
			case SchemaPackage.TYPE_TYPE_ARME__GUIDAGE:
				return isGuidage() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_TYPE_ARME__MOYENS_IFF:
				return getMoyensIFF();
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
			case SchemaPackage.TYPE_TYPE_ARME__CATEGORIE:
				setCategorie((TypeDictionaryDicoTypeArmeCategorie)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_ARME__SOUS_CATEGORIE:
				setSousCategorie((TypeDictionaryDicoTypeArmeSousCategorie)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_ARME__AUTRE_SOUS_CATEGORIE:
				setAutreSousCategorie((String)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_ARME__MODELE:
				setModele((TypeDictionaryDicoTypeArmeModele)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_ARME__DIAMETRE_TUBE:
				setDiametreTube((TypeDictionaryDicoTypeArmeDiametreTube)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_ARME__CALIBRE:
				setCalibre((String)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_ARME__GUIDAGE:
				setGuidage(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_TYPE_ARME__MOYENS_IFF:
				setMoyensIFF((TypeDictionaryDicoTypeArmeMoyensIFF)newValue);
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
			case SchemaPackage.TYPE_TYPE_ARME__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_TYPE_ARME__SOUS_CATEGORIE:
				unsetSousCategorie();
				return;
			case SchemaPackage.TYPE_TYPE_ARME__AUTRE_SOUS_CATEGORIE:
				setAutreSousCategorie(AUTRE_SOUS_CATEGORIE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TYPE_ARME__MODELE:
				unsetModele();
				return;
			case SchemaPackage.TYPE_TYPE_ARME__DIAMETRE_TUBE:
				unsetDiametreTube();
				return;
			case SchemaPackage.TYPE_TYPE_ARME__CALIBRE:
				setCalibre(CALIBRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TYPE_ARME__GUIDAGE:
				unsetGuidage();
				return;
			case SchemaPackage.TYPE_TYPE_ARME__MOYENS_IFF:
				unsetMoyensIFF();
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
			case SchemaPackage.TYPE_TYPE_ARME__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_TYPE_ARME__SOUS_CATEGORIE:
				return isSetSousCategorie();
			case SchemaPackage.TYPE_TYPE_ARME__AUTRE_SOUS_CATEGORIE:
				return AUTRE_SOUS_CATEGORIE_EDEFAULT == null ? autreSousCategorie != null : !AUTRE_SOUS_CATEGORIE_EDEFAULT.equals(autreSousCategorie);
			case SchemaPackage.TYPE_TYPE_ARME__MODELE:
				return isSetModele();
			case SchemaPackage.TYPE_TYPE_ARME__DIAMETRE_TUBE:
				return isSetDiametreTube();
			case SchemaPackage.TYPE_TYPE_ARME__CALIBRE:
				return CALIBRE_EDEFAULT == null ? calibre != null : !CALIBRE_EDEFAULT.equals(calibre);
			case SchemaPackage.TYPE_TYPE_ARME__GUIDAGE:
				return isSetGuidage();
			case SchemaPackage.TYPE_TYPE_ARME__MOYENS_IFF:
				return isSetMoyensIFF();
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
		result.append(", sousCategorie: ");
		if (sousCategorieESet) result.append(sousCategorie); else result.append("<unset>");
		result.append(", autreSousCategorie: ");
		result.append(autreSousCategorie);
		result.append(", modele: ");
		if (modeleESet) result.append(modele); else result.append("<unset>");
		result.append(", diametreTube: ");
		if (diametreTubeESet) result.append(diametreTube); else result.append("<unset>");
		result.append(", calibre: ");
		result.append(calibre);
		result.append(", guidage: ");
		if (guidageESet) result.append(guidage); else result.append("<unset>");
		result.append(", moyensIFF: ");
		if (moyensIFFESet) result.append(moyensIFF); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeTypeArmeImpl
