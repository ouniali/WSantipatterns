
package no.bring.logistics.shippingguide._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeSlotType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeSlotType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StartTime" type="{http://www.bring.no/logistics/shippingguide/1.0}DayTimeType"/>
 *         &lt;element name="EndTime" type="{http://www.bring.no/logistics/shippingguide/1.0}DayTimeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeSlotType", propOrder = {
    "startTime",
    "endTime"
})
public class TimeSlotType {

    @XmlElement(name = "StartTime", required = true)
    protected DayTimeType startTime;
    @XmlElement(name = "EndTime", required = true)
    protected DayTimeType endTime;

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link DayTimeType }
     *     
     */
    public DayTimeType getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayTimeType }
     *     
     */
    public void setStartTime(DayTimeType value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link DayTimeType }
     *     
     */
    public DayTimeType getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayTimeType }
     *     
     */
    public void setEndTime(DayTimeType value) {
        this.endTime = value;
    }

}
