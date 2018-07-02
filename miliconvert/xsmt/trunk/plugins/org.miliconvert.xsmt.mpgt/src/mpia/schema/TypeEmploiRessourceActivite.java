/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeAngle;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Emploi Ressource Activite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEmploiRessourceActivite#getTypeTrajectoireTir <em>Type Trajectoire Tir</em>}</li>
 *   <li>{@link mpia.schema.TypeEmploiRessourceActivite#getAngleTir <em>Angle Tir</em>}</li>
 *   <li>{@link mpia.schema.TypeEmploiRessourceActivite#getMethodeControle <em>Methode Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEmploiRessourceActivite()
 * @model abstract="true"
 *        annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_EmploiRessourceActivite' kind='elementOnly'"
 * @generated
 */
public interface TypeEmploiRessourceActivite extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Trajectoire Tir</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEmploiRessourceActiviteTypeTrajectoireTir}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Trajectoire Tir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Trajectoire Tir</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEmploiRessourceActiviteTypeTrajectoireTir
	 * @see #isSetTypeTrajectoireTir()
	 * @see #unsetTypeTrajectoireTir()
	 * @see #setTypeTrajectoireTir(TypeDictionaryDicoEmploiRessourceActiviteTypeTrajectoireTir)
	 * @see mpia.schema.SchemaPackage#getTypeEmploiRessourceActivite_TypeTrajectoireTir()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeTrajectoireTir'"
	 * @generated
	 */
	TypeDictionaryDicoEmploiRessourceActiviteTypeTrajectoireTir getTypeTrajectoireTir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEmploiRessourceActivite#getTypeTrajectoireTir <em>Type Trajectoire Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Trajectoire Tir</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEmploiRessourceActiviteTypeTrajectoireTir
	 * @see #isSetTypeTrajectoireTir()
	 * @see #unsetTypeTrajectoireTir()
	 * @see #getTypeTrajectoireTir()
	 * @generated
	 */
	void setTypeTrajectoireTir(TypeDictionaryDicoEmploiRessourceActiviteTypeTrajectoireTir value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEmploiRessourceActivite#getTypeTrajectoireTir <em>Type Trajectoire Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeTrajectoireTir()
	 * @see #getTypeTrajectoireTir()
	 * @see #setTypeTrajectoireTir(TypeDictionaryDicoEmploiRessourceActiviteTypeTrajectoireTir)
	 * @generated
	 */
	void unsetTypeTrajectoireTir();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEmploiRessourceActivite#getTypeTrajectoireTir <em>Type Trajectoire Tir</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Trajectoire Tir</em>' attribute is set.
	 * @see #unsetTypeTrajectoireTir()
	 * @see #getTypeTrajectoireTir()
	 * @see #setTypeTrajectoireTir(TypeDictionaryDicoEmploiRessourceActiviteTypeTrajectoireTir)
	 * @generated
	 */
	boolean isSetTypeTrajectoireTir();

	/**
	 * Returns the value of the '<em><b>Angle Tir</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle Tir</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle Tir</em>' containment reference.
	 * @see #setAngleTir(TypeDataTypeAngle)
	 * @see mpia.schema.SchemaPackage#getTypeEmploiRessourceActivite_AngleTir()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AngleTir'"
	 * @generated
	 */
	TypeDataTypeAngle getAngleTir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEmploiRessourceActivite#getAngleTir <em>Angle Tir</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Tir</em>' containment reference.
	 * @see #getAngleTir()
	 * @generated
	 */
	void setAngleTir(TypeDataTypeAngle value);

	/**
	 * Returns the value of the '<em><b>Methode Controle</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEmploiRessourceActiviteMethodeControle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methode Controle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methode Controle</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEmploiRessourceActiviteMethodeControle
	 * @see #isSetMethodeControle()
	 * @see #unsetMethodeControle()
	 * @see #setMethodeControle(TypeDictionaryDicoEmploiRessourceActiviteMethodeControle)
	 * @see mpia.schema.SchemaPackage#getTypeEmploiRessourceActivite_MethodeControle()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='MethodeControle'"
	 * @generated
	 */
	TypeDictionaryDicoEmploiRessourceActiviteMethodeControle getMethodeControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEmploiRessourceActivite#getMethodeControle <em>Methode Controle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Methode Controle</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEmploiRessourceActiviteMethodeControle
	 * @see #isSetMethodeControle()
	 * @see #unsetMethodeControle()
	 * @see #getMethodeControle()
	 * @generated
	 */
	void setMethodeControle(TypeDictionaryDicoEmploiRessourceActiviteMethodeControle value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEmploiRessourceActivite#getMethodeControle <em>Methode Controle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMethodeControle()
	 * @see #getMethodeControle()
	 * @see #setMethodeControle(TypeDictionaryDicoEmploiRessourceActiviteMethodeControle)
	 * @generated
	 */
	void unsetMethodeControle();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEmploiRessourceActivite#getMethodeControle <em>Methode Controle</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Methode Controle</em>' attribute is set.
	 * @see #unsetMethodeControle()
	 * @see #getMethodeControle()
	 * @see #setMethodeControle(TypeDictionaryDicoEmploiRessourceActiviteMethodeControle)
	 * @generated
	 */
	boolean isSetMethodeControle();

} // TypeEmploiRessourceActivite
