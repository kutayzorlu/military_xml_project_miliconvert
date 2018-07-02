/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCriteresIdentification;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Criteres Identification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCriteresIdentificationImpl#getListeActesHostiles <em>Liste Actes Hostiles</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCriteresIdentificationImpl#getMatriceIDCPaAppliquer <em>Matrice IDC Pa Appliquer</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCriteresIdentificationImpl#getAutresCriteresIdentification <em>Autres Criteres Identification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCriteresIdentificationImpl extends EObjectImpl implements TypeCriteresIdentification {
	/**
	 * The default value of the '{@link #getListeActesHostiles() <em>Liste Actes Hostiles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListeActesHostiles()
	 * @generated
	 * @ordered
	 */
	protected static final String LISTE_ACTES_HOSTILES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getListeActesHostiles() <em>Liste Actes Hostiles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListeActesHostiles()
	 * @generated
	 * @ordered
	 */
	protected String listeActesHostiles = LISTE_ACTES_HOSTILES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMatriceIDCPaAppliquer() <em>Matrice IDC Pa Appliquer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatriceIDCPaAppliquer()
	 * @generated
	 * @ordered
	 */
	protected static final String MATRICE_IDC_PA_APPLIQUER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMatriceIDCPaAppliquer() <em>Matrice IDC Pa Appliquer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatriceIDCPaAppliquer()
	 * @generated
	 * @ordered
	 */
	protected String matriceIDCPaAppliquer = MATRICE_IDC_PA_APPLIQUER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAutresCriteresIdentification() <em>Autres Criteres Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutresCriteresIdentification()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTRES_CRITERES_IDENTIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutresCriteresIdentification() <em>Autres Criteres Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutresCriteresIdentification()
	 * @generated
	 * @ordered
	 */
	protected String autresCriteresIdentification = AUTRES_CRITERES_IDENTIFICATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCriteresIdentificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCriteresIdentification();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getListeActesHostiles() {
		return listeActesHostiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListeActesHostiles(String newListeActesHostiles) {
		String oldListeActesHostiles = listeActesHostiles;
		listeActesHostiles = newListeActesHostiles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CRITERES_IDENTIFICATION__LISTE_ACTES_HOSTILES, oldListeActesHostiles, listeActesHostiles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMatriceIDCPaAppliquer() {
		return matriceIDCPaAppliquer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatriceIDCPaAppliquer(String newMatriceIDCPaAppliquer) {
		String oldMatriceIDCPaAppliquer = matriceIDCPaAppliquer;
		matriceIDCPaAppliquer = newMatriceIDCPaAppliquer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CRITERES_IDENTIFICATION__MATRICE_IDC_PA_APPLIQUER, oldMatriceIDCPaAppliquer, matriceIDCPaAppliquer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutresCriteresIdentification() {
		return autresCriteresIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutresCriteresIdentification(String newAutresCriteresIdentification) {
		String oldAutresCriteresIdentification = autresCriteresIdentification;
		autresCriteresIdentification = newAutresCriteresIdentification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CRITERES_IDENTIFICATION__AUTRES_CRITERES_IDENTIFICATION, oldAutresCriteresIdentification, autresCriteresIdentification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_CRITERES_IDENTIFICATION__LISTE_ACTES_HOSTILES:
				return getListeActesHostiles();
			case SchemaPackage.TYPE_CRITERES_IDENTIFICATION__MATRICE_IDC_PA_APPLIQUER:
				return getMatriceIDCPaAppliquer();
			case SchemaPackage.TYPE_CRITERES_IDENTIFICATION__AUTRES_CRITERES_IDENTIFICATION:
				return getAutresCriteresIdentification();
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
			case SchemaPackage.TYPE_CRITERES_IDENTIFICATION__LISTE_ACTES_HOSTILES:
				setListeActesHostiles((String)newValue);
				return;
			case SchemaPackage.TYPE_CRITERES_IDENTIFICATION__MATRICE_IDC_PA_APPLIQUER:
				setMatriceIDCPaAppliquer((String)newValue);
				return;
			case SchemaPackage.TYPE_CRITERES_IDENTIFICATION__AUTRES_CRITERES_IDENTIFICATION:
				setAutresCriteresIdentification((String)newValue);
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
			case SchemaPackage.TYPE_CRITERES_IDENTIFICATION__LISTE_ACTES_HOSTILES:
				setListeActesHostiles(LISTE_ACTES_HOSTILES_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CRITERES_IDENTIFICATION__MATRICE_IDC_PA_APPLIQUER:
				setMatriceIDCPaAppliquer(MATRICE_IDC_PA_APPLIQUER_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CRITERES_IDENTIFICATION__AUTRES_CRITERES_IDENTIFICATION:
				setAutresCriteresIdentification(AUTRES_CRITERES_IDENTIFICATION_EDEFAULT);
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
			case SchemaPackage.TYPE_CRITERES_IDENTIFICATION__LISTE_ACTES_HOSTILES:
				return LISTE_ACTES_HOSTILES_EDEFAULT == null ? listeActesHostiles != null : !LISTE_ACTES_HOSTILES_EDEFAULT.equals(listeActesHostiles);
			case SchemaPackage.TYPE_CRITERES_IDENTIFICATION__MATRICE_IDC_PA_APPLIQUER:
				return MATRICE_IDC_PA_APPLIQUER_EDEFAULT == null ? matriceIDCPaAppliquer != null : !MATRICE_IDC_PA_APPLIQUER_EDEFAULT.equals(matriceIDCPaAppliquer);
			case SchemaPackage.TYPE_CRITERES_IDENTIFICATION__AUTRES_CRITERES_IDENTIFICATION:
				return AUTRES_CRITERES_IDENTIFICATION_EDEFAULT == null ? autresCriteresIdentification != null : !AUTRES_CRITERES_IDENTIFICATION_EDEFAULT.equals(autresCriteresIdentification);
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
		result.append(" (listeActesHostiles: ");
		result.append(listeActesHostiles);
		result.append(", matriceIDCPaAppliquer: ");
		result.append(matriceIDCPaAppliquer);
		result.append(", autresCriteresIdentification: ");
		result.append(autresCriteresIdentification);
		result.append(')');
		return result.toString();
	}

} //TypeCriteresIdentificationImpl
