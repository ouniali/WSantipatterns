
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
 *         &lt;element name="ListServicesAndOperationsResult" type="{http://www.xignite.com/services/}ArrayOfServiceExtended" minOccurs="0"/>
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
    "listServicesAndOperationsResult"
})
@XmlRootElement(name = "ListServicesAndOperationsResponse")
public class ListServicesAndOperationsResponse {

    @XmlElement(name = "ListServicesAndOperationsResult")
    protected ArrayOfServiceExtended listServicesAndOperationsResult;

    /**
     * Gets the value of the listServicesAndOperationsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceExtended }
     *     
     */
    public ArrayOfServiceExtended getListServicesAndOperationsResult() {
        return listServicesAndOperationsResult;
    }

    /**
     * Sets the value of the listServicesAndOperationsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceExtended }
     *     
     */
    public void setListServicesAndOperationsResult(ArrayOfServiceExtended value) {
        this.listServicesAndOperationsResult = value;
    }

}
