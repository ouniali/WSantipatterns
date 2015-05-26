
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PkgTravelSegment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PkgTravelSegment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirSegment" type="{http://www.opentravel.org/OTA/2003/05}PkgAirSegmentType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PkgTravelSegment", propOrder = {
    "airSegment"
})
public class PkgTravelSegment {

    @XmlElement(name = "AirSegment", required = true)
    protected PkgAirSegmentType airSegment;

    /**
     * Gets the value of the airSegment property.
     * 
     * @return
     *     possible object is
     *     {@link PkgAirSegmentType }
     *     
     */
    public PkgAirSegmentType getAirSegment() {
        return airSegment;
    }

    /**
     * Sets the value of the airSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link PkgAirSegmentType }
     *     
     */
    public void setAirSegment(PkgAirSegmentType value) {
        this.airSegment = value;
    }

}
