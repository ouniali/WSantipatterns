
package com.digikey.services.searchws;

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
 *         &lt;element name="PartNumberList" type="{http://services.digikey.com/SearchWS}ArrayOfInputPartNumber" minOccurs="0"/>
 *         &lt;element name="site" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exactManufacturerPartMatch" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "partNumberList",
    "site",
    "language",
    "currency",
    "exactManufacturerPartMatch"
})
@XmlRootElement(name = "GetProductInfoList")
public class GetProductInfoList {

    @XmlElement(name = "PartNumberList")
    protected ArrayOfInputPartNumber partNumberList;
    protected String site;
    protected String language;
    protected String currency;
    protected boolean exactManufacturerPartMatch;

    /**
     * Gets the value of the partNumberList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInputPartNumber }
     *     
     */
    public ArrayOfInputPartNumber getPartNumberList() {
        return partNumberList;
    }

    /**
     * Sets the value of the partNumberList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInputPartNumber }
     *     
     */
    public void setPartNumberList(ArrayOfInputPartNumber value) {
        this.partNumberList = value;
    }

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSite(String value) {
        this.site = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the exactManufacturerPartMatch property.
     * 
     */
    public boolean isExactManufacturerPartMatch() {
        return exactManufacturerPartMatch;
    }

    /**
     * Sets the value of the exactManufacturerPartMatch property.
     * 
     */
    public void setExactManufacturerPartMatch(boolean value) {
        this.exactManufacturerPartMatch = value;
    }

}
