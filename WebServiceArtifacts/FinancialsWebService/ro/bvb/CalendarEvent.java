
package ro.bvb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalendarEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalendarEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Symbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Company" type="{http://www.bvb.ro}CompanyInfo" minOccurs="0"/>
 *         &lt;element name="FinancialEvent" type="{http://www.bvb.ro}FinancialEvent" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalendarEvent", propOrder = {
    "symbol",
    "company",
    "financialEvent"
})
public class CalendarEvent {

    @XmlElement(name = "Symbol")
    protected String symbol;
    @XmlElement(name = "Company")
    protected CompanyInfo company;
    @XmlElement(name = "FinancialEvent")
    protected FinancialEvent financialEvent;

    /**
     * Gets the value of the symbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Sets the value of the symbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbol(String value) {
        this.symbol = value;
    }

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
     * Gets the value of the financialEvent property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialEvent }
     *     
     */
    public FinancialEvent getFinancialEvent() {
        return financialEvent;
    }

    /**
     * Sets the value of the financialEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialEvent }
     *     
     */
    public void setFinancialEvent(FinancialEvent value) {
        this.financialEvent = value;
    }

}
