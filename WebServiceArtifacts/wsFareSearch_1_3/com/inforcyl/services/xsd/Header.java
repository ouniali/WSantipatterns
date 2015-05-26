
package com.inforcyl.services.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Header complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Header">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authentification" type="{http://services.inforcyl.com/xsd}Authentification" minOccurs="0"/>
 *         &lt;element name="maintenanceMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="systemDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Header", propOrder = {
    "authentification",
    "maintenanceMessage",
    "systemDate"
})
public class Header {

    @XmlElementRef(name = "authentification", namespace = "http://services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Authentification> authentification;
    @XmlElementRef(name = "maintenanceMessage", namespace = "http://services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> maintenanceMessage;
    @XmlElementRef(name = "systemDate", namespace = "http://services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> systemDate;

    /**
     * Gets the value of the authentification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Authentification }{@code >}
     *     
     */
    public JAXBElement<Authentification> getAuthentification() {
        return authentification;
    }

    /**
     * Sets the value of the authentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Authentification }{@code >}
     *     
     */
    public void setAuthentification(JAXBElement<Authentification> value) {
        this.authentification = value;
    }

    /**
     * Gets the value of the maintenanceMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMaintenanceMessage() {
        return maintenanceMessage;
    }

    /**
     * Sets the value of the maintenanceMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMaintenanceMessage(JAXBElement<String> value) {
        this.maintenanceMessage = value;
    }

    /**
     * Gets the value of the systemDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSystemDate() {
        return systemDate;
    }

    /**
     * Sets the value of the systemDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSystemDate(JAXBElement<String> value) {
        this.systemDate = value;
    }

}
