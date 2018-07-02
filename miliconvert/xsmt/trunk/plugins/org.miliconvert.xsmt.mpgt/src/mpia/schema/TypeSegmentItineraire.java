/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Segment Itineraire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeSegmentItineraire#getMoyenTransport <em>Moyen Transport</em>}</li>
 *   <li>{@link mpia.schema.TypeSegmentItineraire#getMobilite <em>Mobilite</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeSegmentItineraire()
 * @model abstract="true"
 *        extendedMetaData="name='type_SegmentItineraire' kind='elementOnly'"
 * @generated
 */
public interface TypeSegmentItineraire extends TypeElementControle {
	/**
	 * Returns the value of the '<em><b>Moyen Transport</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMoyenTransport}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moyen Transport</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moyen Transport</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMoyenTransport
	 * @see #isSetMoyenTransport()
	 * @see #unsetMoyenTransport()
	 * @see #setMoyenTransport(TypeDictionaryDicoMoyenTransport)
	 * @see mpia.schema.SchemaPackage#getTypeSegmentItineraire_MoyenTransport()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='MoyenTransport'"
	 * @generated
	 */
	TypeDictionaryDicoMoyenTransport getMoyenTransport();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSegmentItineraire#getMoyenTransport <em>Moyen Transport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moyen Transport</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMoyenTransport
	 * @see #isSetMoyenTransport()
	 * @see #unsetMoyenTransport()
	 * @see #getMoyenTransport()
	 * @generated
	 */
	void setMoyenTransport(TypeDictionaryDicoMoyenTransport value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSegmentItineraire#getMoyenTransport <em>Moyen Transport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMoyenTransport()
	 * @see #getMoyenTransport()
	 * @see #setMoyenTransport(TypeDictionaryDicoMoyenTransport)
	 * @generated
	 */
	void unsetMoyenTransport();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSegmentItineraire#getMoyenTransport <em>Moyen Transport</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Moyen Transport</em>' attribute is set.
	 * @see #unsetMoyenTransport()
	 * @see #getMoyenTransport()
	 * @see #setMoyenTransport(TypeDictionaryDicoMoyenTransport)
	 * @generated
	 */
	boolean isSetMoyenTransport();

	/**
	 * Returns the value of the '<em><b>Mobilite</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMobilite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mobilite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mobilite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMobilite
	 * @see #isSetMobilite()
	 * @see #unsetMobilite()
	 * @see #setMobilite(TypeDictionaryDicoMobilite)
	 * @see mpia.schema.SchemaPackage#getTypeSegmentItineraire_Mobilite()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Mobilite'"
	 * @generated
	 */
	TypeDictionaryDicoMobilite getMobilite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSegmentItineraire#getMobilite <em>Mobilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mobilite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMobilite
	 * @see #isSetMobilite()
	 * @see #unsetMobilite()
	 * @see #getMobilite()
	 * @generated
	 */
	void setMobilite(TypeDictionaryDicoMobilite value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSegmentItineraire#getMobilite <em>Mobilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMobilite()
	 * @see #getMobilite()
	 * @see #setMobilite(TypeDictionaryDicoMobilite)
	 * @generated
	 */
	void unsetMobilite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSegmentItineraire#getMobilite <em>Mobilite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mobilite</em>' attribute is set.
	 * @see #unsetMobilite()
	 * @see #getMobilite()
	 * @see #setMobilite(TypeDictionaryDicoMobilite)
	 * @generated
	 */
	boolean isSetMobilite();

} // TypeSegmentItineraire
