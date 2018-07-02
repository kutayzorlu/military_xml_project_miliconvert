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
 * A representation of the model object '<em><b>Type Evacuation Sanitaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEvacuationSanitaire#isEvacuationImmediate <em>Evacuation Immediate</em>}</li>
 *   <li>{@link mpia.schema.TypeEvacuationSanitaire#getNbTotalBlesses <em>Nb Total Blesses</em>}</li>
 *   <li>{@link mpia.schema.TypeEvacuationSanitaire#getNbBlessesCouches <em>Nb Blesses Couches</em>}</li>
 *   <li>{@link mpia.schema.TypeEvacuationSanitaire#getNbTues <em>Nb Tues</em>}</li>
 *   <li>{@link mpia.schema.TypeEvacuationSanitaire#getNbBlessesTete <em>Nb Blesses Tete</em>}</li>
 *   <li>{@link mpia.schema.TypeEvacuationSanitaire#getNbBlessesTronc <em>Nb Blesses Tronc</em>}</li>
 *   <li>{@link mpia.schema.TypeEvacuationSanitaire#getNbBlessesMembresInf <em>Nb Blesses Membres Inf</em>}</li>
 *   <li>{@link mpia.schema.TypeEvacuationSanitaire#getNbBlessesMembresSup <em>Nb Blesses Membres Sup</em>}</li>
 *   <li>{@link mpia.schema.TypeEvacuationSanitaire#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeEvacuationSanitaire#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeEvacuationSanitaire#getAPourLieuEvacuationAutreElementControle <em>APour Lieu Evacuation Autre Element Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEvacuationSanitaire()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_EvacuationSanitaire' kind='elementOnly'"
 * @generated
 */
public interface TypeEvacuationSanitaire extends EObject {
	/**
	 * Returns the value of the '<em><b>Evacuation Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evacuation Immediate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evacuation Immediate</em>' attribute.
	 * @see #isSetEvacuationImmediate()
	 * @see #unsetEvacuationImmediate()
	 * @see #setEvacuationImmediate(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeEvacuationSanitaire_EvacuationImmediate()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='EvacuationImmediate'"
	 * @generated
	 */
	boolean isEvacuationImmediate();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvacuationSanitaire#isEvacuationImmediate <em>Evacuation Immediate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evacuation Immediate</em>' attribute.
	 * @see #isSetEvacuationImmediate()
	 * @see #unsetEvacuationImmediate()
	 * @see #isEvacuationImmediate()
	 * @generated
	 */
	void setEvacuationImmediate(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEvacuationSanitaire#isEvacuationImmediate <em>Evacuation Immediate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEvacuationImmediate()
	 * @see #isEvacuationImmediate()
	 * @see #setEvacuationImmediate(boolean)
	 * @generated
	 */
	void unsetEvacuationImmediate();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEvacuationSanitaire#isEvacuationImmediate <em>Evacuation Immediate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Evacuation Immediate</em>' attribute is set.
	 * @see #unsetEvacuationImmediate()
	 * @see #isEvacuationImmediate()
	 * @see #setEvacuationImmediate(boolean)
	 * @generated
	 */
	boolean isSetEvacuationImmediate();

	/**
	 * Returns the value of the '<em><b>Nb Total Blesses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Total Blesses</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Total Blesses</em>' attribute.
	 * @see #isSetNbTotalBlesses()
	 * @see #unsetNbTotalBlesses()
	 * @see #setNbTotalBlesses(long)
	 * @see mpia.schema.SchemaPackage#getTypeEvacuationSanitaire_NbTotalBlesses()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NbTotalBlesses'"
	 * @generated
	 */
	long getNbTotalBlesses();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvacuationSanitaire#getNbTotalBlesses <em>Nb Total Blesses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Total Blesses</em>' attribute.
	 * @see #isSetNbTotalBlesses()
	 * @see #unsetNbTotalBlesses()
	 * @see #getNbTotalBlesses()
	 * @generated
	 */
	void setNbTotalBlesses(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEvacuationSanitaire#getNbTotalBlesses <em>Nb Total Blesses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNbTotalBlesses()
	 * @see #getNbTotalBlesses()
	 * @see #setNbTotalBlesses(long)
	 * @generated
	 */
	void unsetNbTotalBlesses();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEvacuationSanitaire#getNbTotalBlesses <em>Nb Total Blesses</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nb Total Blesses</em>' attribute is set.
	 * @see #unsetNbTotalBlesses()
	 * @see #getNbTotalBlesses()
	 * @see #setNbTotalBlesses(long)
	 * @generated
	 */
	boolean isSetNbTotalBlesses();

	/**
	 * Returns the value of the '<em><b>Nb Blesses Couches</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Blesses Couches</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Blesses Couches</em>' attribute.
	 * @see #isSetNbBlessesCouches()
	 * @see #unsetNbBlessesCouches()
	 * @see #setNbBlessesCouches(long)
	 * @see mpia.schema.SchemaPackage#getTypeEvacuationSanitaire_NbBlessesCouches()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NbBlessesCouches'"
	 * @generated
	 */
	long getNbBlessesCouches();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvacuationSanitaire#getNbBlessesCouches <em>Nb Blesses Couches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Blesses Couches</em>' attribute.
	 * @see #isSetNbBlessesCouches()
	 * @see #unsetNbBlessesCouches()
	 * @see #getNbBlessesCouches()
	 * @generated
	 */
	void setNbBlessesCouches(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEvacuationSanitaire#getNbBlessesCouches <em>Nb Blesses Couches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNbBlessesCouches()
	 * @see #getNbBlessesCouches()
	 * @see #setNbBlessesCouches(long)
	 * @generated
	 */
	void unsetNbBlessesCouches();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEvacuationSanitaire#getNbBlessesCouches <em>Nb Blesses Couches</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nb Blesses Couches</em>' attribute is set.
	 * @see #unsetNbBlessesCouches()
	 * @see #getNbBlessesCouches()
	 * @see #setNbBlessesCouches(long)
	 * @generated
	 */
	boolean isSetNbBlessesCouches();

	/**
	 * Returns the value of the '<em><b>Nb Tues</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Tues</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Tues</em>' attribute.
	 * @see #isSetNbTues()
	 * @see #unsetNbTues()
	 * @see #setNbTues(long)
	 * @see mpia.schema.SchemaPackage#getTypeEvacuationSanitaire_NbTues()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NbTues'"
	 * @generated
	 */
	long getNbTues();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvacuationSanitaire#getNbTues <em>Nb Tues</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Tues</em>' attribute.
	 * @see #isSetNbTues()
	 * @see #unsetNbTues()
	 * @see #getNbTues()
	 * @generated
	 */
	void setNbTues(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEvacuationSanitaire#getNbTues <em>Nb Tues</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNbTues()
	 * @see #getNbTues()
	 * @see #setNbTues(long)
	 * @generated
	 */
	void unsetNbTues();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEvacuationSanitaire#getNbTues <em>Nb Tues</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nb Tues</em>' attribute is set.
	 * @see #unsetNbTues()
	 * @see #getNbTues()
	 * @see #setNbTues(long)
	 * @generated
	 */
	boolean isSetNbTues();

	/**
	 * Returns the value of the '<em><b>Nb Blesses Tete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Blesses Tete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Blesses Tete</em>' attribute.
	 * @see #isSetNbBlessesTete()
	 * @see #unsetNbBlessesTete()
	 * @see #setNbBlessesTete(long)
	 * @see mpia.schema.SchemaPackage#getTypeEvacuationSanitaire_NbBlessesTete()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NbBlessesTete'"
	 * @generated
	 */
	long getNbBlessesTete();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvacuationSanitaire#getNbBlessesTete <em>Nb Blesses Tete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Blesses Tete</em>' attribute.
	 * @see #isSetNbBlessesTete()
	 * @see #unsetNbBlessesTete()
	 * @see #getNbBlessesTete()
	 * @generated
	 */
	void setNbBlessesTete(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEvacuationSanitaire#getNbBlessesTete <em>Nb Blesses Tete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNbBlessesTete()
	 * @see #getNbBlessesTete()
	 * @see #setNbBlessesTete(long)
	 * @generated
	 */
	void unsetNbBlessesTete();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEvacuationSanitaire#getNbBlessesTete <em>Nb Blesses Tete</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nb Blesses Tete</em>' attribute is set.
	 * @see #unsetNbBlessesTete()
	 * @see #getNbBlessesTete()
	 * @see #setNbBlessesTete(long)
	 * @generated
	 */
	boolean isSetNbBlessesTete();

	/**
	 * Returns the value of the '<em><b>Nb Blesses Tronc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Blesses Tronc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Blesses Tronc</em>' attribute.
	 * @see #isSetNbBlessesTronc()
	 * @see #unsetNbBlessesTronc()
	 * @see #setNbBlessesTronc(long)
	 * @see mpia.schema.SchemaPackage#getTypeEvacuationSanitaire_NbBlessesTronc()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NbBlessesTronc'"
	 * @generated
	 */
	long getNbBlessesTronc();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvacuationSanitaire#getNbBlessesTronc <em>Nb Blesses Tronc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Blesses Tronc</em>' attribute.
	 * @see #isSetNbBlessesTronc()
	 * @see #unsetNbBlessesTronc()
	 * @see #getNbBlessesTronc()
	 * @generated
	 */
	void setNbBlessesTronc(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEvacuationSanitaire#getNbBlessesTronc <em>Nb Blesses Tronc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNbBlessesTronc()
	 * @see #getNbBlessesTronc()
	 * @see #setNbBlessesTronc(long)
	 * @generated
	 */
	void unsetNbBlessesTronc();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEvacuationSanitaire#getNbBlessesTronc <em>Nb Blesses Tronc</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nb Blesses Tronc</em>' attribute is set.
	 * @see #unsetNbBlessesTronc()
	 * @see #getNbBlessesTronc()
	 * @see #setNbBlessesTronc(long)
	 * @generated
	 */
	boolean isSetNbBlessesTronc();

	/**
	 * Returns the value of the '<em><b>Nb Blesses Membres Inf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Blesses Membres Inf</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Blesses Membres Inf</em>' attribute.
	 * @see #isSetNbBlessesMembresInf()
	 * @see #unsetNbBlessesMembresInf()
	 * @see #setNbBlessesMembresInf(long)
	 * @see mpia.schema.SchemaPackage#getTypeEvacuationSanitaire_NbBlessesMembresInf()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NbBlessesMembresInf'"
	 * @generated
	 */
	long getNbBlessesMembresInf();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvacuationSanitaire#getNbBlessesMembresInf <em>Nb Blesses Membres Inf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Blesses Membres Inf</em>' attribute.
	 * @see #isSetNbBlessesMembresInf()
	 * @see #unsetNbBlessesMembresInf()
	 * @see #getNbBlessesMembresInf()
	 * @generated
	 */
	void setNbBlessesMembresInf(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEvacuationSanitaire#getNbBlessesMembresInf <em>Nb Blesses Membres Inf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNbBlessesMembresInf()
	 * @see #getNbBlessesMembresInf()
	 * @see #setNbBlessesMembresInf(long)
	 * @generated
	 */
	void unsetNbBlessesMembresInf();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEvacuationSanitaire#getNbBlessesMembresInf <em>Nb Blesses Membres Inf</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nb Blesses Membres Inf</em>' attribute is set.
	 * @see #unsetNbBlessesMembresInf()
	 * @see #getNbBlessesMembresInf()
	 * @see #setNbBlessesMembresInf(long)
	 * @generated
	 */
	boolean isSetNbBlessesMembresInf();

	/**
	 * Returns the value of the '<em><b>Nb Blesses Membres Sup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Blesses Membres Sup</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Blesses Membres Sup</em>' attribute.
	 * @see #isSetNbBlessesMembresSup()
	 * @see #unsetNbBlessesMembresSup()
	 * @see #setNbBlessesMembresSup(long)
	 * @see mpia.schema.SchemaPackage#getTypeEvacuationSanitaire_NbBlessesMembresSup()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NbBlessesMembresSup'"
	 * @generated
	 */
	long getNbBlessesMembresSup();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvacuationSanitaire#getNbBlessesMembresSup <em>Nb Blesses Membres Sup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Blesses Membres Sup</em>' attribute.
	 * @see #isSetNbBlessesMembresSup()
	 * @see #unsetNbBlessesMembresSup()
	 * @see #getNbBlessesMembresSup()
	 * @generated
	 */
	void setNbBlessesMembresSup(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEvacuationSanitaire#getNbBlessesMembresSup <em>Nb Blesses Membres Sup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNbBlessesMembresSup()
	 * @see #getNbBlessesMembresSup()
	 * @see #setNbBlessesMembresSup(long)
	 * @generated
	 */
	void unsetNbBlessesMembresSup();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEvacuationSanitaire#getNbBlessesMembresSup <em>Nb Blesses Membres Sup</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nb Blesses Membres Sup</em>' attribute is set.
	 * @see #unsetNbBlessesMembresSup()
	 * @see #getNbBlessesMembresSup()
	 * @see #setNbBlessesMembresSup(long)
	 * @generated
	 */
	boolean isSetNbBlessesMembresSup();

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
	 * @see mpia.schema.SchemaPackage#getTypeEvacuationSanitaire_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvacuationSanitaire#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeEvacuationSanitaire_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvacuationSanitaire#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Lieu Evacuation Autre Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Lieu Evacuation Autre Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Lieu Evacuation Autre Element Controle</em>' containment reference.
	 * @see #setAPourLieuEvacuationAutreElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeEvacuationSanitaire_APourLieuEvacuationAutreElementControle()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourLieuEvacuation_AutreElementControle'"
	 * @generated
	 */
	TypeAssociation getAPourLieuEvacuationAutreElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvacuationSanitaire#getAPourLieuEvacuationAutreElementControle <em>APour Lieu Evacuation Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Lieu Evacuation Autre Element Controle</em>' containment reference.
	 * @see #getAPourLieuEvacuationAutreElementControle()
	 * @generated
	 */
	void setAPourLieuEvacuationAutreElementControle(TypeAssociation value);

} // TypeEvacuationSanitaire
