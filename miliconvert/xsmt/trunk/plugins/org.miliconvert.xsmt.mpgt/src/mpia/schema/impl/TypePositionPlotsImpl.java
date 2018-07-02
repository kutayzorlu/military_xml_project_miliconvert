/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeAngle;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoPositionPlotsTypePosition;
import mpia.schema.TypeLocalisationGeometrique2D;
import mpia.schema.TypePositionPlots;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Position Plots</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePositionPlotsImpl#getNumeroPosition <em>Numero Position</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePositionPlotsImpl#getTypePosition <em>Type Position</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePositionPlotsImpl#getDirectionPrivilegieeTirHorizontal <em>Direction Privilegiee Tir Horizontal</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePositionPlotsImpl#getDirectionPrivilegieeTirVertical <em>Direction Privilegiee Tir Vertical</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePositionPlotsImpl#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePositionPlotsImpl#getACommePositionLocalisationGeometrique2D <em>AComme Position Localisation Geometrique2 D</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePositionPlotsImpl extends EObjectImpl implements TypePositionPlots {
	/**
	 * The default value of the '{@link #getNumeroPosition() <em>Numero Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroPosition()
	 * @generated
	 * @ordered
	 */
	protected static final long NUMERO_POSITION_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNumeroPosition() <em>Numero Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroPosition()
	 * @generated
	 * @ordered
	 */
	protected long numeroPosition = NUMERO_POSITION_EDEFAULT;

	/**
	 * This is true if the Numero Position attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numeroPositionESet;

	/**
	 * The default value of the '{@link #getTypePosition() <em>Type Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypePosition()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPositionPlotsTypePosition TYPE_POSITION_EDEFAULT = TypeDictionaryDicoPositionPlotsTypePosition.STNDB;

	/**
	 * The cached value of the '{@link #getTypePosition() <em>Type Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypePosition()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPositionPlotsTypePosition typePosition = TYPE_POSITION_EDEFAULT;

	/**
	 * This is true if the Type Position attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typePositionESet;

	/**
	 * The cached value of the '{@link #getDirectionPrivilegieeTirHorizontal() <em>Direction Privilegiee Tir Horizontal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectionPrivilegieeTirHorizontal()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAngle directionPrivilegieeTirHorizontal;

	/**
	 * The cached value of the '{@link #getDirectionPrivilegieeTirVertical() <em>Direction Privilegiee Tir Vertical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectionPrivilegieeTirVertical()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAngle directionPrivilegieeTirVertical;

	/**
	 * The default value of the '{@link #getCommentaire() <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaire()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTAIRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommentaire() <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaire()
	 * @generated
	 * @ordered
	 */
	protected String commentaire = COMMENTAIRE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getACommePositionLocalisationGeometrique2D() <em>AComme Position Localisation Geometrique2 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommePositionLocalisationGeometrique2D()
	 * @generated
	 * @ordered
	 */
	protected TypeLocalisationGeometrique2D aCommePositionLocalisationGeometrique2D;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypePositionPlotsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePositionPlots();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNumeroPosition() {
		return numeroPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroPosition(long newNumeroPosition) {
		long oldNumeroPosition = numeroPosition;
		numeroPosition = newNumeroPosition;
		boolean oldNumeroPositionESet = numeroPositionESet;
		numeroPositionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POSITION_PLOTS__NUMERO_POSITION, oldNumeroPosition, numeroPosition, !oldNumeroPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumeroPosition() {
		long oldNumeroPosition = numeroPosition;
		boolean oldNumeroPositionESet = numeroPositionESet;
		numeroPosition = NUMERO_POSITION_EDEFAULT;
		numeroPositionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_POSITION_PLOTS__NUMERO_POSITION, oldNumeroPosition, NUMERO_POSITION_EDEFAULT, oldNumeroPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumeroPosition() {
		return numeroPositionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPositionPlotsTypePosition getTypePosition() {
		return typePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypePosition(TypeDictionaryDicoPositionPlotsTypePosition newTypePosition) {
		TypeDictionaryDicoPositionPlotsTypePosition oldTypePosition = typePosition;
		typePosition = newTypePosition == null ? TYPE_POSITION_EDEFAULT : newTypePosition;
		boolean oldTypePositionESet = typePositionESet;
		typePositionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POSITION_PLOTS__TYPE_POSITION, oldTypePosition, typePosition, !oldTypePositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypePosition() {
		TypeDictionaryDicoPositionPlotsTypePosition oldTypePosition = typePosition;
		boolean oldTypePositionESet = typePositionESet;
		typePosition = TYPE_POSITION_EDEFAULT;
		typePositionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_POSITION_PLOTS__TYPE_POSITION, oldTypePosition, TYPE_POSITION_EDEFAULT, oldTypePositionESet));
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
	public TypeDataTypeAngle getDirectionPrivilegieeTirHorizontal() {
		return directionPrivilegieeTirHorizontal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirectionPrivilegieeTirHorizontal(TypeDataTypeAngle newDirectionPrivilegieeTirHorizontal, NotificationChain msgs) {
		TypeDataTypeAngle oldDirectionPrivilegieeTirHorizontal = directionPrivilegieeTirHorizontal;
		directionPrivilegieeTirHorizontal = newDirectionPrivilegieeTirHorizontal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POSITION_PLOTS__DIRECTION_PRIVILEGIEE_TIR_HORIZONTAL, oldDirectionPrivilegieeTirHorizontal, newDirectionPrivilegieeTirHorizontal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectionPrivilegieeTirHorizontal(TypeDataTypeAngle newDirectionPrivilegieeTirHorizontal) {
		if (newDirectionPrivilegieeTirHorizontal != directionPrivilegieeTirHorizontal) {
			NotificationChain msgs = null;
			if (directionPrivilegieeTirHorizontal != null)
				msgs = ((InternalEObject)directionPrivilegieeTirHorizontal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POSITION_PLOTS__DIRECTION_PRIVILEGIEE_TIR_HORIZONTAL, null, msgs);
			if (newDirectionPrivilegieeTirHorizontal != null)
				msgs = ((InternalEObject)newDirectionPrivilegieeTirHorizontal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POSITION_PLOTS__DIRECTION_PRIVILEGIEE_TIR_HORIZONTAL, null, msgs);
			msgs = basicSetDirectionPrivilegieeTirHorizontal(newDirectionPrivilegieeTirHorizontal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POSITION_PLOTS__DIRECTION_PRIVILEGIEE_TIR_HORIZONTAL, newDirectionPrivilegieeTirHorizontal, newDirectionPrivilegieeTirHorizontal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAngle getDirectionPrivilegieeTirVertical() {
		return directionPrivilegieeTirVertical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirectionPrivilegieeTirVertical(TypeDataTypeAngle newDirectionPrivilegieeTirVertical, NotificationChain msgs) {
		TypeDataTypeAngle oldDirectionPrivilegieeTirVertical = directionPrivilegieeTirVertical;
		directionPrivilegieeTirVertical = newDirectionPrivilegieeTirVertical;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POSITION_PLOTS__DIRECTION_PRIVILEGIEE_TIR_VERTICAL, oldDirectionPrivilegieeTirVertical, newDirectionPrivilegieeTirVertical);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectionPrivilegieeTirVertical(TypeDataTypeAngle newDirectionPrivilegieeTirVertical) {
		if (newDirectionPrivilegieeTirVertical != directionPrivilegieeTirVertical) {
			NotificationChain msgs = null;
			if (directionPrivilegieeTirVertical != null)
				msgs = ((InternalEObject)directionPrivilegieeTirVertical).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POSITION_PLOTS__DIRECTION_PRIVILEGIEE_TIR_VERTICAL, null, msgs);
			if (newDirectionPrivilegieeTirVertical != null)
				msgs = ((InternalEObject)newDirectionPrivilegieeTirVertical).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POSITION_PLOTS__DIRECTION_PRIVILEGIEE_TIR_VERTICAL, null, msgs);
			msgs = basicSetDirectionPrivilegieeTirVertical(newDirectionPrivilegieeTirVertical, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POSITION_PLOTS__DIRECTION_PRIVILEGIEE_TIR_VERTICAL, newDirectionPrivilegieeTirVertical, newDirectionPrivilegieeTirVertical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommentaire() {
		return commentaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentaire(String newCommentaire) {
		String oldCommentaire = commentaire;
		commentaire = newCommentaire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POSITION_PLOTS__COMMENTAIRE, oldCommentaire, commentaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeLocalisationGeometrique2D getACommePositionLocalisationGeometrique2D() {
		return aCommePositionLocalisationGeometrique2D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommePositionLocalisationGeometrique2D(TypeLocalisationGeometrique2D newACommePositionLocalisationGeometrique2D, NotificationChain msgs) {
		TypeLocalisationGeometrique2D oldACommePositionLocalisationGeometrique2D = aCommePositionLocalisationGeometrique2D;
		aCommePositionLocalisationGeometrique2D = newACommePositionLocalisationGeometrique2D;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POSITION_PLOTS__ACOMME_POSITION_LOCALISATION_GEOMETRIQUE2_D, oldACommePositionLocalisationGeometrique2D, newACommePositionLocalisationGeometrique2D);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommePositionLocalisationGeometrique2D(TypeLocalisationGeometrique2D newACommePositionLocalisationGeometrique2D) {
		if (newACommePositionLocalisationGeometrique2D != aCommePositionLocalisationGeometrique2D) {
			NotificationChain msgs = null;
			if (aCommePositionLocalisationGeometrique2D != null)
				msgs = ((InternalEObject)aCommePositionLocalisationGeometrique2D).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POSITION_PLOTS__ACOMME_POSITION_LOCALISATION_GEOMETRIQUE2_D, null, msgs);
			if (newACommePositionLocalisationGeometrique2D != null)
				msgs = ((InternalEObject)newACommePositionLocalisationGeometrique2D).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POSITION_PLOTS__ACOMME_POSITION_LOCALISATION_GEOMETRIQUE2_D, null, msgs);
			msgs = basicSetACommePositionLocalisationGeometrique2D(newACommePositionLocalisationGeometrique2D, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POSITION_PLOTS__ACOMME_POSITION_LOCALISATION_GEOMETRIQUE2_D, newACommePositionLocalisationGeometrique2D, newACommePositionLocalisationGeometrique2D));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_POSITION_PLOTS__DIRECTION_PRIVILEGIEE_TIR_HORIZONTAL:
				return basicSetDirectionPrivilegieeTirHorizontal(null, msgs);
			case SchemaPackage.TYPE_POSITION_PLOTS__DIRECTION_PRIVILEGIEE_TIR_VERTICAL:
				return basicSetDirectionPrivilegieeTirVertical(null, msgs);
			case SchemaPackage.TYPE_POSITION_PLOTS__ACOMME_POSITION_LOCALISATION_GEOMETRIQUE2_D:
				return basicSetACommePositionLocalisationGeometrique2D(null, msgs);
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
			case SchemaPackage.TYPE_POSITION_PLOTS__NUMERO_POSITION:
				return new Long(getNumeroPosition());
			case SchemaPackage.TYPE_POSITION_PLOTS__TYPE_POSITION:
				return getTypePosition();
			case SchemaPackage.TYPE_POSITION_PLOTS__DIRECTION_PRIVILEGIEE_TIR_HORIZONTAL:
				return getDirectionPrivilegieeTirHorizontal();
			case SchemaPackage.TYPE_POSITION_PLOTS__DIRECTION_PRIVILEGIEE_TIR_VERTICAL:
				return getDirectionPrivilegieeTirVertical();
			case SchemaPackage.TYPE_POSITION_PLOTS__COMMENTAIRE:
				return getCommentaire();
			case SchemaPackage.TYPE_POSITION_PLOTS__ACOMME_POSITION_LOCALISATION_GEOMETRIQUE2_D:
				return getACommePositionLocalisationGeometrique2D();
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
			case SchemaPackage.TYPE_POSITION_PLOTS__NUMERO_POSITION:
				setNumeroPosition(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_POSITION_PLOTS__TYPE_POSITION:
				setTypePosition((TypeDictionaryDicoPositionPlotsTypePosition)newValue);
				return;
			case SchemaPackage.TYPE_POSITION_PLOTS__DIRECTION_PRIVILEGIEE_TIR_HORIZONTAL:
				setDirectionPrivilegieeTirHorizontal((TypeDataTypeAngle)newValue);
				return;
			case SchemaPackage.TYPE_POSITION_PLOTS__DIRECTION_PRIVILEGIEE_TIR_VERTICAL:
				setDirectionPrivilegieeTirVertical((TypeDataTypeAngle)newValue);
				return;
			case SchemaPackage.TYPE_POSITION_PLOTS__COMMENTAIRE:
				setCommentaire((String)newValue);
				return;
			case SchemaPackage.TYPE_POSITION_PLOTS__ACOMME_POSITION_LOCALISATION_GEOMETRIQUE2_D:
				setACommePositionLocalisationGeometrique2D((TypeLocalisationGeometrique2D)newValue);
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
			case SchemaPackage.TYPE_POSITION_PLOTS__NUMERO_POSITION:
				unsetNumeroPosition();
				return;
			case SchemaPackage.TYPE_POSITION_PLOTS__TYPE_POSITION:
				unsetTypePosition();
				return;
			case SchemaPackage.TYPE_POSITION_PLOTS__DIRECTION_PRIVILEGIEE_TIR_HORIZONTAL:
				setDirectionPrivilegieeTirHorizontal((TypeDataTypeAngle)null);
				return;
			case SchemaPackage.TYPE_POSITION_PLOTS__DIRECTION_PRIVILEGIEE_TIR_VERTICAL:
				setDirectionPrivilegieeTirVertical((TypeDataTypeAngle)null);
				return;
			case SchemaPackage.TYPE_POSITION_PLOTS__COMMENTAIRE:
				setCommentaire(COMMENTAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_POSITION_PLOTS__ACOMME_POSITION_LOCALISATION_GEOMETRIQUE2_D:
				setACommePositionLocalisationGeometrique2D((TypeLocalisationGeometrique2D)null);
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
			case SchemaPackage.TYPE_POSITION_PLOTS__NUMERO_POSITION:
				return isSetNumeroPosition();
			case SchemaPackage.TYPE_POSITION_PLOTS__TYPE_POSITION:
				return isSetTypePosition();
			case SchemaPackage.TYPE_POSITION_PLOTS__DIRECTION_PRIVILEGIEE_TIR_HORIZONTAL:
				return directionPrivilegieeTirHorizontal != null;
			case SchemaPackage.TYPE_POSITION_PLOTS__DIRECTION_PRIVILEGIEE_TIR_VERTICAL:
				return directionPrivilegieeTirVertical != null;
			case SchemaPackage.TYPE_POSITION_PLOTS__COMMENTAIRE:
				return COMMENTAIRE_EDEFAULT == null ? commentaire != null : !COMMENTAIRE_EDEFAULT.equals(commentaire);
			case SchemaPackage.TYPE_POSITION_PLOTS__ACOMME_POSITION_LOCALISATION_GEOMETRIQUE2_D:
				return aCommePositionLocalisationGeometrique2D != null;
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
		result.append(" (numeroPosition: ");
		if (numeroPositionESet) result.append(numeroPosition); else result.append("<unset>");
		result.append(", typePosition: ");
		if (typePositionESet) result.append(typePosition); else result.append("<unset>");
		result.append(", commentaire: ");
		result.append(commentaire);
		result.append(')');
		return result.toString();
	}

} //TypePositionPlotsImpl
