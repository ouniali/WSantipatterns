
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getReportDetailsResponseItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getReportDetailsResponseItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returnCode" type="{http://ws.gdsp.vodafone.com/}returnCode"/>
 *         &lt;element name="reportDetails" type="{http://ws.gdsp.vodafone.com/}tReportDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getReportDetailsResponseItem", propOrder = {
    "returnCode",
    "reportDetails"
})
public class GetReportDetailsResponseItem {

    @XmlElement(required = true)
    protected ReturnCode returnCode;
    protected TReportDetails reportDetails;

    /**
     * Gets the value of the returnCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnCode }
     *     
     */
    public ReturnCode getReturnCode() {
        return returnCode;
    }

    /**
     * Sets the value of the returnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnCode }
     *     
     */
    public void setReturnCode(ReturnCode value) {
        this.returnCode = value;
    }

    /**
     * Gets the value of the reportDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TReportDetails }
     *     
     */
    public TReportDetails getReportDetails() {
        return reportDetails;
    }

    /**
     * Sets the value of the reportDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TReportDetails }
     *     
     */
    public void setReportDetails(TReportDetails value) {
        this.reportDetails = value;
    }

}
