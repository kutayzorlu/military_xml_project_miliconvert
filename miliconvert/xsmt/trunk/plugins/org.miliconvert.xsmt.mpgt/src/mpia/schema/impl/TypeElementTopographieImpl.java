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
import mpia.schema.TypeDictionaryDicoElementTopographieCategorie;
import mpia.schema.TypeDictionaryDicoElementTopographieCompositionSurfaceSolide;
import mpia.schema.TypeDictionaryDicoElementTopographieDureteSurface;
import mpia.schema.TypeDictionaryDicoElementTopographieSousCategorie;
import mpia.schema.TypeDictionaryDicoElementTopographieTypeSurface;
import mpia.schema.TypeDictionaryDicoElementTopographieTypeTerrain;
import mpia.schema.TypeDictionaryDicoSousTypeVegetation;
import mpia.schema.TypeDictionaryDicoVegetation;
import mpia.schema.TypeElementTopographie;
import mpia.schema.TypeEtatOperationnelElementTopographie;

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
 * An implementation of the model object '<em><b>Type Element Topographie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeElementTopographieImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeElementTopographieImpl#getSousCategorie <em>Sous Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeElementTopographieImpl#getTypeSurface <em>Type Surface</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeElementTopographieImpl#getDureteSurface <em>Durete Surface</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeElementTopographieImpl#getDistancePenetration <em>Distance Penetration</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeElementTopographieImpl#getCompositionSurfaceSolide <em>Composition Surface Solide</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeElementTopographieImpl#getTypeTerrain <em>Type Terrain</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeElementTopographieImpl#getTypeVegetation <em>Type Vegetation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeElementTopographieImpl#getSousTypeVegetation <em>Sous Type Vegetation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeElementTopographieImpl#getAPourEtatEtatOperationnelElementTopographie <em>APour Etat Etat Operationnel Element Topographie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeElementTopographieImpl#getEstObjetAssociationEltCtrlEltTopo <em>Est Objet Association Elt Ctrl Elt Topo</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeElementTopographieImpl#getEstSujetAssociationEltTopoSite <em>Est Sujet Association Elt Topo Site</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeElementTopographieImpl#getEstObjetAssociationSiteEltTopo <em>Est Objet Association Site Elt Topo</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeElementTopographieImpl#getEstObjetAssociationEntiteOrgEltTopo <em>Est Objet Association Entite Org Elt Topo</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeElementTopographieImpl#getEstObjetAssociationPersonneEltTopo <em>Est Objet Association Personne Elt Topo</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeElementTopographieImpl#getEstObjetAssociationMaterielEltTopo <em>Est Objet Association Materiel Elt Topo</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeElementTopographieImpl#getEstSujetAssociationElementTopographieEvenement <em>Est Sujet Association Element Topographie Evenement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeElementTopographieImpl#getEstObjetAssociationObjetInconnuEltTopo <em>Est Objet Association Objet Inconnu Elt Topo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeElementTopographieImpl extends TypeInstanceObjetImpl implements TypeElementTopographie {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoElementTopographieCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoElementTopographieCategorie.NOS;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoElementTopographieCategorie categorie = CATEGORIE_EDEFAULT;

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
	protected static final TypeDictionaryDicoElementTopographieSousCategorie SOUS_CATEGORIE_EDEFAULT = TypeDictionaryDicoElementTopographieSousCategorie.BCKSHR;

	/**
	 * The cached value of the '{@link #getSousCategorie() <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSousCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoElementTopographieSousCategorie sousCategorie = SOUS_CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Sous Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sousCategorieESet;

	/**
	 * The default value of the '{@link #getTypeSurface() <em>Type Surface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeSurface()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoElementTopographieTypeSurface TYPE_SURFACE_EDEFAULT = TypeDictionaryDicoElementTopographieTypeSurface.LQDSRF;

	/**
	 * The cached value of the '{@link #getTypeSurface() <em>Type Surface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeSurface()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoElementTopographieTypeSurface typeSurface = TYPE_SURFACE_EDEFAULT;

	/**
	 * This is true if the Type Surface attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeSurfaceESet;

	/**
	 * The default value of the '{@link #getDureteSurface() <em>Durete Surface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDureteSurface()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoElementTopographieDureteSurface DURETE_SURFACE_EDEFAULT = TypeDictionaryDicoElementTopographieDureteSurface.ARMELB;

	/**
	 * The cached value of the '{@link #getDureteSurface() <em>Durete Surface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDureteSurface()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoElementTopographieDureteSurface dureteSurface = DURETE_SURFACE_EDEFAULT;

	/**
	 * This is true if the Durete Surface attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dureteSurfaceESet;

	/**
	 * The default value of the '{@link #getDistancePenetration() <em>Distance Penetration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistancePenetration()
	 * @generated
	 * @ordered
	 */
	protected static final long DISTANCE_PENETRATION_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDistancePenetration() <em>Distance Penetration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistancePenetration()
	 * @generated
	 * @ordered
	 */
	protected long distancePenetration = DISTANCE_PENETRATION_EDEFAULT;

	/**
	 * This is true if the Distance Penetration attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean distancePenetrationESet;

	/**
	 * The default value of the '{@link #getCompositionSurfaceSolide() <em>Composition Surface Solide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositionSurfaceSolide()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoElementTopographieCompositionSurfaceSolide COMPOSITION_SURFACE_SOLIDE_EDEFAULT = TypeDictionaryDicoElementTopographieCompositionSurfaceSolide.BDROCK;

	/**
	 * The cached value of the '{@link #getCompositionSurfaceSolide() <em>Composition Surface Solide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositionSurfaceSolide()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoElementTopographieCompositionSurfaceSolide compositionSurfaceSolide = COMPOSITION_SURFACE_SOLIDE_EDEFAULT;

	/**
	 * This is true if the Composition Surface Solide attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean compositionSurfaceSolideESet;

	/**
	 * The default value of the '{@link #getTypeTerrain() <em>Type Terrain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeTerrain()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoElementTopographieTypeTerrain TYPE_TERRAIN_EDEFAULT = TypeDictionaryDicoElementTopographieTypeTerrain.FLAT;

	/**
	 * The cached value of the '{@link #getTypeTerrain() <em>Type Terrain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeTerrain()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoElementTopographieTypeTerrain typeTerrain = TYPE_TERRAIN_EDEFAULT;

	/**
	 * This is true if the Type Terrain attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeTerrainESet;

	/**
	 * The default value of the '{@link #getTypeVegetation() <em>Type Vegetation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeVegetation()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoVegetation TYPE_VEGETATION_EDEFAULT = TypeDictionaryDicoVegetation.BARE;

	/**
	 * The cached value of the '{@link #getTypeVegetation() <em>Type Vegetation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeVegetation()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoVegetation typeVegetation = TYPE_VEGETATION_EDEFAULT;

	/**
	 * This is true if the Type Vegetation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeVegetationESet;

	/**
	 * The default value of the '{@link #getSousTypeVegetation() <em>Sous Type Vegetation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSousTypeVegetation()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoSousTypeVegetation SOUS_TYPE_VEGETATION_EDEFAULT = TypeDictionaryDicoSousTypeVegetation.BAMBOO;

	/**
	 * The cached value of the '{@link #getSousTypeVegetation() <em>Sous Type Vegetation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSousTypeVegetation()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoSousTypeVegetation sousTypeVegetation = SOUS_TYPE_VEGETATION_EDEFAULT;

	/**
	 * This is true if the Sous Type Vegetation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sousTypeVegetationESet;

	/**
	 * The cached value of the '{@link #getAPourEtatEtatOperationnelElementTopographie() <em>APour Etat Etat Operationnel Element Topographie</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourEtatEtatOperationnelElementTopographie()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeEtatOperationnelElementTopographie> aPourEtatEtatOperationnelElementTopographie;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationEltCtrlEltTopo() <em>Est Objet Association Elt Ctrl Elt Topo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationEltCtrlEltTopo()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationEltCtrlEltTopo;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationEltTopoSite() <em>Est Sujet Association Elt Topo Site</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationEltTopoSite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationEltTopoSite;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationSiteEltTopo() <em>Est Objet Association Site Elt Topo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationSiteEltTopo()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationSiteEltTopo;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationEntiteOrgEltTopo() <em>Est Objet Association Entite Org Elt Topo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationEntiteOrgEltTopo()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationEntiteOrgEltTopo;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationPersonneEltTopo() <em>Est Objet Association Personne Elt Topo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationPersonneEltTopo()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationPersonneEltTopo;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationMaterielEltTopo() <em>Est Objet Association Materiel Elt Topo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationMaterielEltTopo()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationMaterielEltTopo;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationElementTopographieEvenement() <em>Est Sujet Association Element Topographie Evenement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationElementTopographieEvenement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationElementTopographieEvenement;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationObjetInconnuEltTopo() <em>Est Objet Association Objet Inconnu Elt Topo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationObjetInconnuEltTopo()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationObjetInconnuEltTopo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeElementTopographieImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeElementTopographie();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoElementTopographieCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoElementTopographieCategorie newCategorie) {
		TypeDictionaryDicoElementTopographieCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoElementTopographieCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeDictionaryDicoElementTopographieSousCategorie getSousCategorie() {
		return sousCategorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSousCategorie(TypeDictionaryDicoElementTopographieSousCategorie newSousCategorie) {
		TypeDictionaryDicoElementTopographieSousCategorie oldSousCategorie = sousCategorie;
		sousCategorie = newSousCategorie == null ? SOUS_CATEGORIE_EDEFAULT : newSousCategorie;
		boolean oldSousCategorieESet = sousCategorieESet;
		sousCategorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__SOUS_CATEGORIE, oldSousCategorie, sousCategorie, !oldSousCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSousCategorie() {
		TypeDictionaryDicoElementTopographieSousCategorie oldSousCategorie = sousCategorie;
		boolean oldSousCategorieESet = sousCategorieESet;
		sousCategorie = SOUS_CATEGORIE_EDEFAULT;
		sousCategorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__SOUS_CATEGORIE, oldSousCategorie, SOUS_CATEGORIE_EDEFAULT, oldSousCategorieESet));
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
	public TypeDictionaryDicoElementTopographieTypeSurface getTypeSurface() {
		return typeSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeSurface(TypeDictionaryDicoElementTopographieTypeSurface newTypeSurface) {
		TypeDictionaryDicoElementTopographieTypeSurface oldTypeSurface = typeSurface;
		typeSurface = newTypeSurface == null ? TYPE_SURFACE_EDEFAULT : newTypeSurface;
		boolean oldTypeSurfaceESet = typeSurfaceESet;
		typeSurfaceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__TYPE_SURFACE, oldTypeSurface, typeSurface, !oldTypeSurfaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeSurface() {
		TypeDictionaryDicoElementTopographieTypeSurface oldTypeSurface = typeSurface;
		boolean oldTypeSurfaceESet = typeSurfaceESet;
		typeSurface = TYPE_SURFACE_EDEFAULT;
		typeSurfaceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__TYPE_SURFACE, oldTypeSurface, TYPE_SURFACE_EDEFAULT, oldTypeSurfaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeSurface() {
		return typeSurfaceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoElementTopographieDureteSurface getDureteSurface() {
		return dureteSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDureteSurface(TypeDictionaryDicoElementTopographieDureteSurface newDureteSurface) {
		TypeDictionaryDicoElementTopographieDureteSurface oldDureteSurface = dureteSurface;
		dureteSurface = newDureteSurface == null ? DURETE_SURFACE_EDEFAULT : newDureteSurface;
		boolean oldDureteSurfaceESet = dureteSurfaceESet;
		dureteSurfaceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__DURETE_SURFACE, oldDureteSurface, dureteSurface, !oldDureteSurfaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDureteSurface() {
		TypeDictionaryDicoElementTopographieDureteSurface oldDureteSurface = dureteSurface;
		boolean oldDureteSurfaceESet = dureteSurfaceESet;
		dureteSurface = DURETE_SURFACE_EDEFAULT;
		dureteSurfaceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__DURETE_SURFACE, oldDureteSurface, DURETE_SURFACE_EDEFAULT, oldDureteSurfaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDureteSurface() {
		return dureteSurfaceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDistancePenetration() {
		return distancePenetration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistancePenetration(long newDistancePenetration) {
		long oldDistancePenetration = distancePenetration;
		distancePenetration = newDistancePenetration;
		boolean oldDistancePenetrationESet = distancePenetrationESet;
		distancePenetrationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__DISTANCE_PENETRATION, oldDistancePenetration, distancePenetration, !oldDistancePenetrationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDistancePenetration() {
		long oldDistancePenetration = distancePenetration;
		boolean oldDistancePenetrationESet = distancePenetrationESet;
		distancePenetration = DISTANCE_PENETRATION_EDEFAULT;
		distancePenetrationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__DISTANCE_PENETRATION, oldDistancePenetration, DISTANCE_PENETRATION_EDEFAULT, oldDistancePenetrationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDistancePenetration() {
		return distancePenetrationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoElementTopographieCompositionSurfaceSolide getCompositionSurfaceSolide() {
		return compositionSurfaceSolide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompositionSurfaceSolide(TypeDictionaryDicoElementTopographieCompositionSurfaceSolide newCompositionSurfaceSolide) {
		TypeDictionaryDicoElementTopographieCompositionSurfaceSolide oldCompositionSurfaceSolide = compositionSurfaceSolide;
		compositionSurfaceSolide = newCompositionSurfaceSolide == null ? COMPOSITION_SURFACE_SOLIDE_EDEFAULT : newCompositionSurfaceSolide;
		boolean oldCompositionSurfaceSolideESet = compositionSurfaceSolideESet;
		compositionSurfaceSolideESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__COMPOSITION_SURFACE_SOLIDE, oldCompositionSurfaceSolide, compositionSurfaceSolide, !oldCompositionSurfaceSolideESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCompositionSurfaceSolide() {
		TypeDictionaryDicoElementTopographieCompositionSurfaceSolide oldCompositionSurfaceSolide = compositionSurfaceSolide;
		boolean oldCompositionSurfaceSolideESet = compositionSurfaceSolideESet;
		compositionSurfaceSolide = COMPOSITION_SURFACE_SOLIDE_EDEFAULT;
		compositionSurfaceSolideESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__COMPOSITION_SURFACE_SOLIDE, oldCompositionSurfaceSolide, COMPOSITION_SURFACE_SOLIDE_EDEFAULT, oldCompositionSurfaceSolideESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCompositionSurfaceSolide() {
		return compositionSurfaceSolideESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoElementTopographieTypeTerrain getTypeTerrain() {
		return typeTerrain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeTerrain(TypeDictionaryDicoElementTopographieTypeTerrain newTypeTerrain) {
		TypeDictionaryDicoElementTopographieTypeTerrain oldTypeTerrain = typeTerrain;
		typeTerrain = newTypeTerrain == null ? TYPE_TERRAIN_EDEFAULT : newTypeTerrain;
		boolean oldTypeTerrainESet = typeTerrainESet;
		typeTerrainESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__TYPE_TERRAIN, oldTypeTerrain, typeTerrain, !oldTypeTerrainESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeTerrain() {
		TypeDictionaryDicoElementTopographieTypeTerrain oldTypeTerrain = typeTerrain;
		boolean oldTypeTerrainESet = typeTerrainESet;
		typeTerrain = TYPE_TERRAIN_EDEFAULT;
		typeTerrainESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__TYPE_TERRAIN, oldTypeTerrain, TYPE_TERRAIN_EDEFAULT, oldTypeTerrainESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeTerrain() {
		return typeTerrainESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoVegetation getTypeVegetation() {
		return typeVegetation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeVegetation(TypeDictionaryDicoVegetation newTypeVegetation) {
		TypeDictionaryDicoVegetation oldTypeVegetation = typeVegetation;
		typeVegetation = newTypeVegetation == null ? TYPE_VEGETATION_EDEFAULT : newTypeVegetation;
		boolean oldTypeVegetationESet = typeVegetationESet;
		typeVegetationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__TYPE_VEGETATION, oldTypeVegetation, typeVegetation, !oldTypeVegetationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeVegetation() {
		TypeDictionaryDicoVegetation oldTypeVegetation = typeVegetation;
		boolean oldTypeVegetationESet = typeVegetationESet;
		typeVegetation = TYPE_VEGETATION_EDEFAULT;
		typeVegetationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__TYPE_VEGETATION, oldTypeVegetation, TYPE_VEGETATION_EDEFAULT, oldTypeVegetationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeVegetation() {
		return typeVegetationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoSousTypeVegetation getSousTypeVegetation() {
		return sousTypeVegetation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSousTypeVegetation(TypeDictionaryDicoSousTypeVegetation newSousTypeVegetation) {
		TypeDictionaryDicoSousTypeVegetation oldSousTypeVegetation = sousTypeVegetation;
		sousTypeVegetation = newSousTypeVegetation == null ? SOUS_TYPE_VEGETATION_EDEFAULT : newSousTypeVegetation;
		boolean oldSousTypeVegetationESet = sousTypeVegetationESet;
		sousTypeVegetationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__SOUS_TYPE_VEGETATION, oldSousTypeVegetation, sousTypeVegetation, !oldSousTypeVegetationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSousTypeVegetation() {
		TypeDictionaryDicoSousTypeVegetation oldSousTypeVegetation = sousTypeVegetation;
		boolean oldSousTypeVegetationESet = sousTypeVegetationESet;
		sousTypeVegetation = SOUS_TYPE_VEGETATION_EDEFAULT;
		sousTypeVegetationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__SOUS_TYPE_VEGETATION, oldSousTypeVegetation, SOUS_TYPE_VEGETATION_EDEFAULT, oldSousTypeVegetationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSousTypeVegetation() {
		return sousTypeVegetationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEtatOperationnelElementTopographie> getAPourEtatEtatOperationnelElementTopographie() {
		if (aPourEtatEtatOperationnelElementTopographie == null) {
			aPourEtatEtatOperationnelElementTopographie = new EObjectContainmentEList<TypeEtatOperationnelElementTopographie>(TypeEtatOperationnelElementTopographie.class, this, SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__APOUR_ETAT_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE);
		}
		return aPourEtatEtatOperationnelElementTopographie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationEltCtrlEltTopo() {
		if (estObjetAssociationEltCtrlEltTopo == null) {
			estObjetAssociationEltCtrlEltTopo = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__EST_OBJET_ASSOCIATION_ELT_CTRL_ELT_TOPO);
		}
		return estObjetAssociationEltCtrlEltTopo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationEltTopoSite() {
		if (estSujetAssociationEltTopoSite == null) {
			estSujetAssociationEltTopoSite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__EST_SUJET_ASSOCIATION_ELT_TOPO_SITE);
		}
		return estSujetAssociationEltTopoSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationSiteEltTopo() {
		if (estObjetAssociationSiteEltTopo == null) {
			estObjetAssociationSiteEltTopo = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__EST_OBJET_ASSOCIATION_SITE_ELT_TOPO);
		}
		return estObjetAssociationSiteEltTopo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationEntiteOrgEltTopo() {
		if (estObjetAssociationEntiteOrgEltTopo == null) {
			estObjetAssociationEntiteOrgEltTopo = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__EST_OBJET_ASSOCIATION_ENTITE_ORG_ELT_TOPO);
		}
		return estObjetAssociationEntiteOrgEltTopo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationPersonneEltTopo() {
		if (estObjetAssociationPersonneEltTopo == null) {
			estObjetAssociationPersonneEltTopo = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__EST_OBJET_ASSOCIATION_PERSONNE_ELT_TOPO);
		}
		return estObjetAssociationPersonneEltTopo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationMaterielEltTopo() {
		if (estObjetAssociationMaterielEltTopo == null) {
			estObjetAssociationMaterielEltTopo = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__EST_OBJET_ASSOCIATION_MATERIEL_ELT_TOPO);
		}
		return estObjetAssociationMaterielEltTopo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationElementTopographieEvenement() {
		if (estSujetAssociationElementTopographieEvenement == null) {
			estSujetAssociationElementTopographieEvenement = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__EST_SUJET_ASSOCIATION_ELEMENT_TOPOGRAPHIE_EVENEMENT);
		}
		return estSujetAssociationElementTopographieEvenement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationObjetInconnuEltTopo() {
		if (estObjetAssociationObjetInconnuEltTopo == null) {
			estObjetAssociationObjetInconnuEltTopo = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__EST_OBJET_ASSOCIATION_OBJET_INCONNU_ELT_TOPO);
		}
		return estObjetAssociationObjetInconnuEltTopo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__APOUR_ETAT_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE:
				return ((InternalEList<?>)getAPourEtatEtatOperationnelElementTopographie()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__EST_OBJET_ASSOCIATION_ELT_CTRL_ELT_TOPO:
				return ((InternalEList<?>)getEstObjetAssociationEltCtrlEltTopo()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__EST_SUJET_ASSOCIATION_ELT_TOPO_SITE:
				return ((InternalEList<?>)getEstSujetAssociationEltTopoSite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__EST_OBJET_ASSOCIATION_SITE_ELT_TOPO:
				return ((InternalEList<?>)getEstObjetAssociationSiteEltTopo()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__EST_OBJET_ASSOCIATION_ENTITE_ORG_ELT_TOPO:
				return ((InternalEList<?>)getEstObjetAssociationEntiteOrgEltTopo()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__EST_OBJET_ASSOCIATION_PERSONNE_ELT_TOPO:
				return ((InternalEList<?>)getEstObjetAssociationPersonneEltTopo()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__EST_OBJET_ASSOCIATION_MATERIEL_ELT_TOPO:
				return ((InternalEList<?>)getEstObjetAssociationMaterielEltTopo()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__EST_SUJET_ASSOCIATION_ELEMENT_TOPOGRAPHIE_EVENEMENT:
				return ((InternalEList<?>)getEstSujetAssociationElementTopographieEvenement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__EST_OBJET_ASSOCIATION_OBJET_INCONNU_ELT_TOPO:
				return ((InternalEList<?>)getEstObjetAssociationObjetInconnuEltTopo()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__SOUS_CATEGORIE:
				return getSousCategorie();
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__TYPE_SURFACE:
				return getTypeSurface();
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__DURETE_SURFACE:
				return getDureteSurface();
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__DISTANCE_PENETRATION:
				return new Long(getDistancePenetration());
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__COMPOSITION_SURFACE_SOLIDE:
				return getCompositionSurfaceSolide();
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__TYPE_TERRAIN:
				return getTypeTerrain();
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__TYPE_VEGETATION:
				return getTypeVegetation();
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__SOUS_TYPE_VEGETATION:
				return getSousTypeVegetation();
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__APOUR_ETAT_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE:
				return getAPourEtatEtatOperationnelElementTopographie();
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__EST_OBJET_ASSOCIATION_ELT_CTRL_ELT_TOPO:
				return getEstObjetAssociationEltCtrlEltTopo();
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__EST_SUJET_ASSOCIATION_ELT_TOPO_SITE:
				return getEstSujetAssociationEltTopoSite();
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__EST_OBJET_ASSOCIATION_SITE_ELT_TOPO:
				return getEstObjetAssociationSiteEltTopo();
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__EST_OBJET_ASSOCIATION_ENTITE_ORG_ELT_TOPO:
				return getEstObjetAssociationEntiteOrgEltTopo();
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__EST_OBJET_ASSOCIATION_PERSONNE_ELT_TOPO:
				return getEstObjetAssociationPersonneEltTopo();
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__EST_OBJET_ASSOCIATION_MATERIEL_ELT_TOPO:
				return getEstObjetAssociationMaterielEltTopo();
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__EST_SUJET_ASSOCIATION_ELEMENT_TOPOGRAPHIE_EVENEMENT:
				return getEstSujetAssociationElementTopographieEvenement();
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__EST_OBJET_ASSOCIATION_OBJET_INCONNU_ELT_TOPO:
				return getEstObjetAssociationObjetInconnuEltTopo();
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
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__CATEGORIE:
				setCategorie((TypeDictionaryDicoElementTopographieCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__SOUS_CATEGORIE:
				setSousCategorie((TypeDictionaryDicoElementTopographieSousCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__TYPE_SURFACE:
				setTypeSurface((TypeDictionaryDicoElementTopographieTypeSurface)newValue);
				return;
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__DURETE_SURFACE:
				setDureteSurface((TypeDictionaryDicoElementTopographieDureteSurface)newValue);
				return;
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__DISTANCE_PENETRATION:
				setDistancePenetration(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__COMPOSITION_SURFACE_SOLIDE:
				setCompositionSurfaceSolide((TypeDictionaryDicoElementTopographieCompositionSurfaceSolide)newValue);
				return;
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__TYPE_TERRAIN:
				setTypeTerrain((TypeDictionaryDicoElementTopographieTypeTerrain)newValue);
				return;
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__TYPE_VEGETATION:
				setTypeVegetation((TypeDictionaryDicoVegetation)newValue);
				return;
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__SOUS_TYPE_VEGETATION:
				setSousTypeVegetation((TypeDictionaryDicoSousTypeVegetation)newValue);
				return;
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__APOUR_ETAT_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE:
				getAPourEtatEtatOperationnelElementTopographie().clear();
				getAPourEtatEtatOperationnelElementTopographie().addAll((Collection<? extends TypeEtatOperationnelElementTopographie>)newValue);
				return;
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__EST_OBJET_ASSOCIATION_ELT_CTRL_ELT_TOPO:
				getEstObjetAssociationEltCtrlEltTopo().clear();
				getEstObjetAssociationEltCtrlEltTopo().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__EST_SUJET_ASSOCIATION_ELT_TOPO_SITE:
				getEstSujetAssociationEltTopoSite().clear();
				getEstSujetAssociationEltTopoSite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__EST_OBJET_ASSOCIATION_SITE_ELT_TOPO:
				getEstObjetAssociationSiteEltTopo().clear();
				getEstObjetAssociationSiteEltTopo().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__EST_OBJET_ASSOCIATION_ENTITE_ORG_ELT_TOPO:
				getEstObjetAssociationEntiteOrgEltTopo().clear();
				getEstObjetAssociationEntiteOrgEltTopo().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__EST_OBJET_ASSOCIATION_PERSONNE_ELT_TOPO:
				getEstObjetAssociationPersonneEltTopo().clear();
				getEstObjetAssociationPersonneEltTopo().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__EST_OBJET_ASSOCIATION_MATERIEL_ELT_TOPO:
				getEstObjetAssociationMaterielEltTopo().clear();
				getEstObjetAssociationMaterielEltTopo().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__EST_SUJET_ASSOCIATION_ELEMENT_TOPOGRAPHIE_EVENEMENT:
				getEstSujetAssociationElementTopographieEvenement().clear();
				getEstSujetAssociationElementTopographieEvenement().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__EST_OBJET_ASSOCIATION_OBJET_INCONNU_ELT_TOPO:
				getEstObjetAssociationObjetInconnuEltTopo().clear();
				getEstObjetAssociationObjetInconnuEltTopo().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__SOUS_CATEGORIE:
				unsetSousCategorie();
				return;
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__TYPE_SURFACE:
				unsetTypeSurface();
				return;
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__DURETE_SURFACE:
				unsetDureteSurface();
				return;
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__DISTANCE_PENETRATION:
				unsetDistancePenetration();
				return;
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__COMPOSITION_SURFACE_SOLIDE:
				unsetCompositionSurfaceSolide();
				return;
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__TYPE_TERRAIN:
				unsetTypeTerrain();
				return;
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__TYPE_VEGETATION:
				unsetTypeVegetation();
				return;
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__SOUS_TYPE_VEGETATION:
				unsetSousTypeVegetation();
				return;
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__APOUR_ETAT_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE:
				getAPourEtatEtatOperationnelElementTopographie().clear();
				return;
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__EST_OBJET_ASSOCIATION_ELT_CTRL_ELT_TOPO:
				getEstObjetAssociationEltCtrlEltTopo().clear();
				return;
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__EST_SUJET_ASSOCIATION_ELT_TOPO_SITE:
				getEstSujetAssociationEltTopoSite().clear();
				return;
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__EST_OBJET_ASSOCIATION_SITE_ELT_TOPO:
				getEstObjetAssociationSiteEltTopo().clear();
				return;
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__EST_OBJET_ASSOCIATION_ENTITE_ORG_ELT_TOPO:
				getEstObjetAssociationEntiteOrgEltTopo().clear();
				return;
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__EST_OBJET_ASSOCIATION_PERSONNE_ELT_TOPO:
				getEstObjetAssociationPersonneEltTopo().clear();
				return;
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__EST_OBJET_ASSOCIATION_MATERIEL_ELT_TOPO:
				getEstObjetAssociationMaterielEltTopo().clear();
				return;
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__EST_SUJET_ASSOCIATION_ELEMENT_TOPOGRAPHIE_EVENEMENT:
				getEstSujetAssociationElementTopographieEvenement().clear();
				return;
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__EST_OBJET_ASSOCIATION_OBJET_INCONNU_ELT_TOPO:
				getEstObjetAssociationObjetInconnuEltTopo().clear();
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
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__SOUS_CATEGORIE:
				return isSetSousCategorie();
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__TYPE_SURFACE:
				return isSetTypeSurface();
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__DURETE_SURFACE:
				return isSetDureteSurface();
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__DISTANCE_PENETRATION:
				return isSetDistancePenetration();
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__COMPOSITION_SURFACE_SOLIDE:
				return isSetCompositionSurfaceSolide();
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__TYPE_TERRAIN:
				return isSetTypeTerrain();
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__TYPE_VEGETATION:
				return isSetTypeVegetation();
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__SOUS_TYPE_VEGETATION:
				return isSetSousTypeVegetation();
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__APOUR_ETAT_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE:
				return aPourEtatEtatOperationnelElementTopographie != null && !aPourEtatEtatOperationnelElementTopographie.isEmpty();
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__EST_OBJET_ASSOCIATION_ELT_CTRL_ELT_TOPO:
				return estObjetAssociationEltCtrlEltTopo != null && !estObjetAssociationEltCtrlEltTopo.isEmpty();
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__EST_SUJET_ASSOCIATION_ELT_TOPO_SITE:
				return estSujetAssociationEltTopoSite != null && !estSujetAssociationEltTopoSite.isEmpty();
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__EST_OBJET_ASSOCIATION_SITE_ELT_TOPO:
				return estObjetAssociationSiteEltTopo != null && !estObjetAssociationSiteEltTopo.isEmpty();
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__EST_OBJET_ASSOCIATION_ENTITE_ORG_ELT_TOPO:
				return estObjetAssociationEntiteOrgEltTopo != null && !estObjetAssociationEntiteOrgEltTopo.isEmpty();
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__EST_OBJET_ASSOCIATION_PERSONNE_ELT_TOPO:
				return estObjetAssociationPersonneEltTopo != null && !estObjetAssociationPersonneEltTopo.isEmpty();
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__EST_OBJET_ASSOCIATION_MATERIEL_ELT_TOPO:
				return estObjetAssociationMaterielEltTopo != null && !estObjetAssociationMaterielEltTopo.isEmpty();
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__EST_SUJET_ASSOCIATION_ELEMENT_TOPOGRAPHIE_EVENEMENT:
				return estSujetAssociationElementTopographieEvenement != null && !estSujetAssociationElementTopographieEvenement.isEmpty();
			case SchemaPackage.TYPE_ELEMENT_TOPOGRAPHIE__EST_OBJET_ASSOCIATION_OBJET_INCONNU_ELT_TOPO:
				return estObjetAssociationObjetInconnuEltTopo != null && !estObjetAssociationObjetInconnuEltTopo.isEmpty();
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
		result.append(", typeSurface: ");
		if (typeSurfaceESet) result.append(typeSurface); else result.append("<unset>");
		result.append(", dureteSurface: ");
		if (dureteSurfaceESet) result.append(dureteSurface); else result.append("<unset>");
		result.append(", distancePenetration: ");
		if (distancePenetrationESet) result.append(distancePenetration); else result.append("<unset>");
		result.append(", compositionSurfaceSolide: ");
		if (compositionSurfaceSolideESet) result.append(compositionSurfaceSolide); else result.append("<unset>");
		result.append(", typeTerrain: ");
		if (typeTerrainESet) result.append(typeTerrain); else result.append("<unset>");
		result.append(", typeVegetation: ");
		if (typeVegetationESet) result.append(typeVegetation); else result.append("<unset>");
		result.append(", sousTypeVegetation: ");
		if (sousTypeVegetationESet) result.append(sousTypeVegetation); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeElementTopographieImpl
