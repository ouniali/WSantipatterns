
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
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdentifierType" type="{http://www.xignite.com/services/}IdentifierTypes"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PeriodType" type="{http://www.xignite.com/services/}PeriodTypes"/>
 *         &lt;element name="Periods" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "identifier",
    "identifierType",
    "endDate",
    "periodType",
    "periods"
})
@XmlRootElement(name = "GetHistoricalQuotesAsOf")
public class GetHistoricalQuotesAsOf {

    @XmlElement(name = "Identifier")
    protected String identifier;
    @XmlElement(name = "IdentifierType", required = true)
    @XmlSchemaType(name = "string")
    protected IdentifierTypes identifierType;
    @XmlElement(name = "EndDate")
    protected String endDate;
    @XmlElement(name = "PeriodType", required = true)
    @XmlSchemaType(name = "string")
    protected PeriodTypes periodType;
    @XmlElement(name = "Periods")
    protected int periods;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the identifierType property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierTypes }
     *     
     */
    public IdentifierTypes getIdentifierType() {
        return identifierType;
    }

    /**
     * Sets the value of the identifierType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierTypes }
     *     
     */
    public void setIdentifierType(IdentifierTypes value) {
        this.identifierType = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the periodType property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodTypes }
     *     
     */
    public PeriodTypes getPeriodType() {
        return periodType;
    }

    /**
     * Sets the value of the periodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodTypes }
     *     
     */
    public void setPeriodType(PeriodTypes value) {
        this.periodType = value;
    }

    /**
     * Gets the value of the periods property.
     * 
     */
    public int getPeriods() {
        return periods;
    }

    /**
     * Sets the value of the periods property.
     * 
     */
    public void setPeriods(int value) {
        this.periods = value;
    }

}
