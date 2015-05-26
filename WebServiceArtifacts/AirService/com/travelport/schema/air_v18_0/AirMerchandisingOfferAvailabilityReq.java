
package com.travelport.schema.air_v18_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v15_0.AgencySellInfo;
import com.travelport.schema.common_v15_0.BaseReq;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travelport.com/schema/common_v15_0}BaseReq">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}AgencySellInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}AirSolution" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}HostReservation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}OfferAvailabilityModifiers" maxOccurs="unbounded" minOccurs="0"/>
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
    "agencySellInfo",
    "airSolution",
    "hostReservation",
    "offerAvailabilityModifiers"
})
@XmlRootElement(name = "AirMerchandisingOfferAvailabilityReq")
public class AirMerchandisingOfferAvailabilityReq
    extends BaseReq
{

    @XmlElement(name = "AgencySellInfo", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected AgencySellInfo agencySellInfo;
    @XmlElement(name = "AirSolution")
    protected AirSolution airSolution;
    @XmlElement(name = "HostReservation")
    protected List<HostReservation> hostReservation;
    @XmlElement(name = "OfferAvailabilityModifiers")
    protected List<OfferAvailabilityModifiers> offerAvailabilityModifiers;

    /**
     * Gets the value of the agencySellInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AgencySellInfo }
     *     
     */
    public AgencySellInfo getAgencySellInfo() {
        return agencySellInfo;
    }

    /**
     * Sets the value of the agencySellInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencySellInfo }
     *     
     */
    public void setAgencySellInfo(AgencySellInfo value) {
        this.agencySellInfo = value;
    }

    /**
     * Gets the value of the airSolution property.
     * 
     * @return
     *     possible object is
     *     {@link AirSolution }
     *     
     */
    public AirSolution getAirSolution() {
        return airSolution;
    }

    /**
     * Sets the value of the airSolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSolution }
     *     
     */
    public void setAirSolution(AirSolution value) {
        this.airSolution = value;
    }

    /**
     * Gets the value of the hostReservation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostReservation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostReservation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostReservation }
     * 
     * 
     */
    public List<HostReservation> getHostReservation() {
        if (hostReservation == null) {
            hostReservation = new ArrayList<HostReservation>();
        }
        return this.hostReservation;
    }

    /**
     * Gets the value of the offerAvailabilityModifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerAvailabilityModifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferAvailabilityModifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferAvailabilityModifiers }
     * 
     * 
     */
    public List<OfferAvailabilityModifiers> getOfferAvailabilityModifiers() {
        if (offerAvailabilityModifiers == null) {
            offerAvailabilityModifiers = new ArrayList<OfferAvailabilityModifiers>();
        }
        return this.offerAvailabilityModifiers;
    }

}
