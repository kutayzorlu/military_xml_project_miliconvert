/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;
import mpia.meta.TypeDataTypeAltitudePression;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDeclenchementTir;
import mpia.schema.TypeDictionaryDicoDirectiveTirCategorie;
import mpia.schema.TypeDictionaryDicoDirectiveTirSousCategorie;
import mpia.schema.TypeDictionaryDicoModaliteFinTir;
import mpia.schema.TypeDictionaryDicoTrajectoire;
import mpia.schema.TypeDirectiveTir;
import mpia.schema.TypeLocalisationGeometrique2D;
import mpia.schema.TypeModalitesMiseEnPlaceTir;
import mpia.schema.TypeParametresImposes;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Directive Tir</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeDirectiveTirImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDirectiveTirImpl#getSousCategorie <em>Sous Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDirectiveTirImpl#getTrajectoire <em>Trajectoire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDirectiveTirImpl#getModaliteFinTir <em>Modalite Fin Tir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDirectiveTirImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDirectiveTirImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDirectiveTirImpl#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDirectiveTirImpl#getAPourSecondesMunitionsParametresImposes <em>APour Secondes Munitions Parametres Imposes</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDirectiveTirImpl#getAPourPremieresMunitionsParametresImposes <em>APour Premieres Munitions Parametres Imposes</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDirectiveTirImpl#getConcerneDemandeTir <em>Concerne Demande Tir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDirectiveTirImpl#getAPourDeclenchementDeclenchementTir <em>APour Declenchement Declenchement Tir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDirectiveTirImpl#getAPourCompteRenduCompteRenduTir <em>APour Compte Rendu Compte Rendu Tir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDirectiveTirImpl#getDemandeUsageTypeArme <em>Demande Usage Type Arme</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDirectiveTirImpl#getAPourModalitesMiseEnPlaceTirModalitesMiseEnPlaceTir <em>APour Modalites Mise En Place Tir Modalites Mise En Place Tir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDirectiveTirImpl#getAPourEmetteurUnite <em>APour Emetteur Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDirectiveTirImpl#getAPourPointViseLocalisationGeometrique2D <em>APour Point Vise Localisation Geometrique2 D</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeDirectiveTirImpl extends EObjectImpl implements TypeDirectiveTir {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoDirectiveTirCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoDirectiveTirCategorie.CDT;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoDirectiveTirCategorie categorie = CATEGORIE_EDEFAULT;

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
	protected static final TypeDictionaryDicoDirectiveTirSousCategorie SOUS_CATEGORIE_EDEFAULT = TypeDictionaryDicoDirectiveTirSousCategorie.CANCLSTCOM;

	/**
	 * The cached value of the '{@link #getSousCategorie() <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSousCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoDirectiveTirSousCategorie sousCategorie = SOUS_CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Sous Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sousCategorieESet;

	/**
	 * The default value of the '{@link #getTrajectoire() <em>Trajectoire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrajectoire()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTrajectoire TRAJECTOIRE_EDEFAULT = TypeDictionaryDicoTrajectoire.PLUN;

	/**
	 * The cached value of the '{@link #getTrajectoire() <em>Trajectoire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrajectoire()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTrajectoire trajectoire = TRAJECTOIRE_EDEFAULT;

	/**
	 * This is true if the Trajectoire attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean trajectoireESet;

	/**
	 * The default value of the '{@link #getModaliteFinTir() <em>Modalite Fin Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModaliteFinTir()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoModaliteFinTir MODALITE_FIN_TIR_EDEFAULT = TypeDictionaryDicoModaliteFinTir.ENREG;

	/**
	 * The cached value of the '{@link #getModaliteFinTir() <em>Modalite Fin Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModaliteFinTir()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoModaliteFinTir modaliteFinTir = MODALITE_FIN_TIR_EDEFAULT;

	/**
	 * This is true if the Modalite Fin Tir attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean modaliteFinTirESet;

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
	 * The cached value of the '{@link #getAltitude() <em>Altitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitude()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAltitudePression altitude;

	/**
	 * The cached value of the '{@link #getAPourSecondesMunitionsParametresImposes() <em>APour Secondes Munitions Parametres Imposes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourSecondesMunitionsParametresImposes()
	 * @generated
	 * @ordered
	 */
	protected TypeParametresImposes aPourSecondesMunitionsParametresImposes;

	/**
	 * The cached value of the '{@link #getAPourPremieresMunitionsParametresImposes() <em>APour Premieres Munitions Parametres Imposes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourPremieresMunitionsParametresImposes()
	 * @generated
	 * @ordered
	 */
	protected TypeParametresImposes aPourPremieresMunitionsParametresImposes;

	/**
	 * The cached value of the '{@link #getConcerneDemandeTir() <em>Concerne Demande Tir</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneDemandeTir()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation concerneDemandeTir;

	/**
	 * The cached value of the '{@link #getAPourDeclenchementDeclenchementTir() <em>APour Declenchement Declenchement Tir</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourDeclenchementDeclenchementTir()
	 * @generated
	 * @ordered
	 */
	protected TypeDeclenchementTir aPourDeclenchementDeclenchementTir;

	/**
	 * The cached value of the '{@link #getAPourCompteRenduCompteRenduTir() <em>APour Compte Rendu Compte Rendu Tir</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCompteRenduCompteRenduTir()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourCompteRenduCompteRenduTir;

	/**
	 * The cached value of the '{@link #getDemandeUsageTypeArme() <em>Demande Usage Type Arme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDemandeUsageTypeArme()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT demandeUsageTypeArme;

	/**
	 * The cached value of the '{@link #getAPourModalitesMiseEnPlaceTirModalitesMiseEnPlaceTir() <em>APour Modalites Mise En Place Tir Modalites Mise En Place Tir</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourModalitesMiseEnPlaceTirModalitesMiseEnPlaceTir()
	 * @generated
	 * @ordered
	 */
	protected TypeModalitesMiseEnPlaceTir aPourModalitesMiseEnPlaceTirModalitesMiseEnPlaceTir;

	/**
	 * The cached value of the '{@link #getAPourEmetteurUnite() <em>APour Emetteur Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourEmetteurUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourEmetteurUnite;

	/**
	 * The cached value of the '{@link #getAPourPointViseLocalisationGeometrique2D() <em>APour Point Vise Localisation Geometrique2 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourPointViseLocalisationGeometrique2D()
	 * @generated
	 * @ordered
	 */
	protected TypeLocalisationGeometrique2D aPourPointViseLocalisationGeometrique2D;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDirectiveTirImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeDirectiveTir();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoDirectiveTirCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoDirectiveTirCategorie newCategorie) {
		TypeDictionaryDicoDirectiveTirCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DIRECTIVE_TIR__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoDirectiveTirCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DIRECTIVE_TIR__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeDictionaryDicoDirectiveTirSousCategorie getSousCategorie() {
		return sousCategorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSousCategorie(TypeDictionaryDicoDirectiveTirSousCategorie newSousCategorie) {
		TypeDictionaryDicoDirectiveTirSousCategorie oldSousCategorie = sousCategorie;
		sousCategorie = newSousCategorie == null ? SOUS_CATEGORIE_EDEFAULT : newSousCategorie;
		boolean oldSousCategorieESet = sousCategorieESet;
		sousCategorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DIRECTIVE_TIR__SOUS_CATEGORIE, oldSousCategorie, sousCategorie, !oldSousCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSousCategorie() {
		TypeDictionaryDicoDirectiveTirSousCategorie oldSousCategorie = sousCategorie;
		boolean oldSousCategorieESet = sousCategorieESet;
		sousCategorie = SOUS_CATEGORIE_EDEFAULT;
		sousCategorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DIRECTIVE_TIR__SOUS_CATEGORIE, oldSousCategorie, SOUS_CATEGORIE_EDEFAULT, oldSousCategorieESet));
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
	public TypeDictionaryDicoTrajectoire getTrajectoire() {
		return trajectoire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrajectoire(TypeDictionaryDicoTrajectoire newTrajectoire) {
		TypeDictionaryDicoTrajectoire oldTrajectoire = trajectoire;
		trajectoire = newTrajectoire == null ? TRAJECTOIRE_EDEFAULT : newTrajectoire;
		boolean oldTrajectoireESet = trajectoireESet;
		trajectoireESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DIRECTIVE_TIR__TRAJECTOIRE, oldTrajectoire, trajectoire, !oldTrajectoireESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTrajectoire() {
		TypeDictionaryDicoTrajectoire oldTrajectoire = trajectoire;
		boolean oldTrajectoireESet = trajectoireESet;
		trajectoire = TRAJECTOIRE_EDEFAULT;
		trajectoireESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DIRECTIVE_TIR__TRAJECTOIRE, oldTrajectoire, TRAJECTOIRE_EDEFAULT, oldTrajectoireESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTrajectoire() {
		return trajectoireESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoModaliteFinTir getModaliteFinTir() {
		return modaliteFinTir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModaliteFinTir(TypeDictionaryDicoModaliteFinTir newModaliteFinTir) {
		TypeDictionaryDicoModaliteFinTir oldModaliteFinTir = modaliteFinTir;
		modaliteFinTir = newModaliteFinTir == null ? MODALITE_FIN_TIR_EDEFAULT : newModaliteFinTir;
		boolean oldModaliteFinTirESet = modaliteFinTirESet;
		modaliteFinTirESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DIRECTIVE_TIR__MODALITE_FIN_TIR, oldModaliteFinTir, modaliteFinTir, !oldModaliteFinTirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetModaliteFinTir() {
		TypeDictionaryDicoModaliteFinTir oldModaliteFinTir = modaliteFinTir;
		boolean oldModaliteFinTirESet = modaliteFinTirESet;
		modaliteFinTir = MODALITE_FIN_TIR_EDEFAULT;
		modaliteFinTirESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DIRECTIVE_TIR__MODALITE_FIN_TIR, oldModaliteFinTir, MODALITE_FIN_TIR_EDEFAULT, oldModaliteFinTirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetModaliteFinTir() {
		return modaliteFinTirESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DIRECTIVE_TIR__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DIRECTIVE_TIR__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAltitudePression getAltitude() {
		return altitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAltitude(TypeDataTypeAltitudePression newAltitude, NotificationChain msgs) {
		TypeDataTypeAltitudePression oldAltitude = altitude;
		altitude = newAltitude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DIRECTIVE_TIR__ALTITUDE, oldAltitude, newAltitude);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAltitude(TypeDataTypeAltitudePression newAltitude) {
		if (newAltitude != altitude) {
			NotificationChain msgs = null;
			if (altitude != null)
				msgs = ((InternalEObject)altitude).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DIRECTIVE_TIR__ALTITUDE, null, msgs);
			if (newAltitude != null)
				msgs = ((InternalEObject)newAltitude).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DIRECTIVE_TIR__ALTITUDE, null, msgs);
			msgs = basicSetAltitude(newAltitude, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DIRECTIVE_TIR__ALTITUDE, newAltitude, newAltitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeParametresImposes getAPourSecondesMunitionsParametresImposes() {
		return aPourSecondesMunitionsParametresImposes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourSecondesMunitionsParametresImposes(TypeParametresImposes newAPourSecondesMunitionsParametresImposes, NotificationChain msgs) {
		TypeParametresImposes oldAPourSecondesMunitionsParametresImposes = aPourSecondesMunitionsParametresImposes;
		aPourSecondesMunitionsParametresImposes = newAPourSecondesMunitionsParametresImposes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_SECONDES_MUNITIONS_PARAMETRES_IMPOSES, oldAPourSecondesMunitionsParametresImposes, newAPourSecondesMunitionsParametresImposes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourSecondesMunitionsParametresImposes(TypeParametresImposes newAPourSecondesMunitionsParametresImposes) {
		if (newAPourSecondesMunitionsParametresImposes != aPourSecondesMunitionsParametresImposes) {
			NotificationChain msgs = null;
			if (aPourSecondesMunitionsParametresImposes != null)
				msgs = ((InternalEObject)aPourSecondesMunitionsParametresImposes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_SECONDES_MUNITIONS_PARAMETRES_IMPOSES, null, msgs);
			if (newAPourSecondesMunitionsParametresImposes != null)
				msgs = ((InternalEObject)newAPourSecondesMunitionsParametresImposes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_SECONDES_MUNITIONS_PARAMETRES_IMPOSES, null, msgs);
			msgs = basicSetAPourSecondesMunitionsParametresImposes(newAPourSecondesMunitionsParametresImposes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_SECONDES_MUNITIONS_PARAMETRES_IMPOSES, newAPourSecondesMunitionsParametresImposes, newAPourSecondesMunitionsParametresImposes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeParametresImposes getAPourPremieresMunitionsParametresImposes() {
		return aPourPremieresMunitionsParametresImposes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourPremieresMunitionsParametresImposes(TypeParametresImposes newAPourPremieresMunitionsParametresImposes, NotificationChain msgs) {
		TypeParametresImposes oldAPourPremieresMunitionsParametresImposes = aPourPremieresMunitionsParametresImposes;
		aPourPremieresMunitionsParametresImposes = newAPourPremieresMunitionsParametresImposes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_PREMIERES_MUNITIONS_PARAMETRES_IMPOSES, oldAPourPremieresMunitionsParametresImposes, newAPourPremieresMunitionsParametresImposes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourPremieresMunitionsParametresImposes(TypeParametresImposes newAPourPremieresMunitionsParametresImposes) {
		if (newAPourPremieresMunitionsParametresImposes != aPourPremieresMunitionsParametresImposes) {
			NotificationChain msgs = null;
			if (aPourPremieresMunitionsParametresImposes != null)
				msgs = ((InternalEObject)aPourPremieresMunitionsParametresImposes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_PREMIERES_MUNITIONS_PARAMETRES_IMPOSES, null, msgs);
			if (newAPourPremieresMunitionsParametresImposes != null)
				msgs = ((InternalEObject)newAPourPremieresMunitionsParametresImposes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_PREMIERES_MUNITIONS_PARAMETRES_IMPOSES, null, msgs);
			msgs = basicSetAPourPremieresMunitionsParametresImposes(newAPourPremieresMunitionsParametresImposes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_PREMIERES_MUNITIONS_PARAMETRES_IMPOSES, newAPourPremieresMunitionsParametresImposes, newAPourPremieresMunitionsParametresImposes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getConcerneDemandeTir() {
		return concerneDemandeTir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcerneDemandeTir(TypeAssociation newConcerneDemandeTir, NotificationChain msgs) {
		TypeAssociation oldConcerneDemandeTir = concerneDemandeTir;
		concerneDemandeTir = newConcerneDemandeTir;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DIRECTIVE_TIR__CONCERNE_DEMANDE_TIR, oldConcerneDemandeTir, newConcerneDemandeTir);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcerneDemandeTir(TypeAssociation newConcerneDemandeTir) {
		if (newConcerneDemandeTir != concerneDemandeTir) {
			NotificationChain msgs = null;
			if (concerneDemandeTir != null)
				msgs = ((InternalEObject)concerneDemandeTir).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DIRECTIVE_TIR__CONCERNE_DEMANDE_TIR, null, msgs);
			if (newConcerneDemandeTir != null)
				msgs = ((InternalEObject)newConcerneDemandeTir).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DIRECTIVE_TIR__CONCERNE_DEMANDE_TIR, null, msgs);
			msgs = basicSetConcerneDemandeTir(newConcerneDemandeTir, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DIRECTIVE_TIR__CONCERNE_DEMANDE_TIR, newConcerneDemandeTir, newConcerneDemandeTir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDeclenchementTir getAPourDeclenchementDeclenchementTir() {
		return aPourDeclenchementDeclenchementTir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourDeclenchementDeclenchementTir(TypeDeclenchementTir newAPourDeclenchementDeclenchementTir, NotificationChain msgs) {
		TypeDeclenchementTir oldAPourDeclenchementDeclenchementTir = aPourDeclenchementDeclenchementTir;
		aPourDeclenchementDeclenchementTir = newAPourDeclenchementDeclenchementTir;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_DECLENCHEMENT_DECLENCHEMENT_TIR, oldAPourDeclenchementDeclenchementTir, newAPourDeclenchementDeclenchementTir);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourDeclenchementDeclenchementTir(TypeDeclenchementTir newAPourDeclenchementDeclenchementTir) {
		if (newAPourDeclenchementDeclenchementTir != aPourDeclenchementDeclenchementTir) {
			NotificationChain msgs = null;
			if (aPourDeclenchementDeclenchementTir != null)
				msgs = ((InternalEObject)aPourDeclenchementDeclenchementTir).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_DECLENCHEMENT_DECLENCHEMENT_TIR, null, msgs);
			if (newAPourDeclenchementDeclenchementTir != null)
				msgs = ((InternalEObject)newAPourDeclenchementDeclenchementTir).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_DECLENCHEMENT_DECLENCHEMENT_TIR, null, msgs);
			msgs = basicSetAPourDeclenchementDeclenchementTir(newAPourDeclenchementDeclenchementTir, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_DECLENCHEMENT_DECLENCHEMENT_TIR, newAPourDeclenchementDeclenchementTir, newAPourDeclenchementDeclenchementTir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourCompteRenduCompteRenduTir() {
		return aPourCompteRenduCompteRenduTir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourCompteRenduCompteRenduTir(TypeAssociation newAPourCompteRenduCompteRenduTir, NotificationChain msgs) {
		TypeAssociation oldAPourCompteRenduCompteRenduTir = aPourCompteRenduCompteRenduTir;
		aPourCompteRenduCompteRenduTir = newAPourCompteRenduCompteRenduTir;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_COMPTE_RENDU_COMPTE_RENDU_TIR, oldAPourCompteRenduCompteRenduTir, newAPourCompteRenduCompteRenduTir);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourCompteRenduCompteRenduTir(TypeAssociation newAPourCompteRenduCompteRenduTir) {
		if (newAPourCompteRenduCompteRenduTir != aPourCompteRenduCompteRenduTir) {
			NotificationChain msgs = null;
			if (aPourCompteRenduCompteRenduTir != null)
				msgs = ((InternalEObject)aPourCompteRenduCompteRenduTir).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_COMPTE_RENDU_COMPTE_RENDU_TIR, null, msgs);
			if (newAPourCompteRenduCompteRenduTir != null)
				msgs = ((InternalEObject)newAPourCompteRenduCompteRenduTir).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_COMPTE_RENDU_COMPTE_RENDU_TIR, null, msgs);
			msgs = basicSetAPourCompteRenduCompteRenduTir(newAPourCompteRenduCompteRenduTir, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_COMPTE_RENDU_COMPTE_RENDU_TIR, newAPourCompteRenduCompteRenduTir, newAPourCompteRenduCompteRenduTir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getDemandeUsageTypeArme() {
		return demandeUsageTypeArme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDemandeUsageTypeArme(TypeAssociationEXT newDemandeUsageTypeArme, NotificationChain msgs) {
		TypeAssociationEXT oldDemandeUsageTypeArme = demandeUsageTypeArme;
		demandeUsageTypeArme = newDemandeUsageTypeArme;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DIRECTIVE_TIR__DEMANDE_USAGE_TYPE_ARME, oldDemandeUsageTypeArme, newDemandeUsageTypeArme);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDemandeUsageTypeArme(TypeAssociationEXT newDemandeUsageTypeArme) {
		if (newDemandeUsageTypeArme != demandeUsageTypeArme) {
			NotificationChain msgs = null;
			if (demandeUsageTypeArme != null)
				msgs = ((InternalEObject)demandeUsageTypeArme).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DIRECTIVE_TIR__DEMANDE_USAGE_TYPE_ARME, null, msgs);
			if (newDemandeUsageTypeArme != null)
				msgs = ((InternalEObject)newDemandeUsageTypeArme).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DIRECTIVE_TIR__DEMANDE_USAGE_TYPE_ARME, null, msgs);
			msgs = basicSetDemandeUsageTypeArme(newDemandeUsageTypeArme, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DIRECTIVE_TIR__DEMANDE_USAGE_TYPE_ARME, newDemandeUsageTypeArme, newDemandeUsageTypeArme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeModalitesMiseEnPlaceTir getAPourModalitesMiseEnPlaceTirModalitesMiseEnPlaceTir() {
		return aPourModalitesMiseEnPlaceTirModalitesMiseEnPlaceTir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourModalitesMiseEnPlaceTirModalitesMiseEnPlaceTir(TypeModalitesMiseEnPlaceTir newAPourModalitesMiseEnPlaceTirModalitesMiseEnPlaceTir, NotificationChain msgs) {
		TypeModalitesMiseEnPlaceTir oldAPourModalitesMiseEnPlaceTirModalitesMiseEnPlaceTir = aPourModalitesMiseEnPlaceTirModalitesMiseEnPlaceTir;
		aPourModalitesMiseEnPlaceTirModalitesMiseEnPlaceTir = newAPourModalitesMiseEnPlaceTirModalitesMiseEnPlaceTir;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_MODALITES_MISE_EN_PLACE_TIR_MODALITES_MISE_EN_PLACE_TIR, oldAPourModalitesMiseEnPlaceTirModalitesMiseEnPlaceTir, newAPourModalitesMiseEnPlaceTirModalitesMiseEnPlaceTir);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourModalitesMiseEnPlaceTirModalitesMiseEnPlaceTir(TypeModalitesMiseEnPlaceTir newAPourModalitesMiseEnPlaceTirModalitesMiseEnPlaceTir) {
		if (newAPourModalitesMiseEnPlaceTirModalitesMiseEnPlaceTir != aPourModalitesMiseEnPlaceTirModalitesMiseEnPlaceTir) {
			NotificationChain msgs = null;
			if (aPourModalitesMiseEnPlaceTirModalitesMiseEnPlaceTir != null)
				msgs = ((InternalEObject)aPourModalitesMiseEnPlaceTirModalitesMiseEnPlaceTir).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_MODALITES_MISE_EN_PLACE_TIR_MODALITES_MISE_EN_PLACE_TIR, null, msgs);
			if (newAPourModalitesMiseEnPlaceTirModalitesMiseEnPlaceTir != null)
				msgs = ((InternalEObject)newAPourModalitesMiseEnPlaceTirModalitesMiseEnPlaceTir).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_MODALITES_MISE_EN_PLACE_TIR_MODALITES_MISE_EN_PLACE_TIR, null, msgs);
			msgs = basicSetAPourModalitesMiseEnPlaceTirModalitesMiseEnPlaceTir(newAPourModalitesMiseEnPlaceTirModalitesMiseEnPlaceTir, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_MODALITES_MISE_EN_PLACE_TIR_MODALITES_MISE_EN_PLACE_TIR, newAPourModalitesMiseEnPlaceTirModalitesMiseEnPlaceTir, newAPourModalitesMiseEnPlaceTirModalitesMiseEnPlaceTir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourEmetteurUnite() {
		return aPourEmetteurUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourEmetteurUnite(TypeAssociationEXT newAPourEmetteurUnite, NotificationChain msgs) {
		TypeAssociationEXT oldAPourEmetteurUnite = aPourEmetteurUnite;
		aPourEmetteurUnite = newAPourEmetteurUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_EMETTEUR_UNITE, oldAPourEmetteurUnite, newAPourEmetteurUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourEmetteurUnite(TypeAssociationEXT newAPourEmetteurUnite) {
		if (newAPourEmetteurUnite != aPourEmetteurUnite) {
			NotificationChain msgs = null;
			if (aPourEmetteurUnite != null)
				msgs = ((InternalEObject)aPourEmetteurUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_EMETTEUR_UNITE, null, msgs);
			if (newAPourEmetteurUnite != null)
				msgs = ((InternalEObject)newAPourEmetteurUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_EMETTEUR_UNITE, null, msgs);
			msgs = basicSetAPourEmetteurUnite(newAPourEmetteurUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_EMETTEUR_UNITE, newAPourEmetteurUnite, newAPourEmetteurUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeLocalisationGeometrique2D getAPourPointViseLocalisationGeometrique2D() {
		return aPourPointViseLocalisationGeometrique2D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourPointViseLocalisationGeometrique2D(TypeLocalisationGeometrique2D newAPourPointViseLocalisationGeometrique2D, NotificationChain msgs) {
		TypeLocalisationGeometrique2D oldAPourPointViseLocalisationGeometrique2D = aPourPointViseLocalisationGeometrique2D;
		aPourPointViseLocalisationGeometrique2D = newAPourPointViseLocalisationGeometrique2D;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_POINT_VISE_LOCALISATION_GEOMETRIQUE2_D, oldAPourPointViseLocalisationGeometrique2D, newAPourPointViseLocalisationGeometrique2D);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourPointViseLocalisationGeometrique2D(TypeLocalisationGeometrique2D newAPourPointViseLocalisationGeometrique2D) {
		if (newAPourPointViseLocalisationGeometrique2D != aPourPointViseLocalisationGeometrique2D) {
			NotificationChain msgs = null;
			if (aPourPointViseLocalisationGeometrique2D != null)
				msgs = ((InternalEObject)aPourPointViseLocalisationGeometrique2D).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_POINT_VISE_LOCALISATION_GEOMETRIQUE2_D, null, msgs);
			if (newAPourPointViseLocalisationGeometrique2D != null)
				msgs = ((InternalEObject)newAPourPointViseLocalisationGeometrique2D).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_POINT_VISE_LOCALISATION_GEOMETRIQUE2_D, null, msgs);
			msgs = basicSetAPourPointViseLocalisationGeometrique2D(newAPourPointViseLocalisationGeometrique2D, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_POINT_VISE_LOCALISATION_GEOMETRIQUE2_D, newAPourPointViseLocalisationGeometrique2D, newAPourPointViseLocalisationGeometrique2D));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_DIRECTIVE_TIR__ALTITUDE:
				return basicSetAltitude(null, msgs);
			case SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_SECONDES_MUNITIONS_PARAMETRES_IMPOSES:
				return basicSetAPourSecondesMunitionsParametresImposes(null, msgs);
			case SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_PREMIERES_MUNITIONS_PARAMETRES_IMPOSES:
				return basicSetAPourPremieresMunitionsParametresImposes(null, msgs);
			case SchemaPackage.TYPE_DIRECTIVE_TIR__CONCERNE_DEMANDE_TIR:
				return basicSetConcerneDemandeTir(null, msgs);
			case SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_DECLENCHEMENT_DECLENCHEMENT_TIR:
				return basicSetAPourDeclenchementDeclenchementTir(null, msgs);
			case SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_COMPTE_RENDU_COMPTE_RENDU_TIR:
				return basicSetAPourCompteRenduCompteRenduTir(null, msgs);
			case SchemaPackage.TYPE_DIRECTIVE_TIR__DEMANDE_USAGE_TYPE_ARME:
				return basicSetDemandeUsageTypeArme(null, msgs);
			case SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_MODALITES_MISE_EN_PLACE_TIR_MODALITES_MISE_EN_PLACE_TIR:
				return basicSetAPourModalitesMiseEnPlaceTirModalitesMiseEnPlaceTir(null, msgs);
			case SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_EMETTEUR_UNITE:
				return basicSetAPourEmetteurUnite(null, msgs);
			case SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_POINT_VISE_LOCALISATION_GEOMETRIQUE2_D:
				return basicSetAPourPointViseLocalisationGeometrique2D(null, msgs);
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
			case SchemaPackage.TYPE_DIRECTIVE_TIR__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_DIRECTIVE_TIR__SOUS_CATEGORIE:
				return getSousCategorie();
			case SchemaPackage.TYPE_DIRECTIVE_TIR__TRAJECTOIRE:
				return getTrajectoire();
			case SchemaPackage.TYPE_DIRECTIVE_TIR__MODALITE_FIN_TIR:
				return getModaliteFinTir();
			case SchemaPackage.TYPE_DIRECTIVE_TIR__CTE:
				return getCTE();
			case SchemaPackage.TYPE_DIRECTIVE_TIR__CE:
				return getCE();
			case SchemaPackage.TYPE_DIRECTIVE_TIR__ALTITUDE:
				return getAltitude();
			case SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_SECONDES_MUNITIONS_PARAMETRES_IMPOSES:
				return getAPourSecondesMunitionsParametresImposes();
			case SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_PREMIERES_MUNITIONS_PARAMETRES_IMPOSES:
				return getAPourPremieresMunitionsParametresImposes();
			case SchemaPackage.TYPE_DIRECTIVE_TIR__CONCERNE_DEMANDE_TIR:
				return getConcerneDemandeTir();
			case SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_DECLENCHEMENT_DECLENCHEMENT_TIR:
				return getAPourDeclenchementDeclenchementTir();
			case SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_COMPTE_RENDU_COMPTE_RENDU_TIR:
				return getAPourCompteRenduCompteRenduTir();
			case SchemaPackage.TYPE_DIRECTIVE_TIR__DEMANDE_USAGE_TYPE_ARME:
				return getDemandeUsageTypeArme();
			case SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_MODALITES_MISE_EN_PLACE_TIR_MODALITES_MISE_EN_PLACE_TIR:
				return getAPourModalitesMiseEnPlaceTirModalitesMiseEnPlaceTir();
			case SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_EMETTEUR_UNITE:
				return getAPourEmetteurUnite();
			case SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_POINT_VISE_LOCALISATION_GEOMETRIQUE2_D:
				return getAPourPointViseLocalisationGeometrique2D();
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
			case SchemaPackage.TYPE_DIRECTIVE_TIR__CATEGORIE:
				setCategorie((TypeDictionaryDicoDirectiveTirCategorie)newValue);
				return;
			case SchemaPackage.TYPE_DIRECTIVE_TIR__SOUS_CATEGORIE:
				setSousCategorie((TypeDictionaryDicoDirectiveTirSousCategorie)newValue);
				return;
			case SchemaPackage.TYPE_DIRECTIVE_TIR__TRAJECTOIRE:
				setTrajectoire((TypeDictionaryDicoTrajectoire)newValue);
				return;
			case SchemaPackage.TYPE_DIRECTIVE_TIR__MODALITE_FIN_TIR:
				setModaliteFinTir((TypeDictionaryDicoModaliteFinTir)newValue);
				return;
			case SchemaPackage.TYPE_DIRECTIVE_TIR__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_DIRECTIVE_TIR__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_DIRECTIVE_TIR__ALTITUDE:
				setAltitude((TypeDataTypeAltitudePression)newValue);
				return;
			case SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_SECONDES_MUNITIONS_PARAMETRES_IMPOSES:
				setAPourSecondesMunitionsParametresImposes((TypeParametresImposes)newValue);
				return;
			case SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_PREMIERES_MUNITIONS_PARAMETRES_IMPOSES:
				setAPourPremieresMunitionsParametresImposes((TypeParametresImposes)newValue);
				return;
			case SchemaPackage.TYPE_DIRECTIVE_TIR__CONCERNE_DEMANDE_TIR:
				setConcerneDemandeTir((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_DECLENCHEMENT_DECLENCHEMENT_TIR:
				setAPourDeclenchementDeclenchementTir((TypeDeclenchementTir)newValue);
				return;
			case SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_COMPTE_RENDU_COMPTE_RENDU_TIR:
				setAPourCompteRenduCompteRenduTir((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_DIRECTIVE_TIR__DEMANDE_USAGE_TYPE_ARME:
				setDemandeUsageTypeArme((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_MODALITES_MISE_EN_PLACE_TIR_MODALITES_MISE_EN_PLACE_TIR:
				setAPourModalitesMiseEnPlaceTirModalitesMiseEnPlaceTir((TypeModalitesMiseEnPlaceTir)newValue);
				return;
			case SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_EMETTEUR_UNITE:
				setAPourEmetteurUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_POINT_VISE_LOCALISATION_GEOMETRIQUE2_D:
				setAPourPointViseLocalisationGeometrique2D((TypeLocalisationGeometrique2D)newValue);
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
			case SchemaPackage.TYPE_DIRECTIVE_TIR__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_DIRECTIVE_TIR__SOUS_CATEGORIE:
				unsetSousCategorie();
				return;
			case SchemaPackage.TYPE_DIRECTIVE_TIR__TRAJECTOIRE:
				unsetTrajectoire();
				return;
			case SchemaPackage.TYPE_DIRECTIVE_TIR__MODALITE_FIN_TIR:
				unsetModaliteFinTir();
				return;
			case SchemaPackage.TYPE_DIRECTIVE_TIR__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DIRECTIVE_TIR__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DIRECTIVE_TIR__ALTITUDE:
				setAltitude((TypeDataTypeAltitudePression)null);
				return;
			case SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_SECONDES_MUNITIONS_PARAMETRES_IMPOSES:
				setAPourSecondesMunitionsParametresImposes((TypeParametresImposes)null);
				return;
			case SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_PREMIERES_MUNITIONS_PARAMETRES_IMPOSES:
				setAPourPremieresMunitionsParametresImposes((TypeParametresImposes)null);
				return;
			case SchemaPackage.TYPE_DIRECTIVE_TIR__CONCERNE_DEMANDE_TIR:
				setConcerneDemandeTir((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_DECLENCHEMENT_DECLENCHEMENT_TIR:
				setAPourDeclenchementDeclenchementTir((TypeDeclenchementTir)null);
				return;
			case SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_COMPTE_RENDU_COMPTE_RENDU_TIR:
				setAPourCompteRenduCompteRenduTir((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_DIRECTIVE_TIR__DEMANDE_USAGE_TYPE_ARME:
				setDemandeUsageTypeArme((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_MODALITES_MISE_EN_PLACE_TIR_MODALITES_MISE_EN_PLACE_TIR:
				setAPourModalitesMiseEnPlaceTirModalitesMiseEnPlaceTir((TypeModalitesMiseEnPlaceTir)null);
				return;
			case SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_EMETTEUR_UNITE:
				setAPourEmetteurUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_POINT_VISE_LOCALISATION_GEOMETRIQUE2_D:
				setAPourPointViseLocalisationGeometrique2D((TypeLocalisationGeometrique2D)null);
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
			case SchemaPackage.TYPE_DIRECTIVE_TIR__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_DIRECTIVE_TIR__SOUS_CATEGORIE:
				return isSetSousCategorie();
			case SchemaPackage.TYPE_DIRECTIVE_TIR__TRAJECTOIRE:
				return isSetTrajectoire();
			case SchemaPackage.TYPE_DIRECTIVE_TIR__MODALITE_FIN_TIR:
				return isSetModaliteFinTir();
			case SchemaPackage.TYPE_DIRECTIVE_TIR__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_DIRECTIVE_TIR__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_DIRECTIVE_TIR__ALTITUDE:
				return altitude != null;
			case SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_SECONDES_MUNITIONS_PARAMETRES_IMPOSES:
				return aPourSecondesMunitionsParametresImposes != null;
			case SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_PREMIERES_MUNITIONS_PARAMETRES_IMPOSES:
				return aPourPremieresMunitionsParametresImposes != null;
			case SchemaPackage.TYPE_DIRECTIVE_TIR__CONCERNE_DEMANDE_TIR:
				return concerneDemandeTir != null;
			case SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_DECLENCHEMENT_DECLENCHEMENT_TIR:
				return aPourDeclenchementDeclenchementTir != null;
			case SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_COMPTE_RENDU_COMPTE_RENDU_TIR:
				return aPourCompteRenduCompteRenduTir != null;
			case SchemaPackage.TYPE_DIRECTIVE_TIR__DEMANDE_USAGE_TYPE_ARME:
				return demandeUsageTypeArme != null;
			case SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_MODALITES_MISE_EN_PLACE_TIR_MODALITES_MISE_EN_PLACE_TIR:
				return aPourModalitesMiseEnPlaceTirModalitesMiseEnPlaceTir != null;
			case SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_EMETTEUR_UNITE:
				return aPourEmetteurUnite != null;
			case SchemaPackage.TYPE_DIRECTIVE_TIR__APOUR_POINT_VISE_LOCALISATION_GEOMETRIQUE2_D:
				return aPourPointViseLocalisationGeometrique2D != null;
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
		result.append(", trajectoire: ");
		if (trajectoireESet) result.append(trajectoire); else result.append("<unset>");
		result.append(", modaliteFinTir: ");
		if (modaliteFinTirESet) result.append(modaliteFinTir); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeDirectiveTirImpl
