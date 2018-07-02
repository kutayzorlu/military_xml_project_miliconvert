/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Capteur RENS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCapteurRENS#getMissionsMissionRenseignement <em>Missions Mission Renseignement</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCapteurRENS()
 * @model abstract="true"
 *        extendedMetaData="name='type_CapteurRENS' kind='elementOnly'"
 * @generated
 */
public interface TypeCapteurRENS extends TypeEntiteOrganisationnelle {
	/**
	 * Returns the value of the '<em><b>Missions Mission Renseignement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Missions Mission Renseignement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Missions Mission Renseignement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeCapteurRENS_MissionsMissionRenseignement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='Capteur_CapteurRENS' target_entity='type_MissionRenseignement'"
	 *        extendedMetaData="kind='element' name='Missions_MissionRenseignement'"
	 * @generated
	 */
	EList<TypeAssociation> getMissionsMissionRenseignement();

} // TypeCapteurRENS
