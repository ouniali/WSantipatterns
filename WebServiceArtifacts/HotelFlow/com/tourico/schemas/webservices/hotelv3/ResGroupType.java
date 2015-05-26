
package com.tourico.schemas.webservices.hotelv3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Reservation" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfReservationResType" minOccurs="0"/>
 *         &lt;element name="Billing" type="{http://schemas.tourico.com/webservices/hotelv3}BillingType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="rGID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="rgldRefNum" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResGroupType", propOrder = {
    "reservation",
    "billing"
})
public class ResGroupType {

    @XmlElement(name = "Reservation")
    protected ArrayOfReservationResType reservation;
    @XmlElement(name = "Billing")
    protected BillingType billing;
    @XmlAttribute(name = "rGID", required = true)
    protected int rgid;
    @XmlAttribute(name = "rgldRefNum")
    protected String rgldRefNum;

    /**
     * Gets the value of the reservation property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReservationResType }
     *     
     */
    public ArrayOfReservationResType getReservation() {
        return reservation;
    }

    /**
     * Sets the value of the reservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReservationResType }
     *     
     */
    public void setReservation(ArrayOfReservationResType value) {
        this.reservation = value;
    }

    /**
     * Gets the value of the billing property.
     * 
     * @return
     *     possible object is
     *     {@link BillingType }
     *     
     */
    public BillingType getBilling() {
        return billing;
    }

    /**
     * Sets the value of the billing property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingType }
     *     
     */
    public void setBilling(BillingType value) {
        this.billing = value;
    }

    /**
     * Gets the value of the rgid property.
     * 
     */
    public int getRGID() {
        return rgid;
    }

    /**
     * Sets the value of the rgid property.
     * 
     */
    public void setRGID(int value) {
        this.rgid = value;
    }

    /**
     * Gets the value of the rgldRefNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRgldRefNum() {
        return rgldRefNum;
    }

    /**
     * Sets the value of the rgldRefNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRgldRefNum(String value) {
        this.rgldRefNum = value;
    }

}
