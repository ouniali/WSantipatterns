
package fr.chronopost.soap.shipping.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for appointmentValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="appointmentValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="timeSlotEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="timeSlotStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="timeSlotTariffLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "appointmentValue", propOrder = {
    "timeSlotEndDate",
    "timeSlotStartDate",
    "timeSlotTariffLevel"
})
public class AppointmentValue {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeSlotEndDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeSlotStartDate;
    protected String timeSlotTariffLevel;

    /**
     * Gets the value of the timeSlotEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeSlotEndDate() {
        return timeSlotEndDate;
    }

    /**
     * Sets the value of the timeSlotEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeSlotEndDate(XMLGregorianCalendar value) {
        this.timeSlotEndDate = value;
    }

    /**
     * Gets the value of the timeSlotStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeSlotStartDate() {
        return timeSlotStartDate;
    }

    /**
     * Sets the value of the timeSlotStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeSlotStartDate(XMLGregorianCalendar value) {
        this.timeSlotStartDate = value;
    }

    /**
     * Gets the value of the timeSlotTariffLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeSlotTariffLevel() {
        return timeSlotTariffLevel;
    }

    /**
     * Sets the value of the timeSlotTariffLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeSlotTariffLevel(String value) {
        this.timeSlotTariffLevel = value;
    }

}
