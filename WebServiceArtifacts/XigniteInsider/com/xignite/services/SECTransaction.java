
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SECTransaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SECTransaction">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Transaction">
 *       &lt;sequence>
 *         &lt;element name="AcquiredDisposedCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SECTransaction", propOrder = {
    "acquiredDisposedCode"
})
public class SECTransaction
    extends Transaction
{

    @XmlElement(name = "AcquiredDisposedCode")
    protected String acquiredDisposedCode;

    /**
     * Gets the value of the acquiredDisposedCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcquiredDisposedCode() {
        return acquiredDisposedCode;
    }

    /**
     * Sets the value of the acquiredDisposedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcquiredDisposedCode(String value) {
        this.acquiredDisposedCode = value;
    }

}
