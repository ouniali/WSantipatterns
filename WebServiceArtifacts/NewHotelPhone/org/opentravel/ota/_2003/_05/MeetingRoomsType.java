
package org.opentravel.ota._2003._05;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeetingRoomsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeetingRoomsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MeetingRoom" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Codes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfMeetingRoomCodeType" minOccurs="0"/>
 *                   &lt;element name="Dimension" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Area" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="Height" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="Length" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="Width" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="Units" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="UnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AvailableCapacities" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfMeetingRoomCapacityType" minOccurs="0"/>
 *                   &lt;element name="Features" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfFeaturesTypeFeature" minOccurs="0"/>
 *                   &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Irregular" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="PropertySystemName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="RoomName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="MeetingRoomCapacity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Access" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="MeetingRoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="MeetingRoomLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="DedicatedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="FeaturedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="MeetingRoomCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="SmallestRoomSpace" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="LargestRoomSpace" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="UnitOfMeasureQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="UnitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="UnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TotalRoomSpace" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="LargestSeatingCapacity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="SecondLargestSeatingCapacity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="SmallestSeatingCapacity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="TotalRoomSeatingCapacity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="LargestRoomHeight" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="TotalExhibitSpace" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingRoomsType", propOrder = {
    "meetingRoom"
})
public class MeetingRoomsType {

