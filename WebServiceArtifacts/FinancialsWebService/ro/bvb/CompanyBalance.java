
package ro.bvb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompanyBalance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyBalance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Company" type="{http://www.bvb.ro}CompanyIdentification" minOccurs="0"/>
 *         &lt;element name="LastYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReportType" type="{http://www.bvb.ro}ReportTypeEnum"/>
 *         &lt;element name="NetCrtLiab" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CrtAssets" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="FixedAssets" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PaidUpCap" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ShahEqy" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OpExp" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ExtrExp" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="FinExp" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TotExp" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="NetTurn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Debt1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Debt2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TotLiab" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="BackPay" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="NoPaidTax" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Empl" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="BackLiab" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="BackPaym" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Gross" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OpRes" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ExtrRes" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="FinRes" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="NetRes" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CurrRes" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ResPerShare" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TotAssets" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TotReceiv" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="RevInAdv" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OpIncome" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ExIncome" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="FinInc" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TotRev" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyBalance", propOrder = {
    "company",
    "lastYear",
    "reportType",
    "netCrtLiab",
    "crtAssets",
    "fixedAssets",
    "paidUpCap",
    "shahEqy",
    "opExp",
    "extrExp",
    "finExp",
    "totExp",
    "netTurn",
    "debt1",
    "debt2",
    "totLiab",
    "backPay",
    "noPaidTax",
    "empl",
    "backLiab",
    "backPaym",
    "gross",
    "opRes",
    "extrRes",
    "finRes",
    "netRes",
    "currRes",
    "resPerShare",
    "totAssets",
    "totReceiv",
    "revInAdv",
    "opIncome",
    "exIncome",
    "finInc",
    "totRev"
})
public class CompanyBalance {

    @XmlElement(name = "Company")
    protected CompanyIdentification company;
    @XmlElement(name = "LastYear", required = true, type = Integer.class, nillable = true)
    protected Integer lastYear;
    @XmlElement(name = "ReportType", required = true)
    @XmlSchemaType(name = "string")
    protected ReportTypeEnum reportType;
    @XmlElement(name = "NetCrtLiab", required = true, type = Double.class, nillable = true)
    protected Double netCrtLiab;
    @XmlElement(name = "CrtAssets", required = true, type = Double.class, nillable = true)
    protected Double crtAssets;
    @XmlElement(name = "FixedAssets", required = true, type = Double.class, nillable = true)
    protected Double fixedAssets;
    @XmlElement(name = "PaidUpCap", required = true, type = Double.class, nillable = true)
    protected Double paidUpCap;
    @XmlElement(name = "ShahEqy", required = true, type = Double.class, nillable = true)
    protected Double shahEqy;
    @XmlElement(name = "OpExp", required = true, type = Double.class, nillable = true)
    protected Double opExp;
    @XmlElement(name = "ExtrExp", required = true, type = Double.class, nillable = true)
    protected Double extrExp;
    @XmlElement(name = "FinExp", required = true, type = Double.class, nillable = true)
    protected Double finExp;
    @XmlElement(name = "TotExp", required = true, type = Double.class, nillable = true)
    protected Double totExp;
    @XmlElement(name = "NetTurn", required = true, type = Double.class, nillable = true)
    protected Double netTurn;
    @XmlElement(name = "Debt1", required = true, type = Double.class, nillable = true)
    protected Double debt1;
    @XmlElement(name = "Debt2", required = true, type = Double.class, nillable = true)
    protected Double debt2;
    @XmlElement(name = "TotLiab", required = true, type = Double.class, nillable = true)
    protected Double totLiab;
    @XmlElement(name = "BackPay", required = true, type = Double.class, nillable = true)
    protected Double backPay;
    @XmlElement(name = "NoPaidTax", required = true, type = Double.class, nillable = true)
    protected Double noPaidTax;
    @XmlElement(name = "Empl", required = true, type = Float.class, nillable = true)
    protected Float empl;
    @XmlElement(name = "BackLiab", required = true, type = Double.class, nillable = true)
    protected Double backLiab;
    @XmlElement(name = "BackPaym", required = true, type = Double.class, nillable = true)
    protected Double backPaym;
    @XmlElement(name = "Gross", required = true, type = Double.class, nillable = true)
    protected Double gross;
    @XmlElement(name = "OpRes", required = true, type = Double.class, nillable = true)
    protected Double opRes;
    @XmlElement(name = "ExtrRes", required = true, type = Double.class, nillable = true)
    protected Double extrRes;
    @XmlElement(name = "FinRes", required = true, type = Double.class, nillable = true)
    protected Double finRes;
    @XmlElement(name = "NetRes", required = true, type = Double.class, nillable = true)
    protected Double netRes;
    @XmlElement(name = "CurrRes", required = true, type = Double.class, nillable = true)
    protected Double currRes;
    @XmlElement(name = "ResPerShare", required = true, type = Double.class, nillable = true)
    protected Double resPerShare;
    @XmlElement(name = "TotAssets", required = true, type = Double.class, nillable = true)
    protected Double totAssets;
    @XmlElement(name = "TotReceiv", required = true, type = Double.class, nillable = true)
    protected Double totReceiv;
    @XmlElement(name = "RevInAdv", required = true, type = Double.class, nillable = true)
    protected Double revInAdv;
    @XmlElement(name = "OpIncome", required = true, type = Double.class, nillable = true)
    protected Double opIncome;
    @XmlElement(name = "ExIncome", required = true, type = Double.class, nillable = true)
    protected Double exIncome;
    @XmlElement(name = "FinInc", required = true, type = Double.class, nillable = true)
    protected Double finInc;
    @XmlElement(name = "TotRev", required = true, type = Double.class, nillable = true)
    protected Double totRev;

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
     * Gets the value of the netCrtLiab property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNetCrtLiab() {
        return netCrtLiab;
    }

