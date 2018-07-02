/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Deploiement Moyens AS Ac3d</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeDeploiementMoyensASAc3d#getTypeDeploiement <em>Type Deploiement</em>}</li>
 *   <li>{@link mpia.schema.TypeDeploiementMoyensASAc3d#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.TypeDeploiementMoyensASAc3d#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeDeploiementMoyensASAc3d#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeDeploiementMoyensASAc3d#getConcerneCentreOuI3DCentreASA <em>Concerne Centre Ou I3D Centre ASA</em>}</li>
 *   <li>{@link mpia.schema.TypeDeploiementMoyensASAc3d#getAPourPeriodeValiditePeriode3D <em>APour Periode Validite Periode3 D</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeDeploiementMoyensASAc3d()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_DeploiementMoyensASAc3d' kind='elementOnly'"
 * @generated
 */
public interface TypeDeploiementMoyensASAc3d extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Deploiement</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoDeploiementMoyensASAc3dTypeDeploiement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Deploiement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Deploiement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDeploiementMoyensASAc3dTypeDeploiement
	 * @see #isSetTypeDeploiement()
	 * @see #unsetTypeDeploiement()
	 * @see #setTypeDeploiement(TypeDictionaryDicoDeploiementMoyensASAc3dTypeDeploiement)
	 * @see mpia.schema.SchemaPackage#getTypeDeploiementMoyensASAc3d_TypeDeploiement()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='TypeDeploiement'"
	 * @generated
	 */
	TypeDictionaryDicoDeploiementMoyensASAc3dTypeDeploiement getTypeDeploiement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDeploiementMoyensASAc3d#getTypeDeploiement <em>Type Deploiement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Deploiement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDeploiementMoyensASAc3dTypeDeploiement
	 * @see #isSetTypeDeploiement()
	 * @see #unsetTypeDeploiement()
	 * @see #getTypeDeploiement()
	 * @generated
	 */
	void setTypeDeploiement(TypeDictionaryDicoDeploiementMoyensASAc3dTypeDeploiement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDeploiementMoyensASAc3d#getTypeDeploiement <em>Type Deploiement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeDeploiement()
	 * @see #getTypeDeploiement()
	 * @see #setTypeDeploiement(TypeDictionaryDicoDeploiementMoyensASAc3dTypeDeploiement)
	 * @generated
	 */
	void unsetTypeDeploiement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDeploiementMoyensASAc3d#getTypeDeploiement <em>Type Deploiement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Deploiement</em>' attribute is set.
	 * @see #unsetTypeDeploiement()
	 * @see #getTypeDeploiement()
	 * @see #setTypeDeploiement(TypeDictionaryDicoDeploiementMoyensASAc3dTypeDeploiement)
	 * @generated
	 */
	boolean isSetTypeDeploiement();

	/**
	 * Returns the value of the '<em><b>Commentaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commentaire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commentaire</em>' attribute.
	 * @see #setCommentaire(String)
	 * @see mpia.schema.SchemaPackage#getTypeDeploiementMoyensASAc3d_Commentaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='Commentaire'"
	 * @generated
	 */
	String getCommentaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDeploiementMoyensASAc3d#getCommentaire <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commentaire</em>' attribute.
	 * @see #getCommentaire()
	 * @generated
	 */
	void setCommentaire(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeDeploiementMoyensASAc3d_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDeploiementMoyensASAc3d#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeDeploiementMoyensASAc3d_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDeploiementMoyensASAc3d#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Concerne Centre Ou I3D Centre ASA</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeCentreASA}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Centre Ou I3D Centre ASA</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Centre Ou I3D Centre ASA</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeDeploiementMoyensASAc3d_ConcerneCentreOuI3DCentreASA()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_CentreASA'"
	 *        extendedMetaData="kind='element' name='ConcerneCentreOuI3D_CentreASA'"
	 * @generated
	 */
	EList<TypeCentreASA> getConcerneCentreOuI3DCentreASA();

	/**
	 * Returns the value of the '<em><b>APour Periode Validite Periode3 D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Periode Validite Periode3 D</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Periode Validite Periode3 D</em>' containment reference.
	 * @see #setAPourPeriodeValiditePeriode3D(TypePeriode3D)
	 * @see mpia.schema.SchemaPackage#getTypeDeploiementMoyensASAc3d_APourPeriodeValiditePeriode3D()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Periode3D'"
	 *        extendedMetaData="kind='element' name='APourPeriodeValidite_Periode3D'"
	 * @generated
	 */
	TypePeriode3D getAPourPeriodeValiditePeriode3D();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDeploiementMoyensASAc3d#getAPourPeriodeValiditePeriode3D <em>APour Periode Validite Periode3 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Periode Validite Periode3 D</em>' containment reference.
	 * @see #getAPourPeriodeValiditePeriode3D()
	 * @generated
	 */
	void setAPourPeriodeValiditePeriode3D(TypePeriode3D value);

} // TypeDeploiementMoyensASAc3d
