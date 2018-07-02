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
 * A representation of the model object '<em><b>Type Ligne Rechange</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeLigneRechange#getCodeNNORechange <em>Code NNO Rechange</em>}</li>
 *   <li>{@link mpia.schema.TypeLigneRechange#getQuantiteDemandee <em>Quantite Demandee</em>}</li>
 *   <li>{@link mpia.schema.TypeLigneRechange#getQuantiteAllouee <em>Quantite Allouee</em>}</li>
 *   <li>{@link mpia.schema.TypeLigneRechange#getIntituleRechange <em>Intitule Rechange</em>}</li>
 *   <li>{@link mpia.schema.TypeLigneRechange#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeLigneRechange#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeLigneRechange()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_LigneRechange' kind='elementOnly'"
 * @generated
 */
public interface TypeLigneRechange extends EObject {
	/**
	 * Returns the value of the '<em><b>Code NNO Rechange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code NNO Rechange</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code NNO Rechange</em>' attribute.
	 * @see #setCodeNNORechange(String)
	 * @see mpia.schema.SchemaPackage#getTypeLigneRechange_CodeNNORechange()
	 * @model dataType="mpia.meta.TypeDataTypeChaine015" required="true"
	 *        extendedMetaData="kind='element' name='CodeNNORechange'"
	 * @generated
	 */
	String getCodeNNORechange();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLigneRechange#getCodeNNORechange <em>Code NNO Rechange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code NNO Rechange</em>' attribute.
	 * @see #getCodeNNORechange()
	 * @generated
	 */
	void setCodeNNORechange(String value);

	/**
	 * Returns the value of the '<em><b>Quantite Demandee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantite Demandee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite Demandee</em>' attribute.
	 * @see #isSetQuantiteDemandee()
	 * @see #unsetQuantiteDemandee()
	 * @see #setQuantiteDemandee(long)
	 * @see mpia.schema.SchemaPackage#getTypeLigneRechange_QuantiteDemandee()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3" required="true"
	 *        extendedMetaData="kind='element' name='QuantiteDemandee'"
	 * @generated
	 */
	long getQuantiteDemandee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLigneRechange#getQuantiteDemandee <em>Quantite Demandee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite Demandee</em>' attribute.
	 * @see #isSetQuantiteDemandee()
	 * @see #unsetQuantiteDemandee()
	 * @see #getQuantiteDemandee()
	 * @generated
	 */
	void setQuantiteDemandee(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeLigneRechange#getQuantiteDemandee <em>Quantite Demandee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantiteDemandee()
	 * @see #getQuantiteDemandee()
	 * @see #setQuantiteDemandee(long)
	 * @generated
	 */
	void unsetQuantiteDemandee();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeLigneRechange#getQuantiteDemandee <em>Quantite Demandee</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantite Demandee</em>' attribute is set.
	 * @see #unsetQuantiteDemandee()
	 * @see #getQuantiteDemandee()
	 * @see #setQuantiteDemandee(long)
	 * @generated
	 */
	boolean isSetQuantiteDemandee();

	/**
	 * Returns the value of the '<em><b>Quantite Allouee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantite Allouee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite Allouee</em>' attribute.
	 * @see #isSetQuantiteAllouee()
	 * @see #unsetQuantiteAllouee()
	 * @see #setQuantiteAllouee(long)
	 * @see mpia.schema.SchemaPackage#getTypeLigneRechange_QuantiteAllouee()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='QuantiteAllouee'"
	 * @generated
	 */
	long getQuantiteAllouee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLigneRechange#getQuantiteAllouee <em>Quantite Allouee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite Allouee</em>' attribute.
	 * @see #isSetQuantiteAllouee()
	 * @see #unsetQuantiteAllouee()
	 * @see #getQuantiteAllouee()
	 * @generated
	 */
	void setQuantiteAllouee(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeLigneRechange#getQuantiteAllouee <em>Quantite Allouee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantiteAllouee()
	 * @see #getQuantiteAllouee()
	 * @see #setQuantiteAllouee(long)
	 * @generated
	 */
	void unsetQuantiteAllouee();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeLigneRechange#getQuantiteAllouee <em>Quantite Allouee</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantite Allouee</em>' attribute is set.
	 * @see #unsetQuantiteAllouee()
	 * @see #getQuantiteAllouee()
	 * @see #setQuantiteAllouee(long)
	 * @generated
	 */
	boolean isSetQuantiteAllouee();

	/**
	 * Returns the value of the '<em><b>Intitule Rechange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intitule Rechange</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intitule Rechange</em>' attribute.
	 * @see #setIntituleRechange(String)
	 * @see mpia.schema.SchemaPackage#getTypeLigneRechange_IntituleRechange()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='IntituleRechange'"
	 * @generated
	 */
	String getIntituleRechange();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLigneRechange#getIntituleRechange <em>Intitule Rechange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intitule Rechange</em>' attribute.
	 * @see #getIntituleRechange()
	 * @generated
	 */
	void setIntituleRechange(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeLigneRechange_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLigneRechange#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeLigneRechange_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLigneRechange#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

} // TypeLigneRechange
