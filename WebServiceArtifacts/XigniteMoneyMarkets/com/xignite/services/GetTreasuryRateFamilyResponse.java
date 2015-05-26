
package com.xignite.services;

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
 *         &lt;element name="GetTreasuryRateFamilyResult" type="{http://www.xignite.com/services/}ArrayOfInterestRate" minOccurs="0"/>
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
    "getTreasuryRateFamilyResult"
})
@XmlRootElement(name = "GetTreasuryRateFamilyResponse")
public class GetTreasuryRateFamilyResponse {

    @XmlElement(name = "GetTreasuryRateFamilyResult")
    protected ArrayOfInterestRate getTreasuryRateFamilyResult;

    /**
     * Gets the value of the getTreasuryRateFamilyResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInterestRate }
     *     
     */
    public ArrayOfInterestRate getGetTreasuryRateFamilyResult() {
        return getTreasuryRateFamilyResult;
    }

    /**
     * Sets the value of the getTreasuryRateFamilyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInterestRate }
     *     
     */
    public void setGetTreasuryRateFamilyResult(ArrayOfInterestRate value) {
        this.getTreasuryRateFamilyResult = value;
    }

}
