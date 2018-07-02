/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Mine Explosif</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMineExplosif#getGDHDebutActivation <em>GDH Debut Activation</em>}</li>
 *   <li>{@link mpia.schema.TypeMineExplosif#getGDHFinActivation <em>GDH Fin Activation</em>}</li>
 *   <li>{@link mpia.schema.TypeMineExplosif#getQuantite <em>Quantite</em>}</li>
 *   <li>{@link mpia.schema.TypeMineExplosif#getAssocieCommeTypeMunitionTypeMunition <em>Associe Comme Type Munition Type Munition</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMineExplosif()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_MineExplosif' kind='elementOnly'"
 * @generated
 */
public interface TypeMineExplosif extends EObject {
	/**
	 * Returns the value of the '<em><b>GDH Debut Activation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GDH Debut Activation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GDH Debut Activation</em>' attribute.
	 * @see #setGDHDebutActivation(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeMineExplosif_GDHDebutActivation()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='GDHDebutActivation'"
	 * @generated
	 */
	XMLGregorianCalendar getGDHDebutActivation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMineExplosif#getGDHDebutActivation <em>GDH Debut Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GDH Debut Activation</em>' attribute.
	 * @see #getGDHDebutActivation()
	 * @generated
	 */
	void setGDHDebutActivation(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>GDH Fin Activation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GDH Fin Activation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GDH Fin Activation</em>' attribute.
	 * @see #setGDHFinActivation(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeMineExplosif_GDHFinActivation()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='GDHFinActivation'"
	 * @generated
	 */
	XMLGregorianCalendar getGDHFinActivation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMineExplosif#getGDHFinActivation <em>GDH Fin Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GDH Fin Activation</em>' attribute.
	 * @see #getGDHFinActivation()
	 * @generated
	 */
	void setGDHFinActivation(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Quantite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite</em>' attribute.
	 * @see #isSetQuantite()
	 * @see #unsetQuantite()
	 * @see #setQuantite(long)
	 * @see mpia.schema.SchemaPackage#getTypeMineExplosif_Quantite()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier9"
	 *        extendedMetaData="kind='element' name='Quantite'"
	 * @generated
	 */
	long getQuantite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMineExplosif#getQuantite <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite</em>' attribute.
	 * @see #isSetQuantite()
	 * @see #unsetQuantite()
	 * @see #getQuantite()
	 * @generated
	 */
	void setQuantite(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMineExplosif#getQuantite <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantite()
	 * @see #getQuantite()
	 * @see #setQuantite(long)
	 * @generated
	 */
	void unsetQuantite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMineExplosif#getQuantite <em>Quantite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantite</em>' attribute is set.
	 * @see #unsetQuantite()
	 * @see #getQuantite()
	 * @see #setQuantite(long)
	 * @generated
	 */
	boolean isSetQuantite();

	/**
	 * Returns the value of the '<em><b>Associe Comme Type Munition Type Munition</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociationEXT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Type Munition Type Munition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Type Munition Type Munition</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMineExplosif_AssocieCommeTypeMunitionTypeMunition()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeMunition'"
	 *        extendedMetaData="kind='element' name='AssocieCommeTypeMunition_TypeMunition'"
	 * @generated
	 */
	EList<TypeAssociationEXT> getAssocieCommeTypeMunitionTypeMunition();

} // TypeMineExplosif
