
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
 *         &lt;element name="TotalTaxPayable">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SurchargeOnTaxPayable" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="EducationCess">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="GrossTaxLiability">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Section89" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Section90and91" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NetTaxLiability">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotalIntrstPay">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotTaxPlusIntrstPay">
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
    "totalTaxPayable",
    "surchargeOnTaxPayable",
    "educationCess",
    "grossTaxLiability",
    "section89",
    "section90And91",
    "netTaxLiability",
    "totalIntrstPay",
    "totTaxPlusIntrstPay"
})
@XmlRootElement(name = "ITR1_TaxComputation")
public class ITR1TaxComputation {

    @XmlElement(name = "TotalTaxPayable", required = true, defaultValue = "0")
    protected BigInteger totalTaxPayable;
    @XmlElement(name = "SurchargeOnTaxPayable", required = true)
    protected Object surchargeOnTaxPayable;
    @XmlElement(name = "EducationCess", required = true, defaultValue = "0")
    protected BigInteger educationCess;
    @XmlElement(name = "GrossTaxLiability", required = true, defaultValue = "0")
    protected BigInteger grossTaxLiability;
    @XmlElement(name = "Section89", defaultValue = "0")
    protected BigInteger section89;
    @XmlElement(name = "Section90and91", defaultValue = "0")
    protected BigInteger section90And91;
    @XmlElement(name = "NetTaxLiability", required = true, defaultValue = "0")
    protected BigInteger netTaxLiability;
    @XmlElement(name = "TotalIntrstPay", required = true, defaultValue = "0")
    protected BigInteger totalIntrstPay;
    @XmlElement(name = "TotTaxPlusIntrstPay", required = true, defaultValue = "0")
    protected BigInteger totTaxPlusIntrstPay;

    /**
     * Gets the value of the totalTaxPayable property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalTaxPayable() {
        return totalTaxPayable;
    }

    /**
     * Sets the value of the totalTaxPayable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalTaxPayable(BigInteger value) {
        this.totalTaxPayable = value;
    }

    /**
     * Gets the value of the surchargeOnTaxPayable property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSurchargeOnTaxPayable() {
        return surchargeOnTaxPayable;
    }

    /**
     * Sets the value of the surchargeOnTaxPayable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSurchargeOnTaxPayable(Object value) {
        this.surchargeOnTaxPayable = value;
    }

    /**
     * Gets the value of the educationCess property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEducationCess() {
        return educationCess;
    }

    /**
     * Sets the value of the educationCess property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEducationCess(BigInteger value) {
        this.educationCess = value;
    }

    /**
     * Gets the value of the grossTaxLiability property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGrossTaxLiability() {
        return grossTaxLiability;
    }

    /**
     * Sets the value of the grossTaxLiability property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGrossTaxLiability(BigInteger value) {
        this.grossTaxLiability = value;
    }

    /**
     * Gets the value of the section89 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSection89() {
        return section89;
    }

    /**
     * Sets the value of the section89 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSection89(BigInteger value) {
        this.section89 = value;
    }

    /**
     * Gets the value of the section90And91 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSection90And91() {
        return section90And91;
    }

    /**
     * Sets the value of the section90And91 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSection90And91(BigInteger value) {
        this.section90And91 = value;
    }

    /**
     * Gets the value of the netTaxLiability property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNetTaxLiability() {
        return netTaxLiability;
    }

    /**
     * Sets the value of the netTaxLiability property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNetTaxLiability(BigInteger value) {
        this.netTaxLiability = value;
    }

    /**
     * Gets the value of the totalIntrstPay property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalIntrstPay() {
        return totalIntrstPay;
    }

    /**
     * Sets the value of the totalIntrstPay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalIntrstPay(BigInteger value) {
        this.totalIntrstPay = value;
    }

    /**
     * Gets the value of the totTaxPlusIntrstPay property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotTaxPlusIntrstPay() {
        return totTaxPlusIntrstPay;
    }

    /**
     * Sets the value of the totTaxPlusIntrstPay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotTaxPlusIntrstPay(BigInteger value) {
        this.totTaxPlusIntrstPay = value;
    }

}
