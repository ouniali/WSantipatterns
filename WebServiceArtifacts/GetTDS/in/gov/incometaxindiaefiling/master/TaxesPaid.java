
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
 *         &lt;element name="AdvanceTax" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TDS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TCS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SelfAssessmentTax" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotalTaxesPaid">
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
    "advanceTax",
    "tds",
    "tcs",
    "selfAssessmentTax",
    "totalTaxesPaid"
})
@XmlRootElement(name = "TaxesPaid")
public class TaxesPaid {

    @XmlElement(name = "AdvanceTax", defaultValue = "0")
    protected BigInteger advanceTax;
    @XmlElement(name = "TDS", defaultValue = "0")
    protected BigInteger tds;
    @XmlElement(name = "TCS", defaultValue = "0")
    protected BigInteger tcs;
    @XmlElement(name = "SelfAssessmentTax", defaultValue = "0")
    protected BigInteger selfAssessmentTax;
    @XmlElement(name = "TotalTaxesPaid", required = true, defaultValue = "0")
    protected BigInteger totalTaxesPaid;

    /**
     * Gets the value of the advanceTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAdvanceTax() {
        return advanceTax;
    }

    /**
     * Sets the value of the advanceTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAdvanceTax(BigInteger value) {
        this.advanceTax = value;
    }

    /**
     * Gets the value of the tds property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTDS() {
        return tds;
    }

    /**
     * Sets the value of the tds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTDS(BigInteger value) {
        this.tds = value;
    }

    /**
     * Gets the value of the tcs property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTCS() {
        return tcs;
    }

    /**
     * Sets the value of the tcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTCS(BigInteger value) {
        this.tcs = value;
    }

    /**
     * Gets the value of the selfAssessmentTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSelfAssessmentTax() {
        return selfAssessmentTax;
    }

    /**
     * Sets the value of the selfAssessmentTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSelfAssessmentTax(BigInteger value) {
        this.selfAssessmentTax = value;
    }

    /**
     * Gets the value of the totalTaxesPaid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalTaxesPaid() {
        return totalTaxesPaid;
    }

    /**
     * Sets the value of the totalTaxesPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalTaxesPaid(BigInteger value) {
        this.totalTaxesPaid = value;
    }

}
