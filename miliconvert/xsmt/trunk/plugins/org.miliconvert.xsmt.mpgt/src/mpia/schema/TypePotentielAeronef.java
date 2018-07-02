/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeDuree;
import mpia.meta.TypeDataTypeVolume;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Potentiel Aeronef</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypePotentielAeronef#isDisponibiliteAeronautique <em>Disponibilite Aeronautique</em>}</li>
 *   <li>{@link mpia.schema.TypePotentielAeronef#isDisponibiliteSystemeArmeMajeur <em>Disponibilite Systeme Arme Majeur</em>}</li>
 *   <li>{@link mpia.schema.TypePotentielAeronef#getDisponibiliteSousSystemes <em>Disponibilite Sous Systemes</em>}</li>
 *   <li>{@link mpia.schema.TypePotentielAeronef#getNombreLitresCarburantRestant <em>Nombre Litres Carburant Restant</em>}</li>
 *   <li>{@link mpia.schema.TypePotentielAeronef#getPotentielHoraireRestant <em>Potentiel Horaire Restant</em>}</li>
 *   <li>{@link mpia.schema.TypePotentielAeronef#getTempsVolConsommeAuCoursMouvement <em>Temps Vol Consomme Au Cours Mouvement</em>}</li>
 *   <li>{@link mpia.schema.TypePotentielAeronef#getTypeVI <em>Type VI</em>}</li>
 *   <li>{@link mpia.schema.TypePotentielAeronef#getHeureCelluleVI <em>Heure Cellule VI</em>}</li>
 *   <li>{@link mpia.schema.TypePotentielAeronef#getPotentielHoraireVI <em>Potentiel Horaire VI</em>}</li>
 *   <li>{@link mpia.schema.TypePotentielAeronef#getPotentielHoraireVP <em>Potentiel Horaire VP</em>}</li>
 *   <li>{@link mpia.schema.TypePotentielAeronef#getComplements <em>Complements</em>}</li>
 *   <li>{@link mpia.schema.TypePotentielAeronef#getRestrictionEmploi <em>Restriction Emploi</em>}</li>
 *   <li>{@link mpia.schema.TypePotentielAeronef#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypePotentielAeronef#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypePotentielAeronef#getConcerneAeronef <em>Concerne Aeronef</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypePotentielAeronef()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_PotentielAeronef' kind='elementOnly'"
 * @generated
 */
public interface TypePotentielAeronef extends EObject {
	/**
	 * Returns the value of the '<em><b>Disponibilite Aeronautique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disponibilite Aeronautique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disponibilite Aeronautique</em>' attribute.
	 * @see #isSetDisponibiliteAeronautique()
	 * @see #unsetDisponibiliteAeronautique()
	 * @see #setDisponibiliteAeronautique(boolean)
	 * @see mpia.schema.SchemaPackage#getTypePotentielAeronef_DisponibiliteAeronautique()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean" required="true"
	 *        extendedMetaData="kind='element' name='DisponibiliteAeronautique'"
	 * @generated
	 */
	boolean isDisponibiliteAeronautique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePotentielAeronef#isDisponibiliteAeronautique <em>Disponibilite Aeronautique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disponibilite Aeronautique</em>' attribute.
	 * @see #isSetDisponibiliteAeronautique()
	 * @see #unsetDisponibiliteAeronautique()
	 * @see #isDisponibiliteAeronautique()
	 * @generated
	 */
	void setDisponibiliteAeronautique(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePotentielAeronef#isDisponibiliteAeronautique <em>Disponibilite Aeronautique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisponibiliteAeronautique()
	 * @see #isDisponibiliteAeronautique()
	 * @see #setDisponibiliteAeronautique(boolean)
	 * @generated
	 */
	void unsetDisponibiliteAeronautique();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePotentielAeronef#isDisponibiliteAeronautique <em>Disponibilite Aeronautique</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Disponibilite Aeronautique</em>' attribute is set.
	 * @see #unsetDisponibiliteAeronautique()
	 * @see #isDisponibiliteAeronautique()
	 * @see #setDisponibiliteAeronautique(boolean)
	 * @generated
	 */
	boolean isSetDisponibiliteAeronautique();

	/**
	 * Returns the value of the '<em><b>Disponibilite Systeme Arme Majeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disponibilite Systeme Arme Majeur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disponibilite Systeme Arme Majeur</em>' attribute.
	 * @see #isSetDisponibiliteSystemeArmeMajeur()
	 * @see #unsetDisponibiliteSystemeArmeMajeur()
	 * @see #setDisponibiliteSystemeArmeMajeur(boolean)
	 * @see mpia.schema.SchemaPackage#getTypePotentielAeronef_DisponibiliteSystemeArmeMajeur()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean" required="true"
	 *        extendedMetaData="kind='element' name='DisponibiliteSystemeArmeMajeur'"
	 * @generated
	 */
	boolean isDisponibiliteSystemeArmeMajeur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePotentielAeronef#isDisponibiliteSystemeArmeMajeur <em>Disponibilite Systeme Arme Majeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disponibilite Systeme Arme Majeur</em>' attribute.
	 * @see #isSetDisponibiliteSystemeArmeMajeur()
	 * @see #unsetDisponibiliteSystemeArmeMajeur()
	 * @see #isDisponibiliteSystemeArmeMajeur()
	 * @generated
	 */
	void setDisponibiliteSystemeArmeMajeur(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePotentielAeronef#isDisponibiliteSystemeArmeMajeur <em>Disponibilite Systeme Arme Majeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisponibiliteSystemeArmeMajeur()
	 * @see #isDisponibiliteSystemeArmeMajeur()
	 * @see #setDisponibiliteSystemeArmeMajeur(boolean)
	 * @generated
	 */
	void unsetDisponibiliteSystemeArmeMajeur();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePotentielAeronef#isDisponibiliteSystemeArmeMajeur <em>Disponibilite Systeme Arme Majeur</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Disponibilite Systeme Arme Majeur</em>' attribute is set.
	 * @see #unsetDisponibiliteSystemeArmeMajeur()
	 * @see #isDisponibiliteSystemeArmeMajeur()
	 * @see #setDisponibiliteSystemeArmeMajeur(boolean)
	 * @generated
	 */
	boolean isSetDisponibiliteSystemeArmeMajeur();

	/**
	 * Returns the value of the '<em><b>Disponibilite Sous Systemes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disponibilite Sous Systemes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disponibilite Sous Systemes</em>' attribute.
	 * @see #setDisponibiliteSousSystemes(String)
	 * @see mpia.schema.SchemaPackage#getTypePotentielAeronef_DisponibiliteSousSystemes()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='DisponibiliteSousSystemes'"
	 * @generated
	 */
	String getDisponibiliteSousSystemes();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePotentielAeronef#getDisponibiliteSousSystemes <em>Disponibilite Sous Systemes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disponibilite Sous Systemes</em>' attribute.
	 * @see #getDisponibiliteSousSystemes()
	 * @generated
	 */
	void setDisponibiliteSousSystemes(String value);

	/**
	 * Returns the value of the '<em><b>Nombre Litres Carburant Restant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Litres Carburant Restant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Litres Carburant Restant</em>' containment reference.
	 * @see #setNombreLitresCarburantRestant(TypeDataTypeVolume)
	 * @see mpia.schema.SchemaPackage#getTypePotentielAeronef_NombreLitresCarburantRestant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NombreLitresCarburantRestant'"
	 * @generated
	 */
	TypeDataTypeVolume getNombreLitresCarburantRestant();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePotentielAeronef#getNombreLitresCarburantRestant <em>Nombre Litres Carburant Restant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Litres Carburant Restant</em>' containment reference.
	 * @see #getNombreLitresCarburantRestant()
	 * @generated
	 */
	void setNombreLitresCarburantRestant(TypeDataTypeVolume value);

	/**
	 * Returns the value of the '<em><b>Potentiel Horaire Restant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Potentiel Horaire Restant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Potentiel Horaire Restant</em>' containment reference.
	 * @see #setPotentielHoraireRestant(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypePotentielAeronef_PotentielHoraireRestant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PotentielHoraireRestant'"
	 * @generated
	 */
	TypeDataTypeDuree getPotentielHoraireRestant();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePotentielAeronef#getPotentielHoraireRestant <em>Potentiel Horaire Restant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Potentiel Horaire Restant</em>' containment reference.
	 * @see #getPotentielHoraireRestant()
	 * @generated
	 */
	void setPotentielHoraireRestant(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>Temps Vol Consomme Au Cours Mouvement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temps Vol Consomme Au Cours Mouvement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temps Vol Consomme Au Cours Mouvement</em>' containment reference.
	 * @see #setTempsVolConsommeAuCoursMouvement(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypePotentielAeronef_TempsVolConsommeAuCoursMouvement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TempsVolConsommeAuCoursMouvement'"
	 * @generated
	 */
	TypeDataTypeDuree getTempsVolConsommeAuCoursMouvement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePotentielAeronef#getTempsVolConsommeAuCoursMouvement <em>Temps Vol Consomme Au Cours Mouvement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temps Vol Consomme Au Cours Mouvement</em>' containment reference.
	 * @see #getTempsVolConsommeAuCoursMouvement()
	 * @generated
	 */
	void setTempsVolConsommeAuCoursMouvement(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>Type VI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type VI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type VI</em>' attribute.
	 * @see #setTypeVI(String)
	 * @see mpia.schema.SchemaPackage#getTypePotentielAeronef_TypeVI()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='TypeVI'"
	 * @generated
	 */
	String getTypeVI();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePotentielAeronef#getTypeVI <em>Type VI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type VI</em>' attribute.
	 * @see #getTypeVI()
	 * @generated
	 */
	void setTypeVI(String value);

	/**
	 * Returns the value of the '<em><b>Heure Cellule VI</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heure Cellule VI</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heure Cellule VI</em>' containment reference.
	 * @see #setHeureCelluleVI(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypePotentielAeronef_HeureCelluleVI()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='HeureCelluleVI'"
	 * @generated
	 */
	TypeDataTypeDuree getHeureCelluleVI();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePotentielAeronef#getHeureCelluleVI <em>Heure Cellule VI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heure Cellule VI</em>' containment reference.
	 * @see #getHeureCelluleVI()
	 * @generated
	 */
	void setHeureCelluleVI(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>Potentiel Horaire VI</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Potentiel Horaire VI</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Potentiel Horaire VI</em>' containment reference.
	 * @see #setPotentielHoraireVI(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypePotentielAeronef_PotentielHoraireVI()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PotentielHoraireVI'"
	 * @generated
	 */
	TypeDataTypeDuree getPotentielHoraireVI();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePotentielAeronef#getPotentielHoraireVI <em>Potentiel Horaire VI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Potentiel Horaire VI</em>' containment reference.
	 * @see #getPotentielHoraireVI()
	 * @generated
	 */
	void setPotentielHoraireVI(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>Potentiel Horaire VP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Potentiel Horaire VP</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Potentiel Horaire VP</em>' containment reference.
	 * @see #setPotentielHoraireVP(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypePotentielAeronef_PotentielHoraireVP()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PotentielHoraireVP'"
	 * @generated
	 */
	TypeDataTypeDuree getPotentielHoraireVP();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePotentielAeronef#getPotentielHoraireVP <em>Potentiel Horaire VP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Potentiel Horaire VP</em>' containment reference.
	 * @see #getPotentielHoraireVP()
	 * @generated
	 */
	void setPotentielHoraireVP(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>Complements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complements</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complements</em>' attribute.
	 * @see #setComplements(String)
	 * @see mpia.schema.SchemaPackage#getTypePotentielAeronef_Complements()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='Complements'"
	 * @generated
	 */
	String getComplements();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePotentielAeronef#getComplements <em>Complements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complements</em>' attribute.
	 * @see #getComplements()
	 * @generated
	 */
	void setComplements(String value);

	/**
	 * Returns the value of the '<em><b>Restriction Emploi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restriction Emploi</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restriction Emploi</em>' attribute.
	 * @see #setRestrictionEmploi(String)
	 * @see mpia.schema.SchemaPackage#getTypePotentielAeronef_RestrictionEmploi()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='RestrictionEmploi'"
	 * @generated
	 */
	String getRestrictionEmploi();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePotentielAeronef#getRestrictionEmploi <em>Restriction Emploi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restriction Emploi</em>' attribute.
	 * @see #getRestrictionEmploi()
	 * @generated
	 */
	void setRestrictionEmploi(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypePotentielAeronef_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePotentielAeronef#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypePotentielAeronef_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePotentielAeronef#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Concerne Aeronef</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Aeronef</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Aeronef</em>' containment reference.
	 * @see #setConcerneAeronef(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypePotentielAeronef_ConcerneAeronef()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Aeronef'"
	 *        extendedMetaData="kind='element' name='Concerne_Aeronef'"
	 * @generated
	 */
	TypeAssociation getConcerneAeronef();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePotentielAeronef#getConcerneAeronef <em>Concerne Aeronef</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Aeronef</em>' containment reference.
	 * @see #getConcerneAeronef()
	 * @generated
	 */
	void setConcerneAeronef(TypeAssociation value);

} // TypePotentielAeronef
