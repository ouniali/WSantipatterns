
package com.travelport.schema.air_v18_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="CarrierCode" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeCarrier" />
 *       &lt;attribute name="StartFlightNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="EndFlightNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "CarrierDetail")
public class CarrierDetail {

    @XmlAttribute(name = "CarrierCode", required = true)
    protected String carrierCode;
    @XmlAttribute(name = "StartFlightNumber")
    protected BigInteger startFlightNumber;
    @XmlAttribute(name = "EndFlightNumber")
    protected BigInteger endFlightNumber;

    /**
     * Gets the value of the carrierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierCode() {
        return carrierCode;
    }

    /**
     * Sets the value of the carrierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierCode(String value) {
        this.carrierCode = value;
    }

    /**
     * Gets the value of the startFlightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartFlightNumber() {
        return startFlightNumber;
    }

    /**
     * Sets the value of the startFlightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartFlightNumber(BigInteger value) {
        this.startFlightNumber = value;
    }

    /**
     * Gets the value of the endFlightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEndFlightNumber() {
        return endFlightNumber;
    }

    /**
     * Sets the value of the endFlightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEndFlightNumber(BigInteger value) {
        this.endFlightNumber = value;
    }

}
