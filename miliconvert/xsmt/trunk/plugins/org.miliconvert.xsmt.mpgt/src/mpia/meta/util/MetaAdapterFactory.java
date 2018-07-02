/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.meta.util;

import mpia.meta.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see mpia.meta.MetaPackage
 * @generated
 */
public class MetaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MetaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MetaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaSwitch<Adapter> modelSwitch =
		new MetaSwitch<Adapter>() {
			@Override
			public Adapter caseTypeAssociation(TypeAssociation object) {
				return createTypeAssociationAdapter();
			}
			@Override
			public Adapter caseTypeAssociationEXT(TypeAssociationEXT object) {
				return createTypeAssociationEXTAdapter();
			}
			@Override
			public Adapter caseTypeDataTypeAccelerationAngulaire(TypeDataTypeAccelerationAngulaire object) {
				return createTypeDataTypeAccelerationAngulaireAdapter();
			}
			@Override
			public Adapter caseTypeDataTypeAccelerationAngulaireOrientee(TypeDataTypeAccelerationAngulaireOrientee object) {
				return createTypeDataTypeAccelerationAngulaireOrienteeAdapter();
			}
			@Override
			public Adapter caseTypeDataTypeAccelerationLineaire(TypeDataTypeAccelerationLineaire object) {
				return createTypeDataTypeAccelerationLineaireAdapter();
			}
			@Override
			public Adapter caseTypeDataTypeAire(TypeDataTypeAire object) {
				return createTypeDataTypeAireAdapter();
			}
			@Override
			public Adapter caseTypeDataTypeAltitudePression(TypeDataTypeAltitudePression object) {
				return createTypeDataTypeAltitudePressionAdapter();
			}
			@Override
			public Adapter caseTypeDataTypeAngle(TypeDataTypeAngle object) {
				return createTypeDataTypeAngleAdapter();
			}
			@Override
			public Adapter caseTypeDataTypeAngleSigne(TypeDataTypeAngleSigne object) {
				return createTypeDataTypeAngleSigneAdapter();
			}
			@Override
			public Adapter caseTypeDataTypeChampMagnetique(TypeDataTypeChampMagnetique object) {
				return createTypeDataTypeChampMagnetiqueAdapter();
			}
			@Override
			public Adapter caseTypeDataTypeCoordonneeAccelerationLineaire(TypeDataTypeCoordonneeAccelerationLineaire object) {
				return createTypeDataTypeCoordonneeAccelerationLineaireAdapter();
			}
			@Override
			public Adapter caseTypeDataTypeCoordonneeForce(TypeDataTypeCoordonneeForce object) {
				return createTypeDataTypeCoordonneeForceAdapter();
			}
			@Override
			public Adapter caseTypeDataTypeCoordonneeLineaire(TypeDataTypeCoordonneeLineaire object) {
				return createTypeDataTypeCoordonneeLineaireAdapter();
			}
			@Override
			public Adapter caseTypeDataTypeCoordonneeVitesseLineaire(TypeDataTypeCoordonneeVitesseLineaire object) {
				return createTypeDataTypeCoordonneeVitesseLineaireAdapter();
			}
			@Override
			public Adapter caseTypeDataTypeDateHeure(TypeDataTypeDateHeure object) {
				return createTypeDataTypeDateHeureAdapter();
			}
			@Override
			public Adapter caseTypeDataTypeDebitMassique(TypeDataTypeDebitMassique object) {
				return createTypeDataTypeDebitMassiqueAdapter();
			}
			@Override
			public Adapter caseTypeDataTypeDebitTransmission(TypeDataTypeDebitTransmission object) {
				return createTypeDataTypeDebitTransmissionAdapter();
			}
			@Override
			public Adapter caseTypeDataTypeDebitVolumique(TypeDataTypeDebitVolumique object) {
				return createTypeDataTypeDebitVolumiqueAdapter();
			}
			@Override
			public Adapter caseTypeDataTypeDoseAbsorbee(TypeDataTypeDoseAbsorbee object) {
				return createTypeDataTypeDoseAbsorbeeAdapter();
			}
			@Override
			public Adapter caseTypeDataTypeDuree(TypeDataTypeDuree object) {
				return createTypeDataTypeDureeAdapter();
			}
			@Override
			public Adapter caseTypeDataTypeForce(TypeDataTypeForce object) {
				return createTypeDataTypeForceAdapter();
			}
			@Override
			public Adapter caseTypeDataTypeFrequence(TypeDataTypeFrequence object) {
				return createTypeDataTypeFrequenceAdapter();
			}
			@Override
			public Adapter caseTypeDataTypeLatitude(TypeDataTypeLatitude object) {
				return createTypeDataTypeLatitudeAdapter();
			}
			@Override
			public Adapter caseTypeDataTypeLongitude(TypeDataTypeLongitude object) {
				return createTypeDataTypeLongitudeAdapter();
			}
			@Override
			public Adapter caseTypeDataTypeLongueur(TypeDataTypeLongueur object) {
				return createTypeDataTypeLongueurAdapter();
			}
			@Override
			public Adapter caseTypeDataTypeMasse(TypeDataTypeMasse object) {
				return createTypeDataTypeMasseAdapter();
			}
			@Override
			public Adapter caseTypeDataTypePression(TypeDataTypePression object) {
				return createTypeDataTypePressionAdapter();
			}
			@Override
			public Adapter caseTypeDataTypeTauxPrecipitation(TypeDataTypeTauxPrecipitation object) {
				return createTypeDataTypeTauxPrecipitationAdapter();
			}
			@Override
			public Adapter caseTypeDataTypeTemperature(TypeDataTypeTemperature object) {
				return createTypeDataTypeTemperatureAdapter();
			}
			@Override
			public Adapter caseTypeDataTypeVitesseAngulaire(TypeDataTypeVitesseAngulaire object) {
				return createTypeDataTypeVitesseAngulaireAdapter();
			}
			@Override
			public Adapter caseTypeDataTypeVitesseAngulaireOrientee(TypeDataTypeVitesseAngulaireOrientee object) {
				return createTypeDataTypeVitesseAngulaireOrienteeAdapter();
			}
			@Override
			public Adapter caseTypeDataTypeVitesseLineaire(TypeDataTypeVitesseLineaire object) {
				return createTypeDataTypeVitesseLineaireAdapter();
			}
			@Override
			public Adapter caseTypeDataTypeVolume(TypeDataTypeVolume object) {
				return createTypeDataTypeVolumeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link mpia.meta.TypeAssociation <em>Type Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.meta.TypeAssociation
	 * @generated
	 */
	public Adapter createTypeAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.meta.TypeAssociationEXT <em>Type Association EXT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.meta.TypeAssociationEXT
	 * @generated
	 */
	public Adapter createTypeAssociationEXTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.meta.TypeDataTypeAccelerationAngulaire <em>Type Data Type Acceleration Angulaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.meta.TypeDataTypeAccelerationAngulaire
	 * @generated
	 */
	public Adapter createTypeDataTypeAccelerationAngulaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.meta.TypeDataTypeAccelerationAngulaireOrientee <em>Type Data Type Acceleration Angulaire Orientee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.meta.TypeDataTypeAccelerationAngulaireOrientee
	 * @generated
	 */
	public Adapter createTypeDataTypeAccelerationAngulaireOrienteeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.meta.TypeDataTypeAccelerationLineaire <em>Type Data Type Acceleration Lineaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.meta.TypeDataTypeAccelerationLineaire
	 * @generated
	 */
	public Adapter createTypeDataTypeAccelerationLineaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.meta.TypeDataTypeAire <em>Type Data Type Aire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.meta.TypeDataTypeAire
	 * @generated
	 */
	public Adapter createTypeDataTypeAireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.meta.TypeDataTypeAltitudePression <em>Type Data Type Altitude Pression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.meta.TypeDataTypeAltitudePression
	 * @generated
	 */
	public Adapter createTypeDataTypeAltitudePressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.meta.TypeDataTypeAngle <em>Type Data Type Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.meta.TypeDataTypeAngle
	 * @generated
	 */
	public Adapter createTypeDataTypeAngleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.meta.TypeDataTypeAngleSigne <em>Type Data Type Angle Signe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.meta.TypeDataTypeAngleSigne
	 * @generated
	 */
	public Adapter createTypeDataTypeAngleSigneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.meta.TypeDataTypeChampMagnetique <em>Type Data Type Champ Magnetique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.meta.TypeDataTypeChampMagnetique
	 * @generated
	 */
	public Adapter createTypeDataTypeChampMagnetiqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.meta.TypeDataTypeCoordonneeAccelerationLineaire <em>Type Data Type Coordonnee Acceleration Lineaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.meta.TypeDataTypeCoordonneeAccelerationLineaire
	 * @generated
	 */
	public Adapter createTypeDataTypeCoordonneeAccelerationLineaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.meta.TypeDataTypeCoordonneeForce <em>Type Data Type Coordonnee Force</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.meta.TypeDataTypeCoordonneeForce
	 * @generated
	 */
	public Adapter createTypeDataTypeCoordonneeForceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.meta.TypeDataTypeCoordonneeLineaire <em>Type Data Type Coordonnee Lineaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.meta.TypeDataTypeCoordonneeLineaire
	 * @generated
	 */
	public Adapter createTypeDataTypeCoordonneeLineaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.meta.TypeDataTypeCoordonneeVitesseLineaire <em>Type Data Type Coordonnee Vitesse Lineaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.meta.TypeDataTypeCoordonneeVitesseLineaire
	 * @generated
	 */
	public Adapter createTypeDataTypeCoordonneeVitesseLineaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.meta.TypeDataTypeDateHeure <em>Type Data Type Date Heure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.meta.TypeDataTypeDateHeure
	 * @generated
	 */
	public Adapter createTypeDataTypeDateHeureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.meta.TypeDataTypeDebitMassique <em>Type Data Type Debit Massique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.meta.TypeDataTypeDebitMassique
	 * @generated
	 */
	public Adapter createTypeDataTypeDebitMassiqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.meta.TypeDataTypeDebitTransmission <em>Type Data Type Debit Transmission</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.meta.TypeDataTypeDebitTransmission
	 * @generated
	 */
	public Adapter createTypeDataTypeDebitTransmissionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.meta.TypeDataTypeDebitVolumique <em>Type Data Type Debit Volumique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.meta.TypeDataTypeDebitVolumique
	 * @generated
	 */
	public Adapter createTypeDataTypeDebitVolumiqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.meta.TypeDataTypeDoseAbsorbee <em>Type Data Type Dose Absorbee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.meta.TypeDataTypeDoseAbsorbee
	 * @generated
	 */
	public Adapter createTypeDataTypeDoseAbsorbeeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.meta.TypeDataTypeDuree <em>Type Data Type Duree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.meta.TypeDataTypeDuree
	 * @generated
	 */
	public Adapter createTypeDataTypeDureeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.meta.TypeDataTypeForce <em>Type Data Type Force</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.meta.TypeDataTypeForce
	 * @generated
	 */
	public Adapter createTypeDataTypeForceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.meta.TypeDataTypeFrequence <em>Type Data Type Frequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.meta.TypeDataTypeFrequence
	 * @generated
	 */
	public Adapter createTypeDataTypeFrequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.meta.TypeDataTypeLatitude <em>Type Data Type Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.meta.TypeDataTypeLatitude
	 * @generated
	 */
	public Adapter createTypeDataTypeLatitudeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.meta.TypeDataTypeLongitude <em>Type Data Type Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.meta.TypeDataTypeLongitude
	 * @generated
	 */
	public Adapter createTypeDataTypeLongitudeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.meta.TypeDataTypeLongueur <em>Type Data Type Longueur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.meta.TypeDataTypeLongueur
	 * @generated
	 */
	public Adapter createTypeDataTypeLongueurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.meta.TypeDataTypeMasse <em>Type Data Type Masse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.meta.TypeDataTypeMasse
	 * @generated
	 */
	public Adapter createTypeDataTypeMasseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.meta.TypeDataTypePression <em>Type Data Type Pression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.meta.TypeDataTypePression
	 * @generated
	 */
	public Adapter createTypeDataTypePressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.meta.TypeDataTypeTauxPrecipitation <em>Type Data Type Taux Precipitation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.meta.TypeDataTypeTauxPrecipitation
	 * @generated
	 */
	public Adapter createTypeDataTypeTauxPrecipitationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.meta.TypeDataTypeTemperature <em>Type Data Type Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.meta.TypeDataTypeTemperature
	 * @generated
	 */
	public Adapter createTypeDataTypeTemperatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.meta.TypeDataTypeVitesseAngulaire <em>Type Data Type Vitesse Angulaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.meta.TypeDataTypeVitesseAngulaire
	 * @generated
	 */
	public Adapter createTypeDataTypeVitesseAngulaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.meta.TypeDataTypeVitesseAngulaireOrientee <em>Type Data Type Vitesse Angulaire Orientee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.meta.TypeDataTypeVitesseAngulaireOrientee
	 * @generated
	 */
	public Adapter createTypeDataTypeVitesseAngulaireOrienteeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.meta.TypeDataTypeVitesseLineaire <em>Type Data Type Vitesse Lineaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.meta.TypeDataTypeVitesseLineaire
	 * @generated
	 */
	public Adapter createTypeDataTypeVitesseLineaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mpia.meta.TypeDataTypeVolume <em>Type Data Type Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mpia.meta.TypeDataTypeVolume
	 * @generated
	 */
	public Adapter createTypeDataTypeVolumeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MetaAdapterFactory
