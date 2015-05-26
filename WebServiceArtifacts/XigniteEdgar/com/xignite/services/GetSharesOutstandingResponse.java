
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
 *         &lt;element name="GetSharesOutstandingResult" type="{http://www.xignite.com/services/}SharesOutstanding" minOccurs="0"/>
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
    "getSharesOutstandingResult"
})
@XmlRootElement(name = "GetSharesOutstandingResponse")
public class GetSharesOutstandingResponse {

    @XmlElement(name = "GetSharesOutstandingResult")
    protected SharesOutstanding getSharesOutstandingResult;

    /**
     * Gets the value of the getSharesOutstandingResult property.
     * 
     * @return
     *     possible object is
     *     {@link SharesOutstanding }
     *     
     */
    public SharesOutstanding getGetSharesOutstandingResult() {
        return getSharesOutstandingResult;
    }

    /**
     * Sets the value of the getSharesOutstandingResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SharesOutstanding }
     *     
     */
    public void setGetSharesOutstandingResult(SharesOutstanding value) {
        this.getSharesOutstandingResult = value;
    }

}
