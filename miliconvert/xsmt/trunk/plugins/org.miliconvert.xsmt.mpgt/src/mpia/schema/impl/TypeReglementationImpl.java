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

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCoordination4D;
import mpia.schema.TypeDictionaryDicoReglementationCategorie;
import mpia.schema.TypeDictionaryDicoReglementationConditionsAcces;
import mpia.schema.TypeReglementation;

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
 * An implementation of the model object '<em><b>Type Reglementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeReglementationImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeReglementationImpl#getConditionsAcces <em>Conditions Acces</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeReglementationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeReglementationImpl#getFonctionResponsable <em>Fonction Responsable</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeReglementationImpl#getNomEtRangResponsable <em>Nom Et Rang Responsable</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeReglementationImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeReglementationImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeReglementationImpl#getVautPourPhaseHoraireManoeuvre <em>Vaut Pour Phase Horaire Manoeuvre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeReglementationImpl#getPreciseConsigneTir <em>Precise Consigne Tir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeReglementationImpl#getAPourRestrictionsUsage4DCoordination4D <em>APour Restrictions Usage4 DCoordination4 D</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeReglementationImpl#getVautPourTypeType <em>Vaut Pour Type Type</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeReglementationImpl#getVautPourInstanceInstanceObjet <em>Vaut Pour Instance Instance Objet</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeReglementationImpl extends EObjectImpl implements TypeReglementation {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoReglementationCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoReglementationCategorie.AUTHOR;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoReglementationCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getConditionsAcces() <em>Conditions Acces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionsAcces()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoReglementationConditionsAcces CONDITIONS_ACCES_EDEFAULT = TypeDictionaryDicoReglementationConditionsAcces.DENY;

	/**
	 * The cached value of the '{@link #getConditionsAcces() <em>Conditions Acces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionsAcces()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoReglementationConditionsAcces conditionsAcces = CONDITIONS_ACCES_EDEFAULT;

	/**
	 * This is true if the Conditions Acces attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean conditionsAccesESet;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFonctionResponsable() <em>Fonction Responsable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFonctionResponsable()
	 * @generated
	 * @ordered
	 */
	protected static final String FONCTION_RESPONSABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFonctionResponsable() <em>Fonction Responsable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFonctionResponsable()
	 * @generated
	 * @ordered
	 */
	protected String fonctionResponsable = FONCTION_RESPONSABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNomEtRangResponsable() <em>Nom Et Rang Responsable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomEtRangResponsable()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_ET_RANG_RESPONSABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomEtRangResponsable() <em>Nom Et Rang Responsable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomEtRangResponsable()
	 * @generated
	 * @ordered
	 */
	protected String nomEtRangResponsable = NOM_ET_RANG_RESPONSABLE_EDEFAULT;

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
	 * The cached value of the '{@link #getVautPourPhaseHoraireManoeuvre() <em>Vaut Pour Phase Horaire Manoeuvre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVautPourPhaseHoraireManoeuvre()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation vautPourPhaseHoraireManoeuvre;

	/**
	 * The cached value of the '{@link #getPreciseConsigneTir() <em>Precise Consigne Tir</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreciseConsigneTir()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation preciseConsigneTir;

	/**
	 * The cached value of the '{@link #getAPourRestrictionsUsage4DCoordination4D() <em>APour Restrictions Usage4 DCoordination4 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourRestrictionsUsage4DCoordination4D()
	 * @generated
	 * @ordered
	 */
	protected TypeCoordination4D aPourRestrictionsUsage4DCoordination4D;

	/**
	 * The cached value of the '{@link #getVautPourTypeType() <em>Vaut Pour Type Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVautPourTypeType()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociationEXT> vautPourTypeType;

	/**
	 * The cached value of the '{@link #getVautPourInstanceInstanceObjet() <em>Vaut Pour Instance Instance Objet</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVautPourInstanceInstanceObjet()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> vautPourInstanceInstanceObjet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeReglementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeReglementation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoReglementationCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoReglementationCategorie newCategorie) {
		TypeDictionaryDicoReglementationCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_REGLEMENTATION__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoReglementationCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_REGLEMENTATION__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeDictionaryDicoReglementationConditionsAcces getConditionsAcces() {
		return conditionsAcces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionsAcces(TypeDictionaryDicoReglementationConditionsAcces newConditionsAcces) {
		TypeDictionaryDicoReglementationConditionsAcces oldConditionsAcces = conditionsAcces;
		conditionsAcces = newConditionsAcces == null ? CONDITIONS_ACCES_EDEFAULT : newConditionsAcces;
		boolean oldConditionsAccesESet = conditionsAccesESet;
		conditionsAccesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_REGLEMENTATION__CONDITIONS_ACCES, oldConditionsAcces, conditionsAcces, !oldConditionsAccesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConditionsAcces() {
		TypeDictionaryDicoReglementationConditionsAcces oldConditionsAcces = conditionsAcces;
		boolean oldConditionsAccesESet = conditionsAccesESet;
		conditionsAcces = CONDITIONS_ACCES_EDEFAULT;
		conditionsAccesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_REGLEMENTATION__CONDITIONS_ACCES, oldConditionsAcces, CONDITIONS_ACCES_EDEFAULT, oldConditionsAccesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConditionsAcces() {
		return conditionsAccesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_REGLEMENTATION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFonctionResponsable() {
		return fonctionResponsable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFonctionResponsable(String newFonctionResponsable) {
		String oldFonctionResponsable = fonctionResponsable;
		fonctionResponsable = newFonctionResponsable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_REGLEMENTATION__FONCTION_RESPONSABLE, oldFonctionResponsable, fonctionResponsable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomEtRangResponsable() {
		return nomEtRangResponsable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomEtRangResponsable(String newNomEtRangResponsable) {
		String oldNomEtRangResponsable = nomEtRangResponsable;
		nomEtRangResponsable = newNomEtRangResponsable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_REGLEMENTATION__NOM_ET_RANG_RESPONSABLE, oldNomEtRangResponsable, nomEtRangResponsable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_REGLEMENTATION__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_REGLEMENTATION__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getVautPourPhaseHoraireManoeuvre() {
		return vautPourPhaseHoraireManoeuvre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVautPourPhaseHoraireManoeuvre(TypeAssociation newVautPourPhaseHoraireManoeuvre, NotificationChain msgs) {
		TypeAssociation oldVautPourPhaseHoraireManoeuvre = vautPourPhaseHoraireManoeuvre;
		vautPourPhaseHoraireManoeuvre = newVautPourPhaseHoraireManoeuvre;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_REGLEMENTATION__VAUT_POUR_PHASE_HORAIRE_MANOEUVRE, oldVautPourPhaseHoraireManoeuvre, newVautPourPhaseHoraireManoeuvre);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVautPourPhaseHoraireManoeuvre(TypeAssociation newVautPourPhaseHoraireManoeuvre) {
		if (newVautPourPhaseHoraireManoeuvre != vautPourPhaseHoraireManoeuvre) {
			NotificationChain msgs = null;
			if (vautPourPhaseHoraireManoeuvre != null)
				msgs = ((InternalEObject)vautPourPhaseHoraireManoeuvre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_REGLEMENTATION__VAUT_POUR_PHASE_HORAIRE_MANOEUVRE, null, msgs);
			if (newVautPourPhaseHoraireManoeuvre != null)
				msgs = ((InternalEObject)newVautPourPhaseHoraireManoeuvre).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_REGLEMENTATION__VAUT_POUR_PHASE_HORAIRE_MANOEUVRE, null, msgs);
			msgs = basicSetVautPourPhaseHoraireManoeuvre(newVautPourPhaseHoraireManoeuvre, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_REGLEMENTATION__VAUT_POUR_PHASE_HORAIRE_MANOEUVRE, newVautPourPhaseHoraireManoeuvre, newVautPourPhaseHoraireManoeuvre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getPreciseConsigneTir() {
		return preciseConsigneTir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreciseConsigneTir(TypeAssociation newPreciseConsigneTir, NotificationChain msgs) {
		TypeAssociation oldPreciseConsigneTir = preciseConsigneTir;
		preciseConsigneTir = newPreciseConsigneTir;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_REGLEMENTATION__PRECISE_CONSIGNE_TIR, oldPreciseConsigneTir, newPreciseConsigneTir);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreciseConsigneTir(TypeAssociation newPreciseConsigneTir) {
		if (newPreciseConsigneTir != preciseConsigneTir) {
			NotificationChain msgs = null;
			if (preciseConsigneTir != null)
				msgs = ((InternalEObject)preciseConsigneTir).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_REGLEMENTATION__PRECISE_CONSIGNE_TIR, null, msgs);
			if (newPreciseConsigneTir != null)
				msgs = ((InternalEObject)newPreciseConsigneTir).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_REGLEMENTATION__PRECISE_CONSIGNE_TIR, null, msgs);
			msgs = basicSetPreciseConsigneTir(newPreciseConsigneTir, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_REGLEMENTATION__PRECISE_CONSIGNE_TIR, newPreciseConsigneTir, newPreciseConsigneTir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeCoordination4D getAPourRestrictionsUsage4DCoordination4D() {
		return aPourRestrictionsUsage4DCoordination4D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourRestrictionsUsage4DCoordination4D(TypeCoordination4D newAPourRestrictionsUsage4DCoordination4D, NotificationChain msgs) {
		TypeCoordination4D oldAPourRestrictionsUsage4DCoordination4D = aPourRestrictionsUsage4DCoordination4D;
		aPourRestrictionsUsage4DCoordination4D = newAPourRestrictionsUsage4DCoordination4D;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_REGLEMENTATION__APOUR_RESTRICTIONS_USAGE4_DCOORDINATION4_D, oldAPourRestrictionsUsage4DCoordination4D, newAPourRestrictionsUsage4DCoordination4D);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourRestrictionsUsage4DCoordination4D(TypeCoordination4D newAPourRestrictionsUsage4DCoordination4D) {
		if (newAPourRestrictionsUsage4DCoordination4D != aPourRestrictionsUsage4DCoordination4D) {
			NotificationChain msgs = null;
			if (aPourRestrictionsUsage4DCoordination4D != null)
				msgs = ((InternalEObject)aPourRestrictionsUsage4DCoordination4D).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_REGLEMENTATION__APOUR_RESTRICTIONS_USAGE4_DCOORDINATION4_D, null, msgs);
			if (newAPourRestrictionsUsage4DCoordination4D != null)
				msgs = ((InternalEObject)newAPourRestrictionsUsage4DCoordination4D).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_REGLEMENTATION__APOUR_RESTRICTIONS_USAGE4_DCOORDINATION4_D, null, msgs);
			msgs = basicSetAPourRestrictionsUsage4DCoordination4D(newAPourRestrictionsUsage4DCoordination4D, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_REGLEMENTATION__APOUR_RESTRICTIONS_USAGE4_DCOORDINATION4_D, newAPourRestrictionsUsage4DCoordination4D, newAPourRestrictionsUsage4DCoordination4D));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEXT> getVautPourTypeType() {
		if (vautPourTypeType == null) {
			vautPourTypeType = new EObjectContainmentEList<TypeAssociationEXT>(TypeAssociationEXT.class, this, SchemaPackage.TYPE_REGLEMENTATION__VAUT_POUR_TYPE_TYPE);
		}
		return vautPourTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getVautPourInstanceInstanceObjet() {
		if (vautPourInstanceInstanceObjet == null) {
			vautPourInstanceInstanceObjet = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_REGLEMENTATION__VAUT_POUR_INSTANCE_INSTANCE_OBJET);
		}
		return vautPourInstanceInstanceObjet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_REGLEMENTATION__VAUT_POUR_PHASE_HORAIRE_MANOEUVRE:
				return basicSetVautPourPhaseHoraireManoeuvre(null, msgs);
			case SchemaPackage.TYPE_REGLEMENTATION__PRECISE_CONSIGNE_TIR:
				return basicSetPreciseConsigneTir(null, msgs);
			case SchemaPackage.TYPE_REGLEMENTATION__APOUR_RESTRICTIONS_USAGE4_DCOORDINATION4_D:
				return basicSetAPourRestrictionsUsage4DCoordination4D(null, msgs);
			case SchemaPackage.TYPE_REGLEMENTATION__VAUT_POUR_TYPE_TYPE:
				return ((InternalEList<?>)getVautPourTypeType()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_REGLEMENTATION__VAUT_POUR_INSTANCE_INSTANCE_OBJET:
				return ((InternalEList<?>)getVautPourInstanceInstanceObjet()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_REGLEMENTATION__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_REGLEMENTATION__CONDITIONS_ACCES:
				return getConditionsAcces();
			case SchemaPackage.TYPE_REGLEMENTATION__DESCRIPTION:
				return getDescription();
			case SchemaPackage.TYPE_REGLEMENTATION__FONCTION_RESPONSABLE:
				return getFonctionResponsable();
			case SchemaPackage.TYPE_REGLEMENTATION__NOM_ET_RANG_RESPONSABLE:
				return getNomEtRangResponsable();
			case SchemaPackage.TYPE_REGLEMENTATION__CTE:
				return getCTE();
			case SchemaPackage.TYPE_REGLEMENTATION__CE:
				return getCE();
			case SchemaPackage.TYPE_REGLEMENTATION__VAUT_POUR_PHASE_HORAIRE_MANOEUVRE:
				return getVautPourPhaseHoraireManoeuvre();
			case SchemaPackage.TYPE_REGLEMENTATION__PRECISE_CONSIGNE_TIR:
				return getPreciseConsigneTir();
			case SchemaPackage.TYPE_REGLEMENTATION__APOUR_RESTRICTIONS_USAGE4_DCOORDINATION4_D:
				return getAPourRestrictionsUsage4DCoordination4D();
			case SchemaPackage.TYPE_REGLEMENTATION__VAUT_POUR_TYPE_TYPE:
				return getVautPourTypeType();
			case SchemaPackage.TYPE_REGLEMENTATION__VAUT_POUR_INSTANCE_INSTANCE_OBJET:
				return getVautPourInstanceInstanceObjet();
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
			case SchemaPackage.TYPE_REGLEMENTATION__CATEGORIE:
				setCategorie((TypeDictionaryDicoReglementationCategorie)newValue);
				return;
			case SchemaPackage.TYPE_REGLEMENTATION__CONDITIONS_ACCES:
				setConditionsAcces((TypeDictionaryDicoReglementationConditionsAcces)newValue);
				return;
			case SchemaPackage.TYPE_REGLEMENTATION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SchemaPackage.TYPE_REGLEMENTATION__FONCTION_RESPONSABLE:
				setFonctionResponsable((String)newValue);
				return;
			case SchemaPackage.TYPE_REGLEMENTATION__NOM_ET_RANG_RESPONSABLE:
				setNomEtRangResponsable((String)newValue);
				return;
			case SchemaPackage.TYPE_REGLEMENTATION__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_REGLEMENTATION__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_REGLEMENTATION__VAUT_POUR_PHASE_HORAIRE_MANOEUVRE:
				setVautPourPhaseHoraireManoeuvre((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_REGLEMENTATION__PRECISE_CONSIGNE_TIR:
				setPreciseConsigneTir((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_REGLEMENTATION__APOUR_RESTRICTIONS_USAGE4_DCOORDINATION4_D:
				setAPourRestrictionsUsage4DCoordination4D((TypeCoordination4D)newValue);
				return;
			case SchemaPackage.TYPE_REGLEMENTATION__VAUT_POUR_TYPE_TYPE:
				getVautPourTypeType().clear();
				getVautPourTypeType().addAll((Collection<? extends TypeAssociationEXT>)newValue);
				return;
			case SchemaPackage.TYPE_REGLEMENTATION__VAUT_POUR_INSTANCE_INSTANCE_OBJET:
				getVautPourInstanceInstanceObjet().clear();
				getVautPourInstanceInstanceObjet().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_REGLEMENTATION__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_REGLEMENTATION__CONDITIONS_ACCES:
				unsetConditionsAcces();
				return;
			case SchemaPackage.TYPE_REGLEMENTATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_REGLEMENTATION__FONCTION_RESPONSABLE:
				setFonctionResponsable(FONCTION_RESPONSABLE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_REGLEMENTATION__NOM_ET_RANG_RESPONSABLE:
				setNomEtRangResponsable(NOM_ET_RANG_RESPONSABLE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_REGLEMENTATION__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_REGLEMENTATION__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_REGLEMENTATION__VAUT_POUR_PHASE_HORAIRE_MANOEUVRE:
				setVautPourPhaseHoraireManoeuvre((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_REGLEMENTATION__PRECISE_CONSIGNE_TIR:
				setPreciseConsigneTir((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_REGLEMENTATION__APOUR_RESTRICTIONS_USAGE4_DCOORDINATION4_D:
				setAPourRestrictionsUsage4DCoordination4D((TypeCoordination4D)null);
				return;
			case SchemaPackage.TYPE_REGLEMENTATION__VAUT_POUR_TYPE_TYPE:
				getVautPourTypeType().clear();
				return;
			case SchemaPackage.TYPE_REGLEMENTATION__VAUT_POUR_INSTANCE_INSTANCE_OBJET:
				getVautPourInstanceInstanceObjet().clear();
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
			case SchemaPackage.TYPE_REGLEMENTATION__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_REGLEMENTATION__CONDITIONS_ACCES:
				return isSetConditionsAcces();
			case SchemaPackage.TYPE_REGLEMENTATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SchemaPackage.TYPE_REGLEMENTATION__FONCTION_RESPONSABLE:
				return FONCTION_RESPONSABLE_EDEFAULT == null ? fonctionResponsable != null : !FONCTION_RESPONSABLE_EDEFAULT.equals(fonctionResponsable);
			case SchemaPackage.TYPE_REGLEMENTATION__NOM_ET_RANG_RESPONSABLE:
				return NOM_ET_RANG_RESPONSABLE_EDEFAULT == null ? nomEtRangResponsable != null : !NOM_ET_RANG_RESPONSABLE_EDEFAULT.equals(nomEtRangResponsable);
			case SchemaPackage.TYPE_REGLEMENTATION__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_REGLEMENTATION__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_REGLEMENTATION__VAUT_POUR_PHASE_HORAIRE_MANOEUVRE:
				return vautPourPhaseHoraireManoeuvre != null;
			case SchemaPackage.TYPE_REGLEMENTATION__PRECISE_CONSIGNE_TIR:
				return preciseConsigneTir != null;
			case SchemaPackage.TYPE_REGLEMENTATION__APOUR_RESTRICTIONS_USAGE4_DCOORDINATION4_D:
				return aPourRestrictionsUsage4DCoordination4D != null;
			case SchemaPackage.TYPE_REGLEMENTATION__VAUT_POUR_TYPE_TYPE:
				return vautPourTypeType != null && !vautPourTypeType.isEmpty();
			case SchemaPackage.TYPE_REGLEMENTATION__VAUT_POUR_INSTANCE_INSTANCE_OBJET:
				return vautPourInstanceInstanceObjet != null && !vautPourInstanceInstanceObjet.isEmpty();
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
		result.append(", conditionsAcces: ");
		if (conditionsAccesESet) result.append(conditionsAcces); else result.append("<unset>");
		result.append(", description: ");
		result.append(description);
		result.append(", fonctionResponsable: ");
		result.append(fonctionResponsable);
		result.append(", nomEtRangResponsable: ");
		result.append(nomEtRangResponsable);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeReglementationImpl
