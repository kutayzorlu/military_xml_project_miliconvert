/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeDuree;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeBaseCalculNecessaire;
import mpia.schema.TypeDictionaryDicoAideDeploiementObjetTravail;
import mpia.schema.TypeDictionaryDicoVarianteTravailTypeCalcul;
import mpia.schema.TypeDictionaryDicoVarianteTravailTypeGeometrie;
import mpia.schema.TypeDictionaryDicoVarianteTravailTypeTravail;
import mpia.schema.TypeEffectifNecessaire;
import mpia.schema.TypeMoyensNecessaires;
import mpia.schema.TypeVarianteTravail;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Variante Travail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeVarianteTravailImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeVarianteTravailImpl#getTypeTravail <em>Type Travail</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeVarianteTravailImpl#getTypeGeometrie <em>Type Geometrie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeVarianteTravailImpl#getTypeCalcul <em>Type Calcul</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeVarianteTravailImpl#getLongueurReference <em>Longueur Reference</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeVarianteTravailImpl#getSurfaceReference <em>Surface Reference</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeVarianteTravailImpl#getQuantiteRechargement <em>Quantite Rechargement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeVarianteTravailImpl#getTempsRechargement <em>Temps Rechargement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeVarianteTravailImpl#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeVarianteTravailImpl#getAidedeploiement <em>Aidedeploiement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeVarianteTravailImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeVarianteTravailImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeVarianteTravailImpl#getAPourReferenceAutreTypeSite <em>APour Reference Autre Type Site</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeVarianteTravailImpl#getAPourReferenceTypeObstacle <em>APour Reference Type Obstacle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeVarianteTravailImpl#getConcerneMoyensMoyensNecessaires <em>Concerne Moyens Moyens Necessaires</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeVarianteTravailImpl#getAPourBaseCalculNecessaire <em>APour Base Calcul Necessaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeVarianteTravailImpl#getEstReferenceParMoyensGenie <em>Est Reference Par Moyens Genie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeVarianteTravailImpl#getConcerneEffectifsNecessairesEffectifNecessaire <em>Concerne Effectifs Necessaires Effectif Necessaire</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeVarianteTravailImpl extends EObjectImpl implements TypeVarianteTravail {
	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeTravail() <em>Type Travail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeTravail()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoVarianteTravailTypeTravail TYPE_TRAVAIL_EDEFAULT = TypeDictionaryDicoVarianteTravailTypeTravail.OBSTY;

	/**
	 * The cached value of the '{@link #getTypeTravail() <em>Type Travail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeTravail()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoVarianteTravailTypeTravail typeTravail = TYPE_TRAVAIL_EDEFAULT;

	/**
	 * This is true if the Type Travail attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeTravailESet;

	/**
	 * The default value of the '{@link #getTypeGeometrie() <em>Type Geometrie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeGeometrie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoVarianteTravailTypeGeometrie TYPE_GEOMETRIE_EDEFAULT = TypeDictionaryDicoVarianteTravailTypeGeometrie.PONCT;

	/**
	 * The cached value of the '{@link #getTypeGeometrie() <em>Type Geometrie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeGeometrie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoVarianteTravailTypeGeometrie typeGeometrie = TYPE_GEOMETRIE_EDEFAULT;

	/**
	 * This is true if the Type Geometrie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeGeometrieESet;

	/**
	 * The default value of the '{@link #getTypeCalcul() <em>Type Calcul</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCalcul()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoVarianteTravailTypeCalcul TYPE_CALCUL_EDEFAULT = TypeDictionaryDicoVarianteTravailTypeCalcul.PROPORT;

	/**
	 * The cached value of the '{@link #getTypeCalcul() <em>Type Calcul</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCalcul()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoVarianteTravailTypeCalcul typeCalcul = TYPE_CALCUL_EDEFAULT;

	/**
	 * This is true if the Type Calcul attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeCalculESet;

	/**
	 * The default value of the '{@link #getLongueurReference() <em>Longueur Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongueurReference()
	 * @generated
	 * @ordered
	 */
	protected static final String LONGUEUR_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLongueurReference() <em>Longueur Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongueurReference()
	 * @generated
	 * @ordered
	 */
	protected String longueurReference = LONGUEUR_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSurfaceReference() <em>Surface Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurfaceReference()
	 * @generated
	 * @ordered
	 */
	protected static final long SURFACE_REFERENCE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSurfaceReference() <em>Surface Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurfaceReference()
	 * @generated
	 * @ordered
	 */
	protected long surfaceReference = SURFACE_REFERENCE_EDEFAULT;

	/**
	 * This is true if the Surface Reference attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean surfaceReferenceESet;

	/**
	 * The default value of the '{@link #getQuantiteRechargement() <em>Quantite Rechargement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteRechargement()
	 * @generated
	 * @ordered
	 */
	protected static final long QUANTITE_RECHARGEMENT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getQuantiteRechargement() <em>Quantite Rechargement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteRechargement()
	 * @generated
	 * @ordered
	 */
	protected long quantiteRechargement = QUANTITE_RECHARGEMENT_EDEFAULT;

	/**
	 * This is true if the Quantite Rechargement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quantiteRechargementESet;

	/**
	 * The cached value of the '{@link #getTempsRechargement() <em>Temps Rechargement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempsRechargement()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree tempsRechargement;

	/**
	 * The default value of the '{@link #getCommentaire() <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaire()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTAIRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommentaire() <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaire()
	 * @generated
	 * @ordered
	 */
	protected String commentaire = COMMENTAIRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAidedeploiement() <em>Aidedeploiement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAidedeploiement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAideDeploiementObjetTravail AIDEDEPLOIEMENT_EDEFAULT = TypeDictionaryDicoAideDeploiementObjetTravail.WATSPL;

	/**
	 * The cached value of the '{@link #getAidedeploiement() <em>Aidedeploiement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAidedeploiement()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAideDeploiementObjetTravail aidedeploiement = AIDEDEPLOIEMENT_EDEFAULT;

	/**
	 * This is true if the Aidedeploiement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean aidedeploiementESet;

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
	 * The cached value of the '{@link #getAPourReferenceAutreTypeSite() <em>APour Reference Autre Type Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourReferenceAutreTypeSite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourReferenceAutreTypeSite;

	/**
	 * The cached value of the '{@link #getAPourReferenceTypeObstacle() <em>APour Reference Type Obstacle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourReferenceTypeObstacle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourReferenceTypeObstacle;

	/**
	 * The cached value of the '{@link #getConcerneMoyensMoyensNecessaires() <em>Concerne Moyens Moyens Necessaires</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneMoyensMoyensNecessaires()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeMoyensNecessaires> concerneMoyensMoyensNecessaires;

	/**
	 * The cached value of the '{@link #getAPourBaseCalculNecessaire() <em>APour Base Calcul Necessaire</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourBaseCalculNecessaire()
	 * @generated
	 * @ordered
	 */
	protected TypeBaseCalculNecessaire aPourBaseCalculNecessaire;

	/**
	 * The cached value of the '{@link #getEstReferenceParMoyensGenie() <em>Est Reference Par Moyens Genie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstReferenceParMoyensGenie()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation estReferenceParMoyensGenie;

	/**
	 * The cached value of the '{@link #getConcerneEffectifsNecessairesEffectifNecessaire() <em>Concerne Effectifs Necessaires Effectif Necessaire</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneEffectifsNecessairesEffectifNecessaire()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeEffectifNecessaire> concerneEffectifsNecessairesEffectifNecessaire;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeVarianteTravailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeVarianteTravail();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VARIANTE_TRAVAIL__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoVarianteTravailTypeTravail getTypeTravail() {
		return typeTravail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeTravail(TypeDictionaryDicoVarianteTravailTypeTravail newTypeTravail) {
		TypeDictionaryDicoVarianteTravailTypeTravail oldTypeTravail = typeTravail;
		typeTravail = newTypeTravail == null ? TYPE_TRAVAIL_EDEFAULT : newTypeTravail;
		boolean oldTypeTravailESet = typeTravailESet;
		typeTravailESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VARIANTE_TRAVAIL__TYPE_TRAVAIL, oldTypeTravail, typeTravail, !oldTypeTravailESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeTravail() {
		TypeDictionaryDicoVarianteTravailTypeTravail oldTypeTravail = typeTravail;
		boolean oldTypeTravailESet = typeTravailESet;
		typeTravail = TYPE_TRAVAIL_EDEFAULT;
		typeTravailESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_VARIANTE_TRAVAIL__TYPE_TRAVAIL, oldTypeTravail, TYPE_TRAVAIL_EDEFAULT, oldTypeTravailESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeTravail() {
		return typeTravailESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoVarianteTravailTypeGeometrie getTypeGeometrie() {
		return typeGeometrie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeGeometrie(TypeDictionaryDicoVarianteTravailTypeGeometrie newTypeGeometrie) {
		TypeDictionaryDicoVarianteTravailTypeGeometrie oldTypeGeometrie = typeGeometrie;
		typeGeometrie = newTypeGeometrie == null ? TYPE_GEOMETRIE_EDEFAULT : newTypeGeometrie;
		boolean oldTypeGeometrieESet = typeGeometrieESet;
		typeGeometrieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VARIANTE_TRAVAIL__TYPE_GEOMETRIE, oldTypeGeometrie, typeGeometrie, !oldTypeGeometrieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeGeometrie() {
		TypeDictionaryDicoVarianteTravailTypeGeometrie oldTypeGeometrie = typeGeometrie;
		boolean oldTypeGeometrieESet = typeGeometrieESet;
		typeGeometrie = TYPE_GEOMETRIE_EDEFAULT;
		typeGeometrieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_VARIANTE_TRAVAIL__TYPE_GEOMETRIE, oldTypeGeometrie, TYPE_GEOMETRIE_EDEFAULT, oldTypeGeometrieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeGeometrie() {
		return typeGeometrieESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoVarianteTravailTypeCalcul getTypeCalcul() {
		return typeCalcul;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeCalcul(TypeDictionaryDicoVarianteTravailTypeCalcul newTypeCalcul) {
		TypeDictionaryDicoVarianteTravailTypeCalcul oldTypeCalcul = typeCalcul;
		typeCalcul = newTypeCalcul == null ? TYPE_CALCUL_EDEFAULT : newTypeCalcul;
		boolean oldTypeCalculESet = typeCalculESet;
		typeCalculESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VARIANTE_TRAVAIL__TYPE_CALCUL, oldTypeCalcul, typeCalcul, !oldTypeCalculESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeCalcul() {
		TypeDictionaryDicoVarianteTravailTypeCalcul oldTypeCalcul = typeCalcul;
		boolean oldTypeCalculESet = typeCalculESet;
		typeCalcul = TYPE_CALCUL_EDEFAULT;
		typeCalculESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_VARIANTE_TRAVAIL__TYPE_CALCUL, oldTypeCalcul, TYPE_CALCUL_EDEFAULT, oldTypeCalculESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeCalcul() {
		return typeCalculESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLongueurReference() {
		return longueurReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongueurReference(String newLongueurReference) {
		String oldLongueurReference = longueurReference;
		longueurReference = newLongueurReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VARIANTE_TRAVAIL__LONGUEUR_REFERENCE, oldLongueurReference, longueurReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getSurfaceReference() {
		return surfaceReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSurfaceReference(long newSurfaceReference) {
		long oldSurfaceReference = surfaceReference;
		surfaceReference = newSurfaceReference;
		boolean oldSurfaceReferenceESet = surfaceReferenceESet;
		surfaceReferenceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VARIANTE_TRAVAIL__SURFACE_REFERENCE, oldSurfaceReference, surfaceReference, !oldSurfaceReferenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSurfaceReference() {
		long oldSurfaceReference = surfaceReference;
		boolean oldSurfaceReferenceESet = surfaceReferenceESet;
		surfaceReference = SURFACE_REFERENCE_EDEFAULT;
		surfaceReferenceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_VARIANTE_TRAVAIL__SURFACE_REFERENCE, oldSurfaceReference, SURFACE_REFERENCE_EDEFAULT, oldSurfaceReferenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSurfaceReference() {
		return surfaceReferenceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getQuantiteRechargement() {
		return quantiteRechargement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantiteRechargement(long newQuantiteRechargement) {
		long oldQuantiteRechargement = quantiteRechargement;
		quantiteRechargement = newQuantiteRechargement;
		boolean oldQuantiteRechargementESet = quantiteRechargementESet;
		quantiteRechargementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VARIANTE_TRAVAIL__QUANTITE_RECHARGEMENT, oldQuantiteRechargement, quantiteRechargement, !oldQuantiteRechargementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuantiteRechargement() {
		long oldQuantiteRechargement = quantiteRechargement;
		boolean oldQuantiteRechargementESet = quantiteRechargementESet;
		quantiteRechargement = QUANTITE_RECHARGEMENT_EDEFAULT;
		quantiteRechargementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_VARIANTE_TRAVAIL__QUANTITE_RECHARGEMENT, oldQuantiteRechargement, QUANTITE_RECHARGEMENT_EDEFAULT, oldQuantiteRechargementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuantiteRechargement() {
		return quantiteRechargementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getTempsRechargement() {
		return tempsRechargement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTempsRechargement(TypeDataTypeDuree newTempsRechargement, NotificationChain msgs) {
		TypeDataTypeDuree oldTempsRechargement = tempsRechargement;
		tempsRechargement = newTempsRechargement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VARIANTE_TRAVAIL__TEMPS_RECHARGEMENT, oldTempsRechargement, newTempsRechargement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTempsRechargement(TypeDataTypeDuree newTempsRechargement) {
		if (newTempsRechargement != tempsRechargement) {
			NotificationChain msgs = null;
			if (tempsRechargement != null)
				msgs = ((InternalEObject)tempsRechargement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_VARIANTE_TRAVAIL__TEMPS_RECHARGEMENT, null, msgs);
			if (newTempsRechargement != null)
				msgs = ((InternalEObject)newTempsRechargement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_VARIANTE_TRAVAIL__TEMPS_RECHARGEMENT, null, msgs);
			msgs = basicSetTempsRechargement(newTempsRechargement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VARIANTE_TRAVAIL__TEMPS_RECHARGEMENT, newTempsRechargement, newTempsRechargement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommentaire() {
		return commentaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentaire(String newCommentaire) {
		String oldCommentaire = commentaire;
		commentaire = newCommentaire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VARIANTE_TRAVAIL__COMMENTAIRE, oldCommentaire, commentaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAideDeploiementObjetTravail getAidedeploiement() {
		return aidedeploiement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAidedeploiement(TypeDictionaryDicoAideDeploiementObjetTravail newAidedeploiement) {
		TypeDictionaryDicoAideDeploiementObjetTravail oldAidedeploiement = aidedeploiement;
		aidedeploiement = newAidedeploiement == null ? AIDEDEPLOIEMENT_EDEFAULT : newAidedeploiement;
		boolean oldAidedeploiementESet = aidedeploiementESet;
		aidedeploiementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VARIANTE_TRAVAIL__AIDEDEPLOIEMENT, oldAidedeploiement, aidedeploiement, !oldAidedeploiementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAidedeploiement() {
		TypeDictionaryDicoAideDeploiementObjetTravail oldAidedeploiement = aidedeploiement;
		boolean oldAidedeploiementESet = aidedeploiementESet;
		aidedeploiement = AIDEDEPLOIEMENT_EDEFAULT;
		aidedeploiementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_VARIANTE_TRAVAIL__AIDEDEPLOIEMENT, oldAidedeploiement, AIDEDEPLOIEMENT_EDEFAULT, oldAidedeploiementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAidedeploiement() {
		return aidedeploiementESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VARIANTE_TRAVAIL__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VARIANTE_TRAVAIL__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourReferenceAutreTypeSite() {
		return aPourReferenceAutreTypeSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourReferenceAutreTypeSite(TypeAssociation newAPourReferenceAutreTypeSite, NotificationChain msgs) {
		TypeAssociation oldAPourReferenceAutreTypeSite = aPourReferenceAutreTypeSite;
		aPourReferenceAutreTypeSite = newAPourReferenceAutreTypeSite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VARIANTE_TRAVAIL__APOUR_REFERENCE_AUTRE_TYPE_SITE, oldAPourReferenceAutreTypeSite, newAPourReferenceAutreTypeSite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourReferenceAutreTypeSite(TypeAssociation newAPourReferenceAutreTypeSite) {
		if (newAPourReferenceAutreTypeSite != aPourReferenceAutreTypeSite) {
			NotificationChain msgs = null;
			if (aPourReferenceAutreTypeSite != null)
				msgs = ((InternalEObject)aPourReferenceAutreTypeSite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_VARIANTE_TRAVAIL__APOUR_REFERENCE_AUTRE_TYPE_SITE, null, msgs);
			if (newAPourReferenceAutreTypeSite != null)
				msgs = ((InternalEObject)newAPourReferenceAutreTypeSite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_VARIANTE_TRAVAIL__APOUR_REFERENCE_AUTRE_TYPE_SITE, null, msgs);
			msgs = basicSetAPourReferenceAutreTypeSite(newAPourReferenceAutreTypeSite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VARIANTE_TRAVAIL__APOUR_REFERENCE_AUTRE_TYPE_SITE, newAPourReferenceAutreTypeSite, newAPourReferenceAutreTypeSite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourReferenceTypeObstacle() {
		return aPourReferenceTypeObstacle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourReferenceTypeObstacle(TypeAssociation newAPourReferenceTypeObstacle, NotificationChain msgs) {
		TypeAssociation oldAPourReferenceTypeObstacle = aPourReferenceTypeObstacle;
		aPourReferenceTypeObstacle = newAPourReferenceTypeObstacle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VARIANTE_TRAVAIL__APOUR_REFERENCE_TYPE_OBSTACLE, oldAPourReferenceTypeObstacle, newAPourReferenceTypeObstacle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourReferenceTypeObstacle(TypeAssociation newAPourReferenceTypeObstacle) {
		if (newAPourReferenceTypeObstacle != aPourReferenceTypeObstacle) {
			NotificationChain msgs = null;
			if (aPourReferenceTypeObstacle != null)
				msgs = ((InternalEObject)aPourReferenceTypeObstacle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_VARIANTE_TRAVAIL__APOUR_REFERENCE_TYPE_OBSTACLE, null, msgs);
			if (newAPourReferenceTypeObstacle != null)
				msgs = ((InternalEObject)newAPourReferenceTypeObstacle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_VARIANTE_TRAVAIL__APOUR_REFERENCE_TYPE_OBSTACLE, null, msgs);
			msgs = basicSetAPourReferenceTypeObstacle(newAPourReferenceTypeObstacle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VARIANTE_TRAVAIL__APOUR_REFERENCE_TYPE_OBSTACLE, newAPourReferenceTypeObstacle, newAPourReferenceTypeObstacle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMoyensNecessaires> getConcerneMoyensMoyensNecessaires() {
		if (concerneMoyensMoyensNecessaires == null) {
			concerneMoyensMoyensNecessaires = new EObjectContainmentEList<TypeMoyensNecessaires>(TypeMoyensNecessaires.class, this, SchemaPackage.TYPE_VARIANTE_TRAVAIL__CONCERNE_MOYENS_MOYENS_NECESSAIRES);
		}
		return concerneMoyensMoyensNecessaires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeBaseCalculNecessaire getAPourBaseCalculNecessaire() {
		return aPourBaseCalculNecessaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourBaseCalculNecessaire(TypeBaseCalculNecessaire newAPourBaseCalculNecessaire, NotificationChain msgs) {
		TypeBaseCalculNecessaire oldAPourBaseCalculNecessaire = aPourBaseCalculNecessaire;
		aPourBaseCalculNecessaire = newAPourBaseCalculNecessaire;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VARIANTE_TRAVAIL__APOUR_BASE_CALCUL_NECESSAIRE, oldAPourBaseCalculNecessaire, newAPourBaseCalculNecessaire);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourBaseCalculNecessaire(TypeBaseCalculNecessaire newAPourBaseCalculNecessaire) {
		if (newAPourBaseCalculNecessaire != aPourBaseCalculNecessaire) {
			NotificationChain msgs = null;
			if (aPourBaseCalculNecessaire != null)
				msgs = ((InternalEObject)aPourBaseCalculNecessaire).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_VARIANTE_TRAVAIL__APOUR_BASE_CALCUL_NECESSAIRE, null, msgs);
			if (newAPourBaseCalculNecessaire != null)
				msgs = ((InternalEObject)newAPourBaseCalculNecessaire).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_VARIANTE_TRAVAIL__APOUR_BASE_CALCUL_NECESSAIRE, null, msgs);
			msgs = basicSetAPourBaseCalculNecessaire(newAPourBaseCalculNecessaire, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VARIANTE_TRAVAIL__APOUR_BASE_CALCUL_NECESSAIRE, newAPourBaseCalculNecessaire, newAPourBaseCalculNecessaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getEstReferenceParMoyensGenie() {
		return estReferenceParMoyensGenie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstReferenceParMoyensGenie(TypeAssociation newEstReferenceParMoyensGenie, NotificationChain msgs) {
		TypeAssociation oldEstReferenceParMoyensGenie = estReferenceParMoyensGenie;
		estReferenceParMoyensGenie = newEstReferenceParMoyensGenie;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VARIANTE_TRAVAIL__EST_REFERENCE_PAR_MOYENS_GENIE, oldEstReferenceParMoyensGenie, newEstReferenceParMoyensGenie);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstReferenceParMoyensGenie(TypeAssociation newEstReferenceParMoyensGenie) {
		if (newEstReferenceParMoyensGenie != estReferenceParMoyensGenie) {
			NotificationChain msgs = null;
			if (estReferenceParMoyensGenie != null)
				msgs = ((InternalEObject)estReferenceParMoyensGenie).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_VARIANTE_TRAVAIL__EST_REFERENCE_PAR_MOYENS_GENIE, null, msgs);
			if (newEstReferenceParMoyensGenie != null)
				msgs = ((InternalEObject)newEstReferenceParMoyensGenie).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_VARIANTE_TRAVAIL__EST_REFERENCE_PAR_MOYENS_GENIE, null, msgs);
			msgs = basicSetEstReferenceParMoyensGenie(newEstReferenceParMoyensGenie, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VARIANTE_TRAVAIL__EST_REFERENCE_PAR_MOYENS_GENIE, newEstReferenceParMoyensGenie, newEstReferenceParMoyensGenie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEffectifNecessaire> getConcerneEffectifsNecessairesEffectifNecessaire() {
		if (concerneEffectifsNecessairesEffectifNecessaire == null) {
			concerneEffectifsNecessairesEffectifNecessaire = new EObjectContainmentEList<TypeEffectifNecessaire>(TypeEffectifNecessaire.class, this, SchemaPackage.TYPE_VARIANTE_TRAVAIL__CONCERNE_EFFECTIFS_NECESSAIRES_EFFECTIF_NECESSAIRE);
		}
		return concerneEffectifsNecessairesEffectifNecessaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__TEMPS_RECHARGEMENT:
				return basicSetTempsRechargement(null, msgs);
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__APOUR_REFERENCE_AUTRE_TYPE_SITE:
				return basicSetAPourReferenceAutreTypeSite(null, msgs);
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__APOUR_REFERENCE_TYPE_OBSTACLE:
				return basicSetAPourReferenceTypeObstacle(null, msgs);
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__CONCERNE_MOYENS_MOYENS_NECESSAIRES:
				return ((InternalEList<?>)getConcerneMoyensMoyensNecessaires()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__APOUR_BASE_CALCUL_NECESSAIRE:
				return basicSetAPourBaseCalculNecessaire(null, msgs);
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__EST_REFERENCE_PAR_MOYENS_GENIE:
				return basicSetEstReferenceParMoyensGenie(null, msgs);
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__CONCERNE_EFFECTIFS_NECESSAIRES_EFFECTIF_NECESSAIRE:
				return ((InternalEList<?>)getConcerneEffectifsNecessairesEffectifNecessaire()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__NOM:
				return getNom();
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__TYPE_TRAVAIL:
				return getTypeTravail();
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__TYPE_GEOMETRIE:
				return getTypeGeometrie();
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__TYPE_CALCUL:
				return getTypeCalcul();
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__LONGUEUR_REFERENCE:
				return getLongueurReference();
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__SURFACE_REFERENCE:
				return new Long(getSurfaceReference());
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__QUANTITE_RECHARGEMENT:
				return new Long(getQuantiteRechargement());
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__TEMPS_RECHARGEMENT:
				return getTempsRechargement();
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__COMMENTAIRE:
				return getCommentaire();
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__AIDEDEPLOIEMENT:
				return getAidedeploiement();
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__CTE:
				return getCTE();
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__CE:
				return getCE();
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__APOUR_REFERENCE_AUTRE_TYPE_SITE:
				return getAPourReferenceAutreTypeSite();
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__APOUR_REFERENCE_TYPE_OBSTACLE:
				return getAPourReferenceTypeObstacle();
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__CONCERNE_MOYENS_MOYENS_NECESSAIRES:
				return getConcerneMoyensMoyensNecessaires();
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__APOUR_BASE_CALCUL_NECESSAIRE:
				return getAPourBaseCalculNecessaire();
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__EST_REFERENCE_PAR_MOYENS_GENIE:
				return getEstReferenceParMoyensGenie();
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__CONCERNE_EFFECTIFS_NECESSAIRES_EFFECTIF_NECESSAIRE:
				return getConcerneEffectifsNecessairesEffectifNecessaire();
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
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__NOM:
				setNom((String)newValue);
				return;
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__TYPE_TRAVAIL:
				setTypeTravail((TypeDictionaryDicoVarianteTravailTypeTravail)newValue);
				return;
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__TYPE_GEOMETRIE:
				setTypeGeometrie((TypeDictionaryDicoVarianteTravailTypeGeometrie)newValue);
				return;
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__TYPE_CALCUL:
				setTypeCalcul((TypeDictionaryDicoVarianteTravailTypeCalcul)newValue);
				return;
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__LONGUEUR_REFERENCE:
				setLongueurReference((String)newValue);
				return;
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__SURFACE_REFERENCE:
				setSurfaceReference(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__QUANTITE_RECHARGEMENT:
				setQuantiteRechargement(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__TEMPS_RECHARGEMENT:
				setTempsRechargement((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__COMMENTAIRE:
				setCommentaire((String)newValue);
				return;
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__AIDEDEPLOIEMENT:
				setAidedeploiement((TypeDictionaryDicoAideDeploiementObjetTravail)newValue);
				return;
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__APOUR_REFERENCE_AUTRE_TYPE_SITE:
				setAPourReferenceAutreTypeSite((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__APOUR_REFERENCE_TYPE_OBSTACLE:
				setAPourReferenceTypeObstacle((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__CONCERNE_MOYENS_MOYENS_NECESSAIRES:
				getConcerneMoyensMoyensNecessaires().clear();
				getConcerneMoyensMoyensNecessaires().addAll((Collection<? extends TypeMoyensNecessaires>)newValue);
				return;
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__APOUR_BASE_CALCUL_NECESSAIRE:
				setAPourBaseCalculNecessaire((TypeBaseCalculNecessaire)newValue);
				return;
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__EST_REFERENCE_PAR_MOYENS_GENIE:
				setEstReferenceParMoyensGenie((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__CONCERNE_EFFECTIFS_NECESSAIRES_EFFECTIF_NECESSAIRE:
				getConcerneEffectifsNecessairesEffectifNecessaire().clear();
				getConcerneEffectifsNecessairesEffectifNecessaire().addAll((Collection<? extends TypeEffectifNecessaire>)newValue);
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
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__TYPE_TRAVAIL:
				unsetTypeTravail();
				return;
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__TYPE_GEOMETRIE:
				unsetTypeGeometrie();
				return;
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__TYPE_CALCUL:
				unsetTypeCalcul();
				return;
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__LONGUEUR_REFERENCE:
				setLongueurReference(LONGUEUR_REFERENCE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__SURFACE_REFERENCE:
				unsetSurfaceReference();
				return;
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__QUANTITE_RECHARGEMENT:
				unsetQuantiteRechargement();
				return;
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__TEMPS_RECHARGEMENT:
				setTempsRechargement((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__COMMENTAIRE:
				setCommentaire(COMMENTAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__AIDEDEPLOIEMENT:
				unsetAidedeploiement();
				return;
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__APOUR_REFERENCE_AUTRE_TYPE_SITE:
				setAPourReferenceAutreTypeSite((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__APOUR_REFERENCE_TYPE_OBSTACLE:
				setAPourReferenceTypeObstacle((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__CONCERNE_MOYENS_MOYENS_NECESSAIRES:
				getConcerneMoyensMoyensNecessaires().clear();
				return;
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__APOUR_BASE_CALCUL_NECESSAIRE:
				setAPourBaseCalculNecessaire((TypeBaseCalculNecessaire)null);
				return;
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__EST_REFERENCE_PAR_MOYENS_GENIE:
				setEstReferenceParMoyensGenie((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__CONCERNE_EFFECTIFS_NECESSAIRES_EFFECTIF_NECESSAIRE:
				getConcerneEffectifsNecessairesEffectifNecessaire().clear();
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
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__TYPE_TRAVAIL:
				return isSetTypeTravail();
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__TYPE_GEOMETRIE:
				return isSetTypeGeometrie();
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__TYPE_CALCUL:
				return isSetTypeCalcul();
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__LONGUEUR_REFERENCE:
				return LONGUEUR_REFERENCE_EDEFAULT == null ? longueurReference != null : !LONGUEUR_REFERENCE_EDEFAULT.equals(longueurReference);
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__SURFACE_REFERENCE:
				return isSetSurfaceReference();
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__QUANTITE_RECHARGEMENT:
				return isSetQuantiteRechargement();
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__TEMPS_RECHARGEMENT:
				return tempsRechargement != null;
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__COMMENTAIRE:
				return COMMENTAIRE_EDEFAULT == null ? commentaire != null : !COMMENTAIRE_EDEFAULT.equals(commentaire);
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__AIDEDEPLOIEMENT:
				return isSetAidedeploiement();
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__APOUR_REFERENCE_AUTRE_TYPE_SITE:
				return aPourReferenceAutreTypeSite != null;
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__APOUR_REFERENCE_TYPE_OBSTACLE:
				return aPourReferenceTypeObstacle != null;
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__CONCERNE_MOYENS_MOYENS_NECESSAIRES:
				return concerneMoyensMoyensNecessaires != null && !concerneMoyensMoyensNecessaires.isEmpty();
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__APOUR_BASE_CALCUL_NECESSAIRE:
				return aPourBaseCalculNecessaire != null;
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__EST_REFERENCE_PAR_MOYENS_GENIE:
				return estReferenceParMoyensGenie != null;
			case SchemaPackage.TYPE_VARIANTE_TRAVAIL__CONCERNE_EFFECTIFS_NECESSAIRES_EFFECTIF_NECESSAIRE:
				return concerneEffectifsNecessairesEffectifNecessaire != null && !concerneEffectifsNecessairesEffectifNecessaire.isEmpty();
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
		result.append(" (nom: ");
		result.append(nom);
		result.append(", typeTravail: ");
		if (typeTravailESet) result.append(typeTravail); else result.append("<unset>");
		result.append(", typeGeometrie: ");
		if (typeGeometrieESet) result.append(typeGeometrie); else result.append("<unset>");
		result.append(", typeCalcul: ");
		if (typeCalculESet) result.append(typeCalcul); else result.append("<unset>");
		result.append(", longueurReference: ");
		result.append(longueurReference);
		result.append(", surfaceReference: ");
		if (surfaceReferenceESet) result.append(surfaceReference); else result.append("<unset>");
		result.append(", quantiteRechargement: ");
		if (quantiteRechargementESet) result.append(quantiteRechargement); else result.append("<unset>");
		result.append(", commentaire: ");
		result.append(commentaire);
		result.append(", aidedeploiement: ");
		if (aidedeploiementESet) result.append(aidedeploiement); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeVarianteTravailImpl
