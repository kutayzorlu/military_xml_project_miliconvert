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
 * A representation of the model object '<em><b>Type Infrastructure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeInfrastructure#getNatureInfrastructure <em>Nature Infrastructure</em>}</li>
 *   <li>{@link mpia.schema.TypeInfrastructure#getEtatInfrastructure <em>Etat Infrastructure</em>}</li>
 *   <li>{@link mpia.schema.TypeInfrastructure#isInfrastructureReparable <em>Infrastructure Reparable</em>}</li>
 *   <li>{@link mpia.schema.TypeInfrastructure#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeInfrastructure#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeInfrastructure()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_Infrastructure' kind='elementOnly'"
 * @generated
 */
public interface TypeInfrastructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Nature Infrastructure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nature Infrastructure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nature Infrastructure</em>' attribute.
	 * @see #setNatureInfrastructure(String)
	 * @see mpia.schema.SchemaPackage#getTypeInfrastructure_NatureInfrastructure()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080" required="true"
	 *        extendedMetaData="kind='element' name='NatureInfrastructure'"
	 * @generated
	 */
	String getNatureInfrastructure();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeInfrastructure#getNatureInfrastructure <em>Nature Infrastructure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nature Infrastructure</em>' attribute.
	 * @see #getNatureInfrastructure()
	 * @generated
	 */
	void setNatureInfrastructure(String value);

	/**
	 * Returns the value of the '<em><b>Etat Infrastructure</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoInfrastructureEtatInfrastructure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Infrastructure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Infrastructure</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoInfrastructureEtatInfrastructure
	 * @see #isSetEtatInfrastructure()
	 * @see #unsetEtatInfrastructure()
	 * @see #setEtatInfrastructure(TypeDictionaryDicoInfrastructureEtatInfrastructure)
	 * @see mpia.schema.SchemaPackage#getTypeInfrastructure_EtatInfrastructure()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='EtatInfrastructure'"
	 * @generated
	 */
	TypeDictionaryDicoInfrastructureEtatInfrastructure getEtatInfrastructure();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeInfrastructure#getEtatInfrastructure <em>Etat Infrastructure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Infrastructure</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoInfrastructureEtatInfrastructure
	 * @see #isSetEtatInfrastructure()
	 * @see #unsetEtatInfrastructure()
	 * @see #getEtatInfrastructure()
	 * @generated
	 */
	void setEtatInfrastructure(TypeDictionaryDicoInfrastructureEtatInfrastructure value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeInfrastructure#getEtatInfrastructure <em>Etat Infrastructure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEtatInfrastructure()
	 * @see #getEtatInfrastructure()
	 * @see #setEtatInfrastructure(TypeDictionaryDicoInfrastructureEtatInfrastructure)
	 * @generated
	 */
	void unsetEtatInfrastructure();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeInfrastructure#getEtatInfrastructure <em>Etat Infrastructure</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Etat Infrastructure</em>' attribute is set.
	 * @see #unsetEtatInfrastructure()
	 * @see #getEtatInfrastructure()
	 * @see #setEtatInfrastructure(TypeDictionaryDicoInfrastructureEtatInfrastructure)
	 * @generated
	 */
	boolean isSetEtatInfrastructure();

	/**
	 * Returns the value of the '<em><b>Infrastructure Reparable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Infrastructure Reparable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infrastructure Reparable</em>' attribute.
	 * @see #isSetInfrastructureReparable()
	 * @see #unsetInfrastructureReparable()
	 * @see #setInfrastructureReparable(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeInfrastructure_InfrastructureReparable()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='InfrastructureReparable'"
	 * @generated
	 */
	boolean isInfrastructureReparable();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeInfrastructure#isInfrastructureReparable <em>Infrastructure Reparable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Infrastructure Reparable</em>' attribute.
	 * @see #isSetInfrastructureReparable()
	 * @see #unsetInfrastructureReparable()
	 * @see #isInfrastructureReparable()
	 * @generated
	 */
	void setInfrastructureReparable(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeInfrastructure#isInfrastructureReparable <em>Infrastructure Reparable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInfrastructureReparable()
	 * @see #isInfrastructureReparable()
	 * @see #setInfrastructureReparable(boolean)
	 * @generated
	 */
	void unsetInfrastructureReparable();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeInfrastructure#isInfrastructureReparable <em>Infrastructure Reparable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Infrastructure Reparable</em>' attribute is set.
	 * @see #unsetInfrastructureReparable()
	 * @see #isInfrastructureReparable()
	 * @see #setInfrastructureReparable(boolean)
	 * @generated
	 */
	boolean isSetInfrastructureReparable();

	/**
	 * Returns the value of the '<em><b>CTE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CTE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CTE</em>' attribute.
	 * @see #setCTE(String)
	 * @see mpia.schema.SchemaPackage#getTypeInfrastructure_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeInfrastructure#getCTE <em>CTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CTE</em>' attribute.
	 * @see #getCTE()
	 * @generated
	 */
	void setCTE(String value);

	/**
	 * Returns the value of the '<em><b>CE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CE</em>' attribute.
	 * @see #setCE(String)
	 * @see mpia.schema.SchemaPackage#getTypeInfrastructure_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeInfrastructure#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

} // TypeInfrastructure
