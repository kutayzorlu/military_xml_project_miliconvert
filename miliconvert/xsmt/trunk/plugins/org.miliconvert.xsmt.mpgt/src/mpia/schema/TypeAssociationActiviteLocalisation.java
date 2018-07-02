/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeAngle;
import mpia.meta.TypeDataTypeVitesseLineaire;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Association Activite Localisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationActiviteLocalisation#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationActiviteLocalisation#getNomBapteme <em>Nom Bapteme</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationActiviteLocalisation#getAngleMouvement <em>Angle Mouvement</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationActiviteLocalisation#getNbAxeActivite <em>Nb Axe Activite</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationActiviteLocalisation#getVitesse <em>Vitesse</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationActiviteLocalisation#getIncertitude <em>Incertitude</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationActiviteLocalisation#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationActiviteLocalisation#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationActiviteLocalisation#getAssocieCommeObjetLocalisation <em>Associe Comme Objet Localisation</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationActiviteLocalisation#getEstRapporteeParRapport <em>Est Rapportee Par Rapport</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationActiviteLocalisation()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_AssociationActiviteLocalisation' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationActiviteLocalisation extends EObject {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationActiviteLocalisationCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationActiviteLocalisationCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationActiviteLocalisationCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationActiviteLocalisation_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationActiviteLocalisationCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationActiviteLocalisation#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationActiviteLocalisationCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationActiviteLocalisationCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationActiviteLocalisation#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationActiviteLocalisationCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationActiviteLocalisation#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationActiviteLocalisationCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Nom Bapteme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom Bapteme</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Bapteme</em>' attribute.
	 * @see #setNomBapteme(String)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationActiviteLocalisation_NomBapteme()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='NomBapteme'"
	 * @generated
	 */
	String getNomBapteme();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationActiviteLocalisation#getNomBapteme <em>Nom Bapteme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Bapteme</em>' attribute.
	 * @see #getNomBapteme()
	 * @generated
	 */
	void setNomBapteme(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationActiviteLocalisation_AngleMouvement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AngleMouvement'"
	 * @generated
	 */
	TypeDataTypeAngle getAngleMouvement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationActiviteLocalisation#getAngleMouvement <em>Angle Mouvement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Mouvement</em>' containment reference.
	 * @see #getAngleMouvement()
	 * @generated
	 */
	void setAngleMouvement(TypeDataTypeAngle value);

	/**
	 * Returns the value of the '<em><b>Nb Axe Activite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Axe Activite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Axe Activite</em>' attribute.
	 * @see #isSetNbAxeActivite()
	 * @see #unsetNbAxeActivite()
	 * @see #setNbAxeActivite(long)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationActiviteLocalisation_NbAxeActivite()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NbAxeActivite'"
	 * @generated
	 */
	long getNbAxeActivite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationActiviteLocalisation#getNbAxeActivite <em>Nb Axe Activite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Axe Activite</em>' attribute.
	 * @see #isSetNbAxeActivite()
	 * @see #unsetNbAxeActivite()
	 * @see #getNbAxeActivite()
	 * @generated
	 */
	void setNbAxeActivite(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationActiviteLocalisation#getNbAxeActivite <em>Nb Axe Activite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNbAxeActivite()
	 * @see #getNbAxeActivite()
	 * @see #setNbAxeActivite(long)
	 * @generated
	 */
	void unsetNbAxeActivite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationActiviteLocalisation#getNbAxeActivite <em>Nb Axe Activite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nb Axe Activite</em>' attribute is set.
	 * @see #unsetNbAxeActivite()
	 * @see #getNbAxeActivite()
	 * @see #setNbAxeActivite(long)
	 * @generated
	 */
	boolean isSetNbAxeActivite();

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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationActiviteLocalisation_Vitesse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Vitesse'"
	 * @generated
	 */
	TypeDataTypeVitesseLineaire getVitesse();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationActiviteLocalisation#getVitesse <em>Vitesse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vitesse</em>' containment reference.
	 * @see #getVitesse()
	 * @generated
	 */
	void setVitesse(TypeDataTypeVitesseLineaire value);

	/**
	 * Returns the value of the '<em><b>Incertitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incertitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incertitude</em>' attribute.
	 * @see #isSetIncertitude()
	 * @see #unsetIncertitude()
	 * @see #setIncertitude(double)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationActiviteLocalisation_Incertitude()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='Incertitude'"
	 * @generated
	 */
	double getIncertitude();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationActiviteLocalisation#getIncertitude <em>Incertitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incertitude</em>' attribute.
	 * @see #isSetIncertitude()
	 * @see #unsetIncertitude()
	 * @see #getIncertitude()
	 * @generated
	 */
	void setIncertitude(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationActiviteLocalisation#getIncertitude <em>Incertitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIncertitude()
	 * @see #getIncertitude()
	 * @see #setIncertitude(double)
	 * @generated
	 */
	void unsetIncertitude();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationActiviteLocalisation#getIncertitude <em>Incertitude</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Incertitude</em>' attribute is set.
	 * @see #unsetIncertitude()
	 * @see #getIncertitude()
	 * @see #setIncertitude(double)
	 * @generated
	 */
	boolean isSetIncertitude();

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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationActiviteLocalisation_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationActiviteLocalisation#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationActiviteLocalisation_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationActiviteLocalisation#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Associe Comme Objet Localisation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Objet Localisation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Objet Localisation</em>' containment reference.
	 * @see #setAssocieCommeObjetLocalisation(TypeLocalisation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationActiviteLocalisation_AssocieCommeObjetLocalisation()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Localisation'"
	 *        extendedMetaData="kind='element' name='AssocieCommeObjet_Localisation'"
	 * @generated
	 */
	TypeLocalisation getAssocieCommeObjetLocalisation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationActiviteLocalisation#getAssocieCommeObjetLocalisation <em>Associe Comme Objet Localisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Objet Localisation</em>' containment reference.
	 * @see #getAssocieCommeObjetLocalisation()
	 * @generated
	 */
	void setAssocieCommeObjetLocalisation(TypeLocalisation value);

	/**
	 * Returns the value of the '<em><b>Est Rapportee Par Rapport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Rapportee Par Rapport</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Rapportee Par Rapport</em>' containment reference.
	 * @see #setEstRapporteeParRapport(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationActiviteLocalisation_EstRapporteeParRapport()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Rapport'"
	 *        extendedMetaData="kind='element' name='EstRapporteePar_Rapport'"
	 * @generated
	 */
	TypeAssociation getEstRapporteeParRapport();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationActiviteLocalisation#getEstRapporteeParRapport <em>Est Rapportee Par Rapport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Rapportee Par Rapport</em>' containment reference.
	 * @see #getEstRapporteeParRapport()
	 * @generated
	 */
	void setEstRapporteeParRapport(TypeAssociation value);

} // TypeAssociationActiviteLocalisation
