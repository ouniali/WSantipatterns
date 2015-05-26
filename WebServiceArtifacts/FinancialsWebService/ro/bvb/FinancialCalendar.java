
package ro.bvb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialCalendar complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialCalendar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Company" type="{http://www.bvb.ro}CompanyInfo" minOccurs="0"/>
 *         &lt;element name="FinancialEvents" type="{http://www.bvb.ro}ArrayOfFinancialEvent" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialCalendar", propOrder = {
    "company",
    "financialEvents"
})
public class FinancialCalendar {

    @XmlElement(name = "Company")
    protected CompanyInfo company;
    @XmlElement(name = "FinancialEvents")
    protected ArrayOfFinancialEvent financialEvents;

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyInfo }
     *     
     */
    public CompanyInfo getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyInfo }
     *     
     */
    public void setCompany(CompanyInfo value) {
        this.company = value;
    }

    /**
     * Gets the value of the financialEvents property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFinancialEvent }
     *     
     */
    public ArrayOfFinancialEvent getFinancialEvents() {
        return financialEvents;
    }

    /**
     * Sets the value of the financialEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFinancialEvent }
     *     
     */
    public void setFinancialEvents(ArrayOfFinancialEvent value) {
        this.financialEvents = value;
    }

}
