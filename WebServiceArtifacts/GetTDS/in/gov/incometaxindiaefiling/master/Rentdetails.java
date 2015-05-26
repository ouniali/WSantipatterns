
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
 *         &lt;element name="AnnualLetableValue">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RentNotRealized">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LocalTaxes">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotalUnrealizedAndTax">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BalanceALV">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ThirtyPercentOfBalance">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IntOnBorwCap">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotalDeduct">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IncomeOfHP">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
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
    "annualLetableValue",
    "rentNotRealized",
    "localTaxes",
    "totalUnrealizedAndTax",
    "balanceALV",
    "thirtyPercentOfBalance",
    "intOnBorwCap",
    "totalDeduct",
    "incomeOfHP"
})
@XmlRootElement(name = "Rentdetails")
public class Rentdetails {

    @XmlElement(name = "AnnualLetableValue", required = true, defaultValue = "0")
    protected BigInteger annualLetableValue;
    @XmlElement(name = "RentNotRealized", required = true, defaultValue = "0")
    protected BigInteger rentNotRealized;
    @XmlElement(name = "LocalTaxes", required = true, defaultValue = "0")
    protected BigInteger localTaxes;
    @XmlElement(name = "TotalUnrealizedAndTax", required = true, defaultValue = "0")
    protected BigInteger totalUnrealizedAndTax;
    @XmlElement(name = "BalanceALV", defaultValue = "0")
    protected long balanceALV;
    @XmlElement(name = "ThirtyPercentOfBalance", required = true, defaultValue = "0")
    protected BigInteger thirtyPercentOfBalance;
    @XmlElement(name = "IntOnBorwCap", required = true, defaultValue = "0")
    protected BigInteger intOnBorwCap;
    @XmlElement(name = "TotalDeduct", required = true, defaultValue = "0")
    protected BigInteger totalDeduct;
    @XmlElement(name = "IncomeOfHP", defaultValue = "0")
    protected long incomeOfHP;

    /**
     * Gets the value of the annualLetableValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAnnualLetableValue() {
        return annualLetableValue;
    }

    /**
     * Sets the value of the annualLetableValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAnnualLetableValue(BigInteger value) {
        this.annualLetableValue = value;
    }

    /**
     * Gets the value of the rentNotRealized property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRentNotRealized() {
        return rentNotRealized;
    }

    /**
     * Sets the value of the rentNotRealized property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRentNotRealized(BigInteger value) {
        this.rentNotRealized = value;
    }

    /**
     * Gets the value of the localTaxes property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLocalTaxes() {
        return localTaxes;
    }

    /**
     * Sets the value of the localTaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLocalTaxes(BigInteger value) {
        this.localTaxes = value;
    }

    /**
     * Gets the value of the totalUnrealizedAndTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalUnrealizedAndTax() {
        return totalUnrealizedAndTax;
    }

    /**
     * Sets the value of the totalUnrealizedAndTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalUnrealizedAndTax(BigInteger value) {
        this.totalUnrealizedAndTax = value;
    }

    /**
     * Gets the value of the balanceALV property.
     * 
     */
    public long getBalanceALV() {
        return balanceALV;
    }

    /**
     * Sets the value of the balanceALV property.
     * 
     */
    public void setBalanceALV(long value) {
        this.balanceALV = value;
    }

    /**
     * Gets the value of the thirtyPercentOfBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getThirtyPercentOfBalance() {
        return thirtyPercentOfBalance;
    }

    /**
     * Sets the value of the thirtyPercentOfBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setThirtyPercentOfBalance(BigInteger value) {
        this.thirtyPercentOfBalance = value;
    }

    /**
     * Gets the value of the intOnBorwCap property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIntOnBorwCap() {
        return intOnBorwCap;
    }

    /**
     * Sets the value of the intOnBorwCap property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIntOnBorwCap(BigInteger value) {
        this.intOnBorwCap = value;
    }

    /**
     * Gets the value of the totalDeduct property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalDeduct() {
        return totalDeduct;
    }

    /**
     * Sets the value of the totalDeduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalDeduct(BigInteger value) {
        this.totalDeduct = value;
    }

    /**
     * Gets the value of the incomeOfHP property.
     * 
     */
    public long getIncomeOfHP() {
        return incomeOfHP;
    }

    /**
     * Sets the value of the incomeOfHP property.
     * 
     */
    public void setIncomeOfHP(long value) {
        this.incomeOfHP = value;
    }

}
