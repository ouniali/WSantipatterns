
package ro.bvb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="IdentityType" type="{http://www.bvb.ro}SecurityIdentification"/>
 *         &lt;element name="Identity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReportType" type="{http://www.bvb.ro}ReportTypeEnum"/>
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "identityType",
    "identity",
    "reportType",
    "year"
})
@XmlRootElement(name = "GetCompanyBalance")
public class GetCompanyBalance {

    @XmlElement(name = "IdentityType", required = true)
    @XmlSchemaType(name = "string")
    protected SecurityIdentification identityType;
    @XmlElement(name = "Identity")
    protected String identity;
    @XmlElement(name = "ReportType", required = true)
    @XmlSchemaType(name = "string")
    protected ReportTypeEnum reportType;
    @XmlElement(name = "Year")
    protected int year;

    /**
     * Gets the value of the identityType property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification }
     *     
     */
    public SecurityIdentification getIdentityType() {
        return identityType;
    }

    /**
     * Sets the value of the identityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification }
     *     
     */
    public void setIdentityType(SecurityIdentification value) {
        this.identityType = value;
    }

    /**
     * Gets the value of the identity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentity() {
        return identity;
    }

    /**
     * Sets the value of the identity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentity(String value) {
        this.identity = value;
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
     * Gets the value of the year property.
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

}
