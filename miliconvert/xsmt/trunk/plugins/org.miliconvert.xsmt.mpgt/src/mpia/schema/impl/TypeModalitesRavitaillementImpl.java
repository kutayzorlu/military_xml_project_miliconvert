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
import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoZoneLogistiqueType;
import mpia.schema.TypeDotationEffectiveConsommable;
import mpia.schema.TypeModalitesRavitaillement;

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
 * An implementation of the model object '<em><b>Type Modalites Ravitaillement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeModalitesRavitaillementImpl#getDebutPerceptionOuLivraison <em>Debut Perception Ou Livraison</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModalitesRavitaillementImpl#getTypeVecteurTransport <em>Type Vecteur Transport</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModalitesRavitaillementImpl#getNombreVecteursTransport <em>Nombre Vecteurs Transport</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModalitesRavitaillementImpl#getTypeFormationLogistique <em>Type Formation Logistique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModalitesRavitaillementImpl#getAutreTypeFormationLogistique <em>Autre Type Formation Logistique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModalitesRavitaillementImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModalitesRavitaillementImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModalitesRavitaillementImpl#getAPourUnitePerceptionOuLivraisonUnite <em>APour Unite Perception Ou Livraison Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModalitesRavitaillementImpl#getAPourLieuPerceptionOuLivraisonAutreElementControle <em>APour Lieu Perception Ou Livraison Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModalitesRavitaillementImpl#getDoitLivrerOuPercevoirDotationEffectiveConsommable <em>Doit Livrer Ou Percevoir Dotation Effective Consommable</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModalitesRavitaillementImpl#getAPourBeneficiaireUnite <em>APour Beneficiaire Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeModalitesRavitaillementImpl extends EObjectImpl implements TypeModalitesRavitaillement {
	/**
	 * The default value of the '{@link #getDebutPerceptionOuLivraison() <em>Debut Perception Ou Livraison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebutPerceptionOuLivraison()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DEBUT_PERCEPTION_OU_LIVRAISON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDebutPerceptionOuLivraison() <em>Debut Perception Ou Livraison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebutPerceptionOuLivraison()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar debutPerceptionOuLivraison = DEBUT_PERCEPTION_OU_LIVRAISON_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeVecteurTransport() <em>Type Vecteur Transport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeVecteurTransport()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_VECTEUR_TRANSPORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeVecteurTransport() <em>Type Vecteur Transport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeVecteurTransport()
	 * @generated
	 * @ordered
	 */
	protected String typeVecteurTransport = TYPE_VECTEUR_TRANSPORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNombreVecteursTransport() <em>Nombre Vecteurs Transport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreVecteursTransport()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_VECTEURS_TRANSPORT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreVecteursTransport() <em>Nombre Vecteurs Transport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreVecteursTransport()
	 * @generated
	 * @ordered
	 */
	protected long nombreVecteursTransport = NOMBRE_VECTEURS_TRANSPORT_EDEFAULT;

	/**
	 * This is true if the Nombre Vecteurs Transport attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreVecteursTransportESet;

	/**
	 * The default value of the '{@link #getTypeFormationLogistique() <em>Type Formation Logistique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeFormationLogistique()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoZoneLogistiqueType TYPE_FORMATION_LOGISTIQUE_EDEFAULT = TypeDictionaryDicoZoneLogistiqueType.TLA;

	/**
	 * The cached value of the '{@link #getTypeFormationLogistique() <em>Type Formation Logistique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeFormationLogistique()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoZoneLogistiqueType typeFormationLogistique = TYPE_FORMATION_LOGISTIQUE_EDEFAULT;

	/**
	 * This is true if the Type Formation Logistique attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeFormationLogistiqueESet;

	/**
	 * The default value of the '{@link #getAutreTypeFormationLogistique() <em>Autre Type Formation Logistique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreTypeFormationLogistique()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTRE_TYPE_FORMATION_LOGISTIQUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutreTypeFormationLogistique() <em>Autre Type Formation Logistique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreTypeFormationLogistique()
	 * @generated
	 * @ordered
	 */
	protected String autreTypeFormationLogistique = AUTRE_TYPE_FORMATION_LOGISTIQUE_EDEFAULT;

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
	 * The cached value of the '{@link #getAPourUnitePerceptionOuLivraisonUnite() <em>APour Unite Perception Ou Livraison Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUnitePerceptionOuLivraisonUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourUnitePerceptionOuLivraisonUnite;

	/**
	 * The cached value of the '{@link #getAPourLieuPerceptionOuLivraisonAutreElementControle() <em>APour Lieu Perception Ou Livraison Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourLieuPerceptionOuLivraisonAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourLieuPerceptionOuLivraisonAutreElementControle;

	/**
	 * The cached value of the '{@link #getDoitLivrerOuPercevoirDotationEffectiveConsommable() <em>Doit Livrer Ou Percevoir Dotation Effective Consommable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoitLivrerOuPercevoirDotationEffectiveConsommable()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeDotationEffectiveConsommable> doitLivrerOuPercevoirDotationEffectiveConsommable;

	/**
	 * The cached value of the '{@link #getAPourBeneficiaireUnite() <em>APour Beneficiaire Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourBeneficiaireUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociationEXT> aPourBeneficiaireUnite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeModalitesRavitaillementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeModalitesRavitaillement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDebutPerceptionOuLivraison() {
		return debutPerceptionOuLivraison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebutPerceptionOuLivraison(XMLGregorianCalendar newDebutPerceptionOuLivraison) {
		XMLGregorianCalendar oldDebutPerceptionOuLivraison = debutPerceptionOuLivraison;
		debutPerceptionOuLivraison = newDebutPerceptionOuLivraison;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__DEBUT_PERCEPTION_OU_LIVRAISON, oldDebutPerceptionOuLivraison, debutPerceptionOuLivraison));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeVecteurTransport() {
		return typeVecteurTransport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeVecteurTransport(String newTypeVecteurTransport) {
		String oldTypeVecteurTransport = typeVecteurTransport;
		typeVecteurTransport = newTypeVecteurTransport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__TYPE_VECTEUR_TRANSPORT, oldTypeVecteurTransport, typeVecteurTransport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreVecteursTransport() {
		return nombreVecteursTransport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreVecteursTransport(long newNombreVecteursTransport) {
		long oldNombreVecteursTransport = nombreVecteursTransport;
		nombreVecteursTransport = newNombreVecteursTransport;
		boolean oldNombreVecteursTransportESet = nombreVecteursTransportESet;
		nombreVecteursTransportESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__NOMBRE_VECTEURS_TRANSPORT, oldNombreVecteursTransport, nombreVecteursTransport, !oldNombreVecteursTransportESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreVecteursTransport() {
		long oldNombreVecteursTransport = nombreVecteursTransport;
		boolean oldNombreVecteursTransportESet = nombreVecteursTransportESet;
		nombreVecteursTransport = NOMBRE_VECTEURS_TRANSPORT_EDEFAULT;
		nombreVecteursTransportESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__NOMBRE_VECTEURS_TRANSPORT, oldNombreVecteursTransport, NOMBRE_VECTEURS_TRANSPORT_EDEFAULT, oldNombreVecteursTransportESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreVecteursTransport() {
		return nombreVecteursTransportESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoZoneLogistiqueType getTypeFormationLogistique() {
		return typeFormationLogistique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeFormationLogistique(TypeDictionaryDicoZoneLogistiqueType newTypeFormationLogistique) {
		TypeDictionaryDicoZoneLogistiqueType oldTypeFormationLogistique = typeFormationLogistique;
		typeFormationLogistique = newTypeFormationLogistique == null ? TYPE_FORMATION_LOGISTIQUE_EDEFAULT : newTypeFormationLogistique;
		boolean oldTypeFormationLogistiqueESet = typeFormationLogistiqueESet;
		typeFormationLogistiqueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__TYPE_FORMATION_LOGISTIQUE, oldTypeFormationLogistique, typeFormationLogistique, !oldTypeFormationLogistiqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeFormationLogistique() {
		TypeDictionaryDicoZoneLogistiqueType oldTypeFormationLogistique = typeFormationLogistique;
		boolean oldTypeFormationLogistiqueESet = typeFormationLogistiqueESet;
		typeFormationLogistique = TYPE_FORMATION_LOGISTIQUE_EDEFAULT;
		typeFormationLogistiqueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__TYPE_FORMATION_LOGISTIQUE, oldTypeFormationLogistique, TYPE_FORMATION_LOGISTIQUE_EDEFAULT, oldTypeFormationLogistiqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeFormationLogistique() {
		return typeFormationLogistiqueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutreTypeFormationLogistique() {
		return autreTypeFormationLogistique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutreTypeFormationLogistique(String newAutreTypeFormationLogistique) {
		String oldAutreTypeFormationLogistique = autreTypeFormationLogistique;
		autreTypeFormationLogistique = newAutreTypeFormationLogistique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__AUTRE_TYPE_FORMATION_LOGISTIQUE, oldAutreTypeFormationLogistique, autreTypeFormationLogistique));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourUnitePerceptionOuLivraisonUnite() {
		return aPourUnitePerceptionOuLivraisonUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourUnitePerceptionOuLivraisonUnite(TypeAssociationEXT newAPourUnitePerceptionOuLivraisonUnite, NotificationChain msgs) {
		TypeAssociationEXT oldAPourUnitePerceptionOuLivraisonUnite = aPourUnitePerceptionOuLivraisonUnite;
		aPourUnitePerceptionOuLivraisonUnite = newAPourUnitePerceptionOuLivraisonUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__APOUR_UNITE_PERCEPTION_OU_LIVRAISON_UNITE, oldAPourUnitePerceptionOuLivraisonUnite, newAPourUnitePerceptionOuLivraisonUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourUnitePerceptionOuLivraisonUnite(TypeAssociationEXT newAPourUnitePerceptionOuLivraisonUnite) {
		if (newAPourUnitePerceptionOuLivraisonUnite != aPourUnitePerceptionOuLivraisonUnite) {
			NotificationChain msgs = null;
			if (aPourUnitePerceptionOuLivraisonUnite != null)
				msgs = ((InternalEObject)aPourUnitePerceptionOuLivraisonUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__APOUR_UNITE_PERCEPTION_OU_LIVRAISON_UNITE, null, msgs);
			if (newAPourUnitePerceptionOuLivraisonUnite != null)
				msgs = ((InternalEObject)newAPourUnitePerceptionOuLivraisonUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__APOUR_UNITE_PERCEPTION_OU_LIVRAISON_UNITE, null, msgs);
			msgs = basicSetAPourUnitePerceptionOuLivraisonUnite(newAPourUnitePerceptionOuLivraisonUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__APOUR_UNITE_PERCEPTION_OU_LIVRAISON_UNITE, newAPourUnitePerceptionOuLivraisonUnite, newAPourUnitePerceptionOuLivraisonUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourLieuPerceptionOuLivraisonAutreElementControle() {
		return aPourLieuPerceptionOuLivraisonAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourLieuPerceptionOuLivraisonAutreElementControle(TypeAssociation newAPourLieuPerceptionOuLivraisonAutreElementControle, NotificationChain msgs) {
		TypeAssociation oldAPourLieuPerceptionOuLivraisonAutreElementControle = aPourLieuPerceptionOuLivraisonAutreElementControle;
		aPourLieuPerceptionOuLivraisonAutreElementControle = newAPourLieuPerceptionOuLivraisonAutreElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__APOUR_LIEU_PERCEPTION_OU_LIVRAISON_AUTRE_ELEMENT_CONTROLE, oldAPourLieuPerceptionOuLivraisonAutreElementControle, newAPourLieuPerceptionOuLivraisonAutreElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourLieuPerceptionOuLivraisonAutreElementControle(TypeAssociation newAPourLieuPerceptionOuLivraisonAutreElementControle) {
		if (newAPourLieuPerceptionOuLivraisonAutreElementControle != aPourLieuPerceptionOuLivraisonAutreElementControle) {
			NotificationChain msgs = null;
			if (aPourLieuPerceptionOuLivraisonAutreElementControle != null)
				msgs = ((InternalEObject)aPourLieuPerceptionOuLivraisonAutreElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__APOUR_LIEU_PERCEPTION_OU_LIVRAISON_AUTRE_ELEMENT_CONTROLE, null, msgs);
			if (newAPourLieuPerceptionOuLivraisonAutreElementControle != null)
				msgs = ((InternalEObject)newAPourLieuPerceptionOuLivraisonAutreElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__APOUR_LIEU_PERCEPTION_OU_LIVRAISON_AUTRE_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetAPourLieuPerceptionOuLivraisonAutreElementControle(newAPourLieuPerceptionOuLivraisonAutreElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__APOUR_LIEU_PERCEPTION_OU_LIVRAISON_AUTRE_ELEMENT_CONTROLE, newAPourLieuPerceptionOuLivraisonAutreElementControle, newAPourLieuPerceptionOuLivraisonAutreElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDotationEffectiveConsommable> getDoitLivrerOuPercevoirDotationEffectiveConsommable() {
		if (doitLivrerOuPercevoirDotationEffectiveConsommable == null) {
			doitLivrerOuPercevoirDotationEffectiveConsommable = new EObjectContainmentEList<TypeDotationEffectiveConsommable>(TypeDotationEffectiveConsommable.class, this, SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__DOIT_LIVRER_OU_PERCEVOIR_DOTATION_EFFECTIVE_CONSOMMABLE);
		}
		return doitLivrerOuPercevoirDotationEffectiveConsommable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEXT> getAPourBeneficiaireUnite() {
		if (aPourBeneficiaireUnite == null) {
			aPourBeneficiaireUnite = new EObjectContainmentEList<TypeAssociationEXT>(TypeAssociationEXT.class, this, SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__APOUR_BENEFICIAIRE_UNITE);
		}
		return aPourBeneficiaireUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__APOUR_UNITE_PERCEPTION_OU_LIVRAISON_UNITE:
				return basicSetAPourUnitePerceptionOuLivraisonUnite(null, msgs);
			case SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__APOUR_LIEU_PERCEPTION_OU_LIVRAISON_AUTRE_ELEMENT_CONTROLE:
				return basicSetAPourLieuPerceptionOuLivraisonAutreElementControle(null, msgs);
			case SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__DOIT_LIVRER_OU_PERCEVOIR_DOTATION_EFFECTIVE_CONSOMMABLE:
				return ((InternalEList<?>)getDoitLivrerOuPercevoirDotationEffectiveConsommable()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__APOUR_BENEFICIAIRE_UNITE:
				return ((InternalEList<?>)getAPourBeneficiaireUnite()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__DEBUT_PERCEPTION_OU_LIVRAISON:
				return getDebutPerceptionOuLivraison();
			case SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__TYPE_VECTEUR_TRANSPORT:
				return getTypeVecteurTransport();
			case SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__NOMBRE_VECTEURS_TRANSPORT:
				return new Long(getNombreVecteursTransport());
			case SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__TYPE_FORMATION_LOGISTIQUE:
				return getTypeFormationLogistique();
			case SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__AUTRE_TYPE_FORMATION_LOGISTIQUE:
				return getAutreTypeFormationLogistique();
			case SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__CTE:
				return getCTE();
			case SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__CE:
				return getCE();
			case SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__APOUR_UNITE_PERCEPTION_OU_LIVRAISON_UNITE:
				return getAPourUnitePerceptionOuLivraisonUnite();
			case SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__APOUR_LIEU_PERCEPTION_OU_LIVRAISON_AUTRE_ELEMENT_CONTROLE:
				return getAPourLieuPerceptionOuLivraisonAutreElementControle();
			case SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__DOIT_LIVRER_OU_PERCEVOIR_DOTATION_EFFECTIVE_CONSOMMABLE:
				return getDoitLivrerOuPercevoirDotationEffectiveConsommable();
			case SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__APOUR_BENEFICIAIRE_UNITE:
				return getAPourBeneficiaireUnite();
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
			case SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__DEBUT_PERCEPTION_OU_LIVRAISON:
				setDebutPerceptionOuLivraison((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__TYPE_VECTEUR_TRANSPORT:
				setTypeVecteurTransport((String)newValue);
				return;
			case SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__NOMBRE_VECTEURS_TRANSPORT:
				setNombreVecteursTransport(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__TYPE_FORMATION_LOGISTIQUE:
				setTypeFormationLogistique((TypeDictionaryDicoZoneLogistiqueType)newValue);
				return;
			case SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__AUTRE_TYPE_FORMATION_LOGISTIQUE:
				setAutreTypeFormationLogistique((String)newValue);
				return;
			case SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__APOUR_UNITE_PERCEPTION_OU_LIVRAISON_UNITE:
				setAPourUnitePerceptionOuLivraisonUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__APOUR_LIEU_PERCEPTION_OU_LIVRAISON_AUTRE_ELEMENT_CONTROLE:
				setAPourLieuPerceptionOuLivraisonAutreElementControle((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__DOIT_LIVRER_OU_PERCEVOIR_DOTATION_EFFECTIVE_CONSOMMABLE:
				getDoitLivrerOuPercevoirDotationEffectiveConsommable().clear();
				getDoitLivrerOuPercevoirDotationEffectiveConsommable().addAll((Collection<? extends TypeDotationEffectiveConsommable>)newValue);
				return;
			case SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__APOUR_BENEFICIAIRE_UNITE:
				getAPourBeneficiaireUnite().clear();
				getAPourBeneficiaireUnite().addAll((Collection<? extends TypeAssociationEXT>)newValue);
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
			case SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__DEBUT_PERCEPTION_OU_LIVRAISON:
				setDebutPerceptionOuLivraison(DEBUT_PERCEPTION_OU_LIVRAISON_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__TYPE_VECTEUR_TRANSPORT:
				setTypeVecteurTransport(TYPE_VECTEUR_TRANSPORT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__NOMBRE_VECTEURS_TRANSPORT:
				unsetNombreVecteursTransport();
				return;
			case SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__TYPE_FORMATION_LOGISTIQUE:
				unsetTypeFormationLogistique();
				return;
			case SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__AUTRE_TYPE_FORMATION_LOGISTIQUE:
				setAutreTypeFormationLogistique(AUTRE_TYPE_FORMATION_LOGISTIQUE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__APOUR_UNITE_PERCEPTION_OU_LIVRAISON_UNITE:
				setAPourUnitePerceptionOuLivraisonUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__APOUR_LIEU_PERCEPTION_OU_LIVRAISON_AUTRE_ELEMENT_CONTROLE:
				setAPourLieuPerceptionOuLivraisonAutreElementControle((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__DOIT_LIVRER_OU_PERCEVOIR_DOTATION_EFFECTIVE_CONSOMMABLE:
				getDoitLivrerOuPercevoirDotationEffectiveConsommable().clear();
				return;
			case SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__APOUR_BENEFICIAIRE_UNITE:
				getAPourBeneficiaireUnite().clear();
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
			case SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__DEBUT_PERCEPTION_OU_LIVRAISON:
				return DEBUT_PERCEPTION_OU_LIVRAISON_EDEFAULT == null ? debutPerceptionOuLivraison != null : !DEBUT_PERCEPTION_OU_LIVRAISON_EDEFAULT.equals(debutPerceptionOuLivraison);
			case SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__TYPE_VECTEUR_TRANSPORT:
				return TYPE_VECTEUR_TRANSPORT_EDEFAULT == null ? typeVecteurTransport != null : !TYPE_VECTEUR_TRANSPORT_EDEFAULT.equals(typeVecteurTransport);
			case SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__NOMBRE_VECTEURS_TRANSPORT:
				return isSetNombreVecteursTransport();
			case SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__TYPE_FORMATION_LOGISTIQUE:
				return isSetTypeFormationLogistique();
			case SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__AUTRE_TYPE_FORMATION_LOGISTIQUE:
				return AUTRE_TYPE_FORMATION_LOGISTIQUE_EDEFAULT == null ? autreTypeFormationLogistique != null : !AUTRE_TYPE_FORMATION_LOGISTIQUE_EDEFAULT.equals(autreTypeFormationLogistique);
			case SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__APOUR_UNITE_PERCEPTION_OU_LIVRAISON_UNITE:
				return aPourUnitePerceptionOuLivraisonUnite != null;
			case SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__APOUR_LIEU_PERCEPTION_OU_LIVRAISON_AUTRE_ELEMENT_CONTROLE:
				return aPourLieuPerceptionOuLivraisonAutreElementControle != null;
			case SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__DOIT_LIVRER_OU_PERCEVOIR_DOTATION_EFFECTIVE_CONSOMMABLE:
				return doitLivrerOuPercevoirDotationEffectiveConsommable != null && !doitLivrerOuPercevoirDotationEffectiveConsommable.isEmpty();
			case SchemaPackage.TYPE_MODALITES_RAVITAILLEMENT__APOUR_BENEFICIAIRE_UNITE:
				return aPourBeneficiaireUnite != null && !aPourBeneficiaireUnite.isEmpty();
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
		result.append(" (debutPerceptionOuLivraison: ");
		result.append(debutPerceptionOuLivraison);
		result.append(", typeVecteurTransport: ");
		result.append(typeVecteurTransport);
		result.append(", nombreVecteursTransport: ");
		if (nombreVecteursTransportESet) result.append(nombreVecteursTransport); else result.append("<unset>");
		result.append(", typeFormationLogistique: ");
		if (typeFormationLogistiqueESet) result.append(typeFormationLogistique); else result.append("<unset>");
		result.append(", autreTypeFormationLogistique: ");
		result.append(autreTypeFormationLogistique);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeModalitesRavitaillementImpl
