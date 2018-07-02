/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAtmosphere;
import mpia.schema.TypeAutrePhenomeneMeteorologique;
import mpia.schema.TypeCouvertureNuageuse;
import mpia.schema.TypeDictionaryDicoMeteorologieInterpretation;
import mpia.schema.TypeDictionaryDicoMeteorologieSource;
import mpia.schema.TypeElementMeteo;
import mpia.schema.TypeGivrage;
import mpia.schema.TypeLumiere;
import mpia.schema.TypePrecipitation;
import mpia.schema.TypeVent;
import mpia.schema.TypeVisibilite;

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
 * An implementation of the model object '<em><b>Type Element Meteo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeElementMeteoImpl#getSource <em>Source</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeElementMeteoImpl#isPardefaut <em>Pardefaut</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeElementMeteoImpl#getInterpretation <em>Interpretation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeElementMeteoImpl#getProbabilite <em>Probabilite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeElementMeteoImpl#getAPourVentVent <em>APour Vent Vent</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeElementMeteoImpl#getAPourCouvertureNuageuseCouvertureNuageuse <em>APour Couverture Nuageuse Couverture Nuageuse</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeElementMeteoImpl#getAPourAutrePhenomeneMeteorologiqueAutrePhenomeneMeteorologique <em>APour Autre Phenomene Meteorologique Autre Phenomene Meteorologique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeElementMeteoImpl#getAPourAtmosphereAtmosphere <em>APour Atmosphere Atmosphere</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeElementMeteoImpl#getAPourPrecipitationPrecipitation <em>APour Precipitation Precipitation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeElementMeteoImpl#getAPourVisibiliteVisibilite <em>APour Visibilite Visibilite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeElementMeteoImpl#getEstObjetAssociationMaterielMeteorologie <em>Est Objet Association Materiel Meteorologie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeElementMeteoImpl#getEstSujetAssociationMeteorologieSite <em>Est Sujet Association Meteorologie Site</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeElementMeteoImpl#getAPourLumiereLumiere <em>APour Lumiere Lumiere</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeElementMeteoImpl#getAPourTrancheHoraireTrancheMeteo <em>APour Tranche Horaire Tranche Meteo</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeElementMeteoImpl#getAPourGivrageGivrage <em>APour Givrage Givrage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeElementMeteoImpl#getEstObjetAssociationSiteMeteorologie <em>Est Objet Association Site Meteorologie</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeElementMeteoImpl extends TypeInstanceObjetImpl implements TypeElementMeteo {
	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMeteorologieSource SOURCE_EDEFAULT = TypeDictionaryDicoMeteorologieSource.FOR;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMeteorologieSource source = SOURCE_EDEFAULT;

	/**
	 * This is true if the Source attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sourceESet;

	/**
	 * The default value of the '{@link #isPardefaut() <em>Pardefaut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPardefaut()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PARDEFAUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPardefaut() <em>Pardefaut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPardefaut()
	 * @generated
	 * @ordered
	 */
	protected boolean pardefaut = PARDEFAUT_EDEFAULT;

	/**
	 * This is true if the Pardefaut attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pardefautESet;

	/**
	 * The default value of the '{@link #getInterpretation() <em>Interpretation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpretation()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMeteorologieInterpretation INTERPRETATION_EDEFAULT = TypeDictionaryDicoMeteorologieInterpretation.AVMAX;

	/**
	 * The cached value of the '{@link #getInterpretation() <em>Interpretation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpretation()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMeteorologieInterpretation interpretation = INTERPRETATION_EDEFAULT;

	/**
	 * This is true if the Interpretation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean interpretationESet;

	/**
	 * The default value of the '{@link #getProbabilite() <em>Probabilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbabilite()
	 * @generated
	 * @ordered
	 */
	protected static final double PROBABILITE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getProbabilite() <em>Probabilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbabilite()
	 * @generated
	 * @ordered
	 */
	protected double probabilite = PROBABILITE_EDEFAULT;

	/**
	 * This is true if the Probabilite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean probabiliteESet;

	/**
	 * The cached value of the '{@link #getAPourVentVent() <em>APour Vent Vent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourVentVent()
	 * @generated
	 * @ordered
	 */
	protected TypeVent aPourVentVent;

	/**
	 * The cached value of the '{@link #getAPourCouvertureNuageuseCouvertureNuageuse() <em>APour Couverture Nuageuse Couverture Nuageuse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCouvertureNuageuseCouvertureNuageuse()
	 * @generated
	 * @ordered
	 */
	protected TypeCouvertureNuageuse aPourCouvertureNuageuseCouvertureNuageuse;

	/**
	 * The cached value of the '{@link #getAPourAutrePhenomeneMeteorologiqueAutrePhenomeneMeteorologique() <em>APour Autre Phenomene Meteorologique Autre Phenomene Meteorologique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourAutrePhenomeneMeteorologiqueAutrePhenomeneMeteorologique()
	 * @generated
	 * @ordered
	 */
	protected TypeAutrePhenomeneMeteorologique aPourAutrePhenomeneMeteorologiqueAutrePhenomeneMeteorologique;

	/**
	 * The cached value of the '{@link #getAPourAtmosphereAtmosphere() <em>APour Atmosphere Atmosphere</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourAtmosphereAtmosphere()
	 * @generated
	 * @ordered
	 */
	protected TypeAtmosphere aPourAtmosphereAtmosphere;

	/**
	 * The cached value of the '{@link #getAPourPrecipitationPrecipitation() <em>APour Precipitation Precipitation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourPrecipitationPrecipitation()
	 * @generated
	 * @ordered
	 */
	protected TypePrecipitation aPourPrecipitationPrecipitation;

	/**
	 * The cached value of the '{@link #getAPourVisibiliteVisibilite() <em>APour Visibilite Visibilite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourVisibiliteVisibilite()
	 * @generated
	 * @ordered
	 */
	protected TypeVisibilite aPourVisibiliteVisibilite;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationMaterielMeteorologie() <em>Est Objet Association Materiel Meteorologie</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationMaterielMeteorologie()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationMaterielMeteorologie;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationMeteorologieSite() <em>Est Sujet Association Meteorologie Site</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationMeteorologieSite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationMeteorologieSite;

	/**
	 * The cached value of the '{@link #getAPourLumiereLumiere() <em>APour Lumiere Lumiere</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourLumiereLumiere()
	 * @generated
	 * @ordered
	 */
	protected TypeLumiere aPourLumiereLumiere;

	/**
	 * The cached value of the '{@link #getAPourTrancheHoraireTrancheMeteo() <em>APour Tranche Horaire Tranche Meteo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourTrancheHoraireTrancheMeteo()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourTrancheHoraireTrancheMeteo;

	/**
	 * The cached value of the '{@link #getAPourGivrageGivrage() <em>APour Givrage Givrage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourGivrageGivrage()
	 * @generated
	 * @ordered
	 */
	protected TypeGivrage aPourGivrageGivrage;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationSiteMeteorologie() <em>Est Objet Association Site Meteorologie</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationSiteMeteorologie()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationSiteMeteorologie;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeElementMeteoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeElementMeteo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMeteorologieSource getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(TypeDictionaryDicoMeteorologieSource newSource) {
		TypeDictionaryDicoMeteorologieSource oldSource = source;
		source = newSource == null ? SOURCE_EDEFAULT : newSource;
		boolean oldSourceESet = sourceESet;
		sourceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ELEMENT_METEO__SOURCE, oldSource, source, !oldSourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSource() {
		TypeDictionaryDicoMeteorologieSource oldSource = source;
		boolean oldSourceESet = sourceESet;
		source = SOURCE_EDEFAULT;
		sourceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ELEMENT_METEO__SOURCE, oldSource, SOURCE_EDEFAULT, oldSourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSource() {
		return sourceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPardefaut() {
		return pardefaut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPardefaut(boolean newPardefaut) {
		boolean oldPardefaut = pardefaut;
		pardefaut = newPardefaut;
		boolean oldPardefautESet = pardefautESet;
		pardefautESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ELEMENT_METEO__PARDEFAUT, oldPardefaut, pardefaut, !oldPardefautESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPardefaut() {
		boolean oldPardefaut = pardefaut;
		boolean oldPardefautESet = pardefautESet;
		pardefaut = PARDEFAUT_EDEFAULT;
		pardefautESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ELEMENT_METEO__PARDEFAUT, oldPardefaut, PARDEFAUT_EDEFAULT, oldPardefautESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPardefaut() {
		return pardefautESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMeteorologieInterpretation getInterpretation() {
		return interpretation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterpretation(TypeDictionaryDicoMeteorologieInterpretation newInterpretation) {
		TypeDictionaryDicoMeteorologieInterpretation oldInterpretation = interpretation;
		interpretation = newInterpretation == null ? INTERPRETATION_EDEFAULT : newInterpretation;
		boolean oldInterpretationESet = interpretationESet;
		interpretationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ELEMENT_METEO__INTERPRETATION, oldInterpretation, interpretation, !oldInterpretationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInterpretation() {
		TypeDictionaryDicoMeteorologieInterpretation oldInterpretation = interpretation;
		boolean oldInterpretationESet = interpretationESet;
		interpretation = INTERPRETATION_EDEFAULT;
		interpretationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ELEMENT_METEO__INTERPRETATION, oldInterpretation, INTERPRETATION_EDEFAULT, oldInterpretationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInterpretation() {
		return interpretationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getProbabilite() {
		return probabilite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbabilite(double newProbabilite) {
		double oldProbabilite = probabilite;
		probabilite = newProbabilite;
		boolean oldProbabiliteESet = probabiliteESet;
		probabiliteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ELEMENT_METEO__PROBABILITE, oldProbabilite, probabilite, !oldProbabiliteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProbabilite() {
		double oldProbabilite = probabilite;
		boolean oldProbabiliteESet = probabiliteESet;
		probabilite = PROBABILITE_EDEFAULT;
		probabiliteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ELEMENT_METEO__PROBABILITE, oldProbabilite, PROBABILITE_EDEFAULT, oldProbabiliteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProbabilite() {
		return probabiliteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeVent getAPourVentVent() {
		return aPourVentVent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourVentVent(TypeVent newAPourVentVent, NotificationChain msgs) {
		TypeVent oldAPourVentVent = aPourVentVent;
		aPourVentVent = newAPourVentVent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ELEMENT_METEO__APOUR_VENT_VENT, oldAPourVentVent, newAPourVentVent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourVentVent(TypeVent newAPourVentVent) {
		if (newAPourVentVent != aPourVentVent) {
			NotificationChain msgs = null;
			if (aPourVentVent != null)
				msgs = ((InternalEObject)aPourVentVent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ELEMENT_METEO__APOUR_VENT_VENT, null, msgs);
			if (newAPourVentVent != null)
				msgs = ((InternalEObject)newAPourVentVent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ELEMENT_METEO__APOUR_VENT_VENT, null, msgs);
			msgs = basicSetAPourVentVent(newAPourVentVent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ELEMENT_METEO__APOUR_VENT_VENT, newAPourVentVent, newAPourVentVent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeCouvertureNuageuse getAPourCouvertureNuageuseCouvertureNuageuse() {
		return aPourCouvertureNuageuseCouvertureNuageuse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourCouvertureNuageuseCouvertureNuageuse(TypeCouvertureNuageuse newAPourCouvertureNuageuseCouvertureNuageuse, NotificationChain msgs) {
		TypeCouvertureNuageuse oldAPourCouvertureNuageuseCouvertureNuageuse = aPourCouvertureNuageuseCouvertureNuageuse;
		aPourCouvertureNuageuseCouvertureNuageuse = newAPourCouvertureNuageuseCouvertureNuageuse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ELEMENT_METEO__APOUR_COUVERTURE_NUAGEUSE_COUVERTURE_NUAGEUSE, oldAPourCouvertureNuageuseCouvertureNuageuse, newAPourCouvertureNuageuseCouvertureNuageuse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourCouvertureNuageuseCouvertureNuageuse(TypeCouvertureNuageuse newAPourCouvertureNuageuseCouvertureNuageuse) {
		if (newAPourCouvertureNuageuseCouvertureNuageuse != aPourCouvertureNuageuseCouvertureNuageuse) {
			NotificationChain msgs = null;
			if (aPourCouvertureNuageuseCouvertureNuageuse != null)
				msgs = ((InternalEObject)aPourCouvertureNuageuseCouvertureNuageuse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ELEMENT_METEO__APOUR_COUVERTURE_NUAGEUSE_COUVERTURE_NUAGEUSE, null, msgs);
			if (newAPourCouvertureNuageuseCouvertureNuageuse != null)
				msgs = ((InternalEObject)newAPourCouvertureNuageuseCouvertureNuageuse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ELEMENT_METEO__APOUR_COUVERTURE_NUAGEUSE_COUVERTURE_NUAGEUSE, null, msgs);
			msgs = basicSetAPourCouvertureNuageuseCouvertureNuageuse(newAPourCouvertureNuageuseCouvertureNuageuse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ELEMENT_METEO__APOUR_COUVERTURE_NUAGEUSE_COUVERTURE_NUAGEUSE, newAPourCouvertureNuageuseCouvertureNuageuse, newAPourCouvertureNuageuseCouvertureNuageuse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAutrePhenomeneMeteorologique getAPourAutrePhenomeneMeteorologiqueAutrePhenomeneMeteorologique() {
		return aPourAutrePhenomeneMeteorologiqueAutrePhenomeneMeteorologique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourAutrePhenomeneMeteorologiqueAutrePhenomeneMeteorologique(TypeAutrePhenomeneMeteorologique newAPourAutrePhenomeneMeteorologiqueAutrePhenomeneMeteorologique, NotificationChain msgs) {
		TypeAutrePhenomeneMeteorologique oldAPourAutrePhenomeneMeteorologiqueAutrePhenomeneMeteorologique = aPourAutrePhenomeneMeteorologiqueAutrePhenomeneMeteorologique;
		aPourAutrePhenomeneMeteorologiqueAutrePhenomeneMeteorologique = newAPourAutrePhenomeneMeteorologiqueAutrePhenomeneMeteorologique;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ELEMENT_METEO__APOUR_AUTRE_PHENOMENE_METEOROLOGIQUE_AUTRE_PHENOMENE_METEOROLOGIQUE, oldAPourAutrePhenomeneMeteorologiqueAutrePhenomeneMeteorologique, newAPourAutrePhenomeneMeteorologiqueAutrePhenomeneMeteorologique);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourAutrePhenomeneMeteorologiqueAutrePhenomeneMeteorologique(TypeAutrePhenomeneMeteorologique newAPourAutrePhenomeneMeteorologiqueAutrePhenomeneMeteorologique) {
		if (newAPourAutrePhenomeneMeteorologiqueAutrePhenomeneMeteorologique != aPourAutrePhenomeneMeteorologiqueAutrePhenomeneMeteorologique) {
			NotificationChain msgs = null;
			if (aPourAutrePhenomeneMeteorologiqueAutrePhenomeneMeteorologique != null)
				msgs = ((InternalEObject)aPourAutrePhenomeneMeteorologiqueAutrePhenomeneMeteorologique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ELEMENT_METEO__APOUR_AUTRE_PHENOMENE_METEOROLOGIQUE_AUTRE_PHENOMENE_METEOROLOGIQUE, null, msgs);
			if (newAPourAutrePhenomeneMeteorologiqueAutrePhenomeneMeteorologique != null)
				msgs = ((InternalEObject)newAPourAutrePhenomeneMeteorologiqueAutrePhenomeneMeteorologique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ELEMENT_METEO__APOUR_AUTRE_PHENOMENE_METEOROLOGIQUE_AUTRE_PHENOMENE_METEOROLOGIQUE, null, msgs);
			msgs = basicSetAPourAutrePhenomeneMeteorologiqueAutrePhenomeneMeteorologique(newAPourAutrePhenomeneMeteorologiqueAutrePhenomeneMeteorologique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ELEMENT_METEO__APOUR_AUTRE_PHENOMENE_METEOROLOGIQUE_AUTRE_PHENOMENE_METEOROLOGIQUE, newAPourAutrePhenomeneMeteorologiqueAutrePhenomeneMeteorologique, newAPourAutrePhenomeneMeteorologiqueAutrePhenomeneMeteorologique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAtmosphere getAPourAtmosphereAtmosphere() {
		return aPourAtmosphereAtmosphere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourAtmosphereAtmosphere(TypeAtmosphere newAPourAtmosphereAtmosphere, NotificationChain msgs) {
		TypeAtmosphere oldAPourAtmosphereAtmosphere = aPourAtmosphereAtmosphere;
		aPourAtmosphereAtmosphere = newAPourAtmosphereAtmosphere;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ELEMENT_METEO__APOUR_ATMOSPHERE_ATMOSPHERE, oldAPourAtmosphereAtmosphere, newAPourAtmosphereAtmosphere);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourAtmosphereAtmosphere(TypeAtmosphere newAPourAtmosphereAtmosphere) {
		if (newAPourAtmosphereAtmosphere != aPourAtmosphereAtmosphere) {
			NotificationChain msgs = null;
			if (aPourAtmosphereAtmosphere != null)
				msgs = ((InternalEObject)aPourAtmosphereAtmosphere).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ELEMENT_METEO__APOUR_ATMOSPHERE_ATMOSPHERE, null, msgs);
			if (newAPourAtmosphereAtmosphere != null)
				msgs = ((InternalEObject)newAPourAtmosphereAtmosphere).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ELEMENT_METEO__APOUR_ATMOSPHERE_ATMOSPHERE, null, msgs);
			msgs = basicSetAPourAtmosphereAtmosphere(newAPourAtmosphereAtmosphere, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ELEMENT_METEO__APOUR_ATMOSPHERE_ATMOSPHERE, newAPourAtmosphereAtmosphere, newAPourAtmosphereAtmosphere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypePrecipitation getAPourPrecipitationPrecipitation() {
		return aPourPrecipitationPrecipitation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourPrecipitationPrecipitation(TypePrecipitation newAPourPrecipitationPrecipitation, NotificationChain msgs) {
		TypePrecipitation oldAPourPrecipitationPrecipitation = aPourPrecipitationPrecipitation;
		aPourPrecipitationPrecipitation = newAPourPrecipitationPrecipitation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ELEMENT_METEO__APOUR_PRECIPITATION_PRECIPITATION, oldAPourPrecipitationPrecipitation, newAPourPrecipitationPrecipitation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourPrecipitationPrecipitation(TypePrecipitation newAPourPrecipitationPrecipitation) {
		if (newAPourPrecipitationPrecipitation != aPourPrecipitationPrecipitation) {
			NotificationChain msgs = null;
			if (aPourPrecipitationPrecipitation != null)
				msgs = ((InternalEObject)aPourPrecipitationPrecipitation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ELEMENT_METEO__APOUR_PRECIPITATION_PRECIPITATION, null, msgs);
			if (newAPourPrecipitationPrecipitation != null)
				msgs = ((InternalEObject)newAPourPrecipitationPrecipitation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ELEMENT_METEO__APOUR_PRECIPITATION_PRECIPITATION, null, msgs);
			msgs = basicSetAPourPrecipitationPrecipitation(newAPourPrecipitationPrecipitation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ELEMENT_METEO__APOUR_PRECIPITATION_PRECIPITATION, newAPourPrecipitationPrecipitation, newAPourPrecipitationPrecipitation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeVisibilite getAPourVisibiliteVisibilite() {
		return aPourVisibiliteVisibilite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourVisibiliteVisibilite(TypeVisibilite newAPourVisibiliteVisibilite, NotificationChain msgs) {
		TypeVisibilite oldAPourVisibiliteVisibilite = aPourVisibiliteVisibilite;
		aPourVisibiliteVisibilite = newAPourVisibiliteVisibilite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ELEMENT_METEO__APOUR_VISIBILITE_VISIBILITE, oldAPourVisibiliteVisibilite, newAPourVisibiliteVisibilite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourVisibiliteVisibilite(TypeVisibilite newAPourVisibiliteVisibilite) {
		if (newAPourVisibiliteVisibilite != aPourVisibiliteVisibilite) {
			NotificationChain msgs = null;
			if (aPourVisibiliteVisibilite != null)
				msgs = ((InternalEObject)aPourVisibiliteVisibilite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ELEMENT_METEO__APOUR_VISIBILITE_VISIBILITE, null, msgs);
			if (newAPourVisibiliteVisibilite != null)
				msgs = ((InternalEObject)newAPourVisibiliteVisibilite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ELEMENT_METEO__APOUR_VISIBILITE_VISIBILITE, null, msgs);
			msgs = basicSetAPourVisibiliteVisibilite(newAPourVisibiliteVisibilite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ELEMENT_METEO__APOUR_VISIBILITE_VISIBILITE, newAPourVisibiliteVisibilite, newAPourVisibiliteVisibilite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationMaterielMeteorologie() {
		if (estObjetAssociationMaterielMeteorologie == null) {
			estObjetAssociationMaterielMeteorologie = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ELEMENT_METEO__EST_OBJET_ASSOCIATION_MATERIEL_METEOROLOGIE);
		}
		return estObjetAssociationMaterielMeteorologie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationMeteorologieSite() {
		if (estSujetAssociationMeteorologieSite == null) {
			estSujetAssociationMeteorologieSite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ELEMENT_METEO__EST_SUJET_ASSOCIATION_METEOROLOGIE_SITE);
		}
		return estSujetAssociationMeteorologieSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeLumiere getAPourLumiereLumiere() {
		return aPourLumiereLumiere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourLumiereLumiere(TypeLumiere newAPourLumiereLumiere, NotificationChain msgs) {
		TypeLumiere oldAPourLumiereLumiere = aPourLumiereLumiere;
		aPourLumiereLumiere = newAPourLumiereLumiere;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ELEMENT_METEO__APOUR_LUMIERE_LUMIERE, oldAPourLumiereLumiere, newAPourLumiereLumiere);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourLumiereLumiere(TypeLumiere newAPourLumiereLumiere) {
		if (newAPourLumiereLumiere != aPourLumiereLumiere) {
			NotificationChain msgs = null;
			if (aPourLumiereLumiere != null)
				msgs = ((InternalEObject)aPourLumiereLumiere).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ELEMENT_METEO__APOUR_LUMIERE_LUMIERE, null, msgs);
			if (newAPourLumiereLumiere != null)
				msgs = ((InternalEObject)newAPourLumiereLumiere).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ELEMENT_METEO__APOUR_LUMIERE_LUMIERE, null, msgs);
			msgs = basicSetAPourLumiereLumiere(newAPourLumiereLumiere, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ELEMENT_METEO__APOUR_LUMIERE_LUMIERE, newAPourLumiereLumiere, newAPourLumiereLumiere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourTrancheHoraireTrancheMeteo() {
		return aPourTrancheHoraireTrancheMeteo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourTrancheHoraireTrancheMeteo(TypeAssociation newAPourTrancheHoraireTrancheMeteo, NotificationChain msgs) {
		TypeAssociation oldAPourTrancheHoraireTrancheMeteo = aPourTrancheHoraireTrancheMeteo;
		aPourTrancheHoraireTrancheMeteo = newAPourTrancheHoraireTrancheMeteo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ELEMENT_METEO__APOUR_TRANCHE_HORAIRE_TRANCHE_METEO, oldAPourTrancheHoraireTrancheMeteo, newAPourTrancheHoraireTrancheMeteo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourTrancheHoraireTrancheMeteo(TypeAssociation newAPourTrancheHoraireTrancheMeteo) {
		if (newAPourTrancheHoraireTrancheMeteo != aPourTrancheHoraireTrancheMeteo) {
			NotificationChain msgs = null;
			if (aPourTrancheHoraireTrancheMeteo != null)
				msgs = ((InternalEObject)aPourTrancheHoraireTrancheMeteo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ELEMENT_METEO__APOUR_TRANCHE_HORAIRE_TRANCHE_METEO, null, msgs);
			if (newAPourTrancheHoraireTrancheMeteo != null)
				msgs = ((InternalEObject)newAPourTrancheHoraireTrancheMeteo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ELEMENT_METEO__APOUR_TRANCHE_HORAIRE_TRANCHE_METEO, null, msgs);
			msgs = basicSetAPourTrancheHoraireTrancheMeteo(newAPourTrancheHoraireTrancheMeteo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ELEMENT_METEO__APOUR_TRANCHE_HORAIRE_TRANCHE_METEO, newAPourTrancheHoraireTrancheMeteo, newAPourTrancheHoraireTrancheMeteo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeGivrage getAPourGivrageGivrage() {
		return aPourGivrageGivrage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourGivrageGivrage(TypeGivrage newAPourGivrageGivrage, NotificationChain msgs) {
		TypeGivrage oldAPourGivrageGivrage = aPourGivrageGivrage;
		aPourGivrageGivrage = newAPourGivrageGivrage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ELEMENT_METEO__APOUR_GIVRAGE_GIVRAGE, oldAPourGivrageGivrage, newAPourGivrageGivrage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourGivrageGivrage(TypeGivrage newAPourGivrageGivrage) {
		if (newAPourGivrageGivrage != aPourGivrageGivrage) {
			NotificationChain msgs = null;
			if (aPourGivrageGivrage != null)
				msgs = ((InternalEObject)aPourGivrageGivrage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ELEMENT_METEO__APOUR_GIVRAGE_GIVRAGE, null, msgs);
			if (newAPourGivrageGivrage != null)
				msgs = ((InternalEObject)newAPourGivrageGivrage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ELEMENT_METEO__APOUR_GIVRAGE_GIVRAGE, null, msgs);
			msgs = basicSetAPourGivrageGivrage(newAPourGivrageGivrage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ELEMENT_METEO__APOUR_GIVRAGE_GIVRAGE, newAPourGivrageGivrage, newAPourGivrageGivrage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationSiteMeteorologie() {
		if (estObjetAssociationSiteMeteorologie == null) {
			estObjetAssociationSiteMeteorologie = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ELEMENT_METEO__EST_OBJET_ASSOCIATION_SITE_METEOROLOGIE);
		}
		return estObjetAssociationSiteMeteorologie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ELEMENT_METEO__APOUR_VENT_VENT:
				return basicSetAPourVentVent(null, msgs);
			case SchemaPackage.TYPE_ELEMENT_METEO__APOUR_COUVERTURE_NUAGEUSE_COUVERTURE_NUAGEUSE:
				return basicSetAPourCouvertureNuageuseCouvertureNuageuse(null, msgs);
			case SchemaPackage.TYPE_ELEMENT_METEO__APOUR_AUTRE_PHENOMENE_METEOROLOGIQUE_AUTRE_PHENOMENE_METEOROLOGIQUE:
				return basicSetAPourAutrePhenomeneMeteorologiqueAutrePhenomeneMeteorologique(null, msgs);
			case SchemaPackage.TYPE_ELEMENT_METEO__APOUR_ATMOSPHERE_ATMOSPHERE:
				return basicSetAPourAtmosphereAtmosphere(null, msgs);
			case SchemaPackage.TYPE_ELEMENT_METEO__APOUR_PRECIPITATION_PRECIPITATION:
				return basicSetAPourPrecipitationPrecipitation(null, msgs);
			case SchemaPackage.TYPE_ELEMENT_METEO__APOUR_VISIBILITE_VISIBILITE:
				return basicSetAPourVisibiliteVisibilite(null, msgs);
			case SchemaPackage.TYPE_ELEMENT_METEO__EST_OBJET_ASSOCIATION_MATERIEL_METEOROLOGIE:
				return ((InternalEList<?>)getEstObjetAssociationMaterielMeteorologie()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ELEMENT_METEO__EST_SUJET_ASSOCIATION_METEOROLOGIE_SITE:
				return ((InternalEList<?>)getEstSujetAssociationMeteorologieSite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ELEMENT_METEO__APOUR_LUMIERE_LUMIERE:
				return basicSetAPourLumiereLumiere(null, msgs);
			case SchemaPackage.TYPE_ELEMENT_METEO__APOUR_TRANCHE_HORAIRE_TRANCHE_METEO:
				return basicSetAPourTrancheHoraireTrancheMeteo(null, msgs);
			case SchemaPackage.TYPE_ELEMENT_METEO__APOUR_GIVRAGE_GIVRAGE:
				return basicSetAPourGivrageGivrage(null, msgs);
			case SchemaPackage.TYPE_ELEMENT_METEO__EST_OBJET_ASSOCIATION_SITE_METEOROLOGIE:
				return ((InternalEList<?>)getEstObjetAssociationSiteMeteorologie()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_ELEMENT_METEO__SOURCE:
				return getSource();
			case SchemaPackage.TYPE_ELEMENT_METEO__PARDEFAUT:
				return isPardefaut() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_ELEMENT_METEO__INTERPRETATION:
				return getInterpretation();
			case SchemaPackage.TYPE_ELEMENT_METEO__PROBABILITE:
				return new Double(getProbabilite());
			case SchemaPackage.TYPE_ELEMENT_METEO__APOUR_VENT_VENT:
				return getAPourVentVent();
			case SchemaPackage.TYPE_ELEMENT_METEO__APOUR_COUVERTURE_NUAGEUSE_COUVERTURE_NUAGEUSE:
				return getAPourCouvertureNuageuseCouvertureNuageuse();
			case SchemaPackage.TYPE_ELEMENT_METEO__APOUR_AUTRE_PHENOMENE_METEOROLOGIQUE_AUTRE_PHENOMENE_METEOROLOGIQUE:
				return getAPourAutrePhenomeneMeteorologiqueAutrePhenomeneMeteorologique();
			case SchemaPackage.TYPE_ELEMENT_METEO__APOUR_ATMOSPHERE_ATMOSPHERE:
				return getAPourAtmosphereAtmosphere();
			case SchemaPackage.TYPE_ELEMENT_METEO__APOUR_PRECIPITATION_PRECIPITATION:
				return getAPourPrecipitationPrecipitation();
			case SchemaPackage.TYPE_ELEMENT_METEO__APOUR_VISIBILITE_VISIBILITE:
				return getAPourVisibiliteVisibilite();
			case SchemaPackage.TYPE_ELEMENT_METEO__EST_OBJET_ASSOCIATION_MATERIEL_METEOROLOGIE:
				return getEstObjetAssociationMaterielMeteorologie();
			case SchemaPackage.TYPE_ELEMENT_METEO__EST_SUJET_ASSOCIATION_METEOROLOGIE_SITE:
				return getEstSujetAssociationMeteorologieSite();
			case SchemaPackage.TYPE_ELEMENT_METEO__APOUR_LUMIERE_LUMIERE:
				return getAPourLumiereLumiere();
			case SchemaPackage.TYPE_ELEMENT_METEO__APOUR_TRANCHE_HORAIRE_TRANCHE_METEO:
				return getAPourTrancheHoraireTrancheMeteo();
			case SchemaPackage.TYPE_ELEMENT_METEO__APOUR_GIVRAGE_GIVRAGE:
				return getAPourGivrageGivrage();
			case SchemaPackage.TYPE_ELEMENT_METEO__EST_OBJET_ASSOCIATION_SITE_METEOROLOGIE:
				return getEstObjetAssociationSiteMeteorologie();
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
			case SchemaPackage.TYPE_ELEMENT_METEO__SOURCE:
				setSource((TypeDictionaryDicoMeteorologieSource)newValue);
				return;
			case SchemaPackage.TYPE_ELEMENT_METEO__PARDEFAUT:
				setPardefaut(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_ELEMENT_METEO__INTERPRETATION:
				setInterpretation((TypeDictionaryDicoMeteorologieInterpretation)newValue);
				return;
			case SchemaPackage.TYPE_ELEMENT_METEO__PROBABILITE:
				setProbabilite(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_ELEMENT_METEO__APOUR_VENT_VENT:
				setAPourVentVent((TypeVent)newValue);
				return;
			case SchemaPackage.TYPE_ELEMENT_METEO__APOUR_COUVERTURE_NUAGEUSE_COUVERTURE_NUAGEUSE:
				setAPourCouvertureNuageuseCouvertureNuageuse((TypeCouvertureNuageuse)newValue);
				return;
			case SchemaPackage.TYPE_ELEMENT_METEO__APOUR_AUTRE_PHENOMENE_METEOROLOGIQUE_AUTRE_PHENOMENE_METEOROLOGIQUE:
				setAPourAutrePhenomeneMeteorologiqueAutrePhenomeneMeteorologique((TypeAutrePhenomeneMeteorologique)newValue);
				return;
			case SchemaPackage.TYPE_ELEMENT_METEO__APOUR_ATMOSPHERE_ATMOSPHERE:
				setAPourAtmosphereAtmosphere((TypeAtmosphere)newValue);
				return;
			case SchemaPackage.TYPE_ELEMENT_METEO__APOUR_PRECIPITATION_PRECIPITATION:
				setAPourPrecipitationPrecipitation((TypePrecipitation)newValue);
				return;
			case SchemaPackage.TYPE_ELEMENT_METEO__APOUR_VISIBILITE_VISIBILITE:
				setAPourVisibiliteVisibilite((TypeVisibilite)newValue);
				return;
			case SchemaPackage.TYPE_ELEMENT_METEO__EST_OBJET_ASSOCIATION_MATERIEL_METEOROLOGIE:
				getEstObjetAssociationMaterielMeteorologie().clear();
				getEstObjetAssociationMaterielMeteorologie().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ELEMENT_METEO__EST_SUJET_ASSOCIATION_METEOROLOGIE_SITE:
				getEstSujetAssociationMeteorologieSite().clear();
				getEstSujetAssociationMeteorologieSite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ELEMENT_METEO__APOUR_LUMIERE_LUMIERE:
				setAPourLumiereLumiere((TypeLumiere)newValue);
				return;
			case SchemaPackage.TYPE_ELEMENT_METEO__APOUR_TRANCHE_HORAIRE_TRANCHE_METEO:
				setAPourTrancheHoraireTrancheMeteo((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ELEMENT_METEO__APOUR_GIVRAGE_GIVRAGE:
				setAPourGivrageGivrage((TypeGivrage)newValue);
				return;
			case SchemaPackage.TYPE_ELEMENT_METEO__EST_OBJET_ASSOCIATION_SITE_METEOROLOGIE:
				getEstObjetAssociationSiteMeteorologie().clear();
				getEstObjetAssociationSiteMeteorologie().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_ELEMENT_METEO__SOURCE:
				unsetSource();
				return;
			case SchemaPackage.TYPE_ELEMENT_METEO__PARDEFAUT:
				unsetPardefaut();
				return;
			case SchemaPackage.TYPE_ELEMENT_METEO__INTERPRETATION:
				unsetInterpretation();
				return;
			case SchemaPackage.TYPE_ELEMENT_METEO__PROBABILITE:
				unsetProbabilite();
				return;
			case SchemaPackage.TYPE_ELEMENT_METEO__APOUR_VENT_VENT:
				setAPourVentVent((TypeVent)null);
				return;
			case SchemaPackage.TYPE_ELEMENT_METEO__APOUR_COUVERTURE_NUAGEUSE_COUVERTURE_NUAGEUSE:
				setAPourCouvertureNuageuseCouvertureNuageuse((TypeCouvertureNuageuse)null);
				return;
			case SchemaPackage.TYPE_ELEMENT_METEO__APOUR_AUTRE_PHENOMENE_METEOROLOGIQUE_AUTRE_PHENOMENE_METEOROLOGIQUE:
				setAPourAutrePhenomeneMeteorologiqueAutrePhenomeneMeteorologique((TypeAutrePhenomeneMeteorologique)null);
				return;
			case SchemaPackage.TYPE_ELEMENT_METEO__APOUR_ATMOSPHERE_ATMOSPHERE:
				setAPourAtmosphereAtmosphere((TypeAtmosphere)null);
				return;
			case SchemaPackage.TYPE_ELEMENT_METEO__APOUR_PRECIPITATION_PRECIPITATION:
				setAPourPrecipitationPrecipitation((TypePrecipitation)null);
				return;
			case SchemaPackage.TYPE_ELEMENT_METEO__APOUR_VISIBILITE_VISIBILITE:
				setAPourVisibiliteVisibilite((TypeVisibilite)null);
				return;
			case SchemaPackage.TYPE_ELEMENT_METEO__EST_OBJET_ASSOCIATION_MATERIEL_METEOROLOGIE:
				getEstObjetAssociationMaterielMeteorologie().clear();
				return;
			case SchemaPackage.TYPE_ELEMENT_METEO__EST_SUJET_ASSOCIATION_METEOROLOGIE_SITE:
				getEstSujetAssociationMeteorologieSite().clear();
				return;
			case SchemaPackage.TYPE_ELEMENT_METEO__APOUR_LUMIERE_LUMIERE:
				setAPourLumiereLumiere((TypeLumiere)null);
				return;
			case SchemaPackage.TYPE_ELEMENT_METEO__APOUR_TRANCHE_HORAIRE_TRANCHE_METEO:
				setAPourTrancheHoraireTrancheMeteo((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ELEMENT_METEO__APOUR_GIVRAGE_GIVRAGE:
				setAPourGivrageGivrage((TypeGivrage)null);
				return;
			case SchemaPackage.TYPE_ELEMENT_METEO__EST_OBJET_ASSOCIATION_SITE_METEOROLOGIE:
				getEstObjetAssociationSiteMeteorologie().clear();
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
			case SchemaPackage.TYPE_ELEMENT_METEO__SOURCE:
				return isSetSource();
			case SchemaPackage.TYPE_ELEMENT_METEO__PARDEFAUT:
				return isSetPardefaut();
			case SchemaPackage.TYPE_ELEMENT_METEO__INTERPRETATION:
				return isSetInterpretation();
			case SchemaPackage.TYPE_ELEMENT_METEO__PROBABILITE:
				return isSetProbabilite();
			case SchemaPackage.TYPE_ELEMENT_METEO__APOUR_VENT_VENT:
				return aPourVentVent != null;
			case SchemaPackage.TYPE_ELEMENT_METEO__APOUR_COUVERTURE_NUAGEUSE_COUVERTURE_NUAGEUSE:
				return aPourCouvertureNuageuseCouvertureNuageuse != null;
			case SchemaPackage.TYPE_ELEMENT_METEO__APOUR_AUTRE_PHENOMENE_METEOROLOGIQUE_AUTRE_PHENOMENE_METEOROLOGIQUE:
				return aPourAutrePhenomeneMeteorologiqueAutrePhenomeneMeteorologique != null;
			case SchemaPackage.TYPE_ELEMENT_METEO__APOUR_ATMOSPHERE_ATMOSPHERE:
				return aPourAtmosphereAtmosphere != null;
			case SchemaPackage.TYPE_ELEMENT_METEO__APOUR_PRECIPITATION_PRECIPITATION:
				return aPourPrecipitationPrecipitation != null;
			case SchemaPackage.TYPE_ELEMENT_METEO__APOUR_VISIBILITE_VISIBILITE:
				return aPourVisibiliteVisibilite != null;
			case SchemaPackage.TYPE_ELEMENT_METEO__EST_OBJET_ASSOCIATION_MATERIEL_METEOROLOGIE:
				return estObjetAssociationMaterielMeteorologie != null && !estObjetAssociationMaterielMeteorologie.isEmpty();
			case SchemaPackage.TYPE_ELEMENT_METEO__EST_SUJET_ASSOCIATION_METEOROLOGIE_SITE:
				return estSujetAssociationMeteorologieSite != null && !estSujetAssociationMeteorologieSite.isEmpty();
			case SchemaPackage.TYPE_ELEMENT_METEO__APOUR_LUMIERE_LUMIERE:
				return aPourLumiereLumiere != null;
			case SchemaPackage.TYPE_ELEMENT_METEO__APOUR_TRANCHE_HORAIRE_TRANCHE_METEO:
				return aPourTrancheHoraireTrancheMeteo != null;
			case SchemaPackage.TYPE_ELEMENT_METEO__APOUR_GIVRAGE_GIVRAGE:
				return aPourGivrageGivrage != null;
			case SchemaPackage.TYPE_ELEMENT_METEO__EST_OBJET_ASSOCIATION_SITE_METEOROLOGIE:
				return estObjetAssociationSiteMeteorologie != null && !estObjetAssociationSiteMeteorologie.isEmpty();
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
		result.append(" (source: ");
		if (sourceESet) result.append(source); else result.append("<unset>");
		result.append(", pardefaut: ");
		if (pardefautESet) result.append(pardefaut); else result.append("<unset>");
		result.append(", interpretation: ");
		if (interpretationESet) result.append(interpretation); else result.append("<unset>");
		result.append(", probabilite: ");
		if (probabiliteESet) result.append(probabilite); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeElementMeteoImpl
