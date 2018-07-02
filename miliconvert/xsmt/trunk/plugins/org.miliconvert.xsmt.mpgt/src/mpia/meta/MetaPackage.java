/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.meta;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mpia.meta.MetaFactory
 * @model kind="package"
 * @generated
 */
public interface MetaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "meta";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:XST-meta";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "meta";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetaPackage eINSTANCE = mpia.meta.impl.MetaPackageImpl.init();

	/**
	 * The meta object id for the '{@link mpia.meta.impl.TypeAssociationImpl <em>Type Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpia.meta.impl.TypeAssociationImpl
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeAssociation()
	 * @generated
	 */
	int TYPE_ASSOCIATION = 0;

	/**
	 * The feature id for the '<em><b>Ref CTE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ASSOCIATION__REF_CTE = 0;

	/**
	 * The number of structural features of the '<em>Type Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ASSOCIATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link mpia.meta.impl.TypeAssociationEXTImpl <em>Type Association EXT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpia.meta.impl.TypeAssociationEXTImpl
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeAssociationEXT()
	 * @generated
	 */
	int TYPE_ASSOCIATION_EXT = 1;

	/**
	 * The feature id for the '<em><b>Ref CTE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ASSOCIATION_EXT__REF_CTE = 0;

	/**
	 * The feature id for the '<em><b>Ref EXT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ASSOCIATION_EXT__REF_EXT = 1;

	/**
	 * The number of structural features of the '<em>Type Association EXT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ASSOCIATION_EXT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mpia.meta.impl.TypeDataTypeAccelerationAngulaireImpl <em>Type Data Type Acceleration Angulaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpia.meta.impl.TypeDataTypeAccelerationAngulaireImpl
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeAccelerationAngulaire()
	 * @generated
	 */
	int TYPE_DATA_TYPE_ACCELERATION_ANGULAIRE = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_ACCELERATION_ANGULAIRE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_ACCELERATION_ANGULAIRE__UNITE = 1;

	/**
	 * The number of structural features of the '<em>Type Data Type Acceleration Angulaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_ACCELERATION_ANGULAIRE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mpia.meta.impl.TypeDataTypeAccelerationAngulaireOrienteeImpl <em>Type Data Type Acceleration Angulaire Orientee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpia.meta.impl.TypeDataTypeAccelerationAngulaireOrienteeImpl
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeAccelerationAngulaireOrientee()
	 * @generated
	 */
	int TYPE_DATA_TYPE_ACCELERATION_ANGULAIRE_ORIENTEE = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_ACCELERATION_ANGULAIRE_ORIENTEE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_ACCELERATION_ANGULAIRE_ORIENTEE__UNITE = 1;

	/**
	 * The number of structural features of the '<em>Type Data Type Acceleration Angulaire Orientee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_ACCELERATION_ANGULAIRE_ORIENTEE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mpia.meta.impl.TypeDataTypeAccelerationLineaireImpl <em>Type Data Type Acceleration Lineaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpia.meta.impl.TypeDataTypeAccelerationLineaireImpl
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeAccelerationLineaire()
	 * @generated
	 */
	int TYPE_DATA_TYPE_ACCELERATION_LINEAIRE = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_ACCELERATION_LINEAIRE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_ACCELERATION_LINEAIRE__UNITE = 1;

	/**
	 * The number of structural features of the '<em>Type Data Type Acceleration Lineaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_ACCELERATION_LINEAIRE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mpia.meta.impl.TypeDataTypeAireImpl <em>Type Data Type Aire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpia.meta.impl.TypeDataTypeAireImpl
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeAire()
	 * @generated
	 */
	int TYPE_DATA_TYPE_AIRE = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_AIRE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_AIRE__UNITE = 1;

	/**
	 * The number of structural features of the '<em>Type Data Type Aire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_AIRE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mpia.meta.impl.TypeDataTypeAltitudePressionImpl <em>Type Data Type Altitude Pression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpia.meta.impl.TypeDataTypeAltitudePressionImpl
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeAltitudePression()
	 * @generated
	 */
	int TYPE_DATA_TYPE_ALTITUDE_PRESSION = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_ALTITUDE_PRESSION__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_ALTITUDE_PRESSION__UNITE = 1;

	/**
	 * The number of structural features of the '<em>Type Data Type Altitude Pression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_ALTITUDE_PRESSION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mpia.meta.impl.TypeDataTypeAngleImpl <em>Type Data Type Angle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpia.meta.impl.TypeDataTypeAngleImpl
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeAngle()
	 * @generated
	 */
	int TYPE_DATA_TYPE_ANGLE = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_ANGLE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_ANGLE__UNITE = 1;

	/**
	 * The number of structural features of the '<em>Type Data Type Angle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_ANGLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mpia.meta.impl.TypeDataTypeAngleSigneImpl <em>Type Data Type Angle Signe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpia.meta.impl.TypeDataTypeAngleSigneImpl
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeAngleSigne()
	 * @generated
	 */
	int TYPE_DATA_TYPE_ANGLE_SIGNE = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_ANGLE_SIGNE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_ANGLE_SIGNE__UNITE = 1;

	/**
	 * The number of structural features of the '<em>Type Data Type Angle Signe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_ANGLE_SIGNE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mpia.meta.impl.TypeDataTypeChampMagnetiqueImpl <em>Type Data Type Champ Magnetique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpia.meta.impl.TypeDataTypeChampMagnetiqueImpl
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeChampMagnetique()
	 * @generated
	 */
	int TYPE_DATA_TYPE_CHAMP_MAGNETIQUE = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_CHAMP_MAGNETIQUE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_CHAMP_MAGNETIQUE__UNITE = 1;

	/**
	 * The number of structural features of the '<em>Type Data Type Champ Magnetique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_CHAMP_MAGNETIQUE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mpia.meta.impl.TypeDataTypeCoordonneeAccelerationLineaireImpl <em>Type Data Type Coordonnee Acceleration Lineaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpia.meta.impl.TypeDataTypeCoordonneeAccelerationLineaireImpl
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeCoordonneeAccelerationLineaire()
	 * @generated
	 */
	int TYPE_DATA_TYPE_COORDONNEE_ACCELERATION_LINEAIRE = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_COORDONNEE_ACCELERATION_LINEAIRE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_COORDONNEE_ACCELERATION_LINEAIRE__UNITE = 1;

	/**
	 * The number of structural features of the '<em>Type Data Type Coordonnee Acceleration Lineaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_COORDONNEE_ACCELERATION_LINEAIRE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mpia.meta.impl.TypeDataTypeCoordonneeForceImpl <em>Type Data Type Coordonnee Force</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpia.meta.impl.TypeDataTypeCoordonneeForceImpl
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeCoordonneeForce()
	 * @generated
	 */
	int TYPE_DATA_TYPE_COORDONNEE_FORCE = 11;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_COORDONNEE_FORCE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_COORDONNEE_FORCE__UNITE = 1;

	/**
	 * The number of structural features of the '<em>Type Data Type Coordonnee Force</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_COORDONNEE_FORCE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mpia.meta.impl.TypeDataTypeCoordonneeLineaireImpl <em>Type Data Type Coordonnee Lineaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpia.meta.impl.TypeDataTypeCoordonneeLineaireImpl
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeCoordonneeLineaire()
	 * @generated
	 */
	int TYPE_DATA_TYPE_COORDONNEE_LINEAIRE = 12;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_COORDONNEE_LINEAIRE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_COORDONNEE_LINEAIRE__UNITE = 1;

	/**
	 * The number of structural features of the '<em>Type Data Type Coordonnee Lineaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_COORDONNEE_LINEAIRE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mpia.meta.impl.TypeDataTypeCoordonneeVitesseLineaireImpl <em>Type Data Type Coordonnee Vitesse Lineaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpia.meta.impl.TypeDataTypeCoordonneeVitesseLineaireImpl
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeCoordonneeVitesseLineaire()
	 * @generated
	 */
	int TYPE_DATA_TYPE_COORDONNEE_VITESSE_LINEAIRE = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_COORDONNEE_VITESSE_LINEAIRE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_COORDONNEE_VITESSE_LINEAIRE__UNITE = 1;

	/**
	 * The number of structural features of the '<em>Type Data Type Coordonnee Vitesse Lineaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_COORDONNEE_VITESSE_LINEAIRE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mpia.meta.impl.TypeDataTypeDateHeureImpl <em>Type Data Type Date Heure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpia.meta.impl.TypeDataTypeDateHeureImpl
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeDateHeure()
	 * @generated
	 */
	int TYPE_DATA_TYPE_DATE_HEURE = 14;

	/**
	 * The feature id for the '<em><b>Annee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_DATE_HEURE__ANNEE = 0;

	/**
	 * The feature id for the '<em><b>Annee Mois</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_DATE_HEURE__ANNEE_MOIS = 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_DATE_HEURE__DATE = 2;

	/**
	 * The feature id for the '<em><b>Heure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_DATE_HEURE__HEURE = 3;

	/**
	 * The feature id for the '<em><b>Date Heure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_DATE_HEURE__DATE_HEURE = 4;

	/**
	 * The number of structural features of the '<em>Type Data Type Date Heure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_DATE_HEURE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link mpia.meta.impl.TypeDataTypeDebitMassiqueImpl <em>Type Data Type Debit Massique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpia.meta.impl.TypeDataTypeDebitMassiqueImpl
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeDebitMassique()
	 * @generated
	 */
	int TYPE_DATA_TYPE_DEBIT_MASSIQUE = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_DEBIT_MASSIQUE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_DEBIT_MASSIQUE__UNITE = 1;

	/**
	 * The number of structural features of the '<em>Type Data Type Debit Massique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_DEBIT_MASSIQUE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mpia.meta.impl.TypeDataTypeDebitTransmissionImpl <em>Type Data Type Debit Transmission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpia.meta.impl.TypeDataTypeDebitTransmissionImpl
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeDebitTransmission()
	 * @generated
	 */
	int TYPE_DATA_TYPE_DEBIT_TRANSMISSION = 16;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_DEBIT_TRANSMISSION__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_DEBIT_TRANSMISSION__UNITE = 1;

	/**
	 * The number of structural features of the '<em>Type Data Type Debit Transmission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_DEBIT_TRANSMISSION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mpia.meta.impl.TypeDataTypeDebitVolumiqueImpl <em>Type Data Type Debit Volumique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpia.meta.impl.TypeDataTypeDebitVolumiqueImpl
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeDebitVolumique()
	 * @generated
	 */
	int TYPE_DATA_TYPE_DEBIT_VOLUMIQUE = 17;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_DEBIT_VOLUMIQUE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_DEBIT_VOLUMIQUE__UNITE = 1;

	/**
	 * The number of structural features of the '<em>Type Data Type Debit Volumique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_DEBIT_VOLUMIQUE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mpia.meta.impl.TypeDataTypeDoseAbsorbeeImpl <em>Type Data Type Dose Absorbee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpia.meta.impl.TypeDataTypeDoseAbsorbeeImpl
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeDoseAbsorbee()
	 * @generated
	 */
	int TYPE_DATA_TYPE_DOSE_ABSORBEE = 18;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_DOSE_ABSORBEE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_DOSE_ABSORBEE__UNITE = 1;

	/**
	 * The number of structural features of the '<em>Type Data Type Dose Absorbee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_DOSE_ABSORBEE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mpia.meta.impl.TypeDataTypeDureeImpl <em>Type Data Type Duree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpia.meta.impl.TypeDataTypeDureeImpl
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeDuree()
	 * @generated
	 */
	int TYPE_DATA_TYPE_DUREE = 19;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_DUREE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_DUREE__UNITE = 1;

	/**
	 * The number of structural features of the '<em>Type Data Type Duree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_DUREE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mpia.meta.impl.TypeDataTypeForceImpl <em>Type Data Type Force</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpia.meta.impl.TypeDataTypeForceImpl
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeForce()
	 * @generated
	 */
	int TYPE_DATA_TYPE_FORCE = 20;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_FORCE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_FORCE__UNITE = 1;

	/**
	 * The number of structural features of the '<em>Type Data Type Force</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_FORCE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mpia.meta.impl.TypeDataTypeFrequenceImpl <em>Type Data Type Frequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpia.meta.impl.TypeDataTypeFrequenceImpl
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeFrequence()
	 * @generated
	 */
	int TYPE_DATA_TYPE_FREQUENCE = 21;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_FREQUENCE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_FREQUENCE__UNITE = 1;

	/**
	 * The number of structural features of the '<em>Type Data Type Frequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_FREQUENCE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mpia.meta.impl.TypeDataTypeLatitudeImpl <em>Type Data Type Latitude</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpia.meta.impl.TypeDataTypeLatitudeImpl
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeLatitude()
	 * @generated
	 */
	int TYPE_DATA_TYPE_LATITUDE = 22;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_LATITUDE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_LATITUDE__UNITE = 1;

	/**
	 * The number of structural features of the '<em>Type Data Type Latitude</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_LATITUDE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mpia.meta.impl.TypeDataTypeLongitudeImpl <em>Type Data Type Longitude</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpia.meta.impl.TypeDataTypeLongitudeImpl
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeLongitude()
	 * @generated
	 */
	int TYPE_DATA_TYPE_LONGITUDE = 23;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_LONGITUDE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_LONGITUDE__UNITE = 1;

	/**
	 * The number of structural features of the '<em>Type Data Type Longitude</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_LONGITUDE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mpia.meta.impl.TypeDataTypeLongueurImpl <em>Type Data Type Longueur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpia.meta.impl.TypeDataTypeLongueurImpl
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeLongueur()
	 * @generated
	 */
	int TYPE_DATA_TYPE_LONGUEUR = 24;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_LONGUEUR__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_LONGUEUR__UNITE = 1;

	/**
	 * The number of structural features of the '<em>Type Data Type Longueur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_LONGUEUR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mpia.meta.impl.TypeDataTypeMasseImpl <em>Type Data Type Masse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpia.meta.impl.TypeDataTypeMasseImpl
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeMasse()
	 * @generated
	 */
	int TYPE_DATA_TYPE_MASSE = 25;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_MASSE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_MASSE__UNITE = 1;

	/**
	 * The number of structural features of the '<em>Type Data Type Masse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_MASSE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mpia.meta.impl.TypeDataTypePressionImpl <em>Type Data Type Pression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpia.meta.impl.TypeDataTypePressionImpl
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypePression()
	 * @generated
	 */
	int TYPE_DATA_TYPE_PRESSION = 26;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_PRESSION__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_PRESSION__UNITE = 1;

	/**
	 * The number of structural features of the '<em>Type Data Type Pression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_PRESSION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mpia.meta.impl.TypeDataTypeTauxPrecipitationImpl <em>Type Data Type Taux Precipitation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpia.meta.impl.TypeDataTypeTauxPrecipitationImpl
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeTauxPrecipitation()
	 * @generated
	 */
	int TYPE_DATA_TYPE_TAUX_PRECIPITATION = 27;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_TAUX_PRECIPITATION__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_TAUX_PRECIPITATION__UNITE = 1;

	/**
	 * The number of structural features of the '<em>Type Data Type Taux Precipitation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_TAUX_PRECIPITATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mpia.meta.impl.TypeDataTypeTemperatureImpl <em>Type Data Type Temperature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpia.meta.impl.TypeDataTypeTemperatureImpl
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeTemperature()
	 * @generated
	 */
	int TYPE_DATA_TYPE_TEMPERATURE = 28;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_TEMPERATURE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_TEMPERATURE__UNITE = 1;

	/**
	 * The number of structural features of the '<em>Type Data Type Temperature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_TEMPERATURE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mpia.meta.impl.TypeDataTypeVitesseAngulaireImpl <em>Type Data Type Vitesse Angulaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpia.meta.impl.TypeDataTypeVitesseAngulaireImpl
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeVitesseAngulaire()
	 * @generated
	 */
	int TYPE_DATA_TYPE_VITESSE_ANGULAIRE = 29;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_VITESSE_ANGULAIRE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_VITESSE_ANGULAIRE__UNITE = 1;

	/**
	 * The number of structural features of the '<em>Type Data Type Vitesse Angulaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_VITESSE_ANGULAIRE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mpia.meta.impl.TypeDataTypeVitesseAngulaireOrienteeImpl <em>Type Data Type Vitesse Angulaire Orientee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpia.meta.impl.TypeDataTypeVitesseAngulaireOrienteeImpl
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeVitesseAngulaireOrientee()
	 * @generated
	 */
	int TYPE_DATA_TYPE_VITESSE_ANGULAIRE_ORIENTEE = 30;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_VITESSE_ANGULAIRE_ORIENTEE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_VITESSE_ANGULAIRE_ORIENTEE__UNITE = 1;

	/**
	 * The number of structural features of the '<em>Type Data Type Vitesse Angulaire Orientee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_VITESSE_ANGULAIRE_ORIENTEE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mpia.meta.impl.TypeDataTypeVitesseLineaireImpl <em>Type Data Type Vitesse Lineaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpia.meta.impl.TypeDataTypeVitesseLineaireImpl
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeVitesseLineaire()
	 * @generated
	 */
	int TYPE_DATA_TYPE_VITESSE_LINEAIRE = 31;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_VITESSE_LINEAIRE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_VITESSE_LINEAIRE__UNITE = 1;

	/**
	 * The number of structural features of the '<em>Type Data Type Vitesse Lineaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_VITESSE_LINEAIRE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mpia.meta.impl.TypeDataTypeVolumeImpl <em>Type Data Type Volume</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpia.meta.impl.TypeDataTypeVolumeImpl
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeVolume()
	 * @generated
	 */
	int TYPE_DATA_TYPE_VOLUME = 32;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_VOLUME__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_VOLUME__UNITE = 1;

	/**
	 * The number of structural features of the '<em>Type Data Type Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DATA_TYPE_VOLUME_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mpia.meta.TypeDictionnaryUniteCode <em>Type Dictionnary Unite Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpia.meta.TypeDictionnaryUniteCode
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDictionnaryUniteCode()
	 * @generated
	 */
	int TYPE_DICTIONNARY_UNITE_CODE = 33;

	/**
	 * The meta object id for the '<em>Type Annee</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeAnnee()
	 * @generated
	 */
	int TYPE_ANNEE = 34;

	/**
	 * The meta object id for the '<em>Type Annee Mois</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeAnneeMois()
	 * @generated
	 */
	int TYPE_ANNEE_MOIS = 35;

	/**
	 * The meta object id for the '<em>Type Any URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeAnyURI()
	 * @generated
	 */
	int TYPE_ANY_URI = 36;

	/**
	 * The meta object id for the '<em>Type Boolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeBoolean()
	 * @generated
	 */
	int TYPE_BOOLEAN = 37;

	/**
	 * The meta object id for the '<em>Type Boolean Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeBooleanObject()
	 * @generated
	 */
	int TYPE_BOOLEAN_OBJECT = 38;

	/**
	 * The meta object id for the '<em>Type Data Type Chaine0100</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeChaine0100()
	 * @generated
	 */
	int TYPE_DATA_TYPE_CHAINE0100 = 39;

	/**
	 * The meta object id for the '<em>Type Data Type Chaine012</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeChaine012()
	 * @generated
	 */
	int TYPE_DATA_TYPE_CHAINE012 = 40;

	/**
	 * The meta object id for the '<em>Type Data Type Chaine015</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeChaine015()
	 * @generated
	 */
	int TYPE_DATA_TYPE_CHAINE015 = 41;

	/**
	 * The meta object id for the '<em>Type Data Type Chaine020</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeChaine020()
	 * @generated
	 */
	int TYPE_DATA_TYPE_CHAINE020 = 42;

	/**
	 * The meta object id for the '<em>Type Data Type Chaine02000</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeChaine02000()
	 * @generated
	 */
	int TYPE_DATA_TYPE_CHAINE02000 = 43;

	/**
	 * The meta object id for the '<em>Type Data Type Chaine0255</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeChaine0255()
	 * @generated
	 */
	int TYPE_DATA_TYPE_CHAINE0255 = 44;

	/**
	 * The meta object id for the '<em>Type Data Type Chaine03</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeChaine03()
	 * @generated
	 */
	int TYPE_DATA_TYPE_CHAINE03 = 45;

	/**
	 * The meta object id for the '<em>Type Data Type Chaine030</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeChaine030()
	 * @generated
	 */
	int TYPE_DATA_TYPE_CHAINE030 = 46;

	/**
	 * The meta object id for the '<em>Type Data Type Chaine050</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeChaine050()
	 * @generated
	 */
	int TYPE_DATA_TYPE_CHAINE050 = 47;

	/**
	 * The meta object id for the '<em>Type Data Type Chaine06</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeChaine06()
	 * @generated
	 */
	int TYPE_DATA_TYPE_CHAINE06 = 48;

	/**
	 * The meta object id for the '<em>Type Data Type Chaine08</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeChaine08()
	 * @generated
	 */
	int TYPE_DATA_TYPE_CHAINE08 = 49;

	/**
	 * The meta object id for the '<em>Type Data Type Chaine080</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeChaine080()
	 * @generated
	 */
	int TYPE_DATA_TYPE_CHAINE080 = 50;

	/**
	 * The meta object id for the '<em>Type Data Type Chaine09</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeChaine09()
	 * @generated
	 */
	int TYPE_DATA_TYPE_CHAINE09 = 51;

	/**
	 * The meta object id for the '<em>Type Data Type Entier15</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeEntier15()
	 * @generated
	 */
	int TYPE_DATA_TYPE_ENTIER15 = 52;

	/**
	 * The meta object id for the '<em>Type Data Type Entier15 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Long
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeEntier15Object()
	 * @generated
	 */
	int TYPE_DATA_TYPE_ENTIER15_OBJECT = 53;

	/**
	 * The meta object id for the '<em>Type Data Type Entier3</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeEntier3()
	 * @generated
	 */
	int TYPE_DATA_TYPE_ENTIER3 = 54;

	/**
	 * The meta object id for the '<em>Type Data Type Entier3 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Long
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeEntier3Object()
	 * @generated
	 */
	int TYPE_DATA_TYPE_ENTIER3_OBJECT = 55;

	/**
	 * The meta object id for the '<em>Type Data Type Entier6</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeEntier6()
	 * @generated
	 */
	int TYPE_DATA_TYPE_ENTIER6 = 56;

	/**
	 * The meta object id for the '<em>Type Data Type Entier6 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Long
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeEntier6Object()
	 * @generated
	 */
	int TYPE_DATA_TYPE_ENTIER6_OBJECT = 57;

	/**
	 * The meta object id for the '<em>Type Data Type Entier9</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeEntier9()
	 * @generated
	 */
	int TYPE_DATA_TYPE_ENTIER9 = 58;

	/**
	 * The meta object id for the '<em>Type Data Type Entier9 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Long
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeEntier9Object()
	 * @generated
	 */
	int TYPE_DATA_TYPE_ENTIER9_OBJECT = 59;

	/**
	 * The meta object id for the '<em>Type Data Type Fraction</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeFraction()
	 * @generated
	 */
	int TYPE_DATA_TYPE_FRACTION = 60;

	/**
	 * The meta object id for the '<em>Type Data Type Fraction Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeFractionObject()
	 * @generated
	 */
	int TYPE_DATA_TYPE_FRACTION_OBJECT = 61;

	/**
	 * The meta object id for the '<em>Type Data Type GDH</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeGDH()
	 * @generated
	 */
	int TYPE_DATA_TYPE_GDH = 62;

	/**
	 * The meta object id for the '<em>Type Data Type Ratio</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeRatio()
	 * @generated
	 */
	int TYPE_DATA_TYPE_RATIO = 63;

	/**
	 * The meta object id for the '<em>Type Data Type Ratio Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeRatioObject()
	 * @generated
	 */
	int TYPE_DATA_TYPE_RATIO_OBJECT = 64;

	/**
	 * The meta object id for the '<em>Type Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDate()
	 * @generated
	 */
	int TYPE_DATE = 65;

	/**
	 * The meta object id for the '<em>Type Decimal</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDecimal()
	 * @generated
	 */
	int TYPE_DECIMAL = 66;

	/**
	 * The meta object id for the '<em>Type Dictionnary Unite Code Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpia.meta.TypeDictionnaryUniteCode
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDictionnaryUniteCodeObject()
	 * @generated
	 */
	int TYPE_DICTIONNARY_UNITE_CODE_OBJECT = 67;

	/**
	 * The meta object id for the '<em>Type DTG</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeDTG()
	 * @generated
	 */
	int TYPE_DTG = 68;

	/**
	 * The meta object id for the '<em>Type Heure</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeHeure()
	 * @generated
	 */
	int TYPE_HEURE = 69;

	/**
	 * The meta object id for the '<em>Type Integer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeInteger()
	 * @generated
	 */
	int TYPE_INTEGER = 70;

	/**
	 * The meta object id for the '<em>Type Integer Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Long
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeIntegerObject()
	 * @generated
	 */
	int TYPE_INTEGER_OBJECT = 71;

	/**
	 * The meta object id for the '<em>Type Real</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeReal()
	 * @generated
	 */
	int TYPE_REAL = 72;

	/**
	 * The meta object id for the '<em>Type Real Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeRealObject()
	 * @generated
	 */
	int TYPE_REAL_OBJECT = 73;

	/**
	 * The meta object id for the '<em>Type Reel Positif</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeReelPositif()
	 * @generated
	 */
	int TYPE_REEL_POSITIF = 74;

	/**
	 * The meta object id for the '<em>Type Reel Positif Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeReelPositifObject()
	 * @generated
	 */
	int TYPE_REEL_POSITIF_OBJECT = 75;

	/**
	 * The meta object id for the '<em>Type Restriction Angle</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeRestrictionAngle()
	 * @generated
	 */
	int TYPE_RESTRICTION_ANGLE = 76;

	/**
	 * The meta object id for the '<em>Type Restriction Angle Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeRestrictionAngleObject()
	 * @generated
	 */
	int TYPE_RESTRICTION_ANGLE_OBJECT = 77;

	/**
	 * The meta object id for the '<em>Type Restriction Angle Signe</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeRestrictionAngleSigne()
	 * @generated
	 */
	int TYPE_RESTRICTION_ANGLE_SIGNE = 78;

	/**
	 * The meta object id for the '<em>Type Restriction Angle Signe Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeRestrictionAngleSigneObject()
	 * @generated
	 */
	int TYPE_RESTRICTION_ANGLE_SIGNE_OBJECT = 79;

	/**
	 * The meta object id for the '<em>Type Restriction Latitude</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeRestrictionLatitude()
	 * @generated
	 */
	int TYPE_RESTRICTION_LATITUDE = 80;

	/**
	 * The meta object id for the '<em>Type Restriction Longitude</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeRestrictionLongitude()
	 * @generated
	 */
	int TYPE_RESTRICTION_LONGITUDE = 81;

	/**
	 * The meta object id for the '<em>Type Restriction Temperature</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeRestrictionTemperature()
	 * @generated
	 */
	int TYPE_RESTRICTION_TEMPERATURE = 82;

	/**
	 * The meta object id for the '<em>Type Restriction Temperature Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeRestrictionTemperatureObject()
	 * @generated
	 */
	int TYPE_RESTRICTION_TEMPERATURE_OBJECT = 83;

	/**
	 * The meta object id for the '<em>Type String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see mpia.meta.impl.MetaPackageImpl#getTypeString()
	 * @generated
	 */
	int TYPE_STRING = 84;


	/**
	 * Returns the meta object for class '{@link mpia.meta.TypeAssociation <em>Type Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Association</em>'.
	 * @see mpia.meta.TypeAssociation
	 * @generated
	 */
	EClass getTypeAssociation();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeAssociation#getRefCTE <em>Ref CTE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref CTE</em>'.
	 * @see mpia.meta.TypeAssociation#getRefCTE()
	 * @see #getTypeAssociation()
	 * @generated
	 */
	EAttribute getTypeAssociation_RefCTE();

	/**
	 * Returns the meta object for class '{@link mpia.meta.TypeAssociationEXT <em>Type Association EXT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Association EXT</em>'.
	 * @see mpia.meta.TypeAssociationEXT
	 * @generated
	 */
	EClass getTypeAssociationEXT();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeAssociationEXT#getRefCTE <em>Ref CTE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref CTE</em>'.
	 * @see mpia.meta.TypeAssociationEXT#getRefCTE()
	 * @see #getTypeAssociationEXT()
	 * @generated
	 */
	EAttribute getTypeAssociationEXT_RefCTE();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeAssociationEXT#getRefEXT <em>Ref EXT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref EXT</em>'.
	 * @see mpia.meta.TypeAssociationEXT#getRefEXT()
	 * @see #getTypeAssociationEXT()
	 * @generated
	 */
	EAttribute getTypeAssociationEXT_RefEXT();

	/**
	 * Returns the meta object for class '{@link mpia.meta.TypeDataTypeAccelerationAngulaire <em>Type Data Type Acceleration Angulaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Data Type Acceleration Angulaire</em>'.
	 * @see mpia.meta.TypeDataTypeAccelerationAngulaire
	 * @generated
	 */
	EClass getTypeDataTypeAccelerationAngulaire();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeAccelerationAngulaire#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mpia.meta.TypeDataTypeAccelerationAngulaire#getValue()
	 * @see #getTypeDataTypeAccelerationAngulaire()
	 * @generated
	 */
	EAttribute getTypeDataTypeAccelerationAngulaire_Value();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeAccelerationAngulaire#getUnite <em>Unite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unite</em>'.
	 * @see mpia.meta.TypeDataTypeAccelerationAngulaire#getUnite()
	 * @see #getTypeDataTypeAccelerationAngulaire()
	 * @generated
	 */
	EAttribute getTypeDataTypeAccelerationAngulaire_Unite();

	/**
	 * Returns the meta object for class '{@link mpia.meta.TypeDataTypeAccelerationAngulaireOrientee <em>Type Data Type Acceleration Angulaire Orientee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Data Type Acceleration Angulaire Orientee</em>'.
	 * @see mpia.meta.TypeDataTypeAccelerationAngulaireOrientee
	 * @generated
	 */
	EClass getTypeDataTypeAccelerationAngulaireOrientee();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeAccelerationAngulaireOrientee#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mpia.meta.TypeDataTypeAccelerationAngulaireOrientee#getValue()
	 * @see #getTypeDataTypeAccelerationAngulaireOrientee()
	 * @generated
	 */
	EAttribute getTypeDataTypeAccelerationAngulaireOrientee_Value();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeAccelerationAngulaireOrientee#getUnite <em>Unite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unite</em>'.
	 * @see mpia.meta.TypeDataTypeAccelerationAngulaireOrientee#getUnite()
	 * @see #getTypeDataTypeAccelerationAngulaireOrientee()
	 * @generated
	 */
	EAttribute getTypeDataTypeAccelerationAngulaireOrientee_Unite();

	/**
	 * Returns the meta object for class '{@link mpia.meta.TypeDataTypeAccelerationLineaire <em>Type Data Type Acceleration Lineaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Data Type Acceleration Lineaire</em>'.
	 * @see mpia.meta.TypeDataTypeAccelerationLineaire
	 * @generated
	 */
	EClass getTypeDataTypeAccelerationLineaire();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeAccelerationLineaire#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mpia.meta.TypeDataTypeAccelerationLineaire#getValue()
	 * @see #getTypeDataTypeAccelerationLineaire()
	 * @generated
	 */
	EAttribute getTypeDataTypeAccelerationLineaire_Value();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeAccelerationLineaire#getUnite <em>Unite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unite</em>'.
	 * @see mpia.meta.TypeDataTypeAccelerationLineaire#getUnite()
	 * @see #getTypeDataTypeAccelerationLineaire()
	 * @generated
	 */
	EAttribute getTypeDataTypeAccelerationLineaire_Unite();

	/**
	 * Returns the meta object for class '{@link mpia.meta.TypeDataTypeAire <em>Type Data Type Aire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Data Type Aire</em>'.
	 * @see mpia.meta.TypeDataTypeAire
	 * @generated
	 */
	EClass getTypeDataTypeAire();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeAire#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mpia.meta.TypeDataTypeAire#getValue()
	 * @see #getTypeDataTypeAire()
	 * @generated
	 */
	EAttribute getTypeDataTypeAire_Value();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeAire#getUnite <em>Unite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unite</em>'.
	 * @see mpia.meta.TypeDataTypeAire#getUnite()
	 * @see #getTypeDataTypeAire()
	 * @generated
	 */
	EAttribute getTypeDataTypeAire_Unite();

	/**
	 * Returns the meta object for class '{@link mpia.meta.TypeDataTypeAltitudePression <em>Type Data Type Altitude Pression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Data Type Altitude Pression</em>'.
	 * @see mpia.meta.TypeDataTypeAltitudePression
	 * @generated
	 */
	EClass getTypeDataTypeAltitudePression();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeAltitudePression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mpia.meta.TypeDataTypeAltitudePression#getValue()
	 * @see #getTypeDataTypeAltitudePression()
	 * @generated
	 */
	EAttribute getTypeDataTypeAltitudePression_Value();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeAltitudePression#getUnite <em>Unite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unite</em>'.
	 * @see mpia.meta.TypeDataTypeAltitudePression#getUnite()
	 * @see #getTypeDataTypeAltitudePression()
	 * @generated
	 */
	EAttribute getTypeDataTypeAltitudePression_Unite();

	/**
	 * Returns the meta object for class '{@link mpia.meta.TypeDataTypeAngle <em>Type Data Type Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Data Type Angle</em>'.
	 * @see mpia.meta.TypeDataTypeAngle
	 * @generated
	 */
	EClass getTypeDataTypeAngle();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeAngle#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mpia.meta.TypeDataTypeAngle#getValue()
	 * @see #getTypeDataTypeAngle()
	 * @generated
	 */
	EAttribute getTypeDataTypeAngle_Value();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeAngle#getUnite <em>Unite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unite</em>'.
	 * @see mpia.meta.TypeDataTypeAngle#getUnite()
	 * @see #getTypeDataTypeAngle()
	 * @generated
	 */
	EAttribute getTypeDataTypeAngle_Unite();

	/**
	 * Returns the meta object for class '{@link mpia.meta.TypeDataTypeAngleSigne <em>Type Data Type Angle Signe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Data Type Angle Signe</em>'.
	 * @see mpia.meta.TypeDataTypeAngleSigne
	 * @generated
	 */
	EClass getTypeDataTypeAngleSigne();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeAngleSigne#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mpia.meta.TypeDataTypeAngleSigne#getValue()
	 * @see #getTypeDataTypeAngleSigne()
	 * @generated
	 */
	EAttribute getTypeDataTypeAngleSigne_Value();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeAngleSigne#getUnite <em>Unite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unite</em>'.
	 * @see mpia.meta.TypeDataTypeAngleSigne#getUnite()
	 * @see #getTypeDataTypeAngleSigne()
	 * @generated
	 */
	EAttribute getTypeDataTypeAngleSigne_Unite();

	/**
	 * Returns the meta object for class '{@link mpia.meta.TypeDataTypeChampMagnetique <em>Type Data Type Champ Magnetique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Data Type Champ Magnetique</em>'.
	 * @see mpia.meta.TypeDataTypeChampMagnetique
	 * @generated
	 */
	EClass getTypeDataTypeChampMagnetique();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeChampMagnetique#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mpia.meta.TypeDataTypeChampMagnetique#getValue()
	 * @see #getTypeDataTypeChampMagnetique()
	 * @generated
	 */
	EAttribute getTypeDataTypeChampMagnetique_Value();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeChampMagnetique#getUnite <em>Unite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unite</em>'.
	 * @see mpia.meta.TypeDataTypeChampMagnetique#getUnite()
	 * @see #getTypeDataTypeChampMagnetique()
	 * @generated
	 */
	EAttribute getTypeDataTypeChampMagnetique_Unite();

	/**
	 * Returns the meta object for class '{@link mpia.meta.TypeDataTypeCoordonneeAccelerationLineaire <em>Type Data Type Coordonnee Acceleration Lineaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Data Type Coordonnee Acceleration Lineaire</em>'.
	 * @see mpia.meta.TypeDataTypeCoordonneeAccelerationLineaire
	 * @generated
	 */
	EClass getTypeDataTypeCoordonneeAccelerationLineaire();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeCoordonneeAccelerationLineaire#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mpia.meta.TypeDataTypeCoordonneeAccelerationLineaire#getValue()
	 * @see #getTypeDataTypeCoordonneeAccelerationLineaire()
	 * @generated
	 */
	EAttribute getTypeDataTypeCoordonneeAccelerationLineaire_Value();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeCoordonneeAccelerationLineaire#getUnite <em>Unite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unite</em>'.
	 * @see mpia.meta.TypeDataTypeCoordonneeAccelerationLineaire#getUnite()
	 * @see #getTypeDataTypeCoordonneeAccelerationLineaire()
	 * @generated
	 */
	EAttribute getTypeDataTypeCoordonneeAccelerationLineaire_Unite();

	/**
	 * Returns the meta object for class '{@link mpia.meta.TypeDataTypeCoordonneeForce <em>Type Data Type Coordonnee Force</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Data Type Coordonnee Force</em>'.
	 * @see mpia.meta.TypeDataTypeCoordonneeForce
	 * @generated
	 */
	EClass getTypeDataTypeCoordonneeForce();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeCoordonneeForce#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mpia.meta.TypeDataTypeCoordonneeForce#getValue()
	 * @see #getTypeDataTypeCoordonneeForce()
	 * @generated
	 */
	EAttribute getTypeDataTypeCoordonneeForce_Value();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeCoordonneeForce#getUnite <em>Unite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unite</em>'.
	 * @see mpia.meta.TypeDataTypeCoordonneeForce#getUnite()
	 * @see #getTypeDataTypeCoordonneeForce()
	 * @generated
	 */
	EAttribute getTypeDataTypeCoordonneeForce_Unite();

	/**
	 * Returns the meta object for class '{@link mpia.meta.TypeDataTypeCoordonneeLineaire <em>Type Data Type Coordonnee Lineaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Data Type Coordonnee Lineaire</em>'.
	 * @see mpia.meta.TypeDataTypeCoordonneeLineaire
	 * @generated
	 */
	EClass getTypeDataTypeCoordonneeLineaire();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeCoordonneeLineaire#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mpia.meta.TypeDataTypeCoordonneeLineaire#getValue()
	 * @see #getTypeDataTypeCoordonneeLineaire()
	 * @generated
	 */
	EAttribute getTypeDataTypeCoordonneeLineaire_Value();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeCoordonneeLineaire#getUnite <em>Unite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unite</em>'.
	 * @see mpia.meta.TypeDataTypeCoordonneeLineaire#getUnite()
	 * @see #getTypeDataTypeCoordonneeLineaire()
	 * @generated
	 */
	EAttribute getTypeDataTypeCoordonneeLineaire_Unite();

	/**
	 * Returns the meta object for class '{@link mpia.meta.TypeDataTypeCoordonneeVitesseLineaire <em>Type Data Type Coordonnee Vitesse Lineaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Data Type Coordonnee Vitesse Lineaire</em>'.
	 * @see mpia.meta.TypeDataTypeCoordonneeVitesseLineaire
	 * @generated
	 */
	EClass getTypeDataTypeCoordonneeVitesseLineaire();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeCoordonneeVitesseLineaire#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mpia.meta.TypeDataTypeCoordonneeVitesseLineaire#getValue()
	 * @see #getTypeDataTypeCoordonneeVitesseLineaire()
	 * @generated
	 */
	EAttribute getTypeDataTypeCoordonneeVitesseLineaire_Value();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeCoordonneeVitesseLineaire#getUnite <em>Unite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unite</em>'.
	 * @see mpia.meta.TypeDataTypeCoordonneeVitesseLineaire#getUnite()
	 * @see #getTypeDataTypeCoordonneeVitesseLineaire()
	 * @generated
	 */
	EAttribute getTypeDataTypeCoordonneeVitesseLineaire_Unite();

	/**
	 * Returns the meta object for class '{@link mpia.meta.TypeDataTypeDateHeure <em>Type Data Type Date Heure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Data Type Date Heure</em>'.
	 * @see mpia.meta.TypeDataTypeDateHeure
	 * @generated
	 */
	EClass getTypeDataTypeDateHeure();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeDateHeure#getAnnee <em>Annee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annee</em>'.
	 * @see mpia.meta.TypeDataTypeDateHeure#getAnnee()
	 * @see #getTypeDataTypeDateHeure()
	 * @generated
	 */
	EAttribute getTypeDataTypeDateHeure_Annee();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeDateHeure#getAnneeMois <em>Annee Mois</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annee Mois</em>'.
	 * @see mpia.meta.TypeDataTypeDateHeure#getAnneeMois()
	 * @see #getTypeDataTypeDateHeure()
	 * @generated
	 */
	EAttribute getTypeDataTypeDateHeure_AnneeMois();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeDateHeure#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see mpia.meta.TypeDataTypeDateHeure#getDate()
	 * @see #getTypeDataTypeDateHeure()
	 * @generated
	 */
	EAttribute getTypeDataTypeDateHeure_Date();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeDateHeure#getHeure <em>Heure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heure</em>'.
	 * @see mpia.meta.TypeDataTypeDateHeure#getHeure()
	 * @see #getTypeDataTypeDateHeure()
	 * @generated
	 */
	EAttribute getTypeDataTypeDateHeure_Heure();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeDateHeure#getDateHeure <em>Date Heure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Heure</em>'.
	 * @see mpia.meta.TypeDataTypeDateHeure#getDateHeure()
	 * @see #getTypeDataTypeDateHeure()
	 * @generated
	 */
	EAttribute getTypeDataTypeDateHeure_DateHeure();

	/**
	 * Returns the meta object for class '{@link mpia.meta.TypeDataTypeDebitMassique <em>Type Data Type Debit Massique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Data Type Debit Massique</em>'.
	 * @see mpia.meta.TypeDataTypeDebitMassique
	 * @generated
	 */
	EClass getTypeDataTypeDebitMassique();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeDebitMassique#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mpia.meta.TypeDataTypeDebitMassique#getValue()
	 * @see #getTypeDataTypeDebitMassique()
	 * @generated
	 */
	EAttribute getTypeDataTypeDebitMassique_Value();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeDebitMassique#getUnite <em>Unite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unite</em>'.
	 * @see mpia.meta.TypeDataTypeDebitMassique#getUnite()
	 * @see #getTypeDataTypeDebitMassique()
	 * @generated
	 */
	EAttribute getTypeDataTypeDebitMassique_Unite();

	/**
	 * Returns the meta object for class '{@link mpia.meta.TypeDataTypeDebitTransmission <em>Type Data Type Debit Transmission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Data Type Debit Transmission</em>'.
	 * @see mpia.meta.TypeDataTypeDebitTransmission
	 * @generated
	 */
	EClass getTypeDataTypeDebitTransmission();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeDebitTransmission#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mpia.meta.TypeDataTypeDebitTransmission#getValue()
	 * @see #getTypeDataTypeDebitTransmission()
	 * @generated
	 */
	EAttribute getTypeDataTypeDebitTransmission_Value();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeDebitTransmission#getUnite <em>Unite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unite</em>'.
	 * @see mpia.meta.TypeDataTypeDebitTransmission#getUnite()
	 * @see #getTypeDataTypeDebitTransmission()
	 * @generated
	 */
	EAttribute getTypeDataTypeDebitTransmission_Unite();

	/**
	 * Returns the meta object for class '{@link mpia.meta.TypeDataTypeDebitVolumique <em>Type Data Type Debit Volumique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Data Type Debit Volumique</em>'.
	 * @see mpia.meta.TypeDataTypeDebitVolumique
	 * @generated
	 */
	EClass getTypeDataTypeDebitVolumique();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeDebitVolumique#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mpia.meta.TypeDataTypeDebitVolumique#getValue()
	 * @see #getTypeDataTypeDebitVolumique()
	 * @generated
	 */
	EAttribute getTypeDataTypeDebitVolumique_Value();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeDebitVolumique#getUnite <em>Unite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unite</em>'.
	 * @see mpia.meta.TypeDataTypeDebitVolumique#getUnite()
	 * @see #getTypeDataTypeDebitVolumique()
	 * @generated
	 */
	EAttribute getTypeDataTypeDebitVolumique_Unite();

	/**
	 * Returns the meta object for class '{@link mpia.meta.TypeDataTypeDoseAbsorbee <em>Type Data Type Dose Absorbee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Data Type Dose Absorbee</em>'.
	 * @see mpia.meta.TypeDataTypeDoseAbsorbee
	 * @generated
	 */
	EClass getTypeDataTypeDoseAbsorbee();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeDoseAbsorbee#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mpia.meta.TypeDataTypeDoseAbsorbee#getValue()
	 * @see #getTypeDataTypeDoseAbsorbee()
	 * @generated
	 */
	EAttribute getTypeDataTypeDoseAbsorbee_Value();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeDoseAbsorbee#getUnite <em>Unite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unite</em>'.
	 * @see mpia.meta.TypeDataTypeDoseAbsorbee#getUnite()
	 * @see #getTypeDataTypeDoseAbsorbee()
	 * @generated
	 */
	EAttribute getTypeDataTypeDoseAbsorbee_Unite();

	/**
	 * Returns the meta object for class '{@link mpia.meta.TypeDataTypeDuree <em>Type Data Type Duree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Data Type Duree</em>'.
	 * @see mpia.meta.TypeDataTypeDuree
	 * @generated
	 */
	EClass getTypeDataTypeDuree();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeDuree#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mpia.meta.TypeDataTypeDuree#getValue()
	 * @see #getTypeDataTypeDuree()
	 * @generated
	 */
	EAttribute getTypeDataTypeDuree_Value();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeDuree#getUnite <em>Unite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unite</em>'.
	 * @see mpia.meta.TypeDataTypeDuree#getUnite()
	 * @see #getTypeDataTypeDuree()
	 * @generated
	 */
	EAttribute getTypeDataTypeDuree_Unite();

	/**
	 * Returns the meta object for class '{@link mpia.meta.TypeDataTypeForce <em>Type Data Type Force</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Data Type Force</em>'.
	 * @see mpia.meta.TypeDataTypeForce
	 * @generated
	 */
	EClass getTypeDataTypeForce();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeForce#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mpia.meta.TypeDataTypeForce#getValue()
	 * @see #getTypeDataTypeForce()
	 * @generated
	 */
	EAttribute getTypeDataTypeForce_Value();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeForce#getUnite <em>Unite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unite</em>'.
	 * @see mpia.meta.TypeDataTypeForce#getUnite()
	 * @see #getTypeDataTypeForce()
	 * @generated
	 */
	EAttribute getTypeDataTypeForce_Unite();

	/**
	 * Returns the meta object for class '{@link mpia.meta.TypeDataTypeFrequence <em>Type Data Type Frequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Data Type Frequence</em>'.
	 * @see mpia.meta.TypeDataTypeFrequence
	 * @generated
	 */
	EClass getTypeDataTypeFrequence();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeFrequence#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mpia.meta.TypeDataTypeFrequence#getValue()
	 * @see #getTypeDataTypeFrequence()
	 * @generated
	 */
	EAttribute getTypeDataTypeFrequence_Value();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeFrequence#getUnite <em>Unite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unite</em>'.
	 * @see mpia.meta.TypeDataTypeFrequence#getUnite()
	 * @see #getTypeDataTypeFrequence()
	 * @generated
	 */
	EAttribute getTypeDataTypeFrequence_Unite();

	/**
	 * Returns the meta object for class '{@link mpia.meta.TypeDataTypeLatitude <em>Type Data Type Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Data Type Latitude</em>'.
	 * @see mpia.meta.TypeDataTypeLatitude
	 * @generated
	 */
	EClass getTypeDataTypeLatitude();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeLatitude#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mpia.meta.TypeDataTypeLatitude#getValue()
	 * @see #getTypeDataTypeLatitude()
	 * @generated
	 */
	EAttribute getTypeDataTypeLatitude_Value();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeLatitude#getUnite <em>Unite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unite</em>'.
	 * @see mpia.meta.TypeDataTypeLatitude#getUnite()
	 * @see #getTypeDataTypeLatitude()
	 * @generated
	 */
	EAttribute getTypeDataTypeLatitude_Unite();

	/**
	 * Returns the meta object for class '{@link mpia.meta.TypeDataTypeLongitude <em>Type Data Type Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Data Type Longitude</em>'.
	 * @see mpia.meta.TypeDataTypeLongitude
	 * @generated
	 */
	EClass getTypeDataTypeLongitude();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeLongitude#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mpia.meta.TypeDataTypeLongitude#getValue()
	 * @see #getTypeDataTypeLongitude()
	 * @generated
	 */
	EAttribute getTypeDataTypeLongitude_Value();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeLongitude#getUnite <em>Unite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unite</em>'.
	 * @see mpia.meta.TypeDataTypeLongitude#getUnite()
	 * @see #getTypeDataTypeLongitude()
	 * @generated
	 */
	EAttribute getTypeDataTypeLongitude_Unite();

	/**
	 * Returns the meta object for class '{@link mpia.meta.TypeDataTypeLongueur <em>Type Data Type Longueur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Data Type Longueur</em>'.
	 * @see mpia.meta.TypeDataTypeLongueur
	 * @generated
	 */
	EClass getTypeDataTypeLongueur();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeLongueur#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mpia.meta.TypeDataTypeLongueur#getValue()
	 * @see #getTypeDataTypeLongueur()
	 * @generated
	 */
	EAttribute getTypeDataTypeLongueur_Value();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeLongueur#getUnite <em>Unite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unite</em>'.
	 * @see mpia.meta.TypeDataTypeLongueur#getUnite()
	 * @see #getTypeDataTypeLongueur()
	 * @generated
	 */
	EAttribute getTypeDataTypeLongueur_Unite();

	/**
	 * Returns the meta object for class '{@link mpia.meta.TypeDataTypeMasse <em>Type Data Type Masse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Data Type Masse</em>'.
	 * @see mpia.meta.TypeDataTypeMasse
	 * @generated
	 */
	EClass getTypeDataTypeMasse();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeMasse#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mpia.meta.TypeDataTypeMasse#getValue()
	 * @see #getTypeDataTypeMasse()
	 * @generated
	 */
	EAttribute getTypeDataTypeMasse_Value();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeMasse#getUnite <em>Unite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unite</em>'.
	 * @see mpia.meta.TypeDataTypeMasse#getUnite()
	 * @see #getTypeDataTypeMasse()
	 * @generated
	 */
	EAttribute getTypeDataTypeMasse_Unite();

	/**
	 * Returns the meta object for class '{@link mpia.meta.TypeDataTypePression <em>Type Data Type Pression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Data Type Pression</em>'.
	 * @see mpia.meta.TypeDataTypePression
	 * @generated
	 */
	EClass getTypeDataTypePression();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypePression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mpia.meta.TypeDataTypePression#getValue()
	 * @see #getTypeDataTypePression()
	 * @generated
	 */
	EAttribute getTypeDataTypePression_Value();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypePression#getUnite <em>Unite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unite</em>'.
	 * @see mpia.meta.TypeDataTypePression#getUnite()
	 * @see #getTypeDataTypePression()
	 * @generated
	 */
	EAttribute getTypeDataTypePression_Unite();

	/**
	 * Returns the meta object for class '{@link mpia.meta.TypeDataTypeTauxPrecipitation <em>Type Data Type Taux Precipitation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Data Type Taux Precipitation</em>'.
	 * @see mpia.meta.TypeDataTypeTauxPrecipitation
	 * @generated
	 */
	EClass getTypeDataTypeTauxPrecipitation();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeTauxPrecipitation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mpia.meta.TypeDataTypeTauxPrecipitation#getValue()
	 * @see #getTypeDataTypeTauxPrecipitation()
	 * @generated
	 */
	EAttribute getTypeDataTypeTauxPrecipitation_Value();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeTauxPrecipitation#getUnite <em>Unite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unite</em>'.
	 * @see mpia.meta.TypeDataTypeTauxPrecipitation#getUnite()
	 * @see #getTypeDataTypeTauxPrecipitation()
	 * @generated
	 */
	EAttribute getTypeDataTypeTauxPrecipitation_Unite();

	/**
	 * Returns the meta object for class '{@link mpia.meta.TypeDataTypeTemperature <em>Type Data Type Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Data Type Temperature</em>'.
	 * @see mpia.meta.TypeDataTypeTemperature
	 * @generated
	 */
	EClass getTypeDataTypeTemperature();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeTemperature#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mpia.meta.TypeDataTypeTemperature#getValue()
	 * @see #getTypeDataTypeTemperature()
	 * @generated
	 */
	EAttribute getTypeDataTypeTemperature_Value();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeTemperature#getUnite <em>Unite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unite</em>'.
	 * @see mpia.meta.TypeDataTypeTemperature#getUnite()
	 * @see #getTypeDataTypeTemperature()
	 * @generated
	 */
	EAttribute getTypeDataTypeTemperature_Unite();

	/**
	 * Returns the meta object for class '{@link mpia.meta.TypeDataTypeVitesseAngulaire <em>Type Data Type Vitesse Angulaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Data Type Vitesse Angulaire</em>'.
	 * @see mpia.meta.TypeDataTypeVitesseAngulaire
	 * @generated
	 */
	EClass getTypeDataTypeVitesseAngulaire();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeVitesseAngulaire#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mpia.meta.TypeDataTypeVitesseAngulaire#getValue()
	 * @see #getTypeDataTypeVitesseAngulaire()
	 * @generated
	 */
	EAttribute getTypeDataTypeVitesseAngulaire_Value();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeVitesseAngulaire#getUnite <em>Unite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unite</em>'.
	 * @see mpia.meta.TypeDataTypeVitesseAngulaire#getUnite()
	 * @see #getTypeDataTypeVitesseAngulaire()
	 * @generated
	 */
	EAttribute getTypeDataTypeVitesseAngulaire_Unite();

	/**
	 * Returns the meta object for class '{@link mpia.meta.TypeDataTypeVitesseAngulaireOrientee <em>Type Data Type Vitesse Angulaire Orientee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Data Type Vitesse Angulaire Orientee</em>'.
	 * @see mpia.meta.TypeDataTypeVitesseAngulaireOrientee
	 * @generated
	 */
	EClass getTypeDataTypeVitesseAngulaireOrientee();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeVitesseAngulaireOrientee#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mpia.meta.TypeDataTypeVitesseAngulaireOrientee#getValue()
	 * @see #getTypeDataTypeVitesseAngulaireOrientee()
	 * @generated
	 */
	EAttribute getTypeDataTypeVitesseAngulaireOrientee_Value();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeVitesseAngulaireOrientee#getUnite <em>Unite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unite</em>'.
	 * @see mpia.meta.TypeDataTypeVitesseAngulaireOrientee#getUnite()
	 * @see #getTypeDataTypeVitesseAngulaireOrientee()
	 * @generated
	 */
	EAttribute getTypeDataTypeVitesseAngulaireOrientee_Unite();

	/**
	 * Returns the meta object for class '{@link mpia.meta.TypeDataTypeVitesseLineaire <em>Type Data Type Vitesse Lineaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Data Type Vitesse Lineaire</em>'.
	 * @see mpia.meta.TypeDataTypeVitesseLineaire
	 * @generated
	 */
	EClass getTypeDataTypeVitesseLineaire();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeVitesseLineaire#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mpia.meta.TypeDataTypeVitesseLineaire#getValue()
	 * @see #getTypeDataTypeVitesseLineaire()
	 * @generated
	 */
	EAttribute getTypeDataTypeVitesseLineaire_Value();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeVitesseLineaire#getUnite <em>Unite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unite</em>'.
	 * @see mpia.meta.TypeDataTypeVitesseLineaire#getUnite()
	 * @see #getTypeDataTypeVitesseLineaire()
	 * @generated
	 */
	EAttribute getTypeDataTypeVitesseLineaire_Unite();

	/**
	 * Returns the meta object for class '{@link mpia.meta.TypeDataTypeVolume <em>Type Data Type Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Data Type Volume</em>'.
	 * @see mpia.meta.TypeDataTypeVolume
	 * @generated
	 */
	EClass getTypeDataTypeVolume();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeVolume#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mpia.meta.TypeDataTypeVolume#getValue()
	 * @see #getTypeDataTypeVolume()
	 * @generated
	 */
	EAttribute getTypeDataTypeVolume_Value();

	/**
	 * Returns the meta object for the attribute '{@link mpia.meta.TypeDataTypeVolume#getUnite <em>Unite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unite</em>'.
	 * @see mpia.meta.TypeDataTypeVolume#getUnite()
	 * @see #getTypeDataTypeVolume()
	 * @generated
	 */
	EAttribute getTypeDataTypeVolume_Unite();

	/**
	 * Returns the meta object for enum '{@link mpia.meta.TypeDictionnaryUniteCode <em>Type Dictionnary Unite Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Dictionnary Unite Code</em>'.
	 * @see mpia.meta.TypeDictionnaryUniteCode
	 * @generated
	 */
	EEnum getTypeDictionnaryUniteCode();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Type Annee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Annee</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='typeAnnee' baseType='http://www.eclipse.org/emf/2003/XMLType#gYear'"
	 * @generated
	 */
	EDataType getTypeAnnee();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Type Annee Mois</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Annee Mois</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='typeAnneeMois' baseType='http://www.eclipse.org/emf/2003/XMLType#gYearMonth'"
	 * @generated
	 */
	EDataType getTypeAnneeMois();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Type Any URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Any URI</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='typeAnyURI' baseType='http://www.eclipse.org/emf/2003/XMLType#anyURI'"
	 * @generated
	 */
	EDataType getTypeAnyURI();

	/**
	 * Returns the meta object for data type '<em>Type Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Boolean</em>'.
	 * @model instanceClass="boolean"
	 *        extendedMetaData="name='typeBoolean' baseType='http://www.eclipse.org/emf/2003/XMLType#boolean'"
	 * @generated
	 */
	EDataType getTypeBoolean();

	/**
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>Type Boolean Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Boolean Object</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
	 *        extendedMetaData="name='typeBoolean:Object' baseType='typeBoolean'"
	 * @generated
	 */
	EDataType getTypeBooleanObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Type Data Type Chaine0100</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Data Type Chaine0100</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='typeDataTypeChaine0100' baseType='typeString' minLength='1' maxLength='100'"
	 * @generated
	 */
	EDataType getTypeDataTypeChaine0100();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Type Data Type Chaine012</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Data Type Chaine012</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='typeDataTypeChaine012' baseType='typeString' minLength='1' maxLength='12'"
	 * @generated
	 */
	EDataType getTypeDataTypeChaine012();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Type Data Type Chaine015</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Data Type Chaine015</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='typeDataTypeChaine015' baseType='typeString' minLength='1' maxLength='15'"
	 * @generated
	 */
	EDataType getTypeDataTypeChaine015();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Type Data Type Chaine020</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Data Type Chaine020</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='typeDataTypeChaine020' baseType='typeString' minLength='1' maxLength='20'"
	 * @generated
	 */
	EDataType getTypeDataTypeChaine020();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Type Data Type Chaine02000</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Data Type Chaine02000</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='typeDataTypeChaine02000' baseType='typeString' minLength='1' maxLength='2000'"
	 * @generated
	 */
	EDataType getTypeDataTypeChaine02000();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Type Data Type Chaine0255</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Data Type Chaine0255</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='typeDataTypeChaine0255' baseType='typeString' minLength='1' maxLength='255'"
	 * @generated
	 */
	EDataType getTypeDataTypeChaine0255();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Type Data Type Chaine03</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Data Type Chaine03</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='typeDataTypeChaine03' baseType='typeString' minLength='1' maxLength='3'"
	 * @generated
	 */
	EDataType getTypeDataTypeChaine03();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Type Data Type Chaine030</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Data Type Chaine030</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='typeDataTypeChaine030' baseType='typeString' minLength='1' maxLength='30'"
	 * @generated
	 */
	EDataType getTypeDataTypeChaine030();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Type Data Type Chaine050</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Data Type Chaine050</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='typeDataTypeChaine050' baseType='typeString' minLength='1' maxLength='50'"
	 * @generated
	 */
	EDataType getTypeDataTypeChaine050();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Type Data Type Chaine06</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Data Type Chaine06</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='typeDataTypeChaine06' baseType='typeString' minLength='1' maxLength='6'"
	 * @generated
	 */
	EDataType getTypeDataTypeChaine06();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Type Data Type Chaine08</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Data Type Chaine08</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='typeDataTypeChaine08' baseType='typeString' minLength='1' maxLength='8'"
	 * @generated
	 */
	EDataType getTypeDataTypeChaine08();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Type Data Type Chaine080</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Data Type Chaine080</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='typeDataTypeChaine080' baseType='typeString' minLength='1' maxLength='80'"
	 * @generated
	 */
	EDataType getTypeDataTypeChaine080();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Type Data Type Chaine09</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Data Type Chaine09</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='typeDataTypeChaine09' baseType='typeString' minLength='1' maxLength='9'"
	 * @generated
	 */
	EDataType getTypeDataTypeChaine09();

	/**
	 * Returns the meta object for data type '<em>Type Data Type Entier15</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Data Type Entier15</em>'.
	 * @model instanceClass="long"
	 *        extendedMetaData="name='typeDataTypeEntier15' baseType='typeInteger' totalDigits='15' minInclusive='0' maxInclusive='999999999999999'"
	 * @generated
	 */
	EDataType getTypeDataTypeEntier15();

	/**
	 * Returns the meta object for data type '{@link java.lang.Long <em>Type Data Type Entier15 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Data Type Entier15 Object</em>'.
	 * @see java.lang.Long
	 * @model instanceClass="java.lang.Long"
	 *        extendedMetaData="name='typeDataTypeEntier15:Object' baseType='typeDataTypeEntier15'"
	 * @generated
	 */
	EDataType getTypeDataTypeEntier15Object();

	/**
	 * Returns the meta object for data type '<em>Type Data Type Entier3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Data Type Entier3</em>'.
	 * @model instanceClass="long"
	 *        extendedMetaData="name='typeDataTypeEntier3' baseType='typeInteger' totalDigits='3' minInclusive='0' maxInclusive='999'"
	 * @generated
	 */
	EDataType getTypeDataTypeEntier3();

	/**
	 * Returns the meta object for data type '{@link java.lang.Long <em>Type Data Type Entier3 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Data Type Entier3 Object</em>'.
	 * @see java.lang.Long
	 * @model instanceClass="java.lang.Long"
	 *        extendedMetaData="name='typeDataTypeEntier3:Object' baseType='typeDataTypeEntier3'"
	 * @generated
	 */
	EDataType getTypeDataTypeEntier3Object();

	/**
	 * Returns the meta object for data type '<em>Type Data Type Entier6</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Data Type Entier6</em>'.
	 * @model instanceClass="long"
	 *        extendedMetaData="name='typeDataTypeEntier6' baseType='typeInteger' totalDigits='6' minInclusive='0' maxInclusive='999999'"
	 * @generated
	 */
	EDataType getTypeDataTypeEntier6();

	/**
	 * Returns the meta object for data type '{@link java.lang.Long <em>Type Data Type Entier6 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Data Type Entier6 Object</em>'.
	 * @see java.lang.Long
	 * @model instanceClass="java.lang.Long"
	 *        extendedMetaData="name='typeDataTypeEntier6:Object' baseType='typeDataTypeEntier6'"
	 * @generated
	 */
	EDataType getTypeDataTypeEntier6Object();

	/**
	 * Returns the meta object for data type '<em>Type Data Type Entier9</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Data Type Entier9</em>'.
	 * @model instanceClass="long"
	 *        extendedMetaData="name='typeDataTypeEntier9' baseType='typeInteger' totalDigits='9' minInclusive='0' maxInclusive='999999999'"
	 * @generated
	 */
	EDataType getTypeDataTypeEntier9();

	/**
	 * Returns the meta object for data type '{@link java.lang.Long <em>Type Data Type Entier9 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Data Type Entier9 Object</em>'.
	 * @see java.lang.Long
	 * @model instanceClass="java.lang.Long"
	 *        extendedMetaData="name='typeDataTypeEntier9:Object' baseType='typeDataTypeEntier9'"
	 * @generated
	 */
	EDataType getTypeDataTypeEntier9Object();

	/**
	 * Returns the meta object for data type '<em>Type Data Type Fraction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Data Type Fraction</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='typeDataTypeFraction' baseType='typeReal' minInclusive='0' maxInclusive='1'"
	 * @generated
	 */
	EDataType getTypeDataTypeFraction();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Type Data Type Fraction Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Data Type Fraction Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='typeDataTypeFraction:Object' baseType='typeDataTypeFraction'"
	 * @generated
	 */
	EDataType getTypeDataTypeFractionObject();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Type Data Type GDH</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Data Type GDH</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='typeDataTypeGDH' baseType='typeDTG' minInclusive='1901-01-01T00:00:00' maxInclusive='2036-12-31T23:59:59'"
	 * @generated
	 */
	EDataType getTypeDataTypeGDH();

	/**
	 * Returns the meta object for data type '<em>Type Data Type Ratio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Data Type Ratio</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='typeDataTypeRatio' baseType='typeReal' minInclusive='0'"
	 * @generated
	 */
	EDataType getTypeDataTypeRatio();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Type Data Type Ratio Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Data Type Ratio Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='typeDataTypeRatio:Object' baseType='typeDataTypeRatio'"
	 * @generated
	 */
	EDataType getTypeDataTypeRatioObject();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Type Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Date</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='typeDate' baseType='http://www.eclipse.org/emf/2003/XMLType#date'"
	 * @generated
	 */
	EDataType getTypeDate();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Type Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Decimal</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='typeDecimal' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal'"
	 * @generated
	 */
	EDataType getTypeDecimal();

	/**
	 * Returns the meta object for data type '{@link mpia.meta.TypeDictionnaryUniteCode <em>Type Dictionnary Unite Code Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Dictionnary Unite Code Object</em>'.
	 * @see mpia.meta.TypeDictionnaryUniteCode
	 * @model instanceClass="mpia.meta.TypeDictionnaryUniteCode"
	 *        extendedMetaData="name='typeDictionnaryUniteCode:Object' baseType='typeDictionnaryUniteCode'"
	 * @generated
	 */
	EDataType getTypeDictionnaryUniteCodeObject();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Type DTG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type DTG</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='typeDTG' baseType='http://www.eclipse.org/emf/2003/XMLType#dateTime'"
	 * @generated
	 */
	EDataType getTypeDTG();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Type Heure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Heure</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='typeHeure' baseType='http://www.eclipse.org/emf/2003/XMLType#time'"
	 * @generated
	 */
	EDataType getTypeHeure();

	/**
	 * Returns the meta object for data type '<em>Type Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Integer</em>'.
	 * @model instanceClass="long"
	 *        extendedMetaData="name='typeInteger' baseType='http://www.eclipse.org/emf/2003/XMLType#long'"
	 * @generated
	 */
	EDataType getTypeInteger();

	/**
	 * Returns the meta object for data type '{@link java.lang.Long <em>Type Integer Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Integer Object</em>'.
	 * @see java.lang.Long
	 * @model instanceClass="java.lang.Long"
	 *        extendedMetaData="name='typeInteger:Object' baseType='typeInteger'"
	 * @generated
	 */
	EDataType getTypeIntegerObject();

	/**
	 * Returns the meta object for data type '<em>Type Real</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Real</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='typeReal' baseType='http://www.eclipse.org/emf/2003/XMLType#double'"
	 * @generated
	 */
	EDataType getTypeReal();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Type Real Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Real Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='typeReal:Object' baseType='typeReal'"
	 * @generated
	 */
	EDataType getTypeRealObject();

	/**
	 * Returns the meta object for data type '<em>Type Reel Positif</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Reel Positif</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='typeReelPositif' baseType='typeReal' minInclusive='0'"
	 * @generated
	 */
	EDataType getTypeReelPositif();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Type Reel Positif Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Reel Positif Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='typeReelPositif:Object' baseType='typeReelPositif'"
	 * @generated
	 */
	EDataType getTypeReelPositifObject();

	/**
	 * Returns the meta object for data type '<em>Type Restriction Angle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Restriction Angle</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='typeRestrictionAngle' baseType='typeReelPositif' maxExclusive='360'"
	 * @generated
	 */
	EDataType getTypeRestrictionAngle();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Type Restriction Angle Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Restriction Angle Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='typeRestrictionAngle:Object' baseType='typeRestrictionAngle'"
	 * @generated
	 */
	EDataType getTypeRestrictionAngleObject();

	/**
	 * Returns the meta object for data type '<em>Type Restriction Angle Signe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Restriction Angle Signe</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='typeRestrictionAngleSigne' baseType='typeReal' minExclusive='-180' maxInclusive='180'"
	 * @generated
	 */
	EDataType getTypeRestrictionAngleSigne();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Type Restriction Angle Signe Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Restriction Angle Signe Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='typeRestrictionAngleSigne:Object' baseType='typeRestrictionAngleSigne'"
	 * @generated
	 */
	EDataType getTypeRestrictionAngleSigneObject();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Type Restriction Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Restriction Latitude</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='typeRestrictionLatitude' baseType='typeDecimal' minInclusive='-90' maxInclusive='90'"
	 * @generated
	 */
	EDataType getTypeRestrictionLatitude();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Type Restriction Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Restriction Longitude</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='typeRestrictionLongitude' baseType='typeDecimal' minExclusive='-180' maxInclusive='180'"
	 * @generated
	 */
	EDataType getTypeRestrictionLongitude();

	/**
	 * Returns the meta object for data type '<em>Type Restriction Temperature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Restriction Temperature</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='typeRestrictionTemperature' baseType='typeReal' minInclusive='-273.15'"
	 * @generated
	 */
	EDataType getTypeRestrictionTemperature();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Type Restriction Temperature Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Restriction Temperature Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='typeRestrictionTemperature:Object' baseType='typeRestrictionTemperature'"
	 * @generated
	 */
	EDataType getTypeRestrictionTemperatureObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='typeString' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getTypeString();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetaFactory getMetaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link mpia.meta.impl.TypeAssociationImpl <em>Type Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpia.meta.impl.TypeAssociationImpl
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeAssociation()
		 * @generated
		 */
		EClass TYPE_ASSOCIATION = eINSTANCE.getTypeAssociation();

		/**
		 * The meta object literal for the '<em><b>Ref CTE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_ASSOCIATION__REF_CTE = eINSTANCE.getTypeAssociation_RefCTE();

		/**
		 * The meta object literal for the '{@link mpia.meta.impl.TypeAssociationEXTImpl <em>Type Association EXT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpia.meta.impl.TypeAssociationEXTImpl
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeAssociationEXT()
		 * @generated
		 */
		EClass TYPE_ASSOCIATION_EXT = eINSTANCE.getTypeAssociationEXT();

		/**
		 * The meta object literal for the '<em><b>Ref CTE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_ASSOCIATION_EXT__REF_CTE = eINSTANCE.getTypeAssociationEXT_RefCTE();

		/**
		 * The meta object literal for the '<em><b>Ref EXT</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_ASSOCIATION_EXT__REF_EXT = eINSTANCE.getTypeAssociationEXT_RefEXT();

		/**
		 * The meta object literal for the '{@link mpia.meta.impl.TypeDataTypeAccelerationAngulaireImpl <em>Type Data Type Acceleration Angulaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpia.meta.impl.TypeDataTypeAccelerationAngulaireImpl
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeAccelerationAngulaire()
		 * @generated
		 */
		EClass TYPE_DATA_TYPE_ACCELERATION_ANGULAIRE = eINSTANCE.getTypeDataTypeAccelerationAngulaire();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_ACCELERATION_ANGULAIRE__VALUE = eINSTANCE.getTypeDataTypeAccelerationAngulaire_Value();

		/**
		 * The meta object literal for the '<em><b>Unite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_ACCELERATION_ANGULAIRE__UNITE = eINSTANCE.getTypeDataTypeAccelerationAngulaire_Unite();

		/**
		 * The meta object literal for the '{@link mpia.meta.impl.TypeDataTypeAccelerationAngulaireOrienteeImpl <em>Type Data Type Acceleration Angulaire Orientee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpia.meta.impl.TypeDataTypeAccelerationAngulaireOrienteeImpl
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeAccelerationAngulaireOrientee()
		 * @generated
		 */
		EClass TYPE_DATA_TYPE_ACCELERATION_ANGULAIRE_ORIENTEE = eINSTANCE.getTypeDataTypeAccelerationAngulaireOrientee();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_ACCELERATION_ANGULAIRE_ORIENTEE__VALUE = eINSTANCE.getTypeDataTypeAccelerationAngulaireOrientee_Value();

		/**
		 * The meta object literal for the '<em><b>Unite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_ACCELERATION_ANGULAIRE_ORIENTEE__UNITE = eINSTANCE.getTypeDataTypeAccelerationAngulaireOrientee_Unite();

		/**
		 * The meta object literal for the '{@link mpia.meta.impl.TypeDataTypeAccelerationLineaireImpl <em>Type Data Type Acceleration Lineaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpia.meta.impl.TypeDataTypeAccelerationLineaireImpl
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeAccelerationLineaire()
		 * @generated
		 */
		EClass TYPE_DATA_TYPE_ACCELERATION_LINEAIRE = eINSTANCE.getTypeDataTypeAccelerationLineaire();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_ACCELERATION_LINEAIRE__VALUE = eINSTANCE.getTypeDataTypeAccelerationLineaire_Value();

		/**
		 * The meta object literal for the '<em><b>Unite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_ACCELERATION_LINEAIRE__UNITE = eINSTANCE.getTypeDataTypeAccelerationLineaire_Unite();

		/**
		 * The meta object literal for the '{@link mpia.meta.impl.TypeDataTypeAireImpl <em>Type Data Type Aire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpia.meta.impl.TypeDataTypeAireImpl
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeAire()
		 * @generated
		 */
		EClass TYPE_DATA_TYPE_AIRE = eINSTANCE.getTypeDataTypeAire();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_AIRE__VALUE = eINSTANCE.getTypeDataTypeAire_Value();

		/**
		 * The meta object literal for the '<em><b>Unite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_AIRE__UNITE = eINSTANCE.getTypeDataTypeAire_Unite();

		/**
		 * The meta object literal for the '{@link mpia.meta.impl.TypeDataTypeAltitudePressionImpl <em>Type Data Type Altitude Pression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpia.meta.impl.TypeDataTypeAltitudePressionImpl
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeAltitudePression()
		 * @generated
		 */
		EClass TYPE_DATA_TYPE_ALTITUDE_PRESSION = eINSTANCE.getTypeDataTypeAltitudePression();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_ALTITUDE_PRESSION__VALUE = eINSTANCE.getTypeDataTypeAltitudePression_Value();

		/**
		 * The meta object literal for the '<em><b>Unite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_ALTITUDE_PRESSION__UNITE = eINSTANCE.getTypeDataTypeAltitudePression_Unite();

		/**
		 * The meta object literal for the '{@link mpia.meta.impl.TypeDataTypeAngleImpl <em>Type Data Type Angle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpia.meta.impl.TypeDataTypeAngleImpl
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeAngle()
		 * @generated
		 */
		EClass TYPE_DATA_TYPE_ANGLE = eINSTANCE.getTypeDataTypeAngle();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_ANGLE__VALUE = eINSTANCE.getTypeDataTypeAngle_Value();

		/**
		 * The meta object literal for the '<em><b>Unite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_ANGLE__UNITE = eINSTANCE.getTypeDataTypeAngle_Unite();

		/**
		 * The meta object literal for the '{@link mpia.meta.impl.TypeDataTypeAngleSigneImpl <em>Type Data Type Angle Signe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpia.meta.impl.TypeDataTypeAngleSigneImpl
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeAngleSigne()
		 * @generated
		 */
		EClass TYPE_DATA_TYPE_ANGLE_SIGNE = eINSTANCE.getTypeDataTypeAngleSigne();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_ANGLE_SIGNE__VALUE = eINSTANCE.getTypeDataTypeAngleSigne_Value();

		/**
		 * The meta object literal for the '<em><b>Unite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_ANGLE_SIGNE__UNITE = eINSTANCE.getTypeDataTypeAngleSigne_Unite();

		/**
		 * The meta object literal for the '{@link mpia.meta.impl.TypeDataTypeChampMagnetiqueImpl <em>Type Data Type Champ Magnetique</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpia.meta.impl.TypeDataTypeChampMagnetiqueImpl
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeChampMagnetique()
		 * @generated
		 */
		EClass TYPE_DATA_TYPE_CHAMP_MAGNETIQUE = eINSTANCE.getTypeDataTypeChampMagnetique();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_CHAMP_MAGNETIQUE__VALUE = eINSTANCE.getTypeDataTypeChampMagnetique_Value();

		/**
		 * The meta object literal for the '<em><b>Unite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_CHAMP_MAGNETIQUE__UNITE = eINSTANCE.getTypeDataTypeChampMagnetique_Unite();

		/**
		 * The meta object literal for the '{@link mpia.meta.impl.TypeDataTypeCoordonneeAccelerationLineaireImpl <em>Type Data Type Coordonnee Acceleration Lineaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpia.meta.impl.TypeDataTypeCoordonneeAccelerationLineaireImpl
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeCoordonneeAccelerationLineaire()
		 * @generated
		 */
		EClass TYPE_DATA_TYPE_COORDONNEE_ACCELERATION_LINEAIRE = eINSTANCE.getTypeDataTypeCoordonneeAccelerationLineaire();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_COORDONNEE_ACCELERATION_LINEAIRE__VALUE = eINSTANCE.getTypeDataTypeCoordonneeAccelerationLineaire_Value();

		/**
		 * The meta object literal for the '<em><b>Unite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_COORDONNEE_ACCELERATION_LINEAIRE__UNITE = eINSTANCE.getTypeDataTypeCoordonneeAccelerationLineaire_Unite();

		/**
		 * The meta object literal for the '{@link mpia.meta.impl.TypeDataTypeCoordonneeForceImpl <em>Type Data Type Coordonnee Force</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpia.meta.impl.TypeDataTypeCoordonneeForceImpl
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeCoordonneeForce()
		 * @generated
		 */
		EClass TYPE_DATA_TYPE_COORDONNEE_FORCE = eINSTANCE.getTypeDataTypeCoordonneeForce();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_COORDONNEE_FORCE__VALUE = eINSTANCE.getTypeDataTypeCoordonneeForce_Value();

		/**
		 * The meta object literal for the '<em><b>Unite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_COORDONNEE_FORCE__UNITE = eINSTANCE.getTypeDataTypeCoordonneeForce_Unite();

		/**
		 * The meta object literal for the '{@link mpia.meta.impl.TypeDataTypeCoordonneeLineaireImpl <em>Type Data Type Coordonnee Lineaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpia.meta.impl.TypeDataTypeCoordonneeLineaireImpl
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeCoordonneeLineaire()
		 * @generated
		 */
		EClass TYPE_DATA_TYPE_COORDONNEE_LINEAIRE = eINSTANCE.getTypeDataTypeCoordonneeLineaire();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_COORDONNEE_LINEAIRE__VALUE = eINSTANCE.getTypeDataTypeCoordonneeLineaire_Value();

		/**
		 * The meta object literal for the '<em><b>Unite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_COORDONNEE_LINEAIRE__UNITE = eINSTANCE.getTypeDataTypeCoordonneeLineaire_Unite();

		/**
		 * The meta object literal for the '{@link mpia.meta.impl.TypeDataTypeCoordonneeVitesseLineaireImpl <em>Type Data Type Coordonnee Vitesse Lineaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpia.meta.impl.TypeDataTypeCoordonneeVitesseLineaireImpl
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeCoordonneeVitesseLineaire()
		 * @generated
		 */
		EClass TYPE_DATA_TYPE_COORDONNEE_VITESSE_LINEAIRE = eINSTANCE.getTypeDataTypeCoordonneeVitesseLineaire();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_COORDONNEE_VITESSE_LINEAIRE__VALUE = eINSTANCE.getTypeDataTypeCoordonneeVitesseLineaire_Value();

		/**
		 * The meta object literal for the '<em><b>Unite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_COORDONNEE_VITESSE_LINEAIRE__UNITE = eINSTANCE.getTypeDataTypeCoordonneeVitesseLineaire_Unite();

		/**
		 * The meta object literal for the '{@link mpia.meta.impl.TypeDataTypeDateHeureImpl <em>Type Data Type Date Heure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpia.meta.impl.TypeDataTypeDateHeureImpl
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeDateHeure()
		 * @generated
		 */
		EClass TYPE_DATA_TYPE_DATE_HEURE = eINSTANCE.getTypeDataTypeDateHeure();

		/**
		 * The meta object literal for the '<em><b>Annee</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_DATE_HEURE__ANNEE = eINSTANCE.getTypeDataTypeDateHeure_Annee();

		/**
		 * The meta object literal for the '<em><b>Annee Mois</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_DATE_HEURE__ANNEE_MOIS = eINSTANCE.getTypeDataTypeDateHeure_AnneeMois();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_DATE_HEURE__DATE = eINSTANCE.getTypeDataTypeDateHeure_Date();

		/**
		 * The meta object literal for the '<em><b>Heure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_DATE_HEURE__HEURE = eINSTANCE.getTypeDataTypeDateHeure_Heure();

		/**
		 * The meta object literal for the '<em><b>Date Heure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_DATE_HEURE__DATE_HEURE = eINSTANCE.getTypeDataTypeDateHeure_DateHeure();

		/**
		 * The meta object literal for the '{@link mpia.meta.impl.TypeDataTypeDebitMassiqueImpl <em>Type Data Type Debit Massique</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpia.meta.impl.TypeDataTypeDebitMassiqueImpl
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeDebitMassique()
		 * @generated
		 */
		EClass TYPE_DATA_TYPE_DEBIT_MASSIQUE = eINSTANCE.getTypeDataTypeDebitMassique();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_DEBIT_MASSIQUE__VALUE = eINSTANCE.getTypeDataTypeDebitMassique_Value();

		/**
		 * The meta object literal for the '<em><b>Unite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_DEBIT_MASSIQUE__UNITE = eINSTANCE.getTypeDataTypeDebitMassique_Unite();

		/**
		 * The meta object literal for the '{@link mpia.meta.impl.TypeDataTypeDebitTransmissionImpl <em>Type Data Type Debit Transmission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpia.meta.impl.TypeDataTypeDebitTransmissionImpl
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeDebitTransmission()
		 * @generated
		 */
		EClass TYPE_DATA_TYPE_DEBIT_TRANSMISSION = eINSTANCE.getTypeDataTypeDebitTransmission();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_DEBIT_TRANSMISSION__VALUE = eINSTANCE.getTypeDataTypeDebitTransmission_Value();

		/**
		 * The meta object literal for the '<em><b>Unite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_DEBIT_TRANSMISSION__UNITE = eINSTANCE.getTypeDataTypeDebitTransmission_Unite();

		/**
		 * The meta object literal for the '{@link mpia.meta.impl.TypeDataTypeDebitVolumiqueImpl <em>Type Data Type Debit Volumique</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpia.meta.impl.TypeDataTypeDebitVolumiqueImpl
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeDebitVolumique()
		 * @generated
		 */
		EClass TYPE_DATA_TYPE_DEBIT_VOLUMIQUE = eINSTANCE.getTypeDataTypeDebitVolumique();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_DEBIT_VOLUMIQUE__VALUE = eINSTANCE.getTypeDataTypeDebitVolumique_Value();

		/**
		 * The meta object literal for the '<em><b>Unite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_DEBIT_VOLUMIQUE__UNITE = eINSTANCE.getTypeDataTypeDebitVolumique_Unite();

		/**
		 * The meta object literal for the '{@link mpia.meta.impl.TypeDataTypeDoseAbsorbeeImpl <em>Type Data Type Dose Absorbee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpia.meta.impl.TypeDataTypeDoseAbsorbeeImpl
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeDoseAbsorbee()
		 * @generated
		 */
		EClass TYPE_DATA_TYPE_DOSE_ABSORBEE = eINSTANCE.getTypeDataTypeDoseAbsorbee();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_DOSE_ABSORBEE__VALUE = eINSTANCE.getTypeDataTypeDoseAbsorbee_Value();

		/**
		 * The meta object literal for the '<em><b>Unite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_DOSE_ABSORBEE__UNITE = eINSTANCE.getTypeDataTypeDoseAbsorbee_Unite();

		/**
		 * The meta object literal for the '{@link mpia.meta.impl.TypeDataTypeDureeImpl <em>Type Data Type Duree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpia.meta.impl.TypeDataTypeDureeImpl
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeDuree()
		 * @generated
		 */
		EClass TYPE_DATA_TYPE_DUREE = eINSTANCE.getTypeDataTypeDuree();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_DUREE__VALUE = eINSTANCE.getTypeDataTypeDuree_Value();

		/**
		 * The meta object literal for the '<em><b>Unite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_DUREE__UNITE = eINSTANCE.getTypeDataTypeDuree_Unite();

		/**
		 * The meta object literal for the '{@link mpia.meta.impl.TypeDataTypeForceImpl <em>Type Data Type Force</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpia.meta.impl.TypeDataTypeForceImpl
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeForce()
		 * @generated
		 */
		EClass TYPE_DATA_TYPE_FORCE = eINSTANCE.getTypeDataTypeForce();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_FORCE__VALUE = eINSTANCE.getTypeDataTypeForce_Value();

		/**
		 * The meta object literal for the '<em><b>Unite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_FORCE__UNITE = eINSTANCE.getTypeDataTypeForce_Unite();

		/**
		 * The meta object literal for the '{@link mpia.meta.impl.TypeDataTypeFrequenceImpl <em>Type Data Type Frequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpia.meta.impl.TypeDataTypeFrequenceImpl
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeFrequence()
		 * @generated
		 */
		EClass TYPE_DATA_TYPE_FREQUENCE = eINSTANCE.getTypeDataTypeFrequence();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_FREQUENCE__VALUE = eINSTANCE.getTypeDataTypeFrequence_Value();

		/**
		 * The meta object literal for the '<em><b>Unite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_FREQUENCE__UNITE = eINSTANCE.getTypeDataTypeFrequence_Unite();

		/**
		 * The meta object literal for the '{@link mpia.meta.impl.TypeDataTypeLatitudeImpl <em>Type Data Type Latitude</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpia.meta.impl.TypeDataTypeLatitudeImpl
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeLatitude()
		 * @generated
		 */
		EClass TYPE_DATA_TYPE_LATITUDE = eINSTANCE.getTypeDataTypeLatitude();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_LATITUDE__VALUE = eINSTANCE.getTypeDataTypeLatitude_Value();

		/**
		 * The meta object literal for the '<em><b>Unite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_LATITUDE__UNITE = eINSTANCE.getTypeDataTypeLatitude_Unite();

		/**
		 * The meta object literal for the '{@link mpia.meta.impl.TypeDataTypeLongitudeImpl <em>Type Data Type Longitude</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpia.meta.impl.TypeDataTypeLongitudeImpl
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeLongitude()
		 * @generated
		 */
		EClass TYPE_DATA_TYPE_LONGITUDE = eINSTANCE.getTypeDataTypeLongitude();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_LONGITUDE__VALUE = eINSTANCE.getTypeDataTypeLongitude_Value();

		/**
		 * The meta object literal for the '<em><b>Unite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_LONGITUDE__UNITE = eINSTANCE.getTypeDataTypeLongitude_Unite();

		/**
		 * The meta object literal for the '{@link mpia.meta.impl.TypeDataTypeLongueurImpl <em>Type Data Type Longueur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpia.meta.impl.TypeDataTypeLongueurImpl
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeLongueur()
		 * @generated
		 */
		EClass TYPE_DATA_TYPE_LONGUEUR = eINSTANCE.getTypeDataTypeLongueur();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_LONGUEUR__VALUE = eINSTANCE.getTypeDataTypeLongueur_Value();

		/**
		 * The meta object literal for the '<em><b>Unite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_LONGUEUR__UNITE = eINSTANCE.getTypeDataTypeLongueur_Unite();

		/**
		 * The meta object literal for the '{@link mpia.meta.impl.TypeDataTypeMasseImpl <em>Type Data Type Masse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpia.meta.impl.TypeDataTypeMasseImpl
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeMasse()
		 * @generated
		 */
		EClass TYPE_DATA_TYPE_MASSE = eINSTANCE.getTypeDataTypeMasse();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_MASSE__VALUE = eINSTANCE.getTypeDataTypeMasse_Value();

		/**
		 * The meta object literal for the '<em><b>Unite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_MASSE__UNITE = eINSTANCE.getTypeDataTypeMasse_Unite();

		/**
		 * The meta object literal for the '{@link mpia.meta.impl.TypeDataTypePressionImpl <em>Type Data Type Pression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpia.meta.impl.TypeDataTypePressionImpl
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypePression()
		 * @generated
		 */
		EClass TYPE_DATA_TYPE_PRESSION = eINSTANCE.getTypeDataTypePression();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_PRESSION__VALUE = eINSTANCE.getTypeDataTypePression_Value();

		/**
		 * The meta object literal for the '<em><b>Unite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_PRESSION__UNITE = eINSTANCE.getTypeDataTypePression_Unite();

		/**
		 * The meta object literal for the '{@link mpia.meta.impl.TypeDataTypeTauxPrecipitationImpl <em>Type Data Type Taux Precipitation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpia.meta.impl.TypeDataTypeTauxPrecipitationImpl
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeTauxPrecipitation()
		 * @generated
		 */
		EClass TYPE_DATA_TYPE_TAUX_PRECIPITATION = eINSTANCE.getTypeDataTypeTauxPrecipitation();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_TAUX_PRECIPITATION__VALUE = eINSTANCE.getTypeDataTypeTauxPrecipitation_Value();

		/**
		 * The meta object literal for the '<em><b>Unite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_TAUX_PRECIPITATION__UNITE = eINSTANCE.getTypeDataTypeTauxPrecipitation_Unite();

		/**
		 * The meta object literal for the '{@link mpia.meta.impl.TypeDataTypeTemperatureImpl <em>Type Data Type Temperature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpia.meta.impl.TypeDataTypeTemperatureImpl
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeTemperature()
		 * @generated
		 */
		EClass TYPE_DATA_TYPE_TEMPERATURE = eINSTANCE.getTypeDataTypeTemperature();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_TEMPERATURE__VALUE = eINSTANCE.getTypeDataTypeTemperature_Value();

		/**
		 * The meta object literal for the '<em><b>Unite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_TEMPERATURE__UNITE = eINSTANCE.getTypeDataTypeTemperature_Unite();

		/**
		 * The meta object literal for the '{@link mpia.meta.impl.TypeDataTypeVitesseAngulaireImpl <em>Type Data Type Vitesse Angulaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpia.meta.impl.TypeDataTypeVitesseAngulaireImpl
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeVitesseAngulaire()
		 * @generated
		 */
		EClass TYPE_DATA_TYPE_VITESSE_ANGULAIRE = eINSTANCE.getTypeDataTypeVitesseAngulaire();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_VITESSE_ANGULAIRE__VALUE = eINSTANCE.getTypeDataTypeVitesseAngulaire_Value();

		/**
		 * The meta object literal for the '<em><b>Unite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_VITESSE_ANGULAIRE__UNITE = eINSTANCE.getTypeDataTypeVitesseAngulaire_Unite();

		/**
		 * The meta object literal for the '{@link mpia.meta.impl.TypeDataTypeVitesseAngulaireOrienteeImpl <em>Type Data Type Vitesse Angulaire Orientee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpia.meta.impl.TypeDataTypeVitesseAngulaireOrienteeImpl
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeVitesseAngulaireOrientee()
		 * @generated
		 */
		EClass TYPE_DATA_TYPE_VITESSE_ANGULAIRE_ORIENTEE = eINSTANCE.getTypeDataTypeVitesseAngulaireOrientee();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_VITESSE_ANGULAIRE_ORIENTEE__VALUE = eINSTANCE.getTypeDataTypeVitesseAngulaireOrientee_Value();

		/**
		 * The meta object literal for the '<em><b>Unite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_VITESSE_ANGULAIRE_ORIENTEE__UNITE = eINSTANCE.getTypeDataTypeVitesseAngulaireOrientee_Unite();

		/**
		 * The meta object literal for the '{@link mpia.meta.impl.TypeDataTypeVitesseLineaireImpl <em>Type Data Type Vitesse Lineaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpia.meta.impl.TypeDataTypeVitesseLineaireImpl
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeVitesseLineaire()
		 * @generated
		 */
		EClass TYPE_DATA_TYPE_VITESSE_LINEAIRE = eINSTANCE.getTypeDataTypeVitesseLineaire();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_VITESSE_LINEAIRE__VALUE = eINSTANCE.getTypeDataTypeVitesseLineaire_Value();

		/**
		 * The meta object literal for the '<em><b>Unite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_VITESSE_LINEAIRE__UNITE = eINSTANCE.getTypeDataTypeVitesseLineaire_Unite();

		/**
		 * The meta object literal for the '{@link mpia.meta.impl.TypeDataTypeVolumeImpl <em>Type Data Type Volume</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpia.meta.impl.TypeDataTypeVolumeImpl
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeVolume()
		 * @generated
		 */
		EClass TYPE_DATA_TYPE_VOLUME = eINSTANCE.getTypeDataTypeVolume();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_VOLUME__VALUE = eINSTANCE.getTypeDataTypeVolume_Value();

		/**
		 * The meta object literal for the '<em><b>Unite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DATA_TYPE_VOLUME__UNITE = eINSTANCE.getTypeDataTypeVolume_Unite();

		/**
		 * The meta object literal for the '{@link mpia.meta.TypeDictionnaryUniteCode <em>Type Dictionnary Unite Code</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpia.meta.TypeDictionnaryUniteCode
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDictionnaryUniteCode()
		 * @generated
		 */
		EEnum TYPE_DICTIONNARY_UNITE_CODE = eINSTANCE.getTypeDictionnaryUniteCode();

		/**
		 * The meta object literal for the '<em>Type Annee</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.datatype.XMLGregorianCalendar
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeAnnee()
		 * @generated
		 */
		EDataType TYPE_ANNEE = eINSTANCE.getTypeAnnee();

		/**
		 * The meta object literal for the '<em>Type Annee Mois</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.datatype.XMLGregorianCalendar
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeAnneeMois()
		 * @generated
		 */
		EDataType TYPE_ANNEE_MOIS = eINSTANCE.getTypeAnneeMois();

		/**
		 * The meta object literal for the '<em>Type Any URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeAnyURI()
		 * @generated
		 */
		EDataType TYPE_ANY_URI = eINSTANCE.getTypeAnyURI();

		/**
		 * The meta object literal for the '<em>Type Boolean</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeBoolean()
		 * @generated
		 */
		EDataType TYPE_BOOLEAN = eINSTANCE.getTypeBoolean();

		/**
		 * The meta object literal for the '<em>Type Boolean Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Boolean
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeBooleanObject()
		 * @generated
		 */
		EDataType TYPE_BOOLEAN_OBJECT = eINSTANCE.getTypeBooleanObject();

		/**
		 * The meta object literal for the '<em>Type Data Type Chaine0100</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeChaine0100()
		 * @generated
		 */
		EDataType TYPE_DATA_TYPE_CHAINE0100 = eINSTANCE.getTypeDataTypeChaine0100();

		/**
		 * The meta object literal for the '<em>Type Data Type Chaine012</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeChaine012()
		 * @generated
		 */
		EDataType TYPE_DATA_TYPE_CHAINE012 = eINSTANCE.getTypeDataTypeChaine012();

		/**
		 * The meta object literal for the '<em>Type Data Type Chaine015</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeChaine015()
		 * @generated
		 */
		EDataType TYPE_DATA_TYPE_CHAINE015 = eINSTANCE.getTypeDataTypeChaine015();

		/**
		 * The meta object literal for the '<em>Type Data Type Chaine020</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeChaine020()
		 * @generated
		 */
		EDataType TYPE_DATA_TYPE_CHAINE020 = eINSTANCE.getTypeDataTypeChaine020();

		/**
		 * The meta object literal for the '<em>Type Data Type Chaine02000</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeChaine02000()
		 * @generated
		 */
		EDataType TYPE_DATA_TYPE_CHAINE02000 = eINSTANCE.getTypeDataTypeChaine02000();

		/**
		 * The meta object literal for the '<em>Type Data Type Chaine0255</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeChaine0255()
		 * @generated
		 */
		EDataType TYPE_DATA_TYPE_CHAINE0255 = eINSTANCE.getTypeDataTypeChaine0255();

		/**
		 * The meta object literal for the '<em>Type Data Type Chaine03</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeChaine03()
		 * @generated
		 */
		EDataType TYPE_DATA_TYPE_CHAINE03 = eINSTANCE.getTypeDataTypeChaine03();

		/**
		 * The meta object literal for the '<em>Type Data Type Chaine030</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeChaine030()
		 * @generated
		 */
		EDataType TYPE_DATA_TYPE_CHAINE030 = eINSTANCE.getTypeDataTypeChaine030();

		/**
		 * The meta object literal for the '<em>Type Data Type Chaine050</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeChaine050()
		 * @generated
		 */
		EDataType TYPE_DATA_TYPE_CHAINE050 = eINSTANCE.getTypeDataTypeChaine050();

		/**
		 * The meta object literal for the '<em>Type Data Type Chaine06</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeChaine06()
		 * @generated
		 */
		EDataType TYPE_DATA_TYPE_CHAINE06 = eINSTANCE.getTypeDataTypeChaine06();

		/**
		 * The meta object literal for the '<em>Type Data Type Chaine08</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeChaine08()
		 * @generated
		 */
		EDataType TYPE_DATA_TYPE_CHAINE08 = eINSTANCE.getTypeDataTypeChaine08();

		/**
		 * The meta object literal for the '<em>Type Data Type Chaine080</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeChaine080()
		 * @generated
		 */
		EDataType TYPE_DATA_TYPE_CHAINE080 = eINSTANCE.getTypeDataTypeChaine080();

		/**
		 * The meta object literal for the '<em>Type Data Type Chaine09</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeChaine09()
		 * @generated
		 */
		EDataType TYPE_DATA_TYPE_CHAINE09 = eINSTANCE.getTypeDataTypeChaine09();

		/**
		 * The meta object literal for the '<em>Type Data Type Entier15</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeEntier15()
		 * @generated
		 */
		EDataType TYPE_DATA_TYPE_ENTIER15 = eINSTANCE.getTypeDataTypeEntier15();

		/**
		 * The meta object literal for the '<em>Type Data Type Entier15 Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Long
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeEntier15Object()
		 * @generated
		 */
		EDataType TYPE_DATA_TYPE_ENTIER15_OBJECT = eINSTANCE.getTypeDataTypeEntier15Object();

		/**
		 * The meta object literal for the '<em>Type Data Type Entier3</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeEntier3()
		 * @generated
		 */
		EDataType TYPE_DATA_TYPE_ENTIER3 = eINSTANCE.getTypeDataTypeEntier3();

		/**
		 * The meta object literal for the '<em>Type Data Type Entier3 Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Long
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeEntier3Object()
		 * @generated
		 */
		EDataType TYPE_DATA_TYPE_ENTIER3_OBJECT = eINSTANCE.getTypeDataTypeEntier3Object();

		/**
		 * The meta object literal for the '<em>Type Data Type Entier6</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeEntier6()
		 * @generated
		 */
		EDataType TYPE_DATA_TYPE_ENTIER6 = eINSTANCE.getTypeDataTypeEntier6();

		/**
		 * The meta object literal for the '<em>Type Data Type Entier6 Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Long
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeEntier6Object()
		 * @generated
		 */
		EDataType TYPE_DATA_TYPE_ENTIER6_OBJECT = eINSTANCE.getTypeDataTypeEntier6Object();

		/**
		 * The meta object literal for the '<em>Type Data Type Entier9</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeEntier9()
		 * @generated
		 */
		EDataType TYPE_DATA_TYPE_ENTIER9 = eINSTANCE.getTypeDataTypeEntier9();

		/**
		 * The meta object literal for the '<em>Type Data Type Entier9 Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Long
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeEntier9Object()
		 * @generated
		 */
		EDataType TYPE_DATA_TYPE_ENTIER9_OBJECT = eINSTANCE.getTypeDataTypeEntier9Object();

		/**
		 * The meta object literal for the '<em>Type Data Type Fraction</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeFraction()
		 * @generated
		 */
		EDataType TYPE_DATA_TYPE_FRACTION = eINSTANCE.getTypeDataTypeFraction();

		/**
		 * The meta object literal for the '<em>Type Data Type Fraction Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeFractionObject()
		 * @generated
		 */
		EDataType TYPE_DATA_TYPE_FRACTION_OBJECT = eINSTANCE.getTypeDataTypeFractionObject();

		/**
		 * The meta object literal for the '<em>Type Data Type GDH</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.datatype.XMLGregorianCalendar
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeGDH()
		 * @generated
		 */
		EDataType TYPE_DATA_TYPE_GDH = eINSTANCE.getTypeDataTypeGDH();

		/**
		 * The meta object literal for the '<em>Type Data Type Ratio</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeRatio()
		 * @generated
		 */
		EDataType TYPE_DATA_TYPE_RATIO = eINSTANCE.getTypeDataTypeRatio();

		/**
		 * The meta object literal for the '<em>Type Data Type Ratio Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDataTypeRatioObject()
		 * @generated
		 */
		EDataType TYPE_DATA_TYPE_RATIO_OBJECT = eINSTANCE.getTypeDataTypeRatioObject();

		/**
		 * The meta object literal for the '<em>Type Date</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.datatype.XMLGregorianCalendar
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDate()
		 * @generated
		 */
		EDataType TYPE_DATE = eINSTANCE.getTypeDate();

		/**
		 * The meta object literal for the '<em>Type Decimal</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDecimal()
		 * @generated
		 */
		EDataType TYPE_DECIMAL = eINSTANCE.getTypeDecimal();

		/**
		 * The meta object literal for the '<em>Type Dictionnary Unite Code Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpia.meta.TypeDictionnaryUniteCode
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDictionnaryUniteCodeObject()
		 * @generated
		 */
		EDataType TYPE_DICTIONNARY_UNITE_CODE_OBJECT = eINSTANCE.getTypeDictionnaryUniteCodeObject();

		/**
		 * The meta object literal for the '<em>Type DTG</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.datatype.XMLGregorianCalendar
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeDTG()
		 * @generated
		 */
		EDataType TYPE_DTG = eINSTANCE.getTypeDTG();

		/**
		 * The meta object literal for the '<em>Type Heure</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.datatype.XMLGregorianCalendar
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeHeure()
		 * @generated
		 */
		EDataType TYPE_HEURE = eINSTANCE.getTypeHeure();

		/**
		 * The meta object literal for the '<em>Type Integer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeInteger()
		 * @generated
		 */
		EDataType TYPE_INTEGER = eINSTANCE.getTypeInteger();

		/**
		 * The meta object literal for the '<em>Type Integer Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Long
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeIntegerObject()
		 * @generated
		 */
		EDataType TYPE_INTEGER_OBJECT = eINSTANCE.getTypeIntegerObject();

		/**
		 * The meta object literal for the '<em>Type Real</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeReal()
		 * @generated
		 */
		EDataType TYPE_REAL = eINSTANCE.getTypeReal();

		/**
		 * The meta object literal for the '<em>Type Real Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeRealObject()
		 * @generated
		 */
		EDataType TYPE_REAL_OBJECT = eINSTANCE.getTypeRealObject();

		/**
		 * The meta object literal for the '<em>Type Reel Positif</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeReelPositif()
		 * @generated
		 */
		EDataType TYPE_REEL_POSITIF = eINSTANCE.getTypeReelPositif();

		/**
		 * The meta object literal for the '<em>Type Reel Positif Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeReelPositifObject()
		 * @generated
		 */
		EDataType TYPE_REEL_POSITIF_OBJECT = eINSTANCE.getTypeReelPositifObject();

		/**
		 * The meta object literal for the '<em>Type Restriction Angle</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeRestrictionAngle()
		 * @generated
		 */
		EDataType TYPE_RESTRICTION_ANGLE = eINSTANCE.getTypeRestrictionAngle();

		/**
		 * The meta object literal for the '<em>Type Restriction Angle Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeRestrictionAngleObject()
		 * @generated
		 */
		EDataType TYPE_RESTRICTION_ANGLE_OBJECT = eINSTANCE.getTypeRestrictionAngleObject();

		/**
		 * The meta object literal for the '<em>Type Restriction Angle Signe</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeRestrictionAngleSigne()
		 * @generated
		 */
		EDataType TYPE_RESTRICTION_ANGLE_SIGNE = eINSTANCE.getTypeRestrictionAngleSigne();

		/**
		 * The meta object literal for the '<em>Type Restriction Angle Signe Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeRestrictionAngleSigneObject()
		 * @generated
		 */
		EDataType TYPE_RESTRICTION_ANGLE_SIGNE_OBJECT = eINSTANCE.getTypeRestrictionAngleSigneObject();

		/**
		 * The meta object literal for the '<em>Type Restriction Latitude</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeRestrictionLatitude()
		 * @generated
		 */
		EDataType TYPE_RESTRICTION_LATITUDE = eINSTANCE.getTypeRestrictionLatitude();

		/**
		 * The meta object literal for the '<em>Type Restriction Longitude</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeRestrictionLongitude()
		 * @generated
		 */
		EDataType TYPE_RESTRICTION_LONGITUDE = eINSTANCE.getTypeRestrictionLongitude();

		/**
		 * The meta object literal for the '<em>Type Restriction Temperature</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeRestrictionTemperature()
		 * @generated
		 */
		EDataType TYPE_RESTRICTION_TEMPERATURE = eINSTANCE.getTypeRestrictionTemperature();

		/**
		 * The meta object literal for the '<em>Type Restriction Temperature Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeRestrictionTemperatureObject()
		 * @generated
		 */
		EDataType TYPE_RESTRICTION_TEMPERATURE_OBJECT = eINSTANCE.getTypeRestrictionTemperatureObject();

		/**
		 * The meta object literal for the '<em>Type String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see mpia.meta.impl.MetaPackageImpl#getTypeString()
		 * @generated
		 */
		EDataType TYPE_STRING = eINSTANCE.getTypeString();

	}

} //MetaPackage
