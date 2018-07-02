/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeLongueur;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Assoc Piste Atter Dir App Air</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssocPisteAtterDirAppAir#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssocPisteAtterDirAppAir#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssocPisteAtterDirAppAir#getInclinaison <em>Inclinaison</em>}</li>
 *   <li>{@link mpia.schema.TypeAssocPisteAtterDirAppAir#getLongueurUtilePourAtterissage <em>Longueur Utile Pour Atterissage</em>}</li>
 *   <li>{@link mpia.schema.TypeAssocPisteAtterDirAppAir#getLongueurUtilePourDecollage <em>Longueur Utile Pour Decollage</em>}</li>
 *   <li>{@link mpia.schema.TypeAssocPisteAtterDirAppAir#getACommeDirectionApprocheDirectionApprocheAir <em>AComme Direction Approche Direction Approche Air</em>}</li>
 *   <li>{@link mpia.schema.TypeAssocPisteAtterDirAppAir#getACommePisteAtterrissagePisteAtterrissage <em>AComme Piste Atterrissage Piste Atterrissage</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssocPisteAtterDirAppAir()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssocPisteAtterDirAppAir' kind='elementOnly'"
 * @generated
 */
public interface TypeAssocPisteAtterDirAppAir extends EObject {
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
	 * @see mpia.schema.SchemaPackage#getTypeAssocPisteAtterDirAppAir_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssocPisteAtterDirAppAir#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeAssocPisteAtterDirAppAir_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssocPisteAtterDirAppAir#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Inclinaison</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inclinaison</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inclinaison</em>' attribute.
	 * @see #isSetInclinaison()
	 * @see #unsetInclinaison()
	 * @see #setInclinaison(double)
	 * @see mpia.schema.SchemaPackage#getTypeAssocPisteAtterDirAppAir_Inclinaison()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='Inclinaison'"
	 * @generated
	 */
	double getInclinaison();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssocPisteAtterDirAppAir#getInclinaison <em>Inclinaison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inclinaison</em>' attribute.
	 * @see #isSetInclinaison()
	 * @see #unsetInclinaison()
	 * @see #getInclinaison()
	 * @generated
	 */
	void setInclinaison(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssocPisteAtterDirAppAir#getInclinaison <em>Inclinaison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInclinaison()
	 * @see #getInclinaison()
	 * @see #setInclinaison(double)
	 * @generated
	 */
	void unsetInclinaison();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssocPisteAtterDirAppAir#getInclinaison <em>Inclinaison</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Inclinaison</em>' attribute is set.
	 * @see #unsetInclinaison()
	 * @see #getInclinaison()
	 * @see #setInclinaison(double)
	 * @generated
	 */
	boolean isSetInclinaison();

	/**
	 * Returns the value of the '<em><b>Longueur Utile Pour Atterissage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Longueur Utile Pour Atterissage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longueur Utile Pour Atterissage</em>' containment reference.
	 * @see #setLongueurUtilePourAtterissage(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeAssocPisteAtterDirAppAir_LongueurUtilePourAtterissage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LongueurUtilePourAtterissage'"
	 * @generated
	 */
	TypeDataTypeLongueur getLongueurUtilePourAtterissage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssocPisteAtterDirAppAir#getLongueurUtilePourAtterissage <em>Longueur Utile Pour Atterissage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longueur Utile Pour Atterissage</em>' containment reference.
	 * @see #getLongueurUtilePourAtterissage()
	 * @generated
	 */
	void setLongueurUtilePourAtterissage(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Longueur Utile Pour Decollage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Longueur Utile Pour Decollage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longueur Utile Pour Decollage</em>' containment reference.
	 * @see #setLongueurUtilePourDecollage(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeAssocPisteAtterDirAppAir_LongueurUtilePourDecollage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LongueurUtilePourDecollage'"
	 * @generated
	 */
	TypeDataTypeLongueur getLongueurUtilePourDecollage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssocPisteAtterDirAppAir#getLongueurUtilePourDecollage <em>Longueur Utile Pour Decollage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longueur Utile Pour Decollage</em>' containment reference.
	 * @see #getLongueurUtilePourDecollage()
	 * @generated
	 */
	void setLongueurUtilePourDecollage(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>AComme Direction Approche Direction Approche Air</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Direction Approche Direction Approche Air</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Direction Approche Direction Approche Air</em>' containment reference.
	 * @see #setACommeDirectionApprocheDirectionApprocheAir(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssocPisteAtterDirAppAir_ACommeDirectionApprocheDirectionApprocheAir()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_DirectionApprocheAir'"
	 *        extendedMetaData="kind='element' name='ACommeDirectionApproche_DirectionApprocheAir'"
	 * @generated
	 */
	TypeAssociation getACommeDirectionApprocheDirectionApprocheAir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssocPisteAtterDirAppAir#getACommeDirectionApprocheDirectionApprocheAir <em>AComme Direction Approche Direction Approche Air</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Direction Approche Direction Approche Air</em>' containment reference.
	 * @see #getACommeDirectionApprocheDirectionApprocheAir()
	 * @generated
	 */
	void setACommeDirectionApprocheDirectionApprocheAir(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>AComme Piste Atterrissage Piste Atterrissage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Piste Atterrissage Piste Atterrissage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Piste Atterrissage Piste Atterrissage</em>' containment reference.
	 * @see #setACommePisteAtterrissagePisteAtterrissage(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssocPisteAtterDirAppAir_ACommePisteAtterrissagePisteAtterrissage()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_PisteAtterrissage'"
	 *        extendedMetaData="kind='element' name='ACommePisteAtterrissage_PisteAtterrissage'"
	 * @generated
	 */
	TypeAssociation getACommePisteAtterrissagePisteAtterrissage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssocPisteAtterDirAppAir#getACommePisteAtterrissagePisteAtterrissage <em>AComme Piste Atterrissage Piste Atterrissage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Piste Atterrissage Piste Atterrissage</em>' containment reference.
	 * @see #getACommePisteAtterrissagePisteAtterrissage()
	 * @generated
	 */
	void setACommePisteAtterrissagePisteAtterrissage(TypeAssociation value);

} // TypeAssocPisteAtterDirAppAir
