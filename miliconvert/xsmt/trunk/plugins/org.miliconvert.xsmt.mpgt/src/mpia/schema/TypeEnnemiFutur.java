/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Ennemi Futur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEnnemiFutur#getAttitudeGenerale <em>Attitude Generale</em>}</li>
 *   <li>{@link mpia.schema.TypeEnnemiFutur#getEchelonForce <em>Echelon Force</em>}</li>
 *   <li>{@link mpia.schema.TypeEnnemiFutur#getModeMouvement <em>Mode Mouvement</em>}</li>
 *   <li>{@link mpia.schema.TypeEnnemiFutur#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeEnnemiFutur#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeEnnemiFutur#getConcerneFormationENIUnite <em>Concerne Formation ENI Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeEnnemiFutur#getAPourActionEnvisageeAction <em>APour Action Envisagee Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEnnemiFutur()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_EnnemiFutur' kind='elementOnly'"
 * @generated
 */
public interface TypeEnnemiFutur extends EObject {
	/**
	 * Returns the value of the '<em><b>Attitude Generale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attitude Generale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attitude Generale</em>' attribute.
	 * @see #setAttitudeGenerale(String)
	 * @see mpia.schema.SchemaPackage#getTypeEnnemiFutur_AttitudeGenerale()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='AttitudeGenerale'"
	 * @generated
	 */
	String getAttitudeGenerale();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEnnemiFutur#getAttitudeGenerale <em>Attitude Generale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attitude Generale</em>' attribute.
	 * @see #getAttitudeGenerale()
	 * @generated
	 */
	void setAttitudeGenerale(String value);

	/**
	 * Returns the value of the '<em><b>Echelon Force</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEchelonEchelon}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Echelon Force</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Echelon Force</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEchelonEchelon
	 * @see #isSetEchelonForce()
	 * @see #unsetEchelonForce()
	 * @see #setEchelonForce(TypeDictionaryDicoEchelonEchelon)
	 * @see mpia.schema.SchemaPackage#getTypeEnnemiFutur_EchelonForce()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EchelonForce'"
	 * @generated
	 */
	TypeDictionaryDicoEchelonEchelon getEchelonForce();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEnnemiFutur#getEchelonForce <em>Echelon Force</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Echelon Force</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEchelonEchelon
	 * @see #isSetEchelonForce()
	 * @see #unsetEchelonForce()
	 * @see #getEchelonForce()
	 * @generated
	 */
	void setEchelonForce(TypeDictionaryDicoEchelonEchelon value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEnnemiFutur#getEchelonForce <em>Echelon Force</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEchelonForce()
	 * @see #getEchelonForce()
	 * @see #setEchelonForce(TypeDictionaryDicoEchelonEchelon)
	 * @generated
	 */
	void unsetEchelonForce();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEnnemiFutur#getEchelonForce <em>Echelon Force</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Echelon Force</em>' attribute is set.
	 * @see #unsetEchelonForce()
	 * @see #getEchelonForce()
	 * @see #setEchelonForce(TypeDictionaryDicoEchelonEchelon)
	 * @generated
	 */
	boolean isSetEchelonForce();

	/**
	 * Returns the value of the '<em><b>Mode Mouvement</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoModeMouvement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode Mouvement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode Mouvement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoModeMouvement
	 * @see #isSetModeMouvement()
	 * @see #unsetModeMouvement()
	 * @see #setModeMouvement(TypeDictionaryDicoModeMouvement)
	 * @see mpia.schema.SchemaPackage#getTypeEnnemiFutur_ModeMouvement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ModeMouvement'"
	 * @generated
	 */
	TypeDictionaryDicoModeMouvement getModeMouvement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEnnemiFutur#getModeMouvement <em>Mode Mouvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode Mouvement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoModeMouvement
	 * @see #isSetModeMouvement()
	 * @see #unsetModeMouvement()
	 * @see #getModeMouvement()
	 * @generated
	 */
	void setModeMouvement(TypeDictionaryDicoModeMouvement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEnnemiFutur#getModeMouvement <em>Mode Mouvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetModeMouvement()
	 * @see #getModeMouvement()
	 * @see #setModeMouvement(TypeDictionaryDicoModeMouvement)
	 * @generated
	 */
	void unsetModeMouvement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEnnemiFutur#getModeMouvement <em>Mode Mouvement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mode Mouvement</em>' attribute is set.
	 * @see #unsetModeMouvement()
	 * @see #getModeMouvement()
	 * @see #setModeMouvement(TypeDictionaryDicoModeMouvement)
	 * @generated
	 */
	boolean isSetModeMouvement();

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
	 * @see mpia.schema.SchemaPackage#getTypeEnnemiFutur_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEnnemiFutur#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeEnnemiFutur_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEnnemiFutur#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Concerne Formation ENI Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Formation ENI Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Formation ENI Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEnnemiFutur_ConcerneFormationENIUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='ConcerneFormationENI_Unite'"
	 * @generated
	 */
	EList<TypeAssociation> getConcerneFormationENIUnite();

	/**
	 * Returns the value of the '<em><b>APour Action Envisagee Action</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Action Envisagee Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Action Envisagee Action</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEnnemiFutur_APourActionEnvisageeAction()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Action'"
	 *        extendedMetaData="kind='element' name='APourActionEnvisagee_Action'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourActionEnvisageeAction();

} // TypeEnnemiFutur
