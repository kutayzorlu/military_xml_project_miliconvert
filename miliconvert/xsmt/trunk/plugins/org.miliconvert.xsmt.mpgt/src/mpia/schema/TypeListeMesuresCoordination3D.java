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
 * A representation of the model object '<em><b>Type Liste Mesures Coordination3 D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeListeMesuresCoordination3D#getNumeroSerie <em>Numero Serie</em>}</li>
 *   <li>{@link mpia.schema.TypeListeMesuresCoordination3D#getNomZoneValidite <em>Nom Zone Validite</em>}</li>
 *   <li>{@link mpia.schema.TypeListeMesuresCoordination3D#getConsignesGestionACM <em>Consignes Gestion ACM</em>}</li>
 *   <li>{@link mpia.schema.TypeListeMesuresCoordination3D#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.TypeListeMesuresCoordination3D#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeListeMesuresCoordination3D#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeListeMesuresCoordination3D#getAPourACMmodifieMesureCoordination <em>APour AC Mmodifie Mesure Coordination</em>}</li>
 *   <li>{@link mpia.schema.TypeListeMesuresCoordination3D#getAPourACMactiveMesureCoordination <em>APour AC Mactive Mesure Coordination</em>}</li>
 *   <li>{@link mpia.schema.TypeListeMesuresCoordination3D#getAPourACMcreeMesureCoordination <em>APour AC Mcree Mesure Coordination</em>}</li>
 *   <li>{@link mpia.schema.TypeListeMesuresCoordination3D#getAPourACMdemandeOuPrepareMesureCoordination <em>APour AC Mdemande Ou Prepare Mesure Coordination</em>}</li>
 *   <li>{@link mpia.schema.TypeListeMesuresCoordination3D#getAPourITSouATSdevantEtreCreeMesureCoordination <em>APour IT Sou AT Sdevant Etre Cree Mesure Coordination</em>}</li>
 *   <li>{@link mpia.schema.TypeListeMesuresCoordination3D#getAPourITSouATSsupprimeMesureCoordination <em>APour IT Sou AT Ssupprime Mesure Coordination</em>}</li>
 *   <li>{@link mpia.schema.TypeListeMesuresCoordination3D#getAPourWEZcreesMesureCoordination <em>APour WE Zcrees Mesure Coordination</em>}</li>
 *   <li>{@link mpia.schema.TypeListeMesuresCoordination3D#getAPourWEZutiliseesMesureCoordination <em>APour WE Zutilisees Mesure Coordination</em>}</li>
 *   <li>{@link mpia.schema.TypeListeMesuresCoordination3D#getAPourPeriodeValiditePeriode3D <em>APour Periode Validite Periode3 D</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeListeMesuresCoordination3D()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_ListeMesuresCoordination3D' kind='elementOnly'"
 * @generated
 */
public interface TypeListeMesuresCoordination3D extends EObject {
	/**
	 * Returns the value of the '<em><b>Numero Serie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Serie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Serie</em>' attribute.
	 * @see #setNumeroSerie(String)
	 * @see mpia.schema.SchemaPackage#getTypeListeMesuresCoordination3D_NumeroSerie()
	 * @model dataType="mpia.meta.TypeDataTypeChaine03"
	 *        extendedMetaData="kind='element' name='NumeroSerie'"
	 * @generated
	 */
	String getNumeroSerie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeListeMesuresCoordination3D#getNumeroSerie <em>Numero Serie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Serie</em>' attribute.
	 * @see #getNumeroSerie()
	 * @generated
	 */
	void setNumeroSerie(String value);

	/**
	 * Returns the value of the '<em><b>Nom Zone Validite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom Zone Validite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Zone Validite</em>' attribute.
	 * @see #setNomZoneValidite(String)
	 * @see mpia.schema.SchemaPackage#getTypeListeMesuresCoordination3D_NomZoneValidite()
	 * @model dataType="mpia.meta.TypeDataTypeChaine020" required="true"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='NomZoneValidite'"
	 * @generated
	 */
	String getNomZoneValidite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeListeMesuresCoordination3D#getNomZoneValidite <em>Nom Zone Validite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Zone Validite</em>' attribute.
	 * @see #getNomZoneValidite()
	 * @generated
	 */
	void setNomZoneValidite(String value);

	/**
	 * Returns the value of the '<em><b>Consignes Gestion ACM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consignes Gestion ACM</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consignes Gestion ACM</em>' attribute.
	 * @see #setConsignesGestionACM(String)
	 * @see mpia.schema.SchemaPackage#getTypeListeMesuresCoordination3D_ConsignesGestionACM()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='ConsignesGestionACM'"
	 * @generated
	 */
	String getConsignesGestionACM();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeListeMesuresCoordination3D#getConsignesGestionACM <em>Consignes Gestion ACM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consignes Gestion ACM</em>' attribute.
	 * @see #getConsignesGestionACM()
	 * @generated
	 */
	void setConsignesGestionACM(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeListeMesuresCoordination3D_Commentaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='Commentaire'"
	 * @generated
	 */
	String getCommentaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeListeMesuresCoordination3D#getCommentaire <em>Commentaire</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeListeMesuresCoordination3D_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeListeMesuresCoordination3D#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeListeMesuresCoordination3D_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeListeMesuresCoordination3D#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour AC Mmodifie Mesure Coordination</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour AC Mmodifie Mesure Coordination</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour AC Mmodifie Mesure Coordination</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeListeMesuresCoordination3D_APourACMmodifieMesureCoordination()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_MesureCoordination'"
	 *        extendedMetaData="kind='element' name='APourACMmodifie_MesureCoordination'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourACMmodifieMesureCoordination();

	/**
	 * Returns the value of the '<em><b>APour AC Mactive Mesure Coordination</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour AC Mactive Mesure Coordination</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour AC Mactive Mesure Coordination</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeListeMesuresCoordination3D_APourACMactiveMesureCoordination()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_MesureCoordination'"
	 *        extendedMetaData="kind='element' name='APourACMactive_MesureCoordination'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourACMactiveMesureCoordination();

	/**
	 * Returns the value of the '<em><b>APour AC Mcree Mesure Coordination</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour AC Mcree Mesure Coordination</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour AC Mcree Mesure Coordination</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeListeMesuresCoordination3D_APourACMcreeMesureCoordination()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_MesureCoordination'"
	 *        extendedMetaData="kind='element' name='APourACMcree_MesureCoordination'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourACMcreeMesureCoordination();

	/**
	 * Returns the value of the '<em><b>APour AC Mdemande Ou Prepare Mesure Coordination</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour AC Mdemande Ou Prepare Mesure Coordination</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour AC Mdemande Ou Prepare Mesure Coordination</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeListeMesuresCoordination3D_APourACMdemandeOuPrepareMesureCoordination()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_MesureCoordination'"
	 *        extendedMetaData="kind='element' name='APourACMdemandeOuPrepare_MesureCoordination'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourACMdemandeOuPrepareMesureCoordination();

	/**
	 * Returns the value of the '<em><b>APour IT Sou AT Sdevant Etre Cree Mesure Coordination</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour IT Sou AT Sdevant Etre Cree Mesure Coordination</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour IT Sou AT Sdevant Etre Cree Mesure Coordination</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeListeMesuresCoordination3D_APourITSouATSdevantEtreCreeMesureCoordination()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_MesureCoordination'"
	 *        extendedMetaData="kind='element' name='APourITSouATSdevantEtreCree_MesureCoordination'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourITSouATSdevantEtreCreeMesureCoordination();

	/**
	 * Returns the value of the '<em><b>APour IT Sou AT Ssupprime Mesure Coordination</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour IT Sou AT Ssupprime Mesure Coordination</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour IT Sou AT Ssupprime Mesure Coordination</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeListeMesuresCoordination3D_APourITSouATSsupprimeMesureCoordination()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_MesureCoordination'"
	 *        extendedMetaData="kind='element' name='APourITSouATSsupprime_MesureCoordination'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourITSouATSsupprimeMesureCoordination();

	/**
	 * Returns the value of the '<em><b>APour WE Zcrees Mesure Coordination</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour WE Zcrees Mesure Coordination</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour WE Zcrees Mesure Coordination</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeListeMesuresCoordination3D_APourWEZcreesMesureCoordination()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_MesureCoordination'"
	 *        extendedMetaData="kind='element' name='APourWEZcrees_MesureCoordination'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourWEZcreesMesureCoordination();

	/**
	 * Returns the value of the '<em><b>APour WE Zutilisees Mesure Coordination</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour WE Zutilisees Mesure Coordination</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour WE Zutilisees Mesure Coordination</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeListeMesuresCoordination3D_APourWEZutiliseesMesureCoordination()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_MesureCoordination'"
	 *        extendedMetaData="kind='element' name='APourWEZutilisees_MesureCoordination'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourWEZutiliseesMesureCoordination();

	/**
	 * Returns the value of the '<em><b>APour Periode Validite Periode3 D</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePeriode3D}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Periode Validite Periode3 D</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Periode Validite Periode3 D</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeListeMesuresCoordination3D_APourPeriodeValiditePeriode3D()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Periode3D'"
	 *        extendedMetaData="kind='element' name='APourPeriodeValidite_Periode3D'"
	 * @generated
	 */
	EList<TypePeriode3D> getAPourPeriodeValiditePeriode3D();

} // TypeListeMesuresCoordination3D
