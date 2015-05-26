
package com.travelport.schema.air_v18_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v15_0.BaseSearchReq;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travelport.com/schema/common_v15_0}BaseSearchReq">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}FlightTimeTableCriteria"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "flightTimeTableCriteria"
})
@XmlRootElement(name = "FlightTimeTableReq")
public class FlightTimeTableReq
    extends BaseSearchReq
{

    @XmlElement(name = "FlightTimeTableCriteria", required = true)
    protected FlightTimeTableCriteria flightTimeTableCriteria;

    /**
     * Gets the value of the flightTimeTableCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link FlightTimeTableCriteria }
     *     
     */
    public FlightTimeTableCriteria getFlightTimeTableCriteria() {
        return flightTimeTableCriteria;
    }

    /**
     * Sets the value of the flightTimeTableCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightTimeTableCriteria }
     *     
     */
    public void setFlightTimeTableCriteria(FlightTimeTableCriteria value) {
        this.flightTimeTableCriteria = value;
    }

}
