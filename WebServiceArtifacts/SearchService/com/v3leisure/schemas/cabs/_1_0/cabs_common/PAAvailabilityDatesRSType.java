
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PA_AvailabilityDatesRSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PA_AvailabilityDatesRSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Nights" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}PA_AvailabilityNightsRSType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Days" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}PA_AvailabilityDaysRSType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PA_AvailabilityDatesRSType", propOrder = {
    "nights",
    "days"
})
public class PAAvailabilityDatesRSType {

    @XmlElement(name = "Nights")
    protected List<PAAvailabilityNightsRSType> nights;
    @XmlElement(name = "Days")
    protected List<PAAvailabilityDaysRSType> days;

    /**
     * Gets the value of the nights property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nights property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNights().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PAAvailabilityNightsRSType }
     * 
     * 
     */
    public List<PAAvailabilityNightsRSType> getNights() {
        if (nights == null) {
            nights = new ArrayList<PAAvailabilityNightsRSType>();
        }
        return this.nights;
    }

    /**
     * Gets the value of the days property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the days property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDays().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PAAvailabilityDaysRSType }
     * 
     * 
     */
    public List<PAAvailabilityDaysRSType> getDays() {
        if (days == null) {
            days = new ArrayList<PAAvailabilityDaysRSType>();
        }
        return this.days;
    }

}
