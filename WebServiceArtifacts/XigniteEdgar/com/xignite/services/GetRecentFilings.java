
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
 *         &lt;element name="Day" type="{http://www.xignite.com/services/}DayTypes"/>
 *         &lt;element name="Form" type="{http://www.xignite.com/services/}RecentFormTypes"/>
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
    "day",
    "form"
})
@XmlRootElement(name = "GetRecentFilings")
public class GetRecentFilings {

    @XmlElement(name = "Day", required = true)
    @XmlSchemaType(name = "string")
    protected DayTypes day;
    @XmlElement(name = "Form", required = true)
    @XmlSchemaType(name = "string")
    protected RecentFormTypes form;

    /**
     * Gets the value of the day property.
     * 
     * @return
     *     possible object is
     *     {@link DayTypes }
     *     
     */
    public DayTypes getDay() {
        return day;
    }

    /**
     * Sets the value of the day property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayTypes }
     *     
     */
    public void setDay(DayTypes value) {
        this.day = value;
    }

    /**
     * Gets the value of the form property.
     * 
     * @return
     *     possible object is
     *     {@link RecentFormTypes }
     *     
     */
    public RecentFormTypes getForm() {
        return form;
    }

    /**
     * Sets the value of the form property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecentFormTypes }
     *     
     */
    public void setForm(RecentFormTypes value) {
        this.form = value;
    }

}
