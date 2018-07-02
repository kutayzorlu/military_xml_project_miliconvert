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
import mpia.schema.TypeCentreASA;
import mpia.schema.TypeDictionaryDicoCentreASATypeCentre;
import mpia.schema.TypeDictionaryDicoTypeIntervenant3D;
import mpia.schema.TypeDomaineActiviteCentre;
import mpia.schema.TypePositionCentreASA;

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
 * An implementation of the model object '<em><b>Type Centre ASA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCentreASAImpl#getTypeCentre <em>Type Centre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCentreASAImpl#getAutreTypeCentre <em>Autre Type Centre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCentreASAImpl#getTypeI3D <em>Type I3D</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCentreASAImpl#getAutreTypeI3D <em>Autre Type I3D</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCentreASAImpl#getElementsADefendre <em>Elements ADefendre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCentreASAImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCentreASAImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCentreASAImpl#getACommeUniteRattacheeUnite <em>AComme Unite Rattachee Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCentreASAImpl#getACommeCentreRattachementUnite <em>AComme Centre Rattachement Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCentreASAImpl#getACommePositionPositionCentreASA <em>AComme Position Position Centre ASA</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCentreASAImpl#getAPourZoneParticuliereAutreElementControle <em>APour Zone Particuliere Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCentreASAImpl#getACommeDomaineActiviteDomaineActiviteCentre <em>AComme Domaine Activite Domaine Activite Centre</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCentreASAImpl extends EObjectImpl implements TypeCentreASA {
	/**
	 * The default value of the '{@link #getTypeCentre() <em>Type Centre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCentre()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCentreASATypeCentre TYPE_CENTRE_EDEFAULT = TypeDictionaryDicoCentreASATypeCentre.NC23;

	/**
	 * The cached value of the '{@link #getTypeCentre() <em>Type Centre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCentre()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCentreASATypeCentre typeCentre = TYPE_CENTRE_EDEFAULT;

	/**
	 * This is true if the Type Centre attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeCentreESet;

	/**
	 * The default value of the '{@link #getAutreTypeCentre() <em>Autre Type Centre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreTypeCentre()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTRE_TYPE_CENTRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutreTypeCentre() <em>Autre Type Centre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreTypeCentre()
	 * @generated
	 * @ordered
	 */
	protected String autreTypeCentre = AUTRE_TYPE_CENTRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeI3D() <em>Type I3D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeI3D()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeIntervenant3D TYPE_I3D_EDEFAULT = TypeDictionaryDicoTypeIntervenant3D.ADA;

	/**
	 * The cached value of the '{@link #getTypeI3D() <em>Type I3D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeI3D()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeIntervenant3D typeI3D = TYPE_I3D_EDEFAULT;

	/**
	 * This is true if the Type I3D attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeI3DESet;

	/**
	 * The default value of the '{@link #getAutreTypeI3D() <em>Autre Type I3D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreTypeI3D()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTRE_TYPE_I3D_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutreTypeI3D() <em>Autre Type I3D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreTypeI3D()
	 * @generated
	 * @ordered
	 */
	protected String autreTypeI3D = AUTRE_TYPE_I3D_EDEFAULT;

	/**
	 * The default value of the '{@link #getElementsADefendre() <em>Elements ADefendre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementsADefendre()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENTS_ADEFENDRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementsADefendre() <em>Elements ADefendre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementsADefendre()
	 * @generated
	 * @ordered
	 */
	protected String elementsADefendre = ELEMENTS_ADEFENDRE_EDEFAULT;

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
	 * The cached value of the '{@link #getACommeUniteRattacheeUnite() <em>AComme Unite Rattachee Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeUniteRattacheeUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aCommeUniteRattacheeUnite;

	/**
	 * The cached value of the '{@link #getACommeCentreRattachementUnite() <em>AComme Centre Rattachement Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeCentreRattachementUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aCommeCentreRattachementUnite;

	/**
	 * The cached value of the '{@link #getACommePositionPositionCentreASA() <em>AComme Position Position Centre ASA</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommePositionPositionCentreASA()
	 * @generated
	 * @ordered
	 */
	protected EList<TypePositionCentreASA> aCommePositionPositionCentreASA;

	/**
	 * The cached value of the '{@link #getAPourZoneParticuliereAutreElementControle() <em>APour Zone Particuliere Autre Element Controle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourZoneParticuliereAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourZoneParticuliereAutreElementControle;

	/**
	 * The cached value of the '{@link #getACommeDomaineActiviteDomaineActiviteCentre() <em>AComme Domaine Activite Domaine Activite Centre</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeDomaineActiviteDomaineActiviteCentre()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeDomaineActiviteCentre> aCommeDomaineActiviteDomaineActiviteCentre;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCentreASAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCentreASA();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCentreASATypeCentre getTypeCentre() {
		return typeCentre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeCentre(TypeDictionaryDicoCentreASATypeCentre newTypeCentre) {
		TypeDictionaryDicoCentreASATypeCentre oldTypeCentre = typeCentre;
		typeCentre = newTypeCentre == null ? TYPE_CENTRE_EDEFAULT : newTypeCentre;
		boolean oldTypeCentreESet = typeCentreESet;
		typeCentreESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CENTRE_ASA__TYPE_CENTRE, oldTypeCentre, typeCentre, !oldTypeCentreESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeCentre() {
		TypeDictionaryDicoCentreASATypeCentre oldTypeCentre = typeCentre;
		boolean oldTypeCentreESet = typeCentreESet;
		typeCentre = TYPE_CENTRE_EDEFAULT;
		typeCentreESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CENTRE_ASA__TYPE_CENTRE, oldTypeCentre, TYPE_CENTRE_EDEFAULT, oldTypeCentreESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeCentre() {
		return typeCentreESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutreTypeCentre() {
		return autreTypeCentre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutreTypeCentre(String newAutreTypeCentre) {
		String oldAutreTypeCentre = autreTypeCentre;
		autreTypeCentre = newAutreTypeCentre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CENTRE_ASA__AUTRE_TYPE_CENTRE, oldAutreTypeCentre, autreTypeCentre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeIntervenant3D getTypeI3D() {
		return typeI3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeI3D(TypeDictionaryDicoTypeIntervenant3D newTypeI3D) {
		TypeDictionaryDicoTypeIntervenant3D oldTypeI3D = typeI3D;
		typeI3D = newTypeI3D == null ? TYPE_I3D_EDEFAULT : newTypeI3D;
		boolean oldTypeI3DESet = typeI3DESet;
		typeI3DESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CENTRE_ASA__TYPE_I3D, oldTypeI3D, typeI3D, !oldTypeI3DESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeI3D() {
		TypeDictionaryDicoTypeIntervenant3D oldTypeI3D = typeI3D;
		boolean oldTypeI3DESet = typeI3DESet;
		typeI3D = TYPE_I3D_EDEFAULT;
		typeI3DESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CENTRE_ASA__TYPE_I3D, oldTypeI3D, TYPE_I3D_EDEFAULT, oldTypeI3DESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeI3D() {
		return typeI3DESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutreTypeI3D() {
		return autreTypeI3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutreTypeI3D(String newAutreTypeI3D) {
		String oldAutreTypeI3D = autreTypeI3D;
		autreTypeI3D = newAutreTypeI3D;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CENTRE_ASA__AUTRE_TYPE_I3D, oldAutreTypeI3D, autreTypeI3D));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getElementsADefendre() {
		return elementsADefendre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementsADefendre(String newElementsADefendre) {
		String oldElementsADefendre = elementsADefendre;
		elementsADefendre = newElementsADefendre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CENTRE_ASA__ELEMENTS_ADEFENDRE, oldElementsADefendre, elementsADefendre));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CENTRE_ASA__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CENTRE_ASA__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getACommeUniteRattacheeUnite() {
		return aCommeUniteRattacheeUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeUniteRattacheeUnite(TypeAssociationEXT newACommeUniteRattacheeUnite, NotificationChain msgs) {
		TypeAssociationEXT oldACommeUniteRattacheeUnite = aCommeUniteRattacheeUnite;
		aCommeUniteRattacheeUnite = newACommeUniteRattacheeUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CENTRE_ASA__ACOMME_UNITE_RATTACHEE_UNITE, oldACommeUniteRattacheeUnite, newACommeUniteRattacheeUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeUniteRattacheeUnite(TypeAssociationEXT newACommeUniteRattacheeUnite) {
		if (newACommeUniteRattacheeUnite != aCommeUniteRattacheeUnite) {
			NotificationChain msgs = null;
			if (aCommeUniteRattacheeUnite != null)
				msgs = ((InternalEObject)aCommeUniteRattacheeUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CENTRE_ASA__ACOMME_UNITE_RATTACHEE_UNITE, null, msgs);
			if (newACommeUniteRattacheeUnite != null)
				msgs = ((InternalEObject)newACommeUniteRattacheeUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CENTRE_ASA__ACOMME_UNITE_RATTACHEE_UNITE, null, msgs);
			msgs = basicSetACommeUniteRattacheeUnite(newACommeUniteRattacheeUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CENTRE_ASA__ACOMME_UNITE_RATTACHEE_UNITE, newACommeUniteRattacheeUnite, newACommeUniteRattacheeUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getACommeCentreRattachementUnite() {
		return aCommeCentreRattachementUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeCentreRattachementUnite(TypeAssociationEXT newACommeCentreRattachementUnite, NotificationChain msgs) {
		TypeAssociationEXT oldACommeCentreRattachementUnite = aCommeCentreRattachementUnite;
		aCommeCentreRattachementUnite = newACommeCentreRattachementUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CENTRE_ASA__ACOMME_CENTRE_RATTACHEMENT_UNITE, oldACommeCentreRattachementUnite, newACommeCentreRattachementUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeCentreRattachementUnite(TypeAssociationEXT newACommeCentreRattachementUnite) {
		if (newACommeCentreRattachementUnite != aCommeCentreRattachementUnite) {
			NotificationChain msgs = null;
			if (aCommeCentreRattachementUnite != null)
				msgs = ((InternalEObject)aCommeCentreRattachementUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CENTRE_ASA__ACOMME_CENTRE_RATTACHEMENT_UNITE, null, msgs);
			if (newACommeCentreRattachementUnite != null)
				msgs = ((InternalEObject)newACommeCentreRattachementUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CENTRE_ASA__ACOMME_CENTRE_RATTACHEMENT_UNITE, null, msgs);
			msgs = basicSetACommeCentreRattachementUnite(newACommeCentreRattachementUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CENTRE_ASA__ACOMME_CENTRE_RATTACHEMENT_UNITE, newACommeCentreRattachementUnite, newACommeCentreRattachementUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePositionCentreASA> getACommePositionPositionCentreASA() {
		if (aCommePositionPositionCentreASA == null) {
			aCommePositionPositionCentreASA = new EObjectContainmentEList<TypePositionCentreASA>(TypePositionCentreASA.class, this, SchemaPackage.TYPE_CENTRE_ASA__ACOMME_POSITION_POSITION_CENTRE_ASA);
		}
		return aCommePositionPositionCentreASA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourZoneParticuliereAutreElementControle() {
		if (aPourZoneParticuliereAutreElementControle == null) {
			aPourZoneParticuliereAutreElementControle = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_CENTRE_ASA__APOUR_ZONE_PARTICULIERE_AUTRE_ELEMENT_CONTROLE);
		}
		return aPourZoneParticuliereAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDomaineActiviteCentre> getACommeDomaineActiviteDomaineActiviteCentre() {
		if (aCommeDomaineActiviteDomaineActiviteCentre == null) {
			aCommeDomaineActiviteDomaineActiviteCentre = new EObjectContainmentEList<TypeDomaineActiviteCentre>(TypeDomaineActiviteCentre.class, this, SchemaPackage.TYPE_CENTRE_ASA__ACOMME_DOMAINE_ACTIVITE_DOMAINE_ACTIVITE_CENTRE);
		}
		return aCommeDomaineActiviteDomaineActiviteCentre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_CENTRE_ASA__ACOMME_UNITE_RATTACHEE_UNITE:
				return basicSetACommeUniteRattacheeUnite(null, msgs);
			case SchemaPackage.TYPE_CENTRE_ASA__ACOMME_CENTRE_RATTACHEMENT_UNITE:
				return basicSetACommeCentreRattachementUnite(null, msgs);
			case SchemaPackage.TYPE_CENTRE_ASA__ACOMME_POSITION_POSITION_CENTRE_ASA:
				return ((InternalEList<?>)getACommePositionPositionCentreASA()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_CENTRE_ASA__APOUR_ZONE_PARTICULIERE_AUTRE_ELEMENT_CONTROLE:
				return ((InternalEList<?>)getAPourZoneParticuliereAutreElementControle()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_CENTRE_ASA__ACOMME_DOMAINE_ACTIVITE_DOMAINE_ACTIVITE_CENTRE:
				return ((InternalEList<?>)getACommeDomaineActiviteDomaineActiviteCentre()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_CENTRE_ASA__TYPE_CENTRE:
				return getTypeCentre();
			case SchemaPackage.TYPE_CENTRE_ASA__AUTRE_TYPE_CENTRE:
				return getAutreTypeCentre();
			case SchemaPackage.TYPE_CENTRE_ASA__TYPE_I3D:
				return getTypeI3D();
			case SchemaPackage.TYPE_CENTRE_ASA__AUTRE_TYPE_I3D:
				return getAutreTypeI3D();
			case SchemaPackage.TYPE_CENTRE_ASA__ELEMENTS_ADEFENDRE:
				return getElementsADefendre();
			case SchemaPackage.TYPE_CENTRE_ASA__CTE:
				return getCTE();
			case SchemaPackage.TYPE_CENTRE_ASA__CE:
				return getCE();
			case SchemaPackage.TYPE_CENTRE_ASA__ACOMME_UNITE_RATTACHEE_UNITE:
				return getACommeUniteRattacheeUnite();
			case SchemaPackage.TYPE_CENTRE_ASA__ACOMME_CENTRE_RATTACHEMENT_UNITE:
				return getACommeCentreRattachementUnite();
			case SchemaPackage.TYPE_CENTRE_ASA__ACOMME_POSITION_POSITION_CENTRE_ASA:
				return getACommePositionPositionCentreASA();
			case SchemaPackage.TYPE_CENTRE_ASA__APOUR_ZONE_PARTICULIERE_AUTRE_ELEMENT_CONTROLE:
				return getAPourZoneParticuliereAutreElementControle();
			case SchemaPackage.TYPE_CENTRE_ASA__ACOMME_DOMAINE_ACTIVITE_DOMAINE_ACTIVITE_CENTRE:
				return getACommeDomaineActiviteDomaineActiviteCentre();
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
			case SchemaPackage.TYPE_CENTRE_ASA__TYPE_CENTRE:
				setTypeCentre((TypeDictionaryDicoCentreASATypeCentre)newValue);
				return;
			case SchemaPackage.TYPE_CENTRE_ASA__AUTRE_TYPE_CENTRE:
				setAutreTypeCentre((String)newValue);
				return;
			case SchemaPackage.TYPE_CENTRE_ASA__TYPE_I3D:
				setTypeI3D((TypeDictionaryDicoTypeIntervenant3D)newValue);
				return;
			case SchemaPackage.TYPE_CENTRE_ASA__AUTRE_TYPE_I3D:
				setAutreTypeI3D((String)newValue);
				return;
			case SchemaPackage.TYPE_CENTRE_ASA__ELEMENTS_ADEFENDRE:
				setElementsADefendre((String)newValue);
				return;
			case SchemaPackage.TYPE_CENTRE_ASA__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_CENTRE_ASA__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_CENTRE_ASA__ACOMME_UNITE_RATTACHEE_UNITE:
				setACommeUniteRattacheeUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_CENTRE_ASA__ACOMME_CENTRE_RATTACHEMENT_UNITE:
				setACommeCentreRattachementUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_CENTRE_ASA__ACOMME_POSITION_POSITION_CENTRE_ASA:
				getACommePositionPositionCentreASA().clear();
				getACommePositionPositionCentreASA().addAll((Collection<? extends TypePositionCentreASA>)newValue);
				return;
			case SchemaPackage.TYPE_CENTRE_ASA__APOUR_ZONE_PARTICULIERE_AUTRE_ELEMENT_CONTROLE:
				getAPourZoneParticuliereAutreElementControle().clear();
				getAPourZoneParticuliereAutreElementControle().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_CENTRE_ASA__ACOMME_DOMAINE_ACTIVITE_DOMAINE_ACTIVITE_CENTRE:
				getACommeDomaineActiviteDomaineActiviteCentre().clear();
				getACommeDomaineActiviteDomaineActiviteCentre().addAll((Collection<? extends TypeDomaineActiviteCentre>)newValue);
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
			case SchemaPackage.TYPE_CENTRE_ASA__TYPE_CENTRE:
				unsetTypeCentre();
				return;
			case SchemaPackage.TYPE_CENTRE_ASA__AUTRE_TYPE_CENTRE:
				setAutreTypeCentre(AUTRE_TYPE_CENTRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CENTRE_ASA__TYPE_I3D:
				unsetTypeI3D();
				return;
			case SchemaPackage.TYPE_CENTRE_ASA__AUTRE_TYPE_I3D:
				setAutreTypeI3D(AUTRE_TYPE_I3D_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CENTRE_ASA__ELEMENTS_ADEFENDRE:
				setElementsADefendre(ELEMENTS_ADEFENDRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CENTRE_ASA__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CENTRE_ASA__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CENTRE_ASA__ACOMME_UNITE_RATTACHEE_UNITE:
				setACommeUniteRattacheeUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_CENTRE_ASA__ACOMME_CENTRE_RATTACHEMENT_UNITE:
				setACommeCentreRattachementUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_CENTRE_ASA__ACOMME_POSITION_POSITION_CENTRE_ASA:
				getACommePositionPositionCentreASA().clear();
				return;
			case SchemaPackage.TYPE_CENTRE_ASA__APOUR_ZONE_PARTICULIERE_AUTRE_ELEMENT_CONTROLE:
				getAPourZoneParticuliereAutreElementControle().clear();
				return;
			case SchemaPackage.TYPE_CENTRE_ASA__ACOMME_DOMAINE_ACTIVITE_DOMAINE_ACTIVITE_CENTRE:
				getACommeDomaineActiviteDomaineActiviteCentre().clear();
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
			case SchemaPackage.TYPE_CENTRE_ASA__TYPE_CENTRE:
				return isSetTypeCentre();
			case SchemaPackage.TYPE_CENTRE_ASA__AUTRE_TYPE_CENTRE:
				return AUTRE_TYPE_CENTRE_EDEFAULT == null ? autreTypeCentre != null : !AUTRE_TYPE_CENTRE_EDEFAULT.equals(autreTypeCentre);
			case SchemaPackage.TYPE_CENTRE_ASA__TYPE_I3D:
				return isSetTypeI3D();
			case SchemaPackage.TYPE_CENTRE_ASA__AUTRE_TYPE_I3D:
				return AUTRE_TYPE_I3D_EDEFAULT == null ? autreTypeI3D != null : !AUTRE_TYPE_I3D_EDEFAULT.equals(autreTypeI3D);
			case SchemaPackage.TYPE_CENTRE_ASA__ELEMENTS_ADEFENDRE:
				return ELEMENTS_ADEFENDRE_EDEFAULT == null ? elementsADefendre != null : !ELEMENTS_ADEFENDRE_EDEFAULT.equals(elementsADefendre);
			case SchemaPackage.TYPE_CENTRE_ASA__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_CENTRE_ASA__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_CENTRE_ASA__ACOMME_UNITE_RATTACHEE_UNITE:
				return aCommeUniteRattacheeUnite != null;
			case SchemaPackage.TYPE_CENTRE_ASA__ACOMME_CENTRE_RATTACHEMENT_UNITE:
				return aCommeCentreRattachementUnite != null;
			case SchemaPackage.TYPE_CENTRE_ASA__ACOMME_POSITION_POSITION_CENTRE_ASA:
				return aCommePositionPositionCentreASA != null && !aCommePositionPositionCentreASA.isEmpty();
			case SchemaPackage.TYPE_CENTRE_ASA__APOUR_ZONE_PARTICULIERE_AUTRE_ELEMENT_CONTROLE:
				return aPourZoneParticuliereAutreElementControle != null && !aPourZoneParticuliereAutreElementControle.isEmpty();
			case SchemaPackage.TYPE_CENTRE_ASA__ACOMME_DOMAINE_ACTIVITE_DOMAINE_ACTIVITE_CENTRE:
				return aCommeDomaineActiviteDomaineActiviteCentre != null && !aCommeDomaineActiviteDomaineActiviteCentre.isEmpty();
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
		result.append(" (typeCentre: ");
		if (typeCentreESet) result.append(typeCentre); else result.append("<unset>");
		result.append(", autreTypeCentre: ");
		result.append(autreTypeCentre);
		result.append(", typeI3D: ");
		if (typeI3DESet) result.append(typeI3D); else result.append("<unset>");
		result.append(", autreTypeI3D: ");
		result.append(autreTypeI3D);
		result.append(", elementsADefendre: ");
		result.append(elementsADefendre);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeCentreASAImpl
