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
import mpia.schema.TypeArticulationSoutienMedical;
import mpia.schema.TypeDictionaryDicoZoneLogistiqueEchelonLogistique;
import mpia.schema.TypeDictionaryDicoZoneLogistiqueType;
import mpia.schema.TypeLocalisation;
import mpia.schema.TypeMiseEnPlace;
import mpia.schema.TypeZoneLogistique;

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
 * An implementation of the model object '<em><b>Type Zone Logistique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeZoneLogistiqueImpl#getType <em>Type</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZoneLogistiqueImpl#getAutreType <em>Autre Type</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZoneLogistiqueImpl#getEchelonLogistique <em>Echelon Logistique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZoneLogistiqueImpl#getComplement <em>Complement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZoneLogistiqueImpl#getAPourLocalisationPCUniteRattacheeLocalisation <em>APour Localisation PC Unite Rattachee Localisation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZoneLogistiqueImpl#getAPourPointEntreeAutreElementControle <em>APour Point Entree Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZoneLogistiqueImpl#getVautPourHoraireManoeuvre <em>Vaut Pour Horaire Manoeuvre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZoneLogistiqueImpl#getAPourPosteRenseignementRegulationUnite <em>APour Poste Renseignement Regulation Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZoneLogistiqueImpl#getAPourPointEntreeFuturAutreElementControle <em>APour Point Entree Futur Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZoneLogistiqueImpl#getAPourArticulationSoutienMedicalArticulationSoutienMedical <em>APour Articulation Soutien Medical Articulation Soutien Medical</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZoneLogistiqueImpl#getAPourLocalisationPCLocalisation <em>APour Localisation PC Localisation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZoneLogistiqueImpl#getEstMiseEnPlaceSelonMiseEnPlace <em>Est Mise En Place Selon Mise En Place</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZoneLogistiqueImpl#getAPourPointSortieAutreElementControle <em>APour Point Sortie Autre Element Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeZoneLogistiqueImpl extends TypeElementControleImpl implements TypeZoneLogistique {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoZoneLogistiqueType TYPE_EDEFAULT = TypeDictionaryDicoZoneLogistiqueType.TLA;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoZoneLogistiqueType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #getAutreType() <em>Autre Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreType()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTRE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutreType() <em>Autre Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreType()
	 * @generated
	 * @ordered
	 */
	protected String autreType = AUTRE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEchelonLogistique() <em>Echelon Logistique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEchelonLogistique()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoZoneLogistiqueEchelonLogistique ECHELON_LOGISTIQUE_EDEFAULT = TypeDictionaryDicoZoneLogistiqueEchelonLogistique.FRWD;

	/**
	 * The cached value of the '{@link #getEchelonLogistique() <em>Echelon Logistique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEchelonLogistique()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoZoneLogistiqueEchelonLogistique echelonLogistique = ECHELON_LOGISTIQUE_EDEFAULT;

	/**
	 * This is true if the Echelon Logistique attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean echelonLogistiqueESet;

	/**
	 * The default value of the '{@link #getComplement() <em>Complement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplement()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPLEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComplement() <em>Complement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplement()
	 * @generated
	 * @ordered
	 */
	protected String complement = COMPLEMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAPourLocalisationPCUniteRattacheeLocalisation() <em>APour Localisation PC Unite Rattachee Localisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourLocalisationPCUniteRattacheeLocalisation()
	 * @generated
	 * @ordered
	 */
	protected TypeLocalisation aPourLocalisationPCUniteRattacheeLocalisation;

	/**
	 * The cached value of the '{@link #getAPourPointEntreeAutreElementControle() <em>APour Point Entree Autre Element Controle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourPointEntreeAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourPointEntreeAutreElementControle;

	/**
	 * The cached value of the '{@link #getVautPourHoraireManoeuvre() <em>Vaut Pour Horaire Manoeuvre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVautPourHoraireManoeuvre()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation vautPourHoraireManoeuvre;

	/**
	 * The cached value of the '{@link #getAPourPosteRenseignementRegulationUnite() <em>APour Poste Renseignement Regulation Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourPosteRenseignementRegulationUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociationEXT> aPourPosteRenseignementRegulationUnite;

	/**
	 * The cached value of the '{@link #getAPourPointEntreeFuturAutreElementControle() <em>APour Point Entree Futur Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourPointEntreeFuturAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourPointEntreeFuturAutreElementControle;

	/**
	 * The cached value of the '{@link #getAPourArticulationSoutienMedicalArticulationSoutienMedical() <em>APour Articulation Soutien Medical Articulation Soutien Medical</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourArticulationSoutienMedicalArticulationSoutienMedical()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeArticulationSoutienMedical> aPourArticulationSoutienMedicalArticulationSoutienMedical;

	/**
	 * The cached value of the '{@link #getAPourLocalisationPCLocalisation() <em>APour Localisation PC Localisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourLocalisationPCLocalisation()
	 * @generated
	 * @ordered
	 */
	protected TypeLocalisation aPourLocalisationPCLocalisation;

	/**
	 * The cached value of the '{@link #getEstMiseEnPlaceSelonMiseEnPlace() <em>Est Mise En Place Selon Mise En Place</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstMiseEnPlaceSelonMiseEnPlace()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeMiseEnPlace> estMiseEnPlaceSelonMiseEnPlace;

	/**
	 * The cached value of the '{@link #getAPourPointSortieAutreElementControle() <em>APour Point Sortie Autre Element Controle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourPointSortieAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourPointSortieAutreElementControle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeZoneLogistiqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeZoneLogistique();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoZoneLogistiqueType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeDictionaryDicoZoneLogistiqueType newType) {
		TypeDictionaryDicoZoneLogistiqueType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_LOGISTIQUE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeDictionaryDicoZoneLogistiqueType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ZONE_LOGISTIQUE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutreType() {
		return autreType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutreType(String newAutreType) {
		String oldAutreType = autreType;
		autreType = newAutreType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_LOGISTIQUE__AUTRE_TYPE, oldAutreType, autreType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoZoneLogistiqueEchelonLogistique getEchelonLogistique() {
		return echelonLogistique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEchelonLogistique(TypeDictionaryDicoZoneLogistiqueEchelonLogistique newEchelonLogistique) {
		TypeDictionaryDicoZoneLogistiqueEchelonLogistique oldEchelonLogistique = echelonLogistique;
		echelonLogistique = newEchelonLogistique == null ? ECHELON_LOGISTIQUE_EDEFAULT : newEchelonLogistique;
		boolean oldEchelonLogistiqueESet = echelonLogistiqueESet;
		echelonLogistiqueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_LOGISTIQUE__ECHELON_LOGISTIQUE, oldEchelonLogistique, echelonLogistique, !oldEchelonLogistiqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEchelonLogistique() {
		TypeDictionaryDicoZoneLogistiqueEchelonLogistique oldEchelonLogistique = echelonLogistique;
		boolean oldEchelonLogistiqueESet = echelonLogistiqueESet;
		echelonLogistique = ECHELON_LOGISTIQUE_EDEFAULT;
		echelonLogistiqueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ZONE_LOGISTIQUE__ECHELON_LOGISTIQUE, oldEchelonLogistique, ECHELON_LOGISTIQUE_EDEFAULT, oldEchelonLogistiqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEchelonLogistique() {
		return echelonLogistiqueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComplement() {
		return complement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplement(String newComplement) {
		String oldComplement = complement;
		complement = newComplement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_LOGISTIQUE__COMPLEMENT, oldComplement, complement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeLocalisation getAPourLocalisationPCUniteRattacheeLocalisation() {
		return aPourLocalisationPCUniteRattacheeLocalisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourLocalisationPCUniteRattacheeLocalisation(TypeLocalisation newAPourLocalisationPCUniteRattacheeLocalisation, NotificationChain msgs) {
		TypeLocalisation oldAPourLocalisationPCUniteRattacheeLocalisation = aPourLocalisationPCUniteRattacheeLocalisation;
		aPourLocalisationPCUniteRattacheeLocalisation = newAPourLocalisationPCUniteRattacheeLocalisation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_LOGISTIQUE__APOUR_LOCALISATION_PC_UNITE_RATTACHEE_LOCALISATION, oldAPourLocalisationPCUniteRattacheeLocalisation, newAPourLocalisationPCUniteRattacheeLocalisation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourLocalisationPCUniteRattacheeLocalisation(TypeLocalisation newAPourLocalisationPCUniteRattacheeLocalisation) {
		if (newAPourLocalisationPCUniteRattacheeLocalisation != aPourLocalisationPCUniteRattacheeLocalisation) {
			NotificationChain msgs = null;
			if (aPourLocalisationPCUniteRattacheeLocalisation != null)
				msgs = ((InternalEObject)aPourLocalisationPCUniteRattacheeLocalisation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ZONE_LOGISTIQUE__APOUR_LOCALISATION_PC_UNITE_RATTACHEE_LOCALISATION, null, msgs);
			if (newAPourLocalisationPCUniteRattacheeLocalisation != null)
				msgs = ((InternalEObject)newAPourLocalisationPCUniteRattacheeLocalisation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ZONE_LOGISTIQUE__APOUR_LOCALISATION_PC_UNITE_RATTACHEE_LOCALISATION, null, msgs);
			msgs = basicSetAPourLocalisationPCUniteRattacheeLocalisation(newAPourLocalisationPCUniteRattacheeLocalisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_LOGISTIQUE__APOUR_LOCALISATION_PC_UNITE_RATTACHEE_LOCALISATION, newAPourLocalisationPCUniteRattacheeLocalisation, newAPourLocalisationPCUniteRattacheeLocalisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourPointEntreeAutreElementControle() {
		if (aPourPointEntreeAutreElementControle == null) {
			aPourPointEntreeAutreElementControle = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ZONE_LOGISTIQUE__APOUR_POINT_ENTREE_AUTRE_ELEMENT_CONTROLE);
		}
		return aPourPointEntreeAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getVautPourHoraireManoeuvre() {
		return vautPourHoraireManoeuvre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVautPourHoraireManoeuvre(TypeAssociation newVautPourHoraireManoeuvre, NotificationChain msgs) {
		TypeAssociation oldVautPourHoraireManoeuvre = vautPourHoraireManoeuvre;
		vautPourHoraireManoeuvre = newVautPourHoraireManoeuvre;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_LOGISTIQUE__VAUT_POUR_HORAIRE_MANOEUVRE, oldVautPourHoraireManoeuvre, newVautPourHoraireManoeuvre);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVautPourHoraireManoeuvre(TypeAssociation newVautPourHoraireManoeuvre) {
		if (newVautPourHoraireManoeuvre != vautPourHoraireManoeuvre) {
			NotificationChain msgs = null;
			if (vautPourHoraireManoeuvre != null)
				msgs = ((InternalEObject)vautPourHoraireManoeuvre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ZONE_LOGISTIQUE__VAUT_POUR_HORAIRE_MANOEUVRE, null, msgs);
			if (newVautPourHoraireManoeuvre != null)
				msgs = ((InternalEObject)newVautPourHoraireManoeuvre).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ZONE_LOGISTIQUE__VAUT_POUR_HORAIRE_MANOEUVRE, null, msgs);
			msgs = basicSetVautPourHoraireManoeuvre(newVautPourHoraireManoeuvre, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_LOGISTIQUE__VAUT_POUR_HORAIRE_MANOEUVRE, newVautPourHoraireManoeuvre, newVautPourHoraireManoeuvre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEXT> getAPourPosteRenseignementRegulationUnite() {
		if (aPourPosteRenseignementRegulationUnite == null) {
			aPourPosteRenseignementRegulationUnite = new EObjectContainmentEList<TypeAssociationEXT>(TypeAssociationEXT.class, this, SchemaPackage.TYPE_ZONE_LOGISTIQUE__APOUR_POSTE_RENSEIGNEMENT_REGULATION_UNITE);
		}
		return aPourPosteRenseignementRegulationUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourPointEntreeFuturAutreElementControle() {
		return aPourPointEntreeFuturAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourPointEntreeFuturAutreElementControle(TypeAssociation newAPourPointEntreeFuturAutreElementControle, NotificationChain msgs) {
		TypeAssociation oldAPourPointEntreeFuturAutreElementControle = aPourPointEntreeFuturAutreElementControle;
		aPourPointEntreeFuturAutreElementControle = newAPourPointEntreeFuturAutreElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_LOGISTIQUE__APOUR_POINT_ENTREE_FUTUR_AUTRE_ELEMENT_CONTROLE, oldAPourPointEntreeFuturAutreElementControle, newAPourPointEntreeFuturAutreElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourPointEntreeFuturAutreElementControle(TypeAssociation newAPourPointEntreeFuturAutreElementControle) {
		if (newAPourPointEntreeFuturAutreElementControle != aPourPointEntreeFuturAutreElementControle) {
			NotificationChain msgs = null;
			if (aPourPointEntreeFuturAutreElementControle != null)
				msgs = ((InternalEObject)aPourPointEntreeFuturAutreElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ZONE_LOGISTIQUE__APOUR_POINT_ENTREE_FUTUR_AUTRE_ELEMENT_CONTROLE, null, msgs);
			if (newAPourPointEntreeFuturAutreElementControle != null)
				msgs = ((InternalEObject)newAPourPointEntreeFuturAutreElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ZONE_LOGISTIQUE__APOUR_POINT_ENTREE_FUTUR_AUTRE_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetAPourPointEntreeFuturAutreElementControle(newAPourPointEntreeFuturAutreElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_LOGISTIQUE__APOUR_POINT_ENTREE_FUTUR_AUTRE_ELEMENT_CONTROLE, newAPourPointEntreeFuturAutreElementControle, newAPourPointEntreeFuturAutreElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeArticulationSoutienMedical> getAPourArticulationSoutienMedicalArticulationSoutienMedical() {
		if (aPourArticulationSoutienMedicalArticulationSoutienMedical == null) {
			aPourArticulationSoutienMedicalArticulationSoutienMedical = new EObjectContainmentEList<TypeArticulationSoutienMedical>(TypeArticulationSoutienMedical.class, this, SchemaPackage.TYPE_ZONE_LOGISTIQUE__APOUR_ARTICULATION_SOUTIEN_MEDICAL_ARTICULATION_SOUTIEN_MEDICAL);
		}
		return aPourArticulationSoutienMedicalArticulationSoutienMedical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeLocalisation getAPourLocalisationPCLocalisation() {
		return aPourLocalisationPCLocalisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourLocalisationPCLocalisation(TypeLocalisation newAPourLocalisationPCLocalisation, NotificationChain msgs) {
		TypeLocalisation oldAPourLocalisationPCLocalisation = aPourLocalisationPCLocalisation;
		aPourLocalisationPCLocalisation = newAPourLocalisationPCLocalisation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_LOGISTIQUE__APOUR_LOCALISATION_PC_LOCALISATION, oldAPourLocalisationPCLocalisation, newAPourLocalisationPCLocalisation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourLocalisationPCLocalisation(TypeLocalisation newAPourLocalisationPCLocalisation) {
		if (newAPourLocalisationPCLocalisation != aPourLocalisationPCLocalisation) {
			NotificationChain msgs = null;
			if (aPourLocalisationPCLocalisation != null)
				msgs = ((InternalEObject)aPourLocalisationPCLocalisation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ZONE_LOGISTIQUE__APOUR_LOCALISATION_PC_LOCALISATION, null, msgs);
			if (newAPourLocalisationPCLocalisation != null)
				msgs = ((InternalEObject)newAPourLocalisationPCLocalisation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ZONE_LOGISTIQUE__APOUR_LOCALISATION_PC_LOCALISATION, null, msgs);
			msgs = basicSetAPourLocalisationPCLocalisation(newAPourLocalisationPCLocalisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_LOGISTIQUE__APOUR_LOCALISATION_PC_LOCALISATION, newAPourLocalisationPCLocalisation, newAPourLocalisationPCLocalisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMiseEnPlace> getEstMiseEnPlaceSelonMiseEnPlace() {
		if (estMiseEnPlaceSelonMiseEnPlace == null) {
			estMiseEnPlaceSelonMiseEnPlace = new EObjectContainmentEList<TypeMiseEnPlace>(TypeMiseEnPlace.class, this, SchemaPackage.TYPE_ZONE_LOGISTIQUE__EST_MISE_EN_PLACE_SELON_MISE_EN_PLACE);
		}
		return estMiseEnPlaceSelonMiseEnPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourPointSortieAutreElementControle() {
		if (aPourPointSortieAutreElementControle == null) {
			aPourPointSortieAutreElementControle = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ZONE_LOGISTIQUE__APOUR_POINT_SORTIE_AUTRE_ELEMENT_CONTROLE);
		}
		return aPourPointSortieAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__APOUR_LOCALISATION_PC_UNITE_RATTACHEE_LOCALISATION:
				return basicSetAPourLocalisationPCUniteRattacheeLocalisation(null, msgs);
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__APOUR_POINT_ENTREE_AUTRE_ELEMENT_CONTROLE:
				return ((InternalEList<?>)getAPourPointEntreeAutreElementControle()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__VAUT_POUR_HORAIRE_MANOEUVRE:
				return basicSetVautPourHoraireManoeuvre(null, msgs);
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__APOUR_POSTE_RENSEIGNEMENT_REGULATION_UNITE:
				return ((InternalEList<?>)getAPourPosteRenseignementRegulationUnite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__APOUR_POINT_ENTREE_FUTUR_AUTRE_ELEMENT_CONTROLE:
				return basicSetAPourPointEntreeFuturAutreElementControle(null, msgs);
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__APOUR_ARTICULATION_SOUTIEN_MEDICAL_ARTICULATION_SOUTIEN_MEDICAL:
				return ((InternalEList<?>)getAPourArticulationSoutienMedicalArticulationSoutienMedical()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__APOUR_LOCALISATION_PC_LOCALISATION:
				return basicSetAPourLocalisationPCLocalisation(null, msgs);
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__EST_MISE_EN_PLACE_SELON_MISE_EN_PLACE:
				return ((InternalEList<?>)getEstMiseEnPlaceSelonMiseEnPlace()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__APOUR_POINT_SORTIE_AUTRE_ELEMENT_CONTROLE:
				return ((InternalEList<?>)getAPourPointSortieAutreElementControle()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__TYPE:
				return getType();
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__AUTRE_TYPE:
				return getAutreType();
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__ECHELON_LOGISTIQUE:
				return getEchelonLogistique();
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__COMPLEMENT:
				return getComplement();
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__APOUR_LOCALISATION_PC_UNITE_RATTACHEE_LOCALISATION:
				return getAPourLocalisationPCUniteRattacheeLocalisation();
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__APOUR_POINT_ENTREE_AUTRE_ELEMENT_CONTROLE:
				return getAPourPointEntreeAutreElementControle();
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__VAUT_POUR_HORAIRE_MANOEUVRE:
				return getVautPourHoraireManoeuvre();
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__APOUR_POSTE_RENSEIGNEMENT_REGULATION_UNITE:
				return getAPourPosteRenseignementRegulationUnite();
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__APOUR_POINT_ENTREE_FUTUR_AUTRE_ELEMENT_CONTROLE:
				return getAPourPointEntreeFuturAutreElementControle();
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__APOUR_ARTICULATION_SOUTIEN_MEDICAL_ARTICULATION_SOUTIEN_MEDICAL:
				return getAPourArticulationSoutienMedicalArticulationSoutienMedical();
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__APOUR_LOCALISATION_PC_LOCALISATION:
				return getAPourLocalisationPCLocalisation();
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__EST_MISE_EN_PLACE_SELON_MISE_EN_PLACE:
				return getEstMiseEnPlaceSelonMiseEnPlace();
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__APOUR_POINT_SORTIE_AUTRE_ELEMENT_CONTROLE:
				return getAPourPointSortieAutreElementControle();
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
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__TYPE:
				setType((TypeDictionaryDicoZoneLogistiqueType)newValue);
				return;
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__AUTRE_TYPE:
				setAutreType((String)newValue);
				return;
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__ECHELON_LOGISTIQUE:
				setEchelonLogistique((TypeDictionaryDicoZoneLogistiqueEchelonLogistique)newValue);
				return;
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__COMPLEMENT:
				setComplement((String)newValue);
				return;
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__APOUR_LOCALISATION_PC_UNITE_RATTACHEE_LOCALISATION:
				setAPourLocalisationPCUniteRattacheeLocalisation((TypeLocalisation)newValue);
				return;
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__APOUR_POINT_ENTREE_AUTRE_ELEMENT_CONTROLE:
				getAPourPointEntreeAutreElementControle().clear();
				getAPourPointEntreeAutreElementControle().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__VAUT_POUR_HORAIRE_MANOEUVRE:
				setVautPourHoraireManoeuvre((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__APOUR_POSTE_RENSEIGNEMENT_REGULATION_UNITE:
				getAPourPosteRenseignementRegulationUnite().clear();
				getAPourPosteRenseignementRegulationUnite().addAll((Collection<? extends TypeAssociationEXT>)newValue);
				return;
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__APOUR_POINT_ENTREE_FUTUR_AUTRE_ELEMENT_CONTROLE:
				setAPourPointEntreeFuturAutreElementControle((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__APOUR_ARTICULATION_SOUTIEN_MEDICAL_ARTICULATION_SOUTIEN_MEDICAL:
				getAPourArticulationSoutienMedicalArticulationSoutienMedical().clear();
				getAPourArticulationSoutienMedicalArticulationSoutienMedical().addAll((Collection<? extends TypeArticulationSoutienMedical>)newValue);
				return;
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__APOUR_LOCALISATION_PC_LOCALISATION:
				setAPourLocalisationPCLocalisation((TypeLocalisation)newValue);
				return;
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__EST_MISE_EN_PLACE_SELON_MISE_EN_PLACE:
				getEstMiseEnPlaceSelonMiseEnPlace().clear();
				getEstMiseEnPlaceSelonMiseEnPlace().addAll((Collection<? extends TypeMiseEnPlace>)newValue);
				return;
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__APOUR_POINT_SORTIE_AUTRE_ELEMENT_CONTROLE:
				getAPourPointSortieAutreElementControle().clear();
				getAPourPointSortieAutreElementControle().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__TYPE:
				unsetType();
				return;
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__AUTRE_TYPE:
				setAutreType(AUTRE_TYPE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__ECHELON_LOGISTIQUE:
				unsetEchelonLogistique();
				return;
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__COMPLEMENT:
				setComplement(COMPLEMENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__APOUR_LOCALISATION_PC_UNITE_RATTACHEE_LOCALISATION:
				setAPourLocalisationPCUniteRattacheeLocalisation((TypeLocalisation)null);
				return;
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__APOUR_POINT_ENTREE_AUTRE_ELEMENT_CONTROLE:
				getAPourPointEntreeAutreElementControle().clear();
				return;
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__VAUT_POUR_HORAIRE_MANOEUVRE:
				setVautPourHoraireManoeuvre((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__APOUR_POSTE_RENSEIGNEMENT_REGULATION_UNITE:
				getAPourPosteRenseignementRegulationUnite().clear();
				return;
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__APOUR_POINT_ENTREE_FUTUR_AUTRE_ELEMENT_CONTROLE:
				setAPourPointEntreeFuturAutreElementControle((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__APOUR_ARTICULATION_SOUTIEN_MEDICAL_ARTICULATION_SOUTIEN_MEDICAL:
				getAPourArticulationSoutienMedicalArticulationSoutienMedical().clear();
				return;
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__APOUR_LOCALISATION_PC_LOCALISATION:
				setAPourLocalisationPCLocalisation((TypeLocalisation)null);
				return;
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__EST_MISE_EN_PLACE_SELON_MISE_EN_PLACE:
				getEstMiseEnPlaceSelonMiseEnPlace().clear();
				return;
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__APOUR_POINT_SORTIE_AUTRE_ELEMENT_CONTROLE:
				getAPourPointSortieAutreElementControle().clear();
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
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__TYPE:
				return isSetType();
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__AUTRE_TYPE:
				return AUTRE_TYPE_EDEFAULT == null ? autreType != null : !AUTRE_TYPE_EDEFAULT.equals(autreType);
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__ECHELON_LOGISTIQUE:
				return isSetEchelonLogistique();
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__COMPLEMENT:
				return COMPLEMENT_EDEFAULT == null ? complement != null : !COMPLEMENT_EDEFAULT.equals(complement);
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__APOUR_LOCALISATION_PC_UNITE_RATTACHEE_LOCALISATION:
				return aPourLocalisationPCUniteRattacheeLocalisation != null;
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__APOUR_POINT_ENTREE_AUTRE_ELEMENT_CONTROLE:
				return aPourPointEntreeAutreElementControle != null && !aPourPointEntreeAutreElementControle.isEmpty();
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__VAUT_POUR_HORAIRE_MANOEUVRE:
				return vautPourHoraireManoeuvre != null;
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__APOUR_POSTE_RENSEIGNEMENT_REGULATION_UNITE:
				return aPourPosteRenseignementRegulationUnite != null && !aPourPosteRenseignementRegulationUnite.isEmpty();
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__APOUR_POINT_ENTREE_FUTUR_AUTRE_ELEMENT_CONTROLE:
				return aPourPointEntreeFuturAutreElementControle != null;
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__APOUR_ARTICULATION_SOUTIEN_MEDICAL_ARTICULATION_SOUTIEN_MEDICAL:
				return aPourArticulationSoutienMedicalArticulationSoutienMedical != null && !aPourArticulationSoutienMedicalArticulationSoutienMedical.isEmpty();
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__APOUR_LOCALISATION_PC_LOCALISATION:
				return aPourLocalisationPCLocalisation != null;
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__EST_MISE_EN_PLACE_SELON_MISE_EN_PLACE:
				return estMiseEnPlaceSelonMiseEnPlace != null && !estMiseEnPlaceSelonMiseEnPlace.isEmpty();
			case SchemaPackage.TYPE_ZONE_LOGISTIQUE__APOUR_POINT_SORTIE_AUTRE_ELEMENT_CONTROLE:
				return aPourPointSortieAutreElementControle != null && !aPourPointSortieAutreElementControle.isEmpty();
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
		result.append(" (type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", autreType: ");
		result.append(autreType);
		result.append(", echelonLogistique: ");
		if (echelonLogistiqueESet) result.append(echelonLogistique); else result.append("<unset>");
		result.append(", complement: ");
		result.append(complement);
		result.append(')');
		return result.toString();
	}

} //TypeZoneLogistiqueImpl
