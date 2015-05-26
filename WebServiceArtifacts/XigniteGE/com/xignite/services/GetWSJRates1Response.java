
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
 *         &lt;element name="GetWSJRates1Result" type="{http://www.xignite.com/services/}ArrayOfWSJRate" minOccurs="0"/>
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
    "getWSJRates1Result"
})
@XmlRootElement(name = "GetWSJRates1Response")
public class GetWSJRates1Response {

    @XmlElement(name = "GetWSJRates1Result")
    protected ArrayOfWSJRate getWSJRates1Result;

    /**
     * Gets the value of the getWSJRates1Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWSJRate }
     *     
     */
    public ArrayOfWSJRate getGetWSJRates1Result() {
        return getWSJRates1Result;
    }

    /**
     * Sets the value of the getWSJRates1Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWSJRate }
     *     
     */
    public void setGetWSJRates1Result(ArrayOfWSJRate value) {
        this.getWSJRates1Result = value;
    }

}
