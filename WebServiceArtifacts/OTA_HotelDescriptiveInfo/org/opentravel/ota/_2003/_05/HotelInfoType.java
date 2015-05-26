
package org.opentravel.ota._2003._05;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for HotelInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelName" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="HotelShortName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ClosedSeasons" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfDateTimeSpanType" minOccurs="0"/>
 *         &lt;element name="RelativePositions" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRelativePositionType" minOccurs="0"/>
 *         &lt;element name="CategoryCodes" type="{http://www.opentravel.org/OTA/2003/05}CategoryCodesType" minOccurs="0"/>
 *         &lt;element name="Descriptions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Renovation" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
 *                             &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="ImmediatePlans" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="PercentOfRenovationCompleted" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="AreaText" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="RenovationCompletionDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="MultimediaDescriptions" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType">
 *                           &lt;attribute name="InfoCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="AdditionalDetailCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="HotelInfoCodes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfHotelInfoTypeHotelInfoCode" minOccurs="0"/>
 *         &lt;element name="Position" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Altitude" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="AltitudeUnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Services" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfHotelInfoTypeService" minOccurs="0"/>
 *         &lt;element name="OwnershipManagementInfos" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfHotelInfoTypeOwnershipManagementInfo" minOccurs="0"/>
 *         &lt;element name="Languages" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfHotelInfoTypeLanguage" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="WhenBuilt" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="AreaWeather" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="InterfaceCompliance" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PMSSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="HotelStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="HotelStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TaxID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DaylightSavingIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ISO9000CertifiedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelInfoType", propOrder = {
    "hotelName",
    "closedSeasons",
    "relativePositions",
    "categoryCodes",
    "descriptions",
    "hotelInfoCodes",
    "position",
    "services",
    "ownershipManagementInfos",
    "languages"
})
public class HotelInfoType {

    @XmlElement(name = "HotelName")
    protected HotelInfoType.HotelName hotelName;
    @XmlElement(name = "ClosedSeasons")
    protected ArrayOfDateTimeSpanType closedSeasons;
    @XmlElement(name = "RelativePositions")
    protected ArrayOfRelativePositionType relativePositions;
    @XmlElement(name = "CategoryCodes")
    protected CategoryCodesType categoryCodes;
    @XmlElement(name = "Descriptions")
    protected HotelInfoType.Descriptions descriptions;
    @XmlElement(name = "HotelInfoCodes")
    protected ArrayOfHotelInfoTypeHotelInfoCode hotelInfoCodes;
    @XmlElement(name = "Position")
    protected HotelInfoType.Position position;
    @XmlElement(name = "Services")
    protected ArrayOfHotelInfoTypeService services;
    @XmlElement(name = "OwnershipManagementInfos")
    protected ArrayOfHotelInfoTypeOwnershipManagementInfo ownershipManagementInfos;
    @XmlElement(name = "Languages")
    protected ArrayOfHotelInfoTypeLanguage languages;
    @XmlAttribute(name = "WhenBuilt")
    protected String whenBuilt;
    @XmlAttribute(name = "LastUpdated")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdated;
    @XmlAttribute(name = "AreaWeather")
    protected String areaWeather;
    @XmlAttribute(name = "InterfaceCompliance")
    protected String interfaceCompliance;
    @XmlAttribute(name = "PMSSystem")
    protected String pmsSystem;
    @XmlAttribute(name = "Start")
    protected String start;
    @XmlAttribute(name = "Duration")
    protected String duration;
    @XmlAttribute(name = "End")
    protected String end;
    @XmlAttribute(name = "HotelStatus")
    protected String hotelStatus;
    @XmlAttribute(name = "HotelStatusCode")
    protected String hotelStatusCode;
    @XmlAttribute(name = "TaxID")
    protected String taxID;
    @XmlAttribute(name = "DaylightSavingIndicator")
    protected Boolean daylightSavingIndicator;
    @XmlAttribute(name = "ISO9000CertifiedInd")
    protected Boolean iso9000CertifiedInd;

    /**
     * Gets the value of the hotelName property.
     * 
     * @return
     *     possible object is
     *     {@link HotelInfoType.HotelName }
     *     
     */
    public HotelInfoType.HotelName getHotelName() {
        return hotelName;
    }

    /**
     * Sets the value of the hotelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelInfoType.HotelName }
     *     
     */
    public void setHotelName(HotelInfoType.HotelName value) {
        this.hotelName = value;
    }

