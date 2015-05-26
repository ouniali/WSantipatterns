
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PR_SeasonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PR_SeasonType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PriceDescriptions" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}ArrayOfPR_PriceDescriptionType" minOccurs="0"/>
 *         &lt;element name="ExceptPeriods" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}ArrayOfPR_ExceptPeriodType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="start_date" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="finish_date" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PR_SeasonType", propOrder = {
    "priceDescriptions",
    "exceptPeriods"
})
public class PRSeasonType {

    @XmlElement(name = "PriceDescriptions")
    protected ArrayOfPRPriceDescriptionType priceDescriptions;
    @XmlElement(name = "ExceptPeriods")
    protected ArrayOfPRExceptPeriodType exceptPeriods;
    @XmlAttribute(name = "start_date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlAttribute(name = "finish_date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar finishDate;
    @XmlAttribute(name = "name")
    protected String name;

    /**
     * Gets the value of the priceDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPRPriceDescriptionType }
     *     
     */
    public ArrayOfPRPriceDescriptionType getPriceDescriptions() {
        return priceDescriptions;
    }

    /**
     * Sets the value of the priceDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPRPriceDescriptionType }
     *     
     */
    public void setPriceDescriptions(ArrayOfPRPriceDescriptionType value) {
        this.priceDescriptions = value;
    }

    /**
     * Gets the value of the exceptPeriods property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPRExceptPeriodType }
     *     
     */
    public ArrayOfPRExceptPeriodType getExceptPeriods() {
        return exceptPeriods;
    }

    /**
     * Sets the value of the exceptPeriods property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPRExceptPeriodType }
     *     
     */
    public void setExceptPeriods(ArrayOfPRExceptPeriodType value) {
        this.exceptPeriods = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the finishDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFinishDate() {
        return finishDate;
    }

    /**
     * Sets the value of the finishDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFinishDate(XMLGregorianCalendar value) {
        this.finishDate = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
