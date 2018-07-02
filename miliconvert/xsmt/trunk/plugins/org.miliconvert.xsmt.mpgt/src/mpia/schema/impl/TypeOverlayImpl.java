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
import mpia.schema.TypeDictionaryDicoOverlayNiveauSecurite;
import mpia.schema.TypeDictionaryDicoOverlayType;
import mpia.schema.TypeOverlay;

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
 * An implementation of the model object '<em><b>Type Overlay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeOverlayImpl#getNumero <em>Numero</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeOverlayImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeOverlayImpl#getType <em>Type</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeOverlayImpl#getNiveauSecurite <em>Niveau Securite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeOverlayImpl#getDescriptif <em>Descriptif</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeOverlayImpl#getSignaturePC <em>Signature PC</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeOverlayImpl#getNumeroRoute <em>Numero Route</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeOverlayImpl#getDateInformation <em>Date Information</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeOverlayImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeOverlayImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeOverlayImpl#getDecritSymboleTactique <em>Decrit Symbole Tactique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeOverlayImpl#getEstReferenceMissionAerienne <em>Est Reference Mission Aerienne</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeOverlayImpl extends EObjectImpl implements TypeOverlay {
	/**
	 * The default value of the '{@link #getNumero() <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumero()
	 * @generated
	 * @ordered
	 */
	protected static final long NUMERO_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNumero() <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumero()
	 * @generated
	 * @ordered
	 */
	protected long numero = NUMERO_EDEFAULT;

	/**
	 * This is true if the Numero attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numeroESet;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoOverlayType TYPE_EDEFAULT = TypeDictionaryDicoOverlayType.TACTICAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoOverlayType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #getNiveauSecurite() <em>Niveau Securite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauSecurite()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoOverlayNiveauSecurite NIVEAU_SECURITE_EDEFAULT = TypeDictionaryDicoOverlayNiveauSecurite.R;

	/**
	 * The cached value of the '{@link #getNiveauSecurite() <em>Niveau Securite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauSecurite()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoOverlayNiveauSecurite niveauSecurite = NIVEAU_SECURITE_EDEFAULT;

	/**
	 * This is true if the Niveau Securite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean niveauSecuriteESet;

	/**
	 * The default value of the '{@link #getDescriptif() <em>Descriptif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptif()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTIF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescriptif() <em>Descriptif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptif()
	 * @generated
	 * @ordered
	 */
	protected String descriptif = DESCRIPTIF_EDEFAULT;

	/**
	 * The default value of the '{@link #getSignaturePC() <em>Signature PC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignaturePC()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNATURE_PC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignaturePC() <em>Signature PC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignaturePC()
	 * @generated
	 * @ordered
	 */
	protected String signaturePC = SIGNATURE_PC_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumeroRoute() <em>Numero Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroRoute()
	 * @generated
	 * @ordered
	 */
	protected static final long NUMERO_ROUTE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNumeroRoute() <em>Numero Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroRoute()
	 * @generated
	 * @ordered
	 */
	protected long numeroRoute = NUMERO_ROUTE_EDEFAULT;

	/**
	 * This is true if the Numero Route attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numeroRouteESet;

	/**
	 * The default value of the '{@link #getDateInformation() <em>Date Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateInformation()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_INFORMATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateInformation() <em>Date Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateInformation()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateInformation = DATE_INFORMATION_EDEFAULT;

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
	 * The cached value of the '{@link #getDecritSymboleTactique() <em>Decrit Symbole Tactique</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecritSymboleTactique()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> decritSymboleTactique;

	/**
	 * The cached value of the '{@link #getEstReferenceMissionAerienne() <em>Est Reference Mission Aerienne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstReferenceMissionAerienne()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation estReferenceMissionAerienne;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeOverlayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeOverlay();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNumero() {
		return numero;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumero(long newNumero) {
		long oldNumero = numero;
		numero = newNumero;
		boolean oldNumeroESet = numeroESet;
		numeroESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OVERLAY__NUMERO, oldNumero, numero, !oldNumeroESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumero() {
		long oldNumero = numero;
		boolean oldNumeroESet = numeroESet;
		numero = NUMERO_EDEFAULT;
		numeroESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_OVERLAY__NUMERO, oldNumero, NUMERO_EDEFAULT, oldNumeroESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumero() {
		return numeroESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OVERLAY__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoOverlayType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeDictionaryDicoOverlayType newType) {
		TypeDictionaryDicoOverlayType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OVERLAY__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeDictionaryDicoOverlayType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_OVERLAY__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
	public TypeDictionaryDicoOverlayNiveauSecurite getNiveauSecurite() {
		return niveauSecurite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNiveauSecurite(TypeDictionaryDicoOverlayNiveauSecurite newNiveauSecurite) {
		TypeDictionaryDicoOverlayNiveauSecurite oldNiveauSecurite = niveauSecurite;
		niveauSecurite = newNiveauSecurite == null ? NIVEAU_SECURITE_EDEFAULT : newNiveauSecurite;
		boolean oldNiveauSecuriteESet = niveauSecuriteESet;
		niveauSecuriteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OVERLAY__NIVEAU_SECURITE, oldNiveauSecurite, niveauSecurite, !oldNiveauSecuriteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNiveauSecurite() {
		TypeDictionaryDicoOverlayNiveauSecurite oldNiveauSecurite = niveauSecurite;
		boolean oldNiveauSecuriteESet = niveauSecuriteESet;
		niveauSecurite = NIVEAU_SECURITE_EDEFAULT;
		niveauSecuriteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_OVERLAY__NIVEAU_SECURITE, oldNiveauSecurite, NIVEAU_SECURITE_EDEFAULT, oldNiveauSecuriteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNiveauSecurite() {
		return niveauSecuriteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescriptif() {
		return descriptif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptif(String newDescriptif) {
		String oldDescriptif = descriptif;
		descriptif = newDescriptif;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OVERLAY__DESCRIPTIF, oldDescriptif, descriptif));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSignaturePC() {
		return signaturePC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignaturePC(String newSignaturePC) {
		String oldSignaturePC = signaturePC;
		signaturePC = newSignaturePC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OVERLAY__SIGNATURE_PC, oldSignaturePC, signaturePC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNumeroRoute() {
		return numeroRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroRoute(long newNumeroRoute) {
		long oldNumeroRoute = numeroRoute;
		numeroRoute = newNumeroRoute;
		boolean oldNumeroRouteESet = numeroRouteESet;
		numeroRouteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OVERLAY__NUMERO_ROUTE, oldNumeroRoute, numeroRoute, !oldNumeroRouteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumeroRoute() {
		long oldNumeroRoute = numeroRoute;
		boolean oldNumeroRouteESet = numeroRouteESet;
		numeroRoute = NUMERO_ROUTE_EDEFAULT;
		numeroRouteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_OVERLAY__NUMERO_ROUTE, oldNumeroRoute, NUMERO_ROUTE_EDEFAULT, oldNumeroRouteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumeroRoute() {
		return numeroRouteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateInformation() {
		return dateInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateInformation(XMLGregorianCalendar newDateInformation) {
		XMLGregorianCalendar oldDateInformation = dateInformation;
		dateInformation = newDateInformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OVERLAY__DATE_INFORMATION, oldDateInformation, dateInformation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OVERLAY__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OVERLAY__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getDecritSymboleTactique() {
		if (decritSymboleTactique == null) {
			decritSymboleTactique = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_OVERLAY__DECRIT_SYMBOLE_TACTIQUE);
		}
		return decritSymboleTactique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getEstReferenceMissionAerienne() {
		return estReferenceMissionAerienne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstReferenceMissionAerienne(TypeAssociation newEstReferenceMissionAerienne, NotificationChain msgs) {
		TypeAssociation oldEstReferenceMissionAerienne = estReferenceMissionAerienne;
		estReferenceMissionAerienne = newEstReferenceMissionAerienne;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OVERLAY__EST_REFERENCE_MISSION_AERIENNE, oldEstReferenceMissionAerienne, newEstReferenceMissionAerienne);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstReferenceMissionAerienne(TypeAssociation newEstReferenceMissionAerienne) {
		if (newEstReferenceMissionAerienne != estReferenceMissionAerienne) {
			NotificationChain msgs = null;
			if (estReferenceMissionAerienne != null)
				msgs = ((InternalEObject)estReferenceMissionAerienne).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OVERLAY__EST_REFERENCE_MISSION_AERIENNE, null, msgs);
			if (newEstReferenceMissionAerienne != null)
				msgs = ((InternalEObject)newEstReferenceMissionAerienne).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OVERLAY__EST_REFERENCE_MISSION_AERIENNE, null, msgs);
			msgs = basicSetEstReferenceMissionAerienne(newEstReferenceMissionAerienne, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OVERLAY__EST_REFERENCE_MISSION_AERIENNE, newEstReferenceMissionAerienne, newEstReferenceMissionAerienne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_OVERLAY__DECRIT_SYMBOLE_TACTIQUE:
				return ((InternalEList<?>)getDecritSymboleTactique()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_OVERLAY__EST_REFERENCE_MISSION_AERIENNE:
				return basicSetEstReferenceMissionAerienne(null, msgs);
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
			case SchemaPackage.TYPE_OVERLAY__NUMERO:
				return new Long(getNumero());
			case SchemaPackage.TYPE_OVERLAY__NOM:
				return getNom();
			case SchemaPackage.TYPE_OVERLAY__TYPE:
				return getType();
			case SchemaPackage.TYPE_OVERLAY__NIVEAU_SECURITE:
				return getNiveauSecurite();
			case SchemaPackage.TYPE_OVERLAY__DESCRIPTIF:
				return getDescriptif();
			case SchemaPackage.TYPE_OVERLAY__SIGNATURE_PC:
				return getSignaturePC();
			case SchemaPackage.TYPE_OVERLAY__NUMERO_ROUTE:
				return new Long(getNumeroRoute());
			case SchemaPackage.TYPE_OVERLAY__DATE_INFORMATION:
				return getDateInformation();
			case SchemaPackage.TYPE_OVERLAY__CTE:
				return getCTE();
			case SchemaPackage.TYPE_OVERLAY__CE:
				return getCE();
			case SchemaPackage.TYPE_OVERLAY__DECRIT_SYMBOLE_TACTIQUE:
				return getDecritSymboleTactique();
			case SchemaPackage.TYPE_OVERLAY__EST_REFERENCE_MISSION_AERIENNE:
				return getEstReferenceMissionAerienne();
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
			case SchemaPackage.TYPE_OVERLAY__NUMERO:
				setNumero(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_OVERLAY__NOM:
				setNom((String)newValue);
				return;
			case SchemaPackage.TYPE_OVERLAY__TYPE:
				setType((TypeDictionaryDicoOverlayType)newValue);
				return;
			case SchemaPackage.TYPE_OVERLAY__NIVEAU_SECURITE:
				setNiveauSecurite((TypeDictionaryDicoOverlayNiveauSecurite)newValue);
				return;
			case SchemaPackage.TYPE_OVERLAY__DESCRIPTIF:
				setDescriptif((String)newValue);
				return;
			case SchemaPackage.TYPE_OVERLAY__SIGNATURE_PC:
				setSignaturePC((String)newValue);
				return;
			case SchemaPackage.TYPE_OVERLAY__NUMERO_ROUTE:
				setNumeroRoute(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_OVERLAY__DATE_INFORMATION:
				setDateInformation((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_OVERLAY__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_OVERLAY__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_OVERLAY__DECRIT_SYMBOLE_TACTIQUE:
				getDecritSymboleTactique().clear();
				getDecritSymboleTactique().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_OVERLAY__EST_REFERENCE_MISSION_AERIENNE:
				setEstReferenceMissionAerienne((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_OVERLAY__NUMERO:
				unsetNumero();
				return;
			case SchemaPackage.TYPE_OVERLAY__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case SchemaPackage.TYPE_OVERLAY__TYPE:
				unsetType();
				return;
			case SchemaPackage.TYPE_OVERLAY__NIVEAU_SECURITE:
				unsetNiveauSecurite();
				return;
			case SchemaPackage.TYPE_OVERLAY__DESCRIPTIF:
				setDescriptif(DESCRIPTIF_EDEFAULT);
				return;
			case SchemaPackage.TYPE_OVERLAY__SIGNATURE_PC:
				setSignaturePC(SIGNATURE_PC_EDEFAULT);
				return;
			case SchemaPackage.TYPE_OVERLAY__NUMERO_ROUTE:
				unsetNumeroRoute();
				return;
			case SchemaPackage.TYPE_OVERLAY__DATE_INFORMATION:
				setDateInformation(DATE_INFORMATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_OVERLAY__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_OVERLAY__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_OVERLAY__DECRIT_SYMBOLE_TACTIQUE:
				getDecritSymboleTactique().clear();
				return;
			case SchemaPackage.TYPE_OVERLAY__EST_REFERENCE_MISSION_AERIENNE:
				setEstReferenceMissionAerienne((TypeAssociation)null);
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
			case SchemaPackage.TYPE_OVERLAY__NUMERO:
				return isSetNumero();
			case SchemaPackage.TYPE_OVERLAY__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case SchemaPackage.TYPE_OVERLAY__TYPE:
				return isSetType();
			case SchemaPackage.TYPE_OVERLAY__NIVEAU_SECURITE:
				return isSetNiveauSecurite();
			case SchemaPackage.TYPE_OVERLAY__DESCRIPTIF:
				return DESCRIPTIF_EDEFAULT == null ? descriptif != null : !DESCRIPTIF_EDEFAULT.equals(descriptif);
			case SchemaPackage.TYPE_OVERLAY__SIGNATURE_PC:
				return SIGNATURE_PC_EDEFAULT == null ? signaturePC != null : !SIGNATURE_PC_EDEFAULT.equals(signaturePC);
			case SchemaPackage.TYPE_OVERLAY__NUMERO_ROUTE:
				return isSetNumeroRoute();
			case SchemaPackage.TYPE_OVERLAY__DATE_INFORMATION:
				return DATE_INFORMATION_EDEFAULT == null ? dateInformation != null : !DATE_INFORMATION_EDEFAULT.equals(dateInformation);
			case SchemaPackage.TYPE_OVERLAY__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_OVERLAY__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_OVERLAY__DECRIT_SYMBOLE_TACTIQUE:
				return decritSymboleTactique != null && !decritSymboleTactique.isEmpty();
			case SchemaPackage.TYPE_OVERLAY__EST_REFERENCE_MISSION_AERIENNE:
				return estReferenceMissionAerienne != null;
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
		result.append(" (numero: ");
		if (numeroESet) result.append(numero); else result.append("<unset>");
		result.append(", nom: ");
		result.append(nom);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", niveauSecurite: ");
		if (niveauSecuriteESet) result.append(niveauSecurite); else result.append("<unset>");
		result.append(", descriptif: ");
		result.append(descriptif);
		result.append(", signaturePC: ");
		result.append(signaturePC);
		result.append(", numeroRoute: ");
		if (numeroRouteESet) result.append(numeroRoute); else result.append("<unset>");
		result.append(", dateInformation: ");
		result.append(dateInformation);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeOverlayImpl
