
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
 *         &lt;element name="GetWSJRatesResult" type="{http://www.xignite.com/services/}ArrayOfWSJRate" minOccurs="0"/>
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
    "getWSJRatesResult"
})
@XmlRootElement(name = "GetWSJRatesResponse")
public class GetWSJRatesResponse {

    @XmlElement(name = "GetWSJRatesResult")
    protected ArrayOfWSJRate getWSJRatesResult;

    /**
     * Gets the value of the getWSJRatesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWSJRate }
     *     
     */
    public ArrayOfWSJRate getGetWSJRatesResult() {
        return getWSJRatesResult;
    }

    /**
     * Sets the value of the getWSJRatesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWSJRate }
     *     
     */
    public void setGetWSJRatesResult(ArrayOfWSJRate value) {
        this.getWSJRatesResult = value;
    }

}
