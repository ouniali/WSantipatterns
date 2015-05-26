
package webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutputData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutputData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Gross_Profit" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="EBITDA" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Depreciation" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="EBIT" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Interest_Expense" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Taxes" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Net_Income" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Cash" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Accounts_Receivable" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Inventory" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Current_Assets" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Fixed_Assets" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Total_Assets" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Accounts_Payable" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Short_Term_Debt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Current_Liabilities" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Long_Term_Debt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Long_Term_Liabilities" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Total_Liabilities" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Owners_Equity" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Liabilities_and_Equity" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Residual_Cash_Flow" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Free_Cash_Flow" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Unit_Sales" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputData", propOrder = {
    "grossProfit",
    "ebitda",
    "depreciation",
    "ebit",
    "interestExpense",
    "taxes",
    "netIncome",
    "cash",
    "accountsReceivable",
    "inventory",
    "currentAssets",
    "fixedAssets",
    "totalAssets",
    "accountsPayable",
    "shortTermDebt",
    "currentLiabilities",
    "longTermDebt",
    "longTermLiabilities",
    "totalLiabilities",
    "ownersEquity",
    "liabilitiesAndEquity",
    "residualCashFlow",
    "freeCashFlow",
    "unitSales"
})
public class OutputData {

    @XmlElement(name = "Gross_Profit")
    protected double grossProfit;
    @XmlElement(name = "EBITDA")
    protected double ebitda;
    @XmlElement(name = "Depreciation")
    protected double depreciation;
    @XmlElement(name = "EBIT")
    protected double ebit;
    @XmlElement(name = "Interest_Expense")
    protected double interestExpense;
    @XmlElement(name = "Taxes")
    protected double taxes;
    @XmlElement(name = "Net_Income")
    protected double netIncome;
    @XmlElement(name = "Cash")
    protected double cash;
    @XmlElement(name = "Accounts_Receivable")
    protected double accountsReceivable;
    @XmlElement(name = "Inventory")
    protected double inventory;
    @XmlElement(name = "Current_Assets")
    protected double currentAssets;
    @XmlElement(name = "Fixed_Assets")
    protected double fixedAssets;
    @XmlElement(name = "Total_Assets")
    protected double totalAssets;
    @XmlElement(name = "Accounts_Payable")
    protected double accountsPayable;
    @XmlElement(name = "Short_Term_Debt")
    protected double shortTermDebt;
    @XmlElement(name = "Current_Liabilities")
    protected double currentLiabilities;
    @XmlElement(name = "Long_Term_Debt")
    protected double longTermDebt;
    @XmlElement(name = "Long_Term_Liabilities")
    protected double longTermLiabilities;
    @XmlElement(name = "Total_Liabilities")
    protected double totalLiabilities;
    @XmlElement(name = "Owners_Equity")
    protected double ownersEquity;
    @XmlElement(name = "Liabilities_and_Equity")
    protected double liabilitiesAndEquity;
    @XmlElement(name = "Residual_Cash_Flow")
    protected double residualCashFlow;
    @XmlElement(name = "Free_Cash_Flow")
    protected double freeCashFlow;
    @XmlElement(name = "Unit_Sales")
    protected double unitSales;

    /**
     * Gets the value of the grossProfit property.
     * 
     */
    public double getGrossProfit() {
        return grossProfit;
    }

    /**
     * Sets the value of the grossProfit property.
     * 
     */
    public void setGrossProfit(double value) {
        this.grossProfit = value;
    }

    /**
     * Gets the value of the ebitda property.
     * 
     */
    public double getEBITDA() {
        return ebitda;
    }

    /**
     * Sets the value of the ebitda property.
     * 
     */
    public void setEBITDA(double value) {
        this.ebitda = value;
    }

    /**
     * Gets the value of the depreciation property.
     * 
     */
    public double getDepreciation() {
        return depreciation;
    }

    /**
     * Sets the value of the depreciation property.
     * 
     */
    public void setDepreciation(double value) {
        this.depreciation = value;
    }

    /**
     * Gets the value of the ebit property.
     * 
     */
    public double getEBIT() {
        return ebit;
    }

    /**
     * Sets the value of the ebit property.
     * 
     */
    public void setEBIT(double value) {
        this.ebit = value;
    }

    /**
     * Gets the value of the interestExpense property.
     * 
     */
    public double getInterestExpense() {
        return interestExpense;
    }

    /**
     * Sets the value of the interestExpense property.
     * 
     */
    public void setInterestExpense(double value) {
        this.interestExpense = value;
    }

    /**
     * Gets the value of the taxes property.
     * 
     */
    public double getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     */
    public void setTaxes(double value) {
        this.taxes = value;
    }

    /**
     * Gets the value of the netIncome property.
     * 
     */
    public double getNetIncome() {
        return netIncome;
    }

    /**
     * Sets the value of the netIncome property.
     * 
     */
    public void setNetIncome(double value) {
        this.netIncome = value;
    }

    /**
     * Gets the value of the cash property.
     * 
     */
    public double getCash() {
        return cash;
    }

