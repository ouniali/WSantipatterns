
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
 *         &lt;element name="NorthAmericanAddressVerificationBatchResult" type="{http://www.strikeiron.com}SIWsOutputOfSIWsResultArrayOfNorthAmericanAddressWithStatus" minOccurs="0"/>
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
    "northAmericanAddressVerificationBatchResult"
})
@XmlRootElement(name = "NorthAmericanAddressVerificationBatchResponse")
public class NorthAmericanAddressVerificationBatchResponse {

    @XmlElement(name = "NorthAmericanAddressVerificationBatchResult")
    protected SIWsOutputOfSIWsResultArrayOfNorthAmericanAddressWithStatus northAmericanAddressVerificationBatchResult;

    /**
     * Gets the value of the northAmericanAddressVerificationBatchResult property.
     * 
     * @return
     *     possible object is
     *     {@link SIWsOutputOfSIWsResultArrayOfNorthAmericanAddressWithStatus }
     *     
     */
    public SIWsOutputOfSIWsResultArrayOfNorthAmericanAddressWithStatus getNorthAmericanAddressVerificationBatchResult() {
        return northAmericanAddressVerificationBatchResult;
    }

    /**
     * Sets the value of the northAmericanAddressVerificationBatchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIWsOutputOfSIWsResultArrayOfNorthAmericanAddressWithStatus }
     *     
     */
    public void setNorthAmericanAddressVerificationBatchResult(SIWsOutputOfSIWsResultArrayOfNorthAmericanAddressWithStatus value) {
        this.northAmericanAddressVerificationBatchResult = value;
    }

}
