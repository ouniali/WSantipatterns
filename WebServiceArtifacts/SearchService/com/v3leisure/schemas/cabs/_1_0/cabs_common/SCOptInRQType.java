
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SC_OptInRQType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SC_OptInRQType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="opted_in" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}CO_TrueFalseEitherEnumType" />
 *       &lt;attribute name="is_blocked" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}CO_TrueFalseEitherEnumType" />
 *       &lt;attribute name="minimum_product_count" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="opted_in_effective" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}CO_TrueFalseEitherEnumType" />
 *       &lt;attribute name="maximum_product_count" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="start_date" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="finish_date" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SC_OptInRQType")
public class SCOptInRQType {

    @XmlAttribute(name = "opted_in")
    protected COTrueFalseEitherEnumType optedIn;
    @XmlAttribute(name = "is_blocked")
    protected COTrueFalseEitherEnumType isBlocked;
    @XmlAttribute(name = "minimum_product_count")
    protected Integer minimumProductCount;
    @XmlAttribute(name = "opted_in_effective")
    protected COTrueFalseEitherEnumType optedInEffective;
    @XmlAttribute(name = "maximum_product_count")
    protected Integer maximumProductCount;
    @XmlAttribute(name = "start_date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlAttribute(name = "finish_date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar finishDate;

    /**
     * Gets the value of the optedIn property.
     * 
     * @return
     *     possible object is
     *     {@link COTrueFalseEitherEnumType }
     *     
     */
    public COTrueFalseEitherEnumType getOptedIn() {
        return optedIn;
    }

    /**
     * Sets the value of the optedIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link COTrueFalseEitherEnumType }
     *     
     */
    public void setOptedIn(COTrueFalseEitherEnumType value) {
        this.optedIn = value;
    }

    /**
     * Gets the value of the isBlocked property.
     * 
     * @return
     *     possible object is
     *     {@link COTrueFalseEitherEnumType }
     *     
     */
    public COTrueFalseEitherEnumType getIsBlocked() {
        return isBlocked;
    }

    /**
     * Sets the value of the isBlocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link COTrueFalseEitherEnumType }
     *     
     */
    public void setIsBlocked(COTrueFalseEitherEnumType value) {
        this.isBlocked = value;
    }

    /**
     * Gets the value of the minimumProductCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinimumProductCount() {
        return minimumProductCount;
    }

    /**
     * Sets the value of the minimumProductCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinimumProductCount(Integer value) {
        this.minimumProductCount = value;
    }

    /**
     * Gets the value of the optedInEffective property.
     * 
     * @return
     *     possible object is
     *     {@link COTrueFalseEitherEnumType }
     *     
     */
    public COTrueFalseEitherEnumType getOptedInEffective() {
        return optedInEffective;
    }

    /**
     * Sets the value of the optedInEffective property.
     * 
     * @param value
     *     allowed object is
     *     {@link COTrueFalseEitherEnumType }
     *     
     */
    public void setOptedInEffective(COTrueFalseEitherEnumType value) {
        this.optedInEffective = value;
    }

    /**
     * Gets the value of the maximumProductCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaximumProductCount() {
        return maximumProductCount;
    }

    /**
     * Sets the value of the maximumProductCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaximumProductCount(Integer value) {
        this.maximumProductCount = value;
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

}
