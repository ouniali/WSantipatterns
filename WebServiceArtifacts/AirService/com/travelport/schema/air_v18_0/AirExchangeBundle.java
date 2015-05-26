
package com.travelport.schema.air_v18_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v15_0.AirExchangeInfo;
import com.travelport.schema.common_v15_0.Penalty;


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
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}AirExchangeInfo"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}AirPricingInfoRef"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}Penalty" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TicketNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "airExchangeInfo",
    "airPricingInfoRef",
    "penalty"
})
@XmlRootElement(name = "AirExchangeBundle")
public class AirExchangeBundle {

    @XmlElement(name = "AirExchangeInfo", namespace = "http://www.travelport.com/schema/common_v15_0", required = true)
    protected AirExchangeInfo airExchangeInfo;
    @XmlElement(name = "AirPricingInfoRef", required = true)
    protected AirPricingInfoRef airPricingInfoRef;
    @XmlElement(name = "Penalty", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<Penalty> penalty;
    @XmlAttribute(name = "TicketNumber", required = true)
    protected String ticketNumber;

    /**
     * Gets the value of the airExchangeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AirExchangeInfo }
     *     
     */
    public AirExchangeInfo getAirExchangeInfo() {
        return airExchangeInfo;
    }

    /**
     * Sets the value of the airExchangeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirExchangeInfo }
     *     
     */
    public void setAirExchangeInfo(AirExchangeInfo value) {
        this.airExchangeInfo = value;
    }

    /**
     * Gets the value of the airPricingInfoRef property.
     * 
     * @return
     *     possible object is
     *     {@link AirPricingInfoRef }
     *     
     */
    public AirPricingInfoRef getAirPricingInfoRef() {
        return airPricingInfoRef;
    }

    /**
     * Sets the value of the airPricingInfoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirPricingInfoRef }
     *     
     */
    public void setAirPricingInfoRef(AirPricingInfoRef value) {
        this.airPricingInfoRef = value;
    }

    /**
     * Only used within an AirExchangeQuoteRsp
     * 						Gets the value of the penalty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the penalty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPenalty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Penalty }
     * 
     * 
     */
    public List<Penalty> getPenalty() {
        if (penalty == null) {
            penalty = new ArrayList<Penalty>();
        }
        return this.penalty;
    }

    /**
     * Gets the value of the ticketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketNumber() {
        return ticketNumber;
    }

    /**
     * Sets the value of the ticketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketNumber(String value) {
        this.ticketNumber = value;
    }

}
