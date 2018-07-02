/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociationEXT;
import mpia.meta.TypeDataTypeDuree;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoModalitesMiseEnPlace;
import mpia.schema.TypeDictionaryDicoModeFonctionnementFusee;
import mpia.schema.TypeModalitesMiseEnPlaceTir;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Modalites Mise En Place Tir</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeModalitesMiseEnPlaceTirImpl#getModalitesMiseEnPlace <em>Modalites Mise En Place</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModalitesMiseEnPlaceTirImpl#getModeFonctionnementFusee <em>Mode Fonctionnement Fusee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModalitesMiseEnPlaceTirImpl#getNombreCoupsParPiece <em>Nombre Coups Par Piece</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModalitesMiseEnPlaceTirImpl#getIntervalleEntrePiecesOuEntreCoups <em>Intervalle Entre Pieces Ou Entre Coups</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModalitesMiseEnPlaceTirImpl#getAPourMunitionsTypeMunition <em>APour Munitions Type Munition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeModalitesMiseEnPlaceTirImpl extends EObjectImpl implements TypeModalitesMiseEnPlaceTir {
	/**
	 * The default value of the '{@link #getModalitesMiseEnPlace() <em>Modalites Mise En Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModalitesMiseEnPlace()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoModalitesMiseEnPlace MODALITES_MISE_EN_PLACE_EDEFAULT = TypeDictionaryDicoModalitesMiseEnPlace.SECPOS;

	/**
	 * The cached value of the '{@link #getModalitesMiseEnPlace() <em>Modalites Mise En Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModalitesMiseEnPlace()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoModalitesMiseEnPlace modalitesMiseEnPlace = MODALITES_MISE_EN_PLACE_EDEFAULT;

	/**
	 * This is true if the Modalites Mise En Place attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean modalitesMiseEnPlaceESet;

	/**
	 * The default value of the '{@link #getModeFonctionnementFusee() <em>Mode Fonctionnement Fusee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeFonctionnementFusee()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoModeFonctionnementFusee MODE_FONCTIONNEMENT_FUSEE_EDEFAULT = TypeDictionaryDicoModeFonctionnementFusee.ONTM;

	/**
	 * The cached value of the '{@link #getModeFonctionnementFusee() <em>Mode Fonctionnement Fusee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeFonctionnementFusee()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoModeFonctionnementFusee modeFonctionnementFusee = MODE_FONCTIONNEMENT_FUSEE_EDEFAULT;

	/**
	 * This is true if the Mode Fonctionnement Fusee attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean modeFonctionnementFuseeESet;

	/**
	 * The default value of the '{@link #getNombreCoupsParPiece() <em>Nombre Coups Par Piece</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreCoupsParPiece()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_COUPS_PAR_PIECE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreCoupsParPiece() <em>Nombre Coups Par Piece</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreCoupsParPiece()
	 * @generated
	 * @ordered
	 */
	protected long nombreCoupsParPiece = NOMBRE_COUPS_PAR_PIECE_EDEFAULT;

	/**
	 * This is true if the Nombre Coups Par Piece attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreCoupsParPieceESet;

	/**
	 * The cached value of the '{@link #getIntervalleEntrePiecesOuEntreCoups() <em>Intervalle Entre Pieces Ou Entre Coups</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalleEntrePiecesOuEntreCoups()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree intervalleEntrePiecesOuEntreCoups;

	/**
	 * The cached value of the '{@link #getAPourMunitionsTypeMunition() <em>APour Munitions Type Munition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourMunitionsTypeMunition()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourMunitionsTypeMunition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeModalitesMiseEnPlaceTirImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeModalitesMiseEnPlaceTir();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoModalitesMiseEnPlace getModalitesMiseEnPlace() {
		return modalitesMiseEnPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModalitesMiseEnPlace(TypeDictionaryDicoModalitesMiseEnPlace newModalitesMiseEnPlace) {
		TypeDictionaryDicoModalitesMiseEnPlace oldModalitesMiseEnPlace = modalitesMiseEnPlace;
		modalitesMiseEnPlace = newModalitesMiseEnPlace == null ? MODALITES_MISE_EN_PLACE_EDEFAULT : newModalitesMiseEnPlace;
		boolean oldModalitesMiseEnPlaceESet = modalitesMiseEnPlaceESet;
		modalitesMiseEnPlaceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITES_MISE_EN_PLACE_TIR__MODALITES_MISE_EN_PLACE, oldModalitesMiseEnPlace, modalitesMiseEnPlace, !oldModalitesMiseEnPlaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetModalitesMiseEnPlace() {
		TypeDictionaryDicoModalitesMiseEnPlace oldModalitesMiseEnPlace = modalitesMiseEnPlace;
		boolean oldModalitesMiseEnPlaceESet = modalitesMiseEnPlaceESet;
		modalitesMiseEnPlace = MODALITES_MISE_EN_PLACE_EDEFAULT;
		modalitesMiseEnPlaceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MODALITES_MISE_EN_PLACE_TIR__MODALITES_MISE_EN_PLACE, oldModalitesMiseEnPlace, MODALITES_MISE_EN_PLACE_EDEFAULT, oldModalitesMiseEnPlaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetModalitesMiseEnPlace() {
		return modalitesMiseEnPlaceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoModeFonctionnementFusee getModeFonctionnementFusee() {
		return modeFonctionnementFusee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModeFonctionnementFusee(TypeDictionaryDicoModeFonctionnementFusee newModeFonctionnementFusee) {
		TypeDictionaryDicoModeFonctionnementFusee oldModeFonctionnementFusee = modeFonctionnementFusee;
		modeFonctionnementFusee = newModeFonctionnementFusee == null ? MODE_FONCTIONNEMENT_FUSEE_EDEFAULT : newModeFonctionnementFusee;
		boolean oldModeFonctionnementFuseeESet = modeFonctionnementFuseeESet;
		modeFonctionnementFuseeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITES_MISE_EN_PLACE_TIR__MODE_FONCTIONNEMENT_FUSEE, oldModeFonctionnementFusee, modeFonctionnementFusee, !oldModeFonctionnementFuseeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetModeFonctionnementFusee() {
		TypeDictionaryDicoModeFonctionnementFusee oldModeFonctionnementFusee = modeFonctionnementFusee;
		boolean oldModeFonctionnementFuseeESet = modeFonctionnementFuseeESet;
		modeFonctionnementFusee = MODE_FONCTIONNEMENT_FUSEE_EDEFAULT;
		modeFonctionnementFuseeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MODALITES_MISE_EN_PLACE_TIR__MODE_FONCTIONNEMENT_FUSEE, oldModeFonctionnementFusee, MODE_FONCTIONNEMENT_FUSEE_EDEFAULT, oldModeFonctionnementFuseeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetModeFonctionnementFusee() {
		return modeFonctionnementFuseeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreCoupsParPiece() {
		return nombreCoupsParPiece;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreCoupsParPiece(long newNombreCoupsParPiece) {
		long oldNombreCoupsParPiece = nombreCoupsParPiece;
		nombreCoupsParPiece = newNombreCoupsParPiece;
		boolean oldNombreCoupsParPieceESet = nombreCoupsParPieceESet;
		nombreCoupsParPieceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITES_MISE_EN_PLACE_TIR__NOMBRE_COUPS_PAR_PIECE, oldNombreCoupsParPiece, nombreCoupsParPiece, !oldNombreCoupsParPieceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreCoupsParPiece() {
		long oldNombreCoupsParPiece = nombreCoupsParPiece;
		boolean oldNombreCoupsParPieceESet = nombreCoupsParPieceESet;
		nombreCoupsParPiece = NOMBRE_COUPS_PAR_PIECE_EDEFAULT;
		nombreCoupsParPieceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MODALITES_MISE_EN_PLACE_TIR__NOMBRE_COUPS_PAR_PIECE, oldNombreCoupsParPiece, NOMBRE_COUPS_PAR_PIECE_EDEFAULT, oldNombreCoupsParPieceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreCoupsParPiece() {
		return nombreCoupsParPieceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getIntervalleEntrePiecesOuEntreCoups() {
		return intervalleEntrePiecesOuEntreCoups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntervalleEntrePiecesOuEntreCoups(TypeDataTypeDuree newIntervalleEntrePiecesOuEntreCoups, NotificationChain msgs) {
		TypeDataTypeDuree oldIntervalleEntrePiecesOuEntreCoups = intervalleEntrePiecesOuEntreCoups;
		intervalleEntrePiecesOuEntreCoups = newIntervalleEntrePiecesOuEntreCoups;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITES_MISE_EN_PLACE_TIR__INTERVALLE_ENTRE_PIECES_OU_ENTRE_COUPS, oldIntervalleEntrePiecesOuEntreCoups, newIntervalleEntrePiecesOuEntreCoups);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntervalleEntrePiecesOuEntreCoups(TypeDataTypeDuree newIntervalleEntrePiecesOuEntreCoups) {
		if (newIntervalleEntrePiecesOuEntreCoups != intervalleEntrePiecesOuEntreCoups) {
			NotificationChain msgs = null;
			if (intervalleEntrePiecesOuEntreCoups != null)
				msgs = ((InternalEObject)intervalleEntrePiecesOuEntreCoups).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MODALITES_MISE_EN_PLACE_TIR__INTERVALLE_ENTRE_PIECES_OU_ENTRE_COUPS, null, msgs);
			if (newIntervalleEntrePiecesOuEntreCoups != null)
				msgs = ((InternalEObject)newIntervalleEntrePiecesOuEntreCoups).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MODALITES_MISE_EN_PLACE_TIR__INTERVALLE_ENTRE_PIECES_OU_ENTRE_COUPS, null, msgs);
			msgs = basicSetIntervalleEntrePiecesOuEntreCoups(newIntervalleEntrePiecesOuEntreCoups, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITES_MISE_EN_PLACE_TIR__INTERVALLE_ENTRE_PIECES_OU_ENTRE_COUPS, newIntervalleEntrePiecesOuEntreCoups, newIntervalleEntrePiecesOuEntreCoups));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourMunitionsTypeMunition() {
		return aPourMunitionsTypeMunition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourMunitionsTypeMunition(TypeAssociationEXT newAPourMunitionsTypeMunition, NotificationChain msgs) {
		TypeAssociationEXT oldAPourMunitionsTypeMunition = aPourMunitionsTypeMunition;
		aPourMunitionsTypeMunition = newAPourMunitionsTypeMunition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITES_MISE_EN_PLACE_TIR__APOUR_MUNITIONS_TYPE_MUNITION, oldAPourMunitionsTypeMunition, newAPourMunitionsTypeMunition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourMunitionsTypeMunition(TypeAssociationEXT newAPourMunitionsTypeMunition) {
		if (newAPourMunitionsTypeMunition != aPourMunitionsTypeMunition) {
			NotificationChain msgs = null;
			if (aPourMunitionsTypeMunition != null)
				msgs = ((InternalEObject)aPourMunitionsTypeMunition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MODALITES_MISE_EN_PLACE_TIR__APOUR_MUNITIONS_TYPE_MUNITION, null, msgs);
			if (newAPourMunitionsTypeMunition != null)
				msgs = ((InternalEObject)newAPourMunitionsTypeMunition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MODALITES_MISE_EN_PLACE_TIR__APOUR_MUNITIONS_TYPE_MUNITION, null, msgs);
			msgs = basicSetAPourMunitionsTypeMunition(newAPourMunitionsTypeMunition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITES_MISE_EN_PLACE_TIR__APOUR_MUNITIONS_TYPE_MUNITION, newAPourMunitionsTypeMunition, newAPourMunitionsTypeMunition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MODALITES_MISE_EN_PLACE_TIR__INTERVALLE_ENTRE_PIECES_OU_ENTRE_COUPS:
				return basicSetIntervalleEntrePiecesOuEntreCoups(null, msgs);
			case SchemaPackage.TYPE_MODALITES_MISE_EN_PLACE_TIR__APOUR_MUNITIONS_TYPE_MUNITION:
				return basicSetAPourMunitionsTypeMunition(null, msgs);
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
			case SchemaPackage.TYPE_MODALITES_MISE_EN_PLACE_TIR__MODALITES_MISE_EN_PLACE:
				return getModalitesMiseEnPlace();
			case SchemaPackage.TYPE_MODALITES_MISE_EN_PLACE_TIR__MODE_FONCTIONNEMENT_FUSEE:
				return getModeFonctionnementFusee();
			case SchemaPackage.TYPE_MODALITES_MISE_EN_PLACE_TIR__NOMBRE_COUPS_PAR_PIECE:
				return new Long(getNombreCoupsParPiece());
			case SchemaPackage.TYPE_MODALITES_MISE_EN_PLACE_TIR__INTERVALLE_ENTRE_PIECES_OU_ENTRE_COUPS:
				return getIntervalleEntrePiecesOuEntreCoups();
			case SchemaPackage.TYPE_MODALITES_MISE_EN_PLACE_TIR__APOUR_MUNITIONS_TYPE_MUNITION:
				return getAPourMunitionsTypeMunition();
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
			case SchemaPackage.TYPE_MODALITES_MISE_EN_PLACE_TIR__MODALITES_MISE_EN_PLACE:
				setModalitesMiseEnPlace((TypeDictionaryDicoModalitesMiseEnPlace)newValue);
				return;
			case SchemaPackage.TYPE_MODALITES_MISE_EN_PLACE_TIR__MODE_FONCTIONNEMENT_FUSEE:
				setModeFonctionnementFusee((TypeDictionaryDicoModeFonctionnementFusee)newValue);
				return;
			case SchemaPackage.TYPE_MODALITES_MISE_EN_PLACE_TIR__NOMBRE_COUPS_PAR_PIECE:
				setNombreCoupsParPiece(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_MODALITES_MISE_EN_PLACE_TIR__INTERVALLE_ENTRE_PIECES_OU_ENTRE_COUPS:
				setIntervalleEntrePiecesOuEntreCoups((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_MODALITES_MISE_EN_PLACE_TIR__APOUR_MUNITIONS_TYPE_MUNITION:
				setAPourMunitionsTypeMunition((TypeAssociationEXT)newValue);
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
			case SchemaPackage.TYPE_MODALITES_MISE_EN_PLACE_TIR__MODALITES_MISE_EN_PLACE:
				unsetModalitesMiseEnPlace();
				return;
			case SchemaPackage.TYPE_MODALITES_MISE_EN_PLACE_TIR__MODE_FONCTIONNEMENT_FUSEE:
				unsetModeFonctionnementFusee();
				return;
			case SchemaPackage.TYPE_MODALITES_MISE_EN_PLACE_TIR__NOMBRE_COUPS_PAR_PIECE:
				unsetNombreCoupsParPiece();
				return;
			case SchemaPackage.TYPE_MODALITES_MISE_EN_PLACE_TIR__INTERVALLE_ENTRE_PIECES_OU_ENTRE_COUPS:
				setIntervalleEntrePiecesOuEntreCoups((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_MODALITES_MISE_EN_PLACE_TIR__APOUR_MUNITIONS_TYPE_MUNITION:
				setAPourMunitionsTypeMunition((TypeAssociationEXT)null);
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
			case SchemaPackage.TYPE_MODALITES_MISE_EN_PLACE_TIR__MODALITES_MISE_EN_PLACE:
				return isSetModalitesMiseEnPlace();
			case SchemaPackage.TYPE_MODALITES_MISE_EN_PLACE_TIR__MODE_FONCTIONNEMENT_FUSEE:
				return isSetModeFonctionnementFusee();
			case SchemaPackage.TYPE_MODALITES_MISE_EN_PLACE_TIR__NOMBRE_COUPS_PAR_PIECE:
				return isSetNombreCoupsParPiece();
			case SchemaPackage.TYPE_MODALITES_MISE_EN_PLACE_TIR__INTERVALLE_ENTRE_PIECES_OU_ENTRE_COUPS:
				return intervalleEntrePiecesOuEntreCoups != null;
			case SchemaPackage.TYPE_MODALITES_MISE_EN_PLACE_TIR__APOUR_MUNITIONS_TYPE_MUNITION:
				return aPourMunitionsTypeMunition != null;
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
		result.append(" (modalitesMiseEnPlace: ");
		if (modalitesMiseEnPlaceESet) result.append(modalitesMiseEnPlace); else result.append("<unset>");
		result.append(", modeFonctionnementFusee: ");
		if (modeFonctionnementFuseeESet) result.append(modeFonctionnementFusee); else result.append("<unset>");
		result.append(", nombreCoupsParPiece: ");
		if (nombreCoupsParPieceESet) result.append(nombreCoupsParPiece); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeModalitesMiseEnPlaceTirImpl
