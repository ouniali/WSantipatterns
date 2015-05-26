
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
 *         &lt;element name="GetEuroDollarFRAStripResult" type="{http://www.xignite.com/services/}ArrayOfEuroDollarFRA" minOccurs="0"/>
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
    "getEuroDollarFRAStripResult"
})
@XmlRootElement(name = "GetEuroDollarFRAStripResponse")
public class GetEuroDollarFRAStripResponse {

    @XmlElement(name = "GetEuroDollarFRAStripResult")
    protected ArrayOfEuroDollarFRA getEuroDollarFRAStripResult;

    /**
     * Gets the value of the getEuroDollarFRAStripResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEuroDollarFRA }
     *     
     */
    public ArrayOfEuroDollarFRA getGetEuroDollarFRAStripResult() {
        return getEuroDollarFRAStripResult;
    }

    /**
     * Sets the value of the getEuroDollarFRAStripResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEuroDollarFRA }
     *     
     */
    public void setGetEuroDollarFRAStripResult(ArrayOfEuroDollarFRA value) {
        this.getEuroDollarFRAStripResult = value;
    }

}
