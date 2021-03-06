
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
 *         &lt;element name="MapSecurityResult" type="{http://www.xignite.com/services/}Security" minOccurs="0"/>
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
    "mapSecurityResult"
})
@XmlRootElement(name = "MapSecurityResponse")
public class MapSecurityResponse {

    @XmlElement(name = "MapSecurityResult")
    protected Security mapSecurityResult;

    /**
     * Gets the value of the mapSecurityResult property.
     * 
     * @return
     *     possible object is
     *     {@link Security }
     *     
     */
    public Security getMapSecurityResult() {
        return mapSecurityResult;
    }

    /**
     * Sets the value of the mapSecurityResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Security }
     *     
     */
    public void setMapSecurityResult(Security value) {
        this.mapSecurityResult = value;
    }

}
