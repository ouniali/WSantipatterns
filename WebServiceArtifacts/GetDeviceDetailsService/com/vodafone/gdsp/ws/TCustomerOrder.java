
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for tCustomerOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tCustomerOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imsiEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imsiStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCustomerOrder", propOrder = {
    "customerOrderNumber",
    "imsiEnd",
    "imsiStart",
    "orderDate"
})
public class TCustomerOrder {

    protected String customerOrderNumber;
    protected String imsiEnd;
    protected String imsiStart;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderDate;

    /**
     * Gets the value of the customerOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerOrderNumber() {
        return customerOrderNumber;
    }

    /**
     * Sets the value of the customerOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerOrderNumber(String value) {
        this.customerOrderNumber = value;
    }

    /**
     * Gets the value of the imsiEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImsiEnd() {
        return imsiEnd;
    }

    /**
     * Sets the value of the imsiEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImsiEnd(String value) {
        this.imsiEnd = value;
    }

    /**
     * Gets the value of the imsiStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImsiStart() {
        return imsiStart;
    }

    /**
     * Sets the value of the imsiStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImsiStart(String value) {
        this.imsiStart = value;
    }

    /**
     * Gets the value of the orderDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderDate() {
        return orderDate;
    }

    /**
     * Sets the value of the orderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderDate(XMLGregorianCalendar value) {
        this.orderDate = value;
    }

}
