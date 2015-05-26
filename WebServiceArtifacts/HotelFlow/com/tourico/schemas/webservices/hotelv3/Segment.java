
package com.tourico.schemas.webservices.hotelv3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Segment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Segment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Legs" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfLeg" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="totalDur" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="depArCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="arrDate" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="arrArCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="depDate" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Segment", propOrder = {
    "legs"
})
public class Segment {

    @XmlElement(name = "Legs")
    protected ArrayOfLeg legs;
    @XmlAttribute(name = "totalDur", required = true)
    protected int totalDur;
    @XmlAttribute(name = "depArCode")
    protected String depArCode;
    @XmlAttribute(name = "arrDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrDate;
    @XmlAttribute(name = "arrArCode")
    protected String arrArCode;
    @XmlAttribute(name = "depDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar depDate;

    /**
     * Gets the value of the legs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLeg }
     *     
     */
    public ArrayOfLeg getLegs() {
        return legs;
    }

    /**
     * Sets the value of the legs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLeg }
     *     
     */
    public void setLegs(ArrayOfLeg value) {
        this.legs = value;
    }

    /**
     * Gets the value of the totalDur property.
     * 
     */
    public int getTotalDur() {
        return totalDur;
    }

    /**
     * Sets the value of the totalDur property.
     * 
     */
    public void setTotalDur(int value) {
        this.totalDur = value;
    }

    /**
     * Gets the value of the depArCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepArCode() {
        return depArCode;
    }

    /**
     * Sets the value of the depArCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepArCode(String value) {
        this.depArCode = value;
    }

    /**
     * Gets the value of the arrDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrDate() {
        return arrDate;
    }

    /**
     * Sets the value of the arrDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrDate(XMLGregorianCalendar value) {
        this.arrDate = value;
    }

    /**
     * Gets the value of the arrArCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrArCode() {
        return arrArCode;
    }

    /**
     * Sets the value of the arrArCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrArCode(String value) {
        this.arrArCode = value;
    }

    /**
     * Gets the value of the depDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepDate() {
        return depDate;
    }

    /**
     * Sets the value of the depDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepDate(XMLGregorianCalendar value) {
        this.depDate = value;
    }

}
