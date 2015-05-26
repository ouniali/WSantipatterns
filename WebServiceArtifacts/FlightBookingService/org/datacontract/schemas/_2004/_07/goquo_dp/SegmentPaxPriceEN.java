
package org.datacontract.schemas._2004._07.goquo_dp;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SegmentPaxPriceEN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SegmentPaxPriceEN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdultFareTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AdultTaxTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ChildFareTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ChildTaxTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="InfantFareTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="InfantTaxTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentPaxPriceEN", propOrder = {
    "adultFareTotal",
    "adultTaxTotal",
    "childFareTotal",
    "childTaxTotal",
    "infantFareTotal",
    "infantTaxTotal"
})
@XmlSeeAlso({
    FlightReservationSegmentsEN.class
})
public class SegmentPaxPriceEN {

    @XmlElement(name = "AdultFareTotal")
    protected BigDecimal adultFareTotal;
    @XmlElement(name = "AdultTaxTotal")
    protected BigDecimal adultTaxTotal;
    @XmlElement(name = "ChildFareTotal")
    protected BigDecimal childFareTotal;
    @XmlElement(name = "ChildTaxTotal")
    protected BigDecimal childTaxTotal;
    @XmlElement(name = "InfantFareTotal")
    protected BigDecimal infantFareTotal;
    @XmlElement(name = "InfantTaxTotal")
    protected BigDecimal infantTaxTotal;

    /**
     * Gets the value of the adultFareTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdultFareTotal() {
        return adultFareTotal;
    }

    /**
     * Sets the value of the adultFareTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdultFareTotal(BigDecimal value) {
        this.adultFareTotal = value;
    }

    /**
     * Gets the value of the adultTaxTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdultTaxTotal() {
        return adultTaxTotal;
    }

    /**
     * Sets the value of the adultTaxTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdultTaxTotal(BigDecimal value) {
        this.adultTaxTotal = value;
    }

    /**
     * Gets the value of the childFareTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChildFareTotal() {
        return childFareTotal;
    }

    /**
     * Sets the value of the childFareTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChildFareTotal(BigDecimal value) {
        this.childFareTotal = value;
    }

    /**
     * Gets the value of the childTaxTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChildTaxTotal() {
        return childTaxTotal;
    }

    /**
     * Sets the value of the childTaxTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChildTaxTotal(BigDecimal value) {
        this.childTaxTotal = value;
    }

    /**
     * Gets the value of the infantFareTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInfantFareTotal() {
        return infantFareTotal;
    }

    /**
     * Sets the value of the infantFareTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInfantFareTotal(BigDecimal value) {
        this.infantFareTotal = value;
    }

    /**
     * Gets the value of the infantTaxTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInfantTaxTotal() {
        return infantTaxTotal;
    }

    /**
     * Sets the value of the infantTaxTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInfantTaxTotal(BigDecimal value) {
        this.infantTaxTotal = value;
    }

}
