
package ro.bvb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BankBalance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankBalance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Company" type="{http://www.bvb.ro}CompanyIdentification" minOccurs="0"/>
 *         &lt;element name="LastYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReportType" type="{http://www.bvb.ro}ReportTypeEnum"/>
 *         &lt;element name="TotAssets" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="SubShareCap" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ShahEqy" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="NatBankBalance" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CommExpenses" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TotExp" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CustomersLoans" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="DueFromOthBanks" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="DueCust" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="DueToOthBanks" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PayIntExp" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ReceivInterest" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TangibleAssets" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="IntangAssets" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CurrResAfterTax" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ExtResAfterTax" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Gross" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="NetRes" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ResPerShare" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="LiabAndShareEqu" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CommisIncome" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TotalRev" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankBalance", propOrder = {
    "company",
    "lastYear",
    "reportType",
    "totAssets",
    "subShareCap",
    "shahEqy",
    "natBankBalance",
    "commExpenses",
    "totExp",
    "customersLoans",
    "dueFromOthBanks",
    "dueCust",
    "dueToOthBanks",
    "payIntExp",
    "receivInterest",
    "tangibleAssets",
    "intangAssets",
    "currResAfterTax",
    "extResAfterTax",
    "gross",
    "netRes",
    "resPerShare",
    "liabAndShareEqu",
    "commisIncome",
    "totalRev"
})
public class BankBalance {

