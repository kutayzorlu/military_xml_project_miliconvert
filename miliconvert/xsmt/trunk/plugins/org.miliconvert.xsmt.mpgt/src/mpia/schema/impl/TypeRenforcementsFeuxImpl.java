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
import mpia.meta.TypeDataTypeDuree;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoTypeMissionASS;
import mpia.schema.TypeRenforcementsFeux;
import mpia.schema.TypeRessourceActiviteType;
import mpia.schema.TypeVolumeMunitionsASS;

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
 * An implementation of the model object '<em><b>Type Renforcements Feux</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeRenforcementsFeuxImpl#getTypeRenforcement <em>Type Renforcement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRenforcementsFeuxImpl#getAutreTypeRenforcement <em>Autre Type Renforcement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRenforcementsFeuxImpl#getPreavis <em>Preavis</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRenforcementsFeuxImpl#getDebutValidite <em>Debut Validite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRenforcementsFeuxImpl#getEstObjetAssociationUniteRenforcementsFeux <em>Est Objet Association Unite Renforcements Feux</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRenforcementsFeuxImpl#getEstLocaliseEnAutreElementControle <em>Est Localise En Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRenforcementsFeuxImpl#getAPourConsommationAlloueeVolumeMunitionsASS <em>APour Consommation Allouee Volume Munitions ASS</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRenforcementsFeuxImpl#getAPourMunitionsRestantesVolumeMunitionsASS <em>APour Munitions Restantes Volume Munitions ASS</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRenforcementsFeuxImpl#getAPourTypeRessourceRessourceActiviteType <em>APour Type Ressource Ressource Activite Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeRenforcementsFeuxImpl extends TypeMissionImpl implements TypeRenforcementsFeux {
	/**
	 * The default value of the '{@link #getTypeRenforcement() <em>Type Renforcement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeRenforcement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeMissionASS TYPE_RENFORCEMENT_EDEFAULT = TypeDictionaryDicoTypeMissionASS.CBATT;

	/**
	 * The cached value of the '{@link #getTypeRenforcement() <em>Type Renforcement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeRenforcement()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeMissionASS typeRenforcement = TYPE_RENFORCEMENT_EDEFAULT;

	/**
	 * This is true if the Type Renforcement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeRenforcementESet;

	/**
	 * The default value of the '{@link #getAutreTypeRenforcement() <em>Autre Type Renforcement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreTypeRenforcement()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTRE_TYPE_RENFORCEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutreTypeRenforcement() <em>Autre Type Renforcement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreTypeRenforcement()
	 * @generated
	 * @ordered
	 */
	protected String autreTypeRenforcement = AUTRE_TYPE_RENFORCEMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPreavis() <em>Preavis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreavis()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree preavis;

	/**
	 * The default value of the '{@link #getDebutValidite() <em>Debut Validite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebutValidite()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DEBUT_VALIDITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDebutValidite() <em>Debut Validite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebutValidite()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar debutValidite = DEBUT_VALIDITE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationUniteRenforcementsFeux() <em>Est Objet Association Unite Renforcements Feux</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationUniteRenforcementsFeux()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationUniteRenforcementsFeux;

	/**
	 * The cached value of the '{@link #getEstLocaliseEnAutreElementControle() <em>Est Localise En Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstLocaliseEnAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation estLocaliseEnAutreElementControle;

	/**
	 * The cached value of the '{@link #getAPourConsommationAlloueeVolumeMunitionsASS() <em>APour Consommation Allouee Volume Munitions ASS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourConsommationAlloueeVolumeMunitionsASS()
	 * @generated
	 * @ordered
	 */
	protected TypeVolumeMunitionsASS aPourConsommationAlloueeVolumeMunitionsASS;

	/**
	 * The cached value of the '{@link #getAPourMunitionsRestantesVolumeMunitionsASS() <em>APour Munitions Restantes Volume Munitions ASS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourMunitionsRestantesVolumeMunitionsASS()
	 * @generated
	 * @ordered
	 */
	protected TypeVolumeMunitionsASS aPourMunitionsRestantesVolumeMunitionsASS;

	/**
	 * The cached value of the '{@link #getAPourTypeRessourceRessourceActiviteType() <em>APour Type Ressource Ressource Activite Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourTypeRessourceRessourceActiviteType()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeRessourceActiviteType> aPourTypeRessourceRessourceActiviteType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeRenforcementsFeuxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeRenforcementsFeux();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeMissionASS getTypeRenforcement() {
		return typeRenforcement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeRenforcement(TypeDictionaryDicoTypeMissionASS newTypeRenforcement) {
		TypeDictionaryDicoTypeMissionASS oldTypeRenforcement = typeRenforcement;
		typeRenforcement = newTypeRenforcement == null ? TYPE_RENFORCEMENT_EDEFAULT : newTypeRenforcement;
		boolean oldTypeRenforcementESet = typeRenforcementESet;
		typeRenforcementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RENFORCEMENTS_FEUX__TYPE_RENFORCEMENT, oldTypeRenforcement, typeRenforcement, !oldTypeRenforcementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeRenforcement() {
		TypeDictionaryDicoTypeMissionASS oldTypeRenforcement = typeRenforcement;
		boolean oldTypeRenforcementESet = typeRenforcementESet;
		typeRenforcement = TYPE_RENFORCEMENT_EDEFAULT;
		typeRenforcementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_RENFORCEMENTS_FEUX__TYPE_RENFORCEMENT, oldTypeRenforcement, TYPE_RENFORCEMENT_EDEFAULT, oldTypeRenforcementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeRenforcement() {
		return typeRenforcementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutreTypeRenforcement() {
		return autreTypeRenforcement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutreTypeRenforcement(String newAutreTypeRenforcement) {
		String oldAutreTypeRenforcement = autreTypeRenforcement;
		autreTypeRenforcement = newAutreTypeRenforcement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RENFORCEMENTS_FEUX__AUTRE_TYPE_RENFORCEMENT, oldAutreTypeRenforcement, autreTypeRenforcement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getPreavis() {
		return preavis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreavis(TypeDataTypeDuree newPreavis, NotificationChain msgs) {
		TypeDataTypeDuree oldPreavis = preavis;
		preavis = newPreavis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RENFORCEMENTS_FEUX__PREAVIS, oldPreavis, newPreavis);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreavis(TypeDataTypeDuree newPreavis) {
		if (newPreavis != preavis) {
			NotificationChain msgs = null;
			if (preavis != null)
				msgs = ((InternalEObject)preavis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RENFORCEMENTS_FEUX__PREAVIS, null, msgs);
			if (newPreavis != null)
				msgs = ((InternalEObject)newPreavis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RENFORCEMENTS_FEUX__PREAVIS, null, msgs);
			msgs = basicSetPreavis(newPreavis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RENFORCEMENTS_FEUX__PREAVIS, newPreavis, newPreavis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDebutValidite() {
		return debutValidite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebutValidite(XMLGregorianCalendar newDebutValidite) {
		XMLGregorianCalendar oldDebutValidite = debutValidite;
		debutValidite = newDebutValidite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RENFORCEMENTS_FEUX__DEBUT_VALIDITE, oldDebutValidite, debutValidite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationUniteRenforcementsFeux() {
		if (estObjetAssociationUniteRenforcementsFeux == null) {
			estObjetAssociationUniteRenforcementsFeux = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_RENFORCEMENTS_FEUX__EST_OBJET_ASSOCIATION_UNITE_RENFORCEMENTS_FEUX);
		}
		return estObjetAssociationUniteRenforcementsFeux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getEstLocaliseEnAutreElementControle() {
		return estLocaliseEnAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstLocaliseEnAutreElementControle(TypeAssociation newEstLocaliseEnAutreElementControle, NotificationChain msgs) {
		TypeAssociation oldEstLocaliseEnAutreElementControle = estLocaliseEnAutreElementControle;
		estLocaliseEnAutreElementControle = newEstLocaliseEnAutreElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RENFORCEMENTS_FEUX__EST_LOCALISE_EN_AUTRE_ELEMENT_CONTROLE, oldEstLocaliseEnAutreElementControle, newEstLocaliseEnAutreElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstLocaliseEnAutreElementControle(TypeAssociation newEstLocaliseEnAutreElementControle) {
		if (newEstLocaliseEnAutreElementControle != estLocaliseEnAutreElementControle) {
			NotificationChain msgs = null;
			if (estLocaliseEnAutreElementControle != null)
				msgs = ((InternalEObject)estLocaliseEnAutreElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RENFORCEMENTS_FEUX__EST_LOCALISE_EN_AUTRE_ELEMENT_CONTROLE, null, msgs);
			if (newEstLocaliseEnAutreElementControle != null)
				msgs = ((InternalEObject)newEstLocaliseEnAutreElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RENFORCEMENTS_FEUX__EST_LOCALISE_EN_AUTRE_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetEstLocaliseEnAutreElementControle(newEstLocaliseEnAutreElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RENFORCEMENTS_FEUX__EST_LOCALISE_EN_AUTRE_ELEMENT_CONTROLE, newEstLocaliseEnAutreElementControle, newEstLocaliseEnAutreElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeVolumeMunitionsASS getAPourConsommationAlloueeVolumeMunitionsASS() {
		return aPourConsommationAlloueeVolumeMunitionsASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourConsommationAlloueeVolumeMunitionsASS(TypeVolumeMunitionsASS newAPourConsommationAlloueeVolumeMunitionsASS, NotificationChain msgs) {
		TypeVolumeMunitionsASS oldAPourConsommationAlloueeVolumeMunitionsASS = aPourConsommationAlloueeVolumeMunitionsASS;
		aPourConsommationAlloueeVolumeMunitionsASS = newAPourConsommationAlloueeVolumeMunitionsASS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RENFORCEMENTS_FEUX__APOUR_CONSOMMATION_ALLOUEE_VOLUME_MUNITIONS_ASS, oldAPourConsommationAlloueeVolumeMunitionsASS, newAPourConsommationAlloueeVolumeMunitionsASS);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourConsommationAlloueeVolumeMunitionsASS(TypeVolumeMunitionsASS newAPourConsommationAlloueeVolumeMunitionsASS) {
		if (newAPourConsommationAlloueeVolumeMunitionsASS != aPourConsommationAlloueeVolumeMunitionsASS) {
			NotificationChain msgs = null;
			if (aPourConsommationAlloueeVolumeMunitionsASS != null)
				msgs = ((InternalEObject)aPourConsommationAlloueeVolumeMunitionsASS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RENFORCEMENTS_FEUX__APOUR_CONSOMMATION_ALLOUEE_VOLUME_MUNITIONS_ASS, null, msgs);
			if (newAPourConsommationAlloueeVolumeMunitionsASS != null)
				msgs = ((InternalEObject)newAPourConsommationAlloueeVolumeMunitionsASS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RENFORCEMENTS_FEUX__APOUR_CONSOMMATION_ALLOUEE_VOLUME_MUNITIONS_ASS, null, msgs);
			msgs = basicSetAPourConsommationAlloueeVolumeMunitionsASS(newAPourConsommationAlloueeVolumeMunitionsASS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RENFORCEMENTS_FEUX__APOUR_CONSOMMATION_ALLOUEE_VOLUME_MUNITIONS_ASS, newAPourConsommationAlloueeVolumeMunitionsASS, newAPourConsommationAlloueeVolumeMunitionsASS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeVolumeMunitionsASS getAPourMunitionsRestantesVolumeMunitionsASS() {
		return aPourMunitionsRestantesVolumeMunitionsASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourMunitionsRestantesVolumeMunitionsASS(TypeVolumeMunitionsASS newAPourMunitionsRestantesVolumeMunitionsASS, NotificationChain msgs) {
		TypeVolumeMunitionsASS oldAPourMunitionsRestantesVolumeMunitionsASS = aPourMunitionsRestantesVolumeMunitionsASS;
		aPourMunitionsRestantesVolumeMunitionsASS = newAPourMunitionsRestantesVolumeMunitionsASS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RENFORCEMENTS_FEUX__APOUR_MUNITIONS_RESTANTES_VOLUME_MUNITIONS_ASS, oldAPourMunitionsRestantesVolumeMunitionsASS, newAPourMunitionsRestantesVolumeMunitionsASS);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourMunitionsRestantesVolumeMunitionsASS(TypeVolumeMunitionsASS newAPourMunitionsRestantesVolumeMunitionsASS) {
		if (newAPourMunitionsRestantesVolumeMunitionsASS != aPourMunitionsRestantesVolumeMunitionsASS) {
			NotificationChain msgs = null;
			if (aPourMunitionsRestantesVolumeMunitionsASS != null)
				msgs = ((InternalEObject)aPourMunitionsRestantesVolumeMunitionsASS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RENFORCEMENTS_FEUX__APOUR_MUNITIONS_RESTANTES_VOLUME_MUNITIONS_ASS, null, msgs);
			if (newAPourMunitionsRestantesVolumeMunitionsASS != null)
				msgs = ((InternalEObject)newAPourMunitionsRestantesVolumeMunitionsASS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RENFORCEMENTS_FEUX__APOUR_MUNITIONS_RESTANTES_VOLUME_MUNITIONS_ASS, null, msgs);
			msgs = basicSetAPourMunitionsRestantesVolumeMunitionsASS(newAPourMunitionsRestantesVolumeMunitionsASS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RENFORCEMENTS_FEUX__APOUR_MUNITIONS_RESTANTES_VOLUME_MUNITIONS_ASS, newAPourMunitionsRestantesVolumeMunitionsASS, newAPourMunitionsRestantesVolumeMunitionsASS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeRessourceActiviteType> getAPourTypeRessourceRessourceActiviteType() {
		if (aPourTypeRessourceRessourceActiviteType == null) {
			aPourTypeRessourceRessourceActiviteType = new EObjectContainmentEList<TypeRessourceActiviteType>(TypeRessourceActiviteType.class, this, SchemaPackage.TYPE_RENFORCEMENTS_FEUX__APOUR_TYPE_RESSOURCE_RESSOURCE_ACTIVITE_TYPE);
		}
		return aPourTypeRessourceRessourceActiviteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_RENFORCEMENTS_FEUX__PREAVIS:
				return basicSetPreavis(null, msgs);
			case SchemaPackage.TYPE_RENFORCEMENTS_FEUX__EST_OBJET_ASSOCIATION_UNITE_RENFORCEMENTS_FEUX:
				return ((InternalEList<?>)getEstObjetAssociationUniteRenforcementsFeux()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_RENFORCEMENTS_FEUX__EST_LOCALISE_EN_AUTRE_ELEMENT_CONTROLE:
				return basicSetEstLocaliseEnAutreElementControle(null, msgs);
			case SchemaPackage.TYPE_RENFORCEMENTS_FEUX__APOUR_CONSOMMATION_ALLOUEE_VOLUME_MUNITIONS_ASS:
				return basicSetAPourConsommationAlloueeVolumeMunitionsASS(null, msgs);
			case SchemaPackage.TYPE_RENFORCEMENTS_FEUX__APOUR_MUNITIONS_RESTANTES_VOLUME_MUNITIONS_ASS:
				return basicSetAPourMunitionsRestantesVolumeMunitionsASS(null, msgs);
			case SchemaPackage.TYPE_RENFORCEMENTS_FEUX__APOUR_TYPE_RESSOURCE_RESSOURCE_ACTIVITE_TYPE:
				return ((InternalEList<?>)getAPourTypeRessourceRessourceActiviteType()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_RENFORCEMENTS_FEUX__TYPE_RENFORCEMENT:
				return getTypeRenforcement();
			case SchemaPackage.TYPE_RENFORCEMENTS_FEUX__AUTRE_TYPE_RENFORCEMENT:
				return getAutreTypeRenforcement();
			case SchemaPackage.TYPE_RENFORCEMENTS_FEUX__PREAVIS:
				return getPreavis();
			case SchemaPackage.TYPE_RENFORCEMENTS_FEUX__DEBUT_VALIDITE:
				return getDebutValidite();
			case SchemaPackage.TYPE_RENFORCEMENTS_FEUX__EST_OBJET_ASSOCIATION_UNITE_RENFORCEMENTS_FEUX:
				return getEstObjetAssociationUniteRenforcementsFeux();
			case SchemaPackage.TYPE_RENFORCEMENTS_FEUX__EST_LOCALISE_EN_AUTRE_ELEMENT_CONTROLE:
				return getEstLocaliseEnAutreElementControle();
			case SchemaPackage.TYPE_RENFORCEMENTS_FEUX__APOUR_CONSOMMATION_ALLOUEE_VOLUME_MUNITIONS_ASS:
				return getAPourConsommationAlloueeVolumeMunitionsASS();
			case SchemaPackage.TYPE_RENFORCEMENTS_FEUX__APOUR_MUNITIONS_RESTANTES_VOLUME_MUNITIONS_ASS:
				return getAPourMunitionsRestantesVolumeMunitionsASS();
			case SchemaPackage.TYPE_RENFORCEMENTS_FEUX__APOUR_TYPE_RESSOURCE_RESSOURCE_ACTIVITE_TYPE:
				return getAPourTypeRessourceRessourceActiviteType();
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
			case SchemaPackage.TYPE_RENFORCEMENTS_FEUX__TYPE_RENFORCEMENT:
				setTypeRenforcement((TypeDictionaryDicoTypeMissionASS)newValue);
				return;
			case SchemaPackage.TYPE_RENFORCEMENTS_FEUX__AUTRE_TYPE_RENFORCEMENT:
				setAutreTypeRenforcement((String)newValue);
				return;
			case SchemaPackage.TYPE_RENFORCEMENTS_FEUX__PREAVIS:
				setPreavis((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_RENFORCEMENTS_FEUX__DEBUT_VALIDITE:
				setDebutValidite((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_RENFORCEMENTS_FEUX__EST_OBJET_ASSOCIATION_UNITE_RENFORCEMENTS_FEUX:
				getEstObjetAssociationUniteRenforcementsFeux().clear();
				getEstObjetAssociationUniteRenforcementsFeux().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_RENFORCEMENTS_FEUX__EST_LOCALISE_EN_AUTRE_ELEMENT_CONTROLE:
				setEstLocaliseEnAutreElementControle((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_RENFORCEMENTS_FEUX__APOUR_CONSOMMATION_ALLOUEE_VOLUME_MUNITIONS_ASS:
				setAPourConsommationAlloueeVolumeMunitionsASS((TypeVolumeMunitionsASS)newValue);
				return;
			case SchemaPackage.TYPE_RENFORCEMENTS_FEUX__APOUR_MUNITIONS_RESTANTES_VOLUME_MUNITIONS_ASS:
				setAPourMunitionsRestantesVolumeMunitionsASS((TypeVolumeMunitionsASS)newValue);
				return;
			case SchemaPackage.TYPE_RENFORCEMENTS_FEUX__APOUR_TYPE_RESSOURCE_RESSOURCE_ACTIVITE_TYPE:
				getAPourTypeRessourceRessourceActiviteType().clear();
				getAPourTypeRessourceRessourceActiviteType().addAll((Collection<? extends TypeRessourceActiviteType>)newValue);
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
			case SchemaPackage.TYPE_RENFORCEMENTS_FEUX__TYPE_RENFORCEMENT:
				unsetTypeRenforcement();
				return;
			case SchemaPackage.TYPE_RENFORCEMENTS_FEUX__AUTRE_TYPE_RENFORCEMENT:
				setAutreTypeRenforcement(AUTRE_TYPE_RENFORCEMENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RENFORCEMENTS_FEUX__PREAVIS:
				setPreavis((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_RENFORCEMENTS_FEUX__DEBUT_VALIDITE:
				setDebutValidite(DEBUT_VALIDITE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RENFORCEMENTS_FEUX__EST_OBJET_ASSOCIATION_UNITE_RENFORCEMENTS_FEUX:
				getEstObjetAssociationUniteRenforcementsFeux().clear();
				return;
			case SchemaPackage.TYPE_RENFORCEMENTS_FEUX__EST_LOCALISE_EN_AUTRE_ELEMENT_CONTROLE:
				setEstLocaliseEnAutreElementControle((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_RENFORCEMENTS_FEUX__APOUR_CONSOMMATION_ALLOUEE_VOLUME_MUNITIONS_ASS:
				setAPourConsommationAlloueeVolumeMunitionsASS((TypeVolumeMunitionsASS)null);
				return;
			case SchemaPackage.TYPE_RENFORCEMENTS_FEUX__APOUR_MUNITIONS_RESTANTES_VOLUME_MUNITIONS_ASS:
				setAPourMunitionsRestantesVolumeMunitionsASS((TypeVolumeMunitionsASS)null);
				return;
			case SchemaPackage.TYPE_RENFORCEMENTS_FEUX__APOUR_TYPE_RESSOURCE_RESSOURCE_ACTIVITE_TYPE:
				getAPourTypeRessourceRessourceActiviteType().clear();
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
			case SchemaPackage.TYPE_RENFORCEMENTS_FEUX__TYPE_RENFORCEMENT:
				return isSetTypeRenforcement();
			case SchemaPackage.TYPE_RENFORCEMENTS_FEUX__AUTRE_TYPE_RENFORCEMENT:
				return AUTRE_TYPE_RENFORCEMENT_EDEFAULT == null ? autreTypeRenforcement != null : !AUTRE_TYPE_RENFORCEMENT_EDEFAULT.equals(autreTypeRenforcement);
			case SchemaPackage.TYPE_RENFORCEMENTS_FEUX__PREAVIS:
				return preavis != null;
			case SchemaPackage.TYPE_RENFORCEMENTS_FEUX__DEBUT_VALIDITE:
				return DEBUT_VALIDITE_EDEFAULT == null ? debutValidite != null : !DEBUT_VALIDITE_EDEFAULT.equals(debutValidite);
			case SchemaPackage.TYPE_RENFORCEMENTS_FEUX__EST_OBJET_ASSOCIATION_UNITE_RENFORCEMENTS_FEUX:
				return estObjetAssociationUniteRenforcementsFeux != null && !estObjetAssociationUniteRenforcementsFeux.isEmpty();
			case SchemaPackage.TYPE_RENFORCEMENTS_FEUX__EST_LOCALISE_EN_AUTRE_ELEMENT_CONTROLE:
				return estLocaliseEnAutreElementControle != null;
			case SchemaPackage.TYPE_RENFORCEMENTS_FEUX__APOUR_CONSOMMATION_ALLOUEE_VOLUME_MUNITIONS_ASS:
				return aPourConsommationAlloueeVolumeMunitionsASS != null;
			case SchemaPackage.TYPE_RENFORCEMENTS_FEUX__APOUR_MUNITIONS_RESTANTES_VOLUME_MUNITIONS_ASS:
				return aPourMunitionsRestantesVolumeMunitionsASS != null;
			case SchemaPackage.TYPE_RENFORCEMENTS_FEUX__APOUR_TYPE_RESSOURCE_RESSOURCE_ACTIVITE_TYPE:
				return aPourTypeRessourceRessourceActiviteType != null && !aPourTypeRessourceRessourceActiviteType.isEmpty();
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
		result.append(" (typeRenforcement: ");
		if (typeRenforcementESet) result.append(typeRenforcement); else result.append("<unset>");
		result.append(", autreTypeRenforcement: ");
		result.append(autreTypeRenforcement);
		result.append(", debutValidite: ");
		result.append(debutValidite);
		result.append(')');
		return result.toString();
	}

} //TypeRenforcementsFeuxImpl
