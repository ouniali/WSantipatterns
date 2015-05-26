
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
 *         &lt;element name="GetTickHistogramResult" type="{http://www.xignite.com/services/}Histogram" minOccurs="0"/>
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
    "getTickHistogramResult"
})
@XmlRootElement(name = "GetTickHistogramResponse")
public class GetTickHistogramResponse {

    @XmlElement(name = "GetTickHistogramResult")
    protected Histogram getTickHistogramResult;

    /**
     * Gets the value of the getTickHistogramResult property.
     * 
     * @return
     *     possible object is
     *     {@link Histogram }
     *     
     */
    public Histogram getGetTickHistogramResult() {
        return getTickHistogramResult;
    }

    /**
     * Sets the value of the getTickHistogramResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Histogram }
     *     
     */
    public void setGetTickHistogramResult(Histogram value) {
        this.getTickHistogramResult = value;
    }

}