    /**
     * Sets the value of the cash property.
     * 
     */
    public void setCash(double value) {
        this.cash = value;
    }

    /**
     * Gets the value of the accountsReceivable property.
     * 
     */
    public double getAccountsReceivable() {
        return accountsReceivable;
    }

    /**
     * Sets the value of the accountsReceivable property.
     * 
     */
    public void setAccountsReceivable(double value) {
        this.accountsReceivable = value;
    }

    /**
     * Gets the value of the inventory property.
     * 
     */
    public double getInventory() {
        return inventory;
    }

    /**
     * Sets the value of the inventory property.
     * 
     */
    public void setInventory(double value) {
        this.inventory = value;
    }

    /**
     * Gets the value of the currentAssets property.
     * 
     */
    public double getCurrentAssets() {
        return currentAssets;
    }

    /**
     * Sets the value of the currentAssets property.
     * 
     */
    public void setCurrentAssets(double value) {
        this.currentAssets = value;
    }

    /**
     * Gets the value of the fixedAssets property.
     * 
     */
    public double getFixedAssets() {
        return fixedAssets;
    }

    /**
     * Sets the value of the fixedAssets property.
     * 
     */
    public void setFixedAssets(double value) {
        this.fixedAssets = value;
    }

    /**
     * Gets the value of the totalAssets property.
     * 
     */
    public double getTotalAssets() {
        return totalAssets;
    }

    /**
     * Sets the value of the totalAssets property.
     * 
     */
    public void setTotalAssets(double value) {
        this.totalAssets = value;
    }

    /**
     * Gets the value of the accountsPayable property.
     * 
     */
    public double getAccountsPayable() {
        return accountsPayable;
    }

    /**
     * Sets the value of the accountsPayable property.
     * 
     */
    public void setAccountsPayable(double value) {
        this.accountsPayable = value;
    }

    /**
     * Gets the value of the shortTermDebt property.
     * 
     */
    public double getShortTermDebt() {
        return shortTermDebt;
    }

    /**
     * Sets the value of the shortTermDebt property.
     * 
     */
    public void setShortTermDebt(double value) {
        this.shortTermDebt = value;
    }

    /**
     * Gets the value of the currentLiabilities property.
     * 
     */
    public double getCurrentLiabilities() {
        return currentLiabilities;
    }

    /**
     * Sets the value of the currentLiabilities property.
     * 
     */
    public void setCurrentLiabilities(double value) {
        this.currentLiabilities = value;
    }

    /**
     * Gets the value of the longTermDebt property.
     * 
     */
    public double getLongTermDebt() {
        return longTermDebt;
    }

    /**
     * Sets the value of the longTermDebt property.
     * 
     */
    public void setLongTermDebt(double value) {
        this.longTermDebt = value;
    }

    /**
     * Gets the value of the longTermLiabilities property.
     * 
     */
    public double getLongTermLiabilities() {
        return longTermLiabilities;
    }

    /**
     * Sets the value of the longTermLiabilities property.
     * 
     */
    public void setLongTermLiabilities(double value) {
        this.longTermLiabilities = value;
    }

    /**
     * Gets the value of the totalLiabilities property.
     * 
     */
    public double getTotalLiabilities() {
        return totalLiabilities;
    }

    /**
     * Sets the value of the totalLiabilities property.
     * 
     */
    public void setTotalLiabilities(double value) {
        this.totalLiabilities = value;
    }

    /**
     * Gets the value of the ownersEquity property.
     * 
     */
    public double getOwnersEquity() {
        return ownersEquity;
    }

    /**
     * Sets the value of the ownersEquity property.
     * 
     */
    public void setOwnersEquity(double value) {
        this.ownersEquity = value;
    }

    /**
     * Gets the value of the liabilitiesAndEquity property.
     * 
     */
    public double getLiabilitiesAndEquity() {
        return liabilitiesAndEquity;
    }

    /**
     * Sets the value of the liabilitiesAndEquity property.
     * 
     */
    public void setLiabilitiesAndEquity(double value) {
        this.liabilitiesAndEquity = value;
    }

    /**
     * Gets the value of the residualCashFlow property.
     * 
     */
    public double getResidualCashFlow() {
        return residualCashFlow;
    }

    /**
     * Sets the value of the residualCashFlow property.
     * 
     */
    public void setResidualCashFlow(double value) {
        this.residualCashFlow = value;
    }

    /**
     * Gets the value of the freeCashFlow property.
     * 
     */
    public double getFreeCashFlow() {
        return freeCashFlow;
    }

    /**
     * Sets the value of the freeCashFlow property.
     * 
     */
    public void setFreeCashFlow(double value) {
        this.freeCashFlow = value;
    }

    /**
     * Gets the value of the unitSales property.
     * 
     */
    public double getUnitSales() {
        return unitSales;
    }

    /**
     * Sets the value of the unitSales property.
     * 
     */
    public void setUnitSales(double value) {
        this.unitSales = value;
    }

}
