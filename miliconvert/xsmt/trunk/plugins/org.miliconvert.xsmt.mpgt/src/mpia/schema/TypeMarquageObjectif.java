/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociationEXT;
import mpia.meta.TypeDataTypeDateHeure;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Marquage Objectif</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMarquageObjectif#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link mpia.schema.TypeMarquageObjectif#getMethode <em>Methode</em>}</li>
 *   <li>{@link mpia.schema.TypeMarquageObjectif#getFormePanneau <em>Forme Panneau</em>}</li>
 *   <li>{@link mpia.schema.TypeMarquageObjectif#getCouleurSignal <em>Couleur Signal</em>}</li>
 *   <li>{@link mpia.schema.TypeMarquageObjectif#getCorrelationLaser <em>Correlation Laser</em>}</li>
 *   <li>{@link mpia.schema.TypeMarquageObjectif#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeMarquageObjectif#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeMarquageObjectif#getEstUtilisateurEntiteOrganisationnelle <em>Est Utilisateur Entite Organisationnelle</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMarquageObjectif()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_MarquageObjectif' kind='elementOnly'"
 * @generated
 */
public interface TypeMarquageObjectif extends EObject {
	/**
	 * Returns the value of the '<em><b>Date Debut</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Debut</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Debut</em>' containment reference.
	 * @see #setDateDebut(TypeDataTypeDateHeure)
	 * @see mpia.schema.SchemaPackage#getTypeMarquageObjectif_DateDebut()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DateDebut'"
	 * @generated
	 */
	TypeDataTypeDateHeure getDateDebut();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMarquageObjectif#getDateDebut <em>Date Debut</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Debut</em>' containment reference.
	 * @see #getDateDebut()
	 * @generated
	 */
	void setDateDebut(TypeDataTypeDateHeure value);

	/**
	 * Returns the value of the '<em><b>Methode</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMarquageObjectifMethode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methode</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMarquageObjectifMethode
	 * @see #isSetMethode()
	 * @see #unsetMethode()
	 * @see #setMethode(TypeDictionaryDicoMarquageObjectifMethode)
	 * @see mpia.schema.SchemaPackage#getTypeMarquageObjectif_Methode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Methode'"
	 * @generated
	 */
	TypeDictionaryDicoMarquageObjectifMethode getMethode();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMarquageObjectif#getMethode <em>Methode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Methode</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMarquageObjectifMethode
	 * @see #isSetMethode()
	 * @see #unsetMethode()
	 * @see #getMethode()
	 * @generated
	 */
	void setMethode(TypeDictionaryDicoMarquageObjectifMethode value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMarquageObjectif#getMethode <em>Methode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMethode()
	 * @see #getMethode()
	 * @see #setMethode(TypeDictionaryDicoMarquageObjectifMethode)
	 * @generated
	 */
	void unsetMethode();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMarquageObjectif#getMethode <em>Methode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Methode</em>' attribute is set.
	 * @see #unsetMethode()
	 * @see #getMethode()
	 * @see #setMethode(TypeDictionaryDicoMarquageObjectifMethode)
	 * @generated
	 */
	boolean isSetMethode();

	/**
	 * Returns the value of the '<em><b>Forme Panneau</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMarquageObjectifFormePanneau}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forme Panneau</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forme Panneau</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMarquageObjectifFormePanneau
	 * @see #isSetFormePanneau()
	 * @see #unsetFormePanneau()
	 * @see #setFormePanneau(TypeDictionaryDicoMarquageObjectifFormePanneau)
	 * @see mpia.schema.SchemaPackage#getTypeMarquageObjectif_FormePanneau()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='FormePanneau'"
	 * @generated
	 */
	TypeDictionaryDicoMarquageObjectifFormePanneau getFormePanneau();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMarquageObjectif#getFormePanneau <em>Forme Panneau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forme Panneau</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMarquageObjectifFormePanneau
	 * @see #isSetFormePanneau()
	 * @see #unsetFormePanneau()
	 * @see #getFormePanneau()
	 * @generated
	 */
	void setFormePanneau(TypeDictionaryDicoMarquageObjectifFormePanneau value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMarquageObjectif#getFormePanneau <em>Forme Panneau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFormePanneau()
	 * @see #getFormePanneau()
	 * @see #setFormePanneau(TypeDictionaryDicoMarquageObjectifFormePanneau)
	 * @generated
	 */
	void unsetFormePanneau();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMarquageObjectif#getFormePanneau <em>Forme Panneau</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Forme Panneau</em>' attribute is set.
	 * @see #unsetFormePanneau()
	 * @see #getFormePanneau()
	 * @see #setFormePanneau(TypeDictionaryDicoMarquageObjectifFormePanneau)
	 * @generated
	 */
	boolean isSetFormePanneau();

	/**
	 * Returns the value of the '<em><b>Couleur Signal</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMarquageObjectifCouleurSignal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Couleur Signal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Couleur Signal</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMarquageObjectifCouleurSignal
	 * @see #isSetCouleurSignal()
	 * @see #unsetCouleurSignal()
	 * @see #setCouleurSignal(TypeDictionaryDicoMarquageObjectifCouleurSignal)
	 * @see mpia.schema.SchemaPackage#getTypeMarquageObjectif_CouleurSignal()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='CouleurSignal'"
	 * @generated
	 */
	TypeDictionaryDicoMarquageObjectifCouleurSignal getCouleurSignal();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMarquageObjectif#getCouleurSignal <em>Couleur Signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Couleur Signal</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMarquageObjectifCouleurSignal
	 * @see #isSetCouleurSignal()
	 * @see #unsetCouleurSignal()
	 * @see #getCouleurSignal()
	 * @generated
	 */
	void setCouleurSignal(TypeDictionaryDicoMarquageObjectifCouleurSignal value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMarquageObjectif#getCouleurSignal <em>Couleur Signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCouleurSignal()
	 * @see #getCouleurSignal()
	 * @see #setCouleurSignal(TypeDictionaryDicoMarquageObjectifCouleurSignal)
	 * @generated
	 */
	void unsetCouleurSignal();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMarquageObjectif#getCouleurSignal <em>Couleur Signal</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Couleur Signal</em>' attribute is set.
	 * @see #unsetCouleurSignal()
	 * @see #getCouleurSignal()
	 * @see #setCouleurSignal(TypeDictionaryDicoMarquageObjectifCouleurSignal)
	 * @generated
	 */
	boolean isSetCouleurSignal();

	/**
	 * Returns the value of the '<em><b>Correlation Laser</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correlation Laser</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Laser</em>' attribute.
	 * @see #setCorrelationLaser(String)
	 * @see mpia.schema.SchemaPackage#getTypeMarquageObjectif_CorrelationLaser()
	 * @model dataType="mpia.meta.TypeDataTypeChaine06"
	 *        extendedMetaData="kind='element' name='CorrelationLaser'"
	 * @generated
	 */
	String getCorrelationLaser();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMarquageObjectif#getCorrelationLaser <em>Correlation Laser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correlation Laser</em>' attribute.
	 * @see #getCorrelationLaser()
	 * @generated
	 */
	void setCorrelationLaser(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeMarquageObjectif_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMarquageObjectif#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeMarquageObjectif_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMarquageObjectif#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Est Utilisateur Entite Organisationnelle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Utilisateur Entite Organisationnelle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Utilisateur Entite Organisationnelle</em>' containment reference.
	 * @see #setEstUtilisateurEntiteOrganisationnelle(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeMarquageObjectif_EstUtilisateurEntiteOrganisationnelle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_EntiteOrganisationnelle'"
	 *        extendedMetaData="kind='element' name='EstUtilisateur_EntiteOrganisationnelle'"
	 * @generated
	 */
	TypeAssociationEXT getEstUtilisateurEntiteOrganisationnelle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMarquageObjectif#getEstUtilisateurEntiteOrganisationnelle <em>Est Utilisateur Entite Organisationnelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Utilisateur Entite Organisationnelle</em>' containment reference.
	 * @see #getEstUtilisateurEntiteOrganisationnelle()
	 * @generated
	 */
	void setEstUtilisateurEntiteOrganisationnelle(TypeAssociationEXT value);

} // TypeMarquageObjectif
