
package _170._0._168._192.tt.bookingapi;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargeBreakUp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChargeBreakUp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PriceId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ChargeType" type="{http://192.168.0.170/TT/BookingAPI}ChargeType"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargeBreakUp", propOrder = {
    "priceId",
    "chargeType",
    "amount"
})
public class ChargeBreakUp {

    @XmlElement(name = "PriceId")
    protected int priceId;
    @XmlElement(name = "ChargeType", required = true)
    @XmlSchemaType(name = "string")
    protected ChargeType chargeType;
    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;

    /**
     * Gets the value of the priceId property.
     * 
     */
    public int getPriceId() {
        return priceId;
    }

    /**
     * Sets the value of the priceId property.
     * 
     */
    public void setPriceId(int value) {
        this.priceId = value;
    }

    /**
     * Gets the value of the chargeType property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeType }
     *     
     */
    public ChargeType getChargeType() {
        return chargeType;
    }

    /**
     * Sets the value of the chargeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeType }
     *     
     */
    public void setChargeType(ChargeType value) {
        this.chargeType = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

}
