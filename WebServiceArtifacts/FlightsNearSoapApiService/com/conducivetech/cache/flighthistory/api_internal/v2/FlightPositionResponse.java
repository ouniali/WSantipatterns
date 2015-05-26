
package com.conducivetech.cache.flighthistory.api_internal.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for flightPositionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="flightPositionResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}responseImpl">
 *       &lt;sequence>
 *         &lt;element name="flightPositions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="flightPosition" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}flightPositionV2" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flightPositionResponse", propOrder = {
    "flightPositions"
})
@XmlSeeAlso({
    ResponseFlightsNearRadius.class,
    ResponseFlightsNearBox.class
})
public abstract class FlightPositionResponse
    extends ResponseImpl
{

    protected FlightPositionResponse.FlightPositions flightPositions;

    /**
     * Gets the value of the flightPositions property.
     * 
     * @return
     *     possible object is
     *     {@link FlightPositionResponse.FlightPositions }
     *     
     */
    public FlightPositionResponse.FlightPositions getFlightPositions() {
        return flightPositions;
    }

    /**
     * Sets the value of the flightPositions property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightPositionResponse.FlightPositions }
     *     
     */
    public void setFlightPositions(FlightPositionResponse.FlightPositions value) {
        this.flightPositions = value;
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
     *         &lt;element name="flightPosition" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}flightPositionV2" maxOccurs="unbounded" minOccurs="0"/>
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
        "flightPosition"
    })
    public static class FlightPositions {

        protected List<FlightPositionV2> flightPosition;

        /**
         * Gets the value of the flightPosition property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flightPosition property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlightPosition().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FlightPositionV2 }
         * 
         * 
         */
        public List<FlightPositionV2> getFlightPosition() {
            if (flightPosition == null) {
                flightPosition = new ArrayList<FlightPositionV2>();
            }
            return this.flightPosition;
        }

    }

}
