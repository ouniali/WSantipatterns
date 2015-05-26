
package ro.bvb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DividendsInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DividendsInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Company" type="{http://www.bvb.ro}CompanyIdentification" minOccurs="0"/>
 *         &lt;element name="Dividends" type="{http://www.bvb.ro}ArrayOfDividendInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DividendsInfo", propOrder = {
    "company",
    "dividends"
})
public class DividendsInfo {

    @XmlElement(name = "Company")
    protected CompanyIdentification company;
    @XmlElement(name = "Dividends")
    protected ArrayOfDividendInfo dividends;

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
     * Gets the value of the dividends property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDividendInfo }
     *     
     */
    public ArrayOfDividendInfo getDividends() {
        return dividends;
    }

    /**
     * Sets the value of the dividends property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDividendInfo }
     *     
     */
    public void setDividends(ArrayOfDividendInfo value) {
        this.dividends = value;
    }

}
