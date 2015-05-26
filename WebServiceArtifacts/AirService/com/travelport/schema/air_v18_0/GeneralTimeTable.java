
package com.travelport.schema.air_v18_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v15_0.TypeLocation;


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
 *         &lt;element name="DaysOfOperation" type="{http://www.travelport.com/schema/air_v18_0}typeDaysOfOperation"/>
 *         &lt;element name="FlightOrigin" type="{http://www.travelport.com/schema/common_v15_0}typeLocation"/>
 *         &lt;element name="FlightDestination" type="{http://www.travelport.com/schema/common_v15_0}typeLocation"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}CarrierList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="StartDate" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EndDate" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "daysOfOperation",
    "flightOrigin",
    "flightDestination",
    "carrierList"
})
@XmlRootElement(name = "GeneralTimeTable")
public class GeneralTimeTable {

    @XmlElement(name = "DaysOfOperation", required = true)
    protected TypeDaysOfOperation daysOfOperation;
    @XmlElement(name = "FlightOrigin", required = true)
    protected TypeLocation flightOrigin;
    @XmlElement(name = "FlightDestination", required = true)
    protected TypeLocation flightDestination;
    @XmlElement(name = "CarrierList")
    protected CarrierList carrierList;
    @XmlAttribute(name = "StartDate", required = true)
    protected String startDate;
    @XmlAttribute(name = "EndDate", required = true)
    protected String endDate;

    /**
     * Gets the value of the daysOfOperation property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDaysOfOperation }
     *     
     */
    public TypeDaysOfOperation getDaysOfOperation() {
        return daysOfOperation;
    }

    /**
     * Sets the value of the daysOfOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDaysOfOperation }
     *     
     */
    public void setDaysOfOperation(TypeDaysOfOperation value) {
        this.daysOfOperation = value;
    }

    /**
     * Gets the value of the flightOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link TypeLocation }
     *     
     */
    public TypeLocation getFlightOrigin() {
        return flightOrigin;
    }

    /**
     * Sets the value of the flightOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeLocation }
     *     
     */
    public void setFlightOrigin(TypeLocation value) {
        this.flightOrigin = value;
    }

    /**
     * Gets the value of the flightDestination property.
     * 
     * @return
     *     possible object is
     *     {@link TypeLocation }
     *     
     */
    public TypeLocation getFlightDestination() {
        return flightDestination;
    }

    /**
     * Sets the value of the flightDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeLocation }
     *     
     */
    public void setFlightDestination(TypeLocation value) {
        this.flightDestination = value;
    }

    /**
     * Gets the value of the carrierList property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierList }
     *     
     */
    public CarrierList getCarrierList() {
        return carrierList;
    }

    /**
     * Sets the value of the carrierList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierList }
     *     
     */
    public void setCarrierList(CarrierList value) {
        this.carrierList = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

}
