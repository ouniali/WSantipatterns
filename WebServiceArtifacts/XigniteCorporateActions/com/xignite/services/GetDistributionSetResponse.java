
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
 *         &lt;element name="GetDistributionSetResult" type="{http://www.xignite.com/services/}DistributionSet" minOccurs="0"/>
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
    "getDistributionSetResult"
})
@XmlRootElement(name = "GetDistributionSetResponse")
public class GetDistributionSetResponse {

    @XmlElement(name = "GetDistributionSetResult")
    protected DistributionSet getDistributionSetResult;

    /**
     * Gets the value of the getDistributionSetResult property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionSet }
     *     
     */
    public DistributionSet getGetDistributionSetResult() {
        return getDistributionSetResult;
    }

    /**
     * Sets the value of the getDistributionSetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionSet }
     *     
     */
    public void setGetDistributionSetResult(DistributionSet value) {
        this.getDistributionSetResult = value;
    }

}
