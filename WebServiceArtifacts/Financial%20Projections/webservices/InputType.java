
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
 *         &lt;element name="Initial_Sales" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Sales_Growth_Rate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Return_Percent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="COGS_Percent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Fixed_Costs" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Depreciation" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Other" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Interest" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Tax_Rate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Initial_Cash" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Accounts_Receivable" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Equipment" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Property" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Accounts_Payable" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Short_Term_Debt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Long_Term_Debt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
    "initialSales",
    "salesGrowthRate",
    "returnPercent",
    "cogsPercent",
    "fixedCosts",
    "depreciation",
    "other",
    "interest",
    "taxRate",
    "initialCash",
    "accountsReceivable",
    "equipment",
    "property",
    "accountsPayable",
    "shortTermDebt",
    "longTermDebt"
})
@XmlRootElement(name = "InputType")
public class InputType {

    @XmlElement(name = "Initial_Sales")
    protected Double initialSales;
    @XmlElement(name = "Sales_Growth_Rate")
    protected Double salesGrowthRate;
    @XmlElement(name = "Return_Percent")
    protected Double returnPercent;
    @XmlElement(name = "COGS_Percent")
    protected Double cogsPercent;
    @XmlElement(name = "Fixed_Costs")
    protected Double fixedCosts;
    @XmlElement(name = "Depreciation")
    protected Double depreciation;
    @XmlElement(name = "Other")
    protected Double other;
    @XmlElement(name = "Interest")
    protected Double interest;
    @XmlElement(name = "Tax_Rate")
    protected Double taxRate;
    @XmlElement(name = "Initial_Cash")
    protected Double initialCash;
    @XmlElement(name = "Accounts_Receivable")
    protected Double accountsReceivable;
    @XmlElement(name = "Equipment")
    protected Double equipment;
    @XmlElement(name = "Property")
    protected Double property;
    @XmlElement(name = "Accounts_Payable")
    protected Double accountsPayable;
    @XmlElement(name = "Short_Term_Debt")
    protected Double shortTermDebt;
    @XmlElement(name = "Long_Term_Debt")
    protected Double longTermDebt;

    /**
     * Gets the value of the initialSales property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInitialSales() {
        return initialSales;
    }

    /**
     * Sets the value of the initialSales property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInitialSales(Double value) {
        this.initialSales = value;
    }

    /**
     * Gets the value of the salesGrowthRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSalesGrowthRate() {
        return salesGrowthRate;
    }

    /**
     * Sets the value of the salesGrowthRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSalesGrowthRate(Double value) {
        this.salesGrowthRate = value;
    }

    /**
     * Gets the value of the returnPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getReturnPercent() {
        return returnPercent;
    }

    /**
     * Sets the value of the returnPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setReturnPercent(Double value) {
        this.returnPercent = value;
    }

    /**
     * Gets the value of the cogsPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCOGSPercent() {
        return cogsPercent;
    }

    /**
     * Sets the value of the cogsPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCOGSPercent(Double value) {
        this.cogsPercent = value;
    }

    /**
     * Gets the value of the fixedCosts property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFixedCosts() {
        return fixedCosts;
    }

    /**
     * Sets the value of the fixedCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFixedCosts(Double value) {
        this.fixedCosts = value;
    }

    /**
     * Gets the value of the depreciation property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDepreciation() {
        return depreciation;
    }

    /**
     * Sets the value of the depreciation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDepreciation(Double value) {
        this.depreciation = value;
    }

    /**
     * Gets the value of the other property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOther() {
        return other;
    }

    /**
     * Sets the value of the other property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOther(Double value) {
        this.other = value;
    }

    /**
     * Gets the value of the interest property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInterest() {
        return interest;
    }

    /**
     * Sets the value of the interest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInterest(Double value) {
        this.interest = value;
    }

    /**
     * Gets the value of the taxRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxRate(Double value) {
        this.taxRate = value;
    }

    /**
     * Gets the value of the initialCash property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInitialCash() {
        return initialCash;
    }

    /**
     * Sets the value of the initialCash property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInitialCash(Double value) {
        this.initialCash = value;
    }

    /**
     * Gets the value of the accountsReceivable property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAccountsReceivable() {
        return accountsReceivable;
    }

    /**
     * Sets the value of the accountsReceivable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAccountsReceivable(Double value) {
        this.accountsReceivable = value;
    }

    /**
     * Gets the value of the equipment property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEquipment() {
        return equipment;
    }

    /**
     * Sets the value of the equipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEquipment(Double value) {
        this.equipment = value;
    }

    /**
     * Gets the value of the property property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getProperty() {
        return property;
    }

    /**
     * Sets the value of the property property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setProperty(Double value) {
        this.property = value;
    }

    /**
     * Gets the value of the accountsPayable property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAccountsPayable() {
        return accountsPayable;
    }

    /**
     * Sets the value of the accountsPayable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAccountsPayable(Double value) {
        this.accountsPayable = value;
    }

    /**
     * Gets the value of the shortTermDebt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getShortTermDebt() {
        return shortTermDebt;
    }

    /**
     * Sets the value of the shortTermDebt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setShortTermDebt(Double value) {
        this.shortTermDebt = value;
    }

    /**
     * Gets the value of the longTermDebt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLongTermDebt() {
        return longTermDebt;
    }

    /**
     * Sets the value of the longTermDebt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLongTermDebt(Double value) {
        this.longTermDebt = value;
    }

}
