/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoPositionCentreASATypePosition;
import mpia.schema.TypeLocalisationGeometrique2D;
import mpia.schema.TypePositionCentreASA;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Position Centre ASA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePositionCentreASAImpl#getNomBapteme <em>Nom Bapteme</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePositionCentreASAImpl#getTypePosition <em>Type Position</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePositionCentreASAImpl#getAPourZonePositionnementLocalisationGeometrique2D <em>APour Zone Positionnement Localisation Geometrique2 D</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePositionCentreASAImpl#getAPourPointPositionnementLocalisationGeometrique2D <em>APour Point Positionnement Localisation Geometrique2 D</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePositionCentreASAImpl extends EObjectImpl implements TypePositionCentreASA {
	/**
	 * The default value of the '{@link #getNomBapteme() <em>Nom Bapteme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomBapteme()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_BAPTEME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomBapteme() <em>Nom Bapteme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomBapteme()
	 * @generated
	 * @ordered
	 */
	protected String nomBapteme = NOM_BAPTEME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypePosition() <em>Type Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypePosition()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPositionCentreASATypePosition TYPE_POSITION_EDEFAULT = TypeDictionaryDicoPositionCentreASATypePosition.IMPOS;

	/**
	 * The cached value of the '{@link #getTypePosition() <em>Type Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypePosition()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPositionCentreASATypePosition typePosition = TYPE_POSITION_EDEFAULT;

	/**
	 * This is true if the Type Position attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typePositionESet;

	/**
	 * The cached value of the '{@link #getAPourZonePositionnementLocalisationGeometrique2D() <em>APour Zone Positionnement Localisation Geometrique2 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourZonePositionnementLocalisationGeometrique2D()
	 * @generated
	 * @ordered
	 */
	protected TypeLocalisationGeometrique2D aPourZonePositionnementLocalisationGeometrique2D;

	/**
	 * The cached value of the '{@link #getAPourPointPositionnementLocalisationGeometrique2D() <em>APour Point Positionnement Localisation Geometrique2 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourPointPositionnementLocalisationGeometrique2D()
	 * @generated
	 * @ordered
	 */
	protected TypeLocalisationGeometrique2D aPourPointPositionnementLocalisationGeometrique2D;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypePositionCentreASAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePositionCentreASA();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomBapteme() {
		return nomBapteme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomBapteme(String newNomBapteme) {
		String oldNomBapteme = nomBapteme;
		nomBapteme = newNomBapteme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POSITION_CENTRE_ASA__NOM_BAPTEME, oldNomBapteme, nomBapteme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPositionCentreASATypePosition getTypePosition() {
		return typePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypePosition(TypeDictionaryDicoPositionCentreASATypePosition newTypePosition) {
		TypeDictionaryDicoPositionCentreASATypePosition oldTypePosition = typePosition;
		typePosition = newTypePosition == null ? TYPE_POSITION_EDEFAULT : newTypePosition;
		boolean oldTypePositionESet = typePositionESet;
		typePositionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POSITION_CENTRE_ASA__TYPE_POSITION, oldTypePosition, typePosition, !oldTypePositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypePosition() {
		TypeDictionaryDicoPositionCentreASATypePosition oldTypePosition = typePosition;
		boolean oldTypePositionESet = typePositionESet;
		typePosition = TYPE_POSITION_EDEFAULT;
		typePositionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_POSITION_CENTRE_ASA__TYPE_POSITION, oldTypePosition, TYPE_POSITION_EDEFAULT, oldTypePositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypePosition() {
		return typePositionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeLocalisationGeometrique2D getAPourZonePositionnementLocalisationGeometrique2D() {
		return aPourZonePositionnementLocalisationGeometrique2D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourZonePositionnementLocalisationGeometrique2D(TypeLocalisationGeometrique2D newAPourZonePositionnementLocalisationGeometrique2D, NotificationChain msgs) {
		TypeLocalisationGeometrique2D oldAPourZonePositionnementLocalisationGeometrique2D = aPourZonePositionnementLocalisationGeometrique2D;
		aPourZonePositionnementLocalisationGeometrique2D = newAPourZonePositionnementLocalisationGeometrique2D;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POSITION_CENTRE_ASA__APOUR_ZONE_POSITIONNEMENT_LOCALISATION_GEOMETRIQUE2_D, oldAPourZonePositionnementLocalisationGeometrique2D, newAPourZonePositionnementLocalisationGeometrique2D);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourZonePositionnementLocalisationGeometrique2D(TypeLocalisationGeometrique2D newAPourZonePositionnementLocalisationGeometrique2D) {
		if (newAPourZonePositionnementLocalisationGeometrique2D != aPourZonePositionnementLocalisationGeometrique2D) {
			NotificationChain msgs = null;
			if (aPourZonePositionnementLocalisationGeometrique2D != null)
				msgs = ((InternalEObject)aPourZonePositionnementLocalisationGeometrique2D).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POSITION_CENTRE_ASA__APOUR_ZONE_POSITIONNEMENT_LOCALISATION_GEOMETRIQUE2_D, null, msgs);
			if (newAPourZonePositionnementLocalisationGeometrique2D != null)
				msgs = ((InternalEObject)newAPourZonePositionnementLocalisationGeometrique2D).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POSITION_CENTRE_ASA__APOUR_ZONE_POSITIONNEMENT_LOCALISATION_GEOMETRIQUE2_D, null, msgs);
			msgs = basicSetAPourZonePositionnementLocalisationGeometrique2D(newAPourZonePositionnementLocalisationGeometrique2D, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POSITION_CENTRE_ASA__APOUR_ZONE_POSITIONNEMENT_LOCALISATION_GEOMETRIQUE2_D, newAPourZonePositionnementLocalisationGeometrique2D, newAPourZonePositionnementLocalisationGeometrique2D));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeLocalisationGeometrique2D getAPourPointPositionnementLocalisationGeometrique2D() {
		return aPourPointPositionnementLocalisationGeometrique2D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourPointPositionnementLocalisationGeometrique2D(TypeLocalisationGeometrique2D newAPourPointPositionnementLocalisationGeometrique2D, NotificationChain msgs) {
		TypeLocalisationGeometrique2D oldAPourPointPositionnementLocalisationGeometrique2D = aPourPointPositionnementLocalisationGeometrique2D;
		aPourPointPositionnementLocalisationGeometrique2D = newAPourPointPositionnementLocalisationGeometrique2D;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POSITION_CENTRE_ASA__APOUR_POINT_POSITIONNEMENT_LOCALISATION_GEOMETRIQUE2_D, oldAPourPointPositionnementLocalisationGeometrique2D, newAPourPointPositionnementLocalisationGeometrique2D);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourPointPositionnementLocalisationGeometrique2D(TypeLocalisationGeometrique2D newAPourPointPositionnementLocalisationGeometrique2D) {
		if (newAPourPointPositionnementLocalisationGeometrique2D != aPourPointPositionnementLocalisationGeometrique2D) {
			NotificationChain msgs = null;
			if (aPourPointPositionnementLocalisationGeometrique2D != null)
				msgs = ((InternalEObject)aPourPointPositionnementLocalisationGeometrique2D).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POSITION_CENTRE_ASA__APOUR_POINT_POSITIONNEMENT_LOCALISATION_GEOMETRIQUE2_D, null, msgs);
			if (newAPourPointPositionnementLocalisationGeometrique2D != null)
				msgs = ((InternalEObject)newAPourPointPositionnementLocalisationGeometrique2D).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POSITION_CENTRE_ASA__APOUR_POINT_POSITIONNEMENT_LOCALISATION_GEOMETRIQUE2_D, null, msgs);
			msgs = basicSetAPourPointPositionnementLocalisationGeometrique2D(newAPourPointPositionnementLocalisationGeometrique2D, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POSITION_CENTRE_ASA__APOUR_POINT_POSITIONNEMENT_LOCALISATION_GEOMETRIQUE2_D, newAPourPointPositionnementLocalisationGeometrique2D, newAPourPointPositionnementLocalisationGeometrique2D));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_POSITION_CENTRE_ASA__APOUR_ZONE_POSITIONNEMENT_LOCALISATION_GEOMETRIQUE2_D:
				return basicSetAPourZonePositionnementLocalisationGeometrique2D(null, msgs);
			case SchemaPackage.TYPE_POSITION_CENTRE_ASA__APOUR_POINT_POSITIONNEMENT_LOCALISATION_GEOMETRIQUE2_D:
				return basicSetAPourPointPositionnementLocalisationGeometrique2D(null, msgs);
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
			case SchemaPackage.TYPE_POSITION_CENTRE_ASA__NOM_BAPTEME:
				return getNomBapteme();
			case SchemaPackage.TYPE_POSITION_CENTRE_ASA__TYPE_POSITION:
				return getTypePosition();
			case SchemaPackage.TYPE_POSITION_CENTRE_ASA__APOUR_ZONE_POSITIONNEMENT_LOCALISATION_GEOMETRIQUE2_D:
				return getAPourZonePositionnementLocalisationGeometrique2D();
			case SchemaPackage.TYPE_POSITION_CENTRE_ASA__APOUR_POINT_POSITIONNEMENT_LOCALISATION_GEOMETRIQUE2_D:
				return getAPourPointPositionnementLocalisationGeometrique2D();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SchemaPackage.TYPE_POSITION_CENTRE_ASA__NOM_BAPTEME:
				setNomBapteme((String)newValue);
				return;
			case SchemaPackage.TYPE_POSITION_CENTRE_ASA__TYPE_POSITION:
				setTypePosition((TypeDictionaryDicoPositionCentreASATypePosition)newValue);
				return;
			case SchemaPackage.TYPE_POSITION_CENTRE_ASA__APOUR_ZONE_POSITIONNEMENT_LOCALISATION_GEOMETRIQUE2_D:
				setAPourZonePositionnementLocalisationGeometrique2D((TypeLocalisationGeometrique2D)newValue);
				return;
			case SchemaPackage.TYPE_POSITION_CENTRE_ASA__APOUR_POINT_POSITIONNEMENT_LOCALISATION_GEOMETRIQUE2_D:
				setAPourPointPositionnementLocalisationGeometrique2D((TypeLocalisationGeometrique2D)newValue);
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
			case SchemaPackage.TYPE_POSITION_CENTRE_ASA__NOM_BAPTEME:
				setNomBapteme(NOM_BAPTEME_EDEFAULT);
				return;
			case SchemaPackage.TYPE_POSITION_CENTRE_ASA__TYPE_POSITION:
				unsetTypePosition();
				return;
			case SchemaPackage.TYPE_POSITION_CENTRE_ASA__APOUR_ZONE_POSITIONNEMENT_LOCALISATION_GEOMETRIQUE2_D:
				setAPourZonePositionnementLocalisationGeometrique2D((TypeLocalisationGeometrique2D)null);
				return;
			case SchemaPackage.TYPE_POSITION_CENTRE_ASA__APOUR_POINT_POSITIONNEMENT_LOCALISATION_GEOMETRIQUE2_D:
				setAPourPointPositionnementLocalisationGeometrique2D((TypeLocalisationGeometrique2D)null);
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
			case SchemaPackage.TYPE_POSITION_CENTRE_ASA__NOM_BAPTEME:
				return NOM_BAPTEME_EDEFAULT == null ? nomBapteme != null : !NOM_BAPTEME_EDEFAULT.equals(nomBapteme);
			case SchemaPackage.TYPE_POSITION_CENTRE_ASA__TYPE_POSITION:
				return isSetTypePosition();
			case SchemaPackage.TYPE_POSITION_CENTRE_ASA__APOUR_ZONE_POSITIONNEMENT_LOCALISATION_GEOMETRIQUE2_D:
				return aPourZonePositionnementLocalisationGeometrique2D != null;
			case SchemaPackage.TYPE_POSITION_CENTRE_ASA__APOUR_POINT_POSITIONNEMENT_LOCALISATION_GEOMETRIQUE2_D:
				return aPourPointPositionnementLocalisationGeometrique2D != null;
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
		result.append(" (nomBapteme: ");
		result.append(nomBapteme);
		result.append(", typePosition: ");
		if (typePositionESet) result.append(typePosition); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypePositionCentreASAImpl
