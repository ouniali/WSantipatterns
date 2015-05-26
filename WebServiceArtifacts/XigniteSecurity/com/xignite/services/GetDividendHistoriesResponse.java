
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
 *         &lt;element name="GetDividendHistoriesResult" type="{http://www.xignite.com/services/}ArrayOfDividendHistory" minOccurs="0"/>
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
    "getDividendHistoriesResult"
})
@XmlRootElement(name = "GetDividendHistoriesResponse")
public class GetDividendHistoriesResponse {

    @XmlElement(name = "GetDividendHistoriesResult")
    protected ArrayOfDividendHistory getDividendHistoriesResult;

    /**
     * Gets the value of the getDividendHistoriesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDividendHistory }
     *     
     */
    public ArrayOfDividendHistory getGetDividendHistoriesResult() {
        return getDividendHistoriesResult;
    }

    /**
     * Sets the value of the getDividendHistoriesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDividendHistory }
     *     
     */
    public void setGetDividendHistoriesResult(ArrayOfDividendHistory value) {
        this.getDividendHistoriesResult = value;
    }

}
