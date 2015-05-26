
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for AgreementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgreementsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Certification" type="{http://www.opentravel.org/OTA/2003/05}CertificationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AllianceConsortium" type="{http://www.opentravel.org/OTA/2003/05}AllianceConsortiumType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CommissionInfo" type="{http://www.opentravel.org/OTA/2003/05}CommissionInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProfileSecurity" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="AccessingOrganizationType">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                       &lt;enumeration value="ProfileOwner"/>
 *                       &lt;enumeration value="IATA"/>
 *                       &lt;enumeration value="Other"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="AccessingOrganizationID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                 &lt;attribute name="AccessType">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                       &lt;enumeration value="ReadOnly"/>
 *                       &lt;enumeration value="ReadWrite"/>
 *                       &lt;enumeration value="NoAccess"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ContractInformation" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PrivacyGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgreementsType", propOrder = {
    "certification",
    "allianceConsortium",
    "commissionInfo",
    "profileSecurity",
    "contractInformation",
    "tpaExtensions"
})
public class AgreementsType {

    @XmlElement(name = "Certification")
    protected List<CertificationType> certification;
    @XmlElement(name = "AllianceConsortium")
    protected List<AllianceConsortiumType> allianceConsortium;
    @XmlElement(name = "CommissionInfo")
    protected List<CommissionInfoType> commissionInfo;
    @XmlElement(name = "ProfileSecurity")
    protected List<AgreementsType.ProfileSecurity> profileSecurity;
    @XmlElement(name = "ContractInformation")
    protected ParagraphType contractInformation;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "ShareSynchInd")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shareMarketInd;

    /**
     * Gets the value of the certification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CertificationType }
     * 
     * 
     */
    public List<CertificationType> getCertification() {
        if (certification == null) {
            certification = new ArrayList<CertificationType>();
        }
        return this.certification;
    }

    /**
     * Gets the value of the allianceConsortium property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allianceConsortium property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllianceConsortium().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllianceConsortiumType }
     * 
     * 
     */
    public List<AllianceConsortiumType> getAllianceConsortium() {
        if (allianceConsortium == null) {
            allianceConsortium = new ArrayList<AllianceConsortiumType>();
        }
        return this.allianceConsortium;
    }

    /**
     * Gets the value of the commissionInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commissionInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommissionInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommissionInfoType }
     * 
     * 
     */
    public List<CommissionInfoType> getCommissionInfo() {
        if (commissionInfo == null) {
            commissionInfo = new ArrayList<CommissionInfoType>();
        }
        return this.commissionInfo;
    }

    /**
     * Gets the value of the profileSecurity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profileSecurity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfileSecurity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgreementsType.ProfileSecurity }
     * 
     * 
     */
    public List<AgreementsType.ProfileSecurity> getProfileSecurity() {
        if (profileSecurity == null) {
            profileSecurity = new ArrayList<AgreementsType.ProfileSecurity>();
        }
        return this.profileSecurity;
    }

    /**
     * Gets the value of the contractInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ParagraphType }
     *     
     */
    public ParagraphType getContractInformation() {
        return contractInformation;
    }

    /**
     * Sets the value of the contractInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParagraphType }
     *     
     */
    public void setContractInformation(ParagraphType value) {
        this.contractInformation = value;
    }

    /**
     * Gets the value of the tpaExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsType }
     *     
     */
    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * Sets the value of the tpaExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsType }
     *     
     */
    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
    }

    /**
     * Gets the value of the shareSynchInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareSynchInd() {
        return shareSynchInd;
    }

    /**
     * Sets the value of the shareSynchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareSynchInd(String value) {
        this.shareSynchInd = value;
    }

    /**
     * Gets the value of the shareMarketInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareMarketInd() {
        return shareMarketInd;
    }

    /**
     * Sets the value of the shareMarketInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareMarketInd(String value) {
        this.shareMarketInd = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="AccessingOrganizationType">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *             &lt;enumeration value="ProfileOwner"/>
     *             &lt;enumeration value="IATA"/>
     *             &lt;enumeration value="Other"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="AccessingOrganizationID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *       &lt;attribute name="AccessType">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *             &lt;enumeration value="ReadOnly"/>
     *             &lt;enumeration value="ReadWrite"/>
     *             &lt;enumeration value="NoAccess"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ProfileSecurity {

        @XmlAttribute(name = "AccessingOrganizationType")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String accessingOrganizationType;
        @XmlAttribute(name = "AccessingOrganizationID")
        protected String accessingOrganizationID;
        @XmlAttribute(name = "AccessType")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String accessType;
        @XmlAttribute(name = "TransferAction")
        protected TransferActionType transferAction;

        /**
         * Gets the value of the accessingOrganizationType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccessingOrganizationType() {
            return accessingOrganizationType;
        }

        /**
         * Sets the value of the accessingOrganizationType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccessingOrganizationType(String value) {
            this.accessingOrganizationType = value;
        }

        /**
         * Gets the value of the accessingOrganizationID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccessingOrganizationID() {
            return accessingOrganizationID;
        }

        /**
         * Sets the value of the accessingOrganizationID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccessingOrganizationID(String value) {
            this.accessingOrganizationID = value;
        }

        /**
         * Gets the value of the accessType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccessType() {
            return accessType;
        }

        /**
         * Sets the value of the accessType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccessType(String value) {
            this.accessType = value;
        }

        /**
         * Gets the value of the transferAction property.
         * 
         * @return
         *     possible object is
         *     {@link TransferActionType }
         *     
         */
        public TransferActionType getTransferAction() {
            return transferAction;
        }

        /**
         * Sets the value of the transferAction property.
         * 
         * @param value
         *     allowed object is
         *     {@link TransferActionType }
         *     
         */
        public void setTransferAction(TransferActionType value) {
            this.transferAction = value;
        }

    }

}
