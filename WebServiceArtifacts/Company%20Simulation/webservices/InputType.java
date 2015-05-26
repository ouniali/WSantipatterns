
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
 *         &lt;element name="Unit_Price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Tooling_Cost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Operating_Expenses" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Debt_Interest_Rate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Tax_Rate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Initial_Cash" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Days_Receivables" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Days_Inventory" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Initial_Fixed_Assets" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Average_Asset_Life" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Days_Payables" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Initial_Long_Term_Debt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Debt_Amortization" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
    "unitPrice",
    "toolingCost",
    "operatingExpenses",
    "debtInterestRate",
    "taxRate",
    "initialCash",
    "daysReceivables",
    "daysInventory",
    "initialFixedAssets",
    "averageAssetLife",
    "daysPayables",
    "initialLongTermDebt",
    "debtAmortization"
})
@XmlRootElement(name = "InputType")
public class InputType {

    @XmlElement(name = "Initial_Sales")
    protected Double initialSales;
    @XmlElement(name = "Sales_Growth_Rate")
    protected Double salesGrowthRate;
    @XmlElement(name = "Unit_Price")
    protected Double unitPrice;
    @XmlElement(name = "Tooling_Cost")
    protected Double toolingCost;
    @XmlElement(name = "Operating_Expenses")
    protected Double operatingExpenses;
    @XmlElement(name = "Debt_Interest_Rate")
    protected Double debtInterestRate;
    @XmlElement(name = "Tax_Rate")
    protected Double taxRate;
    @XmlElement(name = "Initial_Cash")
    protected Double initialCash;
    @XmlElement(name = "Days_Receivables")
    protected Double daysReceivables;
    @XmlElement(name = "Days_Inventory")
    protected Double daysInventory;
    @XmlElement(name = "Initial_Fixed_Assets")
    protected Double initialFixedAssets;
    @XmlElement(name = "Average_Asset_Life")
    protected Double averageAssetLife;
    @XmlElement(name = "Days_Payables")
    protected Double daysPayables;
    @XmlElement(name = "Initial_Long_Term_Debt")
    protected Double initialLongTermDebt;
    @XmlElement(name = "Debt_Amortization")
    protected Double debtAmortization;

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
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUnitPrice(Double value) {
        this.unitPrice = value;
    }

    /**
     * Gets the value of the toolingCost property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getToolingCost() {
        return toolingCost;
    }

    /**
     * Sets the value of the toolingCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setToolingCost(Double value) {
        this.toolingCost = value;
    }

    /**
     * Gets the value of the operatingExpenses property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOperatingExpenses() {
        return operatingExpenses;
    }

    /**
     * Sets the value of the operatingExpenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOperatingExpenses(Double value) {
        this.operatingExpenses = value;
    }

    /**
     * Gets the value of the debtInterestRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDebtInterestRate() {
        return debtInterestRate;
    }

    /**
     * Sets the value of the debtInterestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDebtInterestRate(Double value) {
        this.debtInterestRate = value;
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
     * Gets the value of the daysReceivables property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDaysReceivables() {
        return daysReceivables;
    }

    /**
     * Sets the value of the daysReceivables property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDaysReceivables(Double value) {
        this.daysReceivables = value;
    }

    /**
     * Gets the value of the daysInventory property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDaysInventory() {
        return daysInventory;
    }

    /**
     * Sets the value of the daysInventory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDaysInventory(Double value) {
        this.daysInventory = value;
    }

    /**
     * Gets the value of the initialFixedAssets property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInitialFixedAssets() {
        return initialFixedAssets;
    }

    /**
     * Sets the value of the initialFixedAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInitialFixedAssets(Double value) {
        this.initialFixedAssets = value;
    }

    /**
     * Gets the value of the averageAssetLife property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAverageAssetLife() {
        return averageAssetLife;
    }

    /**
     * Sets the value of the averageAssetLife property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAverageAssetLife(Double value) {
        this.averageAssetLife = value;
    }

    /**
     * Gets the value of the daysPayables property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDaysPayables() {
        return daysPayables;
    }

    /**
     * Sets the value of the daysPayables property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDaysPayables(Double value) {
        this.daysPayables = value;
    }

    /**
     * Gets the value of the initialLongTermDebt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInitialLongTermDebt() {
        return initialLongTermDebt;
    }

    /**
     * Sets the value of the initialLongTermDebt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInitialLongTermDebt(Double value) {
        this.initialLongTermDebt = value;
    }

    /**
     * Gets the value of the debtAmortization property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDebtAmortization() {
        return debtAmortization;
    }

    /**
     * Sets the value of the debtAmortization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDebtAmortization(Double value) {
        this.debtAmortization = value;
    }

}
