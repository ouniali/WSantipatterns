
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsiderTransactions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsiderTransactions">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="Insider" type="{http://www.xignite.com/services/}Insider" minOccurs="0"/>
 *         &lt;element name="Transactions" type="{http://www.xignite.com/services/}ArrayOfTransaction" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsiderTransactions", propOrder = {
    "insider",
    "transactions"
})
public class InsiderTransactions
    extends Common
{

    @XmlElement(name = "Insider")
    protected Insider insider;
    @XmlElement(name = "Transactions")
    protected ArrayOfTransaction transactions;

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
     * Gets the value of the transactions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTransaction }
     *     
     */
    public ArrayOfTransaction getTransactions() {
        return transactions;
    }

    /**
     * Sets the value of the transactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTransaction }
     *     
     */
    public void setTransactions(ArrayOfTransaction value) {
        this.transactions = value;
    }

}