    @XmlElement(name = "Company")
    protected CompanyIdentification company;
    @XmlElement(name = "LastYear", required = true, type = Integer.class, nillable = true)
    protected Integer lastYear;
    @XmlElement(name = "ReportType", required = true)
    @XmlSchemaType(name = "string")
    protected ReportTypeEnum reportType;
    @XmlElement(name = "TotAssets", required = true, type = Double.class, nillable = true)
    protected Double totAssets;
    @XmlElement(name = "SubShareCap", required = true, type = Double.class, nillable = true)
    protected Double subShareCap;
    @XmlElement(name = "ShahEqy", required = true, type = Double.class, nillable = true)
    protected Double shahEqy;
    @XmlElement(name = "NatBankBalance", required = true, type = Double.class, nillable = true)
    protected Double natBankBalance;
    @XmlElement(name = "CommExpenses", required = true, type = Double.class, nillable = true)
    protected Double commExpenses;
    @XmlElement(name = "TotExp", required = true, type = Double.class, nillable = true)
    protected Double totExp;
    @XmlElement(name = "CustomersLoans", required = true, type = Double.class, nillable = true)
    protected Double customersLoans;
    @XmlElement(name = "DueFromOthBanks", required = true, type = Double.class, nillable = true)
    protected Double dueFromOthBanks;
    @XmlElement(name = "DueCust", required = true, type = Double.class, nillable = true)
    protected Double dueCust;
    @XmlElement(name = "DueToOthBanks", required = true, type = Double.class, nillable = true)
    protected Double dueToOthBanks;
    @XmlElement(name = "PayIntExp", required = true, type = Double.class, nillable = true)
    protected Double payIntExp;
    @XmlElement(name = "ReceivInterest", required = true, type = Double.class, nillable = true)
    protected Double receivInterest;
    @XmlElement(name = "TangibleAssets", required = true, type = Double.class, nillable = true)
    protected Double tangibleAssets;
    @XmlElement(name = "IntangAssets", required = true, type = Double.class, nillable = true)
    protected Double intangAssets;
    @XmlElement(name = "CurrResAfterTax", required = true, type = Double.class, nillable = true)
    protected Double currResAfterTax;
    @XmlElement(name = "ExtResAfterTax", required = true, type = Double.class, nillable = true)
    protected Double extResAfterTax;
    @XmlElement(name = "Gross", required = true, type = Double.class, nillable = true)
    protected Double gross;
    @XmlElement(name = "NetRes", required = true, type = Double.class, nillable = true)
    protected Double netRes;
    @XmlElement(name = "ResPerShare", required = true, type = Double.class, nillable = true)
    protected Double resPerShare;
    @XmlElement(name = "LiabAndShareEqu", required = true, type = Double.class, nillable = true)
    protected Double liabAndShareEqu;
    @XmlElement(name = "CommisIncome", required = true, type = Double.class, nillable = true)
    protected Double commisIncome;
    @XmlElement(name = "TotalRev", required = true, type = Double.class, nillable = true)
    protected Double totalRev;

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyIdentification }
     *     
     */
    public CompanyIdentification getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyIdentification }
     *     
     */
    public void setCompany(CompanyIdentification value) {
        this.company = value;
    }

    /**
     * Gets the value of the lastYear property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLastYear() {
        return lastYear;
    }

    /**
     * Sets the value of the lastYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLastYear(Integer value) {
        this.lastYear = value;
    }

    /**
     * Gets the value of the reportType property.
     * 
     * @return
     *     possible object is
     *     {@link ReportTypeEnum }
     *     
     */
    public ReportTypeEnum getReportType() {
        return reportType;
    }

    /**
     * Sets the value of the reportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportTypeEnum }
     *     
     */
    public void setReportType(ReportTypeEnum value) {
        this.reportType = value;
    }

    /**
     * Gets the value of the totAssets property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotAssets() {
        return totAssets;
    }

    /**
     * Sets the value of the totAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotAssets(Double value) {
        this.totAssets = value;
    }

    /**
     * Gets the value of the subShareCap property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSubShareCap() {
        return subShareCap;
    }

    /**
     * Sets the value of the subShareCap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSubShareCap(Double value) {
        this.subShareCap = value;
    }

    /**
     * Gets the value of the shahEqy property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getShahEqy() {
        return shahEqy;
    }

    /**
     * Sets the value of the shahEqy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setShahEqy(Double value) {
        this.shahEqy = value;
    }

    /**
     * Gets the value of the natBankBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNatBankBalance() {
        return natBankBalance;
    }

    /**
     * Sets the value of the natBankBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNatBankBalance(Double value) {
        this.natBankBalance = value;
    }

    /**
     * Gets the value of the commExpenses property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCommExpenses() {
        return commExpenses;
    }

    /**
     * Sets the value of the commExpenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCommExpenses(Double value) {
        this.commExpenses = value;
    }

    /**
     * Gets the value of the totExp property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotExp() {
        return totExp;
    }

    /**
     * Sets the value of the totExp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotExp(Double value) {
        this.totExp = value;
    }

    /**
     * Gets the value of the customersLoans property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCustomersLoans() {
        return customersLoans;
    }

    /**
     * Sets the value of the customersLoans property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCustomersLoans(Double value) {
        this.customersLoans = value;
    }

    /**
     * Gets the value of the dueFromOthBanks property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDueFromOthBanks() {
        return dueFromOthBanks;
    }

    /**
     * Sets the value of the dueFromOthBanks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDueFromOthBanks(Double value) {
        this.dueFromOthBanks = value;
    }

    /**
     * Gets the value of the dueCust property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDueCust() {
        return dueCust;
    }

    /**
     * Sets the value of the dueCust property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDueCust(Double value) {
        this.dueCust = value;
    }

    /**
     * Gets the value of the dueToOthBanks property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDueToOthBanks() {
        return dueToOthBanks;
    }

    /**
     * Sets the value of the dueToOthBanks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDueToOthBanks(Double value) {
        this.dueToOthBanks = value;
    }

    /**
     * Gets the value of the payIntExp property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPayIntExp() {
        return payIntExp;
    }

    /**
     * Sets the value of the payIntExp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPayIntExp(Double value) {
        this.payIntExp = value;
    }

    /**
     * Gets the value of the receivInterest property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getReceivInterest() {
        return receivInterest;
    }

    /**
     * Sets the value of the receivInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setReceivInterest(Double value) {
        this.receivInterest = value;
    }

    /**
     * Gets the value of the tangibleAssets property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTangibleAssets() {
        return tangibleAssets;
    }

    /**
     * Sets the value of the tangibleAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTangibleAssets(Double value) {
        this.tangibleAssets = value;
    }

    /**
     * Gets the value of the intangAssets property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getIntangAssets() {
        return intangAssets;
    }

    /**
     * Sets the value of the intangAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setIntangAssets(Double value) {
        this.intangAssets = value;
    }

    /**
     * Gets the value of the currResAfterTax property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCurrResAfterTax() {
        return currResAfterTax;
    }

    /**
     * Sets the value of the currResAfterTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCurrResAfterTax(Double value) {
        this.currResAfterTax = value;
    }

    /**
     * Gets the value of the extResAfterTax property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExtResAfterTax() {
        return extResAfterTax;
    }

    /**
     * Sets the value of the extResAfterTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExtResAfterTax(Double value) {
        this.extResAfterTax = value;
    }

    /**
     * Gets the value of the gross property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGross() {
        return gross;
    }

    /**
     * Sets the value of the gross property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGross(Double value) {
        this.gross = value;
    }

    /**
     * Gets the value of the netRes property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNetRes() {
        return netRes;
    }

    /**
     * Sets the value of the netRes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNetRes(Double value) {
        this.netRes = value;
    }

    /**
     * Gets the value of the resPerShare property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getResPerShare() {
        return resPerShare;
    }

    /**
     * Sets the value of the resPerShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setResPerShare(Double value) {
        this.resPerShare = value;
    }

    /**
     * Gets the value of the liabAndShareEqu property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLiabAndShareEqu() {
        return liabAndShareEqu;
    }

    /**
     * Sets the value of the liabAndShareEqu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLiabAndShareEqu(Double value) {
        this.liabAndShareEqu = value;
    }

    /**
     * Gets the value of the commisIncome property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCommisIncome() {
        return commisIncome;
    }

    /**
     * Sets the value of the commisIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCommisIncome(Double value) {
        this.commisIncome = value;
    }

    /**
     * Gets the value of the totalRev property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalRev() {
        return totalRev;
    }

    /**
     * Sets the value of the totalRev property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalRev(Double value) {
        this.totalRev = value;
    }

}
