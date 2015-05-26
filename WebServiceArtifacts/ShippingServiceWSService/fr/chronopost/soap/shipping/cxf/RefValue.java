
package fr.chronopost.soap.shipping.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for refValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="refValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerSkybillNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PCardTransactionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipperRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "refValue", propOrder = {
    "customerSkybillNumber",
    "pCardTransactionNumber",
    "recipientRef",
    "shipperRef"
})
public class RefValue {

    protected String customerSkybillNumber;
    @XmlElement(name = "PCardTransactionNumber")
    protected String pCardTransactionNumber;
    protected String recipientRef;
    protected String shipperRef;

    /**
     * Gets the value of the customerSkybillNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerSkybillNumber() {
        return customerSkybillNumber;
    }

    /**
     * Sets the value of the customerSkybillNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerSkybillNumber(String value) {
        this.customerSkybillNumber = value;
    }

    /**
     * Gets the value of the pCardTransactionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCardTransactionNumber() {
        return pCardTransactionNumber;
    }

    /**
     * Sets the value of the pCardTransactionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCardTransactionNumber(String value) {
        this.pCardTransactionNumber = value;
    }

    /**
     * Gets the value of the recipientRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientRef() {
        return recipientRef;
    }

    /**
     * Sets the value of the recipientRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientRef(String value) {
        this.recipientRef = value;
    }

    /**
     * Gets the value of the shipperRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperRef() {
        return shipperRef;
    }

    /**
     * Sets the value of the shipperRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperRef(String value) {
        this.shipperRef = value;
    }

}
