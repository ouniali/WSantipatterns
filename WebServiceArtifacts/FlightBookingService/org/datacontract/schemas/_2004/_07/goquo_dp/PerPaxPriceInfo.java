
package org.datacontract.schemas._2004._07.goquo_dp;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PerPaxPriceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PerPaxPriceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PricePerPax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TaxPerPax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dispPricePerPax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dispTaxPerPax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dispTotalPricePerPax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerPaxPriceInfo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", propOrder = {
    "pricePerPax",
    "taxPerPax",
    "dispPricePerPax",
    "dispTaxPerPax",
    "dispTotalPricePerPax"
})
public class PerPaxPriceInfo {

    @XmlElement(name = "PricePerPax")
    protected BigDecimal pricePerPax;
    @XmlElement(name = "TaxPerPax")
    protected BigDecimal taxPerPax;
    @XmlElementRef(name = "dispPricePerPax", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispPricePerPax;
    @XmlElementRef(name = "dispTaxPerPax", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispTaxPerPax;
    @XmlElementRef(name = "dispTotalPricePerPax", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispTotalPricePerPax;

    /**
     * Gets the value of the pricePerPax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPricePerPax() {
        return pricePerPax;
    }

    /**
     * Sets the value of the pricePerPax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPricePerPax(BigDecimal value) {
        this.pricePerPax = value;
    }

    /**
     * Gets the value of the taxPerPax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxPerPax() {
        return taxPerPax;
    }

    /**
     * Sets the value of the taxPerPax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxPerPax(BigDecimal value) {
        this.taxPerPax = value;
    }

    /**
     * Gets the value of the dispPricePerPax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispPricePerPax() {
        return dispPricePerPax;
    }

    /**
     * Sets the value of the dispPricePerPax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispPricePerPax(JAXBElement<String> value) {
        this.dispPricePerPax = value;
    }

    /**
     * Gets the value of the dispTaxPerPax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispTaxPerPax() {
        return dispTaxPerPax;
    }

    /**
     * Sets the value of the dispTaxPerPax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispTaxPerPax(JAXBElement<String> value) {
        this.dispTaxPerPax = value;
    }

    /**
     * Gets the value of the dispTotalPricePerPax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispTotalPricePerPax() {
        return dispTotalPricePerPax;
    }

    /**
     * Sets the value of the dispTotalPricePerPax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispTotalPricePerPax(JAXBElement<String> value) {
        this.dispTotalPricePerPax = value;
    }

}
