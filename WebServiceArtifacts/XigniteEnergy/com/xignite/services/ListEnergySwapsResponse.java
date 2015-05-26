
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
 *         &lt;element name="ListEnergySwapsResult" type="{http://www.xignite.com/services/}ArrayOfFuture" minOccurs="0"/>
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
    "listEnergySwapsResult"
})
@XmlRootElement(name = "ListEnergySwapsResponse")
public class ListEnergySwapsResponse {

    @XmlElement(name = "ListEnergySwapsResult")
    protected ArrayOfFuture listEnergySwapsResult;

    /**
     * Gets the value of the listEnergySwapsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFuture }
     *     
     */
    public ArrayOfFuture getListEnergySwapsResult() {
        return listEnergySwapsResult;
    }

    /**
     * Sets the value of the listEnergySwapsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFuture }
     *     
     */
    public void setListEnergySwapsResult(ArrayOfFuture value) {
        this.listEnergySwapsResult = value;
    }

}
