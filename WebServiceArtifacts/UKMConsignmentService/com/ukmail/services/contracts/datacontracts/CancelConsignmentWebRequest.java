
package com.ukmail.services.contracts.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelConsignmentWebRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelConsignmentWebRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.UKMail.com/Services/Contracts/DataContracts}WebRequest">
 *       &lt;sequence>
 *         &lt;element name="ConsignmentNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelConsignmentWebRequest", propOrder = {
    "consignmentNumber"
})
public class CancelConsignmentWebRequest
    extends WebRequest
{

    @XmlElement(name = "ConsignmentNumber", required = true, nillable = true)
    protected String consignmentNumber;

    /**
     * Gets the value of the consignmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsignmentNumber() {
        return consignmentNumber;
    }

    /**
     * Sets the value of the consignmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsignmentNumber(String value) {
        this.consignmentNumber = value;
    }

}
