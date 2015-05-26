
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SailingBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SailingBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CruiseLine">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ShipReferenceGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Region" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RegionGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DeparturePort" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>LocationType">
 *                 &lt;attribute name="EmbarkationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ArrivalPort" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>LocationType">
 *                 &lt;attribute name="DebarkationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ListOfSailingDescriptionCode" type="{http://www.opentravel.org/OTA/2003/05}ListOfOTA_CodeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SailingBaseType", propOrder = {
    "cruiseLine",
    "region",
    "departurePort",
    "arrivalPort"
})
@XmlSeeAlso({
    org.opentravel.ota._2003._05.SailingInfoType.SelectedSailing.class
})
public class SailingBaseType {

    @XmlElement(name = "CruiseLine", required = true)
    protected SailingBaseType.CruiseLine cruiseLine;
    @XmlElement(name = "Region")
    protected SailingBaseType.Region region;
    @XmlElement(name = "DeparturePort")
    protected SailingBaseType.DeparturePort departurePort;
    @XmlElement(name = "ArrivalPort")
    protected SailingBaseType.ArrivalPort arrivalPort;
    @XmlAttribute(name = "ListOfSailingDescriptionCode")
    protected List<String> listOfSailingDescriptionCode;

    /**
     * Gets the value of the cruiseLine property.
     * 
     * @return
     *     possible object is
     *     {@link SailingBaseType.CruiseLine }
     *     
     */
    public SailingBaseType.CruiseLine getCruiseLine() {
        return cruiseLine;
    }

    /**
     * Sets the value of the cruiseLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link SailingBaseType.CruiseLine }
     *     
     */
    public void setCruiseLine(SailingBaseType.CruiseLine value) {
        this.cruiseLine = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link SailingBaseType.Region }
     *     
     */
    public SailingBaseType.Region getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link SailingBaseType.Region }
     *     
     */
    public void setRegion(SailingBaseType.Region value) {
        this.region = value;
    }

    /**
     * Gets the value of the departurePort property.
     * 
     * @return
     *     possible object is
     *     {@link SailingBaseType.DeparturePort }
     *     
     */
    public SailingBaseType.DeparturePort getDeparturePort() {
        return departurePort;
    }

    /**
     * Sets the value of the departurePort property.
     * 
     * @param value
     *     allowed object is
     *     {@link SailingBaseType.DeparturePort }
     *     
     */
    public void setDeparturePort(SailingBaseType.DeparturePort value) {
        this.departurePort = value;
    }

    /**
     * Gets the value of the arrivalPort property.
     * 
     * @return
     *     possible object is
     *     {@link SailingBaseType.ArrivalPort }
     *     
     */
    public SailingBaseType.ArrivalPort getArrivalPort() {
        return arrivalPort;
    }

    /**
     * Sets the value of the arrivalPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link SailingBaseType.ArrivalPort }
     *     
     */
    public void setArrivalPort(SailingBaseType.ArrivalPort value) {
        this.arrivalPort = value;
    }

    /**
     * Gets the value of the listOfSailingDescriptionCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listOfSailingDescriptionCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListOfSailingDescriptionCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getListOfSailingDescriptionCode() {
        if (listOfSailingDescriptionCode == null) {
            listOfSailingDescriptionCode = new ArrayList<String>();
        }
        return this.listOfSailingDescriptionCode;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>LocationType">
     *       &lt;attribute name="DebarkationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ArrivalPort
        extends LocationType
    {

        @XmlAttribute(name = "DebarkationDateTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar debarkationDateTime;

        /**
         * Gets the value of the debarkationDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDebarkationDateTime() {
            return debarkationDateTime;
        }

        /**
         * Sets the value of the debarkationDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDebarkationDateTime(XMLGregorianCalendar value) {
            this.debarkationDateTime = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ShipReferenceGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CruiseLine {

        @XmlAttribute(name = "VendorCode")
        protected String vendorCode;
        @XmlAttribute(name = "VendorName")
        protected String vendorName;
        @XmlAttribute(name = "ShipCode")
        protected String shipCode;
        @XmlAttribute(name = "ShipName")
        protected String shipName;
        @XmlAttribute(name = "VendorCodeContext")
        protected String vendorCodeContext;

        /**
         * Gets the value of the vendorCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVendorCode() {
            return vendorCode;
        }

        /**
         * Sets the value of the vendorCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVendorCode(String value) {
            this.vendorCode = value;
        }

        /**
         * Gets the value of the vendorName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVendorName() {
            return vendorName;
        }

        /**
         * Sets the value of the vendorName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVendorName(String value) {
            this.vendorName = value;
        }

        /**
         * Gets the value of the shipCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShipCode() {
            return shipCode;
        }

        /**
         * Sets the value of the shipCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShipCode(String value) {
            this.shipCode = value;
        }

        /**
         * Gets the value of the shipName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShipName() {
            return shipName;
        }

        /**
         * Sets the value of the shipName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShipName(String value) {
            this.shipName = value;
        }

        /**
         * Gets the value of the vendorCodeContext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVendorCodeContext() {
            return vendorCodeContext;
        }

        /**
         * Sets the value of the vendorCodeContext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVendorCodeContext(String value) {
            this.vendorCodeContext = value;
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
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>LocationType">
     *       &lt;attribute name="EmbarkationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DeparturePort
        extends LocationType
    {

        @XmlAttribute(name = "EmbarkationTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar embarkationTime;

        /**
         * Gets the value of the embarkationTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEmbarkationTime() {
            return embarkationTime;
        }

        /**
         * Sets the value of the embarkationTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEmbarkationTime(XMLGregorianCalendar value) {
            this.embarkationTime = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RegionGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Region {

        @XmlAttribute(name = "RegionCode")
        protected String regionCode;
        @XmlAttribute(name = "RegionName")
        protected String regionName;
        @XmlAttribute(name = "SubRegionCode")
        protected String subRegionCode;
        @XmlAttribute(name = "SubRegionName")
        protected String subRegionName;

        /**
         * Gets the value of the regionCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegionCode() {
            return regionCode;
        }

        /**
         * Sets the value of the regionCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegionCode(String value) {
            this.regionCode = value;
        }

        /**
         * Gets the value of the regionName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegionName() {
            return regionName;
        }

        /**
         * Sets the value of the regionName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegionName(String value) {
            this.regionName = value;
        }

        /**
         * Gets the value of the subRegionCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubRegionCode() {
            return subRegionCode;
        }

        /**
         * Sets the value of the subRegionCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubRegionCode(String value) {
            this.subRegionCode = value;
        }

        /**
         * Gets the value of the subRegionName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubRegionName() {
            return subRegionName;
        }

        /**
         * Sets the value of the subRegionName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubRegionName(String value) {
            this.subRegionName = value;
        }

    }

}
