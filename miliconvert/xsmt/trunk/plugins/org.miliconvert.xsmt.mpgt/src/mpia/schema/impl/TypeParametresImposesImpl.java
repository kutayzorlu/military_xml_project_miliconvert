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
import mpia.schema.TypeDictionaryDicoModeFonctionnementFusee;
import mpia.schema.TypeParametresImposes;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Parametres Imposes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeParametresImposesImpl#getModeFonctionnementFusee <em>Mode Fonctionnement Fusee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeParametresImposesImpl#getIntervalleEntreCoups <em>Intervalle Entre Coups</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeParametresImposesImpl#getNombrePieces <em>Nombre Pieces</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeParametresImposesImpl#getNombreCoupsParPiece <em>Nombre Coups Par Piece</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeParametresImposesImpl#getNombreTotalCoups <em>Nombre Total Coups</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeParametresImposesImpl#getDureeTir <em>Duree Tir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeParametresImposesImpl#getAPourMunitionsTypeMunition <em>APour Munitions Type Munition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeParametresImposesImpl extends EObjectImpl implements TypeParametresImposes {
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
	 * The cached value of the '{@link #getIntervalleEntreCoups() <em>Intervalle Entre Coups</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalleEntreCoups()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree intervalleEntreCoups;

	/**
	 * The default value of the '{@link #getNombrePieces() <em>Nombre Pieces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombrePieces()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_PIECES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombrePieces() <em>Nombre Pieces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombrePieces()
	 * @generated
	 * @ordered
	 */
	protected long nombrePieces = NOMBRE_PIECES_EDEFAULT;

	/**
	 * This is true if the Nombre Pieces attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombrePiecesESet;

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
	 * The default value of the '{@link #getNombreTotalCoups() <em>Nombre Total Coups</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreTotalCoups()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_TOTAL_COUPS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreTotalCoups() <em>Nombre Total Coups</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreTotalCoups()
	 * @generated
	 * @ordered
	 */
	protected long nombreTotalCoups = NOMBRE_TOTAL_COUPS_EDEFAULT;

	/**
	 * This is true if the Nombre Total Coups attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreTotalCoupsESet;

	/**
	 * The cached value of the '{@link #getDureeTir() <em>Duree Tir</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDureeTir()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree dureeTir;

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
	protected TypeParametresImposesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeParametresImposes();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PARAMETRES_IMPOSES__MODE_FONCTIONNEMENT_FUSEE, oldModeFonctionnementFusee, modeFonctionnementFusee, !oldModeFonctionnementFuseeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PARAMETRES_IMPOSES__MODE_FONCTIONNEMENT_FUSEE, oldModeFonctionnementFusee, MODE_FONCTIONNEMENT_FUSEE_EDEFAULT, oldModeFonctionnementFuseeESet));
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
	public TypeDataTypeDuree getIntervalleEntreCoups() {
		return intervalleEntreCoups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntervalleEntreCoups(TypeDataTypeDuree newIntervalleEntreCoups, NotificationChain msgs) {
		TypeDataTypeDuree oldIntervalleEntreCoups = intervalleEntreCoups;
		intervalleEntreCoups = newIntervalleEntreCoups;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PARAMETRES_IMPOSES__INTERVALLE_ENTRE_COUPS, oldIntervalleEntreCoups, newIntervalleEntreCoups);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntervalleEntreCoups(TypeDataTypeDuree newIntervalleEntreCoups) {
		if (newIntervalleEntreCoups != intervalleEntreCoups) {
			NotificationChain msgs = null;
			if (intervalleEntreCoups != null)
				msgs = ((InternalEObject)intervalleEntreCoups).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PARAMETRES_IMPOSES__INTERVALLE_ENTRE_COUPS, null, msgs);
			if (newIntervalleEntreCoups != null)
				msgs = ((InternalEObject)newIntervalleEntreCoups).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PARAMETRES_IMPOSES__INTERVALLE_ENTRE_COUPS, null, msgs);
			msgs = basicSetIntervalleEntreCoups(newIntervalleEntreCoups, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PARAMETRES_IMPOSES__INTERVALLE_ENTRE_COUPS, newIntervalleEntreCoups, newIntervalleEntreCoups));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombrePieces() {
		return nombrePieces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombrePieces(long newNombrePieces) {
		long oldNombrePieces = nombrePieces;
		nombrePieces = newNombrePieces;
		boolean oldNombrePiecesESet = nombrePiecesESet;
		nombrePiecesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PARAMETRES_IMPOSES__NOMBRE_PIECES, oldNombrePieces, nombrePieces, !oldNombrePiecesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombrePieces() {
		long oldNombrePieces = nombrePieces;
		boolean oldNombrePiecesESet = nombrePiecesESet;
		nombrePieces = NOMBRE_PIECES_EDEFAULT;
		nombrePiecesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PARAMETRES_IMPOSES__NOMBRE_PIECES, oldNombrePieces, NOMBRE_PIECES_EDEFAULT, oldNombrePiecesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombrePieces() {
		return nombrePiecesESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PARAMETRES_IMPOSES__NOMBRE_COUPS_PAR_PIECE, oldNombreCoupsParPiece, nombreCoupsParPiece, !oldNombreCoupsParPieceESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PARAMETRES_IMPOSES__NOMBRE_COUPS_PAR_PIECE, oldNombreCoupsParPiece, NOMBRE_COUPS_PAR_PIECE_EDEFAULT, oldNombreCoupsParPieceESet));
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
	public long getNombreTotalCoups() {
		return nombreTotalCoups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreTotalCoups(long newNombreTotalCoups) {
		long oldNombreTotalCoups = nombreTotalCoups;
		nombreTotalCoups = newNombreTotalCoups;
		boolean oldNombreTotalCoupsESet = nombreTotalCoupsESet;
		nombreTotalCoupsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PARAMETRES_IMPOSES__NOMBRE_TOTAL_COUPS, oldNombreTotalCoups, nombreTotalCoups, !oldNombreTotalCoupsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreTotalCoups() {
		long oldNombreTotalCoups = nombreTotalCoups;
		boolean oldNombreTotalCoupsESet = nombreTotalCoupsESet;
		nombreTotalCoups = NOMBRE_TOTAL_COUPS_EDEFAULT;
		nombreTotalCoupsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PARAMETRES_IMPOSES__NOMBRE_TOTAL_COUPS, oldNombreTotalCoups, NOMBRE_TOTAL_COUPS_EDEFAULT, oldNombreTotalCoupsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreTotalCoups() {
		return nombreTotalCoupsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getDureeTir() {
		return dureeTir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDureeTir(TypeDataTypeDuree newDureeTir, NotificationChain msgs) {
		TypeDataTypeDuree oldDureeTir = dureeTir;
		dureeTir = newDureeTir;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PARAMETRES_IMPOSES__DUREE_TIR, oldDureeTir, newDureeTir);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDureeTir(TypeDataTypeDuree newDureeTir) {
		if (newDureeTir != dureeTir) {
			NotificationChain msgs = null;
			if (dureeTir != null)
				msgs = ((InternalEObject)dureeTir).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PARAMETRES_IMPOSES__DUREE_TIR, null, msgs);
			if (newDureeTir != null)
				msgs = ((InternalEObject)newDureeTir).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PARAMETRES_IMPOSES__DUREE_TIR, null, msgs);
			msgs = basicSetDureeTir(newDureeTir, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PARAMETRES_IMPOSES__DUREE_TIR, newDureeTir, newDureeTir));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PARAMETRES_IMPOSES__APOUR_MUNITIONS_TYPE_MUNITION, oldAPourMunitionsTypeMunition, newAPourMunitionsTypeMunition);
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
				msgs = ((InternalEObject)aPourMunitionsTypeMunition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PARAMETRES_IMPOSES__APOUR_MUNITIONS_TYPE_MUNITION, null, msgs);
			if (newAPourMunitionsTypeMunition != null)
				msgs = ((InternalEObject)newAPourMunitionsTypeMunition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PARAMETRES_IMPOSES__APOUR_MUNITIONS_TYPE_MUNITION, null, msgs);
			msgs = basicSetAPourMunitionsTypeMunition(newAPourMunitionsTypeMunition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PARAMETRES_IMPOSES__APOUR_MUNITIONS_TYPE_MUNITION, newAPourMunitionsTypeMunition, newAPourMunitionsTypeMunition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_PARAMETRES_IMPOSES__INTERVALLE_ENTRE_COUPS:
				return basicSetIntervalleEntreCoups(null, msgs);
			case SchemaPackage.TYPE_PARAMETRES_IMPOSES__DUREE_TIR:
				return basicSetDureeTir(null, msgs);
			case SchemaPackage.TYPE_PARAMETRES_IMPOSES__APOUR_MUNITIONS_TYPE_MUNITION:
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
			case SchemaPackage.TYPE_PARAMETRES_IMPOSES__MODE_FONCTIONNEMENT_FUSEE:
				return getModeFonctionnementFusee();
			case SchemaPackage.TYPE_PARAMETRES_IMPOSES__INTERVALLE_ENTRE_COUPS:
				return getIntervalleEntreCoups();
			case SchemaPackage.TYPE_PARAMETRES_IMPOSES__NOMBRE_PIECES:
				return new Long(getNombrePieces());
			case SchemaPackage.TYPE_PARAMETRES_IMPOSES__NOMBRE_COUPS_PAR_PIECE:
				return new Long(getNombreCoupsParPiece());
			case SchemaPackage.TYPE_PARAMETRES_IMPOSES__NOMBRE_TOTAL_COUPS:
				return new Long(getNombreTotalCoups());
			case SchemaPackage.TYPE_PARAMETRES_IMPOSES__DUREE_TIR:
				return getDureeTir();
			case SchemaPackage.TYPE_PARAMETRES_IMPOSES__APOUR_MUNITIONS_TYPE_MUNITION:
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
			case SchemaPackage.TYPE_PARAMETRES_IMPOSES__MODE_FONCTIONNEMENT_FUSEE:
				setModeFonctionnementFusee((TypeDictionaryDicoModeFonctionnementFusee)newValue);
				return;
			case SchemaPackage.TYPE_PARAMETRES_IMPOSES__INTERVALLE_ENTRE_COUPS:
				setIntervalleEntreCoups((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_PARAMETRES_IMPOSES__NOMBRE_PIECES:
				setNombrePieces(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_PARAMETRES_IMPOSES__NOMBRE_COUPS_PAR_PIECE:
				setNombreCoupsParPiece(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_PARAMETRES_IMPOSES__NOMBRE_TOTAL_COUPS:
				setNombreTotalCoups(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_PARAMETRES_IMPOSES__DUREE_TIR:
				setDureeTir((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_PARAMETRES_IMPOSES__APOUR_MUNITIONS_TYPE_MUNITION:
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
			case SchemaPackage.TYPE_PARAMETRES_IMPOSES__MODE_FONCTIONNEMENT_FUSEE:
				unsetModeFonctionnementFusee();
				return;
			case SchemaPackage.TYPE_PARAMETRES_IMPOSES__INTERVALLE_ENTRE_COUPS:
				setIntervalleEntreCoups((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_PARAMETRES_IMPOSES__NOMBRE_PIECES:
				unsetNombrePieces();
				return;
			case SchemaPackage.TYPE_PARAMETRES_IMPOSES__NOMBRE_COUPS_PAR_PIECE:
				unsetNombreCoupsParPiece();
				return;
			case SchemaPackage.TYPE_PARAMETRES_IMPOSES__NOMBRE_TOTAL_COUPS:
				unsetNombreTotalCoups();
				return;
			case SchemaPackage.TYPE_PARAMETRES_IMPOSES__DUREE_TIR:
				setDureeTir((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_PARAMETRES_IMPOSES__APOUR_MUNITIONS_TYPE_MUNITION:
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
			case SchemaPackage.TYPE_PARAMETRES_IMPOSES__MODE_FONCTIONNEMENT_FUSEE:
				return isSetModeFonctionnementFusee();
			case SchemaPackage.TYPE_PARAMETRES_IMPOSES__INTERVALLE_ENTRE_COUPS:
				return intervalleEntreCoups != null;
			case SchemaPackage.TYPE_PARAMETRES_IMPOSES__NOMBRE_PIECES:
				return isSetNombrePieces();
			case SchemaPackage.TYPE_PARAMETRES_IMPOSES__NOMBRE_COUPS_PAR_PIECE:
				return isSetNombreCoupsParPiece();
			case SchemaPackage.TYPE_PARAMETRES_IMPOSES__NOMBRE_TOTAL_COUPS:
				return isSetNombreTotalCoups();
			case SchemaPackage.TYPE_PARAMETRES_IMPOSES__DUREE_TIR:
				return dureeTir != null;
			case SchemaPackage.TYPE_PARAMETRES_IMPOSES__APOUR_MUNITIONS_TYPE_MUNITION:
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
		result.append(" (modeFonctionnementFusee: ");
		if (modeFonctionnementFuseeESet) result.append(modeFonctionnementFusee); else result.append("<unset>");
		result.append(", nombrePieces: ");
		if (nombrePiecesESet) result.append(nombrePieces); else result.append("<unset>");
		result.append(", nombreCoupsParPiece: ");
		if (nombreCoupsParPieceESet) result.append(nombreCoupsParPiece); else result.append("<unset>");
		result.append(", nombreTotalCoups: ");
		if (nombreTotalCoupsESet) result.append(nombreTotalCoups); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeParametresImposesImpl
