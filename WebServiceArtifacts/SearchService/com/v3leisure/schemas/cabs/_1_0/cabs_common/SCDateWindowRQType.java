
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SC_DateWindowRQType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SC_DateWindowRQType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommencingDaysRQ" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}SC_DaysOfWeekType" minOccurs="0"/>
 *         &lt;element name="ConcludingDaysRQ" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}SC_DaysOfWeekType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="start_date" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="finish_date" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SC_DateWindowRQType", propOrder = {
    "commencingDaysRQ",
    "concludingDaysRQ"
})
public class SCDateWindowRQType {

    @XmlElement(name = "CommencingDaysRQ")
    protected SCDaysOfWeekType commencingDaysRQ;
    @XmlElement(name = "ConcludingDaysRQ")
    protected SCDaysOfWeekType concludingDaysRQ;
    @XmlAttribute(name = "start_date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlAttribute(name = "finish_date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar finishDate;

    /**
     * Gets the value of the commencingDaysRQ property.
     * 
     * @return
     *     possible object is
     *     {@link SCDaysOfWeekType }
     *     
     */
    public SCDaysOfWeekType getCommencingDaysRQ() {
        return commencingDaysRQ;
    }

    /**
     * Sets the value of the commencingDaysRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCDaysOfWeekType }
     *     
     */
    public void setCommencingDaysRQ(SCDaysOfWeekType value) {
        this.commencingDaysRQ = value;
    }

    /**
     * Gets the value of the concludingDaysRQ property.
     * 
     * @return
     *     possible object is
     *     {@link SCDaysOfWeekType }
     *     
     */
    public SCDaysOfWeekType getConcludingDaysRQ() {
        return concludingDaysRQ;
    }

    /**
     * Sets the value of the concludingDaysRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCDaysOfWeekType }
     *     
     */
    public void setConcludingDaysRQ(SCDaysOfWeekType value) {
        this.concludingDaysRQ = value;
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
