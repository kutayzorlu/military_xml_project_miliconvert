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
import mpia.meta.TypeDataTypeAltitudePression;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeConflit3D;
import mpia.schema.TypeDictionaryDicoConflit3DTypeConflit;
import mpia.schema.TypeDictionaryDicoConflit3DnatureConflit;
import mpia.schema.TypeDictionaryDicoProbabiliteEvenement;
import mpia.schema.TypePeriode3D;

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
 * An implementation of the model object '<em><b>Type Conflit3 D</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeConflit3DImpl#getAltitudeConflit <em>Altitude Conflit</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConflit3DImpl#getNatureConflit <em>Nature Conflit</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConflit3DImpl#getTypeConflit <em>Type Conflit</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConflit3DImpl#getHeureApparitionConflit <em>Heure Apparition Conflit</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConflit3DImpl#getProbabiliteConflit <em>Probabilite Conflit</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConflit3DImpl#getEstSujetAssociationConflit3DMissionAerienne <em>Est Sujet Association Conflit3 DMission Aerienne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConflit3DImpl#getAPourVolumeEnConflitConsigne <em>APour Volume En Conflit Consigne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConflit3DImpl#getAPourModuleEnConflitModule <em>APour Module En Conflit Module</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConflit3DImpl#getAPourACMenConflitMesureCoordination <em>APour AC Men Conflit Mesure Coordination</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConflit3DImpl#getAPourACMEnResolutionMesureCoordination <em>APour ACM En Resolution Mesure Coordination</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConflit3DImpl#getACommePeriodeValiditeConsignePeriode3D <em>AComme Periode Validite Consigne Periode3 D</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConflit3DImpl#getACommeConsigneTirAppliquerConsigneTir <em>AComme Consigne Tir Appliquer Consigne Tir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConflit3DImpl#getAPourVolumeEnResolutionConsigne <em>APour Volume En Resolution Consigne</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeConflit3DImpl extends TypeEvenementImpl implements TypeConflit3D {
	/**
	 * The cached value of the '{@link #getAltitudeConflit() <em>Altitude Conflit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitudeConflit()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAltitudePression altitudeConflit;

	/**
	 * The default value of the '{@link #getNatureConflit() <em>Nature Conflit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatureConflit()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoConflit3DnatureConflit NATURE_CONFLIT_EDEFAULT = TypeDictionaryDicoConflit3DnatureConflit.POTEN;

	/**
	 * The cached value of the '{@link #getNatureConflit() <em>Nature Conflit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatureConflit()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoConflit3DnatureConflit natureConflit = NATURE_CONFLIT_EDEFAULT;

	/**
	 * This is true if the Nature Conflit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean natureConflitESet;

	/**
	 * The default value of the '{@link #getTypeConflit() <em>Type Conflit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeConflit()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoConflit3DTypeConflit TYPE_CONFLIT_EDEFAULT = TypeDictionaryDicoConflit3DTypeConflit.MM;

	/**
	 * The cached value of the '{@link #getTypeConflit() <em>Type Conflit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeConflit()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoConflit3DTypeConflit typeConflit = TYPE_CONFLIT_EDEFAULT;

	/**
	 * This is true if the Type Conflit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeConflitESet;

	/**
	 * The default value of the '{@link #getHeureApparitionConflit() <em>Heure Apparition Conflit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeureApparitionConflit()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar HEURE_APPARITION_CONFLIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeureApparitionConflit() <em>Heure Apparition Conflit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeureApparitionConflit()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar heureApparitionConflit = HEURE_APPARITION_CONFLIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getProbabiliteConflit() <em>Probabilite Conflit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbabiliteConflit()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoProbabiliteEvenement PROBABILITE_CONFLIT_EDEFAULT = TypeDictionaryDicoProbabiliteEvenement.HIGH;

	/**
	 * The cached value of the '{@link #getProbabiliteConflit() <em>Probabilite Conflit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbabiliteConflit()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoProbabiliteEvenement probabiliteConflit = PROBABILITE_CONFLIT_EDEFAULT;

	/**
	 * This is true if the Probabilite Conflit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean probabiliteConflitESet;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationConflit3DMissionAerienne() <em>Est Sujet Association Conflit3 DMission Aerienne</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationConflit3DMissionAerienne()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationConflit3DMissionAerienne;

	/**
	 * The cached value of the '{@link #getAPourVolumeEnConflitConsigne() <em>APour Volume En Conflit Consigne</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourVolumeEnConflitConsigne()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourVolumeEnConflitConsigne;

	/**
	 * The cached value of the '{@link #getAPourModuleEnConflitModule() <em>APour Module En Conflit Module</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourModuleEnConflitModule()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourModuleEnConflitModule;

	/**
	 * The cached value of the '{@link #getAPourACMenConflitMesureCoordination() <em>APour AC Men Conflit Mesure Coordination</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourACMenConflitMesureCoordination()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourACMenConflitMesureCoordination;

	/**
	 * The cached value of the '{@link #getAPourACMEnResolutionMesureCoordination() <em>APour ACM En Resolution Mesure Coordination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourACMEnResolutionMesureCoordination()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourACMEnResolutionMesureCoordination;

	/**
	 * The cached value of the '{@link #getACommePeriodeValiditeConsignePeriode3D() <em>AComme Periode Validite Consigne Periode3 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommePeriodeValiditeConsignePeriode3D()
	 * @generated
	 * @ordered
	 */
	protected TypePeriode3D aCommePeriodeValiditeConsignePeriode3D;

	/**
	 * The cached value of the '{@link #getACommeConsigneTirAppliquerConsigneTir() <em>AComme Consigne Tir Appliquer Consigne Tir</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeConsigneTirAppliquerConsigneTir()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aCommeConsigneTirAppliquerConsigneTir;

	/**
	 * The cached value of the '{@link #getAPourVolumeEnResolutionConsigne() <em>APour Volume En Resolution Consigne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourVolumeEnResolutionConsigne()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourVolumeEnResolutionConsigne;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeConflit3DImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeConflit3D();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAltitudePression getAltitudeConflit() {
		return altitudeConflit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAltitudeConflit(TypeDataTypeAltitudePression newAltitudeConflit, NotificationChain msgs) {
		TypeDataTypeAltitudePression oldAltitudeConflit = altitudeConflit;
		altitudeConflit = newAltitudeConflit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONFLIT3_D__ALTITUDE_CONFLIT, oldAltitudeConflit, newAltitudeConflit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAltitudeConflit(TypeDataTypeAltitudePression newAltitudeConflit) {
		if (newAltitudeConflit != altitudeConflit) {
			NotificationChain msgs = null;
			if (altitudeConflit != null)
				msgs = ((InternalEObject)altitudeConflit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONFLIT3_D__ALTITUDE_CONFLIT, null, msgs);
			if (newAltitudeConflit != null)
				msgs = ((InternalEObject)newAltitudeConflit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONFLIT3_D__ALTITUDE_CONFLIT, null, msgs);
			msgs = basicSetAltitudeConflit(newAltitudeConflit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONFLIT3_D__ALTITUDE_CONFLIT, newAltitudeConflit, newAltitudeConflit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoConflit3DnatureConflit getNatureConflit() {
		return natureConflit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNatureConflit(TypeDictionaryDicoConflit3DnatureConflit newNatureConflit) {
		TypeDictionaryDicoConflit3DnatureConflit oldNatureConflit = natureConflit;
		natureConflit = newNatureConflit == null ? NATURE_CONFLIT_EDEFAULT : newNatureConflit;
		boolean oldNatureConflitESet = natureConflitESet;
		natureConflitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONFLIT3_D__NATURE_CONFLIT, oldNatureConflit, natureConflit, !oldNatureConflitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNatureConflit() {
		TypeDictionaryDicoConflit3DnatureConflit oldNatureConflit = natureConflit;
		boolean oldNatureConflitESet = natureConflitESet;
		natureConflit = NATURE_CONFLIT_EDEFAULT;
		natureConflitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CONFLIT3_D__NATURE_CONFLIT, oldNatureConflit, NATURE_CONFLIT_EDEFAULT, oldNatureConflitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNatureConflit() {
		return natureConflitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoConflit3DTypeConflit getTypeConflit() {
		return typeConflit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeConflit(TypeDictionaryDicoConflit3DTypeConflit newTypeConflit) {
		TypeDictionaryDicoConflit3DTypeConflit oldTypeConflit = typeConflit;
		typeConflit = newTypeConflit == null ? TYPE_CONFLIT_EDEFAULT : newTypeConflit;
		boolean oldTypeConflitESet = typeConflitESet;
		typeConflitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONFLIT3_D__TYPE_CONFLIT, oldTypeConflit, typeConflit, !oldTypeConflitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeConflit() {
		TypeDictionaryDicoConflit3DTypeConflit oldTypeConflit = typeConflit;
		boolean oldTypeConflitESet = typeConflitESet;
		typeConflit = TYPE_CONFLIT_EDEFAULT;
		typeConflitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CONFLIT3_D__TYPE_CONFLIT, oldTypeConflit, TYPE_CONFLIT_EDEFAULT, oldTypeConflitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeConflit() {
		return typeConflitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getHeureApparitionConflit() {
		return heureApparitionConflit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeureApparitionConflit(XMLGregorianCalendar newHeureApparitionConflit) {
		XMLGregorianCalendar oldHeureApparitionConflit = heureApparitionConflit;
		heureApparitionConflit = newHeureApparitionConflit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONFLIT3_D__HEURE_APPARITION_CONFLIT, oldHeureApparitionConflit, heureApparitionConflit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoProbabiliteEvenement getProbabiliteConflit() {
		return probabiliteConflit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbabiliteConflit(TypeDictionaryDicoProbabiliteEvenement newProbabiliteConflit) {
		TypeDictionaryDicoProbabiliteEvenement oldProbabiliteConflit = probabiliteConflit;
		probabiliteConflit = newProbabiliteConflit == null ? PROBABILITE_CONFLIT_EDEFAULT : newProbabiliteConflit;
		boolean oldProbabiliteConflitESet = probabiliteConflitESet;
		probabiliteConflitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONFLIT3_D__PROBABILITE_CONFLIT, oldProbabiliteConflit, probabiliteConflit, !oldProbabiliteConflitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProbabiliteConflit() {
		TypeDictionaryDicoProbabiliteEvenement oldProbabiliteConflit = probabiliteConflit;
		boolean oldProbabiliteConflitESet = probabiliteConflitESet;
		probabiliteConflit = PROBABILITE_CONFLIT_EDEFAULT;
		probabiliteConflitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CONFLIT3_D__PROBABILITE_CONFLIT, oldProbabiliteConflit, PROBABILITE_CONFLIT_EDEFAULT, oldProbabiliteConflitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProbabiliteConflit() {
		return probabiliteConflitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationConflit3DMissionAerienne() {
		if (estSujetAssociationConflit3DMissionAerienne == null) {
			estSujetAssociationConflit3DMissionAerienne = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_CONFLIT3_D__EST_SUJET_ASSOCIATION_CONFLIT3_DMISSION_AERIENNE);
		}
		return estSujetAssociationConflit3DMissionAerienne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourVolumeEnConflitConsigne() {
		if (aPourVolumeEnConflitConsigne == null) {
			aPourVolumeEnConflitConsigne = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_CONFLIT3_D__APOUR_VOLUME_EN_CONFLIT_CONSIGNE);
		}
		return aPourVolumeEnConflitConsigne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourModuleEnConflitModule() {
		if (aPourModuleEnConflitModule == null) {
			aPourModuleEnConflitModule = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_CONFLIT3_D__APOUR_MODULE_EN_CONFLIT_MODULE);
		}
		return aPourModuleEnConflitModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourACMenConflitMesureCoordination() {
		if (aPourACMenConflitMesureCoordination == null) {
			aPourACMenConflitMesureCoordination = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_CONFLIT3_D__APOUR_AC_MEN_CONFLIT_MESURE_COORDINATION);
		}
		return aPourACMenConflitMesureCoordination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourACMEnResolutionMesureCoordination() {
		return aPourACMEnResolutionMesureCoordination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourACMEnResolutionMesureCoordination(TypeAssociation newAPourACMEnResolutionMesureCoordination, NotificationChain msgs) {
		TypeAssociation oldAPourACMEnResolutionMesureCoordination = aPourACMEnResolutionMesureCoordination;
		aPourACMEnResolutionMesureCoordination = newAPourACMEnResolutionMesureCoordination;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONFLIT3_D__APOUR_ACM_EN_RESOLUTION_MESURE_COORDINATION, oldAPourACMEnResolutionMesureCoordination, newAPourACMEnResolutionMesureCoordination);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourACMEnResolutionMesureCoordination(TypeAssociation newAPourACMEnResolutionMesureCoordination) {
		if (newAPourACMEnResolutionMesureCoordination != aPourACMEnResolutionMesureCoordination) {
			NotificationChain msgs = null;
			if (aPourACMEnResolutionMesureCoordination != null)
				msgs = ((InternalEObject)aPourACMEnResolutionMesureCoordination).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONFLIT3_D__APOUR_ACM_EN_RESOLUTION_MESURE_COORDINATION, null, msgs);
			if (newAPourACMEnResolutionMesureCoordination != null)
				msgs = ((InternalEObject)newAPourACMEnResolutionMesureCoordination).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONFLIT3_D__APOUR_ACM_EN_RESOLUTION_MESURE_COORDINATION, null, msgs);
			msgs = basicSetAPourACMEnResolutionMesureCoordination(newAPourACMEnResolutionMesureCoordination, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONFLIT3_D__APOUR_ACM_EN_RESOLUTION_MESURE_COORDINATION, newAPourACMEnResolutionMesureCoordination, newAPourACMEnResolutionMesureCoordination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypePeriode3D getACommePeriodeValiditeConsignePeriode3D() {
		return aCommePeriodeValiditeConsignePeriode3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommePeriodeValiditeConsignePeriode3D(TypePeriode3D newACommePeriodeValiditeConsignePeriode3D, NotificationChain msgs) {
		TypePeriode3D oldACommePeriodeValiditeConsignePeriode3D = aCommePeriodeValiditeConsignePeriode3D;
		aCommePeriodeValiditeConsignePeriode3D = newACommePeriodeValiditeConsignePeriode3D;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONFLIT3_D__ACOMME_PERIODE_VALIDITE_CONSIGNE_PERIODE3_D, oldACommePeriodeValiditeConsignePeriode3D, newACommePeriodeValiditeConsignePeriode3D);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommePeriodeValiditeConsignePeriode3D(TypePeriode3D newACommePeriodeValiditeConsignePeriode3D) {
		if (newACommePeriodeValiditeConsignePeriode3D != aCommePeriodeValiditeConsignePeriode3D) {
			NotificationChain msgs = null;
			if (aCommePeriodeValiditeConsignePeriode3D != null)
				msgs = ((InternalEObject)aCommePeriodeValiditeConsignePeriode3D).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONFLIT3_D__ACOMME_PERIODE_VALIDITE_CONSIGNE_PERIODE3_D, null, msgs);
			if (newACommePeriodeValiditeConsignePeriode3D != null)
				msgs = ((InternalEObject)newACommePeriodeValiditeConsignePeriode3D).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONFLIT3_D__ACOMME_PERIODE_VALIDITE_CONSIGNE_PERIODE3_D, null, msgs);
			msgs = basicSetACommePeriodeValiditeConsignePeriode3D(newACommePeriodeValiditeConsignePeriode3D, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONFLIT3_D__ACOMME_PERIODE_VALIDITE_CONSIGNE_PERIODE3_D, newACommePeriodeValiditeConsignePeriode3D, newACommePeriodeValiditeConsignePeriode3D));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getACommeConsigneTirAppliquerConsigneTir() {
		return aCommeConsigneTirAppliquerConsigneTir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeConsigneTirAppliquerConsigneTir(TypeAssociation newACommeConsigneTirAppliquerConsigneTir, NotificationChain msgs) {
		TypeAssociation oldACommeConsigneTirAppliquerConsigneTir = aCommeConsigneTirAppliquerConsigneTir;
		aCommeConsigneTirAppliquerConsigneTir = newACommeConsigneTirAppliquerConsigneTir;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONFLIT3_D__ACOMME_CONSIGNE_TIR_APPLIQUER_CONSIGNE_TIR, oldACommeConsigneTirAppliquerConsigneTir, newACommeConsigneTirAppliquerConsigneTir);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeConsigneTirAppliquerConsigneTir(TypeAssociation newACommeConsigneTirAppliquerConsigneTir) {
		if (newACommeConsigneTirAppliquerConsigneTir != aCommeConsigneTirAppliquerConsigneTir) {
			NotificationChain msgs = null;
			if (aCommeConsigneTirAppliquerConsigneTir != null)
				msgs = ((InternalEObject)aCommeConsigneTirAppliquerConsigneTir).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONFLIT3_D__ACOMME_CONSIGNE_TIR_APPLIQUER_CONSIGNE_TIR, null, msgs);
			if (newACommeConsigneTirAppliquerConsigneTir != null)
				msgs = ((InternalEObject)newACommeConsigneTirAppliquerConsigneTir).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONFLIT3_D__ACOMME_CONSIGNE_TIR_APPLIQUER_CONSIGNE_TIR, null, msgs);
			msgs = basicSetACommeConsigneTirAppliquerConsigneTir(newACommeConsigneTirAppliquerConsigneTir, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONFLIT3_D__ACOMME_CONSIGNE_TIR_APPLIQUER_CONSIGNE_TIR, newACommeConsigneTirAppliquerConsigneTir, newACommeConsigneTirAppliquerConsigneTir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourVolumeEnResolutionConsigne() {
		return aPourVolumeEnResolutionConsigne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourVolumeEnResolutionConsigne(TypeAssociation newAPourVolumeEnResolutionConsigne, NotificationChain msgs) {
		TypeAssociation oldAPourVolumeEnResolutionConsigne = aPourVolumeEnResolutionConsigne;
		aPourVolumeEnResolutionConsigne = newAPourVolumeEnResolutionConsigne;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONFLIT3_D__APOUR_VOLUME_EN_RESOLUTION_CONSIGNE, oldAPourVolumeEnResolutionConsigne, newAPourVolumeEnResolutionConsigne);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourVolumeEnResolutionConsigne(TypeAssociation newAPourVolumeEnResolutionConsigne) {
		if (newAPourVolumeEnResolutionConsigne != aPourVolumeEnResolutionConsigne) {
			NotificationChain msgs = null;
			if (aPourVolumeEnResolutionConsigne != null)
				msgs = ((InternalEObject)aPourVolumeEnResolutionConsigne).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONFLIT3_D__APOUR_VOLUME_EN_RESOLUTION_CONSIGNE, null, msgs);
			if (newAPourVolumeEnResolutionConsigne != null)
				msgs = ((InternalEObject)newAPourVolumeEnResolutionConsigne).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONFLIT3_D__APOUR_VOLUME_EN_RESOLUTION_CONSIGNE, null, msgs);
			msgs = basicSetAPourVolumeEnResolutionConsigne(newAPourVolumeEnResolutionConsigne, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONFLIT3_D__APOUR_VOLUME_EN_RESOLUTION_CONSIGNE, newAPourVolumeEnResolutionConsigne, newAPourVolumeEnResolutionConsigne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_CONFLIT3_D__ALTITUDE_CONFLIT:
				return basicSetAltitudeConflit(null, msgs);
			case SchemaPackage.TYPE_CONFLIT3_D__EST_SUJET_ASSOCIATION_CONFLIT3_DMISSION_AERIENNE:
				return ((InternalEList<?>)getEstSujetAssociationConflit3DMissionAerienne()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_CONFLIT3_D__APOUR_VOLUME_EN_CONFLIT_CONSIGNE:
				return ((InternalEList<?>)getAPourVolumeEnConflitConsigne()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_CONFLIT3_D__APOUR_MODULE_EN_CONFLIT_MODULE:
				return ((InternalEList<?>)getAPourModuleEnConflitModule()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_CONFLIT3_D__APOUR_AC_MEN_CONFLIT_MESURE_COORDINATION:
				return ((InternalEList<?>)getAPourACMenConflitMesureCoordination()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_CONFLIT3_D__APOUR_ACM_EN_RESOLUTION_MESURE_COORDINATION:
				return basicSetAPourACMEnResolutionMesureCoordination(null, msgs);
			case SchemaPackage.TYPE_CONFLIT3_D__ACOMME_PERIODE_VALIDITE_CONSIGNE_PERIODE3_D:
				return basicSetACommePeriodeValiditeConsignePeriode3D(null, msgs);
			case SchemaPackage.TYPE_CONFLIT3_D__ACOMME_CONSIGNE_TIR_APPLIQUER_CONSIGNE_TIR:
				return basicSetACommeConsigneTirAppliquerConsigneTir(null, msgs);
			case SchemaPackage.TYPE_CONFLIT3_D__APOUR_VOLUME_EN_RESOLUTION_CONSIGNE:
				return basicSetAPourVolumeEnResolutionConsigne(null, msgs);
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
			case SchemaPackage.TYPE_CONFLIT3_D__ALTITUDE_CONFLIT:
				return getAltitudeConflit();
			case SchemaPackage.TYPE_CONFLIT3_D__NATURE_CONFLIT:
				return getNatureConflit();
			case SchemaPackage.TYPE_CONFLIT3_D__TYPE_CONFLIT:
				return getTypeConflit();
			case SchemaPackage.TYPE_CONFLIT3_D__HEURE_APPARITION_CONFLIT:
				return getHeureApparitionConflit();
			case SchemaPackage.TYPE_CONFLIT3_D__PROBABILITE_CONFLIT:
				return getProbabiliteConflit();
			case SchemaPackage.TYPE_CONFLIT3_D__EST_SUJET_ASSOCIATION_CONFLIT3_DMISSION_AERIENNE:
				return getEstSujetAssociationConflit3DMissionAerienne();
			case SchemaPackage.TYPE_CONFLIT3_D__APOUR_VOLUME_EN_CONFLIT_CONSIGNE:
				return getAPourVolumeEnConflitConsigne();
			case SchemaPackage.TYPE_CONFLIT3_D__APOUR_MODULE_EN_CONFLIT_MODULE:
				return getAPourModuleEnConflitModule();
			case SchemaPackage.TYPE_CONFLIT3_D__APOUR_AC_MEN_CONFLIT_MESURE_COORDINATION:
				return getAPourACMenConflitMesureCoordination();
			case SchemaPackage.TYPE_CONFLIT3_D__APOUR_ACM_EN_RESOLUTION_MESURE_COORDINATION:
				return getAPourACMEnResolutionMesureCoordination();
			case SchemaPackage.TYPE_CONFLIT3_D__ACOMME_PERIODE_VALIDITE_CONSIGNE_PERIODE3_D:
				return getACommePeriodeValiditeConsignePeriode3D();
			case SchemaPackage.TYPE_CONFLIT3_D__ACOMME_CONSIGNE_TIR_APPLIQUER_CONSIGNE_TIR:
				return getACommeConsigneTirAppliquerConsigneTir();
			case SchemaPackage.TYPE_CONFLIT3_D__APOUR_VOLUME_EN_RESOLUTION_CONSIGNE:
				return getAPourVolumeEnResolutionConsigne();
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
			case SchemaPackage.TYPE_CONFLIT3_D__ALTITUDE_CONFLIT:
				setAltitudeConflit((TypeDataTypeAltitudePression)newValue);
				return;
			case SchemaPackage.TYPE_CONFLIT3_D__NATURE_CONFLIT:
				setNatureConflit((TypeDictionaryDicoConflit3DnatureConflit)newValue);
				return;
			case SchemaPackage.TYPE_CONFLIT3_D__TYPE_CONFLIT:
				setTypeConflit((TypeDictionaryDicoConflit3DTypeConflit)newValue);
				return;
			case SchemaPackage.TYPE_CONFLIT3_D__HEURE_APPARITION_CONFLIT:
				setHeureApparitionConflit((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_CONFLIT3_D__PROBABILITE_CONFLIT:
				setProbabiliteConflit((TypeDictionaryDicoProbabiliteEvenement)newValue);
				return;
			case SchemaPackage.TYPE_CONFLIT3_D__EST_SUJET_ASSOCIATION_CONFLIT3_DMISSION_AERIENNE:
				getEstSujetAssociationConflit3DMissionAerienne().clear();
				getEstSujetAssociationConflit3DMissionAerienne().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_CONFLIT3_D__APOUR_VOLUME_EN_CONFLIT_CONSIGNE:
				getAPourVolumeEnConflitConsigne().clear();
				getAPourVolumeEnConflitConsigne().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_CONFLIT3_D__APOUR_MODULE_EN_CONFLIT_MODULE:
				getAPourModuleEnConflitModule().clear();
				getAPourModuleEnConflitModule().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_CONFLIT3_D__APOUR_AC_MEN_CONFLIT_MESURE_COORDINATION:
				getAPourACMenConflitMesureCoordination().clear();
				getAPourACMenConflitMesureCoordination().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_CONFLIT3_D__APOUR_ACM_EN_RESOLUTION_MESURE_COORDINATION:
				setAPourACMEnResolutionMesureCoordination((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_CONFLIT3_D__ACOMME_PERIODE_VALIDITE_CONSIGNE_PERIODE3_D:
				setACommePeriodeValiditeConsignePeriode3D((TypePeriode3D)newValue);
				return;
			case SchemaPackage.TYPE_CONFLIT3_D__ACOMME_CONSIGNE_TIR_APPLIQUER_CONSIGNE_TIR:
				setACommeConsigneTirAppliquerConsigneTir((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_CONFLIT3_D__APOUR_VOLUME_EN_RESOLUTION_CONSIGNE:
				setAPourVolumeEnResolutionConsigne((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_CONFLIT3_D__ALTITUDE_CONFLIT:
				setAltitudeConflit((TypeDataTypeAltitudePression)null);
				return;
			case SchemaPackage.TYPE_CONFLIT3_D__NATURE_CONFLIT:
				unsetNatureConflit();
				return;
			case SchemaPackage.TYPE_CONFLIT3_D__TYPE_CONFLIT:
				unsetTypeConflit();
				return;
			case SchemaPackage.TYPE_CONFLIT3_D__HEURE_APPARITION_CONFLIT:
				setHeureApparitionConflit(HEURE_APPARITION_CONFLIT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CONFLIT3_D__PROBABILITE_CONFLIT:
				unsetProbabiliteConflit();
				return;
			case SchemaPackage.TYPE_CONFLIT3_D__EST_SUJET_ASSOCIATION_CONFLIT3_DMISSION_AERIENNE:
				getEstSujetAssociationConflit3DMissionAerienne().clear();
				return;
			case SchemaPackage.TYPE_CONFLIT3_D__APOUR_VOLUME_EN_CONFLIT_CONSIGNE:
				getAPourVolumeEnConflitConsigne().clear();
				return;
			case SchemaPackage.TYPE_CONFLIT3_D__APOUR_MODULE_EN_CONFLIT_MODULE:
				getAPourModuleEnConflitModule().clear();
				return;
			case SchemaPackage.TYPE_CONFLIT3_D__APOUR_AC_MEN_CONFLIT_MESURE_COORDINATION:
				getAPourACMenConflitMesureCoordination().clear();
				return;
			case SchemaPackage.TYPE_CONFLIT3_D__APOUR_ACM_EN_RESOLUTION_MESURE_COORDINATION:
				setAPourACMEnResolutionMesureCoordination((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_CONFLIT3_D__ACOMME_PERIODE_VALIDITE_CONSIGNE_PERIODE3_D:
				setACommePeriodeValiditeConsignePeriode3D((TypePeriode3D)null);
				return;
			case SchemaPackage.TYPE_CONFLIT3_D__ACOMME_CONSIGNE_TIR_APPLIQUER_CONSIGNE_TIR:
				setACommeConsigneTirAppliquerConsigneTir((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_CONFLIT3_D__APOUR_VOLUME_EN_RESOLUTION_CONSIGNE:
				setAPourVolumeEnResolutionConsigne((TypeAssociation)null);
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
			case SchemaPackage.TYPE_CONFLIT3_D__ALTITUDE_CONFLIT:
				return altitudeConflit != null;
			case SchemaPackage.TYPE_CONFLIT3_D__NATURE_CONFLIT:
				return isSetNatureConflit();
			case SchemaPackage.TYPE_CONFLIT3_D__TYPE_CONFLIT:
				return isSetTypeConflit();
			case SchemaPackage.TYPE_CONFLIT3_D__HEURE_APPARITION_CONFLIT:
				return HEURE_APPARITION_CONFLIT_EDEFAULT == null ? heureApparitionConflit != null : !HEURE_APPARITION_CONFLIT_EDEFAULT.equals(heureApparitionConflit);
			case SchemaPackage.TYPE_CONFLIT3_D__PROBABILITE_CONFLIT:
				return isSetProbabiliteConflit();
			case SchemaPackage.TYPE_CONFLIT3_D__EST_SUJET_ASSOCIATION_CONFLIT3_DMISSION_AERIENNE:
				return estSujetAssociationConflit3DMissionAerienne != null && !estSujetAssociationConflit3DMissionAerienne.isEmpty();
			case SchemaPackage.TYPE_CONFLIT3_D__APOUR_VOLUME_EN_CONFLIT_CONSIGNE:
				return aPourVolumeEnConflitConsigne != null && !aPourVolumeEnConflitConsigne.isEmpty();
			case SchemaPackage.TYPE_CONFLIT3_D__APOUR_MODULE_EN_CONFLIT_MODULE:
				return aPourModuleEnConflitModule != null && !aPourModuleEnConflitModule.isEmpty();
			case SchemaPackage.TYPE_CONFLIT3_D__APOUR_AC_MEN_CONFLIT_MESURE_COORDINATION:
				return aPourACMenConflitMesureCoordination != null && !aPourACMenConflitMesureCoordination.isEmpty();
			case SchemaPackage.TYPE_CONFLIT3_D__APOUR_ACM_EN_RESOLUTION_MESURE_COORDINATION:
				return aPourACMEnResolutionMesureCoordination != null;
			case SchemaPackage.TYPE_CONFLIT3_D__ACOMME_PERIODE_VALIDITE_CONSIGNE_PERIODE3_D:
				return aCommePeriodeValiditeConsignePeriode3D != null;
			case SchemaPackage.TYPE_CONFLIT3_D__ACOMME_CONSIGNE_TIR_APPLIQUER_CONSIGNE_TIR:
				return aCommeConsigneTirAppliquerConsigneTir != null;
			case SchemaPackage.TYPE_CONFLIT3_D__APOUR_VOLUME_EN_RESOLUTION_CONSIGNE:
				return aPourVolumeEnResolutionConsigne != null;
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
		result.append(" (natureConflit: ");
		if (natureConflitESet) result.append(natureConflit); else result.append("<unset>");
		result.append(", typeConflit: ");
		if (typeConflitESet) result.append(typeConflit); else result.append("<unset>");
		result.append(", heureApparitionConflit: ");
		result.append(heureApparitionConflit);
		result.append(", probabiliteConflit: ");
		if (probabiliteConflitESet) result.append(probabiliteConflit); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeConflit3DImpl
