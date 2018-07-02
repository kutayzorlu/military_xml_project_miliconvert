/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoPriorite;
import mpia.schema.TypeDictionaryDicoTacheAppuiAerienCategorieObjectif;
import mpia.schema.TypeDictionaryDicoTacheAppuiAerienCodeTache;
import mpia.schema.TypeTacheAppuiAerien;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Tache Appui Aerien</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeTacheAppuiAerienImpl#getTypeTache <em>Type Tache</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTacheAppuiAerienImpl#getCodeTache <em>Code Tache</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTacheAppuiAerienImpl#getNombreObjectifs <em>Nombre Objectifs</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTacheAppuiAerienImpl#getDescriptionObjectif <em>Description Objectif</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTacheAppuiAerienImpl#getCategorieObjectif <em>Categorie Objectif</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTacheAppuiAerienImpl#getPrioriteTache <em>Priorite Tache</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTacheAppuiAerienImpl#getPourcentagePertesSouhaitees <em>Pourcentage Pertes Souhaitees</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTacheAppuiAerienImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTacheAppuiAerienImpl#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeTacheAppuiAerienImpl extends EObjectImpl implements TypeTacheAppuiAerien {
	/**
	 * The default value of the '{@link #getTypeTache() <em>Type Tache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeTache()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_TACHE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeTache() <em>Type Tache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeTache()
	 * @generated
	 * @ordered
	 */
	protected String typeTache = TYPE_TACHE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeTache() <em>Code Tache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeTache()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTacheAppuiAerienCodeTache CODE_TACHE_EDEFAULT = TypeDictionaryDicoTacheAppuiAerienCodeTache.SV;

	/**
	 * The cached value of the '{@link #getCodeTache() <em>Code Tache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeTache()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTacheAppuiAerienCodeTache codeTache = CODE_TACHE_EDEFAULT;

	/**
	 * This is true if the Code Tache attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean codeTacheESet;

	/**
	 * The default value of the '{@link #getNombreObjectifs() <em>Nombre Objectifs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreObjectifs()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_OBJECTIFS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreObjectifs() <em>Nombre Objectifs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreObjectifs()
	 * @generated
	 * @ordered
	 */
	protected long nombreObjectifs = NOMBRE_OBJECTIFS_EDEFAULT;

	/**
	 * This is true if the Nombre Objectifs attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreObjectifsESet;

	/**
	 * The default value of the '{@link #getDescriptionObjectif() <em>Description Objectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionObjectif()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_OBJECTIF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescriptionObjectif() <em>Description Objectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionObjectif()
	 * @generated
	 * @ordered
	 */
	protected String descriptionObjectif = DESCRIPTION_OBJECTIF_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategorieObjectif() <em>Categorie Objectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorieObjectif()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTacheAppuiAerienCategorieObjectif CATEGORIE_OBJECTIF_EDEFAULT = TypeDictionaryDicoTacheAppuiAerienCategorieObjectif._1;

	/**
	 * The cached value of the '{@link #getCategorieObjectif() <em>Categorie Objectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorieObjectif()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTacheAppuiAerienCategorieObjectif categorieObjectif = CATEGORIE_OBJECTIF_EDEFAULT;

	/**
	 * This is true if the Categorie Objectif attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieObjectifESet;

	/**
	 * The default value of the '{@link #getPrioriteTache() <em>Priorite Tache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrioriteTache()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPriorite PRIORITE_TACHE_EDEFAULT = TypeDictionaryDicoPriorite._1;

	/**
	 * The cached value of the '{@link #getPrioriteTache() <em>Priorite Tache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrioriteTache()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPriorite prioriteTache = PRIORITE_TACHE_EDEFAULT;

	/**
	 * This is true if the Priorite Tache attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean prioriteTacheESet;

	/**
	 * The default value of the '{@link #getPourcentagePertesSouhaitees() <em>Pourcentage Pertes Souhaitees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPourcentagePertesSouhaitees()
	 * @generated
	 * @ordered
	 */
	protected static final long POURCENTAGE_PERTES_SOUHAITEES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getPourcentagePertesSouhaitees() <em>Pourcentage Pertes Souhaitees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPourcentagePertesSouhaitees()
	 * @generated
	 * @ordered
	 */
	protected long pourcentagePertesSouhaitees = POURCENTAGE_PERTES_SOUHAITEES_EDEFAULT;

	/**
	 * This is true if the Pourcentage Pertes Souhaitees attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pourcentagePertesSouhaiteesESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeTacheAppuiAerienImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeTacheAppuiAerien();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeTache() {
		return typeTache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeTache(String newTypeTache) {
		String oldTypeTache = typeTache;
		typeTache = newTypeTache;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TACHE_APPUI_AERIEN__TYPE_TACHE, oldTypeTache, typeTache));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTacheAppuiAerienCodeTache getCodeTache() {
		return codeTache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeTache(TypeDictionaryDicoTacheAppuiAerienCodeTache newCodeTache) {
		TypeDictionaryDicoTacheAppuiAerienCodeTache oldCodeTache = codeTache;
		codeTache = newCodeTache == null ? CODE_TACHE_EDEFAULT : newCodeTache;
		boolean oldCodeTacheESet = codeTacheESet;
		codeTacheESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TACHE_APPUI_AERIEN__CODE_TACHE, oldCodeTache, codeTache, !oldCodeTacheESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCodeTache() {
		TypeDictionaryDicoTacheAppuiAerienCodeTache oldCodeTache = codeTache;
		boolean oldCodeTacheESet = codeTacheESet;
		codeTache = CODE_TACHE_EDEFAULT;
		codeTacheESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TACHE_APPUI_AERIEN__CODE_TACHE, oldCodeTache, CODE_TACHE_EDEFAULT, oldCodeTacheESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCodeTache() {
		return codeTacheESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreObjectifs() {
		return nombreObjectifs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreObjectifs(long newNombreObjectifs) {
		long oldNombreObjectifs = nombreObjectifs;
		nombreObjectifs = newNombreObjectifs;
		boolean oldNombreObjectifsESet = nombreObjectifsESet;
		nombreObjectifsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TACHE_APPUI_AERIEN__NOMBRE_OBJECTIFS, oldNombreObjectifs, nombreObjectifs, !oldNombreObjectifsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreObjectifs() {
		long oldNombreObjectifs = nombreObjectifs;
		boolean oldNombreObjectifsESet = nombreObjectifsESet;
		nombreObjectifs = NOMBRE_OBJECTIFS_EDEFAULT;
		nombreObjectifsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TACHE_APPUI_AERIEN__NOMBRE_OBJECTIFS, oldNombreObjectifs, NOMBRE_OBJECTIFS_EDEFAULT, oldNombreObjectifsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreObjectifs() {
		return nombreObjectifsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescriptionObjectif() {
		return descriptionObjectif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptionObjectif(String newDescriptionObjectif) {
		String oldDescriptionObjectif = descriptionObjectif;
		descriptionObjectif = newDescriptionObjectif;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TACHE_APPUI_AERIEN__DESCRIPTION_OBJECTIF, oldDescriptionObjectif, descriptionObjectif));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTacheAppuiAerienCategorieObjectif getCategorieObjectif() {
		return categorieObjectif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorieObjectif(TypeDictionaryDicoTacheAppuiAerienCategorieObjectif newCategorieObjectif) {
		TypeDictionaryDicoTacheAppuiAerienCategorieObjectif oldCategorieObjectif = categorieObjectif;
		categorieObjectif = newCategorieObjectif == null ? CATEGORIE_OBJECTIF_EDEFAULT : newCategorieObjectif;
		boolean oldCategorieObjectifESet = categorieObjectifESet;
		categorieObjectifESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TACHE_APPUI_AERIEN__CATEGORIE_OBJECTIF, oldCategorieObjectif, categorieObjectif, !oldCategorieObjectifESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorieObjectif() {
		TypeDictionaryDicoTacheAppuiAerienCategorieObjectif oldCategorieObjectif = categorieObjectif;
		boolean oldCategorieObjectifESet = categorieObjectifESet;
		categorieObjectif = CATEGORIE_OBJECTIF_EDEFAULT;
		categorieObjectifESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TACHE_APPUI_AERIEN__CATEGORIE_OBJECTIF, oldCategorieObjectif, CATEGORIE_OBJECTIF_EDEFAULT, oldCategorieObjectifESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCategorieObjectif() {
		return categorieObjectifESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPriorite getPrioriteTache() {
		return prioriteTache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrioriteTache(TypeDictionaryDicoPriorite newPrioriteTache) {
		TypeDictionaryDicoPriorite oldPrioriteTache = prioriteTache;
		prioriteTache = newPrioriteTache == null ? PRIORITE_TACHE_EDEFAULT : newPrioriteTache;
		boolean oldPrioriteTacheESet = prioriteTacheESet;
		prioriteTacheESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TACHE_APPUI_AERIEN__PRIORITE_TACHE, oldPrioriteTache, prioriteTache, !oldPrioriteTacheESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrioriteTache() {
		TypeDictionaryDicoPriorite oldPrioriteTache = prioriteTache;
		boolean oldPrioriteTacheESet = prioriteTacheESet;
		prioriteTache = PRIORITE_TACHE_EDEFAULT;
		prioriteTacheESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TACHE_APPUI_AERIEN__PRIORITE_TACHE, oldPrioriteTache, PRIORITE_TACHE_EDEFAULT, oldPrioriteTacheESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrioriteTache() {
		return prioriteTacheESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getPourcentagePertesSouhaitees() {
		return pourcentagePertesSouhaitees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPourcentagePertesSouhaitees(long newPourcentagePertesSouhaitees) {
		long oldPourcentagePertesSouhaitees = pourcentagePertesSouhaitees;
		pourcentagePertesSouhaitees = newPourcentagePertesSouhaitees;
		boolean oldPourcentagePertesSouhaiteesESet = pourcentagePertesSouhaiteesESet;
		pourcentagePertesSouhaiteesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TACHE_APPUI_AERIEN__POURCENTAGE_PERTES_SOUHAITEES, oldPourcentagePertesSouhaitees, pourcentagePertesSouhaitees, !oldPourcentagePertesSouhaiteesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPourcentagePertesSouhaitees() {
		long oldPourcentagePertesSouhaitees = pourcentagePertesSouhaitees;
		boolean oldPourcentagePertesSouhaiteesESet = pourcentagePertesSouhaiteesESet;
		pourcentagePertesSouhaitees = POURCENTAGE_PERTES_SOUHAITEES_EDEFAULT;
		pourcentagePertesSouhaiteesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TACHE_APPUI_AERIEN__POURCENTAGE_PERTES_SOUHAITEES, oldPourcentagePertesSouhaitees, POURCENTAGE_PERTES_SOUHAITEES_EDEFAULT, oldPourcentagePertesSouhaiteesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPourcentagePertesSouhaitees() {
		return pourcentagePertesSouhaiteesESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TACHE_APPUI_AERIEN__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TACHE_APPUI_AERIEN__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_TACHE_APPUI_AERIEN__TYPE_TACHE:
				return getTypeTache();
			case SchemaPackage.TYPE_TACHE_APPUI_AERIEN__CODE_TACHE:
				return getCodeTache();
			case SchemaPackage.TYPE_TACHE_APPUI_AERIEN__NOMBRE_OBJECTIFS:
				return new Long(getNombreObjectifs());
			case SchemaPackage.TYPE_TACHE_APPUI_AERIEN__DESCRIPTION_OBJECTIF:
				return getDescriptionObjectif();
			case SchemaPackage.TYPE_TACHE_APPUI_AERIEN__CATEGORIE_OBJECTIF:
				return getCategorieObjectif();
			case SchemaPackage.TYPE_TACHE_APPUI_AERIEN__PRIORITE_TACHE:
				return getPrioriteTache();
			case SchemaPackage.TYPE_TACHE_APPUI_AERIEN__POURCENTAGE_PERTES_SOUHAITEES:
				return new Long(getPourcentagePertesSouhaitees());
			case SchemaPackage.TYPE_TACHE_APPUI_AERIEN__CTE:
				return getCTE();
			case SchemaPackage.TYPE_TACHE_APPUI_AERIEN__CE:
				return getCE();
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
			case SchemaPackage.TYPE_TACHE_APPUI_AERIEN__TYPE_TACHE:
				setTypeTache((String)newValue);
				return;
			case SchemaPackage.TYPE_TACHE_APPUI_AERIEN__CODE_TACHE:
				setCodeTache((TypeDictionaryDicoTacheAppuiAerienCodeTache)newValue);
				return;
			case SchemaPackage.TYPE_TACHE_APPUI_AERIEN__NOMBRE_OBJECTIFS:
				setNombreObjectifs(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_TACHE_APPUI_AERIEN__DESCRIPTION_OBJECTIF:
				setDescriptionObjectif((String)newValue);
				return;
			case SchemaPackage.TYPE_TACHE_APPUI_AERIEN__CATEGORIE_OBJECTIF:
				setCategorieObjectif((TypeDictionaryDicoTacheAppuiAerienCategorieObjectif)newValue);
				return;
			case SchemaPackage.TYPE_TACHE_APPUI_AERIEN__PRIORITE_TACHE:
				setPrioriteTache((TypeDictionaryDicoPriorite)newValue);
				return;
			case SchemaPackage.TYPE_TACHE_APPUI_AERIEN__POURCENTAGE_PERTES_SOUHAITEES:
				setPourcentagePertesSouhaitees(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_TACHE_APPUI_AERIEN__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_TACHE_APPUI_AERIEN__CE:
				setCE((String)newValue);
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
			case SchemaPackage.TYPE_TACHE_APPUI_AERIEN__TYPE_TACHE:
				setTypeTache(TYPE_TACHE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TACHE_APPUI_AERIEN__CODE_TACHE:
				unsetCodeTache();
				return;
			case SchemaPackage.TYPE_TACHE_APPUI_AERIEN__NOMBRE_OBJECTIFS:
				unsetNombreObjectifs();
				return;
			case SchemaPackage.TYPE_TACHE_APPUI_AERIEN__DESCRIPTION_OBJECTIF:
				setDescriptionObjectif(DESCRIPTION_OBJECTIF_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TACHE_APPUI_AERIEN__CATEGORIE_OBJECTIF:
				unsetCategorieObjectif();
				return;
			case SchemaPackage.TYPE_TACHE_APPUI_AERIEN__PRIORITE_TACHE:
				unsetPrioriteTache();
				return;
			case SchemaPackage.TYPE_TACHE_APPUI_AERIEN__POURCENTAGE_PERTES_SOUHAITEES:
				unsetPourcentagePertesSouhaitees();
				return;
			case SchemaPackage.TYPE_TACHE_APPUI_AERIEN__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TACHE_APPUI_AERIEN__CE:
				setCE(CE_EDEFAULT);
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
			case SchemaPackage.TYPE_TACHE_APPUI_AERIEN__TYPE_TACHE:
				return TYPE_TACHE_EDEFAULT == null ? typeTache != null : !TYPE_TACHE_EDEFAULT.equals(typeTache);
			case SchemaPackage.TYPE_TACHE_APPUI_AERIEN__CODE_TACHE:
				return isSetCodeTache();
			case SchemaPackage.TYPE_TACHE_APPUI_AERIEN__NOMBRE_OBJECTIFS:
				return isSetNombreObjectifs();
			case SchemaPackage.TYPE_TACHE_APPUI_AERIEN__DESCRIPTION_OBJECTIF:
				return DESCRIPTION_OBJECTIF_EDEFAULT == null ? descriptionObjectif != null : !DESCRIPTION_OBJECTIF_EDEFAULT.equals(descriptionObjectif);
			case SchemaPackage.TYPE_TACHE_APPUI_AERIEN__CATEGORIE_OBJECTIF:
				return isSetCategorieObjectif();
			case SchemaPackage.TYPE_TACHE_APPUI_AERIEN__PRIORITE_TACHE:
				return isSetPrioriteTache();
			case SchemaPackage.TYPE_TACHE_APPUI_AERIEN__POURCENTAGE_PERTES_SOUHAITEES:
				return isSetPourcentagePertesSouhaitees();
			case SchemaPackage.TYPE_TACHE_APPUI_AERIEN__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_TACHE_APPUI_AERIEN__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
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
		result.append(" (typeTache: ");
		result.append(typeTache);
		result.append(", codeTache: ");
		if (codeTacheESet) result.append(codeTache); else result.append("<unset>");
		result.append(", nombreObjectifs: ");
		if (nombreObjectifsESet) result.append(nombreObjectifs); else result.append("<unset>");
		result.append(", descriptionObjectif: ");
		result.append(descriptionObjectif);
		result.append(", categorieObjectif: ");
		if (categorieObjectifESet) result.append(categorieObjectif); else result.append("<unset>");
		result.append(", prioriteTache: ");
		if (prioriteTacheESet) result.append(prioriteTache); else result.append("<unset>");
		result.append(", pourcentagePertesSouhaitees: ");
		if (pourcentagePertesSouhaiteesESet) result.append(pourcentagePertesSouhaitees); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeTacheAppuiAerienImpl
