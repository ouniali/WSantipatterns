
package com.epostcode.ws.uk;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListAddressPremise complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListAddressPremise">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="List_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Unique_Delivery_Point" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Return_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListAddressPremise", propOrder = {
    "listAddress",
    "uniqueDeliveryPoint",
    "returnCode"
})
public class ListAddressPremise {

    @XmlElement(name = "List_Address")
    protected String listAddress;
    @XmlElement(name = "Unique_Delivery_Point")
    protected String uniqueDeliveryPoint;
    @XmlElement(name = "Return_Code")
    protected String returnCode;

    /**
     * Gets the value of the listAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListAddress() {
        return listAddress;
    }

    /**
     * Sets the value of the listAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListAddress(String value) {
        this.listAddress = value;
    }

    /**
     * Gets the value of the uniqueDeliveryPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueDeliveryPoint() {
        return uniqueDeliveryPoint;
    }

    /**
     * Sets the value of the uniqueDeliveryPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueDeliveryPoint(String value) {
        this.uniqueDeliveryPoint = value;
    }

    /**
     * Gets the value of the returnCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnCode() {
        return returnCode;
    }

    /**
     * Sets the value of the returnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnCode(String value) {
        this.returnCode = value;
    }

}
