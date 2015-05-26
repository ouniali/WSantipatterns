
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
 *         &lt;element name="GetLogResult" type="{http://www.xignite.com/services/}ArrayOfLogEntry" minOccurs="0"/>
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
    "getLogResult"
})
@XmlRootElement(name = "GetLogResponse")
public class GetLogResponse {

    @XmlElement(name = "GetLogResult")
    protected ArrayOfLogEntry getLogResult;

    /**
     * Gets the value of the getLogResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLogEntry }
     *     
     */
    public ArrayOfLogEntry getGetLogResult() {
        return getLogResult;
    }

    /**
     * Sets the value of the getLogResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLogEntry }
     *     
     */
    public void setGetLogResult(ArrayOfLogEntry value) {
        this.getLogResult = value;
    }

}
