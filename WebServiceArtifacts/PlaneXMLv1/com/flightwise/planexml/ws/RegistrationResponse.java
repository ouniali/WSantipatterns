
package com.flightwise.planexml.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.fboweb.ws.Registry;


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
 *         &lt;element ref="{http://fboweb.com/ws}Registry"/>
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
    "registry"
})
@XmlRootElement(name = "RegistrationResponse")
public class RegistrationResponse {

    @XmlElement(name = "Registry", namespace = "http://fboweb.com/ws", required = true, nillable = true)
    protected Registry registry;

    /**
     * Gets the value of the registry property.
     * 
     * @return
     *     possible object is
     *     {@link Registry }
     *     
     */
    public Registry getRegistry() {
        return registry;
    }

    /**
     * Sets the value of the registry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Registry }
     *     
     */
    public void setRegistry(Registry value) {
        this.registry = value;
    }

}
