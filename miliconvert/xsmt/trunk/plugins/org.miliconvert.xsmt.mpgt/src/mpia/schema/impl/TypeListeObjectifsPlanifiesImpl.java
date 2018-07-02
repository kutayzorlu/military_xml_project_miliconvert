/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeListeObjectifsPlanifies;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Liste Objectifs Planifies</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeListeObjectifsPlanifiesImpl#getEstDefinieDansCadrePlanFeux <em>Est Definie Dans Cadre Plan Feux</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeListeObjectifsPlanifiesImpl extends TypeListeObjectifsImpl implements TypeListeObjectifsPlanifies {
	/**
	 * The cached value of the '{@link #getEstDefinieDansCadrePlanFeux() <em>Est Definie Dans Cadre Plan Feux</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstDefinieDansCadrePlanFeux()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation estDefinieDansCadrePlanFeux;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeListeObjectifsPlanifiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeListeObjectifsPlanifies();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getEstDefinieDansCadrePlanFeux() {
		return estDefinieDansCadrePlanFeux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstDefinieDansCadrePlanFeux(TypeAssociation newEstDefinieDansCadrePlanFeux, NotificationChain msgs) {
		TypeAssociation oldEstDefinieDansCadrePlanFeux = estDefinieDansCadrePlanFeux;
		estDefinieDansCadrePlanFeux = newEstDefinieDansCadrePlanFeux;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LISTE_OBJECTIFS_PLANIFIES__EST_DEFINIE_DANS_CADRE_PLAN_FEUX, oldEstDefinieDansCadrePlanFeux, newEstDefinieDansCadrePlanFeux);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstDefinieDansCadrePlanFeux(TypeAssociation newEstDefinieDansCadrePlanFeux) {
		if (newEstDefinieDansCadrePlanFeux != estDefinieDansCadrePlanFeux) {
			NotificationChain msgs = null;
			if (estDefinieDansCadrePlanFeux != null)
				msgs = ((InternalEObject)estDefinieDansCadrePlanFeux).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_LISTE_OBJECTIFS_PLANIFIES__EST_DEFINIE_DANS_CADRE_PLAN_FEUX, null, msgs);
			if (newEstDefinieDansCadrePlanFeux != null)
				msgs = ((InternalEObject)newEstDefinieDansCadrePlanFeux).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_LISTE_OBJECTIFS_PLANIFIES__EST_DEFINIE_DANS_CADRE_PLAN_FEUX, null, msgs);
			msgs = basicSetEstDefinieDansCadrePlanFeux(newEstDefinieDansCadrePlanFeux, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LISTE_OBJECTIFS_PLANIFIES__EST_DEFINIE_DANS_CADRE_PLAN_FEUX, newEstDefinieDansCadrePlanFeux, newEstDefinieDansCadrePlanFeux));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_LISTE_OBJECTIFS_PLANIFIES__EST_DEFINIE_DANS_CADRE_PLAN_FEUX:
				return basicSetEstDefinieDansCadrePlanFeux(null, msgs);
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
			case SchemaPackage.TYPE_LISTE_OBJECTIFS_PLANIFIES__EST_DEFINIE_DANS_CADRE_PLAN_FEUX:
				return getEstDefinieDansCadrePlanFeux();
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
			case SchemaPackage.TYPE_LISTE_OBJECTIFS_PLANIFIES__EST_DEFINIE_DANS_CADRE_PLAN_FEUX:
				setEstDefinieDansCadrePlanFeux((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_LISTE_OBJECTIFS_PLANIFIES__EST_DEFINIE_DANS_CADRE_PLAN_FEUX:
				setEstDefinieDansCadrePlanFeux((TypeAssociation)null);
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
			case SchemaPackage.TYPE_LISTE_OBJECTIFS_PLANIFIES__EST_DEFINIE_DANS_CADRE_PLAN_FEUX:
				return estDefinieDansCadrePlanFeux != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeListeObjectifsPlanifiesImpl
