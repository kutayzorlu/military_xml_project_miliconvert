/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeDuree;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Variante Travail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeVarianteTravail#getNom <em>Nom</em>}</li>
 *   <li>{@link mpia.schema.TypeVarianteTravail#getTypeTravail <em>Type Travail</em>}</li>
 *   <li>{@link mpia.schema.TypeVarianteTravail#getTypeGeometrie <em>Type Geometrie</em>}</li>
 *   <li>{@link mpia.schema.TypeVarianteTravail#getTypeCalcul <em>Type Calcul</em>}</li>
 *   <li>{@link mpia.schema.TypeVarianteTravail#getLongueurReference <em>Longueur Reference</em>}</li>
 *   <li>{@link mpia.schema.TypeVarianteTravail#getSurfaceReference <em>Surface Reference</em>}</li>
 *   <li>{@link mpia.schema.TypeVarianteTravail#getQuantiteRechargement <em>Quantite Rechargement</em>}</li>
 *   <li>{@link mpia.schema.TypeVarianteTravail#getTempsRechargement <em>Temps Rechargement</em>}</li>
 *   <li>{@link mpia.schema.TypeVarianteTravail#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.TypeVarianteTravail#getAidedeploiement <em>Aidedeploiement</em>}</li>
 *   <li>{@link mpia.schema.TypeVarianteTravail#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeVarianteTravail#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeVarianteTravail#getAPourReferenceAutreTypeSite <em>APour Reference Autre Type Site</em>}</li>
 *   <li>{@link mpia.schema.TypeVarianteTravail#getAPourReferenceTypeObstacle <em>APour Reference Type Obstacle</em>}</li>
 *   <li>{@link mpia.schema.TypeVarianteTravail#getConcerneMoyensMoyensNecessaires <em>Concerne Moyens Moyens Necessaires</em>}</li>
 *   <li>{@link mpia.schema.TypeVarianteTravail#getAPourBaseCalculNecessaire <em>APour Base Calcul Necessaire</em>}</li>
 *   <li>{@link mpia.schema.TypeVarianteTravail#getEstReferenceParMoyensGenie <em>Est Reference Par Moyens Genie</em>}</li>
 *   <li>{@link mpia.schema.TypeVarianteTravail#getConcerneEffectifsNecessairesEffectifNecessaire <em>Concerne Effectifs Necessaires Effectif Necessaire</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeVarianteTravail()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_VarianteTravail' kind='elementOnly'"
 * @generated
 */
public interface TypeVarianteTravail extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see mpia.schema.SchemaPackage#getTypeVarianteTravail_Nom()
	 * @model dataType="mpia.meta.TypeDataTypeChaine050" required="true"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='Nom'"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVarianteTravail#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Type Travail</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoVarianteTravailTypeTravail}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Travail</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Travail</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoVarianteTravailTypeTravail
	 * @see #isSetTypeTravail()
	 * @see #unsetTypeTravail()
	 * @see #setTypeTravail(TypeDictionaryDicoVarianteTravailTypeTravail)
	 * @see mpia.schema.SchemaPackage#getTypeVarianteTravail_TypeTravail()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeTravail'"
	 * @generated
	 */
	TypeDictionaryDicoVarianteTravailTypeTravail getTypeTravail();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVarianteTravail#getTypeTravail <em>Type Travail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Travail</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoVarianteTravailTypeTravail
	 * @see #isSetTypeTravail()
	 * @see #unsetTypeTravail()
	 * @see #getTypeTravail()
	 * @generated
	 */
	void setTypeTravail(TypeDictionaryDicoVarianteTravailTypeTravail value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeVarianteTravail#getTypeTravail <em>Type Travail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeTravail()
	 * @see #getTypeTravail()
	 * @see #setTypeTravail(TypeDictionaryDicoVarianteTravailTypeTravail)
	 * @generated
	 */
	void unsetTypeTravail();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeVarianteTravail#getTypeTravail <em>Type Travail</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Travail</em>' attribute is set.
	 * @see #unsetTypeTravail()
	 * @see #getTypeTravail()
	 * @see #setTypeTravail(TypeDictionaryDicoVarianteTravailTypeTravail)
	 * @generated
	 */
	boolean isSetTypeTravail();

	/**
	 * Returns the value of the '<em><b>Type Geometrie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoVarianteTravailTypeGeometrie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Geometrie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Geometrie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoVarianteTravailTypeGeometrie
	 * @see #isSetTypeGeometrie()
	 * @see #unsetTypeGeometrie()
	 * @see #setTypeGeometrie(TypeDictionaryDicoVarianteTravailTypeGeometrie)
	 * @see mpia.schema.SchemaPackage#getTypeVarianteTravail_TypeGeometrie()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeGeometrie'"
	 * @generated
	 */
	TypeDictionaryDicoVarianteTravailTypeGeometrie getTypeGeometrie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVarianteTravail#getTypeGeometrie <em>Type Geometrie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Geometrie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoVarianteTravailTypeGeometrie
	 * @see #isSetTypeGeometrie()
	 * @see #unsetTypeGeometrie()
	 * @see #getTypeGeometrie()
	 * @generated
	 */
	void setTypeGeometrie(TypeDictionaryDicoVarianteTravailTypeGeometrie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeVarianteTravail#getTypeGeometrie <em>Type Geometrie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeGeometrie()
	 * @see #getTypeGeometrie()
	 * @see #setTypeGeometrie(TypeDictionaryDicoVarianteTravailTypeGeometrie)
	 * @generated
	 */
	void unsetTypeGeometrie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeVarianteTravail#getTypeGeometrie <em>Type Geometrie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Geometrie</em>' attribute is set.
	 * @see #unsetTypeGeometrie()
	 * @see #getTypeGeometrie()
	 * @see #setTypeGeometrie(TypeDictionaryDicoVarianteTravailTypeGeometrie)
	 * @generated
	 */
	boolean isSetTypeGeometrie();

	/**
	 * Returns the value of the '<em><b>Type Calcul</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoVarianteTravailTypeCalcul}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Calcul</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Calcul</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoVarianteTravailTypeCalcul
	 * @see #isSetTypeCalcul()
	 * @see #unsetTypeCalcul()
	 * @see #setTypeCalcul(TypeDictionaryDicoVarianteTravailTypeCalcul)
	 * @see mpia.schema.SchemaPackage#getTypeVarianteTravail_TypeCalcul()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeCalcul'"
	 * @generated
	 */
	TypeDictionaryDicoVarianteTravailTypeCalcul getTypeCalcul();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVarianteTravail#getTypeCalcul <em>Type Calcul</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Calcul</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoVarianteTravailTypeCalcul
	 * @see #isSetTypeCalcul()
	 * @see #unsetTypeCalcul()
	 * @see #getTypeCalcul()
	 * @generated
	 */
	void setTypeCalcul(TypeDictionaryDicoVarianteTravailTypeCalcul value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeVarianteTravail#getTypeCalcul <em>Type Calcul</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeCalcul()
	 * @see #getTypeCalcul()
	 * @see #setTypeCalcul(TypeDictionaryDicoVarianteTravailTypeCalcul)
	 * @generated
	 */
	void unsetTypeCalcul();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeVarianteTravail#getTypeCalcul <em>Type Calcul</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Calcul</em>' attribute is set.
	 * @see #unsetTypeCalcul()
	 * @see #getTypeCalcul()
	 * @see #setTypeCalcul(TypeDictionaryDicoVarianteTravailTypeCalcul)
	 * @generated
	 */
	boolean isSetTypeCalcul();

	/**
	 * Returns the value of the '<em><b>Longueur Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Longueur Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longueur Reference</em>' attribute.
	 * @see #setLongueurReference(String)
	 * @see mpia.schema.SchemaPackage#getTypeVarianteTravail_LongueurReference()
	 * @model dataType="mpia.meta.TypeDataTypeChaine06"
	 *        extendedMetaData="kind='element' name='LongueurReference'"
	 * @generated
	 */
	String getLongueurReference();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVarianteTravail#getLongueurReference <em>Longueur Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longueur Reference</em>' attribute.
	 * @see #getLongueurReference()
	 * @generated
	 */
	void setLongueurReference(String value);

	/**
	 * Returns the value of the '<em><b>Surface Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Surface Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surface Reference</em>' attribute.
	 * @see #isSetSurfaceReference()
	 * @see #unsetSurfaceReference()
	 * @see #setSurfaceReference(long)
	 * @see mpia.schema.SchemaPackage#getTypeVarianteTravail_SurfaceReference()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier15"
	 *        extendedMetaData="kind='element' name='SurfaceReference'"
	 * @generated
	 */
	long getSurfaceReference();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVarianteTravail#getSurfaceReference <em>Surface Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surface Reference</em>' attribute.
	 * @see #isSetSurfaceReference()
	 * @see #unsetSurfaceReference()
	 * @see #getSurfaceReference()
	 * @generated
	 */
	void setSurfaceReference(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeVarianteTravail#getSurfaceReference <em>Surface Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSurfaceReference()
	 * @see #getSurfaceReference()
	 * @see #setSurfaceReference(long)
	 * @generated
	 */
	void unsetSurfaceReference();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeVarianteTravail#getSurfaceReference <em>Surface Reference</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Surface Reference</em>' attribute is set.
	 * @see #unsetSurfaceReference()
	 * @see #getSurfaceReference()
	 * @see #setSurfaceReference(long)
	 * @generated
	 */
	boolean isSetSurfaceReference();

	/**
	 * Returns the value of the '<em><b>Quantite Rechargement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantite Rechargement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite Rechargement</em>' attribute.
	 * @see #isSetQuantiteRechargement()
	 * @see #unsetQuantiteRechargement()
	 * @see #setQuantiteRechargement(long)
	 * @see mpia.schema.SchemaPackage#getTypeVarianteTravail_QuantiteRechargement()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier9"
	 *        extendedMetaData="kind='element' name='QuantiteRechargement'"
	 * @generated
	 */
	long getQuantiteRechargement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVarianteTravail#getQuantiteRechargement <em>Quantite Rechargement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite Rechargement</em>' attribute.
	 * @see #isSetQuantiteRechargement()
	 * @see #unsetQuantiteRechargement()
	 * @see #getQuantiteRechargement()
	 * @generated
	 */
	void setQuantiteRechargement(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeVarianteTravail#getQuantiteRechargement <em>Quantite Rechargement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantiteRechargement()
	 * @see #getQuantiteRechargement()
	 * @see #setQuantiteRechargement(long)
	 * @generated
	 */
	void unsetQuantiteRechargement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeVarianteTravail#getQuantiteRechargement <em>Quantite Rechargement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantite Rechargement</em>' attribute is set.
	 * @see #unsetQuantiteRechargement()
	 * @see #getQuantiteRechargement()
	 * @see #setQuantiteRechargement(long)
	 * @generated
	 */
	boolean isSetQuantiteRechargement();

	/**
	 * Returns the value of the '<em><b>Temps Rechargement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temps Rechargement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temps Rechargement</em>' containment reference.
	 * @see #setTempsRechargement(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeVarianteTravail_TempsRechargement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TempsRechargement'"
	 * @generated
	 */
	TypeDataTypeDuree getTempsRechargement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVarianteTravail#getTempsRechargement <em>Temps Rechargement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temps Rechargement</em>' containment reference.
	 * @see #getTempsRechargement()
	 * @generated
	 */
	void setTempsRechargement(TypeDataTypeDuree value);

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
	 * @see mpia.schema.SchemaPackage#getTypeVarianteTravail_Commentaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='Commentaire'"
	 * @generated
	 */
	String getCommentaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVarianteTravail#getCommentaire <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commentaire</em>' attribute.
	 * @see #getCommentaire()
	 * @generated
	 */
	void setCommentaire(String value);

	/**
	 * Returns the value of the '<em><b>Aidedeploiement</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAideDeploiementObjetTravail}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aidedeploiement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aidedeploiement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAideDeploiementObjetTravail
	 * @see #isSetAidedeploiement()
	 * @see #unsetAidedeploiement()
	 * @see #setAidedeploiement(TypeDictionaryDicoAideDeploiementObjetTravail)
	 * @see mpia.schema.SchemaPackage#getTypeVarianteTravail_Aidedeploiement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Aidedeploiement'"
	 * @generated
	 */
	TypeDictionaryDicoAideDeploiementObjetTravail getAidedeploiement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVarianteTravail#getAidedeploiement <em>Aidedeploiement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aidedeploiement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAideDeploiementObjetTravail
	 * @see #isSetAidedeploiement()
	 * @see #unsetAidedeploiement()
	 * @see #getAidedeploiement()
	 * @generated
	 */
	void setAidedeploiement(TypeDictionaryDicoAideDeploiementObjetTravail value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeVarianteTravail#getAidedeploiement <em>Aidedeploiement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAidedeploiement()
	 * @see #getAidedeploiement()
	 * @see #setAidedeploiement(TypeDictionaryDicoAideDeploiementObjetTravail)
	 * @generated
	 */
	void unsetAidedeploiement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeVarianteTravail#getAidedeploiement <em>Aidedeploiement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Aidedeploiement</em>' attribute is set.
	 * @see #unsetAidedeploiement()
	 * @see #getAidedeploiement()
	 * @see #setAidedeploiement(TypeDictionaryDicoAideDeploiementObjetTravail)
	 * @generated
	 */
	boolean isSetAidedeploiement();

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
	 * @see mpia.schema.SchemaPackage#getTypeVarianteTravail_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVarianteTravail#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeVarianteTravail_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVarianteTravail#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Reference Autre Type Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Reference Autre Type Site</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Reference Autre Type Site</em>' containment reference.
	 * @see #setAPourReferenceAutreTypeSite(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeVarianteTravail_APourReferenceAutreTypeSite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreTypeSite'"
	 *        extendedMetaData="kind='element' name='APourReference_AutreTypeSite'"
	 * @generated
	 */
	TypeAssociation getAPourReferenceAutreTypeSite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVarianteTravail#getAPourReferenceAutreTypeSite <em>APour Reference Autre Type Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Reference Autre Type Site</em>' containment reference.
	 * @see #getAPourReferenceAutreTypeSite()
	 * @generated
	 */
	void setAPourReferenceAutreTypeSite(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Reference Type Obstacle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Reference Type Obstacle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Reference Type Obstacle</em>' containment reference.
	 * @see #setAPourReferenceTypeObstacle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeVarianteTravail_APourReferenceTypeObstacle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeObstacle'"
	 *        extendedMetaData="kind='element' name='APourReference_TypeObstacle'"
	 * @generated
	 */
	TypeAssociation getAPourReferenceTypeObstacle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVarianteTravail#getAPourReferenceTypeObstacle <em>APour Reference Type Obstacle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Reference Type Obstacle</em>' containment reference.
	 * @see #getAPourReferenceTypeObstacle()
	 * @generated
	 */
	void setAPourReferenceTypeObstacle(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Concerne Moyens Moyens Necessaires</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMoyensNecessaires}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Moyens Moyens Necessaires</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Moyens Moyens Necessaires</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeVarianteTravail_ConcerneMoyensMoyensNecessaires()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_MoyensNecessaires'"
	 *        extendedMetaData="kind='element' name='ConcerneMoyens_MoyensNecessaires'"
	 * @generated
	 */
	EList<TypeMoyensNecessaires> getConcerneMoyensMoyensNecessaires();

	/**
	 * Returns the value of the '<em><b>APour Base Calcul Necessaire</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Base Calcul Necessaire</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Base Calcul Necessaire</em>' containment reference.
	 * @see #setAPourBaseCalculNecessaire(TypeBaseCalculNecessaire)
	 * @see mpia.schema.SchemaPackage#getTypeVarianteTravail_APourBaseCalculNecessaire()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_BaseCalculNecessaire'"
	 *        extendedMetaData="kind='element' name='APour_BaseCalculNecessaire'"
	 * @generated
	 */
	TypeBaseCalculNecessaire getAPourBaseCalculNecessaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVarianteTravail#getAPourBaseCalculNecessaire <em>APour Base Calcul Necessaire</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Base Calcul Necessaire</em>' containment reference.
	 * @see #getAPourBaseCalculNecessaire()
	 * @generated
	 */
	void setAPourBaseCalculNecessaire(TypeBaseCalculNecessaire value);

	/**
	 * Returns the value of the '<em><b>Est Reference Par Moyens Genie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Reference Par Moyens Genie</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Reference Par Moyens Genie</em>' containment reference.
	 * @see #setEstReferenceParMoyensGenie(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeVarianteTravail_EstReferenceParMoyensGenie()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourVarianteRealisation_VarianteTravail' target_entity='type_MoyensGenie'"
	 *        extendedMetaData="kind='element' name='EstReferencePar_MoyensGenie'"
	 * @generated
	 */
	TypeAssociation getEstReferenceParMoyensGenie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVarianteTravail#getEstReferenceParMoyensGenie <em>Est Reference Par Moyens Genie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Reference Par Moyens Genie</em>' containment reference.
	 * @see #getEstReferenceParMoyensGenie()
	 * @generated
	 */
	void setEstReferenceParMoyensGenie(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Concerne Effectifs Necessaires Effectif Necessaire</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeEffectifNecessaire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Effectifs Necessaires Effectif Necessaire</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Effectifs Necessaires Effectif Necessaire</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeVarianteTravail_ConcerneEffectifsNecessairesEffectifNecessaire()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EffectifNecessaire'"
	 *        extendedMetaData="kind='element' name='ConcerneEffectifsNecessaires_EffectifNecessaire'"
	 * @generated
	 */
	EList<TypeEffectifNecessaire> getConcerneEffectifsNecessairesEffectifNecessaire();

} // TypeVarianteTravail
