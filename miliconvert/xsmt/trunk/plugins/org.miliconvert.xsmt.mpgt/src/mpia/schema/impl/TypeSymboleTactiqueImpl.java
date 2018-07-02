/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;
import mpia.meta.TypeDataTypeAngle;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeBrancheEurogrid;
import mpia.schema.TypeDictionaryDicoCouleur;
import mpia.schema.TypeDictionaryDicoNiveau;
import mpia.schema.TypeDictionaryDicoSymboleTactiqueEchelle;
import mpia.schema.TypeDictionaryDicoSymboleTactiqueTypeTrait;
import mpia.schema.TypeLocalisation;
import mpia.schema.TypeSymboleTactique;

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
 * An implementation of the model object '<em><b>Type Symbole Tactique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeSymboleTactiqueImpl#getIdentifiant <em>Identifiant</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSymboleTactiqueImpl#getNumeroSymbole <em>Numero Symbole</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSymboleTactiqueImpl#getEchelleMaximale <em>Echelle Maximale</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSymboleTactiqueImpl#getEchelleMinimale <em>Echelle Minimale</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSymboleTactiqueImpl#getCouleur <em>Couleur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSymboleTactiqueImpl#isIndicateurPC <em>Indicateur PC</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSymboleTactiqueImpl#getNiveauHierarchique <em>Niveau Hierarchique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSymboleTactiqueImpl#isTypeRemplissage <em>Type Remplissage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSymboleTactiqueImpl#getTypeTrait <em>Type Trait</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSymboleTactiqueImpl#getAngle <em>Angle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSymboleTactiqueImpl#getIndicateurPolygone <em>Indicateur Polygone</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSymboleTactiqueImpl#getNomBapteme <em>Nom Bapteme</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSymboleTactiqueImpl#getNbrPointPassage <em>Nbr Point Passage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSymboleTactiqueImpl#getNomBaptemeSecondaire <em>Nom Bapteme Secondaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSymboleTactiqueImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSymboleTactiqueImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSymboleTactiqueImpl#getEstLocaliseEnLocalisation <em>Est Localise En Localisation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSymboleTactiqueImpl#getCorrespondType <em>Correspond Type</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSymboleTactiqueImpl#getEstSujetAssocSymboleTactique <em>Est Sujet Assoc Symbole Tactique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSymboleTactiqueImpl#getEstComposeBrancheEurogrid <em>Est Compose Branche Eurogrid</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSymboleTactiqueImpl#getEstObjetAssocSymboleTactique <em>Est Objet Assoc Symbole Tactique</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeSymboleTactiqueImpl extends EObjectImpl implements TypeSymboleTactique {
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
	 * The default value of the '{@link #getNumeroSymbole() <em>Numero Symbole</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroSymbole()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMERO_SYMBOLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumeroSymbole() <em>Numero Symbole</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroSymbole()
	 * @generated
	 * @ordered
	 */
	protected String numeroSymbole = NUMERO_SYMBOLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEchelleMaximale() <em>Echelle Maximale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEchelleMaximale()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoSymboleTactiqueEchelle ECHELLE_MAXIMALE_EDEFAULT = TypeDictionaryDicoSymboleTactiqueEchelle._50;

	/**
	 * The cached value of the '{@link #getEchelleMaximale() <em>Echelle Maximale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEchelleMaximale()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoSymboleTactiqueEchelle echelleMaximale = ECHELLE_MAXIMALE_EDEFAULT;

	/**
	 * This is true if the Echelle Maximale attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean echelleMaximaleESet;

	/**
	 * The default value of the '{@link #getEchelleMinimale() <em>Echelle Minimale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEchelleMinimale()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoSymboleTactiqueEchelle ECHELLE_MINIMALE_EDEFAULT = TypeDictionaryDicoSymboleTactiqueEchelle._50;

	/**
	 * The cached value of the '{@link #getEchelleMinimale() <em>Echelle Minimale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEchelleMinimale()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoSymboleTactiqueEchelle echelleMinimale = ECHELLE_MINIMALE_EDEFAULT;

	/**
	 * This is true if the Echelle Minimale attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean echelleMinimaleESet;

	/**
	 * The default value of the '{@link #getCouleur() <em>Couleur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouleur()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCouleur COULEUR_EDEFAULT = TypeDictionaryDicoCouleur.BLACK;

	/**
	 * The cached value of the '{@link #getCouleur() <em>Couleur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouleur()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCouleur couleur = COULEUR_EDEFAULT;

	/**
	 * This is true if the Couleur attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean couleurESet;

	/**
	 * The default value of the '{@link #isIndicateurPC() <em>Indicateur PC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIndicateurPC()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INDICATEUR_PC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIndicateurPC() <em>Indicateur PC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIndicateurPC()
	 * @generated
	 * @ordered
	 */
	protected boolean indicateurPC = INDICATEUR_PC_EDEFAULT;

	/**
	 * This is true if the Indicateur PC attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean indicateurPCESet;

	/**
	 * The default value of the '{@link #getNiveauHierarchique() <em>Niveau Hierarchique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauHierarchique()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoNiveau NIVEAU_HIERARCHIQUE_EDEFAULT = TypeDictionaryDicoNiveau.AG;

	/**
	 * The cached value of the '{@link #getNiveauHierarchique() <em>Niveau Hierarchique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauHierarchique()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoNiveau niveauHierarchique = NIVEAU_HIERARCHIQUE_EDEFAULT;

	/**
	 * This is true if the Niveau Hierarchique attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean niveauHierarchiqueESet;

	/**
	 * The default value of the '{@link #isTypeRemplissage() <em>Type Remplissage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTypeRemplissage()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TYPE_REMPLISSAGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTypeRemplissage() <em>Type Remplissage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTypeRemplissage()
	 * @generated
	 * @ordered
	 */
	protected boolean typeRemplissage = TYPE_REMPLISSAGE_EDEFAULT;

	/**
	 * This is true if the Type Remplissage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeRemplissageESet;

	/**
	 * The default value of the '{@link #getTypeTrait() <em>Type Trait</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeTrait()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoSymboleTactiqueTypeTrait TYPE_TRAIT_EDEFAULT = TypeDictionaryDicoSymboleTactiqueTypeTrait.FULLLN;

	/**
	 * The cached value of the '{@link #getTypeTrait() <em>Type Trait</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeTrait()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoSymboleTactiqueTypeTrait typeTrait = TYPE_TRAIT_EDEFAULT;

	/**
	 * This is true if the Type Trait attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeTraitESet;

	/**
	 * The cached value of the '{@link #getAngle() <em>Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngle()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAngle angle;

	/**
	 * The default value of the '{@link #getIndicateurPolygone() <em>Indicateur Polygone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicateurPolygone()
	 * @generated
	 * @ordered
	 */
	protected static final long INDICATEUR_POLYGONE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getIndicateurPolygone() <em>Indicateur Polygone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicateurPolygone()
	 * @generated
	 * @ordered
	 */
	protected long indicateurPolygone = INDICATEUR_POLYGONE_EDEFAULT;

	/**
	 * This is true if the Indicateur Polygone attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean indicateurPolygoneESet;

	/**
	 * The default value of the '{@link #getNomBapteme() <em>Nom Bapteme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomBapteme()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_BAPTEME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomBapteme() <em>Nom Bapteme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomBapteme()
	 * @generated
	 * @ordered
	 */
	protected String nomBapteme = NOM_BAPTEME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbrPointPassage() <em>Nbr Point Passage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbrPointPassage()
	 * @generated
	 * @ordered
	 */
	protected static final long NBR_POINT_PASSAGE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNbrPointPassage() <em>Nbr Point Passage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbrPointPassage()
	 * @generated
	 * @ordered
	 */
	protected long nbrPointPassage = NBR_POINT_PASSAGE_EDEFAULT;

	/**
	 * This is true if the Nbr Point Passage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nbrPointPassageESet;

	/**
	 * The default value of the '{@link #getNomBaptemeSecondaire() <em>Nom Bapteme Secondaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomBaptemeSecondaire()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_BAPTEME_SECONDAIRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomBaptemeSecondaire() <em>Nom Bapteme Secondaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomBaptemeSecondaire()
	 * @generated
	 * @ordered
	 */
	protected String nomBaptemeSecondaire = NOM_BAPTEME_SECONDAIRE_EDEFAULT;

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
	 * The cached value of the '{@link #getEstLocaliseEnLocalisation() <em>Est Localise En Localisation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstLocaliseEnLocalisation()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeLocalisation> estLocaliseEnLocalisation;

	/**
	 * The cached value of the '{@link #getCorrespondType() <em>Correspond Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrespondType()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT correspondType;

	/**
	 * The cached value of the '{@link #getEstSujetAssocSymboleTactique() <em>Est Sujet Assoc Symbole Tactique</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssocSymboleTactique()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssocSymboleTactique;

	/**
	 * The cached value of the '{@link #getEstComposeBrancheEurogrid() <em>Est Compose Branche Eurogrid</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstComposeBrancheEurogrid()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeBrancheEurogrid> estComposeBrancheEurogrid;

	/**
	 * The cached value of the '{@link #getEstObjetAssocSymboleTactique() <em>Est Objet Assoc Symbole Tactique</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssocSymboleTactique()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssocSymboleTactique;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeSymboleTactiqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeSymboleTactique();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYMBOLE_TACTIQUE__IDENTIFIANT, oldIdentifiant, identifiant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumeroSymbole() {
		return numeroSymbole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroSymbole(String newNumeroSymbole) {
		String oldNumeroSymbole = numeroSymbole;
		numeroSymbole = newNumeroSymbole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYMBOLE_TACTIQUE__NUMERO_SYMBOLE, oldNumeroSymbole, numeroSymbole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoSymboleTactiqueEchelle getEchelleMaximale() {
		return echelleMaximale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEchelleMaximale(TypeDictionaryDicoSymboleTactiqueEchelle newEchelleMaximale) {
		TypeDictionaryDicoSymboleTactiqueEchelle oldEchelleMaximale = echelleMaximale;
		echelleMaximale = newEchelleMaximale == null ? ECHELLE_MAXIMALE_EDEFAULT : newEchelleMaximale;
		boolean oldEchelleMaximaleESet = echelleMaximaleESet;
		echelleMaximaleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYMBOLE_TACTIQUE__ECHELLE_MAXIMALE, oldEchelleMaximale, echelleMaximale, !oldEchelleMaximaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEchelleMaximale() {
		TypeDictionaryDicoSymboleTactiqueEchelle oldEchelleMaximale = echelleMaximale;
		boolean oldEchelleMaximaleESet = echelleMaximaleESet;
		echelleMaximale = ECHELLE_MAXIMALE_EDEFAULT;
		echelleMaximaleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SYMBOLE_TACTIQUE__ECHELLE_MAXIMALE, oldEchelleMaximale, ECHELLE_MAXIMALE_EDEFAULT, oldEchelleMaximaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEchelleMaximale() {
		return echelleMaximaleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoSymboleTactiqueEchelle getEchelleMinimale() {
		return echelleMinimale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEchelleMinimale(TypeDictionaryDicoSymboleTactiqueEchelle newEchelleMinimale) {
		TypeDictionaryDicoSymboleTactiqueEchelle oldEchelleMinimale = echelleMinimale;
		echelleMinimale = newEchelleMinimale == null ? ECHELLE_MINIMALE_EDEFAULT : newEchelleMinimale;
		boolean oldEchelleMinimaleESet = echelleMinimaleESet;
		echelleMinimaleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYMBOLE_TACTIQUE__ECHELLE_MINIMALE, oldEchelleMinimale, echelleMinimale, !oldEchelleMinimaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEchelleMinimale() {
		TypeDictionaryDicoSymboleTactiqueEchelle oldEchelleMinimale = echelleMinimale;
		boolean oldEchelleMinimaleESet = echelleMinimaleESet;
		echelleMinimale = ECHELLE_MINIMALE_EDEFAULT;
		echelleMinimaleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SYMBOLE_TACTIQUE__ECHELLE_MINIMALE, oldEchelleMinimale, ECHELLE_MINIMALE_EDEFAULT, oldEchelleMinimaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEchelleMinimale() {
		return echelleMinimaleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCouleur getCouleur() {
		return couleur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCouleur(TypeDictionaryDicoCouleur newCouleur) {
		TypeDictionaryDicoCouleur oldCouleur = couleur;
		couleur = newCouleur == null ? COULEUR_EDEFAULT : newCouleur;
		boolean oldCouleurESet = couleurESet;
		couleurESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYMBOLE_TACTIQUE__COULEUR, oldCouleur, couleur, !oldCouleurESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCouleur() {
		TypeDictionaryDicoCouleur oldCouleur = couleur;
		boolean oldCouleurESet = couleurESet;
		couleur = COULEUR_EDEFAULT;
		couleurESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SYMBOLE_TACTIQUE__COULEUR, oldCouleur, COULEUR_EDEFAULT, oldCouleurESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCouleur() {
		return couleurESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIndicateurPC() {
		return indicateurPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndicateurPC(boolean newIndicateurPC) {
		boolean oldIndicateurPC = indicateurPC;
		indicateurPC = newIndicateurPC;
		boolean oldIndicateurPCESet = indicateurPCESet;
		indicateurPCESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYMBOLE_TACTIQUE__INDICATEUR_PC, oldIndicateurPC, indicateurPC, !oldIndicateurPCESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIndicateurPC() {
		boolean oldIndicateurPC = indicateurPC;
		boolean oldIndicateurPCESet = indicateurPCESet;
		indicateurPC = INDICATEUR_PC_EDEFAULT;
		indicateurPCESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SYMBOLE_TACTIQUE__INDICATEUR_PC, oldIndicateurPC, INDICATEUR_PC_EDEFAULT, oldIndicateurPCESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIndicateurPC() {
		return indicateurPCESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoNiveau getNiveauHierarchique() {
		return niveauHierarchique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNiveauHierarchique(TypeDictionaryDicoNiveau newNiveauHierarchique) {
		TypeDictionaryDicoNiveau oldNiveauHierarchique = niveauHierarchique;
		niveauHierarchique = newNiveauHierarchique == null ? NIVEAU_HIERARCHIQUE_EDEFAULT : newNiveauHierarchique;
		boolean oldNiveauHierarchiqueESet = niveauHierarchiqueESet;
		niveauHierarchiqueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYMBOLE_TACTIQUE__NIVEAU_HIERARCHIQUE, oldNiveauHierarchique, niveauHierarchique, !oldNiveauHierarchiqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNiveauHierarchique() {
		TypeDictionaryDicoNiveau oldNiveauHierarchique = niveauHierarchique;
		boolean oldNiveauHierarchiqueESet = niveauHierarchiqueESet;
		niveauHierarchique = NIVEAU_HIERARCHIQUE_EDEFAULT;
		niveauHierarchiqueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SYMBOLE_TACTIQUE__NIVEAU_HIERARCHIQUE, oldNiveauHierarchique, NIVEAU_HIERARCHIQUE_EDEFAULT, oldNiveauHierarchiqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNiveauHierarchique() {
		return niveauHierarchiqueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTypeRemplissage() {
		return typeRemplissage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeRemplissage(boolean newTypeRemplissage) {
		boolean oldTypeRemplissage = typeRemplissage;
		typeRemplissage = newTypeRemplissage;
		boolean oldTypeRemplissageESet = typeRemplissageESet;
		typeRemplissageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYMBOLE_TACTIQUE__TYPE_REMPLISSAGE, oldTypeRemplissage, typeRemplissage, !oldTypeRemplissageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeRemplissage() {
		boolean oldTypeRemplissage = typeRemplissage;
		boolean oldTypeRemplissageESet = typeRemplissageESet;
		typeRemplissage = TYPE_REMPLISSAGE_EDEFAULT;
		typeRemplissageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SYMBOLE_TACTIQUE__TYPE_REMPLISSAGE, oldTypeRemplissage, TYPE_REMPLISSAGE_EDEFAULT, oldTypeRemplissageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeRemplissage() {
		return typeRemplissageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoSymboleTactiqueTypeTrait getTypeTrait() {
		return typeTrait;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeTrait(TypeDictionaryDicoSymboleTactiqueTypeTrait newTypeTrait) {
		TypeDictionaryDicoSymboleTactiqueTypeTrait oldTypeTrait = typeTrait;
		typeTrait = newTypeTrait == null ? TYPE_TRAIT_EDEFAULT : newTypeTrait;
		boolean oldTypeTraitESet = typeTraitESet;
		typeTraitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYMBOLE_TACTIQUE__TYPE_TRAIT, oldTypeTrait, typeTrait, !oldTypeTraitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeTrait() {
		TypeDictionaryDicoSymboleTactiqueTypeTrait oldTypeTrait = typeTrait;
		boolean oldTypeTraitESet = typeTraitESet;
		typeTrait = TYPE_TRAIT_EDEFAULT;
		typeTraitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SYMBOLE_TACTIQUE__TYPE_TRAIT, oldTypeTrait, TYPE_TRAIT_EDEFAULT, oldTypeTraitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeTrait() {
		return typeTraitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAngle getAngle() {
		return angle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngle(TypeDataTypeAngle newAngle, NotificationChain msgs) {
		TypeDataTypeAngle oldAngle = angle;
		angle = newAngle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYMBOLE_TACTIQUE__ANGLE, oldAngle, newAngle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngle(TypeDataTypeAngle newAngle) {
		if (newAngle != angle) {
			NotificationChain msgs = null;
			if (angle != null)
				msgs = ((InternalEObject)angle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SYMBOLE_TACTIQUE__ANGLE, null, msgs);
			if (newAngle != null)
				msgs = ((InternalEObject)newAngle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SYMBOLE_TACTIQUE__ANGLE, null, msgs);
			msgs = basicSetAngle(newAngle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYMBOLE_TACTIQUE__ANGLE, newAngle, newAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getIndicateurPolygone() {
		return indicateurPolygone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndicateurPolygone(long newIndicateurPolygone) {
		long oldIndicateurPolygone = indicateurPolygone;
		indicateurPolygone = newIndicateurPolygone;
		boolean oldIndicateurPolygoneESet = indicateurPolygoneESet;
		indicateurPolygoneESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYMBOLE_TACTIQUE__INDICATEUR_POLYGONE, oldIndicateurPolygone, indicateurPolygone, !oldIndicateurPolygoneESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIndicateurPolygone() {
		long oldIndicateurPolygone = indicateurPolygone;
		boolean oldIndicateurPolygoneESet = indicateurPolygoneESet;
		indicateurPolygone = INDICATEUR_POLYGONE_EDEFAULT;
		indicateurPolygoneESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SYMBOLE_TACTIQUE__INDICATEUR_POLYGONE, oldIndicateurPolygone, INDICATEUR_POLYGONE_EDEFAULT, oldIndicateurPolygoneESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIndicateurPolygone() {
		return indicateurPolygoneESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomBapteme() {
		return nomBapteme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomBapteme(String newNomBapteme) {
		String oldNomBapteme = nomBapteme;
		nomBapteme = newNomBapteme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYMBOLE_TACTIQUE__NOM_BAPTEME, oldNomBapteme, nomBapteme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNbrPointPassage() {
		return nbrPointPassage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbrPointPassage(long newNbrPointPassage) {
		long oldNbrPointPassage = nbrPointPassage;
		nbrPointPassage = newNbrPointPassage;
		boolean oldNbrPointPassageESet = nbrPointPassageESet;
		nbrPointPassageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYMBOLE_TACTIQUE__NBR_POINT_PASSAGE, oldNbrPointPassage, nbrPointPassage, !oldNbrPointPassageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNbrPointPassage() {
		long oldNbrPointPassage = nbrPointPassage;
		boolean oldNbrPointPassageESet = nbrPointPassageESet;
		nbrPointPassage = NBR_POINT_PASSAGE_EDEFAULT;
		nbrPointPassageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SYMBOLE_TACTIQUE__NBR_POINT_PASSAGE, oldNbrPointPassage, NBR_POINT_PASSAGE_EDEFAULT, oldNbrPointPassageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNbrPointPassage() {
		return nbrPointPassageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomBaptemeSecondaire() {
		return nomBaptemeSecondaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomBaptemeSecondaire(String newNomBaptemeSecondaire) {
		String oldNomBaptemeSecondaire = nomBaptemeSecondaire;
		nomBaptemeSecondaire = newNomBaptemeSecondaire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYMBOLE_TACTIQUE__NOM_BAPTEME_SECONDAIRE, oldNomBaptemeSecondaire, nomBaptemeSecondaire));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYMBOLE_TACTIQUE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYMBOLE_TACTIQUE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeLocalisation> getEstLocaliseEnLocalisation() {
		if (estLocaliseEnLocalisation == null) {
			estLocaliseEnLocalisation = new EObjectContainmentEList<TypeLocalisation>(TypeLocalisation.class, this, SchemaPackage.TYPE_SYMBOLE_TACTIQUE__EST_LOCALISE_EN_LOCALISATION);
		}
		return estLocaliseEnLocalisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getCorrespondType() {
		return correspondType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorrespondType(TypeAssociationEXT newCorrespondType, NotificationChain msgs) {
		TypeAssociationEXT oldCorrespondType = correspondType;
		correspondType = newCorrespondType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYMBOLE_TACTIQUE__CORRESPOND_TYPE, oldCorrespondType, newCorrespondType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrespondType(TypeAssociationEXT newCorrespondType) {
		if (newCorrespondType != correspondType) {
			NotificationChain msgs = null;
			if (correspondType != null)
				msgs = ((InternalEObject)correspondType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SYMBOLE_TACTIQUE__CORRESPOND_TYPE, null, msgs);
			if (newCorrespondType != null)
				msgs = ((InternalEObject)newCorrespondType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SYMBOLE_TACTIQUE__CORRESPOND_TYPE, null, msgs);
			msgs = basicSetCorrespondType(newCorrespondType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYMBOLE_TACTIQUE__CORRESPOND_TYPE, newCorrespondType, newCorrespondType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssocSymboleTactique() {
		if (estSujetAssocSymboleTactique == null) {
			estSujetAssocSymboleTactique = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_SYMBOLE_TACTIQUE__EST_SUJET_ASSOC_SYMBOLE_TACTIQUE);
		}
		return estSujetAssocSymboleTactique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeBrancheEurogrid> getEstComposeBrancheEurogrid() {
		if (estComposeBrancheEurogrid == null) {
			estComposeBrancheEurogrid = new EObjectContainmentEList<TypeBrancheEurogrid>(TypeBrancheEurogrid.class, this, SchemaPackage.TYPE_SYMBOLE_TACTIQUE__EST_COMPOSE_BRANCHE_EUROGRID);
		}
		return estComposeBrancheEurogrid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssocSymboleTactique() {
		if (estObjetAssocSymboleTactique == null) {
			estObjetAssocSymboleTactique = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_SYMBOLE_TACTIQUE__EST_OBJET_ASSOC_SYMBOLE_TACTIQUE);
		}
		return estObjetAssocSymboleTactique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__ANGLE:
				return basicSetAngle(null, msgs);
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__EST_LOCALISE_EN_LOCALISATION:
				return ((InternalEList<?>)getEstLocaliseEnLocalisation()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__CORRESPOND_TYPE:
				return basicSetCorrespondType(null, msgs);
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__EST_SUJET_ASSOC_SYMBOLE_TACTIQUE:
				return ((InternalEList<?>)getEstSujetAssocSymboleTactique()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__EST_COMPOSE_BRANCHE_EUROGRID:
				return ((InternalEList<?>)getEstComposeBrancheEurogrid()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__EST_OBJET_ASSOC_SYMBOLE_TACTIQUE:
				return ((InternalEList<?>)getEstObjetAssocSymboleTactique()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__IDENTIFIANT:
				return getIdentifiant();
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__NUMERO_SYMBOLE:
				return getNumeroSymbole();
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__ECHELLE_MAXIMALE:
				return getEchelleMaximale();
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__ECHELLE_MINIMALE:
				return getEchelleMinimale();
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__COULEUR:
				return getCouleur();
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__INDICATEUR_PC:
				return isIndicateurPC() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__NIVEAU_HIERARCHIQUE:
				return getNiveauHierarchique();
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__TYPE_REMPLISSAGE:
				return isTypeRemplissage() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__TYPE_TRAIT:
				return getTypeTrait();
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__ANGLE:
				return getAngle();
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__INDICATEUR_POLYGONE:
				return new Long(getIndicateurPolygone());
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__NOM_BAPTEME:
				return getNomBapteme();
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__NBR_POINT_PASSAGE:
				return new Long(getNbrPointPassage());
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__NOM_BAPTEME_SECONDAIRE:
				return getNomBaptemeSecondaire();
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__CE:
				return getCE();
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__EST_LOCALISE_EN_LOCALISATION:
				return getEstLocaliseEnLocalisation();
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__CORRESPOND_TYPE:
				return getCorrespondType();
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__EST_SUJET_ASSOC_SYMBOLE_TACTIQUE:
				return getEstSujetAssocSymboleTactique();
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__EST_COMPOSE_BRANCHE_EUROGRID:
				return getEstComposeBrancheEurogrid();
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__EST_OBJET_ASSOC_SYMBOLE_TACTIQUE:
				return getEstObjetAssocSymboleTactique();
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
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__IDENTIFIANT:
				setIdentifiant((String)newValue);
				return;
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__NUMERO_SYMBOLE:
				setNumeroSymbole((String)newValue);
				return;
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__ECHELLE_MAXIMALE:
				setEchelleMaximale((TypeDictionaryDicoSymboleTactiqueEchelle)newValue);
				return;
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__ECHELLE_MINIMALE:
				setEchelleMinimale((TypeDictionaryDicoSymboleTactiqueEchelle)newValue);
				return;
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__COULEUR:
				setCouleur((TypeDictionaryDicoCouleur)newValue);
				return;
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__INDICATEUR_PC:
				setIndicateurPC(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__NIVEAU_HIERARCHIQUE:
				setNiveauHierarchique((TypeDictionaryDicoNiveau)newValue);
				return;
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__TYPE_REMPLISSAGE:
				setTypeRemplissage(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__TYPE_TRAIT:
				setTypeTrait((TypeDictionaryDicoSymboleTactiqueTypeTrait)newValue);
				return;
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__ANGLE:
				setAngle((TypeDataTypeAngle)newValue);
				return;
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__INDICATEUR_POLYGONE:
				setIndicateurPolygone(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__NOM_BAPTEME:
				setNomBapteme((String)newValue);
				return;
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__NBR_POINT_PASSAGE:
				setNbrPointPassage(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__NOM_BAPTEME_SECONDAIRE:
				setNomBaptemeSecondaire((String)newValue);
				return;
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__EST_LOCALISE_EN_LOCALISATION:
				getEstLocaliseEnLocalisation().clear();
				getEstLocaliseEnLocalisation().addAll((Collection<? extends TypeLocalisation>)newValue);
				return;
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__CORRESPOND_TYPE:
				setCorrespondType((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__EST_SUJET_ASSOC_SYMBOLE_TACTIQUE:
				getEstSujetAssocSymboleTactique().clear();
				getEstSujetAssocSymboleTactique().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__EST_COMPOSE_BRANCHE_EUROGRID:
				getEstComposeBrancheEurogrid().clear();
				getEstComposeBrancheEurogrid().addAll((Collection<? extends TypeBrancheEurogrid>)newValue);
				return;
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__EST_OBJET_ASSOC_SYMBOLE_TACTIQUE:
				getEstObjetAssocSymboleTactique().clear();
				getEstObjetAssocSymboleTactique().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__IDENTIFIANT:
				setIdentifiant(IDENTIFIANT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__NUMERO_SYMBOLE:
				setNumeroSymbole(NUMERO_SYMBOLE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__ECHELLE_MAXIMALE:
				unsetEchelleMaximale();
				return;
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__ECHELLE_MINIMALE:
				unsetEchelleMinimale();
				return;
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__COULEUR:
				unsetCouleur();
				return;
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__INDICATEUR_PC:
				unsetIndicateurPC();
				return;
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__NIVEAU_HIERARCHIQUE:
				unsetNiveauHierarchique();
				return;
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__TYPE_REMPLISSAGE:
				unsetTypeRemplissage();
				return;
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__TYPE_TRAIT:
				unsetTypeTrait();
				return;
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__ANGLE:
				setAngle((TypeDataTypeAngle)null);
				return;
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__INDICATEUR_POLYGONE:
				unsetIndicateurPolygone();
				return;
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__NOM_BAPTEME:
				setNomBapteme(NOM_BAPTEME_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__NBR_POINT_PASSAGE:
				unsetNbrPointPassage();
				return;
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__NOM_BAPTEME_SECONDAIRE:
				setNomBaptemeSecondaire(NOM_BAPTEME_SECONDAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__EST_LOCALISE_EN_LOCALISATION:
				getEstLocaliseEnLocalisation().clear();
				return;
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__CORRESPOND_TYPE:
				setCorrespondType((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__EST_SUJET_ASSOC_SYMBOLE_TACTIQUE:
				getEstSujetAssocSymboleTactique().clear();
				return;
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__EST_COMPOSE_BRANCHE_EUROGRID:
				getEstComposeBrancheEurogrid().clear();
				return;
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__EST_OBJET_ASSOC_SYMBOLE_TACTIQUE:
				getEstObjetAssocSymboleTactique().clear();
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
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__IDENTIFIANT:
				return IDENTIFIANT_EDEFAULT == null ? identifiant != null : !IDENTIFIANT_EDEFAULT.equals(identifiant);
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__NUMERO_SYMBOLE:
				return NUMERO_SYMBOLE_EDEFAULT == null ? numeroSymbole != null : !NUMERO_SYMBOLE_EDEFAULT.equals(numeroSymbole);
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__ECHELLE_MAXIMALE:
				return isSetEchelleMaximale();
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__ECHELLE_MINIMALE:
				return isSetEchelleMinimale();
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__COULEUR:
				return isSetCouleur();
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__INDICATEUR_PC:
				return isSetIndicateurPC();
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__NIVEAU_HIERARCHIQUE:
				return isSetNiveauHierarchique();
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__TYPE_REMPLISSAGE:
				return isSetTypeRemplissage();
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__TYPE_TRAIT:
				return isSetTypeTrait();
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__ANGLE:
				return angle != null;
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__INDICATEUR_POLYGONE:
				return isSetIndicateurPolygone();
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__NOM_BAPTEME:
				return NOM_BAPTEME_EDEFAULT == null ? nomBapteme != null : !NOM_BAPTEME_EDEFAULT.equals(nomBapteme);
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__NBR_POINT_PASSAGE:
				return isSetNbrPointPassage();
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__NOM_BAPTEME_SECONDAIRE:
				return NOM_BAPTEME_SECONDAIRE_EDEFAULT == null ? nomBaptemeSecondaire != null : !NOM_BAPTEME_SECONDAIRE_EDEFAULT.equals(nomBaptemeSecondaire);
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__EST_LOCALISE_EN_LOCALISATION:
				return estLocaliseEnLocalisation != null && !estLocaliseEnLocalisation.isEmpty();
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__CORRESPOND_TYPE:
				return correspondType != null;
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__EST_SUJET_ASSOC_SYMBOLE_TACTIQUE:
				return estSujetAssocSymboleTactique != null && !estSujetAssocSymboleTactique.isEmpty();
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__EST_COMPOSE_BRANCHE_EUROGRID:
				return estComposeBrancheEurogrid != null && !estComposeBrancheEurogrid.isEmpty();
			case SchemaPackage.TYPE_SYMBOLE_TACTIQUE__EST_OBJET_ASSOC_SYMBOLE_TACTIQUE:
				return estObjetAssocSymboleTactique != null && !estObjetAssocSymboleTactique.isEmpty();
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
		result.append(", numeroSymbole: ");
		result.append(numeroSymbole);
		result.append(", echelleMaximale: ");
		if (echelleMaximaleESet) result.append(echelleMaximale); else result.append("<unset>");
		result.append(", echelleMinimale: ");
		if (echelleMinimaleESet) result.append(echelleMinimale); else result.append("<unset>");
		result.append(", couleur: ");
		if (couleurESet) result.append(couleur); else result.append("<unset>");
		result.append(", indicateurPC: ");
		if (indicateurPCESet) result.append(indicateurPC); else result.append("<unset>");
		result.append(", niveauHierarchique: ");
		if (niveauHierarchiqueESet) result.append(niveauHierarchique); else result.append("<unset>");
		result.append(", typeRemplissage: ");
		if (typeRemplissageESet) result.append(typeRemplissage); else result.append("<unset>");
		result.append(", typeTrait: ");
		if (typeTraitESet) result.append(typeTrait); else result.append("<unset>");
		result.append(", indicateurPolygone: ");
		if (indicateurPolygoneESet) result.append(indicateurPolygone); else result.append("<unset>");
		result.append(", nomBapteme: ");
		result.append(nomBapteme);
		result.append(", nbrPointPassage: ");
		if (nbrPointPassageESet) result.append(nbrPointPassage); else result.append("<unset>");
		result.append(", nomBaptemeSecondaire: ");
		result.append(nomBaptemeSecondaire);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeSymboleTactiqueImpl
