
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserSummary">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="Registrations" type="{http://www.xignite.com/services/}ArrayOfUserRegistration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserSummary", propOrder = {
    "registrations"
})
public class UserSummary
    extends Common
{

    @XmlElement(name = "Registrations")
    protected ArrayOfUserRegistration registrations;

    /**
     * Gets the value of the registrations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUserRegistration }
     *     
     */
    public ArrayOfUserRegistration getRegistrations() {
        return registrations;
    }

    /**
     * Sets the value of the registrations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUserRegistration }
     *     
     */
    public void setRegistrations(ArrayOfUserRegistration value) {
        this.registrations = value;
    }

}