    /**
     * Gets the value of the closedSeasons property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDateTimeSpanType }
     *     
     */
    public ArrayOfDateTimeSpanType getClosedSeasons() {
        return closedSeasons;
    }

    /**
     * Sets the value of the closedSeasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDateTimeSpanType }
     *     
     */
    public void setClosedSeasons(ArrayOfDateTimeSpanType value) {
        this.closedSeasons = value;
    }

    /**
     * Gets the value of the relativePositions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRelativePositionType }
     *     
     */
    public ArrayOfRelativePositionType getRelativePositions() {
        return relativePositions;
    }

    /**
     * Sets the value of the relativePositions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRelativePositionType }
     *     
     */
    public void setRelativePositions(ArrayOfRelativePositionType value) {
        this.relativePositions = value;
    }

    /**
     * Gets the value of the categoryCodes property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryCodesType }
     *     
     */
    public CategoryCodesType getCategoryCodes() {
        return categoryCodes;
    }

    /**
     * Sets the value of the categoryCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryCodesType }
     *     
     */
    public void setCategoryCodes(CategoryCodesType value) {
        this.categoryCodes = value;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * @return
     *     possible object is
     *     {@link HotelInfoType.Descriptions }
     *     
     */
    public HotelInfoType.Descriptions getDescriptions() {
        return descriptions;
    }

    /**
     * Sets the value of the descriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelInfoType.Descriptions }
     *     
     */
    public void setDescriptions(HotelInfoType.Descriptions value) {
        this.descriptions = value;
    }

    /**
     * Gets the value of the hotelInfoCodes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelInfoTypeHotelInfoCode }
     *     
     */
    public ArrayOfHotelInfoTypeHotelInfoCode getHotelInfoCodes() {
        return hotelInfoCodes;
    }

    /**
     * Sets the value of the hotelInfoCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelInfoTypeHotelInfoCode }
     *     
     */
    public void setHotelInfoCodes(ArrayOfHotelInfoTypeHotelInfoCode value) {
        this.hotelInfoCodes = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link HotelInfoType.Position }
     *     
     */
    public HotelInfoType.Position getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelInfoType.Position }
     *     
     */
    public void setPosition(HotelInfoType.Position value) {
        this.position = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelInfoTypeService }
     *     
     */
    public ArrayOfHotelInfoTypeService getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelInfoTypeService }
     *     
     */
    public void setServices(ArrayOfHotelInfoTypeService value) {
        this.services = value;
    }

    /**
     * Gets the value of the ownershipManagementInfos property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelInfoTypeOwnershipManagementInfo }
     *     
     */
    public ArrayOfHotelInfoTypeOwnershipManagementInfo getOwnershipManagementInfos() {
        return ownershipManagementInfos;
    }

    /**
     * Sets the value of the ownershipManagementInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelInfoTypeOwnershipManagementInfo }
     *     
     */
    public void setOwnershipManagementInfos(ArrayOfHotelInfoTypeOwnershipManagementInfo value) {
        this.ownershipManagementInfos = value;
    }

    /**
     * Gets the value of the languages property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelInfoTypeLanguage }
     *     
     */
    public ArrayOfHotelInfoTypeLanguage getLanguages() {
        return languages;
    }

    /**
     * Sets the value of the languages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelInfoTypeLanguage }
     *     
     */
    public void setLanguages(ArrayOfHotelInfoTypeLanguage value) {
        this.languages = value;
    }

    /**
     * Gets the value of the whenBuilt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhenBuilt() {
        return whenBuilt;
    }

    /**
     * Sets the value of the whenBuilt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhenBuilt(String value) {
        this.whenBuilt = value;
    }

    /**
     * Gets the value of the lastUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdated() {
        return lastUpdated;
    }

    /**
     * Sets the value of the lastUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdated(XMLGregorianCalendar value) {
        this.lastUpdated = value;
    }

    /**
     * Gets the value of the areaWeather property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaWeather() {
        return areaWeather;
    }

    /**
     * Sets the value of the areaWeather property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaWeather(String value) {
        this.areaWeather = value;
    }

    /**
     * Gets the value of the interfaceCompliance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterfaceCompliance() {
        return interfaceCompliance;
    }

    /**
     * Sets the value of the interfaceCompliance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterfaceCompliance(String value) {
        this.interfaceCompliance = value;
    }

    /**
     * Gets the value of the pmsSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPMSSystem() {
        return pmsSystem;
    }

    /**
     * Sets the value of the pmsSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPMSSystem(String value) {
        this.pmsSystem = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStart(String value) {
        this.start = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnd(String value) {
        this.end = value;
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

    /**
     * Gets the value of the taxID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxID() {
        return taxID;
    }

    /**
     * Sets the value of the taxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxID(String value) {
        this.taxID = value;
    }

    /**
     * Gets the value of the daylightSavingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDaylightSavingIndicator() {
        return daylightSavingIndicator;
    }

    /**
     * Sets the value of the daylightSavingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDaylightSavingIndicator(Boolean value) {
        this.daylightSavingIndicator = value;
    }

    /**
     * Gets the value of the iso9000CertifiedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISO9000CertifiedInd() {
        return iso9000CertifiedInd;
    }

    /**
     * Sets the value of the iso9000CertifiedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISO9000CertifiedInd(Boolean value) {
        this.iso9000CertifiedInd = value;
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
     *       &lt;sequence>
     *         &lt;element name="Renovation" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
     *                   &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="ImmediatePlans" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="PercentOfRenovationCompleted" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="AreaText" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="RenovationCompletionDate" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="MultimediaDescriptions" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType">
     *                 &lt;attribute name="InfoCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="AdditionalDetailCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "renovation",
        "multimediaDescriptions",
        "descriptiveText"
    })
    public static class Descriptions {

        @XmlElement(name = "Renovation")
        protected List<HotelInfoType.Descriptions.Renovation> renovation;
        @XmlElement(name = "MultimediaDescriptions")
        protected HotelInfoType.Descriptions.MultimediaDescriptions multimediaDescriptions;
        @XmlElement(name = "DescriptiveText")
        protected String descriptiveText;

        /**
         * Gets the value of the renovation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the renovation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRenovation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HotelInfoType.Descriptions.Renovation }
         * 
         * 
         */
        public List<HotelInfoType.Descriptions.Renovation> getRenovation() {
            if (renovation == null) {
                renovation = new ArrayList<HotelInfoType.Descriptions.Renovation>();
            }
            return this.renovation;
        }

        /**
         * Gets the value of the multimediaDescriptions property.
         * 
         * @return
         *     possible object is
         *     {@link HotelInfoType.Descriptions.MultimediaDescriptions }
         *     
         */
        public HotelInfoType.Descriptions.MultimediaDescriptions getMultimediaDescriptions() {
            return multimediaDescriptions;
        }

        /**
         * Sets the value of the multimediaDescriptions property.
         * 
         * @param value
         *     allowed object is
         *     {@link HotelInfoType.Descriptions.MultimediaDescriptions }
         *     
         */
        public void setMultimediaDescriptions(HotelInfoType.Descriptions.MultimediaDescriptions value) {
            this.multimediaDescriptions = value;
        }

        /**
         * Gets the value of the descriptiveText property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescriptiveText() {
            return descriptiveText;
        }

        /**
         * Sets the value of the descriptiveText property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescriptiveText(String value) {
            this.descriptiveText = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType">
         *       &lt;attribute name="InfoCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="AdditionalDetailCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class MultimediaDescriptions
            extends MultimediaDescriptionsType
        {

            @XmlAttribute(name = "InfoCode")
            protected String infoCode;
            @XmlAttribute(name = "AdditionalDetailCode")
            protected String additionalDetailCode;

            /**
             * Gets the value of the infoCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInfoCode() {
                return infoCode;
            }

            /**
             * Sets the value of the infoCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInfoCode(String value) {
                this.infoCode = value;
            }

            /**
             * Gets the value of the additionalDetailCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAdditionalDetailCode() {
                return additionalDetailCode;
            }

            /**
             * Sets the value of the additionalDetailCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAdditionalDetailCode(String value) {
                this.additionalDetailCode = value;
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
         *       &lt;sequence>
         *         &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
         *         &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="ImmediatePlans" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="PercentOfRenovationCompleted" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="AreaText" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="RenovationCompletionDate" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "multimediaDescriptions",
            "descriptiveText"
        })
        public static class Renovation {

            @XmlElement(name = "MultimediaDescriptions")
            protected MultimediaDescriptionsType multimediaDescriptions;
            @XmlElement(name = "DescriptiveText")
            protected String descriptiveText;
            @XmlAttribute(name = "ImmediatePlans")
            protected Boolean immediatePlans;
            @XmlAttribute(name = "PercentOfRenovationCompleted")
            protected BigDecimal percentOfRenovationCompleted;
            @XmlAttribute(name = "Start")
            protected String start;
            @XmlAttribute(name = "Duration")
            protected String duration;
            @XmlAttribute(name = "End")
            protected String end;
            @XmlAttribute(name = "AreaText")
            protected String areaText;
            @XmlAttribute(name = "RenovationCompletionDate")
            protected String renovationCompletionDate;

            /**
             * Gets the value of the multimediaDescriptions property.
             * 
             * @return
             *     possible object is
             *     {@link MultimediaDescriptionsType }
             *     
             */
            public MultimediaDescriptionsType getMultimediaDescriptions() {
                return multimediaDescriptions;
            }

            /**
             * Sets the value of the multimediaDescriptions property.
             * 
             * @param value
             *     allowed object is
             *     {@link MultimediaDescriptionsType }
             *     
             */
            public void setMultimediaDescriptions(MultimediaDescriptionsType value) {
                this.multimediaDescriptions = value;
            }

            /**
             * Gets the value of the descriptiveText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescriptiveText() {
                return descriptiveText;
            }

            /**
             * Sets the value of the descriptiveText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescriptiveText(String value) {
                this.descriptiveText = value;
            }

            /**
             * Gets the value of the immediatePlans property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isImmediatePlans() {
                return immediatePlans;
            }

            /**
             * Sets the value of the immediatePlans property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setImmediatePlans(Boolean value) {
                this.immediatePlans = value;
            }

            /**
             * Gets the value of the percentOfRenovationCompleted property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPercentOfRenovationCompleted() {
                return percentOfRenovationCompleted;
            }

            /**
             * Sets the value of the percentOfRenovationCompleted property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPercentOfRenovationCompleted(BigDecimal value) {
                this.percentOfRenovationCompleted = value;
            }

            /**
             * Gets the value of the start property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStart() {
                return start;
            }

            /**
             * Sets the value of the start property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStart(String value) {
                this.start = value;
            }

            /**
             * Gets the value of the duration property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDuration() {
                return duration;
            }

            /**
             * Sets the value of the duration property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDuration(String value) {
                this.duration = value;
            }

            /**
             * Gets the value of the end property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEnd() {
                return end;
            }

            /**
             * Sets the value of the end property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEnd(String value) {
                this.end = value;
            }

            /**
             * Gets the value of the areaText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAreaText() {
                return areaText;
            }

            /**
             * Sets the value of the areaText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAreaText(String value) {
                this.areaText = value;
            }

            /**
             * Gets the value of the renovationCompletionDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRenovationCompletionDate() {
                return renovationCompletionDate;
            }

            /**
             * Sets the value of the renovationCompletionDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRenovationCompletionDate(String value) {
                this.renovationCompletionDate = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="HotelShortName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class HotelName {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "HotelShortName")
        protected String hotelShortName;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the hotelShortName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotelShortName() {
            return hotelShortName;
        }

        /**
         * Sets the value of the hotelShortName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotelShortName(String value) {
            this.hotelShortName = value;
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
     *       &lt;attribute name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Altitude" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="AltitudeUnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Position {

        @XmlAttribute(name = "Latitude")
        protected String latitude;
        @XmlAttribute(name = "Longitude")
        protected String longitude;
        @XmlAttribute(name = "Altitude")
        protected String altitude;
        @XmlAttribute(name = "AltitudeUnitOfMeasureCode")
        protected String altitudeUnitOfMeasureCode;

        /**
         * Gets the value of the latitude property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLatitude() {
            return latitude;
        }

        /**
         * Sets the value of the latitude property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLatitude(String value) {
            this.latitude = value;
        }

        /**
         * Gets the value of the longitude property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLongitude() {
            return longitude;
        }

        /**
         * Sets the value of the longitude property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLongitude(String value) {
            this.longitude = value;
        }

        /**
         * Gets the value of the altitude property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAltitude() {
            return altitude;
        }

        /**
         * Sets the value of the altitude property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAltitude(String value) {
            this.altitude = value;
        }

        /**
         * Gets the value of the altitudeUnitOfMeasureCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAltitudeUnitOfMeasureCode() {
            return altitudeUnitOfMeasureCode;
        }

        /**
         * Sets the value of the altitudeUnitOfMeasureCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAltitudeUnitOfMeasureCode(String value) {
            this.altitudeUnitOfMeasureCode = value;
        }

    }

}
