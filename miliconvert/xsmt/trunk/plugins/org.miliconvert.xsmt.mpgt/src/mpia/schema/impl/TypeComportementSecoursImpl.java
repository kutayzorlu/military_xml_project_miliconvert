/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeDuree;
import mpia.meta.TypeDataTypeVitesseLineaire;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeComportementSecours;
import mpia.schema.TypeDictionaryDicoComportementSecoursTypeComportement;
import mpia.schema.TypeDistanceVerticaleGeometrique;

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
 * An implementation of the model object '<em><b>Type Comportement Secours</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeComportementSecoursImpl#getTempsDeclenchement <em>Temps Declenchement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeComportementSecoursImpl#getTypeComportement <em>Type Comportement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeComportementSecoursImpl#getVitesseConsigne <em>Vitesse Consigne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeComportementSecoursImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeComportementSecoursImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeComportementSecoursImpl#getAPourPlancherDistanceVerticaleGeometrique <em>APour Plancher Distance Verticale Geometrique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeComportementSecoursImpl#getAPourPlafondDistanceVerticaleGeometrique <em>APour Plafond Distance Verticale Geometrique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeComportementSecoursImpl#getACommeConsigneSecoursPointControle3D <em>AComme Consigne Secours Point Controle3 D</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeComportementSecoursImpl extends EObjectImpl implements TypeComportementSecours {
	/**
	 * The cached value of the '{@link #getTempsDeclenchement() <em>Temps Declenchement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempsDeclenchement()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree tempsDeclenchement;

	/**
	 * The default value of the '{@link #getTypeComportement() <em>Type Comportement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeComportement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoComportementSecoursTypeComportement TYPE_COMPORTEMENT_EDEFAULT = TypeDictionaryDicoComportementSecoursTypeComportement.RETRAL;

	/**
	 * The cached value of the '{@link #getTypeComportement() <em>Type Comportement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeComportement()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoComportementSecoursTypeComportement typeComportement = TYPE_COMPORTEMENT_EDEFAULT;

	/**
	 * This is true if the Type Comportement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeComportementESet;

	/**
	 * The cached value of the '{@link #getVitesseConsigne() <em>Vitesse Consigne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesseConsigne()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeVitesseLineaire vitesseConsigne;

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
	 * The cached value of the '{@link #getAPourPlancherDistanceVerticaleGeometrique() <em>APour Plancher Distance Verticale Geometrique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourPlancherDistanceVerticaleGeometrique()
	 * @generated
	 * @ordered
	 */
	protected TypeDistanceVerticaleGeometrique aPourPlancherDistanceVerticaleGeometrique;

	/**
	 * The cached value of the '{@link #getAPourPlafondDistanceVerticaleGeometrique() <em>APour Plafond Distance Verticale Geometrique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourPlafondDistanceVerticaleGeometrique()
	 * @generated
	 * @ordered
	 */
	protected TypeDistanceVerticaleGeometrique aPourPlafondDistanceVerticaleGeometrique;

	/**
	 * The cached value of the '{@link #getACommeConsigneSecoursPointControle3D() <em>AComme Consigne Secours Point Controle3 D</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeConsigneSecoursPointControle3D()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aCommeConsigneSecoursPointControle3D;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeComportementSecoursImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeComportementSecours();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getTempsDeclenchement() {
		return tempsDeclenchement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTempsDeclenchement(TypeDataTypeDuree newTempsDeclenchement, NotificationChain msgs) {
		TypeDataTypeDuree oldTempsDeclenchement = tempsDeclenchement;
		tempsDeclenchement = newTempsDeclenchement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPORTEMENT_SECOURS__TEMPS_DECLENCHEMENT, oldTempsDeclenchement, newTempsDeclenchement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTempsDeclenchement(TypeDataTypeDuree newTempsDeclenchement) {
		if (newTempsDeclenchement != tempsDeclenchement) {
			NotificationChain msgs = null;
			if (tempsDeclenchement != null)
				msgs = ((InternalEObject)tempsDeclenchement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_COMPORTEMENT_SECOURS__TEMPS_DECLENCHEMENT, null, msgs);
			if (newTempsDeclenchement != null)
				msgs = ((InternalEObject)newTempsDeclenchement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_COMPORTEMENT_SECOURS__TEMPS_DECLENCHEMENT, null, msgs);
			msgs = basicSetTempsDeclenchement(newTempsDeclenchement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPORTEMENT_SECOURS__TEMPS_DECLENCHEMENT, newTempsDeclenchement, newTempsDeclenchement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoComportementSecoursTypeComportement getTypeComportement() {
		return typeComportement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeComportement(TypeDictionaryDicoComportementSecoursTypeComportement newTypeComportement) {
		TypeDictionaryDicoComportementSecoursTypeComportement oldTypeComportement = typeComportement;
		typeComportement = newTypeComportement == null ? TYPE_COMPORTEMENT_EDEFAULT : newTypeComportement;
		boolean oldTypeComportementESet = typeComportementESet;
		typeComportementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPORTEMENT_SECOURS__TYPE_COMPORTEMENT, oldTypeComportement, typeComportement, !oldTypeComportementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeComportement() {
		TypeDictionaryDicoComportementSecoursTypeComportement oldTypeComportement = typeComportement;
		boolean oldTypeComportementESet = typeComportementESet;
		typeComportement = TYPE_COMPORTEMENT_EDEFAULT;
		typeComportementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_COMPORTEMENT_SECOURS__TYPE_COMPORTEMENT, oldTypeComportement, TYPE_COMPORTEMENT_EDEFAULT, oldTypeComportementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeComportement() {
		return typeComportementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeVitesseLineaire getVitesseConsigne() {
		return vitesseConsigne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVitesseConsigne(TypeDataTypeVitesseLineaire newVitesseConsigne, NotificationChain msgs) {
		TypeDataTypeVitesseLineaire oldVitesseConsigne = vitesseConsigne;
		vitesseConsigne = newVitesseConsigne;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPORTEMENT_SECOURS__VITESSE_CONSIGNE, oldVitesseConsigne, newVitesseConsigne);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVitesseConsigne(TypeDataTypeVitesseLineaire newVitesseConsigne) {
		if (newVitesseConsigne != vitesseConsigne) {
			NotificationChain msgs = null;
			if (vitesseConsigne != null)
				msgs = ((InternalEObject)vitesseConsigne).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_COMPORTEMENT_SECOURS__VITESSE_CONSIGNE, null, msgs);
			if (newVitesseConsigne != null)
				msgs = ((InternalEObject)newVitesseConsigne).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_COMPORTEMENT_SECOURS__VITESSE_CONSIGNE, null, msgs);
			msgs = basicSetVitesseConsigne(newVitesseConsigne, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPORTEMENT_SECOURS__VITESSE_CONSIGNE, newVitesseConsigne, newVitesseConsigne));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPORTEMENT_SECOURS__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPORTEMENT_SECOURS__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDistanceVerticaleGeometrique getAPourPlancherDistanceVerticaleGeometrique() {
		return aPourPlancherDistanceVerticaleGeometrique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourPlancherDistanceVerticaleGeometrique(TypeDistanceVerticaleGeometrique newAPourPlancherDistanceVerticaleGeometrique, NotificationChain msgs) {
		TypeDistanceVerticaleGeometrique oldAPourPlancherDistanceVerticaleGeometrique = aPourPlancherDistanceVerticaleGeometrique;
		aPourPlancherDistanceVerticaleGeometrique = newAPourPlancherDistanceVerticaleGeometrique;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPORTEMENT_SECOURS__APOUR_PLANCHER_DISTANCE_VERTICALE_GEOMETRIQUE, oldAPourPlancherDistanceVerticaleGeometrique, newAPourPlancherDistanceVerticaleGeometrique);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourPlancherDistanceVerticaleGeometrique(TypeDistanceVerticaleGeometrique newAPourPlancherDistanceVerticaleGeometrique) {
		if (newAPourPlancherDistanceVerticaleGeometrique != aPourPlancherDistanceVerticaleGeometrique) {
			NotificationChain msgs = null;
			if (aPourPlancherDistanceVerticaleGeometrique != null)
				msgs = ((InternalEObject)aPourPlancherDistanceVerticaleGeometrique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_COMPORTEMENT_SECOURS__APOUR_PLANCHER_DISTANCE_VERTICALE_GEOMETRIQUE, null, msgs);
			if (newAPourPlancherDistanceVerticaleGeometrique != null)
				msgs = ((InternalEObject)newAPourPlancherDistanceVerticaleGeometrique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_COMPORTEMENT_SECOURS__APOUR_PLANCHER_DISTANCE_VERTICALE_GEOMETRIQUE, null, msgs);
			msgs = basicSetAPourPlancherDistanceVerticaleGeometrique(newAPourPlancherDistanceVerticaleGeometrique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPORTEMENT_SECOURS__APOUR_PLANCHER_DISTANCE_VERTICALE_GEOMETRIQUE, newAPourPlancherDistanceVerticaleGeometrique, newAPourPlancherDistanceVerticaleGeometrique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDistanceVerticaleGeometrique getAPourPlafondDistanceVerticaleGeometrique() {
		return aPourPlafondDistanceVerticaleGeometrique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourPlafondDistanceVerticaleGeometrique(TypeDistanceVerticaleGeometrique newAPourPlafondDistanceVerticaleGeometrique, NotificationChain msgs) {
		TypeDistanceVerticaleGeometrique oldAPourPlafondDistanceVerticaleGeometrique = aPourPlafondDistanceVerticaleGeometrique;
		aPourPlafondDistanceVerticaleGeometrique = newAPourPlafondDistanceVerticaleGeometrique;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPORTEMENT_SECOURS__APOUR_PLAFOND_DISTANCE_VERTICALE_GEOMETRIQUE, oldAPourPlafondDistanceVerticaleGeometrique, newAPourPlafondDistanceVerticaleGeometrique);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourPlafondDistanceVerticaleGeometrique(TypeDistanceVerticaleGeometrique newAPourPlafondDistanceVerticaleGeometrique) {
		if (newAPourPlafondDistanceVerticaleGeometrique != aPourPlafondDistanceVerticaleGeometrique) {
			NotificationChain msgs = null;
			if (aPourPlafondDistanceVerticaleGeometrique != null)
				msgs = ((InternalEObject)aPourPlafondDistanceVerticaleGeometrique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_COMPORTEMENT_SECOURS__APOUR_PLAFOND_DISTANCE_VERTICALE_GEOMETRIQUE, null, msgs);
			if (newAPourPlafondDistanceVerticaleGeometrique != null)
				msgs = ((InternalEObject)newAPourPlafondDistanceVerticaleGeometrique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_COMPORTEMENT_SECOURS__APOUR_PLAFOND_DISTANCE_VERTICALE_GEOMETRIQUE, null, msgs);
			msgs = basicSetAPourPlafondDistanceVerticaleGeometrique(newAPourPlafondDistanceVerticaleGeometrique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPORTEMENT_SECOURS__APOUR_PLAFOND_DISTANCE_VERTICALE_GEOMETRIQUE, newAPourPlafondDistanceVerticaleGeometrique, newAPourPlafondDistanceVerticaleGeometrique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getACommeConsigneSecoursPointControle3D() {
		if (aCommeConsigneSecoursPointControle3D == null) {
			aCommeConsigneSecoursPointControle3D = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_COMPORTEMENT_SECOURS__ACOMME_CONSIGNE_SECOURS_POINT_CONTROLE3_D);
		}
		return aCommeConsigneSecoursPointControle3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_COMPORTEMENT_SECOURS__TEMPS_DECLENCHEMENT:
				return basicSetTempsDeclenchement(null, msgs);
			case SchemaPackage.TYPE_COMPORTEMENT_SECOURS__VITESSE_CONSIGNE:
				return basicSetVitesseConsigne(null, msgs);
			case SchemaPackage.TYPE_COMPORTEMENT_SECOURS__APOUR_PLANCHER_DISTANCE_VERTICALE_GEOMETRIQUE:
				return basicSetAPourPlancherDistanceVerticaleGeometrique(null, msgs);
			case SchemaPackage.TYPE_COMPORTEMENT_SECOURS__APOUR_PLAFOND_DISTANCE_VERTICALE_GEOMETRIQUE:
				return basicSetAPourPlafondDistanceVerticaleGeometrique(null, msgs);
			case SchemaPackage.TYPE_COMPORTEMENT_SECOURS__ACOMME_CONSIGNE_SECOURS_POINT_CONTROLE3_D:
				return ((InternalEList<?>)getACommeConsigneSecoursPointControle3D()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_COMPORTEMENT_SECOURS__TEMPS_DECLENCHEMENT:
				return getTempsDeclenchement();
			case SchemaPackage.TYPE_COMPORTEMENT_SECOURS__TYPE_COMPORTEMENT:
				return getTypeComportement();
			case SchemaPackage.TYPE_COMPORTEMENT_SECOURS__VITESSE_CONSIGNE:
				return getVitesseConsigne();
			case SchemaPackage.TYPE_COMPORTEMENT_SECOURS__CTE:
				return getCTE();
			case SchemaPackage.TYPE_COMPORTEMENT_SECOURS__CE:
				return getCE();
			case SchemaPackage.TYPE_COMPORTEMENT_SECOURS__APOUR_PLANCHER_DISTANCE_VERTICALE_GEOMETRIQUE:
				return getAPourPlancherDistanceVerticaleGeometrique();
			case SchemaPackage.TYPE_COMPORTEMENT_SECOURS__APOUR_PLAFOND_DISTANCE_VERTICALE_GEOMETRIQUE:
				return getAPourPlafondDistanceVerticaleGeometrique();
			case SchemaPackage.TYPE_COMPORTEMENT_SECOURS__ACOMME_CONSIGNE_SECOURS_POINT_CONTROLE3_D:
				return getACommeConsigneSecoursPointControle3D();
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
			case SchemaPackage.TYPE_COMPORTEMENT_SECOURS__TEMPS_DECLENCHEMENT:
				setTempsDeclenchement((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_COMPORTEMENT_SECOURS__TYPE_COMPORTEMENT:
				setTypeComportement((TypeDictionaryDicoComportementSecoursTypeComportement)newValue);
				return;
			case SchemaPackage.TYPE_COMPORTEMENT_SECOURS__VITESSE_CONSIGNE:
				setVitesseConsigne((TypeDataTypeVitesseLineaire)newValue);
				return;
			case SchemaPackage.TYPE_COMPORTEMENT_SECOURS__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_COMPORTEMENT_SECOURS__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_COMPORTEMENT_SECOURS__APOUR_PLANCHER_DISTANCE_VERTICALE_GEOMETRIQUE:
				setAPourPlancherDistanceVerticaleGeometrique((TypeDistanceVerticaleGeometrique)newValue);
				return;
			case SchemaPackage.TYPE_COMPORTEMENT_SECOURS__APOUR_PLAFOND_DISTANCE_VERTICALE_GEOMETRIQUE:
				setAPourPlafondDistanceVerticaleGeometrique((TypeDistanceVerticaleGeometrique)newValue);
				return;
			case SchemaPackage.TYPE_COMPORTEMENT_SECOURS__ACOMME_CONSIGNE_SECOURS_POINT_CONTROLE3_D:
				getACommeConsigneSecoursPointControle3D().clear();
				getACommeConsigneSecoursPointControle3D().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_COMPORTEMENT_SECOURS__TEMPS_DECLENCHEMENT:
				setTempsDeclenchement((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_COMPORTEMENT_SECOURS__TYPE_COMPORTEMENT:
				unsetTypeComportement();
				return;
			case SchemaPackage.TYPE_COMPORTEMENT_SECOURS__VITESSE_CONSIGNE:
				setVitesseConsigne((TypeDataTypeVitesseLineaire)null);
				return;
			case SchemaPackage.TYPE_COMPORTEMENT_SECOURS__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_COMPORTEMENT_SECOURS__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_COMPORTEMENT_SECOURS__APOUR_PLANCHER_DISTANCE_VERTICALE_GEOMETRIQUE:
				setAPourPlancherDistanceVerticaleGeometrique((TypeDistanceVerticaleGeometrique)null);
				return;
			case SchemaPackage.TYPE_COMPORTEMENT_SECOURS__APOUR_PLAFOND_DISTANCE_VERTICALE_GEOMETRIQUE:
				setAPourPlafondDistanceVerticaleGeometrique((TypeDistanceVerticaleGeometrique)null);
				return;
			case SchemaPackage.TYPE_COMPORTEMENT_SECOURS__ACOMME_CONSIGNE_SECOURS_POINT_CONTROLE3_D:
				getACommeConsigneSecoursPointControle3D().clear();
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
			case SchemaPackage.TYPE_COMPORTEMENT_SECOURS__TEMPS_DECLENCHEMENT:
				return tempsDeclenchement != null;
			case SchemaPackage.TYPE_COMPORTEMENT_SECOURS__TYPE_COMPORTEMENT:
				return isSetTypeComportement();
			case SchemaPackage.TYPE_COMPORTEMENT_SECOURS__VITESSE_CONSIGNE:
				return vitesseConsigne != null;
			case SchemaPackage.TYPE_COMPORTEMENT_SECOURS__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_COMPORTEMENT_SECOURS__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_COMPORTEMENT_SECOURS__APOUR_PLANCHER_DISTANCE_VERTICALE_GEOMETRIQUE:
				return aPourPlancherDistanceVerticaleGeometrique != null;
			case SchemaPackage.TYPE_COMPORTEMENT_SECOURS__APOUR_PLAFOND_DISTANCE_VERTICALE_GEOMETRIQUE:
				return aPourPlafondDistanceVerticaleGeometrique != null;
			case SchemaPackage.TYPE_COMPORTEMENT_SECOURS__ACOMME_CONSIGNE_SECOURS_POINT_CONTROLE3_D:
				return aCommeConsigneSecoursPointControle3D != null && !aCommeConsigneSecoursPointControle3D.isEmpty();
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
		result.append(" (typeComportement: ");
		if (typeComportementESet) result.append(typeComportement); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeComportementSecoursImpl
