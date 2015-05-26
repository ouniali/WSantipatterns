
package com.travelport.schema.air_v18_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="Routing" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DirectionInfo" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="LocationCode" type="{http://www.travelport.com/schema/common_v15_0}typeIATACode" />
 *                           &lt;attribute name="Direction">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="To"/>
 *                                 &lt;enumeration value="From"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="RoutingConstructedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="RoutingRestriction" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "routing"
})
@XmlRootElement(name = "RoutingRules")
public class RoutingRules {

    @XmlElement(name = "Routing")
    protected List<RoutingRules.Routing> routing;

    /**
     * Gets the value of the routing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouting().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoutingRules.Routing }
     * 
     * 
     */
    public List<RoutingRules.Routing> getRouting() {
        if (routing == null) {
            routing = new ArrayList<RoutingRules.Routing>();
        }
        return this.routing;
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
     *         &lt;element name="DirectionInfo" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="LocationCode" type="{http://www.travelport.com/schema/common_v15_0}typeIATACode" />
     *                 &lt;attribute name="Direction">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="To"/>
     *                       &lt;enumeration value="From"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="RoutingConstructedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="RoutingRestriction" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "directionInfo"
    })
    public static class Routing {

        @XmlElement(name = "DirectionInfo")
        protected List<RoutingRules.Routing.DirectionInfo> directionInfo;
        @XmlAttribute(name = "RoutingConstructedInd")
        protected Boolean routingConstructedInd;
        @XmlAttribute(name = "Number")
        protected String number;
        @XmlAttribute(name = "RoutingRestriction")
        protected String routingRestriction;

        /**
         * Gets the value of the directionInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the directionInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDirectionInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RoutingRules.Routing.DirectionInfo }
         * 
         * 
         */
        public List<RoutingRules.Routing.DirectionInfo> getDirectionInfo() {
            if (directionInfo == null) {
                directionInfo = new ArrayList<RoutingRules.Routing.DirectionInfo>();
            }
            return this.directionInfo;
        }

        /**
         * Gets the value of the routingConstructedInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRoutingConstructedInd() {
            return routingConstructedInd;
        }

        /**
         * Sets the value of the routingConstructedInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRoutingConstructedInd(Boolean value) {
            this.routingConstructedInd = value;
        }

        /**
         * Gets the value of the number property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumber() {
            return number;
        }

        /**
         * Sets the value of the number property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumber(String value) {
            this.number = value;
        }

        /**
         * Gets the value of the routingRestriction property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoutingRestriction() {
            return routingRestriction;
        }

        /**
         * Sets the value of the routingRestriction property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoutingRestriction(String value) {
            this.routingRestriction = value;
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
         *       &lt;attribute name="LocationCode" type="{http://www.travelport.com/schema/common_v15_0}typeIATACode" />
         *       &lt;attribute name="Direction">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="To"/>
         *             &lt;enumeration value="From"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class DirectionInfo {

            @XmlAttribute(name = "LocationCode")
            protected String locationCode;
            @XmlAttribute(name = "Direction")
            protected String direction;

            /**
             * Gets the value of the locationCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLocationCode() {
                return locationCode;
            }

            /**
             * Sets the value of the locationCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLocationCode(String value) {
                this.locationCode = value;
            }

            /**
             * Gets the value of the direction property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDirection() {
                return direction;
            }

            /**
             * Sets the value of the direction property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDirection(String value) {
                this.direction = value;
            }

        }

    }

}
