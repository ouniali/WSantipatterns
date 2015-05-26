
package travel.whl.api.soap;

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
 * Defines well-known locations and attractions of local interest in the geographical area of the hotel facility as well as other area hotels.
 * 
 * <p>Java class for AreaInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AreaInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Attractions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Attraction" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://api.whl.travel/soap}ID_OptionalGroup"/>
 *                           &lt;attGroup ref="{http://api.whl.travel/soap}PositionGroup"/>
 *                           &lt;attribute name="AttractionName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                           &lt;attribute name="Distance" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Recreations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Recreation" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://api.whl.travel/soap}ID_OptionalGroup"/>
 *                           &lt;attribute name="Name" type="{http://api.whl.travel/soap}StringLength0to64" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AreaInfoType", propOrder = {
    "attractions",
    "recreations"
})
public class AreaInfoType {

    @XmlElement(name = "Attractions")
    protected AreaInfoType.Attractions attractions;
    @XmlElement(name = "Recreations")
    protected AreaInfoType.Recreations recreations;

    /**
     * Gets the value of the attractions property.
     * 
     * @return
     *     possible object is
     *     {@link AreaInfoType.Attractions }
     *     
     */
    public AreaInfoType.Attractions getAttractions() {
        return attractions;
    }

    /**
     * Sets the value of the attractions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaInfoType.Attractions }
     *     
     */
    public void setAttractions(AreaInfoType.Attractions value) {
        this.attractions = value;
    }

    /**
     * Gets the value of the recreations property.
     * 
     * @return
     *     possible object is
     *     {@link AreaInfoType.Recreations }
     *     
     */
    public AreaInfoType.Recreations getRecreations() {
        return recreations;
    }

    /**
     * Sets the value of the recreations property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaInfoType.Recreations }
     *     
     */
    public void setRecreations(AreaInfoType.Recreations value) {
        this.recreations = value;
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
     *         &lt;element name="Attraction" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{http://api.whl.travel/soap}ID_OptionalGroup"/>
     *                 &lt;attGroup ref="{http://api.whl.travel/soap}PositionGroup"/>
     *                 &lt;attribute name="AttractionName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                 &lt;attribute name="Distance" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "attraction"
    })
    public static class Attractions {

        @XmlElement(name = "Attraction", required = true)
        protected List<AreaInfoType.Attractions.Attraction> attraction;

        /**
         * Gets the value of the attraction property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the attraction property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAttraction().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AreaInfoType.Attractions.Attraction }
         * 
         * 
         */
        public List<AreaInfoType.Attractions.Attraction> getAttraction() {
            if (attraction == null) {
                attraction = new ArrayList<AreaInfoType.Attractions.Attraction>();
            }
            return this.attraction;
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
         *         &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attGroup ref="{http://api.whl.travel/soap}ID_OptionalGroup"/>
         *       &lt;attGroup ref="{http://api.whl.travel/soap}PositionGroup"/>
         *       &lt;attribute name="AttractionName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *       &lt;attribute name="Distance" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "descriptiveText"
        })
        public static class Attraction {

            @XmlElement(name = "DescriptiveText")
            protected String descriptiveText;
            @XmlAttribute(name = "AttractionName")
            protected String attractionName;
            @XmlAttribute(name = "Sort")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger sort;
            @XmlAttribute(name = "Distance")
            protected String distance;
            @XmlAttribute(name = "ID")
            protected String id;
            @XmlAttribute(name = "Latitude")
            protected String latitude;
            @XmlAttribute(name = "Longitude")
            protected String longitude;
            @XmlAttribute(name = "Altitude")
            protected String altitude;
            @XmlAttribute(name = "AltitudeUnitOfMeasureCode")
            protected String altitudeUnitOfMeasureCode;
            @XmlAttribute(name = "PositionAccuracy")
            protected String positionAccuracy;

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
             * Gets the value of the attractionName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttractionName() {
                return attractionName;
            }

            /**
             * Sets the value of the attractionName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttractionName(String value) {
                this.attractionName = value;
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
             * Gets the value of the distance property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDistance() {
                return distance;
            }

            /**
             * Sets the value of the distance property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDistance(String value) {
                this.distance = value;
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

            /**
             * Gets the value of the positionAccuracy property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPositionAccuracy() {
                return positionAccuracy;
            }

            /**
             * Sets the value of the positionAccuracy property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPositionAccuracy(String value) {
                this.positionAccuracy = value;
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
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Recreation" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://api.whl.travel/soap}ID_OptionalGroup"/>
     *                 &lt;attribute name="Name" type="{http://api.whl.travel/soap}StringLength0to64" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "recreation"
    })
    public static class Recreations {

        @XmlElement(name = "Recreation", required = true)
        protected List<AreaInfoType.Recreations.Recreation> recreation;

        /**
         * Gets the value of the recreation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the recreation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRecreation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AreaInfoType.Recreations.Recreation }
         * 
         * 
         */
        public List<AreaInfoType.Recreations.Recreation> getRecreation() {
            if (recreation == null) {
                recreation = new ArrayList<AreaInfoType.Recreations.Recreation>();
            }
            return this.recreation;
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
         *       &lt;attGroup ref="{http://api.whl.travel/soap}ID_OptionalGroup"/>
         *       &lt;attribute name="Name" type="{http://api.whl.travel/soap}StringLength0to64" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Recreation {

            @XmlAttribute(name = "Name")
            protected String name;
            @XmlAttribute(name = "ID")
            protected String id;

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

        }

    }

}