    @XmlElement(name = "MeetingRoom")
    protected List<MeetingRoomsType.MeetingRoom> meetingRoom;
    @XmlAttribute(name = "MeetingRoomCount")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger meetingRoomCount;
    @XmlAttribute(name = "SmallestRoomSpace")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger smallestRoomSpace;
    @XmlAttribute(name = "LargestRoomSpace")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger largestRoomSpace;
    @XmlAttribute(name = "UnitOfMeasureQuantity")
    protected BigDecimal unitOfMeasureQuantity;
    @XmlAttribute(name = "UnitOfMeasure")
    protected String unitOfMeasure;
    @XmlAttribute(name = "UnitOfMeasureCode")
    protected String unitOfMeasureCode;
    @XmlAttribute(name = "TotalRoomSpace")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalRoomSpace;
    @XmlAttribute(name = "LargestSeatingCapacity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger largestSeatingCapacity;
    @XmlAttribute(name = "SecondLargestSeatingCapacity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger secondLargestSeatingCapacity;
    @XmlAttribute(name = "SmallestSeatingCapacity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger smallestSeatingCapacity;
    @XmlAttribute(name = "TotalRoomSeatingCapacity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalRoomSeatingCapacity;
    @XmlAttribute(name = "LargestRoomHeight")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger largestRoomHeight;
    @XmlAttribute(name = "TotalExhibitSpace")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalExhibitSpace;

    /**
     * Gets the value of the meetingRoom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meetingRoom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeetingRoom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeetingRoomsType.MeetingRoom }
     * 
     * 
     */
    public List<MeetingRoomsType.MeetingRoom> getMeetingRoom() {
        if (meetingRoom == null) {
            meetingRoom = new ArrayList<MeetingRoomsType.MeetingRoom>();
        }
        return this.meetingRoom;
    }

    /**
     * Gets the value of the meetingRoomCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMeetingRoomCount() {
        return meetingRoomCount;
    }

    /**
     * Sets the value of the meetingRoomCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMeetingRoomCount(BigInteger value) {
        this.meetingRoomCount = value;
    }

    /**
     * Gets the value of the smallestRoomSpace property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSmallestRoomSpace() {
        return smallestRoomSpace;
    }

    /**
     * Sets the value of the smallestRoomSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSmallestRoomSpace(BigInteger value) {
        this.smallestRoomSpace = value;
    }

    /**
     * Gets the value of the largestRoomSpace property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLargestRoomSpace() {
        return largestRoomSpace;
    }

    /**
     * Sets the value of the largestRoomSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLargestRoomSpace(BigInteger value) {
        this.largestRoomSpace = value;
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

    /**
     * Gets the value of the totalRoomSpace property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalRoomSpace() {
        return totalRoomSpace;
    }

    /**
     * Sets the value of the totalRoomSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalRoomSpace(BigInteger value) {
        this.totalRoomSpace = value;
    }

    /**
     * Gets the value of the largestSeatingCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLargestSeatingCapacity() {
        return largestSeatingCapacity;
    }

    /**
     * Sets the value of the largestSeatingCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLargestSeatingCapacity(BigInteger value) {
        this.largestSeatingCapacity = value;
    }

    /**
     * Gets the value of the secondLargestSeatingCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSecondLargestSeatingCapacity() {
        return secondLargestSeatingCapacity;
    }

    /**
     * Sets the value of the secondLargestSeatingCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSecondLargestSeatingCapacity(BigInteger value) {
        this.secondLargestSeatingCapacity = value;
    }

    /**
     * Gets the value of the smallestSeatingCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSmallestSeatingCapacity() {
        return smallestSeatingCapacity;
    }

    /**
     * Sets the value of the smallestSeatingCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSmallestSeatingCapacity(BigInteger value) {
        this.smallestSeatingCapacity = value;
    }

    /**
     * Gets the value of the totalRoomSeatingCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalRoomSeatingCapacity() {
        return totalRoomSeatingCapacity;
    }

    /**
     * Sets the value of the totalRoomSeatingCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalRoomSeatingCapacity(BigInteger value) {
        this.totalRoomSeatingCapacity = value;
    }

    /**
     * Gets the value of the largestRoomHeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLargestRoomHeight() {
        return largestRoomHeight;
    }

    /**
     * Sets the value of the largestRoomHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLargestRoomHeight(BigInteger value) {
        this.largestRoomHeight = value;
    }

    /**
     * Gets the value of the totalExhibitSpace property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalExhibitSpace() {
        return totalExhibitSpace;
    }

    /**
     * Sets the value of the totalExhibitSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalExhibitSpace(BigInteger value) {
        this.totalExhibitSpace = value;
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
     *         &lt;element name="Codes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfMeetingRoomCodeType" minOccurs="0"/>
     *         &lt;element name="Dimension" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Area" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="Height" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="Length" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="Width" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="Units" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="UnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AvailableCapacities" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfMeetingRoomCapacityType" minOccurs="0"/>
     *         &lt;element name="Features" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfFeaturesTypeFeature" minOccurs="0"/>
     *         &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Irregular" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="PropertySystemName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="RoomName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="MeetingRoomCapacity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Access" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="MeetingRoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="MeetingRoomLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="DedicatedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="FeaturedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "codes",
        "dimension",
        "availableCapacities",
        "features",
        "multimediaDescriptions"
    })
    public static class MeetingRoom {

        @XmlElement(name = "Codes")
        protected ArrayOfMeetingRoomCodeType codes;
        @XmlElement(name = "Dimension")
        protected MeetingRoomsType.MeetingRoom.Dimension dimension;
        @XmlElement(name = "AvailableCapacities")
        protected ArrayOfMeetingRoomCapacityType availableCapacities;
        @XmlElement(name = "Features")
        protected ArrayOfFeaturesTypeFeature features;
        @XmlElement(name = "MultimediaDescriptions")
        protected MultimediaDescriptionsType multimediaDescriptions;
        @XmlAttribute(name = "Irregular")
        protected Boolean irregular;
        @XmlAttribute(name = "PropertySystemName")
        protected String propertySystemName;
        @XmlAttribute(name = "RoomName")
        protected String roomName;
        @XmlAttribute(name = "Sort")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger sort;
        @XmlAttribute(name = "MeetingRoomCapacity")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger meetingRoomCapacity;
        @XmlAttribute(name = "Removal")
        protected Boolean removal;
        @XmlAttribute(name = "ID")
        protected String id;
        @XmlAttribute(name = "Access")
        protected String access;
        @XmlAttribute(name = "MeetingRoomTypeCode")
        protected String meetingRoomTypeCode;
        @XmlAttribute(name = "MeetingRoomLevel")
        protected String meetingRoomLevel;
        @XmlAttribute(name = "DedicatedIndicator")
        protected Boolean dedicatedIndicator;
        @XmlAttribute(name = "FeaturedInd")
        protected Boolean featuredInd;

        /**
         * Gets the value of the codes property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfMeetingRoomCodeType }
         *     
         */
        public ArrayOfMeetingRoomCodeType getCodes() {
            return codes;
        }

        /**
         * Sets the value of the codes property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfMeetingRoomCodeType }
         *     
         */
        public void setCodes(ArrayOfMeetingRoomCodeType value) {
            this.codes = value;
        }

        /**
         * Gets the value of the dimension property.
         * 
         * @return
         *     possible object is
         *     {@link MeetingRoomsType.MeetingRoom.Dimension }
         *     
         */
        public MeetingRoomsType.MeetingRoom.Dimension getDimension() {
            return dimension;
        }

        /**
         * Sets the value of the dimension property.
         * 
         * @param value
         *     allowed object is
         *     {@link MeetingRoomsType.MeetingRoom.Dimension }
         *     
         */
        public void setDimension(MeetingRoomsType.MeetingRoom.Dimension value) {
            this.dimension = value;
        }

        /**
         * Gets the value of the availableCapacities property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfMeetingRoomCapacityType }
         *     
         */
        public ArrayOfMeetingRoomCapacityType getAvailableCapacities() {
            return availableCapacities;
        }

        /**
         * Sets the value of the availableCapacities property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfMeetingRoomCapacityType }
         *     
         */
        public void setAvailableCapacities(ArrayOfMeetingRoomCapacityType value) {
            this.availableCapacities = value;
        }

        /**
         * Gets the value of the features property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfFeaturesTypeFeature }
         *     
         */
        public ArrayOfFeaturesTypeFeature getFeatures() {
            return features;
        }

        /**
         * Sets the value of the features property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfFeaturesTypeFeature }
         *     
         */
        public void setFeatures(ArrayOfFeaturesTypeFeature value) {
            this.features = value;
        }

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
         * Gets the value of the irregular property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIrregular() {
            return irregular;
        }

        /**
         * Sets the value of the irregular property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIrregular(Boolean value) {
            this.irregular = value;
        }

        /**
         * Gets the value of the propertySystemName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPropertySystemName() {
            return propertySystemName;
        }

        /**
         * Sets the value of the propertySystemName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPropertySystemName(String value) {
            this.propertySystemName = value;
        }

        /**
         * Gets the value of the roomName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoomName() {
            return roomName;
        }

        /**
         * Sets the value of the roomName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoomName(String value) {
            this.roomName = value;
        }

        /**
         * Gets the value of the sort property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSort() {
            return sort;
        }

        /**
         * Sets the value of the sort property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSort(BigInteger value) {
            this.sort = value;
        }

        /**
         * Gets the value of the meetingRoomCapacity property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMeetingRoomCapacity() {
            return meetingRoomCapacity;
        }

        /**
         * Sets the value of the meetingRoomCapacity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMeetingRoomCapacity(BigInteger value) {
            this.meetingRoomCapacity = value;
        }

        /**
         * Gets the value of the removal property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRemoval() {
            return removal;
        }

        /**
         * Sets the value of the removal property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRemoval(Boolean value) {
            this.removal = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setID(String value) {
            this.id = value;
        }

        /**
         * Gets the value of the access property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccess() {
            return access;
        }

        /**
         * Sets the value of the access property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccess(String value) {
            this.access = value;
        }

        /**
         * Gets the value of the meetingRoomTypeCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMeetingRoomTypeCode() {
            return meetingRoomTypeCode;
        }

        /**
         * Sets the value of the meetingRoomTypeCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMeetingRoomTypeCode(String value) {
            this.meetingRoomTypeCode = value;
        }

        /**
         * Gets the value of the meetingRoomLevel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMeetingRoomLevel() {
            return meetingRoomLevel;
        }

        /**
         * Sets the value of the meetingRoomLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMeetingRoomLevel(String value) {
            this.meetingRoomLevel = value;
        }

        /**
         * Gets the value of the dedicatedIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDedicatedIndicator() {
            return dedicatedIndicator;
        }

        /**
         * Sets the value of the dedicatedIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDedicatedIndicator(Boolean value) {
            this.dedicatedIndicator = value;
        }

        /**
         * Gets the value of the featuredInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFeaturedInd() {
            return featuredInd;
        }

        /**
         * Sets the value of the featuredInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFeaturedInd(Boolean value) {
            this.featuredInd = value;
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
         *       &lt;attribute name="Area" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="Height" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="Length" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="Width" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="Units" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="UnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Dimension {

            @XmlAttribute(name = "Area")
            protected BigDecimal area;
            @XmlAttribute(name = "Height")
            protected BigDecimal height;
            @XmlAttribute(name = "Length")
            protected BigDecimal length;
            @XmlAttribute(name = "Width")
            protected BigDecimal width;
            @XmlAttribute(name = "Units")
            protected String units;
            @XmlAttribute(name = "UnitOfMeasureCode")
            protected String unitOfMeasureCode;

            /**
             * Gets the value of the area property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getArea() {
                return area;
            }

            /**
             * Sets the value of the area property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setArea(BigDecimal value) {
                this.area = value;
            }

            /**
             * Gets the value of the height property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getHeight() {
                return height;
            }

            /**
             * Sets the value of the height property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setHeight(BigDecimal value) {
                this.height = value;
            }

            /**
             * Gets the value of the length property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getLength() {
                return length;
            }

            /**
             * Sets the value of the length property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setLength(BigDecimal value) {
                this.length = value;
            }

            /**
             * Gets the value of the width property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getWidth() {
                return width;
            }

            /**
             * Sets the value of the width property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setWidth(BigDecimal value) {
                this.width = value;
            }

            /**
             * Gets the value of the units property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnits() {
                return units;
            }

            /**
             * Sets the value of the units property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnits(String value) {
                this.units = value;
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

}
