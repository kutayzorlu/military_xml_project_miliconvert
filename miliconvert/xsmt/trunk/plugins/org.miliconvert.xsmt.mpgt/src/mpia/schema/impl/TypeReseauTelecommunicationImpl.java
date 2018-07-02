/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeFrequence;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCapaciteReseau;
import mpia.schema.TypeDictionaryDicoReseauTelecommunicationArchitecture;
import mpia.schema.TypeDictionaryDicoReseauTelecommunicationCategorie;
import mpia.schema.TypeDictionaryDicoReseauTelecommunicationMedia;
import mpia.schema.TypeDictionaryDicoReseauTelecommunicationNiveauQualite;
import mpia.schema.TypeDictionaryDicoReseauTelecommunicationSousCategorie;
import mpia.schema.TypeDictionaryDicoReseauTelecommunicationType;
import mpia.schema.TypeFrequence;
import mpia.schema.TypeReseauTelecommunication;

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
 * An implementation of the model object '<em><b>Type Reseau Telecommunication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeReseauTelecommunicationImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeReseauTelecommunicationImpl#getSousCategorie <em>Sous Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeReseauTelecommunicationImpl#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeReseauTelecommunicationImpl#getType <em>Type</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeReseauTelecommunicationImpl#getDebitMinimum <em>Debit Minimum</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeReseauTelecommunicationImpl#getDebitMaximum <em>Debit Maximum</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeReseauTelecommunicationImpl#getMedia <em>Media</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeReseauTelecommunicationImpl#getNombreCanaux <em>Nombre Canaux</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeReseauTelecommunicationImpl#getNiveauQualite <em>Niveau Qualite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeReseauTelecommunicationImpl#getSautFrequence <em>Saut Frequence</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeReseauTelecommunicationImpl#getAPourServiceReseauServiceReseau <em>APour Service Reseau Service Reseau</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeReseauTelecommunicationImpl#getACommeCapaciteReseauCapaciteReseau <em>AComme Capacite Reseau Capacite Reseau</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeReseauTelecommunicationImpl#getAPourFrequenceFrequence <em>APour Frequence Frequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeReseauTelecommunicationImpl extends TypeSiteImpl implements TypeReseauTelecommunication {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoReseauTelecommunicationCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoReseauTelecommunicationCategorie.BRDCST;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoReseauTelecommunicationCategorie categorie = CATEGORIE_EDEFAULT;

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
	protected static final TypeDictionaryDicoReseauTelecommunicationSousCategorie SOUS_CATEGORIE_EDEFAULT = TypeDictionaryDicoReseauTelecommunicationSousCategorie.CIRCSW;

	/**
	 * The cached value of the '{@link #getSousCategorie() <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSousCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoReseauTelecommunicationSousCategorie sousCategorie = SOUS_CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Sous Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sousCategorieESet;

	/**
	 * The default value of the '{@link #getArchitecture() <em>Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecture()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoReseauTelecommunicationArchitecture ARCHITECTURE_EDEFAULT = TypeDictionaryDicoReseauTelecommunicationArchitecture.ARCNET;

	/**
	 * The cached value of the '{@link #getArchitecture() <em>Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecture()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoReseauTelecommunicationArchitecture architecture = ARCHITECTURE_EDEFAULT;

	/**
	 * This is true if the Architecture attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean architectureESet;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoReseauTelecommunicationType TYPE_EDEFAULT = TypeDictionaryDicoReseauTelecommunicationType.BEMILCOM;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoReseauTelecommunicationType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #getDebitMinimum() <em>Debit Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebitMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final double DEBIT_MINIMUM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDebitMinimum() <em>Debit Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebitMinimum()
	 * @generated
	 * @ordered
	 */
	protected double debitMinimum = DEBIT_MINIMUM_EDEFAULT;

	/**
	 * This is true if the Debit Minimum attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean debitMinimumESet;

	/**
	 * The default value of the '{@link #getDebitMaximum() <em>Debit Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebitMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final double DEBIT_MAXIMUM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDebitMaximum() <em>Debit Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebitMaximum()
	 * @generated
	 * @ordered
	 */
	protected double debitMaximum = DEBIT_MAXIMUM_EDEFAULT;

	/**
	 * This is true if the Debit Maximum attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean debitMaximumESet;

	/**
	 * The default value of the '{@link #getMedia() <em>Media</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedia()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoReseauTelecommunicationMedia MEDIA_EDEFAULT = TypeDictionaryDicoReseauTelecommunicationMedia.CABLE;

	/**
	 * The cached value of the '{@link #getMedia() <em>Media</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedia()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoReseauTelecommunicationMedia media = MEDIA_EDEFAULT;

	/**
	 * This is true if the Media attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mediaESet;

	/**
	 * The default value of the '{@link #getNombreCanaux() <em>Nombre Canaux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreCanaux()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_CANAUX_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreCanaux() <em>Nombre Canaux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreCanaux()
	 * @generated
	 * @ordered
	 */
	protected long nombreCanaux = NOMBRE_CANAUX_EDEFAULT;

	/**
	 * This is true if the Nombre Canaux attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreCanauxESet;

	/**
	 * The default value of the '{@link #getNiveauQualite() <em>Niveau Qualite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauQualite()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoReseauTelecommunicationNiveauQualite NIVEAU_QUALITE_EDEFAULT = TypeDictionaryDicoReseauTelecommunicationNiveauQualite.GREEN;

	/**
	 * The cached value of the '{@link #getNiveauQualite() <em>Niveau Qualite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauQualite()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoReseauTelecommunicationNiveauQualite niveauQualite = NIVEAU_QUALITE_EDEFAULT;

	/**
	 * This is true if the Niveau Qualite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean niveauQualiteESet;

	/**
	 * The cached value of the '{@link #getSautFrequence() <em>Saut Frequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSautFrequence()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeFrequence sautFrequence;

	/**
	 * The cached value of the '{@link #getAPourServiceReseauServiceReseau() <em>APour Service Reseau Service Reseau</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourServiceReseauServiceReseau()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourServiceReseauServiceReseau;

	/**
	 * The cached value of the '{@link #getACommeCapaciteReseauCapaciteReseau() <em>AComme Capacite Reseau Capacite Reseau</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeCapaciteReseauCapaciteReseau()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeCapaciteReseau> aCommeCapaciteReseauCapaciteReseau;

	/**
	 * The cached value of the '{@link #getAPourFrequenceFrequence() <em>APour Frequence Frequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourFrequenceFrequence()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeFrequence> aPourFrequenceFrequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeReseauTelecommunicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeReseauTelecommunication();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoReseauTelecommunicationCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoReseauTelecommunicationCategorie newCategorie) {
		TypeDictionaryDicoReseauTelecommunicationCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoReseauTelecommunicationCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeDictionaryDicoReseauTelecommunicationSousCategorie getSousCategorie() {
		return sousCategorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSousCategorie(TypeDictionaryDicoReseauTelecommunicationSousCategorie newSousCategorie) {
		TypeDictionaryDicoReseauTelecommunicationSousCategorie oldSousCategorie = sousCategorie;
		sousCategorie = newSousCategorie == null ? SOUS_CATEGORIE_EDEFAULT : newSousCategorie;
		boolean oldSousCategorieESet = sousCategorieESet;
		sousCategorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__SOUS_CATEGORIE, oldSousCategorie, sousCategorie, !oldSousCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSousCategorie() {
		TypeDictionaryDicoReseauTelecommunicationSousCategorie oldSousCategorie = sousCategorie;
		boolean oldSousCategorieESet = sousCategorieESet;
		sousCategorie = SOUS_CATEGORIE_EDEFAULT;
		sousCategorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__SOUS_CATEGORIE, oldSousCategorie, SOUS_CATEGORIE_EDEFAULT, oldSousCategorieESet));
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
	public TypeDictionaryDicoReseauTelecommunicationArchitecture getArchitecture() {
		return architecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchitecture(TypeDictionaryDicoReseauTelecommunicationArchitecture newArchitecture) {
		TypeDictionaryDicoReseauTelecommunicationArchitecture oldArchitecture = architecture;
		architecture = newArchitecture == null ? ARCHITECTURE_EDEFAULT : newArchitecture;
		boolean oldArchitectureESet = architectureESet;
		architectureESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__ARCHITECTURE, oldArchitecture, architecture, !oldArchitectureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetArchitecture() {
		TypeDictionaryDicoReseauTelecommunicationArchitecture oldArchitecture = architecture;
		boolean oldArchitectureESet = architectureESet;
		architecture = ARCHITECTURE_EDEFAULT;
		architectureESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__ARCHITECTURE, oldArchitecture, ARCHITECTURE_EDEFAULT, oldArchitectureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetArchitecture() {
		return architectureESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoReseauTelecommunicationType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeDictionaryDicoReseauTelecommunicationType newType) {
		TypeDictionaryDicoReseauTelecommunicationType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeDictionaryDicoReseauTelecommunicationType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
	public double getDebitMinimum() {
		return debitMinimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebitMinimum(double newDebitMinimum) {
		double oldDebitMinimum = debitMinimum;
		debitMinimum = newDebitMinimum;
		boolean oldDebitMinimumESet = debitMinimumESet;
		debitMinimumESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__DEBIT_MINIMUM, oldDebitMinimum, debitMinimum, !oldDebitMinimumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDebitMinimum() {
		double oldDebitMinimum = debitMinimum;
		boolean oldDebitMinimumESet = debitMinimumESet;
		debitMinimum = DEBIT_MINIMUM_EDEFAULT;
		debitMinimumESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__DEBIT_MINIMUM, oldDebitMinimum, DEBIT_MINIMUM_EDEFAULT, oldDebitMinimumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDebitMinimum() {
		return debitMinimumESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDebitMaximum() {
		return debitMaximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebitMaximum(double newDebitMaximum) {
		double oldDebitMaximum = debitMaximum;
		debitMaximum = newDebitMaximum;
		boolean oldDebitMaximumESet = debitMaximumESet;
		debitMaximumESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__DEBIT_MAXIMUM, oldDebitMaximum, debitMaximum, !oldDebitMaximumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDebitMaximum() {
		double oldDebitMaximum = debitMaximum;
		boolean oldDebitMaximumESet = debitMaximumESet;
		debitMaximum = DEBIT_MAXIMUM_EDEFAULT;
		debitMaximumESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__DEBIT_MAXIMUM, oldDebitMaximum, DEBIT_MAXIMUM_EDEFAULT, oldDebitMaximumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDebitMaximum() {
		return debitMaximumESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoReseauTelecommunicationMedia getMedia() {
		return media;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedia(TypeDictionaryDicoReseauTelecommunicationMedia newMedia) {
		TypeDictionaryDicoReseauTelecommunicationMedia oldMedia = media;
		media = newMedia == null ? MEDIA_EDEFAULT : newMedia;
		boolean oldMediaESet = mediaESet;
		mediaESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__MEDIA, oldMedia, media, !oldMediaESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMedia() {
		TypeDictionaryDicoReseauTelecommunicationMedia oldMedia = media;
		boolean oldMediaESet = mediaESet;
		media = MEDIA_EDEFAULT;
		mediaESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__MEDIA, oldMedia, MEDIA_EDEFAULT, oldMediaESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMedia() {
		return mediaESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreCanaux() {
		return nombreCanaux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreCanaux(long newNombreCanaux) {
		long oldNombreCanaux = nombreCanaux;
		nombreCanaux = newNombreCanaux;
		boolean oldNombreCanauxESet = nombreCanauxESet;
		nombreCanauxESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__NOMBRE_CANAUX, oldNombreCanaux, nombreCanaux, !oldNombreCanauxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreCanaux() {
		long oldNombreCanaux = nombreCanaux;
		boolean oldNombreCanauxESet = nombreCanauxESet;
		nombreCanaux = NOMBRE_CANAUX_EDEFAULT;
		nombreCanauxESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__NOMBRE_CANAUX, oldNombreCanaux, NOMBRE_CANAUX_EDEFAULT, oldNombreCanauxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreCanaux() {
		return nombreCanauxESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoReseauTelecommunicationNiveauQualite getNiveauQualite() {
		return niveauQualite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNiveauQualite(TypeDictionaryDicoReseauTelecommunicationNiveauQualite newNiveauQualite) {
		TypeDictionaryDicoReseauTelecommunicationNiveauQualite oldNiveauQualite = niveauQualite;
		niveauQualite = newNiveauQualite == null ? NIVEAU_QUALITE_EDEFAULT : newNiveauQualite;
		boolean oldNiveauQualiteESet = niveauQualiteESet;
		niveauQualiteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__NIVEAU_QUALITE, oldNiveauQualite, niveauQualite, !oldNiveauQualiteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNiveauQualite() {
		TypeDictionaryDicoReseauTelecommunicationNiveauQualite oldNiveauQualite = niveauQualite;
		boolean oldNiveauQualiteESet = niveauQualiteESet;
		niveauQualite = NIVEAU_QUALITE_EDEFAULT;
		niveauQualiteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__NIVEAU_QUALITE, oldNiveauQualite, NIVEAU_QUALITE_EDEFAULT, oldNiveauQualiteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNiveauQualite() {
		return niveauQualiteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeFrequence getSautFrequence() {
		return sautFrequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSautFrequence(TypeDataTypeFrequence newSautFrequence, NotificationChain msgs) {
		TypeDataTypeFrequence oldSautFrequence = sautFrequence;
		sautFrequence = newSautFrequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__SAUT_FREQUENCE, oldSautFrequence, newSautFrequence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSautFrequence(TypeDataTypeFrequence newSautFrequence) {
		if (newSautFrequence != sautFrequence) {
			NotificationChain msgs = null;
			if (sautFrequence != null)
				msgs = ((InternalEObject)sautFrequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__SAUT_FREQUENCE, null, msgs);
			if (newSautFrequence != null)
				msgs = ((InternalEObject)newSautFrequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__SAUT_FREQUENCE, null, msgs);
			msgs = basicSetSautFrequence(newSautFrequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__SAUT_FREQUENCE, newSautFrequence, newSautFrequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourServiceReseauServiceReseau() {
		if (aPourServiceReseauServiceReseau == null) {
			aPourServiceReseauServiceReseau = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__APOUR_SERVICE_RESEAU_SERVICE_RESEAU);
		}
		return aPourServiceReseauServiceReseau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeCapaciteReseau> getACommeCapaciteReseauCapaciteReseau() {
		if (aCommeCapaciteReseauCapaciteReseau == null) {
			aCommeCapaciteReseauCapaciteReseau = new EObjectContainmentEList<TypeCapaciteReseau>(TypeCapaciteReseau.class, this, SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__ACOMME_CAPACITE_RESEAU_CAPACITE_RESEAU);
		}
		return aCommeCapaciteReseauCapaciteReseau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeFrequence> getAPourFrequenceFrequence() {
		if (aPourFrequenceFrequence == null) {
			aPourFrequenceFrequence = new EObjectContainmentEList<TypeFrequence>(TypeFrequence.class, this, SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__APOUR_FREQUENCE_FREQUENCE);
		}
		return aPourFrequenceFrequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__SAUT_FREQUENCE:
				return basicSetSautFrequence(null, msgs);
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__APOUR_SERVICE_RESEAU_SERVICE_RESEAU:
				return ((InternalEList<?>)getAPourServiceReseauServiceReseau()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__ACOMME_CAPACITE_RESEAU_CAPACITE_RESEAU:
				return ((InternalEList<?>)getACommeCapaciteReseauCapaciteReseau()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__APOUR_FREQUENCE_FREQUENCE:
				return ((InternalEList<?>)getAPourFrequenceFrequence()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__SOUS_CATEGORIE:
				return getSousCategorie();
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__ARCHITECTURE:
				return getArchitecture();
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__TYPE:
				return getType();
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__DEBIT_MINIMUM:
				return new Double(getDebitMinimum());
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__DEBIT_MAXIMUM:
				return new Double(getDebitMaximum());
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__MEDIA:
				return getMedia();
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__NOMBRE_CANAUX:
				return new Long(getNombreCanaux());
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__NIVEAU_QUALITE:
				return getNiveauQualite();
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__SAUT_FREQUENCE:
				return getSautFrequence();
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__APOUR_SERVICE_RESEAU_SERVICE_RESEAU:
				return getAPourServiceReseauServiceReseau();
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__ACOMME_CAPACITE_RESEAU_CAPACITE_RESEAU:
				return getACommeCapaciteReseauCapaciteReseau();
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__APOUR_FREQUENCE_FREQUENCE:
				return getAPourFrequenceFrequence();
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
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__CATEGORIE:
				setCategorie((TypeDictionaryDicoReseauTelecommunicationCategorie)newValue);
				return;
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__SOUS_CATEGORIE:
				setSousCategorie((TypeDictionaryDicoReseauTelecommunicationSousCategorie)newValue);
				return;
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__ARCHITECTURE:
				setArchitecture((TypeDictionaryDicoReseauTelecommunicationArchitecture)newValue);
				return;
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__TYPE:
				setType((TypeDictionaryDicoReseauTelecommunicationType)newValue);
				return;
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__DEBIT_MINIMUM:
				setDebitMinimum(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__DEBIT_MAXIMUM:
				setDebitMaximum(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__MEDIA:
				setMedia((TypeDictionaryDicoReseauTelecommunicationMedia)newValue);
				return;
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__NOMBRE_CANAUX:
				setNombreCanaux(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__NIVEAU_QUALITE:
				setNiveauQualite((TypeDictionaryDicoReseauTelecommunicationNiveauQualite)newValue);
				return;
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__SAUT_FREQUENCE:
				setSautFrequence((TypeDataTypeFrequence)newValue);
				return;
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__APOUR_SERVICE_RESEAU_SERVICE_RESEAU:
				getAPourServiceReseauServiceReseau().clear();
				getAPourServiceReseauServiceReseau().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__ACOMME_CAPACITE_RESEAU_CAPACITE_RESEAU:
				getACommeCapaciteReseauCapaciteReseau().clear();
				getACommeCapaciteReseauCapaciteReseau().addAll((Collection<? extends TypeCapaciteReseau>)newValue);
				return;
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__APOUR_FREQUENCE_FREQUENCE:
				getAPourFrequenceFrequence().clear();
				getAPourFrequenceFrequence().addAll((Collection<? extends TypeFrequence>)newValue);
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
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__SOUS_CATEGORIE:
				unsetSousCategorie();
				return;
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__ARCHITECTURE:
				unsetArchitecture();
				return;
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__TYPE:
				unsetType();
				return;
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__DEBIT_MINIMUM:
				unsetDebitMinimum();
				return;
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__DEBIT_MAXIMUM:
				unsetDebitMaximum();
				return;
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__MEDIA:
				unsetMedia();
				return;
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__NOMBRE_CANAUX:
				unsetNombreCanaux();
				return;
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__NIVEAU_QUALITE:
				unsetNiveauQualite();
				return;
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__SAUT_FREQUENCE:
				setSautFrequence((TypeDataTypeFrequence)null);
				return;
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__APOUR_SERVICE_RESEAU_SERVICE_RESEAU:
				getAPourServiceReseauServiceReseau().clear();
				return;
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__ACOMME_CAPACITE_RESEAU_CAPACITE_RESEAU:
				getACommeCapaciteReseauCapaciteReseau().clear();
				return;
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__APOUR_FREQUENCE_FREQUENCE:
				getAPourFrequenceFrequence().clear();
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
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__SOUS_CATEGORIE:
				return isSetSousCategorie();
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__ARCHITECTURE:
				return isSetArchitecture();
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__TYPE:
				return isSetType();
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__DEBIT_MINIMUM:
				return isSetDebitMinimum();
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__DEBIT_MAXIMUM:
				return isSetDebitMaximum();
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__MEDIA:
				return isSetMedia();
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__NOMBRE_CANAUX:
				return isSetNombreCanaux();
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__NIVEAU_QUALITE:
				return isSetNiveauQualite();
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__SAUT_FREQUENCE:
				return sautFrequence != null;
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__APOUR_SERVICE_RESEAU_SERVICE_RESEAU:
				return aPourServiceReseauServiceReseau != null && !aPourServiceReseauServiceReseau.isEmpty();
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__ACOMME_CAPACITE_RESEAU_CAPACITE_RESEAU:
				return aCommeCapaciteReseauCapaciteReseau != null && !aCommeCapaciteReseauCapaciteReseau.isEmpty();
			case SchemaPackage.TYPE_RESEAU_TELECOMMUNICATION__APOUR_FREQUENCE_FREQUENCE:
				return aPourFrequenceFrequence != null && !aPourFrequenceFrequence.isEmpty();
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
		result.append(", architecture: ");
		if (architectureESet) result.append(architecture); else result.append("<unset>");
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", debitMinimum: ");
		if (debitMinimumESet) result.append(debitMinimum); else result.append("<unset>");
		result.append(", debitMaximum: ");
		if (debitMaximumESet) result.append(debitMaximum); else result.append("<unset>");
		result.append(", media: ");
		if (mediaESet) result.append(media); else result.append("<unset>");
		result.append(", nombreCanaux: ");
		if (nombreCanauxESet) result.append(nombreCanaux); else result.append("<unset>");
		result.append(", niveauQualite: ");
		if (niveauQualiteESet) result.append(niveauQualite); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeReseauTelecommunicationImpl
