
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsiderOwnerships complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsiderOwnerships">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="Insider" type="{http://www.xignite.com/services/}Insider" minOccurs="0"/>
 *         &lt;element name="Ownerships" type="{http://www.xignite.com/services/}ArrayOfInsiderOwnership" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsiderOwnerships", propOrder = {
    "insider",
    "ownerships"
})
public class InsiderOwnerships
    extends Common
{

    @XmlElement(name = "Insider")
    protected Insider insider;
    @XmlElement(name = "Ownerships")
    protected ArrayOfInsiderOwnership ownerships;

    /**
     * Gets the value of the insider property.
     * 
     * @return
     *     possible object is
     *     {@link Insider }
     *     
     */
    public Insider getInsider() {
        return insider;
    }

    /**
     * Sets the value of the insider property.
     * 
     * @param value
     *     allowed object is
     *     {@link Insider }
     *     
     */
    public void setInsider(Insider value) {
        this.insider = value;
    }

    /**
     * Gets the value of the ownerships property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInsiderOwnership }
     *     
     */
    public ArrayOfInsiderOwnership getOwnerships() {
        return ownerships;
    }

    /**
     * Sets the value of the ownerships property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInsiderOwnership }
     *     
     */
    public void setOwnerships(ArrayOfInsiderOwnership value) {
        this.ownerships = value;
    }

}
