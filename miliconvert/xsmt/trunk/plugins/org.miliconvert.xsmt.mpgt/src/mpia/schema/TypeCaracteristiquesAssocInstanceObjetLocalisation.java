/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeAngle;
import mpia.meta.TypeDataTypeLongueur;
import mpia.meta.TypeDataTypeVitesseLineaire;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Caracteristiques Assoc Instance Objet Localisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCaracteristiquesAssocInstanceObjetLocalisation#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.TypeCaracteristiquesAssocInstanceObjetLocalisation#getNomBapteme <em>Nom Bapteme</em>}</li>
 *   <li>{@link mpia.schema.TypeCaracteristiquesAssocInstanceObjetLocalisation#getNumeroOrdre <em>Numero Ordre</em>}</li>
 *   <li>{@link mpia.schema.TypeCaracteristiquesAssocInstanceObjetLocalisation#getAngleInclinaison <em>Angle Inclinaison</em>}</li>
 *   <li>{@link mpia.schema.TypeCaracteristiquesAssocInstanceObjetLocalisation#getIncertitudeAngleInclinaison <em>Incertitude Angle Inclinaison</em>}</li>
 *   <li>{@link mpia.schema.TypeCaracteristiquesAssocInstanceObjetLocalisation#getIncertitudeAngleMouvement <em>Incertitude Angle Mouvement</em>}</li>
 *   <li>{@link mpia.schema.TypeCaracteristiquesAssocInstanceObjetLocalisation#getIncertitudeHorizontale <em>Incertitude Horizontale</em>}</li>
 *   <li>{@link mpia.schema.TypeCaracteristiquesAssocInstanceObjetLocalisation#getIncertitudeVerticale <em>Incertitude Verticale</em>}</li>
 *   <li>{@link mpia.schema.TypeCaracteristiquesAssocInstanceObjetLocalisation#getIncertitudeVitesse <em>Incertitude Vitesse</em>}</li>
 *   <li>{@link mpia.schema.TypeCaracteristiquesAssocInstanceObjetLocalisation#getPrecisionAngleInclinaison <em>Precision Angle Inclinaison</em>}</li>
 *   <li>{@link mpia.schema.TypeCaracteristiquesAssocInstanceObjetLocalisation#getPrecisionAngleMouvement <em>Precision Angle Mouvement</em>}</li>
 *   <li>{@link mpia.schema.TypeCaracteristiquesAssocInstanceObjetLocalisation#getPrecisionVitesse <em>Precision Vitesse</em>}</li>
 *   <li>{@link mpia.schema.TypeCaracteristiquesAssocInstanceObjetLocalisation#getVitesseRel <em>Vitesse Rel</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCaracteristiquesAssocInstanceObjetLocalisation()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_CaracteristiquesAssocInstanceObjetLocalisation' kind='elementOnly'"
 * @generated
 */
public interface TypeCaracteristiquesAssocInstanceObjetLocalisation extends EObject {
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
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiquesAssocInstanceObjetLocalisation_Commentaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='Commentaire'"
	 * @generated
	 */
	String getCommentaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiquesAssocInstanceObjetLocalisation#getCommentaire <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commentaire</em>' attribute.
	 * @see #getCommentaire()
	 * @generated
	 */
	void setCommentaire(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiquesAssocInstanceObjetLocalisation_NomBapteme()
	 * @model dataType="mpia.meta.TypeDataTypeChaine012"
	 *        extendedMetaData="kind='element' name='NomBapteme'"
	 * @generated
	 */
	String getNomBapteme();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiquesAssocInstanceObjetLocalisation#getNomBapteme <em>Nom Bapteme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Bapteme</em>' attribute.
	 * @see #getNomBapteme()
	 * @generated
	 */
	void setNomBapteme(String value);

	/**
	 * Returns the value of the '<em><b>Numero Ordre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Ordre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Ordre</em>' attribute.
	 * @see #isSetNumeroOrdre()
	 * @see #unsetNumeroOrdre()
	 * @see #setNumeroOrdre(long)
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiquesAssocInstanceObjetLocalisation_NumeroOrdre()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NumeroOrdre'"
	 * @generated
	 */
	long getNumeroOrdre();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiquesAssocInstanceObjetLocalisation#getNumeroOrdre <em>Numero Ordre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Ordre</em>' attribute.
	 * @see #isSetNumeroOrdre()
	 * @see #unsetNumeroOrdre()
	 * @see #getNumeroOrdre()
	 * @generated
	 */
	void setNumeroOrdre(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCaracteristiquesAssocInstanceObjetLocalisation#getNumeroOrdre <em>Numero Ordre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumeroOrdre()
	 * @see #getNumeroOrdre()
	 * @see #setNumeroOrdre(long)
	 * @generated
	 */
	void unsetNumeroOrdre();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCaracteristiquesAssocInstanceObjetLocalisation#getNumeroOrdre <em>Numero Ordre</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Numero Ordre</em>' attribute is set.
	 * @see #unsetNumeroOrdre()
	 * @see #getNumeroOrdre()
	 * @see #setNumeroOrdre(long)
	 * @generated
	 */
	boolean isSetNumeroOrdre();

	/**
	 * Returns the value of the '<em><b>Angle Inclinaison</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle Inclinaison</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle Inclinaison</em>' containment reference.
	 * @see #setAngleInclinaison(TypeDataTypeAngle)
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiquesAssocInstanceObjetLocalisation_AngleInclinaison()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AngleInclinaison'"
	 * @generated
	 */
	TypeDataTypeAngle getAngleInclinaison();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiquesAssocInstanceObjetLocalisation#getAngleInclinaison <em>Angle Inclinaison</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Inclinaison</em>' containment reference.
	 * @see #getAngleInclinaison()
	 * @generated
	 */
	void setAngleInclinaison(TypeDataTypeAngle value);

	/**
	 * Returns the value of the '<em><b>Incertitude Angle Inclinaison</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incertitude Angle Inclinaison</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incertitude Angle Inclinaison</em>' containment reference.
	 * @see #setIncertitudeAngleInclinaison(TypeDataTypeAngle)
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiquesAssocInstanceObjetLocalisation_IncertitudeAngleInclinaison()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IncertitudeAngleInclinaison'"
	 * @generated
	 */
	TypeDataTypeAngle getIncertitudeAngleInclinaison();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiquesAssocInstanceObjetLocalisation#getIncertitudeAngleInclinaison <em>Incertitude Angle Inclinaison</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incertitude Angle Inclinaison</em>' containment reference.
	 * @see #getIncertitudeAngleInclinaison()
	 * @generated
	 */
	void setIncertitudeAngleInclinaison(TypeDataTypeAngle value);

	/**
	 * Returns the value of the '<em><b>Incertitude Angle Mouvement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incertitude Angle Mouvement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incertitude Angle Mouvement</em>' containment reference.
	 * @see #setIncertitudeAngleMouvement(TypeDataTypeAngle)
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiquesAssocInstanceObjetLocalisation_IncertitudeAngleMouvement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IncertitudeAngleMouvement'"
	 * @generated
	 */
	TypeDataTypeAngle getIncertitudeAngleMouvement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiquesAssocInstanceObjetLocalisation#getIncertitudeAngleMouvement <em>Incertitude Angle Mouvement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incertitude Angle Mouvement</em>' containment reference.
	 * @see #getIncertitudeAngleMouvement()
	 * @generated
	 */
	void setIncertitudeAngleMouvement(TypeDataTypeAngle value);

	/**
	 * Returns the value of the '<em><b>Incertitude Horizontale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incertitude Horizontale</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incertitude Horizontale</em>' containment reference.
	 * @see #setIncertitudeHorizontale(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiquesAssocInstanceObjetLocalisation_IncertitudeHorizontale()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IncertitudeHorizontale'"
	 * @generated
	 */
	TypeDataTypeLongueur getIncertitudeHorizontale();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiquesAssocInstanceObjetLocalisation#getIncertitudeHorizontale <em>Incertitude Horizontale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incertitude Horizontale</em>' containment reference.
	 * @see #getIncertitudeHorizontale()
	 * @generated
	 */
	void setIncertitudeHorizontale(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Incertitude Verticale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incertitude Verticale</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incertitude Verticale</em>' containment reference.
	 * @see #setIncertitudeVerticale(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiquesAssocInstanceObjetLocalisation_IncertitudeVerticale()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IncertitudeVerticale'"
	 * @generated
	 */
	TypeDataTypeLongueur getIncertitudeVerticale();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiquesAssocInstanceObjetLocalisation#getIncertitudeVerticale <em>Incertitude Verticale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incertitude Verticale</em>' containment reference.
	 * @see #getIncertitudeVerticale()
	 * @generated
	 */
	void setIncertitudeVerticale(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Incertitude Vitesse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incertitude Vitesse</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incertitude Vitesse</em>' containment reference.
	 * @see #setIncertitudeVitesse(TypeDataTypeVitesseLineaire)
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiquesAssocInstanceObjetLocalisation_IncertitudeVitesse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IncertitudeVitesse'"
	 * @generated
	 */
	TypeDataTypeVitesseLineaire getIncertitudeVitesse();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiquesAssocInstanceObjetLocalisation#getIncertitudeVitesse <em>Incertitude Vitesse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incertitude Vitesse</em>' containment reference.
	 * @see #getIncertitudeVitesse()
	 * @generated
	 */
	void setIncertitudeVitesse(TypeDataTypeVitesseLineaire value);

	/**
	 * Returns the value of the '<em><b>Precision Angle Inclinaison</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPrecisionAngle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision Angle Inclinaison</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision Angle Inclinaison</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPrecisionAngle
	 * @see #isSetPrecisionAngleInclinaison()
	 * @see #unsetPrecisionAngleInclinaison()
	 * @see #setPrecisionAngleInclinaison(TypeDictionaryDicoPrecisionAngle)
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiquesAssocInstanceObjetLocalisation_PrecisionAngleInclinaison()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='PrecisionAngleInclinaison'"
	 * @generated
	 */
	TypeDictionaryDicoPrecisionAngle getPrecisionAngleInclinaison();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiquesAssocInstanceObjetLocalisation#getPrecisionAngleInclinaison <em>Precision Angle Inclinaison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision Angle Inclinaison</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPrecisionAngle
	 * @see #isSetPrecisionAngleInclinaison()
	 * @see #unsetPrecisionAngleInclinaison()
	 * @see #getPrecisionAngleInclinaison()
	 * @generated
	 */
	void setPrecisionAngleInclinaison(TypeDictionaryDicoPrecisionAngle value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCaracteristiquesAssocInstanceObjetLocalisation#getPrecisionAngleInclinaison <em>Precision Angle Inclinaison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrecisionAngleInclinaison()
	 * @see #getPrecisionAngleInclinaison()
	 * @see #setPrecisionAngleInclinaison(TypeDictionaryDicoPrecisionAngle)
	 * @generated
	 */
	void unsetPrecisionAngleInclinaison();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCaracteristiquesAssocInstanceObjetLocalisation#getPrecisionAngleInclinaison <em>Precision Angle Inclinaison</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Precision Angle Inclinaison</em>' attribute is set.
	 * @see #unsetPrecisionAngleInclinaison()
	 * @see #getPrecisionAngleInclinaison()
	 * @see #setPrecisionAngleInclinaison(TypeDictionaryDicoPrecisionAngle)
	 * @generated
	 */
	boolean isSetPrecisionAngleInclinaison();

	/**
	 * Returns the value of the '<em><b>Precision Angle Mouvement</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPrecisionAngle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision Angle Mouvement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision Angle Mouvement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPrecisionAngle
	 * @see #isSetPrecisionAngleMouvement()
	 * @see #unsetPrecisionAngleMouvement()
	 * @see #setPrecisionAngleMouvement(TypeDictionaryDicoPrecisionAngle)
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiquesAssocInstanceObjetLocalisation_PrecisionAngleMouvement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='PrecisionAngleMouvement'"
	 * @generated
	 */
	TypeDictionaryDicoPrecisionAngle getPrecisionAngleMouvement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiquesAssocInstanceObjetLocalisation#getPrecisionAngleMouvement <em>Precision Angle Mouvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision Angle Mouvement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPrecisionAngle
	 * @see #isSetPrecisionAngleMouvement()
	 * @see #unsetPrecisionAngleMouvement()
	 * @see #getPrecisionAngleMouvement()
	 * @generated
	 */
	void setPrecisionAngleMouvement(TypeDictionaryDicoPrecisionAngle value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCaracteristiquesAssocInstanceObjetLocalisation#getPrecisionAngleMouvement <em>Precision Angle Mouvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrecisionAngleMouvement()
	 * @see #getPrecisionAngleMouvement()
	 * @see #setPrecisionAngleMouvement(TypeDictionaryDicoPrecisionAngle)
	 * @generated
	 */
	void unsetPrecisionAngleMouvement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCaracteristiquesAssocInstanceObjetLocalisation#getPrecisionAngleMouvement <em>Precision Angle Mouvement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Precision Angle Mouvement</em>' attribute is set.
	 * @see #unsetPrecisionAngleMouvement()
	 * @see #getPrecisionAngleMouvement()
	 * @see #setPrecisionAngleMouvement(TypeDictionaryDicoPrecisionAngle)
	 * @generated
	 */
	boolean isSetPrecisionAngleMouvement();

	/**
	 * Returns the value of the '<em><b>Precision Vitesse</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPrecisionVitesse}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision Vitesse</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision Vitesse</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPrecisionVitesse
	 * @see #isSetPrecisionVitesse()
	 * @see #unsetPrecisionVitesse()
	 * @see #setPrecisionVitesse(TypeDictionaryDicoPrecisionVitesse)
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiquesAssocInstanceObjetLocalisation_PrecisionVitesse()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='PrecisionVitesse'"
	 * @generated
	 */
	TypeDictionaryDicoPrecisionVitesse getPrecisionVitesse();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiquesAssocInstanceObjetLocalisation#getPrecisionVitesse <em>Precision Vitesse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision Vitesse</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPrecisionVitesse
	 * @see #isSetPrecisionVitesse()
	 * @see #unsetPrecisionVitesse()
	 * @see #getPrecisionVitesse()
	 * @generated
	 */
	void setPrecisionVitesse(TypeDictionaryDicoPrecisionVitesse value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCaracteristiquesAssocInstanceObjetLocalisation#getPrecisionVitesse <em>Precision Vitesse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrecisionVitesse()
	 * @see #getPrecisionVitesse()
	 * @see #setPrecisionVitesse(TypeDictionaryDicoPrecisionVitesse)
	 * @generated
	 */
	void unsetPrecisionVitesse();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCaracteristiquesAssocInstanceObjetLocalisation#getPrecisionVitesse <em>Precision Vitesse</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Precision Vitesse</em>' attribute is set.
	 * @see #unsetPrecisionVitesse()
	 * @see #getPrecisionVitesse()
	 * @see #setPrecisionVitesse(TypeDictionaryDicoPrecisionVitesse)
	 * @generated
	 */
	boolean isSetPrecisionVitesse();

	/**
	 * Returns the value of the '<em><b>Vitesse Rel</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCaracteristiquesAssocInstanceObjetLocalisationVitesseRel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vitesse Rel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vitesse Rel</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCaracteristiquesAssocInstanceObjetLocalisationVitesseRel
	 * @see #isSetVitesseRel()
	 * @see #unsetVitesseRel()
	 * @see #setVitesseRel(TypeDictionaryDicoCaracteristiquesAssocInstanceObjetLocalisationVitesseRel)
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiquesAssocInstanceObjetLocalisation_VitesseRel()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='VitesseRel'"
	 * @generated
	 */
	TypeDictionaryDicoCaracteristiquesAssocInstanceObjetLocalisationVitesseRel getVitesseRel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiquesAssocInstanceObjetLocalisation#getVitesseRel <em>Vitesse Rel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vitesse Rel</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCaracteristiquesAssocInstanceObjetLocalisationVitesseRel
	 * @see #isSetVitesseRel()
	 * @see #unsetVitesseRel()
	 * @see #getVitesseRel()
	 * @generated
	 */
	void setVitesseRel(TypeDictionaryDicoCaracteristiquesAssocInstanceObjetLocalisationVitesseRel value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCaracteristiquesAssocInstanceObjetLocalisation#getVitesseRel <em>Vitesse Rel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVitesseRel()
	 * @see #getVitesseRel()
	 * @see #setVitesseRel(TypeDictionaryDicoCaracteristiquesAssocInstanceObjetLocalisationVitesseRel)
	 * @generated
	 */
	void unsetVitesseRel();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCaracteristiquesAssocInstanceObjetLocalisation#getVitesseRel <em>Vitesse Rel</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vitesse Rel</em>' attribute is set.
	 * @see #unsetVitesseRel()
	 * @see #getVitesseRel()
	 * @see #setVitesseRel(TypeDictionaryDicoCaracteristiquesAssocInstanceObjetLocalisationVitesseRel)
	 * @generated
	 */
	boolean isSetVitesseRel();

} // TypeCaracteristiquesAssocInstanceObjetLocalisation
