
package com.travelport.schema.air_v18_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v15_0.Name;
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
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}Name"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}ConjunctedTicketInfo" maxOccurs="3" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Status" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeTicketStatus" />
 *       &lt;attribute name="BulkTicket" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="BookingTravelerRef" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "name",
    "conjunctedTicketInfo"
})
@XmlRootElement(name = "TicketInfo")
public class TicketInfo {

    @XmlElement(name = "Name", namespace = "http://www.travelport.com/schema/common_v15_0", required = true)
    protected Name name;
    @XmlElement(name = "ConjunctedTicketInfo")
    protected List<ConjunctedTicketInfo> conjunctedTicketInfo;
    @XmlAttribute(name = "Number", required = true)
    protected String number;
    @XmlAttribute(name = "Status", required = true)
    protected TypeTicketStatus status;
    @XmlAttribute(name = "BulkTicket")
    protected Boolean bulkTicket;
    @XmlAttribute(name = "BookingTravelerRef", required = true)
    protected String bookingTravelerRef;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     */
    public Name getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link Name }
     *     
     */
    public void setName(Name value) {
        this.name = value;
    }

    /**
     * Gets the value of the conjunctedTicketInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conjunctedTicketInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConjunctedTicketInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConjunctedTicketInfo }
     * 
     * 
     */
    public List<ConjunctedTicketInfo> getConjunctedTicketInfo() {
        if (conjunctedTicketInfo == null) {
            conjunctedTicketInfo = new ArrayList<ConjunctedTicketInfo>();
        }
        return this.conjunctedTicketInfo;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTicketStatus }
     *     
     */
    public TypeTicketStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTicketStatus }
     *     
     */
    public void setStatus(TypeTicketStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the bulkTicket property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBulkTicket() {
        return bulkTicket;
    }

    /**
     * Sets the value of the bulkTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBulkTicket(Boolean value) {
        this.bulkTicket = value;
    }

    /**
     * Gets the value of the bookingTravelerRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingTravelerRef() {
        return bookingTravelerRef;
    }

    /**
     * Sets the value of the bookingTravelerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingTravelerRef(String value) {
        this.bookingTravelerRef = value;
    }

}
