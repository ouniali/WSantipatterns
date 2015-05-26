
package ro.bvb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsuranceBalance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsuranceBalance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Company" type="{http://www.bvb.ro}CompanyIdentification" minOccurs="0"/>
 *         &lt;element name="LastYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReportType" type="{http://www.bvb.ro}ReportTypeEnum"/>
 *         &lt;element name="TotAssets" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="IntangAssets" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="SubShareCap" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="NetInsClaimsExpGeneral" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="NetInsClaimsExpLifeInsurance" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OpExpensesGeneral" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OpExpensesLifeInsurance" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InvstsExpenses" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ExtrExp" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TotExp" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TotLiab" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="NoPaidTax" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Empl" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="BackLiab" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TotInvestments" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="BackPaym" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Gross" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ExtrRes" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="NetRes" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TechResultGeneral" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TechResultLifeInsurance" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TechReservesGeneral" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CurrRes" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TotReceiv" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="LiabAndShareEqu" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InvestIncomeGeneral" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ExIncome" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="NetInsuranceGeneral" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="NetInsuranceLifeInsurance" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
@XmlType(name = "InsuranceBalance", propOrder = {
    "company",
    "lastYear",
    "reportType",
    "totAssets",
    "intangAssets",
    "subShareCap",
    "netInsClaimsExpGeneral",
    "netInsClaimsExpLifeInsurance",
    "opExpensesGeneral",
    "opExpensesLifeInsurance",
    "invstsExpenses",
    "extrExp",
    "totExp",
    "totLiab",
    "noPaidTax",
    "empl",
    "backLiab",
    "totInvestments",
    "backPaym",
    "gross",
    "extrRes",
    "netRes",
    "techResultGeneral",
    "techResultLifeInsurance",
    "techReservesGeneral",
    "currRes",
    "totReceiv",
    "liabAndShareEqu",
    "investIncomeGeneral",
    "exIncome",
    "netInsuranceGeneral",
    "netInsuranceLifeInsurance",
    "totalRev"
})
public class InsuranceBalance {

    @XmlElement(name = "Company")
    protected CompanyIdentification company;
    @XmlElement(name = "LastYear", required = true, type = Integer.class, nillable = true)
    protected Integer lastYear;
    @XmlElement(name = "ReportType", required = true)
    @XmlSchemaType(name = "string")
    protected ReportTypeEnum reportType;
    @XmlElement(name = "TotAssets", required = true, type = Double.class, nillable = true)
    protected Double totAssets;
    @XmlElement(name = "IntangAssets", required = true, type = Double.class, nillable = true)
    protected Double intangAssets;
    @XmlElement(name = "SubShareCap", required = true, type = Double.class, nillable = true)
    protected Double subShareCap;
    @XmlElement(name = "NetInsClaimsExpGeneral", required = true, type = Double.class, nillable = true)
    protected Double netInsClaimsExpGeneral;
    @XmlElement(name = "NetInsClaimsExpLifeInsurance", required = true, type = Double.class, nillable = true)
    protected Double netInsClaimsExpLifeInsurance;
    @XmlElement(name = "OpExpensesGeneral", required = true, type = Double.class, nillable = true)
    protected Double opExpensesGeneral;
    @XmlElement(name = "OpExpensesLifeInsurance", required = true, type = Double.class, nillable = true)
    protected Double opExpensesLifeInsurance;
    @XmlElement(name = "InvstsExpenses", required = true, type = Double.class, nillable = true)
    protected Double invstsExpenses;
    @XmlElement(name = "ExtrExp", required = true, type = Double.class, nillable = true)
    protected Double extrExp;
    @XmlElement(name = "TotExp", required = true, type = Double.class, nillable = true)
    protected Double totExp;
    @XmlElement(name = "TotLiab", required = true, type = Double.class, nillable = true)
    protected Double totLiab;
    @XmlElement(name = "NoPaidTax", required = true, type = Double.class, nillable = true)
    protected Double noPaidTax;
    @XmlElement(name = "Empl", required = true, type = Float.class, nillable = true)
    protected Float empl;
    @XmlElement(name = "BackLiab", required = true, type = Double.class, nillable = true)
    protected Double backLiab;
    @XmlElement(name = "TotInvestments", required = true, type = Double.class, nillable = true)
    protected Double totInvestments;
    @XmlElement(name = "BackPaym", required = true, type = Double.class, nillable = true)
    protected Double backPaym;
    @XmlElement(name = "Gross", required = true, type = Double.class, nillable = true)
    protected Double gross;
    @XmlElement(name = "ExtrRes", required = true, type = Double.class, nillable = true)
    protected Double extrRes;
    @XmlElement(name = "NetRes", required = true, type = Double.class, nillable = true)
    protected Double netRes;
    @XmlElement(name = "TechResultGeneral", required = true, type = Double.class, nillable = true)
    protected Double techResultGeneral;
    @XmlElement(name = "TechResultLifeInsurance", required = true, type = Double.class, nillable = true)
    protected Double techResultLifeInsurance;
    @XmlElement(name = "TechReservesGeneral", required = true, type = Double.class, nillable = true)
    protected Double techReservesGeneral;
    @XmlElement(name = "CurrRes", required = true, type = Double.class, nillable = true)
    protected Double currRes;
    @XmlElement(name = "TotReceiv", required = true, type = Double.class, nillable = true)
    protected Double totReceiv;
    @XmlElement(name = "LiabAndShareEqu", required = true, type = Double.class, nillable = true)
    protected Double liabAndShareEqu;
    @XmlElement(name = "InvestIncomeGeneral", required = true, type = Double.class, nillable = true)
    protected Double investIncomeGeneral;
    @XmlElement(name = "ExIncome", required = true, type = Double.class, nillable = true)
    protected Double exIncome;
    @XmlElement(name = "NetInsuranceGeneral", required = true, type = Double.class, nillable = true)
    protected Double netInsuranceGeneral;
    @XmlElement(name = "NetInsuranceLifeInsurance", required = true, type = Double.class, nillable = true)
    protected Double netInsuranceLifeInsurance;
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
     * Gets the value of the netInsClaimsExpGeneral property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNetInsClaimsExpGeneral() {
        return netInsClaimsExpGeneral;
    }

    /**
     * Sets the value of the netInsClaimsExpGeneral property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNetInsClaimsExpGeneral(Double value) {
        this.netInsClaimsExpGeneral = value;
    }

    /**
     * Gets the value of the netInsClaimsExpLifeInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNetInsClaimsExpLifeInsurance() {
        return netInsClaimsExpLifeInsurance;
    }

    /**
     * Sets the value of the netInsClaimsExpLifeInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNetInsClaimsExpLifeInsurance(Double value) {
        this.netInsClaimsExpLifeInsurance = value;
    }

    /**
     * Gets the value of the opExpensesGeneral property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOpExpensesGeneral() {
        return opExpensesGeneral;
    }

    /**
     * Sets the value of the opExpensesGeneral property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOpExpensesGeneral(Double value) {
        this.opExpensesGeneral = value;
    }

    /**
     * Gets the value of the opExpensesLifeInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOpExpensesLifeInsurance() {
        return opExpensesLifeInsurance;
    }

    /**
     * Sets the value of the opExpensesLifeInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOpExpensesLifeInsurance(Double value) {
        this.opExpensesLifeInsurance = value;
    }

    /**
     * Gets the value of the invstsExpenses property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInvstsExpenses() {
        return invstsExpenses;
    }

    /**
     * Sets the value of the invstsExpenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInvstsExpenses(Double value) {
        this.invstsExpenses = value;
    }

    /**
     * Gets the value of the extrExp property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExtrExp() {
        return extrExp;
    }

    /**
     * Sets the value of the extrExp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExtrExp(Double value) {
        this.extrExp = value;
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
     * Gets the value of the totLiab property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotLiab() {
        return totLiab;
    }

    /**
     * Sets the value of the totLiab property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotLiab(Double value) {
        this.totLiab = value;
    }

    /**
     * Gets the value of the noPaidTax property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNoPaidTax() {
        return noPaidTax;
    }

    /**
     * Sets the value of the noPaidTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNoPaidTax(Double value) {
        this.noPaidTax = value;
    }

    /**
     * Gets the value of the empl property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getEmpl() {
        return empl;
    }

    /**
     * Sets the value of the empl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setEmpl(Float value) {
        this.empl = value;
    }

    /**
     * Gets the value of the backLiab property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBackLiab() {
        return backLiab;
    }

    /**
     * Sets the value of the backLiab property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBackLiab(Double value) {
        this.backLiab = value;
    }

    /**
     * Gets the value of the totInvestments property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotInvestments() {
        return totInvestments;
    }

    /**
     * Sets the value of the totInvestments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotInvestments(Double value) {
        this.totInvestments = value;
    }

    /**
     * Gets the value of the backPaym property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBackPaym() {
        return backPaym;
    }

    /**
     * Sets the value of the backPaym property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBackPaym(Double value) {
        this.backPaym = value;
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
     * Gets the value of the extrRes property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExtrRes() {
        return extrRes;
    }

    /**
     * Sets the value of the extrRes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExtrRes(Double value) {
        this.extrRes = value;
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
     * Gets the value of the techResultGeneral property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTechResultGeneral() {
        return techResultGeneral;
    }

    /**
     * Sets the value of the techResultGeneral property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTechResultGeneral(Double value) {
        this.techResultGeneral = value;
    }

    /**
     * Gets the value of the techResultLifeInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTechResultLifeInsurance() {
        return techResultLifeInsurance;
    }

    /**
     * Sets the value of the techResultLifeInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTechResultLifeInsurance(Double value) {
        this.techResultLifeInsurance = value;
    }

    /**
     * Gets the value of the techReservesGeneral property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTechReservesGeneral() {
        return techReservesGeneral;
    }

    /**
     * Sets the value of the techReservesGeneral property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTechReservesGeneral(Double value) {
        this.techReservesGeneral = value;
    }

    /**
     * Gets the value of the currRes property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCurrRes() {
        return currRes;
    }

    /**
     * Sets the value of the currRes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCurrRes(Double value) {
        this.currRes = value;
    }

    /**
     * Gets the value of the totReceiv property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotReceiv() {
        return totReceiv;
    }

    /**
     * Sets the value of the totReceiv property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotReceiv(Double value) {
        this.totReceiv = value;
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
     * Gets the value of the investIncomeGeneral property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInvestIncomeGeneral() {
        return investIncomeGeneral;
    }

    /**
     * Sets the value of the investIncomeGeneral property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInvestIncomeGeneral(Double value) {
        this.investIncomeGeneral = value;
    }

    /**
     * Gets the value of the exIncome property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExIncome() {
        return exIncome;
    }

    /**
     * Sets the value of the exIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExIncome(Double value) {
        this.exIncome = value;
    }

    /**
     * Gets the value of the netInsuranceGeneral property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNetInsuranceGeneral() {
        return netInsuranceGeneral;
    }

    /**
     * Sets the value of the netInsuranceGeneral property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNetInsuranceGeneral(Double value) {
        this.netInsuranceGeneral = value;
    }

    /**
     * Gets the value of the netInsuranceLifeInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNetInsuranceLifeInsurance() {
        return netInsuranceLifeInsurance;
    }

    /**
     * Sets the value of the netInsuranceLifeInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNetInsuranceLifeInsurance(Double value) {
        this.netInsuranceLifeInsurance = value;
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
