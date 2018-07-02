/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeQuantiteMoyensTirASS;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Quantite Moyens Tir ASS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeQuantiteMoyensTirASSImpl#getNombreSectionsTir <em>Nombre Sections Tir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeQuantiteMoyensTirASSImpl#getNombrePieces <em>Nombre Pieces</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeQuantiteMoyensTirASSImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeQuantiteMoyensTirASSImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeQuantiteMoyensTirASSImpl#getAPourTypeDeLanceurTypeArme <em>APour Type De Lanceur Type Arme</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeQuantiteMoyensTirASSImpl extends EObjectImpl implements TypeQuantiteMoyensTirASS {
	/**
	 * The default value of the '{@link #getNombreSectionsTir() <em>Nombre Sections Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreSectionsTir()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_SECTIONS_TIR_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreSectionsTir() <em>Nombre Sections Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreSectionsTir()
	 * @generated
	 * @ordered
	 */
	protected long nombreSectionsTir = NOMBRE_SECTIONS_TIR_EDEFAULT;

	/**
	 * This is true if the Nombre Sections Tir attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreSectionsTirESet;

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
	 * The cached value of the '{@link #getAPourTypeDeLanceurTypeArme() <em>APour Type De Lanceur Type Arme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourTypeDeLanceurTypeArme()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourTypeDeLanceurTypeArme;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeQuantiteMoyensTirASSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeQuantiteMoyensTirASS();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreSectionsTir() {
		return nombreSectionsTir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreSectionsTir(long newNombreSectionsTir) {
		long oldNombreSectionsTir = nombreSectionsTir;
		nombreSectionsTir = newNombreSectionsTir;
		boolean oldNombreSectionsTirESet = nombreSectionsTirESet;
		nombreSectionsTirESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUANTITE_MOYENS_TIR_ASS__NOMBRE_SECTIONS_TIR, oldNombreSectionsTir, nombreSectionsTir, !oldNombreSectionsTirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreSectionsTir() {
		long oldNombreSectionsTir = nombreSectionsTir;
		boolean oldNombreSectionsTirESet = nombreSectionsTirESet;
		nombreSectionsTir = NOMBRE_SECTIONS_TIR_EDEFAULT;
		nombreSectionsTirESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_QUANTITE_MOYENS_TIR_ASS__NOMBRE_SECTIONS_TIR, oldNombreSectionsTir, NOMBRE_SECTIONS_TIR_EDEFAULT, oldNombreSectionsTirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreSectionsTir() {
		return nombreSectionsTirESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUANTITE_MOYENS_TIR_ASS__NOMBRE_PIECES, oldNombrePieces, nombrePieces, !oldNombrePiecesESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_QUANTITE_MOYENS_TIR_ASS__NOMBRE_PIECES, oldNombrePieces, NOMBRE_PIECES_EDEFAULT, oldNombrePiecesESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUANTITE_MOYENS_TIR_ASS__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUANTITE_MOYENS_TIR_ASS__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourTypeDeLanceurTypeArme() {
		return aPourTypeDeLanceurTypeArme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourTypeDeLanceurTypeArme(TypeAssociationEXT newAPourTypeDeLanceurTypeArme, NotificationChain msgs) {
		TypeAssociationEXT oldAPourTypeDeLanceurTypeArme = aPourTypeDeLanceurTypeArme;
		aPourTypeDeLanceurTypeArme = newAPourTypeDeLanceurTypeArme;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUANTITE_MOYENS_TIR_ASS__APOUR_TYPE_DE_LANCEUR_TYPE_ARME, oldAPourTypeDeLanceurTypeArme, newAPourTypeDeLanceurTypeArme);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourTypeDeLanceurTypeArme(TypeAssociationEXT newAPourTypeDeLanceurTypeArme) {
		if (newAPourTypeDeLanceurTypeArme != aPourTypeDeLanceurTypeArme) {
			NotificationChain msgs = null;
			if (aPourTypeDeLanceurTypeArme != null)
				msgs = ((InternalEObject)aPourTypeDeLanceurTypeArme).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_QUANTITE_MOYENS_TIR_ASS__APOUR_TYPE_DE_LANCEUR_TYPE_ARME, null, msgs);
			if (newAPourTypeDeLanceurTypeArme != null)
				msgs = ((InternalEObject)newAPourTypeDeLanceurTypeArme).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_QUANTITE_MOYENS_TIR_ASS__APOUR_TYPE_DE_LANCEUR_TYPE_ARME, null, msgs);
			msgs = basicSetAPourTypeDeLanceurTypeArme(newAPourTypeDeLanceurTypeArme, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUANTITE_MOYENS_TIR_ASS__APOUR_TYPE_DE_LANCEUR_TYPE_ARME, newAPourTypeDeLanceurTypeArme, newAPourTypeDeLanceurTypeArme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_QUANTITE_MOYENS_TIR_ASS__APOUR_TYPE_DE_LANCEUR_TYPE_ARME:
				return basicSetAPourTypeDeLanceurTypeArme(null, msgs);
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
			case SchemaPackage.TYPE_QUANTITE_MOYENS_TIR_ASS__NOMBRE_SECTIONS_TIR:
				return new Long(getNombreSectionsTir());
			case SchemaPackage.TYPE_QUANTITE_MOYENS_TIR_ASS__NOMBRE_PIECES:
				return new Long(getNombrePieces());
			case SchemaPackage.TYPE_QUANTITE_MOYENS_TIR_ASS__CTE:
				return getCTE();
			case SchemaPackage.TYPE_QUANTITE_MOYENS_TIR_ASS__CE:
				return getCE();
			case SchemaPackage.TYPE_QUANTITE_MOYENS_TIR_ASS__APOUR_TYPE_DE_LANCEUR_TYPE_ARME:
				return getAPourTypeDeLanceurTypeArme();
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
			case SchemaPackage.TYPE_QUANTITE_MOYENS_TIR_ASS__NOMBRE_SECTIONS_TIR:
				setNombreSectionsTir(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_QUANTITE_MOYENS_TIR_ASS__NOMBRE_PIECES:
				setNombrePieces(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_QUANTITE_MOYENS_TIR_ASS__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_QUANTITE_MOYENS_TIR_ASS__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_QUANTITE_MOYENS_TIR_ASS__APOUR_TYPE_DE_LANCEUR_TYPE_ARME:
				setAPourTypeDeLanceurTypeArme((TypeAssociationEXT)newValue);
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
			case SchemaPackage.TYPE_QUANTITE_MOYENS_TIR_ASS__NOMBRE_SECTIONS_TIR:
				unsetNombreSectionsTir();
				return;
			case SchemaPackage.TYPE_QUANTITE_MOYENS_TIR_ASS__NOMBRE_PIECES:
				unsetNombrePieces();
				return;
			case SchemaPackage.TYPE_QUANTITE_MOYENS_TIR_ASS__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_QUANTITE_MOYENS_TIR_ASS__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_QUANTITE_MOYENS_TIR_ASS__APOUR_TYPE_DE_LANCEUR_TYPE_ARME:
				setAPourTypeDeLanceurTypeArme((TypeAssociationEXT)null);
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
			case SchemaPackage.TYPE_QUANTITE_MOYENS_TIR_ASS__NOMBRE_SECTIONS_TIR:
				return isSetNombreSectionsTir();
			case SchemaPackage.TYPE_QUANTITE_MOYENS_TIR_ASS__NOMBRE_PIECES:
				return isSetNombrePieces();
			case SchemaPackage.TYPE_QUANTITE_MOYENS_TIR_ASS__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_QUANTITE_MOYENS_TIR_ASS__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_QUANTITE_MOYENS_TIR_ASS__APOUR_TYPE_DE_LANCEUR_TYPE_ARME:
				return aPourTypeDeLanceurTypeArme != null;
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
		result.append(" (nombreSectionsTir: ");
		if (nombreSectionsTirESet) result.append(nombreSectionsTir); else result.append("<unset>");
		result.append(", nombrePieces: ");
		if (nombrePiecesESet) result.append(nombrePieces); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeQuantiteMoyensTirASSImpl
