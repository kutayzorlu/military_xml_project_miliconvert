/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeLongueur;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Pont</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypePont#getClasseMilitaire <em>Classe Militaire</em>}</li>
 *   <li>{@link mpia.schema.TypePont#getHauteurMinimum <em>Hauteur Minimum</em>}</li>
 *   <li>{@link mpia.schema.TypePont#getLargeurMinimum <em>Largeur Minimum</em>}</li>
 *   <li>{@link mpia.schema.TypePont#getUtilisation <em>Utilisation</em>}</li>
 *   <li>{@link mpia.schema.TypePont#getLongueurTraveePlusLongue <em>Longueur Travee Plus Longue</em>}</li>
 *   <li>{@link mpia.schema.TypePont#getNombreTravees <em>Nombre Travees</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypePont()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_Pont' kind='elementOnly'"
 * @generated
 */
public interface TypePont extends TypeSite {
	/**
	 * Returns the value of the '<em><b>Classe Militaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classe Militaire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classe Militaire</em>' attribute.
	 * @see #isSetClasseMilitaire()
	 * @see #unsetClasseMilitaire()
	 * @see #setClasseMilitaire(long)
	 * @see mpia.schema.SchemaPackage#getTypePont_ClasseMilitaire()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='ClasseMilitaire'"
	 * @generated
	 */
	long getClasseMilitaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePont#getClasseMilitaire <em>Classe Militaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classe Militaire</em>' attribute.
	 * @see #isSetClasseMilitaire()
	 * @see #unsetClasseMilitaire()
	 * @see #getClasseMilitaire()
	 * @generated
	 */
	void setClasseMilitaire(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePont#getClasseMilitaire <em>Classe Militaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClasseMilitaire()
	 * @see #getClasseMilitaire()
	 * @see #setClasseMilitaire(long)
	 * @generated
	 */
	void unsetClasseMilitaire();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePont#getClasseMilitaire <em>Classe Militaire</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Classe Militaire</em>' attribute is set.
	 * @see #unsetClasseMilitaire()
	 * @see #getClasseMilitaire()
	 * @see #setClasseMilitaire(long)
	 * @generated
	 */
	boolean isSetClasseMilitaire();

	/**
	 * Returns the value of the '<em><b>Hauteur Minimum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hauteur Minimum</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hauteur Minimum</em>' containment reference.
	 * @see #setHauteurMinimum(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypePont_HauteurMinimum()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='HauteurMinimum'"
	 * @generated
	 */
	TypeDataTypeLongueur getHauteurMinimum();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePont#getHauteurMinimum <em>Hauteur Minimum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hauteur Minimum</em>' containment reference.
	 * @see #getHauteurMinimum()
	 * @generated
	 */
	void setHauteurMinimum(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Largeur Minimum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Largeur Minimum</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Largeur Minimum</em>' containment reference.
	 * @see #setLargeurMinimum(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypePont_LargeurMinimum()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LargeurMinimum'"
	 * @generated
	 */
	TypeDataTypeLongueur getLargeurMinimum();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePont#getLargeurMinimum <em>Largeur Minimum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Largeur Minimum</em>' containment reference.
	 * @see #getLargeurMinimum()
	 * @generated
	 */
	void setLargeurMinimum(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Utilisation</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPontUtilisation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Utilisation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utilisation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPontUtilisation
	 * @see #isSetUtilisation()
	 * @see #unsetUtilisation()
	 * @see #setUtilisation(TypeDictionaryDicoPontUtilisation)
	 * @see mpia.schema.SchemaPackage#getTypePont_Utilisation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Utilisation'"
	 * @generated
	 */
	TypeDictionaryDicoPontUtilisation getUtilisation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePont#getUtilisation <em>Utilisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utilisation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPontUtilisation
	 * @see #isSetUtilisation()
	 * @see #unsetUtilisation()
	 * @see #getUtilisation()
	 * @generated
	 */
	void setUtilisation(TypeDictionaryDicoPontUtilisation value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePont#getUtilisation <em>Utilisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUtilisation()
	 * @see #getUtilisation()
	 * @see #setUtilisation(TypeDictionaryDicoPontUtilisation)
	 * @generated
	 */
	void unsetUtilisation();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePont#getUtilisation <em>Utilisation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Utilisation</em>' attribute is set.
	 * @see #unsetUtilisation()
	 * @see #getUtilisation()
	 * @see #setUtilisation(TypeDictionaryDicoPontUtilisation)
	 * @generated
	 */
	boolean isSetUtilisation();

	/**
	 * Returns the value of the '<em><b>Longueur Travee Plus Longue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Longueur Travee Plus Longue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longueur Travee Plus Longue</em>' containment reference.
	 * @see #setLongueurTraveePlusLongue(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypePont_LongueurTraveePlusLongue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LongueurTraveePlusLongue'"
	 * @generated
	 */
	TypeDataTypeLongueur getLongueurTraveePlusLongue();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePont#getLongueurTraveePlusLongue <em>Longueur Travee Plus Longue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longueur Travee Plus Longue</em>' containment reference.
	 * @see #getLongueurTraveePlusLongue()
	 * @generated
	 */
	void setLongueurTraveePlusLongue(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Nombre Travees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Travees</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Travees</em>' attribute.
	 * @see #isSetNombreTravees()
	 * @see #unsetNombreTravees()
	 * @see #setNombreTravees(long)
	 * @see mpia.schema.SchemaPackage#getTypePont_NombreTravees()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NombreTravees'"
	 * @generated
	 */
	long getNombreTravees();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePont#getNombreTravees <em>Nombre Travees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Travees</em>' attribute.
	 * @see #isSetNombreTravees()
	 * @see #unsetNombreTravees()
	 * @see #getNombreTravees()
	 * @generated
	 */
	void setNombreTravees(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePont#getNombreTravees <em>Nombre Travees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreTravees()
	 * @see #getNombreTravees()
	 * @see #setNombreTravees(long)
	 * @generated
	 */
	void unsetNombreTravees();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePont#getNombreTravees <em>Nombre Travees</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Travees</em>' attribute is set.
	 * @see #unsetNombreTravees()
	 * @see #getNombreTravees()
	 * @see #setNombreTravees(long)
	 * @generated
	 */
	boolean isSetNombreTravees();

} // TypePont
