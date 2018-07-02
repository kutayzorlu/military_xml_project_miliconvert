/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Consigne Tir</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeConsigneTir#getConsigneTirGenerale <em>Consigne Tir Generale</em>}</li>
 *   <li>{@link mpia.schema.TypeConsigneTir#getConsigneTirSurAvion <em>Consigne Tir Sur Avion</em>}</li>
 *   <li>{@link mpia.schema.TypeConsigneTir#getConsigneTirSurDrone <em>Consigne Tir Sur Drone</em>}</li>
 *   <li>{@link mpia.schema.TypeConsigneTir#getConsigneTirSurHelicoptere <em>Consigne Tir Sur Helicoptere</em>}</li>
 *   <li>{@link mpia.schema.TypeConsigneTir#getConsigneTirSurMissile <em>Consigne Tir Sur Missile</em>}</li>
 *   <li>{@link mpia.schema.TypeConsigneTir#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeConsigneTir#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeConsigneTir#getSAppliqueAMenaceAerienneMenaceAerienne <em>SApplique AMenace Aerienne Menace Aerienne</em>}</li>
 *   <li>{@link mpia.schema.TypeConsigneTir#getSAppliqueSurAutreElementControle <em>SApplique Sur Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeConsigneTir#getEstDefiniePourUnite <em>Est Definie Pour Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeConsigneTir#getDefinitPourTypeMesureCoordinationTypeMesureCoordination <em>Definit Pour Type Mesure Coordination Type Mesure Coordination</em>}</li>
 *   <li>{@link mpia.schema.TypeConsigneTir#getDefinitPourSystemeArmeTypeArme <em>Definit Pour Systeme Arme Type Arme</em>}</li>
 *   <li>{@link mpia.schema.TypeConsigneTir#getVautPendantPeriode3D <em>Vaut Pendant Periode3 D</em>}</li>
 *   <li>{@link mpia.schema.TypeConsigneTir#getDefinitPourMesureCoordinationMesureCoordination <em>Definit Pour Mesure Coordination Mesure Coordination</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeConsigneTir()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_ConsigneTir' kind='elementOnly'"
 * @generated
 */
public interface TypeConsigneTir extends EObject {
	/**
	 * Returns the value of the '<em><b>Consigne Tir Generale</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoConsigneTir}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consigne Tir Generale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consigne Tir Generale</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoConsigneTir
	 * @see #isSetConsigneTirGenerale()
	 * @see #unsetConsigneTirGenerale()
	 * @see #setConsigneTirGenerale(TypeDictionaryDicoConsigneTir)
	 * @see mpia.schema.SchemaPackage#getTypeConsigneTir_ConsigneTirGenerale()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ConsigneTirGenerale'"
	 * @generated
	 */
	TypeDictionaryDicoConsigneTir getConsigneTirGenerale();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsigneTir#getConsigneTirGenerale <em>Consigne Tir Generale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consigne Tir Generale</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoConsigneTir
	 * @see #isSetConsigneTirGenerale()
	 * @see #unsetConsigneTirGenerale()
	 * @see #getConsigneTirGenerale()
	 * @generated
	 */
	void setConsigneTirGenerale(TypeDictionaryDicoConsigneTir value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeConsigneTir#getConsigneTirGenerale <em>Consigne Tir Generale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConsigneTirGenerale()
	 * @see #getConsigneTirGenerale()
	 * @see #setConsigneTirGenerale(TypeDictionaryDicoConsigneTir)
	 * @generated
	 */
	void unsetConsigneTirGenerale();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeConsigneTir#getConsigneTirGenerale <em>Consigne Tir Generale</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Consigne Tir Generale</em>' attribute is set.
	 * @see #unsetConsigneTirGenerale()
	 * @see #getConsigneTirGenerale()
	 * @see #setConsigneTirGenerale(TypeDictionaryDicoConsigneTir)
	 * @generated
	 */
	boolean isSetConsigneTirGenerale();

	/**
	 * Returns the value of the '<em><b>Consigne Tir Sur Avion</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoConsigneTir}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consigne Tir Sur Avion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consigne Tir Sur Avion</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoConsigneTir
	 * @see #isSetConsigneTirSurAvion()
	 * @see #unsetConsigneTirSurAvion()
	 * @see #setConsigneTirSurAvion(TypeDictionaryDicoConsigneTir)
	 * @see mpia.schema.SchemaPackage#getTypeConsigneTir_ConsigneTirSurAvion()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ConsigneTirSurAvion'"
	 * @generated
	 */
	TypeDictionaryDicoConsigneTir getConsigneTirSurAvion();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsigneTir#getConsigneTirSurAvion <em>Consigne Tir Sur Avion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consigne Tir Sur Avion</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoConsigneTir
	 * @see #isSetConsigneTirSurAvion()
	 * @see #unsetConsigneTirSurAvion()
	 * @see #getConsigneTirSurAvion()
	 * @generated
	 */
	void setConsigneTirSurAvion(TypeDictionaryDicoConsigneTir value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeConsigneTir#getConsigneTirSurAvion <em>Consigne Tir Sur Avion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConsigneTirSurAvion()
	 * @see #getConsigneTirSurAvion()
	 * @see #setConsigneTirSurAvion(TypeDictionaryDicoConsigneTir)
	 * @generated
	 */
	void unsetConsigneTirSurAvion();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeConsigneTir#getConsigneTirSurAvion <em>Consigne Tir Sur Avion</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Consigne Tir Sur Avion</em>' attribute is set.
	 * @see #unsetConsigneTirSurAvion()
	 * @see #getConsigneTirSurAvion()
	 * @see #setConsigneTirSurAvion(TypeDictionaryDicoConsigneTir)
	 * @generated
	 */
	boolean isSetConsigneTirSurAvion();

	/**
	 * Returns the value of the '<em><b>Consigne Tir Sur Drone</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoConsigneTir}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consigne Tir Sur Drone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consigne Tir Sur Drone</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoConsigneTir
	 * @see #isSetConsigneTirSurDrone()
	 * @see #unsetConsigneTirSurDrone()
	 * @see #setConsigneTirSurDrone(TypeDictionaryDicoConsigneTir)
	 * @see mpia.schema.SchemaPackage#getTypeConsigneTir_ConsigneTirSurDrone()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ConsigneTirSurDrone'"
	 * @generated
	 */
	TypeDictionaryDicoConsigneTir getConsigneTirSurDrone();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsigneTir#getConsigneTirSurDrone <em>Consigne Tir Sur Drone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consigne Tir Sur Drone</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoConsigneTir
	 * @see #isSetConsigneTirSurDrone()
	 * @see #unsetConsigneTirSurDrone()
	 * @see #getConsigneTirSurDrone()
	 * @generated
	 */
	void setConsigneTirSurDrone(TypeDictionaryDicoConsigneTir value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeConsigneTir#getConsigneTirSurDrone <em>Consigne Tir Sur Drone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConsigneTirSurDrone()
	 * @see #getConsigneTirSurDrone()
	 * @see #setConsigneTirSurDrone(TypeDictionaryDicoConsigneTir)
	 * @generated
	 */
	void unsetConsigneTirSurDrone();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeConsigneTir#getConsigneTirSurDrone <em>Consigne Tir Sur Drone</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Consigne Tir Sur Drone</em>' attribute is set.
	 * @see #unsetConsigneTirSurDrone()
	 * @see #getConsigneTirSurDrone()
	 * @see #setConsigneTirSurDrone(TypeDictionaryDicoConsigneTir)
	 * @generated
	 */
	boolean isSetConsigneTirSurDrone();

	/**
	 * Returns the value of the '<em><b>Consigne Tir Sur Helicoptere</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoConsigneTir}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consigne Tir Sur Helicoptere</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consigne Tir Sur Helicoptere</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoConsigneTir
	 * @see #isSetConsigneTirSurHelicoptere()
	 * @see #unsetConsigneTirSurHelicoptere()
	 * @see #setConsigneTirSurHelicoptere(TypeDictionaryDicoConsigneTir)
	 * @see mpia.schema.SchemaPackage#getTypeConsigneTir_ConsigneTirSurHelicoptere()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ConsigneTirSurHelicoptere'"
	 * @generated
	 */
	TypeDictionaryDicoConsigneTir getConsigneTirSurHelicoptere();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsigneTir#getConsigneTirSurHelicoptere <em>Consigne Tir Sur Helicoptere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consigne Tir Sur Helicoptere</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoConsigneTir
	 * @see #isSetConsigneTirSurHelicoptere()
	 * @see #unsetConsigneTirSurHelicoptere()
	 * @see #getConsigneTirSurHelicoptere()
	 * @generated
	 */
	void setConsigneTirSurHelicoptere(TypeDictionaryDicoConsigneTir value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeConsigneTir#getConsigneTirSurHelicoptere <em>Consigne Tir Sur Helicoptere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConsigneTirSurHelicoptere()
	 * @see #getConsigneTirSurHelicoptere()
	 * @see #setConsigneTirSurHelicoptere(TypeDictionaryDicoConsigneTir)
	 * @generated
	 */
	void unsetConsigneTirSurHelicoptere();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeConsigneTir#getConsigneTirSurHelicoptere <em>Consigne Tir Sur Helicoptere</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Consigne Tir Sur Helicoptere</em>' attribute is set.
	 * @see #unsetConsigneTirSurHelicoptere()
	 * @see #getConsigneTirSurHelicoptere()
	 * @see #setConsigneTirSurHelicoptere(TypeDictionaryDicoConsigneTir)
	 * @generated
	 */
	boolean isSetConsigneTirSurHelicoptere();

	/**
	 * Returns the value of the '<em><b>Consigne Tir Sur Missile</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoConsigneTir}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consigne Tir Sur Missile</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consigne Tir Sur Missile</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoConsigneTir
	 * @see #isSetConsigneTirSurMissile()
	 * @see #unsetConsigneTirSurMissile()
	 * @see #setConsigneTirSurMissile(TypeDictionaryDicoConsigneTir)
	 * @see mpia.schema.SchemaPackage#getTypeConsigneTir_ConsigneTirSurMissile()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ConsigneTirSurMissile'"
	 * @generated
	 */
	TypeDictionaryDicoConsigneTir getConsigneTirSurMissile();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsigneTir#getConsigneTirSurMissile <em>Consigne Tir Sur Missile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consigne Tir Sur Missile</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoConsigneTir
	 * @see #isSetConsigneTirSurMissile()
	 * @see #unsetConsigneTirSurMissile()
	 * @see #getConsigneTirSurMissile()
	 * @generated
	 */
	void setConsigneTirSurMissile(TypeDictionaryDicoConsigneTir value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeConsigneTir#getConsigneTirSurMissile <em>Consigne Tir Sur Missile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConsigneTirSurMissile()
	 * @see #getConsigneTirSurMissile()
	 * @see #setConsigneTirSurMissile(TypeDictionaryDicoConsigneTir)
	 * @generated
	 */
	void unsetConsigneTirSurMissile();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeConsigneTir#getConsigneTirSurMissile <em>Consigne Tir Sur Missile</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Consigne Tir Sur Missile</em>' attribute is set.
	 * @see #unsetConsigneTirSurMissile()
	 * @see #getConsigneTirSurMissile()
	 * @see #setConsigneTirSurMissile(TypeDictionaryDicoConsigneTir)
	 * @generated
	 */
	boolean isSetConsigneTirSurMissile();

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
	 * @see mpia.schema.SchemaPackage#getTypeConsigneTir_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsigneTir#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeConsigneTir_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsigneTir#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>SApplique AMenace Aerienne Menace Aerienne</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SApplique AMenace Aerienne Menace Aerienne</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SApplique AMenace Aerienne Menace Aerienne</em>' containment reference.
	 * @see #setSAppliqueAMenaceAerienneMenaceAerienne(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeConsigneTir_SAppliqueAMenaceAerienneMenaceAerienne()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_MenaceAerienne'"
	 *        extendedMetaData="kind='element' name='SAppliqueAMenaceAerienne_MenaceAerienne'"
	 * @generated
	 */
	TypeAssociation getSAppliqueAMenaceAerienneMenaceAerienne();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsigneTir#getSAppliqueAMenaceAerienneMenaceAerienne <em>SApplique AMenace Aerienne Menace Aerienne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SApplique AMenace Aerienne Menace Aerienne</em>' containment reference.
	 * @see #getSAppliqueAMenaceAerienneMenaceAerienne()
	 * @generated
	 */
	void setSAppliqueAMenaceAerienneMenaceAerienne(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>SApplique Sur Autre Element Controle</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SApplique Sur Autre Element Controle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SApplique Sur Autre Element Controle</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeConsigneTir_SAppliqueSurAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='SAppliqueSur_AutreElementControle'"
	 * @generated
	 */
	EList<TypeAssociation> getSAppliqueSurAutreElementControle();

	/**
	 * Returns the value of the '<em><b>Est Definie Pour Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociationEXT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Definie Pour Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Definie Pour Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeConsigneTir_EstDefiniePourUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='EstDefiniePour_Unite'"
	 * @generated
	 */
	EList<TypeAssociationEXT> getEstDefiniePourUnite();

	/**
	 * Returns the value of the '<em><b>Definit Pour Type Mesure Coordination Type Mesure Coordination</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definit Pour Type Mesure Coordination Type Mesure Coordination</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definit Pour Type Mesure Coordination Type Mesure Coordination</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeConsigneTir_DefinitPourTypeMesureCoordinationTypeMesureCoordination()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeMesureCoordination'"
	 *        extendedMetaData="kind='element' name='DefinitPourTypeMesureCoordination_TypeMesureCoordination'"
	 * @generated
	 */
	EList<TypeAssociation> getDefinitPourTypeMesureCoordinationTypeMesureCoordination();

	/**
	 * Returns the value of the '<em><b>Definit Pour Systeme Arme Type Arme</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definit Pour Systeme Arme Type Arme</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definit Pour Systeme Arme Type Arme</em>' containment reference.
	 * @see #setDefinitPourSystemeArmeTypeArme(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeConsigneTir_DefinitPourSystemeArmeTypeArme()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeArme'"
	 *        extendedMetaData="kind='element' name='DefinitPourSystemeArme_TypeArme'"
	 * @generated
	 */
	TypeAssociationEXT getDefinitPourSystemeArmeTypeArme();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsigneTir#getDefinitPourSystemeArmeTypeArme <em>Definit Pour Systeme Arme Type Arme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definit Pour Systeme Arme Type Arme</em>' containment reference.
	 * @see #getDefinitPourSystemeArmeTypeArme()
	 * @generated
	 */
	void setDefinitPourSystemeArmeTypeArme(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>Vaut Pendant Periode3 D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vaut Pendant Periode3 D</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vaut Pendant Periode3 D</em>' containment reference.
	 * @see #setVautPendantPeriode3D(TypePeriode3D)
	 * @see mpia.schema.SchemaPackage#getTypeConsigneTir_VautPendantPeriode3D()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Periode3D'"
	 *        extendedMetaData="kind='element' name='VautPendant_Periode3D'"
	 * @generated
	 */
	TypePeriode3D getVautPendantPeriode3D();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsigneTir#getVautPendantPeriode3D <em>Vaut Pendant Periode3 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vaut Pendant Periode3 D</em>' containment reference.
	 * @see #getVautPendantPeriode3D()
	 * @generated
	 */
	void setVautPendantPeriode3D(TypePeriode3D value);

	/**
	 * Returns the value of the '<em><b>Definit Pour Mesure Coordination Mesure Coordination</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definit Pour Mesure Coordination Mesure Coordination</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definit Pour Mesure Coordination Mesure Coordination</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeConsigneTir_DefinitPourMesureCoordinationMesureCoordination()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSoumiseA_ConsigneTir' target_entity='type_MesureCoordination'"
	 *        extendedMetaData="kind='element' name='DefinitPourMesureCoordination_MesureCoordination'"
	 * @generated
	 */
	EList<TypeAssociation> getDefinitPourMesureCoordinationMesureCoordination();

} // TypeConsigneTir
