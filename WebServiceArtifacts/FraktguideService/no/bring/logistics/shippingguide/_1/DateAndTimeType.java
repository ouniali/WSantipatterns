
package no.bring.logistics.shippingguide._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *               The date (and optionally time) the consignment will be shipped (used for computing estimated delivery date).
 *           
 * 
 * <p>Java class for DateAndTimeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateAndTimeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Month" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Day" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Hour" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Minute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeSlots" type="{http://www.bring.no/logistics/shippingguide/1.0}TimeSlotsType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateAndTimeType", propOrder = {

})
public class DateAndTimeType {

    @XmlElement(name = "Year", required = true)
    protected String year;
    @XmlElement(name = "Month", required = true)
    protected String month;
    @XmlElement(name = "Day", required = true)
    protected String day;
    @XmlElement(name = "Hour")
    protected String hour;
    @XmlElement(name = "Minute")
    protected String minute;
    @XmlElement(name = "TimeSlots")
    protected TimeSlotsType timeSlots;

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYear(String value) {
        this.year = value;
    }

    /**
     * Gets the value of the month property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonth(String value) {
        this.month = value;
    }

    /**
     * Gets the value of the day property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDay() {
        return day;
    }

    /**
     * Sets the value of the day property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDay(String value) {
        this.day = value;
    }

    /**
     * Gets the value of the hour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHour() {
        return hour;
    }

    /**
     * Sets the value of the hour property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHour(String value) {
        this.hour = value;
    }

    /**
     * Gets the value of the minute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinute() {
        return minute;
    }

    /**
     * Sets the value of the minute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinute(String value) {
        this.minute = value;
    }

    /**
     * Gets the value of the timeSlots property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSlotsType }
     *     
     */
    public TimeSlotsType getTimeSlots() {
        return timeSlots;
    }

    /**
     * Sets the value of the timeSlots property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSlotsType }
     *     
     */
    public void setTimeSlots(TimeSlotsType value) {
        this.timeSlots = value;
    }

}
