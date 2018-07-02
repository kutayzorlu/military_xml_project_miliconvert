/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeActiviteSurPointControle3D;
import mpia.schema.TypeDatation;
import mpia.schema.TypeDictionaryDicoPointControle3DCategoriePointAlat;
import mpia.schema.TypePointControle3D;
import mpia.schema.TypePointMobile;

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
 * An implementation of the model object '<em><b>Type Point Controle3 D</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePointControle3DImpl#getNumeroPoint <em>Numero Point</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePointControle3DImpl#getCategoriePointAlat <em>Categorie Point Alat</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePointControle3DImpl#getDatePassageCalculee <em>Date Passage Calculee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePointControle3DImpl#getGDHpassageAuPlusTard <em>GD Hpassage Au Plus Tard</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePointControle3DImpl#getGDHpassageAuPlusTot <em>GD Hpassage Au Plus Tot</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePointControle3DImpl#getPointRepertorie <em>Point Repertorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePointControle3DImpl#isPointReference <em>Point Reference</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePointControle3DImpl#getAPourDatePrevisionnelleDatation <em>APour Date Previsionnelle Datation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePointControle3DImpl#getEstPointMobilePointMobile <em>Est Point Mobile Point Mobile</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePointControle3DImpl#getAPourActiviteActiviteSurPointControle3D <em>APour Activite Activite Sur Point Controle3 D</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePointControle3DImpl extends TypeElementControleImpl implements TypePointControle3D {
	/**
	 * The default value of the '{@link #getNumeroPoint() <em>Numero Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroPoint()
	 * @generated
	 * @ordered
	 */
	protected static final long NUMERO_POINT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNumeroPoint() <em>Numero Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroPoint()
	 * @generated
	 * @ordered
	 */
	protected long numeroPoint = NUMERO_POINT_EDEFAULT;

	/**
	 * This is true if the Numero Point attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numeroPointESet;

	/**
	 * The default value of the '{@link #getCategoriePointAlat() <em>Categorie Point Alat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoriePointAlat()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPointControle3DCategoriePointAlat CATEGORIE_POINT_ALAT_EDEFAULT = TypeDictionaryDicoPointControle3DCategoriePointAlat.LDP;

	/**
	 * The cached value of the '{@link #getCategoriePointAlat() <em>Categorie Point Alat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoriePointAlat()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPointControle3DCategoriePointAlat categoriePointAlat = CATEGORIE_POINT_ALAT_EDEFAULT;

	/**
	 * This is true if the Categorie Point Alat attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categoriePointAlatESet;

	/**
	 * The default value of the '{@link #getDatePassageCalculee() <em>Date Passage Calculee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatePassageCalculee()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_PASSAGE_CALCULEE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatePassageCalculee() <em>Date Passage Calculee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatePassageCalculee()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar datePassageCalculee = DATE_PASSAGE_CALCULEE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGDHpassageAuPlusTard() <em>GD Hpassage Au Plus Tard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHpassageAuPlusTard()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GD_HPASSAGE_AU_PLUS_TARD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGDHpassageAuPlusTard() <em>GD Hpassage Au Plus Tard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHpassageAuPlusTard()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gDHpassageAuPlusTard = GD_HPASSAGE_AU_PLUS_TARD_EDEFAULT;

	/**
	 * The default value of the '{@link #getGDHpassageAuPlusTot() <em>GD Hpassage Au Plus Tot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHpassageAuPlusTot()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GD_HPASSAGE_AU_PLUS_TOT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGDHpassageAuPlusTot() <em>GD Hpassage Au Plus Tot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHpassageAuPlusTot()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gDHpassageAuPlusTot = GD_HPASSAGE_AU_PLUS_TOT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPointRepertorie() <em>Point Repertorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointRepertorie()
	 * @generated
	 * @ordered
	 */
	protected static final String POINT_REPERTORIE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPointRepertorie() <em>Point Repertorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointRepertorie()
	 * @generated
	 * @ordered
	 */
	protected String pointRepertorie = POINT_REPERTORIE_EDEFAULT;

	/**
	 * The default value of the '{@link #isPointReference() <em>Point Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPointReference()
	 * @generated
	 * @ordered
	 */
	protected static final boolean POINT_REFERENCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPointReference() <em>Point Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPointReference()
	 * @generated
	 * @ordered
	 */
	protected boolean pointReference = POINT_REFERENCE_EDEFAULT;

	/**
	 * This is true if the Point Reference attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pointReferenceESet;

	/**
	 * The cached value of the '{@link #getAPourDatePrevisionnelleDatation() <em>APour Date Previsionnelle Datation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourDatePrevisionnelleDatation()
	 * @generated
	 * @ordered
	 */
	protected TypeDatation aPourDatePrevisionnelleDatation;

	/**
	 * The cached value of the '{@link #getEstPointMobilePointMobile() <em>Est Point Mobile Point Mobile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstPointMobilePointMobile()
	 * @generated
	 * @ordered
	 */
	protected TypePointMobile estPointMobilePointMobile;

	/**
	 * The cached value of the '{@link #getAPourActiviteActiviteSurPointControle3D() <em>APour Activite Activite Sur Point Controle3 D</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourActiviteActiviteSurPointControle3D()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeActiviteSurPointControle3D> aPourActiviteActiviteSurPointControle3D;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypePointControle3DImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePointControle3D();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNumeroPoint() {
		return numeroPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroPoint(long newNumeroPoint) {
		long oldNumeroPoint = numeroPoint;
		numeroPoint = newNumeroPoint;
		boolean oldNumeroPointESet = numeroPointESet;
		numeroPointESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_CONTROLE3_D__NUMERO_POINT, oldNumeroPoint, numeroPoint, !oldNumeroPointESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumeroPoint() {
		long oldNumeroPoint = numeroPoint;
		boolean oldNumeroPointESet = numeroPointESet;
		numeroPoint = NUMERO_POINT_EDEFAULT;
		numeroPointESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_POINT_CONTROLE3_D__NUMERO_POINT, oldNumeroPoint, NUMERO_POINT_EDEFAULT, oldNumeroPointESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumeroPoint() {
		return numeroPointESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPointControle3DCategoriePointAlat getCategoriePointAlat() {
		return categoriePointAlat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategoriePointAlat(TypeDictionaryDicoPointControle3DCategoriePointAlat newCategoriePointAlat) {
		TypeDictionaryDicoPointControle3DCategoriePointAlat oldCategoriePointAlat = categoriePointAlat;
		categoriePointAlat = newCategoriePointAlat == null ? CATEGORIE_POINT_ALAT_EDEFAULT : newCategoriePointAlat;
		boolean oldCategoriePointAlatESet = categoriePointAlatESet;
		categoriePointAlatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_CONTROLE3_D__CATEGORIE_POINT_ALAT, oldCategoriePointAlat, categoriePointAlat, !oldCategoriePointAlatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategoriePointAlat() {
		TypeDictionaryDicoPointControle3DCategoriePointAlat oldCategoriePointAlat = categoriePointAlat;
		boolean oldCategoriePointAlatESet = categoriePointAlatESet;
		categoriePointAlat = CATEGORIE_POINT_ALAT_EDEFAULT;
		categoriePointAlatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_POINT_CONTROLE3_D__CATEGORIE_POINT_ALAT, oldCategoriePointAlat, CATEGORIE_POINT_ALAT_EDEFAULT, oldCategoriePointAlatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCategoriePointAlat() {
		return categoriePointAlatESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDatePassageCalculee() {
		return datePassageCalculee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatePassageCalculee(XMLGregorianCalendar newDatePassageCalculee) {
		XMLGregorianCalendar oldDatePassageCalculee = datePassageCalculee;
		datePassageCalculee = newDatePassageCalculee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_CONTROLE3_D__DATE_PASSAGE_CALCULEE, oldDatePassageCalculee, datePassageCalculee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGDHpassageAuPlusTard() {
		return gDHpassageAuPlusTard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGDHpassageAuPlusTard(XMLGregorianCalendar newGDHpassageAuPlusTard) {
		XMLGregorianCalendar oldGDHpassageAuPlusTard = gDHpassageAuPlusTard;
		gDHpassageAuPlusTard = newGDHpassageAuPlusTard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_CONTROLE3_D__GD_HPASSAGE_AU_PLUS_TARD, oldGDHpassageAuPlusTard, gDHpassageAuPlusTard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGDHpassageAuPlusTot() {
		return gDHpassageAuPlusTot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGDHpassageAuPlusTot(XMLGregorianCalendar newGDHpassageAuPlusTot) {
		XMLGregorianCalendar oldGDHpassageAuPlusTot = gDHpassageAuPlusTot;
		gDHpassageAuPlusTot = newGDHpassageAuPlusTot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_CONTROLE3_D__GD_HPASSAGE_AU_PLUS_TOT, oldGDHpassageAuPlusTot, gDHpassageAuPlusTot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPointRepertorie() {
		return pointRepertorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointRepertorie(String newPointRepertorie) {
		String oldPointRepertorie = pointRepertorie;
		pointRepertorie = newPointRepertorie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_CONTROLE3_D__POINT_REPERTORIE, oldPointRepertorie, pointRepertorie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPointReference() {
		return pointReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointReference(boolean newPointReference) {
		boolean oldPointReference = pointReference;
		pointReference = newPointReference;
		boolean oldPointReferenceESet = pointReferenceESet;
		pointReferenceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_CONTROLE3_D__POINT_REFERENCE, oldPointReference, pointReference, !oldPointReferenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPointReference() {
		boolean oldPointReference = pointReference;
		boolean oldPointReferenceESet = pointReferenceESet;
		pointReference = POINT_REFERENCE_EDEFAULT;
		pointReferenceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_POINT_CONTROLE3_D__POINT_REFERENCE, oldPointReference, POINT_REFERENCE_EDEFAULT, oldPointReferenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPointReference() {
		return pointReferenceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDatation getAPourDatePrevisionnelleDatation() {
		return aPourDatePrevisionnelleDatation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourDatePrevisionnelleDatation(TypeDatation newAPourDatePrevisionnelleDatation, NotificationChain msgs) {
		TypeDatation oldAPourDatePrevisionnelleDatation = aPourDatePrevisionnelleDatation;
		aPourDatePrevisionnelleDatation = newAPourDatePrevisionnelleDatation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_CONTROLE3_D__APOUR_DATE_PREVISIONNELLE_DATATION, oldAPourDatePrevisionnelleDatation, newAPourDatePrevisionnelleDatation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourDatePrevisionnelleDatation(TypeDatation newAPourDatePrevisionnelleDatation) {
		if (newAPourDatePrevisionnelleDatation != aPourDatePrevisionnelleDatation) {
			NotificationChain msgs = null;
			if (aPourDatePrevisionnelleDatation != null)
				msgs = ((InternalEObject)aPourDatePrevisionnelleDatation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POINT_CONTROLE3_D__APOUR_DATE_PREVISIONNELLE_DATATION, null, msgs);
			if (newAPourDatePrevisionnelleDatation != null)
				msgs = ((InternalEObject)newAPourDatePrevisionnelleDatation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POINT_CONTROLE3_D__APOUR_DATE_PREVISIONNELLE_DATATION, null, msgs);
			msgs = basicSetAPourDatePrevisionnelleDatation(newAPourDatePrevisionnelleDatation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_CONTROLE3_D__APOUR_DATE_PREVISIONNELLE_DATATION, newAPourDatePrevisionnelleDatation, newAPourDatePrevisionnelleDatation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypePointMobile getEstPointMobilePointMobile() {
		return estPointMobilePointMobile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstPointMobilePointMobile(TypePointMobile newEstPointMobilePointMobile, NotificationChain msgs) {
		TypePointMobile oldEstPointMobilePointMobile = estPointMobilePointMobile;
		estPointMobilePointMobile = newEstPointMobilePointMobile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_CONTROLE3_D__EST_POINT_MOBILE_POINT_MOBILE, oldEstPointMobilePointMobile, newEstPointMobilePointMobile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstPointMobilePointMobile(TypePointMobile newEstPointMobilePointMobile) {
		if (newEstPointMobilePointMobile != estPointMobilePointMobile) {
			NotificationChain msgs = null;
			if (estPointMobilePointMobile != null)
				msgs = ((InternalEObject)estPointMobilePointMobile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POINT_CONTROLE3_D__EST_POINT_MOBILE_POINT_MOBILE, null, msgs);
			if (newEstPointMobilePointMobile != null)
				msgs = ((InternalEObject)newEstPointMobilePointMobile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POINT_CONTROLE3_D__EST_POINT_MOBILE_POINT_MOBILE, null, msgs);
			msgs = basicSetEstPointMobilePointMobile(newEstPointMobilePointMobile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_CONTROLE3_D__EST_POINT_MOBILE_POINT_MOBILE, newEstPointMobilePointMobile, newEstPointMobilePointMobile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeActiviteSurPointControle3D> getAPourActiviteActiviteSurPointControle3D() {
		if (aPourActiviteActiviteSurPointControle3D == null) {
			aPourActiviteActiviteSurPointControle3D = new EObjectContainmentEList<TypeActiviteSurPointControle3D>(TypeActiviteSurPointControle3D.class, this, SchemaPackage.TYPE_POINT_CONTROLE3_D__APOUR_ACTIVITE_ACTIVITE_SUR_POINT_CONTROLE3_D);
		}
		return aPourActiviteActiviteSurPointControle3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_POINT_CONTROLE3_D__APOUR_DATE_PREVISIONNELLE_DATATION:
				return basicSetAPourDatePrevisionnelleDatation(null, msgs);
			case SchemaPackage.TYPE_POINT_CONTROLE3_D__EST_POINT_MOBILE_POINT_MOBILE:
				return basicSetEstPointMobilePointMobile(null, msgs);
			case SchemaPackage.TYPE_POINT_CONTROLE3_D__APOUR_ACTIVITE_ACTIVITE_SUR_POINT_CONTROLE3_D:
				return ((InternalEList<?>)getAPourActiviteActiviteSurPointControle3D()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_POINT_CONTROLE3_D__NUMERO_POINT:
				return new Long(getNumeroPoint());
			case SchemaPackage.TYPE_POINT_CONTROLE3_D__CATEGORIE_POINT_ALAT:
				return getCategoriePointAlat();
			case SchemaPackage.TYPE_POINT_CONTROLE3_D__DATE_PASSAGE_CALCULEE:
				return getDatePassageCalculee();
			case SchemaPackage.TYPE_POINT_CONTROLE3_D__GD_HPASSAGE_AU_PLUS_TARD:
				return getGDHpassageAuPlusTard();
			case SchemaPackage.TYPE_POINT_CONTROLE3_D__GD_HPASSAGE_AU_PLUS_TOT:
				return getGDHpassageAuPlusTot();
			case SchemaPackage.TYPE_POINT_CONTROLE3_D__POINT_REPERTORIE:
				return getPointRepertorie();
			case SchemaPackage.TYPE_POINT_CONTROLE3_D__POINT_REFERENCE:
				return isPointReference() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_POINT_CONTROLE3_D__APOUR_DATE_PREVISIONNELLE_DATATION:
				return getAPourDatePrevisionnelleDatation();
			case SchemaPackage.TYPE_POINT_CONTROLE3_D__EST_POINT_MOBILE_POINT_MOBILE:
				return getEstPointMobilePointMobile();
			case SchemaPackage.TYPE_POINT_CONTROLE3_D__APOUR_ACTIVITE_ACTIVITE_SUR_POINT_CONTROLE3_D:
				return getAPourActiviteActiviteSurPointControle3D();
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
			case SchemaPackage.TYPE_POINT_CONTROLE3_D__NUMERO_POINT:
				setNumeroPoint(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_POINT_CONTROLE3_D__CATEGORIE_POINT_ALAT:
				setCategoriePointAlat((TypeDictionaryDicoPointControle3DCategoriePointAlat)newValue);
				return;
			case SchemaPackage.TYPE_POINT_CONTROLE3_D__DATE_PASSAGE_CALCULEE:
				setDatePassageCalculee((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_POINT_CONTROLE3_D__GD_HPASSAGE_AU_PLUS_TARD:
				setGDHpassageAuPlusTard((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_POINT_CONTROLE3_D__GD_HPASSAGE_AU_PLUS_TOT:
				setGDHpassageAuPlusTot((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_POINT_CONTROLE3_D__POINT_REPERTORIE:
				setPointRepertorie((String)newValue);
				return;
			case SchemaPackage.TYPE_POINT_CONTROLE3_D__POINT_REFERENCE:
				setPointReference(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_POINT_CONTROLE3_D__APOUR_DATE_PREVISIONNELLE_DATATION:
				setAPourDatePrevisionnelleDatation((TypeDatation)newValue);
				return;
			case SchemaPackage.TYPE_POINT_CONTROLE3_D__EST_POINT_MOBILE_POINT_MOBILE:
				setEstPointMobilePointMobile((TypePointMobile)newValue);
				return;
			case SchemaPackage.TYPE_POINT_CONTROLE3_D__APOUR_ACTIVITE_ACTIVITE_SUR_POINT_CONTROLE3_D:
				getAPourActiviteActiviteSurPointControle3D().clear();
				getAPourActiviteActiviteSurPointControle3D().addAll((Collection<? extends TypeActiviteSurPointControle3D>)newValue);
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
			case SchemaPackage.TYPE_POINT_CONTROLE3_D__NUMERO_POINT:
				unsetNumeroPoint();
				return;
			case SchemaPackage.TYPE_POINT_CONTROLE3_D__CATEGORIE_POINT_ALAT:
				unsetCategoriePointAlat();
				return;
			case SchemaPackage.TYPE_POINT_CONTROLE3_D__DATE_PASSAGE_CALCULEE:
				setDatePassageCalculee(DATE_PASSAGE_CALCULEE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_POINT_CONTROLE3_D__GD_HPASSAGE_AU_PLUS_TARD:
				setGDHpassageAuPlusTard(GD_HPASSAGE_AU_PLUS_TARD_EDEFAULT);
				return;
			case SchemaPackage.TYPE_POINT_CONTROLE3_D__GD_HPASSAGE_AU_PLUS_TOT:
				setGDHpassageAuPlusTot(GD_HPASSAGE_AU_PLUS_TOT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_POINT_CONTROLE3_D__POINT_REPERTORIE:
				setPointRepertorie(POINT_REPERTORIE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_POINT_CONTROLE3_D__POINT_REFERENCE:
				unsetPointReference();
				return;
			case SchemaPackage.TYPE_POINT_CONTROLE3_D__APOUR_DATE_PREVISIONNELLE_DATATION:
				setAPourDatePrevisionnelleDatation((TypeDatation)null);
				return;
			case SchemaPackage.TYPE_POINT_CONTROLE3_D__EST_POINT_MOBILE_POINT_MOBILE:
				setEstPointMobilePointMobile((TypePointMobile)null);
				return;
			case SchemaPackage.TYPE_POINT_CONTROLE3_D__APOUR_ACTIVITE_ACTIVITE_SUR_POINT_CONTROLE3_D:
				getAPourActiviteActiviteSurPointControle3D().clear();
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
			case SchemaPackage.TYPE_POINT_CONTROLE3_D__NUMERO_POINT:
				return isSetNumeroPoint();
			case SchemaPackage.TYPE_POINT_CONTROLE3_D__CATEGORIE_POINT_ALAT:
				return isSetCategoriePointAlat();
			case SchemaPackage.TYPE_POINT_CONTROLE3_D__DATE_PASSAGE_CALCULEE:
				return DATE_PASSAGE_CALCULEE_EDEFAULT == null ? datePassageCalculee != null : !DATE_PASSAGE_CALCULEE_EDEFAULT.equals(datePassageCalculee);
			case SchemaPackage.TYPE_POINT_CONTROLE3_D__GD_HPASSAGE_AU_PLUS_TARD:
				return GD_HPASSAGE_AU_PLUS_TARD_EDEFAULT == null ? gDHpassageAuPlusTard != null : !GD_HPASSAGE_AU_PLUS_TARD_EDEFAULT.equals(gDHpassageAuPlusTard);
			case SchemaPackage.TYPE_POINT_CONTROLE3_D__GD_HPASSAGE_AU_PLUS_TOT:
				return GD_HPASSAGE_AU_PLUS_TOT_EDEFAULT == null ? gDHpassageAuPlusTot != null : !GD_HPASSAGE_AU_PLUS_TOT_EDEFAULT.equals(gDHpassageAuPlusTot);
			case SchemaPackage.TYPE_POINT_CONTROLE3_D__POINT_REPERTORIE:
				return POINT_REPERTORIE_EDEFAULT == null ? pointRepertorie != null : !POINT_REPERTORIE_EDEFAULT.equals(pointRepertorie);
			case SchemaPackage.TYPE_POINT_CONTROLE3_D__POINT_REFERENCE:
				return isSetPointReference();
			case SchemaPackage.TYPE_POINT_CONTROLE3_D__APOUR_DATE_PREVISIONNELLE_DATATION:
				return aPourDatePrevisionnelleDatation != null;
			case SchemaPackage.TYPE_POINT_CONTROLE3_D__EST_POINT_MOBILE_POINT_MOBILE:
				return estPointMobilePointMobile != null;
			case SchemaPackage.TYPE_POINT_CONTROLE3_D__APOUR_ACTIVITE_ACTIVITE_SUR_POINT_CONTROLE3_D:
				return aPourActiviteActiviteSurPointControle3D != null && !aPourActiviteActiviteSurPointControle3D.isEmpty();
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
		result.append(" (numeroPoint: ");
		if (numeroPointESet) result.append(numeroPoint); else result.append("<unset>");
		result.append(", categoriePointAlat: ");
		if (categoriePointAlatESet) result.append(categoriePointAlat); else result.append("<unset>");
		result.append(", datePassageCalculee: ");
		result.append(datePassageCalculee);
		result.append(", gDHpassageAuPlusTard: ");
		result.append(gDHpassageAuPlusTard);
		result.append(", gDHpassageAuPlusTot: ");
		result.append(gDHpassageAuPlusTot);
		result.append(", pointRepertorie: ");
		result.append(pointRepertorie);
		result.append(", pointReference: ");
		if (pointReferenceESet) result.append(pointReference); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypePointControle3DImpl
