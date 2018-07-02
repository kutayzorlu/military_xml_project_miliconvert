/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoChoixCouleur;
import mpia.schema.TypeDictionaryDicoIndicateurGeostatistiqueTypeGraphique;
import mpia.schema.TypeIndicateurGeostatistique;
import mpia.schema.TypeLocalisation;
import mpia.schema.TypeSerieGeostatistique;

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
 * An implementation of the model object '<em><b>Type Indicateur Geostatistique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeIndicateurGeostatistiqueImpl#getIdentifiant <em>Identifiant</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeIndicateurGeostatistiqueImpl#getTypeGraphique <em>Type Graphique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeIndicateurGeostatistiqueImpl#getCouleurValeur1 <em>Couleur Valeur1</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeIndicateurGeostatistiqueImpl#getCouleurValeur2 <em>Couleur Valeur2</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeIndicateurGeostatistiqueImpl#getCouleurValeur3 <em>Couleur Valeur3</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeIndicateurGeostatistiqueImpl#getCouleurValeur4 <em>Couleur Valeur4</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeIndicateurGeostatistiqueImpl#getCouleurValeur5 <em>Couleur Valeur5</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeIndicateurGeostatistiqueImpl#getCouleurValeur6 <em>Couleur Valeur6</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeIndicateurGeostatistiqueImpl#getCouleurValeur7 <em>Couleur Valeur7</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeIndicateurGeostatistiqueImpl#getCouleurValeur8 <em>Couleur Valeur8</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeIndicateurGeostatistiqueImpl#getLibelleValeur1 <em>Libelle Valeur1</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeIndicateurGeostatistiqueImpl#getLibelleValeur2 <em>Libelle Valeur2</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeIndicateurGeostatistiqueImpl#getLibelleValeur3 <em>Libelle Valeur3</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeIndicateurGeostatistiqueImpl#getLibelleValeur4 <em>Libelle Valeur4</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeIndicateurGeostatistiqueImpl#getLibelleValeur5 <em>Libelle Valeur5</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeIndicateurGeostatistiqueImpl#getLibelleValeur6 <em>Libelle Valeur6</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeIndicateurGeostatistiqueImpl#getLibelleValeur7 <em>Libelle Valeur7</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeIndicateurGeostatistiqueImpl#getLibelleValeur8 <em>Libelle Valeur8</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeIndicateurGeostatistiqueImpl#getEpaisseurBarre <em>Epaisseur Barre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeIndicateurGeostatistiqueImpl#getFacteurNormalisation <em>Facteur Normalisation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeIndicateurGeostatistiqueImpl#getHauteurDiametre <em>Hauteur Diametre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeIndicateurGeostatistiqueImpl#getProfondeur3D <em>Profondeur3 D</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeIndicateurGeostatistiqueImpl#getTailleCaseTableau <em>Taille Case Tableau</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeIndicateurGeostatistiqueImpl#getCouleurRGB <em>Couleur RGB</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeIndicateurGeostatistiqueImpl#getListeSeriesSerieGeostatistique <em>Liste Series Serie Geostatistique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeIndicateurGeostatistiqueImpl#getEstLocaliseEnLocalisation <em>Est Localise En Localisation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeIndicateurGeostatistiqueImpl extends TypeRacineOperationnelleImpl implements TypeIndicateurGeostatistique {
	/**
	 * The default value of the '{@link #getIdentifiant() <em>Identifiant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiant()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIANT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifiant() <em>Identifiant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiant()
	 * @generated
	 * @ordered
	 */
	protected String identifiant = IDENTIFIANT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeGraphique() <em>Type Graphique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeGraphique()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoIndicateurGeostatistiqueTypeGraphique TYPE_GRAPHIQUE_EDEFAULT = TypeDictionaryDicoIndicateurGeostatistiqueTypeGraphique.TABLE;

	/**
	 * The cached value of the '{@link #getTypeGraphique() <em>Type Graphique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeGraphique()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoIndicateurGeostatistiqueTypeGraphique typeGraphique = TYPE_GRAPHIQUE_EDEFAULT;

	/**
	 * This is true if the Type Graphique attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeGraphiqueESet;

	/**
	 * The default value of the '{@link #getCouleurValeur1() <em>Couleur Valeur1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouleurValeur1()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoChoixCouleur COULEUR_VALEUR1_EDEFAULT = TypeDictionaryDicoChoixCouleur.AQUAMARINE;

	/**
	 * The cached value of the '{@link #getCouleurValeur1() <em>Couleur Valeur1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouleurValeur1()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoChoixCouleur couleurValeur1 = COULEUR_VALEUR1_EDEFAULT;

	/**
	 * This is true if the Couleur Valeur1 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean couleurValeur1ESet;

	/**
	 * The default value of the '{@link #getCouleurValeur2() <em>Couleur Valeur2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouleurValeur2()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoChoixCouleur COULEUR_VALEUR2_EDEFAULT = TypeDictionaryDicoChoixCouleur.AQUAMARINE;

	/**
	 * The cached value of the '{@link #getCouleurValeur2() <em>Couleur Valeur2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouleurValeur2()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoChoixCouleur couleurValeur2 = COULEUR_VALEUR2_EDEFAULT;

	/**
	 * This is true if the Couleur Valeur2 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean couleurValeur2ESet;

	/**
	 * The default value of the '{@link #getCouleurValeur3() <em>Couleur Valeur3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouleurValeur3()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoChoixCouleur COULEUR_VALEUR3_EDEFAULT = TypeDictionaryDicoChoixCouleur.AQUAMARINE;

	/**
	 * The cached value of the '{@link #getCouleurValeur3() <em>Couleur Valeur3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouleurValeur3()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoChoixCouleur couleurValeur3 = COULEUR_VALEUR3_EDEFAULT;

	/**
	 * This is true if the Couleur Valeur3 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean couleurValeur3ESet;

	/**
	 * The default value of the '{@link #getCouleurValeur4() <em>Couleur Valeur4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouleurValeur4()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoChoixCouleur COULEUR_VALEUR4_EDEFAULT = TypeDictionaryDicoChoixCouleur.AQUAMARINE;

	/**
	 * The cached value of the '{@link #getCouleurValeur4() <em>Couleur Valeur4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouleurValeur4()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoChoixCouleur couleurValeur4 = COULEUR_VALEUR4_EDEFAULT;

	/**
	 * This is true if the Couleur Valeur4 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean couleurValeur4ESet;

	/**
	 * The default value of the '{@link #getCouleurValeur5() <em>Couleur Valeur5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouleurValeur5()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoChoixCouleur COULEUR_VALEUR5_EDEFAULT = TypeDictionaryDicoChoixCouleur.AQUAMARINE;

	/**
	 * The cached value of the '{@link #getCouleurValeur5() <em>Couleur Valeur5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouleurValeur5()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoChoixCouleur couleurValeur5 = COULEUR_VALEUR5_EDEFAULT;

	/**
	 * This is true if the Couleur Valeur5 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean couleurValeur5ESet;

	/**
	 * The default value of the '{@link #getCouleurValeur6() <em>Couleur Valeur6</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouleurValeur6()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoChoixCouleur COULEUR_VALEUR6_EDEFAULT = TypeDictionaryDicoChoixCouleur.AQUAMARINE;

	/**
	 * The cached value of the '{@link #getCouleurValeur6() <em>Couleur Valeur6</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouleurValeur6()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoChoixCouleur couleurValeur6 = COULEUR_VALEUR6_EDEFAULT;

	/**
	 * This is true if the Couleur Valeur6 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean couleurValeur6ESet;

	/**
	 * The default value of the '{@link #getCouleurValeur7() <em>Couleur Valeur7</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouleurValeur7()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoChoixCouleur COULEUR_VALEUR7_EDEFAULT = TypeDictionaryDicoChoixCouleur.AQUAMARINE;

	/**
	 * The cached value of the '{@link #getCouleurValeur7() <em>Couleur Valeur7</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouleurValeur7()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoChoixCouleur couleurValeur7 = COULEUR_VALEUR7_EDEFAULT;

	/**
	 * This is true if the Couleur Valeur7 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean couleurValeur7ESet;

	/**
	 * The default value of the '{@link #getCouleurValeur8() <em>Couleur Valeur8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouleurValeur8()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoChoixCouleur COULEUR_VALEUR8_EDEFAULT = TypeDictionaryDicoChoixCouleur.AQUAMARINE;

	/**
	 * The cached value of the '{@link #getCouleurValeur8() <em>Couleur Valeur8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouleurValeur8()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoChoixCouleur couleurValeur8 = COULEUR_VALEUR8_EDEFAULT;

	/**
	 * This is true if the Couleur Valeur8 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean couleurValeur8ESet;

	/**
	 * The default value of the '{@link #getLibelleValeur1() <em>Libelle Valeur1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibelleValeur1()
	 * @generated
	 * @ordered
	 */
	protected static final String LIBELLE_VALEUR1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLibelleValeur1() <em>Libelle Valeur1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibelleValeur1()
	 * @generated
	 * @ordered
	 */
	protected String libelleValeur1 = LIBELLE_VALEUR1_EDEFAULT;

	/**
	 * The default value of the '{@link #getLibelleValeur2() <em>Libelle Valeur2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibelleValeur2()
	 * @generated
	 * @ordered
	 */
	protected static final String LIBELLE_VALEUR2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLibelleValeur2() <em>Libelle Valeur2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibelleValeur2()
	 * @generated
	 * @ordered
	 */
	protected String libelleValeur2 = LIBELLE_VALEUR2_EDEFAULT;

	/**
	 * The default value of the '{@link #getLibelleValeur3() <em>Libelle Valeur3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibelleValeur3()
	 * @generated
	 * @ordered
	 */
	protected static final String LIBELLE_VALEUR3_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLibelleValeur3() <em>Libelle Valeur3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibelleValeur3()
	 * @generated
	 * @ordered
	 */
	protected String libelleValeur3 = LIBELLE_VALEUR3_EDEFAULT;

	/**
	 * The default value of the '{@link #getLibelleValeur4() <em>Libelle Valeur4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibelleValeur4()
	 * @generated
	 * @ordered
	 */
	protected static final String LIBELLE_VALEUR4_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLibelleValeur4() <em>Libelle Valeur4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibelleValeur4()
	 * @generated
	 * @ordered
	 */
	protected String libelleValeur4 = LIBELLE_VALEUR4_EDEFAULT;

	/**
	 * The default value of the '{@link #getLibelleValeur5() <em>Libelle Valeur5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibelleValeur5()
	 * @generated
	 * @ordered
	 */
	protected static final String LIBELLE_VALEUR5_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLibelleValeur5() <em>Libelle Valeur5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibelleValeur5()
	 * @generated
	 * @ordered
	 */
	protected String libelleValeur5 = LIBELLE_VALEUR5_EDEFAULT;

	/**
	 * The default value of the '{@link #getLibelleValeur6() <em>Libelle Valeur6</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibelleValeur6()
	 * @generated
	 * @ordered
	 */
	protected static final String LIBELLE_VALEUR6_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLibelleValeur6() <em>Libelle Valeur6</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibelleValeur6()
	 * @generated
	 * @ordered
	 */
	protected String libelleValeur6 = LIBELLE_VALEUR6_EDEFAULT;

	/**
	 * The default value of the '{@link #getLibelleValeur7() <em>Libelle Valeur7</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibelleValeur7()
	 * @generated
	 * @ordered
	 */
	protected static final String LIBELLE_VALEUR7_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLibelleValeur7() <em>Libelle Valeur7</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibelleValeur7()
	 * @generated
	 * @ordered
	 */
	protected String libelleValeur7 = LIBELLE_VALEUR7_EDEFAULT;

	/**
	 * The default value of the '{@link #getLibelleValeur8() <em>Libelle Valeur8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibelleValeur8()
	 * @generated
	 * @ordered
	 */
	protected static final String LIBELLE_VALEUR8_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLibelleValeur8() <em>Libelle Valeur8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibelleValeur8()
	 * @generated
	 * @ordered
	 */
	protected String libelleValeur8 = LIBELLE_VALEUR8_EDEFAULT;

	/**
	 * The default value of the '{@link #getEpaisseurBarre() <em>Epaisseur Barre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpaisseurBarre()
	 * @generated
	 * @ordered
	 */
	protected static final long EPAISSEUR_BARRE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getEpaisseurBarre() <em>Epaisseur Barre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpaisseurBarre()
	 * @generated
	 * @ordered
	 */
	protected long epaisseurBarre = EPAISSEUR_BARRE_EDEFAULT;

	/**
	 * This is true if the Epaisseur Barre attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean epaisseurBarreESet;

	/**
	 * The default value of the '{@link #getFacteurNormalisation() <em>Facteur Normalisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacteurNormalisation()
	 * @generated
	 * @ordered
	 */
	protected static final long FACTEUR_NORMALISATION_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getFacteurNormalisation() <em>Facteur Normalisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacteurNormalisation()
	 * @generated
	 * @ordered
	 */
	protected long facteurNormalisation = FACTEUR_NORMALISATION_EDEFAULT;

	/**
	 * This is true if the Facteur Normalisation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean facteurNormalisationESet;

	/**
	 * The default value of the '{@link #getHauteurDiametre() <em>Hauteur Diametre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHauteurDiametre()
	 * @generated
	 * @ordered
	 */
	protected static final long HAUTEUR_DIAMETRE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getHauteurDiametre() <em>Hauteur Diametre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHauteurDiametre()
	 * @generated
	 * @ordered
	 */
	protected long hauteurDiametre = HAUTEUR_DIAMETRE_EDEFAULT;

	/**
	 * This is true if the Hauteur Diametre attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hauteurDiametreESet;

	/**
	 * The default value of the '{@link #getProfondeur3D() <em>Profondeur3 D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfondeur3D()
	 * @generated
	 * @ordered
	 */
	protected static final long PROFONDEUR3_D_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getProfondeur3D() <em>Profondeur3 D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfondeur3D()
	 * @generated
	 * @ordered
	 */
	protected long profondeur3D = PROFONDEUR3_D_EDEFAULT;

	/**
	 * This is true if the Profondeur3 D attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean profondeur3DESet;

	/**
	 * The default value of the '{@link #getTailleCaseTableau() <em>Taille Case Tableau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTailleCaseTableau()
	 * @generated
	 * @ordered
	 */
	protected static final long TAILLE_CASE_TABLEAU_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTailleCaseTableau() <em>Taille Case Tableau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTailleCaseTableau()
	 * @generated
	 * @ordered
	 */
	protected long tailleCaseTableau = TAILLE_CASE_TABLEAU_EDEFAULT;

	/**
	 * This is true if the Taille Case Tableau attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tailleCaseTableauESet;

	/**
	 * The default value of the '{@link #getCouleurRGB() <em>Couleur RGB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouleurRGB()
	 * @generated
	 * @ordered
	 */
	protected static final String COULEUR_RGB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCouleurRGB() <em>Couleur RGB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouleurRGB()
	 * @generated
	 * @ordered
	 */
	protected String couleurRGB = COULEUR_RGB_EDEFAULT;

	/**
	 * The cached value of the '{@link #getListeSeriesSerieGeostatistique() <em>Liste Series Serie Geostatistique</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListeSeriesSerieGeostatistique()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeSerieGeostatistique> listeSeriesSerieGeostatistique;

	/**
	 * The cached value of the '{@link #getEstLocaliseEnLocalisation() <em>Est Localise En Localisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstLocaliseEnLocalisation()
	 * @generated
	 * @ordered
	 */
	protected TypeLocalisation estLocaliseEnLocalisation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeIndicateurGeostatistiqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeIndicateurGeostatistique();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifiant() {
		return identifiant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifiant(String newIdentifiant) {
		String oldIdentifiant = identifiant;
		identifiant = newIdentifiant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__IDENTIFIANT, oldIdentifiant, identifiant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoIndicateurGeostatistiqueTypeGraphique getTypeGraphique() {
		return typeGraphique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeGraphique(TypeDictionaryDicoIndicateurGeostatistiqueTypeGraphique newTypeGraphique) {
		TypeDictionaryDicoIndicateurGeostatistiqueTypeGraphique oldTypeGraphique = typeGraphique;
		typeGraphique = newTypeGraphique == null ? TYPE_GRAPHIQUE_EDEFAULT : newTypeGraphique;
		boolean oldTypeGraphiqueESet = typeGraphiqueESet;
		typeGraphiqueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__TYPE_GRAPHIQUE, oldTypeGraphique, typeGraphique, !oldTypeGraphiqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeGraphique() {
		TypeDictionaryDicoIndicateurGeostatistiqueTypeGraphique oldTypeGraphique = typeGraphique;
		boolean oldTypeGraphiqueESet = typeGraphiqueESet;
		typeGraphique = TYPE_GRAPHIQUE_EDEFAULT;
		typeGraphiqueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__TYPE_GRAPHIQUE, oldTypeGraphique, TYPE_GRAPHIQUE_EDEFAULT, oldTypeGraphiqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeGraphique() {
		return typeGraphiqueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoChoixCouleur getCouleurValeur1() {
		return couleurValeur1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCouleurValeur1(TypeDictionaryDicoChoixCouleur newCouleurValeur1) {
		TypeDictionaryDicoChoixCouleur oldCouleurValeur1 = couleurValeur1;
		couleurValeur1 = newCouleurValeur1 == null ? COULEUR_VALEUR1_EDEFAULT : newCouleurValeur1;
		boolean oldCouleurValeur1ESet = couleurValeur1ESet;
		couleurValeur1ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_VALEUR1, oldCouleurValeur1, couleurValeur1, !oldCouleurValeur1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCouleurValeur1() {
		TypeDictionaryDicoChoixCouleur oldCouleurValeur1 = couleurValeur1;
		boolean oldCouleurValeur1ESet = couleurValeur1ESet;
		couleurValeur1 = COULEUR_VALEUR1_EDEFAULT;
		couleurValeur1ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_VALEUR1, oldCouleurValeur1, COULEUR_VALEUR1_EDEFAULT, oldCouleurValeur1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCouleurValeur1() {
		return couleurValeur1ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoChoixCouleur getCouleurValeur2() {
		return couleurValeur2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCouleurValeur2(TypeDictionaryDicoChoixCouleur newCouleurValeur2) {
		TypeDictionaryDicoChoixCouleur oldCouleurValeur2 = couleurValeur2;
		couleurValeur2 = newCouleurValeur2 == null ? COULEUR_VALEUR2_EDEFAULT : newCouleurValeur2;
		boolean oldCouleurValeur2ESet = couleurValeur2ESet;
		couleurValeur2ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_VALEUR2, oldCouleurValeur2, couleurValeur2, !oldCouleurValeur2ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCouleurValeur2() {
		TypeDictionaryDicoChoixCouleur oldCouleurValeur2 = couleurValeur2;
		boolean oldCouleurValeur2ESet = couleurValeur2ESet;
		couleurValeur2 = COULEUR_VALEUR2_EDEFAULT;
		couleurValeur2ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_VALEUR2, oldCouleurValeur2, COULEUR_VALEUR2_EDEFAULT, oldCouleurValeur2ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCouleurValeur2() {
		return couleurValeur2ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoChoixCouleur getCouleurValeur3() {
		return couleurValeur3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCouleurValeur3(TypeDictionaryDicoChoixCouleur newCouleurValeur3) {
		TypeDictionaryDicoChoixCouleur oldCouleurValeur3 = couleurValeur3;
		couleurValeur3 = newCouleurValeur3 == null ? COULEUR_VALEUR3_EDEFAULT : newCouleurValeur3;
		boolean oldCouleurValeur3ESet = couleurValeur3ESet;
		couleurValeur3ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_VALEUR3, oldCouleurValeur3, couleurValeur3, !oldCouleurValeur3ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCouleurValeur3() {
		TypeDictionaryDicoChoixCouleur oldCouleurValeur3 = couleurValeur3;
		boolean oldCouleurValeur3ESet = couleurValeur3ESet;
		couleurValeur3 = COULEUR_VALEUR3_EDEFAULT;
		couleurValeur3ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_VALEUR3, oldCouleurValeur3, COULEUR_VALEUR3_EDEFAULT, oldCouleurValeur3ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCouleurValeur3() {
		return couleurValeur3ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoChoixCouleur getCouleurValeur4() {
		return couleurValeur4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCouleurValeur4(TypeDictionaryDicoChoixCouleur newCouleurValeur4) {
		TypeDictionaryDicoChoixCouleur oldCouleurValeur4 = couleurValeur4;
		couleurValeur4 = newCouleurValeur4 == null ? COULEUR_VALEUR4_EDEFAULT : newCouleurValeur4;
		boolean oldCouleurValeur4ESet = couleurValeur4ESet;
		couleurValeur4ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_VALEUR4, oldCouleurValeur4, couleurValeur4, !oldCouleurValeur4ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCouleurValeur4() {
		TypeDictionaryDicoChoixCouleur oldCouleurValeur4 = couleurValeur4;
		boolean oldCouleurValeur4ESet = couleurValeur4ESet;
		couleurValeur4 = COULEUR_VALEUR4_EDEFAULT;
		couleurValeur4ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_VALEUR4, oldCouleurValeur4, COULEUR_VALEUR4_EDEFAULT, oldCouleurValeur4ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCouleurValeur4() {
		return couleurValeur4ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoChoixCouleur getCouleurValeur5() {
		return couleurValeur5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCouleurValeur5(TypeDictionaryDicoChoixCouleur newCouleurValeur5) {
		TypeDictionaryDicoChoixCouleur oldCouleurValeur5 = couleurValeur5;
		couleurValeur5 = newCouleurValeur5 == null ? COULEUR_VALEUR5_EDEFAULT : newCouleurValeur5;
		boolean oldCouleurValeur5ESet = couleurValeur5ESet;
		couleurValeur5ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_VALEUR5, oldCouleurValeur5, couleurValeur5, !oldCouleurValeur5ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCouleurValeur5() {
		TypeDictionaryDicoChoixCouleur oldCouleurValeur5 = couleurValeur5;
		boolean oldCouleurValeur5ESet = couleurValeur5ESet;
		couleurValeur5 = COULEUR_VALEUR5_EDEFAULT;
		couleurValeur5ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_VALEUR5, oldCouleurValeur5, COULEUR_VALEUR5_EDEFAULT, oldCouleurValeur5ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCouleurValeur5() {
		return couleurValeur5ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoChoixCouleur getCouleurValeur6() {
		return couleurValeur6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCouleurValeur6(TypeDictionaryDicoChoixCouleur newCouleurValeur6) {
		TypeDictionaryDicoChoixCouleur oldCouleurValeur6 = couleurValeur6;
		couleurValeur6 = newCouleurValeur6 == null ? COULEUR_VALEUR6_EDEFAULT : newCouleurValeur6;
		boolean oldCouleurValeur6ESet = couleurValeur6ESet;
		couleurValeur6ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_VALEUR6, oldCouleurValeur6, couleurValeur6, !oldCouleurValeur6ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCouleurValeur6() {
		TypeDictionaryDicoChoixCouleur oldCouleurValeur6 = couleurValeur6;
		boolean oldCouleurValeur6ESet = couleurValeur6ESet;
		couleurValeur6 = COULEUR_VALEUR6_EDEFAULT;
		couleurValeur6ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_VALEUR6, oldCouleurValeur6, COULEUR_VALEUR6_EDEFAULT, oldCouleurValeur6ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCouleurValeur6() {
		return couleurValeur6ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoChoixCouleur getCouleurValeur7() {
		return couleurValeur7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCouleurValeur7(TypeDictionaryDicoChoixCouleur newCouleurValeur7) {
		TypeDictionaryDicoChoixCouleur oldCouleurValeur7 = couleurValeur7;
		couleurValeur7 = newCouleurValeur7 == null ? COULEUR_VALEUR7_EDEFAULT : newCouleurValeur7;
		boolean oldCouleurValeur7ESet = couleurValeur7ESet;
		couleurValeur7ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_VALEUR7, oldCouleurValeur7, couleurValeur7, !oldCouleurValeur7ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCouleurValeur7() {
		TypeDictionaryDicoChoixCouleur oldCouleurValeur7 = couleurValeur7;
		boolean oldCouleurValeur7ESet = couleurValeur7ESet;
		couleurValeur7 = COULEUR_VALEUR7_EDEFAULT;
		couleurValeur7ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_VALEUR7, oldCouleurValeur7, COULEUR_VALEUR7_EDEFAULT, oldCouleurValeur7ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCouleurValeur7() {
		return couleurValeur7ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoChoixCouleur getCouleurValeur8() {
		return couleurValeur8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCouleurValeur8(TypeDictionaryDicoChoixCouleur newCouleurValeur8) {
		TypeDictionaryDicoChoixCouleur oldCouleurValeur8 = couleurValeur8;
		couleurValeur8 = newCouleurValeur8 == null ? COULEUR_VALEUR8_EDEFAULT : newCouleurValeur8;
		boolean oldCouleurValeur8ESet = couleurValeur8ESet;
		couleurValeur8ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_VALEUR8, oldCouleurValeur8, couleurValeur8, !oldCouleurValeur8ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCouleurValeur8() {
		TypeDictionaryDicoChoixCouleur oldCouleurValeur8 = couleurValeur8;
		boolean oldCouleurValeur8ESet = couleurValeur8ESet;
		couleurValeur8 = COULEUR_VALEUR8_EDEFAULT;
		couleurValeur8ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_VALEUR8, oldCouleurValeur8, COULEUR_VALEUR8_EDEFAULT, oldCouleurValeur8ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCouleurValeur8() {
		return couleurValeur8ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLibelleValeur1() {
		return libelleValeur1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibelleValeur1(String newLibelleValeur1) {
		String oldLibelleValeur1 = libelleValeur1;
		libelleValeur1 = newLibelleValeur1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__LIBELLE_VALEUR1, oldLibelleValeur1, libelleValeur1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLibelleValeur2() {
		return libelleValeur2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibelleValeur2(String newLibelleValeur2) {
		String oldLibelleValeur2 = libelleValeur2;
		libelleValeur2 = newLibelleValeur2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__LIBELLE_VALEUR2, oldLibelleValeur2, libelleValeur2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLibelleValeur3() {
		return libelleValeur3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibelleValeur3(String newLibelleValeur3) {
		String oldLibelleValeur3 = libelleValeur3;
		libelleValeur3 = newLibelleValeur3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__LIBELLE_VALEUR3, oldLibelleValeur3, libelleValeur3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLibelleValeur4() {
		return libelleValeur4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibelleValeur4(String newLibelleValeur4) {
		String oldLibelleValeur4 = libelleValeur4;
		libelleValeur4 = newLibelleValeur4;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__LIBELLE_VALEUR4, oldLibelleValeur4, libelleValeur4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLibelleValeur5() {
		return libelleValeur5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibelleValeur5(String newLibelleValeur5) {
		String oldLibelleValeur5 = libelleValeur5;
		libelleValeur5 = newLibelleValeur5;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__LIBELLE_VALEUR5, oldLibelleValeur5, libelleValeur5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLibelleValeur6() {
		return libelleValeur6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibelleValeur6(String newLibelleValeur6) {
		String oldLibelleValeur6 = libelleValeur6;
		libelleValeur6 = newLibelleValeur6;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__LIBELLE_VALEUR6, oldLibelleValeur6, libelleValeur6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLibelleValeur7() {
		return libelleValeur7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibelleValeur7(String newLibelleValeur7) {
		String oldLibelleValeur7 = libelleValeur7;
		libelleValeur7 = newLibelleValeur7;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__LIBELLE_VALEUR7, oldLibelleValeur7, libelleValeur7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLibelleValeur8() {
		return libelleValeur8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibelleValeur8(String newLibelleValeur8) {
		String oldLibelleValeur8 = libelleValeur8;
		libelleValeur8 = newLibelleValeur8;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__LIBELLE_VALEUR8, oldLibelleValeur8, libelleValeur8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getEpaisseurBarre() {
		return epaisseurBarre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEpaisseurBarre(long newEpaisseurBarre) {
		long oldEpaisseurBarre = epaisseurBarre;
		epaisseurBarre = newEpaisseurBarre;
		boolean oldEpaisseurBarreESet = epaisseurBarreESet;
		epaisseurBarreESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__EPAISSEUR_BARRE, oldEpaisseurBarre, epaisseurBarre, !oldEpaisseurBarreESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEpaisseurBarre() {
		long oldEpaisseurBarre = epaisseurBarre;
		boolean oldEpaisseurBarreESet = epaisseurBarreESet;
		epaisseurBarre = EPAISSEUR_BARRE_EDEFAULT;
		epaisseurBarreESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__EPAISSEUR_BARRE, oldEpaisseurBarre, EPAISSEUR_BARRE_EDEFAULT, oldEpaisseurBarreESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEpaisseurBarre() {
		return epaisseurBarreESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getFacteurNormalisation() {
		return facteurNormalisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFacteurNormalisation(long newFacteurNormalisation) {
		long oldFacteurNormalisation = facteurNormalisation;
		facteurNormalisation = newFacteurNormalisation;
		boolean oldFacteurNormalisationESet = facteurNormalisationESet;
		facteurNormalisationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__FACTEUR_NORMALISATION, oldFacteurNormalisation, facteurNormalisation, !oldFacteurNormalisationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFacteurNormalisation() {
		long oldFacteurNormalisation = facteurNormalisation;
		boolean oldFacteurNormalisationESet = facteurNormalisationESet;
		facteurNormalisation = FACTEUR_NORMALISATION_EDEFAULT;
		facteurNormalisationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__FACTEUR_NORMALISATION, oldFacteurNormalisation, FACTEUR_NORMALISATION_EDEFAULT, oldFacteurNormalisationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFacteurNormalisation() {
		return facteurNormalisationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getHauteurDiametre() {
		return hauteurDiametre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHauteurDiametre(long newHauteurDiametre) {
		long oldHauteurDiametre = hauteurDiametre;
		hauteurDiametre = newHauteurDiametre;
		boolean oldHauteurDiametreESet = hauteurDiametreESet;
		hauteurDiametreESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__HAUTEUR_DIAMETRE, oldHauteurDiametre, hauteurDiametre, !oldHauteurDiametreESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHauteurDiametre() {
		long oldHauteurDiametre = hauteurDiametre;
		boolean oldHauteurDiametreESet = hauteurDiametreESet;
		hauteurDiametre = HAUTEUR_DIAMETRE_EDEFAULT;
		hauteurDiametreESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__HAUTEUR_DIAMETRE, oldHauteurDiametre, HAUTEUR_DIAMETRE_EDEFAULT, oldHauteurDiametreESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHauteurDiametre() {
		return hauteurDiametreESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getProfondeur3D() {
		return profondeur3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfondeur3D(long newProfondeur3D) {
		long oldProfondeur3D = profondeur3D;
		profondeur3D = newProfondeur3D;
		boolean oldProfondeur3DESet = profondeur3DESet;
		profondeur3DESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__PROFONDEUR3_D, oldProfondeur3D, profondeur3D, !oldProfondeur3DESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProfondeur3D() {
		long oldProfondeur3D = profondeur3D;
		boolean oldProfondeur3DESet = profondeur3DESet;
		profondeur3D = PROFONDEUR3_D_EDEFAULT;
		profondeur3DESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__PROFONDEUR3_D, oldProfondeur3D, PROFONDEUR3_D_EDEFAULT, oldProfondeur3DESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProfondeur3D() {
		return profondeur3DESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTailleCaseTableau() {
		return tailleCaseTableau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTailleCaseTableau(long newTailleCaseTableau) {
		long oldTailleCaseTableau = tailleCaseTableau;
		tailleCaseTableau = newTailleCaseTableau;
		boolean oldTailleCaseTableauESet = tailleCaseTableauESet;
		tailleCaseTableauESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__TAILLE_CASE_TABLEAU, oldTailleCaseTableau, tailleCaseTableau, !oldTailleCaseTableauESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTailleCaseTableau() {
		long oldTailleCaseTableau = tailleCaseTableau;
		boolean oldTailleCaseTableauESet = tailleCaseTableauESet;
		tailleCaseTableau = TAILLE_CASE_TABLEAU_EDEFAULT;
		tailleCaseTableauESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__TAILLE_CASE_TABLEAU, oldTailleCaseTableau, TAILLE_CASE_TABLEAU_EDEFAULT, oldTailleCaseTableauESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTailleCaseTableau() {
		return tailleCaseTableauESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCouleurRGB() {
		return couleurRGB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCouleurRGB(String newCouleurRGB) {
		String oldCouleurRGB = couleurRGB;
		couleurRGB = newCouleurRGB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_RGB, oldCouleurRGB, couleurRGB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeSerieGeostatistique> getListeSeriesSerieGeostatistique() {
		if (listeSeriesSerieGeostatistique == null) {
			listeSeriesSerieGeostatistique = new EObjectContainmentEList<TypeSerieGeostatistique>(TypeSerieGeostatistique.class, this, SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__LISTE_SERIES_SERIE_GEOSTATISTIQUE);
		}
		return listeSeriesSerieGeostatistique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeLocalisation getEstLocaliseEnLocalisation() {
		return estLocaliseEnLocalisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstLocaliseEnLocalisation(TypeLocalisation newEstLocaliseEnLocalisation, NotificationChain msgs) {
		TypeLocalisation oldEstLocaliseEnLocalisation = estLocaliseEnLocalisation;
		estLocaliseEnLocalisation = newEstLocaliseEnLocalisation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__EST_LOCALISE_EN_LOCALISATION, oldEstLocaliseEnLocalisation, newEstLocaliseEnLocalisation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstLocaliseEnLocalisation(TypeLocalisation newEstLocaliseEnLocalisation) {
		if (newEstLocaliseEnLocalisation != estLocaliseEnLocalisation) {
			NotificationChain msgs = null;
			if (estLocaliseEnLocalisation != null)
				msgs = ((InternalEObject)estLocaliseEnLocalisation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__EST_LOCALISE_EN_LOCALISATION, null, msgs);
			if (newEstLocaliseEnLocalisation != null)
				msgs = ((InternalEObject)newEstLocaliseEnLocalisation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__EST_LOCALISE_EN_LOCALISATION, null, msgs);
			msgs = basicSetEstLocaliseEnLocalisation(newEstLocaliseEnLocalisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__EST_LOCALISE_EN_LOCALISATION, newEstLocaliseEnLocalisation, newEstLocaliseEnLocalisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__LISTE_SERIES_SERIE_GEOSTATISTIQUE:
				return ((InternalEList<?>)getListeSeriesSerieGeostatistique()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__EST_LOCALISE_EN_LOCALISATION:
				return basicSetEstLocaliseEnLocalisation(null, msgs);
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
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__IDENTIFIANT:
				return getIdentifiant();
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__TYPE_GRAPHIQUE:
				return getTypeGraphique();
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_VALEUR1:
				return getCouleurValeur1();
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_VALEUR2:
				return getCouleurValeur2();
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_VALEUR3:
				return getCouleurValeur3();
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_VALEUR4:
				return getCouleurValeur4();
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_VALEUR5:
				return getCouleurValeur5();
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_VALEUR6:
				return getCouleurValeur6();
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_VALEUR7:
				return getCouleurValeur7();
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_VALEUR8:
				return getCouleurValeur8();
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__LIBELLE_VALEUR1:
				return getLibelleValeur1();
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__LIBELLE_VALEUR2:
				return getLibelleValeur2();
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__LIBELLE_VALEUR3:
				return getLibelleValeur3();
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__LIBELLE_VALEUR4:
				return getLibelleValeur4();
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__LIBELLE_VALEUR5:
				return getLibelleValeur5();
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__LIBELLE_VALEUR6:
				return getLibelleValeur6();
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__LIBELLE_VALEUR7:
				return getLibelleValeur7();
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__LIBELLE_VALEUR8:
				return getLibelleValeur8();
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__EPAISSEUR_BARRE:
				return new Long(getEpaisseurBarre());
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__FACTEUR_NORMALISATION:
				return new Long(getFacteurNormalisation());
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__HAUTEUR_DIAMETRE:
				return new Long(getHauteurDiametre());
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__PROFONDEUR3_D:
				return new Long(getProfondeur3D());
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__TAILLE_CASE_TABLEAU:
				return new Long(getTailleCaseTableau());
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_RGB:
				return getCouleurRGB();
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__LISTE_SERIES_SERIE_GEOSTATISTIQUE:
				return getListeSeriesSerieGeostatistique();
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__EST_LOCALISE_EN_LOCALISATION:
				return getEstLocaliseEnLocalisation();
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
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__IDENTIFIANT:
				setIdentifiant((String)newValue);
				return;
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__TYPE_GRAPHIQUE:
				setTypeGraphique((TypeDictionaryDicoIndicateurGeostatistiqueTypeGraphique)newValue);
				return;
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_VALEUR1:
				setCouleurValeur1((TypeDictionaryDicoChoixCouleur)newValue);
				return;
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_VALEUR2:
				setCouleurValeur2((TypeDictionaryDicoChoixCouleur)newValue);
				return;
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_VALEUR3:
				setCouleurValeur3((TypeDictionaryDicoChoixCouleur)newValue);
				return;
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_VALEUR4:
				setCouleurValeur4((TypeDictionaryDicoChoixCouleur)newValue);
				return;
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_VALEUR5:
				setCouleurValeur5((TypeDictionaryDicoChoixCouleur)newValue);
				return;
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_VALEUR6:
				setCouleurValeur6((TypeDictionaryDicoChoixCouleur)newValue);
				return;
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_VALEUR7:
				setCouleurValeur7((TypeDictionaryDicoChoixCouleur)newValue);
				return;
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_VALEUR8:
				setCouleurValeur8((TypeDictionaryDicoChoixCouleur)newValue);
				return;
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__LIBELLE_VALEUR1:
				setLibelleValeur1((String)newValue);
				return;
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__LIBELLE_VALEUR2:
				setLibelleValeur2((String)newValue);
				return;
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__LIBELLE_VALEUR3:
				setLibelleValeur3((String)newValue);
				return;
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__LIBELLE_VALEUR4:
				setLibelleValeur4((String)newValue);
				return;
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__LIBELLE_VALEUR5:
				setLibelleValeur5((String)newValue);
				return;
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__LIBELLE_VALEUR6:
				setLibelleValeur6((String)newValue);
				return;
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__LIBELLE_VALEUR7:
				setLibelleValeur7((String)newValue);
				return;
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__LIBELLE_VALEUR8:
				setLibelleValeur8((String)newValue);
				return;
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__EPAISSEUR_BARRE:
				setEpaisseurBarre(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__FACTEUR_NORMALISATION:
				setFacteurNormalisation(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__HAUTEUR_DIAMETRE:
				setHauteurDiametre(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__PROFONDEUR3_D:
				setProfondeur3D(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__TAILLE_CASE_TABLEAU:
				setTailleCaseTableau(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_RGB:
				setCouleurRGB((String)newValue);
				return;
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__LISTE_SERIES_SERIE_GEOSTATISTIQUE:
				getListeSeriesSerieGeostatistique().clear();
				getListeSeriesSerieGeostatistique().addAll((Collection<? extends TypeSerieGeostatistique>)newValue);
				return;
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__EST_LOCALISE_EN_LOCALISATION:
				setEstLocaliseEnLocalisation((TypeLocalisation)newValue);
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
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__IDENTIFIANT:
				setIdentifiant(IDENTIFIANT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__TYPE_GRAPHIQUE:
				unsetTypeGraphique();
				return;
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_VALEUR1:
				unsetCouleurValeur1();
				return;
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_VALEUR2:
				unsetCouleurValeur2();
				return;
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_VALEUR3:
				unsetCouleurValeur3();
				return;
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_VALEUR4:
				unsetCouleurValeur4();
				return;
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_VALEUR5:
				unsetCouleurValeur5();
				return;
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_VALEUR6:
				unsetCouleurValeur6();
				return;
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_VALEUR7:
				unsetCouleurValeur7();
				return;
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_VALEUR8:
				unsetCouleurValeur8();
				return;
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__LIBELLE_VALEUR1:
				setLibelleValeur1(LIBELLE_VALEUR1_EDEFAULT);
				return;
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__LIBELLE_VALEUR2:
				setLibelleValeur2(LIBELLE_VALEUR2_EDEFAULT);
				return;
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__LIBELLE_VALEUR3:
				setLibelleValeur3(LIBELLE_VALEUR3_EDEFAULT);
				return;
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__LIBELLE_VALEUR4:
				setLibelleValeur4(LIBELLE_VALEUR4_EDEFAULT);
				return;
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__LIBELLE_VALEUR5:
				setLibelleValeur5(LIBELLE_VALEUR5_EDEFAULT);
				return;
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__LIBELLE_VALEUR6:
				setLibelleValeur6(LIBELLE_VALEUR6_EDEFAULT);
				return;
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__LIBELLE_VALEUR7:
				setLibelleValeur7(LIBELLE_VALEUR7_EDEFAULT);
				return;
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__LIBELLE_VALEUR8:
				setLibelleValeur8(LIBELLE_VALEUR8_EDEFAULT);
				return;
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__EPAISSEUR_BARRE:
				unsetEpaisseurBarre();
				return;
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__FACTEUR_NORMALISATION:
				unsetFacteurNormalisation();
				return;
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__HAUTEUR_DIAMETRE:
				unsetHauteurDiametre();
				return;
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__PROFONDEUR3_D:
				unsetProfondeur3D();
				return;
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__TAILLE_CASE_TABLEAU:
				unsetTailleCaseTableau();
				return;
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_RGB:
				setCouleurRGB(COULEUR_RGB_EDEFAULT);
				return;
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__LISTE_SERIES_SERIE_GEOSTATISTIQUE:
				getListeSeriesSerieGeostatistique().clear();
				return;
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__EST_LOCALISE_EN_LOCALISATION:
				setEstLocaliseEnLocalisation((TypeLocalisation)null);
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
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__IDENTIFIANT:
				return IDENTIFIANT_EDEFAULT == null ? identifiant != null : !IDENTIFIANT_EDEFAULT.equals(identifiant);
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__TYPE_GRAPHIQUE:
				return isSetTypeGraphique();
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_VALEUR1:
				return isSetCouleurValeur1();
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_VALEUR2:
				return isSetCouleurValeur2();
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_VALEUR3:
				return isSetCouleurValeur3();
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_VALEUR4:
				return isSetCouleurValeur4();
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_VALEUR5:
				return isSetCouleurValeur5();
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_VALEUR6:
				return isSetCouleurValeur6();
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_VALEUR7:
				return isSetCouleurValeur7();
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_VALEUR8:
				return isSetCouleurValeur8();
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__LIBELLE_VALEUR1:
				return LIBELLE_VALEUR1_EDEFAULT == null ? libelleValeur1 != null : !LIBELLE_VALEUR1_EDEFAULT.equals(libelleValeur1);
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__LIBELLE_VALEUR2:
				return LIBELLE_VALEUR2_EDEFAULT == null ? libelleValeur2 != null : !LIBELLE_VALEUR2_EDEFAULT.equals(libelleValeur2);
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__LIBELLE_VALEUR3:
				return LIBELLE_VALEUR3_EDEFAULT == null ? libelleValeur3 != null : !LIBELLE_VALEUR3_EDEFAULT.equals(libelleValeur3);
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__LIBELLE_VALEUR4:
				return LIBELLE_VALEUR4_EDEFAULT == null ? libelleValeur4 != null : !LIBELLE_VALEUR4_EDEFAULT.equals(libelleValeur4);
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__LIBELLE_VALEUR5:
				return LIBELLE_VALEUR5_EDEFAULT == null ? libelleValeur5 != null : !LIBELLE_VALEUR5_EDEFAULT.equals(libelleValeur5);
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__LIBELLE_VALEUR6:
				return LIBELLE_VALEUR6_EDEFAULT == null ? libelleValeur6 != null : !LIBELLE_VALEUR6_EDEFAULT.equals(libelleValeur6);
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__LIBELLE_VALEUR7:
				return LIBELLE_VALEUR7_EDEFAULT == null ? libelleValeur7 != null : !LIBELLE_VALEUR7_EDEFAULT.equals(libelleValeur7);
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__LIBELLE_VALEUR8:
				return LIBELLE_VALEUR8_EDEFAULT == null ? libelleValeur8 != null : !LIBELLE_VALEUR8_EDEFAULT.equals(libelleValeur8);
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__EPAISSEUR_BARRE:
				return isSetEpaisseurBarre();
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__FACTEUR_NORMALISATION:
				return isSetFacteurNormalisation();
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__HAUTEUR_DIAMETRE:
				return isSetHauteurDiametre();
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__PROFONDEUR3_D:
				return isSetProfondeur3D();
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__TAILLE_CASE_TABLEAU:
				return isSetTailleCaseTableau();
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__COULEUR_RGB:
				return COULEUR_RGB_EDEFAULT == null ? couleurRGB != null : !COULEUR_RGB_EDEFAULT.equals(couleurRGB);
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__LISTE_SERIES_SERIE_GEOSTATISTIQUE:
				return listeSeriesSerieGeostatistique != null && !listeSeriesSerieGeostatistique.isEmpty();
			case SchemaPackage.TYPE_INDICATEUR_GEOSTATISTIQUE__EST_LOCALISE_EN_LOCALISATION:
				return estLocaliseEnLocalisation != null;
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
		result.append(" (identifiant: ");
		result.append(identifiant);
		result.append(", typeGraphique: ");
		if (typeGraphiqueESet) result.append(typeGraphique); else result.append("<unset>");
		result.append(", couleurValeur1: ");
		if (couleurValeur1ESet) result.append(couleurValeur1); else result.append("<unset>");
		result.append(", couleurValeur2: ");
		if (couleurValeur2ESet) result.append(couleurValeur2); else result.append("<unset>");
		result.append(", couleurValeur3: ");
		if (couleurValeur3ESet) result.append(couleurValeur3); else result.append("<unset>");
		result.append(", couleurValeur4: ");
		if (couleurValeur4ESet) result.append(couleurValeur4); else result.append("<unset>");
		result.append(", couleurValeur5: ");
		if (couleurValeur5ESet) result.append(couleurValeur5); else result.append("<unset>");
		result.append(", couleurValeur6: ");
		if (couleurValeur6ESet) result.append(couleurValeur6); else result.append("<unset>");
		result.append(", couleurValeur7: ");
		if (couleurValeur7ESet) result.append(couleurValeur7); else result.append("<unset>");
		result.append(", couleurValeur8: ");
		if (couleurValeur8ESet) result.append(couleurValeur8); else result.append("<unset>");
		result.append(", libelleValeur1: ");
		result.append(libelleValeur1);
		result.append(", libelleValeur2: ");
		result.append(libelleValeur2);
		result.append(", libelleValeur3: ");
		result.append(libelleValeur3);
		result.append(", libelleValeur4: ");
		result.append(libelleValeur4);
		result.append(", libelleValeur5: ");
		result.append(libelleValeur5);
		result.append(", libelleValeur6: ");
		result.append(libelleValeur6);
		result.append(", libelleValeur7: ");
		result.append(libelleValeur7);
		result.append(", libelleValeur8: ");
		result.append(libelleValeur8);
		result.append(", epaisseurBarre: ");
		if (epaisseurBarreESet) result.append(epaisseurBarre); else result.append("<unset>");
		result.append(", facteurNormalisation: ");
		if (facteurNormalisationESet) result.append(facteurNormalisation); else result.append("<unset>");
		result.append(", hauteurDiametre: ");
		if (hauteurDiametreESet) result.append(hauteurDiametre); else result.append("<unset>");
		result.append(", profondeur3D: ");
		if (profondeur3DESet) result.append(profondeur3D); else result.append("<unset>");
		result.append(", tailleCaseTableau: ");
		if (tailleCaseTableauESet) result.append(tailleCaseTableau); else result.append("<unset>");
		result.append(", couleurRGB: ");
		result.append(couleurRGB);
		result.append(')');
		return result.toString();
	}

} //TypeIndicateurGeostatistiqueImpl
