
package com.travelport.schema.air_v18_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v15_0.TypeTicketStatus;


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
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}Coupon" maxOccurs="4"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}TicketEndorsement" maxOccurs="6" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}TourCode" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Key" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *       &lt;attribute name="TicketNumber" use="required" type="{http://www.travelport.com/schema/air_v18_0}typeTicketNumber" />
 *       &lt;attribute name="TicketStatus" type="{http://www.travelport.com/schema/common_v15_0}typeTicketStatus" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "coupon",
    "ticketEndorsement",
    "tourCode"
})
@XmlRootElement(name = "Ticket")
public class Ticket {

    @XmlElement(name = "Coupon", required = true)
    protected List<Coupon> coupon;
    @XmlElement(name = "TicketEndorsement")
    protected List<TicketEndorsement> ticketEndorsement;
    @XmlElement(name = "TourCode")
    protected List<TourCode> tourCode;
    @XmlAttribute(name = "Key")
    protected String key;
    @XmlAttribute(name = "TicketNumber", required = true)
    protected String ticketNumber;
    @XmlAttribute(name = "TicketStatus")
    protected TypeTicketStatus ticketStatus;

    /**
     * Gets the value of the coupon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coupon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoupon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Coupon }
     * 
     * 
     */
    public List<Coupon> getCoupon() {
        if (coupon == null) {
            coupon = new ArrayList<Coupon>();
        }
        return this.coupon;
    }

    /**
     * Gets the value of the ticketEndorsement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketEndorsement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketEndorsement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketEndorsement }
     * 
     * 
     */
    public List<TicketEndorsement> getTicketEndorsement() {
        if (ticketEndorsement == null) {
            ticketEndorsement = new ArrayList<TicketEndorsement>();
        }
        return this.ticketEndorsement;
    }

    /**
     * Gets the value of the tourCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tourCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTourCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TourCode }
     * 
     * 
     */
    public List<TourCode> getTourCode() {
        if (tourCode == null) {
            tourCode = new ArrayList<TourCode>();
        }
        return this.tourCode;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the ticketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketNumber() {
        return ticketNumber;
    }

    /**
     * Sets the value of the ticketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketNumber(String value) {
        this.ticketNumber = value;
    }

    /**
     * Gets the value of the ticketStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTicketStatus }
     *     
     */
    public TypeTicketStatus getTicketStatus() {
        return ticketStatus;
    }

    /**
     * Sets the value of the ticketStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTicketStatus }
     *     
     */
    public void setTicketStatus(TypeTicketStatus value) {
        this.ticketStatus = value;
    }

}
