
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DateTimeSpanType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateTimeSpanType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="DateWindowRange" type="{http://www.opentravel.org/OTA/2003/05}TimeInstantType" minOccurs="0"/>
 *           &lt;element name="EndDateWindow" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attribute name="EarliestDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="LatestDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="DOW" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="StartDateWindow" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attribute name="EarliestDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="LatestDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="DOW" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="Start" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="End" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateTimeSpanType", propOrder = {
    "dateWindowRangeOrEndDateWindowOrStartDateWindow"
})
@XmlSeeAlso({
    org.opentravel.ota._2003._05.ResCommonDetailType.TimeSpan.class
})
public class DateTimeSpanType {

    @XmlElements({
        @XmlElement(name = "DateWindowRange", type = TimeInstantType.class),
        @XmlElement(name = "EndDateWindow", type = DateTimeSpanType.EndDateWindow.class),
        @XmlElement(name = "StartDateWindow", type = DateTimeSpanType.StartDateWindow.class)
    })
    protected List<Object> dateWindowRangeOrEndDateWindowOrStartDateWindow;
    @XmlAttribute(name = "Start", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar start;
    @XmlAttribute(name = "End", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar end;
    @XmlAttribute(name = "Duration")
    protected String duration;

    /**
     * Gets the value of the dateWindowRangeOrEndDateWindowOrStartDateWindow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateWindowRangeOrEndDateWindowOrStartDateWindow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateWindowRangeOrEndDateWindowOrStartDateWindow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeInstantType }
     * {@link DateTimeSpanType.EndDateWindow }
     * {@link DateTimeSpanType.StartDateWindow }
     * 
     * 
     */
    public List<Object> getDateWindowRangeOrEndDateWindowOrStartDateWindow() {
        if (dateWindowRangeOrEndDateWindowOrStartDateWindow == null) {
            dateWindowRangeOrEndDateWindowOrStartDateWindow = new ArrayList<Object>();
        }
        return this.dateWindowRangeOrEndDateWindowOrStartDateWindow;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStart(XMLGregorianCalendar value) {
        this.start = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnd(XMLGregorianCalendar value) {
        this.end = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="EarliestDate" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="LatestDate" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="DOW" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class EndDateWindow {

        @XmlAttribute(name = "EarliestDate")
        protected String earliestDate;
        @XmlAttribute(name = "LatestDate")
        protected String latestDate;
        @XmlAttribute(name = "DOW")
        protected DayOfWeekType dow;

        /**
         * Gets the value of the earliestDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEarliestDate() {
            return earliestDate;
        }

        /**
         * Sets the value of the earliestDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEarliestDate(String value) {
            this.earliestDate = value;
        }

        /**
         * Gets the value of the latestDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLatestDate() {
            return latestDate;
        }

        /**
         * Sets the value of the latestDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLatestDate(String value) {
            this.latestDate = value;
        }

        /**
         * Gets the value of the dow property.
         * 
         * @return
         *     possible object is
         *     {@link DayOfWeekType }
         *     
         */
        public DayOfWeekType getDOW() {
            return dow;
        }

        /**
         * Sets the value of the dow property.
         * 
         * @param value
         *     allowed object is
         *     {@link DayOfWeekType }
         *     
         */
        public void setDOW(DayOfWeekType value) {
            this.dow = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="EarliestDate" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="LatestDate" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="DOW" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StartDateWindow {

        @XmlAttribute(name = "EarliestDate")
        protected String earliestDate;
        @XmlAttribute(name = "LatestDate")
        protected String latestDate;
        @XmlAttribute(name = "DOW")
        protected DayOfWeekType dow;

        /**
         * Gets the value of the earliestDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEarliestDate() {
            return earliestDate;
        }

        /**
         * Sets the value of the earliestDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEarliestDate(String value) {
            this.earliestDate = value;
        }

        /**
         * Gets the value of the latestDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLatestDate() {
            return latestDate;
        }

        /**
         * Sets the value of the latestDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLatestDate(String value) {
            this.latestDate = value;
        }

        /**
         * Gets the value of the dow property.
         * 
         * @return
         *     possible object is
         *     {@link DayOfWeekType }
         *     
         */
        public DayOfWeekType getDOW() {
            return dow;
        }

        /**
         * Sets the value of the dow property.
         * 
         * @param value
         *     allowed object is
         *     {@link DayOfWeekType }
         *     
         */
        public void setDOW(DayOfWeekType value) {
            this.dow = value;
        }

    }

}
