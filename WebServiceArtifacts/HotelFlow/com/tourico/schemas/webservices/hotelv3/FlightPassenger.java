
package com.tourico.schemas.webservices.hotelv3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightPassenger complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightPassenger">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.tourico.com/webservices/hotelv3}Passenger">
 *       &lt;sequence>
 *         &lt;element name="FrequentTravellerDetails" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfFrequentTraveller" minOccurs="0"/>
 *         &lt;element name="PreferredSeat" type="{http://schemas.tourico.com/webservices/hotelv3}PreferredSeat" minOccurs="0"/>
 *         &lt;element name="PreferredMeal" type="{http://schemas.tourico.com/webservices/hotelv3}PreferredMeal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightPassenger", propOrder = {
    "frequentTravellerDetails",
    "preferredSeat",
    "preferredMeal"
})
public class FlightPassenger
    extends Passenger
{

    @XmlElement(name = "FrequentTravellerDetails")
    protected ArrayOfFrequentTraveller frequentTravellerDetails;
    @XmlElement(name = "PreferredSeat")
    protected PreferredSeat preferredSeat;
    @XmlElement(name = "PreferredMeal")
    protected PreferredMeal preferredMeal;

    /**
     * Gets the value of the frequentTravellerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFrequentTraveller }
     *     
     */
    public ArrayOfFrequentTraveller getFrequentTravellerDetails() {
        return frequentTravellerDetails;
    }

    /**
     * Sets the value of the frequentTravellerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFrequentTraveller }
     *     
     */
    public void setFrequentTravellerDetails(ArrayOfFrequentTraveller value) {
        this.frequentTravellerDetails = value;
    }

    /**
     * Gets the value of the preferredSeat property.
     * 
     * @return
     *     possible object is
     *     {@link PreferredSeat }
     *     
     */
    public PreferredSeat getPreferredSeat() {
        return preferredSeat;
    }

    /**
     * Sets the value of the preferredSeat property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferredSeat }
     *     
     */
    public void setPreferredSeat(PreferredSeat value) {
        this.preferredSeat = value;
    }

    /**
     * Gets the value of the preferredMeal property.
     * 
     * @return
     *     possible object is
     *     {@link PreferredMeal }
     *     
     */
    public PreferredMeal getPreferredMeal() {
        return preferredMeal;
    }

    /**
     * Sets the value of the preferredMeal property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferredMeal }
     *     
     */
    public void setPreferredMeal(PreferredMeal value) {
        this.preferredMeal = value;
    }

}
