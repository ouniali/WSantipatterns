
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
 *         &lt;element name="GetAllMyInvoicesResult" type="{http://carrierate.com/}ArrayOfInvoices" minOccurs="0"/>
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
    "getAllMyInvoicesResult"
})
@XmlRootElement(name = "GetAllMyInvoicesResponse")
public class GetAllMyInvoicesResponse {

    @XmlElement(name = "GetAllMyInvoicesResult")
    protected ArrayOfInvoices getAllMyInvoicesResult;

    /**
     * Gets the value of the getAllMyInvoicesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInvoices }
     *     
     */
    public ArrayOfInvoices getGetAllMyInvoicesResult() {
        return getAllMyInvoicesResult;
    }

    /**
     * Sets the value of the getAllMyInvoicesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInvoices }
     *     
     */
    public void setGetAllMyInvoicesResult(ArrayOfInvoices value) {
        this.getAllMyInvoicesResult = value;
    }

}
