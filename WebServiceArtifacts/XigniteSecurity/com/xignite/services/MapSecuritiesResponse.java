
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
 *         &lt;element name="MapSecuritiesResult" type="{http://www.xignite.com/services/}ArrayOfSecurity" minOccurs="0"/>
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
    "mapSecuritiesResult"
})
@XmlRootElement(name = "MapSecuritiesResponse")
public class MapSecuritiesResponse {

    @XmlElement(name = "MapSecuritiesResult")
    protected ArrayOfSecurity mapSecuritiesResult;

    /**
     * Gets the value of the mapSecuritiesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSecurity }
     *     
     */
    public ArrayOfSecurity getMapSecuritiesResult() {
        return mapSecuritiesResult;
    }

    /**
     * Sets the value of the mapSecuritiesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSecurity }
     *     
     */
    public void setMapSecuritiesResult(ArrayOfSecurity value) {
        this.mapSecuritiesResult = value;
    }

}
