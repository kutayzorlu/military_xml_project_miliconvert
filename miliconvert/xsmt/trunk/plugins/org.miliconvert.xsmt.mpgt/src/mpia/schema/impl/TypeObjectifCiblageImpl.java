/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;
import mpia.meta.TypeDataTypeDuree;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationObjectifCiblageLocalisation;
import mpia.schema.TypeAutorisationObjectifCiblage;
import mpia.schema.TypeDictionaryDicoEchelonTactiqueObjectif;
import mpia.schema.TypeDictionaryDicoObjectifCiblageAutoriteEngagement;
import mpia.schema.TypeDictionaryDicoObjectifCiblageEffetRecherche;
import mpia.schema.TypeDictionaryDicoObjectifCiblageNormeIdentification;
import mpia.schema.TypeDictionaryDicoObjectifCiblageType;
import mpia.schema.TypeMarquageObjectif;
import mpia.schema.TypeMobilite;
import mpia.schema.TypeObjectifASS;
import mpia.schema.TypeObjectifActiviteType;
import mpia.schema.TypeObjectifAlat;
import mpia.schema.TypeObjectifCiblage;
import mpia.schema.TypeObjectifMajeur;
import mpia.schema.TypeProtectionPersonnel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Objectif Ciblage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeObjectifCiblageImpl#getNormeIdentification <em>Norme Identification</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifCiblageImpl#getIdentification <em>Identification</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifCiblageImpl#getPriorite <em>Priorite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifCiblageImpl#getType <em>Type</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifCiblageImpl#getAutoriteEngagement <em>Autorite Engagement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifCiblageImpl#getEffetRecherche <em>Effet Recherche</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifCiblageImpl#getNature <em>Nature</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifCiblageImpl#getEchelonTactique <em>Echelon Tactique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifCiblageImpl#getVolume <em>Volume</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifCiblageImpl#getDureeDisponibilite <em>Duree Disponibilite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifCiblageImpl#getDommagesCollateraux <em>Dommages Collateraux</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifCiblageImpl#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifCiblageImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifCiblageImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifCiblageImpl#getAssocieCommeTypeObjectifActiviteType <em>Associe Comme Type Objectif Activite Type</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifCiblageImpl#getACommeProtectionPersonnelProtectionPersonnel <em>AComme Protection Personnel Protection Personnel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifCiblageImpl#getAPourMobiliteMobilite <em>APour Mobilite Mobilite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifCiblageImpl#getEstLocaliseParAssociationObjectifCiblageLocalisation <em>Est Localise Par Association Objectif Ciblage Localisation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifCiblageImpl#getAPourCaracteristiquesObjectifMajeurObjectifMajeur <em>APour Caracteristiques Objectif Majeur Objectif Majeur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifCiblageImpl#getAPourCaracteristiquesASSObjectifASS <em>APour Caracteristiques ASS Objectif ASS</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifCiblageImpl#getAPourCaracteristiqueAlatObjectifAlat <em>APour Caracteristique Alat Objectif Alat</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifCiblageImpl#getAPourCreateurUnite <em>APour Createur Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifCiblageImpl#getAPourUniteFeuxAEngagerReservationUnite <em>APour Unite Feux AEngager Reservation Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifCiblageImpl#getAPourDocumentAssocieAssociationObjectifCiblageDocument <em>APour Document Associe Association Objectif Ciblage Document</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifCiblageImpl#getACommeAutorisationAutorisationObjectifCiblage <em>AComme Autorisation Autorisation Objectif Ciblage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifCiblageImpl#getEstIdentifieParMarquageObjectif <em>Est Identifie Par Marquage Objectif</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifCiblageImpl#getCorrespondAObjectifActivite <em>Correspond AObjectif Activite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifCiblageImpl#getACommeListeObjectifsListeObjectifs <em>AComme Liste Objectifs Liste Objectifs</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifCiblageImpl#getContraintAssociationObjectifCiblageObjectifCiblage <em>Contraint Association Objectif Ciblage Objectif Ciblage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifCiblageImpl#getDependAssociationObjectifCiblageObjectifCiblage <em>Depend Association Objectif Ciblage Objectif Ciblage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifCiblageImpl#getAssocieCommeInstanceObjetInstanceObjet <em>Associe Comme Instance Objet Instance Objet</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeObjectifCiblageImpl extends EObjectImpl implements TypeObjectifCiblage {
	/**
	 * The default value of the '{@link #getNormeIdentification() <em>Norme Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormeIdentification()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoObjectifCiblageNormeIdentification NORME_IDENTIFICATION_EDEFAULT = TypeDictionaryDicoObjectifCiblageNormeIdentification.ABCA;

	/**
	 * The cached value of the '{@link #getNormeIdentification() <em>Norme Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormeIdentification()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoObjectifCiblageNormeIdentification normeIdentification = NORME_IDENTIFICATION_EDEFAULT;

	/**
	 * This is true if the Norme Identification attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean normeIdentificationESet;

	/**
	 * The default value of the '{@link #getIdentification() <em>Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentification()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentification() <em>Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentification()
	 * @generated
	 * @ordered
	 */
	protected String identification = IDENTIFICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriorite() <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorite()
	 * @generated
	 * @ordered
	 */
	protected static final long PRIORITE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getPriorite() <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorite()
	 * @generated
	 * @ordered
	 */
	protected long priorite = PRIORITE_EDEFAULT;

	/**
	 * This is true if the Priorite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean prioriteESet;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoObjectifCiblageType TYPE_EDEFAULT = TypeDictionaryDicoObjectifCiblageType.PTL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoObjectifCiblageType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #getAutoriteEngagement() <em>Autorite Engagement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoriteEngagement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoObjectifCiblageAutoriteEngagement AUTORITE_ENGAGEMENT_EDEFAULT = TypeDictionaryDicoObjectifCiblageAutoriteEngagement.EXCL;

	/**
	 * The cached value of the '{@link #getAutoriteEngagement() <em>Autorite Engagement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoriteEngagement()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoObjectifCiblageAutoriteEngagement autoriteEngagement = AUTORITE_ENGAGEMENT_EDEFAULT;

	/**
	 * This is true if the Autorite Engagement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean autoriteEngagementESet;

	/**
	 * The default value of the '{@link #getEffetRecherche() <em>Effet Recherche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffetRecherche()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoObjectifCiblageEffetRecherche EFFET_RECHERCHE_EDEFAULT = TypeDictionaryDicoObjectifCiblageEffetRecherche.ATTACK;

	/**
	 * The cached value of the '{@link #getEffetRecherche() <em>Effet Recherche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffetRecherche()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoObjectifCiblageEffetRecherche effetRecherche = EFFET_RECHERCHE_EDEFAULT;

	/**
	 * This is true if the Effet Recherche attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean effetRechercheESet;

	/**
	 * The default value of the '{@link #getNature() <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNature()
	 * @generated
	 * @ordered
	 */
	protected static final String NATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNature() <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNature()
	 * @generated
	 * @ordered
	 */
	protected String nature = NATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEchelonTactique() <em>Echelon Tactique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEchelonTactique()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEchelonTactiqueObjectif ECHELON_TACTIQUE_EDEFAULT = TypeDictionaryDicoEchelonTactiqueObjectif.BN;

	/**
	 * The cached value of the '{@link #getEchelonTactique() <em>Echelon Tactique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEchelonTactique()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEchelonTactiqueObjectif echelonTactique = ECHELON_TACTIQUE_EDEFAULT;

	/**
	 * This is true if the Echelon Tactique attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean echelonTactiqueESet;

	/**
	 * The default value of the '{@link #getVolume() <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected static final String VOLUME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVolume() <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected String volume = VOLUME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDureeDisponibilite() <em>Duree Disponibilite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDureeDisponibilite()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree dureeDisponibilite;

	/**
	 * The default value of the '{@link #getDommagesCollateraux() <em>Dommages Collateraux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDommagesCollateraux()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMMAGES_COLLATERAUX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDommagesCollateraux() <em>Dommages Collateraux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDommagesCollateraux()
	 * @generated
	 * @ordered
	 */
	protected String dommagesCollateraux = DOMMAGES_COLLATERAUX_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommentaire() <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaire()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTAIRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommentaire() <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaire()
	 * @generated
	 * @ordered
	 */
	protected String commentaire = COMMENTAIRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCTE() <em>CTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCTE()
	 * @generated
	 * @ordered
	 */
	protected static final String CTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCTE() <em>CTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCTE()
	 * @generated
	 * @ordered
	 */
	protected String cTE = CTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCE() <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCE()
	 * @generated
	 * @ordered
	 */
	protected static final String CE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCE() <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCE()
	 * @generated
	 * @ordered
	 */
	protected String cE = CE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssocieCommeTypeObjectifActiviteType() <em>Associe Comme Type Objectif Activite Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeTypeObjectifActiviteType()
	 * @generated
	 * @ordered
	 */
	protected TypeObjectifActiviteType associeCommeTypeObjectifActiviteType;

	/**
	 * The cached value of the '{@link #getACommeProtectionPersonnelProtectionPersonnel() <em>AComme Protection Personnel Protection Personnel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeProtectionPersonnelProtectionPersonnel()
	 * @generated
	 * @ordered
	 */
	protected TypeProtectionPersonnel aCommeProtectionPersonnelProtectionPersonnel;

	/**
	 * The cached value of the '{@link #getAPourMobiliteMobilite() <em>APour Mobilite Mobilite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourMobiliteMobilite()
	 * @generated
	 * @ordered
	 */
	protected TypeMobilite aPourMobiliteMobilite;

	/**
	 * The cached value of the '{@link #getEstLocaliseParAssociationObjectifCiblageLocalisation() <em>Est Localise Par Association Objectif Ciblage Localisation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstLocaliseParAssociationObjectifCiblageLocalisation()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociationObjectifCiblageLocalisation> estLocaliseParAssociationObjectifCiblageLocalisation;

	/**
	 * The cached value of the '{@link #getAPourCaracteristiquesObjectifMajeurObjectifMajeur() <em>APour Caracteristiques Objectif Majeur Objectif Majeur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCaracteristiquesObjectifMajeurObjectifMajeur()
	 * @generated
	 * @ordered
	 */
	protected TypeObjectifMajeur aPourCaracteristiquesObjectifMajeurObjectifMajeur;

	/**
	 * The cached value of the '{@link #getAPourCaracteristiquesASSObjectifASS() <em>APour Caracteristiques ASS Objectif ASS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCaracteristiquesASSObjectifASS()
	 * @generated
	 * @ordered
	 */
	protected TypeObjectifASS aPourCaracteristiquesASSObjectifASS;

	/**
	 * The cached value of the '{@link #getAPourCaracteristiqueAlatObjectifAlat() <em>APour Caracteristique Alat Objectif Alat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCaracteristiqueAlatObjectifAlat()
	 * @generated
	 * @ordered
	 */
	protected TypeObjectifAlat aPourCaracteristiqueAlatObjectifAlat;

	/**
	 * The cached value of the '{@link #getAPourCreateurUnite() <em>APour Createur Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCreateurUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourCreateurUnite;

	/**
	 * The cached value of the '{@link #getAPourUniteFeuxAEngagerReservationUnite() <em>APour Unite Feux AEngager Reservation Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUniteFeuxAEngagerReservationUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourUniteFeuxAEngagerReservationUnite;

	/**
	 * The cached value of the '{@link #getAPourDocumentAssocieAssociationObjectifCiblageDocument() <em>APour Document Associe Association Objectif Ciblage Document</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourDocumentAssocieAssociationObjectifCiblageDocument()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourDocumentAssocieAssociationObjectifCiblageDocument;

	/**
	 * The cached value of the '{@link #getACommeAutorisationAutorisationObjectifCiblage() <em>AComme Autorisation Autorisation Objectif Ciblage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeAutorisationAutorisationObjectifCiblage()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAutorisationObjectifCiblage> aCommeAutorisationAutorisationObjectifCiblage;

	/**
	 * The cached value of the '{@link #getEstIdentifieParMarquageObjectif() <em>Est Identifie Par Marquage Objectif</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstIdentifieParMarquageObjectif()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeMarquageObjectif> estIdentifieParMarquageObjectif;

	/**
	 * The cached value of the '{@link #getCorrespondAObjectifActivite() <em>Correspond AObjectif Activite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrespondAObjectifActivite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> correspondAObjectifActivite;

	/**
	 * The cached value of the '{@link #getACommeListeObjectifsListeObjectifs() <em>AComme Liste Objectifs Liste Objectifs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeListeObjectifsListeObjectifs()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aCommeListeObjectifsListeObjectifs;

	/**
	 * The cached value of the '{@link #getContraintAssociationObjectifCiblageObjectifCiblage() <em>Contraint Association Objectif Ciblage Objectif Ciblage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContraintAssociationObjectifCiblageObjectifCiblage()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> contraintAssociationObjectifCiblageObjectifCiblage;

	/**
	 * The cached value of the '{@link #getDependAssociationObjectifCiblageObjectifCiblage() <em>Depend Association Objectif Ciblage Objectif Ciblage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependAssociationObjectifCiblageObjectifCiblage()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> dependAssociationObjectifCiblageObjectifCiblage;

	/**
	 * The cached value of the '{@link #getAssocieCommeInstanceObjetInstanceObjet() <em>Associe Comme Instance Objet Instance Objet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeInstanceObjetInstanceObjet()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeInstanceObjetInstanceObjet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeObjectifCiblageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeObjectifCiblage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoObjectifCiblageNormeIdentification getNormeIdentification() {
		return normeIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormeIdentification(TypeDictionaryDicoObjectifCiblageNormeIdentification newNormeIdentification) {
		TypeDictionaryDicoObjectifCiblageNormeIdentification oldNormeIdentification = normeIdentification;
		normeIdentification = newNormeIdentification == null ? NORME_IDENTIFICATION_EDEFAULT : newNormeIdentification;
		boolean oldNormeIdentificationESet = normeIdentificationESet;
		normeIdentificationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_CIBLAGE__NORME_IDENTIFICATION, oldNormeIdentification, normeIdentification, !oldNormeIdentificationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNormeIdentification() {
		TypeDictionaryDicoObjectifCiblageNormeIdentification oldNormeIdentification = normeIdentification;
		boolean oldNormeIdentificationESet = normeIdentificationESet;
		normeIdentification = NORME_IDENTIFICATION_EDEFAULT;
		normeIdentificationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_OBJECTIF_CIBLAGE__NORME_IDENTIFICATION, oldNormeIdentification, NORME_IDENTIFICATION_EDEFAULT, oldNormeIdentificationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNormeIdentification() {
		return normeIdentificationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentification() {
		return identification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentification(String newIdentification) {
		String oldIdentification = identification;
		identification = newIdentification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_CIBLAGE__IDENTIFICATION, oldIdentification, identification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getPriorite() {
		return priorite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriorite(long newPriorite) {
		long oldPriorite = priorite;
		priorite = newPriorite;
		boolean oldPrioriteESet = prioriteESet;
		prioriteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_CIBLAGE__PRIORITE, oldPriorite, priorite, !oldPrioriteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPriorite() {
		long oldPriorite = priorite;
		boolean oldPrioriteESet = prioriteESet;
		priorite = PRIORITE_EDEFAULT;
		prioriteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_OBJECTIF_CIBLAGE__PRIORITE, oldPriorite, PRIORITE_EDEFAULT, oldPrioriteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPriorite() {
		return prioriteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoObjectifCiblageType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeDictionaryDicoObjectifCiblageType newType) {
		TypeDictionaryDicoObjectifCiblageType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_CIBLAGE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeDictionaryDicoObjectifCiblageType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_OBJECTIF_CIBLAGE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoObjectifCiblageAutoriteEngagement getAutoriteEngagement() {
		return autoriteEngagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoriteEngagement(TypeDictionaryDicoObjectifCiblageAutoriteEngagement newAutoriteEngagement) {
		TypeDictionaryDicoObjectifCiblageAutoriteEngagement oldAutoriteEngagement = autoriteEngagement;
		autoriteEngagement = newAutoriteEngagement == null ? AUTORITE_ENGAGEMENT_EDEFAULT : newAutoriteEngagement;
		boolean oldAutoriteEngagementESet = autoriteEngagementESet;
		autoriteEngagementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_CIBLAGE__AUTORITE_ENGAGEMENT, oldAutoriteEngagement, autoriteEngagement, !oldAutoriteEngagementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAutoriteEngagement() {
		TypeDictionaryDicoObjectifCiblageAutoriteEngagement oldAutoriteEngagement = autoriteEngagement;
		boolean oldAutoriteEngagementESet = autoriteEngagementESet;
		autoriteEngagement = AUTORITE_ENGAGEMENT_EDEFAULT;
		autoriteEngagementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_OBJECTIF_CIBLAGE__AUTORITE_ENGAGEMENT, oldAutoriteEngagement, AUTORITE_ENGAGEMENT_EDEFAULT, oldAutoriteEngagementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAutoriteEngagement() {
		return autoriteEngagementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoObjectifCiblageEffetRecherche getEffetRecherche() {
		return effetRecherche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffetRecherche(TypeDictionaryDicoObjectifCiblageEffetRecherche newEffetRecherche) {
		TypeDictionaryDicoObjectifCiblageEffetRecherche oldEffetRecherche = effetRecherche;
		effetRecherche = newEffetRecherche == null ? EFFET_RECHERCHE_EDEFAULT : newEffetRecherche;
		boolean oldEffetRechercheESet = effetRechercheESet;
		effetRechercheESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_CIBLAGE__EFFET_RECHERCHE, oldEffetRecherche, effetRecherche, !oldEffetRechercheESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEffetRecherche() {
		TypeDictionaryDicoObjectifCiblageEffetRecherche oldEffetRecherche = effetRecherche;
		boolean oldEffetRechercheESet = effetRechercheESet;
		effetRecherche = EFFET_RECHERCHE_EDEFAULT;
		effetRechercheESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_OBJECTIF_CIBLAGE__EFFET_RECHERCHE, oldEffetRecherche, EFFET_RECHERCHE_EDEFAULT, oldEffetRechercheESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEffetRecherche() {
		return effetRechercheESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNature() {
		return nature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNature(String newNature) {
		String oldNature = nature;
		nature = newNature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_CIBLAGE__NATURE, oldNature, nature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEchelonTactiqueObjectif getEchelonTactique() {
		return echelonTactique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEchelonTactique(TypeDictionaryDicoEchelonTactiqueObjectif newEchelonTactique) {
		TypeDictionaryDicoEchelonTactiqueObjectif oldEchelonTactique = echelonTactique;
		echelonTactique = newEchelonTactique == null ? ECHELON_TACTIQUE_EDEFAULT : newEchelonTactique;
		boolean oldEchelonTactiqueESet = echelonTactiqueESet;
		echelonTactiqueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_CIBLAGE__ECHELON_TACTIQUE, oldEchelonTactique, echelonTactique, !oldEchelonTactiqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEchelonTactique() {
		TypeDictionaryDicoEchelonTactiqueObjectif oldEchelonTactique = echelonTactique;
		boolean oldEchelonTactiqueESet = echelonTactiqueESet;
		echelonTactique = ECHELON_TACTIQUE_EDEFAULT;
		echelonTactiqueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_OBJECTIF_CIBLAGE__ECHELON_TACTIQUE, oldEchelonTactique, ECHELON_TACTIQUE_EDEFAULT, oldEchelonTactiqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEchelonTactique() {
		return echelonTactiqueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVolume() {
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolume(String newVolume) {
		String oldVolume = volume;
		volume = newVolume;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_CIBLAGE__VOLUME, oldVolume, volume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getDureeDisponibilite() {
		return dureeDisponibilite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDureeDisponibilite(TypeDataTypeDuree newDureeDisponibilite, NotificationChain msgs) {
		TypeDataTypeDuree oldDureeDisponibilite = dureeDisponibilite;
		dureeDisponibilite = newDureeDisponibilite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_CIBLAGE__DUREE_DISPONIBILITE, oldDureeDisponibilite, newDureeDisponibilite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDureeDisponibilite(TypeDataTypeDuree newDureeDisponibilite) {
		if (newDureeDisponibilite != dureeDisponibilite) {
			NotificationChain msgs = null;
			if (dureeDisponibilite != null)
				msgs = ((InternalEObject)dureeDisponibilite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBJECTIF_CIBLAGE__DUREE_DISPONIBILITE, null, msgs);
			if (newDureeDisponibilite != null)
				msgs = ((InternalEObject)newDureeDisponibilite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBJECTIF_CIBLAGE__DUREE_DISPONIBILITE, null, msgs);
			msgs = basicSetDureeDisponibilite(newDureeDisponibilite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_CIBLAGE__DUREE_DISPONIBILITE, newDureeDisponibilite, newDureeDisponibilite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDommagesCollateraux() {
		return dommagesCollateraux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDommagesCollateraux(String newDommagesCollateraux) {
		String oldDommagesCollateraux = dommagesCollateraux;
		dommagesCollateraux = newDommagesCollateraux;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_CIBLAGE__DOMMAGES_COLLATERAUX, oldDommagesCollateraux, dommagesCollateraux));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommentaire() {
		return commentaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentaire(String newCommentaire) {
		String oldCommentaire = commentaire;
		commentaire = newCommentaire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_CIBLAGE__COMMENTAIRE, oldCommentaire, commentaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCTE() {
		return cTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCTE(String newCTE) {
		String oldCTE = cTE;
		cTE = newCTE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_CIBLAGE__CTE, oldCTE, cTE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCE() {
		return cE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCE(String newCE) {
		String oldCE = cE;
		cE = newCE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_CIBLAGE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeObjectifActiviteType getAssocieCommeTypeObjectifActiviteType() {
		return associeCommeTypeObjectifActiviteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeTypeObjectifActiviteType(TypeObjectifActiviteType newAssocieCommeTypeObjectifActiviteType, NotificationChain msgs) {
		TypeObjectifActiviteType oldAssocieCommeTypeObjectifActiviteType = associeCommeTypeObjectifActiviteType;
		associeCommeTypeObjectifActiviteType = newAssocieCommeTypeObjectifActiviteType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_CIBLAGE__ASSOCIE_COMME_TYPE_OBJECTIF_ACTIVITE_TYPE, oldAssocieCommeTypeObjectifActiviteType, newAssocieCommeTypeObjectifActiviteType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeTypeObjectifActiviteType(TypeObjectifActiviteType newAssocieCommeTypeObjectifActiviteType) {
		if (newAssocieCommeTypeObjectifActiviteType != associeCommeTypeObjectifActiviteType) {
			NotificationChain msgs = null;
			if (associeCommeTypeObjectifActiviteType != null)
				msgs = ((InternalEObject)associeCommeTypeObjectifActiviteType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBJECTIF_CIBLAGE__ASSOCIE_COMME_TYPE_OBJECTIF_ACTIVITE_TYPE, null, msgs);
			if (newAssocieCommeTypeObjectifActiviteType != null)
				msgs = ((InternalEObject)newAssocieCommeTypeObjectifActiviteType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBJECTIF_CIBLAGE__ASSOCIE_COMME_TYPE_OBJECTIF_ACTIVITE_TYPE, null, msgs);
			msgs = basicSetAssocieCommeTypeObjectifActiviteType(newAssocieCommeTypeObjectifActiviteType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_CIBLAGE__ASSOCIE_COMME_TYPE_OBJECTIF_ACTIVITE_TYPE, newAssocieCommeTypeObjectifActiviteType, newAssocieCommeTypeObjectifActiviteType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeProtectionPersonnel getACommeProtectionPersonnelProtectionPersonnel() {
		return aCommeProtectionPersonnelProtectionPersonnel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeProtectionPersonnelProtectionPersonnel(TypeProtectionPersonnel newACommeProtectionPersonnelProtectionPersonnel, NotificationChain msgs) {
		TypeProtectionPersonnel oldACommeProtectionPersonnelProtectionPersonnel = aCommeProtectionPersonnelProtectionPersonnel;
		aCommeProtectionPersonnelProtectionPersonnel = newACommeProtectionPersonnelProtectionPersonnel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_CIBLAGE__ACOMME_PROTECTION_PERSONNEL_PROTECTION_PERSONNEL, oldACommeProtectionPersonnelProtectionPersonnel, newACommeProtectionPersonnelProtectionPersonnel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeProtectionPersonnelProtectionPersonnel(TypeProtectionPersonnel newACommeProtectionPersonnelProtectionPersonnel) {
		if (newACommeProtectionPersonnelProtectionPersonnel != aCommeProtectionPersonnelProtectionPersonnel) {
			NotificationChain msgs = null;
			if (aCommeProtectionPersonnelProtectionPersonnel != null)
				msgs = ((InternalEObject)aCommeProtectionPersonnelProtectionPersonnel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBJECTIF_CIBLAGE__ACOMME_PROTECTION_PERSONNEL_PROTECTION_PERSONNEL, null, msgs);
			if (newACommeProtectionPersonnelProtectionPersonnel != null)
				msgs = ((InternalEObject)newACommeProtectionPersonnelProtectionPersonnel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBJECTIF_CIBLAGE__ACOMME_PROTECTION_PERSONNEL_PROTECTION_PERSONNEL, null, msgs);
			msgs = basicSetACommeProtectionPersonnelProtectionPersonnel(newACommeProtectionPersonnelProtectionPersonnel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_CIBLAGE__ACOMME_PROTECTION_PERSONNEL_PROTECTION_PERSONNEL, newACommeProtectionPersonnelProtectionPersonnel, newACommeProtectionPersonnelProtectionPersonnel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeMobilite getAPourMobiliteMobilite() {
		return aPourMobiliteMobilite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourMobiliteMobilite(TypeMobilite newAPourMobiliteMobilite, NotificationChain msgs) {
		TypeMobilite oldAPourMobiliteMobilite = aPourMobiliteMobilite;
		aPourMobiliteMobilite = newAPourMobiliteMobilite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_MOBILITE_MOBILITE, oldAPourMobiliteMobilite, newAPourMobiliteMobilite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourMobiliteMobilite(TypeMobilite newAPourMobiliteMobilite) {
		if (newAPourMobiliteMobilite != aPourMobiliteMobilite) {
			NotificationChain msgs = null;
			if (aPourMobiliteMobilite != null)
				msgs = ((InternalEObject)aPourMobiliteMobilite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_MOBILITE_MOBILITE, null, msgs);
			if (newAPourMobiliteMobilite != null)
				msgs = ((InternalEObject)newAPourMobiliteMobilite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_MOBILITE_MOBILITE, null, msgs);
			msgs = basicSetAPourMobiliteMobilite(newAPourMobiliteMobilite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_MOBILITE_MOBILITE, newAPourMobiliteMobilite, newAPourMobiliteMobilite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationObjectifCiblageLocalisation> getEstLocaliseParAssociationObjectifCiblageLocalisation() {
		if (estLocaliseParAssociationObjectifCiblageLocalisation == null) {
			estLocaliseParAssociationObjectifCiblageLocalisation = new EObjectContainmentEList<TypeAssociationObjectifCiblageLocalisation>(TypeAssociationObjectifCiblageLocalisation.class, this, SchemaPackage.TYPE_OBJECTIF_CIBLAGE__EST_LOCALISE_PAR_ASSOCIATION_OBJECTIF_CIBLAGE_LOCALISATION);
		}
		return estLocaliseParAssociationObjectifCiblageLocalisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeObjectifMajeur getAPourCaracteristiquesObjectifMajeurObjectifMajeur() {
		return aPourCaracteristiquesObjectifMajeurObjectifMajeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourCaracteristiquesObjectifMajeurObjectifMajeur(TypeObjectifMajeur newAPourCaracteristiquesObjectifMajeurObjectifMajeur, NotificationChain msgs) {
		TypeObjectifMajeur oldAPourCaracteristiquesObjectifMajeurObjectifMajeur = aPourCaracteristiquesObjectifMajeurObjectifMajeur;
		aPourCaracteristiquesObjectifMajeurObjectifMajeur = newAPourCaracteristiquesObjectifMajeurObjectifMajeur;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_CARACTERISTIQUES_OBJECTIF_MAJEUR_OBJECTIF_MAJEUR, oldAPourCaracteristiquesObjectifMajeurObjectifMajeur, newAPourCaracteristiquesObjectifMajeurObjectifMajeur);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourCaracteristiquesObjectifMajeurObjectifMajeur(TypeObjectifMajeur newAPourCaracteristiquesObjectifMajeurObjectifMajeur) {
		if (newAPourCaracteristiquesObjectifMajeurObjectifMajeur != aPourCaracteristiquesObjectifMajeurObjectifMajeur) {
			NotificationChain msgs = null;
			if (aPourCaracteristiquesObjectifMajeurObjectifMajeur != null)
				msgs = ((InternalEObject)aPourCaracteristiquesObjectifMajeurObjectifMajeur).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_CARACTERISTIQUES_OBJECTIF_MAJEUR_OBJECTIF_MAJEUR, null, msgs);
			if (newAPourCaracteristiquesObjectifMajeurObjectifMajeur != null)
				msgs = ((InternalEObject)newAPourCaracteristiquesObjectifMajeurObjectifMajeur).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_CARACTERISTIQUES_OBJECTIF_MAJEUR_OBJECTIF_MAJEUR, null, msgs);
			msgs = basicSetAPourCaracteristiquesObjectifMajeurObjectifMajeur(newAPourCaracteristiquesObjectifMajeurObjectifMajeur, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_CARACTERISTIQUES_OBJECTIF_MAJEUR_OBJECTIF_MAJEUR, newAPourCaracteristiquesObjectifMajeurObjectifMajeur, newAPourCaracteristiquesObjectifMajeurObjectifMajeur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeObjectifASS getAPourCaracteristiquesASSObjectifASS() {
		return aPourCaracteristiquesASSObjectifASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourCaracteristiquesASSObjectifASS(TypeObjectifASS newAPourCaracteristiquesASSObjectifASS, NotificationChain msgs) {
		TypeObjectifASS oldAPourCaracteristiquesASSObjectifASS = aPourCaracteristiquesASSObjectifASS;
		aPourCaracteristiquesASSObjectifASS = newAPourCaracteristiquesASSObjectifASS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_CARACTERISTIQUES_ASS_OBJECTIF_ASS, oldAPourCaracteristiquesASSObjectifASS, newAPourCaracteristiquesASSObjectifASS);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourCaracteristiquesASSObjectifASS(TypeObjectifASS newAPourCaracteristiquesASSObjectifASS) {
		if (newAPourCaracteristiquesASSObjectifASS != aPourCaracteristiquesASSObjectifASS) {
			NotificationChain msgs = null;
			if (aPourCaracteristiquesASSObjectifASS != null)
				msgs = ((InternalEObject)aPourCaracteristiquesASSObjectifASS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_CARACTERISTIQUES_ASS_OBJECTIF_ASS, null, msgs);
			if (newAPourCaracteristiquesASSObjectifASS != null)
				msgs = ((InternalEObject)newAPourCaracteristiquesASSObjectifASS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_CARACTERISTIQUES_ASS_OBJECTIF_ASS, null, msgs);
			msgs = basicSetAPourCaracteristiquesASSObjectifASS(newAPourCaracteristiquesASSObjectifASS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_CARACTERISTIQUES_ASS_OBJECTIF_ASS, newAPourCaracteristiquesASSObjectifASS, newAPourCaracteristiquesASSObjectifASS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeObjectifAlat getAPourCaracteristiqueAlatObjectifAlat() {
		return aPourCaracteristiqueAlatObjectifAlat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourCaracteristiqueAlatObjectifAlat(TypeObjectifAlat newAPourCaracteristiqueAlatObjectifAlat, NotificationChain msgs) {
		TypeObjectifAlat oldAPourCaracteristiqueAlatObjectifAlat = aPourCaracteristiqueAlatObjectifAlat;
		aPourCaracteristiqueAlatObjectifAlat = newAPourCaracteristiqueAlatObjectifAlat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_CARACTERISTIQUE_ALAT_OBJECTIF_ALAT, oldAPourCaracteristiqueAlatObjectifAlat, newAPourCaracteristiqueAlatObjectifAlat);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourCaracteristiqueAlatObjectifAlat(TypeObjectifAlat newAPourCaracteristiqueAlatObjectifAlat) {
		if (newAPourCaracteristiqueAlatObjectifAlat != aPourCaracteristiqueAlatObjectifAlat) {
			NotificationChain msgs = null;
			if (aPourCaracteristiqueAlatObjectifAlat != null)
				msgs = ((InternalEObject)aPourCaracteristiqueAlatObjectifAlat).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_CARACTERISTIQUE_ALAT_OBJECTIF_ALAT, null, msgs);
			if (newAPourCaracteristiqueAlatObjectifAlat != null)
				msgs = ((InternalEObject)newAPourCaracteristiqueAlatObjectifAlat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_CARACTERISTIQUE_ALAT_OBJECTIF_ALAT, null, msgs);
			msgs = basicSetAPourCaracteristiqueAlatObjectifAlat(newAPourCaracteristiqueAlatObjectifAlat, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_CARACTERISTIQUE_ALAT_OBJECTIF_ALAT, newAPourCaracteristiqueAlatObjectifAlat, newAPourCaracteristiqueAlatObjectifAlat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourCreateurUnite() {
		return aPourCreateurUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourCreateurUnite(TypeAssociationEXT newAPourCreateurUnite, NotificationChain msgs) {
		TypeAssociationEXT oldAPourCreateurUnite = aPourCreateurUnite;
		aPourCreateurUnite = newAPourCreateurUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_CREATEUR_UNITE, oldAPourCreateurUnite, newAPourCreateurUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourCreateurUnite(TypeAssociationEXT newAPourCreateurUnite) {
		if (newAPourCreateurUnite != aPourCreateurUnite) {
			NotificationChain msgs = null;
			if (aPourCreateurUnite != null)
				msgs = ((InternalEObject)aPourCreateurUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_CREATEUR_UNITE, null, msgs);
			if (newAPourCreateurUnite != null)
				msgs = ((InternalEObject)newAPourCreateurUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_CREATEUR_UNITE, null, msgs);
			msgs = basicSetAPourCreateurUnite(newAPourCreateurUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_CREATEUR_UNITE, newAPourCreateurUnite, newAPourCreateurUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourUniteFeuxAEngagerReservationUnite() {
		if (aPourUniteFeuxAEngagerReservationUnite == null) {
			aPourUniteFeuxAEngagerReservationUnite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_UNITE_FEUX_AENGAGER_RESERVATION_UNITE);
		}
		return aPourUniteFeuxAEngagerReservationUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourDocumentAssocieAssociationObjectifCiblageDocument() {
		if (aPourDocumentAssocieAssociationObjectifCiblageDocument == null) {
			aPourDocumentAssocieAssociationObjectifCiblageDocument = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_DOCUMENT_ASSOCIE_ASSOCIATION_OBJECTIF_CIBLAGE_DOCUMENT);
		}
		return aPourDocumentAssocieAssociationObjectifCiblageDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAutorisationObjectifCiblage> getACommeAutorisationAutorisationObjectifCiblage() {
		if (aCommeAutorisationAutorisationObjectifCiblage == null) {
			aCommeAutorisationAutorisationObjectifCiblage = new EObjectContainmentEList<TypeAutorisationObjectifCiblage>(TypeAutorisationObjectifCiblage.class, this, SchemaPackage.TYPE_OBJECTIF_CIBLAGE__ACOMME_AUTORISATION_AUTORISATION_OBJECTIF_CIBLAGE);
		}
		return aCommeAutorisationAutorisationObjectifCiblage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMarquageObjectif> getEstIdentifieParMarquageObjectif() {
		if (estIdentifieParMarquageObjectif == null) {
			estIdentifieParMarquageObjectif = new EObjectContainmentEList<TypeMarquageObjectif>(TypeMarquageObjectif.class, this, SchemaPackage.TYPE_OBJECTIF_CIBLAGE__EST_IDENTIFIE_PAR_MARQUAGE_OBJECTIF);
		}
		return estIdentifieParMarquageObjectif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getCorrespondAObjectifActivite() {
		if (correspondAObjectifActivite == null) {
			correspondAObjectifActivite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_OBJECTIF_CIBLAGE__CORRESPOND_AOBJECTIF_ACTIVITE);
		}
		return correspondAObjectifActivite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getACommeListeObjectifsListeObjectifs() {
		if (aCommeListeObjectifsListeObjectifs == null) {
			aCommeListeObjectifsListeObjectifs = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_OBJECTIF_CIBLAGE__ACOMME_LISTE_OBJECTIFS_LISTE_OBJECTIFS);
		}
		return aCommeListeObjectifsListeObjectifs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getContraintAssociationObjectifCiblageObjectifCiblage() {
		if (contraintAssociationObjectifCiblageObjectifCiblage == null) {
			contraintAssociationObjectifCiblageObjectifCiblage = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_OBJECTIF_CIBLAGE__CONTRAINT_ASSOCIATION_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE);
		}
		return contraintAssociationObjectifCiblageObjectifCiblage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getDependAssociationObjectifCiblageObjectifCiblage() {
		if (dependAssociationObjectifCiblageObjectifCiblage == null) {
			dependAssociationObjectifCiblageObjectifCiblage = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_OBJECTIF_CIBLAGE__DEPEND_ASSOCIATION_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE);
		}
		return dependAssociationObjectifCiblageObjectifCiblage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeInstanceObjetInstanceObjet() {
		return associeCommeInstanceObjetInstanceObjet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeInstanceObjetInstanceObjet(TypeAssociation newAssocieCommeInstanceObjetInstanceObjet, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeInstanceObjetInstanceObjet = associeCommeInstanceObjetInstanceObjet;
		associeCommeInstanceObjetInstanceObjet = newAssocieCommeInstanceObjetInstanceObjet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_CIBLAGE__ASSOCIE_COMME_INSTANCE_OBJET_INSTANCE_OBJET, oldAssocieCommeInstanceObjetInstanceObjet, newAssocieCommeInstanceObjetInstanceObjet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeInstanceObjetInstanceObjet(TypeAssociation newAssocieCommeInstanceObjetInstanceObjet) {
		if (newAssocieCommeInstanceObjetInstanceObjet != associeCommeInstanceObjetInstanceObjet) {
			NotificationChain msgs = null;
			if (associeCommeInstanceObjetInstanceObjet != null)
				msgs = ((InternalEObject)associeCommeInstanceObjetInstanceObjet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBJECTIF_CIBLAGE__ASSOCIE_COMME_INSTANCE_OBJET_INSTANCE_OBJET, null, msgs);
			if (newAssocieCommeInstanceObjetInstanceObjet != null)
				msgs = ((InternalEObject)newAssocieCommeInstanceObjetInstanceObjet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBJECTIF_CIBLAGE__ASSOCIE_COMME_INSTANCE_OBJET_INSTANCE_OBJET, null, msgs);
			msgs = basicSetAssocieCommeInstanceObjetInstanceObjet(newAssocieCommeInstanceObjetInstanceObjet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_CIBLAGE__ASSOCIE_COMME_INSTANCE_OBJET_INSTANCE_OBJET, newAssocieCommeInstanceObjetInstanceObjet, newAssocieCommeInstanceObjetInstanceObjet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__DUREE_DISPONIBILITE:
				return basicSetDureeDisponibilite(null, msgs);
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__ASSOCIE_COMME_TYPE_OBJECTIF_ACTIVITE_TYPE:
				return basicSetAssocieCommeTypeObjectifActiviteType(null, msgs);
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__ACOMME_PROTECTION_PERSONNEL_PROTECTION_PERSONNEL:
				return basicSetACommeProtectionPersonnelProtectionPersonnel(null, msgs);
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_MOBILITE_MOBILITE:
				return basicSetAPourMobiliteMobilite(null, msgs);
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__EST_LOCALISE_PAR_ASSOCIATION_OBJECTIF_CIBLAGE_LOCALISATION:
				return ((InternalEList<?>)getEstLocaliseParAssociationObjectifCiblageLocalisation()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_CARACTERISTIQUES_OBJECTIF_MAJEUR_OBJECTIF_MAJEUR:
				return basicSetAPourCaracteristiquesObjectifMajeurObjectifMajeur(null, msgs);
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_CARACTERISTIQUES_ASS_OBJECTIF_ASS:
				return basicSetAPourCaracteristiquesASSObjectifASS(null, msgs);
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_CARACTERISTIQUE_ALAT_OBJECTIF_ALAT:
				return basicSetAPourCaracteristiqueAlatObjectifAlat(null, msgs);
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_CREATEUR_UNITE:
				return basicSetAPourCreateurUnite(null, msgs);
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_UNITE_FEUX_AENGAGER_RESERVATION_UNITE:
				return ((InternalEList<?>)getAPourUniteFeuxAEngagerReservationUnite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_DOCUMENT_ASSOCIE_ASSOCIATION_OBJECTIF_CIBLAGE_DOCUMENT:
				return ((InternalEList<?>)getAPourDocumentAssocieAssociationObjectifCiblageDocument()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__ACOMME_AUTORISATION_AUTORISATION_OBJECTIF_CIBLAGE:
				return ((InternalEList<?>)getACommeAutorisationAutorisationObjectifCiblage()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__EST_IDENTIFIE_PAR_MARQUAGE_OBJECTIF:
				return ((InternalEList<?>)getEstIdentifieParMarquageObjectif()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__CORRESPOND_AOBJECTIF_ACTIVITE:
				return ((InternalEList<?>)getCorrespondAObjectifActivite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__ACOMME_LISTE_OBJECTIFS_LISTE_OBJECTIFS:
				return ((InternalEList<?>)getACommeListeObjectifsListeObjectifs()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__CONTRAINT_ASSOCIATION_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE:
				return ((InternalEList<?>)getContraintAssociationObjectifCiblageObjectifCiblage()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__DEPEND_ASSOCIATION_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE:
				return ((InternalEList<?>)getDependAssociationObjectifCiblageObjectifCiblage()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__ASSOCIE_COMME_INSTANCE_OBJET_INSTANCE_OBJET:
				return basicSetAssocieCommeInstanceObjetInstanceObjet(null, msgs);
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
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__NORME_IDENTIFICATION:
				return getNormeIdentification();
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__IDENTIFICATION:
				return getIdentification();
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__PRIORITE:
				return new Long(getPriorite());
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__TYPE:
				return getType();
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__AUTORITE_ENGAGEMENT:
				return getAutoriteEngagement();
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__EFFET_RECHERCHE:
				return getEffetRecherche();
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__NATURE:
				return getNature();
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__ECHELON_TACTIQUE:
				return getEchelonTactique();
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__VOLUME:
				return getVolume();
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__DUREE_DISPONIBILITE:
				return getDureeDisponibilite();
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__DOMMAGES_COLLATERAUX:
				return getDommagesCollateraux();
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__COMMENTAIRE:
				return getCommentaire();
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__CE:
				return getCE();
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__ASSOCIE_COMME_TYPE_OBJECTIF_ACTIVITE_TYPE:
				return getAssocieCommeTypeObjectifActiviteType();
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__ACOMME_PROTECTION_PERSONNEL_PROTECTION_PERSONNEL:
				return getACommeProtectionPersonnelProtectionPersonnel();
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_MOBILITE_MOBILITE:
				return getAPourMobiliteMobilite();
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__EST_LOCALISE_PAR_ASSOCIATION_OBJECTIF_CIBLAGE_LOCALISATION:
				return getEstLocaliseParAssociationObjectifCiblageLocalisation();
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_CARACTERISTIQUES_OBJECTIF_MAJEUR_OBJECTIF_MAJEUR:
				return getAPourCaracteristiquesObjectifMajeurObjectifMajeur();
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_CARACTERISTIQUES_ASS_OBJECTIF_ASS:
				return getAPourCaracteristiquesASSObjectifASS();
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_CARACTERISTIQUE_ALAT_OBJECTIF_ALAT:
				return getAPourCaracteristiqueAlatObjectifAlat();
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_CREATEUR_UNITE:
				return getAPourCreateurUnite();
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_UNITE_FEUX_AENGAGER_RESERVATION_UNITE:
				return getAPourUniteFeuxAEngagerReservationUnite();
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_DOCUMENT_ASSOCIE_ASSOCIATION_OBJECTIF_CIBLAGE_DOCUMENT:
				return getAPourDocumentAssocieAssociationObjectifCiblageDocument();
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__ACOMME_AUTORISATION_AUTORISATION_OBJECTIF_CIBLAGE:
				return getACommeAutorisationAutorisationObjectifCiblage();
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__EST_IDENTIFIE_PAR_MARQUAGE_OBJECTIF:
				return getEstIdentifieParMarquageObjectif();
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__CORRESPOND_AOBJECTIF_ACTIVITE:
				return getCorrespondAObjectifActivite();
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__ACOMME_LISTE_OBJECTIFS_LISTE_OBJECTIFS:
				return getACommeListeObjectifsListeObjectifs();
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__CONTRAINT_ASSOCIATION_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE:
				return getContraintAssociationObjectifCiblageObjectifCiblage();
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__DEPEND_ASSOCIATION_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE:
				return getDependAssociationObjectifCiblageObjectifCiblage();
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__ASSOCIE_COMME_INSTANCE_OBJET_INSTANCE_OBJET:
				return getAssocieCommeInstanceObjetInstanceObjet();
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
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__NORME_IDENTIFICATION:
				setNormeIdentification((TypeDictionaryDicoObjectifCiblageNormeIdentification)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__IDENTIFICATION:
				setIdentification((String)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__PRIORITE:
				setPriorite(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__TYPE:
				setType((TypeDictionaryDicoObjectifCiblageType)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__AUTORITE_ENGAGEMENT:
				setAutoriteEngagement((TypeDictionaryDicoObjectifCiblageAutoriteEngagement)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__EFFET_RECHERCHE:
				setEffetRecherche((TypeDictionaryDicoObjectifCiblageEffetRecherche)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__NATURE:
				setNature((String)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__ECHELON_TACTIQUE:
				setEchelonTactique((TypeDictionaryDicoEchelonTactiqueObjectif)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__VOLUME:
				setVolume((String)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__DUREE_DISPONIBILITE:
				setDureeDisponibilite((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__DOMMAGES_COLLATERAUX:
				setDommagesCollateraux((String)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__COMMENTAIRE:
				setCommentaire((String)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__ASSOCIE_COMME_TYPE_OBJECTIF_ACTIVITE_TYPE:
				setAssocieCommeTypeObjectifActiviteType((TypeObjectifActiviteType)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__ACOMME_PROTECTION_PERSONNEL_PROTECTION_PERSONNEL:
				setACommeProtectionPersonnelProtectionPersonnel((TypeProtectionPersonnel)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_MOBILITE_MOBILITE:
				setAPourMobiliteMobilite((TypeMobilite)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__EST_LOCALISE_PAR_ASSOCIATION_OBJECTIF_CIBLAGE_LOCALISATION:
				getEstLocaliseParAssociationObjectifCiblageLocalisation().clear();
				getEstLocaliseParAssociationObjectifCiblageLocalisation().addAll((Collection<? extends TypeAssociationObjectifCiblageLocalisation>)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_CARACTERISTIQUES_OBJECTIF_MAJEUR_OBJECTIF_MAJEUR:
				setAPourCaracteristiquesObjectifMajeurObjectifMajeur((TypeObjectifMajeur)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_CARACTERISTIQUES_ASS_OBJECTIF_ASS:
				setAPourCaracteristiquesASSObjectifASS((TypeObjectifASS)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_CARACTERISTIQUE_ALAT_OBJECTIF_ALAT:
				setAPourCaracteristiqueAlatObjectifAlat((TypeObjectifAlat)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_CREATEUR_UNITE:
				setAPourCreateurUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_UNITE_FEUX_AENGAGER_RESERVATION_UNITE:
				getAPourUniteFeuxAEngagerReservationUnite().clear();
				getAPourUniteFeuxAEngagerReservationUnite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_DOCUMENT_ASSOCIE_ASSOCIATION_OBJECTIF_CIBLAGE_DOCUMENT:
				getAPourDocumentAssocieAssociationObjectifCiblageDocument().clear();
				getAPourDocumentAssocieAssociationObjectifCiblageDocument().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__ACOMME_AUTORISATION_AUTORISATION_OBJECTIF_CIBLAGE:
				getACommeAutorisationAutorisationObjectifCiblage().clear();
				getACommeAutorisationAutorisationObjectifCiblage().addAll((Collection<? extends TypeAutorisationObjectifCiblage>)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__EST_IDENTIFIE_PAR_MARQUAGE_OBJECTIF:
				getEstIdentifieParMarquageObjectif().clear();
				getEstIdentifieParMarquageObjectif().addAll((Collection<? extends TypeMarquageObjectif>)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__CORRESPOND_AOBJECTIF_ACTIVITE:
				getCorrespondAObjectifActivite().clear();
				getCorrespondAObjectifActivite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__ACOMME_LISTE_OBJECTIFS_LISTE_OBJECTIFS:
				getACommeListeObjectifsListeObjectifs().clear();
				getACommeListeObjectifsListeObjectifs().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__CONTRAINT_ASSOCIATION_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE:
				getContraintAssociationObjectifCiblageObjectifCiblage().clear();
				getContraintAssociationObjectifCiblageObjectifCiblage().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__DEPEND_ASSOCIATION_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE:
				getDependAssociationObjectifCiblageObjectifCiblage().clear();
				getDependAssociationObjectifCiblageObjectifCiblage().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__ASSOCIE_COMME_INSTANCE_OBJET_INSTANCE_OBJET:
				setAssocieCommeInstanceObjetInstanceObjet((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__NORME_IDENTIFICATION:
				unsetNormeIdentification();
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__IDENTIFICATION:
				setIdentification(IDENTIFICATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__PRIORITE:
				unsetPriorite();
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__TYPE:
				unsetType();
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__AUTORITE_ENGAGEMENT:
				unsetAutoriteEngagement();
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__EFFET_RECHERCHE:
				unsetEffetRecherche();
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__NATURE:
				setNature(NATURE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__ECHELON_TACTIQUE:
				unsetEchelonTactique();
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__VOLUME:
				setVolume(VOLUME_EDEFAULT);
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__DUREE_DISPONIBILITE:
				setDureeDisponibilite((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__DOMMAGES_COLLATERAUX:
				setDommagesCollateraux(DOMMAGES_COLLATERAUX_EDEFAULT);
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__COMMENTAIRE:
				setCommentaire(COMMENTAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__ASSOCIE_COMME_TYPE_OBJECTIF_ACTIVITE_TYPE:
				setAssocieCommeTypeObjectifActiviteType((TypeObjectifActiviteType)null);
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__ACOMME_PROTECTION_PERSONNEL_PROTECTION_PERSONNEL:
				setACommeProtectionPersonnelProtectionPersonnel((TypeProtectionPersonnel)null);
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_MOBILITE_MOBILITE:
				setAPourMobiliteMobilite((TypeMobilite)null);
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__EST_LOCALISE_PAR_ASSOCIATION_OBJECTIF_CIBLAGE_LOCALISATION:
				getEstLocaliseParAssociationObjectifCiblageLocalisation().clear();
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_CARACTERISTIQUES_OBJECTIF_MAJEUR_OBJECTIF_MAJEUR:
				setAPourCaracteristiquesObjectifMajeurObjectifMajeur((TypeObjectifMajeur)null);
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_CARACTERISTIQUES_ASS_OBJECTIF_ASS:
				setAPourCaracteristiquesASSObjectifASS((TypeObjectifASS)null);
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_CARACTERISTIQUE_ALAT_OBJECTIF_ALAT:
				setAPourCaracteristiqueAlatObjectifAlat((TypeObjectifAlat)null);
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_CREATEUR_UNITE:
				setAPourCreateurUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_UNITE_FEUX_AENGAGER_RESERVATION_UNITE:
				getAPourUniteFeuxAEngagerReservationUnite().clear();
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_DOCUMENT_ASSOCIE_ASSOCIATION_OBJECTIF_CIBLAGE_DOCUMENT:
				getAPourDocumentAssocieAssociationObjectifCiblageDocument().clear();
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__ACOMME_AUTORISATION_AUTORISATION_OBJECTIF_CIBLAGE:
				getACommeAutorisationAutorisationObjectifCiblage().clear();
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__EST_IDENTIFIE_PAR_MARQUAGE_OBJECTIF:
				getEstIdentifieParMarquageObjectif().clear();
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__CORRESPOND_AOBJECTIF_ACTIVITE:
				getCorrespondAObjectifActivite().clear();
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__ACOMME_LISTE_OBJECTIFS_LISTE_OBJECTIFS:
				getACommeListeObjectifsListeObjectifs().clear();
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__CONTRAINT_ASSOCIATION_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE:
				getContraintAssociationObjectifCiblageObjectifCiblage().clear();
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__DEPEND_ASSOCIATION_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE:
				getDependAssociationObjectifCiblageObjectifCiblage().clear();
				return;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__ASSOCIE_COMME_INSTANCE_OBJET_INSTANCE_OBJET:
				setAssocieCommeInstanceObjetInstanceObjet((TypeAssociation)null);
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
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__NORME_IDENTIFICATION:
				return isSetNormeIdentification();
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__IDENTIFICATION:
				return IDENTIFICATION_EDEFAULT == null ? identification != null : !IDENTIFICATION_EDEFAULT.equals(identification);
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__PRIORITE:
				return isSetPriorite();
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__TYPE:
				return isSetType();
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__AUTORITE_ENGAGEMENT:
				return isSetAutoriteEngagement();
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__EFFET_RECHERCHE:
				return isSetEffetRecherche();
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__NATURE:
				return NATURE_EDEFAULT == null ? nature != null : !NATURE_EDEFAULT.equals(nature);
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__ECHELON_TACTIQUE:
				return isSetEchelonTactique();
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__VOLUME:
				return VOLUME_EDEFAULT == null ? volume != null : !VOLUME_EDEFAULT.equals(volume);
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__DUREE_DISPONIBILITE:
				return dureeDisponibilite != null;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__DOMMAGES_COLLATERAUX:
				return DOMMAGES_COLLATERAUX_EDEFAULT == null ? dommagesCollateraux != null : !DOMMAGES_COLLATERAUX_EDEFAULT.equals(dommagesCollateraux);
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__COMMENTAIRE:
				return COMMENTAIRE_EDEFAULT == null ? commentaire != null : !COMMENTAIRE_EDEFAULT.equals(commentaire);
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__ASSOCIE_COMME_TYPE_OBJECTIF_ACTIVITE_TYPE:
				return associeCommeTypeObjectifActiviteType != null;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__ACOMME_PROTECTION_PERSONNEL_PROTECTION_PERSONNEL:
				return aCommeProtectionPersonnelProtectionPersonnel != null;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_MOBILITE_MOBILITE:
				return aPourMobiliteMobilite != null;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__EST_LOCALISE_PAR_ASSOCIATION_OBJECTIF_CIBLAGE_LOCALISATION:
				return estLocaliseParAssociationObjectifCiblageLocalisation != null && !estLocaliseParAssociationObjectifCiblageLocalisation.isEmpty();
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_CARACTERISTIQUES_OBJECTIF_MAJEUR_OBJECTIF_MAJEUR:
				return aPourCaracteristiquesObjectifMajeurObjectifMajeur != null;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_CARACTERISTIQUES_ASS_OBJECTIF_ASS:
				return aPourCaracteristiquesASSObjectifASS != null;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_CARACTERISTIQUE_ALAT_OBJECTIF_ALAT:
				return aPourCaracteristiqueAlatObjectifAlat != null;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_CREATEUR_UNITE:
				return aPourCreateurUnite != null;
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_UNITE_FEUX_AENGAGER_RESERVATION_UNITE:
				return aPourUniteFeuxAEngagerReservationUnite != null && !aPourUniteFeuxAEngagerReservationUnite.isEmpty();
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__APOUR_DOCUMENT_ASSOCIE_ASSOCIATION_OBJECTIF_CIBLAGE_DOCUMENT:
				return aPourDocumentAssocieAssociationObjectifCiblageDocument != null && !aPourDocumentAssocieAssociationObjectifCiblageDocument.isEmpty();
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__ACOMME_AUTORISATION_AUTORISATION_OBJECTIF_CIBLAGE:
				return aCommeAutorisationAutorisationObjectifCiblage != null && !aCommeAutorisationAutorisationObjectifCiblage.isEmpty();
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__EST_IDENTIFIE_PAR_MARQUAGE_OBJECTIF:
				return estIdentifieParMarquageObjectif != null && !estIdentifieParMarquageObjectif.isEmpty();
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__CORRESPOND_AOBJECTIF_ACTIVITE:
				return correspondAObjectifActivite != null && !correspondAObjectifActivite.isEmpty();
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__ACOMME_LISTE_OBJECTIFS_LISTE_OBJECTIFS:
				return aCommeListeObjectifsListeObjectifs != null && !aCommeListeObjectifsListeObjectifs.isEmpty();
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__CONTRAINT_ASSOCIATION_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE:
				return contraintAssociationObjectifCiblageObjectifCiblage != null && !contraintAssociationObjectifCiblageObjectifCiblage.isEmpty();
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__DEPEND_ASSOCIATION_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE:
				return dependAssociationObjectifCiblageObjectifCiblage != null && !dependAssociationObjectifCiblageObjectifCiblage.isEmpty();
			case SchemaPackage.TYPE_OBJECTIF_CIBLAGE__ASSOCIE_COMME_INSTANCE_OBJET_INSTANCE_OBJET:
				return associeCommeInstanceObjetInstanceObjet != null;
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
		result.append(" (normeIdentification: ");
		if (normeIdentificationESet) result.append(normeIdentification); else result.append("<unset>");
		result.append(", identification: ");
		result.append(identification);
		result.append(", priorite: ");
		if (prioriteESet) result.append(priorite); else result.append("<unset>");
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", autoriteEngagement: ");
		if (autoriteEngagementESet) result.append(autoriteEngagement); else result.append("<unset>");
		result.append(", effetRecherche: ");
		if (effetRechercheESet) result.append(effetRecherche); else result.append("<unset>");
		result.append(", nature: ");
		result.append(nature);
		result.append(", echelonTactique: ");
		if (echelonTactiqueESet) result.append(echelonTactique); else result.append("<unset>");
		result.append(", volume: ");
		result.append(volume);
		result.append(", dommagesCollateraux: ");
		result.append(dommagesCollateraux);
		result.append(", commentaire: ");
		result.append(commentaire);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeObjectifCiblageImpl
