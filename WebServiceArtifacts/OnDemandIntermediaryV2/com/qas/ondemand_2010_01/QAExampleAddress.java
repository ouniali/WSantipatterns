
package com.qas.ondemand_2010_01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QAExampleAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QAExampleAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{http://www.qas.com/OnDemand-2010-01}QAAddressType" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QAExampleAddress", propOrder = {
    "address",
    "comment"
})
public class QAExampleAddress {

    @XmlElement(name = "Address")
    protected QAAddressType address;
    @XmlElement(name = "Comment")
    protected String comment;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link QAAddressType }
     *     
     */
    public QAAddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link QAAddressType }
     *     
     */
    public void setAddress(QAAddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

}
