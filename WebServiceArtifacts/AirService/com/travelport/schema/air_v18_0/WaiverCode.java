
package com.travelport.schema.air_v18_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
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
 *       &lt;attribute name="TourCode" type="{http://www.travelport.com/schema/air_v18_0}typeTourCode" />
 *       &lt;attribute name="TicketDesignator" type="{http://www.travelport.com/schema/air_v18_0}typeTicketDesignator" />
 *       &lt;attribute name="Endorsement">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="100"/>
 *             &lt;minLength value="0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "WaiverCode")
public class WaiverCode {

    @XmlAttribute(name = "TourCode")
    protected String tourCode;
    @XmlAttribute(name = "TicketDesignator")
    protected String ticketDesignator;
    @XmlAttribute(name = "Endorsement")
    protected String endorsement;

    /**
     * Gets the value of the tourCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourCode() {
        return tourCode;
    }

    /**
     * Sets the value of the tourCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourCode(String value) {
        this.tourCode = value;
    }

    /**
     * Gets the value of the ticketDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketDesignator() {
        return ticketDesignator;
    }

    /**
     * Sets the value of the ticketDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketDesignator(String value) {
        this.ticketDesignator = value;
    }

    /**
     * Gets the value of the endorsement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndorsement() {
        return endorsement;
    }

    /**
     * Sets the value of the endorsement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndorsement(String value) {
        this.endorsement = value;
    }

}
