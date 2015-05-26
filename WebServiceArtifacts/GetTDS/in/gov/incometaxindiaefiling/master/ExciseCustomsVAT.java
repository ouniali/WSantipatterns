
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
 *         &lt;element name="CustomDuty" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CounterVailDuty" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SplAddDuty" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UnionExciseDuty" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ServiceTax" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VATorSaleTax" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OthDutyTaxCess" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Cess" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotExciseCustomsVAT">
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
    "customDuty",
    "counterVailDuty",
    "splAddDuty",
    "unionExciseDuty",
    "serviceTax",
    "vaTorSaleTax",
    "othDutyTaxCess",
    "cess",
    "totExciseCustomsVAT"
})
@XmlRootElement(name = "ExciseCustomsVAT")
public class ExciseCustomsVAT {

    @XmlElement(name = "CustomDuty", defaultValue = "0")
    protected BigInteger customDuty;
    @XmlElement(name = "CounterVailDuty", defaultValue = "0")
    protected BigInteger counterVailDuty;
    @XmlElement(name = "SplAddDuty", defaultValue = "0")
    protected BigInteger splAddDuty;
    @XmlElement(name = "UnionExciseDuty", defaultValue = "0")
    protected BigInteger unionExciseDuty;
    @XmlElement(name = "ServiceTax", defaultValue = "0")
    protected BigInteger serviceTax;
    @XmlElement(name = "VATorSaleTax", defaultValue = "0")
    protected BigInteger vaTorSaleTax;
    @XmlElement(name = "OthDutyTaxCess", defaultValue = "0")
    protected BigInteger othDutyTaxCess;
    @XmlElement(name = "Cess", defaultValue = "0")
    protected BigInteger cess;
    @XmlElement(name = "TotExciseCustomsVAT", required = true, defaultValue = "0")
    protected BigInteger totExciseCustomsVAT;

    /**
     * Gets the value of the customDuty property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCustomDuty() {
        return customDuty;
    }

    /**
     * Sets the value of the customDuty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCustomDuty(BigInteger value) {
        this.customDuty = value;
    }

    /**
     * Gets the value of the counterVailDuty property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCounterVailDuty() {
        return counterVailDuty;
    }

    /**
     * Sets the value of the counterVailDuty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCounterVailDuty(BigInteger value) {
        this.counterVailDuty = value;
    }

    /**
     * Gets the value of the splAddDuty property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSplAddDuty() {
        return splAddDuty;
    }

    /**
     * Sets the value of the splAddDuty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSplAddDuty(BigInteger value) {
        this.splAddDuty = value;
    }

    /**
     * Gets the value of the unionExciseDuty property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUnionExciseDuty() {
        return unionExciseDuty;
    }

    /**
     * Sets the value of the unionExciseDuty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUnionExciseDuty(BigInteger value) {
        this.unionExciseDuty = value;
    }

    /**
     * Gets the value of the serviceTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getServiceTax() {
        return serviceTax;
    }

    /**
     * Sets the value of the serviceTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setServiceTax(BigInteger value) {
        this.serviceTax = value;
    }

    /**
     * Gets the value of the vaTorSaleTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVATorSaleTax() {
        return vaTorSaleTax;
    }

    /**
     * Sets the value of the vaTorSaleTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVATorSaleTax(BigInteger value) {
        this.vaTorSaleTax = value;
    }

    /**
     * Gets the value of the othDutyTaxCess property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOthDutyTaxCess() {
        return othDutyTaxCess;
    }

    /**
     * Sets the value of the othDutyTaxCess property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOthDutyTaxCess(BigInteger value) {
        this.othDutyTaxCess = value;
    }

    /**
     * Gets the value of the cess property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCess() {
        return cess;
    }

    /**
     * Sets the value of the cess property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCess(BigInteger value) {
        this.cess = value;
    }

    /**
     * Gets the value of the totExciseCustomsVAT property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotExciseCustomsVAT() {
        return totExciseCustomsVAT;
    }

    /**
     * Sets the value of the totExciseCustomsVAT property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotExciseCustomsVAT(BigInteger value) {
        this.totExciseCustomsVAT = value;
    }

}
