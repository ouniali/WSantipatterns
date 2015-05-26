
package com.carrierate;

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
 *         &lt;element name="ConfirmQuoteRequestInfoForTMSCustomer" type="{http://carrierate.com/}ConfirmQuoteRequestInfoForTMSCustomer"/>
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
    "confirmQuoteRequestInfoForTMSCustomer"
})
@XmlRootElement(name = "ConfirmShipmentForTMSCustomer")
public class ConfirmShipmentForTMSCustomer {

    @XmlElement(name = "ConfirmQuoteRequestInfoForTMSCustomer", required = true, nillable = true)
    protected ConfirmQuoteRequestInfoForTMSCustomer confirmQuoteRequestInfoForTMSCustomer;

    /**
     * Gets the value of the confirmQuoteRequestInfoForTMSCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmQuoteRequestInfoForTMSCustomer }
     *     
     */
    public ConfirmQuoteRequestInfoForTMSCustomer getConfirmQuoteRequestInfoForTMSCustomer() {
        return confirmQuoteRequestInfoForTMSCustomer;
    }

    /**
     * Sets the value of the confirmQuoteRequestInfoForTMSCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmQuoteRequestInfoForTMSCustomer }
     *     
     */
    public void setConfirmQuoteRequestInfoForTMSCustomer(ConfirmQuoteRequestInfoForTMSCustomer value) {
        this.confirmQuoteRequestInfoForTMSCustomer = value;
    }

}
