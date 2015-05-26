
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
 *         &lt;element name="IncomeFromSal" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}IncomeOthSrc" minOccurs="0"/>
 *         &lt;element name="GrossTotIncome" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DeductUndChapVIA" minOccurs="0"/>
 *         &lt;element name="TotalIncome" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="NetAgriculturalIncome" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AggregateIncome">
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
    "incomeFromSal",
    "incomeOthSrc",
    "grossTotIncome",
    "deductUndChapVIA",
    "totalIncome",
    "netAgriculturalIncome",
    "aggregateIncome"
})
@XmlRootElement(name = "IncomeDeductions")
public class IncomeDeductions {

    @XmlElement(name = "IncomeFromSal", defaultValue = "0")
    protected BigInteger incomeFromSal;
    @XmlElement(name = "IncomeOthSrc")
    protected IncomeOthSrc incomeOthSrc;
    @XmlElement(name = "GrossTotIncome", defaultValue = "0")
    protected long grossTotIncome;
    @XmlElement(name = "DeductUndChapVIA")
    protected DeductUndChapVIA deductUndChapVIA;
    @XmlElement(name = "TotalIncome", defaultValue = "0")
    protected long totalIncome;
    @XmlElement(name = "NetAgriculturalIncome", defaultValue = "0")
    protected BigInteger netAgriculturalIncome;
    @XmlElement(name = "AggregateIncome", required = true, defaultValue = "0")
    protected BigInteger aggregateIncome;

    /**
     * Gets the value of the incomeFromSal property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIncomeFromSal() {
        return incomeFromSal;
    }

    /**
     * Sets the value of the incomeFromSal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIncomeFromSal(BigInteger value) {
        this.incomeFromSal = value;
    }

    /**
     * Income chargeable under the Head ‘Other Sources’ (Interest)
     * 
     * @return
     *     possible object is
     *     {@link IncomeOthSrc }
     *     
     */
    public IncomeOthSrc getIncomeOthSrc() {
        return incomeOthSrc;
    }

    /**
     * Sets the value of the incomeOthSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncomeOthSrc }
     *     
     */
    public void setIncomeOthSrc(IncomeOthSrc value) {
        this.incomeOthSrc = value;
    }

    /**
     * Gets the value of the grossTotIncome property.
     * 
     */
    public long getGrossTotIncome() {
        return grossTotIncome;
    }

    /**
     * Sets the value of the grossTotIncome property.
     * 
     */
    public void setGrossTotIncome(long value) {
        this.grossTotIncome = value;
    }

    /**
     * Deductions from income
     * 
     * @return
     *     possible object is
     *     {@link DeductUndChapVIA }
     *     
     */
    public DeductUndChapVIA getDeductUndChapVIA() {
        return deductUndChapVIA;
    }

    /**
     * Sets the value of the deductUndChapVIA property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeductUndChapVIA }
     *     
     */
    public void setDeductUndChapVIA(DeductUndChapVIA value) {
        this.deductUndChapVIA = value;
    }

    /**
     * Gets the value of the totalIncome property.
     * 
     */
    public long getTotalIncome() {
        return totalIncome;
    }

    /**
     * Sets the value of the totalIncome property.
     * 
     */
    public void setTotalIncome(long value) {
        this.totalIncome = value;
    }

    /**
     * Gets the value of the netAgriculturalIncome property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNetAgriculturalIncome() {
        return netAgriculturalIncome;
    }

    /**
     * Sets the value of the netAgriculturalIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNetAgriculturalIncome(BigInteger value) {
        this.netAgriculturalIncome = value;
    }

    /**
     * Gets the value of the aggregateIncome property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAggregateIncome() {
        return aggregateIncome;
    }

    /**
     * Sets the value of the aggregateIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAggregateIncome(BigInteger value) {
        this.aggregateIncome = value;
    }

}
