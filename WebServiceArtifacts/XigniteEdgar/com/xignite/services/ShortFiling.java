
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShortFiling complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShortFiling">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="CIK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Amendment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="TextFileUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HtmlFileUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlternateHtmlFileUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FilingId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShortFiling", propOrder = {
    "cik",
    "date",
    "type",
    "amendment",
    "textFileUrl",
    "htmlFileUrl",
    "alternateHtmlFileUrl",
    "filingId"
})
public class ShortFiling
    extends Common
{

    @XmlElement(name = "CIK")
    protected String cik;
    @XmlElement(name = "Date")
    protected String date;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "Amendment")
    protected boolean amendment;
    @XmlElement(name = "TextFileUrl")
    protected String textFileUrl;
    @XmlElement(name = "HtmlFileUrl")
    protected String htmlFileUrl;
    @XmlElement(name = "AlternateHtmlFileUrl")
    protected String alternateHtmlFileUrl;
    @XmlElement(name = "FilingId")
    protected int filingId;

    /**
     * Gets the value of the cik property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIK() {
        return cik;
    }

    /**
     * Sets the value of the cik property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIK(String value) {
        this.cik = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the amendment property.
     * 
     */
    public boolean isAmendment() {
        return amendment;
    }

    /**
     * Sets the value of the amendment property.
     * 
     */
    public void setAmendment(boolean value) {
        this.amendment = value;
    }

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
     * Gets the value of the htmlFileUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtmlFileUrl() {
        return htmlFileUrl;
    }

    /**
     * Sets the value of the htmlFileUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtmlFileUrl(String value) {
        this.htmlFileUrl = value;
    }

    /**
     * Gets the value of the alternateHtmlFileUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateHtmlFileUrl() {
        return alternateHtmlFileUrl;
    }

    /**
     * Sets the value of the alternateHtmlFileUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateHtmlFileUrl(String value) {
        this.alternateHtmlFileUrl = value;
    }

    /**
     * Gets the value of the filingId property.
     * 
     */
    public int getFilingId() {
        return filingId;
    }

    /**
     * Sets the value of the filingId property.
     * 
     */
    public void setFilingId(int value) {
        this.filingId = value;
    }

}
