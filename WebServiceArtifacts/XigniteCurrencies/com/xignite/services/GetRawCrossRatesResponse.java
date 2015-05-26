
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
 *         &lt;element name="GetRawCrossRatesResult" type="{http://www.xignite.com/services/}ArrayOfCrossRate" minOccurs="0"/>
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
    "getRawCrossRatesResult"
})
@XmlRootElement(name = "GetRawCrossRatesResponse")
public class GetRawCrossRatesResponse {

    @XmlElement(name = "GetRawCrossRatesResult")
    protected ArrayOfCrossRate getRawCrossRatesResult;

    /**
     * Gets the value of the getRawCrossRatesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCrossRate }
     *     
     */
    public ArrayOfCrossRate getGetRawCrossRatesResult() {
        return getRawCrossRatesResult;
    }

    /**
     * Sets the value of the getRawCrossRatesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCrossRate }
     *     
     */
    public void setGetRawCrossRatesResult(ArrayOfCrossRate value) {
        this.getRawCrossRatesResult = value;
    }

}
