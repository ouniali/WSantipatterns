
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="SinceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Industry" type="{http://www.xignite.com/services/}IndustryTypes"/>
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
    "sinceDate",
    "industry"
})
@XmlRootElement(name = "GetLastEnergyHeadlines")
public class GetLastEnergyHeadlines {

    @XmlElement(name = "SinceDate")
    protected String sinceDate;
    @XmlElement(name = "Industry", required = true)
    @XmlSchemaType(name = "string")
    protected IndustryTypes industry;

    /**
     * Gets the value of the sinceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSinceDate() {
        return sinceDate;
    }

    /**
     * Sets the value of the sinceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSinceDate(String value) {
        this.sinceDate = value;
    }

    /**
     * Gets the value of the industry property.
     * 
     * @return
     *     possible object is
     *     {@link IndustryTypes }
     *     
     */
    public IndustryTypes getIndustry() {
        return industry;
    }

    /**
     * Sets the value of the industry property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndustryTypes }
     *     
     */
    public void setIndustry(IndustryTypes value) {
        this.industry = value;
    }

}
