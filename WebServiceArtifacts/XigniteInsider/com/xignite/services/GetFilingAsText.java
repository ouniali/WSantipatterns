
package com.xignite.services;

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
 *         &lt;element name="TextFileUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HTMLize" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "textFileUrl",
    "htmLize"
})
@XmlRootElement(name = "GetFilingAsText")
public class GetFilingAsText {

    @XmlElement(name = "TextFileUrl")
    protected String textFileUrl;
    @XmlElement(name = "HTMLize")
    protected boolean htmLize;

    /**
     * Gets the value of the textFileUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextFileUrl() {
        return textFileUrl;
    }

    /**
     * Sets the value of the textFileUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextFileUrl(String value) {
        this.textFileUrl = value;
    }

    /**
     * Gets the value of the htmLize property.
     * 
     */
    public boolean isHTMLize() {
        return htmLize;
    }

    /**
     * Sets the value of the htmLize property.
     * 
     */
    public void setHTMLize(boolean value) {
        this.htmLize = value;
    }

}
