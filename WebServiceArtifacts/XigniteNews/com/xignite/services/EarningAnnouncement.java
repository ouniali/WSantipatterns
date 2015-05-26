
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EarningAnnouncement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EarningAnnouncement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="AnnouncementDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Symbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EPSEstimate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AnnouncementTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EarningAnnouncement", propOrder = {
    "announcementDate",
    "symbol",
    "company",
    "epsEstimate",
    "announcementTime"
})
public class EarningAnnouncement
    extends Common
{

    @XmlElement(name = "AnnouncementDate")
    protected String announcementDate;
    @XmlElement(name = "Symbol")
    protected String symbol;
    @XmlElement(name = "Company")
    protected String company;
    @XmlElement(name = "EPSEstimate")
    protected String epsEstimate;
    @XmlElement(name = "AnnouncementTime")
    protected String announcementTime;

    /**
     * Gets the value of the announcementDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnouncementDate() {
        return announcementDate;
    }

    /**
     * Sets the value of the announcementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnouncementDate(String value) {
        this.announcementDate = value;
    }

    /**
     * Gets the value of the symbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Sets the value of the symbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbol(String value) {
        this.symbol = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Gets the value of the epsEstimate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEPSEstimate() {
        return epsEstimate;
    }

    /**
     * Sets the value of the epsEstimate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEPSEstimate(String value) {
        this.epsEstimate = value;
    }

    /**
     * Gets the value of the announcementTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnouncementTime() {
        return announcementTime;
    }

    /**
     * Sets the value of the announcementTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnouncementTime(String value) {
        this.announcementTime = value;
    }

}
