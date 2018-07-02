/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.meta.util;

import java.util.List;

import mpia.meta.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see mpia.meta.MetaPackage
 * @generated
 */
public class MetaSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MetaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaSwitch() {
		if (modelPackage == null) {
			modelPackage = MetaPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MetaPackage.TYPE_ASSOCIATION: {
				TypeAssociation typeAssociation = (TypeAssociation)theEObject;
				T result = caseTypeAssociation(typeAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.TYPE_ASSOCIATION_EXT: {
				TypeAssociationEXT typeAssociationEXT = (TypeAssociationEXT)theEObject;
				T result = caseTypeAssociationEXT(typeAssociationEXT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.TYPE_DATA_TYPE_ACCELERATION_ANGULAIRE: {
				TypeDataTypeAccelerationAngulaire typeDataTypeAccelerationAngulaire = (TypeDataTypeAccelerationAngulaire)theEObject;
				T result = caseTypeDataTypeAccelerationAngulaire(typeDataTypeAccelerationAngulaire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.TYPE_DATA_TYPE_ACCELERATION_ANGULAIRE_ORIENTEE: {
				TypeDataTypeAccelerationAngulaireOrientee typeDataTypeAccelerationAngulaireOrientee = (TypeDataTypeAccelerationAngulaireOrientee)theEObject;
				T result = caseTypeDataTypeAccelerationAngulaireOrientee(typeDataTypeAccelerationAngulaireOrientee);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.TYPE_DATA_TYPE_ACCELERATION_LINEAIRE: {
				TypeDataTypeAccelerationLineaire typeDataTypeAccelerationLineaire = (TypeDataTypeAccelerationLineaire)theEObject;
				T result = caseTypeDataTypeAccelerationLineaire(typeDataTypeAccelerationLineaire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.TYPE_DATA_TYPE_AIRE: {
				TypeDataTypeAire typeDataTypeAire = (TypeDataTypeAire)theEObject;
				T result = caseTypeDataTypeAire(typeDataTypeAire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.TYPE_DATA_TYPE_ALTITUDE_PRESSION: {
				TypeDataTypeAltitudePression typeDataTypeAltitudePression = (TypeDataTypeAltitudePression)theEObject;
				T result = caseTypeDataTypeAltitudePression(typeDataTypeAltitudePression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.TYPE_DATA_TYPE_ANGLE: {
				TypeDataTypeAngle typeDataTypeAngle = (TypeDataTypeAngle)theEObject;
				T result = caseTypeDataTypeAngle(typeDataTypeAngle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.TYPE_DATA_TYPE_ANGLE_SIGNE: {
				TypeDataTypeAngleSigne typeDataTypeAngleSigne = (TypeDataTypeAngleSigne)theEObject;
				T result = caseTypeDataTypeAngleSigne(typeDataTypeAngleSigne);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.TYPE_DATA_TYPE_CHAMP_MAGNETIQUE: {
				TypeDataTypeChampMagnetique typeDataTypeChampMagnetique = (TypeDataTypeChampMagnetique)theEObject;
				T result = caseTypeDataTypeChampMagnetique(typeDataTypeChampMagnetique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.TYPE_DATA_TYPE_COORDONNEE_ACCELERATION_LINEAIRE: {
				TypeDataTypeCoordonneeAccelerationLineaire typeDataTypeCoordonneeAccelerationLineaire = (TypeDataTypeCoordonneeAccelerationLineaire)theEObject;
				T result = caseTypeDataTypeCoordonneeAccelerationLineaire(typeDataTypeCoordonneeAccelerationLineaire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.TYPE_DATA_TYPE_COORDONNEE_FORCE: {
				TypeDataTypeCoordonneeForce typeDataTypeCoordonneeForce = (TypeDataTypeCoordonneeForce)theEObject;
				T result = caseTypeDataTypeCoordonneeForce(typeDataTypeCoordonneeForce);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.TYPE_DATA_TYPE_COORDONNEE_LINEAIRE: {
				TypeDataTypeCoordonneeLineaire typeDataTypeCoordonneeLineaire = (TypeDataTypeCoordonneeLineaire)theEObject;
				T result = caseTypeDataTypeCoordonneeLineaire(typeDataTypeCoordonneeLineaire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.TYPE_DATA_TYPE_COORDONNEE_VITESSE_LINEAIRE: {
				TypeDataTypeCoordonneeVitesseLineaire typeDataTypeCoordonneeVitesseLineaire = (TypeDataTypeCoordonneeVitesseLineaire)theEObject;
				T result = caseTypeDataTypeCoordonneeVitesseLineaire(typeDataTypeCoordonneeVitesseLineaire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.TYPE_DATA_TYPE_DATE_HEURE: {
				TypeDataTypeDateHeure typeDataTypeDateHeure = (TypeDataTypeDateHeure)theEObject;
				T result = caseTypeDataTypeDateHeure(typeDataTypeDateHeure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.TYPE_DATA_TYPE_DEBIT_MASSIQUE: {
				TypeDataTypeDebitMassique typeDataTypeDebitMassique = (TypeDataTypeDebitMassique)theEObject;
				T result = caseTypeDataTypeDebitMassique(typeDataTypeDebitMassique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.TYPE_DATA_TYPE_DEBIT_TRANSMISSION: {
				TypeDataTypeDebitTransmission typeDataTypeDebitTransmission = (TypeDataTypeDebitTransmission)theEObject;
				T result = caseTypeDataTypeDebitTransmission(typeDataTypeDebitTransmission);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.TYPE_DATA_TYPE_DEBIT_VOLUMIQUE: {
				TypeDataTypeDebitVolumique typeDataTypeDebitVolumique = (TypeDataTypeDebitVolumique)theEObject;
				T result = caseTypeDataTypeDebitVolumique(typeDataTypeDebitVolumique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.TYPE_DATA_TYPE_DOSE_ABSORBEE: {
				TypeDataTypeDoseAbsorbee typeDataTypeDoseAbsorbee = (TypeDataTypeDoseAbsorbee)theEObject;
				T result = caseTypeDataTypeDoseAbsorbee(typeDataTypeDoseAbsorbee);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.TYPE_DATA_TYPE_DUREE: {
				TypeDataTypeDuree typeDataTypeDuree = (TypeDataTypeDuree)theEObject;
				T result = caseTypeDataTypeDuree(typeDataTypeDuree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.TYPE_DATA_TYPE_FORCE: {
				TypeDataTypeForce typeDataTypeForce = (TypeDataTypeForce)theEObject;
				T result = caseTypeDataTypeForce(typeDataTypeForce);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.TYPE_DATA_TYPE_FREQUENCE: {
				TypeDataTypeFrequence typeDataTypeFrequence = (TypeDataTypeFrequence)theEObject;
				T result = caseTypeDataTypeFrequence(typeDataTypeFrequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.TYPE_DATA_TYPE_LATITUDE: {
				TypeDataTypeLatitude typeDataTypeLatitude = (TypeDataTypeLatitude)theEObject;
				T result = caseTypeDataTypeLatitude(typeDataTypeLatitude);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.TYPE_DATA_TYPE_LONGITUDE: {
				TypeDataTypeLongitude typeDataTypeLongitude = (TypeDataTypeLongitude)theEObject;
				T result = caseTypeDataTypeLongitude(typeDataTypeLongitude);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.TYPE_DATA_TYPE_LONGUEUR: {
				TypeDataTypeLongueur typeDataTypeLongueur = (TypeDataTypeLongueur)theEObject;
				T result = caseTypeDataTypeLongueur(typeDataTypeLongueur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.TYPE_DATA_TYPE_MASSE: {
				TypeDataTypeMasse typeDataTypeMasse = (TypeDataTypeMasse)theEObject;
				T result = caseTypeDataTypeMasse(typeDataTypeMasse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.TYPE_DATA_TYPE_PRESSION: {
				TypeDataTypePression typeDataTypePression = (TypeDataTypePression)theEObject;
				T result = caseTypeDataTypePression(typeDataTypePression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.TYPE_DATA_TYPE_TAUX_PRECIPITATION: {
				TypeDataTypeTauxPrecipitation typeDataTypeTauxPrecipitation = (TypeDataTypeTauxPrecipitation)theEObject;
				T result = caseTypeDataTypeTauxPrecipitation(typeDataTypeTauxPrecipitation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.TYPE_DATA_TYPE_TEMPERATURE: {
				TypeDataTypeTemperature typeDataTypeTemperature = (TypeDataTypeTemperature)theEObject;
				T result = caseTypeDataTypeTemperature(typeDataTypeTemperature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.TYPE_DATA_TYPE_VITESSE_ANGULAIRE: {
				TypeDataTypeVitesseAngulaire typeDataTypeVitesseAngulaire = (TypeDataTypeVitesseAngulaire)theEObject;
				T result = caseTypeDataTypeVitesseAngulaire(typeDataTypeVitesseAngulaire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.TYPE_DATA_TYPE_VITESSE_ANGULAIRE_ORIENTEE: {
				TypeDataTypeVitesseAngulaireOrientee typeDataTypeVitesseAngulaireOrientee = (TypeDataTypeVitesseAngulaireOrientee)theEObject;
				T result = caseTypeDataTypeVitesseAngulaireOrientee(typeDataTypeVitesseAngulaireOrientee);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.TYPE_DATA_TYPE_VITESSE_LINEAIRE: {
				TypeDataTypeVitesseLineaire typeDataTypeVitesseLineaire = (TypeDataTypeVitesseLineaire)theEObject;
				T result = caseTypeDataTypeVitesseLineaire(typeDataTypeVitesseLineaire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.TYPE_DATA_TYPE_VOLUME: {
				TypeDataTypeVolume typeDataTypeVolume = (TypeDataTypeVolume)theEObject;
				T result = caseTypeDataTypeVolume(typeDataTypeVolume);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociation(TypeAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association EXT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association EXT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociationEXT(TypeAssociationEXT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Data Type Acceleration Angulaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Data Type Acceleration Angulaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDataTypeAccelerationAngulaire(TypeDataTypeAccelerationAngulaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Data Type Acceleration Angulaire Orientee</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Data Type Acceleration Angulaire Orientee</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDataTypeAccelerationAngulaireOrientee(TypeDataTypeAccelerationAngulaireOrientee object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Data Type Acceleration Lineaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Data Type Acceleration Lineaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDataTypeAccelerationLineaire(TypeDataTypeAccelerationLineaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Data Type Aire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Data Type Aire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDataTypeAire(TypeDataTypeAire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Data Type Altitude Pression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Data Type Altitude Pression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDataTypeAltitudePression(TypeDataTypeAltitudePression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Data Type Angle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Data Type Angle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDataTypeAngle(TypeDataTypeAngle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Data Type Angle Signe</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Data Type Angle Signe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDataTypeAngleSigne(TypeDataTypeAngleSigne object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Data Type Champ Magnetique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Data Type Champ Magnetique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDataTypeChampMagnetique(TypeDataTypeChampMagnetique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Data Type Coordonnee Acceleration Lineaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Data Type Coordonnee Acceleration Lineaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDataTypeCoordonneeAccelerationLineaire(TypeDataTypeCoordonneeAccelerationLineaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Data Type Coordonnee Force</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Data Type Coordonnee Force</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDataTypeCoordonneeForce(TypeDataTypeCoordonneeForce object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Data Type Coordonnee Lineaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Data Type Coordonnee Lineaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDataTypeCoordonneeLineaire(TypeDataTypeCoordonneeLineaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Data Type Coordonnee Vitesse Lineaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Data Type Coordonnee Vitesse Lineaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDataTypeCoordonneeVitesseLineaire(TypeDataTypeCoordonneeVitesseLineaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Data Type Date Heure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Data Type Date Heure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDataTypeDateHeure(TypeDataTypeDateHeure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Data Type Debit Massique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Data Type Debit Massique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDataTypeDebitMassique(TypeDataTypeDebitMassique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Data Type Debit Transmission</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Data Type Debit Transmission</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDataTypeDebitTransmission(TypeDataTypeDebitTransmission object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Data Type Debit Volumique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Data Type Debit Volumique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDataTypeDebitVolumique(TypeDataTypeDebitVolumique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Data Type Dose Absorbee</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Data Type Dose Absorbee</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDataTypeDoseAbsorbee(TypeDataTypeDoseAbsorbee object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Data Type Duree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Data Type Duree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDataTypeDuree(TypeDataTypeDuree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Data Type Force</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Data Type Force</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDataTypeForce(TypeDataTypeForce object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Data Type Frequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Data Type Frequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDataTypeFrequence(TypeDataTypeFrequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Data Type Latitude</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Data Type Latitude</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDataTypeLatitude(TypeDataTypeLatitude object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Data Type Longitude</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Data Type Longitude</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDataTypeLongitude(TypeDataTypeLongitude object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Data Type Longueur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Data Type Longueur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDataTypeLongueur(TypeDataTypeLongueur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Data Type Masse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Data Type Masse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDataTypeMasse(TypeDataTypeMasse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Data Type Pression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Data Type Pression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDataTypePression(TypeDataTypePression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Data Type Taux Precipitation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Data Type Taux Precipitation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDataTypeTauxPrecipitation(TypeDataTypeTauxPrecipitation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Data Type Temperature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Data Type Temperature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDataTypeTemperature(TypeDataTypeTemperature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Data Type Vitesse Angulaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Data Type Vitesse Angulaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDataTypeVitesseAngulaire(TypeDataTypeVitesseAngulaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Data Type Vitesse Angulaire Orientee</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Data Type Vitesse Angulaire Orientee</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDataTypeVitesseAngulaireOrientee(TypeDataTypeVitesseAngulaireOrientee object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Data Type Vitesse Lineaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Data Type Vitesse Lineaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDataTypeVitesseLineaire(TypeDataTypeVitesseLineaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Data Type Volume</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Data Type Volume</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDataTypeVolume(TypeDataTypeVolume object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //MetaSwitch
