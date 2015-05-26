
package org.datacontract.schemas._2004._07.goquo_dp;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaxPriceDifference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaxPriceDifference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PerAdultFareDiff" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PerAdultTaxDiff" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PerChildFareDiff" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PerChildTaxDiff" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PerInfantFareDiff" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PerInfantTaxDiff" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaxPriceDifference", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", propOrder = {
    "perAdultFareDiff",
    "perAdultTaxDiff",
    "perChildFareDiff",
    "perChildTaxDiff",
    "perInfantFareDiff",
    "perInfantTaxDiff"
})
public class PaxPriceDifference {

    @XmlElement(name = "PerAdultFareDiff")
    protected BigDecimal perAdultFareDiff;
    @XmlElement(name = "PerAdultTaxDiff")
    protected BigDecimal perAdultTaxDiff;
    @XmlElement(name = "PerChildFareDiff")
    protected BigDecimal perChildFareDiff;
    @XmlElement(name = "PerChildTaxDiff")
    protected BigDecimal perChildTaxDiff;
    @XmlElement(name = "PerInfantFareDiff")
    protected BigDecimal perInfantFareDiff;
    @XmlElement(name = "PerInfantTaxDiff")
    protected BigDecimal perInfantTaxDiff;

    /**
     * Gets the value of the perAdultFareDiff property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPerAdultFareDiff() {
        return perAdultFareDiff;
    }

    /**
     * Sets the value of the perAdultFareDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPerAdultFareDiff(BigDecimal value) {
        this.perAdultFareDiff = value;
    }

    /**
     * Gets the value of the perAdultTaxDiff property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPerAdultTaxDiff() {
        return perAdultTaxDiff;
    }

    /**
     * Sets the value of the perAdultTaxDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPerAdultTaxDiff(BigDecimal value) {
        this.perAdultTaxDiff = value;
    }

    /**
     * Gets the value of the perChildFareDiff property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPerChildFareDiff() {
        return perChildFareDiff;
    }

    /**
     * Sets the value of the perChildFareDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPerChildFareDiff(BigDecimal value) {
        this.perChildFareDiff = value;
    }

    /**
     * Gets the value of the perChildTaxDiff property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPerChildTaxDiff() {
        return perChildTaxDiff;
    }

    /**
     * Sets the value of the perChildTaxDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPerChildTaxDiff(BigDecimal value) {
        this.perChildTaxDiff = value;
    }

    /**
     * Gets the value of the perInfantFareDiff property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPerInfantFareDiff() {
        return perInfantFareDiff;
    }

    /**
     * Sets the value of the perInfantFareDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPerInfantFareDiff(BigDecimal value) {
        this.perInfantFareDiff = value;
    }

    /**
     * Gets the value of the perInfantTaxDiff property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPerInfantTaxDiff() {
        return perInfantTaxDiff;
    }

    /**
     * Sets the value of the perInfantTaxDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPerInfantTaxDiff(BigDecimal value) {
        this.perInfantTaxDiff = value;
    }

}
