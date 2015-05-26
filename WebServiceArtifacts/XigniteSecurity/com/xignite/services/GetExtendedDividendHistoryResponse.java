
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
 *         &lt;element name="GetExtendedDividendHistoryResult" type="{http://www.xignite.com/services/}ExtendedDividendHistory" minOccurs="0"/>
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
    "getExtendedDividendHistoryResult"
})
@XmlRootElement(name = "GetExtendedDividendHistoryResponse")
public class GetExtendedDividendHistoryResponse {

    @XmlElement(name = "GetExtendedDividendHistoryResult")
    protected ExtendedDividendHistory getExtendedDividendHistoryResult;

    /**
     * Gets the value of the getExtendedDividendHistoryResult property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedDividendHistory }
     *     
     */
    public ExtendedDividendHistory getGetExtendedDividendHistoryResult() {
        return getExtendedDividendHistoryResult;
    }

    /**
     * Sets the value of the getExtendedDividendHistoryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedDividendHistory }
     *     
     */
    public void setGetExtendedDividendHistoryResult(ExtendedDividendHistory value) {
        this.getExtendedDividendHistoryResult = value;
    }

}
