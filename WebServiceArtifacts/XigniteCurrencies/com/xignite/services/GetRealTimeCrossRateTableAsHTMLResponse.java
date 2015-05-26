
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
 *         &lt;element name="GetRealTimeCrossRateTableAsHTMLResult" type="{http://www.xignite.com/services/}HTMLCrossRateTable" minOccurs="0"/>
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
    "getRealTimeCrossRateTableAsHTMLResult"
})
@XmlRootElement(name = "GetRealTimeCrossRateTableAsHTMLResponse")
public class GetRealTimeCrossRateTableAsHTMLResponse {

    @XmlElement(name = "GetRealTimeCrossRateTableAsHTMLResult")
    protected HTMLCrossRateTable getRealTimeCrossRateTableAsHTMLResult;

    /**
     * Gets the value of the getRealTimeCrossRateTableAsHTMLResult property.
     * 
     * @return
     *     possible object is
     *     {@link HTMLCrossRateTable }
     *     
     */
    public HTMLCrossRateTable getGetRealTimeCrossRateTableAsHTMLResult() {
        return getRealTimeCrossRateTableAsHTMLResult;
    }

    /**
     * Sets the value of the getRealTimeCrossRateTableAsHTMLResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link HTMLCrossRateTable }
     *     
     */
    public void setGetRealTimeCrossRateTableAsHTMLResult(HTMLCrossRateTable value) {
        this.getRealTimeCrossRateTableAsHTMLResult = value;
    }

}
