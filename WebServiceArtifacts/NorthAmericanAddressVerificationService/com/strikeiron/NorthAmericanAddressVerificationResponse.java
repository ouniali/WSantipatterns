
package com.strikeiron;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="NorthAmericanAddressVerificationResult" type="{http://www.strikeiron.com}SIWsOutputOfNorthAmericanAddress" minOccurs="0"/>
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
    "northAmericanAddressVerificationResult"
})
@XmlRootElement(name = "NorthAmericanAddressVerificationResponse")
public class NorthAmericanAddressVerificationResponse {

    @XmlElement(name = "NorthAmericanAddressVerificationResult")
    protected SIWsOutputOfNorthAmericanAddress northAmericanAddressVerificationResult;

    /**
     * Gets the value of the northAmericanAddressVerificationResult property.
     * 
     * @return
     *     possible object is
     *     {@link SIWsOutputOfNorthAmericanAddress }
     *     
     */
    public SIWsOutputOfNorthAmericanAddress getNorthAmericanAddressVerificationResult() {
        return northAmericanAddressVerificationResult;
    }

    /**
     * Sets the value of the northAmericanAddressVerificationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIWsOutputOfNorthAmericanAddress }
     *     
     */
    public void setNorthAmericanAddressVerificationResult(SIWsOutputOfNorthAmericanAddress value) {
        this.northAmericanAddressVerificationResult = value;
    }

}
