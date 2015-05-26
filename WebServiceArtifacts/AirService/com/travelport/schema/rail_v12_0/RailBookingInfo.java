
package com.travelport.schema.rail_v12_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="RailFareRef" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *       &lt;attribute name="RailJourneyRef" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *       &lt;attribute name="OptionalService" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "RailBookingInfo")
public class RailBookingInfo {

    @XmlAttribute(name = "RailFareRef", required = true)
    protected String railFareRef;
    @XmlAttribute(name = "RailJourneyRef", required = true)
    protected String railJourneyRef;
    @XmlAttribute(name = "OptionalService")
    protected Boolean optionalService;

    /**
     * Gets the value of the railFareRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRailFareRef() {
        return railFareRef;
    }

    /**
     * Sets the value of the railFareRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRailFareRef(String value) {
        this.railFareRef = value;
    }

    /**
     * Gets the value of the railJourneyRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRailJourneyRef() {
        return railJourneyRef;
    }

    /**
     * Sets the value of the railJourneyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRailJourneyRef(String value) {
        this.railJourneyRef = value;
    }

    /**
     * Gets the value of the optionalService property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOptionalService() {
        if (optionalService == null) {
            return false;
        } else {
            return optionalService;
        }
    }

    /**
     * Sets the value of the optionalService property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptionalService(Boolean value) {
        this.optionalService = value;
    }

}
