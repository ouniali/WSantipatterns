
package com.flightstats.schedules.service.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for operatorV1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="operatorV1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carrierFsCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="flightNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceClasses" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="serviceClass" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="trafficRestrictions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="trafficRestrictions" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
@XmlType(name = "operatorV1", propOrder = {
    "carrierFsCode",
    "flightNumber",
    "serviceType",
    "serviceClasses",
    "trafficRestrictions"
})
public class OperatorV1 {

    @XmlElement(required = true)
    protected String carrierFsCode;
    @XmlElement(required = true)
    protected String flightNumber;
    protected String serviceType;
    protected OperatorV1 .ServiceClasses serviceClasses;
    protected OperatorV1 .TrafficRestrictions trafficRestrictions;

    /**
     * Gets the value of the carrierFsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierFsCode() {
        return carrierFsCode;
    }

    /**
     * Sets the value of the carrierFsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierFsCode(String value) {
        this.carrierFsCode = value;
    }

    /**
     * Gets the value of the flightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Sets the value of the flightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumber(String value) {
        this.flightNumber = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the serviceClasses property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorV1 .ServiceClasses }
     *     
     */
    public OperatorV1 .ServiceClasses getServiceClasses() {
        return serviceClasses;
    }

    /**
     * Sets the value of the serviceClasses property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorV1 .ServiceClasses }
     *     
     */
    public void setServiceClasses(OperatorV1 .ServiceClasses value) {
        this.serviceClasses = value;
    }

    /**
     * Gets the value of the trafficRestrictions property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorV1 .TrafficRestrictions }
     *     
     */
    public OperatorV1 .TrafficRestrictions getTrafficRestrictions() {
        return trafficRestrictions;
    }

    /**
     * Sets the value of the trafficRestrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorV1 .TrafficRestrictions }
     *     
     */
    public void setTrafficRestrictions(OperatorV1 .TrafficRestrictions value) {
        this.trafficRestrictions = value;
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
     *         &lt;element name="serviceClass" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
        "serviceClass"
    })
    public static class ServiceClasses {

        @XmlElement(required = true)
        protected List<String> serviceClass;

        /**
         * Gets the value of the serviceClass property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceClass property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServiceClass().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getServiceClass() {
            if (serviceClass == null) {
                serviceClass = new ArrayList<String>();
            }
            return this.serviceClass;
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
     *         &lt;element name="trafficRestrictions" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
        "trafficRestrictions"
    })
    public static class TrafficRestrictions {

        @XmlElement(required = true)
        protected List<String> trafficRestrictions;

        /**
         * Gets the value of the trafficRestrictions property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the trafficRestrictions property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTrafficRestrictions().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getTrafficRestrictions() {
            if (trafficRestrictions == null) {
                trafficRestrictions = new ArrayList<String>();
            }
            return this.trafficRestrictions;
        }

    }

}
