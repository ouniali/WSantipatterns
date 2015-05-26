
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
 *         &lt;element name="GetDividendHistoryRangeResult" type="{http://www.xignite.com/services/}DividendHistory" minOccurs="0"/>
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
    "getDividendHistoryRangeResult"
})
@XmlRootElement(name = "GetDividendHistoryRangeResponse")
public class GetDividendHistoryRangeResponse {

    @XmlElement(name = "GetDividendHistoryRangeResult")
    protected DividendHistory getDividendHistoryRangeResult;

    /**
     * Gets the value of the getDividendHistoryRangeResult property.
     * 
     * @return
     *     possible object is
     *     {@link DividendHistory }
     *     
     */
    public DividendHistory getGetDividendHistoryRangeResult() {
        return getDividendHistoryRangeResult;
    }

    /**
     * Sets the value of the getDividendHistoryRangeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DividendHistory }
     *     
     */
    public void setGetDividendHistoryRangeResult(DividendHistory value) {
        this.getDividendHistoryRangeResult = value;
    }

}
