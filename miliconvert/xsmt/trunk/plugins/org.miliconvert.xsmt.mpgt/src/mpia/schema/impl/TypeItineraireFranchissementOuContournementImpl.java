/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeItineraireFranchissementOuContournement;
import mpia.schema.TypeLocalisationGeometrique2D;
import mpia.schema.TypeModeFranchissement;

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
 * An implementation of the model object '<em><b>Type Itineraire Franchissement Ou Contournement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeItineraireFranchissementOuContournementImpl#isFranchissement <em>Franchissement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeItineraireFranchissementOuContournementImpl#isContournement <em>Contournement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeItineraireFranchissementOuContournementImpl#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeItineraireFranchissementOuContournementImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeItineraireFranchissementOuContournementImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeItineraireFranchissementOuContournementImpl#getAPourLocalisationLocalisationGeometrique2D <em>APour Localisation Localisation Geometrique2 D</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeItineraireFranchissementOuContournementImpl#getVautSelonModesModeFranchissement <em>Vaut Selon Modes Mode Franchissement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeItineraireFranchissementOuContournementImpl extends EObjectImpl implements TypeItineraireFranchissementOuContournement {
	/**
	 * The default value of the '{@link #isFranchissement() <em>Franchissement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFranchissement()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FRANCHISSEMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFranchissement() <em>Franchissement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFranchissement()
	 * @generated
	 * @ordered
	 */
	protected boolean franchissement = FRANCHISSEMENT_EDEFAULT;

	/**
	 * This is true if the Franchissement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean franchissementESet;

	/**
	 * The default value of the '{@link #isContournement() <em>Contournement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContournement()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTOURNEMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isContournement() <em>Contournement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContournement()
	 * @generated
	 * @ordered
	 */
	protected boolean contournement = CONTOURNEMENT_EDEFAULT;

	/**
	 * This is true if the Contournement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean contournementESet;

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
	 * The cached value of the '{@link #getAPourLocalisationLocalisationGeometrique2D() <em>APour Localisation Localisation Geometrique2 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourLocalisationLocalisationGeometrique2D()
	 * @generated
	 * @ordered
	 */
	protected TypeLocalisationGeometrique2D aPourLocalisationLocalisationGeometrique2D;

	/**
	 * The cached value of the '{@link #getVautSelonModesModeFranchissement() <em>Vaut Selon Modes Mode Franchissement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVautSelonModesModeFranchissement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeModeFranchissement> vautSelonModesModeFranchissement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeItineraireFranchissementOuContournementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeItineraireFranchissementOuContournement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFranchissement() {
		return franchissement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFranchissement(boolean newFranchissement) {
		boolean oldFranchissement = franchissement;
		franchissement = newFranchissement;
		boolean oldFranchissementESet = franchissementESet;
		franchissementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT__FRANCHISSEMENT, oldFranchissement, franchissement, !oldFranchissementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFranchissement() {
		boolean oldFranchissement = franchissement;
		boolean oldFranchissementESet = franchissementESet;
		franchissement = FRANCHISSEMENT_EDEFAULT;
		franchissementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT__FRANCHISSEMENT, oldFranchissement, FRANCHISSEMENT_EDEFAULT, oldFranchissementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFranchissement() {
		return franchissementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isContournement() {
		return contournement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContournement(boolean newContournement) {
		boolean oldContournement = contournement;
		contournement = newContournement;
		boolean oldContournementESet = contournementESet;
		contournementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT__CONTOURNEMENT, oldContournement, contournement, !oldContournementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetContournement() {
		boolean oldContournement = contournement;
		boolean oldContournementESet = contournementESet;
		contournement = CONTOURNEMENT_EDEFAULT;
		contournementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT__CONTOURNEMENT, oldContournement, CONTOURNEMENT_EDEFAULT, oldContournementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContournement() {
		return contournementESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT__COMMENTAIRE, oldCommentaire, commentaire));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeLocalisationGeometrique2D getAPourLocalisationLocalisationGeometrique2D() {
		return aPourLocalisationLocalisationGeometrique2D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourLocalisationLocalisationGeometrique2D(TypeLocalisationGeometrique2D newAPourLocalisationLocalisationGeometrique2D, NotificationChain msgs) {
		TypeLocalisationGeometrique2D oldAPourLocalisationLocalisationGeometrique2D = aPourLocalisationLocalisationGeometrique2D;
		aPourLocalisationLocalisationGeometrique2D = newAPourLocalisationLocalisationGeometrique2D;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT__APOUR_LOCALISATION_LOCALISATION_GEOMETRIQUE2_D, oldAPourLocalisationLocalisationGeometrique2D, newAPourLocalisationLocalisationGeometrique2D);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourLocalisationLocalisationGeometrique2D(TypeLocalisationGeometrique2D newAPourLocalisationLocalisationGeometrique2D) {
		if (newAPourLocalisationLocalisationGeometrique2D != aPourLocalisationLocalisationGeometrique2D) {
			NotificationChain msgs = null;
			if (aPourLocalisationLocalisationGeometrique2D != null)
				msgs = ((InternalEObject)aPourLocalisationLocalisationGeometrique2D).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT__APOUR_LOCALISATION_LOCALISATION_GEOMETRIQUE2_D, null, msgs);
			if (newAPourLocalisationLocalisationGeometrique2D != null)
				msgs = ((InternalEObject)newAPourLocalisationLocalisationGeometrique2D).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT__APOUR_LOCALISATION_LOCALISATION_GEOMETRIQUE2_D, null, msgs);
			msgs = basicSetAPourLocalisationLocalisationGeometrique2D(newAPourLocalisationLocalisationGeometrique2D, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT__APOUR_LOCALISATION_LOCALISATION_GEOMETRIQUE2_D, newAPourLocalisationLocalisationGeometrique2D, newAPourLocalisationLocalisationGeometrique2D));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeModeFranchissement> getVautSelonModesModeFranchissement() {
		if (vautSelonModesModeFranchissement == null) {
			vautSelonModesModeFranchissement = new EObjectContainmentEList<TypeModeFranchissement>(TypeModeFranchissement.class, this, SchemaPackage.TYPE_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT__VAUT_SELON_MODES_MODE_FRANCHISSEMENT);
		}
		return vautSelonModesModeFranchissement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT__APOUR_LOCALISATION_LOCALISATION_GEOMETRIQUE2_D:
				return basicSetAPourLocalisationLocalisationGeometrique2D(null, msgs);
			case SchemaPackage.TYPE_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT__VAUT_SELON_MODES_MODE_FRANCHISSEMENT:
				return ((InternalEList<?>)getVautSelonModesModeFranchissement()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT__FRANCHISSEMENT:
				return isFranchissement() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT__CONTOURNEMENT:
				return isContournement() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT__COMMENTAIRE:
				return getCommentaire();
			case SchemaPackage.TYPE_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT__CE:
				return getCE();
			case SchemaPackage.TYPE_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT__APOUR_LOCALISATION_LOCALISATION_GEOMETRIQUE2_D:
				return getAPourLocalisationLocalisationGeometrique2D();
			case SchemaPackage.TYPE_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT__VAUT_SELON_MODES_MODE_FRANCHISSEMENT:
				return getVautSelonModesModeFranchissement();
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
			case SchemaPackage.TYPE_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT__FRANCHISSEMENT:
				setFranchissement(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT__CONTOURNEMENT:
				setContournement(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT__COMMENTAIRE:
				setCommentaire((String)newValue);
				return;
			case SchemaPackage.TYPE_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT__APOUR_LOCALISATION_LOCALISATION_GEOMETRIQUE2_D:
				setAPourLocalisationLocalisationGeometrique2D((TypeLocalisationGeometrique2D)newValue);
				return;
			case SchemaPackage.TYPE_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT__VAUT_SELON_MODES_MODE_FRANCHISSEMENT:
				getVautSelonModesModeFranchissement().clear();
				getVautSelonModesModeFranchissement().addAll((Collection<? extends TypeModeFranchissement>)newValue);
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
			case SchemaPackage.TYPE_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT__FRANCHISSEMENT:
				unsetFranchissement();
				return;
			case SchemaPackage.TYPE_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT__CONTOURNEMENT:
				unsetContournement();
				return;
			case SchemaPackage.TYPE_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT__COMMENTAIRE:
				setCommentaire(COMMENTAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT__APOUR_LOCALISATION_LOCALISATION_GEOMETRIQUE2_D:
				setAPourLocalisationLocalisationGeometrique2D((TypeLocalisationGeometrique2D)null);
				return;
			case SchemaPackage.TYPE_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT__VAUT_SELON_MODES_MODE_FRANCHISSEMENT:
				getVautSelonModesModeFranchissement().clear();
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
			case SchemaPackage.TYPE_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT__FRANCHISSEMENT:
				return isSetFranchissement();
			case SchemaPackage.TYPE_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT__CONTOURNEMENT:
				return isSetContournement();
			case SchemaPackage.TYPE_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT__COMMENTAIRE:
				return COMMENTAIRE_EDEFAULT == null ? commentaire != null : !COMMENTAIRE_EDEFAULT.equals(commentaire);
			case SchemaPackage.TYPE_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT__APOUR_LOCALISATION_LOCALISATION_GEOMETRIQUE2_D:
				return aPourLocalisationLocalisationGeometrique2D != null;
			case SchemaPackage.TYPE_ITINERAIRE_FRANCHISSEMENT_OU_CONTOURNEMENT__VAUT_SELON_MODES_MODE_FRANCHISSEMENT:
				return vautSelonModesModeFranchissement != null && !vautSelonModesModeFranchissement.isEmpty();
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
		result.append(" (franchissement: ");
		if (franchissementESet) result.append(franchissement); else result.append("<unset>");
		result.append(", contournement: ");
		if (contournementESet) result.append(contournement); else result.append("<unset>");
		result.append(", commentaire: ");
		result.append(commentaire);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeItineraireFranchissementOuContournementImpl
