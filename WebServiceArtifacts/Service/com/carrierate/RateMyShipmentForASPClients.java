
package com.carrierate;

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
 *         &lt;element name="xmlQuoteInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xmlQuoteItemsInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "xmlQuoteInfo",
    "xmlQuoteItemsInfo"
})
@XmlRootElement(name = "RateMyShipmentForASPClients")
public class RateMyShipmentForASPClients {

    protected String xmlQuoteInfo;
    protected String xmlQuoteItemsInfo;

    /**
     * Gets the value of the xmlQuoteInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlQuoteInfo() {
        return xmlQuoteInfo;
    }

    /**
     * Sets the value of the xmlQuoteInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlQuoteInfo(String value) {
        this.xmlQuoteInfo = value;
    }

    /**
     * Gets the value of the xmlQuoteItemsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlQuoteItemsInfo() {
        return xmlQuoteItemsInfo;
    }

    /**
     * Sets the value of the xmlQuoteItemsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlQuoteItemsInfo(String value) {
        this.xmlQuoteItemsInfo = value;
    }

}
