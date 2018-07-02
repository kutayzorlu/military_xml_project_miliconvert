/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAnnulationInterdictionTir;
import mpia.schema.TypeFinInterdiction;

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
 * An implementation of the model object '<em><b>Type Annulation Interdiction Tir</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAnnulationInterdictionTirImpl#getHeureFinInterdictionSurZone <em>Heure Fin Interdiction Sur Zone</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAnnulationInterdictionTirImpl#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAnnulationInterdictionTirImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAnnulationInterdictionTirImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAnnulationInterdictionTirImpl#getReferenceAlerteConflit3D <em>Reference Alerte Conflit3 D</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAnnulationInterdictionTirImpl#getSeComposeFinInterdiction <em>Se Compose Fin Interdiction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAnnulationInterdictionTirImpl extends EObjectImpl implements TypeAnnulationInterdictionTir {
	/**
	 * The default value of the '{@link #getHeureFinInterdictionSurZone() <em>Heure Fin Interdiction Sur Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeureFinInterdictionSurZone()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar HEURE_FIN_INTERDICTION_SUR_ZONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeureFinInterdictionSurZone() <em>Heure Fin Interdiction Sur Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeureFinInterdictionSurZone()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar heureFinInterdictionSurZone = HEURE_FIN_INTERDICTION_SUR_ZONE_EDEFAULT;

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
	 * The cached value of the '{@link #getReferenceAlerteConflit3D() <em>Reference Alerte Conflit3 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceAlerteConflit3D()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation referenceAlerteConflit3D;

	/**
	 * The cached value of the '{@link #getSeComposeFinInterdiction() <em>Se Compose Fin Interdiction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeComposeFinInterdiction()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeFinInterdiction> seComposeFinInterdiction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAnnulationInterdictionTirImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAnnulationInterdictionTir();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getHeureFinInterdictionSurZone() {
		return heureFinInterdictionSurZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeureFinInterdictionSurZone(XMLGregorianCalendar newHeureFinInterdictionSurZone) {
		XMLGregorianCalendar oldHeureFinInterdictionSurZone = heureFinInterdictionSurZone;
		heureFinInterdictionSurZone = newHeureFinInterdictionSurZone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ANNULATION_INTERDICTION_TIR__HEURE_FIN_INTERDICTION_SUR_ZONE, oldHeureFinInterdictionSurZone, heureFinInterdictionSurZone));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ANNULATION_INTERDICTION_TIR__COMMENTAIRE, oldCommentaire, commentaire));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ANNULATION_INTERDICTION_TIR__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ANNULATION_INTERDICTION_TIR__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getReferenceAlerteConflit3D() {
		return referenceAlerteConflit3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceAlerteConflit3D(TypeAssociation newReferenceAlerteConflit3D, NotificationChain msgs) {
		TypeAssociation oldReferenceAlerteConflit3D = referenceAlerteConflit3D;
		referenceAlerteConflit3D = newReferenceAlerteConflit3D;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ANNULATION_INTERDICTION_TIR__REFERENCE_ALERTE_CONFLIT3_D, oldReferenceAlerteConflit3D, newReferenceAlerteConflit3D);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceAlerteConflit3D(TypeAssociation newReferenceAlerteConflit3D) {
		if (newReferenceAlerteConflit3D != referenceAlerteConflit3D) {
			NotificationChain msgs = null;
			if (referenceAlerteConflit3D != null)
				msgs = ((InternalEObject)referenceAlerteConflit3D).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ANNULATION_INTERDICTION_TIR__REFERENCE_ALERTE_CONFLIT3_D, null, msgs);
			if (newReferenceAlerteConflit3D != null)
				msgs = ((InternalEObject)newReferenceAlerteConflit3D).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ANNULATION_INTERDICTION_TIR__REFERENCE_ALERTE_CONFLIT3_D, null, msgs);
			msgs = basicSetReferenceAlerteConflit3D(newReferenceAlerteConflit3D, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ANNULATION_INTERDICTION_TIR__REFERENCE_ALERTE_CONFLIT3_D, newReferenceAlerteConflit3D, newReferenceAlerteConflit3D));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeFinInterdiction> getSeComposeFinInterdiction() {
		if (seComposeFinInterdiction == null) {
			seComposeFinInterdiction = new EObjectContainmentEList<TypeFinInterdiction>(TypeFinInterdiction.class, this, SchemaPackage.TYPE_ANNULATION_INTERDICTION_TIR__SE_COMPOSE_FIN_INTERDICTION);
		}
		return seComposeFinInterdiction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ANNULATION_INTERDICTION_TIR__REFERENCE_ALERTE_CONFLIT3_D:
				return basicSetReferenceAlerteConflit3D(null, msgs);
			case SchemaPackage.TYPE_ANNULATION_INTERDICTION_TIR__SE_COMPOSE_FIN_INTERDICTION:
				return ((InternalEList<?>)getSeComposeFinInterdiction()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_ANNULATION_INTERDICTION_TIR__HEURE_FIN_INTERDICTION_SUR_ZONE:
				return getHeureFinInterdictionSurZone();
			case SchemaPackage.TYPE_ANNULATION_INTERDICTION_TIR__COMMENTAIRE:
				return getCommentaire();
			case SchemaPackage.TYPE_ANNULATION_INTERDICTION_TIR__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ANNULATION_INTERDICTION_TIR__CE:
				return getCE();
			case SchemaPackage.TYPE_ANNULATION_INTERDICTION_TIR__REFERENCE_ALERTE_CONFLIT3_D:
				return getReferenceAlerteConflit3D();
			case SchemaPackage.TYPE_ANNULATION_INTERDICTION_TIR__SE_COMPOSE_FIN_INTERDICTION:
				return getSeComposeFinInterdiction();
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
			case SchemaPackage.TYPE_ANNULATION_INTERDICTION_TIR__HEURE_FIN_INTERDICTION_SUR_ZONE:
				setHeureFinInterdictionSurZone((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_ANNULATION_INTERDICTION_TIR__COMMENTAIRE:
				setCommentaire((String)newValue);
				return;
			case SchemaPackage.TYPE_ANNULATION_INTERDICTION_TIR__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ANNULATION_INTERDICTION_TIR__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ANNULATION_INTERDICTION_TIR__REFERENCE_ALERTE_CONFLIT3_D:
				setReferenceAlerteConflit3D((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ANNULATION_INTERDICTION_TIR__SE_COMPOSE_FIN_INTERDICTION:
				getSeComposeFinInterdiction().clear();
				getSeComposeFinInterdiction().addAll((Collection<? extends TypeFinInterdiction>)newValue);
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
			case SchemaPackage.TYPE_ANNULATION_INTERDICTION_TIR__HEURE_FIN_INTERDICTION_SUR_ZONE:
				setHeureFinInterdictionSurZone(HEURE_FIN_INTERDICTION_SUR_ZONE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ANNULATION_INTERDICTION_TIR__COMMENTAIRE:
				setCommentaire(COMMENTAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ANNULATION_INTERDICTION_TIR__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ANNULATION_INTERDICTION_TIR__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ANNULATION_INTERDICTION_TIR__REFERENCE_ALERTE_CONFLIT3_D:
				setReferenceAlerteConflit3D((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ANNULATION_INTERDICTION_TIR__SE_COMPOSE_FIN_INTERDICTION:
				getSeComposeFinInterdiction().clear();
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
			case SchemaPackage.TYPE_ANNULATION_INTERDICTION_TIR__HEURE_FIN_INTERDICTION_SUR_ZONE:
				return HEURE_FIN_INTERDICTION_SUR_ZONE_EDEFAULT == null ? heureFinInterdictionSurZone != null : !HEURE_FIN_INTERDICTION_SUR_ZONE_EDEFAULT.equals(heureFinInterdictionSurZone);
			case SchemaPackage.TYPE_ANNULATION_INTERDICTION_TIR__COMMENTAIRE:
				return COMMENTAIRE_EDEFAULT == null ? commentaire != null : !COMMENTAIRE_EDEFAULT.equals(commentaire);
			case SchemaPackage.TYPE_ANNULATION_INTERDICTION_TIR__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ANNULATION_INTERDICTION_TIR__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ANNULATION_INTERDICTION_TIR__REFERENCE_ALERTE_CONFLIT3_D:
				return referenceAlerteConflit3D != null;
			case SchemaPackage.TYPE_ANNULATION_INTERDICTION_TIR__SE_COMPOSE_FIN_INTERDICTION:
				return seComposeFinInterdiction != null && !seComposeFinInterdiction.isEmpty();
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
		result.append(" (heureFinInterdictionSurZone: ");
		result.append(heureFinInterdictionSurZone);
		result.append(", commentaire: ");
		result.append(commentaire);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeAnnulationInterdictionTirImpl
