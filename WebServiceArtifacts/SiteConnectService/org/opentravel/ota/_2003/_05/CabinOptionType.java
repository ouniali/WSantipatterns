
package org.opentravel.ota._2003._05;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CabinOptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CabinOptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CabinConfiguration" maxOccurs="9" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="BedConfigurationCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MeasurementInfo" maxOccurs="9" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OptionalCodeOptionalNameGroup"/>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitsOfMeasureGroup"/>
 *                 &lt;attribute name="DimensionInfo" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Remark" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DeckGroup"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CruiseCabinGroup"/>
 *       &lt;attribute name="Status" use="required" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *       &lt;attribute name="CategoryLocation" type="{http://www.opentravel.org/OTA/2003/05}CategoryLocationType" />
 *       &lt;attribute name="ShipSide">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Starboard"/>
 *             &lt;enumeration value="Port"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="PositionInShip">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Aft"/>
 *             &lt;enumeration value="Forward"/>
 *             &lt;enumeration value="Midship"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="BedType" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *       &lt;attribute name="ReleaseDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="CabinCategoryStatusCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *       &lt;attribute name="CabinCategoryCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *       &lt;attribute name="CabinRanking" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to999" />
 *       &lt;attribute name="ConnectingCabinIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ConnectingCabinNumber" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinOptionType", propOrder = {
    "cabinConfiguration",
    "measurementInfo",
    "remark"
})
@XmlSeeAlso({
    org.opentravel.ota._2003._05.SailingCategoryInfoType.SelectedCategory.SelectedCabin.class
})
public class CabinOptionType {

    @XmlElement(name = "CabinConfiguration")
    protected List<CabinOptionType.CabinConfiguration> cabinConfiguration;
    @XmlElement(name = "MeasurementInfo")
    protected List<CabinOptionType.MeasurementInfo> measurementInfo;
    @XmlElement(name = "Remark")
    protected FreeTextType remark;
    @XmlAttribute(name = "Status", required = true)
    protected String status;
    @XmlAttribute(name = "CategoryLocation")
    protected CategoryLocationType categoryLocation;
    @XmlAttribute(name = "ShipSide")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shipSide;
    @XmlAttribute(name = "PositionInShip")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String positionInShip;
    @XmlAttribute(name = "BedType")
    protected String bedType;
    @XmlAttribute(name = "ReleaseDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar releaseDateTime;
    @XmlAttribute(name = "CabinCategoryStatusCode")
    protected String cabinCategoryStatusCode;
    @XmlAttribute(name = "CabinCategoryCode")
    protected String cabinCategoryCode;
    @XmlAttribute(name = "CabinRanking")
    protected Integer cabinRanking;
    @XmlAttribute(name = "ConnectingCabinIndicator")
    protected Boolean connectingCabinIndicator;
    @XmlAttribute(name = "ConnectingCabinNumber")
    protected String connectingCabinNumber;
    @XmlAttribute(name = "DeckNumber")
    protected String deckNumber;
    @XmlAttribute(name = "DeckName")
    protected String deckName;
    @XmlAttribute(name = "CabinNumber", required = true)
    protected String cabinNumber;
    @XmlAttribute(name = "MaxOccupancy")
    protected Integer maxOccupancy;
    @XmlAttribute(name = "DeclineIndicator")
    protected Boolean declineIndicator;
    @XmlAttribute(name = "HeldIndicator")
    protected Boolean heldIndicator;

    /**
     * Gets the value of the cabinConfiguration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cabinConfiguration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCabinConfiguration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CabinOptionType.CabinConfiguration }
     * 
     * 
     */
    public List<CabinOptionType.CabinConfiguration> getCabinConfiguration() {
        if (cabinConfiguration == null) {
            cabinConfiguration = new ArrayList<CabinOptionType.CabinConfiguration>();
        }
        return this.cabinConfiguration;
    }

    /**
     * Gets the value of the measurementInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measurementInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurementInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CabinOptionType.MeasurementInfo }
     * 
     * 
     */
    public List<CabinOptionType.MeasurementInfo> getMeasurementInfo() {
        if (measurementInfo == null) {
            measurementInfo = new ArrayList<CabinOptionType.MeasurementInfo>();
        }
        return this.measurementInfo;
    }

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link FreeTextType }
     *     
     */
    public FreeTextType getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeTextType }
     *     
     */
    public void setRemark(FreeTextType value) {
        this.remark = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the categoryLocation property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryLocationType }
     *     
     */
    public CategoryLocationType getCategoryLocation() {
        return categoryLocation;
    }

    /**
     * Sets the value of the categoryLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryLocationType }
     *     
     */
    public void setCategoryLocation(CategoryLocationType value) {
        this.categoryLocation = value;
    }

    /**
     * Gets the value of the shipSide property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipSide() {
        return shipSide;
    }

    /**
     * Sets the value of the shipSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipSide(String value) {
        this.shipSide = value;
    }

    /**
     * Gets the value of the positionInShip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionInShip() {
        return positionInShip;
    }

    /**
     * Sets the value of the positionInShip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionInShip(String value) {
        this.positionInShip = value;
    }

    /**
     * Gets the value of the bedType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBedType() {
        return bedType;
    }

    /**
     * Sets the value of the bedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBedType(String value) {
        this.bedType = value;
    }

    /**
     * Gets the value of the releaseDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReleaseDateTime() {
        return releaseDateTime;
    }

    /**
     * Sets the value of the releaseDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReleaseDateTime(XMLGregorianCalendar value) {
        this.releaseDateTime = value;
    }

    /**
     * Gets the value of the cabinCategoryStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinCategoryStatusCode() {
        return cabinCategoryStatusCode;
    }

    /**
     * Sets the value of the cabinCategoryStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinCategoryStatusCode(String value) {
        this.cabinCategoryStatusCode = value;
    }

    /**
     * Gets the value of the cabinCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinCategoryCode() {
        return cabinCategoryCode;
    }

    /**
     * Sets the value of the cabinCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinCategoryCode(String value) {
        this.cabinCategoryCode = value;
    }

    /**
     * Gets the value of the cabinRanking property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCabinRanking() {
        return cabinRanking;
    }

    /**
     * Sets the value of the cabinRanking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCabinRanking(Integer value) {
        this.cabinRanking = value;
    }

    /**
     * Gets the value of the connectingCabinIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConnectingCabinIndicator() {
        return connectingCabinIndicator;
    }

    /**
     * Sets the value of the connectingCabinIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConnectingCabinIndicator(Boolean value) {
        this.connectingCabinIndicator = value;
    }

    /**
     * Gets the value of the connectingCabinNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectingCabinNumber() {
        return connectingCabinNumber;
    }

    /**
     * Sets the value of the connectingCabinNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectingCabinNumber(String value) {
        this.connectingCabinNumber = value;
    }

    /**
     * Gets the value of the deckNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeckNumber() {
        return deckNumber;
    }

    /**
     * Sets the value of the deckNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeckNumber(String value) {
        this.deckNumber = value;
    }

    /**
     * Gets the value of the deckName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeckName() {
        return deckName;
    }

    /**
     * Sets the value of the deckName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeckName(String value) {
        this.deckName = value;
    }

    /**
     * Gets the value of the cabinNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinNumber() {
        return cabinNumber;
    }

    /**
     * Sets the value of the cabinNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinNumber(String value) {
        this.cabinNumber = value;
    }

    /**
     * Gets the value of the maxOccupancy property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxOccupancy() {
        return maxOccupancy;
    }

    /**
     * Sets the value of the maxOccupancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxOccupancy(Integer value) {
        this.maxOccupancy = value;
    }

    /**
     * Gets the value of the declineIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeclineIndicator() {
        return declineIndicator;
    }

    /**
     * Sets the value of the declineIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeclineIndicator(Boolean value) {
        this.declineIndicator = value;
    }

    /**
     * Gets the value of the heldIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHeldIndicator() {
        return heldIndicator;
    }

    /**
     * Sets the value of the heldIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHeldIndicator(Boolean value) {
        this.heldIndicator = value;
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
     *       &lt;attribute name="BedConfigurationCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CabinConfiguration {

        @XmlAttribute(name = "BedConfigurationCode")
        protected String bedConfigurationCode;

        /**
         * Gets the value of the bedConfigurationCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBedConfigurationCode() {
            return bedConfigurationCode;
        }

        /**
         * Sets the value of the bedConfigurationCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBedConfigurationCode(String value) {
            this.bedConfigurationCode = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OptionalCodeOptionalNameGroup"/>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitsOfMeasureGroup"/>
     *       &lt;attribute name="DimensionInfo" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MeasurementInfo {

        @XmlAttribute(name = "DimensionInfo")
        protected String dimensionInfo;
        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "Name")
        protected String name;
        @XmlAttribute(name = "UnitOfMeasureQuantity")
        protected BigDecimal unitOfMeasureQuantity;
        @XmlAttribute(name = "UnitOfMeasure")
        protected String unitOfMeasure;
        @XmlAttribute(name = "UnitOfMeasureCode")
        protected String unitOfMeasureCode;

        /**
         * Gets the value of the dimensionInfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDimensionInfo() {
            return dimensionInfo;
        }

        /**
         * Sets the value of the dimensionInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDimensionInfo(String value) {
            this.dimensionInfo = value;
        }

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the unitOfMeasureQuantity property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getUnitOfMeasureQuantity() {
            return unitOfMeasureQuantity;
        }

        /**
         * Sets the value of the unitOfMeasureQuantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setUnitOfMeasureQuantity(BigDecimal value) {
            this.unitOfMeasureQuantity = value;
        }

        /**
         * Gets the value of the unitOfMeasure property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitOfMeasure() {
            return unitOfMeasure;
        }

        /**
         * Sets the value of the unitOfMeasure property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitOfMeasure(String value) {
            this.unitOfMeasure = value;
        }

        /**
         * Gets the value of the unitOfMeasureCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitOfMeasureCode() {
            return unitOfMeasureCode;
        }

        /**
         * Sets the value of the unitOfMeasureCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitOfMeasureCode(String value) {
            this.unitOfMeasureCode = value;
        }

    }

}
