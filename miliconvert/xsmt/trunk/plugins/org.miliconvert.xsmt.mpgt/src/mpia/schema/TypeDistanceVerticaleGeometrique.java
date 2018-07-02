/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Distance Verticale Geometrique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeDistanceVerticaleGeometrique#getReference <em>Reference</em>}</li>
 *   <li>{@link mpia.schema.TypeDistanceVerticaleGeometrique#getValeur <em>Valeur</em>}</li>
 *   <li>{@link mpia.schema.TypeDistanceVerticaleGeometrique#getPrecision <em>Precision</em>}</li>
 *   <li>{@link mpia.schema.TypeDistanceVerticaleGeometrique#getDatum <em>Datum</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeDistanceVerticaleGeometrique()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_DistanceVerticaleGeometrique' kind='elementOnly'"
 * @generated
 */
public interface TypeDistanceVerticaleGeometrique extends EObject {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoDistanceVerticaleReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDistanceVerticaleReference
	 * @see #isSetReference()
	 * @see #unsetReference()
	 * @see #setReference(TypeDictionaryDicoDistanceVerticaleReference)
	 * @see mpia.schema.SchemaPackage#getTypeDistanceVerticaleGeometrique_Reference()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Reference'"
	 * @generated
	 */
	TypeDictionaryDicoDistanceVerticaleReference getReference();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDistanceVerticaleGeometrique#getReference <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDistanceVerticaleReference
	 * @see #isSetReference()
	 * @see #unsetReference()
	 * @see #getReference()
	 * @generated
	 */
	void setReference(TypeDictionaryDicoDistanceVerticaleReference value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDistanceVerticaleGeometrique#getReference <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReference()
	 * @see #getReference()
	 * @see #setReference(TypeDictionaryDicoDistanceVerticaleReference)
	 * @generated
	 */
	void unsetReference();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDistanceVerticaleGeometrique#getReference <em>Reference</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reference</em>' attribute is set.
	 * @see #unsetReference()
	 * @see #getReference()
	 * @see #setReference(TypeDictionaryDicoDistanceVerticaleReference)
	 * @generated
	 */
	boolean isSetReference();

	/**
	 * Returns the value of the '<em><b>Valeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valeur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valeur</em>' attribute.
	 * @see #isSetValeur()
	 * @see #unsetValeur()
	 * @see #setValeur(double)
	 * @see mpia.schema.SchemaPackage#getTypeDistanceVerticaleGeometrique_Valeur()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal" required="true"
	 *        extendedMetaData="kind='element' name='Valeur'"
	 * @generated
	 */
	double getValeur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDistanceVerticaleGeometrique#getValeur <em>Valeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valeur</em>' attribute.
	 * @see #isSetValeur()
	 * @see #unsetValeur()
	 * @see #getValeur()
	 * @generated
	 */
	void setValeur(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDistanceVerticaleGeometrique#getValeur <em>Valeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValeur()
	 * @see #getValeur()
	 * @see #setValeur(double)
	 * @generated
	 */
	void unsetValeur();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDistanceVerticaleGeometrique#getValeur <em>Valeur</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Valeur</em>' attribute is set.
	 * @see #unsetValeur()
	 * @see #getValeur()
	 * @see #setValeur(double)
	 * @generated
	 */
	boolean isSetValeur();

	/**
	 * Returns the value of the '<em><b>Precision</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPrecisionDistance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPrecisionDistance
	 * @see #isSetPrecision()
	 * @see #unsetPrecision()
	 * @see #setPrecision(TypeDictionaryDicoPrecisionDistance)
	 * @see mpia.schema.SchemaPackage#getTypeDistanceVerticaleGeometrique_Precision()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Precision'"
	 * @generated
	 */
	TypeDictionaryDicoPrecisionDistance getPrecision();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDistanceVerticaleGeometrique#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPrecisionDistance
	 * @see #isSetPrecision()
	 * @see #unsetPrecision()
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(TypeDictionaryDicoPrecisionDistance value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDistanceVerticaleGeometrique#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrecision()
	 * @see #getPrecision()
	 * @see #setPrecision(TypeDictionaryDicoPrecisionDistance)
	 * @generated
	 */
	void unsetPrecision();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDistanceVerticaleGeometrique#getPrecision <em>Precision</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Precision</em>' attribute is set.
	 * @see #unsetPrecision()
	 * @see #getPrecision()
	 * @see #setPrecision(TypeDictionaryDicoPrecisionDistance)
	 * @generated
	 */
	boolean isSetPrecision();

	/**
	 * Returns the value of the '<em><b>Datum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datum</em>' attribute.
	 * @see #setDatum(String)
	 * @see mpia.schema.SchemaPackage#getTypeDistanceVerticaleGeometrique_Datum()
	 * @model dataType="mpia.meta.TypeDataTypeChaine050"
	 *        extendedMetaData="kind='element' name='Datum'"
	 * @generated
	 */
	String getDatum();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDistanceVerticaleGeometrique#getDatum <em>Datum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datum</em>' attribute.
	 * @see #getDatum()
	 * @generated
	 */
	void setDatum(String value);

} // TypeDistanceVerticaleGeometrique
