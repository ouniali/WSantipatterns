
package com.conducivetech.cache.delayindex.service.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestAirports complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestAirports">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v1.service.delayindex.cache.conducivetech.com/}requestFiltered">
 *       &lt;sequence>
 *         &lt;element name="airportCodes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="airportCode" type="{http://v1.service.delayindex.cache.conducivetech.com/}requestedAirportV1" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="codeType" type="{http://v1.service.delayindex.cache.conducivetech.com/}requestedString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestAirports", propOrder = {
    "airportCodes",
    "codeType"
})
public class RequestAirports
    extends RequestFiltered
{

    protected RequestAirports.AirportCodes airportCodes;
    protected RequestedString codeType;

    /**
     * Gets the value of the airportCodes property.
     * 
     * @return
     *     possible object is
     *     {@link RequestAirports.AirportCodes }
     *     
     */
    public RequestAirports.AirportCodes getAirportCodes() {
        return airportCodes;
    }

    /**
     * Sets the value of the airportCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestAirports.AirportCodes }
     *     
     */
    public void setAirportCodes(RequestAirports.AirportCodes value) {
        this.airportCodes = value;
    }

    /**
     * Gets the value of the codeType property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedString }
     *     
     */
    public RequestedString getCodeType() {
        return codeType;
    }

    /**
     * Sets the value of the codeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedString }
     *     
     */
    public void setCodeType(RequestedString value) {
        this.codeType = value;
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
     *         &lt;element name="airportCode" type="{http://v1.service.delayindex.cache.conducivetech.com/}requestedAirportV1" maxOccurs="unbounded" minOccurs="0"/>
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
        "airportCode"
    })
    public static class AirportCodes {

        protected List<RequestedAirportV1> airportCode;

        /**
         * Gets the value of the airportCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the airportCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAirportCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RequestedAirportV1 }
         * 
         * 
         */
        public List<RequestedAirportV1> getAirportCode() {
            if (airportCode == null) {
                airportCode = new ArrayList<RequestedAirportV1>();
            }
            return this.airportCode;
        }

    }

}
