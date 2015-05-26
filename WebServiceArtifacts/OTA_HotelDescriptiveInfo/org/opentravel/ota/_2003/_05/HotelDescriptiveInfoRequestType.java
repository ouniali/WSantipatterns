
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelDescriptiveInfoRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelDescriptiveInfoRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="SendData" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="HotelStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="HotelStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FacilityInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="SendMeetingRooms" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="SendGuestRooms" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="SendRestaurants" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Policies" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="SendPolicies" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AreaInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="SendRefPoints" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="SendAttractions" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="SendRecreations" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AffiliationInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="SendDistribSystems" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="SendBrands" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="SendLoyalPrograms" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="SendAwards" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ContactInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="SendData" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MultimediaObjects" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="SendData" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ContentInfos" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfHotelDescriptiveInfoRequestTypeContentInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelDescriptiveInfoRequestType", propOrder = {
    "hotelInfo",
    "facilityInfo",
    "policies",
    "areaInfo",
    "affiliationInfo",
    "contactInfo",
    "multimediaObjects",
    "contentInfos"
})
@XmlSeeAlso({
    org.opentravel.ota._2003._05.OTAHotelDescriptiveInfoService.OTAHotelDescriptiveInfoRQ.HotelDescriptiveInfos.HotelDescriptiveInfo.class
})
public class HotelDescriptiveInfoRequestType {

    @XmlElement(name = "HotelInfo")
    protected HotelDescriptiveInfoRequestType.HotelInfo hotelInfo;
    @XmlElement(name = "FacilityInfo")
    protected HotelDescriptiveInfoRequestType.FacilityInfo facilityInfo;
    @XmlElement(name = "Policies")
    protected HotelDescriptiveInfoRequestType.Policies policies;
    @XmlElement(name = "AreaInfo")
    protected HotelDescriptiveInfoRequestType.AreaInfo areaInfo;
    @XmlElement(name = "AffiliationInfo")
    protected HotelDescriptiveInfoRequestType.AffiliationInfo affiliationInfo;
    @XmlElement(name = "ContactInfo")
    protected HotelDescriptiveInfoRequestType.ContactInfo contactInfo;
    @XmlElement(name = "MultimediaObjects")
    protected HotelDescriptiveInfoRequestType.MultimediaObjects multimediaObjects;
    @XmlElement(name = "ContentInfos")
    protected ArrayOfHotelDescriptiveInfoRequestTypeContentInfo contentInfos;
    @XmlAttribute(name = "ChainCode")
    protected String chainCode;
    @XmlAttribute(name = "BrandCode")
    protected String brandCode;
    @XmlAttribute(name = "HotelCode")
    protected String hotelCode;
    @XmlAttribute(name = "HotelCityCode")
    protected String hotelCityCode;
    @XmlAttribute(name = "HotelName")
    protected String hotelName;
    @XmlAttribute(name = "HotelCodeContext")
    protected String hotelCodeContext;
    @XmlAttribute(name = "ChainName")
    protected String chainName;
    @XmlAttribute(name = "BrandName")
    protected String brandName;

    /**
     * Gets the value of the hotelInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HotelDescriptiveInfoRequestType.HotelInfo }
     *     
     */
    public HotelDescriptiveInfoRequestType.HotelInfo getHotelInfo() {
        return hotelInfo;
    }

    /**
     * Sets the value of the hotelInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelDescriptiveInfoRequestType.HotelInfo }
     *     
     */
    public void setHotelInfo(HotelDescriptiveInfoRequestType.HotelInfo value) {
        this.hotelInfo = value;
    }

    /**
     * Gets the value of the facilityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HotelDescriptiveInfoRequestType.FacilityInfo }
     *     
     */
    public HotelDescriptiveInfoRequestType.FacilityInfo getFacilityInfo() {
        return facilityInfo;
    }

    /**
     * Sets the value of the facilityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelDescriptiveInfoRequestType.FacilityInfo }
     *     
     */
    public void setFacilityInfo(HotelDescriptiveInfoRequestType.FacilityInfo value) {
        this.facilityInfo = value;
    }

    /**
     * Gets the value of the policies property.
     * 
     * @return
     *     possible object is
     *     {@link HotelDescriptiveInfoRequestType.Policies }
     *     
     */
    public HotelDescriptiveInfoRequestType.Policies getPolicies() {
        return policies;
    }

    /**
     * Sets the value of the policies property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelDescriptiveInfoRequestType.Policies }
     *     
     */
    public void setPolicies(HotelDescriptiveInfoRequestType.Policies value) {
        this.policies = value;
    }

    /**
     * Gets the value of the areaInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HotelDescriptiveInfoRequestType.AreaInfo }
     *     
     */
    public HotelDescriptiveInfoRequestType.AreaInfo getAreaInfo() {
        return areaInfo;
    }

