
package com.tourico.schemas.webservices.hotelv3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParagraphType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParagraphType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="items" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfFormattedTextType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="paragraphNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParagraphType", propOrder = {
    "items"
})
public class ParagraphType {

    protected ArrayOfFormattedTextType items;
    @XmlAttribute(name = "paragraphNumber")
    protected Integer paragraphNumber;

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFormattedTextType }
     *     
     */
    public ArrayOfFormattedTextType getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFormattedTextType }
     *     
     */
    public void setItems(ArrayOfFormattedTextType value) {
        this.items = value;
    }

    /**
     * Gets the value of the paragraphNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParagraphNumber() {
        return paragraphNumber;
    }

    /**
     * Sets the value of the paragraphNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParagraphNumber(Integer value) {
        this.paragraphNumber = value;
    }

}
