/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Effet Sur Instance Objet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEffetSurInstanceObjet#getTypeAttaque <em>Type Attaque</em>}</li>
 *   <li>{@link mpia.schema.TypeEffetSurInstanceObjet#getFraction <em>Fraction</em>}</li>
 *   <li>{@link mpia.schema.TypeEffetSurInstanceObjet#getEstEnProfondeurEffetProfondeurASS <em>Est En Profondeur Effet Profondeur ASS</em>}</li>
 *   <li>{@link mpia.schema.TypeEffetSurInstanceObjet#getAssocieCommeInstanceObjetInstanceObjet <em>Associe Comme Instance Objet Instance Objet</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEffetSurInstanceObjet()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_EffetSurInstanceObjet' kind='elementOnly'"
 * @generated
 */
public interface TypeEffetSurInstanceObjet extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Attaque</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEffetSurInstanceObjetTypeAttaque}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Attaque</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Attaque</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEffetSurInstanceObjetTypeAttaque
	 * @see #isSetTypeAttaque()
	 * @see #unsetTypeAttaque()
	 * @see #setTypeAttaque(TypeDictionaryDicoEffetSurInstanceObjetTypeAttaque)
	 * @see mpia.schema.SchemaPackage#getTypeEffetSurInstanceObjet_TypeAttaque()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeAttaque'"
	 * @generated
	 */
	TypeDictionaryDicoEffetSurInstanceObjetTypeAttaque getTypeAttaque();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEffetSurInstanceObjet#getTypeAttaque <em>Type Attaque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Attaque</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEffetSurInstanceObjetTypeAttaque
	 * @see #isSetTypeAttaque()
	 * @see #unsetTypeAttaque()
	 * @see #getTypeAttaque()
	 * @generated
	 */
	void setTypeAttaque(TypeDictionaryDicoEffetSurInstanceObjetTypeAttaque value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEffetSurInstanceObjet#getTypeAttaque <em>Type Attaque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeAttaque()
	 * @see #getTypeAttaque()
	 * @see #setTypeAttaque(TypeDictionaryDicoEffetSurInstanceObjetTypeAttaque)
	 * @generated
	 */
	void unsetTypeAttaque();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEffetSurInstanceObjet#getTypeAttaque <em>Type Attaque</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Attaque</em>' attribute is set.
	 * @see #unsetTypeAttaque()
	 * @see #getTypeAttaque()
	 * @see #setTypeAttaque(TypeDictionaryDicoEffetSurInstanceObjetTypeAttaque)
	 * @generated
	 */
	boolean isSetTypeAttaque();

	/**
	 * Returns the value of the '<em><b>Fraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fraction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fraction</em>' attribute.
	 * @see #isSetFraction()
	 * @see #unsetFraction()
	 * @see #setFraction(double)
	 * @see mpia.schema.SchemaPackage#getTypeEffetSurInstanceObjet_Fraction()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeFraction"
	 *        extendedMetaData="kind='element' name='Fraction'"
	 * @generated
	 */
	double getFraction();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEffetSurInstanceObjet#getFraction <em>Fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fraction</em>' attribute.
	 * @see #isSetFraction()
	 * @see #unsetFraction()
	 * @see #getFraction()
	 * @generated
	 */
	void setFraction(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEffetSurInstanceObjet#getFraction <em>Fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFraction()
	 * @see #getFraction()
	 * @see #setFraction(double)
	 * @generated
	 */
	void unsetFraction();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEffetSurInstanceObjet#getFraction <em>Fraction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fraction</em>' attribute is set.
	 * @see #unsetFraction()
	 * @see #getFraction()
	 * @see #setFraction(double)
	 * @generated
	 */
	boolean isSetFraction();

	/**
	 * Returns the value of the '<em><b>Est En Profondeur Effet Profondeur ASS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est En Profondeur Effet Profondeur ASS</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est En Profondeur Effet Profondeur ASS</em>' containment reference.
	 * @see #setEstEnProfondeurEffetProfondeurASS(TypeEffetProfondeurASS)
	 * @see mpia.schema.SchemaPackage#getTypeEffetSurInstanceObjet_EstEnProfondeurEffetProfondeurASS()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EffetProfondeurASS'"
	 *        extendedMetaData="kind='element' name='EstEnProfondeur_EffetProfondeurASS'"
	 * @generated
	 */
	TypeEffetProfondeurASS getEstEnProfondeurEffetProfondeurASS();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEffetSurInstanceObjet#getEstEnProfondeurEffetProfondeurASS <em>Est En Profondeur Effet Profondeur ASS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est En Profondeur Effet Profondeur ASS</em>' containment reference.
	 * @see #getEstEnProfondeurEffetProfondeurASS()
	 * @generated
	 */
	void setEstEnProfondeurEffetProfondeurASS(TypeEffetProfondeurASS value);

	/**
	 * Returns the value of the '<em><b>Associe Comme Instance Objet Instance Objet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Instance Objet Instance Objet</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Instance Objet Instance Objet</em>' containment reference.
	 * @see #setAssocieCommeInstanceObjetInstanceObjet(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeEffetSurInstanceObjet_AssocieCommeInstanceObjetInstanceObjet()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_InstanceObjet'"
	 *        extendedMetaData="kind='element' name='AssocieCommeInstanceObjet_InstanceObjet'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeInstanceObjetInstanceObjet();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEffetSurInstanceObjet#getAssocieCommeInstanceObjetInstanceObjet <em>Associe Comme Instance Objet Instance Objet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Instance Objet Instance Objet</em>' containment reference.
	 * @see #getAssocieCommeInstanceObjetInstanceObjet()
	 * @generated
	 */
	void setAssocieCommeInstanceObjetInstanceObjet(TypeAssociation value);

} // TypeEffetSurInstanceObjet