    /**
     * Sets the value of the netCrtLiab property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNetCrtLiab(Double value) {
        this.netCrtLiab = value;
    }

    /**
     * Gets the value of the crtAssets property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCrtAssets() {
        return crtAssets;
    }

    /**
     * Sets the value of the crtAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCrtAssets(Double value) {
        this.crtAssets = value;
    }

    /**
     * Gets the value of the fixedAssets property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFixedAssets() {
        return fixedAssets;
    }

    /**
     * Sets the value of the fixedAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFixedAssets(Double value) {
        this.fixedAssets = value;
    }

    /**
     * Gets the value of the paidUpCap property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPaidUpCap() {
        return paidUpCap;
    }

    /**
     * Sets the value of the paidUpCap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPaidUpCap(Double value) {
        this.paidUpCap = value;
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
     * Gets the value of the opExp property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOpExp() {
        return opExp;
    }

    /**
     * Sets the value of the opExp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOpExp(Double value) {
        this.opExp = value;
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
     * Gets the value of the finExp property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFinExp() {
        return finExp;
    }

    /**
     * Sets the value of the finExp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFinExp(Double value) {
        this.finExp = value;
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
     * Gets the value of the netTurn property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNetTurn() {
        return netTurn;
    }

    /**
     * Sets the value of the netTurn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNetTurn(Double value) {
        this.netTurn = value;
    }

    /**
     * Gets the value of the debt1 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDebt1() {
        return debt1;
    }

    /**
     * Sets the value of the debt1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDebt1(Double value) {
        this.debt1 = value;
    }

    /**
     * Gets the value of the debt2 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDebt2() {
        return debt2;
    }

    /**
     * Sets the value of the debt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDebt2(Double value) {
        this.debt2 = value;
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
     * Gets the value of the backPay property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBackPay() {
        return backPay;
    }

    /**
     * Sets the value of the backPay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBackPay(Double value) {
        this.backPay = value;
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
     * Gets the value of the opRes property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOpRes() {
        return opRes;
    }

    /**
     * Sets the value of the opRes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOpRes(Double value) {
        this.opRes = value;
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
     * Gets the value of the finRes property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFinRes() {
        return finRes;
    }

    /**
     * Sets the value of the finRes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFinRes(Double value) {
        this.finRes = value;
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
     * Gets the value of the revInAdv property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRevInAdv() {
        return revInAdv;
    }

    /**
     * Sets the value of the revInAdv property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRevInAdv(Double value) {
        this.revInAdv = value;
    }

    /**
     * Gets the value of the opIncome property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOpIncome() {
        return opIncome;
    }

    /**
     * Sets the value of the opIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOpIncome(Double value) {
        this.opIncome = value;
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
     * Gets the value of the finInc property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFinInc() {
        return finInc;
    }

    /**
     * Sets the value of the finInc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFinInc(Double value) {
        this.finInc = value;
    }

    /**
     * Gets the value of the totRev property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotRev() {
        return totRev;
    }

    /**
     * Sets the value of the totRev property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotRev(Double value) {
        this.totRev = value;
    }

}
