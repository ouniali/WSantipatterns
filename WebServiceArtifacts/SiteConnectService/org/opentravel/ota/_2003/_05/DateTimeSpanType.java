
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateTimeSpanType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateTimeSpanType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="DateWindowRange" type="{http://www.opentravel.org/OTA/2003/05}TimeInstantType"/>
 *         &lt;sequence>
 *           &lt;element name="StartDateWindow" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}TimeWindowGroup"/>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="EndDateWindow" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}TimeWindowGroup"/>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/sequence>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateTimeSpanType", propOrder = {
    "dateWindowRange",
    "startDateWindow",
    "endDateWindow"
})
@XmlSeeAlso({
    org.opentravel.ota._2003._05.ResCommonDetailType.TimeSpan.class
})
public class DateTimeSpanType {

    @XmlElement(name = "DateWindowRange")
    protected TimeInstantType dateWindowRange;
    @XmlElement(name = "StartDateWindow")
    protected DateTimeSpanType.StartDateWindow startDateWindow;
    @XmlElement(name = "EndDateWindow")
    protected DateTimeSpanType.EndDateWindow endDateWindow;
    @XmlAttribute(name = "Start")
    protected String start;
    @XmlAttribute(name = "Duration")
    protected String duration;
    @XmlAttribute(name = "End")
    protected String end;

    /**
     * Gets the value of the dateWindowRange property.
     * 
     * @return
     *     possible object is
     *     {@link TimeInstantType }
     *     
     */
    public TimeInstantType getDateWindowRange() {
        return dateWindowRange;
    }

    /**
     * Sets the value of the dateWindowRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInstantType }
     *     
     */
    public void setDateWindowRange(TimeInstantType value) {
        this.dateWindowRange = value;
    }

    /**
     * Gets the value of the startDateWindow property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeSpanType.StartDateWindow }
     *     
     */
    public DateTimeSpanType.StartDateWindow getStartDateWindow() {
        return startDateWindow;
    }

    /**
     * Sets the value of the startDateWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeSpanType.StartDateWindow }
     *     
     */
    public void setStartDateWindow(DateTimeSpanType.StartDateWindow value) {
        this.startDateWindow = value;
    }

    /**
     * Gets the value of the endDateWindow property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeSpanType.EndDateWindow }
     *     
     */
    public DateTimeSpanType.EndDateWindow getEndDateWindow() {
        return endDateWindow;
    }

    /**
     * Sets the value of the endDateWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeSpanType.EndDateWindow }
     *     
     */
    public void setEndDateWindow(DateTimeSpanType.EndDateWindow value) {
        this.endDateWindow = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStart(String value) {
        this.start = value;
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
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnd(String value) {
        this.end = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}TimeWindowGroup"/>
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}TimeWindowGroup"/>
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
