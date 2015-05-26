
package webservices;

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
 *         &lt;element name="Annual_Interest_Rate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Percent_Down" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Purchase_Price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Term_in_Years" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Property_Tax_Rate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Yearly_Insurance_Payment" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
    "annualInterestRate",
    "percentDown",
    "purchasePrice",
    "termInYears",
    "propertyTaxRate",
    "yearlyInsurancePayment"
})
@XmlRootElement(name = "InputType")
public class InputType {

    @XmlElement(name = "Annual_Interest_Rate")
    protected Double annualInterestRate;
    @XmlElement(name = "Percent_Down")
    protected Double percentDown;
    @XmlElement(name = "Purchase_Price")
    protected Double purchasePrice;
    @XmlElement(name = "Term_in_Years")
    protected Double termInYears;
    @XmlElement(name = "Property_Tax_Rate")
    protected Double propertyTaxRate;
    @XmlElement(name = "Yearly_Insurance_Payment")
    protected Double yearlyInsurancePayment;

    /**
     * Gets the value of the annualInterestRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAnnualInterestRate() {
        return annualInterestRate;
    }

    /**
     * Sets the value of the annualInterestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAnnualInterestRate(Double value) {
        this.annualInterestRate = value;
    }

    /**
     * Gets the value of the percentDown property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercentDown() {
        return percentDown;
    }

    /**
     * Sets the value of the percentDown property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercentDown(Double value) {
        this.percentDown = value;
    }

    /**
     * Gets the value of the purchasePrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPurchasePrice() {
        return purchasePrice;
    }

    /**
     * Sets the value of the purchasePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPurchasePrice(Double value) {
        this.purchasePrice = value;
    }

    /**
     * Gets the value of the termInYears property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTermInYears() {
        return termInYears;
    }

    /**
     * Sets the value of the termInYears property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTermInYears(Double value) {
        this.termInYears = value;
    }

    /**
     * Gets the value of the propertyTaxRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPropertyTaxRate() {
        return propertyTaxRate;
    }

    /**
     * Sets the value of the propertyTaxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPropertyTaxRate(Double value) {
        this.propertyTaxRate = value;
    }

    /**
     * Gets the value of the yearlyInsurancePayment property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getYearlyInsurancePayment() {
        return yearlyInsurancePayment;
    }

    /**
     * Sets the value of the yearlyInsurancePayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setYearlyInsurancePayment(Double value) {
        this.yearlyInsurancePayment = value;
    }

}
