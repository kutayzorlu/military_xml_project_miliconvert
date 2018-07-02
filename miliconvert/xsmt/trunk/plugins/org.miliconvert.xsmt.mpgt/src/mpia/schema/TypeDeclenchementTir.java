/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Declenchement Tir</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeDeclenchementTir#getModeDeclenchement <em>Mode Declenchement</em>}</li>
 *   <li>{@link mpia.schema.TypeDeclenchementTir#getDateDeclenchement <em>Date Declenchement</em>}</li>
 *   <li>{@link mpia.schema.TypeDeclenchementTir#getDateLimiteDeclenchement <em>Date Limite Declenchement</em>}</li>
 *   <li>{@link mpia.schema.TypeDeclenchementTir#getAPourAutoriteDeclenchementUnite <em>APour Autorite Declenchement Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeDeclenchementTir()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_DeclenchementTir' kind='elementOnly'"
 * @generated
 */
public interface TypeDeclenchementTir extends EObject {
	/**
	 * Returns the value of the '<em><b>Mode Declenchement</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoDeclenchementTirModeDeclenchement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode Declenchement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode Declenchement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDeclenchementTirModeDeclenchement
	 * @see #isSetModeDeclenchement()
	 * @see #unsetModeDeclenchement()
	 * @see #setModeDeclenchement(TypeDictionaryDicoDeclenchementTirModeDeclenchement)
	 * @see mpia.schema.SchemaPackage#getTypeDeclenchementTir_ModeDeclenchement()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ModeDeclenchement'"
	 * @generated
	 */
	TypeDictionaryDicoDeclenchementTirModeDeclenchement getModeDeclenchement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDeclenchementTir#getModeDeclenchement <em>Mode Declenchement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode Declenchement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDeclenchementTirModeDeclenchement
	 * @see #isSetModeDeclenchement()
	 * @see #unsetModeDeclenchement()
	 * @see #getModeDeclenchement()
	 * @generated
	 */
	void setModeDeclenchement(TypeDictionaryDicoDeclenchementTirModeDeclenchement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDeclenchementTir#getModeDeclenchement <em>Mode Declenchement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetModeDeclenchement()
	 * @see #getModeDeclenchement()
	 * @see #setModeDeclenchement(TypeDictionaryDicoDeclenchementTirModeDeclenchement)
	 * @generated
	 */
	void unsetModeDeclenchement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDeclenchementTir#getModeDeclenchement <em>Mode Declenchement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mode Declenchement</em>' attribute is set.
	 * @see #unsetModeDeclenchement()
	 * @see #getModeDeclenchement()
	 * @see #setModeDeclenchement(TypeDictionaryDicoDeclenchementTirModeDeclenchement)
	 * @generated
	 */
	boolean isSetModeDeclenchement();

	/**
	 * Returns the value of the '<em><b>Date Declenchement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Declenchement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Declenchement</em>' attribute.
	 * @see #setDateDeclenchement(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeDeclenchementTir_DateDeclenchement()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateDeclenchement'"
	 * @generated
	 */
	XMLGregorianCalendar getDateDeclenchement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDeclenchementTir#getDateDeclenchement <em>Date Declenchement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Declenchement</em>' attribute.
	 * @see #getDateDeclenchement()
	 * @generated
	 */
	void setDateDeclenchement(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Date Limite Declenchement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Limite Declenchement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Limite Declenchement</em>' attribute.
	 * @see #setDateLimiteDeclenchement(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeDeclenchementTir_DateLimiteDeclenchement()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateLimiteDeclenchement'"
	 * @generated
	 */
	XMLGregorianCalendar getDateLimiteDeclenchement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDeclenchementTir#getDateLimiteDeclenchement <em>Date Limite Declenchement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Limite Declenchement</em>' attribute.
	 * @see #getDateLimiteDeclenchement()
	 * @generated
	 */
	void setDateLimiteDeclenchement(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>APour Autorite Declenchement Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Autorite Declenchement Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Autorite Declenchement Unite</em>' containment reference.
	 * @see #setAPourAutoriteDeclenchementUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeDeclenchementTir_APourAutoriteDeclenchementUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourAutoriteDeclenchement_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getAPourAutoriteDeclenchementUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDeclenchementTir#getAPourAutoriteDeclenchementUnite <em>APour Autorite Declenchement Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Autorite Declenchement Unite</em>' containment reference.
	 * @see #getAPourAutoriteDeclenchementUnite()
	 * @generated
	 */
	void setAPourAutoriteDeclenchementUnite(TypeAssociationEXT value);

} // TypeDeclenchementTir
