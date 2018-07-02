/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Charnier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCharnier#getNumeroIdentification <em>Numero Identification</em>}</li>
 *   <li>{@link mpia.schema.TypeCharnier#getNombreIndividus <em>Nombre Individus</em>}</li>
 *   <li>{@link mpia.schema.TypeCharnier#getNombreFosses <em>Nombre Fosses</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCharnier()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_Charnier' kind='elementOnly'"
 * @generated
 */
public interface TypeCharnier extends TypeSite {
	/**
	 * Returns the value of the '<em><b>Numero Identification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Identification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Identification</em>' attribute.
	 * @see #setNumeroIdentification(String)
	 * @see mpia.schema.SchemaPackage#getTypeCharnier_NumeroIdentification()
	 * @model dataType="mpia.meta.TypeDataTypeChaine050"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='NumeroIdentification'"
	 * @generated
	 */
	String getNumeroIdentification();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCharnier#getNumeroIdentification <em>Numero Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Identification</em>' attribute.
	 * @see #getNumeroIdentification()
	 * @generated
	 */
	void setNumeroIdentification(String value);

	/**
	 * Returns the value of the '<em><b>Nombre Individus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Individus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Individus</em>' attribute.
	 * @see #isSetNombreIndividus()
	 * @see #unsetNombreIndividus()
	 * @see #setNombreIndividus(long)
	 * @see mpia.schema.SchemaPackage#getTypeCharnier_NombreIndividus()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier9"
	 *        extendedMetaData="kind='element' name='NombreIndividus'"
	 * @generated
	 */
	long getNombreIndividus();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCharnier#getNombreIndividus <em>Nombre Individus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Individus</em>' attribute.
	 * @see #isSetNombreIndividus()
	 * @see #unsetNombreIndividus()
	 * @see #getNombreIndividus()
	 * @generated
	 */
	void setNombreIndividus(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCharnier#getNombreIndividus <em>Nombre Individus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreIndividus()
	 * @see #getNombreIndividus()
	 * @see #setNombreIndividus(long)
	 * @generated
	 */
	void unsetNombreIndividus();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCharnier#getNombreIndividus <em>Nombre Individus</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Individus</em>' attribute is set.
	 * @see #unsetNombreIndividus()
	 * @see #getNombreIndividus()
	 * @see #setNombreIndividus(long)
	 * @generated
	 */
	boolean isSetNombreIndividus();

	/**
	 * Returns the value of the '<em><b>Nombre Fosses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Fosses</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Fosses</em>' attribute.
	 * @see #isSetNombreFosses()
	 * @see #unsetNombreFosses()
	 * @see #setNombreFosses(long)
	 * @see mpia.schema.SchemaPackage#getTypeCharnier_NombreFosses()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier9"
	 *        extendedMetaData="kind='element' name='NombreFosses'"
	 * @generated
	 */
	long getNombreFosses();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCharnier#getNombreFosses <em>Nombre Fosses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Fosses</em>' attribute.
	 * @see #isSetNombreFosses()
	 * @see #unsetNombreFosses()
	 * @see #getNombreFosses()
	 * @generated
	 */
	void setNombreFosses(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCharnier#getNombreFosses <em>Nombre Fosses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreFosses()
	 * @see #getNombreFosses()
	 * @see #setNombreFosses(long)
	 * @generated
	 */
	void unsetNombreFosses();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCharnier#getNombreFosses <em>Nombre Fosses</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Fosses</em>' attribute is set.
	 * @see #unsetNombreFosses()
	 * @see #getNombreFosses()
	 * @see #setNombreFosses(long)
	 * @generated
	 */
	boolean isSetNombreFosses();

} // TypeCharnier
