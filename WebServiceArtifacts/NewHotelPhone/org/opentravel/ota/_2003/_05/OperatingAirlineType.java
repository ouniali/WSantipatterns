
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperatingAirlineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperatingAirlineType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>CompanyNameType">
 *       &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MarketingInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="BookedRBD" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TicketedRBD" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FrequentFlierMiles" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatingAirlineType")
public class OperatingAirlineType
    extends CompanyNameType
{

    @XmlAttribute(name = "FlightNumber")
    protected String flightNumber;
    @XmlAttribute(name = "ResBookDesigCode")
    protected String resBookDesigCode;
    @XmlAttribute(name = "MarketingInd")
    protected Boolean marketingInd;
    @XmlAttribute(name = "BookedRBD")
    protected String bookedRBD;
    @XmlAttribute(name = "TicketedRBD")
    protected String ticketedRBD;
    @XmlAttribute(name = "FrequentFlierMiles")
    protected String frequentFlierMiles;

    /**
     * Gets the value of the flightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Sets the value of the flightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumber(String value) {
        this.flightNumber = value;
    }

    /**
     * Gets the value of the resBookDesigCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResBookDesigCode() {
        return resBookDesigCode;
    }

    /**
     * Sets the value of the resBookDesigCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResBookDesigCode(String value) {
        this.resBookDesigCode = value;
    }

    /**
     * Gets the value of the marketingInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMarketingInd() {
        return marketingInd;
    }

    /**
     * Sets the value of the marketingInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarketingInd(Boolean value) {
        this.marketingInd = value;
    }

    /**
     * Gets the value of the bookedRBD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookedRBD() {
        return bookedRBD;
    }

    /**
     * Sets the value of the bookedRBD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookedRBD(String value) {
        this.bookedRBD = value;
    }

    /**
     * Gets the value of the ticketedRBD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketedRBD() {
        return ticketedRBD;
    }

    /**
     * Sets the value of the ticketedRBD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketedRBD(String value) {
        this.ticketedRBD = value;
    }

    /**
     * Gets the value of the frequentFlierMiles property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequentFlierMiles() {
        return frequentFlierMiles;
    }

    /**
     * Sets the value of the frequentFlierMiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequentFlierMiles(String value) {
        this.frequentFlierMiles = value;
    }

}
