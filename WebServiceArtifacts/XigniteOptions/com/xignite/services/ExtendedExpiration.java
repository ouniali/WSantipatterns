
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtendedExpiration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtendedExpiration">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="Month" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Calls" type="{http://www.xignite.com/services/}ArrayOfExtendedOption" minOccurs="0"/>
 *         &lt;element name="Puts" type="{http://www.xignite.com/services/}ArrayOfExtendedOption" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendedExpiration", propOrder = {
    "month",
    "year",
    "expirationDate",
    "calls",
    "puts"
})
public class ExtendedExpiration
    extends Common
{

    @XmlElement(name = "Month")
    protected int month;
    @XmlElement(name = "Year")
    protected int year;
    @XmlElement(name = "ExpirationDate")
    protected String expirationDate;
    @XmlElement(name = "Calls")
    protected ArrayOfExtendedOption calls;
    @XmlElement(name = "Puts")
    protected ArrayOfExtendedOption puts;

    /**
     * Gets the value of the month property.
     * 
     */
    public int getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     * 
     */
    public void setMonth(int value) {
        this.month = value;
    }

    /**
     * Gets the value of the year property.
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDate(String value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the calls property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExtendedOption }
     *     
     */
    public ArrayOfExtendedOption getCalls() {
        return calls;
    }

    /**
     * Sets the value of the calls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExtendedOption }
     *     
     */
    public void setCalls(ArrayOfExtendedOption value) {
        this.calls = value;
    }

    /**
     * Gets the value of the puts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExtendedOption }
     *     
     */
    public ArrayOfExtendedOption getPuts() {
        return puts;
    }

    /**
     * Sets the value of the puts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExtendedOption }
     *     
     */
    public void setPuts(ArrayOfExtendedOption value) {
        this.puts = value;
    }

}
