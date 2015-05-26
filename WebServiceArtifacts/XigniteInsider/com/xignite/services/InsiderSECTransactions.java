
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsiderSECTransactions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsiderSECTransactions">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="Insider" type="{http://www.xignite.com/services/}Insider" minOccurs="0"/>
 *         &lt;element name="SECTransactions" type="{http://www.xignite.com/services/}ArrayOfSECTransaction" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsiderSECTransactions", propOrder = {
    "insider",
    "secTransactions"
})
public class InsiderSECTransactions
    extends Common
{

    @XmlElement(name = "Insider")
    protected Insider insider;
    @XmlElement(name = "SECTransactions")
    protected ArrayOfSECTransaction secTransactions;

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
     * Gets the value of the secTransactions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSECTransaction }
     *     
     */
    public ArrayOfSECTransaction getSECTransactions() {
        return secTransactions;
    }

    /**
     * Sets the value of the secTransactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSECTransaction }
     *     
     */
    public void setSECTransactions(ArrayOfSECTransaction value) {
        this.secTransactions = value;
    }

}
