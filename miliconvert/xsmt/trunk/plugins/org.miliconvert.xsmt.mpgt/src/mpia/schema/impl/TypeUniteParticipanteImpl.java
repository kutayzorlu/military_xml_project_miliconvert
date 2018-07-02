/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeQuantiteMoyensTirASS;
import mpia.schema.TypeUniteParticipante;
import mpia.schema.TypeVolumeMunitionsASS;

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
 * An implementation of the model object '<em><b>Type Unite Participante</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeUniteParticipanteImpl#getNombreMaximalObjectifs <em>Nombre Maximal Objectifs</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteParticipanteImpl#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteParticipanteImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteParticipanteImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteParticipanteImpl#getEstUnite <em>Est Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteParticipanteImpl#getAPourMoyensTirQuantiteMoyensTirASS <em>APour Moyens Tir Quantite Moyens Tir ASS</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteParticipanteImpl#getAPourVolumeMunitionsVolumeMunitionsASS <em>APour Volume Munitions Volume Munitions ASS</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeUniteParticipanteImpl extends EObjectImpl implements TypeUniteParticipante {
	/**
	 * The default value of the '{@link #getNombreMaximalObjectifs() <em>Nombre Maximal Objectifs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreMaximalObjectifs()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_MAXIMAL_OBJECTIFS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreMaximalObjectifs() <em>Nombre Maximal Objectifs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreMaximalObjectifs()
	 * @generated
	 * @ordered
	 */
	protected long nombreMaximalObjectifs = NOMBRE_MAXIMAL_OBJECTIFS_EDEFAULT;

	/**
	 * This is true if the Nombre Maximal Objectifs attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreMaximalObjectifsESet;

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
	 * The cached value of the '{@link #getEstUnite() <em>Est Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT estUnite;

	/**
	 * The cached value of the '{@link #getAPourMoyensTirQuantiteMoyensTirASS() <em>APour Moyens Tir Quantite Moyens Tir ASS</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourMoyensTirQuantiteMoyensTirASS()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeQuantiteMoyensTirASS> aPourMoyensTirQuantiteMoyensTirASS;

	/**
	 * The cached value of the '{@link #getAPourVolumeMunitionsVolumeMunitionsASS() <em>APour Volume Munitions Volume Munitions ASS</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourVolumeMunitionsVolumeMunitionsASS()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeVolumeMunitionsASS> aPourVolumeMunitionsVolumeMunitionsASS;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeUniteParticipanteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeUniteParticipante();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreMaximalObjectifs() {
		return nombreMaximalObjectifs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreMaximalObjectifs(long newNombreMaximalObjectifs) {
		long oldNombreMaximalObjectifs = nombreMaximalObjectifs;
		nombreMaximalObjectifs = newNombreMaximalObjectifs;
		boolean oldNombreMaximalObjectifsESet = nombreMaximalObjectifsESet;
		nombreMaximalObjectifsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE_PARTICIPANTE__NOMBRE_MAXIMAL_OBJECTIFS, oldNombreMaximalObjectifs, nombreMaximalObjectifs, !oldNombreMaximalObjectifsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreMaximalObjectifs() {
		long oldNombreMaximalObjectifs = nombreMaximalObjectifs;
		boolean oldNombreMaximalObjectifsESet = nombreMaximalObjectifsESet;
		nombreMaximalObjectifs = NOMBRE_MAXIMAL_OBJECTIFS_EDEFAULT;
		nombreMaximalObjectifsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_UNITE_PARTICIPANTE__NOMBRE_MAXIMAL_OBJECTIFS, oldNombreMaximalObjectifs, NOMBRE_MAXIMAL_OBJECTIFS_EDEFAULT, oldNombreMaximalObjectifsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreMaximalObjectifs() {
		return nombreMaximalObjectifsESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE_PARTICIPANTE__COMMENTAIRE, oldCommentaire, commentaire));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE_PARTICIPANTE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE_PARTICIPANTE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getEstUnite() {
		return estUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstUnite(TypeAssociationEXT newEstUnite, NotificationChain msgs) {
		TypeAssociationEXT oldEstUnite = estUnite;
		estUnite = newEstUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE_PARTICIPANTE__EST_UNITE, oldEstUnite, newEstUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstUnite(TypeAssociationEXT newEstUnite) {
		if (newEstUnite != estUnite) {
			NotificationChain msgs = null;
			if (estUnite != null)
				msgs = ((InternalEObject)estUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UNITE_PARTICIPANTE__EST_UNITE, null, msgs);
			if (newEstUnite != null)
				msgs = ((InternalEObject)newEstUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UNITE_PARTICIPANTE__EST_UNITE, null, msgs);
			msgs = basicSetEstUnite(newEstUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE_PARTICIPANTE__EST_UNITE, newEstUnite, newEstUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeQuantiteMoyensTirASS> getAPourMoyensTirQuantiteMoyensTirASS() {
		if (aPourMoyensTirQuantiteMoyensTirASS == null) {
			aPourMoyensTirQuantiteMoyensTirASS = new EObjectContainmentEList<TypeQuantiteMoyensTirASS>(TypeQuantiteMoyensTirASS.class, this, SchemaPackage.TYPE_UNITE_PARTICIPANTE__APOUR_MOYENS_TIR_QUANTITE_MOYENS_TIR_ASS);
		}
		return aPourMoyensTirQuantiteMoyensTirASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeVolumeMunitionsASS> getAPourVolumeMunitionsVolumeMunitionsASS() {
		if (aPourVolumeMunitionsVolumeMunitionsASS == null) {
			aPourVolumeMunitionsVolumeMunitionsASS = new EObjectContainmentEList<TypeVolumeMunitionsASS>(TypeVolumeMunitionsASS.class, this, SchemaPackage.TYPE_UNITE_PARTICIPANTE__APOUR_VOLUME_MUNITIONS_VOLUME_MUNITIONS_ASS);
		}
		return aPourVolumeMunitionsVolumeMunitionsASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_UNITE_PARTICIPANTE__EST_UNITE:
				return basicSetEstUnite(null, msgs);
			case SchemaPackage.TYPE_UNITE_PARTICIPANTE__APOUR_MOYENS_TIR_QUANTITE_MOYENS_TIR_ASS:
				return ((InternalEList<?>)getAPourMoyensTirQuantiteMoyensTirASS()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE_PARTICIPANTE__APOUR_VOLUME_MUNITIONS_VOLUME_MUNITIONS_ASS:
				return ((InternalEList<?>)getAPourVolumeMunitionsVolumeMunitionsASS()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_UNITE_PARTICIPANTE__NOMBRE_MAXIMAL_OBJECTIFS:
				return new Long(getNombreMaximalObjectifs());
			case SchemaPackage.TYPE_UNITE_PARTICIPANTE__COMMENTAIRE:
				return getCommentaire();
			case SchemaPackage.TYPE_UNITE_PARTICIPANTE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_UNITE_PARTICIPANTE__CE:
				return getCE();
			case SchemaPackage.TYPE_UNITE_PARTICIPANTE__EST_UNITE:
				return getEstUnite();
			case SchemaPackage.TYPE_UNITE_PARTICIPANTE__APOUR_MOYENS_TIR_QUANTITE_MOYENS_TIR_ASS:
				return getAPourMoyensTirQuantiteMoyensTirASS();
			case SchemaPackage.TYPE_UNITE_PARTICIPANTE__APOUR_VOLUME_MUNITIONS_VOLUME_MUNITIONS_ASS:
				return getAPourVolumeMunitionsVolumeMunitionsASS();
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
			case SchemaPackage.TYPE_UNITE_PARTICIPANTE__NOMBRE_MAXIMAL_OBJECTIFS:
				setNombreMaximalObjectifs(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_UNITE_PARTICIPANTE__COMMENTAIRE:
				setCommentaire((String)newValue);
				return;
			case SchemaPackage.TYPE_UNITE_PARTICIPANTE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_UNITE_PARTICIPANTE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_UNITE_PARTICIPANTE__EST_UNITE:
				setEstUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_UNITE_PARTICIPANTE__APOUR_MOYENS_TIR_QUANTITE_MOYENS_TIR_ASS:
				getAPourMoyensTirQuantiteMoyensTirASS().clear();
				getAPourMoyensTirQuantiteMoyensTirASS().addAll((Collection<? extends TypeQuantiteMoyensTirASS>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE_PARTICIPANTE__APOUR_VOLUME_MUNITIONS_VOLUME_MUNITIONS_ASS:
				getAPourVolumeMunitionsVolumeMunitionsASS().clear();
				getAPourVolumeMunitionsVolumeMunitionsASS().addAll((Collection<? extends TypeVolumeMunitionsASS>)newValue);
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
			case SchemaPackage.TYPE_UNITE_PARTICIPANTE__NOMBRE_MAXIMAL_OBJECTIFS:
				unsetNombreMaximalObjectifs();
				return;
			case SchemaPackage.TYPE_UNITE_PARTICIPANTE__COMMENTAIRE:
				setCommentaire(COMMENTAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_UNITE_PARTICIPANTE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_UNITE_PARTICIPANTE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_UNITE_PARTICIPANTE__EST_UNITE:
				setEstUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_UNITE_PARTICIPANTE__APOUR_MOYENS_TIR_QUANTITE_MOYENS_TIR_ASS:
				getAPourMoyensTirQuantiteMoyensTirASS().clear();
				return;
			case SchemaPackage.TYPE_UNITE_PARTICIPANTE__APOUR_VOLUME_MUNITIONS_VOLUME_MUNITIONS_ASS:
				getAPourVolumeMunitionsVolumeMunitionsASS().clear();
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
			case SchemaPackage.TYPE_UNITE_PARTICIPANTE__NOMBRE_MAXIMAL_OBJECTIFS:
				return isSetNombreMaximalObjectifs();
			case SchemaPackage.TYPE_UNITE_PARTICIPANTE__COMMENTAIRE:
				return COMMENTAIRE_EDEFAULT == null ? commentaire != null : !COMMENTAIRE_EDEFAULT.equals(commentaire);
			case SchemaPackage.TYPE_UNITE_PARTICIPANTE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_UNITE_PARTICIPANTE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_UNITE_PARTICIPANTE__EST_UNITE:
				return estUnite != null;
			case SchemaPackage.TYPE_UNITE_PARTICIPANTE__APOUR_MOYENS_TIR_QUANTITE_MOYENS_TIR_ASS:
				return aPourMoyensTirQuantiteMoyensTirASS != null && !aPourMoyensTirQuantiteMoyensTirASS.isEmpty();
			case SchemaPackage.TYPE_UNITE_PARTICIPANTE__APOUR_VOLUME_MUNITIONS_VOLUME_MUNITIONS_ASS:
				return aPourVolumeMunitionsVolumeMunitionsASS != null && !aPourVolumeMunitionsVolumeMunitionsASS.isEmpty();
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
		result.append(" (nombreMaximalObjectifs: ");
		if (nombreMaximalObjectifsESet) result.append(nombreMaximalObjectifs); else result.append("<unset>");
		result.append(", commentaire: ");
		result.append(commentaire);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeUniteParticipanteImpl
