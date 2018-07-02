/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoEchelonTactiqueObjectif;
import mpia.schema.TypeDictionaryDicoTypeObjectifASS;
import mpia.schema.TypeDictionaryDicoTypeObjectifASSSousTypeObjectif;
import mpia.schema.TypeTypeObjectifASS;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Type Objectif ASS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeTypeObjectifASSImpl#getTypeObjectif <em>Type Objectif</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeObjectifASSImpl#getSousTypeObjectif <em>Sous Type Objectif</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeObjectifASSImpl#getNiveau <em>Niveau</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeObjectifASSImpl#getNombreElements <em>Nombre Elements</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeObjectifASSImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeObjectifASSImpl#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeTypeObjectifASSImpl extends EObjectImpl implements TypeTypeObjectifASS {
	/**
	 * The default value of the '{@link #getTypeObjectif() <em>Type Objectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeObjectif()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeObjectifASS TYPE_OBJECTIF_EDEFAULT = TypeDictionaryDicoTypeObjectifASS.ADA;

	/**
	 * The cached value of the '{@link #getTypeObjectif() <em>Type Objectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeObjectif()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeObjectifASS typeObjectif = TYPE_OBJECTIF_EDEFAULT;

	/**
	 * This is true if the Type Objectif attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeObjectifESet;

	/**
	 * The default value of the '{@link #getSousTypeObjectif() <em>Sous Type Objectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSousTypeObjectif()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeObjectifASSSousTypeObjectif SOUS_TYPE_OBJECTIF_EDEFAULT = TypeDictionaryDicoTypeObjectifASSSousTypeObjectif.HV;

	/**
	 * The cached value of the '{@link #getSousTypeObjectif() <em>Sous Type Objectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSousTypeObjectif()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeObjectifASSSousTypeObjectif sousTypeObjectif = SOUS_TYPE_OBJECTIF_EDEFAULT;

	/**
	 * This is true if the Sous Type Objectif attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sousTypeObjectifESet;

	/**
	 * The default value of the '{@link #getNiveau() <em>Niveau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveau()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEchelonTactiqueObjectif NIVEAU_EDEFAULT = TypeDictionaryDicoEchelonTactiqueObjectif.BN;

	/**
	 * The cached value of the '{@link #getNiveau() <em>Niveau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveau()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEchelonTactiqueObjectif niveau = NIVEAU_EDEFAULT;

	/**
	 * This is true if the Niveau attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean niveauESet;

	/**
	 * The default value of the '{@link #getNombreElements() <em>Nombre Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreElements()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_ELEMENTS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreElements() <em>Nombre Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreElements()
	 * @generated
	 * @ordered
	 */
	protected long nombreElements = NOMBRE_ELEMENTS_EDEFAULT;

	/**
	 * This is true if the Nombre Elements attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreElementsESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeTypeObjectifASSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeTypeObjectifASS();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeObjectifASS getTypeObjectif() {
		return typeObjectif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeObjectif(TypeDictionaryDicoTypeObjectifASS newTypeObjectif) {
		TypeDictionaryDicoTypeObjectifASS oldTypeObjectif = typeObjectif;
		typeObjectif = newTypeObjectif == null ? TYPE_OBJECTIF_EDEFAULT : newTypeObjectif;
		boolean oldTypeObjectifESet = typeObjectifESet;
		typeObjectifESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_OBJECTIF_ASS__TYPE_OBJECTIF, oldTypeObjectif, typeObjectif, !oldTypeObjectifESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeObjectif() {
		TypeDictionaryDicoTypeObjectifASS oldTypeObjectif = typeObjectif;
		boolean oldTypeObjectifESet = typeObjectifESet;
		typeObjectif = TYPE_OBJECTIF_EDEFAULT;
		typeObjectifESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_OBJECTIF_ASS__TYPE_OBJECTIF, oldTypeObjectif, TYPE_OBJECTIF_EDEFAULT, oldTypeObjectifESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeObjectif() {
		return typeObjectifESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeObjectifASSSousTypeObjectif getSousTypeObjectif() {
		return sousTypeObjectif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSousTypeObjectif(TypeDictionaryDicoTypeObjectifASSSousTypeObjectif newSousTypeObjectif) {
		TypeDictionaryDicoTypeObjectifASSSousTypeObjectif oldSousTypeObjectif = sousTypeObjectif;
		sousTypeObjectif = newSousTypeObjectif == null ? SOUS_TYPE_OBJECTIF_EDEFAULT : newSousTypeObjectif;
		boolean oldSousTypeObjectifESet = sousTypeObjectifESet;
		sousTypeObjectifESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_OBJECTIF_ASS__SOUS_TYPE_OBJECTIF, oldSousTypeObjectif, sousTypeObjectif, !oldSousTypeObjectifESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSousTypeObjectif() {
		TypeDictionaryDicoTypeObjectifASSSousTypeObjectif oldSousTypeObjectif = sousTypeObjectif;
		boolean oldSousTypeObjectifESet = sousTypeObjectifESet;
		sousTypeObjectif = SOUS_TYPE_OBJECTIF_EDEFAULT;
		sousTypeObjectifESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_OBJECTIF_ASS__SOUS_TYPE_OBJECTIF, oldSousTypeObjectif, SOUS_TYPE_OBJECTIF_EDEFAULT, oldSousTypeObjectifESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSousTypeObjectif() {
		return sousTypeObjectifESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEchelonTactiqueObjectif getNiveau() {
		return niveau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNiveau(TypeDictionaryDicoEchelonTactiqueObjectif newNiveau) {
		TypeDictionaryDicoEchelonTactiqueObjectif oldNiveau = niveau;
		niveau = newNiveau == null ? NIVEAU_EDEFAULT : newNiveau;
		boolean oldNiveauESet = niveauESet;
		niveauESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_OBJECTIF_ASS__NIVEAU, oldNiveau, niveau, !oldNiveauESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNiveau() {
		TypeDictionaryDicoEchelonTactiqueObjectif oldNiveau = niveau;
		boolean oldNiveauESet = niveauESet;
		niveau = NIVEAU_EDEFAULT;
		niveauESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_OBJECTIF_ASS__NIVEAU, oldNiveau, NIVEAU_EDEFAULT, oldNiveauESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNiveau() {
		return niveauESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreElements() {
		return nombreElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreElements(long newNombreElements) {
		long oldNombreElements = nombreElements;
		nombreElements = newNombreElements;
		boolean oldNombreElementsESet = nombreElementsESet;
		nombreElementsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_OBJECTIF_ASS__NOMBRE_ELEMENTS, oldNombreElements, nombreElements, !oldNombreElementsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreElements() {
		long oldNombreElements = nombreElements;
		boolean oldNombreElementsESet = nombreElementsESet;
		nombreElements = NOMBRE_ELEMENTS_EDEFAULT;
		nombreElementsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_OBJECTIF_ASS__NOMBRE_ELEMENTS, oldNombreElements, NOMBRE_ELEMENTS_EDEFAULT, oldNombreElementsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreElements() {
		return nombreElementsESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_OBJECTIF_ASS__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_OBJECTIF_ASS__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_TYPE_OBJECTIF_ASS__TYPE_OBJECTIF:
				return getTypeObjectif();
			case SchemaPackage.TYPE_TYPE_OBJECTIF_ASS__SOUS_TYPE_OBJECTIF:
				return getSousTypeObjectif();
			case SchemaPackage.TYPE_TYPE_OBJECTIF_ASS__NIVEAU:
				return getNiveau();
			case SchemaPackage.TYPE_TYPE_OBJECTIF_ASS__NOMBRE_ELEMENTS:
				return new Long(getNombreElements());
			case SchemaPackage.TYPE_TYPE_OBJECTIF_ASS__CTE:
				return getCTE();
			case SchemaPackage.TYPE_TYPE_OBJECTIF_ASS__CE:
				return getCE();
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
			case SchemaPackage.TYPE_TYPE_OBJECTIF_ASS__TYPE_OBJECTIF:
				setTypeObjectif((TypeDictionaryDicoTypeObjectifASS)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_OBJECTIF_ASS__SOUS_TYPE_OBJECTIF:
				setSousTypeObjectif((TypeDictionaryDicoTypeObjectifASSSousTypeObjectif)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_OBJECTIF_ASS__NIVEAU:
				setNiveau((TypeDictionaryDicoEchelonTactiqueObjectif)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_OBJECTIF_ASS__NOMBRE_ELEMENTS:
				setNombreElements(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_TYPE_OBJECTIF_ASS__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_OBJECTIF_ASS__CE:
				setCE((String)newValue);
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
			case SchemaPackage.TYPE_TYPE_OBJECTIF_ASS__TYPE_OBJECTIF:
				unsetTypeObjectif();
				return;
			case SchemaPackage.TYPE_TYPE_OBJECTIF_ASS__SOUS_TYPE_OBJECTIF:
				unsetSousTypeObjectif();
				return;
			case SchemaPackage.TYPE_TYPE_OBJECTIF_ASS__NIVEAU:
				unsetNiveau();
				return;
			case SchemaPackage.TYPE_TYPE_OBJECTIF_ASS__NOMBRE_ELEMENTS:
				unsetNombreElements();
				return;
			case SchemaPackage.TYPE_TYPE_OBJECTIF_ASS__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TYPE_OBJECTIF_ASS__CE:
				setCE(CE_EDEFAULT);
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
			case SchemaPackage.TYPE_TYPE_OBJECTIF_ASS__TYPE_OBJECTIF:
				return isSetTypeObjectif();
			case SchemaPackage.TYPE_TYPE_OBJECTIF_ASS__SOUS_TYPE_OBJECTIF:
				return isSetSousTypeObjectif();
			case SchemaPackage.TYPE_TYPE_OBJECTIF_ASS__NIVEAU:
				return isSetNiveau();
			case SchemaPackage.TYPE_TYPE_OBJECTIF_ASS__NOMBRE_ELEMENTS:
				return isSetNombreElements();
			case SchemaPackage.TYPE_TYPE_OBJECTIF_ASS__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_TYPE_OBJECTIF_ASS__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
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
		result.append(" (typeObjectif: ");
		if (typeObjectifESet) result.append(typeObjectif); else result.append("<unset>");
		result.append(", sousTypeObjectif: ");
		if (sousTypeObjectifESet) result.append(sousTypeObjectif); else result.append("<unset>");
		result.append(", niveau: ");
		if (niveauESet) result.append(niveau); else result.append("<unset>");
		result.append(", nombreElements: ");
		if (nombreElementsESet) result.append(nombreElements); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeTypeObjectifASSImpl
