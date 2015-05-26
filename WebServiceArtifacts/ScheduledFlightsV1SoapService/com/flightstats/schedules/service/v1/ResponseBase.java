
package com.flightstats.schedules.service.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for responseBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="responseBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="scheduledFlights" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="scheduledFlight" type="{http://v1.service.schedules.flightstats.com/}scheduledFlightV1" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="appendix" type="{http://v1.service.schedules.flightstats.com/}appendices" minOccurs="0"/>
 *         &lt;element name="error" type="{http://v1.service.schedules.flightstats.com/}apiResponseError" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseBase", propOrder = {
    "scheduledFlights",
    "appendix",
    "error"
})
@XmlSeeAlso({
    ResponseByRoute.class,
    ResponseByAirport.class,
    ResponseByFlight.class
})
public class ResponseBase {

    protected ResponseBase.ScheduledFlights scheduledFlights;
    protected Appendices appendix;
    protected ApiResponseError error;

    /**
     * Gets the value of the scheduledFlights property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseBase.ScheduledFlights }
     *     
     */
    public ResponseBase.ScheduledFlights getScheduledFlights() {
        return scheduledFlights;
    }

    /**
     * Sets the value of the scheduledFlights property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseBase.ScheduledFlights }
     *     
     */
    public void setScheduledFlights(ResponseBase.ScheduledFlights value) {
        this.scheduledFlights = value;
    }

    /**
     * Gets the value of the appendix property.
     * 
     * @return
     *     possible object is
     *     {@link Appendices }
     *     
     */
    public Appendices getAppendix() {
        return appendix;
    }

    /**
     * Sets the value of the appendix property.
     * 
     * @param value
     *     allowed object is
     *     {@link Appendices }
     *     
     */
    public void setAppendix(Appendices value) {
        this.appendix = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link ApiResponseError }
     *     
     */
    public ApiResponseError getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiResponseError }
     *     
     */
    public void setError(ApiResponseError value) {
        this.error = value;
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
     *       &lt;sequence>
     *         &lt;element name="scheduledFlight" type="{http://v1.service.schedules.flightstats.com/}scheduledFlightV1" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "scheduledFlight"
    })
    public static class ScheduledFlights {

        protected List<ScheduledFlightV1> scheduledFlight;

        /**
         * Gets the value of the scheduledFlight property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the scheduledFlight property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getScheduledFlight().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ScheduledFlightV1 }
         * 
         * 
         */
        public List<ScheduledFlightV1> getScheduledFlight() {
            if (scheduledFlight == null) {
                scheduledFlight = new ArrayList<ScheduledFlightV1>();
            }
            return this.scheduledFlight;
        }

    }

}
