
package ro.bvb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompanyBalanceTypeIdentification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyBalanceTypeIdentification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Company" type="{http://www.bvb.ro}CompanyIdentification" minOccurs="0"/>
 *         &lt;element name="LastYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReportType" type="{http://www.bvb.ro}ReportTypeEnum"/>
 *         &lt;element name="BalanceType" type="{http://www.bvb.ro}BalanceTypeEnum"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyBalanceTypeIdentification", propOrder = {
    "company",
    "lastYear",
    "reportType",
    "balanceType"
})
public class CompanyBalanceTypeIdentification {

    @XmlElement(name = "Company")
    protected CompanyIdentification company;
    @XmlElement(name = "LastYear", required = true, type = Integer.class, nillable = true)
    protected Integer lastYear;
    @XmlElement(name = "ReportType", required = true)
    @XmlSchemaType(name = "string")
    protected ReportTypeEnum reportType;
    @XmlElement(name = "BalanceType", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected BalanceTypeEnum balanceType;

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
     * Gets the value of the balanceType property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceTypeEnum }
     *     
     */
    public BalanceTypeEnum getBalanceType() {
        return balanceType;
    }

    /**
     * Sets the value of the balanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceTypeEnum }
     *     
     */
    public void setBalanceType(BalanceTypeEnum value) {
        this.balanceType = value;
    }

}
