
package com.conducivetech.cache.flighthistory.api_internal.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for scheduleDataV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="scheduleDataV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flightType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceClasses" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="restrictions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uplines" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="upline" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}uplineFlightV2" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="downlines" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="downline" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}downlineFlightV2" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "scheduleDataV2", propOrder = {
    "flightType",
    "serviceClasses",
    "restrictions",
    "uplines",
    "downlines"
})
public class ScheduleDataV2 {

    protected String flightType;
    protected String serviceClasses;
    protected String restrictions;
    protected ScheduleDataV2 .Uplines uplines;
    protected ScheduleDataV2 .Downlines downlines;

    /**
     * Gets the value of the flightType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightType() {
        return flightType;
    }

    /**
     * Sets the value of the flightType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightType(String value) {
        this.flightType = value;
    }

    /**
     * Gets the value of the serviceClasses property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceClasses() {
        return serviceClasses;
    }

    /**
     * Sets the value of the serviceClasses property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceClasses(String value) {
        this.serviceClasses = value;
    }

    /**
     * Gets the value of the restrictions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestrictions() {
        return restrictions;
    }

    /**
     * Sets the value of the restrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestrictions(String value) {
        this.restrictions = value;
    }

    /**
     * Gets the value of the uplines property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleDataV2 .Uplines }
     *     
     */
    public ScheduleDataV2 .Uplines getUplines() {
        return uplines;
    }

    /**
     * Sets the value of the uplines property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleDataV2 .Uplines }
     *     
     */
    public void setUplines(ScheduleDataV2 .Uplines value) {
        this.uplines = value;
    }

    /**
     * Gets the value of the downlines property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleDataV2 .Downlines }
     *     
     */
    public ScheduleDataV2 .Downlines getDownlines() {
        return downlines;
    }

    /**
     * Sets the value of the downlines property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleDataV2 .Downlines }
     *     
     */
    public void setDownlines(ScheduleDataV2 .Downlines value) {
        this.downlines = value;
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
     *         &lt;element name="downline" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}downlineFlightV2" maxOccurs="unbounded" minOccurs="0"/>
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
        "downline"
    })
    public static class Downlines {

        protected List<DownlineFlightV2> downline;

        /**
         * Gets the value of the downline property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the downline property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDownline().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DownlineFlightV2 }
         * 
         * 
         */
        public List<DownlineFlightV2> getDownline() {
            if (downline == null) {
                downline = new ArrayList<DownlineFlightV2>();
            }
            return this.downline;
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
     *         &lt;element name="upline" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}uplineFlightV2" maxOccurs="unbounded" minOccurs="0"/>
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
        "upline"
    })
    public static class Uplines {

        protected List<UplineFlightV2> upline;

        /**
         * Gets the value of the upline property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the upline property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUpline().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UplineFlightV2 }
         * 
         * 
         */
        public List<UplineFlightV2> getUpline() {
            if (upline == null) {
                upline = new ArrayList<UplineFlightV2>();
            }
            return this.upline;
        }

    }

}
