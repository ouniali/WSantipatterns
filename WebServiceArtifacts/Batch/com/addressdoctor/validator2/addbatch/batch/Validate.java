
package com.addressdoctor.validator2.addbatch.batch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="addBatchRequest" type="{http://validator2.AddressDoctor.com/addBatch/Batch}addBatchRequest" minOccurs="0"/>
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
    "addBatchRequest"
})
@XmlRootElement(name = "Validate")
public class Validate {

    protected AddBatchRequest addBatchRequest;

    /**
     * Gets the value of the addBatchRequest property.
     * 
     * @return
     *     possible object is
     *     {@link AddBatchRequest }
     *     
     */
    public AddBatchRequest getAddBatchRequest() {
        return addBatchRequest;
    }

    /**
     * Sets the value of the addBatchRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddBatchRequest }
     *     
     */
    public void setAddBatchRequest(AddBatchRequest value) {
        this.addBatchRequest = value;
    }

}
