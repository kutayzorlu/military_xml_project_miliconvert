/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;
import mpia.meta.TypeDataTypeAngle;
import mpia.meta.TypeDataTypeVitesseLineaire;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Activite Posture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeActivitePosture#getDescriptionGeneraleObjectif <em>Description Generale Objectif</em>}</li>
 *   <li>{@link mpia.schema.TypeActivitePosture#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeActivitePosture#getVitesse <em>Vitesse</em>}</li>
 *   <li>{@link mpia.schema.TypeActivitePosture#getAngleMouvement <em>Angle Mouvement</em>}</li>
 *   <li>{@link mpia.schema.TypeActivitePosture#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.TypeActivitePosture#getNbAxesActivite <em>Nb Axes Activite</em>}</li>
 *   <li>{@link mpia.schema.TypeActivitePosture#getNiveauConfirmation <em>Niveau Confirmation</em>}</li>
 *   <li>{@link mpia.schema.TypeActivitePosture#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeActivitePosture#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeActivitePosture#getEstLocaliseEnLocalisation <em>Est Localise En Localisation</em>}</li>
 *   <li>{@link mpia.schema.TypeActivitePosture#getAPourObjectifActiviteInstanceObjet <em>APour Objectif Activite Instance Objet</em>}</li>
 *   <li>{@link mpia.schema.TypeActivitePosture#getConcerneObservation <em>Concerne Observation</em>}</li>
 *   <li>{@link mpia.schema.TypeActivitePosture#getConcerneUnite <em>Concerne Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeActivitePosture()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_ActivitePosture' kind='elementOnly'"
 * @generated
 */
public interface TypeActivitePosture extends EObject {
	/**
	 * Returns the value of the '<em><b>Description Generale Objectif</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description Generale Objectif</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Generale Objectif</em>' attribute.
	 * @see #setDescriptionGeneraleObjectif(String)
	 * @see mpia.schema.SchemaPackage#getTypeActivitePosture_DescriptionGeneraleObjectif()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='DescriptionGeneraleObjectif'"
	 * @generated
	 */
	String getDescriptionGeneraleObjectif();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeActivitePosture#getDescriptionGeneraleObjectif <em>Description Generale Objectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Generale Objectif</em>' attribute.
	 * @see #getDescriptionGeneraleObjectif()
	 * @generated
	 */
	void setDescriptionGeneraleObjectif(String value);

	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoActivitePostureCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoActivitePostureCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoActivitePostureCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeActivitePosture_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoActivitePostureCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeActivitePosture#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoActivitePostureCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoActivitePostureCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeActivitePosture#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoActivitePostureCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeActivitePosture#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoActivitePostureCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Vitesse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vitesse</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vitesse</em>' containment reference.
	 * @see #setVitesse(TypeDataTypeVitesseLineaire)
	 * @see mpia.schema.SchemaPackage#getTypeActivitePosture_Vitesse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Vitesse'"
	 * @generated
	 */
	TypeDataTypeVitesseLineaire getVitesse();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeActivitePosture#getVitesse <em>Vitesse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vitesse</em>' containment reference.
	 * @see #getVitesse()
	 * @generated
	 */
	void setVitesse(TypeDataTypeVitesseLineaire value);

	/**
	 * Returns the value of the '<em><b>Angle Mouvement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle Mouvement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle Mouvement</em>' containment reference.
	 * @see #setAngleMouvement(TypeDataTypeAngle)
	 * @see mpia.schema.SchemaPackage#getTypeActivitePosture_AngleMouvement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AngleMouvement'"
	 * @generated
	 */
	TypeDataTypeAngle getAngleMouvement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeActivitePosture#getAngleMouvement <em>Angle Mouvement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Mouvement</em>' containment reference.
	 * @see #getAngleMouvement()
	 * @generated
	 */
	void setAngleMouvement(TypeDataTypeAngle value);

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
	 * @see mpia.schema.SchemaPackage#getTypeActivitePosture_Commentaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='Commentaire'"
	 * @generated
	 */
	String getCommentaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeActivitePosture#getCommentaire <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commentaire</em>' attribute.
	 * @see #getCommentaire()
	 * @generated
	 */
	void setCommentaire(String value);

	/**
	 * Returns the value of the '<em><b>Nb Axes Activite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Axes Activite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Axes Activite</em>' attribute.
	 * @see #isSetNbAxesActivite()
	 * @see #unsetNbAxesActivite()
	 * @see #setNbAxesActivite(long)
	 * @see mpia.schema.SchemaPackage#getTypeActivitePosture_NbAxesActivite()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NbAxesActivite'"
	 * @generated
	 */
	long getNbAxesActivite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeActivitePosture#getNbAxesActivite <em>Nb Axes Activite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Axes Activite</em>' attribute.
	 * @see #isSetNbAxesActivite()
	 * @see #unsetNbAxesActivite()
	 * @see #getNbAxesActivite()
	 * @generated
	 */
	void setNbAxesActivite(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeActivitePosture#getNbAxesActivite <em>Nb Axes Activite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNbAxesActivite()
	 * @see #getNbAxesActivite()
	 * @see #setNbAxesActivite(long)
	 * @generated
	 */
	void unsetNbAxesActivite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeActivitePosture#getNbAxesActivite <em>Nb Axes Activite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nb Axes Activite</em>' attribute is set.
	 * @see #unsetNbAxesActivite()
	 * @see #getNbAxesActivite()
	 * @see #setNbAxesActivite(long)
	 * @generated
	 */
	boolean isSetNbAxesActivite();

	/**
	 * Returns the value of the '<em><b>Niveau Confirmation</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMissionNiveauConfirmation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Niveau Confirmation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau Confirmation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionNiveauConfirmation
	 * @see #isSetNiveauConfirmation()
	 * @see #unsetNiveauConfirmation()
	 * @see #setNiveauConfirmation(TypeDictionaryDicoMissionNiveauConfirmation)
	 * @see mpia.schema.SchemaPackage#getTypeActivitePosture_NiveauConfirmation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='NiveauConfirmation'"
	 * @generated
	 */
	TypeDictionaryDicoMissionNiveauConfirmation getNiveauConfirmation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeActivitePosture#getNiveauConfirmation <em>Niveau Confirmation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Niveau Confirmation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionNiveauConfirmation
	 * @see #isSetNiveauConfirmation()
	 * @see #unsetNiveauConfirmation()
	 * @see #getNiveauConfirmation()
	 * @generated
	 */
	void setNiveauConfirmation(TypeDictionaryDicoMissionNiveauConfirmation value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeActivitePosture#getNiveauConfirmation <em>Niveau Confirmation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNiveauConfirmation()
	 * @see #getNiveauConfirmation()
	 * @see #setNiveauConfirmation(TypeDictionaryDicoMissionNiveauConfirmation)
	 * @generated
	 */
	void unsetNiveauConfirmation();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeActivitePosture#getNiveauConfirmation <em>Niveau Confirmation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Niveau Confirmation</em>' attribute is set.
	 * @see #unsetNiveauConfirmation()
	 * @see #getNiveauConfirmation()
	 * @see #setNiveauConfirmation(TypeDictionaryDicoMissionNiveauConfirmation)
	 * @generated
	 */
	boolean isSetNiveauConfirmation();

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
	 * @see mpia.schema.SchemaPackage#getTypeActivitePosture_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeActivitePosture#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeActivitePosture_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeActivitePosture#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Est Localise En Localisation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Localise En Localisation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Localise En Localisation</em>' containment reference.
	 * @see #setEstLocaliseEnLocalisation(TypeLocalisation)
	 * @see mpia.schema.SchemaPackage#getTypeActivitePosture_EstLocaliseEnLocalisation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Localisation'"
	 *        extendedMetaData="kind='element' name='EstLocaliseEn_Localisation'"
	 * @generated
	 */
	TypeLocalisation getEstLocaliseEnLocalisation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeActivitePosture#getEstLocaliseEnLocalisation <em>Est Localise En Localisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Localise En Localisation</em>' containment reference.
	 * @see #getEstLocaliseEnLocalisation()
	 * @generated
	 */
	void setEstLocaliseEnLocalisation(TypeLocalisation value);

	/**
	 * Returns the value of the '<em><b>APour Objectif Activite Instance Objet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Objectif Activite Instance Objet</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Objectif Activite Instance Objet</em>' containment reference.
	 * @see #setAPourObjectifActiviteInstanceObjet(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeActivitePosture_APourObjectifActiviteInstanceObjet()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_InstanceObjet'"
	 *        extendedMetaData="kind='element' name='APourObjectifActivite_InstanceObjet'"
	 * @generated
	 */
	TypeAssociation getAPourObjectifActiviteInstanceObjet();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeActivitePosture#getAPourObjectifActiviteInstanceObjet <em>APour Objectif Activite Instance Objet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Objectif Activite Instance Objet</em>' containment reference.
	 * @see #getAPourObjectifActiviteInstanceObjet()
	 * @generated
	 */
	void setAPourObjectifActiviteInstanceObjet(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Concerne Observation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Observation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Observation</em>' containment reference.
	 * @see #setConcerneObservation(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeActivitePosture_ConcerneObservation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourActivite_ActivitePosture' target_entity='type_Observation'"
	 *        extendedMetaData="kind='element' name='Concerne_Observation'"
	 * @generated
	 */
	TypeAssociation getConcerneObservation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeActivitePosture#getConcerneObservation <em>Concerne Observation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Observation</em>' containment reference.
	 * @see #getConcerneObservation()
	 * @generated
	 */
	void setConcerneObservation(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Concerne Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Unite</em>' containment reference.
	 * @see #setConcerneUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeActivitePosture_ConcerneUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourActivite_ActivitePosture' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='Concerne_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getConcerneUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeActivitePosture#getConcerneUnite <em>Concerne Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Unite</em>' containment reference.
	 * @see #getConcerneUnite()
	 * @generated
	 */
	void setConcerneUnite(TypeAssociationEXT value);

} // TypeActivitePosture
