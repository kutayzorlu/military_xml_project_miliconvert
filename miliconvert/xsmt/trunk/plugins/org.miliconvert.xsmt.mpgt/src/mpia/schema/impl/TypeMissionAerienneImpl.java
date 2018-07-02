/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCRmouvementAerien;
import mpia.schema.TypeDictionaryDicoMissionAerienneCategorie;
import mpia.schema.TypeDictionaryDicoMissionAerienneTypeDeclencheur;
import mpia.schema.TypeMissionAerienne;
import mpia.schema.TypePhaseVolDrone;
import mpia.schema.TypePositionPlots;
import mpia.schema.TypeTypeIntervenant3D;
import mpia.schema.TypeTypeMissionAerienne;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Mission Aerienne</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMissionAerienneImpl#getAutreOrdre <em>Autre Ordre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAerienneImpl#getCommentaireHoraire <em>Commentaire Horaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAerienneImpl#getCommentaireMissionRecue <em>Commentaire Mission Recue</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAerienneImpl#getCopieMissionOPOgtia <em>Copie Mission OP Ogtia</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAerienneImpl#getDatePrevision <em>Date Prevision</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAerienneImpl#getDateHeureH <em>Date Heure H</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAerienneImpl#getDateEmissionHoraire <em>Date Emission Horaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAerienneImpl#getIdentifiantAutreOrdre <em>Identifiant Autre Ordre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAerienneImpl#getIdentifiantMissionConjointeLiee <em>Identifiant Mission Conjointe Liee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAerienneImpl#getSyntheseSituationOPOgtia <em>Synthese Situation OP Ogtia</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAerienneImpl#isValidationPrevisionMouvement <em>Validation Prevision Mouvement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAerienneImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAerienneImpl#getTypeDeclencheur <em>Type Declencheur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAerienneImpl#getEstObjetAssociationConflit3DMissionAerienne <em>Est Objet Association Conflit3 DMission Aerienne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAerienneImpl#getEstObjetAssociationMissionAerienneMissionAerienne <em>Est Objet Association Mission Aerienne Mission Aerienne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAerienneImpl#getEstSujetAssociationMissionAerienneMissionAerienne <em>Est Sujet Association Mission Aerienne Mission Aerienne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAerienneImpl#getACommeConsigneConsigne <em>AComme Consigne Consigne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAerienneImpl#getEstObjetAssociationMesureCoordMissionAerienne <em>Est Objet Association Mesure Coord Mission Aerienne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAerienneImpl#getConcerneModule <em>Concerne Module</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAerienneImpl#getACommePositionPlotsPositionPlots <em>AComme Position Plots Position Plots</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAerienneImpl#getACommeIntervenant3DTypeIntervenant3D <em>AComme Intervenant3 DType Intervenant3 D</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAerienneImpl#getAPourTypeMissionAerienneTypeMissionAerienne <em>APour Type Mission Aerienne Type Mission Aerienne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAerienneImpl#getACommePhaseVolPhaseVolDrone <em>AComme Phase Vol Phase Vol Drone</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAerienneImpl#getDonneLieuACRmouvementAerien <em>Donne Lieu AC Rmouvement Aerien</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAerienneImpl#getACommeCaracteristiqueVolVol <em>AComme Caracteristique Vol Vol</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAerienneImpl#getEstAssocieOverlay <em>Est Associe Overlay</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAerienneImpl#getEstObjetAssociationUniteMissionAerienne <em>Est Objet Association Unite Mission Aerienne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAerienneImpl#getAPourModuleExecutantModule <em>APour Module Executant Module</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMissionAerienneImpl extends TypeMissionImpl implements TypeMissionAerienne {
	/**
	 * The default value of the '{@link #getAutreOrdre() <em>Autre Ordre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreOrdre()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTRE_ORDRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutreOrdre() <em>Autre Ordre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreOrdre()
	 * @generated
	 * @ordered
	 */
	protected String autreOrdre = AUTRE_ORDRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommentaireHoraire() <em>Commentaire Horaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaireHoraire()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTAIRE_HORAIRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommentaireHoraire() <em>Commentaire Horaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaireHoraire()
	 * @generated
	 * @ordered
	 */
	protected String commentaireHoraire = COMMENTAIRE_HORAIRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommentaireMissionRecue() <em>Commentaire Mission Recue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaireMissionRecue()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTAIRE_MISSION_RECUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommentaireMissionRecue() <em>Commentaire Mission Recue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaireMissionRecue()
	 * @generated
	 * @ordered
	 */
	protected String commentaireMissionRecue = COMMENTAIRE_MISSION_RECUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCopieMissionOPOgtia() <em>Copie Mission OP Ogtia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopieMissionOPOgtia()
	 * @generated
	 * @ordered
	 */
	protected static final String COPIE_MISSION_OP_OGTIA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCopieMissionOPOgtia() <em>Copie Mission OP Ogtia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopieMissionOPOgtia()
	 * @generated
	 * @ordered
	 */
	protected String copieMissionOPOgtia = COPIE_MISSION_OP_OGTIA_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatePrevision() <em>Date Prevision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatePrevision()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_PREVISION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatePrevision() <em>Date Prevision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatePrevision()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar datePrevision = DATE_PREVISION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateHeureH() <em>Date Heure H</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateHeureH()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_HEURE_H_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateHeureH() <em>Date Heure H</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateHeureH()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateHeureH = DATE_HEURE_H_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateEmissionHoraire() <em>Date Emission Horaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateEmissionHoraire()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_EMISSION_HORAIRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateEmissionHoraire() <em>Date Emission Horaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateEmissionHoraire()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateEmissionHoraire = DATE_EMISSION_HORAIRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentifiantAutreOrdre() <em>Identifiant Autre Ordre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiantAutreOrdre()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIANT_AUTRE_ORDRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifiantAutreOrdre() <em>Identifiant Autre Ordre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiantAutreOrdre()
	 * @generated
	 * @ordered
	 */
	protected String identifiantAutreOrdre = IDENTIFIANT_AUTRE_ORDRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentifiantMissionConjointeLiee() <em>Identifiant Mission Conjointe Liee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiantMissionConjointeLiee()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIANT_MISSION_CONJOINTE_LIEE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifiantMissionConjointeLiee() <em>Identifiant Mission Conjointe Liee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiantMissionConjointeLiee()
	 * @generated
	 * @ordered
	 */
	protected String identifiantMissionConjointeLiee = IDENTIFIANT_MISSION_CONJOINTE_LIEE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSyntheseSituationOPOgtia() <em>Synthese Situation OP Ogtia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyntheseSituationOPOgtia()
	 * @generated
	 * @ordered
	 */
	protected static final String SYNTHESE_SITUATION_OP_OGTIA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSyntheseSituationOPOgtia() <em>Synthese Situation OP Ogtia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyntheseSituationOPOgtia()
	 * @generated
	 * @ordered
	 */
	protected String syntheseSituationOPOgtia = SYNTHESE_SITUATION_OP_OGTIA_EDEFAULT;

	/**
	 * The default value of the '{@link #isValidationPrevisionMouvement() <em>Validation Prevision Mouvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValidationPrevisionMouvement()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VALIDATION_PREVISION_MOUVEMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isValidationPrevisionMouvement() <em>Validation Prevision Mouvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValidationPrevisionMouvement()
	 * @generated
	 * @ordered
	 */
	protected boolean validationPrevisionMouvement = VALIDATION_PREVISION_MOUVEMENT_EDEFAULT;

	/**
	 * This is true if the Validation Prevision Mouvement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean validationPrevisionMouvementESet;

	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMissionAerienneCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoMissionAerienneCategorie.UAV;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMissionAerienneCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getTypeDeclencheur() <em>Type Declencheur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDeclencheur()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMissionAerienneTypeDeclencheur TYPE_DECLENCHEUR_EDEFAULT = TypeDictionaryDicoMissionAerienneTypeDeclencheur.ORDER;

	/**
	 * The cached value of the '{@link #getTypeDeclencheur() <em>Type Declencheur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDeclencheur()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMissionAerienneTypeDeclencheur typeDeclencheur = TYPE_DECLENCHEUR_EDEFAULT;

	/**
	 * This is true if the Type Declencheur attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeDeclencheurESet;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationConflit3DMissionAerienne() <em>Est Objet Association Conflit3 DMission Aerienne</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationConflit3DMissionAerienne()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationConflit3DMissionAerienne;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationMissionAerienneMissionAerienne() <em>Est Objet Association Mission Aerienne Mission Aerienne</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationMissionAerienneMissionAerienne()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationMissionAerienneMissionAerienne;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationMissionAerienneMissionAerienne() <em>Est Sujet Association Mission Aerienne Mission Aerienne</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationMissionAerienneMissionAerienne()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationMissionAerienneMissionAerienne;

	/**
	 * The cached value of the '{@link #getACommeConsigneConsigne() <em>AComme Consigne Consigne</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeConsigneConsigne()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aCommeConsigneConsigne;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationMesureCoordMissionAerienne() <em>Est Objet Association Mesure Coord Mission Aerienne</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationMesureCoordMissionAerienne()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationMesureCoordMissionAerienne;

	/**
	 * The cached value of the '{@link #getConcerneModule() <em>Concerne Module</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneModule()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> concerneModule;

	/**
	 * The cached value of the '{@link #getACommePositionPlotsPositionPlots() <em>AComme Position Plots Position Plots</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommePositionPlotsPositionPlots()
	 * @generated
	 * @ordered
	 */
	protected EList<TypePositionPlots> aCommePositionPlotsPositionPlots;

	/**
	 * The cached value of the '{@link #getACommeIntervenant3DTypeIntervenant3D() <em>AComme Intervenant3 DType Intervenant3 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeIntervenant3DTypeIntervenant3D()
	 * @generated
	 * @ordered
	 */
	protected TypeTypeIntervenant3D aCommeIntervenant3DTypeIntervenant3D;

	/**
	 * The cached value of the '{@link #getAPourTypeMissionAerienneTypeMissionAerienne() <em>APour Type Mission Aerienne Type Mission Aerienne</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourTypeMissionAerienneTypeMissionAerienne()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeTypeMissionAerienne> aPourTypeMissionAerienneTypeMissionAerienne;

	/**
	 * The cached value of the '{@link #getACommePhaseVolPhaseVolDrone() <em>AComme Phase Vol Phase Vol Drone</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommePhaseVolPhaseVolDrone()
	 * @generated
	 * @ordered
	 */
	protected EList<TypePhaseVolDrone> aCommePhaseVolPhaseVolDrone;

	/**
	 * The cached value of the '{@link #getDonneLieuACRmouvementAerien() <em>Donne Lieu AC Rmouvement Aerien</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDonneLieuACRmouvementAerien()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeCRmouvementAerien> donneLieuACRmouvementAerien;

	/**
	 * The cached value of the '{@link #getACommeCaracteristiqueVolVol() <em>AComme Caracteristique Vol Vol</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeCaracteristiqueVolVol()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aCommeCaracteristiqueVolVol;

	/**
	 * The cached value of the '{@link #getEstAssocieOverlay() <em>Est Associe Overlay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstAssocieOverlay()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation estAssocieOverlay;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationUniteMissionAerienne() <em>Est Objet Association Unite Mission Aerienne</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationUniteMissionAerienne()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationUniteMissionAerienne;

	/**
	 * The cached value of the '{@link #getAPourModuleExecutantModule() <em>APour Module Executant Module</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourModuleExecutantModule()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourModuleExecutantModule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMissionAerienneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMissionAerienne();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutreOrdre() {
		return autreOrdre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutreOrdre(String newAutreOrdre) {
		String oldAutreOrdre = autreOrdre;
		autreOrdre = newAutreOrdre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_AERIENNE__AUTRE_ORDRE, oldAutreOrdre, autreOrdre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommentaireHoraire() {
		return commentaireHoraire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentaireHoraire(String newCommentaireHoraire) {
		String oldCommentaireHoraire = commentaireHoraire;
		commentaireHoraire = newCommentaireHoraire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_AERIENNE__COMMENTAIRE_HORAIRE, oldCommentaireHoraire, commentaireHoraire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommentaireMissionRecue() {
		return commentaireMissionRecue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentaireMissionRecue(String newCommentaireMissionRecue) {
		String oldCommentaireMissionRecue = commentaireMissionRecue;
		commentaireMissionRecue = newCommentaireMissionRecue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_AERIENNE__COMMENTAIRE_MISSION_RECUE, oldCommentaireMissionRecue, commentaireMissionRecue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCopieMissionOPOgtia() {
		return copieMissionOPOgtia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopieMissionOPOgtia(String newCopieMissionOPOgtia) {
		String oldCopieMissionOPOgtia = copieMissionOPOgtia;
		copieMissionOPOgtia = newCopieMissionOPOgtia;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_AERIENNE__COPIE_MISSION_OP_OGTIA, oldCopieMissionOPOgtia, copieMissionOPOgtia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDatePrevision() {
		return datePrevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatePrevision(XMLGregorianCalendar newDatePrevision) {
		XMLGregorianCalendar oldDatePrevision = datePrevision;
		datePrevision = newDatePrevision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_AERIENNE__DATE_PREVISION, oldDatePrevision, datePrevision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateHeureH() {
		return dateHeureH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateHeureH(XMLGregorianCalendar newDateHeureH) {
		XMLGregorianCalendar oldDateHeureH = dateHeureH;
		dateHeureH = newDateHeureH;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_AERIENNE__DATE_HEURE_H, oldDateHeureH, dateHeureH));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateEmissionHoraire() {
		return dateEmissionHoraire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateEmissionHoraire(XMLGregorianCalendar newDateEmissionHoraire) {
		XMLGregorianCalendar oldDateEmissionHoraire = dateEmissionHoraire;
		dateEmissionHoraire = newDateEmissionHoraire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_AERIENNE__DATE_EMISSION_HORAIRE, oldDateEmissionHoraire, dateEmissionHoraire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifiantAutreOrdre() {
		return identifiantAutreOrdre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifiantAutreOrdre(String newIdentifiantAutreOrdre) {
		String oldIdentifiantAutreOrdre = identifiantAutreOrdre;
		identifiantAutreOrdre = newIdentifiantAutreOrdre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_AERIENNE__IDENTIFIANT_AUTRE_ORDRE, oldIdentifiantAutreOrdre, identifiantAutreOrdre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifiantMissionConjointeLiee() {
		return identifiantMissionConjointeLiee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifiantMissionConjointeLiee(String newIdentifiantMissionConjointeLiee) {
		String oldIdentifiantMissionConjointeLiee = identifiantMissionConjointeLiee;
		identifiantMissionConjointeLiee = newIdentifiantMissionConjointeLiee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_AERIENNE__IDENTIFIANT_MISSION_CONJOINTE_LIEE, oldIdentifiantMissionConjointeLiee, identifiantMissionConjointeLiee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSyntheseSituationOPOgtia() {
		return syntheseSituationOPOgtia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSyntheseSituationOPOgtia(String newSyntheseSituationOPOgtia) {
		String oldSyntheseSituationOPOgtia = syntheseSituationOPOgtia;
		syntheseSituationOPOgtia = newSyntheseSituationOPOgtia;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_AERIENNE__SYNTHESE_SITUATION_OP_OGTIA, oldSyntheseSituationOPOgtia, syntheseSituationOPOgtia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isValidationPrevisionMouvement() {
		return validationPrevisionMouvement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidationPrevisionMouvement(boolean newValidationPrevisionMouvement) {
		boolean oldValidationPrevisionMouvement = validationPrevisionMouvement;
		validationPrevisionMouvement = newValidationPrevisionMouvement;
		boolean oldValidationPrevisionMouvementESet = validationPrevisionMouvementESet;
		validationPrevisionMouvementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_AERIENNE__VALIDATION_PREVISION_MOUVEMENT, oldValidationPrevisionMouvement, validationPrevisionMouvement, !oldValidationPrevisionMouvementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValidationPrevisionMouvement() {
		boolean oldValidationPrevisionMouvement = validationPrevisionMouvement;
		boolean oldValidationPrevisionMouvementESet = validationPrevisionMouvementESet;
		validationPrevisionMouvement = VALIDATION_PREVISION_MOUVEMENT_EDEFAULT;
		validationPrevisionMouvementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_AERIENNE__VALIDATION_PREVISION_MOUVEMENT, oldValidationPrevisionMouvement, VALIDATION_PREVISION_MOUVEMENT_EDEFAULT, oldValidationPrevisionMouvementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValidationPrevisionMouvement() {
		return validationPrevisionMouvementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMissionAerienneCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoMissionAerienneCategorie newCategorie) {
		TypeDictionaryDicoMissionAerienneCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_AERIENNE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoMissionAerienneCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_AERIENNE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCategorie() {
		return categorieESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMissionAerienneTypeDeclencheur getTypeDeclencheur() {
		return typeDeclencheur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeDeclencheur(TypeDictionaryDicoMissionAerienneTypeDeclencheur newTypeDeclencheur) {
		TypeDictionaryDicoMissionAerienneTypeDeclencheur oldTypeDeclencheur = typeDeclencheur;
		typeDeclencheur = newTypeDeclencheur == null ? TYPE_DECLENCHEUR_EDEFAULT : newTypeDeclencheur;
		boolean oldTypeDeclencheurESet = typeDeclencheurESet;
		typeDeclencheurESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_AERIENNE__TYPE_DECLENCHEUR, oldTypeDeclencheur, typeDeclencheur, !oldTypeDeclencheurESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeDeclencheur() {
		TypeDictionaryDicoMissionAerienneTypeDeclencheur oldTypeDeclencheur = typeDeclencheur;
		boolean oldTypeDeclencheurESet = typeDeclencheurESet;
		typeDeclencheur = TYPE_DECLENCHEUR_EDEFAULT;
		typeDeclencheurESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_AERIENNE__TYPE_DECLENCHEUR, oldTypeDeclencheur, TYPE_DECLENCHEUR_EDEFAULT, oldTypeDeclencheurESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeDeclencheur() {
		return typeDeclencheurESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationConflit3DMissionAerienne() {
		if (estObjetAssociationConflit3DMissionAerienne == null) {
			estObjetAssociationConflit3DMissionAerienne = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_AERIENNE__EST_OBJET_ASSOCIATION_CONFLIT3_DMISSION_AERIENNE);
		}
		return estObjetAssociationConflit3DMissionAerienne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationMissionAerienneMissionAerienne() {
		if (estObjetAssociationMissionAerienneMissionAerienne == null) {
			estObjetAssociationMissionAerienneMissionAerienne = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_AERIENNE__EST_OBJET_ASSOCIATION_MISSION_AERIENNE_MISSION_AERIENNE);
		}
		return estObjetAssociationMissionAerienneMissionAerienne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationMissionAerienneMissionAerienne() {
		if (estSujetAssociationMissionAerienneMissionAerienne == null) {
			estSujetAssociationMissionAerienneMissionAerienne = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_AERIENNE__EST_SUJET_ASSOCIATION_MISSION_AERIENNE_MISSION_AERIENNE);
		}
		return estSujetAssociationMissionAerienneMissionAerienne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getACommeConsigneConsigne() {
		if (aCommeConsigneConsigne == null) {
			aCommeConsigneConsigne = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_AERIENNE__ACOMME_CONSIGNE_CONSIGNE);
		}
		return aCommeConsigneConsigne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationMesureCoordMissionAerienne() {
		if (estObjetAssociationMesureCoordMissionAerienne == null) {
			estObjetAssociationMesureCoordMissionAerienne = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_AERIENNE__EST_OBJET_ASSOCIATION_MESURE_COORD_MISSION_AERIENNE);
		}
		return estObjetAssociationMesureCoordMissionAerienne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getConcerneModule() {
		if (concerneModule == null) {
			concerneModule = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_AERIENNE__CONCERNE_MODULE);
		}
		return concerneModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePositionPlots> getACommePositionPlotsPositionPlots() {
		if (aCommePositionPlotsPositionPlots == null) {
			aCommePositionPlotsPositionPlots = new EObjectContainmentEList<TypePositionPlots>(TypePositionPlots.class, this, SchemaPackage.TYPE_MISSION_AERIENNE__ACOMME_POSITION_PLOTS_POSITION_PLOTS);
		}
		return aCommePositionPlotsPositionPlots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeTypeIntervenant3D getACommeIntervenant3DTypeIntervenant3D() {
		return aCommeIntervenant3DTypeIntervenant3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeIntervenant3DTypeIntervenant3D(TypeTypeIntervenant3D newACommeIntervenant3DTypeIntervenant3D, NotificationChain msgs) {
		TypeTypeIntervenant3D oldACommeIntervenant3DTypeIntervenant3D = aCommeIntervenant3DTypeIntervenant3D;
		aCommeIntervenant3DTypeIntervenant3D = newACommeIntervenant3DTypeIntervenant3D;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_AERIENNE__ACOMME_INTERVENANT3_DTYPE_INTERVENANT3_D, oldACommeIntervenant3DTypeIntervenant3D, newACommeIntervenant3DTypeIntervenant3D);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeIntervenant3DTypeIntervenant3D(TypeTypeIntervenant3D newACommeIntervenant3DTypeIntervenant3D) {
		if (newACommeIntervenant3DTypeIntervenant3D != aCommeIntervenant3DTypeIntervenant3D) {
			NotificationChain msgs = null;
			if (aCommeIntervenant3DTypeIntervenant3D != null)
				msgs = ((InternalEObject)aCommeIntervenant3DTypeIntervenant3D).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_AERIENNE__ACOMME_INTERVENANT3_DTYPE_INTERVENANT3_D, null, msgs);
			if (newACommeIntervenant3DTypeIntervenant3D != null)
				msgs = ((InternalEObject)newACommeIntervenant3DTypeIntervenant3D).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_AERIENNE__ACOMME_INTERVENANT3_DTYPE_INTERVENANT3_D, null, msgs);
			msgs = basicSetACommeIntervenant3DTypeIntervenant3D(newACommeIntervenant3DTypeIntervenant3D, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_AERIENNE__ACOMME_INTERVENANT3_DTYPE_INTERVENANT3_D, newACommeIntervenant3DTypeIntervenant3D, newACommeIntervenant3DTypeIntervenant3D));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTypeMissionAerienne> getAPourTypeMissionAerienneTypeMissionAerienne() {
		if (aPourTypeMissionAerienneTypeMissionAerienne == null) {
			aPourTypeMissionAerienneTypeMissionAerienne = new EObjectContainmentEList<TypeTypeMissionAerienne>(TypeTypeMissionAerienne.class, this, SchemaPackage.TYPE_MISSION_AERIENNE__APOUR_TYPE_MISSION_AERIENNE_TYPE_MISSION_AERIENNE);
		}
		return aPourTypeMissionAerienneTypeMissionAerienne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePhaseVolDrone> getACommePhaseVolPhaseVolDrone() {
		if (aCommePhaseVolPhaseVolDrone == null) {
			aCommePhaseVolPhaseVolDrone = new EObjectContainmentEList<TypePhaseVolDrone>(TypePhaseVolDrone.class, this, SchemaPackage.TYPE_MISSION_AERIENNE__ACOMME_PHASE_VOL_PHASE_VOL_DRONE);
		}
		return aCommePhaseVolPhaseVolDrone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeCRmouvementAerien> getDonneLieuACRmouvementAerien() {
		if (donneLieuACRmouvementAerien == null) {
			donneLieuACRmouvementAerien = new EObjectContainmentEList<TypeCRmouvementAerien>(TypeCRmouvementAerien.class, this, SchemaPackage.TYPE_MISSION_AERIENNE__DONNE_LIEU_AC_RMOUVEMENT_AERIEN);
		}
		return donneLieuACRmouvementAerien;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getACommeCaracteristiqueVolVol() {
		if (aCommeCaracteristiqueVolVol == null) {
			aCommeCaracteristiqueVolVol = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_AERIENNE__ACOMME_CARACTERISTIQUE_VOL_VOL);
		}
		return aCommeCaracteristiqueVolVol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getEstAssocieOverlay() {
		return estAssocieOverlay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstAssocieOverlay(TypeAssociation newEstAssocieOverlay, NotificationChain msgs) {
		TypeAssociation oldEstAssocieOverlay = estAssocieOverlay;
		estAssocieOverlay = newEstAssocieOverlay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_AERIENNE__EST_ASSOCIE_OVERLAY, oldEstAssocieOverlay, newEstAssocieOverlay);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstAssocieOverlay(TypeAssociation newEstAssocieOverlay) {
		if (newEstAssocieOverlay != estAssocieOverlay) {
			NotificationChain msgs = null;
			if (estAssocieOverlay != null)
				msgs = ((InternalEObject)estAssocieOverlay).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_AERIENNE__EST_ASSOCIE_OVERLAY, null, msgs);
			if (newEstAssocieOverlay != null)
				msgs = ((InternalEObject)newEstAssocieOverlay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_AERIENNE__EST_ASSOCIE_OVERLAY, null, msgs);
			msgs = basicSetEstAssocieOverlay(newEstAssocieOverlay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_AERIENNE__EST_ASSOCIE_OVERLAY, newEstAssocieOverlay, newEstAssocieOverlay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationUniteMissionAerienne() {
		if (estObjetAssociationUniteMissionAerienne == null) {
			estObjetAssociationUniteMissionAerienne = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_AERIENNE__EST_OBJET_ASSOCIATION_UNITE_MISSION_AERIENNE);
		}
		return estObjetAssociationUniteMissionAerienne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourModuleExecutantModule() {
		if (aPourModuleExecutantModule == null) {
			aPourModuleExecutantModule = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_AERIENNE__APOUR_MODULE_EXECUTANT_MODULE);
		}
		return aPourModuleExecutantModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MISSION_AERIENNE__EST_OBJET_ASSOCIATION_CONFLIT3_DMISSION_AERIENNE:
				return ((InternalEList<?>)getEstObjetAssociationConflit3DMissionAerienne()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_AERIENNE__EST_OBJET_ASSOCIATION_MISSION_AERIENNE_MISSION_AERIENNE:
				return ((InternalEList<?>)getEstObjetAssociationMissionAerienneMissionAerienne()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_AERIENNE__EST_SUJET_ASSOCIATION_MISSION_AERIENNE_MISSION_AERIENNE:
				return ((InternalEList<?>)getEstSujetAssociationMissionAerienneMissionAerienne()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_AERIENNE__ACOMME_CONSIGNE_CONSIGNE:
				return ((InternalEList<?>)getACommeConsigneConsigne()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_AERIENNE__EST_OBJET_ASSOCIATION_MESURE_COORD_MISSION_AERIENNE:
				return ((InternalEList<?>)getEstObjetAssociationMesureCoordMissionAerienne()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_AERIENNE__CONCERNE_MODULE:
				return ((InternalEList<?>)getConcerneModule()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_AERIENNE__ACOMME_POSITION_PLOTS_POSITION_PLOTS:
				return ((InternalEList<?>)getACommePositionPlotsPositionPlots()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_AERIENNE__ACOMME_INTERVENANT3_DTYPE_INTERVENANT3_D:
				return basicSetACommeIntervenant3DTypeIntervenant3D(null, msgs);
			case SchemaPackage.TYPE_MISSION_AERIENNE__APOUR_TYPE_MISSION_AERIENNE_TYPE_MISSION_AERIENNE:
				return ((InternalEList<?>)getAPourTypeMissionAerienneTypeMissionAerienne()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_AERIENNE__ACOMME_PHASE_VOL_PHASE_VOL_DRONE:
				return ((InternalEList<?>)getACommePhaseVolPhaseVolDrone()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_AERIENNE__DONNE_LIEU_AC_RMOUVEMENT_AERIEN:
				return ((InternalEList<?>)getDonneLieuACRmouvementAerien()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_AERIENNE__ACOMME_CARACTERISTIQUE_VOL_VOL:
				return ((InternalEList<?>)getACommeCaracteristiqueVolVol()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_AERIENNE__EST_ASSOCIE_OVERLAY:
				return basicSetEstAssocieOverlay(null, msgs);
			case SchemaPackage.TYPE_MISSION_AERIENNE__EST_OBJET_ASSOCIATION_UNITE_MISSION_AERIENNE:
				return ((InternalEList<?>)getEstObjetAssociationUniteMissionAerienne()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_AERIENNE__APOUR_MODULE_EXECUTANT_MODULE:
				return ((InternalEList<?>)getAPourModuleExecutantModule()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_MISSION_AERIENNE__AUTRE_ORDRE:
				return getAutreOrdre();
			case SchemaPackage.TYPE_MISSION_AERIENNE__COMMENTAIRE_HORAIRE:
				return getCommentaireHoraire();
			case SchemaPackage.TYPE_MISSION_AERIENNE__COMMENTAIRE_MISSION_RECUE:
				return getCommentaireMissionRecue();
			case SchemaPackage.TYPE_MISSION_AERIENNE__COPIE_MISSION_OP_OGTIA:
				return getCopieMissionOPOgtia();
			case SchemaPackage.TYPE_MISSION_AERIENNE__DATE_PREVISION:
				return getDatePrevision();
			case SchemaPackage.TYPE_MISSION_AERIENNE__DATE_HEURE_H:
				return getDateHeureH();
			case SchemaPackage.TYPE_MISSION_AERIENNE__DATE_EMISSION_HORAIRE:
				return getDateEmissionHoraire();
			case SchemaPackage.TYPE_MISSION_AERIENNE__IDENTIFIANT_AUTRE_ORDRE:
				return getIdentifiantAutreOrdre();
			case SchemaPackage.TYPE_MISSION_AERIENNE__IDENTIFIANT_MISSION_CONJOINTE_LIEE:
				return getIdentifiantMissionConjointeLiee();
			case SchemaPackage.TYPE_MISSION_AERIENNE__SYNTHESE_SITUATION_OP_OGTIA:
				return getSyntheseSituationOPOgtia();
			case SchemaPackage.TYPE_MISSION_AERIENNE__VALIDATION_PREVISION_MOUVEMENT:
				return isValidationPrevisionMouvement() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_MISSION_AERIENNE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_MISSION_AERIENNE__TYPE_DECLENCHEUR:
				return getTypeDeclencheur();
			case SchemaPackage.TYPE_MISSION_AERIENNE__EST_OBJET_ASSOCIATION_CONFLIT3_DMISSION_AERIENNE:
				return getEstObjetAssociationConflit3DMissionAerienne();
			case SchemaPackage.TYPE_MISSION_AERIENNE__EST_OBJET_ASSOCIATION_MISSION_AERIENNE_MISSION_AERIENNE:
				return getEstObjetAssociationMissionAerienneMissionAerienne();
			case SchemaPackage.TYPE_MISSION_AERIENNE__EST_SUJET_ASSOCIATION_MISSION_AERIENNE_MISSION_AERIENNE:
				return getEstSujetAssociationMissionAerienneMissionAerienne();
			case SchemaPackage.TYPE_MISSION_AERIENNE__ACOMME_CONSIGNE_CONSIGNE:
				return getACommeConsigneConsigne();
			case SchemaPackage.TYPE_MISSION_AERIENNE__EST_OBJET_ASSOCIATION_MESURE_COORD_MISSION_AERIENNE:
				return getEstObjetAssociationMesureCoordMissionAerienne();
			case SchemaPackage.TYPE_MISSION_AERIENNE__CONCERNE_MODULE:
				return getConcerneModule();
			case SchemaPackage.TYPE_MISSION_AERIENNE__ACOMME_POSITION_PLOTS_POSITION_PLOTS:
				return getACommePositionPlotsPositionPlots();
			case SchemaPackage.TYPE_MISSION_AERIENNE__ACOMME_INTERVENANT3_DTYPE_INTERVENANT3_D:
				return getACommeIntervenant3DTypeIntervenant3D();
			case SchemaPackage.TYPE_MISSION_AERIENNE__APOUR_TYPE_MISSION_AERIENNE_TYPE_MISSION_AERIENNE:
				return getAPourTypeMissionAerienneTypeMissionAerienne();
			case SchemaPackage.TYPE_MISSION_AERIENNE__ACOMME_PHASE_VOL_PHASE_VOL_DRONE:
				return getACommePhaseVolPhaseVolDrone();
			case SchemaPackage.TYPE_MISSION_AERIENNE__DONNE_LIEU_AC_RMOUVEMENT_AERIEN:
				return getDonneLieuACRmouvementAerien();
			case SchemaPackage.TYPE_MISSION_AERIENNE__ACOMME_CARACTERISTIQUE_VOL_VOL:
				return getACommeCaracteristiqueVolVol();
			case SchemaPackage.TYPE_MISSION_AERIENNE__EST_ASSOCIE_OVERLAY:
				return getEstAssocieOverlay();
			case SchemaPackage.TYPE_MISSION_AERIENNE__EST_OBJET_ASSOCIATION_UNITE_MISSION_AERIENNE:
				return getEstObjetAssociationUniteMissionAerienne();
			case SchemaPackage.TYPE_MISSION_AERIENNE__APOUR_MODULE_EXECUTANT_MODULE:
				return getAPourModuleExecutantModule();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SchemaPackage.TYPE_MISSION_AERIENNE__AUTRE_ORDRE:
				setAutreOrdre((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__COMMENTAIRE_HORAIRE:
				setCommentaireHoraire((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__COMMENTAIRE_MISSION_RECUE:
				setCommentaireMissionRecue((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__COPIE_MISSION_OP_OGTIA:
				setCopieMissionOPOgtia((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__DATE_PREVISION:
				setDatePrevision((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__DATE_HEURE_H:
				setDateHeureH((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__DATE_EMISSION_HORAIRE:
				setDateEmissionHoraire((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__IDENTIFIANT_AUTRE_ORDRE:
				setIdentifiantAutreOrdre((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__IDENTIFIANT_MISSION_CONJOINTE_LIEE:
				setIdentifiantMissionConjointeLiee((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__SYNTHESE_SITUATION_OP_OGTIA:
				setSyntheseSituationOPOgtia((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__VALIDATION_PREVISION_MOUVEMENT:
				setValidationPrevisionMouvement(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__CATEGORIE:
				setCategorie((TypeDictionaryDicoMissionAerienneCategorie)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__TYPE_DECLENCHEUR:
				setTypeDeclencheur((TypeDictionaryDicoMissionAerienneTypeDeclencheur)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__EST_OBJET_ASSOCIATION_CONFLIT3_DMISSION_AERIENNE:
				getEstObjetAssociationConflit3DMissionAerienne().clear();
				getEstObjetAssociationConflit3DMissionAerienne().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__EST_OBJET_ASSOCIATION_MISSION_AERIENNE_MISSION_AERIENNE:
				getEstObjetAssociationMissionAerienneMissionAerienne().clear();
				getEstObjetAssociationMissionAerienneMissionAerienne().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__EST_SUJET_ASSOCIATION_MISSION_AERIENNE_MISSION_AERIENNE:
				getEstSujetAssociationMissionAerienneMissionAerienne().clear();
				getEstSujetAssociationMissionAerienneMissionAerienne().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__ACOMME_CONSIGNE_CONSIGNE:
				getACommeConsigneConsigne().clear();
				getACommeConsigneConsigne().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__EST_OBJET_ASSOCIATION_MESURE_COORD_MISSION_AERIENNE:
				getEstObjetAssociationMesureCoordMissionAerienne().clear();
				getEstObjetAssociationMesureCoordMissionAerienne().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__CONCERNE_MODULE:
				getConcerneModule().clear();
				getConcerneModule().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__ACOMME_POSITION_PLOTS_POSITION_PLOTS:
				getACommePositionPlotsPositionPlots().clear();
				getACommePositionPlotsPositionPlots().addAll((Collection<? extends TypePositionPlots>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__ACOMME_INTERVENANT3_DTYPE_INTERVENANT3_D:
				setACommeIntervenant3DTypeIntervenant3D((TypeTypeIntervenant3D)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__APOUR_TYPE_MISSION_AERIENNE_TYPE_MISSION_AERIENNE:
				getAPourTypeMissionAerienneTypeMissionAerienne().clear();
				getAPourTypeMissionAerienneTypeMissionAerienne().addAll((Collection<? extends TypeTypeMissionAerienne>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__ACOMME_PHASE_VOL_PHASE_VOL_DRONE:
				getACommePhaseVolPhaseVolDrone().clear();
				getACommePhaseVolPhaseVolDrone().addAll((Collection<? extends TypePhaseVolDrone>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__DONNE_LIEU_AC_RMOUVEMENT_AERIEN:
				getDonneLieuACRmouvementAerien().clear();
				getDonneLieuACRmouvementAerien().addAll((Collection<? extends TypeCRmouvementAerien>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__ACOMME_CARACTERISTIQUE_VOL_VOL:
				getACommeCaracteristiqueVolVol().clear();
				getACommeCaracteristiqueVolVol().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__EST_ASSOCIE_OVERLAY:
				setEstAssocieOverlay((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__EST_OBJET_ASSOCIATION_UNITE_MISSION_AERIENNE:
				getEstObjetAssociationUniteMissionAerienne().clear();
				getEstObjetAssociationUniteMissionAerienne().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__APOUR_MODULE_EXECUTANT_MODULE:
				getAPourModuleExecutantModule().clear();
				getAPourModuleExecutantModule().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SchemaPackage.TYPE_MISSION_AERIENNE__AUTRE_ORDRE:
				setAutreOrdre(AUTRE_ORDRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__COMMENTAIRE_HORAIRE:
				setCommentaireHoraire(COMMENTAIRE_HORAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__COMMENTAIRE_MISSION_RECUE:
				setCommentaireMissionRecue(COMMENTAIRE_MISSION_RECUE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__COPIE_MISSION_OP_OGTIA:
				setCopieMissionOPOgtia(COPIE_MISSION_OP_OGTIA_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__DATE_PREVISION:
				setDatePrevision(DATE_PREVISION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__DATE_HEURE_H:
				setDateHeureH(DATE_HEURE_H_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__DATE_EMISSION_HORAIRE:
				setDateEmissionHoraire(DATE_EMISSION_HORAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__IDENTIFIANT_AUTRE_ORDRE:
				setIdentifiantAutreOrdre(IDENTIFIANT_AUTRE_ORDRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__IDENTIFIANT_MISSION_CONJOINTE_LIEE:
				setIdentifiantMissionConjointeLiee(IDENTIFIANT_MISSION_CONJOINTE_LIEE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__SYNTHESE_SITUATION_OP_OGTIA:
				setSyntheseSituationOPOgtia(SYNTHESE_SITUATION_OP_OGTIA_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__VALIDATION_PREVISION_MOUVEMENT:
				unsetValidationPrevisionMouvement();
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__TYPE_DECLENCHEUR:
				unsetTypeDeclencheur();
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__EST_OBJET_ASSOCIATION_CONFLIT3_DMISSION_AERIENNE:
				getEstObjetAssociationConflit3DMissionAerienne().clear();
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__EST_OBJET_ASSOCIATION_MISSION_AERIENNE_MISSION_AERIENNE:
				getEstObjetAssociationMissionAerienneMissionAerienne().clear();
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__EST_SUJET_ASSOCIATION_MISSION_AERIENNE_MISSION_AERIENNE:
				getEstSujetAssociationMissionAerienneMissionAerienne().clear();
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__ACOMME_CONSIGNE_CONSIGNE:
				getACommeConsigneConsigne().clear();
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__EST_OBJET_ASSOCIATION_MESURE_COORD_MISSION_AERIENNE:
				getEstObjetAssociationMesureCoordMissionAerienne().clear();
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__CONCERNE_MODULE:
				getConcerneModule().clear();
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__ACOMME_POSITION_PLOTS_POSITION_PLOTS:
				getACommePositionPlotsPositionPlots().clear();
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__ACOMME_INTERVENANT3_DTYPE_INTERVENANT3_D:
				setACommeIntervenant3DTypeIntervenant3D((TypeTypeIntervenant3D)null);
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__APOUR_TYPE_MISSION_AERIENNE_TYPE_MISSION_AERIENNE:
				getAPourTypeMissionAerienneTypeMissionAerienne().clear();
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__ACOMME_PHASE_VOL_PHASE_VOL_DRONE:
				getACommePhaseVolPhaseVolDrone().clear();
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__DONNE_LIEU_AC_RMOUVEMENT_AERIEN:
				getDonneLieuACRmouvementAerien().clear();
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__ACOMME_CARACTERISTIQUE_VOL_VOL:
				getACommeCaracteristiqueVolVol().clear();
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__EST_ASSOCIE_OVERLAY:
				setEstAssocieOverlay((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__EST_OBJET_ASSOCIATION_UNITE_MISSION_AERIENNE:
				getEstObjetAssociationUniteMissionAerienne().clear();
				return;
			case SchemaPackage.TYPE_MISSION_AERIENNE__APOUR_MODULE_EXECUTANT_MODULE:
				getAPourModuleExecutantModule().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SchemaPackage.TYPE_MISSION_AERIENNE__AUTRE_ORDRE:
				return AUTRE_ORDRE_EDEFAULT == null ? autreOrdre != null : !AUTRE_ORDRE_EDEFAULT.equals(autreOrdre);
			case SchemaPackage.TYPE_MISSION_AERIENNE__COMMENTAIRE_HORAIRE:
				return COMMENTAIRE_HORAIRE_EDEFAULT == null ? commentaireHoraire != null : !COMMENTAIRE_HORAIRE_EDEFAULT.equals(commentaireHoraire);
			case SchemaPackage.TYPE_MISSION_AERIENNE__COMMENTAIRE_MISSION_RECUE:
				return COMMENTAIRE_MISSION_RECUE_EDEFAULT == null ? commentaireMissionRecue != null : !COMMENTAIRE_MISSION_RECUE_EDEFAULT.equals(commentaireMissionRecue);
			case SchemaPackage.TYPE_MISSION_AERIENNE__COPIE_MISSION_OP_OGTIA:
				return COPIE_MISSION_OP_OGTIA_EDEFAULT == null ? copieMissionOPOgtia != null : !COPIE_MISSION_OP_OGTIA_EDEFAULT.equals(copieMissionOPOgtia);
			case SchemaPackage.TYPE_MISSION_AERIENNE__DATE_PREVISION:
				return DATE_PREVISION_EDEFAULT == null ? datePrevision != null : !DATE_PREVISION_EDEFAULT.equals(datePrevision);
			case SchemaPackage.TYPE_MISSION_AERIENNE__DATE_HEURE_H:
				return DATE_HEURE_H_EDEFAULT == null ? dateHeureH != null : !DATE_HEURE_H_EDEFAULT.equals(dateHeureH);
			case SchemaPackage.TYPE_MISSION_AERIENNE__DATE_EMISSION_HORAIRE:
				return DATE_EMISSION_HORAIRE_EDEFAULT == null ? dateEmissionHoraire != null : !DATE_EMISSION_HORAIRE_EDEFAULT.equals(dateEmissionHoraire);
			case SchemaPackage.TYPE_MISSION_AERIENNE__IDENTIFIANT_AUTRE_ORDRE:
				return IDENTIFIANT_AUTRE_ORDRE_EDEFAULT == null ? identifiantAutreOrdre != null : !IDENTIFIANT_AUTRE_ORDRE_EDEFAULT.equals(identifiantAutreOrdre);
			case SchemaPackage.TYPE_MISSION_AERIENNE__IDENTIFIANT_MISSION_CONJOINTE_LIEE:
				return IDENTIFIANT_MISSION_CONJOINTE_LIEE_EDEFAULT == null ? identifiantMissionConjointeLiee != null : !IDENTIFIANT_MISSION_CONJOINTE_LIEE_EDEFAULT.equals(identifiantMissionConjointeLiee);
			case SchemaPackage.TYPE_MISSION_AERIENNE__SYNTHESE_SITUATION_OP_OGTIA:
				return SYNTHESE_SITUATION_OP_OGTIA_EDEFAULT == null ? syntheseSituationOPOgtia != null : !SYNTHESE_SITUATION_OP_OGTIA_EDEFAULT.equals(syntheseSituationOPOgtia);
			case SchemaPackage.TYPE_MISSION_AERIENNE__VALIDATION_PREVISION_MOUVEMENT:
				return isSetValidationPrevisionMouvement();
			case SchemaPackage.TYPE_MISSION_AERIENNE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_MISSION_AERIENNE__TYPE_DECLENCHEUR:
				return isSetTypeDeclencheur();
			case SchemaPackage.TYPE_MISSION_AERIENNE__EST_OBJET_ASSOCIATION_CONFLIT3_DMISSION_AERIENNE:
				return estObjetAssociationConflit3DMissionAerienne != null && !estObjetAssociationConflit3DMissionAerienne.isEmpty();
			case SchemaPackage.TYPE_MISSION_AERIENNE__EST_OBJET_ASSOCIATION_MISSION_AERIENNE_MISSION_AERIENNE:
				return estObjetAssociationMissionAerienneMissionAerienne != null && !estObjetAssociationMissionAerienneMissionAerienne.isEmpty();
			case SchemaPackage.TYPE_MISSION_AERIENNE__EST_SUJET_ASSOCIATION_MISSION_AERIENNE_MISSION_AERIENNE:
				return estSujetAssociationMissionAerienneMissionAerienne != null && !estSujetAssociationMissionAerienneMissionAerienne.isEmpty();
			case SchemaPackage.TYPE_MISSION_AERIENNE__ACOMME_CONSIGNE_CONSIGNE:
				return aCommeConsigneConsigne != null && !aCommeConsigneConsigne.isEmpty();
			case SchemaPackage.TYPE_MISSION_AERIENNE__EST_OBJET_ASSOCIATION_MESURE_COORD_MISSION_AERIENNE:
				return estObjetAssociationMesureCoordMissionAerienne != null && !estObjetAssociationMesureCoordMissionAerienne.isEmpty();
			case SchemaPackage.TYPE_MISSION_AERIENNE__CONCERNE_MODULE:
				return concerneModule != null && !concerneModule.isEmpty();
			case SchemaPackage.TYPE_MISSION_AERIENNE__ACOMME_POSITION_PLOTS_POSITION_PLOTS:
				return aCommePositionPlotsPositionPlots != null && !aCommePositionPlotsPositionPlots.isEmpty();
			case SchemaPackage.TYPE_MISSION_AERIENNE__ACOMME_INTERVENANT3_DTYPE_INTERVENANT3_D:
				return aCommeIntervenant3DTypeIntervenant3D != null;
			case SchemaPackage.TYPE_MISSION_AERIENNE__APOUR_TYPE_MISSION_AERIENNE_TYPE_MISSION_AERIENNE:
				return aPourTypeMissionAerienneTypeMissionAerienne != null && !aPourTypeMissionAerienneTypeMissionAerienne.isEmpty();
			case SchemaPackage.TYPE_MISSION_AERIENNE__ACOMME_PHASE_VOL_PHASE_VOL_DRONE:
				return aCommePhaseVolPhaseVolDrone != null && !aCommePhaseVolPhaseVolDrone.isEmpty();
			case SchemaPackage.TYPE_MISSION_AERIENNE__DONNE_LIEU_AC_RMOUVEMENT_AERIEN:
				return donneLieuACRmouvementAerien != null && !donneLieuACRmouvementAerien.isEmpty();
			case SchemaPackage.TYPE_MISSION_AERIENNE__ACOMME_CARACTERISTIQUE_VOL_VOL:
				return aCommeCaracteristiqueVolVol != null && !aCommeCaracteristiqueVolVol.isEmpty();
			case SchemaPackage.TYPE_MISSION_AERIENNE__EST_ASSOCIE_OVERLAY:
				return estAssocieOverlay != null;
			case SchemaPackage.TYPE_MISSION_AERIENNE__EST_OBJET_ASSOCIATION_UNITE_MISSION_AERIENNE:
				return estObjetAssociationUniteMissionAerienne != null && !estObjetAssociationUniteMissionAerienne.isEmpty();
			case SchemaPackage.TYPE_MISSION_AERIENNE__APOUR_MODULE_EXECUTANT_MODULE:
				return aPourModuleExecutantModule != null && !aPourModuleExecutantModule.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (autreOrdre: ");
		result.append(autreOrdre);
		result.append(", commentaireHoraire: ");
		result.append(commentaireHoraire);
		result.append(", commentaireMissionRecue: ");
		result.append(commentaireMissionRecue);
		result.append(", copieMissionOPOgtia: ");
		result.append(copieMissionOPOgtia);
		result.append(", datePrevision: ");
		result.append(datePrevision);
		result.append(", dateHeureH: ");
		result.append(dateHeureH);
		result.append(", dateEmissionHoraire: ");
		result.append(dateEmissionHoraire);
		result.append(", identifiantAutreOrdre: ");
		result.append(identifiantAutreOrdre);
		result.append(", identifiantMissionConjointeLiee: ");
		result.append(identifiantMissionConjointeLiee);
		result.append(", syntheseSituationOPOgtia: ");
		result.append(syntheseSituationOPOgtia);
		result.append(", validationPrevisionMouvement: ");
		if (validationPrevisionMouvementESet) result.append(validationPrevisionMouvement); else result.append("<unset>");
		result.append(", categorie: ");
		if (categorieESet) result.append(categorie); else result.append("<unset>");
		result.append(", typeDeclencheur: ");
		if (typeDeclencheurESet) result.append(typeDeclencheur); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeMissionAerienneImpl
