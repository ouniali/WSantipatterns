
package com.strikeiron;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NorthAmericanAddressWithStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NorthAmericanAddressWithStatus">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.strikeiron.com}SIWsResultWithStatus">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{http://www.strikeiron.com}NorthAmericanAddress" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NorthAmericanAddressWithStatus", propOrder = {
    "address"
})
public class NorthAmericanAddressWithStatus
    extends SIWsResultWithStatus
{

    @XmlElement(name = "Address")
    protected NorthAmericanAddress address;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link NorthAmericanAddress }
     *     
     */
    public NorthAmericanAddress getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link NorthAmericanAddress }
     *     
     */
    public void setAddress(NorthAmericanAddress value) {
        this.address = value;
    }

}
