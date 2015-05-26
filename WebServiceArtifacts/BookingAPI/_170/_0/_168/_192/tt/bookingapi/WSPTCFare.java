
package _170._0._168._192.tt.bookingapi;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSPTCFare complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSPTCFare">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PassengerType" type="{http://192.168.0.170/TT/BookingAPI}PassengerType"/>
 *         &lt;element name="PassengerCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BaseFare" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Tax" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="AirlineTransFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="AdditionalTxnFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="FuelSurcharge" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="AgentServiceCharge" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="AgentConvienceCharges" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSPTCFare", propOrder = {
    "passengerType",
    "passengerCount",
    "baseFare",
    "tax",
    "airlineTransFee",
    "additionalTxnFee",
    "fuelSurcharge",
    "agentServiceCharge",
    "agentConvienceCharges"
})
public class WSPTCFare {

    @XmlElement(name = "PassengerType", required = true)
    @XmlSchemaType(name = "string")
    protected PassengerType passengerType;
    @XmlElement(name = "PassengerCount")
    protected int passengerCount;
    @XmlElement(name = "BaseFare", required = true)
    protected BigDecimal baseFare;
    @XmlElement(name = "Tax", required = true)
    protected BigDecimal tax;
    @XmlElement(name = "AirlineTransFee", required = true)
    protected BigDecimal airlineTransFee;
    @XmlElement(name = "AdditionalTxnFee", required = true)
    protected BigDecimal additionalTxnFee;
    @XmlElement(name = "FuelSurcharge", required = true)
    protected BigDecimal fuelSurcharge;
    @XmlElement(name = "AgentServiceCharge", required = true)
    protected BigDecimal agentServiceCharge;
    @XmlElement(name = "AgentConvienceCharges", required = true)
    protected BigDecimal agentConvienceCharges;

    /**
     * Gets the value of the passengerType property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerType }
     *     
     */
    public PassengerType getPassengerType() {
        return passengerType;
    }

    /**
     * Sets the value of the passengerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerType }
     *     
     */
    public void setPassengerType(PassengerType value) {
        this.passengerType = value;
    }

    /**
     * Gets the value of the passengerCount property.
     * 
     */
    public int getPassengerCount() {
        return passengerCount;
    }

    /**
     * Sets the value of the passengerCount property.
     * 
     */
    public void setPassengerCount(int value) {
        this.passengerCount = value;
    }

    /**
     * Gets the value of the baseFare property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBaseFare() {
        return baseFare;
    }

    /**
     * Sets the value of the baseFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBaseFare(BigDecimal value) {
        this.baseFare = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTax(BigDecimal value) {
        this.tax = value;
    }

    /**
     * Gets the value of the airlineTransFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAirlineTransFee() {
        return airlineTransFee;
    }

    /**
     * Sets the value of the airlineTransFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAirlineTransFee(BigDecimal value) {
        this.airlineTransFee = value;
    }

    /**
     * Gets the value of the additionalTxnFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdditionalTxnFee() {
        return additionalTxnFee;
    }

    /**
     * Sets the value of the additionalTxnFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdditionalTxnFee(BigDecimal value) {
        this.additionalTxnFee = value;
    }

    /**
     * Gets the value of the fuelSurcharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFuelSurcharge() {
        return fuelSurcharge;
    }

    /**
     * Sets the value of the fuelSurcharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFuelSurcharge(BigDecimal value) {
        this.fuelSurcharge = value;
    }

    /**
     * Gets the value of the agentServiceCharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAgentServiceCharge() {
        return agentServiceCharge;
    }

    /**
     * Sets the value of the agentServiceCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAgentServiceCharge(BigDecimal value) {
        this.agentServiceCharge = value;
    }

    /**
     * Gets the value of the agentConvienceCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAgentConvienceCharges() {
        return agentConvienceCharges;
    }

    /**
     * Sets the value of the agentConvienceCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAgentConvienceCharges(BigDecimal value) {
        this.agentConvienceCharges = value;
    }

}
