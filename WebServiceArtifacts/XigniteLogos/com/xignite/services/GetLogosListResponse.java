
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
 *         &lt;element name="GetLogosListResult" type="{http://www.xignite.com/services/}LogoList" minOccurs="0"/>
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
    "getLogosListResult"
})
@XmlRootElement(name = "GetLogosListResponse")
public class GetLogosListResponse {

    @XmlElement(name = "GetLogosListResult")
    protected LogoList getLogosListResult;

    /**
     * Gets the value of the getLogosListResult property.
     * 
     * @return
     *     possible object is
     *     {@link LogoList }
     *     
     */
    public LogoList getGetLogosListResult() {
        return getLogosListResult;
    }

    /**
     * Sets the value of the getLogosListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogoList }
     *     
     */
    public void setGetLogosListResult(LogoList value) {
        this.getLogosListResult = value;
    }

}
