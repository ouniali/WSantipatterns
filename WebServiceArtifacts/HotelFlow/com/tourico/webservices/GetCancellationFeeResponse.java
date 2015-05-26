
package com.tourico.webservices;

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
 *         &lt;element name="GetCancellationFeeResult" type="{http://tourico.com/webservices/}CancellationFeeInfo" minOccurs="0"/>
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
    "getCancellationFeeResult"
})
@XmlRootElement(name = "GetCancellationFeeResponse")
public class GetCancellationFeeResponse {

    @XmlElement(name = "GetCancellationFeeResult")
    protected CancellationFeeInfo getCancellationFeeResult;

    /**
     * Gets the value of the getCancellationFeeResult property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationFeeInfo }
     *     
     */
    public CancellationFeeInfo getGetCancellationFeeResult() {
        return getCancellationFeeResult;
    }

    /**
     * Sets the value of the getCancellationFeeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationFeeInfo }
     *     
     */
    public void setGetCancellationFeeResult(CancellationFeeInfo value) {
        this.getCancellationFeeResult = value;
    }

}
