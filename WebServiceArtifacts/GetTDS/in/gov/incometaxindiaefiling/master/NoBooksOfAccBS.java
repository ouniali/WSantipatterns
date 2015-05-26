
package in.gov.incometaxindiaefiling.master;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence>
 *         &lt;element name="TotSundryDbtAmt">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotSundryCrdAmt">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotStkInTradAmt">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CashBalAmt">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
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
    "totSundryDbtAmt",
    "totSundryCrdAmt",
    "totStkInTradAmt",
    "cashBalAmt"
})
@XmlRootElement(name = "NoBooksOfAccBS")
public class NoBooksOfAccBS {

    @XmlElement(name = "TotSundryDbtAmt", required = true, defaultValue = "0")
    protected BigInteger totSundryDbtAmt;
    @XmlElement(name = "TotSundryCrdAmt", required = true, defaultValue = "0")
    protected BigInteger totSundryCrdAmt;
    @XmlElement(name = "TotStkInTradAmt", required = true, defaultValue = "0")
    protected BigInteger totStkInTradAmt;
    @XmlElement(name = "CashBalAmt", required = true, defaultValue = "0")
    protected BigInteger cashBalAmt;

    /**
     * Gets the value of the totSundryDbtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotSundryDbtAmt() {
        return totSundryDbtAmt;
    }

    /**
     * Sets the value of the totSundryDbtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotSundryDbtAmt(BigInteger value) {
        this.totSundryDbtAmt = value;
    }

    /**
     * Gets the value of the totSundryCrdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotSundryCrdAmt() {
        return totSundryCrdAmt;
    }

    /**
     * Sets the value of the totSundryCrdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotSundryCrdAmt(BigInteger value) {
        this.totSundryCrdAmt = value;
    }

    /**
     * Gets the value of the totStkInTradAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotStkInTradAmt() {
        return totStkInTradAmt;
    }

    /**
     * Sets the value of the totStkInTradAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotStkInTradAmt(BigInteger value) {
        this.totStkInTradAmt = value;
    }

    /**
     * Gets the value of the cashBalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCashBalAmt() {
        return cashBalAmt;
    }

    /**
     * Sets the value of the cashBalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCashBalAmt(BigInteger value) {
        this.cashBalAmt = value;
    }

}
