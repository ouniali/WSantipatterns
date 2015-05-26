
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
 *         &lt;element name="GetInsidersResult" type="{http://www.xignite.com/services/}ArrayOfInsider" minOccurs="0"/>
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
    "getInsidersResult"
})
@XmlRootElement(name = "GetInsidersResponse")
public class GetInsidersResponse {

    @XmlElement(name = "GetInsidersResult")
    protected ArrayOfInsider getInsidersResult;

    /**
     * Gets the value of the getInsidersResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInsider }
     *     
     */
    public ArrayOfInsider getGetInsidersResult() {
        return getInsidersResult;
    }

    /**
     * Sets the value of the getInsidersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInsider }
     *     
     */
    public void setGetInsidersResult(ArrayOfInsider value) {
        this.getInsidersResult = value;
    }

}
