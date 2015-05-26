
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
 *         &lt;element name="TaxAtNormalRatesOnAggrInc">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TaxAtSpecialRates">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TaxOnAggregateInc" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RebateOnAgriInc" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TaxPayableOnTotInc">
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
    "taxAtNormalRatesOnAggrInc",
    "taxAtSpecialRates",
    "taxOnAggregateInc",
    "rebateOnAgriInc",
    "taxPayableOnTotInc"
})
@XmlRootElement(name = "TaxPayableOnTI")
public class TaxPayableOnTI {

    @XmlElement(name = "TaxAtNormalRatesOnAggrInc", required = true, defaultValue = "0")
    protected BigInteger taxAtNormalRatesOnAggrInc;
    @XmlElement(name = "TaxAtSpecialRates", required = true, defaultValue = "0")
    protected BigInteger taxAtSpecialRates;
    @XmlElement(name = "TaxOnAggregateInc", defaultValue = "0")
    protected BigInteger taxOnAggregateInc;
    @XmlElement(name = "RebateOnAgriInc", defaultValue = "0")
    protected BigInteger rebateOnAgriInc;
    @XmlElement(name = "TaxPayableOnTotInc", required = true, defaultValue = "0")
    protected BigInteger taxPayableOnTotInc;

    /**
     * Gets the value of the taxAtNormalRatesOnAggrInc property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTaxAtNormalRatesOnAggrInc() {
        return taxAtNormalRatesOnAggrInc;
    }

    /**
     * Sets the value of the taxAtNormalRatesOnAggrInc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTaxAtNormalRatesOnAggrInc(BigInteger value) {
        this.taxAtNormalRatesOnAggrInc = value;
    }

    /**
     * Gets the value of the taxAtSpecialRates property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTaxAtSpecialRates() {
        return taxAtSpecialRates;
    }

    /**
     * Sets the value of the taxAtSpecialRates property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTaxAtSpecialRates(BigInteger value) {
        this.taxAtSpecialRates = value;
    }

    /**
     * Gets the value of the taxOnAggregateInc property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTaxOnAggregateInc() {
        return taxOnAggregateInc;
    }

    /**
     * Sets the value of the taxOnAggregateInc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTaxOnAggregateInc(BigInteger value) {
        this.taxOnAggregateInc = value;
    }

    /**
     * Gets the value of the rebateOnAgriInc property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRebateOnAgriInc() {
        return rebateOnAgriInc;
    }

    /**
     * Sets the value of the rebateOnAgriInc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRebateOnAgriInc(BigInteger value) {
        this.rebateOnAgriInc = value;
    }

    /**
     * Gets the value of the taxPayableOnTotInc property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTaxPayableOnTotInc() {
        return taxPayableOnTotInc;
    }

    /**
     * Sets the value of the taxPayableOnTotInc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTaxPayableOnTotInc(BigInteger value) {
        this.taxPayableOnTotInc = value;
    }

}