    /**
     * Sets the value of the areaInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelDescriptiveInfoRequestType.AreaInfo }
     *     
     */
    public void setAreaInfo(HotelDescriptiveInfoRequestType.AreaInfo value) {
        this.areaInfo = value;
    }

    /**
     * Gets the value of the affiliationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HotelDescriptiveInfoRequestType.AffiliationInfo }
     *     
     */
    public HotelDescriptiveInfoRequestType.AffiliationInfo getAffiliationInfo() {
        return affiliationInfo;
    }

    /**
     * Sets the value of the affiliationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelDescriptiveInfoRequestType.AffiliationInfo }
     *     
     */
    public void setAffiliationInfo(HotelDescriptiveInfoRequestType.AffiliationInfo value) {
        this.affiliationInfo = value;
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HotelDescriptiveInfoRequestType.ContactInfo }
     *     
     */
    public HotelDescriptiveInfoRequestType.ContactInfo getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelDescriptiveInfoRequestType.ContactInfo }
     *     
     */
    public void setContactInfo(HotelDescriptiveInfoRequestType.ContactInfo value) {
        this.contactInfo = value;
    }

    /**
     * Gets the value of the multimediaObjects property.
     * 
     * @return
     *     possible object is
     *     {@link HotelDescriptiveInfoRequestType.MultimediaObjects }
     *     
     */
    public HotelDescriptiveInfoRequestType.MultimediaObjects getMultimediaObjects() {
        return multimediaObjects;
    }

    /**
     * Sets the value of the multimediaObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelDescriptiveInfoRequestType.MultimediaObjects }
     *     
     */
    public void setMultimediaObjects(HotelDescriptiveInfoRequestType.MultimediaObjects value) {
        this.multimediaObjects = value;
    }

    /**
     * Gets the value of the contentInfos property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelDescriptiveInfoRequestTypeContentInfo }
     *     
     */
    public ArrayOfHotelDescriptiveInfoRequestTypeContentInfo getContentInfos() {
        return contentInfos;
    }

    /**
     * Sets the value of the contentInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelDescriptiveInfoRequestTypeContentInfo }
     *     
     */
    public void setContentInfos(ArrayOfHotelDescriptiveInfoRequestTypeContentInfo value) {
        this.contentInfos = value;
    }

    /**
     * Gets the value of the chainCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChainCode() {
        return chainCode;
    }

    /**
     * Sets the value of the chainCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChainCode(String value) {
        this.chainCode = value;
    }

    /**
     * Gets the value of the brandCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandCode() {
        return brandCode;
    }

    /**
     * Sets the value of the brandCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandCode(String value) {
        this.brandCode = value;
    }

    /**
     * Gets the value of the hotelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelCode() {
        return hotelCode;
    }

    /**
     * Sets the value of the hotelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelCode(String value) {
        this.hotelCode = value;
    }

    /**
     * Gets the value of the hotelCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelCityCode() {
        return hotelCityCode;
    }

    /**
     * Sets the value of the hotelCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelCityCode(String value) {
        this.hotelCityCode = value;
    }

    /**
     * Gets the value of the hotelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelName() {
        return hotelName;
    }

    /**
     * Sets the value of the hotelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelName(String value) {
        this.hotelName = value;
    }

    /**
     * Gets the value of the hotelCodeContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelCodeContext() {
        return hotelCodeContext;
    }

    /**
     * Sets the value of the hotelCodeContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelCodeContext(String value) {
        this.hotelCodeContext = value;
    }

    /**
     * Gets the value of the chainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChainName() {
        return chainName;
    }

    /**
     * Sets the value of the chainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChainName(String value) {
        this.chainName = value;
    }

    /**
     * Gets the value of the brandName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * Sets the value of the brandName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandName(String value) {
        this.brandName = value;
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
     *       &lt;attribute name="SendDistribSystems" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="SendBrands" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="SendLoyalPrograms" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="SendAwards" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AffiliationInfo {

        @XmlAttribute(name = "SendDistribSystems")
        protected Boolean sendDistribSystems;
        @XmlAttribute(name = "SendBrands")
        protected Boolean sendBrands;
        @XmlAttribute(name = "SendLoyalPrograms")
        protected Boolean sendLoyalPrograms;
        @XmlAttribute(name = "SendAwards")
        protected Boolean sendAwards;

        /**
         * Gets the value of the sendDistribSystems property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSendDistribSystems() {
            return sendDistribSystems;
        }

        /**
         * Sets the value of the sendDistribSystems property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSendDistribSystems(Boolean value) {
            this.sendDistribSystems = value;
        }

        /**
         * Gets the value of the sendBrands property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSendBrands() {
            return sendBrands;
        }

        /**
         * Sets the value of the sendBrands property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSendBrands(Boolean value) {
            this.sendBrands = value;
        }

        /**
         * Gets the value of the sendLoyalPrograms property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSendLoyalPrograms() {
            return sendLoyalPrograms;
        }

        /**
         * Sets the value of the sendLoyalPrograms property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSendLoyalPrograms(Boolean value) {
            this.sendLoyalPrograms = value;
        }

        /**
         * Gets the value of the sendAwards property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSendAwards() {
            return sendAwards;
        }

        /**
         * Sets the value of the sendAwards property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSendAwards(Boolean value) {
            this.sendAwards = value;
        }

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
     *       &lt;attribute name="SendRefPoints" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="SendAttractions" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="SendRecreations" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AreaInfo {

        @XmlAttribute(name = "SendRefPoints")
        protected Boolean sendRefPoints;
        @XmlAttribute(name = "SendAttractions")
        protected Boolean sendAttractions;
        @XmlAttribute(name = "SendRecreations")
        protected Boolean sendRecreations;

        /**
         * Gets the value of the sendRefPoints property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSendRefPoints() {
            return sendRefPoints;
        }

        /**
         * Sets the value of the sendRefPoints property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSendRefPoints(Boolean value) {
            this.sendRefPoints = value;
        }

        /**
         * Gets the value of the sendAttractions property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSendAttractions() {
            return sendAttractions;
        }

        /**
         * Sets the value of the sendAttractions property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSendAttractions(Boolean value) {
            this.sendAttractions = value;
        }

        /**
         * Gets the value of the sendRecreations property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSendRecreations() {
            return sendRecreations;
        }

        /**
         * Sets the value of the sendRecreations property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSendRecreations(Boolean value) {
            this.sendRecreations = value;
        }

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
     *       &lt;attribute name="SendData" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ContactInfo {

        @XmlAttribute(name = "SendData")
        protected Boolean sendData;

        /**
         * Gets the value of the sendData property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSendData() {
            return sendData;
        }

        /**
         * Sets the value of the sendData property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSendData(Boolean value) {
            this.sendData = value;
        }

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
     *       &lt;attribute name="SendMeetingRooms" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="SendGuestRooms" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="SendRestaurants" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FacilityInfo {

        @XmlAttribute(name = "SendMeetingRooms")
        protected Boolean sendMeetingRooms;
        @XmlAttribute(name = "SendGuestRooms")
        protected Boolean sendGuestRooms;
        @XmlAttribute(name = "SendRestaurants")
        protected Boolean sendRestaurants;

        /**
         * Gets the value of the sendMeetingRooms property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSendMeetingRooms() {
            return sendMeetingRooms;
        }

        /**
         * Sets the value of the sendMeetingRooms property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSendMeetingRooms(Boolean value) {
            this.sendMeetingRooms = value;
        }

        /**
         * Gets the value of the sendGuestRooms property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSendGuestRooms() {
            return sendGuestRooms;
        }

        /**
         * Sets the value of the sendGuestRooms property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSendGuestRooms(Boolean value) {
            this.sendGuestRooms = value;
        }

        /**
         * Gets the value of the sendRestaurants property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSendRestaurants() {
            return sendRestaurants;
        }

        /**
         * Sets the value of the sendRestaurants property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSendRestaurants(Boolean value) {
            this.sendRestaurants = value;
        }

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
     *       &lt;attribute name="SendData" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="HotelStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="HotelStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class HotelInfo {

        @XmlAttribute(name = "SendData")
        protected Boolean sendData;
        @XmlAttribute(name = "HotelStatus")
        protected String hotelStatus;
        @XmlAttribute(name = "HotelStatusCode")
        protected String hotelStatusCode;

        /**
         * Gets the value of the sendData property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSendData() {
            return sendData;
        }

        /**
         * Sets the value of the sendData property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSendData(Boolean value) {
            this.sendData = value;
        }

        /**
         * Gets the value of the hotelStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotelStatus() {
            return hotelStatus;
        }

        /**
         * Sets the value of the hotelStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotelStatus(String value) {
            this.hotelStatus = value;
        }

        /**
         * Gets the value of the hotelStatusCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotelStatusCode() {
            return hotelStatusCode;
        }

        /**
         * Sets the value of the hotelStatusCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotelStatusCode(String value) {
            this.hotelStatusCode = value;
        }

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
     *       &lt;attribute name="SendData" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MultimediaObjects {

        @XmlAttribute(name = "SendData")
        protected Boolean sendData;

        /**
         * Gets the value of the sendData property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSendData() {
            return sendData;
        }

        /**
         * Sets the value of the sendData property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSendData(Boolean value) {
            this.sendData = value;
        }

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
     *       &lt;attribute name="SendPolicies" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Policies {

        @XmlAttribute(name = "SendPolicies")
        protected Boolean sendPolicies;

        /**
         * Gets the value of the sendPolicies property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSendPolicies() {
            return sendPolicies;
        }

        /**
         * Sets the value of the sendPolicies property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSendPolicies(Boolean value) {
            this.sendPolicies = value;
        }

    }

}
