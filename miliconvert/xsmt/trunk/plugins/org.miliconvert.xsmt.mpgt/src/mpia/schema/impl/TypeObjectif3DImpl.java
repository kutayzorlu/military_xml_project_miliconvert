/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoObjectif3DCaracteristique;
import mpia.schema.TypeDictionaryDicoTypeSynthetiqueObjectif;
import mpia.schema.TypeObjectif3D;
import mpia.schema.TypeResultatTraitementObjectif;

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
 * An implementation of the model object '<em><b>Type Objectif3 D</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeObjectif3DImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectif3DImpl#getTypeSynthetiqueObjectif <em>Type Synthetique Objectif</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectif3DImpl#getCaracteristique <em>Caracteristique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectif3DImpl#getDateZULU <em>Date ZULU</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectif3DImpl#getIdentifiantPositionnel <em>Identifiant Positionnel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectif3DImpl#getNumeroABCA <em>Numero ABCA</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectif3DImpl#getNumeroEncyclopedique <em>Numero Encyclopedique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectif3DImpl#getIdentifiantImpact <em>Identifiant Impact</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectif3DImpl#getDescriptionImpact <em>Description Impact</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectif3DImpl#getIdentifiantComposante <em>Identifiant Composante</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectif3DImpl#getButAssocieAObjectif <em>But Associe AObjectif</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectif3DImpl#getIdentifiantComplementaire <em>Identifiant Complementaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectif3DImpl#getTypeZone <em>Type Zone</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectif3DImpl#getIndexPhase <em>Index Phase</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectif3DImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectif3DImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectif3DImpl#getAPourNationaliteEntitePolitique <em>APour Nationalite Entite Politique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectif3DImpl#getAPourResultatsTraitementResultatTraitementObjectif <em>APour Resultats Traitement Resultat Traitement Objectif</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeObjectif3DImpl extends EObjectImpl implements TypeObjectif3D {
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
	 * The default value of the '{@link #getTypeSynthetiqueObjectif() <em>Type Synthetique Objectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeSynthetiqueObjectif()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeSynthetiqueObjectif TYPE_SYNTHETIQUE_OBJECTIF_EDEFAULT = TypeDictionaryDicoTypeSynthetiqueObjectif.AAAH;

	/**
	 * The cached value of the '{@link #getTypeSynthetiqueObjectif() <em>Type Synthetique Objectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeSynthetiqueObjectif()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeSynthetiqueObjectif typeSynthetiqueObjectif = TYPE_SYNTHETIQUE_OBJECTIF_EDEFAULT;

	/**
	 * This is true if the Type Synthetique Objectif attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeSynthetiqueObjectifESet;

	/**
	 * The default value of the '{@link #getCaracteristique() <em>Caracteristique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaracteristique()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoObjectif3DCaracteristique CARACTERISTIQUE_EDEFAULT = TypeDictionaryDicoObjectif3DCaracteristique.A;

	/**
	 * The cached value of the '{@link #getCaracteristique() <em>Caracteristique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaracteristique()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoObjectif3DCaracteristique caracteristique = CARACTERISTIQUE_EDEFAULT;

	/**
	 * This is true if the Caracteristique attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean caracteristiqueESet;

	/**
	 * The default value of the '{@link #getDateZULU() <em>Date ZULU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateZULU()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_ZULU_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateZULU() <em>Date ZULU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateZULU()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateZULU = DATE_ZULU_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentifiantPositionnel() <em>Identifiant Positionnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiantPositionnel()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIANT_POSITIONNEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifiantPositionnel() <em>Identifiant Positionnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiantPositionnel()
	 * @generated
	 * @ordered
	 */
	protected String identifiantPositionnel = IDENTIFIANT_POSITIONNEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumeroABCA() <em>Numero ABCA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroABCA()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMERO_ABCA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumeroABCA() <em>Numero ABCA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroABCA()
	 * @generated
	 * @ordered
	 */
	protected String numeroABCA = NUMERO_ABCA_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumeroEncyclopedique() <em>Numero Encyclopedique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroEncyclopedique()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMERO_ENCYCLOPEDIQUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumeroEncyclopedique() <em>Numero Encyclopedique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroEncyclopedique()
	 * @generated
	 * @ordered
	 */
	protected String numeroEncyclopedique = NUMERO_ENCYCLOPEDIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentifiantImpact() <em>Identifiant Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiantImpact()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIANT_IMPACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifiantImpact() <em>Identifiant Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiantImpact()
	 * @generated
	 * @ordered
	 */
	protected String identifiantImpact = IDENTIFIANT_IMPACT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescriptionImpact() <em>Description Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionImpact()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_IMPACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescriptionImpact() <em>Description Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionImpact()
	 * @generated
	 * @ordered
	 */
	protected String descriptionImpact = DESCRIPTION_IMPACT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentifiantComposante() <em>Identifiant Composante</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiantComposante()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIANT_COMPOSANTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifiantComposante() <em>Identifiant Composante</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiantComposante()
	 * @generated
	 * @ordered
	 */
	protected String identifiantComposante = IDENTIFIANT_COMPOSANTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getButAssocieAObjectif() <em>But Associe AObjectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButAssocieAObjectif()
	 * @generated
	 * @ordered
	 */
	protected static final String BUT_ASSOCIE_AOBJECTIF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getButAssocieAObjectif() <em>But Associe AObjectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButAssocieAObjectif()
	 * @generated
	 * @ordered
	 */
	protected String butAssocieAObjectif = BUT_ASSOCIE_AOBJECTIF_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentifiantComplementaire() <em>Identifiant Complementaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiantComplementaire()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIANT_COMPLEMENTAIRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifiantComplementaire() <em>Identifiant Complementaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiantComplementaire()
	 * @generated
	 * @ordered
	 */
	protected String identifiantComplementaire = IDENTIFIANT_COMPLEMENTAIRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeZone() <em>Type Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeZone()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_ZONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeZone() <em>Type Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeZone()
	 * @generated
	 * @ordered
	 */
	protected String typeZone = TYPE_ZONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIndexPhase() <em>Index Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexPhase()
	 * @generated
	 * @ordered
	 */
	protected static final String INDEX_PHASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndexPhase() <em>Index Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexPhase()
	 * @generated
	 * @ordered
	 */
	protected String indexPhase = INDEX_PHASE_EDEFAULT;

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
	 * The cached value of the '{@link #getAPourNationaliteEntitePolitique() <em>APour Nationalite Entite Politique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourNationaliteEntitePolitique()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourNationaliteEntitePolitique;

	/**
	 * The cached value of the '{@link #getAPourResultatsTraitementResultatTraitementObjectif() <em>APour Resultats Traitement Resultat Traitement Objectif</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourResultatsTraitementResultatTraitementObjectif()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeResultatTraitementObjectif> aPourResultatsTraitementResultatTraitementObjectif;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeObjectif3DImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeObjectif3D();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF3_D__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeSynthetiqueObjectif getTypeSynthetiqueObjectif() {
		return typeSynthetiqueObjectif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeSynthetiqueObjectif(TypeDictionaryDicoTypeSynthetiqueObjectif newTypeSynthetiqueObjectif) {
		TypeDictionaryDicoTypeSynthetiqueObjectif oldTypeSynthetiqueObjectif = typeSynthetiqueObjectif;
		typeSynthetiqueObjectif = newTypeSynthetiqueObjectif == null ? TYPE_SYNTHETIQUE_OBJECTIF_EDEFAULT : newTypeSynthetiqueObjectif;
		boolean oldTypeSynthetiqueObjectifESet = typeSynthetiqueObjectifESet;
		typeSynthetiqueObjectifESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF3_D__TYPE_SYNTHETIQUE_OBJECTIF, oldTypeSynthetiqueObjectif, typeSynthetiqueObjectif, !oldTypeSynthetiqueObjectifESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeSynthetiqueObjectif() {
		TypeDictionaryDicoTypeSynthetiqueObjectif oldTypeSynthetiqueObjectif = typeSynthetiqueObjectif;
		boolean oldTypeSynthetiqueObjectifESet = typeSynthetiqueObjectifESet;
		typeSynthetiqueObjectif = TYPE_SYNTHETIQUE_OBJECTIF_EDEFAULT;
		typeSynthetiqueObjectifESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_OBJECTIF3_D__TYPE_SYNTHETIQUE_OBJECTIF, oldTypeSynthetiqueObjectif, TYPE_SYNTHETIQUE_OBJECTIF_EDEFAULT, oldTypeSynthetiqueObjectifESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeSynthetiqueObjectif() {
		return typeSynthetiqueObjectifESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoObjectif3DCaracteristique getCaracteristique() {
		return caracteristique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaracteristique(TypeDictionaryDicoObjectif3DCaracteristique newCaracteristique) {
		TypeDictionaryDicoObjectif3DCaracteristique oldCaracteristique = caracteristique;
		caracteristique = newCaracteristique == null ? CARACTERISTIQUE_EDEFAULT : newCaracteristique;
		boolean oldCaracteristiqueESet = caracteristiqueESet;
		caracteristiqueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF3_D__CARACTERISTIQUE, oldCaracteristique, caracteristique, !oldCaracteristiqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCaracteristique() {
		TypeDictionaryDicoObjectif3DCaracteristique oldCaracteristique = caracteristique;
		boolean oldCaracteristiqueESet = caracteristiqueESet;
		caracteristique = CARACTERISTIQUE_EDEFAULT;
		caracteristiqueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_OBJECTIF3_D__CARACTERISTIQUE, oldCaracteristique, CARACTERISTIQUE_EDEFAULT, oldCaracteristiqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCaracteristique() {
		return caracteristiqueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateZULU() {
		return dateZULU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateZULU(XMLGregorianCalendar newDateZULU) {
		XMLGregorianCalendar oldDateZULU = dateZULU;
		dateZULU = newDateZULU;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF3_D__DATE_ZULU, oldDateZULU, dateZULU));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifiantPositionnel() {
		return identifiantPositionnel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifiantPositionnel(String newIdentifiantPositionnel) {
		String oldIdentifiantPositionnel = identifiantPositionnel;
		identifiantPositionnel = newIdentifiantPositionnel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF3_D__IDENTIFIANT_POSITIONNEL, oldIdentifiantPositionnel, identifiantPositionnel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumeroABCA() {
		return numeroABCA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroABCA(String newNumeroABCA) {
		String oldNumeroABCA = numeroABCA;
		numeroABCA = newNumeroABCA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF3_D__NUMERO_ABCA, oldNumeroABCA, numeroABCA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumeroEncyclopedique() {
		return numeroEncyclopedique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroEncyclopedique(String newNumeroEncyclopedique) {
		String oldNumeroEncyclopedique = numeroEncyclopedique;
		numeroEncyclopedique = newNumeroEncyclopedique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF3_D__NUMERO_ENCYCLOPEDIQUE, oldNumeroEncyclopedique, numeroEncyclopedique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifiantImpact() {
		return identifiantImpact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifiantImpact(String newIdentifiantImpact) {
		String oldIdentifiantImpact = identifiantImpact;
		identifiantImpact = newIdentifiantImpact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF3_D__IDENTIFIANT_IMPACT, oldIdentifiantImpact, identifiantImpact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescriptionImpact() {
		return descriptionImpact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptionImpact(String newDescriptionImpact) {
		String oldDescriptionImpact = descriptionImpact;
		descriptionImpact = newDescriptionImpact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF3_D__DESCRIPTION_IMPACT, oldDescriptionImpact, descriptionImpact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifiantComposante() {
		return identifiantComposante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifiantComposante(String newIdentifiantComposante) {
		String oldIdentifiantComposante = identifiantComposante;
		identifiantComposante = newIdentifiantComposante;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF3_D__IDENTIFIANT_COMPOSANTE, oldIdentifiantComposante, identifiantComposante));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getButAssocieAObjectif() {
		return butAssocieAObjectif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setButAssocieAObjectif(String newButAssocieAObjectif) {
		String oldButAssocieAObjectif = butAssocieAObjectif;
		butAssocieAObjectif = newButAssocieAObjectif;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF3_D__BUT_ASSOCIE_AOBJECTIF, oldButAssocieAObjectif, butAssocieAObjectif));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifiantComplementaire() {
		return identifiantComplementaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifiantComplementaire(String newIdentifiantComplementaire) {
		String oldIdentifiantComplementaire = identifiantComplementaire;
		identifiantComplementaire = newIdentifiantComplementaire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF3_D__IDENTIFIANT_COMPLEMENTAIRE, oldIdentifiantComplementaire, identifiantComplementaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeZone() {
		return typeZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeZone(String newTypeZone) {
		String oldTypeZone = typeZone;
		typeZone = newTypeZone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF3_D__TYPE_ZONE, oldTypeZone, typeZone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIndexPhase() {
		return indexPhase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexPhase(String newIndexPhase) {
		String oldIndexPhase = indexPhase;
		indexPhase = newIndexPhase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF3_D__INDEX_PHASE, oldIndexPhase, indexPhase));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF3_D__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF3_D__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourNationaliteEntitePolitique() {
		return aPourNationaliteEntitePolitique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourNationaliteEntitePolitique(TypeAssociation newAPourNationaliteEntitePolitique, NotificationChain msgs) {
		TypeAssociation oldAPourNationaliteEntitePolitique = aPourNationaliteEntitePolitique;
		aPourNationaliteEntitePolitique = newAPourNationaliteEntitePolitique;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF3_D__APOUR_NATIONALITE_ENTITE_POLITIQUE, oldAPourNationaliteEntitePolitique, newAPourNationaliteEntitePolitique);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourNationaliteEntitePolitique(TypeAssociation newAPourNationaliteEntitePolitique) {
		if (newAPourNationaliteEntitePolitique != aPourNationaliteEntitePolitique) {
			NotificationChain msgs = null;
			if (aPourNationaliteEntitePolitique != null)
				msgs = ((InternalEObject)aPourNationaliteEntitePolitique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBJECTIF3_D__APOUR_NATIONALITE_ENTITE_POLITIQUE, null, msgs);
			if (newAPourNationaliteEntitePolitique != null)
				msgs = ((InternalEObject)newAPourNationaliteEntitePolitique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBJECTIF3_D__APOUR_NATIONALITE_ENTITE_POLITIQUE, null, msgs);
			msgs = basicSetAPourNationaliteEntitePolitique(newAPourNationaliteEntitePolitique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF3_D__APOUR_NATIONALITE_ENTITE_POLITIQUE, newAPourNationaliteEntitePolitique, newAPourNationaliteEntitePolitique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeResultatTraitementObjectif> getAPourResultatsTraitementResultatTraitementObjectif() {
		if (aPourResultatsTraitementResultatTraitementObjectif == null) {
			aPourResultatsTraitementResultatTraitementObjectif = new EObjectContainmentEList<TypeResultatTraitementObjectif>(TypeResultatTraitementObjectif.class, this, SchemaPackage.TYPE_OBJECTIF3_D__APOUR_RESULTATS_TRAITEMENT_RESULTAT_TRAITEMENT_OBJECTIF);
		}
		return aPourResultatsTraitementResultatTraitementObjectif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_OBJECTIF3_D__APOUR_NATIONALITE_ENTITE_POLITIQUE:
				return basicSetAPourNationaliteEntitePolitique(null, msgs);
			case SchemaPackage.TYPE_OBJECTIF3_D__APOUR_RESULTATS_TRAITEMENT_RESULTAT_TRAITEMENT_OBJECTIF:
				return ((InternalEList<?>)getAPourResultatsTraitementResultatTraitementObjectif()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_OBJECTIF3_D__NOM:
				return getNom();
			case SchemaPackage.TYPE_OBJECTIF3_D__TYPE_SYNTHETIQUE_OBJECTIF:
				return getTypeSynthetiqueObjectif();
			case SchemaPackage.TYPE_OBJECTIF3_D__CARACTERISTIQUE:
				return getCaracteristique();
			case SchemaPackage.TYPE_OBJECTIF3_D__DATE_ZULU:
				return getDateZULU();
			case SchemaPackage.TYPE_OBJECTIF3_D__IDENTIFIANT_POSITIONNEL:
				return getIdentifiantPositionnel();
			case SchemaPackage.TYPE_OBJECTIF3_D__NUMERO_ABCA:
				return getNumeroABCA();
			case SchemaPackage.TYPE_OBJECTIF3_D__NUMERO_ENCYCLOPEDIQUE:
				return getNumeroEncyclopedique();
			case SchemaPackage.TYPE_OBJECTIF3_D__IDENTIFIANT_IMPACT:
				return getIdentifiantImpact();
			case SchemaPackage.TYPE_OBJECTIF3_D__DESCRIPTION_IMPACT:
				return getDescriptionImpact();
			case SchemaPackage.TYPE_OBJECTIF3_D__IDENTIFIANT_COMPOSANTE:
				return getIdentifiantComposante();
			case SchemaPackage.TYPE_OBJECTIF3_D__BUT_ASSOCIE_AOBJECTIF:
				return getButAssocieAObjectif();
			case SchemaPackage.TYPE_OBJECTIF3_D__IDENTIFIANT_COMPLEMENTAIRE:
				return getIdentifiantComplementaire();
			case SchemaPackage.TYPE_OBJECTIF3_D__TYPE_ZONE:
				return getTypeZone();
			case SchemaPackage.TYPE_OBJECTIF3_D__INDEX_PHASE:
				return getIndexPhase();
			case SchemaPackage.TYPE_OBJECTIF3_D__CTE:
				return getCTE();
			case SchemaPackage.TYPE_OBJECTIF3_D__CE:
				return getCE();
			case SchemaPackage.TYPE_OBJECTIF3_D__APOUR_NATIONALITE_ENTITE_POLITIQUE:
				return getAPourNationaliteEntitePolitique();
			case SchemaPackage.TYPE_OBJECTIF3_D__APOUR_RESULTATS_TRAITEMENT_RESULTAT_TRAITEMENT_OBJECTIF:
				return getAPourResultatsTraitementResultatTraitementObjectif();
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
			case SchemaPackage.TYPE_OBJECTIF3_D__NOM:
				setNom((String)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF3_D__TYPE_SYNTHETIQUE_OBJECTIF:
				setTypeSynthetiqueObjectif((TypeDictionaryDicoTypeSynthetiqueObjectif)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF3_D__CARACTERISTIQUE:
				setCaracteristique((TypeDictionaryDicoObjectif3DCaracteristique)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF3_D__DATE_ZULU:
				setDateZULU((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF3_D__IDENTIFIANT_POSITIONNEL:
				setIdentifiantPositionnel((String)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF3_D__NUMERO_ABCA:
				setNumeroABCA((String)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF3_D__NUMERO_ENCYCLOPEDIQUE:
				setNumeroEncyclopedique((String)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF3_D__IDENTIFIANT_IMPACT:
				setIdentifiantImpact((String)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF3_D__DESCRIPTION_IMPACT:
				setDescriptionImpact((String)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF3_D__IDENTIFIANT_COMPOSANTE:
				setIdentifiantComposante((String)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF3_D__BUT_ASSOCIE_AOBJECTIF:
				setButAssocieAObjectif((String)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF3_D__IDENTIFIANT_COMPLEMENTAIRE:
				setIdentifiantComplementaire((String)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF3_D__TYPE_ZONE:
				setTypeZone((String)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF3_D__INDEX_PHASE:
				setIndexPhase((String)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF3_D__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF3_D__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF3_D__APOUR_NATIONALITE_ENTITE_POLITIQUE:
				setAPourNationaliteEntitePolitique((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF3_D__APOUR_RESULTATS_TRAITEMENT_RESULTAT_TRAITEMENT_OBJECTIF:
				getAPourResultatsTraitementResultatTraitementObjectif().clear();
				getAPourResultatsTraitementResultatTraitementObjectif().addAll((Collection<? extends TypeResultatTraitementObjectif>)newValue);
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
			case SchemaPackage.TYPE_OBJECTIF3_D__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case SchemaPackage.TYPE_OBJECTIF3_D__TYPE_SYNTHETIQUE_OBJECTIF:
				unsetTypeSynthetiqueObjectif();
				return;
			case SchemaPackage.TYPE_OBJECTIF3_D__CARACTERISTIQUE:
				unsetCaracteristique();
				return;
			case SchemaPackage.TYPE_OBJECTIF3_D__DATE_ZULU:
				setDateZULU(DATE_ZULU_EDEFAULT);
				return;
			case SchemaPackage.TYPE_OBJECTIF3_D__IDENTIFIANT_POSITIONNEL:
				setIdentifiantPositionnel(IDENTIFIANT_POSITIONNEL_EDEFAULT);
				return;
			case SchemaPackage.TYPE_OBJECTIF3_D__NUMERO_ABCA:
				setNumeroABCA(NUMERO_ABCA_EDEFAULT);
				return;
			case SchemaPackage.TYPE_OBJECTIF3_D__NUMERO_ENCYCLOPEDIQUE:
				setNumeroEncyclopedique(NUMERO_ENCYCLOPEDIQUE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_OBJECTIF3_D__IDENTIFIANT_IMPACT:
				setIdentifiantImpact(IDENTIFIANT_IMPACT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_OBJECTIF3_D__DESCRIPTION_IMPACT:
				setDescriptionImpact(DESCRIPTION_IMPACT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_OBJECTIF3_D__IDENTIFIANT_COMPOSANTE:
				setIdentifiantComposante(IDENTIFIANT_COMPOSANTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_OBJECTIF3_D__BUT_ASSOCIE_AOBJECTIF:
				setButAssocieAObjectif(BUT_ASSOCIE_AOBJECTIF_EDEFAULT);
				return;
			case SchemaPackage.TYPE_OBJECTIF3_D__IDENTIFIANT_COMPLEMENTAIRE:
				setIdentifiantComplementaire(IDENTIFIANT_COMPLEMENTAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_OBJECTIF3_D__TYPE_ZONE:
				setTypeZone(TYPE_ZONE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_OBJECTIF3_D__INDEX_PHASE:
				setIndexPhase(INDEX_PHASE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_OBJECTIF3_D__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_OBJECTIF3_D__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_OBJECTIF3_D__APOUR_NATIONALITE_ENTITE_POLITIQUE:
				setAPourNationaliteEntitePolitique((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_OBJECTIF3_D__APOUR_RESULTATS_TRAITEMENT_RESULTAT_TRAITEMENT_OBJECTIF:
				getAPourResultatsTraitementResultatTraitementObjectif().clear();
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
			case SchemaPackage.TYPE_OBJECTIF3_D__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case SchemaPackage.TYPE_OBJECTIF3_D__TYPE_SYNTHETIQUE_OBJECTIF:
				return isSetTypeSynthetiqueObjectif();
			case SchemaPackage.TYPE_OBJECTIF3_D__CARACTERISTIQUE:
				return isSetCaracteristique();
			case SchemaPackage.TYPE_OBJECTIF3_D__DATE_ZULU:
				return DATE_ZULU_EDEFAULT == null ? dateZULU != null : !DATE_ZULU_EDEFAULT.equals(dateZULU);
			case SchemaPackage.TYPE_OBJECTIF3_D__IDENTIFIANT_POSITIONNEL:
				return IDENTIFIANT_POSITIONNEL_EDEFAULT == null ? identifiantPositionnel != null : !IDENTIFIANT_POSITIONNEL_EDEFAULT.equals(identifiantPositionnel);
			case SchemaPackage.TYPE_OBJECTIF3_D__NUMERO_ABCA:
				return NUMERO_ABCA_EDEFAULT == null ? numeroABCA != null : !NUMERO_ABCA_EDEFAULT.equals(numeroABCA);
			case SchemaPackage.TYPE_OBJECTIF3_D__NUMERO_ENCYCLOPEDIQUE:
				return NUMERO_ENCYCLOPEDIQUE_EDEFAULT == null ? numeroEncyclopedique != null : !NUMERO_ENCYCLOPEDIQUE_EDEFAULT.equals(numeroEncyclopedique);
			case SchemaPackage.TYPE_OBJECTIF3_D__IDENTIFIANT_IMPACT:
				return IDENTIFIANT_IMPACT_EDEFAULT == null ? identifiantImpact != null : !IDENTIFIANT_IMPACT_EDEFAULT.equals(identifiantImpact);
			case SchemaPackage.TYPE_OBJECTIF3_D__DESCRIPTION_IMPACT:
				return DESCRIPTION_IMPACT_EDEFAULT == null ? descriptionImpact != null : !DESCRIPTION_IMPACT_EDEFAULT.equals(descriptionImpact);
			case SchemaPackage.TYPE_OBJECTIF3_D__IDENTIFIANT_COMPOSANTE:
				return IDENTIFIANT_COMPOSANTE_EDEFAULT == null ? identifiantComposante != null : !IDENTIFIANT_COMPOSANTE_EDEFAULT.equals(identifiantComposante);
			case SchemaPackage.TYPE_OBJECTIF3_D__BUT_ASSOCIE_AOBJECTIF:
				return BUT_ASSOCIE_AOBJECTIF_EDEFAULT == null ? butAssocieAObjectif != null : !BUT_ASSOCIE_AOBJECTIF_EDEFAULT.equals(butAssocieAObjectif);
			case SchemaPackage.TYPE_OBJECTIF3_D__IDENTIFIANT_COMPLEMENTAIRE:
				return IDENTIFIANT_COMPLEMENTAIRE_EDEFAULT == null ? identifiantComplementaire != null : !IDENTIFIANT_COMPLEMENTAIRE_EDEFAULT.equals(identifiantComplementaire);
			case SchemaPackage.TYPE_OBJECTIF3_D__TYPE_ZONE:
				return TYPE_ZONE_EDEFAULT == null ? typeZone != null : !TYPE_ZONE_EDEFAULT.equals(typeZone);
			case SchemaPackage.TYPE_OBJECTIF3_D__INDEX_PHASE:
				return INDEX_PHASE_EDEFAULT == null ? indexPhase != null : !INDEX_PHASE_EDEFAULT.equals(indexPhase);
			case SchemaPackage.TYPE_OBJECTIF3_D__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_OBJECTIF3_D__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_OBJECTIF3_D__APOUR_NATIONALITE_ENTITE_POLITIQUE:
				return aPourNationaliteEntitePolitique != null;
			case SchemaPackage.TYPE_OBJECTIF3_D__APOUR_RESULTATS_TRAITEMENT_RESULTAT_TRAITEMENT_OBJECTIF:
				return aPourResultatsTraitementResultatTraitementObjectif != null && !aPourResultatsTraitementResultatTraitementObjectif.isEmpty();
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
		result.append(", typeSynthetiqueObjectif: ");
		if (typeSynthetiqueObjectifESet) result.append(typeSynthetiqueObjectif); else result.append("<unset>");
		result.append(", caracteristique: ");
		if (caracteristiqueESet) result.append(caracteristique); else result.append("<unset>");
		result.append(", dateZULU: ");
		result.append(dateZULU);
		result.append(", identifiantPositionnel: ");
		result.append(identifiantPositionnel);
		result.append(", numeroABCA: ");
		result.append(numeroABCA);
		result.append(", numeroEncyclopedique: ");
		result.append(numeroEncyclopedique);
		result.append(", identifiantImpact: ");
		result.append(identifiantImpact);
		result.append(", descriptionImpact: ");
		result.append(descriptionImpact);
		result.append(", identifiantComposante: ");
		result.append(identifiantComposante);
		result.append(", butAssocieAObjectif: ");
		result.append(butAssocieAObjectif);
		result.append(", identifiantComplementaire: ");
		result.append(identifiantComplementaire);
		result.append(", typeZone: ");
		result.append(typeZone);
		result.append(", indexPhase: ");
		result.append(indexPhase);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeObjectif3DImpl
